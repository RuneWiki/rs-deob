import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class335 extends class529 {

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "Lqi;")
    public static class669 field4308 = new class669(6, 1);

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public static int field4312 = 0;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4306;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "[I")
    public static int[] field4305;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1958(boolean arg0) {
        if (!arg0) {
            field4305 = null;
            field4308 = null;
            field4306 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[[I", line = 19)
    public final int[][] method592(int arg0, int arg1) {
        ++field4304;
        if (arg1 != 2) {
            this.method592(-89, 6);
        }
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (super.field7450.field5165) {
            int[][] var4 = this.method3026(0, arg0, 18464);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class304.field3909; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 67)
    public class335() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLtn;)V", line = 70)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field4307;
        if (arg0 == 0) {
            super.field7461 = ~arg2.method1094(255) == -2;
        }
        if (arg1 < 45) {
            method1958(false);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)[I", line = 84)
    public final int[] method191(int arg0, byte arg1) {
        ++field4309;
        int var3 = 75 / ((27 - arg1) / 49);
        int[] var4 = super.field7456.method1635(arg0, -127);
        if (super.field7456.field3449) {
            int[] var5 = this.method3028((byte) 126, arg0, 0);
            for (int var6 = 0; class304.field3909 > var6; ++var6) {
                var4[var6] = -var5[var6] + 4096;
            }
        }
        return var4;
    }
}
