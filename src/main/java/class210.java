import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class210 extends class400 {

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    private int field2489 = -1;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    private int field2493 = -1;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public int field2494;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public int field2491;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "Lbt;")
    public static class48 field2495;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIII)V")
    public final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field5229.method3936(false, this);
        ++field2490;
        OpenGL.glCopyTexSubImage3D(super.field5235, arg2, arg1, arg0, arg5, arg7, arg6, arg3, arg4);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIILoaa;Lke;ILha;ILhu;)V")
    public static final void method1325(int arg0, int arg1, int arg2, class305 arg3, class625 arg4, int arg5, class66 arg6, int arg7, class143 arg8) {
        ++field2486;
        int var9 = -(arg2 / 2) + arg0 - 5;
        int var10 = arg7 - -2;
        if (arg3.field3636 != 0) {
            arg6.method600(var9, var10, 785580130, arg3.field3636, -var10 + (arg1 * arg8.method1050() + arg7 - -1), arg2 + 10);
        }
        if (~arg3.field3651 != -1) {
            arg6.method598(arg2 - -10, var10, 124, var9, -var10 + 1 + arg1 * arg8.method1050() + arg7, arg3.field3651);
        }
        int var11 = arg3.field3649;
        if (arg4.field8570 && ~arg3.field3639 != 0) {
            var11 = arg3.field3639;
        }
        for (int var12 = arg5; var12 < arg1; ++var12) {
            String var13 = class264.field3128[var12];
            if (~var12 > ~(arg1 + -1)) {
                var13 = var13.substring(0, -4 + var13.length());
            }
            arg8.method1049(arg6, var13, arg0, arg7, var11, true);
            arg7 += arg8.method1050();
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lpc;IIII[BI)V")
    public class210(class700 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field2494 = arg4;
        this.field2488 = arg2;
        this.field2491 = arg3;
        super.field5229.method3936(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5235, 0, super.field5236, this.field2488, this.field2491, this.field2494, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2347(true, -57);
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)V")
    public static void method1326(int arg0) {
        if (arg0 != 0) {
            field2495 = null;
        }
        field2495 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLiaa;)V")
    public static final void method1327(byte arg0, class521 arg1) {
        if (arg0 != -108) {
            field2495 = null;
        }
        ++field2485;
        class96 var2 = (class96) class118.field1501.method2121(arg0 ^ -7, (long) arg1.field3393);
        if (var2 != null) {
            if (var2.field1260 != null) {
                class783.field10811.method3257(var2.field1260);
                var2.field1260 = null;
            }
            var2.method2219(13630);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public final void method1219(int arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field2493, this.field2489, super.field5235, 0, 0, 0);
        if (arg0 > -96) {
            method1327((byte) -96, (class521) null);
        }
        ++field2492;
        this.field2489 = -1;
        this.field2493 = -1;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lpc;IIII)V")
    public class210(class700 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field2491 = arg3;
        this.field2488 = arg2;
        this.field2494 = arg4;
        super.field5229.method3936(false, this);
        OpenGL.glTexImage3Dub(super.field5235, 0, super.field5236, this.field2488, this.field2491, this.field2494, 0, class17.method215((byte) -97, super.field5236), 5121, (byte[]) null, 0);
        this.method2347(true, 92);
    }
}
