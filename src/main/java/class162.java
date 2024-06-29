import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class162 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Ljava/lang/String;")
    public String field2741;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "[I")
    public static int[] field2745 = new int[13];

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lhga;")
    public static class158 field2744 = new class158(53, 8);

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "F")
    public static float field2746 = 1024.0F;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!ei", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2740++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
    public static void method1322(byte arg0) {
        field2744 = null;
        field2745 = null;
        if (arg0 != -62) {
            method1322((byte) -20);
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class162(String arg0, int arg1) {
        this.field2741 = arg0;
        this.field2742 = arg1;
    }
}
