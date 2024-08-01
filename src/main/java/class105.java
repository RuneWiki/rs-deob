import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lb")
public class class105 {

    @OriginalMember(owner = "lb", name = "t", descriptor = "I")
    private int field2082 = 0;

    @OriginalMember(owner = "lb", name = "n", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "lb", name = "v", descriptor = "I")
    private int field2084;

    @OriginalMember(owner = "lb", name = "d", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "lb", name = "g", descriptor = "[[I")
    public int[][] field2069;

    @OriginalMember(owner = "lb", name = "e", descriptor = "I")
    public static int field2067 = -2;

    @OriginalMember(owner = "lb", name = "p", descriptor = "Llf;")
    private static class109 field2078 = class35.method275("Loading interfaces )2 ", 2);

    @OriginalMember(owner = "lb", name = "u", descriptor = "Llf;")
    private static class109 field2083 = class35.method275("Malformed login packet)3", 2);

    @OriginalMember(owner = "lb", name = "w", descriptor = "Llf;")
    public static class109 field2085 = field2083;

    @OriginalMember(owner = "lb", name = "r", descriptor = "Llf;")
    public static class109 field2080 = field2078;

    @OriginalMember(owner = "lb", name = "A", descriptor = "Llf;")
    private static class109 field2089 = class35.method275("Too many connections from your address)3", 2);

    @OriginalMember(owner = "lb", name = "s", descriptor = "Llf;")
    public static class109 field2081 = field2089;

    @OriginalMember(owner = "lb", name = "c", descriptor = "Lrc;")
    public static class160 field2065 = new class160(64);

    @OriginalMember(owner = "lb", name = "C", descriptor = "Llf;")
    public static class109 field2091 = class35.method275(")1j", 2);

    @OriginalMember(owner = "lb", name = "D", descriptor = "Lja;")
    public static class86 field2092 = new class86(8);

    @OriginalMember(owner = "lb", name = "F", descriptor = "I")
    public static int field2094 = 0;

    @OriginalMember(owner = "lb", name = "G", descriptor = "Llf;")
    public static class109 field2095 = class35.method275("Spieler", 2);

