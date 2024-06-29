import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class520 extends class296 {

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "F")
    private float field7114 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!ew", name = "U", descriptor = "F")
    private float field7134 = -3.4028235E38F;

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "Ltm;")
    private class412 field7112 = new class412();

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "Lai;")
    public class626 field7101;

    @OriginalMember(owner = "client!ew", name = "T", descriptor = "I")
    private int field7133;

    @OriginalMember(owner = "client!ew", name = "db", descriptor = "[[F")
    private float[][] field7143;

    @OriginalMember(owner = "client!ew", name = "Z", descriptor = "[[B")
    private byte[][] field7139;

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "[[[I")
    private int[][][] field7110;

    @OriginalMember(owner = "client!ew", name = "V", descriptor = "[[[I")
    public int[][][] field7135;

    @OriginalMember(owner = "client!ew", name = "H", descriptor = "[[[Lhda;")
    private class781[][][] field7121;

    @OriginalMember(owner = "client!ew", name = "J", descriptor = "I")
    private int field7123;

    @OriginalMember(owner = "client!ew", name = "D", descriptor = "[[B")
    private byte[][] field7117;

    @OriginalMember(owner = "client!ew", name = "X", descriptor = "[[F")
    private float[][] field7137;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "[[[I")
    public int[][][] field7100;

    @OriginalMember(owner = "client!ew", name = "R", descriptor = "[[[I")
    public int[][][] field7131;

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "I")
    public int field7108;

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "[[[I")
    private int[][][] field7113;

    @OriginalMember(owner = "client!ew", name = "W", descriptor = "[[F")
    private float[][] field7136;

    @OriginalMember(owner = "client!ew", name = "F", descriptor = "[[S")
    public short[][] field7119;

    @OriginalMember(owner = "client!ew", name = "hb", descriptor = "Lee;")
    private class706 field7147;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "Lnt;")
    private class235 field7115;

    @OriginalMember(owner = "client!ew", name = "G", descriptor = "I")
    public static int field7120 = 1407;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
    private int field7109;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!ew", name = "C", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!ew", name = "E", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!ew", name = "I", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!ew", name = "K", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!ew", name = "L", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!ew", name = "N", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!ew", name = "O", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!ew", name = "P", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!ew", name = "Q", descriptor = "I")
    private int field7130;

    @OriginalMember(owner = "client!ew", name = "S", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!ew", name = "bb", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!ew", name = "cb", descriptor = "I")
    private int field7142;

    @OriginalMember(owner = "client!ew", name = "eb", descriptor = "I")
    private int field7144;

    @OriginalMember(owner = "client!ew", name = "fb", descriptor = "Lnc;")
    public class26 field7145;

    @OriginalMember(owner = "client!ew", name = "ab", descriptor = "Lid;")
    private class612 field7140;

    @OriginalMember(owner = "client!ew", name = "gb", descriptor = "Lid;")
    private class612 field7146;

    @OriginalMember(owner = "client!ew", name = "Y", descriptor = "[Lhda;")
    private class781[] field7138;

    @OriginalMember(owner = "client!ew", name = "M", descriptor = "[[[I")
    private int[][][] field7126;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lr;IIIIZ)Z", line = 3)
    public final boolean method1142(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7111;
        if (this.field7115 != null && arg0 != null) {
            int var7 = -(this.field7101.field8647 * arg2 >> 8) + arg1 >> this.field7101.field8643;
            int var8 = -(this.field7101.field8646 * arg2 >> 8) + arg3 >> this.field7101.field8643;
            return this.field7115.method1529(var7, var8, arg0, 122);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "([[ZIZIIIII)V", line = 19)
    private final void method3006(boolean[][] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field7138 != null) {
            int var9 = arg3 - -1 + arg3;
            int var10 = var9 * var9;
            if (~var10 < ~class101.field1408.length) {
                class101.field1408 = new int[var10];
            }
            int var11 = -arg3 + arg7;
            int var12 = var11;
            if (var11 < 0) {
                var11 = 0;
            }
            int var13 = arg5 - arg3;
            int var14 = var13;
            if (~var13 > -1) {
                var13 = 0;
            }
            int var15 = arg3 + arg7;
            if (~(super.field4301 + -1) > ~var15) {
                var15 = super.field4301 + -1;
            }
            int var16 = arg5 - -arg3;
            class168.field2261 = 0;
            if (~(super.field4300 + -1) > ~var16) {
                var16 = super.field4300 - 1;
            }
            for (int var17 = var11; ~var15 <= ~var17; ++var17) {
                boolean[] var24 = arg0[-var12 + var17];
                for (int var25 = var13; ~var16 <= ~var25; ++var25) {
                    if (var24[-var14 + var25]) {
                        class101.field1408[class168.field2261++] = super.field4301 * var25 - -var17;
                    }
                }
            }
            if (arg4 == -1) {
                this.field7101.method3493(true);
            } else {
                this.field7101.method3451((float) arg4, (byte) 119);
                this.field7101.method3511(arg1 + -8);
            }
            this.field7101.method3469((byte) -127);
            this.field7101.method3472((byte) -68, ~(7 & this.field7108) != -1);
            this.field7101.method3502(false, -1, false, (byte) -112);
            this.field7101.method883(this.field7146, 0, 72);
            for (int var18 = 0; ~var18 > ~this.field7138.length; ++var18) {
                this.field7138[var18].method4308(-31861, class101.field1408, class168.field2261);
            }
            class754 var19 = this.field7101.method3482((byte) 88);
            var19.method981(0, -1, 0);
            this.field7101.method3508(11570);
            if (!this.field7112.method2540(false)) {
                int var20 = this.field7101.field8651;
                int var21 = this.field7101.field8721;
                this.field7101.method550(0, var21, this.field7101.field8714);
                this.field7101.method3472((byte) -68, false);
                this.field7101.method3500((byte) -119, false);
                this.field7101.method3460(0, 128);
                this.field7101.method3502(false, -2, false, (byte) -112);
                this.field7101.method3520(true, this.field7101.field8683);
                this.field7101.method3513(class521.field7150, class364.field5299, 92);
                this.field7101.method3514((byte) -59, class109.field1493, 0);
                this.field7101.method3509(0, class461.field6387, -107);
                for (class101 var22 = this.field7112.method2551((byte) -108); var22 != null; var22 = this.field7112.method2542(-102)) {
                    class786 var23 = (class786) var22;
                    var23.method4346(arg0, arg3, arg7, arg5, -1);
                }
                this.field7101.method3514((byte) 116, class122.field1782, 0);
                this.field7101.method3509(0, class122.field1782, -107);
                this.field7101.method3520(true, (class123) null);
                this.field7101.method550(var20, var21, this.field7101.field8714);
            }
            if (this.field7115 != null) {
                this.field7101.method883(this.field7146, 0, arg1 ^ -111);
                this.field7101.method883(this.field7140, 1, arg1 ^ -77);
                this.field7101.method913(this.field7145, (byte) -63);
                this.field7115.method1526((byte) 127, arg2, arg5, arg7, arg0, arg3);
            }
        }
        ++field7128;
        if (arg1 != 7) {
            this.method1139();
        }
    }

    @OriginalMember(owner = "client!ew", name = "ka", descriptor = "(III)V", line = 164)
    public final void method1150(int arg0, int arg1, int arg2) {
        if (arg2 > (255 & this.field7139[arg0][arg1])) {
            this.field7139[arg0][arg1] = (byte) arg2;
        }
        ++field7118;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III[[ZZI)V", line = 174)
    public final void method1146(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field7107;
        this.method3006(arg3, 7, arg4, arg2, -1, arg1, arg5, arg0);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIIIII[[Z)V", line = 184)
    public final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7103;
        if (~this.field7144 < -1) {
            class427 var9 = this.field7101.method3492((byte) 31, this.field7109);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method2613(true, 3754);
                if (var14 != null) {
                    Stream var15 = this.field7101.method3445(9, var14);
                    if (!Stream.method3926()) {
                        for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                            int var17 = super.field4301 * var16 + arg3;
                            for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field7119[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var19.length > var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            ++var10;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                            var15.method3921(var21);
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field4301 * var22 - -arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field7119[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
                                            int var29 = var27[var28] & 65535;
                                            if (var12 < var29) {
                                                var12 = var29;
                                            }
                                            ++var10;
                                            if (var29 < var11) {
                                                var11 = var29;
                                            }
                                            var15.method3918(var29);
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method3922();
                    if (var9.method2611(26937)) {
                        break;
                    }
                }
            }
            if (var10 > 0) {
                this.field7101.method3497(true);
                this.field7101.method3524(-545832829, false);
                this.field7101.method3472((byte) -68, false);
                this.field7101.method3484(1, false);
                this.field7101.method3500((byte) 124, false);
                this.field7101.method3460(0, 0);
                this.field7101.method3502(false, -2, false, (byte) -112);
                this.field7101.method3520(true, (class123) null);
                class754 var23 = this.field7101.method3482((byte) 71);
                float[] var24 = this.field7101.method3475(32768);
                var24[11] = 0.0F;
                var24[0] = (float) arg2 / ((float) super.field4295 * 128.0F * (float) this.field7101.field8553);
                var24[15] = 1.0F;
                var24[14] = -this.field7114 / (this.field7134 - this.field7114);
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field7101.field8593) + 1.0F;
                var24[7] = 0.0F;
                var24[4] = 0.0F;
                var24[10] = 1.0F / (this.field7134 - this.field7114);
                var24[2] = 0.0F;
                var24[3] = 0.0F;
                var24[9] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field7101.field8553) + -1.0F;
                var24[5] = (float) arg2 / ((float) super.field4295 * 128.0F * (float) this.field7101.field8593);
                var24[6] = 0.0F;
                var24[1] = 0.0F;
                var24[8] = 0.0F;
                var23.method4204(0.0F, 0.0F, 0.0F, 0, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
                this.field7101.method3461(111);
                this.field7101.method3508(11570);
                if (~(this.field7108 & 7) != -1) {
                    this.field7101.method3472((byte) -68, true);
                    this.field7101.method879(-116);
                } else {
                    this.field7101.method3472((byte) -68, false);
                }
                this.field7101.method895(-109, false);
                this.field7101.method883(this.field7146, 0, -119);
                this.field7101.method883(this.field7140, 1, 125);
                this.field7101.method913(this.field7145, (byte) -63);
                this.field7101.method864(var10 / 3, 0, var9, var11, -var11 + 1 + var12, true, class235.field3174);
                this.field7101.method895(-109, true);
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)V", line = 376)
    public final void method1140(int arg0, int arg1) {
        ++field7129;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III[[ZZII)V", line = 383)
    public final void method1137(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method3006(arg3, 7, arg4, arg2, arg5, arg1, arg6, arg0);
        ++field7132;
    }

    @OriginalMember(owner = "client!ew", name = "YA", descriptor = "()V", line = 396)
    public final void method1139() {
        if (~this.field7144 < -1) {
            byte[][] var1 = new byte[super.field4301 + 1][super.field4300 + 1];
            for (int var2 = 1; var2 < super.field4301; ++var2) {
                for (int var107 = 1; var107 < super.field4300; ++var107) {
                    var1[var2][var107] = (byte) ((this.field7139[var2][var107 + 1] >> 3) + (this.field7139[var2][var107 + -1] >> 2) + (this.field7139[var2][var107] >> 1) + (this.field7139[var2 - -1][var107] >> 3) + (this.field7139[var2 - 1][var107] >> 2));
                }
            }
            class781[] var3 = new class781[this.field7147.method3963((byte) 6)];
            this.field7147.method3952(0, var3);
            for (int var4 = 0; var3.length > var4; ++var4) {
                var3[var4].method4311(127, this.field7144);
            }
            int var5 = 20;
            if (this.field7126 != null) {
                var5 += 4;
            }
            if ((this.field7108 & 7) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field7101.field8494.method3913(this.field7144 * 4, false);
            NativeHeapBuffer var7 = this.field7101.field8494.method3913(this.field7144 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class781[] var10 = new class781[this.field7144];
            int var11 = class37.method261(this.field7144 / 4, false);
            if (~var11 > -2) {
                var11 = 1;
            }
            class706 var12 = new class706(var11);
            class781[] var13 = new class781[this.field7142];
            for (int var14 = 0; ~super.field4301 < ~var14; ++var14) {
                for (int var34 = 0; ~super.field4300 < ~var34; ++var34) {
                    if (this.field7135[var14][var34] != null) {
                        class781[] var35 = this.field7121[var14][var34];
                        int[] var36 = this.field7100[var14][var34];
                        int[] var37 = this.field7131[var14][var34];
                        int[] var38 = this.field7110[var14][var34];
                        int[] var39 = this.field7135[var14][var34];
                        int[] var40 = this.field7113 != null ? this.field7113[var14][var34] : null;
                        int[] var41 = this.field7126 == null ? null : this.field7126[var14][var34];
                        if (var38 == null) {
                            var38 = var39;
                        }
                        float var42 = this.field7136[var14][var34];
                        float var43 = this.field7137[var14][var34];
                        float var44 = this.field7143[var14][var34];
                        float var45 = this.field7136[var14][var34 + 1];
                        float var46 = this.field7137[var14][var34 + 1];
                        float var47 = this.field7143[var14][var34 - -1];
                        float var48 = this.field7136[var14 - -1][var34 - -1];
                        float var49 = this.field7137[var14 + 1][var34 + 1];
                        float var50 = this.field7143[var14 + 1][var34 + 1];
                        float var51 = this.field7136[var14 + 1][var34];
                        float var52 = this.field7137[var14 + 1][var34];
                        float var53 = this.field7143[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = var1[var14][var34 + 1] & 255;
                        int var56 = 255 & var1[var14 + 1][var34 + 1];
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label360: for (int var59 = 0; ~var59 > ~var39.length; ++var59) {
                            class781 var105 = var35[var59];
                            for (int var106 = 0; ~var106 > ~var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label360;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field7119[super.field4301 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; var39.length > var61; ++var61) {
                            int var62 = (var14 << super.field4297) + var36[var61];
                            int var63 = (var34 << super.field4297) - -var37[var61];
                            int var64 = var62 >> this.field7133;
                            int var65 = var63 >> this.field7133;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var67 << 48 | (long) var66 << 32 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            float var75;
                            float var76;
                            float var77;
                            int var78;
                            if (~var71 == -1 && ~var72 == -1) {
                                var75 = var42;
                                var76 = var43;
                                var77 = var44;
                                var78 = var73 - var54;
                            } else if (var71 == 0 && ~super.field4295 == ~var72) {
                                var77 = var47;
                                var75 = var45;
                                var78 = var73 - var55;
                                var76 = var46;
                            } else if (~super.field4295 == ~var71 && ~super.field4295 == ~var72) {
                                var76 = var49;
                                var78 = var73 - var56;
                                var75 = var48;
                                var77 = var50;
                            } else if (super.field4295 == var71 && ~var72 == -1) {
                                var78 = var73 - var57;
                                var76 = var52;
                                var77 = var53;
                                var75 = var51;
                            } else {
                                float var79 = (float) var71 / (float) super.field4295;
                                float var80 = (float) var72 / (float) super.field4295;
                                float var81 = (var51 - var42) * var79 + var42;
                                float var82 = (-var43 + var52) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (var48 - var45) * var79 + var45;
                                float var85 = (var49 - var46) * var79 + var46;
                                var76 = (var85 - var82) * var80 + var82;
                                float var86 = (var50 - var47) * var79 + var47;
                                var75 = (-var81 + var84) * var80 + var81;
                                var77 = (-var83 + var86) * var80 + var83;
                                int var87 = ((var57 - var54) * var71 >> super.field4297) + var54;
                                int var88 = ((var56 - var55) * var71 >> super.field4297) + var55;
                                var78 = var73 - (((-var87 + var88) * var72 >> super.field4297) + var87);
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var78 >> 7;
                                if (var90 < 2) {
                                    var90 = 2;
                                } else if (~var90 < -127) {
                                    var90 = 126;
                                }
                                if (~(this.field7108 & 7) == -1) {
                                    float var91 = this.field7101.field8700[2] * var77 + this.field7101.field8700[1] * var76 + this.field7101.field8700[0] * var75;
                                    var89 = var91 * (!(var91 > 0.0F) ? this.field7101.field8673 : this.field7101.field8705) + this.field7101.field8644;
                                }
                                var74 = class145.field2069[var90 | var66 & 65408];
                            }
                            class101 var92 = null;
                            if (~(this.field7123 - 1 & var62) == -1 && ~(var63 & this.field7123 + -1) == -1) {
                                var92 = var12.method3953(var69, 14);
                            }
                            int var93;
                            if (var92 != null) {
                                var60[var61] = ((class172) var92).field2301;
                                var93 = var60[var61] & 65535;
                                if (var66 != -1 && var35[var61].field1409 < var10[var93].field1409) {
                                    var10[var93] = var35[var61];
                                }
                            } else {
                                int var95;
                                if (~var66 != ~var67) {
                                    int var94 = (127 & var67) * var78 >> 7;
                                    if (var94 >= 2) {
                                        if (~var94 < -127) {
                                            var94 = 126;
                                        }
                                    } else {
                                        var94 = 2;
                                    }
                                    var95 = class145.field2069[var94 | 65408 & var67];
                                    if (~(7 & this.field7108) == -1) {
                                        float var96 = this.field7101.field8700[2] * var77 + this.field7101.field8700[1] * var76 + this.field7101.field8700[0] * var75;
                                        float var97 = this.field7101.field8644 + var89 * (var89 > 0.0F ? this.field7101.field8705 : this.field7101.field8673);
                                        int var98 = 255 & var95 >> 16;
                                        int var99 = var95 >> 8 & 255;
                                        int var100 = (int) ((float) var98 * var97);
                                        int var101 = var95 & 255;
                                        int var102 = (int) ((float) var99 * var97);
                                        if (~var100 <= -1) {
                                            if (var100 > 255) {
                                                var100 = 255;
                                            }
                                        } else {
                                            var100 = 0;
                                        }
                                        if (~var102 <= -1) {
                                            if (var102 > 255) {
                                                var102 = 255;
                                            }
                                        } else {
                                            var102 = 0;
                                        }
                                        int var103 = (int) ((float) var101 * var97);
                                        if (~var103 > -1) {
                                            var103 = 0;
                                        } else if (~var103 < -256) {
                                            var103 = 255;
                                        }
                                        var95 = var103 | var102 << 8 | var100 << 16;
                                    }
                                } else {
                                    var95 = var74;
                                }
                                if (!Stream.method3926()) {
                                    var8.method3929((float) var62);
                                    var8.method3929((float) (var68 + this.method1882(var63, 0, var62)));
                                    var8.method3929((float) var63);
                                    var8.method3929((float) var62);
                                    var8.method3929((float) var63);
                                    if (this.field7126 != null) {
                                        var8.method3929((float) (var41 == null ? 0 : var41[var61] + -1));
                                    }
                                    if (~(7 & this.field7108) != -1) {
                                        var8.method3929(var75);
                                        var8.method3929(var76);
                                        var8.method3929(var77);
                                    }
                                } else {
                                    var8.method3930((float) var62);
                                    var8.method3930((float) (this.method1882(var63, 0, var62) - -var68));
                                    var8.method3930((float) var63);
                                    var8.method3930((float) var62);
                                    var8.method3930((float) var63);
                                    if (this.field7126 != null) {
                                        var8.method3930((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if ((this.field7108 & 7) != 0) {
                                        var8.method3930(var75);
                                        var8.method3930(var76);
                                        var8.method3930(var77);
                                    }
                                }
                                if (~this.field7101.field8716 != -1) {
                                    var9.method3923(-16777216 | var95);
                                } else {
                                    var9.method3928(var95 | -16777216);
                                }
                                var93 = this.field7130++;
                                var60[var61] = (short) var93;
                                if (~var66 != 0) {
                                    var10[var93] = var35[var61];
                                }
                                var12.method3962(var69, new class172(var60[var61]), -126);
                            }
                            for (int var104 = 0; var104 < var58; ++var104) {
                                var13[var104].method4316(var89, var78, var74, 0, var93);
                            }
                            ++this.field7109;
                        }
                    }
                }
            }
            for (int var15 = 0; ~this.field7130 < ~var15; ++var15) {
                class781 var33 = var10[var15];
                if (var33 != null) {
                    var33.method4313(110, var15);
                }
            }
            for (int var16 = 0; var16 < super.field4301; ++var16) {
                for (int var22 = 0; super.field4300 > var22; ++var22) {
                    short[] var23 = this.field7119[super.field4301 * var22 - -var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (var23.length > var25) {
                            int var26 = 65535 & var23[var25++];
                            int var27 = var23[var25++] & 65535;
                            int var28 = 65535 & var23[var25++];
                            class781 var29 = var10[var26];
                            class781 var30 = var10[var27];
                            class781 var31 = var10[var28];
                            class781 var32 = null;
                            if (var29 != null) {
                                var32 = var29;
                                var29.method4314(var22, 64, var24, var16);
                            }
                            if (var30 != null) {
                                var30.method4314(var22, 49, var24, var16);
                                if (var32 == null || ~var30.field1409 > ~var32.field1409) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method4314(var22, 47, var24, var16);
                                if (var32 == null || var31.field1409 < var32.field1409) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method4313(-68, var26);
                                }
                                if (var30 != null) {
                                    var32.method4313(-38, var27);
                                }
                                if (var31 != null) {
                                    var32.method4313(126, var28);
                                }
                                var32.method4314(var22, 96, var24, var16);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method3922();
            var9.method3922();
            this.field7140 = this.field7101.method902(0, false);
            this.field7140.method2639(this.field7130 * 4, 4, -959, var6);
            this.field7146 = this.field7101.method902(0, false);
            this.field7146.method2639(this.field7130 * var5, var5, -959, var7);
            if (~(this.field7108 & 7) != -1) {
                if (this.field7126 == null) {
                    this.field7145 = this.field7101.method893(new class357[] { new class357(new class542[] { class542.field7354, class542.field7365, class542.field7358 }), new class357(class542.field7363) }, (byte) -6);
                } else {
                    this.field7145 = this.field7101.method893(new class357[] { new class357(new class542[] { class542.field7354, class542.field7365, class542.field7364, class542.field7358 }), new class357(class542.field7363) }, (byte) -27);
                }
            } else if (this.field7126 == null) {
                this.field7145 = this.field7101.method893(new class357[] { new class357(new class542[] { class542.field7354, class542.field7365 }), new class357(class542.field7363) }, (byte) -37);
            } else {
                this.field7145 = this.field7101.method893(new class357[] { new class357(new class542[] { class542.field7354, class542.field7365, class542.field7364 }), new class357(class542.field7363) }, (byte) -125);
            }
            int var17 = 0;
            for (int var18 = 0; ~var3.length < ~var18; ++var18) {
                if (~var3[var18].field10721 < -1) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field7138 = new class781[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class781 var21 = var3[var20];
                var19[var20] = var21.field1409;
                this.field7138[var20] = var21;
                var21.method4312(4, this.field7130);
            }
            class237.method1533(false, this.field7138, var19);
            if (this.field7115 != null) {
                this.field7115.method1521(-118);
            }
        } else {
            this.field7115 = null;
        }
        ++field7106;
        this.field7126 = null;
        this.field7147 = null;
        this.field7135 = null;
        this.field7139 = null;
        this.field7113 = null;
        this.field7110 = null;
        this.field7121 = null;
        this.field7136 = this.field7137 = this.field7143 = null;
        this.field7100 = this.field7131 = null;
    }

    @OriginalMember(owner = "client!ew", name = "fa", descriptor = "(IILr;)Lr;", line = 998)
    public final class195 method1147(int arg0, int arg1, class195 arg2) {
        ++field7127;
        if ((this.field7117[arg0][arg1] & 1) == 0) {
            return null;
        } else {
            int var4 = super.field4295 >> this.field7101.field8643;
            class558 var5 = (class558) arg2;
            class558 var6;
            if (var5 != null && var5.method3146(var4, -1, var4)) {
                var6 = var5;
                var5.method3143(66);
            } else {
                var6 = new class558(this.field7101, var4, var4);
            }
            var6.method3144(var4, 0, 0, -25483, var4);
            this.method3009((byte) -100, arg0, var6, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1026)
    public final void method1149(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field7116;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
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
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
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
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1145(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ew", name = "CA", descriptor = "(Lr;IIIIZ)V", line = 1112)
    public final void method1152(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7105;
        if (this.field7115 != null && arg0 != null) {
            int var7 = -(this.field7101.field8647 * arg2 >> 8) + arg1 >> this.field7101.field8643;
            int var8 = -(this.field7101.field8646 * arg2 >> 8) + arg3 >> this.field7101.field8643;
            this.field7115.method1524(54, var7, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Luca;[I)V", line = 1136)
    public final void method1141(class540 arg0, int[] arg1) {
        this.field7112.method2545(-127, new class786(this.field7101, this, arg0, arg1));
        ++field7125;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lai;IIII[[I[[II)V", line = 1148)
    public class520(class626 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field7101 = arg0;
        this.field7133 = super.field4297 + -2;
        this.field7143 = new float[super.field4301 + 1][super.field4300 - -1];
        this.field7139 = new byte[arg3 + 1][arg4 + 1];
        this.field7110 = new int[arg3][arg4][];
        this.field7135 = new int[arg3][arg4][];
        this.field7121 = new class781[arg3][arg4][];
        this.field7123 = 1 << this.field7133;
        this.field7117 = new byte[arg3][arg4];
        this.field7137 = new float[super.field4301 + 1][super.field4300 + 1];
        this.field7100 = new int[arg3][arg4][];
        this.field7131 = new int[arg3][arg4][];
        this.field7108 = arg2;
        this.field7113 = new int[arg3][arg4][];
        this.field7136 = new float[super.field4301 - -1][super.field4300 + 1];
        this.field7119 = new short[arg3 * arg4][];
        for (int var9 = 0; super.field4300 >= var9; ++var9) {
            for (int var10 = 0; super.field4301 >= var10; ++var10) {
                int var11 = super.field4292[var10][var9];
                if (this.field7114 > (float) var11) {
                    this.field7114 = (float) var11;
                }
                if (this.field7134 < (float) var11) {
                    this.field7134 = (float) var11;
                }
                if (var10 > 0 && var9 > 0 && var10 < super.field4301 && var9 < super.field4300) {
                    int var12 = arg6[var10 - -1][var9] - arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + arg7 * 4 * arg7 + var12 * var12)));
                    this.field7136[var10][var9] = (float) var12 * var14;
                    this.field7137[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field7143[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field7134;
        --this.field7114;
        this.field7147 = new class706(128);
        if ((this.field7108 & 16) != 0) {
            this.field7115 = new class235(this.field7101, this);
        }
    }

    @OriginalMember(owner = "client!ew", name = "wa", descriptor = "(Lr;IIIIZ)V", line = 1219)
    public final void method1138(class195 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field7122;
        if (this.field7115 != null && arg0 != null) {
            int var7 = -(this.field7101.field8647 * arg2 >> 8) + arg1 >> this.field7101.field8643;
            int var8 = -(this.field7101.field8646 * arg2 >> 8) + arg3 >> this.field7101.field8643;
            this.field7115.method1527(var8, arg0, true, var7);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)V", line = 1239)
    public static final void method3007(int arg0, byte arg1) {
        ++field7102;
        class16 var2 = class94.method753(9, 13175, (long) arg0);
        if (arg1 >= -90) {
            field7120 = -68;
        }
        var2.method118(585134072);
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(III)I", line = 1253)
    public static final int method3008(int arg0, int arg1, int arg2) {
        ++field7104;
        int var3 = arg0 * arg1 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return 255 & var5 >> 19;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(BILde;I)V", line = 1270)
    private final void method3009(byte arg0, int arg1, class558 arg2, int arg3) {
        ++field7141;
        int[] var5 = this.field7100[arg1][arg3];
        int[] var6 = this.field7131[arg1][arg3];
        int var7 = var5.length;
        if (var7 > class304.field4374.length) {
            class304.field4374 = new int[var7];
            class11.field173 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class304.field4374[var8] = var5[var8] >> this.field7101.field8643;
            class11.field173[var8] = var6[var8] >> this.field7101.field8643;
        }
        int var9 = 0;
        while (~var7 < ~var9) {
            int var10 = class304.field4374[var9];
            int var11 = class11.field173[var9++];
            int var12 = class304.field4374[var9];
            int var13 = class11.field173[var9++];
            int var14 = class304.field4374[var9];
            int var15 = class11.field173[var9++];
            if (~((var10 - var12) * (var13 - var15) - (var13 - var11) * (-var12 + var14)) < -1) {
                arg2.method3140(var14, var10, var13, var11, var12, var15, 29167);
            }
        }
        if (arg0 != -100) {
            this.method1149(93, 34, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 28, 92, 64, false);
        }
    }

    @OriginalMember(owner = "client!ew", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1330)
    public final void method1145(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field7124;
        class161 var15 = this.field7101.field912;
        if (arg5 != null && this.field7126 == null) {
            this.field7126 = new int[super.field4301][super.field4300][];
        }
        if (arg3 != null && this.field7113 == null) {
            this.field7113 = new int[super.field4301][super.field4300][];
        }
        this.field7100[arg0][arg1] = arg2;
        this.field7131[arg0][arg1] = arg4;
        this.field7135[arg0][arg1] = arg6;
        this.field7110[arg0][arg1] = arg7;
        if (this.field7126 != null) {
            this.field7126[arg0][arg1] = arg5;
        }
        if (this.field7113 != null) {
            this.field7113[arg0][arg1] = arg3;
        }
        class781[] var16 = this.field7121[arg0][arg1] = new class781[arg6.length];
        for (int var17 = 0; arg6.length > var17; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field7108) != -1 && var18 != -1 && var15.method1174(var18, true).field9142) {
                var19 = 128;
                var18 = -1;
            }
            long var20 = (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (var19 << 14) | (long) var18;
            class101 var22;
            for (var22 = this.field7147.method3953(var20, 14); var22 != null; var22 = this.field7147.method3958(-15797)) {
                class781 var23 = (class781) var22;
                if (~var23.field10703 == ~var18 && (float) var19 == var23.field10705 && var23.field10709 == arg10 && var23.field10724 == arg11 && ~var23.field10700 == ~arg12) {
                    break;
                }
            }
            if (var22 != null) {
                var16[var17] = (class781) var22;
            } else {
                var16[var17] = new class781(this, var18, var19, arg10, arg11, arg12);
                this.field7147.method3962(var20, var16[var17], -127);
            }
        }
        if (arg13) {
            this.field7117[arg0][arg1] = (byte) class213.method1409(this.field7117[arg0][arg1], 1);
        }
        if (~arg6.length < ~this.field7142) {
            this.field7142 = arg6.length;
        }
        this.field7144 += arg6.length;
    }
}
