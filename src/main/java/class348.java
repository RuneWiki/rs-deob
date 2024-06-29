import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class348 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field4558;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field4559;

    @OriginalMember(owner = "client!oj", name = "exit", descriptor = "()V", line = 9)
    public final void exit() {
        if (this.field4559 != null) {
            this.field4558.setDisplayMode(this.field4559);
            if (!this.field4558.getDisplayMode().equals(this.field4559)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field4559 = null;
        }
        this.method1984(3, null);
    }

    @OriginalMember(owner = "client!oj", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V", line = 29)
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4559 = this.field4558.getDisplayMode();
        if (this.field4559 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method1984(3, arg0);
        if (arg4 == 0) {
            int var6 = this.field4559.getRefreshRate();
            DisplayMode[] var7 = this.field4558.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].getWidth() == arg1 && arg2 == var7[var9].getHeight() && arg3 == var7[var9].getBitDepth()) {
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
        this.field4558.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/awt/Frame;)V", line = 93)
    private final void method1984(int arg0, Frame arg1) {
        boolean var3 = false;
        try {
            if (arg0 != 3) {
                return;
            }
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field4558);
            if (var5) {
                var4.set(this.field4558, Boolean.FALSE);
                var3 = true;
            }
        } catch (Throwable var17) {
        }
        try {
            this.field4558.setFullScreenWindow(arg1);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field4558, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V", line = 135)
    public class348() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field4558 = var1.getDefaultScreenDevice();
        if (!this.field4558.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field4558 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!oj", name = "listmodes", descriptor = "()[I", line = 173)
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field4558.getDisplayModes();
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
