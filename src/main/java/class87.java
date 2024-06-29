import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class87 extends class103 {

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "[B")
    private byte[] field1096;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method515(int arg0, int arg1, int arg2) {
        this.field1096 = new byte[arg0 * arg1 * arg2 * 2];
        this.method417((byte) 15, arg0, arg2, arg1);
        return this.field1096;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)V", line = 9)
    public final void method516(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1096[var10001] = var4;
        this.field1096[var5] = var4;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V", line = 15)
    public class87() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
