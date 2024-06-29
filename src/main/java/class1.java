import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class38 {

    @OriginalMember(owner = "client!us", name = "u", descriptor = "Lam;")
    private class455 field10 = new class455();

    @OriginalMember(owner = "client!us", name = "A", descriptor = "Lih;")
    public class503 field16;

    @OriginalMember(owner = "client!us", name = "X", descriptor = "[[I")
    private int[][] field38;

    @OriginalMember(owner = "client!us", name = "U", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "[[[I")
    public int[][][] field4;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "[[S")
    public short[][] field24;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!us", name = "mb", descriptor = "[[F")
    private float[][] field53;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "[[[I")
    private int[][][] field28;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "[[[I")
    private int[][][] field5;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "[[[I")
    private int[][][] field21;

    @OriginalMember(owner = "client!us", name = "w", descriptor = "[[B")
    private byte[][] field12;

    @OriginalMember(owner = "client!us", name = "ib", descriptor = "[[F")
    private float[][] field49;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "[[[Lfm;")
    private class525[][][] field13;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "[[[I")
    public int[][][] field2;

    @OriginalMember(owner = "client!us", name = "eb", descriptor = "[[B")
    private byte[][] field45;

    @OriginalMember(owner = "client!us", name = "db", descriptor = "[[F")
    private float[][] field44;

    @OriginalMember(owner = "client!us", name = "bb", descriptor = "Lqi;")
    private class406 field42;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "Lbl;")
    private class468 field19;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "Leh;")
    public static class246 field6 = new class246(101, -1);

    @OriginalMember(owner = "client!us", name = "Z", descriptor = "Z")
    public static boolean field40 = false;

    @OriginalMember(owner = "client!us", name = "V", descriptor = "Lmt;")
    public static class276 field36 = new class276(14, 0, 4, 1);

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "v", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!us", name = "y", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!us", name = "z", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!us", name = "K", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!us", name = "O", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "Q", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!us", name = "R", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "client!us", name = "S", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!us", name = "T", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!us", name = "W", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!us", name = "hb", descriptor = "I")
    private int field48;

    @OriginalMember(owner = "client!us", name = "lb", descriptor = "I")
    private int field52;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!us", name = "fb", descriptor = "Ltg;")
    private class157 field46;

    @OriginalMember(owner = "client!us", name = "P", descriptor = "Loi;")
    public static class53 field30;

    @OriginalMember(owner = "client!us", name = "ab", descriptor = "Lff;")
    public class9 field41;

    @OriginalMember(owner = "client!us", name = "gb", descriptor = "Lff;")
    private class9 field47;

    @OriginalMember(owner = "client!us", name = "jb", descriptor = "Lff;")
    public class9 field50;

    @OriginalMember(owner = "client!us", name = "kb", descriptor = "Lff;")
    public class9 field51;

    @OriginalMember(owner = "client!us", name = "cb", descriptor = "[Lfm;")
    private class525[] field43;

    @OriginalMember(owner = "client!us", name = "Y", descriptor = "[[[I")
    private int[][][] field39;

    static {
        new class530("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZIZIII[[Z)V", line = 4)
    private final void method1(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean[][] arg6) {
        ++field29;
        if (this.field43 != null) {
            float var8 = this.field16.field7372;
            float var9 = this.field16.field7395;
            int var10 = arg3 + arg3 + 1;
            int var11 = var10 * var10;
            if (~this.field16.field7453.length > ~var11) {
                this.field16.field7453 = new int[var11];
            }
            if (~this.field16.field7451.field5663.length > ~(this.field15 * 2)) {
                this.field16.field7451 = new class141(this.field15 * 2);
            }
            int var12 = arg4 - arg3;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = -arg3 + arg1;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg3 + arg4;
            if (~(super.field411 + -1) > ~var16) {
                var16 = super.field411 + -1;
            }
            int var17 = arg1 + arg3;
            if (var17 > super.field413 - 1) {
                var17 = super.field413 - 1;
            }
            int var18 = 0;
            int[] var19 = this.field16.field7453;
            for (int var20 = var12; var16 >= var20; ++var20) {
                boolean[] var26 = arg6[var20 - var13];
                for (int var27 = var14; var17 >= var27; ++var27) {
                    if (var26[var27 - var15]) {
                        var19[var18++] = super.field411 * var27 - -var20;
                    }
                }
            }
            if (~arg5 != 0) {
                this.field16.method2929(75, (float) arg5);
                this.field16.method2955(16);
            } else {
                this.field16.method2986(-97);
            }
            this.field16.method2962(1, ~(this.field18 & 7) != -1);
            for (int var21 = 0; var21 < this.field43.length; ++var21) {
                this.field43[var21].method3099(var18, var19, (byte) -69);
            }
            if (!this.field10.method2661(-124)) {
                int var22 = this.field16.field7369;
                int var23 = this.field16.field7445;
                this.field16.method318(0, var23, this.field16.field7421);
                this.field16.method365(var9, var8 - 4.0F);
                this.field16.method2962(1, false);
                this.field16.method2933(false, false);
                this.field16.method2967(128, 89);
                this.field16.method2995(-2, (byte) -126);
                this.field16.method2968(this.field16.field7416, -51);
                this.field16.method2935((byte) 87, 7681, 8448);
                this.field16.method2969(0, 4611, 34166, 770);
                this.field16.method2956(770, 34167, 0, (byte) 55);
                for (class498 var24 = this.field10.method2655(15152); var24 != null; var24 = this.field10.method2660((byte) 67)) {
                    class329 var25 = (class329) var24;
                    var25.method1982(-1, arg4, arg6, arg3, arg1);
                }
                this.field16.method2969(0, 4611, 5890, 768);
                this.field16.method2956(770, 5890, 0, (byte) 55);
                this.field16.method2968((class478) null, -81);
                this.field16.method318(var22, var23, this.field16.field7421);
            }
            if (this.field19 != null) {
                this.field16.method365(var9, var8 + -8.0F);
                this.field16.method2986(9);
                this.field16.method2939(this.field41, (class9) null, 16063, (class9) null, this.field51);
                this.field19.method2716(arg6, (byte) -91, arg1, arg4, arg3, arg2);
            }
            this.field16.method365(var9, var8);
        }
        if (arg0) {
            this.field35 = 74;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III[[ZZ)V", line = 156)
    public final void method2(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field31;
        this.method1(false, arg1, arg4, arg2, arg0, -1, arg3);
    }

    @OriginalMember(owner = "client!us", name = "H", descriptor = "(Li;IIIIZ)V", line = 167)
    public final void method3(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field25;
        if (this.field19 != null && arg0 != null) {
            int var7 = arg1 - (this.field16.field7398 * arg2 >> 8) >> this.field16.field7311;
            int var8 = arg3 - (this.field16.field7349 * arg2 >> 8) >> this.field16.field7311;
            this.field19.method2717(arg0, var8, var7, -8669);
        }
    }

    @OriginalMember(owner = "client!us", name = "aa", descriptor = "()V", line = 185)
    public final void method4() {
        if (this.field52 <= 0) {
            this.field19 = null;
        } else {
            byte[][] var1 = new byte[super.field411 + 1][super.field413 + 1];
            for (int var2 = 1; ~var2 > ~super.field411; ++var2) {
                for (int var103 = 1; super.field413 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field45[var2][var103 - -1] >> 3) + (this.field45[var2 - 1][var103] >> 2) + (this.field45[var2 + 1][var103] >> 3) + (this.field45[var2][var103 + -1] >> 2) + (this.field45[var2][var103] >> 1));
                }
            }
            this.field43 = new class525[this.field42.method2406(true)];
            this.field42.method2407(this.field43, (byte) 65);
            for (int var3 = 0; ~var3 > ~this.field43.length; ++var3) {
                this.field43[var3].method3104(this.field52, 4);
            }
            int var4 = 24;
            if (this.field39 != null) {
                var4 += 4;
            }
            if (~(this.field18 & 7) != -1) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field16.field7312.method2619(this.field52 * var4);
            NativeStream var6 = new NativeStream(var5);
            class525[] var7 = new class525[this.field52];
            int var8 = class372.method2180(-16744, this.field52 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class406 var9 = new class406(var8);
            class525[] var10 = new class525[this.field48];
            for (int var11 = 0; ~super.field411 < ~var11; ++var11) {
                for (int var30 = 0; super.field413 > var30; ++var30) {
                    if (this.field21[var11][var30] != null) {
                        class525[] var31 = this.field13[var11][var30];
                        int[] var32 = this.field4[var11][var30];
                        int[] var33 = this.field2[var11][var30];
                        int[] var34 = this.field28[var11][var30];
                        int[] var35 = this.field21[var11][var30];
                        int[] var36 = this.field5 != null ? this.field5[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field39 != null ? this.field39[var11][var30] : null;
                        float var38 = this.field49[var11][var30];
                        float var39 = this.field44[var11][var30];
                        float var40 = this.field53[var11][var30];
                        float var41 = this.field49[var11][var30 + 1];
                        float var42 = this.field44[var11][var30 + 1];
                        float var43 = this.field53[var11][var30 - -1];
                        float var44 = this.field49[var11 - -1][var30 + 1];
                        float var45 = this.field44[var11 + 1][var30 + 1];
                        float var46 = this.field53[var11 - -1][var30 + 1];
                        float var47 = this.field49[var11 + 1][var30];
                        float var48 = this.field44[var11 + 1][var30];
                        float var49 = this.field53[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = var1[var11][var30 - -1] & 255;
                        int var52 = 255 & var1[var11 + 1][var30 + 1];
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label338: for (int var55 = 0; ~var55 > ~var35.length; ++var55) {
                            class525 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label338;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field24[super.field411 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var35.length < ~var57; ++var57) {
                            int var58 = (var11 << super.field414) - -var32[var57];
                            int var59 = (var30 << super.field414) - -var33[var57];
                            int var60 = var58 >> this.field35;
                            int var61 = var59 >> this.field35;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 != null ? var36[var57] : 0;
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            float var74;
                            int var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var38;
                                var73 = var39;
                                var74 = var40;
                                var75 = var69 - var50;
                            } else if (~var67 == -1 && super.field416 == var68) {
                                var75 = var69 - var51;
                                var72 = var41;
                                var73 = var42;
                                var74 = var43;
                            } else if (~super.field416 == ~var67 && ~super.field416 == ~var68) {
                                var75 = var69 - var52;
                                var74 = var46;
                                var72 = var44;
                                var73 = var45;
                            } else if (~super.field416 == ~var67 && var68 == 0) {
                                var73 = var48;
                                var72 = var47;
                                var74 = var49;
                                var75 = var69 - var53;
                            } else {
                                float var76 = (float) var67 / (float) super.field416;
                                float var77 = (float) var68 / (float) super.field416;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (var48 - var39) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var73 = (-var79 + var82) * var77 + var79;
                                var72 = (var81 - var78) * var77 + var78;
                                float var83 = (var46 - var43) * var76 + var43;
                                var74 = (-var80 + var83) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field414) + var50;
                                int var85 = var51 - -((var52 - var51) * var67 >> super.field414);
                                var75 = var69 - (((var85 - var84) * var68 >> super.field414) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var75 >> 7;
                                if (~var86 <= -3) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class391.field5502[var86 | 65408 & var62];
                                if ((7 & this.field18) == 0) {
                                    float var87 = this.field16.field7374[2] * var74 + this.field16.field7374[0] * var72 + this.field16.field7374[1] * var73;
                                    var71 = (var87 > 0.0F ? this.field16.field7448 : this.field16.field7414) * var87 + this.field16.field7344;
                                }
                            }
                            class498 var88 = null;
                            if (~(var58 & this.field7 - 1) == -1 && ~(this.field7 + -1 & var59) == -1) {
                                var88 = var9.method2405(var65, -47);
                            }
                            int var99;
                            if (var88 == null) {
                                int var90;
                                if (~var62 != ~var63) {
                                    int var89 = (var63 & 127) * var75 >> 7;
                                    if (var89 < 2) {
                                        var89 = 2;
                                    } else if (var89 > 126) {
                                        var89 = 126;
                                    }
                                    var90 = class391.field5502[65408 & var63 | var89];
                                    if (~(this.field18 & 7) == -1) {
                                        float var91 = this.field16.field7374[2] * var74 + this.field16.field7374[0] * var72 + this.field16.field7374[1] * var73;
                                        float var92 = var71 * (var71 > 0.0F ? this.field16.field7448 : this.field16.field7414) + this.field16.field7344;
                                        int var93 = (var90 & 16731307) >> 16;
                                        int var94 = (var90 & 65415) >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = 255 & var90;
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (~var95 < -256) {
                                            var95 = 255;
                                        }
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var98 > -1) {
                                            var98 = 0;
                                        } else if (var98 > 255) {
                                            var98 = 255;
                                        }
                                        var90 = var95 << 16 | var97 << 8 | var98;
                                    }
                                } else {
                                    var90 = var70;
                                }
                                if (this.field16.field7340) {
                                    var6.method2612((float) var58);
                                    var6.method2612((float) (var64 + this.method11(var58, var59)));
                                    var6.method2612((float) var59);
                                    var6.method2617((byte) (var90 >> 16));
                                    var6.method2617((byte) (var90 >> 8));
                                    var6.method2617((byte) var90);
                                    var6.method2617(-1);
                                    var6.method2612((float) var58);
                                    var6.method2612((float) var59);
                                    if (this.field39 != null) {
                                        var6.method2612((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if (~(7 & this.field18) != -1) {
                                        var6.method2612(var72);
                                        var6.method2612(var73);
                                        var6.method2612(var74);
                                    }
                                } else {
                                    var6.method2618((float) var58);
                                    var6.method2618((float) (var64 + this.method11(var58, var59)));
                                    var6.method2618((float) var59);
                                    var6.method2617((byte) (var90 >> 16));
                                    var6.method2617((byte) (var90 >> 8));
                                    var6.method2617((byte) var90);
                                    var6.method2617(-1);
                                    var6.method2618((float) var58);
                                    var6.method2618((float) var59);
                                    if (this.field39 != null) {
                                        var6.method2618((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field18 & 7) != -1) {
                                        var6.method2618(var72);
                                        var6.method2618(var73);
                                        var6.method2618(var74);
                                    }
                                }
                                var99 = this.field32++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2413(var65, new class10(var56[var57]), -1);
                            } else {
                                var56[var57] = ((class10) var88).field141;
                                var99 = 65535 & var56[var57];
                                if (var62 != -1 && var7[var99].field7060 > var31[var57].field7060) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method3103(17439, var75, var71, var70, var99);
                            }
                            ++this.field15;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field32; ++var12) {
                class525 var29 = var7[var12];
                if (var29 != null) {
                    var29.method3102((byte) -1, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field411; ++var13) {
                for (int var18 = 0; var18 < super.field413; ++var18) {
                    short[] var19 = this.field24[super.field411 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class525 var25 = var7[var22];
                            class525 var26 = var7[var23];
                            class525 var27 = var7[var24];
                            class525 var28 = null;
                            if (var25 != null) {
                                var25.method3106(var20, var18, var13, -22119);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method3106(var20, var18, var13, -22119);
                                if (var28 == null || ~var28.field7060 < ~var26.field7060) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method3106(var20, var18, var13, -22119);
                                if (var28 == null || ~var27.field7060 > ~var28.field7060) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method3102((byte) -1, var22);
                                }
                                if (var26 != null) {
                                    var28.method3102((byte) -1, var23);
                                }
                                if (var27 != null) {
                                    var28.method3102((byte) -1, var24);
                                }
                                var28.method3106(var20, var18, var13, -22119);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2613();
            this.field46 = this.field16.method2985(var5, 87, false, var4, var6.method2615());
            this.field51 = new class9(this.field46, 5126, 3, 0);
            this.field47 = new class9(this.field46, 5121, 4, 12);
            byte var14;
            if (this.field39 == null) {
                this.field41 = new class9(this.field46, 5126, 2, 16);
                var14 = 24;
            } else {
                var14 = 28;
                this.field41 = new class9(this.field46, 5126, 3, 16);
            }
            if (~(7 & this.field18) != -1) {
                this.field50 = new class9(this.field46, 5126, 3, var14);
            }
            long[] var15 = new long[this.field43.length];
            for (int var16 = 0; ~var16 > ~this.field43.length; ++var16) {
                class525 var17 = this.field43[var16];
                var15[var16] = var17.field7060;
                var17.method3101(this.field32, -1626213784);
            }
            class437.method2569(var15, true, this.field43);
            if (this.field19 != null) {
                this.field19.method2714(false);
            }
        }
        ++field1;
        this.field39 = null;
        this.field4 = this.field2 = null;
        this.field45 = null;
        this.field21 = null;
        this.field5 = null;
        this.field28 = null;
        this.field13 = null;
        this.field42 = null;
        this.field49 = this.field44 = this.field53 = null;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lih;IIII[[I[[II)V", line = 766)
    public class1(class503 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field16 = arg0;
        this.field38 = arg5;
        this.field35 = super.field414 - 2;
        this.field4 = new int[arg3][arg4][];
        this.field24 = new short[arg3 * arg4][];
        this.field18 = arg2;
        this.field53 = new float[super.field411 + 1][super.field413 - -1];
        this.field28 = new int[arg3][arg4][];
        this.field5 = new int[arg3][arg4][];
        this.field21 = new int[arg3][arg4][];
        this.field12 = new byte[arg3][arg4];
        this.field49 = new float[super.field411 + 1][super.field413 - -1];
        this.field13 = new class525[arg3][arg4][];
        this.field7 = 1 << this.field35;
        this.field2 = new int[arg3][arg4][];
        this.field45 = new byte[arg3 + 1][arg4 + 1];
        this.field44 = new float[super.field411 + 1][super.field413 + 1];
        for (int var9 = 1; super.field413 > var9; ++var9) {
            for (int var10 = 1; ~super.field411 < ~var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (arg7 * 4 * arg7 + var11 * var11 + var12 * var12)));
                this.field49[var10][var9] = (float) var11 * var13;
                this.field44[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field53[var10][var9] = (float) var12 * var13;
            }
        }
        this.field42 = new class406(128);
        if ((this.field18 & 16) != 0) {
            this.field19 = new class468(this.field16, this);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 826)
    public final void method5(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field20;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; ~var28 > ~var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method12(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lls;[I)V", line = 918)
    public final void method6(class95 arg0, int[] arg1) {
        ++field14;
        this.field10.method2657(8492, new class329(this.field16, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIILkr;)V", line = 928)
    private final void method7(int arg0, int arg1, int arg2, class535 arg3) {
        ++field33;
        int[] var5 = this.field4[arg0][arg2];
        int[] var6 = this.field2[arg0][arg2];
        int var7 = var5.length;
        if (this.field16.field7458.length < var7) {
            this.field16.field7456 = new int[var7];
            this.field16.field7458 = new int[var7];
        }
        int[] var8 = this.field16.field7458;
        int[] var9 = this.field16.field7456;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = class239.method1507(var5[var10], 255) >> this.field16.field7311;
            var9[var10] = class239.method1507(var6[var10], 255) >> this.field16.field7311;
        }
        if (arg1 < 83) {
            this.field51 = null;
        }
        int var11 = 0;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if (~((-var14 + var12) * (-var17 + var15) - (var16 - var14) * (-var13 + var15)) < -1) {
                arg3.method3151((byte) 74, var15, var12, var13, var14, var17, var16);
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "ba", descriptor = "(Li;IIIIZ)V", line = 990)
    public final void method8(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field34;
        if (this.field19 != null && arg0 != null) {
            int var7 = -(this.field16.field7398 * arg2 >> 8) + arg1 >> this.field16.field7311;
            int var8 = -(this.field16.field7349 * arg2 >> 8) + arg3 >> this.field16.field7311;
            this.field19.method2713(arg0, var7, (byte) -121, var8);
        }
    }

    @OriginalMember(owner = "client!us", name = "qa", descriptor = "(III)V", line = 1007)
    public final void method9(int arg0, int arg1, int arg2) {
        ++field23;
        if ((255 & this.field45[arg0][arg1]) < arg2) {
            this.field45[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!us", name = "ua", descriptor = "(II)I", line = 1017)
    public final int method10(int arg0, int arg1) {
        ++field27;
        return this.field38[arg0][arg1];
    }

    @OriginalMember(owner = "client!us", name = "ca", descriptor = "(II)I", line = 1029)
    public final int method11(int arg0, int arg1) {
        ++field22;
        int var3 = arg0 >> super.field414;
        int var4 = arg1 >> super.field414;
        if (var3 >= 0 && ~var4 <= -1 && super.field411 + -1 >= var3 && super.field413 + -1 >= var4) {
            int var5 = arg0 & super.field416 + -1;
            int var6 = super.field416 - 1 & arg1;
            int var7 = (-var5 + super.field416) * this.field38[var3][var4] + this.field38[var3 - -1][var4] * var5 >> super.field414;
            int var8 = (-var5 + super.field416) * this.field38[var3][var4 + 1] + this.field38[var3 - -1][var4 - -1] * var5 >> super.field414;
            return (-var6 + super.field416) * var7 + var6 * var8 >> super.field414;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!us", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1055)
    public final void method12(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field11;
        if (arg5 != null && this.field39 == null) {
            this.field39 = new int[super.field411][super.field413][];
        }
        if (arg3 != null && this.field5 == null) {
            this.field5 = new int[super.field411][super.field413][];
        }
        this.field4[arg0][arg1] = arg2;
        this.field2[arg0][arg1] = arg4;
        this.field21[arg0][arg1] = arg6;
        this.field28[arg0][arg1] = arg7;
        if (this.field39 != null) {
            this.field39[arg0][arg1] = arg5;
        }
        if (this.field5 != null) {
            this.field5[arg0][arg1] = arg3;
        }
        class525[] var15 = this.field13[arg0][arg1] = new class525[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class498 var19;
            for (var19 = this.field42.method2405(var17, -69); var19 != null; var19 = this.field42.method2415(-1)) {
                class525 var20 = (class525) var19;
                if (~arg8[var16] == ~var20.field7715 && (float) arg9[var16] == var20.field7719 && var20.field7729 == arg10 && ~var20.field7735 == ~arg11 && var20.field7717 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class525(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field42.method2413(var17, var15[var16], -1);
            } else {
                var15[var16] = (class525) var19;
            }
        }
        if (arg13) {
            this.field12[arg0][arg1] = (byte) class170.method1067(this.field12[arg0][arg1], 1);
        }
        if (arg6.length > this.field48) {
            this.field48 = arg6.length;
        }
        this.field52 += arg6.length;
    }

    @OriginalMember(owner = "client!us", name = "OA", descriptor = "(IILi;)Li;", line = 1124)
    public final class31 method13(int arg0, int arg1, class31 arg2) {
        ++field17;
        if ((this.field12[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field416 >> this.field16.field7311;
            class535 var5 = (class535) arg2;
            class535 var6;
            if (var5 != null && var5.method3145(var4, var4, (byte) 77)) {
                var6 = var5;
                var5.method3146(2084241616);
            } else {
                var6 = new class535(this.field16, var4, var4);
            }
            var6.method3150(var4, (byte) 127, 0, 0, var4);
            this.method7(arg0, 103, arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(II)V", line = 1157)
    public static final void method14(int arg0, int arg1) {
        ++field3;
        if (arg1 <= 0) {
            field40 = true;
        }
        class45 var2 = class354.method2094(arg0, (byte) -25, 5);
        var2.method261(4);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(II)V", line = 1170)
    public final void method15(int arg0, int arg1) {
        ++field26;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V", line = 1182)
    public static void method16(byte arg0) {
        field30 = null;
        if (arg0 >= 37) {
            field36 = null;
            field6 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Li;IIIIZ)Z", line = 1205)
    public final boolean method17(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field8;
        if (this.field19 != null && arg0 != null) {
            int var7 = -(this.field16.field7398 * arg2 >> 8) + arg1 >> this.field16.field7311;
            int var8 = arg3 - (this.field16.field7349 * arg2 >> 8) >> this.field16.field7311;
            return this.field19.method2715(var8, var7, (byte) -116, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1222)
    public final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9;
        if (this.field52 > 0) {
            this.field16.method2945(-96);
            this.field16.method2977(-125, false);
            this.field16.method2962(1, false);
            this.field16.method2926(false, (byte) 55);
            this.field16.method2933(false, false);
            this.field16.method2967(0, 120);
            this.field16.method2995(-2, (byte) 51);
            this.field16.method2968((class478) null, -98);
            class470.field6563[9] = 0.0F;
            class470.field6563[4] = 0.0F;
            class470.field6563[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field16.field7259;
            class470.field6563[15] = 1.0F;
            class470.field6563[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field16.field7255) + -1.0F;
            class470.field6563[5] = (float) arg2 / ((float) super.field416 * 128.0F * (float) this.field16.field7259);
            class470.field6563[7] = 0.0F;
            class470.field6563[11] = 0.0F;
            class470.field6563[14] = 0.0F;
            class470.field6563[6] = 0.0F;
            class470.field6563[0] = (float) arg2 / ((float) super.field416 * 128.0F * (float) this.field16.field7255);
            class470.field6563[8] = 0.0F;
            class470.field6563[2] = 0.0F;
            class470.field6563[3] = 0.0F;
            class470.field6563[10] = 0.0F;
            class470.field6563[1] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class470.field6563, 0);
            class470.field6563[6] = 1.0F;
            class470.field6563[11] = 0.0F;
            class470.field6563[3] = 0.0F;
            class470.field6563[14] = 0.0F;
            class470.field6563[8] = 0.0F;
            class470.field6563[2] = 0.0F;
            class470.field6563[9] = 1.0F;
            class470.field6563[1] = 0.0F;
            class470.field6563[13] = 0.0F;
            class470.field6563[12] = 0.0F;
            class470.field6563[15] = 1.0F;
            class470.field6563[0] = 1.0F;
            class470.field6563[7] = 0.0F;
            class470.field6563[4] = 0.0F;
            class470.field6563[5] = 0.0F;
            class470.field6563[10] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class470.field6563, 0);
            if ((this.field18 & 7) == 0) {
                this.field16.method2962(1, false);
            } else {
                this.field16.method2962(1, true);
                this.field16.method2981(true);
            }
            this.field16.method2939(this.field41, this.field50, 16063, this.field47, this.field51);
            if (this.field15 * 2 <= this.field16.field7451.field5663.length) {
                this.field16.field7451.field5665 = 0;
            } else {
                this.field16.field7451 = new class141(this.field15 * 2);
            }
            int var9 = 0;
            class141 var10 = this.field16.field7451;
            if (this.field16.field7340) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field411 * var11 + arg3;
                    for (int var13 = arg3; arg5 > var13; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field24[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    var10.method2372(65535 & var14[var15], -128);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field411 * var16 + arg3;
                    for (int var19 = arg3; ~arg5 < ~var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field24[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var21 > ~var20.length; ++var21) {
                                    var10.method2378(-1784786264, 65535 & var20[var21]);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class213 var17 = new class213(this.field16, 5123, var10.field5663, var10.field5665);
                this.field16.method2998(0, 4, var17, 68, var9);
            }
        }
    }
}
