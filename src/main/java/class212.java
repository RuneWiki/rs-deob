import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class212 {

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "J")
    public long field3577 = 0L;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field3568 = 0;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3580 = "Checking for updates - ";

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "[I")
    public static int[] field3582 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public int field3570;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public int field3573;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public int field3574;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Ltb;")
    public class184 field3572;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Ltb;")
    public class184 field3575;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lcj;")
    public static class74 field3569;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method1417(byte arg0) {
        field3580 = null;
        field3569 = null;
        field3582 = null;
        int var1 = 75 / ((arg0 + 63) / 34);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(JZ)V")
    public static final void method1418(long arg0, boolean arg1) {
        field3576++;
        if (class241.field3970 == 1 || class241.field3970 == 5) {
            class177.method1178(arg0, 107);
        } else if (class241.field3970 == 2) {
            class219.method1453(-8918);
        } else {
            class57.method351(true);
        }
        if (!class248.field4074) {
            class275.field4399 = 1;
            class101.field1788[0] = 1006;
            class93.field1632[0] = class239.field3935;
            class291.field4653[0] = class198.field3200;
            class93.field1636[0] = "";
            if (class21.field334 != 0) {
                class199.field3266 = class295.field4696;
                class147.field2497 = class240.field3940;
            } else if (class100.field1717 == 0) {
                class199.field3266 = class48.field839;
                class147.field2497 = class256.field4182;
            } else {
                class147.field2497 = class160.field2668;
                class199.field3266 = class115.field2069;
            }
        }
        if (client.field4545 != -1) {
            class203.method1344(client.field4545, (byte) -115);
        }
        for (int var3 = 0; var3 < class140.field2406; var3++) {
            if (class23.field367[var3]) {
                class239.field3937[var3] = true;
            }
            class243.field3988[var3] = class23.field367[var3];
            class23.field367[var3] = false;
        }
        class262.field4275 = -1;
        class155.field2606 = null;
        class276.field4411 = null;
        class35.field509 = -1;
        class24.field378 = class266.field4301;
        if (client.field4545 != -1) {
            class140.field2406 = 0;
            class237.method1570(-113);
        }
        class283.method1838();
        class47.method297((byte) 125);
        if (class248.field4074) {
            if (class60.field1050) {
                class234.method1549((byte) 109);
            } else {
                class124.method853(-19);
            }
        } else if (class155.field2606 != null) {
            class165.method1107(class155.field2606, class21.field333, class134.field2315, 10);
        } else if (class262.field4275 != -1) {
            class165.method1107((class46) null, class262.field4275, class35.field509, 10);
        }
        int var4 = class248.field4074 ? -1 : class78.method504((byte) 90);
        if (var4 == -1) {
            var4 = class97.field1661;
        }
        class237.method1571((byte) -114, var4);
        if (class178.field2937 == 1) {
            class178.field2937 = 2;
        }
        if (class66.field1113 == 1) {
            class66.field1113 = 2;
        }
        if (class161.field2674 == 3) {
            for (int var5 = 0; var5 < class140.field2406; var5++) {
                if (class243.field3988[var5]) {
                    class283.method1853(class23.field364[var5], class88.field1575[var5], class223.field3754[var5], class176.field2884[var5], 16711935, 128);
                } else if (class239.field3937[var5]) {
                    class283.method1853(class23.field364[var5], class88.field1575[var5], class223.field3754[var5], class176.field2884[var5], 16711680, 128);
                }
            }
        }
        if (!arg1) {
            field3582 = null;
        }
        class196.method1291(1, class191.field3087, class273.field4378.field1397, class176.field2886, class273.field4378.field1458);
        class191.field3087 = 0;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static final void method1419(byte arg0) {
        field3579++;
        class21.field330 = new class60();
        if (arg0 < 22) {
            method1417((byte) -122);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZILdk;ILdk;)I")
    public static final int method1420(boolean arg0, int arg1, class236 arg2, int arg3, class236 arg4) {
        field3578++;
        if (arg3 == 1) {
            int var5 = arg2.field3981;
            int var6 = arg4.field3981;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class227.method1530(true, arg2.method1563((byte) -69).field624, arg4.method1563((byte) -72).field624, field3568);
        } else if (arg3 == 3) {
            if (arg2.field3894.equals("-")) {
                if (arg4.field3894.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field3894.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class227.method1530(true, arg2.field3894, arg4.field3894, field3568);
            }
        } else if (arg3 == 4) {
            if (arg2.method1603((byte) -73)) {
                return arg4.method1603((byte) -73) ? 0 : 1;
            } else if (arg4.method1603((byte) -73)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 5) {
            if (arg2.method1608(104)) {
                return arg4.method1608(110) ? 0 : 1;
            } else if (arg4.method1608(64)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 == 6) {
            if (arg2.method1609((byte) -16)) {
                return arg4.method1609((byte) -16) ? 0 : 1;
            } else if (arg4.method1609((byte) -16)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 != 15860) {
            return -111;
        } else if (arg3 != 7) {
            return arg2.field3895 - arg4.field3895;
        } else if (arg2.method1607(100)) {
            return arg4.method1607(100) ? 0 : 1;
        } else if (arg4.method1607(arg1 ^ 0x3D90)) {
            return -1;
        } else {
            return 0;
        }
    }
}
