import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class121 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lks;")
    public class173 field1614;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Z")
    private boolean field1617;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "[I")
    private static int[] field1619 = new int[1];

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([BI)V", line = 11)
    public final void method820(byte[] arg0, int arg1) {
        this.method52();
        if (arg1 > this.field1616) {
            this.field1614.field2253.glBufferDataARB(this.field1615, arg1, ByteBuffer.wrap(arg0, 0, arg1), this.field1617 ? 35040 : 35044);
            this.field1614.field2268 += arg1 - this.field1616;
            this.field1616 = arg1;
        } else {
            this.field1614.field2253.glBufferSubDataARB(this.field1615, 0, arg1, ByteBuffer.wrap(arg0, 0, arg1));
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()I", line = 23)
    public int method49() {
        return this.field1618;
    }

    @OriginalMember(owner = "client!ld", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        this.field1614.method1197(this.field1618, this.field1616);
        super.finalize();
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lks;I[BIZ)V", line = 40)
    public class121(class173 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1614 = arg0;
        this.field1615 = arg1;
        this.field1616 = arg3;
        this.field1617 = arg4;
        opengl var6 = arg0.field2253;
        var6.glGenBuffersARB(1, field1619, 0);
        this.field1618 = field1619[0];
        this.method52();
        var6.glBufferDataARB(arg1, this.field1616, arg2 == null ? null : ByteBuffer.wrap(arg2, 0, this.field1616), this.field1617 ? 35040 : 35044);
        this.field1614.field2268 += this.field1616;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lks;ILjava/nio/ByteBuffer;Z)V", line = 57)
    public class121(class173 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        this.field1614 = arg0;
        this.field1615 = arg1;
        this.field1616 = arg2.limit();
        this.field1617 = arg3;
        opengl var5 = arg0.field2253;
        var5.glGenBuffersARB(1, field1619, 0);
        this.field1618 = field1619[0];
        this.method52();
        var5.glBufferDataARB(arg1, this.field1616, arg2, this.field1617 ? 35040 : 35044);
        this.field1614.field2268 += this.field1616;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()V")
    public abstract void method52();
}
