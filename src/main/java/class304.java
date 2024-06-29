import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class304 {

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "Leo;")
    private class516 field4443;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Lkw;")
    private class174 field4435;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public int field4444;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    private int field4431;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "[B")
    public byte[] field4432;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    private int field4447;

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
    private int field4439;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    private int field4437;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field4433 = 0;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "[[Lfp;")
    private class527[][] field4442;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBIII)V", line = 5)
    private final void method1871(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4438++;
        if (this.field4442 == null) {
            return;
        }
        int var6 = arg4 - 1 >> 7;
        int var7 = arg2 + arg4 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg3 - 1 - 1 >> 7;
        if (arg1 >= -3) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class527[] var11 = this.field4442[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field7833 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "([Ljava/lang/Object;I[III)V", line = 47)
    public static final void method1872(Object[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 > arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            Object var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if (((var9 & var10) + var7) > arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method1872(arg0, arg1, arg2, var6 - 1, 107);
            method1872(arg0, var6 + 1, arg2, arg3, 120);
        }
        if (arg4 < 102) {
            field4433 = 74;
        }
        field4436++;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 102)
    public static final void method1873(int arg0) {
        field4448++;
        if (class395.field5743 == 0 || class395.field5743 == 6) {
            return;
        }
        try {
            if (++class142.field1852 > 2000) {
                if (class513.field7606 != null) {
                    class513.field7606.method1247((byte) 121);
                    class513.field7606 = null;
                }
                if (class616.field9020 >= 1) {
                    class395.field5743 = 0;
                    class313.method1932(-5, false);
                    return;
                }
                class142.field1852 = 0;
                class616.field9020++;
                class395.field5743 = 1;
                if (class322.field4782 == 2 || class322.field4782 == 3) {
                    class536.field7933.field6634 = !class536.field7933.field6634;
                } else {
                    class277.field4060.field6634 = !class277.field4060.field6634;
                }
            }
            if (class395.field5743 == 1) {
                if (class322.field4782 == 2 || class322.field4782 == 3) {
                    class264.field3905 = class328.field4850.method2164(class536.field7933.field6630, (byte) -96, class536.field7933.method2731(-3386));
                } else {
                    class264.field3905 = class328.field4850.method2164(class277.field4060.field6630, (byte) -96, class277.field4060.method2731(-3386));
                }
                class395.field5743 = 2;
            }
            if (class395.field5743 == 2) {
                if (class264.field3905.field4208 == 2) {
                    throw new IOException();
                }
                if (class264.field3905.field4208 != 1) {
                    return;
                }
                class513.field7606 = class395.method2375(-12523, (Socket) class264.field3905.field4213, 5000);
                class264.field3905 = null;
                long var1 = class269.field3988 = class273.method1727(0, class227.field3343);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class221.field3268.field6221 = 0;
                class221.field3268.method2563(-13021, class538.field7955.field8954);
                class221.field3268.method2563(-13021, var3);
                class513.field7606.method1243(class221.field3268.field6162, 2, 0, -27985);
                class395.field5743 = 3;
            }
            if (class395.field5743 == 3) {
                if (!class513.field7606.method1246(1, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 40, 1);
                int var4 = class271.field4010.field6162[0] & 0xFF;
                if (var4 != 0) {
                    class395.field5743 = 0;
                    class313.method1932(var4, false);
                    class513.field7606.method1247((byte) 52);
                    class513.field7606 = null;
                    class34.method156((byte) -52);
                    return;
                }
                class395.field5743 = 4;
            }
            if (class395.field5743 == 4) {
                if (!class513.field7606.method1246(8, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 119, 8);
                class271.field4010.field6221 = 0;
                class216.field3201 = class271.field4010.method2609((byte) -103);
                class428 var5 = new class428(518);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class216.field3201 >> 32), (int) class216.field3201 };
                var5.method2563(-13021, 10);
                var5.method2576(true, var6[0]);
                var5.method2576(true, var6[1]);
                var5.method2576(true, var6[2]);
                var5.method2576(true, var6[3]);
                var5.method2583(false, class273.method1727(0, class227.field3343));
                var5.method2580(class451.field6590, 30127);
                var5.method2583(false, class565.field8372);
                var5.method2583(false, class494.field7450);
                var5.method2586(class249.field3633, (byte) -116, class418.field6006);
                class483 var7 = class221.field3268;
                var7.field6221 = 0;
                if (class322.field4782 == 2 || class322.field4782 == 3) {
                    if (class192.field2903 == 12) {
                        var7.method2563(-13021, class538.field7962.field8954);
                    } else {
                        var7.method2563(-13021, class538.field7960.field8954);
                    }
                    var7.method2608(0, (byte) 54);
                    int var8 = var7.field6221;
                    var7.method2576(true, 607);
                    var7.method2563(-13021, class621.field9066);
                    var7.method2563(-13021, class608.method3540(122));
                    var7.method2608(class522.field7735, (byte) 100);
                    var7.method2608(class337.field4944, (byte) 83);
                    var7.method2563(-13021, class94.field1158.field285);
                    class117.method725(var7, false);
                    var7.method2580(class311.field4583, 30127);
                    var7.method2576(true, class555.field8240);
                    class428 var9 = new class428(class477.method2897((byte) -116));
                    class94.field1158.method135(0, var9);
                    var7.method2563(-13021, var9.field6221);
                    var7.method2612(23958, var9.field6221, var9.field6162, 0);
                    class393.field5714 = true;
                    class428 var10 = new class428(class609.method3542(14));
                    (new class169(true, class328.field4850)).method1073((byte) 85, var10);
                    var7.method2612(23958, var10.field6162.length, var10.field6162, 0);
                    var7.method2608(class205.field3037, (byte) 58);
                    class497.method3000(0);
                    var7.method2612(23958, var5.field6221, var5.field6162, 0);
                    var7.method2599(var7.field6221 - var8, -19);
                } else {
                    var7.method2563(-13021, class538.field7963.field8954);
                    var7.method2608(0, (byte) 74);
                    int var11 = var7.field6221;
                    var7.method2576(true, 607);
                    var7.method2563(-13021, class461.field6666.field8301);
                    var7.method2563(-13021, class77.field889);
                    class117.method725(var7, false);
                    var7.method2580(class311.field4583, 30127);
                    var7.method2576(true, class555.field8240);
                    class497.method3000(0);
                    var7.method2612(23958, var5.field6221, var5.field6162, 0);
                    var7.method2599(var7.field6221 - var11, -19);
                }
                class513.field7606.method1243(var7.field6162, var7.field6221, 0, -27985);
                var7.method2932((byte) -118, var6);
                for (int var12 = 0; var12 < 4; var12++) {
                    var6[var12] += 50;
                }
                class271.field4010.method2932((byte) -118, var6);
                class395.field5743 = 5;
            }
            if (class395.field5743 == 5) {
                if (!class513.field7606.method1246(1, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 89, 1);
                int var13 = class271.field4010.field6162[0] & 0xFF;
                if (var13 == 21) {
                    class395.field5743 = 8;
                } else if (var13 == 29) {
                    class395.field5743 = 14;
                } else if (var13 == 1) {
                    class395.field5743 = 6;
                    class313.method1932(var13, false);
                    return;
                } else if (var13 == 2) {
                    class395.field5743 = 9;
                } else if (var13 == 15) {
                    class425.field6072 = -2;
                    class395.field5743 = 15;
                } else if (var13 == 23 && class616.field9020 < 1) {
                    class142.field1852 = 0;
                    class395.field5743 = 1;
                    class616.field9020++;
                    class513.field7606.method1247((byte) 114);
                    class513.field7606 = null;
                    return;
                } else {
                    class395.field5743 = 0;
                    class313.method1932(var13, false);
                    class513.field7606.method1247((byte) 109);
                    class513.field7606 = null;
                    class34.method156((byte) -126);
                    return;
                }
            }
            if (class395.field5743 == 7) {
                class221.field3268.field6221 = 0;
                class221.field3268.method2926(8, class538.field7970.field8954);
                class513.field7606.method1243(class221.field3268.field6162, class221.field3268.field6221, 0, -27985);
                class395.field5743 = 5;
                return;
            }
            if (class395.field5743 == 8) {
                if (!class513.field7606.method1246(1, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 117, 1);
                int var14 = class271.field4010.field6162[0] & 0xFF;
                class619.field9035 = var14 * 60 + 180;
                class395.field5743 = 0;
                class313.method1932(21, false);
                class513.field7606.method1247((byte) 119);
                class513.field7606 = null;
                class34.method156((byte) -105);
                return;
            }
            if (class395.field5743 == 14) {
                if (!class513.field7606.method1246(1, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 103, 1);
                class431.field6313 = class271.field4010.field6162[0] & 0xFF;
                class395.field5743 = 0;
                class313.method1932(29, false);
                class513.field7606.method1247((byte) 98);
                class513.field7606 = null;
                class34.method156((byte) -66);
                return;
            }
            if (class395.field5743 == 9) {
                if (!class513.field7606.method1246(1, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 113, 1);
                class57.field701 = class271.field4010.field6162[0] & 0xFF;
                class395.field5743 = 10;
                return;
            }
            if (class395.field5743 == 10) {
                if (class322.field4782 == 3) {
                    class383.field5608 = true;
                } else {
                    class383.field5608 = false;
                }
                class483 var15 = class271.field4010;
                if (class322.field4782 == 2 || class322.field4782 == 3) {
                    if (!class513.field7606.method1246(class57.field701, -25354)) {
                        return;
                    }
                    class513.field7606.method1248(0, var15.field6162, 53, class57.field701);
                    var15.field6221 = 0;
                    class370.field5351 = var15.method2561((byte) 107);
                    class328.field4848 = var15.method2561((byte) -98);
                    class506.field7545 = var15.method2561((byte) -39) == 1;
                    class80.field916 = var15.method2561((byte) -121) == 1;
                    class19.field181 = var15.method2561((byte) -35) == 1;
                    class163.field2181 = var15.method2561((byte) 112) == 1;
                    class404.field5807 = var15.method2620(105);
                    class109.field1382 = var15.method2561((byte) 113) == 1;
                    class252.field3689 = var15.method2607(93);
                    class306.field4467 = var15.method2561((byte) 108) == 1;
                    if (class322.field4782 == 3) {
                        boolean var16 = var15.method2561((byte) -116) == 1;
                        if (var16) {
                            long var17 = var15.method2609((byte) -103);
                            String var19 = class368.method2245(var17, 20296);
                            int var20 = var15.method2561((byte) 127);
                            byte[] var21 = new byte[var20];
                            var15.method2927(true, 0, var21, var20);
                            String var22 = class582.method3396(-109, var21);
                            class211 var23 = null;
                            try {
                                class286 var24 = class328.field4850.method2175("3", 47, false);
                                while (var24.field4208 == 0) {
                                    class428.method2624(1, 1L);
                                }
                                if (var24.field4208 == 1) {
                                    var23 = (class211) var24.field4213;
                                    int var25 = var19.length() + (var22.length() + 3) + 2 + 2 + 4;
                                    if (var25 > 50) {
                                        throw new RuntimeException(">50");
                                    }
                                    class428 var26 = new class428(var25 + 1);
                                    var26.method2563(-13021, var25);
                                    var26.method2563(-13021, 1);
                                    var26.method2625(var19, true);
                                    var26.method2625(var22, true);
                                    var26.method2608(class555.field8240, (byte) 110);
                                    var26.method2591(-4);
                                    var23.method1368((byte) 37, 0, var26.field6221, var26.field6162);
                                }
                            } catch (Exception var37) {
                            }
                            try {
                                if (var23 != null) {
                                    var23.method1367(0);
                                }
                            } catch (Exception var35) {
                            }
                            try {
                                class222.method1460(false, "demoaccountcreated", class328.field4850.field5129);
                            } catch (Throwable var34) {
                            }
                        }
                    }
                    class312.field4690.method2009(-71, class306.field4467);
                    class216.field3204.method3362(class306.field4467, true);
                    class369.field5329.method1786(class306.field4467, -18098);
                } else if (class513.field7606.method1246(class57.field701, -25354)) {
                    class513.field7606.method1248(0, var15.field6162, 94, class57.field701);
                    var15.field6221 = 0;
                    class370.field5351 = var15.method2561((byte) 127);
                    class328.field4848 = var15.method2561((byte) 123);
                    class506.field7545 = var15.method2561((byte) 127) == 1;
                    class80.field916 = var15.method2561((byte) -108) == 1;
                    class19.field181 = var15.method2561((byte) -33) == 1;
                    class25.field232 = var15.method2620(29);
                    class109.field1382 = class25.field232 > 0;
                    class543.field8114 = var15.method2620(108);
                    class122.field1581 = var15.method2620(115);
                    class576.field8498 = var15.method2620(27);
                    class588.field8729 = var15.method2589(-11179);
                    class50.field597 = class328.field4850.method2169(class588.field8729, 104);
                    class178.field2699 = var15.method2561((byte) 117);
                    class600.field8868 = var15.method2620(16);
                    class109.field1383 = var15.method2620(92);
                    class30.field306 = var15.method2561((byte) -59) == 1;
                    class239.field3493.field2718 = class239.field3493.field2714 = var15.method2567(true);
                    class46.field548 = new class455();
                    class46.field548.field6633 = var15.method2620(78);
                    if (class46.field548.field6633 == 65535) {
                        class46.field548.field6633 = -1;
                    }
                    class46.field548.field6630 = var15.method2567(true);
                    if (class643.field9339 != class582.field8561) {
                        class46.field548.field6627 = class46.field548.field6633 + 40000;
                        class46.field548.field6631 = class46.field548.field6633 + 50000;
                    }
                    if (class636.field9261 != class582.field8561 && (class536.field7933.method2735(class648.field9400, (byte) 101) || class536.field7933.method2735(class311.field4669, (byte) 101))) {
                        class479.method2907((byte) -29);
                    }
                } else {
                    return;
                }
                if ((!class506.field7545 || class19.field181) && !class109.field1382) {
                    try {
                        class222.method1460(false, "unzap", class328.field4850.field5129);
                    } catch (Throwable var32) {
                    }
                } else {
                    try {
                        class222.method1460(false, "zap", class328.field4850.field5129);
                    } catch (Throwable var36) {
                        if (class231.field3420) {
                            try {
                                class328.field4850.field5129.getAppletContext().showDocument(new URL(class328.field4850.field5129.getCodeBase(), "blank.ws"), "tbi");
                            } catch (Exception var33) {
                            }
                        }
                    }
                }
                if (class643.field9339 == class582.field8561) {
                    try {
                        class222.method1460(false, "loggedin", class328.field4850.field5129);
                    } catch (Throwable var31) {
                    }
                }
                if (class322.field4782 != 2 && class322.field4782 != 3) {
                    class395.field5743 = 0;
                    class313.method1932(2, false);
                    class636.method3690(true);
                    class463.method2749(1, 6);
                    class260.field3820 = null;
                    return;
                }
                class395.field5743 = 12;
            }
            if (class395.field5743 == 12) {
                if (!class513.field7606.method1246(3, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 80, 3);
                class395.field5743 = 13;
            }
            if (class395.field5743 == 13) {
                class483 var27 = class271.field4010;
                var27.field6221 = 0;
                if (var27.method2936(-116)) {
                    if (!class513.field7606.method1246(1, -25354)) {
                        return;
                    }
                    class513.field7606.method1248(3, var27.field6162, 41, 1);
                }
                class260.field3820 = class427.method2546(-118)[var27.method2931(true)];
                class425.field6072 = var27.method2620(38);
                class395.field5743 = 11;
            }
            if (class395.field5743 == 11) {
                if (!class513.field7606.method1246(class425.field6072, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 77, class425.field6072);
                class271.field4010.field6221 = 0;
                int var28 = class425.field6072;
                class395.field5743 = 0;
                class313.method1932(2, false);
                class558.method3266((byte) -123);
                class365.method2233(16, class271.field4010);
                class157.field2003 = -1;
                class201.method1301((byte) -97);
                if (class271.field4010.field6221 != var28) {
                    throw new RuntimeException("lswp pos:" + class271.field4010.field6221 + " psize:" + var28);
                }
                class260.field3820 = null;
                return;
            }
            if (class395.field5743 == 15) {
                if (class425.field6072 == -2) {
                    if (!class513.field7606.method1246(2, -25354)) {
                        return;
                    }
                    class513.field7606.method1248(0, class271.field4010.field6162, 69, 2);
                    class271.field4010.field6221 = 0;
                    class425.field6072 = class271.field4010.method2620(22);
                }
                if (!class513.field7606.method1246(class425.field6072, -25354)) {
                    return;
                }
                class513.field7606.method1248(0, class271.field4010.field6162, 76, class425.field6072);
                class271.field4010.field6221 = 0;
                class395.field5743 = 0;
                int var29 = class425.field6072;
                class313.method1932(15, false);
                class574.method3365(-110);
                class365.method2233(16, class271.field4010);
                if (class271.field4010.field6221 != var29) {
                    throw new RuntimeException("lswpr pos:" + class271.field4010.field6221 + " psize:" + var29);
                }
                class260.field3820 = null;
                return;
            }
        } catch (IOException var38) {
            if (class513.field7606 != null) {
                class513.field7606.method1247((byte) 116);
                class513.field7606 = null;
            }
            if (class616.field9020 >= 1) {
                class395.field5743 = 0;
                class313.method1932(-4, false);
                class34.method156((byte) -46);
            } else {
                if (class322.field4782 == 2 || class322.field4782 == 3) {
                    class536.field7933.field6634 = !class536.field7933.field6634;
                } else {
                    class277.field4060.field6634 = !class277.field4060.field6634;
                }
                class616.field9020++;
                class142.field1852 = 0;
                class395.field5743 = 1;
            }
        }
        int var30 = -92 % ((-arg0 - 1) / 40);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILk;I)V", line = 737)
    public final void method1874(int arg0, int arg1, class88 arg2, int arg3) {
        field4434++;
        class249 var5 = (class249) arg2;
        int var6 = var5.field3634 + arg0 + 1;
        int var7 = var5.field3637 + arg3 + 1;
        int var8 = this.field4444 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3642;
        int var11 = var5.field3631;
        int var12 = this.field4444 - var11;
        if (arg1 != 128) {
            field4433 = -69;
        }
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var9 += var11 * var14;
            var10 -= var14;
            var8 += this.field4444 * var14;
        }
        if ((var6 + var10) >= this.field4431) {
            int var15 = var6 + var10 + 1 - this.field4431;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var7 = 1;
            var9 += var16;
            var13 += var16;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
        }
        if (var7 + var11 >= this.field4444) {
            int var17 = var7 + var11 - (this.field4444 - 1);
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class280.method1760(var9, (byte) -32, var8, var12, var11, this.field4432, var13, var5.field3641, var10);
            this.method1871(var6, (byte) -15, var11, var10, var7);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)Z", line = 809)
    public static final boolean method1875(int arg0, int arg1, int arg2) {
        field4449++;
        if (arg1 <= 116) {
            return true;
        } else {
            return class542.method3185(arg0, -18225, arg2) || class82.method474(arg2, arg0, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBILk;)Z", line = 821)
    public final boolean method1876(int arg0, byte arg1, int arg2, class88 arg3) {
        field4446++;
        class249 var5 = (class249) arg3;
        int var6 = var5.field3634 + arg2 + 1;
        if (arg1 >= -82) {
            return false;
        }
        int var7 = var5.field3637 + arg0 + 1;
        int var8 = this.field4444 * var6 + var7;
        int var9 = var5.field3642;
        int var10 = var5.field3631;
        int var11 = this.field4444 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var6 = 1;
            var8 += this.field4444 * var12;
            var9 -= var12;
        }
        if (this.field4431 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field4431;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var11 += var14;
            var8 += var14;
            var10 -= var14;
        }
        if (this.field4444 <= (var7 + var10)) {
            int var15 = var10 + var7 + 1 - this.field4444;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4444 + var11;
            return class135.method833(var9, (byte) -64, this.field4432, var8, var17, var10, var16);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI[[ZIII)V", line = 895)
    public final void method1877(boolean arg0, int arg1, boolean[][] arg2, int arg3, int arg4, int arg5) {
        field4430++;
        this.field4435.method1124(false, (byte) 109);
        this.field4435.method1146((byte) -87, false);
        this.field4435.method1098(1, false);
        this.field4435.method1142(192, 1);
        this.field4435.method1171(false, arg5 + arg5, -2, false);
        float var7 = 1.0F / (float) (this.field4435.field2633 * 128);
        if (arg0) {
            for (int var26 = 0; var26 < this.field4437; var26++) {
                int var27 = var26 << this.field4447;
                int var28 = var26 + 1 << this.field4447;
                label91: for (int var29 = 0; var29 < this.field4439; var29++) {
                    if (this.field4442[var29][var26] != null) {
                        int var30 = var29 << this.field4447;
                        int var31 = var29 + 1 << this.field4447;
                        for (int var32 = var30; var32 < var31; var32++) {
                            if ((var32 - arg1) >= (-arg4) && (var32 - arg1) <= arg4) {
                                for (int var33 = var27; var33 < var28; var33++) {
                                    if ((var33 - arg3) >= (-arg4) && (var33 - arg3) <= arg4 && arg2[arg4 + var32 - arg1][var33 + arg4 - arg3]) {
                                        class124 var34 = this.field4435.method1122((byte) 65);
                                        var34.method758((byte) 100, var7, 1.0F, var7);
                                        var34.method619(-var29, -var26, 0);
                                        this.field4435.method1100(class235.field3452, ~arg5);
                                        this.field4442[var29][var26].method3115((byte) -118);
                                        continue label91;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4437; var8++) {
                int var9 = var8 << this.field4447;
                int var10 = var8 + 1 << this.field4447;
                for (int var11 = 0; var11 < this.field4439; var11++) {
                    class527 var12 = this.field4442[var11][var8];
                    if (var12 != null) {
                        class512 var13 = this.field4435.method1120(var12.field7819 * 3, 27);
                        Buffer var14 = var13.method410(true, (byte) -56);
                        if (var14 != null) {
                            Stream var15 = this.field4435.method1163(var14, -4455);
                            int var16 = 0;
                            int var17 = var11 << this.field4447;
                            int var18 = var11 + 1 << this.field4447;
                            for (int var19 = var9; var19 < var10; var19++) {
                                if (var19 - arg3 >= -arg4 && var19 - arg3 <= arg4) {
                                    int var21 = this.field4443.field8121 * var19 + var17;
                                    for (int var22 = var17; var22 < var18; var22++) {
                                        if ((var22 - arg1) >= (-arg4) && var22 - arg1 <= arg4 && arg2[arg4 + var22 - arg1][var19 + arg4 - arg3]) {
                                            short[] var23 = this.field4443.field7655[var21];
                                            if (var23 != null) {
                                                if (Stream.method3328()) {
                                                    for (int var24 = 0; var24 < var23.length; var24++) {
                                                        var16++;
                                                        var15.method3337(var23[var24] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var23.length; var25++) {
                                                        var15.method3336(var23[var25] & 0xFFFF);
                                                        var16++;
                                                    }
                                                }
                                            }
                                        }
                                        var21++;
                                    }
                                }
                            }
                            var15.method3332();
                            if (var13.method411(-82) && var16 > 0) {
                                class124 var20 = this.field4435.method1122((byte) 65);
                                var20.method758((byte) 100, var7, 1.0F, var7);
                                var20.method619(-var11, -var8, 0);
                                this.field4435.method1100(class235.field3452, -1);
                                var12.method3117(arg5 ^ 0xFFFFFFAB, var16 / 3, var13);
                            }
                        }
                    }
                }
            }
        }
        this.field4435.method1109(5);
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(IILk;I)V", line = 1104)
    public final void method1878(int arg0, int arg1, class88 arg2, int arg3) {
        field4445++;
        class249 var5 = (class249) arg2;
        int var6 = var5.field3637 + arg1 + 1;
        int var7 = var5.field3634 + arg0 + 1;
        int var8 = this.field4444 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field3642;
        int var11 = var5.field3631;
        int var12 = this.field4444 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var8 += this.field4444 * var14;
            var10 -= var14;
            var7 = 1;
        }
        if (this.field4431 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field4431;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var11 -= var16;
            var6 = 1;
            var9 += var16;
            var13 += var16;
            var8 += var16;
        }
        if (this.field4444 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field4444;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > arg3 && var10 > 0) {
            class393.method2369(this.field4432, arg3 - 34, var8, var5.field3641, var10, var11, var13, var12, var9);
            this.method1871(var7, (byte) -50, var11, var10, var6);
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V", line = 1172)
    public static final void method1879(int arg0) {
        field4441++;
        class207.field3082.method387((byte) 36);
        for (int var1 = 0; var1 < 32; var1++) {
            class530.field7867[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class433.field6337[var2] = 0L;
        }
        class613.field8994 = arg0;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lkw;Leo;)V", line = 1194)
    public class304(class174 arg0, class516 arg1) {
        this.field4443 = arg1;
        this.field4435 = arg0;
        this.field4444 = (this.field4443.field8121 * this.field4443.field8116 >> this.field4435.field2580) + 2;
        this.field4431 = (this.field4443.field8118 * this.field4443.field8116 >> this.field4435.field2580) + 2;
        this.field4432 = new byte[this.field4444 * this.field4431];
        this.field4447 = this.field4435.field2580 + 7 - this.field4443.field8119;
        this.field4439 = this.field4443.field8121 >> this.field4447;
        this.field4437 = this.field4443.field8118 >> this.field4447;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V", line = 1209)
    public final void method1880(byte arg0) {
        field4440++;
        this.field4442 = new class527[this.field4439][this.field4437];
        int var2 = 0;
        if (arg0 < 47) {
            method1875(-33, 44, -10);
        }
        while (this.field4437 > var2) {
            for (int var3 = 0; var3 < this.field4439; var3++) {
                this.field4442[var3][var2] = new class527(this.field4435, this, this.field4443, var3, var2, this.field4447, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field4442[var3][var2].field7819 == 0) {
                    this.field4442[var3][var2] = null;
                }
            }
            var2++;
        }
    }
}
