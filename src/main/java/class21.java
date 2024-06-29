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
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class21 extends class4 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!ka", name = "u", descriptor = "Ln;")
    public static class26 field297 = class9.method82(255, "General Store");

    @OriginalMember(owner = "mapview!ka", name = "B", descriptor = "Ln;")
    public static class26 field304 = class9.method82(255, "Fishing Shop");

    @OriginalMember(owner = "mapview!ka", name = "D", descriptor = "Ln;")
    public static class26 field306 = class9.method82(255, "Magic Shop");

    @OriginalMember(owner = "mapview!ka", name = "C", descriptor = "Ln;")
    public static class26 field305 = class9.method82(255, "POH Portal");

    @OriginalMember(owner = "mapview!ka", name = "z", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "mapview!ka", name = "A", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "mapview!ka", name = "E", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "mapview!ka", name = "F", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "mapview!ka", name = "v", descriptor = "Ljava/awt/Font;")
    public static Font field298;

    @OriginalMember(owner = "mapview!ka", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field300;

    @OriginalMember(owner = "mapview!ka", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field301;

    @OriginalMember(owner = "mapview!ka", name = "w", descriptor = "[I")
    public static int[] field299;

    @OriginalMember(owner = "mapview!ka", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 4)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field301 == arg0;
    }

    @OriginalMember(owner = "mapview!ka", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 18)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 29)
    public final void method57(int arg0, int arg1, Graphics arg2, int arg3) {
        this.method154(false);
        if (arg3 >= -75) {
            method151(-64);
        }
        arg2.drawImage(super.field113, arg1, arg0, this);
    }

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "(I)V", line = 40)
    public static void method151(int arg0) {
        field297 = null;
        field299 = null;
        field305 = null;
        if (arg0 == 0) {
            field304 = null;
            field306 = null;
            field298 = null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 64)
    public static final void method152(Component arg0, int arg1) {
        if (arg1 <= 31) {
            field306 = (class26) null;
        }
        arg0.addMouseListener(class15.field233);
        arg0.addMouseMotionListener(class15.field233);
        arg0.addFocusListener(class15.field233);
    }

    @OriginalMember(owner = "mapview!ka", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 76)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field301 == arg0) {
            this.field301 = null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(ILjava/awt/Component;IB)V", line = 90)
    public final void method58(int arg0, Component arg1, int arg2, byte arg3) {
        super.field117 = arg0;
        super.field115 = arg2;
        super.field116 = new int[arg0 * arg2 + 1];
        this.field300 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field113 = arg1.createImage(this);
        this.method154(false);
        arg1.prepareImage(super.field113, this);
        this.method154(false);
        arg1.prepareImage(super.field113, this);
        int var5 = -71 / ((0 - arg3) / 59);
        this.method154(false);
        arg1.prepareImage(super.field113, this);
        this.method56(-115);
    }

    @OriginalMember(owner = "mapview!ka", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 110)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IIIIB)V", line = 114)
    public static final void method153(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = arg1 >> 6;
        int var6 = arg0 >> 6;
        if (class15.field236[arg2][var6][var5] == null) {
            class15.field236[arg2][var6][var5] = new byte[4096];
        }
        class15.field236[arg2][var6][var5][(mapview.method15(arg0, arg3) << 6) + mapview.method15(63, arg1)] = arg4;
    }

    @OriginalMember(owner = "mapview!ka", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 137)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field301 = arg0;
        arg0.setDimensions(super.field115, super.field117);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field300);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Z)V", line = 169)
    private final synchronized void method154(boolean arg0) {
        if (this.field301 != null) {
            this.field301.setPixels(0, 0, super.field115, super.field117, this.field300, super.field116, 0, super.field115);
            if (arg0) {
                this.startProduction((ImageConsumer) null);
            }
            this.field301.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 185)
    public static final String method155(Throwable arg0, int arg1) throws IOException {
        String var2;
        if (!(arg0 instanceof class8)) {
            var2 = "";
        } else {
            class8 var3 = (class8) arg0;
            var2 = var3.field173 + " | ";
            arg0 = var3.field168;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        if (arg1 < 54) {
            method151(51);
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 - -1);
                if (var10 >= 0 && -1 >= ~var11) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (~var13 <= -1) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(1 + var15.lastIndexOf(32));
                String var17 = var16.substring(var16.lastIndexOf(9) - -1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 257)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }
}
