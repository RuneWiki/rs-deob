import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class352 extends class629 {

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field5237 = 0;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "[Lak;")
    public static class677[] field5238 = new class677[4];

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "[B")
    private byte[] field5235;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "[[[B")
    public static byte[][][] field5236;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V", line = 4)
    public static void method2187(byte arg0) {
        if (arg0 > 14) {
            field5238 = null;
            field5236 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BIII)[B", line = 15)
    public final byte[] method2188(byte arg0, int arg1, int arg2, int arg3) {
        field5234++;
        this.field5235 = new byte[arg1 * arg3 * arg2 * 2];
        this.method1858(arg1, arg3, 0, arg2);
        if (arg0 >= -105) {
            field5237 = -117;
        }
        return this.field5235;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)V", line = 30)
    public final void method2189(int arg0, byte arg1, int arg2) {
        field5239++;
        if (arg2 != -6820) {
            return;
        }
        int var4 = arg0 * 2;
        int var5 = arg1 & 0xFF;
        int var6 = var4 + 1;
        this.field5235[var4] = (byte) (var5 * 3 >> 5);
        this.field5235[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 56)
    public class352() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
