import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class165 extends RuntimeException {

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2599;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Ljava/lang/String;")
    public String field2598;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lma;II)V")
    public static final void method1107(class202 arg0, int arg1, int arg2) {
        field2596++;
        if (class93.field1416 != null) {
            try {
                class93.field1416.method1679(0L, 0);
                class93.field1416.method1681(24, arg1 - 3941, arg0.field3234, arg2);
            } catch (Exception var3) {
            }
        }
        if (arg1 != 3940) {
            method1109(true);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)Z")
    public static final boolean method1108(int arg0) {
        field2601++;
        if (arg0 != 0) {
            method1108(93);
        }
        return class225.field3571;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class165(Throwable arg0, String arg1) {
        this.field2599 = arg0;
        this.field2598 = arg1;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static final void method1109(boolean arg0) {
        field2597++;
        if (!arg0) {
            field2603 = 4;
        }
        class87.field1360.method145(-111);
        class33.field412.method145(-97);
        class27.field342.method145(-87);
    }
}
