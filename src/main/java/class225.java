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

@OriginalClass("client!ek")
public class class225 extends class218 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field3438 = 0;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3432 = "flash1:";

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3447;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3449;

    @OriginalMember(owner = "client!ek", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 4)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field3443++;
        return this.field3449 == arg0;
    }

    @OriginalMember(owner = "client!ek", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 12)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3435++;
        return true;
    }

    @OriginalMember(owner = "client!ek", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 26)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field3437++;
        if (this.field3449 == arg0) {
            this.field3449 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 38)
    public static void method1600(int arg0) {
        if (arg0 != 0) {
            method1600(-11);
        }
        field3432 = null;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V", line = 50)
    private final synchronized void method1601(byte arg0) {
        field3434++;
        if (this.field3449 != null) {
            int var2 = 46 % ((44 - arg0) / 52);
            this.field3449.setPixels(0, 0, this.field3336, this.field3339, this.field3447, this.field3337, 0, this.field3336);
            this.field3449.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 65)
    public final void method1091(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != -24418) {
            method1605((byte) 2, (byte[]) null);
        }
        field3431++;
        this.method1601((byte) -39);
        arg1.drawImage(this.field3331, arg2, arg3, this);
    }

    @OriginalMember(owner = "client!ek", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 78)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3449 = arg0;
        arg0.setDimensions(this.field3336, this.field3339);
        field3442++;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3447);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ek", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 101)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field3445++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 111)
    public static final String method1602(String arg0, int arg1, String arg2, String arg3) {
        field3436++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = arg2.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg0.indexOf(arg3, var9);
                if (var10 < 0) {
                    break;
                }
                var7 += var8;
                var9 = var5 + var10;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = arg1;
        while (true) {
            int var13 = arg0.indexOf(arg3, var12);
            if (var13 < 0) {
                var11.append(arg0.substring(var12));
                return var11.toString();
            }
            var11.append(arg0.substring(var12, var13));
            var12 = var5 + var13;
            var11.append(arg2);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V", line = 166)
    private final synchronized void method1603(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3439++;
        if (this.field3449 != null) {
            this.field3449.setPixels(arg1, arg2, arg3, arg4, this.field3447, this.field3337, this.field3336 * arg2 + arg1, this.field3336);
            this.field3449.imageComplete(arg0);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)Ljava/lang/String;", line = 181)
    public static final String method1604(int arg0) {
        field3433++;
        String var1;
        if (class320.field4939 == 1 && class32.field393 < 2) {
            var1 = class201.field3092 + class265.field4119 + class170.field2757 + " ->";
        } else if (class7.field110 && class32.field393 < 2) {
            var1 = class60.field794 + class265.field4119 + class267.field4153 + " ->";
        } else if (class1.field1 && class180.field2860[81] && class32.field393 > 2) {
            var1 = class90.method656(arg0 ^ 0xFFFF99A5, class32.field393 - 2);
        } else {
            var1 = class90.method656(3, class32.field393 - 1);
        }
        if (class32.field393 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class32.field393 - 2) + class237.field3608;
        }
        if (arg0 != -26202) {
            method1602((String) null, -58, (String) null, (String) null);
        }
        return var1;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBLjava/awt/Component;I)V", line = 209)
    public final void method1090(int arg0, byte arg1, Component arg2, int arg3) {
        this.field3339 = arg0;
        this.field3337 = new int[arg0 * arg3 + 1];
        field3448++;
        this.field3336 = arg3;
        int var5 = 19 % ((90 - arg1) / 32);
        this.field3447 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3331 = arg2.createImage(this);
        this.method1601((byte) 120);
        arg2.prepareImage(this.field3331, this);
        this.method1601((byte) 112);
        arg2.prepareImage(this.field3331, this);
        this.method1601((byte) -41);
        arg2.prepareImage(this.field3331, this);
        this.method1554(9969);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B[B)V", line = 232)
    public static final void method1605(byte arg0, byte[] arg1) {
        class254 var2 = new class254(arg1);
        var2.field3866 = arg1.length - 2;
        class131.field2005 = var2.method1755(false);
        field3446++;
        class220.field3362 = new byte[class131.field2005][];
        class27.field293 = new int[class131.field2005];
        class133.field2028 = new int[class131.field2005];
        class209.field3191 = new int[class131.field2005];
        class304.field4666 = new int[class131.field2005];
        class136.field2057 = new boolean[class131.field2005];
        class250.field3765 = new byte[class131.field2005][];
        var2.field3866 = arg1.length - (class131.field2005 * 8) - 7;
        class233.field3554 = var2.method1755(false);
        class38.field559 = var2.method1755(false);
        int var3 = (var2.method1774(arg0) & 0xFF) + 1;
        for (int var4 = 0; var4 < class131.field2005; var4++) {
            class304.field4666[var4] = var2.method1755(false);
        }
        for (int var5 = 0; var5 < class131.field2005; var5++) {
            class27.field293[var5] = var2.method1755(false);
        }
        for (int var6 = 0; var6 < class131.field2005; var6++) {
            class133.field2028[var6] = var2.method1755(false);
        }
        for (int var7 = 0; var7 < class131.field2005; var7++) {
            class209.field3191[var7] = var2.method1755(false);
        }
        var2.field3866 = arg1.length - ((var3 - 1) * 3) - (class131.field2005 * 8) - 7;
        class82.field1212 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class82.field1212[var8] = var2.method1758((byte) 115);
            if (class82.field1212[var8] == 0) {
                class82.field1212[var8] = 1;
            }
        }
        var2.field3866 = 0;
        for (int var9 = 0; var9 < class131.field2005; var9++) {
            int var10 = class133.field2028[var9];
            int var11 = class209.field3191[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class220.field3362[var9] = var14;
            class250.field3765[var9] = var13;
            int var15 = var2.method1774((byte) -98);
            boolean var16 = false;
            if ((var15 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method1733(arg0 + 2023894021);
                }
                if ((var15 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method1733(2023893896);
                        var16 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label98: while (true) {
                    if (var20 >= var10) {
                        if ((var15 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label98;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var13[var10 * var23 + var22] = var2.method1733(2023893896);
                                var16 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var14[var10 * var21 + var20] = var2.method1733(2023893896);
                    }
                    var20++;
                }
            }
            class136.field2057[var9] = var16;
        }
    }

    @OriginalMember(owner = "client!ek", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 393)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field3440++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V", line = 400)
    public final void method1089(int arg0, byte arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (arg1 < 76) {
            return;
        }
        field3441++;
        this.method1603(2, arg5, arg0, arg2, arg3);
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg5, arg0, arg2, arg3);
        arg4.drawImage(this.field3331, 0, 0, this);
        arg4.setClip(var7);
    }
}
