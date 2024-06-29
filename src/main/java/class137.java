import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class137 {

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public int field1744;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[I")
    public int[] field1740;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
    public int[] field1745;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
    public static int[] field1742 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lea;")
    public static class547 field1741 = new class547(0, 12);

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lqb;")
    public static class226 field1743;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 4)
    public static void method852(int arg0) {
        field1742 = null;
        field1743 = null;
        if (arg0 <= -118) {
            field1741 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V", line = 27)
    public class137(int arg0) {
        this.field1744 = arg0;
        this.field1740 = new int[this.field1744];
        this.field1745 = new int[this.field1744];
    }
}
