import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class72 extends class292 {

    @OriginalMember(owner = "client!so", name = "N", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "Lpg;")
    public static class492 field982 = new class492(11, 5);

    @OriginalMember(owner = "client!so", name = "P", descriptor = "Lcm;")
    public static class449 field983 = new class449(10, 8);

    @OriginalMember(owner = "client!so", name = "J", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!so", name = "K", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!so", name = "M", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!so", name = "I", descriptor = "[B")
    private byte[] field976;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "[I")
    public static int[] field979;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(B)V")
    public static void method483(byte arg0) {
        field982 = null;
        if (arg0 == 18) {
            field983 = null;
            field979 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
    public class72() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IIII)[B")
    public final byte[] method484(int arg0, int arg1, int arg2, int arg3) {
        this.field976 = new byte[arg0 * arg3 * arg2 * 2];
        field977++;
        this.method1378(arg0, arg2, -29917, arg3);
        return arg1 == 9891 ? this.field976 : null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BIZ)V")
    public final void method485(byte arg0, int arg1, boolean arg2) {
        field978++;
        byte var4 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var5 = arg1 * 2;
        if (!arg2) {
            this.field976[var5++] = var4;
            this.field976[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(III)Z")
    public static final boolean method486(int arg0, int arg1, int arg2) {
        field980++;
        if (arg1 != 27650) {
            method486(-40, 45, -49);
        }
        return (arg2 & 0x180) != 0;
    }
}
