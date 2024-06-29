import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class419 extends class424 {

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "S")
    public short field5426;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "[Lga;")
    public static class63[] field5425 = new class63[14];

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lfs;")
    public static class546 field5427 = new class546("WTRC", 1);

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lfl;")
    public static class103 field5431 = new class103(6, 1);

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Law;")
    public static class506 field5430;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method2417(int arg0) {
        field5429++;
        if (arg0 != 1) {
            field5427 = null;
        }
        if (class280.field3665 != class119.field1536) {
            try {
                class92.method688(-13381, "tbrefresh", class381.field4890);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class419() {
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method2418(byte arg0) {
        field5425 = null;
        field5431 = null;
        field5430 = null;
        field5427 = null;
        if (arg0 < 35) {
            method2418((byte) -68);
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(S)V")
    public class419(short arg0) {
        this.field5426 = arg0;
    }
}
