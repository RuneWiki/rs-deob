import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1482 = 0;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lhe;")
    private static class54 field1483 = class6.method58("Hidden", false);

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[S")
    public static short[] field1488 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lhe;")
    public static class54 field1487 = field1483;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1489 = 0;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "[Lce;")
    public static class20[] field1484;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[[Lnc;")
    public static class93[][] field1481;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLef;Lef;)I")
    public static final int method466(byte arg0, class35 arg1, class35 arg2) {
        field1486++;
        if (arg0 >= -21) {
            field1488 = null;
        }
        int var3 = 0;
        if (arg1.method264((byte) 127, class54.field1344, class66.field1607)) {
            var3++;
        }
        if (arg2.method264((byte) 126, class158.field3611, class66.field1607)) {
            var3++;
        }
        if (arg2.method264((byte) 6, class2.field33, class66.field1607)) {
            var3++;
        }
        if (arg2.method264((byte) 127, class85.field2121, class66.field1607)) {
            var3++;
        }
        if (arg2.method264((byte) 126, class142.field3261, class66.field1607)) {
            var3++;
        }
        if (arg2.method264((byte) 124, class44.field1120, class66.field1607)) {
            var3++;
        }
        arg2.method264((byte) -1, class63.field1531, class66.field1607);
        arg2.method264((byte) 35, class5.field146, class66.field1607);
        arg2.method264((byte) -31, class19.field563, class66.field1607);
        arg2.method264((byte) 126, class18.field526, class66.field1607);
        arg2.method264((byte) 127, class125.field2877, class66.field1607);
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method467(int arg0) {
        field1487 = null;
        if (arg0 != 16589) {
            method467(28);
        }
        field1488 = null;
        field1481 = null;
        field1483 = null;
        field1484 = null;
    }
}
