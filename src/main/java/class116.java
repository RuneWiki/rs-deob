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

@OriginalClass("client!s")
public class class116 extends class29 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field1946 = 0;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "[I")
    public static int[] field1959 = new int[2000];

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field1961 = 0;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "[I")
    public static int[] field1956 = new int[25];

    @OriginalMember(owner = "client!s", name = "y", descriptor = "Z")
    public static boolean field1952 = false;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "Lce;")
    private static class126 field1969 = class206.method1445(-7923, "glow2:");

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Lce;")
    public static class126 field1957 = field1969;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "Lce;")
    public static class126 field1967 = field1969;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1960;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1964;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZZ)V", line = 5)
    public static final void method759(boolean arg0, boolean arg1) {
        field1954++;
        if (arg0) {
            method761(-120, (byte) 76, 73);
        }
        for (int var2 = 0; var2 < class30.field425; var2++) {
            long var3 = (long) class279.field4639[var2] << 32 | 0x20000000L;
            class89 var5 = class199.field3391[class279.field4639[var2]];
            if (var5 != null && var5.method626(123) && var5.field1389.field5106 == arg1 && var5.field1389.method2041((byte) 126)) {
                int var6 = var5.field2461 >> 7;
                int var7 = var5.field2487 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.method1013(false) == 1 && (var5.field2461 & 0x7F) == 64 && (var5.field2487 & 0x7F) == 64) {
                        if (class168.field2979[var6][var7] == class167.field2970) {
                            continue;
                        }
                        class168.field2979[var6][var7] = class167.field2970;
                    }
                    if (!var5.field1389.field5055) {
                        var3 |= Long.MIN_VALUE;
                    }
                    var5.field2440 = class174.method1265(var5.field2487, 8100, class131.field2250, var5.field2461);
                    class199.method1411(class131.field2250, var5.field2461, var5.field2487, var5.field2440, var5.method1013(false) * 64 - 4, var5, var5.field2483, var3, var5.field2505);
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lce;B)Lmd;", line = 59)
    public static final class229 method760(class126 arg0, byte arg1) {
        field1965++;
        for (class229 var2 = (class229) class100.field1616.method898((byte) -69); var2 != null; var2 = (class229) class100.field1616.method893((byte) -126)) {
            if (var2.field3859.method872(arg0, 0)) {
                return var2;
            }
        }
        if (arg1 == 78) {
            return null;
        } else {
            return (class229) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I", line = 87)
    public static final int method761(int arg0, byte arg1, int arg2) {
        field1962++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = 61 % ((arg1 + 15) / 38);
        int var6 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!s", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 102)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1963++;
        return true;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V", line = 124)
    public static void method762(byte arg0) {
        if (arg0 != -14) {
            field1967 = (class126) null;
        }
        field1959 = null;
        field1956 = null;
        field1969 = null;
        field1957 = null;
        field1967 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 139)
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        field1947++;
        if (arg2 != 977463824) {
            return;
        }
        this.method764(arg3, arg4, arg1, arg0, (byte) -127);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg3, arg1, arg4);
        arg5.drawImage(this.field407, 0, 0, this);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 165)
    private final synchronized void method763(int arg0) {
        field1950++;
        if (arg0 == 4 && this.field1964 != null) {
            this.field1964.setPixels(0, 0, this.field405, this.field397, this.field1960, this.field403, 0, this.field405);
            this.field1964.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!s", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 180)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1964 == arg0) {
            this.field1964 = null;
        }
        field1966++;
    }

    @OriginalMember(owner = "client!s", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 195)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field1951++;
        this.field1964 = arg0;
        arg0.setDimensions(this.field405, this.field397);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1960);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!s", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 207)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1958++;
    }

    @OriginalMember(owner = "client!s", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 214)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field1968++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 222)
    public final void method133(int arg0, Component arg1, int arg2, int arg3) {
        this.field405 = arg2;
        this.field397 = arg3;
        this.field403 = new int[arg2 * arg3 + 1];
        field1948++;
        this.field1960 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field407 = arg1.createImage(this);
        this.method763(4);
        arg1.prepareImage(this.field407, this);
        if (arg0 != 128) {
            field1956 = (int[]) null;
        }
        this.method763(4);
        arg1.prepareImage(this.field407, this);
        this.method763(arg0 ^ 0x84);
        arg1.prepareImage(this.field407, this);
        this.method137((byte) -119);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIB)V", line = 244)
    private final synchronized void method764(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1949++;
        int var6 = 107 / ((arg4 + 67) / 56);
        if (this.field1964 != null) {
            this.field1964.setPixels(arg3, arg0, arg2, arg1, this.field1960, this.field403, this.field405 * arg0 + arg3, this.field405);
            this.field1964.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!s", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 270)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1955++;
        return this.field1964 == arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 278)
    public final void method135(int arg0, int arg1, byte arg2, Graphics arg3) {
        if (arg2 < 87) {
            field1957 = (class126) null;
        }
        this.method763(4);
        field1953++;
        arg3.drawImage(this.field407, arg1, arg0, this);
    }
}
