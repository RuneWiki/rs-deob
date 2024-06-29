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

@OriginalClass("client!bl")
public class class285 extends class280 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
    public static int field4794 = 0;

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "[I")
    public static int[] field4781 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!bl", name = "D", descriptor = "Lhi;")
    public static class82 field4792 = class95.method664((byte) -52, "welle2:");

    @OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
    public static int field4791 = 0;

    @OriginalMember(owner = "client!bl", name = "N", descriptor = "Lhi;")
    public static class82 field4802 = class95.method664((byte) -63, "Polices charg-Bes");

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "Lhn;")
    public static class317 field4796 = new class317(5);

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!bl", name = "z", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!bl", name = "B", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!bl", name = "E", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!bl", name = "M", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "Lum;")
    public static class222 field4799;

    @OriginalMember(owner = "client!bl", name = "O", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4803;

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4797;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V", line = 8)
    public final void method1215(int arg0, Graphics arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.method1979(2);
            arg1.drawImage(this.field4706, arg2, arg0, this);
            field4788++;
        }
    }

    @OriginalMember(owner = "client!bl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 20)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field4798++;
    }

    @OriginalMember(owner = "client!bl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 29)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field4787++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IB)V", line = 39)
    public static final void method1977(int arg0, byte arg1) {
        field4789++;
        class227 var2 = class215.method1531(-1, 8, arg0);
        if (arg1 > -84) {
            method1977(-73, (byte) -51);
        }
        var2.method1624((byte) -101);
    }

    @OriginalMember(owner = "client!bl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 67)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field4783++;
        return this.field4797 == arg0;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 76)
    public static void method1978(byte arg0) {
        field4781 = null;
        field4799 = null;
        if (arg0 <= 82) {
            method1978((byte) -60);
        }
        field4796 = null;
        field4802 = null;
        field4792 = null;
    }

    @OriginalMember(owner = "client!bl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 95)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field4797 = arg0;
        arg0.setDimensions(this.field4713, this.field4705);
        arg0.setProperties((Hashtable) null);
        field4780++;
        arg0.setColorModel(this.field4803);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V", line = 107)
    private final synchronized void method1979(int arg0) {
        field4795++;
        if (this.field4797 != null) {
            this.field4797.setPixels(0, 0, this.field4713, this.field4705, this.field4803, this.field4714, 0, this.field4713);
            this.field4797.imageComplete(arg0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)V", line = 124)
    public static final void method1980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class325.field5578 = arg4;
        field4784++;
        class19.field252 = arg1;
        if (arg5 != 128) {
            method1980(108, 58, -43, 124, 2, -33);
        }
        class73.field1116 = arg2;
        class109.field1958 = arg0;
        class232.field4011 = arg3;
        if (class232.field4011 >= 100) {
            int var6 = class325.field5578 * 128 + 64;
            int var7 = class19.field252 * 128 + 64;
            int var8 = class21.method145(var6, var7, class297.field5058, (byte) -99) - class109.field1958;
            int var9 = var6 - class219.field3792;
            int var10 = var8 - class134.field2322;
            int var11 = var7 - class4.field32;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class197.field3380 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class224.field3887 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class197.field3380 < 128) {
                class197.field3380 = 128;
            }
            if (class197.field3380 > 383) {
                class197.field3380 = 383;
            }
        }
        class273.field4602 = 2;
    }

    @OriginalMember(owner = "client!bl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 170)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field4785++;
        if (this.field4797 == arg0) {
            this.field4797 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V", line = 181)
    private final synchronized void method1981(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4800++;
        if (this.field4797 != null) {
            this.field4797.setPixels(arg0, arg2, arg4, arg3, this.field4803, this.field4714, this.field4713 * arg2 + arg0, this.field4713);
            this.field4797.imageComplete(arg1);
        }
    }

    @OriginalMember(owner = "client!bl", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 202)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4786++;
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lum;BLum;Lum;Lum;)V", line = 218)
    public static final void method1982(class222 arg0, byte arg1, class222 arg2, class222 arg3, class222 arg4) {
        class287.field4825 = arg4;
        field4782++;
        if (arg1 >= -21) {
            field4781 = (int[]) null;
        }
        class20.field263 = arg3;
        class130.field2264 = arg2;
        class93.field1695 = arg0;
        class277.field4660 = new class75[class93.field1695.method1597(-1)][];
        class69.field1086 = new boolean[class93.field1695.method1597(-1)];
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 243)
    public final void method1216(int arg0, Component arg1, int arg2, int arg3) {
        this.field4713 = arg0;
        this.field4714 = new int[arg0 * arg3 + arg2];
        this.field4705 = arg3;
        this.field4803 = new DirectColorModel(32, 16711680, 65280, 255);
        field4801++;
        this.field4706 = arg1.createImage(this);
        this.method1979(2);
        arg1.prepareImage(this.field4706, this);
        this.method1979(2);
        arg1.prepareImage(this.field4706, this);
        this.method1979(2);
        arg1.prepareImage(this.field4706, this);
        this.method1954(21155);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V", line = 277)
    public final void method1214(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = -61 / ((arg0 + 36) / 63);
        field4790++;
        this.method1981(arg5, 2, arg4, arg3, arg2);
        Shape var8 = arg1.getClip();
        arg1.clipRect(arg5, arg4, arg2, arg3);
        arg1.drawImage(this.field4706, 0, 0, this);
        arg1.setClip(var8);
    }
}
