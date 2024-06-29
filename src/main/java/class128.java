import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class128 extends class248 {

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    private int field1867 = -32768;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Lci;")
    private class201 field1864 = null;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Z")
    private boolean field1857 = true;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    private int field1854 = 0;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    private int field1871 = -1;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    private int field1868 = 0;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    private int field1872 = 0;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "Z")
    private boolean field1886 = false;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    private int field1878 = -1;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    private int field1863;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "I")
    private int field1885;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    private int field1876;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    private int field1855;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    private int field1858;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "La;")
    private class281 field1882;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    private int field1861;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    private int field1880;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    private int field1853;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    private int field1860;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Lwj;")
    public static class174 field1877 = new class174(0, 0);

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "Ltk;")
    private class151 field1887;

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "Lug;")
    public static class253 field1888;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "[[S")
    public static short[][] field1859;

    @OriginalMember(owner = "client!tf", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() {
        field1869++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I", line = 14)
    public static final int method934(int arg0, int arg1) {
        if (arg0 != 15131) {
            field1888 = (class253) null;
        }
        field1873++;
        return arg1 == 16711935 ? -1 : class194.method1435(-13929, arg1);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V", line = 33)
    public final void method595(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class109.field1458) {
            this.method937((byte) -30, true);
        } else {
            this.method938(124, arg4, arg3);
        }
        field1866++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()I", line = 55)
    public final int method397() {
        field1856++;
        return this.field1867;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)Lig;", line = 64)
    public static final class102 method935(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1775;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 78)
    public static void method936(int arg0) {
        field1877 = null;
        field1859 = (short[][]) null;
        if (arg0 != -5037) {
            method934(-114, -83);
        }
        field1888 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)Lgh;", line = 95)
    private final class248 method937(byte arg0, boolean arg1) {
        boolean var3 = class18.field294 != class172.field2843;
        field1875++;
        class121 var4 = class249.method1790(94, this.field1874);
        int var5 = var4.field1711;
        if (var4.field1690 != null) {
            var4 = var4.method878((byte) 92);
        }
        if (var4 == null) {
            if (class109.field1458 && !var3) {
                this.method941(-1);
            }
            return null;
        }
        if (class27.field409 != 0 && this.field1886 && (this.field1882 == null || this.field1882 != null && this.field1882.field4322 != var4.field1711)) {
            int var6 = var4.field1711;
            if (var4.field1711 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field1882 = null;
            } else {
                this.field1882 = class295.method2064(0, var6);
            }
            if (this.field1882 != null) {
                if (var4.field1727 && this.field1882.field4339 != -1) {
                    this.field1861 = (int) ((double) this.field1882.field4319.length * Math.random());
                    this.field1853 -= (int) ((double) this.field1882.field4328[this.field1861] * Math.random());
                } else {
                    this.field1853 = class229.field3595 - 1;
                    this.field1861 = 0;
                }
            }
        }
        int var7 = this.field1863 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field1734;
            var8 = var4.field1724;
        } else {
            var8 = var4.field1734;
            var9 = var4.field1724;
        }
        int var10 = (var9 >> 1) + this.field1858;
        int var11 = (var9 + 1 >> 1) + this.field1858;
        int var12 = (var8 >> 1) + this.field1876;
        int var13 = (var8 + 1 >> 1) + this.field1876;
        this.method938(126, var12 * 128, var10 * 128);
        boolean var14 = !var3 && var4.field1713 && (this.field1871 != var4.field1705 || (this.field1878 != this.field1861 || this.field1882 != null && (this.field1882.field4326 || class270.field4191) && this.field1880 != this.field1861) && class27.field399 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        if (arg0 != -30) {
            this.field1880 = 23;
        }
        int[][] var15 = class172.field2843[this.field1885];
        int var16 = var15[var10][var12] + var15[var11][var12] + var15[var10][var13] + var15[var11][var13] >> 2;
        int var17 = (this.field1876 << 7) + (var8 << 6);
        int var18 = (this.field1858 << 7) + (var9 << 6);
        int[][] var19 = (int[][]) null;
        if (var3) {
            var19 = class18.field294[0];
        } else if (this.field1885 < 3) {
            var19 = class172.field2843[this.field1885 + 1];
        }
        if (class109.field1458 && var14) {
            class8.method104(this.field1864, this.field1868, this.field1872, this.field1854);
        }
        boolean var20 = this.field1864 == null;
        class120 var21;
        if (this.field1882 == null) {
            var21 = var4.method870(var15, -101, var16, this.field1855, false, var19, var14, var18, this.field1863, var17, var20 ? class265.field4146 : this.field1864);
        } else {
            var21 = var4.method880(var18, this.field1882, var14, 62, var20 ? class265.field4146 : this.field1864, this.field1855, this.field1863, var16, this.field1860, var17, this.field1861, var15, var19, this.field1880);
        }
        if (var21 == null) {
            return null;
        }
        if (class109.field1458 && var14) {
            if (var20) {
                class265.field4146 = var21.field1669;
            }
            int var22 = 0;
            if (this.field1885 != 0) {
                int[][] var23 = class172.field2843[0];
                var22 = var16 - (var23[var10][var12] + var23[var11][var12] + var23[var11][var13] + var23[var10][var13] >> 2);
            }
            class201 var24 = var21.field1669;
            if (this.field1857 && class8.method120(var24, var18, var22, var17)) {
                this.field1857 = false;
            }
            if (!this.field1857) {
                class8.method113(var24, var18, var22, var17);
                if (var20) {
                    class265.field4146 = null;
                }
                this.field1864 = var24;
                this.field1854 = var17;
                this.field1868 = var18;
                this.field1872 = var22;
            }
            this.field1871 = var4.field1705;
            this.field1878 = this.field1861;
        }
        return var21.field1665;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)V", line = 257)
    private final void method938(int arg0, int arg1, int arg2) {
        if (this.field1882 != null) {
            int var4 = class229.field3595 - this.field1853;
            if (var4 > 100 && this.field1882.field4339 > 0) {
                int var5 = this.field1882.field4319.length - this.field1882.field4339;
                while (var5 > this.field1861 && this.field1882.field4328[this.field1861] < var4) {
                    var4 -= this.field1882.field4328[this.field1861];
                    this.field1861++;
                }
                if (this.field1861 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1882.field4319.length; var7++) {
                        var6 += this.field1882.field4328[var7];
                    }
                    var4 %= var6;
                }
                this.field1880 = this.field1861 + 1;
                if (this.field1882.field4319.length <= this.field1880) {
                    this.field1880 -= this.field1882.field4339;
                    if (this.field1880 < 0 || this.field1882.field4319.length <= this.field1880) {
                        this.field1880 = -1;
                    }
                }
            }
            while (var4 > this.field1882.field4328[this.field1861]) {
                class91.method658(this.field1882, true, false, arg2, this.field1861, arg1);
                var4 -= this.field1882.field4328[this.field1861];
                this.field1861++;
                if (this.field1861 >= this.field1882.field4319.length) {
                    this.field1861 -= this.field1882.field4339;
                    if (this.field1861 < 0 || this.field1861 >= this.field1882.field4319.length) {
                        this.field1882 = null;
                        break;
                    }
                }
                this.field1880 = this.field1861 + 1;
                if (this.field1880 >= this.field1882.field4319.length) {
                    this.field1880 -= this.field1882.field4339;
                    if (this.field1880 < 0 || this.field1882.field4319.length <= this.field1880) {
                        this.field1880 = -1;
                    }
                }
            }
            this.field1853 = class229.field3595 - var4;
            this.field1860 = var4;
        }
        if (arg0 <= 115) {
            this.method938(-101, -96, -10);
        }
        field1884++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lcd;B)Ljava/lang/String;", line = 345)
    public static final String method939(class136 arg0, byte arg1) {
        field1865++;
        if (client.method953(arg0).method927(-1) == 0) {
            return null;
        } else if (arg0.field2080 == null || arg0.field2080.trim().length() == 0) {
            return class290.field4478 ? "Hidden-use" : null;
        } else if (arg1 >= -119) {
            return (String) null;
        } else {
            return arg0.field2080;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lug;Lug;I)V", line = 372)
    public static final void method940(class253 arg0, class253 arg1, int arg2) {
        class29.field430 = class303.method2103(arg0, -128, 0, class34.field506, arg1);
        if (arg2 != 20372) {
            method935(84, 87, 56);
        }
        if (class109.field1458) {
            class272.field4220 = class192.method1416(arg0, arg1, class34.field506, 0, (byte) 116);
        } else {
            class272.field4220 = (class226) class29.field430;
        }
        class102.field1355 = class303.method2103(arg0, -101, 0, class172.field2838, arg1);
        class270.field4197 = class303.method2103(arg0, -58, 0, class249.field3914, arg1);
        field1881++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIIJILtk;)V", line = 392)
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class151 arg10) {
        field1862++;
        class248 var13 = this.method942((byte) 115);
        if (var13 != null) {
            var13.method410(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1887);
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIIIIIZLgh;)V", line = 491)
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class248 arg8) {
        this.field1863 = arg2;
        this.field1885 = arg3;
        this.field1876 = arg5;
        this.field1874 = arg0;
        this.field1855 = arg1;
        this.field1858 = arg4;
        if (class109.field1458 && arg8 != null) {
            if (arg8 instanceof class128) {
                ((class128) arg8).method941(-1);
            } else {
                class121 var10 = class249.method1790(122, this.field1874);
                if (var10.field1690 != null) {
                    var10 = var10.method878((byte) 36);
                }
                if (var10 != null) {
                    class233.method1675(this.field1858, this.field1876, (byte) 95, 0, this.field1855, this.field1863, 0, this.field1885, var10);
                }
            }
        }
        if (arg6 != -1) {
            this.field1882 = class295.method2064(0, arg6);
            this.field1861 = 0;
            if (this.field1882.field4319.length > 1) {
                this.field1880 = 1;
            } else {
                this.field1880 = 0;
            }
            this.field1853 = class229.field3595 - 1;
            this.field1860 = 1;
            if (this.field1882.field4321 == 0 && arg8 != null && arg8 instanceof class128) {
                class128 var11 = (class128) arg8;
                if (this.field1882 == var11.field1882) {
                    this.field1853 = var11.field1853;
                    this.field1880 = var11.field1880;
                    this.field1861 = var11.field1861;
                    this.field1860 = var11.field1860;
                    return;
                }
            }
            if (arg7 && this.field1882.field4339 != -1) {
                this.field1861 = (int) ((double) this.field1882.field4319.length * Math.random());
                this.field1880 = this.field1861 + 1;
                if (this.field1882.field4319.length <= this.field1880) {
                    this.field1880 -= this.field1882.field4339;
                    if (this.field1880 < 0 || this.field1880 >= this.field1882.field4319.length) {
                        this.field1880 = -1;
                    }
                }
                this.field1860 = (int) ((double) this.field1882.field4328[this.field1861] * Math.random()) + 1;
                this.field1853 = class229.field3595 - this.field1860;
            }
        }
        if (class109.field1458 && arg8 != null) {
            this.method937((byte) -30, true);
        }
        if (arg8 == null) {
            class121 var12 = class249.method1790(82, this.field1874);
            if (var12.field1690 != null) {
                this.field1886 = true;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 439)
    public final void method941(int arg0) {
        field1870++;
        if (this.field1864 != null) {
            class8.method104(this.field1864, this.field1868, this.field1872, this.field1854);
        }
        this.field1871 = arg0;
        this.field1878 = -1;
        this.field1864 = null;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Lgh;", line = 475)
    public final class248 method942(byte arg0) {
        int var2 = -58 % ((arg0) / 34);
        field1879++;
        return this.method937((byte) -30, false);
    }
}
