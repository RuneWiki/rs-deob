import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class572 implements class422 {

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "Ljava/lang/String;")
    private String field8056;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "Ldg;")
    public static class376 field8051 = new class376(8, -1);

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field8055 = 0;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "F")
    public static float field8049;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lfga;")
    public static class229 field8054;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "Z")
    private boolean field8053;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)I")
    public final int method640(int arg0) {
        field8050++;
        int var2 = class145.method1034(125, this.field8056);
        if (arg0 != 11442) {
            this.method640(38);
        }
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field8053 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)Z")
    public final boolean method3252(byte arg0) {
        field8057++;
        return arg0 <= 44 ? false : this.field8053;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)Lvj;")
    public final class405 method638(byte arg0) {
        int var2 = 31 / ((67 - arg0) / 45);
        field8052++;
        return class405.field5934;
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)V")
    public static void method3253(byte arg0) {
        field8054 = null;
        field8051 = null;
        if (arg0 != 118) {
            field8054 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class572(String arg0) {
        this.field8056 = arg0;
    }
}
