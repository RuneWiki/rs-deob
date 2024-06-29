import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "q", descriptor = "B")
    public byte field70;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "B")
    public byte field64;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public int field55;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "S")
    public short field61;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "Z")
    public boolean field56;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "S")
    public short field65;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public int field63;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "S")
    public short field57;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public int field54;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
    public static int[] field60 = new int[2048];

    @OriginalMember(owner = "client!to", name = "f", descriptor = "Z")
    public static boolean field59 = false;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
    public static void method32(int arg0) {
        field60 = null;
        if (arg0 != 0) {
            method33(46);
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public static final void method33(int arg0) {
        field62++;
        if (class193.field2807 == arg0 || class193.field2807 == 6) {
            return;
        }
        try {
            if (++class212.field3201 > 2000) {
                if (class410.field5802 != null) {
                    class410.field5802.method1291(true);
                    class410.field5802 = null;
                }
                if (class502.field7246 >= 1) {
                    class193.field2807 = 0;
                    class102.method748((byte) 49, -5);
                    return;
                }
                if (class497.field7189 == 2 || class497.field7189 == 3) {
                    class474.field6918.field4015 = !class474.field6918.field4015;
                } else {
                    class259.field3835.field4015 = !class259.field3835.field4015;
                }
                class212.field3201 = 0;
                class193.field2807 = 1;
                class502.field7246++;
            }
            if (class193.field2807 == 1) {
                if (class497.field7189 == 2 || class497.field7189 == 3) {
                    class110.field1628 = class280.field4173.method2441(class474.field6918.field4009, class474.field6918.method1719((byte) -120), -32);
                } else {
                    class110.field1628 = class280.field4173.method2441(class259.field3835.field4009, class259.field3835.method1719((byte) -123), -82);
                }
                class193.field2807 = 2;
            }
            if (class193.field2807 == 2) {
                if (class110.field1628.field1314 == 2) {
                    throw new IOException();
                }
                if (class110.field1628.field1314 != 1) {
                    return;
                }
                class410.field5802 = class58.method491(5000, 1024, (Socket) class110.field1628.field1311);
                class110.field1628 = null;
                long var1 = class256.field3796 = class512.method2995(class339.field5024, 0);
                class276.field4124.field7558 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class276.field4124.method3048(arg0 - 2034159384, class195.field2838.field19);
                class276.field4124.method3048(-2034159384, var3);
                class410.field5802.method1296(2, 0, arg0 + 20188, class276.field4124.field7545);
                class193.field2807 = 3;
            }
            if (class193.field2807 == 3) {
                if (!class410.field5802.method1298(1, 127)) {
                    return;
                }
                class410.field5802.method1299(class336.field4966.field7545, 0, 1, 4470);
                int var4 = class336.field4966.field7545[0] & 0xFF;
                if (var4 != 0) {
                    class193.field2807 = 0;
                    class102.method748((byte) 49, var4);
                    class410.field5802.method1291(true);
                    class410.field5802 = null;
                    class173.method1219((byte) 83);
                    return;
                }
                class193.field2807 = 4;
            }
            if (class193.field2807 == 4) {
                if (!class410.field5802.method1298(8, arg0 + 100)) {
                    return;
                }
                class410.field5802.method1299(class336.field4966.field7545, 0, 8, 4470);
                class336.field4966.field7558 = 0;
                class142.field2183 = class336.field4966.method3061(16556);
                class519 var5 = new class519(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class142.field2183 >> 32), (int) class142.field2183 };
                var5.method3048(arg0 ^ 0x86C130E8, 10);
                var5.method3019(var6[0], arg0 ^ 0x2D80);
                var5.method3019(var6[1], arg0 + 11648);
                var5.method3019(var6[2], 11648);
                var5.method3019(var6[3], 11648);
                var5.method3014(class512.method2995(class339.field5024, arg0), -2);
                var5.method3057((byte) -28, class18.field206);
                var5.method3041(class472.field6868, class84.field1333, 0);
                class415 var7 = class276.field4124;
                var7.field7558 = 0;
                if (class497.field7189 == 2 || class497.field7189 == 3) {
                    if (class37.field799 == 12) {
                        var7.method3048(arg0 - 2034159384, class195.field2842.field19);
                    } else {
                        var7.method3048(-2034159384, class195.field2840.field19);
                    }
                    var7.method3016(0, -108);
                    int var9 = var7.field7558;
                    var7.method3019(604, arg0 + 11648);
                    var7.method3048(-2034159384, class84.field1337);
                    var7.method3048(-2034159384, class360.method2235(32397));
                    var7.method3016(class50.field927, arg0 ^ 0xFFFFFFAB);
                    var7.method3016(class76.field1247, arg0 - 25);
                    var7.method3048(-2034159384, class220.field3371.field2576);
                    class368.method2256((byte) -74, var7);
                    var7.method3057((byte) -28, class394.field5615);
                    var7.method3019(class446.field6374, 11648);
                    class519 var10 = class220.field3371.method1051(false);
                    var7.method3048(-2034159384, var10.field7558);
                    var7.method3058(var10.field7545, (byte) 72, 0, var10.field7558);
                    class132.field2068 = true;
                    class519 var11 = new class519(class338.method2145((byte) -72));
                    (new class313()).method1986(var11, 0);
                    var7.method3058(var11.field7545, (byte) 72, 0, var11.field7545.length);
                    var7.method3016(class114.field1700, arg0 ^ 0xFFFFFFE5);
                    class89.method662(arg0 ^ 0x395A);
                    var7.method3058(var5.field7545, (byte) 72, 0, var5.field7558);
                    var7.method3043(var7.field7558 - var9, -30437);
                } else {
                    var7.method3048(arg0 - 2034159384, class195.field2843.field19);
                    var7.method3016(0, -90);
                    int var8 = var7.field7558;
                    var7.method3019(604, 11648);
                    var7.method3048(-2034159384, class14.field163.field6607);
                    var7.method3048(-2034159384, class503.field7255);
                    class368.method2256((byte) -74, var7);
                    var7.method3057((byte) -28, class394.field5615);
                    var7.method3019(class446.field6374, 11648);
                    class89.method662(arg0 ^ 0x395A);
                    var7.method3058(var5.field7545, (byte) 72, 0, var5.field7558);
                    var7.method3043(var7.field7558 - var8, -30437);
                }
                class410.field5802.method1296(var7.field7558, 0, 20188, var7.field7545);
                var7.method2478(-34, var6);
                for (int var12 = 0; var12 < 4; var12++) {
                    var6[var12] += 50;
                }
                class336.field4966.method2478(103, var6);
                class193.field2807 = 5;
            }
            if (class193.field2807 == 5) {
                if (!class410.field5802.method1298(1, 83)) {
                    return;
                }
                class410.field5802.method1299(class336.field4966.field7545, 0, 1, 4470);
                int var13 = class336.field4966.field7545[0] & 0xFF;
                if (var13 == 21) {
                    class193.field2807 = 8;
                } else if (var13 == 29) {
                    class193.field2807 = 14;
                } else if (var13 == 1) {
                    class193.field2807 = 6;
                    class102.method748((byte) 49, var13);
                    return;
                } else if (var13 == 2) {
                    class193.field2807 = 9;
                } else if (var13 == 15) {
                    class305.field4527 = -2;
                    class193.field2807 = 15;
                } else if (var13 == 23 && class502.field7246 < 1) {
                    class502.field7246++;
                    class193.field2807 = 1;
                    class212.field3201 = 0;
                    class410.field5802.method1291(true);
                    class410.field5802 = null;
                    return;
                } else {
                    class193.field2807 = 0;
                    class102.method748((byte) 49, var13);
                    class410.field5802.method1291(true);
                    class410.field5802 = null;
                    class173.method1219((byte) 115);
                    return;
                }
            }
            if (class193.field2807 == 7) {
                class276.field4124.field7558 = 0;
                class276.field4124.method2480(true, class195.field2850.field19);
                class410.field5802.method1296(class276.field4124.field7558, 0, 20188, class276.field4124.field7545);
                class193.field2807 = 5;
            } else if (class193.field2807 == 8) {
                if (class410.field5802.method1298(1, 95)) {
                    class410.field5802.method1299(class336.field4966.field7545, 0, 1, 4470);
                    int var14 = class336.field4966.field7545[0] & 0xFF;
                    class482.field6999 = var14 * 60 + 180;
                    class193.field2807 = 0;
                    class102.method748((byte) 49, 21);
                    class410.field5802.method1291(true);
                    class410.field5802 = null;
                    class173.method1219((byte) 85);
                }
            } else if (class193.field2807 == 14) {
                if (class410.field5802.method1298(1, 125)) {
                    class410.field5802.method1299(class336.field4966.field7545, 0, 1, 4470);
                    class193.field2807 = 0;
                    class25.field355 = class336.field4966.field7545[0] & 0xFF;
                    class102.method748((byte) 49, 29);
                    class410.field5802.method1291(true);
                    class410.field5802 = null;
                    class173.method1219((byte) 114);
                }
            } else if (class193.field2807 != 9) {
                if (class193.field2807 == 10) {
                    class415 var15 = class336.field4966;
                    if (class497.field7189 == 3) {
                        class363.field5264 = true;
                    } else {
                        class363.field5264 = false;
                    }
                    if (class497.field7189 == 2 || class497.field7189 == 3) {
                        if (!class410.field5802.method1298(class472.field6871, arg0 + 98)) {
                            return;
                        }
                        class410.field5802.method1299(var15.field7545, 0, class472.field6871, 4470);
                        var15.field7558 = 0;
                        class37.field791 = var15.method3072((byte) -119);
                        class412.field5837 = var15.method3072((byte) -121);
                        class10.field88 = var15.method3072((byte) -123) == 1;
                        class78.field1274 = var15.method3072((byte) -126) == 1;
                        class122.field1914 = var15.method3072((byte) -125) == 1;
                        class317.field4710 = var15.method3072((byte) -119) == 1;
                        class497.field7188 = var15.method3018(arg0 + 566990904);
                        class92.field1477 = var15.method3072((byte) -126) == 1;
                        class123.field1921 = var15.method3047((byte) -74);
                        class258.field3827 = var15.method3072((byte) -120) == 1;
                        if (class497.field7189 == 3) {
                            boolean var16 = var15.method3072((byte) -125) == 1;
                            if (var16) {
                                long var17 = var15.method3061(arg0 + 16556);
                                String var19 = class76.method587(var17, (byte) -53);
                                int var20 = var15.method3072((byte) -121);
                                byte[] var21 = new byte[var20];
                                var15.method2486(0, var20, var21, false);
                                String var22 = class300.method1924(var21, (byte) -103);
                                class536 var23 = null;
                                try {
                                    class81 var24 = class280.field4173.method2463(false, "3", false);
                                    while (var24.field1314 == 0) {
                                        class477.method2826(1L, 0);
                                    }
                                    if (var24.field1314 == 1) {
                                        var23 = (class536) var24.field1311;
                                        int var25 = (3 - (-var19.length() - var22.length() - 4)) + 2;
                                        if (var25 > 50) {
                                            throw new RuntimeException(">50");
                                        }
                                        class519 var26 = new class519(var25 + 1);
                                        var26.method3048(-2034159384, var25);
                                        var26.method3048(arg0 - 2034159384, 0);
                                        var26.method3071((byte) -122, var19);
                                        var26.method3071((byte) -117, var22);
                                        var26.method3079((byte) -71);
                                        var23.method3163(var26.field7545, var26.field7558, 0, 0);
                                    }
                                } catch (Exception var35) {
                                }
                                try {
                                    if (var23 != null) {
                                        var23.method3165(arg0 ^ 0xFFFFE299);
                                    }
                                } catch (Exception var33) {
                                }
                            }
                        }
                        class277.field4139.method565(class258.field3827, (byte) 124);
                        class58.field1052.method1643(arg0 ^ 0xFFFFB265, class258.field3827);
                        class117.field1812.method2307(class258.field3827, 20314);
                    } else if (class410.field5802.method1298(class472.field6871, 92)) {
                        class410.field5802.method1299(var15.field7545, 0, class472.field6871, 4470);
                        var15.field7558 = 0;
                        class37.field791 = var15.method3072((byte) -127);
                        class412.field5837 = var15.method3072((byte) -122);
                        class10.field88 = var15.method3072((byte) -123) == 1;
                        class78.field1274 = var15.method3072((byte) -125) == 1;
                        class122.field1914 = var15.method3072((byte) -120) == 1;
                        class178.field2648 = var15.method3018(566990904);
                        class92.field1477 = class178.field2648 > 0;
                        class75.field1230 = var15.method3018(566990904);
                        class26.field370 = var15.method3018(arg0 + 566990904);
                        class266.field4005 = var15.method3018(566990904);
                        class222.field3388 = var15.method3053(arg0 ^ 0xFFFFFF7F);
                        class415.field5886 = class280.field4173.method2448(class222.field3388, (byte) -123);
                        class415.field5885 = var15.method3072((byte) -123);
                        class393.field5586 = var15.method3018(566990904);
                        class272.field4087 = var15.method3018(arg0 ^ 0x21CB9838);
                        class408.field5788 = var15.method3072((byte) -126) == 1;
                        class364.field5293.field7363 = class364.field5293.field7406 = var15.method3070(false);
                        class434.field6209 = new class267();
                        class434.field6209.field4020 = var15.method3018(566990904);
                        if (class434.field6209.field4020 == 65535) {
                            class434.field6209.field4020 = -1;
                        }
                        class434.field6209.field4009 = var15.method3070(false);
                        if (class438.field6237 != class368.field5320) {
                            class434.field6209.field4014 = class434.field6209.field4020 + 50000;
                            class434.field6209.field4013 = class434.field6209.field4020 + 40000;
                        }
                        if (class368.field5320 != class339.field5023 && (class474.field6918.method1718((byte) 17, class390.field5532) || class474.field6918.method1718((byte) 17, class397.field5648))) {
                            class474.field6918 = class434.field6209;
                        }
                    } else {
                        return;
                    }
                    if ((!class10.field88 || class122.field1914) && !class92.field1477) {
                        try {
                            class325.method2066(class280.field4173.field5824, (byte) -112, "unzap");
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            class325.method2066(class280.field4173.field5824, (byte) -118, "zap");
                        } catch (Throwable var34) {
                            if (class311.field4619) {
                                try {
                                    class280.field4173.field5824.getAppletContext().showDocument(new URL(class280.field4173.field5824.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var32) {
                                }
                            }
                        }
                    }
                    if (class438.field6237 == class368.field5320) {
                        try {
                            class325.method2066(class280.field4173.field5824, (byte) -71, "loggedin");
                        } catch (Throwable var30) {
                        }
                    }
                    if (class497.field7189 != 2 && class497.field7189 != 3) {
                        class193.field2807 = 0;
                        class102.method748((byte) 49, 2);
                        class18.method100(arg0 ^ 0x3FFFFF);
                        class170.method1206(1, 6);
                        class30.field405 = null;
                        return;
                    }
                    class193.field2807 = 12;
                }
                if (class193.field2807 == 12) {
                    if (!class410.field5802.method1298(3, arg0 + 117)) {
                        return;
                    }
                    class410.field5802.method1299(class336.field4966.field7545, 0, 3, 4470);
                    class193.field2807 = 13;
                }
                if (class193.field2807 == 13) {
                    class415 var27 = class336.field4966;
                    var27.field7558 = 0;
                    if (var27.method2476(8)) {
                        if (!class410.field5802.method1298(1, 103)) {
                            return;
                        }
                        class410.field5802.method1299(var27.field7545, 3, 1, 4470);
                    }
                    class30.field405 = class544.method3194(-5817)[var27.method2479(arg0 - 129)];
                    class305.field4527 = var27.method3018(566990904);
                    class193.field2807 = 11;
                }
                if (class193.field2807 == 11) {
                    if (class410.field5802.method1298(class305.field4527, arg0 + 85)) {
                        class410.field5802.method1299(class336.field4966.field7545, 0, class305.field4527, 4470);
                        class336.field4966.field7558 = 0;
                        int var28 = class305.field4527;
                        class193.field2807 = 0;
                        class102.method748((byte) 49, 2);
                        class255.method1649((byte) -121);
                        class451.method2687(class336.field4966, (byte) -23);
                        class473.field6897 = -1;
                        class7.method25(296132232);
                        if (class336.field4966.field7558 != var28) {
                            throw new RuntimeException("lswp pos:" + class336.field4966.field7558 + " psize:" + var28);
                        }
                        class30.field405 = null;
                    }
                } else if (class193.field2807 == 15) {
                    if (class305.field4527 == -2) {
                        if (!class410.field5802.method1298(2, 87)) {
                            return;
                        }
                        class410.field5802.method1299(class336.field4966.field7545, 0, 2, 4470);
                        class336.field4966.field7558 = 0;
                        class305.field4527 = class336.field4966.method3018(566990904);
                    }
                    if (class410.field5802.method1298(class305.field4527, arg0 ^ 0x61)) {
                        class410.field5802.method1299(class336.field4966.field7545, 0, class305.field4527, 4470);
                        class336.field4966.field7558 = 0;
                        int var29 = class305.field4527;
                        class193.field2807 = 0;
                        class102.method748((byte) 49, 15);
                        class421.method2500(false);
                        class451.method2687(class336.field4966, (byte) -23);
                        if (class336.field4966.field7558 != var29) {
                            throw new RuntimeException("lswpr pos:" + class336.field4966.field7558 + " psize:" + var29);
                        }
                        class30.field405 = null;
                    }
                }
            } else if (class410.field5802.method1298(1, 123)) {
                class410.field5802.method1299(class336.field4966.field7545, 0, 1, 4470);
                class193.field2807 = 10;
                class472.field6871 = class336.field4966.field7545[0] & 0xFF;
            }
        } catch (IOException var36) {
            if (class410.field5802 != null) {
                class410.field5802.method1291(true);
                class410.field5802 = null;
            }
            if (class502.field7246 >= 1) {
                class193.field2807 = 0;
                class102.method748((byte) 49, -4);
                class173.method1219((byte) 41);
            } else {
                class212.field3201 = 0;
                class193.field2807 = 1;
                if (class497.field7189 == 2 || class497.field7189 == 3) {
                    class474.field6918.field4015 = !class474.field6918.field4015;
                } else {
                    class259.field3835.field4015 = !class259.field3835.field4015;
                }
                class502.field7246++;
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field70 = (byte) arg7;
        this.field64 = (byte) arg8;
        this.field55 = arg2;
        this.field68 = arg11;
        this.field61 = (short) arg4;
        this.field66 = arg3;
        this.field56 = arg10;
        this.field65 = (short) arg6;
        this.field63 = arg0;
        this.field57 = (short) arg5;
        this.field54 = arg1;
    }
}
