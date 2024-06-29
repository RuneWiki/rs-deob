import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class147 {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public int field2079 = -1;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field2083 = 0;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "F")
    public static float field2073;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public int field2074;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public int field2080;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public int field2085;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public int field2086;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public int field2087;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Lnl;")
    public static class51 field2084;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIILdq;II)Ljava/awt/Frame;")
    public static final Frame method907(int arg0, int arg1, int arg2, class14 arg3, int arg4, int arg5) {
        field2081++;
        if (arg0 != -13878) {
            field2084 = null;
        }
        if (!arg3.method122(false)) {
            return null;
        }
        if (arg5 == 0) {
            class275[] var6 = class254.method1579(5878, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3811 == arg2 && var6[var8].field3802 == arg1 && (arg4 == 0 || var6[var8].field3805 == arg4) && (!var7 || arg5 < var6[var8].field3808)) {
                    var7 = true;
                    arg5 = var6[var8].field3808;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class420 var9 = arg3.method121(arg5, true, arg2, arg4, arg1);
        while (var9.field5789 == 0) {
            class258.method1603(arg0 ^ 0x34BD, 10L);
        }
        Frame var10 = (Frame) var9.field5791;
        if (var10 == null) {
            return null;
        } else if (var9.field5789 == 2) {
            class204.method1292(arg3, var10, -2);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method908(byte arg0) {
        field2084 = null;
        if (arg0 != -71) {
            field2083 = 127;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILfr;IILji;Lkm;)Z")
    public static final boolean method909(int arg0, class442 arg1, int arg2, int arg3, class163 arg4, class487 arg5) {
        field2078++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field6063 != null) {
            var7 = class379.field5391 + ((arg1.field6066 + arg4.field2339 - class379.field5392) * (class379.field5394 - class379.field5391) / (class379.field5377 - class379.field5392));
            var8 = class379.field5385 - (class379.field5385 - class379.field5388) * (arg4.field2343 + arg1.field6077 - class379.field5387) / (class379.field5382 - class379.field5387);
            var9 = class379.field5385 - ((class379.field5385 - class379.field5388) * (arg1.field6082 + arg4.field2343 - class379.field5387) / (class379.field5382 - class379.field5387));
            var6 = (arg1.field6103 + arg4.field2339 - class379.field5392) * (class379.field5394 - class379.field5391) / (class379.field5377 - class379.field5392) + class379.field5391;
        }
        class385 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field6071 != -1) {
            if (arg4.field2340 && arg1.field6100 != -1) {
                var10 = arg1.method2566(true, (byte) -103, arg5);
            } else {
                var10 = arg1.method2566(false, (byte) -125, arg5);
            }
            if (var10 != null) {
                var11 = arg4.field2334 - (var10.method382() + 1 >> 1);
                var12 = arg4.field2334 + (var10.method382() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var13 = arg4.field2346 - (var10.method389() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg4.field2346 + (var10.method389() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class141 var15 = null;
        int var16 = arg2;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg1.field6068 != null) {
            var15 = class258.method1604(-119, arg1.field6094);
            if (var15 != null) {
                var16 = class329.field4538.method521((class385[]) null, arg1.field6068, (int[]) null, class106.field1529, (byte) 26);
                int var23 = arg4.field2346;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method870() / 2;
                } else {
                    var17 = var23 - ((var10.method389() >> 1) + var15.method871() * var16);
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class106.field1529[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method874(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg4.field2334 + arg0 - (var18 / 2);
                var20 = var18 / 2 + arg4.field2334 + arg0;
                if (var6 > var19) {
                    var6 = var19;
                }
                if (var20 > var7) {
                    var7 = var20;
                }
                var21 = arg3 + var17;
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = var15.method871() * var16 + var17 + arg3;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class379.field5391 > var7 || class379.field5394 < var6 || class379.field5388 > var9 || class379.field5385 < var8) {
            return true;
        }
        if (arg1.field6063 != null) {
            int[] var27 = new int[arg1.field6063.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg1.field6063[var28 * 2] + arg4.field2339;
                int var31 = arg1.field6063[var28 * 2 + 1] + arg4.field2343;
                var27[var28 * 2] = class379.field5391 + ((class379.field5394 - class379.field5391) * (var30 - class379.field5392) / (class379.field5377 - class379.field5392));
                var27[var28 * 2 + 1] = class379.field5385 - (class379.field5385 - class379.field5388) * (var31 - class379.field5387) / (class379.field5382 - class379.field5387);
            }
            class276.method1733(arg5, var27, arg1.field6067);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg5.method2863(var27[var29 * 2], arg1.field6099, var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 1], var27[(var29 + 1) * 2], true);
            }
            arg5.method2863(var27[var27.length - 2], arg1.field6099, var27[1], var27[var27.length - 1], var27[0], true);
        }
        if (var10 != null) {
            if (class175.field2588 > 0 && (class446.field6163 != -1 && class446.field6163 == arg4.field2342 || class283.field3887 != -1 && class283.field3887 == arg1.field6073)) {
                int var32;
                if (class3.field29 > 50) {
                    var32 = (100 - class3.field29) * 2;
                } else {
                    var32 = class3.field29 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg5.method2862(arg4.field2346, var10.method388() / 2 + 7, var33, (byte) 36, arg4.field2334);
                arg5.method2862(arg4.field2346, var10.method388() / 2 + 5, var33, (byte) 36, arg4.field2334);
                arg5.method2862(arg4.field2346, var10.method388() / 2 + 3, var33, (byte) 36, arg4.field2334);
                arg5.method2862(arg4.field2346, var10.method388() / 2 + 1, var33, (byte) 36, arg4.field2334);
                arg5.method2862(arg4.field2346, var10.method388() / 2, var33, (byte) 36, arg4.field2334);
            }
            var10.method2301(arg4.field2334 - (var10.method382() >> 1), arg4.field2346 + -(var10.method389() >> 1));
        }
        if (arg1.field6068 != null && var15 != null) {
            class67.method473(0, arg5, arg4, var18, arg1, var16, var15, var17);
        }
        if (arg1.field6071 != -1 || arg1.field6068 != null) {
            class21 var34 = new class21(arg4);
            var34.field365 = var13;
            var34.field369 = var22;
            var34.field362 = var14;
            var34.field358 = var19;
            var34.field363 = var11;
            var34.field359 = var20;
            var34.field360 = var21;
            var34.field361 = var12;
            class52.field863.method1553((byte) -107, var34);
        }
        return false;
    }
}
