import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class573 extends class465 {

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    private int field8006;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    private int field8000;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    private int field7998;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    private int field8001;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
    private int field8004;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    private int field7999;

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "Lbm;")
    private class684 field8003;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "Lan;")
    public static class182 field8005 = new class182(13, 7);

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "Lgg;")
    public static class114 field8008 = new class114(3000000, 200);

    @OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
    public static int field8011 = 0;

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "Lk;")
    public static class43 field8010 = new class43();

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public static int field8007;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "Lsq;")
    private class207 field8002;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "[Lol;")
    public static class413[] field7997;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V", line = 6)
    public static final void method3219(byte arg0) {
        field8009++;
        if (class575.field8031 == 0 || class575.field8031 == 5) {
            return;
        }
        try {
            short var1;
            if (class542.field7630 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if (var1 < (++class446.field6281)) {
                if (class426.field6057 != null) {
                    class426.field6057.method872(-1);
                    class426.field6057 = null;
                }
                if (class542.field7630 >= 3) {
                    class575.field8031 = 0;
                    class600.method3307(126, -5);
                    return;
                }
                if (class202.field2576 == 2) {
                    class575.field8035.method1193((byte) -68);
                } else {
                    class86.field1102.method1193((byte) -68);
                }
                class575.field8031 = 1;
                class446.field6281 = 0;
                class542.field7630++;
            }
            if (class575.field8031 == 1) {
                if (class202.field2576 == 2) {
                    class641.field8859 = class575.field8035.method1192((byte) 100, class681.field9312);
                } else {
                    class641.field8859 = class86.field1102.method1192((byte) -118, class681.field9312);
                }
                class575.field8031 = 2;
            }
            if (class575.field8031 == 2) {
                if (class641.field8859.field6124 == 2) {
                    throw new IOException();
                }
                if (class641.field8859.field6124 != 1) {
                    return;
                }
                class426.field6057 = class5.method24((Socket) class641.field8859.field6123, (byte) -80, 7500);
                class641.field8859 = null;
                class279.method1671((byte) -43);
                class650 var2 = class158.method983(86);
                var2.field8928.method1141(class283.field3597.field2536, 89);
                class108.method745(var2, -124);
                class704.method3905((byte) 114);
                class575.field8031 = 3;
            }
            if (class575.field8031 == 3) {
                if (!class426.field6057.method873(1, (byte) -128)) {
                    return;
                }
                class426.field6057.method870(0, 1, class24.field414.field2325, false);
                int var3 = class24.field414.field2325[0] & 0xFF;
                if (var3 != 0) {
                    class575.field8031 = 0;
                    class600.method3307(124, var3);
                    class426.field6057.method872(-1);
                    class426.field6057 = null;
                    class157.method980((byte) -109);
                    return;
                }
                class24.field414.field2354 = 0;
                class179 var4 = new class179(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method1141(10, -69);
                var4.method1112(var5[0], -120);
                var4.method1112(var5[1], -123);
                var4.method1112(var5[2], -123);
                var4.method1112(var5[3], -116);
                var4.method1104(90, 0L);
                var4.method1110(class432.field6111, -30452);
                var4.method1104(126, class5.field60);
                var4.method1104(71, class154.field1891);
                var4.method1146(class638.field8823, 7746, class402.field5568);
                class279.method1671((byte) -43);
                class650 var6 = class158.method983(54);
                class757 var7 = var6.field8928;
                if (class202.field2576 == 2) {
                    if (class668.field9150 == 13) {
                        var7.method1141(class283.field3603.field2536, 34);
                    } else {
                        var7.method1141(class283.field3600.field2536, -89);
                    }
                    var7.method1157(0, (byte) 122);
                    int var8 = var7.field2354;
                    var7.method1112(636, -127);
                    var7.method1123(var4.field2354, (byte) 102, 0, var4.field2325);
                    int var9 = var7.field2354;
                    var7.method1110(class516.field7276, -30452);
                    var7.method1141(class643.field8880, -72);
                    var7.method1141(class126.method814((byte) 23), -122);
                    var7.method1157(class599.field8320, (byte) 118);
                    var7.method1157(class84.field1083, (byte) 120);
                    var7.method1141(class223.field2944.field631.method1463((byte) -120), 62);
                    class563.method3177(24880, var7);
                    var7.method1110(class371.field5224, -30452);
                    var7.method1112(class718.field10135, -120);
                    class179 var10 = class223.field2944.method341((byte) -81);
                    var7.method1141(var10.field2354, -89);
                    var7.method1123(var10.field2354, (byte) 118, 0, var10.field2325);
                    class78.field1035 = true;
                    class179 var11 = new class179(class241.field3102.method3392(false));
                    class241.field3102.method3394(2926, var11);
                    var7.method1123(var11.field2325.length, (byte) 82, 0, var11.field2325);
                    var7.method1157(class214.field2716, (byte) 124);
                    var7.method1104(93, class584.field8114);
                    var7.method1141(class202.field2579 == null ? 0 : 1, 108);
                    if (class202.field2579 != null) {
                        var7.method1110(class202.field2579, -30452);
                    }
                    var7.method1141(class274.method1640((byte) -118, "jagtheora") ? 1 : 0, 79);
                    class217.method1311(var7, -116);
                    var7.method1149(var9, var5, (byte) 94, var7.field2354);
                    var7.method1090(var7.field2354 - var8, 116);
                } else {
                    var7.method1141(class283.field3604.field2536, 61);
                    var7.method1157(0, (byte) 112);
                    int var12 = var7.field2354;
                    var7.method1112(636, -127);
                    var7.method1123(var4.field2354, (byte) -124, 0, var4.field2325);
                    int var13 = var7.field2354;
                    var7.method1110(class516.field7276, -30452);
                    var7.method1141(class702.field9902.field3627, 93);
                    var7.method1141(class416.field5920, 67);
                    class563.method3177(24880, var7);
                    var7.method1110(class371.field5224, -30452);
                    var7.method1112(class718.field10135, -127);
                    class217.method1311(var7, -102);
                    var7.method1149(var13, var5, (byte) 94, var7.field2354);
                    var7.method1090(var7.field2354 - var12, 125);
                }
                class108.method745(var6, -93);
                class704.method3905((byte) 111);
                class625.field8727 = new class395(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class24.field414.method4209((byte) 127, var5);
                class575.field8031 = 4;
            }
            if (class575.field8031 == 4) {
                if (!class426.field6057.method873(1, (byte) -127)) {
                    return;
                }
                class426.field6057.method870(0, 1, class24.field414.field2325, false);
                int var15 = class24.field414.field2325[0] & 0xFF;
                if (var15 == 21) {
                    class575.field8031 = 7;
                } else if (var15 == 29) {
                    class575.field8031 = 13;
                } else if (var15 == 1) {
                    class575.field8031 = 5;
                    class600.method3307(124, var15);
                    return;
                } else if (var15 == 2) {
                    class575.field8031 = 8;
                } else if (var15 == 15) {
                    class575.field8031 = 14;
                    class677.field9199 = -2;
                } else if (var15 == 23 && class542.field7630 < 3) {
                    class575.field8031 = 1;
                    class542.field7630++;
                    class446.field6281 = 0;
                    class426.field6057.method872(-1);
                    class426.field6057 = null;
                    return;
                } else {
                    class575.field8031 = 0;
                    class600.method3307(126, var15);
                    class426.field6057.method872(-1);
                    class426.field6057 = null;
                    class157.method980((byte) -117);
                    return;
                }
            }
            if (class575.field8031 == 6) {
                class279.method1671((byte) -43);
                class650 var16 = class158.method983(-128);
                class757 var17 = var16.field8928;
                var17.method4210((byte) -103, class625.field8727);
                var17.method4215((byte) 75, class283.field3610.field2536);
                class108.method745(var16, -82);
                class704.method3905((byte) 114);
                class575.field8031 = 4;
            } else if (class575.field8031 == 7) {
                if (class426.field6057.method873(1, (byte) -128)) {
                    class426.field6057.method870(0, 1, class24.field414.field2325, false);
                    int var18 = class24.field414.field2325[0] & 0xFF;
                    class575.field8031 = 0;
                    class197.field2533 = (var18 + 3) * 60;
                    class600.method3307(108, 21);
                    class426.field6057.method872(-1);
                    class426.field6057 = null;
                    class157.method980((byte) -103);
                }
            } else if (class575.field8031 == 13) {
                if (class426.field6057.method873(1, (byte) -128)) {
                    class426.field6057.method870(0, 1, class24.field414.field2325, false);
                    class492.field6972 = class24.field414.field2325[0] & 0xFF;
                    class575.field8031 = 0;
                    class600.method3307(108, 29);
                    class426.field6057.method872(-1);
                    class426.field6057 = null;
                    class157.method980((byte) -102);
                }
            } else if (class575.field8031 != 8) {
                if (class575.field8031 == 9) {
                    class757 var19 = class24.field414;
                    if (class202.field2576 == 2) {
                        if (!class426.field6057.method873(class453.field6359, (byte) -127)) {
                            return;
                        }
                        class426.field6057.method870(0, class453.field6359, var19.field2325, false);
                        var19.field2354 = 0;
                        class408.field5753 = var19.method1094(255);
                        class637.field8816 = var19.method1094(255);
                        class58.field824 = var19.method1094(255) == 1;
                        class332.field4245 = var19.method1094(255) == 1;
                        class149.field1813 = var19.method1094(255) == 1;
                        class525.field7422 = var19.method1094(255) == 1;
                        class456.field6387 = var19.method1107(false);
                        class737.field10330 = var19.method1094(255) == 1;
                        class661.field9057 = var19.method1143((byte) 124);
                        class680.field9235 = var19.method1094(255) == 1;
                        class358.field5112.method880(0, class680.field9235);
                        class190.field2488.method3943(class680.field9235, 0);
                        class598.field8304.method1454(class680.field9235, 1695);
                    } else if (class426.field6057.method873(class453.field6359, (byte) -127)) {
                        class426.field6057.method870(0, class453.field6359, var19.field2325, false);
                        var19.field2354 = 0;
                        class408.field5753 = var19.method1094(255);
                        class637.field8816 = var19.method1094(255);
                        class58.field824 = var19.method1094(255) == 1;
                        class332.field4245 = var19.method1094(255) == 1;
                        class149.field1813 = var19.method1094(255) == 1;
                        class107.field1328 = var19.method1137((byte) -80);
                        class737.field10330 = class107.field1328 > 0;
                        class144.field1711 = var19.method1107(false);
                        class167.field2200 = var19.method1107(false);
                        class354.field4738 = var19.method1107(false);
                        class508.field7190 = var19.method1095((byte) 119);
                        class398.field5520 = class681.field9312.method1560(class508.field7190, 0);
                        class446.field6282 = var19.method1094(255);
                        class661.field9074 = var19.method1107(false);
                        class443.field6202 = var19.method1107(false);
                        class458.field6399 = var19.method1094(255) == 1;
                        class339.field4374.field7690 = class339.field4374.field7656 = class33.field515 = var19.method1109(84);
                        class496.field7026 = var19.method1094(255);
                        class713.field10024 = var19.method1095((byte) 127);
                        class197.field2532 = new class187();
                        class197.field2532.field2454 = var19.method1107(false);
                        if (class197.field2532.field2454 == 65535) {
                            class197.field2532.field2454 = -1;
                        }
                        class197.field2532.field2460 = var19.method1109(87);
                        if (class323.field4120 != class171.field2248) {
                            class197.field2532.field2461 = class197.field2532.field2454 + 40000;
                            class197.field2532.field2456 = class197.field2532.field2454 + 50000;
                        }
                        if (class323.field4120 != class20.field257 && (class575.field8035.method1191(true, class750.field10496) || class575.field8035.method1191(true, class718.field10125))) {
                            class667.method3610((byte) -21);
                        }
                    } else {
                        return;
                    }
                    if ((!class58.field824 || class149.field1813) && !class737.field10330) {
                        try {
                            class193.method1213(-13481, "unzap", class745.field10393);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            class193.method1213(-13481, "zap", class745.field10393);
                        } catch (Throwable var26) {
                            if (class508.field7189) {
                                try {
                                    class745.field10393.getAppletContext().showDocument(new URL(class745.field10393.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var24) {
                                }
                            }
                        }
                    }
                    if (class323.field4120 == class171.field2248) {
                        try {
                            class193.method1213(-13481, "loggedin", class745.field10393);
                        } catch (Throwable var23) {
                        }
                    }
                    if (class202.field2576 != 2) {
                        class575.field8031 = 0;
                        class600.method3307(104, 2);
                        class457.method2675((byte) -115);
                        class614.method3369(7, (byte) -54);
                        class730.field10219 = null;
                        return;
                    }
                    class575.field8031 = 11;
                }
                if (class575.field8031 == 11) {
                    if (!class426.field6057.method873(3, (byte) -127)) {
                        return;
                    }
                    class426.field6057.method870(0, 3, class24.field414.field2325, false);
                    class575.field8031 = 12;
                }
                if (class575.field8031 == 12) {
                    class757 var20 = class24.field414;
                    var20.field2354 = 0;
                    if (var20.method4207((byte) 77)) {
                        if (!class426.field6057.method873(1, (byte) -127)) {
                            return;
                        }
                        class426.field6057.method870(3, 1, var20.field2325, false);
                    }
                    class730.field10219 = class228.method1462(2)[var20.method4211(1526808035)];
                    class677.field9199 = var20.method1107(false);
                    class575.field8031 = 10;
                }
                if (class575.field8031 == 10) {
                    if (class426.field6057.method873(class677.field9199, (byte) -128)) {
                        class426.field6057.method870(0, class677.field9199, class24.field414.field2325, false);
                        class24.field414.field2354 = 0;
                        class575.field8031 = 0;
                        int var21 = class677.field9199;
                        class600.method3307(93, 2);
                        class458.method2681(-113);
                        class87.method607(class24.field414, 28960);
                        class108.field1336 = -1;
                        if (class730.field10219 == class109.field1340) {
                            class657.method3568(-114);
                        } else {
                            class218.method1316(0);
                        }
                        if (class24.field414.field2354 != var21) {
                            throw new RuntimeException("lswp pos:" + class24.field414.field2354 + " psize:" + var21);
                        }
                        class730.field10219 = null;
                    }
                } else if (class575.field8031 == 14) {
                    if (class677.field9199 == -2) {
                        if (!class426.field6057.method873(2, (byte) -128)) {
                            return;
                        }
                        class426.field6057.method870(0, 2, class24.field414.field2325, false);
                        class24.field414.field2354 = 0;
                        class677.field9199 = class24.field414.method1107(false);
                    }
                    if (class426.field6057.method873(class677.field9199, (byte) -128)) {
                        class426.field6057.method870(0, class677.field9199, class24.field414.field2325, false);
                        class24.field414.field2354 = 0;
                        class575.field8031 = 0;
                        int var22 = class677.field9199;
                        class600.method3307(90, 15);
                        class54.method441((byte) 31);
                        class87.method607(class24.field414, 28960);
                        if (class24.field414.field2354 != var22) {
                            throw new RuntimeException("lswpr pos:" + class24.field414.field2354 + " psize:" + var22);
                        }
                        class730.field10219 = null;
                    }
                } else if (arg0 > -116) {
                    field8008 = null;
                }
            } else if (class426.field6057.method873(1, (byte) -128)) {
                class426.field6057.method870(0, 1, class24.field414.field2325, false);
                class575.field8031 = 9;
                class453.field6359 = class24.field414.field2325[0] & 0xFF;
            }
        } catch (IOException var27) {
            if (class426.field6057 != null) {
                class426.field6057.method872(-1);
                class426.field6057 = null;
            }
            if (class542.field7630 < 3) {
                if (class202.field2576 == 2) {
                    class575.field8035.method1193((byte) -68);
                } else {
                    class86.field1102.method1193((byte) -68);
                }
                class446.field6281 = 0;
                class575.field8031 = 1;
                class542.field7630++;
            } else {
                class575.field8031 = 0;
                class600.method3307(111, -4);
                class157.method980((byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lbm;IIIIII)V", line = 592)
    public class573(class684 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8006 = arg3;
        this.field8000 = arg5;
        this.field7998 = arg2;
        this.field8001 = arg4;
        this.field8004 = arg6;
        this.field7999 = arg1;
        this.field8003 = arg0;
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V", line = 607)
    public static void method3220(byte arg0) {
        field7997 = null;
        field8005 = null;
        field8008 = null;
        if (arg0 == 102) {
            field8010 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)Lsq;", line = 620)
    public final class207 method2752(boolean arg0) {
        field8007++;
        if (this.field8002 == null) {
            class213.field2709[3] = this.field8001;
            class213.field2709[2] = this.field8006;
            class213.field2709[1] = this.field7998;
            class213.field2709[5] = this.field8004;
            class96 var2 = this.field8003.field6364;
            class213.field2709[0] = this.field7999;
            class213.field2709[4] = this.field8000;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method390(class213.field2709[var5], -9396)) {
                    return null;
                }
                class91 var7 = var2.method389(9559, class213.field2709[var5]);
                int var8 = var7.field1159 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field1153 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class477.field6822[var6] = var2.method395(false, 1.0F, var4, class213.field2709[var6], -11288, var4);
            }
            this.field8002 = this.field8003.method1429(var4, false, class477.field6822, var3);
        }
        return arg0 ? this.field8002 : null;
    }
}
