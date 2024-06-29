import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class86 {

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Z")
    public static boolean field717 = true;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[Ljava/lang/String;")
    public static String[] field728 = new String[100];

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lth;")
    public static class57 field715;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method335(byte arg0, int arg1) {
        class248.field4048 = 3;
        class226.field3727 = 100;
        field716++;
        int var2 = -115 / ((arg0 + 30) / 32);
        class74.field1256 = -1;
        class255.field4296 = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwf;)Lvj;", line = 19)
    public static final class105 method336(class250 arg0) {
        class105 var1 = (class105) class344.field5473.method1268(-76, ((long) arg0.field4167 << 32) + (long) arg0.field4229);
        return var1 == null ? arg0.field4155 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lth;I)V", line = 24)
    private static final void method337(class57 arg0, int arg1) {
        class170.field2702 = arg0;
        field713++;
        if (arg1 < 114) {
            method361();
        }
        class127.field2153 = class170.field2702.method482(27535, 4);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 36)
    private final void method338(byte arg0) {
        field729++;
        for (class127.field2154 = 0; class283.method2077(672048140) && class127.field2154 < 128; class127.field2154++) {
            class102.field1667[class127.field2154] = field714;
            class356.field5647[class127.field2154] = class333.field5286;
        }
        class272.field4516++;
        if (class304.field4870 != -1) {
            class106.method825(0, class304.field4870, 0, 0, (byte) 78, 0, class298.field4779, class252.field4266);
        }
        class55.field908++;
        if (class42.field607) {
            int var2 = 2359807;
            label201: for (int var3 = 0; var3 < 32768; var3++) {
                class288 var4 = class165.field2621[var3];
                if (var4 != null) {
                    byte var5 = var4.field4692.field2055;
                    if ((var5 & 0x2) > 0 && var4.field3503 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field3519[0] = (var4.field3577 >> 7) + var6;
                            var4.field3553[0] = (var4.field3511 >> 7) + var7;
                            var4.field3496[0] = 1;
                            class32.field459[class186.field2991].method136(false, false, -23999, var4.method1634(-1), var4.method1634(-1), var4.field3511 >> 7, 0, var4.field3577 >> 7);
                            if (var4.field3519[0] >= 0 && var4.field3519[0] <= (104 - var4.method1634(-1)) && var4.field3553[0] >= 0 && var4.field3553[0] <= (104 - var4.method1634(-1)) && class32.field459[class186.field2991].method139(var4.field3553[0], var4.field3511 >> 7, (byte) -97, var4.field3519[0], var4.field3577 >> 7)) {
                                if (var4.method1634(-1) > 1) {
                                    for (int var8 = var4.field3519[0]; var4.field3519[0] + var4.method1634(-1) > var8; var8++) {
                                        for (int var9 = var4.field3553[0]; (var4.field3553[0] + var4.method1634(-1)) > var9; var9++) {
                                            if ((var2 & class32.field459[class186.field2991].field266[var8][var9]) != 0) {
                                                continue label201;
                                            }
                                        }
                                    }
                                }
                                var4.field3503 = 1;
                            }
                        }
                    }
                    class75.method627(var4, -127);
                    class220.method1643(var4, true);
                    class134.method1025(-1, var4);
                    class32.field459[class186.field2991].method135(var4.field3511 >> 7, false, var4.field3577 >> 7, var4.method1634(-1), var4.method1634(-1), 18377, false);
                }
            }
        }
        if (!class42.field607 && class131.field2212 == 0) {
            class117.method921(false);
        } else if (class4.field42 == 0 && class20.field231 == 0) {
            if (class112.field1827 == 2) {
                class350.method2459(2047);
            } else {
                class32.method220(-97);
            }
            if (class281.field4617 >> 7 < 14 || class281.field4617 >> 7 >= 90 || class229.field3807 >> 7 < 14 || (class229.field3807 >> 7) >= 90) {
                class198.method1525(false);
            }
        }
        while (true) {
            class40 var10;
            class250 var17;
            class250 var18;
            do {
                var10 = (class40) class172.field2742.method2307((byte) 127);
                if (var10 == null) {
                    if (arg0 <= 114) {
                        field715 = (class57) null;
                    }
                    while (true) {
                        class40 var11;
                        class250 var12;
                        class250 var13;
                        do {
                            var11 = (class40) class127.field2148.method2307((byte) 127);
                            if (var11 == null) {
                                while (true) {
                                    class40 var14;
                                    class250 var15;
                                    class250 var16;
                                    do {
                                        var14 = (class40) class300.field4829.method2307((byte) 127);
                                        if (var14 == null) {
                                            if (class81.field1392 != null) {
                                                class131.method1006((byte) 109);
                                            }
                                            if (class66.field1176 != null && class66.field1176.field3064 == 1) {
                                                if (class66.field1176.field3066 != null) {
                                                    class342.method2413(class311.field4955, class25.field305, 4940);
                                                }
                                                class25.field305 = false;
                                                class311.field4955 = null;
                                                class66.field1176 = null;
                                            }
                                            if (class332.field5261 % 1500 == 0) {
                                                class133.method1022((byte) -48);
                                            }
                                            return;
                                        }
                                        var15 = var14.field593;
                                        if (var15.field4229 < 0) {
                                            break;
                                        }
                                        var16 = class13.method74(-105, var15.field4086);
                                    } while (var16 == null || var16.field4171 == null || var16.field4171.length <= var15.field4229 || var16.field4171[var15.field4229] != var15);
                                    class29.method183((byte) 119, var14);
                                }
                            }
                            var12 = var11.field593;
                            if (var12.field4229 < 0) {
                                break;
                            }
                            var13 = class13.method74(-24, var12.field4086);
                        } while (var13 == null || var13.field4171 == null || var12.field4229 >= var13.field4171.length || var13.field4171[var12.field4229] != var12);
                        class29.method183((byte) 119, var11);
                    }
                }
                var17 = var10.field593;
                if (var17.field4229 < 0) {
                    break;
                }
                var18 = class13.method74(-38, var17.field4086);
            } while (var18 == null || var18.field4171 == null || var18.field4171.length <= var17.field4229 || var18.field4171[var17.field4229] != var17);
            class29.method183((byte) 127, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 257)
    private final void method339(byte arg0) {
        field721++;
        boolean var2 = class241.field3991.method55(arg0 - 212);
        if (arg0 != 87) {
            method353();
        }
        if (!var2) {
            this.method364((byte) -122);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 275)
    private static final void method340(boolean arg0) {
        field725++;
        if (class327.field5197 == 0) {
            return;
        }
        try {
            if ((++class34.field506) > 1500) {
                if (class342.field5449 != null) {
                    class342.field5449.method916((byte) 68);
                    class342.field5449 = null;
                }
                if (class281.field4619 >= 1) {
                    class327.field5197 = 0;
                    class46.field736 = -5;
                    return;
                }
                class327.field5197 = 1;
                class281.field4619++;
                class34.field506 = 0;
                if (class118.field1988 == class101.field1661) {
                    class118.field1988 = class354.field5624;
                } else {
                    class118.field1988 = class101.field1661;
                }
            }
            if (class327.field5197 == 1) {
                class206.field3258 = class128.field2163.method1124(class258.field4329, -61, class118.field1988);
                class327.field5197 = 2;
            }
            if (!arg0) {
                method355(false);
            }
            if (class327.field5197 == 2) {
                if (class206.field3258.field3064 == 2) {
                    throw new IOException();
                }
                if (class206.field3258.field3064 != 1) {
                    return;
                }
                class342.field5449 = new class117((Socket) class206.field3258.field3066, class128.field2163);
                class206.field3258 = null;
                class342.field5449.method924(0, class36.field520.field3793, class36.field520.field3760, 93);
                if (class65.field1152 != null) {
                    class65.field1152.method1517((byte) 124);
                }
                if (class260.field4374 != null) {
                    class260.field4374.method1517((byte) 124);
                }
                int var1 = class342.field5449.method918(0);
                if (class65.field1152 != null) {
                    class65.field1152.method1517((byte) 126);
                }
                if (class260.field4374 != null) {
                    class260.field4374.method1517((byte) 126);
                }
                if (var1 != 101) {
                    class327.field5197 = 0;
                    class46.field736 = var1;
                    class342.field5449.method916((byte) 125);
                    class342.field5449 = null;
                    return;
                }
                class327.field5197 = 3;
            }
            if (class327.field5197 == 3) {
                if (class342.field5449.method926(0) >= 2) {
                    int var2 = class342.field5449.method918(0) << 8 | class342.field5449.method918(0);
                    class38.method256(var2, 23611);
                    if (class259.field4360 == -1) {
                        class46.field736 = 6;
                        class327.field5197 = 0;
                        class342.field5449.method916((byte) 123);
                        class342.field5449 = null;
                        return;
                    }
                    class327.field5197 = 0;
                    class342.field5449.method916((byte) 124);
                    class342.field5449 = null;
                    class27.method173((byte) -37);
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class342.field5449 != null) {
                class342.field5449.method916((byte) 90);
                class342.field5449 = null;
            }
            if (class281.field4619 < 1) {
                class34.field506 = 0;
                if (class118.field1988 == class101.field1661) {
                    class118.field1988 = class354.field5624;
                } else {
                    class118.field1988 = class101.field1661;
                }
                class327.field5197 = 1;
                class281.field4619++;
            } else {
                class327.field5197 = 0;
                class46.field736 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lth;B)V", line = 423)
    private static final void method341(class57 arg0, byte arg1) {
        int var2 = 4 % ((arg1 + 20) / 54);
        class340.field5440 = arg0;
        field722++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwf;IIIIIII)V", line = 434)
    public static final void method342(class250[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class250 var9 = arg0[var8];
            if (var9 != null && var9.field4086 == arg1 && (!var9.field4205 || var9.field4078 == 0 || var9.field4071 || method336(var9).field1710 != 0 || class176.field2828 == var9 || var9.field4134 == 1338) && (!var9.field4205 || !method362(var9))) {
                int var10 = var9.field4147 + arg6;
                int var11 = var9.field4213 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4078 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4081 + var10;
                    int var17 = var9.field4157 + var11;
                    if (var9.field4078 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class81.field1392 == var9) {
                    class309.field4921 = true;
                    class279.field4595 = var10;
                    class20.field228 = var11;
                }
                if (!var9.field4205 || var12 < var14 && var13 < var15) {
                    if (var9.field4078 == 0) {
                        if (!var9.field4205 && method362(var9) && class36.field551 != var9) {
                            continue;
                        }
                        if (var9.field4145 && class333.field5275 >= var12 && class77.field1343 >= var13 && class333.field5275 < var14 && class77.field1343 < var15) {
                            for (class40 var18 = (class40) class300.field4829.method2300((byte) 103); var18 != null; var18 = (class40) class300.field4829.method2306(-23)) {
                                if (var18.field587) {
                                    var18.method330(15);
                                    var18.field593.field4189 = false;
                                }
                            }
                            if (class327.field5204 == 0) {
                                class81.field1392 = null;
                                class176.field2828 = null;
                            }
                            class142.field2323 = 0;
                            class141.field2313 = false;
                        }
                    }
                    if (var9.field4205) {
                        boolean var19;
                        if (class333.field5275 >= var12 && class77.field1343 >= var13 && class333.field5275 < var14 && class77.field1343 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class198.field3157 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class325.field5165 == 1 && class333.field5278 >= var12 && class229.field3812 >= var13 && class333.field5278 < var14 && class229.field3812 < var15) {
                            var21 = true;
                        }
                        if (var9.field4095 != null) {
                            for (int var22 = 0; var22 < var9.field4095.length; var22++) {
                                if (class240.field3972[var9.field4095[var22]]) {
                                    if (var9.field4204 == null || class332.field5261 >= var9.field4204[var22]) {
                                        byte var23 = var9.field4175[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class240.field3972[86] && !class240.field3972[82] && !class240.field3972[81]) && ((var23 & 0x2) == 0 || class240.field3972[86]) && ((var23 & 0x1) == 0 || class240.field3972[82]) && ((var23 & 0x4) == 0 || class240.field3972[81])) {
                                            class208.method1579(var22 + 1, "", (byte) -66, var9.field4167, -1);
                                            int var24 = var9.field4173[var22];
                                            if (var9.field4204 == null) {
                                                var9.field4204 = new int[var9.field4095.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4204[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4204[var22] = class332.field5261 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4204 != null) {
                                    var9.field4204[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class250.method1939(3926, var9, class229.field3812 - var11, class333.field5278 - var10);
                        }
                        if (class81.field1392 != null && class81.field1392 != var9 && var19 && method336(var9).method811((byte) -124)) {
                            class162.field2575 = var9;
                        }
                        if (class176.field2828 == var9) {
                            class352.field5587 = true;
                            class77.field1344 = var10;
                            class295.field4750 = var11;
                        }
                        if (var9.field4071 || var9.field4134 != 0) {
                            if (var19 && class204.field3226 != 0 && var9.field4065 != null) {
                                class40 var25 = new class40();
                                var25.field587 = true;
                                var25.field593 = var9;
                                var25.field585 = class204.field3226;
                                var25.field581 = var9.field4065;
                                class300.field4829.method2302((byte) -44, var25);
                            }
                            if (class81.field1392 != null || class123.field2114 != null || class358.field5687 || var9.field4134 != 1400 && class142.field2323 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4134 != 0) {
                                if (var9.field4134 == 1337) {
                                    class14.field153 = var9;
                                    continue;
                                }
                                if (var9.field4134 == 1338) {
                                    if (var21) {
                                        class131.field2219 = class333.field5278 - var10;
                                        class196.field3135 = class229.field3812 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4134 == 1400) {
                                    class308.field4909 = var9;
                                    if (var19) {
                                        class141.field2313 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class333.field5278 - var10 - var9.field4081 / 2) * 2.0D / (double) class174.field2774);
                                        int var27 = (int) ((double) (class229.field3812 - var11 - var9.field4157 / 2) * 2.0D / (double) class174.field2774);
                                        int var28 = class350.field5551 + var26;
                                        int var29 = class208.field3268 + var27;
                                        int var30 = class174.field2772 + var28;
                                        int var31 = class174.field2780 + class174.field2773 - var29 - 1;
                                        class104 var32 = class7.method35((byte) -89);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method802((byte) -108, var33, var31, var30);
                                        if (var33 != null) {
                                            if (class240.field3972[82] && class162.field2572 > 0) {
                                                class322.method2271(116, var33[0], var33[2], var33[1]);
                                                class87.method697(true);
                                                continue;
                                            }
                                            class322.field5119++;
                                            class36.field520.method2228(65, 16547);
                                            class36.field520.method1757(var33[0] << 28 | var33[1] << 14 | var33[2], -123);
                                        }
                                        class142.field2323 = 1;
                                        class151.field2400 = false;
                                        class205.field3239 = class333.field5275;
                                        class252.field4268 = class77.field1343;
                                        continue;
                                    }
                                    if (var20 && class142.field2323 > 0) {
                                        if (class142.field2323 == 1 && (class333.field5275 != class205.field3239 || class77.field1343 != class252.field4268)) {
                                            class35.field512 = class350.field5551;
                                            class294.field4744 = class208.field3268;
                                            class142.field2323 = 2;
                                        }
                                        if (class142.field2323 == 2) {
                                            class151.field2400 = true;
                                            class280.method2068(-1, (int) ((double) (class205.field3239 - class333.field5275) * 2.0D / (double) class174.field2779) + class35.field512);
                                            class326.method2293(-123, (int) ((double) (class252.field4268 - class77.field1343) * 2.0D / (double) class174.field2779) + class294.field4744);
                                        }
                                        continue;
                                    }
                                    if (class142.field2323 > 0 && !class151.field2400) {
                                        if ((class86.field1458 == 1 || class164.method1276(-16563, class104.field1683 - 1)) && class104.field1683 > 2) {
                                            class102.method791(-8118);
                                        } else if (class104.field1683 > 0) {
                                            class78.method646((byte) -80);
                                        }
                                    }
                                    class142.field2323 = 0;
                                    continue;
                                }
                                if (var9.field4134 == 1401) {
                                    if (var20) {
                                        class178.method1403(var9.field4081, class333.field5275 - var10, 24273, class77.field1343 - var11, var9.field4157);
                                    }
                                    continue;
                                }
                                if (var9.field4134 == 1402) {
                                    if (!class42.field607) {
                                        class205.method1568(var9, (byte) 115);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field4158 && var21) {
                                var9.field4158 = true;
                                if (var9.field4227 != null) {
                                    class40 var34 = new class40();
                                    var34.field587 = true;
                                    var34.field593 = var9;
                                    var34.field588 = class333.field5278 - var10;
                                    var34.field585 = class229.field3812 - var11;
                                    var34.field581 = var9.field4227;
                                    class300.field4829.method2302((byte) -127, var34);
                                }
                            }
                            if (var9.field4158 && var20 && var9.field4148 != null) {
                                class40 var35 = new class40();
                                var35.field587 = true;
                                var35.field593 = var9;
                                var35.field588 = class333.field5275 - var10;
                                var35.field585 = class77.field1343 - var11;
                                var35.field581 = var9.field4148;
                                class300.field4829.method2302((byte) -109, var35);
                            }
                            if (var9.field4158 && !var20) {
                                var9.field4158 = false;
                                if (var9.field4073 != null) {
                                    class40 var36 = new class40();
                                    var36.field587 = true;
                                    var36.field593 = var9;
                                    var36.field588 = class333.field5275 - var10;
                                    var36.field585 = class77.field1343 - var11;
                                    var36.field581 = var9.field4073;
                                    class127.field2148.method2302((byte) -98, var36);
                                }
                            }
                            if (var20 && var9.field4217 != null) {
                                class40 var37 = new class40();
                                var37.field587 = true;
                                var37.field593 = var9;
                                var37.field588 = class333.field5275 - var10;
                                var37.field585 = class77.field1343 - var11;
                                var37.field581 = var9.field4217;
                                class300.field4829.method2302((byte) -86, var37);
                            }
                            if (!var9.field4189 && var19) {
                                var9.field4189 = true;
                                if (var9.field4108 != null) {
                                    class40 var38 = new class40();
                                    var38.field587 = true;
                                    var38.field593 = var9;
                                    var38.field588 = class333.field5275 - var10;
                                    var38.field585 = class77.field1343 - var11;
                                    var38.field581 = var9.field4108;
                                    class300.field4829.method2302((byte) -76, var38);
                                }
                            }
                            if (var9.field4189 && var19 && var9.field4112 != null) {
                                class40 var39 = new class40();
                                var39.field587 = true;
                                var39.field593 = var9;
                                var39.field588 = class333.field5275 - var10;
                                var39.field585 = class77.field1343 - var11;
                                var39.field581 = var9.field4112;
                                class300.field4829.method2302((byte) -40, var39);
                            }
                            if (var9.field4189 && !var19) {
                                var9.field4189 = false;
                                if (var9.field4190 != null) {
                                    class40 var40 = new class40();
                                    var40.field587 = true;
                                    var40.field593 = var9;
                                    var40.field588 = class333.field5275 - var10;
                                    var40.field585 = class77.field1343 - var11;
                                    var40.field581 = var9.field4190;
                                    class127.field2148.method2302((byte) -106, var40);
                                }
                            }
                            if (var9.field4101 != null) {
                                class40 var41 = new class40();
                                var41.field593 = var9;
                                var41.field581 = var9.field4101;
                                class172.field2742.method2302((byte) -95, var41);
                            }
                            if (var9.field4153 != null && class124.field2127 > var9.field4093) {
                                if (var9.field4150 == null || class124.field2127 - var9.field4093 > 32) {
                                    class40 var46 = new class40();
                                    var46.field593 = var9;
                                    var46.field581 = var9.field4153;
                                    class300.field4829.method2302((byte) -45, var46);
                                } else {
                                    label603: for (int var42 = var9.field4093; var42 < class124.field2127; var42++) {
                                        int var43 = class296.field4766[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field4150.length; var44++) {
                                            if (var9.field4150[var44] == var43) {
                                                class40 var45 = new class40();
                                                var45.field593 = var9;
                                                var45.field581 = var9.field4153;
                                                class300.field4829.method2302((byte) -65, var45);
                                                break label603;
                                            }
                                        }
                                    }
                                }
                                var9.field4093 = class124.field2127;
                            }
                            if (var9.field4097 != null && class29.field357 > var9.field4230) {
                                if (var9.field4198 == null || class29.field357 - var9.field4230 > 32) {
                                    class40 var51 = new class40();
                                    var51.field593 = var9;
                                    var51.field581 = var9.field4097;
                                    class300.field4829.method2302((byte) -103, var51);
                                } else {
                                    label579: for (int var47 = var9.field4230; var47 < class29.field357; var47++) {
                                        int var48 = class304.field4868[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field4198.length; var49++) {
                                            if (var9.field4198[var49] == var48) {
                                                class40 var50 = new class40();
                                                var50.field593 = var9;
                                                var50.field581 = var9.field4097;
                                                class300.field4829.method2302((byte) -73, var50);
                                                break label579;
                                            }
                                        }
                                    }
                                }
                                var9.field4230 = class29.field357;
                            }
                            if (var9.field4133 != null && class335.field5300 > var9.field4082) {
                                if (var9.field4090 == null || class335.field5300 - var9.field4082 > 32) {
                                    class40 var56 = new class40();
                                    var56.field593 = var9;
                                    var56.field581 = var9.field4133;
                                    class300.field4829.method2302((byte) -120, var56);
                                } else {
                                    label555: for (int var52 = var9.field4082; var52 < class335.field5300; var52++) {
                                        int var53 = class19.field214[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field4090.length; var54++) {
                                            if (var9.field4090[var54] == var53) {
                                                class40 var55 = new class40();
                                                var55.field593 = var9;
                                                var55.field581 = var9.field4133;
                                                class300.field4829.method2302((byte) -102, var55);
                                                break label555;
                                            }
                                        }
                                    }
                                }
                                var9.field4082 = class335.field5300;
                            }
                            if (var9.field4241 != null && class49.field778 > var9.field4140) {
                                if (var9.field4218 == null || class49.field778 - var9.field4140 > 32) {
                                    class40 var61 = new class40();
                                    var61.field593 = var9;
                                    var61.field581 = var9.field4241;
                                    class300.field4829.method2302((byte) -66, var61);
                                } else {
                                    label531: for (int var57 = var9.field4140; var57 < class49.field778; var57++) {
                                        int var58 = class94.field1592[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field4218.length; var59++) {
                                            if (var9.field4218[var59] == var58) {
                                                class40 var60 = new class40();
                                                var60.field593 = var9;
                                                var60.field581 = var9.field4241;
                                                class300.field4829.method2302((byte) -51, var60);
                                                break label531;
                                            }
                                        }
                                    }
                                }
                                var9.field4140 = class49.field778;
                            }
                            if (var9.field4199 != null && class25.field314 > var9.field4154) {
                                if (var9.field4119 == null || class25.field314 - var9.field4154 > 32) {
                                    class40 var66 = new class40();
                                    var66.field593 = var9;
                                    var66.field581 = var9.field4199;
                                    class300.field4829.method2302((byte) -80, var66);
                                } else {
                                    label507: for (int var62 = var9.field4154; var62 < class25.field314; var62++) {
                                        int var63 = class231.field3841[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field4119.length; var64++) {
                                            if (var9.field4119[var64] == var63) {
                                                class40 var65 = new class40();
                                                var65.field593 = var9;
                                                var65.field581 = var9.field4199;
                                                class300.field4829.method2302((byte) -112, var65);
                                                break label507;
                                            }
                                        }
                                    }
                                }
                                var9.field4154 = class25.field314;
                            }
                            if (class194.field3097 > var9.field4160 && var9.field4184 != null) {
                                class40 var67 = new class40();
                                var67.field593 = var9;
                                var67.field581 = var9.field4184;
                                class300.field4829.method2302((byte) -21, var67);
                            }
                            if (class44.field683 > var9.field4160 && var9.field4069 != null) {
                                class40 var68 = new class40();
                                var68.field593 = var9;
                                var68.field581 = var9.field4069;
                                class300.field4829.method2302((byte) -68, var68);
                            }
                            if (class264.field4426 > var9.field4160 && var9.field4115 != null) {
                                class40 var69 = new class40();
                                var69.field593 = var9;
                                var69.field581 = var9.field4115;
                                class300.field4829.method2302((byte) -87, var69);
                            }
                            if (class332.field5271 > var9.field4160 && var9.field4207 != null) {
                                class40 var70 = new class40();
                                var70.field593 = var9;
                                var70.field581 = var9.field4207;
                                class300.field4829.method2302((byte) -122, var70);
                            }
                            if (class200.field3182 > var9.field4160 && var9.field4100 != null) {
                                class40 var71 = new class40();
                                var71.field593 = var9;
                                var71.field581 = var9.field4100;
                                class300.field4829.method2302((byte) -38, var71);
                            }
                            var9.field4160 = class55.field908;
                            if (var9.field4118 != null) {
                                for (int var72 = 0; var72 < class127.field2154; var72++) {
                                    class40 var73 = new class40();
                                    var73.field593 = var9;
                                    var73.field580 = class102.field1667[var72];
                                    var73.field578 = class356.field5647[var72];
                                    var73.field581 = var9.field4118;
                                    class300.field4829.method2302((byte) -116, var73);
                                }
                            }
                            if (class36.field521 && var9.field4214 != null) {
                                class40 var74 = new class40();
                                var74.field593 = var9;
                                var74.field581 = var9.field4214;
                                class300.field4829.method2302((byte) -128, var74);
                            }
                        }
                    }
                    if (!var9.field4205 && class81.field1392 == null && class123.field2114 == null && !class358.field5687) {
                        if ((var9.field4117 >= 0 || var9.field4237 != 0) && class333.field5275 >= var12 && class77.field1343 >= var13 && class333.field5275 < var14 && class77.field1343 < var15) {
                            if (var9.field4117 >= 0) {
                                class36.field551 = arg0[var9.field4117];
                            } else {
                                class36.field551 = var9;
                            }
                        }
                        if (var9.field4078 == 8 && class333.field5275 >= var12 && class77.field1343 >= var13 && class333.field5275 < var14 && class77.field1343 < var15) {
                            class352.field5579 = var9;
                        }
                        if (var9.field4201 > var9.field4157) {
                            class250.method1943(class77.field1343, var11, var9.field4201, var9.field4081 + var10, var9, -84, class333.field5275, var9.field4157);
                        }
                    }
                    if (var9.field4078 == 0) {
                        method342(arg0, var9.field4167, var12, var13, var14, var15, var10 - var9.field4225, var11 - var9.field4120);
                        if (var9.field4171 != null) {
                            method342(var9.field4171, var9.field4167, var12, var13, var14, var15, var10 - var9.field4225, var11 - var9.field4120);
                        }
                        class259 var75 = (class259) class226.field3723.method1268(-110, (long) var9.field4167);
                        if (var75 != null) {
                            class106.method825(var12, var75.field4358, var10, var11, (byte) 62, var13, var14, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1235)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class183.method1436("argument count", 1);
            }
            class307.field4898 = Integer.parseInt(arg0[0]);
            class237.field3922 = 2;
            if (arg0[1].equals("live")) {
                class93.field1571 = 0;
            } else if (arg0[1].equals("rc")) {
                class93.field1571 = 1;
            } else if (arg0[1].equals("wip")) {
                class93.field1571 = 2;
            } else {
                class183.method1436("modewhat", 1);
            }
            class125.field2133 = false;
            class204.field3223 = class61.method504(79, arg0[2]);
            if (class204.field3223 == -1) {
                if (arg0[2].equals("english")) {
                    class204.field3223 = 0;
                } else if (arg0[2].equals("german")) {
                    class204.field3223 = 1;
                } else {
                    class183.method1436("language", 1);
                }
            }
            class101.method784(class204.field3223, true);
            class350.field5564 = false;
            class333.field5283 = false;
            if (arg0[3].equals("game0")) {
                class131.field2212 = 0;
            } else if (arg0[3].equals("game1")) {
                class131.field2212 = 1;
            } else {
                class183.method1436("game", 1);
            }
            class247.field4046 = false;
            class14.field155 = "";
            class1.field2 = 0;
            class240.field3973 = 0;
            client var1 = new client();
            class215.field3444 = var1;
            var1.method692(1024, false, 551, class131.field2212 == 1 ? "mechscape" : "runescape", 29, class93.field1571 + 32, 768, 1);
            class241.field3994.setLocation(40, 40);
        } catch (Exception var3) {
            class285.method2079(var3, (byte) -16, (String) null);
        }
        field719++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I", line = 1299)
    public static final int method343(int arg0, int arg1, int arg2, int arg3) {
        field732++;
        if (arg1 != 1000) {
            main((String[]) null);
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwf;)Lwf;", line = 1322)
    public static final class250 method344(class250 arg0) {
        int var1 = method336(arg0).method817(1882153);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class13.method74(-78, arg0.field4086);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1345)
    public final void method345(int arg0) {
        field731++;
        method355(true);
        class158.method1229();
        class260.method1988((byte) -118);
        class210.method1586((byte) -32);
        class174.method1359();
        class104.method798((byte) 63);
        class241.method1836((byte) -115);
        class86.method688((byte) 53);
        class42.method270();
        class190.method1496((byte) 14);
        class342.method2412(arg0 - 2);
        class273.method2046(arg0 ^ 0xFFFFFF83);
        class227.method1751((byte) -111);
        class117.method927(0);
        class12.method61(6);
        class353.method2491(arg0 + 4);
        class251.method1949(-57);
        class90.method713(false);
        class57.method457((byte) 50);
        class233.method1795(false);
        class332.method2332(44);
        class288.method2093(false);
        class22.method148(arg0 - 2);
        class16.method85(arg0 - 127);
        class258.method1978((byte) -128);
        class327.method2303(arg0 ^ arg0);
        class17.method91(false);
        class164.method1275(-125);
        class19.method107(arg0 + 63);
        class111.method843(arg0 + 125);
        class205.method1565(83);
        class222.method1687(-23);
        class196.method1520((byte) 110);
        class115.method905(-28584);
        class43.method324(arg0 ^ 0x6F11);
        class220.method1638(false);
        class36.method243((byte) 117);
        class304.method2170((byte) -113);
        class121.method956(376);
        class105.method808((byte) 84);
        class344.method2426(true);
        class45.method334((byte) -124);
        class116.method913(13925);
        class355.method2513(-17756);
        class257.method1971(true);
        class194.method1505(0);
        class238.method1816((byte) -126);
        class189.method1492(63);
        class329.method2316(126);
        class25.method163(true);
        class20.method114(false);
        class38.method253(false);
        class169.method1319(-67);
        class79.method653(-106);
        class39.method259((byte) -76);
        class293.method2116(63);
        class343.method2422(false);
        class68.method580();
        class140.method1083((byte) 73);
        class74.method619(-2049);
        class234.method1805((byte) -66);
        class281.method2069(-17343);
        class274.method2048(true);
        class29.method180(false);
        class247.method1906(-1);
        class167.method1301();
        class297.method2127(true);
        class114.method882();
        class296.method2124((byte) -101);
        class337.method2362();
        class52.method410(0);
        class62.method530();
        class270.method2033((byte) 127);
        class208.method1577(true);
        class305.method2175((byte) -3);
        class199.method1529();
        class228.method1773();
        class143.method1099((byte) 109);
        class35.method239(arg0 + 11449);
        class285.method2081(arg0 ^ 0xFFFFFF83);
        class171.method1323();
        class349.method2448();
        class11.method44((byte) -105);
        class239.method1821(false);
        class156.method1216(-444);
        class59.method500(true);
        class147.method1140();
        class151.method1164((byte) -94);
        class213.method1611(4);
        class55.method435((byte) 4);
        class221.method1650(arg0 ^ 0xFFFF8E7D);
        class84.method674((byte) 86);
        class4.method17(true);
        class246.method1900();
        class134.method1026(true);
        class46.method367((byte) -75);
        class350.method2467(arg0 + 999);
        class172.method1349(0);
        class300.method2152((byte) -84);
        class31.method218(arg0 ^ 0xEF2);
        class26.method166(true);
        class279.method2063(arg0 - 93);
        class182.method1435(126);
        class7.method34(16);
        class214.method1615((byte) -69);
        class66.method570(true);
        class106.method824(true);
        class94.method735((byte) 113);
        class81.method662((byte) -78);
        class21.method127(arg0 + 4014);
        class359.method2528();
        class352.method2490(-5);
        class48.method375(arg0 ^ 0xFFFFFFDA);
        class131.method1009((byte) 18);
        class336.method2345(arg0 ^ 0xFFFFEE19);
        class323.method2281(-120);
        class308.method2192(false);
        class188.method1472();
        class358.method2522((byte) 100);
        class318.method2246(11895);
        class314.method2222(2048);
        class65.method557(false);
        class261.method1995((byte) -113);
        class98.method765((byte) -66);
        class280.method2067(-4);
        class340.method2397(255);
        class108.method834();
        class168.method1308(true);
        class153.method1191();
        class71.method605(-1954419165);
        class311.method2208(-89);
        class277.method2054(29765);
        class215.method1622((byte) -89);
        class201.method1546(true);
        class272.method2041((byte) -114);
        class27.method174(0);
        class150.method1160();
        class185.method1457();
        class61.method506((byte) -3);
        class271.method2035(104);
        class319.method2257(true);
        class243.method1850(32);
        class40.method261((byte) -58);
        class6.method24(false);
        class161.method1256((byte) 61);
        class76.method634((byte) 120);
        class299.method2142();
        class209.method1582(arg0 ^ 0x1);
        class152.method1171(true);
        class338.method2379(true);
        class339.method2381(-80);
        class184.method1453(1);
        class87.method698((byte) -82);
        class232.method1788((byte) -128);
        class15.method84();
        class264.method2013(arg0 ^ 0x0);
        class130.method995(8);
        class356.method2517(arg0 + 5887);
        class107.method826();
        class30.method204();
        class249.method1920();
        class328.method2315();
        class165.method1283(arg0 ^ 0x1);
        class135.method1028(false);
        class254.method1962(221);
        class212.method1597();
        class244.method1870();
        class119.method936();
        class183.method1450((byte) -113);
        class320.method2259((byte) -107);
        class255.method1966(0);
        class204.method1562(true);
        class321.method2262(arg0 ^ 0x0);
        class354.method2506(-92);
        class170.method1320((byte) -25);
        class306.method2181((byte) 43);
        class361.method2534();
        class89.method706(-31598);
        class253.method1959(false);
        class125.method977((byte) 117);
        class187.method1470(94);
        class181.method1416(-28225);
        class335.method2340(123);
        class230.method1785((byte) -93);
        class216.method1627((byte) -29);
        class56.method443(48);
        class127.method986(-1);
        class286.method2083(true);
        class23.method153((byte) 60);
        class51.method398(150);
        class301.method2154(48);
        class154.method1204();
        class160.method1252(false);
        class173.method1355(arg0 - 28543);
        class92.method725(1371294444);
        class70.method595(false);
        class163.method1264((byte) -109);
        class325.method2289((byte) 14);
        class101.method785(-30881);
        class226.method1702(127);
        class263.method2000();
        class345.method2430(true);
        class54.method425(0);
        class324.method2288(true);
        class44.method329(1890799240);
        class211.method1590(24);
        class95.method738();
        class155.method1210();
        class109.method839(-23208);
        class137.method1037((byte) 115);
        class178.method1402(1);
        class162.method1259(14071);
        class289.method2097();
        class136.method1034();
        class326.method2294((byte) 108);
        class133.method1020((byte) 117);
        class82.method668();
        class307.method2182((byte) 93);
        class33.method227();
        class69.method591();
        class2.method6((byte) -30);
        class193.method1500((byte) 67);
        class322.method2276((byte) 97);
        class310.method2198((byte) -66);
        class3.method12(28081);
        class118.method931(arg0 ^ 0x49);
        class248.method1908((byte) 63);
        class32.method222(-2);
        class176.method1390(arg0 ^ 0xFF0001);
        class287.method2091((byte) 63);
        class245.method1874(4096);
        class24.method157(arg0 ^ 0xFFFFB49B);
        class10.method41(arg0 - 1);
        class202.method1554();
        class292.method2112((byte) 124);
        class93.method730(arg0 ^ 0xFFFFFF87);
        class180.method1412(arg0 ^ 0x36F50AF1);
        class278.method2060(false);
        class128.method987(arg0 ^ 0x7C);
        class195.method1510(false);
        class166.method1293(-108);
        class124.method971(9171);
        class236.method1812((byte) -89);
        class235.method1808((byte) -5);
        class112.method846((byte) 119);
        class50.method392((byte) -51);
        class142.method1093(1);
        class159.method1244(57);
        class75.method626((byte) -119);
        class229.method1776(43);
        class129.method991((byte) 121);
        class200.method1538((byte) -127);
        class240.method1831(125);
        class223.method1697((byte) 119);
        class123.method968((byte) 90);
        class191.method1497((byte) -64);
        class348.method2439(26097);
        class252.method1957((byte) -2);
        class34.method236(-120);
        class186.method1462(arg0 + 125);
        class309.method2194(125);
        class316.method2242(true);
        class63.method551(arg0 ^ 0x7);
        class347.method2435(-120);
        class78.method649(true);
        class113.method860(-108);
        class13.method71(-218291280);
        class330.method2324(arg0 + 2047);
        class64.method554((byte) -61);
        class102.method792((byte) 123);
        class41.method265(-29164);
        class1.method3(2);
        class313.method2217(arg0 ^ 0xFFFFFFFE);
        class206.method1574(false);
        class103.method795((byte) 119);
        class291.method2105((byte) 106);
        class231.method1787(-22137);
        class148.method1148(-4278);
        class149.method1153((byte) 59);
        class267.method2028(-28);
        class295.method2120(true);
        class138.method1040(true);
        class14.method79((byte) -73);
        class362.method2537(0);
        class360.method2531(-127);
        class77.method636(-97);
        class298.method2131(-15353);
        class317.method2244(-1);
        if (class86.field1480) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1639)
    public static final void method346() {
        class25.field306 = 0;
        for (int var0 = 0; var0 < class35.field508; var0++) {
            class288 var1 = class165.field2621[class330.field5253[var0]];
            if (var1.field3551) {
                int var2 = var1.field3577 - (var1.method1634(-1) - 1) * 64;
                int var3 = var1.field3511 - (var1.method1634(-1) - 1) * 64;
                class209 var4 = class101.method789(class186.field2991, var2 >> 7, var3 >> 7);
                if (var4 != null) {
                    long var5 = var4.field3279;
                    int var7 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
                    class220 var8;
                    if ((var5 >>> 29 & 0x3L) == 0L) {
                        var8 = class56.field924[var7];
                    } else {
                        var8 = class165.field2621[var7];
                        var7 += 2048;
                    }
                    if (!var8.field3526) {
                        class84.field1431[class25.field306] = var7;
                        class50.field792[class25.field306++] = var7;
                        var8.field3526 = true;
                    }
                    class84.field1431[class25.field306] = var7;
                    class50.field792[class25.field306++] = class330.field5253[var0] + 2048;
                }
            }
        }
        class334.method2339(0, class25.field306 - 1, (byte) -106, class84.field1431, class50.field792);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1691)
    public static final void method347() {
        boolean var0 = class241.field3979 && class345.field5501 > 200 || class345.field5501 > 50;
        for (int var1 = 0; var1 < class345.field5501; var1++) {
            class258 var2 = class56.field924[class306.field4895[var1]];
            var2.field3526 = false;
            var2.field3564 = 0;
            var2.field3548 = false;
            if (var2.method1646((byte) -7)) {
                var2.field4321 = var2.field3544 == var2.method1641(0).field1737 ? var0 : false;
                int var3;
                if (var2.field3551) {
                    var2.field3551 = false;
                    var3 = 0;
                } else {
                    var3 = 1;
                }
                if (var2.field3481 > class332.field5261) {
                    var3 += 2;
                }
                int var4 = var3 + (5 - var2.method1634(-1) << 2);
                if (class342.field5454 == 0) {
                    var4 += 32;
                } else {
                    var4 += 128;
                }
                var4 += 256;
                var2.field3510 = var4 + 1;
            } else {
                var2.field3551 = false;
                var2.field3510 = -1;
            }
        }
        for (int var5 = 0; var5 < class35.field508; var5++) {
            class288 var6 = class165.field2621[class330.field5253[var5]];
            var6.field3526 = false;
            var6.field3564 = 0;
            var6.field3548 = false;
            if (var6.method1646((byte) -7) && var6.field4692.method963((byte) 53)) {
                boolean var7 = false;
                int var8;
                if (var6.field3551) {
                    var6.field3551 = false;
                    var8 = 0;
                } else {
                    var8 = 1;
                }
                if (var6.field3481 > class332.field5261) {
                    var8 += 2;
                }
                int var9 = var8 + (5 - var6.method1634(-1) << 2);
                if (class342.field5454 == 0) {
                    if (var6.field4692.field2053) {
                        var9 += 64;
                    } else {
                        var9 += 128;
                    }
                } else if (class342.field5454 == 1) {
                    if (var6.field4692.field2053) {
                        var9 += 32;
                    } else {
                        var9 += 64;
                    }
                }
                if (var6.field4692.field2028) {
                    var9 += 512;
                } else {
                    var9 += 256;
                }
                var6.field3510 = var9 + 1;
            } else {
                var6.field3551 = false;
                var6.field3510 = -1;
            }
        }
        for (int var10 = 0; var10 < class74.field1261.length; var10++) {
            class273 var11 = class74.field1261[var10];
            if (var11 != null) {
                if (var11.field4529 == 1) {
                    class288 var12 = class165.field2621[var11.field4525];
                    if (var12 != null && var12.field3510 != -1) {
                        var12.field3510 += 1024;
                    }
                } else if (var11.field4529 == 10) {
                    class258 var13 = class56.field924[var11.field4525];
                    if (var13 != null && var13.field3510 != -1) {
                        var13.field3510 += 1024;
                    }
                }
            }
        }
        class6.field55.field3551 = false;
        class6.field55.field3526 = false;
        class6.field55.field3564 = 0;
        class6.field55.field3548 = false;
        class6.field55.field3510 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILth;)V", line = 1835)
    public static final void method348(int arg0, class57 arg1) {
        class54.field892 = class179.method1410(class172.field2752, true, arg1, 0);
        field718++;
        class240.field3964 = class179.method1410(class12.field105, true, arg1, 0);
        class238.field3928 = class179.method1410(class210.field3323, true, arg1, arg0);
        class98.field1641 = class179.method1410(class63.field1131, true, arg1, 0);
        class32.field458 = class179.method1410(class327.field5200, true, arg1, 0);
        class104.field1678 = class179.method1410(class54.field894, true, arg1, 0);
        class48.field771 = class181.method1415(-2623, arg1, 0, class190.field3050);
        class205.field3240 = class181.method1415(-2623, arg1, 0, class50.field790);
        class87.field1487 = class181.method1415(-2623, arg1, 0, class200.field3191);
        class71.field1243 = class189.method1493(-119, 0, arg1, class234.field3885);
        class34.field504 = class189.method1493(-74, 0, arg1, class116.field1938);
        class286.field4663.method1331(class34.field504, (int[]) null);
        class343.field5466.method1331(class34.field504, (int[]) null);
        class109.field1792.method1331(class34.field504, (int[]) null);
        if (class42.field607) {
            class249.field4057 = class295.method2121(class10.field82, 0, (byte) 123, arg1);
            for (int var2 = 0; var2 < class249.field4057.length; var2++) {
                class249.field4057[var2].method2403();
            }
        }
        class351 var3 = class200.method1540(arg1, class131.field2225, 0, (byte) -13);
        var3.method2474();
        if (class42.field607) {
            class156.field2469 = new class58(var3);
        } else {
            class156.field2469 = var3;
        }
        class351[] var4 = class321.method2264(-124, arg1, 0, class113.field1851);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method2474();
        }
        if (class42.field607) {
            class240.field3961 = new class17[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class240.field3961[var6] = new class58(var4[var6]);
            }
        } else {
            class240.field3961 = var4;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1904)
    public final void init() {
        field720++;
        if (!this.method687((byte) -119)) {
            return;
        }
        class307.field4898 = Integer.parseInt(this.getParameter("worldid"));
        class237.field3922 = Integer.parseInt(this.getParameter("modewhere"));
        if (class237.field3922 < 0 || class237.field3922 > 1) {
            class237.field3922 = 0;
        }
        class93.field1571 = Integer.parseInt(this.getParameter("modewhat"));
        if (class93.field1571 < 0 || class93.field1571 > 2) {
            class93.field1571 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class125.field2133 = true;
        } else {
            class125.field2133 = false;
        }
        try {
            class204.field3223 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class204.field3223 = 0;
        }
        class101.method784(class204.field3223, true);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class333.field5283 = true;
        } else {
            class333.field5283 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class350.field5564 = true;
        } else {
            class350.field5564 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class131.field2212 = 1;
        } else {
            class131.field2212 = 0;
        }
        try {
            class240.field3973 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class240.field3973 = 0;
        }
        class14.field155 = this.getParameter("settings");
        if (class14.field155 == null) {
            class14.field155 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class1.field2 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class1.field2 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class247.field4046 = true;
        } else {
            class247.field4046 = false;
        }
        class215.field3444 = this;
        this.method681(class93.field1571 + 32, 765, (byte) 121, 503, 1551);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V", line = 1988)
    private final void method349(boolean arg0, int arg1) {
        class4.field39 = null;
        if (!arg0) {
            method344((class250) null);
        }
        class251.field4255 = null;
        field726++;
        class241.field3991.field133 = arg1;
        class241.field3991.field131++;
        class163.field2581 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V", line = 2004)
    private final void method350(byte[] arg0, byte arg1) {
        if (arg1 <= 3) {
            return;
        }
        field733++;
        class227 var3 = new class227(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method1720((byte) -10);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class112.field1833 = new int[6];
                    var5[0] = var3.method1765(true);
                    var5[1] = var3.method1765(true);
                    var5[2] = var3.method1765(true);
                    var5[3] = var3.method1765(true);
                    var5[4] = var3.method1765(true);
                    var5[5] = var3.method1765(true);
                } else if (var4 == 4) {
                    int var6 = var3.method1720((byte) -111);
                    class74.field1268 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class74.field1268[var7] = var3.method1765(true);
                        if (class74.field1268[var7] == 65535) {
                            class74.field1268[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 2064)
    public final void method351(int arg0) {
        field710++;
        class304.method2171((byte) -23);
        class115.field1933 = new class353();
        class241.field3991 = new class12();
        if (class93.field1571 != 0) {
            class46.field746 = new byte[50][];
        }
        class151.method1163(-68, class128.field2163);
        if (class237.field3922 == 0) {
            class258.field4329 = this.getCodeBase().getHost();
            class354.field5624 = 443;
            class101.field1661 = 43594;
        } else if (class237.field3922 == 1) {
            class258.field4329 = this.getCodeBase().getHost();
            class101.field1661 = class307.field4898 + 40000;
            class354.field5624 = class307.field4898 + 50000;
        } else if (class237.field3922 == 2) {
            class101.field1661 = class307.field4898 + 40000;
            class354.field5624 = class307.field4898 + 50000;
            class258.field4329 = "127.0.0.1";
        }
        class194.field3096 = class258.field4329;
        int var2 = 101 % ((60 - arg0) / 43);
        class118.field1988 = class101.field1661;
        class223.field3697 = class118.field1988;
        if (class131.field2212 == 1) {
            class255.field4302 = class287.field4667;
            class336.field5316 = class46.field741;
            class167.field2657 = 0;
            class167.field2661 = 16777215;
            class41.field598 = class186.field2995;
            class195.field3104 = class215.field3446;
            class162.field2569 = true;
        } else {
            class255.field4302 = class36.field539;
            class195.field3104 = class125.field2130;
            class336.field5316 = class148.field2377;
            class41.field598 = class152.field2428;
        }
        class254.field4280 = class101.field1661;
        class76.field1324 = class354.field5624;
        if (class145.field2343 == 3 && class237.field3922 != 2) {
            class259.field4360 = class307.field4898;
        }
        class20.field227 = class267.field4480 = class1.field1 = class222.field3612 = new short[256];
        class3.method11((byte) 88);
        class92.method724(true, class151.field2402);
        class116.method908(64, class151.field2402);
        class38.field569 = class313.method2215((byte) -47);
        if (class38.field569 != null) {
            class38.field569.method109(-17223, class151.field2402);
        }
        class180.field2883 = class145.field2343;
        try {
            if (class128.field2163.field2357 != null) {
                class214.field3432 = new class233(class128.field2163.field2357, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class193.field3081[var3] = new class233(class128.field2163.field2345[var3], 6000, 0);
                }
                class201.field3202 = new class233(class128.field2163.field2351, 6000, 0);
                class340.field5430 = new class302(255, class214.field3432, class201.field3202, 500000);
                class20.field230 = new class233(class128.field2163.field2346, 24, 0);
                class128.field2163.field2346 = null;
                class128.field2163.field2351 = null;
                class128.field2163.field2357 = null;
                class128.field2163.field2345 = null;
            }
        } catch (IOException var5) {
            class20.field230 = null;
            class340.field5430 = null;
            class214.field3432 = null;
            class201.field3202 = null;
        }
        if (class131.field2212 == 0) {
            class235.field3907 = class160.field2548;
        } else if (class131.field2212 == 1) {
            class235.field3907 = class300.field4841;
        }
        if (class237.field3922 != 0) {
            class16.field185 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 2191)
    public static final void method352(int arg0, int arg1) {
        class317.field5061.method2334(4, arg1);
        class221.field3587.method2334(4, arg1);
        if (arg0 != 15194) {
            method336((class250) null);
        }
        class323.field5150.method2334(4, arg1);
        field724++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2205)
    public static final void method353() {
        for (int var0 = 0; var0 < 104; var0++) {
            int[] var1 = class308.field4912[var0];
            for (int var2 = 0; var2 < 104; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 2224)
    public final void method354(boolean arg0) {
        field712++;
        if (class259.field4362 == 1000) {
            return;
        }
        if (!arg0) {
            field728 = (String[]) null;
        }
        long var2 = class163.method1262((byte) 125) / 1000000L - class345.field5493;
        class345.field5493 = class163.method1262((byte) 125) / 1000000L;
        boolean var4 = class166.method1294(-10);
        if (var4 && class32.field461 && class65.field1152 != null) {
            class65.field1152.method1518(-31008);
        }
        if ((class259.field4362 == 30 || class259.field4362 == 10) && (class64.field1135 || class89.field1500 != 0L && class89.field1500 < class47.method371(59))) {
            class272.method2043(class275.method2052((byte) -115), class231.field3837, class137.field2274, class64.field1135, -1);
        }
        if (class89.field1502 == null) {
            Container var5;
            if (class89.field1502 != null) {
                var5 = class89.field1502;
            } else if (class241.field3994 == null) {
                var5 = class128.field2163.field2350;
            } else {
                var5 = class241.field3994;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class241.field3994 == var5) {
                Insets var8 = class241.field3994.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class117.field1969 != var6 || class129.field2188 != var7) {
                if (class145.field2360.startsWith("mac")) {
                    class129.field2188 = var7;
                    class117.field1969 = var6;
                } else {
                    class304.method2171((byte) -23);
                }
                class89.field1500 = class47.method371(-121) + 500L;
            }
        }
        boolean var9 = false;
        if (class89.field1502 != null && !class59.field1020 && (class259.field4362 == 30 || class259.field4362 == 10)) {
            class272.method2043(class267.field4462, -1, -1, false, -1);
        }
        if (class257.field4313) {
            class257.field4313 = false;
            var9 = true;
        }
        if (var9) {
            class143.method1098(48);
        }
        if (class42.field607) {
            for (int var10 = 0; var10 < 100; var10++) {
                class270.field4498[var10] = true;
            }
        }
        if (class259.field4362 == 0) {
            class76.method629(-100, var9, class285.field4657, (Color) null, class323.field5152);
        } else if (class259.field4362 == 5) {
            class352.method2486(class109.field1792, false, 2);
        } else if (class259.field4362 == 10) {
            class196.method1519((byte) 33);
        } else if (class259.field4362 == 25 || class259.field4362 == 28) {
            if (class255.field4301 == 1) {
                if (class27.field323 < class149.field2382) {
                    class27.field323 = class149.field2382;
                }
                int var12 = (class27.field323 - class149.field2382) * 50 / class27.field323;
                class63.method552(class148.field2373 + "<br>(" + var12 + "%)", false, 113);
            } else if (class255.field4301 == 2) {
                if (class27.field327 > class204.field3227) {
                    class204.field3227 = class27.field327;
                }
                int var11 = (class204.field3227 - class27.field327) * 50 / class204.field3227 + 50;
                class63.method552(class148.field2373 + "<br>(" + var11 + "%)", false, 126);
            } else {
                class63.method552(class148.field2373, false, -84);
            }
        } else if (class259.field4362 == 30) {
            class271.method2038(var2, -25462);
        } else if (class259.field4362 == 40) {
            class63.method552(class102.field1662 + "<br>" + class169.field2693, false, 79);
        }
        if (class42.field607 && class259.field4362 != 0) {
            class42.method296();
            for (int var13 = 0; var13 < class183.field2955; var13++) {
                class12.field115[var13] = false;
            }
        } else if ((class259.field4362 == 30 || class259.field4362 == 10) && class296.field4764 == 0 && !var9) {
            try {
                Graphics var17 = class151.field2402.getGraphics();
                for (int var18 = 0; var18 < class183.field2955; var18++) {
                    if (class12.field115[var18]) {
                        class292.field4728.method571(var17, class78.field1349[var18], class54.field895[var18], class222.field3637[var18], class358.field5685[var18], (byte) -84);
                        class12.field115[var18] = false;
                    }
                }
            } catch (Exception var20) {
                class151.field2402.repaint();
            }
        } else if (class259.field4362 != 0) {
            try {
                Graphics var14 = class151.field2402.getGraphics();
                class292.field4728.method572(0, 0, (byte) -124, var14);
                for (int var15 = 0; var15 < class183.field2955; var15++) {
                    class12.field115[var15] = false;
                }
            } catch (Exception var21) {
                class151.field2402.repaint();
            }
        }
        if (class156.field2471) {
            class21.method124((byte) -126);
        }
        if (class257.field4304 && class259.field4362 == 10 && class304.field4870 != -1) {
            class257.field4304 = false;
            class16.method87(class128.field2163, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V", line = 2459)
    public static void method355(boolean arg0) {
        field715 = null;
        if (!arg0) {
            field715 = (class57) null;
        }
        field728 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2471)
    public static final void method356() {
        for (int var0 = -1; var0 < class35.field508 + class345.field5501; var0++) {
            class220 var1;
            if (var0 < 0) {
                var1 = class6.field55;
            } else if (var0 < class345.field5501) {
                var1 = class56.field924[class306.field4895[var0]];
            } else {
                var1 = class165.field2621[class330.field5253[var0 - class345.field5501]];
            }
            if (var1.field3510 >= 0) {
                int var2 = var1.method1634(-1);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field3577 & 0x7F) != 0 || (var1.field3511 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field3577 & 0x7F) != 64 || (var1.field3511 & 0x7F) != 64) {
                    continue;
                }
                var1.field3551 = true;
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field3577 >> 7;
                    int var4 = var1.field3511 >> 7;
                    if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104 && var1.field3510 >= class308.field4912[var3][var4]) {
                        if (var1.field3510 > class308.field4912[var3][var4]) {
                            class308.field4912[var3][var4] = var1.field3510;
                            class295.field4752[var3][var4] = 1;
                        } else {
                            var10002 = class295.field4752[var3][var4]++;
                        }
                    }
                } else {
                    int var5 = var1.field3577 - var2 * 64 >> 7;
                    int var6 = var1.field3511 - var2 * 64 >> 7;
                    int var7 = var5 + var1.method1634(-1);
                    int var8 = var6 + var1.method1634(-1);
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var7 > 104) {
                        var7 = 104;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8 > 104) {
                        var8 = 104;
                    }
                    for (int var9 = var5; var9 < var7; var9++) {
                        for (int var10 = var6; var10 < var8; var10++) {
                            if (var1.field3510 > class308.field4912[var9][var10]) {
                                class308.field4912[var9][var10] = var1.field3510;
                                class295.field4752[var9][var10] = 1;
                            } else if (class308.field4912[var9][var10] == var1.field3510) {
                                var10002 = class295.field4752[var9][var10]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 2580)
    public final void method357(boolean arg0) {
        if (class42.field607) {
            class42.method310();
        }
        if (class89.field1502 != null) {
            class169.method1317((byte) -7, class89.field1502, class128.field2163);
            class89.field1502 = null;
        }
        if (class325.field5170 != null) {
            class325.field5170.field2093 = false;
        }
        class325.field5170 = null;
        if (class342.field5449 != null) {
            class342.field5449.method916((byte) 123);
            class342.field5449 = null;
        }
        field734++;
        class121.method957(0, class151.field2402);
        class102.method794(arg0, class151.field2402);
        if (class38.field569 != null) {
            class38.field569.method111(class151.field2402, false);
        }
        class313.method2218(-27417);
        class14.method81(arg0);
        class38.field569 = null;
        if (class65.field1152 != null) {
            class65.field1152.method1512((byte) 17);
        }
        if (class260.field4374 != null) {
            class260.field4374.method1512((byte) 20);
        }
        class241.field3991.method68((byte) 90);
        class115.field1933.method2501(16711935);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLth;IILth;)Lpd;", line = 2625)
    public static final class290 method358(byte arg0, class57 arg1, int arg2, int arg3, class57 arg4) {
        field727++;
        int var5 = -33 / ((-arg0 - 5) / 47);
        return class315.method2233(arg3, (byte) 111, arg4, arg2) ? class261.method1994(65, arg1.method472(arg3, 43, arg2)) : null;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2639)
    private final void method359(int arg0) {
        field723++;
        if (!class257.field4304) {
            label246: while (true) {
                do {
                    if (!class283.method2077(672048140)) {
                        break label246;
                    }
                } while (class333.field5286 != 's' && class333.field5286 != 'S');
                class257.field4304 = true;
            }
        }
        if (class20.field232 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class47.method371(58);
            if (class267.field4481 == 0L) {
                class267.field4481 = var28;
            }
            if (var27 > 16384 && var28 - class267.field4481 < 5000L) {
                if ((var28 - class166.field2650) > 1000L) {
                    System.gc();
                    class166.field2650 = var28;
                }
                class323.field5152 = 5;
                class285.field4657 = class278.field4579;
            } else {
                class323.field5152 = 5;
                class285.field4657 = class204.field3228;
                class20.field232 = 10;
            }
        } else if (class20.field232 == 10) {
            for (int var25 = 0; var25 < 4; var25++) {
                class32.field459[var25] = new class22(104, 104);
            }
            class323.field5152 = 10;
            class285.field4657 = class54.field901;
            class20.field232 = 30;
        } else if (class20.field232 == 30) {
            if (class233.field3880 == null) {
                class233.field3880 = new class251(class241.field3991, class115.field1933);
            }
            if (class233.field3880.method1948(false)) {
                class70.field1217 = class104.method806(true, (byte) -49, true, 0, false);
                class327.field5203 = class104.method806(true, (byte) -49, true, 1, false);
                class222.field3677 = class104.method806(false, (byte) -49, true, 2, true);
                class45.field703 = class104.method806(true, (byte) -49, true, 3, false);
                class220.field3557 = class104.method806(true, (byte) -49, true, 4, false);
                class340.field5425 = class104.method806(true, (byte) -49, true, 5, true);
                class355.field5641 = class104.method806(true, (byte) -49, false, 6, true);
                class22.field251 = class104.method806(true, (byte) -49, true, 7, false);
                class76.field1305 = class104.method806(true, (byte) -49, true, 8, false);
                class3.field17 = class104.method806(true, (byte) -49, true, 9, false);
                class156.field2474 = class104.method806(true, (byte) -49, true, 10, false);
                class84.field1429 = class104.method806(true, (byte) -49, true, 11, false);
                class131.field2224 = class104.method806(true, (byte) -49, true, 12, false);
                class44.field694 = class104.method806(true, (byte) -49, true, 13, false);
                class274.field4538 = class104.method806(true, (byte) -49, false, 14, false);
                class2.field9 = class104.method806(true, (byte) -49, true, 15, false);
                class300.field4840 = class104.method806(true, (byte) -49, true, 16, false);
                class223.field3696 = class104.method806(true, (byte) -49, true, 17, false);
                class90.field1546 = class104.method806(true, (byte) -49, true, 18, false);
                class279.field4598 = class104.method806(true, (byte) -49, true, 19, false);
                class222.field3670 = class104.method806(true, (byte) -49, true, 20, false);
                class36.field522 = class104.method806(true, (byte) -49, true, 21, false);
                class235.field3901 = class104.method806(true, (byte) -49, true, 22, false);
                class241.field3992 = class104.method806(true, (byte) -49, true, 23, true);
                class112.field1828 = class104.method806(true, (byte) -49, true, 24, false);
                class360.field5704 = class104.method806(true, (byte) -49, true, 25, false);
                class330.field5255 = class104.method806(true, (byte) -49, true, 26, true);
                class248.field4050 = class104.method806(true, (byte) -49, true, 27, false);
                class273.field4528 = class104.method806(true, (byte) -49, true, 28, true);
                class323.field5152 = 15;
                class20.field232 = 40;
                class285.field4657 = class258.field4346;
            } else {
                class285.field4657 = class117.field1981;
                class323.field5152 = 12;
            }
        } else if (class20.field232 == 40) {
            int var2 = 0;
            for (int var3 = 0; var3 < 29; var3++) {
                var2 += class261.field4402[var3].method707(2535) * class24.field298[var3] / 100;
            }
            if (var2 == 100) {
                class285.field4657 = class124.field2124;
                class323.field5152 = 20;
                class164.method1272(3017388, class76.field1305);
                class285.method2080(23254, class76.field1305);
                class206.method1571(-7784, class76.field1305);
                class20.field232 = 41;
            } else {
                class323.field5152 = 20;
                if (var2 != 0) {
                    class285.field4657 = class350.field5562 + var2 + "%";
                }
            }
        } else if (class20.field232 == 41) {
            if (class273.field4528.method468((byte) 105)) {
                this.method350(class273.field4528.method476((byte) -7, 1), (byte) 87);
                class323.field5152 = 25;
                class285.field4657 = class251.field4243;
                class20.field232 = 45;
            } else {
                class285.field4657 = class135.field2257 + class273.field4528.method456(-1) + "%";
                class323.field5152 = 25;
            }
        } else if (class20.field232 == 45) {
            class165.method1285(2, 22050, class248.field4052, 104);
            class79.field1364 = new class222();
            class79.field1364.method1661(9, -23146, 128);
            class65.field1152 = class340.method2388(0, class128.field2163, 22050, (byte) -87, class151.field2402);
            class65.field1152.method1515(class79.field1364, 101);
            class142.method1091(class2.field9, class79.field1364, 0, class220.field3557, class274.field4538);
            class260.field4374 = class340.method2388(1, class128.field2163, 2048, (byte) -87, class151.field2402);
            class245.field4030 = new class303();
            class260.field4374.method1515(class245.field4030, -124);
            class320.field5092 = new class73(22050, class227.field3788);
            class326.field5187 = class355.field5641.method483(-1, "scape main");
            class285.field4657 = class271.field4505;
            class20.field232 = 50;
            class323.field5152 = 30;
        } else if (class20.field232 == 50) {
            int var23 = class233.method1801(88, class76.field1305, class44.field694);
            int var24 = class327.method2310((byte) -123);
            if (var23 < var24) {
                class323.field5152 = 35;
                class285.field4657 = class11.field93 + var23 * 100 / var24 + "%";
            } else {
                class20.field232 = 60;
                class285.field4657 = class65.field1161;
                class323.field5152 = 35;
            }
        } else if (class20.field232 == 60) {
            int var21 = class205.method1564(0, class76.field1305);
            int var22 = class258.method1980(false);
            if (var21 >= var22) {
                class285.field4657 = class245.field4017;
                class323.field5152 = 40;
                class20.field232 = 65;
            } else {
                class285.field4657 = class211.field3373 + var21 * 100 / var22 + "%";
                class323.field5152 = 40;
            }
        } else if (class20.field232 == 65) {
            class176.method1387((byte) 100, class76.field1305, class44.field694);
            class323.field5152 = 45;
            class285.field4657 = class324.field5159;
            class22.method143(-29, 5);
            class20.field232 = 70;
        } else if (class20.field232 == 70) {
            class222.field3677.method468((byte) 105);
            byte var4 = 0;
            int var5 = var4 + class222.field3677.method456(-1);
            class300.field4840.method468((byte) 105);
            int var6 = var5 + class300.field4840.method456(-1);
            class223.field3696.method468((byte) 105);
            int var7 = var6 + class223.field3696.method456(-1);
            class90.field1546.method468((byte) 105);
            int var8 = var7 + class90.field1546.method456(-1);
            class279.field4598.method468((byte) 105);
            int var9 = var8 + class279.field4598.method456(-1);
            class222.field3670.method468((byte) 105);
            int var10 = var9 + class222.field3670.method456(-1);
            class36.field522.method468((byte) 105);
            int var11 = var10 + class36.field522.method456(-1);
            class235.field3901.method468((byte) 105);
            int var12 = var11 + class235.field3901.method456(-1);
            class112.field1828.method468((byte) 105);
            int var13 = var12 + class112.field1828.method456(-1);
            class360.field5704.method468((byte) 105);
            int var14 = var13 + class360.field5704.method456(-1);
            class248.field4050.method468((byte) 105);
            int var15 = var14 + class248.field4050.method456(-1);
            if (var15 >= 1100) {
                class164.method1280(-23734, class222.field3677);
                method337(class222.field3677, 123);
                class294.method2119((byte) -69, class222.field3677);
                class222.method1689((byte) 122, class222.field3677, class22.field251);
                class113.method859(class300.field4840, false, class22.field251, true);
                class182.method1433(0, class90.field1546, class22.field251, true);
                class49.method384(-1, class258.field4354, class279.field4598, true, class22.field251);
                class308.method2190(class222.field3677, -73);
                class169.method1314(class222.field3670, class70.field1217, 2, class327.field5203);
                class340.method2387(class222.field3677, 0);
                class29.method187(class22.field251, 103, class36.field522);
                class287.method2085(class235.field3901, (byte) 108);
                class135.method1031(-801, class222.field3677);
                class348.method2437(class45.field703, class76.field1305, class22.field251, class44.field694, false);
                class61.method505(class222.field3677, -355);
                method341(class223.field3696, (byte) 100);
                class243.method1852(new class336(), class112.field1828, (byte) -125, class360.field5704);
                class231.method1786((byte) -48, class112.field1828, class360.field5704);
                class131.method1005(class222.field3677, (byte) -104);
                class354.method2504(class222.field3677, -31);
                class215.method1623((byte) 99, class222.field3677);
                class74.method618(false, class76.field1305, class222.field3677);
                class152.method1173(false, class222.field3677, class76.field1305);
                class275.method2051(true, class76.field1305, class222.field3677);
                class323.field5152 = 50;
                class285.field4657 = class140.field2301;
                class175.method1381((byte) 115);
                class20.field232 = 80;
            } else {
                class323.field5152 = 50;
                class285.field4657 = class325.field5162 + var15 / 11 + "%";
            }
        } else if (class20.field232 == 80) {
            int var19 = class51.method394(0, class76.field1305);
            int var20 = class48.method382((byte) 47);
            if (var19 >= var20) {
                method348(0, class76.field1305);
                class323.field5152 = 60;
                class285.field4657 = class206.field3249;
                class20.field232 = 90;
            } else {
                class323.field5152 = 60;
                class285.field4657 = class350.field5570 + var19 * 100 / var20 + "%";
            }
        } else if (class20.field232 != 90) {
            if (arg0 < 68) {
                field715 = (class57) null;
            }
            if (class20.field232 == 100) {
                if (class140.method1084(-31, class76.field1305)) {
                    class20.field232 = 110;
                }
            } else if (class20.field232 == 110) {
                class325.field5170 = new class122();
                class128.field2163.method1114((byte) 97, 10, class325.field5170);
                class323.field5152 = 75;
                class285.field4657 = class298.field4781;
                class20.field232 = 120;
            } else if (class20.field232 == 120) {
                if (class156.field2474.method488("", "huffman", 116)) {
                    class71 var17 = new class71(class156.field2474.method467((byte) -94, "huffman", ""));
                    class326.method2296(2048, var17);
                    class285.field4657 = class313.field4972;
                    class323.field5152 = 80;
                    class20.field232 = 130;
                } else {
                    class323.field5152 = 80;
                    class285.field4657 = class152.field2411 + "0%";
                }
            } else if (class20.field232 == 130) {
                if (!class45.field703.method468((byte) 105)) {
                    class285.field4657 = class7.field67 + class45.field703.method456(-1) * 3 / 4 + "%";
                    class323.field5152 = 85;
                } else if (!class131.field2224.method468((byte) 105)) {
                    class285.field4657 = class7.field67 + ((class131.field2224.method456(-1) / 10) + 75) + "%";
                    class323.field5152 = 85;
                } else if (!class44.field694.method468((byte) 105)) {
                    class285.field4657 = class7.field67 + ((class44.field694.method456(-1) / 20) + 85) + "%";
                    class323.field5152 = 85;
                } else if (class241.field3992.method475(125, "details")) {
                    class174.method1367(class241.field3992);
                    class158.method1241(class248.field4050);
                    class359.method2526(class22.field251);
                    class285.field4657 = class213.field3396;
                    class20.field232 = 135;
                    class323.field5152 = 95;
                } else {
                    class285.field4657 = class7.field67 + ((class241.field3992.method480(-3800, "details") / 10) + 90) + "%";
                    class323.field5152 = 85;
                }
            } else if (class20.field232 == 135) {
                int var16 = class129.method990(true);
                if (var16 == -1) {
                    class285.field4657 = class322.field5131;
                    class323.field5152 = 95;
                } else if (var16 == 7 || var16 == 9) {
                    this.method682("worldlistfull", 25806);
                    class22.method143(-29, 1000);
                } else if (class56.field919) {
                    class20.field232 = 140;
                    class323.field5152 = 96;
                    class285.field4657 = class2.field15;
                } else {
                    this.method682("worldlistio_" + var16, 25806);
                    class22.method143(-29, 1000);
                }
            } else if (class20.field232 == 140) {
                class205.field3236 = class45.field703.method483(-1, "loginscreen");
                class340.field5425.method471(0, true, false);
                class355.field5641.method471(0, true, true);
                class76.field1305.method471(0, true, true);
                class44.field694.method471(0, true, true);
                class156.field2474.method471(0, true, true);
                class45.field703.method471(0, true, true);
                class285.field4657 = class138.field2277;
                class156.field2471 = true;
                class20.field232 = 150;
                class323.field5152 = 97;
            } else if (class20.field232 == 150) {
                class150.method1158();
                if (class257.field4304) {
                    class267.field4482 = 0;
                    class267.field4462 = 0;
                    class127.field2147 = 0;
                    class340.field5436 = 0;
                }
                class257.field4304 = true;
                class16.method87(class128.field2163, (byte) -64);
                class272.method2043(class267.field4462, -1, -1, false, -1);
                class323.field5152 = 100;
                class285.field4657 = class163.field2577;
                class20.field232 = 160;
            } else if (class20.field232 == 160) {
                class319.method2253(true, -311578841);
            }
        } else if (class330.field5255.method468((byte) 105)) {
            class98 var18 = new class98(class3.field17, class330.field5255, class76.field1305, 20, !class44.field690);
            class153.method1189(var18);
            if (class166.field2649 == 1) {
                class153.method1181(0.9F);
            }
            if (class166.field2649 == 2) {
                class153.method1181(0.8F);
            }
            if (class166.field2649 == 3) {
                class153.method1181(0.7F);
            }
            if (class166.field2649 == 4) {
                class153.method1181(0.6F);
            }
            class20.field232 = 100;
            class323.field5152 = 70;
            class285.field4657 = class76.field1321;
        } else {
            class285.field4657 = class131.field2234 + class330.field5255.method456(-1) + "%";
            class323.field5152 = 70;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILhd;JLhd;Lhd;)V", line = 3162)
    public static final void method360(int arg0, int arg1, int arg2, int arg3, class161 arg4, long arg5, class161 arg6, class161 arg7) {
        class87 var9 = new class87();
        var9.field1483 = arg4;
        var9.field1493 = arg1 * 128 + 64;
        var9.field1491 = arg2 * 128 + 64;
        var9.field1486 = arg3;
        var9.field1496 = arg5;
        var9.field1488 = arg6;
        var9.field1494 = arg7;
        int var10 = 0;
        class36 var11 = class129.field2184[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field531; var12++) {
                class209 var13 = var11.field544[var12];
                if ((var13.field3279 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3287.method444();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1489 = -var10;
        if (class129.field2184[arg0][arg1][arg2] == null) {
            class129.field2184[arg0][arg1][arg2] = new class36(arg0, arg1, arg2);
        }
        class129.field2184[arg0][arg1][arg2].field538 = var9;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 3210)
    public static final void method361() {
        label139: for (int var0 = -1; var0 < class35.field508 + class345.field5501; var0++) {
            class220 var1;
            long var2;
            if (var0 < 0) {
                var1 = class6.field55;
                var2 = 8791798054912L;
            } else if (var0 < class345.field5501) {
                int var4 = class306.field4895[var0];
                var1 = class56.field924[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class330.field5253[var0 - class345.field5501];
                class288 var6 = class165.field2621[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field4692.field2036) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field3510 >= 0) {
                int var7 = var1.method1634(-1);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field3577 & 0x7F) != 0 || (var1.field3511 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field3577 & 0x7F) != 64 || (var1.field3511 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var7 == 1) {
                    int var8 = var1.field3577 >> 7;
                    int var9 = var1.field3511 >> 7;
                    if (var8 < 0 || var8 >= 104 || var9 < 0 || var9 >= 104 || class308.field4912[var8][var9] != var1.field3510) {
                        continue;
                    }
                    if (class295.field4752[var8][var9] > 1) {
                        var10002 = class295.field4752[var8][var9]--;
                        continue;
                    }
                } else {
                    int var10 = var1.field3577 - var7 * 64 >> 7;
                    int var11 = var1.field3511 - var7 * 64 >> 7;
                    int var12 = var7 + var10;
                    int var13 = var7 + var11;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    boolean var14 = true;
                    label132: for (int var15 = var10; var15 < var12; var15++) {
                        for (int var16 = var11; var16 < var13; var16++) {
                            if (class308.field4912[var15][var16] == var1.field3510 && class295.field4752[var15][var16] <= 1) {
                                var14 = false;
                                break label132;
                            }
                        }
                    }
                    if (var14) {
                        int var17 = var10;
                        while (true) {
                            if (var17 >= var12) {
                                continue label139;
                            }
                            for (int var18 = var11; var18 < var13; var18++) {
                                if (class308.field4912[var17][var18] == var1.field3510) {
                                    var10002 = class295.field4752[var17][var18]--;
                                }
                            }
                            var17++;
                        }
                    }
                }
                if (var1 instanceof class258 && var1.field3478 != null && class332.field5261 >= var1.field3486 && class332.field5261 < var1.field3523) {
                    ((class258) var1).field4321 = false;
                    var1.field3551 = false;
                    var1.field3526 = false;
                    var1.field3504 = class271.method2034(-1, var1.field3511, var1.field3577, class186.field2991);
                    class152.method1170(class186.field2991, var1.field3577, var1.field3511, var1.field3504, var1, var1.field3477, var2, var1.field3574, var1.field3485, var1.field3505, var1.field3513);
                } else {
                    var1.field3551 = false;
                    var1.field3526 = false;
                    var1.field3504 = class271.method2034(-1, var1.field3511, var1.field3577, class186.field2991);
                    class65.method561(class186.field2991, var1.field3577, var1.field3511, var1.field3504, (var7 - 1) * 64 + 60, var1, var1.field3477, var2, var1.field3546);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwf;)Z", line = 3373)
    public static final boolean method362(class250 arg0) {
        if (class178.field2857) {
            if (method336(arg0).field1710 != 0) {
                return false;
            }
            if (arg0.field4078 == 0) {
                return false;
            }
        }
        return arg0.field4130;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 3388)
    public static final void method363() {
        for (int var0 = -1; var0 < class35.field508 + class345.field5501; var0++) {
            class220 var1;
            long var2;
            if (var0 < 0) {
                var1 = class6.field55;
                var2 = 8791798054912L;
            } else if (var0 < class345.field5501) {
                int var4 = class306.field4895[var0];
                var1 = class56.field924[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class330.field5253[var0 - class345.field5501];
                class288 var6 = class165.field2621[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field4692.field2036) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field3510 >= 0) {
                int var7 = var1.method1634(-1);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field3577 & 0x7F) == 0 && (var1.field3511 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var1.field3577 & 0x7F) == 64 && (var1.field3511 & 0x7F) == 64) {
                    continue;
                }
                if (var1 instanceof class258 && var1.field3478 != null && class332.field5261 >= var1.field3486 && class332.field5261 < var1.field3523) {
                    ((class258) var1).field4321 = false;
                    var1.field3551 = false;
                    var1.field3526 = false;
                    var1.field3504 = class271.method2034(-1, var1.field3511, var1.field3577, class186.field2991);
                    class152.method1170(class186.field2991, var1.field3577, var1.field3511, var1.field3504, var1, var1.field3477, var2, var1.field3574, var1.field3485, var1.field3505, var1.field3513);
                } else {
                    var1.field3551 = false;
                    var1.field3526 = false;
                    var1.field3504 = class271.method2034(-1, var1.field3511, var1.field3577, class186.field2991);
                    class65.method561(class186.field2991, var1.field3577, var1.field3511, var1.field3504, (var7 - 1) * 64 + 60, var1, var1.field3477, var2, var1.field3546);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 3461)
    private final void method364(byte arg0) {
        field709++;
        if (arg0 > -110) {
            return;
        }
        if (class210.field3316 < class241.field3991.field131) {
            if (class254.field4280 == class223.field3697) {
                class223.field3697 = class76.field1324;
            } else {
                class223.field3697 = class254.field4280;
            }
            class306.field4893 = (class241.field3991.field131 * 50 - 50) * 5;
            if (class306.field4893 > 3000) {
                class306.field4893 = 3000;
            }
            if (class241.field3991.field131 >= 2 && class241.field3991.field133 == 6) {
                this.method682("js5connect_outofdate", 25806);
                class259.field4362 = 1000;
                return;
            }
            if (class241.field3991.field131 >= 4 && class241.field3991.field133 == -1) {
                this.method682("js5crc", 25806);
                class259.field4362 = 1000;
                return;
            }
            if (class241.field3991.field131 >= 4 && (class259.field4362 == 0 || class259.field4362 == 5)) {
                if (class241.field3991.field133 == 7 || class241.field3991.field133 == 9) {
                    this.method682("js5connect_full", 25806);
                } else if (class241.field3991.field133 > 0) {
                    this.method682("js5connect", 25806);
                } else {
                    this.method682("js5io", 25806);
                }
                class259.field4362 = 1000;
                return;
            }
        }
        class210.field3316 = class241.field3991.field131;
        if (class306.field4893 > 0) {
            class306.field4893--;
            return;
        }
        try {
            if (class163.field2581 == 0) {
                class251.field4255 = class128.field2163.method1124(class194.field3096, 106, class223.field3697);
                class163.field2581++;
            }
            if (class163.field2581 == 1) {
                if (class251.field4255.field3064 == 2) {
                    this.method349(true, 1000);
                    return;
                }
                if (class251.field4255.field3064 == 1) {
                    class163.field2581++;
                }
            }
            if (class163.field2581 == 2) {
                class4.field39 = new class117((Socket) class251.field4255.field3066, class128.field2163);
                class227 var2 = new class227(5);
                var2.method1712(15, -128);
                var2.method1757(551, -111);
                class4.field39.method924(0, var2.field3793, 5, 122);
                class163.field2581++;
                class172.field2753 = class47.method371(101);
            }
            if (class163.field2581 == 3) {
                if (class259.field4362 == 0 || class259.field4362 == 5 || class4.field39.method926(0) > 0) {
                    int var3 = class4.field39.method918(0);
                    if (var3 != 0) {
                        this.method349(true, var3);
                        return;
                    }
                    class163.field2581++;
                } else if ((class47.method371(74) - class172.field2753) > 30000L) {
                    this.method349(true, 1001);
                    return;
                }
            }
            if (class163.field2581 == 4) {
                boolean var4 = class259.field4362 == 5 || class259.field4362 == 10 || class259.field4362 == 28;
                class241.field3991.method57(class4.field39, 4, !var4);
                class251.field4255 = null;
                class163.field2581 = 0;
                class4.field39 = null;
            }
        } catch (IOException var6) {
            this.method349(true, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 3605)
    public final void method365(int arg0) {
        field730++;
        if (class259.field4362 == 1000) {
            return;
        }
        class332.field5261++;
        if (class332.field5261 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class250.field4163 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class204.field3221.setSeed((long) class250.field4163);
        }
        this.method339((byte) 87);
        if (class233.field3880 != null) {
            class233.field3880.method1951(4);
        }
        class17.method97(402714629);
        class195.method1506(false);
        if (arg0 != 17189) {
            method362((class250) null);
        }
        class313.method2216(1);
        class297.method2128(-1);
        if (class42.field607) {
            class199.method1534();
        }
        if (class38.field569 != null) {
            int var3 = class38.field569.method106(128);
            class204.field3226 = var3;
        }
        if (class259.field4362 == 0) {
            this.method359(arg0 - 17105);
            class348.method2440(arg0 ^ 0x431E);
        } else if (class259.field4362 == 5) {
            this.method359(119);
            class348.method2440(79);
        } else if (class259.field4362 == 25 || class259.field4362 == 28) {
            class271.method2037(arg0 - 17189);
        }
        if (class259.field4362 == 10) {
            this.method338((byte) 118);
            class236.method1810(-1);
            method340(true);
            class298.method2135(-102);
        } else if (class259.field4362 == 30) {
            class227.method1710((byte) 117);
        } else if (class259.field4362 == 40) {
            class298.method2135(-114);
            if (class46.field736 != -3) {
                if (class46.field736 == 15) {
                    class319.method2254((byte) -52);
                } else if (class46.field736 != 2) {
                    class74.method620((byte) -114);
                }
            }
        }
    }
}
