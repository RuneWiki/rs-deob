import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class349 extends class141 {

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "Z")
    private boolean field5125 = false;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Z")
    private boolean field5122 = false;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lpt;")
    private class376 field5128;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lej;")
    private class80 field5129;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[B")
    public static byte[] field5121 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "Ljava/util/Random;")
    public static Random field5123 = new Random();

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
    public static int[] field5130 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lci;")
    public static class320 field5119;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public static final void method2199(int arg0) {
        ++field5126;
        if (class329.field4840 != 0) {
            try {
                if (~(++class77.field1269) < -2001) {
                    if (class410.field5802 != null) {
                        class410.field5802.method1291(true);
                        class410.field5802 = null;
                    }
                    if (~class211.field3189 <= -2) {
                        class329.field4840 = 0;
                        class513.field7457 = -5;
                        return;
                    }
                    ++class211.field3189;
                    class77.field1269 = 0;
                    class329.field4840 = 1;
                    class259.field3835.field4015 = !class259.field3835.field4015;
                }
                if (arg0 <= 30) {
                    method2199(56);
                }
                if (class329.field4840 == 1) {
                    class110.field1628 = class280.field4173.method2441(class259.field3835.field4009, class259.field3835.method1719((byte) -126), -112);
                    class329.field4840 = 2;
                }
                if (class329.field4840 == 2) {
                    if (class110.field1628.field1314 == 2) {
                        throw new IOException();
                    }
                    if (~class110.field1628.field1314 != -2) {
                        return;
                    }
                    class410.field5802 = class58.method491(5000, 1024, (Socket) class110.field1628.field1311);
                    class110.field1628 = null;
                    class410.field5802.method1296(class276.field4124.field7558, 0, 20188, class276.field4124.field7545);
                    class329.field4840 = 4;
                }
                if (~class329.field4840 == -5) {
                    if (!class410.field5802.method1298(1, 80)) {
                        return;
                    }
                    class410.field5802.method1299(class336.field4966.field7545, 0, 1, 4470);
                    int var1 = class336.field4966.field7545[0] & 255;
                    if (~var1 != -22) {
                        class329.field4840 = 0;
                        class513.field7457 = var1;
                        class410.field5802.method1291(true);
                        class410.field5802 = null;
                        return;
                    }
                    class329.field4840 = 5;
                }
                if (class329.field4840 == 5) {
                    if (!class410.field5802.method1298(1, 78)) {
                        return;
                    }
                    class410.field5802.method1299(class336.field4966.field7545, 0, 1, 4470);
                    class531.field7841 = new String[class336.field4966.field7545[0] & 255];
                    class329.field4840 = 6;
                }
                if (class329.field4840 == 6) {
                    if (class410.field5802.method1298(class531.field7841.length * 8, 127)) {
                        class336.field4966.field7558 = 0;
                        class410.field5802.method1299(class336.field4966.field7545, 0, class531.field7841.length * 8, 4470);
                        for (int var2 = 0; var2 < class531.field7841.length; ++var2) {
                            class531.field7841[var2] = class76.method587(class336.field4966.method3061(16556), (byte) -53);
                        }
                        class513.field7457 = 21;
                        class329.field4840 = 0;
                        class410.field5802.method1291(true);
                        class410.field5802 = null;
                    }
                }
            } catch (IOException var3) {
                if (class410.field5802 != null) {
                    class410.field5802.method1291(true);
                    class410.field5802 = null;
                }
                if (class211.field3189 < 1) {
                    class329.field4840 = 1;
                    class259.field3835.field4015 = !class259.field3835.field4015;
                    ++class211.field3189;
                    class77.field1269 = 0;
                } else {
                    class513.field7457 = -4;
                    class329.field4840 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2200(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field5116;
        if (arg4 || ~class473.field6897 != ~arg1 || ~class122.field1908 != ~arg2 || ~class123.field1944 != ~class10.field95 && !class220.field3371.method1048(class74.field1211, -70)) {
            class10.field95 = class123.field1944;
            class122.field1908 = arg2;
            class473.field6897 = arg1;
            if (class220.field3371.method1048(class74.field1211, -121)) {
                class10.field95 = 0;
            }
            class170.method1206(arg0 ^ 1, arg3);
            class283.method1825(true, class406.field5775, class235.field3505.method426(class503.field7255, 106), 41);
            int var5 = class82.field1315;
            int var6 = class501.field7240;
            class82.field1315 = (-(class69.field1139 >> 4) + class473.field6897) * 8;
            class501.field7240 = (class122.field1908 - (class255.field3763 >> 4)) * 8;
            class338.field5008 = class382.method2325(class473.field6897 * 8, class122.field1908 * 8);
            class136.field2109 = null;
            int var7 = -var5 + class82.field1315;
            int var8 = -var6 + class501.field7240;
            if (arg3 != 10) {
                boolean var9 = false;
                class477.field6952 = 0;
                int var10 = (class69.field1139 + -1) * 128;
                int var11 = (class255.field3763 + -1) * 128;
                for (int var12 = 0; class329.field4838 > var12; ++var12) {
                    class193 var13 = class221.field3375[var12];
                    if (var13 != null) {
                        class279 var14 = var13.field2805;
                        var14.field6961 -= var7 * 128;
                        var14.field6965 -= var8 * 128;
                        if (var14.field6961 >= 0 && ~var14.field6961 >= ~var10 && var14.field6965 >= 0 && ~var14.field6965 >= ~var11) {
                            boolean var15 = true;
                            for (int var16 = 0; var16 < 10; ++var16) {
                                var14.field343[var16] -= var7;
                                var14.field344[var16] -= var8;
                                if (~var14.field343[var16] > -1 || ~class69.field1139 >= ~var14.field343[var16] || ~var14.field344[var16] > -1 || var14.field344[var16] >= class255.field3763) {
                                    var15 = false;
                                }
                            }
                            if (var15) {
                                class483.field7012[class477.field6952++] = var14.field290;
                            } else {
                                var14.method1793((class311) null, arg0 ^ -120);
                                var13.method421(22071);
                                var9 = true;
                            }
                        } else {
                            var14.method1793((class311) null, -116);
                            var13.method421(22071);
                            var9 = true;
                        }
                    }
                }
                if (var9) {
                    class329.field4838 = class390.field5539.method2294((byte) 76);
                    class390.field5539.method2287((byte) 109, class221.field3375);
                }
            } else {
                for (int var17 = 0; ~class329.field4838 < ~var17; ++var17) {
                    class193 var30 = class221.field3375[var17];
                    if (var30 != null) {
                        class279 var31 = var30.field2805;
                        for (int var32 = 0; ~var32 > -11; ++var32) {
                            var31.field343[var32] -= var7;
                            var31.field344[var32] -= var8;
                        }
                        var31.field6961 -= var7 * 128;
                        var31.field6965 -= var8 * 128;
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class510 var28 = class494.field7143[var18];
                if (var28 != null) {
                    for (int var29 = 0; var29 < 10; ++var29) {
                        var28.field343[var29] -= var7;
                        var28.field344[var29] -= var8;
                    }
                    var28.field6961 -= var7 * 128;
                    var28.field6965 -= var8 * 128;
                }
            }
            class3[] var19 = class356.field5182;
            for (int var20 = arg0; ~var19.length < ~var20; ++var20) {
                class3 var27 = var19[var20];
                if (var27 != null) {
                    var27.field16 -= var8 * 128;
                    var27.field14 -= var7 * 128;
                }
            }
            for (class50 var21 = (class50) class515.field7469.method863(-1); var21 != null; var21 = (class50) class515.field7469.method865(-1)) {
                var21.field924 -= var7;
                var21.field919 -= var8;
                if (class251.field3738 != 4 && (var21.field924 < 0 || var21.field919 < 0 || ~class69.field1139 >= ~var21.field924 || class255.field3763 <= var21.field919)) {
                    var21.method421(arg0 + 22071);
                }
            }
            if (class251.field3738 != 4) {
                for (class203 var22 = (class203) class191.field2787.method2285(arg0 ^ 101); var22 != null; var22 = (class203) class191.field2787.method2283((byte) 11)) {
                    int var23 = (int) (var22.field863 & 16383L);
                    int var24 = -class82.field1315 + var23;
                    int var25 = (int) (16383L & var22.field863 >> 14);
                    int var26 = -class501.field7240 + var25;
                    if (~var24 > -1 || ~var26 > -1 || class69.field1139 <= var24 || class255.field3763 <= var26) {
                        var22.method421(22071);
                    }
                }
            }
            if (~class17.field186 != -1) {
                class112.field1651 -= var8;
                class17.field186 -= var7;
            }
            class196.method1327(arg0 ^ 1);
            if (~arg3 != -11) {
                class397.field5649 -= var8 * 128;
                class370.field5338 -= var8;
                class52.field964 -= var8;
                class133.field2083 -= var7;
                class315.field4688 -= var7 * 128;
                class530.field7811 -= var7;
                if (Math.abs(var7) > class69.field1139 || ~Math.abs(var8) < ~class255.field3763) {
                    class199.method1355(false);
                }
            } else if (class294.field4381 == 4) {
                class486.field7048 -= var8 * 128;
                class385.field5502 -= var7 * 128;
                class78.field1279 -= var7 * 128;
                class279.field4147 -= var8 * 128;
            } else {
                class294.field4381 = 1;
            }
            class452.method2693(11);
            class322.method2064(false);
            class533.field7867.method861(-1);
            class518.field7503.method861(~arg0);
            class27.field379.method901(-1);
            class200.method1358((byte) 26);
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public static void method2201(int arg0) {
        field5123 = null;
        if (arg0 == 0) {
            field5119 = null;
            field5121 = null;
            field5130 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lei;II)V")
    public final void method57(class120 arg0, int arg1, int arg2) {
        if (!this.field5125) {
            super.field2178.method285(false, arg0);
            super.field2178.method249(arg1, -2);
        }
        ++field5127;
        if (arg2 <= 89) {
            this.field5129 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILqa;BI)V")
    public static final void method2202(int arg0, class167 arg1, byte arg2, int arg3) {
        ++field5118;
        if (~arg3 <= -1 && ~arg0 <= -1 && ~class173.field2594 != -1 && ~class503.field7250 != -1) {
            arg1.method325(class434.field6214, class51.field944, class173.field2594, class503.field7250);
            arg1.method345(class491.field7073, class511.field7426, class173.field2594, class503.field7250);
            class15 var4 = arg1.method245();
            var4.method35(class69.field1144, class153.field2332, class130.field2040, class383.field5488, class65.field1108, class274.field4098);
            arg1.method209(var4);
            if (class393.field5594 != null) {
                int var5 = -1;
                int var6 = -1;
                int var7 = arg1.method197();
                int var8 = (-class434.field6214 + arg3) * var7 / class173.field2594;
                int var9 = (-class51.field944 + arg0) * var7 / class503.field7250;
                int var10 = arg1.method237();
                int var11 = (arg3 - class434.field6214) * var10 / class173.field2594;
                int var12 = (-class51.field944 + arg0) * var10 / class503.field7250;
                int[] var13 = new int[] { var8, var9, var7 };
                var4.method40(var13);
                int[] var14 = new int[] { var11, var12, var10 };
                var4.method40(var14);
                float var15 = 0.0F;
                int var16 = var14[0] - var13[0];
                int var17 = var14[1] + -var13[1];
                int var18 = var14[2] + -var13[2];
                while (var15 < 1.0F) {
                    int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                    int var20 = var19 >> 7;
                    int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                    int var22 = var21 >> 7;
                    if (~var20 < -1 && ~var22 < -1 && ~class69.field1139 < ~var20 && ~class255.field3763 < ~var22) {
                        int var23 = class364.field5293.field6956;
                        if (var23 < 3 && (class234.field3497[1][var20][var22] & 2) != 0) {
                            ++var23;
                        }
                        if ((float) class393.field5594[var23].method143(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                            var5 = (class364.field5293.method135((byte) 72) - 1 << 6) + var19 >> 7;
                            var6 = var21 + (-1 + class364.field5293.method135((byte) 72) << 6) >> 7;
                            break;
                        }
                    }
                    var15 = (float) ((double) var15 + 0.01D);
                }
                if (~var5 != 0 && var6 != -1) {
                    if (class219.field3351 && (64 & class25.field362) != 0) {
                        class198 var24 = class539.method3173(class303.field4494, 2, class72.field1164);
                        if (var24 != null) {
                            class20.method114(49, 0L, true, var5, false, true, class137.field2118, " ->", class89.field1442, -1, var6);
                        } else {
                            class461.method2735((byte) -123);
                        }
                    } else {
                        if (class167.field2519 == class14.field163) {
                            class20.method114(45, 0L, true, var5, false, true, -1, "", class36.field781.method426(class503.field7255, 112), -1, var6);
                        }
                        class20.method114(21, 0L, true, var5, false, true, class248.field3715, "", class114.field1701, -1, var6);
                        ++class47.field892;
                    }
                }
            }
            class122 var25 = class302.field4481;
            if (arg2 != -82) {
                method2201(28);
            }
            for (class166 var26 = (class166) var25.method904(false); var26 != null; var26 = (class166) var25.method907(-1)) {
                if ((class38.field812 || class364.field5293.field6956 == var26.field2495) && var26.method1190(arg3, 2, arg0, arg1)) {
                    if (var26.field2501 instanceof class510) {
                        class510 var27 = (class510) var26.field2501;
                        int var28 = var27.method135((byte) 72);
                        if (~(var28 & 1) == -1 && ~(var27.field6961 & 127) == -1 && ~(127 & var27.field6965) == -1 || (var28 & 1) == 1 && (var27.field6961 & 127) == 64 && ~(var27.field6965 & 127) == -65) {
                            int var29 = var27.field6961 - (var27.method135((byte) 72) + -1 << 6);
                            int var30 = var27.field6965 + -(var27.method135((byte) 72) + -1 << 6);
                            for (int var31 = 0; var31 < class477.field6952; ++var31) {
                                class193 var38 = (class193) class390.field5539.method2284(true, (long) class483.field7012[var31]);
                                if (var38 != null) {
                                    class279 var39 = var38.field2805;
                                    if (class24.field349 != var39.field327 && var39.field298) {
                                        int var40 = -(var39.field4157.field4620 + -1 << 6) + var39.field6961;
                                        int var41 = -(var39.field4157.field4620 + -1 << 6) + var39.field6965;
                                        if (~var29 >= ~var40 && ~var39.field4157.field4620 >= ~(-(var40 - var29 >> 7) + var27.method135((byte) 72)) && ~var30 >= ~var41 && var39.field4157.field4620 <= var27.method135((byte) 72) - (-var30 + var41 >> 7)) {
                                            class175.method1222(0, var39, ~class364.field5293.field6956 != ~var26.field2495);
                                            var39.field327 = class24.field349;
                                        }
                                    }
                                }
                            }
                            int var32 = class452.field6603;
                            int[] var33 = class532.field7853;
                            for (int var34 = 0; ~var32 < ~var34; ++var34) {
                                class510 var35 = class494.field7143[var33[var34]];
                                if (var35 != null && ~class24.field349 != ~var35.field327 && var27 != var35 && var35.field298) {
                                    int var36 = var35.field6961 + -(-1 + var35.method135((byte) 72) << 6);
                                    int var37 = var35.field6965 + -(var35.method135((byte) 72) + -1 << 6);
                                    if (~var36 <= ~var29 && ~var35.method135((byte) 72) >= ~(var27.method135((byte) 72) + -(-var29 + var36 >> 7)) && var37 >= var30 && var35.method135((byte) 72) <= -(-var30 + var37 >> 7) + var27.method135((byte) 72)) {
                                        class190.method1294(false, ~class364.field5293.field6956 != ~var26.field2495, var35);
                                        var35.field327 = class24.field349;
                                    }
                                }
                            }
                        }
                        if (~class24.field349 == ~var27.field327) {
                            continue;
                        }
                        class190.method1294(false, ~class364.field5293.field6956 != ~var26.field2495, var27);
                        var27.field327 = class24.field349;
                    }
                    if (var26.field2501 instanceof class279) {
                        class279 var42 = (class279) var26.field2501;
                        if (var42.field4157 != null) {
                            if (~(1 & var42.field4157.field4620) == -1 && (var42.field6961 & 127) == 0 && ~(var42.field6965 & 127) == -1 || (var42.field4157.field4620 & 1) == 1 && (var42.field6961 & 127) == 64 && ~(var42.field6965 & 127) == -65) {
                                int var43 = -(var42.field4157.field4620 + -1 << 6) + var42.field6961;
                                int var44 = -(var42.field4157.field4620 + -1 << 6) + var42.field6965;
                                for (int var45 = 0; ~class477.field6952 < ~var45; ++var45) {
                                    class193 var52 = (class193) class390.field5539.method2284(true, (long) class483.field7012[var45]);
                                    if (var52 != null) {
                                        class279 var53 = var52.field2805;
                                        if (class24.field349 != var53.field327 && var42 != var53 && var53.field298) {
                                            int var54 = -(var53.field4157.field4620 - 1 << 6) + var53.field6961;
                                            int var55 = var53.field6965 - (var53.field4157.field4620 + -1 << 6);
                                            if (var54 >= var43 && var42.field4157.field4620 - (var54 - var43 >> 7) >= var53.field4157.field4620 && var55 >= var44 && ~var53.field4157.field4620 >= ~(-(-var44 + var55 >> 7) + var42.field4157.field4620)) {
                                                class175.method1222(arg2 ^ -82, var53, ~class364.field5293.field6956 != ~var26.field2495);
                                                var53.field327 = class24.field349;
                                            }
                                        }
                                    }
                                }
                                int var46 = class452.field6603;
                                int[] var47 = class532.field7853;
                                for (int var48 = 0; var46 > var48; ++var48) {
                                    class510 var49 = class494.field7143[var47[var48]];
                                    if (var49 != null && class24.field349 != var49.field327 && var49.field298) {
                                        int var50 = var49.field6961 + -(var49.method135((byte) 72) + -1 << 6);
                                        int var51 = var49.field6965 - (var49.method135((byte) 72) + -1 << 6);
                                        if (var50 >= var43 && ~var49.method135((byte) 72) >= ~(var42.field4157.field4620 - (-var43 + var50 >> 7)) && ~var51 <= ~var44 && var49.method135((byte) 72) <= -(-var44 + var51 >> 7) + var42.field4157.field4620) {
                                            class190.method1294(false, class364.field5293.field6956 != var26.field2495, var49);
                                            var49.field327 = class24.field349;
                                        }
                                    }
                                }
                            }
                            if (class24.field349 == var42.field327) {
                                continue;
                            }
                            class175.method1222(arg2 ^ -82, var42, ~class364.field5293.field6956 != ~var26.field2495);
                            var42.field327 = class24.field349;
                        }
                    }
                    if (var26.field2501 instanceof class233) {
                        int var56 = class82.field1315 + var26.field2500;
                        int var57 = class501.field7240 + var26.field2496;
                        class203 var58 = (class203) class191.field2787.method2284(true, (long) (var56 | var26.field2495 << 28 | var57 << 14));
                        if (var58 != null) {
                            for (class413 var59 = (class413) var58.field3128.method856(33); var59 != null; var59 = (class413) var58.field3128.method860((byte) 119)) {
                                class116 var60 = class58.field1052.method1646(21708, var59.field5843);
                                if (class219.field3351) {
                                    if (class364.field5293.field6956 == var26.field2495) {
                                        class284 var65 = ~class430.field6182 != 0 ? class510.field7361.method2011(108, class430.field6182) : null;
                                        if ((class25.field362 & 1) != 0 && (var65 == null || var60.method823(class430.field6182, var65.field4220, false) != var65.field4220)) {
                                            class20.method114(18, (long) var59.field5843, true, var26.field2500, false, true, class137.field2118, class503.field7268 + " -> <col=ff9040>" + var60.field1780, class89.field1442, -1, var26.field2496);
                                            ++class280.field4174;
                                        }
                                    }
                                } else {
                                    if (class364.field5293.field6956 == var26.field2495) {
                                        String[] var61 = var60.field1788;
                                        for (int var62 = 4; ~var62 <= -1; --var62) {
                                            if (var61 != null && var61[var62] != null) {
                                                byte var63 = 0;
                                                int var64 = class522.field7638;
                                                if (var62 == 0) {
                                                    var63 = 20;
                                                }
                                                if (var62 == 1) {
                                                    var63 = 48;
                                                }
                                                if (var62 == 2) {
                                                    var63 = 8;
                                                }
                                                if (~var62 == -4) {
                                                    var63 = 46;
                                                }
                                                if (~var62 == -5) {
                                                    var63 = 47;
                                                }
                                                if (~var60.field1765 == ~var62) {
                                                    var64 = var60.field1770;
                                                }
                                                if (var60.field1743 == var62) {
                                                    var64 = var60.field1777;
                                                }
                                                class20.method114(var63, (long) var59.field5843, true, var26.field2500, false, true, var64, "<col=ff9040>" + var60.field1780, var61[var62], -1, var26.field2496);
                                                ++class444.field6335;
                                            }
                                        }
                                    }
                                    ++class86.field1395;
                                    class20.method114(1010, (long) var59.field5843, true, var26.field2500, class364.field5293.field6956 != var26.field2495, true, class337.field4998, "<col=ff9040>" + var60.field1780, class96.field1522.method426(class503.field7255, 104), -1, var26.field2496);
                                }
                            }
                        }
                    }
                    if (var26.field2501 instanceof class534) {
                        class534 var66 = (class534) var26.field2501;
                        class261 var67 = class277.field4139.method569((byte) 61, var66.method561((byte) -85));
                        if (var67.field3926 != null) {
                            var67 = var67.method1679(class84.field1335, arg2 ^ -1349439474);
                        }
                        if (var67 != null) {
                            if (class219.field3351) {
                                if (class364.field5293.field6956 == var26.field2495) {
                                    class284 var68 = ~class430.field6182 != 0 ? class510.field7361.method2011(58, class430.field6182) : null;
                                    if (~(4 & class25.field362) != -1 && (var68 == null || var67.method1684(class430.field6182, (byte) -120, var68.field4220) != var68.field4220)) {
                                        ++class136.field2105;
                                        class20.method114(13, class270.method1757(-25746, var26.field2496, var66, var26.field2500), true, var26.field2500, false, true, class137.field2118, class503.field7268 + " -> <col=00ffff>" + var67.field3890, class89.field1442, -1, var26.field2496);
                                    }
                                }
                            } else {
                                if (~class364.field5293.field6956 == ~var26.field2495) {
                                    String[] var69 = var67.field3901;
                                    if (var69 != null) {
                                        for (int var70 = 4; ~var70 <= -1; --var70) {
                                            if (var69[var70] != null) {
                                                short var71 = 0;
                                                int var72 = class522.field7638;
                                                if (~var70 == -1) {
                                                    var71 = 57;
                                                }
                                                if (~var70 == -2) {
                                                    var71 = 23;
                                                }
                                                if (var70 == 2) {
                                                    var71 = 25;
                                                }
                                                if (~var70 == -4) {
                                                    var71 = 15;
                                                }
                                                if (var70 == 4) {
                                                    var71 = 1012;
                                                }
                                                if (var67.field3931 == var70) {
                                                    var72 = var67.field3911;
                                                }
                                                if (~var67.field3892 == ~var70) {
                                                    var72 = var67.field3903;
                                                }
                                                class20.method114(var71, class270.method1757(-25746, var26.field2496, var66, var26.field2500), true, var26.field2500, false, true, var72, "<col=00ffff>" + var67.field3890, var69[var70], -1, var26.field2496);
                                                ++class444.field6334;
                                            }
                                        }
                                    }
                                }
                                class20.method114(1007, (long) var67.field3882, true, var26.field2500, class364.field5293.field6956 != var26.field2495, true, class337.field4998, "<col=00ffff>" + var67.field3890, class96.field1522.method426(class503.field7255, 66), -1, var26.field2496);
                                ++class503.field7271;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)V")
    public final void method51(int arg0, boolean arg1) {
        ++field5115;
        class221 var3 = super.field2178.method357(arg0 + 21781);
        if (arg0 != -21897) {
            field5121 = null;
        }
        if (this.field5122 && var3 != null) {
            float var4 = 2.0F * (1.0F - Math.abs(super.field2178.field675[1])) + 1.0F;
            super.field2178.method277(1, (byte) 107);
            super.field2178.method285(false, var3);
            super.field2178.method277(0, (byte) 102);
            super.field2178.method285(false, this.field5128.field5414);
            long var5 = this.field5129.field1301;
            OpenGL.glUseProgramObjectARB(var5);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var5, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var5, "sunDir"), -super.field2178.field675[0], -super.field2178.field675[1], -super.field2178.field675[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var5, "sunColour"), super.field2178.field646 * var4, super.field2178.field668 * var4, super.field2178.field690 * var4, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var5, "sunExponent"), 928.0F * Math.abs(super.field2178.field675[1]) + 64.0F);
            this.field5125 = true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
    public final void method53(boolean arg0, int arg1) {
        ++field5120;
        if (arg1 != 0) {
            this.method55(-66);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public final void method48(int arg0) {
        ++field5131;
        if (this.field5125) {
            super.field2178.method277(1, (byte) 98);
            super.field2178.method285(false, (class120) null);
            super.field2178.method277(0, (byte) 76);
            super.field2178.method285(false, (class120) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field5125 = false;
        }
        int var2 = -105 / ((arg0 - -51) / 45);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public final void method49(int arg0, int arg1, int arg2) {
        if (arg0 != 1400) {
            method2202(19, (class167) null, (byte) -19, 82);
        }
        ++field5132;
        if (this.field5125) {
            int var4 = 1 << (arg2 & 3);
            float var5 = (float) (1 << (arg2 >> 3 & 7)) / 32.0F;
            int var6 = arg1 & 65535;
            float var7 = (float) (3 & arg1 >> 16) / 8.0F;
            float var8 = (float) ((8085028 & arg1) >> 19) / 16.0F;
            float var9 = (float) ((127994250 & arg1) >> 23) / 16.0F;
            int var10 = 15 & arg1 >> 27;
            long var11 = this.field5129.field1301;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "time"), (float) (super.field2178.field625 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "breakWaterOffset"), var7);
            OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(var11, "waveIntensity"), var9, var8);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var11, "waveExponent"), (float) var10);
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Z")
    public final boolean method55(int arg0) {
        if (arg0 != 0) {
            this.method57((class120) null, -93, 34);
        }
        ++field5117;
        return this.field5122;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lbt;Lpt;)V")
    public class349(class33 arg0, class376 arg1) {
        super(arg0);
        this.field5128 = arg1;
        if (this.field5128.field5414 != null && super.field2178.field652 && super.field2178.field653) {
            class314 var3 = class490.method2872(127, super.field2178, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n", 35633);
            class314 var4 = class490.method2872(-116, super.field2178, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = mix(surfaceColour, vec4(gl_Fog.color.rgb, 1.0), gl_FogFragCoord);\n}\n", 35632);
            this.field5129 = class533.method3155(super.field2178, true, new class314[] { var3, var4 });
            this.field5122 = this.field5129 != null;
        }
    }
}
