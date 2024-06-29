import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class31 extends class137 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field445 = 0;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Ljava/lang/String;")
    public static String field449 = null;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field440;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field442;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Z")
    public static boolean field438;

    @OriginalMember(owner = "client!gf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 6)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field441++;
        if (this.field442 == arg0) {
            this.field442 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 16)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field444++;
        return this.field442 == arg0;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 25)
    private final synchronized void method216(int arg0) {
        field456++;
        if (this.field442 == null) {
            return;
        }
        if (arg0 < 79) {
            field438 = false;
        }
        this.field442.setPixels(0, 0, this.field1984, this.field1989, this.field440, this.field1988, 0, this.field1984);
        this.field442.imageComplete(2);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V", line = 42)
    public static final void method217(int arg0, int arg1, int arg2) {
        field454++;
        if (class256.method1887(arg2, -1)) {
            class211.method1531(-1027, class119.field1677[arg2], arg1);
            int var3 = -27 / ((26 - arg0) / 35);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V", line = 57)
    private final synchronized void method218(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field447++;
        if (this.field442 != null && arg4 == 0) {
            this.field442.setPixels(arg1, arg3, arg0, arg2, this.field440, this.field1988, this.field1984 * arg3 + arg1, this.field1984);
            this.field442.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BILjava/awt/Component;I)V", line = 72)
    public final void method219(byte arg0, int arg1, Component arg2, int arg3) {
        this.field1989 = arg3;
        field451++;
        this.field1984 = arg1;
        this.field1988 = new int[arg1 * arg3 + 1];
        if (arg0 <= 32) {
            field438 = false;
        }
        this.field440 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1987 = arg2.createImage(this);
        this.method216(88);
        arg2.prepareImage(this.field1987, this);
        this.method216(112);
        arg2.prepareImage(this.field1987, this);
        this.method216(114);
        arg2.prepareImage(this.field1987, this);
        this.method973(-27272);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILph;)V", line = 97)
    public static final void method220(int arg0, class361 arg1) {
        if (arg0 >= -32) {
            field449 = (String) null;
        }
        field443++;
        class107.field1550 = arg1;
    }

    @OriginalMember(owner = "client!gf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 108)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field448++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 118)
    public final void method221(int arg0, int arg1, int arg2, Graphics arg3) {
        field452++;
        this.method216(96);
        if (arg2 <= -83) {
            arg3.drawImage(this.field1987, arg1, arg0, this);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 131)
    public final void method222(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.method218(arg2, arg0, arg5, arg1, 0);
        field450++;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg1, arg2, arg5);
        arg3.drawImage(this.field1987, 0, 0, this);
        arg3.setClip(var7);
        int var8 = -61 / ((arg4 + 25) / 48);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V", line = 150)
    public static void method223(boolean arg0) {
        if (!arg0) {
            method217(39, -108, -73);
        }
        field449 = null;
    }

    @OriginalMember(owner = "client!gf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 164)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field439++;
    }

    @OriginalMember(owner = "client!gf", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 172)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field453++;
        return true;
    }

    @OriginalMember(owner = "client!gf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 191)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field457++;
        this.field442 = arg0;
        arg0.setDimensions(this.field1984, this.field1989);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field440);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIBI)V", line = 203)
    public static final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field455++;
        class279.field4239 = 0;
        for (int var7 = -1; var7 < (class265.field4053 + class166.field2384); var7++) {
            class214 var8 = null;
            class333 var9;
            if (var7 < 0) {
                var9 = class1.field55;
            } else if (class265.field4053 > var7) {
                var9 = class343.field5312[class227.field3426[var7]];
            } else {
                var9 = class300.field4495[class215.field3158[var7 - class265.field4053]];
                var8 = ((class181) var9).field2609;
                if (var8.field3142 != null) {
                    var8 = var8.method1539(false);
                    if (var8 == null) {
                        continue;
                    }
                }
            }
            if (var9.method1256(19942)) {
                class231.method1717(arg2 >> 1, arg6 >> 1, var9, arg4, arg3, true, var9.method1258((byte) 105));
                if (class145.field2096 >= 0) {
                    if (var9.field5138 != null && (class265.field4053 <= var7 || class241.field3595 == 0 || class241.field3595 == 3 || class241.field3595 == 1 && class330.method2308(((class228) var9).field3453, (byte) 6)) && class279.field4239 < class342.field5282) {
                        class342.field5287[class279.field4239] = class126.field1846.method203(var9.field5138) / 2;
                        class342.field5294[class279.field4239] = class126.field1846.field398;
                        class342.field5288[class279.field4239] = class145.field2096;
                        class342.field5297[class279.field4239] = class146.field2103;
                        class342.field5285[class279.field4239] = var9.field5116;
                        class342.field5291[class279.field4239] = var9.field5109;
                        class342.field5279[class279.field4239] = var9.field5181;
                        class342.field5284[class279.field4239] = var9.field5138;
                        class279.field4239++;
                    }
                    class177 var10 = class122.field1775[0];
                    int var11 = class146.field2103 + arg1 - Math.max(class126.field1846.field403, var10.field2553);
                    if (!var9.field5105 && class304.field4560 < var9.field5129) {
                        class177 var12 = class122.field1775[1];
                        if (var9 instanceof class181) {
                            class181 var13 = (class181) var9;
                            class177[] var14 = (class177[]) ((class177[]) class259.field3868.method461((byte) 120, (long) var13.field2609.field3090));
                            if (var14 == null) {
                                var14 = class318.method2224(class216.field3184, var13.field2609.field3090, 0, (byte) -109);
                                if (var14 != null) {
                                    class259.field3868.method460(var14, -26089, (long) var13.field2609.field3090);
                                }
                            }
                            if (var14 != null && var14.length == 2) {
                                var10 = var14[0];
                                var12 = var14[1];
                            }
                        }
                        int var15 = class145.field2096 + arg0 - (var10.field2536 >> 1);
                        var10.method642(var15, var11);
                        int var16 = var9.field5197 * var10.field2536 / 255;
                        if (class141.field2031) {
                            class205.method1486(var15, var11, var15 + var16, var10.field2553 + var11);
                        } else {
                            class44.method319(var15, var11, var15 + var16, var11 - -var10.field2553);
                        }
                        var12.method642(var15, var11);
                        if (class141.field2031) {
                            class205.method1503(arg0, arg1, arg0 + arg2, arg1 - -arg6);
                        } else {
                            class44.method326(arg0, arg1, arg0 + arg2, arg1 + arg6);
                        }
                    }
                    var11 -= 2;
                    if (!var9.field5105) {
                        if (var7 < class265.field4053) {
                            class228 var18 = (class228) var9;
                            if (var18.field3434 != -1) {
                                var11 -= 25;
                                class177.field2538[var18.field3434].method642(class145.field2096 + arg0 - 12, var11);
                                var11 -= 2;
                            }
                            if (var18.field3444 != -1) {
                                var11 -= 25;
                                class201.field2956[var18.field3444].method642(class145.field2096 + arg0 - 12, var11);
                                var11 -= 2;
                            }
                        } else if (var8.field3104 >= 0 && var8.field3104 < class201.field2956.length) {
                            var11 -= 25;
                            class177 var17 = class201.field2956[var8.field3104];
                            var17.method642(class145.field2096 + arg0 - (var17.field2536 >> 1), var11);
                            var11 -= 2;
                        }
                    }
                    int var10000;
                    if (!(var9 instanceof class228)) {
                        int var19 = 0;
                        class230[] var20 = class351.field5417;
                        for (int var21 = 0; var21 < var20.length; var21++) {
                            class230 var22 = var20[var21];
                            if (var22 != null && var22.field3487 == 1 && class215.field3158[var7 - class265.field4053] == var22.field3480) {
                                class177 var23 = class92.field1282[var22.field3490];
                                if (var19 < var23.field2553) {
                                    var19 = var23.field2553;
                                }
                                if (class304.field4560 % 20 < 10) {
                                    var23.method642(class145.field2096 + arg0 - 12, -var23.field2553 + var11);
                                }
                            }
                        }
                        if (var19 > 0) {
                            var10000 = var11 - (var19 + 2);
                        }
                    } else if (var7 >= 0) {
                        int var25 = 0;
                        class230[] var26 = class351.field5417;
                        for (int var27 = 0; var27 < var26.length; var27++) {
                            class230 var28 = var26[var27];
                            if (var28 != null && var28.field3487 == 10 && class227.field3426[var7] == var28.field3480) {
                                class177 var29 = class92.field1282[var28.field3490];
                                if (var29.field2553 > var25) {
                                    var25 = var29.field2553;
                                }
                                var29.method642(class145.field2096 + arg0 - 12, -var29.field2553 + var11);
                            }
                        }
                        if (var25 > 0) {
                            var10000 = var11 - (var25 + 2);
                        }
                    }
                    for (int var31 = 0; var31 < 4; var31++) {
                        if (class304.field4560 < var9.field5169[var31]) {
                            int var32 = var9.method1258((byte) 127) / 2;
                            class231.method1717(arg2 >> 1, arg6 >> 1, var9, arg4, arg3, true, var32);
                            if (class145.field2096 > -1) {
                                if (var31 == 1) {
                                    class146.field2103 -= 20;
                                }
                                if (var31 == 2) {
                                    class146.field2103 -= 10;
                                    class145.field2096 -= 15;
                                }
                                if (var31 == 3) {
                                    class145.field2096 += 15;
                                    class146.field2103 -= 10;
                                }
                                class166.field2381[var9.field5196[var31]].method642(arg0 + class145.field2096 - 12, class146.field2103 + arg1 + -12);
                                class229.field3473.method197(Integer.toString(var9.field5166[var31]), class145.field2096 + arg0 - 1, arg1 - (-class146.field2103 - 3), 16777215, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var33 = 0; var33 < class312.field4648; var33++) {
            int var34 = class145.field2093[var33];
            class333 var35;
            if (var34 >= 2048) {
                var34 -= 2048;
                var35 = class300.field4495[var34];
            } else {
                var35 = class343.field5312[var34];
            }
            int var36 = class357.field5474[var33];
            class333 var37;
            if (var36 < 2048) {
                var37 = class343.field5312[var36];
            } else {
                var36 -= 2048;
                var37 = class300.field4495[var36];
            }
            int var38 = var37.method1251((byte) 48);
            if (var38 != -1) {
                Object var39 = null;
                class177 var40 = (class177) class360.field5679.method461((byte) 120, (long) var38);
                if (var40 == null) {
                    class177[] var41 = class318.method2224(class216.field3184, var38, 0, (byte) -109);
                    if (var41 != null) {
                        var40 = var41[0];
                        class360.field5679.method460(var40, -26089, (long) var38);
                    }
                }
                if (var40 != null) {
                    int var42 = var35.field5160++;
                    class150.method1063(var35.method1700(-99) * 64, var35.field5165, arg4, var35.field5137, -3666, arg6 >> 1, arg2 >> 1, 0, arg3);
                    int var43 = class146.field2103 - 54 - 16;
                    int var44 = var42 % 4 * 18 + var43;
                    int var45 = class145.field2096 + arg0 - 18;
                    int var46 = var42 / 4 * 18 + var45;
                    var40.method642(var46, var44);
                    if (var35 == var37) {
                        if (class141.field2031) {
                            class205.method1487(var46 - 1, var44 + -1, 18, 18, 16776960);
                        } else {
                            class44.method316(var46 - 1, var44 + -1, 18, 18, 16776960);
                        }
                    }
                    if (class193.field2807 >= var46 && class193.field2807 < var40.field2536 + var46 && var44 <= class255.field3814 && class255.field3814 < (var40.field2553 + var44)) {
                        if ((var37 instanceof class228)) {
                            class95.field1327[0] = (long) var36 << 32;
                        } else {
                            class95.field1327[0] = class355.method2467((long) var36 << 32, 536870912L);
                        }
                        class9.field158 = false;
                        class192.field2799 = 1;
                    }
                }
            }
        }
        if (arg5 != 91) {
            field449 = (String) null;
        }
        for (int var47 = 0; var47 < class279.field4239; var47++) {
            int var48 = class342.field5297[var47];
            int var49 = class342.field5288[var47];
            int var50 = class342.field5287[var47];
            boolean var51 = true;
            int var52 = class342.field5294[var47];
            while (var51) {
                var51 = false;
                for (int var53 = 0; var53 < var47; var53++) {
                    if (class342.field5297[var53] - class342.field5294[var53] < var48 + 2 && (class342.field5297[var53] + 2) > (var48 - var52) && var49 - var50 < class342.field5288[var53] + class342.field5287[var53] && (class342.field5288[var53] - class342.field5287[var53]) < (var49 + var50) && (class342.field5297[var53] - class342.field5294[var53]) < var48) {
                        var51 = true;
                        var48 = class342.field5297[var53] - class342.field5294[var53];
                    }
                }
            }
            class145.field2096 = class342.field5288[var47];
            class146.field2103 = class342.field5297[var47] = var48;
            String var54 = class342.field5284[var47];
            if (class149.field2171 == 0) {
                int var55 = 16776960;
                if (class342.field5285[var47] < 6) {
                    var55 = class292.field4425[class342.field5285[var47]];
                }
                if (class342.field5285[var47] == 6) {
                    var55 = class117.field1662 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class342.field5285[var47] == 7) {
                    var55 = class117.field1662 % 20 < 10 ? 255 : 65535;
                }
                if (class342.field5285[var47] == 8) {
                    var55 = class117.field1662 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class342.field5285[var47] == 9) {
                    int var56 = 150 - class342.field5279[var47];
                    if (var56 < 50) {
                        var55 = var56 * 1280 + 16711680;
                    } else if (var56 < 100) {
                        var55 = 33160960 - (var56 * 327680);
                    } else if (var56 < 150) {
                        var55 = ((var56 - 100) * 5) + 65280;
                    }
                }
                if (class342.field5285[var47] == 10) {
                    int var57 = 150 - class342.field5279[var47];
                    if (var57 < 50) {
                        var55 = var57 * 5 + 16711680;
                    } else if (var57 < 100) {
                        var55 = 16711935 - ((var57 - 50) * 327680);
                    } else if (var57 < 150) {
                        var55 = (var57 - 100) * 327680 + 255 - (var57 + -100) * 5;
                    }
                }
                if (class342.field5285[var47] == 11) {
                    int var58 = 150 - class342.field5279[var47];
                    if (var58 < 50) {
                        var55 = 16777215 - (var58 * 327685);
                    } else if (var58 < 100) {
                        var55 = ((var58 - 50) * 327685) + 65280;
                    } else if (var58 < 150) {
                        var55 = 16777215 + 32768000 - (var58 * 327680);
                    }
                }
                if (class342.field5291[var47] == 0) {
                    class126.field1846.method197(var54, class145.field2096 + arg0, class146.field2103 + arg1, var55, 0);
                }
                if (class342.field5291[var47] == 1) {
                    class126.field1846.method198(var54, arg0 + class145.field2096, arg1 - -class146.field2103, var55, 0, class117.field1662);
                }
                if (class342.field5291[var47] == 2) {
                    class126.field1846.method182(var54, arg0 + class145.field2096, arg1 - -class146.field2103, var55, 0, class117.field1662);
                }
                if (class342.field5291[var47] == 3) {
                    class126.field1846.method180(var54, arg0 + class145.field2096, class146.field2103 + arg1, var55, 0, class117.field1662, 150 - class342.field5279[var47]);
                }
                if (class342.field5291[var47] == 4) {
                    int var59 = (150 - class342.field5279[var47]) * (class126.field1846.method203(var54) + 100) / 150;
                    if (class141.field2031) {
                        class205.method1486(arg0 + class145.field2096 - 50, arg1, class145.field2096 + arg0 + 50, arg1 + arg6);
                    } else {
                        class44.method319(class145.field2096 + arg0 - 50, arg1, class145.field2096 + arg0 + 50, arg1 + arg6);
                    }
                    class126.field1846.method186(var54, arg0 + 50 - (-class145.field2096 - -var59), arg1 - -class146.field2103, var55, 0);
                    if (class141.field2031) {
                        class205.method1503(arg0, arg1, arg0 + arg2, arg1 - -arg6);
                    } else {
                        class44.method326(arg0, arg1, arg0 + arg2, arg1 + arg6);
                    }
                }
                if (class342.field5291[var47] == 5) {
                    int var60 = 150 - class342.field5279[var47];
                    if (class141.field2031) {
                        class205.method1486(arg0, arg1 + class146.field2103 - class126.field1846.field398 - 1, arg0 + arg2, class146.field2103 + arg1 + 5);
                    } else {
                        class44.method319(arg0, arg1 + class146.field2103 - class126.field1846.field398 - 1, arg0 + arg2, class146.field2103 + arg1 + 5);
                    }
                    int var61 = 0;
                    if (var60 < 25) {
                        var61 = var60 - 25;
                    } else if (var60 > 125) {
                        var61 = var60 - 125;
                    }
                    class126.field1846.method197(var54, class145.field2096 + arg0, arg1 + var61 + class146.field2103, var55, 0);
                    if (class141.field2031) {
                        class205.method1503(arg0, arg1, arg0 + arg2, arg1 + arg6);
                    } else {
                        class44.method326(arg0, arg1, arg0 + arg2, arg1 + arg6);
                    }
                }
            } else {
                class126.field1846.method197(var54, class145.field2096 + arg0, class146.field2103 + arg1, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V", line = 745)
    public static final void method225(int arg0) {
        field446++;
        class116.field1642.method458((byte) -92);
        int var1 = 27 % ((-arg0 - 55) / 60);
    }
}
