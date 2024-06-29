import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class120 {

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "Lse;")
    private class13 field1973 = null;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "Z")
    private boolean field1959;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Lwa;")
    private class89 field1944;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "Z")
    private boolean field1948;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1937 = 0;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "[I")
    public static int[] field1942 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "Z")
    private static boolean field1951 = false;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "[S")
    public static short[] field1960 = new short[500];

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1971 = "Connection lost.";

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Lpk;")
    public static class120 field1938;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "Lpk;")
    public static class120 field1965;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
    public static int[] field1928;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "[Ljava/lang/Object;")
    private Object[] field1953;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1964;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B", line = 6)
    public final byte[] method935(String arg0, int arg1, String arg2) {
        field1946++;
        if (!this.method956(false)) {
            return null;
        } else if (arg1 > -69) {
            return (byte[]) null;
        } else {
            String var4 = arg0.toLowerCase();
            String var5 = arg2.toLowerCase();
            int var6 = this.field1973.field295.method89(class305.method2163(0, var4), (byte) -32);
            if (this.method947(var6, 0)) {
                int var7 = this.field1973.field280[var6].method89(class305.method2163(0, var5), (byte) -90);
                return this.method967(var6, var7, 65280);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([IIII)[B", line = 34)
    public final byte[] method936(int[] arg0, int arg1, int arg2, int arg3) {
        field1943++;
        if (!this.method945(arg1, arg2, 21684)) {
            return null;
        }
        if (this.field1964[arg1] == null || this.field1964[arg1][arg2] == null) {
            boolean var5 = this.method959(arg1, arg0, 92);
            if (!var5) {
                this.method964(arg3 ^ 0x6C, arg1);
                boolean var6 = this.method959(arg1, arg0, 102);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class149.method1131((byte) 115, false, this.field1964[arg1][arg2]);
        if (arg3 != -2) {
            this.method962((byte) -70, 64);
        }
        if (this.field1959) {
            this.field1964[arg1][arg2] = null;
            if (this.field1973.field281[arg1] == 1) {
                this.field1964[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZBZ)V", line = 75)
    public final void method937(boolean arg0, byte arg1, boolean arg2) {
        field1955++;
        if (!this.method956(false)) {
            return;
        }
        if (arg1 < 124) {
            this.method959(92, (int[]) null, -92);
        }
        if (arg2) {
            this.field1973.field295 = null;
            this.field1973.field298 = null;
        }
        if (arg0) {
            this.field1973.field288 = (int[][]) null;
            this.field1973.field280 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLjava/lang/String;)V", line = 102)
    public final void method938(byte arg0, String arg1) {
        field1931++;
        if (this.method956(false)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1973.field295.method89(class305.method2163(0, var3), (byte) -39);
            int var5 = 47 % ((arg0 - 6) / 46);
            this.method948(true, var4);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)Z", line = 119)
    public final boolean method939(byte arg0, int arg1) {
        field1932++;
        if (!this.method956(false)) {
            return false;
        } else if (this.field1973.field281.length == 1) {
            return this.method953(arg1, 0, true);
        } else if (!this.method947(arg1, 0)) {
            return false;
        } else if (this.field1973.field281[arg1] == 1) {
            return this.method953(0, arg1, true);
        } else {
            if (arg0 <= 44) {
                this.method949(-4, false);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I", line = 148)
    public final int[] method940(int arg0, byte arg1) {
        field1929++;
        if (!this.method947(arg0, 0)) {
            return null;
        }
        int[] var3 = this.field1973.field294[arg0];
        if (arg1 != -60) {
            this.method937(true, (byte) -62, true);
        }
        if (var3 == null) {
            var3 = new int[this.field1973.field285[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 181)
    public static void method941(int arg0) {
        field1942 = null;
        field1960 = null;
        field1971 = null;
        field1965 = null;
        field1938 = null;
        field1928 = null;
        if (arg0 != -1) {
            method944(-96);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)I", line = 197)
    public final int method942(byte arg0) {
        field1945++;
        if (!this.method956(false)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 >= -26) {
            field1971 = (String) null;
        }
        for (int var4 = 0; var4 < this.field1953.length; var4++) {
            if (this.field1973.field285[var4] > 0) {
                var3 += this.method963(-12067, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 241)
    public final boolean method943(boolean arg0, String arg1) {
        if (!arg0) {
            return false;
        }
        field1939++;
        if (this.method956(false)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1973.field295.method89(class305.method2163(0, var3), (byte) -77);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 268)
    public static final void method944(int arg0) {
        field1954++;
        class146.field2395.method2283((byte) 77);
        class179.field2847.method2283((byte) 77);
        class89.field1429.method2283((byte) 77);
        class14.field306.method2283((byte) 77);
        int var1 = -104 % ((arg0 + 53) / 46);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)Z", line = 283)
    private final boolean method945(int arg0, int arg1, int arg2) {
        field1956++;
        if (!this.method956(false)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && this.field1973.field281.length > arg0 && this.field1973.field281[arg0] > arg1) {
            if (arg2 != 21684) {
                field1971 = (String) null;
            }
            return true;
        } else if (field1951) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)I", line = 308)
    public final int method946(byte arg0) {
        int var2 = 21 % ((arg0 + 54) / 57);
        field1972++;
        if (!this.method956(false)) {
            throw new IllegalStateException("");
        }
        return this.field1973.field283;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)Z", line = 322)
    private final boolean method947(int arg0, int arg1) {
        field1934++;
        if (!this.method956(false)) {
            return false;
        } else if (arg1 <= arg0 && this.field1973.field281.length > arg0 && this.field1973.field281[arg0] != 0) {
            return true;
        } else if (field1951) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V", line = 345)
    private final void method948(boolean arg0, int arg1) {
        field1967++;
        if (!arg0) {
            this.method951(-33, (String) null);
        }
        this.field1944.method709(0, arg1);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)V", line = 356)
    public final void method949(int arg0, boolean arg1) {
        field1941++;
        if (!arg1 && this.method947(arg0, 0) && this.field1964 != null) {
            this.field1964[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)[B", line = 377)
    public final byte[] method950(int arg0, int arg1) {
        field1963++;
        if (!this.method956(false)) {
            return null;
        } else if (this.field1973.field281.length == 1) {
            return this.method967(0, arg1, 65280);
        } else if (arg0 != -1516) {
            return (byte[]) null;
        } else if (!this.method947(arg1, 0)) {
            return null;
        } else if (this.field1973.field281[arg1] == 1) {
            return this.method967(arg1, 0, 65280);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 406)
    public final boolean method951(int arg0, String arg1) {
        field1950++;
        if (this.method956(false)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1973.field295.method89(class305.method2163(arg0 ^ arg0, var3), (byte) 108);
            return this.method965(var4, arg0 + 126);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 420)
    public final boolean method952(String arg0, String arg1, int arg2) {
        if (arg2 != 29098) {
            this.field1964 = (Object[][]) ((Object[][]) null);
        }
        field1947++;
        if (!this.method956(false)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field1973.field295.method89(class305.method2163(0, var4), (byte) -78);
        if (this.method947(var6, 0)) {
            int var7 = this.field1973.field280[var6].method89(class305.method2163(0, var5), (byte) 90);
            return this.method953(var7, var6, true);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZ)Z", line = 445)
    public final boolean method953(int arg0, int arg1, boolean arg2) {
        field1952++;
        if (!this.method945(arg1, arg0, 21684)) {
            return false;
        } else if (this.field1964[arg1] != null && this.field1964[arg1][arg0] != null) {
            return true;
        } else if (!arg2) {
            return false;
        } else if (this.field1953[arg1] == null) {
            this.method964(-102, arg1);
            return this.field1953[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)V", line = 472)
    public static final void method954(int arg0, int arg1, int arg2, int arg3) {
        field1933++;
        if (arg1 <= 69) {
            field1937 = 52;
        }
        int var4 = class80.field1253 * arg3 >> 8;
        if (var4 != 0 && arg2 != -1) {
            class66.method527(class136.field2209, var4, 0, arg2, false, 10000);
            class188.field2957 = true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(BLjava/lang/String;)I", line = 504)
    public final int method955(byte arg0, String arg1) {
        field1940++;
        if (!this.method956(false)) {
            return 0;
        } else if (arg0 >= -113) {
            return -66;
        } else {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1973.field295.method89(class305.method2163(0, var3), (byte) -22);
            return this.method963(-12067, var4);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)Z", line = 532)
    private final boolean method956(boolean arg0) {
        if (arg0) {
            field1965 = (class120) null;
        }
        field1949++;
        if (this.field1973 == null) {
            this.field1973 = this.field1944.method708((byte) 83);
            if (this.field1973 == null) {
                return false;
            }
            this.field1964 = new Object[this.field1973.field293][];
            this.field1953 = new Object[this.field1973.field293];
        }
        return true;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIB)[B", line = 553)
    public final byte[] method957(int arg0, int arg1, byte arg2) {
        field1970++;
        if (arg2 < 70) {
            this.field1973 = (class13) null;
        }
        if (!this.method945(arg0, arg1, 21684)) {
            return null;
        }
        if (this.field1964[arg0] == null || this.field1964[arg0][arg1] == null) {
            boolean var4 = this.method959(arg0, (int[]) null, 100);
            if (!var4) {
                this.method964(-71, arg0);
                boolean var5 = this.method959(arg0, (int[]) null, 91);
                if (!var5) {
                    return null;
                }
            }
        }
        return class149.method1131((byte) 115, false, this.field1964[arg0][arg1]);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(ILjava/lang/String;)I", line = 591)
    public final int method958(int arg0, String arg1) {
        field1966++;
        if (!this.method956(false)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1973.field295.method89(class305.method2163(0, var3), (byte) -87);
        if (arg0 < 101) {
            method944(-21);
        }
        return this.method947(var4, 0) ? var4 : -1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[II)Z", line = 613)
    private final boolean method959(int arg0, int[] arg1, int arg2) {
        field1958++;
        if (!this.method947(arg0, 0)) {
            return false;
        } else if (this.field1953[arg0] == null) {
            return false;
        } else {
            int[] var4 = this.field1973.field294[arg0];
            int var5 = this.field1973.field285[arg0];
            if (this.field1964[arg0] == null) {
                this.field1964[arg0] = new Object[this.field1973.field281[arg0]];
            }
            Object[] var6 = this.field1964[arg0];
            boolean var7 = true;
            for (int var8 = 0; var8 < var5; var8++) {
                int var9;
                if (var4 == null) {
                    var9 = var8;
                } else {
                    var9 = var4[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var10 = class149.method1131((byte) 115, true, this.field1953[arg0]);
                class1 var11 = new class1(var10);
                var11.method54(var11.field34.length, arg1, 5, (byte) -2);
            } else {
                var10 = class149.method1131((byte) 115, false, this.field1953[arg0]);
            }
            if (arg2 <= 87) {
                this.method966((byte) 51);
            }
            byte[] var12;
            try {
                var12 = class266.method1834(var10, 1);
            } catch (RuntimeException var31) {
                throw class242.method1711(var31, "T3 - " + (arg1 != null) + "," + arg0 + "," + var10.length + "," + class233.method1680(-122, var10, var10.length) + "," + class233.method1680(72, var10, var10.length - 2) + "," + this.field1973.field287[arg0] + "," + this.field1973.field283);
            }
            if (this.field1948) {
                this.field1953[arg0] = null;
            }
            if (var5 <= 1) {
                int var14;
                if (var4 == null) {
                    var14 = 0;
                } else {
                    var14 = var4[0];
                }
                if (this.field1959) {
                    var6[var14] = var12;
                } else {
                    var6[var14] = class103.method834(-128, var12, false);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                int var17 = var32 - var5 * 4 * var16;
                class1 var18 = new class1(var12);
                var18.field48 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method33(false);
                        var19[var22] += var21;
                        if (var4 != null) {
                        }
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field48 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method33(false);
                        class330.method2315(var12, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var4 == null) {
                        var30 = var29;
                    } else {
                        var30 = var4[var29];
                    }
                    if (this.field1959) {
                        var6[var30] = var23[var29];
                    } else {
                        var6[var30] = class103.method834(-128, var23[var29], false);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)Z", line = 812)
    public final boolean method960(byte arg0) {
        field1935++;
        if (!this.method956(false)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 >= -40) {
            this.field1973 = (class13) null;
        }
        while (this.field1973.field282.length > var3) {
            int var4 = this.field1973.field282[var3];
            if (this.field1953[var4] == null) {
                this.method964(-61, var4);
                if (this.field1953[var4] == null) {
                    var2 = false;
                }
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V", line = 851)
    public final void method961(int arg0) {
        if (this.field1964 != null) {
            for (int var2 = 0; var2 < this.field1964.length; var2++) {
                this.field1964[var2] = null;
            }
        }
        field1969++;
        if (arg0 != -1) {
            this.method957(-45, 124, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(BI)I", line = 874)
    public final int method962(byte arg0, int arg1) {
        field1930++;
        if (arg0 >= -90) {
            this.method940(28, (byte) -2);
        }
        return this.method947(arg1, 0) ? this.field1973.field281[arg1] : 0;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)I", line = 892)
    private final int method963(int arg0, int arg1) {
        field1962++;
        if (!this.method947(arg1, 0)) {
            return 0;
        } else if (this.field1953[arg1] == null) {
            return arg0 == -12067 ? this.field1944.method707(24545, arg1) : -10;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(II)V", line = 912)
    private final void method964(int arg0, int arg1) {
        if (this.field1948) {
            this.field1953[arg1] = this.field1944.method706((byte) -56, arg1);
        } else {
            this.field1953[arg1] = class103.method834(-128, this.field1944.method706((byte) -54, arg1), false);
        }
        field1957++;
        if (arg0 > -28) {
            this.method940(74, (byte) -101);
        }
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(II)Z", line = 927)
    public final boolean method965(int arg0, int arg1) {
        field1968++;
        if (!this.method947(arg0, 0)) {
            return false;
        } else if (this.field1953[arg0] == null) {
            this.method964(-51, arg0);
            if (this.field1953[arg0] == null) {
                return arg1 < 123 ? false : false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)I", line = 951)
    public final int method966(byte arg0) {
        field1936++;
        if (this.method956(false)) {
            return arg0 == 14 ? this.field1973.field281.length : 96;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)[B", line = 969)
    public final byte[] method967(int arg0, int arg1, int arg2) {
        if (arg2 == 65280) {
            field1961++;
            return this.method936((int[]) null, arg0, arg1, -2);
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lwa;ZZ)V", line = 990)
    public class120(class89 arg0, boolean arg1, boolean arg2) {
        this.field1959 = arg2;
        this.field1944 = arg0;
        this.field1948 = arg1;
    }
}
