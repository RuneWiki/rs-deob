import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class273 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public int field3903 = -1;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public int field3907 = -1;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[I")
    public int[] field3905;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1716(int arg0, int arg1) {
        field3902++;
        if (arg1 <= 70) {
            field3906 = 19;
        }
        class152.field2541 = 1000000000L / (long) arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lek;I)V", line = 20)
    public final void method1717(class465 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2705(-82);
            if (var3 == 0) {
                if (arg1 != -30666) {
                    return;
                }
                field3908++;
                return;
            }
            this.method1718(-5317, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILek;)V", line = 41)
    private final void method1718(int arg0, int arg1, class465 arg2) {
        if (arg1 == 1) {
            this.field3907 = arg2.method2755((byte) -54);
        } else if (arg1 == 2) {
            this.field3905 = new int[arg2.method2705(arg0 ^ 0x14D9)];
            for (int var4 = 0; var4 < this.field3905.length; var4++) {
                this.field3905[var4] = arg2.method2755((byte) -43);
            }
        } else if (arg1 == 3) {
            this.field3903 = arg2.method2705(-34);
        }
        field3901++;
        if (arg0 != -5317) {
            this.field3903 = -20;
        }
    }
}
