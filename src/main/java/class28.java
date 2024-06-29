import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class28 implements MouseListener, MouseMotionListener {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lv;")
    private static class122 field706 = class55.method425(-94, "Loaded input handler");

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lv;")
    public static class122 field711 = field706;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lv;")
    public static class122 field720 = class55.method425(-76, "\u001c1berpr\u001c1fen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljb;")
    public static class56 field708 = new class56(30);

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Lv;")
    private static class122 field726 = class55.method425(-73, "flash1:");

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field723 = 0;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    private static int field727 = 0;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
    public static int[] field722 = new int[50];

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field725 = 0;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Lv;")
    public static class122 field729 = class55.method425(-109, "@lre@");

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
    public static int[] field732 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field731 = 0;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lv;")
    public static class122 field728 = field726;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "J")
    public static long field733 = 0L;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lld;")
    public static class70 field730 = new class70();

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lrd;")
    public static class106 field715;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lab;")
    public static class3 field724;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILmb;I)Lrc;", line = 4)
    public static final class105 method269(int arg0, int arg1, class74 arg2, int arg3) {
        if (arg3 == -11813) {
            field707++;
            return class21.method226(arg2, arg1, 0, arg0) ? class50.method400(40) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 18)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field705++;
        if (class125.field3039 != null) {
            class80.field2095 = 0;
            class4.field111 = arg0.getX();
            class108.field2675 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 32)
    public static final void method270(int arg0) {
        if (arg0 != -18694) {
            return;
        }
        field721++;
        if (class51.field1313 < 2 && class122.field2990 == 0 && class91.field2334 == 0) {
            return;
        }
        class122 var1;
        if (class122.field2990 == 1 && class51.field1313 < 2) {
            var1 = class59.method454(new class122[] { class100.field2505, class21.field577, class61.field1568, class51.field1311 }, 5176);
        } else if (class91.field2334 == 1 && class51.field1313 < 2) {
            var1 = class59.method454(new class122[] { class21.field557, class21.field577, class70.field1825, class51.field1311 }, 5176);
        } else {
            var1 = class23.field617[class51.field1313 - 1];
        }
        if (class51.field1313 > 2) {
            var1 = class59.method454(new class122[] { var1, class112.field2737, class119.method914(class51.field1313 - 2, 10), class30.field757 }, 5176);
        }
        class103.field2545.method807(var1, 4, 15, 16777215, true, class16.field396 / 1000);
    }

    @OriginalMember(owner = "client!ec", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 63)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        field712++;
        if (class125.field3039 != null) {
            class80.field2095 = 0;
            class4.field111 = arg0.getX();
            class108.field2675 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ec", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 82)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        field710++;
        if (class125.field3039 != null) {
            class80.field2095 = 0;
            class73.field1889 = 0;
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZ)Lv;", line = 125)
    public static final class122 method271(int arg0, int arg1, boolean arg2) {
        field709++;
        if (arg2) {
            field730 = null;
        }
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class74.field1999;
        } else if (var3 < -6) {
            return class122.field2975;
        } else if (var3 < -3) {
            return class47.field1206;
        } else if (var3 < 0) {
            return class83.field2157;
        } else if (var3 > 9) {
            return class75.field2010;
        } else if (var3 > 6) {
            return class24.field661;
        } else if (var3 > 3) {
            return class74.field1978;
        } else if (var3 > 0) {
            return class83.field2172;
        } else {
            return class50.field1276;
        }
    }

    @OriginalMember(owner = "client!ec", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 165)
    public final synchronized void mouseExited(MouseEvent arg0) {
        field718++;
        if (class125.field3039 != null) {
            class80.field2095 = 0;
            class4.field111 = -1;
            class108.field2675 = -1;
        }
    }

    @OriginalMember(owner = "client!ec", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 180)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class125.field3039 != null) {
            class80.field2095 = 0;
            class59.field1520 = arg0.getX();
            class42.field1120 = arg0.getY();
            class33.field813 = System.currentTimeMillis();
            if (arg0.isMetaDown()) {
                class14.field367 = 2;
                class73.field1889 = 2;
            } else {
                class14.field367 = 1;
                class73.field1889 = 1;
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field717++;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 214)
    public static void method272(int arg0) {
        field732 = null;
        field729 = null;
        field726 = null;
        field730 = null;
        field722 = null;
        field706 = null;
        field720 = null;
        field715 = null;
        field708 = null;
        field728 = null;
        field711 = null;
        field724 = null;
        if (arg0 != -25305) {
            method271(0, 20, false);
        }
    }

    @OriginalMember(owner = "client!ec", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 235)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        if (class125.field3039 != null) {
            class80.field2095 = 0;
            class4.field111 = arg0.getX();
            class108.field2675 = arg0.getY();
        }
        field716++;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 250)
    public static final void method273(int arg0) {
        if (class74.field1938 > 0) {
            class74.field1938--;
        }
        field719++;
        if (class18.field417 > 1) {
            class18.field417--;
        }
        if (class73.field1888) {
            class73.field1888 = false;
            class50.method399(0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class22.method235(-15118); var1++) {
        }
        if (class44.field1156 != 30 && class44.field1156 != 35) {
            return;
        }
        if (class61.field1578 && class44.field1156 == 30) {
            class93.field2382 = 0;
            class4.field112 = 0;
            while (class56.method438(-73)) {
            }
            for (int var2 = 0; var2 < class131.field3172.length; var2++) {
                class131.field3172[var2] = false;
            }
        }
        class103.method786((byte) -43, 40, class74.field1935);
        Object var3 = class106.field2636.field1523;
        synchronized (class106.field2636.field1523) {
            if (!class82.field2134) {
                class106.field2636.field1533 = 0;
            } else if (class93.field2382 != 0 || class106.field2636.field1533 >= 40) {
                class36.field928++;
                class74.field1935.method996((byte) 52, 201);
                class74.field1935.method523(255, 0);
                int var4 = 0;
                int var5 = class74.field1935.field1617;
                for (int var6 = 0; var6 < class106.field2636.field1533 && class74.field1935.field1617 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class106.field2636.field1534[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = class106.field2636.field1536[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (class106.field2636.field1534[var6] == -1 && class106.field2636.field1536[var6] == -1) {
                        var8 = -1;
                        var9 = 524287;
                        var7 = -1;
                    }
                    if (class108.field2678 != var8 || class19.field489 != var7) {
                        int var10 = var8 - class108.field2678;
                        int var11 = var7 - class19.field489;
                        class108.field2678 = var8;
                        class19.field489 = var7;
                        if (class5.field132 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var11 += 32;
                            var10 += 32;
                            class74.field1935.method479(1436108328, (var10 << 6) + (class5.field132 << 12) + var11);
                            class5.field132 = 0;
                        } else if (class5.field132 < 8) {
                            class74.field1935.method511(arg0 - 15519, 8388608 - (-(class5.field132 << 19) - var9));
                            class5.field132 = 0;
                        } else {
                            class74.field1935.method509((byte) -50, (class5.field132 << 19) + var9 - 1073741824);
                            class5.field132 = 0;
                        }
                    } else if (class5.field132 < 2047) {
                        class5.field132++;
                    }
                }
                class74.field1935.method488((byte) 100, class74.field1935.field1617 - var5);
                if (class106.field2636.field1533 > var4) {
                    class106.field2636.field1533 -= var4;
                    for (int var12 = 0; var12 < class106.field2636.field1533; var12++) {
                        class106.field2636.field1536[var12] = class106.field2636.field1536[var4 + var12];
                        class106.field2636.field1534[var12] = class106.field2636.field1534[var4 + var12];
                    }
                } else {
                    class106.field2636.field1533 = 0;
                }
            }
        }
        if (class93.field2382 != 0) {
            long var13 = (class19.field497 - class76.field2042) / 50L;
            class45.field1161++;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            int var15 = class34.field865;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            class76.field2042 = class19.field497;
            int var16 = class125.field3049;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            byte var17 = 0;
            int var18 = (int) var13;
            int var19 = var15 * 765 + var16;
            if (class93.field2382 == 2) {
                var17 = 1;
            }
            class74.field1935.method996((byte) 67, 173);
            class74.field1935.method518(false, (var17 << 19) + (var18 << 20) + var19);
        }
        if (field727 > 0) {
            field727--;
        }
        if (class131.field3172[96] || class131.field3172[97] || class131.field3172[98] || class131.field3172[99]) {
            class122.field2983 = true;
        }
        if (class122.field2983 && field727 <= 0) {
            class32.field790++;
            class122.field2983 = false;
            field727 = 20;
            class74.field1935.method996((byte) 79, 95);
            class74.field1935.method519((byte) 68, class63.field1598);
            class74.field1935.method479(1436108328, class83.field2173);
        }
        if (arg0 != 5576) {
            method272(-30);
        }
        if (class55.field1428 && !class94.field2409) {
            class94.field2409 = true;
            class74.field1935.method996((byte) 61, 141);
            class74.field1935.method523(255, 1);
            class118.field2849++;
        }
        if (!class55.field1428 && class94.field2409) {
            class118.field2849++;
            class94.field2409 = false;
            class74.field1935.method996((byte) 118, 141);
            class74.field1935.method523(255, 0);
        }
        class73.method596(64);
        if (class44.field1156 != 30 && class44.field1156 != 35) {
            return;
        }
        class24.method254((byte) -44);
        class122.method963((byte) -107);
        class80.field2088++;
        if (class80.field2088 > 750) {
            class50.method399(0);
            return;
        }
        class46.method381(-1);
        class18.method171(-4969);
        class7.method82(true);
        class64.field1663++;
        if (client.field459 != 0) {
            class47.field1215 += 20;
            if (class47.field1215 >= 400) {
                client.field459 = 0;
            }
        }
        if (class47.field1218 != 0) {
            field731++;
            if (field731 >= 15) {
                if (class47.field1218 == 3) {
                    class103.field2558 = true;
                }
                if (class47.field1218 == 2) {
                    class62.field1588 = true;
                }
                class47.field1218 = 0;
            }
        }
        if (class91.field2329 != 0) {
            class49.field1252++;
            if (class7.field171 > class112.field2738 + 5 || class7.field171 < class112.field2738 - 5 || class72.field1855 > class122.field2988 + 5 || class72.field1855 < class122.field2988 - 5) {
                class119.field2880 = true;
            }
            if (class4.field112 == 0) {
                if (class91.field2329 == 2) {
                    class62.field1588 = true;
                }
                if (class91.field2329 == 3) {
                    class103.field2558 = true;
                }
                class91.field2329 = 0;
                if (class119.field2880 && class49.field1252 >= 5) {
                    class69.field1823 = -1;
                    class42.method368(97);
                    if (class95.field2436 == class69.field1823 && class89.field2277 != class112.field2746) {
                        class59.field1530++;
                        class36 var20 = class4.method65(class95.field2436, false);
                        byte var21 = 0;
                        if (class52.field1346 == 1 && var20.field932 == 206) {
                            var21 = 1;
                        }
                        if (var20.field897[class112.field2746] <= 0) {
                            var21 = 0;
                        }
                        if (var20.field878) {
                            int var22 = class112.field2746;
                            int var23 = class89.field2277;
                            var20.field897[var22] = var20.field897[var23];
                            var20.field942[var22] = var20.field942[var23];
                            var20.field897[var23] = -1;
                            var20.field942[var23] = 0;
                        } else if (var21 == 1) {
                            int var24 = class89.field2277;
                            int var25 = class112.field2746;
                            while (var24 != var25) {
                                if (var25 < var24) {
                                    var20.method315(arg0 ^ 0xFFFFEA0F, var24, var24 - 1);
                                    var24--;
                                } else if (var24 < var25) {
                                    var20.method315(-37, var24, var24 + 1);
                                    var24++;
                                }
                            }
                        } else {
                            var20.method315(-87, class89.field2277, class112.field2746);
                        }
                        class74.field1935.method996((byte) 98, 235);
                        class74.field1935.method525(class112.field2746, true);
                        class74.field1935.method525(class89.field2277, true);
                        class74.field1935.method523(255, var21);
                        class74.field1935.method509((byte) -18, class95.field2436);
                    }
                } else if ((class4.field110 == 1 || class82.method669(arg0 - 5656, class51.field1313 - 1)) && class51.field1313 > 2) {
                    class14.method125((byte) 31);
                } else if (class51.field1313 > 0) {
                    class61.method471(-116, class51.field1313 - 1);
                }
                field731 = 10;
                class93.field2382 = 0;
            }
        }
        if (class1.field17 != -1) {
            int var26 = class1.field17;
            int var27 = class1.field24;
            boolean var28 = class95.method751(0, true, 0, 0, class70.field1828.field287[0], 0, var26, 0, 127, var27, class70.field1828.field307[0], 0);
            class1.field17 = -1;
            if (var28) {
                class56.field1480 = class34.field865;
                class47.field1215 = 0;
                class42.field1061 = class125.field3049;
                client.field459 = 1;
            }
        }
        if (class93.field2382 == 1 && class74.field1995 != null) {
            class93.field2382 = 0;
            class103.field2558 = true;
            class74.field1995 = null;
        }
        class30.method285(-1);
        if (class108.field2676 == -1) {
            class88.method693((byte) 46);
            class47.method389((byte) 92);
            class30.method279(1);
        }
        if (class4.field112 == 1 || class93.field2382 == 1) {
            class94.field2429++;
        }
        if (class109.field2700 == -1 && class61.field1563 == -1 && class49.field1250 == -1) {
            if (class119.field2900 > 0) {
                class119.field2900--;
            }
        } else if (class115.field2802 > class119.field2900) {
            class119.field2900++;
            if (class119.field2900 == class115.field2802) {
                if (class109.field2700 != -1) {
                    class103.field2558 = true;
                }
                if (class61.field1563 != -1) {
                    class62.field1588 = true;
                }
            }
        }
        class41.method351(100);
        if (class74.field1986) {
            class81.method668((byte) -109);
        }
        for (int var29 = 0; var29 < 5; var29++) {
            int var10002 = class74.field1998[var29]++;
        }
        class131.method1017(false);
        int var30 = class80.method663((byte) -110);
        int var31 = class55.method421((byte) -94);
        if (var30 > 4500 && var31 > 4500) {
            class74.field1938 = 250;
            class94.method747(4000, -1);
            class74.field1935.method996((byte) 68, 88);
            class30.field766++;
        }
        class125.field3041++;
        if (class125.field3041 > 500) {
            class125.field3041 = 0;
            int var32 = (int) (Math.random() * 8.0D);
            if ((var32 & 0x1) == 1) {
                class49.field1249 += class118.field2852;
            }
            if ((var32 & 0x2) == 2) {
                class60.field1554 += class51.field1316;
            }
            if ((var32 & 0x4) == 4) {
                class44.field1159 += class44.field1149;
            }
        }
        if (class49.field1249 < -50) {
            class118.field2852 = 2;
        }
        class19.field490++;
        if (class44.field1159 < -40) {
            class44.field1149 = 1;
        }
        if (class49.field1249 > 50) {
            class118.field2852 = -2;
        }
        if (class44.field1159 > 40) {
            class44.field1149 = -1;
        }
        if (class19.field490 > 500) {
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x2) == 2) {
                class52.field1335 += class102.field2532;
            }
            class19.field490 = 0;
            if ((var33 & 0x1) == 1) {
                class119.field2897 += class106.field2619;
            }
        }
        if (class52.field1335 < -20) {
            class102.field2532 = 1;
        }
        class88.field2236++;
        if (class52.field1335 > 10) {
            class102.field2532 = -1;
        }
        if (class119.field2897 < -60) {
            class106.field2619 = 2;
        }
        if (class60.field1554 < -55) {
            class51.field1316 = 2;
        }
        if (class60.field1554 > 55) {
            class51.field1316 = -2;
        }
        if (class119.field2897 > 60) {
            class106.field2619 = -2;
        }
        if (class88.field2236 > 50) {
            class74.field1935.method996((byte) 69, 6);
            class23.field635++;
        }
        try {
            if (class66.field1686 != null && class74.field1935.field1617 > 0) {
                class66.field1686.method594((byte) 114, 0, class74.field1935.field1679, class74.field1935.field1617);
                class74.field1935.field1617 = 0;
                class88.field2236 = 0;
            }
        } catch (IOException var34) {
            class50.method399(0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 829)
    public final void mouseClicked(MouseEvent arg0) {
        field713++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 840)
    public static final void method274(byte arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        field714++;
        if (arg0 != 5) {
            field728 = null;
        }
        System.exit(1);
    }
}
