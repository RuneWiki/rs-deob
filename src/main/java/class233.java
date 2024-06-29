import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class233 extends InputStream {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Lsb;")
    public static class266 field3485 = new class266(55, 3);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ok", name = "read", descriptor = "()I")
    public final int read() {
        class185.method1354(30000L, 10);
        field3486++;
        return -1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Z")
    public static final boolean method1571(int arg0, int arg1) {
        int var2 = 19 / ((arg1 - 19) / 50);
        field3487++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method1572(int arg0) {
        field3485 = null;
        if (arg0 != 3) {
            method1571(-4, 85);
        }
    }
}
