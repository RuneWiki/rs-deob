import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class722 extends class651 implements class582 {

    @OriginalMember(owner = "client!jha", name = "D", descriptor = "I")
    private int field10140;

    @OriginalMember(owner = "client!jha", name = "A", descriptor = "I")
    private int field10137;

    @OriginalMember(owner = "client!jha", name = "E", descriptor = "I")
    private int field10141;

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "I")
    public static int field10136 = 0;

    @OriginalMember(owner = "client!jha", name = "B", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!jha", name = "C", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Log;Lofa;III[B)V", line = 10)
    public class722(class673 arg0, class345 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class770.field10614, arg2 * arg3 * arg4, false);
        this.field10140 = arg4;
        this.field10137 = arg3;
        this.field10141 = arg2;
        super.field9169.method1104(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field9160, 0, this.method3733(104), this.field10141, this.field10137, this.field10140, 0, class379.method2342(super.field9176, 6410), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(BLli;)V", line = 25)
    public static final void method4070(byte arg0, class449 arg1) {
        ++field10139;
        int var2 = -class673.field9441 + arg1.field6391;
        int var3 = arg1.field6360 * 512 + 256 * arg1.method2692((byte) 27);
        int var4 = arg1.field6406 * 512 + 256 * arg1.method2692((byte) -123);
        arg1.field6440 = 0;
        arg1.field7719 += (-arg1.field7719 + var4) / var2;
        if (arg0 <= 2) {
            method4070((byte) 126, (class449) null);
        }
        arg1.field7718 += (-arg1.field7718 + var3) / var2;
        if (~arg1.field6422 == -1) {
            arg1.method2690(8192, true);
        }
        if (arg1.field6422 == 1) {
            arg1.method2690(12288, true);
        }
        if (arg1.field6422 == 2) {
            arg1.method2690(0, true);
        }
        if (~arg1.field6422 == -4) {
            arg1.method2690(4096, true);
        }
    }
}
