import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class112 extends class117 {

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "[I")
    public static int[] field1761 = new int[14];

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "Lih;")
    public static class73 field1757;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
    public static void method786(byte arg0) {
        field1761 = null;
        if (arg0 >= -106) {
            method788(42);
        }
        field1757 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IBI)I")
    private final int method787(int arg0, byte arg1, int arg2) {
        ++field1762;
        if (arg1 != -55) {
            method788(-91);
        }
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return 4096 - (Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 + 1376312589) / 262144;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field1759;
        int[] var3 = super.field1883.method531(arg1, (byte) 111);
        if (arg0 != 2) {
            field1757 = null;
        }
        if (super.field1883.field1313) {
            int var4 = class173.field2835[arg1];
            for (int var5 = 0; var5 < class168.field2737; ++var5) {
                var3[var5] = this.method787(class243.field3869[var5], (byte) -55, var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "(I)V")
    public static final void method788(int arg0) {
        class211.field3332.method1257(arg0 + -28496);
        ++field1758;
        if (arg0 != 28577) {
            field1757 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)Ljava/lang/String;")
    public static final String method789(int arg0, int arg1) {
        ++field1760;
        int var2 = 75 % ((arg1 - -25) / 63);
        return ~class269.field4343[arg0].length() >= -1 ? class249.field3948[arg0] : class249.field3948[arg0] + class179.field2921 + class269.field4343[arg0];
    }
}
