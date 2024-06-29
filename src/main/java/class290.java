import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class290 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "[I")
    public static int[] field4110 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1786(int arg0, int arg1, byte arg2) {
        field4112++;
        int var3 = -120 % ((4 - arg2) / 40);
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([BLdc;IB)Lmi;")
    public static final class463 method1787(byte[] arg0, class5 arg1, int arg2, byte arg3) {
        field4113++;
        if (arg3 != 21) {
            method1788(88, 69);
        }
        if (arg0 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramRawARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class95.field1453, 0);
        if (class95.field1453[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class463(arg1, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)I")
    public static final int method1788(int arg0, int arg1) {
        field4111++;
        double var2 = (double) ((arg0 & 0xFF6A77) >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 0xFFE6) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = 114 / ((arg1 - 43) / 33);
        int var22 = (int) (var14 * 256.0D);
        int var23 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return (var23 >> 1) + (((var20 & 0xFF) >> 2 << 10) + (var22 >> 5 << 7));
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static final void method1789(int arg0) {
        field4114++;
        if (class139.field2251 == arg0 || class139.field2251 == 6) {
            return;
        }
        try {
            if ((++class276.field3863) > 2000) {
                if (class370.field4996 != null) {
                    class370.field4996.method633(9);
                    class370.field4996 = null;
                }
                if (class3.field30 >= 2) {
                    class139.field2251 = 0;
                    class218.method1384((byte) -128, -5);
                    return;
                }
                if (class173.field2675 == 2 || class173.field2675 == 3) {
                    class214.field3059.method1331(false);
                } else {
                    class38.field570.method1331(false);
                }
                class276.field3863 = 0;
                class3.field30++;
                class139.field2251 = 1;
            }
            if (class139.field2251 == 1) {
                if (class173.field2675 == 2 || class173.field2675 == 3) {
                    class382.field5097 = class214.field3059.method1330((byte) 113, class688.field9669);
                } else {
                    class382.field5097 = class38.field570.method1330((byte) 125, class688.field9669);
                }
                class139.field2251 = 2;
            }
            if (class139.field2251 == 2) {
                if (class382.field5097.field2816 == 2) {
                    throw new IOException();
                }
                if (class382.field5097.field2816 != 1) {
                    return;
                }
                class370.field4996 = class501.method2782(true, 7500, (Socket) class382.field5097.field2820);
                class382.field5097 = null;
                long var1 = class77.field1206 = class36.method285(class449.field6163, (byte) -120);
                class673.method3765(100);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class402 var4 = class142.method1037(17916);
                var4.field5354.method1980(-345277664, class597.field7916.field9432);
                var4.field5354.method1980(-345277664, var3);
                class36.method278(arg0, var4);
                class179.method1200(124);
                class139.field2251 = 3;
            }
            if (class139.field2251 == 3) {
                if (!class370.field4996.method635(1, -102)) {
                    return;
                }
                class370.field4996.method632(-36, 1, 0, class439.field6039.field4600);
                int var5 = class439.field6039.field4600[0] & 0xFF;
                if (var5 != 0) {
                    class139.field2251 = 0;
                    class218.method1384((byte) -128, var5);
                    class370.field4996.method633(arg0 + 9);
                    class370.field4996 = null;
                    class375.method2208(-7);
                    return;
                }
                class139.field2251 = 4;
            }
            if (class139.field2251 == 4) {
                if (!class370.field4996.method635(8, -55)) {
                    return;
                }
                class370.field4996.method632(-83, 8, 0, class439.field6039.field4600);
                class439.field6039.field4619 = 0;
                class638.field8589 = class439.field6039.method2016((byte) -60);
                class335 var6 = new class335(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class638.field8589 >> 32), (int) class638.field8589 };
                var6.method1980(arg0 - 345277664, 10);
                var6.method1982(var7[0], (byte) 63);
                var6.method1982(var7[1], (byte) 63);
                var6.method1982(var7[2], (byte) 63);
                var6.method1982(var7[3], (byte) 63);
                var6.method2027((byte) 122, class36.method285(class449.field6163, (byte) -120));
                var6.method2019(arg0 - 126, class509.field6793);
                var6.method2027((byte) 118, class605.field8023);
                var6.method2027((byte) -74, class342.field4709);
                var6.method1994(class301.field4199, -19, class276.field3864);
                class673.method3765(100);
                class402 var8 = class142.method1037(17916);
                class201 var9 = var8.field5354;
                if (class173.field2675 == 2 || class173.field2675 == 3) {
                    if (class32.field525 == 13) {
                        var9.method1980(-345277664, class597.field7923.field9432);
                    } else {
                        var9.method1980(-345277664, class597.field7921.field9432);
                    }
                    var9.method2031((byte) 54, 0);
                    int var10 = var9.field4619;
                    var9.method1982(617, (byte) 63);
                    var9.method1980(-345277664, class126.field2096);
                    var9.method1980(arg0 ^ 0xEB6B7B20, class662.method3719(arg0 - 1));
                    var9.method2031((byte) 54, class627.field8461);
                    var9.method2031((byte) 54, class149.field2387);
                    var9.method1980(-345277664, class344.field4718.field5449);
                    class308.method1849((byte) -12, var9);
                    var9.method2019(-88, class482.field6480);
                    var9.method1982(class88.field1330, (byte) 63);
                    class335 var11 = new class335(class561.method3085(-1));
                    class344.field4718.method2325(var11, arg0 + 1);
                    var9.method1980(-345277664, var11.field4619);
                    var9.method2004(255, var11.field4600, 0, var11.field4619);
                    class268.field3740 = true;
                    class335 var12 = new class335(class330.method1968(80));
                    (new class348(true, class688.field9669)).method2081(3, var12);
                    var9.method2004(arg0 ^ 0xFF, var12.field4600, 0, var12.field4600.length);
                    var9.method2031((byte) 54, class654.field8864);
                    var9.method2027((byte) -88, class440.field6041);
                    var9.method1980(-345277664, class592.field7827 == null ? 0 : 1);
                    if (class592.field7827 != null) {
                        var9.method2019(-88, class592.field7827);
                    }
                    class432.method2453(var9, arg0 ^ 0xFFFF8630);
                    var9.method2004(255, var6.field4600, 0, var6.field4619);
                    var9.method2015(var9.field4619 - var10, true);
                } else {
                    var9.method1980(-345277664, class597.field7924.field9432);
                    var9.method2031((byte) 54, 0);
                    int var13 = var9.field4619;
                    var9.method1982(617, (byte) 63);
                    var9.method1980(-345277664, class392.field5166.field9508);
                    var9.method1980(arg0 ^ 0xEB6B7B20, class516.field6892);
                    class308.method1849((byte) -12, var9);
                    var9.method2019(-80, class482.field6480);
                    var9.method1982(class88.field1330, (byte) 63);
                    class432.method2453(var9, -31184);
                    var9.method2004(255, var6.field4600, 0, var6.field4619);
                    var9.method2015(var9.field4619 - var13, true);
                }
                class36.method278(arg0, var8);
                class179.method1200(121);
                class262.field3644 = new class371(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class439.field6039.method1321(-128, var7);
                class139.field2251 = 5;
            }
            if (class139.field2251 == 5) {
                if (!class370.field4996.method635(1, -59)) {
                    return;
                }
                class370.field4996.method632(-94, 1, 0, class439.field6039.field4600);
                int var15 = class439.field6039.field4600[0] & 0xFF;
                if (var15 == 21) {
                    class139.field2251 = 8;
                } else if (var15 == 29) {
                    class139.field2251 = 14;
                } else if (var15 == 1) {
                    class139.field2251 = 6;
                    class218.method1384((byte) -128, var15);
                    return;
                } else if (var15 == 2) {
                    class139.field2251 = 9;
                } else if (var15 == 15) {
                    class139.field2251 = 15;
                    class269.field3754 = -2;
                } else if (var15 == 23 && class3.field30 < 2) {
                    class139.field2251 = 1;
                    class3.field30++;
                    class276.field3863 = 0;
                    class370.field4996.method633(9);
                    class370.field4996 = null;
                    return;
                } else {
                    class139.field2251 = 0;
                    class218.method1384((byte) -128, var15);
                    class370.field4996.method633(9);
                    class370.field4996 = null;
                    class375.method2208(-7);
                    return;
                }
            }
            if (class139.field2251 == 7) {
                class673.method3765(arg0 ^ 0x64);
                class402 var16 = class142.method1037(17916);
                class201 var17 = var16.field5354;
                var17.method1320(class262.field3644, true);
                var17.method1310(arg0 + 104, class597.field7931.field9432);
                class36.method278(arg0, var16);
                class179.method1200(77);
                class139.field2251 = 5;
            } else if (class139.field2251 == 8) {
                if (class370.field4996.method635(1, arg0 + 81)) {
                    class370.field4996.method632(-121, 1, 0, class439.field6039.field4600);
                    int var18 = class439.field6039.field4600[0] & 0xFF;
                    class625.field8358 = (var18 + 3) * 60;
                    class139.field2251 = 0;
                    class218.method1384((byte) -128, 21);
                    class370.field4996.method633(9);
                    class370.field4996 = null;
                    class375.method2208(-7);
                }
            } else if (class139.field2251 == 14) {
                if (class370.field4996.method635(1, arg0 - 77)) {
                    class370.field4996.method632(arg0 ^ 0xFFFFFFE6, 1, 0, class439.field6039.field4600);
                    class139.field2251 = 0;
                    class371.field5014 = class439.field6039.field4600[0] & 0xFF;
                    class218.method1384((byte) -128, 29);
                    class370.field4996.method633(9);
                    class370.field4996 = null;
                    class375.method2208(arg0 - 7);
                }
            } else if (class139.field2251 != 9) {
                if (class139.field2251 == 10) {
                    if (class173.field2675 == 3) {
                        class119.field2015 = true;
                    } else {
                        class119.field2015 = false;
                    }
                    class201 var19 = class439.field6039;
                    if (class173.field2675 == 2 || class173.field2675 == 3) {
                        if (!class370.field4996.method635(class214.field3065, 87)) {
                            return;
                        }
                        class370.field4996.method632(-38, class214.field3065, 0, var19.field4600);
                        var19.field4619 = 0;
                        class150.field2398 = var19.method2034(255);
                        class592.field7836 = var19.method2034(255);
                        class569.field7560 = var19.method2034(255) == 1;
                        class674.field9538 = var19.method2034(arg0 ^ 0xFF) == 1;
                        class420.field5806 = var19.method2034(255) == 1;
                        class261.field3587 = var19.method2034(255) == 1;
                        class416.field5693 = var19.method2001((byte) -83);
                        class221.field3125 = var19.method2034(255) == 1;
                        class175.field2692 = var19.method1993(-756647768);
                        class127.field2140 = var19.method2034(arg0 ^ 0xFF) == 1;
                        if (class173.field2675 == 3) {
                            boolean var20 = var19.method2034(arg0 ^ 0xFF) == 1;
                            if (var20) {
                                long var21 = var19.method2016((byte) -60);
                                String var23 = class170.method1158((byte) -28, var21);
                                int var24 = var19.method2034(255);
                                byte[] var25 = new byte[var24];
                                var19.method1316((byte) -120, var24, var25, 0);
                                String var26 = class701.method3882(var25, (byte) -116);
                                class488 var27 = null;
                                try {
                                    class192 var28 = class688.field9669.method2892("3", true, false);
                                    while (var28.field2816 == 0) {
                                        class486.method2722(0, 1L);
                                    }
                                    if (var28.field2816 == 1) {
                                        var27 = (class488) var28.field2820;
                                        int var29 = 11 - (-var23.length() - var26.length() - 2 - 2 - 5);
                                        if (class592.field7827 != null) {
                                            var29 += class592.field7827.length() + 2;
                                        }
                                        if (var29 > 120) {
                                            throw new RuntimeException(">120");
                                        }
                                        class335 var30 = new class335(var29 + 1);
                                        var30.method1980(-345277664, var29);
                                        var30.method1980(arg0 ^ 0xEB6B7B20, 3);
                                        var30.method2048(19988, var23);
                                        var30.method2048(19988, var26);
                                        var30.method2031((byte) 54, class88.field1330);
                                        var30.method2027((byte) -7, class440.field6041);
                                        var30.method1980(arg0 - 345277664, class592.field7827 == null ? 0 : 1);
                                        if (class592.field7827 != null) {
                                            var30.method2048(19988, class592.field7827);
                                        }
                                        var30.method1986(0);
                                        var27.method2730(0, var30.field4600, var30.field4619, -1);
                                    }
                                } catch (Exception var40) {
                                }
                                try {
                                    if (var27 != null) {
                                        var27.method2729((byte) -20);
                                    }
                                } catch (Exception var38) {
                                }
                                try {
                                    class594.method3267("demoaccountcreated", -17670, class486.field6574);
                                } catch (Throwable var37) {
                                }
                            }
                        }
                        class470.field6288.method1266(class127.field2140, (byte) -81);
                        class193.field2826.method1038(36, class127.field2140);
                        class239.field3369.method280(class127.field2140, 30);
                    } else if (class370.field4996.method635(class214.field3065, -115)) {
                        class370.field4996.method632(-77, class214.field3065, 0, var19.field4600);
                        var19.field4619 = 0;
                        class150.field2398 = var19.method2034(255);
                        class592.field7836 = var19.method2034(arg0 + 255);
                        class569.field7560 = var19.method2034(255) == 1;
                        class674.field9538 = var19.method2034(arg0 ^ 0xFF) == 1;
                        class420.field5806 = var19.method2034(255) == 1;
                        class446.field6116 = var19.method2022(arg0 ^ 0xFFFF8E5F);
                        class221.field3125 = class446.field6116 > 0;
                        class219.field3109 = var19.method2001((byte) -83);
                        class9.field193 = var19.method2001((byte) -83);
                        class188.field2789 = var19.method2001((byte) -83);
                        class405.field5465 = var19.method2045(-98);
                        class243.field3395 = class688.field9669.method2909(class405.field5465, (byte) -113);
                        class284.field4016 = var19.method2034(255);
                        class561.field7445 = var19.method2001((byte) -83);
                        class362.field4877 = var19.method2001((byte) -83);
                        class146.field2338 = var19.method2034(arg0 + 255) == 1;
                        class199.field2897.field5398 = class199.field2897.field5378 = var19.method1987(~arg0);
                        class109.field1596 = var19.method2034(arg0 ^ 0xFF);
                        class436.field5965 = var19.method2045(-98);
                        class649.field8721 = new class204();
                        class649.field8721.field2955 = var19.method2001((byte) -83);
                        if (class649.field8721.field2955 == 65535) {
                            class649.field8721.field2955 = -1;
                        }
                        class649.field8721.field2957 = var19.method1987(-1);
                        if (class616.field8169 != class137.field2222) {
                            class649.field8721.field2956 = class649.field8721.field2955 + 50000;
                            class649.field8721.field2958 = class649.field8721.field2955 + 40000;
                        }
                        if (class281.field3991 != class137.field2222 && (class214.field3059.method1329(class488.field6601, 23084) || class214.field3059.method1329(class367.field4972, arg0 + 23084))) {
                            class350.method2084(-30699);
                        }
                    } else {
                        return;
                    }
                    if ((!class569.field7560 || class420.field5806) && !class221.field3125) {
                        try {
                            class594.method3267("unzap", -17670, class486.field6574);
                        } catch (Throwable var35) {
                        }
                    } else {
                        try {
                            class594.method3267("zap", -17670, class486.field6574);
                        } catch (Throwable var39) {
                            if (class670.field9501) {
                                try {
                                    class486.field6574.getAppletContext().showDocument(new URL(class486.field6574.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var36) {
                                }
                            }
                        }
                    }
                    if (class616.field8169 == class137.field2222) {
                        try {
                            class594.method3267("loggedin", -17670, class486.field6574);
                        } catch (Throwable var34) {
                        }
                    }
                    if (class173.field2675 != 2 && class173.field2675 != 3) {
                        class139.field2251 = 0;
                        class218.method1384((byte) -128, 2);
                        class536.method2972(46);
                        class472.method2658(19093, 7);
                        class403.field5396 = null;
                        return;
                    }
                    class139.field2251 = 12;
                }
                if (class139.field2251 == 12) {
                    if (!class370.field4996.method635(3, arg0 + 113)) {
                        return;
                    }
                    class370.field4996.method632(arg0 ^ 0xFFFFFF8F, 3, 0, class439.field6039.field4600);
                    class139.field2251 = 13;
                }
                if (class139.field2251 == 13) {
                    class201 var31 = class439.field6039;
                    var31.field4619 = 0;
                    if (var31.method1309((byte) 0)) {
                        if (!class370.field4996.method635(1, arg0 - 111)) {
                            return;
                        }
                        class370.field4996.method632(-125, 1, 3, var31.field4600);
                    }
                    class403.field5396 = class322.method1954(26241)[var31.method1314(-83)];
                    class269.field3754 = var31.method2001((byte) -83);
                    class139.field2251 = 11;
                }
                if (class139.field2251 == 11) {
                    if (class370.field4996.method635(class269.field3754, 124)) {
                        class370.field4996.method632(-58, class269.field3754, 0, class439.field6039.field4600);
                        class439.field6039.field4619 = 0;
                        int var32 = class269.field3754;
                        class139.field2251 = 0;
                        class218.method1384((byte) -128, 2);
                        class213.method1363(-124);
                        class150.method1072(class439.field6039, false);
                        class466.field6278 = -1;
                        if (class502.field6712 == class403.field5396) {
                            class628.method3455(0);
                        } else {
                            class153.method1075(arg0 ^ 0xFFFFFF82);
                        }
                        if (class439.field6039.field4619 != var32) {
                            throw new RuntimeException("lswp pos:" + class439.field6039.field4619 + " psize:" + var32);
                        }
                        class403.field5396 = null;
                    }
                } else if (class139.field2251 == 15) {
                    if (class269.field3754 == -2) {
                        if (!class370.field4996.method635(2, 101)) {
                            return;
                        }
                        class370.field4996.method632(-31, 2, 0, class439.field6039.field4600);
                        class439.field6039.field4619 = 0;
                        class269.field3754 = class439.field6039.method2001((byte) -83);
                    }
                    if (class370.field4996.method635(class269.field3754, -59)) {
                        class370.field4996.method632(-70, class269.field3754, 0, class439.field6039.field4600);
                        class439.field6039.field4619 = 0;
                        int var33 = class269.field3754;
                        class139.field2251 = 0;
                        class218.method1384((byte) -128, 15);
                        class53.method360(31528);
                        class150.method1072(class439.field6039, false);
                        if (class439.field6039.field4619 != var33) {
                            throw new RuntimeException("lswpr pos:" + class439.field6039.field4619 + " psize:" + var33);
                        }
                        class403.field5396 = null;
                    }
                }
            } else if (class370.field4996.method635(1, -98)) {
                class370.field4996.method632(-100, 1, 0, class439.field6039.field4600);
                class214.field3065 = class439.field6039.field4600[0] & 0xFF;
                class139.field2251 = 10;
            }
        } catch (IOException var41) {
            if (class370.field4996 != null) {
                class370.field4996.method633(9);
                class370.field4996 = null;
            }
            if (class3.field30 >= 2) {
                class139.field2251 = 0;
                class218.method1384((byte) -128, -4);
                class375.method2208(-7);
            } else {
                if (class173.field2675 == 2 || class173.field2675 == 3) {
                    class214.field3059.method1331(false);
                } else {
                    class38.field570.method1331(false);
                }
                class3.field30++;
                class139.field2251 = 1;
                class276.field3863 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public static void method1790(boolean arg0) {
        field4110 = null;
        if (arg0) {
            field4110 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILdaa;Ldaa;)V")
    public static final void method1791(int arg0, class11 arg1, class11 arg2) {
        field4115++;
        if (arg2.field208 != null) {
            arg2.method131(120);
        }
        arg2.field208 = arg1;
        arg2.field211 = arg1.field211;
        arg2.field208.field211 = arg2;
        arg2.field211.field208 = arg2;
        if (arg0 <= 110) {
            field4110 = null;
        }
    }
}
