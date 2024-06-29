import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class693 extends class594 {

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "[[Z")
    public static boolean[][] field9603 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "Z")
    public static boolean field9602 = false;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB[B)[B", line = 4)
    public static final byte[] method3825(int arg0, byte arg1, byte[] arg2) {
        field9600++;
        if (arg1 < 77) {
            method3827((byte) -34);
        }
        byte[] var3 = new byte[arg0];
        class70.method557(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)V", line = 20)
    public static void method3826(byte arg0) {
        field9603 = null;
        int var1 = -85 / ((arg0 - 52) / 56);
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V", line = 32)
    public static final void method3827(byte arg0) {
        if (arg0 != -26) {
            method3827((byte) -59);
        }
        field9604++;
        if (class442.field5572 == 1 || class442.field5572 == 3 || class442.field5572 != class124.field1512 && (class442.field5572 == 0 || class124.field1512 == 0)) {
            class215.field2516 = 0;
            class99.field1276 = 0;
            class168.field1973.method3839((byte) -106);
        }
        class124.field1512 = class442.field5572;
    }
}
