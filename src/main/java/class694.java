import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class694 {

    @OriginalMember(owner = "client!aga", name = "p", descriptor = "Z")
    public boolean field9687 = false;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "Loo;")
    private class652 field9674 = new class652(64);

    @OriginalMember(owner = "client!aga", name = "t", descriptor = "Loo;")
    public class652 field9691 = new class652(500);

    @OriginalMember(owner = "client!aga", name = "w", descriptor = "Loo;")
    public class652 field9694 = new class652(30);

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "Loo;")
    public class652 field9697 = new class652(50);

    @OriginalMember(owner = "client!aga", name = "k", descriptor = "Lwia;")
    public class791 field9682;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "Z")
    public boolean field9681;

    @OriginalMember(owner = "client!aga", name = "l", descriptor = "Lwia;")
    private class791 field9683;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "Ljava/lang/String;")
    public static String field9678 = "";

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "Lbu;")
    public static class21 field9679 = new class21(26, -2);

    @OriginalMember(owner = "client!aga", name = "r", descriptor = "[I")
    public static int[] field9689 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!aga", name = "q", descriptor = "I")
    public static int field9688 = -1;

    @OriginalMember(owner = "client!aga", name = "s", descriptor = "Loo;")
    public static class652 field9690 = new class652(64);

    @OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
    public static int field9696 = 0;

    @OriginalMember(owner = "client!aga", name = "v", descriptor = "Lbu;")
    public static class21 field9693 = new class21(21, 6);

    @OriginalMember(owner = "client!aga", name = "C", descriptor = "Z")
    public static boolean field9700 = true;

    @OriginalMember(owner = "client!aga", name = "B", descriptor = "Lne;")
    public static class336 field9699 = new class336("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field9672;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field9673;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    public static int field9676;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
    public static int field9684;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "I")
    public static int field9685;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!aga", name = "x", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
    public int field9698;

    @OriginalMember(owner = "client!aga", name = "u", descriptor = "Ljga;")
    public static class746 field9692;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZB)V", line = 11)
    private final void method3910(boolean arg0, byte arg1) {
        if (arg1 <= 82) {
            field9690 = null;
        }
        field9686++;
        if (arg0 != this.field9687) {
            this.field9687 = arg0;
            this.method3915(21);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V", line = 27)
    public final void method3911(int arg0, int arg1) {
        field9673++;
        this.field9698 = arg1;
        class652 var3 = this.field9691;
        synchronized (this.field9691) {
            this.field9691.method3735(2);
        }
        class652 var4 = this.field9694;
        synchronized (this.field9694) {
            this.field9694.method3735(arg0 ^ 0x3);
        }
        class652 var5 = this.field9697;
        synchronized (this.field9697) {
            this.field9697.method3735(arg0 + arg0);
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(ZB)V", line = 48)
    public final void method3912(boolean arg0, byte arg1) {
        if (arg1 >= -86) {
            this.method3918(15, (byte) -102);
        }
        field9680++;
        if (this.field9681 != arg0) {
            this.field9681 = arg0;
            this.method3915(21);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)I", line = 64)
    public static final int method3913(boolean arg0) {
        field9677++;
        if (class21.field353.field10085.method156(-74) == 0) {
            for (int var1 = 0; var1 < class310.field4431; var1++) {
                if (class354.field4983[var1].method1489(122) == 's' || class354.field4983[var1].method1489(65) == 'S') {
                    class21.field353.method4080(true, class21.field353.field10085, 1);
                    class349.field4878 = true;
                    break;
                }
            }
        }
        if (class53.field643 == class433.field5869) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class459.method2731(119);
            if (class729.field10084 == 0L) {
                class729.field10084 = var4;
            }
            if (var3 > 16384 && var4 - class729.field10084 < 5000L) {
                if ((var4 - class662.field9219) > 1000L) {
                    System.gc();
                    class662.field9219 = var4;
                }
                return 0;
            }
        }
        if (class53.field647 == class433.field5869) {
            if (class639.field8960 == null) {
                class639.field8960 = new class537(class65.field783, class785.field10777, class656.field9146, class380.field5259);
            }
            if (!class639.field8960.method3224((byte) -89)) {
                return 0;
            }
            class716.method4020(true, (byte) 47, null, 0);
            class216.field3357 = !class173.method1261(89);
            class7.field70 = class75.method592(1000000, false, class216.field3357 ? 34 : 32, 1);
            class304.field4387 = class75.method592(1000000, false, 33, 1);
            class124.field1928 = class75.method592(1000000, false, 13, 1);
        }
        if (class53.field648 == class433.field5869) {
            boolean var6 = class304.field4387.method4350(80);
            int var7 = class695.field9712[33].method3474((byte) -57);
            int var8 = var7 + class695.field9712[class216.field3357 ? 34 : 32].method3474((byte) -57);
            int var9 = var8 + class695.field9712[13].method3474((byte) -57);
            int var10 = var9 + (var6 ? 100 : class304.field4387.method4347(-25));
            if (var10 != 400) {
                return var10 / 4;
            }
            class316.field4490 = class7.field70.method4361((byte) -77);
            class614.field8622 = class304.field4387.method4361((byte) -21);
            class6.method37(false, class7.field70);
            int var11 = class21.field353.field10103.method287(-83);
            class46.field574 = new class262(class60.field734, class140.field2081, class304.field4387);
            int[] var12 = class46.field574.method1700(var11, (byte) -68);
            if (var12.length == 0) {
                var12 = class46.field574.method1700(0, (byte) 98);
            }
            class306 var13 = new class306(class7.field70, class124.field1928);
            if (var12.length > 0) {
                class391.field5388 = new class130[var12.length];
                for (int var14 = 0; var14 < class391.field5388.length; var14++) {
                    class391.field5388[var14] = new class668(class46.field574.method1702(var12[var14], (byte) -117), var13);
                }
            }
        }
        if (class53.field650 == class433.field5869) {
            class108.method831(21322, class92.method682(false), class7.field70, class124.field1928);
        }
        if (class53.field651 == class433.field5869) {
            int var15 = class402.method2474(2);
            int var16 = class616.method3566(2);
            if (var16 > var15) {
                return var15 * 100 / var16;
            }
        }
        if (class53.field652 == class433.field5869) {
            if (class391.field5388 != null && class391.field5388.length > 0) {
                if (class391.field5388[0].method970(arg0) < 100) {
                    return 0;
                }
                if (class391.field5388.length > 1 && class46.field574.method1705((byte) 14) && class391.field5388[1].method970(true) < 100) {
                    return 0;
                }
            }
            class455.method2711(class37.field491, -89);
            class262.method1699(class37.field491, (byte) 106);
            class225.method1539(false, 1);
        }
        if (class53.field653 == class433.field5869) {
            for (int var17 = 0; var17 < 4; var17++) {
                class346.field4838[var17] = class103.method726(class768.field10571, -114, class350.field4898);
            }
        }
        if (class53.field654 == class433.field5869) {
            class152.field2163 = class75.method592(1000000, false, 8, 1);
            class22.field364 = class75.method592(1000000, false, 0, 1);
            class525.field7435 = class75.method592(1000000, false, 1, 1);
            class564.field8000 = class75.method592(1000000, false, 2, 1);
            class588.field8298 = class75.method592(1000000, false, 3, 1);
            class602.field8436 = class75.method592(1000000, false, 4, 1);
            class168.field2640 = class75.method592(1000000, true, 5, 1);
            class488.field6899 = class75.method592(1000000, true, 6, 1);
            class286.field4217 = class75.method592(1000000, false, 7, 1);
            class280.field4070 = class75.method592(1000000, false, 9, 1);
            class384.field5284 = class75.method592(1000000, false, 10, 1);
            class65.field790 = class75.method592(1000000, false, 11, 1);
            class520.field7346 = class75.method592(1000000, false, 12, 1);
            class486.field6846 = class75.method592(1000000, false, 14, 1);
            class36.field474 = class75.method592(1000000, false, 15, 1);
            class305.field4397 = class75.method592(1000000, false, 16, 1);
            class784.field10769 = class75.method592(1000000, false, 17, 1);
            class243.field3621 = class75.method592(1000000, false, 18, 1);
            class253.field3722 = class75.method592(1000000, false, 19, 1);
            class352.field4936 = class75.method592(1000000, false, 20, 1);
            class46.field577 = class75.method592(1000000, false, 21, 1);
            class401.field5499 = class75.method592(1000000, false, 22, 1);
            class249.field3679 = class75.method592(1000000, true, 23, 1);
            class153.field2167 = class75.method592(1000000, false, 24, 1);
            class62.field746 = class75.method592(1000000, false, 25, 1);
            class751.field10394 = class75.method592(1000000, true, 26, 1);
            class471.field6609 = class75.method592(1000000, false, 27, 1);
            class251.field3710 = class75.method592(1000000, true, 28, 1);
            class42.field550 = class75.method592(1000000, false, 29, 1);
            class5.field36 = class75.method592(1000000, true, 30, 1);
            class48.field610 = class75.method592(1000000, true, 31, 1);
            class194.field2993 = class75.method592(1000000, true, 36, 2);
        }
        if (class53.field655 == class433.field5869) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class695.field9712[var19] != null) {
                    var18 += class695.field9712[var19].method3474((byte) -57) * class110.field1615[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class156.field2346 < 0) {
                    class156.field2346 = var18;
                }
                return (var18 - class156.field2346) * 100 / (100 - class156.field2346);
            }
            class363.method2277((byte) 43, class152.field2163);
            class108.method831(21322, class92.method682(false), class152.field2163, class124.field1928);
        }
        if (class53.field656 == class433.field5869) {
            if (class181.field2801 == -1) {
                class181.field2801 = class488.field6899.method4356(52, "scape main");
            }
            class282.method1837(22050);
            class225.method1539(false, 2);
        }
        if (class53.field657 == class433.field5869) {
            class456.method2713(-1342073268, class519.field7328, class5.field36);
        }
        if (!arg0) {
            return -79;
        }
        if (class53.field658 == class433.field5869) {
            int var20 = class702.method3981(-6893);
            if (var20 < 100) {
                return var20;
            }
            class286.method1850(class251.field3710.method4335(1, 0), 72);
            class336.method2133(class251.field3710.method4335(3, 0), 55);
            class299.field4324 = new class643(class251.field3710);
        }
        if (class53.field659 == class433.field5869) {
            if (class445.field6071 != -1 && !class286.field4217.method4359(class445.field6071, 0, 0)) {
                return 99;
            }
            class204.field3175 = new class273(class751.field10394, class280.field4070, class152.field2163);
            class184.field2832 = new class739(class60.field734, class140.field2081, class564.field8000);
            class541.field7792 = new class265(class60.field734, class140.field2081, class564.field8000, class299.field4324);
            class186.field2845 = new class543(class60.field734, class140.field2081, class564.field8000, class152.field2163);
            class88.field998 = new class105(class60.field734, class140.field2081, class784.field10769);
            class5.field40 = new class708(class60.field734, class140.field2081, class564.field8000);
            class207.field3200 = new class695(class60.field734, class140.field2081, class564.field8000);
            class532.field7690 = new class211(class60.field734, class140.field2081, class564.field8000, class152.field2163);
            class386.field5352 = new class163(class60.field734, class140.field2081, class564.field8000, class286.field4217);
            class648.field9065 = new class305(class60.field734, class140.field2081, class564.field8000);
            class518.field7313 = new class5(class60.field734, class140.field2081, class564.field8000);
            class277.field4038 = new class694(class60.field734, class140.field2081, true, class305.field4397, class286.field4217);
            class53.field669 = new class165(class60.field734, class140.field2081, class564.field8000, class152.field2163);
            class618.field8642 = new class790(class60.field734, class140.field2081, class564.field8000, class152.field2163);
            class575.field8103 = new class395(class60.field734, class140.field2081, true, class243.field3621, class286.field4217);
            class313.field4456 = new class257(class60.field734, class140.field2081, true, class184.field2832, class253.field3722, class286.field4217);
            class240.field3602 = new class588(class60.field734, class140.field2081, class564.field8000);
            class563.field7993 = new class86(class60.field734, class140.field2081, class352.field4936, class22.field364, class525.field7435);
            class107.field1602 = new class297(class60.field734, class140.field2081, class564.field8000);
            class316.field4491 = new class436(class60.field734, class140.field2081, class564.field8000);
            class456.field6385 = new class384(class60.field734, class140.field2081, class46.field577, class286.field4217);
            class89.field1002 = new class475(class60.field734, class140.field2081, class564.field8000);
            class104.field1210 = new class624(class60.field734, class140.field2081, class564.field8000);
            class29.field415 = new class780(class60.field734, class140.field2081, class564.field8000);
            class95.field1084 = new class203(class60.field734, class140.field2081, class401.field5499);
            class653.field9128 = new class3(class60.field734, class140.field2081, class564.field8000);
            class564.field7999 = new class401(class60.field734, class140.field2081, class564.field8000);
            class577.method3388((byte) 17, class588.field8298, class152.field2163, class286.field4217, class124.field1928);
            class558.method3300(class42.field550, (byte) 42);
            class737.field10169 = new class782(class140.field2081, class153.field2167, class62.field746);
            class204.field3172 = new class666(class140.field2081, class153.field2167, class62.field746, new class233());
            class371.method2308(true);
            class277.field4038.method3910(class21.field353.field10086.method1642(-62) == 0, (byte) 94);
            class537.field7727 = new class743();
            class594.method3464(arg0);
            class352.method2228(class471.field6609, -25952);
            class456.method2722(class286.field4217, (byte) -107, class204.field3175);
            class250 var21 = new class250(class384.field5284.method4362("", "huffman", (byte) -93));
            class745.method4154(53, var21);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class263.field3855 = class93.method687(0);
            class716.field9938 = new class12(true, class519.field7328);
        }
        if (class53.field661 == class433.field5869) {
            int var22 = class274.method1767(class152.field2163, 0) + class165.method1232(true, 64);
            int var23 = class306.method1977(true) + class616.method3566(2);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class53.field662 == class433.field5869) {
            class117.method874(class249.field3679, class5.field40, class207.field3200, class277.field4038, class53.field669, class618.field8642, class537.field7727);
        }
        if (class53.field663 == class433.field5869) {
            class672.field9369 = new int[class29.field415.field10709];
            class433.field5868 = new boolean[class29.field415.field10709];
            class635.field8916 = new String[class104.field1210.field8750];
            for (int var24 = 0; var24 < class29.field415.field10709; var24++) {
                if (class29.field415.method4288(var24, 9381).field2104 == 0) {
                    class433.field5868[var24] = true;
                    class202.field3150++;
                }
                class672.field9369[var24] = -1;
            }
            class301.method1948(-77);
            class152.field2155 = class588.field8298.method4356(24, "loginscreen");
            class483.field6809 = class588.field8298.method4356(117, "lobbyscreen");
            class168.field2640.method4343(-1, false, true);
            class488.field6899.method4343(-1, true, true);
            class152.field2163.method4343(-1, true, true);
            class124.field1928.method4343(-1, true, true);
            class384.field5284.method4343(-1, true, true);
            class588.field8298.method4343(-1, true, true);
            class159.field2535 = true;
            class564.field8000.field10884 = 2;
            class784.field10769.field10884 = 2;
            class305.field4397.field10884 = 2;
            class243.field3621.field10884 = 2;
            class253.field3722.field10884 = 2;
            class352.field4936.field10884 = 2;
            class46.field577.field10884 = 2;
        }
        if (class53.field664 == class433.field5869) {
            if (!class217.method1490(class152.field2155, -1)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class787.field10812[class152.field2155].length; var26++) {
                class451 var27 = class787.field10812[class152.field2155][var26];
                if (var27.field6210 == 5 && var27.field6264 != -1 && !class152.field2163.method4359(var27.field6264, 0, 0)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class53.field665 == class433.field5869) {
            class437.method2614(true, (byte) -66);
        }
        if (class53.field666 == class433.field5869) {
            class590.field8323.method3136(14801);
            try {
                class643.field8993.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class643.field8993 = null;
            class391.field5388 = null;
            class590.field8323 = null;
            class46.field574 = null;
            class304.field4387 = null;
            class7.field70 = null;
            class105.method739((byte) -127);
            class248.field3673 = class21.field353.field10085.method156(-106) == 1;
            class21.field353.method4080(arg0, class21.field353.field10085, 1);
            if (class248.field3673) {
                class21.field353.method4080(true, class21.field353.field10076, 0);
            } else if (class21.field353.field10076.field3574 && class716.field9938.field249 < 512 && class716.field9938.field249 != 0) {
                class21.field353.method4080(true, class21.field353.field10076, 0);
            }
            class580.method3397((byte) 13);
            if (class248.field3673) {
                class9.method61(0, false, (byte) -40);
            } else {
                class9.method61(class21.field353.field10076.method1588(-87), false, (byte) -40);
            }
            class666.method3797(-1, -117, -1, false, class21.field353.field10097.method3352(-42));
            class455.method2711(class37.field491, -126);
            class262.method1699(class37.field491, (byte) 106);
            class662.method3779(class152.field2163, (byte) 37, class37.field491);
            class346.method2193(class459.field6425, 4523);
        }
        return class434.method2603(-29106);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(BI)V", line = 512)
    public final void method3914(byte arg0, int arg1) {
        field9685++;
        class652 var3 = this.field9674;
        synchronized (this.field9674) {
            this.field9674.method3741(arg1, 0);
        }
        class652 var4 = this.field9691;
        synchronized (this.field9691) {
            if (arg0 != 27) {
                this.method3914((byte) 88, -22);
            }
            this.field9691.method3741(arg1, 0);
        }
        class652 var5 = this.field9694;
        synchronized (this.field9694) {
            this.field9694.method3741(arg1, 0);
        }
        class652 var6 = this.field9697;
        synchronized (this.field9697) {
            this.field9697.method3741(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V", line = 534)
    public final void method3915(int arg0) {
        field9675++;
        class652 var2 = this.field9674;
        synchronized (this.field9674) {
            this.field9674.method3735(2);
        }
        class652 var3 = this.field9691;
        synchronized (this.field9691) {
            if (arg0 != 21) {
                this.method3912(true, (byte) -48);
            }
            this.field9691.method3735(2);
        }
        class652 var4 = this.field9694;
        synchronized (this.field9694) {
            this.field9694.method3735(2);
        }
        class652 var5 = this.field9697;
        synchronized (this.field9697) {
            this.field9697.method3735(2);
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V", line = 557)
    public final void method3916(int arg0) {
        class652 var2 = this.field9674;
        synchronized (this.field9674) {
            this.field9674.method3743(arg0 + 7);
        }
        field9676++;
        class652 var3 = this.field9691;
        synchronized (this.field9691) {
            this.field9691.method3743(arg0 + 7);
        }
        class652 var4 = this.field9694;
        synchronized (this.field9694) {
            this.field9694.method3743(arg0 ^ 0x9);
            if (arg0 != 1) {
                this.method3914((byte) 88, 21);
            }
        }
        class652 var5 = this.field9697;
        synchronized (this.field9697) {
            this.field9697.method3743(8);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V", line = 579)
    public static void method3917(byte arg0) {
        field9679 = null;
        field9690 = null;
        field9699 = null;
        field9693 = null;
        field9689 = null;
        if (arg0 != 116) {
            field9690 = null;
        }
        field9692 = null;
        field9678 = null;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IB)V", line = 595)
    public final void method3918(int arg0, byte arg1) {
        this.field9674 = new class652(arg0);
        field9672++;
        if (arg1 < 90) {
            this.field9697 = null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZI)Lkv;", line = 610)
    public final class282 method3919(boolean arg0, int arg1) {
        field9684++;
        class652 var3 = this.field9674;
        class282 var4;
        synchronized (this.field9674) {
            var4 = (class282) this.field9674.method3742((byte) 67, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class791 var5 = this.field9683;
        byte[] var6;
        synchronized (this.field9683) {
            var6 = this.field9683.method4339(class54.method382(arg1, (byte) -92), 0, class299.method1940(arg1, 124));
        }
        class282 var7 = new class282();
        var7.field4119 = this;
        var7.field4100 = arg1;
        if (!arg0) {
            return null;
        }
        if (var6 != null) {
            var7.method1834((byte) 0, new class494(var6));
        }
        var7.method1844(-113);
        if (var7.field4120) {
            var7.field4103 = 0;
            var7.field4114 = false;
        }
        if (!this.field9681 && var7.field4166) {
            var7.field4169 = null;
            var7.field4104 = null;
        }
        class652 var8 = this.field9674;
        synchronized (this.field9674) {
            this.field9674.method3739((long) arg1, (byte) 96, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Ldt;IZLwia;Lwia;)V", line = 702)
    private class694(class252 arg0, int arg1, boolean arg2, class791 arg3, class791 arg4) {
        this.field9682 = arg4;
        this.field9681 = arg2;
        this.field9683 = arg3;
        if (this.field9683 != null) {
            int var6 = this.field9683.method4332((byte) 125) - 1;
            this.field9683.method4353(var6, true);
        }
    }
}
