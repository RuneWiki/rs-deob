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

@OriginalClass("client!ml")
public class class253 extends class296 implements ImageProducer {

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3859;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field3863;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3856;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3860;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V", line = 3)
    private final synchronized void method1515(int arg0) {
        ++field3865;
        if (this.field3860 != null) {
            if (arg0 > -25) {
                field3861 = 96;
            }
            this.field3860.setPixels(0, 0, super.field4491, super.field4498, this.field3856, super.field4493, 0, super.field4491);
            this.field3860.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IBII)Lta;", line = 19)
    public static final class135 method1516(int arg0, byte arg1, int arg2, int arg3) {
        ++field3857;
        class268 var4 = class321.field4830[arg0][arg3][arg2];
        if (var4 == null) {
            return null;
        } else {
            class135 var5 = null;
            if (arg1 > -10) {
                return null;
            } else {
                int var6 = -1;
                for (class297 var7 = var4.field4045; var7 != null; var7 = var7.field4500) {
                    class205 var8 = var7.field4505;
                    if (var8 instanceof class135) {
                        class135 var9 = (class135) var8;
                        int var10 = 64 * (var9.method337(0) - 1) + 60;
                        int var11 = -var10 + var9.field3218 >> 7;
                        int var12 = -var10 + var9.field3222 >> 7;
                        int var13 = var9.field3218 + var10 >> 7;
                        int var14 = var9.field3222 + var10 >> 7;
                        if (~var11 >= ~arg3 && arg2 >= var12 && ~var13 <= ~arg3 && var14 >= arg2) {
                            int var15 = (-arg3 + var13 - -1) * (var14 + 1 + -arg2);
                            if (~var15 < ~var6) {
                                var5 = var9;
                                var6 = var15;
                            }
                        }
                    }
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V", line = 81)
    private final synchronized void method1517(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3853;
        if (this.field3860 != null) {
            if (arg1 == -2636) {
                this.field3860.setPixels(arg0, arg2, arg4, arg3, this.field3856, super.field4493, super.field4491 * arg2 + arg0, super.field4491);
                this.field3860.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 96)
    public final void method1518(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 69) {
            ++field3867;
            this.method1515(-27);
            arg0.drawImage(this.field3863, arg2, arg3, this.field3859);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 109)
    public final void method1519(int arg0, Canvas arg1) {
        this.field3859 = arg1;
        ++field3855;
        if (arg0 != 0) {
            this.method1518((Graphics) null, -7, -52, 80);
        }
        super.field4491 = this.field3859.getSize().width;
        super.field4498 = this.field3859.getSize().height;
        super.field4493 = new int[super.field4498 * super.field4491];
        this.field3856 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3863 = this.field3859.createImage(this);
        this.method1515(-49);
        this.field3859.prepareImage(this.field3863, this.field3859);
        this.method1515(-103);
        this.field3859.prepareImage(this.field3863, this.field3859);
        this.method1515(-27);
        this.field3859.prepareImage(this.field3863, this.field3859);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lqh;I)V", line = 132)
    public static final void method1520(class47 arg0, int arg1) {
        ++field3869;
        class286 var2 = (class286) class199.field3141.method2409(false, (long) arg0.field2197);
        if (var2 != null) {
            if (var2.field4325 != null) {
                class178.field2786.method2099(var2.field4325);
                var2.field4325 = null;
            }
            var2.method1121(false);
        }
        if (arg1 > -71) {
            field3861 = 5;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(CI)C", line = 158)
    public static final char method1521(char arg0, int arg1) {
        ++field3868;
        if (~arg0 == -199) {
            return 'E';
        } else if (~arg0 == -231) {
            return 'e';
        } else if (~arg0 == -224) {
            return 's';
        } else {
            if (arg1 != 29661) {
                field3861 = 60;
            }
            if (~arg0 == -339) {
                return 'E';
            } else {
                return (char) (~arg0 == -340 ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 187)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3860 == arg0) {
            this.field3860 = null;
        }
        ++field3862;
    }

    @OriginalMember(owner = "client!ml", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 200)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3866;
    }

    @OriginalMember(owner = "client!ml", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 220)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3854;
        this.field3860 = arg0;
        arg0.setDimensions(super.field4491, super.field4498);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3856);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ml", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 232)
    public final void startProduction(ImageConsumer arg0) {
        ++field3870;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ml", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 242)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3858;
        return this.field3860 == arg0;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V", line = 250)
    public final void method1522(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method1517(arg5, -2636, arg0, arg3, arg2);
        ++field3864;
        if (arg4 < 35) {
            this.field3860 = null;
        }
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg5, arg0, arg2, arg3);
        arg1.drawImage(this.field3863, 0, 0, this.field3859);
        arg1.setClip(var7);
    }
}
