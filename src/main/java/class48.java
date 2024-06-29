import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class48 extends class274 {

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Ljava/lang/Object;")
    private Object field563;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field559 = 0;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
    public static int field561 = -1;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
    public static int field562 = 0;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "[I")
    public static int[] field560;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(B)V", line = 5)
    public static void method296(byte arg0) {
        field560 = null;
        int var1 = -106 % ((-arg0 - 27) / 35);
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)Z", line = 17)
    public final boolean method297(int arg0) {
        if (arg0 != 264559256) {
            method296((byte) -112);
        }
        field558++;
        return false;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 28)
    public final Object method298(byte arg0) {
        field564++;
        if (arg0 > -38) {
            field562 = 71;
        }
        return this.field563;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 44)
    public class48(Object arg0) {
        this.field563 = arg0;
    }
}
