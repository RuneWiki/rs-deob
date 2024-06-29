import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class233 extends class88 {

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field3851 = 0;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field3856 = 0;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "[I")
    public static int[] field3858 = new int[100];

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "[[S")
    public static short[][] field3860 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public int field3855;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "Ljava/lang/String;")
    public String field3863;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
    public final void method1651(byte arg0) {
        ++field3857;
        super.field1087 |= Long.MIN_VALUE;
        if (arg0 == 121) {
            if (this.method1654((byte) 126) == 0L) {
                class273.field4364.method125(this, -1);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)I")
    public final int method1652(byte arg0) {
        ++field3862;
        int var2 = 61 / ((-25 - arg0) / 46);
        return (int) (255L & super.field3923 >>> 32);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public final void method1653(boolean arg0) {
        if (!arg0) {
            super.field1087 = super.field1087 & Long.MIN_VALUE | 500L + class249.method1723((byte) 63);
            class91.field1132.method125(this, -1);
            ++field3861;
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(B)J")
    public final long method1654(byte arg0) {
        if (arg0 != 126) {
            this.field3863 = null;
        }
        ++field3864;
        return Long.MAX_VALUE & super.field1087;
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(B)I")
    public final int method1655(byte arg0) {
        if (arg0 <= 88) {
            this.field3852 = -54;
        }
        ++field3854;
        return (int) super.field3923;
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(B)V")
    public static void method1656(byte arg0) {
        field3858 = null;
        field3860 = null;
        if (arg0 != 5) {
            field3851 = -104;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(II)V")
    public class233(int arg0, int arg1) {
        super.field3923 = (long) arg1 | (long) arg0 << 32;
    }
}
