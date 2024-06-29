import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class191 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "[J")
    public static long[] field3302 = new long[1000];

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[I")
    public static int[] field3312 = new int[128];

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3308 = 0;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field3318 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field3303;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public int field3314;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "J")
    public static long field3301;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Llj;")
    public static final class216 method1315(int arg0) {
        field3313++;
        class216 var1 = new class216(24);
        var1.method1477(3, -26755);
        var1.method1477(class120.field2172, -26755);
        var1.method1477(class93.field1640 ? 1 : 0, -26755);
        var1.method1477(class85.field1497 ? 1 : 0, -26755);
        var1.method1477(class104.field1848 ? 1 : 0, arg0 - 26756);
        var1.method1477(class12.field238 ? 1 : 0, -26755);
        var1.method1477(class199.field3423 ? 1 : 0, -26755);
        var1.method1477(class91.field1593 ? 1 : 0, -26755);
        var1.method1477(class45.field749 ? 1 : 0, -26755);
        var1.method1477(class115.field2062 ? 1 : 0, -26755);
        var1.method1477(class177.field3069, -26755);
        var1.method1477(class229.field3932 ? 1 : 0, arg0 ^ 0xFFFF977C);
        if (arg0 != 1) {
            return null;
        }
        var1.method1477(class41.field679 ? 1 : 0, -26755);
        var1.method1477(class45.field747 ? 1 : 0, -26755);
        var1.method1477(class120.field2184, -26755);
        var1.method1477(class158.field2873 ? 1 : 0, arg0 ^ 0xFFFF977C);
        var1.method1477(class37.field627, -26755);
        var1.method1477(class167.field2978, -26755);
        var1.method1477(class90.field1585, arg0 - 26756);
        var1.method1470((byte) -122, class223.field3854);
        var1.method1470((byte) -122, class265.field4644);
        var1.method1477(class68.field1082 ? 1 : 0, -26755);
        return var1;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public static final void method1316(int arg0, int arg1) {
        field3300++;
        if (arg0 != 1) {
            field3316 = -19;
        }
        class75.field1324.method1561(-119, arg1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BZ)V")
    public static final void method1317(byte arg0, boolean arg1) {
        class93.field1640 = arg1;
        class2.field34 = !class181.method1249((byte) 62);
        int var2 = -79 % ((36 - arg0) / 53);
        field3304++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Llj;II)V")
    private final void method1318(class216 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field3303 = arg0.method1487(arg2 + 28);
            this.field3310 = arg0.method1446(5350);
            this.field3314 = arg0.method1446(5350);
        }
        field3307++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIILsc;IJZ)Z")
    public static final boolean method1319(int arg0, int arg1, int arg2, int arg3, int arg4, class119 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class150.method1111(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILlj;)V")
    public final void method1320(int arg0, class216 arg1) {
        while (true) {
            int var3 = arg1.method1446(5350);
            if (var3 == 0) {
                if (arg0 != -11899) {
                    method1323(107, 59, -27, 53, -65, 7, -105);
                }
                field3311++;
                return;
            }
            this.method1318(arg1, var3, 1);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method1321(int arg0) {
        if (arg0 >= -84) {
            field3309 = 12;
        }
        field3312 = null;
        field3302 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
    public static final boolean method1322(boolean arg0) {
        if (!arg0) {
            return true;
        }
        field3315++;
        try {
            if (class216.field3685 == 2) {
                if (class119.field2136 == null) {
                    class119.field2136 = class35.method296(class116.field2072, class104.field1854, class245.field4292);
                    if (class119.field2136 == null) {
                        return false;
                    }
                }
                if (class227.field3917 == null) {
                    class227.field3917 = new class137(class224.field3869, class86.field1518);
                }
                if (class131.field2330.method53(class120.field2180, 16384, 22050, class227.field3917, class119.field2136)) {
                    class131.field2330.method49((byte) -108);
                    class131.field2330.method68(0, class242.field4189);
                    class131.field2330.method69(class119.field2136, 176, class133.field2357);
                    class227.field3917 = null;
                    class119.field2136 = null;
                    class216.field3685 = 0;
                    class116.field2072 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class131.field2330.method66(false);
            class216.field3685 = 0;
            class227.field3917 = null;
            class116.field2072 = null;
            class119.field2136 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < 5) {
            field3316 = 40;
        }
        field3317++;
        if (class229.field3933 <= arg3 && arg6 <= class106.field1899 && arg4 >= class116.field2077 && arg0 <= class215.field3666) {
            if (arg1 == 1) {
                class157.method1139(arg6, arg3, 987146636, arg2, arg0, arg4);
            } else {
                class83.method624(false, arg3, arg2, arg0, arg1, arg4, arg6);
            }
        } else if (arg1 == 1) {
            class256.method1773((byte) 62, arg4, arg0, arg3, arg6, arg2);
        } else {
            class226.method1559(arg4, arg6, arg3, arg1, 9, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lsb;")
    public static final class98 method1324(byte arg0) {
        field3306++;
        if (arg0 != -44) {
            method1321(-84);
        }
        class98 var1 = class223.field3847;
        if (class132.field2346 != 0) {
            var1 = class145.field2550;
        }
        return class186.method1288(new class98[] { class263.field4612, var1, class52.field845, class125.method930(25904, class76.field1355), class167.field2981, class125.method930(arg0 ^ 0xFFFF9AE4, class184.field3166), class258.field4558 }, 31618);
    }
}
