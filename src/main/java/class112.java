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
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class112 extends class116 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "Lqk;")
    public static class207 field1945 = class24.method212(255, "::shiftclick");

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "Lqk;")
    public static class207 field1958 = class24.method212(255, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "Lqk;")
    public static class207 field1955 = class24.method212(255, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Lqk;")
    public static class207 field1944 = class24.method212(255, "Sprites geladen)3");

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1949;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1948;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1952;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BB)[B")
    public static final byte[] method796(byte[] arg0, byte arg1) {
        ++field1956;
        class149 var2 = new class149(arg0);
        if (arg1 != -52) {
            return null;
        } else {
            int var3 = var2.method1045((byte) 107);
            int var4 = var2.method1076(65280);
            if (~var4 <= -1 && (class20.field329 == 0 || ~class20.field329 <= ~var4)) {
                if (var3 == 0) {
                    byte[] var7 = new byte[var4];
                    var2.method1053((byte) 33, 0, var4, var7);
                    return var7;
                } else {
                    int var5 = var2.method1076(65280);
                    if (var5 >= 0 && (~class20.field329 == -1 || ~var5 >= ~class20.field329)) {
                        byte[] var6 = new byte[var5];
                        if (var3 != 1) {
                            class288.field5133.method1552(var6, var2, 1);
                        } else {
                            class66.method477(var6, var5, arg0, var4, 9);
                        }
                        return var6;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1943;
        return this.field1952 == arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Loa;")
    public static final class98 method797(int arg0, int arg1, int arg2) {
        class174 var3 = class82.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class98 var4 = var3.field3145;
            var3.field3145 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mj", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1953;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
    public static final int method798(int arg0) {
        if (arg0 != 13675) {
            method797(75, -105, -19);
        }
        ++field1960;
        return 6;
    }

    @OriginalMember(owner = "client!mj", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1957;
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method799(int arg0, Component arg1, int arg2, int arg3) {
        super.field2012 = arg3;
        super.field2008 = arg0;
        if (arg2 == -257) {
            super.field2009 = new int[arg0 * arg3 + 1];
            ++field1946;
            this.field1948 = new DirectColorModel(32, 16711680, 65280, 255);
            super.field2010 = arg1.createImage(this);
            this.method802(-117);
            arg1.prepareImage(super.field2010, this);
            this.method802(-123);
            arg1.prepareImage(super.field2010, this);
            this.method802(-113);
            arg1.prepareImage(super.field2010, this);
            this.method818((byte) 79);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZIIZZI)Luh;")
    public static final class100 method800(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        class173 var8 = class117.method829(arg3, (byte) 110);
        ++field1961;
        if (arg7 > 1 && var8.field3084 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; ++var10) {
                if (~arg7 <= ~var8.field3070[var10] && var8.field3070[var10] != 0) {
                    var9 = var8.field3084[var10];
                }
            }
            if (~var9 != 0) {
                var8 = class117.method829(var9, (byte) 91);
            }
        }
        class37 var11 = var8.method1234(-86);
        if (arg4 != 27222) {
            field1945 = null;
        }
        if (var11 == null) {
            return null;
        } else {
            class139 var12 = null;
            if (~var8.field3117 != 0) {
                var12 = (class139) method800(0, 1, true, var8.field3080, 27222, false, true, 10);
                if (var12 == null) {
                    return null;
                }
            } else if (var8.field3064 != -1) {
                var12 = (class139) method800(arg0, arg1, true, var8.field3095, 27222, false, false, arg7);
                if (var12 == null) {
                    return null;
                }
            }
            int[] var13 = class23.field435;
            int var14 = class23.field439;
            int var15 = class23.field440;
            int[] var16 = new int[4];
            class23.method158(var16);
            class139 var17 = new class139(36, 32);
            class23.method165(var17.field2399, 36, 32);
            class257.method1794();
            class257.method1787(16, 16);
            class257.field4603 = false;
            int var18 = var8.field3122;
            if (arg6) {
                var18 = (int) ((double) var18 * 1.5D);
            } else if (arg1 == 2) {
                var18 = (int) ((double) var18 * 1.04D);
            }
            int var19 = class257.field4598[var8.field3061] * var18 >> 16;
            int var20 = class257.field4597[var8.field3061] * var18 >> 16;
            var11.method271(0, var8.field3049, var8.field3059, var8.field3061, var8.field3119, var19 + (-(var11.method80() / 2) - -var8.field3088), var8.field3088 + var20, -1L);
            if (~arg1 <= -2) {
                var17.method963(1);
                if (~arg1 <= -3) {
                    var17.method963(16777215);
                }
                class23.method165(var17.field2399, 36, 32);
            }
            if (~arg0 != -1) {
                var17.method960(arg0);
            }
            if (var8.field3117 != -1) {
                var12.method381(0, 0);
            } else if (var8.field3064 != -1) {
                class23.method165(var12.field2399, 36, 32);
                var17.method381(0, 0);
                var17 = var12;
            }
            if (arg5 && (~var8.field3067 == -2 || ~arg7 != -2) && ~arg7 != 0) {
                class2.field35.method1613(class33.method252(arg4 + 72778, arg7), 0, 9, 16776960, 1);
            }
            class23.method165(var13, var15, var14);
            class23.method151(var16);
            class257.method1794();
            class257.field4603 = true;
            return var17;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method801(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.method805(arg1 ^ 1, arg0, arg2, arg4, arg5);
        if (arg1 != 3) {
            field1955 = null;
        }
        ++field1962;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg5, arg2, arg4);
        arg3.drawImage(super.field2010, 0, 0, this);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!mj", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1954;
        this.field1952 = arg0;
        arg0.setDimensions(super.field2012, super.field2008);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1948);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!mj", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field1959;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!mj", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1952 == arg0) {
            this.field1952 = null;
        }
        ++field1947;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    private final synchronized void method802(int arg0) {
        ++field1942;
        if (this.field1952 != null) {
            this.field1952.setPixels(0, 0, super.field2012, super.field2008, this.field1948, super.field2009, 0, super.field2012);
            this.field1952.imageComplete(2);
            if (arg0 >= -98) {
                this.removeConsumer((ImageConsumer) null);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public static void method803(boolean arg0) {
        field1949 = null;
        field1945 = null;
        field1944 = null;
        field1955 = null;
        if (arg0) {
            field1945 = null;
        }
        field1958 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method804(int arg0, Graphics arg1, int arg2, int arg3) {
        this.method802(-105);
        arg1.drawImage(super.field2010, arg3, arg0, this);
        ++field1951;
        if (arg2 != -26806) {
            this.field1952 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method805(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1950;
        if (this.field1952 != null) {
            this.field1952.setPixels(arg1, arg4, arg2, arg3, this.field1948, super.field2009, super.field2012 * arg4 + arg1, super.field2012);
            this.field1952.imageComplete(arg0);
        }
    }
}
