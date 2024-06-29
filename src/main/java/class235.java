import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class235 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lhl;")
    public static class139 field3611 = new class139(50);

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[I")
    public static int[] field3616 = new int[14];

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Lpk;")
    public static class237 field3613;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lji;")
    public static class256 field3615;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[[[Lpj;")
    public static class284[][][] field3614;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method1589(boolean arg0) {
        field3611 = null;
        field3614 = null;
        field3616 = null;
        field3615 = null;
        if (!arg0) {
            field3613 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lpk;Lpk;ZILni;)V")
    public static final void method1590(class237 arg0, class237 arg1, boolean arg2, int arg3, class52 arg4) {
        class134.field1960 = arg0;
        class207.field3097 = arg2;
        class3.field39 = arg1;
        int var5 = class3.field39.method1603(-1) - 1;
        field3618++;
        class152.field2218 = arg3 * var5 + class3.field39.method1614(arg3 - 256, var5);
        class241.field3747 = arg4;
        class216.field3324 = new String[] { null, null, class293.field4440, null, null };
        class1.field23 = new String[] { null, null, null, null, class117.field1769 };
    }
}
