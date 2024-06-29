import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class542 implements class343 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lsea;")
    private class648 field7335;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Lfc;")
    public static class235 field7336 = new class235("WTRC", 1);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lav;")
    public static class593 field7338;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Lmv;", line = 3)
    public final class342 method302(byte arg0) {
        field7337++;
        return arg0 > -88 ? null : class342.field4583;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 22)
    public static void method3062(int arg0) {
        field7336 = null;
        if (arg0 <= -78) {
            field7338 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lsea;)V", line = 37)
    public class542(class648 arg0) {
        this.field7335 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)I", line = 45)
    public final int method301(int arg0) {
        if (arg0 != 28158) {
            method3062(28);
        }
        field7339++;
        return this.field7335.method3620((byte) 2) ? 100 : this.field7335.method3647(2);
    }
}
