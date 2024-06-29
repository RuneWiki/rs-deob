import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class312 extends class98 {

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "Lkw;")
    public class228 field4912;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "Lrl;")
    public static class672 field4909 = new class672(82, -1);

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "Lrl;")
    public static class672 field4910 = new class672(6, 7);

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "Lhga;")
    public static class158 field4911 = new class158(71, 8);

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "Z")
    public static boolean field4913 = false;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 4)
    public static void method2135(int arg0) {
        field4909 = null;
        field4911 = null;
        int var1 = 18 / ((arg0 - 15) / 56);
        field4910 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lkw;I)V", line = 29)
    public class312(class228 arg0, int arg1) {
        this.field4912 = arg0;
        this.field4907 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Z")
    public abstract boolean method2136(int arg0);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2137(byte arg0);
}
