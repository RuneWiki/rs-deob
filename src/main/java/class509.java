import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class509 {

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Lnga;")
    private class510 field7259 = new class510(64);

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "Leq;")
    private class209 field7258;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "Leq;")
    private class209 field7256;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public static int field7255 = 13156520;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Ljs;", line = 15)
    public final class330 method3040(int arg0, int arg1) {
        field7257++;
        class330 var3 = (class330) this.field7259.method3054((byte) -101, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field7258.method1453(arg0 & 0x7FFF, 37, 0);
        } else {
            var4 = this.field7256.method1453(arg0, 23, 0);
        }
        class330 var5 = new class330();
        if (arg1 >= -69) {
            this.method3040(-48, 92);
        }
        if (var4 != null) {
            var5.method2103(new class35(var4), 0);
        }
        if (arg0 >= 32768) {
            var5.method2108(-14444);
        }
        this.field7259.method3047(false, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(ILeq;Leq;)V", line = 61)
    public class509(int arg0, class209 arg1, class209 arg2) {
        this.field7258 = arg2;
        this.field7256 = arg1;
        if (this.field7256 != null) {
            this.field7256.method1477(0, 0);
        }
        if (this.field7258 != null) {
            this.field7258.method1477(0, 0);
        }
    }
}
