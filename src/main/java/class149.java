import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class149 extends class14 {

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public int field3089 = 0;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Lea;")
    public static class38 field3083 = class9.method46((byte) 113, "<col=ffffff>");

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Lea;")
    public static class38 field3087 = class9.method46((byte) 103, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "[I")
    public static int[] field3090 = new int[500];

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Lea;")
    private static class38 field3091 = class9.method46((byte) 122, "Please contact customer support)3");

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "Lea;")
    public static class38 field3085 = field3091;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "Ldd;")
    public static class32 field3086;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLhc;)V")
    public final void method1049(byte arg0, class66 arg1) {
        while (true) {
            int var3 = arg1.method509(124);
            if (var3 == 0) {
                if (arg0 < 102) {
                    return;
                }
                field3084++;
                return;
            }
            this.method1050(arg1, var3, -60);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lhc;II)V")
    private final void method1050(class66 arg0, int arg1, int arg2) {
        if (arg1 == 5) {
            this.field3089 = arg0.method511(-2);
        }
        field3088++;
        int var4 = 105 / ((76 - arg2) / 46);
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    public static void method1051(int arg0) {
        field3090 = null;
        field3091 = null;
        field3085 = null;
        if (arg0 == 500) {
            field3087 = null;
            field3083 = null;
            field3086 = null;
        }
    }
}
