import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class551 extends class56 {

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field8005;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([BI)V", line = 5)
    public final void method653(byte[] arg0, int arg1) {
        this.field8005 = ByteBuffer.allocateDirect(arg0.length);
        this.field8005.position(0);
        this.field8005.put(arg0);
        if (arg1 != -13854) {
            this.method653(null, -65);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)[B", line = 18)
    public final byte[] method654(byte arg0) {
        byte[] var2 = new byte[this.field8005.capacity()];
        this.field8005.position(0);
        this.field8005.get(var2);
        if (arg0 < 59) {
            this.method653(null, 124);
        }
        return var2;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IBI)[B", line = 33)
    public final byte[] method656(int arg0, byte arg1, int arg2) {
        if (arg1 != 125) {
            this.method654((byte) -70);
        }
        this.field8005.position(arg2);
        byte[] var4 = new byte[arg0];
        this.field8005.get(var4, 0, arg0);
        return var4;
    }
}
