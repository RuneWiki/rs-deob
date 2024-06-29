import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class9 extends class147 {

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "Z")
    private static boolean field79 = false;

    @OriginalMember(owner = "client!fp", name = "V", descriptor = "I")
    private int field100;

    @OriginalMember(owner = "client!fp", name = "W", descriptor = "I")
    private int field101;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    private int field73;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
    private static int field89;

    @OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
    private static int field94;

    @OriginalMember(owner = "client!fp", name = "R", descriptor = "I")
    private static int field96;

    @OriginalMember(owner = "client!fp", name = "S", descriptor = "I")
    private static int field97;

    @OriginalMember(owner = "client!fp", name = "U", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "Z")
    private boolean field82;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "Z")
    private boolean field83;

    @OriginalMember(owner = "client!fp", name = "X", descriptor = "[B")
    private byte[] field102;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "[B")
    private static byte[] field85;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "[F")
    private static float[] field69;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "[F")
    private static float[] field70;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "[F")
    private static float[] field74;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "[F")
    private float[] field77;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "[F")
    private static float[] field78;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "[F")
    private static float[] field92;

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "[F")
    private static float[] field93;

    @OriginalMember(owner = "client!fp", name = "T", descriptor = "[F")
    private static float[] field98;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "[I")
    private static int[] field81;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "[I")
    private static int[] field86;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "[I")
    private static int[] field91;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "[Lb;")
    private static class132[] field72;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "[Lcn;")
    private static class446[] field90;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "[Liu;")
    public static class469[] field88;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "[Luc;")
    private static class65[] field75;

    @OriginalMember(owner = "client!fp", name = "Q", descriptor = "[Z")
    private static boolean[] field95;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "[[B")
    private byte[][] field80;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)[F")
    private final float[] method58(int arg0) {
        method67(this.field80[arg0], 0);
        method65();
        int var2 = method62(class51.method273(false, field86.length - 1));
        boolean var3 = field95[var2];
        int var4 = var3 ? field94 : field89;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method65() != 0;
            var6 = method65() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field89 >> 2);
            var9 = (field89 >> 2) + (var4 >> 2);
            var10 = field89 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field89 >> 2);
            var12 = (field89 >> 2) + (var4 - (var4 >> 2));
            var13 = field89 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class446 var14 = field90[field86[var2]];
        int var15 = var14.field6342;
        int var16 = var14.field6343[var15];
        boolean var17 = !field72[var16].method626();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6340; var19++) {
            class65 var95 = field75[var14.field6341[var19]];
            float[] var96 = field69;
            var95.method336(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6342;
            int var21 = var14.field6343[var20];
            field72[var21].method630(field69, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field69[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field69;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field70 : field78;
            float[] var30 = var3 ? field74 : field93;
            float[] var31 = var3 ? field98 : field92;
            int[] var32 = var3 ? field81 : field91;
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
            int var35 = class51.method273(false, var4 - 1);
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
                field69[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field69[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field87 > 0) {
            int var49 = this.field87 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field83) {
                for (int var50 = 0; var50 < this.field71; var50++) {
                    int var51 = (this.field87 >> 1) + var50;
                    var48[var50] += this.field77[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field69[var52];
                }
            }
        }
        float[] var54 = this.field77;
        this.field77 = field69;
        field69 = var54;
        this.field87 = var4;
        this.field71 = var12 - (var4 >> 1);
        this.field83 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "()V")
    public static void method59() {
        field85 = null;
        field88 = null;
        field72 = null;
        field75 = null;
        field90 = null;
        field95 = null;
        field86 = null;
        field69 = null;
        field78 = null;
        field93 = null;
        field92 = null;
        field70 = null;
        field74 = null;
        field98 = null;
        field91 = null;
        field81 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([B)V")
    private static final void method60(byte[] arg0) {
        method67(arg0, 0);
        field89 = 0x1 << method62(4);
        field94 = 0x1 << method62(4);
        field69 = new float[field94];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field89 : field94;
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
            int var25 = class51.method273(false, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class204.method1113(var26, var25, (byte) -123);
            }
            if (var1 == 0) {
                field78 = var18;
                field93 = var20;
                field92 = var22;
                field91 = var24;
            } else {
                field70 = var18;
                field74 = var20;
                field98 = var22;
                field81 = var24;
            }
        }
        int var2 = method62(8) + 1;
        field88 = new class469[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field88[var3] = new class469();
        }
        int var4 = method62(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method62(16);
        }
        int var6 = method62(6) + 1;
        field72 = new class132[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field72[var7] = new class132();
        }
        int var8 = method62(6) + 1;
        field75 = new class65[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field75[var9] = new class65();
        }
        int var10 = method62(6) + 1;
        field90 = new class446[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field90[var11] = new class446();
        }
        int var12 = method62(6) + 1;
        field95 = new boolean[var12];
        field86 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field95[var13] = method65() != 0;
            method62(16);
            method62(16);
            field86[var13] = method62(8);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([I)Ljk;")
    public final class436 method61(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field102 == null) {
            this.field87 = 0;
            this.field77 = new float[field94];
            this.field102 = new byte[this.field73];
            this.field101 = 0;
            this.field100 = 0;
        }
        while (this.field100 < this.field80.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method58(this.field100);
            if (var3 != null) {
                int var4 = this.field101;
                int var5 = var3.length;
                if (var5 > this.field73 - var4) {
                    var5 = this.field73 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field102[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field101;
                }
                this.field101 = var4;
            }
            this.field100++;
        }
        this.field77 = null;
        byte[] var2 = this.field102;
        this.field102 = null;
        return new class436(this.field99, var2, this.field84, this.field76, this.field82);
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)I")
    public static final int method62(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field96) {
            int var4 = 8 - field96;
            int var5 = (0x1 << var4) - 1;
            var1 += (field85[field97] >> field96 & var5) << var2;
            field96 = 0;
            field97++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field85[field97] >> field96 & var3) << var2;
            field96 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lg;)Z")
    private static final boolean method63(class470 arg0) {
        if (!field79) {
            byte[] var1 = arg0.method2768(-20472, 0, 0);
            if (var1 == null) {
                return false;
            }
            method60(var1);
            field79 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lg;II)Lfp;")
    public static final class9 method64(class470 arg0, int arg1, int arg2) {
        if (method63(arg0)) {
            byte[] var3 = arg0.method2768(-20472, arg2, arg1);
            return var3 == null ? null : new class9(var3);
        } else {
            arg0.method2749(arg2, 18406, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "()I")
    public static final int method65() {
        int var0 = field85[field97] >> field96 & 0x1;
        field96++;
        field97 += field96 >> 3;
        field96 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)F")
    public static final float method66(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([BI)V")
    private static final void method67(byte[] arg0, int arg1) {
        field85 = arg0;
        field97 = arg1;
        field96 = 0;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "([B)V")
    private final void method68(byte[] arg0) {
        class179 var2 = new class179(arg0);
        this.field99 = var2.method939((byte) 125);
        this.field73 = var2.method939((byte) -109);
        this.field84 = var2.method939((byte) 111);
        this.field76 = var2.method939((byte) -61);
        if (this.field76 < 0) {
            this.field76 = ~this.field76;
            this.field82 = true;
        }
        int var3 = var2.method939((byte) -94);
        this.field80 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method895((byte) -118);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method919(false, var7, var5, 0);
            this.field80[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "([B)V")
    private class9(byte[] arg0) {
        this.method68(arg0);
    }
}
