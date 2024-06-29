import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class87 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    private int field2021;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    private int field2043;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field2027;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    private int field2051;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "[[I")
    public int[][] field2047;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Laf;")
    public static class7 field2034 = class48.method406(40, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static volatile int field2035 = -1;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Laf;")
    private static class7 field2032 = class48.method406(40, "Loaded fonts");

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Laf;")
    public static class7 field2037 = class48.method406(40, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "[I")
    public static int[] field2046 = new int[2048];

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Laf;")
    public static class7 field2033 = class48.method406(40, "scrollbar");

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Laf;")
    public static class7 field2048 = class48.method406(40, "mapback");

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Laf;")
    public static class7 field2031 = field2032;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field2045 = 0;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lnc;")
    public static final class93 method710(int arg0, int arg1) {
        field2023++;
        class93 var2 = (class93) class93.field2162.method395(126, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 6491) {
            byte[] var3 = class133.field3112.method572(12, false, arg0);
            class93 var4 = new class93();
            if (var3 != null) {
                var4.method756(new class122(var3), true);
            }
            var4.method754(0);
            class93.field2162.method388(var4, (long) arg0, arg1 ^ 0x1EA4);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIBZ)V")
    public final void method711(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        if (arg5 != -128) {
            field2046 = null;
        }
        field2039++;
        int var8 = arg2 - this.field2027;
        int var9 = 256;
        int var10 = arg0 - this.field2043;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg4;
            arg4 = arg3;
            arg3 = var11;
        }
        if (arg6) {
            var9 += 131072;
        }
        for (int var12 = var10; var12 < arg4 + var10; var12++) {
            if (var12 >= 0 && this.field2021 > var12) {
                for (int var13 = var8; var13 < var8 + arg3; var13++) {
                    if (var13 >= 0 && var13 < this.field2051) {
                        this.method714(var13, var12, 0, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public final void method712(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2027;
        field2028++;
        int var5 = arg0 - this.field2043;
        this.field2047[var5][var4] = class141.method1150(this.field2047[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIZB)V")
    public final void method713(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte arg6) {
        field2049++;
        int var8 = arg1 - this.field2043;
        int var9 = 256;
        int var10 = arg4 - this.field2027;
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg2;
            arg2 = arg0;
            arg0 = var11;
        }
        int var12 = 127 / ((-arg6 - 73) / 39);
        if (arg5) {
            var9 += 131072;
        }
        for (int var13 = var8; var13 < arg2 + var8; var13++) {
            if (var13 >= 0 && var13 < this.field2021) {
                for (int var14 = var10; var14 < var10 + arg0; var14++) {
                    if (var14 >= 0 && var14 < this.field2051) {
                        this.method715(var9, var13, -1, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)V")
    private final void method714(int arg0, int arg1, int arg2, int arg3) {
        field2044++;
        this.field2047[arg1][arg0] = class141.method1150(this.field2047[arg1][arg0], arg3);
        if (arg2 != 0) {
            field2032 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IIII)V")
    private final void method715(int arg0, int arg1, int arg2, int arg3) {
        this.field2047[arg1][arg3] = class84.method705(this.field2047[arg1][arg3], ~arg0);
        field2029++;
        if (arg2 != -1) {
            this.field2027 = 48;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZI)V")
    public final void method716(int arg0, boolean arg1, int arg2) {
        int var4 = arg2 - this.field2027;
        int var5 = arg0 - this.field2043;
        this.field2047[var5][var4] = class141.method1150(this.field2047[var5][var4], 2097152);
        if (!arg1) {
            method723(null, false);
        }
        field2038++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2050++;
        if (arg4 == arg5 && arg0 == arg1) {
            return true;
        }
        int var8 = arg0 - this.field2027;
        int var9 = arg5 - this.field2043;
        int var10 = arg4 - this.field2043;
        int var11 = arg1 - this.field2027;
        if (arg3 <= 69) {
            field2034 = null;
        }
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field2047[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2047[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field2047[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field2047[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field2047[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2047[var10][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field2047[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field2047[var10][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field2047[var10][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field2047[var10][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field2047[var10][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field2047[var10][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIZI)Z")
    public final boolean method718(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2042++;
        if (arg5) {
            this.method717(58, -123, -86, -33, -63, -4, 24);
        }
        if (arg4 == arg6 && arg1 == arg3) {
            return true;
        }
        int var8 = arg6 - this.field2043;
        int var9 = arg1 - this.field2027;
        int var10 = arg3 - this.field2027;
        int var11 = arg4 - this.field2043;
        if (arg0 == 0) {
            if (arg2 == 0) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2047[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2047[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2047[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2047[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2047[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2047[var11][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var8 - 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2047[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var8 - 1 == var11 && var9 == var10) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2047[var11][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg0 == 9) {
            if (var8 == var11 && var10 + 1 == var9 && (this.field2047[var11][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var10 - 1 == var9 && (this.field2047[var11][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var11 && var9 == var10 && (this.field2047[var11][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIZII)V")
    public final void method719(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field2043;
        field2036++;
        int var8 = arg0 - this.field2027;
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method714(var8, var7, 0, 128);
                this.method714(var8, var7 - 1, 0, 8);
            }
            if (arg2 == 1) {
                this.method714(var8, var7, 0, 2);
                this.method714(var8 + 1, var7, 0, 32);
            }
            if (arg2 == 2) {
                this.method714(var8, var7, 0, 8);
                this.method714(var8, var7 + 1, 0, 128);
            }
            if (arg2 == 3) {
                this.method714(var8, var7, 0, 32);
                this.method714(var8 - 1, var7, 0, 2);
            }
        }
        if (arg5 < 3) {
            return;
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method714(var8, var7, 0, 1);
                this.method714(var8 + 1, var7 + -1, 0, 16);
            }
            if (arg2 == 1) {
                this.method714(var8, var7, 0, 4);
                this.method714(var8 + 1, var7 - -1, 0, 64);
            }
            if (arg2 == 2) {
                this.method714(var8, var7, 0, 16);
                this.method714(var8 - 1, var7 - -1, 0, 1);
            }
            if (arg2 == 3) {
                this.method714(var8, var7, 0, 64);
                this.method714(var8 - 1, var7 + -1, 0, 4);
            }
        }
        if (arg1 == 2) {
            if (arg2 == 0) {
                this.method714(var8, var7, 0, 130);
                this.method714(var8, var7 - 1, 0, 8);
                this.method714(var8 + 1, var7, 0, 32);
            }
            if (arg2 == 1) {
                this.method714(var8, var7, 0, 10);
                this.method714(var8 + 1, var7, 0, 32);
                this.method714(var8, var7 + 1, 0, 128);
            }
            if (arg2 == 2) {
                this.method714(var8, var7, 0, 40);
                this.method714(var8, var7 + 1, 0, 128);
                this.method714(var8 - 1, var7, 0, 2);
            }
            if (arg2 == 3) {
                this.method714(var8, var7, 0, 160);
                this.method714(var8 - 1, var7, 0, 2);
                this.method714(var8, var7 - 1, 0, 8);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg2 == 0) {
                this.method714(var8, var7, 0, 65536);
                this.method714(var8, var7 - 1, 0, 4096);
            }
            if (arg2 == 1) {
                this.method714(var8, var7, 0, 1024);
                this.method714(var8 + 1, var7, 0, 16384);
            }
            if (arg2 == 2) {
                this.method714(var8, var7, 0, 4096);
                this.method714(var8, var7 + 1, 0, 65536);
            }
            if (arg2 == 3) {
                this.method714(var8, var7, 0, 16384);
                this.method714(var8 - 1, var7, 0, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg2 == 0) {
                this.method714(var8, var7, 0, 512);
                this.method714(var8 + 1, var7 + -1, 0, 8192);
            }
            if (arg2 == 1) {
                this.method714(var8, var7, 0, 2048);
                this.method714(var8 + 1, var7 + 1, 0, 32768);
            }
            if (arg2 == 2) {
                this.method714(var8, var7, 0, 8192);
                this.method714(var8 - 1, var7 + 1, 0, 512);
            }
            if (arg2 == 3) {
                this.method714(var8, var7, 0, 32768);
                this.method714(var8 - 1, var7 + -1, 0, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method714(var8, var7, 0, 66560);
            this.method714(var8, var7 - 1, 0, 4096);
            this.method714(var8 + 1, var7, 0, 16384);
        }
        if (arg2 == 1) {
            this.method714(var8, var7, 0, 5120);
            this.method714(var8 + 1, var7, 0, 16384);
            this.method714(var8, var7 + 1, 0, 65536);
        }
        if (arg2 == 2) {
            this.method714(var8, var7, 0, 20480);
            this.method714(var8, var7 + 1, 0, 65536);
            this.method714(var8 - 1, var7, 0, 1024);
        }
        if (arg2 == 3) {
            this.method714(var8, var7, 0, 81920);
            this.method714(var8 - 1, var7, 0, 1024);
            this.method714(var8, var7 - 1, 0, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method720(boolean arg0) {
        field2033 = null;
        if (!arg0) {
            method723(null, false);
        }
        field2046 = null;
        field2048 = null;
        field2037 = null;
        field2032 = null;
        field2031 = null;
        field2034 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method721(int arg0) {
        if (arg0 != -1) {
            this.method718(18, -5, -61, 23, -32, true, -16);
        }
        for (int var2 = 0; var2 < this.field2021; var2++) {
            for (int var3 = 0; var3 < this.field2051; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2021 - 5 <= var2 || this.field2051 - 5 <= var3) {
                    this.field2047[var2][var3] = 16777215;
                } else {
                    this.field2047[var2][var3] = 16777216;
                }
            }
        }
        field2024++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)V")
    public final void method722(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field2043;
        int var5 = arg0 - this.field2027;
        int var6 = -15 / ((arg2 + 4) / 43);
        field2040++;
        this.field2047[var4][var5] = class84.method705(this.field2047[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method723(Component arg0, boolean arg1) {
        arg0.removeKeyListener(class82.field1882);
        field2041++;
        if (arg1) {
            method710(-43, 120);
        }
        arg0.removeFocusListener(class82.field1882);
        class108.field2639 = -1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2030++;
        int var9 = -4 / ((arg2 - 28) / 59);
        int var10 = arg1 + arg3 - 1;
        int var11 = arg7 + arg4 - 1;
        if (arg0 >= arg4 && arg0 <= var11 && arg6 >= arg3 && var10 >= arg6) {
            return true;
        } else if (arg4 - 1 == arg0 && arg3 <= arg6 && arg6 <= var10 && (this.field2047[arg0 - this.field2043][arg6 - this.field2027] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var11 + 1 == arg0 && arg6 >= arg3 && var10 >= arg6 && (this.field2047[arg0 - this.field2043][arg6 - this.field2027] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg6 && arg0 >= arg4 && var11 >= arg0 && (this.field2047[arg0 - this.field2043][arg6 - this.field2027] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg6 && arg4 <= arg0 && var11 >= arg0 && (this.field2047[arg0 - this.field2043][arg6 - this.field2027] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZIIII)V")
    public final void method725(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 64) {
            this.field2051 = 64;
        }
        int var7 = arg3 - this.field2043;
        field2025++;
        int var8 = arg0 - this.field2027;
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method715(128, var7, -1, var8);
                this.method715(8, var7 - 1, -1, var8);
            }
            if (arg4 == 1) {
                this.method715(2, var7, -1, var8);
                this.method715(32, var7, -1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method715(8, var7, -1, var8);
                this.method715(128, var7 + 1, -1, var8);
            }
            if (arg4 == 3) {
                this.method715(32, var7, -1, var8);
                this.method715(2, var7, -1, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method715(1, var7, -1, var8);
                this.method715(16, var7 - 1, -1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method715(4, var7, -1, var8);
                this.method715(64, var7 + 1, -1, var8 - -1);
            }
            if (arg4 == 2) {
                this.method715(16, var7, -1, var8);
                this.method715(1, var7 + 1, -1, var8 - 1);
            }
            if (arg4 == 3) {
                this.method715(64, var7, arg5 ^ 0xFFFFFFBF, var8);
                this.method715(4, var7 - 1, arg5 ^ 0xFFFFFFBF, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg4 == 0) {
                this.method715(130, var7, -1, var8);
                this.method715(8, var7 - 1, -1, var8);
                this.method715(32, var7, arg5 ^ 0xFFFFFFBF, var8 + 1);
            }
            if (arg4 == 1) {
                this.method715(10, var7, -1, var8);
                this.method715(32, var7, arg5 ^ 0xFFFFFFBF, var8 + 1);
                this.method715(128, var7 + 1, -1, var8);
            }
            if (arg4 == 2) {
                this.method715(40, var7, -1, var8);
                this.method715(128, var7 + 1, -1, var8);
                this.method715(2, var7, -1, var8 - 1);
            }
            if (arg4 == 3) {
                this.method715(160, var7, arg5 - 65, var8);
                this.method715(2, var7, -1, var8 - 1);
                this.method715(8, var7 - 1, arg5 + -65, var8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 == 0) {
                this.method715(65536, var7, -1, var8);
                this.method715(4096, var7 - 1, -1, var8);
            }
            if (arg4 == 1) {
                this.method715(1024, var7, -1, var8);
                this.method715(16384, var7, -1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method715(4096, var7, -1, var8);
                this.method715(65536, var7 + 1, arg5 ^ 0xFFFFFFBF, var8);
            }
            if (arg4 == 3) {
                this.method715(16384, var7, -1, var8);
                this.method715(1024, var7, -1, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg4 == 0) {
                this.method715(512, var7, arg5 - 65, var8);
                this.method715(8192, var7 - 1, -1, var8 + 1);
            }
            if (arg4 == 1) {
                this.method715(2048, var7, arg5 ^ 0xFFFFFFBF, var8);
                this.method715(32768, var7 + 1, -1, var8 + 1);
            }
            if (arg4 == 2) {
                this.method715(8192, var7, -1, var8);
                this.method715(512, var7 + 1, -1, var8 - 1);
            }
            if (arg4 == 3) {
                this.method715(32768, var7, -1, var8);
                this.method715(2048, var7 - 1, -1, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method715(66560, var7, -1, var8);
            this.method715(4096, var7 - 1, -1, var8);
            this.method715(16384, var7, arg5 - 65, var8 + 1);
        }
        if (arg4 == 1) {
            this.method715(5120, var7, -1, var8);
            this.method715(16384, var7, -1, var8 + 1);
            this.method715(65536, var7 + 1, -1, var8);
        }
        if (arg4 == 2) {
            this.method715(20480, var7, -1, var8);
            this.method715(65536, var7 + 1, -1, var8);
            this.method715(1024, var7, arg5 ^ 0xFFFFFFBF, var8 - 1);
        }
        if (arg4 == 3) {
            this.method715(81920, var7, arg5 ^ 0xFFFFFFBF, var8);
            this.method715(1024, var7, arg5 ^ 0xFFFFFFBF, var8 - 1);
            this.method715(4096, var7 - 1, arg5 + -65, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(II)V")
    public class87(int arg0, int arg1) {
        this.field2021 = arg0;
        this.field2043 = 0;
        this.field2027 = 0;
        this.field2051 = arg1;
        this.field2047 = new int[this.field2021][this.field2051];
        this.method721(-1);
    }
}
