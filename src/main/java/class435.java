import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class435 extends class97 {

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Ljava/lang/String;")
    public String field6403;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "[I")
    public static int[] field6401 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Lfh;")
    public static class170 field6402 = null;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Liq;")
    public static class134 field6408;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "[Lkr;")
    public static class234[] field6404;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "[[B")
    public static byte[][] field6412;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V")
    public static void method2669(byte arg0) {
        field6412 = null;
        field6408 = null;
        field6401 = null;
        int var1 = -7 / ((arg0 + 57) / 57);
        field6404 = null;
        field6402 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Z")
    public static final boolean method2670(int arg0, int arg1) {
        if (arg1 == -61) {
            field6411++;
            return arg0 == 60 || arg0 == 9 || arg0 == 1006 || arg0 == 25 || arg0 == 21;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
    public class435() {
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(B)V")
    public static final void method2671(byte arg0) {
        if (class67.field865 && class185.field2786.method578(false, 81) && class149.field2067 > 2) {
            class42.method245((byte) -87, (class306) class372.field5433.field5946.field1336.field1336);
        } else {
            class42.method245((byte) -91, (class306) class372.field5433.field5946.field1336);
        }
        if (arg0 >= 95) {
            field6406++;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLje;B)V")
    public static final void method2672(boolean arg0, class169 arg1, byte arg2) {
        field6405++;
        if (arg2 < 6) {
            method2674(101, -6, (int[]) null, (Object[]) null, -46);
        }
        if (class149.field2067 >= 400 || class113.field1500 == arg1) {
            return;
        }
        String var9;
        if (arg1.field2453 == 0) {
            boolean var3 = true;
            if (class113.field1500.field2456 != -1 && arg1.field2456 != -1) {
                int var4 = class113.field1500.field2425 <= arg1.field2425 ? arg1.field2425 : class113.field1500.field2425;
                int var5 = class113.field1500.field2456 < arg1.field2456 ? class113.field1500.field2456 : arg1.field2456;
                int var6 = var5 + (var4 * 10 / 100) + 5;
                int var7 = class113.field1500.field2425 - arg1.field2425;
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (var7 > var6) {
                    var3 = false;
                }
            }
            String var8 = class466.field6855 == class17.field253 ? class185.field2789.method937((byte) -119, class27.field356) : class87.field1236.method937((byte) -41, class27.field356);
            if (arg1.field2436 <= arg1.field2425) {
                var9 = arg1.method1026(true, (byte) 34) + (var3 ? class120.method725(-6, class113.field1500.field2425, arg1.field2425) : "<col=ffffff>") + " (" + var8 + arg1.field2425 + ")";
            } else {
                var9 = arg1.method1026(true, (byte) 34) + (var3 ? class120.method725(-6, class113.field1500.field2425, arg1.field2425) : "<col=ffffff>") + " (" + var8 + arg1.field2425 + "+" + (arg1.field2436 - arg1.field2425) + ")";
            }
        } else {
            var9 = arg1.method1026(true, (byte) 34) + " (" + class328.field4928.method937((byte) 121, class27.field356) + arg1.field2453 + ")";
        }
        if (class132.field1692) {
            if (!arg0 && (class108.field1435 & 0x8) != 0) {
                class371.method2234(0, 19, 0, false, class284.field4319, (byte) -65, class411.field6116 + " -> <col=ffffff>" + var9, class105.field1411, (long) arg1.field1929, true);
                class119.field1558++;
            }
        } else if (arg0) {
            class371.method2234(0, 0, 0, true, "<col=cccccc>" + var9, (byte) -65, "", -1, 0L, false);
        } else {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (class119.field1567[var10] != null) {
                    short var11 = 0;
                    if (class88.field1254 == class466.field6855 && class119.field1567[var10].equalsIgnoreCase(class341.field5093.method937((byte) 100, class27.field356))) {
                        if (arg1.field2425 > class113.field1500.field2425) {
                            var11 = 2000;
                        }
                        if (class113.field1500.field2442 != 0 && arg1.field2442 != 0) {
                            if (class113.field1500.field2442 == arg1.field2442) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (class296.field4497[var10]) {
                        var11 = 2000;
                    }
                    short var12 = (short) (class150.field2077[var10] + var11);
                    int var13 = class453.field6719[var10] == -1 ? class220.field3341 : class453.field6719[var10];
                    class371.method2234(0, var12, 0, false, class119.field1567[var10], (byte) -65, "<col=ffffff>" + var9, var13, (long) arg1.field1929, true);
                    class416.field6180++;
                }
            }
        }
        if (arg0) {
            return;
        }
        for (class306 var14 = (class306) class372.field5433.method2514((byte) 61); var14 != null; var14 = (class306) class372.field5433.method2511(-120)) {
            if (var14.field4616 == 20) {
                var14.field4621 = "<col=ffffff>" + var9;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6409++;
        if (arg7 >= class192.field2917 && arg0 <= class39.field497 && class189.field2831 <= arg4 && class204.field3060 >= arg5) {
            class278.method1716(arg4, arg5, arg1, arg6, arg3, (byte) -98, arg7, arg0);
        } else {
            class91.method596(arg6, arg7, arg5, arg1, arg3, arg0, -1, arg4);
        }
        if (arg2 < 7) {
            method2675(-14, -28);
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class435(String arg0) {
        this.field6403 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II[I[Ljava/lang/Object;I)V")
    public static final void method2674(int arg0, int arg1, int[] arg2, Object[] arg3, int arg4) {
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if (arg2[var9] < (var9 & 0x1) + var7) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method2674(arg0, var6 - 1, arg2, arg3, 2);
            method2674(var6 + 1, arg1, arg2, arg3, 2);
        }
        field6410++;
        if (arg4 != 2) {
            method2674(-28, 12, (int[]) null, (Object[]) null, -53);
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(II)I")
    public static final int method2675(int arg0, int arg1) {
        if (arg1 == -1446204248) {
            field6407++;
            return arg0 >>> 8;
        } else {
            return -120;
        }
    }
}
