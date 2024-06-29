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

@OriginalClass("client!bc")
public class class282 extends class130 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field4476 = 0;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "[[B")
    public static byte[][] field4474 = new byte[1000][];

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "[I")
    public static int[] field4471 = new int[100];

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field4470 = -1;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "S")
    public static short field4472 = 320;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field4485 = 0;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field4469;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field4468;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[Lpk;")
    public static class43[] field4463;

    @OriginalMember(owner = "client!bc", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field4465;
        return this.field4468 == arg0;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
    public static void method1891(boolean arg0) {
        if (!arg0) {
            field4477 = 49;
        }
        field4463 = null;
        field4474 = null;
        field4471 = null;
    }

    @OriginalMember(owner = "client!bc", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field4482;
        if (this.field4468 == arg0) {
            this.field4468 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZILfl;Lfl;I)I")
    public static final int method1892(boolean arg0, int arg1, class80 arg2, class80 arg3, int arg4) {
        ++field4475;
        if (~arg4 == -2) {
            int var5 = arg3.field4591;
            int var6 = arg2.field4591;
            if (!arg0) {
                if (~var5 == 0) {
                    var5 = 2001;
                }
                if (~var6 == 0) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (~arg4 == -3) {
            return class183.method1278(arg2.method645(true).field789, (byte) -113, arg3.method645(true).field789, class145.field2391);
        } else {
            if (arg1 != 11746) {
                field4485 = 36;
            }
            if (arg4 == 3) {
                if (arg2.field1330.equals("-")) {
                    if (arg3.field1330.equals("-")) {
                        return 0;
                    } else {
                        return !arg0 ? 1 : -1;
                    }
                } else if (arg3.field1330.equals("-")) {
                    return !arg0 ? -1 : 1;
                } else {
                    return class183.method1278(arg2.field1330, (byte) -82, arg3.field1330, class145.field2391);
                }
            } else if (arg4 == 4) {
                if (arg2.method1937(-85)) {
                    return !arg3.method1937(-75) ? 1 : 0;
                } else {
                    return !arg3.method1937(51) ? 0 : -1;
                }
            } else if (~arg4 == -6) {
                if (arg2.method1938(-91)) {
                    return arg3.method1938(-108) ? 0 : 1;
                } else {
                    return !arg3.method1938(-77) ? 0 : -1;
                }
            } else if (arg4 == 6) {
                if (!arg2.method1929(0)) {
                    return arg3.method1929(0) ? -1 : 0;
                } else {
                    return !arg3.method1929(0) ? 1 : 0;
                }
            } else if (arg4 == 7) {
                if (!arg2.method1932((byte) 100)) {
                    return arg3.method1932((byte) 47) ? -1 : 0;
                } else {
                    return !arg3.method1932((byte) -125) ? 1 : 0;
                }
            } else {
                return -arg3.field1322 + arg2.field1322;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        ++field4484;
        this.method1896(arg4, arg0, arg1, arg2 + 45, arg3);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg1, arg4, arg3, arg0);
        arg5.drawImage(super.field2155, 0, 0, this);
        arg5.setClip(var7);
        if (arg2 != -46) {
            this.method746((Component) null, -13, 6, false);
        }
    }

    @OriginalMember(owner = "client!bc", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4473;
        return true;
    }

    @OriginalMember(owner = "client!bc", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field4468 = arg0;
        ++field4483;
        arg0.setDimensions(super.field2158, super.field2163);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field4469);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    private final synchronized void method1893(byte arg0) {
        ++field4478;
        if (this.field4468 != null) {
            this.field4468.setPixels(0, 0, super.field2158, super.field2163, this.field4469, super.field2156, 0, super.field2158);
            this.field4468.imageComplete(2);
            if (arg0 > -15) {
                this.field4468 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field4479;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIILkj;III)V")
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, class114 arg4, int arg5, int arg6, int arg7) {
        ++field4466;
        int var8 = arg0 * arg0 + arg2 * arg2;
        if (var8 <= arg5) {
            if (arg3 <= 110) {
                field4474 = null;
            }
            int var9 = Math.min(arg4.field1790 / 2, arg4.field1919 / 2);
            if (~(var9 * var9) > ~var8) {
                var9 -= 10;
                int var10 = 2047 & (int) class1.field1 + class183.field3022;
                int var11 = class95.field1482[var10];
                int var12 = var11 * 256 / (class131.field2184 - -256);
                int var13 = class95.field1475[var10];
                int var14 = var13 * 256 / (class131.field2184 + 256);
                int var15 = arg0 * var12 - -(arg2 * var14) >> 16;
                int var16 = arg0 * var14 + -(arg2 * var12) >> 16;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) (Math.sin(var17) * (double) var9);
                int var20 = (int) ((double) var9 * Math.cos(var17));
                ((class17) class60.field1028[arg7]).method116(arg6 - -(arg4.field1790 / 2) + var19 + -10, arg4.field1919 / 2 + arg1 + -var20 + -10, 20, 20, 15, 15, var17, 256);
            } else {
                class165.method1189(class171.field2882[arg7], arg6, arg2, 5542, arg1, arg0, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1895(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 < -71) {
            ++field4467;
            if (arg5 >= 0 && arg2 >= 0 && arg5 < 103 && arg2 < 103) {
                if (~arg1 == -1) {
                    class128 var8 = class148.method1089(arg4, arg5, arg2);
                    if (var8 != null) {
                        int var9 = Integer.MAX_VALUE & (int) (var8.field2107 >>> 32);
                        if (arg6 == 2) {
                            var8.field2117 = new class100(var9, 2, arg3 + 4, arg4, arg5, arg2, arg0, false, var8.field2117);
                            var8.field2105 = new class100(var9, 2, arg3 + 1 & 3, arg4, arg5, arg2, arg0, false, var8.field2105);
                        } else {
                            var8.field2117 = new class100(var9, arg6, arg3, arg4, arg5, arg2, arg0, false, var8.field2117);
                        }
                    }
                }
                if (~arg1 == -2) {
                    class195 var10 = class293.method1955(arg4, arg5, arg2);
                    if (var10 != null) {
                        int var11 = Integer.MAX_VALUE & (int) (var10.field3190 >>> 32);
                        if (arg6 != 4 && arg6 != 5) {
                            if (~arg6 == -7) {
                                var10.field3187 = new class100(var11, 4, arg3 + 4, arg4, arg5, arg2, arg0, false, var10.field3187);
                            } else if (arg6 != 7) {
                                if (~arg6 == -9) {
                                    var10.field3187 = new class100(var11, 4, arg3 + 4, arg4, arg5, arg2, arg0, false, var10.field3187);
                                    var10.field3185 = new class100(var11, 4, (3 & arg3 + 2) - -4, arg4, arg5, arg2, arg0, false, var10.field3185);
                                }
                            } else {
                                var10.field3187 = new class100(var11, 4, (arg3 - -2 & 3) + 4, arg4, arg5, arg2, arg0, false, var10.field3187);
                            }
                        } else {
                            var10.field3187 = new class100(var11, 4, arg3, arg4, arg5, arg2, arg0, false, var10.field3187);
                        }
                    }
                }
                if (~arg1 == -3) {
                    if (~arg6 == -12) {
                        arg6 = 10;
                    }
                    class190 var12 = class244.method1619(arg4, arg5, arg2);
                    if (var12 != null) {
                        var12.field3119 = new class100(Integer.MAX_VALUE & (int) (var12.field3118 >>> 32), arg6, arg3, arg4, arg5, arg2, arg0, false, var12.field3119);
                    }
                }
                if (~arg1 == -4) {
                    class249 var13 = class75.method598(arg4, arg5, arg2);
                    if (var13 != null) {
                        var13.field3973 = new class100((int) (var13.field3979 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg4, arg5, arg2, arg0, false, var13.field3973);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    public final void method746(Component arg0, int arg1, int arg2, boolean arg3) {
        super.field2158 = arg1;
        ++field4480;
        super.field2163 = arg2;
        super.field2156 = new int[arg1 * arg2 + 1];
        this.field4469 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2155 = arg0.createImage(this);
        this.method1893((byte) -121);
        if (arg3) {
            arg0.prepareImage(super.field2155, this);
            this.method1893((byte) -90);
            arg0.prepareImage(super.field2155, this);
            this.method1893((byte) -103);
            arg0.prepareImage(super.field2155, this);
            this.method943(128);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method744(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 == 1152) {
            this.method1893((byte) -69);
            arg2.drawImage(super.field2155, arg3, arg1, this);
            ++field4481;
        }
    }

    @OriginalMember(owner = "client!bc", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field4462;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1896(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            field4485 = -116;
        }
        ++field4464;
        if (this.field4468 != null) {
            this.field4468.setPixels(arg2, arg0, arg4, arg1, this.field4469, super.field2156, super.field2158 * arg0 + arg2, super.field2158);
            this.field4468.imageComplete(2);
        }
    }
}
