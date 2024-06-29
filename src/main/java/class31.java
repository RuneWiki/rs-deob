import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class31 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lwa;")
    private static class75 field450 = class66.method560("Loaded interfaces", false);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lwa;")
    public static class75 field449 = field450;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
    public static int[] field453 = new int[5];

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lwa;")
    public static class75 field455 = class66.method560("um", false);

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lgb;")
    public static class158 field451 = new class158(64);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 5)
    public static void method208(byte arg0) {
        field449 = null;
        int var1 = 127 % ((arg0 + 22) / 50);
        field453 = null;
        field455 = null;
        field450 = null;
        field451 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILwa;III)V", line = 46)
    public static final void method209(int arg0, class75 arg1, int arg2, int arg3, int arg4) {
        field454++;
        if (arg2 != 25014) {
            return;
        }
        class262 var5 = class161.method1208(arg4, arg3, (byte) 24);
        if (var5 == null) {
            return;
        }
        if (var5.field4518 != null) {
            class24 var6 = new class24();
            var6.field302 = var5.field4518;
            var6.field315 = arg1;
            var6.field311 = arg0;
            var6.field301 = var5;
            class204.method1515(var6, (byte) 9);
        }
        boolean var7 = true;
        if (var5.field4462 > 0) {
            var7 = class74.method607(var5, (byte) -126);
        }
        if (!var7 || !class85.method691(arg0 - 1, -1, client.method1734(var5))) {
            return;
        }
        if (arg0 == 1) {
            class89.field1470.method87(65280, 128);
            class41.field662++;
            class89.field1470.method510(arg4, 120);
            class89.field1470.method503(-597878072, arg3);
        }
        if (arg0 == 2) {
            class89.field1470.method87(65280, 62);
            class245.field4121++;
            class89.field1470.method510(arg4, 98);
            class89.field1470.method503(-597878072, arg3);
        }
        if (arg0 == 3) {
            class279.field4840++;
            class89.field1470.method87(65280, 37);
            class89.field1470.method510(arg4, 110);
            class89.field1470.method503(-597878072, arg3);
        }
        if (arg0 == 4) {
            class89.field1470.method87(arg2 ^ 0x9EB6, 183);
            class89.field1470.method510(arg4, 117);
            class69.field1191++;
            class89.field1470.method503(-597878072, arg3);
        }
        if (arg0 == 5) {
            class306.field5227++;
            class89.field1470.method87(65280, 226);
            class89.field1470.method510(arg4, -69);
            class89.field1470.method503(-597878072, arg3);
        }
        if (arg0 == 6) {
            class246.field4141++;
            class89.field1470.method87(65280, 115);
            class89.field1470.method510(arg4, -55);
            class89.field1470.method503(-597878072, arg3);
        }
        if (arg0 == 7) {
            class89.field1470.method87(65280, 158);
            class89.field1470.method510(arg4, -50);
            class89.field1470.method503(-597878072, arg3);
            class172.field2888++;
        }
        if (arg0 == 8) {
            class35.field523++;
            class89.field1470.method87(65280, 206);
            class89.field1470.method510(arg4, 96);
            class89.field1470.method503(-597878072, arg3);
        }
        if (arg0 == 9) {
            class230.field3903++;
            class89.field1470.method87(65280, 246);
            class89.field1470.method510(arg4, -124);
            class89.field1470.method503(arg2 ^ 0xDC5D7B7E, arg3);
        }
        if (arg0 == 10) {
            class91.field1502++;
            class89.field1470.method87(65280, 240);
            class89.field1470.method510(arg4, -56);
            class89.field1470.method503(arg2 ^ 0xDC5D7B7E, arg3);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lcb;I)I", line = 192)
    public static final int method210(class267 arg0, int arg1) {
        field448++;
        int var2 = 0;
        if (arg1 <= 45) {
            field455 = (class75) null;
        }
        if (arg0.method1908(class211.field3594, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class206.field3492, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class7.field90, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class2.field24, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class76.field1325, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class267.field4602, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class70.field1196, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class291.field4992, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class300.field5137, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class311.field5296, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class144.field2488, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class63.field1104, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class17.field223, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class78.field1342, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class87.field1446, (byte) -18)) {
            var2++;
        }
        if (arg0.method1908(class266.field4590, (byte) -18)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BZ)V", line = 278)
    public static final void method211(byte arg0, boolean arg1) {
        field452++;
        class290 var2 = (class290) class54.field890.method1250(true);
        if (arg0 < 16) {
            return;
        }
        while (var2 != null) {
            if (var2.field4975 != null) {
                class94.field1527.method1790(var2.field4975);
                var2.field4975 = null;
            }
            if (var2.field4978 != null) {
                class94.field1527.method1790(var2.field4978);
                var2.field4978 = null;
            }
            var2.method1527(-75);
            var2 = (class290) class54.field890.method1256((byte) -128);
        }
        if (!arg1) {
            return;
        }
        for (class290 var3 = (class290) class166.field2794.method1250(true); var3 != null; var3 = (class290) class166.field2794.method1256((byte) -124)) {
            if (var3.field4975 != null) {
                class94.field1527.method1790(var3.field4975);
                var3.field4975 = null;
            }
            var3.method1527(-60);
        }
        for (class290 var4 = (class290) class2.field18.method1001((byte) 33); var4 != null; var4 = (class290) class2.field18.method1009(-119)) {
            if (var4.field4975 != null) {
                class94.field1527.method1790(var4.field4975);
                var4.field4975 = null;
            }
            var4.method1527(-92);
        }
    }
}
