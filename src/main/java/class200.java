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

@OriginalClass("client!cc")
public class class200 extends class116 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lia;")
    public static class257 field3415 = class28.method234(127, "(U");

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "Lia;")
    public static class257 field3433 = class28.method234(-49, ")4a=");

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "Lia;")
    public static class257 field3429 = class28.method234(-82, "Stufe)2");

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "Lia;")
    private static class257 field3420 = class28.method234(-104, "Use");

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lia;")
    public static class257 field3414 = field3420;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3435;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3425;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    public final void method825(int arg0, int arg1, Component arg2, boolean arg3) {
        super.field2084 = new int[arg0 * arg1 + 1];
        super.field2091 = arg0;
        ++field3430;
        super.field2087 = arg1;
        this.field3435 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2090 = arg2.createImage(this);
        this.method1345(8830);
        arg2.prepareImage(super.field2090, this);
        this.method1345(8830);
        if (arg3) {
            arg2.prepareImage(super.field2090, this);
            this.method1345(8830);
            arg2.prepareImage(super.field2090, this);
            this.method827((byte) -124);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static void method1342(byte arg0) {
        field3414 = null;
        field3415 = null;
        field3420 = null;
        field3433 = null;
        if (arg0 >= 34) {
            field3429 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3426;
        this.field3425 = arg0;
        arg0.setDimensions(super.field2091, super.field2087);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3435);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILmb;)[Lfe;")
    public static final class155[] method1343(int arg0, int arg1, class178 arg2) {
        ++field3419;
        if (!class231.method1505(arg0 ^ -1882, arg2, arg1)) {
            return null;
        } else {
            if (arg0 != 23093) {
                method1346((byte) -73, 48, (class178) null);
            }
            return class243.method1597(true);
        }
    }

    @OriginalMember(owner = "client!cc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3437;
        if (this.field3425 == arg0) {
            this.field3425 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZIIILjava/awt/Graphics;)V")
    public final void method824(int arg0, boolean arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.method1344(arg0, arg2, arg3, 12389, arg4);
        if (arg1) {
            method1342((byte) -6);
        }
        ++field3436;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg2, arg0, arg4);
        arg5.drawImage(super.field2090, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method830(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method1345(arg1 + 1097343582);
        if (arg1 == -1097334752) {
            ++field3416;
            arg3.drawImage(super.field2090, arg0, arg2, this);
        }
    }

    @OriginalMember(owner = "client!cc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3427;
    }

    @OriginalMember(owner = "client!cc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3424;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1344(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3418;
        if (arg3 != 12389) {
            method1348(-128, -122, -15);
        }
        if (this.field3425 != null) {
            this.field3425.setPixels(arg2, arg1, arg0, arg4, this.field3435, super.field2084, super.field2091 * arg1 - -arg2, super.field2091);
            this.field3425.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    private final synchronized void method1345(int arg0) {
        ++field3422;
        if (this.field3425 != null) {
            this.field3425.setPixels(0, 0, super.field2091, super.field2087, this.field3435, super.field2084, 0, super.field2091);
            if (arg0 != 8830) {
                method1346((byte) 18, 63, (class178) null);
            }
            this.field3425.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILmb;)Llc;")
    public static final class90 method1346(byte arg0, int arg1, class178 arg2) {
        ++field3417;
        if (!class231.method1505(-23917, arg2, arg1)) {
            return null;
        } else {
            if (arg0 >= -45) {
                method1342((byte) 91);
            }
            return class94.method688((byte) -124);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method1347(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        ++field3431;
        int var9 = -arg0 + arg7;
        boolean var10;
        if (~class244.field4233 < -1 && class244.field4233 % 10 < 5) {
            var10 = true;
        } else {
            var10 = false;
        }
        int var11 = -arg2 + arg6;
        int var12 = (-arg8 + arg3 << 16) / var11;
        int var13 = (arg4 - arg1 << 16) / var9;
        if (arg5 <= -65) {
            for (int var14 = 0; var11 > var14; ++var14) {
                int var31 = var12 * var14 >> 16;
                int var32 = (var14 - -1) * var12 >> 16;
                int var33 = -var31 + var32;
                if (~var33 < -1) {
                    int var34 = arg8 + var31;
                    int var10000 = arg8 + var32;
                    int[][] var36 = class257.field4438[arg2 + var14 >> 6];
                    for (int var37 = 0; var9 > var37; ++var37) {
                        int var38 = var13 * var37 >> 16;
                        int var39 = (var37 + 1) * var13 >> 16;
                        int var40 = -var38 + var39;
                        if (~var40 < -1) {
                            var10000 = arg1 + var39;
                            int var42 = arg1 + var38;
                            int var43 = var37 - -arg0 >> 6;
                            if (var36[var43] != null) {
                                int var44 = (var37 - -arg0 << 6 & 4032) + (63 & var14 - -arg2);
                                int var45 = var36[var43][var44];
                                if (~var45 != -1) {
                                    class233 var46 = class5.method96(var45 - 1, false);
                                    if (var10 && field3421 == var46.field3975) {
                                        class227 var47 = new class227();
                                        var47.field3814 = var34;
                                        var47.field3815 = var42;
                                        var47.field3818 = var46.field3975;
                                        class144.field2525.method287(var47, 0);
                                    }
                                    class104.field1943[var46.field3975].method486(var34 + -7, var42 + -7);
                                }
                            }
                        }
                    }
                }
            }
            if (class32.field628 == class15.field332) {
                for (class209 var15 = (class209) class144.field2522.method288(26111); var15 != null; var15 = (class209) class144.field2522.method277(1)) {
                    int var16 = var15.field3581;
                    int var17 = var15.field3567;
                    int var18 = var16 - class182.field3159;
                    int var19 = 16777215;
                    int var20 = -var17 + class181.field3149 + class8.field174;
                    int var21 = var15.field3574;
                    class51 var22 = null;
                    int var23 = arg8 - -((var18 - arg2) * (-arg8 + arg3) / (-arg2 + arg6));
                    int var24 = (var20 - arg0) * (-arg1 + arg4) / (-arg0 + arg7) + arg1;
                    if (~var21 == -1) {
                        if (class15.field332 == 3.0D) {
                            var22 = class138.field2460;
                        }
                        if (class15.field332 == 4.0D) {
                            var22 = class241.field4163;
                        }
                        if (class15.field332 == 6.0D) {
                            var22 = class182.field3174;
                        }
                        if (class15.field332 == 8.0D) {
                            var22 = class158.field2778;
                        }
                    }
                    if (~var21 == -2) {
                        if (class15.field332 == 3.0D) {
                            var22 = class182.field3174;
                        }
                        if (class15.field332 == 4.0D) {
                            var22 = class158.field2778;
                        }
                        if (class15.field332 == 6.0D) {
                            var22 = class68.field1361;
                        }
                        if (class15.field332 == 8.0D) {
                            var22 = class197.field3333;
                        }
                    }
                    if (~var21 == -3) {
                        var19 = 16755200;
                        if (class15.field332 == 3.0D) {
                            var22 = class68.field1361;
                        }
                        if (class15.field332 == 4.0D) {
                            var22 = class197.field3333;
                        }
                        if (class15.field332 == 6.0D) {
                            var22 = class209.field3571;
                        }
                        if (class15.field332 == 8.0D) {
                            var22 = class11.field201;
                        }
                    }
                    if (var22 != null) {
                        class257[] var25 = var15.field3576;
                        int var26 = var25.length;
                        int var27 = var24 - (var26 + -1) * var22.method395() / 2;
                        int var28 = var27 + var22.method398() / 2;
                        for (int var29 = 0; var26 > var29; ++var29) {
                            var22.method402(var25[var29], var23, var28, var19, true);
                            var28 += var22.method395();
                        }
                    }
                }
            }
            for (class227 var30 = (class227) class144.field2525.method288(26111); var30 != null; var30 = (class227) class144.field2525.method277(1)) {
                class104.field1943[var30.field3818].method486(var30.field3814 + -7, var30.field3815 + -7);
                class23.method203(var30.field3814, var30.field3815, 15, 16776960, 128);
                class23.method203(var30.field3814, var30.field3815, 7, 16777215, 256);
            }
            class144.field2525.method282(-127);
        }
    }

    @OriginalMember(owner = "client!cc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3423;
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3432;
        return this.field3425 == arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)J")
    public static final long method1348(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        } else {
            for (int var4 = 0; var4 < var3.field3012; ++var4) {
                class154 var5 = var3.field3017[var4];
                if ((var5.field2702 >> 29 & 3L) == 2L && var5.field2693 == arg1 && var5.field2688 == arg2) {
                    return var5.field2702;
                }
            }
            return 0L;
        }
    }
}
