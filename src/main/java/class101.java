import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class101 extends class99 {

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public int field2545 = 0;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "Lpd;")
    private static class94 field2548 = class28.method249(89, " more options");

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "Lpd;")
    private static class94 field2549 = class28.method249(-105, "Hidden");

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "Lpd;")
    private static class94 field2554 = class28.method249(-72, "To");

    @OriginalMember(owner = "client!qe", name = "nb", descriptor = "I")
    public static int field2555 = 1;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "Lpd;")
    public static class94 field2553 = class28.method249(-54, "@yel@*V");

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "Lpd;")
    public static class94 field2547 = field2548;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "Lpd;")
    public static class94 field2552 = field2554;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lpd;")
    public static class94 field2546 = field2549;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!qe", name = "ob", descriptor = "[I")
    public static int[] field2556 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!qe", name = "rb", descriptor = "Z")
    public static boolean field2559 = false;

    @OriginalMember(owner = "client!qe", name = "sb", descriptor = "[I")
    public static int[] field2560 = new int[500];

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!qe", name = "pb", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!qe", name = "qb", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V", line = 6)
    public static final void method758(byte arg0) {
        field2557++;
        class110.method793(-1);
        class64.method480(-94);
        class99.method746(-1);
        class80.method600(0);
        class50.method399((byte) -45);
        class97.method734((byte) -51);
        class73.method542(255);
        class7.method38((byte) 113);
        class94.method693((byte) 95);
        if (arg0 > -98) {
            return;
        }
        class62.method461(false);
        class76.method568(90);
        class135.method1068((byte) 81);
        ((class79) class124.field3148).method595(50);
        class97.field2466.method1013(-1);
        class95.field2445.method813((byte) 126);
        client.field486.method813((byte) 126);
        class80.field2032.method813((byte) 126);
        class30.field867.method813((byte) 127);
        class8.field213.method813((byte) 126);
        class77.field1978.method813((byte) 126);
        class7.field149.method813((byte) 126);
        class95.field2448.method813((byte) 127);
        class120.field3014.method813((byte) 127);
        class126.field3168.method813((byte) 126);
        class115.field2919.method813((byte) 126);
        class13.field317.method813((byte) 127);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILuc;I)V", line = 73)
    private final void method759(int arg0, class122 arg1, int arg2) {
        if (arg0 < -16) {
            if (arg2 == 5) {
                this.field2545 = arg1.method938((byte) 123);
            }
            field2558++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLuc;)V", line = 107)
    public final void method760(byte arg0, class122 arg1) {
        while (true) {
            int var3 = arg1.method943(-1025);
            if (var3 == 0) {
                field2551++;
                if (arg0 != 102) {
                    field2554 = null;
                    return;
                }
                return;
            }
            this.method759(arg0 - 140, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 146)
    public static void method761(int arg0) {
        field2553 = null;
        field2548 = null;
        field2554 = null;
        field2549 = null;
        field2552 = null;
        if (arg0 != 33554431) {
            method761(122);
        }
        field2547 = null;
        field2546 = null;
        field2556 = null;
        field2560 = null;
    }
}
