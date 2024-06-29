import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class253 extends class223 {

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    private int field4037 = 2000;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    private int field4036 = 0;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    private int field4040 = 16;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    private int field4046 = 0;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    private int field4043 = 4096;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4038 = null;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field4045 = 0;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Ljava/lang/String;")
    public static String field4044 = "level: ";

    @OriginalMember(owner = "client!d", name = "X", descriptor = "[Z")
    public static boolean[] field4049 = new boolean[200];

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
    public static int field4052 = 0;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    public static void method1711(byte arg0) {
        if (arg0 <= -88) {
            field4038 = null;
            field4049 = null;
            field4044 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 <= 14) {
            field4039 = 74;
        }
        ++field4051;
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            int var4 = this.field4043 >> 1;
            int[][] var5 = super.field3588.method1612((byte) 105);
            Random var6 = new Random((long) this.field4036);
            for (int var7 = 0; ~this.field4037 < ~var7; ++var7) {
                int var8 = this.field4043 > 0 ? this.field4046 + class216.method1495(-2, var6, this.field4043) + -var4 : this.field4046;
                int var9 = 255 & var8 >> 4;
                int var10 = class216.method1495(-2, var6, class250.field4008);
                int var11 = class216.method1495(-2, var6, class172.field2654);
                int var12 = (class214.field3290[var9] * this.field4040 >> 12) + var10;
                int var13 = (class222.field3571[var9] * this.field4040 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var11;
                        int var20 = var10;
                        var11 = var13;
                        var10 = var12;
                        var12 = var20;
                        var13 = var19;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class216.method1495(-2, var6, 4096) >> 2) + 1024;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + 1024 + var26;
                        var24 += var23;
                        int var30 = var21 & class75.field1168;
                        int var31 = var28 & class280.field4430;
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 += var27;
                        }
                        if (!var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 != 500) {
            method1711((byte) 73);
        }
        class298.method2000((byte) -96);
        ++field4042;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
    public static final void method1712(byte arg0) {
        for (int var1 = 0; var1 < class67.field1041; ++var1) {
            class127 var2 = class206.method1439(47, var1);
            if (var2 != null && var2.field1907 == 0) {
                class168.field2529[var1] = 0;
                class257.field4090[var1] = 0;
            }
        }
        ++field4048;
        if (arg0 != -61) {
            field4044 = null;
        }
        class254.field4055 = new class305(16);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[B)I")
    public static final int method1713(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        for (int var5 = arg1; ~arg2 < ~var5; ++var5) {
            var4 = var4 >>> 8 ^ class142.field2119[255 & (arg3[var5] ^ var4)];
        }
        if (arg0 != -1405486520) {
            method1714((byte) 34);
        }
        int var6 = ~var4;
        ++field4041;
        return var6;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class253() {
        super(0, true);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field4043 = arg0.method260((byte) -67);
                        }
                    } else {
                        this.field4046 = arg0.method260((byte) -67);
                    }
                } else {
                    this.field4040 = arg0.method265(-108);
                }
            } else {
                this.field4037 = arg0.method260((byte) -67);
            }
        } else {
            this.field4036 = arg0.method265(-87);
        }
        ++field4050;
        if (arg2 != 102) {
            this.field4043 = 59;
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(B)V")
    public static final void method1714(byte arg0) {
        if (arg0 != -5) {
            method1714((byte) -85);
        }
        class234.field3689.method1172((byte) 123);
        class46.field769.method1172((byte) 109);
        ++field4047;
    }
}
