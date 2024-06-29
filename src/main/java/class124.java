import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class class124 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field1643 = 0;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lra;")
    public static class57 field1646;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lra;")
    public static class57 field1647;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[[[I")
    public static int[][][] field1648;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 14)
    public static final void method701(int arg0) {
        if (arg0 < 14) {
            field1646 = null;
        }
        field1645++;
        if (class269.field3787 != -1) {
            class137.method822(false, -1, false, class269.field3787, -1);
            class269.field3787 = -1;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V", line = 34)
    public static void method702(byte arg0) {
        int var1 = -23 % ((arg0 - 48) / 49);
        field1646 = null;
        field1648 = null;
        field1647 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)J")
    public abstract long method299(byte arg0);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public abstract void method301(int arg0);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public abstract int method300(int arg0, int arg1);
}
