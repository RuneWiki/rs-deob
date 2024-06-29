import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class560 extends InputStream {

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "[Lvga;")
    public static class82[] field7943 = new class82[14];

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "[I")
    public static int[] field7940 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "Lbea;")
    public static class539 field7946 = new class539();

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field7941;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field7942;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field7944;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
    public static int field7945;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static void method3248(int arg0) {
        if (arg0 != 39) {
            method3249((byte) -82);
        }
        field7946 = null;
        field7943 = null;
        field7940 = null;
    }

    @OriginalMember(owner = "client!hp", name = "read", descriptor = "()I")
    public final int read() {
        class484.method2932(true, 30000L);
        field7942++;
        return -1;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public static final void method3249(byte arg0) {
        class625.field8753 = null;
        class483.field6963 = null;
        class449.field6553 = null;
        class505.field7372 = null;
        if (arg0 != 111) {
            field7940 = null;
        }
        class193.field3340 = null;
        class97.field1435 = null;
        class629.field8846 = null;
        class421.field6175 = null;
        field7945++;
        class358.field5450 = null;
    }
}
