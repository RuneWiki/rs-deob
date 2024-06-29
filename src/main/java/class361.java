import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class361 implements class633 {

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "[I")
    public static int[] field5220 = new int[6];

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lqa;ILdda;)V")
    public static final void method2212(class167 arg0, int arg1, class597 arg2) {
        field5225++;
        class610[] var3 = class610.method3547(arg2, class580.field8546, 0);
        class63.field737 = new class116[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class63.field737[var4] = arg0.method961(var3[var4], true);
        }
        class610[] var5 = class610.method3547(arg2, class56.field691, 0);
        class386.field5646 = new class116[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class386.field5646[var6] = arg0.method961(var5[var6], true);
        }
        class610[] var7 = class610.method3547(arg2, class216.field3203, 0);
        class429.field6303 = new class116[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class429.field6303[var8] = arg0.method961(var7[var8], true);
        }
        class610[] var9 = class610.method3547(arg2, class68.field781, 0);
        class341.field4994 = new class116[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class341.field4994[var10] = arg0.method961(var9[var10], true);
        }
        class610[] var11 = class610.method3547(arg2, class103.field1305, 0);
        class191.field2900 = new class116[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class191.field2900[var12] = arg0.method961(var11[var12], true);
        }
        class610[] var13 = class610.method3547(arg2, class586.field8705, 0);
        class445.field6486 = new class116[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class445.field6486[var14] = arg0.method961(var13[var14], true);
        }
        class610[] var15 = class610.method3547(arg2, class105.field1323, 0);
        class128.field1691 = new class116[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class128.field1691[var16] = arg0.method961(var15[var16], true);
        }
        class610[] var17 = class610.method3547(arg2, class636.field9268, 0);
        class3.field34 = new class116[var17.length];
        int var18 = 0;
        int var19 = -126 % ((arg1 - 19) / 59);
        while (var17.length > var18) {
            class3.field34[var18] = arg0.method961(var17[var18], true);
            var18++;
        }
        class610[] var20 = class610.method3547(arg2, class605.field8908, 0);
        class634.field9250 = new class116[var20.length];
        for (int var21 = 0; var21 < var20.length; var21++) {
            class634.field9250[var21] = arg0.method961(var20[var21], true);
        }
        class610[] var22 = class610.method3547(arg2, class346.field5039, 0);
        class319.field4756 = new class116[var22.length];
        for (int var23 = 0; var23 < var22.length; var23++) {
            class319.field4756[var23] = arg0.method961(var22[var23], true);
        }
        class610[] var24 = class610.method3547(arg2, class49.field576, 0);
        class551.field8209 = new class116[var24.length];
        for (int var25 = 0; var25 < var24.length; var25++) {
            class551.field8209[var25] = arg0.method961(var24[var25], true);
        }
        class610[] var26 = class610.method3547(arg2, class161.field2159, 0);
        class372.field5384 = new class116[var26.length];
        for (int var27 = 0; var27 < var26.length; var27++) {
            class372.field5384[var27] = arg0.method961(var26[var27], true);
        }
        class542.field8106 = arg0.method961(class610.method3555(arg2, class549.field8185, 0), true);
        class148.field1920 = arg0.method961(class610.method3555(arg2, class453.field6624, 0), true);
        class610[] var28 = class610.method3547(arg2, class345.field5026, 0);
        class168.field2276 = new class116[var28.length];
        for (int var29 = 0; var29 < var28.length; var29++) {
            class168.field2276[var29] = arg0.method961(var28[var29], true);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static final void method2213(int arg0) {
        field5221++;
        if (arg0 != 65280 || class542.field8109 < 0) {
            return;
        }
        long var1 = class450.method2719((byte) -88);
        class542.field8109 = (int) ((long) class542.field8109 - (var1 - class372.field5382));
        if (class542.field8109 <= 0) {
            class510.field7572 = class249.field3643.field4125;
            class616.field9018 = class249.field3643.field4124;
            class321.field4777 = class249.field3643.field4138;
            class493.field7442 = class249.field3643.field4134;
            class300.field4401 = class249.field3643.field4143;
            class166.field2247 = class249.field3643.field4131;
            class542.field8109 = -1;
            class404.field5804 = class249.field3643.field4140;
            class417.field5995 = class249.field3643.field4135;
            class470.field7211 = class249.field3643.field4129;
            class264.field3901 = class249.field3643.field4137;
        } else {
            int var3 = (class542.field8109 << 8) / class43.field528;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            float var6 = 1.0F - var5;
            class166.field2247 = ((class158.field2039 & 0xFF00FF) * var3 + (class249.field3643.field4131 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class158.field2039 & 0xFF00) * var3 + (class249.field3643.field4131 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class321.field4777 = (class249.field3643.field4138 - class267.field3978) * var6 + class267.field3978;
            class300.field4401 = ((class360.field5218 & 0xFF00) * var3 + ((class249.field3643.field4143 & 0xFF00) * var4) & 0xFF0000) + ((class360.field5218 & 0xFF00FF) * var3 + (class249.field3643.field4143 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class404.field5804 = (class249.field3643.field4140 - class166.field2255) * var6 + class166.field2255;
            class417.field5995 = (class249.field3643.field4135 - class280.field4167) * var6 + class280.field4167;
            class510.field7572 = (class249.field3643.field4125 - class396.field5747) * var6 + class396.field5747;
            class616.field9018 = class336.field4934 * var3 + class249.field3643.field4124 * var4 >> 8;
            class493.field7442 = (class249.field3643.field4134 - class46.field552) * var6 + class46.field552;
            class470.field7211 = (class249.field3643.field4129 - class294.field4316) * var6 + class294.field4316;
            if (class156.field1997 != class249.field3643.field4137) {
                class264.field3901 = class604.field8896.method332(class156.field1997, class249.field3643.field4137, var6, class264.field3901);
            }
        }
        class372.field5382 = var1;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V")
    public static final void method2214(byte arg0) {
        if (arg0 != 24) {
            field5222 = -51;
        }
        field5224++;
        for (class143 var1 = (class143) class603.field8887.method2496((byte) 92); var1 != null; var1 = (class143) class603.field8887.method2494(arg0 ^ 0x22)) {
            class243 var2 = var1.field1859;
            if (var2.field3576) {
                var1.method2997(1);
                var2.method1567(-1601970589);
            } else if (class576.field8505 >= var2.field3561) {
                var2.method1565(class394.field5735, -109);
                if (var2.field3576) {
                    var1.method2997(1);
                } else {
                    class390.method2355(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)Z")
    public static final boolean method2215(int arg0) throws IOException {
        field5219++;
        if (class513.field7606 == null) {
            return false;
        }
        if (class260.field3820 == null) {
            if (class149.field1921) {
                if (!class513.field7606.method1246(1, arg0 - 41737)) {
                    return false;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 91, 1);
                class149.field1921 = false;
                class605.field8905++;
                class285.field4194 = 0;
            }
            class271.field4010.field6221 = 0;
            if (class271.field4010.method2936(-93)) {
                if (!class513.field7606.method1246(1, -25354)) {
                    return false;
                }
                class513.field7606.method1248(1, class271.field4010.field6162, arg0 ^ 0x3FD0, 1);
                class605.field8905++;
                class285.field4194 = 0;
            }
            class149.field1921 = true;
            class586[] var1 = class427.method2546(-98);
            int var2 = class271.field4010.method2931(true);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class271.field4010.field6221);
            }
            class260.field3820 = var1[var2];
            class425.field6072 = class260.field3820.field8710;
        }
        if (class425.field6072 == -1) {
            if (!class513.field7606.method1246(1, arg0 - 41737)) {
                return false;
            }
            class513.field7606.method1248(0, class271.field4010.field6162, 114, 1);
            class285.field4194 = 0;
            class605.field8905++;
            class425.field6072 = class271.field4010.field6162[0] & 0xFF;
        }
        if (class425.field6072 == -2) {
            if (!class513.field7606.method1246(2, -25354)) {
                return false;
            }
            class513.field7606.method1248(0, class271.field4010.field6162, 98, 2);
            class271.field4010.field6221 = 0;
            class425.field6072 = class271.field4010.method2620(72);
            class285.field4194 = 0;
            class605.field8905 += 2;
        }
        if (class425.field6072 > 0) {
            if (!class513.field7606.method1246(class425.field6072, arg0 - 41737)) {
                return false;
            }
            class271.field4010.field6221 = 0;
            class513.field7606.method1248(0, class271.field4010.field6162, 50, class425.field6072);
            class285.field4194 = 0;
            class605.field8905 += class425.field6072;
        }
        class127.field1686 = class135.field1794;
        class135.field1794 = class155.field1984;
        class155.field1984 = class260.field3820;
        if (class327.field4831 == class260.field3820) {
            int var3 = class271.field4010.method2617((byte) -68);
            int var4 = class271.field4010.method2587(11615);
            int var5 = class271.field4010.method2593(false);
            int var6 = class271.field4010.method2589(arg0 ^ 0xFFFFEBAA);
            if (class626.method3656(var4, (byte) -7)) {
                class550.method3222(var5, var6, var3, (byte) -114);
            }
            class260.field3820 = null;
            return true;
        } else if (class269.field3987 == class260.field3820) {
            byte var7 = class271.field4010.method2604(arg0 + 11317);
            int var8 = class271.field4010.method2616(arg0 ^ 0x3F8A);
            int var9 = class271.field4010.method2621(arg0 ^ 0xFFFF8944);
            if (class626.method3656(var8, (byte) -7)) {
                class496.method2995(var9, (byte) 88, var7);
            }
            class260.field3820 = null;
            return true;
        } else if (class278.field4127 == class260.field3820) {
            int var10 = class271.field4010.method2588(-126);
            int var11 = class271.field4010.method2620(18);
            int var12 = class271.field4010.method2561((byte) 107);
            if (class626.method3656(var11, (byte) -7)) {
                class585.method3420(16777215, var12, var10);
            }
            class260.field3820 = null;
            return true;
        } else if (class300.field4395 == class260.field3820) {
            int var13 = class271.field4010.method2616(45);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class271.field4010.method2571(false);
            int var15 = class271.field4010.method2616(50);
            if (class626.method3656(var15, (byte) -7)) {
                class34.method175(var13, var14, 2, -1, (byte) -57);
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class260.field3808) {
            int var16 = class271.field4010.method2620(arg0 - 16300);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var17 = class271.field4010.method2561((byte) 124);
            int var18 = class271.field4010.method2620(99);
            int var19 = class271.field4010.method2561((byte) 121);
            class552.method3234(var18, var19, false, var17, var16);
            class260.field3820 = null;
            return true;
        } else if (class596.field8781 == class260.field3820) {
            int var20 = class271.field4010.method2615(arg0 ^ 0x3F00);
            int var21 = class271.field4010.method2616(arg0 ^ 0x3FD5);
            boolean var22 = (var20 & 0x1) == 1;
            class634.method3684(var22, var21, -30001);
            class546.field8157[class637.method3693(31, class312.field4686++)] = var21;
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class21.field189) {
            class406.method2432(arg0 - 16376, class238.field3476);
            class260.field3820 = null;
            return true;
        } else if (class508.field7553 == class260.field3820) {
            class406.method2432(7, class93.field1153);
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class122.field1571) {
            int var23 = class271.field4010.method2564((byte) 6);
            int var24 = class271.field4010.method2616(88);
            int var25 = class271.field4010.method2616(arg0 ^ 0x3FD8);
            int var26 = class271.field4010.method2574((byte) -73);
            if (class626.method3656(var25, (byte) -7)) {
                class184 var27 = (class184) class600.field8865.method1333((long) var23, false);
                if (var27 != null) {
                    class587.method3424(544, var27.field2796 != var24, var27, false);
                }
                class469.method2858(true, var24, var23, false, var26);
            }
            class260.field3820 = null;
            return true;
        } else if (class518.field7707 == class260.field3820) {
            int var28 = class271.field4010.method2574((byte) -82);
            int var29 = class271.field4010.method2589(arg0 - 27562);
            int var30 = class271.field4010.method2600(113);
            class647.field9388[var30] = var29;
            class482.field7319[var30] = var28;
            class451.field6587[var30] = 1;
            int var31 = class277.field4065[var30] - 1;
            for (int var32 = 0; var32 < var31; var32++) {
                if (var29 >= class351.field5113[var32]) {
                    class451.field6587[var30] = var32 + 2;
                }
            }
            class616.field9016[class637.method3693(class178.field2703++, 31)] = var30;
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class160.field2138) {
            class546.field8158 = class271.field4010.method2574((byte) -124);
            class523.field7748 = class271.field4010.method2615(arg0 - 16128);
            class260.field3820 = null;
            return true;
        } else if (class88.field1127 == class260.field3820) {
            int var33 = class271.field4010.method2620(69);
            if (var33 == 65535) {
                var33 = -1;
            }
            int var34 = class271.field4010.method2561((byte) -58);
            int var35 = class271.field4010.method2620(16);
            int var36 = class271.field4010.method2561((byte) -99);
            class486.method2950(var34, -1, var36, var35, var33);
            class260.field3820 = null;
            return true;
        } else if (class39.field437 == class260.field3820) {
            class260.field3820 = null;
            return false;
        } else if (class604.field8901 == class260.field3820) {
            int var37 = class271.field4010.method2587(11615);
            int var38 = class271.field4010.method2620(33);
            int var39 = class271.field4010.method2588(arg0 - 16480);
            if (class626.method3656(var38, (byte) -7)) {
                class127.method780(var37, var39, arg0 ^ 0xFFFF951E);
            }
            class260.field3820 = null;
            return true;
        } else if (class321.field4778 == class260.field3820) {
            int var40 = class271.field4010.method2561((byte) -103);
            int var41 = var40 >> 2;
            int var42 = var40 & 0x3;
            int var43 = class604.field8894[var41];
            int var44 = class271.field4010.method2587(arg0 ^ 0x12A0);
            if (var44 == 65535) {
                var44 = -1;
            }
            int var45 = class271.field4010.method2564((byte) 6);
            int var46 = (var45 & 0x333F28A8) >> 28;
            int var47 = var45 >> 14 & 0x3FFF;
            int var48 = var45 & 0x3FFF;
            int var49 = var47 - class584.field8677;
            int var50 = var48 - class424.field6061;
            class105.method614(var50, var44, var43, var49, var41, true, var42, var46);
            class260.field3820 = null;
            return true;
        } else if (class317.field4744 == class260.field3820) {
            int var51 = class271.field4010.method2621(-18757);
            if (var51 == 65535) {
                var51 = -1;
            }
            int var52 = class271.field4010.method2571(false);
            int var53 = class271.field4010.method2621(-18757);
            if (class626.method3656(var53, (byte) -7)) {
                class34.method175(var51, var52, 1, -1, (byte) -57);
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class143.field1858) {
            class550.method3221(arg0 - 16383, false);
            class260.field3820 = null;
            return false;
        } else if (class260.field3820 == class10.field82) {
            int var54 = class271.field4010.method2587(11615);
            int var55 = class271.field4010.method2621(-18757);
            int var56 = class271.field4010.method2615(255);
            if (class626.method3656(var54, (byte) -7)) {
                if (var56 == 2) {
                    class412.method2445(111);
                }
                class540.field8007 = var55;
                class267.method1707((byte) -36, var55);
                class558.method3267(false, (byte) 119);
                class330.method2074(class540.field8007);
                for (int var57 = 0; var57 < 100; var57++) {
                    class587.field8718[var57] = true;
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class36.field410 == class260.field3820) {
            class550.method3221(arg0 - 16383, class601.field8873);
            class260.field3820 = null;
            return false;
        } else if (class260.field3820 == class173.field2340) {
            class579.method3382((byte) -108);
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class127.field1683) {
            class103.field1309 = class271.field4010.method2561((byte) 110);
            for (int var58 = 0; var58 < class103.field1309; var58++) {
                class446.field6551[var58] = class271.field4010.method2585(-21);
                class288.field4250[var58] = class271.field4010.method2585(-32);
                if (class288.field4250[var58].equals("")) {
                    class288.field4250[var58] = class446.field6551[var58];
                }
                class461.field6672[var58] = class271.field4010.method2585(116);
                class451.field6589[var58] = class271.field4010.method2585(arg0 - 16265);
                if (class451.field6589[var58].equals("")) {
                    class451.field6589[var58] = class461.field6672[var58];
                }
                class576.field8506[var58] = false;
            }
            class260.field3820 = null;
            class555.field8238 = class73.field858;
            return true;
        } else if (class605.field8917 == class260.field3820) {
            int var59 = class271.field4010.method2616(96);
            int var60 = class271.field4010.method2616(56);
            int var61 = class271.field4010.method2621(-18757);
            if (class626.method3656(var59, (byte) -7)) {
                class272.method1724(var61, 0, true, var60);
            }
            class260.field3820 = null;
            return true;
        } else if (class634.field9253 == class260.field3820) {
            int var62 = class271.field4010.method2620(arg0 ^ 0x3FEF);
            if (class626.method3656(var62, (byte) -7)) {
                class196.method1264((byte) 122);
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class168.field2275) {
            boolean var63 = class271.field4010.method2561((byte) 109) == 1;
            String var64 = class271.field4010.method2585(arg0 ^ 0xFFFFC018);
            String var65 = var64;
            if (var63) {
                var65 = class271.field4010.method2585(-23);
            }
            long var66 = (long) class271.field4010.method2620(16);
            long var68 = (long) class271.field4010.method2601(120);
            int var70 = class271.field4010.method2561((byte) 108);
            long var71 = (var66 << 32) + var68;
            boolean var73 = false;
            int var74 = 0;
            while (true) {
                if (var74 >= 100) {
                    if (var70 <= 1) {
                        if (!(!class506.field7545 || class80.field916) || class163.field2181) {
                            var73 = true;
                        } else if (class14.method64(var65, (byte) -121)) {
                            var73 = true;
                        }
                    }
                    break;
                }
                if (class427.field6138[var74] == var71) {
                    var73 = true;
                    break;
                }
                var74++;
            }
            if (!var73 && class218.field3226 == 0) {
                class427.field6138[class350.field5079] = var71;
                class350.field5079 = (class350.field5079 + 1) % 100;
                String var75 = class358.method2199(class384.method2326(class271.field4010, -57), -61);
                if (var70 == 2) {
                    class588.method3430(0, var75, 67, -1, "<img=1>" + var65, null, 7, "<img=1>" + var64);
                } else if (var70 == 1) {
                    class588.method3430(0, var75, 111, -1, "<img=0>" + var65, null, 7, "<img=0>" + var64);
                } else {
                    class588.method3430(0, var75, 69, -1, var65, null, 3, var64);
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class578.field8513 == class260.field3820) {
            String var76 = class271.field4010.method2585(-111);
            int var77 = class271.field4010.method2620(arg0 - 16300);
            String var78 = class609.field8967.method741(arg0 ^ 0xFFFFCF24, var77).method1928(class271.field4010, 0);
            class588.method3430(0, var78, 26, var77, var76, null, 19, var76);
            class260.field3820 = null;
            return true;
        } else if (class427.field6106 == class260.field3820) {
            int var79 = class271.field4010.method2621(-18757);
            int var80 = class271.field4010.method2621(-18757);
            int var81 = class271.field4010.method2574((byte) -128);
            class234 var82 = (class234) class627.field9185.method1333((long) var80, false);
            if (var82 != null) {
                class576.method3373(var79, var82.field3443, 0, var81);
            }
            class260.field3820 = null;
            return true;
        } else if (class51.field613 == class260.field3820) {
            int var83 = class271.field4010.method2571(false);
            int var84 = class271.field4010.method2588(-84);
            int var85 = class271.field4010.method2587(11615);
            if (class626.method3656(var85, (byte) -7)) {
                class184 var86 = (class184) class600.field8865.method1333((long) var83, false);
                class184 var87 = (class184) class600.field8865.method1333((long) var84, false);
                if (var87 != null) {
                    class587.method3424(544, var86 == null || var86.field2796 != var87.field2796, var87, false);
                }
                if (var86 != null) {
                    var86.method2997(arg0 ^ 0x3FFE);
                    class600.field8865.method1341(var86, (byte) 36, (long) var84);
                }
                class311 var88 = class436.method2659(true, var83);
                if (var88 != null) {
                    class619.method3586(arg0 - 16265, var88);
                }
                class311 var89 = class436.method2659(true, var84);
                if (var89 != null) {
                    class619.method3586(13, var89);
                    class613.method3570(arg0 ^ 0xFFFFA825, var89, true);
                }
                if (class540.field8007 != -1) {
                    class35.method176(1, -75, class540.field8007);
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class218.field3234) {
            boolean var90 = class271.field4010.method2561((byte) -57) == 1;
            byte[] var91 = new byte[class425.field6072 - 1];
            class271.field4010.method2575(28637, class425.field6072 - 1, var91, 0);
            class119.method730(var91, arg0 ^ 0xFFFFD0A7, var90);
            class260.field3820 = null;
            return true;
        } else if (class552.field8217 == class260.field3820) {
            int var92 = class271.field4010.method2620(15);
            int var93 = class271.field4010.method2620(37);
            String var94 = class271.field4010.method2585(arg0 - 16272);
            if (class626.method3656(var92, (byte) -7)) {
                class310.method1903(var93, arg0 - 16383, var94);
            }
            class260.field3820 = null;
            return true;
        } else if (class598.field8829 == class260.field3820) {
            int var95 = class271.field4010.method2620(107);
            int var96 = class271.field4010.method2574((byte) -125);
            int var97 = class271.field4010.method2564((byte) 124);
            int var98 = class271.field4010.method2621(-18757);
            int var99 = class271.field4010.method2587(11615);
            boolean var100 = (var96 & 0x80) != 0;
            if (var97 >> 30 != 0) {
                int var101 = (var97 & 0x3F849B9B) >> 28;
                int var102 = ((var97 & 0xFFFED89) >> 14) - class584.field8677;
                int var103 = (var97 & 0x3FFF) - class424.field6061;
                if (var102 >= 0 && var103 >= 0 && class35.field399 > var102 && var103 < class382.field5586) {
                    int var104 = var102 * 128 + 64;
                    int var105 = var103 * 128 + 64;
                    int var106 = var101;
                    if (var101 < 3 && class300.method1855(var102, var103, arg0 + 6370)) {
                        var106 = var101 + 1;
                    }
                    class243 var107 = new class243(var95, 0, class576.field8505, var101, var106, var104, class226.method1477(var101, true, var104, var105) - var99, var105, var102, var102, var103, var103, var96);
                    class603.field8887.method2492(new class143(var107), (byte) -90);
                }
            } else if (var97 >> 29 != 0) {
                int var108 = var97 & 0xFFFF;
                class234 var109 = (class234) class627.field9185.method1333((long) var108, false);
                if (var109 != null) {
                    if (var95 == 65535) {
                        var95 = -1;
                    }
                    class383 var110 = var109.field3443;
                    boolean var111 = true;
                    int var112 = var100 ? var110.field1035 : var110.field1082;
                    if (var95 != -1 && var112 != -1) {
                        if (var95 == var112) {
                            class465 var113 = class138.field1821.method2251(var95, false);
                            if (var113.field6723 && var113.field6708 != -1) {
                                class224 var114 = class470.field7205.method3498(false, var113.field6708);
                                int var115 = var114.field3301;
                                if (var115 == 0 || var115 == 2) {
                                    var111 = false;
                                } else if (var115 == 1) {
                                    var111 = true;
                                }
                            }
                        } else {
                            class465 var116 = class138.field1821.method2251(var95, false);
                            class465 var117 = class138.field1821.method2251(var112, false);
                            if (var116.field6708 != -1 && var117.field6708 != -1) {
                                class224 var118 = class470.field7205.method3498(false, var116.field6708);
                                class224 var119 = class470.field7205.method3498(false, var117.field6708);
                                if (var119.field3308 > var118.field3308) {
                                    var111 = false;
                                }
                            }
                        }
                    }
                    if (var111) {
                        if (var100) {
                            var110.field1084 = var96 & 0x7;
                            var110.field1086 = 1;
                            var110.field1062 = class576.field8505 + var98;
                            var110.field1013 = 0;
                            var110.field1044 = var99;
                            var110.field1005 = 0;
                            var110.field1035 = var95;
                            if (class576.field8505 < var110.field1062) {
                                var110.field1005 = -1;
                            }
                            if (var110.field1035 != -1 && class576.field8505 == var110.field1062) {
                                int var120 = class138.field1821.method2251(var110.field1035, false).field6708;
                                if (var120 != -1) {
                                    class224 var121 = class470.field7205.method3498(false, var120);
                                    if (var121 != null && var121.field3296 != null) {
                                        class295.method1830(0, var110.field3463, (byte) 111, var110.field3457, var121, false, var110.field3464);
                                    }
                                }
                            }
                        } else {
                            var110.field1054 = var96 & 0x7;
                            var110.field1082 = var95;
                            var110.field1058 = 1;
                            var110.field1023 = 0;
                            var110.field1051 = var99;
                            var110.field1002 = 0;
                            var110.field1036 = class576.field8505 + var98;
                            if (class576.field8505 < var110.field1036) {
                                var110.field1002 = -1;
                            }
                            if (var110.field1082 != -1 && class576.field8505 == var110.field1036) {
                                int var122 = class138.field1821.method2251(var110.field1082, false).field6708;
                                if (var122 != -1) {
                                    class224 var123 = class470.field7205.method3498(false, var122);
                                    if (var123 != null && var123.field3296 != null) {
                                        class295.method1830(0, var110.field3463, (byte) 68, var110.field3457, var123, false, var110.field3464);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ((var97 >> 28) != 0) {
                int var124 = var97 & 0xFFFF;
                class179 var125;
                if (class404.field5807 == var124) {
                    var125 = class239.field3493;
                } else {
                    var125 = class383.field5604[var124];
                }
                if (var125 != null) {
                    if (var95 == 65535) {
                        var95 = -1;
                    }
                    boolean var126 = true;
                    int var127 = var100 ? var125.field1035 : var125.field1082;
                    if (var95 != -1 && var127 != -1) {
                        if (var95 == var127) {
                            class465 var132 = class138.field1821.method2251(var95, false);
                            if (var132.field6723 && var132.field6708 != -1) {
                                class224 var133 = class470.field7205.method3498(false, var132.field6708);
                                int var134 = var133.field3301;
                                if (var134 == 0 || var134 == 2) {
                                    var126 = false;
                                } else if (var134 == 1) {
                                    var126 = true;
                                }
                            }
                        } else {
                            class465 var128 = class138.field1821.method2251(var95, false);
                            class465 var129 = class138.field1821.method2251(var127, false);
                            if (var128.field6708 != -1 && var129.field6708 != -1) {
                                class224 var130 = class470.field7205.method3498(false, var128.field6708);
                                class224 var131 = class470.field7205.method3498(false, var129.field6708);
                                if (var130.field3308 < var131.field3308) {
                                    var126 = false;
                                }
                            }
                        }
                    }
                    if (var126) {
                        if (var100) {
                            var125.field1062 = class576.field8505 + var98;
                            var125.field1044 = var99;
                            var125.field1086 = 1;
                            var125.field1005 = 0;
                            var125.field1084 = var96 & 0x7;
                            var125.field1035 = var95;
                            var125.field1013 = 0;
                            if (var125.field1062 > class576.field8505) {
                                var125.field1005 = -1;
                            }
                            if (var125.field1035 == 65535) {
                                var125.field1035 = -1;
                            }
                            if (var125.field1035 != -1 && class576.field8505 == var125.field1062) {
                                int var137 = class138.field1821.method2251(var125.field1035, false).field6708;
                                if (var137 != -1) {
                                    class224 var138 = class470.field7205.method3498(false, var137);
                                    if (var138 != null && var138.field3296 != null) {
                                        class295.method1830(0, var125.field3463, (byte) 107, var125.field3457, var138, class239.field3493 == var125, var125.field3464);
                                    }
                                }
                            }
                        } else {
                            var125.field1036 = class576.field8505 + var98;
                            var125.field1082 = var95;
                            var125.field1054 = var96 & 0x7;
                            var125.field1051 = var99;
                            var125.field1002 = 0;
                            var125.field1023 = 0;
                            var125.field1058 = 1;
                            if (var125.field1082 == 65535) {
                                var125.field1082 = -1;
                            }
                            if (class576.field8505 < var125.field1036) {
                                var125.field1002 = -1;
                            }
                            if (var125.field1082 != -1 && class576.field8505 == var125.field1036) {
                                int var135 = class138.field1821.method2251(var125.field1082, false).field6708;
                                if (var135 != -1) {
                                    class224 var136 = class470.field7205.method3498(false, var135);
                                    if (var136 != null && var136.field3296 != null) {
                                        class295.method1830(0, var125.field3463, (byte) 101, var125.field3457, var136, class239.field3493 == var125, var125.field3464);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class625.field9162 == class260.field3820) {
            boolean var139 = class271.field4010.method2561((byte) -116) == 1;
            String var140 = class271.field4010.method2585(107);
            String var141 = var140;
            if (var139) {
                var141 = class271.field4010.method2585(arg0 - 16479);
            }
            long var142 = class271.field4010.method2609((byte) -103);
            long var144 = (long) class271.field4010.method2620(126);
            long var146 = (long) class271.field4010.method2601(arg0 ^ 0x3FDC);
            int var148 = class271.field4010.method2561((byte) 108);
            long var149 = (var144 << 32) + var146;
            boolean var151 = false;
            int var152 = 0;
            while (true) {
                if (var152 >= 100) {
                    if (var148 <= 1) {
                        if (!(!class506.field7545 || class80.field916) || class163.field2181) {
                            var151 = true;
                        } else if (class14.method64(var141, (byte) 100)) {
                            var151 = true;
                        }
                    }
                    break;
                }
                if (class427.field6138[var152] == var149) {
                    var151 = true;
                    break;
                }
                var152++;
            }
            if (!var151 && class218.field3226 == 0) {
                class427.field6138[class350.field5079] = var149;
                class350.field5079 = (class350.field5079 + 1) % 100;
                String var153 = class358.method2199(class384.method2326(class271.field4010, -101), -61);
                if (var148 == 2 || var148 == 3) {
                    class588.method3430(0, var153, 92, -1, "<img=1>" + var141, class216.method1392(var142, arg0 - 30312), 9, "<img=1>" + var140);
                } else if (var148 == 1) {
                    class588.method3430(0, var153, 37, -1, "<img=0>" + var141, class216.method1392(var142, -13929), 9, "<img=0>" + var140);
                } else {
                    class588.method3430(0, var153, arg0 ^ 0x3FBD, -1, var141, class216.method1392(var142, -13929), 9, var140);
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class356.field5177 == class260.field3820) {
            int var154 = class271.field4010.method2561((byte) 119);
            if (class271.field4010.method2561((byte) -82) == 0) {
                class425.field6071[var154] = new class256();
            } else {
                class271.field4010.field6221--;
                class425.field6071[var154] = new class256(class271.field4010);
            }
            class371.field5365 = class73.field858;
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class252.field3679) {
            class140.field1844 = class271.field4010.method2615(255);
            class283.field4190 = class271.field4010.method2598(true) << 3;
            class367.field5318 = class271.field4010.method2604(arg0 ^ 0x53CB) << 3;
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class123.field1587) {
            if (class644.field9345 != null) {
                class463.method2748(-1, false, (byte) 125, -1, class94.field1158.field293);
            }
            byte[] var155 = new byte[class425.field6072];
            class271.field4010.method2927(true, 0, var155, class425.field6072);
            String var156 = class66.method405(class425.field6072, 0, var155, 14569);
            class564.method3300(var156, true, class328.field4850, class239.field3499 == 1, (byte) -51);
            class260.field3820 = null;
            return true;
        } else if (class372.field5395 == class260.field3820) {
            class406.method2432(7, class152.field1945);
            class260.field3820 = null;
            return true;
        } else if (class331.field4908 == class260.field3820) {
            class406.method2432(7, class202.field3017);
            class260.field3820 = null;
            return true;
        } else if (class541.field8101 == class260.field3820) {
            int var157 = class271.field4010.method2587(11615);
            byte var158 = class271.field4010.method2604(27700);
            class406.field5823.method655(var158, -91, var157);
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class18.field167) {
            int var159 = class271.field4010.method2564((byte) 90);
            int var160 = class271.field4010.method2589(-11179);
            int var161 = class271.field4010.method2616(17);
            int var162 = class271.field4010.method2621(arg0 ^ 0xFFFF8944);
            if (var162 == 65535) {
                var162 = -1;
            }
            int var163 = class271.field4010.method2621(-18757);
            if (var163 == 65535) {
                var163 = -1;
            }
            if (class626.method3656(var161, (byte) -7)) {
                for (int var164 = var162; var164 <= var163; var164++) {
                    long var165 = ((long) var160 << 32) + ((long) var164);
                    class605 var167 = (class605) class125.field1642.method1333(var165, false);
                    class605 var168;
                    if (var167 != null) {
                        var168 = new class605(var159, var167.field8910);
                        var167.method2997(1);
                    } else if (var164 == -1) {
                        var168 = new class605(var159, class436.method2659(true, var160).field4648.field8910);
                    } else {
                        var168 = new class605(var159, -1);
                    }
                    class125.field1642.method1341(var168, (byte) 48, var165);
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class323.field4801 == class260.field3820) {
            int var169 = class271.field4010.method2620(112);
            int var170 = class271.field4010.method2561((byte) -115);
            int var171 = class271.field4010.method2561((byte) -44);
            int var172 = class271.field4010.method2620(106) << 0;
            int var173 = class271.field4010.method2561((byte) 110);
            int var174 = class271.field4010.method2561((byte) 122);
            if (class626.method3656(var169, (byte) -7)) {
                class190.method1239(var172, true, -103, var170, var173, var174, var171);
            }
            class260.field3820 = null;
            return true;
        } else if (class566.field8406 == class260.field3820) {
            String var175 = class271.field4010.method2585(-126);
            String var176 = class358.method2199(class384.method2326(class271.field4010, -113), -61);
            class549.method3214(59, var176, var175, 0, var175, 6);
            class260.field3820 = null;
            return true;
        } else if (class290.field4261 == class260.field3820) {
            while (class425.field6072 > class271.field4010.field6221) {
                boolean var187 = class271.field4010.method2561((byte) 109) == 1;
                String var188 = class271.field4010.method2585(119);
                String var189 = class271.field4010.method2585(arg0 - 16273);
                int var190 = class271.field4010.method2620(106);
                int var191 = class271.field4010.method2561((byte) -14);
                String var192 = "";
                boolean var193 = false;
                if (var190 > 0) {
                    var192 = class271.field4010.method2585(125);
                    var193 = class271.field4010.method2561((byte) -38) == 1;
                }
                for (int var194 = 0; var194 < class156.field1993; var194++) {
                    if (var187) {
                        if (var189.equals(class417.field5994[var194])) {
                            class417.field5994[var194] = var188;
                            var188 = null;
                            class19.field177[var194] = var189;
                            break;
                        }
                    } else if (var188.equals(class417.field5994[var194])) {
                        if (class526.field7779[var194] != var190) {
                            boolean var195 = true;
                            for (class201 var196 = (class201) class76.field879.method772(0); var196 != null; var196 = (class201) class76.field879.method775(2)) {
                                if (var196.field3011.equals(var188)) {
                                    if (var190 != 0 && var196.field3008 == 0) {
                                        var195 = false;
                                        var196.method736((byte) -126);
                                    } else if (var190 == 0 && var196.field3008 != 0) {
                                        var196.method736((byte) -128);
                                        var195 = false;
                                    }
                                }
                            }
                            if (var195) {
                                class76.field879.method770(-65537, new class201(var188, var190));
                            }
                            class526.field7779[var194] = var190;
                        }
                        class19.field177[var194] = var189;
                        class161.field2158[var194] = var192;
                        class183.field2792[var194] = var191;
                        var188 = null;
                        class528.field7836[var194] = var193;
                        break;
                    }
                }
                if (var188 != null && class156.field1993 < 200) {
                    class417.field5994[class156.field1993] = var188;
                    class19.field177[class156.field1993] = var189;
                    class526.field7779[class156.field1993] = var190;
                    class161.field2158[class156.field1993] = var192;
                    class183.field2792[class156.field1993] = var191;
                    class528.field7836[class156.field1993] = var193;
                    class156.field1993++;
                }
            }
            class555.field8238 = class73.field858;
            class578.field8521 = 2;
            boolean var177 = false;
            int var178 = class156.field1993;
            while (var178 > 0) {
                var178--;
                boolean var179 = true;
                for (int var180 = 0; var180 < var178; var180++) {
                    if (class526.field7779[var180] != class536.field7933.field6633 && class526.field7779[var180 + 1] == class536.field7933.field6633 || class526.field7779[var180] == 0 && class526.field7779[var180 + 1] != 0) {
                        int var181 = class526.field7779[var180];
                        class526.field7779[var180] = class526.field7779[var180 + 1];
                        class526.field7779[var180 + 1] = var181;
                        String var182 = class161.field2158[var180];
                        class161.field2158[var180] = class161.field2158[var180 + 1];
                        class161.field2158[var180 + 1] = var182;
                        String var183 = class417.field5994[var180];
                        class417.field5994[var180] = class417.field5994[var180 + 1];
                        class417.field5994[var180 + 1] = var183;
                        String var184 = class19.field177[var180];
                        class19.field177[var180] = class19.field177[var180 + 1];
                        class19.field177[var180 + 1] = var184;
                        int var185 = class183.field2792[var180];
                        class183.field2792[var180] = class183.field2792[var180 + 1];
                        class183.field2792[var180 + 1] = var185;
                        boolean var186 = class528.field7836[var180];
                        class528.field7836[var180] = class528.field7836[var180 + 1];
                        var179 = false;
                        class528.field7836[var180 + 1] = var186;
                    }
                }
                if (var179) {
                    break;
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class70.field800 == class260.field3820) {
            int var197 = class271.field4010.method2616(arg0 - 16363);
            int var198 = class271.field4010.method2587(arg0 - 4768);
            int var199 = class271.field4010.method2571(false);
            int var200 = class271.field4010.method2620(arg0 - 16295);
            if (class626.method3656(var200, (byte) -7)) {
                class482.method2922(var199, (var198 << 16) + var197, 13);
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class141.field1849) {
            class402.method2411(true, arg0 - 16317);
            class260.field3820 = null;
            return true;
        } else if (class382.field5583 == class260.field3820) {
            class406.method2432(arg0 ^ 0x3FF8, class228.field3355);
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class14.field132) {
            class406.method2432(7, class21.field188);
            class260.field3820 = null;
            return true;
        } else if (class92.field1146 == class260.field3820) {
            class406.method2432(7, class178.field2700);
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class126.field1658) {
            class406.method2432(7, class110.field1396);
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class182.field2790) {
            class406.field5823.method651(true);
            class260.field3820 = null;
            class99.field1240 += 32;
            return true;
        } else if (class260.field3820 == class195.field2941) {
            boolean var201 = class271.field4010.method2561((byte) 115) == 1;
            String var202 = class271.field4010.method2585(106);
            String var203 = var202;
            if (var201) {
                var203 = class271.field4010.method2585(-128);
            }
            int var204 = class271.field4010.method2561((byte) 119);
            int var205 = class271.field4010.method2620(arg0 ^ 0x3F87);
            boolean var206 = false;
            if (var204 <= 1 && class14.method64(var203, (byte) 78)) {
                var206 = true;
            }
            if (!var206 && class218.field3226 == 0) {
                String var207 = class609.field8967.method741(-3877, var205).method1928(class271.field4010, 0);
                if (var204 == 2) {
                    class588.method3430(0, var207, 29, var205, "<img=1>" + var203, null, 25, "<img=1>" + var202);
                } else if (var204 == 1) {
                    class588.method3430(0, var207, 97, var205, "<img=0>" + var203, null, 25, "<img=0>" + var202);
                } else {
                    class588.method3430(0, var207, 108, var205, var203, null, 25, var202);
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class477.field7263 == class260.field3820) {
            int var208 = class271.field4010.method2620(arg0 ^ 0x3F9C);
            int var209 = class271.field4010.method2561((byte) -39);
            int var210 = class271.field4010.method2561((byte) 111);
            int var211 = class271.field4010.method2561((byte) -106);
            int var212 = class271.field4010.method2561((byte) 127);
            int var213 = class271.field4010.method2620(35);
            if (class626.method3656(var208, (byte) -7)) {
                class41.field457[var209] = true;
                class188.field2858[var209] = var210;
                class306.field4466[var209] = var211;
                class293.field4304[var209] = var212;
                class408.field5834[var209] = var213;
            }
            class260.field3820 = null;
            return true;
        } else if (class50.field588 == class260.field3820) {
            int var214 = class271.field4010.method2564((byte) 52);
            int var215 = class271.field4010.method2587(11615);
            if (var215 == 65535) {
                var215 = -1;
            }
            int var216 = class271.field4010.method2616(16);
            if (class626.method3656(var216, (byte) -7)) {
                class133.method814(5, var215, var214);
            }
            class260.field3820 = null;
            return true;
        } else if (class468.field6828 == class260.field3820) {
            if (class540.field8007 != -1) {
                class35.method176(0, -90, class540.field8007);
            }
            class260.field3820 = null;
            return true;
        } else if (class623.field9121 == class260.field3820) {
            class406.method2432(7, class105.field1318);
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class231.field3415) {
            int var217 = class271.field4010.method2620(125);
            int var218 = class271.field4010.method2620(arg0 ^ 0x3FCB);
            int var219 = class271.field4010.method2620(62);
            int var220 = class271.field4010.method2620(118);
            if (class626.method3656(var217, (byte) -7) && class251.field3650[var218] != null) {
                for (int var221 = var219; var221 < var220; var221++) {
                    int var222 = class271.field4010.method2601(82);
                    if (class251.field3650[var218].length > var221 && class251.field3650[var218][var221] != null) {
                        class251.field3650[var218][var221].field4637 = var222;
                    }
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class192.field2902) {
            boolean var223 = class271.field4010.method2561((byte) 124) == 1;
            String var224 = class271.field4010.method2585(-72);
            String var225 = var224;
            if (var223) {
                var225 = class271.field4010.method2585(-56);
            }
            long var226 = (long) class271.field4010.method2620(arg0 ^ 0x3FE5);
            long var228 = (long) class271.field4010.method2601(75);
            int var230 = class271.field4010.method2561((byte) -61);
            int var231 = class271.field4010.method2620(127);
            long var232 = (var226 << 32) + var228;
            boolean var234 = false;
            int var235 = 0;
            while (true) {
                if (var235 >= 100) {
                    if (var230 <= 1 && class14.method64(var225, (byte) -71)) {
                        var234 = true;
                    }
                    break;
                }
                if (class427.field6138[var235] == var232) {
                    var234 = true;
                    break;
                }
                var235++;
            }
            if (!var234 && class218.field3226 == 0) {
                class427.field6138[class350.field5079] = var232;
                class350.field5079 = (class350.field5079 + 1) % 100;
                String var236 = class609.field8967.method741(-3877, var231).method1928(class271.field4010, 0);
                if (var230 == 2) {
                    class588.method3430(0, var236, 83, var231, "<img=1>" + var225, null, 18, "<img=1>" + var224);
                } else if (var230 == 1) {
                    class588.method3430(0, var236, 24, var231, "<img=0>" + var225, null, 18, "<img=0>" + var224);
                } else {
                    class588.method3430(0, var236, 43, var231, var225, null, 18, var224);
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class223.field3274) {
            class632.method3678(class271.field4010, class328.field4850, false, class425.field6072);
            class260.field3820 = null;
            return true;
        } else if (class420.field6033 == class260.field3820) {
            class406.method2432(arg0 - 16376, class277.field4104);
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class257.field3760) {
            boolean var237 = class271.field4010.method2561((byte) 126) == 1;
            String var238 = class271.field4010.method2585(arg0 ^ 0x3F8D);
            String var239 = var238;
            if (var237) {
                var239 = class271.field4010.method2585(arg0 - 16440);
            }
            long var240 = class271.field4010.method2609((byte) -103);
            long var242 = (long) class271.field4010.method2620(126);
            long var244 = (long) class271.field4010.method2601(arg0 - 16351);
            int var246 = class271.field4010.method2561((byte) 117);
            int var247 = class271.field4010.method2620(arg0 ^ 0x3FAE);
            long var248 = (var242 << 32) + var244;
            boolean var250 = false;
            int var251 = 0;
            while (true) {
                if (var251 >= 100) {
                    if (var246 <= 1 && class14.method64(var239, (byte) -14)) {
                        var250 = true;
                    }
                    break;
                }
                if (class427.field6138[var251] == var248) {
                    var250 = true;
                    break;
                }
                var251++;
            }
            if (!var250 && class218.field3226 == 0) {
                class427.field6138[class350.field5079] = var248;
                class350.field5079 = (class350.field5079 + 1) % 100;
                String var252 = class609.field8967.method741(-3877, var247).method1928(class271.field4010, 0);
                if (var246 == 2) {
                    class588.method3430(0, var252, 62, var247, "<img=1>" + var239, class216.method1392(var240, -13929), 20, "<img=1>" + var238);
                } else if (var246 == 1) {
                    class588.method3430(0, var252, 50, var247, "<img=0>" + var239, class216.method1392(var240, -13929), 20, "<img=0>" + var238);
                } else {
                    class588.method3430(0, var252, 30, var247, var239, class216.method1392(var240, -13929), 20, var238);
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class76.field884 == class260.field3820) {
            int var253 = class271.field4010.method2571(false);
            int var254 = class271.field4010.method2616(arg0 ^ 0x3F94);
            if (class626.method3656(var254, (byte) -7)) {
                class34.method175(class404.field5807, var253, 5, 0, (byte) -57);
            }
            class260.field3820 = null;
            return true;
        } else if (class591.field8738 == class260.field3820) {
            int var255 = class271.field4010.method2615(255);
            int var256 = class271.field4010.method2621(-18757);
            if (var256 == 65535) {
                var256 = -1;
            }
            String var257 = class271.field4010.method2585(-55);
            int var258 = class271.field4010.method2574((byte) -41);
            if (var255 >= 1 && var255 <= 8) {
                if (var257.equalsIgnoreCase("null")) {
                    var257 = null;
                }
                class88.field1129[var255 - 1] = var257;
                class383.field5600[var255 - 1] = var256;
                class535.field7921[var255 - 1] = var258 == 0;
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class163.field2175) {
            class567.method3312(false, class271.field4010.method2585(125));
            class260.field3820 = null;
            return true;
        } else if (class339.field4969 == class260.field3820) {
            int var259 = class271.field4010.method2620(45);
            if (class626.method3656(var259, (byte) -7)) {
                class370.method2257(-106);
            }
            class260.field3820 = null;
            return true;
        } else if (class593.field8761 == class260.field3820) {
            int var260 = class271.field4010.method2573(-14319);
            int var261 = class271.field4010.method2589(-11179);
            int var262 = class271.field4010.method2561((byte) -73);
            String var263 = "";
            String var264 = var263;
            if ((var262 & 0x1) != 0) {
                var263 = class271.field4010.method2585(arg0 - 16269);
                if ((var262 & 0x2) == 0) {
                    var264 = var263;
                } else {
                    var264 = class271.field4010.method2585(110);
                }
            }
            String var265 = class271.field4010.method2585(120);
            if (var260 == 99) {
                class492.method2982(var265, (byte) 103);
            } else if (var264.equals("") || !class14.method64(var264, (byte) 72)) {
                class549.method3214(102, var265, var263, var261, var264, var260);
            } else {
                class260.field3820 = null;
                return true;
            }
            class260.field3820 = null;
            return true;
        } else if (class611.field8984 == class260.field3820) {
            int var266 = class271.field4010.method2615(255);
            int var267 = class271.field4010.method2600(127);
            int var268 = class271.field4010.method2621(arg0 ^ 0xFFFF8944);
            if (var268 == 65535) {
                var268 = -1;
            }
            class345.method2124(var267, var268, (byte) -30, var266);
            class260.field3820 = null;
            return true;
        } else if (class616.field9017 == class260.field3820) {
            int var269 = class271.field4010.method2620(84);
            if (var269 == 65535) {
                var269 = -1;
            }
            int var270 = class271.field4010.method2601(96);
            int var271 = class271.field4010.method2561((byte) 110);
            class296.method1834(var271, var270, var269, (byte) -9);
            class260.field3820 = null;
            return true;
        } else if (class62.field726 == class260.field3820) {
            class435.field6386 = class73.field858;
            if (class425.field6072 == 0) {
                class127.field1684 = 0;
                class133.field1767 = null;
                class479.field7268 = null;
                class625.field9168 = null;
                class260.field3820 = null;
                return true;
            }
            class479.field7268 = class271.field4010.method2585(126);
            boolean var272 = class271.field4010.method2561((byte) 119) == 1;
            if (var272) {
                class271.field4010.method2585(-17);
            }
            long var273 = class271.field4010.method2609((byte) -103);
            class133.field1767 = class368.method2245(var273, 20296);
            class519.field7715 = class271.field4010.method2570((byte) 57);
            int var275 = class271.field4010.method2561((byte) 112);
            if (var275 == 255) {
                class260.field3820 = null;
                return true;
            }
            class127.field1684 = var275;
            class562[] var276 = new class562[100];
            for (int var277 = 0; var277 < class127.field1684; var277++) {
                var276[var277] = new class562();
                var276[var277].field8336 = class271.field4010.method2585(-70);
                boolean var283 = class271.field4010.method2561((byte) -46) == 1;
                if (var283) {
                    var276[var277].field8333 = class271.field4010.method2585(118);
                } else {
                    var276[var277].field8333 = var276[var277].field8336;
                }
                var276[var277].field8332 = class436.method2679(var276[var277].field8333, -1);
                var276[var277].field8338 = class271.field4010.method2620(55);
                var276[var277].field8340 = class271.field4010.method2570((byte) 57);
                var276[var277].field8339 = class271.field4010.method2585(-74);
                if (var276[var277].field8333.equals(class239.field3493.field2718)) {
                    class159.field2122 = var276[var277].field8340;
                }
            }
            boolean var278 = false;
            int var279 = class127.field1684;
            while (var279 > 0) {
                boolean var280 = true;
                var279--;
                for (int var281 = 0; var281 < var279; var281++) {
                    if (var276[var281].field8332.compareTo(var276[var281 + 1].field8332) > 0) {
                        class562 var282 = var276[var281];
                        var276[var281] = var276[var281 + 1];
                        var276[var281 + 1] = var282;
                        var280 = false;
                    }
                }
                if (var280) {
                    break;
                }
            }
            class625.field9168 = var276;
            class260.field3820 = null;
            return true;
        } else if (class31.field309 == class260.field3820) {
            int var284 = class271.field4010.method2574((byte) 120);
            int var285 = class271.field4010.method2620(21);
            class406.field5823.method658(var285, var284, -1);
            class260.field3820 = null;
            return true;
        } else if (class99.field1232 == class260.field3820) {
            int var286 = class271.field4010.method2621(-18757);
            int var287 = class271.field4010.method2587(11615);
            int var288 = class271.field4010.method2616(106);
            int var289 = class271.field4010.method2571(false);
            int var290 = class271.field4010.method2616(96);
            if (class626.method3656(var287, (byte) -7)) {
                class34.method175(var290 << 16 | var286, var289, 7, var288, (byte) -57);
            }
            class260.field3820 = null;
            return true;
        } else if (class537.field7951 == class260.field3820) {
            int var291 = class271.field4010.method2620(15);
            int var292 = class271.field4010.method2589(-11179);
            if (class626.method3656(var291, (byte) -7)) {
                class184 var293 = (class184) class600.field8865.method1333((long) var292, false);
                if (var293 != null) {
                    class587.method3424(544, true, var293, false);
                }
                if (class135.field1798 != null) {
                    class619.method3586(123, class135.field1798);
                    class135.field1798 = null;
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class605.field8915 == class260.field3820) {
            class406.method2432(7, class200.field2995);
            class260.field3820 = null;
            return true;
        } else if (client.field9083 == class260.field3820) {
            int var294 = class271.field4010.method2620(72);
            int var295 = class271.field4010.method2561((byte) 108);
            boolean var296 = (var295 & 0x1) == 1;
            class619.method3583(var296, var294, (byte) -87);
            int var297 = class271.field4010.method2620(106);
            for (int var298 = 0; var298 < var297; var298++) {
                int var299 = class271.field4010.method2574((byte) -88);
                if (var299 == 255) {
                    var299 = class271.field4010.method2564((byte) 3);
                }
                int var300 = class271.field4010.method2620(arg0 - 16299);
                class221.method1456(var299, var298, (byte) 118, var294, var296, var300 - 1);
            }
            class546.field8157[class637.method3693(class312.field4686++, 31)] = var294;
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class235.field3453) {
            class367.field5318 = class271.field4010.method2598(true) << 3;
            class283.field4190 = class271.field4010.method2598(true) << 3;
            class140.field1844 = class271.field4010.method2574((byte) 97);
            for (class368 var301 = (class368) class546.field8147.method1331(arg0 - 18308); var301 != null; var301 = (class368) class546.field8147.method1340((byte) -66)) {
                int var303 = (int) (var301.field7465 >> 28 & 0x3L);
                int var304 = (int) (var301.field7465 & 0x3FFFL);
                int var305 = var304 - class584.field8677;
                int var306 = (int) (var301.field7465 >> 14 & 0x3FFFL);
                int var307 = var306 - class424.field6061;
                if (class140.field1844 == var303 && var305 >= class367.field5318 && (class367.field5318 + 8) > var305 && class283.field4190 <= var307 && class283.field4190 + 8 > var307) {
                    var301.method2997(1);
                    if (var305 >= 0 && var307 >= 0 && var305 < class35.field399 && class382.field5586 > var307) {
                        class229.method1496(arg0 - 16458, var305, class140.field1844, var307);
                    }
                }
            }
            for (class537 var302 = (class537) class178.field2698.method2496((byte) -123); var302 != null; var302 = (class537) class178.field2698.method2494(123)) {
                if (class367.field5318 <= var302.field7940 && class367.field5318 + 8 > var302.field7940 && var302.field7948 >= class283.field4190 && var302.field7948 < class283.field4190 + 8 && class140.field1844 == var302.field7941) {
                    var302.field7938 = 0;
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class451.field6586 == class260.field3820) {
            int var308 = class271.field4010.method2587(11615);
            int var309 = class271.field4010.method2621(-18757);
            int var310 = class271.field4010.method2589(-11179);
            if (class626.method3656(var308, (byte) -7)) {
                class507.method3035(false, var310, var309);
            }
            class260.field3820 = null;
            return true;
        } else if (class99.field1252 == class260.field3820) {
            class549.field8189 = class425.field6072 > 2 ? class271.field4010.method2585(arg0 - 16453) : class264.field3921.method2953(3181, class77.field889);
            class630.field9219 = class425.field6072 > 0 ? class271.field4010.method2620(102) : -1;
            if (class630.field9219 == 65535) {
                class630.field9219 = -1;
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class125.field1643) {
            int var311 = class271.field4010.method2587(11615);
            int var312 = class271.field4010.method2564((byte) 55);
            String var313 = class271.field4010.method2585(-54);
            if (class626.method3656(var311, (byte) -7)) {
                class535.method3147(var313, var312, (byte) -107);
            }
            class260.field3820 = null;
            return true;
        } else if (class328.field4836 == class260.field3820) {
            class578.method3379(true);
            class260.field3820 = null;
            return false;
        } else if (class561.field8319 == class260.field3820) {
            class406.method2432(7, class287.field4228);
            class260.field3820 = null;
            return true;
        } else if (class620.field9042 == class260.field3820) {
            int var314 = class271.field4010.method2622((byte) 127);
            int var315 = class271.field4010.method2588(-83);
            int var316 = class271.field4010.method2620(77);
            if (class626.method3656(var316, (byte) -7)) {
                class371.method2265(var314, var315, true);
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class167.field2259) {
            int var317 = class271.field4010.method2574((byte) -49);
            int var318 = class271.field4010.method2615(255);
            if (var317 == 255) {
                var318 = -1;
                var317 = -1;
            }
            class157.method909(true, var318, var317);
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class231.field3423) {
            int var319 = class271.field4010.method2616(82);
            if (var319 == 65535) {
                var319 = -1;
            }
            int var320 = class271.field4010.method2620(57);
            int var321 = class271.field4010.method2621(-18757);
            int var322 = class271.field4010.method2621(-18757);
            if (var322 == 65535) {
                var322 = -1;
            }
            int var323 = class271.field4010.method2589(arg0 ^ 0xFFFFEBAA);
            if (class626.method3656(var321, (byte) -7)) {
                for (int var324 = var319; var324 <= var322; var324++) {
                    long var325 = ((long) var323 << 32) + (long) var324;
                    class605 var327 = (class605) class125.field1642.method1333(var325, false);
                    class605 var328;
                    if (var327 != null) {
                        var328 = new class605(var327.field8904, var320);
                        var327.method2997(arg0 ^ 0x3FFE);
                    } else if (var324 == -1) {
                        var328 = new class605(class436.method2659(true, var323).field4648.field8904, var320);
                    } else {
                        var328 = new class605(0, var320);
                    }
                    class125.field1642.method1341(var328, (byte) -93, var325);
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class541.field8097 == class260.field3820) {
            class406.method2432(7, class19.field169);
            class260.field3820 = null;
            return true;
        } else if (class550.field8198 == class260.field3820) {
            class174.field2526 = class271.field4010.method2561((byte) -24);
            class260.field3820 = null;
            class151.field1944 = class73.field858;
            return true;
        } else if (class260.field3820 == class121.field1565) {
            class201.method1301((byte) -91);
            class260.field3820 = null;
            return false;
        } else if (class39.field442 == class260.field3820) {
            boolean var329 = class271.field4010.method2561((byte) -81) == 1;
            String var330 = class271.field4010.method2585(116);
            String var331 = var330;
            if (var329) {
                var331 = class271.field4010.method2585(arg0 - 16265);
            }
            int var332 = class271.field4010.method2561((byte) 125);
            boolean var333 = false;
            if (var332 <= 1) {
                if (!(!class506.field7545 || class80.field916) || class163.field2181) {
                    var333 = true;
                } else if (var332 <= 1 && class14.method64(var331, (byte) 93)) {
                    var333 = true;
                }
            }
            if (!var333 && class218.field3226 == 0) {
                String var334 = class358.method2199(class384.method2326(class271.field4010, -69), -61);
                if (var332 == 2) {
                    class588.method3430(0, var334, 74, -1, "<img=1>" + var331, null, 24, "<img=1>" + var330);
                } else if (var332 == 1) {
                    class588.method3430(0, var334, arg0 ^ 0x3FB0, -1, "<img=0>" + var331, null, 24, "<img=0>" + var330);
                } else {
                    class588.method3430(0, var334, 83, -1, var331, null, 24, var330);
                }
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class195.field2937) {
            int var335 = class271.field4010.method2621(arg0 - 35140);
            int var336 = class271.field4010.method2589(-11179);
            class406.field5823.method658(var335, var336, -1);
            class260.field3820 = null;
            return true;
        } else if (class377.field5547 == class260.field3820) {
            int var337 = class271.field4010.method2561((byte) 111);
            int var338 = var337 >> 5;
            int var339 = var337 & 0x1F;
            if (var339 == 0) {
                class255.field3737[var338] = null;
                class260.field3820 = null;
                return true;
            }
            class67 var340 = new class67();
            var340.field769 = var339;
            var340.field767 = class271.field4010.method2561((byte) -121);
            if (var340.field767 >= 0 && class445.field6486.length > var340.field767) {
                if (var340.field769 == 1 || var340.field769 == 10) {
                    var340.field776 = class271.field4010.method2620(42);
                    class271.field4010.field6221 += 6;
                } else if (var340.field769 >= 2 && var340.field769 <= 6) {
                    if (var340.field769 == 2) {
                        var340.field764 = 64;
                        var340.field766 = 64;
                    }
                    if (var340.field769 == 3) {
                        var340.field766 = 0;
                        var340.field764 = 64;
                    }
                    if (var340.field769 == 4) {
                        var340.field764 = 64;
                        var340.field766 = 128;
                    }
                    if (var340.field769 == 5) {
                        var340.field766 = 64;
                        var340.field764 = 0;
                    }
                    if (var340.field769 == 6) {
                        var340.field766 = 64;
                        var340.field764 = 128;
                    }
                    var340.field769 = 2;
                    var340.field768 = class271.field4010.method2561((byte) -28);
                    var340.field766 += class271.field4010.method2620(19) - class584.field8677 << 7;
                    var340.field764 += class271.field4010.method2620(23) - class424.field6061 << 7;
                    var340.field765 = class271.field4010.method2561((byte) 124) << 0;
                    var340.field774 = class271.field4010.method2620(87);
                }
                var340.field773 = class271.field4010.method2620(arg0 - 16368);
                if (var340.field773 == 65535) {
                    var340.field773 = -1;
                }
                class255.field3737[var338] = var340;
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class154.field1978) {
            if (class242.method1563((byte) 127, class192.field2903)) {
                class223.field3280 = (int) ((float) class271.field4010.method2620(60) * 2.5F);
            } else {
                class223.field3280 = class271.field4010.method2620(94) * 30;
            }
            class260.field3820 = null;
            class151.field1944 = class73.field858;
            return true;
        } else if (class546.field8154 == class260.field3820) {
            int var341 = class271.field4010.method2564((byte) 120);
            int var342 = class271.field4010.method2616(29);
            if (class626.method3656(var342, (byte) -7)) {
                class34.method175(-1, var341, 3, -1, (byte) -57);
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class114.field1461) {
            class283.field4190 = class271.field4010.method2626(-128) << 3;
            class140.field1844 = class271.field4010.method2600(-91);
            class367.field5318 = class271.field4010.method2598(true) << 3;
            while (class425.field6072 > class271.field4010.field6221) {
                class22 var343 = class464.method2753((byte) -88)[class271.field4010.method2561((byte) 110)];
                class406.method2432(arg0 - 16376, var343);
            }
            class260.field3820 = null;
            return true;
        } else if (class477.field7266 == class260.field3820) {
            class529.field7847 = class271.field4010.method2561((byte) 125);
            class260.field3820 = null;
            return true;
        } else if (class277.field4067 == class260.field3820) {
            class402.method2411(false, 92);
            class260.field3820 = null;
            return true;
        } else if (class362.field5232 == class260.field3820) {
            int var344 = class271.field4010.method2561((byte) 119);
            boolean var345 = (var344 & 0x1) == 1;
            String var346 = class271.field4010.method2585(-39);
            String var347 = class271.field4010.method2585(arg0 ^ 0xFFFFC051);
            if (var347.equals("")) {
                var347 = var346;
            }
            String var348 = class271.field4010.method2585(106);
            String var349 = class271.field4010.method2585(arg0 - 16437);
            if (var349.equals("")) {
                var349 = var348;
            }
            if (var345) {
                for (int var350 = 0; var350 < class103.field1309; var350++) {
                    if (class288.field4250[var350].equals(var349)) {
                        class446.field6551[var350] = var346;
                        class288.field4250[var350] = var347;
                        class461.field6672[var350] = var348;
                        class451.field6589[var350] = var349;
                        break;
                    }
                }
            } else {
                class446.field6551[class103.field1309] = var346;
                class288.field4250[class103.field1309] = var347;
                class461.field6672[class103.field1309] = var348;
                class451.field6589[class103.field1309] = var349;
                class576.field8506[class103.field1309] = class637.method3693(var344, 2) == 2;
                class103.field1309++;
            }
            class260.field3820 = null;
            class555.field8238 = class73.field858;
            return true;
        } else if (class56.field689 == class260.field3820) {
            class630.field9215 = class463.method2750(class271.field4010.method2561((byte) 117), -100);
            class260.field3820 = null;
            return true;
        } else if (class556.field8253 == class260.field3820) {
            int var351 = class271.field4010.method2620(arg0 - 16284);
            int var352 = class271.field4010.method2571(false);
            int var353 = class271.field4010.method2621(-18757);
            if (class626.method3656(var353, (byte) -7)) {
                class288.method1792(12, var351, var352);
            }
            class260.field3820 = null;
            return true;
        } else if (class646.field9377 == class260.field3820) {
            int var354 = class271.field4010.method2620(48);
            if (var354 == 65535) {
                var354 = -1;
            }
            int var355 = class271.field4010.method2616(89);
            int var356 = class271.field4010.method2589(arg0 ^ 0xFFFFEBAA);
            int var357 = class271.field4010.method2589(-11179);
            if (class626.method3656(var355, (byte) -7)) {
                class321.method2013(var356, var354, var357, arg0 - 16365);
                class414 var358 = class216.field3204.method3357(var354, (byte) -95);
                class277.method1748(-27894, var358.field5943, var357, var358.field5967, var358.field5950);
                class362.method2218(var358.field5912, arg0 ^ 0xFFFFC07F, var358.field5940, var358.field5938, var357);
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class202.field3020) {
            String var359 = class271.field4010.method2585(-62);
            boolean var360 = class271.field4010.method2561((byte) 115) == 1;
            String var361;
            if (var360) {
                var361 = class271.field4010.method2585(126);
            } else {
                var361 = var359;
            }
            int var362 = class271.field4010.method2620(68);
            byte var363 = class271.field4010.method2570((byte) 57);
            boolean var364 = false;
            if (var363 == -128) {
                var364 = true;
            }
            if (var364) {
                if (class127.field1684 == 0) {
                    class260.field3820 = null;
                    return true;
                }
                boolean var370 = false;
                int var371;
                for (var371 = 0; class127.field1684 > var371 && (!class625.field9168[var371].field8333.equals(var361) || class625.field9168[var371].field8338 != var362); var371++) {
                }
                if (class127.field1684 > var371) {
                    while (class127.field1684 - 1 > var371) {
                        class625.field9168[var371] = class625.field9168[var371 + 1];
                        var371++;
                    }
                    class127.field1684--;
                    class625.field9168[class127.field1684] = null;
                }
            } else {
                String var365 = class271.field4010.method2585(arg0 ^ 0xFFFFC066);
                class562 var366 = new class562();
                var366.field8336 = var359;
                var366.field8333 = var361;
                var366.field8332 = class436.method2679(var366.field8333, -1);
                var366.field8340 = var363;
                var366.field8339 = var365;
                var366.field8338 = var362;
                int var367;
                for (var367 = class127.field1684 - 1; var367 >= 0; var367--) {
                    int var368 = class625.field9168[var367].field8332.compareTo(var366.field8332);
                    if (var368 == 0) {
                        class625.field9168[var367].field8338 = var362;
                        class625.field9168[var367].field8340 = var363;
                        class625.field9168[var367].field8339 = var365;
                        if (var361.equals(class239.field3493.field2718)) {
                            class159.field2122 = var363;
                        }
                        class260.field3820 = null;
                        class435.field6386 = class73.field858;
                        return true;
                    }
                    if (var368 < 0) {
                        break;
                    }
                }
                if (class625.field9168.length <= class127.field1684) {
                    class260.field3820 = null;
                    return true;
                }
                for (int var369 = class127.field1684 - 1; var369 > var367; var369--) {
                    class625.field9168[var369 + 1] = class625.field9168[var369];
                }
                if (class127.field1684 == 0) {
                    class625.field9168 = new class562[100];
                }
                class625.field9168[var367 + 1] = var366;
                class127.field1684++;
                if (var361.equals(class239.field3493.field2718)) {
                    class159.field2122 = var363;
                }
            }
            class260.field3820 = null;
            class435.field6386 = class73.field858;
            return true;
        } else if (class487.field7376 == class260.field3820) {
            int var372 = class271.field4010.method2620(arg0 ^ 0x3FBC);
            int var373 = class271.field4010.method2561((byte) 122);
            boolean var374 = (var373 & 0x1) == 1;
            while (class271.field4010.field6221 < class425.field6072) {
                int var375 = class271.field4010.method2573(-14319);
                int var376 = class271.field4010.method2620(84);
                int var377 = 0;
                if (var376 != 0) {
                    var377 = class271.field4010.method2561((byte) -86);
                    if (var377 == 255) {
                        var377 = class271.field4010.method2589(-11179);
                    }
                }
                class221.method1456(var377, var375, (byte) 87, var372, var374, var376 - 1);
            }
            class546.field8157[class637.method3693(31, class312.field4686++)] = var372;
            class260.field3820 = null;
            return true;
        } else if (class586.field8707 == class260.field3820) {
            int var378 = class271.field4010.method2620(44);
            String var379 = class271.field4010.method2585(-41);
            Object[] var380 = new Object[var379.length() + 1];
            for (int var381 = var379.length() - 1; var381 >= 0; var381--) {
                if (var379.charAt(var381) == 's') {
                    var380[var381 + 1] = class271.field4010.method2585(119);
                } else {
                    var380[var381 + 1] = Integer.valueOf(class271.field4010.method2589(-11179));
                }
            }
            var380[0] = Integer.valueOf(class271.field4010.method2589(-11179));
            if (class626.method3656(var378, (byte) -7)) {
                class355 var382 = new class355();
                var382.field5160 = var380;
                class330.method2072(var382);
            }
            class260.field3820 = null;
            return true;
        } else if (class380.field5564 == class260.field3820) {
            int var383 = class271.field4010.method2620(20);
            int var384 = class271.field4010.method2589(arg0 - 27562);
            class406.field5823.method655(var384, arg0 - 16479, var383);
            class260.field3820 = null;
            return true;
        } else if (class519.field7714 == class260.field3820) {
            class561.field8324 = class271.field4010.method2622((byte) 125);
            class151.field1944 = class73.field858;
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class124.field1603) {
            int var385 = class271.field4010.method2620(42);
            int var386 = class271.field4010.method2561((byte) 113);
            int var387 = class271.field4010.method2561((byte) 109);
            int var388 = class271.field4010.method2620(112) << 0;
            int var389 = class271.field4010.method2561((byte) 115);
            int var390 = class271.field4010.method2561((byte) 122);
            if (class626.method3656(var385, (byte) -7)) {
                class445.method2704(var388, var387, var390, 7, var389, var386);
            }
            class260.field3820 = null;
            return true;
        } else if (class69.field786 == class260.field3820) {
            int var391 = class271.field4010.method2621(-18757);
            int var392 = class271.field4010.method2616(arg0 ^ 0x3FDD);
            int var393 = class271.field4010.method2564((byte) 5);
            if (class626.method3656(var391, (byte) -7)) {
                class496.method2995(var392, (byte) 88, var393);
            }
            class260.field3820 = null;
            return true;
        } else if (class575.field8486 == class260.field3820) {
            class260.field3820 = null;
            class578.field8521 = 1;
            class555.field8238 = class73.field858;
            return true;
        } else if (class433.field6346 == class260.field3820) {
            for (int var394 = 0; var394 < class383.field5604.length; var394++) {
                if (class383.field5604[var394] != null) {
                    class383.field5604[var394].field1024 = -1;
                }
            }
            for (int var395 = 0; var395 < class350.field5086; var395++) {
                class579.field8530[var395].field3443.field1024 = -1;
            }
            class260.field3820 = null;
            return true;
        } else if (class43.field520 == class260.field3820) {
            class271.field4010.field6221 += 28;
            if (class271.field4010.method2562(-71)) {
                class543.method3191(arg0 ^ 0x3FFF, class271.field4010.field6221 - 28, class271.field4010);
            }
            class260.field3820 = null;
            return true;
        } else if (class632.field9237 == class260.field3820) {
            int var396 = class271.field4010.method2621(arg0 ^ 0xFFFF8944);
            int var397 = class271.field4010.method2616(108);
            int var398 = class271.field4010.method2564((byte) 14);
            int var399 = class271.field4010.method2621(arg0 ^ 0xFFFF8944);
            int var400 = class271.field4010.method2621(arg0 - 35140);
            if (class626.method3656(var396, (byte) -7)) {
                class277.method1748(arg0 ^ 0xFFFFACF5, var400, var398, var397, var399);
            }
            class260.field3820 = null;
            return true;
        } else if (class260.field3820 == class22.field198) {
            int var401 = class271.field4010.method2589(arg0 - 27562);
            class50.field597 = class328.field4850.method2169(var401, 116);
            class260.field3820 = null;
            return true;
        } else if (class518.field7694 == class260.field3820) {
            int var402 = class271.field4010.method2564((byte) 45);
            int var403 = class271.field4010.method2620(62);
            int var404 = class271.field4010.method2589(-11179);
            int var405 = class271.field4010.method2616(38);
            if (class626.method3656(var405, (byte) -7)) {
                class34.method175(var403, var402, 5, var404, (byte) -57);
            }
            class260.field3820 = null;
            return true;
        } else if (class578.field8519 == class260.field3820) {
            class406.method2432(7, class159.field2123);
            class260.field3820 = null;
            return true;
        } else if (class643.field9331 == class260.field3820) {
            class55.method362(0, class425.field6072, class271.field4010);
            class260.field3820 = null;
            return true;
        } else if (class392.field5712 == class260.field3820) {
            class406.method2432(7, class238.field3482);
            class260.field3820 = null;
            return true;
        } else if (class554.field8231 == class260.field3820) {
            int var406 = class271.field4010.method2621(-18757);
            int var407 = class271.field4010.method2615(255);
            if (class626.method3656(var406, (byte) -7)) {
                class3.field14 = var407;
            }
            class260.field3820 = null;
            return true;
        } else if (class587.field8716 == class260.field3820) {
            String var408 = class271.field4010.method2585(-68);
            int var409 = class271.field4010.method2616(58);
            int var410 = class271.field4010.method2587(arg0 - 4768);
            if (class626.method3656(var409, (byte) -7)) {
                class310.method1903(var410, 0, var408);
            }
            class260.field3820 = null;
            return true;
        } else if (class604.field8899 == class260.field3820) {
            class252.field3689 = class271.field4010.method2607(105);
            class506.field7545 = class271.field4010.method2561((byte) 124) == 1;
            class260.field3820 = null;
            return true;
        } else {
            class31.method140("T1 - " + (class260.field3820 == null ? -1 : class260.field3820.method3421(arg0 + 12505)) + "," + (class135.field1794 == null ? -1 : class135.field1794.method3421(28888)) + "," + (class127.field1686 == null ? -1 : class127.field1686.method3421(arg0 + 12505)) + " - " + class425.field6072, arg0 - 16498, null);
            class550.method3221(arg0 ^ arg0, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
    public static void method2216(int arg0) {
        field5220 = null;
        int var1 = 79 / ((-arg0 - 45) / 35);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lrb;B[IJ)Ljava/lang/String;")
    public final String method2217(class352 arg0, byte arg1, int[] arg2, long arg3) {
        if (arg1 >= -62) {
            field5222 = -105;
        }
        field5223++;
        if (class410.field5855 == arg0) {
            class308 var6 = class458.field6651.method3577(arg2[0], -27079);
            return var6.method1888((int) arg3, -84);
        } else if (class196.field2961 == arg0 || class459.field6655 == arg0) {
            class414 var7 = class216.field3204.method3357((int) arg3, (byte) -78);
            return var7.field5900;
        } else if (class425.field6067 == arg0 || class632.field9235 == arg0 || class637.field9272 == arg0) {
            return class458.field6651.method3577(arg2[0], -27079).method1888((int) arg3, -118);
        } else {
            return null;
        }
    }
}
