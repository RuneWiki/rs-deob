import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class99 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    private int field1611;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "[[I")
    public int[][] field1604;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Lp;")
    private static class280 field1605 = class18.method140((byte) -121, "Choose Option");

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "[Lp;")
    public static class280[] field1602 = null;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1600 = 0;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "Lp;")
    public static class280 field1619 = field1605;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Ltg;")
    public static class180 field1606;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIBI)V")
    private final void method692(int arg0, int arg1, byte arg2, int arg3) {
        this.field1604[arg0][arg3] = class160.method1143(this.field1604[arg0][arg3], arg1);
        if (arg2 != -38) {
            this.method704(24, -116, -43, -19, -27, 32, -116, 53, 13, -81);
        }
        field1609++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lrf;IB)V")
    public static final void method693(class277 arg0, int arg1, byte arg2) {
        field1607++;
        if (arg0.field4826 > class117.field2104) {
            class61.method433(arg0, -1);
        } else if (arg0.field4852 >= class117.field2104) {
            class78.method571(arg0, -24808);
        } else {
            class58.method417(arg0, -113);
        }
        if (arg0.field4791 < 128 || arg0.field4793 < 128 || arg0.field4791 >= 13184 || arg0.field4793 >= 13184) {
            arg0.field4852 = 0;
            arg0.field4826 = 0;
            arg0.field4827 = -1;
            arg0.field4853 = -1;
            arg0.field4791 = arg0.field4837[0] * 128 + arg0.method984((byte) -34) * 64;
            arg0.field4793 = arg0.field4792[0] * 128 + arg0.method984((byte) -34) * 64;
            arg0.method1835(122);
        }
        if (class262.field4631 == arg0 && (arg0.field4791 < 1536 || arg0.field4793 < 1536 || arg0.field4791 >= 11776 || arg0.field4793 >= 11776)) {
            arg0.field4826 = 0;
            arg0.field4827 = -1;
            arg0.field4852 = 0;
            arg0.field4853 = -1;
            arg0.field4791 = arg0.field4837[0] * 128 + arg0.method984((byte) -34) * 64;
            arg0.field4793 = arg0.field4792[0] * 128 + (arg0.method984((byte) -34) * 64);
            arg0.method1835(-100);
        }
        class102.method718(arg0, 127);
        int var3 = 56 / ((37 - arg2) / 47);
        class199.method1369(-1954, arg0);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZIIIIIII)Z")
    public final boolean method694(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1599++;
        if (arg0 > 1) {
            return this.method708(arg0, arg3, arg8, 104, arg5, arg0, arg7, arg2, arg4) ? true : this.method704(arg5, arg0, arg4, -106, arg0, arg7, arg3, arg6, arg2, arg8);
        }
        int var10 = arg7 + arg4 - 1;
        int var11 = arg8 - (1 - arg5);
        if (arg1) {
            method693((class277) null, 118, (byte) -15);
        }
        if (arg7 <= arg3 && var10 >= arg3 && arg8 <= arg2 && var11 >= arg2) {
            return true;
        } else if ((arg7 - 1) == arg3 && arg8 <= arg2 && arg2 <= var11 && (this.field1604[arg3 - this.field1615][arg2 - this.field1612] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg3 && arg2 >= arg8 && var11 >= arg2 && (this.field1604[arg3 - this.field1615][arg2 - this.field1612] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg8 - 1 == arg2 && arg7 <= arg3 && var10 >= arg3 && (this.field1604[arg3 - this.field1615][arg2 - this.field1612] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var11 + 1 == arg2 && arg3 >= arg7 && var10 >= arg3 && (this.field1604[arg3 - this.field1615][arg2 - this.field1612] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIZZI)V")
    public final void method695(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field1612;
        field1623++;
        int var8 = arg1 - this.field1615;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method692(var8, 128, (byte) -38, var7);
                this.method692(var8 - 1, 8, (byte) -38, var7);
            }
            if (arg5 == 1) {
                this.method692(var8, 2, (byte) -38, var7);
                this.method692(var8, 32, (byte) -38, var7 + 1);
            }
            if (arg5 == 2) {
                this.method692(var8, 8, (byte) -38, var7);
                this.method692(var8 + 1, 128, (byte) -38, var7);
            }
            if (arg5 == 3) {
                this.method692(var8, 32, (byte) -38, var7);
                this.method692(var8, 2, (byte) -38, var7 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method692(var8, 1, (byte) -38, var7);
                this.method692(var8 - 1, 16, (byte) -38, var7 + 1);
            }
            if (arg5 == 1) {
                this.method692(var8, 4, (byte) -38, var7);
                this.method692(var8 + 1, 64, (byte) -38, var7 + 1);
            }
            if (arg5 == 2) {
                this.method692(var8, 16, (byte) -38, var7);
                this.method692(var8 + 1, 1, (byte) -38, var7 - 1);
            }
            if (arg5 == 3) {
                this.method692(var8, 64, (byte) -38, var7);
                this.method692(var8 - 1, 4, (byte) -38, var7 - 1);
            }
        }
        if (!arg4) {
            this.field1598 = 5;
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method692(var8, 130, (byte) -38, var7);
                this.method692(var8 - 1, 8, (byte) -38, var7);
                this.method692(var8, 32, (byte) -38, var7 + 1);
            }
            if (arg5 == 1) {
                this.method692(var8, 10, (byte) -38, var7);
                this.method692(var8, 32, (byte) -38, var7 + 1);
                this.method692(var8 + 1, 128, (byte) -38, var7);
            }
            if (arg5 == 2) {
                this.method692(var8, 40, (byte) -38, var7);
                this.method692(var8 + 1, 128, (byte) -38, var7);
                this.method692(var8, 2, (byte) -38, var7 - 1);
            }
            if (arg5 == 3) {
                this.method692(var8, 160, (byte) -38, var7);
                this.method692(var8, 2, (byte) -38, var7 - 1);
                this.method692(var8 - 1, 8, (byte) -38, var7);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method692(var8, 65536, (byte) -38, var7);
                this.method692(var8 - 1, 4096, (byte) -38, var7);
            }
            if (arg5 == 1) {
                this.method692(var8, 1024, (byte) -38, var7);
                this.method692(var8, 16384, (byte) -38, var7 + 1);
            }
            if (arg5 == 2) {
                this.method692(var8, 4096, (byte) -38, var7);
                this.method692(var8 + 1, 65536, (byte) -38, var7);
            }
            if (arg5 == 3) {
                this.method692(var8, 16384, (byte) -38, var7);
                this.method692(var8, 1024, (byte) -38, var7 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method692(var8, 512, (byte) -38, var7);
                this.method692(var8 - 1, 8192, (byte) -38, var7 + 1);
            }
            if (arg5 == 1) {
                this.method692(var8, 2048, (byte) -38, var7);
                this.method692(var8 + 1, 32768, (byte) -38, var7 + 1);
            }
            if (arg5 == 2) {
                this.method692(var8, 8192, (byte) -38, var7);
                this.method692(var8 + 1, 512, (byte) -38, var7 - 1);
            }
            if (arg5 == 3) {
                this.method692(var8, 32768, (byte) -38, var7);
                this.method692(var8 - 1, 2048, (byte) -38, var7 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method692(var8, 66560, (byte) -38, var7);
            this.method692(var8 - 1, 4096, (byte) -38, var7);
            this.method692(var8, 16384, (byte) -38, var7 + 1);
        }
        if (arg5 == 1) {
            this.method692(var8, 5120, (byte) -38, var7);
            this.method692(var8, 16384, (byte) -38, var7 + 1);
            this.method692(var8 + 1, 65536, (byte) -38, var7);
        }
        if (arg5 == 2) {
            this.method692(var8, 20480, (byte) -38, var7);
            this.method692(var8 + 1, 65536, (byte) -38, var7);
            this.method692(var8, 1024, (byte) -38, var7 - 1);
        }
        if (arg5 == 3) {
            this.method692(var8, 81920, (byte) -38, var7);
            this.method692(var8, 1024, (byte) -38, var7 - 1);
            this.method692(var8 - 1, 4096, (byte) -38, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static final void method696(int arg0) {
        field1620++;
        if (!class248.field4346) {
            return;
        }
        if (arg0 != 1536) {
            method693((class277) null, 54, (byte) -7);
        }
        class173.field3019 = null;
        class90.field1456 = null;
        class248.field4346 = false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V")
    private final void method697(int arg0, int arg1, int arg2, int arg3) {
        this.field1604[arg3][arg0] = class214.method1432(this.field1604[arg3][arg0], ~arg1);
        if (arg2 != 8) {
            field1619 = null;
        }
        field1616++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIZI)V")
    public final void method698(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field1615;
        int var8 = 256;
        if (arg4) {
            var8 += 131072;
        }
        int var9 = arg2 - this.field1612;
        field1613++;
        if (arg5 != 0) {
            return;
        }
        for (int var10 = var7; var10 < (arg3 + var7); var10++) {
            if (var10 >= 0 && var10 < this.field1611) {
                for (int var11 = var9; var11 < arg1 + var9; var11++) {
                    if (var11 >= 0 && var11 < this.field1598) {
                        this.method692(var10, var8, (byte) -38, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZI)V")
    public final void method699(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field1612;
        field1621++;
        int var5 = arg0 - this.field1615;
        if (!arg1) {
            this.field1604[var5][var4] = class214.method1432(this.field1604[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIIIIII)V")
    public final void method700(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg1 - this.field1612;
        field1608++;
        int var9 = arg6 - this.field1615;
        int var10 = 256;
        if (arg0) {
            var10 += 131072;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg3;
            arg3 = arg5;
            arg5 = var11;
        }
        if (arg4 != 131072) {
            field1602 = null;
        }
        for (int var12 = var9; var12 < arg3 + var9; var12++) {
            if (var12 >= 0 && this.field1611 > var12) {
                for (int var13 = var8; var13 < (arg5 + var8); var13++) {
                    if (var13 >= 0 && this.field1598 > var13) {
                        this.method697(var13, var10, arg4 - 131064, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIZIII)Z")
    public final boolean method701(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1622++;
        if (arg2 == 1) {
            if (arg1 == arg7 && arg0 == arg6) {
                return true;
            }
        } else if (arg1 >= arg7 && (arg7 - (1 - arg2)) >= arg1 && arg6 >= arg6 && arg6 + arg2 - 1 >= arg6) {
            return true;
        }
        int var9 = arg7 - this.field1615;
        int var10 = arg0 - this.field1612;
        int var11 = arg1 - this.field1615;
        int var12 = arg6 - this.field1612;
        if (arg2 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1604[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field1604[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field1604[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field1604[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field1604[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field1604[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field1604[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field1604[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field1604[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field1604[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var9 && var10 == var12 && (this.field1604[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 == var12 && (this.field1604[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg2 - 1;
            int var14 = arg2 + var9 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var11 + 1) == var9 && var10 <= var12 && var13 >= var12 && (this.field1604[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var14 && (var12 - arg2) == var10 && (this.field1604[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 - arg2 == var9 && var12 >= var10 && var12 <= var13 && (this.field1604[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && var12 - arg2 == var10 && (this.field1604[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var11 - arg2) == var9 && var12 >= var10 && var13 >= var12 && (this.field1604[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var14 >= var11 && var12 + 1 == var10 && (this.field1604[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var11 + 1 == var9 && var10 <= var12 && var13 >= var12 && (this.field1604[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var14 && var12 + 1 == var10 && (this.field1604[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 >= var9 && var14 >= var11 && (var12 + 1) == var10 && (this.field1604[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var14 >= var11 && var12 - arg2 == var10 && (this.field1604[var11][var13] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg2 == var9 && var12 >= var10 && var13 >= var12 && (this.field1604[var14][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var9 && var10 <= var12 && var13 >= var12 && (this.field1604[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        if (!arg4) {
            this.field1604 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBI)V")
    public final void method702(int arg0, byte arg1, int arg2) {
        int var4 = arg0 - this.field1615;
        if (arg1 > -114) {
            field1606 = null;
        }
        field1601++;
        int var5 = arg2 - this.field1612;
        this.field1604[var4][var5] = class160.method1143(this.field1604[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1614++;
        if (arg2 == 1) {
            if (arg3 == arg7 && arg0 == arg5) {
                return true;
            }
        } else if (arg3 >= arg7 && arg3 <= (arg7 + arg2 - 1) && arg0 <= arg0 && arg0 <= arg0 + arg2 - 1) {
            return true;
        }
        int var9 = arg7 - this.field1615;
        int var10 = arg0 - this.field1612;
        int var11 = arg3 - this.field1615;
        int var12 = arg5 - this.field1612;
        if (arg2 == 1) {
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1604[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field1604[var9][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1604[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field1604[var9][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                    if (var11 - 1 == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field1604[var9][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field1604[var9][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - 1 == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1604[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var11 - 1) == var9 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field1604[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var11 && (var10 + 1) == var12 && (this.field1604[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field1604[var9][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field1604[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 - (1 - arg2);
            int var14 = var12 + arg2 - 1;
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if (var11 - arg2 == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && var10 + 1 == var12 && (this.field1604[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg2 == var12 && (this.field1604[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 - arg2) == var9 && var10 >= var12 && var10 <= var14 && (this.field1604[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var14 >= var10 && (this.field1604[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 + 1 == var9 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 + 1 == var12 && (this.field1604[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var10 - arg2) == var12 && (this.field1604[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 >= var9 && var11 <= var13 && var10 - arg2 == var12) {
                        return true;
                    }
                    if ((var11 - arg2) == var9 && var12 <= var10 && var10 <= var14 && (this.field1604[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var12 <= var10 && var10 <= var14 && (this.field1604[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if ((var11 - arg2) == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var11 + 1 == var9 && var10 >= var12 && var10 <= var14 && (this.field1604[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && (var10 - arg2) == var12 && (this.field1604[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var11 - arg2) == var9 && var12 <= var10 && var14 >= var10 && (this.field1604[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 - arg2 == var12 && (this.field1604[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 - arg2) == var9 && var10 >= var12 && var14 >= var10 && (this.field1604[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var10 + 1) == var12 && (this.field1604[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var10 - arg2 == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var11 - arg2) == var9 && var10 >= var12 && var10 <= var14) {
                        return true;
                    }
                    if (var11 >= var9 && var13 >= var11 && var10 + 1 == var12 && (this.field1604[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var9 && var10 >= var12 && var10 <= var14 && (this.field1604[var9][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var9 && var11 <= var13 && (var10 - arg2) == var12) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 >= var9 && var13 >= var11 && (var10 + 1) == var12 && (this.field1604[var11][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var13 && (var10 - arg2) == var12 && (this.field1604[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var11 - arg2) == var9 && var10 >= var12 && var14 >= var10 && (this.field1604[var13][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var12 <= var10 && var14 >= var10 && (this.field1604[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 < 9) {
            this.method701(-46, -87, -42, -41, true, 23, -91, -3);
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1603++;
        int var11 = arg6 + arg4;
        int var12 = arg1 + arg8;
        int var13 = arg5 + arg2;
        int var14 = arg0 + arg9;
        if (arg3 >= -44) {
            return true;
        }
        if (arg6 >= arg5 && var13 > arg6) {
            if (arg9 == var12 && (arg7 & 0x4) == 0) {
                int var15 = arg6;
                int var16 = var11 <= var13 ? var11 : var13;
                while (var16 > var15) {
                    if ((this.field1604[var15 - this.field1615][var12 - this.field1612 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg8 == var14 && (arg7 & 0x1) == 0) {
                int var17 = var11 > var13 ? var13 : var11;
                for (int var18 = arg6; var18 < var17; var18++) {
                    if ((this.field1604[var18 - this.field1615][arg8 - this.field1612] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (var11 > arg5 && var13 >= var11) {
            if (arg9 == var12 && (arg7 & 0x4) == 0) {
                for (int var19 = arg5; var19 < var11; var19++) {
                    if ((this.field1604[var19 - this.field1615][var12 - (this.field1612 + 1)] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var14 && (arg7 & 0x1) == 0) {
                for (int var20 = arg5; var20 < var11; var20++) {
                    if ((this.field1604[var20 - this.field1615][arg8 - this.field1612] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg8 >= arg9 && var14 > arg8) {
            if (arg5 == var11 && (arg7 & 0x8) == 0) {
                int var21 = var12 > var14 ? var14 : var12;
                for (int var22 = arg8; var22 < var21; var22++) {
                    if ((this.field1604[var11 - this.field1615 - 1][var22 - this.field1612] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var13 && (arg7 & 0x2) == 0) {
                int var23 = var12 <= var14 ? var12 : var14;
                for (int var24 = arg8; var24 < var23; var24++) {
                    if ((this.field1604[arg6 - this.field1615][var24 - this.field1612] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg9 < var12 && var12 <= var14) {
            if (arg5 == var11 && (arg7 & 0x8) == 0) {
                for (int var25 = arg9; var25 < var12; var25++) {
                    if ((this.field1604[var11 - (this.field1615 + 1)][var25 - this.field1612] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var13 && (arg7 & 0x2) == 0) {
                for (int var26 = arg9; var26 < var12; var26++) {
                    if ((this.field1604[arg6 - this.field1615][var26 - this.field1612] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1602 = null;
        if (arg0 > -2) {
            method696(21);
        }
        field1619 = null;
        field1606 = null;
        field1605 = null;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(II)V")
    public class99(int arg0, int arg1) {
        this.field1598 = arg1;
        this.field1612 = 0;
        this.field1611 = arg0;
        this.field1615 = 0;
        this.field1604 = new int[this.field1611][this.field1598];
        this.method706(-114);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public final void method706(int arg0) {
        field1597++;
        int var2 = -102 / ((-arg0 - 50) / 38);
        for (int var3 = 0; var3 < this.field1611; var3++) {
            for (int var4 = 0; var4 < this.field1598; var4++) {
                if (var3 == 0 || var4 == 0 || this.field1611 - 5 <= var3 || (this.field1598 - 5) <= var4) {
                    this.field1604[var3][var4] = 16777215;
                } else {
                    this.field1604[var3][var4] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
    public final void method707(int arg0, int arg1, int arg2) {
        if (arg0 != 30362) {
            field1606 = null;
        }
        int var4 = arg2 - this.field1615;
        field1617++;
        int var5 = arg1 - this.field1612;
        this.field1604[var4][var5] = class160.method1143(this.field1604[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1610++;
        if (arg1 < arg6 + arg8 && arg1 + arg5 > arg6) {
            int var10 = 79 % ((-arg3 - 43) / 43);
            return arg7 < (arg2 + arg4) && arg2 < (arg0 + arg7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(IIIIZI)V")
    public final void method709(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field1615;
        int var8 = arg2 - this.field1612;
        if (arg1 <= 54) {
            method693((class277) null, -1, (byte) -106);
        }
        field1618++;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method697(var8, 128, 8, var7);
                this.method697(var8, 8, 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method697(var8, 2, 8, var7);
                this.method697(var8 + 1, 32, 8, var7);
            }
            if (arg5 == 2) {
                this.method697(var8, 8, 8, var7);
                this.method697(var8, 128, 8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method697(var8, 32, 8, var7);
                this.method697(var8 - 1, 2, 8, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method697(var8, 1, 8, var7);
                this.method697(var8 + 1, 16, 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method697(var8, 4, 8, var7);
                this.method697(var8 + 1, 64, 8, var7 + 1);
            }
            if (arg5 == 2) {
                this.method697(var8, 16, 8, var7);
                this.method697(var8 - 1, 1, 8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method697(var8, 64, 8, var7);
                this.method697(var8 - 1, 4, 8, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method697(var8, 130, 8, var7);
                this.method697(var8, 8, 8, var7 - 1);
                this.method697(var8 + 1, 32, 8, var7);
            }
            if (arg5 == 1) {
                this.method697(var8, 10, 8, var7);
                this.method697(var8 + 1, 32, 8, var7);
                this.method697(var8, 128, 8, var7 + 1);
            }
            if (arg5 == 2) {
                this.method697(var8, 40, 8, var7);
                this.method697(var8, 128, 8, var7 + 1);
                this.method697(var8 - 1, 2, 8, var7);
            }
            if (arg5 == 3) {
                this.method697(var8, 160, 8, var7);
                this.method697(var8 - 1, 2, 8, var7);
                this.method697(var8, 8, 8, var7 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method697(var8, 65536, 8, var7);
                this.method697(var8, 4096, 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method697(var8, 1024, 8, var7);
                this.method697(var8 + 1, 16384, 8, var7);
            }
            if (arg5 == 2) {
                this.method697(var8, 4096, 8, var7);
                this.method697(var8, 65536, 8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method697(var8, 16384, 8, var7);
                this.method697(var8 - 1, 1024, 8, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method697(var8, 512, 8, var7);
                this.method697(var8 + 1, 8192, 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method697(var8, 2048, 8, var7);
                this.method697(var8 + 1, 32768, 8, var7 + 1);
            }
            if (arg5 == 2) {
                this.method697(var8, 8192, 8, var7);
                this.method697(var8 - 1, 512, 8, var7 + 1);
            }
            if (arg5 == 3) {
                this.method697(var8, 32768, 8, var7);
                this.method697(var8 - 1, 2048, 8, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method697(var8, 66560, 8, var7);
            this.method697(var8, 4096, 8, var7 - 1);
            this.method697(var8 + 1, 16384, 8, var7);
        }
        if (arg5 == 1) {
            this.method697(var8, 5120, 8, var7);
            this.method697(var8 + 1, 16384, 8, var7);
            this.method697(var8, 65536, 8, var7 + 1);
        }
        if (arg5 == 2) {
            this.method697(var8, 20480, 8, var7);
            this.method697(var8, 65536, 8, var7 + 1);
            this.method697(var8 - 1, 1024, 8, var7);
        }
        if (arg5 == 3) {
            this.method697(var8, 81920, 8, var7);
            this.method697(var8 - 1, 1024, 8, var7);
            this.method697(var8, 4096, 8, var7 - 1);
            return;
        }
    }
}
