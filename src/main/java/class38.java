import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class38 extends class36 {

    @OriginalMember(owner = "mapview!w", name = "o", descriptor = "Lr;")
    public static class33 field507 = class29.method192("Estate Agent", (byte) 126);

    @OriginalMember(owner = "mapview!w", name = "p", descriptor = "Lr;")
    public static class33 field508 = class29.method192("Platebody Shop", (byte) 126);

    @OriginalMember(owner = "mapview!w", name = "s", descriptor = "I")
    public static volatile int field511 = 0;

    @OriginalMember(owner = "mapview!w", name = "r", descriptor = "Lr;")
    public static class33 field510 = class29.method192("Clothes Shop", (byte) 126);

    @OriginalMember(owner = "mapview!w", name = "n", descriptor = "Lr;")
    public class33 field506;

    @OriginalMember(owner = "mapview!w", name = "q", descriptor = "Lb;")
    public static class3 field509;

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "(I)V", line = 17)
    public static final void method253(int arg0) {
        if (class35.field483 != null) {
            class25 var1 = class35.field483;
            synchronized (class35.field483) {
                class35.field483 = null;
            }
        }
        if (arg0 > -56) {
            field507 = null;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(B)V", line = 33)
    public static void method254(byte arg0) {
        field510 = null;
        field507 = null;
        field509 = null;
        if (arg0 != -60) {
            field509 = null;
        }
        field508 = null;
    }
}
