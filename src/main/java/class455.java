import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class455 extends class300 implements class443 {

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "I")
    private int field5992;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
    private int field5993;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "I")
    private int field5991;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "Lga;")
    public static class332 field5988;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "Lwv;")
    public static class423 field5989;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIILwv;)V", line = 3)
    public static final void method2561(int arg0, int arg1, int arg2, class423 arg3) {
        if (arg3.field5629 != 0) {
            if (arg3.field5629 == 1) {
                arg3.field5654 = (-arg3.field5672 + arg0) / 2 - -arg3.field5614;
            } else if (arg3.field5629 == 2) {
                arg3.field5654 = arg0 - arg3.field5614 + -arg3.field5672;
            } else if (~arg3.field5629 != -4) {
                if (~arg3.field5629 == -5) {
                    arg3.field5654 = (arg3.field5614 * arg0 >> 14) + (-arg3.field5672 + arg0) / 2;
                } else {
                    arg3.field5654 = -arg3.field5672 + arg0 + -(arg3.field5614 * arg0 >> 14);
                }
            } else {
                arg3.field5654 = arg3.field5614 * arg0 >> 14;
            }
        } else {
            arg3.field5654 = arg3.field5614;
        }
        ++field5995;
        if (arg3.field5589 == 0) {
            arg3.field5570 = arg3.field5682;
        } else if (arg3.field5589 == 1) {
            arg3.field5570 = (-arg3.field5561 + arg1) / 2 + arg3.field5682;
        } else if (arg3.field5589 != 2) {
            if (arg3.field5589 != 3) {
                if (arg3.field5589 == 4) {
                    arg3.field5570 = (arg3.field5682 * arg1 >> 14) + (-arg3.field5561 + arg1) / 2;
                } else {
                    arg3.field5570 = -(arg3.field5682 * arg1 >> 14) + -arg3.field5561 + arg1;
                }
            } else {
                arg3.field5570 = arg3.field5682 * arg1 >> 14;
            }
        } else {
            arg3.field5570 = -arg3.field5682 + arg1 + -arg3.field5561;
        }
        if (class452.field5967 && (~client.method3858(arg3).field48 != -1 || ~arg3.field5598 == -1)) {
            if (arg3.field5570 < 0) {
                arg3.field5570 = 0;
            } else if (~arg1 > ~(arg3.field5570 + arg3.field5561)) {
                arg3.field5570 = -arg3.field5561 + arg1;
            }
            if (~arg3.field5654 > -1) {
                arg3.field5654 = 0;
            } else if (~arg0 > ~(arg3.field5654 - -arg3.field5672)) {
                arg3.field5654 = -arg3.field5672 + arg0;
            }
        }
        if (arg2 > -27) {
            field5996 = -76;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIB)V", line = 78)
    public static final void method2562(int arg0, int arg1, int arg2, byte arg3) {
        class31.field440 = new byte[arg2][arg0][arg1];
        ++field5990;
        if (arg3 != 119) {
            method2563((byte) -69);
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lqi;Lsk;III[B)V", line = 95)
    public class455(class510 arg0, class452 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class404.field5338, arg2 * arg4 * arg3, false);
        this.field5992 = arg2;
        this.field5993 = arg4;
        this.field5991 = arg3;
        super.field3985.method3613((byte) 109, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3982, 0, this.method1776(true), this.field5992, this.field5991, this.field5993, 0, class400.method2292(-27762, super.field3989), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V", line = 110)
    public static void method2563(byte arg0) {
        field5988 = null;
        if (arg0 <= -59) {
            field5989 = null;
        }
    }
}
