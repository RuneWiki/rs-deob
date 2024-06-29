import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class132 {

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Lofa;")
    private class298 field1820 = null;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
    private boolean field1833;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "Lica;")
    private class608 field1842;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "[Lct;")
    public static class131[] field1840 = new class131[14];

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field1843 = 0;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "F")
    public static float field1836;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "Lpj;")
    public static class132 field1859;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "[Ljava/lang/Object;")
    private Object[] field1837;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1819;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    private final void method915(int arg0, boolean arg1) {
        if (!arg1) {
            field1860 = -82;
        }
        field1821++;
        this.field1842.method3365(arg0, (byte) -116);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method916(int arg0, String arg1, String arg2) {
        field1855++;
        if (!this.method927(false)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1820.field4446.method3262(class293.method1835(var4, (byte) -105), -1);
        if (!this.method922(0, var6)) {
            return false;
        } else if (arg0 >= -44) {
            return true;
        } else {
            int var7 = this.field1820.field4456[var6].method3262(class293.method1835(var5, (byte) -20), -1);
            return this.method931((byte) 83, var7, var6);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)I")
    public final int method917(byte arg0) {
        field1857++;
        if (arg0 != -74) {
            this.field1842 = null;
        }
        return this.method927(false) ? this.field1820.field4452.length : -1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public final void method918(boolean arg0) {
        field1851++;
        if (!arg0) {
            this.method937(null, null, 104);
        }
        if (this.field1819 != null) {
            for (int var2 = 0; var2 < this.field1819.length; var2++) {
                this.field1819[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)I")
    public final int method919(int arg0, byte arg1) {
        if (arg1 >= -18) {
            return -37;
        }
        field1830++;
        if (this.method927(false)) {
            int var3 = this.field1820.field4446.method3262(arg0, -1);
            return this.method922(0, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method920(int arg0, String arg1) {
        field1824++;
        if (arg0 != 2) {
            return 63;
        } else if (this.method927(false)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field1820.field4446.method3262(class293.method1835(var3, (byte) -18), -1);
            return this.method922(arg0 - 2, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([IIII)Z")
    private final boolean method921(int[] arg0, int arg1, int arg2, int arg3) {
        field1838++;
        if (!this.method922(0, arg2)) {
            return false;
        } else if (this.field1837[arg2] == null) {
            return false;
        } else {
            int var5 = this.field1820.field4441[arg2];
            int[] var6 = this.field1820.field4449[arg2];
            if (this.field1819[arg2] == null) {
                this.field1819[arg2] = new Object[this.field1820.field4452[arg2]];
            }
            Object[] var7 = this.field1819[arg2];
            boolean var8 = true;
            for (int var9 = arg1; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var11 = class116.method852(this.field1837[arg2], false, false);
            } else {
                var11 = class116.method852(this.field1837[arg2], true, false);
                class96 var12 = new class96(var11);
                var12.method751(110, 5, var12.field1316.length, arg0);
            }
            byte[] var13;
            try {
                var13 = class623.method3465(56, var11);
            } catch (RuntimeException var49) {
                throw class348.method2070(var49, "T3 - " + (arg0 != null) + "," + arg2 + "," + var11.length + "," + class528.method2931((byte) -119, var11.length, var11) + "," + class528.method2931((byte) 74, var11.length - 2, var11) + "," + this.field1820.field4440[arg2] + "," + this.field1820.field4454);
            }
            if (this.field1833) {
                this.field1837[arg2] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field1844 == 0) {
                    var7[var48] = class534.method2952(false, var13, 97);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field1844 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * 4 * var32;
                class96 var34 = new class96(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field1301 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method714(false);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg3 == var40) {
                            var36 = var40;
                            var35 += var38;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field1301 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method714(false);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg3 == var47) {
                            class282.method1706(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var16 * 4 * var5;
                class96 var18 = new class96(var13);
                var18.field1301 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method714(false);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field1301 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method714(false);
                        class282.method1706(var13, var25, var23[var28], var19[var28], var27);
                        var25 += var27;
                        var19[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field1844 == 0) {
                        var7[var30] = class534.method2952(false, var23[var29], 124);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Z")
    private final boolean method922(int arg0, int arg1) {
        field1829++;
        if (!this.method927(false)) {
            return false;
        } else if (arg0 != 0) {
            return true;
        } else if (arg1 >= 0 && this.field1820.field4452.length > arg1 && this.field1820.field4452[arg1] != 0) {
            return true;
        } else if (class644.field9151) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method923(String arg0, byte arg1) {
        if (arg1 != 68) {
            return -111;
        }
        field1847++;
        if (this.method927(false)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1820.field4446.method3262(class293.method1835(var3, (byte) -53), -1);
            return this.method933(22, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Z")
    public final boolean method924(int arg0) {
        field1832++;
        if (!this.method927(false)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1820.field4442.length; var3++) {
            int var5 = this.field1820.field4442[var3];
            if (this.field1837[var5] == null) {
                this.method930((byte) 7, var5);
                if (this.field1837[var5] == null) {
                    var2 = false;
                }
            }
        }
        int var4 = 6 % ((arg0 - 11) / 55);
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZZ)V")
    public final void method925(byte arg0, boolean arg1, boolean arg2) {
        if (arg0 >= -97) {
            this.method923(null, (byte) -15);
        }
        field1841++;
        if (!this.method927(false)) {
            return;
        }
        if (arg2) {
            this.field1820.field4456 = null;
            this.field1820.field4439 = null;
        }
        if (arg1) {
            this.field1820.field4450 = null;
            this.field1820.field4446 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)Z")
    private final boolean method926(int arg0, boolean arg1, int arg2) {
        field1850++;
        if (!this.method927(!arg1)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field1820.field4452.length && this.field1820.field4452[arg0] > arg2) {
            return arg1 ? true : true;
        } else if (class644.field9151) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Z")
    private final boolean method927(boolean arg0) {
        field1835++;
        if (this.field1820 == null) {
            this.field1820 = this.field1842.method3360(-125);
            if (this.field1820 == null) {
                return false;
            }
            this.field1819 = new Object[this.field1820.field4447][];
            this.field1837 = new Object[this.field1820.field4447];
        }
        return !arg0;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public final void method928(int arg0) {
        if (arg0 > -78) {
            return;
        }
        if (this.field1837 != null) {
            for (int var2 = 0; var2 < this.field1837.length; var2++) {
                this.field1837[var2] = null;
            }
        }
        field1828++;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)V")
    public final void method929(int arg0, int arg1) {
        int var3 = -122 % ((-arg1 - 20) / 44);
        field1845++;
        if (this.method922(0, arg0) && this.field1819 != null) {
            this.field1819[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)V")
    private final void method930(byte arg0, int arg1) {
        field1834++;
        if (this.field1833) {
            this.field1837[arg1] = this.field1842.method3358((byte) -40, arg1);
        } else {
            this.field1837[arg1] = class534.method2952(false, this.field1842.method3358((byte) -83, arg1), 90);
        }
        if (arg0 <= 3) {
            field1843 = -113;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)Z")
    public final boolean method931(byte arg0, int arg1, int arg2) {
        field1849++;
        if (!this.method926(arg2, true, arg1)) {
            return false;
        } else if (this.field1819[arg2] != null && this.field1819[arg2][arg1] != null) {
            return true;
        } else if (this.field1837[arg2] == null) {
            this.method930((byte) 122, arg2);
            if (this.field1837[arg2] == null) {
                if (arg0 <= 76) {
                    field1840 = null;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/lang/String;B)V")
    public final void method932(String arg0, byte arg1) {
        field1854++;
        if (!this.method927(false)) {
            return;
        }
        if (arg1 >= -111) {
            this.method929(62, 34);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1820.field4446.method3262(class293.method1835(var3, (byte) -88), -1);
        this.method915(var4, true);
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(II)I")
    private final int method933(int arg0, int arg1) {
        if (arg0 < 19) {
            this.method926(-128, false, -43);
        }
        field1853++;
        if (this.method922(0, arg1)) {
            return this.field1837[arg1] == null ? this.field1842.method3364((byte) 88, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method934(String arg0, byte arg1) {
        field1831++;
        if (!this.method927(false)) {
            return false;
        }
        if (arg1 > -125) {
            field1840 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1820.field4446.method3262(class293.method1835(var3, (byte) -118), -1);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)I")
    public final int method935(boolean arg0) {
        field1846++;
        if (!arg0) {
            return 43;
        } else if (this.method927(!arg0)) {
            int var2 = 0;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1837.length; var4++) {
                if (this.field1820.field4441[var4] > 0) {
                    var3 += this.method933(83, var4);
                    var2 += 100;
                }
            }
            if (var2 == 0) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(II)I")
    public final int method936(int arg0, int arg1) {
        if (arg1 > -109) {
            this.method935(true);
        }
        field1848++;
        return this.method922(0, arg0) ? this.field1820.field4452[arg0] : 0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method937(String arg0, String arg1, int arg2) {
        field1823++;
        if (!this.method927(false)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field1820.field4446.method3262(class293.method1835(var4, (byte) -69), ~arg2);
        if (this.method922(arg2 ^ arg2, var6)) {
            int var7 = this.field1820.field4456[var6].method3262(class293.method1835(var5, (byte) -53), -1);
            return this.method940(var6, var7, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)[B")
    public final byte[] method938(int arg0, byte arg1) {
        field1852++;
        if (!this.method927(false)) {
            return null;
        } else if (this.field1820.field4452.length == 1) {
            return this.method940(0, arg0, arg1 + 53);
        } else if (!this.method922(0, arg0)) {
            return null;
        } else if (this.field1820.field4452[arg0] == 1) {
            return this.method940(arg0, 0, 0);
        } else if (arg1 == -53) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(BI)[I")
    public final int[] method939(byte arg0, int arg1) {
        if (arg0 != 23) {
            this.field1819 = null;
        }
        field1825++;
        if (!this.method922(0, arg1)) {
            return null;
        }
        int[] var3 = this.field1820.field4449[arg1];
        if (var3 == null) {
            var3 = new int[this.field1820.field4441[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lica;ZI)V")
    public class132(class608 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field1833 = arg1;
        this.field1842 = arg0;
        this.field1844 = arg2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)[B")
    public final byte[] method940(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field1843 = -62;
        }
        field1858++;
        return this.method942(arg0, null, 7904, arg1);
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(Z)V")
    public static void method941(boolean arg0) {
        field1840 = null;
        field1859 = null;
        if (arg0) {
            method941(true);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[III)[B")
    public final byte[] method942(int arg0, int[] arg1, int arg2, int arg3) {
        field1826++;
        if (!this.method926(arg0, true, arg3)) {
            return null;
        }
        if (this.field1819[arg0] == null || this.field1819[arg0][arg3] == null) {
            boolean var5 = this.method921(arg1, 0, arg0, arg3);
            if (!var5) {
                this.method930((byte) 51, arg0);
                boolean var6 = this.method921(arg1, 0, arg0, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class116.method852(this.field1819[arg0][arg3], false, false);
        if (this.field1844 == 1) {
            this.field1819[arg0][arg3] = null;
            if (this.field1820.field4452[arg0] == 1) {
                this.field1819[arg0] = null;
            }
        } else if (this.field1844 == 2) {
            this.field1819[arg0] = null;
        }
        if (arg2 != 7904) {
            this.field1837 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method943(int arg0, String arg1, String arg2) {
        field1822++;
        if (!this.method927(false)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1820.field4446.method3262(class293.method1835(var4, (byte) -124), -1);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field1820.field4456[var6].method3262(class293.method1835(var5, (byte) -24), arg0);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)I")
    public final int method944(int arg0) {
        if (arg0 < 54) {
            return 57;
        }
        field1839++;
        if (!this.method927(false)) {
            throw new IllegalStateException("");
        }
        return this.field1820.field4454;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(II)Z")
    public final boolean method945(int arg0, int arg1) {
        field1827++;
        if (!this.method922(0, arg0)) {
            return false;
        } else if (this.field1837[arg0] == null) {
            this.method930((byte) 121, arg0);
            if (this.field1837[arg0] == null) {
                return arg1 == -9969 ? false : false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method946(String arg0, byte arg1) {
        field1856++;
        if (!this.method927(false)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 3) {
            method941(false);
        }
        int var4 = this.field1820.field4446.method3262(class293.method1835(var3, (byte) -42), -1);
        return this.method945(var4, arg1 ^ 0xFFFFD90C);
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(II)Z")
    public final boolean method947(int arg0, int arg1) {
        field1861++;
        int var3 = -50 / ((arg0 - 38) / 54);
        if (!this.method927(false)) {
            return false;
        } else if (this.field1820.field4452.length == 1) {
            return this.method931((byte) 117, arg1, 0);
        } else if (!this.method922(0, arg1)) {
            return false;
        } else if (this.field1820.field4452[arg1] == 1) {
            return this.method931((byte) 95, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }
}
