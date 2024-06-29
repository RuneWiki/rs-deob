import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class73 {

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    private int field1520 = 0;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    private int field1522;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "[[I")
    public int[][] field1527;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field1525 = -1;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1518 = 0;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Loh;")
    public static class263 field1534 = class253.method1681(-119, "headicons_pk");

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "Loh;")
    public static class263 field1529 = class253.method1681(-123, "<col=ffff00>");

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "[I")
    public static int[] field1541 = new int[25];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public final void method474(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1520;
        field1533++;
        int var5 = arg0 - this.field1535;
        this.field1527[var5][var4] = class263.method1777(this.field1527[var5][var4], arg1);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IJ)V")
    public static final void method475(int arg0, long arg1) {
        field1539++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class100.field1908 < 100 || class258.field4479) || class100.field1908 >= 200) {
            class120.method774(0, class136.field2476, arg0 ^ 0x4ABD, class20.field459);
            return;
        }
        class263 var3 = class233.method1565(37, arg1).method1761(arg0 ^ 0xFFFF9923);
        if (arg0 != -26279) {
            return;
        }
        for (int var4 = 0; var4 < class100.field1908; var4++) {
            if (class38.field871[var4] == arg1) {
                class120.method774(0, class124.method797(-71, new class263[] { var3, class216.field3825 }), -11292, class20.field459);
                return;
            }
        }
        for (int var5 = 0; var5 < class31.field785; var5++) {
            if (class41.field909[var5] == arg1) {
                class120.method774(0, class124.method797(arg0 ^ 0x66F8, new class263[] { class106.field2015, var3, class230.field4028 }), -11292, class20.field459);
                return;
            }
        }
        if (var3.method1788(-26006, class229.field4018.field2508)) {
            class120.method774(0, class152.field2741, -11292, class20.field459);
            return;
        }
        class98.field1896++;
        class238.field4159[class100.field1908] = var3;
        class38.field871[class100.field1908] = arg1;
        class92.field1812[class100.field1908] = 0;
        class2.field30[class100.field1908] = class20.field459;
        class268.field4726[class100.field1908] = 0;
        class82.field1633[class100.field1908] = false;
        class75.field1558 = class112.field2108;
        class100.field1908++;
        class154.field2792.method1516(111, 64);
        class154.field2792.method1272((byte) 39, arg1);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIZI)V")
    public final void method476(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field1535;
        int var9 = arg0 - this.field1520;
        int var10 = 256;
        if (arg5) {
            var10 += 131072;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg4;
            arg4 = arg1;
            arg1 = var11;
        }
        field1531++;
        if (arg6 > -97) {
            method479((byte) -126);
        }
        for (int var12 = var8; var12 < arg4 + var8; var12++) {
            if (var12 >= 0 && this.field1526 > var12) {
                for (int var13 = var9; var13 < (arg1 + var9); var13++) {
                    if (var13 >= 0 && var13 < this.field1522) {
                        this.method487(var13, 16384, var12, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIIIIZ)V")
    public final void method477(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field1520;
        if (!arg5) {
            this.field1535 = -18;
        }
        field1523++;
        int var8 = arg3 - this.field1535;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method489((byte) 44, 128, var7, var8);
                this.method489((byte) 44, 8, var7, var8 - 1);
            }
            if (arg1 == 1) {
                this.method489((byte) 44, 2, var7, var8);
                this.method489((byte) 44, 32, var7 + 1, var8);
            }
            if (arg1 == 2) {
                this.method489((byte) 44, 8, var7, var8);
                this.method489((byte) 44, 128, var7, var8 + 1);
            }
            if (arg1 == 3) {
                this.method489((byte) 44, 32, var7, var8);
                this.method489((byte) 44, 2, var7 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method489((byte) 44, 1, var7, var8);
                this.method489((byte) 44, 16, var7 + 1, var8 - 1);
            }
            if (arg1 == 1) {
                this.method489((byte) 44, 4, var7, var8);
                this.method489((byte) 44, 64, var7 + 1, var8 + 1);
            }
            if (arg1 == 2) {
                this.method489((byte) 44, 16, var7, var8);
                this.method489((byte) 44, 1, var7 - 1, var8 - -1);
            }
            if (arg1 == 3) {
                this.method489((byte) 44, 64, var7, var8);
                this.method489((byte) 44, 4, var7 - 1, var8 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method489((byte) 44, 130, var7, var8);
                this.method489((byte) 44, 8, var7, var8 - 1);
                this.method489((byte) 44, 32, var7 + 1, var8);
            }
            if (arg1 == 1) {
                this.method489((byte) 44, 10, var7, var8);
                this.method489((byte) 44, 32, var7 + 1, var8);
                this.method489((byte) 44, 128, var7, var8 + 1);
            }
            if (arg1 == 2) {
                this.method489((byte) 44, 40, var7, var8);
                this.method489((byte) 44, 128, var7, var8 + 1);
                this.method489((byte) 44, 2, var7 - 1, var8);
            }
            if (arg1 == 3) {
                this.method489((byte) 44, 160, var7, var8);
                this.method489((byte) 44, 2, var7 - 1, var8);
                this.method489((byte) 44, 8, var7, var8 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method489((byte) 44, 65536, var7, var8);
                this.method489((byte) 44, 4096, var7, var8 - 1);
            }
            if (arg1 == 1) {
                this.method489((byte) 44, 1024, var7, var8);
                this.method489((byte) 44, 16384, var7 + 1, var8);
            }
            if (arg1 == 2) {
                this.method489((byte) 44, 4096, var7, var8);
                this.method489((byte) 44, 65536, var7, var8 + 1);
            }
            if (arg1 == 3) {
                this.method489((byte) 44, 16384, var7, var8);
                this.method489((byte) 44, 1024, var7 - 1, var8);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method489((byte) 44, 512, var7, var8);
                this.method489((byte) 44, 8192, var7 + 1, var8 + -1);
            }
            if (arg1 == 1) {
                this.method489((byte) 44, 2048, var7, var8);
                this.method489((byte) 44, 32768, var7 + 1, var8 + 1);
            }
            if (arg1 == 2) {
                this.method489((byte) 44, 8192, var7, var8);
                this.method489((byte) 44, 512, var7 - 1, var8 + 1);
            }
            if (arg1 == 3) {
                this.method489((byte) 44, 32768, var7, var8);
                this.method489((byte) 44, 2048, var7 - 1, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method489((byte) 44, 66560, var7, var8);
            this.method489((byte) 44, 4096, var7, var8 - 1);
            this.method489((byte) 44, 16384, var7 + 1, var8);
        }
        if (arg1 == 1) {
            this.method489((byte) 44, 5120, var7, var8);
            this.method489((byte) 44, 16384, var7 + 1, var8);
            this.method489((byte) 44, 65536, var7, var8 + 1);
        }
        if (arg1 == 2) {
            this.method489((byte) 44, 20480, var7, var8);
            this.method489((byte) 44, 65536, var7, var8 + 1);
            this.method489((byte) 44, 1024, var7 - 1, var8);
        }
        if (arg1 == 3) {
            this.method489((byte) 44, 81920, var7, var8);
            this.method489((byte) 44, 1024, var7 - 1, var8);
            this.method489((byte) 44, 4096, var7, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Lbc;")
    public static final class171 method478(int arg0) {
        int var1 = 32 / ((arg0 - 23) / 54);
        field1524++;
        try {
            return (class171) Class.forName("ii").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class7();
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static void method479(byte arg0) {
        field1541 = null;
        field1529 = null;
        if (arg0 >= -21) {
            method475(53, 112L);
        }
        field1534 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIBI)Z")
    private final boolean method480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field1519++;
        if ((arg4 + arg6) > arg3 && arg6 < arg0 + arg3) {
            int var10 = 61 / ((arg7 + 26) / 51);
            return arg8 + arg2 > arg1 && arg8 < (arg1 + arg5);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1514++;
        int var11 = arg5 + arg6;
        int var12 = arg3 + arg7;
        int var13 = arg0 + arg4;
        int var14 = arg2 + arg8;
        if (arg1 != 10411) {
            field1518 = -34;
        }
        if (arg7 >= arg8 && arg7 < var14) {
            if (arg4 == var11 && (arg9 & 0x4) == 0) {
                int var15 = arg7;
                int var16 = var14 >= var12 ? var12 : var14;
                while (var15 < var16) {
                    if ((this.field1527[var15 - this.field1535][var11 - this.field1520 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg5 == var13 && (arg9 & 0x1) == 0) {
                int var17 = arg7;
                int var18 = var12 > var14 ? var14 : var12;
                while (var17 < var18) {
                    if ((this.field1527[var17 - this.field1535][arg5 - this.field1520] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (var12 > arg8 && var12 <= var14) {
            if (arg4 == var11 && (arg9 & 0x4) == 0) {
                for (int var19 = arg8; var19 < var12; var19++) {
                    if ((this.field1527[var19 - this.field1535][var11 - this.field1520 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var13 && (arg9 & 0x1) == 0) {
                for (int var20 = arg8; var20 < var12; var20++) {
                    if ((this.field1527[var20 - this.field1535][arg5 - this.field1520] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg5 >= arg4 && var13 > arg5) {
            if (arg8 == var12 && (arg9 & 0x8) == 0) {
                int var21 = arg5;
                int var22 = var13 < var11 ? var13 : var11;
                while (var21 < var22) {
                    if ((this.field1527[var12 - this.field1535 - 1][var21 - this.field1520] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg7 == var14 && (arg9 & 0x2) == 0) {
                int var23 = arg5;
                int var24 = var11 <= var13 ? var11 : var13;
                while (var24 > var23) {
                    if ((this.field1527[arg7 - this.field1535][var23 - this.field1520] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg4 < var11 && var11 <= var13) {
            if (arg8 == var12 && (arg9 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var11; var25++) {
                    if ((this.field1527[var12 - this.field1535 - 1][var25 - this.field1520] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var14 && (arg9 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var11; var26++) {
                    if ((this.field1527[arg7 - this.field1535][var26 - this.field1520] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIZI)V")
    public final void method482(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg5 - this.field1520;
        int var8 = arg2 - this.field1535;
        field1516++;
        int var9 = 256;
        if (arg4) {
            var9 += 131072;
        }
        for (int var10 = var8; var10 < (arg3 + var8); var10++) {
            if (var10 >= 0 && var10 < this.field1526) {
                for (int var11 = var7; var11 < arg0 + var7; var11++) {
                    if (var11 >= 0 && this.field1522 > var11) {
                        this.method489((byte) 44, var9, var11, var10);
                    }
                }
            }
        }
        if (arg1 > -88) {
            this.method476(42, 89, 50, 34, 19, true, 119);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1530++;
        if (arg1 == 1) {
            if (arg0 == arg2 && arg3 == arg7) {
                return true;
            }
        } else if (arg0 >= arg2 && (arg2 + arg1 - 1) >= arg0 && arg3 <= arg3 && arg3 + arg1 - 1 >= arg3) {
            return true;
        }
        int var9 = arg7 - this.field1520;
        int var10 = arg3 - this.field1520;
        if (arg5 != 65536) {
            field1518 = -92;
        }
        int var11 = arg0 - this.field1535;
        int var12 = arg2 - this.field1535;
        if (arg1 == 1) {
            if (arg6 == 0) {
                if (arg4 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field1527[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field1527[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field1527[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field1527[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg4 == 0) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field1527[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field1527[var12][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field1527[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field1527[var12][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field1527[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field1527[var12][var9] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field1527[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg1 - 1;
            int var14 = arg1 + var12 - 1;
            if (arg6 == 0) {
                if (arg4 == 0) {
                    if (var11 - arg1 == var12 && var10 >= var9 && var10 <= var13) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var14 && var10 + 1 == var9 && (this.field1527[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var14 && var10 - arg1 == var9 && (this.field1527[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 <= var11 && var11 <= var14 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 - arg1 == var12 && var9 <= var10 && var10 <= var13 && (this.field1527[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 <= var10 && var10 <= var13 && (this.field1527[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 + 1) == var12 && var9 <= var10 && var13 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var14 >= var11 && var10 + 1 == var9 && (this.field1527[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var14 && (var10 - arg1) == var9 && (this.field1527[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 <= var11 && var11 <= var14 && (var10 - arg1) == var9) {
                        return true;
                    }
                    if (var11 - arg1 == var12 && var9 <= var10 && var10 <= var13 && (this.field1527[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var13 >= var10 && (this.field1527[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg4 == 0) {
                    if ((var11 - arg1) == var12 && var9 <= var10 && var10 <= var13) {
                        return true;
                    }
                    if (var11 >= var12 && var14 >= var11 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 <= var10 && var13 >= var10 && (this.field1527[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var14 && (var10 - arg1) == var9 && (this.field1527[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 - arg1 == var12 && var9 <= var10 && var10 <= var13 && (this.field1527[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var14 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 <= var10 && var10 <= var13) {
                        return true;
                    }
                    if (var11 >= var12 && var14 >= var11 && (var10 - arg1) == var9 && (this.field1527[var11][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var11 - arg1) == var12 && var9 <= var10 && var10 <= var13 && (this.field1527[var14][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var14 && var10 + 1 == var9 && (this.field1527[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 <= var10 && var13 >= var10) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var14 && (var10 - arg1) == var9) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var11 - arg1) == var12 && var10 >= var9 && var13 >= var10) {
                        return true;
                    }
                    if (var11 >= var12 && var14 >= var11 && var10 + 1 == var9 && (this.field1527[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 >= var9 && var13 >= var10 && (this.field1527[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var14 && var10 - arg1 == var9) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var12 <= var11 && var14 >= var11 && (var10 + 1) == var9 && (this.field1527[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var12 && var14 >= var11 && (var10 - arg1) == var9 && (this.field1527[var11][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var11 - arg1) == var12 && var9 <= var10 && var13 >= var10 && (this.field1527[var14][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 <= var10 && var13 >= var10 && (this.field1527[var12][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
    public final void method484(int arg0, int arg1, int arg2) {
        field1536++;
        int var4 = arg0 - this.field1520;
        if (arg1 != -22871) {
            this.method490(20);
        }
        int var5 = arg2 - this.field1535;
        this.field1527[var5][var4] = class160.method1052(this.field1527[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 > -111) {
            field1528 = 31;
        }
        field1515++;
        if (arg1 == 1) {
            if (arg0 == arg2 && arg5 == arg7) {
                return true;
            }
        } else if (arg0 <= arg2 && (arg1 + arg0 - 1) >= arg2 && arg5 >= arg5 && (arg1 + arg5 - 1) >= arg5) {
            return true;
        }
        int var9 = arg0 - this.field1535;
        int var10 = arg5 - this.field1520;
        int var11 = arg7 - this.field1520;
        int var12 = arg2 - this.field1535;
        if (arg1 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var12 + 1) == var9 && var10 == var11 && (this.field1527[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field1527[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field1527[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field1527[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - 1 == var9 && var10 == var11 && (this.field1527[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field1527[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var9 && var10 == var11 && (this.field1527[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field1527[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var12 && var10 + 1 == var11 && (this.field1527[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field1527[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var9 && var10 == var11 && (this.field1527[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 == var11 && (this.field1527[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg1 + var9 - 1;
            int var14 = arg1 + var11 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var12 + 1) == var9 && var11 <= var10 && var14 >= var10 && (this.field1527[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var10 - arg1) == var11 && (this.field1527[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var12 - arg1) == var9 && var11 <= var10 && var14 >= var10 && (this.field1527[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var13 >= var12 && (var10 - arg1) == var11 && (this.field1527[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var12 - arg1) == var9 && var11 <= var10 && var14 >= var10 && (this.field1527[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && (var10 + 1) == var11 && (this.field1527[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var9 && var10 >= var11 && var14 >= var10 && (this.field1527[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var9 && var12 <= var13 && var10 + 1 == var11 && (this.field1527[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var12 >= var9 && var13 >= var12 && (var10 + 1) == var11 && (this.field1527[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var9 && var13 >= var12 && var10 - arg1 == var11 && (this.field1527[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg1) == var9 && var10 >= var11 && var14 >= var10 && (this.field1527[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var9 && var10 >= var11 && var14 >= var10 && (this.field1527[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIIIB)Z")
    public final boolean method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field1517++;
        if (arg1 > 1) {
            return this.method480(arg1, arg0, arg3, arg6, arg2, arg1, arg7, (byte) -114, arg4) ? true : this.method481(arg3, 10411, arg2, arg1, arg4, arg0, arg1, arg6, arg7, arg5);
        }
        int var10 = arg2 + arg7 - 1;
        int var11 = arg4 + arg3 - 1;
        if (arg6 >= arg7 && var10 >= arg6 && arg0 >= arg4 && var11 >= arg0) {
            return true;
        }
        if (arg8 < 29) {
            this.field1522 = 67;
        }
        if (arg7 - 1 == arg6 && arg0 >= arg4 && var11 >= arg0 && (this.field1527[arg6 - this.field1535][arg0 - this.field1520] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg6 && arg0 >= arg4 && arg0 <= var11 && (this.field1527[arg6 - this.field1535][arg0 - this.field1520] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if ((arg4 - 1) == arg0 && arg6 >= arg7 && arg6 <= var10 && (this.field1527[arg6 - this.field1535][arg0 - this.field1520] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg0 && arg6 >= arg7 && arg6 <= var10 && (this.field1527[arg6 - this.field1535][arg0 - this.field1520] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V")
    private final void method487(int arg0, int arg1, int arg2, int arg3) {
        this.field1527[arg2][arg0] = class263.method1777(this.field1527[arg2][arg0], ~arg3);
        if (arg1 != 16384) {
            this.field1522 = 57;
        }
        field1532++;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(III)V")
    public final void method488(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1535;
        int var5 = arg1 - this.field1520;
        field1537++;
        this.field1527[var4][var5] = class160.method1052(this.field1527[var4][var5], 2097152);
        if (arg2 != 29293) {
            this.method483(-68, 33, 9, -86, 123, 79, 89, -26);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BIII)V")
    private final void method489(byte arg0, int arg1, int arg2, int arg3) {
        this.field1527[arg3][arg2] = class160.method1052(this.field1527[arg3][arg2], arg1);
        if (arg0 == 44) {
            field1521++;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public final void method490(int arg0) {
        field1538++;
        int var2 = -2 % ((arg0 - 57) / 58);
        for (int var3 = 0; var3 < this.field1526; var3++) {
            for (int var4 = 0; var4 < this.field1522; var4++) {
                if (var3 == 0 || var4 == 0 || (this.field1526 - 5) <= var3 || (this.field1522 - 5) <= var4) {
                    this.field1527[var3][var4] = 16777215;
                } else {
                    this.field1527[var3][var4] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZIIIII)V")
    public final void method491(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field1535;
        field1540++;
        int var8 = arg3 - this.field1520;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method487(var8, 16384, var7, 128);
                this.method487(var8, 16384, var7 - 1, 8);
            }
            if (arg2 == 1) {
                this.method487(var8, arg4 + 16385, var7, 2);
                this.method487(var8 + 1, arg4 ^ 0xFFFFBFFF, var7, 32);
            }
            if (arg2 == 2) {
                this.method487(var8, 16384, var7, 8);
                this.method487(var8, 16384, var7 + 1, 128);
            }
            if (arg2 == 3) {
                this.method487(var8, arg4 + 16385, var7, 32);
                this.method487(var8 - 1, 16384, var7, 2);
            }
        }
        if (arg4 != -1) {
            return;
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method487(var8, 16384, var7, 1);
                this.method487(var8 + 1, 16384, var7 - 1, 16);
            }
            if (arg2 == 1) {
                this.method487(var8, 16384, var7, 4);
                this.method487(var8 + 1, arg4 + 16385, var7 + 1, 64);
            }
            if (arg2 == 2) {
                this.method487(var8, 16384, var7, 16);
                this.method487(var8 - 1, arg4 ^ 0xFFFFBFFF, var7 + 1, 1);
            }
            if (arg2 == 3) {
                this.method487(var8, 16384, var7, 64);
                this.method487(var8 - 1, arg4 + 16385, var7 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method487(var8, arg4 ^ 0xFFFFBFFF, var7, 130);
                this.method487(var8, 16384, var7 - 1, 8);
                this.method487(var8 + 1, arg4 + 16385, var7, 32);
            }
            if (arg2 == 1) {
                this.method487(var8, 16384, var7, 10);
                this.method487(var8 + 1, arg4 ^ 0xFFFFBFFF, var7, 32);
                this.method487(var8, 16384, var7 + 1, 128);
            }
            if (arg2 == 2) {
                this.method487(var8, 16384, var7, 40);
                this.method487(var8, 16384, var7 + 1, 128);
                this.method487(var8 - 1, 16384, var7, 2);
            }
            if (arg2 == 3) {
                this.method487(var8, arg4 ^ 0xFFFFBFFF, var7, 160);
                this.method487(var8 - 1, arg4 + 16385, var7, 2);
                this.method487(var8, 16384, var7 - 1, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method487(var8, arg4 ^ 0xFFFFBFFF, var7, 65536);
                this.method487(var8, arg4 + 16385, var7 + -1, 4096);
            }
            if (arg2 == 1) {
                this.method487(var8, arg4 ^ 0xFFFFBFFF, var7, 1024);
                this.method487(var8 + 1, arg4 + 16385, var7, 16384);
            }
            if (arg2 == 2) {
                this.method487(var8, 16384, var7, 4096);
                this.method487(var8, 16384, var7 + 1, 65536);
            }
            if (arg2 == 3) {
                this.method487(var8, 16384, var7, 16384);
                this.method487(var8 - 1, 16384, var7, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method487(var8, 16384, var7, 512);
                this.method487(var8 + 1, arg4 + 16385, var7 - 1, 8192);
            }
            if (arg2 == 1) {
                this.method487(var8, 16384, var7, 2048);
                this.method487(var8 + 1, 16384, var7 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method487(var8, arg4 ^ 0xFFFFBFFF, var7, 8192);
                this.method487(var8 - 1, 16384, var7 + 1, 512);
            }
            if (arg2 == 3) {
                this.method487(var8, 16384, var7, 32768);
                this.method487(var8 - 1, arg4 ^ 0xFFFFBFFF, var7 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method487(var8, 16384, var7, 66560);
            this.method487(var8, 16384, var7 - 1, 4096);
            this.method487(var8 + 1, arg4 + 16385, var7, 16384);
        }
        if (arg2 == 1) {
            this.method487(var8, arg4 + 16385, var7, 5120);
            this.method487(var8 + 1, 16384, var7, 16384);
            this.method487(var8, 16384, var7 + 1, 65536);
        }
        if (arg2 == 2) {
            this.method487(var8, 16384, var7, 20480);
            this.method487(var8, 16384, var7 + 1, 65536);
            this.method487(var8 - 1, arg4 + 16385, var7, 1024);
        }
        if (arg2 == 3) {
            this.method487(var8, arg4 ^ 0xFFFFBFFF, var7, 81920);
            this.method487(var8 - 1, 16384, var7, 1024);
            this.method487(var8, arg4 ^ 0xFFFFBFFF, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
    public class73(int arg0, int arg1) {
        this.field1526 = arg0;
        this.field1535 = 0;
        this.field1522 = arg1;
        this.field1527 = new int[this.field1526][this.field1522];
        this.method490(-21);
    }
}
