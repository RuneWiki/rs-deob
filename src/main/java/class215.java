import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class215 implements class351 {

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "Lgj;")
    private class662 field3190;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "[I")
    public static int[] field3193 = new int[5];

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
    public static int field3195 = 0;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "Lgj;")
    public static class662 field3192;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Lgb;")
    public final class228 method1499(int arg0) {
        field3191++;
        return arg0 == 27291 ? class228.field3320 : null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V")
    public static void method1500(boolean arg0) {
        field3193 = null;
        if (!arg0) {
            method1500(true);
        }
        field3192 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)I")
    public final int method1501(byte arg0) {
        if (arg0 != 5) {
            this.method1501((byte) -60);
        }
        field3189++;
        return this.field3190.method3721(false) ? 100 : this.field3190.method3722((byte) 107);
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lgj;)V")
    public class215(class662 arg0) {
        this.field3190 = arg0;
    }
}
