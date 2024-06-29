import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class74 extends class59 {

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field985;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)[B")
    public final byte[] method490(int arg0) {
        if (arg0 == 9) {
            byte[] var2 = new byte[this.field985.capacity()];
            this.field985.position(0);
            this.field985.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([BI)V")
    public final void method492(byte[] arg0, int arg1) {
        if (arg1 != -7435) {
            this.method493(110, -77, 78);
        }
        this.field985 = ByteBuffer.allocateDirect(arg0.length);
        this.field985.position(0);
        this.field985.put(arg0);
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(III)[B")
    public final byte[] method493(int arg0, int arg1, int arg2) {
        byte[] var4 = new byte[arg2];
        this.field985.position(arg0);
        this.field985.get(var4, 0, arg2);
        int var5 = 99 / ((50 - arg1) / 39);
        return var4;
    }
}
