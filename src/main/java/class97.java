import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class97 extends class292 {

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "[B")
    private byte[] field1739;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)[B", line = 3)
    public final byte[] method722(int arg0, int arg1, int arg2) {
        this.field1739 = new byte[arg0 * arg1 * arg2 * 2];
        this.method1446(arg0, arg2, (byte) -88, arg1);
        return this.field1739;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 9)
    public class97() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)V", line = 13)
    public final void method723(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1739[var10001] = var4;
        this.field1739[var5] = var4;
    }
}
