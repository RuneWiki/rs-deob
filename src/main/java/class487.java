import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class487 {

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field6980;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field6979;

    @OriginalMember(owner = "client!lda", name = "listmodes", descriptor = "()[I", line = 9)
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field6980.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!lda", name = "exit", descriptor = "()V", line = 34)
    public final void exit() {
        if (this.field6979 != null) {
            this.field6980.setDisplayMode(this.field6979);
            if (!this.field6980.getDisplayMode().equals(this.field6979)) {
                throw new RuntimeException("Did not return to correct resolution!");
            }
            this.field6979 = null;
        }
        this.method2923(null, 14828);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/awt/Frame;I)V", line = 53)
    private final void method2923(Frame arg0, int arg1) {
        if (arg1 != 14828) {
            this.field6979 = null;
        }
        boolean var3 = false;
        try {
            Field var4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field6980);
            if (var5) {
                var3 = true;
                var4.set(this.field6980, Boolean.FALSE);
            }
        } catch (Throwable var17) {
        }
        try {
            this.field6980.setFullScreenWindow(arg0);
        } finally {
            if (var3) {
                try {
                    Field var10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    var10.set(this.field6980, Boolean.TRUE);
                } catch (Throwable var16) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V", line = 97)
    public class487() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field6980 = var1.getDefaultScreenDevice();
        if (!this.field6980.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field6980 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!lda", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V", line = 134)
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6979 = this.field6980.getDisplayMode();
        if (this.field6979 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method2923(arg0, 14828);
        if (arg4 == 0) {
            int var6 = this.field6979.getRefreshRate();
            DisplayMode[] var7 = this.field6980.getDisplayModes();
            boolean var8 = false;
            for (int var9 = 0; var9 < var7.length; var9++) {
                if (var7[var9].getWidth() == arg1 && arg2 == var7[var9].getHeight() && var7[var9].getBitDepth() == arg3) {
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
        this.field6980.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }
}
