import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class528 {

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Lmf;")
    private class439 field7551;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "Lpj;")
    private class156 field7553;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field7540;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    private int field7545;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[B")
    public byte[] field7543;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    private int field7539;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    private int field7535;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    private int field7546;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
    public static int[] field7549 = new int[32];

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lqaa;")
    public static class29 field7541;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[[Lpe;")
    private class634[][] field7552;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 3)
    public final void method3184(int arg0) {
        field7544++;
        this.field7552 = new class634[this.field7535][this.field7546];
        for (int var2 = 0; var2 < this.field7546; var2++) {
            for (int var4 = 0; var4 < this.field7535; var4++) {
                this.field7552[var4][var2] = new class634(this.field7553, this, this.field7551, var4, var2, this.field7539, var4 * 128 + 1, var2 * 128 + 1);
                if (this.field7552[var4][var2].field8899 == 0) {
                    this.field7552[var4][var2] = null;
                }
            }
        }
        int var3 = 102 / ((80 - arg0) / 42);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILr;I)Z", line = 39)
    public final boolean method3185(int arg0, int arg1, class194 arg2, int arg3) {
        field7536++;
        class776 var5 = (class776) arg2;
        int var6 = var5.field10668 + arg3 + 1;
        int var7 = var5.field10660 + arg1 + 1;
        int var8 = this.field7540 * var6 + var7;
        int var9 = var5.field10657;
        int var10 = var5.field10658;
        int var11 = this.field7540 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var6 = 1;
            var8 += this.field7540 * var12;
        }
        if (this.field7545 <= var6 + var9) {
            int var13 = var9 + var6 + 1 - this.field7545;
            var9 -= var13;
        }
        if (var7 <= arg0) {
            int var14 = 1 - var7;
            var7 = 1;
            var11 += var14;
            var10 -= var14;
            var8 += var14;
        }
        if (this.field7540 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field7540;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field7540 + var11;
            return class521.method3134(var9, this.field7543, var8, var10, var16, var17, (byte) 107);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZIILr;)V", line = 111)
    public final void method3186(boolean arg0, int arg1, int arg2, class194 arg3) {
        field7550++;
        class776 var5 = (class776) arg3;
        int var6 = var5.field10668 + arg1 + 1;
        int var7 = var5.field10660 + arg2 + 1;
        int var8 = this.field7540 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field10657;
        int var11 = var5.field10658;
        int var12 = this.field7540 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var9 += var11 * var14;
            var6 = 1;
            var8 += this.field7540 * var14;
            var10 -= var14;
        }
        if (var6 + var10 >= this.field7545) {
            int var15 = var6 + var10 + 1 - this.field7545;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var9 += var16;
            var13 += var16;
            var11 -= var16;
            var7 = 1;
            var12 += var16;
        }
        if (this.field7540 <= (var7 + var11)) {
            int var17 = var7 + 1 - (-var11 - -this.field7540);
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class576.method3381(var10, this.field7543, var8, var12, var9, var11, var13, var5.field10664, arg0);
            this.method3191(15104, var7, var11, var10, var6);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZB[[ZIII)V", line = 180)
    public final void method3187(boolean arg0, byte arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        field7542++;
        this.field7553.method1188(false, 1);
        if (arg1 >= -31) {
            this.field7545 = 71;
        }
        this.field7553.method1133(16, false);
        this.field7553.method1101(false, 1);
        this.field7553.method1189(108, 1);
        this.field7553.method1073(false, -2, false, -1);
        float var7 = 1.0F / (float) (this.field7553.field2412 * 128);
        if (arg0) {
            for (int var26 = 0; var26 < this.field7546; var26++) {
                int var27 = var26 << this.field7539;
                int var28 = var26 + 1 << this.field7539;
                label94: for (int var29 = 0; var29 < this.field7535; var29++) {
                    if (this.field7552[var29][var26] != null) {
                        int var30 = var29 << this.field7539;
                        int var31 = var29 + 1 << this.field7539;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if ((-arg5) <= (var32 - arg4) && (var32 - arg4) <= arg5) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if ((-arg5) <= (var33 - arg3) && (var33 - arg3) <= arg5 && arg2[var32 + arg5 - arg4][var33 + arg5 - arg3]) {
                                        class385 var34 = this.field7553.method1161(256);
                                        var34.method2398(var7, var7, 1.0F, 0);
                                        var34.method1878(-var29, -var26, 0);
                                        this.field7553.method1152(125, class448.field6129);
                                        this.field7552[var29][var26].method3625((byte) -30);
                                        continue label94;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field7546; var8++) {
                int var9 = var8 << this.field7539;
                int var10 = var8 + 1 << this.field7539;
                for (int var11 = 0; var11 < this.field7535; var11++) {
                    class634 var12 = this.field7552[var11][var8];
                    if (var12 != null) {
                        class535 var13 = this.field7553.method1116((byte) -109, var12.field8899 * 3);
                        Buffer var14 = var13.method605((byte) -24, true);
                        if (var14 != null) {
                            Stream var15 = this.field7553.method1190(0, var14);
                            int var16 = 0;
                            int var17 = var11 << this.field7539;
                            int var18 = var11 + 1 << this.field7539;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if ((-arg5) <= (var19 - arg3) && arg5 >= (var19 - arg3)) {
                                    int var21 = this.field7551.field4289 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if (-arg5 <= var22 - arg4 && (var22 - arg4) <= arg5 && arg2[var22 + arg5 - arg4][var19 + arg5 - arg3]) {
                                            short[] var23 = this.field7551.field5942[var21];
                                            if (var23 != null) {
                                                if (Stream.method3953()) {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var16++;
                                                        var15.method3947(var23[var24] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var16++;
                                                        var15.method3954(var23[var25] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3945();
                            if (var13.method601(-108) && var16 > 0) {
                                class385 var20 = this.field7553.method1161(256);
                                var20.method2398(var7, var7, 1.0F, 0);
                                var20.method1878(-var11, -var8, 0);
                                this.field7553.method1152(113, class448.field6129);
                                var12.method3626(var13, var16 / 3, true);
                            }
                        }
                    }
                }
            }
        }
        this.field7553.method1182((byte) -47);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI[BI)Ljava/lang/String;", line = 385)
    public static final String method3188(byte arg0, int arg1, byte[] arg2, int arg3) {
        field7537++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        if (arg0 <= 28) {
            field7541 = null;
        }
        int var6 = arg3;
        int var7 = arg1 + arg3;
        while (var6 < var7) {
            int var8 = arg2[var6++] & 0xFF;
            int var9;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var9 = 65533;
                } else if (var8 >= 224) {
                    if (var8 < 240) {
                        if ((var6 + 1) < var7 && (arg2[var6] & 0xC0) == 128 && (arg2[var6 + 1] & 0xC0) == 128) {
                            var9 = (var8 & 0xF) << 12 | arg2[var6++] & 0x3F << 6 | arg2[var6++] & 0x3F;
                            if (var9 < 2048) {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else if (var8 >= 248) {
                        var9 = 65533;
                    } else if (var6 + 2 < var7 && (arg2[var6] & 0xC0) == 128 && (arg2[var6 + 1] & 0xC0) == 128 && (arg2[var6 + 2] & 0xC0) == 128) {
                        int var10 = arg2[var6++] & 0x3F << 12 | (var8 & 0x7) << 18 | arg2[var6++] & 0x3F << 6 | arg2[var6++] & 0x3F;
                        if (var10 >= 65536 && var10 <= 1114111) {
                            var9 = 65533;
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var7 > var6 && (arg2[var6] & 0xC0) == 128) {
                    var9 = (var8 & 0x1F) << 6 | arg2[var6++] & 0x3F;
                    if (var9 < 128) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 == 0) {
                var9 = 65533;
            } else {
                var9 = var8;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 475)
    public static void method3189(byte arg0) {
        field7549 = null;
        if (arg0 == 33) {
            field7541 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILr;BI)V", line = 489)
    public final void method3190(int arg0, class194 arg1, byte arg2, int arg3) {
        field7538++;
        class776 var5 = (class776) arg1;
        int var6 = var5.field10660 + arg0 + 1;
        int var7 = var5.field10668 + arg3 + 1;
        if (arg2 >= -98) {
            this.field7551 = null;
        }
        int var8 = this.field7540 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field10657;
        int var11 = var5.field10658;
        int var12 = this.field7540 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var7 = 1;
            var8 += this.field7540 * var14;
            var9 += var11 * var14;
        }
        if (this.field7545 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field7545;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var13 += var16;
            var6 = 1;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if ((var6 + var11) >= this.field7540) {
            int var17 = var6 + var11 + 1 - this.field7540;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class565.method3330(var13, var5.field10664, var12, -1, var11, var10, this.field7543, var8, var9);
            this.method3191(15104, var6, var11, var10, var7);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V", line = 561)
    private final void method3191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7547++;
        if (this.field7552 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg2 - 1 - 1 >> 7;
        int var8 = arg4 - 1 >> 7;
        if (arg0 != 15104) {
            return;
        }
        int var9 = arg3 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class634[] var11 = this.field7552[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field8904 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lpj;Lmf;)V", line = 612)
    public class528(class156 arg0, class439 arg1) {
        this.field7551 = arg1;
        this.field7553 = arg0;
        this.field7540 = (this.field7551.field4289 * this.field7551.field4284 >> this.field7553.field2466) + 2;
        this.field7545 = (this.field7551.field4290 * this.field7551.field4284 >> this.field7553.field2466) + 2;
        this.field7543 = new byte[this.field7545 * this.field7540];
        this.field7539 = this.field7553.field2466 + 7 - this.field7551.field4285;
        this.field7535 = this.field7551.field4289 >> this.field7539;
        this.field7546 = this.field7551.field4290 >> this.field7539;
    }
}
