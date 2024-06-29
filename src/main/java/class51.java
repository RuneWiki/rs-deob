import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public abstract class class51 {

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    private int field938;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "Lbt;")
    public class33 field943;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "Z")
    private boolean field935;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "[F")
    public static float[] field936 = new float[4];

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "[I")
    public static int[] field941 = new int[4096];

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "([BBI)V")
    public final void method449(byte[] arg0, byte arg1, int arg2) {
        field939++;
        this.method451(0);
        if (this.field938 < arg2) {
            OpenGL.glBufferDataARBub(this.field937, arg2, arg0, 0, this.field935 ? 35040 : 35044);
            this.field943.field636 += arg2 - this.field938;
            this.field938 = arg2;
        } else {
            OpenGL.glBufferSubDataARB(this.field937, 0, arg2, arg0, 0);
        }
        if (arg1 != -66) {
            this.field932 = -91;
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(Z)V")
    public static void method450(boolean arg0) {
        field936 = null;
        field941 = null;
        if (!arg0) {
            field936 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V")
    public abstract void method451(int arg0);

    @OriginalMember(owner = "client!pv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field943.method282(-333, this.field932, this.field938);
        field933++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lbt;I[BIZ)V")
    public class51(class33 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field938 = arg3;
        this.field937 = arg1;
        this.field943 = arg0;
        this.field935 = arg4;
        OpenGL.glGenBuffersARB(1, class439.field6254, 0);
        this.field932 = class439.field6254[0];
        this.method451(0);
        OpenGL.glBufferDataARBub(arg1, this.field938, arg2, 0, this.field935 ? 35040 : 35044);
        this.field943.field636 += this.field938;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lbt;ILjaggl/memory/NativeBuffer;IZ)V")
    public class51(class33 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field938 = arg3;
        this.field943 = arg0;
        this.field937 = arg1;
        this.field935 = arg4;
        OpenGL.glGenBuffersARB(1, class439.field6254, 0);
        this.field932 = class439.field6254[0];
        this.method451(0);
        OpenGL.glBufferDataARBa(arg1, this.field938, arg2.method2641(), this.field935 ? 35040 : 35044);
        this.field943.field636 += this.field938;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field941[var0] = class296.method1900(var0, false);
        }
    }
}
