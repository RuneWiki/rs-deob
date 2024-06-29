import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class152 extends class617 {

    @OriginalMember(owner = "client!pba", name = "E", descriptor = "Lrca;")
    public class34 field1683;

    @OriginalMember(owner = "client!pba", name = "y", descriptor = "I")
    public static int field1678 = 0;

    @OriginalMember(owner = "client!pba", name = "z", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!pba", name = "A", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!pba", name = "C", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!pba", name = "F", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!pba", name = "x", descriptor = "Lcq;")
    public static class110 field1677;

    @OriginalMember(owner = "client!pba", name = "D", descriptor = "Lcj;")
    public static class178 field1682;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI)Z", line = 12)
    public static final boolean method826(byte arg0, int arg1) {
        field1679++;
        if (arg0 != 117) {
            method827((byte) 81);
        }
        return arg1 == 4 || arg1 == 8 || arg1 == 11;
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)[Lps;", line = 23)
    public static final class469[] method827(byte arg0) {
        field1681++;
        if (arg0 != 45) {
            field1682 = null;
        }
        return new class469[] { class572.field8122, class375.field5097, class469.field6705, class595.field8390, class116.field1284, class35.field352, class642.field9081, class687.field9660, class247.field3051, class474.field6828, class200.field2358, class273.field3415, class364.field4889, class678.field9534, class120.field1340 };
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lrca;)V", line = 38)
    public class152(class34 arg0) {
        this.field1683 = arg0;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V", line = 46)
    public static void method828(int arg0) {
        field1682 = null;
        if (arg0 >= 76) {
            field1677 = null;
        }
    }
}
