import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class91 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lei;")
    public static class195 field1268 = new class195();

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lwm;")
    public static class152 field1271 = class157.method1048("Okay", 123);

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lwm;")
    public static class152 field1277 = class157.method1048("Cache:", 112);

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field1273 = 0;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lwm;")
    public static class152 field1276 = class157.method1048(" weitere Optionen", 119);

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lwm;")
    private static class152 field1279 = class157.method1048("Loading title screen )2 ", 127);

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lwm;")
    public static class152 field1275 = field1279;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V", line = 10)
    public static final void method595(int arg0, int arg1) {
        field1269++;
        class303 var2 = class90.method589(false, arg1, 4);
        var2.method2114((byte) 124);
        int var3 = -97 / ((arg0 + 53) / 54);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 23)
    public static void method596(byte arg0) {
        field1276 = null;
        field1279 = null;
        field1268 = null;
        field1275 = null;
        if (arg0 >= 30) {
            field1277 = null;
            field1271 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V", line = 38)
    public static final void method597(byte arg0) {
        if (arg0 != 49) {
            field1271 = (class152) null;
        }
        field1272++;
        class284.field4831.method1619(11300);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Lpl;", line = 49)
    public static final class193 method598(int arg0, int arg1) {
        field1270++;
        class193 var2 = (class193) class156.field2473.method1663((long) arg1, (byte) 127);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -1) {
            method595(-8, 18);
        }
        byte[] var3 = class140.field2141.method1381(client.method1757(arg0 - 1799, arg1), class227.method1560(false, arg1), 0);
        class193 var4 = new class193();
        if (var3 != null) {
            var4.method1292(new class291(var3), (byte) -115);
        }
        class156.field2473.method1662(var4, (long) arg1, -126);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BII)Lwm;", line = 91)
    public static final class152 method599(byte arg0, int arg1, int arg2) {
        if (arg0 != -90) {
            method596((byte) -91);
        }
        field1267++;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class203.field3288;
        } else if (var3 < -6) {
            return class60.field913;
        } else if (var3 < -3) {
            return class184.field2921;
        } else if (var3 < 0) {
            return class201.field3246;
        } else if (var3 > 9) {
            return class110.field1556;
        } else if (var3 > 6) {
            return class148.field2273;
        } else if (var3 <= 3) {
            return var3 > 0 ? class235.field3850 : class324.field5654;
        } else {
            return class275.field4704;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V", line = 137)
    public static final void method600(int arg0, int arg1) {
        class37.field607.method1617(arg1, 50);
        field1274++;
        if (arg0 == 27934) {
            class211.field3425.method1617(arg1, arg0 - 27884);
        }
    }
}
