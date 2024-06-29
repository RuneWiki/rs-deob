import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class315 extends class324 {

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "[B")
    private byte[] field4463;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "[Lnn;")
    public static class417[] field4461;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V", line = 3)
    public static void method1992(byte arg0) {
        field4461 = null;
        if (arg0 >= -41) {
            method1992((byte) 5);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBI)V", line = 13)
    public final void method1993(int arg0, byte arg1, int arg2) {
        if (arg0 != 4096) {
            this.field4463 = null;
        }
        field4465++;
        int var4 = arg2 * 2;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4463[var10001] = -1;
        int var5 = arg1 & 0xFF;
        this.field4463[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBII)[B", line = 33)
    public final byte[] method1994(int arg0, byte arg1, int arg2, int arg3) {
        field4464++;
        this.field4463 = new byte[arg0 * arg3 * arg2 * 2];
        if (arg1 < 24) {
            method1992((byte) -24);
        }
        this.method3318(arg0, arg3, arg2, (byte) -22);
        return this.field4463;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 46)
    public class315() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
