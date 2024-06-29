import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class153 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field2439 = 100;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lok;")
    public static class41 field2443 = class137.method956("cross", 45);

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field2442 = 0;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Z")
    public static boolean field2447;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[[[I")
    public static int[][][] field2441;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Lp;", line = 11)
    public static final class111 method1085(int arg0) {
        field2446++;
        if (arg0 != -197) {
            return (class111) null;
        }
        try {
            return (class111) Class.forName("me").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 62)
    public static void method1086(int arg0) {
        int var1 = 72 % ((arg0 - 67) / 45);
        field2443 = null;
        field2441 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V", line = 74)
    public static final void method1087(byte arg0, int arg1) {
        class22.field330.method138(arg1, 0);
        if (arg0 < -70) {
            field2444++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V", line = 106)
    public static final void method1088(int arg0) {
        class252 var1 = class43.field679;
        synchronized (class43.field679) {
            class269.field4349 = class110.field1553;
            class78.field1154++;
            class129.field1929 = class185.field3022;
            class53.field789 = class67.field1017;
            class95.field1416 = class208.field3366;
            class151.field2358 = class302.field4890;
            class245.field3941 = class139.field2139;
            class63.field931 = class217.field3486;
            class208.field3366 = arg0;
        }
        field2445++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Lok;Z)[Lok;", line = 132)
    public static final class41[] method1089(class41[] arg0, boolean arg1) {
        class41[] var2 = new class41[5];
        if (!arg1) {
            field2443 = (class41) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class187.method1346(new class41[] { class1.method4(var3, (byte) 19), class144.field2200 }, 0);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class187.method1346(new class41[] { var2[var3], arg0[var3] }, 0);
            }
        }
        field2440++;
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)I", line = 160)
    public static final int method1090(int arg0, int arg1) {
        int var2 = 52 % ((arg0 + 17) / 56);
        field2437++;
        return arg1 == 16711935 ? -1 : class132.method927(860920833, arg1);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lok;I)Z", line = 172)
    public static final boolean method1091(class41 arg0, int arg1) {
        field2450++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class118.field1741; var2++) {
            if (arg0.method306(class78.field1147[var2], 27080)) {
                return true;
            }
        }
        if (arg0.method306(class62.field913.field3933, 27080)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(BI)I", line = 200)
    public static final int method1092(byte arg0, int arg1) {
        if (arg0 > -116) {
            method1090(-91, -115);
        }
        field2438++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)Z", line = 228)
    public static final boolean method1093(int arg0, int arg1) {
        field2449++;
        if (arg0 >= -54) {
            field2439 = 31;
        }
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V", line = 240)
    public static final void method1094(int arg0) {
        if (arg0 != -221) {
            field2448 = 10;
        }
        if (!class251.field3993) {
            class296.field4780[0] = 1005;
            class306.field5129[0] = class95.field1417;
            class98.field1432 = 1;
            if (class9.field114 != 0) {
                class196.field3164 = class55.field805;
                class130.field1948 = class245.field3910;
            } else if (class95.field1416 == 0) {
                class130.field1948 = class53.field789;
                class196.field3164 = class129.field1929;
            } else {
                class130.field1948 = class245.field3941;
                class196.field3164 = class151.field2358;
            }
            class203.field3286[0] = class266.field4233;
        }
        if (class136.field2015 != -1) {
            class294.method2035(-1, class136.field2015);
        }
        for (int var1 = 0; var1 < class75.field1120; var1++) {
            if (class195.field3151[var1]) {
                class165.field2615[var1] = true;
            }
            class46.field733[var1] = class195.field3151[var1];
            class195.field3151[var1] = false;
        }
        class156.field2472 = -1;
        if (class166.field2625) {
            class86.field1266 = true;
        }
        class64.field942 = null;
        field2451++;
        class161.field2552 = -1;
        class228.field3641 = class18.field234;
        if (class136.field2015 != -1) {
            class75.field1120 = 0;
            class264.method1872(6266, 0, class14.field182, -1, class136.field2015, class188.field3055, 0, 0, 0);
        }
        if (class166.field2625) {
            class190.method1366();
        } else {
            class54.method382();
        }
        class92.method661(-111);
        if (class251.field3993) {
            class14.method66((byte) -21);
        } else if (class156.field2472 != -1) {
            class64.method445(class156.field2472, true, class161.field2552);
        }
        if (class256.field4107 == 3) {
            for (int var2 = 0; var2 < class75.field1120; var2++) {
                if (class46.field733[var2]) {
                    if (class166.field2625) {
                        class190.method1370(class237.field3804[var2], class92.field1353[var2], class201.field3212[var2], class62.field904[var2], 16711935, 128);
                    } else {
                        class54.method365(class237.field3804[var2], class92.field1353[var2], class201.field3212[var2], class62.field904[var2], 16711935, 128);
                    }
                } else if (class165.field2615[var2]) {
                    if (class166.field2625) {
                        class190.method1370(class237.field3804[var2], class92.field1353[var2], class201.field3212[var2], class62.field904[var2], 16711680, 128);
                    } else {
                        class54.method365(class237.field3804[var2], class92.field1353[var2], class201.field3212[var2], class62.field904[var2], 16711680, 128);
                    }
                }
            }
        }
        class118.method847(class62.field913.field4311, class55.field807, -10, class140.field2163, class62.field913.field4280);
        class140.field2163 = 0;
    }
}
