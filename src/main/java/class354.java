import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class354 {

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "Ldda;")
    public static class354 field4570 = new class354();

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Ldda;")
    public static class354 field4572 = new class354();

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "Ldda;")
    public static class354 field4573 = new class354();

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "Ldda;")
    public static class354 field4575 = new class354();

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "Lue;")
    public static class218 field4577;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIZ)Lvd;")
    public static final class36 method2029(int arg0, int arg1, boolean arg2) {
        if (arg1 == Integer.MIN_VALUE) {
            field4571++;
            long var3 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg0);
            return (class36) class117.field1453.method3828(var3, (byte) -91);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4574++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
    public static void method2030(int arg0) {
        field4575 = null;
        field4577 = null;
        int var1 = 50 % ((arg0 + 53) / 57);
        field4572 = null;
        field4573 = null;
        field4570 = null;
    }
}
