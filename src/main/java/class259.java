import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class259 extends RuntimeException {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Ljava/lang/String;")
    public String field3843;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3849;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3840 = 0;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3844 = null;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "[I")
    public static int[] field3846 = new int[32];

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3848 = "purple:";

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[Lwd;")
    public static class88[] field3845;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method1793(int arg0, int arg1, int arg2, int arg3) {
        field3841++;
        if (arg0 == 24017) {
            class170 var4 = class221.method1613(9, arg2, -8410);
            var4.method1269(false);
            var4.field2734 = arg3;
            var4.field2730 = arg1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 20)
    public static void method1794(int arg0) {
        field3844 = null;
        field3845 = null;
        field3848 = null;
        field3846 = null;
        if (arg0 <= 112) {
            field3842 = 6;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 58)
    public class259(Throwable arg0, String arg1) {
        this.field3843 = arg1;
        this.field3849 = arg0;
    }
}
