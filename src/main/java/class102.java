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

@OriginalClass("client!uq")
public class class102 extends class44 implements ImageProducer {

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field1297 = 0;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "Ldk;")
    public static class326 field1292 = new class326("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!uq", name = "B", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!uq", name = "C", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1306;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field1290;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1293;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1291;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)V")
    public static final void method571(boolean arg0, int arg1) {
        ++field1304;
        if (arg1 == 1) {
            while (class345.field5016.method2463(class382.field5447, (byte) -124) >= 15) {
                int var2 = class345.field5016.method2464(15, 0);
                if (~var2 == -32768) {
                    break;
                }
                boolean var3 = false;
                if (class139.field1851[var2] == null) {
                    class139.field1851[var2] = new class216();
                    var3 = true;
                    class139.field1851[var2].field2154 = var2;
                }
                class216 var4 = class139.field1851[var2];
                class281.field4139[class225.field3418++] = var2;
                var4.field2144 = class353.field5090;
                if (var4.field3232 != null && var4.field3232.method2744(121)) {
                    class451.method2631(arg1 ^ 1721537888, var4);
                }
                var4.method1386(-18479, class265.field3859.method2800(class345.field5016.method2464(14, 0), (byte) 32));
                int var5 = (class345.field5016.method2464(3, 0) + 4 & 184549383) << 11;
                int var6 = class345.field5016.method2464(1, 0);
                int var7 = class345.field5016.method2464(1, 0);
                if (var7 == 1) {
                    class420.field5870[class94.field1202++] = var2;
                }
                int var8;
                if (!arg0) {
                    var8 = class345.field5016.method2464(5, 0);
                    if (~var8 < -16) {
                        var8 -= 32;
                    }
                } else {
                    var8 = class345.field5016.method2464(8, 0);
                    if (~var8 < -128) {
                        var8 -= 256;
                    }
                }
                int var9;
                if (arg0) {
                    var9 = class345.field5016.method2464(8, 0);
                    if (var9 > 127) {
                        var9 -= 256;
                    }
                } else {
                    var9 = class345.field5016.method2464(5, 0);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                }
                int var10 = class345.field5016.method2464(2, 0);
                var4.method920((byte) 88, var4.field3232.field6573);
                var4.field2123 = var4.field3232.field6509 << 3;
                if (~var4.field2123 == -1) {
                    var4.method914(arg1 ^ 112, 0);
                } else if (var3) {
                    var4.method914(arg1 ^ 68, var5);
                }
                var4.method1384(~var6 == -2, class492.field6935.field2163[0] + var9, class492.field6935.field2159[0] - -var8, var10, var4.method918(false), (byte) -53);
                if (var4.field3232.method2744(121)) {
                    class401.method2392(var4.field2159[0], 0, (class452) null, var4.field4319, var4, (byte) 8, var4.field2163[0], (class453) null);
                }
            }
            class345.field5016.method2465(false);
        }
    }

    @OriginalMember(owner = "client!uq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1291 == arg0) {
            this.field1291 = null;
        }
        ++field1298;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method291(int arg0, Canvas arg1) {
        this.field1306 = arg1;
        ++field1303;
        super.field634 = this.field1306.getSize().width;
        super.field638 = this.field1306.getSize().height;
        super.field635 = new int[super.field638 * super.field634];
        if (arg0 <= 72) {
            this.field1291 = null;
        }
        this.field1293 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1290 = this.field1306.createImage(this);
        this.method573((byte) -68);
        this.field1306.prepareImage(this.field1290, this.field1306);
        this.method573((byte) -68);
        this.field1306.prepareImage(this.field1290, this.field1306);
        this.method573((byte) -68);
        this.field1306.prepareImage(this.field1290, this.field1306);
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V")
    public static void method572(byte arg0) {
        if (arg0 != -74) {
            method576(91);
        }
        field1292 = null;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V")
    private final synchronized void method573(byte arg0) {
        if (arg0 == -68) {
            ++field1288;
            if (this.field1291 != null) {
                this.field1291.setPixels(0, 0, super.field634, super.field638, this.field1293, super.field635, 0, super.field634);
                this.field1291.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1295;
        this.field1291 = arg0;
        arg0.setDimensions(super.field634, super.field638);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1293);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method574(int arg0, String arg1) {
        ++field1300;
        int var2 = arg1.length();
        long var3 = (long) arg0;
        for (int var5 = 0; ~var5 > ~var2; ++var5) {
            var3 = (var3 << 5) + -var3 + (long) arg1.charAt(var5);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1294;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        ++field1289;
        if (arg1 >= -58) {
            field1297 = -45;
        }
        this.method575(arg4, arg0, arg3, -1182185493, arg2);
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg4, arg3, arg2);
        arg5.drawImage(this.field1290, 0, 0, this.field1306);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method575(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1296;
        if (this.field1291 != null) {
            this.field1291.setPixels(arg1, arg0, arg2, arg4, this.field1293, super.field635, super.field634 * arg0 + arg1, super.field634);
            this.field1291.imageComplete(2);
            if (arg3 != -1182185493) {
                this.field1306 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1302;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method295(int arg0, byte arg1, int arg2, Graphics arg3) {
        this.method573((byte) -68);
        int var5 = -113 % ((arg1 - 22) / 43);
        ++field1301;
        arg3.drawImage(this.field1290, arg2, arg0, this.field1306);
    }

    @OriginalMember(owner = "client!uq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1305;
        return this.field1291 == arg0;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static final void method576(int arg0) {
        ++field1299;
        int var1 = class325.field4693.length;
        int var2 = 0;
        if (arg0 != 3484) {
            method571(false, 16);
        }
        while (var1 > var2) {
            if (class325.field4693[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; ~var4 > ~class8.field82; ++var4) {
                    if (~class368.field5294[var2] == ~class338.field4929[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class338.field4929[class8.field82] = class368.field5294[var2];
                    var3 = class8.field82++;
                }
                class276 var5 = new class276(class325.field4693[var2]);
                int var6 = 0;
                while (var5.field4021 < class325.field4693[var2].length && var6 < 511 && class225.field3418 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1729(65280);
                    int var9 = var8 >> 14;
                    int var10 = (8184 & var8) >> 7;
                    int var11 = var8 & 63;
                    int var12 = (class368.field5294[var2] >> 8) * 64 + var10 - class240.field3602;
                    int var13 = (255 & class368.field5294[var2]) * 64 + (-class360.field5180 - -var11);
                    class466 var14 = class265.field3859.method2800(var5.method1729(arg0 ^ 62108), (byte) 32);
                    if (class139.field1851[var7] == null && ~(1 & var14.field6528) < -1 && ~class42.field619 == ~var9 && ~var12 <= -1 && ~class58.field758 < ~(var14.field6573 + var12) && var13 >= 0 && ~class287.field4181 < ~(var14.field6573 + var13)) {
                        class139.field1851[var7] = new class216();
                        class139.field1851[var7].field2154 = var7;
                        class216 var15 = class139.field1851[var7];
                        class281.field4139[class225.field3418++] = var7;
                        var15.field2144 = class353.field5090;
                        var15.method1386(arg0 + -21963, var14);
                        var15.method920((byte) 109, var15.field3232.field6573);
                        var15.field2123 = var15.field3232.field6509 << 3;
                        if (~var15.field2123 == -1) {
                            var15.method914(63, 0);
                        } else {
                            var15.method914(72, 15219 & var15.field3232.field6566 + 4 << 11);
                        }
                        var15.method1384(true, var12, var13, var9, var15.method918(false), (byte) 123);
                    }
                }
            }
            ++var2;
        }
    }
}
