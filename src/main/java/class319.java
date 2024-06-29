import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class319 extends class189 {

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "Ljava/lang/Object;")
    private Object field4890;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "Lpg;")
    public static class492 field4891 = new class492(55, 4);

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "[I")
    public static int[] field4893 = new int[6];

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "[I")
    public static int[] field4894 = new int[1];

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)Lob;")
    public static final class266 method2069(int arg0, boolean arg1) {
        field4892++;
        if (!arg1) {
            field4894 = null;
        }
        class266[] var2 = class156.method1008(arg1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class266 var4 = var2[var3];
            if (var4.field3708 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
    public static void method2070(byte arg0) {
        field4894 = null;
        field4891 = null;
        int var1 = -54 % ((arg0 + 42) / 50);
        field4893 = null;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method580(byte arg0) {
        field4889++;
        return arg0 >= -56 ? null : this.field4890;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)Z")
    public final boolean method579(int arg0) {
        field4895++;
        return arg0 != 71;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class319(Object arg0, int arg1) {
        super(arg1);
        this.field4890 = arg0;
    }
}
