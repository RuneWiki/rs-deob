import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class29 extends class171 {

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "Z")
    private static boolean field504 = false;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    private static int field494;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    private static int field500;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    private static int field503;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    private static int field507;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    private int field511;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    private int field515;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!nl", name = "W", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!nl", name = "Y", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Z")
    private boolean field499;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "Z")
    private boolean field513;

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "[B")
    private static byte[] field520;

    @OriginalMember(owner = "client!nl", name = "Z", descriptor = "[B")
    private byte[] field526;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "[F")
    private static float[] field497;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "[F")
    private static float[] field498;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "[F")
    private static float[] field501;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "[F")
    private static float[] field506;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "[F")
    private static float[] field508;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "[F")
    private float[] field519;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "[F")
    private static float[] field521;

    @OriginalMember(owner = "client!nl", name = "V", descriptor = "[F")
    private static float[] field522;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "[I")
    private static int[] field495;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "[I")
    private static int[] field505;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "[I")
    private static int[] field517;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "[Lnk;")
    public static class12[] field496;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "[Lql;")
    private static class16[] field512;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "[Lod;")
    private static class24[] field493;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "[Lgk;")
    private static class6[] field514;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "[Z")
    private static boolean[] field502;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "[[B")
    private byte[][] field510;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Loh;)Z", line = 3)
    private static final boolean method184(class15 arg0) {
        if (!field504) {
            byte[] var1 = arg0.method92(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method191(var1);
            field504 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([BI)V", line = 18)
    private static final void method185(byte[] arg0, int arg1) {
        field520 = arg0;
        field500 = arg1;
        field494 = 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()I", line = 31)
    public static final int method186() {
        int var0 = field520[field500] >> field494 & 0x1;
        field494++;
        field500 += field494 >> 3;
        field494 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([I)Lid;", line = 40)
    public final class253 method187(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field526 == null) {
            this.field515 = 0;
            this.field519 = new float[field507];
            this.field526 = new byte[this.field509];
            this.field525 = 0;
            this.field524 = 0;
        }
        while (this.field524 < this.field510.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method190(this.field524);
            if (var2 != null) {
                int var3 = this.field525;
                int var4 = var2.length;
                if (var4 > this.field509 - var3) {
                    var4 = this.field509 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field526[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field525;
                }
                this.field525 = var3;
            }
            this.field524++;
        }
        this.field519 = null;
        byte[] var7 = this.field526;
        this.field526 = null;
        return new class253(this.field518, var7, this.field511, this.field523, this.field499);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V", line = 100)
    public static void method188() {
        field520 = null;
        field496 = null;
        field512 = null;
        field514 = null;
        field493 = null;
        field502 = null;
        field495 = null;
        field506 = null;
        field498 = null;
        field522 = null;
        field497 = null;
        field501 = null;
        field521 = null;
        field508 = null;
        field505 = null;
        field517 = null;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)I", line = 120)
    public static final int method189(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field494) {
            int var3 = 8 - field494;
            int var4 = (0x1 << var3) - 1;
            var1 += (field520[field500] >> field494 & var4) << var2;
            field494 = 0;
            field500++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field520[field500] >> field494 & var5) << var2;
            field494 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)[F", line = 147)
    private final float[] method190(int arg0) {
        method185(this.field510[arg0], 0);
        method186();
        int var2 = method189(class242.method1753((byte) -98, field495.length - 1));
        boolean var3 = field502[var2];
        int var4 = var3 ? field507 : field503;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method186() != 0;
            var6 = method186() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field503 >> 2);
            var9 = (field503 >> 2) + (var4 >> 2);
            var10 = field503 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field503 >> 2);
            var12 = (field503 >> 2) + (var4 - (var4 >> 2));
            var13 = field503 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class24 var14 = field493[field495[var2]];
        int var15 = var14.field436;
        int var16 = var14.field434[var15];
        boolean var17 = !field512[var16].method127();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field435; var19++) {
            class6 var20 = field514[var14.field433[var19]];
            float[] var21 = field506;
            var20.method37(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field436;
            int var23 = var14.field434[var22];
            field512[var23].method126(field506, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field506[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field506;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field501 : field498;
            float[] var32 = var3 ? field521 : field522;
            float[] var33 = var3 ? field508 : field497;
            int[] var34 = var3 ? field517 : field505;
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
            int var47 = class242.method1753((byte) 98, var4 - 1);
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
                field506[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field506[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field515 > 0) {
            int var91 = this.field515 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field513) {
                for (int var92 = 0; var92 < this.field516; var92++) {
                    int var93 = (this.field515 >> 1) + var92;
                    var90[var92] += this.field519[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field506[var94];
                }
            }
        }
        float[] var96 = this.field519;
        this.field519 = field506;
        field506 = var96;
        this.field515 = var4;
        this.field516 = var12 - (var4 >> 1);
        this.field513 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([B)V", line = 563)
    private static final void method191(byte[] arg0) {
        method185(arg0, 0);
        field503 = 0x1 << method189(4);
        field507 = 0x1 << method189(4);
        field506 = new float[field507];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field503 : field507;
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
            int var13 = class242.method1753((byte) -110, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class80.method572(var14, var13, 14930);
            }
            if (var1 == 0) {
                field498 = var6;
                field522 = var8;
                field497 = var10;
                field505 = var12;
            } else {
                field501 = var6;
                field521 = var8;
                field508 = var10;
                field517 = var12;
            }
        }
        int var15 = method189(8) + 1;
        field496 = new class12[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field496[var16] = new class12();
        }
        int var17 = method189(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method189(16);
        }
        int var19 = method189(6) + 1;
        field512 = new class16[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field512[var20] = new class16();
        }
        int var21 = method189(6) + 1;
        field514 = new class6[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field514[var22] = new class6();
        }
        int var23 = method189(6) + 1;
        field493 = new class24[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field493[var24] = new class24();
        }
        int var25 = method189(6) + 1;
        field502 = new boolean[var25];
        field495 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field502[var26] = method186() != 0;
            method189(16);
            method189(16);
            field495[var26] = method189(8);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "([B)V", line = 724)
    private final void method192(byte[] arg0) {
        class47 var2 = new class47(arg0);
        this.field518 = var2.method373((byte) 36);
        this.field509 = var2.method373((byte) 36);
        this.field511 = var2.method373((byte) 36);
        this.field523 = var2.method373((byte) 36);
        if (this.field523 < 0) {
            this.field523 = ~this.field523;
            this.field499 = true;
        }
        int var3 = var2.method373((byte) 36);
        this.field510 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method368(121);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method363(true, var7, 0, var5);
            this.field510[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)F", line = 773)
    public static final float method193(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Loh;II)Lnl;", line = 786)
    public static final class29 method194(class15 arg0, int arg1, int arg2) {
        if (method184(arg0)) {
            byte[] var3 = arg0.method92(arg1, 0, arg2);
            return var3 == null ? null : new class29(var3);
        } else {
            arg0.method93(arg2, arg1, false);
            return null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([B)V", line = 803)
    private class29(byte[] arg0) {
        this.method192(arg0);
    }
}
