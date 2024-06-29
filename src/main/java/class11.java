import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class11 extends class216 {

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "Ljava/lang/Object;")
    private Object field138;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "Lqp;")
    public static class441 field133;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field137;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 5)
    public static final void method58(int arg0, int arg1) {
        if (arg1 != 65535) {
            method58(8, -60);
        }
        for (class435 var2 = class511.field7608.method2815(arg1 - 65535); var2 != null; var2 = class511.field7608.method2814(arg1 ^ 0xFFFB)) {
            if ((long) arg0 == (var2.field6265 >> 48 & 0xFFFFL)) {
                var2.method2549((byte) -85);
            }
        }
        field136++;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 30)
    public final Object method59(int arg0) {
        if (arg0 != -26235) {
            field133 = null;
        }
        field135++;
        return this.field138;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ler;Ljava/lang/Object;I)V", line = 42)
    public class11(class209 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field138 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)V", line = 50)
    public static void method60(byte arg0) {
        int var1 = -17 % ((arg0 - 11) / 57);
        field137 = null;
        field133 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Z", line = 62)
    public final boolean method61(int arg0) {
        if (arg0 <= 120) {
            method60((byte) -39);
        }
        field134++;
        return false;
    }
}
