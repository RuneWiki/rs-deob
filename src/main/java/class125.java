import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class125 extends class276 {

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "Z")
    private boolean field1919 = false;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    private int field1928 = -1;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    private int field1939 = -1;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    private int field1945 = -32768;

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "Lti;")
    private class5 field1927 = null;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "Z")
    private boolean field1947 = false;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    private int field1934;

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
    private int field1915;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    private int field1930;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    private int field1936;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    private int field1940;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    private int field1922;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    private int field1944;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Ldj;")
    private class200 field1914;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    private int field1941;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field1920 = 20;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "Lgd;")
    private class77 field1932;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method828(int arg0, int arg1) {
        field1921++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg0 != 1) {
            field1920 = 66;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class37.field481 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class311.field5027 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Ljk;")
    public final class276 method829(byte arg0) {
        if (arg0 != -124) {
            this.method837(70, false);
        }
        field1933++;
        return this.method834(-39, false);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIII)V")
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method831(-3, arg3, arg4);
        field1935++;
        class276 var6 = null;
        if (!this.field1947) {
            if (var6 == null) {
                var6 = this.method829((byte) -124);
            }
            if (var6 == null) {
                return;
            }
            this.method832(var6, (byte) -76);
        }
        if (this.field1932 != null) {
            this.field1932.method516(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLpd;)V")
    public static final void method830(byte arg0, class58 arg1) {
        field1946++;
        if (arg0 >= -41) {
            return;
        }
        int var2 = arg1.field812 - class4.field32;
        int var3 = arg1.field806 * 128 + arg1.method362(25892) * 64;
        int var4 = arg1.field865 * 128 + arg1.method362(25892) * 64;
        arg1.field836 += (var3 - arg1.field836) / var2;
        if (arg1.field861 == 0) {
            arg1.field802 = 1024;
        }
        if (arg1.field861 == 1) {
            arg1.field802 = 1536;
        }
        arg1.field850 += (var4 - arg1.field850) / var2;
        if (arg1.field861 == 2) {
            arg1.field802 = 0;
        }
        arg1.field878 = 0;
        if (arg1.field861 == 3) {
            arg1.field802 = 512;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(III)V")
    private final void method831(int arg0, int arg1, int arg2) {
        if (arg0 != -3) {
            return;
        }
        field1937++;
        label92: while (true) {
            if (this.field1914 == null) {
                if (this.field1919) {
                    return;
                }
                this.method837(-1, true);
                if (this.field1914 == null) {
                    return;
                }
            }
            int var4 = class4.field32 - this.field1944;
            if (var4 > 100 && this.field1914.field3191 > 0) {
                int var5 = this.field1914.field3167.length - this.field1914.field3191;
                while (this.field1922 < var5 && this.field1914.field3168[this.field1922] < var4) {
                    var4 -= this.field1914.field3168[this.field1922];
                    this.field1922++;
                }
                if (this.field1922 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1914.field3167.length; var7++) {
                        var6 += this.field1914.field3168[var7];
                    }
                    var4 %= var6;
                }
                this.field1941 = this.field1922 + 1;
                if (this.field1914.field3167.length <= this.field1941) {
                    this.field1941 -= this.field1914.field3191;
                    if (this.field1941 < 0 || this.field1941 >= this.field1914.field3167.length) {
                        this.field1941 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field1914.field3168[this.field1922] >= var4) {
                            this.field1944 = class4.field32 - var4;
                            this.field1926 = var4;
                            return;
                        }
                        class49.method303(false, false, arg1, this.field1922, this.field1914, arg2);
                        var4 -= this.field1914.field3168[this.field1922];
                        this.field1922++;
                        if (this.field1914.field3167.length <= this.field1922) {
                            this.field1922 -= this.field1914.field3191;
                            if (this.field1922 < 0 || this.field1922 >= this.field1914.field3167.length) {
                                this.field1914 = null;
                                continue label92;
                            }
                        }
                        this.field1941 = this.field1922 + 1;
                    } while (this.field1941 < this.field1914.field3167.length);
                    this.field1941 -= this.field1914.field3191;
                } while (this.field1941 >= 0 && this.field1914.field3167.length > this.field1941);
                this.field1941 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljk;B)V")
    private final void method832(class276 arg0, byte arg1) {
        if (arg1 > -39) {
            this.field1914 = null;
        }
        class191 var3 = (class191) arg0;
        if ((this.field1932 == null || this.field1932.field1207) && (var3.field2976 != null || var3.field2946 != null)) {
            class74 var4 = class216.method1510(0, this.field1931);
            if (var4.field1149 != null) {
                var4 = var4.method488(-93);
            }
            if (var4 != null) {
                this.field1932 = new class77(class4.field32, var4.field1169, var4.field1151);
            }
        }
        if (this.field1932 != null) {
            this.field1932.method519(var3.field2976, var3.field2946, false, var3.field2944, var3.field2965, var3.field2973);
        }
        field1923++;
        this.field1947 = true;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public static final void method833(int arg0) {
        class27.field342.method145(-117);
        field1917++;
        if (arg0 != -1911116255) {
            field1920 = 20;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)Ljk;")
    private final class276 method834(int arg0, boolean arg1) {
        field1918++;
        boolean var3 = class277.field4583 != class242.field3842;
        if (arg0 >= -37) {
            this.method834(71, false);
        }
        class74 var4 = class216.method1510(0, this.field1931);
        if (var4.field1149 != null) {
            var4 = var4.method488(-93);
        }
        if (var4 == null) {
            this.field1928 = -1;
            this.field1939 = this.field1922;
            return null;
        }
        if (!this.field1919 && this.field1928 != var4.field1166) {
            this.method837(-1, true);
        }
        int var5 = this.field1930 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field1151;
            var7 = var4.field1169;
        } else {
            var6 = var4.field1169;
            var7 = var4.field1151;
        }
        int var8 = this.field1934 + (var6 >> 1);
        int var9 = this.field1940 + (var7 >> 1);
        int var10 = this.field1934 + (var6 + 1 >> 1);
        int var11 = (var7 + 1 >> 1) + this.field1940;
        this.method831(-3, var8 * 128, var9 * 128);
        boolean var12 = !var3 && var4.field1174 && (this.field1928 != var4.field1166 || (this.field1939 != this.field1922 || this.field1914 != null && (this.field1914.field3172 || class231.field3698) && this.field1941 != this.field1922) && class163.field2567 >= 2);
        if (arg1 && !var12) {
            this.field1928 = var4.field1166;
            this.field1939 = this.field1922;
            return null;
        }
        int var13 = (this.field1934 << 7) + (var6 << 6);
        int[][] var14 = class242.field3842[this.field1915];
        int var15 = (this.field1940 << 7) + (var7 << 6);
        int var16 = var14[var10][var9] + var14[var10][var11] + var14[var8][var9] + var14[var8][var11] >> 2;
        int[][] var17 = null;
        if (var3) {
            var17 = class277.field4583[0];
        } else if (this.field1915 < 3) {
            var17 = class242.field3842[this.field1915 + 1];
        }
        boolean var18 = this.field1927 == null;
        class2 var19;
        if (this.field1914 == null) {
            var19 = var4.method485(var12, false, this.field1936, var13, 3, var14, var17, this.field1930, var16, var15, var18 ? class193.field3056 : this.field1927);
        } else {
            var19 = var4.method479(var18 ? class193.field3056 : this.field1927, var16, this.field1936, var12, var13, this.field1926, var15, -1853969245, this.field1922, this.field1914, this.field1941, var17, this.field1930, var14);
        }
        if (var19 == null) {
            this.field1939 = this.field1922;
            this.field1928 = var4.field1166;
            return null;
        } else {
            this.field1928 = var4.field1166;
            this.field1939 = this.field1922;
            return var19.field7;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V")
    public static final void method835(int arg0, int arg1) {
        field1943++;
        if (arg0 <= -117) {
            class36 var2 = class161.method1067(3, arg1, (byte) 81);
            var2.method220(121);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)V")
    public static final void method836(int arg0, int arg1) {
        field1925++;
        if (arg1 == -1 || !class235.method1632(arg0 + 118, arg1)) {
            return;
        }
        class254[] var2 = class283.field4741[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class254 var4 = var2[var3];
            if (var4.field4097 != null) {
                class298 var5 = new class298();
                var5.field4906 = var4;
                var5.field4905 = var4.field4097;
                class294.method2054(2000000, var5, -127);
            }
        }
        if (arg0 != -4) {
            field1920 = -25;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "()I")
    public final int method206() {
        field1938++;
        return this.field1945;
    }

    @OriginalMember(owner = "client!cj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1913++;
        if (this.field1932 != null) {
            this.field1932.method511();
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IZ)V")
    private final void method837(int arg0, boolean arg1) {
        field1924++;
        if (!arg1) {
            this.method829((byte) -96);
        }
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class74 var5 = class216.method1510(0, this.field1931);
            class74 var6 = var5;
            if (var5.field1149 != null) {
                var5 = var5.method488(-93);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1111 != null) {
                if (this.field1914 != null && var5.method483(false, this.field1914.field3176)) {
                    return;
                }
                var3 = var5.method490((byte) 56);
                if (this.field1928 != var5.field1166) {
                    var4 = var5.field1106;
                }
            } else if (var5.field1095 == -1) {
                if (var6 != null && var6.field1111 != null) {
                    if (this.field1914 != null && var6.method483(!arg1, this.field1914.field3176)) {
                        return;
                    }
                    var3 = var6.method490((byte) 56);
                    if (this.field1928 != var6.field1166) {
                        var4 = var6.field1106;
                    }
                } else if (var6 != null && var6.field1095 != -1 && this.field1928 != var6.field1166) {
                    var3 = var6.field1095;
                    var4 = var6.field1106;
                }
            } else if (this.field1928 != var5.field1166) {
                var3 = var5.field1095;
                var4 = var5.field1106;
            }
        }
        if (var3 == -1) {
            this.field1914 = null;
            return;
        }
        if (this.field1914 == null || this.field1914.field3176 != var3) {
            this.field1914 = class196.method1359(var3, (byte) 21);
        } else if (this.field1914.field3171 == 0) {
            return;
        }
        if (var4) {
            this.field1922 = (int) ((double) this.field1914.field3167.length * Math.random());
            this.field1926 = (int) ((double) this.field1914.field3168[this.field1922] * Math.random()) + 1;
        } else {
            this.field1926 = 1;
            this.field1922 = 0;
        }
        this.field1941 = this.field1922 + 1;
        if (this.field1941 < 0 || this.field1941 >= this.field1914.field3167.length) {
            this.field1941 = -1;
        }
        this.field1944 = class4.field32 - this.field1926;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIJILgd;)V")
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class77 arg10) {
        field1942++;
        class276 var13 = this.method829((byte) -124);
        if (var13 != null) {
            this.method832(var13, (byte) -112);
            var13.method205(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1932);
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIIIZLjk;)V")
    public class125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class276 arg8) {
        this.field1934 = arg4;
        this.field1915 = arg3;
        this.field1931 = arg0;
        this.field1930 = arg2;
        this.field1936 = arg1;
        this.field1940 = arg5;
        if (arg8 != null) {
            this.field1919 = true;
            if (arg8 instanceof class125) {
                class125 var10 = (class125) arg8;
                this.field1922 = var10.field1922;
                this.field1926 = var10.field1926;
                this.field1944 = var10.field1944;
                this.field1914 = var10.field1914;
                this.field1941 = var10.field1941;
            }
        }
        if (this.field1919) {
            this.method837(arg6, true);
        }
    }
}
