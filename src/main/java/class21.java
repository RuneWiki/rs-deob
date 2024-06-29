import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class21 extends class755 {

    @OriginalMember(owner = "client!qia", name = "H", descriptor = "Lqfa;")
    public static class98 field318 = new class98(70, 0);

    @OriginalMember(owner = "client!qia", name = "D", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!qia", name = "E", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!qia", name = "F", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!qia", name = "J", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!qia", name = "G", descriptor = "[B")
    private byte[] field317;

    @OriginalMember(owner = "client!qia", name = "I", descriptor = "[Ljt;")
    public static class104[] field319;

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "()V", line = 3)
    public class21() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(ZBI)V", line = 6)
    public final void method131(boolean arg0, byte arg1, int arg2) {
        field316++;
        int var4 = arg2 * 2;
        if (arg0) {
            field318 = null;
        }
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        this.field317[var4++] = var5;
        this.field317[var4] = var5;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(JJ)J", line = 21)
    public static long method132(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IZ)I", line = 33)
    public static final int method133(int arg0, boolean arg1) {
        field314++;
        if (!arg1) {
            field319 = null;
        }
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "(I)V", line = 67)
    public static void method134(int arg0) {
        field318 = null;
        field319 = null;
        if (arg0 != -15522) {
            field319 = null;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IBII)[B", line = 78)
    public final byte[] method135(int arg0, byte arg1, int arg2, int arg3) {
        field315++;
        this.field317 = new byte[arg0 * arg3 * 2 * arg2];
        if (arg1 != -56) {
            method134(23);
        }
        this.method2625(arg0, arg2, false, arg3);
        return this.field317;
    }
}
