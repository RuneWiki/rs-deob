import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class493 extends class80 {

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    private int field7220 = -1;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "Z")
    public static boolean field7230 = false;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "Lbj;")
    public static class162 field7218 = new class162(8, 2);

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "[S")
    public static short[] field7232 = new short[] { 23, 8, 21, 44, 12, 46, 50, 2 };

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field7222;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    private int field7226;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    private int field7227;

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field7228;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "[I")
    private int[] field7225;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public final void method708(int arg0, int arg1, int arg2) {
        ++field7222;
        if (arg0 >= -11) {
            method2974((class427) null, -101, -60, 94, -96, 114);
        }
        super.method708(-118, arg1, arg2);
        if (this.field7220 >= 0 && class510.field7431 != null) {
            int var4 = class510.field7431.method105(-127, this.field7220).field7145 ? 64 : 128;
            this.field7225 = class510.field7431.method106((byte) 119, false, var4, 1.0F, this.field7220, var4);
            this.field7226 = var4;
            this.field7227 = var4;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)I")
    public final int method707(int arg0) {
        ++field7221;
        if (arg0 != -1) {
            method2974((class427) null, -101, -12, -1, -87, 54);
        }
        return this.field7220;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
    public static void method2973(int arg0) {
        field7232 = null;
        field7218 = null;
        if (arg0 != 5171) {
            field7218 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class493() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lke;IIIII)V")
    public static final void method2974(class427 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6394 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; ++var6) {
            label56: for (int var7 = arg3; var7 <= arg5; ++var7) {
                long var8 = class383.field5598[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 65535L);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class188 var13 = class248.field3825[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field6394; ++var14) {
                            if (arg0.field6397[var14] == var13.field3015) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field6397[arg0.field6394++] = var13.field3015;
                        if (arg0.field6394 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field6394; var15 < 4; ++var15) {
            arg0.field6397[var15] = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLms;)I")
    public static final int method2975(boolean arg0, class535 arg1) {
        if (!arg0) {
            field7232 = null;
        }
        ++field7228;
        if (arg1.field7778 == 0) {
            return 0;
        } else {
            if (arg1.field7804 != -1) {
                class535 var2 = null;
                if (arg1.field7804 < 32768) {
                    class435 var3 = (class435) class209.field3337.method1622((long) arg1.field7804, -118);
                    if (var3 != null) {
                        var2 = var3.field6471;
                    }
                } else if (~arg1.field7804 <= -32769) {
                    var2 = class73.field1444[arg1.field7804 + -32768];
                }
                if (var2 != null) {
                    int var4 = -var2.field6073 + arg1.field6073;
                    int var5 = -var2.field6078 + arg1.field6078;
                    if (~var4 != -1 || var5 != 0) {
                        arg1.method3166(0, 16383 & (int) (2607.5945876176133D * Math.atan2((double) var4, (double) var5)));
                    }
                }
            }
            if (arg1 instanceof class366) {
                class366 var6 = (class366) arg1;
                if (~var6.field5342 != 0 && (var6.field7863 == 0 || var6.field7872 > 0)) {
                    var6.method3166(0, var6.field5342);
                    var6.field5342 = -1;
                }
            } else if (arg1 instanceof class163) {
                class163 var7 = (class163) arg1;
                if (~var7.field2604 != 0 && (~var7.field7863 == -1 || ~var7.field7872 < -1)) {
                    int var8 = var7.field6073 - (-class496.field7292 + -class496.field7292 + var7.field2604) * 64;
                    int var9 = var7.field6078 - (-class212.field3378 + -class212.field3378 + var7.field2615) * 64;
                    if (~var8 != -1 || ~var9 != -1) {
                        var7.method3166(0, 16383 & (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var9)));
                    }
                    var7.field2604 = -1;
                }
            }
            return arg1.method3155(10885);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)[[I")
    public final int[][] method29(int arg0, int arg1) {
        ++field7223;
        int[][] var3 = super.field1589.method859(arg1, -54);
        if (super.field1589.field1884) {
            int var4 = (~class278.field4199 != ~this.field7227 ? this.field7227 * arg1 / class278.field4199 : arg1) * this.field7226;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class137.field2308 != ~this.field7226) {
                for (int var8 = 0; ~var8 > ~class137.field2308; ++var8) {
                    int var9 = this.field7226 * var8 / class137.field2308;
                    int var10 = this.field7225[var4 - -var9];
                    var7[var8] = class490.method2960(var10, 255) << 4;
                    var6[var8] = class490.method2960(65280, var10) >> 4;
                    var5[var8] = class490.method2960(4080, var10 >> 12);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class137.field2308; ++var11) {
                    int var12 = this.field7225[var4++];
                    var7[var11] = class490.method2960(var12, 255) << 4;
                    var6[var11] = class490.method2960(65280, var12) >> 4;
                    var5[var11] = class490.method2960(16711680, var12) >> 12;
                }
            }
        }
        return arg0 != 255 ? null : var3;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public final void method715(byte arg0) {
        super.method715(arg0);
        ++field7219;
        this.field7225 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;Lph;IZ)Ljb;")
    public static final class344 method2976(String arg0, class459 arg1, int arg2, boolean arg3) {
        ++field7224;
        int var4 = arg1.method2735(arg0, 106);
        if (var4 == -1) {
            return new class344(0);
        } else {
            int[] var5 = arg1.method2748(-24, var4);
            class344 var6 = new class344(var5.length);
            int var7 = arg2;
            int var8 = 0;
            while (true) {
                while (var6.field5143 > var7) {
                    class289 var9 = new class289(arg1.method2757(var4, var5[var8++], (byte) -124));
                    int var10 = var9.method1815((byte) -125);
                    int var11 = var9.method1841((byte) -122);
                    int var12 = var9.method1858(-3256);
                    if (!arg3 && ~var12 == -2) {
                        --var6.field5143;
                    } else {
                        var6.field5149[var7] = var10;
                        var6.field5148[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field7229;
        if (arg0 == 0) {
            this.field7220 = arg2.method1841((byte) 50);
        }
        int var4 = 64 % ((arg1 - 28) / 53);
    }
}
