import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class142 extends class97 implements class220 {

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Luk;)V", line = 4)
    public final void method875(class143 arg0) {
        this.field1388.field6330.glVertexPointer(arg0.field2009, arg0.field2007, this.field2005, (long) arg0.field2010);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()V", line = 7)
    public final void method626() {
        this.field1388.method2664(this);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(Luk;)V", line = 10)
    public final void method876(class143 arg0) {
        this.field1388.field6330.glColorPointer(arg0.field2009, arg0.field2007, this.field2005, (long) arg0.field2010);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lqi;ILjava/nio/ByteBuffer;Z)V", line = 14)
    public class142(class458 arg0, int arg1, ByteBuffer arg2, boolean arg3) {
        super(arg0, 34962, arg2, arg3);
        this.field2005 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(Luk;)V", line = 19)
    public final void method877(class143 arg0) {
        this.field1388.field6330.glTexCoordPointer(arg0.field2009, arg0.field2007, this.field2005, (long) arg0.field2010);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Luk;)V", line = 22)
    public final void method878(class143 arg0) {
        this.field1388.field6330.glNormalPointer(arg0.field2007, this.field2005, (long) arg0.field2010);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lqi;I[BIZ)V", line = 25)
    public class142(class458 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2005 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()I", line = 29)
    public final int method234() {
        return super.method234();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BI)V", line = 32)
    public final void method879(int arg0, byte[] arg1, int arg2) {
        this.method627(arg1, arg2);
        this.field2005 = arg0;
    }
}
