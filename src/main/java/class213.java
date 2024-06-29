import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class213 extends class466 {

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    private int field3001 = 81;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "I")
    private int field3003 = 1024;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    private int field3011 = 4;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    private int field3008 = 1024;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    private int field3013 = 0;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    private int field3016 = 8;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    private int field3009 = 409;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    private int field3007 = 204;

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "Lh;")
    public static class571 field3020;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "B")
    public static byte field3023;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    private int field3014;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    private int field3019;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ok", name = "db", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "[I")
    private int[] field3004;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "[[I")
    private int[][] field3002;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "[[I")
    private int[][] field3010;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 == -5062) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (arg2 != 4) {
                                if (arg2 != 5) {
                                    if (~arg2 != -7) {
                                        if (arg2 == 7) {
                                            this.field3008 = arg0.method93((byte) 115);
                                        }
                                    } else {
                                        this.field3001 = arg0.method93((byte) 76);
                                    }
                                } else {
                                    this.field3013 = arg0.method93((byte) 91);
                                }
                            } else {
                                this.field3003 = arg0.method93((byte) 72);
                            }
                        } else {
                            this.field3007 = arg0.method93((byte) 96);
                        }
                    } else {
                        this.field3009 = arg0.method93((byte) 89);
                    }
                } else {
                    this.field3016 = arg0.method110((byte) 81);
                }
            } else {
                this.field3011 = arg0.method110((byte) 33);
            }
            ++field3018;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)Z")
    public static final boolean method1390(int arg0, int arg1) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field3015;
            return arg1 == 2 || arg1 == 4 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static void method1391(byte arg0) {
        field3020 = null;
        int var1 = -116 / ((arg0 - -87) / 36);
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 != -806066388) {
            this.field3011 = -84;
        }
        this.method1392(false);
        ++field3021;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Z)V")
    private final void method1392(boolean arg0) {
        ++field3000;
        Random var2 = new Random((long) this.field3016);
        this.field3019 = this.field3001 / 2;
        this.field3014 = 4096 / this.field3016;
        this.field3012 = 4096 / this.field3011;
        int var3 = this.field3012 / 2;
        if (arg0) {
            this.field3009 = -19;
        }
        int var4 = this.field3014 / 2;
        this.field3004 = new int[this.field3016 + 1];
        this.field3002 = new int[this.field3016][this.field3011];
        this.field3010 = new int[this.field3016][this.field3011 - -1];
        this.field3004[0] = 0;
        for (int var5 = 0; this.field3016 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field3014;
                int var7 = (-2048 + class303.method1924((byte) -106, var2, 4096)) * this.field3007 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3004[var5] = this.field3004[var5 + -1] + var8;
            }
            this.field3010[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3011; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field3012;
                    int var11 = (class303.method1924((byte) -111, var2, 4096) + -2048) * this.field3009 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3010[var5][var9] = this.field3010[var5][var9 + -1] + var12;
                }
                this.field3002[var5][var9] = ~this.field3008 >= -1 ? 4096 : -class303.method1924((byte) -79, var2, this.field3008) + 4096;
            }
            this.field3010[var5][this.field3011] = 4096;
        }
        this.field3004[this.field3016] = 4096;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
    public class213() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[Ljava/lang/String;[S)V")
    public static final void method1393(int arg0, int arg1, int arg2, String[] arg3, short[] arg4) {
        if (~arg0 > ~arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg0; ~var9 > ~arg2; ++var9) {
                if (var7 == null || arg3[var9] != null && ~arg3[var9].compareTo(var7) > ~(var9 & 1)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method1393(arg0, 10588, var6 + -1, arg3, arg4);
            method1393(var6 + 1, arg1, arg2, arg3, arg4);
        }
        if (arg1 == 10588) {
            ++field3006;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)V")
    public static final void method1394(int arg0, int arg1) {
        class622 var2 = class356.field4807[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class622 var4 = class356.field4807[var3][arg0][arg1] = class356.field4807[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field8969;
                for (class559 var5 = var4.field8973; var5 != null; var5 = var5.field7736) {
                    class425 var6 = var5.field7742;
                    if (var6.field6036 == arg0 && var6.field6028 == arg1) {
                        --var6.field6035;
                    }
                }
            }
        }
        if (class356.field4807[0][arg0][arg1] == null) {
            class356.field4807[0][arg0][arg1] = new class622(0, arg0, arg1);
            class356.field4807[0][arg0][arg1].field8970 = 1;
        }
        class356.field4807[0][arg0][arg1].field8967 = var2;
        class356.field4807[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
    public static final void method1395(int arg0) {
        ++field3017;
        if (~class348.field4669 != -1 && ~class348.field4669 != -7) {
            try {
                if (~(++class369.field5012) < -2001) {
                    if (class143.field2203 != null) {
                        class143.field2203.method1004(34065);
                        class143.field2203 = null;
                    }
                    if (~class385.field5163 <= -2) {
                        class348.field4669 = 0;
                        class464.method2712(-5, (byte) -66);
                        return;
                    }
                    class369.field5012 = 0;
                    if (class40.field797 != 2 && ~class40.field797 != -4) {
                        class332.field4446.field2678 = !class332.field4446.field2678;
                    } else {
                        class336.field4477.field2678 = !class336.field4477.field2678;
                    }
                    ++class385.field5163;
                    class348.field4669 = 1;
                }
                if (class348.field4669 == 1) {
                    if (class40.field797 != 2 && ~class40.field797 != -4) {
                        class28.field471 = class500.field6968.method1851(class332.field4446.method1178(12623), class332.field4446.field2686, 3298);
                    } else {
                        class28.field471 = class500.field6968.method1851(class336.field4477.method1178(12623), class336.field4477.field2686, 3298);
                    }
                    class348.field4669 = 2;
                }
                if (~class348.field4669 == -3) {
                    if (~class28.field471.field5134 == -3) {
                        throw new IOException();
                    }
                    if (class28.field471.field5134 != 1) {
                        return;
                    }
                    class143.field2203 = class11.method114((Socket) class28.field471.field5132, 5000, Integer.MAX_VALUE);
                    class28.field471 = null;
                    long var1 = class163.field2365 = class639.method3697((byte) 80, class146.field2257);
                    int var3 = (int) (var1 >> 16 & 31L);
                    class479.field6754.field165 = 0;
                    class479.field6754.method108((byte) -128, class21.field268.field6351);
                    class479.field6754.method108((byte) -128, var3);
                    class143.field2203.method998(34066, class479.field6754.field138, 0, 2);
                    class348.field4669 = 3;
                }
                if (~class348.field4669 == -4) {
                    if (!class143.field2203.method1000((byte) -43, 1)) {
                        return;
                    }
                    class143.field2203.method1002(class343.field4627.field138, -26195, 1, 0);
                    int var4 = 255 & class343.field4627.field138[0];
                    if (var4 != 0) {
                        class348.field4669 = 0;
                        class464.method2712(var4, (byte) -66);
                        class143.field2203.method1004(34065);
                        class143.field2203 = null;
                        class223.method1436(true);
                        return;
                    }
                    class348.field4669 = 4;
                }
                if (class348.field4669 == 4) {
                    if (!class143.field2203.method1000((byte) 118, 8)) {
                        return;
                    }
                    class143.field2203.method1002(class343.field4627.field138, -26195, 8, 0);
                    class343.field4627.field165 = 0;
                    class571.field7873 = class343.field4627.method85(-104);
                    class11 var5 = new class11(518);
                    int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (9.9999999E7D * Math.random()), (int) (class571.field7873 >> 32), (int) class571.field7873 };
                    var5.method108((byte) -128, 10);
                    var5.method117(-54, var6[0]);
                    var5.method117(-57, var6[1]);
                    var5.method117(127, var6[2]);
                    var5.method117(-37, var6[3]);
                    var5.method102(class639.method3697((byte) 80, class146.field2257), false);
                    var5.method74(class636.field9276, 0);
                    var5.method102(class103.field1569, false);
                    var5.method102(class555.field7645, false);
                    var5.method64(class94.field1451, class615.field8835, 0);
                    class204 var7 = class479.field6754;
                    var7.field165 = 0;
                    if (~class40.field797 != -3 && class40.field797 != 3) {
                        var7.method108((byte) -128, class21.field305.field6351);
                        var7.method84(0, (byte) -102);
                        int var8 = var7.field165;
                        var7.method117(127, 606);
                        var7.method108((byte) -128, class163.field2363.field1720);
                        var7.method108((byte) -128, class173.field2491);
                        class592.method3497((byte) 59, var7);
                        var7.method74(class310.field4180, 0);
                        var7.method117(-111, class517.field7259);
                        class174.method1103(true);
                        var7.method87(var5.field138, 0, var5.field165, 18278);
                        var7.method90(-124, var7.field165 - var8);
                    } else {
                        if (class440.field6254 != 12) {
                            var7.method108((byte) -128, class21.field302.field6351);
                        } else {
                            var7.method108((byte) -128, class21.field304.field6351);
                        }
                        var7.method84(0, (byte) -114);
                        int var9 = var7.field165;
                        var7.method117(-54, 606);
                        var7.method108((byte) -128, class320.field4337);
                        var7.method108((byte) -128, class486.method2827(117));
                        var7.method84(class387.field5196, (byte) -123);
                        var7.method84(class134.field2128, (byte) -100);
                        var7.method108((byte) -128, class491.field6875.field3360);
                        class592.method3497((byte) 87, var7);
                        var7.method74(class310.field4180, 0);
                        var7.method117(75, class517.field7259);
                        class11 var10 = new class11(class43.method418(-117));
                        class491.field6875.method1503(true, var10);
                        var7.method108((byte) -128, var10.field165);
                        var7.method87(var10.field138, 0, var10.field165, 18278);
                        class293.field4032 = true;
                        class11 var11 = new class11(class297.method1893(-91));
                        (new class643(true, class500.field6968)).method3709(var11, -72);
                        var7.method87(var11.field138, 0, var11.field138.length, 18278);
                        var7.method84(class467.field6578, (byte) -120);
                        class174.method1103(true);
                        var7.method87(var5.field138, 0, var5.field165, 18278);
                        var7.method90(99, var7.field165 - var9);
                    }
                    class143.field2203.method998(34066, var7.field138, 0, var7.field165);
                    var7.method1233(var6, 7686);
                    for (int var12 = 0; var12 < 4; ++var12) {
                        var6[var12] += 50;
                    }
                    class343.field4627.method1233(var6, 7686);
                    class348.field4669 = 5;
                }
                if (class348.field4669 == 5) {
                    if (!class143.field2203.method1000((byte) -110, 1)) {
                        return;
                    }
                    class143.field2203.method1002(class343.field4627.field138, -26195, 1, 0);
                    int var13 = 255 & class343.field4627.field138[0];
                    if (~var13 != -22) {
                        if (~var13 == -30) {
                            class348.field4669 = 14;
                        } else {
                            if (var13 == 1) {
                                class348.field4669 = 6;
                                class464.method2712(var13, (byte) -66);
                                return;
                            }
                            if (~var13 != -3) {
                                if (~var13 != -16) {
                                    if (var13 == 23 && class385.field5163 < 1) {
                                        ++class385.field5163;
                                        class348.field4669 = 1;
                                        class369.field5012 = 0;
                                        class143.field2203.method1004(34065);
                                        class143.field2203 = null;
                                        return;
                                    }
                                    class348.field4669 = 0;
                                    class464.method2712(var13, (byte) -66);
                                    class143.field2203.method1004(34065);
                                    class143.field2203 = null;
                                    class223.method1436(true);
                                    return;
                                }
                                class348.field4669 = 15;
                                class403.field5730 = -2;
                            } else {
                                class348.field4669 = 9;
                            }
                        }
                    } else {
                        class348.field4669 = 8;
                    }
                }
                if (~class348.field4669 == -8) {
                    class479.field6754.field165 = 0;
                    class479.field6754.method1236(true, class21.field312.field6351);
                    class143.field2203.method998(34066, class479.field6754.field138, 0, class479.field6754.field165);
                    class348.field4669 = 5;
                } else if (class348.field4669 == 8) {
                    if (class143.field2203.method1000((byte) 97, 1)) {
                        class143.field2203.method1002(class343.field4627.field138, -26195, 1, 0);
                        int var14 = class343.field4627.field138[0] & 255;
                        class304.field4150 = (var14 + 3) * 60;
                        class348.field4669 = 0;
                        class464.method2712(21, (byte) -66);
                        class143.field2203.method1004(34065);
                        class143.field2203 = null;
                        class223.method1436(true);
                    }
                } else if (~class348.field4669 == -15) {
                    if (class143.field2203.method1000((byte) 104, 1)) {
                        class143.field2203.method1002(class343.field4627.field138, -26195, 1, 0);
                        class348.field4669 = 0;
                        class228.field3260 = 255 & class343.field4627.field138[0];
                        class464.method2712(29, (byte) -66);
                        class143.field2203.method1004(34065);
                        class143.field2203 = null;
                        class223.method1436(true);
                    }
                } else if (class348.field4669 == 9) {
                    if (class143.field2203.method1000((byte) 127, 1)) {
                        class143.field2203.method1002(class343.field4627.field138, -26195, 1, 0);
                        class20.field248 = class343.field4627.field138[0] & 255;
                        class348.field4669 = 10;
                    }
                } else {
                    if (~class348.field4669 == -11) {
                        if (class40.field797 != 3) {
                            class626.field9134 = false;
                        } else {
                            class626.field9134 = true;
                        }
                        class204 var15 = class343.field4627;
                        if (class40.field797 != 2 && class40.field797 != 3) {
                            if (!class143.field2203.method1000((byte) 101, class20.field248)) {
                                return;
                            }
                            class143.field2203.method1002(var15.field138, -26195, class20.field248, 0);
                            var15.field165 = 0;
                            class258.field3599 = var15.method110((byte) 84);
                            class628.field9189 = var15.method110((byte) 120);
                            class480.field6767 = var15.method110((byte) 66) == 1;
                            class600.field8654 = var15.method110((byte) 53) == 1;
                            class332.field4432 = ~var15.method110((byte) 86) == -2;
                            class148.field2277 = var15.method93((byte) 105);
                            class310.field4179 = class148.field2277 > 0;
                            class375.field5051 = var15.method93((byte) 127);
                            class257.field3557 = var15.method93((byte) 99);
                            class363.field4870 = var15.method93((byte) 122);
                            class397.field5669 = var15.method119(-112);
                            class366.field4988 = class500.field6968.method1849(class397.field5669, false);
                            class21.field315 = var15.method110((byte) 123);
                            class397.field5665 = var15.method93((byte) 73);
                            class261.field3630 = var15.method93((byte) 116);
                            class418.field5881 = ~var15.method110((byte) 62) == -2;
                            class645.field9372.field2630 = class645.field9372.field2674 = var15.method63(true);
                            class637.field9283 = new class189();
                            class637.field9283.field2680 = var15.method93((byte) 110);
                            if (~class637.field9283.field2680 == -65536) {
                                class637.field9283.field2680 = -1;
                            }
                            class637.field9283.field2686 = var15.method63(true);
                            if (class71.field1181 != class53.field988) {
                                class637.field9283.field2685 = class637.field9283.field2680 + 50000;
                                class637.field9283.field2682 = class637.field9283.field2680 + 40000;
                            }
                            if (class53.field988 != class270.field3766 && (class336.field4477.method1181(class504.field7014, (byte) 84) || class336.field4477.method1181(class31.field506, (byte) 114))) {
                                class629.method3661(0);
                            }
                        } else {
                            if (!class143.field2203.method1000((byte) 103, class20.field248)) {
                                return;
                            }
                            class143.field2203.method1002(var15.field138, -26195, class20.field248, 0);
                            var15.field165 = 0;
                            class258.field3599 = var15.method110((byte) 33);
                            class628.field9189 = var15.method110((byte) 122);
                            class480.field6767 = ~var15.method110((byte) 82) == -2;
                            class600.field8654 = ~var15.method110((byte) 67) == -2;
                            class332.field4432 = var15.method110((byte) 93) == 1;
                            class154.field2314 = var15.method110((byte) 72) == 1;
                            class97.field1472 = var15.method93((byte) 95);
                            class310.field4179 = ~var15.method110((byte) 64) == -2;
                            class580.field7981 = var15.method60(-2097152);
                            class467.field6579 = ~var15.method110((byte) 111) == -2;
                            if (class40.field797 == 3) {
                                boolean var16 = ~var15.method110((byte) 54) == -2;
                                if (var16) {
                                    long var17 = var15.method85(-122);
                                    String var19 = class612.method3585(37, var17);
                                    int var20 = var15.method110((byte) 92);
                                    byte[] var21 = new byte[var20];
                                    var15.method1238(var21, 0, var20, 25768);
                                    String var22 = class583.method3339(var21, true);
                                    class116 var23 = null;
                                    try {
                                        class382 var24 = class500.field6968.method1840("3", false, (byte) 102);
                                        while (~var24.field5134 == -1) {
                                            class21.method220(0, 1L);
                                        }
                                        if (~var24.field5134 == -2) {
                                            var23 = (class116) var24.field5132;
                                            int var25 = 4 + (3 - -var19.length()) + 2 - (-var22.length() + -2);
                                            if (~var25 < -51) {
                                                throw new RuntimeException(">50");
                                            }
                                            class11 var26 = new class11(1 - -var25);
                                            var26.method108((byte) -128, var25);
                                            var26.method108((byte) -128, 1);
                                            var26.method65((byte) 107, var19);
                                            var26.method65((byte) 93, var22);
                                            var26.method84(class517.field7259, (byte) -97);
                                            var26.method94(255);
                                            var23.method818(var26.field165, (byte) -122, var26.field138, 0);
                                        }
                                    } catch (Exception var36) {
                                    }
                                    try {
                                        if (var23 != null) {
                                            var23.method821(17981);
                                        }
                                    } catch (Exception var34) {
                                    }
                                    try {
                                        class54.method508((byte) 56, class500.field6968.field3975, "demoaccountcreated");
                                    } catch (Throwable var33) {
                                    }
                                }
                            }
                            class18.field227.method1209(class467.field6579, -12773);
                            class181.field2574.method863(class467.field6579, -1);
                            class516.field7253.method3264(class467.field6579, 87);
                        }
                        if ((!class480.field6767 || class332.field4432) && !class310.field4179) {
                            try {
                                class54.method508((byte) 56, class500.field6968.field3975, "unzap");
                            } catch (Throwable var32) {
                            }
                        } else {
                            try {
                                class54.method508((byte) 56, class500.field6968.field3975, "zap");
                            } catch (Throwable var35) {
                                if (class369.field5013) {
                                    try {
                                        class500.field6968.field3975.getAppletContext().showDocument(new URL(class500.field6968.field3975.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var31) {
                                    }
                                }
                            }
                        }
                        if (class71.field1181 == class53.field988) {
                            try {
                                class54.method508((byte) 56, class500.field6968.field3975, "loggedin");
                            } catch (Throwable var30) {
                            }
                        }
                        if (class40.field797 != 2 && ~class40.field797 != -4) {
                            class348.field4669 = 0;
                            class464.method2712(2, (byte) -66);
                            class49.method475(0);
                            class45.method440(6, 65);
                            class368.field5005 = null;
                            return;
                        }
                        class348.field4669 = 12;
                    }
                    if (arg0 <= 1) {
                        field3022 = 115;
                    }
                    if (class348.field4669 == 12) {
                        if (!class143.field2203.method1000((byte) -119, 3)) {
                            return;
                        }
                        class143.field2203.method1002(class343.field4627.field138, -26195, 3, 0);
                        class348.field4669 = 13;
                    }
                    if (~class348.field4669 == -14) {
                        class204 var27 = class343.field4627;
                        var27.field165 = 0;
                        if (var27.method1234(-110)) {
                            if (!class143.field2203.method1000((byte) 127, 1)) {
                                return;
                            }
                            class143.field2203.method1002(var27.field138, -26195, 1, 3);
                        }
                        class368.field5005 = class15.method177(127)[var27.method1232((byte) 46)];
                        class403.field5730 = var27.method93((byte) 87);
                        class348.field4669 = 11;
                    }
                    if (class348.field4669 == 11) {
                        if (class143.field2203.method1000((byte) -103, class403.field5730)) {
                            class143.field2203.method1002(class343.field4627.field138, -26195, class403.field5730, 0);
                            class343.field4627.field165 = 0;
                            int var28 = class403.field5730;
                            class348.field4669 = 0;
                            class464.method2712(2, (byte) -66);
                            class207.method1259(0);
                            class360.method2162(false, class343.field4627);
                            class88.field1390 = -1;
                            class507.method2935(-419201343);
                            if (~class343.field4627.field165 != ~var28) {
                                throw new RuntimeException("lswp pos:" + class343.field4627.field165 + " psize:" + var28);
                            } else {
                                class368.field5005 = null;
                            }
                        }
                    } else if (~class348.field4669 == -16) {
                        if (~class403.field5730 == 1) {
                            if (!class143.field2203.method1000((byte) 96, 2)) {
                                return;
                            }
                            class143.field2203.method1002(class343.field4627.field138, -26195, 2, 0);
                            class343.field4627.field165 = 0;
                            class403.field5730 = class343.field4627.method93((byte) 106);
                        }
                        if (class143.field2203.method1000((byte) -109, class403.field5730)) {
                            class143.field2203.method1002(class343.field4627.field138, -26195, class403.field5730, 0);
                            class343.field4627.field165 = 0;
                            class348.field4669 = 0;
                            int var29 = class403.field5730;
                            class464.method2712(15, (byte) -66);
                            class592.method3496(true);
                            class360.method2162(false, class343.field4627);
                            if (~class343.field4627.field165 != ~var29) {
                                throw new RuntimeException("lswpr pos:" + class343.field4627.field165 + " psize:" + var29);
                            } else {
                                class368.field5005 = null;
                            }
                        }
                    }
                }
            } catch (IOException var37) {
                if (class143.field2203 != null) {
                    class143.field2203.method1004(34065);
                    class143.field2203 = null;
                }
                if (class385.field5163 >= 1) {
                    class348.field4669 = 0;
                    class464.method2712(-4, (byte) -66);
                    class223.method1436(true);
                } else {
                    class348.field4669 = 1;
                    if (class40.field797 != 2 && class40.field797 != 3) {
                        class332.field4446.field2678 = !class332.field4446.field2678;
                    } else {
                        class336.field4477.field2678 = !class336.field4477.field2678;
                    }
                    class369.field5012 = 0;
                    ++class385.field5163;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field3005;
        int[] var3 = super.field6557.method565(arg0, arg1 + -24728);
        if (arg1 != 0) {
            return null;
        } else {
            if (super.field6557.field1163) {
                int var4 = 0;
                int var5;
                for (var5 = class63.field1085[arg0] - -this.field3013; var5 < 0; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (this.field3016 > var4 && ~this.field3004[var4] >= ~var5) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = (var4 & 1) == 0;
                int var8 = this.field3004[var4];
                int var9 = this.field3004[var4 + -1];
                if (this.field3019 + var9 < var5 && var5 < -this.field3019 + var8) {
                    for (int var10 = 0; ~class312.field4207 < ~var10; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field3003 : this.field3003;
                        int var13;
                        for (var13 = class431.field6129[var10] - -(this.field3012 * var12 >> 12); var13 < 0; var13 += 4096) {
                        }
                        while (~var13 < -4097) {
                            var13 -= 4096;
                        }
                        while (~var11 > ~this.field3011 && ~var13 <= ~this.field3010[var6][var11]) {
                            ++var11;
                        }
                        int var14 = var11 - 1;
                        int var15 = this.field3010[var6][var14];
                        int var16 = this.field3010[var6][var11];
                        if (var13 > var15 - -this.field3019 && -this.field3019 + var16 > var13) {
                            var3[var10] = this.field3002[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class416.method2495(var3, 0, class312.field4207, 0);
                }
            }
            return var3;
        }
    }

    static {
        new class104("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
        field3022 = -1;
        field3020 = new class571(8);
    }
}
