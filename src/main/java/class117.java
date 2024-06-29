import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class117 extends class512 {

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    private int field2075 = 0;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    private int field2082 = 4096;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    private int field2079 = 2000;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    private int field2084 = 16;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    private int field2077 = 0;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "Lnk;")
    public static class326 field2080 = new class326(35, 7);

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    public static int field2086 = 1406;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "Lvv;")
    public static class313 field2085 = new class313(68, 19);

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "[I")
    public static int[] field2090 = new int[120];

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field2089;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; ++var1) {
            int var2 = var1 - -1;
            int var3 = (int) (300.0D * Math.pow(2.0D, (double) var2 / 7.0D) + (double) var2);
            var0 += var3;
            field2090[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V", line = 6)
    public static void method935(int arg0) {
        field2090 = null;
        field2085 = null;
        field2080 = null;
        int var1 = -88 % ((arg0 - -23) / 59);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)[I", line = 20)
    public final int[] method75(int arg0, byte arg1) {
        ++field2083;
        int[] var3 = super.field7494.method232(arg0, true);
        int var4 = -4 / ((arg1 - 43) / 48);
        if (super.field7494.field474) {
            int var5 = this.field2082 >> 1;
            int[][] var6 = super.field7494.method233(-7777);
            Random var7 = new Random((long) this.field2077);
            for (int var8 = 0; ~var8 > ~this.field2079; ++var8) {
                int var9 = this.field2082 > 0 ? this.field2075 - -class235.method1620(var7, this.field2082, false) + -var5 : this.field2075;
                int var10 = var9 >> 4 & 255;
                int var11 = class235.method1620(var7, class402.field6113, false);
                int var12 = class235.method1620(var7, class227.field3953, false);
                int var13 = (class162.field2583[var10] * this.field2084 >> 12) + var11;
                int var14 = (class309.field4912[var10] * this.field2084 >> 12) + var12;
                int var15 = -var12 + var14;
                int var16 = -var11 + var13;
                if (~var16 != -1 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    boolean var17 = var16 < var15;
                    if (var17) {
                        int var18 = var11;
                        int var19 = var13;
                        var11 = var12;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                    }
                    if (var11 > var13) {
                        int var20 = var11;
                        var11 = var13;
                        int var21 = var12;
                        var13 = var20;
                        var12 = var14;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = -var11 + var13;
                    int var24 = -var12 + var14;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = 1024 - (class235.method1620(var7, 4096, false) >> 2);
                    int var28 = var12 < var14 ? 1 : -1;
                    if (~var24 > -1) {
                        var24 = -var24;
                    }
                    for (int var29 = var11; ~var13 < ~var29; ++var29) {
                        int var30 = (-var11 + var29) * var26 + var27 - -1024;
                        int var31 = class269.field4478 & var29;
                        int var32 = var22 & class270.field4492;
                        if (var17) {
                            var6[var32][var31] = var30;
                        } else {
                            var6[var31][var32] = var30;
                        }
                        var25 += var24;
                        if (var25 > 0) {
                            var22 += var28;
                            var25 += -var23;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZILia;)V", line = 153)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field2088;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field2082 = arg2.method132(115);
                        }
                    } else {
                        this.field2075 = arg2.method132(115);
                    }
                } else {
                    this.field2084 = arg2.method126((byte) -87);
                }
            } else {
                this.field2079 = arg2.method132(122);
            }
        } else {
            this.field2077 = arg2.method126((byte) -114);
        }
        if (!arg0) {
            field2085 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 219)
    public class117() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)V", line = 222)
    public static final void method936(int arg0, int arg1) {
        class471.field6974 = arg0;
        ++field2072;
        class303.field4852.method1604(4);
        if (arg1 != 3) {
            method935(75);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILal;FFFIZIIFF)[B", line = 240)
    public static final byte[] method937(int arg0, class127 arg1, float arg2, float arg3, float arg4, int arg5, boolean arg6, int arg7, int arg8, float arg9, float arg10) {
        ++field2074;
        if (!arg6) {
            method938(59, 43, -73);
        }
        byte[] var11 = new byte[arg5 * arg8 * arg0];
        class79.method582(arg0, arg10, arg3, 0, var11, -1, arg4, arg2, arg9, arg5, arg7, arg8, arg1);
        return var11;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)I", line = 255)
    public static final int method938(int arg0, int arg1, int arg2) {
        ++field2076;
        int var3 = -128 + class238.method1632(-1, arg2 + 91923, 4, arg1 + 45365) - (-(class238.method1632(-1, arg2 + 37821, 2, arg1 + 10294) - 128 >> 1) - (class238.method1632(arg0 + 10, arg2, 1, arg1) + -128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (~var4 <= arg0) {
            if (~var4 < -61) {
                var4 = 60;
            }
        } else {
            var4 = 10;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lec;ZII)V", line = 293)
    public static final void method939(class68 arg0, boolean arg1, int arg2, int arg3) {
        if (arg0.field1154 != 0) {
            if (arg0.field1154 == 1) {
                arg0.field1118 = (-arg0.field1009 + arg2) / 2 + arg0.field1015;
            } else if (arg0.field1154 == 2) {
                arg0.field1118 = -arg0.field1009 + arg2 + -arg0.field1015;
            } else if (arg0.field1154 != 3) {
                if (~arg0.field1154 == -5) {
                    arg0.field1118 = (-arg0.field1009 + arg2) / 2 - -(arg0.field1015 * arg2 >> 14);
                } else {
                    arg0.field1118 = -arg0.field1009 + arg2 + -(arg0.field1015 * arg2 >> 14);
                }
            } else {
                arg0.field1118 = arg0.field1015 * arg2 >> 14;
            }
        } else {
            arg0.field1118 = arg0.field1015;
        }
        ++field2073;
        if (~arg0.field1110 == -1) {
            arg0.field1127 = arg0.field1050;
        } else if (arg0.field1110 != 1) {
            if (~arg0.field1110 != -3) {
                if (~arg0.field1110 != -4) {
                    if (~arg0.field1110 != -5) {
                        arg0.field1127 = arg3 - arg0.field1081 + -(arg0.field1050 * arg3 >> 14);
                    } else {
                        arg0.field1127 = (arg0.field1050 * arg3 >> 14) + (-arg0.field1081 + arg3) / 2;
                    }
                } else {
                    arg0.field1127 = arg0.field1050 * arg3 >> 14;
                }
            } else {
                arg0.field1127 = -arg0.field1081 + arg3 + -arg0.field1050;
            }
        } else {
            arg0.field1127 = (-arg0.field1081 + arg3) / 2 - -arg0.field1050;
        }
        if (class494.field7214 && (~client.method475(arg0).field4938 != -1 || arg0.field1086 == 0)) {
            if (~arg0.field1118 > -1) {
                arg0.field1118 = 0;
            } else if (~arg2 > ~(arg0.field1118 + arg0.field1009)) {
                arg0.field1118 = -arg0.field1009 + arg2;
            }
            if (~arg0.field1127 <= -1) {
                if (~(arg0.field1127 + arg0.field1081) < ~arg3) {
                    arg0.field1127 = -arg0.field1081 + arg3;
                }
            } else {
                arg0.field1127 = 0;
            }
        }
        if (arg1) {
            field2080 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 369)
    public final void method74(int arg0) {
        if (arg0 != 12388) {
            this.method75(-70, (byte) 87);
        }
        class187.method1265(arg0 + -12132);
        ++field2087;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(II)V", line = 384)
    public static final void method940(int arg0, int arg1) {
        class216.field3755 = arg0;
        ++field2078;
        class231 var2 = class241.field4158;
        synchronized (class241.field4158) {
            if (arg1 != 13132) {
                method939((class68) null, false, 21, 45);
            }
            class241.field4158.method1604(4);
        }
        class231 var3 = class322.field5060;
        synchronized (class322.field5060) {
            class322.field5060.method1604(4);
        }
    }
}
