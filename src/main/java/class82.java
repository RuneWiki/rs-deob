import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class82 {

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "Lqu;")
    public static class364 field932 = new class364(46, 15);

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!gea", name = "e", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!gea", name = "f", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!gea", name = "i", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!gea", name = "j", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!gea", name = "k", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!gea", name = "o", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!gea", name = "p", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!gea", name = "t", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!gea", name = "w", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!gea", name = "y", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!gea", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field944;

    @OriginalMember(owner = "client!gea", name = "q", descriptor = "[[I")
    public int[][] field948;

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(III)V", line = 4)
    public final void method466(int arg0, int arg1, int arg2) {
        if (arg1 < 114) {
            this.field933 = 15;
        }
        field950++;
        int var4 = arg2 - this.field943;
        int var5 = arg0 - this.field957;
        this.field948[var4][var5] = class637.method3693(this.field948[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZIIZIB)V", line = 17)
    public final void method467(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        int var8 = arg0 - this.field957;
        int var9 = arg3 - this.field943;
        int var10 = -125 % ((37 - arg6) / 34);
        field946++;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method483((byte) 115, var8, var9, 128);
                this.method483((byte) 87, var8, var9 - 1, 8);
            }
            if (arg5 == 1) {
                this.method483((byte) 103, var8, var9, 2);
                this.method483((byte) -32, var8 + 1, var9, 32);
            }
            if (arg5 == 2) {
                this.method483((byte) -122, var8, var9, 8);
                this.method483((byte) -16, var8, var9 + 1, 128);
            }
            if (arg5 == 3) {
                this.method483((byte) -49, var8, var9, 32);
                this.method483((byte) -87, var8 - 1, var9, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method483((byte) -67, var8, var9, 1);
                this.method483((byte) -98, var8 + 1, var9 + -1, 16);
            }
            if (arg5 == 1) {
                this.method483((byte) 97, var8, var9, 4);
                this.method483((byte) 108, var8 + 1, var9 - -1, 64);
            }
            if (arg5 == 2) {
                this.method483((byte) -122, var8, var9, 16);
                this.method483((byte) 71, var8 - 1, var9 + 1, 1);
            }
            if (arg5 == 3) {
                this.method483((byte) 89, var8, var9, 64);
                this.method483((byte) 119, var8 - 1, var9 + -1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method483((byte) -120, var8, var9, 130);
                this.method483((byte) 110, var8, var9 - 1, 8);
                this.method483((byte) -22, var8 + 1, var9, 32);
            }
            if (arg5 == 1) {
                this.method483((byte) 84, var8, var9, 10);
                this.method483((byte) 97, var8 + 1, var9, 32);
                this.method483((byte) 85, var8, var9 + 1, 128);
            }
            if (arg5 == 2) {
                this.method483((byte) 92, var8, var9, 40);
                this.method483((byte) -34, var8, var9 + 1, 128);
                this.method483((byte) 106, var8 - 1, var9, 2);
            }
            if (arg5 == 3) {
                this.method483((byte) -87, var8, var9, 160);
                this.method483((byte) 85, var8 - 1, var9, 2);
                this.method483((byte) 122, var8, var9 - 1, 8);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method483((byte) -83, var8, var9, 65536);
                    this.method483((byte) 110, var8, var9 - 1, 4096);
                }
                if (arg5 == 1) {
                    this.method483((byte) 84, var8, var9, 1024);
                    this.method483((byte) 127, var8 + 1, var9, 16384);
                }
                if (arg5 == 2) {
                    this.method483((byte) 106, var8, var9, 4096);
                    this.method483((byte) 77, var8, var9 + 1, 65536);
                }
                if (arg5 == 3) {
                    this.method483((byte) -104, var8, var9, 16384);
                    this.method483((byte) 112, var8 - 1, var9, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method483((byte) -40, var8, var9, 512);
                    this.method483((byte) -19, var8 + 1, var9 + -1, 8192);
                }
                if (arg5 == 1) {
                    this.method483((byte) 70, var8, var9, 2048);
                    this.method483((byte) 70, var8 + 1, var9 - -1, 32768);
                }
                if (arg5 == 2) {
                    this.method483((byte) 62, var8, var9, 8192);
                    this.method483((byte) -23, var8 - 1, var9 + 1, 512);
                }
                if (arg5 == 3) {
                    this.method483((byte) -80, var8, var9, 32768);
                    this.method483((byte) 117, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method483((byte) 86, var8, var9, 66560);
                    this.method483((byte) 100, var8, var9 - 1, 4096);
                    this.method483((byte) 98, var8 + 1, var9, 16384);
                }
                if (arg5 == 1) {
                    this.method483((byte) 91, var8, var9, 5120);
                    this.method483((byte) 84, var8 + 1, var9, 16384);
                    this.method483((byte) 88, var8, var9 + 1, 65536);
                }
                if (arg5 == 2) {
                    this.method483((byte) -122, var8, var9, 20480);
                    this.method483((byte) -75, var8, var9 + 1, 65536);
                    this.method483((byte) -123, var8 - 1, var9, 1024);
                }
                if (arg5 == 3) {
                    this.method483((byte) 107, var8, var9, 81920);
                    this.method483((byte) 76, var8 - 1, var9, 1024);
                    this.method483((byte) 78, var8, var9 - 1, 4096);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method483((byte) 89, var8, var9, 536870912);
                this.method483((byte) -86, var8, var9 - 1, 33554432);
            }
            if (arg5 == 1) {
                this.method483((byte) 115, var8, var9, 8388608);
                this.method483((byte) -97, var8 + 1, var9, 134217728);
            }
            if (arg5 == 2) {
                this.method483((byte) 87, var8, var9, 33554432);
                this.method483((byte) 111, var8, var9 + 1, 536870912);
            }
            if (arg5 == 3) {
                this.method483((byte) 103, var8, var9, 134217728);
                this.method483((byte) -29, var8 - 1, var9, 8388608);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method483((byte) -58, var8, var9, 4194304);
                this.method483((byte) 97, var8 + 1, var9 + -1, 67108864);
            }
            if (arg5 == 1) {
                this.method483((byte) -128, var8, var9, 16777216);
                this.method483((byte) -101, var8 + 1, var9 + 1, 268435456);
            }
            if (arg5 == 2) {
                this.method483((byte) -14, var8, var9, 67108864);
                this.method483((byte) -42, var8 - 1, var9 + 1, 4194304);
            }
            if (arg5 == 3) {
                this.method483((byte) -13, var8, var9, 268435456);
                this.method483((byte) -45, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method483((byte) -70, var8, var9, 545259520);
            this.method483((byte) -39, var8, var9 - 1, 33554432);
            this.method483((byte) 83, var8 + 1, var9, 134217728);
        }
        if (arg5 == 1) {
            this.method483((byte) 91, var8, var9, 41943040);
            this.method483((byte) -97, var8 + 1, var9, 134217728);
            this.method483((byte) 79, var8, var9 + 1, 536870912);
        }
        if (arg5 == 2) {
            this.method483((byte) 116, var8, var9, 167772160);
            this.method483((byte) 107, var8, var9 + 1, 536870912);
            this.method483((byte) 119, var8 - 1, var9, 8388608);
        }
        if (arg5 == 3) {
            this.method483((byte) -126, var8, var9, 671088640);
            this.method483((byte) -86, var8 - 1, var9, 8388608);
            this.method483((byte) 80, var8, var9 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIBI)Z", line = 323)
    public final boolean method468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field942++;
        if (arg4 == 1) {
            if (arg2 == arg3 && arg0 == arg5) {
                return true;
            }
        } else if (arg3 <= arg2 && arg4 + arg3 - 1 >= arg2 && arg5 >= arg5 && arg5 <= arg5 + arg4 - 1) {
            return true;
        }
        int var9 = arg3 - this.field943;
        int var10 = -72 / ((arg6 - 7) / 44);
        int var11 = arg5 - this.field957;
        int var12 = arg2 - this.field943;
        int var13 = arg0 - this.field957;
        if (arg4 == 1) {
            if (arg7 == 0) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var9 && var11 == var13) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var13 && (this.field948[var9][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var13 && (this.field948[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var12 && var11 + 1 == var13) {
                        return true;
                    }
                    if (var12 - 1 == var9 && var11 == var13 && (this.field948[var9][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 == var13 && (this.field948[var9][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 + 1 == var9 && var11 == var13) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var13 && (this.field948[var9][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var13 && (this.field948[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var12 && var11 - 1 == var13) {
                        return true;
                    }
                    if ((var12 - 1) == var9 && var11 == var13 && (this.field948[var9][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 == var13 && (this.field948[var9][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var9 && var11 == var13) {
                        return true;
                    }
                    if (var9 == var12 && (var11 + 1) == var13) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var11 == var13 && (this.field948[var9][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var13 && (this.field948[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - 1 == var9 && var11 == var13 && (this.field948[var9][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var13) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 == var13) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var13 && (this.field948[var9][var13] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - 1) == var9 && var11 == var13 && (this.field948[var9][var13] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var13 && (this.field948[var9][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 == var13) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var13) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 - 1) == var9 && var11 == var13) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var13 && (this.field948[var9][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 == var13 && (this.field948[var9][var13] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var13) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 == var12 && var11 + 1 == var13 && (this.field948[var9][var13] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && (var11 - 1) == var13 && (this.field948[var9][var13] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var11 == var13 && (this.field948[var9][var13] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 == var13 && (this.field948[var9][var13] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var9 + arg4 - 1;
            int var15 = var13 + arg4 - 1;
            if (arg7 == 0) {
                if (arg1 == 0) {
                    if ((var12 - arg4) == var9 && var11 >= var13 && var15 >= var11) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && var11 + 1 == var13 && (this.field948[var12][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && (var11 - arg4) == var13 && (this.field948[var12][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 >= var9 && var14 >= var12 && var11 + 1 == var13) {
                        return true;
                    }
                    if ((var12 - arg4) == var9 && var11 >= var13 && var11 <= var15 && (this.field948[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var13 <= var11 && var11 <= var15 && (this.field948[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 + 1) == var9 && var11 >= var13 && var11 <= var15) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && var11 + 1 == var13 && (this.field948[var12][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && (var11 - arg4) == var13 && (this.field948[var12][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 >= var9 && var12 <= var14 && (var11 - arg4) == var13) {
                        return true;
                    }
                    if (var12 - arg4 == var9 && var11 >= var13 && var15 >= var11 && (this.field948[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var9 && var13 <= var11 && var11 <= var15 && (this.field948[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg1 == 0) {
                    if (var12 - arg4 == var9 && var11 >= var13 && var15 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && (var11 + 1) == var13) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 >= var13 && var15 >= var11 && (this.field948[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var14 && var11 - arg4 == var13 && (this.field948[var12][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - arg4 == var9 && var11 >= var13 && var11 <= var15 && (this.field948[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var14 >= var12 && (var11 + 1) == var13) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var13 <= var11 && var11 <= var15) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var14 && var11 - arg4 == var13 && (this.field948[var12][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - arg4) == var9 && var13 <= var11 && var11 <= var15 && (this.field948[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && var11 + 1 == var13 && (this.field948[var12][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 >= var13 && var15 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && var11 - arg4 == var13) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 - arg4 == var9 && var11 >= var13 && var15 >= var11) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && (var11 + 1) == var13 && (this.field948[var12][var13] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var9 && var11 >= var13 && var11 <= var15 && (this.field948[var9][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var14 >= var12 && (var11 - arg4) == var13) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var9 <= var12 && var12 <= var14 && (var11 + 1) == var13 && (this.field948[var12][var13] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 <= var12 && var14 >= var12 && var11 - arg4 == var13 && (this.field948[var12][var15] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var12 - arg4) == var9 && var13 <= var11 && var15 >= var11 && (this.field948[var14][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 >= var13 && var11 <= var15 && (this.field948[var9][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Ldda;I)I", line = 687)
    public static final int method469(class597 arg0, int arg1) {
        if (arg1 < 83) {
            return -64;
        }
        field955++;
        int var2 = 0;
        if (arg0.method3491(119, class59.field704)) {
            var2++;
        }
        if (arg0.method3491(104, class374.field5506)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB)V", line = 708)
    public final void method470(int arg0, int arg1, byte arg2) {
        if (arg2 != 93) {
            field932 = null;
        }
        int var4 = arg0 - this.field943;
        field935++;
        int var5 = arg1 - this.field957;
        this.field948[var4][var5] = class637.method3693(this.field948[var4][var5], -2097153);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIILgea;III)Z", line = 721)
    public static final boolean method471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class82 arg7, int arg8, int arg9, int arg10) {
        field945++;
        int var11 = arg9;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        int var16 = arg0 - var14;
        class341.field4995[var13][var14] = 99;
        class223.field3289[var13][var14] = arg6;
        byte var17 = 0;
        class412.field5867[var17] = arg9;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class640.field9301[var10001] = arg0;
        int[][] var19 = arg7.field948;
        while (var26 != var18) {
            var12 = class640.field9301[var18];
            var11 = class412.field5867[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg7.field943;
            int var23 = var12 - arg7.field957;
            if (arg10 == -4) {
                if (arg2 == var11 && arg8 == var12) {
                    class32.field322 = var12;
                    class297.field4347 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class516.method3068(2, arg3, var12, -32360, arg2, arg8, var11, 2, arg5)) {
                    class297.field4347 = var11;
                    class32.field322 = var12;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg7.method473(arg2, 2, var11, arg5, 2, -44, arg4, var12, arg3, arg8)) {
                    class32.field322 = var12;
                    class297.field4347 = var11;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg7.method480(2, arg5, var12, arg2, false, var11, arg4, arg3, arg8)) {
                    class32.field322 = var12;
                    class297.field4347 = var11;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg7.method468(var12, arg1, arg2, var11, 2, arg8, (byte) 77, arg10)) {
                    class297.field4347 = var11;
                    class32.field322 = var12;
                    return true;
                }
            } else if (arg7.method482(arg10, arg2, arg1, var11, -1, arg8, 2, var12)) {
                class32.field322 = var12;
                class297.field4347 = var11;
                return true;
            }
            int var25 = class223.field3289[var21][var20] + 1;
            if (var21 > 0 && class341.field4995[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class412.field5867[var26] = var11 - 1;
                class640.field9301[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class341.field4995[var21 - 1][var20] = 2;
                class223.field3289[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class341.field4995[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class412.field5867[var26] = var11 + 1;
                class640.field9301[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class341.field4995[var21 + 1][var20] = 8;
                class223.field3289[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class341.field4995[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class412.field5867[var26] = var11;
                class640.field9301[var26] = var12 - 1;
                class341.field4995[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class223.field3289[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class341.field4995[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class412.field5867[var26] = var11;
                class640.field9301[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class341.field4995[var21][var20 + 1] = 4;
                class223.field3289[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class341.field4995[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class412.field5867[var26] = var11 - 1;
                class640.field9301[var26] = var12 - 1;
                class341.field4995[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class223.field3289[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class341.field4995[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class412.field5867[var26] = var11 + 1;
                class640.field9301[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class341.field4995[var21 + 1][var20 - 1] = 9;
                class223.field3289[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class341.field4995[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class412.field5867[var26] = var11 - 1;
                class640.field9301[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class341.field4995[var21 - 1][var20 + 1] = 6;
                class223.field3289[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class341.field4995[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class412.field5867[var26] = var11 + 1;
                class640.field9301[var26] = var12 + 1;
                class341.field4995[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class223.field3289[var21 + 1][var20 + 1] = var25;
            }
        }
        class32.field322 = var12;
        class297.field4347 = var11;
        return false;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BII)Z", line = 1073)
    public static final boolean method472(byte arg0, int arg1, int arg2) {
        field941++;
        if (arg0 != -32) {
            field944 = null;
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1093)
    public final boolean method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field947++;
        int var11 = arg1 + arg2;
        int var12 = arg4 + arg7;
        int var13 = -9 / ((-arg5 - 2) / 34);
        int var14 = arg0 + arg3;
        int var15 = arg8 + arg9;
        if (arg2 == var14 && (arg6 & 0x2) == 0) {
            int var16 = arg7 > arg9 ? arg7 : arg9;
            int var17 = var15 <= var12 ? var15 : var12;
            while (var17 > var16) {
                if ((this.field948[var14 - this.field943 - 1][var16 - this.field957] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg0 == var11 && (arg6 & 0x8) == 0) {
            int var18 = arg9 < arg7 ? arg7 : arg9;
            int var19 = var15 > var12 ? var12 : var15;
            while (var18 < var19) {
                if ((this.field948[arg0 - this.field943][var18 - this.field957] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg7 == var15 && (arg6 & 0x1) == 0) {
            int var20 = arg0 < arg2 ? arg2 : arg0;
            int var21 = var11 < var14 ? var11 : var14;
            while (var20 < var21) {
                if ((this.field948[var20 - this.field943][var15 - this.field957 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg9 == var12 && (arg6 & 0x4) == 0) {
            int var22 = arg2 <= arg0 ? arg0 : arg2;
            int var23 = var11 < var14 ? var11 : var14;
            while (var23 > var22) {
                if ((this.field948[var22 - this.field943][arg9 - this.field957] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(IIB)Z", line = 1185)
    public static final boolean method474(int arg0, int arg1, byte arg2) {
        if (arg2 < 98) {
            field932 = null;
        }
        field956++;
        if (method472((byte) -32, arg0, arg1)) {
            return class542.method3185(arg1, -18225, arg0) | (arg0 & 0x9000) != 0 | class611.method3560(arg1, arg0, 522) ? true : (class174.method1126(arg1, 544, arg0) | (arg0 & 0x2000) != 0 | class241.method1545(arg1, 65536, arg0)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIZZ)V", line = 1211)
    public final void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field940++;
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        if (arg7) {
            var9 |= 0x40000000;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg5;
            arg5 = arg4;
            arg4 = var10;
        }
        int var11 = arg2 - this.field957;
        int var12 = arg3 - this.field943;
        if (arg0 != 32405) {
            field944 = null;
        }
        for (int var13 = var12; var13 < arg5 + var12; var13++) {
            if (var13 >= 0 && this.field933 > var13) {
                for (int var14 = var11; var14 < (var11 + arg4); var14++) {
                    if (var14 >= 0 && var14 < this.field949) {
                        this.method483((byte) 89, var14, var13, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIII)V", line = 1272)
    private final void method476(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            method471(114, 47, 86, 79, -93, -37, -38, null, 108, -65, -80);
        }
        field951++;
        this.field948[arg1][arg3] = class313.method1926(this.field948[arg1][arg3], arg0);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZIIIZII)V", line = 1284)
    public final void method477(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field937++;
        int var8 = arg1 - this.field943;
        int var9 = arg2 - this.field957;
        int var10 = 89 % ((arg3 - 26) / 61);
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method476(128, var8, 1, var9);
                this.method476(8, var8 - 1, 1, var9);
            }
            if (arg6 == 1) {
                this.method476(2, var8, 1, var9);
                this.method476(32, var8, 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method476(8, var8, 1, var9);
                this.method476(128, var8 + 1, 1, var9);
            }
            if (arg6 == 3) {
                this.method476(32, var8, 1, var9);
                this.method476(2, var8, 1, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method476(1, var8, 1, var9);
                this.method476(16, var8 - 1, 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method476(4, var8, 1, var9);
                this.method476(64, var8 + 1, 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method476(16, var8, 1, var9);
                this.method476(1, var8 + 1, 1, var9 - 1);
            }
            if (arg6 == 3) {
                this.method476(64, var8, 1, var9);
                this.method476(4, var8 - 1, 1, var9 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                this.method476(130, var8, 1, var9);
                this.method476(8, var8 - 1, 1, var9);
                this.method476(32, var8, 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method476(10, var8, 1, var9);
                this.method476(32, var8, 1, var9 + 1);
                this.method476(128, var8 + 1, 1, var9);
            }
            if (arg6 == 2) {
                this.method476(40, var8, 1, var9);
                this.method476(128, var8 + 1, 1, var9);
                this.method476(2, var8, 1, var9 - 1);
            }
            if (arg6 == 3) {
                this.method476(160, var8, 1, var9);
                this.method476(2, var8, 1, var9 - 1);
                this.method476(8, var8 - 1, 1, var9);
            }
        }
        if (arg4) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    this.method476(65536, var8, 1, var9);
                    this.method476(4096, var8 - 1, 1, var9);
                }
                if (arg6 == 1) {
                    this.method476(1024, var8, 1, var9);
                    this.method476(16384, var8, 1, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method476(4096, var8, 1, var9);
                    this.method476(65536, var8 + 1, 1, var9);
                }
                if (arg6 == 3) {
                    this.method476(16384, var8, 1, var9);
                    this.method476(1024, var8, 1, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg6 == 0) {
                    this.method476(512, var8, 1, var9);
                    this.method476(8192, var8 - 1, 1, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method476(2048, var8, 1, var9);
                    this.method476(32768, var8 + 1, 1, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method476(8192, var8, 1, var9);
                    this.method476(512, var8 + 1, 1, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method476(32768, var8, 1, var9);
                    this.method476(2048, var8 - 1, 1, var9 - 1);
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    this.method476(66560, var8, 1, var9);
                    this.method476(4096, var8 - 1, 1, var9);
                    this.method476(16384, var8, 1, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method476(5120, var8, 1, var9);
                    this.method476(16384, var8, 1, var9 + 1);
                    this.method476(65536, var8 + 1, 1, var9);
                }
                if (arg6 == 2) {
                    this.method476(20480, var8, 1, var9);
                    this.method476(65536, var8 + 1, 1, var9);
                    this.method476(1024, var8, 1, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method476(81920, var8, 1, var9);
                    this.method476(1024, var8, 1, var9 - 1);
                    this.method476(4096, var8 - 1, 1, var9);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method476(536870912, var8, 1, var9);
                this.method476(33554432, var8 - 1, 1, var9);
            }
            if (arg6 == 1) {
                this.method476(8388608, var8, 1, var9);
                this.method476(134217728, var8, 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method476(33554432, var8, 1, var9);
                this.method476(536870912, var8 + 1, 1, var9);
            }
            if (arg6 == 3) {
                this.method476(134217728, var8, 1, var9);
                this.method476(8388608, var8, 1, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method476(4194304, var8, 1, var9);
                this.method476(67108864, var8 - 1, 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method476(16777216, var8, 1, var9);
                this.method476(268435456, var8 + 1, 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method476(67108864, var8, 1, var9);
                this.method476(4194304, var8 + 1, 1, var9 - 1);
            }
            if (arg6 == 3) {
                this.method476(268435456, var8, 1, var9);
                this.method476(16777216, var8 - 1, 1, var9 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method476(545259520, var8, 1, var9);
            this.method476(33554432, var8 - 1, 1, var9);
            this.method476(134217728, var8, 1, var9 + 1);
        }
        if (arg6 == 1) {
            this.method476(41943040, var8, 1, var9);
            this.method476(134217728, var8, 1, var9 + 1);
            this.method476(536870912, var8 + 1, 1, var9);
        }
        if (arg6 == 2) {
            this.method476(167772160, var8, 1, var9);
            this.method476(536870912, var8 + 1, 1, var9);
            this.method476(8388608, var8, 1, var9 - 1);
        }
        if (arg6 == 3) {
            this.method476(671088640, var8, 1, var9);
            this.method476(8388608, var8, 1, var9 - 1);
            this.method476(33554432, var8 - 1, 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(BII)V", line = 1606)
    public final void method478(byte arg0, int arg1, int arg2) {
        int var4 = -29 / ((-arg0 - 55) / 59);
        field954++;
        int var5 = arg1 - this.field943;
        int var6 = arg2 - this.field957;
        this.field948[var5][var6] = class313.method1926(this.field948[var5][var6], 262144);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V", line = 1620)
    public static void method479(int arg0) {
        field944 = null;
        if (arg0 == 0) {
            field932 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIZIIII)Z", line = 1631)
    public final boolean method480(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field939++;
        if (arg0 > 1) {
            return class516.method3068(arg0, arg7, arg2, -32360, arg3, arg8, arg5, arg0, arg1) ? true : this.method473(arg3, arg0, arg5, arg1, arg0, 104, arg6, arg2, arg7, arg8);
        }
        int var10 = arg1 + arg3 - 1;
        int var11 = arg8 + arg7 - 1;
        if (arg3 <= arg5 && var10 >= arg5 && arg2 >= arg8 && var11 >= arg2) {
            return true;
        } else if ((arg3 - 1) == arg5 && arg8 <= arg2 && arg2 <= var11 && (this.field948[arg5 - this.field943][arg2 - this.field957] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else {
            if (arg4) {
                method479(61);
            }
            if (var10 + 1 == arg5 && arg8 <= arg2 && var11 >= arg2 && (this.field948[arg5 - this.field943][arg2 - this.field957] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if ((arg8 - 1) == arg2 && arg3 <= arg5 && var10 >= arg5 && (this.field948[arg5 - this.field943][arg2 - this.field957] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg2 && arg5 >= arg3 && arg5 <= var10 && (this.field948[arg5 - this.field943][arg2 - this.field957] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V", line = 1677)
    public final void method481(int arg0) {
        field953++;
        for (int var2 = 0; var2 < this.field933; var2++) {
            for (int var4 = 0; var4 < this.field949; var4++) {
                if (var2 == 0 || var4 == 0 || (this.field933 - 5) <= var2 || var4 >= this.field949 - 5) {
                    this.field948[var2][var4] = -1;
                } else {
                    this.field948[var2][var4] = 2097152;
                }
            }
        }
        int var3 = 76 % ((-arg0 - 38) / 45);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIII)Z", line = 1708)
    public final boolean method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field952++;
        if (arg6 == 1) {
            if (arg1 == arg3 && arg5 == arg7) {
                return true;
            }
        } else if (arg1 >= arg3 && arg1 <= arg6 + arg3 - 1 && arg5 <= arg5 && (arg5 - (1 - arg6)) >= arg5) {
            return true;
        }
        int var9 = arg7 - this.field957;
        int var10 = arg5 - this.field957;
        int var11 = arg3 - this.field943;
        int var12 = arg1 - this.field943;
        if (arg6 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field948[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field948[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field948[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field948[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field948[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field948[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field948[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field948[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 == var12 && (var10 + 1) == var9 && (this.field948[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field948[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field948[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 == var10 && (this.field948[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var11 - 1;
            int var14 = arg6 + var9 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var12 + 1) == var11 && var10 >= var9 && var10 <= var14 && (this.field948[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var10 - arg6) == var9 && (this.field948[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 - arg6 == var11 && var9 <= var10 && var14 >= var10 && (this.field948[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 - arg6 == var9 && (this.field948[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 - arg6 == var11 && var9 <= var10 && var14 >= var10 && (this.field948[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 + 1 == var9 && (this.field948[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 + 1 == var11 && var9 <= var10 && var10 <= var14 && (this.field948[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var10 + 1) == var9 && (this.field948[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var11 <= var12 && var12 <= var13 && (var10 + 1) == var9 && (this.field948[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var13 >= var12 && (var10 - arg6) == var9 && (this.field948[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg6) == var11 && var10 >= var9 && var10 <= var14 && (this.field948[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var10 >= var9 && var10 <= var14 && (this.field948[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg4 != -1) {
            this.method466(-25, 126, 51);
        }
        return false;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(BIII)V", line = 1890)
    private final void method483(byte arg0, int arg1, int arg2, int arg3) {
        field936++;
        int var5 = 124 / ((24 - arg0) / 35);
        this.field948[arg2][arg1] = class637.method3693(this.field948[arg2][arg1], ~arg3);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZIZIII)V", line = 1901)
    public final void method484(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field934++;
        int var8 = 256;
        if (arg1) {
            var8 |= 0x20000;
        }
        int var9 = arg6 - this.field943;
        if (arg3) {
            var8 |= 0x40000000;
        }
        int var10 = arg5 - this.field957;
        for (int var11 = var9; var11 < (arg0 + var9); var11++) {
            if (var11 >= 0 && var11 < this.field933) {
                for (int var12 = var10; var12 < var10 + arg2; var12++) {
                    if (var12 >= 0 && this.field949 > var12) {
                        this.method476(var8, var11, 1, var12);
                    }
                }
            }
        }
        if (arg4 != -2016) {
            field932 = null;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(III)V", line = 1945)
    public final void method485(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field943;
        int var5 = arg2 - this.field957;
        field938++;
        this.field948[var4][var5] = class313.method1926(this.field948[var4][var5], arg0);
    }
}
