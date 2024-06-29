import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.URL;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class167 extends class160 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "Leh;")
    private static class47 field3241 = class195.method1282((byte) -4, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "Leh;")
    public static class47 field3255 = field3241;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3235 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!se", name = "T", descriptor = "Leh;")
    private static class47 field3258 = class195.method1282((byte) -4, "Please enter your password)3");

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Leh;")
    public static class47 field3260 = class195.method1282((byte) -4, "Fallen lassen");

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "Leh;")
    public static class47 field3262 = field3258;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "Lpa;")
    public static class136 field3259 = new class136(64);

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "[[I")
    public static int[][] field3263 = new int[5][5000];

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Loc;")
    public static class129 field3250;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Ljh;")
    public static class89 field3238;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Lah;")
    public static class9 field3249;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3242;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3244;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "[I")
    public static int[] field3237;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "[Lfb;")
    public static class50[] field3239;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method1131(byte arg0, Throwable arg1, String arg2) {
        ++field3261;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = method1134(true, arg1);
            }
            if (arg0 > -44) {
                field3255 = null;
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class127.field2542.field2947 != null) {
                class129 var8 = class127.field2542.method1059(new URL(class127.field2542.field2947.getCodeBase(), "clienterror.ws?c=" + class37.field716 + "&u=" + class176.field3377 + "&v1=" + class150.field2948 + "&v2=" + class150.field2937 + "&e=" + var7), 107);
                while (var8.field2543 == 0) {
                    class76.method666(1L, 1);
                }
                if (~var8.field2543 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field2548;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!se", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3248;
        return true;
    }

    @OriginalMember(owner = "client!se", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3251;
        return this.field3244 == arg0;
    }

    @OriginalMember(owner = "client!se", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3244 = arg0;
        arg0.setDimensions(super.field3112, super.field3110);
        ++field3246;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3242);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    private final synchronized void method1132(int arg0) {
        ++field3253;
        if (this.field3244 != null) {
            this.field3244.setPixels(0, 0, super.field3112, super.field3110, this.field3242, super.field3104, 0, super.field3112);
            this.field3244.imageComplete(2);
            if (arg0 <= 29) {
                this.method1100((Graphics) null, 4, (byte) -43, -49, 47, 35);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3233;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Leh;")
    public static final class47 method1133(int arg0, byte arg1) {
        int var2 = -83 % ((-37 - arg1) / 59);
        ++field3254;
        return class88.method722(arg0, false, (byte) 124, 10);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
    private static final String method1134(boolean arg0, Throwable arg1) throws IOException {
        String var3;
        if (arg1 instanceof class143) {
            class143 var2 = (class143) arg1;
            var3 = var2.field2813 + " | ";
            arg1 = var2.field2806;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        ++field3247;
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    String var18 = var3 + "| " + var8;
                    if (!arg0) {
                        return null;
                    }
                    return var18;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 - -1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (~var13 <= -1) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 - -5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(1 + var15.lastIndexOf(32));
                String var17 = var16.substring(1 + var16.lastIndexOf(9));
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIIII)V")
    private final synchronized void method1135(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3232;
        if (this.field3244 != null) {
            this.field3244.setPixels(arg2, arg1, arg4, arg3, this.field3242, super.field3104, super.field3112 * arg1 + arg2, super.field3112);
            if (arg0) {
                this.method1095((Graphics) null, -124, -91, -104);
            }
            this.field3244.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method1095(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg3 == -1) {
            this.method1132(97);
            arg0.drawImage(super.field3111, arg2, arg1, this);
            ++field3257;
        }
    }

    @OriginalMember(owner = "client!se", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3252;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method1098(int arg0, int arg1, int arg2, Component arg3) {
        super.field3112 = arg0;
        ++field3245;
        super.field3104 = new int[arg0 * arg2 + 1];
        super.field3110 = arg2;
        this.field3242 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3111 = arg3.createImage(this);
        this.method1132(arg1 ^ -66);
        arg3.prepareImage(super.field3111, this);
        this.method1132(102);
        if (arg1 != -1) {
            this.method1098(52, 125, 48, (Component) null);
        }
        arg3.prepareImage(super.field3111, this);
        this.method1132(88);
        arg3.prepareImage(super.field3111, this);
        this.method1096(false);
    }

    @OriginalMember(owner = "client!se", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field3234;
        if (this.field3244 == arg0) {
            this.field3244 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static void method1136(byte arg0) {
        field3260 = null;
        field3235 = null;
        field3239 = null;
        field3237 = null;
        field3263 = null;
        field3250 = null;
        field3238 = null;
        field3249 = null;
        field3241 = null;
        field3255 = null;
        field3262 = null;
        if (arg0 < 85) {
            method1136((byte) -22);
        }
        field3258 = null;
        field3259 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
    public final void method1100(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field3256;
        int var7 = 87 / ((arg2 - -47) / 47);
        this.method1135(false, arg4, arg1, arg3, arg5);
        Shape var8 = arg0.getClip();
        arg0.clipRect(arg1, arg4, arg5, arg3);
        arg0.drawImage(super.field3111, 0, 0, this);
        arg0.setClip(var8);
    }
}
