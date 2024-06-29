import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class135 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Z")
    public boolean field2068 = false;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    private int field2077 = 128;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    private int field2079 = 0;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    private int field2074 = 0;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Z")
    public boolean field2085 = false;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    private int field2089 = 0;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field2078 = -1;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    private int field2094 = 128;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Z")
    public static boolean field2088 = false;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "[Lba;")
    public static class218[] field2091 = new class218[6];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    private int field2072;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field2084;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Ltj;")
    public static class108 field2090;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[S")
    private short[] field2070;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "[S")
    private short[] field2083;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[S")
    private short[] field2087;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[S")
    private short[] field2092;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lfa;IBI)V")
    public static final void method1036(class128 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field4558 == arg3 && arg3 != -1) {
            class183 var4 = class110.method671(-21965, arg3);
            int var5 = var4.field2592;
            if (var5 == 1) {
                arg0.field4535 = arg1;
                arg0.field4575 = 1;
                arg0.field4564 = 0;
                arg0.field4547 = 0;
                arg0.field4566 = 0;
                class47.method311(arg0.field4463, arg0.field4466, arg0.field4566, true, class181.field2555 == arg0, var4);
            }
            if (var5 == 2) {
                arg0.field4564 = 0;
            }
        } else if (arg3 == -1 || arg0.field4558 == -1 || class110.method671(-21965, arg3).field2583 >= class110.method671(-21965, arg0.field4558).field2583) {
            arg0.field4564 = 0;
            arg0.field4589 = arg0.field4599;
            arg0.field4566 = 0;
            arg0.field4535 = arg1;
            arg0.field4547 = 0;
            arg0.field4575 = 1;
            arg0.field4558 = arg3;
            if (arg0.field4558 != -1) {
                class47.method311(arg0.field4463, arg0.field4466, arg0.field4566, true, class181.field2555 == arg0, class110.method671(-21965, arg0.field4558));
            }
        }
        field2069++;
        if (arg2 > -27) {
            method1044(false, -57, (String) null, (class335) null);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Llf;I)V")
    public final void method1037(class130 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method837(true);
            if (var3 == 0) {
                field2075++;
                if (arg1 != 0) {
                    this.field2077 = -99;
                    return;
                }
                return;
            }
            this.method1043(arg0, var3, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1038(int arg0) {
        field2090 = null;
        field2091 = null;
        if (arg0 != -20914) {
            method1039((class269) null, 37, 36, 99, (class305) null, 13, false, 43, 87, (class183) null, 83, (byte) 12, -22, 40, 26);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lvq;IIILni;IZIILb;IBIII)Lni;")
    public static final class305 method1039(class269 arg0, int arg1, int arg2, int arg3, class305 arg4, int arg5, boolean arg6, int arg7, int arg8, class183 arg9, int arg10, byte arg11, int arg12, int arg13, int arg14) {
        field2082++;
        if (arg4 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg9 != null) {
            int var16 = var15 | arg9.method1319(arg3, false, false, -1);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg7 << 48) + ((long) ((arg1 << 16) + arg2 + (arg5 << 24)) + ((long) arg12 << 32));
        class15 var19 = class44.field592;
        class305 var20;
        synchronized (class44.field592) {
            var20 = (class305) class44.field592.method99(true, var17);
        }
        if (var20 == null || arg0.method944(var20.method247(), var15) != 0) {
            if (var20 != null) {
                var15 = arg0.method863(var15, var20.method247());
            }
            byte var21;
            if (arg2 == 1) {
                var21 = 9;
            } else if (arg2 == 2) {
                var21 = 12;
            } else if (arg2 == 3) {
                var21 = 15;
            } else if (arg2 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class406 var24 = new class406(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method2554(0, arg11 ^ 0xFFFFFFE5, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class447.field6381[var31] * var28 >> 15;
                    int var33 = class447.field6390[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2554(var32, -87, var33, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg1 * var36 + arg5 * var35 >> 8);
                short var38 = (short) (((arg7 & 0xFC00) * var35 + (arg12 & 0xFC00) * var36 & 0xFC0000) + ((arg7 & 0x7F) * var35 + (arg12 & 0x7F) * var36 & 0x7F00) + ((arg7 & 0x380) * var35 + (arg12 & 0x380) * var36 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2551((byte) 66, var37, (short) -1, var25, (byte) -1, (byte) 1, var26[0][(var39 + 1) % var21], var38, var26[0][var39]);
                    } else {
                        var24.method2551((byte) 66, var37, (short) -1, var26[var34 - 1][var39], (byte) -1, (byte) 1, var26[var34 - 1][(var39 + 1) % var21], var38, var26[var34][(var39 + 1) % var21]);
                        var24.method2551((byte) 66, var37, (short) -1, var26[var34 - 1][var39], (byte) -1, (byte) 1, var26[var34][(var39 + 1) % var21], var38, var26[var34][var39]);
                    }
                }
            }
            var20 = arg0.method905(var24, var15, class216.field3116, 64, 768);
            class15 var40 = class44.field592;
            synchronized (class44.field592) {
                class44.field592.method90(var20, var17, 0);
            }
        }
        int var41 = arg2 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        if (arg11 != 78) {
            field2091 = null;
        }
        int var45 = var41;
        if (arg6) {
            if (arg8 > 9216 && arg8 < 15360) {
                var44 = var41 + 128;
            }
            if (arg8 > 1024 && arg8 < 7168) {
                var42 -= 128;
            }
            if (arg8 > 13312 || arg8 < 3072) {
                var43 -= 128;
            }
            if (arg8 > 5120 && arg8 < 11264) {
                var45 = var41 + 128;
            }
        }
        int var46 = arg4.method252();
        int var47 = arg4.method202();
        int var48 = arg4.method199();
        int var49 = arg4.method235();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class385 var50 = null;
        if (arg9 != null) {
            int var51 = arg9.field2609[arg3];
            var50 = class226.method1583((byte) 13, var51 >> 16);
            arg3 = var51 & 0xFFFF;
        }
        class305 var52;
        if (var50 == null) {
            var52 = var20.method200((byte) 3, var15, true);
            var52.method215((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method201((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method200((byte) 3, var15, true);
            var52.method215((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method201((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method2061(var50, arg11 ^ 0x39, arg3);
        }
        if (arg14 != 0) {
            var52.method207(arg14);
        }
        if (arg10 != 0) {
            var52.method197(arg10);
        }
        if (arg13 != 0) {
            var52.method201(0, arg13, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ltj;BI)Lbb;")
    public static final class182 method1040(class108 arg0, byte arg1, int arg2) {
        if (arg1 <= 94) {
            method1038(15);
        }
        field2073++;
        byte[] var3 = arg0.method645((byte) 80, arg2);
        return var3 == null ? null : new class182(var3);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILvq;III)Lni;")
    public final class305 method1041(int arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5) {
        field2071++;
        if (arg3 > -37) {
            method1042(-35, 69, -30, 121, 78);
        }
        int var7 = arg0;
        class183 var8 = this.field2078 == -1 || arg1 == -1 ? null : class110.method671(-21965, this.field2078);
        if (var8 != null) {
            var7 = arg0 | var8.method1319(arg1, false, false, arg5);
        }
        if (this.field2094 != 128) {
            var7 |= 0x2;
        }
        if (this.field2077 != 128 || this.field2074 != 0) {
            var7 |= 0x5;
        }
        class15 var9 = class245.field3656;
        class305 var10;
        synchronized (class245.field3656) {
            var10 = (class305) class245.field3656.method99(true, (long) (this.field2084 |= arg2.field3936 << 29));
        }
        if (var10 == null || arg2.method944(var10.method247(), var7) != 0) {
            if (var10 != null) {
                var7 = arg2.method863(var7, var10.method247());
            }
            int var11 = var7;
            if (this.field2083 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field2070 != null) {
                var11 |= 0x4000;
            }
            class406 var12 = class294.method1986(0, -90, this.field2072, class435.field6210);
            if (var12 == null) {
                return null;
            }
            var10 = arg2.method905(var12, var11, class254.field3762, this.field2089 + 64, this.field2079 + 850);
            if (this.field2083 != null) {
                for (int var13 = 0; var13 < this.field2083.length; var13++) {
                    var10.method196(this.field2083[var13], this.field2087[var13]);
                }
            }
            if (this.field2070 != null) {
                for (int var14 = 0; var14 < this.field2070.length; var14++) {
                    var10.method222(this.field2070[var14], this.field2092[var14]);
                }
            }
            var10.method233(var7);
            class15 var15 = class245.field3656;
            synchronized (class245.field3656) {
                class245.field3656.method90(var10, (long) (this.field2084 |= arg2.field3936 << 29), 0);
            }
        }
        class305 var16 = var8 == null ? var10.method200((byte) 2, var7, true) : var8.method1315(var10, arg4, (byte) 112, 0, var7, (byte) 2, arg1, arg5);
        if (this.field2077 != 128 || this.field2094 != 128) {
            var16.method215(this.field2077, this.field2094, this.field2077);
        }
        if (this.field2074 != 0) {
            if (this.field2074 == 90) {
                var16.method198(4096);
            }
            if (this.field2074 == 180) {
                var16.method198(8192);
            }
            if (this.field2074 == 270) {
                var16.method198(12288);
            }
        }
        var16.method233(arg0);
        return var16;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
    public static final void method1042(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2080++;
        if (arg0 != 128) {
            field2091 = null;
        }
        class276 var5 = class264.method1816((byte) -115, arg4, 8);
        var5.method1876((byte) -128);
        var5.field3986 = arg1;
        var5.field3984 = arg2;
        var5.field3985 = arg3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Llf;IB)V")
    private final void method1043(class130 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field2072 = arg0.method798(false);
        } else if (arg1 == 2) {
            this.field2078 = arg0.method798(false);
        } else if (arg1 == 4) {
            this.field2077 = arg0.method798(false);
        } else if (arg1 == 5) {
            this.field2094 = arg0.method798(false);
        } else if (arg1 == 6) {
            this.field2074 = arg0.method798(false);
        } else if (arg1 == 7) {
            this.field2089 = arg0.method837(true);
        } else if (arg1 == 8) {
            this.field2079 = arg0.method837(true);
        } else if (arg1 == 9) {
            this.field2085 = true;
        } else if (arg1 == 10) {
            this.field2068 = true;
        } else if (arg1 == 40) {
            int var4 = arg0.method837(true);
            this.field2083 = new short[var4];
            this.field2087 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2083[var5] = (short) arg0.method798(false);
                this.field2087[var5] = (short) arg0.method798(false);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method837(true);
            this.field2070 = new short[var6];
            this.field2092 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2070[var7] = (short) arg0.method798(false);
                this.field2092[var7] = (short) arg0.method798(false);
            }
        }
        if (arg2 <= 90) {
            this.method1041(-44, -28, (class269) null, -3, -77, -14);
        }
        field2086++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZILjava/lang/String;Lug;)V")
    public static final void method1044(boolean arg0, int arg1, String arg2, class335 arg3) {
        field2081++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        if (arg1 != 30585) {
            method1042(-95, -98, -13, -42, -110);
        }
        int var7 = class317.field4651.method1308(0, arg2, (class256[]) null, 250);
        int var8 = class317.field4651.method1299((byte) 49, 250, (class256[]) null, arg2) * 13;
        class59.field786.method1012(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -16777216, 0);
        class59.field786.method983(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg3.method2204(0, 1, -1, arg2, 1, var5, var8, 16777215, (class226) null, var6, -1, 0, (int[]) null, 0, var7, (class256[]) null);
        class198.method1404(var4 + var8 + var4, -var4 + var6, var5 - var4, var4 + var7 + var4, false);
        if (arg0) {
            class59.field786.method882();
        }
    }
}
