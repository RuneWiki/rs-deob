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

@OriginalClass("client!ef")
public class class35 extends class83 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "Lja;")
    private static class62 field832 = class30.method243(43, "Take");

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field838 = 0;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "[I")
    public static int[] field834 = new int[50];

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "Lja;")
    public static class62 field849 = field832;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Z")
    public static boolean field845 = false;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "Lja;")
    private static class62 field852 = class30.method243(43, "Loaded update list");

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "Lja;")
    public static class62 field839 = field852;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "Lja;")
    private static class62 field855 = class30.method243(43, "Use");

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "Lja;")
    public static class62 field827 = field855;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field853;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field831;

    @OriginalMember(owner = "client!ef", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field836;
        if (this.field831 == arg0) {
            this.field831 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field851;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
    public static final void method268(int arg0, int arg1) {
        ++field847;
        int[] var2 = class135.field3106.field1432;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; ++var5) {
            int var20 = (-var5 + 103) * 4 * 512 + 24628;
            for (int var21 = 1; var21 < 103; ++var21) {
                if ((24 & class155.field3581[arg0][var21][var5]) == 0) {
                    class119.field2703.method569(var2, var20, 512, arg0, var21, var5);
                }
                if (~arg0 > -4 && (8 & class155.field3581[arg0 + 1][var21][var5]) != 0) {
                    class119.field2703.method569(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class135.field3106.method408();
        int var6 = -10 + 238 + (int) (Math.random() * 20.0D) << 16;
        int var7 = -10 + (int) (20.0D * Math.random()) + 238 + ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * (double) arg1) + 238 + -10 << 16);
        for (int var8 = 1; ~var8 > -104; ++var8) {
            for (int var19 = 1; var19 < 103; ++var19) {
                if (~(class155.field3581[arg0][var19][var8] & 24) == -1) {
                    class110.method891((byte) -115, var8, arg0, var19, var6, var7);
                }
                if (~arg0 > -4 && ~(class155.field3581[arg0 + 1][var19][var8] & 8) != -1) {
                    class110.method891((byte) -115, var8, arg0 - -1, var19, var6, var7);
                }
            }
        }
        class97.field2264 = 0;
        for (int var9 = 0; ~var9 > -105; ++var9) {
            for (int var10 = 0; var10 < 104; ++var10) {
                int var11 = class119.field2703.method584(class155.field3598, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 32767;
                    int var13 = class84.method653(6, var12).field1598;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && ~var13 != -30 && var13 != 34 && var13 != 36 && ~var13 != -47 && ~var13 != -48 && ~var13 != -49) {
                            int[][] var16 = class131.field2991[class155.field3598].field3591;
                            for (int var17 = 0; ~var17 > -11; ++var17) {
                                int var18 = (int) (4.0D * Math.random());
                                if (var18 == 0 && ~var14 < -1 && var9 + -3 < var14 && (19661064 & var16[var14 + -1][var15]) == 0) {
                                    --var14;
                                }
                                if (~var18 == -2 && var14 < 103 && var14 < var9 + 3 && (19661184 & var16[var14 + 1][var15]) == 0) {
                                    ++var14;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 + -3 && ~(var16[var14][var15 + -1] & 19661058) == -1) {
                                    --var15;
                                }
                                if (~var18 == -4 && ~var15 > -104 && var10 - -3 > var15 && ~(19661088 & var16[var14][var15 - -1]) == -1) {
                                    ++var15;
                                }
                            }
                        }
                        class105.field2428[class97.field2264] = class130.field2980[var13];
                        class108.field2476[class97.field2264] = var14;
                        class139.field3228[class97.field2264] = var15;
                        ++class97.field2264;
                    }
                }
            }
        }
        class105.field2419.method651((byte) 114);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method83(int arg0, byte arg1, Graphics arg2, int arg3) {
        this.method270(arg1 + 155);
        arg2.drawImage(super.field2002, arg0, arg3, this);
        ++field848;
        if (arg1 != -119) {
            field838 = -88;
        }
    }

    @OriginalMember(owner = "client!ef", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field854;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method84(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg2 != -16711936) {
            field834 = null;
        }
        ++field837;
        this.method274(arg3, 32155, arg4, arg1, arg0);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg1, arg3, arg4);
        arg5.drawImage(super.field2002, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIB[B[Lwe;I)V")
    public static final void method269(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, class155[] arg5, int arg6) {
        for (int var7 = 0; var7 < 4; ++var7) {
            for (int var12 = 0; var12 < 64; ++var12) {
                for (int var13 = 0; var13 < 64; ++var13) {
                    if (~(arg6 - -var12) < -1 && ~(arg6 + var12) > -104 && arg1 + var13 > 0 && ~(arg1 + var13) > -104) {
                        arg5[var7].field3591[arg6 + var12][arg1 + var13] = class24.method192(arg5[var7].field3591[arg6 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        ++field843;
        class128 var8 = new class128(arg4);
        if (arg3 < 36) {
            method271((byte) 90);
        }
        for (int var9 = 0; ~var9 > -5; ++var9) {
            for (int var10 = 0; ~var10 > -65; ++var10) {
                for (int var11 = 0; ~var11 > -65; ++var11) {
                    class13.method96(0, var9, 22, var8, arg1 + var11, arg0, arg2, arg6 + var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field833;
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method82(int arg0, int arg1, Component arg2, int arg3) {
        super.field2008 = new int[arg1 * arg3 + 1];
        ++field840;
        if (arg0 != -2) {
            this.method274(76, -115, 92, -119, -105);
        }
        super.field2009 = arg1;
        super.field2011 = arg3;
        this.field853 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2002 = arg2.createImage(this);
        this.method270(36);
        arg2.prepareImage(super.field2002, this);
        this.method270(36);
        arg2.prepareImage(super.field2002, this);
        this.method270(36);
        arg2.prepareImage(super.field2002, this);
        this.method651((byte) 114);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    private final synchronized void method270(int arg0) {
        ++field828;
        if (this.field831 != null) {
            this.field831.setPixels(0, 0, super.field2009, super.field2011, this.field853, super.field2008, 0, super.field2009);
            this.field831.imageComplete(2);
            if (arg0 != 36) {
                this.removeConsumer((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field830;
        return this.field831 == arg0;
    }

    @OriginalMember(owner = "client!ef", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field850;
        this.field831 = arg0;
        arg0.setDimensions(super.field2009, super.field2011);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field853);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public static void method271(byte arg0) {
        field855 = null;
        field839 = null;
        field827 = null;
        field849 = null;
        if (arg0 != 106) {
            field852 = null;
        }
        field834 = null;
        field832 = null;
        field852 = null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public static final void method272(int arg0) {
        ++field844;
        if (arg0 != 0) {
            field834 = null;
        }
        class52.field1188.method127((byte) -115);
        class98.field2288.method127((byte) -122);
        class42.field968.method127((byte) -117);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BI)I")
    public static final int method273(int arg0, byte[] arg1, int arg2) {
        int var3 = 103 / ((-44 - arg0) / 34);
        ++field841;
        return class135.method1077(86, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method274(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field846;
        if (arg1 != 32155) {
            method273(-36, (byte[]) null, -115);
        }
        if (this.field831 != null) {
            this.field831.setPixels(arg4, arg3, arg0, arg2, this.field853, super.field2008, super.field2009 * arg3 + arg4, super.field2009);
            this.field831.imageComplete(2);
        }
    }
}
