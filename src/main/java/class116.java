import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class116 {

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field1538;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field1539;

    @OriginalMember(owner = "client!nu", name = "listmodes", descriptor = "()[I")
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field1538.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILjava/awt/Frame;)V")
    private final void method737(int arg0, Frame arg1) {
        boolean var3 = false;
        try {
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field1538);
            if (var5) {
                var3 = true;
                var4.set(this.field1538, Boolean.FALSE);
            }
        } catch (Throwable var17) {
        }
        try {
            this.field1538.setFullScreenWindow(arg1);
            if (arg0 >= -34) {
                this.enter(null, 35, -39, -110, 26);
            }
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field1538, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!nu", name = "exit", descriptor = "()V")
    public final void exit() {
        if (this.field1539 != null) {
            this.field1538.setDisplayMode(this.field1539);
            if (!this.field1538.getDisplayMode().equals(this.field1539)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field1539 = null;
        }
        this.method737(-87, null);
    }

    @OriginalMember(owner = "client!nu", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V")
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1539 = this.field1538.getDisplayMode();
        if (this.field1539 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method737(-80, arg0);
        if (arg4 == 0) {
            int var6 = this.field1539.getRefreshRate();
            DisplayMode[] var7 = this.field1538.getDisplayModes();
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
        this.field1538.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
    public class116() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field1538 = var1.getDefaultScreenDevice();
        if (!this.field1538.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field1538 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }
}
