import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public abstract class class498 {

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "Lvl;")
    public static class15 field6808 = new class15(44, -1);

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "Lsfa;")
    public static class725 field6811;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "[I")
    public static int[] field6810;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V")
    public abstract void method1360(byte arg0);

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public static void method2850(int arg0) {
        field6810 = null;
        field6811 = null;
        if (arg0 != 0) {
            field6808 = null;
        }
        field6808 = null;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IJ)I")
    public final int method2851(int arg0, long arg1) {
        field6809++;
        if (arg0 != -1) {
            this.method1358(-104, 93L);
        }
        long var4 = this.method1359((byte) -43);
        if (var4 > 0L) {
            class643.method3577(var4, 0);
        }
        return this.method1358(4399, arg1);
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)J")
    public abstract long method1361(byte arg0);

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)J")
    public abstract long method1359(byte arg0);

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(IJ)I")
    public abstract int method1358(int arg0, long arg1);
}
