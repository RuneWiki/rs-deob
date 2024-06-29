import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class27 {

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    private int field394 = 0;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public int field395 = -1;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public int field398 = 128;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Z")
    public boolean field388 = true;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field385 = 13156520;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 3)
    private final void method243(int arg0, int arg1) {
        field397++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFFFB) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        this.field392 = (int) ((double) arg1 * var17);
        this.field399 = (int) (var15 * 256.0D);
        if (this.field399 < 0) {
            this.field399 = 0;
        } else if (this.field399 > 255) {
            this.field399 = 255;
        }
        if (this.field392 < 0) {
            this.field392 = 0;
        } else if (this.field392 > 255) {
            this.field392 = 255;
        }
        if (var17 > 0.5D) {
            this.field386 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field386 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field386 < 1) {
            this.field386 = 1;
        }
        this.field393 = (int) ((double) this.field386 * var19);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lnj;Z)V", line = 94)
    public final void method244(class164 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1087(arg1);
            if (var3 == 0) {
                field391++;
                if (arg1) {
                    this.field393 = -28;
                    return;
                }
                return;
            }
            this.method246(var3, arg0, (byte) 65);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLub;Z)V", line = 115)
    public static final void method245(byte arg0, class17 arg1, boolean arg2) {
        field396++;
        if (arg0 <= 12) {
            method245((byte) 60, null, true);
        }
        if (class367.field5621 >= 400) {
            return;
        }
        class258 var3 = arg1.field274;
        if (var3.field3627 != null) {
            var3 = var3.method1660(class288.field4208, (byte) 74);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field3596) {
            return;
        }
        String var4 = var3.field3579;
        if (var3.field3607 != 0) {
            String var5 = class67.field957 == class249.field3474 ? class430.field6549.method2705((byte) 69, class257.field3556) : class257.field3549.method2705((byte) 69, class257.field3556);
            var4 = var4 + class478.method2843(-10, var3.field3607, class56.field800.field1391) + " (" + var5 + var3.field3607 + ")";
        }
        if (!class44.field641) {
            if (!arg2) {
                String[] var6 = var3.field3567;
                if (class142.field1894) {
                    var6 = class77.method534(90, var6);
                }
                if (var6 != null) {
                    for (int var7 = 4; var7 >= 0; var7--) {
                        if (var6[var7] != null && (var3.field3599 == 0 || !var6[var7].equalsIgnoreCase(class331.field5168.method2705((byte) 69, class257.field3556)))) {
                            byte var8 = 0;
                            if (var7 == 0) {
                                var8 = 23;
                            }
                            int var9 = class239.field3364;
                            if (var7 == 1) {
                                var8 = 16;
                            }
                            if (var7 == 2) {
                                var8 = 57;
                            }
                            if (var7 == 3) {
                                var8 = 22;
                            }
                            if (var7 == 4) {
                                var8 = 2;
                            }
                            if (var3.field3574 == var7) {
                                var9 = var3.field3580;
                            }
                            if (var3.field3584 == var7) {
                                var9 = var3.field3587;
                            }
                            class129.field1743++;
                            class24.method227(false, var8, 0, (byte) 116, true, "<col=ffff00>" + var4, -1, var6[var7].equalsIgnoreCase(class331.field5168.method2705((byte) 69, class257.field3556)) ? var3.field3622 : var9, var6[var7], (long) arg1.field3882, 0);
                        }
                    }
                }
                if (var3.field3599 == 1 && var6 != null) {
                    for (int var10 = 4; var10 >= 0; var10--) {
                        if (var6[var10] != null && var6[var10].equalsIgnoreCase(class331.field5168.method2705((byte) 69, class257.field3556))) {
                            short var11 = 0;
                            if (class56.field800.field1391 < var3.field3607) {
                                var11 = 2000;
                            }
                            short var12 = 0;
                            if (var10 == 0) {
                                var12 = 23;
                            }
                            if (var10 == 1) {
                                var12 = 16;
                            }
                            if (var10 == 2) {
                                var12 = 57;
                            }
                            if (var10 == 3) {
                                var12 = 22;
                            }
                            if (var10 == 4) {
                                var12 = 2;
                            }
                            if (var12 != 0) {
                                var12 += var11;
                            }
                            class24.method227(false, var12, 0, (byte) 110, true, "<col=ffff00>" + var4, -1, var3.field3622, var6[var10], (long) arg1.field3882, 0);
                            class194.field2591++;
                        }
                    }
                }
            }
            class24.method227(arg2, 1002, 0, (byte) -128, true, "<col=ffff00>" + var4, -1, class393.field6007, class44.field636.method2705((byte) 69, class257.field3556), (long) arg1.field3882, 0);
            class424.field6466++;
        } else if (!arg2) {
            class205 var13 = class364.field5591 == -1 ? null : class83.field1218.method3118(class364.field5591, -13676);
            if ((class144.field1922 & 0x2) != 0) {
                if (var13 == null || var3.method1658(135, var13.field2727, class364.field5591) != var13.field2727) {
                    class128.field1729++;
                    class24.method227(false, 44, 0, (byte) 77, true, class466.field6947 + " -> <col=ffff00>" + var4, -1, class48.field691, class468.field7001, (long) arg1.field3882, 0);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILnj;B)V", line = 281)
    private final void method246(int arg0, class164 arg1, byte arg2) {
        if (arg2 < 13) {
            return;
        }
        if (arg0 == 1) {
            this.field394 = arg1.method1090(-1);
            this.method243(this.field394, 256);
        } else if (arg0 == 2) {
            this.field395 = arg1.method1074(-635989152);
            if (this.field395 == 65535) {
                this.field395 = -1;
            }
        } else if (arg0 == 3) {
            this.field398 = arg1.method1074(-635989152) << 0;
        } else if (arg0 == 4) {
            this.field388 = false;
        }
        field390++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lik;I)V", line = 327)
    public static final void method247(class141 arg0, int arg1) {
        field400++;
        arg0.method951(1374428641);
        int var2 = 0;
        for (int var3 = 0; var3 < class20.field310; var3++) {
            int var15 = class55.field778[var3];
            if ((class107.field1523[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class107.field1523[var15] = (byte) class311.method1956(class107.field1523[var15], 2);
                } else {
                    int var16 = arg0.method949(94, 1);
                    if (var16 == 0) {
                        var2 = class52.method390(12002, arg0);
                        class107.field1523[var15] = (byte) class311.method1956(class107.field1523[var15], 2);
                    } else {
                        class269.method1728((byte) 32, arg0, var15);
                    }
                }
            }
        }
        arg0.method952(arg1 ^ 0x7B);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method951(1374428641);
        for (int var4 = 0; var4 < class20.field310; var4++) {
            int var13 = class55.field778[var4];
            if ((class107.field1523[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class107.field1523[var13] = (byte) class311.method1956(class107.field1523[var13], 2);
                } else {
                    int var14 = arg0.method949(14, 1);
                    if (var14 == 0) {
                        var2 = class52.method390(12002, arg0);
                        class107.field1523[var13] = (byte) class311.method1956(class107.field1523[var13], 2);
                    } else {
                        class269.method1728((byte) 3, arg0, var13);
                    }
                }
            }
        }
        arg0.method952(73);
        if (~var2 != arg1) {
            throw new RuntimeException("nsn1");
        }
        arg0.method951(1374428641);
        for (int var5 = 0; var5 < class484.field7132; var5++) {
            int var11 = class521.field7667[var5];
            if ((class107.field1523[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class107.field1523[var11] = (byte) class311.method1956(class107.field1523[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method949(108, 1);
                    if (var12 == 0) {
                        var2 = class52.method390(12002, arg0);
                        class107.field1523[var11] = (byte) class311.method1956(class107.field1523[var11], 2);
                    } else if (class110.method692(arg0, var11, arg1 + 82)) {
                        class107.field1523[var11] = (byte) class311.method1956(class107.field1523[var11], 2);
                    }
                }
            }
        }
        arg0.method952(104);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method951(arg1 ^ 0xAE13E21E);
        for (int var6 = 0; var6 < class484.field7132; var6++) {
            int var9 = class521.field7667[var6];
            if ((class107.field1523[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class107.field1523[var9] = (byte) class311.method1956(class107.field1523[var9], 2);
                } else {
                    int var10 = arg0.method949(arg1 + 92, 1);
                    if (var10 == 0) {
                        var2 = class52.method390(12002, arg0);
                        class107.field1523[var9] = (byte) class311.method1956(class107.field1523[var9], 2);
                    } else if (class110.method692(arg0, var9, 82)) {
                        class107.field1523[var9] = (byte) class311.method1956(class107.field1523[var9], 2);
                    }
                }
            }
        }
        arg0.method952(arg1 ^ 0xFFFFFFF3);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class484.field7132 = 0;
        class20.field310 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class107.field1523[var7] = (byte) (class107.field1523[var7] >> 1);
            class96 var8 = class241.field3398[var7];
            if (var8 == null) {
                class521.field7667[class484.field7132++] = var7;
            } else {
                class55.field778[class20.field310++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V", line = 534)
    public static final void method248(int arg0, int arg1) {
        if (class406.field6164 == 0) {
            class480.field7082.method1393(arg1, -38);
        } else {
            class162.field2114 = arg1;
        }
        if (arg0 != -31840) {
            field385 = 68;
        }
        field389++;
    }
}
