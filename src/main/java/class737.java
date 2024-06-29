import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class737 extends class666 implements ImageProducer {

    @OriginalMember(owner = "client!mga", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field10732 = new String[] { method5386(method5385("x\u0018h\u001b\u000e=")), method5386(method5385("nQ'\u001b2")), method5386(method5385("{\neY")), method5386(method5385("x\u0018h\u001b\u000b=")), method5386(method5385("x\u0018h\u001b\r=")), method5386(method5385("x\u0018h\u001b\t=")), method5386(method5385("x\u0018h\u001b<a\u001e{A\u001fg\u0010m@,a\u0016f[g")), method5386(method5385("x\u0018h\u001b&f<f[<`\u0012lGg")), method5386(method5385("x\u0018h\u001b\u0006=")), method5386(method5385("x\u0018h\u001b\u0007=")), method5386(method5385("x\u0018h\u001b=p\u000e|P<a+fE\u000bz\bgy*s\u000b[\\(}\u000b[P<p\u0011m\u001d")), method5386(method5385("x\u0018h\u001b\b=")), method5386(method5385("x\u0018h\u001b\n=")), method5386(method5385("x\u0018h\u001b.q\u001bJZ!f\ndP==")), method5386(method5385("x\u0018h\u001b=p\u0012fC*V\u0010gF:x\u001a{\u001d")) };

    @OriginalMember(owner = "client!mga", name = "u", descriptor = "Lef;")
    public static class513 field10713 = new class513();

    @OriginalMember(owner = "client!mga", name = "G", descriptor = "Lel;")
    public static class573 field10731 = new class573(128, 1);

    @OriginalMember(owner = "client!mga", name = "H", descriptor = "I")
    public static int field10714;

    @OriginalMember(owner = "client!mga", name = "y", descriptor = "I")
    public static int field10716;

    @OriginalMember(owner = "client!mga", name = "w", descriptor = "I")
    public static int field10720;

    @OriginalMember(owner = "client!mga", name = "v", descriptor = "I")
    public static int field10721;

    @OriginalMember(owner = "client!mga", name = "A", descriptor = "I")
    public static int field10722;

    @OriginalMember(owner = "client!mga", name = "B", descriptor = "I")
    public static int field10723;

    @OriginalMember(owner = "client!mga", name = "x", descriptor = "I")
    public static int field10724;

    @OriginalMember(owner = "client!mga", name = "F", descriptor = "I")
    public static int field10725;

    @OriginalMember(owner = "client!mga", name = "t", descriptor = "I")
    public static int field10726;

    @OriginalMember(owner = "client!mga", name = "r", descriptor = "I")
    public static int field10727;

    @OriginalMember(owner = "client!mga", name = "s", descriptor = "I")
    public static int field10728;

    @OriginalMember(owner = "client!mga", name = "C", descriptor = "I")
    public static int field10729;

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "I")
    public static int field10730;

    @OriginalMember(owner = "client!mga", name = "E", descriptor = "Ljava/awt/Canvas;")
    private Canvas field10715;

    @OriginalMember(owner = "client!mga", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field10719;

    @OriginalMember(owner = "client!mga", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field10718;

    @OriginalMember(owner = "client!mga", name = "p", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field10717;

    @OriginalMember(owner = "client!mga", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 5)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        try {
            ++field10716;
            this.field10717 = arg0;
            arg0.setDimensions(super.field9688, super.field9684);
            arg0.setProperties((Hashtable) null);
            arg0.setColorModel(this.field10718);
            arg0.setHints(14);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10732[13] + (arg0 != null ? field10732[1] : field10732[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(BI)V", line = 22)
    public static final void method5379(byte arg0, int arg1) {
        try {
            ++field10722;
            if (class334.method2801(arg1, 0)) {
                if (arg0 >= 115) {
                    class541[] var2 = class683.field9897[arg1];
                    for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                        class541 var4 = var2[var3];
                        if (var4 != null) {
                            var4.field7944 = 0;
                            var4.field8010 = 1;
                            var4.field7951 = 0;
                        }
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10732[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)V", line = 55)
    public static void method5380(int arg0) {
        try {
            field10731 = null;
            field10713 = null;
            if (arg0 != -2) {
                method5383((byte) 98, 75, -9, 38, (class282) null, -4);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10732[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)V", line = 68)
    private final synchronized void method5381(int arg0) {
        try {
            ++field10730;
            if (this.field10717 != null) {
                this.field10717.setPixels(0, 0, super.field9688, super.field9684, this.field10718, super.field9685, 0, super.field9688);
                if (arg0 < 111) {
                    this.method3102(28, 100, 44, (Graphics) null, 67, -74, -73, 99);
                }
                this.field10717.imageComplete(2);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10732[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 86)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        try {
            ++field10725;
            if (this.field10717 == arg0) {
                this.field10717 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10732[14] + (arg0 != null ? field10732[1] : field10732[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IBIII)V", line = 98)
    private final synchronized void method5382(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg1 < 119) {
                this.addConsumer((ImageConsumer) null);
            }
            ++field10726;
            if (this.field10717 != null) {
                this.field10717.setPixels(arg0, arg4, arg3, arg2, this.field10718, super.field9685, super.field9688 * arg4 - -arg0, super.field9688);
                this.field10717.imageComplete(2);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10732[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 113)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        try {
            ++field10724;
            return this.field10717 == arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10732[7] + (arg0 != null ? field10732[1] : field10732[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(BIIILrn;I)V", line = 124)
    public static final void method5383(byte arg0, int arg1, int arg2, int arg3, class282 arg4, int arg5) {
        try {
            ++field10721;
            if (arg0 <= 51) {
                field10713 = null;
            }
            if (~arg2 <= -2 && arg5 >= 1 && arg2 <= class648.field9378 + -2 && ~arg5 >= ~(class659.field9506 + -2)) {
                if (class734.field10683 == null) {
                    return;
                }
                class583 var6 = class531.field7799.method765(arg3, arg1, -1, arg5, arg2);
                if (var6 != null) {
                    if (!(var6 instanceof class677)) {
                        if (!(var6 instanceof class362)) {
                            if (var6 instanceof class748) {
                                ((class748) var6).method5443((byte) -77, arg4);
                                return;
                            }
                            if (var6 instanceof class125) {
                                ((class125) var6).method1089(-117, arg4);
                                return;
                            }
                        } else {
                            ((class362) var6).method2941((byte) -123, arg4);
                        }
                        return;
                    }
                    ((class677) var6).method4966((byte) 72, arg4);
                    return;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10732[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10732[1] : field10732[2]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/awt/Canvas;III)V", line = 172)
    public final void method3103(Canvas arg0, int arg1, int arg2, int arg3) {
        try {
            super.field9684 = arg3;
            ++field10729;
            super.field9688 = arg2;
            int var5 = -28 / ((arg1 - -48) / 49);
            this.field10715 = arg0;
            super.field9685 = new int[super.field9688 * super.field9684];
            this.field10718 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field10719 = this.field10715.createImage(this);
            this.method5381(119);
            this.field10715.prepareImage(this.field10719, this.field10715);
            this.method5381(114);
            this.field10715.prepareImage(this.field10719, this.field10715);
            this.method5381(112);
            this.field10715.prepareImage(this.field10719, this.field10715);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10732[4] + (arg0 != null ? field10732[1] : field10732[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIILjava/awt/Graphics;IIII)V", line = 194)
    public final void method3102(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            this.method5382(arg0, (byte) 123, arg2, arg4, arg1);
            ++field10720;
            Shape var9 = arg3.getClip();
            arg3.clipRect(arg6, arg5, arg4, arg2);
            arg3.drawImage(this.field10719, arg6 - arg0, -arg1 + arg5, this.field10715);
            if (arg7 != 100) {
                this.field10717 = null;
            }
            arg3.setClip(var9);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10732[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10732[1] : field10732[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 212)
    public final void startProduction(ImageConsumer arg0) {
        try {
            ++field10728;
            this.addConsumer(arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10732[6] + (arg0 != null ? field10732[1] : field10732[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 220)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        try {
            ++field10714;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10732[10] + (arg0 != null ? field10732[1] : field10732[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(Lla;I)V", line = 227)
    public static final void method5384(class476 arg0, int arg1) {
        try {
            class470.field6832 = arg0;
            ++field10723;
            if (arg1 < 1) {
                field10713 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10732[5] + (arg0 != null ? field10732[1] : field10732[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5385(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5386(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 21;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 53;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
