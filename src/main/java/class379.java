import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class379 extends class154 {

    @OriginalMember(owner = "client!am", name = "G", descriptor = "[B")
    private byte[] field5412;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V", line = 5)
    public final void method1034(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field5412[var10001] = var4;
        this.field5412[var5] = var4;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(III)[B", line = 11)
    public final byte[] method2422(int arg0, int arg1, int arg2) {
        this.field5412 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2756(arg0, arg2, 936163788, arg1);
        return this.field5412;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V", line = 16)
    public class379() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
