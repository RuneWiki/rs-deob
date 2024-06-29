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

@OriginalClass("client!sk")
public class class113 extends class304 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public static int field1738 = 0;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "[I")
    public static int[] field1742 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field1726 = 2;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lhc;")
    public static class190 field1724 = new class190();

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "Lna;")
    public static class279 field1745;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1733;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1744;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lug;II)Ljo;", line = 7)
    public static final class57 method967(class25 arg0, int arg1, int arg2) {
        field1729++;
        class57 var3 = new class57(arg1, arg0.method297((byte) -74), arg0.method297((byte) -74), arg0.method262((byte) 65), arg0.method262((byte) 82), ~arg0.method281(-126) == arg2, arg0.method281(arg2 ^ 0xFFFFFFEE));
        int var4 = arg0.method281(-124);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field903.method2245(new class338(arg0.method281(35), arg0.method281(-125), arg0.method314((byte) 106), arg0.method314((byte) 68), arg0.method314((byte) 97), arg0.method314((byte) 40), arg0.method314((byte) 110), arg0.method314((byte) 71), arg0.method314((byte) 62), arg0.method314((byte) 65)), 54);
        }
        var3.method574(arg2 + 2);
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIBI)V", line = 28)
    private final synchronized void method968(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1740++;
        if (this.field1744 != null) {
            this.field1744.setPixels(arg1, arg4, arg0, arg2, this.field1733, this.field4737, this.field4730 * arg4 + arg1, this.field4730);
            int var6 = -46 % ((61 - arg3) / 61);
            this.field1744.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)I", line = 45)
    public static final int method969(int arg0) {
        field1737++;
        if (class212.field3321 != null) {
            return 3;
        } else if (arg0 != 1) {
            return 117;
        } else if (class240.field3737 && class144.field2356) {
            return 2;
        } else if (class240.field3737 && !class144.field2356) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 66)
    public final void method970(int arg0, int arg1, byte arg2, Graphics arg3) {
        field1734++;
        int var5 = -3 / ((76 - arg2) / 38);
        this.method972(0);
        arg3.drawImage(this.field4736, arg0, arg1, this);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 78)
    public static final void method971(byte arg0) {
        field1735++;
        if (class212.field3283 != null || class256.field3937 != null || arg0 != 29 || class133.field2228 > 0) {
            return;
        }
        int var1 = class86.field1230;
        if (!class6.field89) {
            if (var1 == 1 && class66.field1006 > 0) {
                short var13 = class356.field5670[class66.field1006 - 1];
                if (var13 == 43 || var13 == 3 || var13 == 24 || var13 == 9 || var13 == 7 || var13 == 21 || var13 == 47 || var13 == 12 || var13 == 15 || var13 == 51 || var13 == 16 || var13 == 1009) {
                    int var14 = class90.field1278[class66.field1006 - 1];
                    int var15 = class41.field654[class66.field1006 - 1];
                    class342 var16 = class355.method2497(0, var14);
                    class227 var17 = client.method1022(var16);
                    if (var17.method1702(false) || var17.method1693(-99)) {
                        class31.field490 = 0;
                        class277.field4282 = false;
                        if (class212.field3283 != null) {
                            class339.method2380(class212.field3283, 110);
                        }
                        class212.field3283 = class355.method2497(arg0 - 29, var14);
                        class283.field4383 = class305.field4745;
                        class115.field1770 = class254.field3916;
                        class42.field664 = var15;
                        class339.method2380(class212.field3283, 111);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class120.field1865 == 1 && class66.field1006 > 2 || class350.method2457(false, class66.field1006 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class66.field1006 > 0 || class307.field4755 == 1) {
                class10.method103(89);
            }
            if (var1 == 1 && class66.field1006 > 0 || class307.field4755 == 2) {
                class57.method570(29311);
            }
            return;
        }
        if (var1 != 1) {
            int var2 = class78.field1129;
            int var3 = class268.field4137;
            if (var3 < class10.field141 - 10 || (class10.field141 + class43.field700 + 10) < var3 || var2 < class310.field4785 - 10 || (class310.field4785 + class135.field2259 + 10) < var2) {
                class6.field89 = false;
                class89.method800(class135.field2259, (byte) -64, class43.field700, class310.field4785, class10.field141);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class10.field141;
        int var5 = class310.field4785;
        int var6 = class305.field4745;
        int var7 = class43.field700;
        int var8 = -1;
        int var9 = class254.field3916;
        for (int var10 = 0; var10 < class66.field1006; var10++) {
            if (class149.field2444) {
                int var12 = (class66.field1006 - var10 - 1) * 15 + (var5 + 33);
                if (var4 < var6 && (var4 + var7) > var6 && (var12 - 13) < var9 && var9 < var12 + 3) {
                    var8 = var10;
                }
            } else {
                int var11 = var5 + ((class66.field1006 - var10 + -1) * 15) + 31;
                if (var6 > var4 && var6 < var4 + var7 && var11 - 13 < var9 && var9 < var11 + 3) {
                    var8 = var10;
                }
            }
        }
        if (var8 != -1) {
            class83.method746(true, var8);
        }
        class6.field89 = false;
        class89.method800(class135.field2259, (byte) -64, class43.field700, class310.field4785, class10.field141);
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V", line = 221)
    private final synchronized void method972(int arg0) {
        field1743++;
        if (this.field1744 != null) {
            this.field1744.setPixels(0, arg0, this.field4730, this.field4733, this.field1733, this.field4737, 0, this.field4730);
            this.field1744.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 241)
    public final void method973(Component arg0, int arg1, int arg2, int arg3) {
        this.field4737 = new int[arg1 * arg3 + 1];
        this.field4730 = arg3;
        if (arg2 != 6195) {
            return;
        }
        this.field4733 = arg1;
        this.field1733 = new DirectColorModel(32, 16711680, 65280, 255);
        field1731++;
        this.field4736 = arg0.createImage(this);
        this.method972(0);
        arg0.prepareImage(this.field4736, this);
        this.method972(arg2 - 6195);
        arg0.prepareImage(this.field4736, this);
        this.method972(0);
        arg0.prepareImage(this.field4736, this);
        this.method2190(1);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Ljg;", line = 264)
    public static final class297 method974(int arg0, int arg1, int arg2) {
        class329 var3 = class170.field2689[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field5063; var4++) {
            class297 var5 = var3.field5070[var4];
            if ((var5.field4611 >> 29 & 0x3L) == 2L && var5.field4616 == arg1 && var5.field4614 == arg2) {
                class268.method1970(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILrg;)Ljava/lang/String;", line = 288)
    public static final String method975(int arg0, int arg1, class342 arg2) {
        field1727++;
        if (!client.method1022(arg2).method1701(true, arg1) && arg2.field5422 == null) {
            return null;
        } else if (arg2.field5406 == null || arg2.field5406.length <= arg1 || arg2.field5406[arg1] == null || arg2.field5406[arg1].trim().length() == 0) {
            return class18.field290 ? "Hidden-" + arg1 : null;
        } else {
            if (arg0 != 23192) {
                method969(-19);
            }
            return arg2.field5406[arg1];
        }
    }

    @OriginalMember(owner = "client!sk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 320)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1728++;
        return this.field1744 == arg0;
    }

    @OriginalMember(owner = "client!sk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 328)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field1739++;
        this.field1744 = arg0;
        arg0.setDimensions(this.field4730, this.field4733);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1733);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 345)
    public final void method976(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        field1725++;
        this.method968(arg4, arg3, arg2, (byte) -124, arg1);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg1, arg4, arg2);
        arg5.drawImage(this.field4736, 0, 0, this);
        arg5.setClip(var7);
        if (arg0 != 8) {
            field1742 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZIIIIIF)[[I", line = 362)
    public static final int[][] method977(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8) {
        int[][] var9 = new int[arg5][arg0];
        field1730++;
        class49 var10 = new class49();
        var10.field761 = (int) (arg8 * 4096.0F);
        var10.field772 = arg7;
        var10.field756 = arg6;
        var10.field758 = arg4;
        var10.field767 = arg2;
        var10.method476(0);
        class295.method2129(arg5, arg0, (byte) -128);
        for (int var11 = 0; var11 < arg5; var11++) {
            var10.method474(var11, -126, var9[var11]);
        }
        int var12 = -41 / ((arg3 + 61) / 43);
        return var9;
    }

    @OriginalMember(owner = "client!sk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 391)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1744 == arg0) {
            this.field1744 = null;
        }
        field1741++;
    }

    @OriginalMember(owner = "client!sk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 402)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1747++;
    }

    @OriginalMember(owner = "client!sk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 418)
    public final void startProduction(ImageConsumer arg0) {
        field1732++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lrn;IB)[Lkk;", line = 432)
    public static final class77[] method978(class18 arg0, int arg1, byte arg2) {
        field1746++;
        if (arg2 <= 26) {
            method967((class25) null, -110, -55);
        }
        return class122.method1058(-15575, arg1, arg0) ? class176.method1371((byte) 29) : null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 447)
    public static void method979(boolean arg0) {
        field1724 = null;
        field1745 = null;
        if (arg0) {
            field1742 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 464)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1736++;
        return true;
    }
}
