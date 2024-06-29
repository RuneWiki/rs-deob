import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public abstract class class131 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[I")
    public static int[] field1566 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1567 = 0;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lgg;")
    public static class114 field1569 = new class114(30);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Ljt;")
    public static class635 field1568;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 17)
    public static void method837(int arg0) {
        field1569 = null;
        field1568 = null;
        field1566 = null;
        if (arg0 != 3) {
            field1567 = 41;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLrba;)Lrba;")
    public abstract class113 method836(byte arg0, class113 arg1);
}
