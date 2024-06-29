import java.net.URL;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class430 extends class568 {

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Lat;")
    public class398 field6761 = new class398();

    @OriginalMember(owner = "client!we", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6770 = new String[] { method3408(method3407("\u0002u\u001eu\u0002")), method3408(method3407("\u001be\\\\")), method3408(method3407("\u0002u\u001ev\u0002")), method3408(method3407("Z`\r")), method3408(method3407("\u000e>\u001e\u001eW")), method3408(method3407("Yq\u0002")), method3408(method3407("Z|\r")), method3408(method3407("Y\u007f")), method3408(method3407("Zz")), method3408(method3407("Zq\r")), method3408(method3407("*cU\\L")), method3408(method3407("\u001ddD@\u0010Z?")), method3408(method3407("\u0002u\u001eq\u0002")), method3408(method3407("\u0002u\u001es\u0002")), method3408(method3407("\u0002u\u001er\u0002")) };

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lhl;")
    public static class556 field6764 = new class556(102, 10);

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Lvn;")
    public static class330 field6767 = new class330(66, 8);

    @OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
    public static int[] field6769 = new int[8];

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lvn;")
    public static class330 field6768 = new class330(13, 8);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lmk;")
    public static class59 field6765;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "[I")
    public static int[] field6766;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3401(boolean arg0) {
        try {
            field6769 = null;
            field6766 = null;
            field6765 = null;
            if (arg0) {
                field6768 = null;
                field6767 = null;
                field6764 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6770[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V", line = 22)
    public static final void method3402(int arg0, byte arg1) {
        try {
            if (arg1 == 12) {
                field6762++;
                class404.field6405 = 1000000000L / (long) arg0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6770[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(JZIB)Ljava/lang/String;", line = 33)
    public static final String method3403(long arg0, boolean arg1, int arg2, byte arg3) {
        try {
            if (arg3 != 38) {
                method3405(-83);
            }
            field6759++;
            Calendar var5;
            if (arg1) {
                class147.method1341(arg3 + 26263, arg0);
                var5 = class679.field9666;
            } else {
                class310.method2659(arg0, (byte) 100);
                var5 = class679.field9664;
            }
            int var6 = var5.get(5);
            int var7 = var5.get(2) + 1;
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field6770[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Z", line = 70)
    public static final boolean method3404(byte arg0, int arg1) {
        try {
            int var2 = -64 % ((82 - arg0) / 36);
            field6763++;
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6770[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 82)
    public static final void method3405(int arg0) {
        class98.field1441 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;II)Z", line = 89)
    public static final boolean method3406(String arg0, int arg1, int arg2) {
        try {
            field6760++;
            if (class393.field6256.field806) {
                class640.field9183 = new class518();
                class640.field9183.field7676 = arg2;
                class640.field9183.field7671 = arg0;
                if (class710.field10281 != class417.field6596) {
                    class640.field9183.field7675 = class640.field9183.field7676 + 40000;
                    class640.field9183.field7674 = class640.field9183.field7676 + 50000;
                }
                for (int var3 = 0; var3 < class696.field10027.length; var3++) {
                    if (arg2 == class696.field10027[var3].field1949) {
                        class787.field11503 = class696.field10027[var3].field5435;
                    }
                }
                return true;
            }
            String var4 = "";
            if (class710.field10281 != class417.field6596) {
                var4 = ":" + (arg2 + 7000);
            }
            String var5 = "";
            if (class431.field6777 != null) {
                var5 = field6770[3] + class431.field6777;
            }
            String var6 = field6770[11] + arg0 + var4 + field6770[6] + class795.field11624 + field6770[9] + class734.field10757 + var5 + field6770[8] + (class40.field466 ? "1" : "0") + field6770[7] + (class755.field11100 ? "1" : "0") + field6770[5];
            try {
                class392.field6245.getAppletContext().showDocument(new URL(var6), field6770[10]);
            } catch (Exception var8) {
                return false;
            }
            return arg1 == 13;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field6770[2] + (arg0 == null ? field6770[1] : field6770[4]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!we", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3407(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!we", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3408(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
