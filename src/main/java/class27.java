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

@OriginalClass("client!jj")
public class class27 extends class188 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "Lok;")
    public static class41 field403 = class137.method956(")4l=", 45);

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Z")
    public static boolean field393 = true;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[I")
    public static int[] field399 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "Lok;")
    public static class41 field395 = class137.method956("cookiehost", 45);

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "Lok;")
    public static class41 field408 = class137.method956("Eingabeprozedur geladen)3", 45);

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "Lag;")
    public static class211 field397;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field407;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field409;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "[I")
    public static int[] field404;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Lre;", line = 6)
    public static final class285 method172(int arg0, int arg1, int arg2) {
        class308 var3 = class205.field3312[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class285 var4 = var3.field5209;
            var3.field5209 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILok;)V", line = 20)
    public static final void method173(int arg0, int arg1, class41 arg2) {
        if (arg1 != 2809) {
            field395 = (class41) null;
        }
        class41 var3 = arg2.method278((byte) -77).method288((byte) -119);
        field414++;
        boolean var4 = false;
        for (int var5 = 0; var5 < class85.field1248; var5++) {
            class245 var6 = class246.field3955[class118.field1737[var5]];
            if (var6 != null && var6.field3933 != null && var6.field3933.method306(var3, 27080)) {
                var4 = true;
                class145.method1004(0, false, 1, 0, var6.field4341[0], 2, 1, class62.field913.field4341[0], class62.field913.field4306[0], 0, -126, var6.field4306[0]);
                if (arg0 == 1) {
                    class273.field4461++;
                    class285.field4642.method844(-4, 197);
                    class285.field4642.method760(false, class118.field1737[var5]);
                } else if (arg0 == 4) {
                    class181.field2935++;
                    class285.field4642.method844(-4, 90);
                    class285.field4642.method760(false, class118.field1737[var5]);
                } else if (arg0 == 5) {
                    class78.field1150++;
                    class285.field4642.method844(-4, 247);
                    class285.field4642.method760(false, class118.field1737[var5]);
                } else if (arg0 == 6) {
                    class285.field4642.method844(-4, 128);
                    class22.field334++;
                    class285.field4642.method794(class118.field1737[var5], arg1 ^ 0xA79);
                } else if (arg0 == 7) {
                    class122.field1803++;
                    class285.field4642.method844(-4, 83);
                    class285.field4642.method760(false, class118.field1737[var5]);
                }
                break;
            }
        }
        if (!var4) {
            class262.method1843(class187.method1346(new class41[] { class202.field3243, var3 }, 0), 0, class266.field4233, 45);
        }
    }

    @OriginalMember(owner = "client!jj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 96)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field390++;
        return this.field409 == arg0;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V", line = 104)
    public static void method174(byte arg0) {
        field395 = null;
        field399 = null;
        field397 = null;
        field408 = null;
        field403 = null;
        if (arg0 != 44) {
            field399 = (int[]) null;
        }
        field404 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIII)V", line = 120)
    public static final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field396++;
        if (arg5 >= 1 && arg2 >= 1 && arg5 <= 102 && arg2 <= 102) {
            if (!class75.method553(23987) && (class126.field1879[0][arg5][arg2] & 0x2) == 0) {
                int var8 = arg0;
                if ((class126.field1879[arg0][arg5][arg2] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class5.field58 != var8) {
                    return;
                }
            }
            int var9 = arg0;
            if (arg0 < 3 && (class126.field1879[1][arg5][arg2] & 0x2) == 2) {
                var9 = arg0 + 1;
            }
            class307.method2137(arg2, arg3, arg4 + 110, arg5, class222.field3548[arg0], var9, arg0);
            if (arg7 >= 0) {
                boolean var10 = class296.field4778;
                class296.field4778 = true;
                class181.method1295(arg2, arg6, class222.field3548[arg0], arg0, arg5, var9, (byte) -120, false, false, arg1, arg7);
                class296.field4778 = var10;
            }
        }
        if (arg4 != 0) {
            method172(-112, 42, -84);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBLjava/awt/Component;I)V", line = 182)
    public final void method176(int arg0, byte arg1, Component arg2, int arg3) {
        this.field3057 = arg0;
        this.field3061 = new int[arg0 * arg3 + 1];
        field411++;
        this.field3056 = arg3;
        this.field407 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3060 = arg2.createImage(this);
        if (arg1 > -114) {
            this.field409 = (ImageConsumer) null;
        }
        this.method177((byte) -75);
        arg2.prepareImage(this.field3060, this);
        this.method177((byte) -86);
        arg2.prepareImage(this.field3060, this);
        this.method177((byte) -88);
        arg2.prepareImage(this.field3060, this);
        this.method1353((byte) -26);
    }

    @OriginalMember(owner = "client!jj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 206)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field409 = arg0;
        field401++;
        arg0.setDimensions(this.field3056, this.field3057);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field407);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V", line = 218)
    private final synchronized void method177(byte arg0) {
        field413++;
        if (this.field409 == null) {
            return;
        }
        this.field409.setPixels(0, 0, this.field3056, this.field3057, this.field407, this.field3061, 0, this.field3056);
        if (arg0 > -64) {
            this.method179(false, (Graphics) null, -77, 122, -86, 72);
        }
        this.field409.imageComplete(2);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILjava/awt/Graphics;B)V", line = 234)
    public final void method178(int arg0, int arg1, Graphics arg2, byte arg3) {
        field406++;
        this.method177((byte) -126);
        if (arg3 != -117) {
            field400 = 35;
        }
        arg2.drawImage(this.field3060, arg1, arg0, this);
    }

    @OriginalMember(owner = "client!jj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 257)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field409 == arg0) {
            this.field409 = null;
        }
        field391++;
    }

    @OriginalMember(owner = "client!jj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 274)
    public final void startProduction(ImageConsumer arg0) {
        field398++;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLjava/awt/Graphics;IIII)V", line = 289)
    public final void method179(boolean arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            this.imageUpdate((Image) null, 77, 77, 24, 126, -30);
        }
        field392++;
        this.method181(arg2, arg5, arg3, arg4, 2);
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg2, arg5, arg3, arg4);
        arg1.drawImage(this.field3060, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V", line = 307)
    public static final void method180(byte arg0) {
        field412++;
        for (class66 var1 = (class66) class290.field4703.method1495(-312); var1 != null; var1 = (class66) class290.field4703.method1501(arg0 ^ 0xFFFFFFF5)) {
            class311 var2 = var1.field1002;
            if (class55.field807 != var2.field5255 || var2.field5260) {
                var1.method418(arg0 + 7096);
            } else if (class18.field234 >= var2.field5247) {
                var2.method2157((byte) 93, class140.field2163);
                if (var2.field5260) {
                    var1.method418(arg0 + 7096);
                } else {
                    class238.method1709(var2.field5255, var2.field5233, var2.field5249, var2.field5238, 60, var2, 0, -1L, false);
                }
            }
        }
        if (arg0 != -125) {
            field408 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 349)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field394++;
    }

    @OriginalMember(owner = "client!jj", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 364)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field405++;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)V", line = 376)
    private final synchronized void method181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field402++;
        if (this.field409 != null) {
            this.field409.setPixels(arg0, arg1, arg2, arg3, this.field407, this.field3061, this.field3056 * arg1 + arg0, this.field3056);
            this.field409.imageComplete(arg4);
        }
    }
}
