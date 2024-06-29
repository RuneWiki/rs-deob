import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class766 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field10564 = 0;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "[Z")
    public static boolean[] field10567 = new boolean[100];

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
    public static int[] field10569 = new int[500];

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Ljja;")
    public static class120 field10565 = new class120();

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field10570;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field10571;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field10572;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field10573;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "[I")
    public static int[] field10568;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[Lnf;")
    public static class604[] field10566;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public static void method4218(byte arg0) {
        if (arg0 >= -84) {
            field10566 = null;
        }
        field10569 = null;
        field10566 = null;
        field10568 = null;
        field10567 = null;
        field10565 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lgj;Z)V")
    public static final void method4219(class662 arg0, boolean arg1) {
        field10571++;
        if (!arg1) {
            class181.field2834 = arg0.method3738(-1, "p11_full");
            class673.field9341 = arg0.method3738(-1, "p12_full");
            class684.field9515 = arg0.method3738(-1, "b12_full");
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static final void method4220(int arg0) {
        if (arg0 <= 73) {
            method4219(null, false);
        }
        field10570++;
        class43 var1 = class220.field3227;
        synchronized (class220.field3227) {
            class220.field3227.method272(20);
        }
        class43 var2 = class23.field479;
        synchronized (class23.field479) {
            class23.field479.method272(20);
        }
    }
}
