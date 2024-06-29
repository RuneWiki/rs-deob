import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class703 {

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    private int field9804;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
    private boolean field9800;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Lwh;")
    public class148 field9808;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    private int field9799;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public int field9807;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field9798 = 0;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field9802 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field9801;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
    public abstract void method949(int arg0);

    @OriginalMember(owner = "client!gn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field9808.method1097(this.field9807, 102, this.field9799);
        field9797++;
        super.finalize();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BIIIII)Z")
    public static final boolean method3998(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9801++;
        int var7 = arg0 % arg3;
        int var8;
        if (arg2 == var7) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg4 + arg3 - 1) / arg3);
        int var10 = -((arg0 + arg3 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg1[arg6] == 0) {
                    return true;
                }
                arg6 += arg3;
            }
            int var13 = arg6 - var8;
            if (arg1[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg5 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(CB)C")
    public static final char method3999(char arg0, byte arg1) {
        field9803++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg1 < 14) {
            return (char) 65499;
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ[B)V")
    public final void method4000(int arg0, boolean arg1, byte[] arg2) {
        this.method949(124);
        field9805++;
        if (arg0 > this.field9799) {
            OpenGL.glBufferDataARBub(this.field9804, arg0, arg2, 0, this.field9800 ? 35040 : 35044);
            this.field9808.field2185 += arg0 - this.field9799;
            this.field9799 = arg0;
        } else {
            OpenGL.glBufferSubDataARBub(this.field9804, 0, arg0, arg2, 0);
        }
        if (!arg1) {
            this.field9800 = true;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lwh;I[BIZ)V")
    public class703(class148 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field9804 = arg1;
        this.field9800 = arg4;
        this.field9808 = arg0;
        this.field9799 = arg3;
        OpenGL.glGenBuffersARB(1, class218.field3217, 0);
        this.field9807 = class218.field3217[0];
        this.method949(113);
        OpenGL.glBufferDataARBub(arg1, this.field9799, arg2, 0, this.field9800 ? 35040 : 35044);
        this.field9808.field2185 += this.field9799;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lwh;ILjaclib/memory/Buffer;IZ)V")
    public class703(class148 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field9808 = arg0;
        this.field9804 = arg1;
        this.field9800 = arg4;
        this.field9799 = arg3;
        OpenGL.glGenBuffersARB(1, class218.field3217, 0);
        this.field9807 = class218.field3217[0];
        this.method949(124);
        OpenGL.glBufferDataARBa(arg1, this.field9799, arg2.getAddress(), this.field9800 ? 35040 : 35044);
        this.field9808.field2185 += this.field9799;
    }
}
