import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class99 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
    public static int[] field1845 = new int[100];

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[Lsf;")
    public static class200[] field1847 = new class200[50];

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1849 = -1;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[Lnb;")
    public static class143[] field1846;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method629(byte arg0) {
        field1847 = null;
        field1846 = null;
        field1845 = null;
        if (arg0 != -99) {
            field1847 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Leh;II)Lli;")
    public static final class128 method630(class52 arg0, int arg1, int arg2) {
        field1844++;
        byte[] var3 = arg0.method343(arg1, arg2);
        return var3 == null ? null : new class128(var3);
    }
}
