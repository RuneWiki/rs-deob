import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class200 extends class422 implements class461 {

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    public static int field3047 = 0;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public static int field3046 = -2;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIII)Z", line = 8)
    public static final boolean method1373(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3048;
        if (class694.field9700 && class385.field5304) {
            if (~class710.field9866 > -101) {
                return false;
            } else if (!class295.method1924(arg2, 1, arg3, arg4)) {
                return false;
            } else {
                int var5 = arg3 << class645.field9018;
                int var6 = arg2 << class645.field9018;
                if (class663.method3780(class109.field1611, class208.field3219[arg4].method1904(arg2, (byte) 41, arg3), var5, class109.field1611, (byte) 105, var6, arg0)) {
                    ++class211.field3269;
                    return true;
                } else {
                    if (arg1 != 0) {
                        method1373(64, 94, -12, -8, -60);
                    }
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lko;IZ[[I)V", line = 50)
    public class200(class529 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class691.field9659, class34.field457, arg1 * arg1 * 6, arg2);
        super.field5775.method1118(0, this);
        if (!arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method2556(-105), arg1, arg1, 0, class511.method3090(super.field5773, (byte) -39), super.field5775.field7672, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method2557(arg1, 0, 34069 - -var6, arg1, arg3[var6]);
            }
        }
    }
}
