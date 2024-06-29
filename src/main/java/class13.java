import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class13 extends class279 {

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "I")
    private int field169 = 6;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "Ltl;")
    public static class59 field165 = class85.method639("Ablegen", 9588);

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Ltl;")
    public static class59 field170 = class85.method639("ul", 9588);

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Ltl;")
    public static class59 field172 = class85.method639("Benutzen", 9588);

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    public static int field181 = -1;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "Z")
    public static boolean field182 = false;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "Ltl;")
    public static class59 field168 = class85.method639("Schrifts-=tze geladen)3", 9588);

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "[S")
    public static short[] field173;

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 3)
    public class13() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZILca;IIIIIBLqg;II)Lca;", line = 8)
    public static final class57 method85(int arg0, int arg1, boolean arg2, int arg3, class57 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, class129 arg11, int arg12, int arg13) {
        field179++;
        long var14 = ((long) arg6 << 48) + ((long) arg9 << 32) + (long) ((arg3 << 16) + (arg0 - -(arg12 << 24)));
        class57 var16 = (class57) class297.field5088.method1483((byte) -74, var14);
        if (var16 == null) {
            byte var17;
            if (arg0 == 1) {
                var17 = 9;
            } else if (arg0 == 2) {
                var17 = 12;
            } else if (arg0 == 3) {
                var17 = 15;
            } else if (arg0 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            int[][] var20 = new int[var19][var17];
            class242 var21 = new class242(var17 * var19 + 1, var17 * 2 * var19 + -var17, 0);
            int var22 = var21.method1709(0, 0, 0);
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg5 + (class298.field5095[var27] * var25) >> 16;
                    int var29 = class298.field5094[var27] * var24 + arg7 >> 16;
                    var20[var23][var26] = var21.method1709(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg3 * var32 + arg12 * var31 >> 8);
                short var34 = (short) (((arg6 & 0xFC00) * var31 + (arg9 & 0xFC00) * var32 & 0xFC0000) + ((arg6 & 0x380) * var31 + (arg9 & 0x380) * var32 & 0x38000) + ((arg6 & 0x7F) * var31 + (arg9 & 0x7F) * var32 & 0x7F00) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var21.method1697(var22, var20[0][(var35 + 1) % var17], var20[0][var35], (byte) 1, var34, var33);
                    } else {
                        var21.method1697(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var17], var20[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var21.method1697(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var17], var20[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var21.method1702(64, 768, -50, -10, -50);
            class297.field5088.method1488(var14, var16, 25838);
        }
        int var36 = arg0 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg4.method440();
        if (arg10 >= -54) {
            field182 = true;
        }
        int var41 = var36;
        if (arg2) {
            if (arg8 > 1152 && arg8 < 1920) {
                var41 = var36 + 128;
            }
            if (arg8 > 128 && arg8 < 896) {
                var38 -= 128;
            }
            if (arg8 > 1664 || arg8 < 384) {
                var37 -= 128;
            }
            if (arg8 > 640 && arg8 < 1408) {
                var39 = var36 + 128;
            }
        }
        if (var40 < var38) {
            var40 = var38;
        }
        int var42 = arg4.method436();
        int var43 = arg4.method435();
        if (var42 > var41) {
            var42 = var41;
        }
        int var44 = arg4.method426();
        if (var37 > var43) {
            var43 = var37;
        }
        if (var44 > var39) {
            var44 = var39;
        }
        class40 var45 = null;
        if (arg11 != null) {
            int var46 = arg11.field2118[arg1];
            var45 = class182.method1351(var46 >> 16, (byte) -62);
            arg1 = var46 & 0xFFFF;
        }
        class57 var47;
        if (var45 == null) {
            var47 = var16.method429(true, true);
            var47.method444((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method441((var40 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method429(!var45.method262(arg1, -127), true);
            var47.method444((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method441((var40 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method442(var45, arg1);
        }
        if (arg8 != 0) {
            var47.method439(arg8);
        }
        if (class55.field815) {
            class267 var48 = (class267) var47;
            if (arg13 != class73.method589(class247.field4119, true, arg5 + var40, arg7 + var43) || arg13 != class73.method589(class247.field4119, true, arg5 + var42, arg7 + var44)) {
                for (int var49 = 0; var49 < var48.field4637; var49++) {
                    var48.field4623[var49] += class73.method589(class247.field4119, true, var48.field4607[var49] + arg5, var48.field4602[var49] - -arg7) - arg13;
                }
                var48.field4616.field2219 = false;
                var48.field4632.field3192 = false;
            }
        } else {
            class258 var50 = (class258) var47;
            if (class73.method589(class247.field4119, true, arg5 + var40, arg7 + var43) != arg13 || arg13 != class73.method589(class247.field4119, true, arg5 + var42, arg7 - -var44)) {
                for (int var51 = 0; var51 < var50.field4275; var51++) {
                    var50.field4296[var51] += class73.method589(class247.field4119, true, var50.field4279[var51] + arg5, var50.field4276[var51] + arg7) - arg13;
                }
                var50.field4260 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)[I", line = 238)
    public final int[] method44(boolean arg0, int arg1) {
        field178++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-124, arg1, 0);
            int[] var5 = this.method1960(-124, arg1, 1);
            int var6 = this.field169;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class56.field835; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var8 = 0; var8 < class56.field835; var8++) {
                    var3[var8] = var4[var8] - var5[var8];
                }
            } else if (var6 == 3) {
                for (int var9 = 0; var9 < class56.field835; var9++) {
                    var3[var9] = var4[var9] * var5[var9] >> 12;
                }
            } else if (var6 == 4) {
                for (int var10 = 0; var10 < class56.field835; var10++) {
                    int var11 = var5[var10];
                    var3[var10] = var11 == 0 ? 4096 : (var4[var10] << 12) / var11;
                }
            } else if (var6 == 5) {
                for (int var30 = 0; var30 < class56.field835; var30++) {
                    var3[var30] = 4096 - ((4096 - var4[var30]) * (4096 - var5[var30]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var28 = 0; var28 < class56.field835; var28++) {
                    int var29 = var5[var28];
                    var3[var28] = var29 >= 2048 ? 4096 - ((4096 - var4[var28]) * (4096 - var29) >> 11) : var4[var28] * var29 >> 11;
                }
            } else if (var6 == 7) {
                for (int var26 = 0; var26 < class56.field835; var26++) {
                    int var27 = var4[var26];
                    var3[var26] = var27 == 4096 ? 4096 : (var5[var26] << 12) / (4096 - var27);
                }
            } else if (var6 == 8) {
                for (int var12 = 0; var12 < class56.field835; var12++) {
                    int var13 = var4[var12];
                    var3[var12] = var13 == 0 ? 0 : 4096 - ((4096 - var5[var12] << 12) / var13);
                }
            } else if (var6 == 9) {
                for (int var14 = 0; var14 < class56.field835; var14++) {
                    int var15 = var4[var14];
                    int var16 = var5[var14];
                    var3[var14] = var15 >= var16 ? var16 : var15;
                }
            } else if (var6 == 10) {
                for (int var17 = 0; var17 < class56.field835; var17++) {
                    int var18 = var5[var17];
                    int var19 = var4[var17];
                    var3[var17] = var18 < var19 ? var19 : var18;
                }
            } else if (var6 == 11) {
                for (int var23 = 0; var23 < class56.field835; var23++) {
                    int var24 = var5[var23];
                    int var25 = var4[var23];
                    var3[var23] = var25 > var24 ? var25 - var24 : -var25 + var24;
                }
            } else if (var6 == 12) {
                for (int var20 = 0; var20 < class56.field835; var20++) {
                    int var21 = var4[var20];
                    int var22 = var5[var20];
                    var3[var20] = var21 + var22 - (var21 * var22 >> 11);
                }
            }
        }
        if (arg0) {
            field168 = (class59) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)V", line = 497)
    public static final void method86(int arg0) {
        if (class56.field833 > 0) {
            class56.field833--;
        }
        if (class31.field425 > 1) {
            class195.field3229 = class180.field3007;
            class31.field425--;
        }
        field166++;
        if (class44.field685) {
            class44.field685 = false;
            class86.method650(-109);
            return;
        }
        for (int var1 = 0; var1 < 100 && class223.method1540(true); var1++) {
        }
        if (class238.field3978 != 30) {
            return;
        }
        class123.method916(class234.field3888, 27, (byte) 85);
        Object var2 = class269.field4666.field3073;
        synchronized (class269.field4666.field3073) {
            if (!class255.field4238) {
                class269.field4666.field3075 = 0;
            } else if (class154.field2513 != 0 || class269.field4666.field3075 >= 40) {
                class280.field4831++;
                int var3 = 0;
                class234.field3888.method1768(true, 162);
                class234.field3888.method1219(0, true);
                int var4 = class234.field3888.field2787;
                for (int var5 = 0; var5 < class269.field4666.field3075 && class234.field3888.field2787 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class269.field4666.field3074[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class269.field4666.field3076[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class269.field4666.field3074[var5] == -1 && class269.field4666.field3076[var5] == -1) {
                        var7 = -1;
                        var8 = true;
                        var6 = -1;
                    }
                    if (class84.field1321 != var7 || class96.field1520 != var6) {
                        int var9 = var7 - class84.field1321;
                        int var10 = var6 - class96.field1520;
                        class84.field1321 = var7;
                        class96.field1520 = var6;
                        if (class310.field5251 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class234.field3888.method1237(true, (class310.field5251 << 12) + (var9 << 6) + var10);
                            class310.field5251 = 0;
                        } else if (class310.field5251 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class234.field3888.method1219(class310.field5251 + 128, true);
                            class234.field3888.method1237(true, (var9 << 8) + var10);
                            class310.field5251 = 0;
                        } else if (class310.field5251 < 32) {
                            class234.field3888.method1219(class310.field5251 + 192, true);
                            if (var8) {
                                class234.field3888.method1213(arg0 ^ 0xFFFFFFDF, Integer.MIN_VALUE);
                            } else {
                                class234.field3888.method1213(-1, var7 | var6 << 16);
                            }
                            class310.field5251 = 0;
                        } else {
                            class234.field3888.method1237(true, class310.field5251 + 57344);
                            if (var8) {
                                class234.field3888.method1213(arg0 ^ 0xFFFFFFDF, Integer.MIN_VALUE);
                            } else {
                                class234.field3888.method1213(-1, var7 | var6 << 16);
                            }
                            class310.field5251 = 0;
                        }
                    } else if (class310.field5251 < 2047) {
                        class310.field5251++;
                    }
                }
                class234.field3888.method1215(class234.field3888.field2787 - var4, 107);
                if (class269.field4666.field3075 <= var3) {
                    class269.field4666.field3075 = 0;
                } else {
                    class269.field4666.field3075 -= var3;
                    for (int var11 = 0; var11 < class269.field4666.field3075; var11++) {
                        class269.field4666.field3076[var11] = class269.field4666.field3076[var3 + var11];
                        class269.field4666.field3074[var11] = class269.field4666.field3074[var3 + var11];
                    }
                }
            }
        }
        if (class154.field2513 != 0) {
            class190.field3179++;
            long var13 = (class36.field527 - class78.field1246) / 50L;
            class78.field1246 = class36.field527;
            int var15 = class231.field3794;
            byte var16 = 0;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            if (class154.field2513 == 2) {
                var16 = 1;
            }
            int var17 = class149.field2444;
            int var18 = (int) var13;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            class234.field3888.method1768(true, 224);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            class234.field3888.method1213(-1, var15 | var17 << 16);
            class234.field3888.method1196((byte) 78, var16 << 15 | var18);
        }
        if (class183.field3077 > 0) {
            class183.field3077--;
        }
        if (class317.field5350[96] || class317.field5350[97] || class317.field5350[98] || class317.field5350[99]) {
            class96.field1521 = true;
        }
        if (class96.field1521 && class183.field3077 <= 0) {
            class96.field1521 = false;
            class295.field5041++;
            class183.field3077 = 20;
            class234.field3888.method1768(true, 227);
            class234.field3888.method1200(class213.field3489, 32602);
            class234.field3888.method1200(class124.field2057, arg0 ^ 0x7F7A);
        }
        if (class165.field2679 && !class222.field3591) {
            class222.field3591 = true;
            class140.field2337++;
            class234.field3888.method1768(true, 85);
            class234.field3888.method1219(1, true);
        }
        if (!class165.field2679 && class222.field3591) {
            class222.field3591 = false;
            class234.field3888.method1768(true, 85);
            class140.field2337++;
            class234.field3888.method1219(0, true);
        }
        if (!class7.field85) {
            class234.field3888.method1768(true, 191);
            class211.field3456++;
            class234.field3888.method1211(class84.method627(-107), (byte) -89);
            class7.field85 = true;
        }
        class155.method1107(true);
        if (class238.field3978 != 30) {
            return;
        }
        class245.method1737(20933);
        class163.method1161((byte) -104);
        class1.field10++;
        if (class1.field10 > 750) {
            class86.method650(-12);
            return;
        }
        class165.method1167(-1);
        class264.method1833(arg0 + 15);
        class18.method112(-9603);
        if (class14.field202 != null) {
            class247.method1741((byte) 15);
        }
        for (int var19 = class129.method946(0, true); var19 != -1; var19 = class129.method946(0, false)) {
            class294.method2027(var19, -10);
            class182.field3060[class93.method680(class207.field3377++, 31)] = var19;
        }
        for (class186 var20 = class73.method592(-32732); var20 != null; var20 = class73.method592(arg0 ^ 0xFFFF8004)) {
            int var21 = var20.method1377(true);
            int var22 = var20.method1378(0);
            if (var21 == 1) {
                class60.field935[var22] = var20.field3117;
                class215.field3522[class93.method680(31, class210.field3426++)] = var22;
            } else if (var21 == 2) {
                class229.field3759[var22] = var20.field3113;
                class11.field154[class93.method680(31, class233.field3855++)] = var22;
            } else if (var21 == 3) {
                class263 var23 = class247.method1738(false, var22);
                if (!var20.field3113.method453(var23.field4534, (byte) -25)) {
                    var23.field4534 = var20.field3113;
                    class140.method1019(var23, (byte) -85);
                }
            } else if (var21 == 4) {
                class263 var40 = class247.method1738(false, var22);
                int var41 = var20.field3117;
                int var42 = var20.field3123;
                if (var40.field4412 != var41 || var40.field4438 != var42) {
                    var40.field4438 = var42;
                    var40.field4412 = var41;
                    class140.method1019(var40, (byte) -80);
                }
            } else if (var21 == 5) {
                class263 var39 = class247.method1738(false, var22);
                if (var20.field3117 != var39.field4457 || var20.field3117 == -1) {
                    var39.field4394 = 0;
                    var39.field4457 = var20.field3117;
                    var39.field4431 = 0;
                    class140.method1019(var39, (byte) -68);
                }
            } else if (var21 == 6) {
                int var24 = var20.field3117;
                int var25 = var24 & 0x1F;
                class263 var26 = class247.method1738(false, var22);
                int var27 = var24 >> 10 & 0x1F;
                int var28 = var24 >> 5 & 0x1F;
                int var29 = (var28 << 11) + ((var27 << 19) + (var25 << 3));
                if (var26.field4525 != var29) {
                    var26.field4525 = var29;
                    class140.method1019(var26, (byte) 125);
                }
            } else if (var21 == 7) {
                class263 var30 = class247.method1738(false, var22);
                boolean var31 = var20.field3117 == 1;
                if (var30.field4547 != var31) {
                    var30.field4547 = var31;
                    class140.method1019(var30, (byte) 79);
                }
            } else if (var21 == 8) {
                class263 var32 = class247.method1738(false, var22);
                if (var20.field3117 != var32.field4393 || var20.field3123 != var32.field4426 || var20.field3114 != var32.field4425) {
                    var32.field4393 = var20.field3117;
                    var32.field4426 = var20.field3123;
                    var32.field4425 = var20.field3114;
                    if (var32.field4533 != -1) {
                        if (var32.field4515 > 0) {
                            var32.field4425 = var32.field4425 * 32 / var32.field4515;
                        } else if (var32.field4388 > 0) {
                            var32.field4425 = var32.field4425 * 32 / var32.field4388;
                        }
                    }
                    class140.method1019(var32, (byte) -116);
                }
            } else if (var21 == 9) {
                class263 var33 = class247.method1738(false, var22);
                if (var20.field3117 != var33.field4533 || var20.field3123 != var33.field4502) {
                    var33.field4533 = var20.field3117;
                    var33.field4502 = var20.field3123;
                    class140.method1019(var33, (byte) -69);
                }
            } else if (var21 == 10) {
                class263 var34 = class247.method1738(false, var22);
                if (var20.field3117 != var34.field4532 || var20.field3123 != var34.field4497 || var20.field3114 != var34.field4539) {
                    var34.field4539 = var20.field3114;
                    var34.field4497 = var20.field3123;
                    var34.field4532 = var20.field3117;
                    class140.method1019(var34, (byte) -106);
                }
            } else if (var21 == 11) {
                class263 var38 = class247.method1738(false, var22);
                var38.field4490 = 0;
                var38.field4384 = 0;
                var38.field4495 = var38.field4506 = var20.field3117;
                var38.field4546 = var38.field4471 = var20.field3123;
                class140.method1019(var38, (byte) -120);
            } else if (var21 == 12) {
                class263 var35 = class247.method1738(false, var22);
                int var36 = var20.field3117;
                if (var35 != null && var35.field4468 == 0) {
                    if (var36 > var35.field4479 - var35.field4467) {
                        var36 = var35.field4479 - var35.field4467;
                    }
                    if (var36 < 0) {
                        var36 = 0;
                    }
                    if (var35.field4504 != var36) {
                        var35.field4504 = var36;
                        class140.method1019(var35, (byte) 113);
                    }
                }
            } else if (var21 == 13) {
                class263 var37 = class247.method1738(false, var22);
                var37.field4413 = var20.field3117;
            }
        }
        if (class64.field992 != 0) {
            class236.field3918 += 20;
            if (class236.field3918 >= 400) {
                class64.field992 = 0;
            }
        }
        class64.field985++;
        if (class219.field3557 != null) {
            class12.field160++;
            if (class12.field160 >= 15) {
                class140.method1019(class219.field3557, (byte) 106);
                class219.field3557 = null;
            }
        }
        if (class305.field5180 != null) {
            class140.method1019(class305.field5180, (byte) 119);
            if (class27.field361 + 5 < class254.field4213 || (class27.field361 - 5) > class254.field4213 || (class294.field5018 + 5) < class184.field3079 || class184.field3079 < class294.field5018 - 5) {
                class59.field922 = true;
            }
            class197.field3254++;
            if (class59.field910 == 0) {
                if (class59.field922 && class197.field3254 >= 5) {
                    if (class99.field1595 == class305.field5180 && class7.field83 != class301.field5147) {
                        class50.field764++;
                        class263 var43 = class305.field5180;
                        byte var44 = 0;
                        if (class197.field3252 == 1 && var43.field4472 == 206) {
                            var44 = 1;
                        }
                        if (var43.field4549[class7.field83] <= 0) {
                            var44 = 0;
                        }
                        if (class113.method813(true, client.method278(var43))) {
                            int var47 = class7.field83;
                            int var48 = class301.field5147;
                            var43.field4549[var47] = var43.field4549[var48];
                            var43.field4444[var47] = var43.field4444[var48];
                            var43.field4549[var48] = -1;
                            var43.field4444[var48] = 0;
                        } else if (var44 == 1) {
                            int var45 = class301.field5147;
                            int var46 = class7.field83;
                            while (var45 != var46) {
                                if (var46 < var45) {
                                    var43.method1820(119, var45 - 1, var45);
                                    var45--;
                                } else if (var45 < var46) {
                                    var43.method1820(124, var45 + 1, var45);
                                    var45++;
                                }
                            }
                        } else {
                            var43.method1820(126, class7.field83, class301.field5147);
                        }
                        class234.field3888.method1768(true, 123);
                        class234.field3888.method1200(class301.field5147, arg0 ^ 0x7F7A);
                        class234.field3888.method1242(var44, false);
                        class234.field3888.method1200(class7.field83, arg0 + 32570);
                        class234.field3888.method1207(-65, class305.field5180.field4392);
                    }
                } else if ((class281.field4842 == 1 || class157.method1117(class231.field3803 - 1, 1007)) && class231.field3803 > 2) {
                    class133.method972(arg0 - 32231);
                } else if (class231.field3803 > 0) {
                    class288.method2002(-3);
                }
                class12.field160 = 10;
                class305.field5180 = null;
                class154.field2513 = 0;
            }
        }
        class12.field157 = 0;
        class263 var49 = class111.field1812;
        class190.field3187 = false;
        class17.field217 = false;
        class111.field1812 = null;
        class263 var50 = class222.field3603;
        class222.field3603 = null;
        class313.field5305 = null;
        while (class251.method1751(3368) && class12.field157 < 128) {
            class147.field2394[class12.field157] = class291.field4979;
            class75.field1192[class12.field157] = class18.field225;
            class12.field157++;
        }
        class3.field42 = null;
        class14.field202 = null;
        if (class262.field4364 != -1) {
            class159.method1138(class152.field2498, (byte) -128, 0, 0, 0, class262.field4364, class53.field792, 0);
        }
        class180.field3007++;
        if (class3.field42 != null) {
            class159.method1140(class311.field5273, class3.field42, class25.field328, 112);
            class3.field42 = null;
        }
        while (true) {
            class128 var51;
            class263 var52;
            class263 var53;
            do {
                var51 = (class128) class289.field4957.method526((byte) 107);
                if (var51 == null) {
                    while (true) {
                        class128 var54;
                        class263 var55;
                        class263 var56;
                        do {
                            var54 = (class128) class182.field3055.method526((byte) 113);
                            if (var54 == null) {
                                while (true) {
                                    class128 var57;
                                    class263 var58;
                                    class263 var59;
                                    do {
                                        var57 = (class128) class262.field4373.method526((byte) -78);
                                        if (var57 == null) {
                                            if (class313.field5308 && class14.field202 == null) {
                                                class313.field5308 = false;
                                            }
                                            if (class301.field5145 != null) {
                                                class301.method2101(true);
                                            }
                                            if (class280.field4793 > 0 && class317.field5350[82] && class317.field5350[81] && class206.field3368 != 0) {
                                                int var60 = class247.field4119 - class206.field3368;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class19.method129(var60, class286.field4920.field1773[0] + class187.field3135, class286.field4920.field1729[0] + class197.field3249, 31886);
                                            }
                                            if (class262.field4374 != -1) {
                                                int var61 = class266.field4592;
                                                int var62 = class262.field4374;
                                                if (class280.field4793 > 0 && class317.field5350[82] && class317.field5350[81]) {
                                                    class19.method129(class247.field4119, class187.field3135 + var61, class197.field3249 + var62, 31886);
                                                } else if (class99.field1589) {
                                                    class16.field214++;
                                                    class234.field3888.method1768(true, 55);
                                                    class234.field3888.method1238(arg0 + 1871071336, class187.field3135 - -var61);
                                                    class234.field3888.method1238(arg0 ^ 0x6F8648A8, class39.field588);
                                                    class234.field3888.method1237(true, class197.field3249 + var62);
                                                    class234.field3888.method1217(class27.field362, (byte) -15);
                                                    class127.field2088 = class231.field3794;
                                                    class64.field992 = 1;
                                                    class223.field3619 = class149.field2444;
                                                    class236.field3918 = 0;
                                                } else {
                                                    boolean var63 = class28.method178(var61, 0, 0, (byte) -6, class286.field4920.field1729[0], 0, class286.field4920.field1773[0], 0, var62, 0, 0, true);
                                                    if (var63) {
                                                        class236.field3918 = 0;
                                                        class223.field3619 = class149.field2444;
                                                        class64.field992 = 1;
                                                        class127.field2088 = class231.field3794;
                                                    }
                                                }
                                                class99.field1589 = false;
                                                class262.field4374 = -1;
                                            }
                                            class308.method2137((byte) -128);
                                            if (class111.field1812 != var49) {
                                                if (var49 != null) {
                                                    class140.method1019(var49, (byte) 119);
                                                }
                                                if (class111.field1812 != null) {
                                                    class140.method1019(class111.field1812, (byte) 73);
                                                }
                                            }
                                            if (class222.field3603 != var50 && class265.field4577 == class263.field4505) {
                                                if (var50 != null) {
                                                    class140.method1019(var50, (byte) 80);
                                                }
                                                if (class222.field3603 != null) {
                                                    class140.method1019(class222.field3603, (byte) -85);
                                                }
                                            }
                                            if (class222.field3603 == null) {
                                                if (class265.field4577 > 0) {
                                                    class265.field4577--;
                                                }
                                            } else if (class265.field4577 < class263.field4505) {
                                                class265.field4577++;
                                                if (class265.field4577 == class263.field4505) {
                                                    class140.method1019(class222.field3603, (byte) 75);
                                                }
                                            }
                                            if (class266.field4585 == 1) {
                                                class64.method525((byte) -108);
                                            } else if (class266.field4585 == 2) {
                                                class292.method2021(-123);
                                            } else {
                                                class10.method76(-1);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class201.field3321[var64]++;
                                            }
                                            int var65 = class34.method229(false);
                                            int var66 = class228.method1565((byte) -122);
                                            if (var65 > 4500 && var66 > 4500) {
                                                class56.field833 = 250;
                                                class294.field5023++;
                                                class6.method50(4000, (byte) -128);
                                                class234.field3888.method1768(true, 133);
                                            }
                                            if (class215.field3513 != null && class215.field3513.field4256 == 1) {
                                                if (class215.field3513.field4255 != null) {
                                                    class9.method71(class70.field1097, class195.field3232, (byte) -57);
                                                }
                                                class215.field3513 = null;
                                                class70.field1097 = null;
                                                class195.field3232 = false;
                                            }
                                            if (arg0 != 32) {
                                                return;
                                            }
                                            class182.field3059++;
                                            class12.field164++;
                                            if (class12.field164 > 500) {
                                                class12.field164 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x4) == 4) {
                                                    class209.field3405 += class172.field2828;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class193.field3210 += class116.field1899;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class4.field56 += class71.field1112;
                                                }
                                            }
                                            if (class4.field56 < -50) {
                                                class71.field1112 = 2;
                                            }
                                            class264.field4557++;
                                            if (class193.field3210 < -55) {
                                                class116.field1899 = 2;
                                            }
                                            if (class209.field3405 < -40) {
                                                class172.field2828 = 1;
                                            }
                                            if (class209.field3405 > 40) {
                                                class172.field2828 = -1;
                                            }
                                            if (class193.field3210 > 55) {
                                                class116.field1899 = -2;
                                            }
                                            if (class4.field56 > 50) {
                                                class71.field1112 = -2;
                                            }
                                            if (class182.field3059 > 500) {
                                                class182.field3059 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class64.field983 += class226.field3647;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class45.field731 += class58.field855;
                                                }
                                            }
                                            if (class64.field983 < -60) {
                                                class226.field3647 = 2;
                                            }
                                            if (class45.field731 < -20) {
                                                class58.field855 = 1;
                                            }
                                            if (class45.field731 > 10) {
                                                class58.field855 = -1;
                                            }
                                            if (class64.field983 > 60) {
                                                class226.field3647 = -2;
                                            }
                                            if (class264.field4557 > 50) {
                                                class314.field5314++;
                                                class234.field3888.method1768(true, 78);
                                            }
                                            if (class3.field26) {
                                                class64.method538(false);
                                                class3.field26 = false;
                                            }
                                            try {
                                                if (class21.field284 != null && class234.field3888.field2787 > 0) {
                                                    class21.field284.method1267(class234.field3888.field2758, class234.field3888.field2787, 0, (byte) 56);
                                                    class234.field3888.field2787 = 0;
                                                    class264.field4557 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class86.method650(-69);
                                            }
                                            return;
                                        }
                                        var58 = var57.field2110;
                                        if (var58.field4500 < 0) {
                                            break;
                                        }
                                        var59 = class247.method1738(false, var58.field4410);
                                    } while (var59 == null || var59.field4377 == null || var59.field4377.length <= var58.field4500 || var59.field4377[var58.field4500] != var58);
                                    class299.method2093((byte) 104, var57);
                                }
                            }
                            var55 = var54.field2110;
                            if (var55.field4500 < 0) {
                                break;
                            }
                            var56 = class247.method1738(false, var55.field4410);
                        } while (var56 == null || var56.field4377 == null || var55.field4500 >= var56.field4377.length || var56.field4377[var55.field4500] != var55);
                        class299.method2093((byte) 82, var54);
                    }
                }
                var52 = var51.field2110;
                if (var52.field4500 < 0) {
                    break;
                }
                var53 = class247.method1738(false, var52.field4410);
            } while (var53 == null || var53.field4377 == null || var52.field4500 >= var53.field4377.length || var53.field4377[var52.field4500] != var52);
            class299.method2093((byte) 73, var51);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)[[I", line = 1496)
    public final int[][] method87(int arg0, int arg1) {
        int[][] var3 = this.field4786.method1427(arg0 + 7523, arg1);
        if (arg0 != -7523) {
            method88(true, false, (class263[]) null, -33, -14, -119);
        }
        field177++;
        if (this.field4786.field3297) {
            int[][] var4 = this.method1956(0, arg1, (byte) -112);
            int[][] var5 = this.method1956(1, arg1, (byte) -112);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            int[] var11 = var5[2];
            int[] var12 = var4[2];
            int[] var13 = var5[1];
            int[] var14 = var5[0];
            int var15 = this.field169;
            if (var15 == 1) {
                for (int var63 = 0; var63 < class56.field835; var63++) {
                    var6[var63] = var8[var63] + var14[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var9[var63] = var11[var63] + var12[var63];
                }
            } else if (var15 == 2) {
                for (int var16 = 0; var16 < class56.field835; var16++) {
                    var6[var16] = var8[var16] - var14[var16];
                    var7[var16] = var10[var16] - var13[var16];
                    var9[var16] = var12[var16] - var11[var16];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class56.field835; var17++) {
                    var6[var17] = var8[var17] * var14[var17] >> 12;
                    var7[var17] = var10[var17] * var13[var17] >> 12;
                    var9[var17] = var11[var17] * var12[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var59 = 0; var59 < class56.field835; var59++) {
                    int var60 = var11[var59];
                    int var61 = var13[var59];
                    int var62 = var14[var59];
                    var6[var59] = var62 == 0 ? 4096 : (var8[var59] << 12) / var62;
                    var7[var59] = var61 == 0 ? 4096 : (var10[var59] << 12) / var61;
                    var9[var59] = var60 == 0 ? 4096 : (var12[var59] << 12) / var60;
                }
            } else if (var15 == 5) {
                for (int var58 = 0; var58 < class56.field835; var58++) {
                    var6[var58] = 4096 - ((4096 - var8[var58]) * (4096 - var14[var58]) >> 12);
                    var7[var58] = 4096 - ((4096 - var13[var58]) * (4096 - var10[var58]) >> 12);
                    var9[var58] = 4096 - ((4096 - var11[var58]) * (4096 - var12[var58]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var18 = 0; var18 < class56.field835; var18++) {
                    int var19 = var14[var18];
                    int var20 = var13[var18];
                    int var21 = var11[var18];
                    var6[var18] = var19 < 2048 ? var8[var18] * var19 >> 11 : 4096 - ((4096 - var8[var18]) * (4096 - var19) >> 11);
                    var7[var18] = var20 >= 2048 ? 4096 - ((4096 - var10[var18]) * (4096 - var20) >> 11) : var10[var18] * var20 >> 11;
                    var9[var18] = var21 < 2048 ? var12[var18] * var21 >> 11 : 4096 - ((4096 - var12[var18]) * (4096 - var21) >> 11);
                }
            } else if (var15 == 7) {
                for (int var22 = 0; var22 < class56.field835; var22++) {
                    int var23 = var10[var22];
                    int var24 = var12[var22];
                    int var25 = var8[var22];
                    var6[var22] = var25 == 4096 ? 4096 : (var14[var22] << 12) / (4096 - var25);
                    var7[var22] = var23 == 4096 ? 4096 : (var13[var22] << 12) / (4096 - var23);
                    var9[var22] = var24 == 4096 ? 4096 : (var11[var22] << 12) / (4096 - var24);
                }
            } else if (var15 == 8) {
                for (int var26 = 0; var26 < class56.field835; var26++) {
                    int var27 = var8[var26];
                    int var28 = var10[var26];
                    int var29 = var12[var26];
                    var6[var26] = var27 == 0 ? 0 : 4096 - (4096 - var14[var26] << 12) / var27;
                    var7[var26] = var28 == 0 ? 0 : 4096 - ((4096 - var13[var26] << 12) / var28);
                    var9[var26] = var29 == 0 ? 0 : 4096 - ((4096 - var11[var26] << 12) / var29);
                }
            } else if (var15 == 9) {
                for (int var30 = 0; var30 < class56.field835; var30++) {
                    int var31 = var8[var30];
                    int var32 = var10[var30];
                    int var33 = var11[var30];
                    int var34 = var14[var30];
                    int var35 = var12[var30];
                    int var36 = var13[var30];
                    var6[var30] = var34 > var31 ? var31 : var34;
                    var7[var30] = var36 <= var32 ? var36 : var32;
                    var9[var30] = var33 <= var35 ? var33 : var35;
                }
            } else if (var15 == 10) {
                for (int var51 = 0; var51 < class56.field835; var51++) {
                    int var52 = var13[var51];
                    int var53 = var12[var51];
                    int var54 = var8[var51];
                    int var55 = var11[var51];
                    int var56 = var10[var51];
                    int var57 = var14[var51];
                    var6[var51] = var54 <= var57 ? var57 : var54;
                    var7[var51] = var56 <= var52 ? var52 : var56;
                    var9[var51] = var55 < var53 ? var53 : var55;
                }
            } else if (var15 == 11) {
                for (int var44 = 0; var44 < class56.field835; var44++) {
                    int var45 = var10[var44];
                    int var46 = var12[var44];
                    int var47 = var13[var44];
                    int var48 = var14[var44];
                    int var49 = var11[var44];
                    int var50 = var8[var44];
                    var6[var44] = var50 > var48 ? var50 - var48 : -var50 + var48;
                    var7[var44] = var45 <= var47 ? var47 - var45 : -var47 + var45;
                    var9[var44] = var49 >= var46 ? var49 - var46 : -var49 + var46;
                }
            } else if (var15 == 12) {
                for (int var37 = 0; var37 < class56.field835; var37++) {
                    int var38 = var13[var37];
                    int var39 = var14[var37];
                    int var40 = var10[var37];
                    int var41 = var8[var37];
                    int var42 = var12[var37];
                    int var43 = var11[var37];
                    var6[var37] = var39 + var41 - (var39 * var41 >> 11);
                    var7[var37] = var38 + var40 - (var38 * var40 >> 11);
                    var9[var37] = var42 + var43 - (var42 * var43 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILs;)V", line = 1809)
    public final void method51(int arg0, int arg1, class170 arg2) {
        field183++;
        if (arg1 == 0) {
            this.field169 = arg2.method1221(74);
        } else if (arg1 == 1) {
            this.field4789 = arg2.method1221(115) == 1;
        }
        if (arg0 >= -125) {
            field181 = 124;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZZ[Lma;III)V", line = 1845)
    public static final void method88(boolean arg0, boolean arg1, class263[] arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class263 var7 = arg2[var6];
            if (var7 != null && var7.field4410 == arg3) {
                class279.method1959(arg5, arg4, arg1, false, var7);
                class43.method292(arg5, var7, arg4, arg0);
                if (var7.field4479 - var7.field4467 < var7.field4504) {
                    var7.field4504 = var7.field4479 - var7.field4467;
                }
                if (var7.field4405 > var7.field4449 - var7.field4420) {
                    var7.field4405 = var7.field4449 - var7.field4420;
                }
                if (var7.field4504 < 0) {
                    var7.field4504 = 0;
                }
                if (var7.field4405 < 0) {
                    var7.field4405 = 0;
                }
                if (var7.field4468 == 0) {
                    class173.method1273(var7, -20833, arg1);
                }
            }
        }
        field180++;
        if (!arg0) {
            field170 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)V", line = 1895)
    public static void method89(int arg0) {
        field170 = null;
        field172 = null;
        if (arg0 >= 1) {
            field165 = null;
            field173 = null;
            field168 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)I", line = 1912)
    public static final int method90(int arg0, byte arg1) {
        int var2 = -50 / ((arg1 - 86) / 36);
        field171++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ltl;ILme;)Loe;", line = 1921)
    public static final class9 method91(class59 arg0, int arg1, class295 arg2) {
        field167++;
        int var3 = arg2.method2064(120, arg0);
        if (~var3 == arg1) {
            return new class9(0);
        }
        int[] var4 = arg2.method2041((byte) 18, var3);
        class9 var5 = new class9(var4.length);
        for (int var6 = 0; var6 < var5.field116; var6++) {
            class170 var7 = new class170(arg2.method2042(var3, var4[var6], (byte) -127));
            var5.field114[var6] = var7.method1250(false);
            var5.field124[var6] = var7.method1205(-1);
            var5.field122[var6] = (short) var7.method1214(-18254);
            var5.field121[var6] = (short) var7.method1214(class310.method2143(arg1, -18254));
            var5.field110[var6] = var7.method1233((byte) -77);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)I", line = 1963)
    public static final int method92(int arg0, int arg1, int arg2) {
        field176++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else if (arg0 < 29) {
            return 28;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }
}
