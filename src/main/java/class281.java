import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class281 {

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Z")
    public static boolean field4615 = false;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "Lci;")
    public static class327 field4616 = new class327();

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4619 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 16)
    public static void method2069(int arg0) {
        if (arg0 != -17343) {
            method2070(86, -70, 47, -115);
        }
        field4616 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)V", line = 28)
    public static final void method2070(int arg0, int arg1, int arg2, int arg3) {
        field4618++;
        if (arg3 == 0) {
            class176.field2826++;
            class36.field520.method2228(229, 16547);
        }
        if (arg3 == 1) {
            class36.field520.method2228(95, 16547);
            class255.field4297++;
        }
        if (arg0 > 15) {
            class36.field520.method1719(class93.field1562 + arg1, 128);
            class36.field520.method1728(++class277.field4565, (byte) -120);
            class36.field520.method1721(124, class240.field3972[82] ? 1 : 0);
            class36.field520.method1731(-96, arg2 + class275.field4546);
        }
    }
}
