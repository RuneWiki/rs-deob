import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class212 extends class227 {

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "[B")
    private byte[] field2975;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)[B")
    public final byte[] method1421(int arg0, int arg1, int arg2) {
        this.field2975 = new byte[arg0 * arg1 * arg2 * 2];
        this.method292((byte) -31, arg1, arg0, arg2);
        return this.field2975;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
    public class212() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
    public final void method1422(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2975[var10001] = var4;
        this.field2975[var5] = var4;
    }
}
