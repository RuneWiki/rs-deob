import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class448 {

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "[I")
    public static int[] field6623 = new int[13];

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public int field6626;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public int field6627;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public int field6628;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Ldba;")
    public static class94 field6624;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "Z")
    public boolean field6622;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILde;)I")
    public static final int method2763(int arg0, class533 arg1) {
        if (arg0 != 34065) {
            return -76;
        }
        field6625++;
        if (class236.field3430 == arg1) {
            return 9216;
        } else if (class474.field6892 == arg1) {
            return 34065;
        } else if (client.field4275 == arg1) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public static void method2764(boolean arg0) {
        field6624 = null;
        field6623 = null;
        if (arg0) {
            field6624 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ldi;)V")
    public static final void method2765(class127 arg0) {
        class177.field2736 = arg0;
    }
}
