import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public abstract class class48 {

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "Lji;")
    public class622 field682;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "Z")
    private boolean field677;

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "Z")
    public static boolean field678 = false;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "[I")
    public static int[] field673;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "[I")
    public static int[] field680;

    @OriginalMember(owner = "client!tba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field682.method3468(this.field675, this.field681, (byte) 113);
        field674++;
        super.finalize();
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)V")
    public static void method436(int arg0) {
        field680 = null;
        field673 = null;
        if (arg0 != 1) {
            field673 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIB)Z")
    public static final boolean method437(int arg0, int arg1, byte arg2) {
        if (arg2 != 12) {
            method437(82, 12, (byte) 115);
        }
        field679++;
        return class681.method3742(arg1, arg0, arg2 ^ 0x3052) | (arg1 & 0x70000) != 0 || class575.method3086(arg0, (byte) 126, arg1);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB[B)V")
    public final void method438(int arg0, byte arg1, byte[] arg2) {
        field683++;
        this.method440(-27);
        if (arg1 != -15) {
            this.method440(-125);
        }
        if (arg0 <= this.field675) {
            OpenGL.glBufferSubDataARBub(this.field672, 0, arg0, arg2, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field672, arg0, arg2, 0, this.field677 ? 35040 : 35044);
            this.field682.field8587 += arg0 - this.field675;
            this.field675 = arg0;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)Lwca;")
    public static final class36 method439(int arg0, int arg1, int arg2) {
        if (arg1 != 13556) {
            field680 = null;
        }
        field676++;
        class36 var3 = new class36();
        var3.field519 = -1;
        var3.field517 = arg2 + 5 + 1;
        var3.field523 = -1;
        var3.field521 = arg0 + 1 + 5;
        var3.field530 = new int[var3.field517][var3.field521];
        var3.method284((byte) -55);
        return var3;
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)V")
    public abstract void method440(int arg0);

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lji;I[BIZ)V")
    public class48(class622 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field682 = arg0;
        this.field672 = arg1;
        this.field675 = arg3;
        this.field677 = arg4;
        OpenGL.glGenBuffersARB(1, class325.field4229, 0);
        this.field681 = class325.field4229[0];
        this.method440(-42);
        OpenGL.glBufferDataARBub(arg1, this.field675, arg2, 0, this.field677 ? 35040 : 35044);
        this.field682.field8587 += this.field675;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lji;ILjaclib/memory/Buffer;IZ)V")
    public class48(class622 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field677 = arg4;
        this.field675 = arg3;
        this.field682 = arg0;
        this.field672 = arg1;
        OpenGL.glGenBuffersARB(1, class325.field4229, 0);
        this.field681 = class325.field4229[0];
        this.method440(-79);
        OpenGL.glBufferDataARBa(arg1, this.field675, arg2.getAddress(), this.field677 ? 35040 : 35044);
        this.field682.field8587 += this.field675;
    }
}
