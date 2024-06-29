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

@OriginalClass("mapview!la")
public class class23 extends class14 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "I")
    public static int field282 = 0;

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "I")
    public static volatile int field283 = 0;

    @OriginalMember(owner = "mapview!la", name = "l", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "mapview!la", name = "o", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field287;

    @OriginalMember(owner = "mapview!la", name = "m", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field285;

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "[I")
    public static int[] field281;

    @OriginalMember(owner = "mapview!la", name = "p", descriptor = "[Lj;")
    public static class6[] field288;

    @OriginalMember(owner = "mapview!la", name = "n", descriptor = "[[[I")
    public static int[][][] field286;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 9)
    public final void method102(int arg0, int arg1, int arg2, Component arg3) {
        super.field185 = new int[arg0 * arg2 - -1];
        super.field189 = arg0;
        super.field184 = arg2;
        this.field287 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field188 = arg3.createImage(this);
        this.method162(0);
        if (arg1 != 771) {
            field288 = (class6[]) null;
        }
        arg3.prepareImage(super.field188, this);
        this.method162(arg1 + -771);
        arg3.prepareImage(super.field188, this);
        this.method162(0);
        arg3.prepareImage(super.field188, this);
        this.method104(0);
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(I)B", line = 31)
    public static final byte method160(int arg0) {
        int var1 = -113 / ((arg0 - 63) / 62);
        return class12.field167 != null ? class12.field167[class12.field172] : 0;
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(Z)V", line = 48)
    public static void method161(boolean arg0) {
        field281 = null;
        if (!arg0) {
            field286 = (int[][][]) ((int[][][]) null);
        }
        field288 = null;
        field286 = (int[][][]) null;
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "(I)V", line = 63)
    private final synchronized void method162(int arg0) {
        if (this.field285 != null) {
            if (arg0 != 0) {
                this.field285 = (ImageConsumer) null;
            }
            this.field285.setPixels(0, 0, super.field189, super.field184, this.field287, super.field185, 0, super.field189);
            this.field285.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 77)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "(I)V", line = 80)
    public static final void method163(int arg0) {
        class1 var1 = class17.field212;
        synchronized (class17.field212) {
            class26.field308 = class3.field77;
            if (0 > class27.field312) {
                for (int var2 = 0; -113 < ~var2; ++var2) {
                    class10.field156[var2] = false;
                }
                class27.field312 = class9.field147;
            } else {
                while (~class9.field147 != ~class27.field312) {
                    int var3 = class35.field437[class9.field147];
                    class9.field147 = 127 & class9.field147 + 1;
                    if (~var3 > -1) {
                        class10.field156[~var3] = false;
                    } else {
                        class10.field156[var3] = true;
                    }
                }
            }
            if (arg0 != -1) {
                field281 = (int[]) null;
            }
            class3.field77 = class1.field65;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 124)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field285 == arg0;
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "(Z)V", line = 131)
    public static final void method164(boolean arg0) {
        if (class13.field180[0][class24.field296][class31.field396] != null) {
            class20.field228 = class13.field180[0][class24.field296][class31.field396];
        } else {
            class20.field228 = null;
        }
        if (class13.field180[1][class24.field296][class31.field396] == null) {
            class31.field400 = null;
        } else {
            class31.field400 = class13.field180[1][class24.field296][class31.field396];
        }
        if (class13.field180[2][class24.field296][class31.field396] != null) {
            class27.field314 = class13.field180[2][class24.field296][class31.field396];
        } else {
            class27.field314 = null;
        }
        if (arg0) {
            field282 = 75;
        }
        if (class13.field180[3][class24.field296][class31.field396] == null) {
            class12.field167 = null;
        } else {
            class12.field167 = class13.field180[3][class24.field296][class31.field396];
        }
        if (class13.field180[4][class24.field296][class31.field396] != null) {
            class35.field440 = class13.field180[4][class24.field296][class31.field396];
        } else {
            class35.field440 = null;
        }
        if (class17.field215[class24.field296][class31.field396] == null) {
            class9.field155 = null;
        } else {
            class9.field155 = class17.field215[class24.field296][class31.field396];
        }
        if (class31.field393[class24.field296][class31.field396] != null) {
            class14.field191 = class31.field393[class24.field296][class31.field396];
        } else {
            class14.field191 = null;
        }
        if (field286[class24.field296][class31.field396] == null) {
            class34.field430 = null;
        } else {
            class34.field430 = field286[class24.field296][class31.field396];
        }
    }

    @OriginalMember(owner = "mapview!la", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 183)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field285 == arg0) {
            this.field285 = null;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 194)
    public final void method107(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg1 <= -65) {
            this.method162(0);
            arg2.drawImage(super.field188, arg3, arg0, this);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 208)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!la", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 216)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!la", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 249)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field285 = arg0;
        arg0.setDimensions(super.field189, super.field184);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field287);
        arg0.setHints(14);
    }
}
