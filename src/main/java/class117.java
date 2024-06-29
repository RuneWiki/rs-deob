import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class117 extends class175 {

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    private int field2169 = 4096;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field2170 = 128;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Lmb;")
    public static class96 field2174 = class243.method1708("Verbindung mit Update)2Server)3)3)3", (byte) 111);

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field2176 = 0;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "Lmb;")
    public static class96 field2175 = class243.method1708("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", (byte) 98);

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "[S")
    public static short[] field2179;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLhg;)V")
    public static final void method915(byte arg0, class260 arg1) {
        ++field2172;
        if (~arg1.field4539 != -1) {
            if (arg1.field4537 != -1 && ~arg1.field4537 > -32769) {
                class197 var2 = class86.field1450[arg1.field4537];
                if (var2 != null) {
                    int var3 = -var2.field4511 + arg1.field4511;
                    int var4 = -var2.field4533 + arg1.field4533;
                    if (~var3 != -1 || var4 != 0) {
                        arg1.field4531 = 2047 & (int) (325.949D * Math.atan2((double) var3, (double) var4));
                    }
                }
            }
            if (arg1.field4537 >= 32768) {
                int var5 = arg1.field4537 + -32768;
                if (~class229.field3934 == ~var5) {
                    var5 = 2047;
                }
                class47 var6 = class22.field371[var5];
                if (var6 != null) {
                    int var7 = -var6.field4511 + arg1.field4511;
                    int var8 = -var6.field4533 + arg1.field4533;
                    if (~var7 != -1 || var8 != 0) {
                        arg1.field4531 = (int) (325.949D * Math.atan2((double) var7, (double) var8)) & 2047;
                    }
                }
            }
            if ((arg1.field4520 != 0 || ~arg1.field4554 != -1) && (arg1.field4563 == 0 || arg1.field4549 > 0)) {
                int var9 = arg1.field4511 + 64 * (-1 + arg1.method366((byte) 95)) - (-class196.field3383 - class196.field3383 + arg1.field4520) * 64;
                int var10 = arg1.field4533 - -(arg1.method366((byte) 95) * 64) - ((-class225.field3832 + arg1.field4554 + -class225.field3832) * 64 + 64);
                if (var9 != 0 || ~var10 != -1) {
                    arg1.field4531 = 2047 & (int) (325.949D * Math.atan2((double) var9, (double) var10));
                }
                arg1.field4554 = 0;
                arg1.field4520 = 0;
            }
            if (arg0 < -64) {
                int var11 = -arg1.field4534 + arg1.field4531 & 2047;
                if (var11 == 0) {
                    arg1.field4524 = 0;
                } else {
                    ++arg1.field4524;
                    if (var11 > 1024) {
                        arg1.field4534 -= arg1.field4539;
                        boolean var12 = true;
                        if (var11 < arg1.field4539 || ~(2048 - arg1.field4539) > ~var11) {
                            var12 = false;
                            arg1.field4534 = arg1.field4531;
                        }
                        if (~arg1.field4573 == ~arg1.field4515 && (arg1.field4524 > 25 || var12)) {
                            if (~arg1.field4521 == 0) {
                                arg1.field4573 = arg1.field4540;
                            } else {
                                arg1.field4573 = arg1.field4521;
                            }
                        }
                    } else {
                        arg1.field4534 += arg1.field4539;
                        boolean var13 = true;
                        if (~var11 > ~arg1.field4539 || ~(2048 - arg1.field4539) > ~var11) {
                            arg1.field4534 = arg1.field4531;
                            var13 = false;
                        }
                        if (arg1.field4573 == arg1.field4515 && (arg1.field4524 > 25 || var13)) {
                            if (arg1.field4569 == -1) {
                                arg1.field4573 = arg1.field4540;
                            } else {
                                arg1.field4573 = arg1.field4569;
                            }
                        }
                    }
                    arg1.field4534 &= 2047;
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
    public static void method916(boolean arg0) {
        field2175 = null;
        field2179 = null;
        field2174 = null;
        if (arg0) {
            method916(false);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field2173;
        int var3 = -116 / ((62 - arg0) / 54);
        int[] var4 = super.field3044.method904((byte) -88, arg1);
        if (super.field3044.field2150) {
            int[] var5 = this.method1255(0, arg1 + -1 & class92.field1520, 128);
            int[] var6 = this.method1255(0, arg1, 128);
            int[] var7 = this.method1255(0, class92.field1520 & arg1 - -1, 128);
            for (int var8 = 0; ~class1.field11 < ~var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * this.field2169;
                int var10 = (var6[class194.field3343 & var8 + 1] + -var6[var8 - 1 & class194.field3343]) * this.field2169;
                int var11 = var9 >> 12;
                int var12 = var10 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = var11 * var11 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var14 + 4096 + var13) / 4096.0F)) * 4096.0D);
                int var16 = var15 != 0 ? 16777216 / var15 : 0;
                var4[var8] = -var16 + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        ++field2178;
        int var4 = 60 / ((arg0 - -22) / 58);
        if (~arg1 == -1) {
            this.field2169 = arg2.method1663((byte) -93);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class117() {
        super(1, true);
    }
}
