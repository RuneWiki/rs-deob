import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class69 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lec;")
    public static class25 field1009 = new class25(50);

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public static int field1011 = 7759444;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[I")
    public static int[] field1013 = new int[200];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lqa;")
    public static class159 field1012;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)V")
    public static final void method432(boolean arg0) {
        field1014++;
        class235.field3728.method144(0);
        class120.field1843.method144(0);
        if (!arg0) {
            method437((byte) 87);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Lnd;")
    public static final class286 method433(int arg0, int arg1, int arg2) {
        class154 var3 = class27.field346[arg0][arg1][arg2];
        return var3 == null || var3.field2419 == null ? null : var3.field2419;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIILkk;)V")
    public static final void method434(int arg0, int arg1, int arg2, int arg3, class254 arg4) {
        field1010++;
        class217.method1521(arg2 ^ 0xB);
        class62.method391(arg3, arg1, arg4.field4085 + arg3, arg4.field4152 + arg1);
        if (arg2 != 10) {
            field1013 = null;
        }
        if (class76.field1196 == 2 || class76.field1196 == 5 || class44.field608 == null) {
            class62.method396(arg3, arg1, 0, arg4.field4193, arg4.field4092);
        } else {
            int var5;
            int var6;
            int var7;
            int var8;
            if (class92.field1402 == 4) {
                var5 = 256;
                var6 = class49.field677;
                var7 = (int) class202.field3253 & 0x7FF;
                var8 = class274.field4531;
            } else {
                var6 = class309.field5006.field850;
                var7 = (int) class202.field3253 + class262.field4330 & 0x7FF;
                var8 = class309.field5006.field836;
                var5 = class265.field4365 + 256;
            }
            int var9 = var8 / 32 + 48;
            int var10 = 464 - (var6 / 32);
            ((class38) class44.field608).method255(arg3, arg1, arg4.field4085, arg4.field4152, var9, var10, var7, var5, arg4.field4193, arg4.field4092);
            if (class212.field3389 != null) {
                for (int var11 = 0; var11 < class212.field3389.field4792; var11++) {
                    if (class212.field3389.field4796[var11] != null && (class212.field3389.field4795[var11] >> 28) == class165.field2600) {
                        int var12 = (class212.field3389.field4795[var11] >> 14 & 0x3FFF) - class101.field1517;
                        int var13 = (class212.field3389.field4795[var11] & 0x3FFF) - class254.field4063;
                        if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                            int var14 = var13 * 4 + 2 - (var6 / 32);
                            int var15 = var12 * 4 + 2 - (var8 / 32);
                            class44.method284(var14, arg1, var15, -99, arg4, arg3, class212.field3389.field4796[var11].field5051);
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < class253.field4006; var16++) {
                int var51 = class288.field4789[var16] * 4 + 2 - (var8 / 32);
                int var52 = class146.field2300[var16] * 4 + 2 - (var6 / 32);
                class74 var53 = class216.method1510(arg2 - 10, class150.field2338[var16]);
                if (var53.field1149 != null) {
                    var53 = var53.method488(-93);
                    if (var53 == null || var53.field1128 == -1) {
                        continue;
                    }
                }
                class44.method284(var52, arg1, var51, 92, arg4, arg3, var53.field1128);
            }
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var47 = 0; var47 < 104; var47++) {
                    class281 var48 = class239.field3780[class165.field2600][var17][var47];
                    if (var48 != null) {
                        int var49 = var47 * 4 + 2 - var6 / 32;
                        int var50 = var17 * 4 + 2 - (var8 / 32);
                        class121.method787(var50, class25.field320[0], arg4, arg1, var49, arg3, -1);
                    }
                }
            }
            for (int var18 = 0; var18 < class14.field195; var18++) {
                class35 var43 = class76.field1188[class76.field1189[var18]];
                if (var43 != null && var43.method211(arg2 + 65525)) {
                    class106 var44 = var43.field442;
                    if (var44 != null && var44.field1630 != null) {
                        var44 = var44.method685(arg2 ^ 0xFFFFFFF5);
                    }
                    if (var44 != null && var44.field1595 && var44.field1648) {
                        int var45 = var43.field836 / 32 - (var8 / 32);
                        int var46 = var43.field850 / 32 - (var6 / 32);
                        if (var44.field1617 == -1) {
                            class121.method787(var45, class25.field320[1], arg4, arg1, var46, arg3, -1);
                        } else {
                            class44.method284(var46, arg1, var45, -118, arg4, arg3, var44.field1617);
                        }
                    }
                }
            }
            for (int var19 = 0; var19 < class249.field3964; var19++) {
                class208 var35 = class300.field4925[class53.field713[var19]];
                if (var35 != null && var35.method211(65535)) {
                    int var36 = var35.field836 / 32 - (var8 / 32);
                    int var37 = var35.field850 / 32 - (var6 / 32);
                    boolean var38 = false;
                    for (int var39 = 0; var39 < class140.field2164; var39++) {
                        if (var35.field3329.equals(class120.field1848[var39]) && field1013[var39] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class297.field4885; var41++) {
                        if (var35.field3329.equals(class276.field4567[var41].field2132)) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    if (class309.field5006.field3341 != 0 && var35.field3341 != 0 && class309.field5006.field3341 == var35.field3341) {
                        var42 = true;
                    }
                    if (var38) {
                        class121.method787(var36, class25.field320[3], arg4, arg1, var37, arg3, -1);
                    } else if (var40) {
                        class121.method787(var36, class25.field320[5], arg4, arg1, var37, arg3, -1);
                    } else if (var42) {
                        class121.method787(var36, class25.field320[4], arg4, arg1, var37, arg3, -1);
                    } else {
                        class121.method787(var36, class25.field320[2], arg4, arg1, var37, arg3, -1);
                    }
                }
            }
            int var20 = 0;
            class3[] var21 = class263.field4340;
            while (var21.length > var20) {
                class3 var24 = var21[var20];
                if (var24 != null && var24.field16 != 0 && class4.field32 % 20 < 10) {
                    if (var24.field16 == 1 && var24.field17 >= 0 && class76.field1188.length > var24.field17) {
                        class35 var25 = class76.field1188[var24.field17];
                        if (var25 != null) {
                            int var26 = var25.field836 / 32 - (var8 / 32);
                            int var27 = var25.field850 / 32 - (var6 / 32);
                            class168.method1114(arg4, var26, var24.field14, (byte) -122, 360000, var27, arg1, arg3);
                        }
                    }
                    if (var24.field16 == 2) {
                        int var28 = (var24.field20 - class254.field4063) * 4 + 2 - (var6 / 32);
                        int var29 = (var24.field25 - class101.field1517) * 4 - (var8 / 32 - 2);
                        int var30 = var24.field21 * 4;
                        int var31 = var30 * var30;
                        class168.method1114(arg4, var29, var24.field14, (byte) -120, var31, var28, arg1, arg3);
                    }
                    if (var24.field16 == 10 && var24.field17 >= 0 && class300.field4925.length > var24.field17) {
                        class208 var32 = class300.field4925[var24.field17];
                        if (var32 != null) {
                            int var33 = var32.field836 / 32 - (var8 / 32);
                            int var34 = var32.field850 / 32 - (var6 / 32);
                            class168.method1114(arg4, var33, var24.field14, (byte) -123, 360000, var34, arg1, arg3);
                        }
                    }
                }
                var20++;
            }
            if (class92.field1402 != 4) {
                if (class281.field4649 != 0) {
                    int var22 = class281.field4649 * 4 + (class309.field5006.method362(25892) - 1) * 2 + 2 - (var8 / 32);
                    int var23 = class271.field4443 * 4 + (2 - -((class309.field5006.method362(arg2 ^ 0x652E) + -1) * 2)) - (var6 / 32);
                    class121.method787(var22, class250.field3987[client.field2582 ? 1 : 0], arg4, arg1, var23, arg3, -1);
                }
                class62.method380(arg4.field4085 / 2 + arg3 - 1, arg4.field4152 / 2 + arg1 + -1, 3, 3, 16777215);
            }
        }
        class241.field3799[arg0] = true;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
    public static final void method435(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class223.field3550 * arg1 >> 8;
        if (arg3 != 13583) {
            method433(42, -32, -16);
        }
        if (var4 != 0 && arg2 != -1) {
            class35.method201(false, arg2, (byte) 122, class66.field977, var4, 0);
            class6.field52 = true;
        }
        field1003++;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public static void method436(boolean arg0) {
        field1009 = null;
        field1013 = null;
        if (!arg0) {
            method435(65, -23, 114, 105);
        }
        field1012 = null;
    }

    @OriginalMember(owner = "client!rc", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class73.field1080 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class100.method647((byte) 106, var2)) {
                int var3 = class152.field2374 + 1 & 0x7F;
                if (class296.field4858 != var3) {
                    class248.field3940[class152.field2374] = -1;
                    class252.field3998[class152.field2374] = var2;
                    class152.field2374 = var3;
                }
            }
        }
        arg0.consume();
        field1006++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static final void method437(byte arg0) {
        field1005++;
        int[] var1 = new int[class120.field1845];
        int var2 = 0;
        for (int var3 = 0; var3 < class120.field1845; var3++) {
            class132 var5 = class14.method92(var3, false);
            if (var5.field2031 >= 0 || var5.field2080 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (arg0 >= -1) {
            method438(116);
        }
        class57.field783 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class57.field783[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!rc", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1001++;
        if (class73.field1080 != null) {
            class230.field3665 = -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class73.field1080 != null) {
            class189.field2903 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class56.field751.length > var2) {
                var3 = class56.field751[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class230.field3665 >= 0 && var3 >= 0) {
                class36.field457[class230.field3665] = var3;
                class230.field3665 = class230.field3665 + 1 & 0x7F;
                if (class230.field3665 == class179.field2777) {
                    class230.field3665 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class152.field2374 + 1 & 0x7F;
                if (class296.field4858 != var4) {
                    class248.field3940[class152.field2374] = var3;
                    class252.field3998[class152.field2374] = '\u0000';
                    class152.field2374 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1007++;
    }

    @OriginalMember(owner = "client!rc", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class73.field1080 != null) {
            class189.field2903 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class56.field751.length > var2) {
                var3 = class56.field751[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class230.field3665 >= 0 && var3 >= 0) {
                class36.field457[class230.field3665] = ~var3;
                class230.field3665 = class230.field3665 + 1 & 0x7F;
                if (class230.field3665 == class179.field2777) {
                    class230.field3665 = -1;
                }
            }
        }
        arg0.consume();
        field1004++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static final void method438(int arg0) {
        int var1 = 0;
        if (arg0 > -125) {
            return;
        }
        while (class195.field3109 > var1) {
            int var10002 = class166.field2608[var1]--;
            if (class166.field2608[var1] >= -10) {
                label87: {
                    class308 var3 = class276.field4575[var1];
                    if (var3 == null) {
                        var3 = class308.method2105(class9.field119, class71.field1031[var1], 0);
                        if (var3 == null) {
                            break label87;
                        }
                        class166.field2608[var1] += var3.method2104();
                        class276.field4575[var1] = var3;
                    }
                    if (class166.field2608[var1] < 0) {
                        label90: {
                            int var10;
                            if (class307.field4996[var1] == 0) {
                                var10 = class105.field1575[var1] * class11.field145 >> 8;
                            } else {
                                int var4 = (class307.field4996[var1] & 0xFF) * 128;
                                int var5 = (class307.field4996[var1] & 0xFF45) >> 8;
                                int var6 = (class307.field4996[var1] & 0xFF0C8E) >> 16;
                                int var7 = var6 * 128 - (class309.field5006.field836 - 64);
                                int var8 = var5 * 128 + 64 - class309.field5006.field850;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var9 = var7 + var8 - 128;
                                if (var9 > var4) {
                                    class166.field2608[var1] = -100;
                                    break label90;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = (var4 - var9) * class19.field257 * class105.field1575[var1] / var4 >> 8;
                            }
                            if (var10 > 0) {
                                class39 var11 = var3.method2103().method260(class162.field2549);
                                class185 var12 = class185.method1235(var11, 100, var10);
                                var12.method1239(class275.field4553[var1] - 1);
                                class71.field1024.method588(var12);
                            }
                            class166.field2608[var1] = -100;
                        }
                    }
                }
            } else {
                class195.field3109--;
                for (int var2 = var1; var2 < class195.field3109; var2++) {
                    class71.field1031[var2] = class71.field1031[var2 + 1];
                    class276.field4575[var2] = class276.field4575[var2 + 1];
                    class275.field4553[var2] = class275.field4553[var2 + 1];
                    class166.field2608[var2] = class166.field2608[var2 + 1];
                    class307.field4996[var2] = class307.field4996[var2 + 1];
                    class105.field1575[var2] = class105.field1575[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field1002++;
        if (class6.field52 && !class57.method345((byte) -82)) {
            if (class223.field3550 != 0 && class35.field441 != -1) {
                class35.method201(false, class35.field441, (byte) -98, class274.field4518, class223.field3550, 0);
            }
            class6.field52 = false;
        } else if (class223.field3550 != 0 && class35.field441 != -1 && !class57.method345((byte) -60)) {
            class282.field4683++;
            class276.field4572.method1391(0, 151);
            class276.field4572.method1425(class35.field441, (byte) -122);
            class35.field441 = -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1008++;
    }
}
