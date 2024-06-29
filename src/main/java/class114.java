import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class114 extends class237 {

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Ljava/lang/String;")
    public String field1636;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field1634 = 100;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[I")
    public static int[] field1633 = new int[32];

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Lrj;")
    public static final class233 method746(int arg0, int arg1, int arg2) {
        class233 var3 = (class233) class141.field2239.method708((long) arg2 << 32 | (long) arg0, 7);
        if (arg1 != 1228126432) {
            field1634 = -65;
        }
        if (var3 == null) {
            var3 = new class233(arg2, arg0);
            class141.field2239.method707(var3.field3923, var3, (byte) 120);
        }
        field1635++;
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public static void method747(int arg0) {
        field1633 = null;
        if (arg0 != 100) {
            field1633 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)V")
    public static final void method748(int arg0, int arg1, int arg2) {
        field1632++;
        int var3 = 95 % ((arg1 - 46) / 47);
        class226.field3639 = (float) arg0;
        if (class283.field4513 == 2) {
            class242.field3986 = arg2;
            class23.field311 = arg0;
        }
        class238.field3933 = (float) arg2;
        class119.method780((byte) 96);
        class253.field4120 = true;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class114() {
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class114(String arg0, int arg1) {
        this.field1636 = arg0;
    }
}
