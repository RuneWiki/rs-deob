import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 {

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[[S")
    public static short[][] field690 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[I")
    public static int[] field688;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method327(int arg0) {
        if (arg0 == 0) {
            field688 = null;
            field690 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLsb;)V")
    public static final void method328(byte arg0, class124 arg1) {
        field683++;
        if (arg0 <= 20) {
            field688 = null;
        }
        class216.field3473 = arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIIIII)V")
    public static final void method329(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -98) {
            return;
        }
        field687++;
        if (arg2 == arg5) {
            class294.method1974(arg2, arg1, arg3, arg4, (byte) 112);
        } else if (arg3 - arg2 >= class32.field540 && arg2 + arg3 <= class61.field1034 && (arg1 - arg5) >= class108.field1650 && class154.field2509 >= arg1 + arg5) {
            class7.method38(arg1, arg3, arg2, arg5, arg4, (byte) 53);
        } else {
            class69.method540(arg1, arg2, arg5, arg3, 520, arg4);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static final void method330(byte arg0) {
        class71 var1 = (class71) class140.field2335.method1807(-115);
        field684++;
        int var2 = -8 / ((32 - arg0) / 58);
        while (var1 != null) {
            class14 var3 = var1.field1184;
            if (class92.field1448 != var3.field212 || class207.field3336 > var3.field190) {
                var1.method1074((byte) -124);
            } else if (class207.field3336 >= var3.field200) {
                if (var3.field196 > 0) {
                    class139 var4 = class3.field45[var3.field196 - 1];
                    if (var4 != null && var4.field2849 >= 0 && var4.field2849 < 13312 && var4.field2887 >= 0 && var4.field2887 < 13312) {
                        var3.method93(var4.field2887, class218.method1450(var4.field2887, var4.field2849, true, var3.field212) - var3.field206, class207.field3336, var4.field2849, false);
                    }
                }
                if (var3.field196 < 0) {
                    int var5 = -var3.field196 - 1;
                    class213 var6;
                    if (class288.field4607 == var5) {
                        var6 = class48.field878;
                    } else {
                        var6 = class191.field3129[var5];
                    }
                    if (var6 != null && var6.field2849 >= 0 && var6.field2849 < 13312 && var6.field2887 >= 0 && var6.field2887 < 13312) {
                        var3.method93(var6.field2887, class218.method1450(var6.field2887, var6.field2849, true, var3.field212) - var3.field206, class207.field3336, var6.field2849, false);
                    }
                }
                var3.method94((byte) 75, class232.field3681);
                class130.method942(class92.field1448, (int) var3.field219, (int) var3.field204, (int) var3.field208, 60, var3, var3.field225, -1L, false);
            }
            var1 = (class71) class140.field2335.method1808((byte) 77);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
    public static final void method331(byte arg0, int arg1) {
        field685++;
        if (class138.field2311 == 0) {
            class180.field2996.method217(arg1, (byte) -50);
        } else {
            class257.field4086 = arg1;
        }
        if (arg0 != 100) {
            method327(-86);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lla;B)V")
    public static final void method332(class171 arg0, byte arg1) {
        field682++;
        if (arg0.field2891 == 0) {
            return;
        }
        class38 var2 = arg0.method1224(-1);
        if (arg0.field2832 != -1 && arg0.field2832 < 32768) {
            class139 var3 = class3.field45[arg0.field2832];
            if (var3 != null) {
                int var4 = arg0.field2849 - var3.field2849;
                int var5 = arg0.field2887 - var3.field2887;
                if (var4 != 0 || var5 != 0) {
                    arg0.field2893 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2832 >= 32768) {
            int var6 = arg0.field2832 - 32768;
            if (class288.field4607 == var6) {
                var6 = 2047;
            }
            class213 var7 = class191.field3129[var6];
            if (var7 != null) {
                int var8 = arg0.field2849 - var7.field2849;
                int var9 = arg0.field2887 - var7.field2887;
                if (var8 != 0 || var9 != 0) {
                    arg0.field2893 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1 >= -113) {
            return;
        }
        if ((arg0.field2829 != 0 || arg0.field2815 != 0) && (arg0.field2843 == 0 || arg0.field2900 > 0)) {
            int var10 = arg0.field2849 - (arg0.field2829 - class256.field4082 - class256.field4082) * 64;
            int var11 = arg0.field2887 - (arg0.field2815 - class170.field2787 - class170.field2787) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field2893 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field2815 = 0;
            arg0.field2829 = 0;
        }
        int var12 = arg0.field2893 - arg0.field2831 & 0x7FF;
        if (var12 == 0) {
            arg0.field2814 = 0;
            arg0.field2821 = 0;
        } else if (var2.field643 == 0) {
            arg0.field2821++;
            if (var12 <= 1024) {
                arg0.field2831 += arg0.field2891;
                boolean var20 = true;
                if (arg0.field2891 > var12 || 2048 - arg0.field2891 < var12) {
                    var20 = false;
                    arg0.field2831 = arg0.field2893;
                }
                if (arg0.field2821 > 25 || var20) {
                    arg0.field2901 = var2.field653;
                    if (arg0.field2843 > 0) {
                        if (arg0.field2905[arg0.field2843 - 1] == 2) {
                            if (var2.field674 != -1) {
                                arg0.field2901 = var2.field674;
                            } else if (var2.field665 != -1) {
                                arg0.field2901 = var2.field665;
                            }
                        } else if (arg0.field2905[arg0.field2843 - 1] == 0) {
                            if (var2.field667 != -1) {
                                arg0.field2901 = var2.field667;
                            } else if (var2.field638 != -1) {
                                arg0.field2901 = var2.field638;
                            }
                        } else if (var2.field659 != -1) {
                            arg0.field2901 = var2.field659;
                        }
                    } else if (var2.field642 != -1) {
                        arg0.field2901 = var2.field642;
                    }
                }
            } else {
                arg0.field2831 -= arg0.field2891;
                boolean var21 = true;
                if (arg0.field2891 > var12 || var12 > 2048 - arg0.field2891) {
                    arg0.field2831 = arg0.field2893;
                    var21 = false;
                }
                if (arg0.field2821 > 25 || var21) {
                    arg0.field2901 = var2.field653;
                    if (arg0.field2843 <= 0) {
                        if (var2.field662 != -1) {
                            arg0.field2901 = var2.field662;
                        }
                    } else if (arg0.field2905[arg0.field2843 - 1] == 2) {
                        if (var2.field645 != -1) {
                            arg0.field2901 = var2.field645;
                        } else if (var2.field665 != -1) {
                            arg0.field2901 = var2.field665;
                        }
                    } else if (arg0.field2905[arg0.field2843 - 1] == 0) {
                        if (var2.field663 != -1) {
                            arg0.field2901 = var2.field663;
                        } else if (var2.field638 != -1) {
                            arg0.field2901 = var2.field638;
                        }
                    } else if (var2.field654 != -1) {
                        arg0.field2901 = var2.field654;
                    }
                }
            }
            arg0.field2831 &= 0x7FF;
        } else {
            arg0.field2901 = -1;
            int var13 = arg0.field2893 << 5;
            if (arg0.field2850 != var13) {
                arg0.field2890 = 0;
                int var14 = var13 - arg0.field2869 & 0xFFFF;
                arg0.field2850 = var13;
                int var15 = arg0.field2814 * arg0.field2814 / (var2.field643 * 2);
                if (arg0.field2814 > 0 && var14 >= var15 && var14 - var15 < 32768) {
                    arg0.field2884 = true;
                    int var16 = var2.field676 * var2.field676 / (var2.field643 * 2);
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    arg0.field2889 = var14 / 2;
                    if (arg0.field2889 > var16) {
                        arg0.field2889 = var14 - var16;
                    }
                } else if (arg0.field2814 < 0 && 65536 - var14 >= var15 && 65536 - var15 - var14 < 32768) {
                    arg0.field2884 = true;
                    arg0.field2889 = (65536 - var14) / 2;
                    int var17 = var2.field676 * var2.field676 / (var2.field643 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (arg0.field2889 > var17) {
                        arg0.field2889 = 65536 - var14 - var17;
                    }
                } else {
                    arg0.field2884 = false;
                }
            }
            if (arg0.field2814 == 0) {
                int var18 = arg0.field2850 - arg0.field2869 & 0xFFFF;
                if (var18 < var2.field643) {
                    arg0.field2869 = arg0.field2850;
                } else {
                    arg0.field2890 = 0;
                    int var19 = var2.field676 * var2.field676 / (var2.field643 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 < 32768) {
                        arg0.field2889 = var18 / 2;
                        if (arg0.field2889 > var19) {
                            arg0.field2889 = var18 - var19;
                        }
                        arg0.field2814 = var2.field643;
                    } else {
                        arg0.field2814 = -var2.field643;
                        arg0.field2889 = (65536 - var18) / 2;
                        if (var19 < arg0.field2889) {
                            arg0.field2889 = 65536 - var18 - var19;
                        }
                    }
                    arg0.field2884 = true;
                }
            } else if (arg0.field2814 > 0) {
                if (arg0.field2889 <= arg0.field2890) {
                    arg0.field2884 = false;
                }
                if (!arg0.field2884) {
                    arg0.field2814 -= var2.field643;
                    if (arg0.field2814 < 0) {
                        arg0.field2814 = 0;
                    }
                } else if (arg0.field2814 < var2.field676) {
                    arg0.field2814 += var2.field643;
                }
            } else {
                if (arg0.field2890 >= arg0.field2889) {
                    arg0.field2884 = false;
                }
                if (!arg0.field2884) {
                    arg0.field2814 += var2.field643;
                    if (arg0.field2814 > 0) {
                        arg0.field2814 = 0;
                    }
                } else if (arg0.field2814 > (-var2.field676)) {
                    arg0.field2814 -= var2.field643;
                }
            }
            if (arg0.field2814 > 0) {
                arg0.field2890 += arg0.field2814;
            } else {
                arg0.field2890 -= arg0.field2814;
            }
            arg0.field2869 += arg0.field2814;
            arg0.field2869 &= 0xFFFF;
            arg0.field2831 = arg0.field2869 >> 5;
            if (arg0.field2814 < 0) {
                if (arg0.field2843 > 0) {
                    if (arg0.field2905[arg0.field2843 - 1] == 2) {
                        if (var2.field645 != -1) {
                            arg0.field2901 = var2.field645;
                        } else if (var2.field665 != -1) {
                            arg0.field2901 = var2.field665;
                        }
                    } else if (arg0.field2905[arg0.field2843 - 1] == 0) {
                        if (var2.field663 != -1) {
                            arg0.field2901 = var2.field663;
                        } else if (var2.field638 != -1) {
                            arg0.field2901 = var2.field638;
                        }
                    }
                }
                if (arg0.field2901 == -1) {
                    if (var2.field654 != -1) {
                        arg0.field2901 = var2.field654;
                    } else if (var2.field662 != -1) {
                        arg0.field2901 = var2.field662;
                    }
                }
            } else {
                if (arg0.field2843 > 0) {
                    if (arg0.field2905[arg0.field2843 - 1] == 2) {
                        if (var2.field674 != -1) {
                            arg0.field2901 = var2.field674;
                        } else if (var2.field665 != -1) {
                            arg0.field2901 = var2.field665;
                        }
                    } else if (arg0.field2905[arg0.field2843 - 1] == 0) {
                        if (var2.field667 != -1) {
                            arg0.field2901 = var2.field667;
                        } else if (var2.field638 != -1) {
                            arg0.field2901 = var2.field638;
                        }
                    }
                }
                if (arg0.field2901 == -1) {
                    if (var2.field659 != -1) {
                        arg0.field2901 = var2.field659;
                    } else if (var2.field642 != -1) {
                        arg0.field2901 = var2.field642;
                    }
                }
            }
            if (arg0.field2901 == -1) {
                arg0.field2901 = var2.field653;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)Z")
    public static final boolean method333(int arg0) {
        field689++;
        try {
            if (arg0 != 11422) {
                field688 = null;
            }
            if (class138.field2311 == 2) {
                if (class44.field809 == null) {
                    class44.field809 = class123.method885(class225.field3579, class47.field870, client.field4563);
                    if (class44.field809 == null) {
                        return false;
                    }
                }
                if (class81.field1344 == null) {
                    class81.field1344 = new class141(class155.field2532, class192.field3137);
                }
                if (class180.field2996.method204(-1, 22050, class81.field1344, class44.field809, class225.field3580)) {
                    class180.field2996.method196((byte) 127);
                    class180.field2996.method217(class257.field4086, (byte) -31);
                    class180.field2996.method230(class44.field809, (byte) -124, class293.field4652);
                    class81.field1344 = null;
                    class44.field809 = null;
                    class225.field3579 = null;
                    class138.field2311 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class180.field2996.method218(false);
            class44.field809 = null;
            class225.field3579 = null;
            class81.field1344 = null;
            class138.field2311 = 0;
        }
        return false;
    }
}
