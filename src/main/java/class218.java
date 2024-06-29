import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class218 extends class326 {

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "[B")
    private byte[] field3098;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class218() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)V")
    public final void method1356(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3098[var10001] = (byte) (var4 * 3 >> 5);
        this.field3098[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)[B")
    public final byte[] method1357(int arg0, int arg1, int arg2) {
        this.field3098 = new byte[arg0 * arg1 * arg2 * 2];
        this.method538(arg2, false, arg1, arg0);
        return this.field3098;
    }
}
