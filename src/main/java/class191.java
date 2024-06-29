import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class191 {

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "F")
    public static float field2746;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public static final void method1342(byte arg0) {
        class510 var1 = class496.field7066;
        synchronized (class496.field7066) {
            class496.field7066.method3050(false);
        }
        if (arg0 < 79) {
            field2746 = 0.7176474F;
        }
        field2744++;
        class510 var2 = class313.field4417;
        synchronized (class313.field4417) {
            class313.field4417.method3050(false);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public static final void method1343(int arg0) {
        field2745++;
        class34.field457 = class476.method2870(true, 8, 8, 35, 2048, 4, 0.4F, arg0 + 18595);
        if (arg0 != -18538) {
            field2746 = 1.1896929F;
        }
    }
}
