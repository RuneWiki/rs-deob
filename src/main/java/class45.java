import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class45 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
    public static int[] field665 = new int[2];

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "[[B")
    public static byte[][] field668 = new byte[250][];

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field672 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lmi;")
    public static class408 field669 = new class408();

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field674 = -1;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ldr;")
    public static class213 field673;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lkb;Lnr;ILlo;II)Z")
    public static final boolean method329(class80 arg0, class437 arg1, int arg2, class419 arg3, int arg4, int arg5) {
        field667++;
        if (arg4 != -155) {
            return true;
        }
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field1126 != null) {
            var6 = (arg0.field1124 - (class76.field1042 - arg3.field6223)) * (class76.field1034 - class76.field1053) / (class76.field1052 - class76.field1042) + class76.field1053;
            var8 = class76.field1035 - ((class76.field1035 - class76.field1038) * (arg0.field1116 + arg3.field6230 - class76.field1040) / (class76.field1039 - class76.field1040));
            var9 = class76.field1035 - (arg0.field1109 + arg3.field6230 - class76.field1040) * (class76.field1035 - class76.field1038) / (class76.field1039 - class76.field1040);
            var7 = (arg0.field1093 + arg3.field6223 - class76.field1042) * (class76.field1034 - class76.field1053) / (class76.field1052 - class76.field1042) + class76.field1053;
        }
        class243 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field1123 != -1) {
            if (arg3.field6222 && arg0.field1110 != -1) {
                var10 = arg0.method502(-4379, true, arg1);
            } else {
                var10 = arg0.method502(-4379, false, arg1);
            }
            if (var10 != null) {
                var11 = arg3.field6232 - (var10.method1088() + 1 >> 1);
                var12 = arg3.field6232 + (var10.method1088() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg3.field6233 - (var10.method1091() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg3.field6233 + (var10.method1091() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class378 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg0.field1092 != null) {
            var15 = class417.method2695(-83, arg0.field1113);
            if (var15 != null) {
                var16 = class70.field968.method1028((int[]) null, -91, arg0.field1092, class433.field6390, (class243[]) null);
                int var23 = arg3.field6233;
                if (var10 == null) {
                    var17 = var23 - var15.method2508() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method1091() >> 1) + (var15.method2503() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class433.field6390[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2507(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg3.field6232 + arg5 - (var18 / 2);
                var20 = var18 / 2 + arg5 + arg3.field6232;
                if (var6 > var19) {
                    var6 = var19;
                }
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = arg2 + var17;
                var22 = arg2 + var15.method2503() * var16 + var17;
                if (var8 > var21) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class76.field1053 > var7 || class76.field1034 < var6 || class76.field1038 > var9 || var8 > class76.field1035) {
            return true;
        }
        if (arg0.field1126 != null) {
            int[] var27 = new int[arg0.field1126.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg0.field1126[var28 * 2] + arg3.field6223;
                int var31 = arg0.field1126[var28 * 2 + 1] + arg3.field6230;
                var27[var28 * 2] = (class76.field1034 - class76.field1053) * (var30 - class76.field1042) / (class76.field1052 - class76.field1042) + class76.field1053;
                var27[var28 * 2 + 1] = class76.field1035 - ((var31 - class76.field1040) * (class76.field1035 - class76.field1038) / (class76.field1039 - class76.field1040));
            }
            class21.method185(arg1, var27, arg0.field1104);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg1.method2762(true, var27[var29 * 2 + 2 + 1], var27[(var29 + 1) * 2], var27[var29 * 2 + 1], var27[var29 * 2], arg0.field1120);
            }
            arg1.method2762(true, var27[1], var27[0], var27[var27.length - 1], var27[var27.length - 2], arg0.field1120);
        }
        if (var10 != null) {
            if (class292.field4230 > 0 && (class423.field6297 != -1 && class423.field6297 == arg3.field6231 || class263.field3834 != -1 && class263.field3834 == arg0.field1119)) {
                int var32;
                if (class395.field5935 <= 50) {
                    var32 = class395.field5935 * 2;
                } else {
                    var32 = (100 - class395.field5935) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg1.method2770(arg3.field6233, var33, arg3.field6232, var10.method1095() / 2 + 7, (byte) -127);
                arg1.method2770(arg3.field6233, var33, arg3.field6232, var10.method1095() / 2 + 5, (byte) -125);
                arg1.method2770(arg3.field6233, var33, arg3.field6232, var10.method1095() / 2 + 3, (byte) 47);
                arg1.method2770(arg3.field6233, var33, arg3.field6232, var10.method1095() / 2 + 1, (byte) -125);
                arg1.method2770(arg3.field6233, var33, arg3.field6232, var10.method1095() / 2, (byte) -125);
            }
            var10.method1499(arg3.field6232 - (var10.method1088() >> 1), arg3.field6233 + -(var10.method1091() >> 1));
        }
        if (arg0.field1092 != null && var15 != null) {
            class358.method2347(var17, arg1, var18, (byte) 38, var16, arg3, var15, arg0);
        }
        if (arg0.field1123 != -1 || arg0.field1092 != null) {
            class368 var34 = new class368(arg3);
            var34.field5465 = var13;
            var34.field5468 = var11;
            var34.field5474 = var14;
            var34.field5463 = var21;
            var34.field5466 = var20;
            var34.field5471 = var12;
            var34.field5464 = var22;
            var34.field5462 = var19;
            class106.field1425.method2660((byte) -123, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZII)I")
    public static final int method330(boolean arg0, int arg1, int arg2) {
        field671++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        if (arg0) {
            field673 = null;
        }
        int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
        return (var5 & 0x7FF0514) >> 19;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)Lcr;")
    public static final class190 method331(byte arg0, int arg1) {
        field670++;
        class190 var2 = (class190) class319.field4568.method209(118, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class128.field1707.method1472(arg1, 0, 0);
        class190 var4 = new class190();
        if (var3 != null) {
            var4.method1184(new class265(var3), true);
        }
        var4.method1180((byte) 109);
        class319.field4568.method202(true, var4, (long) arg1);
        if (arg0 <= 115) {
            field673 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([SI)[S")
    public static final short[] method332(short[] arg0, int arg1) {
        field666++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        if (arg1 <= 20) {
            method333((byte) 89);
        }
        class111.method773(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method333(byte arg0) {
        field672 = null;
        field673 = null;
        field665 = null;
        field668 = null;
        field669 = null;
        if (arg0 <= 69) {
            method329((class80) null, (class437) null, 127, (class419) null, -123, -13);
        }
    }
}
