import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class523 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public int field7263 = 1;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Ltca;")
    public static class184 field7265 = new class184(64);

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Ljea;")
    public static class474 field7267 = new class474(14, 3);

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field7268 = 0;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field7269 = 0;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "C")
    public char field7266;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 8)
    public static void method3037(int arg0) {
        field7265 = null;
        if (arg0 != 2) {
            method3037(93);
        }
        field7267 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ldt;I)V", line = 19)
    public final void method3038(class254 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field7264++;
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                return;
            }
            this.method3039(var3, arg1 + 12781, arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILdt;)V", line = 42)
    private final void method3039(int arg0, int arg1, class254 arg2) {
        if (arg0 == 1) {
            this.field7266 = class207.method1357(true, arg2.method1737(true));
        } else if (arg0 == 2) {
            this.field7263 = 0;
        }
        if (arg1 != 12781) {
            field7267 = null;
        }
        field7262++;
    }
}
