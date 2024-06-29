import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class30 extends class6 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!pa", name = "r", descriptor = "Lj;")
    public static class17 field386 = method190(-126, "Mining Shop");

    @OriginalMember(owner = "mapview!pa", name = "s", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "mapview!pa", name = "u", descriptor = "Lj;")
    public static class17 field389 = method190(-96, "Brewery");

    @OriginalMember(owner = "mapview!pa", name = "v", descriptor = "Lj;")
    public static class17 field390 = method190(-125, "map");

    @OriginalMember(owner = "mapview!pa", name = "q", descriptor = "Lj;")
    public static class17 field385 = method190(-124, "Candle Shop");

    @OriginalMember(owner = "mapview!pa", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field388;

    @OriginalMember(owner = "mapview!pa", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field384;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 9)
    public final void method62(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 != 50) {
            this.imageUpdate((Image) null, -117, -66, 100, -112, 84);
        }
        this.method191(-125);
        arg3.drawImage(super.field131, arg1, arg0, this);
    }

    @OriginalMember(owner = "mapview!pa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 27)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!pa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 31)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field384 == arg0;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(ILjava/lang/String;)Lj;", line = 40)
    public static final class17 method190(int arg0, String arg1) {
        if (arg0 > -86) {
            field387 = 35;
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class17 var4 = new class17();
        var4.field263 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 255;
            if (-46 <= ~var6 && var6 >= 40) {
                if (~var3 >= ~var5) {
                    break;
                }
                int var7 = 255 & var2[var5++];
                var4.field263[var4.field268++] = (byte) (var6 * 43 + -1720 + var7 + -48);
            } else if (~var6 != -1) {
                var4.field263[var4.field268++] = (byte) var6;
            }
        }
        var4.method126(-126);
        return var4.method125(4096);
    }

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "(I)V", line = 102)
    private final synchronized void method191(int arg0) {
        if (arg0 > -5) {
            field387 = 33;
        }
        if (this.field384 != null) {
            this.field384.setPixels(0, 0, super.field133, super.field132, this.field388, super.field128, 0, super.field133);
            this.field384.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 121)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field384 = arg0;
        arg0.setDimensions(super.field133, super.field132);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field388);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(IZILjava/awt/Component;)V", line = 141)
    public final void method65(int arg0, boolean arg1, int arg2, Component arg3) {
        super.field133 = arg2;
        super.field128 = new int[arg0 * arg2 - -1];
        if (!arg1) {
            field387 = -115;
        }
        super.field132 = arg0;
        this.field388 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field131 = arg3.createImage(this);
        this.method191(-96);
        arg3.prepareImage(super.field131, this);
        this.method191(-8);
        arg3.prepareImage(super.field131, this);
        this.method191(-55);
        arg3.prepareImage(super.field131, this);
        this.method63(97);
    }

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "(I)V", line = 168)
    public static void method192(int arg0) {
        field385 = null;
        if (arg0 != 2) {
            method192(123);
        }
        field390 = null;
        field386 = null;
        field389 = null;
    }

    @OriginalMember(owner = "mapview!pa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 181)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!pa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 191)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field384 == arg0) {
            this.field384 = null;
        }
    }

    @OriginalMember(owner = "mapview!pa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 203)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Lt;ILj;Lj;)[Lv;", line = 216)
    public static final class36[] method193(class34 arg0, int arg1, class17 arg2, class17 arg3) {
        int var4 = -48 / ((arg1 - 56) / 51);
        int var5 = arg0.method227(109, arg2);
        int var6 = arg0.method232(arg3, var5, (byte) 86);
        return class3.method30(var5, var6, 24, arg0);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 228)
    public static final String method194(int arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class11) {
            class11 var2 = (class11) arg1;
            arg1 = var2.field223;
            var3 = var2.field225 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg0 <= 101) {
            return (String) null;
        } else {
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                while (true) {
                    String var9 = var7.readLine();
                    if (var9 == null) {
                        return var3 + "| " + var8;
                    }
                    int var10 = var9.indexOf(40);
                    int var11 = var9.indexOf(41, var10 + 1);
                    if (~var10 <= -1 && var11 >= 0) {
                        String var12 = var9.substring(var10 + 1, var11);
                        int var13 = var12.indexOf(".java:");
                        if (0 <= var13) {
                            String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                            var3 = var3 + var14 + ' ';
                            continue;
                        }
                        var9 = var9.substring(0, var10);
                    }
                    String var15 = var9.trim();
                    String var16 = var15.substring(1 + var15.lastIndexOf(32));
                    String var17 = var16.substring(var16.lastIndexOf(9) - -1);
                    var3 = var3 + var17 + ' ';
                }
            }
        }
    }
}
