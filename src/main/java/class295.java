import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class295 {

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public int field4414;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public int field4415;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lwn;")
    public static class519 field4417 = new class519(new byte[5000]);

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)Lmf;", line = 4)
    public final class295 method1898(int arg0, byte arg1) {
        if (arg1 == 82) {
            field4412++;
            return new class295(this.field4414, arg0, this.field4415, this.field4416);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V", line = 16)
    public static void method1899(boolean arg0) {
        if (arg0) {
            field4413 = -98;
        }
        field4417 = null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIII)V", line = 31)
    public class295(int arg0, int arg1, int arg2, int arg3) {
        this.field4414 = arg0;
        this.field4416 = arg3;
        this.field4415 = arg2;
        this.field4411 = arg1;
    }
}
