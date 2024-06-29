import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class171 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
    public static int[] field2620 = new int[1];

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2622 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lhda;")
    public static class752 field2621 = new class752(75, 28);

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 15)
    public static void method1210(int arg0) {
        if (arg0 != -25694) {
            field2624 = -13;
        }
        field2620 = null;
        field2621 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I", line = 29)
    public static final int method1211(int arg0, int arg1) {
        int var2 = -113 % ((arg1 + 57) / 47);
        field2623++;
        return arg0 >>> 8;
    }
}
