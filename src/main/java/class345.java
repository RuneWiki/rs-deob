import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class345 {

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "Lcba;")
    public static class471 field4640 = new class471(59, -1);

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "[I")
    public static int[] field4645 = new int[200];

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public int field4638;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public int field4642;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "[B")
    public byte[] field4639;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "[B")
    public byte[] field4643;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
    public static void method2084(int arg0) {
        field4640 = null;
        if (arg0 >= -121) {
            field4640 = null;
        }
        field4645 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(III)Z")
    public static final boolean method2085(int arg0, int arg1, int arg2) {
        field4636++;
        int var3 = 33 % ((arg0 - 2) / 52);
        return class146.method972(arg1, 45, arg2) & class320.method1994(48, arg2, arg1);
    }
}
