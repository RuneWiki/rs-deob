import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class387 {

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Lpp;")
    public static class464 field5756 = new class464(35, 3);

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "Liu;")
    public static class517 field5758 = new class517(103, 6);

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public int field5753;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public int field5755;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public int field5757;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static void method2347(byte arg0) {
        field5758 = null;
        if (arg0 != 76) {
            field5758 = null;
        }
        field5756 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lkl;B)I")
    public static final int method2348(class468 arg0, byte arg1) {
        field5754++;
        if (arg1 > -106) {
            method2348(null, (byte) -2);
        }
        if (class617.field8727 == arg0) {
            return 6407;
        } else if (class85.field1472 == arg0) {
            return 6408;
        } else if (class384.field5715 == arg0) {
            return 6406;
        } else if (class299.field4330 == arg0) {
            return 6409;
        } else if (class561.field8029 == arg0) {
            return 6410;
        } else if (class485.field6862 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }
}
