import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class481 {

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "[I")
    public static int[] field6585 = new int[50];

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(III)Z")
    public static final boolean method2708(int arg0, int arg1, int arg2) {
        if (arg2 < 44) {
            field6585 = null;
        }
        field6586++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
    public static void method2709(int arg0) {
        if (arg0 != 0) {
            field6585 = null;
        }
        field6585 = null;
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)V")
    public static final void method2710(int arg0) {
        class359.field5044 = -1;
        class102.field1421 = -1;
        class388.field5409 = -1;
        class694.field9657 = 0;
        field6587++;
        if (arg0 != 50) {
            method2709(-2);
        }
    }
}
