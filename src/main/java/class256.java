import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class256 extends class115 {

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    private int field3886 = 0;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "[S")
    private short[] field3892 = new short[257];

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "[Lee;")
    public static class246[] field3881 = new class246[14];

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field3887 = 0;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "Ljava/lang/String;")
    public static String field3889 = "green:";

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "[I")
    private int[] field3879;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "[I")
    private int[] field3893;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "[[I")
    private int[][] field3880;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class256() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    private final void method1714(int arg0) {
        ++field3878;
        int[] var2 = this.field3880[0];
        int[] var3 = this.field3880[this.field3880.length + -2];
        int[] var4 = this.field3880[1];
        int[] var5 = this.field3880[this.field3880.length + -1];
        this.field3893 = new int[] { var2[0] - (var4[0] - var2[0]), var2[1] - var4[1] + var2[1] };
        if (arg0 != 128) {
            this.method116(65, 50);
        }
        this.field3879 = new int[] { var3[0] + -var5[0] + var3[0], var3[1] - var5[1] + var3[1] };
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[Lqb;IIZI[BI)V")
    public static final void method1715(int arg0, class86[] arg1, int arg2, int arg3, boolean arg4, int arg5, byte[] arg6, int arg7) {
        ++field3876;
        byte var8;
        if (!arg4) {
            var8 = 4;
        } else {
            var8 = 1;
        }
        if (!arg4) {
            for (int var9 = 0; ~var9 > -5; ++var9) {
                for (int var10 = 0; ~var10 > -65; ++var10) {
                    for (int var11 = 0; var11 < 64; ++var11) {
                        if (arg7 - -var10 > 0 && ~(arg7 - -var10) > -104 && ~(arg2 + var11) < -1 && ~(arg2 + var11) > -104) {
                            arg1[var9].field1319[arg7 + var10][arg2 + var11] = class184.method1188(arg1[var9].field1319[arg7 + var10][arg2 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class114 var12 = new class114(arg6);
        for (int var13 = arg0; ~var13 > ~var8; ++var13) {
            for (int var36 = 0; ~var36 > -65; ++var36) {
                for (int var37 = 0; var37 < 64; ++var37) {
                    class142.method945(var12, var37 - -arg2, arg4, arg5, arg7 + var36, var13, 0, true, arg3);
                }
            }
        }
        boolean var14 = false;
        while (var12.field1629.length > var12.field1673) {
            int var15 = var12.method760(false);
            if (var15 != 129) {
                --var12.field1673;
                break;
            }
            for (int var21 = 0; ~var21 > -5; ++var21) {
                byte var22 = var12.method741(3083);
                if (~var22 == -1) {
                    int var23 = arg7;
                    if (~arg7 <= -1) {
                        if (~arg7 <= -105) {
                            var23 = 104;
                        }
                    } else {
                        var23 = 0;
                    }
                    int var24 = arg7 - -64;
                    if (~var24 > -1) {
                        var24 = 0;
                    } else if (~var24 <= -105) {
                        var24 = 104;
                    }
                    int var25 = arg2;
                    int var26 = arg2 + 64;
                    if (~arg2 <= -1) {
                        if (arg2 >= 104) {
                            var25 = 104;
                        }
                    } else {
                        var25 = 0;
                    }
                    if (~var26 <= -1) {
                        if (var26 >= 104) {
                            var26 = 104;
                        }
                    } else {
                        var26 = 0;
                    }
                    while (~var24 < ~var23) {
                        while (~var25 > ~var26) {
                            class111.field1600[var21][var23][var25] = 0;
                            ++var25;
                        }
                        ++var23;
                    }
                } else if (~var22 == -2) {
                    for (int var27 = 0; ~var27 > -65; var27 += 4) {
                        for (int var28 = 0; var28 < 64; var28 += 4) {
                            byte var29 = var12.method741(arg0 ^ 3083);
                            for (int var30 = arg7 + var27; ~var30 > ~(var27 - (-arg7 - 4)); ++var30) {
                                for (int var31 = arg2 + var28; var31 < arg2 + var28 - -4; ++var31) {
                                    if (~var30 <= -1 && ~var30 > -105 && var31 >= 0 && var31 < 104) {
                                        class111.field1600[var21][var30][var31] = var29;
                                    }
                                }
                            }
                        }
                    }
                } else if (~var22 == -3 && ~var21 < -1) {
                    int var32 = arg7;
                    if (arg7 >= 0) {
                        if (arg7 >= 104) {
                            var32 = 104;
                        }
                    } else {
                        var32 = 0;
                    }
                    int var33 = arg7 + 64;
                    int var34 = arg2 - -64;
                    if (~var33 > -1) {
                        var33 = 0;
                    } else if (var33 >= 104) {
                        var33 = 104;
                    }
                    if (~var34 > -1) {
                        var34 = 0;
                    } else if (~var34 <= -105) {
                        var34 = 104;
                    }
                    int var35 = arg2;
                    if (arg2 >= 0) {
                        if (arg2 >= 104) {
                            var35 = 104;
                        }
                    } else {
                        var35 = 0;
                    }
                    while (var32 < var33) {
                        while (~var35 > ~var34) {
                            class111.field1600[var21][var32][var35] = class111.field1600[var21 + -1][var32][var35];
                            ++var35;
                        }
                        ++var32;
                    }
                }
            }
            var14 = true;
        }
        if (!var14) {
            for (int var16 = 0; var16 < 4; ++var16) {
                for (int var17 = 0; var17 < 16; ++var17) {
                    for (int var18 = 0; var18 < 16; ++var18) {
                        int var19 = (arg2 >> 2) - -var18;
                        int var20 = (arg7 >> 2) + var17;
                        if (~var20 <= -1 && var20 < 26 && ~var19 <= -1 && ~var19 > -27) {
                            class111.field1600[var16][var20][var19] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(II)V")
    public static final void method1716(int arg0, int arg1) {
        ++field3894;
        if (~arg1 <= -1) {
            int var2 = class195.field2798[arg1];
            int var3 = class212.field3048[arg1];
            int var4 = class280.field4475[arg1];
            if (~var4 <= -2001) {
                var4 -= 2000;
            }
            int var5 = (int) class180.field2574[arg1];
            long var6 = class180.field2574[arg1];
            if (~var4 == -35) {
                ++class54.field801;
                class95.field1451.method522(59, 28727);
                class95.field1451.method748(var2, 26277);
                class95.field1451.method794(var5, (byte) -36);
                class95.field1451.method761(-124, var3);
                class69.field1086 = 0;
                class114.field1694 = class282.method1897(var2, 59);
                class113.field1607 = var3;
            }
            if (var4 == 3) {
                class53 var8 = class194.field2777[var5];
                if (var8 != null) {
                    class193.method1241(class55.field847.field50[0], var8.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var8.field50[0], 0);
                    class270.field4236 = class279.field4465;
                    ++class175.field2494;
                    class107.field1550 = 0;
                    class65.field1021 = class42.field602;
                    class290.field4582 = 2;
                    class95.field1451.method522(83, 28727);
                    class95.field1451.method784(true, var5);
                }
            }
            if (~var4 == -20) {
                client.method1429(var2, var3, var6, true);
                ++class234.field3526;
                class95.field1451.method522(255, 28727);
                class95.field1451.method761(-126, class113.field1615 + var3);
                class95.field1451.method784(true, class95.field1445 + var2);
                class95.field1451.method784(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            }
            if (var4 == 1004) {
                class107.field1550 = 0;
                class290.field4582 = 2;
                class270.field4236 = class279.field4465;
                class65.field1021 = class42.field602;
                class72 var9 = class82.field1268[var5];
                if (var9 != null) {
                    class271 var10 = var9.field1119;
                    if (var10.field4291 != null) {
                        var10 = var10.method1812(0);
                    }
                    if (var10 != null) {
                        class95.field1451.method522(209, 28727);
                        ++class78.field1202;
                        class95.field1451.method784(true, var10.field4262);
                    }
                }
            }
            if (var4 == 41) {
                ++class32.field468;
                client.method1429(var2, var3, var6, true);
                class95.field1451.method522(139, 28727);
                class95.field1451.method738(class95.field1445 + var2, (byte) 85);
                class95.field1451.method794(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) -75);
                class95.field1451.method784(true, class113.field1615 + var3);
            }
            if (var4 == 20 && class101.field1508 == null) {
                class254.method1707(var2, var3, -60);
                class101.field1508 = class22.method165(var3, false, var2);
                class217.method1396(false, class101.field1508);
            }
            if (~var4 == -2 && client.method1429(var2, var3, var6, true)) {
                class95.field1451.method522(126, 28727);
                class95.field1451.method794((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) -102);
                class95.field1451.method773(class172.field2462, 0);
                ++class183.field2615;
                class95.field1451.method794(class102.field1511, (byte) -46);
                class95.field1451.method784(true, var2 - -class95.field1445);
                class95.field1451.method794(var3 - -class113.field1615, (byte) -32);
            }
            if (var4 == 57) {
                ++class88.field1350;
                class95.field1451.method522(43, 28727);
                class95.field1451.method748(var2, 26277);
                class95.field1451.method738(var5, (byte) 92);
                class95.field1451.method738(var3, (byte) 105);
                class69.field1086 = 0;
                class114.field1694 = class282.method1897(var2, 70);
                class113.field1607 = var3;
            }
            if (~var4 == -41) {
                ++class138.field2004;
                class95.field1451.method522(63, 28727);
                class95.field1451.method784(true, class102.field1511);
                class95.field1451.method748(class172.field2462, 26277);
                class95.field1451.method738(var3, (byte) 90);
                class95.field1451.method773(var2, 0);
            }
            if (var4 == 17) {
                if (~var5 != -1) {
                    if (var5 == 1) {
                        if (class270.field4228 > 0 && class19.field267[82] && class19.field267[81]) {
                            class281.method1896(class95.field1445 + var2, class163.field2364, class113.field1615 - -var3, 62);
                        } else if (class193.method1241(class55.field847.field50[0], var3, 0, 0, false, class55.field847.field119[0], true, 0, 1, 0, var2, 0)) {
                            class95.field1451.method775(class138.field2002, -120);
                            class95.field1451.method775(class21.field281, -114);
                            class95.field1451.method794(class245.field3667, (byte) -90);
                            class95.field1451.method775(57, -124);
                            class95.field1451.method775(class183.field2611, -112);
                            class95.field1451.method775(class282.field4495, -124);
                            class95.field1451.method775(89, -120);
                            class95.field1451.method794(class55.field847.field45, (byte) -96);
                            class95.field1451.method794(class55.field847.field94, (byte) -70);
                            class95.field1451.method775(class231.field3455, -123);
                            class95.field1451.method775(63, -119);
                        }
                    }
                } else {
                    class55.method368(class163.field2364, var3, var2);
                }
            }
            if (~var4 == -8) {
                class72 var11 = class82.field1268[var5];
                if (var11 != null) {
                    class193.method1241(class55.field847.field50[0], var11.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var11.field50[0], 0);
                    class270.field4236 = class279.field4465;
                    class107.field1550 = 0;
                    ++class140.field2032;
                    class65.field1021 = class42.field602;
                    class290.field4582 = 2;
                    class95.field1451.method522(35, 28727);
                    class95.field1451.method794(var5, (byte) -112);
                }
            }
            if (var4 == 43) {
                class53 var12 = class194.field2777[var5];
                if (var12 != null) {
                    class193.method1241(class55.field847.field50[0], var12.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var12.field50[0], 0);
                    class290.field4582 = 2;
                    class270.field4236 = class279.field4465;
                    class65.field1021 = class42.field602;
                    class107.field1550 = 0;
                    class95.field1451.method522(145, 28727);
                    class95.field1451.method761(-125, var5);
                    ++class65.field1023;
                }
            }
            if (~var4 == -11 && client.method1429(var2, var3, var6, true)) {
                class95.field1451.method522(54, 28727);
                class95.field1451.method738(class151.field2169, (byte) 94);
                class95.field1451.method761(-121, class190.field2704);
                ++class54.field811;
                class95.field1451.method764(19753, class91.field1387);
                class95.field1451.method738(class113.field1615 + var3, (byte) 97);
                class95.field1451.method738((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 82);
                class95.field1451.method761(-127, class95.field1445 + var2);
            }
            if (~var4 == -36) {
                class53 var13 = class194.field2777[var5];
                if (var13 != null) {
                    class193.method1241(class55.field847.field50[0], var13.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var13.field50[0], 0);
                    class107.field1550 = 0;
                    ++class149.field2125;
                    class290.field4582 = 2;
                    class270.field4236 = class279.field4465;
                    class65.field1021 = class42.field602;
                    class95.field1451.method522(128, 28727);
                    class95.field1451.method794(var5, (byte) -27);
                }
            }
            if (~var4 == -19) {
                if (class69.field1076 == 1) {
                    class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                } else {
                    boolean var14 = class193.method1241(class55.field847.field50[0], var3, 0, 0, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                    if (!var14) {
                        class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                    }
                }
                ++class130.field1894;
                class65.field1021 = class42.field602;
                class107.field1550 = 0;
                class290.field4582 = 2;
                class270.field4236 = class279.field4465;
                class95.field1451.method522(238, 28727);
                class95.field1451.method738(class95.field1445 + var2, (byte) 109);
                class95.field1451.method738(var5, (byte) 63);
                class95.field1451.method761(-127, var3 - -class113.field1615);
            }
            if (~var4 == -27) {
                ++class31.field446;
                if (~class69.field1076 != -2) {
                    boolean var16 = class193.method1241(class55.field847.field50[0], var3, 0, 0, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                    if (!var16) {
                        class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                    }
                } else {
                    class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                }
                class107.field1550 = 0;
                class65.field1021 = class42.field602;
                class290.field4582 = 2;
                class270.field4236 = class279.field4465;
                class95.field1451.method522(80, 28727);
                class95.field1451.method761(-124, var5);
                class95.field1451.method784(true, class95.field1445 + var2);
                class95.field1451.method794(class113.field1615 + var3, (byte) -126);
            }
            if (var4 == 1005) {
                ++class210.field3017;
                client.method1429(var2, var3, var6, true);
                class95.field1451.method522(225, 28727);
                class95.field1451.method738(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 62);
                class95.field1451.method761(-123, class113.field1615 + var3);
                class95.field1451.method794(class95.field1445 + var2, (byte) -36);
            }
            if (~var4 == -24) {
                class173.method1140(false);
            }
            if (~var4 == -46) {
                ++class136.field1968;
                class95.field1451.method522(30, 28727);
                class95.field1451.method784(true, var5);
                class95.field1451.method737(-2645, var2);
                class95.field1451.method738(var3, (byte) 95);
                class69.field1086 = 0;
                class114.field1694 = class282.method1897(var2, 117);
                class113.field1607 = var3;
            }
            if (var4 == 16) {
                class53 var18 = class194.field2777[var5];
                if (var18 != null) {
                    ++class226.field3389;
                    class193.method1241(class55.field847.field50[0], var18.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var18.field50[0], 0);
                    class107.field1550 = 0;
                    class65.field1021 = class42.field602;
                    class290.field4582 = 2;
                    class270.field4236 = class279.field4465;
                    class95.field1451.method522(153, 28727);
                    class95.field1451.method794(var5, (byte) -48);
                }
            }
            if (var4 == 13) {
                class53 var19 = class194.field2777[var5];
                if (var19 != null) {
                    class193.method1241(class55.field847.field50[0], var19.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var19.field50[0], 0);
                    class290.field4582 = 2;
                    class65.field1021 = class42.field602;
                    class270.field4236 = class279.field4465;
                    ++class54.field805;
                    class107.field1550 = 0;
                    class95.field1451.method522(250, 28727);
                    class95.field1451.method794(var5, (byte) -100);
                }
            }
            if (~var4 == -23) {
                class213.method1363(true);
                class267 var20 = class282.method1897(var2, 124);
                class151.field2169 = var3;
                class91.field1387 = var2;
                class204.field2963 = 1;
                class190.field2704 = var5;
                class217.method1396(false, var20);
                class207.field3002 = "<col=ff9040>" + class259.method1735(var5, -14667).field4375 + "<col=ffffff>";
                if (class207.field3002 == null) {
                    class207.field3002 = "null";
                }
            } else {
                if (var4 == 24) {
                    class72 var21 = class82.field1268[var5];
                    if (var21 != null) {
                        class193.method1241(class55.field847.field50[0], var21.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var21.field50[0], 0);
                        class270.field4236 = class279.field4465;
                        class107.field1550 = 0;
                        class65.field1021 = class42.field602;
                        class290.field4582 = 2;
                        ++class190.field2686;
                        class95.field1451.method522(217, 28727);
                        class95.field1451.method738(var5, (byte) 110);
                    }
                }
                if (~var4 == -1003) {
                    ++class195.field2801;
                    class65.field1021 = class42.field602;
                    class290.field4582 = 2;
                    class107.field1550 = 0;
                    class270.field4236 = class279.field4465;
                    class95.field1451.method522(189, 28727);
                    class95.field1451.method738(var5, (byte) 63);
                }
                if (~var4 == -30) {
                    ++class181.field2587;
                    if (~class69.field1076 == -2) {
                        class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                    } else {
                        boolean var22 = class193.method1241(class55.field847.field50[0], var3, 0, 0, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                        if (!var22) {
                            class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                        }
                    }
                    class107.field1550 = 0;
                    class65.field1021 = class42.field602;
                    class290.field4582 = 2;
                    class270.field4236 = class279.field4465;
                    class95.field1451.method522(51, 28727);
                    class95.field1451.method738(var5, (byte) 60);
                    class95.field1451.method761(-120, class113.field1615 + var3);
                    class95.field1451.method784(true, class95.field1445 + var2);
                }
                if (~var4 == -31) {
                    ++class67.field1044;
                    class95.field1451.method522(74, 28727);
                    class95.field1451.method784(true, class102.field1511);
                    class95.field1451.method794(var3, (byte) -99);
                    class95.field1451.method748(var2, 26277);
                    class95.field1451.method761(-128, var5);
                    class95.field1451.method737(-2645, class172.field2462);
                    class69.field1086 = 0;
                    class114.field1694 = class282.method1897(var2, 106);
                    class113.field1607 = var3;
                }
                if (var4 == 9) {
                    class53 var24 = class194.field2777[var5];
                    if (var24 != null) {
                        class193.method1241(class55.field847.field50[0], var24.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var24.field50[0], 0);
                        class290.field4582 = 2;
                        class65.field1021 = class42.field602;
                        class107.field1550 = 0;
                        class270.field4236 = class279.field4465;
                        ++class166.field2418;
                        class95.field1451.method522(178, 28727);
                        class95.field1451.method784(true, var5);
                    }
                }
                if (var4 == 33) {
                    class53 var25 = class194.field2777[var5];
                    if (var25 != null) {
                        class193.method1241(class55.field847.field50[0], var25.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var25.field50[0], 0);
                        class107.field1550 = 0;
                        ++class194.field2788;
                        class290.field4582 = 2;
                        class270.field4236 = class279.field4465;
                        class65.field1021 = class42.field602;
                        class95.field1451.method522(116, 28727);
                        class95.field1451.method761(-122, var5);
                    }
                }
                if (~var4 == -1008) {
                    class270.field4236 = class279.field4465;
                    class65.field1021 = class42.field602;
                    ++class42.field604;
                    class107.field1550 = 0;
                    class290.field4582 = 2;
                    class95.field1451.method522(155, 28727);
                    class95.field1451.method784(true, var5);
                }
                if (~var4 == -60) {
                    class72 var26 = class82.field1268[var5];
                    if (var26 != null) {
                        class193.method1241(class55.field847.field50[0], var26.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var26.field50[0], 0);
                        class107.field1550 = 0;
                        class290.field4582 = 2;
                        class65.field1021 = class42.field602;
                        class270.field4236 = class279.field4465;
                        class95.field1451.method522(194, 28727);
                        ++class156.field2278;
                        class95.field1451.method784(true, var5);
                    }
                }
                if (~var4 == -15) {
                    class95.field1451.method522(187, 28727);
                    ++class168.field2432;
                    class95.field1451.method773(var2, 0);
                    class95.field1451.method738(var3, (byte) 73);
                    class95.field1451.method794(var5, (byte) -74);
                    class69.field1086 = 0;
                    class114.field1694 = class282.method1897(var2, 74);
                    class113.field1607 = var3;
                }
                if (var4 == 47) {
                    if (class69.field1076 == 1) {
                        class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                    } else {
                        boolean var27 = class193.method1241(class55.field847.field50[0], var3, 0, 0, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                        if (!var27) {
                            class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                        }
                    }
                    class290.field4582 = 2;
                    class107.field1550 = 0;
                    class65.field1021 = class42.field602;
                    ++class213.field3061;
                    class270.field4236 = class279.field4465;
                    class95.field1451.method522(234, 28727);
                    class95.field1451.method784(true, var5);
                    class95.field1451.method794(var2 - -class95.field1445, (byte) -98);
                    class95.field1451.method794(class113.field1615 + var3, (byte) -27);
                }
                if (~var4 == -38) {
                    if (~var5 == -1) {
                        class99.field1487 = 1;
                        class55.method368(class163.field2364, var3, var2);
                    } else if (~class270.field4228 < -1 && class19.field267[82] && class19.field267[81]) {
                        class281.method1896(class95.field1445 + var2, class163.field2364, class113.field1615 + var3, 28);
                    } else {
                        ++class155.field2264;
                        class95.field1451.method522(32, 28727);
                        class95.field1451.method761(-124, class113.field1615 + var3);
                        class95.field1451.method738(class95.field1445 + var2, (byte) 73);
                    }
                }
                if (var4 == 4) {
                    ++class195.field2805;
                    class95.field1451.method522(94, 28727);
                    class95.field1451.method784(true, var3);
                    class95.field1451.method773(var2, 0);
                    class95.field1451.method794(var5, (byte) -96);
                    class69.field1086 = 0;
                    class114.field1694 = class282.method1897(var2, 75);
                    class113.field1607 = var3;
                }
                if (~var4 == -39) {
                    if (var5 == 0) {
                        class203.field2940 = 1;
                        class55.method368(class163.field2364, var3, var2);
                    } else if (var5 == 1) {
                        ++class58.field887;
                        class95.field1451.method522(69, 28727);
                        class95.field1451.method737(-2645, class172.field2462);
                        class95.field1451.method761(-127, class102.field1511);
                        class95.field1451.method784(true, class95.field1445 + var2);
                        class95.field1451.method794(class113.field1615 + var3, (byte) -93);
                    }
                }
                if (var4 == 48) {
                    class267 var29 = class282.method1897(var2, 47);
                    boolean var30 = true;
                    if (~var29.field4104 < -1) {
                        var30 = class271.method1820(-120, var29);
                    }
                    if (var30) {
                        class95.field1451.method522(52, 28727);
                        ++class281.field4484;
                        class95.field1451.method737(-2645, var2);
                    }
                }
                if (var4 == 39) {
                    class53 var31 = class194.field2777[var5];
                    if (var31 != null) {
                        class193.method1241(class55.field847.field50[0], var31.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var31.field50[0], 0);
                        class107.field1550 = 0;
                        class65.field1021 = class42.field602;
                        class290.field4582 = 2;
                        ++class272.field4314;
                        class270.field4236 = class279.field4465;
                        class95.field1451.method522(49, 28727);
                        class95.field1451.method761(-125, var5);
                    }
                }
                if (~var4 == -6) {
                    ++class246.field3680;
                    class95.field1451.method522(237, 28727);
                    class95.field1451.method794(var5, (byte) -39);
                    class95.field1451.method761(-125, var3);
                    class95.field1451.method748(var2, 26277);
                    class69.field1086 = 0;
                    class114.field1694 = class282.method1897(var2, 60);
                    class113.field1607 = var3;
                }
                if (~var4 == -12) {
                    ++class192.field2757;
                    class95.field1451.method522(173, 28727);
                    class95.field1451.method748(var2, 26277);
                    class95.field1451.method794(var5, (byte) -104);
                    class95.field1451.method794(var3, (byte) -110);
                    class69.field1086 = 0;
                    class114.field1694 = class282.method1897(var2, 118);
                    class113.field1607 = var3;
                }
                if (var4 == 2) {
                    client.method1429(var2, var3, var6, true);
                    class95.field1451.method522(117, 28727);
                    ++class87.field1341;
                    class95.field1451.method784(true, Integer.MAX_VALUE & (int) (var6 >>> 32));
                    class95.field1451.method794(class113.field1615 + var3, (byte) -94);
                    class95.field1451.method784(true, class95.field1445 + var2);
                }
                if (arg0 >= 50) {
                    if (var4 == 25) {
                        class95.field1451.method522(52, 28727);
                        class95.field1451.method737(-2645, var2);
                        ++class281.field4484;
                        class267 var32 = class282.method1897(var2, 83);
                        if (var32.field4158 != null && ~var32.field4158[0][0] == -6) {
                            int var33 = var32.field4158[0][1];
                            if (class20.field276[var33] != var32.field4036[0]) {
                                class20.field276[var33] = var32.field4036[0];
                                class97.method658(7272, var33);
                            }
                        }
                    }
                    if (~var4 == -45 || ~var4 == -1004) {
                        class173.method1144(var5, 15119, var2, class69.field1087[arg1], var3);
                    }
                    if (~var4 == -22) {
                        ++class114.field1626;
                        client.method1429(var2, var3, var6, true);
                        class95.field1451.method522(7, 28727);
                        class95.field1451.method738(class113.field1615 + var3, (byte) 62);
                        class95.field1451.method761(-126, class95.field1445 + var2);
                        class95.field1451.method784(true, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    }
                    if (~var4 == -33) {
                        ++class257.field3909;
                        class95.field1451.method522(224, 28727);
                        class95.field1451.method748(var2, 26277);
                        class95.field1451.method794(var3, (byte) -71);
                        class95.field1451.method794(var5, (byte) -32);
                        class69.field1086 = 0;
                        class114.field1694 = class282.method1897(var2, 61);
                        class113.field1607 = var3;
                    }
                    if (var4 == 8) {
                        class72 var34 = class82.field1268[var5];
                        if (var34 != null) {
                            class193.method1241(class55.field847.field50[0], var34.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var34.field50[0], 0);
                            class107.field1550 = 0;
                            class270.field4236 = class279.field4465;
                            ++class75.field1161;
                            class65.field1021 = class42.field602;
                            class290.field4582 = 2;
                            class95.field1451.method522(229, 28727);
                            class95.field1451.method764(19753, class91.field1387);
                            class95.field1451.method738(var5, (byte) 67);
                            class95.field1451.method738(class151.field2169, (byte) 75);
                            class95.field1451.method784(true, class190.field2704);
                        }
                    }
                    if (~var4 == -37) {
                        class72 var35 = class82.field1268[var5];
                        if (var35 != null) {
                            class193.method1241(class55.field847.field50[0], var35.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var35.field50[0], 0);
                            ++class282.field4492;
                            class65.field1021 = class42.field602;
                            class270.field4236 = class279.field4465;
                            class107.field1550 = 0;
                            class290.field4582 = 2;
                            class95.field1451.method522(115, 28727);
                            class95.field1451.method773(class172.field2462, 0);
                            class95.field1451.method784(true, var5);
                            class95.field1451.method794(class102.field1511, (byte) -50);
                        }
                    }
                    if (var4 == 12) {
                        class72 var36 = class82.field1268[var5];
                        if (var36 != null) {
                            ++class107.field1552;
                            class193.method1241(class55.field847.field50[0], var36.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var36.field50[0], 0);
                            class65.field1021 = class42.field602;
                            class270.field4236 = class279.field4465;
                            class290.field4582 = 2;
                            class107.field1550 = 0;
                            class95.field1451.method522(31, 28727);
                            class95.field1451.method784(true, var5);
                        }
                    }
                    if (var4 == 58) {
                        class72 var37 = class82.field1268[var5];
                        if (var37 != null) {
                            ++class47.field656;
                            class193.method1241(class55.field847.field50[0], var37.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var37.field50[0], 0);
                            class290.field4582 = 2;
                            class107.field1550 = 0;
                            class270.field4236 = class279.field4465;
                            class65.field1021 = class42.field602;
                            class95.field1451.method522(99, 28727);
                            class95.field1451.method794(var5, (byte) -100);
                        }
                    }
                    if (var4 == 51) {
                        class267 var38 = class22.method165(var3, false, var2);
                        if (var38 != null) {
                            class213.method1363(true);
                            class92 var39 = client.method1439(var38);
                            class228.method1486(var3, var39.method626((byte) 107), var39.field1400, var38.field4063, var2, var38.field4092, 0);
                            class204.field2963 = 0;
                            class214.field3087 = class47.method312(-1, var38);
                            if (class214.field3087 == null) {
                                class214.field3087 = "Null";
                            }
                            if (!var38.field4039) {
                                class14.field214 = "<col=00ff00>" + var38.field4127 + "<col=ffffff>";
                                return;
                            }
                            class14.field214 = var38.field4093 + "<col=ffffff>";
                        }
                    } else {
                        if (var4 == 60) {
                            ++class25.field341;
                            if (~class69.field1076 != -2) {
                                boolean var40 = class193.method1241(class55.field847.field50[0], var3, 0, 0, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                                if (!var40) {
                                    class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                                }
                            } else {
                                class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                            }
                            class107.field1550 = 0;
                            class290.field4582 = 2;
                            class65.field1021 = class42.field602;
                            class270.field4236 = class279.field4465;
                            class95.field1451.method522(176, 28727);
                            class95.field1451.method794(class95.field1445 + var2, (byte) -52);
                            class95.field1451.method738(class113.field1615 + var3, (byte) 62);
                            class95.field1451.method738(var5, (byte) 82);
                        }
                        if (~var4 == -7) {
                            boolean var42 = class193.method1241(class55.field847.field50[0], var3, 0, 0, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                            ++class211.field3038;
                            if (!var42) {
                                class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                            }
                            class290.field4582 = 2;
                            class270.field4236 = class279.field4465;
                            class65.field1021 = class42.field602;
                            class107.field1550 = 0;
                            class95.field1451.method522(71, 28727);
                            class95.field1451.method761(-127, class113.field1615 + var3);
                            class95.field1451.method764(19753, class172.field2462);
                            class95.field1451.method761(-123, class102.field1511);
                            class95.field1451.method784(true, var5);
                            class95.field1451.method784(true, var2 - -class95.field1445);
                        }
                        if (var4 == 49) {
                            class95.field1451.method522(233, 28727);
                            class95.field1451.method738(var5, (byte) 66);
                            ++class233.field3471;
                            class95.field1451.method738(var3, (byte) 47);
                            class95.field1451.method748(var2, 26277);
                            class69.field1086 = 0;
                            class114.field1694 = class282.method1897(var2, 111);
                            class113.field1607 = var3;
                        }
                        if (var4 == 28) {
                            ++class177.field2514;
                            boolean var44 = class193.method1241(class55.field847.field50[0], var3, 0, 0, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                            if (!var44) {
                                class193.method1241(class55.field847.field50[0], var3, 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var2, 0);
                            }
                            class270.field4236 = class279.field4465;
                            class290.field4582 = 2;
                            class65.field1021 = class42.field602;
                            class107.field1550 = 0;
                            class95.field1451.method522(203, 28727);
                            class95.field1451.method761(-126, class151.field2169);
                            class95.field1451.method784(true, class95.field1445 + var2);
                            class95.field1451.method738(class190.field2704, (byte) 110);
                            class95.field1451.method738(var5, (byte) 121);
                            class95.field1451.method764(19753, class91.field1387);
                            class95.field1451.method794(class113.field1615 + var3, (byte) -41);
                        }
                        if (~var4 == -1002) {
                            class267 var46 = class282.method1897(var2, 116);
                            if (var46 != null && var46.field4172[var3] >= 100000) {
                                class255.method1712((byte) 72, var46.field4172[var3] + " x " + class259.method1735(var5, -14667).field4375, 0, "");
                            } else {
                                class95.field1451.method522(189, 28727);
                                class95.field1451.method738(var5, (byte) 48);
                                ++class195.field2801;
                            }
                            class69.field1086 = 0;
                            class114.field1694 = class282.method1897(var2, 83);
                            class113.field1607 = var3;
                        }
                        if (var4 == 42) {
                            class53 var47 = class194.field2777[var5];
                            if (var47 != null) {
                                ++class94.field1429;
                                class193.method1241(class55.field847.field50[0], var47.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var47.field50[0], 0);
                                class270.field4236 = class279.field4465;
                                class290.field4582 = 2;
                                class107.field1550 = 0;
                                class65.field1021 = class42.field602;
                                class95.field1451.method522(105, 28727);
                                class95.field1451.method784(true, var5);
                                class95.field1451.method737(-2645, class91.field1387);
                                class95.field1451.method738(class151.field2169, (byte) 81);
                                class95.field1451.method738(class190.field2704, (byte) 101);
                            }
                        }
                        if (var4 == 31) {
                            class95.field1451.method522(52, 28727);
                            ++class281.field4484;
                            class95.field1451.method737(-2645, var2);
                            class267 var48 = class282.method1897(var2, 111);
                            if (var48.field4158 != null && ~var48.field4158[0][0] == -6) {
                                int var49 = var48.field4158[0][1];
                                class20.field276[var49] = 1 - class20.field276[var49];
                                class97.method658(7272, var49);
                            }
                        }
                        if (var4 == 15) {
                            class53 var50 = class194.field2777[var5];
                            if (var50 != null) {
                                class193.method1241(class55.field847.field50[0], var50.field119[0], 1, 1, false, class55.field847.field119[0], false, 0, 2, 0, var50.field50[0], 0);
                                class65.field1021 = class42.field602;
                                ++class218.field3223;
                                class290.field4582 = 2;
                                class270.field4236 = class279.field4465;
                                class107.field1550 = 0;
                                class95.field1451.method522(28, 28727);
                                class95.field1451.method764(19753, class172.field2462);
                                class95.field1451.method738(class102.field1511, (byte) 108);
                                class95.field1451.method738(var5, (byte) 77);
                            }
                        }
                        if (~var4 == -47) {
                            ++class233.field3513;
                            class95.field1451.method522(55, 28727);
                            class95.field1451.method761(-124, var3);
                            class95.field1451.method748(var2, 26277);
                            class95.field1451.method738(var5, (byte) 114);
                            class69.field1086 = 0;
                            class114.field1694 = class282.method1897(var2, 54);
                            class113.field1607 = var3;
                        }
                        if (~var4 == -51) {
                            class95.field1451.method522(236, 28727);
                            ++class197.field2839;
                            class95.field1451.method784(true, var3);
                            class95.field1451.method764(19753, var2);
                            class95.field1451.method737(-2645, class91.field1387);
                            class95.field1451.method784(true, var5);
                            class95.field1451.method794(class151.field2169, (byte) -96);
                            class95.field1451.method761(-127, class190.field2704);
                            class69.field1086 = 0;
                            class114.field1694 = class282.method1897(var2, 84);
                            class113.field1607 = var3;
                        }
                        if (~class204.field2963 != -1) {
                            class204.field2963 = 0;
                            class217.method1396(false, class282.method1897(class91.field1387, 104));
                        }
                        if (class275.field4406) {
                            class213.method1363(true);
                        }
                        if (class114.field1694 != null && class69.field1086 == 0) {
                            class217.method1396(false, class114.field1694);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BILve;)Llk;")
    public static final class244 method1717(byte arg0, int arg1, class233 arg2) {
        ++field3883;
        if (arg0 <= 124) {
            method1715(-45, (class86[]) null, -63, 126, true, -60, (byte[]) null, 80);
        }
        return !class255.method1711(arg2, true, arg1) ? null : class277.method1865(true);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(IIII)Z")
    public static final boolean method1718(int arg0, int arg1, int arg2, int arg3) {
        if (!class191.method1225(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class107.field1556[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class96.field1456) {
                        if (!client.method1433(var4, var6, var5)) {
                            return false;
                        }
                        if (!client.method1433(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!client.method1433(var4, var7, var5)) {
                            return false;
                        }
                        if (!client.method1433(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!client.method1433(var4, var8, var5)) {
                        return false;
                    }
                    if (!client.method1433(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class162.field2363) {
                        if (!client.method1433(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!client.method1433(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!client.method1433(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!client.method1433(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!client.method1433(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!client.method1433(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class96.field1456) {
                        if (!client.method1433(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!client.method1433(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!client.method1433(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!client.method1433(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!client.method1433(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!client.method1433(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class162.field2363) {
                        if (!client.method1433(var4, var6, var5)) {
                            return false;
                        }
                        if (!client.method1433(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!client.method1433(var4, var7, var5)) {
                            return false;
                        }
                        if (!client.method1433(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!client.method1433(var4, var8, var5)) {
                        return false;
                    }
                    if (!client.method1433(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!client.method1433(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return client.method1433(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return client.method1433(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return client.method1433(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return client.method1433(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field3891;
        if (~arg2 == arg0) {
            this.field3886 = arg1.method760(false);
            this.field3880 = new int[arg1.method760(false)][2];
            for (int var4 = 0; ~this.field3880.length < ~var4; ++var4) {
                this.field3880[var4][0] = arg1.method756(-29901);
                this.field3880[var4][1] = arg1.method756(arg0 + -29900);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
    private final void method1719(int arg0) {
        int var2 = this.field3886;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field3880.length + -1 && this.field3880[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field3880[var5];
                    int[] var7 = this.field3880[var5 - 1];
                    int var8 = (var4 - var7[0] << 12) / (var6[0] + -var7[0]);
                    int var9 = -class124.field1788[(8183 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field3892[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field3880.length + -1) < ~var14 && var13 >= this.field3880[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3880[var14 + -1];
                    int[] var16 = this.field3880[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3892[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field3880.length + -1 > var22 && ~var21 <= ~this.field3880[var22][0]; ++var22) {
                }
                int[] var23 = this.field3880[var22];
                int[] var24 = this.field3880[var22 + -1];
                int var25 = this.method1721(var22 + -2, 98)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method1721(var22 - -1, 126)[1];
                int var29 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var30 = -var25 + -var27 + var26 + var28;
                int var32 = var29 * var29 >> 12;
                int var33 = var25 - (var26 - -var30);
                int var34 = (var29 * var30 >> 12) * var32 >> 12;
                int var35 = -var25 + var27;
                int var36 = var32 * var33 >> 12;
                int var37 = var29 * var35 >> 12;
                int var38 = var34 + var37 - (-var36 - var26);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field3892[var20] = (short) var38;
            }
        }
        if (arg0 == -20423) {
            ++field3890;
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(II)V")
    public static final void method1720(int arg0, int arg1) {
        if (arg0 == 128) {
            ++field3888;
            class242.field3637 = arg1;
            class140.field2029 = 20;
            class80.field1235 = 3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(II)[I")
    private final int[] method1721(int arg0, int arg1) {
        ++field3885;
        if (~arg0 > -1) {
            return this.field3893;
        } else if (this.field3880.length <= arg0) {
            return this.field3879;
        } else {
            if (arg1 < 84) {
                this.field3892 = null;
            }
            return this.field3880[arg0];
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field3884;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int[] var4 = this.method797(0, arg1, arg0 ^ 242153065);
            for (int var5 = 0; ~class77.field1178 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3892[var6];
            }
        }
        return arg0 != 242152972 ? null : var3;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V")
    public static void method1722(byte arg0) {
        field3889 = null;
        if (arg0 < 25) {
            field3889 = null;
        }
        field3881 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        if (this.field3880 == null) {
            this.field3880 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field3882;
        if (~this.field3880.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field3886 == 2) {
                this.method1714(128);
            }
            class276.method1856((byte) 48);
            int var2 = -78 / ((78 - arg0) / 42);
            this.method1719(-20423);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lca;I)V")
    public static final void method1723(class83 arg0, int arg1) {
        class92.field1401 = 3;
        class263.method1750(true, 0);
        class235.field3556 = true;
        class13.field199 = 0;
        class290.field4579 = true;
        class147.field2100 = true;
        class194.field2784 = 0;
        class243.field3661 = 0;
        class1.field17 = true;
        class242.field3626 = true;
        class1.field11 = true;
        class264.field3967 = 2;
        class209.field3015 = 255;
        class193.field2760 = true;
        class62.field1000 = 127;
        class148.field2112 = arg1;
        class48.field695 = true;
        class32.field473 = 127;
        ++field3877;
        class42.field606 = true;
        class195.field2797 = true;
        class4 var2 = null;
        class234.field3516 = true;
        if (~class154.field2251 <= -97) {
            class112.method727(2);
        } else {
            class112.method727(0);
        }
        class190.field2708 = 0;
        class66.field1030 = false;
        class185.field2645 = 0;
        class262.field3949 = true;
        class207.field2997 = false;
        class107.field1555 = false;
        class161.field2333 = 0;
        try {
            class239 var3 = arg0.method559(12, "runescape");
            while (~var3.field3588 == -1) {
                class98.method660(1L, -68);
            }
            if (var3.field3588 == 1) {
                var2 = (class4) var3.field3585;
                byte[] var4 = new byte[(int) var2.method49(arg1)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method51(var5, var4.length + -var5, var4, (byte) 90);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                class54.method359((byte) -53, new class114(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method50(1);
            }
        } catch (Exception var7) {
        }
    }
}
