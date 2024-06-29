import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class295 extends class136 implements ImageProducer {

    @OriginalMember(owner = "client!io", name = "y", descriptor = "[I")
    public static int[] field4290 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!io", name = "D", descriptor = "I")
    public static int field4294 = 0;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field4302 = -1;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    public static int field4303 = 0;

    @OriginalMember(owner = "client!io", name = "s", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!io", name = "t", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!io", name = "v", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!io", name = "w", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!io", name = "x", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!io", name = "A", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!io", name = "N", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4301;

    @OriginalMember(owner = "client!io", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field4283;

    @OriginalMember(owner = "client!io", name = "I", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4299;

    @OriginalMember(owner = "client!io", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4286;

    @OriginalMember(owner = "client!io", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4297;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
    public static final void method1959(boolean arg0) {
        ++field4284;
        if (!arg0) {
            class363 var1 = class148.field2017;
            synchronized (class148.field2017) {
                class148.field2017.method2307(-88);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field4286 == arg0) {
            this.field4286 = null;
        }
        ++field4296;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
    public final void method859(int arg0, int arg1, byte arg2, int arg3, Graphics arg4, int arg5) {
        this.method1964(arg0, arg3, arg1, arg5, 2);
        ++field4285;
        if (arg2 < 126) {
            field4290 = null;
        }
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg0, arg1, arg5);
        arg4.drawImage(this.field4283, 0, 0, this.field4301);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
    public static void method1960(boolean arg0) {
        field4290 = null;
        if (!arg0) {
            field4303 = -108;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILmj;Lmj;IZ)I")
    public static final int method1961(int arg0, class177 arg1, class177 arg2, int arg3, boolean arg4) {
        ++field4304;
        if (arg3 == 1) {
            int var5 = arg2.field1838;
            int var6 = arg1.field1838;
            if (!arg4) {
                if (~var5 == 0) {
                    var5 = 2001;
                }
                if (~var6 == 0) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (arg3 == 2) {
            return class388.method2453(class153.field2073, 32767, arg1.method1229(false).field2070, arg2.method1229(false).field2070);
        } else {
            int var7 = -48 % ((arg0 - -81) / 39);
            if (~arg3 == -4) {
                if (arg2.field2451.equals("-")) {
                    if (arg1.field2451.equals("-")) {
                        return 0;
                    } else {
                        return arg4 ? -1 : 1;
                    }
                } else if (arg1.field2451.equals("-")) {
                    return arg4 ? 1 : -1;
                } else {
                    return class388.method2453(class153.field2073, 32767, arg1.field2451, arg2.field2451);
                }
            } else if (arg3 == 4) {
                if (!arg2.method896(-288)) {
                    return !arg1.method896(-288) ? 0 : -1;
                } else {
                    return !arg1.method896(-288) ? 1 : 0;
                }
            } else if (~arg3 == -6) {
                if (!arg2.method897(true)) {
                    return arg1.method897(true) ? -1 : 0;
                } else {
                    return arg1.method897(true) ? 0 : 1;
                }
            } else if (~arg3 == -7) {
                if (!arg2.method898((byte) 119)) {
                    return !arg1.method898((byte) 122) ? 0 : -1;
                } else {
                    return arg1.method898((byte) 126) ? 0 : 1;
                }
            } else if (~arg3 == -8) {
                if (arg2.method899((byte) 62)) {
                    return !arg1.method899((byte) 62) ? 1 : 0;
                } else {
                    return arg1.method899((byte) 62) ? -1 : 0;
                }
            } else if (arg3 == 8) {
                int var8 = arg2.field2446;
                int var9 = arg1.field2446;
                if (!arg4) {
                    if (~var9 == 0) {
                        var9 = 1000;
                    }
                    if (~var8 == 0) {
                        var8 = 1000;
                    }
                } else {
                    if (var9 == 1000) {
                        var9 = -1;
                    }
                    if (~var8 == -1001) {
                        var8 = -1;
                    }
                }
                return -var9 + var8;
            } else {
                return -arg1.field2445 + arg2.field2445;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(Z)V")
    private final synchronized void method1962(boolean arg0) {
        ++field4293;
        if (this.field4286 != null) {
            if (arg0) {
                this.field4286.setPixels(0, 0, super.field1863, super.field1856, this.field4299, super.field1857, 0, super.field1863);
                this.field4286.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Lun;")
    public static final class327 method1963(int arg0, int arg1) {
        ++field4300;
        class363 var2 = class124.field1645;
        class327 var3;
        synchronized (class124.field1645) {
            var3 = (class327) class124.field1645.method2310((byte) -126, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class231.field3462.method715(class141.method936(arg1, false), (byte) 86, class269.method1848((byte) 65, arg1));
            class327 var5 = new class327();
            var5.field4847 = arg1;
            if (var4 != null) {
                var5.method2138((byte) 118, new class256(var4));
            }
            var5.method2133(-125);
            if (arg0 < 12) {
                field4303 = -71;
            }
            class363 var6 = class124.field1645;
            synchronized (class124.field1645) {
                class124.field1645.method2299(true, var5, (long) arg1);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method858(Canvas arg0, int arg1) {
        this.field4301 = arg0;
        if (arg1 != 16628) {
            method1959(true);
        }
        ++field4288;
        super.field1863 = this.field4301.getSize().width;
        super.field1856 = this.field4301.getSize().height;
        super.field1857 = new int[super.field1863 * super.field1856];
        this.field4299 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field4283 = this.field4301.createImage(this);
        this.method1962(true);
        this.field4301.prepareImage(this.field4283, this.field4301);
        this.method1962(true);
        this.field4301.prepareImage(this.field4283, this.field4301);
        this.method1962(true);
        this.field4301.prepareImage(this.field4283, this.field4301);
    }

    @OriginalMember(owner = "client!io", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field4287;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1964(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4291;
        if (this.field4286 != null) {
            this.field4286.setPixels(arg1, arg0, arg2, arg3, this.field4299, super.field1857, super.field1863 * arg0 + arg1, super.field1863);
            this.field4286.imageComplete(arg4);
        }
    }

    @OriginalMember(owner = "client!io", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field4286 = arg0;
        ++field4298;
        arg0.setDimensions(super.field1863, super.field1856);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4299);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILkg;)V")
    public static final void method1965(int arg0, class223 arg1) {
        if (arg0 != 0) {
            method1959(true);
        }
        ++field4295;
        class223 var2 = class248.method1648((byte) -128, arg1);
        int var3;
        int var4;
        if (var2 != null) {
            var3 = var2.field3233;
            var4 = var2.field3352;
        } else {
            var4 = class375.field5473;
            var3 = class214.field3016;
        }
        class187.method1278((byte) 119, var4, var3, false, arg1);
        class227.method1558((byte) -123, arg1, var4, var3);
    }

    @OriginalMember(owner = "client!io", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4292;
        return this.field4286 == arg0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public final void method860(int arg0, Graphics arg1, int arg2, byte arg3) {
        if (arg3 >= -74) {
            this.method1962(true);
        }
        this.method1962(true);
        ++field4289;
        arg1.drawImage(this.field4283, arg2, arg0, this.field4301);
    }
}
