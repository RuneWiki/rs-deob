import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class49 extends class254 {

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "Z")
    private static boolean field734 = false;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    private int field711;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    private static int field713;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    private static int field714;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    private int field716;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    private static int field719;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    private static int field721;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    private int field723;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    private int field738;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    private int field740;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Z")
    private boolean field717;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "Z")
    private boolean field727;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "[B")
    private static byte[] field720;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "[B")
    private byte[] field739;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "[F")
    private static float[] field715;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "[F")
    private static float[] field722;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "[F")
    private static float[] field726;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "[F")
    private static float[] field731;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "[F")
    private static float[] field733;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "[F")
    private float[] field735;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "[F")
    private static float[] field736;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "[F")
    private static float[] field741;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[I")
    private static int[] field709;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "[I")
    private static int[] field710;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "[I")
    private static int[] field737;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "[Lfg;")
    public static class186[] field728;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "[Lce;")
    private static class216[] field732;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[Leg;")
    private static class265[] field708;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[Lvh;")
    private static class44[] field725;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "[Z")
    private static boolean[] field718;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "[[B")
    private byte[][] field724;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)[F")
    private final float[] method329(int arg0) {
        method339(this.field724[arg0], 0);
        method338();
        int var2 = method330(class281.method1894(field710.length - 1, 1510318950));
        boolean var3 = field718[var2];
        int var4 = var3 ? field719 : field721;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method338() != 0;
            var6 = method338() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field721 >> 2);
            var9 = (field721 >> 2) + (var4 >> 2);
            var10 = field721 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field721 >> 2);
            var12 = (field721 >> 2) + (var4 - (var4 >> 2));
            var13 = field721 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class44 var14 = field725[field710[var2]];
        int var15 = var14.field631;
        int var16 = var14.field630[var15];
        boolean var17 = !field708[var16].method1764();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field628; var19++) {
            class216 var95 = field732[var14.field629[var19]];
            float[] var96 = field731;
            var95.method1386(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field631;
            int var21 = var14.field630[var20];
            field708[var21].method1758(field731, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field731[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field731;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field733 : field741;
            float[] var30 = var3 ? field726 : field722;
            float[] var31 = var3 ? field715 : field736;
            int[] var32 = var3 ? field709 : field737;
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
            int var35 = class281.method1894(var4 - 1, 1510318950);
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
                field731[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field731[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field723 > 0) {
            int var49 = this.field723 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field727) {
                for (int var50 = 0; var50 < this.field711; var50++) {
                    int var51 = (this.field723 >> 1) + var50;
                    var48[var50] += this.field735[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field731[var52];
                }
            }
        }
        float[] var54 = this.field735;
        this.field735 = field731;
        field731 = var54;
        this.field723 = var4;
        this.field711 = var12 - (var4 >> 1);
        this.field727 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I")
    public static final int method330(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field713) {
            int var4 = 8 - field713;
            int var5 = (0x1 << var4) - 1;
            var1 += (field720[field714] >> field713 & var5) << var2;
            field713 = 0;
            field714++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field720[field714] >> field713 & var3) << var2;
            field713 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([B)V")
    private static final void method331(byte[] arg0) {
        method339(arg0, 0);
        field721 = 0x1 << method330(4);
        field719 = 0x1 << method330(4);
        field731 = new float[field719];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field721 : field719;
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
            int var25 = class281.method1894(var17 - 1, 1510318950);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class245.method1606(var25, false, var26);
            }
            if (var1 == 0) {
                field741 = var18;
                field722 = var20;
                field736 = var22;
                field737 = var24;
            } else {
                field733 = var18;
                field726 = var20;
                field715 = var22;
                field709 = var24;
            }
        }
        int var2 = method330(8) + 1;
        field728 = new class186[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field728[var3] = new class186();
        }
        int var4 = method330(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method330(16);
        }
        int var6 = method330(6) + 1;
        field708 = new class265[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field708[var7] = new class265();
        }
        int var8 = method330(6) + 1;
        field732 = new class216[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field732[var9] = new class216();
        }
        int var10 = method330(6) + 1;
        field725 = new class44[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field725[var11] = new class44();
        }
        int var12 = method330(6) + 1;
        field718 = new boolean[var12];
        field710 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field718[var13] = method338() != 0;
            method330(16);
            method330(16);
            field710[var13] = method330(8);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lve;II)Lwf;")
    public static final class49 method332(class233 arg0, int arg1, int arg2) {
        if (method337(arg0)) {
            byte[] var3 = arg0.method1538(arg1, arg2, (byte) 102);
            return var3 == null ? null : new class49(var3);
        } else {
            arg0.method1520(false, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([I)Lml;")
    public final class116 method333(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field739 == null) {
            this.field723 = 0;
            this.field735 = new float[field719];
            this.field739 = new byte[this.field729];
            this.field738 = 0;
            this.field740 = 0;
        }
        while (this.field740 < this.field724.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method329(this.field740);
            if (var3 != null) {
                int var4 = this.field738;
                int var5 = var3.length;
                if (var5 > this.field729 - var4) {
                    var5 = this.field729 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field739[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field738;
                }
                this.field738 = var4;
            }
            this.field740++;
        }
        this.field735 = null;
        byte[] var2 = this.field739;
        this.field739 = null;
        return new class116(this.field712, var2, this.field716, this.field730, this.field717);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "([B)V")
    private final void method334(byte[] arg0) {
        class114 var2 = new class114(arg0);
        this.field712 = var2.method759((byte) 97);
        this.field729 = var2.method759((byte) 97);
        this.field716 = var2.method759((byte) 111);
        this.field730 = var2.method759((byte) 111);
        if (this.field730 < 0) {
            this.field730 = ~this.field730;
            this.field717 = true;
        }
        int var3 = var2.method759((byte) 97);
        this.field724 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method760(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method758(var7, var5, (byte) 124, 0);
            this.field724[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
    public static void method335() {
        field720 = null;
        field728 = null;
        field708 = null;
        field732 = null;
        field725 = null;
        field718 = null;
        field710 = null;
        field731 = null;
        field741 = null;
        field722 = null;
        field736 = null;
        field733 = null;
        field726 = null;
        field715 = null;
        field737 = null;
        field709 = null;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)F")
    public static final float method336(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "([B)V")
    private class49(byte[] arg0) {
        this.method334(arg0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lve;)Z")
    private static final boolean method337(class233 arg0) {
        if (!field734) {
            byte[] var1 = arg0.method1538(0, 0, (byte) 58);
            if (var1 == null) {
                return false;
            }
            method331(var1);
            field734 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()I")
    public static final int method338() {
        int var0 = field720[field714] >> field713 & 0x1;
        field713++;
        field714 += field713 >> 3;
        field713 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([BI)V")
    private static final void method339(byte[] arg0, int arg1) {
        field720 = arg0;
        field714 = arg1;
        field713 = 0;
    }
}
