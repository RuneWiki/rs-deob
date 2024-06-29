import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class358 extends class495 {

    @OriginalMember(owner = "client!eaa", name = "K", descriptor = "Z")
    public static boolean field4640 = false;

    @OriginalMember(owner = "client!eaa", name = "M", descriptor = "[Ldj;")
    public static class455[] field4642 = new class455[35];

    @OriginalMember(owner = "client!eaa", name = "D", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!eaa", name = "I", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!eaa", name = "J", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!eaa", name = "N", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!eaa", name = "O", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!eaa", name = "L", descriptor = "[B")
    private byte[] field4641;

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V", line = 5)
    public class358() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(IIII)[B", line = 8)
    public final byte[] method2059(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1672) {
            field4643 = 48;
        }
        field4637++;
        this.field4641 = new byte[arg0 * arg1 * arg3 * 2];
        this.method3734(arg0, arg3, 255, arg1);
        return this.field4641;
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V", line = 21)
    public static void method2060(int arg0) {
        field4642 = null;
        if (arg0 != -960) {
            method2060(56);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIB)V", line = 37)
    public final void method2061(int arg0, int arg1, byte arg2) {
        field4644++;
        if (arg0 >= -29) {
            field4643 = -108;
        }
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var6 = var4 + 1;
        this.field4641[var4] = (byte) (var5 * 3 >> 5);
        this.field4641[var6] = (byte) (var5 * 3 >> 5);
    }
}
