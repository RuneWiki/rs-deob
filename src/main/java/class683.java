import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class683 {

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "Lwu;")
    private class376 field9531;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "Lwu;")
    private class376 field9535;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "Lms;")
    public static class763 field9532 = null;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field9533;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field9536;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Lsp;")
    private class636 field9534;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 7)
    public static void method3852(int arg0) {
        field9532 = null;
        if (arg0 < 102) {
            field9532 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)Lsp;", line = 18)
    private final class636 method3853(boolean arg0) {
        if (this.field9534 == null) {
            this.field9534 = new class636();
        }
        field9537++;
        if (arg0) {
            this.field9534 = null;
        }
        return this.field9534;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lhaa;B)Lgb;", line = 33)
    public final class216 method3854(class81 arg0, byte arg1) {
        field9536++;
        if (arg0 == null) {
            return null;
        }
        class419 var3 = arg0.method112((byte) 62);
        if (class126.field2080 == var3) {
            return new class399((class142) arg0);
        } else if (class85.field1027 == var3) {
            return new class306(this.method3853(false), (class423) arg0);
        } else if (class654.field8672 == var3) {
            return new class300(this.field9531, (class760) arg0);
        } else if (class277.field3866 == var3) {
            return new class497(this.field9531, (class295) arg0);
        } else if (class294.field4215 == var3) {
            return new class519(this.field9531, this.field9535, (class409) arg0);
        } else if (class555.field7295 == var3) {
            return new class373(this.field9531, this.field9535, (class27) arg0);
        } else {
            if (arg1 > -28) {
                this.field9535 = null;
            }
            if (class257.field3523 == var3) {
                return new class631(this.field9531, this.field9535, (class735) arg0);
            } else if (class21.field390 == var3) {
                return new class139(this.field9531, this.field9535, (class83) arg0);
            } else if (class546.field7216 == var3) {
                return new class186(this.field9531, (class15) arg0);
            } else if (class565.field7433 == var3) {
                return new class372(this.field9531, this.field9535, (class392) arg0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lwu;Lwu;)V", line = 85)
    public class683(class376 arg0, class376 arg1) {
        this.field9531 = arg0;
        this.field9535 = arg1;
    }
}
