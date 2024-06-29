import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 extends class88 {

    @OriginalMember(owner = "client!ee", name = "F", descriptor = "Z")
    private static boolean field770 = false;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    private static int field761;

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
    private static int field780;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    private static int field781;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    private static int field784;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    private int field790;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "Z")
    private boolean field762;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "Z")
    private boolean field775;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "[B")
    private static byte[] field786;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "[B")
    private byte[] field792;

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "[F")
    private static float[] field766;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "[F")
    private static float[] field769;

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "[F")
    private float[] field772;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "[F")
    private static float[] field774;

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "[F")
    private static float[] field777;

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "[F")
    private static float[] field778;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "[F")
    private static float[] field789;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "[F")
    private static float[] field793;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "[I")
    private static int[] field767;

    @OriginalMember(owner = "client!ee", name = "G", descriptor = "[I")
    private static int[] field771;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "[I")
    private static int[] field783;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "[Lcb;")
    private static class17[] field776;

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "[Lf;")
    public static class36[] field773;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "[Lha;")
    private static class50[] field788;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "[Lkc;")
    private static class72[] field768;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "[Z")
    private static boolean[] field765;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "[[B")
    private byte[][] field782;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([B)V")
    private static final void method294(byte[] arg0) {
        method300(arg0, 0);
        field780 = 0x1 << method299(4);
        field781 = 0x1 << method299(4);
        field766 = new float[field781];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field780 : field781;
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
            int var25 = class112.method880(var17 - 1, (byte) 94);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class127.method1037(var25, 128, var26);
            }
            if (var1 == 0) {
                field793 = var18;
                field774 = var20;
                field789 = var22;
                field783 = var24;
            } else {
                field778 = var18;
                field777 = var20;
                field769 = var22;
                field767 = var24;
            }
        }
        int var2 = method299(8) + 1;
        field773 = new class36[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field773[var3] = new class36();
        }
        int var4 = method299(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method299(16);
        }
        int var6 = method299(6) + 1;
        field776 = new class17[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field776[var7] = new class17();
        }
        int var8 = method299(6) + 1;
        field788 = new class50[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field788[var9] = new class50();
        }
        int var10 = method299(6) + 1;
        field768 = new class72[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field768[var11] = new class72();
        }
        int var12 = method299(6) + 1;
        field765 = new boolean[var12];
        field771 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field765[var13] = method297() != 0;
            method299(16);
            method299(16);
            field771[var13] = method299(8);
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)F")
    public static final float method295(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([I)Lgf;")
    public final class48 method296(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field792 == null) {
            this.field763 = 0;
            this.field772 = new float[field781];
            this.field792 = new byte[this.field790];
            this.field791 = 0;
            this.field794 = 0;
        }
        while (this.field794 < this.field782.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method303(this.field794);
            if (var3 != null) {
                int var4 = this.field791;
                int var5 = var3.length;
                if (var5 > this.field790 - var4) {
                    var5 = this.field790 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field792[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field791;
                }
                this.field791 = var4;
            }
            this.field794++;
        }
        this.field772 = null;
        byte[] var2 = this.field792;
        this.field792 = null;
        return new class48(this.field785, var2, this.field779, this.field764, this.field762);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "()I")
    public static final int method297() {
        int var0 = field786[field784] >> field761 & 0x1;
        field761++;
        field784 += field761 >> 3;
        field761 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lmd;II)Lee;")
    public static final class34 method298(class87 arg0, int arg1, int arg2) {
        if (method301(arg0)) {
            byte[] var3 = arg0.method669(arg2, arg1, -97);
            return var3 == null ? null : new class34(var3);
        } else {
            arg0.method647(0, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)I")
    public static final int method299(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field761) {
            int var4 = 8 - field761;
            int var5 = (0x1 << var4) - 1;
            var1 += (field786[field784] >> field761 & var5) << var2;
            field761 = 0;
            field784++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field786[field784] >> field761 & var3) << var2;
            field761 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V")
    private static final void method300(byte[] arg0, int arg1) {
        field786 = arg0;
        field784 = arg1;
        field761 = 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lmd;)Z")
    private static final boolean method301(class87 arg0) {
        if (!field770) {
            byte[] var1 = arg0.method669(0, 0, -97);
            if (var1 == null) {
                return false;
            }
            method294(var1);
            field770 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "([B)V")
    private final void method302(byte[] arg0) {
        class127 var2 = new class127(arg0);
        this.field785 = var2.method986(-88);
        this.field790 = var2.method986(-93);
        this.field779 = var2.method986(111);
        this.field764 = var2.method986(21);
        if (this.field764 < 0) {
            this.field764 = ~this.field764;
            this.field762 = true;
        }
        int var3 = var2.method986(24);
        this.field782 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1011(40);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1016(var7, 4, 0, var5);
            this.field782[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)[F")
    private final float[] method303(int arg0) {
        method300(this.field782[arg0], 0);
        method297();
        int var2 = method299(class112.method880(field771.length - 1, (byte) 125));
        boolean var3 = field765[var2];
        int var4 = var3 ? field781 : field780;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method297() != 0;
            var6 = method297() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field780 >> 2);
            var9 = (field780 >> 2) + (var4 >> 2);
            var10 = field780 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field780 >> 2);
            var12 = (field780 >> 2) + (var4 - (var4 >> 2));
            var13 = field780 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class72 var14 = field768[field771[var2]];
        int var15 = var14.field1515;
        int var16 = var14.field1514[var15];
        boolean var17 = !field776[var16].method121();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1513; var19++) {
            class50 var95 = field788[var14.field1512[var19]];
            float[] var96 = field766;
            var95.method421(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1515;
            int var21 = var14.field1514[var20];
            field776[var21].method118(field766, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field766[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field766;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field778 : field793;
            float[] var30 = var3 ? field777 : field774;
            float[] var31 = var3 ? field769 : field789;
            int[] var32 = var3 ? field767 : field783;
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
            int var35 = class112.method880(var4 - 1, (byte) 93);
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
                field766[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field766[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field763 > 0) {
            int var49 = this.field763 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field775) {
                for (int var50 = 0; var50 < this.field787; var50++) {
                    int var51 = (this.field763 >> 1) + var50;
                    var48[var50] += this.field772[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field766[var52];
                }
            }
        }
        float[] var54 = this.field772;
        this.field772 = field766;
        field766 = var54;
        this.field763 = var4;
        this.field787 = var12 - (var4 >> 1);
        this.field775 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "()V")
    public static void method304() {
        field786 = null;
        field773 = null;
        field776 = null;
        field788 = null;
        field768 = null;
        field765 = null;
        field771 = null;
        field766 = null;
        field793 = null;
        field774 = null;
        field789 = null;
        field778 = null;
        field777 = null;
        field769 = null;
        field783 = null;
        field767 = null;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
    private class34(byte[] arg0) {
        this.method302(arg0);
    }
}
