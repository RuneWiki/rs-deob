import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class67 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lrc;")
    public static class9 field1115 = new class9(64);

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
    public static boolean field1117 = false;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field1119 = new Random();

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1121 = "glow1:";

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Ldl;")
    public static class46 field1120;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lcj;")
    public static class74 field1116;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method415(int arg0) {
        field1121 = null;
        field1116 = null;
        if (arg0 != 31321) {
            method415(71);
        }
        field1119 = null;
        field1115 = null;
        field1120 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLvh;)V")
    public static final void method416(byte arg0, class108 arg1) {
        field1114++;
        if (arg0 >= -26) {
            method416((byte) -12, (class108) null);
        }
        class78.field1336 = arg1;
    }
}
