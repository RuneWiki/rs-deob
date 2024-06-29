import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public abstract class class416 {

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field6150 = 0;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "Lpb;")
    public static class2 field6151 = new class2(4, 19);

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Lf;")
    public static class256 field6153;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Lfn;")
    public static class617 field6148;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V", line = 5)
    public static void method2531(byte arg0) {
        field6153 = null;
        field6148 = null;
        field6151 = null;
        if (arg0 < 73) {
            field6153 = null;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IJ)I", line = 30)
    public final int method2532(int arg0, long arg1) {
        field6149++;
        if (arg0 != 19) {
            field6151 = null;
        }
        long var4 = this.method1353(arg0 - 19);
        if (var4 > 0L) {
            class687.method3846(var4, -41);
        }
        return this.method1352(arg1, arg0 + 12870);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(JI)I")
    public abstract int method1352(long arg0, int arg1);

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)J")
    public abstract long method1351(int arg0);

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)J")
    public abstract long method1353(int arg0);

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
    public abstract void method1355(byte arg0);
}
