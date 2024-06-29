import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class176 {

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field2390;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "[B")
    public byte[] field2399;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "[I")
    public int[] field2389;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "[I")
    public int[] field2401;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "[Z")
    public static boolean[] field2393 = new boolean[8];

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "[I")
    public static int[] field2394 = new int[5];

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[S")
    public static short[] field2391 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2398 = "Loading title screen - ";

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method1219(int arg0, boolean arg1) {
        class294.field4370 = (byte[][][]) null;
        class301.field4447 = null;
        class249.field3583 = (byte[][][]) null;
        class172.field2347 = (int[][][]) null;
        class21.field279 = (int[][][]) null;
        class266.field3865 = null;
        class271.field4053 = (byte[][][]) null;
        if (arg1 && class135.field1864 != null) {
            class211.field3045 = class135.field1864.field4404;
        } else {
            class211.field3045 = -1;
        }
        class256.field3703 = (byte[][][]) null;
        class194.field2704 = (byte[][][]) null;
        class135.field1864 = null;
        class21.field266 = (int[][][]) null;
        field2402++;
        class125.field1700 = 0;
        class204.field2931.method1345(-61);
        class28.field357 = null;
        class235.field3328 = null;
        class210.field3044 = -1;
        class145.field2003 = null;
        class98.field1327 = null;
        class235.field3332 = null;
        if (arg0 != -28376) {
            return;
        }
        class126.field1721 = -1;
        class111.field1508 = null;
        class198.field2765 = null;
        class20.field259 = null;
        class132.field1811 = null;
        class315.field4753 = null;
        class323.field4897 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I", line = 50)
    public final int method1220(int arg0, int arg1) {
        if (arg0 >= -49) {
            return 4;
        } else {
            field2392++;
            return this.field2399[arg1] & 0x3;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lbo;I)V", line = 67)
    public static final void method1221(class256 arg0, int arg1) {
        field2400++;
        if (arg0.field3665 == 0) {
            return;
        }
        class194 var2 = arg0.method1753(-1);
        if (arg0.field3676 != -1 && arg0.field3676 < 32768) {
            class329 var3 = class42.field484[arg0.field3676];
            if (var3 != null) {
                int var4 = arg0.field3745 - var3.field3745;
                int var5 = arg0.field3679 - var3.field3679;
                if (var4 != 0 || var5 != 0) {
                    arg0.field3666 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field3676 >= 32768) {
            int var6 = arg0.field3676 - 32768;
            if (class306.field4593 == var6) {
                var6 = 2047;
            }
            class241 var7 = class169.field2306[var6];
            if (var7 != null) {
                int var8 = arg0.field3679 - var7.field3679;
                int var9 = arg0.field3745 - var7.field3745;
                if (var9 != 0 || var8 != 0) {
                    arg0.field3666 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1 >= -58) {
            method1222((byte) -43);
        }
        if ((arg0.field3757 != 0 || arg0.field3690 != 0) && (arg0.field3743 == 0 || arg0.field3662 > 0)) {
            int var10 = arg0.field3745 - ((arg0.field3757 - class132.field1809 - class132.field1809) * 64);
            int var11 = arg0.field3679 - (arg0.field3690 - class296.field4394 - class296.field4394) * 64;
            if (var10 != 0 || var11 != 0) {
                arg0.field3666 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field3757 = 0;
            arg0.field3690 = 0;
        }
        int var12 = arg0.field3666 - arg0.field3746 & 0x7FF;
        if (var12 == 0) {
            arg0.field3722 = 0;
            arg0.field3731 = 0;
        } else if (var2.field2662 == 0) {
            arg0.field3731++;
            if (var12 <= 1024) {
                arg0.field3746 += arg0.field3665;
                boolean var20 = true;
                if (var12 < arg0.field3665 || var12 > (2048 - arg0.field3665)) {
                    var20 = false;
                    arg0.field3746 = arg0.field3666;
                }
                if (arg0.field3731 > 25 || var20) {
                    arg0.field3719 = var2.field2703;
                    if (arg0.field3743 > 0) {
                        if (arg0.field3750[arg0.field3743 - 1] == 2) {
                            if (var2.field2678 != -1) {
                                arg0.field3719 = var2.field2678;
                            } else if (var2.field2682 != -1) {
                                arg0.field3719 = var2.field2682;
                            }
                        } else if (arg0.field3750[arg0.field3743 - 1] == 0) {
                            if (var2.field2687 != -1) {
                                arg0.field3719 = var2.field2687;
                            } else if (var2.field2699 != -1) {
                                arg0.field3719 = var2.field2699;
                            }
                        } else if (var2.field2686 != -1) {
                            arg0.field3719 = var2.field2686;
                        }
                    } else if (var2.field2672 != -1) {
                        arg0.field3719 = var2.field2672;
                    }
                }
            } else {
                arg0.field3746 -= arg0.field3665;
                boolean var21 = true;
                if (arg0.field3665 > var12 || var12 > 2048 - arg0.field3665) {
                    arg0.field3746 = arg0.field3666;
                    var21 = false;
                }
                if (arg0.field3731 > 25 || var21) {
                    arg0.field3719 = var2.field2703;
                    if (arg0.field3743 > 0) {
                        if (arg0.field3750[arg0.field3743 - 1] == 2) {
                            if (var2.field2681 != -1) {
                                arg0.field3719 = var2.field2681;
                            } else if (var2.field2682 != -1) {
                                arg0.field3719 = var2.field2682;
                            }
                        } else if (arg0.field3750[arg0.field3743 - 1] == 0) {
                            if (var2.field2663 != -1) {
                                arg0.field3719 = var2.field2663;
                            } else if (var2.field2699 != -1) {
                                arg0.field3719 = var2.field2699;
                            }
                        } else if (var2.field2661 != -1) {
                            arg0.field3719 = var2.field2661;
                        }
                    } else if (var2.field2671 != -1) {
                        arg0.field3719 = var2.field2671;
                    }
                }
            }
            arg0.field3746 &= 0x7FF;
        } else {
            arg0.field3719 = -1;
            int var13 = arg0.field3666 << 5;
            if (arg0.field3753 != var13) {
                arg0.field3726 = 0;
                int var14 = var13 - arg0.field3696 & 0xFFFF;
                int var15 = arg0.field3722 * arg0.field3722 / (var2.field2662 * 2);
                if (arg0.field3722 > 0 && var15 <= var14 && var14 - var15 < 32768) {
                    arg0.field3660 = true;
                    int var16 = var2.field2669 * var2.field2669 / (var2.field2662 * 2);
                    arg0.field3663 = var14 / 2;
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (var16 < arg0.field3663) {
                        arg0.field3663 = var14 - var16;
                    }
                } else if (arg0.field3722 < 0 && (65536 - var14) >= var15 && 65536 - var14 - var15 < 32768) {
                    arg0.field3663 = (65536 - var14) / 2;
                    arg0.field3660 = true;
                    int var17 = var2.field2669 * var2.field2669 / (var2.field2662 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (var17 < arg0.field3663) {
                        arg0.field3663 = 65536 - var14 - var17;
                    }
                } else {
                    arg0.field3660 = false;
                }
                arg0.field3753 = var13;
            }
            if (arg0.field3722 == 0) {
                int var18 = arg0.field3753 - arg0.field3696 & 0xFFFF;
                if (var18 < var2.field2662) {
                    arg0.field3696 = arg0.field3753;
                } else {
                    int var19 = var2.field2669 * var2.field2669 / (var2.field2662 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    arg0.field3726 = 0;
                    arg0.field3660 = true;
                    if (var18 < 32768) {
                        arg0.field3663 = var18 / 2;
                        if (var19 < arg0.field3663) {
                            arg0.field3663 = var18 - var19;
                        }
                        arg0.field3722 = var2.field2662;
                    } else {
                        arg0.field3722 = -var2.field2662;
                        arg0.field3663 = (65536 - var18) / 2;
                        if (arg0.field3663 > var19) {
                            arg0.field3663 = 65536 - var18 - var19;
                        }
                    }
                }
            } else if (arg0.field3722 > 0) {
                if (arg0.field3663 <= arg0.field3726) {
                    arg0.field3660 = false;
                }
                if (!arg0.field3660) {
                    arg0.field3722 -= var2.field2662;
                    if (arg0.field3722 < 0) {
                        arg0.field3722 = 0;
                    }
                } else if (var2.field2669 > arg0.field3722) {
                    arg0.field3722 += var2.field2662;
                }
            } else {
                if (arg0.field3726 >= arg0.field3663) {
                    arg0.field3660 = false;
                }
                if (!arg0.field3660) {
                    arg0.field3722 += var2.field2662;
                    if (arg0.field3722 > 0) {
                        arg0.field3722 = 0;
                    }
                } else if (arg0.field3722 > (-var2.field2669)) {
                    arg0.field3722 -= var2.field2662;
                }
            }
            if (arg0.field3722 > 0) {
                arg0.field3726 += arg0.field3722;
            } else {
                arg0.field3726 -= arg0.field3722;
            }
            arg0.field3696 += arg0.field3722;
            arg0.field3696 &= 0xFFFF;
            arg0.field3746 = arg0.field3696 >> 5;
            if (arg0.field3722 < 0) {
                if (arg0.field3743 > 0) {
                    if (arg0.field3750[arg0.field3743 - 1] == 2) {
                        if (var2.field2681 != -1) {
                            arg0.field3719 = var2.field2681;
                        } else if (var2.field2682 != -1) {
                            arg0.field3719 = var2.field2682;
                        }
                    } else if (arg0.field3750[arg0.field3743 - 1] == 0) {
                        if (var2.field2663 != -1) {
                            arg0.field3719 = var2.field2663;
                        } else if (var2.field2699 != -1) {
                            arg0.field3719 = var2.field2699;
                        }
                    }
                }
                if (arg0.field3719 == -1) {
                    if (var2.field2661 != -1) {
                        arg0.field3719 = var2.field2661;
                    } else if (var2.field2671 != -1) {
                        arg0.field3719 = var2.field2671;
                    }
                }
            } else {
                if (arg0.field3743 > 0) {
                    if (arg0.field3750[arg0.field3743 - 1] == 2) {
                        if (var2.field2678 != -1) {
                            arg0.field3719 = var2.field2678;
                        } else if (var2.field2682 != -1) {
                            arg0.field3719 = var2.field2682;
                        }
                    } else if (arg0.field3750[arg0.field3743 - 1] == 0) {
                        if (var2.field2687 != -1) {
                            arg0.field3719 = var2.field2687;
                        } else if (var2.field2699 != -1) {
                            arg0.field3719 = var2.field2699;
                        }
                    }
                }
                if (arg0.field3719 == -1) {
                    if (var2.field2686 != -1) {
                        arg0.field3719 = var2.field2686;
                    } else if (var2.field2672 != -1) {
                        arg0.field3719 = var2.field2672;
                    }
                }
            }
            if (arg0.field3719 == -1) {
                arg0.field3719 = var2.field2703;
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 506)
    public static void method1222(byte arg0) {
        field2398 = null;
        field2393 = null;
        field2391 = null;
        if (arg0 > -57) {
            method1219(-60, true);
        }
        field2394 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)Z", line = 532)
    public final boolean method1223(byte arg0, int arg1) {
        field2396++;
        int var3 = -68 % ((-arg0 - 12) / 48);
        return (this.field2399[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)Z", line = 545)
    public final boolean method1224(int arg0, int arg1) {
        if (arg0 >= -17) {
            return true;
        } else {
            field2395++;
            return (this.field2399[arg1] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(I)V", line = 562)
    public class176(int arg0) {
        this.field2397 = arg0;
        this.field2390 = new String[this.field2397];
        this.field2399 = new byte[this.field2397];
        this.field2389 = new int[this.field2397];
        this.field2401 = new int[this.field2397];
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)Z", line = 575)
    public final boolean method1225(int arg0, int arg1) {
        field2388++;
        if (arg0 != -1) {
            field2393 = (boolean[]) null;
        }
        return (this.field2399[arg1] & 0x10) == 0;
    }
}
