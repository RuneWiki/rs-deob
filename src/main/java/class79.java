import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class79 extends class417 {

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    private int field891 = -1;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lso;I)V")
    public final void method610(class494 arg0, int arg1) {
        field889++;
        this.field891 = arg0.method2998(true);
        if (arg1 >= -121) {
            this.field891 = -67;
        }
        arg0.method2964((byte) 73);
        if (arg0.method2964((byte) 72) != 255) {
            arg0.field7042--;
            arg0.method3005(-60);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lhs;Z)V")
    public final void method611(class344 arg0, boolean arg1) {
        field890++;
        arg0.method2178(arg1, this.field891);
    }
}
