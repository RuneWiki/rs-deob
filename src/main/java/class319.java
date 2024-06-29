import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class319 extends class406 {

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "Z")
    private static boolean field4524 = false;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    private static int field4523;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    private static int field4526;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    private int field4538;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    private static int field4539;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    private int field4541;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    private int field4542;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    private int field4545;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    private int field4548;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    private int field4550;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    private int field4552;

    @OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
    private int field4554;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
    private static int field4555;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "Z")
    private boolean field4543;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "Z")
    private boolean field4546;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "[B")
    private static byte[] field4532;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "[B")
    private byte[] field4553;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "[F")
    private static float[] field4522;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "[F")
    private static float[] field4528;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "[F")
    private static float[] field4529;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "[F")
    private static float[] field4530;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "[F")
    private static float[] field4531;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "[F")
    private static float[] field4536;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "[F")
    private static float[] field4537;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "[F")
    private float[] field4544;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "[I")
    private static int[] field4527;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "[I")
    private static int[] field4540;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "[I")
    private static int[] field4549;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "[Ltb;")
    private static class226[] field4533;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "[Lur;")
    private static class317[] field4525;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "[Lpe;")
    private static class364[] field4547;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "[Lki;")
    public static class424[] field4534;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "[Z")
    private static boolean[] field4535;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "[[B")
    private byte[][] field4551;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ltq;II)Lvi;")
    public static final class319 method2085(class376 arg0, int arg1, int arg2) {
        if (method2089(arg0)) {
            byte[] var3 = arg0.method2431((byte) 81, arg1, arg2);
            return var3 == null ? null : new class319(var3);
        } else {
            arg0.method2426(false, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([B)V")
    private final void method2086(byte[] arg0) {
        class236 var2 = new class236(arg0);
        this.field4550 = var2.method1597(3641);
        this.field4545 = var2.method1597(3641);
        this.field4548 = var2.method1597(3641);
        this.field4542 = var2.method1597(3641);
        if (this.field4542 < 0) {
            this.field4542 = ~this.field4542;
            this.field4546 = true;
        }
        int var3 = var2.method1597(3641);
        this.field4551 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1574(-85);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1570(var7, var5, 0, -1);
            this.field4551[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)[F")
    private final float[] method2087(int arg0) {
        method2090(this.field4551[arg0], 0);
        method2093();
        int var2 = method2091(class161.method1033(field4549.length - 1, -257));
        boolean var3 = field4535[var2];
        int var4 = var3 ? field4539 : field4523;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2093() != 0;
            var6 = method2093() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4523 >> 2);
            var9 = (field4523 >> 2) + (var4 >> 2);
            var10 = field4523 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4523 >> 2);
            var12 = (field4523 >> 2) + (var4 - (var4 >> 2));
            var13 = field4523 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class364 var14 = field4547[field4549[var2]];
        int var15 = var14.field5176;
        int var16 = var14.field5178[var15];
        boolean var17 = !field4533[var16].method1512();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5177; var19++) {
            class317 var95 = field4525[var14.field5175[var19]];
            float[] var96 = field4537;
            var95.method2079(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5176;
            int var21 = var14.field5178[var20];
            field4533[var21].method1515(field4537, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4537[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4537;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4522 : field4536;
            float[] var30 = var3 ? field4530 : field4529;
            float[] var31 = var3 ? field4528 : field4531;
            int[] var32 = var3 ? field4527 : field4540;
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
            int var35 = class161.method1033(var4 - 1, -257);
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
                field4537[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4537[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4538 > 0) {
            int var49 = this.field4538 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4543) {
                for (int var50 = 0; var50 < this.field4541; var50++) {
                    int var51 = (this.field4538 >> 1) + var50;
                    var48[var50] += this.field4544[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4537[var52];
                }
            }
        }
        float[] var54 = this.field4544;
        this.field4544 = field4537;
        field4537 = var54;
        this.field4538 = var4;
        this.field4541 = var12 - (var4 >> 1);
        this.field4543 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)F")
    public static final float method2088(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ltq;)Z")
    private static final boolean method2089(class376 arg0) {
        if (!field4524) {
            byte[] var1 = arg0.method2431((byte) 107, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2092(var1);
            field4524 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([BI)V")
    private static final void method2090(byte[] arg0, int arg1) {
        field4532 = arg0;
        field4555 = arg1;
        field4526 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)I")
    public static final int method2091(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4526) {
            int var4 = 8 - field4526;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4532[field4555] >> field4526 & var5) << var2;
            field4526 = 0;
            field4555++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4532[field4555] >> field4526 & var3) << var2;
            field4526 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "([B)V")
    private static final void method2092(byte[] arg0) {
        method2090(arg0, 0);
        field4523 = 0x1 << method2091(4);
        field4539 = 0x1 << method2091(4);
        field4537 = new float[field4539];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4523 : field4539;
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
            int var25 = class161.method1033(var17 - 1, -257);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class237.method1623(-1, var25, var26);
            }
            if (var1 == 0) {
                field4536 = var18;
                field4529 = var20;
                field4531 = var22;
                field4540 = var24;
            } else {
                field4522 = var18;
                field4530 = var20;
                field4528 = var22;
                field4527 = var24;
            }
        }
        int var2 = method2091(8) + 1;
        field4534 = new class424[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4534[var3] = new class424();
        }
        int var4 = method2091(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2091(16);
        }
        int var6 = method2091(6) + 1;
        field4533 = new class226[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4533[var7] = new class226();
        }
        int var8 = method2091(6) + 1;
        field4525 = new class317[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4525[var9] = new class317();
        }
        int var10 = method2091(6) + 1;
        field4547 = new class364[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4547[var11] = new class364();
        }
        int var12 = method2091(6) + 1;
        field4535 = new boolean[var12];
        field4549 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4535[var13] = method2093() != 0;
            method2091(16);
            method2091(16);
            field4549[var13] = method2091(8);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()I")
    public static final int method2093() {
        int var0 = field4532[field4555] >> field4526 & 0x1;
        field4526++;
        field4555 += field4526 >> 3;
        field4526 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "([I)Lvo;")
    public final class27 method2094(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4553 == null) {
            this.field4538 = 0;
            this.field4544 = new float[field4539];
            this.field4553 = new byte[this.field4545];
            this.field4554 = 0;
            this.field4552 = 0;
        }
        while (this.field4552 < this.field4551.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2087(this.field4552);
            if (var3 != null) {
                int var4 = this.field4554;
                int var5 = var3.length;
                if (var5 > this.field4545 - var4) {
                    var5 = this.field4545 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4553[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4554;
                }
                this.field4554 = var4;
            }
            this.field4552++;
        }
        this.field4544 = null;
        byte[] var2 = this.field4553;
        this.field4553 = null;
        return new class27(this.field4550, var2, this.field4548, this.field4542, this.field4546);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
    public static void method2095() {
        field4532 = null;
        field4534 = null;
        field4533 = null;
        field4525 = null;
        field4547 = null;
        field4535 = null;
        field4549 = null;
        field4537 = null;
        field4536 = null;
        field4529 = null;
        field4531 = null;
        field4522 = null;
        field4530 = null;
        field4528 = null;
        field4540 = null;
        field4527 = null;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([B)V")
    private class319(byte[] arg0) {
        this.method2086(arg0);
    }
}
