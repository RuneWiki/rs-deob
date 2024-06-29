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

@OriginalClass("client!gk")
public class class6 extends class144 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field91;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field88;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method31(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field81;
        if (this.field88 != null) {
            this.field88.setPixels(arg2, arg1, arg4, arg0, this.field91, super.field2773, super.field2775 * arg1 + arg2, super.field2775);
            this.field88.imageComplete(arg3);
        }
    }

    @OriginalMember(owner = "client!gk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field78;
    }

    @OriginalMember(owner = "client!gk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field82;
    }

    @OriginalMember(owner = "client!gk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field88 == arg0) {
            this.field88 = null;
        }
        ++field84;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
    private final synchronized void method32(byte arg0) {
        ++field86;
        if (this.field88 != null) {
            this.field88.setPixels(0, 0, super.field2775, super.field2774, this.field91, super.field2773, 0, super.field2775);
            if (arg0 < 126) {
                this.method38((Graphics) null, -106, -69, 56);
            }
            this.field88.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public final void method33(int arg0, int arg1, byte arg2, Component arg3) {
        super.field2774 = arg1;
        ++field80;
        super.field2773 = new int[arg0 * arg1 + 1];
        super.field2775 = arg0;
        int var5 = -102 % ((arg2 - 69) / 47);
        this.field91 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2770 = arg3.createImage(this);
        this.method32((byte) 127);
        arg3.prepareImage(super.field2770, this);
        this.method32((byte) 127);
        arg3.prepareImage(super.field2770, this);
        this.method32((byte) 127);
        arg3.prepareImage(super.field2770, this);
        this.method1068(false);
    }

    @OriginalMember(owner = "client!gk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field85;
        return this.field88 == arg0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lre;IIIIIIIZ)V")
    public static final void method34(class231 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class254.field4478;
        int var11;
        int var12 = var11 = (arg7 << 7) - class108.field2177;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class242.field4333[arg1][arg6][arg7] - class21.field382;
        int var18 = class242.field4333[arg1][arg6 + 1][arg7] - class21.field382;
        int var19 = class242.field4333[arg1][arg6 + 1][arg7 + 1] - class21.field382;
        int var20 = class242.field4333[arg1][arg6][arg7 + 1] - class21.field382;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class213.field3859;
                        int var46 = (var24 << 9) / var25 + class213.field3855;
                        int var47 = (var27 << 9) / var31 + class213.field3859;
                        int var48 = (var30 << 9) / var31 + class213.field3855;
                        int var49 = (var33 << 9) / var37 + class213.field3859;
                        int var50 = (var36 << 9) / var37 + class213.field3855;
                        int var51 = (var39 << 9) / var43 + class213.field3859;
                        int var52 = (var42 << 9) / var43 + class213.field3855;
                        class213.field3848 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class45.field1059 && class247.method1734(class257.field4540 + class213.field3859, class213.field3855 + class200.field3578, var50, var52, var48, var49, var51, var47)) {
                                class275.field4808 = arg6;
                                class252.field4448 = arg7;
                            }
                            if (!arg8) {
                                class213.field3851 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class213.field3843 || var51 > class213.field3843 || var47 > class213.field3843) {
                                    class213.field3851 = true;
                                }
                                if (arg0.field4114 == -1) {
                                    if (arg0.field4112 != 12345678) {
                                        class213.method1520(var50, var52, var48, var49, var51, var47, arg0.field4112, arg0.field4110, arg0.field4105);
                                    }
                                } else if (class104.field2102) {
                                    if (arg0.field4120) {
                                        class213.method1526(var50, var52, var48, var49, var51, var47, arg0.field4112, arg0.field4110, arg0.field4105, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4114);
                                    } else {
                                        class213.method1526(var50, var52, var48, var49, var51, var47, arg0.field4112, arg0.field4110, arg0.field4105, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field4114);
                                    }
                                } else {
                                    int var53 = class213.field3850.method510(arg0.field4114, (byte) 40);
                                    class213.method1520(var50, var52, var48, var49, var51, var47, class108.method862(var53, arg0.field4112), class108.method862(var53, arg0.field4110), class108.method862(var53, arg0.field4105));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class45.field1059 && class247.method1734(class257.field4540 + class213.field3859, class213.field3855 + class200.field3578, var46, var48, var52, var45, var47, var51)) {
                                class275.field4808 = arg6;
                                class252.field4448 = arg7;
                            }
                            if (!arg8) {
                                class213.field3851 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class213.field3843 || var47 > class213.field3843 || var51 > class213.field3843) {
                                    class213.field3851 = true;
                                }
                                if (arg0.field4114 == -1) {
                                    if (arg0.field4103 != 12345678) {
                                        class213.method1520(var46, var48, var52, var45, var47, var51, arg0.field4103, arg0.field4105, arg0.field4110);
                                        return;
                                    }
                                } else {
                                    if (class104.field2102) {
                                        class213.method1526(var46, var48, var52, var45, var47, var51, arg0.field4103, arg0.field4105, arg0.field4110, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field4114);
                                        return;
                                    }
                                    int var54 = class213.field3850.method510(arg0.field4114, (byte) 40);
                                    class213.method1520(var46, var48, var52, var45, var47, var51, class108.method862(var54, arg0.field4103), class108.method862(var54, arg0.field4105), class108.method862(var54, arg0.field4110));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static final void method35(int arg0) {
        if (arg0 >= 122) {
            ++field92;
            if (class66.field1444.toLowerCase().indexOf("microsoft") == -1) {
                class58.field1265[47] = 73;
                class58.field1265[46] = 72;
                if (class66.field1464 != null) {
                    class58.field1265[192] = 28;
                    class58.field1265[222] = 58;
                    class58.field1265[520] = 59;
                } else {
                    class58.field1265[222] = 59;
                    class58.field1265[192] = 58;
                }
                class58.field1265[61] = 27;
                class58.field1265[45] = 26;
                class58.field1265[91] = 42;
                class58.field1265[44] = 71;
                class58.field1265[92] = 74;
                class58.field1265[93] = 43;
                class58.field1265[59] = 57;
            } else {
                class58.field1265[186] = 57;
                class58.field1265[189] = 26;
                class58.field1265[190] = 72;
                class58.field1265[219] = 42;
                class58.field1265[222] = 59;
                class58.field1265[191] = 73;
                class58.field1265[192] = 58;
                class58.field1265[223] = 28;
                class58.field1265[221] = 43;
                class58.field1265[187] = 27;
                class58.field1265[220] = 74;
                class58.field1265[188] = 71;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public final void method36(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5) {
        ++field90;
        if (arg4 <= 96) {
            method37((class30) null, 39);
        }
        this.method31(arg3, arg2, arg1, 2, arg0);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg1, arg2, arg0, arg3);
        arg5.drawImage(super.field2770, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lsg;I)V")
    public static final void method37(class30 arg0, int arg1) {
        if (arg1 >= 37) {
            ++field89;
            class219.field3963 = arg0;
            if (class190.field3452.field1449 != null) {
                try {
                    class30 var2 = class263.field4640.method253((byte) -113, class190.field3452.field1449);
                    class30 var3 = class176.field3271.method253((byte) -113, class190.field3452.field1449);
                    class30 var4 = class160.method1188(new class30[] { var2, class80.field1710, arg0, class64.field1425, var3 }, 0);
                    class30 var5;
                    if (arg0.method249(-123) == 0) {
                        var5 = class160.method1188(new class30[] { var4, class179.field3312 }, 0);
                    } else {
                        var5 = class160.method1188(new class30[] { var4, class134.field2628, class23.method211(13884, class111.method874(30351) - -94608000000L), class65.field1435, class131.method997((byte) 124, 94608000L) }, 0);
                    }
                    class160.method1188(new class30[] { class178.field3304, var5, class16.field327 }, 0).method286(class190.field3452.field1449, 0);
                } catch (Throwable var6) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field79;
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method38(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method32((byte) 127);
        if (arg2 >= -88) {
            this.field88 = null;
        }
        arg0.drawImage(super.field2770, arg1, arg3, this);
        ++field83;
    }

    @OriginalMember(owner = "client!gk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field93;
        this.field88 = arg0;
        arg0.setDimensions(super.field2775, super.field2774);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field91);
        arg0.setHints(14);
    }
}
