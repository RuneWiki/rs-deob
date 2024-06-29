import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class641 {

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "Lfba;")
    public static class27 field8977 = new class27(53, 0);

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public int field8974;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field8976;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public int field8978;

    @OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
    public int field8979;

    @OriginalMember(owner = "client!mfa", name = "g", descriptor = "I")
    public static int field8980;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "[I")
    public static int[] field8975;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lso;I)V", line = 5)
    public final void method3656(class494 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2964((byte) 87);
            if (var3 == 0) {
                field8976++;
                int var4 = -7 / ((19 - arg1) / 60);
                return;
            }
            this.method3657(var3, -121, arg0);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IILso;)V", line = 26)
    private final void method3657(int arg0, int arg1, class494 arg2) {
        field8980++;
        if (arg0 == 1) {
            this.field8974 = arg2.method2998(true);
            this.field8978 = arg2.method2964((byte) 53);
            this.field8979 = arg2.method2964((byte) 108);
        }
        if (arg1 >= -63) {
            this.method3656(null, -9);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V", line = 51)
    public static void method3658(boolean arg0) {
        field8977 = null;
        if (arg0) {
            field8977 = null;
        }
        field8975 = null;
    }
}
