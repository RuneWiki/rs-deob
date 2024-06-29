import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class626 {

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "[[I")
    public static int[][] field8735 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field8732;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field8733;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 11)
    public static final void method3443(byte arg0) {
        if (class504.field6675 == 3) {
            class361.method1987(4, 50);
        } else if (class504.field6675 == 7) {
            class361.method1987(8, -118);
        } else if (class504.field6675 == 10) {
            class361.method1987(11, 49);
        }
        int var1 = -103 / ((arg0 + 65) / 39);
        field8734++;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V", line = 31)
    public static void method3444(byte arg0) {
        field8735 = null;
        if (arg0 > -117) {
            method3444((byte) 78);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)B", line = 43)
    public static final byte method3445(int arg0, int arg1, int arg2) {
        if (arg2 < 3) {
            method3443((byte) -41);
        }
        field8732++;
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
