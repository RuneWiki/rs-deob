import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class79 {

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    private int field1934 = 0;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    private int field1915 = 0;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    private int field1928;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    private int field1916;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[[I")
    public int[][] field1909;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lgg;")
    private static class63 field1910 = class116.method911(43, "cyan:");

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1911 = 0;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Lgg;")
    public static class63 field1925 = field1910;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "Lgg;")
    public static class63 field1932 = field1910;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lqe;")
    public static class149 field1924;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIII)V")
    private final void method703(boolean arg0, int arg1, int arg2, int arg3) {
        field1929++;
        this.field1909[arg2][arg3] = class202.method1332(this.field1909[arg2][arg3], arg1);
        if (!arg0) {
            field1910 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIZII)V")
    public final void method704(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field1919++;
        int var8 = arg0 - this.field1915;
        if (arg5 == 1 || arg5 == 3) {
            int var9 = arg3;
            arg3 = arg2;
            arg2 = var9;
        }
        if (!arg1) {
            this.method714(111);
        }
        int var10 = arg6 - this.field1934;
        int var11 = 256;
        if (arg4) {
            var11 += 131072;
        }
        for (int var12 = var10; var12 < arg3 + var10; var12++) {
            if (var12 >= 0 && this.field1916 > var12) {
                for (int var13 = var8; var13 < arg2 + var8; var13++) {
                    if (var13 >= 0 && this.field1928 > var13) {
                        this.method719(var13, (byte) 44, var12, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V")
    public final void method705(int arg0, int arg1, byte arg2) {
        int var4 = arg0 - this.field1934;
        int var5 = arg1 - this.field1915;
        this.field1909[var4][var5] = class202.method1332(this.field1909[var4][var5], 2097152);
        if (arg2 >= -122) {
            field1911 = -86;
        }
        field1914++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIZII)V")
    public final void method706(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 != -26739) {
            this.method718(true, 102, 91, -84, 69, 125);
        }
        field1912++;
        int var7 = arg1 - this.field1915;
        int var8 = arg2 - this.field1934;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method703(true, 128, var8, var7);
                this.method703(true, 8, var8 - 1, var7);
            }
            if (arg4 == 1) {
                this.method703(true, 2, var8, var7);
                this.method703(true, 32, var8, var7 + 1);
            }
            if (arg4 == 2) {
                this.method703(true, 8, var8, var7);
                this.method703(true, 128, var8 + 1, var7);
            }
            if (arg4 == 3) {
                this.method703(true, 32, var8, var7);
                this.method703(true, 2, var8, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method703(true, 1, var8, var7);
                this.method703(true, 16, var8 - 1, var7 - -1);
            }
            if (arg4 == 1) {
                this.method703(true, 4, var8, var7);
                this.method703(true, 64, var8 + 1, var7 + 1);
            }
            if (arg4 == 2) {
                this.method703(true, 16, var8, var7);
                this.method703(true, 1, var8 + 1, var7 + -1);
            }
            if (arg4 == 3) {
                this.method703(true, 64, var8, var7);
                this.method703(true, 4, var8 - 1, var7 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method703(true, 130, var8, var7);
                this.method703(true, 8, var8 - 1, var7);
                this.method703(true, 32, var8, var7 + 1);
            }
            if (arg4 == 1) {
                this.method703(true, 10, var8, var7);
                this.method703(true, 32, var8, var7 + 1);
                this.method703(true, 128, var8 + 1, var7);
            }
            if (arg4 == 2) {
                this.method703(true, 40, var8, var7);
                this.method703(true, 128, var8 + 1, var7);
                this.method703(true, 2, var8, var7 - 1);
            }
            if (arg4 == 3) {
                this.method703(true, 160, var8, var7);
                this.method703(true, 2, var8, var7 - 1);
                this.method703(true, 8, var8 - 1, var7);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method703(true, 65536, var8, var7);
                this.method703(true, 4096, var8 - 1, var7);
            }
            if (arg4 == 1) {
                this.method703(true, 1024, var8, var7);
                this.method703(true, 16384, var8, var7 + 1);
            }
            if (arg4 == 2) {
                this.method703(true, 4096, var8, var7);
                this.method703(true, 65536, var8 + 1, var7);
            }
            if (arg4 == 3) {
                this.method703(true, 16384, var8, var7);
                this.method703(true, 1024, var8, var7 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method703(true, 512, var8, var7);
                this.method703(true, 8192, var8 - 1, var7 - -1);
            }
            if (arg4 == 1) {
                this.method703(true, 2048, var8, var7);
                this.method703(true, 32768, var8 + 1, var7 - -1);
            }
            if (arg4 == 2) {
                this.method703(true, 8192, var8, var7);
                this.method703(true, 512, var8 + 1, var7 + -1);
            }
            if (arg4 == 3) {
                this.method703(true, 32768, var8, var7);
                this.method703(true, 2048, var8 - 1, var7 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method703(true, 66560, var8, var7);
            this.method703(true, 4096, var8 - 1, var7);
            this.method703(true, 16384, var8, var7 + 1);
        }
        if (arg4 == 1) {
            this.method703(true, 5120, var8, var7);
            this.method703(true, 16384, var8, var7 + 1);
            this.method703(true, 65536, var8 + 1, var7);
        }
        if (arg4 == 2) {
            this.method703(true, 20480, var8, var7);
            this.method703(true, 65536, var8 + 1, var7);
            this.method703(true, 1024, var8, var7 - 1);
        }
        if (arg4 == 3) {
            this.method703(true, 81920, var8, var7);
            this.method703(true, 1024, var8, var7 - 1);
            this.method703(true, 4096, var8 - 1, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLff;)Lgg;")
    public static final class63 method707(byte arg0, class54 arg1) {
        if (arg0 != -122) {
            field1932 = null;
        }
        field1933++;
        if (class186.method1221((byte) -110, class10.method136((byte) -97, arg1)) == 0) {
            return null;
        } else if (arg1.field1362 == null || arg1.field1362.method578(false).method582(-109) == 0) {
            return class29.field673 ? class88.field2074 : null;
        } else {
            return arg1.field1362;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIZIII)V")
    public final void method708(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1931++;
        int var7 = arg4 - this.field1934;
        int var8 = arg3 - this.field1915;
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method719(var8, (byte) -89, var7, 128);
                this.method719(var8, (byte) 79, var7 - 1, 8);
            }
            if (arg5 == 1) {
                this.method719(var8, (byte) -100, var7, 2);
                this.method719(var8 + 1, (byte) 73, var7, 32);
            }
            if (arg5 == 2) {
                this.method719(var8, (byte) -122, var7, 8);
                this.method719(var8, (byte) 56, var7 + 1, 128);
            }
            if (arg5 == 3) {
                this.method719(var8, (byte) -123, var7, 32);
                this.method719(var8 - 1, (byte) 62, var7, 2);
            }
        }
        if (arg0 != 58) {
            this.field1909 = null;
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method719(var8, (byte) 88, var7, 1);
                this.method719(var8 + 1, (byte) 101, var7 - 1, 16);
            }
            if (arg5 == 1) {
                this.method719(var8, (byte) -51, var7, 4);
                this.method719(var8 + 1, (byte) -121, var7 + 1, 64);
            }
            if (arg5 == 2) {
                this.method719(var8, (byte) -82, var7, 16);
                this.method719(var8 - 1, (byte) -92, var7 + 1, 1);
            }
            if (arg5 == 3) {
                this.method719(var8, (byte) 58, var7, 64);
                this.method719(var8 - 1, (byte) -121, var7 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg5 == 0) {
                this.method719(var8, (byte) -100, var7, 130);
                this.method719(var8, (byte) 91, var7 - 1, 8);
                this.method719(var8 + 1, (byte) 114, var7, 32);
            }
            if (arg5 == 1) {
                this.method719(var8, (byte) -82, var7, 10);
                this.method719(var8 + 1, (byte) 117, var7, 32);
                this.method719(var8, (byte) -66, var7 + 1, 128);
            }
            if (arg5 == 2) {
                this.method719(var8, (byte) -103, var7, 40);
                this.method719(var8, (byte) 83, var7 + 1, 128);
                this.method719(var8 - 1, (byte) -113, var7, 2);
            }
            if (arg5 == 3) {
                this.method719(var8, (byte) 80, var7, 160);
                this.method719(var8 - 1, (byte) 47, var7, 2);
                this.method719(var8, (byte) -111, var7 - 1, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg5 == 0) {
                this.method719(var8, (byte) -41, var7, 65536);
                this.method719(var8, (byte) 44, var7 - 1, 4096);
            }
            if (arg5 == 1) {
                this.method719(var8, (byte) -94, var7, 1024);
                this.method719(var8 + 1, (byte) 62, var7, 16384);
            }
            if (arg5 == 2) {
                this.method719(var8, (byte) -41, var7, 4096);
                this.method719(var8, (byte) 102, var7 + 1, 65536);
            }
            if (arg5 == 3) {
                this.method719(var8, (byte) -49, var7, 16384);
                this.method719(var8 - 1, (byte) 34, var7, 1024);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg5 == 0) {
                this.method719(var8, (byte) 107, var7, 512);
                this.method719(var8 + 1, (byte) 47, var7 - 1, 8192);
            }
            if (arg5 == 1) {
                this.method719(var8, (byte) 87, var7, 2048);
                this.method719(var8 + 1, (byte) 116, var7 + 1, 32768);
            }
            if (arg5 == 2) {
                this.method719(var8, (byte) -101, var7, 8192);
                this.method719(var8 - 1, (byte) -71, var7 + 1, 512);
            }
            if (arg5 == 3) {
                this.method719(var8, (byte) 35, var7, 32768);
                this.method719(var8 - 1, (byte) -117, var7 - 1, 2048);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method719(var8, (byte) 118, var7, 66560);
            this.method719(var8, (byte) -122, var7 - 1, 4096);
            this.method719(var8 + 1, (byte) 107, var7, 16384);
        }
        if (arg5 == 1) {
            this.method719(var8, (byte) -94, var7, 5120);
            this.method719(var8 + 1, (byte) 118, var7, 16384);
            this.method719(var8, (byte) -128, var7 + 1, 65536);
        }
        if (arg5 == 2) {
            this.method719(var8, (byte) 108, var7, 20480);
            this.method719(var8, (byte) 35, var7 + 1, 65536);
            this.method719(var8 - 1, (byte) -115, var7, 1024);
        }
        if (arg5 == 3) {
            this.method719(var8, (byte) -66, var7, 81920);
            this.method719(var8 - 1, (byte) 99, var7, 1024);
            this.method719(var8, (byte) 70, var7 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZI)V")
    public final void method709(int arg0, boolean arg1, int arg2) {
        field1921++;
        int var4 = arg0 - this.field1934;
        int var5 = arg2 - this.field1915;
        this.field1909[var4][var5] = class110.method881(this.field1909[var4][var5], -262145);
        if (!arg1) {
            field1932 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1923++;
        if (arg1 == arg5 && arg2 == arg3) {
            return true;
        }
        int var8 = arg3 - this.field1915;
        int var9 = arg5 - this.field1934;
        int var10 = arg1 - this.field1934;
        int var11 = arg2 - this.field1915;
        if (arg4 == 6 || arg4 == 7) {
            if (arg4 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field1909[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field1909[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field1909[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field1909[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field1909[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field1909[var10][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field1909[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field1909[var10][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 8) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field1909[var10][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field1909[var10][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field1909[var10][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field1909[var10][var8] & 0x80) == 0) {
                return true;
            }
        }
        return arg6 != -1578;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Lf;")
    public static final class48 method711(int arg0, boolean arg1) {
        field1920++;
        class48 var2 = (class48) class164.field3372.method289((long) arg0, -130079263);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class75.field1842.method745(8, arg0, 0);
        class48 var4 = new class48();
        if (!arg1) {
            field1910 = null;
        }
        if (var3 != null) {
            var4.method474(-28065, new class3(var3));
        }
        class164.field3372.method293(!arg1, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZBIII)Lwb;")
    public static final class200 method712(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1927++;
        long var6 = ((long) arg5 << 40) + (((long) arg4 << 16) + (long) arg3 + ((long) arg0 << 38));
        if (!arg1) {
            class200 var8 = (class200) class206.field4058.method289(var6, -130079263);
            if (var8 != null) {
                return var8;
            }
        }
        class93 var9 = class59.method554(arg3, 13319);
        if (arg4 > 1 && var9.field2199 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg4 >= var9.field2189[var11] && var9.field2189[var11] != 0) {
                    var10 = var9.field2199[var11];
                }
            }
            if (var10 != -1) {
                var9 = class59.method554(var10, 13319);
            }
        }
        class66 var12 = var9.method809(80);
        if (var12 == null) {
            return null;
        }
        class200 var13 = null;
        if (var9.field2196 != -1) {
            var13 = method712(1, true, (byte) 98, var9.field2197, 10, 0);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class178.field3650;
        int var15 = class178.field3649;
        int[] var16 = new int[4];
        int var17 = class178.field3644;
        class178.method1184(var16);
        class200 var18 = new class200(36, 32);
        class178.method1189(var18.field3994, 36, 32);
        if (arg2 < 20) {
            method716((byte) -5);
        }
        class178.method1180();
        class25.method243();
        class25.method245(16, 16);
        int var19 = var9.field2205;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class25.field582 = false;
        int var20 = class25.field576[var9.field2235] * var19 >> 16;
        int var21 = class25.field571[var9.field2235] * var19 >> 16;
        var12.method331();
        var12.method326(0, var9.field2211, var9.field2206, var9.field2235, var9.field2237, var21 + var9.field2200 - var12.field728 / 2, var9.field2200 + var20);
        if (arg0 >= 1) {
            var18.method1306(1);
        }
        if (arg0 >= 2) {
            var18.method1306(16777215);
        }
        if (arg5 != 0) {
            var18.method1312(arg5);
        }
        class178.method1189(var18.field3994, 36, 32);
        if (var9.field2196 != -1) {
            var13.method1320(0, 0);
        }
        if (!arg1 && (var9.field2242 == 1 || arg4 != 1) && arg4 != -1) {
            class8.field179.method644(class49.method482(1000000, arg4), 0, 9, 16776960, 1);
        }
        if (!arg1) {
            class206.field4058.method293(false, var6, var18);
        }
        class178.method1189(var14, var17, var15);
        class178.method1176(var16);
        class25.method243();
        class25.field582 = true;
        return var18;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIIIIII)Z")
    public final boolean method713(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1913++;
        if (arg3 == arg6 && arg4 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field1934;
        int var9 = arg5 - this.field1915;
        int var10 = arg6 - this.field1934;
        if (arg0 != 2) {
            return false;
        }
        int var11 = arg4 - this.field1915;
        if (arg2 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1909[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1909[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1909[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1909[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1909[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1909[var8][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1909[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1909[var8][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg2 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1909[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1909[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1909[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public final void method714(int arg0) {
        for (int var2 = 0; var2 < this.field1916; var2++) {
            for (int var3 = 0; var3 < this.field1928; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1916 - 5 <= var2 || this.field1928 - 5 <= var3) {
                    this.field1909[var2][var3] = 16777215;
                } else {
                    this.field1909[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 > -72) {
            this.method718(true, 109, 58, 66, 101, 117);
        }
        field1926++;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IZI)V")
    public final void method715(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field1915 = -68;
        }
        int var4 = arg2 - this.field1915;
        field1930++;
        int var5 = arg0 - this.field1934;
        this.field1909[var5][var4] = class202.method1332(this.field1909[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method716(byte arg0) {
        field1925 = null;
        field1910 = null;
        field1932 = null;
        if (arg0 <= -35) {
            field1924 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIB)Z")
    public final boolean method717(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1935++;
        if (arg7 != -126) {
            this.field1928 = 126;
        }
        int var9 = arg0 + arg4 - 1;
        int var10 = arg5 + arg3 - 1;
        if (arg1 >= arg0 && arg1 <= var9 && arg2 >= arg5 && arg2 <= var10) {
            return true;
        } else if (arg0 - 1 == arg1 && arg5 <= arg2 && var10 >= arg2 && (this.field1909[arg1 - this.field1934][arg2 - this.field1915] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg1 && arg5 <= arg2 && var10 >= arg2 && (this.field1909[arg1 - this.field1934][arg2 - this.field1915] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg2 && arg1 >= arg0 && arg1 <= var9 && (this.field1909[arg1 - this.field1934][arg2 - this.field1915] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg1 >= arg0 && var9 >= arg1 && (this.field1909[arg1 - this.field1934][arg2 - this.field1915] & 0x20) == 0 && (arg6 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIIIII)V")
    public final void method718(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1922++;
        int var7 = arg3 - this.field1915;
        int var8 = arg2 - this.field1934;
        int var9 = 256;
        if (arg0) {
            var9 += 131072;
        }
        if (arg5 != -20496) {
            field1924 = null;
        }
        for (int var10 = var8; var10 < arg4 + var8; var10++) {
            if (var10 >= 0 && this.field1916 > var10) {
                for (int var11 = var7; var11 < arg1 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field1928) {
                        this.method703(true, var9, var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBII)V")
    private final void method719(int arg0, byte arg1, int arg2, int arg3) {
        field1917++;
        int var5 = -88 % ((-arg1 - 4) / 36);
        this.field1909[arg2][arg0] = class110.method881(this.field1909[arg2][arg0], ~arg3);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Z")
    public static final boolean method720(byte arg0) {
        field1918++;
        if (arg0 > -84) {
            return true;
        } else if (class42.field971 == 0) {
            return class182.field3698.method399(28977);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(II)V")
    public class79(int arg0, int arg1) {
        this.field1928 = arg1;
        this.field1916 = arg0;
        this.field1909 = new int[this.field1916][this.field1928];
        this.method714(-94);
    }
}
