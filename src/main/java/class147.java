import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class147 implements Runnable {

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
    public boolean field3586 = true;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Ljava/lang/Object;")
    public Object field3588 = new Object();

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "[I")
    public int[] field3602 = new int[500];

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "[I")
    public int[] field3601 = new int[500];

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public int field3603 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lqf;")
    private static class117 field3578 = class72.method514(127, "Loaded gamescreen");

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lqf;")
    public static class117 field3585 = field3578;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field3581 = 0;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Lqf;")
    public static class117 field3593 = class72.method514(104, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Lqf;")
    private static class117 field3591 = class72.method514(110, "scroll:");

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Lqf;")
    public static class117 field3597 = class72.method514(124, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lqf;")
    public static class117 field3584 = field3591;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lqf;")
    public static class117 field3582 = field3591;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field3594 = 0;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lqf;")
    public static class117 field3589 = class72.method514(104, "(X");

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lfb;")
    public static class38 field3592;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "[[[B")
    public static byte[][][] field3598;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static final void method1174(int arg0) {
        class22 var1 = (class22) class66.field1374.method27(18823);
        if (arg0 != 13) {
            field3582 = null;
        }
        while (var1 != null) {
            if (var1.field411 != null) {
                var1.method179(0);
            }
            var1 = (class22) class66.field1374.method25((byte) -127);
        }
        field3599++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method1175(byte arg0) {
        if (arg0 <= 3) {
            field3593 = null;
        }
        field3584 = null;
        field3578 = null;
        field3597 = null;
        field3598 = null;
        field3589 = null;
        field3582 = null;
        field3585 = null;
        field3593 = null;
        field3592 = null;
        field3591 = null;
    }

    @OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3586) {
            Object var1 = this.field3588;
            synchronized (this.field3588) {
                if (this.field3603 < 500) {
                    this.field3602[this.field3603] = class143.field3504;
                    this.field3601[this.field3603] = class18.field274;
                    this.field3603++;
                }
            }
            class148.method1183(0, 50L);
        }
        field3600++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjb;II)[Lma;")
    public static final class84[] method1176(int arg0, class64 arg1, int arg2, int arg3) {
        field3580++;
        if (arg3 != -17461) {
            field3581 = -105;
        }
        return class68.method478(12127, arg0, arg2, arg1) ? class76.method547(0) : null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V")
    public static final void method1177(int arg0, byte arg1) {
        field3587++;
        if (arg0 == -3) {
            class35.method272(class76.field1679, false, class48.field984, class3.field34);
        } else if (arg0 == -2) {
            class35.method272(class48.field968, false, class48.field994, class83.field1899);
        } else if (arg0 == -1) {
            class35.method272(class48.field979, false, class48.field1007, class3.field38);
        } else if (arg0 == 3) {
            class35.method272(class48.field974, false, class48.field993, class16.field242);
        } else if (arg0 == 4) {
            class35.method272(class50.field1056, false, class48.field1012, class81.field1863);
        } else if (arg0 == 5) {
            class35.method272(class41.field820, false, class48.field1003, class64.field1321);
        } else if (arg0 == 6) {
            class35.method272(class71.field1499, false, class48.field1019, class52.field1069);
        } else if (arg0 == 7) {
            class35.method272(class71.field1504, false, class48.field1018, class115.field2736);
        } else if (arg0 == 8) {
            class35.method272(class103.field2495, false, class48.field1021, class25.field500);
        } else if (arg0 == 9) {
            class35.method272(class28.field559, false, class48.field986, class110.field2603);
        } else if (arg0 == 10) {
            class35.method272(class103.field2497, false, class48.field1011, class18.field271);
        } else if (arg0 == 11) {
            class35.method272(class129.field3071, false, class48.field1026, class129.field3048);
        } else if (arg0 == 12) {
            class35.method272(class69.field1457, false, class48.field985, class23.field443);
        } else if (arg0 == 13) {
            class35.method272(class4.field71, false, class48.field1028, class3.field52);
        } else if (arg0 == 14) {
            class35.method272(class16.field226, false, class48.field1004, class36.field754);
        } else if (arg0 == 16) {
            class35.method272(class101.field2441, false, class48.field970, class114.field2691);
        } else if (arg0 == 17) {
            class35.method272(class122.field2896, false, class48.field992, class136.field3249);
        } else if (arg0 == 18) {
            class35.method272(class45.field881, false, class48.field973, class132.field3129);
        } else if (arg0 == 19) {
            class35.method272(class53.field1098, false, class115.field2738, class94.field2286);
        } else if (arg0 == 20) {
            class35.method272(class60.field1201, false, class48.field977, class3.field40);
        } else if (arg0 == 22) {
            class35.method272(class95.field2298, false, class48.field1005, class100.field2433);
        } else if (arg0 == 23) {
            class35.method272(class152.field3765, false, class48.field988, class36.field774);
        } else if (arg0 == 24) {
            class35.method272(class149.field3714, false, class48.field995, client.field398);
        } else if (arg0 == 25) {
            class35.method272(class62.field1262, false, class48.field980, class3.field47);
        } else if (arg0 == 26) {
            class35.method272(class43.field860, false, class48.field1017, class8.field133);
        } else if (arg0 == 27) {
            class35.method272(class48.field1010, false, class48.field987, class102.field2467);
        } else {
            class35.method272(class146.field3570, false, class48.field1001, class3.field48);
        }
        if (arg1 < 89) {
            field3581 = 97;
        }
        class62.method430(10, (byte) -47);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public static final void method1178(int arg0, int arg1, int arg2) {
        field3596++;
        if (~class43.field861 != arg0 && arg2 != -1) {
            class141.method1100(client.field392, -113, 0, false, class43.field861, arg2);
            class40.field796 = true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        class36.field771.method1124(15);
        class80.field1831 = null;
        class125.field2953 = 1;
        if (arg0 != 3) {
            field3593 = null;
        }
        field3579++;
    }
}
