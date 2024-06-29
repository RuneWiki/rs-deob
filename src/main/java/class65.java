import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class65 extends class181 {

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "[B")
    private byte[] field1322;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(III)[B", line = 4)
    public final byte[] method564(int arg0, int arg1, int arg2) {
        this.field1322 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1308(arg2, (byte) 85, arg1, arg0);
        return this.field1322;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)V", line = 10)
    public final void method565(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1322[var10001] = var4;
        this.field1322[var5] = var4;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 16)
    public class65() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
