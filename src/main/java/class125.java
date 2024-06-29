import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class125 {

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
    public static int[] field2978 = new int[5];

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lu;")
    public static class135 field2980 = class87.method676((byte) -70, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[Lu;")
    public static class135[] field2976 = new class135[100];

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2986 = 0;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Lu;")
    public static class135 field2982 = class87.method676((byte) -65, "sl_button");

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lu;")
    public static class135 field2985 = class87.method676((byte) -65, ")1p");

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[[S")
    public static short[][] field2988 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2991 = 0;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lu;")
    public static class135 field2992 = class87.method676((byte) -57, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "J")
    public static long field2977 = 0L;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lg;")
    public static class43 field2984;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Z")
    public static boolean field2990;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method977(int arg0) {
        field2988 = null;
        field2992 = null;
        field2982 = null;
        field2980 = null;
        field2976 = null;
        field2985 = null;
        field2984 = null;
        field2978 = null;
        if (arg0 != 12) {
            field2985 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public static final void method978(int arg0, int arg1) {
        field2987++;
        if (class83.field1963 == arg0) {
            return;
        }
        if (class83.field1963 == 0) {
            class15.method100(false);
        }
        if (arg0 == 20 || arg0 == 40) {
            class2.field65 = 0;
            class75.field1756 = 0;
            class10.field242 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class78.field1839 != null) {
            class78.field1839.method874((byte) -98);
            class78.field1839 = null;
        }
        if (class83.field1963 == 25 || class83.field1963 == 40) {
            class86.method670(false);
            class70.method560();
        }
        if (arg1 != 1) {
            field2992 = null;
        }
        if (class83.field1963 == 25) {
            class93.field2215 = 0;
            class75.field1761 = 0;
            class40.field942 = 1;
            class56.field1379 = 1;
            class35.field827 = 0;
        }
        if (arg0 == 0 || arg0 == 35) {
            class131.method1051(-1126);
            class42.method309(122);
            if (class143.field3498 == null) {
                class143.field3498 = class96.method788(503, 17433, 765, class59.field1484);
            }
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class143.field3498 = null;
            class131.method1051(arg1 - 1127);
            class20.method149(class58.field1435, class59.field1484, class65.field1601, -7558);
        }
        if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
            class143.field3498 = null;
            class42.method309(124);
            class146.method1203(0, class59.field1484, class58.field1435);
        }
        class53.field1258 = true;
        class83.field1963 = arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILu;)V")
    public static final void method979(int arg0, int arg1, class135 arg2) {
        field2979++;
        class77.field1825++;
        class152.field3751.method929(arg1, -14044);
        class152.field3751.method459(arg2.method1064(-22243), (byte) -45);
        class152.field3751.method466(117, arg0);
    }
}
