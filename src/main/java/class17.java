import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class17 extends class476 {

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public static int field256 = 0;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "Z")
    public static volatile boolean field258 = true;

    @OriginalMember(owner = "client!mda", name = "u", descriptor = "[[Z")
    public static boolean[][] field265 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "Ljo;")
    public static class461 field257;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "Lhn;")
    public class85 field254;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mda", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field267;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method204(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)V", line = 3)
    public static final void method199(int arg0) {
        if (arg0 != 3) {
            field265 = null;
        }
        for (class536 var1 = (class536) class56.field792.method427(true); var1 != null; var1 = (class536) class56.field792.method420(false)) {
            if (class277.field4051 == null) {
                var1.method911(-52);
            } else if (var1.field7473 <= class310.field4553) {
                int var2 = class226.field3372[var1.field7483];
                if (var2 == 0) {
                    class363 var3 = class507.method2859(var1.field7485, var1.field7472, var1.field7475);
                    if (var3 instanceof class121) {
                        class214.method1452(var1.field7485, var1.field7472, var1.field7475);
                        class121 var4 = (class121) var3;
                        if (var4.field1933 != null) {
                            class74.method714(var1.field7485, var1.field7472, var1.field7475, var4.field1933, null);
                        }
                    }
                } else if (var2 == 1) {
                    class367 var5 = class485.method2786(var1.field7485, var1.field7472, var1.field7475);
                    if (var5 instanceof class280) {
                        class298.method1871(var1.field7485, var1.field7472, var1.field7475);
                        class280 var6 = (class280) var5;
                        if (var6.field4091 != null) {
                            class383.method2335(var1.field7485, var1.field7472, var1.field7475, var6.field4091, null);
                        }
                    }
                } else if (var2 == 2) {
                    class360 var7 = class460.method2691(var1.field7485, var1.field7472, var1.field7475, field267 == null ? (field267 = method204("p")) : field267);
                    if (var7 instanceof class262) {
                        class222.method1485(var1.field7485, var1.field7472, var1.field7475, field267 == null ? (field267 = method204("p")) : field267);
                        class262 var8 = (class262) var7;
                        if (var8.field3809 != null) {
                            client.method3524(var8.field3809, false);
                        }
                    }
                } else if (var2 == 3) {
                    class493 var9 = class621.method3504(var1.field7485, var1.field7472, var1.field7475);
                    if (var9 instanceof class409) {
                        class432.method2579(var1.field7485, var1.field7472, var1.field7475);
                        class409 var10 = (class409) var9;
                        if (var10.field6083 != null) {
                            class561.method3162(var1.field7485, var1.field7472, var1.field7475, var10.field6083);
                        }
                    }
                }
                var1.method911(-52);
            } else if (class310.field4553 == var1.field7477) {
                int var11 = class226.field3372[var1.field7483];
                if (var11 == 0) {
                    class363 var21 = class507.method2859(var1.field7485, var1.field7472, var1.field7475);
                    if (var21 instanceof class121) {
                        var1.method911(-52);
                    } else if (class343.method2093(var1.field7485, var1.field7472, var1.field7475) == null) {
                        class121 var22 = new class121(var1.field7483, var1.field7470, var1.field7476, var1.field7478, var1.field7482, var21);
                        class74.method714(var1.field7485, var1.field7472, var1.field7475, var22, null);
                    } else {
                        var1.method911(-52);
                    }
                } else if (var11 == 1) {
                    class367 var19 = class485.method2786(var1.field7485, var1.field7472, var1.field7475);
                    if (var19 instanceof class280) {
                        var1.method911(-52);
                    } else if (class420.method2527(var1.field7485, var1.field7472, var1.field7475) == null) {
                        class280 var20 = new class280(var1.field7483, var1.field7470, var1.field7476, var1.field7478, var1.field7482, var19);
                        class383.method2335(var1.field7485, var1.field7472, var1.field7475, var20, null);
                    } else {
                        var1.method911(-52);
                    }
                } else if (var11 == 2) {
                    class360 var12 = class460.method2691(var1.field7485, var1.field7472, var1.field7475, field267 == null ? (field267 = method204("p")) : field267);
                    if (var12 instanceof class262) {
                        var1.method911(-52);
                    } else {
                        class222.method1485(var1.field7485, var1.field7472, var1.field7475, field267 == null ? (field267 = method204("p")) : field267);
                        class370 var13 = class552.field7819.method2890(0, var1.field7488);
                        int var14;
                        int var15;
                        if (var1.field7470 == 1 || var1.field7470 == 3) {
                            var14 = var13.field5322;
                            var15 = var13.field5277;
                        } else {
                            var14 = var13.field5277;
                            var15 = var13.field5322;
                        }
                        class262 var16 = new class262(var1.field7483, var1.field7470, var1.field7485, var1.field7476, var1.field7478, var1.field7482, var1.field7472, var15 + var1.field7472 - 1, var1.field7475, var1.field7475 + var14 - 1, var12);
                        client.method3524(var16, false);
                    }
                } else if (var11 == 3) {
                    class493 var17 = class621.method3504(var1.field7485, var1.field7472, var1.field7475);
                    if (var17 instanceof class409) {
                        var1.method911(-52);
                    } else {
                        class409 var18 = new class409(var1.field7476, var1.field7478, var1.field7482, var17);
                        class561.method3162(var1.field7485, var1.field7472, var1.field7475, var18);
                    }
                }
            }
        }
        field262++;
    }

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V", line = 211)
    public static final void method200(int arg0) {
        field255++;
        int var1 = (int) ((double) class146.field2247 * 34.46D);
        int var2 = var1 << arg0;
        if (class159.field2378.method618()) {
            var2 += 128;
        }
        class159.field2378.method557(50, var2);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V", line = 225)
    public static final void method201(byte arg0) {
        class177.field2593 = new class549[class448.field6526.method3185(-61)][];
        field261++;
        class44.field610 = new class549[class448.field6526.method3185(-99)][];
        class408.field6063 = new boolean[class448.field6526.method3185(-37)];
        int var1 = 114 % ((arg0 + 87) / 33);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILaj;I)V", line = 242)
    public static final void method202(int arg0, class261 arg1, int arg2) {
        if (arg0 != 4) {
            method203((byte) -124);
        }
        field264++;
        boolean var3 = arg1.method1660(-128, 1) == 1;
        if (var3) {
            class291.field4212[class429.field6246++] = arg2;
        }
        int var4 = arg1.method1660(-128, 2);
        class400 var5 = class39.field536[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field5950 = false;
            } else if (class323.field4670 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class537 var6 = class641.field9293[arg2] = new class537();
                var6.field7494 = (var5.field1572[0] + class597.field8500 >> 6) + ((var5.field5116 << 28) + (var5.field1571[0] + class382.field5687 >> 6 << 14));
                if (var5.field5991 == -1) {
                    var6.field7491 = var5.field1557.method870(16383);
                } else {
                    var6.field7491 = var5.field5991;
                }
                var6.field7490 = var5.field5977;
                var6.field7492 = var5.field1526;
                if (var5.field5985 > 0) {
                    class170.method1176(var5, 3);
                }
                class39.field536[arg2] = null;
                if (arg1.method1660(-126, 1) != 0) {
                    class421.method2533(arg1, (byte) 123, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method1660(-128, 3);
            int var8 = var5.field1571[0];
            int var9 = var5.field1572[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field5950 = true;
                var5.field5965 = var9;
                var5.field5971 = var8;
            } else {
                var5.method2443(class220.field3310[arg2], var8, var9, 5366);
            }
        } else if (var4 == 2) {
            int var10 = arg1.method1660(-128, 4);
            int var11 = var5.field1571[0];
            int var12 = var5.field1572[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field5950 = true;
                var5.field5971 = var11;
                var5.field5965 = var12;
            } else {
                var5.method2443(class220.field3310[arg2], var11, var12, arg0 + 5362);
            }
        } else {
            int var13 = arg1.method1660(-126, 1);
            if (var13 == 0) {
                int var14 = arg1.method1660(arg0 ^ 0x31, 12);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field1571[0] + var16;
                int var19 = var5.field1572[0] + var17;
                if (var3) {
                    var5.field5950 = true;
                    var5.field5965 = var19;
                    var5.field5971 = var18;
                } else {
                    var5.method2443(class220.field3310[arg2], var18, var19, 5366);
                }
                var5.field5116 = (byte) (var5.field5116 + var15 & 0x3);
                if (class323.field4670 == arg2) {
                    class545.field7583 = var5.field5116;
                }
            } else {
                int var20 = arg1.method1660(39, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field1571[0] + var22 + class382.field5687 & 0x3FFF) - class382.field5687;
                int var25 = (var5.field1572[0] - (-class597.field8500 - var23) & 0x3FFF) - class597.field8500;
                if (var3) {
                    var5.field5971 = var24;
                    var5.field5950 = true;
                    var5.field5965 = var25;
                } else {
                    var5.method2443(class220.field3310[arg2], var24, var25, 5366);
                }
                var5.field5116 = (byte) (var5.field5116 + var21 & 0x3);
                if (class323.field4670 == arg2) {
                    class545.field7583 = var5.field5116;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)V", line = 555)
    public static void method203(byte arg0) {
        field265 = null;
        if (arg0 >= 59) {
            field257 = null;
        }
    }
}
