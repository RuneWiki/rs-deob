import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class39 extends class404 {

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "[I")
    public static int[] field521 = new int[5];

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    public static int field524 = 0;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "Lbg;")
    public static class310 field525;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field523;

    static {
        new class423("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field525 = new class310(0, -1);
    }

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "(I)V", line = 5)
    public static final void method215(int arg0) {
        ++field518;
        if (class273.field4147) {
            class172.field2656 = null;
            class25.field323 = null;
            class273.field4147 = false;
            if (arg0 != -18462) {
                method216(64);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V", line = 22)
    public class39() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "(I)V", line = 27)
    public static void method216(int arg0) {
        if (arg0 > -2) {
            field521 = null;
        }
        field525 = null;
        field521 = null;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "()V", line = 40)
    public static final void method217() {
        class483.field7380 = 0;
        label212: for (int var0 = 0; var0 < class370.field5434; ++var0) {
            class168 var1 = class150.field2419[var0];
            if (class508.field7685 != null) {
                for (int var2 = 0; var2 < class508.field7685.length; ++var2) {
                    if (class508.field7685[var2] != -1000000 && (var1.field2614 <= class508.field7685[var2] || var1.field2610 <= class508.field7685[var2]) && (var1.field2617 <= class462.field7105[var2] || var1.field2606 <= class462.field7105[var2]) && (var1.field2617 >= class439.field6448[var2] || var1.field2606 >= class439.field6448[var2]) && (var1.field2609 <= class222.field3432[var2] || var1.field2604 <= class222.field3432[var2]) && (var1.field2609 >= class47.field720[var2] || var1.field2604 >= class47.field720[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field2608 == 1) {
                int var3 = var1.field2612 - class7.field82 + class320.field4826;
                if (var3 >= 0 && var3 <= class320.field4826 + class320.field4826) {
                    int var4 = var1.field2611 - class248.field3812 + class320.field4826;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class320.field4826 + class320.field4826) {
                        continue;
                    }
                    int var5 = var1.field2607 - class248.field3812 + class320.field4826;
                    if (var5 > class320.field4826 + class320.field4826) {
                        var5 = class320.field4826 + class320.field4826;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class358.field5313[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class421.field6042 - var1.field2617;
                        if (var7 > class128.field2066) {
                            var1.field2616 = 1;
                        } else {
                            if (var7 >= -class128.field2066) {
                                continue;
                            }
                            var1.field2616 = 2;
                            var7 = -var7;
                        }
                        var1.field2599 = (var1.field2609 - class168.field2618 << 8) / var7;
                        var1.field2615 = (var1.field2604 - class168.field2618 << 8) / var7;
                        var1.field2601 = (var1.field2614 - class202.field3202 << 8) / var7;
                        var1.field2598 = (var1.field2610 - class202.field3202 << 8) / var7;
                        class299.field4532[class483.field7380++] = var1;
                    }
                }
            } else if (var1.field2608 == 2) {
                int var8 = var1.field2611 - class248.field3812 + class320.field4826;
                if (var8 >= 0 && var8 <= class320.field4826 + class320.field4826) {
                    int var9 = var1.field2612 - class7.field82 + class320.field4826;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class320.field4826 + class320.field4826) {
                        continue;
                    }
                    int var10 = var1.field2602 - class7.field82 + class320.field4826;
                    if (var10 > class320.field4826 + class320.field4826) {
                        var10 = class320.field4826 + class320.field4826;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class358.field5313[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class168.field2618 - var1.field2609;
                        if (var12 > class128.field2066) {
                            var1.field2616 = 3;
                        } else {
                            if (var12 >= -class128.field2066) {
                                continue;
                            }
                            var1.field2616 = 4;
                            var12 = -var12;
                        }
                        var1.field2619 = (var1.field2617 - class421.field6042 << 8) / var12;
                        var1.field2603 = (var1.field2606 - class421.field6042 << 8) / var12;
                        var1.field2601 = (var1.field2614 - class202.field3202 << 8) / var12;
                        var1.field2598 = (var1.field2610 - class202.field3202 << 8) / var12;
                        class299.field4532[class483.field7380++] = var1;
                    }
                }
            } else if (var1.field2608 == 4) {
                int var13 = var1.field2614 - class202.field3202;
                if (var13 > class208.field3261) {
                    int var14 = var1.field2611 - class248.field3812 + class320.field4826;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class320.field4826 + class320.field4826) {
                        continue;
                    }
                    int var15 = var1.field2607 - class248.field3812 + class320.field4826;
                    if (var15 > class320.field4826 + class320.field4826) {
                        var15 = class320.field4826 + class320.field4826;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field2612 - class7.field82 + class320.field4826;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class320.field4826 + class320.field4826) {
                        continue;
                    }
                    int var17 = var1.field2602 - class7.field82 + class320.field4826;
                    if (var17 > class320.field4826 + class320.field4826) {
                        var17 = class320.field4826 + class320.field4826;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; ++var19) {
                        for (int var20 = var14; var20 <= var15; ++var20) {
                            if (class358.field5313[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field2616 = 5;
                        var1.field2619 = (var1.field2617 - class421.field6042 << 8) / var13;
                        var1.field2603 = (var1.field2606 - class421.field6042 << 8) / var13;
                        var1.field2599 = (var1.field2609 - class168.field2618 << 8) / var13;
                        var1.field2615 = (var1.field2604 - class168.field2618 << 8) / var13;
                        class299.field4532[class483.field7380++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)Z", line = 295)
    public static final boolean method218(int arg0, int arg1, int arg2) {
        int var3 = class17.field237[arg0][arg1][arg2];
        if (-class321.field4828 == var3) {
            return false;
        } else if (class321.field4828 == var3) {
            return true;
        } else {
            int var4 = arg1 << class239.field3602;
            int var5 = arg2 << class239.field3602;
            if (class262.method1590(var4 + 1, class99.field1801[arg0].method318(arg1, arg2), var5 + 1) && class262.method1590(class434.field6362 + var4 - 1, class99.field1801[arg0].method318(arg1 + 1, arg2), var5 + 1) && class262.method1590(class434.field6362 + var4 - 1, class99.field1801[arg0].method318(arg1 + 1, arg2 + 1), class434.field6362 + var5 - 1) && class262.method1590(var4 + 1, class99.field1801[arg0].method318(arg1, arg2 + 1), class434.field6362 + var5 - 1) && class262.method1590(class42.field621 + var4, class99.field1801[arg0].method318(arg1, arg2), var5 + 1) && class262.method1590(class434.field6362 + var4 - 1, class99.field1801[arg0].method318(arg1 + 1, arg2), class42.field621 + var5) && class262.method1590(class42.field621 + var4, class99.field1801[arg0].method318(arg1, arg2 + 1), class434.field6362 + var5 - 1) && class262.method1590(class434.field6362 + var4 - 1, class99.field1801[arg0].method318(arg1, arg2), class42.field621 + var5) && class262.method1590(class42.field621 + var4, class99.field1801[arg0].method318(arg1, arg2), class42.field621 + var5)) {
                class17.field237[arg0][arg1][arg2] = class321.field4828;
                return true;
            } else {
                class17.field237[arg0][arg1][arg2] = -class321.field4828;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "(I)V", line = 321)
    public static final void method219(int arg0) {
        ++field523;
        if (class143.field2332 == null) {
            class143.field2332 = new int[65536];
            double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);
            int var3 = 0;
            for (int var4 = 0; var4 < 512; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (7 & var4) / 8.0F + 0.0625F;
                for (int var7 = 0; var7 < 128; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = (float) (-var13) + var12;
                    float var16 = (-var6 + 1.0F) * var8;
                    float var17 = (-(var6 * var15) + 1.0F) * var8;
                    float var18 = (1.0F - (-var15 + 1.0F) * var6) * var8;
                    if (~var14 == -1) {
                        var9 = var8;
                        var10 = var18;
                        var11 = var16;
                    } else if (var14 != 1) {
                        if (~var14 == -3) {
                            var10 = var8;
                            var9 = var16;
                            var11 = var18;
                        } else if (var14 != 3) {
                            if (var14 == 4) {
                                var9 = var18;
                                var10 = var16;
                                var11 = var8;
                            } else if (~var14 == -6) {
                                var11 = var17;
                                var10 = var16;
                                var9 = var8;
                            }
                        } else {
                            var9 = var16;
                            var10 = var17;
                            var11 = var8;
                        }
                    } else {
                        var11 = var16;
                        var10 = var8;
                        var9 = var17;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var22 << 16) - -(var23 << 8) - -var24 + -16777216;
                    class143.field2332[var3++] = var25;
                }
            }
            if (arg0 != 65536) {
                field524 = -116;
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)[I", line = 442)
    public final int[] method90(int arg0, int arg1) {
        ++field522;
        int[] var3 = super.field5870.method372(arg1, (byte) 32);
        if (arg0 >= -47) {
            field524 = -7;
        }
        if (super.field5870.field810) {
            int var4 = class289.field4381[arg1];
            for (int var5 = 0; ~class431.field6348 < ~var5; ++var5) {
                var3[var5] = this.method220(class167.field2594[var5], 49, var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(III)I", line = 474)
    private final int method220(int arg0, int arg1, int arg2) {
        if (arg1 < 35) {
            field525 = null;
        }
        ++field519;
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * var5 * 15731 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
