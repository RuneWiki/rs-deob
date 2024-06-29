import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class89 {

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    private int field2002;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    private int field1982;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    private int field1991;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[[I")
    public int[][] field1983;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field1986 = 0;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "Lrd;")
    public static class114 field1987 = class84.method656("Benutzeroberfl-=che geladen)3", (byte) 124);

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Lrd;")
    public static class114 field1984 = class84.method656("", (byte) 124);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field1971 = 5063219;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Lrd;")
    private static class114 field1993 = class84.method656(" has logged in)3", (byte) 122);

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Lrd;")
    private static class114 field1997 = class84.method656("white:", (byte) 117);

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "Lrd;")
    public static class114 field1994 = field1997;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "Lrd;")
    public static class114 field1999 = field1993;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Lrd;")
    public static class114 field2001 = class84.method656("hitmarks", (byte) 121);

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Z")
    public static boolean field2003 = false;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Loa;")
    public static class93 field1977;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Z")
    public static boolean field1980;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1998++;
        if (arg2 == arg4 && arg1 == arg6) {
            return true;
        }
        int var8 = arg6 - this.field1982;
        int var9 = arg2 - this.field2002;
        int var10 = arg4 - this.field2002;
        int var11 = arg1 - this.field1982;
        if (arg3 == 0) {
            if (arg5 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1983[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1983[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1983[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1983[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1983[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field1983[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1983[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field1983[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var9 == var10 && var8 + 1 == var11 && (this.field1983[var9][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var8 - 1 == var11 && (this.field1983[var9][var11] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field1983[var9][var11] & 0x80) == 0) {
                return true;
            }
        }
        if (arg0 != -359) {
            field1987 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZBII)V")
    public final void method670(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field2002;
        field1978++;
        int var8 = arg0 - this.field1982;
        if (arg3 != -102) {
            field1986 = 54;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method680(40, var8, var7, 128);
                this.method680(40, var8, var7 - 1, 8);
            }
            if (arg5 == 1) {
                this.method680(40, var8, var7, 2);
                this.method680(40, var8 + 1, var7, 32);
            }
            if (arg5 == 2) {
                this.method680(40, var8, var7, 8);
                this.method680(40, var8, var7 + 1, 128);
            }
            if (arg5 == 3) {
                this.method680(40, var8, var7, 32);
                this.method680(40, var8 - 1, var7, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method680(40, var8, var7, 1);
                this.method680(40, var8 + 1, var7 + -1, 16);
            }
            if (arg5 == 1) {
                this.method680(40, var8, var7, 4);
                this.method680(arg3 ^ 0xFFFFFFB2, var8 + 1, var7 - -1, 64);
            }
            if (arg5 == 2) {
                this.method680(40, var8, var7, 16);
                this.method680(arg3 + 142, var8 + -1, var7 + 1, 1);
            }
            if (arg5 == 3) {
                this.method680(40, var8, var7, 64);
                this.method680(arg3 ^ 0xFFFFFFB2, var8 - 1, var7 + -1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method680(40, var8, var7, 130);
                this.method680(40, var8, var7 - 1, 8);
                this.method680(40, var8 + 1, var7, 32);
            }
            if (arg5 == 1) {
                this.method680(40, var8, var7, 10);
                this.method680(40, var8 + 1, var7, 32);
                this.method680(40, var8, var7 + 1, 128);
            }
            if (arg5 == 2) {
                this.method680(40, var8, var7, 40);
                this.method680(40, var8, var7 + 1, 128);
                this.method680(40, var8 - 1, var7, 2);
            }
            if (arg5 == 3) {
                this.method680(40, var8, var7, 160);
                this.method680(arg3 ^ 0xFFFFFFB2, var8 - 1, var7, 2);
                this.method680(40, var8, var7 - 1, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method680(40, var8, var7, 65536);
                this.method680(arg3 ^ 0xFFFFFFB2, var8, var7 - 1, 4096);
            }
            if (arg5 == 1) {
                this.method680(40, var8, var7, 1024);
                this.method680(40, var8 + 1, var7, 16384);
            }
            if (arg5 == 2) {
                this.method680(40, var8, var7, 4096);
                this.method680(arg3 + 142, var8, var7 + 1, 65536);
            }
            if (arg5 == 3) {
                this.method680(40, var8, var7, 16384);
                this.method680(40, var8 - 1, var7, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method680(40, var8, var7, 512);
                this.method680(40, var8 + 1, var7 + -1, 8192);
            }
            if (arg5 == 1) {
                this.method680(40, var8, var7, 2048);
                this.method680(40, var8 + 1, var7 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method680(arg3 + 142, var8, var7, 8192);
                this.method680(40, var8 - 1, var7 + 1, 512);
            }
            if (arg5 == 3) {
                this.method680(40, var8, var7, 32768);
                this.method680(40, var8 - 1, var7 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method680(40, var8, var7, 66560);
            this.method680(40, var8, var7 - 1, 4096);
            this.method680(40, var8 + 1, var7, 16384);
        }
        if (arg5 == 1) {
            this.method680(arg3 ^ 0xFFFFFFB2, var8, var7, 5120);
            this.method680(40, var8 + 1, var7, 16384);
            this.method680(40, var8, var7 + 1, 65536);
        }
        if (arg5 == 2) {
            this.method680(40, var8, var7, 20480);
            this.method680(40, var8, var7 + 1, 65536);
            this.method680(40, var8 - 1, var7, 1024);
        }
        if (arg5 == 3) {
            this.method680(40, var8, var7, 81920);
            this.method680(40, var8 - 1, var7, 1024);
            this.method680(40, var8, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lpb;Lpb;I)I")
    public static final int method671(class100 arg0, class100 arg1, int arg2) {
        field1988++;
        int var3 = arg2;
        if (arg1.method775((byte) -90, class56.field1172, class42.field864)) {
            var3 = arg2 + 1;
        }
        if (arg0.method775((byte) -19, class69.field1487, class42.field864)) {
            var3++;
        }
        if (arg0.method775((byte) -22, class58.field1206, class42.field864)) {
            var3++;
        }
        if (arg0.method775((byte) -20, class12.field279, class42.field864)) {
            var3++;
        }
        if (arg0.method775((byte) -126, class112.field2627, class42.field864)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZIIII)V")
    public final void method672(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        if (arg2) {
            var8 += 131072;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var9 = arg5;
            arg5 = arg0;
            arg0 = var9;
        }
        int var10 = arg4 - this.field1982;
        if (arg1 != 0) {
            this.method674(-107, -13, (byte) -117);
        }
        field1985++;
        int var11 = arg6 - this.field2002;
        for (int var12 = var11; var12 < arg5 + var11; var12++) {
            if (var12 >= 0 && var12 < this.field1991) {
                for (int var13 = var10; var13 < var10 + arg0; var13++) {
                    if (var13 >= 0 && this.field1975 > var13) {
                        this.method677(var12, var8, (byte) 122, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public final void method673(int arg0) {
        field1992++;
        if (arg0 != -3390) {
            this.method678(8, 8, -87, -82, true, 82, -85);
        }
        for (int var2 = 0; var2 < this.field1991; var2++) {
            for (int var3 = 0; var3 < this.field1975; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1991 - 1 == var2 || this.field1975 - 1 == var3) {
                    this.field1983[var2][var3] = 16777215;
                } else {
                    this.field1983[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIB)V")
    public final void method674(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field2002;
        if (arg2 >= -20) {
            this.method675(3, -21, 35, -112, -125, -80, -87);
        }
        int var5 = arg1 - this.field1982;
        field1976++;
        this.field1983[var4][var5] = class38.method271(this.field1983[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1973++;
        if (arg0 == arg6 && arg1 == arg2) {
            return true;
        }
        int var8 = arg2 - this.field1982;
        int var9 = arg1 - this.field1982;
        int var10 = arg0 - this.field2002;
        if (arg3 >= -90) {
            this.method673(51);
        }
        int var11 = arg6 - this.field2002;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field1983[var11][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1983[var11][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field1983[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1983[var11][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field1983[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1983[var11][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field1983[var11][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1983[var11][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field1983[var11][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field1983[var11][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var11 && var8 == var9 && (this.field1983[var11][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var11 && var8 == var9 && (this.field1983[var11][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(IIZBII)V")
    public final void method676(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field2002;
        field2000++;
        int var8 = arg4 - this.field1982;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method677(var7, 128, (byte) 122, var8);
                this.method677(var7 - 1, 8, (byte) 122, var8);
            }
            if (arg0 == 1) {
                this.method677(var7, 2, (byte) 122, var8);
                this.method677(var7, 32, (byte) 122, var8 + 1);
            }
            if (arg0 == 2) {
                this.method677(var7, 8, (byte) 122, var8);
                this.method677(var7 + 1, 128, (byte) 122, var8);
            }
            if (arg0 == 3) {
                this.method677(var7, 32, (byte) 122, var8);
                this.method677(var7, 2, (byte) 122, var8 - 1);
            }
        }
        if (arg3 != 111) {
            field1993 = null;
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method677(var7, 1, (byte) 122, var8);
                this.method677(var7 - 1, 16, (byte) 122, var8 + 1);
            }
            if (arg0 == 1) {
                this.method677(var7, 4, (byte) 122, var8);
                this.method677(var7 + 1, 64, (byte) 122, var8 + 1);
            }
            if (arg0 == 2) {
                this.method677(var7, 16, (byte) 122, var8);
                this.method677(var7 + 1, 1, (byte) 122, var8 - 1);
            }
            if (arg0 == 3) {
                this.method677(var7, 64, (byte) 122, var8);
                this.method677(var7 - 1, 4, (byte) 122, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method677(var7, 130, (byte) 122, var8);
                this.method677(var7 - 1, 8, (byte) 122, var8);
                this.method677(var7, 32, (byte) 122, var8 + 1);
            }
            if (arg0 == 1) {
                this.method677(var7, 10, (byte) 122, var8);
                this.method677(var7, 32, (byte) 122, var8 + 1);
                this.method677(var7 + 1, 128, (byte) 122, var8);
            }
            if (arg0 == 2) {
                this.method677(var7, 40, (byte) 122, var8);
                this.method677(var7 + 1, 128, (byte) 122, var8);
                this.method677(var7, 2, (byte) 122, var8 - 1);
            }
            if (arg0 == 3) {
                this.method677(var7, 160, (byte) 122, var8);
                this.method677(var7, 2, (byte) 122, var8 - 1);
                this.method677(var7 - 1, 8, (byte) 122, var8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method677(var7, 65536, (byte) 122, var8);
                this.method677(var7 - 1, 4096, (byte) 122, var8);
            }
            if (arg0 == 1) {
                this.method677(var7, 1024, (byte) 122, var8);
                this.method677(var7, 16384, (byte) 122, var8 + 1);
            }
            if (arg0 == 2) {
                this.method677(var7, 4096, (byte) 122, var8);
                this.method677(var7 + 1, 65536, (byte) 122, var8);
            }
            if (arg0 == 3) {
                this.method677(var7, 16384, (byte) 122, var8);
                this.method677(var7, 1024, (byte) 122, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method677(var7, 512, (byte) 122, var8);
                this.method677(var7 - 1, 8192, (byte) 122, var8 + 1);
            }
            if (arg0 == 1) {
                this.method677(var7, 2048, (byte) 122, var8);
                this.method677(var7 + 1, 32768, (byte) 122, var8 + 1);
            }
            if (arg0 == 2) {
                this.method677(var7, 8192, (byte) 122, var8);
                this.method677(var7 + 1, 512, (byte) 122, var8 - 1);
            }
            if (arg0 == 3) {
                this.method677(var7, 32768, (byte) 122, var8);
                this.method677(var7 - 1, 2048, (byte) 122, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method677(var7, 66560, (byte) 122, var8);
            this.method677(var7 - 1, 4096, (byte) 122, var8);
            this.method677(var7, 16384, (byte) 122, var8 + 1);
        }
        if (arg0 == 1) {
            this.method677(var7, 5120, (byte) 122, var8);
            this.method677(var7, 16384, (byte) 122, var8 + 1);
            this.method677(var7 + 1, 65536, (byte) 122, var8);
        }
        if (arg0 == 2) {
            this.method677(var7, 20480, (byte) 122, var8);
            this.method677(var7 + 1, 65536, (byte) 122, var8);
            this.method677(var7, 1024, (byte) 122, var8 - 1);
        }
        if (arg0 == 3) {
            this.method677(var7, 81920, (byte) 122, var8);
            this.method677(var7, 1024, (byte) 122, var8 - 1);
            this.method677(var7 - 1, 4096, (byte) 122, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIBI)V")
    private final void method677(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 122) {
            this.method674(-32, 105, (byte) -24);
        }
        this.field1983[arg0][arg3] = class96.method737(this.field1983[arg0][arg3], 16777215 - arg1);
        field1981++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIZII)V")
    public final void method678(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 != 20850) {
            method671(null, null, 12);
        }
        field1995++;
        int var8 = arg6 - this.field1982;
        int var9 = arg3 - this.field2002;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg2;
            arg2 = arg0;
            arg0 = var10;
        }
        int var11 = 256;
        if (arg4) {
            var11 += 131072;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && this.field1991 > var12) {
                for (int var13 = var8; var13 < arg0 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field1975) {
                        this.method680(40, var13, var12, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public static void method679(int arg0) {
        field1984 = null;
        field1999 = null;
        field1977 = null;
        field1994 = null;
        field2001 = null;
        field1993 = null;
        field1987 = null;
        field1997 = null;
        int var1 = 116 % ((-arg0 - 45) / 39);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIII)V")
    private final void method680(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 40) {
            this.field1975 = -67;
        }
        this.field1983[arg2][arg1] = class38.method271(this.field1983[arg2][arg1], arg3);
        field1974++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public final void method681(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2002;
        int var5 = arg2 - this.field1982;
        if (arg0 != -4877) {
            field2003 = false;
        }
        this.field1983[var4][var5] = class96.method737(this.field1983[var4][var5], 14680063);
        field1990++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BIIIIIII)Z")
    public final boolean method682(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = arg2 + arg1 - 1;
        if (arg0 > -118) {
            field1999 = null;
        }
        field1979++;
        int var10 = arg3 + arg6 - 1;
        if (arg4 >= arg2 && var9 >= arg4 && arg3 <= arg7 && var10 >= arg7) {
            return true;
        } else if (arg2 - 1 == arg4 && arg3 <= arg7 && var10 >= arg7 && (this.field1983[arg4 - this.field2002][arg7 - this.field1982] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg3 <= arg7 && var10 >= arg7 && (this.field1983[arg4 - this.field2002][arg7 - this.field1982] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg7 && arg4 >= arg2 && arg4 <= var9 && (this.field1983[arg4 - this.field2002][arg7 - this.field1982] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg7 && arg2 <= arg4 && arg4 <= var9 && (this.field1983[arg4 - this.field2002][arg7 - this.field1982] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(II)V")
    public class89(int arg0, int arg1) {
        this.field1975 = arg1;
        this.field2002 = 0;
        this.field1982 = 0;
        this.field1991 = arg0;
        this.field1983 = new int[this.field1991][this.field1975];
        this.method673(-3390);
    }
}
