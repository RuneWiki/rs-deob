import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class212 {

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "[I")
    private int[] field3661;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[I")
    private int[] field3653;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lmb;")
    public static class96 field3655 = class243.method1708("null", (byte) 112);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Lmb;")
    private static class96 field3651 = class243.method1708("purple:", (byte) 111);

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lmb;")
    public static class96 field3656 = field3651;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Lmb;")
    public static class96 field3664 = field3651;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    private int field3657;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    private int field3659;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    private int field3662;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lff;")
    public static class3 field3660;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
    public static final int method1472(int arg0) {
        if (arg0 < 1) {
            field3651 = null;
        }
        field3658++;
        return class268.field4664;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static void method1473(int arg0) {
        if (arg0 != 3) {
            field3656 = null;
        }
        field3655 = null;
        field3664 = null;
        field3651 = null;
        field3660 = null;
        field3656 = null;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I")
    public final int method1474(int arg0) {
        if (arg0 <= 107) {
            return -22;
        }
        if (this.field3654-- == 0) {
            this.method1477(true);
            this.field3654 = 255;
        }
        field3663++;
        return this.field3661[this.field3654];
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3665++;
        int var8 = arg4;
        int var9 = 0;
        int var10 = arg0 - arg1;
        int var11 = 0;
        int var12 = arg4 * arg4;
        int var13 = arg0 * arg0;
        int var14 = arg4 - arg1;
        int var15 = var10 * var10;
        int var16 = var12 << 1;
        int var17 = var13 << 1;
        int var18 = var14 * var14;
        int var19 = var18 << 1;
        int var20 = arg4 << 1;
        int var21 = var14 << 1;
        int var22 = var15 << 1;
        int var23 = (1 - var20) * var13 + var16;
        int var24 = var12 - ((var20 - 1) * var17);
        int var25 = (1 - var21) * var15 + var19;
        int var26 = var18 - ((var21 - 1) * var22);
        int var27 = var12 << 2;
        int var28 = var13 << 2;
        int var29 = var15 << 2;
        int var30 = var18 << 2;
        int var31 = var16 * 3;
        int var32 = (var20 - 3) * var17;
        int var33 = var19 * 3;
        int var34 = (var21 - 3) * var22;
        int var35 = var27;
        if (arg5 <= 34) {
            return;
        }
        int var36 = (arg4 - 1) * var28;
        int var37 = var30;
        int[] var38 = class229.field3939[arg7];
        class36.method283(arg6 - arg0, var38, arg6 - var10, (byte) -66, arg3);
        int var39 = (var14 - 1) * var29;
        class36.method283(arg6 - var10, var38, arg6 + var10, (byte) -90, arg2);
        class36.method283(arg6 + var10, var38, arg6 + arg0, (byte) -61, arg3);
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var27;
                    var35 += var27;
                    var9++;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var9++;
                var35 += var27;
                var31 += var27;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var28;
            var32 -= var28;
            boolean var40 = var14 >= var8;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                        var11++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var11++;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                }
                var25 += -var39;
                var26 += -var34;
                var39 -= var29;
                var34 -= var29;
            }
            int var41 = arg6 + var9;
            int var42 = arg6 - var9;
            var8--;
            int var43 = arg7 - var8;
            int var44 = arg7 + var8;
            if (var40) {
                int var45 = arg6 + var11;
                int var46 = arg6 - var11;
                class36.method283(var42, class229.field3939[var43], var46, (byte) -77, arg3);
                class36.method283(var46, class229.field3939[var43], var45, (byte) -76, arg2);
                class36.method283(var45, class229.field3939[var43], var41, (byte) -108, arg3);
                class36.method283(var42, class229.field3939[var44], var46, (byte) -113, arg3);
                class36.method283(var46, class229.field3939[var44], var45, (byte) -88, arg2);
                class36.method283(var45, class229.field3939[var44], var41, (byte) -87, arg3);
            } else {
                class36.method283(var42, class229.field3939[var43], var41, (byte) -123, arg3);
                class36.method283(var42, class229.field3939[var44], var41, (byte) -66, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
    private final void method1476(int arg0) {
        field3650++;
        if (arg0 != 1) {
            this.field3657 = 88;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var65 ^ var64 << 8;
            int var67 = var5 + var63;
            int var68 = var4 + var66;
            int var69 = var64 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var67 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var68 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var71 << 8;
            int var75 = var4 + var61;
            var8 = var3 + var63;
            int var76 = var71 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var66;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field3661[var11 + 6] + var3;
            int var38 = this.field3661[var11] + var9;
            int var39 = this.field3661[var11 + 3] + var6;
            int var40 = this.field3661[var11 + 1] + var8;
            int var41 = var38 ^ var40 << 11;
            int var42 = this.field3661[var11 + 2] + var7;
            int var43 = this.field3661[var11 + 7] + var2;
            int var44 = this.field3661[var11 + 4] + var5;
            int var45 = var39 + var41;
            int var46 = this.field3661[var11 + 5] + var4;
            int var47 = var40 + var42;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var44 + var48;
            int var50 = var42 + var45;
            int var51 = var50 ^ var45 << 8;
            int var52 = var45 + var49;
            var6 = var52 ^ var49 >>> 16;
            int var53 = var46 + var51;
            int var54 = var49 + var53;
            int var55 = var6 + var37;
            var5 = var54 ^ var53 << 10;
            int var56 = var5 + var43;
            int var57 = var53 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var41;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field3653[var11] = var9;
            this.field3653[var11 + 1] = var8;
            this.field3653[var11 + 2] = var7;
            this.field3653[var11 + 3] = var6;
            this.field3653[var11 + 4] = var5;
            this.field3653[var11 + 5] = var4;
            this.field3653[var11 + 6] = var3;
            this.field3653[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field3653[var12 + 1] + var8;
            int var14 = this.field3653[var12 + 6] + var3;
            int var15 = this.field3653[var12] + var9;
            int var16 = this.field3653[var12 + 3] + var6;
            int var17 = this.field3653[var12 + 5] + var4;
            int var18 = var15 ^ var13 << 11;
            int var19 = this.field3653[var12 + 2] + var7;
            int var20 = var16 + var18;
            int var21 = this.field3653[var12 + 7] + var2;
            int var22 = this.field3653[var12 + 4] + var5;
            int var23 = var13 + var19;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var19 + var20;
            int var26 = var22 + var24;
            int var27 = var25 ^ var20 << 8;
            int var28 = var17 + var27;
            int var29 = var20 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var14;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            var4 = var32 ^ var31 >>> 4;
            int var33 = var5 + var21;
            int var34 = var4 + var18;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field3653[var12] = var9;
            this.field3653[var12 + 1] = var8;
            this.field3653[var12 + 2] = var7;
            this.field3653[var12 + 3] = var6;
            this.field3653[var12 + 4] = var5;
            this.field3653[var12 + 5] = var4;
            this.field3653[var12 + 6] = var3;
            this.field3653[var12 + 7] = var2;
        }
        this.method1477(true);
        this.field3654 = 256;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    private class212() {
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([I)V")
    public class212(int[] arg0) {
        this.field3661 = new int[256];
        this.field3653 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field3661[var2] = arg0[var2];
        }
        this.method1476(1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    private final void method1477(boolean arg0) {
        this.field3659 += ++this.field3662;
        field3652++;
        int var2 = 0;
        if (!arg0) {
            return;
        }
        while (var2 < 256) {
            int var3 = this.field3653[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field3657 ^= this.field3657 << 13;
                } else {
                    this.field3657 ^= this.field3657 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field3657 ^= this.field3657 << 2;
            } else {
                this.field3657 ^= this.field3657 >>> 16;
            }
            this.field3657 += this.field3653[var2 + 128 & 0xFF];
            int var4;
            this.field3653[var2] = var4 = this.field3659 + this.field3653[class130.method985(255, var3 >> 2)] + this.field3657;
            this.field3661[var2] = this.field3659 = var3 + this.field3653[class130.method985(var4 >> 8, 1020) >> 2];
            var2++;
        }
    }
}
