import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class101 extends class42 {

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
    public int field1920 = 0;

    @OriginalMember(owner = "client!lb", name = "qb", descriptor = "I")
    public int field1928 = 0;

    @OriginalMember(owner = "client!lb", name = "tb", descriptor = "B")
    public byte field1931 = 0;

    @OriginalMember(owner = "client!lb", name = "Tb", descriptor = "Z")
    private boolean field1957 = false;

    @OriginalMember(owner = "client!lb", name = "vb", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!lb", name = "mb", descriptor = "[I")
    public int[] field1924;

    @OriginalMember(owner = "client!lb", name = "Ob", descriptor = "[I")
    public int[] field1952;

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "[I")
    public int[] field1918;

    @OriginalMember(owner = "client!lb", name = "Db", descriptor = "[I")
    private int[] field1941;

    @OriginalMember(owner = "client!lb", name = "rb", descriptor = "[I")
    public int[] field1929;

    @OriginalMember(owner = "client!lb", name = "Fb", descriptor = "[I")
    public int[] field1943;

    @OriginalMember(owner = "client!lb", name = "Ib", descriptor = "[I")
    public int[] field1946;

    @OriginalMember(owner = "client!lb", name = "kb", descriptor = "[B")
    public byte[] field1922;

    @OriginalMember(owner = "client!lb", name = "Eb", descriptor = "[B")
    public byte[] field1942;

    @OriginalMember(owner = "client!lb", name = "pb", descriptor = "[B")
    public byte[] field1927;

    @OriginalMember(owner = "client!lb", name = "Pb", descriptor = "[I")
    private int[] field1953;

    @OriginalMember(owner = "client!lb", name = "ob", descriptor = "[S")
    public short[] field1926;

    @OriginalMember(owner = "client!lb", name = "Mb", descriptor = "[B")
    public byte[] field1950;

    @OriginalMember(owner = "client!lb", name = "Sb", descriptor = "[S")
    public short[] field1956;

    @OriginalMember(owner = "client!lb", name = "Kb", descriptor = "[B")
    public byte[] field1948;

    @OriginalMember(owner = "client!lb", name = "Vb", descriptor = "[S")
    public short[] field1959;

    @OriginalMember(owner = "client!lb", name = "Jb", descriptor = "[S")
    public short[] field1947;

    @OriginalMember(owner = "client!lb", name = "Qb", descriptor = "[S")
    public short[] field1954;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "[S")
    private short[] field1912;

    @OriginalMember(owner = "client!lb", name = "Nb", descriptor = "[S")
    private short[] field1951;

    @OriginalMember(owner = "client!lb", name = "Lb", descriptor = "[S")
    private short[] field1949;

    @OriginalMember(owner = "client!lb", name = "jb", descriptor = "[B")
    private byte[] field1921;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "[B")
    private byte[] field1919;

    @OriginalMember(owner = "client!lb", name = "lb", descriptor = "[B")
    private byte[] field1923;

    @OriginalMember(owner = "client!lb", name = "Bb", descriptor = "[B")
    private byte[] field1939;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "[B")
    private byte[] field1915;

    @OriginalMember(owner = "client!lb", name = "yb", descriptor = "[[I")
    public int[][] field1936;

    @OriginalMember(owner = "client!lb", name = "ub", descriptor = "[[I")
    public int[][] field1932;

    @OriginalMember(owner = "client!lb", name = "zb", descriptor = "[Lch;")
    public class28[] field1937;

    @OriginalMember(owner = "client!lb", name = "Rb", descriptor = "[Lbc;")
    public class14[] field1955;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "[Lch;")
    public class28[] field1913;

    @OriginalMember(owner = "client!lb", name = "Ub", descriptor = "S")
    public short field1958;

    @OriginalMember(owner = "client!lb", name = "xb", descriptor = "S")
    public short field1935;

    @OriginalMember(owner = "client!lb", name = "nb", descriptor = "I")
    private static int field1925 = 0;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "[I")
    private static int[] field1917 = new int[10000];

    @OriginalMember(owner = "client!lb", name = "Ab", descriptor = "[I")
    private static int[] field1938 = new int[10000];

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "[I")
    private static int[] field1916 = class40.field717;

    @OriginalMember(owner = "client!lb", name = "wb", descriptor = "[I")
    private static int[] field1934 = class40.field719;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "S")
    private short field1914;

    @OriginalMember(owner = "client!lb", name = "sb", descriptor = "S")
    private short field1930;

    @OriginalMember(owner = "client!lb", name = "Cb", descriptor = "S")
    private short field1940;

    @OriginalMember(owner = "client!lb", name = "Gb", descriptor = "S")
    private short field1944;

    @OriginalMember(owner = "client!lb", name = "Hb", descriptor = "S")
    private short field1945;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(SS)V")
    public final void method749(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1920; ++var3) {
            if (this.field1956[var3] == arg0) {
                this.field1956[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V")
    public final void method750() {
        for (int var1 = 0; var1 < this.field1928; ++var1) {
            this.field1918[var1] = -this.field1918[var1];
        }
        for (int var2 = 0; var2 < this.field1920; ++var2) {
            int var3 = this.field1929[var2];
            this.field1929[var2] = this.field1946[var2];
            this.field1946[var2] = var3;
        }
        this.method765();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)Lna;")
    public final class118 method751(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class118(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V")
    public final void method752() {
        if (this.field1937 == null) {
            this.field1937 = new class28[this.field1928];
            for (int var1 = 0; var1 < this.field1928; ++var1) {
                this.field1937[var1] = new class28();
            }
            for (int var2 = 0; var2 < this.field1920; ++var2) {
                int var3 = this.field1929[var2];
                int var4 = this.field1943[var2];
                int var5 = this.field1946[var2];
                int var6 = this.field1924[var4] - this.field1924[var3];
                int var7 = this.field1952[var4] - this.field1952[var3];
                int var8 = this.field1918[var4] - this.field1918[var3];
                int var9 = this.field1924[var5] - this.field1924[var3];
                int var10 = this.field1952[var5] - this.field1952[var3];
                int var11 = this.field1918[var5] - this.field1918[var3];
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
                if (this.field1922 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field1922[var2];
                }
                if (var19 == 0) {
                    class28 var20 = this.field1937[var3];
                    var20.field490 += var16;
                    var20.field486 += var17;
                    var20.field488 += var18;
                    ++var20.field483;
                    class28 var21 = this.field1937[var4];
                    var21.field490 += var16;
                    var21.field486 += var17;
                    var21.field488 += var18;
                    ++var21.field483;
                    class28 var22 = this.field1937[var5];
                    var22.field490 += var16;
                    var22.field486 += var17;
                    var22.field488 += var18;
                    ++var22.field483;
                } else if (var19 == 1) {
                    if (this.field1955 == null) {
                        this.field1955 = new class14[this.field1920];
                    }
                    class14 var23 = this.field1955[var2] = new class14();
                    var23.field249 = var16;
                    var23.field251 = var17;
                    var23.field245 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([B)V")
    private final void method753(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class53 var4 = new class53(arg0);
        class53 var5 = new class53(arg0);
        class53 var6 = new class53(arg0);
        class53 var7 = new class53(arg0);
        class53 var8 = new class53(arg0);
        var4.field1000 = arg0.length - 18;
        int var9 = var4.method405(2);
        int var10 = var4.method405(2);
        int var11 = var4.method400(255);
        int var12 = var4.method400(255);
        int var13 = var4.method400(255);
        int var14 = var4.method400(255);
        int var15 = var4.method400(255);
        int var16 = var4.method400(255);
        int var17 = var4.method405(2);
        int var18 = var4.method405(2);
        int var19 = var4.method405(2);
        int var20 = var4.method405(2);
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
        this.field1928 = var9;
        this.field1920 = var10;
        this.field1933 = var11;
        this.field1924 = new int[var9];
        this.field1952 = new int[var9];
        this.field1918 = new int[var9];
        this.field1929 = new int[var10];
        this.field1943 = new int[var10];
        this.field1946 = new int[var10];
        if (var11 > 0) {
            this.field1948 = new byte[var11];
            this.field1959 = new short[var11];
            this.field1947 = new short[var11];
            this.field1954 = new short[var11];
        }
        if (var16 == 1) {
            this.field1941 = new int[var9];
        }
        if (var12 == 1) {
            this.field1922 = new byte[var10];
            this.field1950 = new byte[var10];
            this.field1926 = new short[var10];
        }
        if (var13 == 255) {
            this.field1942 = new byte[var10];
        } else {
            this.field1931 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1927 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1953 = new int[var10];
        }
        this.field1956 = new short[var10];
        var4.field1000 = var21;
        var5.field1000 = var36;
        var6.field1000 = var38;
        var7.field1000 = var40;
        var8.field1000 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method400(255);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method412(false);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method412(false);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method412(false);
            }
            this.field1924[var46] = var43 + var63;
            this.field1952[var46] = var44 + var64;
            this.field1918[var46] = var45 + var65;
            var43 = this.field1924[var46];
            var44 = this.field1952[var46];
            var45 = this.field1918[var46];
            if (var16 == 1) {
                this.field1941[var46] = var8.method400(255);
            }
        }
        var4.field1000 = var32;
        var5.field1000 = var28;
        var6.field1000 = var26;
        var7.field1000 = var30;
        var8.field1000 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field1956[var47] = (short) var4.method405(2);
            if (var12 == 1) {
                int var61 = var5.method400(255);
                if ((var61 & 1) == 1) {
                    this.field1922[var47] = 1;
                    var2 = true;
                } else {
                    this.field1922[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field1950[var47] = (byte) (var61 >> 2);
                    this.field1926[var47] = this.field1956[var47];
                    this.field1956[var47] = 127;
                    if (this.field1926[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field1950[var47] = -1;
                    this.field1926[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field1942[var47] = var6.method388(-29381);
            }
            if (var14 == 1) {
                this.field1927[var47] = var7.method388(-29381);
            }
            if (var15 == 1) {
                this.field1953[var47] = var8.method400(255);
            }
        }
        var4.field1000 = var25;
        var5.field1000 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method400(255);
            if (var57 == 1) {
                var48 = var4.method412(false) + var51;
                var49 = var4.method412(false) + var48;
                var50 = var4.method412(false) + var49;
                var51 = var50;
                this.field1929[var52] = var48;
                this.field1943[var52] = var49;
                this.field1946[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method412(false) + var51;
                var51 = var50;
                this.field1929[var52] = var48;
                this.field1943[var52] = var49;
                this.field1946[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method412(false) + var51;
                var51 = var50;
                this.field1929[var52] = var48;
                this.field1943[var52] = var49;
                this.field1946[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method412(false) + var51;
                var51 = var50;
                this.field1929[var52] = var48;
                this.field1943[var52] = var60;
                this.field1946[var52] = var50;
            }
        }
        var4.field1000 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field1948[var53] = 0;
            this.field1959[var53] = (short) var4.method405(2);
            this.field1947[var53] = (short) var4.method405(2);
            this.field1954[var53] = (short) var4.method405(2);
        }
        if (this.field1950 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field1950[var55] & 255;
                if (var56 != 255) {
                    if ((this.field1959[var56] & 65535) == this.field1929[var55] && (this.field1947[var56] & 65535) == this.field1943[var55] && (this.field1954[var56] & 65535) == this.field1946[var55]) {
                        this.field1950[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field1950 = null;
            }
        }
        if (!var3) {
            this.field1926 = null;
        }
        if (!var2) {
            this.field1922 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "()V")
    public static void method754() {
        field1917 = null;
        field1938 = null;
        field1916 = null;
        field1934 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIZZ)Lo;")
    public final class126 method755(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class118(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
    public final void method756(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1928; ++var4) {
            this.field1924[var4] = this.field1924[var4] * arg0 / 128;
            this.field1952[var4] = this.field1952[var4] * arg1 / 128;
            this.field1918[var4] = this.field1918[var4] * arg2 / 128;
        }
        this.method765();
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "()Llb;")
    public final class101 method757() {
        class101 var1 = new class101();
        if (this.field1922 != null) {
            var1.field1922 = new byte[this.field1920];
            for (int var2 = 0; var2 < this.field1920; ++var2) {
                var1.field1922[var2] = this.field1922[var2];
            }
        }
        var1.field1928 = this.field1928;
        var1.field1920 = this.field1920;
        var1.field1933 = this.field1933;
        var1.field1924 = this.field1924;
        var1.field1952 = this.field1952;
        var1.field1918 = this.field1918;
        var1.field1929 = this.field1929;
        var1.field1943 = this.field1943;
        var1.field1946 = this.field1946;
        var1.field1942 = this.field1942;
        var1.field1927 = this.field1927;
        var1.field1950 = this.field1950;
        var1.field1956 = this.field1956;
        var1.field1926 = this.field1926;
        var1.field1931 = this.field1931;
        var1.field1948 = this.field1948;
        var1.field1959 = this.field1959;
        var1.field1947 = this.field1947;
        var1.field1954 = this.field1954;
        var1.field1912 = this.field1912;
        var1.field1951 = this.field1951;
        var1.field1949 = this.field1949;
        var1.field1921 = this.field1921;
        var1.field1919 = this.field1919;
        var1.field1923 = this.field1923;
        var1.field1939 = this.field1939;
        var1.field1915 = this.field1915;
        var1.field1941 = this.field1941;
        var1.field1953 = this.field1953;
        var1.field1936 = this.field1936;
        var1.field1932 = this.field1932;
        var1.field1937 = this.field1937;
        var1.field1955 = this.field1955;
        var1.field1958 = this.field1958;
        var1.field1935 = this.field1935;
        return var1;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "([B)V")
    private final void method758(byte[] arg0) {
        class53 var2 = new class53(arg0);
        class53 var3 = new class53(arg0);
        class53 var4 = new class53(arg0);
        class53 var5 = new class53(arg0);
        class53 var6 = new class53(arg0);
        class53 var7 = new class53(arg0);
        class53 var8 = new class53(arg0);
        var2.field1000 = arg0.length - 23;
        int var9 = var2.method405(2);
        int var10 = var2.method405(2);
        int var11 = var2.method400(255);
        int var12 = var2.method400(255);
        int var13 = var2.method400(255);
        int var14 = var2.method400(255);
        int var15 = var2.method400(255);
        int var16 = var2.method400(255);
        int var17 = var2.method400(255);
        int var18 = var2.method405(2);
        int var19 = var2.method405(2);
        int var20 = var2.method405(2);
        int var21 = var2.method405(2);
        int var22 = var2.method405(2);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field1948 = new byte[var11];
            var2.field1000 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field1948[var26] = var2.method388(-29381);
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
        this.field1928 = var9;
        this.field1920 = var10;
        this.field1933 = var11;
        this.field1924 = new int[var9];
        this.field1952 = new int[var9];
        this.field1918 = new int[var9];
        this.field1929 = new int[var10];
        this.field1943 = new int[var10];
        this.field1946 = new int[var10];
        if (var17 == 1) {
            this.field1941 = new int[var9];
        }
        if (var12 == 1) {
            this.field1922 = new byte[var10];
        }
        if (var13 == 255) {
            this.field1942 = new byte[var10];
        } else {
            this.field1931 = (byte) var13;
        }
        if (var14 == 1) {
            this.field1927 = new byte[var10];
        }
        if (var15 == 1) {
            this.field1953 = new int[var10];
        }
        if (var16 == 1) {
            this.field1926 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field1950 = new byte[var10];
        }
        this.field1956 = new short[var10];
        if (var11 > 0) {
            this.field1959 = new short[var11];
            this.field1947 = new short[var11];
            this.field1954 = new short[var11];
            if (var24 > 0) {
                this.field1912 = new short[var24];
                this.field1951 = new short[var24];
                this.field1949 = new short[var24];
                this.field1921 = new byte[var24];
                this.field1919 = new byte[var24];
                this.field1923 = new byte[var24];
            }
            if (var25 > 0) {
                this.field1939 = new byte[var25];
                this.field1915 = new byte[var25];
            }
        }
        var2.field1000 = var11;
        var3.field1000 = var44;
        var4.field1000 = var46;
        var5.field1000 = var48;
        var6.field1000 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method400(255);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method412(false);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method412(false);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method412(false);
            }
            this.field1924[var67] = var64 + var82;
            this.field1952[var67] = var65 + var83;
            this.field1918[var67] = var66 + var84;
            var64 = this.field1924[var67];
            var65 = this.field1952[var67];
            var66 = this.field1918[var67];
            if (var17 == 1) {
                this.field1941[var67] = var6.method400(255);
            }
        }
        var2.field1000 = var42;
        var3.field1000 = var31;
        var4.field1000 = var34;
        var5.field1000 = var37;
        var6.field1000 = var35;
        var7.field1000 = var40;
        var8.field1000 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field1956[var68] = (short) var2.method405(2);
            if (var12 == 1) {
                this.field1922[var68] = var3.method388(-29381);
            }
            if (var13 == 255) {
                this.field1942[var68] = var4.method388(-29381);
            }
            if (var14 == 1) {
                this.field1927[var68] = var5.method388(-29381);
            }
            if (var15 == 1) {
                this.field1953[var68] = var6.method400(255);
            }
            if (var16 == 1) {
                this.field1926[var68] = (short) (var7.method405(2) - 1);
            }
            if (this.field1950 != null) {
                if (this.field1926[var68] != -1) {
                    this.field1950[var68] = (byte) (var8.method400(255) - 1);
                } else {
                    this.field1950[var68] = -1;
                }
            }
        }
        var2.field1000 = var33;
        var3.field1000 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method400(255);
            if (var77 == 1) {
                var69 = var2.method412(false) + var72;
                var70 = var2.method412(false) + var69;
                var71 = var2.method412(false) + var70;
                var72 = var71;
                this.field1929[var73] = var69;
                this.field1943[var73] = var70;
                this.field1946[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method412(false) + var72;
                var72 = var71;
                this.field1929[var73] = var69;
                this.field1943[var73] = var70;
                this.field1946[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method412(false) + var72;
                var72 = var71;
                this.field1929[var73] = var69;
                this.field1943[var73] = var70;
                this.field1946[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method412(false) + var72;
                var72 = var71;
                this.field1929[var73] = var69;
                this.field1943[var73] = var80;
                this.field1946[var73] = var71;
            }
        }
        var2.field1000 = var50;
        var3.field1000 = var52;
        var4.field1000 = var54;
        var5.field1000 = var56;
        var6.field1000 = var58;
        var7.field1000 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field1948[var74] & 255;
            if (var76 == 0) {
                this.field1959[var74] = (short) var2.method405(2);
                this.field1947[var74] = (short) var2.method405(2);
                this.field1954[var74] = (short) var2.method405(2);
            }
            if (var76 == 1) {
                this.field1959[var74] = (short) var3.method405(2);
                this.field1947[var74] = (short) var3.method405(2);
                this.field1954[var74] = (short) var3.method405(2);
                this.field1912[var74] = (short) var4.method405(2);
                this.field1951[var74] = (short) var4.method405(2);
                this.field1949[var74] = (short) var4.method405(2);
                this.field1921[var74] = var5.method388(-29381);
                this.field1919[var74] = var6.method388(-29381);
                this.field1923[var74] = var7.method388(-29381);
            }
            if (var76 == 2) {
                this.field1959[var74] = (short) var3.method405(2);
                this.field1947[var74] = (short) var3.method405(2);
                this.field1954[var74] = (short) var3.method405(2);
                this.field1912[var74] = (short) var4.method405(2);
                this.field1951[var74] = (short) var4.method405(2);
                this.field1949[var74] = (short) var4.method405(2);
                this.field1921[var74] = var5.method388(-29381);
                this.field1919[var74] = var6.method388(-29381);
                this.field1923[var74] = var7.method388(-29381);
                this.field1939[var74] = var7.method388(-29381);
                this.field1915[var74] = var7.method388(-29381);
            }
            if (var76 == 3) {
                this.field1959[var74] = (short) var3.method405(2);
                this.field1947[var74] = (short) var3.method405(2);
                this.field1954[var74] = (short) var3.method405(2);
                this.field1912[var74] = (short) var4.method405(2);
                this.field1951[var74] = (short) var4.method405(2);
                this.field1949[var74] = (short) var4.method405(2);
                this.field1921[var74] = var5.method388(-29381);
                this.field1919[var74] = var6.method388(-29381);
                this.field1923[var74] = var7.method388(-29381);
            }
        }
        var2.field1000 = var62;
        int var75 = var2.method400(255);
        if (var75 != 0) {
            new class170();
            var2.method405(2);
            var2.method405(2);
            var2.method405(2);
            var2.method419(-4);
        }
    }

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "(I)V")
    public final void method759(int arg0) {
        int var2 = field1916[arg0];
        int var3 = field1934[arg0];
        for (int var4 = 0; var4 < this.field1928; ++var4) {
            int var5 = this.field1924[var4] * var3 + this.field1918[var4] * var2 >> 16;
            this.field1918[var4] = this.field1918[var4] * var3 - this.field1924[var4] * var2 >> 16;
            this.field1924[var4] = var5;
        }
        this.method765();
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "()V")
    private final void method760() {
        if (!this.field1957) {
            this.field1957 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field1928; ++var7) {
                int var8 = this.field1924[var7];
                int var9 = this.field1952[var7];
                int var10 = this.field1918[var7];
                if (var8 < var1) {
                    var1 = var8;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var9 < var2) {
                    var2 = var9;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
                if (var10 < var3) {
                    var3 = var10;
                }
                if (var10 > var6) {
                    var6 = var10;
                }
            }
            this.field1940 = (short) var1;
            this.field1930 = (short) var4;
            super.field756 = (short) var2;
            this.field1944 = (short) var5;
            this.field1914 = (short) var3;
            this.field1945 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "()V")
    public final void method761() {
        for (int var1 = 0; var1 < this.field1928; ++var1) {
            this.field1924[var1] = -this.field1924[var1];
            this.field1918[var1] = -this.field1918[var1];
        }
        this.method765();
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(SS)V")
    public final void method762(short arg0, short arg1) {
        if (this.field1926 != null) {
            for (int var3 = 0; var3 < this.field1920; ++var3) {
                if (this.field1926[var3] == arg0) {
                    this.field1926[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
    public final void method763(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1928; ++var4) {
            this.field1924[var4] += arg0;
            this.field1952[var4] += arg1;
            this.field1918[var4] += arg2;
        }
        this.method765();
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "()V")
    public final void method764() {
        for (int var1 = 0; var1 < this.field1928; ++var1) {
            int var2 = this.field1918[var1];
            this.field1918[var1] = this.field1924[var1];
            this.field1924[var1] = -var2;
        }
        this.method765();
    }

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "()V")
    private final void method765() {
        this.field1937 = null;
        this.field1913 = null;
        this.field1955 = null;
        this.field1957 = false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Llb;Llb;IIIZ)V")
    public static final void method766(class101 arg0, class101 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method760();
        arg0.method752();
        arg1.method760();
        arg1.method752();
        ++field1925;
        int var6 = 0;
        int[] var7 = arg1.field1924;
        int var8 = arg1.field1928;
        for (int var9 = 0; var9 < arg0.field1928; ++var9) {
            class28 var12 = arg0.field1937[var9];
            if (var12.field483 != 0) {
                int var13 = arg0.field1952[var9] - arg3;
                if (var13 >= arg1.field756 && var13 <= arg1.field1944) {
                    int var14 = arg0.field1924[var9] - arg2;
                    if (var14 >= arg1.field1940 && var14 <= arg1.field1930) {
                        int var15 = arg0.field1918[var9] - arg4;
                        if (var15 >= arg1.field1914 && var15 <= arg1.field1945) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class28 var17 = arg1.field1937[var16];
                                if (var7[var16] == var14 && arg1.field1918[var16] == var15 && arg1.field1952[var16] == var13 && var17.field483 != 0) {
                                    if (arg0.field1913 == null) {
                                        arg0.field1913 = new class28[arg0.field1928];
                                    }
                                    if (arg1.field1913 == null) {
                                        arg1.field1913 = new class28[var8];
                                    }
                                    class28 var18 = arg0.field1913[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field1913[var9] = new class28(var12);
                                    }
                                    class28 var19 = arg1.field1913[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field1913[var16] = new class28(var17);
                                    }
                                    var18.field490 += var17.field490;
                                    var18.field486 += var17.field486;
                                    var18.field488 += var17.field488;
                                    var18.field483 += var17.field483;
                                    var19.field490 += var12.field490;
                                    var19.field486 += var12.field486;
                                    var19.field488 += var12.field488;
                                    var19.field483 += var12.field483;
                                    ++var6;
                                    field1917[var9] = field1925;
                                    field1938[var16] = field1925;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field1920; ++var10) {
                if (field1917[arg0.field1929[var10]] == field1925 && field1917[arg0.field1943[var10]] == field1925 && field1917[arg0.field1946[var10]] == field1925) {
                    if (arg0.field1922 == null) {
                        arg0.field1922 = new byte[arg0.field1920];
                    }
                    arg0.field1922[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field1920; ++var11) {
                if (field1938[arg1.field1929[var11]] == field1925 && field1938[arg1.field1943[var11]] == field1925 && field1938[arg1.field1946[var11]] == field1925) {
                    if (arg1.field1922 == null) {
                        arg1.field1922 = new byte[arg1.field1920];
                    }
                    arg1.field1922[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "()V")
    public final void method767() {
        int var10002;
        if (this.field1941 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1928; ++var3) {
                int var7 = this.field1941[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field1936 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field1936[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field1928) {
                int var6 = this.field1941[var5];
                this.field1936[var6][var1[var6]++] = var5++;
            }
            this.field1941 = null;
        }
        if (this.field1953 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field1920; ++var10) {
                int var14 = this.field1953[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field1932 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field1932[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field1920) {
                int var13 = this.field1953[var12];
                this.field1932[var13][var8[var13]++] = var12++;
            }
            this.field1953 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lf;II)Llb;")
    public static final class101 method768(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method353(arg1, arg2, -123);
        return var3 == null ? null : new class101(var3);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Llb;I)I")
    private final int method769(class101 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field1924[arg1];
        int var5 = arg0.field1952[arg1];
        int var6 = arg0.field1918[arg1];
        for (int var7 = 0; var7 < this.field1928; ++var7) {
            if (this.field1924[var7] == var4 && this.field1952[var7] == var5 && this.field1918[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field1924[this.field1928] = var4;
            this.field1952[this.field1928] = var5;
            this.field1918[this.field1928] = var6;
            if (arg0.field1941 != null) {
                this.field1941[this.field1928] = arg0.field1941[arg1];
            }
            var3 = this.field1928++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "()V")
    public final void method770() {
        for (int var1 = 0; var1 < this.field1928; ++var1) {
            int var2 = this.field1924[var1];
            this.field1924[var1] = this.field1918[var1];
            this.field1918[var1] = -var2;
        }
        this.method765();
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([[IIIIZI)Llb;")
    public final class101 method771(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method760();
        int var7 = this.field1940 + arg1;
        int var8 = this.field1930 + arg1;
        int var9 = this.field1914 + arg3;
        int var10 = this.field1945 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class101 var15;
                if (arg4) {
                    var15 = new class101();
                    var15.field1928 = this.field1928;
                    var15.field1920 = this.field1920;
                    var15.field1933 = this.field1933;
                    var15.field1924 = this.field1924;
                    var15.field1918 = this.field1918;
                    var15.field1929 = this.field1929;
                    var15.field1943 = this.field1943;
                    var15.field1946 = this.field1946;
                    var15.field1922 = this.field1922;
                    var15.field1942 = this.field1942;
                    var15.field1927 = this.field1927;
                    var15.field1950 = this.field1950;
                    var15.field1956 = this.field1956;
                    var15.field1926 = this.field1926;
                    var15.field1931 = this.field1931;
                    var15.field1948 = this.field1948;
                    var15.field1959 = this.field1959;
                    var15.field1947 = this.field1947;
                    var15.field1954 = this.field1954;
                    var15.field1912 = this.field1912;
                    var15.field1951 = this.field1951;
                    var15.field1949 = this.field1949;
                    var15.field1921 = this.field1921;
                    var15.field1919 = this.field1919;
                    var15.field1923 = this.field1923;
                    var15.field1939 = this.field1939;
                    var15.field1915 = this.field1915;
                    var15.field1941 = this.field1941;
                    var15.field1953 = this.field1953;
                    var15.field1936 = this.field1936;
                    var15.field1932 = this.field1932;
                    var15.field1958 = this.field1958;
                    var15.field1935 = this.field1935;
                    var15.field1952 = new int[var15.field1928];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field1928; ++var16) {
                        int var17 = this.field1924[var16] + arg1;
                        int var18 = this.field1918[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field1952[var16] = this.field1952[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field1928; ++var26) {
                        int var27 = (this.field1952[var26] << 16) / super.field756;
                        if (var27 < arg5) {
                            int var28 = this.field1924[var26] + arg1;
                            int var29 = this.field1918[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field1952[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1952[var26];
                        } else {
                            var15.field1952[var26] = this.field1952[var26];
                        }
                    }
                }
                var15.method765();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    private class101() {
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([B)V")
    private class101(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method758(arg0);
        } else {
            this.method753(arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "([Llb;I)V")
    public class101(class101[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field1928 = 0;
        this.field1920 = 0;
        this.field1933 = 0;
        this.field1931 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class101 var15 = arg0[var9];
            if (var15 != null) {
                this.field1928 += var15.field1928;
                this.field1920 += var15.field1920;
                this.field1933 += var15.field1933;
                if (var15.field1942 != null) {
                    var4 = true;
                } else {
                    if (this.field1931 == -1) {
                        this.field1931 = var15.field1931;
                    }
                    if (this.field1931 != var15.field1931) {
                        var4 = true;
                    }
                }
                var3 |= var15.field1922 != null;
                var5 |= var15.field1927 != null;
                var6 |= var15.field1953 != null;
                var7 |= var15.field1926 != null;
                var8 |= var15.field1950 != null;
            }
        }
        this.field1924 = new int[this.field1928];
        this.field1952 = new int[this.field1928];
        this.field1918 = new int[this.field1928];
        this.field1941 = new int[this.field1928];
        this.field1929 = new int[this.field1920];
        this.field1943 = new int[this.field1920];
        this.field1946 = new int[this.field1920];
        if (var3) {
            this.field1922 = new byte[this.field1920];
        }
        if (var4) {
            this.field1942 = new byte[this.field1920];
        }
        if (var5) {
            this.field1927 = new byte[this.field1920];
        }
        if (var6) {
            this.field1953 = new int[this.field1920];
        }
        if (var7) {
            this.field1926 = new short[this.field1920];
        }
        if (var8) {
            this.field1950 = new byte[this.field1920];
        }
        this.field1956 = new short[this.field1920];
        if (this.field1933 > 0) {
            this.field1948 = new byte[this.field1933];
            this.field1959 = new short[this.field1933];
            this.field1947 = new short[this.field1933];
            this.field1954 = new short[this.field1933];
            this.field1912 = new short[this.field1933];
            this.field1951 = new short[this.field1933];
            this.field1949 = new short[this.field1933];
            this.field1921 = new byte[this.field1933];
            this.field1919 = new byte[this.field1933];
            this.field1923 = new byte[this.field1933];
            this.field1939 = new byte[this.field1933];
            this.field1915 = new byte[this.field1933];
        }
        this.field1928 = 0;
        this.field1920 = 0;
        this.field1933 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class101 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field1920; ++var12) {
                    if (var3 && var11.field1922 != null) {
                        this.field1922[this.field1920] = var11.field1922[var12];
                    }
                    if (var4) {
                        if (var11.field1942 != null) {
                            this.field1942[this.field1920] = var11.field1942[var12];
                        } else {
                            this.field1942[this.field1920] = var11.field1931;
                        }
                    }
                    if (var5 && var11.field1927 != null) {
                        this.field1927[this.field1920] = var11.field1927[var12];
                    }
                    if (var6 && var11.field1953 != null) {
                        this.field1953[this.field1920] = var11.field1953[var12];
                    }
                    if (var7) {
                        if (var11.field1926 != null) {
                            this.field1926[this.field1920] = var11.field1926[var12];
                        } else {
                            this.field1926[this.field1920] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field1950 != null && var11.field1950[var12] != -1) {
                            this.field1950[this.field1920] = (byte) (var11.field1950[var12] + this.field1933);
                        } else {
                            this.field1950[this.field1920] = -1;
                        }
                    }
                    this.field1956[this.field1920] = var11.field1956[var12];
                    this.field1929[this.field1920] = this.method769(var11, var11.field1929[var12]);
                    this.field1943[this.field1920] = this.method769(var11, var11.field1943[var12]);
                    this.field1946[this.field1920] = this.method769(var11, var11.field1946[var12]);
                    ++this.field1920;
                }
                for (int var13 = 0; var13 < var11.field1933; ++var13) {
                    byte var14 = this.field1948[this.field1933] = var11.field1948[var13];
                    if (var14 == 0) {
                        this.field1959[this.field1933] = (short) this.method769(var11, var11.field1959[var13]);
                        this.field1947[this.field1933] = (short) this.method769(var11, var11.field1947[var13]);
                        this.field1954[this.field1933] = (short) this.method769(var11, var11.field1954[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field1959[this.field1933] = var11.field1959[var13];
                        this.field1947[this.field1933] = var11.field1947[var13];
                        this.field1954[this.field1933] = var11.field1954[var13];
                        this.field1912[this.field1933] = var11.field1912[var13];
                        this.field1951[this.field1933] = var11.field1951[var13];
                        this.field1949[this.field1933] = var11.field1949[var13];
                        this.field1921[this.field1933] = var11.field1921[var13];
                        this.field1919[this.field1933] = var11.field1919[var13];
                        this.field1923[this.field1933] = var11.field1923[var13];
                    }
                    if (var14 == 2) {
                        this.field1939[this.field1933] = var11.field1939[var13];
                        this.field1915[this.field1933] = var11.field1915[var13];
                    }
                    ++this.field1933;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Llb;ZZZZ)V")
    public class101(class101 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field1928 = arg0.field1928;
        this.field1920 = arg0.field1920;
        this.field1933 = arg0.field1933;
        if (arg1) {
            this.field1924 = arg0.field1924;
            this.field1952 = arg0.field1952;
            this.field1918 = arg0.field1918;
        } else {
            this.field1924 = new int[this.field1928];
            this.field1952 = new int[this.field1928];
            this.field1918 = new int[this.field1928];
            for (int var6 = 0; var6 < this.field1928; ++var6) {
                this.field1924[var6] = arg0.field1924[var6];
                this.field1952[var6] = arg0.field1952[var6];
                this.field1918[var6] = arg0.field1918[var6];
            }
        }
        if (arg2) {
            this.field1956 = arg0.field1956;
        } else {
            this.field1956 = new short[this.field1920];
            for (int var7 = 0; var7 < this.field1920; ++var7) {
                this.field1956[var7] = arg0.field1956[var7];
            }
        }
        if (!arg3 && arg0.field1926 != null) {
            this.field1926 = new short[this.field1920];
            for (int var8 = 0; var8 < this.field1920; ++var8) {
                this.field1926[var8] = arg0.field1926[var8];
            }
        } else {
            this.field1926 = arg0.field1926;
        }
        if (arg4) {
            this.field1927 = arg0.field1927;
        } else {
            this.field1927 = new byte[this.field1920];
            if (arg0.field1927 == null) {
                for (int var9 = 0; var9 < this.field1920; ++var9) {
                    this.field1927[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field1920; ++var10) {
                    this.field1927[var10] = arg0.field1927[var10];
                }
            }
        }
        this.field1929 = arg0.field1929;
        this.field1943 = arg0.field1943;
        this.field1946 = arg0.field1946;
        this.field1922 = arg0.field1922;
        this.field1942 = arg0.field1942;
        this.field1950 = arg0.field1950;
        this.field1931 = arg0.field1931;
        this.field1948 = arg0.field1948;
        this.field1959 = arg0.field1959;
        this.field1947 = arg0.field1947;
        this.field1954 = arg0.field1954;
        this.field1912 = arg0.field1912;
        this.field1951 = arg0.field1951;
        this.field1949 = arg0.field1949;
        this.field1921 = arg0.field1921;
        this.field1919 = arg0.field1919;
        this.field1923 = arg0.field1923;
        this.field1939 = arg0.field1939;
        this.field1915 = arg0.field1915;
        this.field1941 = arg0.field1941;
        this.field1953 = arg0.field1953;
        this.field1936 = arg0.field1936;
        this.field1932 = arg0.field1932;
        this.field1937 = arg0.field1937;
        this.field1955 = arg0.field1955;
        this.field1913 = arg0.field1913;
        this.field1958 = arg0.field1958;
        this.field1935 = arg0.field1935;
    }
}
