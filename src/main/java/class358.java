import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class358 extends class317 {

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5127;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)[B")
    public final byte[] method1939(int arg0, int arg1, int arg2) {
        this.field5127.position(arg0);
        if (arg1 != 22300) {
            this.method1938(-38);
        }
        byte[] var4 = new byte[arg2];
        this.field5127.get(var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I[B)V")
    public final void method1940(int arg0, byte[] arg1) {
        this.field5127 = ByteBuffer.allocateDirect(arg1.length);
        this.field5127.position(0);
        if (arg0 <= 66) {
            this.field5127 = null;
        }
        this.field5127.put(arg1);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)[B")
    public final byte[] method1938(int arg0) {
        if (arg0 < 11) {
            this.field5127 = null;
        }
        byte[] var2 = new byte[this.field5127.capacity()];
        this.field5127.position(0);
        this.field5127.get(var2);
        return var2;
    }
}
