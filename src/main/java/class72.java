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

@OriginalClass("client!td")
public class class72 extends class224 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1169 = "flash2:";

    @OriginalMember(owner = "client!td", name = "G", descriptor = "Laf;")
    public static class68 field1185 = new class68(64);

    @OriginalMember(owner = "client!td", name = "J", descriptor = "Lil;")
    public static class162 field1188 = new class162();

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1182;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1184;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method338(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg1 == -15816) {
            this.method513((byte) -114);
            arg0.drawImage(super.field3715, arg2, arg3, this);
            ++field1186;
        }
    }

    @OriginalMember(owner = "client!td", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1172;
        return true;
    }

    @OriginalMember(owner = "client!td", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1184 == arg0) {
            this.field1184 = null;
        }
        ++field1175;
    }

    @OriginalMember(owner = "client!td", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field1180;
    }

    @OriginalMember(owner = "client!td", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field1176;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIZ)V")
    private final synchronized void method510(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field1181;
        if (this.field1184 != null) {
            this.field1184.setPixels(arg3, arg2, arg0, arg1, this.field1182, super.field3703, super.field3702 * arg2 - -arg3, super.field3702);
            if (!arg4) {
                method512(32, (class201) null);
            }
            this.field1184.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lqh;Z)V")
    public static final void method511(class201 arg0, boolean arg1) {
        if (arg1) {
            class178.field2800 = arg0;
            ++field1183;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILqh;)V")
    public static final void method512(int arg0, class201 arg1) {
        class29.field472 = arg1.method1373(-90, "p11_full");
        class209.field3426 = arg1.method1373(-87, "p12_full");
        ++field1177;
        class53.field917 = arg1.method1373(67, "b12_full");
        class179.field2813 = arg1.method1373(-94, "mapfunction");
        class255.field4058 = arg1.method1373(119, "hitmarks");
        class217.field3540 = arg1.method1373(96, "hitbar_default");
        class256.field4070 = arg1.method1373(arg0 ^ -2099, "headicons_pk");
        if (arg0 == 2048) {
            class189.field3057 = arg1.method1373(84, "headicons_prayer");
            class181.field2849 = arg1.method1373(arg0 ^ 2113, "hint_headicons");
            class177.field2798 = arg1.method1373(-89, "hint_mapmarkers");
            class176.field2779 = arg1.method1373(-53, "mapflag");
            class289.field4572 = arg1.method1373(123, "cross");
            class136.field2238 = arg1.method1373(arg0 + -2154, "mapdots");
            class210.field3437 = arg1.method1373(arg0 + -2175, "scrollbar");
            class240.field3891 = arg1.method1373(60, "name_icons");
            class154.field2491 = arg1.method1373(120, "floorshadows");
            class181.field2833 = arg1.method1373(arg0 ^ -2149, "compass");
            class280.field4438 = arg1.method1373(arg0 ^ 2157, "hint_mapedge");
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    private final synchronized void method513(byte arg0) {
        ++field1171;
        if (arg0 >= -13) {
            field1187 = 82;
        }
        if (this.field1184 != null) {
            this.field1184.setPixels(0, 0, super.field3702, super.field3708, this.field1182, super.field3703, 0, super.field3702);
            this.field1184.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public static final void method514(int arg0) {
        ++field1168;
        if (class5.field69 != null) {
            class5.field69.method7((byte) 18);
            class5.field69 = null;
        }
        class145.method993(16);
        class168.method1157();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class167.field2657[var1].method210((byte) 125);
        }
        class122.method883(false, (byte) -106);
        System.gc();
        class228.method1605(2, (byte) 74);
        class98.field1601 = false;
        class148.field2389 = -1;
        class27.method235((byte) 16, true);
        class214.field3501 = 0;
        class155.field2507 = 0;
        class73.field1196 = 0;
        class50.field884 = 0;
        class100.field1642 = false;
        for (int var2 = 0; class156.field2539.length > var2; ++var2) {
            class156.field2539[var2] = null;
        }
        class155.field2514 = 0;
        if (arg0 != 104) {
            method515(true);
        }
        class141.field2287 = 0;
        for (int var3 = 0; var3 < 2048; ++var3) {
            class35.field548[var3] = null;
            class16.field265[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; ++var4) {
            class137.field2260[var4] = null;
        }
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var6 = 0; var6 < 104; ++var6) {
                for (int var7 = 0; ~var7 > -105; ++var7) {
                    class67.field1104[var5][var6][var7] = null;
                }
            }
        }
        class96.method713(0);
        class113.field1876 = 0;
        class94.method704(42);
        class17.method133(true, 2);
    }

    @OriginalMember(owner = "client!td", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field1179;
        return this.field1184 == arg0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static void method515(boolean arg0) {
        field1185 = null;
        field1169 = null;
        if (arg0) {
            field1188 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method337(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = -119 % ((34 - arg0) / 54);
        this.method510(arg2, arg3, arg5, arg4, true);
        Shape var8 = arg1.getClip();
        arg1.clipRect(arg4, arg5, arg2, arg3);
        ++field1167;
        arg1.drawImage(super.field3715, 0, 0, this);
        arg1.setClip(var8);
    }

    @OriginalMember(owner = "client!td", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1173;
        this.field1184 = arg0;
        arg0.setDimensions(super.field3702, super.field3708);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1182);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method336(Component arg0, int arg1, int arg2, int arg3) {
        super.field3708 = arg1;
        if (arg3 > -90) {
            method512(82, (class201) null);
        }
        ++field1174;
        super.field3703 = new int[arg1 * arg2 + 1];
        super.field3702 = arg2;
        this.field1182 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3715 = arg0.createImage(this);
        this.method513((byte) -41);
        arg0.prepareImage(super.field3715, this);
        this.method513((byte) -121);
        arg0.prepareImage(super.field3715, this);
        this.method513((byte) -95);
        arg0.prepareImage(super.field3715, this);
        this.method1580(16043);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
    public static final int method516(int arg0, byte arg1) {
        int var2 = 49 % ((-7 - arg1) / 56);
        ++field1178;
        return arg0 & 1023;
    }
}
