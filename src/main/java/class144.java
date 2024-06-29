import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class144 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field3401 = 0;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Laf;")
    public static class7 field3405 = class48.method406(40, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field3400 = 0;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lnd;")
    public static class94 field3408 = new class94();

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field3411 = 0;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Laf;")
    public static class7 field3412 = class48.method406(40, " loggt sich ein)3");

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "La;")
    public static class1 field3402;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lfd;")
    public static class40 field3403;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lkb;")
    public static class71 field3407;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static final void method1166(int arg0) {
        field3409++;
        try {
            if (class136.field3237 == 0) {
                if (class12.field302 != null) {
                    class12.field302.method1172((byte) 10);
                    class12.field302 = null;
                }
                class115.field2743 = 0;
                class46.field1107 = false;
                class136.field3237 = 1;
                class79.field1834 = null;
            }
            if (class136.field3237 == 1) {
                if (class79.field1834 == null) {
                    class79.field1834 = class74.field1717.method822(-10176, class2.field5, class52.field1267);
                }
                if (class79.field1834.field2087 == 2) {
                    throw new IOException();
                }
                if (class79.field1834.field2087 == 1) {
                    class12.field302 = new class145((Socket) class79.field1834.field2090, class74.field1717);
                    class79.field1834 = null;
                    class136.field3237 = 2;
                }
            }
            if (class136.field3237 == 2) {
                long var1 = class130.field3096 = class106.field2608.method70(18982);
                class47.field1150.field2903 = 0;
                class47.field1150.method959(14, (byte) -120);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class47.field1150.method959(var3, (byte) -120);
                class12.field302.method1178(2, (byte) -92, 0, class47.field1150.field2895);
                class136.field3237 = 3;
                class91.field2100.field2903 = 0;
            }
            if (class136.field3237 == 3) {
                if (class133.field3118 != null) {
                    class133.field3118.method593(false);
                }
                if (class111.field2674 != null) {
                    class111.field2674.method593(false);
                }
                int var4 = class12.field302.method1171(3429);
                if (class133.field3118 != null) {
                    class133.field3118.method593(false);
                }
                if (class111.field2674 != null) {
                    class111.field2674.method593(false);
                }
                if (var4 != 0) {
                    class26.method236(false, var4);
                    return;
                }
                class91.field2100.field2903 = 0;
                class136.field3237 = 4;
            }
            if (class136.field3237 == 4) {
                if (class91.field2100.field2903 < 8) {
                    int var5 = class12.field302.method1175((byte) -123);
                    if (8 - class91.field2100.field2903 < var5) {
                        var5 = 8 - class91.field2100.field2903;
                    }
                    if (var5 > 0) {
                        class12.field302.method1176(arg0 - 1564, class91.field2100.field2895, var5, class91.field2100.field2903);
                        class91.field2100.field2903 += var5;
                    }
                }
                if (class91.field2100.field2903 == 8) {
                    class91.field2100.field2903 = 0;
                    class73.field1689 = class91.field2100.method946(-103);
                    class136.field3237 = 5;
                }
            }
            if (class136.field3237 == 5) {
                class47.field1150.field2903 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class73.field1689 >> 32), (int) class73.field1689 };
                class47.field1150.method959(10, (byte) -120);
                class47.field1150.method970((byte) -96, var6[0]);
                class47.field1150.method970((byte) -96, var6[1]);
                class47.field1150.method970((byte) -96, var6[2]);
                class47.field1150.method970((byte) -96, var6[3]);
                class47.field1150.method970((byte) -96, class74.field1717.field2377);
                class47.field1150.method956(class106.field2608.method70(18982), -822368080);
                class47.field1150.method932(class106.field2618, (byte) 86);
                class47.field1150.method951(class97.field2306, class127.field3046, 0);
                class141.field3321.field2903 = 0;
                if (class108.field2634 == 40) {
                    class141.field3321.method959(18, (byte) -120);
                } else {
                    class141.field3321.method959(16, (byte) -120);
                }
                class141.field3321.method959(class47.field1150.field2903 + 69, (byte) -120);
                class141.field3321.method970((byte) -96, 461);
                class141.field3321.method959(class91.field2106 ? 1 : 0, (byte) -120);
                class141.field3321.method970((byte) -96, class82.field1881.field1543);
                class141.field3321.method970((byte) -96, class53.field1290.field1543);
                class141.field3321.method970((byte) -96, class57.field1365.field1543);
                class141.field3321.method970((byte) -96, class75.field1754.field1543);
                class141.field3321.method970((byte) -96, class39.field984.field1543);
                class141.field3321.method970((byte) -96, class21.field545.field1543);
                class141.field3321.method970((byte) -96, class113.field2710.field1543);
                class141.field3321.method970((byte) -96, class18.field430.field1543);
                class141.field3321.method970((byte) -96, class127.field3060.field1543);
                class141.field3321.method970((byte) -96, class48.field1169.field1543);
                class141.field3321.method970((byte) -96, class71.field1554.field1543);
                class141.field3321.method970((byte) -96, class142.field3373.field1543);
                class141.field3321.method970((byte) -96, class11.field282.field1543);
                class141.field3321.method970((byte) -96, class83.field1973.field1543);
                class141.field3321.method970((byte) -96, class120.field2826.field1543);
                class141.field3321.method970((byte) -96, class13.field341.field1543);
                class141.field3321.method952(class47.field1150.field2895, 0, -1470, class47.field1150.field2903);
                class12.field302.method1178(class141.field3321.field2903, (byte) -49, 0, class141.field3321.field2895);
                class47.field1150.method1142(var6, true);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class91.field2100.method1142(var6, true);
                class136.field3237 = 6;
            }
            if (class136.field3237 == 6 && class12.field302.method1175((byte) -117) > 0) {
                int var8 = class12.field302.method1171(3429);
                if (var8 == 21 && class108.field2634 == 20) {
                    class136.field3237 = 7;
                } else if (var8 == 2) {
                    class136.field3237 = 9;
                } else if (var8 == 15 && class108.field2634 == 40) {
                    class141.method1152(113);
                    return;
                } else if (var8 == 23 && class80.field1848 < 1) {
                    class136.field3237 = 0;
                    class80.field1848++;
                } else {
                    class26.method236(false, var8);
                    return;
                }
            }
            if (arg0 == 15) {
                if (class136.field3237 == 7 && class12.field302.method1175((byte) -126) > 0) {
                    class38.field961 = class12.field302.method1171(3429) * 60 + 180;
                    class136.field3237 = 8;
                }
                if (class136.field3237 == 8) {
                    class115.field2743 = 0;
                    class47.method396(class28.field740, class149.field3507, class116.method905(new class7[] { class51.method421((byte) -96, class38.field961 / 60), class3.field34 }, 1), 119);
                    if (--class38.field961 <= 0) {
                        class136.field3237 = 0;
                    }
                } else {
                    if (class136.field3237 == 9 && class12.field302.method1175((byte) -117) >= 8) {
                        class43.field1031 = class12.field302.method1171(arg0 ^ 0xD6A);
                        class152.field3563 = class12.field302.method1171(arg0 ^ 0xD6A) == 1;
                        class96.field2298 = class12.field302.method1171(3429);
                        class96.field2298 <<= 0x8;
                        class96.field2298 += class12.field302.method1171(3429);
                        class14.field344 = class12.field302.method1171(3429);
                        class12.field302.method1176(-1549, class91.field2100.field2895, 1, 0);
                        class91.field2100.field2903 = 0;
                        class121.field2854 = class91.field2100.method1139(arg0 + 240);
                        class12.field302.method1176(arg0 ^ 0xFFFFF9FC, class91.field2100.field2895, 2, 0);
                        class91.field2100.field2903 = 0;
                        class87.field2026 = class91.field2100.method965(false);
                        class136.field3237 = 10;
                    }
                    if (class136.field3237 != 10) {
                        class115.field2743++;
                        if (class115.field2743 > 2000) {
                            if (class80.field1848 < 1) {
                                class136.field3237 = 0;
                                if (class52.field1267 == class109.field2658) {
                                    class52.field1267 = class66.field1443;
                                } else {
                                    class52.field1267 = class109.field2658;
                                }
                                class80.field1848++;
                            } else {
                                class26.method236(false, -3);
                            }
                        }
                    } else if (class12.field302.method1175((byte) -128) >= class87.field2026) {
                        class91.field2100.field2903 = 0;
                        class12.field302.method1176(-1549, class91.field2100.field2895, class87.field2026, 0);
                        class58.method473(73);
                        class126.field3010 = -1;
                        class139.method1133(false, (byte) 87);
                        class121.field2854 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class80.field1848 < 1) {
                class136.field3237 = 0;
                class80.field1848++;
                if (class52.field1267 == class109.field2658) {
                    class52.field1267 = class66.field1443;
                } else {
                    class52.field1267 = class109.field2658;
                }
            } else {
                class26.method236(false, -2);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method1167(byte arg0) {
        if (arg0 != 1) {
            field3401 = 22;
        }
        field3405 = null;
        field3407 = null;
        field3412 = null;
        field3403 = null;
        field3402 = null;
        field3408 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Laf;BI)V")
    public static final void method1168(class7 arg0, byte arg1, int arg2) {
        field3410++;
        class47.field1150.method1131(141, 2027385224);
        class47.field1150.method960(arg2, -1358629928);
        class96.field2282++;
        class47.field1150.method940(arg0.method70(18982), (byte) -55);
        if (arg1 <= 68) {
            method1169(null, (byte) 6, null);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
    public static final void method1169(Throwable arg0, byte arg1, String arg2) {
        field3406++;
        int var3 = -63 % ((-arg1 - 14) / 46);
        try {
            String var4 = "";
            if (arg0 != null) {
                var4 = class135.method1098(arg0, (byte) -57);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var4 = var4 + " | ";
                }
                var4 = var4 + arg2;
            }
            System.out.println("Error: " + var4);
            String var5 = var4.replace(':', '.');
            String var6 = var5.replace('@', '_');
            String var7 = var6.replace('&', '_');
            String var8 = var7.replace('#', '_');
            if (class46.field1129.field2366 != null) {
                class90 var9 = class46.field1129.method828(0, new URL(class46.field1129.field2366.getCodeBase(), "clienterror.ws?c=" + class103.field2510 + "&u=" + class130.field3096 + "&v1=" + class100.field2370 + "&v2=" + class100.field2371 + "&e=" + var8));
                while (var9.field2087 == 0) {
                    class79.method673(2, 1L);
                }
                if (var9.field2087 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field2090;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLad;Lad;)V")
    public static final void method1170(byte arg0, class5 arg1, class5 arg2) {
        if (class109.field2664 == null) {
            class109.field2664 = class27.method249((byte) -86, class127.field3060, class83.field1947, class106.field2614);
        }
        field3404++;
        if (class116.field2765 == null) {
            class116.field2765 = class24.method230(class106.field2614, -16125, class111.field2678, class127.field3060);
        }
        if (class66.field1435 == null) {
            class66.field1435 = class24.method230(class106.field2614, -16125, class13.field327, class127.field3060);
        }
        if (arg0 <= 11) {
            return;
        }
        if (class6.field107 == null) {
            class6.field107 = class24.method230(class106.field2614, -16125, class121.field2853, class127.field3060);
        }
        class33.method304(0, 23, 765, 480, 0);
        class33.method290(0, 0, 125, 23, 12425273, 9135624);
        class33.method290(125, 0, 640, 23, 5197647, 2697513);
        arg2.method47(class84.field1976, 62, 15, 0, -1);
        if (class6.field107 != null) {
            class6.field107[1].method896(140, 1);
            arg1.method42(class102.field2429, 152, 10, 16777215, -1);
            class6.field107[0].method896(140, 12);
            arg1.method42(class72.field1627, 152, 21, 16777215, -1);
        }
        if (class66.field1435 != null) {
            short var3 = 280;
            if (class75.field1752[0] == 0 && class73.field1638[0] == 0) {
                class66.field1435[2].method896(var3, 4);
            } else {
                class66.field1435[0].method896(var3, 4);
            }
            short var4 = 390;
            if (class75.field1752[0] == 0 && class73.field1638[0] == 1) {
                class66.field1435[3].method896(var3 + 15, 4);
            } else {
                class66.field1435[1].method896(var3 + 15, 4);
            }
            arg2.method42(class151.field3535, var3 + 32, 17, 16777215, -1);
            short var5 = 610;
            short var6 = 500;
            if (class75.field1752[0] == 1 && class73.field1638[0] == 0) {
                class66.field1435[2].method896(var4, 4);
            } else {
                class66.field1435[0].method896(var4, 4);
            }
            if (class75.field1752[0] == 1 && class73.field1638[0] == 1) {
                class66.field1435[3].method896(var4 + 15, 4);
            } else {
                class66.field1435[1].method896(var4 + 15, 4);
            }
            arg2.method42(class45.field1079, var4 + 32, 17, 16777215, -1);
            if (class75.field1752[0] == 2 && class73.field1638[0] == 0) {
                class66.field1435[2].method896(var6, 4);
            } else {
                class66.field1435[0].method896(var6, 4);
            }
            if (class75.field1752[0] == 2 && class73.field1638[0] == 1) {
                class66.field1435[3].method896(var6 + 15, 4);
            } else {
                class66.field1435[1].method896(var6 + 15, 4);
            }
            arg2.method42(class149.field3520, var6 + 32, 17, 16777215, -1);
            if (class75.field1752[0] == 3 && class73.field1638[0] == 0) {
                class66.field1435[2].method896(var5, 4);
            } else {
                class66.field1435[0].method896(var5, 4);
            }
            if (class75.field1752[0] == 3 && class73.field1638[0] == 1) {
                class66.field1435[3].method896(var5 + 15, 4);
            } else {
                class66.field1435[1].method896(var5 + 15, 4);
            }
            arg2.method42(class45.field1064, var5 + 32, 17, 16777215, -1);
        }
        class33.method304(708, 4, 50, 16, 0);
        arg1.method47(class79.field1842, 733, 16, 16777215, -1);
        class89.field2081 = -1;
        if (class109.field2664 != null) {
            byte var7 = 88;
            byte var8 = 19;
            int var9 = 765 / (var7 + 1);
            int var10 = 480 / (var8 + 1);
            int var11;
            int var12;
            do {
                var11 = var10;
                var12 = var9;
                if ((var9 - 1) * var10 >= class55.field1340) {
                    var9--;
                }
                if (class55.field1340 <= (var10 - 1) * var9) {
                    var10--;
                }
                if ((var10 - 1) * var9 >= class55.field1340) {
                    var10--;
                }
            } while (var10 != var11 || var9 != var12);
            int var13 = (765 - var7 * var9) / (var9 + 1);
            int var14 = (480 - var8 * var10) / (var10 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (765 - var7 * var9 - (var9 + -1) * var13) / 2;
            int var16 = (480 - var8 * var10 - (var10 + -1) * var14) / 2;
            int var17 = var15;
            int var18 = 0;
            int var19 = var16 + 23;
            for (int var20 = 0; var20 < class55.field1340; var20++) {
                class14 var21 = class38.field959[var20];
                class7 var22 = class51.method421((byte) 116, var21.field352);
                boolean var23 = true;
                if (var21.field352 == -1) {
                    var22 = class118.field2791;
                    var23 = false;
                } else if (var21.field352 > 1980) {
                    var23 = false;
                    var22 = class55.field1331;
                }
                if (class113.field2709 >= var17 && var19 <= class111.field2681 && var7 + var17 > class113.field2709 && var19 + var8 > class111.field2681 && var23) {
                    class89.field2081 = var20;
                    class109.field2664[var21.field350 ? 1 : 0].method359(var17, var19, 128, 16777215);
                } else {
                    class109.field2664[var21.field350 ? 1 : 0].method366(var17, var19);
                }
                if (class116.field2765 != null) {
                    class116.field2765[(var21.field350 ? 8 : 0) + var21.field351].method896(var17 + 29, var19);
                }
                arg2.method47(class51.method421((byte) 116, var21.field358), var17 + 15, var8 / 2 + 5 + var19, 0, -1);
                arg1.method47(var22, var17 + 60, var8 / 2 + var19 + 5, 268435455, -1);
                var19 += var8 + var14;
                int var10000 = ~var10;
                var18++;
                if (var10000 >= ~var18) {
                    var18 = 0;
                    var17 += var7 + var13;
                    var19 = var16 + 23;
                }
            }
        }
        try {
            Graphics var24 = class13.field324.getGraphics();
            class102.field2425.method647(var24, 0, 0, (byte) 46);
        } catch (Exception var25) {
            class13.field324.repaint();
        }
    }
}
