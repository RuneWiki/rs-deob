import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class99 extends class84 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!k", name = "A", descriptor = "Lrd;")
    private static class173 field1806 = class133.method843("Username: ", -74);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Lrd;")
    public static class173 field1798 = field1806;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "Lrd;")
    private static class173 field1823 = class133.method843("Loaded interfaces", 96);

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Lrd;")
    public static class173 field1804 = field1823;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "[I")
    public static int[] field1817 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "Lqf;")
    public static class165 field1815;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Lra;")
    public static class170 field1809;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1796;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1816;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
    public final void method410(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1821;
        this.method608(arg5, arg4, arg2, arg3, true);
        if (arg1 < 120) {
            field1823 = null;
        }
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg3, arg4, arg2);
        arg0.drawImage(super.field1670, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1811;
        if (arg1 == arg3) {
            class193.method1286(arg4, arg7, 0, arg3, arg5, arg2, arg0);
        } else {
            if (arg6 != -4378) {
                field1815 = null;
            }
            if (~(-arg3 + arg7) <= ~class194.field3778 && arg3 + arg7 <= class96.field1766 && ~class37.field790 >= ~(-arg1 + arg0) && ~class20.field445 <= ~(arg0 + arg1)) {
                class220.method1435(arg3, arg1, 814691650, arg2, arg4, arg7, arg0, arg5);
            } else {
                class54.method353(arg1, -1, arg2, arg7, arg4, arg3, arg5, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBIILqf;I)V")
    public static final void method604(int arg0, int arg1, byte arg2, int arg3, int arg4, class165 arg5, int arg6) {
        if (arg2 > 49) {
            ++field1800;
            int var7 = Math.min(arg5.field3156 / 2, arg5.field3105 / 2);
            int var8 = arg3 * arg3 + arg6 * arg6;
            if (~var8 < ~(var7 * var7) && var8 < 90000) {
                int var9 = 2047 & class140.field2614 - -class140.field2620;
                int var10 = class72.field1396[var9];
                int var11 = var10 * 256 / (class167.field3225 + 256);
                var7 -= 10;
                int var12 = class72.field1404[var9];
                int var13 = var12 * 256 / (class167.field3225 + 256);
                int var14 = arg6 * var13 + -(arg3 * var11) >> 16;
                int var15 = arg3 * var13 + arg6 * var11 >> 16;
                double var16 = Math.atan2((double) var15, (double) var14);
                int var18 = (int) (Math.sin(var16) * (double) var7);
                int var19 = (int) (Math.cos(var16) * (double) var7);
                class11.field178[arg1].method1216(arg5.field3156 / 2 + (arg0 - (-var18 - -10)), arg5.field3105 / 2 + -var19 + arg4 + -10, 20, 20, 15, 15, var16, 256);
            } else {
                class204.method1357(arg3, arg5, (byte) -63, arg4, class14.field302[arg1], arg0, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public static final void method605(int arg0) {
        if (class205.field4011 != null) {
            class179 var1 = class205.field4011;
            synchronized (class205.field4011) {
                class205.field4011 = null;
            }
        }
        if (arg0 == -17429) {
            ++field1822;
        }
    }

    @OriginalMember(owner = "client!k", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1814;
    }

    @OriginalMember(owner = "client!k", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1813;
        return this.field1816 == arg0;
    }

    @OriginalMember(owner = "client!k", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1797;
        return true;
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
    private final synchronized void method606(int arg0) {
        ++field1819;
        if (this.field1816 != null) {
            if (arg0 != 9568) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field1816.setPixels(0, 0, super.field1664, super.field1673, this.field1796, super.field1675, 0, super.field1664);
            this.field1816.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILbc;)V")
    public static final void method607(int arg0, class14 arg1) {
        if (arg0 == 0) {
            ++field1810;
            client.field646 = arg1;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIZ)V")
    private final synchronized void method608(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1805;
        if (this.field1816 != null) {
            this.field1816.setPixels(arg0, arg3, arg1, arg2, this.field1796, super.field1675, super.field1664 * arg3 + arg0, super.field1664);
            this.field1816.imageComplete(2);
            if (!arg4) {
                field1815 = null;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BZ)V")
    public static final void method609(byte arg0, boolean arg1) {
        ++field1820;
        class196.method1305(-87);
        ++class172.field3343;
        if (class172.field3343 >= 50 || arg1) {
            class172.field3343 = 0;
            if (!class158.field2960 && class34.field738 != null) {
                class165.field3175.method1023(193, -21822);
                try {
                    class34.field738.method1097(0, class165.field3175.field2218, class165.field3175.field2222, (byte) -84);
                    class165.field3175.field2222 = 0;
                } catch (IOException var2) {
                    class158.field2960 = true;
                }
                ++class58.field1153;
            }
            if (arg0 != -38) {
                field1823 = null;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1799;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
    public static void method610(int arg0) {
        field1809 = null;
        field1823 = null;
        field1806 = null;
        field1817 = null;
        field1798 = null;
        field1804 = null;
        int var1 = -20 / ((arg0 - -4) / 41);
        field1815 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method409(int arg0, int arg1, int arg2, Component arg3) {
        super.field1675 = new int[arg0 * arg1 + 1];
        ++field1801;
        super.field1673 = arg0;
        super.field1664 = arg1;
        this.field1796 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1670 = arg3.createImage(this);
        this.method606(9568);
        arg3.prepareImage(super.field1670, this);
        if (arg2 != -13717) {
            this.method608(-94, 95, 29, 3, true);
        }
        this.method606(9568);
        arg3.prepareImage(super.field1670, this);
        this.method606(arg2 + 23285);
        arg3.prepareImage(super.field1670, this);
        this.method552(-2001);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBIII)V")
    public static final void method611(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field1812;
        if (arg1 == -18) {
            if (arg0 >= class194.field3778 && class96.field1766 >= arg0) {
                int var5 = class68.method421(arg2, class37.field790, 112, class20.field445);
                int var6 = class68.method421(arg4, class37.field790, -71, class20.field445);
                class62.method390(var5, arg1 ^ 30513, var6, arg3, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1808;
        this.field1816 = arg0;
        arg0.setDimensions(super.field1664, super.field1673);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1796);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!k", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1816 == arg0) {
            this.field1816 = null;
        }
        ++field1803;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method411(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method606(9568);
        ++field1807;
        int var5 = 120 % ((27 - arg3) / 33);
        arg2.drawImage(super.field1670, arg1, arg0, this);
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
    public static final void method612(int arg0) {
        class84.field1669 = null;
        class125.field2352 = null;
        ++field1818;
        if (arg0 != 10) {
            field1809 = null;
        }
        class60.field1182 = null;
    }
}
