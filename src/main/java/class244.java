import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class244 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    private int field4326 = 0;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    private int field4344;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    private int field4327;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    private int field4334;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "[[I")
    public int[][] field4331;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "[Z")
    public static boolean[] field4341 = new boolean[100];

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Z")
    public static boolean field4338 = false;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Ljg;")
    public static class303 field4351 = new class303();

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "Z")
    public static boolean field4354 = true;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "F")
    public static float field4328;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "Lfk;")
    public static class45 field4353;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIIIIIII)Z", line = 4)
    private final boolean method1757(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4343++;
        if ((arg0 + arg2) <= arg3 || arg0 >= arg3 + arg4) {
            return false;
        } else if (arg5 + arg7 > arg6 && arg6 + arg8 > arg5) {
            if (arg1 != 37) {
                field4354 = false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZIIBI)V", line = 27)
    public final void method1758(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg3 - this.field4327;
        int var8 = arg2 - this.field4326;
        field4349++;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method1770(var8, var7, (byte) 77, 128);
                this.method1770(var8, var7 - 1, (byte) 122, 8);
            }
            if (arg0 == 1) {
                this.method1770(var8, var7, (byte) 63, 2);
                this.method1770(var8 + 1, var7, (byte) 63, 32);
            }
            if (arg0 == 2) {
                this.method1770(var8, var7, (byte) 66, 8);
                this.method1770(var8, var7 + 1, (byte) 67, 128);
            }
            if (arg0 == 3) {
                this.method1770(var8, var7, (byte) 124, 32);
                this.method1770(var8 - 1, var7, (byte) 111, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method1770(var8, var7, (byte) 67, 1);
                this.method1770(var8 + 1, var7 + -1, (byte) 59, 16);
            }
            if (arg0 == 1) {
                this.method1770(var8, var7, (byte) 83, 4);
                this.method1770(var8 + 1, var7 + 1, (byte) 60, 64);
            }
            if (arg0 == 2) {
                this.method1770(var8, var7, (byte) 80, 16);
                this.method1770(var8 - 1, var7 + 1, (byte) 86, 1);
            }
            if (arg0 == 3) {
                this.method1770(var8, var7, (byte) 101, 64);
                this.method1770(var8 - 1, var7 + -1, (byte) 93, 4);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method1770(var8, var7, (byte) 103, 130);
                this.method1770(var8, var7 - 1, (byte) 127, 8);
                this.method1770(var8 + 1, var7, (byte) 111, 32);
            }
            if (arg0 == 1) {
                this.method1770(var8, var7, (byte) 116, 10);
                this.method1770(var8 + 1, var7, (byte) 117, 32);
                this.method1770(var8, var7 + 1, (byte) 87, 128);
            }
            if (arg0 == 2) {
                this.method1770(var8, var7, (byte) 102, 40);
                this.method1770(var8, var7 + 1, (byte) 113, 128);
                this.method1770(var8 - 1, var7, (byte) 95, 2);
            }
            if (arg0 == 3) {
                this.method1770(var8, var7, (byte) 120, 160);
                this.method1770(var8 - 1, var7, (byte) 104, 2);
                this.method1770(var8, var7 - 1, (byte) 90, 8);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg0 == 0) {
                    this.method1770(var8, var7, (byte) 58, 65536);
                    this.method1770(var8, var7 - 1, (byte) 84, 4096);
                }
                if (arg0 == 1) {
                    this.method1770(var8, var7, (byte) 113, 1024);
                    this.method1770(var8 + 1, var7, (byte) 83, 16384);
                }
                if (arg0 == 2) {
                    this.method1770(var8, var7, (byte) 99, 4096);
                    this.method1770(var8, var7 + 1, (byte) 96, 65536);
                }
                if (arg0 == 3) {
                    this.method1770(var8, var7, (byte) 73, 16384);
                    this.method1770(var8 - 1, var7, (byte) 79, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg0 == 0) {
                    this.method1770(var8, var7, (byte) 82, 512);
                    this.method1770(var8 + 1, var7 + -1, (byte) 97, 8192);
                }
                if (arg0 == 1) {
                    this.method1770(var8, var7, (byte) 93, 2048);
                    this.method1770(var8 + 1, var7 - -1, (byte) 121, 32768);
                }
                if (arg0 == 2) {
                    this.method1770(var8, var7, (byte) 116, 8192);
                    this.method1770(var8 - 1, var7 + 1, (byte) 77, 512);
                }
                if (arg0 == 3) {
                    this.method1770(var8, var7, (byte) 85, 32768);
                    this.method1770(var8 - 1, var7 + -1, (byte) 84, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg0 == 0) {
                    this.method1770(var8, var7, (byte) 111, 66560);
                    this.method1770(var8, var7 - 1, (byte) 114, 4096);
                    this.method1770(var8 + 1, var7, (byte) 91, 16384);
                }
                if (arg0 == 1) {
                    this.method1770(var8, var7, (byte) 90, 5120);
                    this.method1770(var8 + 1, var7, (byte) 119, 16384);
                    this.method1770(var8, var7 + 1, (byte) 99, 65536);
                }
                if (arg0 == 2) {
                    this.method1770(var8, var7, (byte) 110, 20480);
                    this.method1770(var8, var7 + 1, (byte) 99, 65536);
                    this.method1770(var8 - 1, var7, (byte) 105, 1024);
                }
                if (arg0 == 3) {
                    this.method1770(var8, var7, (byte) 103, 81920);
                    this.method1770(var8 - 1, var7, (byte) 72, 1024);
                    this.method1770(var8, var7 - 1, (byte) 72, 4096);
                }
            }
        }
        if (arg4 != -77) {
            this.method1767((byte) -112);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V", line = 235)
    private final void method1759(int arg0, int arg1, int arg2, int arg3) {
        this.field4331[arg0][arg2] = class305.method2086(this.field4331[arg0][arg2], ~arg3);
        int var5 = 38 % ((-arg1 - 2) / 58);
        field4336++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)Z", line = 248)
    public final boolean method1760(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4346++;
        if (arg2 == arg3 && arg1 == arg4) {
            return true;
        }
        int var6 = arg3 - this.field4327;
        int var7 = arg1 - this.field4326;
        if (var6 < 0 || this.field4344 <= var6 || var7 < 0 || var7 >= this.field4334) {
            return false;
        }
        int var8 = arg2 - this.field4327;
        int var9;
        if (var6 > var8) {
            var9 = var6 - var8;
        } else {
            var9 = var8 - var6;
        }
        int var10 = arg4 - this.field4326;
        int var11;
        if (var10 < var7) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        if (arg0 != 0) {
            return true;
        }
        if (var9 > var11) {
            int var12 = var11 * 65536 / var9;
            int var13 = 32768;
            while (var6 != var8) {
                if (var8 < var6) {
                    if ((this.field4331[var8][var10] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field4331[var8][var10] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var10 < var7) {
                        if ((this.field4331[var8][var10] & 0x12C0102) != 0) {
                            return false;
                        }
                        var10++;
                    } else if (var7 < var10) {
                        if ((this.field4331[var8][var10] & 0x12C0120) != 0) {
                            return false;
                        }
                        var10--;
                    }
                }
            }
        } else {
            int var14 = 32768;
            int var15 = var9 * 65536 / var11;
            while (var7 != var10) {
                if (var10 < var7) {
                    if ((this.field4331[var8][var10] & 0x12C0102) != 0) {
                        return false;
                    }
                    var10++;
                } else if (var10 > var7) {
                    if ((this.field4331[var8][var10] & 0x12C0120) != 0) {
                        return false;
                    }
                    var10--;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var6 > var8) {
                        if ((this.field4331[var8][var10] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var6 < var8) {
                        if ((this.field4331[var8][var10] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field4331[var6][var7] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIB)Z", line = 399)
    public final boolean method1761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field4337++;
        if (arg1 == 1) {
            if (arg0 == arg6 && arg4 == arg5) {
                return true;
            }
        } else if (arg6 <= arg0 && arg6 + arg1 - 1 >= arg0 && arg5 <= arg5 && (arg1 + arg5 - 1) >= arg5) {
            return true;
        }
        int var9 = arg0 - this.field4327;
        if (arg7 != 106) {
            field4351 = (class303) null;
        }
        int var10 = arg6 - this.field4327;
        int var11 = arg4 - this.field4326;
        int var12 = arg5 - this.field4326;
        if (arg1 == 1) {
            if (arg3 == 0) {
                if (arg2 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4331[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field4331[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 - 1 == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4331[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field4331[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field4331[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - 1 == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field4331[var10][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - 1) == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4331[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 - 1 == var10 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field4331[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field4331[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && (var12 - 1) == var11 && (this.field4331[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var10 && var11 == var12 && (this.field4331[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg1 - 1;
            int var14 = var11 + arg1 - 1;
            if (arg3 == 0) {
                if (arg2 == 0) {
                    if (var9 - arg1 == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var12 + 1) == var11 && (this.field4331[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 - arg1 == var11 && (this.field4331[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 >= var10 && var9 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 - arg1 == var10 && var11 <= var12 && var12 <= var14 && (this.field4331[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var12 <= var14 && (this.field4331[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 + 1 == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 + 1 == var11 && (this.field4331[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var9 <= var13 && (var12 - arg1) == var11 && (this.field4331[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 <= var9 && var13 >= var9 && (var12 - arg1) == var11) {
                        return true;
                    }
                    if ((var9 - arg1) == var10 && var12 >= var11 && var14 >= var12 && (this.field4331[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var14 >= var12 && (this.field4331[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg2 == 0) {
                    if (var9 - arg1 == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var11 <= var12 && var14 >= var12 && (this.field4331[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 - arg1) == var11 && (this.field4331[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - arg1 == var10 && var12 >= var11 && var14 >= var12 && (this.field4331[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && (var12 - arg1) == var11 && (this.field4331[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var9 - arg1 == var10 && var11 <= var12 && var14 >= var12 && (this.field4331[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 <= var9 && var13 >= var9 && var12 + 1 == var11 && (this.field4331[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var10 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 - arg1 == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 - arg1 == var10 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var10 && var13 >= var9 && (var12 + 1) == var11 && (this.field4331[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field4331[var10][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var10 && var9 <= var13 && var12 - arg1 == var11) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 <= var9 && var9 <= var13 && var12 + 1 == var11 && (this.field4331[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 <= var9 && var9 <= var13 && var12 - arg1 == var11 && (this.field4331[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var9 - arg1) == var10 && var12 >= var11 && var14 >= var12 && (this.field4331[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var12 >= var11 && var14 >= var12 && (this.field4331[var10][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIBI)Z", line = 769)
    public final boolean method1762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field4325++;
        if (arg1 > 1) {
            return this.method1757(arg4, (byte) 37, arg3, arg5, arg1, arg2, arg6, arg0, arg1) ? true : this.method1766(arg4, 108, arg0, arg8, arg6, arg1, arg5, arg2, arg3, arg1);
        }
        if (arg7 >= -62) {
            this.method1773(74, -113, -21, 124, -23, true);
        }
        int var10 = arg4 + arg3 - 1;
        int var11 = arg2 + arg0 - 1;
        if (arg4 <= arg5 && arg5 <= var10 && arg6 >= arg2 && var11 >= arg6) {
            return true;
        } else if ((arg4 - 1) == arg5 && arg6 >= arg2 && arg6 <= var11 && (this.field4331[arg5 - this.field4327][arg6 - this.field4326] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg5 && arg2 <= arg6 && var11 >= arg6 && (this.field4331[arg5 - this.field4327][arg6 - this.field4326] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if ((arg2 - 1) == arg6 && arg4 <= arg5 && arg5 <= var10 && (this.field4331[arg5 - this.field4327][arg6 - this.field4326] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg6 && arg4 <= arg5 && var10 >= arg5 && (this.field4331[arg5 - this.field4327][arg6 - this.field4326] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 811)
    public static void method1763(int arg0) {
        if (arg0 == 6501) {
            field4341 = null;
            field4353 = null;
            field4351 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(JI)V", line = 828)
    public static final void method1764(long arg0, int arg1) {
        field4345++;
        if (arg1 != -6520) {
            method1764(20L, 119);
        }
        if (arg0 != 0L) {
            class84.field1608.method1397(157, 0);
            client.field4458++;
            class84.field1608.method118(arg0, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZIIIII)V", line = 846)
    public final void method1765(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field4326;
        int var9 = arg2 - this.field4327;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg4;
            arg4 = arg0;
            arg0 = var10;
        }
        int var11 = 256;
        if (arg1) {
            var11 += 131072;
        }
        field4347++;
        if (arg6 != 3) {
            this.method1767((byte) -18);
        }
        for (int var12 = var9; var12 < (arg4 + var9); var12++) {
            if (var12 >= 0 && var12 < this.field4344) {
                for (int var13 = var8; var13 < (arg0 + var8); var13++) {
                    if (var13 >= 0 && var13 < this.field4334) {
                        this.method1759(var12, 79, var13, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIIII)Z", line = 898)
    private final boolean method1766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg6 + arg5;
        int var12 = arg4 + arg9;
        field4330++;
        int var13 = arg0 + arg8;
        if (arg1 <= 69) {
            field4341 = (boolean[]) null;
        }
        int var14 = arg2 + arg7;
        if (arg6 >= arg0 && arg6 < var13) {
            if (arg7 == var12 && (arg3 & 0x4) == 0) {
                int var15 = var11 > var13 ? var13 : var11;
                for (int var16 = arg6; var16 < var15; var16++) {
                    if ((this.field4331[var16 - this.field4327][var12 - this.field4326 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var14 && (arg3 & 0x1) == 0) {
                int var17 = arg6;
                int var18 = var13 >= var11 ? var11 : var13;
                while (var17 < var18) {
                    if ((this.field4331[var17 - this.field4327][arg4 - this.field4326] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg0 < var11 && var11 <= var13) {
            if (arg7 == var12 && (arg3 & 0x4) == 0) {
                for (int var19 = arg0; var19 < var11; var19++) {
                    if ((this.field4331[var19 - this.field4327][var12 - this.field4326 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var14 && (arg3 & 0x1) == 0) {
                for (int var20 = arg0; var20 < var11; var20++) {
                    if ((this.field4331[var20 - this.field4327][arg4 - this.field4326] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg7 <= arg4 && var14 > arg4) {
            if (arg0 == var11 && (arg3 & 0x8) == 0) {
                int var21 = var14 >= var12 ? var12 : var14;
                for (int var22 = arg4; var22 < var21; var22++) {
                    if ((this.field4331[var11 - (this.field4327 + 1)][var22 - this.field4326] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var13 && (arg3 & 0x2) == 0) {
                int var23 = arg4;
                int var24 = var14 >= var12 ? var12 : var14;
                while (var24 > var23) {
                    if ((this.field4331[arg6 - this.field4327][var23 - this.field4326] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var12 > arg7 && var14 >= var12) {
            if (arg0 == var11 && (arg3 & 0x8) == 0) {
                for (int var25 = arg7; var25 < var12; var25++) {
                    if ((this.field4331[var11 - this.field4327 - 1][var25 - this.field4326] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var13 && (arg3 & 0x2) == 0) {
                for (int var26 = arg7; var26 < var12; var26++) {
                    if ((this.field4331[arg6 - this.field4327][var26 - this.field4326] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 1060)
    public final void method1767(byte arg0) {
        if (arg0 >= -91) {
            this.field4344 = 102;
        }
        for (int var2 = 0; var2 < this.field4344; var2++) {
            for (int var3 = 0; var3 < this.field4334; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field4344 - 5 || this.field4334 - 5 <= var3) {
                    this.field4331[var2][var3] = 16777215;
                } else {
                    this.field4331[var2][var3] = 16777216;
                }
            }
        }
        field4340++;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIBIII)Z", line = 1092)
    public final boolean method1768(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field4329++;
        if (arg7 == 1) {
            if (arg1 == arg2 && arg0 == arg6) {
                return true;
            }
        } else if (arg1 >= arg2 && arg2 + arg7 - 1 >= arg1 && arg6 >= arg6 && arg6 <= (arg6 + arg7 - 1)) {
            return true;
        }
        int var9 = arg0 - this.field4326;
        int var10 = arg6 - this.field4326;
        int var11 = 116 % ((arg4 + 1) / 44);
        int var12 = arg2 - this.field4327;
        int var13 = arg1 - this.field4327;
        if (arg7 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var13 + 1 == var12 && var9 == var10 && (this.field4331[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 == var13 && var10 - 1 == var9 && (this.field4331[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var13 - 1 == var12 && var9 == var10 && (this.field4331[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 - 1) == var9 && (this.field4331[var12][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var13 - 1 == var12 && var9 == var10 && (this.field4331[var12][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 + 1) == var9 && (this.field4331[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var13 + 1 == var12 && var9 == var10 && (this.field4331[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 == var13 && (var10 + 1) == var9 && (this.field4331[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var12 == var13 && (var10 + 1) == var9 && (this.field4331[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 == var13 && (var10 - 1) == var9 && (this.field4331[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var13 - 1) == var12 && var9 == var10 && (this.field4331[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var13 + 1) == var12 && var9 == var10 && (this.field4331[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = var12 - (1 - arg7);
            int var15 = arg7 + var9 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var13 + 1 == var12 && var10 >= var9 && var15 >= var10 && (this.field4331[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var13 && var14 >= var13 && (var10 - arg7) == var9 && (this.field4331[var13][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var13 - arg7) == var12 && var10 >= var9 && var15 >= var10 && (this.field4331[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var13 && var13 <= var14 && var10 - arg7 == var9 && (this.field4331[var13][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var13 - arg7) == var12 && var9 <= var10 && var15 >= var10 && (this.field4331[var14][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var13 >= var12 && var13 <= var14 && (var10 + 1) == var9 && (this.field4331[var13][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var13 + 1 == var12 && var10 >= var9 && var10 <= var15 && (this.field4331[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var13 >= var12 && var14 >= var13 && (var10 + 1) == var9 && (this.field4331[var13][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var13 >= var12 && var13 <= var14 && var10 + 1 == var9 && (this.field4331[var13][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var13 && var13 <= var14 && (var10 - arg7) == var9 && (this.field4331[var13][var15] & 0x2) == 0) {
                    return true;
                }
                if (var13 - arg7 == var12 && var10 >= var9 && var10 <= var15 && (this.field4331[var14][var10] & 0x8) == 0) {
                    return true;
                }
                if (var13 + 1 == var12 && var10 >= var9 && var15 >= var10 && (this.field4331[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIZII)V", line = 1282)
    public final void method1769(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field4327;
        field4339++;
        int var8 = arg5 - this.field4326;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1759(var7, arg0 ^ 0xFFFFFFBB, var8, 128);
                this.method1759(var7 - 1, arg0 ^ 0x4E, var8, 8);
            }
            if (arg4 == 1) {
                this.method1759(var7, -67, var8, 2);
                this.method1759(var7, -110, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method1759(var7, arg0 ^ 0x48, var8, 8);
                this.method1759(var7 + 1, -66, var8, 128);
            }
            if (arg4 == 3) {
                this.method1759(var7, 118, var8, 32);
                this.method1759(var7, 63, var8 - 1, 2);
            }
        }
        if (arg0 == arg2 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1759(var7, -87, var8, 1);
                this.method1759(var7 - 1, 86, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method1759(var7, -76, var8, 4);
                this.method1759(var7 + 1, -95, var8 + 1, 64);
            }
            if (arg4 == 2) {
                this.method1759(var7, -91, var8, 16);
                this.method1759(var7 + 1, 105, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method1759(var7, 71, var8, 64);
                this.method1759(var7 - 1, -81, var8 + -1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method1759(var7, -90, var8, 130);
                this.method1759(var7 - 1, 86, var8, 8);
                this.method1759(var7, -111, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method1759(var7, -62, var8, 10);
                this.method1759(var7, arg0 ^ 0x66, var8 + 1, 32);
                this.method1759(var7 + 1, 87, var8, 128);
            }
            if (arg4 == 2) {
                this.method1759(var7, 88, var8, 40);
                this.method1759(var7 + 1, 60, var8, 128);
                this.method1759(var7, -78, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method1759(var7, -119, var8, 160);
                this.method1759(var7, -111, var8 - 1, 2);
                this.method1759(var7 - 1, 71, var8, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method1759(var7, 102, var8, 65536);
                this.method1759(var7 - 1, 90, var8, 4096);
            }
            if (arg4 == 1) {
                this.method1759(var7, -104, var8, 1024);
                this.method1759(var7, 96, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method1759(var7, -87, var8, 4096);
                this.method1759(var7 + 1, arg0 ^ 0xFFFFFFA0, var8, 65536);
            }
            if (arg4 == 3) {
                this.method1759(var7, arg0 - 89, var8, 16384);
                this.method1759(var7, -71, var8 - 1, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method1759(var7, 113, var8, 512);
                this.method1759(var7 - 1, 89, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method1759(var7, 106, var8, 2048);
                this.method1759(var7 + 1, arg0 + 77, var8 + 1, 32768);
            }
            if (arg4 == 2) {
                this.method1759(var7, arg0 ^ 0x5D, var8, 8192);
                this.method1759(var7 + 1, arg0 ^ 0xFFFFFFB9, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method1759(var7, -121, var8, 32768);
                this.method1759(var7 - 1, 93, var8 - 1, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1759(var7, -111, var8, 66560);
            this.method1759(var7 - 1, -106, var8, 4096);
            this.method1759(var7, arg0 ^ 0xFFFFFF9A, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method1759(var7, 89, var8, 5120);
            this.method1759(var7, -75, var8 + 1, 16384);
            this.method1759(var7 + 1, 98, var8, 65536);
        }
        if (arg4 == 2) {
            this.method1759(var7, 103, var8, 20480);
            this.method1759(var7 + 1, 64, var8, 65536);
            this.method1759(var7, -76, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method1759(var7, 61, var8, 81920);
            this.method1759(var7, arg0 + 64, var8 - 1, 1024);
            this.method1759(var7 - 1, -94, var8, 4096);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI)V", line = 1485)
    private final void method1770(int arg0, int arg1, byte arg2, int arg3) {
        this.field4331[arg1][arg0] = class97.method665(this.field4331[arg1][arg0], arg3);
        field4348++;
        if (arg2 < 57) {
            this.method1769(-63, -67, 23, true, -101, -6);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)V", line = 1498)
    public final void method1771(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field4326;
        int var5 = arg1 - this.field4327;
        field4342++;
        this.field4331[var5][var4] = class97.method665(this.field4331[var5][var4], 262144);
        if (!arg2) {
            method1764(9L, -83);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lkn;I)V", line = 1514)
    public static final void method1772(class198 arg0, int arg1) {
        field4333++;
        class145 var2 = null;
        try {
            class231 var3 = arg0.method1388(false, "runescape");
            while (var3.field4011 == 0) {
                class235.method1675((byte) -22, 1L);
            }
            if (var3.field4011 == 1) {
                var2 = (class145) var3.field4009;
                class14 var4 = class169.method1146(126);
                var2.method1005(0, -126, var4.field195, var4.field174);
            }
        } catch (Exception var8) {
        }
        if (arg1 < 125) {
            field4354 = true;
        }
        try {
            if (var2 != null) {
                var2.method1009(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIZ)V", line = 1560)
    public final void method1773(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg0 - this.field4327;
        int var8 = arg4 - this.field4326;
        field4350++;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        int var10 = var7;
        if (arg2 != -18750) {
            return;
        }
        while (var10 < (var7 + arg1)) {
            if (var10 >= 0 && this.field4344 > var10) {
                for (int var11 = var8; var11 < arg3 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field4334) {
                        this.method1770(var11, var10, (byte) 81, var9);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V", line = 1602)
    public final void method1774(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field4327;
        int var5 = arg1 - this.field4326;
        this.field4331[var4][var5] = class97.method665(this.field4331[var4][var5], 2097152);
        if (arg0 == 3) {
            field4335++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)V", line = 1627)
    public final void method1775(int arg0, int arg1, int arg2) {
        field4332++;
        if (arg1 != -2251) {
            this.field4326 = -90;
        }
        int var4 = arg2 - this.field4326;
        int var5 = arg0 - this.field4327;
        this.field4331[var5][var4] = class305.method2086(this.field4331[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(II)V", line = 1642)
    public class244(int arg0, int arg1) {
        this.field4344 = arg0;
        this.field4327 = 0;
        this.field4334 = arg1;
        this.field4331 = new int[this.field4344][this.field4334];
        this.method1767((byte) -105);
    }
}
