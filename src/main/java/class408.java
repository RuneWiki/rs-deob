import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class408 extends class320 {

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "I")
    public int field6120 = -1;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
    public int field6125 = 0;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "Liv;")
    public static class64 field6127;

    @OriginalMember(owner = "client!gu", name = "z", descriptor = "Liv;")
    public static class64 field6129;

    @OriginalMember(owner = "client!gu", name = "B", descriptor = "Lpi;")
    public static class342 field6131;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public int field6115;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public int field6116;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    public int field6118;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
    public int field6119;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public int field6121;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "I")
    public int field6122;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public int field6123;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
    public int field6124;

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
    public int field6126;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
    public int field6128;

    @OriginalMember(owner = "client!gu", name = "A", descriptor = "I")
    public static int field6130;

    static {
        new class342(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field6127 = new class64(15, 15);
        field6129 = new class64(39, 6);
        field6131 = new class342("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZIILbr;IIIIII[I[II)I", line = 6)
    public static final int method2484(int arg0, int arg1, boolean arg2, int arg3, int arg4, class268 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int[] arg13, int arg14) {
        field6117++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class129.field2058[var15][var35] = 0;
                class357.field5436[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg10 == 1) {
            var16 = class352.method2240(arg5, false, arg9, arg8, arg1, arg14, arg11, arg0, arg3, arg4, arg6);
        } else if (arg10 == 2) {
            var16 = class116.method854(arg5, arg3, arg6, arg8, arg1, arg4, arg0, (byte) 46, arg9, arg11, arg14);
        } else {
            var16 = class152.method1155((byte) 105, arg1, arg4, arg14, arg8, arg6, arg5, arg3, arg0, arg11, arg10, arg9);
        }
        int var17 = arg1 - 64;
        int var18 = arg8 - 64;
        if (arg7 <= 59) {
            return -72;
        }
        int var19 = class400.field6022;
        int var20 = class11.field165;
        if (!var16) {
            if (!arg2) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg3 - var23; var24 <= arg3 + var23; var24++) {
                for (int var25 = arg9 - var23; var25 <= arg9 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class357.field5436[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg3 > var24) {
                            var28 = arg3 - var24;
                        } else if (var24 > arg3 + arg6 - 1) {
                            var28 = var24 + 1 - arg3 - arg6;
                        }
                        int var29 = 0;
                        if (arg9 > var25) {
                            var29 = arg9 - var25;
                        } else if (arg9 + arg4 - 1 < var25) {
                            var29 = -arg4 - arg9 - (-1 - var25);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class357.field5436[var26][var27]) {
                            var22 = class357.field5436[var26][var27];
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg1 == var19 && arg8 == var20) {
            return 0;
        }
        byte var31 = 0;
        class353.field5403[var31] = var19;
        int var37 = var31 + 1;
        class49.field897[var31] = var20;
        int var32;
        int var33 = var32 = class129.field2058[var19 - var17][var20 - var18];
        while (arg1 != var19 || arg8 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class353.field5403[var37] = var19;
                class49.field897[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class129.field2058[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg13[var34] = class353.field5403[var37];
            arg12[var34++] = class49.field897[var37];
            if (var34 >= arg13.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V", line = 187)
    public static void method2485(int arg0) {
        field6131 = null;
        field6129 = null;
        if (arg0 != -27428) {
            method2486(-80, 60);
        }
        field6127 = null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I", line = 213)
    public static final int method2486(int arg0, int arg1) {
        if (arg0 != 31293) {
            method2485(-51);
        }
        field6130++;
        return arg1 >>> 7;
    }
}
