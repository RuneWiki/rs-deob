import java.awt.Canvas;
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
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 extends class152 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "[Ltb;")
    public static class134[] field138 = new class134[50];

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lqd;")
    public static class115 field134 = new class115(64);

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    public static int field151 = -1;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "Lid;")
    public static class60 field153 = class11.method72("jolt", (byte) 98);

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "Lid;")
    public static class60 field150 = class11.method72("Benutzername: ", (byte) -32);

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "Lid;")
    private static class60 field155 = class11.method72("Attack", (byte) 124);

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "Lid;")
    public static class60 field149 = field155;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "Lid;")
    public static class60 field154 = class11.method72("<col=ffffff> )4 ", (byte) 118);

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field156 = 255;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field148;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field147;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field141;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "Z")
    public static boolean field152;

    @OriginalMember(owner = "client!ba", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field133;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIB)V")
    private final synchronized void method56(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field144;
        if (this.field141 != null) {
            if (arg4 == -7) {
                this.field141.setPixels(arg3, arg0, arg1, arg2, this.field147, super.field3407, super.field3411 * arg0 - -arg3, super.field3411);
                this.field141.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    private final synchronized void method57(int arg0) {
        ++field143;
        if (arg0 != 255) {
            field150 = null;
        }
        if (this.field141 != null) {
            this.field141.setPixels(0, 0, super.field3411, super.field3408, this.field147, super.field3407, 0, super.field3411);
            this.field141.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method58(byte arg0, Throwable arg1) throws IOException {
        ++field157;
        String var2;
        if (!(arg1 instanceof class48)) {
            var2 = "";
        } else {
            class48 var3 = (class48) arg1;
            arg1 = var3.field1258;
            var2 = var3.field1250 + " | ";
        }
        StringWriter var4 = new StringWriter();
        int var5 = 16 / ((arg0 - -35) / 45);
        PrintWriter var6 = new PrintWriter(var4);
        arg1.printStackTrace(var6);
        var6.close();
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var2 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (~var11 <= -1 && ~var12 <= -1) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (~var14 <= -1) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var2 = var2 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var2 = var2 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method59(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -8) {
            this.method63(-9, 111, 37, (Graphics) null);
        }
        this.method56(arg4, arg0, arg2, arg3, (byte) -7);
        ++field145;
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg3, arg4, arg0, arg2);
        arg1.drawImage(super.field3399, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public final void method60(int arg0, Component arg1, int arg2, byte arg3) {
        super.field3408 = arg0;
        super.field3407 = new int[arg0 * arg2 - -1];
        ++field140;
        super.field3411 = arg2;
        this.field147 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3399 = arg1.createImage(this);
        this.method57(255);
        arg1.prepareImage(super.field3399, this);
        this.method57(255);
        arg1.prepareImage(super.field3399, this);
        this.method57(255);
        arg1.prepareImage(super.field3399, this);
        this.method1156(84);
        if (arg3 > -96) {
            field155 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V")
    public static final void method61(long arg0, int arg1) {
        ++field135;
        if (arg0 != 0L) {
            if (~class133.field3044 <= -101) {
                class43.method342(class94.field2314, 0, class4.field71, 2001);
            } else {
                class60 var3 = class89.method726((byte) -94, arg0).method434((byte) 68);
                for (int var4 = 0; var4 < class133.field3044; ++var4) {
                    if (~class44.field1169[var4] == ~arg0) {
                        class43.method342(class94.field2314, 0, class104.method853(-95, new class60[] { var3, class86.field2151 }), 2001);
                        return;
                    }
                }
                for (int var5 = 0; class103.field2502 > var5; ++var5) {
                    if (~class136.field3082[var5] == ~arg0) {
                        class43.method342(class94.field2314, 0, class104.method853(-125, new class60[] { class111.field2667, var3, class34.field793 }), arg1 ^ -14790);
                        return;
                    }
                }
                if (var3.method451(class107.field2640.field21, 11207)) {
                    class43.method342(class94.field2314, 0, class52.field1329, 2001);
                } else {
                    ++class94.field2309;
                    class44.field1169[class133.field3044++] = arg0;
                    class42.field1112 = class78.field1921;
                    class22.field519.method1214(255, 0);
                    class22.field519.method830(arg0, 93);
                    if (arg1 != -15893) {
                        method62(90);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public static void method62(int arg0) {
        field138 = null;
        field149 = null;
        field148 = null;
        if (arg0 != 32) {
            method62(-117);
        }
        field153 = null;
        field155 = null;
        field154 = null;
        field134 = null;
        field150 = null;
    }

    @OriginalMember(owner = "client!ba", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field132;
    }

    @OriginalMember(owner = "client!ba", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field137;
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field136;
        this.field141 = arg0;
        arg0.setDimensions(super.field3411, super.field3408);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field147);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method63(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field131;
        this.method57(arg1 ^ 152);
        arg3.drawImage(super.field3399, arg0, arg2, this);
        if (arg1 != 103) {
            this.method56(-3, -7, 23, 24, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!ba", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field141 == arg0) {
            this.field141 = null;
        }
        ++field142;
    }

    @OriginalMember(owner = "client!ba", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field146;
        return this.field141 == arg0;
    }
}
