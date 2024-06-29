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
import java.io.DataInputStream;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class17 extends PixMap implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "mapview!j", name = "v", descriptor = "Ll;")
    public static class21 field157 = class28.method185(-20839, "Estate Agent");

    @OriginalMember(owner = "mapview!j", name = "w", descriptor = "I")
    public static int field158 = 0;

    @OriginalMember(owner = "mapview!j", name = "x", descriptor = "Ll;")
    public static class21 field159 = class28.method185(-20839, "Stagnant Water");

    @OriginalMember(owner = "mapview!j", name = "s", descriptor = "I")
    public static volatile int field154 = 0;

    @OriginalMember(owner = "mapview!j", name = "q", descriptor = "Ll;")
    public static class21 field152 = class28.method185(-20839, "100(U");

    @OriginalMember(owner = "mapview!j", name = "p", descriptor = "Ll;")
    public static class21 field151 = class28.method185(-20839, "Silver Shop");

    @OriginalMember(owner = "mapview!j", name = "r", descriptor = "[Z")
    public static boolean[] field153 = new boolean[112];

    @OriginalMember(owner = "mapview!j", name = "t", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field155;

    @OriginalMember(owner = "mapview!j", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field150;

    @OriginalMember(owner = "mapview!j", name = "u", descriptor = "Ljava/lang/String;")
    public static String field156;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ll;Ljava/awt/Color;II)V", line = 8)
    public static final void method71(class21 arg0, Color arg1, int arg2, int arg3) {
        try {
            Graphics var4 = class27.field324.getGraphics();
            if (PixMap.field231 == null) {
                PixMap.field231 = new Font("Helvetica", 1, 13);
                class27.field320 = class27.field324.getFontMetrics(PixMap.field231);
            }
            if (class31.field364) {
                class31.field364 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, mapview.field260, class27.field321);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class14.field133 == null) {
                    class14.field133 = class27.field324.createImage(304, 34);
                }
                Graphics var5 = class14.field133.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                if (arg2 != -18) {
                    field154 = 4;
                }
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(2 - -(arg3 * 3), 2, -(arg3 * 3) + 300, 30);
                var5.setFont(PixMap.field231);
                var5.setColor(Color.white);
                arg0.method113((-arg0.method110(-105, class27.field320) + 304) / 2, var5, true, 22);
                var4.drawImage(class14.field133, mapview.field260 / 2 + -152, class27.field321 / 2 + -18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = mapview.field260 / 2 + -152;
                int var8 = class27.field321 / 2 + -18;
                var4.setColor(arg1);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 - -1, var8 - -1, 301, 31);
                var4.fillRect(arg3 * 3 + var7 + 2, var8 + 2, -(arg3 * 3) + 300, 30);
                var4.setFont(PixMap.field231);
                var4.setColor(Color.white);
                arg0.method113((-arg0.method110(arg2 ^ 109, class27.field320) + 304) / 2 + var7, var4, true, var8 + 22);
            }
        } catch (Exception var11) {
            class27.field324.repaint();
        }
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(ILjava/awt/Component;)V", line = 71)
    public static final void method72(int arg0, Component arg1) {
        int var2 = 12 / ((arg0 - -39) / 53);
        arg1.removeMouseListener(class29.field342);
        arg1.removeMouseMotionListener(class29.field342);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(B)V", line = 88)
    private final synchronized void method73(byte arg0) {
        if (arg0 != 28) {
            field159 = (class21) null;
        }
        if (this.field150 != null) {
            this.field150.setPixels(0, 0, super.field222, super.field226, this.field155, super.field219, 0, super.field222);
            this.field150.imageComplete(2);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V", line = 103)
    public final void method74(int arg0, int arg1, Graphics arg2, boolean arg3) {
        if (arg3) {
            this.removeConsumer((ImageConsumer) null);
        }
        this.method73((byte) 28);
        arg2.drawImage(super.field229, arg0, arg1, this);
    }

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "(Z)V", line = 115)
    public static void method75(boolean arg0) {
        field156 = null;
        field152 = null;
        field159 = null;
        field157 = null;
        field153 = null;
        field151 = null;
        if (arg0) {
            method77((String) null, (Throwable) null, (byte) 11);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 130)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field150 == arg0;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([Ll;III)Ll;", line = 138)
    public static final class21 method76(class21[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; ~arg2 < ~var5; ++var5) {
            if (arg0[arg3 + var5] == null) {
                arg0[arg3 + var5] = class31.field361;
            }
            var4 += arg0[arg3 - -var5].field204;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = arg1; ~arg2 < ~var8; ++var8) {
            class21 var9 = arg0[arg3 + var8];
            class15.method58(var9.field197, 0, var6, var7, var9.field204);
            var7 += var9.field204;
        }
        class21 var10 = new class21();
        var10.field204 = var4;
        var10.field197 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!j", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 178)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 187)
    public static final void method77(String arg0, Throwable arg1, byte arg2) {
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class27.method176(0, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class7 var8 = class31.field363.method204((byte) -51, new URL(class31.field363.field375.getCodeBase(), "clienterror.ws?c=" + class20.field185 + "&u=" + class2.field13 + "&v1=" + class32.field380 + "&v2=" + class32.field382 + "&e=" + var7));
            while (var8.field57 == 0) {
                class2.method4(1L, 113);
            }
            if (var8.field57 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field52;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
        if (arg2 <= 9) {
            method77((String) null, (Throwable) null, (byte) -120);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 233)
    public final void method78(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 == -4726) {
            super.field219 = new int[arg0 * arg2 + 1];
            super.field222 = arg2;
            super.field226 = arg0;
            this.field155 = new DirectColorModel(32, 16711680, 65280, 255);
            super.field229 = arg3.createImage(this);
            this.method73((byte) 28);
            arg3.prepareImage(super.field229, this);
            this.method73((byte) 28);
            arg3.prepareImage(super.field229, this);
            this.method73((byte) 28);
            arg3.prepareImage(super.field229, this);
            this.bind(false);
        }
    }

    @OriginalMember(owner = "mapview!j", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 261)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @OriginalMember(owner = "mapview!j", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 267)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @OriginalMember(owner = "mapview!j", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 279)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field150 == arg0) {
            this.field150 = null;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 289)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field150 = arg0;
        arg0.setDimensions(super.field222, super.field226);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field155);
        arg0.setHints(14);
    }
}
