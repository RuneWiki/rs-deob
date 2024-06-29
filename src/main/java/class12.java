import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 {

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field132 = " more options";

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "[I")
    public static int[] field126 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field133 = "wave2:";

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Lqk;")
    public class12 field128;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "Lqk;")
    public class12 field134;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Lra;")
    public static class57 field125;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[Lkh;")
    public static class11[] field130;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 8)
    public static void method95(int arg0) {
        if (arg0 > -52) {
            field127 = -58;
        }
        field130 = null;
        field126 = null;
        field132 = null;
        field125 = null;
        field133 = null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 22)
    public final void method96(int arg0) {
        field129++;
        if (this.field128 == null) {
            return;
        }
        if (arg0 != 3) {
            this.method96(-21);
        }
        this.field128.field134 = this.field134;
        this.field134.field128 = this.field128;
        this.field134 = null;
        this.field128 = null;
    }
}
