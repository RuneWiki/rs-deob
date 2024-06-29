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

@OriginalClass("client!md")
public class class76 extends class16 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!md", name = "u", descriptor = "[I")
    public static int[] field1690 = new int[128];

    @OriginalMember(owner = "client!md", name = "x", descriptor = "[I")
    public static int[] field1693 = new int[25];

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "[I")
    public static int[] field1698 = new int[100];

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field1695 = 0;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "[I")
    public static int[] field1713 = new int[500];

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field1701 = 0;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Lec;")
    public static class28 field1711 = class28.method210(-46, "mapdots");

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field1716 = 0;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field1691 = 0;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Lec;")
    public static class28 field1707 = class28.method210(-46, "mapback");

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Lh;")
    public static class42 field1694 = new class42();

    @OriginalMember(owner = "client!md", name = "W", descriptor = "Lec;")
    public static class28 field1718 = class28.method210(-46, "mod_icons");

    @OriginalMember(owner = "client!md", name = "X", descriptor = "Lec;")
    public static class28 field1719 = class28.method210(-46, "Take @lre@");

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1708;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1717;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "[[[B")
    public static byte[][][] field1720;

    @OriginalMember(owner = "client!md", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1710;
        return true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method87(int arg0, Component arg1, int arg2, int arg3) {
        super.field312 = new int[arg0 * arg2 + 1];
        super.field301 = arg2;
        ++field1689;
        super.field307 = arg0;
        this.field1708 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field315 = arg1.createImage(this);
        this.method583(arg3 ^ 67);
        if (arg3 != -16) {
            field1718 = null;
        }
        arg1.prepareImage(super.field315, this);
        this.method583(arg3 ^ 123);
        arg1.prepareImage(super.field315, this);
        this.method583(-109);
        arg1.prepareImage(super.field315, this);
        this.method92((byte) -4);
    }

    @OriginalMember(owner = "client!md", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1704;
        this.field1717 = arg0;
        arg0.setDimensions(super.field307, super.field301);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1708);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!md", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1700;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!md", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field1702;
        if (this.field1717 == arg0) {
            this.field1717 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method580(int arg0) {
        if (arg0 != -28046) {
            field1707 = null;
        }
        class37.field856.method659(1000);
        ++field1699;
    }

    @OriginalMember(owner = "client!md", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1705;
    }

    @OriginalMember(owner = "client!md", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1709;
        return this.field1717 == arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method91(int arg0, Graphics arg1, int arg2, int arg3) {
        ++field1697;
        this.method583(arg2 ^ -11702);
        if (arg2 != 11675) {
            this.removeConsumer((ImageConsumer) null);
        }
        arg1.drawImage(super.field315, arg0, arg3, this);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method581(boolean arg0) {
        ++field1706;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; ++var2) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class83.field1898[var2 - -(var1 - 2 << 7)] = 255;
            }
        }
        for (int var3 = 0; ~var3 > -101; ++var3) {
            int var14 = (int) (124.0D * Math.random()) + 2;
            int var15 = (int) (128.0D * Math.random()) + 128;
            int var16 = (var15 << 7) + var14;
            class83.field1898[var16] = 192;
        }
        for (int var4 = 1; var1 + -1 > var4; ++var4) {
            for (int var12 = 1; ~var12 > -128; ++var12) {
                int var13 = var12 - -(var4 << 7);
                class126.field2738[var13] = (class83.field1898[var13 - 1] - -class83.field1898[var13 + 128] + class83.field1898[var13 + -128] + class83.field1898[var13 + 1]) / 4;
            }
        }
        class91.field2005 += 128;
        if (class22.field512.length < class91.field2005) {
            class91.field2005 -= class22.field512.length;
            int var5 = (int) (12.0D * Math.random());
            class40.method317(class129.field2798[var5], -101);
        }
        for (int var6 = 1; var6 < var1 + -1; ++var6) {
            for (int var9 = 1; ~var9 > -128; ++var9) {
                int var10 = (var6 << 7) + var9;
                int var11 = class126.field2738[var10 + 128] + -(class22.field512[var10 - -class91.field2005 & class22.field512.length + -1] / 5);
                if (~var11 > -1) {
                    var11 = 0;
                }
                class83.field1898[var10] = var11;
            }
        }
        if (arg0) {
            field1713 = null;
        }
        for (int var7 = 0; ~var7 > ~(var1 + -1); ++var7) {
            class12.field193[var7] = class12.field193[var7 - -1];
        }
        class12.field193[var1 - 1] = (int) (16.0D * Math.sin((double) class83.field1888 / 14.0D) + 14.0D * Math.sin((double) class83.field1888 / 15.0D) + 12.0D * Math.sin((double) class83.field1888 / 16.0D));
        if (class13.field234 > 0) {
            class13.field234 -= 4;
        }
        if (class7.field114 > 0) {
            class7.field114 -= 4;
        }
        if (~class13.field234 == -1 && class7.field114 == 0) {
            int var8 = (int) (2000.0D * Math.random());
            if (var8 == 1) {
                class7.field114 = 1024;
            }
            if (var8 == 0) {
                class13.field234 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static final void method582(byte arg0) {
        for (int var1 = 0; ~field1701 < ~var1; ++var1) {
            int var10002 = class2.field25[var1]--;
            if (class2.field25[var1] >= -10) {
                class44 var4 = class122.field2621[var1];
                if (var4 == null) {
                    var4 = class44.method348(class117.field2491, class42.field907[var1], 0);
                    if (var4 == null) {
                        continue;
                    }
                    class2.field25[var1] += var4.method349();
                    class122.field2621[var1] = var4;
                }
                if (class2.field25[var1] < 0) {
                    class101 var5 = var4.method347().method716(class11.field182);
                    class81 var6 = class81.method616(var5, 100, class50.field1176);
                    var6.method614(class91.field1998[var1] - 1);
                    class40.field863.method420(var6);
                    class2.field25[var1] = -100;
                }
            } else {
                --field1701;
                for (int var3 = var1; ~field1701 < ~var3; ++var3) {
                    class42.field907[var3] = class42.field907[var3 + 1];
                    class122.field2621[var3] = class122.field2621[var3 + 1];
                    class91.field1998[var3] = class91.field1998[var3 + 1];
                    class2.field25[var3] = class2.field25[var3 + 1];
                }
                --var1;
            }
        }
        int var2 = -40 % ((arg0 - -47) / 36);
        if (class7.field121 > 0) {
            class7.field121 -= 20;
            if (~class7.field121 > -1) {
                class7.field121 = 0;
            }
            if (class7.field121 == 0 && class77.field1735 != 0 && class47.field1074 != -1) {
                class66.method533(class47.field1074, 0, class77.field1735, 0, -119, class61.field1344, false);
            }
        }
        ++field1703;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    private final synchronized void method583(int arg0) {
        ++field1715;
        if (this.field1717 != null) {
            if (arg0 >= -44) {
                this.startProduction((ImageConsumer) null);
            }
            this.field1717.setPixels(0, 0, super.field307, super.field301, this.field1708, super.field312, 0, super.field307);
            this.field1717.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    public static void method584(int arg0) {
        field1694 = null;
        field1719 = null;
        field1713 = null;
        field1720 = null;
        if (arg0 != -25694) {
            field1692 = -117;
        }
        field1690 = null;
        field1707 = null;
        field1698 = null;
        field1711 = null;
        field1693 = null;
        field1718 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method585(byte arg0, Component arg1) {
        if (arg0 == 10) {
            ++field1696;
            arg1.addMouseListener(class16.field302);
            arg1.addMouseMotionListener(class16.field302);
        }
    }
}
