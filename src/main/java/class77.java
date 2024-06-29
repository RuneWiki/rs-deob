import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 {

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    private int field1617 = 0;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    private int field1604;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "[[I")
    public int[][] field1618;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Ldc;")
    public static class25 field1601 = new class25();

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Lpe;")
    private static class109 field1612 = class141.method1120("Invalid username or password)3", 0);

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lpe;")
    public static class109 field1621 = class141.method1120("Keine Antwort vom Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lpe;")
    public static class109 field1610 = field1612;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Lpe;")
    private static class109 field1624 = class141.method1120("Your profile will be transferred in:", 0);

    @OriginalMember(owner = "client!la", name = "x", descriptor = "[I")
    public static int[] field1623 = new int[200];

    @OriginalMember(owner = "client!la", name = "A", descriptor = "Lpe;")
    public static class109 field1626 = field1624;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1627++;
        int var9 = arg4 + arg0 - 1;
        int var10 = arg6 + arg1 - 1;
        if (arg7 >= arg6 && arg7 <= var10 && arg5 >= arg4 && arg5 <= var9) {
            return true;
        } else if (arg6 - 1 == arg7 && arg4 <= arg5 && var9 >= arg5 && (this.field1618[arg7 - this.field1617][arg5 - this.field1607] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else {
            if (arg3 != 8388608) {
                this.method620(-61, -55, -81, false, -28, (byte) -9);
            }
            if (var10 + 1 == arg7 && arg4 <= arg5 && var9 >= arg5 && (this.field1618[arg7 - this.field1617][arg5 - this.field1607] & 0x80) == 0 && (arg2 & 0x2) == 0) {
                return true;
            } else if (arg4 - 1 == arg5 && arg6 <= arg7 && arg7 <= var10 && (this.field1618[arg7 - this.field1617][arg5 - this.field1607] & 0x2) == 0 && (arg2 & 0x4) == 0) {
                return true;
            } else {
                return var9 + 1 == arg5 && arg6 <= arg7 && var10 >= arg7 && (this.field1618[arg7 - this.field1617][arg5 - this.field1607] & 0x20) == 0 && (arg2 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public final void method607(byte arg0) {
        field1603++;
        int var2 = 0;
        if (arg0 != 28) {
            return;
        }
        while (var2 < this.field1604) {
            for (int var3 = 0; var3 < this.field1608; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1604 - 5 || this.field1608 - 5 <= var3) {
                    this.field1618[var2][var3] = 16777215;
                } else {
                    this.field1618[var2][var3] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIIIIIIII)V")
    public static final void method608(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1628++;
        class133 var10 = null;
        class133 var11 = (class133) class27.field630.method195((byte) 112);
        if (arg0 >= -113) {
            field1601 = null;
        }
        while (var11 != null) {
            if (var11.field2905 == arg8 && var11.field2908 == arg3 && var11.field2910 == arg7 && var11.field2914 == arg4) {
                var10 = var11;
                break;
            }
            var11 = (class133) class27.field630.method198((byte) -110);
        }
        if (var10 == null) {
            var10 = new class133();
            var10.field2914 = arg4;
            var10.field2910 = arg7;
            var10.field2905 = arg8;
            var10.field2908 = arg3;
            class66.method513((byte) -126, var10);
            class27.field630.method188(-2, var10);
        }
        var10.field2909 = arg6;
        var10.field2892 = arg9;
        var10.field2904 = arg5;
        var10.field2891 = arg2;
        var10.field2907 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZIIIII)V")
    public final void method609(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1616++;
        int var8 = arg0 - this.field1617;
        if (arg5 != -1) {
            field1612 = null;
        }
        int var9 = 256;
        int var10 = arg3 - this.field1607;
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg2;
            arg2 = arg6;
            arg6 = var11;
        }
        if (arg1) {
            var9 += 131072;
        }
        for (int var12 = var8; var12 < arg2 + var8; var12++) {
            if (var12 >= 0 && this.field1604 > var12) {
                for (int var13 = var10; var13 < var10 + arg6; var13++) {
                    if (var13 >= 0 && this.field1608 > var13) {
                        this.method612(15607, var9, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)Z")
    public static final boolean method610(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        }
        field1609++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method611(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1605++;
        if (arg0 == arg6 && arg1 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field1617;
        int var9 = arg0 - this.field1617;
        int var10 = arg1 - this.field1607;
        if (arg5 != 2) {
            this.method617(70, -113, 22, (byte) 27, -7, 38, -114);
        }
        int var11 = arg3 - this.field1607;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var8 + 1 == var9 && var10 == var11 && (this.field1618[var9][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1618[var9][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field1618[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1618[var9][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field1618[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1618[var9][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 + 1 == var9 && var10 == var11 && (this.field1618[var9][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1618[var9][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field1618[var9][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field1618[var9][var11] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var9 && var10 == var11 && (this.field1618[var9][var11] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var9 && var10 == var11 && (this.field1618[var9][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIII)V")
    private final void method612(int arg0, int arg1, int arg2, int arg3) {
        field1620++;
        if (arg0 != 15607) {
            method610(true, 104);
        }
        this.field1618[arg2][arg3] = class4.method34(this.field1618[arg2][arg3], ~arg1);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBZI)V")
    public final void method613(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        int var7 = arg1 - this.field1617;
        field1611++;
        int var8 = arg5 - this.field1607;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method618(var8, 17436672, 128, var7);
                this.method618(var8, 17436672, 8, var7 - 1);
            }
            if (arg2 == 1) {
                this.method618(var8, 17436672, 2, var7);
                this.method618(var8 + 1, 17436672, 32, var7);
            }
            if (arg2 == 2) {
                this.method618(var8, 17436672, 8, var7);
                this.method618(var8, 17436672, 128, var7 + 1);
            }
            if (arg2 == 3) {
                this.method618(var8, 17436672, 32, var7);
                this.method618(var8 - 1, 17436672, 2, var7);
            }
        }
        if (arg3 <= 21) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method618(var8, 17436672, 1, var7);
                this.method618(var8 + 1, 17436672, 16, var7 - 1);
            }
            if (arg2 == 1) {
                this.method618(var8, 17436672, 4, var7);
                this.method618(var8 + 1, 17436672, 64, var7 + 1);
            }
            if (arg2 == 2) {
                this.method618(var8, 17436672, 16, var7);
                this.method618(var8 - 1, 17436672, 1, var7 + 1);
            }
            if (arg2 == 3) {
                this.method618(var8, 17436672, 64, var7);
                this.method618(var8 - 1, 17436672, 4, var7 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method618(var8, 17436672, 130, var7);
                this.method618(var8, 17436672, 8, var7 - 1);
                this.method618(var8 + 1, 17436672, 32, var7);
            }
            if (arg2 == 1) {
                this.method618(var8, 17436672, 10, var7);
                this.method618(var8 + 1, 17436672, 32, var7);
                this.method618(var8, 17436672, 128, var7 + 1);
            }
            if (arg2 == 2) {
                this.method618(var8, 17436672, 40, var7);
                this.method618(var8, 17436672, 128, var7 + 1);
                this.method618(var8 - 1, 17436672, 2, var7);
            }
            if (arg2 == 3) {
                this.method618(var8, 17436672, 160, var7);
                this.method618(var8 - 1, 17436672, 2, var7);
                this.method618(var8, 17436672, 8, var7 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method618(var8, 17436672, 65536, var7);
                this.method618(var8, 17436672, 4096, var7 - 1);
            }
            if (arg2 == 1) {
                this.method618(var8, 17436672, 1024, var7);
                this.method618(var8 + 1, 17436672, 16384, var7);
            }
            if (arg2 == 2) {
                this.method618(var8, 17436672, 4096, var7);
                this.method618(var8, 17436672, 65536, var7 + 1);
            }
            if (arg2 == 3) {
                this.method618(var8, 17436672, 16384, var7);
                this.method618(var8 - 1, 17436672, 1024, var7);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method618(var8, 17436672, 512, var7);
                this.method618(var8 + 1, 17436672, 8192, var7 - 1);
            }
            if (arg2 == 1) {
                this.method618(var8, 17436672, 2048, var7);
                this.method618(var8 + 1, 17436672, 32768, var7 + 1);
            }
            if (arg2 == 2) {
                this.method618(var8, 17436672, 8192, var7);
                this.method618(var8 - 1, 17436672, 512, var7 + 1);
            }
            if (arg2 == 3) {
                this.method618(var8, 17436672, 32768, var7);
                this.method618(var8 - 1, 17436672, 2048, var7 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method618(var8, 17436672, 66560, var7);
            this.method618(var8, 17436672, 4096, var7 - 1);
            this.method618(var8 + 1, 17436672, 16384, var7);
        }
        if (arg2 == 1) {
            this.method618(var8, 17436672, 5120, var7);
            this.method618(var8 + 1, 17436672, 16384, var7);
            this.method618(var8, 17436672, 65536, var7 + 1);
        }
        if (arg2 == 2) {
            this.method618(var8, 17436672, 20480, var7);
            this.method618(var8, 17436672, 65536, var7 + 1);
            this.method618(var8 - 1, 17436672, 1024, var7);
        }
        if (arg2 == 3) {
            this.method618(var8, 17436672, 81920, var7);
            this.method618(var8 - 1, 17436672, 1024, var7);
            this.method618(var8, 17436672, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method614(int arg0) {
        if (arg0 >= -45) {
            return;
        }
        field1621 = null;
        field1623 = null;
        field1601 = null;
        field1626 = null;
        field1610 = null;
        field1624 = null;
        field1612 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)V")
    public final void method615(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1617;
        int var5 = arg1 - this.field1607;
        this.field1618[var4][var5] = class4.method34(this.field1618[var4][var5], -262145);
        int var6 = -51 % ((arg0 + 24) / 34);
        field1622++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)V")
    public final void method616(int arg0, int arg1, int arg2) {
        field1613++;
        if (arg0 == 15113) {
            int var4 = arg1 - this.field1617;
            int var5 = arg2 - this.field1607;
            this.field1618[var4][var5] = class137.method1089(this.field1618[var4][var5], 2097152);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBIII)Z")
    public final boolean method617(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -65) {
            this.method606(-75, -70, -49, -74, 112, -118, -48, -61);
        }
        field1614++;
        if (arg5 == arg6 && arg0 == arg1) {
            return true;
        }
        int var8 = arg5 - this.field1617;
        int var9 = arg0 - this.field1607;
        int var10 = arg1 - this.field1607;
        int var11 = arg6 - this.field1617;
        if (arg4 == 0) {
            if (arg2 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field1618[var8][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field1618[var8][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var11 && var9 + 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field1618[var8][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field1618[var8][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var11 && var9 - 1 == var10) {
                    return true;
                }
                if (var11 - 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field1618[var8][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10 && (this.field1618[var8][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field1618[var8][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var11 - 1 == var8 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var9 + 1 == var10 && (this.field1618[var8][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 + 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var9 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var8 == var11 && var9 + 1 == var10 && (this.field1618[var8][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var9 - 1 == var10 && (this.field1618[var8][var10] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var10 && (this.field1618[var8][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IIII)V")
    private final void method618(int arg0, int arg1, int arg2, int arg3) {
        field1602++;
        this.field1618[arg3][arg0] = class137.method1089(this.field1618[arg3][arg0], arg2);
        if (arg1 != 17436672) {
            this.method618(-60, 43, -6, -97);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)V")
    public final void method619(int arg0, int arg1, byte arg2) {
        if (arg2 == -121) {
            int var4 = arg0 - this.field1617;
            field1615++;
            int var5 = arg1 - this.field1607;
            this.field1618[var4][var5] = class137.method1089(this.field1618[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZIB)V")
    public final void method620(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        int var7 = arg2 - this.field1617;
        field1606++;
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field1607;
        if (arg5 != 118) {
            this.field1608 = -41;
        }
        for (int var10 = var7; var10 < arg1 + var7; var10++) {
            if (var10 >= 0 && this.field1604 > var10) {
                for (int var11 = var9; var11 < var9 + arg0; var11++) {
                    if (var11 >= 0 && var11 < this.field1608) {
                        this.method618(var11, 17436672, var8, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIZI)V")
    public final void method621(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field1607;
        int var8 = arg1 - this.field1617;
        field1625++;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method612(arg2 ^ 0x65A0, 128, var8, var7);
                this.method612(15607, 8, var8 - 1, var7);
            }
            if (arg3 == 1) {
                this.method612(15607, 2, var8, var7);
                this.method612(15607, 32, var8, var7 + 1);
            }
            if (arg3 == 2) {
                this.method612(15607, 8, var8, var7);
                this.method612(15607, 128, var8 + 1, var7);
            }
            if (arg3 == 3) {
                this.method612(15607, 32, var8, var7);
                this.method612(arg2 - 7264, 2, var8, var7 - 1);
            }
        }
        if (arg2 != 22871) {
            this.field1604 = -103;
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method612(arg2 - 7264, 1, var8, var7);
                this.method612(15607, 16, var8 - 1, var7 + 1);
            }
            if (arg3 == 1) {
                this.method612(arg2 - 7264, 4, var8, var7);
                this.method612(arg2 ^ 0x65A0, 64, var8 + 1, var7 + 1);
            }
            if (arg3 == 2) {
                this.method612(arg2 - 7264, 16, var8, var7);
                this.method612(arg2 ^ 0x65A0, 1, var8 + 1, var7 + -1);
            }
            if (arg3 == 3) {
                this.method612(15607, 64, var8, var7);
                this.method612(15607, 4, var8 - 1, var7 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method612(15607, 130, var8, var7);
                this.method612(15607, 8, var8 - 1, var7);
                this.method612(15607, 32, var8, var7 + 1);
            }
            if (arg3 == 1) {
                this.method612(15607, 10, var8, var7);
                this.method612(15607, 32, var8, var7 + 1);
                this.method612(15607, 128, var8 + 1, var7);
            }
            if (arg3 == 2) {
                this.method612(arg2 ^ 0x65A0, 40, var8, var7);
                this.method612(15607, 128, var8 + 1, var7);
                this.method612(15607, 2, var8, var7 - 1);
            }
            if (arg3 == 3) {
                this.method612(15607, 160, var8, var7);
                this.method612(15607, 2, var8, var7 - 1);
                this.method612(15607, 8, var8 - 1, var7);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method612(15607, 65536, var8, var7);
                this.method612(arg2 - 7264, 4096, var8 - 1, var7);
            }
            if (arg3 == 1) {
                this.method612(15607, 1024, var8, var7);
                this.method612(15607, 16384, var8, var7 + 1);
            }
            if (arg3 == 2) {
                this.method612(15607, 4096, var8, var7);
                this.method612(15607, 65536, var8 + 1, var7);
            }
            if (arg3 == 3) {
                this.method612(15607, 16384, var8, var7);
                this.method612(15607, 1024, var8, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method612(arg2 ^ 0x65A0, 512, var8, var7);
                this.method612(15607, 8192, var8 - 1, var7 + 1);
            }
            if (arg3 == 1) {
                this.method612(15607, 2048, var8, var7);
                this.method612(arg2 ^ 0x65A0, 32768, var8 + 1, var7 + 1);
            }
            if (arg3 == 2) {
                this.method612(15607, 8192, var8, var7);
                this.method612(15607, 512, var8 + 1, var7 + -1);
            }
            if (arg3 == 3) {
                this.method612(arg2 ^ 0x65A0, 32768, var8, var7);
                this.method612(15607, 2048, var8 - 1, var7 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method612(arg2 - 7264, 66560, var8, var7);
            this.method612(15607, 4096, var8 - 1, var7);
            this.method612(15607, 16384, var8, var7 + 1);
        }
        if (arg3 == 1) {
            this.method612(15607, 5120, var8, var7);
            this.method612(15607, 16384, var8, var7 + 1);
            this.method612(arg2 - 7264, 65536, var8 + 1, var7);
        }
        if (arg3 == 2) {
            this.method612(15607, 20480, var8, var7);
            this.method612(15607, 65536, var8 + 1, var7);
            this.method612(15607, 1024, var8, var7 - 1);
        }
        if (arg3 == 3) {
            this.method612(15607, 81920, var8, var7);
            this.method612(15607, 1024, var8, var7 - 1);
            this.method612(arg2 ^ 0x65A0, 4096, var8 - 1, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(II)V")
    public class77(int arg0, int arg1) {
        this.field1608 = arg1;
        this.field1604 = arg0;
        this.field1618 = new int[this.field1604][this.field1608];
        this.field1607 = 0;
        this.method607((byte) 28);
    }
}
