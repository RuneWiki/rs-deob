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

@OriginalClass("client!kl")
public class class244 extends class314 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "[[I")
    public static int[][] field4017 = new int[104][104];

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field4032 = 0;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "[J")
    public static long[] field4024 = new long[100];

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4022;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4033;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "[S")
    public static short[] field4027;

    @OriginalMember(owner = "client!kl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 15)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field4030++;
        return this.field4033 == arg0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 34)
    public final void method1100(Component arg0, int arg1, int arg2, int arg3) {
        this.field5349 = arg3;
        this.field5354 = arg2;
        field4019++;
        this.field5344 = new int[arg2 * arg3 + arg1];
        this.field4022 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field5341 = arg0.createImage(this);
        this.method1698(0);
        arg0.prepareImage(this.field5341, this);
        this.method1698(0);
        arg0.prepareImage(this.field5341, this);
        this.method1698(arg1 ^ 0x1);
        arg0.prepareImage(this.field5341, this);
        this.method2131((byte) 40);
    }

    @OriginalMember(owner = "client!kl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 56)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field4034++;
        if (this.field4033 == arg0) {
            this.field4033 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 69)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field4033 = arg0;
        field4023++;
        arg0.setDimensions(this.field5349, this.field5354);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4022);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 83)
    public final void method1101(Graphics arg0, byte arg1, int arg2, int arg3) {
        field4021++;
        if (arg1 == 79) {
            this.method1698(0);
            arg0.drawImage(this.field5341, arg3, arg2, this);
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 95)
    private final synchronized void method1698(int arg0) {
        field4015++;
        if (this.field4033 != null) {
            this.field4033.setPixels(arg0, 0, this.field5349, this.field5354, this.field4022, this.field5344, 0, this.field5349);
            this.field4033.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kl", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 108)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4025++;
        return true;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)I", line = 116)
    public static final int method1699(byte arg0, int arg1) {
        field4028++;
        if (arg0 != 101) {
            field4029 = -94;
        }
        int var2 = arg1 * 6 - 61440;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = (arg1 * var2 >> 12) + 40960;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V", line = 135)
    public final void method1102(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 <= 48) {
            return;
        }
        this.method1702((byte) 109, arg0, arg2, arg3, arg5);
        field4031++;
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg2, arg5, arg0, arg3);
        arg1.drawImage(this.field5341, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V", line = 153)
    public static void method1700(byte arg0) {
        field4017 = (int[][]) null;
        field4027 = null;
        field4024 = null;
        int var1 = 16 / ((21 - arg0) / 36);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)V", line = 173)
    public static final void method1701(byte arg0) {
        class203 var1 = class251.field4208;
        synchronized (class251.field4208) {
            if (arg0 != 87) {
                method1699((byte) 46, 47);
            }
            class76.field1274++;
            class6.field87 = class195.field3252;
            if (class94.field1596 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class94.field1583[var2] = false;
                }
                class94.field1596 = class328.field5587;
            } else {
                while (class94.field1596 != class328.field5587) {
                    int var3 = class44.field684[class328.field5587];
                    class328.field5587 = class328.field5587 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class94.field1583[var3] = true;
                    } else {
                        class94.field1583[~var3] = false;
                    }
                }
            }
            class195.field3252 = class252.field4215;
        }
        field4026++;
    }

    @OriginalMember(owner = "client!kl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 215)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field4018++;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BIIII)V", line = 223)
    private final synchronized void method1702(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4020++;
        if (this.field4033 != null) {
            this.field4033.setPixels(arg2, arg4, arg1, arg3, this.field4022, this.field5344, this.field5349 * arg4 + arg2, this.field5349);
            int var6 = 37 / ((32 - arg0) / 33);
            this.field4033.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 240)
    public final void startProduction(ImageConsumer arg0) {
        field4016++;
        this.addConsumer(arg0);
    }
}
