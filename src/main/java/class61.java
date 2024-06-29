import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public abstract class class61 {

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Lbf;")
    public class344 field813;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Z")
    private boolean field814;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    private int field818;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "[I")
    private static int[] field815 = new int[1];

    @OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field813.method2088(this.field818, this.field817);
        super.finalize();
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()I")
    public int method125() {
        return this.field818;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([BI)V")
    public final void method424(byte[] arg0, int arg1) {
        this.method124();
        if (arg1 > this.field817) {
            this.field813.field4604.glBufferDataARB(this.field816, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field814 ? 35040 : 35044);
            this.field813.field4621 += arg1 - this.field817;
            this.field817 = arg1;
        } else {
            this.field813.field4604.glBufferSubDataARB(this.field816, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "()V")
    public abstract void method124();

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lbf;I[BIZ)V")
    public class61(class344 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field813 = arg0;
        this.field816 = arg1;
        this.field817 = arg3;
        this.field814 = arg4;
        opengl var6 = arg0.field4604;
        var6.glGenBuffersARB(1, field815, 0);
        this.field818 = field815[0];
        this.method124();
        var6.glBufferDataARB(arg1, this.field817, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field817), this.field814 ? 35040 : 35044);
        this.field813.field4621 += this.field817;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lbf;ILjava/nio/ByteBuffer;Z)V")
    public class61(class344 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field813 = arg0;
        this.field816 = arg1;
        this.field817 = arg2.limit();
        this.field814 = arg3;
        opengl var5 = arg0.field4604;
        var5.glGenBuffersARB(1, field815, 0);
        this.field818 = field815[0];
        this.method124();
        var5.glBufferDataARB(arg1, this.field817, arg2, this.field814 ? 35040 : 35044);
        this.field813.field4621 += this.field817;
    }
}
