import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class308 extends class619 {

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field4357;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field4354 = 0;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method1999(int arg0) {
        field4356++;
        if (arg0 != 9) {
            field4359 = 52;
        }
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class308(Object arg0, int arg1) {
        super(arg1);
        this.field4357 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V", line = 23)
    public static final void method2000(int arg0, byte arg1) {
        field4355++;
        if (arg1 != 74) {
            method2000(-116, (byte) -58);
        }
        class510 var2 = class620.field8954;
        synchronized (class620.field8954) {
            class620.field8954.method3049(arg0, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)Ljava/lang/Object;", line = 39)
    public final Object method2001(int arg0) {
        field4353++;
        if (arg0 != 9) {
            this.method2001(104);
        }
        return this.field4357;
    }
}
