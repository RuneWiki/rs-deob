import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class108 {

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "Lpj;")
    private class98 field1944 = null;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "Lnk;")
    private class171 field1940;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "Z")
    private boolean field1948;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Z")
    private boolean field1931;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "[J")
    public static long[] field1933 = new long[32];

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1938 = "Loading fonts - ";

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "[Ljava/lang/Object;")
    private Object[] field1925;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1953;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIB)[B")
    public final byte[] method726(int arg0, int arg1, byte arg2) {
        field1932++;
        if (!this.method748(arg1, -109, arg0)) {
            return null;
        }
        if (this.field1953[arg0] == null || this.field1953[arg0][arg1] == null) {
            boolean var4 = this.method753(arg2 + 136, (int[]) null, arg0);
            if (!var4) {
                this.method734(arg0, 0);
                boolean var5 = this.method753(125, (int[]) null, arg0);
                if (!var5) {
                    return null;
                }
            }
        }
        if (arg2 != -57) {
            this.field1940 = null;
        }
        return class248.method1663(false, this.field1953[arg0][arg1], -62);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)Z")
    public final boolean method727(int arg0, byte arg1) {
        field1919++;
        if (arg1 >= -81) {
            this.method726(-58, 98, (byte) 75);
        }
        if (!this.method738((byte) -33)) {
            return false;
        } else if (this.field1944.field1677.length == 1) {
            return this.method737(-1, 0, arg0);
        } else if (!this.method730((byte) 100, arg0)) {
            return false;
        } else if (this.field1944.field1677[arg0] == 1) {
            return this.method737(-1, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method728(int arg0, String arg1) {
        field1942++;
        if (this.method738((byte) -70)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1944.field1683.method1812(class276.method1806(var3, arg0), 5643);
            return this.method758(true, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method729(String arg0, int arg1, String arg2) {
        field1954++;
        if (!this.method738((byte) 115)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1944.field1683.method1812(class276.method1806(var4, 0), 5643);
        if (this.method730((byte) 42, var6)) {
            int var7 = -110 % ((-arg1 - 5) / 46);
            int var8 = this.field1944.field1685[var6].method1812(class276.method1806(var5, 0), 5643);
            return this.method746(var8, (byte) -128, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Z")
    private final boolean method730(byte arg0, int arg1) {
        field1926++;
        if (arg0 <= 19) {
            this.field1925 = null;
        }
        if (!this.method738((byte) -119)) {
            return false;
        } else if (arg1 >= 0 && this.field1944.field1677.length > arg1 && this.field1944.field1677[arg1] != 0) {
            return true;
        } else if (class234.field3888) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)I")
    public final int method731(boolean arg0) {
        if (arg0) {
            this.method738((byte) -116);
        }
        field1923++;
        if (!this.method738((byte) 67)) {
            throw new IllegalStateException("");
        }
        return this.field1944.field1673;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method732(int arg0) {
        field1933 = null;
        if (arg0 == 0) {
            field1938 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public final void method733(int arg0) {
        if (this.field1953 != null) {
            for (int var2 = 0; var2 < this.field1953.length; var2++) {
                this.field1953[var2] = null;
            }
        }
        if (arg0 != 0) {
            field1938 = null;
        }
        field1915++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
    private final void method734(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method728(-25, (String) null);
        }
        field1946++;
        if (this.field1931) {
            this.field1925[arg0] = this.field1940.method948(-7621, arg0);
        } else {
            this.field1925[arg0] = class237.method1566(false, this.field1940.method948(arg1 - 7621, arg0), (byte) -10);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method735(int arg0, String arg1, String arg2) {
        field1916++;
        if (!this.method738((byte) 88)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1944.field1683.method1812(class276.method1806(var4, 0), 5643);
        if (!this.method730((byte) 36, var6)) {
            return false;
        } else if (arg0 <= 41) {
            return true;
        } else {
            int var7 = this.field1944.field1685[var6].method1812(class276.method1806(var5, 0), 5643);
            return this.method737(-1, var6, var7);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method736(String arg0, byte arg1) {
        field1939++;
        if (!this.method738((byte) 121)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 6) {
            this.method736((String) null, (byte) -46);
        }
        int var4 = this.field1944.field1683.method1812(class276.method1806(var3, 0), 5643);
        return this.method751(arg1 - 21647, var4);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
    public final boolean method737(int arg0, int arg1, int arg2) {
        field1914++;
        if (!this.method748(arg2, -74, arg1)) {
            return false;
        } else if (this.field1953[arg1] != null && this.field1953[arg1][arg2] != null) {
            return true;
        } else if (this.field1925[arg1] == null) {
            if (arg0 != -1) {
                this.field1925 = null;
            }
            this.method734(arg1, 0);
            return this.field1925[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Z")
    private final boolean method738(byte arg0) {
        int var2 = -91 / ((arg0 - 26) / 39);
        field1927++;
        if (this.field1944 == null) {
            this.field1944 = this.field1940.method949((byte) -67);
            if (this.field1944 == null) {
                return false;
            }
            this.field1953 = new Object[this.field1944.field1687][];
            this.field1925 = new Object[this.field1944.field1687];
        }
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V")
    public final void method739(int arg0, int arg1) {
        field1934++;
        if (!this.method730((byte) 74, arg1)) {
            return;
        }
        if (this.field1953 != null) {
            this.field1953[arg1] = null;
        }
        if (arg0 != -22926) {
            field1933 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)I")
    public final int method740(byte arg0) {
        field1924++;
        if (!this.method738((byte) -99)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1925.length; var4++) {
            if (this.field1944.field1671[var4] > 0) {
                var2 += 100;
                var3 += this.method758(true, var4);
            }
        }
        if (arg0 >= -93) {
            field1933 = null;
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method741(int arg0, String arg1) {
        field1918++;
        if (!this.method738((byte) -28)) {
            return false;
        }
        if (arg0 != -16808) {
            this.field1940 = null;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1944.field1683.method1812(class276.method1806(var3, 0), 5643);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
    public static final void method742(int arg0) {
        field1917++;
        if ((class151.field2534 > class116.field2077)) {
            class116.field2077 = (float) ((double) class116.field2077 / 30.0D + (double) class116.field2077);
            if (class116.field2077 > class151.field2534) {
                class116.field2077 = class151.field2534;
            }
            class27.method180((byte) -102);
        } else if (class151.field2534 < class116.field2077) {
            class116.field2077 = (float) ((double) class116.field2077 - (double) class116.field2077 / 30.0D);
            if (class151.field2534 > class116.field2077) {
                class116.field2077 = class151.field2534;
            }
            class27.method180((byte) -105);
        }
        if (~class167.field2728 == arg0 || class248.field4084 == -1) {
            return;
        }
        int var1 = class167.field2728 - class294.field4681;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class294.field4681 += var1;
        int var2 = class248.field4084 - class213.field3583;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 == 0 && var2 == 0) {
            class167.field2728 = -1;
            class248.field4084 = -1;
        }
        class213.field3583 += var2;
        class27.method180((byte) -101);
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)[I")
    public final int[] method743(int arg0, int arg1) {
        field1921++;
        if (!this.method730((byte) 101, arg0)) {
            return null;
        }
        int[] var3 = this.field1944.field1682[arg0];
        if (var3 == null) {
            var3 = new int[this.field1944.field1671[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return arg1 == 5064 ? var3 : null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([Ljava/lang/String;[SIII)V")
    public static final void method744(String[] arg0, short[] arg1, int arg2, int arg3, int arg4) {
        field1929++;
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            String var6 = arg0[var5];
            int var7 = arg4;
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var6;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg4; var9 < arg2; var9++) {
                if (var6 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var6)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7++] = var11;
                }
            }
            arg0[arg2] = arg0[var7];
            arg0[var7] = var6;
            arg1[arg2] = arg1[var7];
            arg1[var7] = var8;
            method744(arg0, arg1, var7 - 1, 123, arg4);
            method744(arg0, arg1, arg2, 111, var7 + 1);
        }
        if (arg3 <= 110) {
            field1933 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(Ljava/lang/String;B)V")
    public final void method745(String arg0, byte arg1) {
        if (arg1 != 61) {
            this.method755((byte) 10, -40);
        }
        field1922++;
        if (this.method738((byte) -35)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1944.field1683.method1812(class276.method1806(var3, 0), 5643);
            this.method750(var4, 21754);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)[B")
    public final byte[] method746(int arg0, byte arg1, int arg2) {
        field1949++;
        if (arg1 >= -127) {
            this.field1953 = null;
        }
        return this.method756(arg2, (int[]) null, arg0, 1);
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(III)J")
    public static final long method747(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        return var3 == null || var3.field1978 == null ? 0L : var3.field1978.field159;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)Z")
    private final boolean method748(int arg0, int arg1, int arg2) {
        if (arg1 >= -28) {
            this.method757(-107);
        }
        field1936++;
        if (!this.method738((byte) 112)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field1944.field1677.length > arg2 && this.field1944.field1677[arg2] > arg0) {
            return true;
        } else if (class234.field3888) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method749(String arg0, int arg1) {
        field1947++;
        if (!this.method738((byte) 84)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1944.field1683.method1812(class276.method1806(var3, 0), 5643);
        if (arg1 != 1) {
            this.field1931 = false;
        }
        return this.method730((byte) 76, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(II)V")
    private final void method750(int arg0, int arg1) {
        if (arg1 != 21754) {
            field1933 = null;
        }
        this.field1940.method936(arg0, 16);
        field1950++;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(II)Z")
    public final boolean method751(int arg0, int arg1) {
        field1930++;
        if (!this.method730((byte) 106, arg1)) {
            return false;
        } else if (this.field1925[arg1] == null) {
            this.method734(arg1, arg0 ^ arg0);
            return this.field1925[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZZ)V")
    public final void method752(byte arg0, boolean arg1, boolean arg2) {
        field1920++;
        if (arg0 != -1 || !this.method738((byte) 105)) {
            return;
        }
        if (arg2) {
            this.field1944.field1685 = null;
            this.field1944.field1681 = null;
        }
        if (arg1) {
            this.field1944.field1675 = null;
            this.field1944.field1683 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[II)Z")
    private final boolean method753(int arg0, int[] arg1, int arg2) {
        field1945++;
        if (!this.method730((byte) 80, arg2)) {
            return false;
        } else if (this.field1925[arg2] == null) {
            return false;
        } else {
            int var4 = this.field1944.field1671[arg2];
            int[] var5 = this.field1944.field1682[arg2];
            if (arg0 <= 17) {
                return false;
            }
            if (this.field1953[arg2] == null) {
                this.field1953[arg2] = new Object[this.field1944.field1677[arg2]];
            }
            boolean var6 = true;
            Object[] var7 = this.field1953[arg2];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var10 = class248.method1663(false, this.field1925[arg2], -67);
            } else {
                var10 = class248.method1663(true, this.field1925[arg2], -71);
                class101 var11 = new class101(var10);
                var11.method684(arg1, 5, (byte) 106, var11.field1730.length);
            }
            byte[] var12;
            try {
                var12 = class272.method1785(var10, -71);
            } catch (RuntimeException var31) {
                throw class14.method83(var31, "T3 - " + (arg1 != null) + "," + arg2 + "," + var10.length + "," + class158.method1085(var10, 20484, var10.length) + "," + class158.method1085(var10, 20484, var10.length - 2) + "," + this.field1944.field1684[arg2] + "," + this.field1944.field1673);
            }
            if (this.field1931) {
                this.field1925[arg2] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var4 * var15 * 4;
                class101 var17 = new class101(var12);
                var17.field1762 = var16;
                int[] var18 = new int[var4];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var17.method655((byte) 116);
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                var17.field1762 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var17.method655((byte) 62);
                        class235.method1557(var12, var24, var22[var27], var18[var27], var26);
                        var24 += var26;
                        var18[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field1948) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class237.method1566(false, var22[var28], (byte) -10);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field1948) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class237.method1566(false, var12, (byte) -10);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(II)I")
    public final int method754(int arg0, int arg1) {
        int var3 = -104 % ((65 - arg0) / 52);
        field1943++;
        return this.method730((byte) 61, arg1) ? this.field1944.field1677[arg1] : 0;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(BI)[B")
    public final byte[] method755(byte arg0, int arg1) {
        field1941++;
        if (arg0 != -74) {
            this.field1931 = false;
        }
        if (!this.method738((byte) -54)) {
            return null;
        } else if (this.field1944.field1677.length == 1) {
            return this.method746(arg1, (byte) -128, 0);
        } else if (!this.method730((byte) 59, arg1)) {
            return null;
        } else if (this.field1944.field1677[arg1] == 1) {
            return this.method746(0, (byte) -128, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[III)[B")
    public final byte[] method756(int arg0, int[] arg1, int arg2, int arg3) {
        field1935++;
        if (!this.method748(arg2, -62, arg0)) {
            return null;
        }
        if (arg3 != 1) {
            this.method726(-122, -32, (byte) -76);
        }
        if (this.field1953[arg0] == null || this.field1953[arg0][arg2] == null) {
            boolean var5 = this.method753(arg3 + 114, arg1, arg0);
            if (!var5) {
                this.method734(arg0, 0);
                boolean var6 = this.method753(118, arg1, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class248.method1663(false, this.field1953[arg0][arg2], -87);
        if (this.field1948) {
            this.field1953[arg0][arg2] = null;
            if (this.field1944.field1677[arg0] == 1) {
                this.field1953[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)I")
    public final int method757(int arg0) {
        field1937++;
        if (arg0 != -1) {
            this.field1953 = null;
        }
        return this.method738((byte) -109) ? this.field1944.field1677.length : -1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZI)I")
    private final int method758(boolean arg0, int arg1) {
        field1928++;
        if (!this.method730((byte) 109, arg1)) {
            return 0;
        } else if (arg0) {
            return this.field1925[arg1] == null ? this.field1940.method941(arg1, -2071) : 100;
        } else {
            return -31;
        }
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        field1952++;
        if (!this.method738((byte) 101)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1944.field1680.length; var3++) {
            int var4 = this.field1944.field1680[var3];
            if (this.field1925[var4] == null) {
                this.method734(var4, 0);
                if (this.field1925[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lnk;ZZ)V")
    public class108(class171 arg0, boolean arg1, boolean arg2) {
        this.field1940 = arg0;
        this.field1948 = arg2;
        this.field1931 = arg1;
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(II)Ldl;")
    public static final class46 method760(int arg0, int arg1) {
        field1951++;
        int var2 = arg1 & 0xFFFF;
        if (arg0 != -29533) {
            method760(-85, -127);
        }
        int var3 = arg1 >> 16;
        if (class115.field2068[var3] == null || class115.field2068[var3][var2] == null) {
            boolean var4 = class110.method766(-13786, var3);
            if (!var4) {
                return null;
            }
        }
        return class115.field2068[var3][var2];
    }
}
