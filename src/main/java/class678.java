import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class678 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field9561 = 0;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
    public static int[] field9565 = new int[1];

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field9562;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field9563;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field9564;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static void method3835(byte arg0) {
        if (arg0 == -62) {
            field9565 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Leq;Ld;Z)V")
    public static final void method3836(class209 arg0, class149 arg1, boolean arg2) {
        class700.field9837 = arg0;
        class264.field3851 = arg1;
        if (!arg2) {
            method3835((byte) 16);
        }
        field9564++;
    }
}
