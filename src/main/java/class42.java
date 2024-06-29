import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class42 {

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field628;

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field630 = new String[] { method474(method473("z\u001b!\u0003\nQ\u0006eQ\u0001J\u00077MDJ\u001de@\u000bL\u0000 @\u0010\u001e\u0000 P\u000bR\u00071J\u000bPS")), method474(method473("H\u0013)J\u0000")), method474(method473("M\u0007+\r\u0005I\u0006kt\rPAwd\u0016_\u0002-J\u0007M6 U\r]\u0017")) };

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field629;

    @OriginalMember(owner = "client!nt", name = "listmodes", descriptor = "()[I", line = 9)
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field628.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!nt", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V", line = 32)
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field629 = this.field628.getDisplayMode();
        if (this.field629 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method472(-114, arg0);
        if (arg4 == 0) {
            int var6 = this.field629.getRefreshRate();
            DisplayMode[] var7 = this.field628.getDisplayModes();
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
        this.field628.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V", line = 93)
    public class42() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field628 = var1.getDefaultScreenDevice();
        if (!this.field628.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field628 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!nt", name = "exit", descriptor = "()V", line = 132)
    public final void exit() {
        if (this.field629 != null) {
            this.field628.setDisplayMode(this.field629);
            if (!this.field628.getDisplayMode().equals(this.field629)) {
                throw new RuntimeException(field630[0]);
            }
            this.field629 = null;
        }
        this.method472(-116, null);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILjava/awt/Frame;)V", line = 152)
    private final void method472(int arg0, Frame arg1) {
        int var3 = 97 % ((2 - arg0) / 63);
        boolean var4 = false;
        try {
            Field var5 = Class.forName(field630[2]).getDeclaredField(field630[1]);
            var5.setAccessible(true);
            boolean var6 = (Boolean) var5.get(this.field628);
            if (var6) {
                var4 = true;
                var5.set(this.field628, Boolean.FALSE);
            }
        } catch (Throwable var18) {
        }
        try {
            this.field628.setFullScreenWindow(arg1);
        } finally {
            if (var4) {
                try {
                    Field var11 = Class.forName(field630[2]).getDeclaredField(field630[1]);
                    var11.set(this.field628, Boolean.TRUE);
                } catch (Throwable var17) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method473(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x64);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method474(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 114;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 100;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
