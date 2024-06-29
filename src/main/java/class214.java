import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class214 extends class83 {

    @OriginalMember(owner = "client!li", name = "S", descriptor = "Z")
    private static boolean field3620 = false;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    private int field3593;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    private static int field3594;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    private static int field3596;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    private int field3600;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    private int field3602;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    private static int field3603;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "I")
    private int field3613;

    @OriginalMember(owner = "client!li", name = "O", descriptor = "I")
    private static int field3616;

    @OriginalMember(owner = "client!li", name = "P", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!li", name = "R", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!li", name = "U", descriptor = "I")
    private int field3622;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "Z")
    private boolean field3589;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Z")
    private boolean field3598;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "[B")
    private static byte[] field3599;

    @OriginalMember(owner = "client!li", name = "T", descriptor = "[B")
    private byte[] field3621;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "[F")
    private static float[] field3595;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "[F")
    private static float[] field3597;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "[F")
    private float[] field3601;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "[F")
    private static float[] field3606;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "[F")
    private static float[] field3608;

    @OriginalMember(owner = "client!li", name = "H", descriptor = "[F")
    private static float[] field3609;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "[F")
    private static float[] field3610;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "[F")
    private static float[] field3611;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "[I")
    private static int[] field3612;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "[I")
    private static int[] field3615;

    @OriginalMember(owner = "client!li", name = "Q", descriptor = "[I")
    private static int[] field3618;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "[Lqj;")
    public static class233[] field3590;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "[Lr;")
    private static class238[] field3592;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "[Lm;")
    private static class44[] field3604;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "[Lbe;")
    private static class86[] field3614;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "[Z")
    private static boolean[] field3605;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "[[B")
    private byte[][] field3607;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lvh;II)Lli;")
    public static final class214 method1425(class108 arg0, int arg1, int arg2) {
        if (method1433(arg0)) {
            byte[] var3 = arg0.method746(arg2, (byte) -128, arg1);
            return var3 == null ? null : new class214(var3);
        } else {
            arg0.method737(-1, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([B)V")
    private final void method1426(byte[] arg0) {
        class101 var2 = new class101(arg0);
        this.field3602 = var2.method655((byte) 77);
        this.field3593 = var2.method655((byte) 57);
        this.field3613 = var2.method655((byte) 118);
        this.field3591 = var2.method655((byte) 90);
        if (this.field3591 < 0) {
            this.field3591 = ~this.field3591;
            this.field3589 = true;
        }
        int var3 = var2.method655((byte) 107);
        this.field3607 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method669((byte) 36);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method647(-13749, 0, var7, var5);
            this.field3607[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()V")
    public static void method1427() {
        field3599 = null;
        field3590 = null;
        field3614 = null;
        field3592 = null;
        field3604 = null;
        field3605 = null;
        field3615 = null;
        field3610 = null;
        field3608 = null;
        field3606 = null;
        field3597 = null;
        field3595 = null;
        field3609 = null;
        field3611 = null;
        field3612 = null;
        field3618 = null;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)F")
    public static final float method1428(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)I")
    public static final int method1429(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3616) {
            int var4 = 8 - field3616;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3599[field3594] >> field3616 & var5) << var2;
            field3616 = 0;
            field3594++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3599[field3594] >> field3616 & var3) << var2;
            field3616 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "([B)V")
    private static final void method1430(byte[] arg0) {
        method1431(arg0, 0);
        field3603 = 0x1 << method1429(4);
        field3596 = 0x1 << method1429(4);
        field3610 = new float[field3596];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3603 : field3596;
            int var15 = var14 >> 1;
            int var16 = var14 >> 2;
            int var17 = var14 >> 3;
            float[] var18 = new float[var15];
            for (int var19 = 0; var19 < var16; var19++) {
                var18[var19 * 2] = (float) Math.cos((double) (var19 * 4) * 3.141592653589793D / (double) var14);
                var18[var19 * 2 + 1] = -((float) Math.sin((double) (var19 * 4) * 3.141592653589793D / (double) var14));
            }
            float[] var20 = new float[var15];
            for (int var21 = 0; var21 < var16; var21++) {
                var20[var21 * 2] = (float) Math.cos((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
                var20[var21 * 2 + 1] = (float) Math.sin((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
            }
            float[] var22 = new float[var16];
            for (int var23 = 0; var23 < var17; var23++) {
                var22[var23 * 2] = (float) Math.cos((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14);
                var22[var23 * 2 + 1] = -((float) Math.sin((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14));
            }
            int[] var24 = new int[var17];
            int var25 = class193.method1267(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class84.method554(var26, var25, 51);
            }
            if (var1 == 0) {
                field3608 = var18;
                field3606 = var20;
                field3597 = var22;
                field3612 = var24;
            } else {
                field3595 = var18;
                field3609 = var20;
                field3611 = var22;
                field3618 = var24;
            }
        }
        int var2 = method1429(8) + 1;
        field3590 = new class233[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3590[var3] = new class233();
        }
        int var4 = method1429(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1429(16);
        }
        int var6 = method1429(6) + 1;
        field3614 = new class86[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3614[var7] = new class86();
        }
        int var8 = method1429(6) + 1;
        field3592 = new class238[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3592[var9] = new class238();
        }
        int var10 = method1429(6) + 1;
        field3604 = new class44[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3604[var11] = new class44();
        }
        int var12 = method1429(6) + 1;
        field3605 = new boolean[var12];
        field3615 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3605[var13] = method1434() != 0;
            method1429(16);
            method1429(16);
            field3615[var13] = method1429(8);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([BI)V")
    private static final void method1431(byte[] arg0, int arg1) {
        field3599 = arg0;
        field3594 = arg1;
        field3616 = 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([I)Lph;")
    public final class202 method1432(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3621 == null) {
            this.field3600 = 0;
            this.field3601 = new float[field3596];
            this.field3621 = new byte[this.field3593];
            this.field3619 = 0;
            this.field3622 = 0;
        }
        while (this.field3622 < this.field3607.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1435(this.field3622);
            if (var3 != null) {
                int var4 = this.field3619;
                int var5 = var3.length;
                if (var5 > this.field3593 - var4) {
                    var5 = this.field3593 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3621[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3619;
                }
                this.field3619 = var4;
            }
            this.field3622++;
        }
        this.field3601 = null;
        byte[] var2 = this.field3621;
        this.field3621 = null;
        return new class202(this.field3602, var2, this.field3613, this.field3591, this.field3589);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lvh;)Z")
    private static final boolean method1433(class108 arg0) {
        if (!field3620) {
            byte[] var1 = arg0.method746(0, (byte) -128, 0);
            if (var1 == null) {
                return false;
            }
            method1430(var1);
            field3620 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()I")
    public static final int method1434() {
        int var0 = field3599[field3594] >> field3616 & 0x1;
        field3616++;
        field3594 += field3616 >> 3;
        field3616 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
    private class214(byte[] arg0) {
        this.method1426(arg0);
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(I)[F")
    private final float[] method1435(int arg0) {
        method1431(this.field3607[arg0], 0);
        method1434();
        int var2 = method1429(class193.method1267(field3615.length - 1, false));
        boolean var3 = field3605[var2];
        int var4 = var3 ? field3596 : field3603;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1434() != 0;
            var6 = method1434() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3603 >> 2);
            var9 = (field3603 >> 2) + (var4 >> 2);
            var10 = field3603 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3603 >> 2);
            var12 = (field3603 >> 2) + (var4 - (var4 >> 2));
            var13 = field3603 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class44 var14 = field3604[field3615[var2]];
        int var15 = var14.field630;
        int var16 = var14.field628[var15];
        boolean var17 = !field3614[var16].method563();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field627; var19++) {
            class238 var95 = field3592[var14.field629[var19]];
            float[] var96 = field3610;
            var95.method1574(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field630;
            int var21 = var14.field628[var20];
            field3614[var21].method568(field3610, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3610[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3610;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3595 : field3608;
            float[] var30 = var3 ? field3609 : field3606;
            float[] var31 = var3 ? field3611 : field3597;
            int[] var32 = var3 ? field3618 : field3612;
            for (int var33 = 0; var33 < var24; var33++) {
                float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
                float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
                float var93 = var29[var33 * 2];
                float var94 = var29[var33 * 2 + 1];
                var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
                var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
            }
            for (int var34 = 0; var34 < var25; var34++) {
                float var85 = var26[var34 * 4 + var23 + 3];
                float var86 = var26[var34 * 4 + var23 + 1];
                float var87 = var26[var34 * 4 + 3];
                float var88 = var26[var34 * 4 + 1];
                var26[var34 * 4 + var23 + 3] = var85 + var87;
                var26[var34 * 4 + var23 + 1] = var86 + var88;
                float var89 = var29[var23 - var34 * 4 - 4];
                float var90 = var29[var23 - var34 * 4 - 3];
                var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
                var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
            }
            int var35 = class193.method1267(var4 - 1, false);
            for (int var36 = 0; var36 < var35 - 3; var36++) {
                int var72 = var4 >> var36 + 2;
                int var73 = 0x8 << var36;
                for (int var74 = 0; var74 < 0x2 << var36; var74++) {
                    int var75 = var4 - var72 * 2 * var74;
                    int var76 = var4 - (var74 * 2 + 1) * var72;
                    for (int var77 = 0; var77 < var4 >> var36 + 4; var77++) {
                        int var78 = var77 * 4;
                        float var79 = var26[var75 - var78 - 1];
                        float var80 = var26[var75 - var78 - 3];
                        float var81 = var26[var76 - var78 - 1];
                        float var82 = var26[var76 - var78 - 3];
                        var26[var75 - var78 - 1] = var79 + var81;
                        var26[var75 - var78 - 3] = var80 + var82;
                        float var83 = var29[var73 * var77];
                        float var84 = var29[var73 * var77 + 1];
                        var26[var76 - var78 - 1] = (var79 - var81) * var83 - (var80 - var82) * var84;
                        var26[var76 - var78 - 3] = (var79 - var81) * var84 + (var80 - var82) * var83;
                    }
                }
            }
            for (int var37 = 1; var37 < var25 - 1; var37++) {
                int var65 = var32[var37];
                if (var37 < var65) {
                    int var66 = var37 * 8;
                    int var67 = var65 * 8;
                    float var68 = var26[var66 + 1];
                    var26[var66 + 1] = var26[var67 + 1];
                    var26[var67 + 1] = var68;
                    float var69 = var26[var66 + 3];
                    var26[var66 + 3] = var26[var67 + 3];
                    var26[var67 + 3] = var69;
                    float var70 = var26[var66 + 5];
                    var26[var66 + 5] = var26[var67 + 5];
                    var26[var67 + 5] = var70;
                    float var71 = var26[var66 + 7];
                    var26[var66 + 7] = var26[var67 + 7];
                    var26[var67 + 7] = var71;
                }
            }
            for (int var38 = 0; var38 < var23; var38++) {
                var26[var38] = var26[var38 * 2 + 1];
            }
            for (int var39 = 0; var39 < var25; var39++) {
                var26[var4 - var39 * 2 - 1] = var26[var39 * 4];
                var26[var4 - var39 * 2 - 2] = var26[var39 * 4 + 1];
                var26[var4 - var24 - var39 * 2 - 1] = var26[var39 * 4 + 2];
                var26[var4 - var24 - var39 * 2 - 2] = var26[var39 * 4 + 3];
            }
            for (int var40 = 0; var40 < var25; var40++) {
                float var57 = var31[var40 * 2];
                float var58 = var31[var40 * 2 + 1];
                float var59 = var26[var40 * 2 + var23];
                float var60 = var26[var40 * 2 + var23 + 1];
                float var61 = var26[var4 - var40 * 2 - 2];
                float var62 = var26[var4 - var40 * 2 - 1];
                float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
                var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
                var26[var4 - var40 * 2 - 2] = (var59 + var61 - var63) * 0.5F;
                float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
                var26[var40 * 2 + var23 + 1] = (var60 + var64 - var62) * 0.5F;
                var26[var4 - var40 * 2 - 1] = (var62 + var64 - var60) * 0.5F;
            }
            for (int var41 = 0; var41 < var24; var41++) {
                var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + var23 + 1];
                var26[var23 - var41 - 1] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + var23 + 1];
            }
            for (int var42 = 0; var42 < var24; var42++) {
                var26[var4 + var42 - var24] = -var26[var42];
            }
            for (int var43 = 0; var43 < var24; var43++) {
                var26[var43] = var26[var24 + var43];
            }
            for (int var44 = 0; var44 < var24; var44++) {
                var26[var24 + var44] = -var26[var24 - var44 - 1];
            }
            for (int var45 = 0; var45 < var24; var45++) {
                var26[var23 + var45] = var26[var4 - var45 - 1];
            }
            for (int var46 = var8; var46 < var9; var46++) {
                float var56 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field3610[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3610[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3600 > 0) {
            int var49 = this.field3600 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3598) {
                for (int var50 = 0; var50 < this.field3617; var50++) {
                    int var51 = (this.field3600 >> 1) + var50;
                    var48[var50] += this.field3601[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3610[var52];
                }
            }
        }
        float[] var54 = this.field3601;
        this.field3601 = field3610;
        field3610 = var54;
        this.field3600 = var4;
        this.field3617 = var12 - (var4 >> 1);
        this.field3598 = var17;
        return var48;
    }
}
