import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class747 extends class785 {

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "[Lpo;")
    public class585[] field10372;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lbt;")
    public static class48 field10371;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lafa;")
    public static class364[] field10373;

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "([Lpo;)V")
    public class747(class585[] arg0) {
        this.field10372 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method4174(byte arg0) {
        field10371 = null;
        if (arg0 > 12) {
            field10373 = null;
        }
    }
}
