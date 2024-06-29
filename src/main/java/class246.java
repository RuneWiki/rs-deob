import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class246 extends class349 {

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "[I")
    public static int[] field3461 = new int[14];

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "S")
    public static short field3465 = 320;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Z")
    public static boolean field3464 = false;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field3463 = 50;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field3462;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public int field3466;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Ljava/lang/String;")
    public String field3468;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1603(int arg0, int arg1, int arg2) {
        field3471++;
        class440 var3 = class186.method1241(arg1, arg2, (byte) 56);
        var3.method2756(-1369656528);
        var3.field6375 = arg0;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 16)
    public static void method1604(int arg0) {
        field3461 = null;
        if (arg0 != -3306) {
            method1610(true, -18, true, (class298) null, (int[][]) null);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 32)
    public static final void method1605(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3473++;
        if (class422.field6127 != null) {
            return;
        }
        class422.field6127 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFC80) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x39A) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class422.field6127[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 146)
    public static final void method1606(byte arg0) {
        class51 var1 = class431.field6263;
        synchronized (class431.field6263) {
            class431.field6263.method372(120);
        }
        field3457++;
        class51 var2 = class370.field5462;
        synchronized (class370.field5462) {
            if (arg0 == -114) {
                class370.field5462.method372(127);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BZZ)V", line = 167)
    public static final void method1607(byte arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            class192.field2676--;
            if (class192.field2676 == 0) {
                class72.field1019 = null;
            }
        }
        if (arg2) {
            class268.field3975--;
            if (class268.field3975 == 0) {
                class422.field6127 = null;
            }
        }
        if (arg0 != -44) {
            method1610(true, 30, false, (class298) null, (int[][]) null);
        }
        field3460++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z", line = 202)
    public static final boolean method1608(int arg0, int arg1) {
        field3472++;
        if (arg0 >= -16) {
            return false;
        } else if (arg1 == 29 || arg1 == 40 || arg1 == 38 || arg1 == 44 || arg1 == 1003) {
            return true;
        } else {
            return arg1 == 32 || arg1 == 28 || arg1 == 1011;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V", line = 225)
    public static final void method1609(boolean arg0) {
        class51 var1 = class219.field3053;
        synchronized (class219.field3053) {
            class219.field3053.method372(119);
        }
        field3469++;
        class51 var2 = class269.field3986;
        synchronized (class269.field3986) {
            class269.field3986.method372(117);
            if (!arg0) {
                method1611(-18, true, -75, 22, -4);
            }
        }
        class51 var3 = class322.field4795;
        synchronized (class322.field4795) {
            class322.field4795.method372(126);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIZLtj;[[I)V", line = 244)
    public static final void method1610(boolean arg0, int arg1, boolean arg2, class298 arg3, int[][] arg4) {
        field3470++;
        if (arg0) {
            field3464 = false;
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            int[][] var6;
            if (arg4 == null) {
                var6 = null;
            } else {
                var6 = new int[class351.field5217 + 1][class143.field1815 + 1];
                for (int var7 = 0; var7 <= class143.field1815; var7++) {
                    for (int var11 = 0; var11 <= class351.field5217; var11++) {
                        var6[var11][var7] = class164.field2231[var5][var11][var7] - arg4[var11][var7];
                    }
                }
            }
            int var8 = 0;
            int var9 = 0;
            if (!arg2) {
                if (class273.field4015) {
                    var8 |= 0x2;
                }
                if (class452.field6560) {
                    var9 |= 0x8;
                }
                if (class330.field4863 != 0) {
                    if (var5 == 0 || class393.field5727 >= 96) {
                        var9 |= 0x10;
                    }
                    var8 |= 0x1;
                }
            }
            if (class273.field4015) {
                var9 |= 0x7;
            }
            class193 var10 = arg3.method448(class351.field5217, class143.field1815, class164.field2231[var5], var6, 128, var8, var9);
            class435.method2717(var5, var10);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZIII)V", line = 328)
    public static final void method1611(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3458++;
        if (arg0 != -43) {
            method1603(16, -70, -55);
        }
        class252.field3692 = 0L;
        int var5 = class340.method2203((byte) 58);
        if (arg2 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class126.field1647.method517()) {
            arg1 = true;
        }
        class435.method2719(var5, arg1, 0, arg2, arg4, arg3);
    }
}
