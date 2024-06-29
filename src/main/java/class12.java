import jagex3.jagmisc.jagmisc;
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public abstract class class12 extends Applet implements Runnable, FocusListener, WindowListener {

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Z")
    private boolean field134 = false;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
    private boolean field143 = false;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Ljc;")
    public static class203 field146 = class27.method232(-10);

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field157 = 1;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "Z")
    public static boolean field161;

    @OriginalMember(owner = "client!l", name = "destroy", descriptor = "()V", line = 4)
    public final void destroy() {
        field154++;
        if (class23.field353 == this && !class153.field2483) {
            class122.field1819 = class19.method122(-12169);
            class177.method1246(5000L, -32644);
            class148.field2394 = null;
            this.method76(false, 0);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Lgd;[[[IBZ)V", line = 20)
    public static final void method74(class154[] arg0, int[][][] arg1, byte arg2, boolean arg3) {
        field145++;
        byte var4;
        if (arg3) {
            var4 = 1;
        } else {
            var4 = 4;
        }
        if (!arg3) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < 104; var6++) {
                    for (int var7 = 0; var7 < 104; var7++) {
                        if ((class148.field2392[var5][var6][var7] & 0x1) == 1) {
                            int var8 = var5;
                            if ((class148.field2392[1][var6][var7] & 0x2) == 2) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method1108(var7, var6, -2);
                            }
                        }
                    }
                }
            }
            class249.field3956 += (int) (Math.random() * 5.0D) - 2;
            class54.field815 += (int) (Math.random() * 5.0D) - 2;
            if (class54.field815 < -16) {
                class54.field815 = -16;
            }
            if (class54.field815 > 16) {
                class54.field815 = 16;
            }
            if (class249.field3956 < -8) {
                class249.field3956 = -8;
            }
            if (class249.field3956 > 8) {
                class249.field3956 = 8;
            }
        }
        if (arg2 != 16) {
            return;
        }
        int var9 = class249.field3956 >> 2 << 10;
        int var10 = class54.field815 >> 1;
        int[][] var11 = new int[104][104];
        int[][] var12 = new int[104][104];
        for (int var13 = 0; var13 < var4; var13++) {
            byte[][] var14 = class180.field2806[var13];
            if (!class245.field3886) {
                int var35 = (int) Math.sqrt(5100.0D);
                int var36 = var35 * 768 >> 8;
                for (int var37 = 1; var37 < 103; var37++) {
                    for (int var38 = 1; var38 < 103; var38++) {
                        byte var39 = 74;
                        int var40 = class101.field1457[var13][var38 + 1][var37] - class101.field1457[var13][var38 - 1][var37];
                        int var41 = class101.field1457[var13][var38][var37 + 1] - class101.field1457[var13][var38][var37 - 1];
                        int var42 = (int) Math.sqrt((double) (var40 * var40 + var41 * var41 + 65536));
                        int var43 = (var40 << 8) / var42;
                        int var44 = (var41 << 8) / var42;
                        int var45 = (var14[var38][var37 - 1] >> 2) + (var14[var38 - 1][var37] >> 2) + (var14[var38 + 1][var37] >> 3) + (var14[var38][var37 + 1] >> 3) + (var14[var38][var37] >> 1);
                        int var46 = -65536 / var42;
                        int var47 = (var43 * -50 + var44 * -50 + var46 * -10) / var36 + var39;
                        var11[var38][var37] = var47 - var45;
                    }
                }
            } else if (class322.field5287) {
                for (int var31 = 1; var31 < 103; var31++) {
                    for (int var32 = 1; var32 < 103; var32++) {
                        byte var33 = 74;
                        int var34 = (var14[var32][var31 - 1] >> 2) + (var14[var32 + 1][var31] >> 3) + (var14[var32 + -1][var31] >> 2) - (-(var14[var32][var31 + 1] >> 3) - (var14[var32][var31] >> 1));
                        var11[var32][var31] = var33 - var34;
                    }
                }
            } else {
                int var15 = (int) class234.field3727[0];
                int var16 = (int) class234.field3727[2];
                int var17 = (int) class234.field3727[1];
                int var18 = (int) Math.sqrt((double) (var17 * var17 + (var15 * var15 + (var16 * var16))));
                int var19 = var18 * 1024 >> 8;
                for (int var20 = 1; var20 < 103; var20++) {
                    for (int var21 = 1; var21 < 103; var21++) {
                        byte var22 = 96;
                        int var23 = class101.field1457[var13][var21 + 1][var20] - class101.field1457[var13][var21 - 1][var20];
                        int var24 = class101.field1457[var13][var21][var20 + 1] - class101.field1457[var13][var21][var20 - 1];
                        int var25 = (int) Math.sqrt((double) (var23 * var23 + var24 * var24 + 65536));
                        int var26 = (var23 << 8) / var25;
                        int var27 = -65536 / var25;
                        int var28 = (var24 << 8) / var25;
                        int var29 = (var15 * var26 + var16 * var28 + var17 * var27) / var19 + var22;
                        int var30 = (var14[var21 + 1][var20] >> 3) + (var14[var21][var20] >> 1) + (var14[var21][var20 - -1] >> 3) + (var14[var21][var20 + -1] >> 2) + (var14[var21 + -1][var20] >> 2);
                        var11[var21][var20] = var29 - ((int) ((float) var30 * 1.7F));
                    }
                }
            }
            for (int var48 = 0; var48 < 104; var48++) {
                class197.field3034[var48] = 0;
                class109.field1615[var48] = 0;
                class116.field1696[var48] = 0;
                class15.field192[var48] = 0;
                class84.field1208[var48] = 0;
            }
            for (int var49 = -5; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    int var51 = var49 + 5;
                    int var10002;
                    if (var51 < 104) {
                        int var52 = class151.field2430[var13][var51][var50] & 0xFF;
                        if (var52 > 0) {
                            class324 var53 = class78.method533(arg2 ^ 0x11, var52 - 1);
                            class197.field3034[var50] += var53.field5317;
                            class109.field1615[var50] += var53.field5313;
                            class116.field1696[var50] += var53.field5320;
                            class15.field192[var50] += var53.field5316;
                            var10002 = class84.field1208[var50]++;
                        }
                    }
                    int var54 = var49 - 5;
                    if (var54 >= 0) {
                        int var55 = class151.field2430[var13][var54][var50] & 0xFF;
                        if (var55 > 0) {
                            class324 var56 = class78.method533(1, var55 - 1);
                            class197.field3034[var50] -= var56.field5317;
                            class109.field1615[var50] -= var56.field5313;
                            class116.field1696[var50] -= var56.field5320;
                            class15.field192[var50] -= var56.field5316;
                            var10002 = class84.field1208[var50]--;
                        }
                    }
                }
                if (var49 >= 0) {
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    int var61 = 0;
                    for (int var62 = -5; var62 < 104; var62++) {
                        int var63 = var62 + 5;
                        int var64 = var62 - 5;
                        if (var63 < 104) {
                            var60 += class84.field1208[var63];
                            var58 += class15.field192[var63];
                            var57 += class197.field3034[var63];
                            var59 += class116.field1696[var63];
                            var61 += class109.field1615[var63];
                        }
                        if (var64 >= 0) {
                            var61 -= class109.field1615[var64];
                            var60 -= class84.field1208[var64];
                            var57 -= class197.field3034[var64];
                            var59 -= class116.field1696[var64];
                            var58 -= class15.field192[var64];
                        }
                        if (var62 >= 0 && var60 > 0) {
                            var12[var49][var62] = class312.method2178(113, var61 / var60, var59 / var60, var57 * 256 / var58);
                        }
                    }
                }
            }
            for (int var65 = 1; var65 < 103; var65++) {
                label767: for (int var66 = 1; var66 < 103; var66++) {
                    if (arg3 || class261.method1836(0) || (class148.field2392[0][var65][var66] & 0x2) != 0 || (class148.field2392[var13][var65][var66] & 0x10) == 0 && class122.method796(var65, (byte) 118, var13, var66) == class119.field1760) {
                        if (class107.field1538 > var13) {
                            class107.field1538 = var13;
                        }
                        int var67 = class56.field867[var13][var65][var66] & 0xFF;
                        int var68 = class151.field2430[var13][var65][var66] & 0xFF;
                        if (var68 > 0 || var67 > 0) {
                            int var69 = class101.field1457[var13][var65][var66];
                            int var70 = class101.field1457[var13][var65 + 1][var66];
                            int var71 = class101.field1457[var13][var65 + 1][var66 + 1];
                            int var72 = class101.field1457[var13][var65][var66 + 1];
                            if (var13 > 0) {
                                boolean var73 = true;
                                if (var68 == 0 && class6.field72[var13][var65][var66] != 0) {
                                    var73 = false;
                                }
                                if (var67 > 0 && !class52.method382(arg2 ^ 0xFFFFFF9E, var67 - 1).field4373) {
                                    var73 = false;
                                }
                                if (var73 && var69 == var70 && var69 == var71 && var69 == var72) {
                                    class109.field1614[var13][var65][var66] = class167.method1160(class109.field1614[var13][var65][var66], 4);
                                }
                            }
                            int var74;
                            int var77;
                            if (var68 > 0) {
                                var74 = var12[var65][var66];
                                int var75 = (var74 & 0x7F) + var10;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var9 + var74 & 0xFC00) + (var74 & 0x380) + var75;
                                var77 = class272.field4474[class77.method528((byte) -79, var76, 96)];
                            } else {
                                var77 = 0;
                                var74 = -1;
                            }
                            int var78 = var11[var65][var66];
                            int var79 = var11[var65 + 1][var66 + 1];
                            int var80 = var11[var65 + 1][var66];
                            int var81 = var11[var65][var66 + 1];
                            if (var67 == 0) {
                                class352.method2460(var13, var65, var66, 0, 0, -1, var69, var70, var71, var72, class77.method528((byte) 111, var74, var78), class77.method528((byte) 85, var74, var80), class77.method528((byte) -66, var74, var79), class77.method528((byte) -48, var74, var81), 0, 0, 0, 0, var77, 0);
                                if (class245.field3886 && var13 > 0 && var74 != -1 && class78.method533(1, var68 - 1).field5310) {
                                    class149.method1073(0, 0, true, false, var65, var66, var69 - class101.field1457[0][var65][var66], var70 - class101.field1457[0][var65 + 1][var66], var71 - class101.field1457[0][var65 + 1][var66 + 1], -class101.field1457[0][var65][var66 + 1] + var72);
                                }
                                if (class245.field3886 && !arg3 && class91.field1317 != null && var13 == 0) {
                                    for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                        for (int var83 = var66 - 1; var83 <= var66 + 1; var83++) {
                                            if ((var65 != var82 || var66 != var83) && var82 >= 0 && var82 < 104 && var83 >= 0 && var83 < 104) {
                                                int var84 = class56.field867[var13][var82][var83] & 0xFF;
                                                if (var84 != 0) {
                                                    class266 var85 = class52.method382(-107, var84 - 1);
                                                    if (var85.field4386 != -1 && class305.method2134(class272.field4467.method399(var85.field4386, 86), -7)) {
                                                        class91.field1317[var65][var66] = (var85.field4371 << 24) + var85.field4378;
                                                        continue label767;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var86 = class6.field72[var13][var65][var66] + 1;
                                byte var87 = class320.field5273[var13][var65][var66];
                                class266 var88 = class52.method382(arg2 ^ 0xFFFFFF8B, var67 - 1);
                                if (class245.field3886 && !arg3 && class91.field1317 != null && var13 == 0) {
                                    if (var88.field4386 != -1 && class305.method2134(class272.field4467.method399(var88.field4386, 95), -7)) {
                                        class91.field1317[var65][var66] = (var88.field4371 << 24) + var88.field4378;
                                    } else {
                                        label748: for (int var89 = var65 - 1; var89 <= var65 + 1; var89++) {
                                            for (int var90 = var66 - 1; var90 <= var66 + 1; var90++) {
                                                if ((var65 != var89 || var66 != var90) && var89 >= 0 && var89 < 104 && var90 >= 0 && var90 < 104) {
                                                    int var91 = class56.field867[var13][var89][var90] & 0xFF;
                                                    if (var91 != 0) {
                                                        class266 var92 = class52.method382(-102, var91 - 1);
                                                        if (var92.field4386 != -1 && class305.method2134(class272.field4467.method399(var92.field4386, arg2 + 101), -7)) {
                                                            class91.field1317[var65][var66] = (var92.field4371 << 24) + var92.field4378;
                                                            break label748;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var93 = var88.field4386;
                                if (var93 >= 0 && !class272.field4467.method415(false, var93)) {
                                    var93 = -1;
                                }
                                int var94;
                                int var95;
                                if (var93 >= 0) {
                                    var94 = -1;
                                    var95 = class272.field4474[class357.method2484(class272.field4467.method405(var93, arg2 - 8253), 96, false)];
                                } else if (var88.field4372 == -1) {
                                    var95 = 0;
                                    var94 = -2;
                                } else {
                                    var94 = var88.field4372;
                                    int var96 = (var94 & 0x7F) + var10;
                                    if (var96 < 0) {
                                        var96 = 0;
                                    } else if (var96 > 127) {
                                        var96 = 127;
                                    }
                                    int var97 = (var9 + var94 & 0xFC00) - (-(var94 & 0x380) - var96);
                                    var95 = class272.field4474[class357.method2484(var97, 96, false)];
                                }
                                if (var88.field4380 >= 0) {
                                    int var98 = var88.field4380;
                                    int var99 = (var98 & 0x7F) + var10;
                                    if (var99 < 0) {
                                        var99 = 0;
                                    } else if (var99 > 127) {
                                        var99 = 127;
                                    }
                                    int var100 = (var9 + var98 & 0xFC00) + (var98 & 0x380) + var99;
                                    var95 = class272.field4474[class357.method2484(var100, 96, false)];
                                }
                                class352.method2460(var13, var65, var66, var86, var87, var93, var69, var70, var71, var72, class77.method528((byte) -70, var74, var78), class77.method528((byte) -79, var74, var80), class77.method528((byte) 79, var74, var79), class77.method528((byte) 101, var74, var81), class357.method2484(var94, var78, false), class357.method2484(var94, var80, false), class357.method2484(var94, var79, false), class357.method2484(var94, var81, false), var77, var95);
                                if (class245.field3886 && var13 > 0) {
                                    class149.method1073(var86, var87, var94 == -2 || !var88.field4384, var74 == -1 || !class78.method533(1, var68 - 1).field5310, var65, var66, var69 - class101.field1457[0][var65][var66], -class101.field1457[0][var65 + 1][var66] + var70, var71 - class101.field1457[0][var65 + 1][var66 + 1], -class101.field1457[0][var65][var66 + 1] + var72);
                                }
                            }
                        }
                    }
                }
            }
            if (class245.field3886) {
                float[][] var101 = new float[105][105];
                float[][] var102 = new float[105][105];
                float[][] var103 = new float[105][105];
                int[][] var104 = class101.field1457[var13];
                int var105 = 1;
                while (true) {
                    if (var105 > 103) {
                        if (arg3) {
                            class226[] var110 = class278.method1982(class320.field5273[var13], var102, class101.field1457[var13], var11, class223.field3444[0], class151.field2430[var13], arg1, var101, class148.field2392, false, class91.field1317, var13, class56.field867[var13], var103, var12, class6.field72[var13]);
                            class177.method1248(var13, var110);
                            break;
                        }
                        class226[] var111 = class278.method1982(class320.field5273[var13], var102, class101.field1457[var13], var11, (int[][]) null, class151.field2430[var13], arg1, var101, class148.field2392, false, (int[][]) null, var13, class56.field867[var13], var103, var12, class6.field72[var13]);
                        class226[] var112 = class276.method1969(class6.field72[var13], false, class101.field1457[var13], class56.field867[var13], var102, var103, var101, class151.field2430[var13], class148.field2392, var13, var11, class320.field5273[var13]);
                        class226[] var113 = new class226[var111.length + var112.length];
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var113[var114] = var111[var114];
                        }
                        for (int var115 = 0; var115 < var112.length; var115++) {
                            var113[var111.length + var115] = var112[var115];
                        }
                        class177.method1248(var13, var113);
                        class99.method654(class56.field867[var13], class254.field4039, class254.field4032, var101, var102, class6.field72[var13], class320.field5273[var13], var13, (byte) -18, class151.field2430[var13], class101.field1457[var13], var103);
                        break;
                    }
                    for (int var106 = 1; var106 <= 103; var106++) {
                        int var107 = var104[var106 + 1][var105] - var104[var106 - 1][var105];
                        int var108 = var104[var106][var105 + 1] - var104[var106][var105 - 1];
                        float var109 = (float) Math.sqrt((double) (var107 * var107 + var108 * var108 + 65536));
                        var101[var106][var105] = (float) var107 / var109;
                        var103[var106][var105] = -256.0F / var109;
                        var102[var106][var105] = (float) var108 / var109;
                    }
                    var105++;
                }
            }
            class151.field2430[var13] = (byte[][]) null;
            class56.field867[var13] = (byte[][]) null;
            class6.field72[var13] = (byte[][]) null;
            class320.field5273[var13] = (byte[][]) null;
            class180.field2806[var13] = (byte[][]) null;
        }
        class56.method424(-50, -10, -50);
        if (arg3) {
            return;
        }
        for (int var116 = 0; var116 < 104; var116++) {
            for (int var117 = 0; var117 < 104; var117++) {
                if ((class148.field2392[1][var116][var117] & 0x2) == 2) {
                    class163.method1147(var116, var117);
                }
            }
        }
        for (int var118 = 0; var118 < 4; var118++) {
            for (int var119 = 0; var119 <= 104; var119++) {
                for (int var120 = 0; var120 <= 104; var120++) {
                    if ((class109.field1614[var118][var120][var119] & 0x1) != 0) {
                        int var121;
                        for (var121 = var119; var121 > 0 && (class109.field1614[var118][var120][var121 - 1] & 0x1) != 0; var121--) {
                        }
                        int var122 = var118;
                        int var123;
                        for (var123 = var119; var123 < 104 && (class109.field1614[var118][var120][var123 + 1] & 0x1) != 0; var123++) {
                        }
                        int var124 = var118;
                        label450: while (var122 > 0) {
                            for (int var125 = var121; var125 <= var123; var125++) {
                                if ((class109.field1614[var122 - 1][var120][var125] & 0x1) == 0) {
                                    break label450;
                                }
                            }
                            var122--;
                        }
                        label439: while (var124 < 3) {
                            for (int var126 = var121; var126 <= var123; var126++) {
                                if ((class109.field1614[var124 + 1][var120][var126] & 0x1) == 0) {
                                    break label439;
                                }
                            }
                            var124++;
                        }
                        int var127 = (var124 - (var122 - 1)) * (var123 + 1 - var121);
                        if (var127 >= 8) {
                            short var128 = 240;
                            int var129 = class101.field1457[var124][var120][var121] - var128;
                            int var130 = class101.field1457[var122][var120][var121];
                            class249.method1769(1, var120 * 128, var120 * 128, var121 * 128, var123 * 128 + 128, var129, var130);
                            for (int var131 = var122; var131 <= var124; var131++) {
                                for (int var132 = var121; var132 <= var123; var132++) {
                                    class109.field1614[var131][var120][var132] = class235.method1623(class109.field1614[var131][var120][var132], -2);
                                }
                            }
                        }
                    }
                    if ((class109.field1614[var118][var120][var119] & 0x2) != 0) {
                        int var133 = var120;
                        int var134 = var120;
                        while (var133 > 0 && (class109.field1614[var118][var133 - 1][var119] & 0x2) != 0) {
                            var133--;
                        }
                        while (var134 < 104 && (class109.field1614[var118][var134 + 1][var119] & 0x2) != 0) {
                            var134++;
                        }
                        int var135 = var118;
                        int var136;
                        label505: for (var136 = var118; var136 > 0; var136--) {
                            for (int var137 = var133; var137 <= var134; var137++) {
                                if ((class109.field1614[var136 - 1][var137][var119] & 0x2) == 0) {
                                    break label505;
                                }
                            }
                        }
                        label494: while (var135 < 3) {
                            for (int var138 = var133; var138 <= var134; var138++) {
                                if ((class109.field1614[var135 + 1][var138][var119] & 0x2) == 0) {
                                    break label494;
                                }
                            }
                            var135++;
                        }
                        int var139 = (var134 + 1 - var133) * (var135 + 1 - var136);
                        if (var139 >= 8) {
                            short var140 = 240;
                            int var141 = class101.field1457[var136][var133][var119];
                            int var142 = class101.field1457[var135][var133][var119] - var140;
                            class249.method1769(2, var133 * 128, var134 * 128 + 128, var119 * 128, var119 * 128, var142, var141);
                            for (int var143 = var136; var143 <= var135; var143++) {
                                for (int var144 = var133; var144 <= var134; var144++) {
                                    class109.field1614[var143][var144][var119] = class235.method1623(class109.field1614[var143][var144][var119], -3);
                                }
                            }
                        }
                    }
                    if ((class109.field1614[var118][var120][var119] & 0x4) != 0) {
                        int var145 = var120;
                        int var146 = var120;
                        int var147 = var119;
                        int var148;
                        for (var148 = var119; var148 < 104 && (class109.field1614[var118][var120][var148 + 1] & 0x4) != 0; var148++) {
                        }
                        while (var147 > 0 && (class109.field1614[var118][var120][var147 - 1] & 0x4) != 0) {
                            var147--;
                        }
                        label559: while (var146 > 0) {
                            for (int var149 = var147; var149 <= var148; var149++) {
                                if ((class109.field1614[var118][var146 - 1][var149] & 0x4) == 0) {
                                    break label559;
                                }
                            }
                            var146--;
                        }
                        label548: while (var145 < 104) {
                            for (int var150 = var147; var150 <= var148; var150++) {
                                if ((class109.field1614[var118][var145 + 1][var150] & 0x4) == 0) {
                                    break label548;
                                }
                            }
                            var145++;
                        }
                        if (((var145 + 1 - var146) * (var148 + 1 - var147)) >= 4) {
                            int var151 = class101.field1457[var118][var146][var147];
                            class249.method1769(4, var146 * 128, var145 * 128 + 128, var147 * 128, var148 * 128 + 128, var151, var151);
                            for (int var152 = var146; var152 <= var145; var152++) {
                                for (int var153 = var147; var153 <= var148; var153++) {
                                    class109.field1614[var118][var152][var153] = class235.method1623(class109.field1614[var118][var152][var153], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 986)
    public final void method75(byte arg0) {
        if (arg0 != 77) {
            return;
        }
        field128++;
        if (this.field143) {
            return;
        }
        try {
            class158 var2 = class96.field1382.method1955(class23.field353.getClass(), arg0 ^ 0xFFFFFFC7);
            while (var2.field2542 == 0) {
                class177.method1246(100L, -32644);
            }
            if (var2.field2538 != null) {
                throw (Throwable) var2.field2538;
            }
            jagmisc.init();
            this.field143 = true;
            class186.field2895 = class236.method1626(arg0 - 13605);
        } catch (Throwable var4) {
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)V", line = 1018)
    private final void method76(boolean arg0, int arg1) {
        field144++;
        synchronized (this) {
            if (class153.field2483) {
                return;
            }
            class153.field2483 = true;
        }
        if (class96.field1382.field4515 != null) {
            class96.field1382.field4515.destroy();
        }
        try {
            if (arg1 != 0) {
                field157 = 36;
            }
            this.method78((byte) -28);
        } catch (Exception var14) {
        }
        if (this.field143) {
            try {
                jagmisc.quit();
            } catch (Throwable var13) {
            }
            this.field143 = false;
        }
        class96.field1382.method1943(false, class23.field353.getClass());
        if (class235.field3731 != null) {
            try {
                class235.field3731.removeFocusListener(this);
                class235.field3731.getParent().remove(class235.field3731);
            } catch (Exception var12) {
            }
        }
        if (class96.field1382 != null) {
            try {
                class96.field1382.method1938((byte) 100);
            } catch (Exception var11) {
            }
        }
        this.method89((byte) -102);
        if (class217.field3350 != null) {
            try {
                System.exit(0);
            } catch (Throwable var10) {
            }
        }
        System.out.println("Shutdown complete - clean:" + arg0);
    }

    @OriginalMember(owner = "client!l", name = "run", descriptor = "()V", line = 1092)
    public final void run() {
        field159++;
        try {
            if (class274.field4513 != null) {
                String var1 = class274.field4513.toLowerCase();
                if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
                    String var2 = class274.field4505;
                    if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.")) {
                        this.method83(-104, "wrongjava");
                        return;
                    }
                    class329.field5385 = 5;
                } else if (var1.indexOf("ibm") != -1 && (class274.field4505 == null || class274.field4505.equals("1.4.2"))) {
                    this.method83(-104, "wrongjava");
                    return;
                }
            }
            if (class274.field4505 != null && class274.field4505.startsWith("1.")) {
                int var3 = 2;
                int var4 = 0;
                while (class274.field4505.length() > var3) {
                    char var5 = class274.field4505.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
                if (var4 >= 5) {
                    class291.field4838 = true;
                }
            }
            if (class96.field1382.field4515 != null) {
                Method var6 = class274.field4521;
                if (var6 != null) {
                    try {
                        var6.invoke(class96.field1382.field4515, Boolean.TRUE);
                    } catch (Throwable var10) {
                    }
                }
            }
            class262.method1842(-126);
            this.method90(2);
            class92.field1331 = class204.method1393(30663, class243.field3838, class235.field3731, class233.field3712);
            this.method82(85);
            class186.field2895 = class236.method1626(-13528);
            this.method75((byte) 77);
            while (class122.field1819 == 0L || class122.field1819 > class19.method122(-12169)) {
                class60.field904 = class186.field2895.method453(-124, class329.field5385, class204.field3120);
                for (int var8 = 0; var8 < class60.field904; var8++) {
                    this.method84(31);
                }
                this.method87(277930017);
                class89.method591(false, class96.field1382, class235.field3731);
            }
        } catch (Exception var11) {
            class326.method2328(var11, (String) null, true);
            this.method83(-104, "crash");
        }
        this.method76(true, 0);
    }

    @OriginalMember(owner = "client!l", name = "windowOpened", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1200)
    public final void windowOpened(WindowEvent arg0) {
        field153++;
    }

    @OriginalMember(owner = "client!l", name = "windowDeactivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1208)
    public final void windowDeactivated(WindowEvent arg0) {
        field130++;
    }

    @OriginalMember(owner = "client!l", name = "getDocumentBase", descriptor = "()Ljava/net/URL;", line = 1220)
    public final URL getDocumentBase() {
        field152++;
        if (class217.field3350 == null) {
            return class96.field1382 == null || class96.field1382.field4515 == this ? super.getDocumentBase() : class96.field1382.field4515.getDocumentBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZZIILjava/lang/String;I)V", line = 1237)
    public final void method79(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, String arg6, int arg7) {
        try {
            class233.field3712 = arg4;
            class107.field1535 = arg4;
            class198.field3042 = 0;
            class23.field353 = this;
            class79.field1174 = arg1;
            class223.field3455 = 0;
            class243.field3838 = arg5;
            class182.field2829 = arg5;
            class217.field3350 = new Frame();
            class217.field3350.setTitle("Jagex");
            class217.field3350.setResizable(true);
            class217.field3350.addWindowListener(this);
            if (arg3) {
                return;
            }
            class217.field3350.setVisible(true);
            class217.field3350.toFront();
            Insets var9 = class217.field3350.getInsets();
            class217.field3350.setSize(class107.field1535 + var9.right + var9.left, class182.field2829 + var9.bottom - -var9.top);
            class148.field2394 = class96.field1382 = new class274((Applet) null, arg7, arg6, arg0);
            class158 var10 = class96.field1382.method1952(0, 1, this);
            while (var10.field2542 == 0) {
                class177.method1246(10L, -32644);
            }
            class96.field1395 = (Thread) var10.field2538;
        } catch (Exception var12) {
            class326.method2328(var12, (String) null, true);
        }
        field127++;
    }

    @OriginalMember(owner = "client!l", name = "getCodeBase", descriptor = "()Ljava/net/URL;", line = 1279)
    public final URL getCodeBase() {
        field142++;
        if (class217.field3350 == null) {
            return class96.field1382 == null || class96.field1382.field4515 == this ? super.getCodeBase() : class96.field1382.field4515.getCodeBase();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 1293)
    public final void update(Graphics arg0) {
        this.paint(arg0);
        field150++;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)Z", line = 1304)
    public final boolean method80(byte arg0) {
        field132++;
        String var2 = this.getDocumentBase().getHost().toLowerCase();
        if (var2.equals("jagex.com") || var2.endsWith(".jagex.com")) {
            return true;
        } else if (var2.equals("runescape.com") || var2.endsWith(".runescape.com")) {
            return true;
        } else if (var2.endsWith("127.0.0.1")) {
            return true;
        } else {
            while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith("192.168.1.")) {
                return true;
            } else {
                int var3 = -105 / ((arg0 + 57) / 60);
                this.method83(-104, "invalidhost");
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "stop", descriptor = "()V", line = 1341)
    public final void stop() {
        field136++;
        if (class23.field353 == this && !class153.field2483) {
            class122.field1819 = class19.method122(-12169) + 4000L;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V", line = 1354)
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field160++;
        if (arg0 != 1035801098) {
            field146 = (class203) null;
        }
        try {
            if (class23.field353 != null) {
                class253.field4017++;
                if (class253.field4017 < 3) {
                    this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                    return;
                }
                this.method83(-104, "alreadyloaded");
                return;
            }
            class23.field353 = this;
            class79.field1174 = arg2;
            class198.field3042 = 0;
            class243.field3838 = arg1;
            class182.field2829 = arg1;
            class223.field3455 = 0;
            class233.field3712 = arg3;
            class107.field1535 = arg3;
            String var6 = this.getParameter("openwinjs");
            if (var6 != null && var6.equals("1")) {
                class25.field367 = true;
            } else {
                class25.field367 = false;
            }
            if (class96.field1382 == null) {
                class148.field2394 = class96.field1382 = new class274(this, arg4, (String) null, 0);
            }
            class158 var7 = class96.field1382.method1952(0, 1, this);
            while (var7.field2542 == 0) {
                class177.method1246(10L, -32644);
            }
            class96.field1395 = (Thread) var7.field2538;
        } catch (Exception var9) {
            class326.method2328(var9, (String) null, true);
            this.method83(-104, "crash");
        }
    }

    @OriginalMember(owner = "client!l", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 1414)
    public final synchronized void paint(Graphics arg0) {
        field148++;
        if (class23.field353 != this || class153.field2483) {
            return;
        }
        class143.field2304 = true;
        if (class291.field4838 && !class245.field3886 && class19.method122(-12169) - class86.field1238 > 1000L) {
            Rectangle var2 = arg0.getClipBounds();
            if (var2 == null || var2.width >= class107.field1535 && var2.height >= class182.field2829) {
                class8.field101 = true;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "start", descriptor = "()V", line = 1437)
    public final void start() {
        field155++;
        if (class23.field353 == this && !class153.field2483) {
            class122.field1819 = 0L;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;)V", line = 1452)
    public final void method83(int arg0, String arg1) {
        field129++;
        if (this.field134) {
            return;
        }
        this.field134 = true;
        System.out.println("error_game_" + arg1);
        if (arg0 != -104) {
            field146 = (class203) null;
        }
        try {
            class73.method499(77, "loggedout", class96.field1382.field4515);
        } catch (Throwable var6) {
        }
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + arg1 + ".ws"), "_top");
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 1478)
    private final void method84(int arg0) {
        field131++;
        long var2 = class19.method122(arg0 - 12200);
        long var4 = class44.field645[class90.field1309];
        class44.field645[class90.field1309] = var2;
        class90.field1309 = arg0 & class90.field1309 + 1;
        synchronized (this) {
            class23.field345 = class244.field3848;
        }
        this.method91(3516);
        if (var4 != 0L && var2 > var4) {
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 1509)
    public static final void method85(int arg0, int arg1) {
        field141++;
        class153.field2480.method645(arg0, (byte) -65);
        if (arg1 != -1) {
            providesignlink((class274) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "windowDeiconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1523)
    public final void windowDeiconified(WindowEvent arg0) {
        field140++;
    }

    @OriginalMember(owner = "client!l", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;", line = 1533)
    public final AppletContext getAppletContext() {
        field133++;
        if (class217.field3350 == null) {
            return class96.field1382 == null || class96.field1382.field4515 == this ? super.getAppletContext() : class96.field1382.field4515.getAppletContext();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V", line = 1548)
    public static void method86(boolean arg0) {
        field146 = null;
        if (!arg0) {
            providesignlink((class274) null);
        }
    }

    @OriginalMember(owner = "client!l", name = "windowIconified", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1558)
    public final void windowIconified(WindowEvent arg0) {
        field151++;
    }

    @OriginalMember(owner = "client!l", name = "windowClosing", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1565)
    public final void windowClosing(WindowEvent arg0) {
        field135++;
        this.destroy();
    }

    @OriginalMember(owner = "client!l", name = "windowClosed", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1576)
    public final void windowClosed(WindowEvent arg0) {
        field149++;
    }

    @OriginalMember(owner = "client!l", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 1583)
    public final String getParameter(String arg0) {
        field125++;
        if (class217.field3350 == null) {
            return class96.field1382 == null || class96.field1382.field4515 == this ? super.getParameter(arg0) : class96.field1382.field4515.getParameter(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1600)
    public final void focusLost(FocusEvent arg0) {
        class244.field3848 = false;
        field158++;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 1608)
    private final void method87(int arg0) {
        field156++;
        long var2 = class19.method122(arg0 ^ 0xEF6F3056);
        long var4 = class84.field1207[class315.field5194];
        class84.field1207[class315.field5194] = var2;
        if (var4 != 0L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class352.field5612 = ((var6 >> 1) + 32000) / var6;
        }
        if (arg0 != 277930017) {
            this.method81(-7, -3, -93, 112, 123);
        }
        class315.field5194 = class315.field5194 + 1 & 0x1F;
        if ((class56.field865++) > 50) {
            class56.field865 -= 50;
            class143.field2304 = true;
            class235.field3731.setSize(class233.field3712, class243.field3838);
            class235.field3731.setVisible(true);
            if (class217.field3350 != null && class296.field4907 == null) {
                Insets var7 = class217.field3350.getInsets();
                class235.field3731.setLocation(var7.left + class198.field3042, var7.top - -class223.field3455);
            } else {
                class235.field3731.setLocation(class198.field3042, class223.field3455);
            }
        }
        this.method77((byte) 44);
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(B)V", line = 1652)
    public static final void method88(byte arg0) {
        class312.field5086.method651(0);
        if (arg0 < 11) {
            method86(true);
        }
        field147++;
        class213.field3246.method651(0);
        class69.field1069.method651(0);
    }

    @OriginalMember(owner = "client!l", name = "providesignlink", descriptor = "(Luo;)V", line = 1669)
    public static final void providesignlink(class274 arg0) {
        class96.field1382 = arg0;
        class148.field2394 = arg0;
        field137++;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 1681)
    public final synchronized void method90(int arg0) {
        field138++;
        if (class235.field3731 != null) {
            class235.field3731.removeFocusListener(this);
            class235.field3731.getParent().remove(class235.field3731);
        }
        Container var2;
        if (class296.field4907 != null) {
            var2 = class296.field4907;
        } else if (class217.field3350 == null) {
            var2 = class96.field1382.field4515;
        } else {
            var2 = class217.field3350;
        }
        var2.setLayout((LayoutManager) null);
        class235.field3731 = new class32(this);
        var2.add(class235.field3731);
        class235.field3731.setSize(class233.field3712, class243.field3838);
        class235.field3731.setVisible(true);
        if (class217.field3350 == var2) {
            Insets var3 = class217.field3350.getInsets();
            class235.field3731.setLocation(class198.field3042 + var3.left, class223.field3455 + var3.top);
        } else {
            class235.field3731.setLocation(class198.field3042, class223.field3455);
        }
        class235.field3731.addFocusListener(this);
        class235.field3731.requestFocus();
        class244.field3848 = true;
        class143.field2304 = true;
        class8.field101 = false;
        class23.field345 = true;
        if (arg0 != 2) {
            this.method89((byte) 102);
        }
        class86.field1238 = class19.method122(-12169);
    }

    @OriginalMember(owner = "client!l", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 1732)
    public final void focusGained(FocusEvent arg0) {
        field126++;
        class244.field3848 = true;
        class143.field2304 = true;
    }

    @OriginalMember(owner = "client!l", name = "windowActivated", descriptor = "(Ljava/awt/event/WindowEvent;)V", line = 1752)
    public final void windowActivated(WindowEvent arg0) {
        field139++;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
    public abstract void method77(byte arg0);

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public abstract void method78(byte arg0);

    @OriginalMember(owner = "client!l", name = "init", descriptor = "()V")
    public abstract void init();

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public abstract void method82(int arg0);

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(B)V")
    public abstract void method89(byte arg0);

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public abstract void method91(int arg0);
}
