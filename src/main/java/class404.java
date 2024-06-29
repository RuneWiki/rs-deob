import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class404 extends class327 implements class232 {

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
    private int field5562;

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    private int field5563;

    @OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
    private int field5561;

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lfc;Lnea;III[B)V", line = 8)
    public class404(class642 arg0, class600 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class629.field8918, arg2 * arg3 * arg4, false);
        this.field5562 = arg2;
        this.field5563 = arg4;
        this.field5561 = arg3;
        super.field4645.method988(1, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field4667, 0, this.method1987(1683), this.field5562, this.field5561, this.field5563, 0, class177.method1293(101, super.field4659), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V", line = 23)
    public static final void method2396(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class510.field7018 != null) {
            class510.field7018[arg0][arg1] = -16777216 | arg2;
        }
        if (class722.field10080 != null) {
            class722.field10080[arg0][arg1] = (short) arg3;
        }
        if (class97.field1386 != null) {
            class97.field1386[arg0][arg1] = (byte) arg4;
        }
    }
}
