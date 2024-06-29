import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class219 {

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "Z")
    public static boolean field2837 = false;

    @OriginalMember(owner = "client!cha", name = "e", descriptor = "[F")
    public static float[] field2839 = new float[4];

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "[[[Z")
    public static boolean[][][] field2838;

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(I)V")
    public static final void method1242(int arg0) {
        class362.field4796.method1575((byte) 60);
        field2835++;
        if (arg0 != 0) {
            method1244((byte) -71, true);
        }
    }

    @OriginalMember(owner = "client!cha", name = "b", descriptor = "(I)V")
    public static void method1243(int arg0) {
        if (arg0 != 0) {
            method1244((byte) -103, false);
        }
        field2838 = null;
        field2839 = null;
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(BZ)V")
    public static final void method1244(byte arg0, boolean arg1) {
        field2836++;
        if (class633.field8786 == null) {
            class736.method4124(0);
        }
        int var2 = -81 / ((arg0 + 70) / 42);
        if (arg1) {
            class633.field8786.method1171(-7423);
        }
    }
}
