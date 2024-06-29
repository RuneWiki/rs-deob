import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class196 {

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "J")
    public long field3130 = 0L;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field3134 = -1;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Lck;")
    public static class119 field3135 = class298.method1987((byte) 56, "Versteckt");

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field3142 = 0;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Lck;")
    public static class119 field3138 = class298.method1987((byte) 49, "hitmarks");

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Z")
    public static boolean field3151 = false;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field3153 = 0;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Lwi;")
    public static class23 field3152;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Lvc;")
    public class293 field3140;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Lva;")
    public static class36 field3145;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[[[B")
    public static byte[][][] field3133;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIBIIIII)V", line = 11)
    public static final void method1258(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3150++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg0 - arg5;
        int var12 = arg6 - arg5;
        int var13 = var11 * var11;
        int var14 = arg6 * arg6;
        int var15 = var12 * var12;
        int var16 = arg0 * arg0;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var13 << 1;
        int var20 = var16 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = var14 - ((var21 - 1) * var20);
        int var24 = -21 / ((36 - arg2) / 37);
        int var25 = (1 - var21) * var16 + var17;
        int var26 = var16 << 2;
        int var27 = (1 - var22) * var13 + var18;
        int var28 = var15 - ((var22 - 1) * var19);
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var13 << 2;
        int var32 = var17 * 3;
        int var33 = (var21 - 3) * var20;
        int var34 = var29;
        int var35 = (var22 - 3) * var19;
        int var36 = var18 * 3;
        int var37 = var30;
        int var38 = (var12 - 1) * var31;
        int var39 = (arg6 - 1) * var26;
        int[] var40 = class256.field4113[arg7];
        class36.method282(arg3 - var11, -arg0 + arg3, arg4, var40, 26175);
        class36.method282(arg3 + var11, -var11 + arg3, arg1, var40, 26175);
        class36.method282(arg0 + arg3, arg3 - -var11, arg4, var40, 26175);
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var25 += var32;
                    var23 += var34;
                    var8++;
                    var34 += var29;
                    var32 += var29;
                }
            }
            if (var23 < 0) {
                var25 += var32;
                var8++;
                var23 += var34;
                var34 += var29;
                var32 += var29;
            }
            var25 += -var39;
            boolean var41 = var9 <= var12;
            var9--;
            var39 -= var26;
            var23 += -var33;
            if (var41) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        var10++;
                        var28 += var37;
                        var37 += var30;
                        var27 += var36;
                        var36 += var30;
                    }
                }
                if (var28 < 0) {
                    var10++;
                    var27 += var36;
                    var28 += var37;
                    var36 += var30;
                    var37 += var30;
                }
                var27 += -var38;
                var38 -= var31;
                var28 += -var35;
                var35 -= var31;
            }
            int var42 = arg7 - var9;
            int var43 = arg7 + var9;
            int var44 = arg3 + var8;
            int var45 = arg3 - var8;
            var33 -= var26;
            if (var41) {
                int var46 = arg3 - var10;
                class36.method282(var46, var45, arg4, class256.field4113[var42], 26175);
                int var47 = arg3 + var10;
                class36.method282(var47, var46, arg1, class256.field4113[var42], 26175);
                class36.method282(var44, var47, arg4, class256.field4113[var42], 26175);
                class36.method282(var46, var45, arg4, class256.field4113[var43], 26175);
                class36.method282(var47, var46, arg1, class256.field4113[var43], 26175);
                class36.method282(var44, var47, arg4, class256.field4113[var43], 26175);
            } else {
                class36.method282(var44, var45, arg4, class256.field4113[var42], 26175);
                class36.method282(var44, var45, arg4, class256.field4113[var43], 26175);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 199)
    public static void method1259(int arg0) {
        field3145 = null;
        field3133 = (byte[][][]) null;
        field3138 = null;
        field3135 = null;
        if (arg0 < 119) {
            field3152 = (class23) null;
        }
        field3152 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V", line = 216)
    public static final void method1260(int arg0, int arg1, int arg2, int arg3) {
        class104 var4 = class150.field2390[arg0][arg1][arg2];
        if (var4 != null) {
            class150.field2390[arg0][arg1][arg2].field1604 = arg3;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lva;I)V", line = 260)
    public static final void method1261(class36 arg0, int arg1) {
        field3144++;
        arg0.method285(class49.field762, true);
        if (arg1 != 0) {
            method1260(-90, 36, -77, -75);
        }
    }
}
