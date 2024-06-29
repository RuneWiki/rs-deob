import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class167 {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lve;")
    public static class255 field2806 = class87.method607(102, "scrollen:");

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lve;")
    public static class255 field2810 = class87.method607(100, "blinken2:");

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field2812;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Lrg;")
    public static class88 field2814;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "[B")
    public byte[] field2804;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[B")
    public byte[] field2805;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "[Lpc;")
    public static class83[] field2813;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1213(int arg0) {
        class181 var1 = new class181();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class185.field2982[var2][var3] = var1;
            }
        }
        field2802++;
        if (arg0 != 16777215) {
            field2810 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 45)
    public static void method1214(byte arg0) {
        field2814 = null;
        field2810 = null;
        field2813 = null;
        int var1 = 120 / ((arg0 - 22) / 62);
        field2806 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)Z", line = 67)
    public static final boolean method1215(byte arg0, int arg1) {
        if (arg0 >= -125) {
            field2810 = (class255) null;
        }
        field2807++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)Leg;", line = 82)
    public static final class289 method1216(int arg0, byte arg1) {
        field2808++;
        class289 var2 = (class289) class212.field3611.method558((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class100.field1700.method636(4, (byte) 61, arg0);
        class289 var4 = new class289();
        if (var3 != null) {
            var4.method2049(new class70(var3), -12, arg0);
        }
        int var5 = -6 % ((84 - arg1) / 34);
        class212.field3611.method555(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIII)V", line = 118)
    public static final void method1217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2816++;
        if (class73.field1205 < 100) {
            class274.method1921(arg1 ^ 0x8C110F);
        }
        if (class281.field4827) {
            class126.method938(arg2, arg3, arg0 + arg2, arg3 + arg4);
        } else {
            class175.method1258(arg2, arg3, arg2 + arg0, arg3 + arg4);
        }
        if (arg1 != 9179409) {
            return;
        }
        if (class73.field1205 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg3 - var5 - 18;
            int var7 = arg0 / 2 + arg2;
            if (class281.field4827) {
                class126.method936(arg2, arg3, arg0, arg4, 0);
                class126.method926(var7 - 152, var6, 304, 34, 9179409);
                class126.method926(var7 - 151, var6 + 1, 302, 32, 0);
                class126.method936(var7 - 150, var6 + 2, class73.field1205 * 3, 30, 9179409);
                class126.method936(class73.field1205 * 3 + (var7 - 150), var6 - -2, 300 - class73.field1205 * 3, 30, 0);
            } else {
                class175.method1249(arg2, arg3, arg0, arg4, 0);
                class175.method1253(var7 - 152, var6, 304, 34, 9179409);
                class175.method1253(var7 - 151, var6 + 1, 302, 32, 0);
                class175.method1249(var7 - 150, var6 + 2, class73.field1205 * 3, 30, 9179409);
                class175.method1249(class73.field1205 * 3 + (var7 - 150), var6 + 2, 300 - (class73.field1205 * 3), 30, 0);
            }
            class277.field4761.method497(class173.field2857, var7, var6 + var5, 16777215, -1);
            return;
        }
        class76.field1251 = (int) ((float) (arg0 * 2) / class59.field905);
        class277.field4745 = (int) ((float) (arg4 * 2) / class59.field905);
        class151.field2560 = class149.field2520 - ((int) ((float) arg4 / class59.field905));
        int var8 = class85.field1369 - ((int) ((float) arg0 / class59.field905));
        class120.field2002 = class85.field1369 - ((int) ((float) arg0 / class59.field905));
        int var9 = (int) ((float) arg0 / class59.field905) + class85.field1369;
        int var10 = class149.field2520 - (int) ((float) arg4 / class59.field905);
        int var11 = (int) ((float) arg4 / class59.field905) + class149.field2520;
        if (class281.field4827) {
            if (class254.field4283 == null || class254.field4283.field4619 != arg0 || class254.field4283.field4628 != arg4) {
                class254.field4283 = null;
                class254.field4283 = new class48(arg0, arg4);
            }
            class175.method1254(class254.field4283.field1344, arg0, arg4);
            class231.method1604(var10, 0, var9, var11, false, arg0, 0, arg4, var8);
            class154.method1137(var10, arg0, 0, var11, arg4, (byte) 105, 0, var9, var8);
            class210.method1508(var11, 0, var10, 116, var8, var9, arg4, 0, arg0);
            class254.field4283.method290(arg2, arg3);
        } else {
            class231.method1604(var10, arg2, var9, var11, false, arg0 + arg2, arg3, arg3 + arg4, var8);
            class154.method1137(var10, arg0 + arg2, arg2, var11, arg3 + arg4, (byte) -117, arg3, var9, var8);
            class210.method1508(var11, arg2, var10, 109, var8, var9, arg3 + arg4, arg3, arg0 + arg2);
        }
        if (class297.field5088 > 0) {
            class297.field5088--;
        }
        if (!class103.field1734) {
            return;
        }
        int var12 = arg0 + arg2 - 5;
        int var13 = arg3 + arg4 - 8;
        class102.field1719.method500(class3.method14(new class255[] { class242.field4064, class215.method1532(class59.field913, true) }, (byte) -123), var12, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var17 = var13 - 15;
        int var15 = 16776960;
        int var16 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var15 = 16711680;
        }
        class102.field1719.method500(class3.method14(new class255[] { class130.field2147, class215.method1532(var16, true), class82.field1330 }, (byte) -69), var12, var17, var15, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 228)
    public static final void method1218(String arg0, int arg1) {
        if (arg1 != 300) {
            method1217(-96, 52, -45, 63, -88);
        }
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field2803++;
        System.exit(1);
    }
}
