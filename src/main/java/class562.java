import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class562 {

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "[I")
    private int[] field8263 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lsw;")
    public static class641 field8256 = new class641(8);

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "S")
    public static short field8275;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "Lrg;")
    public static class548 field8274;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Llq;")
    public class471 field8259;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "Laaa;")
    public static class525 field8276;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "Z")
    public static boolean field8273;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "[I")
    private int[] field8267;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "[S")
    private short[] field8257;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "[S")
    private short[] field8258;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "[S")
    private short[] field8262;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "[S")
    private short[] field8272;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILos;)V")
    private final void method3277(int arg0, int arg1, class374 arg2) {
        if (arg1 == 1) {
            arg2.method2129(-72);
        } else if (arg1 == 2) {
            int var4 = arg2.method2129(-91);
            this.field8267 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8267[var5] = arg2.method2136(false);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg2.method2129(-74);
                this.field8257 = new short[var6];
                this.field8258 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field8258[var7] = (short) arg2.method2136(false);
                    this.field8257[var7] = (short) arg2.method2136(false);
                }
            } else if (arg1 == 41) {
                int var8 = arg2.method2129(-112);
                this.field8272 = new short[var8];
                this.field8262 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field8262[var9] = (short) arg2.method2136(false);
                    this.field8272[var9] = (short) arg2.method2136(false);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field8263[arg1 - 60] = arg2.method2136(false);
            }
        }
        field8265++;
        if (arg0 != 255) {
            this.method3280((byte) 74, null);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8260++;
        int var8 = arg5 - arg2;
        int var9 = arg2 + arg7;
        for (int var10 = arg7; var10 < var9; var10++) {
            class62.method363(arg0, -128, arg1, class328.field4287[var10], arg4);
        }
        int var11 = arg0 - arg2;
        int var12 = arg2 + arg4;
        for (int var13 = arg5; var13 > var8; var13--) {
            class62.method363(arg0, -127, arg1, class328.field4287[var13], arg4);
        }
        int var14 = var9;
        if (arg3 != 28471) {
            method3278(16, -53, 80, -44, 121, 16, -23, 39);
        }
        while (var14 <= var8) {
            int[] var15 = class328.field4287[var14];
            class62.method363(var12, -127, arg1, var15, arg4);
            class62.method363(var11, -128, arg6, var15, var12);
            class62.method363(arg0, -127, arg1, var15, var11);
            var14++;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public static final void method3279(byte arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class371.field4888[var1] = true;
        }
        if (arg0 <= -107) {
            field8264++;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLos;)V")
    public final void method3280(byte arg0, class374 arg1) {
        while (true) {
            int var3 = arg1.method2129(-75);
            if (var3 == 0) {
                field8255++;
                if (arg0 < 69) {
                    field8273 = true;
                    return;
                }
                return;
            }
            this.method3277(255, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Lei;")
    public final class152 method3281(int arg0) {
        field8268++;
        if (this.field8267 == null) {
            return null;
        }
        class152[] var2 = new class152[this.field8267.length];
        class438 var3 = this.field8259.field6598;
        synchronized (this.field8259.field6598) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field8267.length) {
                    break;
                }
                var2[var4] = class447.method2618(this.field8267[var4], this.field8259.field6598, 3317, 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field8267.length; var5++) {
            if (var2[var5].field1812 < 13) {
                var2[var5].method825(-2, 0);
            }
        }
        int var6 = 22 % ((arg0 + 20) / 47);
        class152 var7;
        if (var2.length == 1) {
            var7 = var2[0];
        } else {
            var7 = new class152(var2, var2.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field8258 != null) {
            for (int var8 = 0; var8 < this.field8258.length; var8++) {
                var7.method827(this.field8258[var8], (byte) -108, this.field8257[var8]);
            }
        }
        if (this.field8262 != null) {
            for (int var9 = 0; var9 < this.field8262.length; var9++) {
                var7.method826(16841, this.field8262[var9], this.field8272[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII[Let;IIIII)V")
    public static final void method3282(int arg0, int arg1, int arg2, int arg3, class509[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class210.field2560.method1107(arg2, arg0, arg8, arg9);
        field8266++;
        if (arg6 >= -29) {
            method3285((byte) -29, null);
        }
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class509 var11 = arg4[var10];
            if (var11 != null && (var11.field7054 == arg5 || arg5 == -1412584499 && class289.field3757 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class250.field3224[class315.field4023].setBounds(var11.field7139 + arg7, var11.field7110 + arg1, var11.field7094, var11.field7059);
                    var12 = class315.field4023++;
                } else {
                    var12 = arg3;
                }
                var11.field7099 = class335.field4358;
                var11.field7161 = var12;
                if (!client.method1407(var11)) {
                    if (var11.field7154 != 0) {
                        class435.method2513(var11, (byte) 28);
                    }
                    int var13 = var11.field7139 + arg7;
                    int var14 = var11.field7110 + arg1;
                    int var15 = var11.field7173;
                    if (class2.field8 && (client.method1412(var11).field3493 != 0 || var11.field7197 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class289.field3757 == var11) {
                        if (arg5 != -1412584499 && (class428.field5532 == var11.field7076 || class437.field5975 == var11.field7076)) {
                            class385.field5079 = arg7;
                            class343.field4426 = arg1;
                            class193.field2337 = arg4;
                            continue;
                        }
                        if (class372.field4895 && class521.field7315) {
                            int var16 = class368.field4859.method167(64);
                            int var17 = class368.field4859.method169(-126);
                            int var18 = var17 - class197.field2382;
                            int var19 = var16 - class98.field1220;
                            if (var19 < class229.field2842) {
                                var19 = class229.field2842;
                            }
                            if (var18 < class491.field6853) {
                                var18 = class491.field6853;
                            }
                            if ((var11.field7094 + var19) > (class229.field2842 + class40.field312.field7094)) {
                                var19 = class229.field2842 + class40.field312.field7094 - var11.field7094;
                            }
                            var13 = var19;
                            if (var11.field7059 + var18 > class491.field6853 - -class40.field312.field7059) {
                                var18 = class491.field6853 + class40.field312.field7059 - var11.field7059;
                            }
                            var14 = var18;
                        }
                        if (class437.field5975 == var11.field7076) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field7197 == 2) {
                        var20 = arg9;
                        var21 = arg2;
                        var22 = arg0;
                        var23 = arg8;
                    } else {
                        int var24 = var13 + var11.field7094;
                        int var25 = var11.field7059 + var14;
                        if (var11.field7197 == 9) {
                            var25++;
                            var24++;
                        }
                        var21 = arg2 >= var13 ? arg2 : var13;
                        var22 = var14 > arg0 ? var14 : arg0;
                        var20 = var25 < arg9 ? var25 : arg9;
                        var23 = var24 >= arg8 ? arg8 : var24;
                    }
                    if (var23 > var21 && var22 < var20) {
                        if (var11.field7154 != 0) {
                            if (class369.field4875 == var11.field7154 || class447.field6192 == var11.field7154) {
                                class53.method304((byte) -122, var14, var11.field7094, class447.field6192 == var11.field7154, var13, var11.field7059);
                                class371.field4888[var12] = true;
                                class210.field2560.method1107(arg2, arg0, arg8, arg9);
                                continue;
                            }
                            if (class467.field6532 == var11.field7154) {
                                if (var11.method2930(0, class210.field2560) != null) {
                                    class93.method560(true);
                                    class167.method937(var11, var13, var14, -108, class210.field2560);
                                    class468.field6543[var12] = true;
                                    class210.field2560.method1107(arg2, arg0, arg8, arg9);
                                }
                                continue;
                            }
                            if (class207.field2491 == var11.field7154) {
                                if (var11.method2930(0, class210.field2560) != null) {
                                    class557.method3265(var13, -41, var14, var11);
                                    class468.field6543[var12] = true;
                                    class210.field2560.method1107(arg2, arg0, arg8, arg9);
                                }
                                continue;
                            }
                            if (class524.field7340 == var11.field7154) {
                                class207.method1197(class210.field2560, 27940, var11.field7059, class491.field6848, var13, var14, var11.field7094);
                                class371.field4888[var12] = true;
                                class210.field2560.method1107(arg2, arg0, arg8, arg9);
                                continue;
                            }
                            if (class199.field2390 == var11.field7154) {
                                class394.method2269(var11.field7059, 1, class210.field2560, var11.field7094, var13, var14);
                                class371.field4888[var12] = true;
                                class210.field2560.method1107(arg2, arg0, arg8, arg9);
                                continue;
                            }
                            if (class276.field3640 == var11.field7154) {
                                if (!class252.field3260 && !class246.field3158) {
                                    continue;
                                }
                                int var26 = var11.field7094 + var13;
                                int var27 = var14 + 15;
                                if (class252.field3260) {
                                    int var28 = -256;
                                    if (class368.field4862 < 20) {
                                        var28 = -65536;
                                    }
                                    class137.field1673.method535(0, "Fps:" + class368.field4862, -1, var28, var26, var27);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                        if (class545.field7989) {
                                            class429.method2487(43);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class435.method2514("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", true);
                                            }
                                        }
                                    }
                                    class137.field1673.method535(0, "Mem:" + var30 + "k", -1, var31, var26, var27);
                                    var27 += 15;
                                    class137.field1673.method535(0, "In:" + class119.field1509 + "B/s Out:" + class310.field3942 + "B/s", -1, -256, var26, var27);
                                    var27 += 15;
                                    int var33 = class210.field2560.method1127() / 1024;
                                    class137.field1673.method535(0, "Offheap:" + var33 + "k", -1, ~var33 >= -65537 ? -256 : -65536, var26, var27);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 32; var37++) {
                                        var34 += class533.field7490[var37].method3623(0);
                                        var35 += class533.field7490[var37].method3621(-79);
                                        var36 += class533.field7490[var37].method3622(-97);
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class516.method2959((long) var39, true, 0, 44, 2) + "% (" + var38 + "%)";
                                    class403.field5290.method535(0, var40, -1, -256, var26, var27);
                                    var27 += 12;
                                }
                                if (class641.field9246 > 0) {
                                    class403.field5290.method535(0, "Particles: " + class272.field3531 + " / " + class641.field9246, -1, -256, var26, var27);
                                }
                                var27 += 12;
                                if (class246.field3158) {
                                    class403.field5290.method535(0, "Polys: " + class210.field2560.method1157() + " Models: " + class210.field2560.method1147(), -1, -256, var26, var27);
                                    var27 += 12;
                                    class403.field5290.method535(0, "Ls: " + class545.field8003 + " La: " + class98.field1206 + " NPC: " + class67.field648 + " Pl: " + class102.field1254, -1, -256, var26, var27);
                                    class415.method2365(-29229);
                                    var27 += 12;
                                }
                                class371.field4888[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field7197 == 0) {
                            if (class262.field3381 == var11.field7154 && class210.field2560.method1143()) {
                                class210.field2560.method1132(var13, var14, var11.field7094, var11.field7059);
                            }
                            method3282(var22, var14 - var11.field7104, var21, var12, arg4, var11.field7045, -111, var13 - var11.field7190, var23, var20);
                            if (var11.field7101 != null) {
                                method3282(var22, var14 - var11.field7104, var21, var12, var11.field7101, var11.field7045, -127, var13 - var11.field7190, var23, var20);
                            }
                            class565 var41 = (class565) class309.field3937.method2645((long) var11.field7045, (byte) -88);
                            if (var41 != null) {
                                class265.method1480(var12, var41.field8297, var21, (byte) 52, var13, var22, var20, var23, var14);
                            }
                            if (class262.field3381 == var11.field7154 && class210.field2560.method1143()) {
                                class210.field2560.method1117();
                                class95.field1167 = true;
                            }
                            class210.field2560.method1107(arg2, arg0, arg8, arg9);
                        }
                        if (class200.field2400[var12] || class241.field3010 > 1) {
                            if (var11.field7197 == 3) {
                                if (var15 == 0) {
                                    if (var11.field7119) {
                                        class210.field2560.method1133(var13, var14, var11.field7094, var11.field7059, var11.field7085, 0);
                                    } else {
                                        class210.field2560.method1142(var13, var14, var11.field7094, var11.field7059, var11.field7085, 0);
                                    }
                                } else if (var11.field7119) {
                                    class210.field2560.method1133(var13, var14, var11.field7094, var11.field7059, 255 - (var15 & 0xFF) << 24 | var11.field7085 & 0xFFFFFF, 1);
                                } else {
                                    class210.field2560.method1142(var13, var14, var11.field7094, var11.field7059, 255 - (var15 & 0xFF) << 24 | var11.field7085 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field7197 == 4) {
                                class90 var42 = var11.method2932(class210.field2560, 117);
                                if (var42 != null) {
                                    int var43 = var11.field7085;
                                    String var44 = var11.field7078;
                                    if (var11.field7082 != -1) {
                                        class607 var45 = class449.field6217.method2026((byte) -126, var11.field7082);
                                        var44 = var45.field8805;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field8796 == 1 || var11.field7163 != 1) && var11.field7163 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class127.method723(false, var11.field7163);
                                        }
                                    }
                                    if (class478.field6711 == var11) {
                                        var44 = class29.field202.method987(class31.field247, 22);
                                        var43 = var11.field7085;
                                    }
                                    if (class81.field968) {
                                        class210.field2560.method1119(var13, var14, var11.field7094 + var13, var14 - -var11.field7059);
                                    }
                                    var42.method549(null, 0, class547.field8049, 6832, var11.field7113 ? 255 - (var15 & 0xFF) << 24 : -1, var14, var11.field7098, var11.field7059, var44, var13, 0, null, var11.field7068, var11.field7040, var11.field7094, var11.field7188, 255 - (var15 & 0xFF) << 24 | var43);
                                    if (class81.field968) {
                                        class210.field2560.method1107(arg2, arg0, arg8, arg9);
                                    }
                                } else if (class614.field8897) {
                                    class87.method508(124, var11);
                                }
                            } else if (var11.field7197 == 5) {
                                if (var11.field7127 >= 0) {
                                    var11.method2915(class643.field9362, -17217, field8276).method3465(0, var11.field7073 << 3, var11.field7059, var11.field7074 << 3, 0, class210.field2560, var14, 0, var11.field7094, var13);
                                } else {
                                    class52 var47;
                                    if (var11.field7082 == -1) {
                                        var47 = var11.method2921(class210.field2560, (byte) 114);
                                    } else {
                                        class498 var46 = var11.field7067 ? class103.field1265.field8002 : null;
                                        var47 = class449.field6217.method2022(var11.field7163, var11.field7082, class210.field2560, false, var11.field7153 | 0xFF000000, var11.field7192, var11.field7107, var46);
                                    }
                                    if (var47 != null) {
                                        int var48 = var47.method292();
                                        int var49 = var47.method286();
                                        int var50 = (var11.field7085 == 0 ? 16777215 : var11.field7085 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                        if (var11.field7079) {
                                            class210.field2560.method1119(var13, var14, var11.field7094 + var13, var11.field7059 + var14);
                                            if (var11.field7169 != 0) {
                                                int var51 = (var11.field7094 - (1 - var48)) / var48;
                                                int var52 = (var11.field7059 + var49 - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field7085 == 0) {
                                                            var47.method295((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field7169);
                                                        } else {
                                                            var47.method287((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field7169, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field7085 == 0 && var15 == 0) {
                                                var47.method293(var13, var14, var11.field7094, var11.field7059);
                                            } else {
                                                var47.method296(var13, var14, var11.field7094, var11.field7059, 0, var50, 1);
                                            }
                                            class210.field2560.method1107(arg2, arg0, arg8, arg9);
                                        } else if (var11.field7085 == 0 && var15 == 0) {
                                            if (var11.field7169 != 0) {
                                                var47.method295((float) var11.field7094 / 2.0F + (float) var13, (float) var11.field7059 / 2.0F + (float) var14, var11.field7094 * 4096 / var48, var11.field7169);
                                            } else if (var11.field7094 == var48 && var11.field7059 == var49) {
                                                var47.method299(var13, var14);
                                            } else {
                                                var47.method284(var13, var14, var11.field7094, var11.field7059);
                                            }
                                        } else if (var11.field7169 != 0) {
                                            var47.method287((float) var11.field7094 / 2.0F + (float) var13, (float) var11.field7059 / 2.0F + (float) var14, var11.field7094 * 4096 / var48, var11.field7169, 0, var50, 1);
                                        } else if (var11.field7094 == var48 && var11.field7059 == var49) {
                                            var47.method3(var13, var14, 0, var50, 1);
                                        } else {
                                            var47.method6(var13, var14, var11.field7094, var11.field7059, 0, var50, 1);
                                        }
                                    } else if (class614.field8897) {
                                        class87.method508(124, var11);
                                    }
                                }
                            } else if (var11.field7197 == 6) {
                                class199.method1075((byte) -55);
                                class157 var55 = null;
                                int var56 = 0;
                                if (var11.field7082 != -1) {
                                    class607 var57 = class449.field6217.method2026((byte) -64, var11.field7082);
                                    if (var57 != null) {
                                        class607 var58 = var57.method3484(-128, var11.field7163);
                                        class502 var59 = var11.field7141 == -1 ? null : class393.field5190.method770(var11.field7141, -94);
                                        class498 var60 = var11.field7067 ? class103.field1265.field8002 : null;
                                        var55 = var58.method3496(2048, var11.field7063, var59, var60, var11.field7084, var11.field7047, true, class210.field2560, 1);
                                        if (var55 == null) {
                                            class87.method508(126, var11);
                                        } else {
                                            var56 = -var55.method74() >> 1;
                                        }
                                    }
                                } else if (var11.field7102 == 5) {
                                    int var61 = var11.field7097;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class545 var62 = class459.field6329[var61];
                                        class502 var63 = var11.field7141 == -1 ? null : class393.field5190.method770(var11.field7141, -119);
                                        if (var62 != null && (class82.field1003 == var61 || method3285((byte) 125, var62.field8023) == var11.field7202)) {
                                            var55 = var62.field8002.method2882(0, class518.field7296, var11.field7047, (byte) 126, class393.field5190, -1, null, class16.field125, 0, class449.field6217, class210.field2560, class368.field4857, true, 2048, class281.field3700, var11.field7063, var11.field7084, var63, null);
                                        }
                                    }
                                } else if (var11.field7102 == 8 || var11.field7102 == 9) {
                                    class125 var65 = class256.method1445(var11.field7097, (byte) -47, false);
                                    class502 var66 = var11.field7141 == -1 ? null : class393.field5190.method770(var11.field7141, -87);
                                    if (var65 != null) {
                                        class498 var67 = var11.field7067 ? class103.field1265.field8002 : null;
                                        var55 = var65.method716(var11.field7063, var11.field7102 == 9, var11.field7084, var11.field7047, (byte) 37, 2048, var67, class210.field2560, var11.field7202, var66);
                                    }
                                } else if (var11.field7141 == -1) {
                                    var55 = var11.method2922(0, class281.field3700, class368.field4857, true, class210.field2560, 2048, class449.field6217, class393.field5190, class518.field7296, -1, null, class103.field1265.field8002, class16.field125, -1);
                                    if (var55 == null && class614.field8897) {
                                        class87.method508(124, var11);
                                    }
                                } else {
                                    class502 var64 = class393.field5190.method770(var11.field7141, -53);
                                    var55 = var11.method2922(var11.field7084, class281.field3700, class368.field4857, true, class210.field2560, 2048, class449.field6217, class393.field5190, class518.field7296, var11.field7063, var64, class103.field1265.field8002, class16.field125, var11.field7047);
                                    if (var55 == null && class614.field8897) {
                                        class87.method508(127, var11);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field7123 > 0) {
                                        var68 = (var11.field7094 << 9) / var11.field7123;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69;
                                    if (var11.field7201 <= 0) {
                                        var69 = 512;
                                    } else {
                                        var69 = (var11.field7059 << 9) / var11.field7201;
                                    }
                                    int var70 = var11.field7094 / 2 + (var13 + (var11.field7118 * var68 >> 9));
                                    int var71 = var11.field7059 / 2 + (var11.field7178 * var69 >> 9) + var14;
                                    class138.field1681.method656();
                                    class210.field2560.method1160(class138.field1681);
                                    class210.field2560.method1179(var70, var71, var68, var69);
                                    class210.field2560.method1106((float) (var11.field7171 << 0), var11.field7138 ? (float) (var11.field7100 << 0) : (float) (var11.field7100 << 0) * 1.5F);
                                    if (arg5 == -1412584499 || class95.field1167) {
                                        class210.field2560.method1182();
                                        class210.field2560.method1166();
                                        class210.field2560.method1107(arg2, arg0, arg8, arg9);
                                        class95.field1167 = false;
                                    }
                                    if (var11.field7150) {
                                        class210.field2560.method1181(false);
                                    }
                                    int var72 = (var11.field7144 << 0) * class442.field6100[var11.field7189 << 3] >> 15;
                                    int var73 = (var11.field7144 << 0) * class442.field6101[var11.field7189 << 3] >> 15;
                                    class272.field3527.method666(-var11.field7156 << 3);
                                    class272.field3527.method672(var11.field7042 << 3);
                                    class272.field3527.method655(var11.field7117 << 0, var72 + (var11.field7062 << 0) + var56, (var11.field7062 << 0) + var73);
                                    class272.field3527.method671(var11.field7189 << 3);
                                    if (class81.field968) {
                                        class210.field2560.method1119(var13, var14, var11.field7094 + var13, var14 - -var11.field7059);
                                    }
                                    if (var11.field7138) {
                                        var55.method63(class272.field3527, null, var11.field7144 << 0, 1);
                                    } else {
                                        var55.method69(class272.field3527, null, 1);
                                    }
                                    if (class81.field968) {
                                        class210.field2560.method1107(arg2, arg0, arg8, arg9);
                                    }
                                    if (var11.field7150) {
                                        class210.field2560.method1181(true);
                                    }
                                    class210.field2560.method1106(0.0F, 0.0F);
                                }
                            } else if (var11.field7197 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field7133) {
                                    var74 = var13;
                                    var76 = var11.field7059 + var14;
                                    var77 = var11.field7094 + var13;
                                    var75 = var14;
                                } else {
                                    var74 = var13;
                                    var75 = var11.field7059 + var14;
                                    var76 = var14;
                                    var77 = var13 + var11.field7094;
                                }
                                if (var11.field7049 == 1) {
                                    class210.field2560.method1168(var74, var76, var77, var75, var11.field7085, 0);
                                } else {
                                    class210.field2560.method267(var74, var76, var77, var75, var11.field7085, var11.field7049, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)Z")
    public final boolean method3283(int arg0) {
        field8271++;
        boolean var2 = true;
        class438 var3 = this.field8259.field6598;
        synchronized (this.field8259.field6598) {
            int var4 = 0;
            if (arg0 < 38) {
                this.method3287(true);
            }
            while (var4 < 5) {
                if (this.field8263[var4] != -1 && !this.field8259.field6598.method2563(this.field8263[var4], (byte) 123, 0)) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)Z")
    public final boolean method3284(int arg0) {
        if (arg0 != -1417126941) {
            field8273 = false;
        }
        field8269++;
        if (this.field8267 == null) {
            return true;
        }
        boolean var2 = true;
        class438 var3 = this.field8259.field6598;
        synchronized (this.field8259.field6598) {
            for (int var4 = 0; var4 < this.field8267.length; var4++) {
                if (!this.field8259.field6598.method2563(this.field8267[var4], (byte) 109, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3285(byte arg0, String arg1) {
        field8270++;
        int var2 = arg1.length();
        int var3 = -36 / ((arg0 + 42) / 37);
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            var4 = arg1.charAt(var5) + (var4 << 5) - var4;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
    public static void method3286(int arg0) {
        if (arg0 >= 111) {
            field8276 = null;
            field8274 = null;
            field8256 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)Lei;")
    public final class152 method3287(boolean arg0) {
        field8261++;
        class152[] var2 = new class152[5];
        int var3 = 0;
        class438 var4 = this.field8259.field6598;
        synchronized (this.field8259.field6598) {
            if (!arg0) {
                field8256 = null;
            }
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field8263[var5] != -1) {
                    var2[var3++] = class447.method2618(this.field8263[var5], this.field8259.field6598, 3317, 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field1812 < 13) {
                var2[var6].method825(-2, 0);
            }
        }
        class152 var7 = new class152(var2, var3);
        if (this.field8258 != null) {
            for (int var8 = 0; var8 < this.field8258.length; var8++) {
                var7.method827(this.field8258[var8], (byte) 121, this.field8257[var8]);
            }
        }
        if (this.field8262 != null) {
            for (int var9 = 0; var9 < this.field8262.length; var9++) {
                var7.method826(16841, this.field8262[var9], this.field8272[var9]);
            }
        }
        return var7;
    }

    static {
        new class180("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        new class180(" days.", " Tage.", " jours.", " dias.");
        field8275 = 320;
        field8274 = new class548(29, 8);
    }
}
