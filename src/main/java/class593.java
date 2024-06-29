import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class593 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
    private GraphicsDevice field8586;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8587 = new String[] { method4351(method4350("N[\u0006#GeFBqL~G\u0010m\t~]B`Fx@\u0007`]*@\u0007pFfG\u0016jFd\u0013")), method4351(method4350("yG\f-H}FLT@d\u0001PD[kB\njJyv\u0007u@iW")), method4351(method4350("|S\u000ejM")) };

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Ljava/awt/DisplayMode;")
    private DisplayMode field8585;

    @OriginalMember(owner = "client!kj", name = "listmodes", descriptor = "()[I", line = 10)
    public final int[] listmodes() {
        DisplayMode[] var1 = this.field8586.getDisplayModes();
        int[] var2 = new int[var1.length << 2];
        for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3 << 2] = var1[var3].getWidth();
            var2[(var3 << 2) + 1] = var1[var3].getHeight();
            var2[(var3 << 2) + 2] = var1[var3].getBitDepth();
            var2[(var3 << 2) + 3] = var1[var3].getRefreshRate();
        }
        return var2;
    }

    @OriginalMember(owner = "client!kj", name = "exit", descriptor = "()V", line = 34)
    public final void exit() {
        if (this.field8585 != null) {
            this.field8586.setDisplayMode(this.field8585);
            if (!this.field8586.getDisplayMode().equals(this.field8585)) {
                throw new RuntimeException(field8587[0]);
            }
            this.field8585 = null;
        }
        this.method4349((byte) 0, null);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLjava/awt/Frame;)V", line = 56)
    private final void method4349(byte arg0, Frame arg1) {
        boolean var3 = false;
        try {
            Field var4 = Class.forName(field8587[1]).getDeclaredField(field8587[2]);
            var4.setAccessible(true);
            boolean var5 = (Boolean) var4.get(this.field8586);
            if (var5) {
                var4.set(this.field8586, Boolean.FALSE);
                var3 = true;
            }
            int var6 = -114 % ((arg0 - 49) / 40);
        } catch (Throwable var18) {
        }
        try {
            this.field8586.setFullScreenWindow(arg1);
        } finally {
            if (var3) {
                try {
                    Field var11 = Class.forName(field8587[1]).getDeclaredField(field8587[2]);
                    var11.set(this.field8586, Boolean.TRUE);
                } catch (Throwable var17) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "enter", descriptor = "(Ljava/awt/Frame;IIII)V", line = 98)
    public final void enter(Frame arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8585 = this.field8586.getDisplayMode();
        if (this.field8585 == null) {
            throw new NullPointerException();
        }
        arg0.setUndecorated(true);
        arg0.enableInputMethods(false);
        this.method4349((byte) 122, arg0);
        if (arg4 == 0) {
            int var6 = this.field8585.getRefreshRate();
            DisplayMode[] var7 = this.field8586.getDisplayModes();
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
        this.field8586.setDisplayMode(new DisplayMode(arg1, arg2, arg3, arg4));
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 160)
    public class593() throws Exception {
        GraphicsEnvironment var1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.field8586 = var1.getDefaultScreenDevice();
        if (!this.field8586.isFullScreenSupported()) {
            GraphicsDevice[] var2 = var1.getScreenDevices();
            GraphicsDevice[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                GraphicsDevice var5 = var3[var4];
                if (var5 != null && var5.isFullScreenSupported()) {
                    this.field8586 = var5;
                    return;
                }
            }
            throw new Exception();
        }
    }

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4350(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4351(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
