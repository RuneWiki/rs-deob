import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class233 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lfc;")
    private class575 field3114;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Los;")
    private class247 field3128;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public int field3121;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    private int field3118;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "[B")
    public byte[] field3127;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    private int field3117;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    private int field3120;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    private int field3115;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Loca;")
    public static class573 field3110 = new class573();

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "[I")
    public static int[] field3126 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Luc;")
    public static class229 field3129 = new class229(0, 0);

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Ldg;")
    public static class193 field3130;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[[Lms;")
    private class44[][] field3116;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 4)
    public final void method1475(int arg0) {
        this.field3116 = new class44[this.field3120][this.field3115];
        field3125++;
        if (arg0 != 1) {
            return;
        }
        for (int var2 = 0; var2 < this.field3115; var2++) {
            for (int var3 = 0; var3 < this.field3120; var3++) {
                this.field3116[var3][var2] = new class44(this.field3114, this, this.field3128, var3, var2, this.field3117, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field3116[var3][var2].field620 == 0) {
                    this.field3116[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V", line = 40)
    public static final void method1476(byte arg0, int arg1) {
        field3119++;
        if (arg0 < 33) {
            field3126 = null;
        }
        class377.method2159((byte) 112);
        int var2 = class543.field7052.method3023(true, arg1).field4106;
        if (var2 == 0) {
            return;
        }
        int var3 = class397.field5054.field3736[arg1];
        if (var2 == 5) {
            class457.field5994 = var3;
        }
        if (var2 == 6) {
            class645.field8991 = var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lw;III)V", line = 66)
    public final void method1477(class605 arg0, int arg1, int arg2, int arg3) {
        field3123++;
        class640 var5 = (class640) arg0;
        int var6 = var5.field8899 + arg1 + 1;
        int var7 = var5.field8905 + arg3 + 1;
        int var8 = this.field3121 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field8900;
        if (arg2 != 1) {
            this.method1475(43);
        }
        int var11 = var5.field8907;
        int var12 = this.field3121 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var6 = 1;
            var8 += this.field3121 * var14;
            var10 -= var14;
        }
        if (this.field3118 <= var6 + var10) {
            int var15 = var6 - (this.field3118 - var10 - 1);
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var7 = 1;
            var11 -= var16;
            var8 += var16;
            var13 += var16;
            var9 += var16;
        }
        if (this.field3121 <= var7 + var11) {
            int var17 = var7 + var11 + 1 - this.field3121;
            var13 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class426.method2450(var11, (byte) 117, var8, var10, var13, var5.field8903, var12, this.field3127, var9);
            this.method1478(var7, var10, var11, (byte) 105, var6);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIBI)V", line = 138)
    private final void method1478(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3124++;
        if (this.field3116 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 - (1 - arg2) - 1 >> 7;
        if (arg3 < 64) {
            this.method1478(20, 71, 124, (byte) 2, 57);
        }
        int var8 = arg4 - 1 >> 7;
        int var9 = arg4 + arg1 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class44[] var11 = this.field3116[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field609 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILw;II)V", line = 181)
    public final void method1479(int arg0, class605 arg1, int arg2, int arg3) {
        field3111++;
        class640 var5 = (class640) arg1;
        int var6 = var5.field8905 + arg0 + 1;
        int var7 = var5.field8899 + arg2 + 1;
        int var8 = this.field3121 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field8900;
        int var11 = var5.field8907;
        int var12 = this.field3121 - var11;
        if (arg3 <= ~var7) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var8 += this.field3121 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field3118) {
            int var15 = var10 + var7 + 1 - this.field3118;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var8 += var16;
            var6 = 1;
            var14 += var16;
            var11 -= var16;
            var12 += var16;
            var9 += var16;
        }
        if (var6 + var11 >= this.field3121) {
            int var17 = var6 + var11 + 1 - this.field3121;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class478.method2649(var9, var12, var14, var10, this.field3127, var5.field8903, var8, var11, false);
            this.method1478(var6, var10, var11, (byte) 122, var7);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 248)
    public static void method1480(byte arg0) {
        field3129 = null;
        field3110 = null;
        field3126 = null;
        field3130 = null;
        if (arg0 < 116) {
            field3126 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III[[ZIZ)V", line = 264)
    public final void method1481(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4, boolean arg5) {
        this.field3114.method3084(false, (byte) 76);
        field3113++;
        this.field3114.method3083(false, false);
        this.field3114.method3123(1, arg2 ^ 0x2);
        this.field3114.method3072((byte) -57, 1);
        if (arg2 != 3) {
            return;
        }
        this.field3114.method3065(false, false, 14721, -2);
        float var7 = 1.0F / (float) (this.field3114.field7684 * 128);
        if (arg5) {
            for (int var8 = 0; var8 < this.field3115; var8++) {
                int var9 = var8 << this.field3117;
                int var10 = var8 + 1 << this.field3117;
                label145: for (int var11 = 0; var11 < this.field3120; var11++) {
                    if (this.field3116[var11][var8] != null) {
                        int var12 = var11 << this.field3117;
                        int var13 = var11 + 1 << this.field3117;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if (-arg1 <= var14 - arg0 && var14 - arg0 <= arg1) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if (-arg1 <= var15 - arg4 && arg1 >= (var15 - arg4) && arg3[var14 - (arg0 - arg1)][arg1 + var15 - arg4]) {
                                        class131 var16 = this.field3114.method3125((byte) 125);
                                        var16.method955(1.0F, var7, 0, var7);
                                        var16.method143(-var11, -var8, 0);
                                        this.field3114.method3140(30604, class34.field500);
                                        this.field3116[var11][var8].method417(-128);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field3115; var17++) {
                int var18 = var17 << this.field3117;
                int var19 = var17 + 1 << this.field3117;
                for (int var20 = 0; var20 < this.field3120; var20++) {
                    class44 var21 = this.field3116[var20][var17];
                    if (var21 != null) {
                        class498 var22 = this.field3114.method3130(-10903, var21.field620 * 3);
                        Buffer var23 = var22.method647(false, true);
                        if (var23 != null) {
                            Stream var24 = this.field3114.method3087(var23, 6);
                            int var25 = 0;
                            int var26 = var20 << this.field3117;
                            int var27 = var20 + 1 << this.field3117;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if (-arg1 <= var28 - arg4 && arg1 >= var28 - arg4) {
                                    int var30 = this.field3128.field1166 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((-arg1) <= (var31 - arg0) && var31 - arg0 <= arg1 && arg3[var31 + arg1 - arg0][arg1 + var28 - arg4]) {
                                            short[] var32 = this.field3128.field3330[var30];
                                            if (var32 != null) {
                                                if (Stream.method1964()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method1961(var32[var34] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var24.method1959(var32[var33] & 0xFFFF);
                                                        var25++;
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method1955();
                            if (var22.method646(-108) && var25 > 0) {
                                class131 var29 = this.field3114.method3125((byte) -115);
                                var29.method955(1.0F, var7, 0, var7);
                                var29.method143(-var20, -var17, 0);
                                this.field3114.method3140(30604, class34.field500);
                                var21.method416(var25 / 3, false, var22);
                            }
                        }
                    }
                }
            }
        }
        this.field3114.method3114(15);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBIII)V", line = 464)
    public static final void method1482(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= arg4) {
            for (int var5 = arg4; var5 < arg0; var5++) {
                class213.field2746[var5][arg2] = arg3;
            }
        } else {
            for (int var6 = arg0; var6 < arg4; var6++) {
                class213.field2746[var6][arg2] = arg3;
            }
        }
        field3112++;
        if (arg1 > -97) {
            method1482(-76, (byte) 96, -30, 22, 102);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lw;III)Z", line = 503)
    public final boolean method1483(class605 arg0, int arg1, int arg2, int arg3) {
        field3122++;
        class640 var5 = (class640) arg0;
        int var6 = var5.field8905 + arg2 + 1;
        int var7 = var5.field8899 + arg3 + 1;
        int var8 = this.field3121 * var7 + var6;
        int var9 = var5.field8900;
        int var10 = var5.field8907;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var9 -= var11;
            var8 += this.field3121 * var11;
        }
        int var12 = this.field3121 - var10;
        if (this.field3118 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field3118;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var10 -= var14;
            var12 += var14;
            var6 = 1;
            var8 += var14;
        }
        if (var6 + var10 >= this.field3121) {
            int var15 = var6 + var10 + 1 - this.field3121;
            var10 -= var15;
            var12 += var15;
        }
        if (arg1 < var10 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field3121 + var12;
            return class276.method1675(var17, var16, this.field3127, var8, var9, (byte) 67, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lfc;Los;)V", line = 582)
    public class233(class575 arg0, class247 arg1) {
        this.field3114 = arg0;
        this.field3128 = arg1;
        this.field3121 = (this.field3128.field1166 * this.field3128.field1163 >> this.field3114.field7704) + 2;
        this.field3118 = (this.field3128.field1164 * this.field3128.field1163 >> this.field3114.field7704) + 2;
        this.field3127 = new byte[this.field3121 * this.field3118];
        this.field3117 = this.field3114.field7704 + 7 - this.field3128.field1168;
        this.field3120 = this.field3128.field1166 >> this.field3117;
        this.field3115 = this.field3128.field1164 >> this.field3117;
    }
}
