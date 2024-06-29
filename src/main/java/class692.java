import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class692 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public int field9518 = -1;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "[I")
    public static int[] field9536 = new int[200];

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "I")
    public static int field9542 = 0;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field9521;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field9524;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field9530;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field9533;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
    public static int field9535;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lkk;")
    private class188 field9525;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Ljava/lang/String;")
    private String field9520;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Ljava/lang/String;")
    private String field9523;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[I")
    private int[] field9522;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "[I")
    private int[] field9527;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "[I")
    private int[] field9528;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[I")
    private int[] field9529;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
    private int[] field9532;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "[I")
    private int[] field9538;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "[I")
    private int[] field9540;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "[I")
    private int[] field9541;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field9519;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "[Ljava/lang/String;")
    private String[] field9539;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "[[I")
    private int[][] field9534;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "[[I")
    private int[][] field9537;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "[[I")
    private int[][] field9543;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method3888(byte arg0) {
        field9521++;
        if (class333.method2179(class222.field2897, (byte) -90) || class307.method2010(class222.field2897, -8714)) {
            class119.method823(class32.field426 >> 12, class511.field7303 >> 12, 16777215, 5000);
        } else {
            int var1 = class660.field9039.field8009[0] >> 3;
            int var2 = class660.field9039.field8015[0] >> 3;
            if (var1 >= 0 && class336.field4683 >> 3 > var1 && var2 >= 0 && var2 < class700.field9768 >> 3) {
                class119.method823(var2, var1, 16777215, 5000);
            } else {
                class119.method823(class700.field9768 >> 4, class336.field4683 >> 4, 16777215, 0);
            }
        }
        if (arg0 < -46) {
            class661.method3625(5);
            class461.method2737(-5100);
            class642.method3552(126);
            class711.method3998(27920);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public static final void method3889(byte arg0) {
        int var1 = 125 / ((arg0 + 47) / 50);
        for (int var2 = 0; var2 < class557.field7828; var2++) {
            class319 var4 = class503.field7212[var2];
            boolean var5 = false;
            if (var4.field4428 == null) {
                var4.field4422--;
                if (var4.field4422 >= (var4.method2067((byte) -87) ? -1500 : -10)) {
                    if (var4.field4421 == 1 && var4.field4425 == null) {
                        var4.field4425 = class214.method1314(class727.field10173, var4.field4420, 0);
                        if (var4.field4425 == null) {
                            continue;
                        }
                        var4.field4422 += var4.field4425.method1315();
                    } else if (var4.method2067((byte) -87) && (var4.field4415 == null || var4.field4419 == null)) {
                        if (var4.field4415 == null) {
                            var4.field4415 = class163.method1068(class530.field7473, var4.field4420);
                        }
                        if (var4.field4415 == null) {
                            continue;
                        }
                        if (var4.field4419 == null) {
                            var4.field4419 = var4.field4415.method1078(new int[] { 22050 });
                            if (var4.field4419 == null) {
                                continue;
                            }
                        }
                    }
                    if (var4.field4422 < 0) {
                        int var6 = 8192;
                        int var7;
                        if (var4.field4427 == 0) {
                            var7 = var4.field4424 * (var4.field4421 == 3 ? class557.field7812.field6545.method3029(false) : class557.field7812.field6527.method3029(false)) >> 2;
                        } else {
                            int var8 = (var4.field4427 & 0x3F44704) >> 24;
                            if (class660.field9039.field1266 == var8) {
                                int var9 = (var4.field4427 & 0xFF) << 9;
                                int var10 = class660.field9039.method1835((byte) 127) << 8;
                                int var11 = var4.field4427 >> 16 & 0xFF;
                                int var12 = (var11 << 9) + var10 + 256 - class660.field9039.field1264;
                                int var13 = (var4.field4427 & 0xFFC2) >> 8;
                                int var14 = (var13 << 9) + var10 + 256 - class660.field9039.field1250;
                                int var15 = Math.abs(var12) - (512 - Math.abs(var14));
                                if (var9 < var15) {
                                    var4.field4422 = -99999;
                                    continue;
                                }
                                if (var15 < 0) {
                                    var15 = 0;
                                }
                                var7 = class557.field7812.field6550.method3029(false) * (var9 - var15) * var4.field4424 / var9 >> 2;
                                if (var4.field4416 != null && var4.field4416 instanceof class524) {
                                    class524 var16 = (class524) var4.field4416;
                                    short var17 = var16.field7415;
                                    short var18 = var16.field7418;
                                }
                                if (var12 != 0 || var14 != 0) {
                                    int var19 = (-class720.field9994 - (int) (Math.atan2((double) var12, (double) var14) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var19 > 8192) {
                                        var19 = 16384 - var19;
                                    }
                                    int var20;
                                    if (var15 <= 0) {
                                        var20 = 8192;
                                    } else if (var15 >= 4096) {
                                        var20 = 16384;
                                    } else {
                                        var20 = (8192 - var15) / 4096 + 8192;
                                    }
                                    var6 = (16384 - var20 >> 1) + var19 * var20 / 8192;
                                }
                            } else {
                                var7 = 0;
                            }
                        }
                        if (var7 > 0) {
                            class490 var21 = null;
                            if (var4.field4421 == 1) {
                                var21 = var4.field4425.method1312().method2923(class712.field9905);
                            } else if (var4.method2067((byte) -87)) {
                                var21 = var4.field4419;
                            }
                            class379 var22 = var4.field4428 = class379.method2389(var21, var4.field4417, var7, var6);
                            var22.method2383(var4.field4429 - 1);
                            class192.field2560.method1728(var22);
                        }
                    }
                } else {
                    var5 = true;
                }
            } else if (!var4.field4428.method1187(0)) {
                var5 = true;
            }
            if (var5) {
                class557.field7828--;
                for (int var23 = var2; var23 < class557.field7828; var23++) {
                    class503.field7212[var23] = class503.field7212[var23 + 1];
                }
                var2--;
            }
        }
        field9531++;
        if (class105.field1268 && !class70.method576(-21552)) {
            if (class557.field7812.field6547.method3029(false) != 0 && class118.field1431 != -1) {
                if (class79.field1006 == null) {
                    class658.method3616(class557.field7812.field6547.method3029(false), class118.field1431, 0, false, class587.field8276, 0);
                } else {
                    class378.method2373(class118.field1431, class557.field7812.field6547.method3029(false), class587.field8276, (byte) 107, class79.field1006, false, 0);
                }
            }
            class105.field1268 = false;
            class79.field1006 = null;
        } else if (class557.field7812.field6547.method3029(false) != 0 && class118.field1431 != -1 && !class70.method576(-21552)) {
            class56.field671++;
            class519 var3 = class357.method2293(class427.field5994, class218.field2844, (byte) 118);
            var3.field7384.method3733(-49, class118.field1431);
            class151.method1027(var3, -115);
            class118.field1431 = -1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lee;I)V")
    public final void method3890(class675 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                if (arg1 <= 122) {
                    return;
                }
                field9533++;
                return;
            }
            this.method3892(arg0, var3, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public final void method3891(int arg0) {
        field9535++;
        if (this.field9523 == null) {
            this.field9523 = this.field9520;
        }
        if (arg0 != -16661) {
            this.field9534 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lee;IB)V")
    private final void method3892(class675 arg0, int arg1, byte arg2) {
        if (arg2 != -20) {
            return;
        }
        field9526++;
        if (arg1 == 1) {
            this.field9520 = arg0.method3726(-73);
        } else if (arg1 == 2) {
            this.field9523 = arg0.method3726(-61);
        } else if (arg1 == 3) {
            int var22 = arg0.method3750((byte) 35);
            this.field9537 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field9537[var23][0] = arg0.method3757((byte) -65);
                this.field9537[var23][1] = arg0.method3703(112);
                this.field9537[var23][2] = arg0.method3703(118);
            }
        } else if (arg1 == 4) {
            int var20 = arg0.method3750((byte) 35);
            this.field9543 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field9543[var21][0] = arg0.method3757((byte) -65);
                this.field9543[var21][1] = arg0.method3703(arg2 + 127);
                this.field9543[var21][2] = arg0.method3703(96);
            }
        } else if (arg1 == 5) {
            arg0.method3757((byte) -65);
        } else if (arg1 == 6) {
            arg0.method3750((byte) 35);
        } else if (arg1 == 7) {
            arg0.method3750((byte) 35);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method3750((byte) 35);
                return;
            }
            if (arg1 == 10) {
                int var4 = arg0.method3750((byte) 35);
                this.field9532 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field9532[var5] = arg0.method3703(98);
                }
                return;
            }
            if (arg1 == 12) {
                arg0.method3703(arg2 ^ 0xFFFFFF94);
                return;
            }
            if (arg1 == 13) {
                int var6 = arg0.method3750((byte) 35);
                this.field9522 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field9522[var7] = arg0.method3757((byte) -65);
                }
                return;
            }
            if (arg1 != 14) {
                if (arg1 != 15) {
                    if (arg1 == 17) {
                        this.field9518 = arg0.method3757((byte) -65);
                        return;
                    }
                    if (arg1 == 18) {
                        int var16 = arg0.method3750((byte) 35);
                        this.field9538 = new int[var16];
                        this.field9540 = new int[var16];
                        this.field9528 = new int[var16];
                        this.field9519 = new String[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            this.field9528[var17] = arg0.method3703(109);
                            this.field9540[var17] = arg0.method3703(126);
                            this.field9538[var17] = arg0.method3703(117);
                            this.field9519[var17] = arg0.method3697(-1);
                        }
                    } else if (arg1 == 19) {
                        int var8 = arg0.method3750((byte) 35);
                        this.field9541 = new int[var8];
                        this.field9529 = new int[var8];
                        this.field9539 = new String[var8];
                        this.field9527 = new int[var8];
                        for (int var9 = 0; var9 < var8; var9++) {
                            this.field9541[var9] = arg0.method3703(class286.method1875(arg2, -127));
                            this.field9529[var9] = arg0.method3703(class286.method1875(arg2, -74));
                            this.field9527[var9] = arg0.method3703(114);
                            this.field9539[var9] = arg0.method3697(-1);
                        }
                        return;
                    } else if (arg1 == 249) {
                        int var10 = arg0.method3750((byte) 35);
                        if (this.field9525 == null) {
                            int var11 = class123.method837(122, var10);
                            this.field9525 = new class188(var11);
                        }
                        for (int var12 = 0; var12 < var10; var12++) {
                            boolean var13 = arg0.method3750((byte) 35) == 1;
                            int var14 = arg0.method3756(false);
                            class189 var15;
                            if (var13) {
                                var15 = new class427(arg0.method3697(-1));
                            } else {
                                var15 = new class756(arg0.method3703(114));
                            }
                            this.field9525.method1179((long) var14, var15, (byte) -26);
                        }
                        return;
                    }
                    return;
                }
                arg0.method3757((byte) -65);
                return;
            }
            int var18 = arg0.method3750((byte) 35);
            this.field9534 = new int[var18][2];
            for (int var19 = 0; var19 < var18; var19++) {
                this.field9534[var19][0] = arg0.method3750((byte) 35);
                this.field9534[var19][1] = arg0.method3750((byte) 35);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3893(int arg0, String arg1) {
        if (arg0 != 8192) {
            field9536 = null;
        }
        field9530++;
        return arg1.length() + 2;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static void method3894(boolean arg0) {
        if (!arg0) {
            field9536 = null;
        }
        field9536 = null;
    }
}
