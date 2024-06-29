import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class168 extends class496 {

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "S")
    public short field2272;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Lwca;")
    public static class311 field2273 = null;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lnj;")
    public static class487 field2274 = new class487("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lqp;")
    public static class586 field2275 = new class586(58, -1);

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[Lha;")
    public static class116[] field2276;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method1071(byte arg0) {
        if (arg0 == -114) {
            field2274 = null;
            field2273 = null;
            field2275 = null;
            field2276 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class168() {
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(S)V")
    public class168(short arg0) {
        this.field2272 = arg0;
    }
}
