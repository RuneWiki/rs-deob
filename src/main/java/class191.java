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

@OriginalClass("client!rg")
public class class191 extends class73 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lqe;")
    private static class179 field3550 = class206.method1380("scroll:", (byte) -127);

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "[[I")
    public static int[][] field3543 = new int[104][104];

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Lqe;")
    public static class179 field3556 = field3550;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Lqe;")
    public static class179 field3559 = class206.method1380("headicons_prayer", (byte) 3);

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Lqe;")
    public static class179 field3566 = field3550;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Ljava/lang/Object;")
    public static Object field3565 = new Object();

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "Z")
    public static boolean field3568 = false;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "Z")
    public static boolean field3570 = true;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "Lqe;")
    private static class179 field3573 = class206.method1380(" is already on your ignore list)3", (byte) -128);

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field3569 = 0;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "Lqe;")
    public static class179 field3572 = field3573;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "Lqe;")
    public static class179 field3574 = class206.method1380(")3)3)3", (byte) -127);

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "Lod;")
    public static class156 field3546;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3567;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3563;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1283(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3547;
        if (arg0 == 150) {
            if (this.field3563 != null) {
                this.field3563.setPixels(arg3, arg4, arg1, arg2, this.field3567, super.field1433, super.field1437 * arg4 - -arg3, super.field1437);
                this.field3563.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIZIILeh;)V")
    public static final void method1284(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class52 arg6) {
        class107.field2000 = 1;
        class233.field4303 = arg3;
        class159.field2894 = arg6;
        if (arg4 != 0) {
            field3550 = null;
        }
        class237.field4361 = arg2;
        class178.field3235 = arg1;
        class19.field494 = arg5;
        class157.field2848 = arg0;
        ++field3554;
    }

    @OriginalMember(owner = "client!rg", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3563 = arg0;
        ++field3544;
        arg0.setDimensions(super.field1437, super.field1431);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3567);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public static final void method1285(byte arg0) {
        ++field3553;
        int var1 = class71.field1422.method1005(class136.field2510);
        for (int var2 = 0; var2 < class113.field2118; ++var2) {
            int var6 = class71.field1422.method1005(class215.method1411(-17116, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class113.field2118 * 15 + 21;
        int var4 = -(var1 / 2) + class68.field1361;
        class186.field3459 = var1;
        if (arg0 != 79) {
            field3571 = -11;
        }
        class183.field3378 = class113.field2118 * 15 + 22;
        if (~class102.field1962 > ~(var1 + var4)) {
            var4 = -var1 + class102.field1962;
        }
        int var5 = class175.field3141;
        if (~class216.field4001 > ~(var3 + var5)) {
            var5 = -var3 + class216.field4001;
        }
        class182.field3358 = true;
        if (var5 < 0) {
            var5 = 0;
        }
        class49.field1051 = var5;
        if (~var4 > -1) {
            var4 = 0;
        }
        class202.field3749 = var4;
    }

    @OriginalMember(owner = "client!rg", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3561;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method465(int arg0, Component arg1, int arg2, int arg3) {
        super.field1433 = new int[arg0 * arg3 + 1];
        super.field1431 = arg0;
        super.field1437 = arg3;
        ++field3551;
        this.field3567 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1438 = arg1.createImage(this);
        this.method1288((byte) 109);
        arg1.prepareImage(super.field1438, this);
        this.method1288((byte) 103);
        arg1.prepareImage(super.field1438, this);
        this.method1288((byte) 105);
        if (arg2 == 8) {
            arg1.prepareImage(super.field1438, this);
            this.method462(38);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3548;
        int var7 = class56.method391(16777215, class70.field1403, class168.field3037, arg3);
        int var8 = class56.method391(16777215, class70.field1403, class168.field3037, arg6);
        int var9 = class56.method391(16777215, class40.field869, class235.field4336, arg2);
        int var10 = class56.method391(16777215, class40.field869, class235.field4336, arg5);
        int var11 = 56 / ((-21 - arg4) / 37);
        int var12 = class56.method391(16777215, class70.field1403, class168.field3037, arg1 + arg3);
        int var13 = class56.method391(16777215, class70.field1403, class168.field3037, -arg1 + arg6);
        for (int var14 = var7; ~var12 < ~var14; ++var14) {
            class23.method161(var10, -1, arg0, var9, class14.field331[var14]);
        }
        for (int var15 = var8; ~var13 > ~var15; --var15) {
            class23.method161(var10, -1, arg0, var9, class14.field331[var15]);
        }
        int var16 = class56.method391(16777215, class40.field869, class235.field4336, arg1 + arg2);
        int var17 = class56.method391(16777215, class40.field869, class235.field4336, arg5 - arg1);
        for (int var18 = var12; ~var18 >= ~var13; ++var18) {
            int[] var19 = class14.field331[var18];
            class23.method161(var16, -1, arg0, var9, var19);
            class23.method161(var10, -1, arg0, var17, var19);
        }
    }

    @OriginalMember(owner = "client!rg", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3545;
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static void method1287(int arg0) {
        field3556 = null;
        field3565 = null;
        field3550 = null;
        field3573 = null;
        field3543 = null;
        field3574 = null;
        field3546 = null;
        field3572 = null;
        if (arg0 != -31096) {
            method1289((class6) null, -63);
        }
        field3566 = null;
        field3559 = null;
    }

    @OriginalMember(owner = "client!rg", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3563 == arg0) {
            this.field3563 = null;
        }
        ++field3560;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    private final synchronized void method1288(byte arg0) {
        ++field3558;
        if (this.field3563 != null) {
            if (arg0 >= 94) {
                this.field3563.setPixels(0, 0, super.field1437, super.field1431, this.field3567, super.field1433, 0, super.field1437);
                this.field3563.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3549;
        return this.field3563 == arg0;
    }

    @OriginalMember(owner = "client!rg", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3552;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lae;I)V")
    public static final void method1289(class6 arg0, int arg1) {
        ++field3562;
        int var2 = arg0.field220;
        if (var2 == 324) {
            if (class215.field3989 == -1) {
                class31.field678 = arg0.field114;
                class215.field3989 = arg0.field205;
            }
            if (!class4.field52.field1851) {
                arg0.field205 = class31.field678;
            } else {
                arg0.field205 = class215.field3989;
            }
        } else if (var2 == 325) {
            if (class215.field3989 == -1) {
                class31.field678 = arg0.field114;
                class215.field3989 = arg0.field205;
            }
            if (class4.field52.field1851) {
                arg0.field205 = class31.field678;
            } else {
                arg0.field205 = class215.field3989;
            }
        } else if (arg1 == 0) {
            if (var2 == 327) {
                arg0.field163 = 150;
                arg0.field199 = (int) (256.0D * Math.sin((double) class13.field322 / 40.0D)) & 2047;
                arg0.field218 = 5;
                arg0.field147 = -1;
            } else if (var2 == 328) {
                if (class61.field1298.field2168 == null) {
                    arg0.field147 = 0;
                } else {
                    arg0.field163 = 150;
                    arg0.field199 = (int) (Math.sin((double) class13.field322 / 40.0D) * 256.0D) & 2047;
                    arg0.field218 = 5;
                    arg0.field147 = ((int) class61.field1298.field2168.method1137(121) << 11) - -2047;
                    arg0.field184 = class61.field1298.field3153;
                    arg0.field195 = class61.field1298.field3166;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method466(int arg0, int arg1, Graphics arg2, byte arg3) {
        ++field3555;
        int var5 = -103 / ((arg3 - 24) / 52);
        this.method1288((byte) 109);
        arg2.drawImage(super.field1438, arg0, arg1, this);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V")
    public final void method463(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        this.method1283(150, arg4, arg2, arg0, arg1);
        ++field3557;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg1, arg4, arg2);
        arg3.drawImage(super.field1438, 0, 0, this);
        arg3.setClip(var7);
        int var8 = 33 % ((17 - arg5) / 59);
    }
}
