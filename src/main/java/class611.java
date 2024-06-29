import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class611 extends class163 implements class405 {

    @OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
    private int field8680;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    private int field8678;

    @OriginalMember(owner = "client!sj", name = "E", descriptor = "Lfea;")
    public static class47 field8683 = new class47();

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "Lpp;")
    public static class464 field8685 = new class464(18, 2);

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "Liu;")
    public static class517 field8686 = new class517(48, 6);

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!sj", name = "A", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!sj", name = "F", descriptor = "Ldn;")
    public static class257 field8684;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZI[IIII)V")
    public final void method1537(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        super.field2405.method3577(this, arg2);
        if (arg7 == 0) {
            arg7 = arg3;
        }
        ++field8681;
        if (arg3 != arg7) {
            OpenGL.glPixelStorei(3314, arg7);
        }
        OpenGL.glTexSubImage2Di(super.field2418, 0, arg6, arg0, arg3, arg1, 32993, super.field2405.field2064, arg4, arg5);
        if (~arg3 != ~arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Llh;II[III)V")
    public class611(class125 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class85.field1472, class343.field4922, arg1 * arg2, false);
        this.field8680 = arg1;
        this.field8678 = arg2;
        super.field2405.method3577(this, true);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field2418, 0, 6408, this.field8680, this.field8678, 0, 32993, super.field2405.field2064, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
    public final int method1530(int arg0) {
        ++field8677;
        if (arg0 >= -18) {
            field8683 = null;
        }
        return this.field8678;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Llh;Lkl;II[BII)V")
    public class611(class125 arg0, class468 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class343.field4922, arg2 * arg3, false);
        this.field8678 = arg3;
        this.field8680 = arg2;
        super.field2405.method3577(this, true);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field2418, 0, this.method1140((byte) 123), arg2, arg3, 0, class387.method2348(super.field2417, (byte) -119), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
    public final int method1533(int arg0) {
        if (arg0 <= 114) {
            this.field8678 = -95;
        }
        ++field8682;
        return this.field8680;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)Lak;")
    public static final class50 method3467(int arg0, byte arg1) {
        if (arg1 != -6) {
            field8686 = null;
        }
        ++field8674;
        return arg0 >= 0 && arg0 < 100 ? class555.field7860[arg0] : null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZF)F")
    public final float method1531(boolean arg0, float arg1) {
        if (arg0) {
            method3468(104, 37, -111, 17, -31, -127, -30);
        }
        ++field8676;
        return arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILkl;III[BII)V")
    public final void method1534(int arg0, int arg1, class468 arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (~arg4 == -1) {
            arg4 = arg1;
        }
        super.field2405.method3577(this, true);
        ++field8687;
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg4) {
            OpenGL.glPixelStorei(3314, arg4);
        }
        if (arg0 != 21145) {
            this.method1536(122);
        }
        OpenGL.glTexSubImage2Dub(super.field2418, 0, arg5, arg3, arg1, arg8, class387.method2348(arg2, (byte) -124), 5121, arg6, arg7);
        if (arg1 != arg4) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field8675;
        int var7 = arg1 + arg6;
        int var8 = arg4 - arg1;
        for (int var9 = arg6; ~var7 < ~var9; ++var9) {
            class614.method3490(arg3, arg2, -98, class495.field6944[var9], arg5);
        }
        int var10 = arg2 - -arg1;
        int var11 = -arg1 + arg5;
        for (int var12 = arg4; ~var12 < ~var8; --var12) {
            class614.method3490(arg3, arg2, -100, class495.field6944[var12], arg5);
        }
        for (int var13 = var7; ~var13 >= ~var8; ++var13) {
            int[] var14 = class495.field6944[var13];
            class614.method3490(arg3, arg2, -97, var14, var10);
            class614.method3490(arg3, var11, -103, var14, arg5);
        }
        if (arg0 >= -87) {
            field8684 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Llh;Lkl;Lvt;II)V")
    public class611(class125 arg0, class468 arg1, class343 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field8678 = arg4;
        this.field8680 = arg3;
        super.field2405.method3577(this, true);
        OpenGL.glTexImage2Dub(super.field2418, 0, this.method1140((byte) 127), arg3, arg4, 0, class387.method2348(super.field2417, (byte) -108), class416.method2509(super.field2406, 114), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)Z")
    public final boolean method1536(int arg0) {
        ++field8673;
        if (arg0 != -5845) {
            method3467(46, (byte) 35);
        }
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IF)F")
    public final float method1532(int arg0, float arg1) {
        if (arg0 != -8221) {
            this.method1533(-59);
        }
        ++field8688;
        return arg1;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Llh;Lkl;II[FII)V")
    public class611(class125 arg0, class468 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class343.field4926, arg2 * arg3, false);
        this.field8678 = arg3;
        this.field8680 = arg2;
        super.field2405.method3577(this, true);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field2418, 0, this.method1140((byte) 125), arg2, arg3, 0, class387.method2348(super.field2417, (byte) -115), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "(I)V")
    public static void method3469(int arg0) {
        field8685 = null;
        field8686 = null;
        field8684 = null;
        field8683 = null;
        if (arg0 != 1) {
            method3468(-20, 7, -91, 47, 62, 125, -45);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZI)V")
    public final void method1535(boolean arg0, boolean arg1, int arg2) {
        ++field8679;
        int var4 = -33 % ((arg2 - 59) / 32);
    }
}
