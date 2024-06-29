import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class375 {

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "[Lab;")
    public static class669[] field5308 = new class669[8];

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "[I")
    public static int[] field5313 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "[Lga;")
    public static class404[] field5310;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "[[[Z")
    public static boolean[][][] field5307;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IB)I")
    public static final int method2371(int arg0, byte arg1) {
        if (arg1 != 69) {
            field5308 = null;
        }
        field5311++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method2372(int arg0) {
        field5307 = null;
        if (arg0 != 16711680) {
            field5308 = null;
        }
        field5310 = null;
        field5308 = null;
        field5313 = null;
    }
}
