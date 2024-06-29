import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class299 extends class691 {

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4522;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "([BI)V", line = 6)
    public final void method1919(byte[] arg0, int arg1) {
        this.field4522 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1 != 1) {
            this.method1920(-115);
        }
        this.field4522.position(0);
        this.field4522.put(arg0);
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)[B", line = 20)
    public final byte[] method1920(int arg0) {
        byte[] var2 = new byte[this.field4522.capacity()];
        this.field4522.position(0);
        this.field4522.get(var2);
        int var3 = -79 % ((26 - arg0) / 48);
        return var2;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(III)[B", line = 33)
    public final byte[] method1921(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        this.field4522.position(arg0);
        this.field4522.get(var4, 0, arg2);
        if (arg1 != -65) {
            this.field4522 = null;
        }
        return var4;
    }
}
