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
public class client extends class263 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "[I")
    public static int[] field636 = new int[256];

    @OriginalMember(owner = "client!client", name = "P", descriptor = "Lg;")
    public static class67 field628 = new class67(64);

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field647 = -1;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
    public static int[] field646;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 6)
    public static final void method341(byte arg0) {
        field637++;
        class320.field4814.method462(24);
        class148.field2130.method462(24);
        int var1 = -112 % ((arg0 - 26) / 52);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 19)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class181.method1260(124, "argument count");
            }
            class359.field5624 = Integer.parseInt(arg0[0]);
            class14.field214 = 2;
            if (arg0[1].equals("live")) {
                class59.field870 = 0;
            } else if (arg0[1].equals("rc")) {
                class59.field870 = 1;
            } else if (arg0[1].equals("wip")) {
                class59.field870 = 2;
            } else {
                class181.method1260(107, "modewhat");
            }
            class356.field5459 = false;
            class54.field789 = class316.method2202(arg0[2], (byte) -125);
            if (class54.field789 == -1) {
                if (arg0[2].equals("english")) {
                    class54.field789 = 0;
                } else if (arg0[2].equals("german")) {
                    class54.field789 = 1;
                } else {
                    class181.method1260(91, "language");
                }
            }
            class107.method818(class54.field789, -15875);
            class8.field147 = false;
            class158.field2272 = false;
            if (arg0[3].equals("game0")) {
                class164.field2335 = 0;
            } else if (arg0[3].equals("game1")) {
                class164.field2335 = 1;
            } else {
                class181.method1260(118, "game");
            }
            class177.field2543 = 0;
            class129.field1873 = 0;
            class299.field4468 = false;
            class294.field4432 = "";
            client var1 = new client();
            class300.field4493 = var1;
            var1.method1958(29, false, class164.field2335 == 1 ? "mechscape" : "runescape", (byte) 25, 768, 1024, class59.field870 + 32, 552);
            class131.field1905.setLocation(40, 40);
        } catch (Exception var3) {
            class343.method2402((String) null, var3, -2);
        }
        field644++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 87)
    public static final void method342(byte arg0) {
        class57.field845.method458((byte) -80);
        class292.field4423.method458((byte) 99);
        int var1 = -112 % ((48 - arg0) / 59);
        field645++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 99)
    public static final void method343() {
        for (int var0 = 0; var0 < 104; var0++) {
            int[] var1 = class8.field152[var0];
            for (int var2 = 0; var2 < 104; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 121)
    public final void method344(int arg0) {
        class12.method68(-1);
        class75.field1087 = new class279();
        field638++;
        class57.field841 = new class33();
        if (class59.field870 != 0) {
            class206.field3017 = new byte[50][];
        }
        class244.method1794(class54.field787, 0);
        if (class14.field214 == 0) {
            class157.field2266 = this.getCodeBase().getHost();
            class134.field1960 = 43594;
            class291.field4407 = 443;
        } else if (class14.field214 == 1) {
            class157.field2266 = this.getCodeBase().getHost();
            class291.field4407 = class359.field5624 + 50000;
            class134.field1960 = class359.field5624 + 40000;
        } else if (class14.field214 == 2) {
            class134.field1960 = class359.field5624 + 40000;
            class291.field4407 = class359.field5624 + 50000;
            class157.field2266 = "127.0.0.1";
        }
        class240.field3574 = class291.field4407;
        if (class61.field890 == 3 && class14.field214 != 2) {
            class15.field227 = class359.field5624;
        }
        class302.field4508 = class134.field1960;
        if (arg0 != 50000) {
            this.method350(-12);
        }
        class62.field913 = class302.field4508;
        class122.field1722 = class68.field991 = class359.field5548 = class2.field89 = new short[256];
        class112.field1624 = class157.field2266;
        class75.field1096 = class134.field1960;
        if (class164.field2335 == 1) {
            class119.field1674 = class40.field582;
            class110.field1591 = class77.field1121;
            class189.field2700 = class330.field4972;
            class222.field3338 = 0;
            class222.field3339 = 16777215;
            class330.field4971 = class324.field4885;
            class33.field471 = true;
        } else {
            class119.field1674 = class75.field1095;
            class330.field4971 = class347.field5368;
            class189.field2700 = class291.field4416;
            class110.field1591 = class81.field1160;
        }
        class286.method2071(-15170);
        class273.method2002(class306.field4585, -107);
        class263.method1949(1, class306.field4585);
        class67.field977 = class103.method795((byte) -40);
        if (class67.field977 != null) {
            class67.field977.method544(arg0 - 49990, class306.field4585);
        }
        class334.field5202 = class61.field890;
        try {
            if (class54.field787.field888 != null) {
                class250.field3707 = new class165(class54.field787.field888, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class266.field4058[var2] = new class165(class54.field787.field881[var2], 6000, 0);
                }
                class189.field2693 = new class165(class54.field787.field886, 6000, 0);
                class147.field2119 = new class201(255, class250.field3707, class189.field2693, 500000);
                class36.field534 = new class165(class54.field787.field891, 24, 0);
                class54.field787.field886 = null;
                class54.field787.field888 = null;
                class54.field787.field891 = null;
                class54.field787.field881 = null;
            }
        } catch (IOException var4) {
            class189.field2693 = null;
            class147.field2119 = null;
            class250.field3707 = null;
            class36.field534 = null;
        }
        if (class164.field2335 == 0) {
            class166.field2380 = class166.field2379;
        } else if (class164.field2335 == 1) {
            class166.field2380 = class4.field109;
        }
        if (class14.field214 != 0) {
            class91.field1265 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lqf;IIIIIII)V", line = 245)
    public static final void method345(class359[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class359 var9 = arg0[var8];
            if (var9 != null && var9.field5638 == arg1 && (!var9.field5500 || var9.field5554 == 0 || var9.field5663 || method347(var9).field2901 != 0 || class51.field764 == var9 || var9.field5515 == 1338) && (!var9.field5500 || !method359(var9))) {
                int var10 = var9.field5495 + arg6;
                int var11 = var9.field5585 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field5554 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field5506 + var10;
                    int var17 = var9.field5560 + var11;
                    if (var9.field5554 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class331.field5041 == var9) {
                    class211.field3065 = true;
                    class125.field1812 = var10;
                    class119.field1681 = var11;
                }
                if (!var9.field5500 || var12 < var14 && var13 < var15) {
                    if (var9.field5554 == 0) {
                        if (!var9.field5500 && method359(var9) && class92.field1271 != var9) {
                            continue;
                        }
                        if (var9.field5550 && class56.field815 >= var12 && class165.field2353 >= var13 && class56.field815 < var14 && class165.field2353 < var15) {
                            for (class300 var18 = (class300) class190.field2762.method93((byte) -21); var18 != null; var18 = (class300) class190.field2762.method97(-91)) {
                                if (var18.field4484) {
                                    var18.method876(8);
                                    var18.field4491.field5656 = false;
                                }
                            }
                            if (class32.field464 == 0) {
                                class331.field5041 = null;
                                class51.field764 = null;
                            }
                            class177.field2541 = 0;
                            class30.field430 = false;
                        }
                    }
                    if (var9.field5500) {
                        boolean var19;
                        if (class56.field815 >= var12 && class165.field2353 >= var13 && class56.field815 < var14 && class165.field2353 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class96.field1346 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class31.field445 == 1 && class180.field2592 >= var12 && class227.field3425 >= var13 && class180.field2592 < var14 && class227.field3425 < var15) {
                            var21 = true;
                        }
                        if (var9.field5645 != null) {
                            for (int var22 = 0; var22 < var9.field5645.length; var22++) {
                                if (class236.field3549[var9.field5645[var22]]) {
                                    if (var9.field5523 == null || class304.field4560 >= var9.field5523[var22]) {
                                        byte var23 = var9.field5659[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class236.field3549[86] && !class236.field3549[82] && !class236.field3549[81]) && ((var23 & 0x2) == 0 || class236.field3549[86]) && ((var23 & 0x1) == 0 || class236.field3549[82]) && ((var23 & 0x4) == 0 || class236.field3549[81])) {
                                            class89.method710("", var9.field5521, var22 + 1, -1, 8477);
                                            int var24 = var9.field5649[var22];
                                            if (var9.field5523 == null) {
                                                var9.field5523 = new int[var9.field5645.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field5523[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field5523[var22] = class304.field4560 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field5523 != null) {
                                    var9.field5523[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class313.method2190(var9, class227.field3425 - var11, class180.field2592 - var10, true);
                        }
                        if (class331.field5041 != null && class331.field5041 != var9 && var19 && method347(var9).method1447(true)) {
                            class17.field286 = var9;
                        }
                        if (class51.field764 == var9) {
                            class142.field2064 = true;
                            class275.field4163 = var10;
                            class275.field4172 = var11;
                        }
                        if (var9.field5663 || var9.field5515 != 0) {
                            if (var19 && class142.field2063 != 0 && var9.field5494 != null) {
                                class300 var25 = new class300();
                                var25.field4484 = true;
                                var25.field4491 = var9;
                                var25.field4498 = class142.field2063;
                                var25.field4494 = var9.field5494;
                                class190.field2762.method106(var25, -128);
                            }
                            if (class331.field5041 != null || class219.field3271 != null || class15.field246 || var9.field5515 != 1400 && class177.field2541 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field5515 != 0) {
                                if (var9.field5515 == 1337) {
                                    class189.field2702 = var9;
                                    continue;
                                }
                                if (var9.field5515 == 1338) {
                                    if (var21) {
                                        class191.field2778 = class180.field2592 - var10;
                                        class128.field1864 = class227.field3425 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field5515 == 1400) {
                                    class197.field2855 = var9;
                                    if (var19) {
                                        class30.field430 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class180.field2592 - var10 - var9.field5506 / 2) * 2.0D / (double) class105.field1506);
                                        int var27 = (int) ((double) (class227.field3425 - var11 - var9.field5560 / 2) * 2.0D / (double) class105.field1506);
                                        int var28 = class147.field2114 + var26;
                                        int var29 = class124.field1810 + var27;
                                        int var30 = class105.field1498 + var28;
                                        int var31 = class105.field1503 + class105.field1497 - var29 - 1;
                                        class281 var32 = class18.method113(-94);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method2055(var30, 24558, var33, var31);
                                        if (var33 != null) {
                                            if (class236.field3549[82] && class111.field1619 > 0) {
                                                class248.method1828(var33[2], var33[0], var33[1], (byte) 121);
                                                class270.method1994(true);
                                                continue;
                                            }
                                            class362.field5740++;
                                            class107.field1533.method1915(true, 6);
                                            class107.field1533.method1321(var33[0] << 28 | var33[1] << 14 | var33[2], -315893864);
                                        }
                                        class177.field2541 = 1;
                                        class157.field2261 = false;
                                        class117.field1663 = class56.field815;
                                        class355.field5447 = class165.field2353;
                                        continue;
                                    }
                                    if (var20 && class177.field2541 > 0) {
                                        if (class177.field2541 == 1 && (class56.field815 != class117.field1663 || class355.field5447 != class165.field2353)) {
                                            class264.field4048 = class147.field2114;
                                            class169.field2432 = class124.field1810;
                                            class177.field2541 = 2;
                                        }
                                        if (class177.field2541 == 2) {
                                            class157.field2261 = true;
                                            class292.method2098((int) ((double) (class117.field1663 - class56.field815) * 2.0D / (double) class105.field1504) + class264.field4048, 99);
                                            class12.method66(-1, (int) ((double) (class355.field5447 - class165.field2353) * 2.0D / (double) class105.field1504) + class169.field2432);
                                        }
                                        continue;
                                    }
                                    if (class177.field2541 > 0 && !class157.field2261) {
                                        if ((class257.field3851 == 1 || class277.method2028(-106, class264.field4043 - 1)) && class264.field4043 > 2) {
                                            class164.method1160(-34);
                                        } else if (class264.field4043 > 0) {
                                            class165.method1179(-1);
                                        }
                                    }
                                    class177.field2541 = 0;
                                    continue;
                                }
                                if (var9.field5515 == 1401) {
                                    if (var20) {
                                        class93.method731((byte) -33, class56.field815 - var10, var9.field5506, class165.field2353 - var11, var9.field5560);
                                    }
                                    continue;
                                }
                                if (var9.field5515 == 1402) {
                                    if (!class141.field2031) {
                                        class83.method676(var9, (byte) -80);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field5499 && var21) {
                                var9.field5499 = true;
                                if (var9.field5619 != null) {
                                    class300 var34 = new class300();
                                    var34.field4484 = true;
                                    var34.field4491 = var9;
                                    var34.field4488 = class180.field2592 - var10;
                                    var34.field4498 = class227.field3425 - var11;
                                    var34.field4494 = var9.field5619;
                                    class190.field2762.method106(var34, -127);
                                }
                            }
                            if (var9.field5499 && var20 && var9.field5512 != null) {
                                class300 var35 = new class300();
                                var35.field4484 = true;
                                var35.field4491 = var9;
                                var35.field4488 = class56.field815 - var10;
                                var35.field4498 = class165.field2353 - var11;
                                var35.field4494 = var9.field5512;
                                class190.field2762.method106(var35, -126);
                            }
                            if (var9.field5499 && !var20) {
                                var9.field5499 = false;
                                if (var9.field5672 != null) {
                                    class300 var36 = new class300();
                                    var36.field4484 = true;
                                    var36.field4491 = var9;
                                    var36.field4488 = class56.field815 - var10;
                                    var36.field4498 = class165.field2353 - var11;
                                    var36.field4494 = var9.field5672;
                                    class50.field760.method106(var36, -128);
                                }
                            }
                            if (var20 && var9.field5613 != null) {
                                class300 var37 = new class300();
                                var37.field4484 = true;
                                var37.field4491 = var9;
                                var37.field4488 = class56.field815 - var10;
                                var37.field4498 = class165.field2353 - var11;
                                var37.field4494 = var9.field5613;
                                class190.field2762.method106(var37, -126);
                            }
                            if (!var9.field5656 && var19) {
                                var9.field5656 = true;
                                if (var9.field5492 != null) {
                                    class300 var38 = new class300();
                                    var38.field4484 = true;
                                    var38.field4491 = var9;
                                    var38.field4488 = class56.field815 - var10;
                                    var38.field4498 = class165.field2353 - var11;
                                    var38.field4494 = var9.field5492;
                                    class190.field2762.method106(var38, -126);
                                }
                            }
                            if (var9.field5656 && var19 && var9.field5650 != null) {
                                class300 var39 = new class300();
                                var39.field4484 = true;
                                var39.field4491 = var9;
                                var39.field4488 = class56.field815 - var10;
                                var39.field4498 = class165.field2353 - var11;
                                var39.field4494 = var9.field5650;
                                class190.field2762.method106(var39, -128);
                            }
                            if (var9.field5656 && !var19) {
                                var9.field5656 = false;
                                if (var9.field5587 != null) {
                                    class300 var40 = new class300();
                                    var40.field4484 = true;
                                    var40.field4491 = var9;
                                    var40.field4488 = class56.field815 - var10;
                                    var40.field4498 = class165.field2353 - var11;
                                    var40.field4494 = var9.field5587;
                                    class50.field760.method106(var40, -126);
                                }
                            }
                            if (var9.field5553 != null) {
                                class300 var41 = new class300();
                                var41.field4491 = var9;
                                var41.field4494 = var9.field5553;
                                class11.field167.method106(var41, -128);
                            }
                            if (var9.field5557 != null && class273.field4147 > var9.field5533) {
                                if (var9.field5637 == null || class273.field4147 - var9.field5533 > 32) {
                                    class300 var46 = new class300();
                                    var46.field4491 = var9;
                                    var46.field4494 = var9.field5557;
                                    class190.field2762.method106(var46, -126);
                                } else {
                                    label603: for (int var42 = var9.field5533; var42 < class273.field4147; var42++) {
                                        int var43 = class93.field1295[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field5637.length; var44++) {
                                            if (var9.field5637[var44] == var43) {
                                                class300 var45 = new class300();
                                                var45.field4491 = var9;
                                                var45.field4494 = var9.field5557;
                                                class190.field2762.method106(var45, -127);
                                                break label603;
                                            }
                                        }
                                    }
                                }
                                var9.field5533 = class273.field4147;
                            }
                            if (var9.field5627 != null && class57.field844 > var9.field5643) {
                                if (var9.field5622 == null || class57.field844 - var9.field5643 > 32) {
                                    class300 var51 = new class300();
                                    var51.field4491 = var9;
                                    var51.field4494 = var9.field5627;
                                    class190.field2762.method106(var51, -128);
                                } else {
                                    label579: for (int var47 = var9.field5643; var47 < class57.field844; var47++) {
                                        int var48 = class267.field4076[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field5622.length; var49++) {
                                            if (var9.field5622[var49] == var48) {
                                                class300 var50 = new class300();
                                                var50.field4491 = var9;
                                                var50.field4494 = var9.field5627;
                                                class190.field2762.method106(var50, -127);
                                                break label579;
                                            }
                                        }
                                    }
                                }
                                var9.field5643 = class57.field844;
                            }
                            if (var9.field5578 != null && class190.field2777 > var9.field5640) {
                                if (var9.field5526 == null || class190.field2777 - var9.field5640 > 32) {
                                    class300 var56 = new class300();
                                    var56.field4491 = var9;
                                    var56.field4494 = var9.field5578;
                                    class190.field2762.method106(var56, -127);
                                } else {
                                    label555: for (int var52 = var9.field5640; var52 < class190.field2777; var52++) {
                                        int var53 = class160.field2317[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field5526.length; var54++) {
                                            if (var9.field5526[var54] == var53) {
                                                class300 var55 = new class300();
                                                var55.field4491 = var9;
                                                var55.field4494 = var9.field5578;
                                                class190.field2762.method106(var55, -126);
                                                break label555;
                                            }
                                        }
                                    }
                                }
                                var9.field5640 = class190.field2777;
                            }
                            if (var9.field5536 != null && class289.field4381 > var9.field5652) {
                                if (var9.field5664 == null || class289.field4381 - var9.field5652 > 32) {
                                    class300 var61 = new class300();
                                    var61.field4491 = var9;
                                    var61.field4494 = var9.field5536;
                                    class190.field2762.method106(var61, -127);
                                } else {
                                    label531: for (int var57 = var9.field5652; var57 < class289.field4381; var57++) {
                                        int var58 = class274.field4155[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field5664.length; var59++) {
                                            if (var9.field5664[var59] == var58) {
                                                class300 var60 = new class300();
                                                var60.field4491 = var9;
                                                var60.field4494 = var9.field5536;
                                                class190.field2762.method106(var60, -126);
                                                break label531;
                                            }
                                        }
                                    }
                                }
                                var9.field5652 = class289.field4381;
                            }
                            if (var9.field5541 != null && class135.field1966 > var9.field5592) {
                                if (var9.field5626 == null || class135.field1966 - var9.field5592 > 32) {
                                    class300 var66 = new class300();
                                    var66.field4491 = var9;
                                    var66.field4494 = var9.field5541;
                                    class190.field2762.method106(var66, -127);
                                } else {
                                    label507: for (int var62 = var9.field5592; var62 < class135.field1966; var62++) {
                                        int var63 = class361.field5717[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field5626.length; var64++) {
                                            if (var9.field5626[var64] == var63) {
                                                class300 var65 = new class300();
                                                var65.field4491 = var9;
                                                var65.field4494 = var9.field5541;
                                                class190.field2762.method106(var65, -126);
                                                break label507;
                                            }
                                        }
                                    }
                                }
                                var9.field5592 = class135.field1966;
                            }
                            if (class207.field3028 > var9.field5562 && var9.field5666 != null) {
                                class300 var67 = new class300();
                                var67.field4491 = var9;
                                var67.field4494 = var9.field5666;
                                class190.field2762.method106(var67, -127);
                            }
                            if (class348.field5376 > var9.field5562 && var9.field5617 != null) {
                                class300 var68 = new class300();
                                var68.field4491 = var9;
                                var68.field4494 = var9.field5617;
                                class190.field2762.method106(var68, -126);
                            }
                            if (class203.field2989 > var9.field5562 && var9.field5572 != null) {
                                class300 var69 = new class300();
                                var69.field4491 = var9;
                                var69.field4494 = var9.field5572;
                                class190.field2762.method106(var69, -126);
                            }
                            if (class200.field2944 > var9.field5562 && var9.field5669 != null) {
                                class300 var70 = new class300();
                                var70.field4491 = var9;
                                var70.field4494 = var9.field5669;
                                class190.field2762.method106(var70, -127);
                            }
                            if (class27.field369 > var9.field5562 && var9.field5501 != null) {
                                class300 var71 = new class300();
                                var71.field4491 = var9;
                                var71.field4494 = var9.field5501;
                                class190.field2762.method106(var71, -128);
                            }
                            var9.field5562 = class68.field989;
                            if (var9.field5636 != null) {
                                for (int var72 = 0; var72 < class300.field4496; var72++) {
                                    class300 var73 = new class300();
                                    var73.field4491 = var9;
                                    var73.field4485 = class102.field1457[var72];
                                    var73.field4497 = class73.field1075[var72];
                                    var73.field4494 = var9.field5636;
                                    class190.field2762.method106(var73, -126);
                                }
                            }
                            if (class148.field2124 && var9.field5583 != null) {
                                class300 var74 = new class300();
                                var74.field4491 = var9;
                                var74.field4494 = var9.field5583;
                                class190.field2762.method106(var74, -126);
                            }
                        }
                    }
                    if (!var9.field5500 && class331.field5041 == null && class219.field3271 == null && !class15.field246) {
                        if ((var9.field5654 >= 0 || var9.field5631 != 0) && class56.field815 >= var12 && class165.field2353 >= var13 && class56.field815 < var14 && class165.field2353 < var15) {
                            if (var9.field5654 >= 0) {
                                class92.field1271 = arg0[var9.field5654];
                            } else {
                                class92.field1271 = var9;
                            }
                        }
                        if (var9.field5554 == 8 && class56.field815 >= var12 && class165.field2353 >= var13 && class56.field815 < var14 && class165.field2353 < var15) {
                            class316.field4697 = var9;
                        }
                        if (var9.field5580 > var9.field5560) {
                            class78.method637(class56.field815, var9.field5560, var9.field5506 + var10, class165.field2353, var9.field5580, 3621, var9, var11);
                        }
                    }
                    if (var9.field5554 == 0) {
                        method345(arg0, var9.field5521, var12, var13, var14, var15, var10 - var9.field5496, var11 - var9.field5641);
                        if (var9.field5579 != null) {
                            method345(var9.field5579, var9.field5521, var12, var13, var14, var15, var10 - var9.field5496, var11 - var9.field5641);
                        }
                        class98 var75 = (class98) class288.field4360.method1405((long) var9.field5521, false);
                        if (var75 != null) {
                            class103.method796(var13, var10, var14, var11, var15, var75.field1393, 0, var12);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V", line = 1044)
    public static void method346(byte arg0) {
        field646 = null;
        field636 = null;
        field628 = null;
        if (arg0 != -6) {
            method347((class359) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lqf;)Lol;", line = 1057)
    public static final class199 method347(class359 arg0) {
        class199 var1 = (class199) class144.field2081.method1405(((long) arg0.field5521 << 32) + (long) arg0.field5620, false);
        return var1 == null ? arg0.field5596 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lqf;)Lqf;", line = 1062)
    public static final class359 method348(class359 arg0) {
        int var1 = method347(arg0).method1449(7);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class231.method1719(arg0.field5638, 91);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1082)
    public final void method349(int arg0) {
        field629++;
        method346((byte) -6);
        class155.method1124();
        class241.method1772(2000);
        class1.method3(true);
        class105.method815();
        class281.method2048(-78);
        class109.method831(true);
        class263.method1952((byte) -112);
        class141.method1016();
        class83.method680(16510);
        class137.method970(true);
        class38.method278(arg0 ^ 0xFFFFF138);
        class230.method1715((byte) 83);
        class190.method1375((byte) -126);
        class215.method1557((byte) -54);
        class33.method242(true);
        class279.method2034((byte) -115);
        class20.method121(255);
        class221.method1620(-1);
        class361.method2510(true);
        class165.method1174(96);
        class201.method1464(90);
        class57.method463((byte) -127);
        class181.method1254(-74);
        class260.method1910((byte) 54);
        class96.method749(-3);
        class359.method2500(arg0 - 798);
        class267.method1972((byte) -70);
        class228.method1702(arg0 ^ 0x314);
        class16.method98(false);
        class177.method1239((byte) 37);
        class120.method897((byte) -46);
        class148.method1046(-32);
        class330.method2298(arg0 ^ 0x39E);
        class64.method531((byte) -55);
        class40.method297(89);
        class256.method1888(false);
        class248.method1825(-1);
        class333.method2344(-1);
        class167.method1188((byte) -66);
        class217.method1566(140);
        class214.method1541(-1);
        class98.method774(arg0 - 1022);
        class199.method1446(0);
        class292.method2100(1);
        class117.method875(122);
        class342.method2391(90);
        class72.method594((byte) -75);
        class209.method1527(30);
        class124.method926(0);
        class17.method109(false);
        class352.method2458((byte) -6);
        class112.method851((byte) -123);
        class193.method1390(4096);
        class116.method870((byte) -81);
        class30.method213(17);
        class219.method1602((byte) 102);
        class103.method797((byte) 39);
        class240.method1770(-6990);
        class358.method2479(arg0 - 916);
        class233.method1734();
        class68.method555((byte) 101);
        class73.method602(7843);
        class189.method1306((byte) -101);
        class166.method1184(255);
        class249.method1833((byte) -97);
        class59.method474(-16);
        class261.method1923(-1784);
        class213.method1534(-100);
        class222.method1624();
        class21.method129(false);
        class46.method374();
        class127.method944((byte) 121);
        class218.method1577();
        class122.method905(-114);
        class317.method2213();
        class75.method614(-127);
        class36.method267(true);
        class296.method2113((byte) 109);
        class344.method2412(arg0 - 917);
        class305.method2150();
        class337.method2371();
        class147.method1044((byte) -85);
        class314.method2195((byte) -78);
        class354.method2465((byte) -124);
        class250.method1836(true);
        class29.method179();
        class133.method957(86);
        class286.method2063((byte) 3);
        class183.method1267();
        class121.method900((byte) -104);
        class291.method2096(true);
        class315.method2200((byte) 127);
        class287.method2073(arg0 + 19129);
        class25.method155();
        class288.method2078(10111);
        class200.method1454(-1);
        class52.method438((byte) -52);
        class273.method2003((byte) 73);
        class4.method28((byte) 73);
        class23.method133(-1);
        class44.method313();
        class318.method2223(true);
        class338.method2375(arg0 - 917);
        class343.method2397((byte) -77);
        class77.method629((byte) 106);
        class67.method553(0);
        class194.method1392(arg0 ^ 0x394);
        class37.method271((byte) -40);
        class262.method1947(false);
        class178.method1242(arg0 ^ arg0);
        class351.method2452((byte) 51);
        class15.method87(arg0 + 2482);
        class107.method823(false);
        class309.method2173((byte) 51);
        class12.method72(-1);
        class82.method673();
        class298.method2118(24456);
        class76.method626(true);
        class308.method2166(32768);
        class139.method978(true);
        class175.method1229(false);
        class348.method2445((byte) 100);
        class198.method1421();
        class290.method2090(-20211);
        class207.method1514((byte) 97);
        class277.method2019(true);
        class227.method1695(0);
        class329.method2279(126);
        class71.method587(-80);
        class5.method33(arg0 - 967);
        class41.method299(arg0 ^ 0xFFFFFC23);
        class80.method656();
        class356.method2472((byte) 84);
        class345.method2432();
        class97.method769(85);
        class22.method130(-16357);
        class123.method923(0);
        class7.method48(0);
        class316.method2205((byte) -94);
        class129.method949(-2);
        class324.method2244(1011);
        class245.method1801();
        class2.method11(-126);
        class223.method1633();
        class355.method2469(false);
        class54.method447((byte) -17);
        class225.method1648(-1);
        class300.method2127(arg0 ^ 0xFFFFBDB1);
        class110.method842(-121);
        class111.method848(true);
        class303.method2136(95);
        class224.method1640();
        class180.method1250(arg0 ^ 0x394);
        class252.method1847(0);
        class11.method65(256);
        class94.method736(22387);
        class85.method692((byte) -100);
        class47.method405((byte) 59);
        class172.method1212(0);
        class100.method786();
        class191.method1379(arg0 ^ 0x46B);
        class265.method1964(1);
        class9.method55(arg0 ^ 0xFFFFFC6B);
        class319.method2225();
        class268.method1985();
        class24.method140();
        class182.method1264();
        class216.method1563(64);
        class48.method413((byte) 29);
        class184.method1284(0);
        class63.method513();
        class205.method1484();
        class254.method1860();
        class146.method1042(104);
        class257.method1892(112);
        class307.method2158(1);
        class28.method174(-114);
        class95.method740(1783164320);
        class206.method1507((byte) -120);
        class349.method2449(13297);
        class236.method1761(arg0 - 1943);
        class159.method1146();
        class272.method2000(arg0 - 916);
        class258.method1899((byte) 109);
        class278.method2031(1);
        class235.method1755(-117);
        class332.method2337(0);
        class154.method1104((byte) 91);
        class270.method1993(24);
        class102.method789(-1);
        class149.method1047(arg0 ^ 0x3F9);
        class130.method950(-97);
        class35.method260(false);
        class328.method2276();
        class99.method775((byte) -126);
        class32.method232((byte) 65);
        class229.method1709(30);
        class31.method223(true);
        class62.method502(0);
        class232.method1722(true);
        class284.method2057((byte) 3);
        class294.method2105((byte) 98);
        class170.method1198(arg0 - 1011);
        class246.method1809();
        class131.method952(arg0 - 789);
        class247.method1817(-29023);
        class285.method2062(arg0 ^ 0xFFFFFD6B);
        class331.method2330(false);
        class143.method1032(70);
        class119.method891(arg0 ^ 0xFFFF952F);
        class339.method2379();
        class242.method1783();
        class145.method1037(true);
        class357.method2475(0);
        class306.method2152((byte) -103);
        class174.method1222(arg0 - 800);
        class153.method1102();
        class161.method1150();
        class220.method1605(-25519);
        class302.method2133((byte) -51);
        class280.method2041();
        class135.method967((byte) 91);
        class327.method2257();
        class187.method1295();
        class55.method451((byte) 63);
        class253.method1856(arg0 - 792);
        class27.method173((byte) 34);
        class81.method664((byte) -3);
        class289.method2085(15264);
        class259.method1904(47);
        class320.method2226(false);
        class360.method2503(1);
        class202.method1465((byte) -84);
        class266.method1970(0);
        class126.method934(arg0 + 23204);
        class347.method2440((byte) 48);
        class239.method1766(arg0 ^ 0x394);
        class34.method257();
        class144.method1035((byte) 70);
        class186.method1288((byte) -114);
        class8.method51((byte) -125);
        class104.method798((byte) -104);
        class169.method1196(211);
        class322.method2237((byte) 98);
        class89.method711((byte) -66);
        class132.method956((byte) -125);
        class203.method1477(32120);
        class157.method1136((byte) -49);
        class299.method2124(-1760);
        class150.method1059(0);
        class18.method110(-97);
        class276.method2015(arg0 + 1132);
        class160.method1149(true);
        class86.method695(71);
        class237.method1764(-8348);
        class275.method2013(-73);
        class208.method1523(19121);
        class197.method1420(arg0 - 916);
        class74.method609(-18707);
        class51.method423((byte) 113);
        class56.method453(arg0 ^ 0x1A92);
        class173.method1217(-180);
        class321.method2232(-119);
        class50.method422(-1);
        class312.method2182((byte) -83);
        class3.method20((byte) -44);
        class58.method469(27913);
        class244.method1795(true);
        class49.method415((byte) -31);
        class91.method717(false);
        class108.method827(106);
        class125.method928((byte) 123);
        class251.method1839((byte) -52);
        class326.method2255(false);
        class313.method2188((byte) -68);
        class274.method2007(32);
        class212.method1533(false);
        class128.method946(1);
        class158.method1139(true);
        class19.method116(-9909);
        class192.method1384((byte) -110);
        class134.method959(1536);
        class92.method723((byte) -91);
        class142.method1025((byte) 116);
        class231.method1718(-28);
        class255.method1871(-32283);
        class93.method727((byte) -93);
        class179.method1245(0);
        class88.method700(123);
        class264.method1961(1);
        if (class263.field4035) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1380)
    private final void method350(int arg0) {
        if (!class130.field1879) {
            label240: while (true) {
                do {
                    if (!class260.method1909((byte) -8)) {
                        break label240;
                    }
                } while (class137.field1993 != 's' && class137.field1993 != 'S');
                class130.field1879 = true;
            }
        }
        field634++;
        if (class300.field4490 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class176.method1234(5574);
            if (class243.field3626 == 0L) {
                class243.field3626 = var28;
            }
            if (var27 > 16384 && (var28 - class243.field3626) < 5000L) {
                if (var28 - class74.field1078 > 1000L) {
                    System.gc();
                    class74.field1078 = var28;
                }
                class300.field4487 = class230.field3482;
                class120.field1685 = 5;
            } else {
                class300.field4487 = class4.field114;
                class120.field1685 = 5;
                class300.field4490 = 10;
            }
        } else if (class300.field4490 == 10) {
            for (int var25 = 0; var25 < 4; var25++) {
                class92.field1269[var25] = new class96(104, 104);
            }
            class300.field4490 = 30;
            class120.field1685 = 10;
            class300.field4487 = class30.field431;
        } else if (class300.field4490 == 30) {
            if (class21.field329 == null) {
                class21.field329 = new class20(class57.field841, class75.field1087);
            }
            if (class21.field329.method120(true)) {
                class197.field2854 = class354.method2464(true, false, 0, (byte) -118, true);
                class285.field4301 = class354.method2464(true, false, 1, (byte) -117, true);
                class108.field1567 = class354.method2464(false, true, 2, (byte) -124, true);
                class132.field1935 = class354.method2464(true, false, 3, (byte) -127, true);
                class253.field3785 = class354.method2464(true, false, 4, (byte) -120, true);
                class244.field3640 = class354.method2464(true, true, 5, (byte) -109, true);
                class332.field5085 = class354.method2464(true, true, 6, (byte) -111, false);
                class307.field4597 = class354.method2464(true, false, 7, (byte) -123, true);
                class216.field3184 = class354.method2464(true, false, 8, (byte) -120, true);
                class326.field4900 = class354.method2464(true, false, 9, (byte) -108, true);
                class322.field4851 = class354.method2464(true, false, 10, (byte) -124, true);
                class19.field307 = class354.method2464(true, false, 11, (byte) -122, true);
                class290.field4386 = class354.method2464(true, false, 12, (byte) -126, true);
                class75.field1090 = class354.method2464(true, false, 13, (byte) -113, true);
                class214.field3123 = class354.method2464(true, false, 14, (byte) -122, false);
                class93.field1292 = class354.method2464(true, false, 15, (byte) -122, true);
                class307.field4590 = class354.method2464(true, false, 16, (byte) -123, true);
                class321.field4838 = class354.method2464(true, false, 17, (byte) -115, true);
                class135.field1970 = class354.method2464(true, false, 18, (byte) -119, true);
                class312.field4649 = class354.method2464(true, false, 19, (byte) -121, true);
                class278.field4229 = class354.method2464(true, false, 20, (byte) -123, true);
                class180.field2582 = class354.method2464(true, false, 21, (byte) -126, true);
                class98.field1388 = class354.method2464(true, false, 22, (byte) -125, true);
                class165.field2365 = class354.method2464(true, true, 23, (byte) -111, true);
                class207.field3031 = class354.method2464(true, false, 24, (byte) -122, true);
                class134.field1956 = class354.method2464(true, false, 25, (byte) -109, true);
                class116.field1651 = class354.method2464(true, true, 26, (byte) -108, true);
                class89.field1246 = class354.method2464(true, false, 27, (byte) -120, true);
                class149.field2168 = class354.method2464(true, true, 28, (byte) -126, true);
                class300.field4487 = class259.field3865;
                class120.field1685 = 15;
                class300.field4490 = 40;
            } else {
                class120.field1685 = 12;
                class300.field4487 = class332.field5080;
            }
        } else if (class300.field4490 == 40) {
            int var23 = 0;
            for (int var24 = 0; var24 < 29; var24++) {
                var23 += class169.field2441[var24].method1610((byte) 120) * class360.field5686[var24] / 100;
            }
            if (var23 == 100) {
                class120.field1685 = 20;
                class300.field4487 = class315.field4684;
                class356.method2473(0, class216.field3184);
                class258.method1900(class216.field3184, 27965);
                class107.method821(class216.field3184, 9001);
                class300.field4490 = 41;
            } else {
                if (var23 != 0) {
                    class300.field4487 = class18.field294 + var23 + "%";
                }
                class120.field1685 = 20;
            }
        } else if (class300.field4490 == 41) {
            if (class149.field2168.method2515(114)) {
                this.method366(class149.field2168.method2513((byte) -84, 1), true);
                class300.field4490 = 45;
                class120.field1685 = 25;
                class300.field4487 = class110.field1590;
            } else {
                class300.field4487 = class184.field2638 + class149.field2168.method2523(0) + "%";
                class120.field1685 = 25;
            }
        } else if (class300.field4490 == 45) {
            class333.method2343((byte) -55, 2, class177.field2547, 22050);
            class170.field2457 = new class330();
            class170.field2457.method2309(128, 16, 9);
            class119.field1675 = class299.method2126(22050, class54.field787, -114, 0, class306.field4585);
            class119.field1675.method533(class170.field2457, arg0 - 99);
            class236.method1760(class253.field3785, class93.field1292, class170.field2457, class214.field3123, (byte) -113);
            class28.field396 = class299.method2126(2048, class54.field787, arg0 ^ 0x58, 1, class306.field4585);
            class179.field2576 = new class195();
            class28.field396.method533(class179.field2576, 1);
            class144.field2088 = new class40(22050, class56.field812);
            class291.field4406 = class332.field5085.method2505("scape main", (byte) -79);
            class300.field4490 = 50;
            class120.field1685 = 30;
            class300.field4487 = class214.field3085;
        } else if (class300.field4490 == 50) {
            int var21 = class72.method599(0, class216.field3184, class75.field1090);
            int var22 = class251.method1843((byte) 66);
            if (var22 <= var21) {
                class300.field4490 = 60;
                class300.field4487 = class35.field521;
                class120.field1685 = 35;
            } else {
                class300.field4487 = class351.field5414 + var21 * 100 / var22 + "%";
                class120.field1685 = 35;
            }
        } else if (class300.field4490 == 60) {
            int var19 = class321.method2230(true, class216.field3184);
            int var20 = class265.method1966(119);
            if (var19 >= var20) {
                class120.field1685 = 40;
                class300.field4487 = class123.field1794;
                class300.field4490 = 65;
            } else {
                class120.field1685 = 40;
                class300.field4487 = class170.field2453 + var19 * 100 / var20 + "%";
            }
        } else if (class300.field4490 == 65) {
            class189.method1304(class75.field1090, (byte) -37, class216.field3184);
            class300.field4487 = class48.field723;
            class120.field1685 = 45;
            class250.method1837(5, 40);
            class300.field4490 = 70;
        } else if (class300.field4490 == 70) {
            class108.field1567.method2515(110);
            byte var2 = 0;
            int var3 = var2 + class108.field1567.method2523(0);
            class307.field4590.method2515(107);
            int var4 = var3 + class307.field4590.method2523(0);
            class321.field4838.method2515(127);
            int var5 = var4 + class321.field4838.method2523(arg0 - 100);
            class135.field1970.method2515(124);
            int var6 = var5 + class135.field1970.method2523(0);
            class312.field4649.method2515(arg0 ^ 0x1A);
            int var7 = var6 + class312.field4649.method2523(0);
            class278.field4229.method2515(arg0 ^ 0x13);
            int var8 = var7 + class278.field4229.method2523(0);
            class180.field2582.method2515(124);
            int var9 = var8 + class180.field2582.method2523(0);
            class98.field1388.method2515(119);
            int var10 = var9 + class98.field1388.method2523(0);
            class207.field3031.method2515(114);
            int var11 = var10 + class207.field3031.method2523(0);
            class134.field1956.method2515(118);
            int var12 = var11 + class134.field1956.method2523(0);
            class89.field1246.method2515(102);
            int var13 = var12 + class89.field1246.method2523(0);
            if (var13 < 1100) {
                class300.field4487 = class67.field980 + var13 / 11 + "%";
                class120.field1685 = 50;
            } else {
                class36.method266(-127, class108.field1567);
                class331.method2326(class108.field1567, -117);
                class15.method90(18574, class108.field1567);
                class208.method1519(class307.field4597, class108.field1567, false);
                class37.method272(class307.field4597, true, class307.field4590, -127);
                class123.method922(true, true, class307.field4597, class135.field1970);
                class244.method1789(class22.field339, (byte) -116, class312.field4649, class307.field4597, true);
                class196.method1411(class108.field1567, (byte) 42);
                class40.method296(false, class278.field4229, class285.field4301, class197.field2854);
                class28.method175((byte) 78, class108.field1567);
                class251.method1844(class307.field4597, arg0 ^ 0xFFFFFF9B, class180.field2582);
                class160.method1147(class98.field1388, (byte) 7);
                class107.method817(class108.field1567, -63);
                class281.method2045(121, class307.field4597, class75.field1090, class216.field3184, class132.field1935);
                class308.method2171(class108.field1567, (byte) 124);
                class56.method454(-436665780, class321.field4838);
                class184.method1281(new class139(), class207.field3031, class134.field1956, false);
                class126.method933(class207.field3031, arg0 ^ 0x15, class134.field1956);
                class4.method26(class108.field1567, arg0 - 221);
                class83.method682(class108.field1567, (byte) -124);
                class71.method585(class108.field1567, 124);
                class177.method1235(-66, class216.field3184, class108.field1567);
                class203.method1473(class216.field3184, -117, class108.field1567);
                class14.method81(-72, class108.field1567, class216.field3184);
                class120.field1685 = 50;
                class300.field4487 = class184.field2648;
                class331.method2324((byte) 116);
                class300.field4490 = 80;
            }
        } else if (class300.field4490 == 80) {
            int var17 = class230.method1713(class216.field3184, 93);
            int var18 = class255.method1874((byte) -8);
            if (var18 > var17) {
                class300.field4487 = class122.field1779 + var17 * 100 / var18 + "%";
                class120.field1685 = 60;
            } else {
                class190.method1333(class216.field3184, arg0 - 195);
                class300.field4490 = 90;
                class300.field4487 = class103.field1489;
                class120.field1685 = 60;
            }
        } else if (class300.field4490 == 90) {
            if (class116.field1651.method2515(arg0 + 14)) {
                class71 var14 = new class71(class326.field4900, class116.field1651, class216.field3184, 20, !class299.field4475);
                class345.method2422(var14);
                if (class257.field3849 == 1) {
                    class345.method2430(0.9F);
                }
                if (class257.field3849 == 2) {
                    class345.method2430(0.8F);
                }
                if (class257.field3849 == 3) {
                    class345.method2430(0.7F);
                }
                if (class257.field3849 == 4) {
                    class345.method2430(0.6F);
                }
                class120.field1685 = 70;
                class300.field4490 = 100;
                class300.field4487 = class251.field3720;
            } else {
                class300.field4487 = class194.field2818 + class116.field1651.method2523(0) + "%";
                class120.field1685 = 70;
            }
        } else if (class300.field4490 == arg0) {
            if (class196.method1402(arg0 ^ 0x60, class216.field3184)) {
                class300.field4490 = 110;
            }
        } else if (class300.field4490 == 110) {
            class181.field2608 = new class38();
            class54.field787.method490(arg0 - 98, 10, class181.field2608);
            class300.field4487 = class361.field5695;
            class300.field4490 = 120;
            class120.field1685 = 75;
        } else if (class300.field4490 == 120) {
            if (class322.field4851.method2530("", "huffman", false)) {
                class97 var15 = new class97(class322.field4851.method2509(-19598, "", "huffman"));
                class33.method237(116, var15);
                class300.field4490 = 130;
                class120.field1685 = 80;
                class300.field4487 = class258.field3852;
            } else {
                class120.field1685 = 80;
                class300.field4487 = class132.field1932 + "0%";
            }
        } else if (class300.field4490 == 130) {
            if (!class132.field1935.method2515(121)) {
                class300.field4487 = class189.field2698 + class132.field1935.method2523(0) * 3 / 4 + "%";
                class120.field1685 = 85;
            } else if (!class290.field4386.method2515(120)) {
                class300.field4487 = class189.field2698 + ((class290.field4386.method2523(arg0 - 100) / 10) + 75) + "%";
                class120.field1685 = 85;
            } else if (!class75.field1090.method2515(125)) {
                class300.field4487 = class189.field2698 + (class75.field1090.method2523(0) / 20 + 85) + "%";
                class120.field1685 = 85;
            } else if (class165.field2365.method2541(-30281, "details")) {
                class105.method808(class165.field2365);
                class155.method1107(class89.field1246);
                class82.method670(class307.field4597);
                class120.field1685 = 95;
                class300.field4490 = 135;
                class300.field4487 = class287.field4345;
            } else {
                class300.field4487 = class189.field2698 + (class165.field2365.method2544(1311165251, "details") / 10 + 90) + "%";
                class120.field1685 = 85;
            }
        } else if (class300.field4490 == 135) {
            int var16 = class18.method112((byte) -96);
            if (var16 == -1) {
                class300.field4487 = class236.field3546;
                class120.field1685 = 95;
            } else if (var16 == 7 || var16 == 9) {
                this.method1950("worldlistfull", arg0 ^ 0x6E);
                class250.method1837(1000, arg0 ^ 0x4C);
            } else if (class178.field2556) {
                class300.field4490 = 140;
                class120.field1685 = 96;
                class300.field4487 = class221.field3320;
            } else {
                this.method1950("worldlistio_" + var16, 10);
                class250.method1837(1000, 40);
            }
        } else if (class300.field4490 == 140) {
            class1.field28 = class132.field1935.method2505("loginscreen", (byte) 65);
            class244.field3640.method2531(false, true, -1);
            class332.field5085.method2531(true, true, -1);
            class216.field3184.method2531(true, true, -1);
            class75.field1090.method2531(true, true, -1);
            class322.field4851.method2531(true, true, -1);
            class132.field1935.method2531(true, true, -1);
            class120.field1685 = 97;
            class300.field4490 = 150;
            class292.field4427 = true;
            class300.field4487 = class56.field809;
        } else if (class300.field4490 == 150) {
            class245.method1799();
            if (class130.field1879) {
                class304.field4559 = 0;
                class135.field1971 = 0;
                class149.field2173 = 0;
                class93.field1299 = 0;
            }
            class130.field1879 = true;
            class309.method2176(class54.field787, false);
            class348.method2443(-1, false, (byte) -66, -1, class135.field1971);
            class300.field4487 = class52.field780;
            class300.field4490 = 160;
            class120.field1685 = 100;
        } else if (class300.field4490 == 160) {
            class125.method929((byte) -121, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V", line = 1901)
    private final void method351(byte arg0) {
        class300.field4496 = 0;
        field641++;
        while (class260.method1909((byte) -8) && class300.field4496 < 128) {
            class102.field1457[class300.field4496] = class107.field1548;
            class73.field1075[class300.field4496] = class137.field1993;
            class300.field4496++;
        }
        class94.field1310++;
        if (class257.field3850 != -1) {
            class103.method796(0, 0, class286.field4312, 0, class19.field301, class257.field3850, 0, 0);
        }
        class68.field989++;
        if (class141.field2031) {
            int var2 = 2359807;
            label197: for (int var3 = 0; var3 < 32768; var3++) {
                class181 var4 = class300.field4495[var3];
                if (var4 != null) {
                    byte var5 = var4.field2609.field3107;
                    if ((var5 & 0x2) > 0 && var4.field5113 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field5186[0] = (var4.field5137 >> 7) + var6;
                            var4.field5133[0] = 1;
                            var4.field5162[0] = (var4.field5165 >> 7) + var7;
                            class92.field1269[class321.field4835].method750(false, (byte) -66, var4.method1700(-105), var4.field5137 >> 7, var4.field5165 >> 7, false, var4.method1700(-113), 0);
                            if (var4.field5186[0] >= 0 && var4.field5186[0] <= 104 - var4.method1700(-95) && var4.field5162[0] >= 0 && var4.field5162[0] <= 104 - var4.method1700(-103) && class92.field1269[class321.field4835].method763(var4.field5165 >> 7, var4.field5186[0], var4.field5137 >> 7, 2883848, var4.field5162[0])) {
                                if (var4.method1700(-123) > 1) {
                                    for (int var8 = var4.field5186[0]; var8 < var4.field5186[0] + var4.method1700(-108); var8++) {
                                        for (int var9 = var4.field5162[0]; var9 < var4.field5162[0] + var4.method1700(-110); var9++) {
                                            if ((var2 & class92.field1269[class321.field4835].field1349[var8][var9]) != 0) {
                                                continue label197;
                                            }
                                        }
                                    }
                                }
                                var4.field5113 = 1;
                            }
                        }
                    }
                    class285.method2061(-102, var4);
                    class296.method2109(var4, 65536);
                    class220.method1608(-11, var4);
                    class92.field1269[class321.field4835].method748(var4.field5137 >> 7, var4.method1700(-128), var4.method1700(-106), false, var4.field5165 >> 7, false, 256);
                }
            }
        }
        if (!class141.field2031 && class164.field2335 == 0) {
            class76.method616(-54);
        } else if (class289.field4378 == 0 && class9.field156 == 0) {
            if (class86.field1208 == 2) {
                class207.method1516(112);
            } else {
                class358.method2480((byte) 104);
            }
            if (class137.field1991 >> 7 < 14 || class137.field1991 >> 7 >= 90 || class166.field2385 >> 7 < 14 || (class166.field2385 >> 7) >= 90) {
                class362.method2548(-6);
            }
        }
        while (true) {
            class300 var10;
            class359 var17;
            class359 var18;
            do {
                var10 = (class300) class11.field167.method102((byte) -40);
                if (var10 == null) {
                    while (true) {
                        class300 var11;
                        class359 var15;
                        class359 var16;
                        do {
                            var11 = (class300) class50.field760.method102((byte) -40);
                            if (var11 == null) {
                                while (true) {
                                    class300 var12;
                                    class359 var13;
                                    class359 var14;
                                    do {
                                        var12 = (class300) class190.field2762.method102((byte) -40);
                                        if (var12 == null) {
                                            if (class331.field5041 != null) {
                                                class290.method2092(-11498);
                                            }
                                            if (arg0 >= -11) {
                                                return;
                                            }
                                            if (class154.field2202 != null && class154.field2202.field3056 == 1) {
                                                if (class154.field2202.field3058 != null) {
                                                    class256.method1883(40, class252.field3765, class2.field83);
                                                }
                                                class154.field2202 = null;
                                                class2.field83 = false;
                                                class252.field3765 = null;
                                            }
                                            if (class304.field4560 % 1500 == 0) {
                                                class255.method1870((byte) -25);
                                            }
                                            return;
                                        }
                                        var13 = var12.field4491;
                                        if (var13.field5620 < 0) {
                                            break;
                                        }
                                        var14 = class231.method1719(var13.field5638, 115);
                                    } while (var14 == null || var14.field5579 == null || var13.field5620 >= var14.field5579.length || var14.field5579[var13.field5620] != var13);
                                    class48.method412(var12, 200000);
                                }
                            }
                            var15 = var11.field4491;
                            if (var15.field5620 < 0) {
                                break;
                            }
                            var16 = class231.method1719(var15.field5638, 72);
                        } while (var16 == null || var16.field5579 == null || var16.field5579.length <= var15.field5620 || var16.field5579[var15.field5620] != var15);
                        class48.method412(var11, 200000);
                    }
                }
                var17 = var10.field4491;
                if (var17.field5620 < 0) {
                    break;
                }
                var18 = class231.method1719(var17.field5638, 62);
            } while (var18 == null || var18.field5579 == null || var17.field5620 >= var18.field5579.length || var18.field5579[var17.field5620] != var17);
            class48.method412(var10, 200000);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V", line = 2118)
    private final void method352(byte arg0) {
        if (arg0 != 28) {
            field646 = (int[]) null;
        }
        boolean var2 = class57.field841.method239(122);
        if (!var2) {
            this.method356((byte) 117);
        }
        field648++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 2135)
    public static final void method353() {
        for (int var0 = -1; var0 < class265.field4053 + class166.field2384; var0++) {
            class333 var1;
            if (var0 < 0) {
                var1 = class1.field55;
            } else if (var0 < class265.field4053) {
                var1 = class343.field5312[class227.field3426[var0]];
            } else {
                var1 = class300.field4495[class215.field3158[var0 - class265.field4053]];
            }
            if (var1.field5164 >= 0) {
                int var2 = var1.method1700(-104);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field5137 & 0x7F) != 0 || (var1.field5165 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field5137 & 0x7F) != 64 || (var1.field5165 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field5137 >> 7;
                    int var4 = var1.field5165 >> 7;
                    if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104 && var1.field5164 >= class8.field152[var3][var4]) {
                        if (var1.field5164 > class8.field152[var3][var4]) {
                            class8.field152[var3][var4] = var1.field5164;
                            class86.field1209[var3][var4] = 1;
                        } else {
                            var10002 = class86.field1209[var3][var4]++;
                        }
                    }
                } else {
                    int var5 = var1.field5137 - var2 * 64 >> 7;
                    int var6 = var1.field5165 - var2 * 64 >> 7;
                    int var7 = var5 + var1.method1700(-94);
                    int var8 = var6 + var1.method1700(-110);
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
                            if (var1.field5164 > class8.field152[var9][var10]) {
                                class8.field152[var9][var10] = var1.field5164;
                                class86.field1209[var9][var10] = 1;
                            } else if (class8.field152[var9][var10] == var1.field5164) {
                                var10002 = class86.field1209[var9][var10]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V", line = 2245)
    public static final void method354(byte arg0) {
        field633++;
        int var1 = 108 / ((arg0 - 34) / 38);
        class361.field5735.method462(24);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2258)
    public static final void method355(int arg0) {
        field627++;
        if (class105.field1500 == null) {
            return;
        }
        if (class96.field1364 < 10) {
            if (!class105.field1494.method2541(-30281, class105.field1500.field4262)) {
                class96.field1364 = class165.field2365.method2544(1311165251, class105.field1500.field4262) / 10;
                return;
            }
            class54.method446(1);
            class96.field1364 = 10;
        }
        if (class96.field1364 == 10) {
            class105.field1497 = class105.field1500.field4264 >> 6 << 6;
            class105.field1503 = (class105.field1500.field4277 >> 6 << 6) + 64 - class105.field1497;
            int[] var1 = new int[3];
            class105.field1498 = class105.field1500.field4269 >> 6 << 6;
            class105.field1499 = (class105.field1500.field4256 >> 6 << 6) + 64 - class105.field1498;
            int var2 = -1;
            int var3 = -1;
            if (class105.field1500.method2051(-124, class272.field4123 + (class1.field55.field5137 >> 7), var1, (class1.field55.field5165 >> 7) + class202.field2968, class321.field4835)) {
                var3 = class105.field1497 + class105.field1503 - var1[2] - 1;
                var2 = var1[1] - class105.field1498;
            }
            if (!class27.field381 && var2 >= 0 && var2 < class105.field1499 && var3 >= 0 && class105.field1503 > var3) {
                int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var3 + (int) (Math.random() * 10.0D) - 5;
                class147.field2114 = var4;
                class124.field1810 = var5;
            } else if (class33.field493 == -1 || class110.field1600 == -1) {
                class105.field1500.method2053(-8226, class105.field1500.field4255 >> 14 & 0x3FFF, var1, class105.field1500.field4255 & 0x3FFF);
                class124.field1810 = class105.field1497 + class105.field1503 - var1[2] - 1;
                class147.field2114 = var1[1] - class105.field1498;
            } else {
                class105.field1500.method2053(-8226, class33.field493, var1, class110.field1600);
                class110.field1600 = -1;
                class33.field493 = -1;
                class27.field381 = false;
                if (var1 != null) {
                    class147.field2114 = var1[1] - class105.field1498;
                    class124.field1810 = class105.field1503 + class105.field1497 - var1[2] - 1;
                }
            }
            if (class105.field1500.field4275 == 37) {
                class105.field1506 = 3.0F;
                class105.field1504 = 3.0F;
            } else if (class105.field1500.field4275 == 50) {
                class105.field1506 = 4.0F;
                class105.field1504 = 4.0F;
            } else if (class105.field1500.field4275 == 75) {
                class105.field1506 = 6.0F;
                class105.field1504 = 6.0F;
            } else if (class105.field1500.field4275 == 100) {
                class105.field1506 = 8.0F;
                class105.field1504 = 8.0F;
            } else if (class105.field1500.field4275 == 200) {
                class105.field1506 = 16.0F;
                class105.field1504 = 16.0F;
            } else {
                class105.field1506 = 8.0F;
                class105.field1504 = 8.0F;
            }
            class259.method1905(-113);
            int var6 = class105.field1503 >> 6;
            int var7 = class105.field1499 >> 6;
            class105.field1519 = new byte[var7][var6][];
            class105.field1517 = new byte[var7][var6][];
            class105.field1508 = new int[var7][var6][];
            class105.field1509 = new int[var7][var6][];
            class105.field1513 = new byte[var7][var6][];
            class105.field1522 = new byte[var7][var6][];
            class105.field1512 = new byte[var7][var6][];
            class105.field1516 = new int[class131.field1922 + 1];
            class49.field727 = new class16();
            class40.field578 = new class288();
            int var8 = class276.field4193 >> 2 << 10;
            int var9 = class217.field3205 >> 1;
            class105.method804(var8, var9);
            class294.method2106(1024, 256, (byte) 28);
            class99.method785(256, 256, 0);
            class360.method2501(38, 256);
            class96.field1364 = 20;
        } else if (arg0 == 22781) {
            if (class96.field1364 == 20) {
                class296.method2114(arg0 - 22717, new class190(class105.field1494.method2509(-19598, "underlay", class105.field1500.field4262)));
                class96.field1364 = 30;
                class229.method1711((byte) 80, true);
                class273.method2006(85);
            } else if (class96.field1364 == 30) {
                class105.method814(new class190(class105.field1494.method2509(arg0 ^ 0xFFFFEB8F, "overlay", class105.field1500.field4262)));
                class96.field1364 = 40;
                class273.method2006(111);
            } else if (class96.field1364 == 40) {
                class105.method799(new class190(class105.field1494.method2509(-19598, "overlay2", class105.field1500.field4262)));
                class96.field1364 = 50;
                class273.method2006(118);
            } else if (class96.field1364 == 50) {
                class105.method810(new class190(class105.field1494.method2509(-19598, "loc", class105.field1500.field4262)), class189.field2692);
                class96.field1364 = 60;
                class229.method1711((byte) 113, true);
                class273.method2006(85);
            } else if (class96.field1364 == 60) {
                if (class105.field1494.method2516((byte) 97, class105.field1500.field4262 + "_labels")) {
                    if (!class105.field1494.method2541(-30281, class105.field1500.field4262 + "_labels")) {
                        return;
                    }
                    class105.field1502 = class166.method1182(53, class105.field1500.field4262 + "_labels", class189.field2692, class105.field1494);
                } else {
                    class105.field1502 = new class109(0);
                }
                class105.method813();
                class96.field1364 = 70;
                class273.method2006(111);
            } else if (class96.field1364 == 70) {
                class56.field807 = new class25(11, true, class306.field4585);
                class96.field1364 = 73;
                class229.method1711((byte) 116, true);
                class273.method2006(arg0 - 22668);
            } else if (class96.field1364 == 73) {
                class240.field3571 = new class25(12, true, class306.field4585);
                class96.field1364 = 76;
                class229.method1711((byte) 110, true);
                class273.method2006(116);
            } else if (class96.field1364 == 76) {
                class50.field759 = new class25(14, true, class306.field4585);
                class96.field1364 = 79;
                class229.method1711((byte) 123, true);
                class273.method2006(123);
            } else if (class96.field1364 == 79) {
                class19.field303 = new class25(17, true, class306.field4585);
                class96.field1364 = 82;
                class229.method1711((byte) 88, true);
                class273.method2006(94);
            } else if (class96.field1364 == 82) {
                class50.field762 = new class25(19, true, class306.field4585);
                class96.field1364 = 85;
                class229.method1711((byte) 123, true);
                class273.method2006(115);
            } else if (class96.field1364 == 85) {
                class215.field3173 = new class25(22, true, class306.field4585);
                class96.field1364 = 88;
                class229.method1711((byte) 89, true);
                class273.method2006(90);
            } else if (class96.field1364 == 88) {
                class35.field519 = new class25(26, true, class306.field4585);
                class96.field1364 = 91;
                class229.method1711((byte) 96, true);
                class273.method2006(107);
            } else {
                class54.field791 = new class25(30, true, class306.field4585);
                class96.field1364 = 100;
                class229.method1711((byte) 123, true);
                class273.method2006(87);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V", line = 2512)
    private final void method356(byte arg0) {
        field643++;
        if (class322.field4853 < class57.field841.field504) {
            if (class75.field1096 == class62.field913) {
                class62.field913 = class240.field3574;
            } else {
                class62.field913 = class75.field1096;
            }
            class104.field1492 = (class57.field841.field504 - 1) * 50 * 5;
            if (class104.field1492 > 3000) {
                class104.field1492 = 3000;
            }
            if (class57.field841.field504 >= 2 && class57.field841.field503 == 6) {
                this.method1950("js5connect_outofdate", 10);
                class194.field2819 = 1000;
                return;
            }
            if (class57.field841.field504 >= 4 && class57.field841.field503 == -1) {
                this.method1950("js5crc", 10);
                class194.field2819 = 1000;
                return;
            }
            if (class57.field841.field504 >= 4 && (class194.field2819 == 0 || class194.field2819 == 5)) {
                if (class57.field841.field503 == 7 || class57.field841.field503 == 9) {
                    this.method1950("js5connect_full", 10);
                } else if (class57.field841.field503 > 0) {
                    this.method1950("js5connect", 10);
                } else {
                    this.method1950("js5io", 10);
                }
                class194.field2819 = 1000;
                return;
            }
        }
        class322.field4853 = class57.field841.field504;
        if (class104.field1492 > 0) {
            class104.field1492--;
            return;
        }
        try {
            if (class139.field2004 == 0) {
                class202.field2961 = class54.field787.method486(class62.field913, (byte) 85, class112.field1624);
                class139.field2004++;
            }
            int var2 = -125 % ((arg0 - 40) / 49);
            if (class139.field2004 == 1) {
                if (class202.field2961.field3056 == 2) {
                    this.method364((byte) -125, 1000);
                    return;
                }
                if (class202.field2961.field3056 == 1) {
                    class139.field2004++;
                }
            }
            if (class139.field2004 == 2) {
                class330.field4969 = new class215((Socket) class202.field2961.field3058, class54.field787);
                class190 var3 = new class190(5);
                var3.method1355((byte) -120, 15);
                var3.method1354(552, (byte) -39);
                class330.field4969.method1558(5000, var3.field2718, 0, 5);
                class139.field2004++;
                class265.field4052 = class176.method1234(5574);
            }
            if (class139.field2004 == 3) {
                if (class194.field2819 == 0 || class194.field2819 == 5 || class330.field4969.method1554(-2) > 0) {
                    int var4 = class330.field4969.method1553(0);
                    if (var4 != 0) {
                        this.method364((byte) -112, var4);
                        return;
                    }
                    class139.field2004++;
                } else if (class176.method1234(5574) - class265.field4052 > 30000L) {
                    this.method364((byte) -87, 1001);
                    return;
                }
            }
            if (class139.field2004 == 4) {
                boolean var5 = class194.field2819 == 5 || class194.field2819 == 10 || class194.field2819 == 28;
                class57.field841.method248(14538, class330.field4969, !var5);
                class330.field4969 = null;
                class202.field2961 = null;
                class139.field2004 = 0;
            }
        } catch (IOException var7) {
            this.method364((byte) -105, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 2659)
    public static final void method357(boolean arg0) {
        class117.field1661.method462(24);
        field639++;
        if (arg0) {
            method354((byte) -63);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2673)
    public static final void method358() {
        for (int var0 = -1; var0 < class265.field4053 + class166.field2384; var0++) {
            class333 var1;
            long var2;
            if (var0 < 0) {
                var1 = class1.field55;
                var2 = 8791798054912L;
            } else if (var0 < class265.field4053) {
                int var4 = class227.field3426[var0];
                var1 = class343.field5312[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class215.field3158[var0 - class265.field4053];
                class181 var6 = class300.field4495[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field2609.field3136) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field5164 < 0) {
                var1.field5105 = false;
            } else {
                var1.field5160 = -1;
                int var7 = var1.method1700(-119);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field5137 & 0x7F) != 0 || (var1.field5165 & 0x7F) != 0) {
                        var1.field5105 = false;
                        continue;
                    }
                } else if ((var1.field5137 & 0x7F) != 64 || (var1.field5165 & 0x7F) != 64) {
                    var1.field5105 = false;
                    continue;
                }
                int var10002;
                if (var7 == 1) {
                    int var8 = var1.field5137 >> 7;
                    int var9 = var1.field5165 >> 7;
                    if (var8 < 0 || var8 >= 104 || var9 < 0 || var9 >= 104) {
                        var1.field5105 = true;
                        continue;
                    }
                    if (class8.field152[var8][var9] != var1.field5164) {
                        var1.field5105 = true;
                        continue;
                    }
                    if (class86.field1209[var8][var9] > 1) {
                        var10002 = class86.field1209[var8][var9]--;
                        var1.field5105 = true;
                        continue;
                    }
                } else {
                    int var10 = var1.field5137 - var7 * 64 >> 7;
                    int var11 = var1.field5165 - var7 * 64 >> 7;
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
                    if (!class221.method1609(var1.field5164, var13, 68, var11, var12, var10)) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            for (int var15 = var11; var15 < var13; var15++) {
                                if (class8.field152[var14][var15] == var1.field5164) {
                                    var10002 = class86.field1209[var14][var15]--;
                                }
                            }
                        }
                        var1.field5105 = true;
                        continue;
                    }
                }
                if (var1 instanceof class228 && var1.field5094 != null && class304.field4560 >= var1.field5110 && class304.field4560 < var1.field5135) {
                    ((class228) var1).field3464 = false;
                    var1.field5105 = false;
                    var1.field5111 = class71.method584(class321.field4835, var1.field5137, 77, var1.field5165);
                    class172.method1207(class321.field4835, var1.field5137, var1.field5165, var1.field5111, var1, var1.field5199, var2, var1.field5120, var1.field5101, var1.field5103, var1.field5184);
                } else {
                    var1.field5105 = false;
                    var1.field5111 = class71.method584(class321.field4835, var1.field5137, 103, var1.field5165);
                    class89.method707(class321.field4835, var1.field5137, var1.field5165, var1.field5111, (var7 - 1) * 64 + 60, var1, var1.field5199, var2, var1.field5187);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lqf;)Z", line = 2828)
    public static final boolean method359(class359 arg0) {
        if (class190.field2769) {
            if (method347(arg0).field2901 != 0) {
                return false;
            }
            if (arg0.field5554 == 0) {
                return false;
            }
        }
        return arg0.field5658;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 2843)
    public static final void method360(int arg0) {
        if (arg0 == 1494) {
            field632++;
            class38.field561.method458((byte) -95);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 2855)
    public static final void method361() {
        boolean var0 = class86.field1219 && class265.field4053 > 200 || class265.field4053 > 50;
        for (int var1 = 0; var1 < class265.field4053; var1++) {
            class228 var2 = class343.field5312[class227.field3426[var1]];
            var2.field5127 = false;
            if (var2.method1256(19942)) {
                var2.field3464 = var2.field5096 == var2.method2355(true).field262 ? var0 : false;
                int var3 = 0;
                if (!var2.field5105) {
                    var3++;
                }
                if (var2.field5129 > class304.field4560) {
                    var3 += 2;
                }
                int var4 = var3 + (5 - var2.method1700(-115) << 2);
                if (class273.field4134 == 0) {
                    var4 += 32;
                } else {
                    var4 += 128;
                }
                var4 += 256;
                var2.field5164 = var4 + 1;
            } else {
                var2.field5164 = -1;
            }
        }
        for (int var5 = 0; var5 < class166.field2384; var5++) {
            class181 var6 = class300.field4495[class215.field3158[var5]];
            var6.field5127 = false;
            if (var6.method1256(19942) && var6.field2609.method1549((byte) -128)) {
                int var7 = 0;
                if (!var6.field5105) {
                    var7++;
                }
                if (var6.field5129 > class304.field4560) {
                    var7 += 2;
                }
                int var8 = var7 + (5 - var6.method1700(-106) << 2);
                if (class273.field4134 == 0) {
                    if (var6.field2609.field3093) {
                        var8 += 64;
                    } else {
                        var8 += 128;
                    }
                } else if (class273.field4134 == 1) {
                    if (var6.field2609.field3093) {
                        var8 += 32;
                    } else {
                        var8 += 64;
                    }
                }
                if (var6.field2609.field3145) {
                    var8 += 512;
                } else {
                    var8 += 256;
                }
                var6.field5164 = var8 + 1;
            } else {
                var6.field5164 = -1;
            }
        }
        for (int var9 = 0; var9 < class351.field5417.length; var9++) {
            class230 var10 = class351.field5417[var9];
            if (var10 != null) {
                if (var10.field3487 == 1) {
                    class181 var11 = class300.field4495[var10.field3480];
                    if (var11 != null && var11.field5164 != -1) {
                        var11.field5164 += 1024;
                    }
                } else if (var10.field3487 == 10) {
                    class228 var12 = class343.field5312[var10.field3480];
                    if (var12 != null && var12.field5164 != -1) {
                        var12.field5164 += 1024;
                    }
                }
            }
        }
        class1.field55.field5164 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 2977)
    public final void method362(int arg0) {
        field642++;
        if (class141.field2031) {
            class141.method999();
        }
        if (class124.field1809 != null) {
            class220.method1604(class54.field787, class124.field1809, 126);
            class124.field1809 = null;
        }
        int var2 = -21 / ((arg0 - 37) / 34);
        if (class181.field2608 != null) {
            class181.field2608.field562 = false;
        }
        class181.field2608 = null;
        if (class67.field973 != null) {
            class67.field973.method1555(false);
            class67.field973 = null;
        }
        class37.method273((byte) -127, class306.field4585);
        class3.method21((byte) 50, class306.field4585);
        if (class67.field977 != null) {
            class67.field977.method543(class306.field4585, 123);
        }
        class165.method1173(false);
        class247.method1815(2047);
        class67.field977 = null;
        if (class119.field1675 != null) {
            class119.field1675.method538(true);
        }
        if (class28.field396 != null) {
            class28.field396.method538(true);
        }
        class57.field841.method241(30783);
        class75.field1087.method2037((byte) 94);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 3024)
    public static final void method363() {
        class312.field4648 = 0;
        for (int var0 = 0; var0 < class166.field2384; var0++) {
            class181 var1 = class300.field4495[class215.field3158[var0]];
            if (var1.field5105 && var1.method1251((byte) -128) != -1) {
                int var2 = var1.field5137 - (var1.method1700(-124) - 1) * 64;
                int var3 = var1.field5165 - (var1.method1700(-115) - 1) * 64;
                class180 var4 = class211.method1529(class321.field4835, var2 >> 7, var3 >> 7);
                if (var4 != null) {
                    long var5 = var4.field2585;
                    int var7 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
                    class333 var8;
                    if ((var5 >>> 29 & 0x3L) == 0L) {
                        var8 = class343.field5312[var7];
                    } else {
                        var8 = class300.field4495[var7];
                        var7 += 2048;
                    }
                    if (var8.field5160 == -1) {
                        class145.field2093[class312.field4648] = var7;
                        class357.field5474[class312.field4648++] = var7;
                        var8.field5160 = 0;
                    }
                    class145.field2093[class312.field4648] = var7;
                    class357.field5474[class312.field4648++] = class215.field3158[var0] + 2048;
                }
            }
        }
        class361.method2538((byte) -21, class145.field2093, class312.field4648 - 1, 0, class357.field5474);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 3080)
    private final void method364(byte arg0, int arg1) {
        if (arg0 >= -80) {
            field628 = (class67) null;
        }
        class202.field2961 = null;
        class57.field841.field504++;
        class57.field841.field503 = arg1;
        class139.field2004 = 0;
        field640++;
        class330.field4969 = null;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 3096)
    public static final void method365() {
        for (int var0 = -1; var0 < class265.field4053 + class166.field2384; var0++) {
            class333 var1;
            long var2;
            if (var0 < 0) {
                var1 = class1.field55;
                var2 = 8791798054912L;
            } else if (var0 < class265.field4053) {
                int var4 = class227.field3426[var0];
                var1 = class343.field5312[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class215.field3158[var0 - class265.field4053];
                class181 var6 = class300.field4495[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field2609.field3136) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field5164 >= 0) {
                int var7 = var1.method1700(-119);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field5137 & 0x7F) == 0 && (var1.field5165 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var1.field5137 & 0x7F) == 64 && (var1.field5165 & 0x7F) == 64) {
                    continue;
                }
                if (var1 instanceof class228 && var1.field5094 != null && class304.field4560 >= var1.field5110 && class304.field4560 < var1.field5135) {
                    ((class228) var1).field3464 = false;
                    var1.field5111 = class71.method584(class321.field4835, var1.field5137, 103, var1.field5165);
                    class172.method1207(class321.field4835, var1.field5137, var1.field5165, var1.field5111, var1, var1.field5199, var2, var1.field5120, var1.field5101, var1.field5103, var1.field5184);
                } else {
                    var1.field5111 = class71.method584(class321.field4835, var1.field5137, 109, var1.field5165);
                    class89.method707(class321.field4835, var1.field5137, var1.field5165, var1.field5111, (var7 - 1) * 64 + 60, var1, var1.field5199, var2, var1.field5187);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 3164)
    public final void init() {
        field630++;
        if (!this.method1955(124)) {
            return;
        }
        class359.field5624 = Integer.parseInt(this.getParameter("worldid"));
        class14.field214 = Integer.parseInt(this.getParameter("modewhere"));
        if (class14.field214 < 0 || class14.field214 > 1) {
            class14.field214 = 0;
        }
        class59.field870 = Integer.parseInt(this.getParameter("modewhat"));
        if (class59.field870 < 0 || class59.field870 > 2) {
            class59.field870 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class356.field5459 = true;
        } else {
            class356.field5459 = false;
        }
        try {
            class54.field789 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class54.field789 = 0;
        }
        class107.method818(class54.field789, -15875);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class8.field147 = true;
        } else {
            class8.field147 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class158.field2272 = true;
        } else {
            class158.field2272 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class164.field2335 = 1;
        } else {
            class164.field2335 = 0;
        }
        try {
            class177.field2543 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class177.field2543 = 0;
        }
        class294.field4432 = this.getParameter("settings");
        if (class294.field4432 == null) {
            class294.field4432 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class129.field1873 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class129.field1873 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class299.field4468 = true;
        } else {
            class299.field4468 = false;
        }
        class300.field4493 = this;
        this.method1959(765, class59.field870 + 32, 1552, (byte) -110, 503);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V", line = 3246)
    private final void method366(byte[] arg0, boolean arg1) {
        if (!arg1) {
            method363();
        }
        field626++;
        class190 var3 = new class190(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method1319(255);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class48.field718 = new int[6];
                    var5[0] = var3.method1317((byte) 114);
                    var5[1] = var3.method1317((byte) 14);
                    var5[2] = var3.method1317((byte) 120);
                    var5[3] = var3.method1317((byte) 111);
                    var5[4] = var3.method1317((byte) 20);
                    var5[5] = var3.method1317((byte) 108);
                } else if (var4 == 4) {
                    int var6 = var3.method1319(255);
                    class145.field2091 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class145.field2091[var7] = var3.method1317((byte) 12);
                        if (class145.field2091[var7] == 65535) {
                            class145.field2091[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 3306)
    public final void method367(int arg0) {
        field631++;
        if (class194.field2819 == 1000) {
            return;
        }
        long var2 = class173.method1214(arg0 ^ arg0) / 1000000L - class362.field5741;
        class362.field5741 = class173.method1214(0) / 1000000L;
        boolean var4 = class252.method1846(1);
        if (var4 && class65.field958 && class119.field1675 != null) {
            class119.field1675.method527(-100);
        }
        if ((class194.field2819 == 30 || class194.field2819 == 10) && (class11.field178 || class150.field2186 != 0L && class176.method1234(5574) > class150.field2186)) {
            class348.method2443(class285.field4298, class11.field178, (byte) -78, class96.field1365, class89.method706(-12311));
        }
        if (class124.field1809 == null) {
            Container var5;
            if (class124.field1809 != null) {
                var5 = class124.field1809;
            } else if (class131.field1905 == null) {
                var5 = class54.field787.field878;
            } else {
                var5 = class131.field1905;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class131.field1905 == var5) {
                Insets var8 = class131.field1905.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class212.field3069 != var6 || class98.field1389 != var7) {
                if (class61.field887.startsWith("mac")) {
                    class212.field3069 = var6;
                    class98.field1389 = var7;
                } else {
                    class12.method68(-1);
                }
                class150.field2186 = class176.method1234(arg0 ^ 0xFFFFEA39) + 500L;
            }
        }
        if (class124.field1809 != null && !class213.field3078 && (class194.field2819 == 30 || class194.field2819 == 10)) {
            class348.method2443(-1, false, (byte) -86, -1, class135.field1971);
        }
        boolean var9 = false;
        if (class267.field4069) {
            class267.field4069 = false;
            var9 = true;
        }
        if (var9) {
            class228.method1705((byte) -56);
        }
        if (class141.field2031) {
            for (int var10 = 0; var10 < 100; var10++) {
                class332.field5051[var10] = true;
            }
        }
        if (class194.field2819 == 0) {
            class217.method1565(class120.field1685, arg0 + 3, (Color) null, class300.field4487, var9);
        } else if (class194.field2819 == 5) {
            class230.method1714(false, (byte) -122, class126.field1846);
        } else if (class194.field2819 == 10) {
            class287.method2077(97);
        } else if (class194.field2819 == 25 || class194.field2819 == 28) {
            if (class99.field1409 == 1) {
                if (class91.field1263 < class157.field2268) {
                    class91.field1263 = class157.field2268;
                }
                int var12 = (class91.field1263 - class157.field2268) * 50 / class91.field1263;
                class355.method2470((byte) -25, class127.field1851 + "<br>(" + var12 + "%)", false);
            } else if (class99.field1409 == 2) {
                if (class14.field213 < class165.field2352) {
                    class14.field213 = class165.field2352;
                }
                int var11 = (class14.field213 - class165.field2352) * 50 / class14.field213 + 50;
                class355.method2470((byte) -99, class127.field1851 + "<br>(" + var11 + "%)", false);
            } else {
                class355.method2470((byte) -77, class127.field1851, false);
            }
        } else if (class194.field2819 == 30) {
            class5.method36(var2, 122);
        } else if (class194.field2819 == 40) {
            class355.method2470((byte) -66, class298.field4456 + "<br>" + class110.field1593, false);
        }
        if (class141.field2031 && class194.field2819 != 0) {
            class141.method984();
            for (int var19 = 0; var19 < class178.field2558; var19++) {
                class186.field2674[var19] = false;
            }
        } else if ((class194.field2819 == 30 || class194.field2819 == 10) && class7.field139 == 0 && !var9) {
            try {
                Graphics var13 = class306.field4585.getGraphics();
                for (int var14 = 0; var14 < class178.field2558; var14++) {
                    if (class186.field2674[var14]) {
                        class356.field5460.method222(class27.field383[var14], class324.field4883[var14], class338.field5251[var14], var13, 44, class96.field1358[var14]);
                        class186.field2674[var14] = false;
                    }
                }
            } catch (Exception var21) {
                class306.field4585.repaint();
            }
        } else if (class194.field2819 != 0) {
            try {
                Graphics var16 = class306.field4585.getGraphics();
                class356.field5460.method221(0, 0, -101, var16);
                for (int var17 = 0; var17 < class178.field2558; var17++) {
                    class186.field2674[var17] = false;
                }
            } catch (Exception var20) {
                class306.field4585.repaint();
            }
        }
        if (class292.field4427) {
            class177.method1236((byte) -21);
        }
        if (class130.field1879 && class194.field2819 == 10 && class257.field3850 != -1) {
            class130.field1879 = false;
            class309.method2176(class54.field787, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 3526)
    public final void method368(int arg0) {
        int var2 = 108 % ((-arg0 - 55) / 59);
        field635++;
        if (class194.field2819 == 1000) {
            return;
        }
        class304.field4560++;
        if (class304.field4560 % 1000 == 1) {
            GregorianCalendar var3 = new GregorianCalendar();
            class321.field4836 = var3.get(11) * 600 + var3.get(12) * 10 + (var3.get(13) / 6);
            class321.field4819.setSeed((long) class321.field4836);
        }
        this.method352((byte) 28);
        if (class21.field329 != null) {
            class21.field329.method122(-118);
        }
        class27.method166(-4588);
        class32.method228(0);
        class160.method1148(4);
        class4.method31(591);
        if (class141.field2031) {
            class305.method2146();
        }
        if (class67.field977 != null) {
            int var4 = class67.field977.method542((byte) 9);
            class142.field2063 = var4;
        }
        if (class194.field2819 == 0) {
            this.method350(100);
            class273.method2006(116);
        } else if (class194.field2819 == 5) {
            this.method350(100);
            class273.method2006(125);
        } else if (class194.field2819 == 25 || class194.field2819 == 28) {
            class277.method2021(-31477);
        }
        if (class194.field2819 == 10) {
            this.method351((byte) -41);
            class216.method1564(4380);
            class74.method610(2);
            class278.method2033(-2);
        } else if (class194.field2819 == 30) {
            class116.method866((byte) 127);
        } else if (class194.field2819 == 40) {
            class278.method2033(-2);
            if (class158.field2278 != -3) {
                if (class158.field2278 == 15) {
                    class189.method1307((byte) 19);
                } else if (class158.field2278 != 2) {
                    class302.method2131((byte) -120);
                }
            }
        }
    }
}
