import java.awt.Component;
import java.awt.FontMetrics;
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

@OriginalClass("client!qh")
public class class33 extends class48 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Z")
    public static boolean field660 = false;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "[F")
    public static float[] field668 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "[I")
    public static int[] field672 = new int[5];

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "Z")
    public static boolean field661 = false;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "Lib;")
    public static class312 field674;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field679;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field681;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field669;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIZIIZ)V", line = 4)
    public static final void method262(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field677++;
        if (!arg4 && class303.field4597 == arg0 && class14.field270 == arg2 && class290.field4454 == arg5 || class19.method127(arg3 ^ 0x62)) {
            return;
        }
        class14.field270 = arg2;
        class303.field4597 = arg0;
        class290.field4454 = arg5;
        if (class19.method127(-90)) {
            class290.field4454 = 0;
        }
        if (arg7) {
            class9.method79((byte) -101, 28);
        } else {
            class9.method79((byte) -101, 25);
        }
        class188.method1200(false, class219.field3478, true);
        int var8 = class101.field1769;
        class101.field1769 = (arg2 - 6) * 8;
        int var9 = class246.field3818;
        class246.field3818 = arg0 * 8 - 48;
        class241.field3765 = class44.method333(class303.field4597 * 8, (byte) -57, class14.field270 * 8);
        class218.field3459 = null;
        int var10 = class246.field3818 - var9;
        int var11 = class246.field3818;
        int var12 = class101.field1769 - var8;
        int var13 = class101.field1769;
        if (arg7) {
            class285.field4417 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class255 var15 = class8.field179[var14];
                if (var15 != null) {
                    var15.field1869 -= var10 * 128;
                    var15.field1872 -= var12 * 128;
                    if (var15.field1869 >= 0 && var15.field1869 <= 13184 && var15.field1872 >= 0 && var15.field1872 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field1871[var16] -= var10;
                            var15.field1899[var16] -= var12;
                        }
                        class131.field2226[class285.field4417++] = var14;
                    } else {
                        class8.field179[var14].method1713((byte) -77, (class44) null);
                        class8.field179[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class255 var18 = class8.field179[var17];
                if (var18 != null) {
                    for (int var19 = 0; var19 < 10; var19++) {
                        var18.field1871[var19] -= var10;
                        var18.field1899[var19] -= var12;
                    }
                    var18.field1869 -= var10 * 128;
                    var18.field1872 -= var12 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class278 var21 = class97.field1715[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field1871[var22] -= var10;
                    var21.field1899[var22] -= var12;
                }
                var21.field1869 -= var10 * 128;
                var21.field1872 -= var12 * 128;
            }
        }
        byte var23 = 0;
        class289.field4438 = arg5;
        class66.field1265.method1870(65535, arg6, false, arg1);
        byte var24 = 104;
        byte var25 = 1;
        if (var10 < 0) {
            var24 = -1;
            var25 = -1;
            var23 = 103;
        }
        byte var26 = 104;
        byte var27 = 0;
        byte var28 = 1;
        if (var12 < 0) {
            var27 = 103;
            var26 = -1;
            var28 = -1;
        }
        for (int var29 = var23; var29 != var24; var29 += var25) {
            for (int var30 = var27; var30 != var26; var30 += var28) {
                int var31 = var29 + var10;
                int var32 = var12 + var30;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class62.field1186[var33][var29][var30] = class62.field1186[var33][var31][var32];
                    } else {
                        class62.field1186[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class164 var34 = (class164) class318.field4798.method424(arg3 ^ 0x7B); var34 != null; var34 = (class164) class318.field4798.method425(-32547)) {
            var34.field2648 -= var12;
            var34.field2642 -= var10;
            if (var34.field2642 < 0 || var34.field2648 < 0 || var34.field2642 >= 104 || var34.field2648 >= 104) {
                var34.method278((byte) -105);
            }
        }
        class48.field986 = 0;
        if (~class224.field3532 != arg3) {
            class224.field3532 -= var10;
            class6.field129 -= var12;
        }
        if (arg7) {
            class90.field1660 -= var10;
            class55.field1101 -= var12;
            class276.field4223 -= var12;
            class38.field742 -= var10 * 128;
            class66.field1258 -= var10;
            class283.field4381 -= var12 * 128;
        } else {
            class135.field2271 = 1;
        }
        if (class249.field3893 && arg7 && (Math.abs(var10) > 104 || Math.abs(var12) > 104)) {
            class158.method1019(-4096);
        }
        class189.field3070 = -1;
        class136.field2276.method432(-96);
        class48.field992.method432(-82);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)V", line = 248)
    public static final void method263(byte arg0) {
        field670++;
        if (arg0 != 91) {
            method263((byte) -90);
        }
        if (class344.field5349) {
            return;
        }
        if (class6.field136) {
            class95.field1709 = (float) ((int) class95.field1709 - 65 & 0xFFFFFF80);
        } else {
            class199.field3185 += (-24.0F - class199.field3185) / 2.0F;
        }
        class344.field5349 = true;
        class35.field707 = true;
    }

    @OriginalMember(owner = "client!qh", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 272)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field676++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 280)
    public final void method264(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field671++;
        this.method268(arg1, 89, arg4, arg5, arg3);
        int var7 = 92 / ((arg2 - 51) / 37);
        Shape var8 = arg0.getClip();
        arg0.clipRect(arg5, arg1, arg4, arg3);
        arg0.drawImage(this.field990, 0, 0, this);
        arg0.setClip(var8);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V", line = 296)
    public final void method265(int arg0, Graphics arg1, int arg2, byte arg3) {
        this.method271(-128);
        arg1.drawImage(this.field990, arg2, arg0, this);
        field664++;
        if (arg3 != -112) {
            method266(-127);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V", line = 320)
    public static void method266(int arg0) {
        field668 = null;
        field672 = null;
        field679 = null;
        if (arg0 <= 100) {
            method266(123);
        }
        field674 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 335)
    public static final String method267(String arg0, String arg1, int arg2, String arg3) {
        field663++;
        if (arg2 != 17912) {
            field672 = (int[]) null;
        }
        for (int var4 = arg0.indexOf(arg1); var4 != -1; var4 = arg0.indexOf(arg1, arg3.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(arg1.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V", line = 355)
    private final synchronized void method268(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field666++;
        if (this.field669 != null) {
            this.field669.setPixels(arg3, arg0, arg2, arg4, this.field681, this.field988, this.field995 * arg0 + arg3, this.field995);
            int var6 = -50 % ((arg1 + 13) / 32);
            this.field669.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!qh", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 372)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field662++;
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 384)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field673++;
    }

    @OriginalMember(owner = "client!qh", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 396)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field667++;
        return this.field669 == arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILjava/awt/Component;B)V", line = 408)
    public final void method269(int arg0, int arg1, Component arg2, byte arg3) {
        if (arg3 != -116) {
            this.method265(-72, (Graphics) null, -59, (byte) 62);
        }
        field659++;
        this.field995 = arg1;
        this.field1002 = arg0;
        this.field988 = new int[arg0 * arg1 + 1];
        this.field681 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field990 = arg2.createImage(this);
        this.method271(-120);
        arg2.prepareImage(this.field990, this);
        this.method271(-124);
        arg2.prepareImage(this.field990, this);
        this.method271(-128);
        arg2.prepareImage(this.field990, this);
        this.method369((byte) -19);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Lri;", line = 430)
    public static final class203 method270(int arg0, int arg1) {
        field675++;
        class203 var2 = (class203) class133.field2248.method2367((long) arg1, -12270);
        if (var2 != null) {
            return var2;
        }
        int var3 = 116 / ((-arg0 - 36) / 36);
        byte[] var4 = class84.field1596.method2036(arg1, 0, (byte) 84);
        if (var4 == null) {
            return null;
        }
        class203 var5 = new class203();
        class202 var6 = new class202(var4);
        var6.field3249 = var6.field3273.length - 2;
        int var7 = var6.method1315(14289);
        int var8 = var6.field3273.length - var7 - 12 - 2;
        var6.field3249 = var8;
        int var9 = var6.method1346(79);
        var5.field3311 = var6.method1315(14289);
        var5.field3305 = var6.method1315(14289);
        var5.field3302 = var6.method1315(14289);
        var5.field3310 = var6.method1315(14289);
        int var10 = var6.method1317((byte) -83);
        if (var10 > 0) {
            var5.field3299 = new class39[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var6.method1315(14289);
                class39 var13 = new class39(class226.method1510(27147, var12));
                var5.field3299[var11] = var13;
                while (var12-- > 0) {
                    int var14 = var6.method1346(-116);
                    int var15 = var6.method1346(28);
                    var13.method310((long) var14, new class166(var15), 25357);
                }
            }
        }
        var6.field3249 = 0;
        var5.field3307 = var6.method1294(false);
        int var16 = 0;
        var5.field3309 = new String[var9];
        var5.field3300 = new int[var9];
        var5.field3304 = new int[var9];
        while (var6.field3249 < var8) {
            int var17 = var6.method1315(14289);
            if (var17 == 3) {
                var5.field3309[var16] = var6.method1307((byte) 102).intern();
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var5.field3304[var16] = var6.method1317((byte) -116);
            } else {
                var5.field3304[var16] = var6.method1346(82);
            }
            var5.field3300[var16++] = var17;
        }
        class133.field2248.method2369((long) arg1, -28759, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qh", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 523)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field680++;
        if (this.field669 == arg0) {
            this.field669 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 543)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field669 = arg0;
        field665++;
        arg0.setDimensions(this.field995, this.field1002);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field681);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V", line = 555)
    private final synchronized void method271(int arg0) {
        field682++;
        if (this.field669 == null) {
            return;
        }
        if (arg0 > -110) {
            this.addConsumer((ImageConsumer) null);
        }
        this.field669.setPixels(0, 0, this.field995, this.field1002, this.field681, this.field988, 0, this.field995);
        this.field669.imageComplete(2);
    }
}
