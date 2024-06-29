import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class213 extends class125 {

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "Z")
    private static boolean field3679 = false;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    private static int field3682;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    private int field3687;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    private int field3688;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    private static int field3693;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    private int field3694;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    private int field3698;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    private int field3699;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    private static int field3702;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    private static int field3704;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    private int field3708;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "Z")
    private boolean field3683;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "Z")
    private boolean field3700;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "[B")
    private static byte[] field3681;

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "[B")
    private byte[] field3711;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "[F")
    private float[] field3684;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "[F")
    private static float[] field3685;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "[F")
    private static float[] field3686;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "[F")
    private static float[] field3695;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "[F")
    private static float[] field3696;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "[F")
    private static float[] field3701;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "[F")
    private static float[] field3705;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "[F")
    private static float[] field3707;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "[I")
    private static int[] field3690;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "[I")
    private static int[] field3697;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "[I")
    private static int[] field3709;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "[Ldg;")
    private static class140[] field3703;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "[Lib;")
    private static class154[] field3692;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "[Lal;")
    public static class233[] field3689;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "[Lmg;")
    private static class266[] field3691;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "[Z")
    private static boolean[] field3678;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "[[B")
    private byte[][] field3680;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)F")
    public static final float method1423(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)I")
    public static final int method1424(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3693) {
            int var4 = 8 - field3693;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3681[field3682] >> field3693 & var5) << var2;
            field3693 = 0;
            field3682++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3681[field3682] >> field3693 & var3) << var2;
            field3693 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "()V")
    public static void method1425() {
        field3681 = null;
        field3689 = null;
        field3692 = null;
        field3691 = null;
        field3703 = null;
        field3678 = null;
        field3697 = null;
        field3685 = null;
        field3707 = null;
        field3686 = null;
        field3701 = null;
        field3695 = null;
        field3696 = null;
        field3705 = null;
        field3690 = null;
        field3709 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([BI)V")
    private static final void method1426(byte[] arg0, int arg1) {
        field3681 = arg0;
        field3682 = arg1;
        field3693 = 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ltg;)Z")
    private static final boolean method1427(class182 arg0) {
        if (!field3679) {
            byte[] var1 = arg0.method1242(0, 0, 6801);
            if (var1 == null) {
                return false;
            }
            method1429(var1);
            field3679 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([B)V")
    private final void method1428(byte[] arg0) {
        class261 var2 = new class261(arg0);
        this.field3688 = var2.method1712(-4);
        this.field3698 = var2.method1712(-4);
        this.field3694 = var2.method1712(-4);
        this.field3706 = var2.method1712(-4);
        if (this.field3706 < 0) {
            this.field3706 = ~this.field3706;
            this.field3700 = true;
        }
        int var3 = var2.method1712(-4);
        this.field3680 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1693((byte) -127);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1698(var7, var5, -6215, 0);
            this.field3680[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "([B)V")
    private static final void method1429(byte[] arg0) {
        method1426(arg0, 0);
        field3704 = 0x1 << method1424(4);
        field3702 = 0x1 << method1424(4);
        field3685 = new float[field3702];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3704 : field3702;
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
            int var25 = class86.method585(0, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class199.method1339(-94, var25, var26);
            }
            if (var1 == 0) {
                field3707 = var18;
                field3686 = var20;
                field3701 = var22;
                field3690 = var24;
            } else {
                field3695 = var18;
                field3696 = var20;
                field3705 = var22;
                field3709 = var24;
            }
        }
        int var2 = method1424(8) + 1;
        field3689 = new class233[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3689[var3] = new class233();
        }
        int var4 = method1424(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1424(16);
        }
        int var6 = method1424(6) + 1;
        field3692 = new class154[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3692[var7] = new class154();
        }
        int var8 = method1424(6) + 1;
        field3691 = new class266[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3691[var9] = new class266();
        }
        int var10 = method1424(6) + 1;
        field3703 = new class140[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3703[var11] = new class140();
        }
        int var12 = method1424(6) + 1;
        field3678 = new boolean[var12];
        field3697 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3678[var13] = method1431() != 0;
            method1424(16);
            method1424(16);
            field3697[var13] = method1424(8);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "([I)Ltd;")
    public final class72 method1430(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3711 == null) {
            this.field3687 = 0;
            this.field3684 = new float[field3702];
            this.field3711 = new byte[this.field3698];
            this.field3710 = 0;
            this.field3708 = 0;
        }
        while (this.field3708 < this.field3680.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1433(this.field3708);
            if (var3 != null) {
                int var4 = this.field3710;
                int var5 = var3.length;
                if (var5 > this.field3698 - var4) {
                    var5 = this.field3698 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3711[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3710;
                }
                this.field3710 = var4;
            }
            this.field3708++;
        }
        this.field3684 = null;
        byte[] var2 = this.field3711;
        this.field3711 = null;
        return new class72(this.field3688, var2, this.field3694, this.field3706, this.field3700);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "()I")
    public static final int method1431() {
        int var0 = field3681[field3682] >> field3693 & 0x1;
        field3693++;
        field3682 += field3693 >> 3;
        field3693 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ltg;II)Llf;")
    public static final class213 method1432(class182 arg0, int arg1, int arg2) {
        if (method1427(arg0)) {
            byte[] var3 = arg0.method1242(arg2, arg1, 6801);
            return var3 == null ? null : new class213(var3);
        } else {
            arg0.method1239(arg1, (byte) -119, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "([B)V")
    private class213(byte[] arg0) {
        this.method1428(arg0);
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)[F")
    private final float[] method1433(int arg0) {
        method1426(this.field3680[arg0], 0);
        method1431();
        int var2 = method1424(class86.method585(0, field3697.length - 1));
        boolean var3 = field3678[var2];
        int var4 = var3 ? field3702 : field3704;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1431() != 0;
            var6 = method1431() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3704 >> 2);
            var9 = (field3704 >> 2) + (var4 >> 2);
            var10 = field3704 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3704 >> 2);
            var12 = (field3704 >> 2) + (var4 - (var4 >> 2));
            var13 = field3704 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class140 var14 = field3703[field3697[var2]];
        int var15 = var14.field2475;
        int var16 = var14.field2473[var15];
        boolean var17 = !field3692[var16].method1036();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2476; var19++) {
            class266 var95 = field3691[var14.field2474[var19]];
            float[] var96 = field3685;
            var95.method1768(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2475;
            int var21 = var14.field2473[var20];
            field3692[var21].method1032(field3685, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3685[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3685;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3695 : field3707;
            float[] var30 = var3 ? field3696 : field3686;
            float[] var31 = var3 ? field3705 : field3701;
            int[] var32 = var3 ? field3709 : field3690;
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
            int var35 = class86.method585(0, var4 - 1);
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
                field3685[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3685[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3687 > 0) {
            int var49 = this.field3687 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3683) {
                for (int var50 = 0; var50 < this.field3699; var50++) {
                    int var51 = (this.field3687 >> 1) + var50;
                    var48[var50] += this.field3684[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3685[var52];
                }
            }
        }
        float[] var54 = this.field3684;
        this.field3684 = field3685;
        field3685 = var54;
        this.field3687 = var4;
        this.field3699 = var12 - (var4 >> 1);
        this.field3683 = var17;
        return var48;
    }
}
