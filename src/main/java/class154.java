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

@OriginalClass("client!wa")
public class class154 extends class14 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "Lje;")
    private static class67 field3497 = class85.method592(255, "OFF");

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "[I")
    public static int[] field3501 = new int[500];

    @OriginalMember(owner = "client!wa", name = "Q", descriptor = "Lje;")
    public static class67 field3518 = field3497;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!wa", name = "J", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!wa", name = "M", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!wa", name = "N", descriptor = "Lpc;")
    public static class107 field3515;

    @OriginalMember(owner = "client!wa", name = "R", descriptor = "Lq;")
    public static class111 field3519;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "Lua;")
    public static class140 field3504;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "Lub;")
    public static class141 field3499;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3503;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3509;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
    public static final void method1165(int arg0, int arg1) {
        int[] var2 = class61.field1215.field2571;
        ++field3505;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; ++var5) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; ~var21 > -104; ++var21) {
                if (~(24 & class82.field1809[arg0][var21][var5]) == -1) {
                    class134.field3044.method358(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && ~(8 & class82.field1809[arg0 + 1][var21][var5]) != -1) {
                    class134.field3044.method358(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class61.field1215.method898();
        int var6 = -10 + (238 - -((int) (Math.random() * 20.0D))) + (228 - -((int) (Math.random() * 20.0D)) << 16) + (-10 + (int) (20.0D * Math.random()) + 238 << 8);
        int var7 = -10 + 238 + (int) (Math.random() * 20.0D) << 16;
        for (int var8 = 1; var8 < 103; ++var8) {
            for (int var19 = 1; var19 < 103; ++var19) {
                if (~(class82.field1809[arg0][var19][var8] & 24) == -1) {
                    class19.method137(arg0, var19, var6, arg1 ^ 1024, var8, var7);
                }
                if (arg0 < 3 && ~(class82.field1809[arg0 - -1][var19][var8] & 8) != -1) {
                    class19.method137(arg0 + 1, var19, var6, arg1 ^ 1024, var8, var7);
                }
            }
        }
        class34.field599 = arg1;
        for (int var9 = 0; ~var9 > -105; ++var9) {
            for (int var10 = 0; var10 < 104; ++var10) {
                int var11 = class134.field3044.method352(class128.field2817, var9, var10);
                if (var11 != 0) {
                    int var12 = 32767 & var11 >> 14;
                    int var13 = class130.method993(var12, (byte) 116).field881;
                    if (~var13 <= -1) {
                        int var14 = var9;
                        int var15 = var10;
                        if (~var13 != -23 && ~var13 != -30 && var13 != 34 && var13 != 36 && ~var13 != -47 && var13 != 47 && ~var13 != -49) {
                            int[][] var16 = class86.field1900[class128.field2817].field611;
                            for (int var17 = 0; ~var17 > -11; ++var17) {
                                int var18 = (int) (4.0D * Math.random());
                                if (var18 == 0 && ~var14 < -1 && ~(var9 + -3) > ~var14 && (var16[var14 + -1][var15] & 19661064) == 0) {
                                    --var14;
                                }
                                if (var18 == 1 && ~var14 > -104 && var14 < var9 + 3 && ~(19661184 & var16[var14 + 1][var15]) == -1) {
                                    ++var14;
                                }
                                if (var18 == 2 && var15 > 0 && ~var15 < ~(var10 + -3) && (19661058 & var16[var14][var15 + -1]) == 0) {
                                    --var15;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (19661088 & var16[var14][var15 + 1]) == 0) {
                                    ++var15;
                                }
                            }
                        }
                        class58.field1172[class34.field599] = class14.field240[var13];
                        class37.field670[class34.field599] = var14;
                        class95.field2138[class34.field599] = var15;
                        ++class34.field599;
                    }
                }
            }
        }
        class81.field1792.method103((byte) 124);
    }

    @OriginalMember(owner = "client!wa", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field3513;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public final void method102(boolean arg0, int arg1, Graphics arg2, int arg3) {
        if (!arg0) {
            this.addConsumer((ImageConsumer) null);
        }
        this.method1167((byte) 127);
        ++field3512;
        arg2.drawImage(super.field245, arg3, arg1, this);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
    public final void method97(Graphics arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3508;
        this.method1166(arg4, arg2, arg3, (byte) -61, arg5);
        if (!arg1) {
            this.method102(false, 101, (Graphics) null, -1);
        }
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg3, arg4, arg5);
        arg0.drawImage(super.field245, 0, 0, this);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIBI)V")
    private final synchronized void method1166(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field3511;
        if (this.field3509 != null) {
            if (arg3 != -61) {
                this.removeConsumer((ImageConsumer) null);
            }
            this.field3509.setPixels(arg1, arg2, arg0, arg4, this.field3503, super.field256, super.field257 * arg2 + arg1, super.field257);
            this.field3509.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
    private final synchronized void method1167(byte arg0) {
        ++field3507;
        if (this.field3509 != null) {
            if (arg0 <= 75) {
                field3501 = null;
            }
            this.field3509.setPixels(0, 0, super.field257, super.field252, this.field3503, super.field256, 0, super.field257);
            this.field3509.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field3509 = arg0;
        ++field3502;
        arg0.setDimensions(super.field257, super.field252);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3503);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!wa", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3509 == arg0) {
            this.field3509 = null;
        }
        ++field3514;
    }

    @OriginalMember(owner = "client!wa", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3498;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1168(int arg0) {
        if (arg0 >= -123) {
            method1168(-1);
        }
        field3501 = null;
        field3497 = null;
        field3519 = null;
        field3499 = null;
        field3504 = null;
        field3518 = null;
        field3515 = null;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
    public static final void method1169(byte arg0) {
        ++field3517;
        class79.field1746.method767(1);
        class107.field2457.method767(1);
        class140.field3141.method767(1);
        if (arg0 != 33) {
            field3504 = null;
        }
        class19.field353.method767(1);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZZ)V")
    public static final void method1170(boolean arg0, boolean arg1) {
        for (int var2 = 0; ~var2 > ~class123.field2743; ++var2) {
            class24 var3 = class152.field3479[class45.field836[var2]];
            int var4 = (class45.field836[var2] << 14) + 536870912;
            if (var3 != null && var3.method164((byte) -103) && !arg0 == !var3.field442.field2546 && var3.field442.method889((byte) -3)) {
                int var5 = var3.field2957 >> 7;
                int var6 = var3.field2963 >> 7;
                if (var5 >= 0 && ~var5 > -105 && ~var6 <= -1 && var6 < 104) {
                    if (~var3.field2958 == -2 && ~(127 & var3.field2957) == -65 && ~(var3.field2963 & 127) == -65) {
                        if (class131.field2870[var5][var6] == class117.field2636) {
                            continue;
                        }
                        class131.field2870[var5][var6] = class117.field2636;
                    }
                    if (!var3.field442.field2524) {
                        var4 += Integer.MIN_VALUE;
                    }
                    class134.field3044.method360(class128.field2817, var3.field2957, var3.field2963, class114.method924((var3.field2958 + -1) * 64 + var3.field2957, class128.field2817, var3.field2963 - -(var3.field2958 * 64) + -64, -104), (var3.field2958 - 1) * 64 - -60, var3, var3.field2992, var4, var3.field2959);
                }
            }
        }
        if (arg1) {
            field3515 = null;
        }
        ++field3510;
    }

    @OriginalMember(owner = "client!wa", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3496;
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1171(int arg0, int arg1, int arg2, int arg3) {
        ++field3506;
        int var4 = (arg2 & 536863157) >> 14;
        int var5 = class134.field3044.method371(class128.field2817, arg0, arg3, arg2);
        if (~var5 == 0) {
            return false;
        } else {
            int var6 = (var5 & 214) >> 6;
            int var7 = var5 & 31;
            if (arg1 != var7 && var7 != 11 && var7 != 22) {
                class120.method949(class37.field667.field2993[0], 0, 2, true, 0, (byte) 78, 0, var6, arg3, arg0, class37.field667.field2942[0], var7 + 1);
            } else {
                class47 var8 = class130.method993(var4, (byte) 127);
                int var9;
                int var10;
                if (~var6 != -1 && ~var6 != -3) {
                    var9 = var8.field931;
                    var10 = var8.field875;
                } else {
                    var9 = var8.field875;
                    var10 = var8.field931;
                }
                int var11 = var8.field908;
                if (~var6 != -1) {
                    var11 = (var11 >> -var6 + 4) + (15 & var11 << var6);
                }
                class120.method949(class37.field667.field2993[0], var11, 2, true, var9, (byte) 78, var10, 0, arg3, arg0, class37.field667.field2942[0], 0);
            }
            class16.field281 = class50.field961;
            class149.field3410 = 0;
            class81.field1787 = class126.field2773;
            class91.field1983 = 2;
            return true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3516;
        return this.field3509 == arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method100(int arg0, int arg1, int arg2, Component arg3) {
        super.field257 = arg0;
        super.field256 = new int[arg0 * arg2 + 1];
        ++field3500;
        super.field252 = arg2;
        this.field3503 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field245 = arg3.createImage(this);
        this.method1167((byte) 115);
        arg3.prepareImage(super.field245, this);
        this.method1167((byte) 76);
        if (arg1 != -1847869520) {
            this.field3509 = null;
        }
        arg3.prepareImage(super.field245, this);
        this.method1167((byte) 103);
        arg3.prepareImage(super.field245, this);
        this.method103((byte) 117);
    }
}
