import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class451 {

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "J")
    public long field5955;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "Lag;")
    private class469 field5956;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "[J")
    public static long[] field5952 = new long[32];

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!vk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5957++;
        this.field5956.method2640(this.field5955, 6);
        super.finalize();
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V")
    public static final void method2533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5959++;
        class322.field4315 = arg1;
        class455.field5996 = arg0;
        if (arg3 < 20) {
            method2534(-1);
        }
        class649.field8972 = arg2;
        class491.field6791 = arg4;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method2534(int arg0) {
        field5951++;
        if (class420.field5513 == 0 || class420.field5513 == 6) {
            return;
        }
        try {
            if (++class347.field4631 > 2000) {
                if (class163.field2346 != null) {
                    class163.field2346.method1164(arg0 ^ 0xFFFFD717);
                    class163.field2346 = null;
                }
                if (class21.field270 >= 2) {
                    class420.field5513 = 0;
                    class126.method747(-5, (byte) 34);
                    return;
                }
                if (class378.field5005 == 2 || class378.field5005 == 3) {
                    class540.field7409.method1694(arg0 + 10406);
                } else {
                    class324.field4369.method1694(arg0 + 10406);
                }
                class420.field5513 = 1;
                class347.field4631 = 0;
                class21.field270++;
            }
            if (class420.field5513 == 1) {
                if (class378.field5005 == 2 || class378.field5005 == 3) {
                    class242.field3186 = class540.field7409.method1689(-10520, class312.field4206);
                } else {
                    class242.field3186 = class324.field4369.method1689(-10520, class312.field4206);
                }
                class420.field5513 = 2;
            }
            if (class420.field5513 == 2) {
                if (class242.field3186.field9420 == 2) {
                    throw new IOException();
                }
                if (class242.field3186.field9420 != 1) {
                    return;
                }
                class163.field2346 = class485.method2787(127, 7500, (Socket) class242.field3186.field9421);
                class242.field3186 = null;
                long var1 = class37.field500 = class633.method3510(arg0 + 10302, class213.field2815);
                class420.method2373(arg0 ^ 0xFFFFD726);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class229 var4 = class298.method1751(arg0 + 10512);
                var4.field2971.method915(-31914, class624.field8641.field799);
                var4.field2971.method915(-31914, var3);
                class307.method1805(var4, -14704);
                class493.method2814(-30301);
                class420.field5513 = 3;
            }
            if (class420.field5513 == 3) {
                if (!class163.field2346.method1163(-126, 1)) {
                    return;
                }
                class163.field2346.method1160((byte) -47, class289.field3807.field2199, 0, 1);
                int var5 = class289.field3807.field2199[0] & 0xFF;
                if (var5 != 0) {
                    class420.field5513 = 0;
                    class126.method747(var5, (byte) 34);
                    class163.field2346.method1164(92);
                    class163.field2346 = null;
                    class504.method2868(5);
                    return;
                }
                class420.field5513 = 4;
            }
            if (class420.field5513 == 4) {
                if (!class163.field2346.method1163(-126, 8)) {
                    return;
                }
                class163.field2346.method1160((byte) -100, class289.field3807.field2199, 0, 8);
                class289.field3807.field2219 = 0;
                class71.field842 = class289.field3807.method953(true);
                class157 var6 = new class157(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class71.field842 >> 32), (int) class71.field842 };
                var6.method915(-31914, 10);
                var6.method958(arg0 + 10401, var7[0]);
                var6.method958(0, var7[1]);
                var6.method958(arg0 ^ 0xFFFFD75F, var7[2]);
                var6.method958(0, var7[3]);
                var6.method917(1315630008, class633.method3510(98, class213.field2815));
                var6.method936(class299.field3960, -109);
                var6.method917(1315630008, class422.field5536);
                var6.method917(1315630008, class281.field3698);
                var6.method944(class141.field1913, -125, class254.field3326);
                class420.method2373(117);
                class229 var8 = class298.method1751(65);
                class537 var9 = var8.field2971;
                if (class378.field5005 == 2 || class378.field5005 == 3) {
                    if (class576.field7861 == 13) {
                        var9.method915(-31914, class624.field8647.field799);
                    } else {
                        var9.method915(arg0 - 21513, class624.field8645.field799);
                    }
                    var9.method918(24551, 0);
                    int var10 = var9.field2219;
                    var9.method958(0, 619);
                    var9.method915(-31914, class149.field2037);
                    var9.method915(arg0 ^ 0x5409, class702.method3945((byte) -118));
                    var9.method918(24551, class399.field5301);
                    var9.method918(arg0 ^ 0xFFFF88B8, class60.field750);
                    var9.method915(-31914, class602.field8408.field4325);
                    class91.method498(-25, var9);
                    var9.method936(class291.field3850, arg0 + 10281);
                    var9.method958(arg0 ^ 0xFFFFD75F, class190.field2640);
                    class157 var11 = new class157(class188.method1245(-18302));
                    class602.field8408.method1869((byte) -53, var11);
                    var9.method915(-31914, var11.field2219);
                    var9.method949(var11.field2199, var11.field2219, 0, (byte) -33);
                    class375.field4974 = true;
                    class157 var12 = new class157(class474.method2732(false));
                    (new class269(true, class312.field4206)).method1607((byte) 89, var12);
                    var9.method949(var12.field2199, var12.field2199.length, 0, (byte) -30);
                    var9.method918(24551, class460.field6025);
                    var9.method917(1315630008, class478.field6658);
                    var9.method915(-31914, class200.field2710 == null ? 0 : 1);
                    if (class200.field2710 != null) {
                        var9.method936(class200.field2710, 118);
                    }
                    class581.method3200(65535, var9);
                    var9.method949(var6.field2199, var6.field2219, 0, (byte) 126);
                    var9.method960(arg0 ^ 0x28A0, var9.field2219 - var10);
                } else {
                    var9.method915(-31914, class624.field8648.field799);
                    var9.method918(24551, 0);
                    int var13 = var9.field2219;
                    var9.method958(0, 619);
                    var9.method915(-31914, class508.field7015.field8976);
                    var9.method915(-31914, class422.field5539);
                    class91.method498(-25, var9);
                    var9.method936(class291.field3850, -47);
                    var9.method958(0, class190.field2640);
                    class581.method3200(65535, var9);
                    var9.method949(var6.field2199, var6.field2219, 0, (byte) -10);
                    var9.method960(-1, var9.field2219 - var13);
                }
                class307.method1805(var8, arg0 ^ 0x11CF);
                class493.method2814(-30301);
                class71.field841 = new class603(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class289.field3807.method3019(var7, -1853026621);
                class420.field5513 = 5;
            }
            if (class420.field5513 == 5) {
                if (!class163.field2346.method1163(arg0 ^ 0xFFFFD707, 1)) {
                    return;
                }
                class163.field2346.method1160((byte) -96, class289.field3807.field2199, 0, 1);
                int var15 = class289.field3807.field2199[0] & 0xFF;
                if (var15 == 21) {
                    class420.field5513 = 8;
                } else if (var15 == 29) {
                    class420.field5513 = 14;
                } else if (var15 == 1) {
                    class420.field5513 = 6;
                    class126.method747(var15, (byte) 34);
                    return;
                } else if (var15 == 2) {
                    class420.field5513 = 9;
                } else if (var15 == 15) {
                    class151.field2070 = -2;
                    class420.field5513 = 15;
                } else if (var15 == 23 && class21.field270 < 2) {
                    class21.field270++;
                    class347.field4631 = 0;
                    class420.field5513 = 1;
                    class163.field2346.method1164(arg0 ^ 0xFFFFD729);
                    class163.field2346 = null;
                    return;
                } else {
                    class420.field5513 = 0;
                    class126.method747(var15, (byte) 34);
                    class163.field2346.method1164(arg0 + 10519);
                    class163.field2346 = null;
                    class504.method2868(5);
                    return;
                }
            }
            if (class420.field5513 == 7) {
                class420.method2373(117);
                class229 var16 = class298.method1751(62);
                class537 var17 = var16.field2971;
                var17.method3015((byte) -123, class71.field841);
                var17.method3018(class624.field8655.field799, (byte) 63);
                class307.method1805(var16, -14704);
                class493.method2814(-30301);
                class420.field5513 = 5;
                return;
            }
            if (class420.field5513 == 8) {
                if (!class163.field2346.method1163(-125, 1)) {
                    return;
                }
                class163.field2346.method1160((byte) -42, class289.field3807.field2199, 0, 1);
                int var18 = class289.field3807.field2199[0] & 0xFF;
                class72.field861 = (var18 + 3) * 60;
                class420.field5513 = 0;
                class126.method747(21, (byte) 34);
                class163.field2346.method1164(arg0 ^ 0xFFFFD717);
                class163.field2346 = null;
                class504.method2868(arg0 + 10406);
                return;
            }
            if (class420.field5513 == 14) {
                if (!class163.field2346.method1163(-128, 1)) {
                    return;
                }
                class163.field2346.method1160((byte) -64, class289.field3807.field2199, 0, 1);
                class420.field5513 = 0;
                class504.field6939 = class289.field3807.field2199[0] & 0xFF;
                class126.method747(29, (byte) 34);
                class163.field2346.method1164(108);
                class163.field2346 = null;
                class504.method2868(5);
                return;
            }
            if (class420.field5513 == 9) {
                if (!class163.field2346.method1163(arg0 + 10475, 1)) {
                    return;
                }
                class163.field2346.method1160((byte) -127, class289.field3807.field2199, 0, 1);
                class420.field5513 = 10;
                class689.field9741 = class289.field3807.field2199[0] & 0xFF;
                return;
            }
            if (class420.field5513 == 10) {
                class537 var19 = class289.field3807;
                if (class378.field5005 == 3) {
                    class257.field3368 = true;
                } else {
                    class257.field3368 = false;
                }
                if (class378.field5005 == 2 || class378.field5005 == 3) {
                    if (!class163.field2346.method1163(60, class689.field9741)) {
                        return;
                    }
                    class163.field2346.method1160((byte) -57, var19.field2199, 0, class689.field9741);
                    var19.field2219 = 0;
                    class121.field1585 = var19.method930(255);
                    class572.field7776 = var19.method930(255);
                    class227.field2946 = var19.method930(arg0 + 10656) == 1;
                    class187.field2601 = var19.method930(255) == 1;
                    class407.field5361 = var19.method930(255) == 1;
                    class26.field344 = var19.method930(255) == 1;
                    class423.field5702 = var19.method963(-125);
                    class545.field7450 = var19.method930(255) == 1;
                    class699.field9860 = var19.method947(-5360);
                    class414.field5431 = var19.method930(255) == 1;
                    if (class378.field5005 == 3) {
                        boolean var20 = var19.method930(255) == 1;
                        if (var20) {
                            long var21 = var19.method953(true);
                            String var23 = class339.method1979(0, var21);
                            int var24 = var19.method930(255);
                            byte[] var25 = new byte[var24];
                            var19.method3014(0, arg0 ^ 0xF5B3499, var24, var25);
                            String var26 = class115.method676((byte) -125, var25);
                            class611 var27 = null;
                            try {
                                class661 var28 = class312.field4206.method2236("3", (byte) -106, false);
                                while (var28.field9420 == 0) {
                                    class588.method3253(0, 1L);
                                }
                                if (var28.field9420 == 1) {
                                    var27 = (class611) var28.field9421;
                                    int var29 = var23.length() + var26.length() + 10 + 3 + 2 + 5;
                                    if (class200.field2710 != null) {
                                        var29 += class200.field2710.length() + 2;
                                    }
                                    if (var29 > 120) {
                                        throw new RuntimeException(">120");
                                    }
                                    class157 var30 = new class157(var29 + 1);
                                    var30.method915(-31914, var29);
                                    var30.method915(arg0 ^ 0x5409, 3);
                                    var30.method938(var23, 26665);
                                    var30.method938(var26, arg0 + 37066);
                                    var30.method918(24551, class190.field2640);
                                    var30.method917(1315630008, class478.field6658);
                                    var30.method915(-31914, class200.field2710 == null ? 0 : 1);
                                    if (class200.field2710 != null) {
                                        var30.method938(class200.field2710, arg0 ^ 0xFFFFBF76);
                                    }
                                    var30.method942(true);
                                    var27.method3389(arg0 + 10297, 0, var30.field2199, var30.field2219);
                                }
                            } catch (Exception var40) {
                            }
                            try {
                                if (var27 != null) {
                                    var27.method3390(arg0 + 10401);
                                }
                            } catch (Exception var38) {
                            }
                            try {
                                class507.method2883(class516.field7178, -4200, "demoaccountcreated");
                            } catch (Throwable var37) {
                            }
                        }
                    }
                    class118.field1510.method3920((byte) -112, class414.field5431);
                    class87.field1058.method1405(0, class414.field5431);
                    class440.field5847.method505(24, class414.field5431);
                } else if (class163.field2346.method1163(arg0 + 10428, class689.field9741)) {
                    class163.field2346.method1160((byte) -123, var19.field2199, 0, class689.field9741);
                    var19.field2219 = 0;
                    class121.field1585 = var19.method930(255);
                    class572.field7776 = var19.method930(255);
                    class227.field2946 = var19.method930(255) == 1;
                    class187.field2601 = var19.method930(255) == 1;
                    class407.field5361 = var19.method930(255) == 1;
                    class322.field4308 = var19.method928(2016790224);
                    class545.field7450 = class322.field4308 > 0;
                    class378.field5013 = var19.method963(-125);
                    class597.field8220 = var19.method963(arg0 + 10275);
                    class22.field275 = var19.method963(-122);
                    class519.field7204 = var19.method908(false);
                    class582.field7965 = class312.field4206.method2226(class519.field7204, true);
                    class83.field1006 = var19.method930(255);
                    class446.field5902 = var19.method963(arg0 ^ 0x28DC);
                    class524.field7279 = var19.method963(arg0 + 10279);
                    class603.field8422 = var19.method930(255) == 1;
                    class408.field5369.field7791 = class408.field5369.field7811 = var19.method932(0);
                    class701.field9872 = var19.method930(arg0 + 10656);
                    class660.field9417 = var19.method908(false);
                    class332.field4461 = new class285();
                    class332.field4461.field3769 = var19.method963(-127);
                    if (class332.field4461.field3769 == 65535) {
                        class332.field4461.field3769 = -1;
                    }
                    class332.field4461.field3772 = var19.method932(0);
                    if (class480.field6673 != class180.field2522) {
                        class332.field4461.field3773 = class332.field4461.field3769 + 40000;
                        class332.field4461.field3764 = class332.field4461.field3769 + 50000;
                    }
                    if (class675.field9604 != class480.field6673 && (class540.field7409.method1692(class625.field8660, -30935) || class540.field7409.method1692(class450.field5948, -30935))) {
                        class361.method2115(108);
                    }
                } else {
                    return;
                }
                if ((!class227.field2946 || class407.field5361) && !class545.field7450) {
                    try {
                        class507.method2883(class516.field7178, arg0 + 6201, "unzap");
                    } catch (Throwable var35) {
                    }
                } else {
                    try {
                        class507.method2883(class516.field7178, -4200, "zap");
                    } catch (Throwable var39) {
                        if (class252.field3312) {
                            try {
                                class516.field7178.getAppletContext().showDocument(new URL(class516.field7178.getCodeBase(), "blank.ws"), "tbi");
                            } catch (Exception var36) {
                            }
                        }
                    }
                }
                if (class480.field6673 == class180.field2522) {
                    try {
                        class507.method2883(class516.field7178, -4200, "loggedin");
                    } catch (Throwable var34) {
                    }
                }
                if (class378.field5005 != 2 && class378.field5005 != 3) {
                    class420.field5513 = 0;
                    class126.method747(2, (byte) 34);
                    class538.method3021(arg0 ^ 0x28D1);
                    class28.method182(7, arg0 + 40098);
                    class213.field2817 = null;
                    return;
                }
                class420.field5513 = 12;
            }
            if (class420.field5513 == 12) {
                if (!class163.field2346.method1163(101, 3)) {
                    return;
                }
                class163.field2346.method1160((byte) -65, class289.field3807.field2199, 0, 3);
                class420.field5513 = 13;
            }
            if (class420.field5513 == 13) {
                class537 var31 = class289.field3807;
                var31.field2219 = 0;
                if (var31.method3009(1)) {
                    if (!class163.field2346.method1163(19, 1)) {
                        return;
                    }
                    class163.field2346.method1160((byte) -121, var31.field2199, 3, 1);
                }
                class213.field2817 = class75.method416((byte) -99)[var31.method3012((byte) -82)];
                class151.field2070 = var31.method963(-122);
                class420.field5513 = 11;
            }
            if (class420.field5513 == 11) {
                if (!class163.field2346.method1163(arg0 ^ 0x28DA, class151.field2070)) {
                    return;
                }
                class163.field2346.method1160((byte) -75, class289.field3807.field2199, 0, class151.field2070);
                class289.field3807.field2219 = 0;
                int var32 = class151.field2070;
                class420.field5513 = 0;
                class126.method747(2, (byte) 34);
                class64.method370((byte) 108);
                class81.method433(class289.field3807, (byte) -97);
                class312.field4205 = -1;
                if (class619.field8596 == class213.field2817) {
                    class418.method2367((byte) -123);
                } else {
                    class586.method3246(false);
                }
                if (class289.field3807.field2219 != var32) {
                    throw new RuntimeException("lswp pos:" + class289.field3807.field2219 + " psize:" + var32);
                }
                class213.field2817 = null;
                return;
            }
            if (class420.field5513 == 15) {
                if (class151.field2070 == -2) {
                    if (!class163.field2346.method1163(arg0 ^ 0xFFFFD744, 2)) {
                        return;
                    }
                    class163.field2346.method1160((byte) -117, class289.field3807.field2199, 0, 2);
                    class289.field3807.field2219 = 0;
                    class151.field2070 = class289.field3807.method963(arg0 + 10278);
                }
                if (!class163.field2346.method1163(-123, class151.field2070)) {
                    return;
                }
                class163.field2346.method1160((byte) -73, class289.field3807.field2199, 0, class151.field2070);
                class289.field3807.field2219 = 0;
                int var33 = class151.field2070;
                class420.field5513 = 0;
                class126.method747(15, (byte) 34);
                class234.method1450(-110);
                class81.method433(class289.field3807, (byte) -97);
                if (class289.field3807.field2219 != var33) {
                    throw new RuntimeException("lswpr pos:" + class289.field3807.field2219 + " psize:" + var33);
                }
                class213.field2817 = null;
                return;
            }
        } catch (IOException var41) {
            if (class163.field2346 != null) {
                class163.field2346.method1164(57);
                class163.field2346 = null;
            }
            if (class21.field270 < 2) {
                if (class378.field5005 == 2 || class378.field5005 == 3) {
                    class540.field7409.method1694(5);
                } else {
                    class324.field4369.method1694(5);
                }
                class21.field270++;
                class420.field5513 = 1;
                class347.field4631 = 0;
            } else {
                class420.field5513 = 0;
                class126.method747(-4, (byte) 34);
                class504.method2868(5);
            }
        }
        if (arg0 != -10401) {
            method2538(-82, -26, 94, -8, -11, 115, -51, -119);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
    public static void method2535(byte arg0) {
        field5952 = null;
        if (arg0 != 7) {
            method2535((byte) -48);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZI)V")
    public static final void method2536(boolean arg0, int arg1) {
        field5958++;
        class256 var2 = class592.method3279((byte) -48, 10, arg1);
        var2.method1546((byte) 123);
        if (!arg0) {
            field5952 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2537(String arg0, int arg1) {
        field5960++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class52.field662; var2++) {
            if (arg0.equalsIgnoreCase(class420.field5517[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class152.field2089[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5953++;
        int var8 = arg0 + arg1;
        int var9 = arg6 - arg0;
        int var10 = arg1;
        if (arg7 != 0) {
            field5952 = null;
        }
        while (var10 < var8) {
            class285.method1691(arg4, class315.field4224[var10], -7, arg3, arg5);
            var10++;
        }
        int var11 = arg4 - arg0;
        int var12 = arg0 + arg3;
        for (int var13 = arg6; var13 > var9; var13--) {
            class285.method1691(arg4, class315.field4224[var13], -7, arg3, arg5);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class315.field4224[var14];
            class285.method1691(var12, var15, -7, arg3, arg5);
            class285.method1691(var11, var15, -7, var12, arg2);
            class285.method1691(arg4, var15, -7, var11, arg5);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public static final void method2539(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5954++;
        class33 var8 = new class33();
        var8.field467 = arg0;
        var8.field466 = arg3;
        int var9 = 46 % ((arg6 - 46) / 32);
        var8.field464 = class327.field4404 + arg7;
        var8.field463 = arg1;
        var8.field459 = arg4;
        var8.field458 = arg2;
        var8.field462 = arg5;
        class110.field1298.method1300(var8, -1);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lag;JI)V")
    public class451(class469 arg0, long arg1, int arg2) {
        this.field5955 = arg1;
        this.field5956 = arg0;
    }
}
