import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class121 extends class23 {

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2195;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([BZ)V")
    public final void method114(byte[] arg0, boolean arg1) {
        this.field2195 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1) {
            this.method114((byte[]) null, false);
        }
        this.field2195.position(0);
        this.field2195.put(arg0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)[B")
    public final byte[] method112(int arg0) {
        int var2 = -45 / ((63 - arg0) / 61);
        byte[] var3 = new byte[this.field2195.capacity()];
        this.field2195.position(0);
        this.field2195.get(var3);
        return var3;
    }
}
