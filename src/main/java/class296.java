import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class296 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field4508;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field4509;

    @OriginalMember(owner = "client!fd", name = "exit", descriptor = "()V")
    public final void exit() {
        if (this.field4509 != null) {
            this.field4508.setDisplayMode(this.field4509);
            if (!this.field4508.getDisplayMode().equals(this.field4509)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field4509 = null;
        }
        this.method1909((byte) 23, null);
    }

    @OriginalMember(owner = "client!fd", name = "listmodes", descriptor = "()[I")
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field4508.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!fd", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4509 = this.field4508.getDisplayMode();
        if (this.field4509 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method1909((byte) 23, arg0);
        if (arg4 == 0) {
            int var6 = this.field4509.getRefreshRate();
            DisplayMode[] var7 = this.field4508.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (arg1 == var7[var9].getWidth() && arg2 == var7[var9].getHeight() && arg3 == var7[var9].getBitDepth()) {
                    int var10 = var7[var9].getRefreshRate();
                    if (!var8 || Math.abs(var10 - var6) < Math.abs(arg4 - var6)) {
                        arg4 = var10;
                        var8 = true;
                    }
                }
            }
            if (!var8) {
                arg4 = var6;
            }
        }
        this.field4508.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLjava/awt/Frame;)V")
    private final void method1909(byte arg0, Frame arg1) {
        boolean var3 = false;
        try {
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field4508);
            if (arg0 != 23) {
                this.enter(null, -93, -27, -37, -3);
            }
            if (var5) {
                var3 = true;
                var4.set(this.field4508, Boolean.FALSE);
            }
        } catch (Throwable var17) {
        }
        try {
            this.field4508.setFullScreenWindow(arg1);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field4508, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class296() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field4508 = var1.getDefaultScreenDevice();
        if (!this.field4508.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field4508 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }
}
