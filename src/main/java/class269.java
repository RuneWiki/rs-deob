import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class269 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field4126 = 0;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4127 = "Loaded config";

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4133 = "Walk here";

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lke;")
    public static class110 field4119;

    @OriginalMember(owner = "client!kl", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4132++;
    }

    @OriginalMember(owner = "client!kl", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field4125++;
        if (class87.field1182 != null) {
            class5.field43 = 0;
            class206.field2874 = 0;
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!kl", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class87.field1182 != null) {
            class5.field43 = 0;
            class156.field2178 = -1;
            class34.field532 = -1;
        }
        field4121++;
    }

    @OriginalMember(owner = "client!kl", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field4123++;
        if (class87.field1182 != null) {
            class5.field43 = 0;
            class156.field2178 = arg0.getX();
            class34.field532 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)Lid;")
    public static final class151 method1775(byte arg0, int arg1) {
        field4116++;
        class151 var2 = (class151) class77.field1073.method540((byte) -115, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = 66 / ((-arg0 - 9) / 41);
        byte[] var4 = class242.field3713.method1576(-51, 32, arg1);
        class151 var5 = new class151();
        if (var4 != null) {
            var5.method1015(-1, new class224(var4));
        }
        var5.method1016(true);
        class77.field1073.method543(var5, (long) arg1, 858993459);
        return var5;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1776(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4118++;
        class159.field2222++;
        class46.method305(-105);
        if (arg0) {
            class221.method1425(false, 64, 0, false);
        } else {
            class43.method287(true, 0);
            class221.method1425(true, 64, 0, false);
            if (class100.field1401 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class221.method1425(false, 64, var7, false);
                    class221.method1425(false, 64, var7, true);
                    class43.method287(true, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class43.method287(true, var6);
                    class221.method1425(false, 64, var6, false);
                    class221.method1425(false, 64, var6, true);
                }
            }
        }
        if (!arg0) {
            class74.method477(128);
        }
        class12.method73(-80);
        if (class51.field734 == 1) {
            int var8 = (int) class68.field912 + class42.field636 & 0x7FF;
            int var9 = (int) class78.field1091;
            if ((class236.field3596 / 256) > var9) {
                var9 = class236.field3596 / 256;
            }
            if (class46.field673[4] && var9 < (class122.field1700[4] + 128)) {
                var9 = class122.field1700[4] + 128;
            }
            class287.method1935(class221.field3314, class275.method1836(class295.field4642, class217.field3280.field4085, class217.field3280.field4019, 22) - 50, var8, class240.field3679, var9 * 3 + 600, -1, var9, arg3);
        } else if (class51.field734 == 5) {
            class175.method1149(arg3, -84);
        }
        int var10 = class41.field618;
        int var11 = class246.field3773;
        int var12 = class89.field1252;
        int var13 = class239.field3645;
        int var14 = class275.field4265;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class46.field673[var15]) {
                int var22 = (int) (Math.random() * (double) (class46.field676[var15] * 2 + 1) + Math.sin((double) class9.field86[var15] / 100.0D * (double) class114.field1638[var15]) * (double) class122.field1700[var15] - (double) class46.field676[var15]);
                if (var15 == 1) {
                    class246.field3773 += var22;
                }
                if (var15 == 4) {
                    class275.field4265 += var22;
                    if (class275.field4265 < 128) {
                        class275.field4265 = 128;
                    }
                    if (class275.field4265 > 383) {
                        class275.field4265 = 383;
                    }
                }
                if (var15 == 2) {
                    class89.field1252 += var22;
                }
                if (var15 == 3) {
                    class239.field3645 = class239.field3645 + var22 & 0x7FF;
                }
                if (var15 == 0) {
                    class41.field618 += var22;
                }
            }
        }
        class195.method1237((byte) 22);
        class64.method398(arg5, arg1, arg4 + arg5, arg1 + arg3);
        class90.method580();
        if (class247.field3792 >= 0) {
            class130 var16 = class71.method445(class216.field3259, class30.field410, -211334896, class253.field3860, class247.field3792);
            var16.method889(class169.field2348, arg5, arg1, arg4, arg3, class275.field4265, class239.field3645, 0);
        } else {
            class64.method401(arg5, arg1, arg4, arg3, 0);
        }
        if (class15.field146 || arg5 > class203.field2830 || class203.field2830 >= arg5 + arg4 || arg1 > class193.field2678 || class193.field2678 >= arg1 + arg3) {
            class119.field1681 = false;
            class246.field3760 = 0;
        } else {
            class119.field1681 = true;
            int var17 = class41.field614;
            int var18 = class252.field3849;
            int var19 = class180.field2530;
            class246.field3760 = 0;
            int var20 = class86.field1168;
            class13.field127 = (class193.field2678 - arg1) * (var20 - var19) / arg3 + var19;
            class237.field3605 = (class203.field2830 - arg5) * (var18 - var17) / arg4 + var17;
        }
        if (arg2 >= -38) {
            return;
        }
        class156.method1038(false);
        byte var21 = class146.method981(-24191) == 2 ? (byte) class159.field2222 : 1;
        class59.method365(class41.field618, class246.field3773, class89.field1252, class275.field4265, class239.field3645, class86.field1176, class181.field2534, class231.field3500, class33.field502, class137.field1921, class222.field3333, class295.field4642 + 1, var21, class217.field3280.field4019 >> 7, class217.field3280.field4085 >> 7);
        class156.method1038(false);
        class17.method102();
        class16.method92(-50, 256, arg3, arg1, arg5, 256, arg4);
        class100.method658(arg1, arg4, 256, arg3, -63, arg5, 256);
        ((class206) class90.field1260).method1307(-109, class225.field3409);
        class295.method1978(arg1, 3, arg3, arg4, arg5);
        class41.field618 = var10;
        class246.field3773 = var11;
        class275.field4265 = var14;
        class89.field1252 = var12;
        class239.field3645 = var13;
        if (class29.field377 && class214.field3229.method631(69) == 0) {
            class29.field377 = false;
        }
        if (class29.field377) {
            class64.method401(arg5, arg1, arg4, arg3, 0);
            class22.method165(false, class13.field128, 1);
        }
        if (!arg0 && !class29.field377 && !class15.field146 && arg5 <= class203.field2830 && (arg4 + arg5) > class203.field2830 && arg1 <= class193.field2678 && class193.field2678 < (arg1 + arg3)) {
            class228.method1506(arg3, arg4, 127, arg1, arg5, class203.field2830, class193.field2678);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1777(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class127.field1802 = arg1;
        class234.field3531 = arg2;
        class153.field2123 = arg3;
        class278.field4313 = new class89[arg0][class127.field1802][class234.field3531];
        class137.field1924 = new int[arg0][class127.field1802 + 1][class234.field3531 + 1];
        if (arg4) {
            class296.field4674 = new class89[1][class127.field1802][class234.field3531];
            class119.field1674 = new int[class127.field1802][class234.field3531];
            class95.field1341 = new int[1][class127.field1802 + 1][class234.field3531 + 1];
        } else {
            class296.field4674 = null;
            class119.field1674 = null;
            class95.field1341 = null;
        }
        class46.method301(false);
        class265.field3978 = new class173[500];
        class204.field2845 = 0;
        class204.field2844 = new class173[500];
        class67.field908 = 0;
        class104.field1454 = new int[arg0][class127.field1802 + 1][class234.field3531 + 1];
        class230.field3484 = new class198[5000];
        class140.field1953 = 0;
        class36.field558 = new class198[100];
        class76.field1059 = new boolean[class153.field2123 + class153.field2123 + 1][class153.field2123 + class153.field2123 + 1];
        class245.field3747 = new boolean[class153.field2123 + class153.field2123 + 2][class153.field2123 + class153.field2123 + 2];
        class228.field3447 = new byte[arg0][class127.field1802][class234.field3531];
    }

    @OriginalMember(owner = "client!kl", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4128++;
    }

    @OriginalMember(owner = "client!kl", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class87.field1182 != null) {
            class206.field2874 = 0;
        }
        field4115++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZJZ)V")
    public static final void method1778(boolean arg0, long arg1, boolean arg2) {
        field4114++;
        if (arg1 == 0L) {
            return;
        }
        if (class93.field1300 >= 100) {
            class283.method1900("", class171.field2368, 0, !arg2);
            return;
        }
        String var4 = class274.method1828(0, arg1);
        for (int var5 = 0; var5 < class93.field1300; var5++) {
            if (class296.field4677[var5] == arg1) {
                class283.method1900("", var4 + class246.field3762, 0, !arg2);
                return;
            }
        }
        for (int var6 = 0; var6 < class279.field4323; var6++) {
            if (class84.field1144[var6] == arg1) {
                class283.method1900("", class205.field2862 + var4 + class145.field2024, 0, true);
                return;
            }
        }
        if (var4.equals(class217.field3280.field1217)) {
            class283.method1900("", class15.field151, 0, true);
            return;
        }
        class296.field4677[class93.field1300] = arg1;
        class227.field3438++;
        class186.field2573[class93.field1300++] = class17.method101(arg1, (byte) 119);
        class294.field4621[class93.field1300++] = arg0;
        if (!arg2) {
            class66.field892 = class35.field548;
            class281.field4359.method1864(122, (byte) -69);
            class281.field4359.method1451(arg1, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZI[[[Ljd;II)Z")
    public static final boolean method1779(int arg0, boolean arg1, int arg2, class89[][][] arg3, int arg4, int arg5) {
        byte var6 = arg1 ? 1 : (byte) (class159.field2222 & 0xFF);
        field4111++;
        if (class86.field1176[class295.field4642][arg5][arg4] == var6) {
            return false;
        } else if ((class230.field3489[class295.field4642][arg5][arg4] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class224.field3365[var7] = arg5;
            int var31 = var7 + 1;
            class107.field1496[var7] = arg4;
            int var8 = 0;
            class86.field1176[class295.field4642][arg5][arg4] = var6;
            while (var31 != var8) {
                int var9 = class224.field3365[var8] & 0xFFFF;
                int var10 = class224.field3365[var8] >> 16 & 0xFF;
                int var11 = class107.field1496[var8] & 0xFFFF;
                int var12 = class224.field3365[var8] >> 24 & 0xFF;
                boolean var13 = false;
                int var14 = class107.field1496[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                if ((class230.field3489[class295.field4642][var9][var11] & 0x4) == 0) {
                    var13 = true;
                }
                boolean var15 = false;
                label229: for (int var16 = class295.field4642 + 1; var16 <= 3; var16++) {
                    if ((class230.field3489[var16][var9][var11] & 0x8) == 0) {
                        if (var13 && arg3[var16][var9][var11] != null) {
                            if (arg3[var16][var9][var11].field1244 != null) {
                                int var19 = class110.method713(false, var10);
                                if (arg3[var16][var9][var11].field1244.field2720 == var19 || arg3[var16][var9][var11].field1244.field2724 == var19) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var20 = class110.method713(false, var12);
                                    if (arg3[var16][var9][var11].field1244.field2720 == var20 || arg3[var16][var9][var11].field1244.field2724 == var20) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var21 = class110.method713(false, var14);
                                    if (arg3[var16][var9][var11].field1244.field2720 == var21 || arg3[var16][var9][var11].field1244.field2724 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var16][var9][var11].field1226 != null) {
                                for (int var22 = 0; var22 < arg3[var16][var9][var11].field1240; var22++) {
                                    int var23 = (int) (arg3[var16][var9][var11].field1226[var22].field2753 >> 14 & 0x3FL);
                                    int var24 = (int) (arg3[var16][var9][var11].field1226[var22].field2753 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var24 << 6 | var23;
                                    if (var10 == var25 || var12 != 0 && var12 == var25 || var14 != 0 && var14 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class89 var26 = arg3[var16][var9][var11];
                        if (var26 != null && var26.field1240 > 0) {
                            for (int var27 = 0; var27 < var26.field1240; var27++) {
                                class198 var28 = var26.field1226[var27];
                                if (var28.field2765 != var28.field2746 || var28.field2763 != var28.field2748) {
                                    for (int var29 = var28.field2746; var29 <= var28.field2765; var29++) {
                                        for (int var30 = var28.field2748; var30 <= var28.field2763; var30++) {
                                            class86.field1176[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class86.field1176[var16][var9][var11] = var6;
                    }
                }
                if (var15) {
                    int var17 = var9 << 7;
                    int var18 = var11 << 7;
                    if (class200.field2788[class295.field4642 + 1][var9][var11] > class181.field2534[arg2]) {
                        class181.field2534[arg2] = class200.field2788[class295.field4642 + 1][var9][var11];
                    }
                    if (class231.field3500[arg2] > var17) {
                        class231.field3500[arg2] = var17;
                    } else if (var17 > class33.field502[arg2]) {
                        class33.field502[arg2] = var17;
                    }
                    if (var18 < class222.field3333[arg2]) {
                        class222.field3333[arg2] = var18;
                    } else if (class137.field1921[arg2] < var18) {
                        class137.field1921[arg2] = var18;
                    }
                }
                if (!var13) {
                    if (var9 >= 1 && class86.field1176[class295.field4642][var9 - 1][var11] != var6) {
                        class224.field3365[var31] = class54.method339(class54.method339(var9 - 1, 1179648), -754974720);
                        class107.field1496[var31] = class54.method339(1245184, var11);
                        class86.field1176[class295.field4642][var9 - 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11++;
                    if (var11 < 104) {
                        if (var9 - 1 >= 0 && class86.field1176[class295.field4642][var9 - 1][var11] != var6 && (class230.field3489[class295.field4642][var9][var11] & 0x4) == 0 && (class230.field3489[class295.field4642][var9 - 1][var11 - 1] & 0x4) == 0) {
                            class224.field3365[var31] = class54.method339(1375731712, class54.method339(1179648, var9 - 1));
                            class107.field1496[var31] = class54.method339(var11, 1245184);
                            class86.field1176[class295.field4642][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class86.field1176[class295.field4642][var9][var11] != var6) {
                            class224.field3365[var31] = class54.method339(318767104, class54.method339(5373952, var9));
                            class107.field1496[var31] = class54.method339(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class86.field1176[class295.field4642][var9][var11] = var6;
                        }
                        if ((var9 + 1) < 104 && class86.field1176[class295.field4642][var9 + 1][var11] != var6 && (class230.field3489[class295.field4642][var9][var11] & 0x4) == 0 && (class230.field3489[class295.field4642][var9 + 1][var11 - 1] & 0x4) == 0) {
                            class224.field3365[var31] = class54.method339(-1845493760, class54.method339(5373952, var9 + 1));
                            class107.field1496[var31] = class54.method339(5439488, var11);
                            var31 = var31 + 1 & 0xFFF;
                            class86.field1176[class295.field4642][var9 + 1][var11] = var6;
                        }
                    }
                    var11--;
                    if ((var9 + 1) < 104 && class86.field1176[class295.field4642][var9 + 1][var11] != var6) {
                        class224.field3365[var31] = class54.method339(class54.method339(9568256, var9 + 1), 1392508928);
                        class107.field1496[var31] = class54.method339(9633792, var11);
                        class86.field1176[class295.field4642][var9 + 1][var11] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var11--;
                    if (var11 >= 0) {
                        if (var9 - 1 >= 0 && class86.field1176[class295.field4642][var9 - 1][var11] != var6 && (class230.field3489[class295.field4642][var9][var11] & 0x4) == 0 && (class230.field3489[class295.field4642][var9 - 1][var11 + 1] & 0x4) == 0) {
                            class224.field3365[var31] = class54.method339(class54.method339(13762560, var9 - 1), 301989888);
                            class107.field1496[var31] = class54.method339(var11, 13828096);
                            class86.field1176[class295.field4642][var9 - 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class86.field1176[class295.field4642][var9][var11] != var6) {
                            class224.field3365[var31] = class54.method339(class54.method339(var9, 13762560), -1828716544);
                            class107.field1496[var31] = class54.method339(var11, 13828096);
                            class86.field1176[class295.field4642][var9][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class86.field1176[class295.field4642][var9 + 1][var11] != var6 && (class230.field3489[class295.field4642][var9][var11] & 0x4) == 0 && (class230.field3489[class295.field4642][var9 + 1][var11 + 1] & 0x4) == 0) {
                            class224.field3365[var31] = class54.method339(-771751936, class54.method339(9568256, var9 + 1));
                            class107.field1496[var31] = class54.method339(9633792, var11);
                            class86.field1176[class295.field4642][var9 + 1][var11] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class181.field2534[arg2] != -1000000) {
                class181.field2534[arg2] += 10;
                class231.field3500[arg2] -= 50;
                class33.field502[arg2] += 50;
                class137.field1921[arg2] += 50;
                class222.field3333[arg2] -= 50;
            }
            if (arg0 != 1) {
                method1776(false, 109, 46, -65, 52, -117);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static final void method1780(byte arg0) {
        field4131++;
        if (arg0 <= -107) {
            class41.field611.method544(false);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method1781(int arg0) {
        field4119 = null;
        field4127 = null;
        if (arg0 == -7883) {
            field4133 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class87.field1182 != null) {
            class5.field43 = 0;
            client.field2185 = arg0.getX();
            class27.field345 = arg0.getY();
            class153.field2129 = class223.method1433((byte) 20);
            if (arg0.isMetaDown()) {
                class224.field3398 = 2;
                class206.field2874 = 2;
            } else {
                class224.field3398 = 1;
                class206.field2874 = 1;
            }
            int var2 = arg0.getModifiers();
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field4122++;
    }

    @OriginalMember(owner = "client!kl", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field4130++;
        if (class87.field1182 != null) {
            class5.field43 = 0;
            class156.field2178 = arg0.getX();
            class34.field532 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1782(int arg0, String arg1) {
        field4113++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class237.method1592(var6, arg0 + 23753);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        if (arg0 == 1) {
            return new String(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class87.field1182 != null) {
            class5.field43 = 0;
            class156.field2178 = arg0.getX();
            class34.field532 = arg0.getY();
        }
        field4117++;
    }
}
