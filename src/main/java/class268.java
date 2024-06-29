import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class268 extends class105 {

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    private int field3582;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIZ)V")
    public final void method637(int arg0, int arg1, boolean arg2) {
        ++field3584;
        int var4 = this.field3586 * arg1 >> 12;
        if (arg2) {
            int var5 = this.field3585 * arg1 >> 12;
            int var6 = this.field3583 * arg0 >> 12;
            int var7 = this.field3582 * arg0 >> 12;
            class529.method3138(var6, super.field1412, var4, var5, -123, var7);
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIIII)V")
    public class268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3585 = arg2;
        this.field3586 = arg0;
        this.field3582 = arg3;
        this.field3583 = arg1;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public static final void method1634(int arg0) {
        if (arg0 == 370396588) {
            class17.field162.method3045(48);
            ++field3581;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
    public final void method638(int arg0, int arg1, int arg2) {
        ++field3579;
        if (arg0 < 4) {
            this.method638(-4, -27, 84);
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)V")
    public final void method640(int arg0, int arg1, int arg2) {
        ++field3578;
        int var4 = this.field3586 * arg2 >> 12;
        int var5 = this.field3585 * arg2 >> 12;
        int var6 = this.field3583 * arg0 >> 12;
        int var7 = this.field3582 * arg0 >> 12;
        if (arg1 != -3686) {
            method1635(-116, -124, 0);
        }
        class250.method1550(var4, super.field1411, var7, var6, super.field1413, (byte) -61, super.field1412, var5);
    }

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(III)Z")
    public static final boolean method1635(int arg0, int arg1, int arg2) {
        if (arg1 != -1596595220) {
            return true;
        } else {
            ++field3580;
            return false;
        }
    }
}
