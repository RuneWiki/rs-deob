import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
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
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class22 extends class35 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!la", name = "m", descriptor = "Lna;")
    public static class26 field227 = class6.method40("world", 48);

    @OriginalMember(owner = "mapview!la", name = "i", descriptor = "I")
    public static int field223 = 0;

    @OriginalMember(owner = "mapview!la", name = "j", descriptor = "[I")
    public static int[] field224 = new int[128];

    @OriginalMember(owner = "mapview!la", name = "k", descriptor = "I")
    public static volatile int field225 = -1;

    @OriginalMember(owner = "mapview!la", name = "r", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "mapview!la", name = "q", descriptor = "Z")
    public static boolean field231 = false;

    @OriginalMember(owner = "mapview!la", name = "s", descriptor = "Lna;")
    public static class26 field233 = class6.method40("Enter place name to find", 48);

    @OriginalMember(owner = "mapview!la", name = "u", descriptor = "Lna;")
    public static class26 field235 = class6.method40("", 48);

    @OriginalMember(owner = "mapview!la", name = "p", descriptor = "Lna;")
    public static class26 field230 = class6.method40("Makeover Mage", 48);

    @OriginalMember(owner = "mapview!la", name = "l", descriptor = "Lna;")
    public static class26 field226 = class6.method40("Loom", 48);

    @OriginalMember(owner = "mapview!la", name = "n", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "mapview!la", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field234;

    @OriginalMember(owner = "mapview!la", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field229;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 6)
    public static final void method126(Component arg0, byte arg1) {
        Method var2 = class16.field194;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        arg0.addKeyListener(class8.field93);
        int var4 = -45 / ((arg1 - -36) / 54);
        arg0.addFocusListener(class8.field93);
    }

    @OriginalMember(owner = "mapview!la", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 40)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field229 == arg0) {
            this.field229 = null;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IZLjava/awt/Component;I)V", line = 51)
    public final void method127(int arg0, boolean arg1, Component arg2, int arg3) {
        super.field452 = arg0;
        if (!arg1) {
            field232 = 87;
        }
        super.field449 = new int[arg0 * arg3 + 1];
        super.field454 = arg3;
        this.field234 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field456 = arg2.createImage(this);
        this.method132(103);
        arg2.prepareImage(super.field456, this);
        this.method132(127);
        arg2.prepareImage(super.field456, this);
        this.method132(-37);
        arg2.prepareImage(super.field456, this);
        this.method247(-77);
    }

    @OriginalMember(owner = "mapview!la", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 75)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "(B)V", line = 83)
    public static void method128(byte arg0) {
        field224 = null;
        field233 = null;
        field226 = null;
        field227 = null;
        int var1 = 8 % ((arg0 - -57) / 44);
        field230 = null;
        field235 = null;
    }

    @OriginalMember(owner = "mapview!la", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 97)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;", line = 113)
    public static final String method129(Throwable arg0, boolean arg1) throws IOException {
        String var3;
        if (arg0 instanceof class13) {
            class13 var2 = (class13) arg0;
            arg0 = var2.field163;
            var3 = var2.field162 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (!arg1) {
            field232 = 6;
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
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
                String var16 = var15.substring(var15.lastIndexOf(32) - -1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!la", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 188)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field229 == arg0;
    }

    @OriginalMember(owner = "mapview!la", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 197)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IILjava/awt/Graphics;B)V", line = 230)
    public final void method130(int arg0, int arg1, Graphics arg2, byte arg3) {
        this.method132(arg3 + -137);
        if (arg3 != 28) {
            field232 = 56;
        }
        arg2.drawImage(super.field456, arg0, arg1, this);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(IILjava/awt/Color;Lna;)V", line = 246)
    public static final void method131(int arg0, int arg1, Color arg2, class26 arg3) {
        try {
            Graphics var4 = class4.field44.getGraphics();
            if (mapview.field280 == null) {
                mapview.field280 = new Font("Helvetica", 1, 13);
                class31.field412 = class4.field44.getFontMetrics(mapview.field280);
            }
            if (class4.field54) {
                class4.field54 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class38.field479, class32.field417);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class9.field103 == null) {
                    class9.field103 = class4.field44.createImage(304, 34);
                }
                Graphics var5 = class9.field103.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, -(arg0 * arg1) + 300, 30);
                var5.setFont(mapview.field280);
                var5.setColor(Color.white);
                arg3.method181(true, 22, (304 - arg3.method176(0, class31.field412)) / 2, var5);
                var4.drawImage(class9.field103, class38.field479 / 2 + -152, class32.field417 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = class38.field479 / 2 + -152;
                int var8 = class32.field417 / 2 + -18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 - -1, 301, 31);
                var4.fillRect(var7 + 2 - -(arg0 * 3), var8 + 2, -(arg0 * 3) + 300, 30);
                var4.setFont(mapview.field280);
                var4.setColor(Color.white);
                arg3.method181(true, var8 + 22, (-arg3.method176(0, class31.field412) + 304) / 2 + var7, var4);
            }
        } catch (Exception var11) {
            class4.field44.repaint();
        }
    }

    @OriginalMember(owner = "mapview!la", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 313)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field229 = arg0;
        arg0.setDimensions(super.field454, super.field452);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field234);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "(I)V", line = 327)
    private final synchronized void method132(int arg0) {
        if (this.field229 != null) {
            this.field229.setPixels(0, 0, super.field454, super.field452, this.field234, super.field449, 0, super.field454);
            this.field229.imageComplete(2);
            int var2 = 53 / ((arg0 - 40) / 54);
        }
    }
}
