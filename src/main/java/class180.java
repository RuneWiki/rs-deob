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

@OriginalClass("client!qf")
public class class180 extends class94 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Lmb;")
    public static class132 field3305 = class166.method1092(" steht bereits auf Ihrer Freunde)2Liste(Q", 111);

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Lmb;")
    public static class132 field3308 = class166.method1092(" zuerst von Ihrer Freunde)2Liste(Q", 119);

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "Z")
    public static boolean field3313 = false;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "Lmb;")
    private static class132 field3310 = class166.method1092("This world is running a closed Beta)3", 113);

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Lmb;")
    public static class132 field3303 = field3310;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Lmb;")
    private static class132 field3315 = class166.method1092("To create a new account you need to", 121);

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Lmb;")
    public static class132 field3306 = field3315;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "Lq;")
    public static class174 field3301 = new class174(50);

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "Lmb;")
    public static class132 field3317 = class166.method1092("<img=1>", 127);

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3312;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3292;

    @OriginalMember(owner = "client!qf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3304;
    }

    @OriginalMember(owner = "client!qf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3295;
        return this.field3292 == arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
    public final void method582(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5) {
        if (arg2 > -10) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        this.method1158(arg4, arg1, -676732410, arg0, arg5);
        ++field3309;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg0, arg4, arg1);
        arg3.drawImage(super.field1655, 0, 0, this);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field3315 = null;
        field3301 = null;
        field3303 = null;
        field3308 = null;
        field3317 = null;
        field3306 = null;
        field3305 = null;
        if (arg0 > 101) {
            field3310 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3292 = arg0;
        ++field3302;
        arg0.setDimensions(super.field1658, super.field1652);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3312);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lpb;I)V")
    public static final void method1156(class165 arg0, int arg1) {
        if (arg1 > 6) {
            ++field3316;
            class150.field2744 = arg0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3296;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!qf", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3299;
        return true;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1157(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3314;
        if (arg4 >= -122) {
            field3305 = null;
        }
        int var9 = -arg5 + arg3;
        int var10 = -arg0 + arg7;
        int var11 = (arg8 - arg1 << 16) / var9;
        int var12 = (-arg2 + arg6 << 16) / var10;
        if (class192.field3586 > arg3) {
            ++var9;
        }
        if (~arg7 > ~class113.field2188) {
            ++var10;
        }
        for (int var13 = 0; ~var9 < ~var13; ++var13) {
            int var30 = var11 * var13 >> 16;
            int var31 = (var13 - -1) * var11 >> 16;
            int var32 = -var30 + var31;
            if (~var32 < -1) {
                int var33 = arg1 + var31;
                int var34 = arg1 + var30;
                int var35 = arg5 + var13 >> 6;
                int[][] var36 = class52.field886[var35];
                byte[][] var37 = class154.field2813[var35];
                byte[][] var38 = class47.field816[var35];
                byte[][] var39 = client.field543[var35];
                byte[][] var40 = class74.field1222[var35];
                byte[][] var41 = class24.field369[var35];
                for (int var42 = 0; var42 < var10; ++var42) {
                    int var43 = var12 * var42 >> 16;
                    int var44 = (var42 - -1) * var12 >> 16;
                    int var45 = -var43 + var44;
                    if (~var45 < -1) {
                        int var46 = arg2 + var44;
                        int var47 = arg0 + var42 >> 6;
                        int var48 = arg2 + var43;
                        int var49 = 63 & var42 - -arg0;
                        int var50 = 63 & var13 - -arg5;
                        int var51 = (var49 << 6) + var50;
                        int var54;
                        if (var36[var47] == null) {
                            int var52 = arg0 + var42 & 4;
                            int var53 = 4 & arg5 + var13;
                            if ((~var53 <= -3 || var52 <= 2) && (var53 <= 2 || ~var52 <= -3)) {
                                var54 = class215.field3917[class45.field775 + 1];
                            } else {
                                var54 = 4936552;
                            }
                        } else {
                            var54 = var36[var47][var51];
                        }
                        int var55 = var37[var47] != null ? class215.field3917[255 & var37[var47][var51]] : 0;
                        int var56 = var39[var47] != null ? class215.field3917[var39[var47][var51] & 255] : 0;
                        if (~var55 == -1 && var56 == 0) {
                            class239.method1525(var34, var48, var32, var45, var54);
                        } else {
                            if (~var55 != -1) {
                                if (~var55 == 0) {
                                    var55 = 1;
                                }
                                byte var57 = var41[var47] != null ? var41[var47][var51] : 0;
                                int var58 = var57 & 252;
                                if (~var58 != -1 && ~var32 < -2 && var45 > 1) {
                                    class27.method199(var54, var57 & 3, var45, true, class239.field4308, var34, var58 >> 2, var32, var55, (byte) 71, var48);
                                } else {
                                    class239.method1525(var34, var48, var32, var45, var55);
                                }
                            }
                            if (var56 != 0) {
                                byte var59 = var38[var47][var51];
                                if (~var56 == 0) {
                                    var56 = var54;
                                }
                                int var60 = var59 & 252;
                                if (var60 == 0 || ~var32 >= -2 || ~var45 >= -2) {
                                    class239.method1525(var34, var48, var32, var45, var56);
                                }
                                class27.method199(0, var59 & 3, var45, var55 == 0, class239.field4308, var34, var60 >> 2, var32, var56, (byte) 92, var48);
                            }
                        }
                        if (var40[var47] != null) {
                            int var61 = 255 & var40[var47][var51];
                            if (var61 != 0) {
                                int var62;
                                if (var32 == 1) {
                                    var62 = var34;
                                } else {
                                    var62 = var33 + -1;
                                }
                                int var63;
                                if (~var45 != -2) {
                                    var63 = var46 + -1;
                                } else {
                                    var63 = var48;
                                }
                                int var64 = 13421772;
                                if (var61 >= 5 && ~var61 >= -9 || var61 >= 13 && ~var61 >= -17 || var61 >= 21 && var61 <= 24 || var61 == 27 || ~var61 == -29) {
                                    var61 -= 4;
                                    var64 = 13369344;
                                }
                                if (~var61 == -2) {
                                    class239.method1529(var34, var48, var45, var64);
                                } else if (~var61 != -3) {
                                    if (~var61 == -4) {
                                        class239.method1529(var62, var48, var45, var64);
                                    } else if (~var61 != -5) {
                                        if (~var61 != -10) {
                                            if (~var61 == -11) {
                                                class239.method1529(var62, var48, var45, 16777215);
                                                class239.method1512(var34, var48, var32, var64);
                                            } else if (var61 == 11) {
                                                class239.method1529(var62, var48, var45, 16777215);
                                                class239.method1512(var34, var63, var32, var64);
                                            } else if (~var61 != -13) {
                                                if (var61 != 17) {
                                                    if (~var61 != -19) {
                                                        if (var61 == 19) {
                                                            class239.method1512(var62, var63, 1, var64);
                                                        } else if (var61 == 20) {
                                                            class239.method1512(var34, var63, 1, var64);
                                                        } else if (var61 != 25) {
                                                            if (~var61 == -27) {
                                                                for (int var65 = 0; var45 > var65; ++var65) {
                                                                    class239.method1512(var34 + var65, var48 - -var65, 1, var64);
                                                                }
                                                            }
                                                        } else {
                                                            for (int var66 = 0; ~var45 < ~var66; ++var66) {
                                                                class239.method1512(var34 + var66, -var66 + var63, 1, var64);
                                                            }
                                                        }
                                                    } else {
                                                        class239.method1512(var62, var48, 1, var64);
                                                    }
                                                } else {
                                                    class239.method1512(var34, var48, 1, var64);
                                                }
                                            } else {
                                                class239.method1529(var34, var48, var45, 16777215);
                                                class239.method1512(var34, var63, var32, var64);
                                            }
                                        } else {
                                            class239.method1529(var34, var48, var45, 16777215);
                                            class239.method1512(var34, var48, var32, var64);
                                        }
                                    } else {
                                        class239.method1512(var34, var63, var32, var64);
                                    }
                                } else {
                                    class239.method1512(var34, var48, var32, var64);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var14 = 0; var14 < var9; ++var14) {
            int var15 = (var14 + 1) * var11 >> 16;
            int var16 = var11 * var14 >> 16;
            int var17 = -var16 + var15;
            if (~var17 < -1) {
                int var10000 = arg1 + var15;
                byte[][] var19 = class198.field3681[arg5 + var14 >> 6];
                int var20 = arg1 + var16;
                for (int var21 = 0; var10 > var21; ++var21) {
                    int var22 = var12 * var21 >> 16;
                    int var23 = (var21 + 1) * var12 >> 16;
                    int var24 = -var22 + var23;
                    if (var24 > 0) {
                        int var25 = arg2 + var22;
                        var10000 = arg2 + var23;
                        int var27 = ((63 & arg0 + var21) << 6) - -(var14 - -arg5 & 63);
                        int var28 = arg0 + var21 >> 6;
                        if (var19[var28] != null) {
                            int var29 = 255 & var19[var28][var27];
                            if (var29 != 0) {
                                if (var29 != 47 && var29 != 53) {
                                    class19.field267[var29 + -1].method1206(-(var17 / 2) + var20, -(var24 / 2) + var25, var17 * 2, var24 * 2);
                                } else {
                                    class19.field267[var29 + -1].method1206(var20, var25, var17 * 2 + 1, var24 * 2 + 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method581(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field3298;
        this.method1161(72);
        arg3.drawImage(super.field1655, arg0, arg2, this);
        int var5 = 59 / ((arg1 - -21) / 53);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3293;
        if (this.field3292 != null) {
            if (arg2 != -676732410) {
                this.startProduction((ImageConsumer) null);
            }
            this.field3292.setPixels(arg4, arg3, arg0, arg1, this.field3312, super.field1649, super.field1658 * arg3 + arg4, super.field1658);
            this.field3292.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!qf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3292 == arg0) {
            this.field3292 = null;
        }
        ++field3300;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public final void method583(int arg0, int arg1, Component arg2, byte arg3) {
        ++field3311;
        super.field1652 = arg0;
        super.field1658 = arg1;
        super.field1649 = new int[arg0 * arg1 + 1];
        this.field3312 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg3 != -104) {
            this.method1158(97, 91, -103, -98, -74);
        }
        super.field1655 = arg2.createImage(this);
        this.method1161(46);
        arg2.prepareImage(super.field1655, this);
        this.method1161(60);
        arg2.prepareImage(super.field1655, this);
        this.method1161(78);
        arg2.prepareImage(super.field1655, this);
        this.method578(0);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lpb;III)[Lvi;")
    public static final class233[] method1159(class165 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -3) {
            return null;
        } else {
            ++field3297;
            return !class172.method1122(arg3, arg0, arg1, true) ? null : class236.method1498((byte) -13);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIII)V")
    public static final void method1160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~arg0 > ~arg4) {
            class23.method153(arg2, class61.field1033[arg1], true, arg0, arg4);
        } else {
            class23.method153(arg2, class61.field1033[arg1], true, arg4, arg0);
        }
        ++field3294;
        if (arg3 != 27) {
            method1159((class165) null, 39, -41, 80);
        }
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
    private final synchronized void method1161(int arg0) {
        ++field3307;
        if (this.field3292 != null) {
            this.field3292.setPixels(0, 0, super.field1658, super.field1652, this.field3312, super.field1649, 0, super.field1658);
            if (arg0 < 23) {
                this.method583(33, -79, (Component) null, (byte) -62);
            }
            this.field3292.imageComplete(2);
        }
    }
}
