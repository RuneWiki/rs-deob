import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class110 {

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "Lcq;")
    public static class110 field1174 = new class110(35, 8);

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field1178 = 0;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "Z")
    public static boolean field1180 = false;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V", line = 3)
    public static void method592(boolean arg0) {
        if (arg0) {
            field1174 = null;
        }
        field1174 = null;
    }

    @OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        field1175++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)I", line = 30)
    public final int method593(byte arg0) {
        if (arg0 != 89) {
            method592(false);
        }
        field1177++;
        return this.field1179;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(II)V", line = 46)
    public class110(int arg0, int arg1) {
        this.field1179 = arg0;
        this.field1176 = arg1;
    }
}
