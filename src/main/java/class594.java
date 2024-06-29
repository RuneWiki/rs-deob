import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class594 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public int field8608;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field8609;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public int field8610;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public int field8611;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lek;B)V")
    public final void method3401(class465 arg0, byte arg1) {
        if (arg1 < 59) {
            this.field8611 = -80;
        }
        while (true) {
            int var3 = arg0.method2705(-128);
            if (var3 == 0) {
                field8609++;
                return;
            }
            this.method3402(11015, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILek;)V")
    private final void method3402(int arg0, int arg1, class465 arg2) {
        field8612++;
        if (arg1 == 1) {
            this.field8611 = arg2.method2755((byte) -107);
            this.field8610 = arg2.method2705(-43);
            this.field8608 = arg2.method2705(arg0 ^ 0xFFFFD495);
        }
        if (arg0 != 11015) {
            this.method3401(null, (byte) 68);
        }
    }
}
