import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class250 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "S")
    public static short field3867 = 32767;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3871 = 1;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Ljf;")
    public static class216 field3874 = new class216(64);

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lfe;)Lnl;")
    public static final class29 method1698(class231 arg0) {
        class29 var1 = (class29) class243.field3918.method1064(-1, ((long) arg0.field3595 << 32) + (long) arg0.field3739);
        return var1 == null ? arg0.field3731 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;ILjava/awt/Color;B)V")
    private static final void method1699(boolean arg0, String arg1, int arg2, Color arg3, byte arg4) {
        field3872++;
        try {
            if (arg4 > -3) {
                main((String[]) null);
            }
            Graphics var5 = class304.field4831.getGraphics();
            if (class13.field182 == null) {
                class13.field182 = new Font("Helvetica", 1, 13);
                class264.field4289 = class304.field4831.getFontMetrics(class13.field182);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class112.field1626, class126.field1814);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class107.field1557 == null) {
                    class107.field1557 = class304.field4831.createImage(304, 34);
                }
                Graphics var6 = class107.field1557.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg2 * 3) + 2, 2, 300 - arg2 * 3, 30);
                var6.setFont(class13.field182);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - class264.field4289.stringWidth(arg1)) / 2, 22);
                var5.drawImage(class107.field1557, class112.field1626 / 2 - 152, class126.field1814 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class112.field1626 / 2 - 152;
                int var8 = class126.field1814 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg2 * 3 + var7 + 2, var8 + 2, 300 - arg2 * 3, 30);
                var5.setFont(class13.field182);
                var5.setColor(Color.white);
                var5.drawString(arg1, var7 + (304 - class264.field4289.stringWidth(arg1)) / 2, var8 + 22);
            }
            if (class128.field1836 != null) {
                var5.setFont(class13.field182);
                var5.setColor(Color.white);
                var5.drawString(class128.field1836, class112.field1626 / 2 - (class264.field4289.stringWidth(class128.field1836) / 2), class126.field1814 / 2 + -26);
            }
        } catch (Exception var10) {
            class304.field4831.repaint();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILsc;JZ)V")
    public static final void method1700(int arg0, int arg1, int arg2, int arg3, class248 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class58 var8 = new class58();
        var8.field856 = arg4;
        var8.field854 = arg1 * 128 + 64;
        var8.field851 = arg2 * 128 + 64;
        var8.field860 = arg3;
        var8.field859 = arg5;
        if (class184.field2892[arg0][arg1][arg2] == null) {
            class184.field2892[arg0][arg1][arg2] = new class113(arg0, arg1, arg2);
        }
        class184.field2892[arg0][arg1][arg2].field1650 = var8;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lfe;IIIIIII)V")
    public static final void method1701(class231[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class231 var9 = arg0[var8];
            if (var9 != null && var9.field3633 == arg1 && (!var9.field3585 || var9.field3620 == 0 || var9.field3703 || method1698(var9).field367 != 0 || class82.field1247 == var9 || var9.field3563 == 1338) && (!var9.field3585 || !method1714(var9))) {
                int var10 = var9.field3734 + arg6;
                int var11 = var9.field3608 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3620 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3730 + var10;
                    int var17 = var9.field3686 + var11;
                    if (var9.field3620 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class142.field2079 == var9) {
                    class237.field3811 = true;
                    class206.field3230 = var10;
                    class90.field1361 = var11;
                }
                if (!var9.field3585 || var12 < var14 && var13 < var15) {
                    if (var9.field3620 == 0) {
                        if (!var9.field3585 && method1714(var9) && class93.field1399 != var9) {
                            continue;
                        }
                        if (var9.field3717 && class50.field633 >= var12 && class71.field1042 >= var13 && class50.field633 < var14 && class71.field1042 < var15) {
                            for (class122 var18 = (class122) class84.field1294.method1548(0); var18 != null; var18 = (class122) class84.field1294.method1549(-106)) {
                                if (var18.field1747) {
                                    var18.method1764(64);
                                    var18.field1752.field3598 = false;
                                }
                            }
                            if (class171.field2688 == 0) {
                                class142.field2079 = null;
                                class82.field1247 = null;
                            }
                            class92.field1371 = 0;
                            class220.field3457 = false;
                        }
                    }
                    if (var9.field3585) {
                        boolean var19;
                        if (class50.field633 >= var12 && class71.field1042 >= var13 && class50.field633 < var14 && class71.field1042 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class284.field4606 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class235.field3796 == 1 && class171.field2686 >= var12 && class223.field3493 >= var13 && class171.field2686 < var14 && class223.field3493 < var15) {
                            var21 = true;
                        }
                        if (var9.field3747 != null) {
                            for (int var22 = 0; var22 < var9.field3747.length; var22++) {
                                if (class309.field4977[var9.field3747[var22]]) {
                                    if (var9.field3724 == null || class311.field4996 >= var9.field3724[var22]) {
                                        byte var23 = var9.field3653[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class309.field4977[86] && !class309.field4977[82] && !class309.field4977[81]) && ((var23 & 0x2) == 0 || class309.field4977[86]) && ((var23 & 0x1) == 0 || class309.field4977[82]) && ((var23 & 0x4) == 0 || class309.field4977[81])) {
                                            class171.method1225(20214, "", var9.field3595, -1, var22 + 1);
                                            int var24 = var9.field3682[var22];
                                            if (var9.field3724 == null) {
                                                var9.field3724 = new int[var9.field3747.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3724[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3724[var22] = class311.field4996 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3724 != null) {
                                    var9.field3724[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class97.method664(class171.field2686 - var10, -58, class223.field3493 - var11, var9);
                        }
                        if (class142.field2079 != null && class142.field2079 != var9 && var19 && method1698(var9).method155(true)) {
                            class80.field1227 = var9;
                        }
                        if (class82.field1247 == var9) {
                            class45.field547 = true;
                            class258.field4199 = var10;
                            class134.field1939 = var11;
                        }
                        if (var9.field3703 || var9.field3563 != 0) {
                            if (var19 && class256.field4185 != 0 && var9.field3628 != null) {
                                class122 var25 = new class122();
                                var25.field1747 = true;
                                var25.field1752 = var9;
                                var25.field1750 = class256.field4185;
                                var25.field1755 = var9.field3628;
                                class84.field1294.method1540(var25, (byte) -98);
                            }
                            if (class142.field2079 != null || class169.field2608 != null || class311.field4995 || var9.field3563 != 1400 && class92.field1371 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3563 != 0) {
                                if (var9.field3563 == 1337) {
                                    class41.field500 = var9;
                                    continue;
                                }
                                if (var9.field3563 == 1338) {
                                    if (var21) {
                                        class251.field4104 = class171.field2686 - var10;
                                        class171.field2681 = class223.field3493 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3563 == 1400) {
                                    class281.field4569 = var9;
                                    if (var19) {
                                        class220.field3457 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class171.field2686 - var10 - var9.field3730 / 2) * 2.0D / (double) class207.field3245);
                                        int var27 = (int) ((double) (class223.field3493 - var11 - var9.field3686 / 2) * 2.0D / (double) class207.field3245);
                                        int var28 = class311.field4993 + var26;
                                        int var29 = class229.field3544 + var27;
                                        int var30 = class207.field3241 + var28;
                                        int var31 = class207.field3247 + class207.field3237 - var29 - 1;
                                        class49 var32 = class152.method1047(14);
                                        int[] var33 = new int[3];
                                        var32.method296(var31, (byte) -102, var33, var30);
                                        if (var33 != null) {
                                            if (class309.field4977[82] && class72.field1072 > 0) {
                                                class62.method397(var33[1], var33[2], var33[0], false);
                                                class121.method788(1427);
                                                continue;
                                            }
                                            class193.field3069++;
                                            class150.field2218.method445(165, 7);
                                            class150.field2218.method1164(var33[0] << 28 | var33[1] << 14 | var33[2], 8825);
                                        }
                                        class92.field1371 = 1;
                                        class233.field3765 = false;
                                        class71.field1052 = class50.field633;
                                        class68.field1014 = class71.field1042;
                                        continue;
                                    }
                                    if (var20 && class92.field1371 > 0) {
                                        if (class92.field1371 == 1 && (class71.field1052 != class50.field633 || class71.field1042 != class68.field1014)) {
                                            class266.field4333 = class311.field4993;
                                            class61.field884 = class229.field3544;
                                            class92.field1371 = 2;
                                        }
                                        if (class92.field1371 == 2) {
                                            class233.field3765 = true;
                                            class38.method219((byte) -110, (int) ((double) (class71.field1052 - class50.field633) * 2.0D / (double) class207.field3244) + class266.field4333);
                                            class18.method102((int) ((double) (class68.field1014 - class71.field1042) * 2.0D / (double) class207.field3244) + class61.field884, 77);
                                        }
                                        continue;
                                    }
                                    if (class92.field1371 > 0 && !class233.field3765) {
                                        if ((class10.field153 == 1 || class10.method62(class173.field2721 - 1, true)) && class173.field2721 > 2) {
                                            class300.method2017(124);
                                        } else if (class173.field2721 > 0) {
                                            class171.method1223(-3);
                                        }
                                    }
                                    class92.field1371 = 0;
                                    continue;
                                }
                                if (var9.field3563 == 1401) {
                                    if (var20) {
                                        class293.method1985(var9.field3730, var9.field3686, false, class71.field1042 - var11, class50.field633 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field3563 == 1402) {
                                    class247.method1761(var9, (byte) -109);
                                    continue;
                                }
                            }
                            if (!var9.field3565 && var21) {
                                var9.field3565 = true;
                                if (var9.field3630 != null) {
                                    class122 var34 = new class122();
                                    var34.field1747 = true;
                                    var34.field1752 = var9;
                                    var34.field1753 = class171.field2686 - var10;
                                    var34.field1750 = class223.field3493 - var11;
                                    var34.field1755 = var9.field3630;
                                    class84.field1294.method1540(var34, (byte) -49);
                                }
                            }
                            if (var9.field3565 && var20 && var9.field3621 != null) {
                                class122 var35 = new class122();
                                var35.field1747 = true;
                                var35.field1752 = var9;
                                var35.field1753 = class50.field633 - var10;
                                var35.field1750 = class71.field1042 - var11;
                                var35.field1755 = var9.field3621;
                                class84.field1294.method1540(var35, (byte) -77);
                            }
                            if (var9.field3565 && !var20) {
                                var9.field3565 = false;
                                if (var9.field3629 != null) {
                                    class122 var36 = new class122();
                                    var36.field1747 = true;
                                    var36.field1752 = var9;
                                    var36.field1753 = class50.field633 - var10;
                                    var36.field1750 = class71.field1042 - var11;
                                    var36.field1755 = var9.field3629;
                                    class72.field1066.method1540(var36, (byte) -82);
                                }
                            }
                            if (var20 && var9.field3680 != null) {
                                class122 var37 = new class122();
                                var37.field1747 = true;
                                var37.field1752 = var9;
                                var37.field1753 = class50.field633 - var10;
                                var37.field1750 = class71.field1042 - var11;
                                var37.field1755 = var9.field3680;
                                class84.field1294.method1540(var37, (byte) -123);
                            }
                            if (!var9.field3598 && var19) {
                                var9.field3598 = true;
                                if (var9.field3639 != null) {
                                    class122 var38 = new class122();
                                    var38.field1747 = true;
                                    var38.field1752 = var9;
                                    var38.field1753 = class50.field633 - var10;
                                    var38.field1750 = class71.field1042 - var11;
                                    var38.field1755 = var9.field3639;
                                    class84.field1294.method1540(var38, (byte) -87);
                                }
                            }
                            if (var9.field3598 && var19 && var9.field3612 != null) {
                                class122 var39 = new class122();
                                var39.field1747 = true;
                                var39.field1752 = var9;
                                var39.field1753 = class50.field633 - var10;
                                var39.field1750 = class71.field1042 - var11;
                                var39.field1755 = var9.field3612;
                                class84.field1294.method1540(var39, (byte) -52);
                            }
                            if (var9.field3598 && !var19) {
                                var9.field3598 = false;
                                if (var9.field3660 != null) {
                                    class122 var40 = new class122();
                                    var40.field1747 = true;
                                    var40.field1752 = var9;
                                    var40.field1753 = class50.field633 - var10;
                                    var40.field1750 = class71.field1042 - var11;
                                    var40.field1755 = var9.field3660;
                                    class72.field1066.method1540(var40, (byte) -60);
                                }
                            }
                            if (var9.field3704 != null) {
                                class122 var41 = new class122();
                                var41.field1752 = var9;
                                var41.field1755 = var9.field3704;
                                class275.field4463.method1540(var41, (byte) -72);
                            }
                            if (var9.field3733 != null && class117.field1695 > var9.field3729) {
                                if (var9.field3640 == null || class117.field1695 - var9.field3729 > 32) {
                                    class122 var46 = new class122();
                                    var46.field1752 = var9;
                                    var46.field1755 = var9.field3733;
                                    class84.field1294.method1540(var46, (byte) -121);
                                } else {
                                    label597: for (int var42 = var9.field3729; var42 < class117.field1695; var42++) {
                                        int var43 = class215.field3367[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3640.length; var44++) {
                                            if (var9.field3640[var44] == var43) {
                                                class122 var45 = new class122();
                                                var45.field1752 = var9;
                                                var45.field1755 = var9.field3733;
                                                class84.field1294.method1540(var45, (byte) -50);
                                                break label597;
                                            }
                                        }
                                    }
                                }
                                var9.field3729 = class117.field1695;
                            }
                            if (var9.field3614 != null && class256.field4164 > var9.field3688) {
                                if (var9.field3618 == null || class256.field4164 - var9.field3688 > 32) {
                                    class122 var51 = new class122();
                                    var51.field1752 = var9;
                                    var51.field1755 = var9.field3614;
                                    class84.field1294.method1540(var51, (byte) -114);
                                } else {
                                    label573: for (int var47 = var9.field3688; var47 < class256.field4164; var47++) {
                                        int var48 = class147.field2188[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3618.length; var49++) {
                                            if (var9.field3618[var49] == var48) {
                                                class122 var50 = new class122();
                                                var50.field1752 = var9;
                                                var50.field1755 = var9.field3614;
                                                class84.field1294.method1540(var50, (byte) -69);
                                                break label573;
                                            }
                                        }
                                    }
                                }
                                var9.field3688 = class256.field4164;
                            }
                            if (var9.field3575 != null && class158.field2369 > var9.field3587) {
                                if (var9.field3601 == null || class158.field2369 - var9.field3587 > 32) {
                                    class122 var56 = new class122();
                                    var56.field1752 = var9;
                                    var56.field1755 = var9.field3575;
                                    class84.field1294.method1540(var56, (byte) -65);
                                } else {
                                    label549: for (int var52 = var9.field3587; var52 < class158.field2369; var52++) {
                                        int var53 = class200.field3158[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3601.length; var54++) {
                                            if (var9.field3601[var54] == var53) {
                                                class122 var55 = new class122();
                                                var55.field1752 = var9;
                                                var55.field1755 = var9.field3575;
                                                class84.field1294.method1540(var55, (byte) -51);
                                                break label549;
                                            }
                                        }
                                    }
                                }
                                var9.field3587 = class158.field2369;
                            }
                            if (var9.field3599 != null && class47.field597 > var9.field3610) {
                                if (var9.field3705 == null || class47.field597 - var9.field3610 > 32) {
                                    class122 var61 = new class122();
                                    var61.field1752 = var9;
                                    var61.field1755 = var9.field3599;
                                    class84.field1294.method1540(var61, (byte) -79);
                                } else {
                                    label525: for (int var57 = var9.field3610; var57 < class47.field597; var57++) {
                                        int var58 = class89.field1340[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3705.length; var59++) {
                                            if (var9.field3705[var59] == var58) {
                                                class122 var60 = new class122();
                                                var60.field1752 = var9;
                                                var60.field1755 = var9.field3599;
                                                class84.field1294.method1540(var60, (byte) -63);
                                                break label525;
                                            }
                                        }
                                    }
                                }
                                var9.field3610 = class47.field597;
                            }
                            if (var9.field3677 != null && class181.field2836 > var9.field3706) {
                                if (var9.field3719 == null || class181.field2836 - var9.field3706 > 32) {
                                    class122 var66 = new class122();
                                    var66.field1752 = var9;
                                    var66.field1755 = var9.field3677;
                                    class84.field1294.method1540(var66, (byte) -56);
                                } else {
                                    label501: for (int var62 = var9.field3706; var62 < class181.field2836; var62++) {
                                        int var63 = class257.field4189[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3719.length; var64++) {
                                            if (var9.field3719[var64] == var63) {
                                                class122 var65 = new class122();
                                                var65.field1752 = var9;
                                                var65.field1755 = var9.field3677;
                                                class84.field1294.method1540(var65, (byte) -113);
                                                break label501;
                                            }
                                        }
                                    }
                                }
                                var9.field3706 = class181.field2836;
                            }
                            if (class313.field5022 > var9.field3649 && var9.field3611 != null) {
                                class122 var67 = new class122();
                                var67.field1752 = var9;
                                var67.field1755 = var9.field3611;
                                class84.field1294.method1540(var67, (byte) -55);
                            }
                            if (class250.field4088 > var9.field3649 && var9.field3668 != null) {
                                class122 var68 = new class122();
                                var68.field1752 = var9;
                                var68.field1755 = var9.field3668;
                                class84.field1294.method1540(var68, (byte) -49);
                            }
                            if (class35.field420 > var9.field3649 && var9.field3632 != null) {
                                class122 var69 = new class122();
                                var69.field1752 = var9;
                                var69.field1755 = var9.field3632;
                                class84.field1294.method1540(var69, (byte) -112);
                            }
                            if (class198.field3139 > var9.field3649 && var9.field3606 != null) {
                                class122 var70 = new class122();
                                var70.field1752 = var9;
                                var70.field1755 = var9.field3606;
                                class84.field1294.method1540(var70, (byte) -98);
                            }
                            if (class165.field2550 > var9.field3649 && var9.field3726 != null) {
                                class122 var71 = new class122();
                                var71.field1752 = var9;
                                var71.field1755 = var9.field3726;
                                class84.field1294.method1540(var71, (byte) -85);
                            }
                            var9.field3649 = field3871;
                            if (var9.field3619 != null) {
                                for (int var72 = 0; var72 < class67.field996; var72++) {
                                    class122 var73 = new class122();
                                    var73.field1752 = var9;
                                    var73.field1744 = class297.field4736[var72];
                                    var73.field1749 = class7.field99[var72];
                                    var73.field1755 = var9.field3619;
                                    class84.field1294.method1540(var73, (byte) -74);
                                }
                            }
                            if (class303.field4823 && var9.field3569 != null) {
                                class122 var74 = new class122();
                                var74.field1752 = var9;
                                var74.field1755 = var9.field3569;
                                class84.field1294.method1540(var74, (byte) -107);
                            }
                        }
                    }
                    if (!var9.field3585 && class142.field2079 == null && class169.field2608 == null && !class311.field4995) {
                        if ((var9.field3641 >= 0 || var9.field3623 != 0) && class50.field633 >= var12 && class71.field1042 >= var13 && class50.field633 < var14 && class71.field1042 < var15) {
                            if (var9.field3641 >= 0) {
                                class93.field1399 = arg0[var9.field3641];
                            } else {
                                class93.field1399 = var9;
                            }
                        }
                        if (var9.field3620 == 8 && class50.field633 >= var12 && class71.field1042 >= var13 && class50.field633 < var14 && class71.field1042 < var15) {
                            class236.field3804 = var9;
                        }
                        if (var9.field3648 > var9.field3686) {
                            class216.method1521(var9.field3730 + var10, var11, var9.field3686, var9.field3648, class71.field1042, class50.field633, (byte) 36, var9);
                        }
                    }
                    if (var9.field3620 == 0) {
                        method1701(arg0, var9.field3595, var12, var13, var14, var15, var10 - var9.field3616, var11 - var9.field3661);
                        if (var9.field3578 != null) {
                            method1701(var9.field3578, var9.field3595, var12, var13, var14, var15, var10 - var9.field3616, var11 - var9.field3661);
                        }
                        class104 var75 = (class104) class115.field1674.method1064(-1, (long) var9.field3595);
                        if (var75 != null) {
                            class111.method743(var10, var14, var13, var15, 9481, var12, var11, var75.field1511);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method1702(boolean arg0) {
        field3864++;
        if (class40.field480 == 1000) {
            return;
        }
        class311.field4996++;
        if ((class311.field4996 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class93.field1396 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class126.field1809.setSeed((long) class93.field1396);
        }
        this.method1708((byte) -60);
        if (class159.field2394 != null) {
            class159.field2394.method555((byte) 125);
        }
        class93.method635((byte) 114);
        class31.method163(-11565);
        class105.method703(-124);
        class114.method759((byte) -83);
        if (arg0) {
            field3874 = null;
        }
        if (class80.field1224 != null) {
            int var3 = class80.field1224.method15(100);
            class256.field4185 = var3;
        }
        if (class40.field480 == 0) {
            this.method1713(0);
            class114.method753(!arg0);
        } else if (class40.field480 == 5) {
            this.method1713(0);
            class114.method753(true);
        } else if (class40.field480 == 25 || class40.field480 == 28) {
            class57.method372(true);
        }
        if (class40.field480 == 10) {
            this.method1703(-15312121);
            class60.method385((byte) -118);
            class33.method172(29909);
            class57.method371(0);
        } else if (class40.field480 == 30) {
            class3.method22(119);
        } else if (class40.field480 == 40) {
            class57.method371(0);
            if (class195.field3080 != -3) {
                if (class195.field3080 == 15) {
                    class201.method1396(-61);
                    return;
                }
                if (class195.field3080 != 2) {
                    class222.method1573((byte) -81);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method1703(int arg0) {
        field3878++;
        for (class67.field996 = 0; class193.method1356(1) && class67.field996 < 128; class67.field996++) {
            class297.field4736[class67.field996] = class140.field2006;
            class7.field99[class67.field996] = class296.field4729;
        }
        if (arg0 != -15312121) {
            return;
        }
        class135.field1949++;
        if (class238.field3824 != -1) {
            class111.method743(0, class112.field1626, 0, class126.field1814, 9481, 0, 0, class238.field3824);
        }
        field3871++;
        if (class257.field4188 == 0) {
            class96.method656(-118);
        } else if (class45.field536 == 0 && class299.field4764 == 0) {
            if (class158.field2370 == 2) {
                class176.method1253(-123);
            } else {
                class186.method1313(1);
            }
            if ((class99.field1474 >> 7) < 14 || (class99.field1474 >> 7) >= 90 || (class255.field4159 >> 7) < 14 || (class255.field4159 >> 7) >= 90) {
                class122.method792(-117);
            }
        }
        while (true) {
            class122 var2;
            class231 var3;
            class231 var4;
            do {
                var2 = (class122) class275.field4463.method1547(arg0 ^ 0xFF165B7E);
                if (var2 == null) {
                    while (true) {
                        class122 var5;
                        class231 var6;
                        class231 var7;
                        do {
                            var5 = (class122) class72.field1066.method1547(121);
                            if (var5 == null) {
                                while (true) {
                                    class122 var8;
                                    class231 var9;
                                    class231 var10;
                                    do {
                                        var8 = (class122) class84.field1294.method1547(119);
                                        if (var8 == null) {
                                            if (class142.field2079 != null) {
                                                class278.method1925((byte) -65);
                                            }
                                            if (class123.field1762 != null && class123.field1762.field2399 == 1) {
                                                if (class123.field1762.field2401 != null) {
                                                    class297.method2002(9558, class258.field4201, class275.field4466);
                                                }
                                                class258.field4201 = null;
                                                class123.field1762 = null;
                                                class275.field4466 = false;
                                            }
                                            if (class311.field4996 % 1500 == 0) {
                                                class49.method299(false);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field1752;
                                        if (var9.field3739 < 0) {
                                            break;
                                        }
                                        var10 = class201.method1398(var9.field3633, 0);
                                    } while (var10 == null || var10.field3578 == null || var10.field3578.length <= var9.field3739 || var10.field3578[var9.field3739] != var9);
                                    class122.method795(var8, -96);
                                }
                            }
                            var6 = var5.field1752;
                            if (var6.field3739 < 0) {
                                break;
                            }
                            var7 = class201.method1398(var6.field3633, 0);
                        } while (var7 == null || var7.field3578 == null || var6.field3739 >= var7.field3578.length || var7.field3578[var6.field3739] != var6);
                        class122.method795(var5, -97);
                    }
                }
                var3 = var2.field1752;
                if (var3.field3739 < 0) {
                    break;
                }
                var4 = class201.method1398(var3.field3633, 0);
            } while (var4 == null || var4.field3578 == null || var4.field3578.length <= var3.field3739 || var4.field3578[var3.field3739] != var3);
            class122.method795(var2, -101);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method1704(int arg0) {
        method1711((byte) -85);
        class65.method430();
        class129.method829((byte) -52);
        field3873++;
        class277.method1915(0);
        class207.method1440();
        class49.method306(-21776);
        class118.method776(101);
        class250.method1784(124);
        class225.method1591(256);
        class264.method1850((byte) 83);
        class3.method24((byte) -101);
        class306.method2047(-124);
        class170.method1206(-1);
        class83.method568(-61);
        class35.method184((byte) 93);
        int var2 = 91 / ((arg0 + 41) / 55);
        class205.method1408((byte) 31);
        class82.method556(-26421);
        class46.method257((byte) 123);
        class73.method492(0);
        class278.method1926(3);
        class216.method1513(127);
        class86.method582(13488);
        class67.method446(false);
        class99.method677((byte) -119);
        class231.method1633((byte) 123);
        class1.method13(0);
        class220.method1542((byte) -8);
        class215.method1504((byte) 58);
        class22.method119(117);
        class41.method239(-117);
        class272.method1891((byte) 62);
        class307.method2055((byte) -115);
        class218.method1530(768);
        class13.method76((byte) 110);
        class243.method1720(false);
        class113.method750(-7638);
        class183.method1296((byte) -118);
        class134.method848((byte) -28);
        class104.method697((byte) 124);
        class29.method156(-29535);
        class287.method1963(-29200);
        class247.method1760((byte) 23);
        class168.method1151((byte) 61);
        class198.method1383(5);
        class78.method533(false);
        class24.method131((byte) 101);
        class282.method1939((byte) 106);
        class130.method835(false);
        class199.method1385(-1);
        class261.method1841(109);
        class7.method40((byte) 94);
        class120.method783(28);
        class90.method607(-1);
        class303.method2037((byte) -56);
        class112.method749(-1);
        class107.method718(-2);
        class16.method95(4);
        class223.method1580(true);
        class111.method740((byte) 114);
        class298.method2009((byte) -88);
        class276.method1909((byte) 71);
        class236.method1657(false);
        class191.method1342((byte) 18);
        class115.method764(-10774);
        class100.method681((byte) -60);
        class141.method905();
        class177.method1261(-30785);
        class162.method1108((byte) 113);
        class51.method327();
        class56.method363(22752);
        class81.method551(false);
        class187.method1317((byte) -51);
        class124.method803((byte) -33);
        class291.method1977(3);
        class283.method1943(13);
        class189.method1321(-121);
        class213.method1482();
        class180.method1279(-512);
        class37.method209();
        class197.method1373((byte) 98);
        class176.method1258(-88);
        class254.method1800(-124);
        class138.method874((byte) 82);
        class244.method1740();
        class309.method2087(-3257);
        class152.method1050(-1);
        class50.method309(64);
        class80.method546((byte) -39);
        class293.method1984(-91);
        class284.method1950(-83);
        class151.method1030();
        class255.method1807((byte) -113);
        class61.method389(15);
        class226.method1599(-4);
        class59.method376((byte) -86);
        class106.method706(false);
        class108.method724(-4);
        class125.method809(-16652);
        class230.method1616(24470);
        class260.method1834(0);
        class14.method86(106);
        class117.method771(-25);
        class245.method1747(612008480);
        class163.method1130(-18669);
        class214.method1497(-1);
        class270.method1883(false);
        class147.method999(64);
        class157.method1089();
        class169.method1153(false);
        class89.method599(22717);
        class71.method473((byte) -46);
        class171.method1222(91);
        class249.method1769((byte) -67);
        class192.method1348((byte) 109);
        class143.method934();
        class8.method44(121);
        class232.method1638(-128);
        class240.method1690((byte) -98);
        class299.method2010((byte) -119);
        class175.method1250((byte) -106);
        class72.method479((byte) 70);
        class10.method57(249);
        class40.method233(-56);
        class267.method1862();
        class221.method1551();
        class301.method2026(123);
        class206.method1421(3077);
        class164.method1131(-106);
        class313.method2102((byte) 121);
        class210.method1458((byte) 107);
        class311.method2094(-16);
        class271.method1885((byte) -125);
        class285.method1951(38);
        class196.method1368(120);
        class69.method456(-4832);
        class233.method1642((byte) 116);
        class122.method796(14);
        class248.method1766(-10918);
        class76.method522((byte) 14);
        class158.method1090(0);
        class27.method137(-1);
        class58.method375(-123);
        class123.method797(122);
        class273.method1897(111);
        class54.method357();
        class275.method1903(-126);
        class193.method1357((byte) 57);
        class297.method1999((byte) 116);
        class259.method1831();
        class5.method29((byte) -63);
        class295.method1990(28);
        class60.method387((byte) -83);
        class77.method530(-32074);
        class290.method1971(-1);
        class181.method1281(-1291486552);
        class182.method1295(-28740);
        class251.method1790(28754);
        class302.method2030(-8681);
        class156.method1083();
        class15.method93(-4);
        class93.method636(7630);
        class140.method881(-1);
        class142.method923((byte) 118);
        class179.method1274(-99);
        class75.method520(105);
        class105.method704(-32768);
        class265.method1852(true);
        class52.method354((byte) -12);
        class127.method818((byte) 35);
        class286.method1955((byte) -123);
        class178.method1262(-78);
        class246.method1752();
        class94.method642(-120);
        class274.method1902(-128);
        class190.method1323(3);
        class11.method66((byte) -6);
        class238.method1668(120);
        class20.method114(7);
        class62.method392((byte) -69);
        class155.method1076();
        class305.method2043((byte) -118);
        class64.method415(0);
        class200.method1390((byte) 16);
        class23.method127((byte) -101);
        class74.method516(25660);
        class167.method1143((byte) 101);
        class219.method1537();
        class224.method1587();
        class135.method861(189);
        class4.method27((byte) -64);
        class304.method2038(15);
        class31.method162(127);
        class269.method1872();
        class203.method1402();
        class235.method1651(-37);
        class195.method1362((byte) 40);
        class84.method574((byte) 73);
        class79.method540(0);
        class38.method216((byte) 32);
        class186.method1310((byte) 124);
        class262.method1842((byte) -53);
        class63.method402(0);
        class268.method1867((byte) -125);
        class258.method1830(67);
        class47.method269((byte) -99);
        class139.method877(65);
        class43.method244(-1);
        class294.method1987(10405);
        class146.method994(474);
        class184.method1305(true);
        class128.method824((byte) -95);
        class17.method100(true);
        class95.method650((byte) 41);
        class234.method1644((byte) 127);
        class126.method816((byte) 30);
        class150.method1016((byte) 34);
        class288.method1966((byte) 96);
        class281.method1935(-128);
        class228.method1603((byte) 109);
        class44.method248(2048);
        class144.method943(false);
        class253.method1799(-8768);
        class92.method627(true);
        class229.method1613((byte) 27);
        class201.method1395((byte) 32);
        class42.method241(1);
        class222.method1577(-24881);
        class19.method109((byte) 89);
        class6.method34((byte) 125);
        class174.method1243((byte) 97);
        class28.method140((byte) 26);
        class159.method1098((byte) -127);
        class137.method869(true);
        class310.method2091(0);
        class312.method2097((byte) 54);
        class266.method1857((byte) -122);
        class166.method1137(-108);
        class257.method1821((byte) 84);
        class110.method735(2012526092);
        class55.method359(114);
        class21.method117((byte) 46);
        class32.method166((byte) 60);
        class39.method222(100);
        class241.method1716((byte) -51);
        class33.method169(-102);
        class212.method1466((byte) -85);
        class211.method1459(1);
        class97.method663((byte) 122);
        class209.method1450((byte) 74);
        class36.method197((byte) -90);
        class68.method454(0);
        class217.method1523(-114);
        class252.method1795(true);
        class161.method1103((byte) -115);
        class114.method757(true);
        class119.method782((byte) 67);
        class96.method660((byte) 124);
        class66.method433((byte) 25);
        class18.method104((byte) -80);
        if (class250.field4092) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1705(int arg0) {
        field3869++;
        if (class40.field480 == 1000) {
            return;
        }
        long var2 = class128.method823((byte) -123) / 1000000L - class150.field2213;
        class150.field2213 = class128.method823((byte) -124) / 1000000L;
        boolean var4 = class205.method1407((byte) 118);
        if (var4 && class229.field3542 && class1.field27 != null) {
            class1.field27.method1535((byte) 23);
        }
        if (arg0 != -151) {
            method1711((byte) 103);
        }
        if ((class40.field480 == 30 || class40.field480 == 10) && (class161.field2416 || class4.field67 != 0L && class4.field67 < class98.method665(true))) {
            class190.method1325(class49.method298((byte) 124), class312.field5005, 0, class299.field4762, class161.field2416);
        }
        if (class123.field1771 == null) {
            Container var5;
            if (class123.field1771 != null) {
                var5 = class123.field1771;
            } else if (class73.field1086 == null) {
                var5 = class95.field1425.field3832;
            } else {
                var5 = class73.field1086;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class73.field1086 == var5) {
                Insets var8 = class73.field1086.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class14.field210 != var6 || class278.field4556 != var7) {
                if (class239.field3830.startsWith("mac")) {
                    class278.field4556 = var7;
                    class14.field210 = var6;
                } else {
                    class303.method2034(-3);
                }
                class4.field67 = class98.method665(true) + 500L;
            }
        }
        boolean var9 = false;
        if (class192.field3052) {
            var9 = true;
            class192.field3052 = false;
        }
        if (var9) {
            class40.method235((byte) 24);
        }
        if (class40.field480 == 0) {
            method1699(var9, class200.field3153, class166.field2567, (Color) null, (byte) -33);
        } else if (class40.field480 == 5) {
            class228.method1611(false, (byte) -76, class306.field4885);
        } else if (class40.field480 == 10) {
            class260.method1833(0);
        } else if (class40.field480 == 25 || class40.field480 == 28) {
            if (class96.field1454 == 1) {
                if (class55.field806 > class63.field916) {
                    class63.field916 = class55.field806;
                }
                int var11 = (class63.field916 - class55.field806) * 50 / class63.field916;
                class49.method304(class33.field397 + "<br>(" + var11 + "%)", false, 4);
            } else if (class96.field1454 == 2) {
                if (class272.field4430 > class178.field2787) {
                    class178.field2787 = class272.field4430;
                }
                int var10 = ((class178.field2787 - class272.field4430) * 50 / class178.field2787) + 50;
                class49.method304(class33.field397 + "<br>(" + var10 + "%)", false, 4);
            } else {
                class49.method304(class33.field397, false, 4);
            }
        } else if (class40.field480 == 30) {
            class193.method1359(73, var2);
        } else if (class40.field480 == 40) {
            class49.method304(class310.field4982 + "<br>" + class56.field821, false, arg0 + 155);
        }
        if ((class40.field480 == 30 || class40.field480 == 10) && class164.field2544 == 0 && !var9) {
            try {
                Graphics var14 = class304.field4831.getGraphics();
                for (int var15 = 0; var15 < class254.field4142; var15++) {
                    if (class195.field3092[var15]) {
                        class187.field2935.method68(class52.field735[var15], class16.field227[var15], true, var14, class113.field1652[var15], class28.field342[var15]);
                        class195.field3092[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class304.field4831.repaint();
            }
        } else if (class40.field480 != 0) {
            try {
                Graphics var12 = class304.field4831.getGraphics();
                class187.field2935.method64((byte) -99, var12, 0, 0);
                for (int var13 = 0; var13 < class254.field4142; var13++) {
                    class195.field3092[var13] = false;
                }
            } catch (Exception var17) {
                class304.field4831.repaint();
            }
        }
        if (class59.field873) {
            class167.method1142((byte) 107);
        }
        if (class138.field1983 && class40.field480 == 10 && class238.field3824 != -1) {
            class138.field1983 = false;
            class170.method1216(class95.field1425, 88);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method1706(int arg0, byte arg1) {
        if (arg1 != 30) {
            this.method1704(96);
        }
        class93.field1397.field433++;
        class75.field1133 = null;
        class245.field4003 = 0;
        class233.field3766 = null;
        field3875++;
        class93.field1397.field432 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class197.method1375("argument count", 200);
            }
            class200.field3163 = Integer.parseInt(arg0[0]);
            class73.field1104 = 2;
            if (arg0[1].equals("live")) {
                class206.field3232 = 0;
            } else if (arg0[1].equals("rc")) {
                class206.field3232 = 1;
            } else if (arg0[1].equals("wip")) {
                class206.field3232 = 2;
            } else {
                class197.method1375("modewhat", 200);
            }
            class197.field3121 = false;
            class46.field571 = class287.method1964(86, arg0[2]);
            if (class46.field571 == -1) {
                if (arg0[2].equals("english")) {
                    class46.field571 = 0;
                } else if (arg0[2].equals("german")) {
                    class46.field571 = 1;
                } else {
                    class197.method1375("language", 200);
                }
            }
            class58.method374((byte) -73, class46.field571);
            class265.field4294 = false;
            class293.field4697 = false;
            if (arg0[3].equals("game0")) {
                class257.field4188 = 0;
            } else if (arg0[3].equals("game1")) {
                class257.field4188 = 1;
            } else {
                class197.method1375("game", 200);
            }
            class158.field2371 = 0;
            class140.field2003 = "";
            class166.field2561 = 0;
            class24.field298 = false;
            client var1 = new client();
            class197.field3117 = var1;
            var1.method1781(class257.field4188 == 1 ? "mechscape" : "runescape", 1024, (byte) -47, false, 29, class206.field3232 + 32, 768, 548);
            class73.field1086.setLocation(40, 40);
        } catch (Exception var3) {
            class285.method1952(var3, (byte) -118, (String) null);
        }
        field3877++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method1707(byte[] arg0, int arg1) {
        field3866++;
        class170 var3 = new class170(arg0);
        while (true) {
            int var4 = var3.method1218(-24);
            if (var4 == 0) {
                int var5 = 81 % ((arg1 + 4) / 47);
                return;
            }
            if (var4 == 1) {
                var3.method1186((byte) -76);
                var3.method1186((byte) -106);
                var3.method1186((byte) -73);
                var3.method1186((byte) -128);
                var3.method1186((byte) -113);
                var3.method1186((byte) -54);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1708(byte arg0) {
        field3870++;
        if (arg0 > -37) {
            field3874 = null;
        }
        boolean var2 = class93.field1397.method185((byte) 127);
        if (!var2) {
            this.method1710((byte) 114);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lfe;)Lfe;")
    public static final class231 method1709(class231 arg0) {
        int var1 = method1698(arg0).method158(-239187182);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class201.method1398(arg0.field3633, 0);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1710(byte arg0) {
        field3880++;
        if (arg0 <= 83) {
            return;
        }
        if (class93.field1397.field433 > class290.field4673) {
            class205.field3217 = (class93.field1397.field433 * 50 - 50) * 5;
            if (class277.field4546 == class231.field3697) {
                class231.field3697 = class47.field598;
            } else {
                class231.field3697 = class277.field4546;
            }
            if (class205.field3217 > 3000) {
                class205.field3217 = 3000;
            }
            if (class93.field1397.field433 >= 2 && class93.field1397.field432 == 6) {
                this.method1780((byte) -100, "js5connect_outofdate");
                class40.field480 = 1000;
                return;
            }
            if (class93.field1397.field433 >= 4 && class93.field1397.field432 == -1) {
                this.method1780((byte) -35, "js5crc");
                class40.field480 = 1000;
                return;
            }
            if (class93.field1397.field433 >= 4 && (class40.field480 == 0 || class40.field480 == 5)) {
                if (class93.field1397.field432 == 7 || class93.field1397.field432 == 9) {
                    this.method1780((byte) -99, "js5connect_full");
                } else if (class93.field1397.field432 > 0) {
                    this.method1780((byte) -58, "js5connect");
                } else {
                    this.method1780((byte) -115, "js5io");
                }
                class40.field480 = 1000;
                return;
            }
        }
        class290.field4673 = class93.field1397.field433;
        if (class205.field3217 > 0) {
            class205.field3217--;
            return;
        }
        try {
            if (class245.field4003 == 0) {
                class75.field1133 = class95.field1425.method1685(126, class231.field3697, class142.field2109);
                class245.field4003++;
            }
            if (class245.field4003 == 1) {
                if (class75.field1133.field2399 == 2) {
                    this.method1706(1000, (byte) 30);
                    return;
                }
                if (class75.field1133.field2399 == 1) {
                    class245.field4003++;
                }
            }
            if (class245.field4003 == 2) {
                class233.field3766 = new class83((Socket) class75.field1133.field2401, class95.field1425);
                class170 var2 = new class170(5);
                var2.method1183(15, 984049208);
                var2.method1210(548, (byte) -16);
                class233.field3766.method562(5, var2.field2650, 0, 105);
                class245.field4003++;
                class152.field2273 = class98.method665(true);
            }
            if (class245.field4003 == 3) {
                if (class40.field480 == 0 || class40.field480 == 5 || class233.field3766.method558(-23644) > 0) {
                    int var3 = class233.field3766.method571(true);
                    if (var3 != 0) {
                        this.method1706(var3, (byte) 30);
                        return;
                    }
                    class245.field4003++;
                } else if (class98.method665(true) - class152.field2273 > 30000L) {
                    this.method1706(1001, (byte) 30);
                    return;
                }
            }
            if (class245.field4003 == 4) {
                boolean var4 = class40.field480 == 5 || class40.field480 == 10 || class40.field480 == 28;
                class93.field1397.method188(class233.field3766, !var4, (byte) 107);
                class245.field4003 = 0;
                class75.field1133 = null;
                class233.field3766 = null;
            }
        } catch (IOException var5) {
            this.method1706(1002, (byte) 30);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field3865++;
        if (!this.method1778((byte) 49)) {
            return;
        }
        class200.field3163 = Integer.parseInt(this.getParameter("worldid"));
        class73.field1104 = Integer.parseInt(this.getParameter("modewhere"));
        if (class73.field1104 < 0 || class73.field1104 > 1) {
            class73.field1104 = 0;
        }
        class206.field3232 = Integer.parseInt(this.getParameter("modewhat"));
        if (class206.field3232 < 0 || class206.field3232 > 2) {
            class206.field3232 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class197.field3121 = true;
        } else {
            class197.field3121 = false;
        }
        try {
            class46.field571 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class46.field571 = 0;
        }
        class58.method374((byte) -62, class46.field571);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class265.field4294 = true;
        } else {
            class265.field4294 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class293.field4697 = true;
        } else {
            class293.field4697 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class257.field4188 = 1;
        } else {
            class257.field4188 = 0;
        }
        try {
            class158.field2371 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class158.field2371 = 0;
        }
        class140.field2003 = this.getParameter("settings");
        if (class140.field2003 == null) {
            class140.field2003 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class166.field2561 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class166.field2561 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class24.field298 = true;
        } else {
            class24.field298 = false;
        }
        class197.field3117 = this;
        this.method1782(548, class206.field3232 + 32, -25593, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public static void method1711(byte arg0) {
        if (arg0 != -85) {
            field3871 = 108;
        }
        field3874 = null;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method1712(int arg0) {
        class303.method2034(-3);
        class1.field12 = new class205();
        field3876++;
        class93.field1397 = new class35();
        if (class206.field3232 != 0) {
            class22.field285 = new byte[50][];
        }
        class273.method1899((byte) -3, class95.field1425);
        if (class73.field1104 == 0) {
            class120.field1726 = this.getCodeBase().getHost();
            class57.field831 = 43594;
            class6.field80 = 443;
        } else if (class73.field1104 == 1) {
            class120.field1726 = this.getCodeBase().getHost();
            class6.field80 = class200.field3163 + 50000;
            class57.field831 = class200.field3163 + 40000;
        } else if (class73.field1104 == 2) {
            class57.field831 = class200.field3163 + 40000;
            class6.field80 = class200.field3163 + 50000;
            class120.field1726 = "127.0.0.1";
        }
        class199.field3149 = class216.field3385 = class268.field4348 = class162.field2486 = new short[256];
        class277.field4546 = class57.field831;
        class47.field598 = class6.field80;
        class142.field2109 = class120.field1726;
        if (class239.field3844 == 3 && class73.field1104 != 2) {
            class67.field991 = class200.field3163;
        }
        class8.field108 = class57.field831;
        if (class257.field4188 == 1) {
            class182.field2860 = true;
            class299.field4771 = class99.field1486;
            class16.field228 = class47.field592;
            class14.field208 = class32.field382;
            class291.field4685 = class171.field2678;
        } else {
            class16.field228 = class288.field4654;
            class291.field4685 = class216.field3370;
            class299.field4771 = class76.field1147;
            class14.field208 = class205.field3215;
        }
        class231.field3697 = class8.field108;
        class135.method859((byte) 123);
        class296.method1995((byte) -66, class304.field4831);
        class187.method1315(class304.field4831, -28500);
        class80.field1224 = class66.method435((byte) 73);
        int var2 = 3 / ((arg0 - 16) / 59);
        if (class80.field1224 != null) {
            class80.field1224.method14(-102, class304.field4831);
        }
        class248.field4027 = class239.field3844;
        try {
            if (class95.field1425.field3833 != null) {
                class138.field1988 = new class256(class95.field1425.field3833, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class112.field1628[var3] = new class256(class95.field1425.field3838[var3], 6000, 0);
                }
                class266.field4325 = new class256(class95.field1425.field3848, 6000, 0);
                class14.field201 = new class278(255, class138.field1988, class266.field4325, 500000);
                class231.field3690 = new class256(class95.field1425.field3837, 24, 0);
                class95.field1425.field3838 = null;
                class95.field1425.field3848 = null;
                class95.field1425.field3837 = null;
                class95.field1425.field3833 = null;
            }
        } catch (IOException var4) {
            class231.field3690 = null;
            class14.field201 = null;
            class266.field4325 = null;
            class138.field1988 = null;
        }
        if (class73.field1104 != 0) {
            class159.field2388 = true;
        }
        if (class257.field4188 == 0) {
            class128.field1836 = class7.field102;
        } else if (class257.field4188 == 1) {
            class128.field1836 = class112.field1619;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method1713(int arg0) {
        field3879++;
        if (!class138.field1983) {
            label241: while (true) {
                do {
                    if (!class193.method1356(1)) {
                        break label241;
                    }
                } while (class296.field4729 != 's' && class296.field4729 != 'S');
                class138.field1983 = true;
            }
        }
        if (class296.field4733 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class98.method665(true);
            if (class201.field3174 == 0L) {
                class201.field3174 = var4;
            }
            if (var3 > 16384 && var4 - class201.field3174 < 5000L) {
                if (var4 - class164.field2541 > 1000L) {
                    System.gc();
                    class164.field2541 = var4;
                }
                class166.field2567 = 5;
                class200.field3153 = class191.field2968;
            } else {
                class296.field4733 = 10;
                class166.field2567 = 5;
                class200.field3153 = class245.field3999;
            }
        } else if (class296.field4733 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class312.field4997[var6] = new class99(104, 104);
            }
            class166.field2567 = 10;
            class296.field4733 = 30;
            class200.field3153 = class277.field4494;
        } else if (class296.field4733 == 30) {
            if (class159.field2394 == null) {
                class159.field2394 = new class82(class93.field1397, class1.field12);
            }
            if (class159.field2394.method552(-74)) {
                class297.field4740 = class42.method242((byte) 110, false, 0, true, true);
                class17.field235 = class42.method242((byte) 22, false, 1, true, true);
                class223.field3494 = class42.method242((byte) 124, true, 2, true, false);
                class43.field525 = class42.method242((byte) 94, false, 3, true, true);
                class49.field619 = class42.method242((byte) 110, false, 4, true, true);
                class135.field1951 = class42.method242((byte) 92, true, 5, true, true);
                class77.field1177 = class42.method242((byte) 15, true, 6, false, true);
                class212.field3298 = class42.method242((byte) 18, false, 7, true, true);
                class295.field4726 = class42.method242((byte) 93, false, 8, true, true);
                class286.field4629 = class42.method242((byte) 24, false, 9, true, true);
                class42.field515 = class42.method242((byte) 70, false, 10, true, true);
                class245.field3998 = class42.method242((byte) 20, false, 11, true, true);
                class186.field2927 = class42.method242((byte) 90, false, 12, true, true);
                class281.field4582 = class42.method242((byte) 85, false, 13, true, true);
                class135.field1954 = class42.method242((byte) 85, false, 14, false, true);
                class233.field3762 = class42.method242((byte) 58, false, 15, true, true);
                class72.field1071 = class42.method242((byte) 28, false, 16, true, true);
                class197.field3113 = class42.method242((byte) 52, false, 17, true, true);
                class62.field903 = class42.method242((byte) 123, false, 18, true, true);
                class105.field1533 = class42.method242((byte) 58, false, 19, true, true);
                class273.field4437 = class42.method242((byte) 125, false, 20, true, true);
                class10.field164 = class42.method242((byte) 65, false, 21, true, true);
                class81.field1229 = class42.method242((byte) 101, false, 22, true, true);
                class169.field2602 = class42.method242((byte) 94, true, 23, true, true);
                class4.field65 = class42.method242((byte) 57, false, 24, true, true);
                class56.field809 = class42.method242((byte) 110, false, 25, true, true);
                class222.field3477 = class42.method242((byte) 31, true, 26, true, true);
                class79.field1201 = class42.method242((byte) 58, false, 27, true, true);
                class175.field2757 = class42.method242((byte) 16, true, 28, true, true);
                class296.field4733 = 40;
                class200.field3153 = class196.field3097;
                class166.field2567 = 15;
            } else {
                class200.field3153 = class299.field4775;
                class166.field2567 = 12;
            }
        } else if (class296.field4733 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class122.field1758[var8].method264((byte) -55) * class107.field1562[var8] / 100;
            }
            if (var7 == 100) {
                class166.field2567 = 20;
                class200.field3153 = class257.field4192;
                class100.method679(class295.field4726, (byte) -89);
                class290.method1976(-10936, class295.field4726);
                class263.method1847(arg0, class295.field4726);
                class296.field4733 = 41;
            } else {
                if (var7 != 0) {
                    class200.field3153 = class238.field3823 + var7 + "%";
                }
                class166.field2567 = 20;
            }
        } else if (class296.field4733 == 41) {
            if (class175.field2757.method503((byte) -40)) {
                this.method1707(class175.field2757.method507(-2, 1), 118);
                class200.field3153 = class66.field973;
                class166.field2567 = 25;
                class296.field4733 = 45;
            } else {
                class200.field3153 = class80.field1216 + class175.field2757.method500(54) + "%";
                class166.field2567 = 25;
            }
        } else if (class296.field4733 == 45) {
            class172.method1228(22050, 2, (byte) -99, class23.field295);
            class295.field4718 = new class307();
            class295.field4718.method2077(128, 9, ~arg0);
            class1.field27 = class225.method1592(0, 22050, 16384, class95.field1425, class304.field4831);
            class1.field27.method1529((byte) 122, class295.field4718);
            class172.method1231((byte) 62, class49.field619, class295.field4718, class135.field1954, class233.field3762);
            class195.field3078 = class225.method1592(1, 2048, arg0 ^ 0x4000, class95.field1425, class304.field4831);
            class81.field1231 = new class280();
            class195.field3078.method1529((byte) 122, class81.field1231);
            class86.field1322 = new class13(22050, class197.field3105);
            class176.field2779 = class77.field1177.method498(0, "scape main");
            class296.field4733 = 50;
            class200.field3153 = class161.field2414;
            class166.field2567 = 30;
        } else if (class296.field4733 == 50) {
            int var9 = class206.method1420((byte) -78, class295.field4726, class281.field4582);
            int var10 = class206.method1423(7244);
            if (var10 > var9) {
                class166.field2567 = 35;
                class200.field3153 = class59.field864 + var9 * 100 / var10 + "%";
            } else {
                class296.field4733 = 60;
                class166.field2567 = 35;
                class200.field3153 = class6.field85;
            }
        } else if (class296.field4733 == 60) {
            int var11 = class216.method1512(false, class295.field4726);
            int var12 = class22.method122(arg0);
            if (var11 < var12) {
                class166.field2567 = 40;
                class200.field3153 = class260.field4238 + var11 * 100 / var12 + "%";
            } else {
                class296.field4733 = 65;
                class166.field2567 = 40;
                class200.field3153 = class254.field4152;
            }
        } else if (class296.field4733 == 65) {
            class146.method993(arg0 - 37, class295.field4726, class281.field4582);
            class200.field3153 = class181.field2844;
            class166.field2567 = 45;
            class95.method651(5, (byte) 76);
            class296.field4733 = 70;
        } else if (class296.field4733 == 70) {
            class223.field3494.method503((byte) 117);
            byte var13 = 0;
            int var14 = var13 + class223.field3494.method500(92);
            class72.field1071.method503((byte) 123);
            int var15 = var14 + class72.field1071.method500(arg0 ^ 0x7B);
            class197.field3113.method503((byte) 124);
            int var16 = var15 + class197.field3113.method500(arg0 + 87);
            class62.field903.method503((byte) -123);
            int var17 = var16 + class62.field903.method500(arg0 + 54);
            class105.field1533.method503((byte) -56);
            int var18 = var17 + class105.field1533.method500(122);
            class273.field4437.method503((byte) 114);
            int var19 = var18 + class273.field4437.method500(arg0 ^ 0x37);
            class10.field164.method503((byte) -110);
            int var20 = var19 + class10.field164.method500(arg0 + 75);
            class81.field1229.method503((byte) -116);
            int var21 = var20 + class81.field1229.method500(90);
            class4.field65.method503((byte) -75);
            int var22 = var21 + class4.field65.method500(92);
            class56.field809.method503((byte) 104);
            int var23 = var22 + class56.field809.method500(58);
            class79.field1201.method503((byte) 118);
            int var24 = var23 + class79.field1201.method500(109);
            if (var24 < 1100) {
                class200.field3153 = class309.field4978 + var24 / 11 + "%";
                class166.field2567 = 50;
            } else {
                class124.method808(class223.field3494, arg0 - 22561);
                class298.method2008(class223.field3494, 4);
                class223.method1583(class223.field3494, (byte) -127);
                class80.method541((byte) 56, class223.field3494, class212.field3298);
                class184.method1301(class72.field1071, class212.field3298, arg0 ^ 0xFFFFFF99, true);
                class64.method410(class62.field903, true, class212.field3298, false);
                class272.method1893(class105.field1533, class212.field3298, -9, class142.field2074, true);
                class206.method1424(class223.field3494, arg0 ^ 0xFFFFFFFE);
                class193.method1358(0, class297.field4740, class273.field4437, class17.field235);
                class1.method2(50, class223.field3494);
                class148.method1005(class212.field3298, class10.field164, -9247);
                class71.method463(29232, class81.field1229);
                class9.method54(class223.field3494, (byte) 8);
                class234.method1648(class212.field3298, class281.field4582, class295.field4726, class43.field525, 96);
                class164.method1133((byte) 114, class223.field3494);
                class10.method56(class197.field3113, arg0 ^ 0xFFFFAD81);
                class118.method781(class56.field809, new class171(), arg0 ^ 0xFFFFFF9B, class4.field65);
                class64.method414(class4.field65, class56.field809, (byte) -118);
                class285.method1953(class223.field3494, 93);
                class72.method476(class223.field3494, -35);
                class265.method1853(class223.field3494, true);
                class223.method1581(class223.field3494, class295.field4726, (byte) -124);
                class83.method564((byte) 76, class295.field4726, class223.field3494);
                class216.method1515(class223.field3494, class295.field4726, false);
                class166.field2567 = 50;
                class200.field3153 = class232.field3752;
                class278.method1921(arg0);
                class296.field4733 = 80;
            }
        } else if (class296.field4733 == 80) {
            int var25 = class190.method1324(83, class295.field4726);
            int var26 = class268.method1865(-87);
            if (var25 < var26) {
                class166.field2567 = 60;
                class200.field3153 = class161.field2417 + var25 * 100 / var26 + "%";
            } else {
                class189.method1320(true, class295.field4726);
                class200.field3153 = class86.field1303;
                class166.field2567 = 60;
                class296.field4733 = 90;
            }
        } else if (class296.field4733 == 90) {
            if (class222.field3477.method503((byte) -50)) {
                class175 var27 = new class175(class286.field4629, class222.field3477, class295.field4726, 20, !class17.field234);
                class221.method1556(var27);
                if (class229.field3547 == 1) {
                    class221.method1561(0.9F);
                }
                if (class229.field3547 == 2) {
                    class221.method1561(0.8F);
                }
                if (class229.field3547 == 3) {
                    class221.method1561(0.7F);
                }
                if (class229.field3547 == 4) {
                    class221.method1561(0.6F);
                }
                class296.field4733 = 100;
                class200.field3153 = class119.field1722;
                class166.field2567 = 70;
            } else {
                class200.field3153 = class63.field913 + class222.field3477.method500(arg0 + 98) + "%";
                class166.field2567 = 70;
            }
        } else if (class296.field4733 == 100) {
            if (class63.method403(class295.field4726, true)) {
                class296.field4733 = 110;
            }
        } else if (class296.field4733 == 110) {
            class168.field2588 = new class3();
            class95.field1425.method1684(0, class168.field2588, 10);
            class166.field2567 = 75;
            class200.field3153 = class107.field1564;
            class296.field4733 = 120;
        } else if (class296.field4733 == 120) {
            if (class42.field515.method512("huffman", (byte) -125, "")) {
                class301 var28 = new class301(class42.field515.method490("", -1, "huffman"));
                class180.method1278(var28, (byte) -117);
                class200.field3153 = class193.field3065;
                class296.field4733 = 130;
                class166.field2567 = 80;
            } else {
                class200.field3153 = class209.field3267 + "0%";
                class166.field2567 = 80;
            }
        } else if (class296.field4733 == 130) {
            if (!class43.field525.method503((byte) -55)) {
                class200.field3153 = class228.field3536 + class43.field525.method500(arg0 + 90) * 3 / 4 + "%";
                class166.field2567 = 85;
            } else if (!class186.field2927.method503((byte) 98)) {
                class200.field3153 = class228.field3536 + ((class186.field2927.method500(arg0 + 106) / 10) + 75) + "%";
                class166.field2567 = 85;
            } else if (!class281.field4582.method503((byte) -109)) {
                class200.field3153 = class228.field3536 + (class281.field4582.method500(83) / 20 + 85) + "%";
                class166.field2567 = 85;
            } else if (class169.field2602.method506(0, "details")) {
                class207.method1431(class169.field2602);
                class65.method422(class79.field1201);
                class157.method1086(class212.field3298);
                class200.field3153 = class169.field2609;
                class166.field2567 = 95;
                class296.field4733 = 135;
            } else {
                class200.field3153 = class228.field3536 + ((class169.field2602.method495((byte) 47, "details") / 10) + 90) + "%";
                class166.field2567 = 85;
            }
        } else if (class296.field4733 == 135) {
            int var29 = class198.method1380(false);
            if (var29 == -1) {
                class200.field3153 = class123.field1766;
                class166.field2567 = 95;
            } else if (var29 == 7 || var29 == 9) {
                this.method1780((byte) -72, "worldlistfull");
                class95.method651(1000, (byte) 6);
            } else if (class287.field4644) {
                class166.field2567 = 96;
                class200.field3153 = class288.field4655;
                class296.field4733 = 140;
            } else {
                this.method1780((byte) -78, "worldlistio_" + var29);
                class95.method651(1000, (byte) 8);
            }
        } else if (arg0 == 0) {
            if (class296.field4733 == 140) {
                class49.field621 = class43.field525.method498(0, "loginscreen");
                class135.field1951.method510(false, 26423, true);
                class77.field1177.method510(true, 26423, true);
                class295.field4726.method510(true, 26423, true);
                class281.field4582.method510(true, 26423, true);
                class42.field515.method510(true, arg0 ^ 0x6737, true);
                class43.field525.method510(true, 26423, true);
                class296.field4733 = 150;
                class59.field873 = true;
                class200.field3153 = class294.field4715;
                class166.field2567 = 97;
            } else if (class296.field4733 == 150) {
                if (class138.field1983) {
                    class306.field4876 = 0;
                    class173.field2723 = 0;
                    class250.field4091 = 0;
                    class96.field1451 = 0;
                }
                class138.field1983 = true;
                class170.method1216(class95.field1425, -89);
                class190.method1325(class173.field2723, -1, 0, -1, false);
                class296.field4733 = 160;
                class200.field3153 = class112.field1622;
                class166.field2567 = 100;
            } else if (class296.field4733 == 160) {
                class210.method1457((byte) 98, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lfe;)Z")
    public static final boolean method1714(class231 arg0) {
        if (class107.field1563) {
            if (method1698(arg0).field367 != 0) {
                return false;
            }
            if (arg0.field3620 == 0) {
                return false;
            }
        }
        return arg0.field3692;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method1715(byte arg0) {
        if (class168.field2588 != null) {
            class168.field2588.field54 = false;
        }
        field3868++;
        class168.field2588 = null;
        if (class270.field4405 != null) {
            class270.field4405.method567(0);
            class270.field4405 = null;
        }
        class229.method1612(class304.field4831, (byte) 69);
        class55.method358(class304.field4831, (byte) 68);
        if (class80.field1224 != null) {
            class80.field1224.method16(2, class304.field4831);
        }
        class281.method1938((byte) -27);
        class258.method1828(200);
        class80.field1224 = null;
        if (class1.field27 != null) {
            class1.field27.method1528(-103);
        }
        if (class195.field3078 != null) {
            class195.field3078.method1528(-121);
        }
        class93.field1397.method182(-111);
        if (arg0 >= -104) {
            field3867 = 110;
        }
        class1.field12.method1409(105);
    }
}
