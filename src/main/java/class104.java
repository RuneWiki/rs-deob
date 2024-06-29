import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class104 {

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    private int field1769;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    private int field1748;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    private int field1751;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    private int field1771;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "[[I")
    public int[][] field1766;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "[[I")
    public static int[][] field1750 = new int[104][104];

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1760 = 0;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "Lwa;")
    private static class75 field1767 = class66.method560("Loaded fonts", false);

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lwa;")
    public static class75 field1752 = field1767;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field1774 = -1;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "[I")
    public static int[] field1776 = new int[128];

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIII)Z", line = 9)
    public final boolean method806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1754++;
        if (arg5 <= 1) {
            int var10 = arg6 + arg7 - 1;
            int var11 = arg3 + arg4 - 1;
            if (arg1 != 2) {
                return false;
            } else if (arg6 <= arg2 && arg2 <= var10 && arg8 >= arg4 && var11 >= arg8) {
                return true;
            } else if ((arg6 - 1) == arg2 && arg8 >= arg4 && arg8 <= var11 && (this.field1766[arg2 - this.field1748][arg8 - this.field1771] & 0x8) == 0 && (arg0 & 0x8) == 0) {
                return true;
            } else if (var10 + 1 == arg2 && arg8 >= arg4 && var11 >= arg8 && (this.field1766[arg2 - this.field1748][arg8 - this.field1771] & 0x80) == 0 && (arg0 & 0x2) == 0) {
                return true;
            } else if ((arg4 - 1) == arg8 && arg2 >= arg6 && arg2 <= var10 && (this.field1766[arg2 - this.field1748][arg8 - this.field1771] & 0x2) == 0 && (arg0 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg8 && arg2 >= arg6 && var10 >= arg2 && (this.field1766[arg2 - this.field1748][arg8 - this.field1771] & 0x20) == 0 && (arg0 & 0x1) == 0;
            }
        } else if (this.method818(arg6, arg8, arg4, arg2, arg5, arg7, true, arg5, arg3)) {
            return true;
        } else {
            return this.method819(arg2, arg5, 2981, arg0, arg5, arg4, arg3, arg7, arg6, arg8);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V", line = 52)
    private final void method807(int arg0, int arg1, int arg2, int arg3) {
        this.field1766[arg0][arg3] = class235.method1710(this.field1766[arg0][arg3], ~arg2);
        field1768++;
        if (arg1 > -77) {
            this.method824(true, 111, 120, -32, -72, 26, -78);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 69)
    public static final void method808(int arg0) {
        class26.field347.method1200(false);
        field1765++;
        if (arg0 != 8) {
            method809(24);
        }
        class25.field323.method1200(false);
        class294.field5062.method1200(false);
        class168.field2827.method1200(false);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 83)
    public static void method809(int arg0) {
        if (arg0 != 17448960) {
            method816(96, false, 53, (boolean[]) null, -34, 11, (byte) 88, (int[][]) ((int[][]) null), 114, (class38) null, (int[][]) ((int[][]) null), 112, true, true, (int[]) null, (float[][]) ((float[][]) null), false, 98, 65, (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), -91);
        }
        field1750 = (int[][]) null;
        field1752 = null;
        field1767 = null;
        field1776 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBZIII)V", line = 105)
    public final void method810(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field1771;
        field1761++;
        int var8 = arg3 - this.field1748;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method807(var8, -83, 128, var7);
                this.method807(var8 - 1, -124, 8, var7);
            }
            if (arg5 == 1) {
                this.method807(var8, -120, 2, var7);
                this.method807(var8, -78, 32, var7 + 1);
            }
            if (arg5 == 2) {
                this.method807(var8, -121, 8, var7);
                this.method807(var8 + 1, -96, 128, var7);
            }
            if (arg5 == 3) {
                this.method807(var8, -110, 32, var7);
                this.method807(var8, -96, 2, var7 - 1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method807(var8, -89, 1, var7);
                this.method807(var8 - 1, -111, 16, var7 + 1);
            }
            if (arg5 == 1) {
                this.method807(var8, -127, 4, var7);
                this.method807(var8 + 1, -94, 64, var7 + 1);
            }
            if (arg5 == 2) {
                this.method807(var8, -113, 16, var7);
                this.method807(var8 + 1, -124, 1, var7 - 1);
            }
            if (arg5 == 3) {
                this.method807(var8, -88, 64, var7);
                this.method807(var8 - 1, -120, 4, var7 - 1);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method807(var8, -106, 130, var7);
                this.method807(var8 - 1, -86, 8, var7);
                this.method807(var8, -114, 32, var7 + 1);
            }
            if (arg5 == 1) {
                this.method807(var8, -104, 10, var7);
                this.method807(var8, -96, 32, var7 + 1);
                this.method807(var8 + 1, -101, 128, var7);
            }
            if (arg5 == 2) {
                this.method807(var8, -106, 40, var7);
                this.method807(var8 + 1, -116, 128, var7);
                this.method807(var8, -100, 2, var7 - 1);
            }
            if (arg5 == 3) {
                this.method807(var8, -100, 160, var7);
                this.method807(var8, -103, 2, var7 - 1);
                this.method807(var8 - 1, -85, 8, var7);
            }
        }
        if (arg2) {
            if (arg0 == 0) {
                if (arg5 == 0) {
                    this.method807(var8, -93, 65536, var7);
                    this.method807(var8 - 1, -102, 4096, var7);
                }
                if (arg5 == 1) {
                    this.method807(var8, -114, 1024, var7);
                    this.method807(var8, -115, 16384, var7 + 1);
                }
                if (arg5 == 2) {
                    this.method807(var8, -127, 4096, var7);
                    this.method807(var8 + 1, -115, 65536, var7);
                }
                if (arg5 == 3) {
                    this.method807(var8, -93, 16384, var7);
                    this.method807(var8, -97, 1024, var7 - 1);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg5 == 0) {
                    this.method807(var8, -93, 512, var7);
                    this.method807(var8 - 1, -94, 8192, var7 + 1);
                }
                if (arg5 == 1) {
                    this.method807(var8, -125, 2048, var7);
                    this.method807(var8 + 1, -97, 32768, var7 + 1);
                }
                if (arg5 == 2) {
                    this.method807(var8, -105, 8192, var7);
                    this.method807(var8 + 1, -93, 512, var7 - 1);
                }
                if (arg5 == 3) {
                    this.method807(var8, -105, 32768, var7);
                    this.method807(var8 - 1, -119, 2048, var7 - 1);
                }
            }
            if (arg0 == 2) {
                if (arg5 == 0) {
                    this.method807(var8, -112, 66560, var7);
                    this.method807(var8 - 1, -79, 4096, var7);
                    this.method807(var8, -115, 16384, var7 + 1);
                }
                if (arg5 == 1) {
                    this.method807(var8, -127, 5120, var7);
                    this.method807(var8, -117, 16384, var7 + 1);
                    this.method807(var8 + 1, -82, 65536, var7);
                }
                if (arg5 == 2) {
                    this.method807(var8, -86, 20480, var7);
                    this.method807(var8 + 1, -108, 65536, var7);
                    this.method807(var8, -92, 1024, var7 - 1);
                }
                if (arg5 == 3) {
                    this.method807(var8, -113, 81920, var7);
                    this.method807(var8, -119, 1024, var7 - 1);
                    this.method807(var8 - 1, -90, 4096, var7);
                }
            }
        }
        if (arg1 > -45) {
            this.method814(50, true, 73, -103, 119);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)Ldd;", line = 309)
    public static final class235 method811(int arg0, int arg1, int arg2) {
        class242 var3 = class271.field4681[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class235 var4 = var3.field4096;
            var3.field4096 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)V", line = 320)
    public final void method812(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1748;
        if (arg0 != 17) {
            this.method815(1);
        }
        int var5 = arg2 - this.field1771;
        this.field1766[var4][var5] = class102.method799(this.field1766[var4][var5], 262144);
        field1777++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIB)V", line = 338)
    public final void method813(int arg0, int arg1, byte arg2) {
        if (arg2 >= 8) {
            field1764++;
            int var4 = arg1 - this.field1771;
            int var5 = arg0 - this.field1748;
            this.field1766[var5][var4] = class235.method1710(this.field1766[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZIII)Z", line = 362)
    public final boolean method814(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1753++;
        if (arg0 == arg2 && arg3 == arg4) {
            return true;
        }
        int var6 = arg2 - this.field1748;
        int var7 = arg4 - this.field1771;
        if (var6 < 0 || this.field1769 <= var6 || var7 < 0 || var7 >= this.field1751) {
            return false;
        }
        int var8 = arg3 - this.field1771;
        int var9 = arg0 - this.field1748;
        int var10;
        if (var8 >= var7) {
            var10 = var8 - var7;
        } else {
            var10 = var7 - var8;
        }
        if (!arg1) {
            return false;
        }
        int var11;
        if (var9 < var6) {
            var11 = var6 - var9;
        } else {
            var11 = var9 - var6;
        }
        if (var10 >= var11) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var7 != var8) {
                if (var7 > var8) {
                    if ((this.field1766[var9][var8] & 0x12C0102) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var8 > var7) {
                    if ((this.field1766[var9][var8] & 0x12C0120) != 0) {
                        return false;
                    }
                    var8--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var6 > var9) {
                        if ((this.field1766[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var6) {
                        if ((this.field1766[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        } else {
            int var14 = 32768;
            int var15 = var10 * 65536 / var11;
            while (var6 != var9) {
                if (var9 < var6) {
                    if ((this.field1766[var9][var8] & 0x12C0108) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var6 < var9) {
                    if ((this.field1766[var9][var8] & 0x12C0180) != 0) {
                        return false;
                    }
                    var9--;
                }
                var14 += var15;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var8 < var7) {
                        if ((this.field1766[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var7) {
                        if ((this.field1766[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        }
        return (this.field1766[var6][var7] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V", line = 513)
    public final void method815(int arg0) {
        for (int var2 = 0; var2 < this.field1769; var2++) {
            for (int var3 = 0; var3 < this.field1751; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field1769 - 5) <= var2 || var3 >= (this.field1751 - 5)) {
                    this.field1766[var2][var3] = 16777215;
                } else {
                    this.field1766[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 != 64) {
            this.field1769 = -27;
        }
        field1756++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZI[ZIIB[[IILcg;[[IIZZ[I[[FZII[[F[[FI)V", line = 547)
    public static final void method816(int arg0, boolean arg1, int arg2, boolean[] arg3, int arg4, int arg5, byte arg6, int[][] arg7, int arg8, class38 arg9, int[][] arg10, int arg11, boolean arg12, boolean arg13, int[] arg14, float[][] arg15, boolean arg16, int arg17, int arg18, float[][] arg19, float[][] arg20, int arg21) {
        if (arg5 != 25856) {
            field1774 = 43;
        }
        field1749++;
        int var22 = (arg4 << 8) + (arg16 ? 255 : 0);
        int var23 = (arg12 ? 255 : 0) + (arg2 << 8);
        int var24 = (arg1 ? 255 : 0) + (arg18 << 8);
        int var25 = (arg8 << 8) + (arg13 ? 255 : 0);
        int[] var26 = new int[arg14.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg14[var27 + var27];
            int var29 = arg14[var27 - (-var27 - 1)];
            int[][] var30 = arg10 == null || arg3 == null || !arg3[var27] ? arg7 : arg10;
            var26[var27] = class82.method684(var29, false, arg15, arg10, (float) arg21, arg20, 14613, var25, arg9, var23, arg19, var24, var28, arg11, var30, arg6, arg17, var22);
        }
        arg9.method259(arg0, arg11, arg17, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIZI)Z", line = 586)
    public final boolean method817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field1762++;
        if (arg6) {
            this.field1751 = 108;
        }
        if (arg3 == 1) {
            if (arg0 == arg5 && arg1 == arg7) {
                return true;
            }
        } else if (arg0 <= arg5 && (arg3 + arg0 - 1) >= arg5 && arg7 >= arg7 && arg3 + arg7 - 1 >= arg7) {
            return true;
        }
        int var9 = arg0 - this.field1748;
        int var10 = arg5 - this.field1748;
        int var11 = arg1 - this.field1771;
        int var12 = arg7 - this.field1771;
        if (arg3 == 1) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1766[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1766[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 == var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1766[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1766[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                    if (var10 - 1 == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    if (var10 - 1 == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1766[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field1766[var9][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1766[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var10 - 1) == var9 && var11 == var12) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field1766[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var10 && var12 + 1 == var11 && (this.field1766[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field1766[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field1766[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg3 - 1;
            int var14 = arg3 + var11 - 1;
            if (arg4 == 0) {
                if (arg2 == 0) {
                    if ((var10 - arg3) == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field1766[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 - arg3 == var11 && (this.field1766[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11) {
                        return true;
                    }
                    if ((var10 - arg3) == var9 && var12 >= var11 && var14 >= var12 && (this.field1766[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14 && (this.field1766[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11 && (this.field1766[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 - arg3 == var11 && (this.field1766[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 >= var9 && var10 <= var13 && var12 - arg3 == var11) {
                        return true;
                    }
                    if ((var10 - arg3) == var9 && var12 >= var11 && var12 <= var14 && (this.field1766[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var11 <= var12 && var12 <= var14 && (this.field1766[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    if (var10 - arg3 == var9 && var12 >= var11 && var14 >= var12) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if ((var10 + 1) == var9 && var12 >= var11 && var14 >= var12 && (this.field1766[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 - arg3 == var11 && (this.field1766[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var10 - arg3) == var9 && var12 >= var11 && var14 >= var12 && (this.field1766[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 + 1) == var11) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && (var12 - arg3) == var11 && (this.field1766[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - arg3 == var9 && var11 <= var12 && var12 <= var14 && (this.field1766[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field1766[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 - arg3) == var11) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var10 - arg3) == var9 && var12 >= var11 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && var12 + 1 == var11 && (this.field1766[var10][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14 && (this.field1766[var9][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg3) == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11 && (this.field1766[var10][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var9 && var13 >= var10 && var12 - arg3 == var11 && (this.field1766[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var10 - arg3) == var9 && var12 >= var11 && var12 <= var14 && (this.field1766[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var12 >= var11 && var12 <= var14 && (this.field1766[var9][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIZII)Z", line = 961)
    private final boolean method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (!arg6) {
            field1776 = (int[]) null;
        }
        field1758++;
        if (arg3 < arg0 + arg5 && arg0 < arg3 + arg7) {
            return arg1 < arg2 + arg8 && arg1 + arg4 > arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIIII)Z", line = 979)
    private final boolean method819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1747++;
        int var11 = arg0 + arg1;
        int var12 = arg4 + arg9;
        int var13 = arg7 + arg8;
        int var14 = arg5 + arg6;
        if (arg8 <= arg0 && arg0 < var13) {
            if (arg5 == var12 && (arg3 & 0x4) == 0) {
                int var15 = arg0;
                int var16 = var13 >= var11 ? var11 : var13;
                while (var15 < var16) {
                    if ((this.field1766[var15 - this.field1748][var12 - this.field1771 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg9 == var14 && (arg3 & 0x1) == 0) {
                int var17 = var13 >= var11 ? var11 : var13;
                for (int var18 = arg0; var18 < var17; var18++) {
                    if ((this.field1766[var18 - this.field1748][arg9 - this.field1771] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (var11 > arg8 && var13 >= var11) {
            if (arg5 == var12 && (arg3 & 0x4) == 0) {
                for (int var19 = arg8; var19 < var11; var19++) {
                    if ((this.field1766[var19 - this.field1748][var12 - this.field1771 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg9 == var14 && (arg3 & 0x1) == 0) {
                for (int var20 = arg8; var20 < var11; var20++) {
                    if ((this.field1766[var20 - this.field1748][arg9 - this.field1771] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg9 >= arg5 && arg9 < var14) {
            if (arg8 == var11 && (arg3 & 0x8) == 0) {
                int var21 = arg9;
                int var22 = var12 <= var14 ? var12 : var14;
                while (var21 < var22) {
                    if ((this.field1766[var11 - this.field1748 - 1][var21 - this.field1771] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg0 == var13 && (arg3 & 0x2) == 0) {
                int var23 = var14 < var12 ? var14 : var12;
                for (int var24 = arg9; var24 < var23; var24++) {
                    if ((this.field1766[arg0 - this.field1748][var24 - this.field1771] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg5 < var12 && var14 >= var12) {
            if (arg8 == var11 && (arg3 & 0x8) == 0) {
                for (int var25 = arg5; var25 < var12; var25++) {
                    if ((this.field1766[var11 - this.field1748 - 1][var25 - this.field1771] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var13 && (arg3 & 0x2) == 0) {
                for (int var26 = arg5; var26 < var12; var26++) {
                    if ((this.field1766[arg0 - this.field1748][var26 - this.field1771] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        if (arg2 != 2981) {
            this.field1748 = -19;
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIZ)V", line = 1147)
    private final void method820(int arg0, int arg1, int arg2, boolean arg3) {
        field1757++;
        if (arg3) {
            this.field1766[arg0][arg1] = class102.method799(this.field1766[arg0][arg1], arg2);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIZ)V", line = 1158)
    public final void method821(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1763++;
        int var7 = arg4 - this.field1748;
        if (arg3 != -1) {
            return;
        }
        int var8 = arg2 - this.field1771;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method820(var7, var8, 128, true);
                this.method820(var7 - 1, var8, 8, true);
            }
            if (arg0 == 1) {
                this.method820(var7, var8, 2, true);
                this.method820(var7, var8 + 1, 32, true);
            }
            if (arg0 == 2) {
                this.method820(var7, var8, 8, true);
                this.method820(var7 + 1, var8, 128, true);
            }
            if (arg0 == 3) {
                this.method820(var7, var8, 32, true);
                this.method820(var7, var8 - 1, 2, true);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method820(var7, var8, 1, true);
                this.method820(var7 - 1, var8 - -1, 16, true);
            }
            if (arg0 == 1) {
                this.method820(var7, var8, 4, true);
                this.method820(var7 + 1, var8 + 1, 64, true);
            }
            if (arg0 == 2) {
                this.method820(var7, var8, 16, true);
                this.method820(var7 + 1, var8 + -1, 1, true);
            }
            if (arg0 == 3) {
                this.method820(var7, var8, 64, true);
                this.method820(var7 - 1, var8 + -1, 4, true);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method820(var7, var8, 130, true);
                this.method820(var7 - 1, var8, 8, true);
                this.method820(var7, var8 + 1, 32, true);
            }
            if (arg0 == 1) {
                this.method820(var7, var8, 10, true);
                this.method820(var7, var8 + 1, 32, true);
                this.method820(var7 + 1, var8, 128, true);
            }
            if (arg0 == 2) {
                this.method820(var7, var8, 40, true);
                this.method820(var7 + 1, var8, 128, true);
                this.method820(var7, var8 - 1, 2, true);
            }
            if (arg0 == 3) {
                this.method820(var7, var8, 160, true);
                this.method820(var7, var8 - 1, 2, true);
                this.method820(var7 - 1, var8, 8, true);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method820(var7, var8, 65536, true);
                this.method820(var7 - 1, var8, 4096, true);
            }
            if (arg0 == 1) {
                this.method820(var7, var8, 1024, true);
                this.method820(var7, var8 + 1, 16384, true);
            }
            if (arg0 == 2) {
                this.method820(var7, var8, 4096, true);
                this.method820(var7 + 1, var8, 65536, true);
            }
            if (arg0 == 3) {
                this.method820(var7, var8, 16384, true);
                this.method820(var7, var8 - 1, 1024, true);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method820(var7, var8, 512, true);
                this.method820(var7 - 1, var8 + 1, 8192, true);
            }
            if (arg0 == 1) {
                this.method820(var7, var8, 2048, true);
                this.method820(var7 + 1, var8 + 1, 32768, true);
            }
            if (arg0 == 2) {
                this.method820(var7, var8, 8192, true);
                this.method820(var7 + 1, var8 + -1, 512, true);
            }
            if (arg0 == 3) {
                this.method820(var7, var8, 32768, true);
                this.method820(var7 - 1, var8 + -1, 2048, true);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method820(var7, var8, 66560, true);
            this.method820(var7 - 1, var8, 4096, true);
            this.method820(var7, var8 + 1, 16384, true);
        }
        if (arg0 == 1) {
            this.method820(var7, var8, 5120, true);
            this.method820(var7, var8 + 1, 16384, true);
            this.method820(var7 + 1, var8, 65536, true);
        }
        if (arg0 == 2) {
            this.method820(var7, var8, 20480, true);
            this.method820(var7 + 1, var8, 65536, true);
            this.method820(var7, var8 - 1, 1024, true);
        }
        if (arg0 == 3) {
            this.method820(var7, var8, 81920, true);
            this.method820(var7, var8 - 1, 1024, true);
            this.method820(var7 - 1, var8, 4096, true);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZIII)V", line = 1365)
    public final void method822(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1755++;
        int var7 = arg4 - this.field1748;
        if (arg0 != 2) {
            field1760 = -38;
        }
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        int var9 = arg3 - this.field1771;
        for (int var10 = var7; var10 < arg1 + var7; var10++) {
            if (var10 >= 0 && this.field1769 > var10) {
                for (int var11 = var9; var11 < var9 + arg5; var11++) {
                    if (var11 >= 0 && var11 < this.field1751) {
                        this.method820(var10, var11, var8, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIII)Z", line = 1406)
    public final boolean method823(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1773++;
        if (arg4 != 5252) {
            method809(17);
        }
        if (arg6 == 1) {
            if (arg0 == arg5 && arg1 == arg7) {
                return true;
            }
        } else if (arg0 <= arg5 && arg5 <= arg0 + arg6 - 1 && arg1 >= arg1 && (arg6 + arg1 - 1) >= arg1) {
            return true;
        }
        int var9 = arg5 - this.field1748;
        int var10 = arg7 - this.field1771;
        int var11 = arg1 - this.field1771;
        int var12 = arg0 - this.field1748;
        if (arg6 == 1) {
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var9 + 1) == var12 && var10 == var11 && (this.field1766[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field1766[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field1766[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 - 1 == var10 && (this.field1766[var12][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field1766[var12][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field1766[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 + 1 == var12 && var10 == var11 && (this.field1766[var12][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var11 + 1 == var10 && (this.field1766[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 == var12 && var11 + 1 == var10 && (this.field1766[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var11 - 1 == var10 && (this.field1766[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var12 && var10 == var11 && (this.field1766[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 == var11 && (this.field1766[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg6 - 1;
            int var14 = var10 + arg6 - 1;
            if (arg2 == 6 || arg2 == 7) {
                if (arg2 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if (var9 + 1 == var12 && var10 <= var11 && var11 <= var14 && (this.field1766[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && var11 - arg6 == var10 && (this.field1766[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - arg6) == var12 && var10 <= var11 && var14 >= var11 && (this.field1766[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && (var11 - arg6) == var10 && (this.field1766[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 - arg6 == var12 && var10 <= var11 && var11 <= var14 && (this.field1766[var13][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var11 + 1 == var10 && (this.field1766[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 + 1) == var12 && var11 >= var10 && var11 <= var14 && (this.field1766[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var11 + 1) == var10 && (this.field1766[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 8) {
                if (var9 >= var12 && var13 >= var9 && (var11 + 1) == var10 && (this.field1766[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 <= var9 && var13 >= var9 && (var11 - arg6) == var10 && (this.field1766[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if (var9 - arg6 == var12 && var11 >= var10 && var14 >= var11 && (this.field1766[var13][var11] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var10 <= var11 && var14 >= var11 && (this.field1766[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIIIIII)V", line = 1600)
    public final void method824(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1775++;
        int var8 = arg3 - this.field1771;
        int var9 = 256;
        int var10 = arg2 - this.field1748;
        if (arg0) {
            var9 += 131072;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg5;
            arg5 = arg6;
            arg6 = var11;
        }
        int var12 = 122 % ((6 - arg1) / 37);
        for (int var13 = var10; var13 < var10 + arg5; var13++) {
            if (var13 >= 0 && this.field1769 > var13) {
                for (int var14 = var8; var14 < (arg6 + var8); var14++) {
                    if (var14 >= 0 && var14 < this.field1751) {
                        this.method807(var13, -122, var9, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)V", line = 1660)
    public final void method825(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1771;
        field1772++;
        if (arg0 == -9873) {
            int var5 = arg2 - this.field1748;
            this.field1766[var5][var4] = class102.method799(this.field1766[var5][var4], 2097152);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(II)V", line = 1676)
    public class104(int arg0, int arg1) {
        this.field1769 = arg0;
        this.field1748 = 0;
        this.field1751 = arg1;
        this.field1771 = 0;
        this.field1766 = new int[this.field1769][this.field1751];
        this.method815(64);
    }
}
