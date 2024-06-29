import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class63 extends class460 implements ImageProducer {

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "Lsv;")
    public static class570 field954 = new class570(89, 2);

    @OriginalMember(owner = "client!pp", name = "Q", descriptor = "Lbn;")
    public static class517 field963 = new class517("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!pp", name = "P", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!pp", name = "R", descriptor = "Lwv;")
    public static class791 field964;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "Ljava/awt/Canvas;")
    private Canvas field956;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field953;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field958;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field955;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V", line = 5)
    private final synchronized void method633(boolean arg0) {
        ++field962;
        if (this.field955 != null) {
            this.field955.setPixels(0, 0, super.field6278, super.field6277, this.field958, super.field6283, 0, super.field6278);
            this.field955.imageComplete(2);
            if (arg0) {
                this.field953 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIZII)V", line = 20)
    private final synchronized void method634(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field950;
        if (this.field955 != null) {
            this.field955.setPixels(arg4, arg3, arg0, arg1, this.field958, super.field6283, super.field6278 * arg3 + arg4, super.field6278);
            if (!arg2) {
                field954 = null;
            }
            this.field955.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIILjava/awt/Graphics;)V", line = 36)
    public final void method635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Graphics arg7) {
        if (arg2 == 0) {
            this.method634(arg5, arg0, true, arg1, arg4);
            ++field957;
            Shape var9 = arg7.getClip();
            arg7.clipRect(arg3, arg6, arg5, arg0);
            arg7.drawImage(this.field953, -arg4 + arg3, arg6 - arg1, this.field956);
            arg7.setClip(var9);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IILjava/awt/Canvas;B)V", line = 54)
    public final void method636(int arg0, int arg1, Canvas arg2, byte arg3) {
        ++field949;
        super.field6278 = arg1;
        int var5 = 90 / ((-58 - arg3) / 51);
        super.field6277 = arg0;
        this.field956 = arg2;
        super.field6283 = new int[super.field6278 * super.field6277];
        this.field958 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field953 = this.field956.createImage(this);
        this.method633(false);
        this.field956.prepareImage(this.field953, this.field956);
        this.method633(false);
        this.field956.prepareImage(this.field953, this.field956);
        this.method633(false);
        this.field956.prepareImage(this.field953, this.field956);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 75)
    public static final String method637(int arg0, Throwable arg1) throws IOException {
        ++field951;
        String var3;
        if (arg1 instanceof class242) {
            class242 var2 = (class242) arg1;
            arg1 = var2.field3471;
            var3 = var2.field3472 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg0 != 0) {
            method639(1.7517539536192421D, (byte) -111);
        }
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (~var10 != 0) {
                var12 = var9.substring(0, var10);
            } else {
                var12 = var9;
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) - -1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (~var10 != 0 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!pp", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 153)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field960;
        return this.field955 == arg0;
    }

    @OriginalMember(owner = "client!pp", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 163)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field955 == arg0) {
            this.field955 = null;
        }
        ++field952;
    }

    @OriginalMember(owner = "client!pp", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 174)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field948;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V", line = 183)
    public static void method638(byte arg0) {
        field954 = null;
        field964 = null;
        if (arg0 > 107) {
            field963 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(DB)V", line = 197)
    public static final void method639(double arg0, byte arg1) {
        if (arg1 >= -71) {
            method639(-0.24798165998860733D, (byte) -49);
        }
        class193.field2894.method1552(class276.field3994);
        ++field961;
        class193.field2894.method1558(0, 0, (int) arg0);
        class390.field5440.method498(class193.field2894);
    }

    @OriginalMember(owner = "client!pp", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 217)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field955 = arg0;
        ++field947;
        arg0.setDimensions(super.field6278, super.field6277);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field958);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!pp", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 234)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field959;
    }
}
