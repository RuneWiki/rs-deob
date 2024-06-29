import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class101 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Loc;")
    public static class151 field1833 = class137.method873(2, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[[I")
    public static int[][] field1828 = new int[104][104];

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
    public static int[] field1829 = new int[100];

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Loc;")
    public static class151 field1825 = class137.method873(2, "title_mute");

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Loc;")
    private static class151 field1822 = class137.method873(2, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Loc;")
    public static class151 field1832 = field1822;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field1838 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!jd", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class16.field362 != null) {
            class36.field748 = 0;
            class90.field1659 = arg0.getX();
            class41.field853 = arg0.getY();
        }
        field1831++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([Lwd;IIIIIIII)V")
    public static final void method618(class232[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1839++;
        if (arg4 != 1741621446) {
            method618(null, -8, 95, -69, -7, 3, 79, -33, 60);
        }
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class232 var10 = arg0[var9];
            if (var10 != null && (!var10.field4237 || var10.field4173 == 0 || var10.field4217 || class174.method1110(true, var10) != 0 || class63.field1227 == var10 || var10.field4148 == 1338) && var10.field4156 == arg3 && (!var10.field4237 || !class16.method133(arg4 ^ 0x67CF26DA, var10))) {
                int var11 = var10.field4154 + arg1;
                int var12 = var10.field4191 + arg5;
                if (class222.field3860 == var10) {
                    class204.field3630 = var11;
                    class123.field2192 = true;
                    class217.field3784 = var12;
                }
                int var13;
                int var15;
                int var17;
                int var18;
                if (var10.field4173 == 2) {
                    var18 = arg7;
                    var17 = arg8;
                    var15 = arg6;
                    var13 = arg2;
                } else {
                    var13 = var11 > arg2 ? var11 : arg2;
                    int var14 = var12 + var10.field4215;
                    var15 = var12 > arg6 ? var12 : arg6;
                    int var16 = var10.field4216 + var11;
                    if (var10.field4173 == 9) {
                        var14++;
                        var16++;
                    }
                    var17 = arg8 > var14 ? var14 : arg8;
                    var18 = arg7 > var16 ? var16 : arg7;
                }
                if (!var10.field4237 || var17 > var15 && var18 > var13) {
                    if (var10.field4148 == 1337) {
                        class27.method208(true, var10);
                    } else {
                        if (var10.field4148 == 1400) {
                            class153.field2778 = var10;
                        }
                        if (var10.field4173 == 0) {
                            if (var10.field4148 == 1400) {
                                class104.field1871 = false;
                            }
                            if (!var10.field4237 && class16.method133(11804, var10) && class231.field4116 != var10) {
                                continue;
                            }
                            method618(arg0, var11 - var10.field4195, var13, var10.field4261, 1741621446, var12 - var10.field4137, var15, var18, var17);
                            if (var10.field4239 != null) {
                                method618(var10.field4239, var11 - var10.field4195, var13, var10.field4261, 1741621446, var12 - var10.field4137, var15, var18, var17);
                            }
                            class147 var19 = (class147) class227.field3961.method1538((long) var10.field4261, (byte) 127);
                            if (var19 != null) {
                                class179.method1136(var11, var13, var18, var17, var19.field2631, var15, 118, var12);
                            }
                            if (var10.field4148 == 1400 && class104.field1871) {
                                return;
                            }
                        }
                        if (var10.field4237) {
                            boolean var20;
                            if (var15 <= class57.field1149 && var13 <= class41.field857 && class57.field1149 < var17 && var18 > class41.field857) {
                                var20 = true;
                            } else {
                                var20 = false;
                            }
                            if (var20) {
                                class104.field1871 = true;
                            }
                            boolean var21 = false;
                            boolean var22 = false;
                            if (class112.field1987 == 1 && var15 <= class2.field61 && class209.field3677 >= var13 && class2.field61 < var17 && class209.field3677 < var18) {
                                var21 = true;
                            }
                            if (class141.field2553 == 1 && var20) {
                                var22 = true;
                            }
                            if (var10.field4148 == 1338) {
                                if (var21) {
                                    class52.method360(class209.field3677 - var11, var10, (byte) -45, class2.field61 - var12);
                                }
                                continue;
                            }
                            if (var10.field4148 == 1400) {
                                if (var21) {
                                    if (class231.field4125[82] && class150.field2683 > 0) {
                                        int var23 = (int) ((double) (class2.field61 - var10.field4215 / 2 - var12) * 2.0D / class188.field3339) + class63.field1228 + class110.field1943;
                                        int var24 = class36.field759 + class27.field581 - (int) ((double) (-var11 + class209.field3677 + -(var10.field4216 / 2)) * 2.0D / class188.field3339) - class25.field541;
                                        class151 var25 = class126.method761(new class151[] { class113.field2006, class137.method874(var23 >> 6, false), class227.field3965, class137.method874(var24 >> 6, false), class227.field3965, class137.method874(var23 & 0x3F, false), class227.field3965, class137.method874(var24 & 0x3F, false) }, arg4 - 1741611186);
                                        var25.method961(-12789);
                                        class93.method590((byte) -70, var25);
                                        class178.method1130(-123);
                                    } else {
                                        class31.field646 = class41.field857;
                                        class196.field3499 = true;
                                        class222.field3838 = class25.field541;
                                        class2.field59 = class57.field1149;
                                        class178.field3215 = class110.field1943;
                                    }
                                    continue;
                                }
                                if (var22 && class196.field3499) {
                                    class208.method1303((int) ((double) (class2.field59 - class57.field1149) * 2.0D / class138.field2517) + class178.field3215, 27760);
                                    class20.method174((int) ((double) (class31.field646 - class41.field857) * 2.0D / class138.field2517) + class222.field3838, (byte) 22);
                                    continue;
                                }
                                class196.field3499 = false;
                            }
                            if (var10.field4148 == 1401 && var22) {
                                class147.method933(var10.field4216, false, class41.field857 - var11, -var12 + class57.field1149, var10.field4215);
                            }
                            if (var21) {
                                class194.method1218(class2.field61 - var12, var10, class209.field3677 - var11, arg4 ^ 0x67CF00C6);
                            }
                            if (class222.field3860 != null && class222.field3860 != var10 && var20 && class117.method711(arg4 ^ 0x9830F0E9, class174.method1110(true, var10))) {
                                class73.field1422 = var10;
                            }
                            if (class63.field1227 == var10) {
                                class215.field3761 = var11;
                                class144.field2601 = var12;
                                class222.field3844 = true;
                            }
                            if (var10.field4217) {
                                if (var20 && class11.field211 != 0 && var10.field4166 != null) {
                                    class224 var26 = new class224();
                                    var26.field3905 = var10;
                                    var26.field3897 = class11.field211;
                                    var26.field3895 = var10.field4166;
                                    class179.field3241.method1361(var26, (byte) 71);
                                }
                                if (class222.field3860 != null || class151.field2700 != null || class225.field3917 || class196.field3499) {
                                    var21 = false;
                                    var22 = false;
                                    var20 = false;
                                }
                                if (!var10.field4220 && var21) {
                                    var10.field4220 = true;
                                    if (var10.field4200 != null) {
                                        class224 var27 = new class224();
                                        var27.field3895 = var10.field4200;
                                        var27.field3905 = var10;
                                        var27.field3900 = class2.field61 - var12;
                                        var27.field3897 = class209.field3677 - var11;
                                        class179.field3241.method1361(var27, (byte) 71);
                                    }
                                }
                                if (var10.field4220 && var22 && var10.field4250 != null) {
                                    class224 var28 = new class224();
                                    var28.field3895 = var10.field4250;
                                    var28.field3905 = var10;
                                    var28.field3900 = class57.field1149 - var12;
                                    var28.field3897 = class41.field857 - var11;
                                    class179.field3241.method1361(var28, (byte) 71);
                                }
                                if (var10.field4220 && !var22) {
                                    var10.field4220 = false;
                                    if (var10.field4161 != null) {
                                        class224 var29 = new class224();
                                        var29.field3900 = class57.field1149 - var12;
                                        var29.field3905 = var10;
                                        var29.field3895 = var10.field4161;
                                        var29.field3897 = class41.field857 - var11;
                                        class177.field3197.method1361(var29, (byte) 71);
                                    }
                                }
                                if (var22 && var10.field4254 != null) {
                                    class224 var30 = new class224();
                                    var30.field3900 = class57.field1149 - var12;
                                    var30.field3905 = var10;
                                    var30.field3895 = var10.field4254;
                                    var30.field3897 = class41.field857 - var11;
                                    class179.field3241.method1361(var30, (byte) 71);
                                }
                                if (!var10.field4211 && var20) {
                                    var10.field4211 = true;
                                    if (var10.field4142 != null) {
                                        class224 var31 = new class224();
                                        var31.field3905 = var10;
                                        var31.field3897 = class41.field857 - var11;
                                        var31.field3895 = var10.field4142;
                                        var31.field3900 = class57.field1149 - var12;
                                        class179.field3241.method1361(var31, (byte) 71);
                                    }
                                }
                                if (var10.field4211 && var20 && var10.field4167 != null) {
                                    class224 var32 = new class224();
                                    var32.field3905 = var10;
                                    var32.field3895 = var10.field4167;
                                    var32.field3897 = class41.field857 - var11;
                                    var32.field3900 = class57.field1149 - var12;
                                    class179.field3241.method1361(var32, (byte) 71);
                                }
                                if (var10.field4211 && !var20) {
                                    var10.field4211 = false;
                                    if (var10.field4236 != null) {
                                        class224 var33 = new class224();
                                        var33.field3895 = var10.field4236;
                                        var33.field3900 = class57.field1149 - var12;
                                        var33.field3905 = var10;
                                        var33.field3897 = class41.field857 - var11;
                                        class177.field3197.method1361(var33, (byte) 71);
                                    }
                                }
                                if (var10.field4197 != null) {
                                    class224 var34 = new class224();
                                    var34.field3895 = var10.field4197;
                                    var34.field3905 = var10;
                                    class129.field2345.method1361(var34, (byte) 71);
                                }
                                if (var10.field4190 != null && var10.field4169 < class179.field3230) {
                                    if (var10.field4240 == null || class179.field3230 - var10.field4169 > 32) {
                                        class224 var39 = new class224();
                                        var39.field3905 = var10;
                                        var39.field3895 = var10.field4190;
                                        class179.field3241.method1361(var39, (byte) 71);
                                    } else {
                                        label409: for (int var35 = var10.field4169; var35 < class179.field3230; var35++) {
                                            int var36 = class51.field1031[var35 & 0x1F];
                                            for (int var37 = 0; var37 < var10.field4240.length; var37++) {
                                                if (var10.field4240[var37] == var36) {
                                                    class224 var38 = new class224();
                                                    var38.field3895 = var10.field4190;
                                                    var38.field3905 = var10;
                                                    class179.field3241.method1361(var38, (byte) 71);
                                                    break label409;
                                                }
                                            }
                                        }
                                    }
                                    var10.field4169 = class179.field3230;
                                }
                                if (var10.field4177 != null && class169.field3075 > var10.field4232) {
                                    if (var10.field4253 == null || class169.field3075 - var10.field4232 > 32) {
                                        class224 var44 = new class224();
                                        var44.field3905 = var10;
                                        var44.field3895 = var10.field4177;
                                        class179.field3241.method1361(var44, (byte) 71);
                                    } else {
                                        label385: for (int var40 = var10.field4232; var40 < class169.field3075; var40++) {
                                            int var41 = class121.field2179[var40 & 0x1F];
                                            for (int var42 = 0; var42 < var10.field4253.length; var42++) {
                                                if (var10.field4253[var42] == var41) {
                                                    class224 var43 = new class224();
                                                    var43.field3905 = var10;
                                                    var43.field3895 = var10.field4177;
                                                    class179.field3241.method1361(var43, (byte) 71);
                                                    break label385;
                                                }
                                            }
                                        }
                                    }
                                    var10.field4232 = class169.field3075;
                                }
                                if (var10.field4139 != null && class116.field2095 > var10.field4160) {
                                    if (var10.field4172 == null || class116.field2095 - var10.field4160 > 32) {
                                        class224 var49 = new class224();
                                        var49.field3895 = var10.field4139;
                                        var49.field3905 = var10;
                                        class179.field3241.method1361(var49, (byte) 71);
                                    } else {
                                        label361: for (int var45 = var10.field4160; var45 < class116.field2095; var45++) {
                                            int var46 = class204.field3631[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var10.field4172.length; var47++) {
                                                if (var10.field4172[var47] == var46) {
                                                    class224 var48 = new class224();
                                                    var48.field3895 = var10.field4139;
                                                    var48.field3905 = var10;
                                                    class179.field3241.method1361(var48, (byte) 71);
                                                    break label361;
                                                }
                                            }
                                        }
                                    }
                                    var10.field4160 = class116.field2095;
                                }
                                if (var10.field4128 < class43.field878 && var10.field4245 != null) {
                                    class224 var50 = new class224();
                                    var50.field3905 = var10;
                                    var50.field3895 = var10.field4245;
                                    class179.field3241.method1361(var50, (byte) 71);
                                }
                                if (class75.field1441 > var10.field4128 && var10.field4192 != null) {
                                    class224 var51 = new class224();
                                    var51.field3905 = var10;
                                    var51.field3895 = var10.field4192;
                                    class179.field3241.method1361(var51, (byte) 71);
                                }
                                if (class152.field2754 > var10.field4128 && var10.field4196 != null) {
                                    class224 var52 = new class224();
                                    var52.field3895 = var10.field4196;
                                    var52.field3905 = var10;
                                    class179.field3241.method1361(var52, (byte) 71);
                                }
                                if (var10.field4128 < class142.field2566 && var10.field4134 != null) {
                                    class224 var53 = new class224();
                                    var53.field3905 = var10;
                                    var53.field3895 = var10.field4134;
                                    class179.field3241.method1361(var53, (byte) 71);
                                }
                                if (var10.field4128 < class28.field608 && var10.field4266 != null) {
                                    class224 var54 = new class224();
                                    var54.field3895 = var10.field4266;
                                    var54.field3905 = var10;
                                    class179.field3241.method1361(var54, (byte) 71);
                                }
                                var10.field4128 = class1.field35;
                                if (var10.field4143 != null) {
                                    for (int var55 = 0; var55 < class66.field1274; var55++) {
                                        class224 var56 = new class224();
                                        var56.field3905 = var10;
                                        var56.field3893 = class36.field753[var55];
                                        var56.field3899 = class53.field1075[var55];
                                        var56.field3895 = var10.field4143;
                                        class179.field3241.method1361(var56, (byte) 71);
                                    }
                                }
                            }
                        }
                        if (!var10.field4237) {
                            if (class222.field3860 != null || class151.field2700 != null || class225.field3917) {
                                return;
                            }
                            if ((var10.field4201 >= 0 || var10.field4204 != 0) && class57.field1149 >= var15 && var13 <= class41.field857 && var17 > class57.field1149 && var18 > class41.field857) {
                                if (var10.field4201 < 0) {
                                    class231.field4116 = var10;
                                } else {
                                    class231.field4116 = arg0[var10.field4201];
                                }
                            }
                            if (var10.field4173 == 8 && class57.field1149 >= var15 && var13 <= class41.field857 && var17 > class57.field1149 && var18 > class41.field857) {
                                class79.field1524 = var10;
                            }
                            if (var10.field4216 < var10.field4194) {
                                class37.method280(class41.field857, var10.field4216, var10, -1, var10.field4215 + var12, var10.field4194, class57.field1149, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class16.field362 != null) {
            class36.field748 = 0;
            class193.field3458 = arg0.getX();
            class181.field3276 = arg0.getY();
            class118.field2135 = class217.method1351(83);
            if (arg0.isMetaDown()) {
                class40.field844 = 2;
                class7.field112 = 2;
            } else {
                class40.field844 = 1;
                class7.field112 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field1823++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseDragged(MouseEvent arg0) {
        if (class16.field362 != null) {
            class36.field748 = 0;
            class90.field1659 = arg0.getX();
            class41.field853 = arg0.getY();
        }
        field1837++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final void mouseClicked(MouseEvent arg0) {
        field1824++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method619(int arg0) {
        field1833 = null;
        field1828 = null;
        field1832 = null;
        if (arg0 < 64) {
            method619(-51);
        }
        field1822 = null;
        field1825 = null;
        field1829 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
    public static final boolean method620(int arg0, int arg1) {
        field1835++;
        if (arg1 > -8) {
            return true;
        } else {
            return (arg0 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field1830++;
        if (class16.field362 != null) {
            class36.field748 = 0;
            class7.field112 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jd", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1827++;
        if (class16.field362 != null) {
            class7.field112 = 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class16.field362 != null) {
            class36.field748 = 0;
            class90.field1659 = arg0.getX();
            class41.field853 = arg0.getY();
        }
        field1834++;
    }

    @OriginalMember(owner = "client!jd", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1836++;
    }

    @OriginalMember(owner = "client!jd", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V")
    public final synchronized void mouseExited(MouseEvent arg0) {
        field1826++;
        if (class16.field362 != null) {
            class36.field748 = 0;
            class90.field1659 = -1;
            class41.field853 = -1;
        }
    }
}
