import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public abstract class class97 {

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lqi;")
    public class458 field1388;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    private int field1385;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Z")
    private boolean field1383;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "[I")
    private static int[] field1384 = new int[1];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([BI)V", line = 14)
    public final void method627(byte[] arg0, int arg1) {
        this.method626();
        if (arg1 > this.field1387) {
            this.field1388.field6330.glBufferDataARB(this.field1385, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field1383 ? 35040 : 35044);
            this.field1388.field6341 += arg1 - this.field1387;
            this.field1387 = arg1;
        } else {
            this.field1388.field6330.glBufferSubDataARB(this.field1385, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        this.field1388.method2689(this.field1386, this.field1387);
        super.finalize();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()I", line = 37)
    public int method234() {
        return this.field1386;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lqi;I[BIZ)V", line = 40)
    public class97(class458 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1388 = arg0;
        this.field1385 = arg1;
        this.field1387 = arg3;
        this.field1383 = arg4;
        opengl var6 = arg0.field6330;
        var6.glGenBuffersARB(1, field1384, 0);
        this.field1386 = field1384[0];
        this.method626();
        var6.glBufferDataARB(arg1, this.field1387, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field1387), this.field1383 ? 35040 : 35044);
        this.field1388.field6341 += this.field1387;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lqi;ILjava/nio/ByteBuffer;Z)V", line = 57)
    public class97(class458 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field1388 = arg0;
        this.field1385 = arg1;
        this.field1387 = arg2.limit();
        this.field1383 = arg3;
        opengl var5 = arg0.field6330;
        var5.glGenBuffersARB(1, field1384, 0);
        this.field1386 = field1384[0];
        this.method626();
        var5.glBufferDataARB(arg1, this.field1387, arg2, this.field1383 ? 35040 : 35044);
        this.field1388.field6341 += this.field1387;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
    public abstract void method626();
}
