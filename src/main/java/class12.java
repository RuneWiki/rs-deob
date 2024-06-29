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

@OriginalClass("mapview!fa")
public class class12 extends class24 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!fa", name = "A", descriptor = "I")
    public static volatile int field115 = -1;

    @OriginalMember(owner = "mapview!fa", name = "w", descriptor = "Ls;")
    public static class34 field111 = class9.method35("Switch to ", 220);

    @OriginalMember(owner = "mapview!fa", name = "C", descriptor = "Ls;")
    public static class34 field116 = class9.method35("details)3dat", 220);

    @OriginalMember(owner = "mapview!fa", name = "G", descriptor = "I")
    public static int field120 = 0;

    @OriginalMember(owner = "mapview!fa", name = "D", descriptor = "Ls;")
    public static class34 field117 = class9.method35("loc)3dat", 220);

    @OriginalMember(owner = "mapview!fa", name = "F", descriptor = "[I")
    public static int[] field119 = new int[128];

    @OriginalMember(owner = "mapview!fa", name = "H", descriptor = "I")
    public static int field121 = 0;

    @OriginalMember(owner = "mapview!fa", name = "y", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "mapview!fa", name = "E", descriptor = "J")
    public static long field118;

    @OriginalMember(owner = "mapview!fa", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field112;

    @OriginalMember(owner = "mapview!fa", name = "z", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field114;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 5)
    public final void method49(Component arg0, int arg1, int arg2, int arg3) {
        int var5 = -72 / ((arg2 - -24) / 51);
        super.field235 = new int[arg1 * arg3 + 1];
        super.field253 = arg3;
        super.field244 = arg1;
        this.field112 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field254 = arg0.createImage(this);
        this.method54((byte) -60);
        arg0.prepareImage(super.field254, this);
        this.method54((byte) 117);
        arg0.prepareImage(super.field254, this);
        this.method54((byte) -52);
        arg0.prepareImage(super.field254, this);
        this.method129(-99);
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(B)V", line = 26)
    public static void method50(byte arg0) {
        field117 = null;
        if (arg0 != -72) {
            method50((byte) -29);
        }
        field111 = null;
        field119 = null;
        field116 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 38)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!fa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 41)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!fa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 48)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field114 = arg0;
        arg0.setDimensions(super.field244, super.field253);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field112);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I[Ls;)V", line = 61)
    public static final void method51(int arg0, class34[] arg1) {
        class14.method62(arg1, arg1.length, 0, true);
        if (arg0 > -14) {
            field113 = -79;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;", line = 87)
    public static final String method52(byte arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class13) {
            class13 var2 = (class13) arg1;
            var3 = var2.field124 + " | ";
            arg1 = var2.field126;
        } else {
            var3 = "";
        }
        int var4 = -127 % ((30 - arg0) / 32);
        StringWriter var5 = new StringWriter();
        PrintWriter var6 = new PrintWriter(var5);
        arg1.printStackTrace(var6);
        var6.close();
        String var7 = var5.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var3 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (-1 >= ~var11 && ~var12 <= -1) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var3 = var3 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) - -1);
                String var18 = var17.substring(1 + var17.lastIndexOf(9));
                var3 = var3 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 156)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field114 == arg0;
    }

    @OriginalMember(owner = "mapview!fa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 165)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!fa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 180)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field114 == arg0) {
            this.field114 = null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V", line = 189)
    public final void method53(boolean arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0) {
            field121 = 61;
        }
        this.method54((byte) -97);
        arg3.drawImage(super.field254, arg1, arg2, this);
    }

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(B)V", line = 200)
    private final synchronized void method54(byte arg0) {
        if (this.field114 != null) {
            int var2 = -122 / ((arg0 - 32) / 48);
            this.field114.setPixels(0, 0, super.field244, super.field253, this.field112, super.field235, 0, super.field244);
            this.field114.imageComplete(2);
        }
    }
}
