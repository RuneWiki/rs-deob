import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class605 {

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lqfa;")
    public static class85 field8795 = new class85(102, 7);

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field8811 = 0;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field8794;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public int field8796;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public int field8801;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public int field8807;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public int field8810;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "[[I")
    public int[][] field8803;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method3468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8808++;
        int var11 = arg0 + arg7;
        int var12 = arg3 + arg8;
        if (arg5 != -1) {
            this.field8801 = 120;
        }
        int var13 = arg1 + arg9;
        int var14 = arg2 + arg4;
        if (arg7 == var13 && (arg6 & 0x2) == 0) {
            int var15 = arg3 > arg2 ? arg3 : arg2;
            int var16 = var12 < var14 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field8803[var13 - this.field8796 - 1][var15 - this.field8807] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg6 & 0x8) == 0) {
            int var17 = arg3 > arg2 ? arg3 : arg2;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var17 < var18) {
                if ((this.field8803[arg9 - this.field8796][var17 - this.field8807] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg3 == var14 && (arg6 & 0x1) == 0) {
            int var19 = arg7 <= arg9 ? arg9 : arg7;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field8803[var19 - this.field8796][var14 - this.field8807 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg6 & 0x4) == 0) {
            int var21 = arg9 < arg7 ? arg7 : arg9;
            int var22 = var11 < var13 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field8803[var21 - this.field8796][arg2 - this.field8807] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBIZIZ)V")
    public final void method3469(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field8796;
        field8794++;
        int var9 = arg5 - this.field8807;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method3472(var8, 128, var9, 117);
                this.method3472(var8 - 1, 8, var9, 110);
            }
            if (arg1 == 1) {
                this.method3472(var8, 2, var9, 110);
                this.method3472(var8, 32, var9 + 1, 126);
            }
            if (arg1 == 2) {
                this.method3472(var8, 8, var9, 113);
                this.method3472(var8 + 1, 128, var9, 110);
            }
            if (arg1 == 3) {
                this.method3472(var8, 32, var9, 111);
                this.method3472(var8, 2, var9 - 1, 115);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method3472(var8, 1, var9, 127);
                this.method3472(var8 - 1, 16, var9 + 1, 123);
            }
            if (arg1 == 1) {
                this.method3472(var8, 4, var9, 114);
                this.method3472(var8 + 1, 64, var9 + 1, 112);
            }
            if (arg1 == 2) {
                this.method3472(var8, 16, var9, 123);
                this.method3472(var8 + 1, 1, var9 - 1, 115);
            }
            if (arg1 == 3) {
                this.method3472(var8, 64, var9, 113);
                this.method3472(var8 - 1, 4, var9 - 1, 113);
            }
        }
        if (arg2 > -60) {
            return;
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method3472(var8, 130, var9, 110);
                this.method3472(var8 - 1, 8, var9, 120);
                this.method3472(var8, 32, var9 + 1, 126);
            }
            if (arg1 == 1) {
                this.method3472(var8, 10, var9, 119);
                this.method3472(var8, 32, var9 + 1, 121);
                this.method3472(var8 + 1, 128, var9, 125);
            }
            if (arg1 == 2) {
                this.method3472(var8, 40, var9, 113);
                this.method3472(var8 + 1, 128, var9, 112);
                this.method3472(var8, 2, var9 - 1, 119);
            }
            if (arg1 == 3) {
                this.method3472(var8, 160, var9, 110);
                this.method3472(var8, 2, var9 - 1, 119);
                this.method3472(var8 - 1, 8, var9, 116);
            }
        }
        if (arg6) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method3472(var8, 65536, var9, 112);
                    this.method3472(var8 - 1, 4096, var9, 115);
                }
                if (arg1 == 1) {
                    this.method3472(var8, 1024, var9, 120);
                    this.method3472(var8, 16384, var9 + 1, 120);
                }
                if (arg1 == 2) {
                    this.method3472(var8, 4096, var9, 121);
                    this.method3472(var8 + 1, 65536, var9, 115);
                }
                if (arg1 == 3) {
                    this.method3472(var8, 16384, var9, 123);
                    this.method3472(var8, 1024, var9 - 1, 119);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method3472(var8, 512, var9, 126);
                    this.method3472(var8 - 1, 8192, var9 + 1, 112);
                }
                if (arg1 == 1) {
                    this.method3472(var8, 2048, var9, 121);
                    this.method3472(var8 + 1, 32768, var9 + 1, 126);
                }
                if (arg1 == 2) {
                    this.method3472(var8, 8192, var9, 127);
                    this.method3472(var8 + 1, 512, var9 - 1, 124);
                }
                if (arg1 == 3) {
                    this.method3472(var8, 32768, var9, 122);
                    this.method3472(var8 - 1, 2048, var9 - 1, 115);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method3472(var8, 66560, var9, 113);
                    this.method3472(var8 - 1, 4096, var9, 123);
                    this.method3472(var8, 16384, var9 + 1, 114);
                }
                if (arg1 == 1) {
                    this.method3472(var8, 5120, var9, 115);
                    this.method3472(var8, 16384, var9 + 1, 126);
                    this.method3472(var8 + 1, 65536, var9, 121);
                }
                if (arg1 == 2) {
                    this.method3472(var8, 20480, var9, 126);
                    this.method3472(var8 + 1, 65536, var9, 109);
                    this.method3472(var8, 1024, var9 - 1, 112);
                }
                if (arg1 == 3) {
                    this.method3472(var8, 81920, var9, 127);
                    this.method3472(var8, 1024, var9 - 1, 113);
                    this.method3472(var8 - 1, 4096, var9, 110);
                }
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method3472(var8, 536870912, var9, 116);
                this.method3472(var8 - 1, 33554432, var9, 120);
            }
            if (arg1 == 1) {
                this.method3472(var8, 8388608, var9, 123);
                this.method3472(var8, 134217728, var9 + 1, 124);
            }
            if (arg1 == 2) {
                this.method3472(var8, 33554432, var9, 113);
                this.method3472(var8 + 1, 536870912, var9, 125);
            }
            if (arg1 == 3) {
                this.method3472(var8, 134217728, var9, 114);
                this.method3472(var8, 8388608, var9 - 1, 123);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method3472(var8, 4194304, var9, 121);
                this.method3472(var8 - 1, 67108864, var9 + 1, 111);
            }
            if (arg1 == 1) {
                this.method3472(var8, 16777216, var9, 122);
                this.method3472(var8 + 1, 268435456, var9 + 1, 123);
            }
            if (arg1 == 2) {
                this.method3472(var8, 67108864, var9, 111);
                this.method3472(var8 + 1, 4194304, var9 - 1, 113);
            }
            if (arg1 == 3) {
                this.method3472(var8, 268435456, var9, 113);
                this.method3472(var8 - 1, 16777216, var9 - 1, 125);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method3472(var8, 545259520, var9, 111);
            this.method3472(var8 - 1, 33554432, var9, 116);
            this.method3472(var8, 134217728, var9 + 1, 127);
        }
        if (arg1 == 1) {
            this.method3472(var8, 41943040, var9, 109);
            this.method3472(var8, 134217728, var9 + 1, 126);
            this.method3472(var8 + 1, 536870912, var9, 118);
        }
        if (arg1 == 2) {
            this.method3472(var8, 167772160, var9, 109);
            this.method3472(var8 + 1, 536870912, var9, 123);
            this.method3472(var8, 8388608, var9 - 1, 117);
        }
        if (arg1 == 3) {
            this.method3472(var8, 671088640, var9, 124);
            this.method3472(var8, 8388608, var9 - 1, 119);
            this.method3472(var8 - 1, 33554432, var9, 125);
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZI)Lvq;")
    public static final class430 method3470(byte arg0, boolean arg1, int arg2) {
        if (arg0 >= -59) {
            field8811 = 39;
        }
        field8812++;
        long var3 = (long) (arg2 | (arg1 ? Integer.MIN_VALUE : 0));
        return (class430) class243.field3672.method2596(var3, 83);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)V")
    public final void method3471(int arg0, byte arg1, int arg2) {
        field8805++;
        int var4 = arg2 - this.field8796;
        int var5 = arg0 - this.field8807;
        this.field8803[var4][var5] = class2.method189(this.field8803[var4][var5], 262144);
        if (arg1 <= 84) {
            method3481(106, 33, 27, false, 67);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
    private final void method3472(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 108) {
            this.field8796 = 58;
        }
        this.field8803[arg0][arg2] = class2.method189(this.field8803[arg0][arg2], arg1);
        field8798++;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIII)V")
    private final void method3473(int arg0, int arg1, int arg2, int arg3) {
        this.field8803[arg0][arg2] = class481.method2919(this.field8803[arg0][arg2], ~arg1);
        field8791++;
        if (arg3 != 2883842) {
            this.field8810 = -64;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
    public static final void method3474(int arg0, int arg1) {
        if (!class527.field7429.field2644) {
            arg0 = -1;
        }
        field8793++;
        if (class679.field9638 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class651 var2 = class589.field8478.method2249((byte) 111, arg0);
            class279 var3 = var2.method3719(true);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class604.field8775.method399(var3.method1842(), true, new Point(var2.field9388, var2.field9395), var3.method1850(), var3.method1846(), class699.field9853);
                class679.field9638 = arg0;
            }
        }
        if (arg0 == -1 && class679.field9638 != -1) {
            class604.field8775.method399(null, true, new Point(), -1, -1, class699.field9853);
            class679.field9638 = -1;
        }
        if (arg1 != 23637) {
            field8811 = 107;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIZIIIII)Z")
    public final boolean method3475(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8799++;
        if (arg6 > 1) {
            return class2.method187(arg4, arg2, arg8, 2, arg6, arg7, arg6, arg5, arg0) ? true : this.method3468(arg6, arg4, arg2, arg5, arg7, -1, arg1, arg8, arg6, arg0);
        }
        int var10 = arg0 + arg4 - 1;
        if (!arg3) {
            return false;
        }
        int var11 = arg2 + arg7 - 1;
        if (arg8 >= arg0 && arg8 <= var10 && arg5 >= arg2 && arg5 <= var11) {
            return true;
        } else if ((arg0 - 1) == arg8 && arg2 <= arg5 && arg5 <= var11 && (this.field8803[arg8 - this.field8796][arg5 - this.field8807] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg8 && arg5 >= arg2 && var11 >= arg5 && (this.field8803[arg8 - this.field8796][arg5 - this.field8807] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg5 && arg8 >= arg0 && arg8 <= var10 && (this.field8803[arg8 - this.field8796][arg5 - this.field8807] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg5 && arg8 >= arg0 && arg8 <= var10 && (this.field8803[arg8 - this.field8796][arg5 - this.field8807] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method3476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8802++;
        if (arg0 == 1) {
            if (arg1 == arg6 && arg2 == arg4) {
                return true;
            }
        } else if (arg6 <= arg1 && arg1 <= arg6 - (1 - arg0) && arg4 <= arg4 && arg4 <= arg0 + arg4 - 1) {
            return true;
        }
        int var9 = arg1 - this.field8796;
        int var10 = arg4 - this.field8807;
        if (arg7 > -6) {
            this.method3478(29, 12, 16, 90, 97, -3, 49, 27);
        }
        int var11 = arg2 - this.field8807;
        int var12 = arg6 - this.field8796;
        if (arg0 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var9 + 1 == var12 && var10 == var11 && (this.field8803[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field8803[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field8803[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field8803[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field8803[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field8803[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 + 1 == var12 && var10 == var11 && (this.field8803[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field8803[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field8803[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field8803[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var11 && (this.field8803[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 == var11 && (this.field8803[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var12 - 1;
            int var14 = var11 - (1 - arg0);
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if ((var9 + 1) == var12 && var11 <= var10 && var14 >= var10 && (this.field8803[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var10 - arg0) == var11 && (this.field8803[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var9 - arg0) == var12 && var10 >= var11 && var14 >= var10 && (this.field8803[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var10 - arg0 == var11 && (this.field8803[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var9 - arg0 == var12 && var10 >= var11 && var10 <= var14 && (this.field8803[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11 && (this.field8803[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var9 + 1 == var12 && var10 >= var11 && var10 <= var14 && (this.field8803[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var10 + 1) == var11 && (this.field8803[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11 && (this.field8803[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var12 && var9 <= var13 && (var10 - arg0) == var11 && (this.field8803[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg0 == var12 && var10 >= var11 && var14 >= var10 && (this.field8803[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 >= var11 && var10 <= var14 && (this.field8803[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIZZIII)V")
    public final void method3477(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field8789++;
        int var9 = 256;
        if (arg4) {
            var9 |= 0x20000;
        }
        if (arg3) {
            var9 |= 0x40000000;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg5;
            arg5 = arg1;
            arg1 = var10;
        }
        int var11 = arg6 - this.field8796;
        int var12 = arg7 - this.field8807;
        if (arg0 < 65) {
            return;
        }
        for (int var13 = var11; var13 < (arg5 + var11); var13++) {
            if (var13 >= 0 && this.field8801 > var13) {
                for (int var14 = var12; var14 < var12 + arg1; var14++) {
                    if (var14 >= 0 && var14 < this.field8810) {
                        this.method3473(var13, var9, var14, 2883842);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method3478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 < 5) {
            field8811 = -6;
        }
        field8804++;
        if (arg2 == 1) {
            if (arg0 == arg7 && arg3 == arg6) {
                return true;
            }
        } else if (arg0 >= arg7 && arg0 <= (arg2 + arg7 - 1) && arg3 >= arg3 && arg3 <= arg2 + arg3 - 1) {
            return true;
        }
        int var9 = arg3 - this.field8807;
        int var10 = arg0 - this.field8796;
        int var11 = arg6 - this.field8807;
        int var12 = arg7 - this.field8796;
        if (arg2 == 1) {
            if (arg1 == 0) {
                if (arg5 == 0) {
                    if (var10 - 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field8803[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field8803[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field8803[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field8803[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                    if (var10 - 1 == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field8803[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field8803[var12][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field8803[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 - 1) == var12 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field8803[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field8803[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field8803[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 == var11 && (this.field8803[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg2 - 1;
            int var14 = arg2 + var11 - 1;
            if (arg1 == 0) {
                if (arg5 == 0) {
                    if ((var10 - arg2) == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && (var9 + 1) == var11 && (this.field8803[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 - arg2 == var11 && (this.field8803[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var12 <= var10 && var13 >= var10 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var10 - arg2 == var12 && var9 >= var11 && var14 >= var9 && (this.field8803[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14 && (this.field8803[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 + 1 == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 + 1) == var11 && (this.field8803[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 - arg2) == var11 && (this.field8803[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var12 <= var10 && var13 >= var10 && var9 - arg2 == var11) {
                        return true;
                    }
                    if ((var10 - arg2) == var12 && var9 >= var11 && var9 <= var14 && (this.field8803[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var14 >= var9 && (this.field8803[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 2) {
                if (arg5 == 0) {
                    if ((var10 - arg2) == var12 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && (var9 + 1) == var11) {
                        return true;
                    }
                    if (var10 + 1 == var12 && var11 <= var9 && var14 >= var9 && (this.field8803[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 - arg2 == var11 && (this.field8803[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - arg2 == var12 && var11 <= var9 && var14 >= var9 && (this.field8803[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var13 >= var10 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 - arg2) == var11 && (this.field8803[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg2 == var12 && var9 >= var11 && var9 <= var14 && (this.field8803[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field8803[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 - arg2 == var11) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 - arg2 == var12 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var13 && var9 + 1 == var11 && (this.field8803[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9 && (this.field8803[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 - arg2 == var11) {
                        return true;
                    }
                }
            }
            if (arg1 == 9) {
                if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field8803[var10][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var12 && var13 >= var10 && (var9 - arg2) == var11 && (this.field8803[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg2 == var12 && var11 <= var9 && var14 >= var9 && (this.field8803[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 <= var9 && var14 >= var9 && (this.field8803[var12][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIB)V")
    public final void method3479(int arg0, int arg1, byte arg2) {
        if (arg2 != 17) {
            this.method3475(35, 77, -97, false, -16, 85, -127, -128, 99);
        }
        int var4 = arg1 - this.field8807;
        int var5 = arg0 - this.field8796;
        field8813++;
        this.field8803[var5][var4] = class481.method2919(this.field8803[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public final void method3480(byte arg0) {
        int var2 = -86 / ((3 - arg0) / 62);
        for (int var3 = 0; var3 < this.field8801; var3++) {
            for (int var4 = 0; var4 < this.field8810; var4++) {
                if (var3 == 0 || var4 == 0 || (this.field8801 - 5) <= var3 || var4 >= this.field8810 - 5) {
                    this.field8803[var3][var4] = -1;
                } else {
                    this.field8803[var3][var4] = 2097152;
                }
            }
        }
        field8806++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIZI)Llc;")
    public static final class601 method3481(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field8814++;
        class601 var5 = new class601();
        var5.field8611 = arg0;
        var5.field8614 = arg4;
        class78.field1572.method2598(var5, (long) arg2, (byte) 8);
        class295.method1965(arg1 ^ 0xFFFFFF88, arg4);
        if (arg1 != -1) {
            return null;
        }
        class545 var6 = class415.method2533((byte) -110, arg2);
        if (var6 != null) {
            class531.method3088(var6, (byte) 96);
        }
        if (class265.field3940 != null) {
            class531.method3088(class265.field3940, (byte) 49);
            class265.field3940 = null;
        }
        class646.method3687(true);
        if (var6 != null) {
            class367.method2321(!arg3, (byte) -41, var6);
        }
        if (!arg3) {
            class683.method3845(arg4);
        }
        if (!arg3 && class361.field5368 != -1) {
            class467.method2786(class361.field5368, arg1 + 32769, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZZIIII)V")
    public final void method3482(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -21) {
            field8811 = 26;
        }
        int var8 = arg3 - this.field8796;
        field8790++;
        int var9 = arg4 - this.field8807;
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method3473(var8, 128, var9, arg0 + 2883863);
                this.method3473(var8 - 1, 8, var9, 2883842);
            }
            if (arg5 == 1) {
                this.method3473(var8, 2, var9, 2883842);
                this.method3473(var8, 32, var9 + 1, 2883842);
            }
            if (arg5 == 2) {
                this.method3473(var8, 8, var9, 2883842);
                this.method3473(var8 + 1, 128, var9, arg0 ^ 0xFFD3FEE9);
            }
            if (arg5 == 3) {
                this.method3473(var8, 32, var9, 2883842);
                this.method3473(var8, 2, var9 - 1, 2883842);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method3473(var8, 1, var9, 2883842);
                this.method3473(var8 - 1, 16, var9 + 1, 2883842);
            }
            if (arg5 == 1) {
                this.method3473(var8, 4, var9, 2883842);
                this.method3473(var8 + 1, 64, var9 + 1, 2883842);
            }
            if (arg5 == 2) {
                this.method3473(var8, 16, var9, 2883842);
                this.method3473(var8 + 1, 1, var9 - 1, arg0 ^ 0xFFD3FEE9);
            }
            if (arg5 == 3) {
                this.method3473(var8, 64, var9, 2883842);
                this.method3473(var8 - 1, 4, var9 - 1, 2883842);
            }
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                this.method3473(var8, 130, var9, 2883842);
                this.method3473(var8 - 1, 8, var9, arg0 ^ 0xFFD3FEE9);
                this.method3473(var8, 32, var9 + 1, 2883842);
            }
            if (arg5 == 1) {
                this.method3473(var8, 10, var9, 2883842);
                this.method3473(var8, 32, var9 + 1, 2883842);
                this.method3473(var8 + 1, 128, var9, 2883842);
            }
            if (arg5 == 2) {
                this.method3473(var8, 40, var9, 2883842);
                this.method3473(var8 + 1, 128, var9, arg0 + 2883863);
                this.method3473(var8, 2, var9 - 1, arg0 ^ 0xFFD3FEE9);
            }
            if (arg5 == 3) {
                this.method3473(var8, 160, var9, 2883842);
                this.method3473(var8, 2, var9 - 1, arg0 + 2883863);
                this.method3473(var8 - 1, 8, var9, 2883842);
            }
        }
        if (arg1) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    this.method3473(var8, 65536, var9, 2883842);
                    this.method3473(var8 - 1, 4096, var9, arg0 ^ 0xFFD3FEE9);
                }
                if (arg5 == 1) {
                    this.method3473(var8, 1024, var9, 2883842);
                    this.method3473(var8, 16384, var9 + 1, 2883842);
                }
                if (arg5 == 2) {
                    this.method3473(var8, 4096, var9, 2883842);
                    this.method3473(var8 + 1, 65536, var9, 2883842);
                }
                if (arg5 == 3) {
                    this.method3473(var8, 16384, var9, 2883842);
                    this.method3473(var8, 1024, var9 - 1, arg0 ^ 0xFFD3FEE9);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg5 == 0) {
                    this.method3473(var8, 512, var9, 2883842);
                    this.method3473(var8 - 1, 8192, var9 + 1, 2883842);
                }
                if (arg5 == 1) {
                    this.method3473(var8, 2048, var9, 2883842);
                    this.method3473(var8 + 1, 32768, var9 + 1, 2883842);
                }
                if (arg5 == 2) {
                    this.method3473(var8, 8192, var9, 2883842);
                    this.method3473(var8 + 1, 512, var9 - 1, 2883842);
                }
                if (arg5 == 3) {
                    this.method3473(var8, 32768, var9, 2883842);
                    this.method3473(var8 - 1, 2048, var9 - 1, 2883842);
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    this.method3473(var8, 66560, var9, 2883842);
                    this.method3473(var8 - 1, 4096, var9, 2883842);
                    this.method3473(var8, 16384, var9 + 1, 2883842);
                }
                if (arg5 == 1) {
                    this.method3473(var8, 5120, var9, 2883842);
                    this.method3473(var8, 16384, var9 + 1, 2883842);
                    this.method3473(var8 + 1, 65536, var9, 2883842);
                }
                if (arg5 == 2) {
                    this.method3473(var8, 20480, var9, arg0 + 2883863);
                    this.method3473(var8 + 1, 65536, var9, 2883842);
                    this.method3473(var8, 1024, var9 - 1, 2883842);
                }
                if (arg5 == 3) {
                    this.method3473(var8, 81920, var9, 2883842);
                    this.method3473(var8, 1024, var9 - 1, 2883842);
                    this.method3473(var8 - 1, 4096, var9, 2883842);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method3473(var8, 536870912, var9, 2883842);
                this.method3473(var8 - 1, 33554432, var9, 2883842);
            }
            if (arg5 == 1) {
                this.method3473(var8, 8388608, var9, 2883842);
                this.method3473(var8, 134217728, var9 + 1, 2883842);
            }
            if (arg5 == 2) {
                this.method3473(var8, 33554432, var9, 2883842);
                this.method3473(var8 + 1, 536870912, var9, 2883842);
            }
            if (arg5 == 3) {
                this.method3473(var8, 134217728, var9, 2883842);
                this.method3473(var8, 8388608, var9 - 1, arg0 + 2883863);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method3473(var8, 4194304, var9, 2883842);
                this.method3473(var8 - 1, 67108864, var9 + 1, 2883842);
            }
            if (arg5 == 1) {
                this.method3473(var8, 16777216, var9, 2883842);
                this.method3473(var8 + 1, 268435456, var9 + 1, arg0 + 2883863);
            }
            if (arg5 == 2) {
                this.method3473(var8, 67108864, var9, 2883842);
                this.method3473(var8 + 1, 4194304, var9 - 1, 2883842);
            }
            if (arg5 == 3) {
                this.method3473(var8, 268435456, var9, 2883842);
                this.method3473(var8 - 1, 16777216, var9 - 1, arg0 + 2883863);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method3473(var8, 545259520, var9, 2883842);
            this.method3473(var8 - 1, 33554432, var9, arg0 + 2883863);
            this.method3473(var8, 134217728, var9 + 1, 2883842);
        }
        if (arg5 == 1) {
            this.method3473(var8, 41943040, var9, 2883842);
            this.method3473(var8, 134217728, var9 + 1, 2883842);
            this.method3473(var8 + 1, 536870912, var9, 2883842);
        }
        if (arg5 == 2) {
            this.method3473(var8, 167772160, var9, arg0 ^ 0xFFD3FEE9);
            this.method3473(var8 + 1, 536870912, var9, arg0 ^ 0xFFD3FEE9);
            this.method3473(var8, 8388608, var9 - 1, 2883842);
        }
        if (arg5 == 3) {
            this.method3473(var8, 671088640, var9, 2883842);
            this.method3473(var8, 8388608, var9 - 1, arg0 + 2883863);
            this.method3473(var8 - 1, 33554432, var9, arg0 + 2883863);
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public final void method3483(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field8796;
        int var5 = arg2 - this.field8807;
        field8800++;
        this.field8803[var4][var5] = class2.method189(this.field8803[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILqh;)Lgb;")
    public static final class198 method3484(int arg0, class61 arg1) {
        if (arg0 == 27865) {
            field8809++;
            return new class198(arg1.method721(-461515024), arg1.method721(arg0 - 461542889), arg1.method721(-461515024), arg1.method721(-461515024), arg1.method740((byte) 108), arg1.method740((byte) 109), arg1.method732(-559537960));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
    public final void method3485(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field8807;
        int var5 = arg1 - this.field8796;
        field8792++;
        this.field8803[var5][var4] = class481.method2919(this.field8803[var5][var4], -2097153);
        if (arg0 > -92) {
            method3474(90, 105);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public static void method3486(boolean arg0) {
        if (arg0) {
            field8795 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZIZIII)V")
    public final void method3487(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field8797++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var9 = arg5 - this.field8807;
        if (arg2 != 128) {
            this.field8801 = 109;
        }
        int var10 = arg6 - this.field8796;
        for (int var11 = var10; var11 < (var10 + arg4); var11++) {
            if (var11 >= 0 && this.field8801 > var11) {
                for (int var12 = var9; var12 < (var9 + arg0); var12++) {
                    if (var12 >= 0 && this.field8810 > var12) {
                        this.method3472(var11, var8, var12, 112);
                    }
                }
            }
        }
    }
}
