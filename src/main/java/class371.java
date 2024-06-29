import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class371 extends class184 implements class679 {

    @OriginalMember(owner = "client!qba", name = "J", descriptor = "I")
    private int field5000;

    @OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
    private int field4991;

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!qba", name = "B", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!qba", name = "C", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!qba", name = "I", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Ltba;Lpn;Ljg;II)V", line = 5)
    public class371(class147 arg0, class692 arg1, class309 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field5000 = arg3;
        this.field4991 = arg4;
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glTexImage2Dub(super.field2661, 0, this.method1262(-124), arg3, arg4, 0, class216.method1395(super.field2651, (byte) -94), class58.method484(5120, super.field2666), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(III[IIIII)V", line = 16)
    public final void method2134(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4992;
        if (arg2 == 19390) {
            if (arg7 == 0) {
                arg7 = arg6;
            }
            super.field2672.method2241(this, (byte) 44);
            if (arg6 != arg7) {
                OpenGL.glPixelStorei(3314, arg7);
            }
            OpenGL.glTexSubImage2Di(super.field2661, 0, arg5, arg4, arg6, arg1, 32993, super.field2672.field2176, arg3, arg0);
            if (arg6 != arg7) {
                OpenGL.glPixelStorei(3314, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BF)F", line = 40)
    public final float method2135(byte arg0, float arg1) {
        if (arg0 != -84) {
            return 1.162009F;
        } else {
            ++field4996;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIIZILpn;I[B)V", line = 51)
    public final void method2136(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class692 arg6, int arg7, byte[] arg8) {
        ++field4993;
        if (arg0 == 0) {
            arg0 = arg1;
        }
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Dub(super.field2661, 0, arg3, arg2, arg1, arg7, class216.method1395(arg6, (byte) -92), 5121, arg8, arg5);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg4) {
            OpenGL.glPixelStorei(3317, 4);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZIZ)V", line = 76)
    public final void method2137(boolean arg0, int arg1, boolean arg2) {
        if (arg1 <= 28) {
            this.method2139(-44);
        }
        ++field4999;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(BF)F", line = 86)
    public final float method2138(byte arg0, float arg1) {
        if (arg0 <= 94) {
            return -0.49214596F;
        } else {
            ++field4997;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Ltba;II[III)V", line = 97)
    public class371(class147 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class129.field1851, class309.field4271, arg1 * arg2, false);
        this.field5000 = arg1;
        this.field4991 = arg2;
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field2661, 0, 6408, this.field5000, this.field4991, 0, 32993, super.field2672.field2176, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)I", line = 110)
    public final int method2139(int arg0) {
        int var2 = -104 / ((arg0 - -34) / 42);
        ++field4998;
        return this.field5000;
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Ltba;Lpn;II[FII)V", line = 126)
    public class371(class147 arg0, class692 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class309.field4275, arg2 * arg3, false);
        this.field4991 = arg3;
        this.field5000 = arg2;
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field2661, 0, this.method1262(-116), arg2, arg3, 0, class216.method1395(super.field2651, (byte) -113), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Ltba;Lpn;II[BII)V", line = 139)
    public class371(class147 arg0, class692 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class309.field4271, arg2 * arg3, false);
        this.field5000 = arg2;
        this.field4991 = arg3;
        super.field2672.method2241(this, (byte) 44);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field2661, 0, this.method1262(-120), arg2, arg3, 0, class216.method1395(super.field2651, (byte) -101), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Z", line = 156)
    public final boolean method2140(int arg0) {
        ++field4995;
        return arg0 != 17615;
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)I", line = 167)
    public final int method2141(int arg0) {
        ++field4994;
        if (arg0 != 4845) {
            this.method2141(-107);
        }
        return this.field4991;
    }
}
