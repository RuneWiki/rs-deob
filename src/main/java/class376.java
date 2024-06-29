import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class376 extends class160 {

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "[B")
    private byte[] field5513;

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V", line = 3)
    public class376() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IB)V", line = 7)
    public final void method1074(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5513[var10001] = var4;
        this.field5513[var5] = var4;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)[B", line = 13)
    public final byte[] method2460(int arg0, int arg1, int arg2) {
        this.field5513 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1598(arg1, arg0, (byte) 126, arg2);
        return this.field5513;
    }
}
