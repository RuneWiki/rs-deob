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

@OriginalClass("client!q")
public class class144 extends class165 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Lsg;")
    public static class169 field2679 = class165.method1060("Fps:", 1536);

    @OriginalMember(owner = "client!q", name = "D", descriptor = "[I")
    public static int[] field2683 = new int[1000];

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2675;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2680;

    @OriginalMember(owner = "client!q", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2674;
        return this.field2680 == arg0;
    }

    @OriginalMember(owner = "client!q", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2684;
        return true;
    }

    @OriginalMember(owner = "client!q", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2671;
        if (this.field2680 == arg0) {
            this.field2680 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method763(int arg0, int arg1, Graphics arg2, int arg3) {
        ++field2682;
        if (arg0 == 18307) {
            this.method950((byte) -52);
            arg2.drawImage(super.field3166, arg3, arg1, this);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public final void method764(byte arg0, int arg1, Component arg2, int arg3) {
        super.field3160 = new int[arg1 * arg3 + 1];
        super.field3169 = arg1;
        ++field2686;
        super.field3165 = arg3;
        if (arg0 != -10) {
            this.removeConsumer((ImageConsumer) null);
        }
        this.field2675 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3166 = arg2.createImage(this);
        this.method950((byte) -69);
        arg2.prepareImage(super.field3166, this);
        this.method950((byte) -89);
        arg2.prepareImage(super.field3166, this);
        this.method950((byte) -108);
        arg2.prepareImage(super.field3166, this);
        this.method1059((byte) 14);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
    private final synchronized void method950(byte arg0) {
        ++field2677;
        int var2 = -124 / ((arg0 - 7) / 40);
        if (this.field2680 != null) {
            this.field2680.setPixels(0, 0, super.field3169, super.field3165, this.field2675, super.field3160, 0, super.field3169);
            this.field2680.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!q", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2673;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method951(int arg0, int arg1) {
        int[] var2 = class87.field1598.field408;
        ++field2681;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            var2[var4] = 1;
        }
        for (int var5 = 1; ~var5 > -104; ++var5) {
            int var20 = (-var5 + 103) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; ++var21) {
                if ((class159.field3040[arg1][var21][var5] & 24) == 0) {
                    class196.field3840.method874(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && ~(8 & class159.field3040[arg1 + 1][var21][var5]) != -1) {
                    class196.field3840.method874(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        if (arg0 != 2092976880) {
            method951(-50, 96);
        }
        class87.field1598.method119();
        int var6 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var7 = (-10 + (int) (20.0D * Math.random()) + 238 << 16) - -(228 - -((int) (20.0D * Math.random())) << 8) + -10 + (int) (20.0D * Math.random()) + 238;
        for (int var8 = 1; ~var8 > -104; ++var8) {
            for (int var19 = 1; ~var19 > -104; ++var19) {
                if (~(class159.field3040[arg1][var19][var8] & 24) == -1) {
                    class9.method50(var6, var19, var8, var7, arg0 + -2092976876, arg1);
                }
                if (arg1 < 3 && ~(class159.field3040[arg1 - -1][var19][var8] & 8) != -1) {
                    class9.method50(var6, var19, var8, var7, arg0 ^ 2092976884, arg1 + 1);
                }
            }
        }
        class88.field1603 = 0;
        for (int var9 = 0; ~var9 > -105; ++var9) {
            for (int var10 = 0; ~var10 > -105; ++var10) {
                int var11 = class196.field3840.method891(class61.field1132, var9, var10);
                if (var11 != 0) {
                    int var12 = 32767 & var11 >> 14;
                    int var13 = class138.method925(6, var12).field407;
                    if (var13 >= 0) {
                        int var14 = var10;
                        int var15 = var9;
                        if (~var13 != -23 && var13 != 29 && var13 != 34 && var13 != 36 && ~var13 != -47 && var13 != 47 && var13 != 48) {
                            int[][] var16 = client.field575[class61.field1132].field3776;
                            for (int var17 = 0; var17 < 10; ++var17) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var15 > 0 && ~var15 < ~(var9 + -3) && (var16[var15 + -1][var14] & 19661064) == 0) {
                                    --var15;
                                }
                                if (var18 == 1 && var15 < 103 && var15 < var9 + 3 && ~(var16[var15 - -1][var14] & 19661184) == -1) {
                                    ++var15;
                                }
                                if (~var18 == -3 && var14 > 0 && ~(var10 + -3) > ~var14 && (19661058 & var16[var15][var14 - 1]) == 0) {
                                    --var14;
                                }
                                if (var18 == 3 && var14 < 103 && var10 - -3 > var14 && (19661088 & var16[var15][var14 - -1]) == 0) {
                                    ++var14;
                                }
                            }
                        }
                        class206.field4038[class88.field1603] = class172.field3322[var13];
                        class203.field3978[class88.field1603] = var15;
                        class111.field2030[class88.field1603] = var14;
                        ++class88.field1603;
                    }
                }
            }
        }
        class174.field3354.method1059((byte) 14);
    }

    @OriginalMember(owner = "client!q", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2672;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method765(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.method952(arg4, (byte) 101, arg1, arg5, arg3);
        ++field2687;
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg5, arg1, arg4, arg3);
        arg2.drawImage(super.field3166, 0, 0, this);
        if (arg0 != 64) {
            method953(-88);
        }
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!q", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2680 = arg0;
        ++field2676;
        arg0.setDimensions(super.field3169, super.field3165);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2675);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIII)V")
    private final synchronized void method952(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field2685;
        if (this.field2680 != null) {
            if (arg1 < 65) {
                field2683 = null;
            }
            this.field2680.setPixels(arg3, arg2, arg0, arg4, this.field2675, super.field3160, super.field3169 * arg2 + arg3, super.field3169);
            this.field2680.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method953(int arg0) {
        field2683 = null;
        field2679 = null;
        if (arg0 != -14175) {
            method953(-58);
        }
    }
}
