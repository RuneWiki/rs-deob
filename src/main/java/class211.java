import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class211 {

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3352 = new String[] { method1912(method1911("\u0005\u0016\u0019\u001e")), method1912(method1911("\r\u0012[6b")), method1912(method1911("\u0010M[\\7")), method1912(method1911("\r\u0012[0b")), method1912(method1911("\r\u0012[3b")), method1912(method1911("\r\u0012[1b")) };

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "Z")
    public static boolean field3348 = false;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "Leu;")
    public static class507 field3351 = new class507();

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "J")
    public static long field3349;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([I[I[ILip;I)V", line = 3)
    public static final void method1907(int[] arg0, int[] arg1, int[] arg2, class738 arg3, int arg4) {
        try {
            if (arg4 >= -121) {
                field3348 = true;
            }
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1[var5];
                int var7 = arg0[var5];
                int var8 = arg2[var5];
                for (int var9 = 0; var7 != 0 && var9 < arg3.field1176.length; var9++) {
                    if ((var7 & 0x1) != 0) {
                        if (var6 == -1) {
                            arg3.field1176[var9] = null;
                        } else {
                            class210 var10 = class397.field6293.method2058(var6, (byte) -116);
                            int var11 = var10.field3338;
                            class494 var12 = arg3.field1176[var9];
                            if (var12 != null) {
                                if (var12.field7422 == var6) {
                                    if (var11 == 0) {
                                        var12 = arg3.field1176[var9] = null;
                                    } else if (var11 == 1) {
                                        var12.field7424 = 0;
                                        var12.field7434 = 0;
                                        var12.field7433 = 0;
                                        var12.field7427 = var8;
                                        var12.field7423 = 1;
                                        if (!arg3.field1120) {
                                            class531.method3967(-75, var10, 0, arg3);
                                        }
                                    } else if (var11 == 2) {
                                        var12.field7433 = 0;
                                    }
                                } else if (var10.field3333 >= class397.field6293.method2058(var12.field7422, (byte) -24).field3333) {
                                    var12 = arg3.field1176[var9] = null;
                                }
                            }
                            if (var12 == null) {
                                class494 var13 = arg3.field1176[var9] = new class494();
                                var13.field7424 = 0;
                                var13.field7427 = var8;
                                var13.field7423 = 1;
                                var13.field7433 = 0;
                                var13.field7422 = var6;
                                var13.field7434 = 0;
                                if (!arg3.field1120) {
                                    class531.method3967(-89, var10, 0, arg3);
                                }
                            }
                        }
                    }
                    var7 >>>= 0x1;
                }
            }
            field3347++;
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field3352[1] + (arg0 == null ? field3352[0] : field3352[2]) + ',' + (arg1 == null ? field3352[0] : field3352[2]) + ',' + (arg2 == null ? field3352[0] : field3352[2]) + ',' + (arg3 == null ? field3352[0] : field3352[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "([SI)[S", line = 102)
    public static final short[] method1908(short[] arg0, int arg1) {
        try {
            field3345++;
            if (arg0 == null) {
                return null;
            } else {
                int var2 = 49 % ((38 - arg1) / 54);
                short[] var3 = new short[arg0.length];
                class405.method3261(arg0, 0, var3, 0, arg0.length);
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3352[4] + (arg0 == null ? field3352[0] : field3352[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)Z", line = 125)
    public static final boolean method1909(byte arg0, int arg1) {
        try {
            if (arg0 == -90) {
                field3350++;
                return arg1 >= 4 && arg1 <= 8;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3352[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V", line = 141)
    public static void method1910(int arg0) {
        try {
            if (arg0 != 1377) {
                field3349 = -14L;
            }
            field3351 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3352[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1911(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1912(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
