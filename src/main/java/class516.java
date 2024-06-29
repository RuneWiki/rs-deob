import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class516 {

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field7245 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field7226;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field7227;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public int field7229;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field7232;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field7234;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field7236;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public int field7241;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public int field7242;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public int field7247;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "[[I")
    public int[][] field7243;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)V")
    private final void method2904(int arg0, byte arg1, int arg2, int arg3) {
        this.field7243[arg0][arg2] = class425.method2563(this.field7243[arg0][arg2], ~arg3);
        field7230++;
        if (arg1 > -41) {
            this.method2907((byte) -24);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static final void method2905(int arg0) {
        class250.field3281 = class263.field3412;
        field7238++;
        class262.field3405 = new class203[500];
        class304.field4510 = class263.field3412;
        class619.field8969 = new class203[500];
        class218.field2907 = 0;
        class191.field2591 = new class203[1000];
        class261.field3398 = 0;
        class231.field3064 = 0;
        class264.field3450 = 0;
        class142.field2060 = false;
        class405.field6060 = new class203[2000];
        class154.field2177 = new int[class555.field8157][class91.field1390 + 1][class575.field8372 + 1];
        int var1 = -104 / ((54 - arg0) / 40);
        if ((class503.field7110 instanceof class260)) {
            class512.field7212 = false;
        } else {
            class512.field7212 = true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)V")
    public final void method2906(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method2911(114, false, -44, -34, true, (byte) -88, -84);
        }
        int var4 = arg0 - this.field7247;
        int var5 = arg1 - this.field7242;
        field7234++;
        this.field7243[var5][var4] = class425.method2563(this.field7243[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public final void method2907(byte arg0) {
        field7227++;
        if (arg0 != -58) {
            return;
        }
        for (int var2 = 0; var2 < this.field7229; var2++) {
            for (int var3 = 0; var3 < this.field7241; var3++) {
                if (var2 == 0 || var3 == 0 || this.field7229 - 5 <= var2 || var3 >= (this.field7241 - 5)) {
                    this.field7243[var2][var3] = -1;
                } else {
                    this.field7243[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V")
    public final void method2908(int arg0, int arg1, int arg2) {
        field7232++;
        if (arg0 != 1) {
            this.method2917(-74, 77, 106, false);
        }
        int var4 = arg1 - this.field7247;
        int var5 = arg2 - this.field7242;
        this.field7243[var5][var4] = class425.method2563(this.field7243[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7226++;
        if (arg0 == 1) {
            if (arg2 == arg7 && arg3 == arg6) {
                return true;
            }
        } else if (arg7 <= arg2 && arg2 <= (arg0 + arg7 - 1) && arg6 >= arg6 && arg6 + arg0 - 1 >= arg6) {
            return true;
        }
        int var9 = arg2 - this.field7242;
        if (arg4 != -1) {
            this.method2918(-121, -84, (byte) 43);
        }
        int var10 = arg6 - this.field7247;
        int var11 = arg7 - this.field7242;
        int var12 = arg3 - this.field7247;
        if (arg0 == 1) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field7243[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field7243[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field7243[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field7243[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field7243[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field7243[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field7243[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field7243[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field7243[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field7243[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field7243[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg0 - 1;
            int var14 = arg0 + var12 - 1;
            if (arg5 == 0) {
                if (arg1 == 0) {
                    if (var9 - arg0 == var11 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 + 1 == var12 && (this.field7243[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 - arg0 == var12 && (this.field7243[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 <= var9 && var9 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 - arg0) == var11 && var12 <= var10 && var10 <= var14 && (this.field7243[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field7243[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var9 + 1) == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field7243[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var10 - arg0) == var12 && (this.field7243[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var9 >= var11 && var13 >= var9 && var10 - arg0 == var12) {
                        return true;
                    }
                    if ((var9 - arg0) == var11 && var10 >= var12 && var14 >= var10 && (this.field7243[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var10 <= var14 && (this.field7243[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    if ((var9 - arg0) == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field7243[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 - arg0 == var12 && (this.field7243[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var9 - arg0 == var11 && var10 >= var12 && var14 >= var10 && (this.field7243[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 - arg0) == var12 && (this.field7243[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var9 - arg0 == var11 && var12 <= var10 && var14 >= var10 && (this.field7243[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 + 1 == var12 && (this.field7243[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg0 == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var9 - arg0) == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field7243[var9][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var14 >= var10 && (this.field7243[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 - arg0) == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var11 <= var9 && var9 <= var13 && (var10 + 1) == var12 && (this.field7243[var9][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var9 >= var11 && var9 <= var13 && var10 - arg0 == var12 && (this.field7243[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg0 == var11 && var12 <= var10 && var14 >= var10 && (this.field7243[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var12 <= var10 && var14 >= var10 && (this.field7243[var11][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZZBIIIII)V")
    public final void method2910(boolean arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7246++;
        int var9 = 256;
        if (arg0) {
            var9 |= 0x20000;
        }
        int var10 = arg3 - this.field7242;
        int var11 = arg5 - this.field7247;
        if (arg4 == 1 || arg4 == 3) {
            int var12 = arg7;
            arg7 = arg6;
            arg6 = var12;
        }
        if (arg2 != 76) {
            field7245 = 55;
        }
        if (arg1) {
            var9 |= 0x40000000;
        }
        for (int var13 = var10; var13 < (arg7 + var10); var13++) {
            if (var13 >= 0 && this.field7229 > var13) {
                for (int var14 = var11; var14 < arg6 + var11; var14++) {
                    if (var14 >= 0 && var14 < this.field7241) {
                        this.method2904(var13, (byte) -108, var14, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZIIZBI)V")
    public final void method2911(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        field7228++;
        int var8 = arg2 - this.field7242;
        int var9 = arg6 - this.field7247;
        if (arg5 != -37) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method2904(var8, (byte) -78, var9, 128);
                this.method2904(var8 - 1, (byte) -116, var9, 8);
            }
            if (arg0 == 1) {
                this.method2904(var8, (byte) -82, var9, 2);
                this.method2904(var8, (byte) -122, var9 + 1, 32);
            }
            if (arg0 == 2) {
                this.method2904(var8, (byte) -62, var9, 8);
                this.method2904(var8 + 1, (byte) -85, var9, 128);
            }
            if (arg0 == 3) {
                this.method2904(var8, (byte) -58, var9, 32);
                this.method2904(var8, (byte) -87, var9 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method2904(var8, (byte) -82, var9, 1);
                this.method2904(var8 - 1, (byte) -89, var9 + 1, 16);
            }
            if (arg0 == 1) {
                this.method2904(var8, (byte) -66, var9, 4);
                this.method2904(var8 + 1, (byte) -93, var9 + 1, 64);
            }
            if (arg0 == 2) {
                this.method2904(var8, (byte) -58, var9, 16);
                this.method2904(var8 + 1, (byte) -124, var9 - 1, 1);
            }
            if (arg0 == 3) {
                this.method2904(var8, (byte) -89, var9, 64);
                this.method2904(var8 - 1, (byte) -105, var9 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method2904(var8, (byte) -127, var9, 130);
                this.method2904(var8 - 1, (byte) -55, var9, 8);
                this.method2904(var8, (byte) -50, var9 + 1, 32);
            }
            if (arg0 == 1) {
                this.method2904(var8, (byte) -55, var9, 10);
                this.method2904(var8, (byte) -79, var9 + 1, 32);
                this.method2904(var8 + 1, (byte) -42, var9, 128);
            }
            if (arg0 == 2) {
                this.method2904(var8, (byte) -120, var9, 40);
                this.method2904(var8 + 1, (byte) -90, var9, 128);
                this.method2904(var8, (byte) -112, var9 - 1, 2);
            }
            if (arg0 == 3) {
                this.method2904(var8, (byte) -93, var9, 160);
                this.method2904(var8, (byte) -126, var9 - 1, 2);
                this.method2904(var8 - 1, (byte) -82, var9, 8);
            }
        }
        if (arg4) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method2904(var8, (byte) -100, var9, 65536);
                    this.method2904(var8 - 1, (byte) -106, var9, 4096);
                }
                if (arg0 == 1) {
                    this.method2904(var8, (byte) -65, var9, 1024);
                    this.method2904(var8, (byte) -57, var9 + 1, 16384);
                }
                if (arg0 == 2) {
                    this.method2904(var8, (byte) -79, var9, 4096);
                    this.method2904(var8 + 1, (byte) -50, var9, 65536);
                }
                if (arg0 == 3) {
                    this.method2904(var8, (byte) -78, var9, 16384);
                    this.method2904(var8, (byte) -56, var9 - 1, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method2904(var8, (byte) -103, var9, 512);
                    this.method2904(var8 - 1, (byte) -58, var9 + 1, 8192);
                }
                if (arg0 == 1) {
                    this.method2904(var8, (byte) -47, var9, 2048);
                    this.method2904(var8 + 1, (byte) -84, var9 + 1, 32768);
                }
                if (arg0 == 2) {
                    this.method2904(var8, (byte) -68, var9, 8192);
                    this.method2904(var8 + 1, (byte) -63, var9 - 1, 512);
                }
                if (arg0 == 3) {
                    this.method2904(var8, (byte) -93, var9, 32768);
                    this.method2904(var8 - 1, (byte) -69, var9 - 1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method2904(var8, (byte) -104, var9, 66560);
                    this.method2904(var8 - 1, (byte) -128, var9, 4096);
                    this.method2904(var8, (byte) -99, var9 + 1, 16384);
                }
                if (arg0 == 1) {
                    this.method2904(var8, (byte) -44, var9, 5120);
                    this.method2904(var8, (byte) -53, var9 + 1, 16384);
                    this.method2904(var8 + 1, (byte) -79, var9, 65536);
                }
                if (arg0 == 2) {
                    this.method2904(var8, (byte) -103, var9, 20480);
                    this.method2904(var8 + 1, (byte) -60, var9, 65536);
                    this.method2904(var8, (byte) -52, var9 - 1, 1024);
                }
                if (arg0 == 3) {
                    this.method2904(var8, (byte) -42, var9, 81920);
                    this.method2904(var8, (byte) -56, var9 - 1, 1024);
                    this.method2904(var8 - 1, (byte) -112, var9, 4096);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method2904(var8, (byte) -84, var9, 536870912);
                this.method2904(var8 - 1, (byte) -112, var9, 33554432);
            }
            if (arg0 == 1) {
                this.method2904(var8, (byte) -78, var9, 8388608);
                this.method2904(var8, (byte) -61, var9 + 1, 134217728);
            }
            if (arg0 == 2) {
                this.method2904(var8, (byte) -98, var9, 33554432);
                this.method2904(var8 + 1, (byte) -55, var9, 536870912);
            }
            if (arg0 == 3) {
                this.method2904(var8, (byte) -90, var9, 134217728);
                this.method2904(var8, (byte) -126, var9 - 1, 8388608);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method2904(var8, (byte) -59, var9, 4194304);
                this.method2904(var8 - 1, (byte) -89, var9 + 1, 67108864);
            }
            if (arg0 == 1) {
                this.method2904(var8, (byte) -109, var9, 16777216);
                this.method2904(var8 + 1, (byte) -110, var9 + 1, 268435456);
            }
            if (arg0 == 2) {
                this.method2904(var8, (byte) -119, var9, 67108864);
                this.method2904(var8 + 1, (byte) -47, var9 - 1, 4194304);
            }
            if (arg0 == 3) {
                this.method2904(var8, (byte) -115, var9, 268435456);
                this.method2904(var8 - 1, (byte) -91, var9 - 1, 16777216);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2904(var8, (byte) -43, var9, 545259520);
            this.method2904(var8 - 1, (byte) -68, var9, 33554432);
            this.method2904(var8, (byte) -116, var9 + 1, 134217728);
        }
        if (arg0 == 1) {
            this.method2904(var8, (byte) -111, var9, 41943040);
            this.method2904(var8, (byte) -128, var9 + 1, 134217728);
            this.method2904(var8 + 1, (byte) -55, var9, 536870912);
        }
        if (arg0 == 2) {
            this.method2904(var8, (byte) -83, var9, 167772160);
            this.method2904(var8 + 1, (byte) -128, var9, 536870912);
            this.method2904(var8, (byte) -92, var9 - 1, 8388608);
        }
        if (arg0 == 3) {
            this.method2904(var8, (byte) -114, var9, 671088640);
            this.method2904(var8, (byte) -64, var9 - 1, 8388608);
            this.method2904(var8 - 1, (byte) -66, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZZII)V")
    public final void method2912(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field7239++;
        int var8 = arg6 - this.field7247;
        int var9 = arg0 - this.field7242;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2917(128, var9, var8, false);
                this.method2917(8, var9 - 1, var8, false);
            }
            if (arg5 == 1) {
                this.method2917(2, var9, var8, false);
                this.method2917(32, var9, var8 + 1, false);
            }
            if (arg5 == 2) {
                this.method2917(8, var9, var8, false);
                this.method2917(128, var9 + 1, var8, false);
            }
            if (arg5 == 3) {
                this.method2917(32, var9, var8, false);
                this.method2917(2, var9, var8 - 1, false);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2917(1, var9, var8, false);
                this.method2917(16, var9 - 1, var8 + 1, false);
            }
            if (arg5 == 1) {
                this.method2917(4, var9, var8, false);
                this.method2917(64, var9 + 1, var8 + 1, false);
            }
            if (arg5 == 2) {
                this.method2917(16, var9, var8, false);
                this.method2917(1, var9 + 1, var8 + -1, false);
            }
            if (arg5 == 3) {
                this.method2917(64, var9, var8, false);
                this.method2917(4, var9 - 1, var8 - 1, false);
            }
        }
        if (arg1 > -119) {
            return;
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method2917(130, var9, var8, false);
                this.method2917(8, var9 - 1, var8, false);
                this.method2917(32, var9, var8 + 1, false);
            }
            if (arg5 == 1) {
                this.method2917(10, var9, var8, false);
                this.method2917(32, var9, var8 + 1, false);
                this.method2917(128, var9 + 1, var8, false);
            }
            if (arg5 == 2) {
                this.method2917(40, var9, var8, false);
                this.method2917(128, var9 + 1, var8, false);
                this.method2917(2, var9, var8 - 1, false);
            }
            if (arg5 == 3) {
                this.method2917(160, var9, var8, false);
                this.method2917(2, var9, var8 - 1, false);
                this.method2917(8, var9 - 1, var8, false);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method2917(65536, var9, var8, false);
                    this.method2917(4096, var9 - 1, var8, false);
                }
                if (arg5 == 1) {
                    this.method2917(1024, var9, var8, false);
                    this.method2917(16384, var9, var8 + 1, false);
                }
                if (arg5 == 2) {
                    this.method2917(4096, var9, var8, false);
                    this.method2917(65536, var9 + 1, var8, false);
                }
                if (arg5 == 3) {
                    this.method2917(16384, var9, var8, false);
                    this.method2917(1024, var9, var8 - 1, false);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method2917(512, var9, var8, false);
                    this.method2917(8192, var9 - 1, var8 + 1, false);
                }
                if (arg5 == 1) {
                    this.method2917(2048, var9, var8, false);
                    this.method2917(32768, var9 + 1, var8 + 1, false);
                }
                if (arg5 == 2) {
                    this.method2917(8192, var9, var8, false);
                    this.method2917(512, var9 + 1, var8 + -1, false);
                }
                if (arg5 == 3) {
                    this.method2917(32768, var9, var8, false);
                    this.method2917(2048, var9 - 1, var8 - 1, false);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method2917(66560, var9, var8, false);
                    this.method2917(4096, var9 - 1, var8, false);
                    this.method2917(16384, var9, var8 + 1, false);
                }
                if (arg5 == 1) {
                    this.method2917(5120, var9, var8, false);
                    this.method2917(16384, var9, var8 + 1, false);
                    this.method2917(65536, var9 + 1, var8, false);
                }
                if (arg5 == 2) {
                    this.method2917(20480, var9, var8, false);
                    this.method2917(65536, var9 + 1, var8, false);
                    this.method2917(1024, var9, var8 - 1, false);
                }
                if (arg5 == 3) {
                    this.method2917(81920, var9, var8, false);
                    this.method2917(1024, var9, var8 - 1, false);
                    this.method2917(4096, var9 - 1, var8, false);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method2917(536870912, var9, var8, false);
                this.method2917(33554432, var9 - 1, var8, false);
            }
            if (arg5 == 1) {
                this.method2917(8388608, var9, var8, false);
                this.method2917(134217728, var9, var8 + 1, false);
            }
            if (arg5 == 2) {
                this.method2917(33554432, var9, var8, false);
                this.method2917(536870912, var9 + 1, var8, false);
            }
            if (arg5 == 3) {
                this.method2917(134217728, var9, var8, false);
                this.method2917(8388608, var9, var8 - 1, false);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method2917(4194304, var9, var8, false);
                this.method2917(67108864, var9 - 1, var8 + 1, false);
            }
            if (arg5 == 1) {
                this.method2917(16777216, var9, var8, false);
                this.method2917(268435456, var9 + 1, var8 - -1, false);
            }
            if (arg5 == 2) {
                this.method2917(67108864, var9, var8, false);
                this.method2917(4194304, var9 + 1, var8 - 1, false);
            }
            if (arg5 == 3) {
                this.method2917(268435456, var9, var8, false);
                this.method2917(16777216, var9 - 1, var8 + -1, false);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2917(545259520, var9, var8, false);
            this.method2917(33554432, var9 - 1, var8, false);
            this.method2917(134217728, var9, var8 + 1, false);
        }
        if (arg5 == 1) {
            this.method2917(41943040, var9, var8, false);
            this.method2917(134217728, var9, var8 + 1, false);
            this.method2917(536870912, var9 + 1, var8, false);
        }
        if (arg5 == 2) {
            this.method2917(167772160, var9, var8, false);
            this.method2917(536870912, var9 + 1, var8, false);
            this.method2917(8388608, var9, var8 - 1, false);
        }
        if (arg5 == 3) {
            this.method2917(671088640, var9, var8, false);
            this.method2917(8388608, var9, var8 - 1, false);
            this.method2917(33554432, var9 - 1, var8, false);
            return;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method2913(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != -4) {
            return true;
        }
        field7233++;
        if (arg7 == 1) {
            if (arg1 == arg5 && arg0 == arg3) {
                return true;
            }
        } else if (arg5 >= arg1 && (arg1 + arg7 - 1) >= arg5 && arg3 <= arg3 && arg3 + arg7 - 1 >= arg3) {
            return true;
        }
        int var9 = arg3 - this.field7247;
        int var10 = arg0 - this.field7247;
        int var11 = arg1 - this.field7242;
        int var12 = arg5 - this.field7242;
        if (arg7 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field7243[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field7243[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field7243[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field7243[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field7243[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field7243[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field7243[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field7243[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field7243[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field7243[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field7243[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field7243[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = var10 + arg7 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var12 + 1 == var11 && var10 <= var9 && var9 <= var14 && (this.field7243[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var9 - arg7) == var10 && (this.field7243[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var12 - arg7) == var11 && var10 <= var9 && var9 <= var14 && (this.field7243[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var9 - arg7 == var10 && (this.field7243[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - arg7) == var11 && var9 >= var10 && var9 <= var14 && (this.field7243[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var9 + 1) == var10 && (this.field7243[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var12 + 1 == var11 && var9 >= var10 && var14 >= var9 && (this.field7243[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 + 1 == var10 && (this.field7243[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var12 >= var11 && var12 <= var13 && (var9 + 1) == var10 && (this.field7243[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var13 >= var12 && (var9 - arg7) == var10 && (this.field7243[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg7 == var11 && var10 <= var9 && var9 <= var14 && (this.field7243[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var14 && (this.field7243[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIBI)Z")
    public final boolean method2914(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field7235++;
        int var11 = arg1 + arg7;
        int var12 = arg3 + arg0;
        if (arg8 != 30) {
            this.field7241 = -27;
        }
        int var13 = arg2 + arg4;
        int var14 = arg6 + arg5;
        if (arg1 == var13 && (arg9 & 0x2) == 0) {
            int var15 = arg3 <= arg6 ? arg6 : arg3;
            int var16 = var12 < var14 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field7243[var13 - this.field7242 - 1][var15 - this.field7247] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg2 == var11 && (arg9 & 0x8) == 0) {
            int var17 = arg6 >= arg3 ? arg6 : arg3;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field7243[arg2 - this.field7242][var17 - this.field7247] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg2 >= arg1 ? arg2 : arg1;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field7243[var19 - this.field7242][var14 - this.field7247 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg6 == var12 && (arg9 & 0x4) == 0) {
            int var21 = arg2 >= arg1 ? arg2 : arg1;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var22 > var21) {
                if ((this.field7243[var21 - this.field7242][arg6 - this.field7247] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIBIIII)Z")
    public final boolean method2915(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field7231++;
        if (arg6 > 1) {
            return class408.method2506(arg1, arg6, arg6, arg5, arg7, 4005, arg2, arg8, arg3) ? true : this.method2914(arg6, arg1, arg2, arg8, arg3, arg7, arg5, arg6, (byte) 30, arg0);
        }
        int var10 = arg2 + arg3 - 1;
        int var11 = arg5 + arg7 - 1;
        if (arg2 <= arg1 && arg1 <= var10 && arg5 <= arg8 && arg8 <= var11) {
            return true;
        } else if (arg2 - 1 == arg1 && arg8 >= arg5 && arg8 <= var11 && (this.field7243[arg1 - this.field7242][arg8 - this.field7247] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg8 >= arg5 && arg8 <= var11 && (this.field7243[arg1 - this.field7242][arg8 - this.field7247] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else {
            int var12 = -18 / ((arg4 + 4) / 37);
            if (arg5 - 1 == arg8 && arg1 >= arg2 && arg1 <= var10 && (this.field7243[arg1 - this.field7242][arg8 - this.field7247] & 0x2) == 0 && (arg0 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg8 && arg1 >= arg2 && var10 >= arg1 && (this.field7243[arg1 - this.field7242][arg8 - this.field7247] & 0x20) == 0 && (arg0 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(III)V")
    public final void method2916(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field7247;
        field7236++;
        int var5 = arg0 - this.field7242;
        int var6 = -4 / ((-arg2 - 51) / 48);
        this.field7243[var5][var4] = class151.method1076(this.field7243[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZ)V")
    private final void method2917(int arg0, int arg1, int arg2, boolean arg3) {
        this.field7243[arg1][arg2] = class151.method1076(this.field7243[arg1][arg2], arg0);
        if (arg3) {
            this.method2911(39, false, 62, 29, false, (byte) 38, -40);
        }
        field7244++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIB)V")
    public final void method2918(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field7242;
        int var5 = arg0 - this.field7247;
        field7240++;
        if (arg2 <= 37) {
            this.method2912(87, -53, 51, false, false, -128, -4);
        }
        this.field7243[var4][var5] = class151.method1076(this.field7243[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIIIIZ)V")
    public final void method2919(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7237++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg1 - this.field7247;
        if (arg0) {
            var8 |= 0x40000000;
        }
        int var10 = arg4 - this.field7242;
        for (int var11 = var10; var11 < (arg3 + var10); var11++) {
            if (var11 >= 0 && var11 < this.field7229) {
                for (int var12 = var9; var12 < (arg5 + var9); var12++) {
                    if (var12 >= 0 && var12 < this.field7241) {
                        this.method2917(var8, var11, var12, false);
                    }
                }
            }
        }
        if (arg2 != -3) {
            this.field7241 = 75;
        }
    }
}
