import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class273 extends class498 {

    @OriginalMember(owner = "client!br", name = "r", descriptor = "[Lrn;")
    public class179[] field4039;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "[B")
    public byte[] field4046;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "[I")
    private int[] field4035;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "[B")
    public byte[] field4042;

    @OriginalMember(owner = "client!br", name = "v", descriptor = "[S")
    public short[] field4043;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "[Lcj;")
    public class499[] field4050;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "[B")
    public byte[] field4045;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "Lfc;")
    public static class174 field4036 = new class174(10);

    @OriginalMember(owner = "client!br", name = "E", descriptor = "I")
    public static int field4052 = 0;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!br", name = "A", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "Lvl;")
    public static class11 field4051;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "Lo;")
    public static class24 field4047;

    @OriginalMember(owner = "client!br", name = "B", descriptor = "[Lo;")
    public static class24[] field4049;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)[Lrv;", line = 3)
    public static final class73[] method1719(int arg0) {
        int var1 = -127 / ((7 - arg0) / 63);
        field4041++;
        return new class73[] { class482.field6709, class267.field3902, class426.field5984 };
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V", line = 13)
    public final void method1720(boolean arg0) {
        this.field4035 = null;
        field4038++;
        if (arg0) {
            this.field4039 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "e", descriptor = "(I)V", line = 25)
    public static void method1721(int arg0) {
        field4051 = null;
        field4036 = null;
        field4049 = null;
        field4047 = null;
        int var1 = -22 / ((-arg0 - 25) / 48);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ldn;Z[I[B)Z", line = 50)
    public final boolean method1722(class364 arg0, boolean arg1, int[] arg2, byte[] arg3) {
        field4040++;
        if (arg1) {
            field4049 = null;
        }
        boolean var5 = true;
        int var6 = 0;
        class499 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field4035[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method2147(var9 >> 2, arg2, -2);
                        } else {
                            var7 = arg0.method2155(arg2, !arg1, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4050[var8] = var7;
                        this.field4035[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!br", name = "f", descriptor = "(I)V", line = 111)
    public static final void method1723(int arg0) {
        field4044++;
        if (class500.field7085 != class293.field4292 && arg0 == 1) {
            try {
                class297.method1826("tbrefresh", -14648, class534.field7831);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 138)
    public class273() {
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "([B)V", line = 140)
    public class273(byte[] arg0) {
        this.field4039 = new class179[128];
        this.field4046 = new byte[128];
        this.field4035 = new int[128];
        this.field4042 = new byte[128];
        this.field4043 = new short[128];
        this.field4050 = new class499[128];
        this.field4045 = new byte[128];
        class403 var2 = new class403(arg0);
        int var3;
        for (var3 = 0; var2.field5663[var2.field5665 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2359(-90);
        }
        var3++;
        var2.field5665++;
        int var6 = var2.field5665;
        var2.field5665 += var3;
        int var7;
        for (var7 = 0; var2.field5663[var2.field5665 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2359(-101);
        }
        var2.field5665++;
        var7++;
        int var10 = var2.field5665;
        var2.field5665 += var7;
        int var11;
        for (var11 = 0; var2.field5663[var2.field5665 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2359(118);
        }
        var11++;
        var2.field5665++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2357((byte) 107);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class179[] var19 = new class179[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class179 var103 = var19[var20] = new class179();
            int var104 = var2.method2357((byte) 110);
            if (var104 > 0) {
                var103.field2565 = new byte[var104 * 2];
            }
            int var105 = var2.method2357((byte) 127);
            if (var105 > 0) {
                var103.field2571 = new byte[var105 * 2 + 2];
                var103.field2571[1] = 64;
            }
        }
        int var21 = var2.method2357((byte) 108);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method2357((byte) 120);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field5663[var2.field5665 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2359(-80);
        }
        var25++;
        var2.field5665++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2357((byte) 110);
            this.field4043[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2357((byte) 104);
            this.field4043[var31] = (short) (this.field4043[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method2320((byte) -48);
            }
            this.field4043[var35] = (short) (this.field4043[var35] + (class239.method1507(var34 - 1, 2) << 14));
            var32--;
            this.field4035[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4035[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field5663[var6++] - 1;
                }
                var36--;
                this.field4045[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4035[var43] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var41) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                    var42 = var2.field5663[var10++] + 16 << 2;
                }
                var40--;
                this.field4042[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class179 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4035[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field4039[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 < var26.length) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field4035[var51] > 0) {
                    var50 = var2.method2357((byte) 107) + 1;
                }
            }
            this.field4046[var51] = (byte) var50;
            var48--;
        }
        this.field4037 = var2.method2357((byte) 109) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class179 var100 = var19[var52];
            if (var100.field2565 != null) {
                for (int var101 = 1; var101 < var100.field2565.length; var101 += 2) {
                    var100.field2565[var101] = var2.method2359(-95);
                }
            }
            if (var100.field2571 != null) {
                for (int var102 = 3; var102 < var100.field2571.length - 2; var102 += 2) {
                    var100.field2571[var102] = var2.method2359(-120);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2359(-115);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2359(-121);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class179 var97 = var19[var55];
            if (var97.field2571 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2571.length; var99 += 2) {
                    var98 += var2.method2357((byte) 119) + 1;
                    var97.field2571[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class179 var94 = var19[var56];
            if (var94.field2565 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2565.length; var96 += 2) {
                    var95 += var2.method2357((byte) 119) + 1;
                    var94.field2565[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2357((byte) 125);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 += var2.method2357((byte) 115) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4046[var61] = (byte) (this.field4046[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class169.method1061(var65 - var59, var67, -18995);
                    this.field4046[var68] = (byte) (this.field4046[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var62 += 2;
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field4046[var63] = (byte) (this.field4046[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method2357((byte) 108);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method2357((byte) 110) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4042[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4042[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class169.method1061(var79 - var72, var81, -18995);
                    int var84 = (this.field4042[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4042[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field4042[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4042[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field2573 = var2.method2357((byte) 127);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class179 var93 = var19[var87];
            if (var93.field2565 != null) {
                var93.field2568 = var2.method2357((byte) 117);
            }
            if (var93.field2571 != null) {
                var93.field2564 = var2.method2357((byte) 119);
            }
            if (var93.field2573 > 0) {
                var93.field2561 = var2.method2357((byte) 118);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field2570 = var2.method2357((byte) 117);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class179 var92 = var19[var89];
            if (var92.field2570 > 0) {
                var92.field2566 = var2.method2357((byte) 122);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class179 var91 = var19[var90];
            if (var91.field2566 > 0) {
                var91.field2567 = var2.method2357((byte) 105);
            }
        }
    }
}
