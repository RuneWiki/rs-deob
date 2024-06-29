import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class736 extends class108 {

    @OriginalMember(owner = "client!pw", name = "D", descriptor = "I")
    public static int field10185;

    @OriginalMember(owner = "client!pw", name = "E", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!pw", name = "G", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!pw", name = "H", descriptor = "Lgs;")
    public static class48 field10189;

    @OriginalMember(owner = "client!pw", name = "F", descriptor = "[B")
    private byte[] field10187;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IBB)V", line = 4)
    public final void method86(int arg0, byte arg1, byte arg2) {
        field10186++;
        int var4 = arg0 * 2;
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var6 = -80 % ((-arg1 - 75) / 40);
        int var10001 = var4;
        int var7 = var4 + 1;
        this.field10187[var10001] = var5;
        this.field10187[var7] = var5;
    }

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "(I)V", line = 18)
    public static void method4078(int arg0) {
        field10189 = null;
        if (arg0 < 7) {
            field10189 = null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V", line = 31)
    public class736() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 34)
    public static final void method4079(int arg0, boolean arg1, String arg2) {
        field10188++;
        class129.method1043(-1, 1, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIII)[B", line = 42)
    public final byte[] method4080(int arg0, int arg1, int arg2, int arg3) {
        this.field10187 = new byte[arg1 * arg3 * 2 * arg2];
        int var5 = 86 / ((arg0 + 9) / 47);
        field10185++;
        this.method1751((byte) 105, arg3, arg1, arg2);
        return this.field10187;
    }
}
