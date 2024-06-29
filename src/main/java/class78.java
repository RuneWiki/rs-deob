import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 extends class79 {

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "[J")
    private long[] field1905 = new long[10];

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    private int field1909 = 0;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    private int field1890 = 256;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    private int field1898 = 1;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "J")
    private long field1897 = class120.method945(20794);

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field1891 = 0;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lr;")
    private static class118 field1896 = class153.method1136(127, "button near the top of that page)3");

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "Lr;")
    public static class118 field1901 = field1896;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "Lr;")
    public static class118 field1906 = class153.method1136(84, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Lr;")
    public static class118 field1904 = class153.method1136(112, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Lr;")
    public static class118 field1908 = class153.method1136(79, "(U4");

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "Lr;")
    private static class118 field1914 = class153.method1136(85, "Select a world");

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Lr;")
    public static class118 field1910 = class153.method1136(123, "(U(Y");

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "[[I")
    public static int[][] field1915 = new int[5][5000];

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Lr;")
    public static class118 field1903 = field1914;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "Lr;")
    private static class118 field1913 = class153.method1136(75, "OFF");

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "Lr;")
    public static class118 field1916 = field1913;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    private int field1895;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "Lff;")
    public static class42 field1902;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "[Ln;")
    public static class90[] field1892;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static final void method658(boolean arg0) {
        field1907++;
        class53.field1253.method726(-5);
        int var1 = class53.field1253.method725(8, 1);
        if (var1 == 0) {
            return;
        }
        if (!arg0) {
            field1913 = null;
        }
        int var2 = class53.field1253.method725(8, 2);
        if (var2 == 0) {
            class157.field3628[class92.field2216++] = 2047;
        } else if (var2 == 1) {
            int var3 = class53.field1253.method725(8, 3);
            class89.field2150.method257((byte) -18, false, var3);
            int var4 = class53.field1253.method725(8, 1);
            if (var4 == 1) {
                class157.field3628[class92.field2216++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class53.field1253.method725(8, 3);
            class89.field2150.method257((byte) -18, true, var5);
            int var6 = class53.field1253.method725(8, 3);
            class89.field2150.method257((byte) -18, true, var6);
            int var7 = class53.field1253.method725(8, 1);
            if (var7 == 1) {
                class157.field3628[class92.field2216++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class53.field1253.method725(8, 7);
            class106.field2468 = class53.field1253.method725(8, 2);
            int var9 = class53.field1253.method725(8, 1);
            if (var9 == 1) {
                class157.field3628[class92.field2216++] = 2047;
            }
            int var10 = class53.field1253.method725(8, 7);
            int var11 = class53.field1253.method725(8, 1);
            class89.field2150.method255(var8, var10, -20149, var11 == 1);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIILpf;I)V")
    public static final void method659(byte arg0, int arg1, int arg2, class110 arg3, int arg4) {
        field1912++;
        if (class39.field950 >= 400) {
            return;
        }
        if (arg3.field2537 != null) {
            arg3 = arg3.method864((byte) -121);
        }
        if (arg3 == null || !arg3.field2585) {
            return;
        }
        class118 var5 = arg3.field2558;
        if (arg0 <= 70) {
            method658(false);
        }
        if (arg3.field2549 != 0) {
            var5 = class144.method1066(true, new class118[] { var5, class62.method556(-128, class89.field2150.field2995, arg3.field2549), class39.field943, class142.field3211, class43.method359(arg3.field2549, (byte) -122), class9.field210 });
        }
        if (class144.field3245 == 1) {
            class27.field649++;
            class105.method830(class33.field834, arg1, -31278, class144.method1066(true, new class118[] { class95.field2241, class149.field3355, var5 }), arg4, arg2, 12);
        } else if (!class35.field884) {
            class91.field2170++;
            class118[] var6 = arg3.field2563;
            if (class101.field2354) {
                var6 = class44.method366(var6, (byte) -85);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method911(class103.field2388, 14934)) {
                        class71.field1662++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 10;
                        }
                        if (var7 == 1) {
                            var8 = 5;
                        }
                        if (var7 == 2) {
                            var8 = 34;
                        }
                        if (var7 == 3) {
                            var8 = 38;
                        }
                        if (var7 == 4) {
                            var8 = 36;
                        }
                        class105.method830(var6[var7], arg1, -31278, class144.method1066(true, new class118[] { class73.field1690, var5 }), arg4, arg2, var8);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method911(class103.field2388, 14934)) {
                        class80.field1950++;
                        short var10 = 0;
                        if (arg3.field2549 > class89.field2150.field2995) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 10;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 5;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 34;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 38;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 36;
                        }
                        class105.method830(var6[var9], arg1, -31278, class144.method1066(true, new class118[] { class73.field1690, var5 }), arg4, arg2, var11);
                    }
                }
            }
            class105.method830(class158.field3649, arg1, -31278, class144.method1066(true, new class118[] { class73.field1690, var5 }), arg4, arg2, 1001);
        } else if ((class80.field1934 & 0x2) == 2) {
            class122.field2826++;
            class105.method830(class103.field2378, arg1, -31278, class144.method1066(true, new class118[] { class56.field1334, class149.field3355, var5 }), arg4, arg2, 50);
            return;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public final void method660(int arg0) {
        if (arg0 == -6646) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field1905[var2] = 0L;
            }
            field1900++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V")
    public static final void method661(long arg0, int arg1) {
        if (arg1 > -66) {
            return;
        }
        field1911++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class51.field1214; var3++) {
            if (class77.field1877[var3] == arg0) {
                class51.field1214--;
                class115.field2696++;
                for (int var4 = var3; var4 < class51.field1214; var4++) {
                    class1.field24[var4] = class1.field24[var4 + 1];
                    class128.field2923[var4] = class128.field2923[var4 + 1];
                    class77.field1877[var4] = class77.field1877[var4 + 1];
                    class114.field2664[var4] = class114.field2664[var4 + 1];
                }
                class108.field2517 = class73.field1691;
                class1.field22.method722(177, (byte) -126);
                class1.field22.method824(arg0, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
    public static final void method662(byte arg0) {
        if (arg0 != 30) {
            return;
        }
        field1893++;
        if (class68.field1582 && class62.field1441 != class106.field2468) {
            class122.method960(class105.field2456, class89.field2150.field755[0], class106.field2468, class89.field2150.field710[0], class126.field2896, false);
        } else if (class106.field2468 != class1.field31) {
            class1.field31 = class106.field2468;
            class1.method1(122, class106.field2468);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILff;I)Z")
    public static final boolean method663(int arg0, class42 arg1, int arg2) {
        if (arg2 != 256) {
            return false;
        }
        field1899++;
        byte[] var3 = arg1.method346(-1, arg0);
        if (var3 == null) {
            return false;
        } else {
            class153.method1142(var3, -23279);
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V")
    public static void method664(byte arg0) {
        field1906 = null;
        field1910 = null;
        if (arg0 >= -74) {
            return;
        }
        field1896 = null;
        field1908 = null;
        field1913 = null;
        field1904 = null;
        field1916 = null;
        field1903 = null;
        field1892 = null;
        field1914 = null;
        field1915 = null;
        field1901 = null;
        field1902 = null;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class78() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1905[var1] = this.field1897;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)I")
    public final int method665(int arg0, int arg1, byte arg2) {
        int var4 = this.field1890;
        this.field1890 = 300;
        field1894++;
        int var5 = this.field1898;
        this.field1898 = 1;
        this.field1897 = class120.method945(20794);
        if (this.field1905[this.field1895] == 0L) {
            this.field1890 = var4;
            this.field1898 = var5;
        } else if (this.field1905[this.field1895] < this.field1897) {
            this.field1890 = (int) ((long) (arg0 * 2560) / (this.field1897 - this.field1905[this.field1895]));
        }
        if (this.field1890 < 25) {
            this.field1890 = 25;
        }
        if (this.field1890 > 256) {
            this.field1890 = 256;
            this.field1898 = (int) ((long) arg0 - (this.field1897 - this.field1905[this.field1895]) / 10L);
        }
        if (arg0 < this.field1898) {
            this.field1898 = arg0;
        }
        this.field1905[this.field1895] = this.field1897;
        this.field1895 = (this.field1895 + 1) % 10;
        if (this.field1898 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1905[var6] != 0L) {
                    this.field1905[var6] += this.field1898;
                }
            }
        }
        int var7 = 0;
        if (arg1 > this.field1898) {
            this.field1898 = arg1;
        }
        class139.method1042(-124, (long) this.field1898);
        if (arg2 < 114) {
            return 96;
        }
        while (this.field1909 < 256) {
            this.field1909 += this.field1890;
            var7++;
        }
        this.field1909 &= 0xFF;
        return var7;
    }
}
