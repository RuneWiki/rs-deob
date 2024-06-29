import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class384 extends class513 {

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "S")
    public short field5118;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "Lfca;")
    public static class75 field5117 = new class75(1);

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "Ljn;")
    public static class668 field5115;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "Ljn;")
    public static class668 field5116;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V", line = 10)
    public static void method2205(byte arg0) {
        if (arg0 < 13) {
            field5115 = null;
        }
        field5116 = null;
        field5117 = null;
        field5115 = null;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "()V", line = 27)
    public class384() {
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(S)V", line = 29)
    public class384(short arg0) {
        this.field5118 = arg0;
    }
}
