import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class448 extends class117 {

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    private int field5859 = 0;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Lcp;")
    private class242 field5855 = new class242();

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Lnj;")
    public static class415 field5856 = new class415(56, -1);

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "Lrs;")
    public static class653 field5870;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "Le;")
    public static class702 field5863;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V", line = 5)
    public final void method876(int arg0, int arg1) {
        ++field5858;
        if (arg1 != -10363) {
            this.method879(true, (byte) 98, (class88) null, -13);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILgn;)V", line = 15)
    public final void method878(int arg0, class530 arg1) {
        --super.field1504;
        int var3 = 2 / ((79 - arg0) / 37);
        ++field5862;
        if (super.field1504 < 0) {
            super.field1504 = 4999;
        }
        super.field1501[super.field1504] = 21;
        super.field1506[super.field1504] = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILcda;I)V", line = 35)
    public static final void method2543(int arg0, class534 arg1, int arg2) {
        ++field5857;
        boolean var3 = arg1.method2845(1, 8) == 1;
        if (var3) {
            class651.field9061[class109.field1411++] = arg0;
        }
        if (arg2 != 3) {
            field5869 = 9;
        }
        int var4 = arg1.method2845(2, arg2 + 5);
        class193 var5 = class592.field8019[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field2512 = false;
            } else if (~class353.field4536 == ~arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class244 var6 = class528.field6869[arg0] = new class244();
                var6.field3265 = (var5.field3039[0] + class186.field2376 >> 6) + ((var5.field508 << 28) - -(var5.field3030[0] + class100.field1326 >> 6 << 14));
                if (var5.field2506 == -1) {
                    var6.field3270 = var5.field2988.method2307(true);
                } else {
                    var6.field3270 = var5.field2506;
                }
                var6.field3271 = var5.field3001;
                var6.field3269 = var5.field2500;
                if (var5.field2483 > 0) {
                    class192.method1252((byte) 78, var5);
                }
                class592.field8019[arg0] = null;
                if (arg1.method2845(1, 8) != 0) {
                    class559.method2990(-128, arg0, arg1);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg1.method2845(3, 8);
            int var8 = var5.field3030[0];
            int var9 = var5.field3039[0];
            if (var7 == 0) {
                --var9;
                --var8;
            } else if (~var7 == -2) {
                --var9;
            } else if (~var7 == -3) {
                --var9;
                ++var8;
            } else if (~var7 != -4) {
                if (~var7 != -5) {
                    if (var7 != 5) {
                        if (var7 == 6) {
                            ++var9;
                        } else if (~var7 == -8) {
                            ++var9;
                            ++var8;
                        }
                    } else {
                        --var8;
                        ++var9;
                    }
                } else {
                    ++var8;
                }
            } else {
                --var8;
            }
            if (!var3) {
                var5.method1267(class324.field4210[arg0], var9, -2, var8);
            } else {
                var5.field2512 = true;
                var5.field2514 = var9;
                var5.field2518 = var8;
            }
        } else if (var4 == 2) {
            int var10 = arg1.method2845(4, 8);
            int var11 = var5.field3030[0];
            int var12 = var5.field3039[0];
            if (var10 != 0) {
                if (~var10 != -2) {
                    if (var10 == 2) {
                        var12 -= 2;
                    } else if (~var10 == -4) {
                        ++var11;
                        var12 -= 2;
                    } else if (~var10 != -5) {
                        if (var10 == 5) {
                            --var12;
                            var11 -= 2;
                        } else if (~var10 == -7) {
                            var11 += 2;
                            --var12;
                        } else if (~var10 != -8) {
                            if (var10 != 8) {
                                if (var10 == 9) {
                                    ++var12;
                                    var11 -= 2;
                                } else if (var10 != 10) {
                                    if (var10 != 11) {
                                        if (~var10 == -13) {
                                            --var11;
                                            var12 += 2;
                                        } else if (~var10 == -14) {
                                            var12 += 2;
                                        } else if (var10 != 14) {
                                            if (~var10 == -16) {
                                                var12 += 2;
                                                var11 += 2;
                                            }
                                        } else {
                                            ++var11;
                                            var12 += 2;
                                        }
                                    } else {
                                        var11 -= 2;
                                        var12 += 2;
                                    }
                                } else {
                                    ++var12;
                                    var11 += 2;
                                }
                            } else {
                                var11 += 2;
                            }
                        } else {
                            var11 -= 2;
                        }
                    } else {
                        var11 += 2;
                        var12 -= 2;
                    }
                } else {
                    var12 -= 2;
                    --var11;
                }
            } else {
                var12 -= 2;
                var11 -= 2;
            }
            if (var3) {
                var5.field2512 = true;
                var5.field2518 = var11;
                var5.field2514 = var12;
            } else {
                var5.method1267(class324.field4210[arg0], var12, -2, var11);
            }
        } else {
            int var13 = arg1.method2845(1, arg2 ^ 11);
            if (var13 == 0) {
                int var14 = arg1.method2845(12, 8);
                int var15 = var14 >> 10;
                int var16 = (1016 & var14) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 31;
                if (~var17 < -16) {
                    var17 -= 32;
                }
                int var18 = var5.field3030[0] + var16;
                int var19 = var5.field3039[0] - -var17;
                if (var3) {
                    var5.field2512 = true;
                    var5.field2518 = var18;
                    var5.field2514 = var19;
                } else {
                    var5.method1267(class324.field4210[arg0], var19, -2, var18);
                }
                var5.field508 = (byte) (3 & var5.field508 + var15);
                if (class353.field4536 == arg0) {
                    class390.field4991 = var5.field508;
                }
            } else {
                int var20 = arg1.method2845(30, 8);
                int var21 = var20 >> 28;
                int var22 = (var20 & 268425110) >> 14;
                int var23 = var20 & 16383;
                int var24 = (16383 & var5.field3030[0] - -class100.field1326 - -var22) + -class100.field1326;
                int var25 = (var5.field3039[0] + class186.field2376 + var23 & 16383) - class186.field2376;
                if (var3) {
                    var5.field2514 = var25;
                    var5.field2512 = true;
                    var5.field2518 = var24;
                } else {
                    var5.method1267(class324.field4210[arg0], var25, -2, var24);
                }
                var5.field508 = (byte) (var5.field508 + var21 & 3);
                if (class353.field4536 == arg0) {
                    class390.field4991 = var5.field508;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lgn;Z)V", line = 349)
    public final void method883(class530 arg0, boolean arg1) {
        ++field5854;
        super.field1501[super.field1503] = 21;
        super.field1506[super.field1503] = arg0;
        ++super.field1503;
        if (~super.field1503 <= -5001) {
            super.field1503 = 0;
        }
        if (!arg1) {
            this.method875(-75, 28);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 365)
    public static void method2544(int arg0) {
        if (arg0 == -3) {
            field5870 = null;
            field5863 = null;
            field5856 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V", line = 377)
    public static final void method2545(int arg0) {
        int var1 = 0;
        if (arg0 != 21335) {
            method2545(87);
        }
        while (class248.field3351 > var1) {
            int var2 = class40.field558[var1];
            class234 var3 = (class234) class505.field6640.method39((long) var2, arg0 ^ 12113);
            if (var3 != null) {
                class532 var4 = var3.field3131;
                class377.method2156(var4, var4.field6914.field9711, true);
            }
            ++var1;
        }
        ++field5860;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V", line = 409)
    public final void method875(int arg0, int arg1) {
        super.field1501[super.field1503] = (byte) arg0;
        ++field5868;
        ++super.field1503;
        if (super.field1503 >= 5000) {
            super.field1503 = 0;
        }
        if (arg1 != 0) {
            field5856 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZBLd;I)V", line = 424)
    public final void method879(boolean arg0, byte arg1, class88 arg2, int arg3) {
        int var5 = 8 / ((arg1 - 50) / 50);
        ++field5861;
        super.field1501[super.field1503] = (byte) (!arg0 ? arg3 + 30 : arg3 + 40);
        super.field1506[super.field1503] = arg2;
        ++super.field1503;
        if (~super.field1503 <= -5001) {
            super.field1503 = 0;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 445)
    public final void method880(int arg0) {
        ++field5864;
        if (arg0 != 5000) {
            this.field5859 = -68;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lgn;I)V", line = 455)
    public final void method881(class530 arg0, int arg1) {
        ++field5865;
        super.field1501[super.field1503] = 20;
        if (arg1 >= 83) {
            super.field1506[super.field1503] = arg0;
            ++super.field1503;
            if (~super.field1503 <= -5001) {
                super.field1503 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V", line = 474)
    private final void method2546(int arg0) {
        ++field5867;
        int var2 = super.field1504++;
        if (~super.field1504 <= -5001) {
            super.field1504 = 0;
        }
        this.field5859 = super.field1501[var2];
        Object var3 = super.field1506[var2];
        if (arg0 == 2064186246) {
            super.field1506[var2] = null;
            if (this.field5859 == 21) {
                class399.method2282(this.field5855, (class530) var3);
            } else if (this.field5859 != 20) {
                if (~this.field5859 <= -31 && this.field5859 <= 33) {
                    ((class88) var3).method660(class658.field9175, class659.field9178, class703.field9809, class505.field6641, this.field5859 + -30 == 0);
                } else if (this.field5859 >= 40 && ~this.field5859 >= -44) {
                    ((class88) var3).method660(class658.field9175, class659.field9178, class703.field9809, class294.field3808, ~(this.field5859 + -40) == -1);
                } else if (this.field5859 != 22) {
                    if (~this.field5859 != -24) {
                        if (~this.field5859 == -25) {
                            class273.field3602.method412(0, (class296[]) null);
                            return;
                        }
                    } else {
                        class273.field3602.method351();
                    }
                } else {
                    class273.field3602.method394(-1, 1583160, 40, 127);
                }
            } else {
                class530 var4 = (class530) var3;
                if (var4.field6879 != null) {
                    var4.field6879.method67(class273.field3602, 2);
                }
                if (var4.field6886 != null) {
                    var4.field6886.method67(class273.field3602, 2);
                }
                if (var4.field6895 != null) {
                    var4.field6895.method67(class273.field3602, 2);
                }
                if (var4.field6893 != null) {
                    var4.field6893.method67(class273.field3602, 2);
                }
                if (var4.field6878 != null) {
                    var4.field6878.method67(class273.field3602, arg0 ^ 2064186244);
                }
                for (class571 var5 = var4.field6887; var5 != null; var5 = var5.field7445) {
                    var5.field7444.method67(class273.field3602, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 589)
    public final void method877(byte arg0) {
        while (~super.field1504 != ~super.field1503) {
            this.method2546(2064186246);
        }
        int var2 = 101 / ((64 - arg0) / 45);
        ++field5866;
    }
}
