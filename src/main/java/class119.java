import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class119 {

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Z")
    public boolean field1937 = true;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    private int field1926 = 128;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    private int field1931 = 128;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "S")
    public short field1941 = 0;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "B")
    public byte field1943 = 0;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public int field1949 = 0;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field1940 = -1;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public int field1948 = 1;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Z")
    public boolean field1936 = false;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field1938 = -1;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Z")
    public boolean field1934 = true;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "S")
    public short field1930 = 0;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "S")
    public short field1947 = 0;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field1932 = -1;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public int field1955 = -1;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    private int field1933 = 0;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public int field1946 = 32;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[Ltl;")
    public class59[] field1929 = new class59[5];

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    private int field1954 = -1;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "Z")
    public boolean field1973 = true;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "B")
    public byte field1953 = -16;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "Z")
    public boolean field1956 = true;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    public int field1972 = -1;

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "B")
    public byte field1985 = -96;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Ltl;")
    public class59 field1959 = class130.field2158;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public int field1935 = -1;

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "I")
    public int field1986 = -1;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "I")
    public int field1981 = -1;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public int field1950 = -1;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public int field1960 = -1;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    private int field1976 = 0;

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    public int field1982 = -1;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    private int field1945 = -1;

    @OriginalMember(owner = "client!ae", name = "qb", descriptor = "I")
    public int field1989 = -1;

    @OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
    public int field1987 = -1;

    @OriginalMember(owner = "client!ae", name = "pb", descriptor = "I")
    public int field1988 = -1;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "S")
    public short field1984 = 0;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field1942 = -1;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field1923 = 0;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "[[[I")
    public static int[][][] field1970 = new int[4][13][13];

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "[I")
    public static int[] field1966 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "Ltl;")
    public static class59 field1979 = class85.method639("Lade Konfiguration )2 ", 9588);

    @OriginalMember(owner = "client!ae", name = "rb", descriptor = "Ltl;")
    public static class59 field1990 = class85.method639(")4p=", 9588);

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[I")
    public static int[] field1951 = new int[4096];

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
    public int field1983;

    @OriginalMember(owner = "client!ae", name = "sb", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "Lme;")
    public static class295 field1964;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "Leh;")
    private class94 field1971;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "[B")
    private byte[] field1965;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "[I")
    private int[] field1939;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[I")
    public int[] field1958;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "[I")
    private int[] field1974;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[S")
    private short[] field1928;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "[S")
    private short[] field1963;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "[S")
    private short[] field1967;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "[S")
    private short[] field1969;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[[I")
    private int[][] field1922;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 8)
    public final void method878(boolean arg0) {
        field1977++;
        if (!arg0) {
            this.method880((class129) null, 64, (byte) -15);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILtl;B)Ltl;", line = 19)
    public final class59 method879(int arg0, class59 arg1, byte arg2) {
        field1962++;
        if (this.field1971 == null) {
            return arg1;
        }
        if (arg2 < 55) {
            method881(true, -40, false, 13, -26, 83, (byte) -20);
        }
        class252 var4 = (class252) this.field1971.method685((long) arg0, 128);
        return var4 == null ? arg1 : var4.field4195;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lqg;IB)Lca;", line = 45)
    public final class57 method880(class129 arg0, int arg1, byte arg2) {
        field1968++;
        if (this.field1958 != null) {
            class119 var4 = this.method890(958);
            return var4 == null ? null : var4.method880(arg0, arg1, (byte) -116);
        } else if (this.field1974 == null) {
            return null;
        } else {
            class57 var5 = (class57) class50.field763.method1483((byte) -74, (long) this.field1983);
            if (arg2 >= -4) {
                method891(26);
            }
            if (var5 == null) {
                boolean var6 = false;
                for (int var7 = 0; var7 < this.field1974.length; var7++) {
                    if (!class31.field432.method2035(this.field1974[var7], 0, 0)) {
                        var6 = true;
                    }
                }
                if (var6) {
                    return null;
                }
                class242[] var8 = new class242[this.field1974.length];
                for (int var9 = 0; var9 < this.field1974.length; var9++) {
                    var8[var9] = class242.method1716(class31.field432, this.field1974[var9], 0);
                }
                class242 var10;
                if (var8.length == 1) {
                    var10 = var8[0];
                } else {
                    var10 = new class242(var8, var8.length);
                }
                if (this.field1967 != null) {
                    for (int var11 = 0; var11 < this.field1967.length; var11++) {
                        if (this.field1965 == null || this.field1965.length <= var11) {
                            var10.method1725(this.field1967[var11], this.field1963[var11]);
                        } else {
                            var10.method1725(this.field1967[var11], class234.field3896[this.field1965[var11] & 0xFF]);
                        }
                    }
                }
                if (this.field1969 != null) {
                    for (int var12 = 0; var12 < this.field1969.length; var12++) {
                        var10.method1711(this.field1969[var12], this.field1928[var12]);
                    }
                }
                var5 = var10.method1702(64, 768, -50, -10, -50);
                class50.field763.method1488((long) this.field1983, var5, 25838);
            }
            if (arg0 != null) {
                var5 = arg0.method949(true, var5, arg1);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIZIIIB)V", line = 160)
    public static final void method881(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1927++;
        if (arg2) {
            class55.method393();
        }
        if (class232.field3811 != null && (arg1 != 3 || class308.field5207 != arg4 || class81.field1283 != arg5)) {
            class128.method938(class308.field5222, 124, class232.field3811);
            class232.field3811 = null;
        }
        if (arg1 == 3 && class232.field3811 == null) {
            class232.field3811 = class12.method84(0, arg4, 0, arg5, class308.field5222, 0);
            if (class232.field3811 != null) {
                class81.field1283 = arg5;
                class308.field5207 = arg4;
                class101.method767((byte) 50, class308.field5222);
            }
        }
        if (arg1 == 3 && class232.field3811 == null) {
            method881(true, class262.field4362, true, arg3, -1, -1, (byte) -76);
            return;
        }
        Container var7;
        if (class232.field3811 != null) {
            var7 = class232.field3811;
        } else if (class253.field4209 == null) {
            var7 = class308.field5222.field2870;
        } else {
            var7 = class253.field4209;
        }
        class312.field5289 = var7.getSize().width;
        class59.field915 = var7.getSize().height;
        if (arg6 >= -47) {
            return;
        }
        if (class253.field4209 == var7) {
            Insets var8 = class253.field4209.getInsets();
            class312.field5289 -= var8.right + var8.left;
            class59.field915 -= var8.top + var8.bottom;
        }
        if (arg1 >= 2) {
            class152.field2498 = class312.field5289;
            class30.field421 = 0;
            class53.field792 = class59.field915;
            class264.field4553 = 0;
        } else {
            class30.field421 = (class312.field5289 - 765) / 2;
            class152.field2498 = 765;
            class264.field4553 = 0;
            class53.field792 = 503;
        }
        if (arg0) {
            class201.method1440(class160.field2607, (byte) 123);
            class45.method317(48, class160.field2607);
            if (class201.field3332 != null) {
                class201.field3332.method1420(class160.field2607, 0);
            }
            class237.field3964.method819(false);
            class300.method2099(class160.field2607, 0);
            class162.method1151((byte) -96, class160.field2607);
            if (class201.field3332 != null) {
                class201.field3332.method1417(0, class160.field2607);
            }
        } else {
            if (class55.field815) {
                class55.method385(class152.field2498, class53.field792);
            }
            class160.field2607.setSize(class152.field2498, class53.field792);
            if (class253.field4209 == var7) {
                Insets var9 = class253.field4209.getInsets();
                class160.field2607.setLocation(var9.left + class30.field421, class264.field4553 + var9.top);
            } else {
                class160.field2607.setLocation(class30.field421, class264.field4553);
            }
        }
        if (arg1 == 0 && arg3 > 0) {
            class55.method408(class160.field2607);
        }
        if (arg2 && arg1 > 0) {
            class160.field2607.setIgnoreRepaint(true);
            if (!class232.field3818) {
                class43.method294();
                class221.field3582 = null;
                class221.field3582 = class236.method1655(class160.field2607, class53.field792, -2049, class152.field2498);
                class272.method1903();
                if (class238.field3978 == 5) {
                    client.method275(class251.field4187, true, true);
                } else {
                    class128.method939(81, false, class69.field1059);
                }
                try {
                    Graphics var10 = class160.field2607.getGraphics();
                    class221.field3582.method357(0, 0, 1, var10);
                } catch (Exception var14) {
                }
                class36.method239(82);
                if (arg3 == 0) {
                    class221.field3582 = class236.method1655(class160.field2607, 503, -2049, 765);
                } else {
                    class221.field3582 = null;
                }
                class257 var12 = class308.field5222.method1304(class237.field3964.getClass(), 122);
                while (var12.field4256 == 0) {
                    class183.method1360(false, 100L);
                }
                if (var12.field4256 == 1) {
                    class232.field3818 = true;
                }
            }
            if (class232.field3818) {
                class55.method406(class160.field2607, class227.field3666 * 2);
            }
        }
        if (!class55.field815 && arg1 > 0) {
            method881(true, 0, true, arg3, -1, -1, (byte) -126);
            return;
        }
        if (arg1 > 0 && arg3 == 0) {
            class234.field3892.setPriority(5);
            class221.field3582 = null;
            class258.method1791();
            ((class280) class298.field5107).method1971(200, true);
            if (class308.field5243) {
                class298.method2078(0.7F);
            }
        } else if (arg1 == 0 && arg3 > 0) {
            class234.field3892.setPriority(1);
            class221.field3582 = class236.method1655(class160.field2607, 503, -2049, 765);
            class258.method1796();
            ((class280) class298.field5107).method1971(20, true);
            if (class308.field5243) {
                if (class128.field2092 == 1) {
                    class298.method2078(0.9F);
                }
                if (class128.field2092 == 2) {
                    class298.method2078(0.8F);
                }
                if (class128.field2092 == 3) {
                    class298.method2078(0.7F);
                }
                if (class128.field2092 == 4) {
                    class298.method2078(0.6F);
                }
            }
            class32.method213();
        }
        class293.field4997 = !class125.method922((byte) -126);
        if (arg2) {
            class316.method2173(-2049);
        }
        if (arg1 >= 2) {
            class266.field4588 = true;
        } else {
            class266.field4588 = false;
        }
        if (class262.field4364 != -1) {
            class40.method261((byte) -13, true);
        }
        if (class21.field284 != null && (class238.field3978 == 30 || class238.field3978 == 25)) {
            class92.method676((byte) -43);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class102.field1689[var13] = true;
        }
        class187.field3137 = true;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZII)I", line = 392)
    public static final int method882(boolean arg0, int arg1, int arg2) {
        class22 var3 = (class22) class238.field3969.method685((long) arg1, 128);
        if (arg0) {
            field1979 = (class59) null;
        }
        field1980++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field294.length) {
            return var3.field294[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)V", line = 416)
    public static final void method883(int arg0, boolean arg1) {
        field1925++;
        byte[][] var2;
        if (class55.field815 && arg1) {
            var2 = class230.field3784;
        } else {
            var2 = class123.field2035;
        }
        int var3 = class288.field4953.length;
        for (int var4 = arg0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class260.field4348[var4] >> 8) * 64 - class197.field3249;
                int var7 = (class260.field4348[var4] & 0xFF) * 64 - class187.field3135;
                class269.method1881((byte) -1);
                class151.method1091(arg1, var7, var6, var5, -16, class41.field612);
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1951[var0] = class195.method1416(var0, -96);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ls;II)V", line = 482)
    private final void method884(class170 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field1947 = 33;
        }
        field1975++;
        if (arg2 == 1) {
            int var4 = arg0.method1221(89);
            this.field1939 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1939[var5] = arg0.method1214(-18254);
            }
        } else if (arg2 == 2) {
            this.field1959 = arg0.method1250(false);
        } else if (arg2 == 12) {
            this.field1948 = arg0.method1221(112);
        } else if (arg2 == 13) {
            this.field1987 = arg0.method1214(-18254);
        } else if (arg2 == 14) {
            this.field1955 = arg0.method1214(arg1 ^ 0xFFFFB8B2);
        } else if (arg2 == 15) {
            this.field1986 = arg0.method1214(-18254);
        } else if (arg2 == 16) {
            this.field1972 = arg0.method1214(-18254);
        } else if (arg2 == 17) {
            this.field1955 = arg0.method1214(-18254);
            this.field1960 = arg0.method1214(-18254);
            this.field1940 = arg0.method1214(-18254);
            this.field1988 = arg0.method1214(-18254);
        } else if (arg2 >= 30 && arg2 < 35) {
            this.field1929[arg2 - 30] = arg0.method1250(false);
            if (this.field1929[arg2 - 30].method472(class206.field3370, 90)) {
                this.field1929[arg2 - 30] = null;
            }
        } else if (arg2 == 40) {
            int var25 = arg0.method1221(92);
            this.field1963 = new short[var25];
            this.field1967 = new short[var25];
            for (int var26 = 0; var26 < var25; var26++) {
                this.field1967[var26] = (short) arg0.method1214(class310.method2143(arg1, -18254));
                this.field1963[var26] = (short) arg0.method1214(-18254);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1221(74);
            this.field1969 = new short[var6];
            this.field1928 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1969[var7] = (short) arg0.method1214(-18254);
                this.field1928[var7] = (short) arg0.method1214(-18254);
            }
        } else if (arg2 == 42) {
            int var23 = arg0.method1221(110);
            this.field1965 = new byte[var23];
            for (int var24 = 0; var24 < var23; var24++) {
                this.field1965[var24] = arg0.method1205(class310.method2143(arg1, -1));
            }
        } else if (arg2 == 60) {
            int var8 = arg0.method1221(106);
            this.field1974 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1974[var9] = arg0.method1214(-18254);
            }
        } else if (arg2 == 93) {
            this.field1973 = false;
        } else if (arg2 == 95) {
            this.field1982 = arg0.method1214(-18254);
        } else if (arg2 == 97) {
            this.field1926 = arg0.method1214(-18254);
        } else if (arg2 == 98) {
            this.field1931 = arg0.method1214(-18254);
        } else if (arg2 == 99) {
            this.field1936 = true;
        } else if (arg2 == 100) {
            this.field1933 = arg0.method1205(-1);
        } else if (arg2 == 101) {
            this.field1976 = arg0.method1205(-1) * 5;
        } else if (arg2 == 102) {
            this.field1981 = arg0.method1214(arg1 - 18254);
        } else if (arg2 == 103) {
            this.field1946 = arg0.method1214(arg1 - 18254);
        } else if (arg2 == 106 || arg2 == 118) {
            this.field1954 = arg0.method1214(arg1 - 18254);
            if (this.field1954 == 65535) {
                this.field1954 = -1;
            }
            int var20 = -1;
            this.field1945 = arg0.method1214(arg1 ^ 0xFFFFB8B2);
            if (this.field1945 == 65535) {
                this.field1945 = -1;
            }
            if (arg2 == 118) {
                var20 = arg0.method1214(arg1 - 18254);
                if (var20 == 65535) {
                    var20 = -1;
                }
            }
            int var21 = arg0.method1221(74);
            this.field1958 = new int[var21 + 2];
            for (int var22 = 0; var22 <= var21; var22++) {
                this.field1958[var22] = arg0.method1214(-18254);
                if (this.field1958[var22] == 65535) {
                    this.field1958[var22] = -1;
                }
            }
            this.field1958[var21 + 1] = var20;
        } else if (arg2 == 107) {
            this.field1956 = false;
        } else if (arg2 == 109) {
            this.field1934 = false;
        } else if (arg2 == 111) {
            this.field1937 = false;
        } else if (arg2 == 113) {
            this.field1984 = (short) arg0.method1214(-18254);
            this.field1930 = (short) arg0.method1214(-18254);
        } else if (arg2 == 114) {
            this.field1985 = arg0.method1205(-1);
            this.field1953 = arg0.method1205(-1);
        } else if (arg2 == 115) {
            this.field1947 = (short) (arg0.method1221(111) * 4);
            this.field1941 = (short) (arg0.method1221(115) * 4);
        } else if (arg2 == 119) {
            this.field1943 = arg0.method1205(-1);
        } else if (arg2 == 120) {
            this.field1935 = arg0.method1214(arg1 ^ 0xFFFFB8B2);
            this.field1950 = arg0.method1214(-18254);
            this.field1989 = arg0.method1214(-18254);
            this.field1949 = arg0.method1221(78);
        } else if (arg2 == 121) {
            this.field1922 = new int[this.field1939.length][];
            int var10 = arg0.method1221(127);
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method1221(108);
                int[] var13 = this.field1922[var12] = new int[3];
                var13[0] = arg0.method1205(-1);
                var13[1] = arg0.method1205(-1);
                var13[2] = arg0.method1205(arg1 - 1);
            }
        } else if (arg2 == 122) {
            this.field1932 = arg0.method1214(arg1 ^ 0xFFFFB8B2);
        } else if (arg2 == 123) {
            this.field1938 = arg0.method1214(-18254);
        } else if (arg2 == 249) {
            int var14 = arg0.method1221(78);
            if (this.field1971 == null) {
                int var15 = class43.method293(true, var14);
                this.field1971 = new class94(var15);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                boolean var17 = arg0.method1221(71) == 1;
                int var18 = arg0.method1208((byte) -82);
                class287 var19;
                if (var17) {
                    var19 = new class252(arg0.method1250(false));
                } else {
                    var19 = new class174(arg0.method1233((byte) -77));
                }
                this.field1971.method694(var19, (byte) -90, (long) var18);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)Z", line = 813)
    public final boolean method885(boolean arg0) {
        field1944++;
        if (this.field1958 == null) {
            return true;
        }
        if (!arg0) {
            this.field1928 = (short[]) null;
        }
        int var2 = -1;
        if (this.field1954 != -1) {
            var2 = class291.method2017(this.field1954, (byte) -49);
        } else if (this.field1945 != -1) {
            var2 = class116.field1915[this.field1945];
        }
        if (var2 < 0 || var2 >= this.field1958.length - 1 || this.field1958[var2] == -1) {
            int var3 = this.field1958[this.field1958.length - 1];
            return var3 != -1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()V", line = 855)
    public static final void method886() {
        GL var0 = class55.field812;
        var0.glDisableClientState(32886);
        class55.method399(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class55.method390();
        for (int var1 = 0; var1 < class213.field3485[0].length; var1++) {
            class32 var2 = class213.field3485[0][var1];
            if (var2.field456 >= 0 && class298.field5107.method373(var2.field456, (byte) -128) == 4) {
                var0.glColor4fv(class174.method1281(8, var2.field466), 0);
                float var3 = 201.5F - (var2.field445 ? 1.0F : 0.5F);
                var2.method212(class120.field2010, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class55.method418();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class55.method411();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lqg;BIILqg;)Lca;", line = 892)
    public final class57 method887(class129 arg0, byte arg1, int arg2, int arg3, class129 arg4) {
        field1957++;
        if (this.field1958 != null) {
            class119 var6 = this.method890(958);
            return var6 == null ? null : var6.method887(arg0, (byte) 98, arg2, arg3, arg4);
        }
        class57 var7 = (class57) class157.field2565.method1483((byte) -74, (long) this.field1983);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field1939.length; var9++) {
                if (!class31.field432.method2035(this.field1939[var9], 0, 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class242[] var10 = new class242[this.field1939.length];
            for (int var11 = 0; var11 < this.field1939.length; var11++) {
                var10[var11] = class242.method1716(class31.field432, this.field1939[var11], 0);
                if (this.field1922 != null && this.field1922[var11] != null && var10[var11] != null) {
                    var10[var11].method1708(this.field1922[var11][0], this.field1922[var11][1], this.field1922[var11][2]);
                }
            }
            class242 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class242(var10, var10.length);
            }
            if (this.field1967 != null) {
                for (int var13 = 0; var13 < this.field1967.length; var13++) {
                    if (this.field1965 == null || var13 >= this.field1965.length) {
                        var12.method1725(this.field1967[var13], this.field1963[var13]);
                    } else {
                        var12.method1725(this.field1967[var13], class234.field3896[this.field1965[var13] & 0xFF]);
                    }
                }
            }
            if (this.field1969 != null) {
                for (int var14 = 0; var14 < this.field1969.length; var14++) {
                    var12.method1711(this.field1969[var14], this.field1928[var14]);
                }
            }
            var7 = var12.method1702(this.field1933 + 64, this.field1976 + 850, -30, -50, -30);
            if (class55.field815) {
                ((class267) var7).method1846(false, false, false, true, false, false, true);
            }
            class157.field2565.method1488((long) this.field1983, var7, 25838);
        }
        if (arg1 != 98) {
            this.method887((class129) null, (byte) 43, 68, -92, (class129) null);
        }
        class57 var15;
        if (arg0 != null && arg4 != null) {
            var15 = arg0.method953(arg4, arg2, arg3, (byte) -95, var7);
        } else if (arg0 != null) {
            var15 = arg0.method944(arg1 ^ 0x1, arg2, var7);
        } else if (arg4 == null) {
            var15 = var7.method431(true, true);
        } else {
            var15 = arg4.method944(arg1 - 28, arg3, var7);
        }
        if (this.field1926 != 128 || this.field1931 != 128) {
            var15.method444(this.field1926, this.field1931, this.field1926);
        }
        return var15;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLs;)V", line = 1040)
    public final void method888(byte arg0, class170 arg1) {
        int var3 = -105 % ((arg0 + 56) / 41);
        while (true) {
            int var4 = arg1.method1221(73);
            if (var4 == 0) {
                field1924++;
                return;
            }
            this.method884(arg1, 0, var4);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)Z", line = 1089)
    public final boolean method889(int arg0) {
        field1961++;
        if (this.field1958 == null) {
            return this.field1935 != -1 || this.field1950 != -1 || this.field1989 != -1;
        }
        if (arg0 != 5) {
            this.method888((byte) -53, (class170) null);
        }
        for (int var2 = 0; var2 < this.field1958.length; var2++) {
            if (this.field1958[var2] != -1) {
                class119 var3 = class37.method249(this.field1958[var2], (byte) 111);
                if (var3.field1935 != -1 || var3.field1950 != -1 || var3.field1989 != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Lae;", line = 1140)
    public final class119 method890(int arg0) {
        field1978++;
        int var2 = -1;
        if (this.field1954 != -1) {
            var2 = class291.method2017(this.field1954, (byte) -49);
        } else if (this.field1945 != -1) {
            var2 = class116.field1915[this.field1945];
        }
        if (arg0 != 958) {
            this.field1930 = -88;
        }
        if (var2 < 0 || this.field1958.length - 1 <= var2 || this.field1958[var2] == -1) {
            int var3 = this.field1958[this.field1958.length - 1];
            return var3 == -1 ? null : class37.method249(var3, (byte) 103);
        } else {
            return class37.method249(this.field1958[var2], (byte) 120);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 1184)
    public static void method891(int arg0) {
        field1990 = null;
        field1966 = null;
        if (arg0 != -21357) {
            method891(5);
        }
        field1970 = (int[][][]) null;
        field1951 = null;
        field1979 = null;
        field1964 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)I", line = 1217)
    public final int method892(int arg0, int arg1, int arg2) {
        field1991++;
        if (this.field1971 == null) {
            return arg1;
        } else if (arg2 == 65535) {
            class174 var4 = (class174) this.field1971.method685((long) arg0, 128);
            return var4 == null ? arg1 : var4.field2851;
        } else {
            return -88;
        }
    }
}
