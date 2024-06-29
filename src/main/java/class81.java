import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class81 extends class52 {

    @OriginalMember(owner = "client!ja", name = "yb", descriptor = "Z")
    private boolean field1927 = false;

    @OriginalMember(owner = "client!ja", name = "Gb", descriptor = "B")
    public byte field1935 = 0;

    @OriginalMember(owner = "client!ja", name = "tb", descriptor = "I")
    public int field1922 = 0;

    @OriginalMember(owner = "client!ja", name = "Ub", descriptor = "I")
    public int field1949 = 0;

    @OriginalMember(owner = "client!ja", name = "Ib", descriptor = "I")
    public int field1937;

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "[I")
    public int[] field1919;

    @OriginalMember(owner = "client!ja", name = "Cb", descriptor = "[I")
    public int[] field1931;

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "[I")
    public int[] field1912;

    @OriginalMember(owner = "client!ja", name = "Ob", descriptor = "[I")
    private int[] field1943;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "[I")
    public int[] field1910;

    @OriginalMember(owner = "client!ja", name = "Mb", descriptor = "[I")
    public int[] field1941;

    @OriginalMember(owner = "client!ja", name = "Vb", descriptor = "[I")
    public int[] field1950;

    @OriginalMember(owner = "client!ja", name = "Ab", descriptor = "[B")
    public byte[] field1929;

    @OriginalMember(owner = "client!ja", name = "sb", descriptor = "[B")
    public byte[] field1921;

    @OriginalMember(owner = "client!ja", name = "vb", descriptor = "[B")
    public byte[] field1924;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "[I")
    private int[] field1908;

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "[S")
    public short[] field1914;

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "[B")
    public byte[] field1918;

    @OriginalMember(owner = "client!ja", name = "rb", descriptor = "[S")
    public short[] field1920;

    @OriginalMember(owner = "client!ja", name = "Bb", descriptor = "[B")
    public byte[] field1930;

    @OriginalMember(owner = "client!ja", name = "Jb", descriptor = "[S")
    public short[] field1938;

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "[S")
    public short[] field1915;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "[S")
    public short[] field1904;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "[S")
    private short[] field1909;

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "[S")
    private short[] field1917;

    @OriginalMember(owner = "client!ja", name = "Fb", descriptor = "[S")
    private short[] field1934;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "[B")
    private byte[] field1911;

    @OriginalMember(owner = "client!ja", name = "Pb", descriptor = "[B")
    private byte[] field1944;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "[B")
    private byte[] field1905;

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "[B")
    private byte[] field1913;

    @OriginalMember(owner = "client!ja", name = "Eb", descriptor = "[B")
    private byte[] field1933;

    @OriginalMember(owner = "client!ja", name = "Tb", descriptor = "[[I")
    public int[][] field1948;

    @OriginalMember(owner = "client!ja", name = "zb", descriptor = "[[I")
    public int[][] field1928;

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "[Lwg;")
    public class204[] field1906;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "[Lhb;")
    public class65[] field1916;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "[Lwg;")
    public class204[] field1903;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "S")
    public short field1907;

    @OriginalMember(owner = "client!ja", name = "Lb", descriptor = "S")
    public short field1940;

    @OriginalMember(owner = "client!ja", name = "Kb", descriptor = "[I")
    private static int[] field1939 = new int[10000];

    @OriginalMember(owner = "client!ja", name = "Hb", descriptor = "I")
    private static int field1936 = 0;

    @OriginalMember(owner = "client!ja", name = "Rb", descriptor = "[I")
    private static int[] field1946 = class93.field2091;

    @OriginalMember(owner = "client!ja", name = "Qb", descriptor = "[I")
    private static int[] field1945 = class93.field2110;

    @OriginalMember(owner = "client!ja", name = "Nb", descriptor = "[I")
    private static int[] field1942 = new int[10000];

    @OriginalMember(owner = "client!ja", name = "ub", descriptor = "I")
    private int field1923;

    @OriginalMember(owner = "client!ja", name = "wb", descriptor = "I")
    private int field1925;

    @OriginalMember(owner = "client!ja", name = "xb", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!ja", name = "Db", descriptor = "I")
    private int field1932;

    @OriginalMember(owner = "client!ja", name = "Sb", descriptor = "I")
    private int field1947;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIZZ)Lrg;")
    public final class159 method681(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class49(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
    public final void method682() {
        for (int var1 = 0; var1 < this.field1949; ++var1) {
            int var2 = this.field1912[var1];
            this.field1912[var1] = this.field1919[var1];
            this.field1919[var1] = -var2;
        }
        this.method691();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method683(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1949; ++var4) {
            this.field1919[var4] += arg0;
            this.field1931[var4] += arg1;
            this.field1912[var4] += arg2;
        }
        this.method691();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method684() {
        for (int var1 = 0; var1 < this.field1949; ++var1) {
            int var2 = this.field1919[var1];
            this.field1919[var1] = this.field1912[var1];
            this.field1912[var1] = -var2;
        }
        this.method691();
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V")
    public static void method685() {
        field1942 = null;
        field1939 = null;
        field1946 = null;
        field1945 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([B)V")
    private final void method686(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class66 var4 = new class66(arg0);
        class66 var5 = new class66(arg0);
        class66 var6 = new class66(arg0);
        class66 var7 = new class66(arg0);
        class66 var8 = new class66(arg0);
        var4.field1620 = arg0.length - 18;
        int var9 = var4.method511(117);
        int var10 = var4.method511(-124);
        int var11 = var4.method509(122);
        int var12 = var4.method509(126);
        int var13 = var4.method509(123);
        int var14 = var4.method509(124);
        int var15 = var4.method509(125);
        int var16 = var4.method509(125);
        int var17 = var4.method511(26);
        int var18 = var4.method511(109);
        int var19 = var4.method511(-119);
        int var20 = var4.method511(-123);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field1949 = var9;
        this.field1922 = var10;
        this.field1937 = var11;
        this.field1919 = new int[var9];
        this.field1931 = new int[var9];
        this.field1912 = new int[var9];
        this.field1910 = new int[var10];
        this.field1941 = new int[var10];
        this.field1950 = new int[var10];
        if (var11 > 0) {
            this.field1930 = new byte[var11];
            this.field1938 = new short[var11];
            this.field1915 = new short[var11];
            this.field1904 = new short[var11];
        }
        if (var16 == 1) {
            this.field1943 = new int[var9];
        }
        if (var12 == 1) {
            this.field1929 = new byte[var10];
            this.field1918 = new byte[var10];
            this.field1914 = new short[var10];
        }
        if (var13 == 255) {
            this.field1921 = new byte[var10];
        } else {
            this.field1935 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1924 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1908 = new int[var10];
        }
        this.field1920 = new short[var10];
        var4.field1620 = var21;
        var5.field1620 = var36;
        var6.field1620 = var38;
        var7.field1620 = var40;
        var8.field1620 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method509(125);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method490(25);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method490(-119);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method490(-102);
            }
            this.field1919[var46] = var43 + var63;
            this.field1931[var46] = var44 + var64;
            this.field1912[var46] = var45 + var65;
            var43 = this.field1919[var46];
            var44 = this.field1931[var46];
            var45 = this.field1912[var46];
            if (var16 == 1) {
                this.field1943[var46] = var8.method509(116);
            }
        }
        var4.field1620 = var32;
        var5.field1620 = var28;
        var6.field1620 = var26;
        var7.field1620 = var30;
        var8.field1620 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field1920[var47] = (short) var4.method511(-128);
            if (var12 == 1) {
                int var61 = var5.method509(118);
                if ((var61 & 1) == 1) {
                    this.field1929[var47] = 1;
                    var2 = true;
                } else {
                    this.field1929[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field1918[var47] = (byte) (var61 >> 2);
                    this.field1914[var47] = this.field1920[var47];
                    this.field1920[var47] = 127;
                    if (this.field1914[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1918[var47] = -1;
                    this.field1914[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1921[var47] = var6.method513((byte) 112);
            }
            if (var14 == 1) {
                this.field1924[var47] = var7.method513((byte) 105);
            }
            if (var15 == 1) {
                this.field1908[var47] = var8.method509(124);
            }
        }
        var4.field1620 = var25;
        var5.field1620 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method509(119);
            if (var57 == 1) {
                var48 = var4.method490(19) + var51;
                var49 = var4.method490(-123) + var48;
                var50 = var4.method490(-100) + var49;
                var51 = var50;
                this.field1910[var52] = var48;
                this.field1941[var52] = var49;
                this.field1950[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method490(-101) + var51;
                var51 = var50;
                this.field1910[var52] = var48;
                this.field1941[var52] = var49;
                this.field1950[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method490(77) + var51;
                var51 = var50;
                this.field1910[var52] = var48;
                this.field1941[var52] = var49;
                this.field1950[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method490(53) + var51;
                var51 = var50;
                this.field1910[var52] = var48;
                this.field1941[var52] = var60;
                this.field1950[var52] = var50;
            }
        }
        var4.field1620 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field1930[var53] = 0;
            this.field1938[var53] = (short) var4.method511(-121);
            this.field1915[var53] = (short) var4.method511(112);
            this.field1904[var53] = (short) var4.method511(-128);
        }
        if (this.field1918 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field1918[var55] & 255;
                if (var56 != 255) {
                    if ((this.field1938[var56] & 65535) == this.field1910[var55] && (this.field1915[var56] & 65535) == this.field1941[var55] && (this.field1904[var56] & 65535) == this.field1950[var55]) {
                        this.field1918[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1918 = null;
            }
        }
        if (!var3) {
            this.field1914 = null;
        }
        if (!var2) {
            this.field1929 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "(I)V")
    public final void method687(int arg0) {
        int var2 = field1946[arg0];
        int var3 = field1945[arg0];
        for (int var4 = 0; var4 < this.field1949; ++var4) {
            int var5 = this.field1919[var4] * var3 + this.field1912[var4] * var2 >> 16;
            this.field1912[var4] = this.field1912[var4] * var3 - this.field1919[var4] * var2 >> 16;
            this.field1919[var4] = var5;
        }
        this.method691();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(SS)V")
    public final void method688(short arg0, short arg1) {
        if (this.field1914 != null) {
            for (int var3 = 0; var3 < this.field1922; ++var3) {
                if (this.field1914[var3] == arg0) {
                    this.field1914[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lja;I)I")
    private final int method689(class81 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1919[arg1];
        int var5 = arg0.field1931[arg1];
        int var6 = arg0.field1912[arg1];
        for (int var7 = 0; var7 < this.field1949; ++var7) {
            if (this.field1919[var7] == var4 && this.field1931[var7] == var5 && this.field1912[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1919[this.field1949] = var4;
            this.field1931[this.field1949] = var5;
            this.field1912[this.field1949] = var6;
            if (arg0.field1943 != null) {
                this.field1943[this.field1949] = arg0.field1943[arg1];
            }
            var3 = this.field1949++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "()V")
    private final void method690() {
        if (!this.field1927) {
            super.field1328 = 0;
            this.field1932 = 0;
            this.field1926 = 999999;
            this.field1947 = -999999;
            this.field1923 = -99999;
            this.field1925 = 99999;
            for (int var1 = 0; var1 < this.field1949; ++var1) {
                int var2 = this.field1919[var1];
                int var3 = this.field1931[var1];
                int var4 = this.field1912[var1];
                if (var2 < this.field1926) {
                    this.field1926 = var2;
                }
                if (var2 > this.field1947) {
                    this.field1947 = var2;
                }
                if (var4 < this.field1925) {
                    this.field1925 = var4;
                }
                if (var4 > this.field1923) {
                    this.field1923 = var4;
                }
                if (-var3 > super.field1328) {
                    super.field1328 = -var3;
                }
                if (var3 > this.field1932) {
                    this.field1932 = var3;
                }
            }
            this.field1927 = true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "()V")
    private final void method691() {
        this.field1906 = null;
        this.field1903 = null;
        this.field1916 = null;
        this.field1927 = false;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ldd;II)Lja;")
    public static final class81 method692(class32 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method215(arg2, arg1, 1);
        return var3 == null ? null : new class81(var3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lja;Lja;IIIZ)V")
    public static final void method693(class81 arg0, class81 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method690();
        arg0.method701();
        arg1.method690();
        arg1.method701();
        ++field1936;
        int var6 = 0;
        int[] var7 = arg1.field1919;
        int var8 = arg1.field1949;
        for (int var9 = 0; var9 < arg0.field1949; ++var9) {
            class204 var12 = arg0.field1906[var9];
            if (var12.field4025 != 0) {
                int var13 = arg0.field1931[var9] - arg3;
                if (var13 <= arg1.field1932) {
                    int var14 = arg0.field1919[var9] - arg2;
                    if (var14 >= arg1.field1926 && var14 <= arg1.field1947) {
                        int var15 = arg0.field1912[var9] - arg4;
                        if (var15 >= arg1.field1925 && var15 <= arg1.field1923) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class204 var17 = arg1.field1906[var16];
                                if (var7[var16] == var14 && arg1.field1912[var16] == var15 && arg1.field1931[var16] == var13 && var17.field4025 != 0) {
                                    if (arg0.field1903 == null) {
                                        arg0.field1903 = new class204[arg0.field1949];
                                    }
                                    if (arg1.field1903 == null) {
                                        arg1.field1903 = new class204[var8];
                                    }
                                    class204 var18 = arg0.field1903[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field1903[var9] = new class204(var12);
                                    }
                                    class204 var19 = arg1.field1903[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field1903[var16] = new class204(var17);
                                    }
                                    var18.field4021 += var17.field4021;
                                    var18.field4018 += var17.field4018;
                                    var18.field4015 += var17.field4015;
                                    var18.field4025 += var17.field4025;
                                    var19.field4021 += var12.field4021;
                                    var19.field4018 += var12.field4018;
                                    var19.field4015 += var12.field4015;
                                    var19.field4025 += var12.field4025;
                                    ++var6;
                                    field1942[var9] = field1936;
                                    field1939[var16] = field1936;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field1922; ++var10) {
                if (field1942[arg0.field1910[var10]] == field1936 && field1942[arg0.field1941[var10]] == field1936 && field1942[arg0.field1950[var10]] == field1936) {
                    if (arg0.field1929 == null) {
                        arg0.field1929 = new byte[arg0.field1922];
                    }
                    arg0.field1929[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field1922; ++var11) {
                if (field1939[arg1.field1910[var11]] == field1936 && field1939[arg1.field1941[var11]] == field1936 && field1939[arg1.field1950[var11]] == field1936) {
                    if (arg1.field1929 == null) {
                        arg1.field1929 = new byte[arg1.field1922];
                    }
                    arg1.field1929[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([[IIIIZI)Lja;")
    public final class81 method694(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method690();
        int var7 = this.field1926 + arg1;
        int var8 = this.field1947 + arg1;
        int var9 = this.field1925 + arg3;
        int var10 = this.field1923 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class81 var15;
                if (arg4) {
                    var15 = new class81();
                    var15.field1949 = this.field1949;
                    var15.field1922 = this.field1922;
                    var15.field1937 = this.field1937;
                    var15.field1919 = this.field1919;
                    var15.field1912 = this.field1912;
                    var15.field1910 = this.field1910;
                    var15.field1941 = this.field1941;
                    var15.field1950 = this.field1950;
                    var15.field1929 = this.field1929;
                    var15.field1921 = this.field1921;
                    var15.field1924 = this.field1924;
                    var15.field1918 = this.field1918;
                    var15.field1920 = this.field1920;
                    var15.field1914 = this.field1914;
                    var15.field1935 = this.field1935;
                    var15.field1930 = this.field1930;
                    var15.field1938 = this.field1938;
                    var15.field1915 = this.field1915;
                    var15.field1904 = this.field1904;
                    var15.field1909 = this.field1909;
                    var15.field1917 = this.field1917;
                    var15.field1934 = this.field1934;
                    var15.field1911 = this.field1911;
                    var15.field1944 = this.field1944;
                    var15.field1905 = this.field1905;
                    var15.field1913 = this.field1913;
                    var15.field1933 = this.field1933;
                    var15.field1943 = this.field1943;
                    var15.field1908 = this.field1908;
                    var15.field1948 = this.field1948;
                    var15.field1928 = this.field1928;
                    var15.field1907 = this.field1907;
                    var15.field1940 = this.field1940;
                    var15.field1931 = new int[var15.field1949];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field1949; ++var16) {
                        int var17 = this.field1919[var16] + arg1;
                        int var18 = this.field1912[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field1931[var16] = this.field1931[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field1949; ++var26) {
                        int var27 = (-this.field1931[var26] << 16) / super.field1328;
                        if (var27 < arg5) {
                            int var28 = this.field1919[var26] + arg1;
                            int var29 = this.field1912[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field1931[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1931[var26];
                        }
                    }
                }
                var15.method691();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "()Lja;")
    public final class81 method695() {
        class81 var1 = new class81();
        if (this.field1929 != null) {
            var1.field1929 = new byte[this.field1922];
            for (int var2 = 0; var2 < this.field1922; ++var2) {
                var1.field1929[var2] = this.field1929[var2];
            }
        }
        var1.field1949 = this.field1949;
        var1.field1922 = this.field1922;
        var1.field1937 = this.field1937;
        var1.field1919 = this.field1919;
        var1.field1931 = this.field1931;
        var1.field1912 = this.field1912;
        var1.field1910 = this.field1910;
        var1.field1941 = this.field1941;
        var1.field1950 = this.field1950;
        var1.field1921 = this.field1921;
        var1.field1924 = this.field1924;
        var1.field1918 = this.field1918;
        var1.field1920 = this.field1920;
        var1.field1914 = this.field1914;
        var1.field1935 = this.field1935;
        var1.field1930 = this.field1930;
        var1.field1938 = this.field1938;
        var1.field1915 = this.field1915;
        var1.field1904 = this.field1904;
        var1.field1909 = this.field1909;
        var1.field1917 = this.field1917;
        var1.field1934 = this.field1934;
        var1.field1911 = this.field1911;
        var1.field1944 = this.field1944;
        var1.field1905 = this.field1905;
        var1.field1913 = this.field1913;
        var1.field1933 = this.field1933;
        var1.field1943 = this.field1943;
        var1.field1908 = this.field1908;
        var1.field1948 = this.field1948;
        var1.field1928 = this.field1928;
        var1.field1906 = this.field1906;
        var1.field1916 = this.field1916;
        var1.field1907 = this.field1907;
        var1.field1940 = this.field1940;
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "()V")
    public final void method696() {
        for (int var1 = 0; var1 < this.field1949; ++var1) {
            this.field1919[var1] = -this.field1919[var1];
            this.field1912[var1] = -this.field1912[var1];
        }
        this.method691();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method697(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1949; ++var4) {
            this.field1919[var4] = this.field1919[var4] * arg0 / 128;
            this.field1931[var4] = this.field1931[var4] * arg1 / 128;
            this.field1912[var4] = this.field1912[var4] * arg2 / 128;
        }
        this.method691();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(SS)V")
    public final void method698(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1922; ++var3) {
            if (this.field1920[var3] == arg0) {
                this.field1920[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "([B)V")
    private final void method699(byte[] arg0) {
        class66 var2 = new class66(arg0);
        class66 var3 = new class66(arg0);
        class66 var4 = new class66(arg0);
        class66 var5 = new class66(arg0);
        class66 var6 = new class66(arg0);
        class66 var7 = new class66(arg0);
        class66 var8 = new class66(arg0);
        var2.field1620 = arg0.length - 23;
        int var9 = var2.method511(61);
        int var10 = var2.method511(-126);
        int var11 = var2.method509(122);
        int var12 = var2.method509(124);
        int var13 = var2.method509(122);
        int var14 = var2.method509(118);
        int var15 = var2.method509(125);
        int var16 = var2.method509(124);
        int var17 = var2.method509(124);
        int var18 = var2.method511(-128);
        int var19 = var2.method511(44);
        int var20 = var2.method511(-122);
        int var21 = var2.method511(72);
        int var22 = var2.method511(92);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1930 = new byte[var11];
            var2.field1620 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field1930[var26] = var2.method513((byte) 122);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field1949 = var9;
        this.field1922 = var10;
        this.field1937 = var11;
        this.field1919 = new int[var9];
        this.field1931 = new int[var9];
        this.field1912 = new int[var9];
        this.field1910 = new int[var10];
        this.field1941 = new int[var10];
        this.field1950 = new int[var10];
        if (var17 == 1) {
            this.field1943 = new int[var9];
        }
        if (var12 == 1) {
            this.field1929 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1921 = new byte[var10];
        } else {
            this.field1935 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1924 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1908 = new int[var10];
        }
        if (var16 == 1) {
            this.field1914 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1918 = new byte[var10];
        }
        this.field1920 = new short[var10];
        if (var11 > 0) {
            this.field1938 = new short[var11];
            this.field1915 = new short[var11];
            this.field1904 = new short[var11];
            if (var24 > 0) {
                this.field1909 = new short[var24];
                this.field1917 = new short[var24];
                this.field1934 = new short[var24];
                this.field1911 = new byte[var24];
                this.field1944 = new byte[var24];
                this.field1905 = new byte[var24];
            }
            if (var25 > 0) {
                this.field1913 = new byte[var25];
                this.field1933 = new byte[var25];
            }
        }
        var2.field1620 = var11;
        var3.field1620 = var44;
        var4.field1620 = var46;
        var5.field1620 = var48;
        var6.field1620 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method509(126);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method490(38);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method490(26);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method490(115);
            }
            this.field1919[var67] = var64 + var82;
            this.field1931[var67] = var65 + var83;
            this.field1912[var67] = var66 + var84;
            var64 = this.field1919[var67];
            var65 = this.field1931[var67];
            var66 = this.field1912[var67];
            if (var17 == 1) {
                this.field1943[var67] = var6.method509(126);
            }
        }
        var2.field1620 = var42;
        var3.field1620 = var31;
        var4.field1620 = var34;
        var5.field1620 = var37;
        var6.field1620 = var35;
        var7.field1620 = var40;
        var8.field1620 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field1920[var68] = (short) var2.method511(-35);
            if (var12 == 1) {
                this.field1929[var68] = var3.method513((byte) 101);
            }
            if (var13 == 255) {
                this.field1921[var68] = var4.method513((byte) 122);
            }
            if (var14 == 1) {
                this.field1924[var68] = var5.method513((byte) 121);
            }
            if (var15 == 1) {
                this.field1908[var68] = var6.method509(116);
            }
            if (var16 == 1) {
                this.field1914[var68] = (short) (var7.method511(-120) - 1);
            }
            if (this.field1918 != null) {
                if (this.field1914[var68] != -1) {
                    this.field1918[var68] = (byte) (var8.method509(127) - 1);
                } else {
                    this.field1918[var68] = -1;
                }
            }
        }
        var2.field1620 = var33;
        var3.field1620 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method509(127);
            if (var77 == 1) {
                var69 = var2.method490(-101) + var72;
                var70 = var2.method490(-128) + var69;
                var71 = var2.method490(-126) + var70;
                var72 = var71;
                this.field1910[var73] = var69;
                this.field1941[var73] = var70;
                this.field1950[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method490(-109) + var72;
                var72 = var71;
                this.field1910[var73] = var69;
                this.field1941[var73] = var70;
                this.field1950[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method490(58) + var72;
                var72 = var71;
                this.field1910[var73] = var69;
                this.field1941[var73] = var70;
                this.field1950[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method490(-127) + var72;
                var72 = var71;
                this.field1910[var73] = var69;
                this.field1941[var73] = var80;
                this.field1950[var73] = var71;
            }
        }
        var2.field1620 = var50;
        var3.field1620 = var52;
        var4.field1620 = var54;
        var5.field1620 = var56;
        var6.field1620 = var58;
        var7.field1620 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field1930[var74] & 255;
            if (var76 == 0) {
                this.field1938[var74] = (short) var2.method511(-127);
                this.field1915[var74] = (short) var2.method511(-127);
                this.field1904[var74] = (short) var2.method511(-120);
            }
            if (var76 == 1) {
                this.field1938[var74] = (short) var3.method511(-119);
                this.field1915[var74] = (short) var3.method511(-1);
                this.field1904[var74] = (short) var3.method511(-128);
                this.field1909[var74] = (short) var4.method511(-122);
                this.field1917[var74] = (short) var4.method511(-30);
                this.field1934[var74] = (short) var4.method511(-34);
                this.field1911[var74] = var5.method513((byte) 100);
                this.field1944[var74] = var6.method513((byte) 100);
                this.field1905[var74] = var7.method513((byte) 103);
            }
            if (var76 == 2) {
                this.field1938[var74] = (short) var3.method511(59);
                this.field1915[var74] = (short) var3.method511(7);
                this.field1904[var74] = (short) var3.method511(-125);
                this.field1909[var74] = (short) var4.method511(-124);
                this.field1917[var74] = (short) var4.method511(76);
                this.field1934[var74] = (short) var4.method511(118);
                this.field1911[var74] = var5.method513((byte) 114);
                this.field1944[var74] = var6.method513((byte) 115);
                this.field1905[var74] = var7.method513((byte) 100);
                this.field1913[var74] = var7.method513((byte) 120);
                this.field1933[var74] = var7.method513((byte) 117);
            }
            if (var76 == 3) {
                this.field1938[var74] = (short) var3.method511(-119);
                this.field1915[var74] = (short) var3.method511(-119);
                this.field1904[var74] = (short) var3.method511(66);
                this.field1909[var74] = (short) var4.method511(88);
                this.field1917[var74] = (short) var4.method511(-128);
                this.field1934[var74] = (short) var4.method511(-121);
                this.field1911[var74] = var5.method513((byte) 90);
                this.field1944[var74] = var6.method513((byte) 123);
                this.field1905[var74] = var7.method513((byte) 111);
            }
        }
        var2.field1620 = var62;
        int var75 = var2.method509(127);
        if (var75 != 0) {
            new class25();
            var2.method511(-122);
            var2.method511(-123);
            var2.method511(-10);
            var2.method464(-119);
        }
    }

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "()V")
    public final void method700() {
        int var10002;
        if (this.field1943 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1949; ++var3) {
                int var7 = this.field1943[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1948 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field1948[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1949) {
                int var6 = this.field1943[var5];
                this.field1948[var6][var1[var6]++] = var5++;
            }
            this.field1943 = null;
        }
        if (this.field1908 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field1922; ++var10) {
                int var14 = this.field1908[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field1928 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field1928[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field1922) {
                int var13 = this.field1908[var12];
                this.field1928[var13][var8[var13]++] = var12++;
            }
            this.field1908 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "()V")
    public final void method701() {
        if (this.field1906 == null) {
            this.field1906 = new class204[this.field1949];
            for (int var1 = 0; var1 < this.field1949; ++var1) {
                this.field1906[var1] = new class204();
            }
            for (int var2 = 0; var2 < this.field1922; ++var2) {
                int var3 = this.field1910[var2];
                int var4 = this.field1941[var2];
                int var5 = this.field1950[var2];
                int var6 = this.field1919[var4] - this.field1919[var3];
                int var7 = this.field1931[var4] - this.field1931[var3];
                int var8 = this.field1912[var4] - this.field1912[var3];
                int var9 = this.field1919[var5] - this.field1919[var3];
                int var10 = this.field1931[var5] - this.field1931[var3];
                int var11 = this.field1912[var5] - this.field1912[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field1929 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field1929[var2];
                }
                if (var19 == 0) {
                    class204 var20 = this.field1906[var3];
                    var20.field4021 += var16;
                    var20.field4018 += var17;
                    var20.field4015 += var18;
                    ++var20.field4025;
                    class204 var21 = this.field1906[var4];
                    var21.field4021 += var16;
                    var21.field4018 += var17;
                    var21.field4015 += var18;
                    ++var21.field4025;
                    class204 var22 = this.field1906[var5];
                    var22.field4021 += var16;
                    var22.field4018 += var17;
                    var22.field4015 += var18;
                    ++var22.field4025;
                } else if (var19 == 1) {
                    if (this.field1916 == null) {
                        this.field1916 = new class65[this.field1922];
                    }
                    class65 var23 = this.field1916[var2] = new class65();
                    var23.field1554 = var16;
                    var23.field1555 = var17;
                    var23.field1547 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "()V")
    public final void method702() {
        for (int var1 = 0; var1 < this.field1949; ++var1) {
            this.field1912[var1] = -this.field1912[var1];
        }
        for (int var2 = 0; var2 < this.field1922; ++var2) {
            int var3 = this.field1910[var2];
            this.field1910[var2] = this.field1950[var2];
            this.field1950[var2] = var3;
        }
        this.method691();
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    private class81() {
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([B)V")
    private class81(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method699(arg0);
        } else {
            this.method686(arg0);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "([Lja;I)V")
    public class81(class81[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1949 = 0;
        this.field1922 = 0;
        this.field1937 = 0;
        this.field1935 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class81 var15 = arg0[var9];
            if (var15 != null) {
                this.field1949 += var15.field1949;
                this.field1922 += var15.field1922;
                this.field1937 += var15.field1937;
                if (var15.field1921 != null) {
                    var4 = true;
                } else {
                    if (this.field1935 == -1) {
                        this.field1935 = var15.field1935;
                    }
                    if (this.field1935 != var15.field1935) {
                        var4 = true;
                    }
                }
                var3 |= var15.field1929 != null;
                var5 |= var15.field1924 != null;
                var6 |= var15.field1908 != null;
                var7 |= var15.field1914 != null;
                var8 |= var15.field1918 != null;
            }
        }
        this.field1919 = new int[this.field1949];
        this.field1931 = new int[this.field1949];
        this.field1912 = new int[this.field1949];
        this.field1943 = new int[this.field1949];
        this.field1910 = new int[this.field1922];
        this.field1941 = new int[this.field1922];
        this.field1950 = new int[this.field1922];
        if (var3) {
            this.field1929 = new byte[this.field1922];
        }
        if (var4) {
            this.field1921 = new byte[this.field1922];
        }
        if (var5) {
            this.field1924 = new byte[this.field1922];
        }
        if (var6) {
            this.field1908 = new int[this.field1922];
        }
        if (var7) {
            this.field1914 = new short[this.field1922];
        }
        if (var8) {
            this.field1918 = new byte[this.field1922];
        }
        this.field1920 = new short[this.field1922];
        if (this.field1937 > 0) {
            this.field1930 = new byte[this.field1937];
            this.field1938 = new short[this.field1937];
            this.field1915 = new short[this.field1937];
            this.field1904 = new short[this.field1937];
            this.field1909 = new short[this.field1937];
            this.field1917 = new short[this.field1937];
            this.field1934 = new short[this.field1937];
            this.field1911 = new byte[this.field1937];
            this.field1944 = new byte[this.field1937];
            this.field1905 = new byte[this.field1937];
            this.field1913 = new byte[this.field1937];
            this.field1933 = new byte[this.field1937];
        }
        this.field1949 = 0;
        this.field1922 = 0;
        this.field1937 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class81 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1922; ++var12) {
                    if (var3 && var11.field1929 != null) {
                        this.field1929[this.field1922] = var11.field1929[var12];
                    }
                    if (var4) {
                        if (var11.field1921 != null) {
                            this.field1921[this.field1922] = var11.field1921[var12];
                        } else {
                            this.field1921[this.field1922] = var11.field1935;
                        }
                    }
                    if (var5 && var11.field1924 != null) {
                        this.field1924[this.field1922] = var11.field1924[var12];
                    }
                    if (var6 && var11.field1908 != null) {
                        this.field1908[this.field1922] = var11.field1908[var12];
                    }
                    if (var7) {
                        if (var11.field1914 != null) {
                            this.field1914[this.field1922] = var11.field1914[var12];
                        } else {
                            this.field1914[this.field1922] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field1918 != null && var11.field1918[var12] != -1) {
                            this.field1918[this.field1922] = (byte) (var11.field1918[var12] + this.field1937);
                        } else {
                            this.field1918[this.field1922] = -1;
                        }
                    }
                    this.field1920[this.field1922] = var11.field1920[var12];
                    this.field1910[this.field1922] = this.method689(var11, var11.field1910[var12]);
                    this.field1941[this.field1922] = this.method689(var11, var11.field1941[var12]);
                    this.field1950[this.field1922] = this.method689(var11, var11.field1950[var12]);
                    ++this.field1922;
                }
                for (int var13 = 0; var13 < var11.field1937; ++var13) {
                    byte var14 = this.field1930[this.field1937] = var11.field1930[var13];
                    if (var14 == 0) {
                        this.field1938[this.field1937] = (short) this.method689(var11, var11.field1938[var13]);
                        this.field1915[this.field1937] = (short) this.method689(var11, var11.field1915[var13]);
                        this.field1904[this.field1937] = (short) this.method689(var11, var11.field1904[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field1938[this.field1937] = var11.field1938[var13];
                        this.field1915[this.field1937] = var11.field1915[var13];
                        this.field1904[this.field1937] = var11.field1904[var13];
                        this.field1909[this.field1937] = var11.field1909[var13];
                        this.field1917[this.field1937] = var11.field1917[var13];
                        this.field1934[this.field1937] = var11.field1934[var13];
                        this.field1911[this.field1937] = var11.field1911[var13];
                        this.field1944[this.field1937] = var11.field1944[var13];
                        this.field1905[this.field1937] = var11.field1905[var13];
                    }
                    if (var14 == 2) {
                        this.field1913[this.field1937] = var11.field1913[var13];
                        this.field1933[this.field1937] = var11.field1933[var13];
                    }
                    ++this.field1937;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lja;ZZZZ)V")
    public class81(class81 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1949 = arg0.field1949;
        this.field1922 = arg0.field1922;
        this.field1937 = arg0.field1937;
        if (arg1) {
            this.field1919 = arg0.field1919;
            this.field1931 = arg0.field1931;
            this.field1912 = arg0.field1912;
        } else {
            this.field1919 = new int[this.field1949];
            this.field1931 = new int[this.field1949];
            this.field1912 = new int[this.field1949];
            for (int var6 = 0; var6 < this.field1949; ++var6) {
                this.field1919[var6] = arg0.field1919[var6];
                this.field1931[var6] = arg0.field1931[var6];
                this.field1912[var6] = arg0.field1912[var6];
            }
        }
        if (arg2) {
            this.field1920 = arg0.field1920;
        } else {
            this.field1920 = new short[this.field1922];
            for (int var7 = 0; var7 < this.field1922; ++var7) {
                this.field1920[var7] = arg0.field1920[var7];
            }
        }
        if (!arg3 && arg0.field1914 != null) {
            this.field1914 = new short[this.field1922];
            for (int var8 = 0; var8 < this.field1922; ++var8) {
                this.field1914[var8] = arg0.field1914[var8];
            }
        } else {
            this.field1914 = arg0.field1914;
        }
        if (arg4) {
            this.field1924 = arg0.field1924;
        } else {
            this.field1924 = new byte[this.field1922];
            if (arg0.field1924 == null) {
                for (int var9 = 0; var9 < this.field1922; ++var9) {
                    this.field1924[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1922; ++var10) {
                    this.field1924[var10] = arg0.field1924[var10];
                }
            }
        }
        this.field1910 = arg0.field1910;
        this.field1941 = arg0.field1941;
        this.field1950 = arg0.field1950;
        this.field1929 = arg0.field1929;
        this.field1921 = arg0.field1921;
        this.field1918 = arg0.field1918;
        this.field1935 = arg0.field1935;
        this.field1930 = arg0.field1930;
        this.field1938 = arg0.field1938;
        this.field1915 = arg0.field1915;
        this.field1904 = arg0.field1904;
        this.field1909 = arg0.field1909;
        this.field1917 = arg0.field1917;
        this.field1934 = arg0.field1934;
        this.field1911 = arg0.field1911;
        this.field1944 = arg0.field1944;
        this.field1905 = arg0.field1905;
        this.field1913 = arg0.field1913;
        this.field1933 = arg0.field1933;
        this.field1943 = arg0.field1943;
        this.field1908 = arg0.field1908;
        this.field1948 = arg0.field1948;
        this.field1928 = arg0.field1928;
        this.field1906 = arg0.field1906;
        this.field1916 = arg0.field1916;
        this.field1903 = arg0.field1903;
        this.field1907 = arg0.field1907;
        this.field1940 = arg0.field1940;
    }
}
