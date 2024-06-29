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

@OriginalClass("client!tk")
public class class130 extends class197 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "Leg;")
    public static class37 field2160 = class174.method1167("mapflag", -60);

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Leg;")
    public static class37 field2161 = class174.method1167("loginscreen", 92);

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "Leg;")
    public static class37 field2169 = class174.method1167("Lade Sprites )2 ", -88);

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2167;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2176;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public final void method920(byte arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 == -113) {
            this.method929(arg0 ^ 91);
            arg1.drawImage(super.field3356, arg2, arg3, this);
            ++field2170;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)I")
    public static final int method921(int arg0) {
        ++field2163;
        int var1 = -121 % ((-12 - arg0) / 52);
        return 0;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
    public static void method922(int arg0) {
        field2161 = null;
        field2160 = null;
        field2169 = null;
        if (arg0 != -24165) {
            method921(119);
        }
    }

    @OriginalMember(owner = "client!tk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2172;
        if (this.field2176 == arg0) {
            this.field2176 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2175;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)V")
    public static final void method923(boolean arg0, int arg1) {
        ++field2159;
        if (arg1 != -1) {
            if (class40.field638[arg1]) {
                class30.field444.method659(arg1, 0);
                if (class232.field4000[arg1] != null) {
                    boolean var2 = arg0;
                    for (int var3 = 0; ~class232.field4000[arg1].length < ~var3; ++var3) {
                        if (class232.field4000[arg1][var3] != null) {
                            if (class232.field4000[arg1][var3].field4228 != 2) {
                                class232.field4000[arg1][var3] = null;
                            } else {
                                var2 = false;
                            }
                        }
                    }
                    if (var2) {
                        class232.field4000[arg1] = null;
                    }
                    class40.field638[arg1] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)V")
    public static final void method924(byte arg0, int arg1) {
        ++field2157;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                class94.method616(113);
            } else {
                if (arg1 != 2) {
                    throw new RuntimeException();
                }
                class26.method151((byte) 111);
            }
            if (arg0 != -119) {
                method928(-38, -46, -46, -102, (class165) null, (byte) -64, 47);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIZI)V")
    private final synchronized void method925(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            this.method929(-12);
        }
        ++field2166;
        if (this.field2176 != null) {
            this.field2176.setPixels(arg4, arg2, arg0, arg1, this.field2167, super.field3345, super.field3355 * arg2 + arg4, super.field3355);
            this.field2176.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljl;B)V")
    public static final void method926(class101 arg0, byte arg1) {
        if (arg1 >= -59) {
            field2160 = null;
        }
        ++field2177;
        class59.field968 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method927(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        this.method925(arg1, arg0, arg5, true, arg3);
        if (arg4 <= -102) {
            ++field2165;
            Shape var7 = arg2.getClip();
            arg2.clipRect(arg3, arg5, arg1, arg0);
            arg2.drawImage(super.field3356, 0, 0, this);
            arg2.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!tk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2168;
        return this.field2176 == arg0;
    }

    @OriginalMember(owner = "client!tk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2173;
        return true;
    }

    @OriginalMember(owner = "client!tk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2158;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIILaf;BI)V")
    public static final void method928(int arg0, int arg1, int arg2, int arg3, class165 arg4, byte arg5, int arg6) {
        ++field2162;
        long var7 = 0L;
        if (~arg1 == -1) {
            var7 = class23.method141(arg3, arg2, arg6);
        } else if (~arg1 != -2) {
            if (~arg1 != -3) {
                if (~arg1 == -4) {
                    var7 = class89.method589(arg3, arg2, arg6);
                }
            } else {
                var7 = class175.method1170(arg3, arg2, arg6);
            }
        } else {
            var7 = class64.method451(arg3, arg2, arg6);
        }
        int var9 = 60 % ((arg5 - -68) / 53);
        boolean var10 = true;
        boolean var11 = false;
        int var12 = ((int) var7 & 3412105) >> 20;
        int var13 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class133 var14 = class178.method1186(var13, 0);
        if (var14.method956(18972)) {
            class270.method1804(-251, arg6, arg2, arg3, var14);
        }
        boolean var15 = false;
        int var16 = ((int) var7 & 517292) >> 14;
        if (~var7 != -1L) {
            if (~arg1 != -1) {
                if (arg1 == 1) {
                    class263.method1776(arg3, arg2, arg6);
                    return;
                }
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        class156.method1064(arg3, arg2, arg6);
                        if (~var14.field2254 == -2) {
                            arg4.method1107(arg6, arg2, 3);
                            return;
                        }
                    }
                    return;
                }
                class198.method1374(arg3, arg2, arg6);
                if (var14.field2254 != 0 && ~(var14.field2272 + arg2) > -105 && var14.field2272 + arg6 < 104 && ~(var14.field2306 + arg2) > -105 && ~(var14.field2306 + arg6) > -105) {
                    arg4.method1102(-1, var14.field2279, var14.field2272, arg6, var12, var14.field2306, arg2);
                    return;
                }
                return;
            }
            class241.method1652(arg3, arg2, arg6);
            if (~var14.field2254 != -1) {
                arg4.method1114(var12, var16, arg2, arg6, var14.field2279, -1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
    private final synchronized void method929(int arg0) {
        ++field2174;
        if (this.field2176 != null) {
            this.field2176.setPixels(0, 0, super.field3355, super.field3352, this.field2167, super.field3345, 0, super.field3355);
            this.field2176.imageComplete(2);
            int var2 = -100 % ((arg0 - 62) / 34);
        }
    }

    @OriginalMember(owner = "client!tk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2164;
        this.field2176 = arg0;
        arg0.setDimensions(super.field3355, super.field3352);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2167);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public final void method930(int arg0, Component arg1, int arg2, boolean arg3) {
        super.field3345 = new int[arg0 * arg2 + 1];
        ++field2171;
        super.field3355 = arg2;
        super.field3352 = arg0;
        this.field2167 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3356 = arg1.createImage(this);
        this.method929(-62);
        arg1.prepareImage(super.field3356, this);
        this.method929(-70);
        arg1.prepareImage(super.field3356, this);
        this.method929(101);
        if (!arg3) {
            arg1.prepareImage(super.field3356, this);
            this.method1368(-112);
        }
    }
}
