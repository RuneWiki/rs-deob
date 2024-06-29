import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class219 extends class269 {

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
    private int field3108 = 0;

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lbi;Lmaa;)V")
    public class219(class449 arg0, class440 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "(B)V")
    public static final void method1389(byte arg0) {
        ++field3110;
        if (arg0 > -47) {
            method1390(-82, 37, 99);
        }
        class662.method3721((byte) -18);
        class381.method2226((byte) 113);
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZI)V")
    public final void method912(boolean arg0, int arg1) {
        ++field3111;
        if (arg1 != -20667) {
            method1389((byte) 94);
        }
        int var3 = super.field3755.field8233.method1358(0, super.field3757.method1025(), class641.field8619) - -super.field3755.field8236;
        int var4 = super.field3755.field8238.method3790(super.field3757.method1030(), 106, class305.field4229) + super.field3755.field8237;
        super.field3757.method2636((float) (super.field3757.method1025() / 2 + var3), (float) (var4 - -(super.field3757.method1030() / 2)), 4096, this.field3108);
        this.field3108 += ((class440) super.field3755).field6043;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(III)Ldk;")
    public static final class477 method1390(int arg0, int arg1, int arg2) {
        class24 var3 = class703.field9899[arg0][arg1][arg2];
        return var3 == null ? null : var3.field411;
    }
}
