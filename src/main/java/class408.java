import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class408 extends class425 {

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "S")
    public short field5906;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lsb;")
    public static class266 field5905 = new class266(0, -1);

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lhga;")
    public static class158 field5908 = new class158();

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "F")
    public static float field5907;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[[B")
    public static byte[][] field5904;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method2497(byte arg0) {
        field5908 = null;
        field5905 = null;
        field5904 = null;
        if (arg0 >= -73) {
            field5907 = -0.01472022F;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class408() {
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(S)V")
    public class408(short arg0) {
        this.field5906 = arg0;
    }
}
