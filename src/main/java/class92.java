import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class92 extends class457 {

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "[B")
    private byte[] field1227;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIII)[B", line = 6)
    public final byte[] method646(int arg0, int arg1, int arg2, int arg3) {
        field1225++;
        this.field1227 = new byte[arg0 * 2 * arg2 * arg3];
        if (arg1 == 20283) {
            this.method1624((byte) -81, arg3, arg2, arg0);
            return this.field1227;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)V", line = 20)
    public final void method65(int arg0, int arg1, byte arg2) {
        field1226++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var7 = var4 + 1;
        this.field1227[var10001] = (byte) (var5 * 3 >> 5);
        this.field1227[var7] = (byte) (var5 * 3 >> 5);
        int var6 = -116 % ((arg1 + 46) / 44);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 36)
    public class92() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
