import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class587 extends class184 {

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[B")
    public byte[] field8323;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field8318 = 0;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Z")
    public static boolean field8325 = true;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field8324;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "[Lcha;")
    public static class218[] field8320;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[Ltaa;", line = 4)
    public static final class409[] method3393(byte arg0) {
        field8321++;
        return arg0 <= 59 ? null : new class409[] { class308.field4367, class296.field4207, class247.field3594 };
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 15)
    public static final void method3394(int arg0, int arg1) {
        class92.field1284 = arg1;
        field8322++;
        class654.field9174 = 2;
        long var2 = 0L;
        if (class72.field1015 == null) {
            class610.method3539(35, true);
        } else {
            class645 var4 = new class645(class442.method2745(class190.method1325(class72.field1015, (byte) -74), 118));
            long var5 = var4.method3744((byte) 105);
            class286.field4061 = var4.method3744((byte) 69);
            class112.method836("", true, arg0 ^ arg0, class195.method1357(95, var5));
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 41)
    public static void method3395(int arg0) {
        field8320 = null;
        if (arg0 != 8) {
            method3399((byte) -103);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BIB)[B", line = 53)
    public static final byte[] method3396(int arg0, byte[] arg1, int arg2, byte arg3) {
        field8319++;
        byte[] var4;
        if (arg0 <= 0) {
            var4 = arg1;
        } else {
            var4 = new byte[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                var4[var5] = arg1[arg0 + var5];
            }
        }
        class355 var6 = new class355();
        var6.method2223(0);
        var6.method2218(255, (long) (arg2 * 8), var4);
        byte[] var7 = new byte[64];
        if (arg3 < 67) {
            return null;
        } else {
            var6.method2221(var7, 0, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBLrg;)Ljava/lang/String;", line = 86)
    public static final String method3397(int arg0, byte arg1, class645 arg2) {
        field8316++;
        try {
            if (arg1 > -84) {
                method3395(-16);
            }
            int var3 = arg2.method3728((byte) 88);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field9084 += class69.field979.method3928(var3, arg2.field9084, 0, 1, var4, arg2.field9068);
            return class46.method332(var3, 0, 0, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIBIIII)V", line = 124)
    public static final void method3398(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field8317++;
        for (class291 var7 = (class291) client.field4276.method1615((byte) 96); var7 != null; var7 = (class291) client.field4276.method1625(arg2 - 177)) {
            if (class357.field5189 >= var7.field4161) {
                var7.method385((byte) -41);
            } else {
                class112.method835(arg5 >> 1, (var7.field4159 << 9) + 256, 112, arg6, var7.field4157, arg3 >> 1, (var7.field4158 << 9) + 256, var7.field4163 * 2, arg0);
                class298.field4225.method544(arg1 + class340.field4942[0], var7.field4162, 0, (byte) 74, class340.field4942[1] + arg4, var7.field4169 | 0xFF000000);
            }
        }
        if (arg2 != 85) {
            field8318 = 53;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V", line = 152)
    public static final void method3399(byte arg0) {
        field8324++;
        for (class457 var1 = (class457) class325.field4637.method1624(121); var1 != null; var1 = (class457) class325.field4637.method1624(84)) {
            class579.method3364(var1, -107);
        }
        if (arg0 != -69) {
            field8318 = 31;
        }
        int var2;
        int var3;
        if (class63.field916.field10204.method368(arg0 + 17572) == 1) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class700.field9654;
            var3 = class700.field9654;
        }
        client.method1903();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1898();
            client.method1904(var4);
            client.method1902(var4);
        }
        client.method1895();
        client.method1891();
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V", line = 195)
    public class587(byte[] arg0) {
        this.field8323 = arg0;
    }
}
