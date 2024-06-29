import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class281 {

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public int field4481;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field4480;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4471 = 0;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4477 = -1;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4472 = 0;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Llc;")
    public static class86 field4478;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIII)I")
    public static final int method1924(boolean arg0, int arg1, int arg2, int arg3) {
        field4479++;
        if (arg0) {
            field4472 = -52;
        }
        if (arg3 >= arg2) {
            return arg3 > arg1 ? arg1 : arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static final void method1925(byte arg0) {
        int var1 = -109 % ((3 - arg0) / 37);
        class213.field3406.method1558(-61);
        field4476++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)V")
    public static void method1926(boolean arg0) {
        field4478 = null;
        if (!arg0) {
            field4471 = 71;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class281() {
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Loh;)V")
    public class281(class281 arg0) {
        this.field4481 = arg0.field4481;
        this.field4473 = arg0.field4473;
        this.field4475 = arg0.field4475;
        this.field4480 = arg0.field4480;
    }
}
