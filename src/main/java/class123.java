import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class123 extends class81 {

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "Lkf;")
    public class186 field2420;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field2416 = 3;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field2415 = 0;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "[Z")
    public static boolean[] field2417 = new boolean[200];

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field2418 = 0;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "Llk;")
    public static class232 field2419 = new class232(64);

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field2421 = 1;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
    public static final void method935(int arg0, boolean arg1) {
        field2414++;
        if (class122.field2394 != arg1) {
            class122.field2394 = arg1;
            if (arg0 >= 101) {
                class99.method812(true);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lkf;)V")
    public class123(class186 arg0) {
        this.field2420 = arg0;
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
    public static void method936(int arg0) {
        if (arg0 == 200) {
            field2417 = null;
            field2419 = null;
        }
    }
}
