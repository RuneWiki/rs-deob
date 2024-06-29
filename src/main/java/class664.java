import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class664 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lnh;")
    public static class699 field9019 = new class699(3);

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[[I")
    public static int[][] field9023 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lhd;")
    public static class694 field9022 = new class694(16);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lpfa;")
    public static class275 field9025;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 3)
    public static void method3696(byte arg0) {
        field9023 = null;
        field9019 = null;
        int var1 = -100 % ((-arg0 - 13) / 33);
        field9022 = null;
        field9025 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLoa;)V", line = 17)
    public static final void method3697(byte arg0, class650 arg1) {
        field9018++;
        if (class353.field4564) {
            class22.method143(true, arg1);
        } else {
            class177.method1054(arg1, true);
        }
        if (arg0 >= -96) {
            method3696((byte) -63);
        }
    }
}
