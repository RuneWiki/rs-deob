import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Date;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 extends class34 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lrc;")
    public static class105 field1470 = class43.method374("rot:", 0);

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field1476 = 0;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Lrc;")
    private static class105 field1478 = class43.method374("Loading wordpack )2 ", 0);

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Lrc;")
    public static class105 field1481 = field1478;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Lrc;")
    private static class105 field1483 = class43.method374("Login", 0);

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field1485 = 0;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "Lrc;")
    public static class105 field1491 = field1483;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Lpe;")
    public static class95 field1472 = new class95(5000);

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field1494 = 0;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "Lle;")
    public static class71 field1493 = new class71(50);

    @OriginalMember(owner = "client!l", name = "W", descriptor = "Lrc;")
    public static class105 field1496 = class43.method374("Bitte warten Sie eine Minute", 0);

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "Lrc;")
    public static class105 field1499 = class43.method374("Update)2Liste geladen)3", 0);

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "[I")
    public static int[] field1500 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 3, 0, 2, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 6, 2, -2, 0, 6, 0, 0, 0, -2, 0, 0, 0, 0, -2, 0, 2, 0, -2, 0, 0, 0, 2, 1, 0, 4, 10, 0, 0, 0, 0, 0, 0, 6, -2, 1, 0, 0, 0, 0, 3, 4, 0, 2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 6, 6, 0, -1, 2, 4, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, -1, 0, 0, 0, 4, 0, 1, 0, 0, 3, 0, -1, 3, -1, 0, 0, 4, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 8, 6, 0, 0, 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 4, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 5, 0, 2, 5, 0, 0, 0, 6, 0, 3, 0, 0, 5, 7, 0, 0, 14, 0, 0, 0, 0, 6, 0, 0, 4, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 2, 0, 0, -2, 6, 0, 0, 10, 2, 0, 8, 0, 6, 5, 0, 0 };

    @OriginalMember(owner = "client!l", name = "X", descriptor = "Lrc;")
    public static class105 field1497 = class43.method374("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3", 0);

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "Lmd;")
    public static class76 field1501;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1482;

    @OriginalMember(owner = "client!l", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1487;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "[I")
    public static int[] field1495;

    @OriginalMember(owner = "client!l", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 9)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1490;
        if (this.field1487 == arg0) {
            this.field1487 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 20)
    public final void method321(int arg0, int arg1, int arg2, Component arg3) {
        super.field789 = new int[arg0 * arg1 - -1];
        super.field805 = arg1;
        super.field802 = arg0;
        this.field1482 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field804 = arg3.createImage(this);
        this.method557((byte) 110);
        ++field1489;
        if (arg2 != 50) {
            field1493 = null;
        }
        arg3.prepareImage(super.field804, this);
        this.method557((byte) 122);
        arg3.prepareImage(super.field804, this);
        this.method557((byte) 110);
        arg3.prepareImage(super.field804, this);
        this.method323(arg2 ^ 50);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 42)
    private final synchronized void method557(byte arg0) {
        ++field1474;
        if (this.field1487 != null) {
            int var2 = -39 % ((36 - arg0) / 61);
            this.field1487.setPixels(0, 0, super.field805, super.field802, this.field1482, super.field789, 0, super.field805);
            this.field1487.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!l", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 67)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1487 = arg0;
        arg0.setDimensions(super.field805, super.field802);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1482);
        ++field1479;
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!l", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 80)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1471;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[Ljava/lang/Object;Lte;BII)V", line = 105)
    public static final void method558(int arg0, Object[] arg1, class119 arg2, byte arg3, int arg4, int arg5) {
        class130 var6 = class81.method693((Integer) arg1[0], 5);
        ++field1484;
        int var7 = 0;
        int var8 = 0;
        if (arg3 < -70) {
            int var9 = -1;
            int[] var10 = var6.field3159;
            int[] var11 = var6.field3155;
            boolean var12 = true;
            try {
                class133.field3223 = new class105[var6.field3149];
                class57.field1196 = new int[var6.field3148];
                int var13 = 0;
                int var14 = 0;
                for (int var15 = 1; arg1.length > var15; ++var15) {
                    if (!(arg1[var15] instanceof Integer)) {
                        if (arg1[var15] instanceof class105) {
                            class133.field3223[var13++] = (class105) arg1[var15];
                        }
                    } else {
                        int var16 = (Integer) arg1[var15];
                        if (var16 == -2147483647) {
                            var16 = arg5;
                        }
                        if (var16 == -2147483646) {
                            var16 = arg0;
                        }
                        if (~var16 == 2147483644) {
                            var16 = arg2.field2867;
                        }
                        if (~var16 == 2147483643) {
                            var16 = arg4;
                        }
                        class57.field1196[var14++] = var16;
                    }
                }
                while (true) {
                    int var17;
                    while (true) {
                        ++var9;
                        var17 = var10[var9];
                        if (var17 >= 100) {
                            break;
                        }
                        if (var17 == 0) {
                            class57.field1184[var7++] = var11[var9];
                        } else if (~var17 == -2) {
                            int var18 = var11[var9];
                            class57.field1184[var7++] = class16.field337[var18];
                        } else if (~var17 == -3) {
                            int var19 = var11[var9];
                            --var7;
                            class16.field337[var19] = class57.field1184[var7];
                        } else if (~var17 == -4) {
                            class51.field1067[var8++] = var6.field3166[var9];
                        } else if (var17 == 6) {
                            var9 += var11[var9];
                        } else if (var17 == 7) {
                            var7 -= 2;
                            if (class57.field1184[var7 - -1] != class57.field1184[var7]) {
                                var9 += var11[var9];
                            }
                        } else if (var17 == 8) {
                            var7 -= 2;
                            if (class57.field1184[var7 - -1] == class57.field1184[var7]) {
                                var9 += var11[var9];
                            }
                        } else if (~var17 == -10) {
                            var7 -= 2;
                            if (class57.field1184[var7 - -1] > class57.field1184[var7]) {
                                var9 += var11[var9];
                            }
                        } else if (~var17 == -11) {
                            var7 -= 2;
                            if (class57.field1184[var7 + 1] < class57.field1184[var7]) {
                                var9 += var11[var9];
                            }
                        } else if (~var17 == -22) {
                            if (~class116.field2694 == -1) {
                                return;
                            }
                            class28 var20 = class73.field1607[--class116.field2694];
                            var9 = var20.field621;
                            class57.field1196 = var20.field640;
                            var6 = var20.field635;
                            var10 = var6.field3159;
                            var11 = var6.field3155;
                            class133.field3223 = var20.field624;
                        } else if (~var17 == -26) {
                            int var21 = var11[var9];
                            class57.field1184[var7++] = class98.method805((byte) 114, var21);
                        } else if (~var17 == -28) {
                            int var22 = var11[var9];
                            --var7;
                            class136.method1068(-77, class57.field1184[var7], var22);
                        } else if (~var17 == -32) {
                            var7 -= 2;
                            if (class57.field1184[var7] <= class57.field1184[var7 + 1]) {
                                var9 += var11[var9];
                            }
                        } else if (~var17 == -33) {
                            var7 -= 2;
                            if (~class57.field1184[var7 + 1] >= ~class57.field1184[var7]) {
                                var9 += var11[var9];
                            }
                        } else if (var17 == 33) {
                            class57.field1184[var7++] = class57.field1196[var11[var9]];
                        } else {
                            int var10001;
                            if (var17 == 34) {
                                var10001 = var11[var9];
                                --var7;
                                class57.field1196[var10001] = class57.field1184[var7];
                            } else if (var17 == 35) {
                                class51.field1067[var8++] = class133.field3223[var11[var9]];
                            } else if (var17 == 36) {
                                var10001 = var11[var9];
                                --var8;
                                class133.field3223[var10001] = class51.field1067[var8];
                            } else if (~var17 == -38) {
                                int var23 = var11[var9];
                                var8 -= var23;
                                class105 var24 = class3.method36(var8, 122, class51.field1067, var23);
                                class51.field1067[var8++] = var24;
                            } else if (~var17 == -39) {
                                --var7;
                            } else if (var17 == 39) {
                                --var8;
                            } else if (var17 != 40) {
                                if (~var17 == -43) {
                                    class57.field1184[var7++] = class45.field1025[var11[var9]];
                                } else {
                                    if (~var17 != -44) {
                                        break;
                                    }
                                    var10001 = var11[var9];
                                    --var7;
                                    class45.field1025[var10001] = class57.field1184[var7];
                                }
                            } else {
                                int var25 = var11[var9];
                                class130 var26 = class81.method693(var25, 5);
                                int[] var27 = new int[var26.field3148];
                                class105[] var28 = new class105[var26.field3149];
                                for (int var29 = 0; var26.field3170 > var29; ++var29) {
                                    var27[var29] = class57.field1184[var7 + var29 - var26.field3170];
                                }
                                for (int var30 = 0; var26.field3167 > var30; ++var30) {
                                    var28[var30] = class51.field1067[-var26.field3167 + var8 + var30];
                                }
                                var8 -= var26.field3167;
                                var7 -= var26.field3170;
                                class28 var31 = new class28();
                                var31.field635 = var6;
                                var31.field624 = class133.field3223;
                                var6 = var26;
                                var31.field640 = class57.field1196;
                                var31.field621 = var9;
                                class73.field1607[class116.field2694++] = var31;
                                var10 = var26.field3159;
                                class57.field1196 = var27;
                                var11 = var26.field3155;
                                var9 = -1;
                                class133.field3223 = var28;
                            }
                        }
                    }
                    boolean var32;
                    if (var11[var9] != 1) {
                        var32 = false;
                    } else {
                        var32 = true;
                    }
                    if (~var17 <= -1001) {
                        if ((~var17 > -1001 || var17 >= 1100) && (~var17 > -2001 || ~var17 <= -2101)) {
                            if (var17 >= 1100 && var17 < 1200 || ~var17 <= -2101 && ~var17 > -2201) {
                                class119 var141;
                                if (~var17 <= -2001) {
                                    var17 -= 1000;
                                    --var7;
                                    var141 = class119.method964(65535, class57.field1184[var7]);
                                } else {
                                    var141 = var32 ? class65.field1459 : class34.field790;
                                }
                                class116.method942(1, var141);
                                if (var17 == 1100) {
                                    var7 -= 2;
                                    var141.field2794 = class57.field1184[var7];
                                    var141.field2838 = class57.field1184[var7 + 1];
                                } else if (~var17 == -1102) {
                                    --var7;
                                    var141.field2817 = class57.field1184[var7];
                                } else if (var17 == 1102) {
                                    --var7;
                                    var141.field2853 = class57.field1184[var7] == 1;
                                } else if (~var17 == -1104) {
                                    --var7;
                                    var141.field2851 = class57.field1184[var7];
                                } else if (~var17 == -1105) {
                                    --var7;
                                    var141.field2827 = class57.field1184[var7];
                                } else if (~var17 == -1106) {
                                    --var7;
                                    var141.field2791 = class57.field1184[var7];
                                } else if (~var17 == -1107) {
                                    --var7;
                                    var141.field2790 = class57.field1184[var7];
                                } else if (~var17 == -1108) {
                                    --var7;
                                    var141.field2771 = class57.field1184[var7] == 1;
                                } else if (~var17 == -1109) {
                                    var141.field2848 = 1;
                                    --var7;
                                    var141.field2884 = class57.field1184[var7];
                                } else if (var17 == 1109) {
                                    var7 -= 6;
                                    var141.field2856 = class57.field1184[var7];
                                    var141.field2872 = class57.field1184[var7 - -1];
                                    var141.field2823 = class57.field1184[var7 + 2];
                                    var141.field2809 = class57.field1184[var7 + 3];
                                    var141.field2802 = class57.field1184[var7 - -4];
                                    var141.field2869 = class57.field1184[var7 + 5];
                                } else if (~var17 == -1111) {
                                    --var7;
                                    var141.field2844 = class57.field1184[var7];
                                } else if (~var17 == -1112) {
                                    --var7;
                                    var141.field2796 = ~class57.field1184[var7] == -2;
                                } else if (~var17 == -1113) {
                                    --var8;
                                    var141.field2864 = class51.field1067[var8];
                                } else if (~var17 == -1114) {
                                    --var7;
                                    var141.field2784 = class57.field1184[var7];
                                } else if (var17 == 1114) {
                                    var7 -= 3;
                                    var141.field2774 = class57.field1184[var7];
                                    var141.field2786 = class57.field1184[var7 - -1];
                                    var141.field2850 = class57.field1184[var7 + 2];
                                } else if (var17 == 1115) {
                                    --var7;
                                    var141.field2829 = class57.field1184[var7] == 1;
                                } else if (var17 == 1116) {
                                    --var7;
                                    var141.field2803 = class57.field1184[var7];
                                } else {
                                    if (var17 != 1117) {
                                        break;
                                    }
                                    --var7;
                                    var141.field2820 = class57.field1184[var7];
                                }
                            } else if (var17 >= 1200 && var17 < 1300 || var17 >= 2200 && ~var17 > -2301) {
                                class119 var137;
                                if (~var17 > -2001) {
                                    var137 = !var32 ? class34.field790 : class65.field1459;
                                } else {
                                    var17 -= 1000;
                                    --var7;
                                    var137 = class119.method964(65535, class57.field1184[var7]);
                                }
                                class116.method942(1, var137);
                                if (var17 == 1200) {
                                    var7 -= 2;
                                    int var138 = class57.field1184[var7 - -1];
                                    int var139 = class57.field1184[var7];
                                    var137.field2882 = var138;
                                    var137.field2779 = var139;
                                } else if (~var17 == -1202) {
                                    var137.field2848 = 2;
                                    --var7;
                                    var137.field2884 = class57.field1184[var7];
                                } else if (~var17 == -1203) {
                                    var137.field2848 = 3;
                                    var137.field2884 = class119.field2842.field296.method145(-122);
                                } else {
                                    if (var17 != 1203) {
                                        break;
                                    }
                                    class119 var140 = !var32 ? class65.field1459 : class34.field790;
                                    var137.field2840 = var140.field2867;
                                }
                            } else if (~var17 <= -1301 && ~var17 > -1401 || ~var17 <= -2301 && var17 < 2400) {
                                class119 var34;
                                if (~var17 > -2001) {
                                    var34 = var32 ? class65.field1459 : class34.field790;
                                } else {
                                    var17 -= 1000;
                                    --var7;
                                    var34 = class119.method964(65535, class57.field1184[var7]);
                                }
                                if ((~var17 > -1301 || ~var17 < -1310) && (~var17 > -1315 || ~var17 < -1319) && ~var17 != -1321) {
                                    if (~var17 != -1311) {
                                        if (var17 == 1311) {
                                            --var7;
                                            var34.field2840 = class57.field1184[var7];
                                        } else if (var17 == 1312) {
                                            --var7;
                                            var34.field2825 = ~class57.field1184[var7] == -2;
                                        } else if (var17 == 1313) {
                                            --var7;
                                            var34.field2816 = class57.field1184[var7];
                                        } else {
                                            if (var17 != 1319) {
                                                break;
                                            }
                                            --var7;
                                            var34.field2781 = class57.field1184[var7];
                                        }
                                    } else {
                                        --var7;
                                        int var38 = class57.field1184[var7] + -1;
                                        if (~var38 <= -1 && ~var38 >= -10) {
                                            if (var34.field2783 == null || ~var38 <= ~var34.field2783.length) {
                                                class105[] var39 = new class105[var38 + 1];
                                                if (var34.field2783 != null) {
                                                    for (int var40 = 0; ~var40 > ~var34.field2783.length; ++var40) {
                                                        var39[var40] = var34.field2783[var40];
                                                    }
                                                }
                                                var34.field2783 = var39;
                                            }
                                            --var8;
                                            class105 var41 = class51.field1067[var8];
                                            if (var41.method863(-124) == 0) {
                                                var41 = null;
                                            }
                                            var34.field2783[var38] = var41;
                                        } else {
                                            --var8;
                                        }
                                    }
                                } else {
                                    --var8;
                                    class105 var35 = class51.field1067[var8];
                                    Object[] var36 = new Object[var35.method863(-126) + 1];
                                    for (int var37 = var36.length - 1; var37 >= 1; --var37) {
                                        if (var35.method837(var37 + -1, (byte) 59) == 115) {
                                            --var8;
                                            var36[var37] = class51.field1067[var8];
                                        } else {
                                            --var7;
                                            var36[var37] = new Integer(class57.field1184[var7]);
                                        }
                                    }
                                    --var7;
                                    var36[0] = new Integer(class57.field1184[var7]);
                                    if (~var17 == -1304) {
                                        var34.field2868 = var36;
                                    }
                                    if (~var17 == -1305) {
                                        var34.field2860 = var36;
                                    }
                                    if (var17 == 1317) {
                                        var34.field2861 = var36;
                                    }
                                    if (var17 == 1301) {
                                        var34.field2773 = var36;
                                    }
                                    if (var17 == 1305) {
                                        var34.field2789 = var36;
                                    }
                                    if (~var17 == -1317) {
                                        var34.field2845 = var36;
                                    }
                                    if (~var17 == -1319) {
                                        var34.field2836 = var36;
                                    }
                                    if (~var17 == -1309) {
                                        var34.field2876 = var36;
                                    }
                                    if (~var17 == -1303) {
                                        var34.field2819 = var36;
                                    }
                                    if (var17 == 1306) {
                                        var34.field2818 = var36;
                                    }
                                    if (var17 == 1309) {
                                        var34.field2778 = var36;
                                    }
                                    if (~var17 == -1321) {
                                        var34.field2839 = var36;
                                    }
                                    if (~var17 == -1316) {
                                        var34.field2863 = var36;
                                    }
                                }
                            } else if (~var17 > -1501) {
                                if (~var17 == -1401) {
                                    var7 -= 2;
                                    int var42 = class57.field1184[var7];
                                    int var43 = class57.field1184[var7 + 1];
                                    class119 var44 = class119.method964(65535, var42);
                                    if (var44.field2831 != null && var43 < var44.field2831.length && var44.field2831[var43] != null) {
                                        class57.field1184[var7++] = 1;
                                        if (var32) {
                                            class65.field1459 = var44.field2831[var43];
                                        } else {
                                            class34.field790 = var44.field2831[var43];
                                        }
                                    } else {
                                        class57.field1184[var7++] = 0;
                                    }
                                } else if (var17 == 1401) {
                                    var7 -= 3;
                                    int var45 = class57.field1184[var7];
                                    int var46 = class57.field1184[var7 + 2];
                                    int var47 = class57.field1184[var7 + 1];
                                    class119 var48 = class80.method688(true, -68, class14.field282[var45], 0, var47, 0, -1, var46);
                                    if (var48 == null) {
                                        class57.field1184[var7++] = 0;
                                    } else {
                                        class57.field1184[var7++] = 1;
                                        if (var32) {
                                            class65.field1459 = var48;
                                        } else {
                                            class34.field790 = var48;
                                        }
                                    }
                                } else {
                                    if (var17 != 1402) {
                                        break;
                                    }
                                    var7 -= 3;
                                    class119 var49 = class119.method964(65535, class57.field1184[var7]);
                                    int var50 = class57.field1184[var7 + 2];
                                    int var51 = class57.field1184[var7 + 1];
                                    class119 var52 = class80.method688(true, -91, var49.field2831, var49.field2838, var51, var49.field2794, var49.field2867, var50);
                                    if (var52 != null) {
                                        class57.field1184[var7++] = 1;
                                        if (var32) {
                                            class65.field1459 = var52;
                                        } else {
                                            class34.field790 = var52;
                                        }
                                    } else {
                                        class57.field1184[var7++] = 0;
                                    }
                                }
                            } else if (~var17 <= -1601) {
                                if (var17 < 1700) {
                                    class119 var53 = !var32 ? class34.field790 : class65.field1459;
                                    if (var17 == 1600) {
                                        class57.field1184[var7++] = var53.field2794;
                                    } else if (var17 == 1601) {
                                        class57.field1184[var7++] = var53.field2838;
                                    } else {
                                        if (var17 != 1602) {
                                            break;
                                        }
                                        class51.field1067[var8++] = var53.field2864;
                                    }
                                } else if (var17 >= 1800) {
                                    if (~var17 > -2501) {
                                        if (var17 == 2401) {
                                            var7 -= 3;
                                            int var54 = class57.field1184[var7 + 1];
                                            int var55 = class57.field1184[var7];
                                            int var56 = class57.field1184[var7 - -2];
                                            class119 var57 = class80.method688(false, -76, class14.field282[var55], 0, var54, 0, -1, var56);
                                            if (var57 == null) {
                                                class57.field1184[var7++] = -1;
                                            } else {
                                                class57.field1184[var7++] = var57.field2867;
                                            }
                                        } else {
                                            if (~var17 != -2403) {
                                                break;
                                            }
                                            var7 -= 3;
                                            class119 var58 = class119.method964(65535, class57.field1184[var7]);
                                            int var59 = class57.field1184[var7 + 1];
                                            int var60 = class57.field1184[var7 - -2];
                                            class119 var61 = class80.method688(false, -102, class14.field282[var58.field2867 >> 16], var58.field2838, var59, var58.field2794, var58.field2867, var60);
                                            if (var61 != null) {
                                                class57.field1184[var7++] = var61.field2867;
                                            } else {
                                                class57.field1184[var7++] = -1;
                                            }
                                        }
                                    } else if (~var17 > -2601) {
                                        --var7;
                                        class119 var62 = class119.method964(65535, class57.field1184[var7]);
                                        if (var17 == 2500) {
                                            class57.field1184[var7++] = var62.field2810;
                                        } else if (var17 == 2501) {
                                            class57.field1184[var7++] = var62.field2862;
                                        } else if (~var17 == -2503) {
                                            class57.field1184[var7++] = var62.field2855;
                                        } else if (var17 == 2503) {
                                            class57.field1184[var7++] = var62.field2787;
                                        } else if (var17 == 2504) {
                                            class57.field1184[var7++] = !var62.field2815 ? 0 : 1;
                                        } else {
                                            if (~var17 != -2506) {
                                                break;
                                            }
                                            class57.field1184[var7++] = var62.field2797;
                                        }
                                    } else if (~var17 > -2701) {
                                        --var7;
                                        class119 var63 = class119.method964(65535, class57.field1184[var7]);
                                        if (~var17 == -2601) {
                                            class57.field1184[var7++] = var63.field2794;
                                        } else if (var17 == 2601) {
                                            class57.field1184[var7++] = var63.field2838;
                                        } else {
                                            if (var17 != 2602) {
                                                break;
                                            }
                                            class51.field1067[var8++] = var63.field2864;
                                        }
                                    } else if (~var17 <= -2801) {
                                        if (~var17 <= -3101) {
                                            if (var17 >= 3200) {
                                                if (~var17 > -3301) {
                                                    if (var17 == 3200) {
                                                        var7 -= 3;
                                                        class121.method976(class57.field1184[var7], class57.field1184[var7 + 2], class57.field1184[var7 + 1], (byte) 114);
                                                    } else if (var17 == 3201) {
                                                        --var7;
                                                        class90.method744(20428, class57.field1184[var7]);
                                                    } else {
                                                        if (~var17 != -3203) {
                                                            break;
                                                        }
                                                        var7 -= 2;
                                                        class127.method1022(class57.field1184[var7 - -1], class57.field1184[var7], false);
                                                    }
                                                } else if (var17 < 3400) {
                                                    if (var17 == 3300) {
                                                        class57.field1184[var7++] = class104.field2351;
                                                    } else if (~var17 == -3302) {
                                                        var7 -= 2;
                                                        int var64 = class57.field1184[var7 + 1];
                                                        int var65 = class57.field1184[var7];
                                                        class57.field1184[var7++] = class88.method723(false, var65, var64);
                                                    } else {
                                                        if (~var17 != -3303) {
                                                            break;
                                                        }
                                                        var7 -= 2;
                                                        int var66 = class57.field1184[var7];
                                                        int var67 = class57.field1184[var7 - -1];
                                                        class57.field1184[var7++] = class125.method1014(var67, var66, -480);
                                                    }
                                                } else if (~var17 <= -4101) {
                                                    if (var17 < 4200) {
                                                        if (~var17 == -4101) {
                                                            --var8;
                                                            class105 var68 = class51.field1067[var8];
                                                            --var7;
                                                            int var69 = class57.field1184[var7];
                                                            class51.field1067[var8++] = class108.method878(new class105[] { var68, class75.method637(var69, 8241) }, 2867);
                                                        } else if (var17 == 4101) {
                                                            var8 -= 2;
                                                            class105 var70 = class51.field1067[var8];
                                                            class105 var71 = class51.field1067[var8 + 1];
                                                            class51.field1067[var8++] = class108.method878(new class105[] { var70, var71 }, 2867);
                                                        } else if (~var17 == -4103) {
                                                            --var8;
                                                            class105 var72 = class51.field1067[var8];
                                                            --var7;
                                                            int var73 = class57.field1184[var7];
                                                            class51.field1067[var8++] = class108.method878(new class105[] { var72, class129.method1035(-2, true, var73) }, 2867);
                                                        } else if (var17 == 4103) {
                                                            --var8;
                                                            class105 var74 = class51.field1067[var8];
                                                            class51.field1067[var8++] = var74.method858((byte) -27);
                                                        } else if (~var17 == -4105) {
                                                            --var7;
                                                            int var75 = class57.field1184[var7];
                                                            long var76 = (long) var75 * 86400000L + 1014768000000L;
                                                            class17.field367.setTime(new Date(var76));
                                                            int var78 = class17.field367.get(5);
                                                            int var79 = class17.field367.get(2);
                                                            int var80 = class17.field367.get(1);
                                                            class51.field1067[var8++] = class108.method878(new class105[] { class75.method637(var78, 8241), class1.field11, class127.field3096[var79], class1.field11, class75.method637(var80, 8241) }, 2867);
                                                        } else if (var17 == 4105) {
                                                            var8 -= 2;
                                                            class105 var81 = class51.field1067[var8];
                                                            class105 var82 = class51.field1067[var8 - -1];
                                                            if (class119.field2842.field296 != null && class119.field2842.field296.field228) {
                                                                class51.field1067[var8++] = var82;
                                                            } else {
                                                                class51.field1067[var8++] = var81;
                                                            }
                                                        } else if (~var17 == -4107) {
                                                            --var7;
                                                            int var83 = class57.field1184[var7];
                                                            class51.field1067[var8++] = class75.method637(var83, 8241);
                                                        } else {
                                                            if (var17 != 4107) {
                                                                break;
                                                            }
                                                            var8 -= 2;
                                                            class57.field1184[var7++] = class51.field1067[var8].method856(1, class51.field1067[var8 + 1]);
                                                        }
                                                    } else {
                                                        if (var17 >= 4300) {
                                                            break;
                                                        }
                                                        if (var17 == 4200) {
                                                            --var7;
                                                            int var84 = class57.field1184[var7];
                                                            class51.field1067[var8++] = class75.method636(var84, 0).field706;
                                                        } else if (~var17 == -4202) {
                                                            var7 -= 2;
                                                            int var85 = class57.field1184[var7];
                                                            int var86 = class57.field1184[var7 - -1];
                                                            class31 var87 = class75.method636(var85, 0);
                                                            if (var86 >= 1 && var86 <= 5 && var87.field749[var86 + -1] != null) {
                                                                class51.field1067[var8++] = var87.field749[var86 + -1];
                                                            } else {
                                                                class51.field1067[var8++] = class78.field1766;
                                                            }
                                                        } else if (~var17 == -4203) {
                                                            var7 -= 2;
                                                            int var88 = class57.field1184[var7 - -1];
                                                            int var89 = class57.field1184[var7];
                                                            class31 var90 = class75.method636(var89, 0);
                                                            if (~var88 <= -2 && var88 <= 5 && var90.field710[var88 + -1] != null) {
                                                                class51.field1067[var8++] = var90.field710[var88 + -1];
                                                            } else {
                                                                class51.field1067[var8++] = class78.field1766;
                                                            }
                                                        } else if (~var17 == -4204) {
                                                            --var7;
                                                            int var91 = class57.field1184[var7];
                                                            class57.field1184[var7++] = class75.method636(var91, 0).field699;
                                                        } else if (var17 == 4204) {
                                                            --var7;
                                                            int var92 = class57.field1184[var7];
                                                            class57.field1184[var7++] = class75.method636(var92, 0).field725 == 1 ? 1 : 0;
                                                        } else if (~var17 == -4206) {
                                                            --var7;
                                                            int var93 = class57.field1184[var7];
                                                            class31 var94 = class75.method636(var93, 0);
                                                            if (~var94.field736 == 0 && ~var94.field722 <= -1) {
                                                                class57.field1184[var7++] = var94.field722;
                                                            } else {
                                                                class57.field1184[var7++] = var93;
                                                            }
                                                        } else if (var17 == 4206) {
                                                            --var7;
                                                            int var95 = class57.field1184[var7];
                                                            class31 var96 = class75.method636(var95, 0);
                                                            if (var96.field736 >= 0 && ~var96.field722 <= -1) {
                                                                class57.field1184[var7++] = var96.field722;
                                                            } else {
                                                                class57.field1184[var7++] = var95;
                                                            }
                                                        } else {
                                                            if (var17 != 4207) {
                                                                break;
                                                            }
                                                            --var7;
                                                            int var97 = class57.field1184[var7];
                                                            class57.field1184[var7++] = class75.method636(var97, 0).field731 ? 1 : 0;
                                                        }
                                                    }
                                                } else if (var17 == 4000) {
                                                    var7 -= 2;
                                                    int var98 = class57.field1184[var7 + 1];
                                                    int var99 = class57.field1184[var7];
                                                    class57.field1184[var7++] = var98 + var99;
                                                } else if (~var17 == -4002) {
                                                    var7 -= 2;
                                                    int var100 = class57.field1184[var7];
                                                    int var101 = class57.field1184[var7 + 1];
                                                    class57.field1184[var7++] = var100 - var101;
                                                } else if (var17 == 4002) {
                                                    var7 -= 2;
                                                    int var102 = class57.field1184[var7];
                                                    int var103 = class57.field1184[var7 + 1];
                                                    class57.field1184[var7++] = var102 * var103;
                                                } else if (~var17 == -4004) {
                                                    var7 -= 2;
                                                    int var104 = class57.field1184[var7];
                                                    int var105 = class57.field1184[var7 - -1];
                                                    class57.field1184[var7++] = var104 / var105;
                                                } else if (var17 == 4004) {
                                                    --var7;
                                                    int var106 = class57.field1184[var7];
                                                    class57.field1184[var7++] = (int) ((double) var106 * Math.random());
                                                } else if (~var17 == -4006) {
                                                    --var7;
                                                    int var107 = class57.field1184[var7];
                                                    class57.field1184[var7++] = (int) (Math.random() * (double) (var107 - -1));
                                                } else if (~var17 == -4007) {
                                                    var7 -= 5;
                                                    int var108 = class57.field1184[var7];
                                                    int var109 = class57.field1184[var7 + 1];
                                                    int var110 = class57.field1184[var7 - -3];
                                                    int var111 = class57.field1184[var7 + 4];
                                                    int var112 = class57.field1184[var7 + 2];
                                                    class57.field1184[var7++] = (-var108 + var109) * (-var112 + var111) / (var110 - var112) + var108;
                                                } else if (var17 == 4007) {
                                                    var7 -= 2;
                                                    int var113 = class57.field1184[var7];
                                                    int var114 = class57.field1184[var7 + 1];
                                                    class57.field1184[var7++] = var113 * var114 / 100 + var113;
                                                } else if (var17 == 4008) {
                                                    var7 -= 2;
                                                    int var115 = class57.field1184[var7];
                                                    int var116 = class57.field1184[var7 + 1];
                                                    class57.field1184[var7++] = class14.method156(1 << var116, var115);
                                                } else if (var17 == 4009) {
                                                    var7 -= 2;
                                                    int var117 = class57.field1184[var7];
                                                    int var118 = class57.field1184[var7 + 1];
                                                    class57.field1184[var7++] = class100.method807(-(1 << var118) + -1, var117);
                                                } else if (var17 == 4010) {
                                                    var7 -= 2;
                                                    int var119 = class57.field1184[var7];
                                                    int var120 = class57.field1184[var7 + 1];
                                                    class57.field1184[var7++] = ~class100.method807(var119, 1 << var120) != -1 ? 1 : 0;
                                                } else if (~var17 == -4012) {
                                                    var7 -= 2;
                                                    int var121 = class57.field1184[var7];
                                                    int var122 = class57.field1184[var7 + 1];
                                                    class57.field1184[var7++] = var121 % var122;
                                                } else if (var17 == 4012) {
                                                    var7 -= 2;
                                                    int var123 = class57.field1184[var7 + 1];
                                                    int var124 = class57.field1184[var7];
                                                    if (~var124 != -1) {
                                                        class57.field1184[var7++] = (int) Math.pow((double) var124, (double) var123);
                                                    } else {
                                                        class57.field1184[var7++] = 0;
                                                    }
                                                } else {
                                                    if (var17 != 4013) {
                                                        break;
                                                    }
                                                    var7 -= 2;
                                                    int var125 = class57.field1184[var7];
                                                    int var126 = class57.field1184[var7 + 1];
                                                    if (~var125 != -1) {
                                                        if (~var126 != -1) {
                                                            class57.field1184[var7++] = (int) Math.pow((double) var125, 1.0D / (double) var126);
                                                        } else {
                                                            class57.field1184[var7++] = Integer.MAX_VALUE;
                                                        }
                                                    } else {
                                                        class57.field1184[var7++] = 0;
                                                    }
                                                }
                                            } else if (~var17 == -3101) {
                                                --var8;
                                                class105 var127 = class51.field1067[var8];
                                                client.method207(class78.field1766, -5, 0, var127);
                                            } else {
                                                if (~var17 != -3102) {
                                                    break;
                                                }
                                                var7 -= 2;
                                                class76.method652(class57.field1184[var7], -30713, class119.field2842, class57.field1184[var7 + 1]);
                                            }
                                        } else if (~var17 == -3001) {
                                            --var7;
                                            int var128 = class57.field1184[var7];
                                            if (~class85.field1909 == 0) {
                                                class22.method234((byte) -90, 0, var128);
                                                class85.field1909 = var128;
                                            }
                                        } else if (var17 == 3001) {
                                            var7 -= 2;
                                            int var129 = class57.field1184[var7];
                                            int var130 = class57.field1184[var7 + 1];
                                            class110.method895(var129, 0, false, var130);
                                        } else if (var17 == 3002) {
                                            class119 var131 = var32 ? class65.field1459 : class34.field790;
                                            if (~class85.field1909 == 0) {
                                                class22.method234((byte) -83, 32767 & var131.field2867, var131.field2797);
                                                class85.field1909 = var131.field2867;
                                            }
                                        } else {
                                            if (var17 != 3003) {
                                                break;
                                            }
                                            class119 var132 = var32 ? class65.field1459 : class34.field790;
                                            --var7;
                                            int var133 = class57.field1184[var7];
                                            class110.method895(var132.field2797, 32767 & var132.field2867, false, var133);
                                        }
                                    } else {
                                        --var7;
                                        class119 var134 = class119.method964(65535, class57.field1184[var7]);
                                        if (~var17 == -2701) {
                                            class57.field1184[var7++] = var134.field2779;
                                        } else {
                                            if (var17 != 2701) {
                                                break;
                                            }
                                            if (var134.field2779 == -1) {
                                                class57.field1184[var7++] = 0;
                                            } else {
                                                class57.field1184[var7++] = var134.field2882;
                                            }
                                        }
                                    }
                                } else {
                                    class119 var135 = !var32 ? class34.field790 : class65.field1459;
                                    if (~var17 == -1701) {
                                        class57.field1184[var7++] = var135.field2779;
                                    } else {
                                        if (var17 != 1701) {
                                            break;
                                        }
                                        if (~var135.field2779 == 0) {
                                            class57.field1184[var7++] = 0;
                                        } else {
                                            class57.field1184[var7++] = var135.field2882;
                                        }
                                    }
                                }
                            } else {
                                class119 var136 = !var32 ? class34.field790 : class65.field1459;
                                if (~var17 == -1501) {
                                    class57.field1184[var7++] = var136.field2810;
                                } else if (~var17 == -1502) {
                                    class57.field1184[var7++] = var136.field2862;
                                } else if (var17 == 1502) {
                                    class57.field1184[var7++] = var136.field2855;
                                } else if (var17 == 1503) {
                                    class57.field1184[var7++] = var136.field2787;
                                } else if (~var17 == -1505) {
                                    class57.field1184[var7++] = var136.field2815 ? 1 : 0;
                                } else {
                                    if (var17 != 1505) {
                                        break;
                                    }
                                    class57.field1184[var7++] = var136.field2797;
                                }
                            }
                        } else {
                            class119 var33;
                            if (~var17 > -2001) {
                                var33 = var32 ? class65.field1459 : class34.field790;
                            } else {
                                --var7;
                                var33 = class119.method964(65535, class57.field1184[var7]);
                                var17 -= 1000;
                            }
                            class116.method942(1, var33);
                            if (var17 == 1000) {
                                var7 -= 2;
                                var33.field2810 = class57.field1184[var7];
                                var33.field2862 = class57.field1184[var7 + 1];
                            } else if (var17 == 1001) {
                                var7 -= 2;
                                var33.field2855 = class57.field1184[var7];
                                var33.field2787 = class57.field1184[var7 + 1];
                            } else if (var17 == 1003) {
                                --var7;
                                var33.field2815 = ~class57.field1184[var7] == -2;
                            } else {
                                if (var17 != 1004) {
                                    break;
                                }
                                --var7;
                                var33.field2852 = ~class57.field1184[var7] == -2;
                            }
                        }
                    } else if (~var17 == -101) {
                        var7 -= 3;
                        int var142 = class57.field1184[var7];
                        int var143 = class57.field1184[var7 + 1];
                        int var144 = class57.field1184[var7 + 2];
                        class119 var145 = class119.method964(65535, var142);
                        if (var145.field2831 == null) {
                            var145.field2831 = new class119[var144 + 1];
                        }
                        if (var145.field2831.length <= var144) {
                            class119[] var146 = new class119[var144 + 1];
                            for (int var147 = 0; var147 < var145.field2831.length; ++var147) {
                                var146[var147] = var145.field2831[var147];
                            }
                            var145.field2831 = var146;
                        }
                        class119 var148 = new class119();
                        var148.field2797 = var145.field2867;
                        var148.field2800 = true;
                        var148.field2867 = (2147450880 & var145.field2867 << 15) + var144 + Integer.MIN_VALUE;
                        var148.field2811 = var143;
                        var145.field2831[var144] = var148;
                        if (var32) {
                            class65.field1459 = var148;
                        } else {
                            class34.field790 = var148;
                        }
                        class116.method942(1, var145);
                    } else if (~var17 == -102) {
                        class119 var149 = var32 ? class65.field1459 : class34.field790;
                        class119 var150 = class119.method964(65535, var149.field2797);
                        var150.field2831[class100.method807(var149.field2867, 32767)] = null;
                        class116.method942(1, var150);
                    } else {
                        if (~var17 != -103) {
                            break;
                        }
                        --var7;
                        class119 var151 = class119.method964(65535, class57.field1184[var7]);
                        var151.field2831 = null;
                        class116.method942(1, var151);
                    }
                }
            } catch (Exception var152) {
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V", line = 1741)
    public final void method320(int arg0, Graphics arg1, byte arg2, int arg3) {
        ++field1492;
        if (arg2 == -89) {
            this.method557((byte) -33);
            arg1.drawImage(super.field804, arg0, arg3, this);
        }
    }

    @OriginalMember(owner = "client!l", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 1754)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1477;
        return true;
    }

    @OriginalMember(owner = "client!l", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 1769)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1473;
        return this.field1487 == arg0;
    }

    @OriginalMember(owner = "client!l", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 1780)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1480;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 1792)
    public static void method559(int arg0) {
        field1491 = null;
        if (arg0 >= -8) {
            method558(-21, (Object[]) null, (class119) null, (byte) 59, -29, -27);
        }
        field1481 = null;
        field1472 = null;
        field1500 = null;
        field1495 = null;
        field1493 = null;
        field1501 = null;
        field1478 = null;
        field1497 = null;
        field1483 = null;
        field1499 = null;
        field1496 = null;
        field1470 = null;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V", line = 1814)
    public static final void method560(int arg0) {
        ++field1488;
        boolean var1 = true;
        class59.method473(false, -51);
        class71.field1559 = 0;
        for (int var2 = 0; ~class23.field568.length < ~var2; ++var2) {
            if (class125.field3049[var2] != -1 && class23.field568[var2] == null) {
                class23.field568[var2] = class14.field275.method766(0, (byte) -45, class125.field3049[var2]);
                if (class23.field568[var2] == null) {
                    var1 = false;
                    ++class71.field1559;
                }
            }
            if (class45.field1016[var2] != -1 && class116.field2721[var2] == null) {
                class116.field2721[var2] = class14.field275.method750(0, -25, class45.field1016[var2], class104.field2345[var2]);
                if (class116.field2721[var2] == null) {
                    var1 = false;
                    ++class71.field1559;
                }
            }
        }
        if (!var1) {
            class136.field3319 = 1;
        } else {
            class89.field2055 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class23.field568.length < ~var4; ++var4) {
                byte[] var56 = class116.field2721[var4];
                if (var56 != null) {
                    int var57 = (class73.field1606[var4] & 255) * 64 + -class107.field2466;
                    int var58 = (class73.field1606[var4] >> 8) * 64 + -class23.field562;
                    if (class34.field801) {
                        var58 = 10;
                        var57 = 10;
                    }
                    var3 &= class67.method564(var56, var57, var58, (byte) -67);
                }
            }
            if (!var3) {
                class136.field3319 = 2;
            } else {
                if (~class136.field3319 != -1) {
                    class129.method1038(class92.field2158, true, class90.field2057, (byte) -116);
                }
                class61.method484(false);
                class130.field3161.method536();
                System.gc();
                for (int var5 = 0; var5 < 4; ++var5) {
                    class116.field2717[var5].method899(-2);
                }
                if (arg0 > -62) {
                    field1485 = -2;
                }
                for (int var6 = 0; var6 < 4; ++var6) {
                    for (int var54 = 0; ~var54 > -105; ++var54) {
                        for (int var55 = 0; ~var55 > -105; ++var55) {
                            class57.field1185[var6][var54][var55] = 0;
                        }
                    }
                }
                class89.method729((byte) -123);
                int var7 = class23.field568.length;
                class75.method632(109);
                class59.method473(true, -51);
                if (!class34.field801) {
                    for (int var8 = 0; var7 > var8; ++var8) {
                        int var17 = (class73.field1606[var8] >> 8) * 64 + -class23.field562;
                        byte[] var18 = class23.field568[var8];
                        int var19 = (class73.field1606[var8] & 255) * 64 + -class107.field2466;
                        if (var18 != null) {
                            class125.method1011(var19, false, var18, class116.field2717, class97.field2243 * 8 + -48, var17, (class45.field1019 - 6) * 8);
                        }
                    }
                    for (int var9 = 0; var9 < var7; ++var9) {
                        int var14 = (class73.field1606[var9] >> 8) * 64 + -class23.field562;
                        int var15 = (255 & class73.field1606[var9]) * 64 + -class107.field2466;
                        byte[] var16 = class23.field568[var9];
                        if (var16 == null && class97.field2243 < 800) {
                            class74.method629(var14, 64, var15, 102, 64);
                        }
                    }
                    class59.method473(true, -51);
                    for (int var10 = 0; ~var10 > ~var7; ++var10) {
                        byte[] var11 = class116.field2721[var10];
                        if (var11 != null) {
                            int var12 = (class73.field1606[var10] >> 8) * 64 + -class23.field562;
                            int var13 = (255 & class73.field1606[var10]) * 64 + -class107.field2466;
                            class119.method968(var13, -23, class130.field3161, class116.field2717, var11, var12);
                        }
                    }
                }
                if (class34.field801) {
                    for (int var20 = 0; var20 < 4; ++var20) {
                        for (int var34 = 0; var34 < 13; ++var34) {
                            for (int var35 = 0; var35 < 13; ++var35) {
                                boolean var36 = false;
                                int var37 = class125.field3050[var20][var34][var35];
                                if (~var37 != 0) {
                                    int var38 = (var37 & 58524073) >> 24;
                                    int var39 = (var37 & 16768542) >> 14;
                                    int var40 = 3 & var37 >> 1;
                                    int var41 = 2047 & var37 >> 3;
                                    int var42 = (var39 / 8 << 8) - -(var41 / 8);
                                    for (int var43 = 0; ~class73.field1606.length < ~var43; ++var43) {
                                        if (~class73.field1606[var43] == ~var42 && class23.field568[var43] != null) {
                                            var36 = true;
                                            class104.method822(37, var20, class23.field568[var43], var35 * 8, var34 * 8, var38, class116.field2717, var40, (7 & var39) * 8, (7 & var41) * 8);
                                            break;
                                        }
                                    }
                                }
                                if (!var36) {
                                    class7.method97(var35 * 8, true, var20, var34 * 8);
                                }
                            }
                        }
                    }
                    for (int var21 = 0; var21 < 13; ++var21) {
                        for (int var32 = 0; var32 < 13; ++var32) {
                            int var33 = class125.field3050[0][var21][var32];
                            if (~var33 == 0) {
                                class74.method629(var21 * 8, 8, var32 * 8, 101, 8);
                            }
                        }
                    }
                    class59.method473(true, -51);
                    for (int var22 = 0; ~var22 > -5; ++var22) {
                        for (int var23 = 0; var23 < 13; ++var23) {
                            for (int var24 = 0; var24 < 13; ++var24) {
                                int var25 = class125.field3050[var22][var23][var24];
                                if (~var25 != 0) {
                                    int var26 = var25 >> 24 & 3;
                                    int var27 = (16383 & var25) >> 3;
                                    int var28 = (16773690 & var25) >> 14;
                                    int var29 = (var28 / 8 << 8) + var27 / 8;
                                    int var30 = (7 & var25) >> 1;
                                    for (int var31 = 0; ~class73.field1606.length < ~var31; ++var31) {
                                        if (~class73.field1606[var31] == ~var29 && class116.field2721[var31] != null) {
                                            class67.method565(class116.field2717, class116.field2721[var31], var24 * 8, var22, (var27 & 7) * 8, 98, class130.field3161, var26, var30, (var28 & 7) * 8, var23 * 8);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                class59.method473(true, -51);
                class61.method484(false);
                class7.method73(class130.field3161, 122, class116.field2717);
                class59.method473(true, -51);
                int var44 = class132.field3206;
                if (~var44 < ~class73.field1619) {
                    var44 = class73.field1619;
                }
                if (var44 < class73.field1619 + -1) {
                    int var45 = class73.field1619 - 1;
                }
                if (!class109.field2520) {
                    class130.field3161.method540(0);
                } else {
                    class130.field3161.method540(class132.field3206);
                }
                for (int var46 = 0; ~var46 > -105; ++var46) {
                    for (int var53 = 0; var53 < 104; ++var53) {
                        class86.method713(var53, var46, 1610612736);
                    }
                }
                class127.method1025(0);
                class1.field1.method602((byte) -70);
                if (class18.field412 != null) {
                    field1472.method781(206, (byte) -71);
                    field1472.method100(1057001181, false);
                    ++class29.field662;
                }
                if (!class34.field801) {
                    int var47 = (class45.field1019 - 6) / 8;
                    int var48 = (class97.field2243 + -6) / 8;
                    int var49 = (class97.field2243 + 6) / 8;
                    int var50 = (class45.field1019 - -6) / 8;
                    for (int var51 = var47 - 1; ~(var50 - -1) <= ~var51; ++var51) {
                        for (int var52 = var48 - 1; ~(var49 + 1) <= ~var52; ++var52) {
                            if (~var51 > ~var47 || var50 < var51 || ~var48 < ~var52 || ~var52 < ~var49) {
                                class14.field275.method760(class108.method878(new class105[] { class35.field814, class75.method637(var51, 8241), class60.field1339, class75.method637(var52, 8241) }, 2867), 112);
                                class14.field275.method760(class108.method878(new class105[] { class72.field1597, class75.method637(var51, 8241), class60.field1339, class75.method637(var52, 8241) }, 2867), 85);
                            }
                        }
                    }
                }
                if (class95.field2191 != -1) {
                    class136.method1069((byte) 45, 35);
                } else {
                    class136.method1069((byte) 45, 30);
                }
                class122.method996((byte) 54);
                field1472.method781(234, (byte) -110);
                class31.method303(-118);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)Z", line = 2267)
    public static final boolean method561(int arg0, int arg1) {
        ++field1486;
        if (~arg0 > -1) {
            return false;
        } else {
            if (arg1 != 10024) {
                field1485 = -126;
            }
            int var2 = class15.field298[arg0];
            if (~var2 <= -2001) {
                var2 -= 2000;
            }
            return ~var2 == -51;
        }
    }
}
