import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class398 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "Lfo;")
    public static class361 field5794;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static final void method2454(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class462.field6896[var1] = false;
        }
        field5792++;
        int var2 = 56 % ((8 - arg0) / 52);
        class352.field4700 = -1;
        class430.field6259 = class9.field110;
        class47.field491 = 5;
        class533.field7852 = class532.field7836;
        class275.field3655 = 0;
        class316.field4230 = 0;
        class117.field1530 = -1;
        class520.field7661 = class238.field3171;
        class510.field7405 = class267.field3572;
        class385.field5598 = class65.field739;
        class287.field3774 = class139.field1857;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static void method2455(int arg0) {
        int var1 = -116 % ((arg0 + 9) / 35);
        field5794 = null;
    }
}
