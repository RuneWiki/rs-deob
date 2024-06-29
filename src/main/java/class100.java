import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class100 {

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lwo;")
    public static class690 field1339 = new class690(18, -1);

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1340 = new String[100];

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "[F")
    public static float[] field1343 = new float[4];

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V", line = 4)
    public static void method746(byte arg0) {
        field1339 = null;
        field1343 = null;
        if (arg0 > 46) {
            field1340 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method747(boolean arg0) {
        if (!arg0) {
            for (int var1 = 0; var1 < 100; var1++) {
                class89.field1253[var1] = true;
            }
            field1338++;
        }
    }
}
