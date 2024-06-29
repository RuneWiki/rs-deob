import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class370 {

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field5687 = 0;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "F")
    public static float field5683;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public int field5669;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public int field5681;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public int field5686;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!wq", name = "x", descriptor = "I")
    public int field5692;

    @OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!wq", name = "A", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "[[I")
    public int[][] field5678;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIB)V")
    public final void method2304(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field5669;
        if (arg2 < 6) {
            this.field5692 = -118;
        }
        int var5 = arg1 - this.field5692;
        field5677++;
        this.field5678[var5][var4] = class286.method1860(this.field5678[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIZZI)Las;")
    public static final class407 method2305(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field5676++;
        class407 var5 = new class407();
        var5.field6156 = arg0;
        var5.field6155 = arg1;
        class27.field449.method940((long) arg4, -39, var5);
        class458.method2755(arg1, -25377);
        class499 var6 = class211.method1457(arg4, 6687);
        if (var6 != null) {
            class338.method2189((byte) 87, var6);
        }
        if (class112.field1571 != null) {
            class338.method2189((byte) 110, class112.field1571);
            class112.field1571 = null;
        }
        class450.method2716(26);
        if (var6 != null) {
            class57.method387(var6, !arg3, -16180);
        }
        if (arg2) {
            field5687 = -6;
        }
        if (!arg3) {
            class291.method1878(arg1);
        }
        if (!arg3 && class329.field5062 != -1) {
            class336.method2169(class329.field5062, 22590, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIZZI)V")
    public final void method2306(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field5684++;
        if (arg2 != -3) {
            this.method2310(121, 13, 69);
        }
        int var9 = 256;
        if (arg5) {
            var9 |= 0x20000;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var10 = arg7;
            arg7 = arg4;
            arg4 = var10;
        }
        int var11 = arg1 - this.field5692;
        int var12 = arg0 - this.field5669;
        if (arg6) {
            var9 |= 0x40000000;
        }
        for (int var13 = var11; var13 < arg7 + var11; var13++) {
            if (var13 >= 0 && var13 < this.field5681) {
                for (int var14 = var12; var14 < var12 + arg4; var14++) {
                    if (var14 >= 0 && var14 < this.field5686) {
                        this.method2309(var14, var9, var13, arg2 ^ 0xFFFFFFFC);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method2307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5689++;
        if (arg4 == 1) {
            if (arg0 == arg3 && arg5 == arg7) {
                return true;
            }
        } else if (arg3 <= arg0 && (arg3 + arg4 - 1) >= arg0 && arg7 <= arg7 && arg4 + arg7 - 1 >= arg7) {
            return true;
        }
        int var9 = arg3 - this.field5692;
        if (arg1 > -74) {
            return true;
        }
        int var10 = arg5 - this.field5669;
        int var11 = arg7 - this.field5669;
        int var12 = arg0 - this.field5692;
        if (arg4 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field5678[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field5678[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var12 - 1) == var9 && var10 == var11 && (this.field5678[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var11 - 1) == var10 && (this.field5678[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field5678[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field5678[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field5678[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field5678[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field5678[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field5678[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field5678[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var10 == var11 && (this.field5678[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg4 - 1;
            int var14 = var10 + arg4 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var12 + 1 == var9 && var11 >= var10 && var14 >= var11 && (this.field5678[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 - arg4) == var10 && (this.field5678[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - arg4 == var9 && var10 <= var11 && var11 <= var14 && (this.field5678[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var11 - arg4) == var10 && (this.field5678[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - arg4 == var9 && var11 >= var10 && var11 <= var14 && (this.field5678[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field5678[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 + 1) == var9 && var11 >= var10 && var14 >= var11 && (this.field5678[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var12 && var12 <= var13 && (var11 + 1) == var10 && (this.field5678[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 <= var12 && var12 <= var13 && var11 + 1 == var10 && (this.field5678[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var12 && var12 <= var13 && (var11 - arg4) == var10 && (this.field5678[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg4) == var9 && var11 >= var10 && var11 <= var14 && (this.field5678[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var9 && var11 >= var10 && var11 <= var14 && (this.field5678[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIBIIII)Z")
    public final boolean method2308(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field5682++;
        if (arg3 != -78) {
            return true;
        }
        if (arg6 == 1) {
            if (arg2 == arg7 && arg1 == arg5) {
                return true;
            }
        } else if (arg2 <= arg7 && arg6 + arg2 - 1 >= arg7 && arg1 >= arg1 && arg1 <= (arg6 + arg1 - 1)) {
            return true;
        }
        int var9 = arg5 - this.field5669;
        int var10 = arg1 - this.field5669;
        int var11 = arg7 - this.field5692;
        int var12 = arg2 - this.field5692;
        if (arg6 == 1) {
            if (arg0 == 0) {
                if (arg4 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field5678[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field5678[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field5678[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field5678[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                    if (var11 - 1 == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg4 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field5678[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field5678[var12][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field5678[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field5678[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 == var12 && (var10 + 1) == var9 && (this.field5678[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var10 - 1) == var9 && (this.field5678[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var9 == var10 && (this.field5678[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg6 + var12 - 1;
            int var14 = arg6 + var9 - 1;
            if (arg0 == 0) {
                if (arg4 == 0) {
                    if ((var11 - arg6) == var12 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var10 + 1) == var9 && (this.field5678[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var10 - arg6 == var9 && (this.field5678[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 <= var11 && var11 <= var13 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var11 - arg6) == var12 && var9 <= var10 && var14 >= var10 && (this.field5678[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 >= var9 && var10 <= var14 && (this.field5678[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 + 1) == var12 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 + 1) == var9 && (this.field5678[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && var10 - arg6 == var9 && (this.field5678[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 <= var11 && var13 >= var11 && (var10 - arg6) == var9) {
                        return true;
                    }
                    if ((var11 - arg6) == var12 && var10 >= var9 && var14 >= var10 && (this.field5678[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var14 >= var10 && (this.field5678[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg4 == 0) {
                    if (var11 - arg6 == var12 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 <= var10 && var10 <= var14 && (this.field5678[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var10 - arg6) == var9 && (this.field5678[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - arg6 == var12 && var9 <= var10 && var10 <= var14 && (this.field5678[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var10 - arg6 == var9 && (this.field5678[var11][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - arg6) == var12 && var10 >= var9 && var14 >= var10 && (this.field5678[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var10 + 1) == var9 && (this.field5678[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 - arg6 == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 - arg6 == var12 && var9 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 + 1 == var9 && (this.field5678[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 <= var10 && var10 <= var14 && (this.field5678[var12][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var10 - arg6 == var9) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 >= var12 && var13 >= var11 && var10 + 1 == var9 && (this.field5678[var11][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 >= var12 && var11 <= var13 && (var10 - arg6) == var9 && (this.field5678[var11][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var11 - arg6) == var12 && var9 <= var10 && var14 >= var10 && (this.field5678[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var10 >= var9 && var10 <= var14 && (this.field5678[var12][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIII)V")
    private final void method2309(int arg0, int arg1, int arg2, int arg3) {
        this.field5678[arg2][arg0] = class494.method2942(this.field5678[arg2][arg0], ~arg1);
        if (arg3 == 1) {
            field5693++;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
    public final void method2310(int arg0, int arg1, int arg2) {
        field5691++;
        if (arg1 != 20085) {
            this.method2307(40, -94, -74, 4, -128, 38, 0, -51);
        }
        int var4 = arg0 - this.field5669;
        int var5 = arg2 - this.field5692;
        this.field5678[var5][var4] = class494.method2942(this.field5678[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZZII)Ljava/lang/String;")
    public static final String method2311(boolean arg0, boolean arg1, int arg2, int arg3) {
        field5672++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg0 && arg3 >= 0) {
            int var4 = 2;
            for (int var5 = arg3 / arg2; var5 != 0; var5 /= arg2) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg2;
                int var9 = var8 - (arg2 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            if (!arg1) {
                method2314(null, 38);
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZZIIIZ)V")
    public final void method2312(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg4 - this.field5692;
        int var9 = arg0 - this.field5669;
        field5685++;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method2309(var9, 128, var8, 1);
                this.method2309(var9, 8, var8 - 1, 1);
            }
            if (arg5 == 1) {
                this.method2309(var9, 2, var8, 1);
                this.method2309(var9 + 1, 32, var8, 1);
            }
            if (arg5 == 2) {
                this.method2309(var9, 8, var8, 1);
                this.method2309(var9, 128, var8 + 1, 1);
            }
            if (arg5 == 3) {
                this.method2309(var9, 32, var8, 1);
                this.method2309(var9 - 1, 2, var8, 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method2309(var9, 1, var8, 1);
                this.method2309(var9 + 1, 16, var8 - 1, 1);
            }
            if (arg5 == 1) {
                this.method2309(var9, 4, var8, 1);
                this.method2309(var9 + 1, 64, var8 + 1, 1);
            }
            if (arg5 == 2) {
                this.method2309(var9, 16, var8, 1);
                this.method2309(var9 - 1, 1, var8 + 1, 1);
            }
            if (arg5 == 3) {
                this.method2309(var9, 64, var8, 1);
                this.method2309(var9 - 1, 4, var8 - 1, 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method2309(var9, 130, var8, 1);
                this.method2309(var9, 8, var8 - 1, 1);
                this.method2309(var9 + 1, 32, var8, 1);
            }
            if (arg5 == 1) {
                this.method2309(var9, 10, var8, 1);
                this.method2309(var9 + 1, 32, var8, 1);
                this.method2309(var9, 128, var8 + 1, 1);
            }
            if (arg5 == 2) {
                this.method2309(var9, 40, var8, 1);
                this.method2309(var9, 128, var8 + 1, 1);
                this.method2309(var9 - 1, 2, var8, 1);
            }
            if (arg5 == 3) {
                this.method2309(var9, 160, var8, 1);
                this.method2309(var9 - 1, 2, var8, 1);
                this.method2309(var9, 8, var8 - 1, 1);
            }
        }
        if (arg1) {
            this.method2308(46, 17, 39, (byte) 55, 0, -17, -109, -88);
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg5 == 0) {
                    this.method2309(var9, 65536, var8, 1);
                    this.method2309(var9, 4096, var8 - 1, 1);
                }
                if (arg5 == 1) {
                    this.method2309(var9, 1024, var8, 1);
                    this.method2309(var9 + 1, 16384, var8, 1);
                }
                if (arg5 == 2) {
                    this.method2309(var9, 4096, var8, 1);
                    this.method2309(var9, 65536, var8 + 1, 1);
                }
                if (arg5 == 3) {
                    this.method2309(var9, 16384, var8, 1);
                    this.method2309(var9 - 1, 1024, var8, 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg5 == 0) {
                    this.method2309(var9, 512, var8, 1);
                    this.method2309(var9 + 1, 8192, var8 - 1, 1);
                }
                if (arg5 == 1) {
                    this.method2309(var9, 2048, var8, 1);
                    this.method2309(var9 + 1, 32768, var8 + 1, 1);
                }
                if (arg5 == 2) {
                    this.method2309(var9, 8192, var8, 1);
                    this.method2309(var9 - 1, 512, var8 + 1, 1);
                }
                if (arg5 == 3) {
                    this.method2309(var9, 32768, var8, 1);
                    this.method2309(var9 - 1, 2048, var8 - 1, 1);
                }
            }
            if (arg3 == 2) {
                if (arg5 == 0) {
                    this.method2309(var9, 66560, var8, 1);
                    this.method2309(var9, 4096, var8 - 1, 1);
                    this.method2309(var9 + 1, 16384, var8, 1);
                }
                if (arg5 == 1) {
                    this.method2309(var9, 5120, var8, 1);
                    this.method2309(var9 + 1, 16384, var8, 1);
                    this.method2309(var9, 65536, var8 + 1, 1);
                }
                if (arg5 == 2) {
                    this.method2309(var9, 20480, var8, 1);
                    this.method2309(var9, 65536, var8 + 1, 1);
                    this.method2309(var9 - 1, 1024, var8, 1);
                }
                if (arg5 == 3) {
                    this.method2309(var9, 81920, var8, 1);
                    this.method2309(var9 - 1, 1024, var8, 1);
                    this.method2309(var9, 4096, var8 - 1, 1);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method2309(var9, 536870912, var8, 1);
                this.method2309(var9, 33554432, var8 - 1, 1);
            }
            if (arg5 == 1) {
                this.method2309(var9, 8388608, var8, 1);
                this.method2309(var9 + 1, 134217728, var8, 1);
            }
            if (arg5 == 2) {
                this.method2309(var9, 33554432, var8, 1);
                this.method2309(var9, 536870912, var8 + 1, 1);
            }
            if (arg5 == 3) {
                this.method2309(var9, 134217728, var8, 1);
                this.method2309(var9 - 1, 8388608, var8, 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method2309(var9, 4194304, var8, 1);
                this.method2309(var9 + 1, 67108864, var8 - 1, 1);
            }
            if (arg5 == 1) {
                this.method2309(var9, 16777216, var8, 1);
                this.method2309(var9 + 1, 268435456, var8 + 1, 1);
            }
            if (arg5 == 2) {
                this.method2309(var9, 67108864, var8, 1);
                this.method2309(var9 - 1, 4194304, var8 + 1, 1);
            }
            if (arg5 == 3) {
                this.method2309(var9, 268435456, var8, 1);
                this.method2309(var9 - 1, 16777216, var8 - 1, 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method2309(var9, 545259520, var8, 1);
            this.method2309(var9, 33554432, var8 - 1, 1);
            this.method2309(var9 + 1, 134217728, var8, 1);
        }
        if (arg5 == 1) {
            this.method2309(var9, 41943040, var8, 1);
            this.method2309(var9 + 1, 134217728, var8, 1);
            this.method2309(var9, 536870912, var8 + 1, 1);
        }
        if (arg5 == 2) {
            this.method2309(var9, 167772160, var8, 1);
            this.method2309(var9, 536870912, var8 + 1, 1);
            this.method2309(var9 - 1, 8388608, var8, 1);
        }
        if (arg5 == 3) {
            this.method2309(var9, 671088640, var8, 1);
            this.method2309(var9 - 1, 8388608, var8, 1);
            this.method2309(var9, 33554432, var8 - 1, 1);
            return;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIZIIIIII)Z")
    public final boolean method2313(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5670++;
        int var11 = arg0 + arg1;
        if (!arg3) {
            method2314(null, -27);
        }
        int var12 = arg5 + arg6;
        int var13 = arg2 + arg9;
        int var14 = arg7 + arg8;
        if (arg0 == var13 && (arg4 & 0x2) == 0) {
            int var15 = arg7 >= arg5 ? arg7 : arg5;
            int var16 = var14 > var12 ? var12 : var14;
            while (var15 < var16) {
                if ((this.field5678[var13 - this.field5692 - 1][var15 - this.field5669] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg4 & 0x8) == 0) {
            int var17 = arg7 >= arg5 ? arg7 : arg5;
            int var18 = var14 <= var12 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field5678[arg9 - this.field5692][var17 - this.field5669] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg5 == var14 && (arg4 & 0x1) == 0) {
            int var19 = arg9 < arg0 ? arg0 : arg9;
            int var20 = var13 > var11 ? var11 : var13;
            while (var19 < var20) {
                if ((this.field5678[var19 - this.field5692][var14 - this.field5669 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg7 == var12 && (arg4 & 0x4) == 0) {
            int var21 = arg0 > arg9 ? arg0 : arg9;
            int var22 = var11 < var13 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field5678[var21 - this.field5692][arg7 - this.field5669] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2314(String arg0, int arg1) {
        System.out.println("Error: " + class356.method2246(arg0, "\n", -1, "%0a"));
        if (arg1 > -76) {
            field5687 = 59;
        }
        field5688++;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIZZIII)V")
    public final void method2315(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field5695++;
        int var8 = 256;
        if (arg3) {
            var8 |= 0x20000;
        }
        if (arg2) {
            var8 |= 0x40000000;
        }
        int var9 = arg5 - this.field5692;
        int var10 = arg0 - this.field5669;
        for (int var11 = var9; var11 < (arg4 + var9); var11++) {
            if (var11 >= 0 && this.field5681 > var11) {
                for (int var12 = var10; var12 < (arg6 + var10); var12++) {
                    if (var12 >= 0 && this.field5686 > var12) {
                        this.method2318(var12, true, var8, var11);
                    }
                }
            }
        }
        if (arg1 != -1) {
            field5687 = 45;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIZIIZI)V")
    public final void method2316(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg1 - this.field5692;
        field5675++;
        if (arg3 > -50) {
            return;
        }
        int var9 = arg6 - this.field5669;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method2318(var9, true, 128, var8);
                this.method2318(var9, true, 8, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2318(var9, true, 2, var8);
                this.method2318(var9 + 1, true, 32, var8);
            }
            if (arg0 == 2) {
                this.method2318(var9, true, 8, var8);
                this.method2318(var9, true, 128, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2318(var9, true, 32, var8);
                this.method2318(var9 - 1, true, 2, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method2318(var9, true, 1, var8);
                this.method2318(var9 + 1, true, 16, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2318(var9, true, 4, var8);
                this.method2318(var9 + 1, true, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2318(var9, true, 16, var8);
                this.method2318(var9 - 1, true, 1, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2318(var9, true, 64, var8);
                this.method2318(var9 - 1, true, 4, var8 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg0 == 0) {
                this.method2318(var9, true, 130, var8);
                this.method2318(var9, true, 8, var8 - 1);
                this.method2318(var9 + 1, true, 32, var8);
            }
            if (arg0 == 1) {
                this.method2318(var9, true, 10, var8);
                this.method2318(var9 + 1, true, 32, var8);
                this.method2318(var9, true, 128, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2318(var9, true, 40, var8);
                this.method2318(var9, true, 128, var8 + 1);
                this.method2318(var9 - 1, true, 2, var8);
            }
            if (arg0 == 3) {
                this.method2318(var9, true, 160, var8);
                this.method2318(var9 - 1, true, 2, var8);
                this.method2318(var9, true, 8, var8 - 1);
            }
        }
        if (arg2) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method2318(var9, true, 65536, var8);
                    this.method2318(var9, true, 4096, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method2318(var9, true, 1024, var8);
                    this.method2318(var9 + 1, true, 16384, var8);
                }
                if (arg0 == 2) {
                    this.method2318(var9, true, 4096, var8);
                    this.method2318(var9, true, 65536, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method2318(var9, true, 16384, var8);
                    this.method2318(var9 - 1, true, 1024, var8);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method2318(var9, true, 512, var8);
                    this.method2318(var9 + 1, true, 8192, var8 - 1);
                }
                if (arg0 == 1) {
                    this.method2318(var9, true, 2048, var8);
                    this.method2318(var9 + 1, true, 32768, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method2318(var9, true, 8192, var8);
                    this.method2318(var9 - 1, true, 512, var8 + 1);
                }
                if (arg0 == 3) {
                    this.method2318(var9, true, 32768, var8);
                    this.method2318(var9 - 1, true, 2048, var8 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method2318(var9, true, 66560, var8);
                    this.method2318(var9, true, 4096, var8 - 1);
                    this.method2318(var9 + 1, true, 16384, var8);
                }
                if (arg0 == 1) {
                    this.method2318(var9, true, 5120, var8);
                    this.method2318(var9 + 1, true, 16384, var8);
                    this.method2318(var9, true, 65536, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method2318(var9, true, 20480, var8);
                    this.method2318(var9, true, 65536, var8 + 1);
                    this.method2318(var9 - 1, true, 1024, var8);
                }
                if (arg0 == 3) {
                    this.method2318(var9, true, 81920, var8);
                    this.method2318(var9 - 1, true, 1024, var8);
                    this.method2318(var9, true, 4096, var8 - 1);
                }
            }
        }
        if (!arg5) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method2318(var9, true, 536870912, var8);
                this.method2318(var9, true, 33554432, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2318(var9, true, 8388608, var8);
                this.method2318(var9 + 1, true, 134217728, var8);
            }
            if (arg0 == 2) {
                this.method2318(var9, true, 33554432, var8);
                this.method2318(var9, true, 536870912, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2318(var9, true, 134217728, var8);
                this.method2318(var9 - 1, true, 8388608, var8);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method2318(var9, true, 4194304, var8);
                this.method2318(var9 + 1, true, 67108864, var8 - 1);
            }
            if (arg0 == 1) {
                this.method2318(var9, true, 16777216, var8);
                this.method2318(var9 + 1, true, 268435456, var8 + 1);
            }
            if (arg0 == 2) {
                this.method2318(var9, true, 67108864, var8);
                this.method2318(var9 - 1, true, 4194304, var8 + 1);
            }
            if (arg0 == 3) {
                this.method2318(var9, true, 268435456, var8);
                this.method2318(var9 - 1, true, 16777216, var8 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2318(var9, true, 545259520, var8);
            this.method2318(var9, true, 33554432, var8 - 1);
            this.method2318(var9 + 1, true, 134217728, var8);
        }
        if (arg0 == 1) {
            this.method2318(var9, true, 41943040, var8);
            this.method2318(var9 + 1, true, 134217728, var8);
            this.method2318(var9, true, 536870912, var8 + 1);
        }
        if (arg0 == 2) {
            this.method2318(var9, true, 167772160, var8);
            this.method2318(var9, true, 536870912, var8 + 1);
            this.method2318(var9 - 1, true, 8388608, var8);
        }
        if (arg0 == 3) {
            this.method2318(var9, true, 671088640, var8);
            this.method2318(var9 - 1, true, 8388608, var8);
            this.method2318(var9, true, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method2317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5694++;
        if (arg2 > 1) {
            return class231.method1574(arg7, arg6, arg2, arg0, arg5, 2, arg3, arg2, arg4) ? true : this.method2313(arg4, arg2, arg0, true, arg8, arg7, arg2, arg5, arg6, arg3);
        }
        int var10 = arg3 + arg0 - 1;
        int var11 = 69 % ((26 - arg1) / 46);
        int var12 = arg6 + arg5 - 1;
        if (arg3 <= arg4 && arg4 <= var10 && arg5 <= arg7 && var12 >= arg7) {
            return true;
        } else if (arg3 - 1 == arg4 && arg5 <= arg7 && var12 >= arg7 && (this.field5678[arg4 - this.field5692][arg7 - this.field5669] & 0x8) == 0 && (arg8 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg7 >= arg5 && var12 >= arg7 && (this.field5678[arg4 - this.field5692][arg7 - this.field5669] & 0x80) == 0 && (arg8 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg7 && arg4 >= arg3 && arg4 <= var10 && (this.field5678[arg4 - this.field5692][arg7 - this.field5669] & 0x2) == 0 && (arg8 & 0x4) == 0) {
            return true;
        } else {
            return var12 + 1 == arg7 && arg4 >= arg3 && arg4 <= var10 && (this.field5678[arg4 - this.field5692][arg7 - this.field5669] & 0x20) == 0 && (arg8 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZII)V")
    private final void method2318(int arg0, boolean arg1, int arg2, int arg3) {
        this.field5678[arg3][arg0] = class286.method1860(this.field5678[arg3][arg0], arg2);
        field5690++;
        if (!arg1) {
            field5687 = -35;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBLvr;Lqa;I)V")
    public static final void method2319(int arg0, byte arg1, class306 arg2, class496 arg3, int arg4) {
        field5680++;
        if (arg1 != 111) {
            method2305(5, 46, true, false, -60);
        }
        class178.field2537.method1959((byte) 113);
        if (class511.field7594) {
            return;
        }
        for (class5 var5 = (class5) arg2.method1970(arg1 - 47); var5 != null; var5 = (class5) arg2.method1960(arg1 - 87)) {
            class24 var6 = class135.field1953.method356(-1, var5.field65);
            if (class292.method1890((byte) -58, var6)) {
                boolean var7 = class65.method434(var6, arg0, var5, (byte) -72, arg3, arg4);
                if (var7) {
                    class259.method1679(var6, var5, arg3, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V")
    public final void method2320(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field5692;
        field5679++;
        int var5 = arg2 - this.field5669;
        this.field5678[var4][var5] = class494.method2942(this.field5678[var4][var5], -2097153);
        if (arg1 != 0) {
            field5683 = 0.45881954F;
        }
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(III)V")
    public final void method2321(int arg0, int arg1, int arg2) {
        field5671++;
        if (arg2 >= -119) {
            this.method2322(-56);
        }
        int var4 = arg1 - this.field5669;
        int var5 = arg0 - this.field5692;
        this.field5678[var5][var4] = class286.method1860(this.field5678[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public final void method2322(int arg0) {
        field5674++;
        for (int var2 = 0; var2 < this.field5681; var2++) {
            for (int var3 = 0; var3 < this.field5686; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field5681 - 5 || var3 >= this.field5686 - 5) {
                    this.field5678[var2][var3] = -1;
                } else {
                    this.field5678[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 != -29126) {
            field5683 = 0.2161704F;
        }
    }
}
