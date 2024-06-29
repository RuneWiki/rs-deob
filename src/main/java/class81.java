import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class81 extends class173 {

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "[B")
    private byte[] field1112;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)[B", line = 3)
    public final byte[] method577(int arg0, int arg1, int arg2) {
        this.field1112 = new byte[arg0 * arg1 * arg2 * 2];
        this.method213(arg0, arg2, -586576148, arg1);
        return this.field1112;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V", line = 9)
    public final void method578(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1112[var10001] = var4;
        this.field1112[var5] = var4;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V", line = 16)
    public class81() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
