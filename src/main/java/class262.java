import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class262 extends InputStream {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Lin;")
    public static class380 field3707 = new class380(68, 8);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3709 = -1;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!rb", name = "read", descriptor = "()I")
    public final int read() {
        class579.method3405(30000L, 10);
        field3710++;
        return -1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1698(int arg0) {
        field3707 = null;
        int var1 = 93 % ((arg0 - 18) / 41);
    }
}
