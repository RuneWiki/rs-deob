import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class93 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lbo;")
    public class511 field1402;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
    private boolean field1399;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
    public static int[] field1405 = new int[4096];

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lcu;")
    public static class145 field1401 = new class145(81, -1);

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Ljp;")
    public static class236 field1409 = new class236(200);

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "[I")
    public static int[] field1411 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BI)V", line = 11)
    public final void method671(int arg0, byte[] arg1, int arg2) {
        this.method670((byte) -123);
        if (arg0 != 35044) {
            method672(17);
        }
        field1400++;
        if (this.field1403 >= arg2) {
            OpenGL.glBufferSubDataARB(this.field1404, 0, arg2, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field1404, arg2, arg1, 0, this.field1399 ? 35040 : 35044);
            this.field1402.field7417 += arg2 - this.field1403;
            this.field1403 = arg2;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 38)
    public static void method672(int arg0) {
        field1401 = null;
        field1411 = null;
        field1409 = null;
        field1405 = null;
        if (arg0 >= -121) {
            field1401 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        field1407++;
        this.field1402.method2944((byte) -81, this.field1406, this.field1403);
        super.finalize();
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lbo;I[BIZ)V", line = 62)
    public class93(class511 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1402 = arg0;
        this.field1399 = arg4;
        this.field1404 = arg1;
        this.field1403 = arg3;
        OpenGL.glGenBuffersARB(1, class403.field5540, 0);
        this.field1406 = class403.field5540[0];
        this.method670((byte) -56);
        OpenGL.glBufferDataARBub(arg1, this.field1403, arg2, 0, this.field1399 ? 35040 : 35044);
        this.field1402.field7417 += this.field1403;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lbo;ILjaggl/memory/NativeBuffer;IZ)V", line = 86)
    public class93(class511 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field1399 = arg4;
        this.field1402 = arg0;
        this.field1403 = arg3;
        this.field1404 = arg1;
        OpenGL.glGenBuffersARB(1, class403.field5540, 0);
        this.field1406 = class403.field5540[0];
        this.method670((byte) -95);
        OpenGL.glBufferDataARBa(arg1, this.field1403, arg2.method2520(), this.field1399 ? 35040 : 35044);
        this.field1402.field7417 += this.field1403;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public abstract void method670(byte arg0);
}
