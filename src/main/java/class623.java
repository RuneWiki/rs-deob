import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class623 implements class175 {

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Ldu;")
    private class375 field8987;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lfb;")
    private class705 field8994;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8997 = new String[] { method4552(method4551(":!MI\t")), method4552(method4551(":!MN\t")), method4552(method4551(":!MH\t")), method4552(method4551(":!MK\t")), method4552(method4551(":!ML\t")), method4552(method4551("5gM$\\")), method4552(method4551(":!M6H  \u00174\t")), method4552(method4551(" <\u000ff")), method4552(method4551(":!MO\t")) };

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field8988 = -1;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lwh;")
    public static class155 field8992 = new class155(7, 2);

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field8990;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field8993;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Les;")
    public static class404 field8996;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZZ)V", line = 5)
    public final void method1618(boolean arg0, boolean arg1) {
        try {
            field8993++;
            if (!arg0) {
                field8996 = null;
            }
            class333 var3 = this.field8994.method5128((byte) -99, this.field8987.field6086);
            if (var3 != null) {
                int var4 = this.field8987.field6090.method4806(class696.field10028, this.field8987.field6091, -101) + this.field8987.field6085;
                int var5 = this.field8987.field6088.method4833(this.field8987.field6081, class518.field7672, (byte) 84) + this.field8987.field6075;
                if (this.field8987.field6082) {
                    class662.field9437.method208(var4, var5, this.field8987.field6091, this.field8987.field6081, this.field8987.field6077, 0);
                }
                int var6 = var5 + this.method4548(5, var3.field5447, var4, var5, -17940, class461.field7108) * 12;
                int var11 = var6 + 8;
                if (this.field8987.field6082) {
                    class662.field9437.method267(var4, var11, var4 - (1 - this.field8987.field6091), var11, this.field8987.field6077, 0);
                }
                var6 = var11 + 1;
                int var7 = var6 + this.method4548(5, var3.field5445, var4, var6, -17940, class461.field7108) * 12;
                int var12 = var7 + 5;
                int var10000 = var12 + this.method4548(5, var3.field5439, var4, var12, -17940, class461.field7108) * 12;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field8997[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z", line = 44)
    public final boolean method457(byte arg0) {
        try {
            if (arg0 <= 9) {
                this.method459((byte) -30);
            }
            field8995++;
            return this.field8994.method5127(30191);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8997[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 60)
    public final void method459(byte arg0) {
        try {
            field8989++;
            if (arg0 != -13) {
                this.method4548(77, null, -43, -4, 108, null);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8997[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;IIILda;)I", line = 70)
    private final int method4548(int arg0, String arg1, int arg2, int arg3, int arg4, class64 arg5) {
        try {
            if (arg4 != -17940) {
                this.method459((byte) -43);
            }
            field8991++;
            return arg5.method681((byte) -110, null, 0, 0, arg1, this.field8987.field6081 - (arg0 * 2), -(arg0 * 2) + this.field8987.field6091, this.field8987.field6087, arg0 + arg2, null, 0, this.field8987.field6084, 0, null, 0, arg0 + arg3);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field8997[8] + arg0 + ',' + (arg1 == null ? field8997[7] : field8997[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field8997[7] : field8997[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lfb;Ldu;)V", line = 88)
    public class623(class705 arg0, class375 arg1) {
        try {
            this.field8987 = arg1;
            this.field8994 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8997[6] + (arg0 == null ? field8997[7] : field8997[5]) + ',' + (arg1 == null ? field8997[7] : field8997[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 97)
    public static void method4549(int arg0) {
        try {
            field8996 = null;
            if (arg0 > 58) {
                field8992 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8997[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIZ)Lgda;", line = 108)
    public static final class58 method4550(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            if (arg1 != 1000000) {
                return null;
            }
            field8990++;
            class186 var4 = null;
            if (class73.field1020 != null) {
                var4 = new class186(arg2, class73.field1020, class230.field3571[arg2], 1000000);
            }
            class233.field3615[arg2] = class223.field3498.method3422(arg2, var4, class763.field11198, (byte) -20);
            class233.field3615[arg2].method2668(-1);
            return new class58(class233.field3615[arg2], arg3, arg0);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8997[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!th", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4551(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!th", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4552(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 78;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
