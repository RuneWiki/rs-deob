import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lcb;")
    public static class17 field1979 = new class17(64);

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Z")
    public static boolean field1983 = false;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Lod;")
    public static class101 field1984 = class46.method335(104, "welle2:");

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Lod;")
    private static class101 field1986 = class46.method335(121, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "Lod;")
    public static class101 field1985 = field1986;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "[Lqe;")
    public static class116[] field1982;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)I")
    public static final int method642(int arg0, int arg1, byte arg2) {
        if (arg2 <= 24) {
            return -13;
        } else {
            long var3 = (long) ((arg0 << 16) + arg1);
            field1980++;
            return class40.field945 != null && class40.field945.field2723 == var3 ? class142.field3278.field3175 * 99 / (class142.field3278.field3213.length - class40.field945.field1920) + 1 : 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public static void method643(boolean arg0) {
        field1982 = null;
        if (arg0) {
            method643(false);
        }
        field1986 = null;
        field1985 = null;
        field1984 = null;
        field1979 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lc;BILc;I)Lme;")
    public static final class88 method644(class15 arg0, byte arg1, int arg2, class15 arg3, int arg4) {
        field1981++;
        if (class134.method1038(arg2, arg4, arg3, 2001)) {
            return arg1 == 42 ? class8.method40(arg0.method114((byte) 93, arg2, arg4), 100) : null;
        } else {
            return null;
        }
    }
}
