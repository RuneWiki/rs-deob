import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class572 extends class489 {

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "Lps;")
    public static class469 field8122 = new class469(0, 7);

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "[B")
    private byte[] field8118;

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V", line = 3)
    public class572() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method3232(boolean arg0) {
        if (!arg0) {
            class416.method2342((byte) -72);
            field8120++;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)V", line = 23)
    public final void method2247(byte arg0, int arg1, int arg2) {
        field8121++;
        byte var4 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field8118[var10001] = var4;
        if (arg2 == 24982) {
            this.field8118[var6] = var4;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBII)[B", line = 39)
    public final byte[] method3233(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 117) {
            field8122 = null;
        }
        this.field8118 = new byte[arg0 * 2 * arg2 * arg3];
        field8119++;
        this.method774(97, arg3, arg0, arg2);
        return this.field8118;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 52)
    public static void method3234(int arg0) {
        if (arg0 == 1517326177) {
            field8122 = null;
        }
    }
}
