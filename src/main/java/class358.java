import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class358 implements class196 {

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public int field4747;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Llh;")
    public static class487 field4748 = new class487(44, 6);

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "Z")
    public static boolean field4749 = false;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V", line = 3)
    public static void method2049(int arg0) {
        if (arg0 == -17823) {
            field4748 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Loh;", line = 13)
    public final class370 method640(int arg0) {
        field4746++;
        if (arg0 != 58) {
            this.field4747 = -121;
        }
        return class417.field5884;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(I)V", line = 25)
    public class358(int arg0) {
        this.field4747 = arg0;
    }
}
