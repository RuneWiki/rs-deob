import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class758 {

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public static int field10532 = 0;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Z")
    public static boolean field10534 = false;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "[F")
    public static float[] field10535 = new float[16];

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "[S")
    private static short[] field10536 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field10538 = -1;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "[I")
    public static int[] field10531 = new int[5];

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "[S")
    private static short[] field10537 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "[S")
    private static short[] field10541 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "[[S")
    public static short[][] field10533 = new short[][] { field10541, field10537, field10536 };

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field10539;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field10540;

    @OriginalMember(owner = "client!ms", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field10540++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V", line = 20)
    public static void method4208(boolean arg0) {
        field10535 = null;
        field10537 = null;
        field10541 = null;
        field10533 = null;
        field10531 = null;
        if (arg0) {
            field10536 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V", line = 36)
    public static final void method4209(int arg0, int arg1) {
        field10539++;
        class592 var2 = class682.method3825(-652872096, 8, arg1);
        if (arg0 > -53) {
            method4209(-72, -126);
        }
        var2.method3350(0);
    }
}
