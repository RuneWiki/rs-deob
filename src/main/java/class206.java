import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class206 extends class621 {

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    private int field3018 = 0;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Z")
    public static boolean field3017 = false;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "Lfe;")
    public static class345 field3013 = new class345();

    @OriginalMember(owner = "client!li", name = "n", descriptor = "F")
    public static float field3014;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V")
    public final void method19(boolean arg0, int arg1) {
        ++field3015;
        if (arg1 < 44) {
            this.field3018 = -100;
        }
        int var3 = super.field8769.field3828.method3291(super.field8773.method11(), 0, class499.field6858) + super.field8769.field3823;
        int var4 = super.field8769.field3822.method2110(class381.field5334, super.field8773.method14(), -29133) + super.field8769.field3821;
        super.field8773.method751((float) (super.field8773.method11() / 2 + var3), (float) (super.field8773.method14() / 2 + var4), 4096, this.field3018);
        this.field3018 += ((class57) super.field8769).field881;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public static void method1438(int arg0) {
        if (arg0 == 2) {
            field3013 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static final void method1439(byte arg0) {
        ++field3016;
        class432.field6035.method4249((byte) 127);
        int var1 = -28 / ((arg0 - 68) / 56);
        class61.field922.method4249((byte) 110);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lgga;Llu;)V")
    public class206(class513 arg0, class57 arg1) {
        super(arg0, arg1);
    }
}
