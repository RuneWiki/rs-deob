import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class124 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lca;")
    private class131 field2050 = null;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "Z")
    private boolean field2074;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Z")
    private boolean field2062;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "Li;")
    private class113 field2082;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lcj;")
    public static class74 field2043 = null;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2047 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "[I")
    public static int[] field2077 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2081 = "Ok";

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[Ljava/lang/Object;")
    private Object[] field2048;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2045;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method886(byte arg0, String arg1) {
        field2044++;
        if (!this.method887(-1)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2050.field2175.method1275(class196.method1341((byte) 127, var3), 4461);
        if (arg0 != -78) {
            field2075 = -123;
        }
        return this.method903(var4, true);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Z")
    private final boolean method887(int arg0) {
        field2055++;
        if (this.field2050 == null) {
            this.field2050 = this.field2082.method398((byte) 0);
            if (this.field2050 == null) {
                return false;
            }
            this.field2045 = new Object[this.field2050.field2180][];
            this.field2048 = new Object[this.field2050.field2180];
        }
        return arg0 == -1 ? true : true;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)V")
    private final void method888(byte arg0, int arg1) {
        field2059++;
        this.field2082.method412(arg1, (byte) -94);
        if (arg0 != -100) {
            this.field2045 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method889(String arg0, int arg1) {
        field2039++;
        if (this.method887(arg1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field2050.field2175.method1275(class196.method1341((byte) 126, var3), 4461);
            return this.method907(var4, -111) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[III)[B")
    public final byte[] method890(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 != -4470616) {
            this.method896(-71, true);
        }
        field2057++;
        if (!this.method914(arg2, (byte) -43, arg3)) {
            return null;
        }
        if (this.field2045[arg2] == null || this.field2045[arg2][arg3] == null) {
            boolean var5 = this.method913(arg1, arg2, 0);
            if (!var5) {
                this.method911(10310, arg2);
                boolean var6 = this.method913(arg1, arg2, arg0 ^ 0xFFBBC8A8);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class6.method34(this.field2045[arg2][arg3], 0, false);
        if (this.field2074) {
            this.field2045[arg2][arg3] = null;
            if (this.field2050.field2174[arg2] == 1) {
                this.field2045[arg2] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public final int method891(int arg0, int arg1) {
        field2070++;
        if (arg0 != 0) {
            field2047 = null;
        }
        return this.method907(arg1, -125) ? this.field2050.field2174[arg1] : 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)[B")
    public final byte[] method892(int arg0, int arg1, int arg2) {
        field2046++;
        if (!this.method914(arg1, (byte) -38, arg0)) {
            return null;
        }
        int var4 = -127 / ((-arg2 - 78) / 34);
        if (this.field2045[arg1] == null || this.field2045[arg1][arg0] == null) {
            boolean var5 = this.method913((int[]) null, arg1, 0);
            if (!var5) {
                this.method911(10310, arg1);
                boolean var6 = this.method913((int[]) null, arg1, 0);
                if (!var6) {
                    return null;
                }
            }
        }
        return class6.method34(this.field2045[arg1][arg0], 0, false);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I")
    public final int method893(boolean arg0) {
        field2060++;
        if (!this.method887(-1)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2048.length; var4++) {
            if (this.field2050.field2185[var4] > 0) {
                var3 += this.method903(var4, arg0);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else if (arg0) {
            return var3 * 100 / var2;
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)V")
    public final void method894(boolean arg0, int arg1) {
        field2041++;
        if (!this.method907(arg1, -114)) {
            return;
        }
        if (this.field2045 != null) {
            this.field2045[arg1] = null;
        }
        if (!arg0) {
            field2043 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Z")
    public final boolean method895(boolean arg0) {
        field2056++;
        if (!this.method887(-1)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0) {
            return false;
        }
        while (var3 < this.field2050.field2170.length) {
            int var4 = this.field2050.field2170[var3];
            if (this.field2048[var4] == null) {
                this.method911(10310, var4);
                if (this.field2048[var4] == null) {
                    var2 = false;
                }
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)Z")
    public final boolean method896(int arg0, boolean arg1) {
        field2072++;
        if (arg1) {
            return true;
        } else if (!this.method907(arg0, -125)) {
            return false;
        } else if (this.field2048[arg0] == null) {
            this.method911(10310, arg0);
            return this.field2048[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(ZI)[B")
    public final byte[] method897(boolean arg0, int arg1) {
        field2069++;
        if (!this.method887(-1)) {
            return null;
        } else if (this.field2050.field2174.length == 1) {
            return this.method900(0, arg1, arg0);
        } else if (arg0) {
            return null;
        } else if (!this.method907(arg1, -113)) {
            return null;
        } else if (this.field2050.field2174[arg1] == 1) {
            return this.method900(arg1, 0, false);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method898(String arg0, int arg1, String arg2) {
        field2063++;
        if (!this.method887(arg1 ^ 0xFFFFD04A)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        if (arg1 != 12213) {
            return false;
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field2050.field2175.method1275(class196.method1341((byte) 127, var4), 4461);
        if (this.method907(var6, -123)) {
            int var7 = this.field2050.field2186[var6].method1275(class196.method1341((byte) 126, var5), arg1 - 7752);
            return this.method912(false, var7, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Z")
    public final boolean method899(int arg0, int arg1) {
        field2071++;
        if (!this.method887(-1)) {
            return false;
        }
        if (arg1 >= -74) {
            this.field2074 = true;
        }
        if (this.field2050.field2174.length == 1) {
            return this.method912(false, arg0, 0);
        } else if (!this.method907(arg0, -119)) {
            return false;
        } else if (this.field2050.field2174[arg0] == 1) {
            return this.method912(false, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZ)[B")
    public final byte[] method900(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return null;
        } else {
            field2064++;
            return this.method890(-4470616, (int[]) null, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method901(String arg0, byte arg1) {
        field2078++;
        if (!this.method887(-1)) {
            return false;
        }
        if (arg1 != 6) {
            this.method899(-6, -102);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field2050.field2175.method1275(class196.method1341((byte) 126, var3), arg1 + 4455);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method902(String arg0, byte arg1) {
        field2067++;
        if (this.method887(-1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field2050.field2175.method1275(class196.method1341((byte) 126, var3), 4461);
            return arg1 < 14 ? true : this.method896(var4, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IZ)I")
    private final int method903(int arg0, boolean arg1) {
        if (!arg1) {
            field2047 = null;
        }
        field2052++;
        if (this.method907(arg0, -110)) {
            return this.field2048[arg0] == null ? this.field2082.method399(-26533, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method904(int arg0, String arg1) {
        field2080++;
        if (arg0 != -30963) {
            this.method906((String) null, (String) null, (byte) 86);
        }
        if (this.method887(arg0 + 30962)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2050.field2175.method1275(class196.method1341((byte) 126, var3), 4461);
            this.method888((byte) -100, var4);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
    public final int method905(int arg0) {
        field2073++;
        return this.method887(arg0) ? this.field2050.field2174.length : -1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
    public final byte[] method906(String arg0, String arg1, byte arg2) {
        field2068++;
        if (!this.method887(-1)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field2050.field2175.method1275(class196.method1341((byte) 127, var4), 4461);
        if (!this.method907(var6, -114)) {
            return null;
        }
        if (arg2 > -19) {
            field2066 = 73;
        }
        int var7 = this.field2050.field2186[var6].method1275(class196.method1341((byte) 126, var5), 4461);
        return this.method900(var6, var7, false);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)Z")
    private final boolean method907(int arg0, int arg1) {
        if (arg1 > -109) {
            this.field2062 = false;
        }
        field2076++;
        if (!this.method887(-1)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field2050.field2174.length && this.field2050.field2174[arg0] != 0) {
            return true;
        } else if (class220.field3521) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZZ)V")
    public final void method908(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != -17338) {
            this.field2074 = false;
        }
        field2054++;
        if (!this.method887(-1)) {
            return;
        }
        if (arg2) {
            this.field2050.field2171 = null;
            this.field2050.field2186 = null;
        }
        if (arg1) {
            this.field2050.field2175 = null;
            this.field2050.field2165 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public final void method909(int arg0) {
        field2049++;
        int var2 = 50 % ((24 - arg0) / 34);
        if (this.field2045 != null) {
            for (int var3 = 0; var3 < this.field2045.length; var3++) {
                this.field2045[var3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)[I")
    public final int[] method910(int arg0, int arg1) {
        field2040++;
        if (!this.method907(arg1, -112)) {
            return null;
        }
        int[] var3 = this.field2050.field2176[arg1];
        if (arg0 != 0) {
            this.method899(29, 9);
        }
        if (var3 == null) {
            var3 = new int[this.field2050.field2185[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(II)V")
    private final void method911(int arg0, int arg1) {
        if (this.field2062) {
            this.field2048[arg1] = this.field2082.method409(30, arg1);
        } else {
            this.field2048[arg1] = class79.method641(false, this.field2082.method409(arg0 - 10193, arg1), class172.method1232(arg0, 10446));
        }
        if (arg0 == 10310) {
            field2079++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZII)Z")
    public final boolean method912(boolean arg0, int arg1, int arg2) {
        field2051++;
        if (!this.method914(arg2, (byte) -26, arg1)) {
            return false;
        } else if (this.field2045[arg2] != null && this.field2045[arg2][arg1] != null) {
            return true;
        } else if (this.field2048[arg2] == null) {
            this.method911(10310, arg2);
            if (this.field2048[arg2] == null) {
                return arg0 ? false : false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([III)Z")
    private final boolean method913(int[] arg0, int arg1, int arg2) {
        field2065++;
        if (!this.method907(arg1, -127)) {
            return false;
        } else if (this.field2048[arg1] == null) {
            return false;
        } else {
            int var4 = this.field2050.field2185[arg1];
            int[] var5 = this.field2050.field2176[arg1];
            if (this.field2045[arg1] == null) {
                this.field2045[arg1] = new Object[this.field2050.field2174[arg1]];
            }
            Object[] var6 = this.field2045[arg1];
            boolean var7 = true;
            for (int var8 = arg2; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
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
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class6.method34(this.field2048[arg1], 0, true);
                class136 var11 = new class136(var10);
                var11.method1016(arg0, 5, var11.field2263.length, 119);
            } else {
                var10 = class6.method34(this.field2048[arg1], 0, false);
            }
            byte[] var12;
            try {
                var12 = class273.method1849(arg2 ^ 0xFFFFFFCC, var10);
            } catch (RuntimeException var31) {
                throw class127.method926(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class6.method28(var10, false, var10.length) + "," + class6.method28(var10, false, var10.length - 2) + "," + this.field2050.field2172[arg1] + "," + this.field2050.field2173);
            }
            if (this.field2062) {
                this.field2048[arg1] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field2074) {
                    var6[var14] = var12;
                } else {
                    var6[var14] = class79.method641(false, var12, arg2 + 136);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                int[] var17 = new int[var4];
                class136 var18 = new class136(var12);
                int var19 = var32 - var4 * var16 * 4;
                var18.field2231 = var19;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var18.method1022(-94);
                        var17[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var17[var24]];
                    var17[var24] = 0;
                }
                var18.field2231 = var19;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var18.method1022(arg2 + 101);
                        class68.method529(var12, var25, var23[var28], var17[var28], var27);
                        var25 += var27;
                        var17[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field2074) {
                        var6[var30] = var23[var29];
                    } else {
                        var6[var30] = class79.method641(false, var23[var29], 136);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)Z")
    private final boolean method914(int arg0, byte arg1, int arg2) {
        field2042++;
        if (!this.method887(-1)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field2050.field2174.length && this.field2050.field2174[arg0] > arg2) {
            int var4 = 39 / ((27 - arg1) / 50);
            return true;
        } else if (class220.field3521) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method915(byte arg0) {
        field2077 = null;
        field2047 = null;
        field2081 = null;
        if (arg0 >= 120) {
            field2043 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIZLel;I)V")
    public static final void method916(int arg0, int arg1, int arg2, boolean arg3, class77 arg4, int arg5) {
        field2061++;
        if (class153.field2497 >= 50 || arg4 == null || arg4.field1283 == null || arg4.field1283.length <= arg5 || arg4.field1283[arg5] == null) {
            return;
        }
        int var6 = arg4.field1283[arg5][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xFE) >> 5;
        int var9 = var6 & 0x1F;
        if (arg4.field1283[arg5].length > 1) {
            int var10 = (int) ((double) arg4.field1283[arg5].length * Math.random());
            if (var10 > 0) {
                var7 = arg4.field1283[arg5][var10];
            }
        }
        if (var9 == 0) {
            if (arg3) {
                class106.method788(var7, 0, 255, (byte) -74, var8);
            }
        } else if (class111.field1719 != 0) {
            int var11 = (arg1 - 64) / 128;
            if (arg2 != 477628496) {
                method917(111, 66, (class213) null, 92);
            }
            class286.field4555[class153.field2497] = var7;
            class4.field60[class153.field2497] = var8;
            int var12 = (arg0 - 64) / 128;
            class194.field3171[class153.field2497] = 0;
            class92.field1447[class153.field2497] = null;
            class70.field1175[class153.field2497] = 255;
            class116.field1959[class153.field2497] = (var11 << 16) + (var12 << 8) + var9;
            class153.field2497++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILmk;I)V")
    public static final void method917(int arg0, int arg1, class213 arg2, int arg3) {
        if ((arg3 & 0x10) != 0) {
            int var4 = class143.field2360.method1004(122);
            int var5 = class143.field2360.method976((byte) -113);
            arg2.method1225((byte) -116, var4, class207.field3336, var5);
            arg2.field2842 = class207.field3336 + 300;
            arg2.field2904 = class143.field2360.method1015((byte) 75);
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field2857 = class143.field2360.method976((byte) -77);
            arg2.field2865 = class143.field2360.method1003(-128);
            arg2.field2839 = class143.field2360.method1012(4);
            arg2.field2848 = class143.field2360.method1012(4);
            arg2.field2836 = class143.field2360.method996(65280) + class207.field3336;
            arg2.field2866 = class143.field2360.method988(744911448) + class207.field3336;
            arg2.field2822 = class143.field2360.method976((byte) -98);
            arg2.field2883 = 0;
            arg2.field2843 = 1;
        }
        field2058++;
        if ((arg3 & 0x800) != 0) {
            int var6 = class143.field2360.method1025((byte) 73);
            int var7 = class143.field2360.method986(-1909920360);
            boolean var8 = true;
            if (var6 == 65535) {
                var6 = -1;
            }
            if (var6 != -1 && arg2.field2817 != -1 && class28.method246(-95, class35.method298(var6, false).field4455).field1257 < class28.method246(-53, class35.method298(arg2.field2817, false).field4455).field1257) {
                var8 = false;
            }
            if (var8) {
                arg2.field2856 = (var7 & 0xFFFF) + class207.field3336;
                arg2.field2812 = 0;
                arg2.field2823 = 1;
                if (class207.field3336 < arg2.field2856) {
                    arg2.field2812 = -1;
                }
                arg2.field2817 = var6;
                arg2.field2897 = 0;
                arg2.field2807 = var7 >> 16;
                if (arg2.field2817 != -1 && class207.field3336 == arg2.field2856) {
                    int var9 = class35.method298(arg2.field2817, false).field4455;
                    if (var9 != -1) {
                        class77 var10 = class28.method246(92, var9);
                        if (var10 != null && var10.field1256 != null) {
                            method916(arg2.field2887, arg2.field2849, 477628496, class48.field878 == arg2, var10, 0);
                        }
                    }
                }
            }
        }
        if ((arg3 & 0x100) != 0) {
            int var11 = class143.field2360.method1004(122);
            int var12 = class143.field2360.method1003(-128);
            arg2.method1225((byte) -116, var11, class207.field3336, var12);
        }
        if ((arg3 & 0x20) != 0) {
            int var13 = class143.field2360.method988(744911448);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class143.field2360.method976((byte) -121);
            class238.method1572((byte) 103, var14, arg2, var13);
        }
        if ((arg3 & 0x4) != 0) {
            int var15 = class143.field2360.method976((byte) -93);
            byte[] var16 = new byte[var15];
            class136 var17 = new class136(var16);
            class143.field2360.method998(116, var15, var16, 0);
            class128.field2112[arg1] = var17;
            arg2.method1416(var17, 1);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field2829 = class143.field2360.method1025((byte) 73);
            arg2.field2815 = class143.field2360.method1025((byte) 84);
        }
        if ((arg3 & 0x8) != 0) {
            int var18 = class143.field2360.method1025((byte) 118);
            int var19 = class143.field2360.method1003(-128);
            int var20 = class143.field2360.method1015((byte) -71);
            boolean var21 = (var18 & 0x8000) != 0;
            int var22 = class143.field2360.field2231;
            if (arg2.field3445 != null && arg2.field3439 != null) {
                long var23 = class260.method1739(false, arg2.field3445);
                boolean var25 = false;
                if (var19 <= 1) {
                    if (var21 || (!class116.field1945 || class228.field3642) && !class189.field3090) {
                        for (int var26 = 0; var26 < class286.field4554; var26++) {
                            if (class145.field2390[var26] == var23) {
                                var25 = true;
                                break;
                            }
                        }
                    } else {
                        var25 = true;
                    }
                }
                if (!var25 && class200.field3264 == 0) {
                    class126.field2089.field2231 = 0;
                    class143.field2360.method1018(class126.field2089.field2263, 0, var20, true);
                    class126.field2089.field2231 = 0;
                    int var27 = -1;
                    String var29;
                    if (var21) {
                        var18 &= 0x7FFF;
                        class297 var28 = class263.method1770(675, class126.field2089);
                        var27 = var28.field4693;
                        var29 = var28.field4702.method147(115, class126.field2089);
                    } else {
                        var29 = class73.method566(class100.method748(class102.method759(class126.field2089, (byte) 86), -8924));
                    }
                    arg2.field2840 = var29.trim();
                    arg2.field2898 = var18 >> 8;
                    arg2.field2864 = 150;
                    arg2.field2867 = var18 & 0xFF;
                    if (var19 == 2) {
                        class267.method1819(var29, var27, (String) null, "<img=1>" + arg2.method1414((byte) 96), 0, var21 ? 17 : 1);
                    } else if (var19 == 1) {
                        class267.method1819(var29, var27, (String) null, "<img=0>" + arg2.method1414((byte) 56), 0, var21 ? 17 : 1);
                    } else {
                        class267.method1819(var29, var27, (String) null, arg2.method1414((byte) -95), 0, var21 ? 17 : 2);
                    }
                }
            }
            class143.field2360.field2231 = var20 + var22;
        }
        if (arg0 < 3) {
            field2075 = 80;
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field2840 = class143.field2360.method1010(-113);
            if (arg2.field2840.charAt(0) == '~') {
                arg2.field2840 = arg2.field2840.substring(1);
                class106.method787(arg2.field2840, arg2.method1414((byte) 39), 2, true);
            } else if (class48.field878 == arg2) {
                class106.method787(arg2.field2840, arg2.method1414((byte) 109), 2, true);
            }
            arg2.field2898 = 0;
            arg2.field2864 = 150;
            arg2.field2867 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            int var30 = class143.field2360.method1015((byte) 84);
            int[] var31 = new int[var30];
            int[] var32 = new int[var30];
            int[] var33 = new int[var30];
            for (int var34 = 0; var34 < var30; var34++) {
                int var35 = class143.field2360.method1025((byte) 38);
                if (var35 == 65535) {
                    var35 = -1;
                }
                var31[var34] = var35;
                var32[var34] = class143.field2360.method1015((byte) 82);
                var33[var34] = class143.field2360.method996(65280);
            }
            class35.method297(arg2, var32, var31, var33, (byte) 91);
        }
        if ((arg3 & 0x40) == 0) {
            return;
        }
        arg2.field2832 = class143.field2360.method1011((byte) 125);
        if (arg2.field2832 == 65535) {
            arg2.field2832 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)I")
    public final int method918(byte arg0) {
        field2053++;
        if (!this.method887(arg0 ^ 0x7B)) {
            throw new IllegalStateException("");
        }
        if (arg0 != -124) {
            this.method902((String) null, (byte) -28);
        }
        return this.field2050.field2173;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Li;ZZ)V")
    public class124(class113 arg0, boolean arg1, boolean arg2) {
        this.field2074 = arg2;
        this.field2062 = arg1;
        this.field2082 = arg0;
    }
}
