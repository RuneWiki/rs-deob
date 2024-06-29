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

@OriginalClass("client!ld")
public class class122 extends class64 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "[Lqb;")
    public static class102[] field2196 = new class102[32768];

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "[I")
    public static int[] field2199 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "Lud;")
    public static class279 field2205 = class130.method1024("<)4col> x", 255);

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Ljl;")
    public static class262 field2202;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2206;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2189;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "[Lom;")
    public static class70[] field2193;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "[[B")
    public static byte[][] field2204;

    @OriginalMember(owner = "client!ld", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 4)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2189 = arg0;
        field2201++;
        arg0.setDimensions(this.field1315, this.field1309);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2206);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ld", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 20)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field2209++;
        return this.field2189 == arg0;
    }

    @OriginalMember(owner = "client!ld", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 32)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2189 == arg0) {
            this.field2189 = null;
        }
        field2192++;
    }

    @OriginalMember(owner = "client!ld", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 48)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2208++;
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 65)
    public final void startProduction(ImageConsumer arg0) {
        field2200++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBILjava/awt/Component;)V", line = 77)
    public final void method542(int arg0, byte arg1, int arg2, Component arg3) {
        field2207++;
        this.field1313 = new int[arg0 * arg2 + 1];
        this.field1315 = arg0;
        this.field1309 = arg2;
        if (arg1 != -44) {
            method963(7, (byte) 62, 69, (class149) null, (class149) null);
        }
        this.field2206 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1316 = arg3.createImage(this);
        this.method965((byte) -109);
        arg3.prepareImage(this.field1316, this);
        this.method965((byte) -127);
        arg3.prepareImage(this.field1316, this);
        this.method965((byte) -125);
        arg3.prepareImage(this.field1316, this);
        this.method562(32);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([ILqg;[I[II)V", line = 103)
    public static final void method961(int[] arg0, class239 arg1, int[] arg2, int[] arg3, int arg4) {
        field2203++;
        for (int var5 = arg4; var5 < arg2.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var8 != 0 && arg1.field87.length > var9) {
                if ((var8 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field87[var9] = null;
                    } else {
                        class182 var10 = class131.method1033((byte) -82, var7);
                        int var11 = var10.field3317;
                        class266 var12 = arg1.field87[var9];
                        if (var12 != null) {
                            if (var12.field4783 == var7) {
                                if (var11 == 0) {
                                    var12 = arg1.field87[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4796 = 0;
                                    var12.field4791 = var6;
                                    var12.field4787 = 1;
                                    var12.field4789 = 0;
                                    var12.field4793 = 0;
                                    class194.method1460(class72.field1420 == arg1, arg1.field86, 0, var10, arg1.field79, (byte) 109);
                                } else if (var11 == 2) {
                                    var12.field4793 = 0;
                                }
                            } else if (var10.field3321 >= class131.method1033((byte) -82, var12.field4783).field3321) {
                                var12 = arg1.field87[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class266 var13 = arg1.field87[var9] = new class266();
                            var13.field4783 = var7;
                            var13.field4789 = 0;
                            var13.field4793 = 0;
                            var13.field4791 = var6;
                            var13.field4796 = 0;
                            var13.field4787 = 1;
                            class194.method1460(class72.field1420 == arg1, arg1.field86, 0, var10, arg1.field79, (byte) 104);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 205)
    public static void method962(int arg0) {
        field2204 = (byte[][]) null;
        field2196 = null;
        field2205 = null;
        if (arg0 < 80) {
            method963(-46, (byte) -104, 22, (class149) null, (class149) null);
        }
        field2199 = null;
        field2202 = null;
        field2193 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBILok;Lok;)Llm;", line = 220)
    public static final class49 method963(int arg0, byte arg1, int arg2, class149 arg3, class149 arg4) {
        field2194++;
        if (arg1 != 105) {
            field2198 = 90;
        }
        return class137.method1066(arg0, 25486, arg4, arg2) ? class255.method1823(-31, arg3.method1192(0, arg2, arg0)) : null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 236)
    public final void method543(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        field2195++;
        this.method964(arg1, arg0, (byte) -68, arg2, arg4);
        if (arg5 == 27588) {
            Shape var7 = arg3.getClip();
            arg3.clipRect(arg2, arg0, arg4, arg1);
            arg3.drawImage(this.field1316, 0, 0, this);
            arg3.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBII)V", line = 256)
    private final synchronized void method964(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2210++;
        if (arg2 > -12) {
            field2191 = -123;
        }
        if (this.field2189 != null) {
            this.field2189.setPixels(arg3, arg1, arg4, arg0, this.field2206, this.field1313, this.field1315 * arg1 + arg3, this.field1315);
            this.field2189.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V", line = 275)
    private final synchronized void method965(byte arg0) {
        if (arg0 >= -92) {
            return;
        }
        field2188++;
        if (this.field2189 != null) {
            this.field2189.setPixels(0, 0, this.field1315, this.field1309, this.field2206, this.field1313, 0, this.field1315);
            this.field2189.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ld", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 291)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field2197++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 302)
    public final void method541(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -6) {
            field2202 = (class262) null;
        }
        field2190++;
        this.method965((byte) -113);
        arg0.drawImage(this.field1316, arg3, arg2, this);
    }
}
