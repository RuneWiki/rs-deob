import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class41 extends InputStream {

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "Lut;")
    public static class719 field473 = new class719();

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "Lgh;")
    public static class54 field474 = new class54(6, 0, 4, 2);

    @OriginalMember(owner = "client!fka", name = "d", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "Lwm;")
    public static class30 field472;

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(B)V")
    public static void method253(byte arg0) {
        field473 = null;
        int var1 = -56 / ((-arg0 - 22) / 50);
        field474 = null;
        field472 = null;
    }

    @OriginalMember(owner = "client!fka", name = "read", descriptor = "()I")
    public final int read() {
        class591.method3181(30000L, 0);
        field475++;
        return -1;
    }
}
