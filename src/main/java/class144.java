import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class144 implements class419 {

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "Ljava/lang/String;")
    private String field1738;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "[I")
    public static int[] field1739 = new int[4096];

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "Lws;")
    public static class333 field1743 = new class333();

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "Z")
    private boolean field1741;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V")
    public static void method906(int arg0) {
        field1743 = null;
        int var1 = 11 % ((arg0 - 39) / 42);
        field1739 = null;
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)Z")
    public final boolean method907(int arg0) {
        if (arg0 == 19288) {
            field1742++;
            return this.field1741;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)Ldda;")
    public final class354 method908(byte arg0) {
        field1740++;
        int var2 = 15 % ((arg0 - 26) / 46);
        return class354.field4575;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class144(String arg0) {
        this.field1738 = arg0;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)I")
    public final int method909(int arg0) {
        field1737++;
        int var2 = class248.method1484(this.field1738, 8580);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        }
        this.field1741 = true;
        if (arg0 != -1038) {
            field1743 = null;
        }
        return 100;
    }
}
