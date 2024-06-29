import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class148 extends class649 implements ImageProducer {

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "Lvg;")
    public static class49 field1809 = new class49();

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "Loe;")
    public static class183 field1822 = new class183();

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1805;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field1812;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1820;

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1817;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
    public static void method946(byte arg0) {
        field1809 = null;
        if (arg0 != -95) {
            field1809 = null;
        }
        field1822 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method947(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1810;
        if (this.field1817 != null) {
            this.field1817.setPixels(arg2, arg3, arg1, arg0, this.field1820, super.field9210, super.field9206 * arg3 + arg2, super.field9206);
            this.field1817.imageComplete(arg4);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1808;
        return this.field1817 == arg0;
    }

    @OriginalMember(owner = "client!dfa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1816;
        this.field1817 = arg0;
        arg0.setDimensions(super.field9206, super.field9209);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1820);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IZII)I")
    public static final int method948(int arg0, boolean arg1, int arg2, int arg3) {
        ++field1814;
        int var4 = arg0 & 3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else {
            if (arg1) {
                field1809 = null;
            }
            return ~var4 == -3 ? -arg3 + 4095 : -arg2 + 4095;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
    private final synchronized void method949(int arg0) {
        ++field1818;
        if (this.field1817 != null) {
            this.field1817.setPixels(0, 0, super.field9206, super.field9209, this.field1820, super.field9210, 0, super.field9206);
            int var2 = -95 % ((arg0 - -33) / 45);
            this.field1817.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method950(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        ++field1811;
        this.method947(arg0, arg4, arg2, arg1, 2);
        Shape var7 = arg3.getClip();
        if (arg5 <= 8) {
            this.field1812 = null;
        }
        arg3.clipRect(arg2, arg1, arg4, arg0);
        arg3.drawImage(this.field1812, 0, 0, this.field1805);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IBIII)V")
    public static final void method951(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field1821;
        float var5 = (float) class550.field7995 / (float) class550.field8003;
        int var6 = arg0;
        int var7 = arg2;
        if (!(var5 < 1.0F)) {
            var6 = (int) ((float) arg2 / var5);
        } else {
            var7 = (int) ((float) arg0 * var5);
        }
        int var8 = arg3 - (-var7 + arg2) / 2;
        if (arg1 >= 23) {
            int var9 = arg4 - (-var6 + arg0) / 2;
            class440.field6291 = -1;
            class426.field6111 = -(class550.field7995 * var8 / var7) + class550.field7995;
            class113.field1458 = -1;
            class418.field5921 = class550.field8003 * var9 / var6;
            class582.method3389(126);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public final void method952(Graphics arg0, int arg1, int arg2, byte arg3) {
        ++field1815;
        if (arg3 == -31) {
            this.method949(57);
            arg0.drawImage(this.field1812, arg2, arg1, this.field1805);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1823;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)V")
    public static final void method953(int arg0) {
        class472 var1 = class228.field2961;
        synchronized (class228.field2961) {
            class228.field2961.method2778((byte) 105);
        }
        ++field1806;
        if (arg0 != -3) {
            method948(38, false, -109, 100);
        }
    }

    @OriginalMember(owner = "client!dfa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1817 == arg0) {
            this.field1817 = null;
        }
        ++field1813;
    }

    @OriginalMember(owner = "client!dfa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1819;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method954(int arg0, Canvas arg1) {
        ++field1807;
        this.field1805 = arg1;
        super.field9206 = this.field1805.getSize().width;
        super.field9209 = this.field1805.getSize().height;
        super.field9210 = new int[super.field9209 * super.field9206];
        this.field1820 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1812 = this.field1805.createImage(this);
        this.method949(55);
        this.field1805.prepareImage(this.field1812, this.field1805);
        this.method949(-109);
        int var3 = -3 / ((arg0 - -3) / 62);
        this.field1805.prepareImage(this.field1812, this.field1805);
        this.method949(-125);
        this.field1805.prepareImage(this.field1812, this.field1805);
    }
}
