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

@OriginalClass("client!m")
public class class114 extends class21 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field2169 = 0;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "Z")
    public static boolean field2181 = false;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Ljd;")
    public static class86 field2188 = class122.method868("gleiten:", true);

    @OriginalMember(owner = "client!m", name = "D", descriptor = "Ljd;")
    public static class86 field2180 = class122.method868("Untersuchen", true);

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2176;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2171;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "[I")
    public static int[] field2184;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "[I")
    public static int[] field2190;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "[Lmk;")
    public static class101[] field2185;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[S")
    public static short[] field2167;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "[[[Lsa;")
    public static class249[][][] field2191;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
    public static void method805(byte arg0) {
        field2184 = null;
        field2180 = null;
        field2185 = null;
        field2167 = null;
        field2190 = null;
        if (arg0 == 110) {
            field2191 = null;
            field2188 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2171 = arg0;
        ++field2170;
        arg0.setDimensions(super.field546, super.field549);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2176);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILgj;)I")
    public static final int method806(int arg0, class224 arg1) {
        ++field2174;
        int var2 = arg1.field4037;
        if (arg0 != 3) {
            return 27;
        } else {
            if (arg1.field739 == arg1.field701) {
                var2 = arg1.field4035;
            } else if (~arg1.field736 == ~arg1.field701) {
                var2 = arg1.field4022;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public final void method158(int arg0, Graphics arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field2171 = null;
        }
        this.method809((byte) 13);
        arg1.drawImage(super.field542, arg0, arg2, this);
        ++field2175;
    }

    @OriginalMember(owner = "client!m", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2166;
        if (this.field2171 == arg0) {
            this.field2171 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method159(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        this.method808(arg0, arg1, arg5, arg3, (byte) 20);
        ++field2177;
        if (arg4 < -62) {
            Shape var7 = arg2.getClip();
            arg2.clipRect(arg3, arg5, arg1, arg0);
            arg2.drawImage(super.field542, 0, 0, this);
            arg2.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method160(Component arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            ++field2186;
            super.field539 = new int[arg2 * arg3 + 1];
            super.field546 = arg3;
            super.field549 = arg2;
            this.field2176 = new DirectColorModel(32, 16711680, 65280, 255);
            super.field542 = arg0.createImage(this);
            this.method809((byte) 13);
            arg0.prepareImage(super.field542, this);
            this.method809((byte) 13);
            arg0.prepareImage(super.field542, this);
            this.method809((byte) 13);
            arg0.prepareImage(super.field542, this);
            this.method157(true);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(B)Ljk;")
    public static final class241 method807(byte arg0) {
        ++field2173;
        try {
            if (arg0 > -1) {
                method805((byte) 33);
            }
            return (class241) Class.forName("kd").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method808(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field2183;
        if (this.field2171 != null) {
            this.field2171.setPixels(arg3, arg2, arg1, arg0, this.field2176, super.field539, super.field546 * arg2 - -arg3, super.field546);
            this.field2171.imageComplete(2);
            int var6 = 2 % ((arg4 - -71) / 48);
        }
    }

    @OriginalMember(owner = "client!m", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2187;
        return true;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
    private final synchronized void method809(byte arg0) {
        ++field2172;
        if (this.field2171 != null) {
            this.field2171.setPixels(0, 0, super.field546, super.field549, this.field2176, super.field539, 0, super.field546);
            if (arg0 != 13) {
                this.field2176 = null;
            }
            this.field2171.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([Lig;IZI[BB)V")
    public static final void method810(class9[] arg0, int arg1, boolean arg2, int arg3, byte[] arg4, byte arg5) {
        ++field2178;
        class200 var6 = new class200(arg4);
        if (arg5 >= -18) {
            field2190 = null;
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method1424(32767);
            if (~var8 == -1) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1402(20740);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = (var9 & 4058) >> 6;
                int var12 = var9 & 63;
                int var13 = var6.method1408((byte) -67);
                int var14 = var13 >> 2;
                int var15 = var9 >> 12;
                int var16 = var13 & 3;
                int var17 = arg3 + var11;
                int var18 = arg1 + var12;
                if (var17 > 0 && ~var18 < -1 && ~var17 > -104 && ~var18 > -104) {
                    class9 var19 = null;
                    if (!arg2) {
                        int var20 = var15;
                        if ((2 & class86.field1693[1][var17][var18]) == 2) {
                            var20 = var15 - 1;
                        }
                        if (~var20 <= -1) {
                            var19 = arg0[var20];
                        }
                    }
                    class183.method1267(!arg2, var18, var15, var15, false, var17, var19, var14, var7, var16, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2182;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V")
    public static final void method811(int arg0, byte arg1) {
        ++field2189;
        class161 var2 = class204.method1456(true, 11, arg0);
        var2.method1173(true);
        if (arg1 >= -99) {
            method807((byte) -81);
        }
    }

    @OriginalMember(owner = "client!m", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2179;
    }

    @OriginalMember(owner = "client!m", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2168;
        return this.field2171 == arg0;
    }
}
