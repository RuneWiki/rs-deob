import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class class95 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lhj;")
    public class338 field1411;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Z")
    private boolean field1412;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[I")
    private static int[] field1410 = new int[1];

    @OriginalMember(owner = "client!gg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1411.method2139(this.field1409, this.field1413);
        super.finalize();
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
    public int method641() {
        return this.field1409;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()V")
    public abstract void method642();

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BI)V")
    public final void method643(byte[] arg0, int arg1) {
        this.method642();
        if (arg1 > this.field1413) {
            this.field1411.field4607.glBufferDataARB(this.field1414, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field1412 ? 35040 : 35044);
            this.field1411.field4624 += arg1 - this.field1413;
            this.field1413 = arg1;
        } else {
            this.field1411.field4607.glBufferSubDataARB(this.field1414, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lhj;I[BIZ)V")
    public class95(class338 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1411 = arg0;
        this.field1414 = arg1;
        this.field1413 = arg3;
        this.field1412 = arg4;
        opengl var6 = arg0.field4607;
        var6.glGenBuffersARB(1, field1410, 0);
        this.field1409 = field1410[0];
        this.method642();
        var6.glBufferDataARB(arg1, this.field1413, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field1413), this.field1412 ? 35040 : 35044);
        this.field1411.field4624 += this.field1413;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lhj;ILjava/nio/ByteBuffer;Z)V")
    public class95(class338 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field1411 = arg0;
        this.field1414 = arg1;
        this.field1413 = arg2.limit();
        this.field1412 = arg3;
        opengl var5 = arg0.field4607;
        var5.glGenBuffersARB(1, field1410, 0);
        this.field1409 = field1410[0];
        this.method642();
        var5.glBufferDataARB(arg1, this.field1413, arg2, this.field1412 ? 35040 : 35044);
        this.field1411.field4624 += this.field1413;
    }
}
