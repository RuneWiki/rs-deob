import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class616 {

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "[I")
    public static int[] field9114 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lada;")
    public static class144 field9111 = new class144(48, -1);

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Llu;")
    public static class610 field9115 = new class610(23, 4);

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "[I")
    public static int[] field9116 = new int[1];

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field9109;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field9110;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field9112;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!hn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9109++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static void method3611(int arg0) {
        field9115 = null;
        if (arg0 != 29837) {
            method3611(-102);
        }
        field9116 = null;
        field9111 = null;
        field9114 = null;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)Z")
    public final boolean method3612(int arg0) {
        field9112++;
        int var2 = 81 % ((-arg0 - 10) / 59);
        return class457.field6465 == this | class37.field450 == this;
    }
}
