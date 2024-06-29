import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class492 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2961(int arg0, String arg1) {
        class58.method380("", arg1, 0, arg0, "", arg0 + 120);
        field7201++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lue;B)V")
    public static final void method2962(class376 arg0, byte arg1) {
        field7200++;
        if (arg1 == 113 && !class256.field4112) {
            arg0.method947((byte) 123);
            class540.field7909--;
        }
    }
}
