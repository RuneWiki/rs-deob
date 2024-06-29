import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public abstract class class704 extends class4 {

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "I")
    public int field9796;

    @OriginalMember(owner = "client!mha", name = "u", descriptor = "Lcr;")
    public class294 field9799;

    @OriginalMember(owner = "client!mha", name = "t", descriptor = "Lrs;")
    public static class170 field9798 = new class170(0, 0);

    @OriginalMember(owner = "client!mha", name = "w", descriptor = "[[B")
    public static byte[][] field9801 = new byte[1000][];

    @OriginalMember(owner = "client!mha", name = "s", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!mha", name = "v", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)Z")
    public static final boolean method3966(byte arg0) {
        int var1 = 23 % ((-arg0 - 79) / 42);
        field9800++;
        return class102.field1401 >= 1;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lcea;B)V")
    public static final void method3967(class96 arg0, byte arg1) {
        field9797++;
        class457 var2 = (class457) class516.field7206.method812(119, (long) arg0.field7148);
        if (arg1 <= 45) {
            method3966((byte) 55);
        }
        if (var2 == null) {
            class38.method204(arg0, 0, null, arg0.field7197[0], arg0.field4408, -27170, null, arg0.field7198[0]);
        } else {
            var2.method2793((byte) 31);
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
    public static void method3968(int arg0) {
        if (arg0 < 48) {
            field9801 = null;
        }
        field9801 = null;
        field9798 = null;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Z)Z")
    public abstract boolean method2598(boolean arg0);

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lcr;I)V")
    public class704(class294 arg0, int arg1) {
        this.field9796 = arg1;
        this.field9799 = arg0;
    }

    @OriginalMember(owner = "client!mha", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2597(int arg0);
}
