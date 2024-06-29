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

@OriginalClass("client!in")
public class class61 extends class426 implements ImageProducer {

    @OriginalMember(owner = "client!in", name = "U", descriptor = "[I")
    public static int[] field767 = new int[3];

    @OriginalMember(owner = "client!in", name = "W", descriptor = "[I")
    public static int[] field769 = new int[1];

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field763 = 0;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "[I")
    public static int[] field760 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!in", name = "H", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "Loi;")
    public static class53 field761;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "Ljava/awt/Canvas;")
    private Canvas field762;

    @OriginalMember(owner = "client!in", name = "X", descriptor = "Ljava/awt/Image;")
    private Image field770;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field758;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field756;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method492(Canvas arg0, int arg1) {
        this.field762 = arg0;
        ++field752;
        super.field5986 = this.field762.getSize().width;
        super.field5983 = this.field762.getSize().height;
        if (arg1 == -4) {
            super.field5981 = new int[super.field5986 * super.field5983];
            this.field758 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field770 = this.field762.createImage(this);
            this.method500(107);
            this.field762.prepareImage(this.field770, this.field762);
            this.method500(58);
            this.field762.prepareImage(this.field770, this.field762);
            this.method500(19);
            this.field762.prepareImage(this.field770, this.field762);
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V")
    public static final void method493(int arg0) {
        ++field757;
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class345.field5006[var1] = false;
        }
        class528.field7754 = class51.field619;
        class371.field5294 = class41.field450;
        class363.field5199 = 0;
        class400.field5631 = class478.field6654;
        class131.field1729 = -1;
        class47.field546 = class515.field7596;
        class68.field864 = class390.field5481;
        class101.field1343 = -1;
        class504.field7461 = 5;
        class190.field2722 = class8.field122;
        class350.field5036 = 0;
        if (arg0 != 22991) {
            method493(37);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIBIZ)Loi;")
    public static final class53 method494(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        ++field753;
        if (arg2 <= 28) {
            method493(-47);
        }
        class97 var5 = null;
        if (class259.field3841 != null) {
            var5 = new class97(arg1, class259.field3841, class449.field6284[arg1], 1000000);
        }
        class485.field6769[arg1] = class37.field407.method2733(class275.field4063, arg1, (byte) -68, var5);
        if (arg0) {
            class485.field6769[arg1].method734((byte) 53);
        }
        return new class53(class485.field6769[arg1], arg4, arg3);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method495(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field748;
        this.method496(arg3, 2, arg1, arg2, arg5);
        int var7 = 21 % ((arg4 - 55) / 45);
        Shape var8 = arg0.getClip();
        arg0.clipRect(arg2, arg3, arg1, arg5);
        arg0.drawImage(this.field770, 0, 0, this.field762);
        arg0.setClip(var8);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method496(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field765;
        if (this.field756 != null) {
            this.field756.setPixels(arg3, arg0, arg2, arg4, this.field758, super.field5981, super.field5986 * arg0 + arg3, super.field5986);
            this.field756.imageComplete(arg1);
        }
    }

    @OriginalMember(owner = "client!in", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field749;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
    public final void method497(Graphics arg0, boolean arg1, int arg2, int arg3) {
        ++field754;
        if (!arg1) {
            this.method495((Graphics) null, -115, 120, 30, 11, 71);
        }
        this.method500(64);
        arg0.drawImage(this.field770, arg3, arg2, this.field762);
    }

    @OriginalMember(owner = "client!in", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field764;
        return this.field756 == arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ltn;I)V")
    public static final void method498(class60 arg0, int arg1) {
        class30.field357.method1523(9823, arg0.method490(arg1 + -95));
        ++field766;
        if (arg1 != 1) {
            method494(true, -51, (byte) 20, 46, false);
        }
    }

    @OriginalMember(owner = "client!in", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field768;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!in", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field755;
        if (this.field756 == arg0) {
            this.field756 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)V")
    public static void method499(int arg0) {
        field761 = null;
        if (arg0 < 13) {
            method498((class60) null, 57);
        }
        field767 = null;
        field769 = null;
        field760 = null;
    }

    @OriginalMember(owner = "client!in", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field756 = arg0;
        ++field751;
        arg0.setDimensions(super.field5986, super.field5983);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field758);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V")
    private final synchronized void method500(int arg0) {
        if (arg0 > 14) {
            ++field750;
            if (this.field756 != null) {
                this.field756.setPixels(0, 0, super.field5986, super.field5983, this.field758, super.field5981, 0, super.field5986);
                this.field756.imageComplete(2);
            }
        }
    }
}
