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

@OriginalClass("client!bh")
public class class7 extends class83 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "Lcc;")
    private static class209 field137 = class95.method669(120, " est d-Bj-9 dans votre liste noire)3");

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field130 = 0;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "S")
    public static short field145 = 256;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field147 = -1;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "Lse;")
    public static class204 field149;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field138;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field131;

    @OriginalMember(owner = "client!bh", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field148;
        this.field131 = arg0;
        arg0.setDimensions(super.field1658, super.field1655);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field138);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method67(int arg0, byte arg1, Graphics arg2, int arg3) {
        this.method68(12924);
        ++field139;
        if (arg1 > 60) {
            arg2.drawImage(super.field1662, arg3, arg0, this);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    private final synchronized void method68(int arg0) {
        ++field133;
        if (this.field131 != null) {
            if (arg0 != 12924) {
                this.imageUpdate((Image) null, -117, -100, 86, -54, 125);
            }
            this.field131.setPixels(0, 0, super.field1658, super.field1655, this.field138, super.field1659, 0, super.field1658);
            this.field131.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!bh", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field141;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static final void method69(int arg0) {
        class254.field4591 = class56.field1151;
        class54.field1064 = class122.field2401;
        class82.field1579 = class289.field5100;
        class227.field4151 = class176.field3211;
        class224.field4079 = class146.field2686;
        class132.field2537 = class268.field4798;
        class187.field3379 = class275.field4866;
        class76.field1408 = class182.field3298;
        class11.field212 = class88.field1749;
        class190.field3449 = class182.field3297;
        class142.field2613 = class128.field2472;
        class40.field683 = class289.field5099;
        class1.field19 = class32.field575;
        class252.field4527 = class171.field3129;
        class190.field3437 = class156.field2856;
        class142.field2626 = class28.field521;
        class93.field1834 = class72.field1356;
        class239.field4316 = class58.field1176;
        class187.field3388 = class209.field3804;
        class47.field903 = class68.field1306;
        class137.field2582 = class215.field3873;
        class176.field3219 = class90.field1800;
        class204.field3651 = class22.field410;
        class243.field4382 = class142.field2624;
        class200.field3576 = class255.field4608;
        class163.field2953 = class187.field3366;
        class68.field1307 = class69.field1316;
        class199.field3570 = class19.field372;
        class262.field4705 = class74.field1395;
        class264.field4751 = class85.field1696;
        class33.field582 = class235.field4233;
        class234.field4208 = class20.field380;
        class56.field1146 = class76.field1431;
        class86.field1718 = class32.field578;
        class268.field4794 = class288.field5076;
        class277.field4884 = class98.field1915;
        class174.field3173 = class275.field4862;
        class144.field2661 = class71.field1340;
        class177.field3231 = class32.field574;
        class243.field4391 = class177.field3238;
        class3.field52 = class149.field2723;
        class253.field4563 = class249.field4491;
        class83.field1660 = class288.field5081;
        class247.field4471 = class156.field2853;
        class131.field2515 = class122.field2406;
        class153.field2795 = class44.field890;
        class190.field3436 = class99.field1935;
        class76.field1422 = class6.field101;
        class284.field4986 = class266.field4785;
        class30.field551 = class18.field371;
        class78.field1443 = class249.field4485;
        class72.field1359 = class160.field2906;
        class187.field3375 = class83.field1663;
        class259.field4677 = class251.field4509;
        class131.field2508 = class210.field3830;
        class93.field1852 = class175.field3185;
        class21.field399 = class172.field3144;
        class157.field2859 = class2.field36;
        class5.field74 = class98.field1913;
        class157.field2865 = class21.field405;
        class254.field4585 = class90.field1768;
        class159.field2898 = class172.field3152;
        class283.field4975 = class110.field2223;
        class30.field540 = class155.field2844;
        class126.field2443 = class206.field3684;
        class59.field1183 = class126.field2451;
        class53.field1035 = class256.field4621;
        class176.field3221 = class90.field1800;
        class147.field2699 = class168.field3024;
        class76.field1426 = class6.field101;
        class198.field3544 = class79.field1453;
        class126.field2449 = class71.field1342;
        class210.field3835 = class114.field2287;
        class182.field3294 = class60.field1212;
        class28.field515 = class126.field2432;
        class167.field3007 = class72.field1354;
        if (arg0 != 4) {
            field137 = null;
        }
        class178.field3250 = class142.field2615;
        class187.field3369 = class10.field206;
        class166.field2993 = class75.field1404;
        class104.field2007 = field137;
        class252.field4526 = class171.field3129;
        class161.field2926 = class116.field2333;
        class211.field3839 = class30.field546;
        class14.field260 = class82.field1654;
        class169.field3067 = class176.field3216;
        class262.field4722 = class82.field1575;
        class64.field1248 = class86.field1714;
        class25.field457 = class209.field3788;
        ++field143;
        class124.field2417 = class272.field4823;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public final void method70(Component arg0, int arg1, byte arg2, int arg3) {
        ++field151;
        super.field1659 = new int[arg1 * arg3 + 1];
        super.field1655 = arg3;
        super.field1658 = arg1;
        this.field138 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1662 = arg0.createImage(this);
        this.method68(12924);
        int var5 = -35 / ((-69 - arg2) / 49);
        arg0.prepareImage(super.field1662, this);
        this.method68(12924);
        arg0.prepareImage(super.field1662, this);
        this.method68(12924);
        arg0.prepareImage(super.field1662, this);
        this.method603(false);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIZ)V")
    public static final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9 = arg5 - arg4;
        ++field150;
        int var10 = -arg2 + arg1;
        int var11 = (-arg6 + arg0 << 16) / var9;
        int var12 = (-arg3 + arg7 << 16) / var10;
        if (arg8) {
            method69(51);
        }
        class75.method529(arg1, arg2, -96, arg5, 0, arg3, var12, var11, 0, arg6, arg4);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)V")
    public static final void method72(byte arg0, int arg1) {
        if (class272.field4820 == null) {
            class272.field4820 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            for (int var3 = 0; ~var3 > -105; ++var3) {
                for (int var4 = 0; ~var4 > -105; ++var4) {
                    class272.field4820[var2][var3][var4] = arg0;
                }
            }
        }
        if (arg1 <= 10) {
            method71(1, -48, 53, -95, 4, 37, 37, -58, false);
        }
        ++field136;
    }

    @OriginalMember(owner = "client!bh", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field140;
        return this.field131 == arg0;
    }

    @OriginalMember(owner = "client!bh", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field131 == arg0) {
            this.field131 = null;
        }
        ++field142;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(Z)V")
    public static void method73(boolean arg0) {
        field137 = null;
        field149 = null;
        if (!arg0) {
            field130 = 15;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILek;)V")
    public static final void method74(int arg0, class163 arg1) {
        ++field134;
        if (arg0 >= -80) {
            method71(35, 38, -114, -53, -83, -65, 18, 60, true);
        }
        for (class92 var2 = (class92) class87.field1722.method1119(20896); var2 != null; var2 = (class92) class87.field1722.method1120(53)) {
            if (var2.field1829 == arg1) {
                if (var2.field1830 != null) {
                    class47.field906.method1519(var2.field1830);
                    var2.field1830 = null;
                }
                var2.method269(-214950896);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIIII)V")
    private final synchronized void method75(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field135;
        if (this.field131 != null) {
            this.field131.setPixels(arg1, arg2, arg4, arg3, this.field138, super.field1659, super.field1658 * arg2 + arg1, super.field1658);
            this.field131.imageComplete(2);
            int var6 = 76 % ((-62 - arg0) / 57);
        }
    }

    @OriginalMember(owner = "client!bh", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field129;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIBIILjava/awt/Graphics;)V")
    public final void method76(int arg0, int arg1, byte arg2, int arg3, int arg4, Graphics arg5) {
        this.method75((byte) -121, arg4, arg1, arg3, arg0);
        ++field144;
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg4, arg1, arg0, arg3);
        arg5.drawImage(super.field1662, 0, 0, this);
        if (arg2 != -35) {
            this.imageUpdate((Image) null, -36, 56, -9, 19, -74);
        }
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public static final void method77(int arg0) {
        class131.field2503.method664(-113);
        class235.field4224.method664(118);
        if (arg0 != 8390) {
            method72((byte) -54, 89);
        }
        ++field132;
    }

    @OriginalMember(owner = "client!bh", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field146;
        return true;
    }
}
