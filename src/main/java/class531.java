import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class531 implements Runnable {

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "Lns;")
    private class406 field7218 = new class406();

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "Z")
    private boolean field7222 = false;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public int field7221 = 0;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field7223;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "[I")
    public static int[] field7206 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "[I")
    public static int[] field7210 = new int[8];

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field7207 = 1;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "Z")
    public static boolean field7208 = false;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "Lni;")
    public static class522 field7217;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II[[[Llha;IBZ)Z", line = 4)
    public static final boolean method2934(int arg0, int arg1, class624[][][] arg2, int arg3, byte arg4, boolean arg5) {
        field7212++;
        byte var6 = arg5 ? 1 : (byte) (class478.field6604 & 0xFF);
        if (class410.field5781[class61.field677][arg0][arg3] == var6) {
            return false;
        } else if ((class114.field1506[class61.field677][arg0][arg3] & 0x4) == 0) {
            return false;
        } else {
            if (arg4 != -76) {
                method2939(-52, -17, -126, null, false);
            }
            byte var7 = 0;
            int var8 = 0;
            class462.field6394[var7] = arg0;
            int var35 = var7 + 1;
            class179.field2203[var7] = arg3;
            class410.field5781[class61.field677][arg0][arg3] = var6;
            while (var35 != var8) {
                int var9 = class462.field6394[var8] & 0xFFFF;
                int var10 = class462.field6394[var8] >> 16 & 0xFF;
                int var11 = class462.field6394[var8] >> 24 & 0xFF;
                int var12 = class179.field2203[var8] & 0xFFFF;
                int var13 = (class179.field2203[var8] & 0xFF7A19) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class114.field1506[class61.field677][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg2 != null) {
                    label244: for (int var16 = class61.field677 + 1; var16 <= 3; var16++) {
                        if (arg2[var16] != null && (class114.field1506[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg2[var16][var9][var12] != null) {
                                if (arg2[var16][var9][var12].field8728 != null) {
                                    int var17 = class639.method3596((byte) -95, var10);
                                    if (arg2[var16][var9][var12].field8728.field10064 == var17 || arg2[var16][var9][var12].field8737 != null && arg2[var16][var9][var12].field8737.field10064 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class639.method3596((byte) -95, var11);
                                        if (arg2[var16][var9][var12].field8728.field10064 == var18 || arg2[var16][var9][var12].field8737 != null && arg2[var16][var9][var12].field8737.field10064 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class639.method3596((byte) -95, var13);
                                        if (arg2[var16][var9][var12].field8728.field10064 == var19 || arg2[var16][var9][var12].field8737 != null && arg2[var16][var9][var12].field8737.field10064 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class624 var20 = arg2[var16][var9][var12];
                                if (var20.field8729 != null) {
                                    for (class603 var21 = var20.field8729; var21 != null; var21 = var21.field8413) {
                                        class752 var22 = var21.field8410;
                                        if (var22 instanceof class722) {
                                            class722 var23 = (class722) var22;
                                            int var24 = var23.method686((byte) 20);
                                            int var25 = var23.method685(arg4 + 4733);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var26 = var24 | var25 << 6;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class624 var27 = arg2[var16][var9][var12];
                            if (var27 != null && var27.field8729 != null) {
                                for (class603 var28 = var27.field8729; var28 != null; var28 = var28.field8413) {
                                    class752 var29 = var28.field8410;
                                    if (var29.field10426 != var29.field10422 || var29.field10425 != var29.field10421) {
                                        for (int var30 = var29.field10422; var30 <= var29.field10426; var30++) {
                                            for (int var31 = var29.field10421; var31 <= var29.field10425; var31++) {
                                                class410.field5781[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            class410.field5781[var16][var9][var12] = var6;
                            var15 = true;
                        }
                    }
                }
                if (var15) {
                    int var32 = class25.field188[class61.field677 + 1].method1685(var12, -12639, var9);
                    if (class514.field6951[arg1] < var32) {
                        class514.field6951[arg1] = var32;
                    }
                    int var33 = var9 << 9;
                    int var34 = var12 << 9;
                    if (class387.field5465[arg1] > var33) {
                        class387.field5465[arg1] = var33;
                    } else if (var33 > class354.field4732[arg1]) {
                        class354.field4732[arg1] = var33;
                    }
                    if (class569.field8019[arg1] > var34) {
                        class569.field8019[arg1] = var34;
                    } else if (class46.field483[arg1] < var34) {
                        class46.field483[arg1] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class410.field5781[class61.field677][var9 - 1][var12] != var6) {
                        class462.field6394[var35] = class344.method2020(-754974720, class344.method2020(var9 - 1, 1179648));
                        class179.field2203[var35] = class344.method2020(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class410.field5781[class61.field677][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class3.field26) {
                        if (var9 - 1 >= 0 && class410.field5781[class61.field677][var9 - 1][var12] != var6 && (class114.field1506[class61.field677][var9][var12] & 0x4) == 0 && (class114.field1506[class61.field677][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class462.field6394[var35] = class344.method2020(class344.method2020(1179648, var9 - 1), 1375731712);
                            class179.field2203[var35] = class344.method2020(var12, 1245184);
                            class410.field5781[class61.field677][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class410.field5781[class61.field677][var9][var12] != var6) {
                            class462.field6394[var35] = class344.method2020(class344.method2020(5373952, var9), 318767104);
                            class179.field2203[var35] = class344.method2020(5439488, var12);
                            class410.field5781[class61.field677][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class272.field3589 > var9 + 1 && class410.field5781[class61.field677][var9 + 1][var12] != var6 && (class114.field1506[class61.field677][var9][var12] & 0x4) == 0 && (class114.field1506[class61.field677][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class462.field6394[var35] = class344.method2020(class344.method2020(var9 + 1, 5373952), -1845493760);
                            class179.field2203[var35] = class344.method2020(5439488, var12);
                            class410.field5781[class61.field677][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class272.field3589 && class410.field5781[class61.field677][var9 + 1][var12] != var6) {
                        class462.field6394[var35] = class344.method2020(class344.method2020(var9 + 1, 9568256), 1392508928);
                        class179.field2203[var35] = class344.method2020(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class410.field5781[class61.field677][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class410.field5781[class61.field677][var9 - 1][var12] != var6 && (class114.field1506[class61.field677][var9][var12] & 0x4) == 0 && (class114.field1506[class61.field677][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class462.field6394[var35] = class344.method2020(class344.method2020(13762560, var9 - 1), 301989888);
                            class179.field2203[var35] = class344.method2020(13828096, var12);
                            class410.field5781[class61.field677][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class410.field5781[class61.field677][var9][var12] != var6) {
                            class462.field6394[var35] = class344.method2020(class344.method2020(var9, 13762560), -1828716544);
                            class179.field2203[var35] = class344.method2020(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class410.field5781[class61.field677][var9][var12] = var6;
                        }
                        if (var9 + 1 < class272.field3589 && class410.field5781[class61.field677][var9 + 1][var12] != var6 && (class114.field1506[class61.field677][var9][var12] & 0x4) == 0 && (class114.field1506[class61.field677][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class462.field6394[var35] = class344.method2020(-771751936, class344.method2020(var9 + 1, 9568256));
                            class179.field2203[var35] = class344.method2020(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class410.field5781[class61.field677][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class514.field6951[arg1] != -1000000) {
                class514.field6951[arg1] += 40;
                class387.field5465[arg1] -= 512;
                class354.field4732[arg1] += 512;
                class46.field483[arg1] += 512;
                class569.field8019[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILbg;)Lrba;", line = 342)
    public final class435 method2935(byte arg0, int arg1, class465 arg2) {
        field7215++;
        class435 var4 = new class435();
        var4.field5550 = arg1;
        var4.field6104 = 3;
        var4.field6108 = arg2;
        var4.field739 = false;
        int var5 = 124 % ((-arg0 - 1) / 35);
        this.method2941(-12972, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)Lhc;", line = 366)
    public static final class142 method2936(int arg0, int arg1, int arg2) {
        class624 var3 = class77.field947[arg0][arg1][arg2];
        return var3 == null || var3.field8736 == null ? null : var3.field8736;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 373)
    public static void method2937(byte arg0) {
        field7206 = null;
        if (arg0 == 118) {
            field7210 = null;
            field7217 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([BBLbg;I)Lrba;", line = 385)
    public final class435 method2938(byte[] arg0, byte arg1, class465 arg2, int arg3) {
        if (arg1 <= 14) {
            return null;
        }
        field7211++;
        class435 var5 = new class435();
        var5.field5550 = arg3;
        var5.field6108 = arg2;
        var5.field6110 = arg0;
        var5.field739 = false;
        var5.field6104 = 2;
        this.method2941(-12972, var5);
        return var5;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIILsba;Z)V", line = 406)
    public static final void method2939(int arg0, int arg1, int arg2, class218 arg3, boolean arg4) {
        field7209++;
        int var5 = arg3.field2781;
        if (arg3.field2703 == 0) {
            arg3.field2781 = arg3.field2694;
        } else if (arg3.field2703 == 1) {
            arg3.field2781 = arg1 - arg3.field2694;
        } else if (arg3.field2703 == 2) {
            arg3.field2781 = arg3.field2694 * arg1 >> 14;
        }
        int var6 = arg3.field2718;
        if (arg3.field2665 == 0) {
            arg3.field2718 = arg3.field2702;
        } else if (arg3.field2665 == 1) {
            arg3.field2718 = arg0 - arg3.field2702;
        } else if (arg3.field2665 == 2) {
            arg3.field2718 = arg3.field2702 * arg0 >> 14;
        }
        if (arg3.field2703 == 4) {
            arg3.field2781 = arg3.field2795 * arg3.field2718 / arg3.field2815;
        }
        if (arg3.field2665 == 4) {
            arg3.field2718 = arg3.field2815 * arg3.field2781 / arg3.field2795;
        }
        if (class116.field1519 && (client.method1835(arg3).field9868 != 0 || arg3.field2832 == 0)) {
            if (arg3.field2718 < 5 && arg3.field2781 < 5) {
                arg3.field2781 = 5;
                arg3.field2718 = 5;
            } else {
                if (arg3.field2718 <= 0) {
                    arg3.field2718 = 5;
                }
                if (arg3.field2781 <= 0) {
                    arg3.field2781 = 5;
                }
            }
        }
        if (class378.field5255 == arg3.field2776) {
            class753.field10437 = arg3;
        }
        if (arg4 && arg3.field2727 != null && (arg3.field2781 != var5 || arg3.field2718 != var6)) {
            class404 var7 = new class404();
            var7.field5714 = arg3;
            var7.field5709 = arg3.field2727;
            class213.field2550.method725(var7, -20911);
        }
        if (arg2 != 1375731712) {
            field7219 = -87;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lni;I)V", line = 483)
    public static final void method2940(class522 arg0, int arg1) {
        field7213++;
        class367.field4918 = arg0;
        if (arg1 != -1) {
            field7207 = 127;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILrba;)V", line = 496)
    private final void method2941(int arg0, class435 arg1) {
        class406 var3 = this.field7218;
        synchronized (this.field7218) {
            this.field7218.method2341(arg1, -108);
            this.field7221++;
            this.field7218.notifyAll();
            if (arg0 != -12972) {
                field7210 = null;
            }
        }
        field7214++;
    }

    @OriginalMember(owner = "client!pt", name = "run", descriptor = "()V", line = 512)
    public final void run() {
        field7220++;
        while (!this.field7222) {
            class406 var1 = this.field7218;
            class435 var2;
            synchronized (this.field7218) {
                var2 = (class435) this.field7218.method2345(-16711936);
                if (var2 == null) {
                    try {
                        this.field7218.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field7221--;
            }
            try {
                if (var2.field6104 == 2) {
                    var2.field6108.method2591(false, var2.field6110.length, (int) var2.field5550, var2.field6110);
                } else if (var2.field6104 == 3) {
                    var2.field6110 = var2.field6108.method2586((int) var2.field5550, false);
                }
            } catch (Exception var6) {
                class760.method4223(var6, -123, null);
            }
            var2.field741 = false;
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V", line = 561)
    public final void method2942(byte arg0) {
        if (arg0 >= -61) {
            method2937((byte) -60);
        }
        field7205++;
        this.field7222 = true;
        class406 var2 = this.field7218;
        synchronized (this.field7218) {
            this.field7218.notifyAll();
        }
        try {
            this.field7223.join();
        } catch (InterruptedException var3) {
        }
        this.field7223 = null;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILbg;I)Lrba;", line = 580)
    public final class435 method2943(int arg0, class465 arg1, int arg2) {
        field7216++;
        class435 var4 = new class435();
        var4.field6104 = arg0;
        class406 var5 = this.field7218;
        synchronized (this.field7218) {
            class435 var6 = (class435) this.field7218.method2348(-1);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field5550 && var6.field6108 == arg1 && var6.field6104 == 2) {
                    var4.field6110 = var6.field6110;
                    var4.field741 = false;
                    return var4;
                }
                var6 = (class435) this.field7218.method2343(0);
            }
        }
        var4.field6110 = arg1.method2586(arg2, false);
        var4.field741 = false;
        var4.field739 = true;
        return var4;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lfl;)V", line = 631)
    public class531(class739 arg0) {
        class107 var2 = arg0.method4126(5, this, 1);
        while (var2.field1419 == 0) {
            class267.method1599(0, 10L);
        }
        if (var2.field1419 == 2) {
            throw new RuntimeException();
        }
        this.field7223 = (Thread) var2.field1418;
    }
}
