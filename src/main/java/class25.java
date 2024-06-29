import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class25 extends class28 {

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "Z")
    public boolean field235;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "F")
    public static float field239;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III[IIIIZI[ILsl;BIII)I")
    public static final int method146(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int[] arg9, class245 arg10, byte arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class98.field1203[var15][var35] = 0;
                class235.field3070[var15][var35] = 99999999;
            }
        }
        field237++;
        boolean var16;
        if (arg13 == 1) {
            var16 = class185.method1190(arg8, arg10, arg2, 4095, arg6, arg1, arg14, arg5, arg12, arg0, arg4);
        } else if (arg13 == 2) {
            var16 = class463.method2622(arg6, arg4, 256, arg10, arg12, arg2, arg1, arg5, arg14, arg8, arg0);
        } else {
            var16 = class8.method56(arg14, arg8, arg1, arg5, arg6, arg4, arg10, false, arg2, arg0, arg12, arg13);
        }
        int var17 = arg14 - 64;
        int var18 = arg1 - 64;
        int var19 = class5.field46;
        int var20 = class125.field1609;
        if (!var16) {
            if (!arg7) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg0 - var23; var24 <= arg0 + var23; var24++) {
                for (int var25 = arg4 - var23; var25 <= arg4 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class235.field3070[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg0) {
                            var28 = arg0 - var24;
                        } else if (var24 > (arg0 + arg12 - 1)) {
                            var28 = (var24 - arg0) + 1 - arg12;
                        }
                        int var29 = 0;
                        if (arg4 > var25) {
                            var29 = arg4 - var25;
                        } else if ((arg4 - (1 - arg2)) < var25) {
                            var29 = var25 + 1 - arg2 - arg4;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class235.field3070[var26][var27]) {
                            var22 = class235.field3070[var26][var27];
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
        if (arg14 == var19 && arg1 == var20) {
            return 0;
        }
        byte var31 = 0;
        if (arg11 > -51) {
            field239 = 0.45666397F;
        }
        class63.field859[var31] = var19;
        int var37 = var31 + 1;
        class303.field4035[var31] = var20;
        int var32;
        int var33 = var32 = class98.field1203[var19 - var17][var20 - var18];
        while (arg14 != var19 || arg1 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class63.field859[var37] = var19;
                class303.field4035[var37++] = var20;
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
            var33 = class98.field1203[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg3[var34] = class63.field859[var37];
            arg9[var34++] = class303.field4035[var37];
            if (arg3.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IIIIIZ)V")
    public class25(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field240 = arg3;
        this.field242 = arg1;
        this.field235 = arg5;
        this.field238 = arg4;
        this.field236 = arg2;
        this.field241 = arg0;
    }
}
