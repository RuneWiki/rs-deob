import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class532 {

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "Lhda;")
    public class747 field7527 = new class747();

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "Z")
    public boolean field7534 = false;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "Lpu;")
    public static class559 field7533 = new class559(1, 7);

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "Ldm;")
    public static class50 field7535 = null;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field7526;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field7529;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Lcu;")
    public static class217 field7536;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Lha;")
    public static class58 field7530;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)[B")
    public static final byte[] method3126(int arg0, int arg1) {
        if (arg0 != 255) {
            method3127((byte) 5);
        }
        field7529++;
        class129 var2 = (class129) class58.field1091.method3236((long) arg1, (byte) 107);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class459.method2800(var4, var7, (byte) -92);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class129(var3);
            class58.field1091.method3237((long) arg1, var2, 16205);
        }
        return var2.field1943;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public static final void method3127(byte arg0) {
        field7531++;
        if (class363.field5096 == 0 || class363.field5096 == 6) {
            return;
        }
        if (arg0 != 60) {
            field7536 = null;
        }
        try {
            short var1;
            if (class208.field2973 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (var1 < (++class130.field1950)) {
                if (class555.field7776 != null) {
                    class555.field7776.method67(-1);
                    class555.field7776 = null;
                }
                if (class208.field2973 >= 3) {
                    class363.field5096 = 0;
                    class552.method3231((byte) 110, -5);
                    return;
                }
                if (class683.field9617 == 2) {
                    class67.field1223.method3401(-112);
                } else {
                    class232.field3298.method3401(-111);
                }
                class208.field2973++;
                class363.field5096 = 1;
                class130.field1950 = 0;
            }
            if (class363.field5096 == 1) {
                if (class683.field9617 == 2) {
                    class175.field2546 = class67.field1223.method3402((byte) -103, class341.field4796);
                } else {
                    class175.field2546 = class232.field3298.method3402((byte) -111, class341.field4796);
                }
                class363.field5096 = 2;
            }
            if (class363.field5096 == 2) {
                if (class175.field2546.field9091 == 2) {
                    throw new IOException();
                }
                if (class175.field2546.field9091 != 1) {
                    return;
                }
                class555.field7776 = class151.method1165(7500, (Socket) class175.field2546.field9093, 0);
                class175.field2546 = null;
                long var2 = class609.field8825 = class534.method3135(-110, class47.field696);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class374.method2353((byte) -104);
                class135 var5 = class59.method663(arg0 ^ 0x47);
                var5.field2109.method263((byte) 115, class433.field6041.field4035);
                var5.field2109.method263((byte) 76, var4);
                class539.method3178(var5, -18925);
                class464.method2823((byte) 115);
                class363.field5096 = 3;
            }
            if (class363.field5096 == 3) {
                if (!class555.field7776.method66(1, arg0 ^ 0xFFFFFFB6)) {
                    return;
                }
                class555.field7776.method68(0, 1, class644.field9146.field483, -1);
                int var6 = class644.field9146.field483[0] & 0xFF;
                if (var6 != 0) {
                    class363.field5096 = 0;
                    class552.method3231((byte) 86, var6);
                    class555.field7776.method67(-1);
                    class555.field7776 = null;
                    class503.method3020(arg0 - 54);
                    return;
                }
                class363.field5096 = 4;
            }
            if (class363.field5096 == 4) {
                if (!class555.field7776.method66(8, -119)) {
                    return;
                }
                class555.field7776.method68(0, 8, class644.field9146.field483, -1);
                class644.field9146.field469 = 0;
                class674.field9466 = class644.field9146.method246(19271);
                class35 var7 = new class35(518);
                int[] var8 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class674.field9466 >> 32), (int) class674.field9466 };
                var7.method263((byte) 110, 10);
                var7.method233(var8[0], arg0 ^ 0xFFFFA5BA);
                var7.method233(var8[1], -23162);
                var7.method233(var8[2], arg0 ^ 0xFFFFA5BA);
                var7.method233(var8[3], -23162);
                var7.method240(false, 0L);
                var7.method287((byte) 0, class566.field7985);
                var7.method240(false, class552.field7730);
                var7.method240(false, class113.field1807);
                var7.method264(class174.field2519, class610.field8832, (byte) -128);
                class374.method2353((byte) 62);
                class135 var9 = class59.method663(arg0 ^ 0x41);
                class452 var10 = var9.field2109;
                if (class683.field9617 == 2) {
                    if (class611.field8839 == 13) {
                        var10.method263((byte) -124, class433.field6058.field4035);
                    } else {
                        var10.method263((byte) -76, class433.field6056.field4035);
                    }
                    var10.method223(1493807496, 0);
                    int var13 = var10.field469;
                    var10.method233(629, -23162);
                    var10.method283(0, (byte) 107, var7.field483, var7.field469);
                    int var14 = var10.field469;
                    var10.method287((byte) 0, class47.field696);
                    var10.method263((byte) -66, class595.field8697);
                    var10.method263((byte) -119, class190.method1336((byte) -106));
                    var10.method223(1493807496, class206.field2956);
                    var10.method223(arg0 + 1493807436, class363.field5105);
                    var10.method263((byte) 114, class471.field6781.field6697.method2961(27669));
                    class58.method642((byte) -127, var10);
                    var10.method287((byte) 0, class611.field8844);
                    var10.method233(class66.field1197, arg0 ^ 0xFFFFA5BA);
                    class35 var15 = class471.field6781.method2819(arg0 ^ 0xFFFFFFB7);
                    var10.method263((byte) 125, var15.field469);
                    var10.method283(0, (byte) -114, var15.field483, var15.field469);
                    class671.field9412 = true;
                    class35 var16 = new class35(class674.field9469.method20((byte) 76));
                    class674.field9469.method17(var16, true);
                    var10.method283(0, (byte) -57, var16.field483, var16.field483.length);
                    var10.method223(1493807496, class241.field3385);
                    var10.method240(false, class229.field3268);
                    var10.method263((byte) 73, class205.field2942 == null ? 0 : 1);
                    if (class205.field2942 != null) {
                        var10.method287((byte) 0, class205.field2942);
                    }
                    var10.method263((byte) 52, class115.method943((byte) -120, "jagtheora") ? 1 : 0);
                    class436.method2631(var10, (byte) -123);
                    var10.method261(var10.field469, (byte) 111, var8, var14);
                    var10.method231(var10.field469 - var13, (byte) 110);
                } else {
                    var10.method263((byte) -84, class433.field6059.field4035);
                    var10.method223(arg0 + 1493807436, 0);
                    int var11 = var10.field469;
                    var10.method233(629, -23162);
                    var10.method283(0, (byte) -84, var7.field483, var7.field469);
                    int var12 = var10.field469;
                    var10.method287((byte) 0, class47.field696);
                    var10.method263((byte) -106, class649.field9170.field2572);
                    var10.method263((byte) 72, class744.field10426);
                    class58.method642((byte) -127, var10);
                    var10.method287((byte) 0, class611.field8844);
                    var10.method233(class66.field1197, -23162);
                    class436.method2631(var10, (byte) -125);
                    var10.method261(var10.field469, (byte) 58, var8, var12);
                    var10.method231(var10.field469 - var11, (byte) 110);
                }
                class539.method3178(var9, -18925);
                class464.method2823((byte) 112);
                class459.field6629 = new class633(var8);
                for (int var17 = 0; var17 < 4; var17++) {
                    var8[var17] += 50;
                }
                class644.field9146.method2687(1535, var8);
                class363.field5096 = 5;
            }
            if (class363.field5096 == 5) {
                if (!class555.field7776.method66(1, 117)) {
                    return;
                }
                class555.field7776.method68(0, 1, class644.field9146.field483, -1);
                int var18 = class644.field9146.field483[0] & 0xFF;
                if (var18 == 21) {
                    class363.field5096 = 8;
                } else if (var18 == 29) {
                    class363.field5096 = 14;
                } else if (var18 == 1) {
                    class363.field5096 = 6;
                    class552.method3231((byte) 49, var18);
                    return;
                } else if (var18 == 2) {
                    class363.field5096 = 9;
                } else if (var18 == 15) {
                    class374.field5243 = -2;
                    class363.field5096 = 15;
                } else if (var18 == 23 && class208.field2973 < 3) {
                    class363.field5096 = 1;
                    class208.field2973++;
                    class130.field1950 = 0;
                    class555.field7776.method67(-1);
                    class555.field7776 = null;
                    return;
                } else {
                    class363.field5096 = 0;
                    class552.method3231((byte) -98, var18);
                    class555.field7776.method67(-1);
                    class555.field7776 = null;
                    class503.method3020(arg0 ^ 0x3A);
                    return;
                }
            }
            if (class363.field5096 == 7) {
                class374.method2353((byte) -79);
                class135 var19 = class59.method663(arg0 ^ 0x43);
                class452 var20 = var19.field2109;
                var20.method2689(class459.field6629, -29592);
                var20.method2682(class433.field6065.field4035, (byte) -124);
                class539.method3178(var19, arg0 - 18985);
                class464.method2823((byte) 102);
                class363.field5096 = 5;
            } else if (class363.field5096 == 8) {
                if (class555.field7776.method66(1, arg0 ^ 0xFFFFFFF0)) {
                    class555.field7776.method68(0, 1, class644.field9146.field483, -1);
                    int var21 = class644.field9146.field483[0] & 0xFF;
                    class363.field5096 = 0;
                    class386.field5410 = (var21 + 3) * 60;
                    class552.method3231((byte) -127, 21);
                    class555.field7776.method67(-1);
                    class555.field7776 = null;
                    class503.method3020(6);
                }
            } else if (class363.field5096 == 14) {
                if (class555.field7776.method66(1, -114)) {
                    class555.field7776.method68(0, 1, class644.field9146.field483, -1);
                    class363.field5096 = 0;
                    class697.field9804 = class644.field9146.field483[0] & 0xFF;
                    class552.method3231((byte) 50, 29);
                    class555.field7776.method67(-1);
                    class555.field7776 = null;
                    class503.method3020(6);
                }
            } else if (class363.field5096 != 9) {
                if (class363.field5096 == 10) {
                    class452 var22 = class644.field9146;
                    if (class683.field9617 == 2) {
                        if (!class555.field7776.method66(class34.field455, 101)) {
                            return;
                        }
                        class555.field7776.method68(0, class34.field455, var22.field483, -1);
                        var22.field469 = 0;
                        class79.field1485 = var22.method273(255);
                        class505.field7212 = var22.method273(255);
                        class231.field3285 = var22.method273(255) == 1;
                        class29.field398 = var22.method273(255) == 1;
                        class746.field10441 = var22.method273(255) == 1;
                        class253.field3605 = var22.method273(255) == 1;
                        class675.field9486 = var22.method253(-13900);
                        class406.field5652 = var22.method273(arg0 ^ 0xC3) == 1;
                        class701.field9849 = var22.method244((byte) 125);
                        class399.field5585 = var22.method273(255) == 1;
                        class66.field1181.method134(class399.field5585, 0);
                        class558.field7942.method725(class399.field5585, 36);
                        class134.field2102.method3039(64, class399.field5585);
                    } else if (class555.field7776.method66(class34.field455, arg0 - 113)) {
                        class555.field7776.method68(0, class34.field455, var22.field483, arg0 - 61);
                        var22.field469 = 0;
                        class79.field1485 = var22.method273(255);
                        class505.field7212 = var22.method273(255);
                        class231.field3285 = var22.method273(255) == 1;
                        class29.field398 = var22.method273(255) == 1;
                        class746.field10441 = var22.method273(255) == 1;
                        class36.field539 = var22.method225((byte) 90);
                        class406.field5652 = class36.field539 > 0;
                        class611.field8846 = var22.method253(-13900);
                        class640.field9114 = var22.method253(arg0 ^ 0xFFFFC988);
                        class656.field9237 = var22.method253(-13900);
                        class521.field7391 = var22.method234((byte) -120);
                        class224.field3210 = class341.field4796.method2285(class521.field7391, (byte) -104);
                        class290.field4080 = var22.method273(255);
                        class756.field10518 = var22.method253(arg0 - 13960);
                        class115.field1843 = var22.method253(-13900);
                        class421.field5915 = var22.method273(255) == 1;
                        class468.field6748.field4939 = class468.field6748.field4897 = var22.method279((byte) 61);
                        class591.field8304 = var22.method273(255);
                        class530.field7517 = var22.method234((byte) -102);
                        class397.field5562 = new class593();
                        class397.field5562.field8324 = var22.method253(-13900);
                        if (class397.field5562.field8324 == 65535) {
                            class397.field5562.field8324 = -1;
                        }
                        class397.field5562.field8321 = var22.method279((byte) 93);
                        if (class231.field3294 != class118.field1857) {
                            class397.field5562.field8323 = class397.field5562.field8324 + 50000;
                            class397.field5562.field8317 = class397.field5562.field8324 + 40000;
                        }
                        if (class611.field8843 != class118.field1857 && (class67.field1223.method3400(class430.field6021, (byte) -121) || class67.field1223.method3400(class193.field2782, (byte) -112))) {
                            class401.method2479(-303881189);
                        }
                    } else {
                        return;
                    }
                    if ((!class231.field3285 || class746.field10441) && !class406.field5652) {
                        try {
                            class101.method889("unzap", class476.field6812, -27420);
                        } catch (Throwable var27) {
                        }
                    } else {
                        try {
                            class101.method889("zap", class476.field6812, -27420);
                        } catch (Throwable var29) {
                            if (class666.field9337) {
                                try {
                                    class476.field6812.getAppletContext().showDocument(new URL(class476.field6812.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var28) {
                                }
                            }
                        }
                    }
                    if (class231.field3294 == class118.field1857) {
                        try {
                            class101.method889("loggedin", class476.field6812, -27420);
                        } catch (Throwable var26) {
                        }
                    }
                    if (class683.field9617 != 2) {
                        class363.field5096 = 0;
                        class552.method3231((byte) -114, 2);
                        class618.method3578(24584);
                        class19.method122(arg0 ^ 0x3D, 7);
                        class504.field7206 = null;
                        return;
                    }
                    class363.field5096 = 12;
                }
                if (class363.field5096 == 12) {
                    if (!class555.field7776.method66(3, 76)) {
                        return;
                    }
                    class555.field7776.method68(0, 3, class644.field9146.field483, -1);
                    class363.field5096 = 13;
                }
                if (class363.field5096 == 13) {
                    class452 var23 = class644.field9146;
                    var23.field469 = 0;
                    if (var23.method2685((byte) -28)) {
                        if (!class555.field7776.method66(1, 83)) {
                            return;
                        }
                        class555.field7776.method68(3, 1, var23.field483, -1);
                    }
                    class504.field7206 = class189.method1333(arg0 ^ 0x62)[var23.method2695(255)];
                    class374.field5243 = var23.method253(arg0 - 13960);
                    class363.field5096 = 11;
                }
                if (class363.field5096 == 11) {
                    if (class555.field7776.method66(class374.field5243, 73)) {
                        class555.field7776.method68(0, class374.field5243, class644.field9146.field483, arg0 - 61);
                        class644.field9146.field469 = 0;
                        class363.field5096 = 0;
                        int var24 = class374.field5243;
                        class552.method3231((byte) 112, 2);
                        class417.method2541((byte) 27);
                        class330.method2104(class644.field9146, (byte) 0);
                        class440.field6143 = -1;
                        if (class504.field7206 == class327.field4629) {
                            class228.method1568(120);
                        } else {
                            class104.method900((byte) -126);
                        }
                        if (class644.field9146.field469 != var24) {
                            throw new RuntimeException("lswp pos:" + class644.field9146.field469 + " psize:" + var24);
                        }
                        class504.field7206 = null;
                    }
                } else if (class363.field5096 == 15) {
                    if (class374.field5243 == -2) {
                        if (!class555.field7776.method66(2, 122)) {
                            return;
                        }
                        class555.field7776.method68(0, 2, class644.field9146.field483, arg0 - 61);
                        class644.field9146.field469 = 0;
                        class374.field5243 = class644.field9146.method253(-13900);
                    }
                    if (class555.field7776.method66(class374.field5243, -103)) {
                        class555.field7776.method68(0, class374.field5243, class644.field9146.field483, arg0 - 61);
                        class644.field9146.field469 = 0;
                        int var25 = class374.field5243;
                        class363.field5096 = 0;
                        class552.method3231((byte) -104, 15);
                        class353.method2214(arg0 - 3);
                        class330.method2104(class644.field9146, (byte) 0);
                        if (class644.field9146.field469 != var25) {
                            throw new RuntimeException("lswpr pos:" + class644.field9146.field469 + " psize:" + var25);
                        }
                        class504.field7206 = null;
                    }
                }
            } else if (class555.field7776.method66(1, arg0 + 53)) {
                class555.field7776.method68(0, 1, class644.field9146.field483, -1);
                class363.field5096 = 10;
                class34.field455 = class644.field9146.field483[0] & 0xFF;
            }
        } catch (IOException var30) {
            if (class555.field7776 != null) {
                class555.field7776.method67(-1);
                class555.field7776 = null;
            }
            if (class208.field2973 >= 3) {
                class363.field5096 = 0;
                class552.method3231((byte) -119, -4);
                class503.method3020(6);
            } else {
                if (class683.field9617 == 2) {
                    class67.field1223.method3401(-114);
                } else {
                    class232.field3298.method3401(arg0 - 187);
                }
                class130.field1950 = 0;
                class363.field5096 = 1;
                class208.field2973++;
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public final void method3128(int arg0) {
        if (arg0 != -2) {
            return;
        }
        field7528++;
        while (true) {
            class304 var2 = (class304) this.field7527.method4157((byte) 40);
            if (var2 == null) {
                return;
            }
            var2.method909(-111);
            class625.method3614(var2, -117);
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public static void method3129(int arg0) {
        field7530 = null;
        field7533 = null;
        field7535 = null;
        if (arg0 != 11) {
            field7530 = null;
        }
        field7536 = null;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Z)V")
    public class532(boolean arg0) {
        this.field7534 = arg0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILvw;)V")
    public final void method3130(int arg0, class304 arg1) {
        field7532++;
        class43 var3 = arg1.field4297;
        if (arg0 < 29) {
            method3126(14, -23);
        }
        boolean var4 = true;
        class243[] var5 = arg1.field4298;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field3397) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field7534) {
            for (class304 var7 = (class304) this.field7527.method4159(0); var7 != null; var7 = (class304) this.field7527.method4151(7)) {
                if (var7.field4297 == var3) {
                    var7.method909(56);
                    class625.method3614(var7, -122);
                }
            }
        }
        for (class304 var8 = (class304) this.field7527.method4159(0); var8 != null; var8 = (class304) this.field7527.method4151(7)) {
            if (var8.field4297.field647 <= var3.field647) {
                class264.method1783(arg1, var8, 3);
                return;
            }
        }
        this.field7527.method4152(arg1, 0);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([BB)Lkr;")
    public static final class743 method3131(byte[] arg0, byte arg1) {
        field7525++;
        if (arg0 == null) {
            throw new RuntimeException("");
        } else if (arg1 == -94) {
            while (true) {
                try {
                    Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                    MediaTracker var3 = new MediaTracker(class345.field4858);
                    var3.addImage(var2, 0);
                    var3.waitForAll();
                    int var4 = var2.getWidth(class345.field4858);
                    int var5 = var2.getHeight(class345.field4858);
                    if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                        int[] var6 = new int[var4 * var5];
                        PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                        var7.grabPixels();
                        return class359.field5046.method561(var4, var6, 0, var4, 31, var5);
                    }
                    throw new RuntimeException("");
                } catch (InterruptedException var8) {
                }
            }
        } else {
            return null;
        }
    }
}
