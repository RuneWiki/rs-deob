import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class102 extends class1 {

    @OriginalMember(owner = "client!qb", name = "lc", descriptor = "[I")
    public static int[] field1900 = new int[100];

    @OriginalMember(owner = "client!qb", name = "kc", descriptor = "Z")
    public static boolean field1899 = false;

    @OriginalMember(owner = "client!qb", name = "tc", descriptor = "Z")
    public static boolean field1908 = false;

    @OriginalMember(owner = "client!qb", name = "xc", descriptor = "Lud;")
    private static class279 field1912 = class130.method1024("You can(Wt add yourself to your own friend list)3", 255);

    @OriginalMember(owner = "client!qb", name = "pc", descriptor = "Lud;")
    public static class279 field1904 = field1912;

    @OriginalMember(owner = "client!qb", name = "rc", descriptor = "I")
    public static int field1906 = 0;

    @OriginalMember(owner = "client!qb", name = "Fc", descriptor = "J")
    public static long field1920 = 0L;

    @OriginalMember(owner = "client!qb", name = "Cc", descriptor = "Lud;")
    public static class279 field1917 = class130.method1024("<br>", 255);

    @OriginalMember(owner = "client!qb", name = "zc", descriptor = "Lud;")
    private static class279 field1914 = class130.method1024("Loaded config", 255);

    @OriginalMember(owner = "client!qb", name = "yc", descriptor = "Lud;")
    public static class279 field1913 = field1914;

    @OriginalMember(owner = "client!qb", name = "uc", descriptor = "Lud;")
    public static class279 field1909 = class130.method1024(")1a2)1m", 255);

    @OriginalMember(owner = "client!qb", name = "Kc", descriptor = "Lud;")
    private static class279 field1925 = class130.method1024("Drop", 255);

    @OriginalMember(owner = "client!qb", name = "sc", descriptor = "Lud;")
    public static class279 field1907 = field1925;

    @OriginalMember(owner = "client!qb", name = "mc", descriptor = "B")
    public static byte field1901;

    @OriginalMember(owner = "client!qb", name = "jc", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!qb", name = "nc", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!qb", name = "oc", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!qb", name = "qc", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!qb", name = "vc", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!qb", name = "Ac", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!qb", name = "Bc", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!qb", name = "Dc", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!qb", name = "Ec", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!qb", name = "Hc", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!qb", name = "Jc", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!qb", name = "Lc", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!qb", name = "Gc", descriptor = "Lai;")
    public class125 field1921;

    @OriginalMember(owner = "client!qb", name = "Ic", descriptor = "[I")
    public static int[] field1923;

    @OriginalMember(owner = "client!qb", name = "wc", descriptor = "[[I")
    public static int[][] field1911;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIJILlb;)V", line = 4)
    public final void method186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class208 arg10) {
        field1905++;
        if (this.field1921 == null) {
            return;
        }
        class182 var13 = this.field30 != -1 && this.field27 == 0 ? class131.method1033((byte) -82, this.field30) : null;
        class182 var14 = this.field25 == -1 || this.field25 == this.method15(105).field765 && var13 != null ? null : class131.method1033((byte) -82, this.field25);
        class19 var15 = this.field1921.method994(this.field101, this.field14, var13, this.field9, this.field87, (byte) 80, this.field66, this.field29, this.field18, var14);
        if (var15 == null) {
            return;
        }
        this.field52 = var15.method184();
        class125 var16 = this.field1921;
        if (var16.field2321 != null) {
            var16 = var16.method999(13102);
        }
        if (class220.field3883 && var16.field2293) {
            class19 var17 = class209.method1535(this.field1921.field2300, this.field79, this.field86, this.field1921.field2304, this.field20, this.field1921.field2270, var14 == null ? var13 : var14, arg0, var14 == null ? this.field18 : this.field14, (byte) -121, this.field1921.field2291, this.field1921.field2266, this.field70, var15);
            if (class97.field1824) {
                float var18 = class97.method834();
                float var19 = class97.method830();
                class97.method831();
                class97.method827(var18, var19 - 150.0F);
                var17.method186(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field60);
                class97.method824();
                class97.method827(var18, var19);
            } else {
                var17.method186(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field60);
            }
        }
        this.method5((byte) -36, var15);
        class19 var20 = null;
        this.method14(arg0, var15, 0);
        if (this.field81 != -1 && this.field5 != -1) {
            class213 var21 = class103.method874(this.field81, -601);
            var20 = var21.method1566(this.field5, false, this.field102, this.field2);
            if (var20 != null) {
                var20.method170(0, -this.field7, 0);
                if (var21.field3746) {
                    if (class130.field2366 != 0) {
                        var20.method181(class130.field2366);
                    }
                    if (class278.field4913 != 0) {
                        var20.method166(class278.field4913);
                    }
                    if (class29.field682 != 0) {
                        var20.method170(0, class29.field682, 0);
                    }
                }
            }
        }
        if (!class97.field1824) {
            if (var20 != null) {
                var15 = ((class242) var15).method1728(var20);
            }
            if (this.field1921.field2266 == 1) {
                var15.field566 = true;
            }
            var15.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field60);
            return;
        }
        if (this.field1921.field2266 == 1) {
            var15.field566 = true;
        }
        var15.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field60);
        if (var20 != null) {
            if (this.field1921.field2266 == 1) {
                var20.field566 = true;
            }
            var20.method186(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field60);
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(III)J", line = 122)
    public static final long method861(int arg0, int arg1, int arg2) {
        class191 var3 = class24.field619[arg0][arg1][arg2];
        return var3 == null || var3.field3439 == null ? 0L : var3.field3439.field530;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLai;)V", line = 136)
    public final void method862(byte arg0, class125 arg1) {
        if (arg0 != 72) {
            return;
        }
        field1919++;
        this.field1921 = arg1;
        if (this.field60 != null) {
            this.field60.method1531();
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)I", line = 156)
    public final int method7(boolean arg0) {
        if (!arg0) {
            return 50;
        }
        field1915++;
        if (class214.field3764 != 0 && this.field1921.field2321 != null) {
            class125 var2 = this.field1921.method999(13102);
            if (var2 != null && var2.field2294 != -1) {
                return var2.field2294;
            }
        }
        return this.field23;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Z", line = 184)
    public final boolean method2(int arg0) {
        field1916++;
        if (this.field1921 == null) {
            return false;
        } else {
            return arg0 == 27121;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V", line = 199)
    public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1918++;
        if (this.field1921 == null) {
            ;
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()I", line = 213)
    public final int method184() {
        field1903++;
        return this.field52;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILok;BI)[Lom;", line = 226)
    private static final class70[] method863(int arg0, class149 arg1, byte arg2, int arg3) {
        field1924++;
        if (arg2 >= -10) {
            method861(-64, 55, -60);
        }
        return class137.method1066(arg3, 25486, arg1, arg0) ? class54.method510(255) : null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 247)
    public static final void method864(int arg0, int arg1) {
        class297.method2100(28);
        class149.method1191((byte) -51);
        int var2 = class48.method393(arg0, 93).field1257;
        field1902++;
        if (var2 == 0) {
            return;
        }
        int var3 = class326.field5679[arg0];
        int var4 = -43 / ((-arg1 - 18) / 55);
        if (var2 == 9) {
            class150.field2747 = var3;
        }
        if (var2 == 6) {
            class233.field4079 = var3;
        }
        if (var2 == 5) {
            class181.field3314 = var3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLok;)V", line = 277)
    public static final void method865(byte arg0, class149 arg1) {
        class112.field2069 = class126.method1008((byte) -87, class3.field106, 0, arg1);
        field1926++;
        class59.field1244 = class149.method1166(false, arg1, class268.field4803, 0);
        class103.field1940 = class149.method1166(false, arg1, class183.field3361, 0);
        class310.field5496 = class149.method1166(false, arg1, class142.field2579, 0);
        class120.field2156 = class149.method1166(false, arg1, class63.field1302, 0);
        class199.field3557 = class149.method1166(false, arg1, class18.field552, 0);
        class16.field512 = class149.method1166(false, arg1, class301.field5363, 0);
        class257.field4561 = class38.method344(arg1, class86.field1659, false, 0);
        class139.field2532 = method863(class195.field3525, arg1, (byte) -84, 0);
        class287.field5128 = method863(class238.field4168, arg1, (byte) -105, 0);
        class111.field2049 = class302.method2142(arg1, 10113, 0, class180.field3256);
        class198.field3540 = class302.method2142(arg1, arg0 + 10229, 0, class170.field3065);
        class109.field2015.method406(class198.field3540, (int[]) null);
        class133.field2428.method406(class198.field3540, (int[]) null);
        class292.field5210.method406(class198.field3540, (int[]) null);
        if (arg0 != -116) {
            method863(30, (class149) null, (byte) -75, -101);
        }
        if (class97.field1824) {
            class160.field2905 = class85.method732(class15.field493, arg0 + 235, arg1, 0);
            for (int var2 = 0; var2 < class160.field2905.length; var2++) {
                class160.field2905[var2].method1246();
            }
        }
        class66 var3 = class67.method595(0, class87.field1675, arg0 ^ 0x2089, arg1);
        var3.method572();
        if (class97.field1824) {
            class153.field2781 = new class203(var3);
        } else {
            class153.field2781 = var3;
        }
        class66[] var4 = class126.method1008((byte) -102, class320.field5591, 0, arg1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method572();
        }
        if (class97.field1824) {
            class122.field2193 = new class70[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class122.field2193[var6] = new class203(var4[var6]);
            }
        } else {
            class122.field2193 = var4;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        for (int var11 = 0; var11 < class112.field2069.length; var11++) {
            class112.field2069[var11].method568(var7 + var9, var8 + var9, var9 + var10);
        }
        if (class97.field1824) {
            class195.field3511 = new class70[class112.field2069.length];
            for (int var12 = 0; var12 < class112.field2069.length; var12++) {
                class195.field3511[var12] = new class203(class112.field2069[var12]);
            }
        } else {
            class195.field3511 = class112.field2069;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V", line = 385)
    public static void method866(int arg0) {
        if (arg0 != 0) {
            field1911 = (int[][]) ((int[][]) null);
        }
        field1912 = null;
        field1913 = null;
        field1904 = null;
        field1911 = (int[][]) null;
        field1923 = null;
        field1907 = null;
        field1925 = null;
        field1909 = null;
        field1900 = null;
        field1917 = null;
        field1914 = null;
    }

    @OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V", line = 423)
    protected final void finalize() {
        field1922++;
    }
}
