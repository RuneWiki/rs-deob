import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class419 implements class711 {

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "Ljava/lang/String;")
    private String field6057;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "Lin;")
    private class91 field6058;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field6062 = 1405;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "Lkb;")
    public static class690 field6056;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "Lin;")
    public static class91 field6065;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "[[S")
    public static short[][] field6060;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V", line = 3)
    public static void method2578(byte arg0) {
        field6060 = null;
        field6056 = null;
        if (arg0 >= 36) {
            field6065 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lin;Ljava/lang/String;)V", line = 22)
    public class419(class91 arg0, String arg1) {
        this.field6057 = arg1;
        this.field6058 = arg0;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Lkea;", line = 31)
    public final class239 method1379(int arg0) {
        field6063++;
        if (arg0 != -15004) {
            method2578((byte) -110);
        }
        return class239.field3491;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I", line = 42)
    public final int method1377(int arg0) {
        field6059++;
        if (this.field6058.method866(100, this.field6057)) {
            return 100;
        } else {
            int var2 = 31 % ((-arg0 - 43) / 62);
            return this.field6058.method850(this.field6057, 0);
        }
    }
}
