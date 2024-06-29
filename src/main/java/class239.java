import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class239 extends class145 {

    @OriginalMember(owner = "client!qj", name = "K", descriptor = "I")
    private int field3306 = 2048;

    @OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
    private int field3304 = 4096;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    private int field3302 = 0;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    private int field3314 = 12288;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    private int field3310 = 2048;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
    private int field3303 = 0;

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "I")
    private int field3317 = 8192;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "I")
    public static int field3316 = -1;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "F")
    public static float field3301;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!qj", name = "Q", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!qj", name = "W", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!qj", name = "X", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 8)
    public class239() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I", line = 11)
    public final int[] method3(int arg0, int arg1) {
        ++field3315;
        int[] var3 = super.field2218.method1614(50, arg0);
        if (super.field2218.field3396) {
            int var4 = class134.field1902[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class156.field2364; ++var5) {
                int var6 = class229.field3181[var5] + -2048;
                int var7 = this.field3306 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = var4 - -this.field3302;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field3303 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 - -4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = var4 - -this.field3310;
                int var17 = ~var16 > 2047 ? var16 - -4096 : var16;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method1593(var9, true, var12) && !this.method1591(var15, (byte) -124, var18) ? 0 : 4096;
            }
        }
        int var19 = 74 % ((arg1 - 16) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)Z", line = 68)
    public static final boolean method1587(int arg0) {
        ++field3309;
        if (arg0 != -2613) {
            method1592(48, -11, -84, -82, 119, 17, -64, 5, (byte) 38);
        }
        return ~class445.field6400 != -1 || class447.field6482 >= 2;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(ZI)V", line = 85)
    public static final void method1588(boolean arg0, int arg1) {
        ++field3318;
        byte var2;
        byte[][] var3;
        if (!arg0) {
            var2 = 4;
            var3 = class329.field4474;
        } else {
            var3 = class263.field3536;
            var2 = 1;
        }
        int var4 = var3.length;
        if (arg1 >= 51) {
            for (int var5 = 0; var4 > var5; ++var5) {
                int[] var11 = null;
                byte[] var12 = var3[var5];
                int var13 = class101.field1500[var5] >> 8;
                int var14 = 255 & class101.field1500[var5];
                int var15 = var13 * 64 + -class283.field3794;
                int var16 = var14 * 64 - class296.field3988;
                if (var12 != null) {
                    class127.method996(126);
                    var11 = class263.method1691(var15, -12618, var2, class296.field3988, class249.field3415, var16, var12, arg0, class235.field3247, class283.field3794);
                }
                if (!arg0 && class38.field578 / 8 == var13 && class296.field3990 / 8 == var14) {
                    if (var11 != null) {
                        class322.field4369 = class244.method1603(var11[2], 3, var11[1], var11[0], var11[3]);
                        class127.field1789 = var11[4];
                    } else {
                        class322.field4369 = null;
                    }
                }
            }
            for (int var6 = 0; var4 > var6; ++var6) {
                int var7 = (class101.field1500[var6] >> 8) * 64 + -class283.field3794;
                int var8 = (class101.field1500[var6] & 255) * 64 + -class296.field3988;
                byte[] var9 = var3[var6];
                if (var9 == null && ~class296.field3990 > -801) {
                    class127.method996(125);
                    for (int var10 = 0; ~var10 > ~var2; ++var10) {
                        class416.method2578(var10, 64, 64, var7, -1, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "(I)V", line = 175)
    public static final void method1589(int arg0) {
        if (class105.field1540 != null) {
            class105.field1540.method2736(5000);
            class105.field1540 = null;
        }
        ++field3307;
        class269.method1728((byte) 40);
        class83.method750();
        for (int var1 = 0; var1 < 4; ++var1) {
            class235.field3247[var1].method1159(3340);
        }
        class153.method1178((byte) 103, false);
        System.gc();
        class356.method2246(2, 12614);
        int var2 = -105 % ((arg0 - -46) / 55);
        class96.field1386 = -1;
        class166.field2473 = false;
        class407.method2507(-1, true);
        class283.field3794 = 0;
        class179.field2627 = false;
        class296.field3988 = 0;
        class38.field578 = 0;
        class296.field3990 = 0;
        for (int var3 = 0; var3 < class16.field186.length; ++var3) {
            class16.field186[var3] = null;
        }
        class221.field3055 = 0;
        class174.field2579 = 0;
        for (int var4 = 0; ~var4 > -2049; ++var4) {
            class220.field3044[var4] = null;
            class267.field3604[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; ++var5) {
            class298.field4012[var5] = null;
        }
        class451.field6514.method607(0);
        class29.method335(10195);
        class69.field1040 = 0;
        class57.method539((byte) 72);
        class411.method2548(-20);
        class13.method63((byte) -66);
        class411.method2546(true, false);
        try {
            class117.method936("loggedout", true, class30.field502.field4117);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(CB)Z", line = 247)
    public static final boolean method1590(char arg0, byte arg1) {
        if (arg1 <= 91) {
            field3316 = 81;
        }
        ++field3305;
        return ~arg0 == -161 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)Z", line = 281)
    private final boolean method1591(int arg0, byte arg1, int arg2) {
        ++field3311;
        if (arg1 > -38) {
            this.field3302 = -78;
        }
        int var4 = (arg0 + arg2) * this.field3314 >> 12;
        int var5 = class381.field5351[(1045003 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field3314;
        int var7 = (var6 << 12) / this.field3317;
        int var8 = this.field3304 * var7 >> 12;
        return var8 > -arg0 + arg2 && ~(-arg0 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIIIB)V", line = 299)
    public static final void method1592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        int var9 = 111 / ((-62 - arg8) / 57);
        ++field3308;
        if (class15.method76(6, arg0)) {
            class147.method1136(arg2, arg7, arg4, 46, arg1, class291.field3949[arg0], arg6, arg3, arg5, -1);
        } else if (~arg4 != 0) {
            class135.field1930[arg4] = true;
        } else {
            for (int var10 = 0; ~var10 > -101; ++var10) {
                class135.field1930[var10] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZI)Z", line = 328)
    private final boolean method1593(int arg0, boolean arg1, int arg2) {
        ++field3319;
        if (!arg1) {
            return true;
        } else {
            int var4 = (-arg0 + arg2) * this.field3314 >> 12;
            int var5 = class381.field5351[(1047751 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field3314;
            int var7 = (var6 << 12) / this.field3317;
            int var8 = this.field3304 * var7 >> 12;
            return ~var8 < ~(arg0 - -arg2) && ~(arg0 + arg2) < ~(-var8);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lap;BI)V", line = 350)
    public final void method2(class289 arg0, byte arg1, int arg2) {
        ++field3313;
        int var4 = 57 / ((arg1 - 11) / 52);
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field3317 = arg0.method1853(-48);
                                }
                            } else {
                                this.field3304 = arg0.method1853(-62);
                            }
                        } else {
                            this.field3314 = arg0.method1853(-86);
                        }
                    } else {
                        this.field3310 = arg0.method1853(-128);
                    }
                } else {
                    this.field3303 = arg0.method1853(109);
                }
            } else {
                this.field3302 = arg0.method1853(-117);
            }
        } else {
            this.field3306 = arg0.method1853(115);
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V", line = 428)
    public final void method87(byte arg0) {
        class377.method2347(-106);
        ++field3312;
        if (arg0 != 77) {
            field3301 = 0.9033236F;
        }
    }
}
