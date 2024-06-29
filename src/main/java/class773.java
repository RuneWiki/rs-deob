import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class773 {

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Z")
    private boolean field10641;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    private int field10642;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    private int field10640;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "Z")
    private boolean field10648;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "Z")
    public static boolean field10644 = false;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "Z")
    public static boolean field10654 = true;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public static int field10653 = 0;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "[I")
    public static int[] field10647 = new int[4];

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field10655 = 0;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public static int field10656 = 2;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "Ljn;")
    public static class134 field10650 = new class134(23, 6);

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field10643;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field10645;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public static int field10646;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field10649;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "I")
    public static int field10651;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public static int field10652;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)I", line = 6)
    public final int method4270(int arg0) {
        if (arg0 == 4) {
            field10645++;
            return this.field10640;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)Z", line = 18)
    public final boolean method4271(int arg0) {
        if (arg0 == 23) {
            field10649++;
            return this.field10641;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)Z", line = 43)
    public final boolean method4272(int arg0) {
        field10646++;
        if (arg0 != 23) {
            method4274(false);
        }
        return this.field10648;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)I", line = 59)
    public final int method4273(byte arg0) {
        field10651++;
        int var2 = -23 % ((arg0 + 17) / 55);
        return this.field10642;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V", line = 72)
    public static void method4274(boolean arg0) {
        field10647 = null;
        if (arg0) {
            method4274(false);
        }
        field10650 = null;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(ZIIZ)V", line = 94)
    public class773(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field10641 = arg0;
        this.field10642 = arg2;
        this.field10640 = arg1;
        this.field10648 = arg3;
    }
}
