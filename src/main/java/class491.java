import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class491 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public int field7039 = 0;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public int field7040 = 2048;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public int field7042 = 2048;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public int field7043 = 0;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7046 = new String[] { method3715(method3714("\"9=\u001b")), method3715(method3714(";%\u007f6\u0006")), method3715(method3714("7b\u007fYS")), method3715(method3714(";%\u007f4\u0006")), method3715(method3714(";%\u007f5\u0006")) };

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field7037 = -1;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field7041 = 0;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lib;II)V")
    private final void method3711(class163 arg0, int arg1, int arg2) {
        try {
            if (arg2 != 3) {
                method3713(58);
            }
            field7038++;
            if (arg1 == 1) {
                this.field7043 = arg0.method1455((byte) 62);
            } else if (arg1 == 2) {
                this.field7042 = arg0.method1445((byte) 112);
            } else if (arg1 == 3) {
                this.field7040 = arg0.method1445((byte) 111);
            } else if (arg1 == 4) {
                this.field7039 = arg0.method1442(65280);
                return;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7046[1] + (arg0 == null ? field7046[0] : field7046[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lib;I)V")
    public final void method3712(class163 arg0, int arg1) {
        try {
            if (arg1 < 74) {
                field7037 = 59;
            }
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    field7045++;
                    return;
                }
                this.method3711(arg0, var3, 3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7046[4] + (arg0 == null ? field7046[0] : field7046[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Z")
    public static final boolean method3713(int arg0) {
        try {
            if (arg0 == -18653) {
                field7044++;
                return class251.field3897 != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7046[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3714(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3715(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
