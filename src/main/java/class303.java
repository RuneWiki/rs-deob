import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class303 extends class685 {

    @OriginalMember(owner = "client!mja", name = "f", descriptor = "[I")
    public int[] field4226;

    @OriginalMember(owner = "client!mja", name = "e", descriptor = "[I")
    public int[] field4223;

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4227 = new String[] { method2440(method2439("p\teg\u00125")), method2440(method2439("p\teg\u00155")), method2440(method2439("s\u0016h%")), method2440(method2439("fM*g*")), method2440(method2439("p\tegkt\rm=i5")), method2440(method2439("p\teg\u00145")), method2440(method2439("p\teg\u00165")) };

    @OriginalMember(owner = "client!mja", name = "g", descriptor = "Lmv;")
    public static class125 field4224 = new class125(81, -1);

    @OriginalMember(owner = "client!mja", name = "d", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!mja", name = "c", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!mja", name = "b", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIB)V", line = 7)
    public static final void method2435(int arg0, int arg1, byte arg2) {
        try {
            field4222++;
            class294 var3 = class146.method1261((long) arg0, -89, 17);
            var3.method2378(-126);
            if (arg2 > 32) {
                var3.field4133 = arg1;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4227[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lfl;B[[B)V", line = 22)
    public static final void method2436(class794 arg0, byte arg1, byte[][] arg2) {
        try {
            if (arg1 != 62) {
                method2436(null, (byte) 85, null);
            }
            field4221++;
            for (int var3 = 0; var3 < arg0.field440; var3++) {
                class635.method4633(116);
                for (int var4 = 0; var4 < class625.field8929 >> 3; var4++) {
                    for (int var5 = 0; var5 < class14.field187 >> 3; var5++) {
                        int var6 = class634.field8995[var3][var4][var5];
                        if (var6 != -1) {
                            int var7 = (var6 & 0x3C286F9) >> 24;
                            if (!arg0.field458 || var7 == 0) {
                                int var8 = var6 >> 1 & 0x3;
                                int var9 = var6 >> 14 & 0x3FF;
                                int var10 = (var6 & 0x3FF8) >> 3;
                                int var11 = (var9 / 8 << 8) + var10 / 8;
                                for (int var12 = 0; var12 < class136.field1754.length; var12++) {
                                    if (class136.field1754[var12] == var11 && arg2[var12] != null) {
                                        arg0.method5729(class195.field2919, (var9 & 0x7) * 8, class236.field3418, var8, var5 * 8, var4 * 8, (var10 & 0x7) * 8, arg1 ^ 0xFFFFFF86, var3, arg2[var12], var7);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field4227[1] + (arg0 == null ? field4227[2] : field4227[3]) + ',' + arg1 + ',' + (arg2 == null ? field4227[2] : field4227[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)V", line = 95)
    public static void method2437(byte arg0) {
        try {
            if (arg0 != -128) {
                method2437((byte) 13);
            }
            field4224 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4227[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lld;I)V", line = 108)
    public static final void method2438(class87 arg0, int arg1) {
        try {
            if (arg1 != 8) {
                method2437((byte) 105);
            }
            field4225++;
            arg0.field1228 = null;
            if (class7.field96 < 20) {
                class304.field4230.method3618(arg0, 124);
                class7.field96++;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4227[6] + (arg0 == null ? field4227[2] : field4227[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(II[I[I)V", line = 126)
    public class303(int arg0, int arg1, int[] arg2, int[] arg3) {
        try {
            this.field4226 = arg2;
            this.field4223 = arg3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4227[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4227[2] : field4227[3]) + ',' + (arg3 == null ? field4227[2] : field4227[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2439(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2440(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
