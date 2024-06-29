import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class45 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "[I")
    public static int[] field670 = new int[50];

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field668 = "Examine";

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lfk;")
    public static class52 field667;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "[[[I")
    public static int[][][] field665;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method290(int arg0) {
        field668 = null;
        field670 = null;
        field667 = null;
        int var1 = -68 % ((-arg0 - 20) / 61);
        field665 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method291(int arg0, int arg1) {
        if (arg0 != 50) {
            method291(-38, -117);
        }
        field669++;
        return class137.field1877[arg1].length() <= 0 ? class205.field3062[arg1] : class205.field3062[arg1] + class48.field690 + class137.field1877[arg1];
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class45() {
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lrm;)V")
    public class45(class45 arg0) {
        this.field664 = arg0.field664;
        this.field666 = arg0.field666;
        this.field672 = arg0.field672;
        this.field671 = arg0.field671;
    }
}
