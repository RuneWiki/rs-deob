import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 extends class92 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Lmc;")
    public static class75 field1282 = class30.method234(true, "redstone1");

    @OriginalMember(owner = "client!id", name = "E", descriptor = "[I")
    public static int[] field1288 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Lmc;")
    public static class75 field1290 = class30.method234(true, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Z")
    public static volatile boolean field1284 = false;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "[I")
    public static int[] field1301 = new int[4000];

    @OriginalMember(owner = "client!id", name = "W", descriptor = "Lmc;")
    public static class75 field1306 = class30.method234(true, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!id", name = "J", descriptor = "Lmc;")
    private static class75 field1293 = class30.method234(true, "Attack");

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Lmc;")
    public static class75 field1289 = field1293;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "Lkc;")
    public static class63 field1309 = new class63(30);

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "Lmc;")
    private static class75 field1314 = class30.method234(true, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!id", name = "db", descriptor = "Lmc;")
    public static class75 field1313 = field1314;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "Lfa;")
    public static class32 field1312 = new class32();

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "[I")
    public static int[] field1318 = new int[2000];

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public static int field1320 = -1;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "Lmc;")
    private static class75 field1319 = class30.method234(true, "glow3:");

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "Lmc;")
    public static class75 field1316 = field1319;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "Lv;")
    public static class122 field1315;

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "Lga;")
    public static class38 field1321;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1295;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1311;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "[I")
    public static int[] field1287;

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "[I")
    public static int[] field1317;

    @OriginalMember(owner = "client!id", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 6)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1303;
        if (this.field1311 == arg0) {
            this.field1311 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 19)
    public final void method399(int arg0, int arg1, int arg2, Component arg3) {
        super.field2276 = arg0;
        ++field1305;
        super.field2265 = new int[arg0 * arg2 + 1];
        super.field2267 = arg2;
        this.field1295 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2266 = arg3.createImage(this);
        this.method402((byte) -63);
        arg3.prepareImage(super.field2266, this);
        this.method402((byte) -87);
        arg3.prepareImage(super.field2266, this);
        this.method402((byte) -122);
        arg3.prepareImage(super.field2266, this);
        this.method767(false);
        int var5 = 58 / ((arg1 - 58) / 36);
    }

    @OriginalMember(owner = "client!id", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 54)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1310;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lfc;", line = 63)
    public static final class34 method400(int arg0, int arg1) {
        ++field1283;
        class34 var2 = (class34) class61.field1572.method559((long) arg0, 78);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class31.field691.method436(arg0, 5, 9);
            class34 var4 = new class34();
            var4.field784 = arg0;
            if (var3 != null) {
                var4.method262(new class61(var3), -1);
            }
            var4.method267((byte) -74);
            class61.field1572.method558((long) arg0, var4, 304);
            if (arg1 != -13673) {
                field1288 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 94)
    public static final void method401(byte arg0) {
        ++field1308;
        class27.field551 = 0;
        for (int var1 = -1; ~(class34.field783 - -class110.field2790) < ~var1; ++var1) {
            class50 var19;
            if (~var1 == 0) {
                var19 = field1315;
            } else if (~class34.field783 >= ~var1) {
                var19 = class12.field231[class118.field2929[-class34.field783 + var1]];
            } else {
                var19 = class40.field957[class84.field2081[var1]];
            }
            if (var19 != null && var19.method395(28619)) {
                if (var19 instanceof class97) {
                    class34 var20 = ((class97) var19).field2447;
                    if (var20.field814 != null) {
                        var20 = var20.method272((byte) -90);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var1 >= class34.field783) {
                    class34 var21 = ((class97) var19).field2447;
                    if (var21.field818 >= 0 && ~var21.field818 > ~class109.field2765.length) {
                        class7.method33((byte) -106, var19.field1230 + 15, var19);
                        if (~class56.field1423 < 0) {
                            class109.field2765[var21.field818].method14(class56.field1423 + -12, class101.field2599 + -30);
                        }
                    }
                    if (class101.field2613 == 1 && class118.field2929[-class34.field783 + var1] == class8.field142 && ~(class34.field781 % 20) > -11) {
                        class7.method33((byte) -106, var19.field1230 + 15, var19);
                        if (~class56.field1423 < 0) {
                            class64.field1685[0].method14(class56.field1423 + -12, class101.field2599 + -28);
                        }
                    }
                } else {
                    int var22 = 30;
                    class122 var23 = (class122) var19;
                    if (~var23.field2978 != 0 || ~var23.field2984 != 0) {
                        class7.method33((byte) -106, var19.field1230 + 15, var19);
                        if (~class56.field1423 < 0) {
                            if (~var23.field2978 != 0) {
                                class99.field2553[var23.field2978].method14(class56.field1423 + -12, class101.field2599 - var22);
                                var22 += 25;
                            }
                            if (~var23.field2984 != 0) {
                                class109.field2765[var23.field2984].method14(class56.field1423 + -12, class101.field2599 - var22);
                                var22 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && ~class101.field2613 == -11 && ~class84.field2081[var1] == ~class84.field2083) {
                        class7.method33((byte) -106, var19.field1230 + 15, var19);
                        if (class56.field1423 > -1) {
                            class64.field1685[1].method14(class56.field1423 + -12, -var22 + class101.field2599);
                        }
                    }
                }
                if (var19.field1213 != null && (~var1 <= ~class34.field783 || class71.field1814 == 0 || ~class71.field1814 == -4 || ~class71.field1814 == -2 && class87.method727(((class122) var19).field3003, (byte) 117))) {
                    class7.method33((byte) -106, var19.field1230, var19);
                    if (class56.field1423 > -1 && class109.field2759 > class27.field551) {
                        class109.field2760[class27.field551] = class5.field77.method410(var19.field1213) / 2;
                        class109.field2776[class27.field551] = class5.field77.field1341;
                        class109.field2774[class27.field551] = class56.field1423;
                        class109.field2756[class27.field551] = class101.field2599;
                        class109.field2768[class27.field551] = var19.field1261;
                        class109.field2752[class27.field551] = var19.field1240;
                        class109.field2775[class27.field551] = var19.field1212;
                        class109.field2761[class27.field551] = var19.field1213;
                        ++class27.field551;
                    }
                }
                if (~var19.field1245 < ~class34.field781) {
                    class7.method33((byte) -106, var19.field1230 - -15, var19);
                    if (class56.field1423 > -1) {
                        int var24 = var19.field1279 * 30 / var19.field1199;
                        if (~var24 < -31) {
                            var24 = 30;
                        }
                        class66.method569(class56.field1423 + -15, class101.field2599 + -3, var24, 5, 65280);
                        class66.method569(class56.field1423 - -var24 + -15, class101.field2599 - 3, -var24 + 30, 5, 16711680);
                    }
                }
                for (int var25 = 0; ~var25 > -5; ++var25) {
                    if (~class34.field781 > ~var19.field1224[var25]) {
                        class7.method33((byte) -106, var19.field1230 / 2, var19);
                        if (class56.field1423 > -1) {
                            if (~var25 == -2) {
                                class101.field2599 -= 20;
                            }
                            if (~var25 == -3) {
                                class101.field2599 -= 10;
                                class56.field1423 -= 15;
                            }
                            if (var25 == 3) {
                                class101.field2599 -= 10;
                                class56.field1423 += 15;
                            }
                            class129.field3146[var19.field1250[var25]].method14(class56.field1423 + -12, class101.field2599 + -12);
                            class44.field1046.method427(class45.method345(22978, var19.field1207[var25]), class56.field1423, class101.field2599 + 4, 0);
                            class44.field1046.method427(class45.method345(22978, var19.field1207[var25]), class56.field1423 + -1, class101.field2599 + 3, 16777215);
                        }
                    }
                }
            }
        }
        int var2 = 124 % ((arg0 - -74) / 38);
        for (int var3 = 0; var3 < class27.field551; ++var3) {
            int var4 = class109.field2774[var3];
            int var5 = class109.field2760[var3];
            int var6 = class109.field2756[var3];
            boolean var7 = true;
            int var8 = class109.field2776[var3];
            while (var7) {
                var7 = false;
                for (int var18 = 0; ~var18 > ~var3; ++var18) {
                    if (var6 - -2 > class109.field2756[var18] - class109.field2776[var18] && class109.field2756[var18] + 2 > var6 - var8 && ~(-var5 + var4) > ~(class109.field2774[var18] + class109.field2760[var18]) && ~(class109.field2774[var18] + -class109.field2760[var18]) > ~(var4 + var5) && class109.field2756[var18] - class109.field2776[var18] < var6) {
                        var6 = class109.field2756[var18] + -class109.field2776[var18];
                        var7 = true;
                    }
                }
            }
            class56.field1423 = class109.field2774[var3];
            class101.field2599 = class109.field2756[var3] = var6;
            class75 var9 = class109.field2761[var3];
            if (~class31.field700 != -1) {
                class5.field77.method427(var9, class56.field1423, class101.field2599 + 1, 0);
                class5.field77.method427(var9, class56.field1423, class101.field2599, 16776960);
            } else {
                int var10 = 16776960;
                if (class109.field2768[var3] < 6) {
                    var10 = class110.field2793[class109.field2768[var3]];
                }
                if (~class109.field2768[var3] == -7) {
                    var10 = class112.field2842 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (~class109.field2768[var3] == -8) {
                    var10 = ~(class112.field2842 % 20) <= -11 ? 65535 : 255;
                }
                if (~class109.field2768[var3] == -9) {
                    var10 = ~(class112.field2842 % 20) > -11 ? 45056 : 8454016;
                }
                if (class109.field2768[var3] == 9) {
                    int var11 = 150 - class109.field2775[var3];
                    if (~var11 <= -51) {
                        if (var11 < 100) {
                            var10 = 16776960 - var11 * 327680 + 16384000;
                        } else if (~var11 > -151) {
                            var10 = -500 - (-(var11 * 5) - 65280);
                        }
                    } else {
                        var10 = 16711680 - -(var11 * 1280);
                    }
                }
                if (class109.field2768[var3] == 10) {
                    int var12 = -class109.field2775[var3] + 150;
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = -(var12 * 327680) + 16384000 + 16711935;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 - -500 - var12 * 5 + 255;
                    }
                }
                if (class109.field2768[var3] == 11) {
                    int var13 = -class109.field2775[var3] + 150;
                    if (var13 < 50) {
                        var10 = -(var13 * 327685) + 16777215;
                    } else if (~var13 > -101) {
                        var10 = 65280 - -((var13 + -50) * 327685);
                    } else if (var13 < 150) {
                        var10 = -((var13 + -100) * 327680) + 16777215;
                    }
                }
                if (~class109.field2752[var3] == -1) {
                    class5.field77.method427(var9, class56.field1423, class101.field2599 + 1, 0);
                    class5.field77.method427(var9, class56.field1423, class101.field2599, var10);
                }
                if (~class109.field2752[var3] == -2) {
                    class5.field77.method409(var9, class56.field1423, class101.field2599 + 1, 0, class112.field2842);
                    class5.field77.method409(var9, class56.field1423, class101.field2599, var10, class112.field2842);
                }
                if (class109.field2752[var3] == 2) {
                    class5.field77.method411(var9, class56.field1423, class101.field2599 - -1, 0, class112.field2842);
                    class5.field77.method411(var9, class56.field1423, class101.field2599, var10, class112.field2842);
                }
                if (class109.field2752[var3] == 3) {
                    class5.field77.method417(var9, class56.field1423, class101.field2599 + 1, 0, class112.field2842, 150 - class109.field2775[var3]);
                    class5.field77.method417(var9, class56.field1423, class101.field2599, var10, class112.field2842, 150 - class109.field2775[var3]);
                }
                if (class109.field2752[var3] == 4) {
                    int var14 = class5.field77.method410(var9);
                    int var15 = (150 - class109.field2775[var3]) * (var14 - -100) / 150;
                    class66.method570(class56.field1423 + -50, 0, class56.field1423 - -50, 334);
                    class5.field77.method423(var9, class56.field1423 - var15 + 50, class101.field2599 + 1, 0);
                    class5.field77.method423(var9, class56.field1423 + 50 + -var15, class101.field2599, var10);
                    class66.method572();
                }
                if (class109.field2752[var3] == 5) {
                    int var16 = 0;
                    int var17 = 150 - class109.field2775[var3];
                    if (var17 < 25) {
                        var16 = var17 + -25;
                    } else if (var17 > 125) {
                        var16 = var17 + -125;
                    }
                    class66.method570(0, class101.field2599 - (class5.field77.field1341 - -1), 512, class101.field2599 + 5);
                    class5.field77.method427(var9, class56.field1423, class101.field2599 + var16 + 1, 0);
                    class5.field77.method427(var9, class56.field1423, class101.field2599 + var16, var10);
                    class66.method572();
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 469)
    public final void startProduction(ImageConsumer arg0) {
        ++field1294;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V", line = 487)
    private final synchronized void method402(byte arg0) {
        ++field1299;
        if (this.field1311 != null) {
            this.field1311.setPixels(0, 0, super.field2267, super.field2276, this.field1295, super.field2265, 0, super.field2267);
            this.field1311.imageComplete(2);
            if (arg0 > -62) {
                this.isConsumer((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V", line = 507)
    public final void method403(int arg0, byte arg1, Graphics arg2, int arg3) {
        ++field1298;
        this.method402((byte) -75);
        arg2.drawImage(super.field2266, arg0, arg3, this);
        int var5 = 125 % ((11 - arg1) / 60);
    }

    @OriginalMember(owner = "client!id", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 522)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1300;
        return this.field1311 == arg0;
    }

    @OriginalMember(owner = "client!id", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 530)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1304;
        return true;
    }

    @OriginalMember(owner = "client!id", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 539)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1286;
        this.field1311 = arg0;
        arg0.setDimensions(super.field2267, super.field2276);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1295);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V", line = 558)
    public static void method404(byte arg0) {
        field1306 = null;
        field1317 = null;
        field1315 = null;
        field1312 = null;
        if (arg0 != 46) {
            method400(14, 126);
        }
        field1316 = null;
        field1313 = null;
        field1318 = null;
        field1287 = null;
        field1282 = null;
        field1309 = null;
        field1290 = null;
        field1293 = null;
        field1314 = null;
        field1321 = null;
        field1319 = null;
        field1289 = null;
        field1288 = null;
        field1301 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZII)I", line = 587)
    public static final int method405(boolean arg0, int arg1, int arg2) {
        int var3 = class91.method755(arg2 + -1, 105, arg1 + -1) - (-class91.method755(arg2 + -1, -64, arg1 + 1) + -class91.method755(arg2 - -1, -109, arg1 + -1) + -class91.method755(arg2 + 1, 81, arg1 + 1));
        ++field1297;
        if (!arg0) {
            method400(-101, 91);
        }
        int var4 = class91.method755(arg2, 80, arg1 + -1) - (-class91.method755(arg2, 59, arg1 + 1) - (class91.method755(arg2 - 1, 86, arg1) + class91.method755(arg2 + 1, 77, arg1)));
        int var5 = class91.method755(arg2, -101, arg1);
        return var3 / 16 - -(var4 / 8) - -(var5 / 4);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lmc;I)V", line = 609)
    public static final void method406(class75 arg0, int arg1) {
        ++field1292;
        if (arg0 != null && arg0.method621(-19198) != 0) {
            class75 var2 = arg0;
            class75[] var3 = new class75[100];
            int var4 = 0;
            while (true) {
                int var5 = var2.method624(32, (byte) -32);
                if (~var5 == 0) {
                    class75 var7 = var2.method637(90);
                    if (~var7.method621(-19198) < -1) {
                        var3[var4++] = var7.method630((byte) -22);
                    }
                    class10.field218 = 0;
                    if (arg1 != 28220) {
                        return;
                    } else {
                        label51: for (int var8 = 0; var8 < class31.field692; ++var8) {
                            class10 var9 = class43.method326(var8, 0);
                            if (var9.field179 == -1 && var9.field204 != null) {
                                class75 var10 = var9.field204.method630((byte) -22);
                                for (int var11 = 0; ~var4 < ~var11; ++var11) {
                                    if (var10.method644(var3[var11], arg1 ^ 28220) == -1) {
                                        continue label51;
                                    }
                                }
                                class109.field2771[class10.field218] = var10;
                                class21.field422[class10.field218] = var8;
                                ++class10.field218;
                                if (class10.field218 >= class109.field2771.length) {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                }
                class75 var6 = var2.method647(0, 0, var5).method637(90);
                if (var6.method621(-19198) > 0) {
                    var3[var4++] = var6.method630((byte) -22);
                }
                var2 = var2.method645(var5 - -1, (byte) 110);
            }
        } else {
            class10.field218 = 0;
        }
    }
}
