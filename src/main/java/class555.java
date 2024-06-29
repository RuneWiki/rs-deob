import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class555 extends class561 implements class547 {

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field8238 = 0;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field8244 = -1;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "[I")
    public static int[] field8242 = new int[1000];

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field8240 = 0;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)V", line = 3)
    public static void method3241(byte arg0) {
        if (arg0 < 48) {
            method3241((byte) 71);
        }
        field8242 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)Z", line = 30)
    public static final boolean method3242(int arg0, byte arg1) {
        if (arg1 <= 85) {
            method3241((byte) -53);
        }
        ++field8243;
        if (~arg0 != -60 && arg0 != 6 && arg0 != 44 && arg0 != 12 && ~arg0 != -17) {
            return ~arg0 == -22 || arg0 == 1011;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lqba;IZ[[I)V", line = 58)
    public class555(class540 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class411.field5856, class629.field9208, arg1 * 6 * arg1, arg2);
        super.field8314.method1152(this, true);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method3284(arg1, arg1, -27414, arg3[var5], 34069 - -var5);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method3277(1), arg1, arg1, 0, class135.method836(false, super.field8310), super.field8314.field8072, arg3[var6], 0);
            }
        }
    }
}
