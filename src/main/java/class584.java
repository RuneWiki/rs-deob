import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class584 extends class561 implements class357 {

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
    private int field8444 = -1;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "I")
    private int field8448 = -1;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    private int field8442;

    @OriginalMember(owner = "client!jv", name = "A", descriptor = "I")
    public int field8451;

    @OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
    public int field8452;

    @OriginalMember(owner = "client!jv", name = "C", descriptor = "Luq;")
    private class313 field8453;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    private int field8440;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    private int field8441;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "Lim;")
    public static class353 field8449 = new class353(8, 3);

    @OriginalMember(owner = "client!jv", name = "E", descriptor = "[Z")
    public static boolean[] field8455 = new boolean[100];

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "I")
    public static int field8443;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!jv", name = "D", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V")
    public final void method3367(int arg0) {
        if (arg0 > -53) {
            this.method3369(50, -38, -77);
        }
        field8443++;
        if (this.field8440 > 0) {
            this.field8453.method1940(this.field8440, this.field8441, (byte) -76);
            this.field8440 = 0;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)V")
    public static void method3368(byte arg0) {
        field8449 = null;
        if (arg0 != 95) {
            field8449 = null;
        }
        field8455 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public final void method157(byte arg0) {
        field8439++;
        OpenGL.glFramebufferRenderbufferEXT(this.field8448, this.field8444, 36161, 0);
        if (arg0 <= 97) {
            this.method3367(81);
        }
        this.field8444 = -1;
        this.field8448 = -1;
    }

    @OriginalMember(owner = "client!jv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3367(-63);
        field8445++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)V")
    public final void method3369(int arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.field8440);
        field8454++;
        this.field8448 = arg1;
        this.field8444 = arg0;
        if (arg2 != 0) {
            this.field8440 = -86;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)V")
    public static final void method3370(boolean arg0) {
        field8450++;
        if (class455.field6438) {
            return;
        }
        class194.field2524 = true;
        if (class501.field6954.field7869) {
            class521.field7250 = ((int) class521.field7250 + 191 & 0xFFFFFF80);
        } else {
            class628.field9169 += (24.0F - class628.field9169) / 2.0F;
        }
        class455.field6438 = arg0;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B")
    public static final byte[] method3371(Object arg0, boolean arg1, int arg2) {
        field8446++;
        if (arg0 == null) {
            return null;
        } else if (arg2 != 3) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class270.method1650(var3, 0) : var3;
        } else if (arg0 instanceof class18) {
            class18 var4 = (class18) arg0;
            return var4.method83(true);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Luq;III)V")
    public class584(class313 arg0, int arg1, int arg2, int arg3) {
        this.field8442 = arg1;
        this.field8451 = arg3;
        this.field8452 = arg2;
        this.field8453 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class568.field7950, 0);
        this.field8440 = class568.field7950[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8440);
        OpenGL.glRenderbufferStorageEXT(36161, this.field8442, this.field8452, this.field8451);
        this.field8441 = this.field8452 * this.field8451 * this.field8453.method1900(this.field8442, 4611);
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Luq;IIII)V")
    public class584(class313 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8452 = arg2;
        this.field8442 = arg1;
        this.field8453 = arg0;
        this.field8451 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class568.field7950, 0);
        this.field8440 = class568.field7950[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field8440);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field8442, this.field8452, this.field8451);
        this.field8441 = this.field8452 * this.field8451 * this.field8453.method1900(this.field8442, 4611);
    }
}
