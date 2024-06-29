import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class588 extends class533 {

    @OriginalMember(owner = "client!eba", name = "I", descriptor = "Z")
    public boolean field8018;

    @OriginalMember(owner = "client!eba", name = "F", descriptor = "F")
    public float field8015;

    @OriginalMember(owner = "client!eba", name = "E", descriptor = "F")
    public float field8014;

    @OriginalMember(owner = "client!eba", name = "H", descriptor = "I")
    public int field8017;

    @OriginalMember(owner = "client!eba", name = "G", descriptor = "I")
    public int field8016;

    @OriginalMember(owner = "client!eba", name = "J", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lqo;IIII)V", line = 3)
    public class588(class22 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (super.field868 != 34037) {
            this.field8018 = true;
            this.field8014 = this.field8015 = 1.0F;
        } else {
            this.field8015 = (float) arg4;
            this.field8018 = false;
            this.field8014 = (float) arg3;
        }
        this.field8017 = arg3;
        this.field8016 = arg4;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lqo;IIIII)V", line = 24)
    public class588(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field8014 = (float) arg2 / (float) arg4;
        this.field8016 = arg3;
        this.field8017 = arg2;
        this.field8015 = (float) arg3 / (float) arg5;
        this.field8018 = false;
        this.method3067(false, false, 10243);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lqo;IIIIIZ)V", line = 38)
    public class588(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field8017 = arg4;
        if (super.field868 == 34037) {
            this.field8018 = false;
            this.field8014 = (float) arg4;
            this.field8015 = (float) arg5;
        } else {
            this.field8018 = true;
            this.field8014 = this.field8015 = 1.0F;
        }
        this.field8016 = arg5;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILjava/lang/String;ZI)V", line = 64)
    public static final void method3356(int arg0, String arg1, boolean arg2, int arg3) {
        ++field8019;
        class520.method3024(false);
        class236.method1646(9864);
        class751.method4201(-1);
        class734.method4050(arg1, arg3, arg2, arg0 ^ arg0);
        class141.method1126(2);
        class96.method900(5139, class272.field3822);
        class140.method1121(class272.field3822, 4);
        class20.method155(class569.field7819, class272.field3822, true);
        class497.method2934(-128);
        class661.method3716(class536.field7418, 515880227);
        class299.method1955(arg0 ^ -80);
        class297.method1947(-1);
        if (~class214.field3036 == -4) {
            class215.method1527(2, 4);
        } else if (~class214.field3036 == -8) {
            class215.method1527(2, 8);
        } else if (~class214.field3036 == -11) {
            class215.method1527(2, 11);
        } else {
            if (~class214.field3036 == -2 || ~class214.field3036 == -3) {
                class347.method2183(12639);
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lqo;IIIIIIZ)V", line = 100)
    public class588(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field8017 = arg3;
        this.field8015 = (float) arg4 / (float) arg6;
        this.field8014 = (float) arg3 / (float) arg5;
        this.field8016 = arg4;
        this.field8018 = false;
        this.method3067(false, false, 10243);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lqo;IIIII[BI)V", line = 115)
    public class588(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field8017 = arg2;
        this.field8016 = arg3;
        this.method3072(0, 0, arg2, true, 0, arg3, arg7, 127, arg6, 0);
        this.field8015 = (float) arg3 / (float) arg5;
        this.field8014 = (float) arg2 / (float) arg4;
        this.field8018 = false;
        this.method3067(false, false, 10243);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lqo;IIIZ[III)V", line = 129)
    public class588(class22 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field868 == -34038) {
            this.field8014 = (float) arg2;
            this.field8018 = false;
            this.field8015 = (float) arg3;
        } else {
            this.field8018 = true;
            this.field8014 = this.field8015 = 1.0F;
        }
        this.field8016 = arg3;
        this.field8017 = arg2;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lqo;IIII[I)V", line = 151)
    public class588(class22 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field8017 = arg1;
        this.field8016 = arg2;
        this.method3066(true, arg2, 0, arg5, 0, (byte) -73, arg1, 0, 0);
        this.field8014 = (float) arg1 / (float) arg3;
        this.field8015 = (float) arg2 / (float) arg4;
        this.field8018 = false;
        this.method3067(false, false, 10243);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lqo;IIIIZ[BI)V", line = 165)
    public class588(class22 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field8017 = arg3;
        if (super.field868 == 34037) {
            this.field8015 = (float) arg4;
            this.field8018 = false;
            this.field8014 = (float) arg3;
        } else {
            this.field8018 = true;
            this.field8014 = this.field8015 = 1.0F;
        }
        this.field8016 = arg4;
    }
}
