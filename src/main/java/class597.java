import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class597 extends InputStream {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Leda;")
    public static class116 field8632 = new class116(60, 3);

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[I")
    public static int[] field8635 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Lvh;")
    public static class125 field8636 = new class125(79, -1);

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "F")
    public static float field8634;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field8637;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 7)
    public static void method3414(byte arg0) {
        field8632 = null;
        field8636 = null;
        field8635 = null;
        if (arg0 <= 80) {
            field8633 = 80;
        }
    }

    @OriginalMember(owner = "client!cm", name = "read", descriptor = "()I", line = 25)
    public final int read() {
        class564.method3300((byte) -65, 30000L);
        field8637++;
        return -1;
    }
}
