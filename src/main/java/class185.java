import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class185 extends class204 {

    @OriginalMember(owner = "client!on", name = "S", descriptor = "[B")
    private byte[] field2517;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)V", line = 4)
    public final void method1206(int arg0, byte arg1) {
        int var3 = arg0 * 2;
        int var4 = arg1 & 0xFF;
        int var10001 = var3;
        int var5 = var3 + 1;
        this.field2517[var10001] = (byte) (var4 * 3 >> 5);
        this.field2517[var5] = (byte) (var4 * 3 >> 5);
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(III)[B", line = 12)
    public final byte[] method1207(int arg0, int arg1, int arg2) {
        this.field2517 = new byte[arg0 * arg1 * arg2 * 2];
        this.method2756(arg0, arg2, 936163788, arg1);
        return this.field2517;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V", line = 17)
    public class185() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
