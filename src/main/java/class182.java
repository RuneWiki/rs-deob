import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class182 {

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Lpu;")
    private class411 field2880;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field2878 = 0;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Ljp;")
    private class276 field2874;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "Lit;")
    public static class514 field2881;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)Ljp;", line = 5)
    public final class276 method1233(byte arg0) {
        field2879++;
        class276 var2 = this.field2874;
        if (this.field2880.field6207 == var2) {
            this.field2874 = null;
            return null;
        } else if (arg0 == -1) {
            this.field2874 = var2.field4535;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V", line = 43)
    public static void method1234(byte arg0) {
        if (arg0 == 96) {
            field2881 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V", line = 55)
    public class182() {
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Ljp;", line = 58)
    public final class276 method1235(int arg0) {
        if (arg0 != 0) {
            this.method1236((byte) 62, null);
        }
        field2882++;
        class276 var2 = this.field2880.field6207.field4535;
        if (this.field2880.field6207 == var2) {
            this.field2874 = null;
            return null;
        } else {
            this.field2874 = var2.field4535;
            return var2;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lpu;)V", line = 79)
    public class182(class411 arg0) {
        this.field2880 = arg0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BLpu;)V", line = 87)
    public final void method1236(byte arg0, class411 arg1) {
        field2873++;
        if (arg0 > -12) {
            field2876 = -47;
        }
        this.field2880 = arg1;
    }
}
