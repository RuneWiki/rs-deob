import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class457 extends class571 {

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "[I")
    public static int[] field6848 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ew", name = "y", descriptor = "I")
    public static int field6847;

    @OriginalMember(owner = "client!ew", name = "A", descriptor = "I")
    public static int field6849;

    @OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!ew", name = "x", descriptor = "[B")
    private byte[] field6846;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V", line = 5)
    public static void method2866(int arg0) {
        field6848 = null;
        if (arg0 != 4353) {
            method2866(42);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(IIII)[B", line = 16)
    public final byte[] method2867(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -115 % ((arg0 + 56) / 42);
        field6849++;
        this.field6846 = new byte[arg1 * arg2 * arg3 * 2];
        this.method1998(arg1, 4095, arg3, arg2);
        return this.field6846;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "()V", line = 28)
    public class457() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IB)C", line = 31)
    public static final char method2868(int arg0, byte arg1) {
        field6850++;
        int var2 = arg1 & 0xFF;
        int var3 = -116 % ((6 - arg0) / 36);
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var4 = class43.field600[var2 - 128];
            if (var4 == '\u0000') {
                var4 = '?';
            }
            var2 = var4;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIB)V", line = 60)
    public final void method2869(int arg0, int arg1, byte arg2) {
        field6847++;
        byte var4 = (byte) (((arg2 & 0xFF) >> 1) + arg1);
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field6846[var10001] = var4;
        this.field6846[var6] = var4;
    }
}
