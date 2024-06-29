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

@OriginalClass("client!kk")
public class class76 extends class63 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Lcd;")
    public static class136 field1017;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1031;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1026;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 12)
    public static final String method568(long arg0, byte arg1) {
        field1020++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 125 % ((-arg1 - 20) / 41);
            int var4 = 0;
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var4++;
            }
            StringBuffer var7 = new StringBuffer(var4);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var7.append(class191.field3047[(int) (var8 - arg0 * 37L)]);
            }
            return var7.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!kk", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 48)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1021++;
    }

    @OriginalMember(owner = "client!kk", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 58)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1026 == arg0) {
            this.field1026 = null;
        }
        field1033++;
    }

    @OriginalMember(owner = "client!kk", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 69)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field1026 = arg0;
        arg0.setDimensions(this.field926, this.field927);
        arg0.setProperties((Hashtable) null);
        field1032++;
        arg0.setColorModel(this.field1031);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!kk", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 81)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field1029++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[Ljava/lang/String;[SI)V", line = 89)
    public static final void method569(int arg0, int arg1, String[] arg2, short[] arg3, int arg4) {
        field1025++;
        if (arg1 <= 80 || arg4 >= arg0) {
            return;
        }
        int var5 = (arg0 + arg4) / 2;
        int var6 = arg4;
        String var7 = arg2[var5];
        arg2[var5] = arg2[arg0];
        arg2[arg0] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg4; var9 < arg0; var9++) {
            if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg2[arg0] = arg2[var6];
        arg2[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var8;
        method569(var6 - 1, 123, arg2, arg3, arg4);
        method569(arg0, 99, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBIII)V", line = 143)
    private final synchronized void method570(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field1023++;
        if (arg1 != 23) {
            field1034 = -108;
        }
        if (this.field1026 != null) {
            this.field1026.setPixels(arg3, arg0, arg2, arg4, this.field1031, this.field918, this.field926 * arg0 + arg3, this.field926);
            this.field1026.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 159)
    public final void method515(Graphics arg0, int arg1, int arg2, int arg3) {
        field1022++;
        this.method571(0);
        arg0.drawImage(this.field921, arg1, arg2, this);
        int var5 = 3 % ((arg3 - 8) / 62);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 170)
    private final synchronized void method571(int arg0) {
        field1024++;
        if (this.field1026 != null) {
            this.field1026.setPixels(0, 0, this.field926, this.field927, this.field1031, this.field918, arg0, this.field926);
            this.field1026.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!kk", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 182)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1030++;
        return this.field1026 == arg0;
    }

    @OriginalMember(owner = "client!kk", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 194)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1027++;
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 202)
    public final void method513(int arg0, int arg1, int arg2, Component arg3) {
        if (arg0 != 2) {
            return;
        }
        this.field918 = new int[arg1 * arg2 + 1];
        this.field927 = arg1;
        field1018++;
        this.field926 = arg2;
        this.field1031 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field921 = arg3.createImage(this);
        this.method571(0);
        arg3.prepareImage(this.field921, this);
        this.method571(0);
        arg3.prepareImage(this.field921, this);
        this.method571(0);
        arg3.prepareImage(this.field921, this);
        this.method512(27);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 225)
    public static void method572(byte arg0) {
        field1017 = null;
        if (arg0 != 31) {
            method572((byte) -57);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 236)
    public final void method514(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1028++;
        this.method570(arg5, (byte) 23, arg4, arg1, arg2);
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg5, arg4, arg2);
        arg0.drawImage(this.field921, arg3, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIZILug;)V", line = 255)
    public static final void method573(int arg0, int arg1, int arg2, boolean arg3, int arg4, class253 arg5) {
        class251.field3951 = arg3;
        class237.field3711 = arg1;
        class202.field3228 = 1;
        class270.field4193 = arg0;
        field1019++;
        class113.field1575 = arg4;
        class147.field2319 = 10000;
        class3.field31 = arg5;
        if (arg2 != -1) {
            method572((byte) -9);
        }
    }
}
