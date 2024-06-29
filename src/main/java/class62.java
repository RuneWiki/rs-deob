import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class62 extends class327 implements class540 {

    @OriginalMember(owner = "client!fka", name = "C", descriptor = "Lsv;")
    public static class570 field945 = new class570(73, 7);

    @OriginalMember(owner = "client!fka", name = "D", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lfc;IZ[[I)V", line = 5)
    public class62(class642 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class133.field2225, class629.field8918, arg1 * 6 * arg1, arg2);
        super.field4645.method988(1, this);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(34069 - -var5, 0, this.method1987(1683), arg1, arg1, 0, class177.method1293(52, super.field4659), super.field4645.field9137, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method1993((byte) -28, arg1, var6 + 34069, arg3[var6], arg1);
            }
        }
    }

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(Z)V", line = 43)
    public static void method632(boolean arg0) {
        field945 = null;
        if (arg0) {
            field946 = 74;
        }
    }
}
