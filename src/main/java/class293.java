import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class293 extends class194 implements class254 {

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    private int field4211;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I[BI)V", line = 5)
    public final void method444(int arg0, byte[] arg1, int arg2) {
        this.method1237(arg1, arg2);
        this.field4211 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "()I", line = 9)
    public final int method380() {
        return 0;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lpe;)V", line = 12)
    public final void method447(class363 arg0) {
        this.field2643.field4752.glVertexPointer(arg0.field5290, arg0.field5288, this.field4211, this.field2644.position(arg0.field5287));
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(Lpe;)V", line = 15)
    public final void method445(class363 arg0) {
        this.field2643.field4752.glNormalPointer(arg0.field5288, this.field4211, this.field2644.position(arg0.field5287));
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILpe;)V", line = 19)
    public final void method448(int arg0, class363 arg1) {
        this.field2643.field4752.glClientActiveTexture(arg0 + 33984);
        this.field2643.field4752.glTexCoordPointer(arg1.field5290, arg1.field5288, this.field4211, this.field2644.position(arg1.field5287));
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lpe;)V", line = 23)
    public final void method446(class363 arg0) {
        this.field2643.field4752.glColorPointer(arg0.field5290, arg0.field5288, this.field4211, this.field2644.position(arg0.field5287));
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lpo;I[BI)V", line = 26)
    public class293(class332 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4211 = arg1;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lpo;ILjava/nio/ByteBuffer;)V", line = 30)
    public class293(class332 arg0, int arg1, ByteBuffer arg2) {
        super(arg0, arg2);
        this.field4211 = arg1;
    }
}
