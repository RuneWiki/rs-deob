import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class138 {

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Z")
    private boolean field1888 = false;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    private int field1908 = 32;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "J")
    private long field1891 = class299.method2006(9594);

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "J")
    private long field1913 = 0L;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "[Lrg;")
    private class273[] field1918 = new class273[8];

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    private int field1915 = 0;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    private int field1919 = 0;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    private int field1914 = 0;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    private int field1920 = 0;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "J")
    private long field1922 = 0L;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "Z")
    private boolean field1923 = true;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "[Lrg;")
    private class273[] field1917 = new class273[8];

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field1890 = 0;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1892 = -1;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field1909 = -1;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[Lel;")
    public static class82[] field1902 = new class82[14];

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public int field1921;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Lrg;")
    private class273 field1893;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lre;")
    public static class282 field1903;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "[I")
    public int[] field1911;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method865(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1898++;
        int var8 = arg1 + arg4;
        int var9 = arg4 + arg6;
        int var10 = arg3 - arg4;
        int var11 = arg2 - arg4;
        int var12 = 71 % ((arg5 + 18) / 62);
        for (int var13 = arg1; var13 < var8; var13++) {
            class129.method822(class247.field3876[var13], arg6, -2426, arg7, arg2);
        }
        for (int var14 = arg3; var14 > var10; var14--) {
            class129.method822(class247.field3876[var14], arg6, -2426, arg7, arg2);
        }
        for (int var15 = var8; var15 <= var10; var15++) {
            int[] var16 = class247.field3876[var15];
            class129.method822(var16, arg6, -2426, arg7, var9);
            class129.method822(var16, var9, -2426, arg0, var11);
            class129.method822(var16, var11, -2426, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZLnh;Ljava/lang/String;)Lcc;")
    public static final class208 method866(int arg0, boolean arg1, class305 arg2, String arg3) {
        int var4 = arg2.method2081(-126, arg3);
        field1886++;
        if (var4 == -1) {
            return new class208(0);
        }
        if (arg0 > -101) {
            field1890 = -47;
        }
        int[] var5 = arg2.method2071(4846, var4);
        class208 var6 = new class208(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field3098) {
                class215 var9 = new class215(arg2.method2050(71, var4, var5[var8++]));
                int var10 = var9.method1383((byte) -72);
                int var11 = var9.method1379(-100);
                int var12 = var9.method1374((byte) -60);
                if (!arg1 && var12 == 1) {
                    var6.field3098--;
                } else {
                    var6.field3088[var7] = var10;
                    var6.field3089[var7] = new class238();
                    var6.field3089[var7].field3688 = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public final synchronized void method867(int arg0) {
        if (class145.field2007 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class145.field2007.field511[var3] == this) {
                    class145.field2007.field511[var3] = null;
                }
                if (class145.field2007.field511[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class145.field2007.field515 = true;
                while (class145.field2007.field517) {
                    class17.method116(-54, 50L);
                }
                class145.field2007 = null;
            }
        }
        field1889++;
        if (arg0 > -52) {
            method866(122, false, (class305) null, (String) null);
        }
        this.method880();
        this.field1888 = true;
        this.field1911 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method868(Component arg0) throws Exception {
        field1899++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()I")
    public int method869() throws Exception {
        field1894++;
        return this.field1921;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)[Ljc;")
    public static final class284[] method870(int arg0) {
        field1883++;
        class284[] var1 = new class284[class56.field784];
        if (arg0 != -10633) {
            method865(47, 69, -89, 29, 22, (byte) 52, 65, -43);
        }
        for (int var2 = 0; var2 < class56.field784; var2++) {
            var1[var2] = new class74(class242.field3805, class70.field1021, class275.field4376[var2], class96.field1381[var2], class137.field1869[var2], class112.field1613[var2], class134.field1847[var2], class298.field4748);
        }
        class282.method1840(true);
        return var1;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public final synchronized void method871(int arg0) {
        field1887++;
        if (this.field1888) {
            return;
        }
        long var2 = class299.method2006(arg0 ^ 0x5AFC);
        try {
            if (arg0 != 32646) {
                return;
            }
            if ((this.field1891 + 500000L) < var2) {
                this.field1891 = var2 - 500000L;
            }
            while (var2 > (this.field1891 + 5000L)) {
                this.method876(-100, 256);
                this.field1891 += (long) (256000 / class175.field2476);
            }
        } catch (Exception var7) {
            this.field1891 = var2;
        }
        if (this.field1911 == null) {
            return;
        }
        try {
            if (this.field1913 != 0L) {
                if (var2 < this.field1913) {
                    return;
                }
                this.method885(this.field1921);
                this.field1913 = 0L;
                this.field1923 = true;
            }
            int var4 = this.method869();
            if (this.field1920 < this.field1919 - var4) {
                this.field1920 = this.field1919 - var4;
            }
            int var5 = this.field1916 + this.field1912;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field1921) {
                this.field1921 += 1024;
                var4 = 0;
                if (this.field1921 > 16384) {
                    this.field1921 = 16384;
                }
                this.method880();
                this.method885(this.field1921);
                if (this.field1921 < var5 + 256) {
                    var5 = this.field1921 - 256;
                    this.field1912 = var5 - this.field1916;
                }
                this.field1923 = true;
            }
            while (var5 > var4) {
                var4 += 256;
                this.method879(this.field1911, 256);
                this.method884();
            }
            if (var2 > this.field1922) {
                if (this.field1923) {
                    this.field1923 = false;
                } else if (this.field1920 == 0 && this.field1915 == 0) {
                    this.method880();
                    this.field1913 = var2 + 2000L;
                    return;
                } else {
                    this.field1912 = Math.min(this.field1915, this.field1920);
                    this.field1915 = this.field1920;
                }
                this.field1922 = var2 + 2000L;
                this.field1920 = 0;
            }
            this.field1919 = var4;
        } catch (Exception var6) {
            this.method880();
            this.field1913 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZI)Z")
    public static final boolean method872(int arg0, boolean arg1, int arg2) {
        field1897++;
        if (!class171.field2447) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class262.field4214[var3] == null || class262.field4214[var3][var4] == null) {
            return false;
        }
        class178 var5 = class262.field4214[var3][var4];
        if (!arg1) {
            field1892 = -123;
        }
        if (arg2 == -1 && var5.field2608 == 0) {
            for (int var6 = 0; var6 < class179.field2721; var6++) {
                if (class151.field2101[var6] == 3 || class151.field2101[var6] == 1009 || class151.field2101[var6] == 6 || class151.field2101[var6] == 45 || class151.field2101[var6] == 42) {
                    for (class178 var7 = class166.method1057(85, class250.field3910[var6]); var7 != null; var7 = class81.method516(var7, 1910073168)) {
                        if (var5.field2545 == var7.field2545) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class179.field2721; var8++) {
                if (class228.field3567[var8] == arg2 && class250.field3910[var8] == var5.field2545 && (class151.field2101[var8] == 3 || class151.field2101[var8] == 1009 || class151.field2101[var8] == 6 || class151.field2101[var8] == 45 || class151.field2101[var8] == 42)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()V")
    public void method873() throws Exception {
        field1896++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public final synchronized void method874(boolean arg0) {
        this.field1923 = true;
        field1882++;
        try {
            if (arg0) {
                this.field1915 = -33;
            }
            this.method873();
        } catch (Exception var2) {
            this.method880();
            this.field1913 = class299.method2006(9594) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public static void method875(int arg0) {
        if (arg0 < -34) {
            field1902 = null;
            field1903 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
    private final void method876(int arg0, int arg1) {
        field1910++;
        this.field1914 -= arg1;
        if (this.field1914 < 0) {
            this.field1914 = 0;
        }
        if (this.field1893 != null) {
            this.field1893.method918(arg1);
        }
        if (arg0 >= -7) {
            this.method878((class273) null, 72, 86);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLrg;)V")
    public final synchronized void method877(byte arg0, class273 arg1) {
        this.field1893 = arg1;
        field1895++;
        if (arg0 != 39) {
            method866(-123, false, (class305) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lrg;II)V")
    private final void method878(class273 arg0, int arg1, int arg2) {
        if (arg2 != 2104033285) {
            field1902 = null;
        }
        field1906++;
        int var4 = arg1 >> 5;
        class273 var5 = this.field1918[var4];
        if (var5 == null) {
            this.field1917[var4] = arg0;
        } else {
            var5.field4349 = arg0;
        }
        this.field1918[var4] = arg0;
        arg0.field4350 = arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([II)V")
    private final void method879(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class53.field760) {
            var3 = arg1 << 1;
        }
        class285.method1881(arg0, 0, var3);
        this.field1914 -= arg1;
        if (this.field1893 != null && this.field1914 <= 0) {
            this.field1914 += class175.field2476 >> 4;
            class209.method1303(this.field1893, 0);
            this.method878(this.field1893, this.field1893.method1778(), 2104033285);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class273 var10 = null;
                        class273 var11 = this.field1917[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class46 var12 = var11.field4351;
                                if (var12 == null || var12.field673 <= var8) {
                                    var11.field4348 = true;
                                    int var13 = var11.method911();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field673 += var13;
                                    }
                                    if (var4 >= this.field1908) {
                                        break label107;
                                    }
                                    class273 var14 = var11.method912();
                                    if (var14 != null) {
                                        int var15 = var11.field4350;
                                        while (var14 != null) {
                                            this.method878(var14, var15 * var14.method1778() >> 8, 2104033285);
                                            var14 = var11.method917();
                                        }
                                    }
                                    class273 var16 = var11.field4349;
                                    var11.field4349 = null;
                                    if (var10 == null) {
                                        this.field1917[var7] = var16;
                                    } else {
                                        var10.field4349 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1918[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4349;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class273 var18 = this.field1917[var17];
                this.field1917[var17] = this.field1918[var17] = null;
                while (var18 != null) {
                    class273 var19 = var18.field4349;
                    var18.field4349 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1914 < 0) {
            this.field1914 = 0;
        }
        if (this.field1893 != null) {
            this.field1893.method914(arg0, 0, arg1);
        }
        this.field1891 = class299.method2006(9594);
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
    public void method880() {
        field1881++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;C)I")
    public static final int method881(int arg0, String arg1, char arg2) {
        if (arg0 != 20978) {
            return -111;
        }
        int var3 = arg1.length();
        field1901++;
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            if (arg2 == arg1.charAt(var5)) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method882(int arg0, int arg1, byte[] arg2, int arg3) {
        field1884++;
        if (arg1 > -112) {
            field1890 = 95;
        }
        boolean var4 = true;
        class215 var5 = new class215(arg2);
        int var6 = -1;
        label72: while (true) {
            int var7 = var5.method1360((byte) -111);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var13;
                class240 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method1347(true);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var5.method1374((byte) -60);
                                    }
                                    int var10 = var5.method1347(true);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = var5.method1374((byte) -60) >> 2;
                                    var14 = var12 + arg3;
                                    var15 = arg0 + var11;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class265.method1717(89, var6);
                } while (var13 == 22 && !class38.field583 && var16.field3736 == 0 && var16.field3779 != 1 && !var16.field3732);
                var9 = true;
                if (!var16.method1577(0)) {
                    var4 = false;
                    class39.field586++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lqj;")
    public static final class248 method883(byte arg0) {
        class261.field4208 = 0;
        field1905++;
        if (arg0 >= -42) {
            method875(-55);
        }
        return class65.method400(-100);
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()V")
    public void method884() throws Exception {
        field1904++;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)V")
    public void method885(int arg0) throws Exception {
        field1900++;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
    public final void method886(int arg0) {
        this.field1923 = true;
        if (arg0 != 500000) {
            field1902 = null;
        }
        field1907++;
    }
}
