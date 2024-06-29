import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class689 extends class583 {

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "[Ljava/lang/String;")
    public static String[] field9587 = new String[5];

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "Lhg;")
    public static class693 field9591 = new class693(68, 2);

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "[B")
    private byte[] field9588;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V")
    public static void method3868(byte arg0) {
        if (arg0 <= -11) {
            field9587 = null;
            field9591 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3869(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -59072692) {
            this.method3869(-87, 41, -23, 0);
        }
        this.field9588 = new byte[arg0 * arg2 * arg1 * 2];
        field9590++;
        this.method1058(arg1, arg0, arg2, (byte) -126);
        return this.field9588;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)V")
    public final void method946(int arg0, byte arg1, int arg2) {
        field9589++;
        int var4 = arg0 * 2;
        if (arg2 == -28541) {
            this.field9588[var4++] = -1;
            int var5 = arg1 & 0xFF;
            this.field9588[var4] = (byte) (var5 * 3 >> 5);
        }
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
    public class689() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
