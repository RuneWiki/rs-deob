import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class252 extends class223 {

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    private int field4031 = 20;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    private int field4026 = 1365;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    private int field4024 = 0;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    private int field4028 = 0;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field4025 = 0;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4021 = "purple:";

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "Lag;")
    public static class192 field4022 = new class192(64);

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Lub;")
    public static class92 field4020;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "Lub;")
    public static class92 field4034;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
    public static void method1706(int arg0) {
        field4022 = null;
        field4020 = null;
        field4021 = null;
        if (arg0 == 8679) {
            field4034 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lub;Lub;Lub;ILhe;)Z")
    public static final boolean method1707(class92 arg0, class92 arg1, class92 arg2, int arg3, class20 arg4) {
        class236.field3728 = arg4;
        ++field4023;
        class135.field2018 = arg1;
        if (arg3 != -5606) {
            method1710(-123);
        }
        field4034 = arg2;
        class214.field3288 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class252() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
    public static final void method1708(int arg0, int arg1) {
        ++field4033;
        if (class105.field1640 != arg1) {
            class270.field4277 = arg0;
        } else {
            class236.field3728.method150(-11182, arg0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V")
    public static final void method1709(int arg0) {
        class281.field4433.method1172((byte) 118);
        if (arg0 != 2) {
            field4022 = null;
        }
        ++field4027;
        class41.field683.method1172((byte) 127);
        class250.field4009.method1172((byte) 124);
    }

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)V")
    public static final void method1710(int arg0) {
        if (class301.field4848 != null) {
            class301.field4848.method1306((byte) -94);
            class301.field4848 = null;
        }
        class151.method1093(arg0 + -1);
        ++field4029;
        class89.method688();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class80.field1236[var1].method687((byte) 92);
        }
        class176.method1254((byte) 86, false);
        System.gc();
        class198.method1404((byte) 121, 2);
        class41.field697 = false;
        class75.field1164 = -1;
        class121.method915((byte) 123, true);
        class159.field2379 = 0;
        class135.field2027 = false;
        class138.field2072 = 0;
        class303.field4870 = 0;
        class279.field4424 = 0;
        for (int var2 = 0; class136.field2053.length > var2; ++var2) {
            class136.field2053[var2] = null;
        }
        class117.field1782 = 0;
        class259.field4112 = 0;
        for (int var3 = 0; var3 < 2048; ++var3) {
            class233.field3682[var3] = null;
            class98.field1575[var3] = null;
        }
        for (int var4 = arg0; var4 < 32768; ++var4) {
            class116.field1781[var4] = null;
        }
        for (int var5 = 0; ~var5 > -5; ++var5) {
            for (int var6 = 0; ~var6 > -105; ++var6) {
                for (int var7 = 0; ~var7 > -105; ++var7) {
                    class110.field1695[var5][var6][var7] = null;
                }
            }
        }
        class254.method1715(arg0);
        class79.field1210 = 0;
        class253.method1712((byte) -61);
        class120.method912(-3, true);
        try {
            class289.method1926(true, "loggedout", class123.field1863.field63);
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            field4020 = null;
        }
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field4024 = arg0.method260((byte) -67);
                    }
                } else {
                    this.field4028 = arg0.method260((byte) -67);
                }
            } else {
                this.field4031 = arg0.method260((byte) -67);
            }
        } else {
            this.field4026 = arg0.method260((byte) -67);
        }
        ++field4030;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field4032;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            for (int var4 = 0; ~var4 > ~class250.field4008; ++var4) {
                int var5 = (class106.field1662[var4] << 12) / this.field4026 + this.field4028;
                int var6 = var5;
                int var7 = (class307.field4925[arg1] << 12) / this.field4026 + this.field4024;
                int var8 = var5;
                int var9 = var7;
                int var10 = var5 * var5 >> 12;
                int var11 = var7;
                int var12 = var7 * var7 >> 12;
                int var13 = 0;
                while (~(var10 + var12) > -16385 && this.field4031 > var13) {
                    var11 = (var8 * var11 >> 12) * 2 + var9;
                    var8 = var10 - (var12 - var6);
                    var12 = var11 * var11 >> 12;
                    ++var13;
                    var10 = var8 * var8 >> 12;
                }
                var3[var4] = this.field4031 + -1 <= var13 ? 0 : (var13 << 12) / this.field4031;
            }
        }
        if (arg0 < 14) {
            this.field4026 = -8;
        }
        return var3;
    }
}
