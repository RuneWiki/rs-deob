import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class379 {

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public int field4865;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "Ljava/lang/String;")
    public String field4867;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "Ljava/lang/String;")
    public String field4866;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "J")
    public long field4864;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "Lcga;")
    public static class449 field4870 = new class449(4, 1);

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "Liba;")
    public static class495 field4871;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
    public static void method2183(byte arg0) {
        if (arg0 <= 86) {
            field4871 = null;
        }
        field4870 = null;
        field4871 = null;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIII)I")
    public static final int method2184(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4868++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (arg2 == var4) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class379(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field4865 = arg2;
        this.field4867 = arg3;
        this.field4866 = arg1;
        this.field4864 = arg4;
        this.field4869 = arg0;
    }
}
