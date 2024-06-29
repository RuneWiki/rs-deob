import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class316 {

    @OriginalMember(owner = "client!so", name = "h", descriptor = "S")
    public short field4324;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Laj;")
    public class94 field4326;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "B")
    public byte field4328;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "B")
    public byte field4331;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4333 = new String[] { method2518(method2517("\tO\u0011O ")), method2518(method2517("\u0001\u000e\u0011%u")), method2518(method2517("\u0014USg")), method2518(method2517("\tO\u00117a\u0014IK5 ")), method2518(method2517("\tO\u0011N ")), method2518(method2517("\tO\u0011J ")), method2518(method2517("\tO\u0011I ")) };

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Lfs;")
    public static class796 field4323 = new class796(method2518(method2517("\tTZgd\u001bR[j\u007f\u0014")), method2518(method2517(")TZgd\u001bR\u001fOi\rN")), 1);

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Lmv;")
    public static class125 field4327 = new class125(39, 3);

    @OriginalMember(owner = "client!so", name = "g", descriptor = "[I")
    public static int[] field4332 = new int[32];

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field4330;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4332[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V", line = 3)
    public static void method2512(int arg0) {
        try {
            field4327 = null;
            field4332 = null;
            if (arg0 != 0) {
                method2514(null, (byte) 11, -115, null, -26);
            }
            field4323 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4333[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)I", line = 18)
    public static final int method2513(int arg0, int arg1) {
        try {
            if (arg0 != 3) {
                method2515((byte) -1);
            }
            field4325++;
            return arg1 & 0xFF;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4333[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([IBI[II)V", line = 30)
    public static final void method2514(int[] arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        try {
            if (arg2 > arg4) {
                int var5 = (arg2 + arg4) / 2;
                int var6 = arg4;
                int var7 = arg0[var5];
                arg0[var5] = arg0[arg2];
                arg0[arg2] = var7;
                int var8 = arg3[var5];
                arg3[var5] = arg3[arg2];
                arg3[arg2] = var8;
                int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
                for (int var10 = arg4; var10 < arg2; var10++) {
                    if (arg0[var10] < ((var10 & var9) + var7)) {
                        int var11 = arg0[var10];
                        arg0[var10] = arg0[var6];
                        arg0[var6] = var11;
                        int var12 = arg3[var10];
                        arg3[var10] = arg3[var6];
                        arg3[var6++] = var12;
                    }
                }
                arg0[arg2] = arg0[var6];
                arg0[var6] = var7;
                arg3[arg2] = arg3[var6];
                arg3[var6] = var8;
                method2514(arg0, (byte) -89, var6 - 1, arg3, arg4);
                method2514(arg0, (byte) -99, arg2, arg3, var6 + 1);
            }
            field4322++;
            if (arg1 >= -86) {
                field4327 = null;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field4333[4] + (arg0 == null ? field4333[2] : field4333[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4333[2] : field4333[1]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V", line = 87)
    public static final void method2515(byte arg0) {
        try {
            class337.field4888 = "";
            class304.field4234 = "";
            if (arg0 != -57) {
                method2514(null, (byte) -39, 69, null, -107);
            }
            field4329++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4333[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)I", line = 103)
    public static final int method2516(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class433.field6280 - 1; var2++) {
            if (arg0 < class538.field7912[var2] + class144.field1862[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class433.field6280 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Laj;III)V", line = 131)
    public class316(class94 arg0, int arg1, int arg2, int arg3) {
        try {
            this.field4324 = (short) arg1;
            this.field4326 = arg0;
            this.field4328 = (byte) arg2;
            this.field4331 = (byte) arg3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4333[3] + (arg0 == null ? field4333[2] : field4333[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!so", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2517(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!so", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2518(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
