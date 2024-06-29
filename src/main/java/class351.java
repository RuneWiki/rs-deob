import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class351 {

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public int field5117;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    private int field5121;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field5115 = 0;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "Lqda;")
    public static class112 field5116;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[Lqda;")
    public static class112[] field5119;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public static void method2213(int arg0) {
        field5116 = null;
        if (arg0 == 0) {
            field5119 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5122++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)I")
    public final int method2214(int arg0) {
        field5120++;
        if (arg0 != -24340) {
            this.toString();
        }
        return this.field5121;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(II)V")
    public class351(int arg0, int arg1) {
        this.field5117 = arg1;
        this.field5121 = arg0;
    }
}
