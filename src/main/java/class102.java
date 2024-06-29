import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public abstract class class102 {

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lgk;")
    public class463 field1404;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Z")
    private boolean field1397;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[Z")
    public static boolean[] field1396 = new boolean[5];

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V")
    public abstract void method346(byte arg0);

    @OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1398++;
        this.field1404.method2731(this.field1399, this.field1401, 47);
        super.finalize();
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
    public static void method686(int arg0) {
        field1396 = null;
        if (arg0 <= 61) {
            field1400 = -122;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([BIB)V")
    public final void method687(byte[] arg0, int arg1, byte arg2) {
        this.method346((byte) -128);
        if (arg2 < 53) {
            this.field1399 = 118;
        }
        field1402++;
        if (arg1 > this.field1399) {
            OpenGL.glBufferDataARBub(this.field1395, arg1, arg0, 0, this.field1397 ? 35040 : 35044);
            this.field1404.field6703 += arg1 - this.field1399;
            this.field1399 = arg1;
        } else {
            OpenGL.glBufferSubDataARB(this.field1395, 0, arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lgk;I[BIZ)V")
    public class102(class463 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1404 = arg0;
        this.field1395 = arg1;
        this.field1399 = arg3;
        this.field1397 = arg4;
        OpenGL.glGenBuffersARB(1, class511.field7522, 0);
        this.field1401 = class511.field7522[0];
        this.method346((byte) -127);
        OpenGL.glBufferDataARBub(arg1, this.field1399, arg2, 0, this.field1397 ? 35040 : 35044);
        this.field1404.field6703 += this.field1399;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lgk;ILjaggl/memory/NativeBuffer;IZ)V")
    public class102(class463 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field1404 = arg0;
        this.field1399 = arg3;
        this.field1395 = arg1;
        this.field1397 = arg4;
        OpenGL.glGenBuffersARB(1, class511.field7522, 0);
        this.field1401 = class511.field7522[0];
        this.method346((byte) -127);
        OpenGL.glBufferDataARBa(arg1, this.field1399, arg2.method2840(), this.field1397 ? 35040 : 35044);
        this.field1404.field6703 += this.field1399;
    }
}
