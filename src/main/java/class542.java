import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class542 {

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "Lui;")
    public static class193 field7916 = new class193();

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "[S")
    public static short[] field7930 = new short[] { 13, 49, 3, 50, 60, 18, 4, 9 };

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public int field7915;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field7917;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
    public static int field7918;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
    public int field7920;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
    public static int field7921;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "I")
    public int field7924;

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field7925;

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field7932;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
    public static int field7935;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "I")
    public static int field7936;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
    public int field7939;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "[[I")
    public int[][] field7922;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIB)V", line = 3)
    private final void method3151(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 57) {
            field7916 = null;
        }
        field7934++;
        this.field7922[arg1][arg2] = class288.method1624(this.field7922[arg1][arg2], ~arg0);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZI)V", line = 14)
    public static final void method3152(boolean arg0, int arg1) {
        if (class597.field8642 != null) {
            class597.field8642.method2266((byte) 104);
            class597.field8642 = null;
        }
        field7936++;
        class197.field2381 = 0;
        class116.method686(-2);
        class611.method3514();
        for (int var2 = 0; var2 < 4; var2++) {
            class309.field3939[var2].method3164(119);
        }
        class390.method2238((byte) -128, false);
        System.gc();
        class224.method1287(2, (byte) -85);
        class225.field2766 = -1;
        class157.field1921 = false;
        class119.method702(true, true);
        class522.field7330 = 0;
        class593.field8620 = 0;
        class553.field8138 = 0;
        class632.field9113 = 0;
        class343.field4424 = 0;
        class119.field1504 = 0;
        for (int var3 = 0; var3 < class225.field2765.length; var3++) {
            class225.field2765[var3] = null;
        }
        if (arg1 != -14485) {
            method3152(true, -50);
        }
        class147.method812(2048);
        for (int var4 = 0; var4 < 2048; var4++) {
            class459.field6329[var4] = null;
        }
        class474.field6637 = 0;
        class309.field3938.method2642(true);
        class98.field1215 = 0;
        class150.field1787.method2642(true);
        class243.method1381(arg1 + 23892);
        class567.field8326 = 0;
        class281.field3700.method1639(-14752);
        class434.method2510((byte) -2);
        class496.method2865((byte) 107);
        class216.field2639 = null;
        class91.field1127 = 0L;
        if (arg0) {
            class35.method200(11, 2);
            return;
        }
        class35.method200(2, 2);
        try {
            class47.method249("loggedout", class74.field873.field2014, (byte) 98);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIII)V", line = 93)
    private final void method3153(int arg0, int arg1, int arg2, int arg3) {
        this.field7922[arg3][arg2] = class42.method223(this.field7922[arg3][arg2], arg0);
        if (arg1 != 1) {
            this.method3169(-86, 72, false, -55, false, -119, 86, -35);
        }
        field7919++;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIIBI)Z", line = 106)
    public final boolean method3154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field7931++;
        if (arg5 == 1) {
            if (arg3 == arg4 && arg1 == arg7) {
                return true;
            }
        } else if (arg4 <= arg3 && arg3 <= (arg4 + arg5 - 1) && arg1 <= arg1 && arg1 + arg5 - 1 >= arg1) {
            return true;
        }
        int var9 = arg4 - this.field7939;
        if (arg6 != -10) {
            this.field7920 = 41;
        }
        int var10 = arg1 - this.field7915;
        int var11 = arg7 - this.field7915;
        int var12 = arg3 - this.field7939;
        if (arg5 == 1) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field7922[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field7922[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var12 + 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field7922[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field7922[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    if ((var12 - 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field7922[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field7922[var9][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field7922[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var12 - 1 == var9 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field7922[var9][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field7922[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var10 - 1) == var11 && (this.field7922[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field7922[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var9 - 1;
            int var14 = arg5 + var11 - 1;
            if (arg2 == 0) {
                if (arg0 == 0) {
                    if ((var12 - arg5) == var9 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var10 + 1) == var11 && (this.field7922[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg5 == var11 && (this.field7922[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 <= var12 && var12 <= var13 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 - arg5 == var9 && var11 <= var10 && var10 <= var14 && (this.field7922[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field7922[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var12 + 1) == var9 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var10 + 1 == var11 && (this.field7922[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var10 - arg5 == var11 && (this.field7922[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 <= var12 && var12 <= var13 && var10 - arg5 == var11) {
                        return true;
                    }
                    if ((var12 - arg5) == var9 && var11 <= var10 && var14 >= var10 && (this.field7922[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field7922[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    if (var12 - arg5 == var9 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 <= var10 && var14 >= var10 && (this.field7922[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var10 - arg5) == var11 && (this.field7922[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var12 - arg5 == var9 && var11 <= var10 && var14 >= var10 && (this.field7922[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var10 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 - arg5 == var11 && (this.field7922[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var12 - arg5) == var9 && var11 <= var10 && var10 <= var14 && (this.field7922[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 + 1 == var11 && (this.field7922[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var13 >= var12 && var10 - arg5 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var12 - arg5) == var9 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var10 + 1) == var11 && (this.field7922[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var10 >= var11 && var10 <= var14 && (this.field7922[var9][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && var10 - arg5 == var11) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var12 >= var9 && var12 <= var13 && var10 + 1 == var11 && (this.field7922[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var12 && var12 <= var13 && (var10 - arg5) == var11 && (this.field7922[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var12 - arg5 == var9 && var11 <= var10 && var10 <= var14 && (this.field7922[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var11 <= var10 && var14 >= var10 && (this.field7922[var9][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 478)
    public static void method3155(byte arg0) {
        int var1 = 102 / ((arg0 + 25) / 49);
        field7930 = null;
        field7916 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIBII)Z", line = 491)
    public final boolean method3156(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field7940++;
        if (arg6 == 1) {
            if (arg1 == arg3 && arg2 == arg7) {
                return true;
            }
        } else if (arg3 <= arg1 && arg3 + arg6 - 1 >= arg1 && arg7 <= arg7 && arg7 + arg6 - 1 >= arg7) {
            return true;
        }
        int var9 = arg2 - this.field7915;
        int var10 = arg3 - this.field7939;
        int var11 = arg1 - this.field7939;
        int var12 = arg7 - this.field7915;
        int var13 = -48 / ((arg5 - 38) / 56);
        if (arg6 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field7922[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field7922[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field7922[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field7922[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field7922[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field7922[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var10 && var9 == var12 && (this.field7922[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field7922[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field7922[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field7922[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field7922[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field7922[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg6 + var10 - 1;
            int var15 = arg6 + var9 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if (var11 + 1 == var10 && var9 <= var12 && var15 >= var12 && (this.field7922[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && var12 - arg6 == var9 && (this.field7922[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var11 - arg6) == var10 && var9 <= var12 && var15 >= var12 && (this.field7922[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && (var12 - arg6) == var9 && (this.field7922[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - arg6) == var10 && var12 >= var9 && var12 <= var15 && (this.field7922[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var11 <= var14 && var12 + 1 == var9 && (this.field7922[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var11 + 1 == var10 && var12 >= var9 && var15 >= var12 && (this.field7922[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var10 && var14 >= var11 && (var12 + 1) == var9 && (this.field7922[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var10 <= var11 && var11 <= var14 && (var12 + 1) == var9 && (this.field7922[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var10 && var14 >= var11 && var12 - arg6 == var9 && (this.field7922[var11][var15] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg6 == var10 && var9 <= var12 && var12 <= var15 && (this.field7922[var14][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var10 && var9 <= var12 && var15 >= var12 && (this.field7922[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIIIII)Z", line = 677)
    public final boolean method3157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7932++;
        if (arg6 > -106) {
            return true;
        } else if (arg0 > 1) {
            return class320.method1765(arg3, arg0, 118, arg4, arg1, arg2, arg7, arg0, arg5) ? true : this.method3158(arg8, arg5, -73, arg2, arg4, arg7, arg0, arg0, arg1, arg3);
        } else {
            int var10 = arg4 + arg5 - 1;
            int var11 = arg2 + arg3 - 1;
            if (arg4 <= arg1 && var10 >= arg1 && arg7 >= arg2 && arg7 <= var11) {
                return true;
            } else if (arg4 - 1 == arg1 && arg2 <= arg7 && var11 >= arg7 && (this.field7922[arg1 - this.field7939][arg7 - this.field7915] & 0x8) == 0 && (arg8 & 0x8) == 0) {
                return true;
            } else if ((var10 + 1) == arg1 && arg2 <= arg7 && arg7 <= var11 && (this.field7922[arg1 - this.field7939][arg7 - this.field7915] & 0x80) == 0 && (arg8 & 0x2) == 0) {
                return true;
            } else if ((arg2 - 1) == arg7 && arg4 <= arg1 && var10 >= arg1 && (this.field7922[arg1 - this.field7939][arg7 - this.field7915] & 0x2) == 0 && (arg8 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg7 && arg4 <= arg1 && arg1 <= var10 && (this.field7922[arg1 - this.field7939][arg7 - this.field7915] & 0x20) == 0 && (arg8 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIIIIII)Z", line = 720)
    public final boolean method3158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7925++;
        int var11 = arg7 + arg8;
        int var12 = arg5 + arg6;
        int var13 = arg1 + arg4;
        int var14 = arg3 + arg9;
        if (arg2 > -28) {
            field7930 = null;
        }
        if (arg8 == var13 && (arg0 & 0x2) == 0) {
            int var15 = arg5 <= arg3 ? arg3 : arg5;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field7922[var13 - this.field7939 - 1][var15 - this.field7915] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg4 == var11 && (arg0 & 0x8) == 0) {
            int var17 = arg3 < arg5 ? arg5 : arg3;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field7922[arg4 - this.field7939][var17 - this.field7915] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg5 == var14 && (arg0 & 0x1) == 0) {
            int var19 = arg4 >= arg8 ? arg4 : arg8;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field7922[var19 - this.field7939][var14 - this.field7915 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg0 & 0x4) == 0) {
            int var21 = arg4 < arg8 ? arg8 : arg4;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field7922[var21 - this.field7939][arg3 - this.field7915] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBI)V", line = 813)
    public final void method3159(int arg0, byte arg1, int arg2) {
        if (arg1 >= -97) {
            this.field7939 = 114;
        }
        field7917++;
        int var4 = arg0 - this.field7939;
        int var5 = arg2 - this.field7915;
        this.field7922[var4][var5] = class288.method1624(this.field7922[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIBZIIZ)V", line = 828)
    public final void method3160(int arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field7927++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg5 - this.field7939;
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var10 = arg1 - this.field7915;
        for (int var11 = var9; var11 < arg0 + var9; var11++) {
            if (var11 >= 0 && var11 < this.field7924) {
                for (int var12 = var10; var12 < (arg4 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field7920) {
                        this.method3153(var8, 1, var12, var11);
                    }
                }
            }
        }
        if (arg2 >= -25) {
            this.method3163(2, false, 78, 33, -120, (byte) -120, true);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)V", line = 873)
    public final void method3161(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field7915;
        int var5 = arg0 - this.field7939;
        if (arg1 >= -108) {
            field7916 = null;
        }
        field7921++;
        this.field7922[var5][var4] = class42.method223(this.field7922[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V", line = 892)
    public static final void method3162(int arg0) {
        class63.field628 = class410.field5340.field2634 + class410.field5340.field2624 + 2;
        class614.field8895 = class92.field1129.field2624 + class92.field1129.field2634 + 2;
        class330.field4302 = new String[500];
        field7935++;
        int var1 = -127 / ((arg0 + 17) / 62);
        for (int var2 = 0; var2 < class330.field4302.length; var2++) {
            class330.field4302[var2] = "";
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZIIIBZ)V", line = 920)
    public final void method3163(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        int var8 = arg4 - this.field7915;
        if (arg5 != -33) {
            this.method3154(-125, 107, -93, 16, 3, 48, (byte) 41, -76);
        }
        int var9 = arg3 - this.field7939;
        field7928++;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method3151(128, var9, var8, (byte) 57);
                this.method3151(8, var9 - 1, var8, (byte) 57);
            }
            if (arg0 == 1) {
                this.method3151(2, var9, var8, (byte) 57);
                this.method3151(32, var9, var8 + 1, (byte) 57);
            }
            if (arg0 == 2) {
                this.method3151(8, var9, var8, (byte) 57);
                this.method3151(128, var9 + 1, var8, (byte) 57);
            }
            if (arg0 == 3) {
                this.method3151(32, var9, var8, (byte) 57);
                this.method3151(2, var9, var8 - 1, (byte) 57);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method3151(1, var9, var8, (byte) 57);
                this.method3151(16, var9 - 1, var8 + 1, (byte) 57);
            }
            if (arg0 == 1) {
                this.method3151(4, var9, var8, (byte) 57);
                this.method3151(64, var9 + 1, var8 - -1, (byte) 57);
            }
            if (arg0 == 2) {
                this.method3151(16, var9, var8, (byte) 57);
                this.method3151(1, var9 + 1, var8 + -1, (byte) 57);
            }
            if (arg0 == 3) {
                this.method3151(64, var9, var8, (byte) 57);
                this.method3151(4, var9 - 1, var8 + -1, (byte) 57);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method3151(130, var9, var8, (byte) 57);
                this.method3151(8, var9 - 1, var8, (byte) 57);
                this.method3151(32, var9, var8 + 1, (byte) 57);
            }
            if (arg0 == 1) {
                this.method3151(10, var9, var8, (byte) 57);
                this.method3151(32, var9, var8 + 1, (byte) 57);
                this.method3151(128, var9 + 1, var8, (byte) 57);
            }
            if (arg0 == 2) {
                this.method3151(40, var9, var8, (byte) 57);
                this.method3151(128, var9 + 1, var8, (byte) 57);
                this.method3151(2, var9, var8 - 1, (byte) 57);
            }
            if (arg0 == 3) {
                this.method3151(160, var9, var8, (byte) 57);
                this.method3151(2, var9, var8 - 1, (byte) 57);
                this.method3151(8, var9 - 1, var8, (byte) 57);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method3151(65536, var9, var8, (byte) 57);
                    this.method3151(4096, var9 - 1, var8, (byte) 57);
                }
                if (arg0 == 1) {
                    this.method3151(1024, var9, var8, (byte) 57);
                    this.method3151(16384, var9, var8 + 1, (byte) 57);
                }
                if (arg0 == 2) {
                    this.method3151(4096, var9, var8, (byte) 57);
                    this.method3151(65536, var9 + 1, var8, (byte) 57);
                }
                if (arg0 == 3) {
                    this.method3151(16384, var9, var8, (byte) 57);
                    this.method3151(1024, var9, var8 - 1, (byte) 57);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method3151(512, var9, var8, (byte) 57);
                    this.method3151(8192, var9 - 1, var8 + 1, (byte) 57);
                }
                if (arg0 == 1) {
                    this.method3151(2048, var9, var8, (byte) 57);
                    this.method3151(32768, var9 + 1, var8 + 1, (byte) 57);
                }
                if (arg0 == 2) {
                    this.method3151(8192, var9, var8, (byte) 57);
                    this.method3151(512, var9 + 1, var8 + -1, (byte) 57);
                }
                if (arg0 == 3) {
                    this.method3151(32768, var9, var8, (byte) 57);
                    this.method3151(2048, var9 - 1, var8 + -1, (byte) 57);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method3151(66560, var9, var8, (byte) 57);
                    this.method3151(4096, var9 - 1, var8, (byte) 57);
                    this.method3151(16384, var9, var8 + 1, (byte) 57);
                }
                if (arg0 == 1) {
                    this.method3151(5120, var9, var8, (byte) 57);
                    this.method3151(16384, var9, var8 + 1, (byte) 57);
                    this.method3151(65536, var9 + 1, var8, (byte) 57);
                }
                if (arg0 == 2) {
                    this.method3151(20480, var9, var8, (byte) 57);
                    this.method3151(65536, var9 + 1, var8, (byte) 57);
                    this.method3151(1024, var9, var8 - 1, (byte) 57);
                }
                if (arg0 == 3) {
                    this.method3151(81920, var9, var8, (byte) 57);
                    this.method3151(1024, var9, var8 - 1, (byte) 57);
                    this.method3151(4096, var9 - 1, var8, (byte) 57);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method3151(536870912, var9, var8, (byte) 57);
                this.method3151(33554432, var9 - 1, var8, (byte) 57);
            }
            if (arg0 == 1) {
                this.method3151(8388608, var9, var8, (byte) 57);
                this.method3151(134217728, var9, var8 + 1, (byte) 57);
            }
            if (arg0 == 2) {
                this.method3151(33554432, var9, var8, (byte) 57);
                this.method3151(536870912, var9 + 1, var8, (byte) 57);
            }
            if (arg0 == 3) {
                this.method3151(134217728, var9, var8, (byte) 57);
                this.method3151(8388608, var9, var8 - 1, (byte) 57);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method3151(4194304, var9, var8, (byte) 57);
                this.method3151(67108864, var9 - 1, var8 + 1, (byte) 57);
            }
            if (arg0 == 1) {
                this.method3151(16777216, var9, var8, (byte) 57);
                this.method3151(268435456, var9 + 1, var8 - -1, (byte) 57);
            }
            if (arg0 == 2) {
                this.method3151(67108864, var9, var8, (byte) 57);
                this.method3151(4194304, var9 + 1, var8 + -1, (byte) 57);
            }
            if (arg0 == 3) {
                this.method3151(268435456, var9, var8, (byte) 57);
                this.method3151(16777216, var9 - 1, var8 + -1, (byte) 57);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method3151(545259520, var9, var8, (byte) 57);
            this.method3151(33554432, var9 - 1, var8, (byte) 57);
            this.method3151(134217728, var9, var8 + 1, (byte) 57);
        }
        if (arg0 == 1) {
            this.method3151(41943040, var9, var8, (byte) 57);
            this.method3151(134217728, var9, var8 + 1, (byte) 57);
            this.method3151(536870912, var9 + 1, var8, (byte) 57);
        }
        if (arg0 == 2) {
            this.method3151(167772160, var9, var8, (byte) 57);
            this.method3151(536870912, var9 + 1, var8, (byte) 57);
            this.method3151(8388608, var9, var8 - 1, (byte) 57);
        }
        if (arg0 == 3) {
            this.method3151(671088640, var9, var8, (byte) 57);
            this.method3151(8388608, var9, var8 - 1, (byte) 57);
            this.method3151(33554432, var9 - 1, var8, (byte) 57);
            return;
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V", line = 1232)
    public final void method3164(int arg0) {
        field7926++;
        if (arg0 <= 113) {
            field7916 = null;
        }
        for (int var2 = 0; var2 < this.field7924; var2++) {
            for (int var3 = 0; var3 < this.field7920; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field7924 - 5 || (this.field7920 - 5) <= var3) {
                    this.field7922[var2][var3] = -1;
                } else {
                    this.field7922[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IJBI)V", line = 1263)
    public static final void method3165(int arg0, long arg1, byte arg2, int arg3) {
        field7918++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = ((int) arg1 & 0x3FDDC8) >> 20;
        if (arg2 != 37) {
            field7930 = null;
        }
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class546.method3204(0, true, var6, 0, arg3, arg0, 0, var5, true);
            return;
        }
        class437 var8 = class16.field126.method1759(false, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field5945;
            var9 = var8.field5982;
        } else {
            var9 = var8.field5945;
            var10 = var8.field5982;
        }
        int var11 = var8.field5949;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class546.method3204(var11, true, 0, var9, arg3, arg0, var10, 0, true);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIBZIII)V", line = 1307)
    public final void method3166(boolean arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field7915;
        field7923++;
        int var9 = arg1 - this.field7939;
        if (arg2 != -80) {
            this.field7924 = -38;
        }
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method3153(128, 1, var8, var9);
                this.method3153(8, arg2 ^ 0xFFFFFFB1, var8, var9 - 1);
            }
            if (arg5 == 1) {
                this.method3153(2, arg2 + 81, var8, var9);
                this.method3153(32, 1, var8 + 1, var9);
            }
            if (arg5 == 2) {
                this.method3153(8, 1, var8, var9);
                this.method3153(128, arg2 ^ 0xFFFFFFB1, var8, var9 + 1);
            }
            if (arg5 == 3) {
                this.method3153(32, 1, var8, var9);
                this.method3153(2, 1, var8 - 1, var9);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method3153(1, 1, var8, var9);
                this.method3153(16, 1, var8 + 1, var9 + -1);
            }
            if (arg5 == 1) {
                this.method3153(4, arg2 ^ 0xFFFFFFB1, var8, var9);
                this.method3153(64, 1, var8 + 1, var9 + 1);
            }
            if (arg5 == 2) {
                this.method3153(16, 1, var8, var9);
                this.method3153(1, arg2 ^ 0xFFFFFFB1, var8 - 1, var9 + 1);
            }
            if (arg5 == 3) {
                this.method3153(64, 1, var8, var9);
                this.method3153(4, 1, var8 - 1, var9 + -1);
            }
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                this.method3153(130, 1, var8, var9);
                this.method3153(8, 1, var8, var9 - 1);
                this.method3153(32, arg2 + 81, var8 + 1, var9);
            }
            if (arg5 == 1) {
                this.method3153(10, arg2 ^ 0xFFFFFFB1, var8, var9);
                this.method3153(32, 1, var8 + 1, var9);
                this.method3153(128, arg2 + 81, var8, var9 + 1);
            }
            if (arg5 == 2) {
                this.method3153(40, arg2 + 81, var8, var9);
                this.method3153(128, 1, var8, var9 + 1);
                this.method3153(2, 1, var8 - 1, var9);
            }
            if (arg5 == 3) {
                this.method3153(160, arg2 + 81, var8, var9);
                this.method3153(2, 1, var8 - 1, var9);
                this.method3153(8, arg2 + 81, var8, var9 - 1);
            }
        }
        if (arg0) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    this.method3153(65536, 1, var8, var9);
                    this.method3153(4096, 1, var8, var9 - 1);
                }
                if (arg5 == 1) {
                    this.method3153(1024, arg2 + 81, var8, var9);
                    this.method3153(16384, arg2 ^ 0xFFFFFFB1, var8 + 1, var9);
                }
                if (arg5 == 2) {
                    this.method3153(4096, arg2 ^ 0xFFFFFFB1, var8, var9);
                    this.method3153(65536, arg2 ^ 0xFFFFFFB1, var8, var9 + 1);
                }
                if (arg5 == 3) {
                    this.method3153(16384, 1, var8, var9);
                    this.method3153(1024, 1, var8 - 1, var9);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg5 == 0) {
                    this.method3153(512, 1, var8, var9);
                    this.method3153(8192, arg2 + 81, var8 + 1, var9 - 1);
                }
                if (arg5 == 1) {
                    this.method3153(2048, 1, var8, var9);
                    this.method3153(32768, 1, var8 + 1, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method3153(8192, 1, var8, var9);
                    this.method3153(512, arg2 ^ 0xFFFFFFB1, var8 - 1, var9 + 1);
                }
                if (arg5 == 3) {
                    this.method3153(32768, 1, var8, var9);
                    this.method3153(2048, 1, var8 - 1, var9 + -1);
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    this.method3153(66560, 1, var8, var9);
                    this.method3153(4096, arg2 + 81, var8, var9 - 1);
                    this.method3153(16384, arg2 + 81, var8 + 1, var9);
                }
                if (arg5 == 1) {
                    this.method3153(5120, 1, var8, var9);
                    this.method3153(16384, 1, var8 + 1, var9);
                    this.method3153(65536, arg2 + 81, var8, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method3153(20480, 1, var8, var9);
                    this.method3153(65536, arg2 ^ 0xFFFFFFB1, var8, var9 + 1);
                    this.method3153(1024, 1, var8 - 1, var9);
                }
                if (arg5 == 3) {
                    this.method3153(81920, 1, var8, var9);
                    this.method3153(1024, 1, var8 - 1, var9);
                    this.method3153(4096, 1, var8, var9 - 1);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method3153(536870912, arg2 ^ 0xFFFFFFB1, var8, var9);
                this.method3153(33554432, arg2 ^ 0xFFFFFFB1, var8, var9 - 1);
            }
            if (arg5 == 1) {
                this.method3153(8388608, 1, var8, var9);
                this.method3153(134217728, 1, var8 + 1, var9);
            }
            if (arg5 == 2) {
                this.method3153(33554432, 1, var8, var9);
                this.method3153(536870912, 1, var8, var9 + 1);
            }
            if (arg5 == 3) {
                this.method3153(134217728, 1, var8, var9);
                this.method3153(8388608, 1, var8 - 1, var9);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method3153(4194304, 1, var8, var9);
                this.method3153(67108864, 1, var8 + 1, var9 + -1);
            }
            if (arg5 == 1) {
                this.method3153(16777216, 1, var8, var9);
                this.method3153(268435456, 1, var8 + 1, var9 + 1);
            }
            if (arg5 == 2) {
                this.method3153(67108864, arg2 ^ 0xFFFFFFB1, var8, var9);
                this.method3153(4194304, 1, var8 - 1, var9 + 1);
            }
            if (arg5 == 3) {
                this.method3153(268435456, 1, var8, var9);
                this.method3153(16777216, 1, var8 - 1, var9 - 1);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method3153(545259520, arg2 ^ 0xFFFFFFB1, var8, var9);
            this.method3153(33554432, 1, var8, var9 - 1);
            this.method3153(134217728, 1, var8 + 1, var9);
        }
        if (arg5 == 1) {
            this.method3153(41943040, 1, var8, var9);
            this.method3153(134217728, 1, var8 + 1, var9);
            this.method3153(536870912, 1, var8, var9 + 1);
        }
        if (arg5 == 2) {
            this.method3153(167772160, 1, var8, var9);
            this.method3153(536870912, 1, var8, var9 + 1);
            this.method3153(8388608, arg2 ^ 0xFFFFFFB1, var8 - 1, var9);
        }
        if (arg5 == 3) {
            this.method3153(671088640, 1, var8, var9);
            this.method3153(8388608, 1, var8 - 1, var9);
            this.method3153(33554432, 1, var8, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)V", line = 1613)
    public final void method3167(int arg0, int arg1, byte arg2) {
        if (arg2 <= -7) {
            field7929++;
            int var4 = arg1 - this.field7915;
            int var5 = arg0 - this.field7939;
            this.field7922[var5][var4] = class42.method223(this.field7922[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(III)V", line = 1626)
    public final void method3168(int arg0, int arg1, int arg2) {
        if (arg0 == 8772) {
            int var4 = arg1 - this.field7939;
            field7933++;
            int var5 = arg2 - this.field7915;
            this.field7922[var4][var5] = class288.method1624(this.field7922[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIZIZIII)V", line = 1639)
    public final void method3169(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field7938++;
        int var9 = 256;
        if (arg4) {
            var9 |= 0x20000;
        }
        int var10 = arg1 - this.field7939;
        int var11 = arg7 - this.field7915;
        if (arg2) {
            var9 |= 0x40000000;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var12 = arg0;
            arg0 = arg5;
            arg5 = var12;
        }
        if (arg6 != -1) {
            return;
        }
        for (int var13 = var10; var13 < arg0 + var10; var13++) {
            if (var13 >= 0 && var13 < this.field7924) {
                for (int var14 = var11; var14 < arg5 + var11; var14++) {
                    if (var14 >= 0 && this.field7920 > var14) {
                        this.method3151(var9, var13, var14, (byte) 57);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)V", line = 1699)
    public static final void method3170(int arg0, byte arg1) {
        if (arg1 >= -20) {
            method3170(13, (byte) 116);
        }
        class34.field273 = arg0;
        field7937++;
        class62.field619 = -1;
        class62.field619 = -1;
        class182.method999((byte) 115);
    }
}
