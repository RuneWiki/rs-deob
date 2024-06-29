import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class428 extends class322 implements class228 {

    @OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
    private int field5675;

    @OriginalMember(owner = "client!vaa", name = "E", descriptor = "I")
    private int field5682;

    @OriginalMember(owner = "client!vaa", name = "C", descriptor = "Lgl;")
    public static class547 field5680 = new class547(13, 19);

    @OriginalMember(owner = "client!vaa", name = "F", descriptor = "[F")
    public static float[] field5683 = new float[16];

    @OriginalMember(owner = "client!vaa", name = "v", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!vaa", name = "w", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!vaa", name = "y", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!vaa", name = "A", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!vaa", name = "B", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!vaa", name = "D", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!vaa", name = "G", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lnfa;Lvj;II[BII)V")
    public class428(class621 arg0, class402 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class271.field3429, arg2 * arg3, false);
        this.field5675 = arg3;
        this.field5682 = arg2;
        super.field4183.method2696(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field4190, 0, this.method1819((byte) 126), arg2, arg3, 0, class590.method3313((byte) 71, super.field4176), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IF)F")
    public final float method1326(int arg0, float arg1) {
        if (arg0 != 30658) {
            return -1.8891635F;
        } else {
            ++field5677;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lnfa;II[III)V")
    public class428(class621 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class581.field8260, class271.field3429, arg1 * arg2, false);
        this.field5682 = arg1;
        this.field5675 = arg2;
        super.field4183.method2696(-2, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field4190, 0, 6408, this.field5682, this.field5675, 0, 32993, super.field4183.field8814, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lnfa;Lvj;Lnb;II)V")
    public class428(class621 arg0, class402 arg1, class271 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field5682 = arg3;
        this.field5675 = arg4;
        super.field4183.method2696(-2, this);
        OpenGL.glTexImage2Dub(super.field4190, 0, this.method1819((byte) -115), arg3, arg4, 0, class590.method3313((byte) 71, super.field4176), class680.method3799(super.field4193, (byte) -42), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(FI)F")
    public final float method1332(float arg0, int arg1) {
        if (arg1 != 30994) {
            return 0.26537767F;
        } else {
            ++field5673;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIIIIIB[I)V")
    public final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int[] arg7) {
        ++field5681;
        super.field4183.method2696(-2, this);
        if (~arg2 == -1) {
            arg2 = arg5;
        }
        if (arg2 != arg5) {
            OpenGL.glPixelStorei(3314, arg2);
        }
        OpenGL.glTexSubImage2Di(super.field4190, 0, arg4, arg0, arg5, arg3, 32993, super.field4183.field8814, arg7, arg1);
        if (arg2 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        int var9 = -6 / ((arg6 - 58) / 58);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Z")
    public final boolean method1327(int arg0) {
        ++field5674;
        return arg0 != 12832 ? false : false;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZZ)V")
    public final void method1331(int arg0, boolean arg1, boolean arg2) {
        ++field5679;
        if (arg0 != -7684) {
            this.field5682 = 58;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)I")
    public final int method1330(int arg0) {
        ++field5676;
        if (arg0 != -32601) {
            field5683 = null;
        }
        return this.field5682;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lnfa;Lvj;II[FII)V")
    public class428(class621 arg0, class402 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class271.field3433, arg2 * arg3, false);
        this.field5682 = arg2;
        this.field5675 = arg3;
        super.field4183.method2696(-2, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field4190, 0, this.method1819((byte) 24), arg2, arg3, 0, class590.method3313((byte) 71, super.field4176), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIII[BLvj;III)V")
    public final void method1325(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class402 arg5, int arg6, int arg7, int arg8) {
        ++field5678;
        if (arg6 == 0) {
            arg6 = arg2;
        }
        super.field4183.method2696(-2, this);
        if (arg0 != -24967) {
            this.method1329(-94, -25, -103, -51, 107, 110, (byte) 33, (int[]) null);
        }
        OpenGL.glPixelStorei(3317, 1);
        if (arg2 != arg6) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Dub(super.field4190, 0, arg8, arg1, arg2, arg3, class590.method3313((byte) 71, arg5), 5121, arg4, arg7);
        if (arg2 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)I")
    public final int method1328(int arg0) {
        if (arg0 > -13) {
            return -93;
        } else {
            ++field5684;
            return this.field5675;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "(B)V")
    public static void method2303(byte arg0) {
        if (arg0 != -23) {
            field5680 = null;
        }
        field5683 = null;
        field5680 = null;
    }
}
