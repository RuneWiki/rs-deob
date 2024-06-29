import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class377 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lbj;")
    public static class162 field5511 = new class162(42, 8);

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lbj;")
    public static class162 field5513 = new class162(1, 15);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "J")
    public static long field5512;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILsf;IILha;)V")
    public static final void method2313(int arg0, class366 arg1, int arg2, int arg3, class43 arg4) {
        field5507++;
        if ((arg3 & 0x100) != 0) {
            int var5 = arg4.method1854(-11428);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = arg4.method1871((byte) -92);
            int var7 = arg4.method1859(255);
            arg1.method3161(-32768, var5, var7, var6, false);
        }
        byte var8 = -1;
        if ((arg3 & 0x1000) != 0) {
            var8 = arg4.method1831(255);
        }
        if ((arg3 & 0x4000) != 0) {
            int var9 = arg4.method1854(-11428);
            arg1.field7798 = arg4.method1858(-3256);
            arg1.field7833 = arg4.method1859(255);
            arg1.field7809 = (var9 & 0x8000) != 0;
            arg1.field7801 = var9 & 0x7FFF;
            arg1.field7817 = class62.field1268 + arg1.field7801 + arg1.field7798;
        }
        if ((arg3 & 0x8) != 0) {
            int var10 = arg4.method1876((byte) -113);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = arg4.method1839(123);
            class430.method2591(var11, var10, arg1, false);
        }
        if ((arg3 & 0x200) != 0) {
            arg1.field7854 = arg4.method1831(255);
            arg1.field7810 = arg4.method1816(true);
            arg1.field7824 = arg4.method1831(255);
            arg1.field7819 = arg4.method1832(-29627);
            arg1.field7856 = arg4.method1854(-11428) + class62.field1268;
            arg1.field7827 = arg4.method1841((byte) 35) + class62.field1268;
            arg1.field7821 = arg4.method1842(100);
            arg1.field7873 = 0;
            if (arg1.field5353) {
                arg1.field7824 += arg1.field5349;
                arg1.field7863 = 0;
                arg1.field7810 += arg1.field5366;
                arg1.field7854 += arg1.field5349;
                arg1.field7819 += arg1.field5366;
            } else {
                arg1.field7824 += arg1.field7866[0];
                arg1.field7854 += arg1.field7866[0];
                arg1.field7863 = 1;
                arg1.field7810 += arg1.field7870[0];
                arg1.field7819 += arg1.field7870[0];
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var12 = arg4.method1827(122);
            if (var12 == 65535) {
                var12 = -1;
            }
            arg1.field7804 = var12;
        }
        if ((arg3 & 0x20) != 0) {
            int var13 = arg4.method1825((byte) -114);
            int var14 = arg4.method1842(107);
            arg1.method3158(false, class62.field1268, var13, var14);
            arg1.field7818 = class62.field1268 + 300;
            arg1.field7773 = arg4.method1858(-3256);
        }
        if ((arg3 & 0x2) != 0) {
            arg1.field5342 = arg4.method1876((byte) -123);
            if (arg1.field7863 == 0) {
                arg1.method3166(0, arg1.field5342);
                arg1.field5342 = -1;
            }
        }
        if ((arg3 & 0x40000) != 0) {
            int var15 = arg4.method1854(-11428);
            int var16 = arg4.method1824(-2);
            if (var15 == 65535) {
                var15 = -1;
            }
            int var17 = arg4.method1859(255);
            arg1.method3161(-32768, var15, var17, var16, true);
        }
        int var18 = 127 % ((arg2 - 68) / 44);
        if ((arg3 & 0x8000) != 0) {
            arg1.field7777 = arg4.method1834(-17823);
            if (arg1.field7777.charAt(0) == '~') {
                arg1.field7777 = arg1.field7777.substring(1);
                class492.method2969(arg1.method2246(true, true), 0, arg1.field7777, arg1.method2239(false, true), 0, 2);
            } else if (class15.field266 == arg1) {
                class492.method2969(arg1.method2246(true, true), 0, arg1.field7777, arg1.method2239(false, true), 0, 2);
            }
            arg1.field7811 = 0;
            arg1.field7766 = 150;
            arg1.field7779 = 0;
        }
        if ((arg3 & 0x2000) != 0) {
            int var19 = class62.field1268;
            int var20 = arg4.method1825((byte) -114);
            int var21 = arg4.method1839(118);
            arg1.method3158(false, var19, var20, var21);
        }
        if ((arg3 & 0x800) != 0) {
            arg1.field5354 = arg4.method1839(122) == 1;
        }
        if ((arg3 & 0x80) != 0) {
            int var22 = arg4.method1841((byte) 38);
            int var23 = arg4.method1859(255);
            int var24 = arg4.method1858(-3256);
            int var25 = arg4.field4399;
            boolean var26 = (var22 & 0x8000) != 0;
            if (arg1.field5381 != null && arg1.field5343 != null) {
                boolean var27 = false;
                if (var23 <= 1) {
                    if (!var26 && !(!class453.field6733 || class85.field1747) || class410.field6203) {
                        var27 = true;
                    } else if (class517.method3073(true, arg1.field5381)) {
                        var27 = true;
                    }
                }
                if (!var27 && class179.field2913 == 0) {
                    class381.field5581.field4399 = 0;
                    arg4.method1869(var24, class381.field5581.field4408, 0, 27370);
                    class381.field5581.field4399 = 0;
                    int var28 = -1;
                    String var29;
                    if (var26) {
                        var22 &= 0x7FFF;
                        class507 var30 = class309.method1975(class381.field5581, -85);
                        var28 = var30.field7388;
                        var29 = var30.field7390.method2401(true, class381.field5581);
                    } else {
                        var29 = class231.method1524(class409.method2538(-2, class381.field5581), (byte) -84);
                    }
                    arg1.field7777 = var29.trim();
                    arg1.field7779 = var22 & 0xFF;
                    arg1.field7811 = var22 >> 8;
                    arg1.field7766 = 150;
                    int var31;
                    if (var23 == 1 || var23 == 2) {
                        var31 = var26 ? 17 : 1;
                    } else {
                        var31 = var26 ? 17 : 2;
                    }
                    if (var23 == 2) {
                        class304.method1942(var28, null, var29, "<img=1>" + arg1.method2239(false, true), true, 0, "<img=1>" + arg1.method2246(true, true), var31);
                    } else if (var23 == 1) {
                        class304.method1942(var28, null, var29, "<img=0>" + arg1.method2239(false, true), true, 0, "<img=0>" + arg1.method2246(true, true), var31);
                    } else {
                        class304.method1942(var28, null, var29, arg1.method2239(false, true), true, 0, arg1.method2246(true, true), var31);
                    }
                }
            }
            arg4.field4399 = var24 + var25;
        }
        if ((arg3 & 0x4) != 0) {
            int var32 = arg4.method1839(121);
            byte[] var33 = new byte[var32];
            class289 var34 = new class289(var33);
            arg4.method1869(var32, var33, 0, 27370);
            class334.field5057[arg0] = var34;
            arg1.method2243(125, var34);
        }
        if ((arg3 & 0x10000) != 0) {
            int var35 = arg4.method1839(116);
            int[] var36 = new int[var35];
            int[] var37 = new int[var35];
            int[] var38 = new int[var35];
            for (int var39 = 0; var39 < var35; var39++) {
                int var40 = arg4.method1841((byte) 8);
                if (var40 == 65535) {
                    var40 = -1;
                }
                var36[var39] = var40;
                var37[var39] = arg4.method1858(-3256);
                var38[var39] = arg4.method1876((byte) -105);
            }
            class155.method1127(var38, arg1, var36, var37, -1);
        }
        if ((arg3 & 0x10) != 0) {
            class267.field4058[arg0] = arg4.method1831(255);
        }
        if ((arg3 & 0x20000) != 0) {
            arg1.field7838 = arg4.method1832(-29627);
            arg1.field7820 = arg4.method1816(true);
            arg1.field7791 = arg4.method1832(-29627);
            arg1.field7851 = (byte) arg4.method1859(255);
            arg1.field7776 = class62.field1268 + arg4.method1841((byte) 44);
            arg1.field7828 = class62.field1268 + arg4.method1827(122);
        }
        if (!arg1.field5353) {
            return;
        }
        if (var8 == 127) {
            arg1.method2237((byte) 115, arg1.field5349, arg1.field5366);
            return;
        }
        byte var41;
        if (var8 == -1) {
            var41 = class267.field4058[arg0];
        } else {
            var41 = var8;
        }
        arg1.method2244((byte) -113, arg1.field5366, arg1.field5349, var41);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZ)Z")
    public static final boolean method2314(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            return false;
        }
        field5508++;
        if ((class22.field333[0][arg3][arg2] & 0x2) != 0) {
            return true;
        } else if ((class22.field333[arg0][arg3][arg2] & 0x10) == 0) {
            return arg1 == class82.method775(arg3, -108, arg2, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method2315(int arg0, boolean arg1, int arg2) {
        if (arg2 <= 115) {
            field5514 = 65;
        }
        field5510++;
        return arg1 && arg0 >= 0 ? class385.method2364(10, arg1, arg0, (byte) 126) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIZB)Lik;")
    public static final class141 method2316(int arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field5509++;
        class141 var5 = new class141();
        var5.field2342 = arg2;
        var5.field2338 = arg0;
        class470.field6975.method1618(var5, (long) arg1, -1);
        if (arg4 != -4) {
            method2313(-128, null, 121, 0, null);
        }
        class160.method1143((byte) -113, arg2);
        class388 var6 = class271.method1716(27411, arg1);
        if (var6 != null) {
            class429.method2587(var6, (byte) -63);
        }
        if (class299.field4518 != null) {
            class429.method2587(class299.field4518, (byte) -63);
            class299.field4518 = null;
        }
        class86.method800(false);
        if (var6 != null) {
            class379.method2331(!arg3, 26, var6);
        }
        if (!arg3) {
            class495.method2984(arg2);
        }
        if (!arg3 && class155.field2523 != -1) {
            class187.method1277(class155.field2523, 1, -3816);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIZIIIII)Z")
    public static final boolean method2317(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5515++;
        int var9 = class15.field266.field7866[0];
        int var10 = class15.field266.field7870[0];
        if (var9 < 0 || var9 >= class339.field5099 || var10 < 0 || class484.field7129 <= var10) {
            return false;
        } else if (arg5 >= 0 && arg5 < class339.field5099 && arg2 >= 0 && arg2 < class484.field7129) {
            int var11 = class3.method22(var10, arg1, class67.field1367[class15.field266.field6084], arg6, arg4, (byte) 60, var9, arg7, arg3, arg5, arg2, arg8, class372.field5445, class15.field266.method2241(-69), class210.field3354);
            if (var11 < 1) {
                return false;
            }
            class127.field2172 = class210.field3354[arg0 + var11];
            class205.field3284 = class372.field5445[var11 - 1];
            class471.field6986 = false;
            class174.method1202(15);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static void method2318(int arg0) {
        field5513 = null;
        field5511 = null;
        if (arg0 != 8972) {
            field5514 = 26;
        }
    }
}
