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

@OriginalClass("client!oka")
public class class385 extends class451 implements ImageProducer {

    @OriginalMember(owner = "client!oka", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field5636 = new String[] { method3036(method3035("pv\u001bZ ")), method3036(method3035("e-Y\u0018")), method3036(method3035("d3TZ4x\u001bZ\u001a.~5P\u0006u")), method3036(method3035("d3TZ\u0015#")), method3036(method3035("d3TZ/n5Z\u00028H7[\u0007(f=G\\")), method3036(method3035("d3TZ\u0014#")), method3036(method3035("d3TZ/n)@\u0011.\u007f\fZ\u0004\u0019d/[88m,g\u001d:c,g\u0011.n6Q\\")), method3036(method3035("d3TZ.\u007f9G\u0000\ry7Q\u0001>\u007f1Z\u001au")), method3036(method3035("d3TZ\u0016#")), method3036(method3035("d3TZ<o<v\u001b3x-X\u0011/#")), method3036(method3035("d3TZ\u001c#")), method3036(method3035("d3TZ\u001f#")), method3036(method3035("d3TZ\u0017#")), method3036(method3035("d3TZ\u001a#")) };

    @OriginalMember(owner = "client!oka", name = "u", descriptor = "Lsb;")
    public static class261 field5621 = new class261(43, -2);

    @OriginalMember(owner = "client!oka", name = "z", descriptor = "I")
    public static int field5631 = 0;

    @OriginalMember(owner = "client!oka", name = "D", descriptor = "Lhh;")
    public static class250 field5635 = new class250(4);

    @OriginalMember(owner = "client!oka", name = "y", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!oka", name = "B", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!oka", name = "r", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!oka", name = "q", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!oka", name = "s", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!oka", name = "I", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!oka", name = "J", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!oka", name = "A", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!oka", name = "v", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!oka", name = "H", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!oka", name = "x", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!oka", name = "C", descriptor = "Ltb;")
    public static class392 field5626;

    @OriginalMember(owner = "client!oka", name = "G", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5623;

    @OriginalMember(owner = "client!oka", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field5625;

    @OriginalMember(owner = "client!oka", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5618;

    @OriginalMember(owner = "client!oka", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5616;

    @OriginalMember(owner = "client!oka", name = "t", descriptor = "[[B")
    public static byte[][] field5630;

    @OriginalMember(owner = "client!oka", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        try {
            ++field5627;
            this.field5616 = arg0;
            arg0.setDimensions(super.field6616, super.field6618);
            arg0.setProperties((Hashtable) null);
            arg0.setColorModel(this.field5618);
            arg0.setHints(14);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5636[9] + (arg0 != null ? field5636[0] : field5636[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "c", descriptor = "(B)V")
    private final synchronized void method3030(byte arg0) {
        try {
            ++field5629;
            if (this.field5616 != null) {
                this.field5616.setPixels(0, 0, super.field6616, super.field6618, this.field5618, super.field6611, 0, super.field6616);
                if (arg0 != -126) {
                    this.addConsumer((ImageConsumer) null);
                }
                this.field5616.imageComplete(2);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5636[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        try {
            ++field5633;
            return this.field5616 == arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5636[2] + (arg0 != null ? field5636[0] : field5636[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "(Ljava/awt/Canvas;III)V")
    public final void method777(Canvas arg0, int arg1, int arg2, int arg3) {
        try {
            ++field5632;
            super.field6618 = arg2;
            this.field5623 = arg0;
            super.field6616 = arg3;
            super.field6611 = new int[super.field6618 * super.field6616];
            this.field5618 = new DirectColorModel(32, 16711680, 65280, 255);
            this.field5625 = this.field5623.createImage(this);
            this.method3030((byte) -126);
            this.field5623.prepareImage(this.field5625, this.field5623);
            this.method3030((byte) -126);
            this.field5623.prepareImage(this.field5625, this.field5623);
            if (arg1 <= 120) {
                this.field5623 = null;
            }
            this.method3030((byte) -126);
            this.field5623.prepareImage(this.field5625, this.field5623);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5636[10] + (arg0 != null ? field5636[0] : field5636[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public final void method776(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        try {
            ++field5628;
            this.method3033(arg2, (byte) -48, arg6, arg5, arg1);
            Shape var9 = arg4.getClip();
            arg4.clipRect(arg0, arg3, arg2, arg6);
            if (arg7 == -303) {
                arg4.drawImage(this.field5625, -arg1 + arg0, -arg5 + arg3, this.field5623);
                arg4.setClip(var9);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field5636[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5636[0] : field5636[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        try {
            ++field5634;
            this.addConsumer(arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5636[7] + (arg0 != null ? field5636[0] : field5636[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        try {
            if (this.field5616 == arg0) {
                this.field5616 = null;
            }
            ++field5622;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5636[4] + (arg0 != null ? field5636[0] : field5636[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        try {
            ++field5617;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5636[6] + (arg0 != null ? field5636[0] : field5636[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "(BLjc;)V")
    public static final void method3031(byte arg0, class711 arg1) {
        try {
            ++field5619;
            if (~(arg1.field9996.length + -arg1.field9945) <= -2) {
                int var2 = arg1.method5128(0);
                if (var2 >= 0 && var2 <= 1) {
                    if (~(arg1.field9996.length + -arg1.field9945) <= -3) {
                        int var3 = arg1.method5116((byte) -109);
                        if (arg1.field9996.length + -arg1.field9945 >= var3 * 6) {
                            for (int var4 = 0; ~var3 < ~var4; ++var4) {
                                int var5 = arg1.method5116((byte) -112);
                                int var6 = arg1.method5113(18443);
                                if (class247.field3527.length > var5 && class290.field4098[var5] && (~class44.field636.method3745(true, var5).field1562 != -50 || ~var6 <= 0 && var6 <= 1)) {
                                    class247.field3527[var5] = var6;
                                }
                            }
                            if (arg0 < 15) {
                                method3032(-69);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5636[3] + arg0 + ',' + (arg1 != null ? field5636[0] : field5636[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "(I)V")
    public static void method3032(int arg0) {
        try {
            if (arg0 > -17) {
                field5635 = null;
            }
            field5635 = null;
            field5626 = null;
            field5621 = null;
            field5630 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5636[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "(IBIII)V")
    private final synchronized void method3033(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            ++field5624;
            int var6 = -104 % ((arg1 - 39) / 44);
            if (this.field5616 != null) {
                this.field5616.setPixels(arg4, arg3, arg0, arg2, this.field5618, super.field6611, super.field6616 * arg3 + arg4, super.field6616);
                this.field5616.imageComplete(2);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5636[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "a", descriptor = "(IIII[BZI)Z")
    public static final boolean method3034(int arg0, int arg1, int arg2, int arg3, byte[] arg4, boolean arg5, int arg6) {
        try {
            ++field5620;
            int var7 = arg0 % arg6;
            int var8;
            if (var7 != 0) {
                var8 = arg6 - var7;
            } else {
                var8 = 0;
            }
            int var9 = -((arg2 + arg6 - 1) / arg6);
            int var10 = -((arg6 + -1 + arg0) / arg6);
            if (arg5) {
                field5631 = 123;
            }
            for (int var11 = var9; ~var11 > -1; ++var11) {
                for (int var12 = var10; ~var12 > -1; ++var12) {
                    if (~arg4[arg3] == -1) {
                        return true;
                    }
                    arg3 += arg6;
                }
                arg3 -= var8;
                if (~arg4[arg3 + -1] == -1) {
                    return true;
                }
                arg3 += arg1;
            }
            return false;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field5636[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5636[0] : field5636[1]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!oka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3035(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 93);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3036(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
