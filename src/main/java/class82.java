import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class82 {

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "Lai;")
    private class597 field856;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Ldh;")
    public static class320 field854 = new class320(0, -2);

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "Lqb;")
    public static class224 field857;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "Lha;")
    public static class58 field858;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)Ljava/lang/String;", line = 6)
    public static final String method574(byte arg0) {
        field855++;
        if (class149.field1652 || class10.field74 == null) {
            return "";
        } else if ((class10.field74.field9269 == null || class10.field74.field9269.length() == 0) && class10.field74.field9280 != null && class10.field74.field9280.length() > 0) {
            return class10.field74.field9280;
        } else if (arg0 >= -56) {
            return null;
        } else {
            return class10.field74.field9269;
        }
    }

    @OriginalMember(owner = "client!kca", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        field853++;
        this.field856.method3400(this.field852, (byte) -127);
        super.finalize();
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(B)V", line = 45)
    public static void method575(byte arg0) {
        field858 = null;
        field854 = null;
        int var1 = -27 % ((arg0 - 48) / 40);
        field857 = null;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lai;II)V", line = 55)
    public class82(class597 arg0, int arg1, int arg2) {
        this.field856 = arg0;
        this.field852 = arg2;
    }
}
