import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class310 {

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field4245 = 2;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[I")
    public static int[] field4243;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Lsk;", line = 3)
    public static final class369 method1961(int arg0, byte arg1) {
        field4249++;
        class190 var2 = class233.field3157;
        class369 var3;
        synchronized (class233.field3157) {
            var3 = (class369) class233.field3157.method1246((byte) -91, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class309.field4240.method1920(class83.method587((byte) 126, arg0), false, class279.method1711(arg1 - 1981540347, arg0));
        class369 var5 = new class369();
        var5.field5204 = arg0;
        if (var4 != null) {
            var5.method2363(0, new class371(var4));
        }
        if (arg1 != 35) {
            return null;
        }
        var5.method2367(10);
        if (!class436.field6253 && var5.field5169) {
            var5.field5210 = null;
            var5.field5181 = null;
        }
        if (var5.field5195) {
            var5.field5166 = false;
            var5.field5192 = 0;
        }
        class190 var6 = class233.field3157;
        synchronized (class233.field3157) {
            class233.field3157.method1247((long) arg0, (byte) 45, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 48)
    public static void method1962(int arg0) {
        field4243 = null;
        int var1 = 27 / ((-arg0 - 65) / 52);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZIIIZIZILjava/lang/String;JLjava/lang/String;)V", line = 64)
    public static final void method1963(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7, String arg8, long arg9, String arg10) {
        field4244++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class371 var14 = new class371(128);
        var14.method2396(10, 12450);
        var14.method2416(22064, (arg0 ? 4 : 0) | (arg4 ? 2 : 0) | (arg6 ? 1 : 0));
        var14.method2409(arg9, true);
        var14.method2386(var12[0], 19324);
        if (arg1 != -17576) {
            return;
        }
        var14.method2412(-116, arg10);
        var14.method2386(var12[1], 19324);
        var14.method2416(22064, class237.field3231);
        var14.method2396(arg5, 12450);
        var14.method2396(arg3, 12450);
        var14.method2386(var12[2], 19324);
        var14.method2416(22064, arg2);
        var14.method2416(22064, arg7);
        var14.method2386(var12[3], 19324);
        var14.method2380(class163.field2289, class184.field2577, arg1 + 1191);
        class371 var15 = new class371(350);
        var15.method2412(-79, arg8);
        int var16 = 8 - (class322.method2036(arg8, arg1 + 17534) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2396((int) (Math.random() * 255.0D), 12450);
        }
        var15.method2399(var12, 0);
        class442.field6400.field5273 = 0;
        class442.field6400.method2396(22, arg1 ^ 0xFFFF8BFA);
        class442.field6400.method2416(22064, var14.field5273 + var15.field5273 + 2);
        class442.field6400.method2416(22064, 563);
        class442.field6400.method2434(var14.field5258, 713288968, 0, var14.field5273);
        class442.field6400.method2434(var15.field5258, 713288968, 0, var15.field5273);
        class282.field3867 = 1;
        class165.field2352 = -3;
        class76.field1194 = 0;
        class221.field2961 = 0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Le;", line = 126)
    public static final class312 method1964(byte arg0, int arg1) {
        field4246++;
        class190 var2 = class26.field422;
        class312 var3;
        synchronized (class26.field422) {
            var3 = (class312) class26.field422.method1246((byte) -116, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class64.field994.method1920(arg1, false, 32);
        class312 var5 = new class312();
        if (var4 != null) {
            var5.method1981(new class371(var4), 20675);
        }
        var5.method1978((byte) 126);
        if (arg0 != 119) {
            field4248 = 85;
        }
        class190 var6 = class26.field422;
        synchronized (class26.field422) {
            class26.field422.method1247((long) arg1, (byte) 71, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 165)
    public static final void method1965(byte arg0) {
        class190 var1 = class62.field966;
        synchronized (class62.field966) {
            class62.field966.method1243(1000);
        }
        field4247++;
        class190 var2 = class362.field5084;
        synchronized (class362.field5084) {
            class362.field5084.method1243(1000);
            int var3 = -114 % ((arg0 + 86) / 32);
        }
    }
}
