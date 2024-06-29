import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class170 {

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public int field2458 = class280.method1806((byte) 100);

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public int field2456 = class405.field5763;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Ljava/lang/String;")
    public String field2464;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Ljava/lang/String;")
    public String field2463;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljava/lang/String;")
    public String field2454;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljava/lang/String;")
    public String field2453;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lpr;")
    public static class379 field2459;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZBI)V")
    public static final void method1083(boolean arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            class69.field1165 = class207.method1358(class491.field6875.field3360 * 2, class166.field2390, -14968, 0, class142.field2194, class60.field1065);
        } else {
            if (arg0) {
                class69.field1165 = class207.method1358(0, class166.field2390, -14968, 0, class142.field2194, class60.field1065);
                class69.field1165.method1274(0);
                class483 var3 = class571.method3244(-32635, class176.field2518, 0, class385.field5162);
                class91 var4 = class69.field1165.method1348(var3, class38.method397(class645.field9371, class176.field2518, 0), true);
                class639.method3699(class443.field6309.method739(class173.field2491, 103), true, var4, (byte) 82);
                class312.method1950(false);
                class69.field1165.method1284((byte) -70);
            }
            try {
                class69.field1165 = class207.method1358(class491.field6875.field3360 * 2, class166.field2390, -14968, arg2, class142.field2194, class60.field1065);
                if (class69.field1165.method1310()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class64 var6;
                    if (var5) {
                        var6 = class69.field1165.method1359(146800640);
                    } else {
                        var6 = class69.field1165.method1359(104857600);
                    }
                    class69.field1165.method1296(var6);
                }
            } catch (Throwable var8) {
                arg2 = 0;
                class69.field1165 = class207.method1358(0, class166.field2390, -14968, 0, class142.field2194, class60.field1065);
            }
        }
        field2451++;
        if (arg1 >= -121) {
            return;
        }
        class103.field1570 = arg2;
        class278.method1794(-93);
        if (!class69.field1165.method1285()) {
            client.field3474 = 1;
        }
        class69.field1165.method1272(client.field3474);
        class69.field1165.method1280(0);
        class69.field1165.method1302(8);
        class333.field4459 = class69.field1165.method1318();
        class84.field1366 = class69.field1165.method1318();
        class75.method582(50);
        class69.field1165.method1364(!class491.field6875.field3375);
        if (class69.field1165.method1319()) {
            class263.method1718(0, class491.field6875.field3351);
        }
        class342.method2074(class69.field1165, class611.field8786 >> 3, (byte) 112, class32.field513 >> 3);
        class465.method2718(-8274);
        class293.field4032 = false;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public final void method1084(int arg0, int arg1, int arg2, String arg3, String arg4, String arg5, String arg6, int arg7) {
        this.field2458 = class280.method1806((byte) 97);
        field2455++;
        this.field2457 = arg7;
        this.field2456 = class405.field5763;
        this.field2452 = arg2;
        this.field2461 = arg1;
        this.field2454 = arg6;
        this.field2464 = arg5;
        this.field2453 = arg4;
        this.field2463 = arg3;
        int var9 = 11 / ((arg0 - 40) / 49);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZBILdba;I)V")
    public static final void method1085(int arg0, int arg1, boolean arg2, byte arg3, int arg4, class78 arg5, int arg6) {
        field2460++;
        if (class202.field2830 >= 50) {
            return;
        }
        int var7 = 59 % ((arg3 + 63) / 55);
        if (arg5 == null || arg5.field1280 == null || arg5.field1280.length <= arg4 || arg5.field1280[arg4] == null) {
            return;
        }
        int var8 = arg5.field1280[arg4][0];
        int var9 = var8 >> 8;
        int var10 = var8 >> 5 & 0x7;
        if (arg5.field1280[arg4].length > 1) {
            int var11 = (int) (Math.random() * (double) arg5.field1280[arg4].length);
            if (var11 > 0) {
                var9 = arg5.field1280[arg4][var11];
            }
        }
        int var12 = var8 & 0x1F;
        if (var12 == 0) {
            if (arg2) {
                class487.method2832(var10, 0, 0, var9, 255);
            }
        } else if (class491.field6875.field3354 != 0) {
            int var13 = arg6 - 64 >> 7;
            int var14 = arg0 - 64 >> 7;
            class233.field3289[class202.field2830++] = new class640((byte) 1, var9, var10, 0, 255, (arg1 << 24) + (var13 << 16) + (var14 << 8) + var12);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILqa;Lmc;)V")
    public static final void method1086(int arg0, class207 arg1, class114 arg2) {
        field2462++;
        if (arg0 != 0) {
            field2459 = null;
        }
        boolean var3 = class181.field2574.method868(arg2.field1807 | 0xFF000000, 107, arg2.field1861, arg2.field1809 ? class645.field9372.field2651 : null, arg2.field1867, arg1, arg2.field1785, arg2.field1787) == null;
        if (var3) {
            class425.field6034.method463(new class228(arg2.field1787, arg2.field1867, arg2.field1785, arg2.field1807 | 0xFF000000, arg2.field1861, arg2.field1809), -123);
            class403.method2407(arg2, arg0 - 9130);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method1087(int arg0) {
        field2459 = null;
        int var1 = -84 % ((arg0 - 26) / 44);
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class170(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6) {
        this.field2464 = arg6;
        this.field2457 = arg5;
        this.field2463 = arg2;
        this.field2452 = arg0;
        this.field2461 = arg1;
        this.field2454 = arg4;
        this.field2453 = arg3;
    }
}
