import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class392 {

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    private int field5543 = -1;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "Z")
    public boolean field5544 = true;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
    private int field5541;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "Lsr;")
    private class251 field5539;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "Llr;")
    private class750 field5540;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    private int field5534;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public int field5532;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Ldh;")
    private class320 field5536;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    private int field5549;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    private int field5535;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Lgfa;")
    private class749 field5533;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "Lqfa;")
    public static class98 field5538 = new class98(55, 4);

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
    public static int field5547 = 0;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "[C")
    private static char[] field5548 = new char[64];

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "[Loia;")
    public static class88[] field5545;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5548[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5548[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5548[var2] = (char) (var2 + 48 - 52);
        }
        field5548[62] = '*';
        field5548[63] = '-';
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLfp;)V", line = 6)
    public static final void method2464(boolean arg0, class323 arg1) {
        class508.field7273 = arg1.method2090(119, "p11_full");
        if (!arg0) {
            field5531++;
            class279.field3941 = arg1.method2090(117, "p12_full");
            class20.field299 = arg1.method2090(115, "b12_full");
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILbe;)I", line = 20)
    public static final int method2465(int arg0, class37 arg1) {
        field5542++;
        String var2 = class725.method4078(arg1, -127);
        int[] var3 = null;
        if (class727.method4086(-46, arg1.field463)) {
            var3 = class682.field9361.method3424((int) arg1.field474, false).field7686;
        } else if (arg1.field462 != -1) {
            var3 = class682.field9361.method3424(arg1.field462, false).field7686;
        } else if (class71.method592(arg1.field463, (byte) -94)) {
            class740 var4 = (class740) class373.field5230.method1180((byte) 26, (long) ((int) arg1.field474));
            if (var4 != null) {
                class468 var5 = var4.field10289;
                class353 var6 = var5.field6632;
                if (var6.field5026 != null) {
                    var6 = var6.method2273((byte) 29, class101.field1201);
                }
                if (var6 != null) {
                    var3 = var6.field5001;
                }
            }
        } else if (class636.method3537(8071, arg1.field463)) {
            Object var7 = null;
            class10 var8;
            if (arg1.field463 == 1004) {
                var8 = class612.field8588.method558((byte) 117, (int) arg1.field474);
            } else {
                var8 = class612.field8588.method558((byte) -117, (int) (arg1.field474 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field226 != null) {
                var8 = var8.method67(class101.field1201, arg0 ^ 0x4);
            }
            if (var8 != null) {
                var3 = var8.field219;
            }
        }
        if (arg0 != 4) {
            method2465(101, null);
        }
        if (var3 != null) {
            var2 = var2 + class473.method2831(var3, (byte) 104);
        }
        int var9 = class119.field1441.method991(class748.field10391, 15, var2);
        if (arg1.field471) {
            var9 += class322.field4456.method657() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 98)
    public static void method2466(byte arg0) {
        field5545 = null;
        if (arg0 != 28) {
            field5545 = null;
        }
        field5538 = null;
        field5548 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILgfa;I)V", line = 112)
    public final void method2467(int arg0, class749 arg1, int arg2) {
        field5537++;
        if (arg2 > 0) {
            this.method2468((byte) -99);
            this.field5539.method1663(this.field5536, -2);
            this.field5539.method1475(this.field5549 + 1 - this.field5535, arg2, class441.field6289, -17390, this.field5535, arg1, 0);
        }
        if (arg0 != 20369) {
            this.field5536 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V", line = 131)
    private final void method2468(byte arg0) {
        field5550++;
        if (!this.field5544) {
            return;
        }
        this.field5544 = false;
        byte[] var2 = this.field5540.field10405;
        int var3 = 0;
        int var4 = this.field5540.field10419;
        int var5 = this.field5540.field10419 * this.field5541 + this.field5534;
        if (arg0 != -99) {
            return;
        }
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field5536 != null && this.field5543 == var3) {
            this.field5544 = false;
            return;
        }
        this.field5543 = var3;
        int var7 = this.field5541 * var4 + this.field5534;
        int var8 = 0;
        if (!this.field5539.method1444(class309.field4305, class233.field3143, (byte) -45)) {
            if (class633.field8739 == null) {
                class633.field8739 = new int[16384];
            }
            int[] var13 = class633.field8739;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var7] == 0) {
                        int var16 = 0;
                        if (var2[var7 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var7 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var4 + var7] != 0) {
                            var16++;
                        }
                        var13[var8++] = var16 * 17 << 24;
                    } else {
                        var13[var8++] = 1140850688;
                    }
                    var7++;
                }
                var7 += this.field5540.field10419 - 128;
            }
            if (this.field5536 == null) {
                this.field5536 = this.field5539.method1650(128, class633.field8739, false, 128, false);
                this.field5536.method1317(28970, false, false);
            } else {
                this.field5536.method1320(128, 128, class633.field8739, 0, true, 0, 128, 0);
            }
            return;
        }
        if (class699.field9761 == null) {
            class699.field9761 = new byte[16384];
        }
        byte[] var9 = class699.field9761;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var7] == 0) {
                    int var12 = 0;
                    if (var2[var7 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var7 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var7] != 0) {
                        var12++;
                    }
                    var9[var8++] = (byte) (var12 * 17);
                } else {
                    var9[var8++] = 68;
                }
                var7++;
            }
            var7 += this.field5540.field10419 - 128;
        }
        if (this.field5536 == null) {
            this.field5536 = this.field5539.method1612(false, class233.field3143, class699.field9761, 108, 128, 128);
            this.field5536.method1317(28970, false, false);
        } else {
            this.field5536.method1325(0, class233.field3143, 128, 0, 128, class699.field9761, true, 128, 0);
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lsr;Llr;Laca;IIIII)V", line = 338)
    public class392(class251 arg0, class750 arg1, class726 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field5541 = arg7;
        this.field5539 = arg0;
        this.field5540 = arg1;
        this.field5534 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field3935 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field10129[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field5532 = 0;
            this.field5536 = null;
        } else {
            this.field5549 = Integer.MIN_VALUE;
            this.field5535 = Integer.MAX_VALUE;
            this.field5533 = this.field5539.method1485((byte) 111, false);
            this.field5533.method2157(var10, (byte) -92);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field5533.method2154(27599, true);
                if (var15 != null) {
                    Stream var16 = this.field5539.method1666(var15, true);
                    if (Stream.method3662()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field3935 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field10129[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field5535) {
                                            this.field5535 = var22;
                                        }
                                        if (this.field5549 < var22) {
                                            this.field5549 = var22;
                                        }
                                        var16.method3654(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field3935 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field10129[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 < this.field5535) {
                                            this.field5535 = var28;
                                        }
                                        if (this.field5549 < var28) {
                                            this.field5549 = var28;
                                        }
                                        var16.method3655(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3656();
                    if (this.field5533.method2156((byte) 117)) {
                        break;
                    }
                }
            }
            this.field5532 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 319)
    public final void method2469(int arg0) {
        if (arg0 == 0) {
            this.method2467(20369, this.field5533, this.field5532);
            field5546++;
        }
    }
}
