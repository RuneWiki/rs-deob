import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class191 {

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Lqfa;")
    public static class98 field2549 = new class98(74, 0);

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field2553 = 503;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)V")
    public static final void method1189(int arg0, byte arg1) {
        field2550++;
        if (arg1 >= -12) {
            method1189(99, (byte) -114);
        }
        class592 var2 = class682.method3825(-652872096, 11, arg0);
        var2.method3350(0);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public static void method1190(byte arg0) {
        field2549 = null;
        if (arg0 > -38) {
            field2553 = 62;
        }
    }
}
