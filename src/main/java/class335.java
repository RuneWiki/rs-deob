import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class335 extends class263 {

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "Lhca;")
    public static class457 field4139;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)[Luc;")
    public static final class27[] method1920(byte arg0) {
        if (arg0 < 28) {
            method1920((byte) -8);
        }
        field4140++;
        return new class27[] { class479.field5959, class200.field2326, class340.field4338, class621.field8428, class323.field4025, class580.field7768, class522.field6598, class546.field6859, class388.field4971, class228.field2951, class339.field4333, class311.field3915, class175.field2049, class356.field4592, class360.field4620, class706.field9869 };
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public static void method1921(byte arg0) {
        field4139 = null;
        if (arg0 != 112) {
            method1920((byte) 92);
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V")
    public class335(int arg0, int arg1) {
        this.field4142 = arg1;
        this.field4141 = arg0;
    }
}
