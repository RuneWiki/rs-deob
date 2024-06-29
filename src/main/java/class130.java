import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class130 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field2014;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public int field2021;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[[I")
    public int[][] field2008;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method862(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2015++;
        if (arg1 != 27254) {
            return false;
        }
        if (arg3 == 1) {
            if (arg4 == arg6 && arg0 == arg5) {
                return true;
            }
        } else if (arg4 >= arg6 && arg6 + arg3 - 1 >= arg4 && arg5 <= arg5 && arg5 <= (arg5 + arg3 - 1)) {
            return true;
        }
        int var9 = arg0 - this.field2009;
        int var10 = arg4 - this.field2021;
        int var11 = arg6 - this.field2021;
        int var12 = arg5 - this.field2009;
        if (arg3 == 1) {
            if (arg2 == 0) {
                if (arg7 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2008[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2008[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field2008[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field2008[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg7 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2008[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field2008[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2008[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field2008[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field2008[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field2008[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field2008[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg3 + var11 - 1;
            int var14 = var9 + arg3 - 1;
            if (arg2 == 0) {
                if (arg7 == 0) {
                    if ((var10 - arg3) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9 && (this.field2008[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 - arg3 == var9 && (this.field2008[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - arg3) == var11 && var9 <= var12 && var14 >= var12 && (this.field2008[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14 && (this.field2008[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 + 1 == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9 && (this.field2008[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 - arg3 == var9 && (this.field2008[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 <= var10 && var13 >= var10 && var12 - arg3 == var9) {
                        return true;
                    }
                    if ((var10 - arg3) == var11 && var12 >= var9 && var14 >= var12 && (this.field2008[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12 && (this.field2008[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg7 == 0) {
                    if (var10 - arg3 == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var12 <= var14 && (this.field2008[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg3) == var9 && (this.field2008[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var10 - arg3) == var11 && var12 >= var9 && var12 <= var14 && (this.field2008[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg3) == var9 && (this.field2008[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 - arg3) == var11 && var9 <= var12 && var14 >= var12 && (this.field2008[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9 && (this.field2008[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 - arg3 == var9) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 - arg3 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9 && (this.field2008[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12 && (this.field2008[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 - arg3 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9 && (this.field2008[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var13 >= var10 && var12 - arg3 == var9 && (this.field2008[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg3 == var11 && var9 <= var12 && var12 <= var14 && (this.field2008[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12 && (this.field2008[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public final void method863(int arg0) {
        for (int var2 = 0; var2 < this.field2005; var2++) {
            for (int var3 = 0; var3 < this.field2014; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2005 - 5 <= var2 || this.field2014 - 5 <= var3) {
                    this.field2008[var2][var3] = -1;
                } else {
                    this.field2008[var2][var3] = 2097152;
                }
            }
        }
        field2013++;
        if (arg0 >= -41) {
            this.field2009 = -83;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)[Lso;")
    public static final class327[] method864(int arg0) {
        field2007++;
        return arg0 <= 85 ? null : new class327[] { class40.field583, class47.field768, class338.field4753, class352.field5397, class38.field561, class400.field6007, class480.field7046, class5.field66, class75.field1115, class234.field3483, class442.field6595, class60.field891, class489.field7225, class381.field5775, class76.field1122 };
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIII)V")
    private final void method865(byte arg0, int arg1, int arg2, int arg3) {
        this.field2008[arg2][arg3] = class18.method119(this.field2008[arg2][arg3], arg1);
        if (arg0 >= -91) {
            this.field2005 = -111;
        }
        field2020++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIBIIII)Z")
    public final boolean method866(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field2022++;
        if (arg6 > 1) {
            return class429.method2562(arg1, arg5, arg6, arg0, arg8, (byte) -103, arg7, arg6, arg3) ? true : this.method868(67108864, arg8, arg7, arg1, arg6, arg6, arg0, arg2, arg3, arg5);
        }
        if (arg4 < 8) {
            this.method870(99, -23, 12);
        }
        int var10 = arg3 + arg7 - 1;
        int var11 = arg0 + arg1 - 1;
        if (arg3 <= arg5 && arg5 <= var10 && arg1 <= arg8 && arg8 <= var11) {
            return true;
        } else if (arg3 - 1 == arg5 && arg8 >= arg1 && var11 >= arg8 && (this.field2008[arg5 - this.field2021][arg8 - this.field2009] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg5 && arg8 >= arg1 && var11 >= arg8 && (this.field2008[arg5 - this.field2021][arg8 - this.field2009] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg8 && arg5 >= arg3 && arg5 <= var10 && (this.field2008[arg5 - this.field2021][arg8 - this.field2009] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg8 && arg5 >= arg3 && var10 >= arg5 && (this.field2008[arg5 - this.field2021][arg8 - this.field2009] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIZIZ)V")
    public final void method867(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg5 - this.field2021;
        field2006++;
        int var9 = arg3 - this.field2009;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method876(128, var9, var8, -92);
                this.method876(8, var9, var8 - 1, 122);
            }
            if (arg0 == 1) {
                this.method876(2, var9, var8, 115);
                this.method876(32, var9 + 1, var8, 111);
            }
            if (arg0 == 2) {
                this.method876(8, var9, var8, 117);
                this.method876(128, var9, var8 + 1, -127);
            }
            if (arg0 == 3) {
                this.method876(32, var9, var8, 95);
                this.method876(2, var9 - 1, var8, -71);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method876(1, var9, var8, 60);
                this.method876(16, var9 + 1, var8 + -1, -84);
            }
            if (arg0 == 1) {
                this.method876(4, var9, var8, -67);
                this.method876(64, var9 + 1, var8 + 1, -85);
            }
            if (arg0 == 2) {
                this.method876(16, var9, var8, -116);
                this.method876(1, var9 - 1, var8 + 1, 124);
            }
            if (arg0 == 3) {
                this.method876(64, var9, var8, 78);
                this.method876(4, var9 - 1, var8 + -1, 70);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method876(130, var9, var8, 100);
                this.method876(8, var9, var8 - 1, -95);
                this.method876(32, var9 + 1, var8, 53);
            }
            if (arg0 == 1) {
                this.method876(10, var9, var8, 104);
                this.method876(32, var9 + 1, var8, -90);
                this.method876(128, var9, var8 + 1, 84);
            }
            if (arg0 == 2) {
                this.method876(40, var9, var8, 99);
                this.method876(128, var9, var8 + 1, 103);
                this.method876(2, var9 - 1, var8, -21);
            }
            if (arg0 == 3) {
                this.method876(160, var9, var8, 56);
                this.method876(2, var9 - 1, var8, 88);
                this.method876(8, var9, var8 - 1, 105);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method876(65536, var9, var8, 104);
                    this.method876(4096, var9, var8 - 1, 126);
                }
                if (arg0 == 1) {
                    this.method876(1024, var9, var8, 78);
                    this.method876(16384, var9 + 1, var8, -63);
                }
                if (arg0 == 2) {
                    this.method876(4096, var9, var8, -120);
                    this.method876(65536, var9, var8 + 1, 126);
                }
                if (arg0 == 3) {
                    this.method876(16384, var9, var8, -41);
                    this.method876(1024, var9 - 1, var8, 68);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method876(512, var9, var8, -59);
                    this.method876(8192, var9 + 1, var8 + -1, -41);
                }
                if (arg0 == 1) {
                    this.method876(2048, var9, var8, -24);
                    this.method876(32768, var9 + 1, var8 + 1, -57);
                }
                if (arg0 == 2) {
                    this.method876(8192, var9, var8, 68);
                    this.method876(512, var9 - 1, var8 + 1, 89);
                }
                if (arg0 == 3) {
                    this.method876(32768, var9, var8, -25);
                    this.method876(2048, var9 - 1, var8 + -1, 116);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method876(66560, var9, var8, 99);
                    this.method876(4096, var9, var8 - 1, 65);
                    this.method876(16384, var9 + 1, var8, 85);
                }
                if (arg0 == 1) {
                    this.method876(5120, var9, var8, -125);
                    this.method876(16384, var9 + 1, var8, 76);
                    this.method876(65536, var9, var8 + 1, 57);
                }
                if (arg0 == 2) {
                    this.method876(20480, var9, var8, 69);
                    this.method876(65536, var9, var8 + 1, -80);
                    this.method876(1024, var9 - 1, var8, 65);
                }
                if (arg0 == 3) {
                    this.method876(81920, var9, var8, -79);
                    this.method876(1024, var9 - 1, var8, 120);
                    this.method876(4096, var9, var8 - 1, 127);
                }
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method876(536870912, var9, var8, 84);
                    this.method876(33554432, var9, var8 - 1, 113);
                }
                if (arg0 == 1) {
                    this.method876(8388608, var9, var8, -120);
                    this.method876(134217728, var9 + 1, var8, 127);
                }
                if (arg0 == 2) {
                    this.method876(33554432, var9, var8, -21);
                    this.method876(536870912, var9, var8 + 1, -57);
                }
                if (arg0 == 3) {
                    this.method876(134217728, var9, var8, -34);
                    this.method876(8388608, var9 - 1, var8, -96);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method876(4194304, var9, var8, 73);
                    this.method876(67108864, var9 + 1, var8 - 1, 116);
                }
                if (arg0 == 1) {
                    this.method876(16777216, var9, var8, -69);
                    this.method876(268435456, var9 + 1, var8 + 1, -47);
                }
                if (arg0 == 2) {
                    this.method876(67108864, var9, var8, -128);
                    this.method876(4194304, var9 - 1, var8 + 1, 66);
                }
                if (arg0 == 3) {
                    this.method876(268435456, var9, var8, -68);
                    this.method876(16777216, var9 - 1, var8 + -1, 68);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method876(545259520, var9, var8, 123);
                    this.method876(33554432, var9, var8 - 1, 78);
                    this.method876(134217728, var9 + 1, var8, 98);
                }
                if (arg0 == 1) {
                    this.method876(41943040, var9, var8, -65);
                    this.method876(134217728, var9 + 1, var8, -79);
                    this.method876(536870912, var9, var8 + 1, 104);
                }
                if (arg0 == 2) {
                    this.method876(167772160, var9, var8, -75);
                    this.method876(536870912, var9, var8 + 1, 122);
                    this.method876(8388608, var9 - 1, var8, 121);
                }
                if (arg0 == 3) {
                    this.method876(671088640, var9, var8, 108);
                    this.method876(8388608, var9 - 1, var8, 89);
                    this.method876(33554432, var9, var8 - 1, 70);
                }
            }
        }
        if (arg6) {
            this.field2021 = -5;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 67108864) {
            this.method873(60, 87, 108, true, -1, 38, true);
        }
        field2010++;
        int var11 = arg4 + arg9;
        int var12 = arg1 + arg5;
        int var13 = arg8 + arg2;
        int var14 = arg3 + arg6;
        if (arg9 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg1 <= arg3 ? arg3 : arg1;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field2008[var13 - this.field2021 - 1][var15 - this.field2009] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg8 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg1 <= arg3 ? arg3 : arg1;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field2008[arg8 - this.field2021][var17 - this.field2009] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg1 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg9 > arg8 ? arg9 : arg8;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field2008[var19 - this.field2021][var14 - this.field2009 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg3 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg8 >= arg9 ? arg8 : arg9;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field2008[var21 - this.field2021][arg3 - this.field2009] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
    public final void method869(int arg0, int arg1, int arg2) {
        if (arg1 == -23070) {
            int var4 = arg2 - this.field2009;
            int var5 = arg0 - this.field2021;
            field2012++;
            this.field2008[var5][var4] = class286.method1847(this.field2008[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
    public final void method870(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2021;
        field2024++;
        int var5 = arg0 - this.field2009;
        if (arg1 <= -115) {
            this.field2008[var4][var5] = class18.method119(this.field2008[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZBIIZII)V")
    public final void method871(boolean arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field2019++;
        int var8 = arg5 - this.field2021;
        int var9 = arg2 - this.field2009;
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method865((byte) -125, 128, var8, var9);
                this.method865((byte) -114, 8, var8 - 1, var9);
            }
            if (arg6 == 1) {
                this.method865((byte) -109, 2, var8, var9);
                this.method865((byte) -95, 32, var8, var9 + 1);
            }
            if (arg6 == 2) {
                this.method865((byte) -103, 8, var8, var9);
                this.method865((byte) -126, 128, var8 + 1, var9);
            }
            if (arg6 == 3) {
                this.method865((byte) -126, 32, var8, var9);
                this.method865((byte) -120, 2, var8, var9 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method865((byte) -125, 1, var8, var9);
                this.method865((byte) -116, 16, var8 - 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method865((byte) -105, 4, var8, var9);
                this.method865((byte) -119, 64, var8 + 1, var9 - -1);
            }
            if (arg6 == 2) {
                this.method865((byte) -124, 16, var8, var9);
                this.method865((byte) -113, 1, var8 + 1, var9 + -1);
            }
            if (arg6 == 3) {
                this.method865((byte) -104, 64, var8, var9);
                this.method865((byte) -103, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg6 == 0) {
                this.method865((byte) -101, 130, var8, var9);
                this.method865((byte) -112, 8, var8 - 1, var9);
                this.method865((byte) -100, 32, var8, var9 + 1);
            }
            if (arg6 == 1) {
                this.method865((byte) -92, 10, var8, var9);
                this.method865((byte) -120, 32, var8, var9 + 1);
                this.method865((byte) -110, 128, var8 + 1, var9);
            }
            if (arg6 == 2) {
                this.method865((byte) -100, 40, var8, var9);
                this.method865((byte) -95, 128, var8 + 1, var9);
                this.method865((byte) -127, 2, var8, var9 - 1);
            }
            if (arg6 == 3) {
                this.method865((byte) -103, 160, var8, var9);
                this.method865((byte) -128, 2, var8, var9 - 1);
                this.method865((byte) -122, 8, var8 - 1, var9);
            }
        }
        if (arg4) {
            if (arg3 == 0) {
                if (arg6 == 0) {
                    this.method865((byte) -97, 65536, var8, var9);
                    this.method865((byte) -100, 4096, var8 - 1, var9);
                }
                if (arg6 == 1) {
                    this.method865((byte) -105, 1024, var8, var9);
                    this.method865((byte) -124, 16384, var8, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method865((byte) -113, 4096, var8, var9);
                    this.method865((byte) -92, 65536, var8 + 1, var9);
                }
                if (arg6 == 3) {
                    this.method865((byte) -100, 16384, var8, var9);
                    this.method865((byte) -106, 1024, var8, var9 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg6 == 0) {
                    this.method865((byte) -122, 512, var8, var9);
                    this.method865((byte) -121, 8192, var8 - 1, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method865((byte) -113, 2048, var8, var9);
                    this.method865((byte) -118, 32768, var8 + 1, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method865((byte) -92, 8192, var8, var9);
                    this.method865((byte) -123, 512, var8 + 1, var9 + -1);
                }
                if (arg6 == 3) {
                    this.method865((byte) -127, 32768, var8, var9);
                    this.method865((byte) -116, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    this.method865((byte) -111, 66560, var8, var9);
                    this.method865((byte) -126, 4096, var8 - 1, var9);
                    this.method865((byte) -122, 16384, var8, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method865((byte) -122, 5120, var8, var9);
                    this.method865((byte) -113, 16384, var8, var9 + 1);
                    this.method865((byte) -124, 65536, var8 + 1, var9);
                }
                if (arg6 == 2) {
                    this.method865((byte) -108, 20480, var8, var9);
                    this.method865((byte) -99, 65536, var8 + 1, var9);
                    this.method865((byte) -127, 1024, var8, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method865((byte) -122, 81920, var8, var9);
                    this.method865((byte) -118, 1024, var8, var9 - 1);
                    this.method865((byte) -99, 4096, var8 - 1, var9);
                }
            }
        }
        if (arg0) {
            if (arg3 == 0) {
                if (arg6 == 0) {
                    this.method865((byte) -98, 536870912, var8, var9);
                    this.method865((byte) -95, 33554432, var8 - 1, var9);
                }
                if (arg6 == 1) {
                    this.method865((byte) -118, 8388608, var8, var9);
                    this.method865((byte) -94, 134217728, var8, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method865((byte) -115, 33554432, var8, var9);
                    this.method865((byte) -92, 536870912, var8 + 1, var9);
                }
                if (arg6 == 3) {
                    this.method865((byte) -100, 134217728, var8, var9);
                    this.method865((byte) -116, 8388608, var8, var9 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg6 == 0) {
                    this.method865((byte) -115, 4194304, var8, var9);
                    this.method865((byte) -121, 67108864, var8 - 1, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method865((byte) -124, 16777216, var8, var9);
                    this.method865((byte) -115, 268435456, var8 + 1, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method865((byte) -107, 67108864, var8, var9);
                    this.method865((byte) -106, 4194304, var8 + 1, var9 + -1);
                }
                if (arg6 == 3) {
                    this.method865((byte) -109, 268435456, var8, var9);
                    this.method865((byte) -101, 16777216, var8 - 1, var9 + -1);
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    this.method865((byte) -120, 545259520, var8, var9);
                    this.method865((byte) -127, 33554432, var8 - 1, var9);
                    this.method865((byte) -108, 134217728, var8, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method865((byte) -96, 41943040, var8, var9);
                    this.method865((byte) -111, 134217728, var8, var9 + 1);
                    this.method865((byte) -123, 536870912, var8 + 1, var9);
                }
                if (arg6 == 2) {
                    this.method865((byte) -97, 167772160, var8, var9);
                    this.method865((byte) -127, 536870912, var8 + 1, var9);
                    this.method865((byte) -93, 8388608, var8, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method865((byte) -98, 671088640, var8, var9);
                    this.method865((byte) -127, 8388608, var8, var9 - 1);
                    this.method865((byte) -121, 33554432, var8 - 1, var9);
                }
            }
        }
        int var10 = 18 / ((-arg1 - 24) / 61);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIBIIIZ)V")
    public final void method872(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field2023++;
        if (arg3 >= -115) {
            this.field2014 = 59;
        }
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg1;
            arg1 = arg5;
            arg5 = var10;
        }
        int var11 = arg4 - this.field2009;
        if (arg0) {
            var9 |= 0x40000000;
        }
        int var12 = arg6 - this.field2021;
        for (int var13 = var12; var13 < (arg1 + var12); var13++) {
            if (var13 >= 0 && this.field2005 > var13) {
                for (int var14 = var11; var14 < (var11 + arg5); var14++) {
                    if (var14 >= 0 && var14 < this.field2014) {
                        this.method876(var9, var14, var13, 127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIZIIZ)V")
    public final void method873(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field2017++;
        int var8 = arg1;
        if (arg6) {
            var8 = arg1 | 0x20000;
        }
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var9 = arg5 - this.field2009;
        int var10 = arg4 - this.field2021;
        for (int var11 = var10; var11 < arg2 + var10; var11++) {
            if (var11 >= 0 && var11 < this.field2005) {
                for (int var12 = var9; var12 < var9 + arg0; var12++) {
                    if (var12 >= 0 && var12 < this.field2014) {
                        this.method865((byte) -96, var8, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2004++;
        int var9 = 96 % ((arg3 - 82) / 33);
        if (arg0 == 1) {
            if (arg2 == arg5 && arg1 == arg6) {
                return true;
            }
        } else if (arg5 <= arg2 && arg0 + arg5 - 1 >= arg2 && arg6 <= arg6 && arg6 <= arg0 + arg6 - 1) {
            return true;
        }
        int var10 = arg1 - this.field2009;
        int var11 = arg2 - this.field2021;
        int var12 = arg6 - this.field2009;
        int var13 = arg5 - this.field2021;
        if (arg0 == 1) {
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var11 + 1 == var13 && var10 == var12 && (this.field2008[var13][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var12 - 1) == var10 && (this.field2008[var13][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - 1 == var13 && var10 == var12 && (this.field2008[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var12 - 1) == var10 && (this.field2008[var13][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var11 - 1 == var13 && var10 == var12 && (this.field2008[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var12 + 1) == var10 && (this.field2008[var13][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 + 1 == var13 && var10 == var12 && (this.field2008[var13][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var13 && (var12 + 1) == var10 && (this.field2008[var13][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 == var13 && var12 + 1 == var10 && (this.field2008[var13][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var13 && (var12 - 1) == var10 && (this.field2008[var13][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var13 && var10 == var12 && (this.field2008[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var13 && var10 == var12 && (this.field2008[var13][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var13 + arg0 - 1;
            int var15 = arg0 + var10 - 1;
            if (arg4 == 6 || arg4 == 7) {
                if (arg4 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var11 + 1) == var13 && var12 >= var10 && var15 >= var12 && (this.field2008[var13][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var13 <= var11 && var14 >= var11 && (var12 - arg0) == var10 && (this.field2008[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var11 - arg0 == var13 && var10 <= var12 && var12 <= var15 && (this.field2008[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var13 && var11 <= var14 && (var12 - arg0) == var10 && (this.field2008[var11][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var11 - arg0) == var13 && var10 <= var12 && var12 <= var15 && (this.field2008[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var13 <= var11 && var14 >= var11 && (var12 + 1) == var10 && (this.field2008[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var11 + 1 == var13 && var12 >= var10 && var15 >= var12 && (this.field2008[var13][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var13 && var14 >= var11 && var12 + 1 == var10 && (this.field2008[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 8) {
                if (var11 >= var13 && var14 >= var11 && (var12 + 1) == var10 && (this.field2008[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var13 <= var11 && var14 >= var11 && (var12 - arg0) == var10 && (this.field2008[var11][var15] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg0 == var13 && var12 >= var10 && var15 >= var12 && (this.field2008[var14][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var13 && var10 <= var12 && var12 <= var15 && (this.field2008[var13][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZ)V")
    public final void method875(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field2009;
        int var5 = arg1 - this.field2021;
        field2011++;
        if (arg2) {
            this.method867(-56, true, 21, 32, false, 7, false);
        }
        this.field2008[var5][var4] = class286.method1847(this.field2008[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
    private final void method876(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 112 / ((16 - arg3) / 37);
        this.field2008[arg2][arg1] = class286.method1847(this.field2008[arg2][arg1], ~arg0);
        field2016++;
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(III)V")
    public final void method877(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            method864(100);
        }
        int var4 = arg2 - this.field2021;
        field2018++;
        int var5 = arg0 - this.field2009;
        this.field2008[var4][var5] = class18.method119(this.field2008[var4][var5], 262144);
    }
}
