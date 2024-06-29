import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class248 extends class577 {

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "Loga;")
    public static class158 field3266 = new class158();

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field3272 = 0;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "Lvs;")
    public static class476 field3268 = new class476();

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Lvg;")
    public static class622 field3273 = new class622(34, 6);

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "Ltba;")
    public static class48 field3274;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "[B")
    private byte[] field3271;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZIB)V", line = 3)
    public final void method1508(boolean arg0, int arg1, byte arg2) {
        field3270++;
        int var4 = arg1 * 2;
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field3271[var10001] = var5;
        if (!arg0) {
            field3268 = null;
        }
        this.field3271[var6] = var5;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V", line = 20)
    public static void method1509(byte arg0) {
        field3266 = null;
        field3268 = null;
        if (arg0 < -105) {
            field3273 = null;
            field3274 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 38)
    public class248() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(IIII)[B", line = 48)
    public final byte[] method1510(int arg0, int arg1, int arg2, int arg3) {
        field3267++;
        if (arg1 == -11320) {
            this.field3271 = new byte[arg0 * arg2 * 2 * arg3];
            this.method1858(arg0, arg2, 0, arg3);
            return this.field3271;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 61)
    public static final void method1511(int arg0) {
        int var1 = -67 / ((-arg0 - 54) / 37);
        if (class128.field1846 != null) {
            class128.field1846.method156(-121);
        }
        field3269++;
        if (class378.field5680 != null) {
            class378.field5680.method156(72);
        }
    }
}
