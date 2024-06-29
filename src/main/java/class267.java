import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class267 {

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    private int field3774;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Llea;")
    public class573 field3780;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
    private boolean field3771;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    private int field3777;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public int field3781;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[[B")
    public static byte[][] field3773 = new byte[1000][];

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Laq;")
    public static class494 field3772 = new class494(8);

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field3779 = -2;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3780.method3373(this.field3777, this.field3781, (byte) -115);
        field3775++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1714(byte arg0, int arg1) {
        field3776++;
        int var2 = 37 % ((-arg0 - 10) / 41);
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF5735) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I[BB)V")
    public final void method1715(int arg0, byte[] arg1, byte arg2) {
        field3778++;
        this.method1329(0);
        if (arg2 <= 32) {
            field3779 = -18;
        }
        if (arg0 > this.field3777) {
            OpenGL.glBufferDataARBub(this.field3774, arg0, arg1, 0, this.field3771 ? 35040 : 35044);
            this.field3780.field8152 += arg0 - this.field3777;
            this.field3777 = arg0;
        } else {
            OpenGL.glBufferSubDataARBub(this.field3774, 0, arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V")
    public abstract void method1329(int arg0);

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
    public static void method1716(int arg0) {
        if (arg0 != -20455) {
            method1716(57);
        }
        field3773 = null;
        field3772 = null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Llea;I[BIZ)V")
    public class267(class573 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field3774 = arg1;
        this.field3780 = arg0;
        this.field3771 = arg4;
        this.field3777 = arg3;
        OpenGL.glGenBuffersARB(1, class105.field1519, 0);
        this.field3781 = class105.field1519[0];
        this.method1329(0);
        OpenGL.glBufferDataARBub(arg1, this.field3777, arg2, 0, this.field3771 ? 35040 : 35044);
        this.field3780.field8152 += this.field3777;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Llea;ILjaclib/memory/Buffer;IZ)V")
    public class267(class573 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field3771 = arg4;
        this.field3780 = arg0;
        this.field3777 = arg3;
        this.field3774 = arg1;
        OpenGL.glGenBuffersARB(1, class105.field1519, 0);
        this.field3781 = class105.field1519[0];
        this.method1329(0);
        OpenGL.glBufferDataARBa(arg1, this.field3777, arg2.getAddress(), this.field3771 ? 35040 : 35044);
        this.field3780.field8152 += this.field3777;
    }
}
