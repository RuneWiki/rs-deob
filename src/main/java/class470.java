import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class470 {

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "[[I")
    public static int[][] field5973 = new int[128][128];

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field5974 = 0;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "Lnk;")
    public static class415 field5972;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BI)V")
    public static final void method2490(byte arg0, int arg1) {
        field5975++;
        if (arg0 != 67) {
            field5973 = null;
        }
        class148.field1905 = arg1;
        class84.field1187.method2406(18385);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public static void method2491(int arg0) {
        if (arg0 == 32675) {
            field5972 = null;
            field5973 = null;
        }
    }
}
