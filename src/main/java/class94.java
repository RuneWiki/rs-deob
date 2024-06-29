import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class94 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "[I")
    public static int[] field1584 = new int[100];

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "Lbj;")
    public static class155 field1587;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "Ltg;")
    public static class182 field1591;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "[Lpd;")
    public static class57[] field1592;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[[[I")
    public static int[][][] field1585;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLoa;)I")
    public static final int method633(byte arg0, class99 arg1) {
        field1589++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class82.field1450; var2++) {
            if (arg1.method706(class57.field955[var2], 118)) {
                return var2;
            }
        }
        if (arg0 != 45) {
            field1587 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method634(int arg0) {
        field1584 = null;
        field1585 = null;
        if (arg0 == -1118394456) {
            field1592 = null;
            field1587 = null;
            field1591 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)I")
    public static final int method635(int arg0) {
        field1586++;
        if (class125.field2196) {
            return 0;
        } else if (class139.method951(436421925)) {
            int var1 = 21 / ((arg0 - 80) / 42);
            return class168.field3007 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
