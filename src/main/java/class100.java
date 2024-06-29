import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class100 {

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lqe;")
    public static class179 field1870 = class206.method1380("Lade Titelbild )2 ", (byte) -128);

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Lqe;")
    public static class179 field1871 = class206.method1380(" )2> <col=ff9040>", (byte) -128);

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lqe;")
    public static class179 field1852 = class206.method1380("Anmelde)2Limit -Uberschritten)3", (byte) -127);

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lqe;")
    private static class179 field1862 = class206.method1380("wave2:", (byte) -126);

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lqe;")
    public static class179 field1872 = field1862;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lqe;")
    public static class179 field1850 = field1862;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "Lqe;")
    public static class179 field1878 = class206.method1380("VOLL", (byte) -126);

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "Lqe;")
    public static class179 field1879 = class206.method1380("Ausw-=hlen", (byte) 67);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    private int field1854;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "J")
    private long field1855;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "J")
    public static long field1865;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "J")
    private long field1867;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Leh;")
    public static class52 field1857;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Lae;")
    public static class6 field1868;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Z")
    public boolean field1851;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "[I")
    private int[] field1864;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
    private int[] field1869;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "[Lgg;")
    public static class72[] field1876;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
    public final int method631(int arg0) {
        if (arg0 != 11) {
            this.method634(-42, -20, (byte) -85);
        }
        field1877++;
        return this.field1854 == -1 ? (this.field1869[4] << 20) + (this.field1864[0] << 15) + this.field1864[1] + (this.field1869[0] << 25) + (this.field1864[8] << 10) + (this.field1864[11] << 5) : 305419896 - -class152.method979((byte) 15, this.field1854).field3324;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)I")
    public static final int method632(byte arg0, int arg1, int arg2) {
        if (arg0 < 48) {
            method639(52);
        }
        int var3 = arg2 >>> 31;
        field1866++;
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I[I[IZI)V")
    public final void method633(int arg0, int[] arg1, int[] arg2, boolean arg3, int arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class178.field3238; var7++) {
                    class164 var8 = class34.method222(var7, -73);
                    if (var8 != null && !var8.field2956 && var8.field2955 == (arg3 ? 7 : 0) + var6) {
                        arg1[class50.field1073[var6]] = class125.method790(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        field1860++;
        this.field1864 = arg1;
        this.field1851 = arg3;
        this.field1869 = arg2;
        this.field1854 = arg4;
        int var9 = 115 % ((arg0 + 77) / 37);
        this.method635((byte) -91);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIB)V")
    public final void method634(int arg0, int arg1, byte arg2) {
        field1880++;
        this.field1869[arg1] = arg0;
        int var4 = 56 % ((23 - arg2) / 36);
        this.method635((byte) 83);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    private final void method635(byte arg0) {
        field1856++;
        int var2 = 93 % ((-arg0 - 14) / 55);
        long[] var3 = class151.field2717;
        long var4 = this.field1855;
        this.field1855 = -1L;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1855 = var3[(int) (((long) (this.field1864[var6] >> 24) ^ this.field1855) & 0xFFL)] ^ this.field1855 >>> 8;
            this.field1855 = var3[(int) ((this.field1855 ^ (long) (this.field1864[var6] >> 16)) & 0xFFL)] ^ this.field1855 >>> 8;
            this.field1855 = var3[(int) (((long) (this.field1864[var6] >> 8) ^ this.field1855) & 0xFFL)] ^ this.field1855 >>> 8;
            this.field1855 = var3[(int) (((long) this.field1864[var6] ^ this.field1855) & 0xFFL)] ^ this.field1855 >>> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field1855 = this.field1855 >>> 8 ^ var3[(int) ((this.field1855 ^ (long) this.field1869[var7]) & 0xFFL)];
        }
        this.field1855 = this.field1855 >>> 8 ^ var3[(int) ((this.field1855 ^ (long) (this.field1851 ? 1 : 0)) & 0xFFL)];
        if (var4 != 0L && this.field1855 != var4) {
            class114.field2140.method1336(var4, 6);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Z")
    public static final boolean method636(byte arg0, int arg1) {
        field1875++;
        if (arg0 == 0) {
            return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZ)V")
    public final void method637(byte arg0, boolean arg1) {
        if (arg0 == 31) {
            this.field1851 = arg1;
            this.method635((byte) -76);
            field1853++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILki;)Lgj;")
    public final class75 method638(int arg0, int arg1, class117 arg2) {
        if (arg1 != Integer.MIN_VALUE) {
            this.method631(-93);
        }
        field1863++;
        if (this.field1854 != -1) {
            return class152.method979((byte) 15, this.field1854).method1177(arg0, arg1 ^ 0x80000023, arg2);
        }
        class75 var4 = (class75) class40.field843.method1332(this.field1855, 0);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1864[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class34.method222(var15 & 0x3FFFFFFF, arg1 ^ 0x7FFFFFB4).method1052((byte) 119)) {
                        var5 = true;
                    }
                } else if (!class131.method835((byte) -20, var15 & 0x3FFFFFFF).method108(this.field1851, -8337)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class224[] var7 = new class224[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1864[var9];
                if ((var12 & 0x40000000) != 0) {
                    class224 var13 = class131.method835((byte) -20, var12 & 0x3FFFFFFF).method120((byte) 3, this.field1851);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class224 var14 = class34.method222(var12 & 0x3FFFFFFF, -89).method1050(116);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class224 var10 = new class224(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field1869[var11] < class121.field2264[var11].length) {
                    var10.method1456(class3.field37[var11], class121.field2264[var11][this.field1869[var11]]);
                }
                if (this.field1869[var11] < class3.field36[var11].length) {
                    var10.method1456(class52.field1147[var11], class3.field36[var11][this.field1869[var11]]);
                }
            }
            var4 = var10.method1461(64, 768, -50, -10, -50);
            class40.field843.method1340(this.field1855, false, var4);
        }
        if (arg2 != null) {
            var4 = arg2.method757((byte) -99, arg0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1879 = null;
        field1872 = null;
        field1878 = null;
        field1868 = null;
        field1876 = null;
        field1862 = null;
        if (arg0 != 64) {
            return;
        }
        field1852 = null;
        field1871 = null;
        field1857 = null;
        field1850 = null;
        field1870 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILae;)Lae;")
    public static final class6 method640(int arg0, class6 arg1) {
        int var2 = class95.method618(arg0 ^ 0x6322756E, class159.method1026(arg1, -1493540320));
        field1861++;
        if (var2 == 0) {
            return null;
        }
        int var3 = 0;
        if (arg0 != 255) {
            field1859 = -48;
        }
        while (var3 < var2) {
            arg1 = class87.method580(arg1.field131, 54);
            if (arg1 == null) {
                return null;
            }
            var3++;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method641(int arg0, int arg1, int arg2) {
        int var4 = class50.field1073[arg1];
        field1873++;
        if (this.field1864[var4] == 0 || class34.method222(arg0, -118) == null) {
            return;
        }
        this.field1864[var4] = class125.method790(Integer.MIN_VALUE, arg0);
        if (arg2 != 22558) {
            method640(28, null);
        }
        this.method635((byte) -100);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lki;IBLki;I)Lgj;")
    public final class75 method642(class117 arg0, int arg1, byte arg2, class117 arg3, int arg4) {
        field1858++;
        if (this.field1854 != -1) {
            return class152.method979((byte) 15, this.field1854).method1183(arg1, arg0, arg4, arg3, -9823);
        }
        int[] var6 = this.field1864;
        long var7 = this.field1855;
        if (arg3 != null && (arg3.field2214 >= 0 || arg3.field2204 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field1864[var9];
            }
            if (arg3.field2214 >= 0) {
                if (arg3.field2214 == 65535) {
                    var6[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var6[5] = class125.method790(1073741824, arg3.field2214);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg3.field2204 >= 0) {
                if (arg3.field2204 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var6[3] = 0;
                } else {
                    var6[3] = class125.method790(1073741824, arg3.field2204);
                    var7 ^= var6[3];
                }
            }
        }
        class75 var10 = (class75) class114.field2140.method1332(var7, 0);
        if (arg2 <= 3) {
            this.method635((byte) -121);
        }
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var21) != 0 && !class34.method222(var21 & 0x3FFFFFFF, -124).method1055((byte) -123)) {
                        var11 = true;
                    }
                } else if (!class131.method835((byte) -20, var21 & 0x3FFFFFFF).method110(this.field1851, 20909)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1867 != -1L) {
                    var10 = (class75) class114.field2140.method1332(this.field1867, 0);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class224[] var14 = new class224[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class224 var19 = class131.method835((byte) -20, var18 & 0x3FFFFFFF).method111(-112, this.field1851);
                        if (var19 != null) {
                            var14[var13++] = var19;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class224 var20 = class34.method222(var18 & 0x3FFFFFFF, -109).method1056(-2);
                        if (var20 != null) {
                            var14[var13++] = var20;
                        }
                    }
                }
                class224 var16 = new class224(var14, var13);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field1869[var17] < class121.field2264[var17].length) {
                        var16.method1456(class3.field37[var17], class121.field2264[var17][this.field1869[var17]]);
                    }
                    if (this.field1869[var17] < class3.field36[var17].length) {
                        var16.method1456(class52.field1147[var17], class3.field36[var17][this.field1869[var17]]);
                    }
                }
                var10 = var16.method1461(64, 850, -30, -50, -30);
                class114.field2140.method1340(var7, false, var10);
                this.field1867 = var7;
            }
        }
        if (arg3 == null && arg0 == null) {
            return var10;
        }
        class75 var22;
        if (arg3 != null && arg0 != null) {
            var22 = arg3.method753(arg0, var10, arg1, (byte) 102, arg4);
        } else if (arg3 == null) {
            var22 = arg0.method758(arg4, var10, (byte) -121);
        } else {
            var22 = arg3.method758(arg1, var10, (byte) -121);
        }
        return var22;
    }
}
