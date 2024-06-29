import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class426 extends class56 {

    @OriginalMember(owner = "client!ifa", name = "E", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!ifa", name = "H", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!ifa", name = "I", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!ifa", name = "J", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!ifa", name = "K", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!ifa", name = "G", descriptor = "Loia;")
    public static class88 field5985;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "(B)V")
    public static void method2599(byte arg0) {
        field5985 = null;
        if (arg0 != 81) {
            method2600((byte) 82);
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ)[I")
    public final int[] method24(int arg0, boolean arg1) {
        ++field5989;
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            int[][] var4 = this.method369(arg0, -83, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class328.field4576 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        if (!arg1) {
            method2599((byte) 39);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "(B)V")
    public static final void method2600(byte arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class52.field596[var1] = false;
        }
        ++field5984;
        int var2 = -98 / ((-4 - arg0) / 40);
        class97.field1168 = 1;
        class218.field2850 = -1;
        class419.field5919 = -1;
        class577.field8152 = 0;
        class150.field2124 = -1;
        class44.field532 = -1;
        class291.field4105 = 0;
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
    public class426() {
        super(1, true);
    }
}
