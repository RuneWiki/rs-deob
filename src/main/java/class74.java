import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class74 extends class97 {

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
    public int field1981 = -1;

    @OriginalMember(owner = "client!mc", name = "rb", descriptor = "I")
    public int field1988 = 0;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "Z")
    public boolean field1972 = true;

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "I")
    public int field1983 = -1;

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "Lke;")
    private static class65 field1984 = class1.method17("Public chat", -125);

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "Lke;")
    public static class65 field1964 = field1984;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "Lke;")
    public static class65 field1985 = class1.method17("mapscene", -118);

    @OriginalMember(owner = "client!mc", name = "qb", descriptor = "Lke;")
    private static class65 field1987 = class1.method17("Loading textures )2 ", -111);

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lke;")
    public static class65 field1961 = field1987;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Z")
    public static boolean field1963 = false;

    @OriginalMember(owner = "client!mc", name = "ub", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!mc", name = "vb", descriptor = "Lke;")
    public static class65 field1992 = class1.method17("hitmarks", -116);

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public static int field1969 = 2301979;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "Lke;")
    private static class65 field1970 = class1.method17("purple:", -112);

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "Lke;")
    public static class65 field1978 = field1970;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "Lqd;")
    public static class100 field1967 = new class100(64);

    @OriginalMember(owner = "client!mc", name = "yb", descriptor = "Lke;")
    public static class65 field1995 = class1.method17("Ignorieren", -119);

    @OriginalMember(owner = "client!mc", name = "zb", descriptor = "Lke;")
    public static class65 field1996 = class1.method17("Registrierter Benutzer", -117);

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
    public int field1977;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!mc", name = "sb", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!mc", name = "tb", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!mc", name = "wb", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!mc", name = "xb", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!mc", name = "Ab", descriptor = "J")
    public static long field1997;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "[I")
    public static int[] field1975;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "[I")
    public static int[] field1980;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILg;)V", line = 4)
    public final void method650(int arg0, int arg1, class39 arg2) {
        if (arg1 > -1) {
            field1964 = null;
        }
        field1965++;
        while (true) {
            int var4 = arg2.method334(105);
            if (var4 == 0) {
                return;
            }
            this.method660(arg2, var4, 113, arg0);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 32)
    public static void method651(boolean arg0) {
        field1978 = null;
        field1967 = null;
        field1984 = null;
        field1970 = null;
        field1992 = null;
        field1995 = null;
        field1964 = null;
        field1975 = null;
        field1980 = null;
        if (!arg0) {
            field1996 = null;
            field1987 = null;
            field1985 = null;
            field1961 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 58)
    public final void method652(int arg0) {
        field1962++;
        if (this.field1983 != arg0) {
            this.method655(this.field1983, (byte) -91);
            this.field1977 = this.field1966;
            this.field1982 = this.field1993;
            this.field1994 = this.field1979;
        }
        this.method655(this.field1988, (byte) -91);
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(B)V", line = 82)
    public static final void method653(byte arg0) {
        int var1 = -103 / ((-arg0 - 16) / 41);
        while (class58.field1575.method647(class54.field1392, false) >= 11) {
            int var2 = class58.field1575.method649(104, 11);
            if (var2 == 2047) {
                break;
            }
            boolean var3 = false;
            if (class52.field1324[var2] == null) {
                var3 = true;
                class52.field1324[var2] = new class114();
                if (class112.field2795[var2] != null) {
                    class52.field1324[var2].method932(class112.field2795[var2], false);
                }
            }
            class10.field187[class72.field1895++] = var2;
            class114 var4 = class52.field1324[var2];
            var4.field1110 = class76.field2028;
            int var5 = class33.field870[class58.field1575.method649(40, 3)];
            if (var3) {
                var4.field1081 = var5;
            }
            int var6 = class58.field1575.method649(33, 1);
            if (var6 == 1) {
                class46.field1211[class75.field2019++] = var2;
            }
            int var7 = class58.field1575.method649(97, 5);
            int var8 = class58.field1575.method649(71, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class58.field1575.method649(30, 1);
            if (var7 > 15) {
                var7 -= 32;
            }
            var4.method362(var9 == 1, class32.field833.field1097[0] + var8, (byte) 125, class32.field833.field1105[0] + var7);
        }
        class58.field1575.method643((byte) -108);
        field1973++;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)Ljb;", line = 149)
    public static final class55 method654(int arg0, int arg1) {
        field1974++;
        class55 var2 = (class55) class20.field481.method833((byte) -53, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field2425.method477(arg1, (byte) 127, arg0);
        class55 var4 = new class55();
        var4.field1439 = arg0;
        if (var3 != null) {
            var4.method445(new class39(var3), (byte) 15);
        }
        var4.method451(arg1 - 47);
        class20.field481.method836((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)V", line = 179)
    private final void method655(int arg0, byte arg1) {
        field1968++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1 != -91) {
            return;
        }
        double var9 = 0.0D;
        double var11 = var3;
        double var13 = var3;
        if (var3 > var5) {
            var13 = var5;
        }
        if (var7 < var13) {
            var13 = var7;
        }
        double var15 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var17 = (var11 + var13) / 2.0D;
        this.field1993 = (int) (var17 * 256.0D);
        if (var11 != var13) {
            if (var17 < 0.5D) {
                var15 = (var11 - var13) / (var11 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var13) / (2.0D - var11 + -var13);
            }
            if (var3 == var11) {
                var9 = (var5 - var7) / (var11 - var13);
            } else if (var5 == var11) {
                var9 = (var7 - var3) / (-var13 + var11) + 2.0D;
            } else if (var7 == var11) {
                var9 = (var3 - var5) / (-var13 + var11) + 4.0D;
            }
        }
        if (this.field1993 < 0) {
            this.field1993 = 0;
        } else if (this.field1993 > 255) {
            this.field1993 = 255;
        }
        this.field1979 = (int) (var15 * 256.0D);
        if (this.field1979 < 0) {
            this.field1979 = 0;
        } else if (this.field1979 > 255) {
            this.field1979 = 255;
        }
        double var19 = var9 / 6.0D;
        this.field1966 = (int) (var19 * 256.0D);
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V", line = 267)
    public static final void method656(int arg0) {
        class10.field209.method834(5875);
        field1976++;
        class94.field2474.method834(5875);
        class77.field2059.method834(5875);
        if (arg0 > -90) {
            method659(22);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)I", line = 297)
    public static final int method657(byte arg0, int arg1, int arg2) {
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        int var4 = -6 / ((63 - arg0) / 47);
        while (arg1 != 0) {
            int var5 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var5;
        }
        field1971++;
        return arg2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JZ)V", line = 334)
    public static final void method658(long arg0, boolean arg1) {
        field1986++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class51.field1311; var3++) {
            if (class35.field885[var3] == arg0) {
                class116.field2910 = true;
                class51.field1311--;
                class26.field643++;
                for (int var4 = var3; var4 < class51.field1311; var4++) {
                    class35.field885[var4] = class35.field885[var4 + 1];
                }
                class56.field1453.method642(202, false);
                class56.field1453.method323(arg0, 45);
                break;
            }
        }
        if (arg1) {
            method654(0, -107);
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V", line = 383)
    public static final void method659(int arg0) {
        int var1 = -8 / ((arg0 - 55) / 40);
        field1990++;
        if (class52.field1317 != 0 || class46.field1215 != 1) {
            return;
        }
        int var2 = class115.field2901 - 4 - 5;
        int var3 = class1.field42 - 550 - 25;
        if (var3 < 0 || var2 < 0 || var3 >= 146 || var2 >= 151) {
            return;
        }
        var3 -= 73;
        int var4 = class125.field3031 + class112.field2793 & 0x7FF;
        int var5 = class127.field3074[var4];
        int var6 = (field1991 + 256) * var5 >> 8;
        var2 -= 75;
        int var7 = class127.field3079[var4];
        int var8 = (field1991 + 256) * var7 >> 8;
        int var9 = var2 * var6 + var3 * var8 >> 11;
        int var10 = class32.field833.field1067 + var9 >> 7;
        int var11 = var2 * var8 - var3 * var6 >> 11;
        int var12 = class32.field833.field1070 - var11 >> 7;
        boolean var13 = class24.method196(0, 0, 0, var12, 1, 0, (byte) -119, class32.field833.field1105[0], var10, true, 0, class32.field833.field1097[0]);
        if (!var13) {
            return;
        }
        class56.field1453.method305(false, var3);
        class56.field1453.method305(false, var2);
        class56.field1453.method310((byte) 97, class125.field3031);
        class56.field1453.method305(false, 57);
        class56.field1453.method305(false, class112.field2793);
        class56.field1453.method305(false, field1991);
        class56.field1453.method305(false, 89);
        class56.field1453.method310((byte) 126, class32.field833.field1067);
        class56.field1453.method310((byte) 85, class32.field833.field1070);
        class56.field1453.method305(false, class24.field603);
        class56.field1453.method305(false, 63);
        return;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lg;III)V", line = 469)
    private final void method660(class39 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 86) {
            method653((byte) 101);
        }
        if (arg1 == 1) {
            this.field1988 = arg0.method308((byte) -118);
        } else if (arg1 == 2) {
            this.field1981 = arg0.method334(115);
        } else if (arg1 == 5) {
            this.field1972 = false;
        } else if (arg1 == 7) {
            this.field1983 = arg0.method308((byte) -118);
        }
        field1989++;
    }
}
