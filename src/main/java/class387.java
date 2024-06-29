import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class387 implements class178 {

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public int field5592;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field5594 = 0;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "[I")
    public static int[] field5595 = new int[16];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Lss;")
    public static class506 field5590;

    @OriginalMember(owner = "client!sm", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field5589++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 30)
    public class387(String arg0, int arg1) {
        this.field5592 = arg1;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 42)
    public static void method2378(int arg0) {
        int var1 = 38 % ((-arg0 - 18) / 37);
        field5590 = null;
        field5595 = null;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 56)
    public static final void method2379(int arg0) {
        if (class334.field4532 != -1) {
            class175.method1260(-1, -39, class334.field4532, -1, false);
            class334.field4532 = -1;
        }
        field5593++;
        int var1 = -84 % ((arg0 + 48) / 39);
    }
}
