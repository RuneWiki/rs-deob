import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class15 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lka;")
    private class177 field161 = new class177();

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Lga;")
    private class18 field178 = new class18();

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    private int field176;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lt;")
    private class239 field177;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Z")
    public static boolean field159 = false;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "[I")
    public static int[] field170 = new int[1000];

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lbe;")
    public static class283 field162 = class153.method941(126, "Freie Welt");

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "[[S")
    public static short[][] field168 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "[Lqb;")
    public static class95[] field169;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(JI)Lka;", line = 4)
    public final class177 method77(long arg0, int arg1) {
        if (arg1 != 12) {
            return (class177) null;
        }
        class177 var4 = (class177) this.field177.method1612(arg0, 103);
        if (var4 != null) {
            this.field178.method111(69, var4);
        }
        field163++;
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 28)
    public final void method78(int arg0) {
        field165++;
        this.field178.method112(arg0 + 3302);
        this.field177.method1606((byte) 123);
        if (arg0 != -3303) {
            method80(60, 57, false, 72, -45);
        }
        this.field161 = new class177();
        this.field176 = this.field179;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lbe;II)V", line = 47)
    public static final void method79(class283 arg0, int arg1, int arg2) {
        field160++;
        class283 var3 = arg0.method1939(127).method1901(4095);
        boolean var4 = false;
        for (int var5 = 0; var5 < class297.field5033; var5++) {
            class191 var6 = class149.field2436[class162.field2666[var5]];
            if (var6 != null && var6.field3274 != null && var6.field3274.method1910(16369, var3)) {
                class53.method335(class213.field3624.field1150[0], 1, 0, arg1, class213.field3624.field1178[0], var6.field1150[0], var6.field1178[0], 0, false, 0, 2, 1);
                if (arg2 == 1) {
                    class248.field4241++;
                    class228.field3831.method621(59, 8);
                    class228.field3831.method1513(class162.field2666[var5], (byte) 110);
                } else if (arg2 == 4) {
                    class280.field4681++;
                    class228.field3831.method621(133, 8);
                    class228.field3831.method1510((byte) 72, class162.field2666[var5]);
                } else if (arg2 == 5) {
                    class228.field3831.method621(215, 8);
                    class228.field3831.method1513(class162.field2666[var5], (byte) 48);
                    class3.field38++;
                } else if (arg2 == 6) {
                    class87.field1467++;
                    class228.field3831.method621(101, arg1 ^ 0x9);
                    class228.field3831.method1510((byte) 67, class162.field2666[var5]);
                } else if (arg2 == 7) {
                    class215.field3648++;
                    class228.field3831.method621(142, 8);
                    class228.field3831.method1540(class162.field2666[var5], (byte) -38);
                }
                var4 = true;
                break;
            }
        }
        if (arg1 != 1) {
            method83(-41);
        }
        if (!var4) {
            class60.method394(0, class299.method2022(new class283[] { class194.field3310, var3 }, (byte) 19), class213.field3616, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIZII)I", line = 127)
    public static final int method80(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field172++;
        if (arg2) {
            field169 = (class95[]) null;
        }
        int var5 = 65536 - class139.field2316[arg3 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 142)
    public static final void method81(int arg0, int arg1) {
        field171++;
        if (arg1 != 5673) {
            return;
        }
        for (class119 var2 = (class119) class110.field1857.method1607(arg1 - 5673); var2 != null; var2 = (class119) class110.field1857.method1604((byte) 18)) {
            if ((long) arg0 == (var2.field1445 >> 48 & 0xFFFFL)) {
                var2.method557((byte) -89);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Luk;", line = 168)
    public final class86 method82(int arg0) {
        field167++;
        int var2 = -30 / ((-arg0 - 12) / 39);
        return this.field177.method1607(0);
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 179)
    public static void method83(int arg0) {
        field169 = null;
        if (arg0 == -15424) {
            field162 = null;
            field170 = null;
            field168 = (short[][]) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZI)V", line = 193)
    public static final void method84(int arg0, boolean arg1, int arg2) {
        field164++;
        class72 var3 = class25.method174(arg0, (byte) 74, 5);
        if (!arg1) {
            var3.method477(-124);
            var3.field1265 = arg2;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lka;JB)V", line = 218)
    public final void method85(class177 arg0, long arg1, byte arg2) {
        if (this.field176 == 0) {
            class177 var5 = this.field178.method114((byte) 47);
            var5.method557((byte) -89);
            var5.method1168(4);
            if (this.field161 == var5) {
                class177 var6 = this.field178.method114((byte) 47);
                var6.method557((byte) -89);
                var6.method1168(4);
            }
        } else {
            this.field176--;
        }
        field174++;
        this.field177.method1611(arg0, -1, arg1);
        int var7 = 27 / ((14 - arg2) / 50);
        this.field178.method111(-125, arg0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIII)V", line = 246)
    public static final void method86(int arg0, int arg1, int arg2, int arg3) {
        field175++;
        if (arg2 != 908) {
            method83(19);
        }
        class72 var4 = class25.method174(arg0, (byte) -97, 11);
        var4.method477(-91);
        var4.field1265 = arg1;
        var4.field1268 = arg3;
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)Luk;", line = 265)
    public final class86 method87(int arg0) {
        if (arg0 != 8) {
            method80(-13, 121, true, 117, -29);
        }
        field166++;
        return this.field177.method1604((byte) -38);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V", line = 307)
    public class15(int arg0) {
        this.field179 = arg0;
        this.field176 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field177 = new class239(var2);
    }
}
