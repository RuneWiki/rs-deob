import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class369 extends class450 implements class220 {

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    private int field5230;

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lqi;I[BI)V", line = 4)
    public class369(class458 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5230 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Luk;)V", line = 10)
    public final void method875(class143 arg0) {
        this.field6190.field6330.glVertexPointer(arg0.field2009, arg0.field2007, this.field5230, this.field6191.position(arg0.field2010));
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(Luk;)V", line = 13)
    public final void method876(class143 arg0) {
        this.field6190.field6330.glColorPointer(arg0.field2009, arg0.field2007, this.field5230, this.field6191.position(arg0.field2010));
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lqi;ILjava/nio/ByteBuffer;)V", line = 16)
    public class369(class458 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field5230 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Luk;)V", line = 20)
    public final void method878(class143 arg0) {
        this.field6190.field6330.glNormalPointer(arg0.field2007, this.field5230, this.field6191.position(arg0.field2010));
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()I", line = 23)
    public final int method234() {
        return 0;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(Luk;)V", line = 26)
    public final void method877(class143 arg0) {
        this.field6190.field6330.glTexCoordPointer(arg0.field2009, arg0.field2007, this.field5230, this.field6191.position(arg0.field2010));
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I[BI)V", line = 29)
    public final void method879(int arg0, byte[] arg1, int arg2) {
        this.method2608(arg1, arg2);
        this.field5230 = arg0;
    }
}
