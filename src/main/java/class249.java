import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class249 implements class496 {

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Lae;")
    private class283 field3701;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Ljn;")
    public static class134 field3703 = new class134(37, 6);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)I")
    public final int method690(byte arg0) {
        field3699++;
        if (this.field3701.method1851(118)) {
            return 100;
        } else {
            if (arg0 >= -7) {
                this.method690((byte) 80);
            }
            return this.field3701.method1853(-11168);
        }
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    public static void method1675(int arg0) {
        field3703 = null;
        if (arg0 != 6) {
            method1675(15);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Ljea;")
    public final class248 method693(int arg0) {
        field3702++;
        if (arg0 <= 103) {
            field3700 = -123;
        }
        return class248.field3687;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lae;)V")
    public class249(class283 arg0) {
        this.field3701 = arg0;
    }
}
