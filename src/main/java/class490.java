import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class490 extends class291 {

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "[I")
    private int[] field7055 = new int[512];

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "[I")
    public static int[] field7056 = new int[32];

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "Z")
    public static boolean field7062 = false;

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
    public static int field7057;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "Lnba;")
    public static class488 field7060;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IFIIF[FIIIFF)V", line = 3)
    public final void method1833(int arg0, float arg1, int arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, int arg8, float arg9, float arg10) {
        field7059++;
        int var12 = (int) ((float) arg8 * arg4 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg2 * arg1 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg7 * arg9 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg0 * arg9;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        int var24 = var20 & var17;
        float var25 = class136.method972((byte) -122, var21);
        int var26 = this.field7055[var23];
        int var27 = this.field7055[var24];
        for (int var28 = 0; var28 < arg2; var28++) {
            float var29 = (float) var28 * arg1;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            int var34 = var31 & var15;
            int var35 = var30 & var15;
            float var36 = class136.method972((byte) 126, var32);
            int var37 = this.field7055[var26 + var35];
            int var38 = this.field7055[var34 + var26];
            int var39 = this.field7055[var27 + var35];
            int var40 = this.field7055[var27 + var34];
            for (int var41 = 0; var41 < arg8; var41++) {
                float var42 = (float) var41 * arg4;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class136.method972((byte) -125, var45);
                int var49 = var44 & var13;
                arg5[arg6++] = class426.method2646(var25, class426.method2646(var36, class426.method2646(var48, class364.method2294((byte) -16, var32, class368.method2314(this.field7055[var40 + var49], 7), var21, var45), class364.method2294((byte) -16, var32, class368.method2314(this.field7055[var40 + var47], 7), var21, var46), 104), class426.method2646(var48, class364.method2294((byte) -16, var33, class368.method2314(this.field7055[var39 + var49], 7), var21, var45), class364.method2294((byte) -16, var33, class368.method2314(7, this.field7055[var39 + var47]), var21, var46), 86), 118), class426.method2646(var36, class426.method2646(var48, class364.method2294((byte) -16, var32, class368.method2314(this.field7055[var38 + var49], 7), var22, var45), class364.method2294((byte) -16, var32, class368.method2314(this.field7055[var38 + var47], 7), var22, var46), 122), class426.method2646(var48, class364.method2294((byte) -16, var33, class368.method2314(7, this.field7055[var37 + var49]), var22, var45), class364.method2294((byte) -16, var33, class368.method2314(7, this.field7055[var47 + var37]), var22, var46), 116), 86), 126) * arg10;
            }
        }
        if (arg3 >= -115) {
            method2984((byte) -69, -95, 1, 14);
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)V", line = 93)
    public static final void method2983(int arg0) {
        field7057++;
        if (class35.field318 == 0 || class35.field318 == 5) {
            return;
        }
        try {
            short var1;
            if (class42.field704 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (var1 < ++class288.field3993) {
                if (class325.field4415 != null) {
                    class325.field4415.method1581(false);
                    class325.field4415 = null;
                }
                if (class42.field704 >= 3) {
                    class35.field318 = 0;
                    class743.method4134(true, -5);
                    return;
                }
                if (class39.field672 == 2) {
                    class214.field3215.method3150((byte) -15);
                } else {
                    class542.field7861.method3150((byte) -15);
                }
                class42.field704++;
                class35.field318 = 1;
                class288.field3993 = 0;
            }
            if (class35.field318 == 1) {
                if (class39.field672 == 2) {
                    class196.field2868 = class214.field3215.method3152(class345.field4749, (byte) -126);
                } else {
                    class196.field2868 = class542.field7861.method3152(class345.field4749, (byte) -127);
                }
                class35.field318 = 2;
            }
            if (class35.field318 == 2) {
                if (class196.field2868.field6198 == 2) {
                    throw new IOException();
                }
                if (class196.field2868.field6198 != 1) {
                    return;
                }
                class325.field4415 = class671.method3826((Socket) class196.field2868.field6200, 7500, 1);
                class196.field2868 = null;
                class196.method1381(false);
                class88 var2 = class144.method1008((byte) 121);
                var2.field1260.method2881(class105.field1484.field9838, (byte) 119);
                class523.method3183(var2, (byte) 31);
                class521.method3165((byte) 95);
                class35.field318 = 3;
            }
            if (class35.field318 == 3) {
                if (!class325.field4415.method1579(1, 25562)) {
                    return;
                }
                class325.field4415.method1577(false, class352.field5213.field6800, 1, 0);
                int var3 = class352.field5213.field6800[0] & 0xFF;
                if (var3 != 0) {
                    class35.field318 = 0;
                    class743.method4134(true, var3);
                    class325.field4415.method1581(false);
                    class325.field4415 = null;
                    class597.method3495(-10);
                    return;
                }
                class352.field5213.field6864 = 0;
                class479 var4 = new class479(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method2881(10, (byte) 117);
                var4.method2926((byte) -122, var5[0]);
                var4.method2926((byte) -116, var5[1]);
                var4.method2926((byte) -121, var5[2]);
                var4.method2926((byte) -125, var5[3]);
                var4.method2912((byte) 81, 0L);
                var4.method2902(class669.field9541, false);
                var4.method2912((byte) 57, class499.field7171);
                var4.method2912((byte) 59, class37.field339);
                var4.method2895(arg0 ^ 0xFFFFFFB2, class204.field3059, class481.field6868);
                class196.method1381(false);
                class88 var6 = class144.method1008((byte) 119);
                class168 var7 = var6.field1260;
                if (class39.field672 == 2) {
                    if (class369.field5392 == 13) {
                        var7.method2881(class105.field1492.field9838, (byte) 112);
                    } else {
                        var7.method2881(class105.field1490.field9838, (byte) 113);
                    }
                    var7.method2862(0, arg0 ^ 0xBA72015A);
                    int var8 = var7.field6864;
                    var7.method2926((byte) -118, 630);
                    var7.method2898(0, var4.field6800, (byte) -115, var4.field6864);
                    int var9 = var7.field6864;
                    var7.method2902(class505.field7344, false);
                    var7.method2881(class544.field7903, (byte) 113);
                    var7.method2881(class184.method1305(1), (byte) 120);
                    var7.method2862(class68.field1042, -1166933656);
                    var7.method2862(class565.field8187, -1166933656);
                    var7.method2881(class243.field3580.field8017.method2498(false), (byte) 124);
                    class55.method526(var7, (byte) -49);
                    var7.method2902(class565.field8191, false);
                    var7.method2926((byte) -128, class50.field813);
                    class479 var10 = class243.field3580.method3305((byte) -113);
                    var7.method2881(var10.field6864, (byte) 120);
                    var7.method2898(0, var10.field6800, (byte) -108, var10.field6864);
                    class713.field10057 = true;
                    class479 var11 = new class479(class257.field3685.method1482((byte) -39));
                    class257.field3685.method1481(127, var11);
                    var7.method2898(0, var11.field6800, (byte) -126, var11.field6800.length);
                    var7.method2862(class732.field10259, arg0 ^ 0xBA72015A);
                    var7.method2912((byte) 107, class461.field6558);
                    var7.method2881(class100.field1445 == null ? 0 : 1, (byte) 119);
                    if (class100.field1445 != null) {
                        var7.method2902(class100.field1445, false);
                    }
                    var7.method2881(class176.method1263((byte) -124, "jagtheora") ? 1 : 0, (byte) 125);
                    class545.method3278(var7, arg0 ^ 0x3D);
                    var7.method2861(-97, var5, var7.field6864, var9);
                    var7.method2869(var7.field6864 - var8, 3);
                } else {
                    var7.method2881(class105.field1493.field9838, (byte) 113);
                    var7.method2862(0, -1166933656);
                    int var12 = var7.field6864;
                    var7.method2926((byte) -119, 630);
                    var7.method2898(0, var4.field6800, (byte) -106, var4.field6864);
                    int var13 = var7.field6864;
                    var7.method2902(class505.field7344, false);
                    var7.method2881(class528.field7683.field4258, (byte) 111);
                    var7.method2881(class45.field748, (byte) 124);
                    class55.method526(var7, (byte) -49);
                    var7.method2902(class565.field8191, false);
                    var7.method2926((byte) -128, class50.field813);
                    class545.method3278(var7, 15);
                    var7.method2861(-59, var5, var7.field6864, var13);
                    var7.method2869(var7.field6864 - var12, 3);
                }
                class523.method3183(var6, (byte) 31);
                class521.method3165((byte) 88);
                class583.field8319 = new class684(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class352.field5213.method1201(var5, false);
                class35.field318 = 4;
            }
            if (class35.field318 == 4) {
                if (!class325.field4415.method1579(1, arg0 + 25512)) {
                    return;
                }
                class325.field4415.method1577(false, class352.field5213.field6800, 1, 0);
                int var15 = class352.field5213.field6800[0] & 0xFF;
                if (var15 == 21) {
                    class35.field318 = 7;
                } else if (var15 == 29) {
                    class35.field318 = 13;
                } else if (var15 == 1) {
                    class35.field318 = 5;
                    class743.method4134(true, var15);
                    return;
                } else if (var15 == 2) {
                    class35.field318 = 8;
                } else if (var15 == 15) {
                    class35.field318 = 14;
                    class322.field4395 = -2;
                } else if (var15 == 23 && class42.field704 < 3) {
                    class35.field318 = 1;
                    class42.field704++;
                    class288.field3993 = 0;
                    class325.field4415.method1581(false);
                    class325.field4415 = null;
                    return;
                } else {
                    class35.field318 = 0;
                    class743.method4134(true, var15);
                    class325.field4415.method1581(false);
                    class325.field4415 = null;
                    class597.method3495(-10);
                    return;
                }
            }
            if (class35.field318 == 6) {
                class196.method1381(false);
                class88 var16 = class144.method1008((byte) 54);
                class168 var17 = var16.field1260;
                var17.method1204(class583.field8319, arg0 ^ 0x3A93194);
                var17.method1200(class105.field1499.field9838, -22676);
                class523.method3183(var16, (byte) 31);
                class521.method3165((byte) 70);
                class35.field318 = 4;
            } else if (class35.field318 == 7) {
                if (class325.field4415.method1579(1, 25562)) {
                    class325.field4415.method1577(false, class352.field5213.field6800, 1, 0);
                    int var18 = class352.field5213.field6800[0] & 0xFF;
                    class35.field318 = 0;
                    class666.field9518 = (var18 + 3) * 60;
                    class743.method4134(true, 21);
                    class325.field4415.method1581(false);
                    class325.field4415 = null;
                    class597.method3495(-10);
                }
            } else if (class35.field318 == 13) {
                if (class325.field4415.method1579(1, arg0 + 25512)) {
                    class325.field4415.method1577(false, class352.field5213.field6800, 1, 0);
                    class228.field3417 = class352.field5213.field6800[0] & 0xFF;
                    class35.field318 = 0;
                    class743.method4134(true, 29);
                    class325.field4415.method1581(false);
                    class325.field4415 = null;
                    class597.method3495(-10);
                }
            } else if (class35.field318 != 8) {
                if (class35.field318 == 9) {
                    class168 var19 = class352.field5213;
                    if (class39.field672 == 2) {
                        if (!class325.field4415.method1579(class525.field7638, 25562)) {
                            return;
                        }
                        class325.field4415.method1577(false, var19.field6800, class525.field7638, 0);
                        var19.field6864 = 0;
                        class598.field8507 = var19.method2886(true);
                        class25.field224 = var19.method2886(true);
                        class321.field4368 = var19.method2886(true) == 1;
                        class212.field3171 = var19.method2886(true) == 1;
                        class605.field8584 = var19.method2886(true) == 1;
                        class748.field10423 = var19.method2886(true) == 1;
                        class652.field9348 = var19.method2882(-1);
                        class297.field4063 = var19.method2886(true) == 1;
                        class70.field1076 = var19.method2908(-65);
                        class502.field7304 = var19.method2886(true) == 1;
                        class375.field5421.method2684(class502.field7304, (byte) 102);
                        class425.field6147.method4141(class502.field7304, 127);
                        class288.field4000.method2826(class502.field7304, 91);
                    } else if (class325.field4415.method1579(class525.field7638, arg0 + 25512)) {
                        class325.field4415.method1577(false, var19.field6800, class525.field7638, 0);
                        var19.field6864 = 0;
                        class598.field8507 = var19.method2886(true);
                        class25.field224 = var19.method2886(true);
                        class321.field4368 = var19.method2886(true) == 1;
                        class212.field3171 = var19.method2886(true) == 1;
                        class605.field8584 = var19.method2886(true) == 1;
                        class174.field2448 = var19.method2870(-11395);
                        class297.field4063 = class174.field2448 > 0;
                        class743.field10371 = var19.method2882(arg0 - 51);
                        class399.field5705 = var19.method2882(arg0 - 51);
                        class295.field4053 = var19.method2882(-1);
                        class654.field9358 = var19.method2868(-36);
                        class601.field8532 = class345.field4749.method1881(-121, class654.field9358);
                        class674.field9596 = var19.method2886(true);
                        class186.field2608 = var19.method2882(-1);
                        class57.field972 = var19.method2882(-1);
                        class564.field8172 = var19.method2886(true) == 1;
                        class108.field1536.field9056 = class108.field1536.field9096 = var19.method2876(-1);
                        class235.field3515 = var19.method2886(true);
                        class629.field8916 = var19.method2868(-99);
                        class296.field4058 = new class518();
                        class296.field4058.field7472 = var19.method2882(-1);
                        if (class296.field4058.field7472 == 65535) {
                            class296.field4058.field7472 = -1;
                        }
                        class296.field4058.field7468 = var19.method2876(-1);
                        if (class536.field7793 != class25.field223) {
                            class296.field4058.field7471 = class296.field4058.field7472 + 50000;
                            class296.field4058.field7464 = class296.field4058.field7472 + 40000;
                        }
                        if (class25.field223 != class246.field3590 && (class214.field3215.method3148(class342.field4706, -1) || class214.field3215.method3148(class224.field3306, arg0 ^ 0xFFFFFFCD))) {
                            class181.method1283(true);
                        }
                    } else {
                        return;
                    }
                    if ((!class321.field4368 || class605.field8584) && !class297.field4063) {
                        try {
                            class665.method3803(class486.field6999, "unzap", (byte) 111);
                        } catch (Throwable var24) {
                        }
                    } else {
                        try {
                            class665.method3803(class486.field6999, "zap", (byte) 119);
                        } catch (Throwable var26) {
                            if (class259.field3703) {
                                try {
                                    class486.field6999.getAppletContext().showDocument(new URL(class486.field6999.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var25) {
                                }
                            }
                        }
                    }
                    if (class536.field7793 == class25.field223) {
                        try {
                            class665.method3803(class486.field6999, "loggedin", (byte) 117);
                        } catch (Throwable var23) {
                        }
                    }
                    if (class39.field672 != 2) {
                        class35.field318 = 0;
                        class743.method4134(true, 2);
                        class242.method1664(48);
                        class79.method649(-19704, 7);
                        class53.field834 = null;
                        return;
                    }
                    class35.field318 = 11;
                }
                if (class35.field318 == 11) {
                    if (!class325.field4415.method1579(3, arg0 + 25512)) {
                        return;
                    }
                    class325.field4415.method1577(false, class352.field5213.field6800, 3, 0);
                    class35.field318 = 12;
                }
                if (class35.field318 == 12) {
                    class168 var20 = class352.field5213;
                    var20.field6864 = 0;
                    if (var20.method1197(arg0 - 437324529)) {
                        if (!class325.field4415.method1579(1, 25562)) {
                            return;
                        }
                        class325.field4415.method1577(false, var20.field6800, 1, 3);
                    }
                    class53.field834 = class335.method2051(83)[var20.method1207(false)];
                    class322.field4395 = var20.method2882(-1);
                    class35.field318 = 10;
                }
                if (class35.field318 == 10) {
                    if (class325.field4415.method1579(class322.field4395, 25562)) {
                        class325.field4415.method1577(false, class352.field5213.field6800, class322.field4395, 0);
                        class352.field5213.field6864 = 0;
                        int var21 = class322.field4395;
                        class35.field318 = 0;
                        class743.method4134(true, 2);
                        class121.method856((byte) -3);
                        class223.method1553(class352.field5213, (byte) 55);
                        class401.field5750 = -1;
                        if (class53.field834 == class313.field4237) {
                            class82.method660((byte) 107);
                        } else {
                            class441.method2699((byte) 82);
                        }
                        if (class352.field5213.field6864 != var21) {
                            throw new RuntimeException("lswp pos:" + class352.field5213.field6864 + " psize:" + var21);
                        }
                        class53.field834 = null;
                    }
                } else if (arg0 == 50 && class35.field318 == 14) {
                    if (class322.field4395 == -2) {
                        if (!class325.field4415.method1579(2, arg0 + 25512)) {
                            return;
                        }
                        class325.field4415.method1577(false, class352.field5213.field6800, 2, 0);
                        class352.field5213.field6864 = 0;
                        class322.field4395 = class352.field5213.method2882(arg0 ^ 0xFFFFFFCD);
                    }
                    if (class325.field4415.method1579(class322.field4395, 25562)) {
                        class325.field4415.method1577(false, class352.field5213.field6800, class322.field4395, 0);
                        class352.field5213.field6864 = 0;
                        class35.field318 = 0;
                        int var22 = class322.field4395;
                        class743.method4134(true, 15);
                        class591.method3470((byte) -109);
                        class223.method1553(class352.field5213, (byte) 55);
                        if (class352.field5213.field6864 != var22) {
                            throw new RuntimeException("lswpr pos:" + class352.field5213.field6864 + " psize:" + var22);
                        }
                        class53.field834 = null;
                    }
                }
            } else if (class325.field4415.method1579(1, arg0 ^ 0x63E8)) {
                class325.field4415.method1577(false, class352.field5213.field6800, 1, 0);
                class35.field318 = 9;
                class525.field7638 = class352.field5213.field6800[0] & 0xFF;
            }
        } catch (IOException var27) {
            if (class325.field4415 != null) {
                class325.field4415.method1581(false);
                class325.field4415 = null;
            }
            if (class42.field704 >= 3) {
                class35.field318 = 0;
                class743.method4134(true, -4);
                class597.method3495(-10);
            } else {
                if (class39.field672 == 2) {
                    class214.field3215.method3150((byte) -15);
                } else {
                    class542.field7861.method3150((byte) -15);
                }
                class42.field704++;
                class35.field318 = 1;
                class288.field3993 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(BIII)I", line = 683)
    public static final int method2984(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -50) {
            return -50;
        }
        int var4 = arg3 & 0x3;
        field7058++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return 4095 - arg1;
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(I)V", line = 720)
    public class490(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field7055[var3] = this.field7055[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field7055[var5];
            this.field7055[var5] = this.field7055[var5 + 256] = this.field7055[var4];
            this.field7055[var4] = this.field7055[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Z)V", line = 710)
    public static void method2985(boolean arg0) {
        field7056 = null;
        field7060 = null;
        if (!arg0) {
            method2984((byte) 29, 89, -43, -105);
        }
    }
}
