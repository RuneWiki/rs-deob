import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class39 extends class666 {

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "B")
    public byte field487;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "Ldc;")
    public class63 field481;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "Ljava/lang/String;")
    public static String field488;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "[[Luv;")
    public static class755[][] field483;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIILkm;I)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3, class457 arg4, int arg5) {
        ++field484;
        if (arg4.field6327 != -1 || arg4.field6337 != null) {
            int var6 = 0;
            int var7 = arg4.field6325 * class332.field4707.field4797.method1140(0) >> 8;
            if (arg3 > arg4.field6352) {
                var6 += -arg4.field6352 + arg3;
            } else if (~arg4.field6344 < ~arg3) {
                var6 += -arg3 + arg4.field6344;
            }
            if (~arg5 >= ~arg4.field6331) {
                if (arg4.field6338 > arg5) {
                    var6 += -arg5 + arg4.field6338;
                }
            } else {
                var6 += -arg4.field6331 + arg5;
            }
            if (arg4.field6335 != 0 && ~arg4.field6335 <= ~(var6 + -256) && class332.field4707.field4797.method1140(0) != 0 && arg4.field6342 == arg2) {
                var6 -= 256;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var8 = -arg4.field6357 + arg4.field6335;
                if (~var8 > -1) {
                    var8 = arg4.field6335;
                }
                int var9 = var7;
                int var10 = -arg4.field6357 + var6;
                if (var10 > 0 && var8 > 0) {
                    var9 = (-var10 + var8) * var7 / var8;
                }
                class388.field5601.method662((byte) 15);
                int var11 = 8192;
                int var12 = (arg4.field6352 + arg4.field6344) / 2 + -arg3;
                int var13 = (arg4.field6338 + arg4.field6331) / 2 - arg5;
                if (arg0 == -257) {
                    if (var12 != 0 || ~var13 != -1) {
                        int var14 = 16383 & -class230.field3118 + -((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D)) - 4096;
                        if (var14 > 8192) {
                            var14 = -var14 + 16384;
                        }
                        int var15;
                        if (~var6 < -1) {
                            if (var6 < 4096) {
                                var15 = var6 * 8192 / 4096 + 8192;
                            } else {
                                var15 = 16384;
                            }
                        } else {
                            var15 = 8192;
                        }
                        var11 = (-var15 + 16384 >> 1) + var14 * var15 / 8192;
                    }
                    if (arg4.field6340 == null) {
                        if (arg4.field6327 >= 0) {
                            int var16 = arg4.field6332 == 256 && arg4.field6339 == 256 ? 256 : class35.method188((byte) 59, arg4.field6339, arg4.field6332);
                            if (!arg4.field6355) {
                                class448 var17 = class448.method2730(class648.field8694, arg4.field6327, 0);
                                if (var17 != null) {
                                    class695 var18 = var17.method2731().method3927(class746.field10250);
                                    class760 var19 = class760.method4212(var18, var16, var9 << 6, var11);
                                    var19.method4242(-1);
                                    class483.field6739.method359(var19);
                                    arg4.field6340 = var19;
                                }
                            } else {
                                if (arg4.field6326 == null) {
                                    arg4.field6326 = class187.method1167(class425.field5962, arg4.field6327);
                                }
                                if (arg4.field6326 != null) {
                                    if (arg4.field6356 == null) {
                                        arg4.field6356 = arg4.field6326.method1177(new int[] { 22050 });
                                    }
                                    if (arg4.field6356 != null) {
                                        class760 var20 = class760.method4212(arg4.field6356, var16, var9 << 6, var11);
                                        var20.method4242(-1);
                                        class483.field6739.method359(var20);
                                        arg4.field6340 = var20;
                                    }
                                }
                            }
                        }
                    } else {
                        arg4.field6340.method4210(var9);
                        arg4.field6340.method4214(var11);
                    }
                    if (arg4.field6350 == null) {
                        if (arg4.field6337 != null && ~(arg4.field6351 -= arg1) >= -1) {
                            int var21 = ~arg4.field6332 == -257 && arg4.field6339 == 256 ? 256 : arg4.field6339 + (int) ((double) (-arg4.field6339 + arg4.field6332) * Math.random());
                            if (arg4.field6336) {
                                if (arg4.field6347 == null) {
                                    int var22 = (int) ((double) arg4.field6337.length * Math.random());
                                    arg4.field6347 = class187.method1167(class425.field5962, arg4.field6337[var22]);
                                }
                                if (arg4.field6347 != null) {
                                    if (arg4.field6353 == null) {
                                        arg4.field6353 = arg4.field6347.method1177(new int[] { 22050 });
                                    }
                                    if (arg4.field6353 != null) {
                                        class760 var23 = class760.method4212(arg4.field6353, var21, var9 << 6, var11);
                                        var23.method4242(0);
                                        class483.field6739.method359(var23);
                                        arg4.field6351 = (int) ((double) (-arg4.field6346 + arg4.field6341) * Math.random()) + arg4.field6346;
                                        arg4.field6350 = var23;
                                        return;
                                    }
                                }
                                return;
                            }
                            int var24 = (int) (Math.random() * (double) arg4.field6337.length);
                            class448 var25 = class448.method2730(class648.field8694, arg4.field6337[var24], 0);
                            if (var25 != null) {
                                class695 var26 = var25.method2731().method3927(class746.field10250);
                                class760 var27 = class760.method4212(var26, var21, var9 << 6, var11);
                                var27.method4242(0);
                                class483.field6739.method359(var27);
                                arg4.field6351 = arg4.field6346 + (int) ((double) (arg4.field6341 - arg4.field6346) * Math.random());
                                arg4.field6350 = var27;
                                return;
                            }
                        }
                    } else {
                        arg4.field6350.method4210(var9);
                        arg4.field6350.method4214(var11);
                        if (arg4.field6350.method550(false)) {
                            return;
                        }
                        arg4.field6353 = null;
                        arg4.field6350 = null;
                        arg4.field6347 = null;
                    }
                }
            } else {
                if (arg4.field6340 != null) {
                    class483.field6739.method361(arg4.field6340);
                    arg4.field6326 = null;
                    arg4.field6356 = null;
                    arg4.field6340 = null;
                }
                if (arg4.field6350 != null) {
                    class483.field6739.method361(arg4.field6350);
                    arg4.field6353 = null;
                    arg4.field6350 = null;
                    arg4.field6347 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
    public final int method212(int arg0) {
        ++field480;
        if (this.field481 == null) {
            return 0;
        } else {
            if (arg0 != 100) {
                this.field482 = -36;
            }
            return this.field481.field956 * 100 / (this.field481.field954.length + -this.field487);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILha;)V")
    public static final void method213(int arg0, class548 arg1) {
        if (arg0 == 1) {
            ++field490;
            if (class79.field1138.method3621(0) != 0) {
                if (~class332.field4707.field4789.method963(0) != -1) {
                    if (class645.field8656 == null) {
                        Canvas var2 = new Canvas();
                        var2.setSize(36, 32);
                        class645.field8656 = class577.method3365(0, var2, class137.field1945, class267.field3902, arg0 ^ 121, 0);
                        class477.field6640 = class645.field8656.method1392(class506.method3043(0, class261.field3774, 89, class307.field4312), class52.method381(class671.field9318, class261.field3774, 0), true);
                    }
                    for (class507 var3 = (class507) class79.field1138.method3618(94); var3 != null; var3 = (class507) class79.field1138.method3619(0)) {
                        class291.field4179.method1317(var3.field7043, var3.field7047, var3.field7049, class477.field6640, false, false, var3.field7040 ? class388.field5601.field1366 : null, 0, arg1, var3.field7041, class645.field8656, var3.field7046);
                        var3.method549(6410);
                    }
                } else {
                    for (class507 var4 = (class507) class79.field1138.method3618(arg0 + -45); var4 != null; var4 = (class507) class79.field1138.method3619(0)) {
                        class291.field4179.method1317(var4.field7043, var4.field7047, var4.field7049, class1.field14, false, false, var4.field7040 ? class388.field5601.field1366 : null, 0, arg1, var4.field7041, arg1, var4.field7046);
                        var4.method549(6410);
                    }
                    class235.method1566(arg0 + 16348);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)[B")
    public final byte[] method214(byte arg0) {
        if (arg0 >= -86) {
            return null;
        } else {
            ++field486;
            if (!super.field9191 && ~(this.field481.field954.length - this.field487) >= ~this.field481.field956) {
                return this.field481.field954;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)V")
    public static void method215(byte arg0) {
        field483 = null;
        field488 = null;
        if (arg0 != -1) {
            field483 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)V")
    public static final void method216(byte arg0) {
        class432.field6030.method3906(-94);
        if (arg0 != -100) {
            method216((byte) -112);
        }
        ++field489;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLab;ZZ)V")
    public static final void method217(byte arg0, class654 arg1, boolean arg2, boolean arg3) {
        ++field485;
        if (arg0 > 95) {
            int var4 = arg1.field8745;
            int var5 = (int) arg1.field1079;
            arg1.method549(6410);
            if (arg2) {
                class634.method3553((byte) -29, var4);
            }
            class733.method4081((byte) -41, var4);
            class755 var6 = class189.method1182(var5, (byte) -101);
            if (var6 != null) {
                class27.method159((byte) -105, var6);
            }
            class711.method3999(0);
            if (!arg3 && ~class544.field7545 != 0) {
                class667.method3767(class544.field7545, 1, 4626);
            }
            class176 var7 = new class176(class259.field3747);
            for (class654 var8 = (class654) var7.method1111(113); var8 != null; var8 = (class654) var7.method1113((byte) -19)) {
                if (!var8.method550(false)) {
                    var8 = (class654) var7.method1111(73);
                    if (var8 == null) {
                        return;
                    }
                }
                if (var8.field8746 == 3) {
                    int var9 = (int) var8.field1079;
                    if (~(var9 >>> 16) == ~var4) {
                        method217((byte) 100, var8, true, arg3);
                    }
                }
            }
        }
    }
}
