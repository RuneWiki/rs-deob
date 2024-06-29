import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class402 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public int field5677 = 1;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field5676 = 0;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "C")
    public char field5680;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILun;)V")
    public final void method2427(int arg0, class389 arg1) {
        if (arg0 != 7957) {
            this.field5680 = (char) 65425;
        }
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                field5679++;
                return;
            }
            this.method2428(false, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLun;I)V")
    private final void method2428(boolean arg0, class389 arg1, int arg2) {
        field5678++;
        if (arg2 == 1) {
            this.field5680 = class507.method3016((byte) -88, arg1.method2249((byte) -70));
        } else if (arg2 == 2) {
            this.field5677 = 0;
        }
        if (arg0) {
            this.field5677 = -84;
        }
    }
}
