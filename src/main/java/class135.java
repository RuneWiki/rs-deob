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

@OriginalClass("client!cg")
public class class135 extends class137 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field2219 = -1;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "J")
    public static long field2221 = 0L;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field2222 = -1;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "[I")
    public static int[] field2230 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2234;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2226;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "[S")
    public static short[] field2231;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method999(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2225;
        if (this.field2226 != null) {
            this.field2226.setPixels(arg4, arg2, arg1, arg0, this.field2234, super.field2252, super.field2253 * arg2 - -arg4, super.field2253);
            if (arg3 == -1) {
                this.field2226.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2223;
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method1000(int arg0, Component arg1, int arg2, int arg3) {
        super.field2248 = arg0;
        if (arg3 != 1994341016) {
            field2231 = null;
        }
        super.field2252 = new int[arg0 * arg2 + 1];
        super.field2253 = arg2;
        ++field2218;
        this.field2234 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2254 = arg1.createImage(this);
        this.method1006(32744);
        arg1.prepareImage(super.field2254, this);
        this.method1006(32744);
        arg1.prepareImage(super.field2254, this);
        this.method1006(32744);
        arg1.prepareImage(super.field2254, this);
        this.method1016(255);
    }

    @OriginalMember(owner = "client!cg", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2227;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIILdf;)V")
    public static final void method1001(int arg0, int arg1, int arg2, int arg3, int arg4, class253 arg5) {
        ++field2235;
        if (arg5.field4287 != -1 || arg5.field4278 != null) {
            if (arg0 > -42) {
                field2230 = null;
            }
            int var6 = class292.field4785 * arg5.field4302 >> 8;
            int var7 = 0;
            if (~arg2 >= ~arg5.field4292) {
                if (arg2 < arg5.field4273) {
                    var7 += arg5.field4273 - arg2;
                }
            } else {
                var7 += arg2 - arg5.field4292;
            }
            if (arg5.field4296 >= arg3) {
                if (arg3 < arg5.field4294) {
                    var7 += -arg3 + arg5.field4294;
                }
            } else {
                var7 += arg3 - arg5.field4296;
            }
            if (arg5.field4274 != 0 && var7 - 64 <= arg5.field4274 && ~class292.field4785 != -1 && ~arg5.field4275 == ~arg1) {
                var7 -= 64;
                if (var7 < 0) {
                    var7 = 0;
                }
                int var8 = (-var7 + arg5.field4274) * var6 / arg5.field4274;
                if (arg5.field4289 != null) {
                    arg5.field4289.method407(var8);
                } else if (arg5.field4287 >= 0) {
                    class309 var9 = class309.method2080(class13.field286, arg5.field4287, 0);
                    if (var9 != null) {
                        class178 var10 = var9.method2082().method1303(class248.field4147);
                        class59 var11 = class59.method380(var10, 100, var8);
                        var11.method376(-1);
                        class278.field4627.method107(var11);
                        arg5.field4289 = var11;
                    }
                }
                if (arg5.field4300 != null) {
                    arg5.field4300.method407(var8);
                    if (!arg5.field4300.method995(32)) {
                        arg5.field4300 = null;
                    }
                } else {
                    if (arg5.field4278 != null && (arg5.field4285 -= arg4) <= 0) {
                        int var12 = (int) ((double) arg5.field4278.length * Math.random());
                        class309 var13 = class309.method2080(class13.field286, arg5.field4278[var12], 0);
                        if (var13 != null) {
                            class178 var14 = var13.method2082().method1303(class248.field4147);
                            class59 var15 = class59.method380(var14, 100, var8);
                            var15.method376(0);
                            class278.field4627.method107(var15);
                            arg5.field4300 = var15;
                            arg5.field4285 = (int) ((double) (-arg5.field4290 + arg5.field4284) * Math.random()) + arg5.field4290;
                            return;
                        }
                    }
                }
            } else {
                if (arg5.field4289 != null) {
                    class278.field4627.method113(arg5.field4289);
                    arg5.field4289 = null;
                }
                if (arg5.field4300 != null) {
                    class278.field4627.method113(arg5.field4300);
                    arg5.field4300 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1002(String arg0, int arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        ++field2224;
        int var5 = 0;
        for (int var6 = 0; ~class241.field4062 < ~var6; ++var6) {
            class71 var9 = class13.method75(false, var6);
            if ((!arg2 || var9.field1189) && var9.field1195 == -1 && ~var9.field1214 == 0 && ~var9.field1247 == -1 && ~var9.field1209.toLowerCase().indexOf(var3) != 0) {
                if (~var5 <= -251) {
                    class246.field4127 = null;
                    class45.field706 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var5 > var11; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (arg1 != -22655) {
            method1002((String) null, 53, false);
        }
        class246.field4127 = var4;
        class45.field706 = var5;
        String[] var7 = new String[class45.field706];
        class80.field1344 = 0;
        for (int var8 = 0; class45.field706 > var8; ++var8) {
            var7[var8] = class13.method75(false, var4[var8]).field1209;
        }
        class213.method1512(0, var7, class246.field4127);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public static void method1003(int arg0) {
        field2230 = null;
        field2231 = null;
        if (arg0 != -17421) {
            method1001(-106, -31, 25, 78, -86, (class253) null);
        }
    }

    @OriginalMember(owner = "client!cg", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2229;
        return this.field2226 == arg0;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1004(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field2220;
        this.method1006(32744);
        arg3.drawImage(super.field2254, arg1, arg2, this);
        if (arg0 != -6187) {
            this.method999(78, -14, 4, 23, 79);
        }
    }

    @OriginalMember(owner = "client!cg", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2216;
        this.field2226 = arg0;
        arg0.setDimensions(super.field2253, super.field2248);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2234);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!cg", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2228;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method1005(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method999(arg3, arg5, arg0, arg4 ^ -16733374, arg2);
        Shape var7 = arg1.getClip();
        if (arg4 != 16733373) {
            this.addConsumer((ImageConsumer) null);
        }
        arg1.clipRect(arg2, arg0, arg5, arg3);
        ++field2215;
        arg1.drawImage(super.field2254, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
    private final synchronized void method1006(int arg0) {
        ++field2232;
        if (this.field2226 != null) {
            this.field2226.setPixels(0, 0, super.field2253, super.field2248, this.field2234, super.field2252, 0, super.field2253);
            this.field2226.imageComplete(2);
            if (arg0 != 32744) {
                this.removeConsumer((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2226 == arg0) {
            this.field2226 = null;
        }
        ++field2217;
    }
}
