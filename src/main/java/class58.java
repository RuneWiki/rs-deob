import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class58 {

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Lmb;")
    private static class132 field981 = class166.method1092("Loaded input handler", 113);

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lmb;")
    public static class132 field980 = field981;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lqg;")
    public static class181 field976;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
    public static final void method386(int arg0, int arg1) {
        if (arg0 != -19422) {
            method388(-22, -114L);
        }
        if (arg1 == -3) {
            class48.method321(class169.field3131, class59.field998, (byte) -122, class172.field3221);
        } else if (arg1 == -2) {
            class48.method321(class169.field3140, class23.field322, (byte) 25, class169.field3123);
        } else if (arg1 == -1) {
            class48.method321(class169.field3150, class59.field999, (byte) 110, class189.field3495);
        } else if (arg1 == 3) {
            class48.method321(class169.field3153, class133.field2503, (byte) -19, class169.field3128);
        } else if (arg1 == 4) {
            class48.method321(class169.field3135, class91.field1618, (byte) -118, class32.field501);
        } else if (arg1 == 5) {
            class48.method321(class169.field3133, class47.field815, (byte) -127, class198.field3676);
        } else if (arg1 == 6) {
            class48.method321(class169.field3160, class95.field1675, (byte) 40, class97.field1858);
        } else if (arg1 == 7) {
            class48.method321(class169.field3124, class125.field2326, (byte) -117, class136.field2564);
        } else if (arg1 == 8) {
            class48.method321(class169.field3159, class168.field3086, (byte) 41, class35.field563);
        } else if (arg1 == 9) {
            class48.method321(class169.field3157, class232.field4192, (byte) -122, class187.field3468);
        } else if (arg1 == 10) {
            class48.method321(class169.field3136, class48.field824, (byte) -123, class35.field572);
        } else if (arg1 == 11) {
            class48.method321(class169.field3164, class169.field3144, (byte) 117, class122.field2276);
        } else if (arg1 == 12) {
            class48.method321(class169.field3121, class134.field2525, (byte) -115, class9.field103);
        } else if (arg1 == 13) {
            class48.method321(class169.field3125, class59.field983, (byte) -4, class211.field3875);
        } else if (arg1 == 14) {
            class48.method321(class169.field3134, class190.field3507, (byte) -114, class102.field1913);
        } else if (arg1 == 16) {
            class48.method321(class169.field3119, class231.field4174, (byte) -121, class36.field587);
        } else if (arg1 == 17) {
            class48.method321(class169.field3129, class66.field1087, (byte) 23, class168.field3074);
        } else if (arg1 == 18) {
            class48.method321(class169.field3158, class24.field342, (byte) 114, class14.field196);
        } else if (arg1 == 19) {
            class48.method321(class125.field2338, class125.field2333, (byte) 50, class180.field3303);
        } else if (arg1 == 20) {
            class48.method321(class169.field3156, class59.field1017, (byte) -117, class15.field223);
        } else if (arg1 == 22) {
            class48.method321(class169.field3162, class144.field2692, (byte) 89, class195.field3631);
        } else if (arg1 == 23) {
            class48.method321(class169.field3132, class190.field3528, (byte) -119, class145.field2711);
        } else if (arg1 == 24) {
            class48.method321(class169.field3141, class128.field2369, (byte) -120, class243.field4452);
        } else if (arg1 == 25) {
            class48.method321(class169.field3155, class59.field985, (byte) 61, class128.field2383);
        } else if (arg1 == 26) {
            class48.method321(class169.field3138, class9.field95, (byte) -118, class106.field1978);
        } else if (arg1 == 27) {
            class48.method321(class169.field3126, class59.field1001, (byte) -123, class169.field3122);
        } else {
            class48.method321(class169.field3146, class59.field1011, (byte) 63, class198.field3677);
        }
        field979++;
        class2.method6(10, (byte) -123);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method387(byte arg0) {
        field981 = null;
        field976 = null;
        field980 = null;
        if (arg0 != -83) {
            method386(-127, 1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IJ)V")
    public static final void method388(int arg0, long arg1) {
        field978++;
        if (arg1 == 0L) {
            return;
        }
        if (client.field537 >= 100 && class154.field2806 != 1 || client.field537 >= 200) {
            class169.method1108(-100, class134.field2516, 0, class75.field1247);
            return;
        }
        class132 var3 = class164.method1057((byte) 11, arg1).method900(0);
        for (int var4 = 0; var4 < client.field537; var4++) {
            if (class137.field2575[var4] == arg1) {
                class169.method1108(-56, class187.method1197(new class132[] { var3, class141.field2637 }, arg0 - 224), 0, class75.field1247);
                return;
            }
        }
        for (int var5 = 0; var5 < class138.field2596; var5++) {
            if (class178.field3282[var5] == arg1) {
                class169.method1108(-62, class187.method1197(new class132[] { class65.field1079, var3, class118.field2246 }, -101), 0, class75.field1247);
                return;
            }
        }
        if (var3.method894((byte) -121, class210.field3854.field2877)) {
            class169.method1108(-92, class37.field610, 0, class75.field1247);
            return;
        }
        class192.field3585++;
        class68.field1136[client.field537] = var3;
        class137.field2575[client.field537] = arg1;
        class39.field637[client.field537] = 0;
        class88.field1542[client.field537] = class75.field1247;
        class60.field1019[client.field537] = 0;
        class113.field2183 = class13.field167;
        client.field537++;
        class64.field1054.method660(arg0, 3);
        class64.field1054.method709(-27341, arg1);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lwi;")
    public static final class243 method389(int arg0, int arg1) {
        class243 var2 = (class243) class202.field3715.method777(~arg0, (long) arg1);
        field977++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class64.field1057.method1079(class195.method1238(120, arg1), arg0 + 119, class106.method658(arg1, (byte) -127));
        class243 var4 = new class243();
        var4.field4402 = arg1;
        if (var3 != null) {
            var4.method1565(arg0 ^ 0x63, new class112(var3));
        }
        var4.method1561((byte) 83);
        if (var4.field4423 != -1) {
            var4.method1553(method389(0, var4.field4406), method389(0, var4.field4423), -1);
        }
        if (var4.field4428 != -1) {
            var4.method1559(method389(0, var4.field4451), method389(0, var4.field4428), arg0 ^ 0xF60);
        }
        if (!class75.field1252 && var4.field4440) {
            var4.field4448 = null;
            var4.field4394 = null;
            var4.field4399 = class132.field2455;
            var4.field4405 = false;
            var4.field4391 = 0;
        }
        class202.field3715.method774((long) arg1, var4, arg0);
        return var4;
    }
}
