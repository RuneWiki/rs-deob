import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class146 extends class163 {

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[B")
    public byte[] field2568;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "[[B")
    public static byte[][] field2574 = new byte[1000][];

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "[I")
    public static int[] field2578 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lgi;", line = 7)
    public static final class294 method1064(int arg0, int arg1) {
        field2572++;
        class294 var2 = (class294) class84.field1530.method1260(arg1 ^ 0xFFFFF1E4, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class237.field4043.method1016(5, 100, arg0);
        class294 var4 = new class294();
        if (arg1 != 3684) {
            method1067(-114);
        }
        if (var3 != null) {
            var4.method2061(-1, new class41(var3));
        }
        class84.field1530.method1259(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)I", line = 33)
    public static final int method1065(byte arg0, boolean arg1) {
        if (arg0 != -46) {
            method1064(-41, 69);
        }
        field2575++;
        long var2 = class224.method1536(false);
        for (class155 var4 = arg1 ? (class155) class172.field3052.method1743(true) : (class155) class172.field3052.method1742((byte) 115); var4 != null; var4 = (class155) class172.field3052.method1742((byte) 18)) {
            if ((var4.field2765 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field2765 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2895;
                    class97.field1741[var5] = class201.field3658[var5];
                    var4.method1199(21966);
                    return var5;
                }
                var4.method1199(21966);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([B)V", line = 76)
    public class146(byte[] arg0) {
        this.field2568 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)Z", line = 92)
    public static final boolean method1066(int arg0) {
        field2573++;
        try {
            if (class83.field1518 == 2) {
                if (class165.field2922 == null) {
                    class165.field2922 = class218.method1517(class137.field2391, class180.field3190, class308.field5297);
                    if (class165.field2922 == null) {
                        return false;
                    }
                }
                if (class196.field3587 == null) {
                    class196.field3587 = new class181(class161.field2865, class298.field5160);
                }
                if (class188.field3429.method1926(class165.field2922, class196.field3587, class111.field1934, 22050, -1)) {
                    class188.field3429.method1929(-445702042);
                    class188.field3429.method1950(16384, class121.field2129);
                    class188.field3429.method1955(true, class165.field2922, class99.field1771);
                    class165.field2922 = null;
                    class83.field1518 = 0;
                    class137.field2391 = null;
                    class196.field3587 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class188.field3429.method1944(13739);
            class83.field1518 = 0;
            class196.field3587 = null;
            class137.field2391 = null;
            class165.field2922 = null;
        }
        if (arg0 <= 2) {
            method1066(-125);
        }
        return false;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)Lab;", line = 150)
    public static final class290 method1067(int arg0) {
        field2570++;
        if (arg0 != 0) {
            field2574 = (byte[][]) ((byte[][]) null);
        }
        class290 var1;
        if (class253.field4323) {
            var1 = new class2(class142.field2486, class153.field2740, class13.field172[0], class307.field5283[0], class94.field1692[0], class62.field1093[0], class6.field92[0], class305.field5270);
        } else {
            var1 = new class232(class142.field2486, class153.field2740, class13.field172[0], class307.field5283[0], class94.field1692[0], class62.field1093[0], class6.field92[0], class305.field5270);
        }
        class183.method1343(arg0 + 255);
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lke;Lra;I)I", line = 168)
    public static final int method1068(class256 arg0, class41 arg1, int arg2) {
        field2571++;
        int var3 = arg1.field738;
        arg1.method339(arg2 ^ 0x66, arg0.field4384);
        arg1.field738 += class287.field4977.method1696(arg1.field738, arg0.field4380, arg0.field4384, arg1.field772, arg2, 8);
        return arg1.field738 - var3;
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V", line = 182)
    public static void method1069(int arg0) {
        if (arg0 != 0) {
            method1069(-128);
        }
        field2578 = null;
        field2574 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ZIIII)V", line = 194)
    public static final void method1070(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class253.field4323) {
            class60.method470(arg4, arg3, arg4 + arg2, arg1 + arg3);
            class60.method482(arg4, arg3, arg2, arg1, 0);
        } else {
            class178.method1302(arg4, arg3, arg2 + arg4, arg1 + arg3);
            class178.method1299(arg4, arg3, arg2, arg1, 0);
        }
        field2576++;
        if (class50.field908 < 100) {
            return;
        }
        if (class156.field2774 == null || class156.field2774.field2343 != arg2 || class156.field2774.field2348 != arg1) {
            class227 var5 = new class227(arg2, arg1);
            class178.method1287(var5.field3921, arg2, arg1);
            class94.method685(class154.field2753, 0, 0, class40.field731, 0, arg2, arg1, 99, 0);
            if (class253.field4323) {
                class156.field2774 = new class87(var5);
            } else {
                class156.field2774 = var5;
            }
            if (class253.field4323) {
                class178.field3146 = null;
            } else {
                class108.field1920.method1182(48);
            }
        }
        class156.field2774.method646(arg4, arg3);
        int var6 = class280.field4870 * arg2 / class40.field731 + arg4;
        int var7 = arg3 + (class159.field2840 * arg1 / class154.field2753);
        int var8 = class39.field717 * arg2 / class40.field731;
        int var9 = class310.field5348 * arg1 / class154.field2753;
        int var10 = 16711680;
        if (class206.field3735 == 1) {
            var10 = 16777215;
        }
        if (arg0) {
            method1068((class256) null, (class41) null, -67);
        }
        if (class253.field4323) {
            class60.method467(var6, var7, var8, var9, var10, 128);
            class60.method474(var6, var7, var8, var9, var10);
        } else {
            class178.method1290(var6, var7, var8, var9, var10, 128);
            class178.method1301(var6, var7, var8, var9, var10);
        }
        if (class288.field4986 <= 0 || class288.field4986 % 10 >= 5) {
            return;
        }
        for (class80 var11 = (class80) class247.field4211.method1270((byte) -121); var11 != null; var11 = (class80) class247.field4211.method1277(1)) {
            if (class73.field1331 == var11.field1494) {
                int var12 = var11.field1484 * arg2 / class40.field731 + arg4;
                int var13 = arg3 + (var11.field1485 * arg1 / class154.field2753);
                if (class253.field4323) {
                    class60.method482(var12 - 2, var13 + -2, 4, 4, 16776960);
                } else {
                    class178.method1299(var12 - 2, var13 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)I", line = 288)
    public static final int method1071(int arg0, int arg1) {
        if (class196.field3586 != null) {
            class196.field3586.method1627(118);
            class196.field3586 = null;
        }
        if (arg1 > -82) {
            method1065((byte) -82, false);
        }
        field2577++;
        class273.field4733++;
        if (class273.field4733 > 4) {
            class273.field4733 = 0;
            class182.field3229 = 0;
            return arg0;
        }
        if (class5.field89 == class320.field5490) {
            class320.field5490 = class68.field1259;
        } else {
            class320.field5490 = class5.field89;
        }
        class182.field3229 = 0;
        return -1;
    }
}
