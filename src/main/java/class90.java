import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class90 extends class44 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!na", name = "J", descriptor = "[I")
    public static int[] field2300 = new int[25];

    @OriginalMember(owner = "client!na", name = "G", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2297 = new CRC32();

    @OriginalMember(owner = "client!na", name = "N", descriptor = "Lrd;")
    public static class117 field2304 = class95.method812("Neuer Benutzer", (byte) 8);

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field2306 = 1;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "Lrd;")
    public static class117 field2309 = class95.method812("Benutzen Sie bitte eine andere Welt)3", (byte) 8);

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field2311 = 0;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "Lrd;")
    private static class117 field2310 = class95.method812("Add ignore", (byte) 8);

    @OriginalMember(owner = "client!na", name = "V", descriptor = "Lrd;")
    public static class117 field2312 = class95.method812("(Udns", (byte) 8);

    @OriginalMember(owner = "client!na", name = "X", descriptor = "Lrd;")
    public static class117 field2314 = field2310;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "Lrd;")
    public static class117 field2313 = class95.method812("titlebox", (byte) 8);

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "Lva;")
    public static class138 field2315;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "Lea;")
    public static class30 field2308;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "Lga;")
    public static class44 field2307;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2289;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2293;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "[Lra;")
    public static class114[] field2305;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILea;I[Lhc;IIBII[B)V")
    public static final void method789(int arg0, int arg1, class30 arg2, int arg3, class52[] arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, byte[] arg10) {
        if (arg7 < 94) {
            field2313 = null;
        }
        ++field2286;
        class14 var11 = new class14(arg10);
        int var12 = -1;
        while (true) {
            int var13 = var11.method169(99);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method169(80);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 12;
                int var17 = (var14 & 4056) >> 6;
                int var18 = var14 & 63;
                int var19 = var11.method153(true);
                int var20 = var19 >> 2;
                int var21 = 3 & var19;
                if (~arg6 == ~var16 && ~var17 <= ~arg8 && ~var17 > ~(arg8 + 8) && arg9 <= var18 && arg9 - -8 > var18) {
                    class62 var22 = class147.method1191((byte) 85, var12);
                    int var23 = class45.method489(arg5, (byte) -60, 7 & var18, var21, 7 & var17, var22.field1750, var22.field1737) + arg0;
                    int var24 = arg3 - -class5.method38(arg5, var22.field1737, 7 & var17, var21, 7 & var18, (byte) -41, var22.field1750);
                    if (~var23 < -1 && ~var24 < -1 && var23 < 103 && ~var24 > -104) {
                        int var25 = arg1;
                        if (~(2 & class124.field3002[1][var23][var24]) == -3) {
                            var25 = arg1 - 1;
                        }
                        class52 var26 = null;
                        if (~var25 <= -1) {
                            var26 = arg4[var25];
                        }
                        class41.method472(-80, arg1, 3 & arg5 + var21, arg2, var12, var23, var26, var20, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2299;
        if (this.field2293 == arg0) {
            this.field2293 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILge;II)Z")
    public static final boolean method790(int arg0, class47 arg1, int arg2, int arg3) {
        if (arg2 != 16711680) {
            field2297 = null;
        }
        byte[] var4 = arg1.method526((byte) 118, arg3, arg0);
        ++field2294;
        if (var4 == null) {
            return false;
        } else {
            class64.method647((byte) 104, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)I")
    public static final int method791(byte arg0) {
        if (arg0 != -86) {
            field2310 = null;
        }
        ++field2296;
        return class36.field1060++;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(III)Lrd;")
    public static final class117 method792(int arg0, int arg1, int arg2) {
        ++field2302;
        int var3 = -arg0 + arg2;
        if (~var3 > 8) {
            return class93.field2349;
        } else if (~var3 > 5) {
            return class17.field404;
        } else if (~var3 > 2) {
            return class16.field377;
        } else {
            if (arg1 != 19501) {
                method795(98);
            }
            if (~var3 > -1) {
                return class33.field989;
            } else if (var3 > 9) {
                return class134.field3211;
            } else if (~var3 < -7) {
                return class54.field1541;
            } else if (var3 > 3) {
                return class144.field3459;
            } else {
                return ~var3 < -1 ? class111.field2768 : class15.field346;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2291;
        return true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public final void method486(int arg0, byte arg1, Component arg2, int arg3) {
        super.field1250 = new int[arg0 * arg3 - -1];
        int var5 = -114 % ((60 - arg1) / 61);
        ++field2295;
        super.field1246 = arg0;
        super.field1245 = arg3;
        this.field2289 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1247 = arg2.createImage(this);
        this.method793((byte) -93);
        arg2.prepareImage(super.field1247, this);
        this.method793((byte) -93);
        arg2.prepareImage(super.field1247, this);
        this.method793((byte) -93);
        arg2.prepareImage(super.field1247, this);
        this.method488(-7913);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    private final synchronized void method793(byte arg0) {
        if (arg0 == -93) {
            ++field2290;
            if (this.field2293 != null) {
                this.field2293.setPixels(0, 0, super.field1245, super.field1246, this.field2289, super.field1250, 0, super.field1245);
                this.field2293.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Ltb;")
    public static final class127 method794(int arg0, int arg1) {
        class127 var2 = (class127) class136.field3244.method774((long) arg0, 329);
        if (arg1 < 2) {
            method789(75, -5, (class30) null, 43, (class52[]) null, -42, 73, (byte) 91, -67, -6, (byte[]) null);
        }
        ++field2287;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class86.field2249.method526((byte) 115, 16, arg0);
            class127 var4 = new class127();
            if (var3 != null) {
                var4.method1007(new class14(var3), -1);
            }
            class136.field3244.method773((long) arg0, (byte) -17, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!na", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2288;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!na", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2285;
        this.field2293 = arg0;
        arg0.setDimensions(super.field1245, super.field1246);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2289);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static final void method795(int arg0) {
        ++field2292;
        short var1 = 256;
        for (int var2 = 10; ~var2 > -118; ++var2) {
            int var17 = (int) (100.0D * Math.random());
            if (var17 < 50) {
                class101.field2531[(var1 + -2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; ++var3) {
            int var14 = (int) (Math.random() * 124.0D) + 2;
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = var14 - -(var15 << 7);
            class101.field2531[var16] = 192;
        }
        for (int var4 = 1; var1 + -1 > var4; ++var4) {
            for (int var12 = 1; var12 < 127; ++var12) {
                int var13 = (var4 << 7) + var12;
                class94.field2354[var13] = (class101.field2531[var13 + -1] + class101.field2531[var13 + 1] - (-class101.field2531[var13 - -128] + -class101.field2531[var13 + -128])) / 4;
            }
        }
        class41.field1197 += 128;
        if (~class41.field1197 < ~class100.field2489.length) {
            int var5 = (int) (12.0D * Math.random());
            class41.field1197 -= class100.field2489.length;
            class13.method110(class119.field2929[var5], (byte) 83);
        }
        if (arg0 <= 11) {
            field2315 = null;
        }
        for (int var6 = 1; ~(var1 + -1) < ~var6; ++var6) {
            for (int var9 = 1; ~var9 > -128; ++var9) {
                int var10 = (var6 << 7) + var9;
                int var11 = class94.field2354[var10 + 128] + -(class100.field2489[var10 - -class41.field1197 & class100.field2489.length - 1] / 5);
                if (~var11 > -1) {
                    var11 = 0;
                }
                class101.field2531[var10] = var11;
            }
        }
        for (int var7 = 0; ~(var1 + -1) < ~var7; ++var7) {
            class72.field2023[var7] = class72.field2023[var7 + 1];
        }
        class72.field2023[var1 - 1] = (int) (Math.sin((double) class85.field2236 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class85.field2236 / 15.0D) + 12.0D * Math.sin((double) class85.field2236 / 16.0D));
        if (class128.field3111 > 0) {
            class128.field3111 -= 4;
        }
        if (~class18.field448 < -1) {
            class18.field448 -= 4;
        }
        if (class128.field3111 == 0 && class18.field448 == 0) {
            int var8 = (int) (Math.random() * 2000.0D);
            if (~var8 == -1) {
                class128.field3111 = 1024;
            }
            if (~var8 == -2) {
                class18.field448 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2298;
    }

    @OriginalMember(owner = "client!na", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2301;
        return this.field2293 == arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method485(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field2303;
        this.method793((byte) -93);
        arg3.drawImage(super.field1247, arg1, arg0, this);
        if (arg2 != -6898) {
            method796(-50);
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public static void method796(int arg0) {
        field2310 = null;
        field2304 = null;
        field2297 = null;
        field2314 = null;
        field2308 = null;
        field2315 = null;
        field2305 = null;
        field2312 = null;
        field2307 = null;
        field2309 = null;
        if (arg0 > -89) {
            field2300 = null;
        }
        field2313 = null;
        field2300 = null;
    }
}
