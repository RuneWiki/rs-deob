import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class282 extends class245 implements class334 {

    @OriginalMember(owner = "client!vca", name = "F", descriptor = "I")
    private int field3741;

    @OriginalMember(owner = "client!vca", name = "K", descriptor = "I")
    private int field3746;

    @OriginalMember(owner = "client!vca", name = "E", descriptor = "I")
    public static int field3740 = -1;

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!vca", name = "D", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!vca", name = "G", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!vca", name = "H", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!vca", name = "I", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!vca", name = "J", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZILca;)V", line = 4)
    public static final void method1687(boolean arg0, int arg1, class308 arg2) {
        ++field3734;
        if (class202.field2392) {
            class202.field2392 = false;
            arg1 = 0;
        }
        if (class487.field6680 == null || !class487.field6680.method1863(true, arg2)) {
            class487.field6680 = arg2;
            class742.field10332 = class538.method2963(-47);
            class167.field2098 = arg1;
            class354.field4733 = arg1;
            if (~class354.field4733 == -1) {
                class194.method1079(-38);
            } else {
                class633.field8793 = class464.field6427;
                class594.field8282 = class402.field5681;
                class232.field2993 = class357.field4745;
                class469.field6486 = class681.field9487;
                class688.field9648 = class324.field4353;
                class109.field1446 = class105.field1406;
                class591.field8249 = class274.field3665;
                class149.field1906 = class403.field5689;
                class192.field2310 = class300.field4058;
                class165.field2071 = class406.field5730;
            }
        }
        if (arg0) {
            field3738 = 4;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IF)F", line = 43)
    public final float method1688(int arg0, float arg1) {
        ++field3733;
        if (arg0 != -8473) {
            this.method1696(-66);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)Z", line = 55)
    public static final boolean method1689(int arg0, int arg1, int arg2) {
        if (arg1 != 15123) {
            method1687(true, 53, (class308) null);
        }
        ++field3736;
        return class727.method4078(arg0, arg2, (byte) -23) & ((8192 & arg0) != 0 | class180.method1028(arg2, arg0, (byte) 88) | class553.method3140((byte) -104, arg0, arg2));
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lhl;Lkt;II[BII)V", line = 67)
    public class282(class529 arg0, class159 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class594.field8277, arg2 * arg3, false);
        this.field3741 = arg2;
        this.field3746 = arg3;
        super.field3178.method2148(this, -123);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field3184, 0, this.method1471(0), arg2, arg3, 0, class303.method1814(false, super.field3189), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)I", line = 82)
    public final int method1690(int arg0) {
        if (arg0 != 12941) {
            return 31;
        } else {
            ++field3732;
            return this.field3741;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIIIII[BLkt;I)V", line = 95)
    public final void method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class159 arg7, int arg8) {
        if (arg0 == 0) {
            arg0 = arg2;
        }
        super.field3178.method2148(this, -123);
        if (arg5 != -26946) {
            this.method1688(-63, 1.4202741F);
        }
        ++field3735;
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg2) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field3184, 0, arg8, arg3, arg2, arg4, class303.method1814(false, arg7), 5121, arg6, arg1);
        if (arg0 != arg2) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BF)F", line = 122)
    public final float method1692(byte arg0, float arg1) {
        int var3 = 98 % ((arg0 - -5) / 39);
        ++field3745;
        return arg1;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)I", line = 133)
    public final int method1693(int arg0) {
        if (arg0 < 109) {
            this.method1697(15, -62, -104, (int[]) null, -50, -111, -85, 115);
        }
        ++field3742;
        return this.field3746;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZZI)V", line = 144)
    public final void method1694(boolean arg0, boolean arg1, int arg2) {
        ++field3737;
        int var4 = -51 % ((arg2 - 17) / 36);
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lhl;II[III)V", line = 153)
    public class282(class529 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class758.field10567, class594.field8277, arg1 * arg2, false);
        this.field3746 = arg2;
        this.field3741 = arg1;
        super.field3178.method2148(this, -121);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field3184, 0, 6408, this.field3741, this.field3746, 0, 32993, super.field3178.field7193, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lhl;Lkt;II[FII)V", line = 166)
    public class282(class529 arg0, class159 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class594.field8281, arg2 * arg3, false);
        this.field3746 = arg3;
        this.field3741 = arg2;
        super.field3178.method2148(this, 43);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field3184, 0, this.method1471(0), arg2, arg3, 0, class303.method1814(false, super.field3189), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIBII[II)V", line = 179)
    public final void method1695(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6) {
        ++field3743;
        int var8 = 46 / ((arg2 - -48) / 59);
        int[] var9 = new int[this.field3746 * this.field3741];
        super.field3178.method2148(this, 88);
        OpenGL.glGetTexImagei(super.field3184, 0, 32993, 5121, var9, 0);
        for (int var10 = 0; var10 < arg3; ++var10) {
            class373.method2191(var9, (-var10 + -1 - (-arg3 - arg6)) * this.field3741, arg5, arg1 - -(arg0 * var10), arg0);
        }
    }

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "(I)Z", line = 201)
    public final boolean method1696(int arg0) {
        ++field3744;
        return arg0 > -22 ? false : false;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(III[IIIII)V", line = 217)
    public final void method1697(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 17779) {
            this.method1697(-84, 50, 115, (int[]) null, 124, 55, -64, 94);
        }
        ++field3739;
        super.field3178.method2148(this, arg0 + -17894);
        if (arg6 == 0) {
            arg6 = arg7;
        }
        if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Di(super.field3184, 0, arg4, arg1, arg7, arg2, 32993, super.field3178.field7193, arg3, arg5);
        if (~arg6 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lhl;Lkt;Lkq;II)V", line = 242)
    public class282(class529 arg0, class159 arg1, class594 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field3746 = arg4;
        this.field3741 = arg3;
        super.field3178.method2148(this, -119);
        OpenGL.glTexImage2Dub(super.field3184, 0, this.method1471(0), arg3, arg4, 0, class303.method1814(false, super.field3189), class557.method3153(super.field3179, (byte) 105), (byte[]) null, 0);
    }
}
