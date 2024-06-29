import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class309 {

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "Z")
    public static boolean field4266 = false;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Z")
    public static boolean field4268 = false;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "Llu;")
    public static class610 field4267 = new class610(77, 0);

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public int field4270;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "Ljava/lang/String;")
    public String field4263;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "[I")
    public static int[] field4265;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 3)
    public static void method1889(int arg0) {
        if (arg0 == 0) {
            field4267 = null;
            field4265 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lgba;BI)V", line = 19)
    public static final void method1890(class574 arg0, byte arg1, int arg2) {
        field4264++;
        if (arg1 <= 105) {
            method1889(-120);
        }
        class56.field662 = false;
        class580.field8538 = 0;
        class22.method139((byte) 38, arg0);
        class388.method2308(-1, arg0);
        if (class56.field662) {
            System.out.println("---endgpp---");
        }
        if (arg0.field2177 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field2177 + " psize:" + arg2);
        }
    }
}
