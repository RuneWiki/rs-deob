import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class211 extends class51 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Lsc;")
    public static class181 field3619 = class149.method967(255, "::noclip");

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field3622 = 0;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Lsc;")
    public static class181 field3630 = class149.method967(255, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field3615 = 0;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3620 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Ljb;")
    public static class11 field3621;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3631;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3634;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIBII)V")
    private final synchronized void method1394(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field3638;
        if (this.field3634 != null) {
            if (arg2 != -68) {
                this.imageUpdate((Image) null, 123, 85, -81, 44, -93);
            }
            this.field3634.setPixels(arg0, arg1, arg3, arg4, this.field3631, super.field808, super.field804 * arg1 + arg0, super.field804);
            this.field3634.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!me", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3634 == arg0) {
            this.field3634 = null;
        }
        ++field3617;
    }

    @OriginalMember(owner = "client!me", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3633;
        return this.field3634 == arg0;
    }

    @OriginalMember(owner = "client!me", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3616;
        return true;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    private final synchronized void method1395(boolean arg0) {
        ++field3628;
        if (!arg0) {
            this.field3634 = null;
        }
        if (this.field3634 != null) {
            this.field3634.setPixels(0, 0, super.field804, super.field800, this.field3631, super.field808, 0, super.field804);
            this.field3634.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!me", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3614;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILqa;ZI)V")
    public static final void method1396(int arg0, int arg1, int arg2, class254 arg3, boolean arg4, int arg5) {
        ++field3618;
        if (class258.field4512 < 50) {
            if (arg3.field4434 != null && ~arg5 > ~arg3.field4434.length && arg3.field4434[arg5] != null) {
                if (arg1 != -1287515740) {
                    field3620 = null;
                }
                int var6 = arg3.field4434[arg5][0];
                int var7 = var6 >> 4 & 7;
                int var8 = var6 >> 8;
                int var9 = 15 & var6;
                if (arg3.field4434[arg5].length > 1) {
                    int var10 = (int) (Math.random() * (double) arg3.field4434[arg5].length);
                    if (var10 > 0) {
                        var8 = arg3.field4434[arg5][var10];
                    }
                }
                if (~var9 == -1) {
                    if (arg4) {
                        class45.method302((byte) 48, var8, 0, var7);
                    }
                } else if (class55.field849 != 0) {
                    int var11 = (arg2 - 64) / 128;
                    class111.field1824[class258.field4512] = var8;
                    class132.field2185[class258.field4512] = var7;
                    class94.field1512[class258.field4512] = 0;
                    class192.field3378[class258.field4512] = null;
                    int var12 = (arg0 + -64) / 128;
                    class93.field1471[class258.field4512] = (var11 << 16) + (var12 << 8) + var9;
                    ++class258.field4512;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field3619 = null;
        if (arg0 != 415063568) {
            method1396(20, 29, 53, (class254) null, true, -80);
        }
        field3620 = null;
        field3621 = null;
        field3630 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public final void method379(byte arg0, Component arg1, int arg2, int arg3) {
        super.field808 = new int[arg2 * arg3 - -1];
        if (arg0 <= 103) {
            this.field3631 = null;
        }
        ++field3627;
        super.field804 = arg3;
        super.field800 = arg2;
        this.field3631 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field803 = arg1.createImage(this);
        this.method1395(true);
        arg1.prepareImage(super.field803, this);
        this.method1395(true);
        arg1.prepareImage(super.field803, this);
        this.method1395(true);
        arg1.prepareImage(super.field803, this);
        this.method385(0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
    public final void method381(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5) {
        this.method1394(arg5, arg4, (byte) -68, arg1, arg0);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg4, arg1, arg0);
        ++field3637;
        arg3.drawImage(super.field803, 0, 0, this);
        if (!arg2) {
            arg3.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Lpd;")
    public static final class48 method1398(byte arg0) {
        ++field3626;
        byte[] var1 = class143.field2319[0];
        int var2 = class196.field3425[0] * class121.field1978[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3[var4] = class254.field4443[class5.method43(255, var1[var4])];
        }
        class48 var5 = new class48(class219.field3777, class78.field1273, class220.field3782[0], class23.field410[0], class196.field3425[0], class121.field1978[0], var3);
        class143.method919(16);
        if (arg0 != -45) {
            field3622 = -94;
        }
        return var5;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[B")
    public static final byte[] method1399(int arg0, int arg1) {
        ++field3632;
        class13 var2 = (class13) class173.field2910.method990((byte) 80, (long) arg1);
        if (arg0 != 0) {
            method1402((class195) null, (byte[]) null, 17, -83);
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class136.method879((byte) -122, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class13(var3);
            class173.field2910.method982(var2, (byte) 60, (long) arg1);
        }
        return var2.field259;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Z")
    public static final boolean method1400(int arg0, int arg1) {
        ++field3623;
        if (arg0 != 16126) {
            method1402((class195) null, (byte[]) null, 91, -102);
        }
        return ~((arg1 & 1169381749) >> 30) != -1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([[II)V")
    public static final void method1401(int[][] arg0, int arg1) {
        if (arg1 != 128) {
            method1402((class195) null, (byte[]) null, 95, -14);
        }
        ++field3625;
        class149.field2507 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3636;
        this.field3634 = arg0;
        arg0.setDimensions(super.field804, super.field800);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3631);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!me", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3629;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method386(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method1395(true);
        ++field3635;
        arg0.drawImage(super.field803, arg3, arg2, this);
        if (arg1 != 0) {
            field3620 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Llg;[BII)V")
    public static final void method1402(class195 arg0, byte[] arg1, int arg2, int arg3) {
        class131 var4 = new class131();
        var4.field2164 = 0;
        if (arg3 != -11937) {
            method1397(91);
        }
        ++field3624;
        var4.field2168 = arg0;
        var4.field606 = (long) arg2;
        var4.field2165 = arg1;
        class247 var5 = class194.field3398;
        synchronized (class194.field3398) {
            class194.field3398.method1689(var4, arg3 + 12014);
        }
        class227.method1486(true);
    }
}
