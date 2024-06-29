import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class319 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "[S")
    public static short[] field3904 = new short[256];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "[[S")
    private static short[][] field3896 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Ljava/lang/String;")
    public static String field3915 = "Ok";

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lja;")
    public static class64 field3911;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBI)I", line = 9)
    public static final int method1784(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 120 / ((arg3 - 47) / 51);
        int var6 = 65536 - class174.field2732[arg0 * 1024 / arg1] >> 1;
        field3916++;
        return ((65536 - var6) * arg4 >> 16) + (arg2 * var6 >> 16);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 23)
    public final void method1785(int arg0) {
        class229.method1658((byte) -20);
        class229.field3651 = new class309();
        class275.field4276 = new class96();
        field3900++;
        if (class77.field1172 != 0) {
            class215.field3422 = new byte[50][];
        }
        class92.method662(-4, class83.field1235);
        if (class76.field1162 == 0) {
            class310.field4878 = this.getCodeBase().getHost();
            class235.field3704 = 443;
            class250.field3860 = 43594;
        } else if (class76.field1162 == 1) {
            class310.field4878 = this.getCodeBase().getHost();
            class250.field3860 = class222.field3560 + 40000;
            class235.field3704 = class222.field3560 + 50000;
        } else if (class76.field1162 == 2) {
            class235.field3704 = class222.field3560 + 50000;
            class310.field4878 = "127.0.0.1";
            class250.field3860 = class222.field3560 + 40000;
        }
        if (class141.field2241 == 1) {
            class143.field2257 = class126.field2001;
            class107.field1781 = class77.field1174;
            class310.field4881 = class62.field957;
            class277.field4288 = true;
            class211.field3370 = class224.field3599;
            class97.field1609 = 0;
            class97.field1616 = 16777215;
        } else {
            class211.field3370 = field3896;
            class143.field2257 = class84.field1254;
            class310.field4881 = class102.field1725;
            class107.field1781 = class317.field4942;
        }
        if (class325.field5048 == 3 && class76.field1162 != 2) {
            class193.field3072 = class222.field3560;
        }
        class309.field4866 = class235.field3704;
        if (arg0 < 91) {
            field3904 = (short[]) null;
        }
        class215.field3418 = class250.field3860;
        class56.field891 = class250.field3860;
        class19.field362 = field3904 = class177.field2775 = class13.field251 = new short[256];
        class42.field754 = class56.field891;
        class92.field1521 = class310.field4878;
        class305.method2109((byte) -127);
        class147.method1143(class2.field7, 98);
        class173.method1281(false, class2.field7);
        class185.field2941 = class261.method1849(-58);
        if (class185.field2941 != null) {
            class185.field2941.method667(class2.field7, 1);
        }
        class55.field872 = class325.field5048;
        try {
            if (class83.field1235.field5037 != null) {
                class83.field1242 = new class221(class83.field1235.field5037, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class30.field498[var2] = new class221(class83.field1235.field5050[var2], 6000, 0);
                }
                class233.field3694 = new class221(class83.field1235.field5043, 6000, 0);
                class102.field1723 = new class103(255, class83.field1242, class233.field3694, 500000);
                class92.field1520 = new class221(class83.field1235.field5044, 24, 0);
                class83.field1235.field5050 = null;
                class83.field1235.field5043 = null;
                class83.field1235.field5044 = null;
                class83.field1235.field5037 = null;
            }
        } catch (IOException var4) {
            class92.field1520 = null;
            class102.field1723 = null;
            class233.field3694 = null;
            class83.field1242 = null;
        }
        if (class76.field1162 != 0) {
            class4.field28 = true;
        }
        class221.field3544 = class163.field2552;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lob;)Lcg;", line = 139)
    public static final class42 method1786(class292 arg0) {
        class42 var1 = (class42) class269.field4170.method833(false, ((long) arg0.field4531 << 32) + (long) arg0.field4536);
        return var1 == null ? arg0.field4577 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lob;IIIIIII)V", line = 145)
    public static final void method1787(class292[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class292 var9 = arg0[var8];
            if (var9 != null && var9.field4587 == arg1 && (!var9.field4537 || var9.field4490 == 0 || var9.field4464 || method1786(var9).field738 != 0 || class6.field101 == var9 || var9.field4477 == 1338) && (!var9.field4537 || !method1790(var9))) {
                int var10 = var9.field4580 + arg6;
                int var11 = var9.field4605 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4490 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4608 + var10;
                    int var17 = var9.field4499 + var11;
                    if (var9.field4490 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class76.field1165 == var9) {
                    class79.field1203 = true;
                    class118.field1903 = var10;
                    class316.field4929 = var11;
                }
                if (!var9.field4537 || var12 < var14 && var13 < var15) {
                    if (var9.field4490 == 0) {
                        if (!var9.field4537 && method1790(var9) && class193.field3076 != var9) {
                            continue;
                        }
                        if (var9.field4460 && class203.field3225 >= var12 && class278.field4309 >= var13 && class203.field3225 < var14 && class278.field4309 < var15) {
                            for (class88 var18 = (class88) class143.field2250.method1490(200); var18 != null; var18 = (class88) class143.field2250.method1487((byte) 117)) {
                                if (var18.field1352) {
                                    var18.method1701(-90);
                                    var18.field1357.field4555 = false;
                                }
                            }
                            if (class256.field3956 == 0) {
                                class76.field1165 = null;
                                class6.field101 = null;
                            }
                            class159.field2513 = 0;
                        }
                    }
                    if (var9.field4537) {
                        boolean var19;
                        if (class203.field3225 >= var12 && class278.field4309 >= var13 && class203.field3225 < var14 && class278.field4309 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class260.field4033 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class152.field2452 == 1 && class223.field3569 >= var12 && class267.field4136 >= var13 && class223.field3569 < var14 && class267.field4136 < var15) {
                            var21 = true;
                        }
                        if (var9.field4527 != null) {
                            for (int var22 = 0; var22 < var9.field4527.length; var22++) {
                                if (class108.field1795[var9.field4527[var22]]) {
                                    if (var9.field4443 == null || class205.field3252 >= var9.field4443[var22]) {
                                        byte var23 = var9.field4449[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class108.field1795[86]) && ((var23 & 0x1) == 0 || class108.field1795[82]) && ((var23 & 0x4) == 0 || class108.field1795[81])) {
                                            class89.method642(56, -1, "", var22 + 1, var9.field4531);
                                            int var24 = var9.field4454[var22];
                                            if (var9.field4443 == null) {
                                                var9.field4443 = new int[var9.field4527.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4443[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4443[var22] = class205.field3252 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4443 != null) {
                                    var9.field4443[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class196.method1430(-9336, class267.field4136 - var11, var9, class223.field3569 - var10);
                        }
                        if (class76.field1165 != null && class76.field1165 != var9 && var19 && method1786(var9).method348(0)) {
                            class63.field994 = var9;
                        }
                        if (class6.field101 == var9) {
                            class143.field2261 = true;
                            class198.field3140 = var10;
                            class54.field859 = var11;
                        }
                        if (var9.field4464 || var9.field4477 != 0) {
                            if (var19 && class56.field893 != 0 && var9.field4494 != null) {
                                class88 var25 = new class88();
                                var25.field1352 = true;
                                var25.field1357 = var9;
                                var25.field1347 = class56.field893;
                                var25.field1340 = var9.field4494;
                                class143.field2250.method1493(-103, var25);
                            }
                            if (class76.field1165 != null || class180.field2885 != null || class243.field3754 || var9.field4477 != 1400 && class159.field2513 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4477 != 0) {
                                if (var9.field4477 == 1337) {
                                    class251.field3869 = var9;
                                    class143.method1091(var9, (byte) 82);
                                    continue;
                                }
                                if (var9.field4477 == 1338) {
                                    if (var21) {
                                        class268.field4161 = class223.field3569 - var10;
                                        class300.field4725 = class267.field4136 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4477 == 1400) {
                                    class91.field1500 = var9;
                                    if (var21) {
                                        if (class108.field1795[82] && class235.field3699 > 0) {
                                            int var26 = (int) ((double) (class223.field3569 - var10 - var9.field4608 / 2) * 2.0D / (double) class101.field1719);
                                            int var27 = (int) ((double) (class267.field4136 - var11 - var9.field4499 / 2) * 2.0D / (double) class101.field1719);
                                            int var28 = class40.field725 + var26;
                                            int var29 = class95.field1565 + var27;
                                            int var30 = class310.field4885 + var28;
                                            int var31 = class279.field4316 + class70.field1107 - var29 - 1;
                                            class183.method1374(0, var31, var30, (byte) -108);
                                            class14.method124(238);
                                            continue;
                                        }
                                        class159.field2513 = 1;
                                        class274.field4257 = class203.field3225;
                                        class328.field5081 = class278.field4309;
                                        continue;
                                    }
                                    if (var20 && class159.field2513 > 0) {
                                        if (class159.field2513 == 1 && (class274.field4257 != class203.field3225 || class328.field5081 != class278.field4309)) {
                                            class267.field4137 = class40.field725;
                                            class260.field4036 = class95.field1565;
                                            class159.field2513 = 2;
                                        }
                                        if (class159.field2513 == 2) {
                                            class67.method511((int) ((double) (class274.field4257 - class203.field3225) * 2.0D / (double) class54.field862) + class267.field4137, (byte) 107);
                                            class206.method1504((byte) 76, (int) ((double) (class328.field5081 - class278.field4309) * 2.0D / (double) class54.field862) + class260.field4036);
                                        }
                                        continue;
                                    }
                                    class159.field2513 = 0;
                                    continue;
                                }
                                if (var9.field4477 == 1401) {
                                    if (var20) {
                                        class75.method561(class203.field3225 - var10, class278.field4309 - var11, var9.field4608, var9.field4499, -1);
                                    }
                                    continue;
                                }
                                if (var9.field4477 == 1402) {
                                    if (!class265.field4126) {
                                        class143.method1091(var9, (byte) 82);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field4552 && var21) {
                                var9.field4552 = true;
                                if (var9.field4451 != null) {
                                    class88 var32 = new class88();
                                    var32.field1352 = true;
                                    var32.field1357 = var9;
                                    var32.field1350 = class223.field3569 - var10;
                                    var32.field1347 = class267.field4136 - var11;
                                    var32.field1340 = var9.field4451;
                                    class143.field2250.method1493(-81, var32);
                                }
                            }
                            if (var9.field4552 && var20 && var9.field4503 != null) {
                                class88 var33 = new class88();
                                var33.field1352 = true;
                                var33.field1357 = var9;
                                var33.field1350 = class203.field3225 - var10;
                                var33.field1347 = class278.field4309 - var11;
                                var33.field1340 = var9.field4503;
                                class143.field2250.method1493(-88, var33);
                            }
                            if (var9.field4552 && !var20) {
                                var9.field4552 = false;
                                if (var9.field4492 != null) {
                                    class88 var34 = new class88();
                                    var34.field1352 = true;
                                    var34.field1357 = var9;
                                    var34.field1350 = class203.field3225 - var10;
                                    var34.field1347 = class278.field4309 - var11;
                                    var34.field1340 = var9.field4492;
                                    class289.field4401.method1493(-85, var34);
                                }
                            }
                            if (var20 && var9.field4557 != null) {
                                class88 var35 = new class88();
                                var35.field1352 = true;
                                var35.field1357 = var9;
                                var35.field1350 = class203.field3225 - var10;
                                var35.field1347 = class278.field4309 - var11;
                                var35.field1340 = var9.field4557;
                                class143.field2250.method1493(-120, var35);
                            }
                            if (!var9.field4555 && var19) {
                                var9.field4555 = true;
                                if (var9.field4507 != null) {
                                    class88 var36 = new class88();
                                    var36.field1352 = true;
                                    var36.field1357 = var9;
                                    var36.field1350 = class203.field3225 - var10;
                                    var36.field1347 = class278.field4309 - var11;
                                    var36.field1340 = var9.field4507;
                                    class143.field2250.method1493(-120, var36);
                                }
                            }
                            if (var9.field4555 && var19 && var9.field4603 != null) {
                                class88 var37 = new class88();
                                var37.field1352 = true;
                                var37.field1357 = var9;
                                var37.field1350 = class203.field3225 - var10;
                                var37.field1347 = class278.field4309 - var11;
                                var37.field1340 = var9.field4603;
                                class143.field2250.method1493(-79, var37);
                            }
                            if (var9.field4555 && !var19) {
                                var9.field4555 = false;
                                if (var9.field4598 != null) {
                                    class88 var38 = new class88();
                                    var38.field1352 = true;
                                    var38.field1357 = var9;
                                    var38.field1350 = class203.field3225 - var10;
                                    var38.field1347 = class278.field4309 - var11;
                                    var38.field1340 = var9.field4598;
                                    class289.field4401.method1493(-84, var38);
                                }
                            }
                            if (var9.field4530 != null) {
                                class88 var39 = new class88();
                                var39.field1357 = var9;
                                var39.field1340 = var9.field4530;
                                class159.field2509.method1493(-124, var39);
                            }
                            if (var9.field4497 != null && class13.field249 > var9.field4607) {
                                if (var9.field4504 == null || class13.field249 - var9.field4607 > 32) {
                                    class88 var44 = new class88();
                                    var44.field1357 = var9;
                                    var44.field1340 = var9.field4497;
                                    class143.field2250.method1493(-97, var44);
                                } else {
                                    label568: for (int var40 = var9.field4607; var40 < class13.field249; var40++) {
                                        int var41 = class176.field2772[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field4504.length; var42++) {
                                            if (var9.field4504[var42] == var41) {
                                                class88 var43 = new class88();
                                                var43.field1357 = var9;
                                                var43.field1340 = var9.field4497;
                                                class143.field2250.method1493(-127, var43);
                                                break label568;
                                            }
                                        }
                                    }
                                }
                                var9.field4607 = class13.field249;
                            }
                            if (var9.field4586 != null && class274.field4258 > var9.field4518) {
                                if (var9.field4437 == null || class274.field4258 - var9.field4518 > 32) {
                                    class88 var49 = new class88();
                                    var49.field1357 = var9;
                                    var49.field1340 = var9.field4586;
                                    class143.field2250.method1493(-93, var49);
                                } else {
                                    label544: for (int var45 = var9.field4518; var45 < class274.field4258; var45++) {
                                        int var46 = class136.field2161[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field4437.length; var47++) {
                                            if (var9.field4437[var47] == var46) {
                                                class88 var48 = new class88();
                                                var48.field1357 = var9;
                                                var48.field1340 = var9.field4586;
                                                class143.field2250.method1493(-71, var48);
                                                break label544;
                                            }
                                        }
                                    }
                                }
                                var9.field4518 = class274.field4258;
                            }
                            if (var9.field4438 != null && class208.field3330 > var9.field4575) {
                                if (var9.field4560 == null || class208.field3330 - var9.field4575 > 32) {
                                    class88 var54 = new class88();
                                    var54.field1357 = var9;
                                    var54.field1340 = var9.field4438;
                                    class143.field2250.method1493(-91, var54);
                                } else {
                                    label520: for (int var50 = var9.field4575; var50 < class208.field3330; var50++) {
                                        int var51 = class101.field1699[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field4560.length; var52++) {
                                            if (var9.field4560[var52] == var51) {
                                                class88 var53 = new class88();
                                                var53.field1357 = var9;
                                                var53.field1340 = var9.field4438;
                                                class143.field2250.method1493(-113, var53);
                                                break label520;
                                            }
                                        }
                                    }
                                }
                                var9.field4575 = class208.field3330;
                            }
                            if (var9.field4455 != null && class323.field5023 > var9.field4444) {
                                if (var9.field4510 == null || class323.field5023 - var9.field4444 > 32) {
                                    class88 var59 = new class88();
                                    var59.field1357 = var9;
                                    var59.field1340 = var9.field4455;
                                    class143.field2250.method1493(-106, var59);
                                } else {
                                    label496: for (int var55 = var9.field4444; var55 < class323.field5023; var55++) {
                                        int var56 = class190.field3040[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field4510.length; var57++) {
                                            if (var9.field4510[var57] == var56) {
                                                class88 var58 = new class88();
                                                var58.field1357 = var9;
                                                var58.field1340 = var9.field4455;
                                                class143.field2250.method1493(-115, var58);
                                                break label496;
                                            }
                                        }
                                    }
                                }
                                var9.field4444 = class323.field5023;
                            }
                            if (var9.field4549 != null && class230.field3654 > var9.field4478) {
                                if (var9.field4596 == null || class230.field3654 - var9.field4478 > 32) {
                                    class88 var64 = new class88();
                                    var64.field1357 = var9;
                                    var64.field1340 = var9.field4549;
                                    class143.field2250.method1493(-128, var64);
                                } else {
                                    label472: for (int var60 = var9.field4478; var60 < class230.field3654; var60++) {
                                        int var61 = class289.field4405[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field4596.length; var62++) {
                                            if (var9.field4596[var62] == var61) {
                                                class88 var63 = new class88();
                                                var63.field1357 = var9;
                                                var63.field1340 = var9.field4549;
                                                class143.field2250.method1493(-97, var63);
                                                break label472;
                                            }
                                        }
                                    }
                                }
                                var9.field4478 = class230.field3654;
                            }
                            if (class180.field2889 > var9.field4546 && var9.field4481 != null) {
                                class88 var65 = new class88();
                                var65.field1357 = var9;
                                var65.field1340 = var9.field4481;
                                class143.field2250.method1493(-87, var65);
                            }
                            if (class169.field2625 > var9.field4546 && var9.field4606 != null) {
                                class88 var66 = new class88();
                                var66.field1357 = var9;
                                var66.field1340 = var9.field4606;
                                class143.field2250.method1493(-114, var66);
                            }
                            if (class292.field4543 > var9.field4546 && var9.field4540 != null) {
                                class88 var67 = new class88();
                                var67.field1357 = var9;
                                var67.field1340 = var9.field4540;
                                class143.field2250.method1493(-123, var67);
                            }
                            if (class56.field901 > var9.field4546 && var9.field4584 != null) {
                                class88 var68 = new class88();
                                var68.field1357 = var9;
                                var68.field1340 = var9.field4584;
                                class143.field2250.method1493(-119, var68);
                            }
                            if (class200.field3149 > var9.field4546 && var9.field4542 != null) {
                                class88 var69 = new class88();
                                var69.field1357 = var9;
                                var69.field1340 = var9.field4542;
                                class143.field2250.method1493(-96, var69);
                            }
                            var9.field4546 = class200.field3157;
                            if (var9.field4609 != null) {
                                for (int var70 = 0; var70 < class279.field4325; var70++) {
                                    class88 var71 = new class88();
                                    var71.field1357 = var9;
                                    var71.field1351 = class141.field2247[var70];
                                    var71.field1345 = class82.field1231[var70];
                                    var71.field1340 = var9.field4609;
                                    class143.field2250.method1493(-71, var71);
                                }
                            }
                            if (class123.field1968 && var9.field4585 != null) {
                                class88 var72 = new class88();
                                var72.field1357 = var9;
                                var72.field1340 = var9.field4585;
                                class143.field2250.method1493(-90, var72);
                            }
                        }
                    }
                    if (!var9.field4537 && class76.field1165 == null && class180.field2885 == null && !class243.field3754) {
                        if ((var9.field4467 >= 0 || var9.field4461 != 0) && class203.field3225 >= var12 && class278.field4309 >= var13 && class203.field3225 < var14 && class278.field4309 < var15) {
                            if (var9.field4467 >= 0) {
                                class193.field3076 = arg0[var9.field4467];
                            } else {
                                class193.field3076 = var9;
                            }
                        }
                        if (var9.field4490 == 8 && class203.field3225 >= var12 && class278.field4309 >= var13 && class203.field3225 < var14 && class278.field4309 < var15) {
                            class169.field2637 = var9;
                        }
                        if (var9.field4465 > var9.field4499) {
                            class60.method440(var9.field4608 + var10, var9, class278.field4309, var9.field4499, var9.field4465, class203.field3225, var11, false);
                        }
                    }
                    if (var9.field4490 == 0) {
                        method1787(arg0, var9.field4531, var12, var13, var14, var15, var10 - var9.field4505, var11 - var9.field4578);
                        if (var9.field4553 != null) {
                            method1787(var9.field4553, var9.field4531, var12, var13, var14, var15, var10 - var9.field4505, var11 - var9.field4578);
                        }
                        class224 var73 = (class224) class268.field4148.method833(false, (long) var9.field4531);
                        if (var73 != null) {
                            class78.method577(var14, var15, var73.field3596, var13, var12, (byte) 34, var11, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 920)
    private final void method1788(int arg0) {
        if (arg0 < 17) {
            this.method1796(36);
        }
        field3903++;
        if (class327.field5071 < class275.field4276.field1606) {
            if (class42.field754 == class215.field3418) {
                class42.field754 = class309.field4866;
            } else {
                class42.field754 = class215.field3418;
            }
            class273.field4242 = (class275.field4276.field1606 - 1) * 50 * 5;
            if (class273.field4242 > 3000) {
                class273.field4242 = 3000;
            }
            if (class275.field4276.field1606 >= 2 && class275.field4276.field1607 == 6) {
                this.method2186((byte) -43, "js5connect_outofdate");
                class22.field394 = 1000;
                return;
            }
            if (class275.field4276.field1606 >= 4 && class275.field4276.field1607 == -1) {
                this.method2186((byte) -43, "js5crc");
                class22.field394 = 1000;
                return;
            }
            if (class275.field4276.field1606 >= 4 && (class22.field394 == 0 || class22.field394 == 5)) {
                if (class275.field4276.field1607 == 7 || class275.field4276.field1607 == 9) {
                    this.method2186((byte) -43, "js5connect_full");
                } else if (class275.field4276.field1607 > 0) {
                    this.method2186((byte) -43, "js5connect");
                } else {
                    this.method2186((byte) -43, "js5io");
                }
                class22.field394 = 1000;
                return;
            }
        }
        class327.field5071 = class275.field4276.field1606;
        if (class273.field4242 > 0) {
            class273.field4242--;
            return;
        }
        try {
            if (class27.field440 == 0) {
                class243.field3762 = class83.field1235.method2224(class42.field754, class92.field1521, 92);
                class27.field440++;
            }
            if (class27.field440 == 1) {
                if (class243.field3762.field387 == 2) {
                    this.method1799(1000, 0);
                    return;
                }
                if (class243.field3762.field387 == 1) {
                    class27.field440++;
                }
            }
            if (class27.field440 == 2) {
                class280.field4327 = new class16((Socket) class243.field3762.field391, class83.field1235);
                class101 var2 = new class101(5);
                var2.method772((byte) -124, 15);
                var2.method784(82, 533);
                class280.field4327.method136(5, var2.field1661, (byte) -4, 0);
                class27.field440++;
                class314.field4915 = class154.method1172((byte) 121);
            }
            if (class27.field440 == 3) {
                if (class22.field394 == 0 || class22.field394 == 5 || class280.field4327.method137((byte) 93) > 0) {
                    int var3 = class280.field4327.method138(-5380);
                    if (var3 != 0) {
                        this.method1799(var3, 0);
                        return;
                    }
                    class27.field440++;
                } else if ((class154.method1172((byte) 101) - class314.field4915) > 30000L) {
                    this.method1799(1001, 0);
                    return;
                }
            }
            if (class27.field440 == 4) {
                boolean var4 = class22.field394 == 5 || class22.field394 == 10 || class22.field394 == 28;
                class275.field4276.method689((byte) 81, class280.field4327, !var4);
                class27.field440 = 0;
                class280.field4327 = null;
                class243.field3762 = null;
            }
        } catch (IOException var6) {
            this.method1799(1002, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1067)
    private final void method1789(byte arg0) {
        field3908++;
        if (arg0 != -49) {
            field3915 = (String) null;
        }
        boolean var2 = class275.field4276.method692(4);
        if (!var2) {
            this.method1788(115);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lob;)Z", line = 1084)
    public static final boolean method1790(class292 arg0) {
        if (class31.field523) {
            if (method1786(arg0).field738 != 0) {
                return false;
            }
            if (arg0.field4490 == 0) {
                return false;
            }
        }
        return arg0.field4515;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 1101)
    public static final String method1791(Throwable arg0, int arg1) throws IOException {
        field3910++;
        String var2;
        if ((arg0 instanceof class52)) {
            class52 var3 = (class52) arg0;
            var2 = var3.field819 + " | ";
            arg0 = var3.field818;
        } else {
            var2 = "";
        }
        if (arg1 != 32) {
            field3915 = (String) null;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1174)
    public final void init() {
        field3907++;
        if (!this.method2184((byte) 17)) {
            return;
        }
        class222.field3560 = Integer.parseInt(this.getParameter("worldid"));
        class76.field1162 = Integer.parseInt(this.getParameter("modewhere"));
        if (class76.field1162 < 0 || class76.field1162 > 1) {
            class76.field1162 = 0;
        }
        class77.field1172 = Integer.parseInt(this.getParameter("modewhat"));
        if (class77.field1172 < 0 || class77.field1172 > 2) {
            class77.field1172 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class177.field2778 = true;
        } else {
            class177.field2778 = false;
        }
        try {
            class195.field3111 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class195.field3111 = 0;
        }
        class273.method1968(class195.field3111, 0);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class289.field4412 = true;
        } else {
            class289.field4412 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class280.field4332 = true;
        } else {
            class280.field4332 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class141.field2241 = 1;
        } else {
            class141.field2241 = 0;
        }
        try {
            class132.field2118 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class132.field2118 = 0;
        }
        class232.field3677 = this.getParameter("settings");
        if (class232.field3677 == null) {
            class232.field3677 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class124.field1980 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class124.field1980 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class273.field4243 = true;
        } else {
            class273.field4243 = false;
        }
        class114.field1866 = this;
        this.method2188(1533, 765, class77.field1172 + 32, -118, 503);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 1257)
    private final void method1792(boolean arg0) {
        if (!class247.field3820) {
            label239: while (true) {
                do {
                    if (!class324.method2212(16)) {
                        break label239;
                    }
                } while (class123.field1969 != 's' && class123.field1969 != 'S');
                class247.field3820 = true;
            }
        }
        field3913++;
        if (class14.field266 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class154.method1172((byte) 125);
            if (class230.field3663 == 0L) {
                class230.field3663 = var4;
            }
            if (var3 > 16384 && var4 - class230.field3663 < 5000L) {
                if ((var4 - class236.field3713) > 1000L) {
                    System.gc();
                    class236.field3713 = var4;
                }
                class282.field4358 = 5;
                class319.field4963 = class54.field861;
            } else {
                class319.field4963 = class110.field1826;
                class14.field266 = 10;
                class282.field4358 = 5;
            }
        } else if (class14.field266 == 10) {
            class38.method305(4, 104, 104);
            for (int var6 = 0; var6 < 4; var6++) {
                class244.field3772[var6] = new class56(104, 104);
            }
            class319.field4963 = class156.field2489;
            class282.field4358 = 10;
            class14.field266 = 30;
        } else if (class14.field266 == 30) {
            if (class191.field3061 == null) {
                class191.field3061 = new class308(class275.field4276, class229.field3651);
            }
            if (class191.field3061.method2133((byte) -73)) {
                class137.field2175 = class78.method575(1000000, true, true, 0, false);
                class224.field3604 = class78.method575(1000000, true, true, 1, false);
                class78.field1200 = class78.method575(1000000, false, true, 2, true);
                class115.field1881 = class78.method575(1000000, true, true, 3, false);
                class285.field4372 = class78.method575(1000000, true, true, 4, false);
                class224.field3602 = class78.method575(1000000, true, true, 5, true);
                class111.field1842 = class78.method575(1000000, true, false, 6, true);
                class55.field878 = class78.method575(1000000, true, true, 7, false);
                class210.field3356 = class78.method575(1000000, true, true, 8, false);
                class176.field2769 = class78.method575(1000000, true, true, 9, false);
                class206.field3262 = class78.method575(1000000, true, true, 10, false);
                class207.field3272 = class78.method575(1000000, true, true, 11, false);
                class178.field2787 = class78.method575(1000000, true, true, 12, false);
                class292.field4534 = class78.method575(1000000, true, true, 13, false);
                class168.field2611 = class78.method575(1000000, true, false, 14, false);
                class13.field252 = class78.method575(1000000, true, true, 15, false);
                class29.field467 = class78.method575(1000000, true, true, 16, false);
                class175.field2761 = class78.method575(1000000, true, true, 17, false);
                class100.field1650 = class78.method575(1000000, true, true, 18, false);
                class51.field815 = class78.method575(1000000, true, true, 19, false);
                class311.field4895 = class78.method575(1000000, true, true, 20, false);
                class177.field2777 = class78.method575(1000000, true, true, 21, false);
                class141.field2242 = class78.method575(1000000, true, true, 22, false);
                class219.field3510 = class78.method575(1000000, true, true, 23, true);
                class226.field3612 = class78.method575(1000000, true, true, 24, false);
                class308.field4854 = class78.method575(1000000, true, true, 25, false);
                class46.field791 = class78.method575(1000000, true, true, 26, true);
                class136.field2157 = class78.method575(1000000, true, true, 27, false);
                class319.field4963 = class254.field3943;
                class14.field266 = 40;
                class282.field4358 = 15;
            } else {
                class282.field4358 = 12;
                class319.field4963 = class284.field4368;
            }
        } else if (class14.field266 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class278.field4308[var8].method1565(0) * class79.field1207[var8] / 100;
            }
            if (var7 == 100) {
                class319.field4963 = class191.field3059;
                class282.field4358 = 20;
                class151.method1159(class210.field3356, true);
                class136.method1046(-15581, class210.field3356);
                class120.method918((byte) -108, class210.field3356);
                class14.field266 = 45;
            } else {
                class282.field4358 = 20;
                if (var7 != 0) {
                    class319.field4963 = class26.field424 + var7 + "%";
                }
            }
        } else if (class14.field266 == 45) {
            class291.method2040(2, arg0, class151.field2424, 22050);
            class61.field955 = new class36();
            class61.field955.method272(128, false, 9);
            class213.field3400 = class247.method1754(0, 22050, class83.field1235, 0, class2.field7);
            class213.field3400.method91(class61.field955, (byte) -102);
            class82.method594(class61.field955, class285.field4372, (byte) -81, class168.field2611, class13.field252);
            class243.field3763 = class247.method1754(1, 2048, class83.field1235, 0, class2.field7);
            class128.field2045 = new class44();
            class243.field3763.method91(class128.field2045, (byte) -69);
            class19.field359 = new class173(22050, class213.field3404);
            class26.field426 = class111.field1842.method487(false, "scape main");
            class282.field4358 = 30;
            class14.field266 = 50;
            class319.field4963 = class236.field3715;
        } else if (class14.field266 == 50) {
            int var28 = class62.method448(class292.field4534, (byte) -63, class210.field3356);
            int var29 = class14.method118((byte) 112);
            if (var29 > var28) {
                class319.field4963 = class204.field3238 + var28 * 100 / var29 + "%";
                class282.field4358 = 35;
            } else {
                class319.field4963 = class57.field913;
                class14.field266 = 60;
                class282.field4358 = 35;
            }
        } else if (class14.field266 == 60) {
            int var26 = class282.method2007(0, class210.field3356);
            int var27 = class121.method927((byte) -109);
            if (var27 > var26) {
                class319.field4963 = class329.field5084 + var26 * 100 / var27 + "%";
                class282.field4358 = 40;
            } else {
                class14.field266 = 65;
                class282.field4358 = 40;
                class319.field4963 = class73.field1129;
            }
        } else if (class14.field266 == 65) {
            class84.method607(class210.field3356, class292.field4534, -121);
            class319.field4963 = class204.field3239;
            class282.field4358 = 45;
            class320.method2196(5, 0);
            class14.field266 = 70;
        } else if (class14.field266 == 70) {
            class78.field1200.method479(-105);
            byte var9 = 0;
            int var10 = var9 + class78.field1200.method474(12173);
            class29.field467.method479(-111);
            int var11 = var10 + class29.field467.method474(12173);
            class175.field2761.method479(-93);
            int var12 = var11 + class175.field2761.method474(12173);
            class100.field1650.method479(-111);
            int var13 = var12 + class100.field1650.method474(12173);
            class51.field815.method479(-83);
            int var14 = var13 + class51.field815.method474(12173);
            class311.field4895.method479(-85);
            int var15 = var14 + class311.field4895.method474(12173);
            class177.field2777.method479(-110);
            int var16 = var15 + class177.field2777.method474(12173);
            class141.field2242.method479(-109);
            int var17 = var16 + class141.field2242.method474(12173);
            class226.field3612.method479(-89);
            int var18 = var17 + class226.field3612.method474(12173);
            class308.field4854.method479(-113);
            int var19 = var18 + class308.field4854.method474(12173);
            class136.field2157.method479(-75);
            int var20 = var19 + class136.field2157.method474(12173);
            if (var20 < 1100) {
                class282.field4358 = 50;
                class319.field4963 = class20.field384 + var20 / 11 + "%";
            } else {
                class228.method1654(false, class78.field1200);
                class42.method340((byte) 29, class78.field1200);
                class67.method506(class78.field1200, 14662);
                class183.method1376(class55.field878, (byte) -59, class78.field1200);
                class295.method2073(class29.field467, true, 22400, class55.field878);
                class140.method1072(0, class55.field878, class100.field1650);
                class103.method790(class88.field1356, class55.field878, -117, class51.field815, true);
                class85.method612(class78.field1200, 2);
                class65.method496(class224.field3604, class311.field4895, (byte) -113, class137.field2175);
                class165.method1214((byte) -98, class78.field1200);
                class81.method587(class55.field878, 0, class177.field2777);
                class170.method1237(class141.field2242, (byte) -110);
                class86.method618(16, class78.field1200);
                class96.method693((byte) 7, class292.field4534, class115.field1881, class210.field3356, class55.field878);
                class149.method1150((byte) -70, class78.field1200);
                class41.method333(class175.field2761, 127);
                class78.method572(new class165(), class226.field3612, (byte) 103, class308.field4854);
                class2.method3(112, class226.field3612, class308.field4854);
                class118.method875(class78.field1200, -19470);
                class11.method104(class210.field3356, 48, class78.field1200);
                class255.method1807(class210.field3356, arg0, class78.field1200);
                class282.field4358 = 50;
                class319.field4963 = class317.field4938;
                class20.method160(0);
                class14.field266 = 80;
            }
        } else {
            if (arg0) {
                field3915 = (String) null;
            }
            if (class14.field266 == 80) {
                int var21 = class14.method120(-799, class210.field3356);
                int var22 = class170.method1241((byte) -82);
                if (var21 < var22) {
                    class282.field4358 = 60;
                    class319.field4963 = class4.field24 + var21 * 100 / var22 + "%";
                } else {
                    class125.method941(class210.field3356, -18560);
                    class14.field266 = 90;
                    class319.field4963 = class220.field3517;
                    class282.field4358 = 60;
                }
            } else if (class14.field266 == 90) {
                if (class46.field791.method479(-91)) {
                    class203 var23 = new class203(class176.field2769, class46.field791, class210.field3356, 20, !class298.field4704);
                    class174.method1305(var23);
                    if (class329.field5093 == 1) {
                        class174.method1290(0.9F);
                    }
                    if (class329.field5093 == 2) {
                        class174.method1290(0.8F);
                    }
                    if (class329.field5093 == 3) {
                        class174.method1290(0.7F);
                    }
                    if (class329.field5093 == 4) {
                        class174.method1290(0.6F);
                    }
                    class14.field266 = 100;
                    class282.field4358 = 70;
                    class319.field4963 = class101.field1655;
                } else {
                    class319.field4963 = class204.field3236 + class46.field791.method474(12173) + "%";
                    class282.field4358 = 70;
                }
            } else if (class14.field266 == 100) {
                if (class74.method557(class210.field3356, -16126)) {
                    class14.field266 = 110;
                }
            } else if (class14.field266 == 110) {
                class53.field831 = new class53();
                class83.field1235.method2237(10, class53.field831, (byte) 112);
                class282.field4358 = 75;
                class319.field4963 = class273.field4241;
                class14.field266 = 120;
            } else if (class14.field266 == 120) {
                if (class206.field3262.method468("huffman", (byte) -102, "")) {
                    class27 var25 = new class27(class206.field3262.method484("huffman", "", arg0));
                    class143.method1092(var25, (byte) 25);
                    class14.field266 = 130;
                    class282.field4358 = 80;
                    class319.field4963 = class240.field3737;
                } else {
                    class319.field4963 = class236.field3705 + "0%";
                    class282.field4358 = 80;
                }
            } else if (class14.field266 == 130) {
                if (!class115.field1881.method479(-86)) {
                    class319.field4963 = class141.field2244 + class115.field1881.method474(12173) * 3 / 4 + "%";
                    class282.field4358 = 85;
                } else if (!class178.field2787.method479(-91)) {
                    class319.field4963 = class141.field2244 + (class178.field2787.method474(12173) / 10 + 75) + "%";
                    class282.field4358 = 85;
                } else if (!class292.field4534.method479(-115)) {
                    class319.field4963 = class141.field2244 + (class292.field4534.method474(12173) / 20 + 85) + "%";
                    class282.field4358 = 85;
                } else if (class219.field3510.method469("details", -1465)) {
                    class78.method579(class134.field2125, -3, class219.field3510);
                    class319.field4963 = class120.field1933;
                    class282.field4358 = 95;
                    class14.field266 = 135;
                } else {
                    class319.field4963 = class141.field2244 + (class219.field3510.method461("details", (byte) 61) / 10 + 90) + "%";
                    class282.field4358 = 85;
                }
            } else if (class14.field266 == 135) {
                int var24 = class128.method959((byte) -103);
                if (var24 == -1) {
                    class319.field4963 = class156.field2476;
                    class282.field4358 = 95;
                } else if (var24 == 7 || var24 == 9) {
                    this.method2186((byte) -43, "worldlistfull");
                    class320.method2196(1000, 0);
                } else if (class196.field3123) {
                    class282.field4358 = 96;
                    class319.field4963 = class4.field22;
                    class14.field266 = 140;
                } else {
                    this.method2186((byte) -43, "worldlistio_" + var24);
                    class320.method2196(1000, 0);
                }
            } else if (class14.field266 == 140) {
                class212.field3380 = class115.field1881.method487(false, "loginscreen");
                class224.field3602.method492(false, 25, true);
                class111.field1842.method492(true, 25, true);
                class210.field3356.method492(true, 25, true);
                class292.field4534.method492(true, 25, true);
                class206.field3262.method492(true, 25, true);
                class115.field1881.method492(true, 25, true);
                class14.field266 = 150;
                class282.field4358 = 97;
                class319.field4963 = class43.field762;
                class216.field3460 = true;
            } else if (class14.field266 == 150) {
                class184.method1382();
                if (class247.field3820) {
                    class54.field860 = 0;
                    class141.field2240 = 0;
                    class12.field239 = 0;
                    class60.field945 = 0;
                }
                class247.field3820 = true;
                class41.method334(class83.field1235, true);
                class240.method1705(-1, class54.field860, -1, false, -1);
                class319.field4963 = class294.field4620;
                class14.field266 = 160;
                class282.field4358 = 100;
            } else if (class14.field266 == 160) {
                class98.method712(2957, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1763)
    public final void method1793(int arg0) {
        if (class265.field4126) {
            class265.method1883();
        }
        if (class52.field823 != null) {
            class157.method1180(false, class52.field823, class83.field1235);
            class52.field823 = null;
        }
        if (class83.field1235 != null) {
            class83.field1235.method2234(this.getClass(), false);
        }
        if (class53.field831 != null) {
            class53.field831.field834 = false;
        }
        class53.field831 = null;
        if (class127.field2032 != null) {
            class127.field2032.method131(-11918);
            class127.field2032 = null;
        }
        field3914++;
        class311.method2150(13134, class2.field7);
        class306.method2119(class2.field7, arg0 ^ 0xFFFFD95F);
        if (class185.field2941 != null) {
            class185.field2941.method671(class2.field7, (byte) -64);
        }
        class89.method634(2);
        class126.method949(arg0 ^ 0x7C);
        class185.field2941 = null;
        if (class213.field3400 != null) {
            class213.field3400.method90(arg0 + 31201);
        }
        if (class243.field3763 != null) {
            class243.field3763.method90(31201);
        }
        class275.field4276.method699(arg0);
        class229.field3651.method2136((byte) -72);
        try {
            if (class83.field1242 != null) {
                class83.field1242.method1597(-123);
            }
            if (class30.field498 != null) {
                for (int var2 = 0; var2 < class30.field498.length; var2++) {
                    if (class30.field498[var2] != null) {
                        class30.field498[var2].method1597(32);
                    }
                }
            }
            if (class233.field3694 != null) {
                class233.field3694.method1597(-29);
            }
            if (class92.field1520 != null) {
                class92.field1520.method1597(-112);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V", line = 1846)
    public static final void method1794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3897++;
        class292 var7 = class41.method330(arg1, arg3, ~arg2);
        if (var7 != null && var7.field4579 != null) {
            class88 var8 = new class88();
            var8.field1357 = var7;
            var8.field1340 = var7.field4579;
            class228.method1656(var8, (byte) -38);
        }
        class233.field3692 = arg1;
        if (arg2 != 0) {
            return;
        }
        class306.field4820 = arg0;
        class30.field493 = arg3;
        class88.field1349 = arg6;
        class273.field4240 = arg4;
        class329.field5083 = arg5;
        class219.field3514 = true;
        class143.method1091(var7, (byte) 41);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1875)
    public final void method1795(int arg0) {
        field3898++;
        if (class22.field394 == 1000) {
            return;
        }
        class205.field3252++;
        if ((class205.field3252 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class101.field1696 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class272.field4208.setSeed((long) class101.field1696);
        }
        this.method1789((byte) -49);
        if (class191.field3061 != null) {
            class191.field3061.method2130(-8439);
        }
        class134.method1013(-26724);
        if (arg0 >= -100) {
            field3902 = 65;
        }
        class84.method605((byte) 52);
        class108.method823(true);
        class46.method363((byte) 124);
        if (class265.field4126) {
            class214.method1549();
        }
        if (class185.field2941 != null) {
            int var3 = class185.field2941.method669((byte) -88);
            class56.field893 = var3;
        }
        if (class22.field394 == 0) {
            this.method1792(false);
            class180.method1344(124);
        } else if (class22.field394 == 5) {
            this.method1792(false);
            class180.method1344(125);
        } else if (class22.field394 == 25 || class22.field394 == 28) {
            class319.method2185(0);
        }
        if (class22.field394 == 10) {
            this.method1797(6230);
            class78.method574(true);
            class176.method1312((byte) 123);
            class89.method630(-117);
        } else if (class22.field394 == 30) {
            class185.method1391((byte) -15);
        } else if (class22.field394 == 40) {
            class89.method630(-120);
            if (class307.field4839 != -3) {
                if (class307.field4839 == 15) {
                    class185.method1388(116);
                } else if (class307.field4839 != 2) {
                    class31.method218(120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1967)
    public final void method1796(int arg0) {
        method1800(0);
        class310.method2145((byte) -92);
        class169.method1235(123);
        class198.method1440((byte) -2);
        field3906++;
        class300.method2092((byte) 107);
        class3.method5(0);
        class236.method1686(-18113);
        class232.method1675(-116);
        class319.method2191((byte) -52);
        class265.method1884();
        class327.method2241((byte) 124);
        class206.method1502((byte) -104);
        class53.method393(false);
        class210.method1529(117);
        class101.method755(true);
        class16.method133(-125);
        class309.method2138(false);
        class308.method2134(-24);
        class216.method1564(0);
        class64.method471(-21582);
        class221.method1604(-120);
        class103.method798(1);
        class259.method1836(-82);
        class305.method2110((byte) 127);
        class34.method244(-16157);
        class56.method408(-57);
        class292.method2055((byte) -91);
        class302.method2103(14833);
        class30.method206(6);
        class204.method1494(3);
        class126.method951((byte) 116);
        class110.method834(40);
        class93.method670((byte) 19);
        class74.method554(-7698);
        class92.method663(-1);
        class36.method264(false);
        class11.method85((byte) 87);
        class173.method1279((byte) 35);
        class246.method1743(-16973);
        class269.method1934(-125);
        class89.method638(118);
        class272.method1964(30618);
        class6.method20(3);
        class297.method2079(-1);
        class208.method1514(0);
        class224.method1626(117);
        class42.method346(-102);
        class240.method1704(-4);
        class222.method1610(-1);
        class263.method1873(29508);
        class270.method1949(-3);
        class312.method2152(-79);
        class18.method148(false);
        class277.method1983(-1585);
        class284.method2012((byte) -83);
        class188.method1402(89);
        class134.method1012(-123);
        class43.method349((byte) 97);
        class243.method1729(127);
        class52.method384((byte) -107);
        class76.method565((byte) 123);
        class260.method1842((byte) 62);
        class228.method1655(-1);
        class55.method403(45);
        class13.method114(-96);
        class151.method1160(21197);
        class97.method705();
        class77.method569(84);
        class130.method982();
        class293.method2060((byte) 63);
        class171.method1270();
        class179.method1340(10);
        class146.method1111();
        class128.method958(-79);
        class99.method715((byte) -53);
        class163.method1208(74);
        class104.method809(0);
        class214.method1548();
        class213.method1547((byte) 52);
        class79.method582(-106);
        class242.method1723(25771);
        class274.method1973((byte) 100);
        class135.method1037();
        class231.method1672(92);
        class86.method624(true);
        class227.method1637();
        class84.method602(8741);
        class295.method2072(128);
        class51.method381(128);
        class241.method1710();
        class38.method317();
        class141.method1079(128);
        class20.method159(109);
        class317.method2179(71);
        class83.method598(-96);
        class182.method1359();
        class108.method827(-50);
        class73.method550(31);
        class37.method303((byte) 121);
        class78.method573(21);
        class285.method2025((byte) 35);
        class323.method2208((byte) -102);
        class195.method1426(-64);
        class261.method1851((byte) 102);
        class31.method214((byte) -59);
        class244.method1738(-344623610);
        class247.method1758((byte) 125);
        class211.method1534(-12906);
        class63.method456(128);
        class90.method651(122);
        class278.method1990((byte) 19);
        class33.method234(30);
        class143.method1094(9676);
        class268.method1926(-13012);
        class219.method1579(24754);
        class152.method1167(true);
        class111.method846(false);
        class249.method1767((byte) 40);
        class29.method196(31);
        class203.method1477(54);
        class24.method165(-1);
        class174.method1306();
        class205.method1501(-1);
        class197.method1436(-126);
        class196.method1433((byte) 4);
        class120.method920(0);
        class125.method943(107);
        class184.method1381();
        class107.method817(-3513);
        class109.method831(0);
        class230.method1664((byte) 69);
        class88.method629((byte) -121);
        class320.method2195(123);
        class124.method936(0);
        class186.method1400();
        class45.method361((byte) -91);
        class94.method675(0);
        class189.method1406(true);
        class114.method863(0);
        class87.method625(-78);
        class183.method1375((byte) 74);
        class298.method2083((byte) 86);
        class194.method1423();
        class2.method2(8);
        class98.method711(true);
        class14.method121(81);
        class153.method1171();
        class318.method2182(0);
        class218.method1575();
        class256.method1813((byte) -69);
        class69.method527();
        class131.method997();
        class207.method1507(110);
        class60.method442(-16);
        class4.method7(-97);
        class62.method447((byte) -41);
        class254.method1804(true);
        class102.method787((byte) -106);
        class136.method1041(0);
        class15.method127();
        class118.method873((byte) -126);
        class132.method1004(0);
        class262.method1868();
        class157.method1183(1);
        class294.method2066(2047);
        class85.method613((byte) 86);
        class220.method1591((byte) 114);
        class115.method864((byte) 22);
        class10.method82((byte) -89);
        class258.method1822(-125);
        class185.method1394(-105);
        class250.method1770((byte) 107);
        class168.method1229((byte) 101);
        class170.method1236((byte) 90);
        class57.method431(true);
        class180.method1342(2);
        class48.method375((byte) 123);
        class160.method1193(-1);
        class255.method1808((byte) 51);
        class100.method719(true);
        class70.method539(32);
        class238.method1689();
        class190.method1410(119);
        class81.method588(-1);
        class226.method1634(31308);
        class116.method870(255);
        class311.method2149(0);
        class39.method323((byte) 41);
        class129.method963();
        class257.method1815();
        class61.method446((byte) 103);
        class46.method366(1);
        class229.method1661((byte) 116);
        class326.method2239(false);
        class112.method858();
        class299.method2086();
        class289.method2033(false);
        class23.method162(1);
        class167.method1224();
        class32.method221();
        class91.method654(true);
        class275.method1976(-92);
        class303.method2104(25);
        class28.method183(112);
        class156.method1173(-3);
        class54.method398(0);
        class176.method1313((byte) -54);
        class248.method1764(false);
        class281.method2005(-13482);
        class191.method1416(-1);
        class280.method2000(false);
        if (arg0 >= -48) {
            method1787((class292[]) null, 61, 46, 86, 67, -105, -3, -21);
        }
        class215.method1558(56);
        class149.method1151((byte) 69);
        class177.method1317(false);
        class288.method2028(-77);
        class67.method509(-43);
        class282.method2008(-23023);
        class307.method2125(125);
        class138.method1056((byte) 71);
        class75.method564(14238);
        class181.method1349(122);
        class140.method1074(false);
        class147.method1144(true);
        class95.method680(4096);
        class245.method1739(false);
        class50.method380(0);
        class148.method1147(true);
        class59.method439(22452);
        class301.method2097(1);
        class65.method498(-92);
        class9.method76(true);
        class212.method1536((byte) 125);
        class276.method1979((byte) -118);
        class233.method1679(0);
        class12.method113((byte) 67);
        class82.method593((byte) 53);
        class123.method931(-118);
        class273.method1967((byte) -102);
        class8.method69((byte) -63);
        class127.method957(false);
        class291.method2035(2);
        class251.method1776(false);
        class252.method1779((byte) 63);
        class202.method1464(-8446);
        class145.method1099(-62);
        class279.method1995((byte) 61);
        class175.method1309(-65);
        class40.method328(-1);
        class324.method2215((byte) -111);
        class41.method332(906);
        class68.method514(127);
        class19.method154((byte) 120);
        class239.method1699(-28160);
        class193.method1420(10797);
        class71.method546(true);
        class137.method1048((byte) -24);
        class162.method1202(0);
        class26.method176(92);
        class235.method1685(-112);
        class159.method1190((byte) 4);
        class178.method1322(1);
        class267.method1920((byte) -119);
        class150.method1153(-114);
        class264.method1878(true);
        class139.method1059((byte) -97);
        class217.method1570(125);
        class329.method2248(123);
        if (class319.field4989) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2246)
    public static final void main(String[] arg0) {
        field3912++;
        try {
            if (arg0.length != 4) {
                class243.method1728("argument count", (byte) 80);
            }
            class222.field3560 = Integer.parseInt(arg0[0]);
            class76.field1162 = 2;
            if (arg0[1].equals("live")) {
                class77.field1172 = 0;
            } else if (arg0[1].equals("rc")) {
                class77.field1172 = 1;
            } else if (arg0[1].equals("wip")) {
                class77.field1172 = 2;
            } else {
                class243.method1728("modewhat", (byte) 50);
            }
            class177.field2778 = false;
            class195.field3111 = class14.method119(arg0[2], 25540);
            if (class195.field3111 == -1) {
                if (arg0[2].equals("english")) {
                    class195.field3111 = 0;
                } else if (arg0[2].equals("german")) {
                    class195.field3111 = 1;
                } else {
                    class243.method1728("language", (byte) 66);
                }
            }
            class273.method1968(class195.field3111, 0);
            class280.field4332 = false;
            class289.field4412 = false;
            if (arg0[3].equals("game0")) {
                class141.field2241 = 0;
            } else if (arg0[3].equals("game1")) {
                class141.field2241 = 1;
            } else {
                class243.method1728("game", (byte) 15);
            }
            class124.field1980 = 0;
            class273.field4243 = false;
            class132.field2118 = 0;
            class232.field3677 = "";
            client var1 = new client();
            class114.field1866 = var1;
            var1.method2190("runescape", 64, class77.field1172 + 32, 768, 1024, false, 28, 533);
            class81.field1219.setLocation(40, 40);
        } catch (Exception var3) {
            class134.method1009(-2, (String) null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2315)
    private final void method1797(int arg0) {
        field3901++;
        for (class279.field4325 = 0; class324.method2212(16) && class279.field4325 < 128; class279.field4325++) {
            class141.field2247[class279.field4325] = class86.field1308;
            class82.field1231[class279.field4325] = class123.field1969;
        }
        class122.field1952++;
        if (class122.field1950 != -1) {
            class78.method577(class180.field2880, class73.field1127, class122.field1950, 0, 0, (byte) 34, 0, 0);
        }
        class200.field3157++;
        if (class265.field4126) {
            int var2 = 19137023;
            label192: for (int var3 = 0; var3 < 32768; var3++) {
                class305 var4 = class138.field2196[var3];
                if (var4 != null) {
                    byte var5 = var4.field4778.field3288;
                    if ((var5 & 0x2) > 0 && var4.field1365 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1386[0] = (var4.field1442 >> 7) + var6;
                            var4.field1388[0] = (var4.field1369 >> 7) + var7;
                            var4.field1431[0] = 1;
                            class244.field3772[class41.field734].method418(var4.method200(-1), 0, false, var4.field1442 >> 7, -115, var4.field1369 >> 7, var4.method200(-1));
                            if (var4.field1386[0] >= 0 && var4.field1386[0] <= (104 - var4.method200(-1)) && var4.field1388[0] >= 0 && var4.field1388[0] <= (104 - var4.method200(-1)) && class244.field3772[class41.field734].method424(var4.field1388[0], var4.field1386[0], var4.field1369 >> 7, var4.field1442 >> 7, (byte) 40)) {
                                if (var4.method200(-1) > 1) {
                                    for (int var8 = var4.field1386[0]; var8 < (var4.field1386[0] + var4.method200(-1)); var8++) {
                                        for (int var9 = var4.field1388[0]; var4.field1388[0] + var4.method200(-1) > var9; var9++) {
                                            if ((var2 & class244.field3772[class41.field734].field879[var8][var9]) != 0) {
                                                continue label192;
                                            }
                                        }
                                    }
                                }
                                var4.field1365 = 1;
                            }
                        }
                    }
                    class196.method1429(var4, (byte) 96);
                    class291.method2037(114, var4);
                    class108.method828(-1, var4);
                    class244.field3772[class41.field734].method412((byte) -81, var4.method200(-1), var4.field1369 >> 7, var4.field1442 >> 7, false, var4.method200(-1));
                }
            }
        }
        if (!class265.field4126) {
            class87.method626(arg0 ^ 0x21AB);
        } else if (class277.field4293 == 0 && class316.field4932 == 0) {
            if (class62.field960 == 2) {
                class128.method962(2);
            } else {
                class301.method2095(arg0 ^ 0xFFFF8F74);
            }
            if (class140.field2223 >> 7 < 14 || (class140.field2223 >> 7) >= 90 || class312.field4904 >> 7 < 14 || class312.field4904 >> 7 >= 90) {
                class139.method1058(17398);
            }
        }
        while (true) {
            class88 var10;
            class292 var17;
            class292 var18;
            do {
                var10 = (class88) class159.field2509.method1496(-29960);
                if (var10 == null) {
                    while (true) {
                        class88 var11;
                        class292 var15;
                        class292 var16;
                        do {
                            var11 = (class88) class289.field4401.method1496(arg0 ^ 0xFFFF92AE);
                            if (var11 == null) {
                                while (true) {
                                    class88 var12;
                                    class292 var13;
                                    class292 var14;
                                    do {
                                        var12 = (class88) class143.field2250.method1496(arg0 ^ 0xFFFF92AE);
                                        if (var12 == null) {
                                            if (class76.field1165 != null) {
                                                class52.method388(arg0 - 6191);
                                            }
                                            if (class48.field800 != null && class48.field800.field387 == 1) {
                                                if (class48.field800.field391 != null) {
                                                    class295.method2071((byte) 62, class95.field1571, class183.field2929);
                                                }
                                                class48.field800 = null;
                                                class95.field1571 = null;
                                                class183.field2929 = false;
                                            }
                                            if (arg0 != 6230) {
                                                return;
                                            }
                                            if (class205.field3252 % 1500 == 0) {
                                                class54.method395(arg0 ^ 0xFFFFE7C1);
                                            }
                                            return;
                                        }
                                        var13 = var12.field1357;
                                        if (var13.field4536 < 0) {
                                            break;
                                        }
                                        var14 = class215.method1555((byte) -48, var13.field4587);
                                    } while (var14 == null || var14.field4553 == null || var13.field4536 >= var14.field4553.length || var14.field4553[var13.field4536] != var13);
                                    class228.method1656(var12, (byte) -106);
                                }
                            }
                            var15 = var11.field1357;
                            if (var15.field4536 < 0) {
                                break;
                            }
                            var16 = class215.method1555((byte) -48, var15.field4587);
                        } while (var16 == null || var16.field4553 == null || var16.field4553.length <= var15.field4536 || var16.field4553[var15.field4536] != var15);
                        class228.method1656(var11, (byte) -118);
                    }
                }
                var17 = var10.field1357;
                if (var17.field4536 < 0) {
                    break;
                }
                var18 = class215.method1555((byte) -48, var17.field4587);
            } while (var18 == null || var18.field4553 == null || var17.field4536 >= var18.field4553.length || var18.field4553[var17.field4536] != var17);
            class228.method1656(var10, (byte) -68);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lob;)Lob;", line = 2528)
    public static final class292 method1798(class292 arg0) {
        int var1 = method1786(arg0).method338((byte) 112);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class215.method1555((byte) -48, arg0.field4587);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 2550)
    private final void method1799(int arg0, int arg1) {
        class280.field4327 = null;
        class27.field440 = arg1;
        class243.field3762 = null;
        class275.field4276.field1606++;
        class275.field4276.field1607 = arg0;
        field3905++;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2562)
    public static void method1800(int arg0) {
        field3896 = (short[][]) null;
        field3911 = null;
        if (arg0 == 0) {
            field3915 = null;
            field3904 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 2579)
    public final void method1801(boolean arg0) {
        field3899++;
        if (class22.field394 == 1000) {
            return;
        }
        boolean var2 = class121.method926(false);
        if (var2 && class165.field2559 && class213.field3400 != null) {
            class213.field3400.method87(15443);
        }
        if ((class22.field394 == 30 || class22.field394 == 10) && (class132.field2112 || class176.field2770 != 0L && class176.field2770 < class154.method1172((byte) 85))) {
            class240.method1705(-1, class242.method1719(0), class247.field3825, class132.field2112, class107.field1786);
        }
        if (class52.field823 == null) {
            Container var3;
            if (class52.field823 != null) {
                var3 = class52.field823;
            } else if (class81.field1219 == null) {
                var3 = class83.field1235.field5052;
            } else {
                var3 = class81.field1219;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class81.field1219 == var3) {
                Insets var6 = class81.field1219.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class64.field1053 != var4 || class297.field4686 != var5) {
                if (class325.field5042.startsWith("mac")) {
                    class64.field1053 = var4;
                    class297.field4686 = var5;
                } else {
                    class229.method1658((byte) 116);
                }
                class176.field2770 = class154.method1172((byte) 111) + 500L;
            }
        }
        if (class52.field823 != null && !class236.field3707 && (class22.field394 == 30 || class22.field394 == 10)) {
            class240.method1705(-1, class54.field860, -1, false, -1);
        }
        boolean var7 = arg0;
        if (class28.field459) {
            var7 = true;
            class28.field459 = false;
        }
        if (var7) {
            class136.method1040(8529);
        }
        if (class265.field4126) {
            for (int var8 = 0; var8 < 100; var8++) {
                class30.field502[var8] = true;
            }
        }
        if (class22.field394 == 0) {
            class64.method478(class282.field4358, class319.field4963, (Color) null, (byte) 74, var7);
        } else if (class22.field394 == 5) {
            class176.method1315(false, class95.field1558, true);
        } else if (class22.field394 == 10) {
            class70.method537(false);
        } else if (class22.field394 == 25 || class22.field394 == 28) {
            if (class278.field4296 == 1) {
                if (class302.field4757 < class185.field2950) {
                    class302.field4757 = class185.field2950;
                }
                int var9 = (class302.field4757 - class185.field2950) * 50 / class302.field4757;
                class17.method144((byte) -103, class64.field1015 + "<br>(" + var9 + "%)", false);
            } else if (class278.field4296 == 2) {
                if (class231.field3672 > class18.field352) {
                    class18.field352 = class231.field3672;
                }
                int var10 = (class18.field352 - class231.field3672) * 50 / class18.field352 + 50;
                class17.method144((byte) 64, class64.field1015 + "<br>(" + var10 + "%)", false);
            } else {
                class17.method144((byte) 122, class64.field1015, false);
            }
        } else if (class22.field394 == 30) {
            class19.method151((byte) 114);
        } else if (class22.field394 == 40) {
            class17.method144((byte) 61, class107.field1792 + "<br>" + class48.field804, false);
        }
        if (class265.field4126 && class22.field394 != 0) {
            class265.method1912();
            for (int var17 = 0; var17 < class319.field4983; var17++) {
                class301.field4734[var17] = false;
            }
        } else if ((class22.field394 == 30 || class22.field394 == 10) && class274.field4261 == 0 && !var7) {
            try {
                Graphics var14 = class2.field7.getGraphics();
                for (int var15 = 0; var15 < class319.field4983; var15++) {
                    if (class301.field4734[var15]) {
                        class222.field3556.method1217(-97, class260.field4042[var15], class230.field3661[var15], class258.field3981[var15], var14, class104.field1758[var15]);
                        class301.field4734[var15] = false;
                    }
                }
            } catch (Exception var18) {
                class2.field7.repaint();
            }
        } else if (class22.field394 != 0) {
            try {
                Graphics var11 = class2.field7.getGraphics();
                class222.field3556.method1216(0, 0, 0, var11);
                for (int var12 = 0; var12 < class319.field4983; var12++) {
                    class301.field4734[var12] = false;
                }
            } catch (Exception var19) {
                class2.field7.repaint();
            }
        }
        if (class216.field3460) {
            class255.method1810((byte) 43);
        }
        if (class247.field3820 && class22.field394 == 10 && class122.field1950 != -1) {
            class247.field3820 = false;
            class41.method334(class83.field1235, true);
        }
    }
}
