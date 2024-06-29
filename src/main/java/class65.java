import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    private int field1599;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[[I")
    public int[][] field1591;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    private int field1605;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lmb;")
    public static class84 field1589 = class79.method672(true, "overlay_multiway");

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[Ljc;")
    public static class65[] field1603 = new class65[4];

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field1609 = 0;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Z")
    public static boolean field1615 = false;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lmb;")
    private static class84 field1602 = class79.method672(true, " million");

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lmb;")
    public static class84 field1600 = field1602;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "Ljd;")
    public static class66 field1614;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[[[B")
    public static byte[][][] field1604;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIZI)V")
    public final void method579(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field1605;
        int var8 = arg1 - this.field1618;
        if (arg5 >= -18) {
            method583((byte) 67);
        }
        field1595++;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method581(var7, 128, var8, 8);
                this.method581(var7 - 1, 8, var8, 8);
            }
            if (arg2 == 1) {
                this.method581(var7, 2, var8, 8);
                this.method581(var7, 32, var8 + 1, 8);
            }
            if (arg2 == 2) {
                this.method581(var7, 8, var8, 8);
                this.method581(var7 + 1, 128, var8, 8);
            }
            if (arg2 == 3) {
                this.method581(var7, 32, var8, 8);
                this.method581(var7, 2, var8 - 1, 8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method581(var7, 1, var8, 8);
                this.method581(var7 - 1, 16, var8 + 1, 8);
            }
            if (arg2 == 1) {
                this.method581(var7, 4, var8, 8);
                this.method581(var7 + 1, 64, var8 + 1, 8);
            }
            if (arg2 == 2) {
                this.method581(var7, 16, var8, 8);
                this.method581(var7 + 1, 1, var8 - 1, 8);
            }
            if (arg2 == 3) {
                this.method581(var7, 64, var8, 8);
                this.method581(var7 - 1, 4, var8 - 1, 8);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method581(var7, 130, var8, 8);
                this.method581(var7 - 1, 8, var8, 8);
                this.method581(var7, 32, var8 + 1, 8);
            }
            if (arg2 == 1) {
                this.method581(var7, 10, var8, 8);
                this.method581(var7, 32, var8 + 1, 8);
                this.method581(var7 + 1, 128, var8, 8);
            }
            if (arg2 == 2) {
                this.method581(var7, 40, var8, 8);
                this.method581(var7 + 1, 128, var8, 8);
                this.method581(var7, 2, var8 - 1, 8);
            }
            if (arg2 == 3) {
                this.method581(var7, 160, var8, 8);
                this.method581(var7, 2, var8 - 1, 8);
                this.method581(var7 - 1, 8, var8, 8);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method581(var7, 65536, var8, 8);
                this.method581(var7 - 1, 4096, var8, 8);
            }
            if (arg2 == 1) {
                this.method581(var7, 1024, var8, 8);
                this.method581(var7, 16384, var8 + 1, 8);
            }
            if (arg2 == 2) {
                this.method581(var7, 4096, var8, 8);
                this.method581(var7 + 1, 65536, var8, 8);
            }
            if (arg2 == 3) {
                this.method581(var7, 16384, var8, 8);
                this.method581(var7, 1024, var8 - 1, 8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method581(var7, 512, var8, 8);
                this.method581(var7 - 1, 8192, var8 + 1, 8);
            }
            if (arg2 == 1) {
                this.method581(var7, 2048, var8, 8);
                this.method581(var7 + 1, 32768, var8 + 1, 8);
            }
            if (arg2 == 2) {
                this.method581(var7, 8192, var8, 8);
                this.method581(var7 + 1, 512, var8 - 1, 8);
            }
            if (arg2 == 3) {
                this.method581(var7, 32768, var8, 8);
                this.method581(var7 - 1, 2048, var8 - 1, 8);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method581(var7, 66560, var8, 8);
            this.method581(var7 - 1, 4096, var8, 8);
            this.method581(var7, 16384, var8 + 1, 8);
        }
        if (arg2 == 1) {
            this.method581(var7, 5120, var8, 8);
            this.method581(var7, 16384, var8 + 1, 8);
            this.method581(var7 + 1, 65536, var8, 8);
        }
        if (arg2 == 2) {
            this.method581(var7, 20480, var8, 8);
            this.method581(var7 + 1, 65536, var8, 8);
            this.method581(var7, 1024, var8 - 1, 8);
        }
        if (arg2 == 3) {
            this.method581(var7, 81920, var8, 8);
            this.method581(var7, 1024, var8 - 1, 8);
            this.method581(var7 - 1, 4096, var8, 8);
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIBII)Z")
    public final boolean method580(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1592++;
        if (arg0 == arg6 && arg2 == arg5) {
            return true;
        }
        int var8 = arg5 - this.field1618;
        int var9 = arg0 - this.field1605;
        int var10 = arg6 - this.field1605;
        int var11 = arg2 - this.field1618;
        if (arg3 == 0) {
            if (arg1 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1591[var10][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1591[var10][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1591[var10][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1591[var10][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1591[var10][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1591[var10][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1591[var10][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1591[var10][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var9 == var10 && var8 + 1 == var11 && (this.field1591[var10][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var8 - 1 == var11 && (this.field1591[var10][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field1591[var10][var11] & 0x80) == 0) {
                return true;
            }
        }
        return arg4 == -64 ? false : false;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
    private final void method581(int arg0, int arg1, int arg2, int arg3) {
        field1619++;
        this.field1591[arg0][arg2] = client.method144(this.field1591[arg0][arg2], 16777215 - arg1);
        if (arg3 != 8) {
            field1614 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIII)V")
    public static final void method582(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            field1609 = -95;
        }
        field1617++;
        class37 var5 = (class37) class105.field2552.method959(true, (long) arg1);
        if (var5 == null) {
            var5 = new class37();
            class105.field2552.method958((long) arg1, var5, arg3 ^ 0x73);
        }
        if (arg4 >= var5.field826.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field826.length; var8++) {
                var6[var8] = var5.field826[var8];
                var7[var8] = var5.field822[var8];
            }
            for (int var9 = var5.field826.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field826 = var6;
            var5.field822 = var7;
        }
        var5.field826[arg4] = arg0;
        var5.field822[arg4] = arg2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method583(byte arg0) {
        field1604 = null;
        field1603 = null;
        field1589 = null;
        field1602 = null;
        field1614 = null;
        if (arg0 >= -110) {
            method591((byte) -117);
        }
        field1600 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIIB)V")
    public final void method584(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = arg5 - this.field1605;
        int var9 = arg3 - this.field1618;
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg4;
            arg4 = arg0;
            arg0 = var10;
        }
        int var11 = 256;
        field1607++;
        if (arg6 > -22) {
            field1602 = null;
        }
        if (arg1) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < arg4 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field1598) {
                for (int var13 = var9; var13 < arg0 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field1599) {
                        this.method585((byte) 2, var13, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIII)V")
    private final void method585(byte arg0, int arg1, int arg2, int arg3) {
        field1610++;
        if (arg0 != 2) {
            this.method579(-21, 25, 35, -35, false, 107);
        }
        this.field1591[arg3][arg1] = class24.method166(this.field1591[arg3][arg1], arg2);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIZIII)V")
    public final void method586(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field1605;
        field1606++;
        int var8 = arg4 - this.field1618;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method585((byte) 2, var8, 128, var7);
                this.method585((byte) 2, var8, 8, var7 - 1);
            }
            if (arg1 == 1) {
                this.method585((byte) 2, var8, 2, var7);
                this.method585((byte) 2, var8 + 1, 32, var7);
            }
            if (arg1 == 2) {
                this.method585((byte) 2, var8, 8, var7);
                this.method585((byte) 2, var8, 128, var7 + 1);
            }
            if (arg1 == 3) {
                this.method585((byte) 2, var8, 32, var7);
                this.method585((byte) 2, var8 - 1, 2, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method585((byte) 2, var8, 1, var7);
                this.method585((byte) 2, var8 + 1, 16, var7 - 1);
            }
            if (arg1 == 1) {
                this.method585((byte) 2, var8, 4, var7);
                this.method585((byte) 2, var8 + 1, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method585((byte) 2, var8, 16, var7);
                this.method585((byte) 2, var8 - 1, 1, var7 + 1);
            }
            if (arg1 == 3) {
                this.method585((byte) 2, var8, 64, var7);
                this.method585((byte) 2, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method585((byte) 2, var8, 130, var7);
                this.method585((byte) 2, var8, 8, var7 - 1);
                this.method585((byte) 2, var8 + 1, 32, var7);
            }
            if (arg1 == 1) {
                this.method585((byte) 2, var8, 10, var7);
                this.method585((byte) 2, var8 + 1, 32, var7);
                this.method585((byte) 2, var8, 128, var7 + 1);
            }
            if (arg1 == 2) {
                this.method585((byte) 2, var8, 40, var7);
                this.method585((byte) 2, var8, 128, var7 + 1);
                this.method585((byte) 2, var8 - 1, 2, var7);
            }
            if (arg1 == 3) {
                this.method585((byte) 2, var8, 160, var7);
                this.method585((byte) 2, var8 - 1, 2, var7);
                this.method585((byte) 2, var8, 8, var7 - 1);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method585((byte) 2, var8, 65536, var7);
                    this.method585((byte) 2, var8, 4096, var7 - 1);
                }
                if (arg1 == 1) {
                    this.method585((byte) 2, var8, 1024, var7);
                    this.method585((byte) 2, var8 + 1, 16384, var7);
                }
                if (arg1 == 2) {
                    this.method585((byte) 2, var8, 4096, var7);
                    this.method585((byte) 2, var8, 65536, var7 + 1);
                }
                if (arg1 == 3) {
                    this.method585((byte) 2, var8, 16384, var7);
                    this.method585((byte) 2, var8 - 1, 1024, var7);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method585((byte) 2, var8, 512, var7);
                    this.method585((byte) 2, var8 + 1, 8192, var7 - 1);
                }
                if (arg1 == 1) {
                    this.method585((byte) 2, var8, 2048, var7);
                    this.method585((byte) 2, var8 + 1, 32768, var7 + 1);
                }
                if (arg1 == 2) {
                    this.method585((byte) 2, var8, 8192, var7);
                    this.method585((byte) 2, var8 - 1, 512, var7 + 1);
                }
                if (arg1 == 3) {
                    this.method585((byte) 2, var8, 32768, var7);
                    this.method585((byte) 2, var8 - 1, 2048, var7 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method585((byte) 2, var8, 66560, var7);
                    this.method585((byte) 2, var8, 4096, var7 - 1);
                    this.method585((byte) 2, var8 + 1, 16384, var7);
                }
                if (arg1 == 1) {
                    this.method585((byte) 2, var8, 5120, var7);
                    this.method585((byte) 2, var8 + 1, 16384, var7);
                    this.method585((byte) 2, var8, 65536, var7 + 1);
                }
                if (arg1 == 2) {
                    this.method585((byte) 2, var8, 20480, var7);
                    this.method585((byte) 2, var8, 65536, var7 + 1);
                    this.method585((byte) 2, var8 - 1, 1024, var7);
                }
                if (arg1 == 3) {
                    this.method585((byte) 2, var8, 81920, var7);
                    this.method585((byte) 2, var8 - 1, 1024, var7);
                    this.method585((byte) 2, var8, 4096, var7 - 1);
                }
            }
        }
        if (!arg0) {
            this.field1598 = 119;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method587(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1618;
        if (arg1 != -14796) {
            this.field1598 = -92;
        }
        field1594++;
        int var5 = arg0 - this.field1605;
        this.field1591[var5][var4] = client.method144(this.field1591[var5][var4], 14680063);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIII)V")
    public final void method588(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1608++;
        int var8 = 256;
        if (arg4 != -1) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var9 = arg6;
            arg6 = arg3;
            arg3 = var9;
        }
        int var10 = arg5 - this.field1618;
        if (arg1) {
            var8 += 131072;
        }
        int var11 = arg2 - this.field1605;
        for (int var12 = var11; var12 < arg6 + var11; var12++) {
            if (var12 >= 0 && this.field1598 > var12) {
                for (int var13 = var10; var13 < var10 + arg3; var13++) {
                    if (var13 >= 0 && var13 < this.field1599) {
                        this.method581(var12, var8, var13, arg4 ^ 0xFFFFFFF7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
    public final void method589(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field1605;
        field1590++;
        int var5 = arg0 - this.field1618;
        if (arg1 > -100) {
            field1615 = true;
        }
        this.field1591[var4][var5] = class24.method166(this.field1591[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1611++;
        int var9 = arg0 + arg4 - 1;
        if (arg6 != 32) {
            this.method585((byte) 59, 65, -60, 47);
        }
        int var10 = arg2 + arg1 - 1;
        if (arg0 <= arg7 && arg7 <= var9 && arg3 >= arg1 && var10 >= arg3) {
            return true;
        } else if (arg0 - 1 == arg7 && arg3 >= arg1 && arg3 <= var10 && (this.field1591[arg7 - this.field1605][arg3 - this.field1618] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg1 <= arg3 && arg3 <= var10 && (this.field1591[arg7 - this.field1605][arg3 - this.field1618] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg3 && arg7 >= arg0 && arg7 <= var9 && (this.field1591[arg7 - this.field1605][arg3 - this.field1618] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg3 && arg7 >= arg0 && var9 >= arg7 && (this.field1591[arg7 - this.field1605][arg3 - this.field1618] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Lr;")
    public static final class112 method591(byte arg0) {
        field1612++;
        class112 var1 = new class112();
        var1.field2690 = class107.field2599[0];
        var1.field2688 = class58.field1452;
        var1.field2686 = class134.field3213[0];
        var1.field2689 = class80.field1991;
        var1.field2687 = class133.field3162[0];
        byte[] var2 = client.field459[0];
        var1.field2685 = class125.field3032[0];
        int var3 = var1.field2687 * var1.field2685;
        var1.field2691 = new int[var3];
        if (arg0 != 48) {
            method594(-33, 95);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field2691[var4] = class11.field181[client.method144(var2[var4], 255)];
        }
        class115.method944(-110);
        return var1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public final void method592(int arg0) {
        for (int var2 = 0; var2 < this.field1598; var2++) {
            for (int var4 = 0; var4 < this.field1599; var4++) {
                if (var2 == 0 || var4 == 0 || this.field1598 - 1 == var2 || this.field1599 - 1 == var4) {
                    this.field1591[var2][var4] = 16777215;
                } else {
                    this.field1591[var2][var4] = 16777216;
                }
            }
        }
        int var3 = -47 % ((4 - arg0) / 58);
        field1616++;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)I")
    public static final int method593(int arg0, int arg1, int arg2) {
        field1593++;
        class37 var3 = (class37) class105.field2552.method959(true, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (~arg0 <= arg2 && arg0 < var3.field822.length) {
            return var3.field822[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
    public class65(int arg0, int arg1) {
        this.field1599 = arg1;
        this.field1618 = 0;
        this.field1598 = arg0;
        this.field1591 = new int[this.field1598][this.field1599];
        this.field1605 = 0;
        this.method592(-81);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I")
    public static final int method594(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field1601++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg0 < 16) {
            return -48;
        } else {
            int var4 = var3 | var3 >>> 4;
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1613++;
        if (arg4 == arg5 && arg2 == arg3) {
            return true;
        }
        int var8 = arg3 - this.field1618;
        int var9 = arg2 - this.field1618;
        int var10 = arg5 - this.field1605;
        int var11 = arg4 - this.field1605;
        if (arg0 != 0) {
            field1609 = 111;
        }
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field1591[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field1591[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field1591[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field1591[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field1591[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field1591[var11][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field1591[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field1591[var11][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var10 == var11 && var9 + 1 == var8 && (this.field1591[var11][var8] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var9 - 1 == var8 && (this.field1591[var11][var8] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var11 && var8 == var9 && (this.field1591[var11][var8] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var11 && var8 == var9 && (this.field1591[var11][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }
}
