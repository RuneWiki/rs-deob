import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class580 {

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8366 = new String[] { method4264(method4263("V\nvSi")), method4264(method4263("V\nvXi")), method4264(method4263("V\nv^i")), method4264(method4263("V\nvWi")), method4264(method4263("V\nvFi")), method4264(method4263("V\nvDi")), method4264(method4263("V\nvUi")), method4264(method4263("V\nv]i")), method4264(method4263("V\nvQi")), method4264(method4263("V\nv\\i")), method4264(method4263("V\nvTi")), method4264(method4263("V\nvYi")), method4264(method4263("V\nvZi")), method4264(method4263("V\nvPi")), method4264(method4263("V\nvGi")), method4264(method4263("V\nv[i")), method4264(method4263("DMv8<")), method4264(method4263("Q\u00164z")), method4264(method4263("V\nv_i")) };

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lhl;")
    public static class556 field8360 = new class556(135, 1);

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "Lwca;")
    public static class708 field8365 = new class708();

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public int field8345;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public int field8350;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public int field8354;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field8356;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public static int field8358;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field8359;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "[[I")
    public int[][] field8355;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)Z", line = 6)
    public final boolean method4245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field8362++;
            if (arg6 == 1) {
                if (arg0 == arg1 && arg3 == arg7) {
                    return true;
                }
            } else if (arg1 <= arg0 && arg0 <= (arg1 + arg6 - 1) && arg3 >= arg3 && (arg3 + arg6 - 1) >= arg3) {
                return true;
            }
            int var14 = arg1 - this.field8345;
            int var15 = arg3 - this.field8356;
            int var13 = arg0 - this.field8345;
            int var16 = arg7 - this.field8356;
            if (arg5 != -1) {
                return false;
            }
            if (arg6 == 1) {
                if (arg4 == 6 || arg4 == 7) {
                    if (arg4 == 7) {
                        arg2 = arg2 + 2 & 0x3;
                    }
                    if (arg2 == 0) {
                        if ((var13 + 1) == var14 && var15 == var16 && (this.field8355[var14][var16] & 0x80) == 0) {
                            return true;
                        }
                        if (var13 == var14 && var15 - 1 == var16 && (this.field8355[var14][var16] & 0x2) == 0) {
                            return true;
                        }
                    } else if (arg2 == 1) {
                        if ((var13 - 1) == var14 && var15 == var16 && (this.field8355[var14][var16] & 0x8) == 0) {
                            return true;
                        }
                        if (var13 == var14 && (var15 - 1) == var16 && (this.field8355[var14][var16] & 0x2) == 0) {
                            return true;
                        }
                    } else if (arg2 == 2) {
                        if ((var13 - 1) == var14 && var15 == var16 && (this.field8355[var14][var16] & 0x8) == 0) {
                            return true;
                        }
                        if (var13 == var14 && var15 + 1 == var16 && (this.field8355[var14][var16] & 0x20) == 0) {
                            return true;
                        }
                    } else if (arg2 == 3) {
                        if (var13 + 1 == var14 && var15 == var16 && (this.field8355[var14][var16] & 0x80) == 0) {
                            return true;
                        }
                        if (var13 == var14 && (var15 + 1) == var16 && (this.field8355[var14][var16] & 0x20) == 0) {
                            return true;
                        }
                    }
                }
                if (arg4 == 8) {
                    if (var13 == var14 && (var15 + 1) == var16 && (this.field8355[var14][var16] & 0x20) == 0) {
                        return true;
                    }
                    if (var13 == var14 && var15 - 1 == var16 && (this.field8355[var14][var16] & 0x2) == 0) {
                        return true;
                    }
                    if ((var13 - 1) == var14 && var15 == var16 && (this.field8355[var14][var16] & 0x8) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var14 && var15 == var16 && (this.field8355[var14][var16] & 0x80) == 0) {
                        return true;
                    }
                }
            } else {
                int var9 = var14 + arg6 - 1;
                int var10 = var16 - (1 - arg6);
                if (arg4 == 6 || arg4 == 7) {
                    if (arg4 == 7) {
                        arg2 = arg2 + 2 & 0x3;
                    }
                    if (arg2 == 0) {
                        if (var13 + 1 == var14 && var15 >= var16 && var10 >= var15 && (this.field8355[var14][var15] & 0x80) == 0) {
                            return true;
                        }
                        if (var13 >= var14 && var13 <= var9 && (var15 - arg6) == var16 && (this.field8355[var13][var10] & 0x2) == 0) {
                            return true;
                        }
                    } else if (arg2 == 1) {
                        if (var13 - arg6 == var14 && var15 >= var16 && var15 <= var10 && (this.field8355[var9][var15] & 0x8) == 0) {
                            return true;
                        }
                        if (var14 <= var13 && var9 >= var13 && var15 - arg6 == var16 && (this.field8355[var13][var10] & 0x2) == 0) {
                            return true;
                        }
                    } else if (arg2 == 2) {
                        if (var13 - arg6 == var14 && var15 >= var16 && var10 >= var15 && (this.field8355[var9][var15] & 0x8) == 0) {
                            return true;
                        }
                        if (var13 >= var14 && var9 >= var13 && var15 + 1 == var16 && (this.field8355[var13][var16] & 0x20) == 0) {
                            return true;
                        }
                    } else if (arg2 == 3) {
                        if ((var13 + 1) == var14 && var16 <= var15 && var10 >= var15 && (this.field8355[var14][var15] & 0x80) == 0) {
                            return true;
                        }
                        if (var14 <= var13 && var9 >= var13 && var15 + 1 == var16 && (this.field8355[var13][var16] & 0x20) == 0) {
                            return true;
                        }
                    }
                }
                if (arg4 == 8) {
                    if (var14 <= var13 && var9 >= var13 && var15 + 1 == var16 && (this.field8355[var13][var16] & 0x20) == 0) {
                        return true;
                    }
                    if (var13 >= var14 && var13 <= var9 && (var15 - arg6) == var16 && (this.field8355[var13][var10] & 0x2) == 0) {
                        return true;
                    }
                    if (var13 - arg6 == var14 && var15 >= var16 && var15 <= var10 && (this.field8355[var9][var15] & 0x8) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var14 && var15 >= var16 && var15 <= var10 && (this.field8355[var14][var15] & 0x80) == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field8366[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)V", line = 204)
    public final void method4246(int arg0, int arg1, byte arg2) {
        try {
            int var7 = arg1 - this.field8345;
            if (arg2 != 38) {
                this.method4248(-67, -67, -104, 94, -120, 52, 63, 32, 117, 69);
            }
            field8348++;
            int var6 = arg0 - this.field8356;
            this.field8355[var7][var6] = class292.method2485(this.field8355[var7][var6], -262145);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8366[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BIII)V", line = 217)
    private final void method4247(byte arg0, int arg1, int arg2, int arg3) {
        try {
            this.field8355[arg3][arg2] = class553.method4099(this.field8355[arg3][arg2], arg1);
            field8351++;
            if (arg0 > -37) {
                this.field8354 = 46;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8366[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)Z", line = 233)
    public final boolean method4248(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            if (arg3 != 2883968) {
                this.field8350 = -123;
            }
            field8358++;
            int var11 = arg2 + arg8;
            int var12 = arg4 + arg5;
            int var13 = arg0 + arg6;
            int var14 = arg7 + arg9;
            if (arg2 == var13 && (arg1 & 0x2) == 0) {
                int var15 = arg5 <= arg9 ? arg9 : arg5;
                int var16 = var12 >= var14 ? var14 : var12;
                while (var16 > var15) {
                    if ((this.field8355[var13 - this.field8345 - 1][var15 - this.field8356] & 0x8) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg6 == var11 && (arg1 & 0x8) == 0) {
                int var21 = arg5 <= arg9 ? arg9 : arg5;
                int var22 = var12 < var14 ? var12 : var14;
                while (var22 > var21) {
                    if ((this.field8355[arg6 - this.field8345][var21 - this.field8356] & 0x80) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg5 == var14 && (arg1 & 0x1) == 0) {
                int var17 = arg6 >= arg2 ? arg6 : arg2;
                int var18 = var11 < var13 ? var11 : var13;
                while (var17 < var18) {
                    if ((this.field8355[var17 - this.field8345][var14 - this.field8356 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var17++;
                }
            } else if (arg9 == var12 && (arg1 & 0x4) == 0) {
                int var19 = arg6 < arg2 ? arg2 : arg6;
                int var20 = var13 > var11 ? var11 : var13;
                while (var20 > var19) {
                    if ((this.field8355[var19 - this.field8345][arg9 - this.field8356] & 0x20) == 0) {
                        return true;
                    }
                    var19++;
                }
            }
            return false;
        } catch (RuntimeException var24) {
            throw class590.method4333(var24, field8366[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZZIIIZ)V", line = 325)
    public final void method4249(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        try {
            int var10 = arg0 - this.field8345;
            int var11 = arg4 - this.field8356;
            field8357++;
            if (arg1) {
                this.method4249(-10, false, false, -74, -13, -89, false);
            }
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method4252(-18576, var10, 128, var11);
                    this.method4252(-18576, var10 - 1, 8, var11);
                }
                if (arg5 == 1) {
                    this.method4252(-18576, var10, 2, var11);
                    this.method4252(-18576, var10, 32, var11 + 1);
                }
                if (arg5 == 2) {
                    this.method4252(-18576, var10, 8, var11);
                    this.method4252(-18576, var10 + 1, 128, var11);
                }
                if (arg5 == 3) {
                    this.method4252(-18576, var10, 32, var11);
                    this.method4252(-18576, var10, 2, var11 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method4252(-18576, var10, 1, var11);
                    this.method4252(-18576, var10 - 1, 16, var11 + 1);
                }
                if (arg5 == 1) {
                    this.method4252(-18576, var10, 4, var11);
                    this.method4252(-18576, var10 + 1, 64, var11 + 1);
                }
                if (arg5 == 2) {
                    this.method4252(-18576, var10, 16, var11);
                    this.method4252(-18576, var10 + 1, 1, var11 - 1);
                }
                if (arg5 == 3) {
                    this.method4252(-18576, var10, 64, var11);
                    this.method4252(-18576, var10 - 1, 4, var11 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method4252(-18576, var10, 130, var11);
                    this.method4252(-18576, var10 - 1, 8, var11);
                    this.method4252(-18576, var10, 32, var11 + 1);
                }
                if (arg5 == 1) {
                    this.method4252(-18576, var10, 10, var11);
                    this.method4252(-18576, var10, 32, var11 + 1);
                    this.method4252(-18576, var10 + 1, 128, var11);
                }
                if (arg5 == 2) {
                    this.method4252(-18576, var10, 40, var11);
                    this.method4252(-18576, var10 + 1, 128, var11);
                    this.method4252(-18576, var10, 2, var11 - 1);
                }
                if (arg5 == 3) {
                    this.method4252(-18576, var10, 160, var11);
                    this.method4252(-18576, var10, 2, var11 - 1);
                    this.method4252(-18576, var10 - 1, 8, var11);
                }
            }
            if (arg2) {
                if (arg3 == 0) {
                    if (arg5 == 0) {
                        this.method4252(-18576, var10, 65536, var11);
                        this.method4252(-18576, var10 - 1, 4096, var11);
                    }
                    if (arg5 == 1) {
                        this.method4252(-18576, var10, 1024, var11);
                        this.method4252(-18576, var10, 16384, var11 + 1);
                    }
                    if (arg5 == 2) {
                        this.method4252(-18576, var10, 4096, var11);
                        this.method4252(-18576, var10 + 1, 65536, var11);
                    }
                    if (arg5 == 3) {
                        this.method4252(-18576, var10, 16384, var11);
                        this.method4252(-18576, var10, 1024, var11 - 1);
                    }
                }
                if (arg3 == 1 || arg3 == 3) {
                    if (arg5 == 0) {
                        this.method4252(-18576, var10, 512, var11);
                        this.method4252(-18576, var10 - 1, 8192, var11 + 1);
                    }
                    if (arg5 == 1) {
                        this.method4252(-18576, var10, 2048, var11);
                        this.method4252(-18576, var10 + 1, 32768, var11 + 1);
                    }
                    if (arg5 == 2) {
                        this.method4252(-18576, var10, 8192, var11);
                        this.method4252(-18576, var10 + 1, 512, var11 - 1);
                    }
                    if (arg5 == 3) {
                        this.method4252(-18576, var10, 32768, var11);
                        this.method4252(-18576, var10 - 1, 2048, var11 - 1);
                    }
                }
                if (arg3 == 2) {
                    if (arg5 == 0) {
                        this.method4252(-18576, var10, 66560, var11);
                        this.method4252(-18576, var10 - 1, 4096, var11);
                        this.method4252(-18576, var10, 16384, var11 + 1);
                    }
                    if (arg5 == 1) {
                        this.method4252(-18576, var10, 5120, var11);
                        this.method4252(-18576, var10, 16384, var11 + 1);
                        this.method4252(-18576, var10 + 1, 65536, var11);
                    }
                    if (arg5 == 2) {
                        this.method4252(-18576, var10, 20480, var11);
                        this.method4252(-18576, var10 + 1, 65536, var11);
                        this.method4252(-18576, var10, 1024, var11 - 1);
                    }
                    if (arg5 == 3) {
                        this.method4252(-18576, var10, 81920, var11);
                        this.method4252(-18576, var10, 1024, var11 - 1);
                        this.method4252(-18576, var10 - 1, 4096, var11);
                    }
                }
            }
            if (arg6) {
                if (arg3 == 0) {
                    if (arg5 == 0) {
                        this.method4252(-18576, var10, 536870912, var11);
                        this.method4252(-18576, var10 - 1, 33554432, var11);
                    }
                    if (arg5 == 1) {
                        this.method4252(-18576, var10, 8388608, var11);
                        this.method4252(-18576, var10, 134217728, var11 + 1);
                    }
                    if (arg5 == 2) {
                        this.method4252(-18576, var10, 33554432, var11);
                        this.method4252(-18576, var10 + 1, 536870912, var11);
                    }
                    if (arg5 == 3) {
                        this.method4252(-18576, var10, 134217728, var11);
                        this.method4252(-18576, var10, 8388608, var11 - 1);
                    }
                }
                if (arg3 == 1 || arg3 == 3) {
                    if (arg5 == 0) {
                        this.method4252(-18576, var10, 4194304, var11);
                        this.method4252(-18576, var10 - 1, 67108864, var11 + 1);
                    }
                    if (arg5 == 1) {
                        this.method4252(-18576, var10, 16777216, var11);
                        this.method4252(-18576, var10 + 1, 268435456, var11 + 1);
                    }
                    if (arg5 == 2) {
                        this.method4252(-18576, var10, 67108864, var11);
                        this.method4252(-18576, var10 + 1, 4194304, var11 - 1);
                    }
                    if (arg5 == 3) {
                        this.method4252(-18576, var10, 268435456, var11);
                        this.method4252(-18576, var10 - 1, 16777216, var11 - 1);
                    }
                }
                if (arg3 == 2) {
                    if (arg5 == 0) {
                        this.method4252(-18576, var10, 545259520, var11);
                        this.method4252(-18576, var10 - 1, 33554432, var11);
                        this.method4252(-18576, var10, 134217728, var11 + 1);
                    }
                    if (arg5 == 1) {
                        this.method4252(-18576, var10, 41943040, var11);
                        this.method4252(-18576, var10, 134217728, var11 + 1);
                        this.method4252(-18576, var10 + 1, 536870912, var11);
                    }
                    if (arg5 == 2) {
                        this.method4252(-18576, var10, 167772160, var11);
                        this.method4252(-18576, var10 + 1, 536870912, var11);
                        this.method4252(-18576, var10, 8388608, var11 - 1);
                    }
                    if (arg5 == 3) {
                        this.method4252(-18576, var10, 671088640, var11);
                        this.method4252(-18576, var10, 8388608, var11 - 1);
                        this.method4252(-18576, var10 - 1, 33554432, var11);
                        return;
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field8366[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBIIIIIII)Z", line = 632)
    public final boolean method4250(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            field8344++;
            if (arg8 > 1) {
                return class480.method3662(arg3, arg2, arg8, arg8, arg4, arg5, arg7, arg0, 73) ? true : this.method4248(arg0, arg6, arg3, 2883968, arg8, arg4, arg7, arg2, arg8, arg5);
            }
            int var10 = arg0 + arg7 - 1;
            int var11 = arg2 + arg5 - 1;
            if (arg7 <= arg3 && arg3 <= var10 && arg5 <= arg4 && var11 >= arg4) {
                return true;
            } else if (arg1 <= 62) {
                return false;
            } else if (arg7 - 1 == arg3 && arg4 >= arg5 && var11 >= arg4 && (this.field8355[arg3 - this.field8345][arg4 - this.field8356] & 0x8) == 0 && (arg6 & 0x8) == 0) {
                return true;
            } else if ((var10 + 1) == arg3 && arg5 <= arg4 && arg4 <= var11 && (this.field8355[arg3 - this.field8345][arg4 - this.field8356] & 0x80) == 0 && (arg6 & 0x2) == 0) {
                return true;
            } else if (arg5 - 1 == arg4 && arg3 >= arg7 && var10 >= arg3 && (this.field8355[arg3 - this.field8345][arg4 - this.field8356] & 0x2) == 0 && (arg6 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg4 && arg3 >= arg7 && var10 >= arg3 && (this.field8355[arg3 - this.field8345][arg4 - this.field8356] & 0x20) == 0 && (arg6 & 0x1) == 0;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field8366[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V", line = 675)
    public final void method4251(boolean arg0) {
        try {
            if (arg0) {
                for (int var2 = 0; var2 < this.field8354; var2++) {
                    for (int var3 = 0; var3 < this.field8350; var3++) {
                        if (var2 == 0 || var3 == 0 || this.field8354 - 5 <= var2 || var3 >= this.field8350 - 5) {
                            this.field8355[var2][var3] = -1;
                        } else {
                            this.field8355[var2][var3] = 2097152;
                        }
                    }
                }
                field8349++;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8366[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V", line = 707)
    private final void method4252(int arg0, int arg1, int arg2, int arg3) {
        try {
            field8364++;
            this.field8355[arg1][arg3] = class292.method2485(this.field8355[arg1][arg3], ~arg2);
            if (arg0 != -18576) {
                field8360 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8366[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBIZIZI)V", line = 723)
    public final void method4253(int arg0, byte arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        try {
            field8346++;
            int var8 = 256;
            if (arg5) {
                var8 |= 0x20000;
            }
            int var13 = arg0 - this.field8345;
            if (arg3) {
                var8 |= 0x40000000;
            }
            int var14 = arg4 - this.field8356;
            for (int var9 = var13; var9 < var13 + arg6; var9++) {
                if (var9 >= 0 && this.field8354 > var9) {
                    for (int var10 = var14; var10 < var14 + arg2; var10++) {
                        if (var10 >= 0 && this.field8350 > var10) {
                            this.method4247((byte) -47, var8, var10, var9);
                        }
                    }
                }
            }
            if (arg1 != -13) {
                this.field8354 = 2;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field8366[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLdn;)I", line = 778)
    public static final int method4254(boolean arg0, class544 arg1) {
        try {
            if (!arg0) {
                return -55;
            }
            field8343++;
            if (class544.field8000 == arg1) {
                return 5120;
            } else if (class544.field8001 == arg1) {
                return 5122;
            } else if (class544.field8002 == arg1) {
                return 5124;
            } else if (class544.field8004 == arg1) {
                return 5121;
            } else if (class544.field8005 == arg1) {
                return 5123;
            } else if (class544.field8006 == arg1) {
                return 5125;
            } else if (class544.field8007 == arg1) {
                return 5131;
            } else if (class544.field8008 == arg1) {
                return 5126;
            } else {
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8366[15] + arg0 + ',' + (arg1 == null ? field8366[17] : field8366[16]) + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BIIIIIII)Z", line = 823)
    public final boolean method4255(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field8347++;
            if (arg6 == 1) {
                if (arg1 == arg5 && arg2 == arg7) {
                    return true;
                }
            } else if (arg1 >= arg5 && arg1 <= (arg5 + arg6 - 1) && arg2 <= arg2 && (arg2 + arg6 - 1) >= arg2) {
                return true;
            }
            int var14 = arg2 - this.field8356;
            int var13 = arg1 - this.field8345;
            int var15 = arg5 - this.field8345;
            int var16 = arg7 - this.field8356;
            if (arg0 != 42) {
                this.field8354 = 13;
            }
            if (arg6 == 1) {
                if (arg3 == 0) {
                    if (arg4 == 0) {
                        if ((var13 - 1) == var15 && var14 == var16) {
                            return true;
                        }
                        if (var13 == var15 && var14 + 1 == var16 && (this.field8355[var15][var16] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var13 == var15 && var14 - 1 == var16 && (this.field8355[var15][var16] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg4 == 1) {
                        if (var13 == var15 && var14 + 1 == var16) {
                            return true;
                        }
                        if (var13 - 1 == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var13 + 1 == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x2C0180) == 0) {
                            return true;
                        }
                    } else if (arg4 == 2) {
                        if (var13 + 1 == var15 && var14 == var16) {
                            return true;
                        }
                        if (var13 == var15 && (var14 + 1) == var16 && (this.field8355[var15][var16] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var13 == var15 && (var14 - 1) == var16 && (this.field8355[var15][var16] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg4 == 3) {
                        if (var13 == var15 && var14 - 1 == var16) {
                            return true;
                        }
                        if (var13 - 1 == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x2C0108) == 0) {
                            return true;
                        }
                        if ((var13 + 1) == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x2C0180) == 0) {
                            return true;
                        }
                    }
                }
                if (arg3 == 2) {
                    if (arg4 == 0) {
                        if (var13 - 1 == var15 && var14 == var16) {
                            return true;
                        }
                        if (var13 == var15 && (var14 + 1) == var16) {
                            return true;
                        }
                        if ((var13 + 1) == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x2C0180) == 0) {
                            return true;
                        }
                        if (var13 == var15 && var14 - 1 == var16 && (this.field8355[var15][var16] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg4 == 1) {
                        if ((var13 - 1) == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var13 == var15 && var14 + 1 == var16) {
                            return true;
                        }
                        if ((var13 + 1) == var15 && var14 == var16) {
                            return true;
                        }
                        if (var13 == var15 && (var14 - 1) == var16 && (this.field8355[var15][var16] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg4 == 2) {
                        if ((var13 - 1) == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var13 == var15 && (var14 + 1) == var16 && (this.field8355[var15][var16] & 0x2C0120) == 0) {
                            return true;
                        }
                        if ((var13 + 1) == var15 && var14 == var16) {
                            return true;
                        }
                        if (var13 == var15 && var14 - 1 == var16) {
                            return true;
                        }
                    } else if (arg4 == 3) {
                        if ((var13 - 1) == var15 && var14 == var16) {
                            return true;
                        }
                        if (var13 == var15 && (var14 + 1) == var16 && (this.field8355[var15][var16] & 0x2C0120) == 0) {
                            return true;
                        }
                        if ((var13 + 1) == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x2C0180) == 0) {
                            return true;
                        }
                        if (var13 == var15 && (var14 - 1) == var16) {
                            return true;
                        }
                    }
                }
                if (arg3 == 9) {
                    if (var13 == var15 && var14 + 1 == var16 && (this.field8355[var15][var16] & 0x20) == 0) {
                        return true;
                    }
                    if (var13 == var15 && (var14 - 1) == var16 && (this.field8355[var15][var16] & 0x2) == 0) {
                        return true;
                    }
                    if ((var13 - 1) == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x8) == 0) {
                        return true;
                    }
                    if ((var13 + 1) == var15 && var14 == var16 && (this.field8355[var15][var16] & 0x80) == 0) {
                        return true;
                    }
                }
            } else {
                int var9 = var15 + arg6 - 1;
                int var10 = arg6 + var16 - 1;
                if (arg3 == 0) {
                    if (arg4 == 0) {
                        if (var13 - arg6 == var15 && var14 >= var16 && var10 >= var14) {
                            return true;
                        }
                        if (var15 <= var13 && var13 <= var9 && (var14 + 1) == var16 && (this.field8355[var13][var16] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var13 >= var15 && var13 <= var9 && (var14 - arg6) == var16 && (this.field8355[var13][var10] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg4 == 1) {
                        if (var15 <= var13 && var9 >= var13 && var14 + 1 == var16) {
                            return true;
                        }
                        if ((var13 - arg6) == var15 && var14 >= var16 && var14 <= var10 && (this.field8355[var9][var14] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var13 + 1 == var15 && var16 <= var14 && var14 <= var10 && (this.field8355[var15][var14] & 0x2C0180) == 0) {
                            return true;
                        }
                    } else if (arg4 == 2) {
                        if ((var13 + 1) == var15 && var14 >= var16 && var10 >= var14) {
                            return true;
                        }
                        if (var15 <= var13 && var9 >= var13 && var14 + 1 == var16 && (this.field8355[var13][var16] & 0x2C0120) == 0) {
                            return true;
                        }
                        if (var15 <= var13 && var9 >= var13 && var14 - arg6 == var16 && (this.field8355[var13][var10] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg4 == 3) {
                        if (var15 <= var13 && var13 <= var9 && (var14 - arg6) == var16) {
                            return true;
                        }
                        if ((var13 - arg6) == var15 && var16 <= var14 && var14 <= var10 && (this.field8355[var9][var14] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var13 + 1 == var15 && var14 >= var16 && var10 >= var14 && (this.field8355[var15][var14] & 0x2C0180) == 0) {
                            return true;
                        }
                    }
                }
                if (arg3 == 2) {
                    if (arg4 == 0) {
                        if (var13 - arg6 == var15 && var16 <= var14 && var14 <= var10) {
                            return true;
                        }
                        if (var13 >= var15 && var13 <= var9 && (var14 + 1) == var16) {
                            return true;
                        }
                        if (var13 + 1 == var15 && var16 <= var14 && var10 >= var14 && (this.field8355[var15][var14] & 0x2C0180) == 0) {
                            return true;
                        }
                        if (var13 >= var15 && var9 >= var13 && (var14 - arg6) == var16 && (this.field8355[var13][var10] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg4 == 1) {
                        if ((var13 - arg6) == var15 && var16 <= var14 && var14 <= var10 && (this.field8355[var9][var14] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var15 <= var13 && var9 >= var13 && (var14 + 1) == var16) {
                            return true;
                        }
                        if ((var13 + 1) == var15 && var16 <= var14 && var14 <= var10) {
                            return true;
                        }
                        if (var13 >= var15 && var13 <= var9 && var14 - arg6 == var16 && (this.field8355[var13][var10] & 0x2C0102) == 0) {
                            return true;
                        }
                    } else if (arg4 == 2) {
                        if (var13 - arg6 == var15 && var16 <= var14 && var14 <= var10 && (this.field8355[var9][var14] & 0x2C0108) == 0) {
                            return true;
                        }
                        if (var13 >= var15 && var9 >= var13 && var14 + 1 == var16 && (this.field8355[var13][var16] & 0x2C0120) == 0) {
                            return true;
                        }
                        if ((var13 + 1) == var15 && var16 <= var14 && var14 <= var10) {
                            return true;
                        }
                        if (var15 <= var13 && var9 >= var13 && (var14 - arg6) == var16) {
                            return true;
                        }
                    } else if (arg4 == 3) {
                        if (var13 - arg6 == var15 && var16 <= var14 && var10 >= var14) {
                            return true;
                        }
                        if (var13 >= var15 && var13 <= var9 && (var14 + 1) == var16 && (this.field8355[var13][var16] & 0x2C0120) == 0) {
                            return true;
                        }
                        if ((var13 + 1) == var15 && var14 >= var16 && var14 <= var10 && (this.field8355[var15][var14] & 0x2C0180) == 0) {
                            return true;
                        }
                        if (var13 >= var15 && var13 <= var9 && (var14 - arg6) == var16) {
                            return true;
                        }
                    }
                }
                if (arg3 == 9) {
                    if (var13 >= var15 && var13 <= var9 && (var14 + 1) == var16 && (this.field8355[var13][var16] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var13 >= var15 && var9 >= var13 && var14 - arg6 == var16 && (this.field8355[var13][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                    if (var13 - arg6 == var15 && var16 <= var14 && var10 >= var14 && (this.field8355[var9][var14] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var13 + 1 == var15 && var16 <= var14 && var14 <= var10 && (this.field8355[var15][var14] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field8366[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)V", line = 1186)
    public final void method4256(int arg0, byte arg1, int arg2) {
        try {
            int var8 = arg2 - this.field8345;
            int var7 = arg0 - this.field8356;
            field8361++;
            this.field8355[var8][var7] = class553.method4099(this.field8355[var8][var7], 2097152);
            int var4 = -13 % ((arg1 + 55) / 58);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field8366[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lrda;)V", line = 1201)
    public static final void method4257(class693 arg0) {
        class120.field1734.method229(arg0.field9985, arg0.field9972 + (arg0.method43(0) >> 1), arg0.field9983, class112.field1571);
        arg0.field9970 = class112.field1571[0];
        arg0.field9984 = class112.field1571[1];
        arg0.field9973 = class112.field1571[2];
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZZIIII)V", line = 1207)
    public final void method4258(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int var10 = arg5 - this.field8356;
            int var11 = arg6 - this.field8345;
            field8353++;
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method4247((byte) -41, 128, var10, var11);
                    this.method4247((byte) -91, 8, var10, var11 - 1);
                }
                if (arg0 == 1) {
                    this.method4247((byte) -108, 2, var10, var11);
                    this.method4247((byte) -60, 32, var10 + 1, var11);
                }
                if (arg0 == 2) {
                    this.method4247((byte) -60, 8, var10, var11);
                    this.method4247((byte) -105, 128, var10, var11 + 1);
                }
                if (arg0 == 3) {
                    this.method4247((byte) -54, 32, var10, var11);
                    this.method4247((byte) -117, 2, var10 - 1, var11);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method4247((byte) -124, 1, var10, var11);
                    this.method4247((byte) -121, 16, var10 + 1, var11 + -1);
                }
                if (arg0 == 1) {
                    this.method4247((byte) -126, 4, var10, var11);
                    this.method4247((byte) -95, 64, var10 + 1, var11 + 1);
                }
                if (arg0 == 2) {
                    this.method4247((byte) -48, 16, var10, var11);
                    this.method4247((byte) -70, 1, var10 - 1, var11 + 1);
                }
                if (arg0 == 3) {
                    this.method4247((byte) -52, 64, var10, var11);
                    this.method4247((byte) -69, 4, var10 - 1, var11 + -1);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method4247((byte) -61, 130, var10, var11);
                    this.method4247((byte) -64, 8, var10, var11 - 1);
                    this.method4247((byte) -64, 32, var10 + 1, var11);
                }
                if (arg0 == 1) {
                    this.method4247((byte) -89, 10, var10, var11);
                    this.method4247((byte) -52, 32, var10 + 1, var11);
                    this.method4247((byte) -57, 128, var10, var11 + 1);
                }
                if (arg0 == 2) {
                    this.method4247((byte) -119, 40, var10, var11);
                    this.method4247((byte) -81, 128, var10, var11 + 1);
                    this.method4247((byte) -121, 2, var10 - 1, var11);
                }
                if (arg0 == 3) {
                    this.method4247((byte) -72, 160, var10, var11);
                    this.method4247((byte) -95, 2, var10 - 1, var11);
                    this.method4247((byte) -66, 8, var10, var11 - 1);
                }
            }
            if (arg3 != -17996) {
                field8360 = null;
            }
            if (arg1) {
                if (arg4 == 0) {
                    if (arg0 == 0) {
                        this.method4247((byte) -118, 65536, var10, var11);
                        this.method4247((byte) -48, 4096, var10, var11 - 1);
                    }
                    if (arg0 == 1) {
                        this.method4247((byte) -115, 1024, var10, var11);
                        this.method4247((byte) -53, 16384, var10 + 1, var11);
                    }
                    if (arg0 == 2) {
                        this.method4247((byte) -110, 4096, var10, var11);
                        this.method4247((byte) -106, 65536, var10, var11 + 1);
                    }
                    if (arg0 == 3) {
                        this.method4247((byte) -40, 16384, var10, var11);
                        this.method4247((byte) -76, 1024, var10 - 1, var11);
                    }
                }
                if (arg4 == 1 || arg4 == 3) {
                    if (arg0 == 0) {
                        this.method4247((byte) -96, 512, var10, var11);
                        this.method4247((byte) -126, 8192, var10 + 1, var11 + -1);
                    }
                    if (arg0 == 1) {
                        this.method4247((byte) -90, 2048, var10, var11);
                        this.method4247((byte) -87, 32768, var10 + 1, var11 - -1);
                    }
                    if (arg0 == 2) {
                        this.method4247((byte) -95, 8192, var10, var11);
                        this.method4247((byte) -60, 512, var10 - 1, var11 + 1);
                    }
                    if (arg0 == 3) {
                        this.method4247((byte) -94, 32768, var10, var11);
                        this.method4247((byte) -109, 2048, var10 - 1, var11 + -1);
                    }
                }
                if (arg4 == 2) {
                    if (arg0 == 0) {
                        this.method4247((byte) -93, 66560, var10, var11);
                        this.method4247((byte) -42, 4096, var10, var11 - 1);
                        this.method4247((byte) -38, 16384, var10 + 1, var11);
                    }
                    if (arg0 == 1) {
                        this.method4247((byte) -75, 5120, var10, var11);
                        this.method4247((byte) -81, 16384, var10 + 1, var11);
                        this.method4247((byte) -69, 65536, var10, var11 + 1);
                    }
                    if (arg0 == 2) {
                        this.method4247((byte) -119, 20480, var10, var11);
                        this.method4247((byte) -126, 65536, var10, var11 + 1);
                        this.method4247((byte) -89, 1024, var10 - 1, var11);
                    }
                    if (arg0 == 3) {
                        this.method4247((byte) -97, 81920, var10, var11);
                        this.method4247((byte) -122, 1024, var10 - 1, var11);
                        this.method4247((byte) -105, 4096, var10, var11 - 1);
                    }
                }
            }
            if (arg2) {
                if (arg4 == 0) {
                    if (arg0 == 0) {
                        this.method4247((byte) -60, 536870912, var10, var11);
                        this.method4247((byte) -79, 33554432, var10, var11 - 1);
                    }
                    if (arg0 == 1) {
                        this.method4247((byte) -119, 8388608, var10, var11);
                        this.method4247((byte) -76, 134217728, var10 + 1, var11);
                    }
                    if (arg0 == 2) {
                        this.method4247((byte) -39, 33554432, var10, var11);
                        this.method4247((byte) -94, 536870912, var10, var11 + 1);
                    }
                    if (arg0 == 3) {
                        this.method4247((byte) -80, 134217728, var10, var11);
                        this.method4247((byte) -108, 8388608, var10 - 1, var11);
                    }
                }
                if (arg4 == 1 || arg4 == 3) {
                    if (arg0 == 0) {
                        this.method4247((byte) -121, 4194304, var10, var11);
                        this.method4247((byte) -61, 67108864, var10 + 1, var11 + -1);
                    }
                    if (arg0 == 1) {
                        this.method4247((byte) -59, 16777216, var10, var11);
                        this.method4247((byte) -49, 268435456, var10 + 1, var11 + 1);
                    }
                    if (arg0 == 2) {
                        this.method4247((byte) -48, 67108864, var10, var11);
                        this.method4247((byte) -98, 4194304, var10 - 1, var11 + 1);
                    }
                    if (arg0 == 3) {
                        this.method4247((byte) -54, 268435456, var10, var11);
                        this.method4247((byte) -69, 16777216, var10 - 1, var11 - 1);
                    }
                }
                if (arg4 == 2) {
                    if (arg0 == 0) {
                        this.method4247((byte) -63, 545259520, var10, var11);
                        this.method4247((byte) -76, 33554432, var10, var11 - 1);
                        this.method4247((byte) -110, 134217728, var10 + 1, var11);
                    }
                    if (arg0 == 1) {
                        this.method4247((byte) -75, 41943040, var10, var11);
                        this.method4247((byte) -92, 134217728, var10 + 1, var11);
                        this.method4247((byte) -103, 536870912, var10, var11 + 1);
                    }
                    if (arg0 == 2) {
                        this.method4247((byte) -118, 167772160, var10, var11);
                        this.method4247((byte) -128, 536870912, var10, var11 + 1);
                        this.method4247((byte) -113, 8388608, var10 - 1, var11);
                    }
                    if (arg0 == 3) {
                        this.method4247((byte) -124, 671088640, var10, var11);
                        this.method4247((byte) -123, 8388608, var10 - 1, var11);
                        this.method4247((byte) -82, 33554432, var10, var11 - 1);
                        return;
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field8366[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 1522)
    public static void method4259(int arg0) {
        try {
            field8365 = null;
            field8360 = null;
            if (arg0 != -30756) {
                method4257(null);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8366[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZIIIIIZ)V", line = 1533)
    public final void method4260(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        try {
            field8359++;
            int var9 = 256;
            if (arg4 >= -12) {
                this.field8354 = -32;
            }
            if (arg1) {
                var9 |= 0x20000;
            }
            if (arg7) {
                var9 |= 0x40000000;
            }
            int var16 = arg6 - this.field8345;
            int var15 = arg0 - this.field8356;
            if (arg5 == 1 || arg5 == 3) {
                int var10 = arg3;
                arg3 = arg2;
                arg2 = var10;
            }
            for (int var11 = var16; var11 < var16 + arg3; var11++) {
                if (var11 >= 0 && this.field8354 > var11) {
                    for (int var12 = var15; var12 < (var15 + arg2); var12++) {
                        if (var12 >= 0 && var12 < this.field8350) {
                            this.method4252(-18576, var11, var9, var12);
                        }
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field8366[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)V", line = 1595)
    public final void method4261(int arg0, int arg1, int arg2) {
        try {
            if (arg2 == 13575) {
                int var7 = arg1 - this.field8345;
                int var6 = arg0 - this.field8356;
                field8352++;
                this.field8355[var7][var6] = class292.method2485(this.field8355[var7][var6], -2097153);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8366[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V", line = 1608)
    public final void method4262(int arg0, int arg1, int arg2) {
        try {
            int var6 = arg0 - this.field8356;
            if (arg2 != 4043) {
                this.field8354 = 66;
            }
            int var7 = arg1 - this.field8345;
            field8363++;
            this.field8355[var7][var6] = class553.method4099(this.field8355[var7][var6], 262144);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8366[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4263(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4264(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 22;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
