import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class492 extends class140 {

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Lsl;")
    public static class456 field7327 = new class456("", 11);

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Luv;")
    public static class2 field7331 = new class2(64, 12);

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "F")
    public static float field7332;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "[B")
    private byte[] field7328;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBB)V")
    public final void method1021(int arg0, byte arg1, byte arg2) {
        if (arg2 >= -30) {
            this.method1021(63, (byte) -64, (byte) 23);
        }
        field7329++;
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field7328[var10001] = var4;
        this.field7328[var6] = var4;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
    public class492() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IIII)[B")
    public final byte[] method2935(int arg0, int arg1, int arg2, int arg3) {
        field7330++;
        this.field7328 = new byte[arg0 * arg1 * 2 * arg2];
        this.method1257(arg2, arg0, -124, arg1);
        int var5 = 30 % ((-arg3 - 76) / 48);
        return this.field7328;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)V")
    public static void method2936(boolean arg0) {
        if (arg0) {
            field7331 = null;
            field7327 = null;
        }
    }

    static {
        new class347("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
    }
}
