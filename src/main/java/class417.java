import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class417 extends class270 {

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "Lod;")
    private class463 field5536;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "Lap;")
    private class435 field5548;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "Lmh;")
    private class575 field5530;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    private int field5545;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    private int field5552;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    private int field5527;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    private int field5531;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "[[F")
    private float[][] field5549;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "[[F")
    private float[][] field5541;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "[[F")
    private float[][] field5540;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "Liaa;")
    private class452 field5550;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "Ljh;")
    private class146 field5532;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "Ltq;")
    private class572 field5528;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "Lfm;")
    private class669 field5546;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "Lrl;")
    private class659 field5533;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "Ljl;")
    private class245 field5551;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "Ljl;")
    private class245 field5553;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    private int field5542;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "[I")
    public static int[] field5534 = new int[200];

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    private int field5544;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "[I")
    public static int[] field5539;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V")
    public static final void method2254(boolean arg0) {
        class508.method2921(11, (byte) -107);
        field5547++;
        if (arg0) {
            method2260(-10);
        }
        class426.method2301(-16842);
        System.gc();
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(SZ)V")
    private final void method2255(short arg0, boolean arg1) {
        field5543++;
        if (!arg1) {
            return;
        }
        if (this.field5548.field6030) {
            this.field5550.method2537(18244, arg0);
        } else {
            this.field5550.method2568((byte) -31, arg0);
        }
        this.field5542++;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B[[ZIII)V")
    public final void method2256(byte arg0, boolean[][] arg1, int arg2, int arg3, int arg4) {
        field5538++;
        if (this.field5546 == null || arg2 + arg3 < this.field5545 || (arg3 - arg2) > this.field5552 || this.field5527 > arg4 + arg2 || this.field5531 < (arg4 - arg2)) {
            return;
        }
        int var6 = this.field5527;
        int var7 = -37 / ((-arg0 - 60) / 56);
        while (var6 <= this.field5531) {
            for (int var8 = this.field5545; var8 <= this.field5552; var8++) {
                int var9 = var8 - arg3;
                int var10 = var6 - arg4;
                if ((-arg2) < var9 && arg2 > var9 && (-arg2) < var10 && arg2 > var10 && arg1[arg2 + var9][var10 + arg2]) {
                    this.field5548.method2327(-28003, (int) (this.field5536.method2635(-93) * 255.0F) << 24);
                    this.field5548.method2379(this.field5551, 15132, null, this.field5553, null);
                    this.field5548.method2364(this.field5542, 0, 4, (byte) 99, this.field5546);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2257(int arg0, String arg1) {
        field5535++;
        if (arg0 != 1) {
            field5539 = null;
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + class289.method1637(arg1.charAt(var4), (byte) -128)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIIII)V")
    private final void method2258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5529++;
        long var8 = -1L;
        int var10 = (arg5 << this.field5530.field1560) + arg1;
        int var11 = arg2 + (arg6 << this.field5530.field1560);
        int var12 = this.field5530.method242(var10, var11);
        if ((arg1 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class270 var13 = this.field5528.method3234((byte) -76, var8);
            if (var13 != null) {
                this.method2255(((class498) var13).field7187, true);
                return;
            }
        }
        short var14 = (short) (this.field5544++);
        if (var8 != -1L) {
            this.field5528.method3235(var8, -1, new class498(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg2 == 0) {
            var15 = this.field5541[arg4][arg3];
            var16 = this.field5540[arg4][arg3];
            var17 = this.field5549[arg4][arg3];
        } else if (this.field5530.field1561 == arg1 && arg2 == 0) {
            var16 = this.field5540[arg4 + 1][arg3];
            var15 = this.field5541[arg4 + 1][arg3];
            var17 = this.field5549[arg4 + 1][arg3];
        } else if (this.field5530.field1561 == arg1 && this.field5530.field1561 == arg2) {
            var17 = this.field5549[arg4 + 1][arg3 + 1];
            var16 = this.field5540[arg4 + 1][arg3 + 1];
            var15 = this.field5541[arg4 + 1][arg3 + 1];
        } else if (arg1 == 0 && this.field5530.field1561 == arg2) {
            var17 = this.field5549[arg4][arg3 + 1];
            var15 = this.field5541[arg4][arg3 + 1];
            var16 = this.field5540[arg4][arg3 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field5530.field1561;
            float var19 = (float) arg2 / (float) this.field5530.field1561;
            float var20 = this.field5549[arg4][arg3];
            float var21 = this.field5541[arg4][arg3];
            float var22 = this.field5540[arg4][arg3];
            float var23 = this.field5549[arg4 + 1][arg3];
            float var24 = this.field5541[arg4 + 1][arg3];
            float var25 = (this.field5541[arg4 + 1][arg3 + 1] - var24) * var18 + var24;
            float var26 = (this.field5549[arg4][arg3 + 1] - var20) * var18 + var20;
            float var27 = (this.field5540[arg4][arg3 + 1] - var22) * var18 + var22;
            float var28 = (this.field5549[arg4 + 1][arg3 + 1] - var23) * var18 + var23;
            float var29 = (this.field5541[arg4][arg3 + 1] - var21) * var18 + var21;
            float var30 = this.field5540[arg4 + 1][arg3];
            var17 = (var28 - var26) * var19 + var26;
            float var31 = (this.field5540[arg4 + 1][arg3 + 1] - var30) * var18 + var30;
            var15 = (var25 - var29) * var19 + var29;
            var16 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field5536.method2640(-2049) - var10);
        float var33 = (float) (this.field5536.method2638((byte) -75) - var12);
        float var34 = (float) (this.field5536.method2641((byte) -14) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var33 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field5536.method2637(59);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var37 + var15 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field5536.method2634(true);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > arg0) {
            var47 = 255;
        }
        if (this.field5548.field6030) {
            this.field5532.method797((float) var10, (byte) 84);
            this.field5532.method797((float) var12, (byte) 107);
            this.field5532.method797((float) var11, (byte) -18);
        } else {
            this.field5532.method796(6144, (float) var10);
            this.field5532.method796(6144, (float) var12);
            this.field5532.method796(6144, (float) var11);
        }
        this.field5532.method2525(var45, -81849);
        this.field5532.method2525(var46, arg0 - 82104);
        this.field5532.method2525(var47, arg0 ^ 0xFFFEC0B8);
        this.field5532.method2525(255, -81849);
        this.method2255(var14, true);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)I")
    public static final int method2259(int arg0, boolean arg1) {
        field5537++;
        return arg1 ? 93 : arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method2260(int arg0) {
        field5539 = null;
        field5534 = null;
        if (arg0 < 80) {
            field5539 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lap;Lmh;Lod;[I)V")
    public class417(class435 arg0, class575 arg1, class463 arg2, int[] arg3) {
        this.field5536 = arg2;
        this.field5548 = arg0;
        this.field5530 = arg1;
        int var5 = this.field5536.method2637(98) - (arg1.field1561 >> 1);
        this.field5545 = this.field5536.method2640(-2049) - var5 >> arg1.field1560;
        this.field5552 = var5 + this.field5536.method2640(-2049) >> arg1.field1560;
        this.field5527 = this.field5536.method2641((byte) -14) - var5 >> arg1.field1560;
        this.field5531 = var5 + this.field5536.method2641((byte) -14) >> arg1.field1560;
        int var6 = this.field5552 + 1 - this.field5545;
        int var7 = this.field5531 + 1 - this.field5527;
        this.field5549 = new float[var6 + 1][var7 + 1];
        this.field5541 = new float[var6 + 1][var7 + 1];
        this.field5540 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var26 = this.field5527 + var8;
            if (var26 > 0 && var26 < (this.field5530.field1562 - 1)) {
                for (int var27 = 0; var27 <= var6; var27++) {
                    int var28 = this.field5545 + var27;
                    if (var28 > 0 && var28 < (this.field5530.field1558 - 1)) {
                        int var29 = arg1.method253(var28 + 1, var26) - arg1.method253(var28 - 1, var26);
                        int var30 = arg1.method253(var28, var26 + 1) - arg1.method253(var28, var26 - 1);
                        float var31 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + (var30 * var30) + 65536)));
                        this.field5549[var27][var8] = (float) var29 * var31;
                        this.field5541[var27][var8] = var31 * -256.0F;
                        this.field5540[var27][var8] = (float) var30 * var31;
                    }
                }
            }
        }
        byte var9 = 0;
        int var10 = 0;
        for (int var11 = this.field5527; var11 <= this.field5531; var11++) {
            if (var11 >= 0 && arg1.field1562 > var11) {
                for (int var22 = this.field5545; var22 <= this.field5552; var22++) {
                    if (var22 >= 0 && var22 < arg1.field1558) {
                        int var23 = arg3[var10];
                        int[] var24 = arg1.field8189[var22][var11];
                        if (var24 != null && var23 != 0) {
                            if (var23 == 1) {
                                int var25 = 0;
                                while (var24.length > var25) {
                                    if (var24[var25++] != -1 && var24[var25++] != -1 && var24[var25++] != -1) {
                                        this.field5542 += 3;
                                    }
                                }
                            } else {
                                this.field5542 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field5552 - this.field5545;
            }
        }
        if (var9 > 0) {
            this.field5550 = new class452(var9 * 2);
            this.field5532 = new class146(var9 * 16);
            this.field5528 = new class572(class146.method799(var9, -117));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field5527; var14 <= this.field5531; var14++) {
                if (var14 >= 0 && arg1.field1562 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field5545; var16 <= this.field5552; var16++) {
                        if (var16 >= 0 && arg1.field1558 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field8189[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    int[] var19 = arg1.field8169[var16][var14];
                                    int[] var20 = arg1.field8187[var16][var14];
                                    int var21 = 0;
                                    label111: while (true) {
                                        while (true) {
                                            if (var21 >= var18.length) {
                                                break label111;
                                            }
                                            if (var18[var21] == -1 || var18[var21 + 1] == -1 || var18[var21 + 2] == -1) {
                                                var21 += 3;
                                            } else {
                                                this.method2258(255, var19[var21], var20[var21], var12, var15, var16, var14);
                                                var21++;
                                                this.method2258(255, var19[var21], var20[var21], var12, var15, var16, var14);
                                                var21++;
                                                this.method2258(255, var19[var21], var20[var21], var12, var15, var16, var14);
                                                var21++;
                                            }
                                        }
                                    }
                                } else if (var17 == 3) {
                                    this.method2258(255, 0, 0, var12, var15, var16, var14);
                                    this.method2258(255, arg1.field1561, 0, var12, var15, var16, var14);
                                    this.method2258(255, 0, arg1.field1561, var12, var15, var16, var14);
                                } else if (var17 == 2) {
                                    this.method2258(255, arg1.field1561, 0, var12, var15, var16, var14);
                                    this.method2258(255, arg1.field1561, arg1.field1561, var12, var15, var16, var14);
                                    this.method2258(255, 0, 0, var12, var15, var16, var14);
                                } else if (var17 == 5) {
                                    this.method2258(255, arg1.field1561, arg1.field1561, var12, var15, var16, var14);
                                    this.method2258(255, 0, arg1.field1561, var12, var15, var16, var14);
                                    this.method2258(255, arg1.field1561, 0, var12, var15, var16, var14);
                                } else if (var17 == 4) {
                                    this.method2258(255, 0, arg1.field1561, var12, var15, var16, var14);
                                    this.method2258(255, 0, 0, var12, var15, var16, var14);
                                    this.method2258(255, arg1.field1561, arg1.field1561, var12, var15, var16, var14);
                                }
                            }
                        }
                        var15++;
                        var13++;
                    }
                } else {
                    var13 += this.field5552 - this.field5545;
                }
                var12++;
            }
            this.field5546 = this.field5548.method2381(false, (byte) -76, this.field5550.field6209, this.field5550.field6215, 5123);
            this.field5533 = this.field5548.method2397(this.field5532.field6209, false, 16, this.field5532.field6215, (byte) -77);
            this.field5551 = new class245(this.field5533, 5126, 3, 0);
            this.field5553 = new class245(this.field5533, 5121, 4, 12);
        } else {
            this.field5533 = null;
            this.field5553 = null;
            this.field5551 = null;
            this.field5546 = null;
        }
        this.field5528 = null;
        this.field5550 = null;
        this.field5532 = null;
        this.field5549 = this.field5541 = this.field5540 = null;
    }
}
