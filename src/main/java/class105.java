import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class105 extends class276 {

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    private int field1864 = 8192;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    private int field1869 = 4096;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    private int field1865 = 0;

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "I")
    private int field1878 = 2048;

    @OriginalMember(owner = "client!lb", name = "lb", descriptor = "I")
    private int field1883 = 12288;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "I")
    private int field1873 = 2048;

    @OriginalMember(owner = "client!lb", name = "kb", descriptor = "I")
    private int field1882 = 0;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1862 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "[[[I")
    public static int[][][] field1879 = new int[2][][];

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "S")
    public static short field1866 = 320;

    @OriginalMember(owner = "client!lb", name = "mb", descriptor = "[I")
    public static int[] field1884 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "[I")
    public static int[] field1880 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "[Lnh;")
    public static class288[] field1874 = new class288[2048];

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "Lgf;")
    public static class222 field1860 = new class222();

    @OriginalMember(owner = "client!lb", name = "ob", descriptor = "Z")
    public static boolean field1886 = false;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!lb", name = "nb", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "Lvh;")
    public static class108 field1861;

    @OriginalMember(owner = "client!lb", name = "jb", descriptor = "[[B")
    public static byte[][] field1881;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)I")
    public static final int method709(boolean arg0, int arg1) {
        ++field1867;
        return !arg0 ? -120 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILvh;)V")
    public static final void method710(int arg0, class108 arg1) {
        ++field1871;
        class55.field963 = arg1.method749("titlebg", arg0);
        class85.field1538 = arg1.method749("logo", 1);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)Ldk;")
    public static final class236 method711(byte arg0) {
        class45.field638 = 0;
        ++field1870;
        if (arg0 != -28) {
            field1880 = null;
        }
        return class171.method1152(-2);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field1868;
        if (arg2 != -1) {
            method711((byte) 125);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field1864 = arg1.method677(false);
                                }
                            } else {
                                this.field1869 = arg1.method677(false);
                            }
                        } else {
                            this.field1883 = arg1.method677(false);
                        }
                    } else {
                        this.field1873 = arg1.method677(false);
                    }
                } else {
                    this.field1882 = arg1.method677(false);
                }
            } else {
                this.field1865 = arg1.method677(false);
            }
        } else {
            this.field1878 = arg1.method677(false);
        }
    }

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
    public static void method712(int arg0) {
        field1861 = null;
        field1860 = null;
        field1880 = null;
        field1879 = null;
        field1874 = null;
        if (arg0 < 108) {
            field1866 = 74;
        }
        field1862 = null;
        field1881 = null;
        field1884 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZI)Z")
    private final boolean method713(int arg0, boolean arg1, int arg2) {
        ++field1859;
        if (!arg1) {
            this.method716(85, -112, 40);
        }
        int var4 = (arg0 + arg2) * this.field1883 >> 12;
        int var5 = class42.field620[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1883;
        int var7 = (var6 << 12) / this.field1864;
        int var8 = this.field1869 * var7 >> 12;
        return ~(-arg2 + arg0) > ~var8 && ~(-var8) > ~(arg0 - arg2);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field1872;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (arg0 < 39) {
            return null;
        } else {
            if (super.field4425.field2448) {
                int var4 = class206.field3389[arg1] + -2048;
                for (int var5 = 0; var5 < class53.field929; ++var5) {
                    int var6 = class175.field2883[var5] + -2048;
                    int var7 = this.field1878 + var6;
                    int var8 = this.field1865 + var4;
                    int var9 = ~var8 <= 2047 ? var8 : var8 + 4096;
                    int var10 = this.field1882 + var6;
                    int var11 = ~var10 <= 2047 ? var10 : var10 - -4096;
                    int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                    int var13 = ~var7 > 2047 ? var7 + 4096 : var7;
                    int var14 = var9 > 2048 ? var9 + -4096 : var9;
                    int var15 = this.field1873 + var4;
                    int var16 = var13 > 2048 ? var13 + -4096 : var13;
                    int var17 = var15 < -2048 ? var15 - -4096 : var15;
                    int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                    var3[var5] = !this.method716(var16, var14, 2) && !this.method713(var18, true, var12) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Lpb;")
    public static final class167 method714(int arg0, byte arg1) {
        ++field1885;
        if (arg1 < 0) {
            method717(51, -124, (byte) 104, 75, 71, 79);
        }
        class167 var2 = (class167) class123.field2176.method57((long) arg0, -91);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class110.field1985.method746(class27.method182(arg0, true), (byte) -128, class118.method812(false, arg0));
            class167 var4 = new class167();
            var4.field2732 = arg0;
            if (var3 != null) {
                var4.method1121(new class101(var3), 112);
            }
            var4.method1118(16);
            class123.field2176.method62(0, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)Z")
    public static final boolean method715(int arg0) {
        ++field1863;
        if (arg0 <= 92) {
            field1886 = false;
        }
        if (class169.field2794) {
            try {
                if ((Boolean) class94.method604(class127.field2238.field2294, "showingVideoAd", 27972)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)Z")
    private final boolean method716(int arg0, int arg1, int arg2) {
        ++field1876;
        int var4 = (-arg0 + arg1) * this.field1883 >> 12;
        int var5 = class42.field620[255 & var4 * 255 >> 12];
        if (arg2 != 2) {
            this.method23(53, 56);
        }
        int var6 = (var5 << 12) / this.field1883;
        int var7 = (var6 << 12) / this.field1864;
        int var8 = this.field1869 * var7 >> 12;
        return var8 > arg0 + arg1 && arg0 - -arg1 > -var8;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (arg0 <= 66) {
            method709(false, 82);
        }
        class76.method465(98);
        ++field1877;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBIII)V")
    public static final void method717(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field1858;
        int var6 = 0;
        class93.method598(-7, arg4 + arg5, arg4 - arg5, class167.field2735[arg0], arg1);
        int var7 = arg3;
        int var8 = arg5 * arg5;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var9 << 2;
        int var12 = var8 << 1;
        int var13 = arg3 << 1;
        int var14 = (-var13 + 1) * var8 + var10;
        int var15 = var8 << 2;
        int var16 = -((var13 + -1) * var12) + var9;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) + -3) * var12;
        int var19 = (var6 + 1) * var11;
        int var20 = (arg3 + -1) * var15;
        while (~var7 < -1) {
            if (var14 < 0) {
                while (var14 < 0) {
                    ++var6;
                    var14 += var17;
                    var16 += var19;
                    var19 += var11;
                    var17 += var11;
                }
            }
            if (~var16 > -1) {
                var14 += var17;
                var16 += var19;
                var19 += var11;
                var17 += var11;
                ++var6;
            }
            var16 += -var18;
            var14 += -var20;
            var20 -= var15;
            --var7;
            int var21 = arg0 + var7;
            int var22 = arg4 + var6;
            int var23 = arg0 - var7;
            var18 -= var15;
            int var24 = -var6 + arg4;
            class93.method598(-7, var22, var24, class167.field2735[var23], arg1);
            class93.method598(-7, var22, var24, class167.field2735[var21], arg1);
        }
        if (arg2 > -57) {
            field1879 = null;
        }
    }
}
