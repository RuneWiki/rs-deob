import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class32 extends class277 {

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "[[Z")
    public static boolean[][] field307;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIZ)V")
    public final void method190(int arg0, int arg1, int arg2, boolean arg3) {
        ++field310;
        class9.field103.method1975(arg1 + -2, arg2, super.field3746.field7517 + 4, super.field3746.field7519 + 2, ((class194) super.field3746).field2512, 0);
        class9.field103.method1975(arg1 - 1, arg2 - -1, super.field3746.field7517 + 2, super.field3746.field7519, 0, 0);
        if (arg0 < 124) {
            field307 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        ++field309;
        if (arg0 >= -5) {
            this.method193(-125);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZII)V")
    public final void method192(int arg0, boolean arg1, int arg2, int arg3) {
        ++field308;
        if (arg0 >= -72) {
            field307 = null;
        }
        int var5 = class556.field7597 * super.field3746.field7517 / 100;
        class9.field103.method1926(arg2, arg3 + 2, var5, super.field3746.field7519 + -2, ((class194) super.field3746).field2511, 0);
        class9.field103.method1926(arg2 - -var5, arg3 - -2, -var5 + super.field3746.field7517, super.field3746.field7519 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lbk;)V")
    public class32(class194 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
    public final boolean method193(int arg0) {
        if (arg0 != -29581) {
            return false;
        } else {
            ++field305;
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public static void method194(int arg0) {
        if (arg0 == 0) {
            field307 = null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIZ)V")
    public static final void method195(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == -2) {
            ++field304;
            if (class42.method251(arg1, 0)) {
                class640.method3481(-1, arg2, class328.field4799[arg1], arg4, (byte) -125, arg3);
            }
        }
    }
}
