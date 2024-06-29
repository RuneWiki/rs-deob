import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class209 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "[I")
    private int[] field2944;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field2943 = 0;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2948;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V")
    public static void method1438(boolean arg0) {
        if (arg0) {
            method1438(false);
        }
        field2948 = null;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "([I)V")
    public class209(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field2944 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2944[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2944[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field2944[var5 + var5] = arg0[var4];
            this.field2944[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIB)V")
    public static final void method1439(boolean arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            class74.field942 = class9.method151(arg1, class275.field4077 * 2, 65535, class259.field3819, class267.field3963, class270.field4004);
        } else {
            if (arg0) {
                class74.field942 = class9.method151(0, 0, 65535, class259.field3819, class267.field3963, class270.field4004);
                class74.field942.method138(0);
                class365 var3 = class378.method2393(class385.field5628, (byte) 91, 0, class359.field5224);
                class85 var4 = class74.field942.method122(var3, class144.method993(class257.field3813, class359.field5224, 0), true);
                class76.method536(true, class196.field2755.method2543(false, class153.field2073), false, var4);
                class74.field942.method158();
                class422.method2602(false);
                class74.field942.method136(76);
            }
            try {
                class74.field942 = class9.method151(arg1, class275.field4077 * 2, arg2 ^ 0xFFFF000A, class259.field3819, class267.field3963, class270.field4004);
            } catch (Throwable var7) {
                class74.field942 = class9.method151(0, 0, 65535, class259.field3819, class267.field3963, class270.field4004);
                arg1 = 0;
            }
        }
        field2946++;
        if (arg2 != -11) {
            field2948 = null;
        }
        if (class74.field942.method86()) {
            class161 var5 = class74.field942.method99(134217728);
            class74.field942.method127(var5);
        }
        class118.field1594 = arg1;
        class175.method1210(true);
        if (!class74.field942.method78()) {
            client.field3883 = 1;
        }
        class74.field942.method87(client.field3883);
        class74.field942.method111(0);
        class444.field6476 = class74.field942.method84();
        class282.field4146 = class74.field942.method84();
        int var6 = (int) ((double) class195.field2745 * 34.46D);
        if (class74.field942.method167()) {
            var6 += 128;
        }
        class74.field942.method93(50, var6);
        class74.field942.method79(!class231.field3482);
        if (class74.field942.method117()) {
            class419.method2592(32, class436.field6366);
        }
        class345.field5075 = !class163.method1082((byte) 95);
        class86.method584((byte) 30, class78.field984 >> 3, class195.field2745 >> 3, class74.field942);
        class365.method2329(126);
        class175.field2399 = false;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)I")
    public final int method1440(int arg0, byte arg1) {
        field2945++;
        if (arg1 >= -102) {
            field2948 = null;
        }
        int var3 = (this.field2944.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field2944[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2944[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLat;)V")
    public static final void method1441(byte arg0, class256 arg1) {
        field2947++;
        if (arg1.field3764.length - arg1.field3762 < 1) {
            return;
        }
        int var2 = arg1.method1738((byte) -24);
        if (var2 < 0 || var2 > 1 || (arg1.field3764.length - arg1.field3762) < 2) {
            return;
        }
        if (arg0 != 2) {
            method1439(false, -64, (byte) 51);
        }
        int var3 = arg1.method1767(arg0 + 1930493574);
        if ((var3 * 6) != (arg1.field3764.length - arg1.field3762)) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field3762 >= arg1.field3764.length) {
                            return;
                        }
                        var4 = arg1.method1767(arg0 ^ 0x7310FE8A);
                        var5 = arg1.method1746(20972);
                    } while (var4 >= class447.field6540.length);
                } while (!class36.field512[var4]);
            } while (class55.method420(var4, 31849).field6477 == '1' && (var5 < -1 || var5 > 1));
            class447.field6540[var4] = var5;
        }
    }
}
