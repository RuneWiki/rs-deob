import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class52 extends class208 {

    @OriginalMember(owner = "client!il", name = "O", descriptor = "Z")
    private static boolean field810 = false;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    private static int field784;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    private static int field786;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    private static int field794;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    private int field800;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    private static int field801;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    private int field809;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "Z")
    private boolean field797;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "Z")
    private boolean field805;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "[B")
    private static byte[] field806;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "[B")
    private byte[] field813;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "[F")
    private float[] field781;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "[F")
    private static float[] field787;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[F")
    private static float[] field792;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "[F")
    private static float[] field795;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "[F")
    private static float[] field799;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "[F")
    private static float[] field803;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "[F")
    private static float[] field808;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "[F")
    private static float[] field812;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "[I")
    private static int[] field790;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "[I")
    private static int[] field793;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "[I")
    private static int[] field807;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "[Lvc;")
    private static class180[] field804;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[Lii;")
    public static class202[] field785;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "[Lck;")
    private static class226[] field782;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "[Ljb;")
    private static class27[] field798;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "[Z")
    private static boolean[] field789;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[[B")
    private byte[][] field796;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([BI)V", line = 3)
    private static final void method308(byte[] arg0, int arg1) {
        field806 = arg0;
        field801 = arg1;
        field794 = 0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lrg;II)Lil;", line = 15)
    public static final class52 method309(class88 arg0, int arg1, int arg2) {
        if (method314(arg0)) {
            byte[] var3 = arg0.method636(arg1, (byte) 94, arg2);
            return var3 == null ? null : new class52(var3);
        } else {
            arg0.method625(arg1, arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)[F", line = 35)
    private final float[] method310(int arg0) {
        method308(this.field796[arg0], 0);
        method318();
        int var2 = method315(class127.method944(field807.length - 1, (byte) -37));
        boolean var3 = field789[var2];
        int var4 = var3 ? field784 : field786;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method318() != 0;
            var6 = method318() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field786 >> 2);
            var9 = (field786 >> 2) + (var4 >> 2);
            var10 = field786 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field786 >> 2);
            var12 = (field786 >> 2) + (var4 - (var4 >> 2));
            var13 = field786 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class226 var14 = field782[field807[var2]];
        int var15 = var14.field3773;
        int var16 = var14.field3772[var15];
        boolean var17 = !field798[var16].method146();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3771; var19++) {
            class180 var20 = field804[var14.field3770[var19]];
            float[] var21 = field795;
            var20.method1268(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3773;
            int var23 = var14.field3772[var22];
            field798[var23].method144(field795, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field795[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field795;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field808 : field803;
            float[] var32 = var3 ? field799 : field792;
            float[] var33 = var3 ? field812 : field787;
            int[] var34 = var3 ? field793 : field790;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class127.method944(var4 - 1, (byte) -120);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field795[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field795[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field791 > 0) {
            int var91 = this.field791 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field805) {
                for (int var92 = 0; var92 < this.field809; var92++) {
                    int var93 = (this.field791 >> 1) + var92;
                    var90[var92] += this.field781[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field795[var94];
                }
            }
        }
        float[] var96 = this.field781;
        this.field781 = field795;
        field795 = var96;
        this.field791 = var4;
        this.field809 = var12 - (var4 >> 1);
        this.field805 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V", line = 447)
    public static void method311() {
        field806 = null;
        field785 = null;
        field798 = null;
        field804 = null;
        field782 = null;
        field789 = null;
        field807 = null;
        field795 = null;
        field803 = null;
        field792 = null;
        field787 = null;
        field808 = null;
        field799 = null;
        field812 = null;
        field790 = null;
        field793 = null;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)F", line = 469)
    public static final float method312(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([B)V", line = 481)
    private final void method313(byte[] arg0) {
        class70 var2 = new class70(arg0);
        this.field802 = var2.method469(78);
        this.field800 = var2.method469(124);
        this.field788 = var2.method469(127);
        this.field783 = var2.method469(118);
        if (this.field783 < 0) {
            this.field783 = ~this.field783;
            this.field797 = true;
        }
        int var3 = var2.method469(123);
        this.field796 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method481(0);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method447(var7, -125, var5, 0);
            this.field796[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lrg;)Z", line = 530)
    private static final boolean method314(class88 arg0) {
        if (!field810) {
            byte[] var1 = arg0.method636(0, (byte) 82, 0);
            if (var1 == null) {
                return false;
            }
            method316(var1);
            field810 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)I", line = 547)
    public static final int method315(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field794) {
            int var3 = 8 - field794;
            int var4 = (0x1 << var3) - 1;
            var1 += (field806[field801] >> field794 & var4) << var2;
            field794 = 0;
            field801++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field806[field801] >> field794 & var5) << var2;
            field794 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "([B)V", line = 574)
    private static final void method316(byte[] arg0) {
        method308(arg0, 0);
        field786 = 0x1 << method315(4);
        field784 = 0x1 << method315(4);
        field795 = new float[field784];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field786 : field784;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class127.method944(var5 - 1, (byte) -88);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class148.method1095(var14, var13, 255);
            }
            if (var1 == 0) {
                field803 = var6;
                field792 = var8;
                field787 = var10;
                field790 = var12;
            } else {
                field808 = var6;
                field799 = var8;
                field812 = var10;
                field793 = var12;
            }
        }
        int var15 = method315(8) + 1;
        field785 = new class202[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field785[var16] = new class202();
        }
        int var17 = method315(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method315(16);
        }
        int var19 = method315(6) + 1;
        field798 = new class27[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field798[var20] = new class27();
        }
        int var21 = method315(6) + 1;
        field804 = new class180[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field804[var22] = new class180();
        }
        int var23 = method315(6) + 1;
        field782 = new class226[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field782[var24] = new class226();
        }
        int var25 = method315(6) + 1;
        field789 = new boolean[var25];
        field807 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field789[var26] = method318() != 0;
            method315(16);
            method315(16);
            field807[var26] = method315(8);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([I)Lmi;", line = 725)
    public final class257 method317(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field813 == null) {
            this.field791 = 0;
            this.field781 = new float[field784];
            this.field813 = new byte[this.field800];
            this.field811 = 0;
            this.field814 = 0;
        }
        while (this.field814 < this.field796.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method310(this.field814);
            if (var2 != null) {
                int var3 = this.field811;
                int var4 = var2.length;
                if (var4 > this.field800 - var3) {
                    var4 = this.field800 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field813[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field811;
                }
                this.field811 = var3;
            }
            this.field814++;
        }
        this.field781 = null;
        byte[] var7 = this.field813;
        this.field813 = null;
        return new class257(this.field802, var7, this.field788, this.field783, this.field797);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()I", line = 791)
    public static final int method318() {
        int var0 = field806[field801] >> field794 & 0x1;
        field794++;
        field801 += field794 >> 3;
        field794 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "([B)V", line = 799)
    private class52(byte[] arg0) {
        this.method313(arg0);
    }
}
