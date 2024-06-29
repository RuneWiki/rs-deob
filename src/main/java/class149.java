import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class149 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
    public int[] field1865;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[I")
    public int[] field1861;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    public int[] field1860;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[[F")
    public float[][] field1863;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "[F")
    public static float[] field1866 = new float[4];

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1075(byte arg0) {
        class384.field4910 = -1;
        class629.field8599 = null;
        field1867++;
        int var1 = 101 / ((arg0 - 14) / 40);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 18)
    public static final void method1076(byte arg0) {
        class260.method1560(true);
        field1864++;
        class672.field9218 = false;
        if (arg0 != 116) {
            field1862 = -89;
        }
        class181.method1214(2740, class553.field7697, class705.field9916, class676.field9279, class119.field1505);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 38)
    public static void method1077(int arg0) {
        field1866 = null;
        if (arg0 != 23092) {
            field1862 = -88;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([I[I[I[[F)V", line = 49)
    public class149(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field1865 = arg2;
        this.field1861 = arg0;
        this.field1860 = arg1;
        this.field1863 = arg3;
    }
}
