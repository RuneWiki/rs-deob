import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class527 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field7245;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field7244;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/awt/Frame;I)V", line = 8)
    private final void method3132(Frame arg0, int arg1) {
        if (arg1 != -1403970174) {
            this.field7244 = null;
        }
        boolean var3 = false;
        try {
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field7245);
            if (var5) {
                var4.set(this.field7245, Boolean.FALSE);
                var3 = true;
            }
        } catch (Throwable var17) {
        }
        try {
            this.field7245.setFullScreenWindow(arg0);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field7245, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "listmodes", descriptor = "()[I", line = 52)
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field7245.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!iu", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V", line = 76)
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7244 = this.field7245.getDisplayMode();
        if (this.field7244 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method3132(arg0, -1403970174);
        if (arg4 == 0) {
            int var6 = this.field7244.getRefreshRate();
            DisplayMode[] var7 = this.field7245.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].getWidth() == arg1 && var7[var9].getHeight() == arg2 && arg3 == var7[var9].getBitDepth()) {
                    int var10 = var7[var9].getRefreshRate();
                    if (!var8 || Math.abs(var10 - var6) < Math.abs(arg4 - var6)) {
                        var8 = true;
                        arg4 = var10;
                    }
                }
            }
            if (!var8) {
                arg4 = var6;
            }
        }
        this.field7245.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!iu", name = "exit", descriptor = "()V", line = 138)
    public final void exit() {
        if (this.field7244 != null) {
            this.field7245.setDisplayMode(this.field7244);
            if (!this.field7245.getDisplayMode().equals(this.field7244)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field7244 = null;
        }
        this.method3132(null, -1403970174);
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V", line = 158)
    public class527() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field7245 = var1.getDefaultScreenDevice();
        if (!this.field7245.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field7245 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }
}
