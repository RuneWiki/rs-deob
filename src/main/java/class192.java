import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class192 extends class373 {

    @OriginalMember(owner = "client!cw", name = "H", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!cw", name = "N", descriptor = "Z")
    public boolean field2966;

    @OriginalMember(owner = "client!cw", name = "G", descriptor = "F")
    public float field2959;

    @OriginalMember(owner = "client!cw", name = "O", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!cw", name = "M", descriptor = "F")
    public float field2965;

    @OriginalMember(owner = "client!cw", name = "L", descriptor = "I")
    public static int field2964 = 1400;

    @OriginalMember(owner = "client!cw", name = "K", descriptor = "I")
    public static int field2963 = 0;

    @OriginalMember(owner = "client!cw", name = "J", descriptor = "Z")
    public static boolean field2962 = false;

    @OriginalMember(owner = "client!cw", name = "I", descriptor = "I")
    public static int field2961 = 0;

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqfa;IIIII)V")
    public class192(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2960 = arg3;
        this.field2966 = false;
        this.field2959 = (float) arg2 / (float) arg4;
        this.field2967 = arg2;
        this.field2965 = (float) arg3 / (float) arg5;
        this.method2314(false, false, 0);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqfa;IIIIIIZ)V")
    public class192(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field2959 = (float) arg3 / (float) arg5;
        this.field2967 = arg3;
        this.field2966 = false;
        this.field2965 = (float) arg4 / (float) arg6;
        this.field2960 = arg4;
        this.method2314(false, false, 0);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqfa;IIIIIZ)V")
    public class192(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field2967 = arg4;
        this.field2960 = arg5;
        if (~super.field2899 != -34038) {
            this.field2959 = this.field2965 = 1.0F;
            this.field2966 = true;
        } else {
            this.field2959 = (float) arg4;
            this.field2966 = false;
            this.field2965 = (float) arg5;
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqfa;IIII)V")
    public class192(class106 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (super.field2899 != 34037) {
            this.field2959 = this.field2965 = 1.0F;
            this.field2966 = true;
        } else {
            this.field2966 = false;
            this.field2959 = (float) arg3;
            this.field2965 = (float) arg4;
        }
        this.field2960 = arg4;
        this.field2967 = arg3;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqfa;IIIIZ[BI)V")
    public class192(class106 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2960 = arg4;
        if (~super.field2899 != -34038) {
            this.field2959 = this.field2965 = 1.0F;
            this.field2966 = true;
        } else {
            this.field2959 = (float) arg3;
            this.field2966 = false;
            this.field2965 = (float) arg4;
        }
        this.field2967 = arg3;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqfa;IIIZ[III)V")
    public class192(class106 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field2967 = arg2;
        this.field2960 = arg3;
        if (super.field2899 != 34037) {
            this.field2966 = true;
            this.field2959 = this.field2965 = 1.0F;
        } else {
            this.field2966 = false;
            this.field2965 = (float) arg3;
            this.field2959 = (float) arg2;
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqfa;IIII[I)V")
    public class192(class106 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field2967 = arg1;
        this.field2960 = arg2;
        this.method2315(0, arg5, 0, -107, arg2, 0, arg1, 0, true);
        this.field2959 = (float) arg1 / (float) arg3;
        this.field2966 = false;
        this.field2965 = (float) arg2 / (float) arg4;
        this.method2314(false, false, 0);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lqfa;IIIII[BI)V")
    public class192(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field2960 = arg3;
        this.field2967 = arg2;
        this.method2313(0, arg6, 0, arg2, true, 0, 0, arg3, arg7, (byte) 92);
        this.field2966 = false;
        this.field2965 = (float) arg3 / (float) arg5;
        this.field2959 = (float) arg2 / (float) arg4;
        this.method2314(false, false, 0);
    }
}
