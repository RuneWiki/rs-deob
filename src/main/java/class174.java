import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class174 implements Runnable {

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[Lff;")
    public volatile class241[] field3069 = new class241[2];

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Z")
    public volatile boolean field3071 = false;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Z")
    public volatile boolean field3073 = false;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
    public static int[] field3064 = new int[32];

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3068 = 0;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Lr;")
    private static class66 field3070 = class93.method641(43, "You can(Wt add yourself to your own ignore list)3");

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Lr;")
    public static class66 field3060 = field3070;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lqc;")
    public static class245 field3066 = new class245(200);

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lik;")
    public class117 field3061;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lcj;")
    public static class28 field3065;

    @OriginalMember(owner = "client!wb", name = "run", descriptor = "()V")
    public final void run() {
        this.field3073 = true;
        field3074++;
        try {
            while (!this.field3071) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class241 var2 = this.field3069[var1];
                    if (var2 != null) {
                        var2.method1590((byte) 54);
                    }
                }
                class91.method636(-5, 10L);
                class253.method1700(this.field3061, (Object) null, (byte) -103);
            }
        } catch (Exception var9) {
            class181.method1205((String) null, var9, 38);
        } finally {
            Object var6 = null;
            this.field3073 = false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Lbk;")
    public static final class198 method1176(byte arg0, int arg1) {
        field3063++;
        class198 var2 = (class198) class95.field1834.method1505((long) arg1, (byte) -76);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class193.field3348.method135(arg1, 0, 5);
        if (arg0 <= 103) {
            field3070 = null;
        }
        class198 var4 = new class198();
        if (var3 != null) {
            var4.method1296((byte) 108, new class249(var3));
        }
        class95.field1834.method1497((long) arg1, (byte) -105, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field3065 = null;
        field3060 = null;
        field3066 = null;
        field3064 = null;
        int var1 = -37 / ((62 - arg0) / 41);
        field3070 = null;
    }
}
