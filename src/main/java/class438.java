import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class438 extends class189 implements class131 {

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    private int field6497 = -1;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    private int field6502 = -1;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "Lda;")
    private class44 field6503;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    private int field6498;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public int field6505;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    private int field6507;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    private int field6499;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "Lbj;")
    public static class162 field6509 = new class162(19, 7);

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field6511 = 0;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "Lbj;")
    public static class162 field6510 = new class162(37, 6);

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIZ)V")
    public final void method2614(int arg0, int arg1, boolean arg2) {
        field6500++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field6507);
        this.field6502 = arg0;
        this.field6497 = arg1;
        if (!arg2) {
            method2616((byte) -110);
        }
    }

    @OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6506++;
        this.method2615(-119);
        super.finalize();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public final void method458(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field6502, this.field6497, 36161, 0);
        if (arg0 == 1) {
            field6508++;
            this.field6497 = -1;
            this.field6502 = -1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public final void method2615(int arg0) {
        int var2 = -110 % ((-arg0 - 26) / 47);
        field6504++;
        if (this.field6507 > 0) {
            this.field6503.method305(this.field6499, this.field6507, false);
            this.field6507 = 0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lda;III)V")
    public class438(class44 arg0, int arg1, int arg2, int arg3) {
        this.field6501 = arg3;
        this.field6503 = arg0;
        this.field6498 = arg1;
        this.field6505 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class373.field5467, 0);
        this.field6507 = class373.field5467[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6507);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6498, this.field6505, this.field6501);
        this.field6499 = this.field6501 * this.field6505 * this.field6503.method420((byte) 89, this.field6498);
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)V")
    public static void method2616(byte arg0) {
        field6510 = null;
        field6509 = null;
        int var1 = -42 / ((5 - arg0) / 44);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lda;IIII)V")
    public class438(class44 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6501 = arg3;
        this.field6498 = arg1;
        this.field6505 = arg2;
        this.field6503 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class373.field5467, 0);
        this.field6507 = class373.field5467[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6507);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6498, this.field6505, this.field6501);
        this.field6499 = this.field6505 * this.field6501 * this.field6503.method420((byte) 89, this.field6498);
    }
}