    @OriginalMember(owner = "lb", name = "a", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "lb", name = "b", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "lb", name = "f", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "lb", name = "h", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "lb", name = "i", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "lb", name = "j", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "lb", name = "k", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "lb", name = "l", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "lb", name = "m", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "lb", name = "o", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "lb", name = "q", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "lb", name = "x", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "lb", name = "y", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "lb", name = "z", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "lb", name = "B", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "lb", name = "E", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZIIIIZI)V")
    public final void method749(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field2082;
        field2088++;
        if (!arg0) {
            method760(null, -82, -105);
        }
        int var9 = arg3 - this.field2084;
        int var10 = 256;
        if (arg1 == 1 || arg1 == 3) {
            int var11 = arg2;
            arg2 = arg4;
            arg4 = var11;
        }
        if (arg5) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < arg2 + var8; var12++) {
            if (var12 >= 0 && this.field2066 > var12) {
                for (int var13 = var9; var13 < arg4 + var9; var13++) {
                    if (var13 >= 0 && this.field2076 > var13) {
                        this.method761(var10, var13, -23178, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2090++;
        if (arg1 == arg4 && arg2 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field2082;
        int var9 = arg5 - this.field2084;
        int var10 = arg2 - this.field2084;
        if (arg0 != 32) {
            this.method762(-29, -85, -54, -66, 66, (byte) -22, 46, -28);
        }
        int var11 = arg4 - this.field2082;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg6 = arg6 + 2 & 0x3;
            }
            if (arg6 == 0) {
                if (var11 + 1 == var8 && var9 == var10 && (this.field2069[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2069[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field2069[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field2069[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field2069[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2069[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var11 + 1 == var8 && var9 == var10 && (this.field2069[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field2069[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 8) {
            if (var8 == var11 && var10 + 1 == var9 && (this.field2069[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var10 - 1 == var9 && (this.field2069[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var10 && (this.field2069[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var10 && (this.field2069[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Z)V")
    public final void method751(boolean arg0) {
        for (int var2 = 0; var2 < this.field2066; var2++) {
            for (int var3 = 0; var3 < this.field2076; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field2066 - 5 || var3 >= this.field2076 - 5) {
                    this.field2069[var2][var3] = 16777215;
                } else {
                    this.field2069[var2][var3] = 16777216;
                }
            }
        }
        field2087++;
        if (!arg0) {
            this.field2066 = -127;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIZZII)V")
    public final void method752(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        field2077++;
        int var7 = arg4 - this.field2084;
        int var8 = 256;
        if (arg3) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field2082;
        int var10 = var9;
        if (!arg2) {
            return;
        }
        while (var10 < var9 + arg1) {
            if (var10 >= 0 && this.field2066 > var10) {
                for (int var11 = var7; var11 < var7 + arg5; var11++) {
                    if (var11 >= 0 && this.field2076 > var11) {
                        this.method755(var10, var8, -31133, var11);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(Z)V")
    public static void method753(boolean arg0) {
        field2078 = null;
        field2065 = null;
        field2080 = null;
        field2089 = null;
        field2095 = null;
        field2085 = null;
        field2081 = null;
        field2083 = null;
        field2091 = null;
        if (arg0) {
            field2091 = null;
        }
        field2092 = null;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(JI)V")
    public static final void method754(long arg0, int arg1) {
        field2073++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != 1) {
            method754(42L, -95);
        }
        for (int var3 = 0; var3 < class199.field3786; var3++) {
            if (class109.field2160[var3] == arg0) {
                class199.field3786--;
                for (int var4 = var3; var4 < class199.field3786; var4++) {
                    class114.field2265[var4] = class114.field2265[var4 + 1];
                    class93.field1923[var4] = class93.field1923[var4 + 1];
                    class109.field2160[var4] = class109.field2160[var4 + 1];
                    class142.field2744[var4] = class142.field2744[var4 + 1];
                }
                class23.field528++;
                class107.field2127 = class75.field1442;
                class200.field3850.method1339((byte) 113, 238);
                class200.field3850.method592(arg0, -562765672);
                return;
            }
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIII)V")
    private final void method755(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -31133) {
            this.method763(22, 71, (byte) -52);
        }
        field2086++;
        this.field2069[arg0][arg3] = class31.method262(this.field2069[arg0][arg3], arg1);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IZIIII)V")
    public final void method756(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2064++;
        int var7 = arg5 - this.field2084;
        int var8 = arg0 - this.field2082;
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method755(var8, 128, arg3 ^ 0x799C, var7);
                this.method755(var8 - 1, 8, -31133, var7);
            }
            if (arg2 == 1) {
                this.method755(var8, 2, -31133, var7);
                this.method755(var8, 32, -31133, var7 + 1);
            }
            if (arg2 == 2) {
                this.method755(var8, 8, -31133, var7);
                this.method755(var8 + 1, 128, -31133, var7);
            }
            if (arg2 == 3) {
                this.method755(var8, 32, -31133, var7);
                this.method755(var8, 2, -31133, var7 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method755(var8, 1, -31133, var7);
                this.method755(var8 - 1, 16, -31133, var7 + 1);
            }
            if (arg2 == 1) {
                this.method755(var8, 4, -31133, var7);
                this.method755(var8 + 1, 64, -31133, var7 + 1);
            }
            if (arg2 == 2) {
                this.method755(var8, 16, -31133, var7);
                this.method755(var8 + 1, 1, arg3 - 31132, var7 + -1);
            }
            if (arg2 == 3) {
                this.method755(var8, 64, arg3 - 31132, var7);
                this.method755(var8 - 1, 4, -31133, var7 - 1);
            }
        }
        if (arg3 != -1) {
            this.method758(108, -28, 116);
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method755(var8, 130, -31133, var7);
                this.method755(var8 - 1, 8, -31133, var7);
                this.method755(var8, 32, -31133, var7 + 1);
            }
            if (arg2 == 1) {
                this.method755(var8, 10, -31133, var7);
                this.method755(var8, 32, arg3 ^ 0x799C, var7 + 1);
                this.method755(var8 + 1, 128, -31133, var7);
            }
            if (arg2 == 2) {
                this.method755(var8, 40, -31133, var7);
                this.method755(var8 + 1, 128, -31133, var7);
                this.method755(var8, 2, arg3 ^ 0x799C, var7 - 1);
            }
            if (arg2 == 3) {
                this.method755(var8, 160, arg3 - 31132, var7);
                this.method755(var8, 2, -31133, var7 - 1);
                this.method755(var8 - 1, 8, -31133, var7);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method755(var8, 65536, -31133, var7);
                this.method755(var8 - 1, 4096, -31133, var7);
            }
            if (arg2 == 1) {
                this.method755(var8, 1024, -31133, var7);
                this.method755(var8, 16384, -31133, var7 + 1);
            }
            if (arg2 == 2) {
                this.method755(var8, 4096, -31133, var7);
                this.method755(var8 + 1, 65536, arg3 - 31132, var7);
            }
            if (arg2 == 3) {
                this.method755(var8, 16384, -31133, var7);
                this.method755(var8, 1024, arg3 - 31132, var7 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method755(var8, 512, -31133, var7);
                this.method755(var8 - 1, 8192, arg3 ^ 0x799C, var7 + 1);
            }
            if (arg2 == 1) {
                this.method755(var8, 2048, arg3 ^ 0x799C, var7);
                this.method755(var8 + 1, 32768, arg3 ^ 0x799C, var7 + 1);
            }
            if (arg2 == 2) {
                this.method755(var8, 8192, -31133, var7);
                this.method755(var8 + 1, 512, -31133, var7 - 1);
            }
            if (arg2 == 3) {
                this.method755(var8, 32768, arg3 - 31132, var7);
                this.method755(var8 - 1, 2048, -31133, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method755(var8, 66560, -31133, var7);
            this.method755(var8 - 1, 4096, arg3 - 31132, var7);
            this.method755(var8, 16384, arg3 - 31132, var7 + 1);
        }
        if (arg2 == 1) {
            this.method755(var8, 5120, arg3 - 31132, var7);
            this.method755(var8, 16384, -31133, var7 + 1);
            this.method755(var8 + 1, 65536, -31133, var7);
        }
        if (arg2 == 2) {
            this.method755(var8, 20480, -31133, var7);
            this.method755(var8 + 1, 65536, -31133, var7);
            this.method755(var8, 1024, -31133, var7 - 1);
        }
        if (arg2 == 3) {
            this.method755(var8, 81920, arg3 - 31132, var7);
            this.method755(var8, 1024, arg3 ^ 0x799C, var7 - 1);
            this.method755(var8 - 1, 4096, arg3 - 31132, var7);
            return;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIB)V")
    public final void method757(int arg0, int arg1, byte arg2) {
        field2075++;
        int var4 = arg0 - this.field2084;
        int var5 = arg1 - this.field2082;
        if (arg2 != 123) {
            method760(null, -84, 79);
        }
        this.field2069[var5][var4] = class31.method262(this.field2069[var5][var4], 262144);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(III)V")
    public final void method758(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field2084;
        int var5 = arg1 - this.field2082;
        this.field2069[var5][var4] = class31.method262(this.field2069[var5][var4], arg0);
        field2068++;
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(ZIIIII)V")
    public final void method759(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field2082;
        int var8 = arg1 - this.field2084;
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method761(128, var8, -23178, var7);
                this.method761(8, var8, -23178, var7 - 1);
            }
            if (arg3 == 1) {
                this.method761(2, var8, -23178, var7);
                this.method761(32, var8 + 1, -23178, var7);
            }
            if (arg3 == 2) {
                this.method761(8, var8, -23178, var7);
                this.method761(128, var8, -23178, var7 + 1);
            }
            if (arg3 == 3) {
                this.method761(32, var8, -23178, var7);
                this.method761(2, var8 - 1, -23178, var7);
            }
        }
        field2074++;
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method761(1, var8, -23178, var7);
                this.method761(16, var8 + 1, -23178, var7 + -1);
            }
            if (arg3 == 1) {
                this.method761(4, var8, -23178, var7);
                this.method761(64, var8 + 1, -23178, var7 + 1);
            }
            if (arg3 == 2) {
                this.method761(16, var8, -23178, var7);
                this.method761(1, var8 - 1, -23178, var7 + 1);
            }
            if (arg3 == 3) {
                this.method761(64, var8, -23178, var7);
                this.method761(4, var8 - 1, -23178, var7 - 1);
            }
        }
        if (arg5 < 68) {
            this.method756(90, true, -17, 91, 46, 106);
        }
        if (arg4 == 2) {
            if (arg3 == 0) {
                this.method761(130, var8, -23178, var7);
                this.method761(8, var8, -23178, var7 - 1);
                this.method761(32, var8 + 1, -23178, var7);
            }
            if (arg3 == 1) {
                this.method761(10, var8, -23178, var7);
                this.method761(32, var8 + 1, -23178, var7);
                this.method761(128, var8, -23178, var7 + 1);
            }
            if (arg3 == 2) {
                this.method761(40, var8, -23178, var7);
                this.method761(128, var8, -23178, var7 + 1);
                this.method761(2, var8 - 1, -23178, var7);
            }
            if (arg3 == 3) {
                this.method761(160, var8, -23178, var7);
                this.method761(2, var8 - 1, -23178, var7);
                this.method761(8, var8, -23178, var7 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg3 == 0) {
                this.method761(65536, var8, -23178, var7);
                this.method761(4096, var8, -23178, var7 - 1);
            }
            if (arg3 == 1) {
                this.method761(1024, var8, -23178, var7);
                this.method761(16384, var8 + 1, -23178, var7);
            }
            if (arg3 == 2) {
                this.method761(4096, var8, -23178, var7);
                this.method761(65536, var8, -23178, var7 + 1);
            }
            if (arg3 == 3) {
                this.method761(16384, var8, -23178, var7);
                this.method761(1024, var8 - 1, -23178, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg3 == 0) {
                this.method761(512, var8, -23178, var7);
                this.method761(8192, var8 + 1, -23178, var7 - 1);
            }
            if (arg3 == 1) {
                this.method761(2048, var8, -23178, var7);
                this.method761(32768, var8 + 1, -23178, var7 + 1);
            }
            if (arg3 == 2) {
                this.method761(8192, var8, -23178, var7);
                this.method761(512, var8 - 1, -23178, var7 + 1);
            }
            if (arg3 == 3) {
                this.method761(32768, var8, -23178, var7);
                this.method761(2048, var8 - 1, -23178, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method761(66560, var8, -23178, var7);
            this.method761(4096, var8, -23178, var7 - 1);
            this.method761(16384, var8 + 1, -23178, var7);
        }
        if (arg3 == 1) {
            this.method761(5120, var8, -23178, var7);
            this.method761(16384, var8 + 1, -23178, var7);
            this.method761(65536, var8, -23178, var7 + 1);
        }
        if (arg3 == 2) {
            this.method761(20480, var8, -23178, var7);
            this.method761(65536, var8, -23178, var7 + 1);
            this.method761(1024, var8 - 1, -23178, var7);
        }
        if (arg3 == 3) {
            this.method761(81920, var8, -23178, var7);
            this.method761(1024, var8 - 1, -23178, var7);
            this.method761(4096, var8, -23178, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(Lja;II)Llf;")
    public static final class109 method760(class86 arg0, int arg1, int arg2) {
        field2063++;
        try {
            class109 var3 = new class109();
            var3.field2176 = arg0.method560(arg1 ^ arg1);
            if (arg2 < var3.field2176) {
                var3.field2176 = arg2;
            }
            var3.field2182 = new byte[var3.field2176];
            arg0.field1773 += class19.field417.method25(var3.field2182, arg0.field1773, var3.field2176, arg0.field1808, 0, 4581);
            return var3;
        } catch (Exception var4) {
            return class59.field1166;
        }
    }

    @OriginalMember(owner = "lb", name = "<init>", descriptor = "(II)V")
    public class105(int arg0, int arg1) {
        this.field2076 = arg1;
        this.field2084 = 0;
        this.field2066 = arg0;
        this.field2069 = new int[this.field2066][this.field2076];
        this.method751(true);
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(IIII)V")
    private final void method761(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -23178) {
            this.method761(-116, -56, 127, 86);
        }
        field2079++;
        this.field2069[arg3][arg1] = class170.method1140(this.field2069[arg3][arg1], ~arg0);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIIIIBII)Z")
    public final boolean method762(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        int var9 = arg1 + arg0 - 1;
        field2072++;
        int var10 = arg6 + arg4 - 1;
        if (arg1 <= arg7 && arg7 <= var9 && arg2 >= arg6 && arg2 <= var10) {
            return true;
        } else if (arg1 - 1 == arg7 && arg2 >= arg6 && arg2 <= var10 && (this.field2069[arg7 - this.field2082][arg2 - this.field2084] & 0x8) == 0 && (arg3 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg2 >= arg6 && var10 >= arg2 && (this.field2069[arg7 - this.field2082][arg2 - this.field2084] & 0x80) == 0 && (arg3 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg2 && arg7 >= arg1 && arg7 <= var9 && (this.field2069[arg7 - this.field2082][arg2 - this.field2084] & 0x2) == 0 && (arg3 & 0x4) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg1 <= arg7 && arg7 <= var9 && (this.field2069[arg7 - this.field2082][arg2 - this.field2084] & 0x20) == 0 && (arg3 & 0x1) == 0) {
            return true;
        } else {
            return arg5 <= 106;
        }
    }

    @OriginalMember(owner = "lb", name = "b", descriptor = "(IIB)V")
    public final void method763(int arg0, int arg1, byte arg2) {
        if (arg2 > -25) {
            this.method762(21, 106, -84, 30, -92, (byte) 46, -32, -82);
        }
        int var4 = arg1 - this.field2082;
        field2071++;
        int var5 = arg0 - this.field2084;
        this.field2069[var4][var5] = class170.method1140(this.field2069[var4][var5], -262145);
    }

    @OriginalMember(owner = "lb", name = "a", descriptor = "(IIBIIII)Z")
    public final boolean method764(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field2070++;
        if (arg0 == arg4 && arg1 == arg5) {
            return true;
        }
        int var8 = arg4 - this.field2082;
        int var9 = arg0 - this.field2082;
        int var10 = arg5 - this.field2084;
        int var11 = arg1 - this.field2084;
        if (arg3 == 0) {
            if (arg6 == 0) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2069[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2069[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2069[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2069[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
                if (var8 - 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg6 == 0) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2069[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field2069[var9][var10] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2069[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field2069[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10) {
                    return true;
                }
            }
        }
        if (arg2 < 28) {
            this.method752(80, -64, false, false, 71, -20);
        }
        if (arg3 == 9) {
            if (var8 == var9 && var11 + 1 == var10 && (this.field2069[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var11 - 1 == var10 && (this.field2069[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var9 && var10 == var11 && (this.field2069[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }
}
