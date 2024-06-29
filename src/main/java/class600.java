import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class600 {

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "[[Z")
    public static boolean[][] field8524 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field8523 = 0;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "Lwf;")
    public static class122 field8522;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "[[[B")
    public static byte[][][] field8525;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V", line = 3)
    public static final void method3353(int arg0, int arg1) {
        if (arg1 != 2) {
            field8523 = -32;
        }
        class653 var2 = class39.field423;
        synchronized (class39.field423) {
            class39.field423.method3691(false, arg0);
        }
        field8526++;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILhk;Loa;Lbv;II)Z", line = 22)
    public static final boolean method3354(int arg0, class89 arg1, class635 arg2, class276 arg3, int arg4, int arg5) {
        field8527++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field972 != null) {
            var9 = class637.field9035 - ((arg3.field3484 + arg1.field941 - class637.field9034) * (class637.field9035 - class637.field9038) / (class637.field9044 - class637.field9034));
            var7 = class637.field9028 + ((class637.field9048 - class637.field9028) * (arg1.field966 + arg3.field3479 - class637.field9045) / (class637.field9027 - class637.field9045));
            var8 = class637.field9035 - ((arg1.field981 + arg3.field3484 - class637.field9034) * (class637.field9035 - class637.field9038) / (class637.field9044 - class637.field9034));
            var6 = (arg3.field3479 + arg1.field954 - class637.field9045) * (class637.field9048 - class637.field9028) / (class637.field9027 - class637.field9045) + class637.field9028;
        }
        class458 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field970 != -1) {
            if (arg3.field3486 && arg1.field939 != -1) {
                var10 = arg1.method551(true, arg2, (byte) -125);
            } else {
                var10 = arg1.method551(false, arg2, (byte) -127);
            }
            if (var10 != null) {
                var11 = arg3.field3485 - (var10.method418() + 1 >> 1);
                var12 = arg3.field3485 + (var10.method418() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var13 = arg3.field3482 - (var10.method408() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg3.field3482 + (var10.method408() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class434 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (arg4 < 65) {
            field8524 = null;
        }
        int var21 = 0;
        int var22 = 0;
        if (arg1.field943 != null) {
            var15 = class469.method2658(arg1.field949, false);
            if (var15 != null) {
                var16 = class651.field9317.method3621(arg1.field943, null, 1, class571.field8106, null);
                int var23 = arg3.field3482;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method2315() / 2;
                } else {
                    var17 = var23 - ((var10.method408() >> 1) + (var16 * var15.method2314()));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class571.field8106[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method2318(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg3.field3485 + arg0 - (var18 / 2);
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg3.field3485 + arg0;
                var21 = arg5 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = arg5 + var17 + (var16 * var15.method2314());
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class637.field9028 > var7 || var6 > class637.field9048 || class637.field9038 > var9 || class637.field9035 < var8) {
            return true;
        }
        if (arg1.field972 != null) {
            int[] var27 = new int[arg1.field972.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg1.field972[var28 * 2] + arg3.field3479;
                int var31 = arg1.field972[var28 * 2 + 1] + arg3.field3484;
                var27[var28 * 2] = class637.field9028 + ((var30 - class637.field9045) * (class637.field9048 - class637.field9028) / (class637.field9027 - class637.field9045));
                var27[var28 * 2 + 1] = class637.field9035 - ((class637.field9035 - class637.field9038) * (var31 - class637.field9034) / (class637.field9044 - class637.field9034));
            }
            class74.method480(arg2, var27, arg1.field971);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg2.method3554(arg1.field942, var27[var29 * 2 + 2], var27[var29 * 2], var27[(var29 + 1) * 2 + 1], 6459, var27[var29 * 2 + 1]);
            }
            arg2.method3554(arg1.field942, var27[0], var27[var27.length - 2], var27[1], 6459, var27[var27.length - 1]);
        }
        if (var10 != null) {
            if (class235.field2997 > 0 && (class388.field5189 != -1 && class388.field5189 == arg3.field3483 || class685.field9699 != -1 && class685.field9699 == arg1.field967)) {
                int var32;
                if (class2.field19 <= 50) {
                    var32 = class2.field19 * 2;
                } else {
                    var32 = (100 - class2.field19) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method3553(arg3.field3485, var33, var10.method415() / 2 + 7, arg3.field3482, -4271);
                arg2.method3553(arg3.field3485, var33, var10.method415() / 2 + 5, arg3.field3482, -4271);
                arg2.method3553(arg3.field3485, var33, var10.method415() / 2 + 3, arg3.field3482, -4271);
                arg2.method3553(arg3.field3485, var33, var10.method415() / 2 + 1, arg3.field3482, -4271);
                arg2.method3553(arg3.field3485, var33, var10.method415() / 2, arg3.field3482, -4271);
            }
            var10.method2612(arg3.field3485 - (var10.method418() >> 1), arg3.field3482 + -(var10.method408() >> 1));
        }
        if (arg1.field943 != null && var15 != null) {
            class488.method2825(arg1, var15, arg2, var16, var18, (byte) -78, arg3, var17);
        }
        if (arg1.field970 != -1 || arg1.field943 != null) {
            class433 var34 = new class433(arg3);
            var34.field5704 = var13;
            var34.field5698 = var20;
            var34.field5707 = var11;
            var34.field5700 = var22;
            var34.field5712 = var19;
            var34.field5709 = var21;
            var34.field5701 = var12;
            var34.field5703 = var14;
            class504.field7252.method3164(var34, 256);
        }
        return false;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 247)
    public static void method3355(boolean arg0) {
        field8524 = null;
        if (arg0) {
            field8522 = null;
            field8525 = null;
        }
    }
}
