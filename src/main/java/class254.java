import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class254 extends class203 {

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "[B")
    private byte[] field3853;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)V", line = 5)
    public final void method1386(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field3853[var10001] = (byte) (var4 * 3 >> 5);
        this.field3853[var5] = (byte) (var4 >> 2);
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)[B", line = 12)
    public final byte[] method1724(int arg0, int arg1, int arg2) {
        this.field3853 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1628(arg2, arg0, arg1, 255);
        return this.field3853;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 17)
    public class254() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
