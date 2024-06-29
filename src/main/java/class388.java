import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class388 extends class451 {

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "[I")
    public static int[] field5763 = new int[2];

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field5762 = 0;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field5765 = 1406;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "[B")
    private byte[] field5761;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Z", line = 3)
    public static final boolean method2391(byte arg0) {
        field5760++;
        if (class273.field4108) {
            try {
                if ((Boolean) class556.method3150(-21295, class421.field6129, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == 3;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 23)
    public class388() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIB)V", line = 26)
    public final void method2392(boolean arg0, int arg1, byte arg2) {
        field5764++;
        byte var4 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        if (arg0) {
            return;
        }
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field5761[var10001] = var4;
        this.field5761[var6] = var4;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V", line = 41)
    public static void method2393(byte arg0) {
        field5763 = null;
        if (arg0 < 10) {
            method2393((byte) -112);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBII)[B", line = 68)
    public final byte[] method2394(int arg0, byte arg1, int arg2, int arg3) {
        field5759++;
        this.field5761 = new byte[arg0 * arg2 * arg3 * 2];
        if (arg1 <= 60) {
            field5765 = -106;
        }
        this.method3724(arg0, arg2, arg3, -1029882484);
        return this.field5761;
    }
}
