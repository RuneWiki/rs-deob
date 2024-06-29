import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class149 extends class408 {

    @OriginalMember(owner = "client!od", name = "J", descriptor = "[B")
    private byte[] field1810;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)V")
    public final void method718(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field1810[var10001] = (byte) (var4 * 3 >> 5);
        this.field1810[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)[B")
    public final byte[] method719(int arg0, int arg1, int arg2) {
        this.field1810 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2615(arg0, arg1, (byte) 122, arg2);
        return this.field1810;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class149() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
