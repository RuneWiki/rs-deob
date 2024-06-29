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

@OriginalClass("client!ak")
public class class27 extends class145 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Lnj;")
    public static class230 field346 = new class230(64);

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "[I")
    public static int[] field351 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "Lr;")
    private static class66 field352 = class93.method641(43, " has logged out)3");

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "Lr;")
    public static class66 field350 = field352;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "Lr;")
    private static class66 field365 = class93.method641(43, "scrollen:");

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "Lr;")
    private static class66 field359 = class93.method641(43, "scroll:");

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "Lr;")
    public static class66 field366 = field359;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "Lr;")
    private static class66 field357 = class93.method641(43, "Allocating memory");

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "Lr;")
    public static class66 field349 = field359;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Lr;")
    public static class66 field355 = field357;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "J")
    public static long field363;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "Lqf;")
    public static class236 field354;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field356;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field367;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method114(int arg0, Component arg1) {
        ++field336;
        int var2 = 121 % ((arg0 - -20) / 60);
        arg1.addMouseListener(class9.field95);
        arg1.addMouseMotionListener(class9.field95);
        arg1.addFocusListener(class9.field95);
    }

    @OriginalMember(owner = "client!ak", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field345;
        return this.field367 == arg0;
    }

    @OriginalMember(owner = "client!ak", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field338;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)V")
    private final synchronized void method115(boolean arg0) {
        ++field362;
        if (this.field367 != null) {
            this.field367.setPixels(0, 0, super.field2660, super.field2646, this.field356, super.field2645, 0, super.field2660);
            this.field367.imageComplete(2);
            if (arg0) {
                field359 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field367 == arg0) {
            this.field367 = null;
        }
        ++field339;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    public static final void method116(int arg0, int arg1) {
        if (arg1 >= -54) {
            field349 = null;
        }
        ++field342;
        class15 var2 = (class15) class84.field1631.method1381((long) arg0, 117);
        if (var2 != null) {
            var2.method560(-17554);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([Lr;[SI)V")
    public static final void method117(class66[] arg0, short[] arg1, int arg2) {
        ++field348;
        class149.method1017(arg0, arg1, arg0.length + -1, false, 0);
        int var3 = 44 / ((1 - arg2) / 48);
    }

    @OriginalMember(owner = "client!ak", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field343;
        return true;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIBII)V")
    private final synchronized void method118(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field340;
        if (this.field367 != null) {
            if (arg2 != 87) {
                field350 = null;
            }
            this.field367.setPixels(arg0, arg1, arg4, arg3, this.field356, super.field2645, super.field2660 * arg1 - -arg0, super.field2660);
            this.field367.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static final void method119(byte arg0) {
        ++field347;
        if (class125.field2365 > 0) {
            class75.method535((byte) -113);
        } else {
            class61.field1027 = class101.field1972;
            class101.field1972 = null;
            if (arg0 != -21) {
                method123(-15);
            }
            class112.method755(40, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!ak", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field367 = arg0;
        arg0.setDimensions(super.field2660, super.field2646);
        ++field341;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field356);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method120(Component arg0, int arg1, int arg2, int arg3) {
        super.field2660 = arg1;
        super.field2646 = arg3;
        super.field2645 = new int[arg1 * arg3 + 1];
        ++field344;
        this.field356 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field2652 = arg0.createImage(this);
        this.method115(false);
        arg0.prepareImage(super.field2652, this);
        int var5 = -100 % ((-80 - arg2) / 38);
        this.method115(false);
        arg0.prepareImage(super.field2652, this);
        this.method115(false);
        arg0.prepareImage(super.field2652, this);
        this.method1002(25);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method121(int arg0, int arg1, int arg2, Graphics arg3) {
        this.method115(false);
        if (arg0 > 72) {
            arg3.drawImage(super.field2652, arg1, arg2, this);
            ++field337;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public static void method122(byte arg0) {
        field351 = null;
        field346 = null;
        field354 = null;
        field359 = null;
        field366 = null;
        int var1 = 1 % ((74 - arg0) / 49);
        field357 = null;
        field349 = null;
        field352 = null;
        field350 = null;
        field365 = null;
        field355 = null;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
    public static final void method123(int arg0) {
        class192.field3336 = class50.field887;
        class94.field1821 = class20.field275;
        class31.field475 = class201.field3464;
        class174.field3060 = class140.field2587;
        class105.field2024 = class14.field176;
        class183.field3207 = class261.field4605;
        class178.field3117 = class79.field1559;
        class207.field3596 = class247.field4301;
        class264.field4625 = class90.field1742;
        class2.field21 = class12.field156;
        class135.field2498 = class243.field4250;
        class194.field3358 = class35.field520;
        class192.field3331 = class79.field1553;
        class242.field4232 = class61.field1037;
        class238.field4136 = class85.field1673;
        class145.field2644 = class122.field2305;
        class244.field4270 = class205.field3510;
        class127.field2373 = class133.field2490;
        class166.field2987 = class167.field3006;
        class224.field3829 = class180.field3159;
        class139.field2581 = class188.field3258;
        class202.field3466 = class153.field2721;
        class63.field1247 = class260.field4565;
        class223.field3804 = class61.field1039;
        class199.field3426 = class102.field1993;
        class234.field4090 = class136.field2518;
        class11.field138 = class243.field4244;
        class260.field4576 = class261.field4598;
        class135.field2500 = class98.field1922;
        class81.field1581 = class173.field3052;
        class82.field1594 = class86.field1680;
        class222.field3791 = class246.field4290;
        class175.field3075 = class11.field135;
        class166.field2990 = class98.field1913;
        class11.field140 = class132.field2454;
        class45.field841 = class67.field1343;
        class257.field4512 = class47.field856;
        if (arg0 < -19) {
            class173.field3047 = class2.field31;
            class226.field3872 = class217.field3730;
            class146.field2663 = class28.field423;
            class97.field1887 = class84.field1632;
            field350 = class9.field99;
            class250.field4408 = class45.field814;
            class120.field2266 = class206.field3565;
            class223.field3803 = class217.field3745;
            class107.field2089 = class256.field4505;
            class216.field3718 = class234.field4086;
            class138.field2541 = class62.field1067;
            class203.field3474 = class225.field3856;
            class94.field1820 = class20.field275;
            class162.field2914 = class87.field1702;
            field366 = field365;
            class199.field3428 = class83.field1609;
            class224.field3835 = class146.field2661;
            class203.field3475 = class254.field4450;
            class91.field1755 = class212.field3640;
            ++field358;
            class140.field2596 = class134.field2493;
            class181.field3162 = class144.field2638;
            class144.field2625 = class217.field3725;
            class143.field2618 = class189.field3276;
            class131.field2441 = class80.field1572;
            class250.field4415 = class124.field2336;
            class226.field3885 = class217.field3730;
            class66.field1332 = class95.field1833;
            class230.field3990 = class85.field1672;
            class132.field2456 = class163.field2927;
            class72.field1428 = class72.field1418;
            class44.field773 = class67.field1345;
            class81.field1578 = class158.field2856;
            class248.field4330 = class130.field2417;
            class143.field2615 = class12.field152;
            class189.field3277 = class263.field4609;
            class160.field2871 = class238.field4139;
            class63.field1243 = class154.field2748;
            class78.field1547 = class114.field2168;
            class176.field3097 = class72.field1420;
            class96.field1867 = class84.field1633;
            class96.field1851 = class84.field1633;
            class10.field113 = class139.field2566;
            class201.field3458 = class91.field1758;
            field355 = class182.field3195;
            class75.field1496 = class81.field1575;
            class139.field2554 = class165.field2951;
            class100.field1958 = class238.field4138;
            class94.field1810 = class133.field2471;
            class248.field4324 = class130.field2424;
            class230.field3976 = class60.field1026;
            class164.field2949 = class70.field1407;
            class115.field2170 = class209.field3613;
            class182.field3196 = class45.field830;
            class212.field3642 = class135.field2508;
            class43.field748 = class157.field2819;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
    public final void method124(Graphics arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field353;
        this.method118(arg3, arg4, (byte) 87, arg5, arg2);
        Shape var7 = arg0.getClip();
        if (!arg1) {
            method122((byte) 40);
        }
        arg0.clipRect(arg3, arg4, arg2, arg5);
        arg0.drawImage(super.field2652, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!ak", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field364;
    }
}
