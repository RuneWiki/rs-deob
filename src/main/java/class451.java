import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public abstract class class451 {

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "[I")
    public static int[] field6388 = new int[8];

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "[I")
    public static int[] field6389 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "Z")
    public static boolean field6387 = false;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ILei;)Lei;")
    public abstract class175 method2694(int arg0, class175 arg1);

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lcq;)V")
    public static final void method2695(class466 arg0) {
        class471.field6690 = arg0;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
    public static void method2696(byte arg0) {
        int var1 = -111 % ((-arg0 - 56) / 34);
        field6388 = null;
        field6389 = null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)Z")
    public static final boolean method2697(int arg0, int arg1, int arg2) {
        if (arg2 >= -70) {
            field6387 = true;
        }
        field6390++;
        return (arg0 & 0x800) != 0;
    }
}
