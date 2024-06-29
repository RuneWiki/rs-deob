import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class124 extends class41 {

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "Lsc;")
    public static class181 field2031 = class149.method967(255, "<)4col>");

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field2032 = 100;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "[I")
    public static int[] field2027;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)Z")
    public static final boolean method801(boolean arg0, int arg1) {
        field2033++;
        if (arg0) {
            field2027 = null;
        }
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljb;IB)Lpg;")
    public static final class69 method802(class11 arg0, int arg1, byte arg2) {
        field2028++;
        if (arg2 > -28) {
            method805(-12);
        }
        return class18.method173(arg0, (byte) 106, arg1) ? class74.method516(28) : null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = 0;
        field2030++;
        int var10 = arg3;
        int var11 = arg4 - arg1;
        int var12 = arg3 - arg1;
        int var13 = arg4 * arg4;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var14 << 1;
        int var17 = var13 << 1;
        int var18 = var12 * var12;
        int var19 = var18 << 1;
        int var20 = var15 << 1;
        int var21 = var12 << 1;
        int var22 = arg3 << 1;
        int var23 = (1 - var22) * var13 + var16;
        int var24 = var14 - ((var22 - 1) * var17);
        if (arg5 > -40) {
            method803(73, -30, -92, -55, -125, 11, -46, -120);
        }
        int var25 = var18 - ((var21 - 1) * var20);
        int var26 = (1 - var21) * var15 + var19;
        int var27 = var13 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var18 << 2;
        int var31 = var16 * 3;
        int var32 = (var22 - 3) * var17;
        int var33 = var19 * 3;
        int var34 = (var21 - 3) * var20;
        int var35 = var29;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var28;
        int[] var39 = class149.field2507[arg2];
        class171.method1133(var39, arg7 - arg4, arg0, arg7 - var11, (byte) 126);
        class171.method1133(var39, arg7 - var11, arg6, arg7 + var11, (byte) 127);
        class171.method1133(var39, arg7 + var11, arg0, arg4 + arg7, (byte) 125);
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var8++;
                    var24 += var35;
                    var31 += var29;
                    var35 += var29;
                }
            }
            boolean var40 = var10 <= var12;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var9++;
                        var26 += var33;
                        var25 += var37;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var25 < 0) {
                    var25 += var37;
                    var37 += var30;
                    var9++;
                    var26 += var33;
                    var33 += var30;
                }
                var25 += -var34;
                var26 += -var38;
                var34 -= var28;
                var38 -= var28;
            }
            var10--;
            if (var24 < 0) {
                var8++;
                var23 += var31;
                var31 += var29;
                var24 += var35;
                var35 += var29;
            }
            int var41 = arg2 - var10;
            int var42 = arg7 + var8;
            int var43 = arg7 - var8;
            int var44 = arg2 + var10;
            var24 += -var32;
            if (var40) {
                int var45 = arg7 - var9;
                int var46 = arg7 + var9;
                class171.method1133(class149.field2507[var41], var43, arg0, var45, (byte) 126);
                class171.method1133(class149.field2507[var41], var45, arg6, var46, (byte) 125);
                class171.method1133(class149.field2507[var41], var46, arg0, var42, (byte) 127);
                class171.method1133(class149.field2507[var44], var43, arg0, var45, (byte) 125);
                class171.method1133(class149.field2507[var44], var45, arg6, var46, (byte) 126);
                class171.method1133(class149.field2507[var44], var46, arg0, var42, (byte) 125);
            } else {
                class171.method1133(class149.field2507[var41], var43, arg0, var42, (byte) 126);
                class171.method1133(class149.field2507[var44], var43, arg0, var42, (byte) 126);
            }
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public static final void method804(int arg0) {
        field2025++;
        if (class263.field4583 > 0) {
            class207.method1376((byte) 94);
        } else if (arg0 > 44) {
            class160.field2731 = class216.field3713;
            class216.field3713 = null;
            class92.method612(40, 255);
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static void method805(int arg0) {
        field2027 = null;
        if (arg0 != -1469543774) {
            field2027 = null;
        }
        field2031 = null;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class124() {
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
    public class124(int arg0) {
        this.field2029 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BII)I")
    public static final int method806(byte[] arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field2026++;
            return class208.method1380(0, arg1, (byte) 21, arg0);
        } else {
            return -29;
        }
    }
}
