import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class210 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Ldc;")
    private static class37 field3934 = class185.method1233((byte) 86, "Please subscribe)1 or use a different world)3");

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[Ldf;")
    public static class40[] field3940 = new class40[50];

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "Ldc;")
    public static class37 field3938 = class185.method1233((byte) 86, "<col=ff3000>");

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field3942 = 20;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Ldc;")
    public static class37 field3944 = class185.method1233((byte) 86, "event_opbase");

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Ldc;")
    public static class37 field3945 = field3934;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method1394(byte arg0, int arg1) {
        field3935++;
        if (arg0 >= -114) {
            return null;
        } else if (arg1 == 100 && class228.field4189 > 0) {
            byte[] var2 = class240.field4411[--class228.field4189];
            class240.field4411[class228.field4189] = null;
            return var2;
        } else if (arg1 == 5000 && class215.field4014 > 0) {
            byte[] var3 = class26.field457[--class215.field4014];
            class26.field457[class215.field4014] = null;
            return var3;
        } else if (arg1 == 30000 && class81.field1435 > 0) {
            byte[] var4 = class91.field1572[--class81.field1435];
            class91.field1572[class81.field1435] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLmf;)V")
    public static final void method1395(byte arg0, class136 arg1) {
        if (arg0 == 29) {
            field3941++;
            if (class80.field1410 == arg1.field2654) {
                class211.field3948[arg1.field2588] = true;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Ldc;")
    public static final class37 method1396(int arg0, int arg1) {
        field3936++;
        if (arg0 < 100000) {
            return class80.method548(new class37[] { class112.field1974, class151.method1034((byte) -9, arg0), class123.field2204 }, arg1 + 19937);
        } else if (arg0 < 10000000) {
            return class80.method548(new class37[] { class60.field1119, class151.method1034((byte) -9, arg0 / 1000), class99.field1725, class123.field2204 }, -118);
        } else if (arg1 == -19978) {
            return class80.method548(new class37[] { class237.field4308, class151.method1034((byte) -9, arg0 / 1000000), class3.field22, class123.field2204 }, arg1 + 19867);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Leg;B)V")
    public static final void method1397(class51 arg0, byte arg1) {
        class166.method1115(200000, arg0, true);
        field3937++;
        if (arg1 > -87) {
            method1394((byte) -31, -6);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIILia;IJ)Z")
    public static final boolean method1398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class88 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class92.method603(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lwa;IIB)Lng;")
    public static final class148 method1399(class238 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 <= 21) {
            field3934 = null;
        }
        field3939++;
        return class192.method1278(arg0, 0, arg2, arg1) ? class114.method800((byte) -106) : null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BIIIII)V")
    public static final void method1400(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -51) {
            return;
        }
        if (arg3 <= class199.field3712 && arg2 >= class198.field3697) {
            boolean var6;
            if (arg5 < class29.field536) {
                arg5 = class29.field536;
                var6 = false;
            } else if (class82.field1458 >= arg5) {
                var6 = true;
            } else {
                arg5 = class82.field1458;
                var6 = false;
            }
            boolean var7;
            if (arg4 < class29.field536) {
                var7 = false;
                arg4 = class29.field536;
            } else if (class82.field1458 < arg4) {
                var7 = false;
                arg4 = class82.field1458;
            } else {
                var7 = true;
            }
            if (arg3 < class198.field3697) {
                arg3 = class198.field3697;
            } else {
                class29.method242(arg5, (byte) -30, arg1, class11.field156[arg3++], arg4);
            }
            if (arg2 > class199.field3712) {
                arg2 = class199.field3712;
            } else {
                class29.method242(arg5, (byte) -30, arg1, class11.field156[arg2--], arg4);
            }
            if (var7 && var6) {
                for (int var8 = arg3; var8 <= arg2; var8++) {
                    int[] var9 = class11.field156[var8];
                    var9[arg4] = var9[arg5] = arg1;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg2; var11++) {
                    class11.field156[var11][arg4] = arg1;
                }
            } else if (var6) {
                for (int var10 = arg3; var10 <= arg2; var10++) {
                    class11.field156[var10][arg5] = arg1;
                }
            }
        }
        field3943++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1401(int arg0) {
        field3934 = null;
        field3944 = null;
        field3940 = null;
        field3945 = null;
        field3938 = null;
        if (arg0 != -30192) {
            method1397(null, (byte) 12);
        }
    }
}
