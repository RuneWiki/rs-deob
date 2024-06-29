import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class187 implements class231 {

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    private int field2517 = -1;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "Lnf;")
    private class256 field2521;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public int field2518;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    private int field2516;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    private int field2522;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    private int field2515;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[I")
    private static int[] field2519 = new int[1];

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "()V", line = 8)
    public final void method93() {
        this.field2521.field3634.glFramebufferRenderbufferEXT(36160, this.field2517, 36161, 0);
        this.field2517 = -1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 13)
    public final void method1129(int arg0) {
        this.field2521.field3634.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field2522);
        this.field2517 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "()V", line = 18)
    public final void method1130() {
        if (this.field2522 > 0) {
            this.field2521.method1785(this.field2522, this.field2515);
            this.field2522 = 0;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lnf;III)V", line = 35)
    public class187(class256 arg0, int arg1, int arg2, int arg3) {
        this.field2521 = arg0;
        this.field2518 = arg2;
        this.field2520 = arg3;
        this.field2516 = arg1;
        opengl var5 = this.field2521.field3634;
        var5.glGenRenderbuffersEXT(1, field2519, 0);
        this.field2522 = field2519[0];
        var5.glBindRenderbufferEXT(36161, this.field2522);
        var5.glRenderbufferStorageEXT(36161, this.field2516, this.field2518, this.field2520);
        this.field2515 = this.field2520 * this.field2518 * this.field2521.method1628(this.field2516);
    }

    @OriginalMember(owner = "client!tm", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() throws Throwable {
        this.method1130();
        super.finalize();
    }
}
