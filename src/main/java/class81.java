import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class81 extends class19 {

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "[I")
    private int[] field1916 = new int[6];

    @OriginalMember(owner = "client!me", name = "mb", descriptor = "I")
    public int field1928 = -1;

    @OriginalMember(owner = "client!me", name = "rb", descriptor = "I")
    private int field1933 = 0;

    @OriginalMember(owner = "client!me", name = "pb", descriptor = "[I")
    private int[] field1931 = new int[6];

    @OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
    private int field1929 = 0;

    @OriginalMember(owner = "client!me", name = "wb", descriptor = "I")
    private int field1938 = 128;

    @OriginalMember(owner = "client!me", name = "ub", descriptor = "I")
    private int field1936 = 128;

    @OriginalMember(owner = "client!me", name = "Fb", descriptor = "I")
    private int field1947 = 0;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "Lkc;")
    public static class67 field1917 = class19.method144("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", 84);

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field1914 = -1;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    public static int field1915 = 50;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "[I")
    public static int[] field1919 = new int[field1915];

    @OriginalMember(owner = "client!me", name = "xb", descriptor = "[I")
    public static int[] field1939 = new int[field1915];

    @OriginalMember(owner = "client!me", name = "zb", descriptor = "[[I")
    public static int[][] field1941 = new int[104][104];

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "[I")
    public static int[] field1922 = new int[field1915];

    @OriginalMember(owner = "client!me", name = "jb", descriptor = "[I")
    public static int[] field1925 = new int[field1915];

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    public static int field1920 = 0;

    @OriginalMember(owner = "client!me", name = "Db", descriptor = "[I")
    public static int[] field1945 = new int[field1915];

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "[I")
    public static int[] field1918 = new int[field1915];

    @OriginalMember(owner = "client!me", name = "tb", descriptor = "Lkc;")
    private static class67 field1935 = class19.method144("Loaded sprites", 86);

    @OriginalMember(owner = "client!me", name = "Ab", descriptor = "I")
    public static int field1942 = 0;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "[I")
    public static int[] field1913 = new int[field1915];

    @OriginalMember(owner = "client!me", name = "ib", descriptor = "[Lkc;")
    public static class67[] field1924 = new class67[field1915];

    @OriginalMember(owner = "client!me", name = "qb", descriptor = "Lkc;")
    public static class67 field1932 = field1935;

    @OriginalMember(owner = "client!me", name = "Gb", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!me", name = "hb", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!me", name = "kb", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!me", name = "lb", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!me", name = "sb", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!me", name = "vb", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!me", name = "Cb", descriptor = "I")
    public int field1944;

    @OriginalMember(owner = "client!me", name = "Eb", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!me", name = "Bb", descriptor = "J")
    public static long field1943;

    @OriginalMember(owner = "client!me", name = "yb", descriptor = "Lta;")
    public static class119 field1940;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V", line = 4)
    public static void method636(boolean arg0) {
        field1913 = null;
        field1922 = null;
        if (!arg0) {
            method637(-86, -114);
        }
        field1924 = null;
        field1925 = null;
        field1917 = null;
        field1932 = null;
        field1945 = null;
        field1919 = null;
        field1918 = null;
        field1939 = null;
        field1940 = null;
        field1941 = null;
        field1935 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Z", line = 50)
    public static final boolean method637(int arg0, int arg1) {
        field1921++;
        if (!class42.method365(75, arg1)) {
            return false;
        }
        boolean var2 = false;
        class33[] var3 = class54.field1305[arg1];
        for (int var4 = arg0; var4 < var3.length; var4++) {
            class33 var5 = var3[var4];
            if (var5 != null && var5.field729 == 6) {
                if (var5.field715 != -1 || var5.field717 != -1) {
                    boolean var6 = class48.method400(var5, (byte) -55);
                    int var7;
                    if (var6) {
                        var7 = var5.field717;
                    } else {
                        var7 = var5.field715;
                    }
                    if (var7 != -1) {
                        class112 var8 = class70.method576(12, var7);
                        var5.field711 += class121.field2830;
                        label53: while (true) {
                            do {
                                do {
                                    if (var8.field2584[var5.field747] >= var5.field711) {
                                        break label53;
                                    }
                                    var2 = true;
                                    var5.field711 -= var8.field2584[var5.field747];
                                    var5.field747++;
                                } while (var5.field747 < var8.field2570.length);
                                var5.field747 -= var8.field2553;
                            } while (var5.field747 >= 0 && var8.field2570.length > var5.field747);
                            var5.field747 = 0;
                        }
                    }
                }
                if (var5.field727 != 0 && !var5.field722) {
                    var2 = true;
                    int var9 = var5.field727 >> 16;
                    int var10 = class121.field2830 * var9;
                    var5.field724 = var5.field724 + var10 & 0x7FF;
                    int var11 = var5.field727 << 16 >> 16;
                    int var12 = class121.field2830 * var11;
                    var5.field742 = var5.field742 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(II)Lfd;", line = 137)
    public final class39 method638(int arg0, int arg1) {
        field1927++;
        if (arg1 != -30) {
            method636(false);
        }
        class39 var3 = (class39) class33.field815.method373((byte) 108, (long) this.field1944);
        if (var3 == null) {
            var3 = class39.method332(class131.field3078, this.field1911, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field1931[0] != 0) {
                    var3.method337(this.field1931[var4], this.field1916[var4]);
                }
            }
            var3.method344();
            var3.method318(this.field1933 + 64, this.field1929 + 850, -30, -50, -30, true);
            class33.field815.method374(0, var3, (long) this.field1944);
        }
        class39 var5;
        if (this.field1928 == -1 || arg0 == -1) {
            var5 = var3.method323(true);
        } else {
            var5 = class70.method576(12, this.field1928).method845(var3, arg0, 29625);
        }
        if (this.field1936 != 128 || this.field1938 != 128) {
            var5.method328(this.field1936, this.field1938, this.field1936);
        }
        if (this.field1947 != 0) {
            if (this.field1947 == 90) {
                var5.method347();
            }
            if (this.field1947 == 180) {
                var5.method347();
                var5.method347();
            }
            if (this.field1947 == 270) {
                var5.method347();
                var5.method347();
                var5.method347();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILwd;)V", line = 205)
    private final void method639(int arg0, int arg1, class140 arg2) {
        field1946++;
        if (arg0 == 1) {
            this.field1911 = arg2.method1072(20);
        } else if (arg0 == 2) {
            this.field1928 = arg2.method1072(32);
        } else if (arg0 == 4) {
            this.field1936 = arg2.method1072(77);
        } else if (arg0 == 5) {
            this.field1938 = arg2.method1072(arg1 + 105);
        } else if (arg0 == 6) {
            this.field1947 = arg2.method1072(24);
        } else if (arg0 == 7) {
            this.field1933 = arg2.method1105(255);
        } else if (arg0 == 8) {
            this.field1929 = arg2.method1105(arg1 ^ 0xFFFFFF08);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field1931[arg0 - 40] = arg2.method1072(116);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field1916[arg0 - 50] = arg2.method1072(15);
        }
        if (arg1 != -9) {
            method640(54, -20, null, 10);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II[BI)Z", line = 302)
    public static final boolean method640(int arg0, int arg1, byte[] arg2, int arg3) {
        field1937++;
        boolean var4 = true;
        class140 var5 = new class140(arg2);
        int var6 = -1;
        label69: while (true) {
            int var7 = var5.method1103((byte) -124);
            if (var7 == 0) {
                if (arg1 != -30816) {
                    field1943 = 37L;
                }
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var12;
                class106 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1103((byte) 16);
                                        if (var17 == 0) {
                                            continue label69;
                                        }
                                        var5.method1105(255);
                                    }
                                    int var10 = var5.method1103((byte) -124);
                                    if (var10 == 0) {
                                        continue label69;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var5.method1105(255) >> 2;
                                    int var13 = var8 >> 6 & 0x3F;
                                    var14 = arg3 + var11;
                                    var15 = arg0 + var13;
                                } while (var15 <= 0);
                            } while (var14 <= 0);
                        } while (var15 >= 103);
                    } while (var14 >= 103);
                    var16 = class2.method12(var6, 21876);
                } while (var12 == 22 && class45.field1105 && var16.field2389 == 0 && !var16.field2384);
                var9 = true;
                if (!var16.method817((byte) 63)) {
                    class122.field2877++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILwd;)V", line = 439)
    public final void method641(int arg0, class140 arg1) {
        field1934++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method1105(255);
            if (var3 == 0) {
                return;
            }
            this.method639(var3, -9, arg1);
        }
    }
}
