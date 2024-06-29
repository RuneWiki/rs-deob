import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class156 extends class7 {

    @OriginalMember(owner = "client!pg", name = "R", descriptor = "I")
    private int field3006 = 32768;

    @OriginalMember(owner = "client!pg", name = "Z", descriptor = "Lae;")
    public static class6 field3014 = new class6(5000);

    @OriginalMember(owner = "client!pg", name = "bb", descriptor = "Lob;")
    public static class141 field3016 = class175.method1195(40, "scrollbar");

    @OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
    public static int field3017 = -1;

    @OriginalMember(owner = "client!pg", name = "S", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!pg", name = "T", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!pg", name = "U", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!pg", name = "V", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!pg", name = "W", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!pg", name = "X", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!pg", name = "Y", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!pg", name = "ab", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        ++field3010;
        class54.method359(arg0);
        if (arg0 != 1) {
            method1087(-111, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        int var3 = -34 % ((arg1 - -42) / 41);
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[] var5 = this.method52(arg0, 1, 36);
            int[] var6 = this.method52(arg0, 2, 76);
            int[] var7 = var4[1];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            for (int var10 = 0; ~class117.field2272 < ~var10; ++var10) {
                int var11 = var6[var10] * this.field3006 >> 12;
                int var12 = 255 & var5[var10] * 255 >> 12;
                int var13 = class172.field3413[var12] * var11 >> 12;
                int var14 = class135.field2566[var12] * var11 >> 12;
                int var15 = class106.field2030 & (var14 >> 12) + var10;
                int var16 = class54.field1050 & (var13 >> 12) + arg0;
                int[][] var17 = this.method42(var16, 86, 0);
                var8[var10] = var17[0][var15];
                var7[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        ++field3007;
        return var4;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Z)V")
    public static void method1084(boolean arg0) {
        field3016 = null;
        field3014 = null;
        if (!arg0) {
            method1084(false);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)V")
    public static final void method1085(boolean arg0) {
        class200 var1 = class212.field4046;
        synchronized (class212.field4046) {
            ++class138.field2656;
            class125.field2395 = class60.field1169;
            class146.field2794 = class57.field1106;
            class174.field3452 = client.field610;
            class164.field3170 = class170.field3344;
            class81.field1630 = class90.field1780;
            class195.field3737 = class123.field2358;
            class38.field761 = class76.field1535;
            if (arg0) {
                field3017 = 89;
            }
            class170.field3344 = 0;
        }
        ++field3012;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IB)V")
    public static final void method1086(int arg0, byte arg1) {
        ++field3015;
        if (~class161.field3132 != ~arg0) {
            if (~class161.field3132 == -1) {
                class92.method629(0);
            }
            if (~arg0 == -21 || arg0 == 40) {
                class41.field808 = 0;
                class172.field3410 = 0;
                class26.field481 = 0;
            }
            if (~arg0 != -21 && ~arg0 != -41 && class116.field2229 != null) {
                class116.field2229.method1089(-2);
                class116.field2229 = null;
            }
            if (class161.field3132 == 25) {
                class24.field456 = 0;
                class182.field3581 = 1;
                class157.field3028 = 0;
                class174.field3447 = 1;
                class78.field1582 = 0;
            }
            int var2 = 48 / ((arg1 - -14) / 42);
            if (~arg0 != -6 && ~arg0 != -11 && arg0 != 20) {
                class86.method587(2);
            } else {
                class34.method243(-6692, class109.field2108, class176.field3488, class59.field1146);
            }
            class161.field3132 = arg0;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field3011;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field99 = arg2.method991(255) == 1;
            }
        } else {
            this.field3006 = arg2.method1007(127) << 4;
        }
        int var5 = -82 / ((66 - arg1) / 57);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 < 13) {
            return null;
        } else {
            int[] var3 = super.field100.method842(arg1, 12);
            ++field3013;
            if (super.field100.field2534) {
                int[] var4 = this.method52(arg1, 1, 66);
                int[] var5 = this.method52(arg1, 2, 90);
                for (int var6 = 0; ~class117.field2272 < ~var6; ++var6) {
                    int var7 = (var4[var6] & 4094) >> 4;
                    int var8 = var5[var6] * this.field3006 >> 12;
                    int var9 = class135.field2566[var7] * var8 >> 12;
                    int var10 = class172.field3413[var7] * var8 >> 12;
                    int var11 = (var10 >> 12) + arg1 & class54.field1050;
                    int var12 = var6 - -(var9 >> 12) & class106.field2030;
                    int[] var13 = this.method52(var11, 0, 108);
                    var3[var6] = var13[var12];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class156() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IB)Z")
    public static final boolean method1087(int arg0, byte arg1) {
        if (arg1 != 42) {
            return false;
        } else {
            ++field3009;
            return (1 & arg0) != 0;
        }
    }
}
