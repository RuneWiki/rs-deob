import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class226 {

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lua;")
    public static class113 field3901 = null;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Z")
    public static boolean field3894 = false;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lp;")
    private static class280 field3906 = class18.method140((byte) -120, "Please remove ");

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lp;")
    public static class280 field3905 = field3906;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Lp;")
    public static class280 field3903 = field3906;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1518(int arg0, int arg1) {
        field3904++;
        if (arg1 == 100 && class215.field3719 > 0) {
            byte[] var2 = class96.field1538[--class215.field3719];
            class96.field1538[class215.field3719] = null;
            return var2;
        } else if (arg1 == 5000 && class219.field3744 > 0) {
            byte[] var3 = class113.field1940[--class219.field3744];
            class113.field1940[class219.field3744] = null;
            return var3;
        } else if (arg1 == 30000 && class230.field4011 > 0) {
            byte[] var4 = class240.field4201[--class230.field4011];
            class240.field4201[class230.field4011] = null;
            return var4;
        } else {
            if (arg0 != 0) {
                method1521((byte) 25);
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLtg;I)Lde;")
    public static final class108 method1519(byte arg0, class180 arg1, int arg2) {
        field3897++;
        if (class122.method857(arg1, arg2, -19478)) {
            return arg0 == -120 ? class165.method1161(120) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method1520(int arg0) {
        field3906 = null;
        field3903 = null;
        if (arg0 != -21704) {
            method1520(29);
        }
        field3905 = null;
        field3901 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)I")
    public static final int method1521(byte arg0) {
        int var1 = -93 % ((7 - arg0) / 41);
        field3895++;
        class125.field2182 = 0;
        return class74.method555(-1);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIBI)V")
    public static final void method1522(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class250.field4378 < 100) {
            class113.method801((byte) 29);
        }
        field3899++;
        class151.method1061(arg2, arg1, arg0 + arg2, arg1 + arg4);
        if (class250.field4378 < 100) {
            int var5 = arg0 / 2 + arg2;
            byte var6 = 20;
            int var7 = arg4 / 2 + arg1 - var6 - 18;
            class151.method1057(arg2, arg1, arg0, arg4, 0);
            class151.method1060(var5 - 152, var7, 304, 34, 9179409);
            class151.method1060(var5 - 151, var7 + 1, 302, 32, 0);
            class151.method1057(var5 - 150, var7 + 2, class250.field4378 * 3, 30, 9179409);
            class151.method1057(var5 + (class250.field4378 * 3) - 150, var7 - -2, 300 - (class250.field4378 * 3), 30, 0);
            class54.field890.method531(class82.field1348, var5, var7 + var6, 16777215, -1);
            return;
        }
        class273.field4748 = (int) ((float) (arg4 * 2) / class49.field809);
        class92.field1488 = (int) ((float) (arg0 * 2) / class49.field809);
        int var8 = class266.field4684 - (int) ((float) arg0 / class49.field809);
        class36.field657 = class266.field4684 - ((int) ((float) arg0 / class49.field809));
        class221.field3830 = class47.field780 - ((int) ((float) arg4 / class49.field809));
        int var9 = class47.field780 - (int) ((float) arg4 / class49.field809);
        int var10 = class266.field4684 + ((int) ((float) arg0 / class49.field809));
        int var11 = class47.field780 + ((int) ((float) arg4 / class49.field809));
        class85.method610(arg2 + arg0, var10, var11, var9, arg2, (byte) -122, var8, arg1 + arg4, arg1);
        class53.method389(arg1 + arg4, var8, var10, arg1, var9, false, arg2, arg2 + arg0, var11);
        class182.method1269(var10, arg2 + arg0, arg1, arg1 + arg4, var8, var9, var11, true, arg2);
        if (class108.field1787 > 0) {
            class108.field1787--;
        }
        if (arg3 > -33 || !field3894) {
            return;
        }
        int var12 = arg2 - (5 - arg0);
        int var13 = arg4 + arg1 - 8;
        class101.field1651.method525(class30.method266(new class280[] { class132.field2356, class249.method1685((byte) -76, class189.field3316) }, (byte) -87), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var16 = 16776960;
        if (var15 > 65536) {
            var16 = 16711680;
        }
        class101.field1651.method525(class30.method266(new class280[] { class211.field3629, class249.method1685((byte) 94, var15), class260.field4600 }, (byte) -87), var12, var17, var16, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static final void method1523(byte arg0) {
        int var1 = 37 % ((arg0 + 12) / 49);
        field3902++;
        class124.field2174++;
        class34.field627.method551(200, true);
        class34.field627.method214(-3, class238.field4128);
    }
}
