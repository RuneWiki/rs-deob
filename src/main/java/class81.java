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

@OriginalClass("client!ja")
public class class81 extends class80 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "Lsa;")
    public static class162 field1766 = new class162(64);

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "Lcd;")
    public static class23 field1768 = class54.method414("hel", -1);

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "Lcd;")
    public static class23 field1770 = class54.method414("<col=ff0000>", -1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "Lkg;")
    public static class96 field1769 = new class96(5000);

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "[Lcd;")
    public static class23[] field1771 = new class23[500];

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "Lcd;")
    public static class23 field1772 = class54.method414("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", -1);

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "Lcd;")
    public static class23 field1774 = class54.method414("Mem:", -1);

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field1773 = 0;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1755;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1754;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V")
    public final void method545(Graphics arg0, byte arg1, int arg2, int arg3) {
        this.method548((byte) 110);
        ++field1767;
        arg0.drawImage(super.field1743, arg2, arg3, this);
        if (arg1 != 96) {
            method552((byte) -45);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    private final synchronized void method548(byte arg0) {
        ++field1765;
        if (this.field1754 != null) {
            this.field1754.setPixels(0, 0, super.field1735, super.field1740, this.field1755, super.field1741, 0, super.field1735);
            this.field1754.imageComplete(2);
            int var2 = 19 % (arg0 / 63);
        }
    }

    @OriginalMember(owner = "client!ja", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1754 = arg0;
        arg0.setDimensions(super.field1735, super.field1740);
        arg0.setProperties((Hashtable) null);
        ++field1751;
        arg0.setColorModel(this.field1755);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ja", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1759;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method549(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field1757;
        if (this.field1754 != null) {
            this.field1754.setPixels(arg2, arg4, arg0, arg1, this.field1755, super.field1741, super.field1735 * arg4 - -arg2, super.field1735);
            if (arg3 == -120) {
                this.field1754.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public final void method546(int arg0, int arg1, Component arg2, byte arg3) {
        ++field1753;
        super.field1741 = new int[arg0 * arg1 + 1];
        super.field1740 = arg1;
        super.field1735 = arg0;
        this.field1755 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1743 = arg2.createImage(this);
        this.method548((byte) -83);
        if (arg3 > -68) {
            field1766 = null;
        }
        arg2.prepareImage(super.field1743, this);
        this.method548((byte) -69);
        arg2.prepareImage(super.field1743, this);
        this.method548((byte) 125);
        arg2.prepareImage(super.field1743, this);
        this.method542(7350);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
    public final void method544(Graphics arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 116) {
            this.removeConsumer((ImageConsumer) null);
        }
        this.method549(arg1, arg2, arg4, (byte) -120, arg5);
        ++field1761;
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg4, arg5, arg1, arg2);
        arg0.drawImage(super.field1743, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!ja", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1763;
        return true;
    }

    @OriginalMember(owner = "client!ja", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1764;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!ja", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1754 == arg0) {
            this.field1754 = null;
        }
        ++field1756;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method550(byte arg0) {
        field1772 = null;
        field1770 = null;
        field1766 = null;
        if (arg0 <= 103) {
            method551(71, -128, -114, -34, -94, 127, 83, 14);
        }
        field1769 = null;
        field1771 = null;
        field1768 = null;
        field1774 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1752;
        if (arg5 != -5021) {
            method550((byte) -35);
        }
        if (arg7 >= 1 && ~arg2 <= -2 && ~arg7 >= -103 && arg2 <= 102) {
            if (class193.field3810 && ~class59.field1385 != ~arg3) {
                return;
            }
            boolean var8 = false;
            int var9 = 0;
            if (~arg0 == -1) {
                var9 = class205.field4041.method784(arg3, arg7, arg2);
            }
            if (arg0 == 1) {
                var9 = class205.field4041.method781(arg3, arg7, arg2);
            }
            if (arg0 == 2) {
                var9 = class205.field4041.method818(arg3, arg7, arg2);
            }
            boolean var10 = true;
            if (~arg0 == -4) {
                var9 = class205.field4041.method783(arg3, arg7, arg2);
            }
            boolean var11 = false;
            if (var9 != 0) {
                int var12 = var9 >> 14 & 32767;
                int var13 = class205.field4041.method802(arg3, arg7, arg2, var9);
                int var14 = 3 & var13 >> 6;
                int var15 = var13 & 31;
                if (~arg0 == -1) {
                    class205.field4041.method810(arg3, arg7, arg2);
                    class104 var16 = class65.method486(var12, (byte) -66);
                    if (~var16.field2224 != -1) {
                        class62.field1435[arg3].method415(arg2, arg7, var16.field2217, 1, var14, var15);
                    }
                }
                if (arg0 == 1) {
                    class205.field4041.method778(arg3, arg7, arg2);
                }
                if (~arg0 == -3) {
                    class205.field4041.method814(arg3, arg7, arg2);
                    class104 var17 = class65.method486(var12, (byte) -66);
                    if (var17.field2232 + arg7 > 103 || var17.field2232 + arg2 > 103 || arg7 - -var17.field2205 > 103 || var17.field2205 + arg2 > 103) {
                        return;
                    }
                    if (~var17.field2224 != -1) {
                        class62.field1435[arg3].method421(arg7, -79, arg2, var14, var17.field2232, var17.field2217, var17.field2205);
                    }
                }
                if (arg0 == 3) {
                    class205.field4041.method812(arg3, arg7, arg2);
                    class104 var18 = class65.method486(var12, (byte) -66);
                    if (var18.field2224 == 1) {
                        class62.field1435[arg3].method424(false, arg7, arg2);
                    }
                }
            }
            if (~arg6 <= -1) {
                int var19 = arg3;
                if (~arg3 > -4 && (2 & class53.field1253[1][arg7][arg2]) == 2) {
                    var19 = arg3 + 1;
                }
                class199.method1321(class62.field1435[arg3], arg3, arg7, class205.field4041, var19, false, arg2, arg1, arg6, arg4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)Z")
    public static final boolean method552(byte arg0) {
        ++field1762;
        class193 var1 = class176.field3499;
        synchronized (class176.field3499) {
            if (arg0 != 53) {
                method550((byte) 102);
            }
            if (class69.field1623 == class63.field1451) {
                return false;
            } else {
                class67.field1581 = class189.field3743[class63.field1451];
                class168.field3351 = class108.field2308[class63.field1451];
                class63.field1451 = 127 & class63.field1451 + 1;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1758;
        return this.field1754 == arg0;
    }
}
