import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class313 implements class409 {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Ldj;")
    public static class703 field4236 = new class703(15, 0, 1, 0);

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Llc;")
    public static class435 field4237 = new class435(0, -2);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "[[Lqk;")
    public static class146[][] field4239;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Lhr;")
    public final class57 method478(int arg0) {
        field4235++;
        return arg0 < 30 ? null : class758.field10545;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static void method1935(int arg0) {
        field4236 = null;
        int var1 = 67 % ((arg0 + 67) / 33);
        field4239 = null;
        field4237 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I)V")
    public class313(int arg0) {
        this.field4238 = arg0;
    }
}
