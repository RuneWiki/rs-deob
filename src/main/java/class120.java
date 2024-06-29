import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class120 extends class191 {

    @OriginalMember(owner = "client!md", name = "I", descriptor = "Ldd;")
    public static class35 field2631 = class180.method1196((byte) 126, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lth;")
    public static class187 field2633 = new class187();

    @OriginalMember(owner = "client!md", name = "T", descriptor = "[I")
    public static int[] field2642 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "Ldd;")
    public static class35 field2639 = class180.method1196((byte) -45, "Null");

    @OriginalMember(owner = "client!md", name = "U", descriptor = "Ldd;")
    private static class35 field2643 = class180.method1196((byte) 127, " is already on your ignore list)3");

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Ldd;")
    public static class35 field2638 = field2643;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public int field2634;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Ldd;")
    public class35 field2635;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "[I")
    public int[] field2630;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "[I")
    public int[] field2645;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "[Ldd;")
    public class35[] field2644;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)I")
    public static final int method855(int arg0, byte arg1) {
        if (arg1 != -111) {
            return 89;
        }
        field2636++;
        class179 var2 = client.method281((byte) 126, arg0);
        int var3 = var2.field3667;
        int var4 = var2.field3669;
        int var5 = var2.field3668;
        int var6 = class176.field3588[var4 - var5];
        return var6 & class115.field2557[var3] >> var5;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V")
    public static void method856(byte arg0) {
        field2631 = null;
        field2633 = null;
        field2639 = null;
        field2642 = null;
        int var1 = -37 / ((1 - arg0) / 46);
        field2643 = null;
        field2638 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(III)Z")
    public static final boolean method857(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class196.field3898; var3++) {
            class79 var4 = class39.field855[var3];
            if (var4.field1844 == 1) {
                int var5 = var4.field1842 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1852 * var5 >> 8) + var4.field1846;
                    int var7 = (var4.field1834 * var5 >> 8) + var4.field1845;
                    int var8 = (var4.field1840 * var5 >> 8) + var4.field1836;
                    int var9 = (var4.field1847 * var5 >> 8) + var4.field1828;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1844 == 2) {
                int var10 = arg0 - var4.field1842;
                if (var10 > 0) {
                    int var11 = (var4.field1852 * var10 >> 8) + var4.field1846;
                    int var12 = (var4.field1834 * var10 >> 8) + var4.field1845;
                    int var13 = (var4.field1840 * var10 >> 8) + var4.field1836;
                    int var14 = (var4.field1847 * var10 >> 8) + var4.field1828;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1844 == 3) {
                int var15 = var4.field1846 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1831 * var15 >> 8) + var4.field1842;
                    int var17 = (var4.field1833 * var15 >> 8) + var4.field1829;
                    int var18 = (var4.field1840 * var15 >> 8) + var4.field1836;
                    int var19 = (var4.field1847 * var15 >> 8) + var4.field1828;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1844 == 4) {
                int var20 = arg2 - var4.field1846;
                if (var20 > 0) {
                    int var21 = (var4.field1831 * var20 >> 8) + var4.field1842;
                    int var22 = (var4.field1833 * var20 >> 8) + var4.field1829;
                    int var23 = (var4.field1840 * var20 >> 8) + var4.field1836;
                    int var24 = (var4.field1847 * var20 >> 8) + var4.field1828;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1844 == 5) {
                int var25 = arg1 - var4.field1836;
                if (var25 > 0) {
                    int var26 = (var4.field1831 * var25 >> 8) + var4.field1842;
                    int var27 = (var4.field1833 * var25 >> 8) + var4.field1829;
                    int var28 = (var4.field1852 * var25 >> 8) + var4.field1846;
                    int var29 = (var4.field1834 * var25 >> 8) + var4.field1845;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
    public static final void method858(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 6961) {
            field2642 = null;
        }
        for (class14 var5 = (class14) class167.field3371.method1232(25831); var5 != null; var5 = (class14) class167.field3371.method1238(22622)) {
            if (var5.field266 != -1 || var5.field252 != null) {
                int var6 = 0;
                if (var5.field244 < arg3) {
                    var6 += arg3 - var5.field244;
                } else if (arg3 < var5.field256) {
                    var6 += var5.field256 - arg3;
                }
                if (var5.field246 < arg1) {
                    var6 += arg1 - var5.field246;
                } else if (arg1 < var5.field260) {
                    var6 += var5.field260 - arg1;
                }
                if (var6 - 64 > var5.field251 || class25.field507 == 0 || var5.field254 != arg0) {
                    if (var5.field261 != null) {
                        class88.field1958.method982(var5.field261);
                        var5.field261 = null;
                    }
                    if (var5.field258 != null) {
                        class88.field1958.method982(var5.field258);
                        var5.field258 = null;
                    }
                } else {
                    var6 -= 64;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = (var5.field251 - var6) * class25.field507 / var5.field251;
                    if (var5.field261 != null) {
                        var5.field261.method706(var7);
                    } else if (var5.field266 >= 0) {
                        class189 var8 = class189.method1247(class57.field1420, var5.field266, 0);
                        if (var8 != null) {
                            class10 var9 = var8.method1249().method70(class8.field164);
                            class94 var10 = class94.method702(var9, 100, var7);
                            var10.method711(-1);
                            class88.field1958.method984(var10);
                            var5.field261 = var10;
                        }
                    }
                    if (var5.field258 != null) {
                        var5.field258.method706(var7);
                        if (!var5.field258.method802((byte) 107)) {
                            var5.field258 = null;
                        }
                    } else if (var5.field252 != null && (var5.field259 -= arg2) <= 0) {
                        int var11 = (int) ((double) var5.field252.length * Math.random());
                        class189 var12 = class189.method1247(class57.field1420, var5.field252[var11], 0);
                        if (var12 != null) {
                            class10 var13 = var12.method1249().method70(class8.field164);
                            class94 var14 = class94.method702(var13, 100, var7);
                            var14.method711(0);
                            class88.field1958.method984(var14);
                            var5.field259 = (int) (Math.random() * (double) (var5.field255 - var5.field245)) + var5.field245;
                            var5.field258 = var14;
                        }
                    }
                }
            }
        }
        field2628++;
    }
}
