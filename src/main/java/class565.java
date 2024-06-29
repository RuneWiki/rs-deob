import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class565 extends class335 {

    @OriginalMember(owner = "client!fga", name = "E", descriptor = "Ltt;")
    public static class338 field7704 = new class338(63, 0);

    @OriginalMember(owner = "client!fga", name = "H", descriptor = "F")
    public static float field7707 = 0.0F;

    @OriginalMember(owner = "client!fga", name = "G", descriptor = "Leba;")
    public static class550 field7706 = new class550(2, -1);

    @OriginalMember(owner = "client!fga", name = "I", descriptor = "B")
    public static byte field7708;

    @OriginalMember(owner = "client!fga", name = "B", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!fga", name = "C", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!fga", name = "D", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!fga", name = "F", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!fga", name = "J", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!fga", name = "K", descriptor = "Lbda;")
    public static class437 field7710;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "(I)V", line = 4)
    public static final void method3133(int arg0) {
        ++field7702;
        class380 var1 = class133.field1843;
        synchronized (class133.field1843) {
            class133.field1843.method2168((byte) -92);
        }
        if (arg0 != 4096) {
            method3134(-7);
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "()V", line = 19)
    public class565() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZI)[I", line = 23)
    public final int[] method3(boolean arg0, int arg1) {
        if (!arg0) {
            this.method3135((byte) -42, 108, -10);
        }
        ++field7703;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int var4 = class686.field9697[arg1];
            for (int var5 = 0; var5 < class649.field8968; ++var5) {
                var3[var5] = this.method3135((byte) 46, var4, class376.field4981[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "(I)V", line = 56)
    public static void method3134(int arg0) {
        field7706 = null;
        field7704 = null;
        if (arg0 == 2) {
            field7710 = null;
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BII)I", line = 74)
    private final int method3135(byte arg0, int arg1, int arg2) {
        ++field7701;
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        return arg0 <= 7 ? -82 : -(((var5 * 15731 * var5 - -789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
