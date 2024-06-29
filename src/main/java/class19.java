import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class84 {

    @OriginalMember(owner = "client!bu", name = "M", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "Lcea;")
    public static class196 field171 = new class196();

    @OriginalMember(owner = "client!bu", name = "N", descriptor = "Lhh;")
    public static class116 field175 = new class116(0);

    @OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!bu", name = "K", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!bu", name = "L", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!bu", name = "O", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "Le;")
    public static class486 field169;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "[B")
    private byte[] field170;

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V", line = 4)
    public class19() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIII)[B", line = 12)
    public final byte[] method76(int arg0, int arg1, int arg2, int arg3) {
        this.field170 = new byte[arg2 * arg3 * arg0 * 2];
        if (arg1 != 0) {
            field169 = null;
        }
        field173++;
        this.method2940((byte) 28, arg3, arg0, arg2);
        return this.field170;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IBB)V", line = 25)
    public final void method77(int arg0, byte arg1, byte arg2) {
        if (arg1 != -114) {
            this.method76(79, -10, 69, -96);
        }
        field168++;
        int var4 = arg0 * 2;
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field170[var10001] = var5;
        this.field170[var6] = var5;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 40)
    public static void method78(byte arg0) {
        if (arg0 > -23) {
            method78((byte) -93);
        }
        field169 = null;
        field171 = null;
        field175 = null;
    }
}
