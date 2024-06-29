import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class235 extends class163 implements class416 {

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    private int field3259;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "()V", line = 4)
    public final void method750() {
        this.field1962.method1465(this);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lic;ILjava/nio/ByteBuffer;Z)V", line = 7)
    public class235(class246 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field3259 = arg1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[BI)V", line = 11)
    public final void method1297(int arg0, byte[] arg1, int arg2) {
        this.method796(arg1, arg2);
        this.field3259 = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(Lfh;)V", line = 16)
    public final void method1298(class228 arg0) {
        this.field1962.field3342.glTexCoordPointer(arg0.field3165, arg0.field3164, this.field3259, (long) arg0.field3166);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lfh;)V", line = 19)
    public final void method1299(class228 arg0) {
        this.field1962.field3342.glNormalPointer(arg0.field3164, this.field3259, (long) arg0.field3166);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "()I", line = 22)
    public final int method747() {
        return super.method747();
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Lfh;)V", line = 25)
    public final void method1300(class228 arg0) {
        this.field1962.field3342.glVertexPointer(arg0.field3165, arg0.field3164, this.field3259, (long) arg0.field3166);
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(Lfh;)V", line = 29)
    public final void method1301(class228 arg0) {
        this.field1962.field3342.glColorPointer(arg0.field3165, arg0.field3164, this.field3259, (long) arg0.field3166);
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lic;I[BIZ)V", line = 32)
    public class235(class246 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3259 = arg1;
    }
}
