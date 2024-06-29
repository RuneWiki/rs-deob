import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class600 {

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "[I")
    public static int[] field8418 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
    public static int field8419 = -1;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "J")
    public static long field8416;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "[[[B")
    public static byte[][][] field8417;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V", line = 10)
    public static void method3493(byte arg0) {
        if (arg0 < 97) {
            method3494((byte) 61, 23, -93);
        }
        field8418 = null;
        field8417 = null;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(BII)Z", line = 23)
    public static final boolean method3494(byte arg0, int arg1, int arg2) {
        if (arg0 == -52) {
            field8415++;
            return false;
        } else {
            return true;
        }
    }
}
