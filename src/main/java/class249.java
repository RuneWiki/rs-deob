import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class249 extends class128 {

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Lfh;")
    public class219 field4039;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "Z")
    public static boolean field4036 = true;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "I")
    public static int field4043 = 0;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Lcg;")
    public static class49 field4035;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Lcg;")
    public static class49 field4038;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "Lcg;")
    public static class49 field4044;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "[[[I")
    public static int[][][] field4042;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V", line = 7)
    public static void method1746(int arg0) {
        field4044 = null;
        field4038 = null;
        if (arg0 > -25) {
            field4035 = (class49) null;
        }
        field4042 = (int[][][]) null;
        field4035 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZIIIIB)V", line = 22)
    public static final void method1747(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4037++;
        if (arg5 != -38) {
            field4038 = (class49) null;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (class43.field680) {
            int var6 = arg3 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class21.field319 - class195.field3266) * var6 / 100 + class195.field3266;
            if (var7 < class288.field4599) {
                var7 = class288.field4599;
            } else if (var7 > class321.field5099) {
                var7 = class321.field5099;
            }
            int var8 = arg3 * 512 * var7 / (arg1 * 334);
            if (var8 < class105.field1754) {
                short var12 = class105.field1754;
                var7 = var12 * 334 * arg1 / (arg3 * 512);
                if (var7 > class321.field5099) {
                    var7 = class321.field5099;
                    int var13 = arg3 * var7 * 512 / (var12 * 334);
                    int var14 = (arg1 - var13) / 2;
                    if (arg0) {
                        class169.method1335();
                        class169.method1337(arg2, arg4, var14, arg3, 0);
                        class169.method1337(arg1 + arg2 - var14, arg4, var14, arg3, 0);
                    }
                    arg1 -= var14 * 2;
                    arg2 += var14;
                }
            } else if (class179.field3036 < var8) {
                short var9 = class179.field3036;
                var7 = arg1 * 334 * var9 / (arg3 * 512);
                if (class288.field4599 > var7) {
                    var7 = class288.field4599;
                    int var10 = arg1 * var9 * 334 / (var7 * 512);
                    int var11 = (arg3 - var10) / 2;
                    if (arg0) {
                        class169.method1335();
                        class169.method1337(arg2, arg4, arg1, var11, 0);
                        class169.method1337(arg2, arg4 + arg3 - var11, arg1, var11, 0);
                    }
                    arg4 += var11;
                    arg3 -= var11 * 2;
                }
            }
            class353.field5583 = arg3 * var7 / 334;
        }
        class195.field3274 = (short) arg1;
        class188.field3156 = arg2;
        class325.field5181 = arg4;
        class125.field2156 = (short) arg3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIBII)V", line = 129)
    public static final void method1748(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4040++;
        class318.field5042 = class304.field4825 * arg0 / arg3;
        class199.field3404 = -1;
        class95.field1483 = class113.field1893 * arg4 / arg1;
        class255.field4115 = -1;
        class218.method1605(0);
        if (arg2 < 30) {
            method1746(-64);
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)Z", line = 146)
    public static final boolean method1749(int arg0, int arg1) {
        field4046++;
        if (class168.field2925 == arg1) {
            return false;
        }
        class332.field5284 = new int[104][104];
        class222.field3700 = new int[4][13][13];
        if (arg0 != -24417) {
            method1746(112);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class163.field2882[var2] = new class200(104, 104);
        }
        class214.field3591 = new class331[4][104][104];
        class35.field498 = new byte[4][104][104];
        class152.field2683 = new byte[4][104][104];
        if (class43.field680) {
            class245.method1710(4, 104, 104);
            class14.method143(104, 104);
            client.field4377 = new class36[13][13];
        }
        class168.field2925 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lfh;)V", line = 192)
    public class249(class219 arg0) {
        this.field4039 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLcg;)V", line = 202)
    public static final void method1750(byte arg0, class49 arg1) {
        int var2 = -105 % ((arg0 - 21) / 59);
        field4035 = arg1;
        field4045++;
        class184.field3118 = field4035.method455(4, true);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILjava/lang/String;II)V", line = 216)
    public static final void method1751(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field4041++;
        class137 var5 = class60.method557(arg4, 99, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field2413 != null) {
            class258 var6 = new class258();
            var6.field4176 = arg2;
            var6.field4177 = arg0;
            var6.field4173 = var5.field2413;
            var6.field4168 = var5;
            class179.method1376(var6, false);
        }
        boolean var7 = true;
        if (var5.field2386 > 0) {
            var7 = class201.method1514((byte) -19, var5);
        }
        if (!var7 || !client.method1894(var5).method509(2966, arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class341.field5443.method26(89, 7);
            class341.field5443.method2320(-6128, arg4);
            class25.field348++;
            class341.field5443.method2359(arg3 ^ 0xCFFB6C91, arg1);
        }
        if (arg0 == 2) {
            class341.field5443.method26(126, 7);
            class328.field5221++;
            class341.field5443.method2320(arg3 - 6217, arg4);
            class341.field5443.method2359(-805606200, arg1);
        }
        if (arg0 == 3) {
            class341.field5443.method26(101, 7);
            class171.field2963++;
            class341.field5443.method2320(-6128, arg4);
            class341.field5443.method2359(-805606200, arg1);
        }
        if (arg0 == 4) {
            class341.field5443.method26(241, 7);
            class341.field5443.method2320(-6128, arg4);
            class159.field2813++;
            class341.field5443.method2359(-805606200, arg1);
        }
        if (arg0 == 5) {
            class225.field3793++;
            class341.field5443.method26(150, arg3 ^ 0x5E);
            class341.field5443.method2320(arg3 ^ 0xFFFFE849, arg4);
            class341.field5443.method2359(arg3 ^ 0xCFFB6C91, arg1);
        }
        if (arg0 == 6) {
            class156.field2767++;
            class341.field5443.method26(255, arg3 - 82);
            class341.field5443.method2320(-6128, arg4);
            class341.field5443.method2359(-805606200, arg1);
        }
        if (arg0 == 7) {
            class341.field5443.method26(52, 7);
            class341.field5443.method2320(arg3 - 6217, arg4);
            class341.field5443.method2359(arg3 ^ 0xCFFB6C91, arg1);
            class347.field5534++;
        }
        if (arg0 == 8) {
            class221.field3689++;
            class341.field5443.method26(206, 7);
            class341.field5443.method2320(-6128, arg4);
            class341.field5443.method2359(-805606200, arg1);
        }
        if (arg0 == 9) {
            class101.field1636++;
            class341.field5443.method26(189, 7);
            class341.field5443.method2320(-6128, arg4);
            class341.field5443.method2359(-805606200, arg1);
        }
        if (arg0 == 10) {
            class228.field3829++;
            class341.field5443.method26(62, 7);
            class341.field5443.method2320(-6128, arg4);
            class341.field5443.method2359(arg3 - 805606289, arg1);
        }
        if (arg3 != 89) {
            field4035 = (class49) null;
        }
    }
}
