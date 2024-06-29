import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class176 {

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    private int field2659;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    private int field2657;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Z")
    private boolean field2650;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Z")
    private boolean field2655;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "[I")
    public static int[] field2656 = null;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Ljava/lang/Object;")
    public static Object field2658;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1227(int arg0) {
        field2660++;
        if (arg0 >= -3) {
            field2656 = null;
        }
        return this.field2655;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I", line = 26)
    public final int method1228(int arg0) {
        field2652++;
        int var2 = 110 % ((arg0 - 25) / 63);
        return this.field2657;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 36)
    public static void method1229(boolean arg0) {
        field2658 = null;
        if (!arg0) {
            field2656 = null;
        }
        field2656 = null;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Z", line = 53)
    public final boolean method1230(int arg0) {
        field2653++;
        return arg0 == 31029 ? this.field2650 : true;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(ZIIZ)V", line = 64)
    public class176(boolean arg0, int arg1, int arg2, boolean arg3) {
        this.field2659 = arg1;
        this.field2657 = arg2;
        this.field2650 = arg3;
        this.field2655 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)I", line = 75)
    public final int method1231(boolean arg0) {
        field2649++;
        return arg0 ? this.field2659 : -44;
    }
}
