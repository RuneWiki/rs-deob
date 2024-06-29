import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class481 {

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "Ljb;")
    public static class493 field6799 = null;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field6800 = 0;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "[J")
    public static long[] field6803 = new long[100];

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "Lg;")
    public static class153 field6798 = new class153(2, 2);

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "Lqfa;")
    public static class98 field6804 = new class98(75, 12);

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZ[B)V", line = 5)
    public static final void method2870(int arg0, boolean arg1, byte[] arg2) {
        int var3 = 20 / ((arg0 - 60) / 36);
        field6797++;
        if (class56.field685 == null) {
            class56.field685 = new class675(20000);
        }
        class56.field685.method3748(true, arg2, arg2.length, 0);
        if (!arg1) {
            return;
        }
        class331.method2161(-99, class56.field685.field9154);
        class315.field4364 = new class287[class704.field9802];
        int var4 = 0;
        for (int var5 = class700.field9766; var5 <= class503.field7223; var5++) {
            class287 var6 = class233.method1502(-75, var5);
            if (var6 != null) {
                class315.field4364[var4++] = var6;
            }
        }
        class135.field1971 = false;
        class146.field2102 = class479.method2864((byte) -89);
        class56.field685 = null;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)V", line = 51)
    public static void method2871(boolean arg0) {
        field6798 = null;
        field6804 = null;
        if (arg0) {
            field6803 = null;
            field6799 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIILjava/lang/String;B)V", line = 64)
    public static final void method2872(int arg0, int arg1, int arg2, String arg3, byte arg4) {
        field6802++;
        class493 var5 = class323.method2083(arg0, (byte) 64, arg2);
        if (var5 == null || arg4 <= 117) {
            return;
        }
        if (var5.field7040 != null) {
            class357 var6 = new class357();
            var6.field5080 = arg3;
            var6.field5081 = arg1;
            var6.field5076 = var5.field7040;
            var6.field5082 = var5;
            class241.method1543(var6);
        }
        if (class222.field2897 != 10 || !client.method1950(var5).method2850(-125, arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class160.field2203++;
            class519 var7 = class357.method2293(class427.field5994, class679.field9328, (byte) 69);
            class280.method1831(var5.field6952, var7, arg2, 2, arg0);
            class151.method1027(var7, -24);
        }
        if (arg1 == 2) {
            class336.field4678++;
            class519 var8 = class357.method2293(class427.field5994, class64.field789, (byte) 125);
            class280.method1831(var5.field6952, var8, arg2, 2, arg0);
            class151.method1027(var8, -60);
        }
        if (arg1 == 3) {
            class243.field3243++;
            class519 var9 = class357.method2293(class427.field5994, class443.field6305, (byte) 118);
            class280.method1831(var5.field6952, var9, arg2, 2, arg0);
            class151.method1027(var9, -95);
        }
        if (arg1 == 4) {
            class473.field6711++;
            class519 var10 = class357.method2293(class427.field5994, class337.field4687, (byte) -73);
            class280.method1831(var5.field6952, var10, arg2, 2, arg0);
            class151.method1027(var10, -85);
        }
        if (arg1 == 5) {
            class509.field7287++;
            class519 var11 = class357.method2293(class427.field5994, class326.field4517, (byte) -49);
            class280.method1831(var5.field6952, var11, arg2, 2, arg0);
            class151.method1027(var11, -89);
        }
        if (arg1 == 6) {
            class588.field8285++;
            class519 var12 = class357.method2293(class427.field5994, class428.field5998, (byte) -78);
            class280.method1831(var5.field6952, var12, arg2, 2, arg0);
            class151.method1027(var12, -6);
        }
        if (arg1 == 7) {
            class476.field6755++;
            class519 var13 = class357.method2293(class427.field5994, class317.field4400, (byte) 66);
            class280.method1831(var5.field6952, var13, arg2, 2, arg0);
            class151.method1027(var13, -107);
        }
        if (arg1 == 8) {
            class263.field3788++;
            class519 var14 = class357.method2293(class427.field5994, class224.field3024, (byte) -115);
            class280.method1831(var5.field6952, var14, arg2, 2, arg0);
            class151.method1027(var14, -14);
        }
        if (arg1 == 9) {
            class344.field4845++;
            class519 var15 = class357.method2293(class427.field5994, class219.field2862, (byte) -83);
            class280.method1831(var5.field6952, var15, arg2, 2, arg0);
            class151.method1027(var15, -84);
        }
        if (arg1 == 10) {
            class593.field8353++;
            class519 var16 = class357.method2293(class427.field5994, class560.field7865, (byte) 125);
            class280.method1831(var5.field6952, var16, arg2, 2, arg0);
            class151.method1027(var16, -71);
        }
    }
}
