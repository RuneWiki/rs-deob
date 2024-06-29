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
public class client extends class108 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Ljava/lang/String;")
    public static String field4581 = "scroll:";

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    private static int field4589 = 0;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field4592 = "Loading title screen - ";

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4594 = -2;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    public static int[] field4587 = new int[14];

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 4)
    private final void method1984(byte arg0) {
        field4596++;
        boolean var2 = class90.field1608.method2473(true);
        int var3 = -49 % ((arg0 + 85) / 38);
        if (!var2) {
            this.method1996((byte) 57);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 21)
    public static final void method1985() {
        for (int var0 = -1; var0 < class255.field4184 + class252.field4144; var0++) {
            class6 var1;
            long var2;
            if (var0 < 0) {
                var1 = class96.field1750;
                var2 = 8791798054912L;
            } else if (var0 < class252.field4144) {
                int var4 = class22.field556[var0];
                var1 = class182.field3151[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class23.field570[var0 - class252.field4144];
                class314 var6 = class149.field2533[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field5107.field1582) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field123 < 0) {
                var1.field193 = false;
            } else {
                var1.field222 = -1;
                int var7 = var1.method49((byte) -72);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field199 & 0x7F) != 0 || (var1.field213 & 0x7F) != 0) {
                        var1.field193 = false;
                        continue;
                    }
                } else if ((var1.field199 & 0x7F) != 64 || (var1.field213 & 0x7F) != 64) {
                    var1.field193 = false;
                    continue;
                }
                int var10002;
                if (var7 == 1) {
                    int var8 = var1.field199 >> 7;
                    int var9 = var1.field213 >> 7;
                    if (var8 < 0 || var8 >= 104 || var9 < 0 || var9 >= 104) {
                        var1.field193 = true;
                        continue;
                    }
                    if (class316.field5140[var8][var9] != var1.field123) {
                        var1.field193 = true;
                        continue;
                    }
                    if (class31.field710[var8][var9] > 1) {
                        var10002 = class31.field710[var8][var9]--;
                        var1.field193 = true;
                        continue;
                    }
                } else {
                    int var10 = var1.field199 - var7 * 64 >> 7;
                    int var11 = var1.field213 - var7 * 64 >> 7;
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
                    if (!class144.method982(var12, var13, var10, var11, var1.field123, (byte) -95)) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            for (int var15 = var11; var15 < var13; var15++) {
                                if (class316.field5140[var14][var15] == var1.field123) {
                                    var10002 = class31.field710[var14][var15]--;
                                }
                            }
                        }
                        var1.field193 = true;
                        continue;
                    }
                }
                if (var1 instanceof class98 && var1.field141 != null && class267.field4371 >= var1.field143 && class267.field4371 < var1.field200) {
                    ((class98) var1).field1801 = false;
                    var1.field193 = false;
                    var1.field136 = class21.method189((byte) 48, var1.field213, var1.field199, class276.field4506);
                    class73.method558(class276.field4506, var1.field199, var1.field213, var1.field136, var1, var1.field216, var2, var1.field129, var1.field116, var1.field223, var1.field176);
                } else {
                    var1.field193 = false;
                    var1.field136 = class21.method189((byte) -112, var1.field213, var1.field199, class276.field4506);
                    class198.method1350(class276.field4506, var1.field199, var1.field213, var1.field136, (var7 - 1) * 64 + 60, var1, var1.field216, var2, var1.field189);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 176)
    public static void method1986(int arg0) {
        field4592 = null;
        field4587 = null;
        if (arg0 == 0) {
            field4581 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lg;)Z", line = 190)
    public static final boolean method1987(class181 arg0) {
        if (class323.field5230) {
            if (method1990(arg0).field5380 != 0) {
                return false;
            }
            if (arg0.field3098 == 0) {
                return false;
            }
        }
        return arg0.field3116;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 205)
    public final void method804(int arg0) {
        class21.method190((byte) -59);
        if (arg0 != -10002) {
            field4594 = 119;
        }
        field4588++;
        class231.field3793 = new class287();
        class90.field1608 = new class347();
        if (class217.field3620 != 0) {
            class12.field375 = new byte[50][];
        }
        class75.method574(class59.field1164, arg0 ^ 0xFFFFDE75);
        if (class39.field848 == 0) {
            class20.field519 = this.getCodeBase().getHost();
            class46.field932 = 43594;
            class293.field4746 = 443;
        } else if (class39.field848 == 1) {
            class20.field519 = this.getCodeBase().getHost();
            class46.field932 = class278.field4542 + 40000;
            class293.field4746 = class278.field4542 + 50000;
        } else if (class39.field848 == 2) {
            class20.field519 = "127.0.0.1";
            class293.field4746 = class278.field4542 + 50000;
            class46.field932 = class278.field4542 + 40000;
        }
        if (class157.field2662 == 3 && class39.field848 != 2) {
            class68.field1262 = class278.field4542;
        }
        if (class141.field2383 == 1) {
            class213.field3525 = class78.field1382;
            class259.field4239 = 16777215;
            class259.field4243 = 0;
            class68.field1255 = class147.field2515;
            class273.field4446 = class28.field682;
            class274.field4473 = true;
            class336.field5343 = class250.field4085;
        } else {
            class213.field3525 = class274.field4471;
            class336.field5343 = class354.field5654;
            class273.field4446 = class260.field4252;
            class68.field1255 = class319.field5197;
        }
        class65.field1239 = class46.field932;
        class199.field3348 = class20.field519;
        class129.field2238 = class46.field932;
        class177.field2934 = class129.field2238;
        class160.field2714 = class293.field4746;
        class303.field4938 = class206.field3444 = class308.field5042 = class171.field2822 = new short[256];
        class302.method2160((byte) 74);
        class321.method2307(false, class209.field3489);
        class115.method850((byte) 123, class209.field3489);
        class285.field4662 = class204.method1391(1365);
        if (class285.field4662 != null) {
            class285.field4662.method2252(16912, class209.field3489);
        }
        class10.field290 = class157.field2662;
        try {
            if (class59.field1164.field2664 != null) {
                class98.field1773 = new class258(class59.field1164.field2664, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class125.field2206[var2] = new class258(class59.field1164.field2655[var2], 6000, 0);
                }
                class292.field4736 = new class258(class59.field1164.field2656, 6000, 0);
                class30.field698 = new class318(255, class98.field1773, class292.field4736, 500000);
                class207.field3465 = new class258(class59.field1164.field2653, 24, 0);
                class59.field1164.field2655 = null;
                class59.field1164.field2656 = null;
                class59.field1164.field2664 = null;
                class59.field1164.field2653 = null;
            }
        } catch (IOException var4) {
            class292.field4736 = null;
            class98.field1773 = null;
            class30.field698 = null;
            class207.field3465 = null;
        }
        if (class39.field848 != 0) {
            class36.field786 = true;
        }
        if (class141.field2383 == 0) {
            class149.field2534 = class132.field2269;
        } else if (class141.field2383 == 1) {
            class149.field2534 = class235.field3848;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 330)
    public static final void method1988() {
        for (int var0 = 0; var0 < 104; var0++) {
            int[] var1 = class316.field5140[var0];
            for (int var2 = 0; var2 < 104; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 349)
    public static final void method1989() {
        boolean var0 = class53.field1060 && class252.field4144 > 200 || class252.field4144 > 50;
        for (int var1 = 0; var1 < class252.field4144; var1++) {
            class98 var2 = class182.field3151[class22.field556[var1]];
            var2.field154 = false;
            if (var2.method45((byte) -95)) {
                var2.field1801 = var2.field206 == var2.method60(true).field106 ? var0 : false;
                int var3 = 0;
                if (!var2.field193) {
                    var3++;
                }
                if (var2.field137 > class267.field4371) {
                    var3 += 2;
                }
                int var4 = var3 + (5 - var2.method49((byte) -121) << 2);
                if (class51.field1042 == 0) {
                    var4 += 32;
                } else {
                    var4 += 128;
                }
                var4 += 256;
                var2.field123 = var4 + 1;
            } else {
                var2.field123 = -1;
            }
        }
        for (int var5 = 0; var5 < class255.field4184; var5++) {
            class314 var6 = class149.field2533[class23.field570[var5]];
            var6.field154 = false;
            if (var6.method45((byte) -95) && var6.field5107.method678((byte) -58)) {
                int var7 = 0;
                if (!var6.field193) {
                    var7++;
                }
                if (var6.field137 > class267.field4371) {
                    var7 += 2;
                }
                int var8 = var7 + (5 - var6.method49((byte) 91) << 2);
                if (class51.field1042 == 0) {
                    if (var6.field5107.field1562) {
                        var8 += 64;
                    } else {
                        var8 += 128;
                    }
                } else if (class51.field1042 == 1) {
                    if (var6.field5107.field1562) {
                        var8 += 32;
                    } else {
                        var8 += 64;
                    }
                }
                if (var6.field5107.field1541) {
                    var8 += 512;
                } else if (!var6.field5107.field1533) {
                    var8 += 256;
                }
                var6.field123 = var8 + 1;
            } else {
                var6.field123 = -1;
            }
        }
        for (int var9 = 0; var9 < class120.field2140.length; var9++) {
            class68 var10 = class120.field2140[var9];
            if (var10 != null) {
                if (var10.field1253 == 1) {
                    class314 var11 = class149.field2533[var10.field1264];
                    if (var11 != null && var11.field123 != -1) {
                        var11.field123 += 1024;
                    }
                } else if (var10.field1253 == 10) {
                    class98 var12 = class182.field3151[var10.field1264];
                    if (var12 != null && var12.field123 != -1) {
                        var12.field123 += 1024;
                    }
                }
            }
        }
        class96.field1750.field123 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lg;)Lbd;", line = 473)
    public static final class340 method1990(class181 arg0) {
        class340 var1 = (class340) class223.field3682.method2344(-1, ((long) arg0.field3103 << 32) + (long) arg0.field3023);
        return var1 == null ? arg0.field3025 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lg;IIIIIII)V", line = 484)
    public static final void method1991(class181[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class181 var9 = arg0[var8];
            if (var9 != null && var9.field2970 == arg1 && (!var9.field3058 || var9.field3098 == 0 || var9.field3065 || method1990(var9).field5380 != 0 || class16.field476 == var9 || var9.field3059 == 1338) && (!var9.field3058 || !method1987(var9))) {
                int var10 = var9.field3125 + arg6;
                int var11 = var9.field3011 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3098 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3024 + var10;
                    int var17 = var9.field2972 + var11;
                    if (var9.field3098 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class323.field5231 == var9) {
                    class233.field3821 = true;
                    class282.field4618 = var10;
                    class349.field5593 = var11;
                }
                if (!var9.field3058 || var12 < var14 && var13 < var15) {
                    if (var9.field3098 == 0) {
                        if (!var9.field3058 && method1987(var9) && class292.field4731 != var9) {
                            continue;
                        }
                        if (var9.field2971 && class73.field1339 >= var12 && class26.field662 >= var13 && class73.field1339 < var14 && class26.field662 < var15) {
                            for (class47 var18 = (class47) class261.field4296.method431(0); var18 != null; var18 = (class47) class261.field4296.method439(-28512)) {
                                if (var18.field950) {
                                    var18.method535(-2801);
                                    var18.field939.field2994 = false;
                                }
                            }
                            if (class110.field2019 == 0) {
                                class323.field5231 = null;
                                class16.field476 = null;
                            }
                            class347.field5535 = 0;
                            class24.field611 = false;
                        }
                    }
                    if (var9.field3058) {
                        boolean var19;
                        if (class73.field1339 >= var12 && class26.field662 >= var13 && class73.field1339 < var14 && class26.field662 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class94.field1651 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class325.field5246 == 1 && class37.field807 >= var12 && class303.field4931 >= var13 && class37.field807 < var14 && class303.field4931 < var15) {
                            var21 = true;
                        }
                        if (var9.field3112 != null) {
                            for (int var22 = 0; var22 < var9.field3112.length; var22++) {
                                if (class261.field4307[var9.field3112[var22]]) {
                                    if (var9.field3074 == null || class267.field4371 >= var9.field3074[var22]) {
                                        byte var23 = var9.field3109[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class261.field4307[86] && !class261.field4307[82] && !class261.field4307[81]) && ((var23 & 0x2) == 0 || class261.field4307[86]) && ((var23 & 0x1) == 0 || class261.field4307[82]) && ((var23 & 0x4) == 0 || class261.field4307[81])) {
                                            class207.method1431(var9.field3103, 121, "", var22 + 1, -1);
                                            int var24 = var9.field3036[var22];
                                            if (var9.field3074 == null) {
                                                var9.field3074 = new int[var9.field3112.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3074[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3074[var22] = class267.field4371 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3074 != null) {
                                    var9.field3074[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class289.method2058(var9, class37.field807 - var10, 113, class303.field4931 - var11);
                        }
                        if (class323.field5231 != null && class323.field5231 != var9 && var19 && method1990(var9).method2398(false)) {
                            class1.field19 = var9;
                        }
                        if (class16.field476 == var9) {
                            class132.field2275 = true;
                            class233.field3818 = var10;
                            class79.field1403 = var11;
                        }
                        if (var9.field3065 || var9.field3059 != 0) {
                            if (var19 && class237.field3881 != 0 && var9.field3106 != null) {
                                class47 var25 = new class47();
                                var25.field950 = true;
                                var25.field939 = var9;
                                var25.field941 = class237.field3881;
                                var25.field936 = var9.field3106;
                                class261.field4296.method437(var25, (byte) 51);
                            }
                            if (class323.field5231 != null || class240.field3991 != null || class5.field87 || var9.field3059 != 1400 && class347.field5535 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3059 != 0) {
                                if (var9.field3059 == 1337) {
                                    class338.field5359 = var9;
                                    continue;
                                }
                                if (var9.field3059 == 1338) {
                                    if (var21) {
                                        class296.field4835 = class37.field807 - var10;
                                        class233.field3824 = class303.field4931 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3059 == 1400) {
                                    class61.field1193 = var9;
                                    if (var19) {
                                        class24.field611 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class37.field807 - var10 - var9.field3024 / 2) * 2.0D / (double) class38.field828);
                                        int var27 = (int) ((double) (class303.field4931 - var11 - var9.field2972 / 2) * 2.0D / (double) class38.field828);
                                        int var28 = class332.field5303 + var26;
                                        int var29 = class206.field3449 + var27;
                                        int var30 = class38.field826 + var28;
                                        int var31 = class38.field821 + class38.field820 - var29 - 1;
                                        class226 var32 = class251.method1770(-86);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method1576(var30, var33, (byte) 104, var31);
                                        if (var33 != null) {
                                            if (class261.field4307[82] && class300.field4883 > 0) {
                                                class86.method653(var33[0], 3, var33[1], var33[2]);
                                                class341.method2410(true);
                                                continue;
                                            }
                                            class35.field770++;
                                            class51.field1038.method291((byte) 80, 201);
                                            class51.field1038.method1026(var33[0] << 28 | var33[1] << 14 | var33[2], (byte) 30);
                                        }
                                        class347.field5535 = 1;
                                        class194.field3262 = false;
                                        class269.field4377 = class73.field1339;
                                        class97.field1760 = class26.field662;
                                        continue;
                                    }
                                    if (var20 && class347.field5535 > 0) {
                                        if (class347.field5535 == 1 && (class73.field1339 != class269.field4377 || class97.field1760 != class26.field662)) {
                                            class348.field5567 = class332.field5303;
                                            class152.field2594 = class206.field3449;
                                            class347.field5535 = 2;
                                        }
                                        if (class347.field5535 == 2) {
                                            class194.field3262 = true;
                                            class351.method2501((int) ((double) (class269.field4377 - class73.field1339) * 2.0D / (double) class38.field822) + class348.field5567, 24840);
                                            class299.method2138((int) ((double) (class97.field1760 - class26.field662) * 2.0D / (double) class38.field822) + class152.field2594, (byte) 20);
                                        }
                                        continue;
                                    }
                                    if (class347.field5535 > 0 && !class194.field3262) {
                                        if ((class301.field4895 == 1 || class348.method2492(class137.field2343 - 1, -119)) && class137.field2343 > 2) {
                                            class282.method2007((byte) -13);
                                        } else if (class137.field2343 > 0) {
                                            class99.method751((byte) 116);
                                        }
                                    }
                                    class347.field5535 = 0;
                                    continue;
                                }
                                if (var9.field3059 == 1401) {
                                    if (var20) {
                                        class71.method541(class73.field1339 - var10, class26.field662 - var11, 43, var9.field2972, var9.field3024);
                                    }
                                    continue;
                                }
                                if (var9.field3059 == 1402) {
                                    if (!class241.field4016) {
                                        class52.method459(128, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field3134 && var21) {
                                var9.field3134 = true;
                                if (var9.field3004 != null) {
                                    class47 var34 = new class47();
                                    var34.field950 = true;
                                    var34.field939 = var9;
                                    var34.field945 = class37.field807 - var10;
                                    var34.field941 = class303.field4931 - var11;
                                    var34.field936 = var9.field3004;
                                    class261.field4296.method437(var34, (byte) 51);
                                }
                            }
                            if (var9.field3134 && var20 && var9.field3115 != null) {
                                class47 var35 = new class47();
                                var35.field950 = true;
                                var35.field939 = var9;
                                var35.field945 = class73.field1339 - var10;
                                var35.field941 = class26.field662 - var11;
                                var35.field936 = var9.field3115;
                                class261.field4296.method437(var35, (byte) 51);
                            }
                            if (var9.field3134 && !var20) {
                                var9.field3134 = false;
                                if (var9.field3043 != null) {
                                    class47 var36 = new class47();
                                    var36.field950 = true;
                                    var36.field939 = var9;
                                    var36.field945 = class73.field1339 - var10;
                                    var36.field941 = class26.field662 - var11;
                                    var36.field936 = var9.field3043;
                                    class130.field2250.method437(var36, (byte) 51);
                                }
                            }
                            if (var20 && var9.field2967 != null) {
                                class47 var37 = new class47();
                                var37.field950 = true;
                                var37.field939 = var9;
                                var37.field945 = class73.field1339 - var10;
                                var37.field941 = class26.field662 - var11;
                                var37.field936 = var9.field2967;
                                class261.field4296.method437(var37, (byte) 51);
                            }
                            if (!var9.field2994 && var19) {
                                var9.field2994 = true;
                                if (var9.field3047 != null) {
                                    class47 var38 = new class47();
                                    var38.field950 = true;
                                    var38.field939 = var9;
                                    var38.field945 = class73.field1339 - var10;
                                    var38.field941 = class26.field662 - var11;
                                    var38.field936 = var9.field3047;
                                    class261.field4296.method437(var38, (byte) 51);
                                }
                            }
                            if (var9.field2994 && var19 && var9.field3104 != null) {
                                class47 var39 = new class47();
                                var39.field950 = true;
                                var39.field939 = var9;
                                var39.field945 = class73.field1339 - var10;
                                var39.field941 = class26.field662 - var11;
                                var39.field936 = var9.field3104;
                                class261.field4296.method437(var39, (byte) 51);
                            }
                            if (var9.field2994 && !var19) {
                                var9.field2994 = false;
                                if (var9.field3073 != null) {
                                    class47 var40 = new class47();
                                    var40.field950 = true;
                                    var40.field939 = var9;
                                    var40.field945 = class73.field1339 - var10;
                                    var40.field941 = class26.field662 - var11;
                                    var40.field936 = var9.field3073;
                                    class130.field2250.method437(var40, (byte) 51);
                                }
                            }
                            if (var9.field3080 != null) {
                                class47 var41 = new class47();
                                var41.field939 = var9;
                                var41.field936 = var9.field3080;
                                class86.field1501.method437(var41, (byte) 51);
                            }
                            if (var9.field3041 != null && class309.field5046 > var9.field3079) {
                                if (var9.field2984 == null || class309.field5046 - var9.field3079 > 32) {
                                    class47 var46 = new class47();
                                    var46.field939 = var9;
                                    var46.field936 = var9.field3041;
                                    class261.field4296.method437(var46, (byte) 51);
                                } else {
                                    label603: for (int var42 = var9.field3079; var42 < class309.field5046; var42++) {
                                        int var43 = class34.field753[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2984.length; var44++) {
                                            if (var9.field2984[var44] == var43) {
                                                class47 var45 = new class47();
                                                var45.field939 = var9;
                                                var45.field936 = var9.field3041;
                                                class261.field4296.method437(var45, (byte) 51);
                                                break label603;
                                            }
                                        }
                                    }
                                }
                                var9.field3079 = class309.field5046;
                            }
                            if (var9.field2977 != null && class68.field1270 > var9.field3096) {
                                if (var9.field3099 == null || class68.field1270 - var9.field3096 > 32) {
                                    class47 var51 = new class47();
                                    var51.field939 = var9;
                                    var51.field936 = var9.field2977;
                                    class261.field4296.method437(var51, (byte) 51);
                                } else {
                                    label579: for (int var47 = var9.field3096; var47 < class68.field1270; var47++) {
                                        int var48 = class91.field1609[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3099.length; var49++) {
                                            if (var9.field3099[var49] == var48) {
                                                class47 var50 = new class47();
                                                var50.field939 = var9;
                                                var50.field936 = var9.field2977;
                                                class261.field4296.method437(var50, (byte) 51);
                                                break label579;
                                            }
                                        }
                                    }
                                }
                                var9.field3096 = class68.field1270;
                            }
                            if (var9.field3072 != null && class278.field4524 > var9.field3142) {
                                if (var9.field3066 == null || class278.field4524 - var9.field3142 > 32) {
                                    class47 var56 = new class47();
                                    var56.field939 = var9;
                                    var56.field936 = var9.field3072;
                                    class261.field4296.method437(var56, (byte) 51);
                                } else {
                                    label555: for (int var52 = var9.field3142; var52 < class278.field4524; var52++) {
                                        int var53 = class68.field1272[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3066.length; var54++) {
                                            if (var9.field3066[var54] == var53) {
                                                class47 var55 = new class47();
                                                var55.field939 = var9;
                                                var55.field936 = var9.field3072;
                                                class261.field4296.method437(var55, (byte) 51);
                                                break label555;
                                            }
                                        }
                                    }
                                }
                                var9.field3142 = class278.field4524;
                            }
                            if (var9.field3006 != null && class220.field3656 > var9.field3124) {
                                if (var9.field2974 == null || class220.field3656 - var9.field3124 > 32) {
                                    class47 var61 = new class47();
                                    var61.field939 = var9;
                                    var61.field936 = var9.field3006;
                                    class261.field4296.method437(var61, (byte) 51);
                                } else {
                                    label531: for (int var57 = var9.field3124; var57 < class220.field3656; var57++) {
                                        int var58 = class182.field3162[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2974.length; var59++) {
                                            if (var9.field2974[var59] == var58) {
                                                class47 var60 = new class47();
                                                var60.field939 = var9;
                                                var60.field936 = var9.field3006;
                                                class261.field4296.method437(var60, (byte) 51);
                                                break label531;
                                            }
                                        }
                                    }
                                }
                                var9.field3124 = class220.field3656;
                            }
                            if (var9.field3085 != null && class171.field2821 > var9.field2991) {
                                if (var9.field3053 == null || class171.field2821 - var9.field2991 > 32) {
                                    class47 var66 = new class47();
                                    var66.field939 = var9;
                                    var66.field936 = var9.field3085;
                                    class261.field4296.method437(var66, (byte) 51);
                                } else {
                                    label507: for (int var62 = var9.field2991; var62 < class171.field2821; var62++) {
                                        int var63 = class77.field1379[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3053.length; var64++) {
                                            if (var9.field3053[var64] == var63) {
                                                class47 var65 = new class47();
                                                var65.field939 = var9;
                                                var65.field936 = var9.field3085;
                                                class261.field4296.method437(var65, (byte) 51);
                                                break label507;
                                            }
                                        }
                                    }
                                }
                                var9.field2991 = class171.field2821;
                            }
                            if (class257.field4206 > var9.field3009 && var9.field2979 != null) {
                                class47 var67 = new class47();
                                var67.field939 = var9;
                                var67.field936 = var9.field2979;
                                class261.field4296.method437(var67, (byte) 51);
                            }
                            if (class70.field1286 > var9.field3009 && var9.field3028 != null) {
                                class47 var68 = new class47();
                                var68.field939 = var9;
                                var68.field936 = var9.field3028;
                                class261.field4296.method437(var68, (byte) 51);
                            }
                            if (class240.field3987 > var9.field3009 && var9.field2995 != null) {
                                class47 var69 = new class47();
                                var69.field939 = var9;
                                var69.field936 = var9.field2995;
                                class261.field4296.method437(var69, (byte) 51);
                            }
                            if (class353.field5647 > var9.field3009 && var9.field3017 != null) {
                                class47 var70 = new class47();
                                var70.field939 = var9;
                                var70.field936 = var9.field3017;
                                class261.field4296.method437(var70, (byte) 51);
                            }
                            if (class110.field2021 > var9.field3009 && var9.field2978 != null) {
                                class47 var71 = new class47();
                                var71.field939 = var9;
                                var71.field936 = var9.field2978;
                                class261.field4296.method437(var71, (byte) 51);
                            }
                            var9.field3009 = class83.field1436;
                            if (var9.field3082 != null) {
                                for (int var72 = 0; var72 < class277.field4509; var72++) {
                                    class47 var73 = new class47();
                                    var73.field939 = var9;
                                    var73.field937 = class28.field683[var72];
                                    var73.field947 = class66.field1246[var72];
                                    var73.field936 = var9.field3082;
                                    class261.field4296.method437(var73, (byte) 51);
                                }
                            }
                            if (class197.field3301 && var9.field3050 != null) {
                                class47 var74 = new class47();
                                var74.field939 = var9;
                                var74.field936 = var9.field3050;
                                class261.field4296.method437(var74, (byte) 51);
                            }
                        }
                    }
                    if (!var9.field3058 && class323.field5231 == null && class240.field3991 == null && !class5.field87) {
                        if ((var9.field3126 >= 0 || var9.field3033 != 0) && class73.field1339 >= var12 && class26.field662 >= var13 && class73.field1339 < var14 && class26.field662 < var15) {
                            if (var9.field3126 >= 0) {
                                class292.field4731 = arg0[var9.field3126];
                            } else {
                                class292.field4731 = var9;
                            }
                        }
                        if (var9.field3098 == 8 && class73.field1339 >= var12 && class26.field662 >= var13 && class73.field1339 < var14 && class26.field662 < var15) {
                            class171.field2831 = var9;
                        }
                        if (var9.field3089 > var9.field2972) {
                            class8.method97(-1, var11, var9, class26.field662, var9.field2972, class73.field1339, var9.field3024 + var10, var9.field3089);
                        }
                    }
                    if (var9.field3098 == 0) {
                        method1991(arg0, var9.field3103, var12, var13, var14, var15, var10 - var9.field3035, var11 - var9.field2992);
                        if (var9.field3095 != null) {
                            method1991(var9.field3095, var9.field3103, var12, var13, var14, var15, var10 - var9.field3035, var11 - var9.field2992);
                        }
                        class355 var75 = (class355) class34.field758.method2344(-1, (long) var9.field3103);
                        if (var75 != null) {
                            class174.method1239(var10, var15, var75.field5657, var14, var12, -2, var13, var11);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1281)
    public final void init() {
        field4591++;
        if (!this.method798((byte) 121)) {
            return;
        }
        class278.field4542 = Integer.parseInt(this.getParameter("worldid"));
        class39.field848 = Integer.parseInt(this.getParameter("modewhere"));
        if (class39.field848 < 0 || class39.field848 > 1) {
            class39.field848 = 0;
        }
        class217.field3620 = Integer.parseInt(this.getParameter("modewhat"));
        if (class217.field3620 < 0 || class217.field3620 > 2) {
            class217.field3620 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class295.field4812 = true;
        } else {
            class295.field4812 = false;
        }
        try {
            class86.field1497 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class86.field1497 = 0;
        }
        class15.method159(0, class86.field1497);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class359.field5724 = true;
        } else {
            class359.field5724 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class216.field3604 = true;
        } else {
            class216.field3604 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class141.field2383 = 1;
        } else {
            class141.field2383 = 0;
        }
        try {
            class363.field5745 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class363.field5745 = 0;
        }
        class200.field3359 = this.getParameter("settings");
        if (class200.field3359 == null) {
            class200.field3359 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class114.field2059 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class114.field2059 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class346.field5529 = true;
        } else {
            class346.field5529 = false;
        }
        class111.field2036 = this;
        this.method801(true, 765, 503, class217.field3620 + 32, 1553);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1365)
    public final void method799(int arg0) {
        field4595++;
        if (class334.field5326 == 1000) {
            return;
        }
        if (arg0 != -25993) {
            field4581 = (String) null;
        }
        class267.field4371++;
        if (class267.field4371 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class76.field1371 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class201.field3366.setSeed((long) class76.field1371);
        }
        this.method1984((byte) -127);
        if (class47.field948 != null) {
            class47.field948.method1524(arg0 ^ 0xFFFF9A77);
        }
        class319.method2299(false);
        class119.method865(-4097);
        class166.method1183((byte) 124);
        class122.method882(1);
        if (class241.field4016) {
            class239.method1670();
        }
        if (class285.field4662 != null) {
            int var3 = class285.field4662.method2257((byte) 70);
            class237.field3881 = var3;
        }
        if (class334.field5326 == 0) {
            this.method1994((byte) -118);
            class53.method464((byte) -122);
        } else if (class334.field5326 == 5) {
            this.method1994((byte) -117);
            class53.method464((byte) -122);
        } else if (class334.field5326 == 25 || class334.field5326 == 28) {
            class222.method1555(0);
        }
        if (class334.field5326 == 10) {
            this.method1999(true);
            class216.method1502(3);
            class71.method543((byte) 89);
            class138.method959((byte) 116);
        } else if (class334.field5326 == 30) {
            class220.method1532(arg0 + 25865);
        } else if (class334.field5326 == 40) {
            class138.method959((byte) -115);
            if (class11.field363 != -3) {
                if (class11.field363 == 15) {
                    class162.method1161(arg0 ^ 0xFFFF9A76);
                } else if (class11.field363 != 2) {
                    class345.method2433((byte) 110);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 1457)
    public final void method796(byte arg0) {
        field4583++;
        if (class334.field5326 == 1000) {
            return;
        }
        long var2 = class49.method435((byte) 72) / 1000000L - class112.field2046;
        class112.field2046 = class49.method435((byte) 79) / 1000000L;
        boolean var4 = class46.method382((byte) -68);
        if (var4 && class291.field4720 && class125.field2205 != null) {
            class125.field2205.method150(true);
        }
        if ((class334.field5326 == 30 || class334.field5326 == 10) && (class284.field4635 || class274.field4464 != 0L && class218.method1520((byte) 70) > class274.field4464)) {
            class145.method986(class292.method2078(16), class146.field2459, class217.field3616, class284.field4635, false);
        }
        if (class202.field3384 == null) {
            Container var5;
            if (class202.field3384 != null) {
                var5 = class202.field3384;
            } else if (class274.field4469 == null) {
                var5 = class59.field1164.field2658;
            } else {
                var5 = class274.field4469;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class274.field4469 == var5) {
                Insets var8 = class274.field4469.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class276.field4505 != var6 || class332.field5302 != var7) {
                if (class157.field2661.startsWith("mac")) {
                    class276.field4505 = var6;
                    class332.field5302 = var7;
                } else {
                    class21.method190((byte) -59);
                }
                class274.field4464 = class218.method1520((byte) 99) + 500L;
            }
        }
        if (class202.field3384 != null && !class274.field4470 && (class334.field5326 == 30 || class334.field5326 == 10)) {
            class145.method986(class135.field2318, -1, -1, false, false);
        }
        boolean var9 = false;
        if (class205.field3412) {
            var9 = true;
            class205.field3412 = false;
        }
        if (arg0 != 47) {
            field4581 = (String) null;
        }
        if (var9) {
            class114.method847((byte) -89);
        }
        if (class241.field4016) {
            for (int var10 = 0; var10 < 100; var10++) {
                class213.field3524[var10] = true;
            }
        }
        if (class334.field5326 == 0) {
            class172.method1222(class61.field1192, class213.field3522, 12738, (Color) null, var9);
        } else if (class334.field5326 == 5) {
            class346.method2466(class332.field5297, (byte) 115, false);
        } else if (class334.field5326 == 10) {
            class65.method518((byte) 55);
        } else if (class334.field5326 == 25 || class334.field5326 == 28) {
            if (class207.field3461 == 1) {
                if (class158.field2679 < class151.field2584) {
                    class158.field2679 = class151.field2584;
                }
                int var11 = (class158.field2679 - class151.field2584) * 50 / class158.field2679;
                class312.method2268(class284.field4645 + "<br>(" + var11 + "%)", false, (byte) 91);
            } else if (class207.field3461 == 2) {
                if (class34.field762 < class52.field1044) {
                    class34.field762 = class52.field1044;
                }
                int var12 = (class34.field762 - class52.field1044) * 50 / class34.field762 + 50;
                class312.method2268(class284.field4645 + "<br>(" + var12 + "%)", false, (byte) 91);
            } else {
                class312.method2268(class284.field4645, false, (byte) 91);
            }
        } else if (class334.field5326 == 30) {
            class182.method1283((byte) -62, var2);
        } else if (class334.field5326 == 40) {
            class312.method2268(class6.field194 + "<br>" + class112.field2050, false, (byte) 91);
        }
        if (class241.field4016 && class334.field5326 != 0) {
            class241.method1693();
            for (int var13 = 0; var13 < class87.field1522; var13++) {
                class117.field2084[var13] = false;
            }
        } else if ((class334.field5326 == 30 || class334.field5326 == 10) && class346.field5524 == 0 && !var9) {
            try {
                Graphics var14 = class209.field3489.getGraphics();
                for (int var15 = 0; var15 < class87.field1522; var15++) {
                    if (class117.field2084[var15]) {
                        class285.field4666.method615(class54.field1074[var15], class260.field4257[var15], var14, class220.field3657[var15], class83.field1438[var15], 64);
                        class117.field2084[var15] = false;
                    }
                }
            } catch (Exception var21) {
                class209.field3489.repaint();
            }
        } else if (class334.field5326 != 0) {
            try {
                Graphics var17 = class209.field3489.getGraphics();
                class285.field4666.method611(0, (byte) -47, 0, var17);
                for (int var18 = 0; var18 < class87.field1522; var18++) {
                    class117.field2084[var18] = false;
                }
            } catch (Exception var20) {
                class209.field3489.repaint();
            }
        }
        if (class358.field5702) {
            class255.method1786(-27);
        }
        if (class171.field2832 && class334.field5326 == 10 && class88.field1566 != -1) {
            class171.field2832 = false;
            class235.method1634(class59.field1164, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 1682)
    private final void method1992(byte[] arg0, int arg1) {
        field4580++;
        if (arg1 != -8135) {
            this.method794(-37);
        }
        class146 var3 = new class146(arg0);
        while (true) {
            int var4;
            do {
                while (true) {
                    var4 = var3.method1005((byte) 122);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 != 1) {
                        break;
                    }
                    int[] var7 = class12.field381 = new int[6];
                    var7[0] = var3.method989(78);
                    var7[1] = var3.method989(84);
                    var7[2] = var3.method989(125);
                    var7[3] = var3.method989(111);
                    var7[4] = var3.method989(83);
                    var7[5] = var3.method989(84);
                }
            } while (var4 != 4);
            int var5 = var3.method1005((byte) 122);
            class275.field4483 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class275.field4483[var6] = var3.method989(95);
                if (class275.field4483[var6] == 65535) {
                    class275.field4483[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 1743)
    public static final void method1993() {
        for (int var0 = -1; var0 < class255.field4184 + class252.field4144; var0++) {
            class6 var1;
            long var2;
            if (var0 < 0) {
                var1 = class96.field1750;
                var2 = 8791798054912L;
            } else if (var0 < class252.field4144) {
                int var4 = class22.field556[var0];
                var1 = class182.field3151[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class23.field570[var0 - class252.field4144];
                class314 var6 = class149.field2533[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field5107.field1582) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field123 >= 0) {
                int var7 = var1.method49((byte) -90);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field199 & 0x7F) == 0 && (var1.field213 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var1.field199 & 0x7F) == 64 && (var1.field213 & 0x7F) == 64) {
                    continue;
                }
                if (var1 instanceof class98 && var1.field141 != null && class267.field4371 >= var1.field143 && class267.field4371 < var1.field200) {
                    ((class98) var1).field1801 = false;
                    var1.field136 = class21.method189((byte) 81, var1.field213, var1.field199, class276.field4506);
                    class73.method558(class276.field4506, var1.field199, var1.field213, var1.field136, var1, var1.field216, var2, var1.field129, var1.field116, var1.field223, var1.field176);
                } else {
                    var1.field136 = class21.method189((byte) -126, var1.field213, var1.field199, class276.field4506);
                    class198.method1350(class276.field4506, var1.field199, var1.field213, var1.field136, (var7 - 1) * 64 + 60, var1, var1.field216, var2, var1.field189);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 1812)
    private final void method1994(byte arg0) {
        if (!class171.field2832) {
            label245: while (true) {
                do {
                    if (!class128.method916((byte) -107)) {
                        break label245;
                    }
                } while (class311.field5071 != 's' && class311.field5071 != 'S');
                class171.field2832 = true;
            }
        }
        field4582++;
        if (class54.field1082 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class218.method1520((byte) 123);
            if (class215.field3579 == 0L) {
                class215.field3579 = var4;
            }
            if (var3 > 16384 && (var4 - class215.field3579) < 5000L) {
                if ((var4 - class83.field1437) > 1000L) {
                    System.gc();
                    class83.field1437 = var4;
                }
                class61.field1192 = 5;
                class213.field3522 = class23.field577;
            } else {
                class54.field1082 = 10;
                class213.field3522 = class358.field5688;
                class61.field1192 = 5;
            }
        } else if (class54.field1082 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class23.field576[var6] = new class273(104, 104);
            }
            class54.field1082 = 30;
            class61.field1192 = 10;
            class213.field3522 = class176.field2923;
        } else if (class54.field1082 == 30) {
            if (class47.field948 == null) {
                class47.field948 = new class219(class90.field1608, class231.field3793);
            }
            if (class47.field948.method1527((byte) -127)) {
                class244.field4051 = class177.method1257(-1, false, true, true, 0);
                class26.field664 = class177.method1257(-1, false, true, true, 1);
                class143.field2409 = class177.method1257(-1, true, false, true, 2);
                class284.field4651 = class177.method1257(-1, false, true, true, 3);
                class349.field5582 = class177.method1257(-1, false, true, true, 4);
                class162.field2727 = class177.method1257(-1, true, true, true, 5);
                class112.field2043 = class177.method1257(-1, true, true, false, 6);
                class107.field1946 = class177.method1257(-1, false, true, true, 7);
                class99.field1828 = class177.method1257(-1, false, true, true, 8);
                class49.field1014 = class177.method1257(-1, false, true, true, 9);
                class278.field4543 = class177.method1257(-1, false, true, true, 10);
                class103.field1902 = class177.method1257(-1, false, true, true, 11);
                class318.field5177 = class177.method1257(-1, false, true, true, 12);
                class124.field2186 = class177.method1257(-1, false, true, true, 13);
                class136.field2332 = class177.method1257(-1, false, true, false, 14);
                class348.field5574 = class177.method1257(-1, false, true, true, 15);
                class132.field2276 = class177.method1257(-1, false, true, true, 16);
                class160.field2704 = class177.method1257(-1, false, true, true, 17);
                class323.field5226 = class177.method1257(-1, false, true, true, 18);
                class260.field4265 = class177.method1257(-1, false, true, true, 19);
                class18.field494 = class177.method1257(-1, false, true, true, 20);
                class334.field5321 = class177.method1257(-1, false, true, true, 21);
                class13.field400 = class177.method1257(-1, false, true, true, 22);
                class25.field652 = class177.method1257(-1, true, true, true, 23);
                class354.field5655 = class177.method1257(-1, false, true, true, 24);
                class351.field5606 = class177.method1257(-1, false, true, true, 25);
                class46.field934 = class177.method1257(-1, true, true, true, 26);
                class331.field5286 = class177.method1257(-1, false, true, true, 27);
                class21.field544 = class177.method1257(-1, true, true, true, 28);
                class54.field1082 = 40;
                class213.field3522 = class338.field5361;
                class61.field1192 = 15;
            } else {
                class61.field1192 = 12;
                class213.field3522 = class159.field2691;
            }
        } else if (class54.field1082 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class191.field3236[var8].method1763((byte) 71) * class156.field2637[var8] / 100;
            }
            if (var7 == 100) {
                class213.field3522 = class55.field1089;
                class61.field1192 = 20;
                class293.method2080(class99.field1828, (byte) -92);
                class47.method393(class99.field1828, -100);
                class143.method978(class99.field1828, (byte) 111);
                class54.field1082 = 41;
            } else {
                if (var7 != 0) {
                    class213.field3522 = class44.field914 + var7 + "%";
                }
                class61.field1192 = 20;
            }
        } else if (class54.field1082 == 41) {
            if (class21.field544.method1414(0)) {
                this.method1992(class21.field544.method1407(-78, 1), -8135);
                class61.field1192 = 25;
                class213.field3522 = class73.field1332;
                class54.field1082 = 45;
            } else {
                class213.field3522 = class104.field1906 + class21.field544.method1408(0) + "%";
                class61.field1192 = 25;
            }
        } else if (class54.field1082 == 45) {
            class53.method465(2, 22050, class277.field4519, (byte) -125);
            class190.field3225 = new class345();
            class190.field3225.method2432(128, (byte) -95, 9);
            class125.field2205 = class153.method1088(class59.field1164, class209.field3489, -6764, 22050, 0);
            class125.field2205.method142(class190.field3225, false);
            class111.method831(class190.field3225, 2, class348.field5574, class136.field2332, class349.field5582);
            class96.field1746 = class153.method1088(class59.field1164, class209.field3489, -6764, 2048, 1);
            class56.field1105 = new class175();
            class96.field1746.method142(class56.field1105, false);
            class8.field276 = new class114(22050, class194.field3261);
            class334.field5327 = class112.field2043.method1402(-121, "scape main");
            class61.field1192 = 30;
            class54.field1082 = 50;
            class213.field3522 = class13.field398;
        } else if (class54.field1082 == 50) {
            int var28 = class161.method1158(class124.field2186, 1, class99.field1828);
            int var29 = class302.method2158((byte) -70);
            if (var28 < var29) {
                class61.field1192 = 35;
                class213.field3522 = class152.field2598 + var28 * 100 / var29 + "%";
            } else {
                class54.field1082 = 60;
                class61.field1192 = 35;
                class213.field3522 = class194.field3265;
            }
        } else if (class54.field1082 == 60) {
            int var26 = class273.method1938((byte) -65, class99.field1828);
            int var27 = class136.method952(2);
            if (var26 >= var27) {
                class54.field1082 = 65;
                class213.field3522 = class166.field2782;
                class61.field1192 = 40;
            } else {
                class61.field1192 = 40;
                class213.field3522 = field4592 + var26 * 100 / var27 + "%";
            }
        } else if (class54.field1082 == 65) {
            class237.method1647(class99.field1828, class124.field2186, (byte) -5);
            class61.field1192 = 45;
            class213.field3522 = class334.field5328;
            class311.method2260(5, -19880);
            class54.field1082 = 70;
        } else if (class54.field1082 == 70) {
            byte var9 = 0;
            class143.field2409.method1414(0);
            int var10 = var9 + class143.field2409.method1408(0);
            class132.field2276.method1414(0);
            int var11 = var10 + class132.field2276.method1408(0);
            class160.field2704.method1414(0);
            int var12 = var11 + class160.field2704.method1408(0);
            class323.field5226.method1414(0);
            int var13 = var12 + class323.field5226.method1408(0);
            class260.field4265.method1414(0);
            int var14 = var13 + class260.field4265.method1408(0);
            class18.field494.method1414(0);
            int var15 = var14 + class18.field494.method1408(0);
            class334.field5321.method1414(0);
            int var16 = var15 + class334.field5321.method1408(0);
            class13.field400.method1414(0);
            int var17 = var16 + class13.field400.method1408(0);
            class354.field5655.method1414(0);
            int var18 = var17 + class354.field5655.method1408(0);
            class351.field5606.method1414(0);
            int var19 = var18 + class351.field5606.method1408(0);
            class331.field5286.method1414(0);
            int var20 = var19 + class331.field5286.method1408(0);
            if (var20 < 1100) {
                class213.field3522 = class61.field1194 + var20 / 11 + "%";
                class61.field1192 = 50;
            } else {
                class258.method1803(class143.field2409, 0);
                class263.method1849(class143.field2409, 114);
                class178.method1259(class143.field2409, -49);
                class273.method1942(false, class143.field2409, class107.field1946);
                class296.method2129(-66, true, class132.field2276, class107.field1946);
                class204.method1394(-124, class107.field1946, class323.field5226, true);
                class232.method1618(class358.field5698, 256, class107.field1946, class260.field4265, true);
                class319.method2296(true, class143.field2409);
                class244.method1725(class244.field4051, class26.field664, class18.field494, 0);
                class44.method369(class143.field2409, true);
                class291.method2066(class107.field1946, class334.field5321, 12);
                class207.method1437(92, class13.field400);
                class1.method8(class143.field2409, 97);
                class320.method2306(class107.field1946, (byte) -126, class284.field4651, class124.field2186, class99.field1828);
                class215.method1499(class143.field2409, (byte) 88);
                class30.method230(class160.field2704, -28449);
                class344.method2422(new class22(), class351.field5606, class354.field5655, -12060);
                class287.method2029(class351.field5606, class354.field5655, (byte) -121);
                class82.method607((byte) -13, class143.field2409);
                class19.method180(class143.field2409, 65);
                class362.method2543((byte) 114, class143.field2409);
                class356.method2523(class99.field1828, 21501, class143.field2409);
                class18.method175((byte) 90, class99.field1828, class143.field2409);
                class351.method2498((byte) -113, class143.field2409, class99.field1828);
                class61.field1192 = 50;
                class213.field3522 = class119.field2114;
                class231.method1613((byte) -110);
                class54.field1082 = 80;
            }
        } else if (class54.field1082 == 80) {
            int var24 = class140.method969(class99.field1828, -2760);
            int var25 = class287.method2039(0);
            if (var25 > var24) {
                class213.field3522 = class87.field1526 + var24 * 100 / var25 + "%";
                class61.field1192 = 60;
            } else {
                class127.method907(false, class99.field1828);
                class61.field1192 = 60;
                class213.field3522 = class267.field4374;
                class54.field1082 = 90;
            }
        } else if (class54.field1082 == 90) {
            if (class46.field934.method1414(0)) {
                class7 var23 = new class7(class49.field1014, class46.field934, class99.field1828, 20, !class136.field2333);
                class305.method2230(var23);
                if (class152.field2601 == 1) {
                    class305.method2216(0.9F);
                }
                if (class152.field2601 == 2) {
                    class305.method2216(0.8F);
                }
                if (class152.field2601 == 3) {
                    class305.method2216(0.7F);
                }
                if (class152.field2601 == 4) {
                    class305.method2216(0.6F);
                }
                class61.field1192 = 70;
                class54.field1082 = 100;
                class213.field3522 = class306.field4977;
            } else {
                class213.field3522 = class87.field1525 + class46.field934.method1408(0) + "%";
                class61.field1192 = 70;
            }
        } else if (class54.field1082 == 100) {
            if (class328.method2343(class99.field1828, false)) {
                class54.field1082 = 110;
            }
        } else if (class54.field1082 == 110) {
            class299.field4857 = new class101();
            class59.field1164.method1132(10, 0, class299.field4857);
            class213.field3522 = class18.field491;
            class61.field1192 = 75;
            class54.field1082 = 120;
        } else if (class54.field1082 == 120) {
            if (class278.field4543.method1412(0, "", "huffman")) {
                class320 var22 = new class320(class278.field4543.method1400(-99, "huffman", ""));
                class328.method2338(var22, -1);
                class61.field1192 = 80;
                class213.field3522 = class158.field2680;
                class54.field1082 = 130;
            } else {
                class61.field1192 = 80;
                class213.field3522 = class229.field3759 + "0%";
            }
        } else if (class54.field1082 == 130) {
            if (!class284.field4651.method1414(0)) {
                class213.field3522 = class114.field2055 + class284.field4651.method1408(0) * 3 / 4 + "%";
                class61.field1192 = 85;
            } else if (!class318.field5177.method1414(0)) {
                class213.field3522 = class114.field2055 + ((class318.field5177.method1408(0) / 10) + 75) + "%";
                class61.field1192 = 85;
            } else if (!class124.field2186.method1414(0)) {
                class213.field3522 = class114.field2055 + (class124.field2186.method1408(0) / 20 + 85) + "%";
                class61.field1192 = 85;
            } else if (class25.field652.method1425("details", 4)) {
                class38.method274(class25.field652);
                class214.method1487(class331.field5286);
                class17.method173(class107.field1946);
                class54.field1082 = 135;
                class213.field3522 = class275.field4484;
                class61.field1192 = 95;
            } else {
                class213.field3522 = class114.field2055 + ((class25.field652.method1416("details", (byte) -8) / 10) + 90) + "%";
                class61.field1192 = 85;
            }
        } else if (class54.field1082 == 135) {
            int var21 = class234.method1630(-4);
            if (var21 == -1) {
                class61.field1192 = 95;
                class213.field3522 = class105.field1919;
            } else if (var21 == 7 || var21 == 9) {
                this.method811(-80, "worldlistfull");
                class311.method2260(1000, -19880);
            } else if (class205.field3416) {
                class54.field1082 = 140;
                class213.field3522 = class272.field4435;
                class61.field1192 = 96;
            } else {
                this.method811(-99, "worldlistio_" + var21);
                class311.method2260(1000, -19880);
            }
        } else if (class54.field1082 == 140) {
            class345.field5508 = class284.field4651.method1402(-89, "loginscreen");
            class162.field2727.method1422(true, false, 83);
            class112.field2043.method1422(true, true, 76);
            class99.field1828.method1422(true, true, 91);
            class124.field2186.method1422(true, true, 117);
            class278.field4543.method1422(true, true, 72);
            class284.field4651.method1422(true, true, 85);
            class213.field3522 = class18.field493;
            class54.field1082 = 150;
            class61.field1192 = 97;
            class358.field5702 = true;
        } else {
            if (arg0 > -83) {
                field4587 = (int[]) null;
            }
            if (class54.field1082 == 150) {
                class106.method790();
                if (class171.field2832) {
                    class178.field2937 = 0;
                    class135.field2318 = 0;
                    class248.field4071 = 0;
                    class117.field2083 = 0;
                }
                class171.field2832 = true;
                class235.method1634(class59.field1164, (byte) 125);
                class145.method986(class135.field2318, -1, -1, false, false);
                class213.field3522 = class170.field2815;
                class61.field1192 = 100;
                class54.field1082 = 160;
            } else if (class54.field1082 == 160) {
                class267.method1873((byte) 122, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lg;)Lg;", line = 2342)
    public static final class181 method1995(class181 arg0) {
        int var1 = method1990(arg0).method2407(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class224.method1564(-127, arg0.field2970);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 2363)
    public final void method794(int arg0) {
        field4593++;
        if (class241.field4016) {
            class241.method1679();
        }
        if (class202.field3384 != null) {
            class273.method1936(class59.field1164, arg0 ^ 0x774C, class202.field3384);
            class202.field3384 = null;
        }
        if (class299.field4857 != null) {
            class299.field4857.field1841 = false;
        }
        class299.field4857 = null;
        if (class127.field2224 != null) {
            class127.field2224.method1646((byte) 81);
            class127.field2224 = null;
        }
        class263.method1848(class209.field3489, (byte) -51);
        class164.method1181(arg0 + 30543, class209.field3489);
        if (class285.field4662 != null) {
            class285.field4662.method2253(117, class209.field3489);
        }
        class345.method2436(16);
        class345.method2464(-26556);
        class285.field4662 = null;
        if (class125.field2205 != null) {
            class125.field2205.method136((byte) 92);
        }
        if (class96.field1746 != null) {
            class96.field1746.method136((byte) 92);
        }
        if (arg0 != -30542) {
            method1990((class181) null);
        }
        class90.field1608.method2471((byte) 70);
        class231.field3793.method2035(arg0 ^ 0xFFFF8832);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2414)
    public final void method803(byte arg0) {
        field4590++;
        method1986(0);
        class214.method1475();
        class252.method1777(arg0 ^ 0xFFFFCBD7);
        if (arg0 != 23) {
            field4592 = (String) null;
        }
        class24.method203((byte) -108);
        class38.method284();
        class23.method196((byte) -112);
        class108.method806(114);
        class241.method1684();
        class135.method951(-2);
        class83.method616(false);
        class68.method528((byte) -92);
        class146.method1009(arg0 ^ 0x7BEA);
        class237.method1640(true);
        class347.method2470(-122);
        class287.method2040(-31982);
        class219.method1528((byte) 0);
        class250.method1766(true);
        class206.method1419(73);
        class318.method2290(-29);
        class124.method894((byte) 51);
        class314.method2273((byte) 86);
        class273.method1937(125);
        class181.method1265(arg0 - 21);
        class248.method1751(arg0 - 23);
        class98.method746((byte) 123);
        class49.method430(arg0 - 23);
        class75.method578(2);
        class328.method2342(-126);
        class225.method1569(arg0 - 23);
        class345.method2456((byte) 97);
        class14.method148(256);
        class114.method845(false);
        class260.method1836((byte) -113);
        class300.method2146(2);
        class6.method51(false);
        class312.method2266(0);
        class107.method791((byte) 59);
        class88.method676(124);
        class355.method2519(-11197);
        class340.method2399(-111);
        class78.method593(true);
        class227.method1583((byte) -6);
        class266.method1867((byte) -107);
        class174.method1238((byte) -128);
        class133.method937((byte) 80);
        class325.method2328(1167582314);
        class96.method734(true);
        class145.method988(102);
        class27.method218(18059);
        class53.method461(-18898);
        class170.method1212((byte) -123);
        class201.method1373(-2105);
        class341.method2412((byte) -33);
        class19.method181((byte) -18);
        class132.method932(arg0 ^ 0x48BD);
        class128.method914(-8223);
        class163.method1172();
        class303.method2167((byte) -50);
        class213.method1471(arg0 + 84);
        class164.method1180((byte) -102);
        class50.method446(-5101);
        class173.method1229(2);
        class28.method221(arg0 ^ 0x62);
        class238.method1650(true);
        class159.method1147(arg0 ^ 0x6C);
        class259.method1819();
        class232.method1617(0);
        class48.method402();
        class223.method1558(arg0 + 3909);
        class294.method2099();
        class11.method117(125);
        class95.method719();
        class148.method1062(-1);
        class339.method2394(125);
        class205.method1395((byte) -120);
        class348.method2490((byte) -77);
        class239.method1666();
        class327.method2332();
        class178.method1258((byte) 123);
        class25.method208(arg0 - 23);
        class240.method1675(arg0 - 9037);
        class323.method2323((byte) 120);
        class84.method631();
        class354.method2516((byte) -125);
        class189.method1311(22700);
        class40.method305();
        class110.method824((byte) 125);
        class30.method231(1);
        class263.method1850(4);
        class127.method909((byte) 59);
        class168.method1193();
        class358.method2531(-1354);
        class1.method10((byte) -107);
        class161.method1155(-18);
        class20.method185(arg0 ^ 0x17);
        class66.method522((byte) -128);
        class251.method1771((byte) 24);
        class270.method1906();
        class274.method1950((byte) -62);
        class321.method2312(true);
        class301.method2154(arg0 ^ 0x73);
        class59.method490(-84);
        class352.method2506(1);
        class220.method1530(arg0 ^ 0xFFFF9786);
        class158.method1137(false);
        class192.method1330(0);
        class81.method601((byte) 66);
        class319.method2300(false);
        class5.method40(arg0 ^ 0x17);
        class198.method1351(106);
        class123.method887(false);
        class17.method171();
        class291.method2067((byte) -87);
        class99.method757(-96);
        class35.method256(-1);
        class22.method192((byte) -2);
        class269.method1883(-1);
        class362.method2545(false);
        class230.method1599();
        class125.method898((byte) 88);
        class255.method1788(true);
        class33.method243(7);
        class91.method701((byte) -105);
        class7.method65((byte) 72);
        class272.method1922(true);
        class142.method975((byte) -102);
        class216.method1511((byte) 114);
        class279.method1972();
        class271.method1915((byte) -8);
        class305.method2212();
        class320.method2303(arg0 ^ 0xE8);
        class257.method1797((byte) -93);
        class338.method2392(-106);
        class76.method583((byte) -81);
        class191.method1321(-14210);
        class77.method584((byte) 92);
        class194.method1341((byte) 64);
        class106.method789();
        class134.method945((byte) 97);
        class262.method1843();
        class162.method1163((byte) -82);
        class79.method596((byte) 66);
        class131.method925(1781);
        class47.method394(2);
        class351.method2499(-115);
        class152.method1087(-121);
        class172.method1220((byte) -79);
        class102.method772();
        class278.method1968(11799);
        class308.method2249((byte) -59);
        class16.method167((byte) 84);
        class332.method2351(0);
        class94.method716(-76);
        class267.method1872(arg0 ^ 0xFFFFFF8A);
        class209.method1446(arg0 ^ 0xFFFFFFE8);
        class165.method1182();
        class276.method1960(true);
        class222.method1554((byte) 59);
        class334.method2356(true);
        class315.method2274();
        class2.method15();
        class221.method1540();
        class121.method880();
        class296.method2131(128);
        class299.method2141((byte) -65);
        class282.method2006(false);
        class247.method1748();
        class337.method2386();
        class62.method501();
        class46.method376(arg0 - 149);
        class104.method782((byte) -54);
        class289.method2059((byte) 124);
        class190.method1315(4593);
        class199.method1363(arg0 ^ 0xFFFFFFA9);
        class353.method2515((byte) 21);
        class336.method2365((byte) 81);
        class60.method495();
        class292.method2072(arg0 - 13);
        class224.method1565((byte) -125);
        class212.method1464(0);
        class8.method92((byte) -125);
        class151.method1078(101);
        class176.method1254(29305);
        class356.method2527(arg0 ^ 0x1040);
        class363.method2548(-5230);
        class105.method784((byte) -72);
        class86.method663(arg0 - 27);
        class115.method849((byte) 123);
        class65.method519(-4391);
        class36.method266(-87);
        class156.method1107(arg0 ^ 0x15);
        class111.method833((byte) 125);
        class43.method368();
        class153.method1094(arg0 - 22);
        class138.method962(31757);
        class52.method455(-44);
        class160.method1151(0);
        class147.method1059(true);
        class37.method267((byte) -42);
        class10.method104(-291381620);
        class109.method816((byte) 102);
        class61.method499((byte) 76);
        class322.method2320();
        class261.method1840(arg0 + 52);
        class331.method2348(arg0 - 23);
        class149.method1067(2);
        class166.method1184(arg0 ^ 0xFFFFFFB5);
        class120.method875(113);
        class329.method2347();
        class74.method564();
        class202.method1382(0);
        class195.method1344((byte) -96);
        class200.method1369(-123);
        class253.method1783(21792);
        class29.method223();
        class169.method1203();
        class344.method2423(0);
        class44.method372(126);
        class324.method2326();
        class51.method449(arg0 - 24);
        class307.method2246();
        class256.method1791();
        class141.method971(-124);
        class317.method2287(-1);
        class295.method2122((byte) -101);
        class182.method1288(arg0 ^ 0x97);
        class275.method1952(-96);
        class103.method777(-16378);
        class311.method2263((byte) -118);
        class285.method2023(arg0 - 23);
        class197.method1347(-121);
        class54.method468((byte) -85);
        class217.method1514(-10080);
        class13.method131((byte) -119);
        class31.method236(true);
        class117.method860(true);
        class93.method713();
        class136.method953((byte) 122);
        class306.method2233(101);
        class244.method1731((byte) 112);
        class56.method476(-841102620);
        class18.method177(200);
        class207.method1435(arg0 + 6169);
        class57.method479(true);
        class171.method1218(-11587);
        class180.method1263((byte) -28);
        class12.method124(-402);
        class284.method2020(1441278124);
        class233.method1626((byte) -121);
        class342.method2414(1);
        class55.method471((byte) 126);
        class21.method188(2);
        class87.method667(true);
        class41.method324(false);
        class139.method964((byte) -97);
        class119.method869(69);
        class137.method955((byte) 127);
        class309.method2251(arg0 + 16327);
        class140.method965((byte) 119);
        class235.method1631(false);
        class73.method556(8099);
        class85.method651((byte) 100);
        class188.method1306((byte) -105);
        class92.method703(false);
        class359.method2535(109);
        class112.method834(arg0 + 81);
        class71.method538(0);
        class143.method979(2);
        class293.method2079(96);
        class231.method1616(arg0 - 23);
        class15.method162((byte) 58);
        class208.method1439((byte) -91);
        class144.method983(1158956368);
        class9.method98((byte) 123);
        class34.method247(-18569);
        class298.method2134(102);
        class229.method1591(false);
        class346.method2468(false);
        class167.method1188(-1290);
        class177.method1255(22807);
        class90.method692(arg0 + 42);
        class316.method2280(-5);
        class280.method1983(1);
        class82.method605((byte) 50);
        class130.method922(0);
        class58.method483(-20);
        class349.method2495((byte) -112);
        class97.method740((byte) 94);
        class26.method214(104);
        class234.method1629(arg0 - 83);
        if (class108.field1996) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2721)
    public static final void main(String[] arg0) {
        field4579++;
        try {
            if (arg0.length != 4) {
                class69.method532("argument count", 1);
            }
            class278.field4542 = Integer.parseInt(arg0[0]);
            class39.field848 = 2;
            if (arg0[1].equals("live")) {
                class217.field3620 = 0;
            } else if (arg0[1].equals("rc")) {
                class217.field3620 = 1;
            } else if (arg0[1].equals("wip")) {
                class217.field3620 = 2;
            } else {
                class69.method532("modewhat", 1);
            }
            class295.field4812 = false;
            class86.field1497 = class346.method2469(32, arg0[2]);
            if (class86.field1497 == -1) {
                if (arg0[2].equals("english")) {
                    class86.field1497 = 0;
                } else if (arg0[2].equals("german")) {
                    class86.field1497 = 1;
                } else {
                    class69.method532("language", 1);
                }
            }
            class15.method159(0, class86.field1497);
            class216.field3604 = false;
            class359.field5724 = false;
            if (arg0[3].equals("game0")) {
                class141.field2383 = 0;
            } else if (arg0[3].equals("game1")) {
                class141.field2383 = 1;
            } else {
                class69.method532("game", 1);
            }
            class200.field3359 = "";
            class114.field2059 = 0;
            class346.field5529 = false;
            class363.field5745 = 0;
            client var1 = new client();
            class111.field2036 = var1;
            var1.method807(0, class217.field3620 + 32, false, 553, 29, 1024, class141.field2383 == 1 ? "mechscape" : "runescape", 768);
            class274.field4469.setLocation(40, 40);
        } catch (Exception var3) {
            class348.method2493(-26700, var3, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 2795)
    private final void method1996(byte arg0) {
        field4584++;
        int var2 = -52 / ((arg0 + 55) / 56);
        if (class332.field5308 < class90.field1608.field5560) {
            field4589 = (class90.field1608.field5560 - 1) * 50 * 5;
            if (class65.field1239 == class177.field2934) {
                class177.field2934 = class160.field2714;
            } else {
                class177.field2934 = class65.field1239;
            }
            if (field4589 > 3000) {
                field4589 = 3000;
            }
            if (class90.field1608.field5560 >= 2 && class90.field1608.field5559 == 6) {
                this.method811(-125, "js5connect_outofdate");
                class334.field5326 = 1000;
                return;
            }
            if (class90.field1608.field5560 >= 4 && class90.field1608.field5559 == -1) {
                this.method811(-44, "js5crc");
                class334.field5326 = 1000;
                return;
            }
            if (class90.field1608.field5560 >= 4 && (class334.field5326 == 0 || class334.field5326 == 5)) {
                if (class90.field1608.field5559 == 7 || class90.field1608.field5559 == 9) {
                    this.method811(112, "js5connect_full");
                } else if (class90.field1608.field5559 <= 0) {
                    this.method811(-57, "js5io");
                } else {
                    this.method811(-96, "js5connect");
                }
                class334.field5326 = 1000;
                return;
            }
        }
        class332.field5308 = class90.field1608.field5560;
        if (field4589 > 0) {
            field4589--;
            return;
        }
        try {
            if (class65.field1238 == 0) {
                class177.field2936 = class59.field1164.method1120(class177.field2934, class199.field3348, -31246);
                class65.field1238++;
            }
            if (class65.field1238 == 1) {
                if (class177.field2936.field3504 == 2) {
                    this.method1998(123, 1000);
                    return;
                }
                if (class177.field2936.field3504 == 1) {
                    class65.field1238++;
                }
            }
            if (class65.field1238 == 2) {
                class23.field578 = new class237((Socket) class177.field2936.field3501, class59.field1164);
                class146 var3 = new class146(5);
                var3.method1027(15, -20374);
                var3.method1045((byte) -69, 553);
                class23.field578.method1645(var3.field2496, 5, -20326, 0);
                class65.field1238++;
                class56.field1104 = class218.method1520((byte) 96);
            }
            if (class65.field1238 == 3) {
                if (class334.field5326 == 0 || class334.field5326 == 5 || class23.field578.method1642((byte) -89) > 0) {
                    int var4 = class23.field578.method1639((byte) 125);
                    if (var4 != 0) {
                        this.method1998(110, var4);
                        return;
                    }
                    class65.field1238++;
                } else if ((class218.method1520((byte) 106) - class56.field1104) > 30000L) {
                    this.method1998(126, 1001);
                    return;
                }
            }
            if (class65.field1238 == 4) {
                boolean var5 = class334.field5326 == 5 || class334.field5326 == 10 || class334.field5326 == 28;
                class90.field1608.method2478(!var5, -30821, class23.field578);
                class23.field578 = null;
                class65.field1238 = 0;
                class177.field2936 = null;
            }
        } catch (IOException var7) {
            this.method1998(99, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 2946)
    public static final void method1997() {
        for (int var0 = -1; var0 < class255.field4184 + class252.field4144; var0++) {
            class6 var1;
            if (var0 < 0) {
                var1 = class96.field1750;
            } else if (var0 < class252.field4144) {
                var1 = class182.field3151[class22.field556[var0]];
            } else {
                var1 = class149.field2533[class23.field570[var0 - class252.field4144]];
            }
            if (var1.field123 >= 0) {
                int var2 = var1.method49((byte) -102);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field199 & 0x7F) != 0 || (var1.field213 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field199 & 0x7F) != 64 || (var1.field213 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field199 >> 7;
                    int var4 = var1.field213 >> 7;
                    if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104 && var1.field123 >= class316.field5140[var3][var4]) {
                        if (var1.field123 > class316.field5140[var3][var4]) {
                            class316.field5140[var3][var4] = var1.field123;
                            class31.field710[var3][var4] = 1;
                        } else {
                            var10002 = class31.field710[var3][var4]++;
                        }
                    }
                } else {
                    int var5 = var1.field199 - var2 * 64 >> 7;
                    int var6 = var1.field213 - var2 * 64 >> 7;
                    int var7 = var5 + var1.method49((byte) 56);
                    int var8 = var6 + var1.method49((byte) -127);
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
                            if (var1.field123 > class316.field5140[var9][var10]) {
                                class316.field5140[var9][var10] = var1.field123;
                                class31.field710[var9][var10] = 1;
                            } else if (class316.field5140[var9][var10] == var1.field123) {
                                var10002 = class31.field710[var9][var10]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 3055)
    private final void method1998(int arg0, int arg1) {
        field4586++;
        class177.field2936 = null;
        class90.field1608.field5559 = arg1;
        class65.field1238 = 0;
        class90.field1608.field5560++;
        if (arg0 <= 96) {
            method1988();
        }
        class23.field578 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 3074)
    private final void method1999(boolean arg0) {
        for (class277.field4509 = 0; class128.method916((byte) -57) && class277.field4509 < 128; class277.field4509++) {
            class28.field683[class277.field4509] = class363.field5752;
            class66.field1246[class277.field4509] = class311.field5071;
        }
        field4585++;
        class197.field3303++;
        if (class88.field1566 != -1) {
            class174.method1239(0, class287.field4696, class88.field1566, class133.field2287, 0, -2, 0, 0);
        }
        class83.field1436++;
        if (class241.field4016) {
            int var2 = 2359807;
            label202: for (int var3 = 0; var3 < 32768; var3++) {
                class314 var4 = class149.field2533[var3];
                if (var4 != null) {
                    byte var5 = var4.field5107.field1601;
                    if ((var5 & 0x2) > 0 && var4.field179 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field139[0] = (var4.field199 >> 7) + var6;
                            var4.field170[0] = (var4.field213 >> 7) + var7;
                            var4.field118[0] = 1;
                            class23.field576[class276.field4506].method1932(var4.method49((byte) 83), true, var4.field213 >> 7, var4.field199 >> 7, false, false, var4.method49((byte) -78), 0);
                            if (var4.field139[0] >= 0 && var4.field139[0] <= (104 - var4.method49((byte) -98)) && var4.field170[0] >= 0 && var4.field170[0] <= 104 - var4.method49((byte) -116) && class23.field576[class276.field4506].method1941(var4.field139[0], false, var4.field199 >> 7, var4.field170[0], var4.field213 >> 7)) {
                                if (var4.method49((byte) -75) > 1) {
                                    for (int var8 = var4.field139[0]; var4.field139[0] + var4.method49((byte) 100) > var8; var8++) {
                                        for (int var9 = var4.field170[0]; (var4.field170[0] + var4.method49((byte) -69)) > var9; var9++) {
                                            if ((class23.field576[class276.field4506].field4451[var8][var9] & var2) != 0) {
                                                continue label202;
                                            }
                                        }
                                    }
                                }
                                var4.field179 = 1;
                            }
                        }
                    }
                    class18.method176(-1, var4);
                    class199.method1364(var4, arg0);
                    class15.method156(-13351, var4);
                    class23.field576[class276.field4506].method1948(false, var4.field199 >> 7, var4.method49((byte) -98), var4.method49((byte) 109), false, var4.field213 >> 7, 1073741824);
                }
            }
        }
        if (!class241.field4016 && class141.field2383 == 0) {
            class200.method1371((byte) 42);
        } else if (class6.field124 == 0 && class65.field1234 == 0) {
            if (class69.field1280 == 2) {
                class217.method1519(83);
            } else {
                class314.method2272(23549);
            }
            if ((class223.field3693 >> 7) < 14 || (class223.field3693 >> 7) >= 90 || class16.field462 >> 7 < 14 || (class16.field462 >> 7) >= 90) {
                class351.method2502((byte) -120);
            }
        }
        while (true) {
            class47 var10;
            class181 var11;
            class181 var12;
            do {
                var10 = (class47) class86.field1501.method432(arg0);
                if (var10 == null) {
                    if (!arg0) {
                        return;
                    }
                    while (true) {
                        class47 var13;
                        class181 var14;
                        class181 var15;
                        do {
                            var13 = (class47) class130.field2250.method432(true);
                            if (var13 == null) {
                                while (true) {
                                    class47 var16;
                                    class181 var17;
                                    class181 var18;
                                    do {
                                        var16 = (class47) class261.field4296.method432(true);
                                        if (var16 == null) {
                                            if (class323.field5231 != null) {
                                                class83.method617((byte) 58);
                                            }
                                            if (class234.field3830 != null && class234.field3830.field3504 == 1) {
                                                if (class234.field3830.field3501 != null) {
                                                    class352.method2508(class331.field5293, 1190717, class83.field1439);
                                                }
                                                class331.field5293 = null;
                                                class234.field3830 = null;
                                                class83.field1439 = false;
                                            }
                                            if (class267.field4371 % 1500 == 0) {
                                                class46.method379(95);
                                            }
                                            return;
                                        }
                                        var17 = var16.field939;
                                        if (var17.field3023 < 0) {
                                            break;
                                        }
                                        var18 = class224.method1564(-99, var17.field2970);
                                    } while (var18 == null || var18.field3095 == null || var17.field3023 >= var18.field3095.length || var18.field3095[var17.field3023] != var17);
                                    class20.method184(var16, (byte) -93);
                                }
                            }
                            var14 = var13.field939;
                            if (var14.field3023 < 0) {
                                break;
                            }
                            var15 = class224.method1564(-93, var14.field2970);
                        } while (var15 == null || var15.field3095 == null || var14.field3023 >= var15.field3095.length || var15.field3095[var14.field3023] != var14);
                        class20.method184(var13, (byte) -10);
                    }
                }
                var11 = var10.field939;
                if (var11.field3023 < 0) {
                    break;
                }
                var12 = class224.method1564(-116, var11.field2970);
            } while (var12 == null || var12.field3095 == null || var11.field3023 >= var12.field3095.length || var12.field3095[var11.field3023] != var11);
            class20.method184(var10, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 3300)
    public static final void method2000() {
        class336.field5346 = 0;
        for (int var0 = 0; var0 < class255.field4184; var0++) {
            class314 var1 = class149.field2533[class23.field570[var0]];
            if (var1.field193 && var1.method56(-24) != -1) {
                int var2 = var1.field199 - (var1.method49((byte) -74) - 1) * 64;
                int var3 = var1.field213 - (var1.method49((byte) 113) - 1) * 64;
                class278 var4 = class148.method1060(class276.field4506, var2 >> 7, var3 >> 7);
                if (var4 != null) {
                    long var5 = var4.field4527;
                    int var7 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
                    class6 var8;
                    if ((var5 >>> 29 & 0x3L) == 0L) {
                        var8 = class182.field3151[var7];
                    } else {
                        var8 = class149.field2533[var7];
                        var7 += 2048;
                    }
                    if (var8.field222 == -1) {
                        class141.field2379[class336.field5346] = var7;
                        class363.field5747[class336.field5346++] = var7;
                        var8.field222 = 0;
                    }
                    class141.field2379[class336.field5346] = var7;
                    class363.field5747[class336.field5346++] = class23.field570[var0] + 2048;
                }
            }
        }
        class204.method1393((byte) -54, class363.field5747, class141.field2379, class336.field5346 - 1, 0);
    }
}
