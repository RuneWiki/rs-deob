import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class726 {

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "[Ltca;")
    public static class174[] field9828 = new class174[5];

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lwq;")
    public static class169 field9831;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Lcm;")
    public class726 field9824;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Lcm;")
    public class726 field9830;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    public final void method4018(boolean arg0) {
        field9829++;
        if (this.field9830 == null) {
            return;
        }
        this.field9830.field9824 = this.field9824;
        this.field9824.field9830 = this.field9830;
        this.field9824 = null;
        if (!arg0) {
            this.field9830 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method4019(byte arg0) {
        field9831 = null;
        int var1 = 108 / ((arg0 + 83) / 41);
        field9828 = null;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V")
    public static final void method4020(int arg0) {
        field9826++;
        class601.field8260.method999(0);
        if (arg0 != 16127) {
            field9825 = -113;
        }
    }

    static {
        for (int var0 = 0; var0 < field9828.length; var0++) {
            field9828[var0] = new class174();
        }
        field9831 = new class169(1);
    }
}
