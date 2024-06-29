import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public abstract class class122 extends class202 {

    @OriginalMember(owner = "client!vea", name = "E", descriptor = "S")
    public short field1543;

    @OriginalMember(owner = "client!vea", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field1546 = new String[] { method1103(method1102("}H\u0010v\u0007J\u0005")), method1103(method1102("}H\u0010vrbC\u0018,p#")), method1103(method1102("p\u0003_v3")), method1103(method1102("}H\u0010v\u0006J\u0005")), method1103(method1102("eX\u001d4")), method1103(method1102("}H\u0010v\u001c#")), method1103(method1102("}H\u0010v\u001b#")), method1103(method1102("}H\u0010v\tJ\u0005")), method1103(method1102("}H\u0010v\u001d#")) };

    @OriginalMember(owner = "client!vea", name = "G", descriptor = "[C")
    private static char[] field1539 = new char[64];

    @OriginalMember(owner = "client!vea", name = "H", descriptor = "[[I")
    public static int[][] field1545;

    @OriginalMember(owner = "client!vea", name = "D", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!vea", name = "C", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!vea", name = "F", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!vea", name = "B", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!vea", name = "I", descriptor = "I")
    public static int field1544;

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field1539[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field1539[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; ++var2) {
            field1539[var2] = (char) (var2 + 48 - 52);
        }
        field1539[62] = '+';
        field1539[63] = '/';
        field1545 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BZI)V", line = 6)
    public static final void method1099(byte arg0, boolean arg1, int arg2) {
        try {
            ++field1541;
            class26 var3 = arg1 ? class30.field382 : class713.field10112;
            if (var3 != null && ~arg2 <= -1 && var3.field324 > arg2) {
                class756 var4 = var3.field319[arg2];
                if (var4.field10814 == -1) {
                    String var5 = var4.field10808;
                    class779 var6 = class85.method851(false);
                    class274 var7 = class375.method2969((byte) 1, class283.field3978, var6.field11100);
                    var7.field3885.method5114(255, 3 + class101.method986(var5, 6743));
                    var7.field3885.method5114(255, arg1 ? 1 : 0);
                    var7.field3885.method5138((byte) -109, arg2);
                    int var8 = -124 % ((-21 - arg0) / 46);
                    var7.field3885.method5089(var5, (byte) 28);
                    var6.method5608(var7, 29867);
                }
            }
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field1546[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)Z", line = 37)
    public final boolean method43(byte arg0) {
        try {
            ++field1542;
            int var2 = 48 / ((arg0 - -37) / 55);
            return class30.field385[(super.field2969 >> class179.field2328) - -class501.field7316 + -class269.field3812][(super.field2984 >> class179.field2328) + -class98.field1331 + class501.field7316];
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1546[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(Lha;B)Z", line = 47)
    public final boolean method45(class18 arg0, byte arg1) {
        try {
            ++field1538;
            if (arg1 > -76) {
                method1099((byte) -28, false, 102);
            }
            return class499.method3829(-1, super.field2971, super.field2984 >> class179.field2328, super.field2969 >> class179.field2328);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1546[3] + (arg0 != null ? field1546[2] : field1546[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "(B)V", line = 61)
    public static void method1100(byte arg0) {
        try {
            int var1 = 56 % ((-28 - arg0) / 35);
            field1539 = null;
            field1545 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1546[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "(I)V", line = 100)
    public static final void method1101(int arg0) {
        try {
            class699.method5035(arg0, 31754);
            ++field1544;
            class601.method4441((byte) 72);
            System.gc();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1546[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B[Lta;)I", line = 114)
    public final int method41(byte arg0, class330[] arg1) {
        try {
            ++field1540;
            int var3 = 126 % ((45 - arg0) / 33);
            return this.method1732(super.field2969 >> class179.field2328, super.field2984 >> class179.field2328, arg1, 16);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1546[7] + arg0 + ',' + (arg1 != null ? field1546[2] : field1546[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(IIIIII)V", line = 123)
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            super.field2969 = arg0;
            super.field2971 = (byte) arg4;
            super.field2981 = (byte) arg3;
            super.field2975 = arg1;
            this.field1543 = (short) arg5;
            super.field2984 = arg2;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1546[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1102(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1103(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
