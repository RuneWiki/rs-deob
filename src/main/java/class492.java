import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class492 {

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field6819 = -1;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "S")
    public static short field6820 = 256;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field6822 = 0;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Ljw;")
    public static class581 field6821 = new class581(80, 11);

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
    public static final void method2856(int arg0) {
        if (arg0 != -1) {
            field6822 = -52;
        }
        field6823++;
        if (!class574.field7712) {
            class757.field10501 = true;
            class574.field7712 = true;
            class282.field4157 += (-24.0F - class282.field4157) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static void method2857(int arg0) {
        field6821 = null;
        if (arg0 != -17435) {
            method2856(-22);
        }
    }
}
