import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class593 {

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field8182 = -1;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "I")
    public int field8171;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public static int field8176;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public int field8177;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public static int field8178;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    public int field8184;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
    public int field8185;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "[[I")
    public int[][] field8191;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 3)
    public final void method3281(int arg0) {
        for (int var2 = arg0; var2 < this.field8171; var2++) {
            for (int var3 = 0; var3 < this.field8185; var3++) {
                if (var2 == 0 || var3 == 0 || this.field8171 - 5 <= var2 || this.field8185 - 5 <= var3) {
                    this.field8191[var2][var3] = -1;
                } else {
                    this.field8191[var2][var3] = 2097152;
                }
            }
        }
        field8170++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIII)Z", line = 31)
    public static final boolean method3282(int arg0, int arg1, int arg2, int arg3) {
        field8172++;
        class419.field5504.method363(arg0, arg2, arg3, class506.field6999);
        int var4 = class506.field6999[2];
        if (var4 < 50) {
            return false;
        }
        if (arg1 != -2) {
            field8182 = -5;
        }
        class506.field6999[1] = class506.field6999[1] * class374.field4962 / var4 + class195.field2676;
        class506.field6999[0] = class506.field6999[0] * class408.field5368 / var4 + class329.field4422;
        class506.field6999[2] = var4;
        return true;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)V", line = 55)
    public static final void method3283(byte arg0) {
        int var1 = 74 / ((arg0 + 2) / 40);
        class610.field8468.method1073(class115.field1469, class602.field8408.field4328 ? class279.field3681 + 256 << 2 : -1, 0);
        field8169++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IBII)V", line = 69)
    private final void method3284(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 51) {
            this.field8191[arg2][arg3] = class665.method3789(this.field8191[arg2][arg3], arg0);
            field8183++;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IZIIIIZI)V", line = 81)
    public final void method3285(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field8178++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg7 == 1 || arg7 == 3) {
            int var10 = arg3;
            arg3 = arg0;
            arg0 = var10;
        }
        int var11 = arg5 - this.field8177;
        if (arg6) {
            var9 |= 0x40000000;
        }
        int var12 = arg4 - this.field8184;
        if (arg2 <= 53) {
            return;
        }
        for (int var13 = var11; var13 < arg3 + var11; var13++) {
            if (var13 >= 0 && this.field8171 > var13) {
                for (int var14 = var12; var14 < arg0 + var12; var14++) {
                    if (var14 >= 0 && this.field8185 > var14) {
                        this.method3297(115, var9, var14, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIIII)Z", line = 142)
    public final boolean method3286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8187++;
        int var10 = 113 / ((arg5 + 52) / 46);
        if (arg6 > 1) {
            return class537.method3007(arg7, 14969, arg1, arg4, arg6, arg2, arg8, arg6, arg0) ? true : this.method3295(arg7, arg6, arg2, arg6, arg0, arg3, arg8, (byte) -115, arg1, arg4);
        }
        int var11 = arg7 + arg8 - 1;
        int var12 = arg0 + arg4 - 1;
        if (arg2 >= arg7 && arg2 <= var11 && arg1 >= arg4 && arg1 <= var12) {
            return true;
        } else if ((arg7 - 1) == arg2 && arg1 >= arg4 && var12 >= arg1 && (this.field8191[arg2 - this.field8177][arg1 - this.field8184] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg2 && arg4 <= arg1 && arg1 <= var12 && (this.field8191[arg2 - this.field8177][arg1 - this.field8184] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg1 && arg7 <= arg2 && var11 >= arg2 && (this.field8191[arg2 - this.field8177][arg1 - this.field8184] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else {
            return var12 + 1 == arg1 && arg2 >= arg7 && var11 >= arg2 && (this.field8191[arg2 - this.field8177][arg1 - this.field8184] & 0x20) == 0 && (arg3 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIII)Z", line = 182)
    public final boolean method3287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8190++;
        if (arg1 == 1) {
            if (arg0 == arg7 && arg2 == arg3) {
                return true;
            }
        } else if (arg7 <= arg0 && arg0 <= arg1 + arg7 - 1 && arg2 >= arg2 && arg2 + arg1 - 1 >= arg2) {
            return true;
        }
        int var9 = arg0 - this.field8177;
        int var10 = arg3 - this.field8184;
        int var11 = arg7 - this.field8177;
        int var12 = arg2 - this.field8184;
        if (arg1 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field8191[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field8191[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field8191[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field8191[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field8191[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field8191[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field8191[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field8191[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field8191[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var12 - 1) == var10 && (this.field8191[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field8191[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field8191[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var11 - 1;
            int var14 = var10 + arg1 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12 && (this.field8191[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 - arg1 == var10 && (this.field8191[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - arg1 == var11 && var12 >= var10 && var14 >= var12 && (this.field8191[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg1) == var10 && (this.field8191[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - arg1 == var11 && var12 >= var10 && var14 >= var12 && (this.field8191[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10 && (this.field8191[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var14 && (this.field8191[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field8191[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10 && (this.field8191[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var11 && var9 <= var13 && var12 - arg1 == var10 && (this.field8191[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg1 == var11 && var10 <= var12 && var12 <= var14 && (this.field8191[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var14 && (this.field8191[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (arg5 != 32) {
            this.method3291(true, -12, 11, (byte) 41, 16, -67, false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V", line = 370)
    public final void method3288(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field8177;
        if (arg0 != 20759) {
            this.method3292(32, -40, -15);
        }
        field8173++;
        int var5 = arg1 - this.field8184;
        this.field8191[var4][var5] = class15.method97(this.field8191[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(III)V", line = 395)
    public final void method3289(int arg0, int arg1, int arg2) {
        field8193++;
        int var4 = arg1 - this.field8177;
        int var5 = arg2 - this.field8184;
        this.field8191[var4][var5] = class665.method3789(this.field8191[var4][var5], 262144);
        if (arg0 != 1088) {
            this.field8177 = -41;
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(I)[Lrr;", line = 410)
    public static final class408[] method3290(int arg0) {
        if (arg0 != 805404864) {
            method3283((byte) -44);
        }
        field8189++;
        return new class408[] { class231.field3079, class68.field828, class510.field7085 };
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZIIBIIZ)V", line = 426)
    public final void method3291(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var8 = 88 % ((35 - arg3) / 42);
        field8174++;
        int var9 = 256;
        if (arg6) {
            var9 |= 0x20000;
        }
        if (arg0) {
            var9 |= 0x40000000;
        }
        int var10 = arg2 - this.field8184;
        int var11 = arg1 - this.field8177;
        for (int var12 = var11; var12 < (arg5 + var11); var12++) {
            if (var12 >= 0 && this.field8171 > var12) {
                for (int var13 = var10; var13 < arg4 + var10; var13++) {
                    if (var13 >= 0 && this.field8185 > var13) {
                        this.method3284(var9, (byte) 51, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "(III)V", line = 478)
    public final void method3292(int arg0, int arg1, int arg2) {
        if (arg2 != -24749) {
            this.method3281(-73);
        }
        field8186++;
        int var4 = arg1 - this.field8177;
        int var5 = arg0 - this.field8184;
        this.field8191[var4][var5] = class665.method3789(this.field8191[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(III)V", line = 491)
    public final void method3293(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field8177;
        field8181++;
        int var5 = arg0 - this.field8184;
        this.field8191[var4][var5] = class15.method97(this.field8191[var4][var5], -2097153);
        if (arg1 >= -72) {
            this.field8171 = 73;
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(IIIIIIII)Z", line = 504)
    public final boolean method3294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8180++;
        if (arg2 == 1) {
            if (arg4 == arg6 && arg1 == arg7) {
                return true;
            }
        } else if (arg4 >= arg6 && arg4 <= (arg2 + arg6 - 1) && arg1 >= arg1 && (arg1 + arg2 - 1) >= arg1) {
            return true;
        }
        int var9 = -118 / ((42 - arg5) / 47);
        int var10 = arg4 - this.field8177;
        int var11 = arg1 - this.field8184;
        int var12 = arg7 - this.field8184;
        int var13 = arg6 - this.field8177;
        if (arg2 == 1) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if (var10 - 1 == var13 && var11 == var12) {
                        return true;
                    }
                    if (var10 == var13 && (var11 + 1) == var12 && (this.field8191[var13][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var13 && (var11 - 1) == var12 && (this.field8191[var13][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 == var13 && (var11 + 1) == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 + 1) == var13 && var11 == var12) {
                        return true;
                    }
                    if (var10 == var13 && (var11 + 1) == var12 && (this.field8191[var13][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var13 && var11 - 1 == var12 && (this.field8191[var13][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 == var13 && var11 - 1 == var12) {
                        return true;
                    }
                    if (var10 - 1 == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if (var10 - 1 == var13 && var11 == var12) {
                        return true;
                    }
                    if (var10 == var13 && (var11 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var13 && var11 - 1 == var12 && (this.field8191[var13][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var13 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var13 && var11 == var12) {
                        return true;
                    }
                    if (var10 == var13 && (var11 - 1) == var12 && (this.field8191[var13][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - 1) == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var13 && (var11 + 1) == var12 && (this.field8191[var13][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var13 && var11 == var12) {
                        return true;
                    }
                    if (var10 == var13 && var11 - 1 == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 - 1 == var13 && var11 == var12) {
                        return true;
                    }
                    if (var10 == var13 && (var11 + 1) == var12 && (this.field8191[var13][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var13 && var11 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var10 == var13 && (var11 + 1) == var12 && (this.field8191[var13][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var13 && (var11 - 1) == var12 && (this.field8191[var13][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var13 && var11 == var12 && (this.field8191[var13][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg2 + var13 - 1;
            int var15 = arg2 + var12 - 1;
            if (arg3 == 0) {
                if (arg0 == 0) {
                    if (var10 - arg2 == var13 && var12 <= var11 && var15 >= var11) {
                        return true;
                    }
                    if (var10 >= var13 && var10 <= var14 && var11 + 1 == var12 && (this.field8191[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var13 && var10 <= var14 && (var11 - arg2) == var12 && (this.field8191[var10][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var13 <= var10 && var14 >= var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var10 - arg2 == var13 && var12 <= var11 && var11 <= var15 && (this.field8191[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var13 && var11 >= var12 && var11 <= var15 && (this.field8191[var13][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 + 1) == var13 && var12 <= var11 && var11 <= var15) {
                        return true;
                    }
                    if (var13 <= var10 && var10 <= var14 && var11 + 1 == var12 && (this.field8191[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var13 <= var10 && var10 <= var14 && var11 - arg2 == var12 && (this.field8191[var10][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 >= var13 && var14 >= var10 && (var11 - arg2) == var12) {
                        return true;
                    }
                    if (var10 - arg2 == var13 && var11 >= var12 && var11 <= var15 && (this.field8191[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var13 && var12 <= var11 && var11 <= var15 && (this.field8191[var13][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    if (var10 - arg2 == var13 && var12 <= var11 && var11 <= var15) {
                        return true;
                    }
                    if (var13 <= var10 && var14 >= var10 && var11 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var13 && var11 >= var12 && var11 <= var15 && (this.field8191[var13][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var13 && var14 >= var10 && var11 - arg2 == var12 && (this.field8191[var10][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - arg2 == var13 && var11 >= var12 && var15 >= var11 && (this.field8191[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var13 && var10 <= var14 && (var11 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var13 && var11 >= var12 && var11 <= var15) {
                        return true;
                    }
                    if (var10 >= var13 && var14 >= var10 && var11 - arg2 == var12 && (this.field8191[var10][var15] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - arg2) == var13 && var12 <= var11 && var15 >= var11 && (this.field8191[var14][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var13 && var14 >= var10 && var11 + 1 == var12 && (this.field8191[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var13 && var12 <= var11 && var15 >= var11) {
                        return true;
                    }
                    if (var13 <= var10 && var14 >= var10 && (var11 - arg2) == var12) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var10 - arg2) == var13 && var12 <= var11 && var11 <= var15) {
                        return true;
                    }
                    if (var10 >= var13 && var14 >= var10 && var11 + 1 == var12 && (this.field8191[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var13 && var12 <= var11 && var11 <= var15 && (this.field8191[var13][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var13 && var14 >= var10 && var11 - arg2 == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var13 <= var10 && var10 <= var14 && (var11 + 1) == var12 && (this.field8191[var10][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var13 && var10 <= var14 && var11 - arg2 == var12 && (this.field8191[var10][var15] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg2 == var13 && var11 >= var12 && var15 >= var11 && (this.field8191[var14][var11] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var13 && var11 >= var12 && var11 <= var15 && (this.field8191[var13][var11] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIIIIIBII)Z", line = 868)
    public final boolean method3295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field8176++;
        int var11 = arg2 + arg3;
        int var12 = arg8 + arg1;
        if (arg7 > -111) {
            return false;
        }
        int var13 = arg0 + arg6;
        int var14 = arg4 + arg9;
        if (arg2 == var13 && (arg5 & 0x2) == 0) {
            int var15 = arg8 > arg9 ? arg8 : arg9;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field8191[var13 - this.field8177 - 1][var15 - this.field8184] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg0 == var11 && (arg5 & 0x8) == 0) {
            int var17 = arg9 >= arg8 ? arg9 : arg8;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field8191[arg0 - this.field8177][var17 - this.field8184] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg8 == var14 && (arg5 & 0x1) == 0) {
            int var19 = arg0 >= arg2 ? arg0 : arg2;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field8191[var19 - this.field8177][var14 - this.field8184 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg9 == var12 && (arg5 & 0x4) == 0) {
            int var21 = arg2 <= arg0 ? arg0 : arg2;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field8191[var21 - this.field8177][arg9 - this.field8184] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZIIZIII)V", line = 960)
    public final void method3296(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg2 - this.field8177;
        field8179++;
        int var9 = arg1 - this.field8184;
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method3284(128, (byte) 51, var8, var9);
                this.method3284(8, (byte) 51, var8 - 1, var9);
            }
            if (arg6 == 1) {
                this.method3284(2, (byte) 51, var8, var9);
                this.method3284(32, (byte) 51, var8, var9 + 1);
            }
            if (arg6 == 2) {
                this.method3284(8, (byte) 51, var8, var9);
                this.method3284(128, (byte) 51, var8 + 1, var9);
            }
            if (arg6 == 3) {
                this.method3284(32, (byte) 51, var8, var9);
                this.method3284(2, (byte) 51, var8, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method3284(1, (byte) 51, var8, var9);
                this.method3284(16, (byte) 51, var8 - 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method3284(4, (byte) 51, var8, var9);
                this.method3284(64, (byte) 51, var8 + 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method3284(16, (byte) 51, var8, var9);
                this.method3284(1, (byte) 51, var8 + 1, var9 + -1);
            }
            if (arg6 == 3) {
                this.method3284(64, (byte) 51, var8, var9);
                this.method3284(4, (byte) 51, var8 - 1, var9 + -1);
            }
        }
        if (arg4 < 45) {
            return;
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                this.method3284(130, (byte) 51, var8, var9);
                this.method3284(8, (byte) 51, var8 - 1, var9);
                this.method3284(32, (byte) 51, var8, var9 + 1);
            }
            if (arg6 == 1) {
                this.method3284(10, (byte) 51, var8, var9);
                this.method3284(32, (byte) 51, var8, var9 + 1);
                this.method3284(128, (byte) 51, var8 + 1, var9);
            }
            if (arg6 == 2) {
                this.method3284(40, (byte) 51, var8, var9);
                this.method3284(128, (byte) 51, var8 + 1, var9);
                this.method3284(2, (byte) 51, var8, var9 - 1);
            }
            if (arg6 == 3) {
                this.method3284(160, (byte) 51, var8, var9);
                this.method3284(2, (byte) 51, var8, var9 - 1);
                this.method3284(8, (byte) 51, var8 - 1, var9);
            }
        }
        if (arg0) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    this.method3284(65536, (byte) 51, var8, var9);
                    this.method3284(4096, (byte) 51, var8 - 1, var9);
                }
                if (arg6 == 1) {
                    this.method3284(1024, (byte) 51, var8, var9);
                    this.method3284(16384, (byte) 51, var8, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method3284(4096, (byte) 51, var8, var9);
                    this.method3284(65536, (byte) 51, var8 + 1, var9);
                }
                if (arg6 == 3) {
                    this.method3284(16384, (byte) 51, var8, var9);
                    this.method3284(1024, (byte) 51, var8, var9 - 1);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg6 == 0) {
                    this.method3284(512, (byte) 51, var8, var9);
                    this.method3284(8192, (byte) 51, var8 - 1, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method3284(2048, (byte) 51, var8, var9);
                    this.method3284(32768, (byte) 51, var8 + 1, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method3284(8192, (byte) 51, var8, var9);
                    this.method3284(512, (byte) 51, var8 + 1, var9 + -1);
                }
                if (arg6 == 3) {
                    this.method3284(32768, (byte) 51, var8, var9);
                    this.method3284(2048, (byte) 51, var8 - 1, var9 + -1);
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    this.method3284(66560, (byte) 51, var8, var9);
                    this.method3284(4096, (byte) 51, var8 - 1, var9);
                    this.method3284(16384, (byte) 51, var8, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method3284(5120, (byte) 51, var8, var9);
                    this.method3284(16384, (byte) 51, var8, var9 + 1);
                    this.method3284(65536, (byte) 51, var8 + 1, var9);
                }
                if (arg6 == 2) {
                    this.method3284(20480, (byte) 51, var8, var9);
                    this.method3284(65536, (byte) 51, var8 + 1, var9);
                    this.method3284(1024, (byte) 51, var8, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method3284(81920, (byte) 51, var8, var9);
                    this.method3284(1024, (byte) 51, var8, var9 - 1);
                    this.method3284(4096, (byte) 51, var8 - 1, var9);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method3284(536870912, (byte) 51, var8, var9);
                this.method3284(33554432, (byte) 51, var8 - 1, var9);
            }
            if (arg6 == 1) {
                this.method3284(8388608, (byte) 51, var8, var9);
                this.method3284(134217728, (byte) 51, var8, var9 + 1);
            }
            if (arg6 == 2) {
                this.method3284(33554432, (byte) 51, var8, var9);
                this.method3284(536870912, (byte) 51, var8 + 1, var9);
            }
            if (arg6 == 3) {
                this.method3284(134217728, (byte) 51, var8, var9);
                this.method3284(8388608, (byte) 51, var8, var9 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method3284(4194304, (byte) 51, var8, var9);
                this.method3284(67108864, (byte) 51, var8 - 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method3284(16777216, (byte) 51, var8, var9);
                this.method3284(268435456, (byte) 51, var8 + 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method3284(67108864, (byte) 51, var8, var9);
                this.method3284(4194304, (byte) 51, var8 + 1, var9 - 1);
            }
            if (arg6 == 3) {
                this.method3284(268435456, (byte) 51, var8, var9);
                this.method3284(16777216, (byte) 51, var8 - 1, var9 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method3284(545259520, (byte) 51, var8, var9);
            this.method3284(33554432, (byte) 51, var8 - 1, var9);
            this.method3284(134217728, (byte) 51, var8, var9 + 1);
        }
        if (arg6 == 1) {
            this.method3284(41943040, (byte) 51, var8, var9);
            this.method3284(134217728, (byte) 51, var8, var9 + 1);
            this.method3284(536870912, (byte) 51, var8 + 1, var9);
        }
        if (arg6 == 2) {
            this.method3284(167772160, (byte) 51, var8, var9);
            this.method3284(536870912, (byte) 51, var8 + 1, var9);
            this.method3284(8388608, (byte) 51, var8, var9 - 1);
        }
        if (arg6 == 3) {
            this.method3284(671088640, (byte) 51, var8, var9);
            this.method3284(8388608, (byte) 51, var8, var9 - 1);
            this.method3284(33554432, (byte) 51, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "(IIII)V", line = 1269)
    private final void method3297(int arg0, int arg1, int arg2, int arg3) {
        this.field8191[arg3][arg2] = class15.method97(this.field8191[arg3][arg2], ~arg1);
        if (arg0 <= 112) {
            this.field8191 = null;
        }
        field8192++;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZIIIIZI)V", line = 1282)
    public final void method3298(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg3 - this.field8177;
        int var9 = arg4 - this.field8184;
        field8175++;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method3297(119, 128, var9, var8);
                this.method3297(arg6 - 29052, 8, var9, var8 - 1);
            }
            if (arg2 == 1) {
                this.method3297(124, 2, var9, var8);
                this.method3297(arg6 ^ 0x7198, 32, var9 + 1, var8);
            }
            if (arg2 == 2) {
                this.method3297(113, 8, var9, var8);
                this.method3297(122, 128, var9, var8 + 1);
            }
            if (arg2 == 3) {
                this.method3297(117, 32, var9, var8);
                this.method3297(121, 2, var9 - 1, var8);
            }
        }
        if (arg6 != 29165) {
            this.field8177 = 9;
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method3297(120, 1, var9, var8);
                this.method3297(arg6 - 29051, 16, var9 + 1, var8 + -1);
            }
            if (arg2 == 1) {
                this.method3297(120, 4, var9, var8);
                this.method3297(126, 64, var9 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method3297(126, 16, var9, var8);
                this.method3297(117, 1, var9 - 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method3297(113, 64, var9, var8);
                this.method3297(117, 4, var9 - 1, var8 + -1);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method3297(121, 130, var9, var8);
                this.method3297(arg6 ^ 0x7199, 8, var9, var8 - 1);
                this.method3297(127, 32, var9 + 1, var8);
            }
            if (arg2 == 1) {
                this.method3297(126, 10, var9, var8);
                this.method3297(126, 32, var9 + 1, var8);
                this.method3297(arg6 - 29046, 128, var9, var8 + 1);
            }
            if (arg2 == 2) {
                this.method3297(113, 40, var9, var8);
                this.method3297(116, 128, var9, var8 + 1);
                this.method3297(122, 2, var9 - 1, var8);
            }
            if (arg2 == 3) {
                this.method3297(122, 160, var9, var8);
                this.method3297(120, 2, var9 - 1, var8);
                this.method3297(118, 8, var9, var8 - 1);
            }
        }
        if (arg0) {
            if (arg1 == 0) {
                if (arg2 == 0) {
                    this.method3297(118, 65536, var9, var8);
                    this.method3297(arg6 ^ 0x7190, 4096, var9, var8 - 1);
                }
                if (arg2 == 1) {
                    this.method3297(126, 1024, var9, var8);
                    this.method3297(arg6 ^ 0x719E, 16384, var9 + 1, var8);
                }
                if (arg2 == 2) {
                    this.method3297(119, 4096, var9, var8);
                    this.method3297(arg6 ^ 0x719C, 65536, var9, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method3297(124, 16384, var9, var8);
                    this.method3297(127, 1024, var9 - 1, var8);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg2 == 0) {
                    this.method3297(126, 512, var9, var8);
                    this.method3297(116, 8192, var9 + 1, var8 + -1);
                }
                if (arg2 == 1) {
                    this.method3297(124, 2048, var9, var8);
                    this.method3297(120, 32768, var9 + 1, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method3297(arg6 ^ 0x719F, 8192, var9, var8);
                    this.method3297(124, 512, var9 - 1, var8 + 1);
                }
                if (arg2 == 3) {
                    this.method3297(120, 32768, var9, var8);
                    this.method3297(116, 2048, var9 - 1, var8 + -1);
                }
            }
            if (arg1 == 2) {
                if (arg2 == 0) {
                    this.method3297(arg6 ^ 0x7192, 66560, var9, var8);
                    this.method3297(116, 4096, var9, var8 - 1);
                    this.method3297(119, 16384, var9 + 1, var8);
                }
                if (arg2 == 1) {
                    this.method3297(123, 5120, var9, var8);
                    this.method3297(127, 16384, var9 + 1, var8);
                    this.method3297(arg6 ^ 0x7196, 65536, var9, var8 + 1);
                }
                if (arg2 == 2) {
                    this.method3297(115, 20480, var9, var8);
                    this.method3297(114, 65536, var9, var8 + 1);
                    this.method3297(arg6 ^ 0x7192, 1024, var9 - 1, var8);
                }
                if (arg2 == 3) {
                    this.method3297(113, 81920, var9, var8);
                    this.method3297(arg6 ^ 0x7193, 1024, var9 - 1, var8);
                    this.method3297(124, 4096, var9, var8 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method3297(113, 536870912, var9, var8);
                this.method3297(122, 33554432, var9, var8 - 1);
            }
            if (arg2 == 1) {
                this.method3297(arg6 ^ 0x7194, 8388608, var9, var8);
                this.method3297(arg6 ^ 0x7196, 134217728, var9 + 1, var8);
            }
            if (arg2 == 2) {
                this.method3297(arg6 ^ 0x7191, 33554432, var9, var8);
                this.method3297(119, 536870912, var9, var8 + 1);
            }
            if (arg2 == 3) {
                this.method3297(126, 134217728, var9, var8);
                this.method3297(118, 8388608, var9 - 1, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method3297(113, 4194304, var9, var8);
                this.method3297(121, 67108864, var9 + 1, var8 - 1);
            }
            if (arg2 == 1) {
                this.method3297(arg6 ^ 0x719A, 16777216, var9, var8);
                this.method3297(127, 268435456, var9 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method3297(126, 67108864, var9, var8);
                this.method3297(arg6 - 29047, 4194304, var9 - 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method3297(124, 268435456, var9, var8);
                this.method3297(115, 16777216, var9 - 1, var8 + -1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method3297(arg6 ^ 0x719F, 545259520, var9, var8);
            this.method3297(arg6 ^ 0x7196, 33554432, var9, var8 - 1);
            this.method3297(119, 134217728, var9 + 1, var8);
        }
        if (arg2 == 1) {
            this.method3297(121, 41943040, var9, var8);
            this.method3297(123, 134217728, var9 + 1, var8);
            this.method3297(116, 536870912, var9, var8 + 1);
        }
        if (arg2 == 2) {
            this.method3297(125, 167772160, var9, var8);
            this.method3297(126, 536870912, var9, var8 + 1);
            this.method3297(126, 8388608, var9 - 1, var8);
        }
        if (arg2 == 3) {
            this.method3297(122, 671088640, var9, var8);
            this.method3297(118, 8388608, var9 - 1, var8);
            this.method3297(arg6 ^ 0x7196, 33554432, var9, var8 - 1);
            return;
        }
    }
}
