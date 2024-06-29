import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class113 {

    @OriginalMember(owner = "client!au", name = "l", descriptor = "Lnu;")
    public class349 field1454 = null;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "Lnu;")
    public class349 field1457 = null;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "[Lbp;")
    public class117[] field1458 = null;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "[Lbp;")
    public class117[] field1465 = null;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "Lnu;")
    public class349 field1464 = null;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "Z")
    public boolean field1463;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1467 = new String[] { method1052(method1051("\u001f\u00065D&")), method1052(method1051("\u0005]5+s")), method1052(method1051("\u0010\u0006wi")), method1052(method1051("\u001f\u000659g\u0010\u001ao;&")) };

    @OriginalMember(owner = "client!au", name = "f", descriptor = "Z")
    public static boolean field1456 = false;

    @OriginalMember(owner = "client!au", name = "h", descriptor = "Lmv;")
    public static class125 field1455 = new class125(1, 3);

    @OriginalMember(owner = "client!au", name = "a", descriptor = "Z")
    public static boolean field1459 = false;

    @OriginalMember(owner = "client!au", name = "i", descriptor = "I")
    public static int field1461 = 0;

    @OriginalMember(owner = "client!au", name = "d", descriptor = "Z")
    public static boolean field1460 = false;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!au", name = "e", descriptor = "[I")
    public static int[] field1466 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
    public static void method1050(boolean arg0) {
        try {
            field1466 = null;
            field1455 = null;
            if (!arg0) {
                field1462 = -25;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1467[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lml;)V")
    public class113(class194 arg0) {
        try {
            this.field1463 = arg0.field2901;
            class326.method2575(true, arg0);
            if (this.field1463) {
                byte[] var2 = class706.method5064(false, -71, class490.field7181);
                this.field1454 = new class349(arg0, 6410, 128, 128, 16, var2, 6410);
                byte[] var3 = class706.method5064(false, -52, class276.field3900);
                this.field1457 = new class349(arg0, 6410, 128, 128, 16, var3, 6410);
                class209 var4 = arg0.field2759;
                if (var4.method1772((byte) 80)) {
                    byte[] var5 = class706.method5064(false, 126, class261.field3700);
                    this.field1464 = new class349(arg0, 6408, 128, 128, 16);
                    class349 var6 = new class349(arg0, 6409, 128, 128, 16, var5, 6409);
                    if (var4.method1771(0, this.field1464, var6, 2.0F)) {
                        this.field1464.method3601(-1);
                    } else {
                        this.field1464.method3598(0);
                        this.field1464 = null;
                    }
                    var6.method3598(0);
                    return;
                }
            } else {
                this.field1458 = new class117[16];
                for (int var7 = 0; var7 < 16; var7++) {
                    byte[] var8 = class611.method4514(-85, 32768, var7 * 128 * 256, class490.field7181);
                    this.field1458[var7] = new class117(arg0, 3553, 6410, 128, 128, true, var8, 6410, false);
                }
                this.field1465 = new class117[16];
                for (int var9 = 0; var9 < 16; var9++) {
                    byte[] var10 = class611.method4514(-101, 32768, var9 * 256 * 128, class276.field3900);
                    this.field1465[var9] = new class117(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1467[3] + (arg0 == null ? field1467[2] : field1467[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!au", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1051(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!au", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1052(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
