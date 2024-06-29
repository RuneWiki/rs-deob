import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class163 {

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "Z")
    public static boolean field2567 = false;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "J")
    public static long field2563 = 0L;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public int field2556;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public int field2561;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public int field2562;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public int field2565;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public int field2566;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public int field2570;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2571;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZI)V")
    public static final void method1105(int arg0, boolean arg1, int arg2) {
        class142.field2160 = (float) arg2;
        field2549++;
        class16.field244 = (float) arg0;
        if (class259.field4130 == 2) {
            class83.field1408 = arg0;
            class62.field1066 = arg2;
        }
        class259.method1761((byte) 112);
        class115.field1877 = arg1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public static final void method1106(int arg0) {
        class141.field2155 = 0;
        class82.field1392 = 0;
        class131.method909(-7233);
        class144.method970(29);
        class16.method157(false);
        field2555++;
        class281.method1893((byte) -101);
        for (int var1 = arg0; var1 < class82.field1392; var1++) {
            int var3 = class100.field1689[var1];
            if (class192.field2978 != class210.field3267[var3].field2279) {
                if (class210.field3267[var3].field3812 > 0) {
                    class103.method743((byte) -92, class210.field3267[var3]);
                }
                class210.field3267[var3] = null;
            }
        }
        if (class53.field804 != class236.field3814.field1535) {
            throw new RuntimeException("gpp1 pos:" + class236.field3814.field1535 + " psize:" + class53.field804);
        }
        for (int var2 = 0; var2 < class137.field2110; var2++) {
            if (class210.field3267[class99.field1660[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class137.field2110);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static void method1107(int arg0) {
        if (arg0 == 0) {
            field2571 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)I")
    public static final int method1108(byte arg0) {
        field2558++;
        int var1 = 39 / ((arg0 + 20) / 45);
        return ((class294.field4633 == 0 ? 0 : 1) << 21) + ((class18.field272 == 0 ? 0 : 1) << 20) + ((class155.field2407 ? 1 : 0) << 19) + ((class179.field2790 ? 1 : 0) << 16) + ((class293.field4622 ? 1 : 0) << 15) + ((class197.field3116 ? 1 : 0) << 13) + ((class190.field2948 & 0x3) << 11) + ((class170.field2648 ? 1 : 0) << 9) + ((class77.field1260 ? 1 : 0) << 7) + (((class132.field2072 ? 1 : 0) << 5) + (((class218.field3365 ? 1 : 0) << 3) + (class50.field740 & 0x7) - -((class132.field2070 ? 1 : 0) << 4) + ((class210.field3264 ? 1 : 0) << 6) - -((class147.field2331 ? 1 : 0) << 8)) - -((class19.field291 ? 1 : 0) << 10) + (class106.field1754 << 17) + ((class86.field1445 == 0 ? 0 : 1) << 22) - -(class67.method494() << 23));
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)V")
    public static final void method1109(int arg0, int arg1) {
        class293.field4621 = arg0;
        class250.field4038 = -1;
        if (arg1 != 0) {
            method1108((byte) -7);
        }
        class4.field27 = -1;
        class56.method427(arg1 + 117);
        field2559++;
    }
}
