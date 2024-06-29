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

@OriginalClass("client!o")
public class class220 extends class136 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!o", name = "u", descriptor = "[I")
    public static int[] field3096 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Z")
    public static boolean field3100 = false;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3106;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3090;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "[I")
    public static int[] field3104;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Z", line = 4)
    public static final boolean method1508(boolean arg0) {
        field3093++;
        class319 var1 = class138.field1928;
        synchronized (class138.field1928) {
            if (class325.field4982 == class242.field3648) {
                return false;
            }
            class320.field4912 = class326.field4991[class325.field4982];
            class12.field167 = class216.field3039[class325.field4982];
            class325.field4982 = class325.field4982 + 1 & 0x7F;
            if (arg0) {
                method1508(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V", line = 22)
    public static final void method1509() {
        class247.field3733 = 0;
        label194: for (int var0 = 0; var0 < class31.field390; var0++) {
            class342 var1 = class287.field4507[var0];
            if (class195.field2798 != null) {
                for (int var2 = 0; var2 < class195.field2798.length; var2++) {
                    if (class195.field2798[var2] != -1000000 && (var1.field5319 <= class195.field2798[var2] || var1.field5310 <= class195.field2798[var2]) && (var1.field5322 <= class267.field4205[var2] || var1.field5295 <= class267.field4205[var2]) && (var1.field5322 >= class342.field5301[var2] || var1.field5295 >= class342.field5301[var2]) && (var1.field5318 <= class292.field4578[var2] || var1.field5320 <= class292.field4578[var2]) && (var1.field5318 >= class206.field2888[var2] || var1.field5320 >= class206.field2888[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field5317 == 1) {
                int var3 = var1.field5321 + class342.field5302 - class49.field610;
                if (var3 >= 0 && var3 <= class342.field5302 + class342.field5302) {
                    int var4 = var1.field5305 + class342.field5302 - class242.field3645;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field5306 + class342.field5302 - class242.field3645;
                    if (var5 > class342.field5302 + class342.field5302) {
                        var5 = class342.field5302 + class342.field5302;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class218.field3067[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class330.field5053 - var1.field5322;
                        if (var7 > 32) {
                            var1.field5309 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field5309 = 2;
                            var7 = -var7;
                        }
                        var1.field5300 = (var1.field5318 - class165.field2287 << 8) / var7;
                        var1.field5308 = (var1.field5320 - class165.field2287 << 8) / var7;
                        var1.field5296 = (var1.field5319 - class329.field5024 << 8) / var7;
                        var1.field5298 = (var1.field5310 - class329.field5024 << 8) / var7;
                        class337.field5216[class247.field3733++] = var1;
                    }
                }
            } else if (var1.field5317 == 2) {
                int var8 = var1.field5305 + class342.field5302 - class242.field3645;
                if (var8 >= 0 && var8 <= class342.field5302 + class342.field5302) {
                    int var9 = var1.field5321 + class342.field5302 - class49.field610;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field5314 + class342.field5302 - class49.field610;
                    if (var10 > class342.field5302 + class342.field5302) {
                        var10 = class342.field5302 + class342.field5302;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class218.field3067[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class165.field2287 - var1.field5318;
                        if (var12 > 32) {
                            var1.field5309 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field5309 = 4;
                            var12 = -var12;
                        }
                        var1.field5313 = (var1.field5322 - class330.field5053 << 8) / var12;
                        var1.field5299 = (var1.field5295 - class330.field5053 << 8) / var12;
                        var1.field5296 = (var1.field5319 - class329.field5024 << 8) / var12;
                        var1.field5298 = (var1.field5310 - class329.field5024 << 8) / var12;
                        class337.field5216[class247.field3733++] = var1;
                    }
                }
            } else if (var1.field5317 == 4) {
                int var13 = var1.field5319 - class329.field5024;
                if (var13 > 128) {
                    int var14 = var1.field5305 + class342.field5302 - class242.field3645;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field5306 + class342.field5302 - class242.field3645;
                    if (var15 > class342.field5302 + class342.field5302) {
                        var15 = class342.field5302 + class342.field5302;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field5321 + class342.field5302 - class49.field610;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field5314 + class342.field5302 - class49.field610;
                        if (var17 > class342.field5302 + class342.field5302) {
                            var17 = class342.field5302 + class342.field5302;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class218.field3067[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field5309 = 5;
                            var1.field5313 = (var1.field5322 - class330.field5053 << 8) / var13;
                            var1.field5299 = (var1.field5295 - class330.field5053 << 8) / var13;
                            var1.field5300 = (var1.field5318 - class165.field2287 << 8) / var13;
                            var1.field5308 = (var1.field5320 - class165.field2287 << 8) / var13;
                            class337.field5216[class247.field3733++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZII)V", line = 245)
    private final synchronized void method1510(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3098++;
        if (this.field3090 == null) {
            return;
        }
        this.field3090.setPixels(arg3, arg1, arg0, arg4, this.field3106, this.field1883, this.field1889 * arg1 + arg3, this.field1889);
        this.field3090.imageComplete(2);
        if (!arg2) {
            field3096 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!o", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 261)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3090 = arg0;
        field3101++;
        arg0.setDimensions(this.field1889, this.field1885);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3106);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I", line = 274)
    public static final int method1511(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V", line = 286)
    public final void method906(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5) {
        if (arg2) {
            method1511(73, -82);
        }
        this.method1510(arg4, arg5, !arg2, arg0, arg1);
        Shape var7 = arg3.getClip();
        field3107++;
        arg3.clipRect(arg0, arg5, arg4, arg1);
        arg3.drawImage(this.field1887, 0, 0, this);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!o", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 304)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3094++;
        return true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JIIZI)Ljava/lang/String;", line = 313)
    public static final String method1512(long arg0, int arg1, int arg2, boolean arg3, int arg4) {
        char var6 = ',';
        field3092++;
        char var7 = '.';
        boolean var8 = false;
        if (arg4 < 61) {
            field3097 = -98;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 389)
    public final void startProduction(ImageConsumer arg0) {
        field3103++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)Z", line = 399)
    public static final boolean method1513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 425)
    private final synchronized void method1514(int arg0) {
        field3088++;
        if (this.field3090 == null) {
            return;
        }
        this.field3090.setPixels(0, 0, this.field1889, this.field1885, this.field3106, this.field1883, 0, this.field1889);
        this.field3090.imageComplete(2);
        if (arg0 <= 22) {
            method1509();
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 440)
    public static final Class method1515(int arg0, String arg1) throws ClassNotFoundException {
        if (arg0 != 32) {
            field3096 = (int[]) null;
        }
        field3099++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 477)
    public final void method909(Graphics arg0, int arg1, int arg2, byte arg3) {
        field3091++;
        this.method1514(arg3 + 38);
        arg0.drawImage(this.field1887, arg1, arg2, this);
        if (arg3 != 71) {
            method1511(33, 69);
        }
    }

    @OriginalMember(owner = "client!o", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 493)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field3102++;
        return this.field3090 == arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 504)
    public final void method905(int arg0, Component arg1, int arg2, int arg3) {
        this.field1889 = arg3;
        this.field1883 = new int[arg0 * arg3 + arg2];
        field3089++;
        this.field1885 = arg0;
        this.field3106 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1887 = arg1.createImage(this);
        this.method1514(40);
        arg1.prepareImage(this.field1887, this);
        this.method1514(49);
        arg1.prepareImage(this.field1887, this);
        this.method1514(arg2 ^ 0x70);
        arg1.prepareImage(this.field1887, this);
        this.method904((byte) -28);
    }

    @OriginalMember(owner = "client!o", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 527)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field3095++;
        if (this.field3090 == arg0) {
            this.field3090 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 543)
    public static void method1516(int arg0) {
        if (arg0 == 12633) {
            field3096 = null;
            field3104 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 560)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field3105++;
    }
}
