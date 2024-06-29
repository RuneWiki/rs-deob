import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class292 {

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Ljava/lang/String;")
    public String field4493;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Z")
    public static boolean field4487 = false;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "Lcb;")
    public static class631 field4495 = new class631(79, 7);

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "Leda;")
    public static class14 field4496 = new class14(3000000, 200);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!cr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4488++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
    public static final void method1900(int arg0, int arg1) {
        field4492++;
        if (class118.method934(arg1, 59) && arg0 == 1592) {
            class680.method3795((byte) -38, -1, class158.field2453[arg1]);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
    public static void method1901(int arg0) {
        field4495 = null;
        field4496 = null;
        int var1 = 105 % ((arg0 - 62) / 41);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
    public static final void method1902(int arg0, Rectangle[] arg1, int arg2) throws class556 {
        if (class554.field7897 == 1) {
            class13.field119.method1272(arg1, arg0, class26.field268, class560.field7941);
        } else {
            class13.field119.method1272(arg1, arg0, 0, 0);
        }
        if (arg2 == 7) {
            field4490++;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Lsr;")
    public static final class540 method1903(byte arg0) {
        if (arg0 > -25) {
            return null;
        } else {
            field4491++;
            return class135.field2155 == 0 ? new class540() : class629.field8850[--class135.field2155];
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1904(int arg0, String arg1, String arg2, int arg3) {
        if (arg3 >= -8) {
            field4487 = false;
        }
        field4489++;
        class377.field5674 = 2;
        class355.field5377 = arg0;
        class723.method3986((byte) -87, arg2, arg1, false);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class292(String arg0, int arg1) {
        this.field4494 = arg1;
        this.field4493 = arg0;
    }
}
