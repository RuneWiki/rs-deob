import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class77 {

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field841;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field840;

    @OriginalMember(owner = "client!in", name = "exit", descriptor = "()V", line = 11)
    public final void exit() {
        if (this.field840 != null) {
            this.field841.setDisplayMode(this.field840);
            if (!this.field841.getDisplayMode().equals(this.field840)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field840 = null;
        }
        this.method499(-126, null);
    }

    @OriginalMember(owner = "client!in", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V", line = 33)
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field840 = this.field841.getDisplayMode();
        if (this.field840 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method499(-128, arg0);
        if (arg4 == 0) {
            int var6 = this.field840.getRefreshRate();
            DisplayMode[] var7 = this.field841.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].getWidth() == arg1 && arg2 == var7[var9].getHeight() && arg3 == var7[var9].getBitDepth()) {
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
        this.field841.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/awt/Frame;)V", line = 95)
    private final void method499(int arg0, Frame arg1) {
        boolean var3 = false;
        try {
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            if (arg0 > -121) {
                return;
            }
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field841);
            if (var5) {
                var3 = true;
                var4.set(this.field841, Boolean.FALSE);
            }
        } catch (Throwable var17) {
        }
        try {
            this.field841.setFullScreenWindow(arg1);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field841, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 137)
    public class77() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field841 = var1.getDefaultScreenDevice();
        if (!this.field841.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field841 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!in", name = "listmodes", descriptor = "()[I", line = 176)
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field841.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }
}
