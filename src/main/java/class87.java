import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class87 extends class441 {

    @OriginalMember(owner = "client!g", name = "G", descriptor = "[B")
    private byte[] field1343;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(III)[B")
    public final byte[] method603(int arg0, int arg1, int arg2) {
        this.field1343 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2322(-6496, arg0, arg2, arg1);
        return this.field1343;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
    public final void method604(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1343[var10001] = (byte) (var4 * 3 >> 5);
        this.field1343[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class87() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
