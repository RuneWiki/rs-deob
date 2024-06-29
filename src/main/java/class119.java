import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class119 extends class97 {

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[B")
    public byte[] field2578;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "[I")
    private int[] field2589;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "[B")
    public byte[] field2587;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "[Lih;")
    public class79[] field2581;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "[B")
    public byte[] field2579;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "[Lrd;")
    public class156[] field2588;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "[S")
    public short[] field2590;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "Lea;")
    public static class38 field2577 = class9.method46((byte) 125, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "Lea;")
    public static class38 field2584 = class9.method46((byte) 105, "Benutzen");

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lea;")
    public static class38 field2573 = class9.method46((byte) 118, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B[IILtb;)Z")
    public final boolean method911(byte[] arg0, int[] arg1, int arg2, class172 arg3) {
        field2583++;
        boolean var5 = true;
        int var6 = 0;
        class79 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var10 = this.field2589[var8];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg3.method1212(var10 >> 2, arg1, (byte) 111);
                        } else {
                            var7 = arg3.method1210(arg1, 1023, var10 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2581[var8] = var7;
                        this.field2589[var8] = 0;
                    }
                }
            }
        }
        int var9 = 124 % ((arg2 + 32) / 34);
        return var5;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public final void method912(int arg0) {
        if (arg0 != -65) {
            this.field2588 = null;
        }
        this.field2589 = null;
        field2585++;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(Z)V")
    public static void method913(boolean arg0) {
        field2577 = null;
        field2584 = null;
        if (arg0) {
            field2573 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(JI)V")
    public static final void method914(long arg0, int arg1) {
        try {
            if (arg1 != 256) {
                return;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field2580++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
    public static final void method915(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2576++;
        class71.method569(arg4, arg3, arg4 + arg2, arg3 - -arg0);
        class93.method788();
        class172.field3523++;
        class196.method1295(true, true);
        class191.method1278(arg1 - 4332, true);
        class196.method1295(true, false);
        class191.method1278(54, false);
        class163.method1166(-1);
        class168.method1195((byte) 83);
        if (!class140.field2933) {
            int var5 = class192.field3799 + class114.field2534 & 0x7FF;
            int var6 = class177.field3596;
            if (var6 < class70.field1737 / 256) {
                var6 = class70.field1737 / 256;
            }
            if (class171.field3509[4] && var6 < class191.field3778[4] + 128) {
                var6 = class191.field3778[4] + 128;
            }
            class139.method994(52, var6 * 3 + 600, field2575, class148.field3079, class38.method257(class10.field224, arg1 ^ 0xF5E5A09F, class195.field3842.field382, class195.field3842.field406) - 50, var6, var5);
        }
        int var7;
        if (class140.field2933) {
            var7 = class136.method985((byte) 52);
        } else {
            var7 = class102.method837((byte) 41);
        }
        int var8 = class50.field1243;
        int var9 = class144.field2998;
        int var10 = class42.field925;
        int var11 = class123.field2654;
        int var12 = class203.field4008;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class171.field3509[var13]) {
                int var16 = (int) (Math.random() * (double) (class35.field747[var13] * 2 + 1) + Math.sin((double) class155.field3221[var13] / 100.0D * (double) class141.field2970[var13]) * (double) class191.field3778[var13] - (double) class35.field747[var13]);
                if (var13 == 0) {
                    class50.field1243 += var16;
                }
                if (var13 == 4) {
                    class144.field2998 += var16;
                    if (class144.field2998 < 128) {
                        class144.field2998 = 128;
                    }
                    if (class144.field2998 > 383) {
                        class144.field2998 = 383;
                    }
                }
                if (var13 == 1) {
                    class203.field4008 += var16;
                }
                if (var13 == 3) {
                    class123.field2654 = class123.field2654 + var16 & 0x7FF;
                }
                if (var13 == 2) {
                    class42.field925 += var16;
                }
            }
        }
        int var14 = class10.field222;
        int var15 = class176.field3568;
        if (var15 >= arg4 && arg2 + arg4 > var15 && arg3 <= var14 && var14 < arg0 + arg3) {
            class49.field1192 = 0;
            class49.field1212 = true;
            class49.field1197 = class10.field222 - arg3;
            class49.field1210 = class176.field3568 - arg4;
        } else {
            class49.field1192 = 0;
            class49.field1212 = false;
        }
        class167.method1188(2);
        class71.method558(arg4, arg3, arg2, arg0, 0);
        class167.method1188(arg1 ^ 0x1158);
        class101.field2268.method1105(class50.field1243, class203.field4008, class42.field925, class144.field2998, class123.field2654, var7);
        class167.method1188(arg1 ^ 0x1158);
        class101.field2268.method1121();
        class48.method337(arg3, arg4, arg0, -4, arg2);
        class111.method875(arg3, (byte) -126, arg4);
        ((class191) class93.field2107).method1274(class205.field4027, false);
        class45.method327(arg0, arg3, -124, arg4, arg2);
        class42.field925 = var10;
        class203.field4008 = var12;
        class123.field2654 = var11;
        class50.field1243 = var8;
        class144.field2998 = var9;
        if (class25.field512 && class113.method893((byte) 113, true, false) == 0) {
            class25.field512 = false;
        }
        if (arg1 != 4442) {
            field2575 = -56;
        }
        if (class25.field512) {
            class71.method558(arg4, arg3, arg2, arg0, 0);
            class185.method1253(class198.field3925, false, arg1 - 4441);
        }
        if (!class25.field512 && !class169.field3482 && arg4 <= var15 && arg2 + arg4 > var15 && arg3 <= var14 && arg0 + arg3 > var14) {
            class103.method844(arg4, arg3, 0, var15, var14);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ldd;Ljava/awt/Component;ILdd;)V")
    public static final void method916(class32 arg0, Component arg1, int arg2, class32 arg3) {
        field2574++;
        if (class185.field3688) {
            return;
        }
        class71.method559();
        byte[] var4 = arg3.method210((byte) 108, class136.field2856, class187.field3723);
        if (arg2 != -3473) {
            return;
        }
        class111.field2470 = new class89(var4, arg1);
        class30.field593 = class111.field2470.method750();
        class136.field2864 = class75.method597(class187.field3723, arg2 - 1094014879, class128.field2740, arg0);
        class111.field2472 = class75.method597(class187.field3723, -1094018352, class11.field247, arg0);
        class117.field2561 = class75.method597(class187.field3723, -1094018352, class125.field2696, arg0);
        class187.field3722 = class117.method904(arg0, class187.field3723, arg2 + 1000003472, class86.field1995);
        class176.field3570 = class117.method904(arg0, class187.field3723, 999999999, class136.field2863);
        class165.field3412 = new int[256];
        for (int var5 = 0; var5 < 64; var5++) {
            class165.field3412[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class165.field3412[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class165.field3412[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class165.field3412[var8 + 192] = 16777215;
        }
        class51.field1297 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class51.field1297[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class51.field1297[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class51.field1297[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class51.field1297[var12 + 192] = 16777215;
        }
        class187.field3718 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class187.field3718[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class187.field3718[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class187.field3718[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class187.field3718[var16 + 192] = 16777215;
        }
        class68.field1720 = new int[32768];
        class59.field1478 = new int[256];
        class100.field2234 = new int[32768];
        class118.method909(-4999, null);
        class187.field3725 = class187.field3723;
        class143.field2986 = false;
        if (class109.field2454 == 0) {
            class130.field2777 = true;
        } else {
            class130.field2777 = false;
        }
        class124.field2662 = new int[32768];
        class43.field950 = 0;
        class187.field3724 = class187.field3723;
        class87.field2019 = new int[32768];
        if (class130.field2777) {
            class80.method679(arg2 ^ 0xDF8, 2);
        } else {
            class108.method869(class133.field2815, 2, false, class187.field3723, class2.field88, 32, 255);
        }
        class14.method84(arg2 ^ 0xFFFFF2F8, false);
        class185.field3688 = true;
        class111.field2470.method754(0, 0);
        class30.field593.method754(382, 0);
        class136.field2864.method335(382 - class136.field2864.field1147 / 2, 18);
        class137.field2880 = new class89(128, 254);
        class154.field3204 = new class89(128, 254);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class119() {
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
    public class119(byte[] arg0) {
        this.field2578 = new byte[128];
        this.field2589 = new int[128];
        this.field2587 = new byte[128];
        this.field2581 = new class79[128];
        this.field2579 = new byte[128];
        this.field2588 = new class156[128];
        int var2 = 0;
        this.field2590 = new short[128];
        class66 var3 = new class66(arg0);
        while (var3.field1627[var3.field1620 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method513((byte) 113);
        }
        var2++;
        int var6 = 0;
        var3.field1620++;
        int var7 = var3.field1620;
        var3.field1620 += var2;
        while (var3.field1627[var3.field1620 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method513((byte) 106);
        }
        var6++;
        var3.field1620++;
        int var10 = var3.field1620;
        int var11 = 0;
        var3.field1620 += var6;
        while (var3.field1627[var3.field1620 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method513((byte) 125);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var3.field1620++;
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method509(116);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class156[] var18 = new class156[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class156 var102 = var18[var19] = new class156();
            int var103 = var3.method509(119);
            if (var103 > 0) {
                var102.field3244 = new byte[var103 * 2];
            }
            int var104 = var3.method509(118);
            if (var104 > 0) {
                var102.field3243 = new byte[var104 * 2 + 2];
                var102.field3243[1] = 64;
            }
        }
        int var20 = var3.method509(116);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = 0;
        int var23 = var3.method509(119);
        while (var3.field1627[var3.field1620 + var22] != 0) {
            var22++;
        }
        byte[] var24 = new byte[var22];
        byte[] var25 = var23 > 0 ? new byte[var23 * 2] : null;
        for (int var26 = 0; var26 < var22; var26++) {
            var24[var26] = var3.method513((byte) 118);
        }
        var3.field1620++;
        int var27 = 0;
        var22++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method509(122);
            this.field2590[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method509(119);
            this.field2590[var30] = (short) (this.field2590[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var24.length) {
                    var31 = -1;
                } else {
                    var31 = var24[var32++];
                }
                var33 = var3.method505((byte) -124);
            }
            this.field2590[var34] = (short) (this.field2590[var34] + class52.method380(var33 - 1 << 14, 32768));
            var31--;
            this.field2589[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2589[var38] != 0) {
                if (var37 == 0) {
                    var35 = var3.field1627[var7++] - 1;
                    if (var4.length > var36) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                var37--;
                this.field2578[var38] = (byte) var35;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2589[var42] != 0) {
                if (var39 == 0) {
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var3.field1627[var10++] + 16 << 2;
                }
                this.field2579[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class156 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2589[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length > var43) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field2588[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var24.length > var47) {
                    var48 = var24[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field2589[var50] > 0) {
                    var49 = var3.method509(121) + 1;
                }
            }
            var48--;
            this.field2587[var50] = (byte) var49;
        }
        this.field2582 = var3.method509(123) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class156 var99 = var18[var51];
            if (var99.field3244 != null) {
                for (int var100 = 1; var100 < var99.field3244.length; var100 += 2) {
                    var99.field3244[var100] = var3.method513((byte) 125);
                }
            }
            if (var99.field3243 != null) {
                for (int var101 = 3; var101 < var99.field3243.length - 2; var101 += 2) {
                    var99.field3243[var101] = var3.method513((byte) 124);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method513((byte) 126);
            }
        }
        if (var25 != null) {
            for (int var53 = 1; var53 < var25.length; var53 += 2) {
                var25[var53] = var3.method513((byte) 127);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class156 var96 = var18[var54];
            if (var96.field3243 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3243.length; var98 += 2) {
                    var97 -= -var3.method509(121) - 1;
                    var96.field3243[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class156 var93 = var18[var55];
            if (var93.field3244 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3244.length; var95 += 2) {
                    var94 = var94 + var3.method509(122) + 1;
                    var93.field3244[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method509(118);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var3.method509(124) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field2587[var60] = (byte) (this.field2587[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var59) * var58 + (var64 - var59) / 2;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class179.method1227(256, var64 - var59, var66);
                    var66 += var65 - var58;
                    this.field2587[var67] = (byte) (this.field2587[var67] * var68 + 32 >> 6);
                }
                var58 = var65;
                var59 = var64;
            }
            for (int var62 = var59; var62 < 128; var62++) {
                this.field2587[var62] = (byte) (this.field2587[var62] * var58 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var25 != null) {
            int var69 = var3.method509(119);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method509(120) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            int var71 = var25[1] << 1;
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field2579[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2579[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var78 = var25[var74];
                int var79 = var25[var74 + 1] << 1;
                int var80 = (var78 - var72) / 2 + (var78 - var72) * var71;
                for (int var81 = var72; var81 < var78; var81++) {
                    int var82 = class179.method1227(256, var78 - var72, var80);
                    int var83 = (this.field2579[var81] & 0xFF) + var82;
                    var80 += var79 - var71;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2579[var81] = (byte) var83;
                }
                var74 += 2;
                var71 = var79;
                var72 = var78;
            }
            for (int var75 = var72; var75 < 128; var75++) {
                int var77 = (this.field2579[var75] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2579[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3248 = var3.method509(122);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class156 var92 = var18[var86];
            if (var92.field3244 != null) {
                var92.field3239 = var3.method509(117);
            }
            if (var92.field3243 != null) {
                var92.field3241 = var3.method509(116);
            }
            if (var92.field3248 > 0) {
                var92.field3252 = var3.method509(125);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3246 = var3.method509(124);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class156 var91 = var18[var88];
            if (var91.field3246 > 0) {
                var91.field3242 = var3.method509(127);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class156 var90 = var18[var89];
            if (var90.field3242 > 0) {
                var90.field3237 = var3.method509(120);
            }
        }
    }
}
