import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class208 extends class499 {

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public int field2941 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public int field2944 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public int field2943 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!en", name = "r", descriptor = "I")
    public int field2945 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!en", name = "v", descriptor = "I")
    public int field2949 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    public int field2953 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public int field2947 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    public int field2952 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!en", name = "w", descriptor = "Lls;")
    public class92 field2950;

    @OriginalMember(owner = "client!en", name = "u", descriptor = "Z")
    public static boolean field2948 = false;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "[I")
    public static int[] field2942 = new int[1000];

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(B)V")
    public static void method1262(byte arg0) {
        field2942 = null;
        if (arg0 >= -33) {
            method1262((byte) 59);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)Z")
    public final boolean method1263(int arg0, int arg1, byte arg2) {
        if (arg2 < 33) {
            this.field2947 = -109;
        }
        field2946++;
        if (this.field2941 <= arg0 && arg0 <= this.field2952 && this.field2953 <= arg1 && arg1 <= this.field2947) {
            return true;
        } else {
            return arg0 >= this.field2944 && this.field2943 >= arg0 && this.field2949 <= arg1 && arg1 <= this.field2945;
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lls;)V")
    public class208(class92 arg0) {
        this.field2950 = arg0;
    }
}
