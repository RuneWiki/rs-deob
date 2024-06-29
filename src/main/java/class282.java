import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class282 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field4811 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4810 = 0;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field4815 = 0;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "J")
    public static long field4816 = 0L;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Lsg;")
    public static class191 field4814;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[[I")
    public static int[][] field4817;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([BII)I", line = 23)
    public static final int method1921(byte[] arg0, int arg1, int arg2) {
        if (arg1 > -82) {
            method1921((byte[]) null, 2, -59);
        }
        field4812++;
        return class60.method393(0, arg2, arg0, -97);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 39)
    public static void method1922(int arg0) {
        if (arg0 == 0) {
            field4817 = (int[][]) null;
            field4814 = null;
        }
    }
}
