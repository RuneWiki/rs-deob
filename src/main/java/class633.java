import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class633 {

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    private int field8032;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public int field8029;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[[I")
    public static int[][] field8031 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Luw;")
    public static class208 field8025 = new class208(100, 1);

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "D")
    public static double field8026;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field8023;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Lwm;")
    public static class30 field8028;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 4)
    public static void method3377(int arg0) {
        field8028 = null;
        field8025 = null;
        field8031 = null;
        if (arg0 != 12) {
            method3377(9);
        }
    }

    @OriginalMember(owner = "client!rn", name = "toString", descriptor = "()Ljava/lang/String;", line = 27)
    public final String toString() {
        field8027++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)[Ldl;", line = 36)
    public static final class725[] method3378(int arg0) {
        int var1 = 60 % ((arg0 - 17) / 55);
        field8024++;
        return new class725[] { class473.field6159, class443.field5805, class232.field3120 };
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V", line = 46)
    public static final void method3379(int arg0, int arg1) {
        field8033++;
        class294.field3738.method2928(true, arg0);
        class282.field3656.method2928(true, arg0);
        class781.field10682.method2928(true, arg0);
        if (arg1 >= -49) {
            method3378(127);
        }
        class615.field7807.method2928(true, arg0);
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(II)V", line = 60)
    public class633(int arg0, int arg1) {
        this.field8032 = arg0;
        this.field8029 = arg1;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I", line = 69)
    public final int method3380(byte arg0) {
        field8030++;
        if (arg0 != -38) {
            method3378(85);
        }
        return this.field8032;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I", line = 88)
    public static final int method3381(int arg0, int arg1, int arg2) {
        field8023++;
        if (arg2 <= 16) {
            method3378(84);
        }
        return arg0 == 1 || arg0 == 3 ? class439.field5769[arg1 & 0x3] : class568.field7182[arg1 & 0x3];
    }
}
