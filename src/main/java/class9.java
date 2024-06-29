import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "F")
    public static float field166;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "J")
    public static long field167;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILoia;I[B)Lll;", line = 7)
    public static final class386 method59(int arg0, class97 arg1, int arg2, byte[] arg3) {
        field164++;
        if (arg3 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramRawARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class392.field5374, 0);
        if (class392.field5374[0] == -1) {
            OpenGL.glBindProgramARB(arg0, arg2);
            return new class386(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lcn;)V", line = 36)
    public static final void method60(class543 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class543 var2 = null;
            for (class543 var3 = class451.field6179[var1]; var3 != null; var3 = var3.field7407) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class451.field6179[var1] = var3.field7407;
                    } else {
                        var2.field7407 = var3.field7407;
                    }
                    class180.field2828 = true;
                    return;
                }
                var2 = var3;
            }
            class543 var4 = null;
            for (class543 var5 = class684.field9523[var1]; var5 != null; var5 = var5.field7407) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class684.field9523[var1] = var5.field7407;
                    } else {
                        var4.field7407 = var5.field7407;
                    }
                    class180.field2828 = true;
                    return;
                }
                var4 = var5;
            }
            class543 var6 = null;
            for (class543 var7 = class265.field3738[var1]; var7 != null; var7 = var7.field7407) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class265.field3738[var1] = var7.field7407;
                    } else {
                        var6.field7407 = var7.field7407;
                    }
                    class180.field2828 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V", line = 114)
    public static final void method61(boolean arg0) {
        field165++;
        if (class517.field7034 == 0 || class517.field7034 == 5) {
            return;
        }
        try {
            short var1;
            if (class181.field2835 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (++class609.field8502 > var1) {
                if (class193.field2948 != null) {
                    class193.field2948.method917(-33);
                    class193.field2948 = null;
                }
                if (class181.field2835 >= 3) {
                    class517.field7034 = 0;
                    class95.method807((byte) -107, -5);
                    return;
                }
                if (class328.field4463 == 2) {
                    class178.field2812.method4171(-111);
                } else {
                    class659.field9122.method4171(-82);
                }
                class181.field2835++;
                class517.field7034 = 1;
                class609.field8502 = 0;
            }
            if (class517.field7034 == 1) {
                if (class328.field4463 == 2) {
                    class58.field816 = class178.field2812.method4168(class630.field8751, (byte) -110);
                } else {
                    class58.field816 = class659.field9122.method4168(class630.field8751, (byte) -103);
                }
                class517.field7034 = 2;
            }
            if (class517.field7034 == 2) {
                if (class58.field816.field7412 == 2) {
                    throw new IOException();
                }
                if (class58.field816.field7412 != 1) {
                    return;
                }
                class193.field2948 = class203.method1455(-120, 7500, (Socket) class58.field816.field7416);
                class58.field816 = null;
                class366.method2232(-114);
                class537 var2 = class333.method2094(3);
                var2.field7295.method754(class733.field10118.field6570, 42);
                class173.method1314(false, var2);
                class149.method1191(-118);
                class517.field7034 = 3;
            }
            if (class517.field7034 == 3) {
                if (!class193.field2948.method921(!arg0, 1)) {
                    return;
                }
                class193.field2948.method922(1, (byte) -65, class262.field3679.field1413, 0);
                int var3 = class262.field3679.field1413[0] & 0xFF;
                if (var3 != 0) {
                    class517.field7034 = 0;
                    class95.method807((byte) 92, var3);
                    class193.field2948.method917(-51);
                    class193.field2948 = null;
                    class138.method1136(-123);
                    return;
                }
                class262.field3679.field1442 = 0;
                class93 var4 = new class93(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method754(10, 21);
                var4.method759(var5[0], -56);
                var4.method759(var5[1], -105);
                var4.method759(var5[2], -113);
                var4.method759(var5[3], -101);
                var4.method794(-2, 0L);
                var4.method783((byte) -103, class550.field7473);
                var4.method794(-2, class186.field2882);
                var4.method794(-2, class396.field5473);
                var4.method787(class767.field10576, class82.field1132, (byte) 103);
                class366.method2232(-117);
                class537 var6 = class333.method2094(3);
                class329 var7 = var6.field7295;
                if (class328.field4463 == 2) {
                    if (class753.field10398 == 13) {
                        var7.method754(class733.field10122.field6570, 74);
                    } else {
                        var7.method754(class733.field10120.field6570, 92);
                    }
                    var7.method781(127, 0);
                    int var8 = var7.field1442;
                    var7.method759(642, 16);
                    var7.method743(0, var4.field1442, var4.field1413, true);
                    int var9 = var7.field1442;
                    var7.method783((byte) -121, class184.field2862);
                    var7.method754(class459.field6232, 66);
                    var7.method754(class586.method3369(2), 98);
                    var7.method781(108, class732.field10098);
                    var7.method781(86, class108.field1697);
                    var7.method754(class111.field1911.field6744.method2511((byte) 80), 104);
                    class428.method2520(var7, 0);
                    var7.method783((byte) 57, class178.field2806);
                    var7.method759(class361.field4919, 120);
                    class93 var10 = class111.field1911.method2833((byte) 92);
                    var7.method754(var10.field1442, 101);
                    var7.method743(0, var10.field1442, var10.field1413, !arg0);
                    class613.field8533 = true;
                    class93 var11 = new class93(class682.field9503.method3703(114));
                    class682.field9503.method3701(true, var11);
                    var7.method743(0, var11.field1413.length, var11.field1413, true);
                    var7.method781(53, class27.field510);
                    var7.method794(-2, class746.field10302);
                    var7.method754(class714.field9829 == null ? 0 : 1, 106);
                    if (class714.field9829 != null) {
                        var7.method783((byte) 56, class714.field9829);
                    }
                    var7.method754(class444.method2576("jagtheora", (byte) 96) ? 1 : 0, 20);
                    var7.method754(class740.field10206 ? 1 : 0, 91);
                    class238.method1589(122, var7);
                    var7.method768(var9, var7.field1442, var5, false);
                    var7.method760(var7.field1442 - var8, 108);
                } else {
                    var7.method754(class733.field10123.field6570, 48);
                    var7.method781(56, 0);
                    int var12 = var7.field1442;
                    var7.method759(642, 122);
                    var7.method743(0, var4.field1442, var4.field1413, !arg0);
                    int var13 = var7.field1442;
                    var7.method783((byte) -100, class184.field2862);
                    var7.method754(class177.field2797.field8378, 95);
                    var7.method754(class464.field6309, 68);
                    class428.method2520(var7, 0);
                    var7.method783((byte) 21, class178.field2806);
                    var7.method759(class361.field4919, 121);
                    class238.method1589(120, var7);
                    var7.method768(var13, var7.field1442, var5, arg0);
                    var7.method760(var7.field1442 - var12, 108);
                }
                class173.method1314(arg0, var6);
                class149.method1191(-102);
                class551.field7498 = new class415(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class262.field3679.method2080(false, var5);
                class517.field7034 = 4;
            }
            if (class517.field7034 == 4) {
                if (!class193.field2948.method921(true, 1)) {
                    return;
                }
                class193.field2948.method922(1, (byte) -65, class262.field3679.field1413, 0);
                int var15 = class262.field3679.field1413[0] & 0xFF;
                if (var15 == 21) {
                    class517.field7034 = 7;
                } else if (var15 == 29) {
                    class517.field7034 = 13;
                } else if (var15 == 1) {
                    class517.field7034 = 5;
                    class95.method807((byte) -80, var15);
                    return;
                } else if (var15 == 2) {
                    class517.field7034 = 8;
                } else if (var15 == 15) {
                    class517.field7034 = 14;
                    class11.field179 = -2;
                } else if (var15 == 23 && class181.field2835 < 3) {
                    class181.field2835++;
                    class517.field7034 = 1;
                    class609.field8502 = 0;
                    class193.field2948.method917(-124);
                    class193.field2948 = null;
                    return;
                } else {
                    class517.field7034 = 0;
                    class95.method807((byte) -114, var15);
                    class193.field2948.method917(-42);
                    class193.field2948 = null;
                    class138.method1136(-106);
                    return;
                }
            }
            if (class517.field7034 == 6) {
                class366.method2232(-116);
                class537 var16 = class333.method2094(3);
                class329 var17 = var16.field7295;
                var17.method2071(class551.field7498, (byte) -114);
                var17.method2072(-1895652956, class733.field10127.field6570);
                class173.method1314(false, var16);
                class149.method1191(82);
                class517.field7034 = 4;
            } else if (class517.field7034 == 7) {
                if (class193.field2948.method921(!arg0, 1)) {
                    class193.field2948.method922(1, (byte) -65, class262.field3679.field1413, 0);
                    int var18 = class262.field3679.field1413[0] & 0xFF;
                    class517.field7034 = 0;
                    class665.field9233 = var18 * 50;
                    class95.method807((byte) -78, 21);
                    class193.field2948.method917(-69);
                    class193.field2948 = null;
                    class138.method1136(57);
                }
            } else if (class517.field7034 == 13) {
                if (class193.field2948.method921(true, 1)) {
                    class193.field2948.method922(1, (byte) -65, class262.field3679.field1413, 0);
                    class437.field5942 = class262.field3679.field1413[0] & 0xFF;
                    class517.field7034 = 0;
                    class95.method807((byte) -121, 29);
                    class193.field2948.method917(-39);
                    class193.field2948 = null;
                    class138.method1136(-86);
                }
            } else if (class517.field7034 != 8) {
                if (class517.field7034 == 9) {
                    class329 var19 = class262.field3679;
                    if (class328.field4463 == 2) {
                        if (!class193.field2948.method921(true, class417.field5698)) {
                            return;
                        }
                        class193.field2948.method922(class417.field5698, (byte) -65, var19.field1413, 0);
                        var19.field1442 = 0;
                        class407.field5593 = var19.method793((byte) 70);
                        class87.field1190 = var19.method793((byte) 79);
                        class686.field9536 = var19.method793((byte) 20) == 1;
                        class282.field3916 = var19.method793((byte) 104) == 1;
                        class356.field4859 = var19.method793((byte) 67) == 1;
                        class88.field1208 = var19.method793((byte) 86) == 1;
                        class483.field6533 = var19.method763(-19);
                        class790.field10829 = var19.method793((byte) 61) == 1;
                        class740.field10213 = var19.method769((byte) 19);
                        class295.field4033 = var19.method793((byte) 33) == 1;
                        class414.field5670.method2313(class295.field4033, -1138181755);
                        class143.field2427.method1420(-122, class295.field4033);
                        class495.field6783.method1999(class295.field4033, (byte) -117);
                    } else if (class193.field2948.method921(!arg0, class417.field5698)) {
                        class193.field2948.method922(class417.field5698, (byte) -65, var19.field1413, 0);
                        var19.field1442 = 0;
                        class407.field5593 = var19.method793((byte) 8);
                        class87.field1190 = var19.method793((byte) 51);
                        class686.field9536 = var19.method793((byte) 49) == 1;
                        class282.field3916 = var19.method793((byte) 40) == 1;
                        class356.field4859 = var19.method793((byte) 125) == 1;
                        class129.field2252 = var19.method770((byte) 121);
                        int var20 = var19.method793((byte) 5);
                        class724.field9962 = (var20 & 0x2) != 0;
                        class790.field10829 = (var20 & 0x1) != 0;
                        class530.field7180 = var19.method773(3);
                        class63.field867 = var19.method763(-71);
                        class46.field716 = var19.method763(-77);
                        class561.field7962 = var19.method763(83);
                        class499.field6828 = var19.method773(3);
                        class517.field7033 = class630.field8751.method4107(class499.field6828, -84);
                        class4.field41 = var19.method793((byte) 120);
                        class706.field9707 = var19.method763(121);
                        class185.field2876 = var19.method763(-98);
                        class749.field10333 = var19.method793((byte) 60) == 1;
                        class235.field3379.field10641 = class235.field3379.field10625 = class619.field8623 = var19.method795(-15475);
                        class70.field1044 = var19.method793((byte) 23);
                        class220.field3230 = var19.method773(3);
                        class442.field5991 = var19.method793((byte) 73) == 1;
                        class97.field1526 = new class752();
                        class97.field1526.field10374 = var19.method763(107);
                        if (class97.field1526.field10374 == 65535) {
                            class97.field1526.field10374 = -1;
                        }
                        class97.field1526.field10366 = var19.method795(-15475);
                        if (class556.field7850 != class517.field7028) {
                            class97.field1526.field10373 = class97.field1526.field10374 + 50000;
                            class97.field1526.field10372 = class97.field1526.field10374 + 40000;
                        }
                        if (class556.field7850 != class204.field3075 && (class556.field7850 != class209.field3127 || class407.field5593 < 2) && (class178.field2812.method4169(class13.field201, (byte) 121) || class178.field2812.method4169(class436.field5938, (byte) 94))) {
                            class404.method2415((byte) -85);
                        }
                    } else {
                        return;
                    }
                    if ((!class686.field9536 || class356.field4859) && !class790.field10829) {
                        try {
                            class729.method4044(class286.field3936, 26693, "unzap");
                        } catch (Throwable var26) {
                        }
                    } else {
                        try {
                            class729.method4044(class286.field3936, 26693, "zap");
                        } catch (Throwable var27) {
                            if (class671.field9317) {
                                try {
                                    class286.field3936.getAppletContext().showDocument(new URL(class286.field3936.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var25) {
                                }
                            }
                        }
                    }
                    if (class556.field7850 == class517.field7028) {
                        try {
                            class729.method4044(class286.field3936, 26693, "loggedin");
                        } catch (Throwable var24) {
                        }
                    }
                    if (class328.field4463 != 2) {
                        class517.field7034 = 0;
                        class95.method807((byte) 57, 2);
                        class249.method1649(123);
                        class139.method1142(2, 7);
                        class533.field7219 = null;
                        return;
                    }
                    class517.field7034 = 11;
                }
                if (!arg0) {
                    if (class517.field7034 == 11) {
                        if (!class193.field2948.method921(true, 3)) {
                            return;
                        }
                        class193.field2948.method922(3, (byte) -65, class262.field3679.field1413, 0);
                        class517.field7034 = 12;
                    }
                    if (class517.field7034 == 12) {
                        class329 var21 = class262.field3679;
                        var21.field1442 = 0;
                        if (var21.method2076(false)) {
                            if (!class193.field2948.method921(!arg0, 1)) {
                                return;
                            }
                            class193.field2948.method922(1, (byte) -65, var21.field1413, 3);
                        }
                        class533.field7219 = class189.method1393(97)[var21.method2073(67)];
                        class11.field179 = var21.method763(89);
                        class517.field7034 = 10;
                    }
                    if (class517.field7034 == 10) {
                        if (class193.field2948.method921(true, class11.field179)) {
                            class193.field2948.method922(class11.field179, (byte) -65, class262.field3679.field1413, 0);
                            class262.field3679.field1442 = 0;
                            class517.field7034 = 0;
                            int var22 = class11.field179;
                            class95.method807((byte) 68, 2);
                            class502.method2874((byte) -102);
                            class584.method3354(class262.field3679, (byte) 124);
                            class666.field9269 = -1;
                            if (class533.field7219 == class119.field2176) {
                                class12.method71((byte) -106);
                            } else {
                                class378.method2304(-60);
                            }
                            if (class262.field3679.field1442 != var22) {
                                throw new RuntimeException("lswp pos:" + class262.field3679.field1442 + " psize:" + var22);
                            }
                            class533.field7219 = null;
                        }
                    } else if (class517.field7034 == 14) {
                        if (class11.field179 == -2) {
                            if (!class193.field2948.method921(true, 2)) {
                                return;
                            }
                            class193.field2948.method922(2, (byte) -65, class262.field3679.field1413, 0);
                            class262.field3679.field1442 = 0;
                            class11.field179 = class262.field3679.method763(127);
                        }
                        if (class193.field2948.method921(true, class11.field179)) {
                            class193.field2948.method922(class11.field179, (byte) -65, class262.field3679.field1413, 0);
                            class262.field3679.field1442 = 0;
                            int var23 = class11.field179;
                            class517.field7034 = 0;
                            class95.method807((byte) 94, 15);
                            class23.method155(8301);
                            class584.method3354(class262.field3679, (byte) 122);
                            if (class262.field3679.field1442 != var23) {
                                throw new RuntimeException("lswpr pos:" + class262.field3679.field1442 + " psize:" + var23);
                            }
                            class533.field7219 = null;
                        }
                    }
                }
            } else if (class193.field2948.method921(true, 1)) {
                class193.field2948.method922(1, (byte) -65, class262.field3679.field1413, 0);
                class517.field7034 = 9;
                class417.field5698 = class262.field3679.field1413[0] & 0xFF;
            }
        } catch (IOException var28) {
            if (class193.field2948 != null) {
                class193.field2948.method917(123);
                class193.field2948 = null;
            }
            if (class181.field2835 >= 3) {
                class517.field7034 = 0;
                class95.method807((byte) -112, -4);
                class138.method1136(87);
            } else {
                if (class328.field4463 == 2) {
                    class178.field2812.method4171(-108);
                } else {
                    class659.field9122.method4171(-95);
                }
                class181.field2835++;
                class517.field7034 = 1;
                class609.field8502 = 0;
            }
        }
    }
}
