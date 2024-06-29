import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class392 {

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field5702 = 0;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "[Z")
    public static boolean[] field5701 = new boolean[100];

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Lwv;")
    public static class705 field5698;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lhw;IZ)V")
    public static final void method2381(class270 arg0, int arg1, boolean arg2) {
        field5703++;
        if (class400.field5784 >= 400) {
            return;
        }
        if (class103.field1708 != arg0) {
            String var9;
            if (arg0.field3880 == 0) {
                boolean var3 = true;
                if (class103.field1708.field3847 != -1 && arg0.field3847 != -1) {
                    int var4 = arg0.field3838 < class103.field1708.field3838 ? class103.field1708.field3838 : arg0.field3838;
                    int var5 = arg0.field3847 > class103.field1708.field3847 ? class103.field1708.field3847 : arg0.field3847;
                    int var6 = var4 * 10 / 100 + var5 + 5;
                    int var7 = class103.field1708.field3838 - arg0.field3838;
                    if (var7 < 0) {
                        var7 = -var7;
                    }
                    if (var6 < var7) {
                        var3 = false;
                    }
                }
                String var8 = class486.field6942 == class302.field4235 ? class343.field4779.method2059(class238.field3511, true) : class343.field4777.method2059(class238.field3511, true);
                if (arg0.field3878 <= arg0.field3838) {
                    var9 = arg0.method1698(true, 9878) + (var3 ? class213.method1452(-75, arg0.field3838, class103.field1708.field3838) : "<col=ffffff>") + " (" + var8 + arg0.field3838 + ")";
                } else {
                    var9 = arg0.method1698(true, 9878) + (var3 ? class213.method1452(-84, arg0.field3838, class103.field1708.field3838) : "<col=ffffff>") + " (" + var8 + arg0.field3838 + "+" + (arg0.field3878 - arg0.field3838) + ")";
                }
            } else if (arg0.field3880 == -1) {
                var9 = arg0.method1698(true, 9878);
            } else {
                var9 = arg0.method1698(true, 9878) + " (" + class343.field4778.method2059(class238.field3511, true) + arg0.field3880 + ")";
            }
            if (class41.field555 && !arg2 && (class700.field9918 & 0x8) != 0) {
                class43.field581++;
                class476.method2787(0, (long) arg0.field2427, -1, 0, true, (byte) -26, class584.field8560, 59, class252.field3651 + " -> <col=ffffff>" + var9, false, class25.field346);
            }
            if (arg1 >= -33) {
                field5704 = -32;
            }
            if (arg2) {
                class476.method2787(0, 0L, 0, 0, false, (byte) -26, "<col=cccccc>" + var9, -1, "", true, -1);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class288.field4050[var10] != null) {
                        short var11 = 0;
                        if (class486.field6942 == class470.field6783 && class288.field4050[var10].equalsIgnoreCase(class343.field4772.method2059(class238.field3511, true))) {
                            if (class103.field1708.field3838 < arg0.field3838) {
                                var11 = 2000;
                            }
                            if (class103.field1708.field3846 != 0 && arg0.field3846 != 0) {
                                if (class103.field1708.field3846 == arg0.field3846) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class23.field317[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class316.field4376[var10] + var11);
                        int var13 = class236.field3496[var10] == -1 ? class333.field4640 : class236.field3496[var10];
                        class570.field8323++;
                        class476.method2787(0, (long) arg0.field2427, -1, 0, true, (byte) -26, class288.field4050[var10], var12, "<col=ffffff>" + var9, false, var13);
                    }
                }
            }
            if (!arg2) {
                for (class673 var14 = (class673) class150.field2533.method3905(-109); var14 != null; var14 = (class673) class150.field2533.method3899(0)) {
                    if (var14.field9544 == 45) {
                        var14.field9542 = "<col=ffffff>" + var9;
                        return;
                    }
                }
            }
        } else if (class41.field555 && (class700.field9918 & 0x10) != 0) {
            class476.method2787(0, 0L, -1, 0, true, (byte) -26, class584.field8560, 6, class252.field3651 + " -> <col=ffffff>" + class343.field4786.method2059(class238.field3511, true), false, class25.field346);
            class252.field3650++;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIILua;Lr;Lis;II)V")
    public static final void method2382(int arg0, int arg1, int arg2, int arg3, class591 arg4, class98 arg5, class101 arg6, int arg7, int arg8) {
        field5699++;
        class30 var9 = class304.field4255.method2837(arg7, -102);
        if (arg2 != 305) {
            field5702 = -68;
        }
        if (var9 == null || !var9.field437 || !var9.method274(true, class230.field3404)) {
            return;
        }
        if (var9.field450 != null) {
            int[] var10 = new int[var9.field450.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class40.field544 == 4) {
                    var13 = (int) class473.field6790 & 0x3FFF;
                } else {
                    var13 = (int) class473.field6790 + class419.field5957 & 0x3FFF;
                }
                int var14 = class302.field4241[var13];
                int var15 = class302.field4242[var13];
                if (class40.field544 != 4) {
                    var14 = var14 * 256 / (class239.field3523 + 256);
                    var15 = var15 * 256 / (class239.field3523 + 256);
                }
                var10[var11 * 2] = arg1 + (arg6.field1604 / 2) + ((var9.field450[var11 * 2 - -1] * 4 + arg3) * var14 - -((var9.field450[var11 * 2] * 4 + arg0) * var15) >> 14);
                var10[var11 * 2 + 1] = arg6.field1651 / 2 + arg8 - ((var9.field450[var11 * 2 + 1] * 4 + arg3) * var15 - (arg0 - -(var9.field450[var11 * 2] * 4)) * var14 >> 14);
            }
            class559.method3270(arg5, var10, var9.field446, arg6.field1608, arg6.field1568);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg5.method779(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 3], var9.field443, 1, arg4, arg1, arg8);
            }
            arg5.method779(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field443, 1, arg4, arg1, arg8);
        }
        class257 var16 = null;
        if (var9.field415 != -1) {
            var16 = var9.method276(arg2 - 316, false, arg5);
            if (var16 != null) {
                class323.method1932(arg0, arg1, arg6, var16, arg3, arg4, arg2 + 15358, arg8);
            }
        }
        if (var9.field432 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method17();
        }
        class395 var18 = class424.field6054;
        class490 var19 = class180.field2847;
        if (var9.field447 == 1) {
            var18 = class335.field4670;
            var19 = class399.field5763;
        }
        if (var9.field447 == 2) {
            var19 = class246.field3584;
            var18 = class148.field2503;
        }
        class609.method3459(var19, arg6, arg4, var18, arg0, -116, var9.field432, var9.field427, arg1, arg8, arg3, var17);
        return;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIB)I")
    public static final int method2383(int arg0, int arg1, int arg2, byte arg3) {
        field5700++;
        if (arg0 == arg1) {
            return arg1;
        }
        int var4 = 128 - arg2;
        int var5 = (arg0 & 0x7F) * arg2 + (arg1 & 0x7F) * var4 >> 7;
        int var6 = (arg0 & 0x380) * arg2 + (arg1 & 0x380) * var4 >> 7;
        if (arg3 >= -29) {
            return -6;
        } else {
            int var7 = (arg0 & 0xFC00) * arg2 + (arg1 & 0xFC00) * var4 >> 7;
            return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public static void method2384(int arg0) {
        field5698 = null;
        int var1 = 19 / ((arg0 + 61) / 63);
        field5701 = null;
    }
}
