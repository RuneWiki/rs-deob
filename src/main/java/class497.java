import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class497 extends class629 {

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "Lrf;")
    public static class157 field7032 = new class157();

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!ws", name = "M", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!ws", name = "N", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!ws", name = "O", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!ws", name = "P", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "[B")
    private byte[] field7030;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(Z)V")
    public static void method2833(boolean arg0) {
        field7032 = null;
        if (!arg0) {
            field7031 = 75;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)V")
    public final void method2189(int arg0, byte arg1, int arg2) {
        field7037++;
        if (arg2 != -6820) {
            this.method2189(-4, (byte) -68, -111);
        }
        int var4 = arg0 * 2;
        int var6 = var4 + 1;
        this.field7030[var4] = -1;
        int var5 = arg1 & 0xFF;
        this.field7030[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)Z")
    public static final boolean method2834(byte arg0, int arg1) {
        if (arg0 <= 112) {
            field7034 = 125;
        }
        field7036++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
    public class497() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BIII)[B")
    public final byte[] method2835(byte arg0, int arg1, int arg2, int arg3) {
        field7035++;
        this.field7030 = new byte[arg1 * 2 * arg2 * arg3];
        this.method1858(arg1, arg3, 0, arg2);
        if (arg0 >= -105) {
            this.field7030 = null;
        }
        return this.field7030;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
    public static final void method2836(int arg0, int arg1) {
        class211.field2855.method3900(arg1, arg0 ^ 0x4569);
        field7033++;
        class475.field6813.method3900(arg1, 0);
        class634.field9147.method3900(arg1, 0);
        class549.field8078.method3900(arg1, arg0 ^ arg0);
    }
}
