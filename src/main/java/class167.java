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

@OriginalClass("client!tf")
public class class167 extends class424 implements ImageProducer {

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Lnk;")
    public static class326 field2682;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2672;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "Ljava/awt/Image;")
    private Image field2686;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2678;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2669;

    static {
        new class306("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
        field2682 = new class326(22, 16);
    }

    @OriginalMember(owner = "client!tf", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 5)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field2681;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 13)
    private final synchronized void method1147(byte arg0) {
        ++field2670;
        if (this.field2669 != null) {
            if (arg0 <= 76) {
                this.field2678 = null;
            }
            this.field2669.setPixels(0, 0, super.field6391, super.field6388, this.field2678, super.field6394, 0, super.field6391);
            this.field2669.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII)V", line = 33)
    public static final void method1148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2684;
        int var7 = arg5 - -arg3;
        int var8 = arg4 - arg3;
        if (arg2 != 0) {
            method1152(-30, 51, (class197) null, 38, 93, -2, -35, -107, (class197) null, 72);
        }
        for (int var9 = arg5; ~var9 > ~var7; ++var9) {
            class357.method2291(arg0, arg1, class209.field3294[var9], arg6, -1);
        }
        for (int var10 = arg4; ~var8 > ~var10; --var10) {
            class357.method2291(arg0, arg1, class209.field3294[var10], arg6, -1);
        }
        int var11 = -arg3 + arg6;
        int var12 = arg0 - -arg3;
        for (int var13 = var7; ~var13 >= ~var8; ++var13) {
            int[] var14 = class209.field3294[var13];
            class357.method2291(arg0, arg1, var14, var12, -1);
            class357.method2291(var11, arg1, var14, arg6, -1);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 77)
    public final void method619(int arg0, Canvas arg1) {
        this.field2672 = arg1;
        ++field2685;
        super.field6391 = this.field2672.getSize().width;
        super.field6388 = this.field2672.getSize().height;
        super.field6394 = new int[super.field6391 * super.field6388];
        this.field2678 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 == 1400) {
            this.field2686 = this.field2672.createImage(this);
            this.method1147((byte) 121);
            this.field2672.prepareImage(this.field2686, this.field2672);
            this.method1147((byte) 100);
            this.field2672.prepareImage(this.field2686, this.field2672);
            this.method1147((byte) 120);
            this.field2672.prepareImage(this.field2686, this.field2672);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(Z)V", line = 100)
    public static void method1149(boolean arg0) {
        if (arg0) {
            method1149(true);
        }
        field2682 = null;
    }

    @OriginalMember(owner = "client!tf", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 111)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field2669 == arg0) {
            this.field2669 = null;
        }
        ++field2683;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIII)V", line = 122)
    private final synchronized void method1150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2673;
        if (this.field2669 != null) {
            this.field2669.setPixels(arg2, arg1, arg0, arg3, this.field2678, super.field6394, super.field6391 * arg1 + arg2, super.field6391);
            this.field2669.imageComplete(2);
            if (arg4 != 1024) {
                this.field2672 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZIIII)V", line = 141)
    public static final void method1151(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2668;
        if (class66.field977 == null) {
            class305.field4873.method2864(arg5, (byte) 13, arg4, arg0, arg3, -16777216);
        } else if (~class302.field4850.field4716 <= -1 && class217.field3775 * 128 > class302.field4850.field4716 && ~class302.field4850.field4714 <= -1 && class302.field4850.field4714 < class277.field4548 * 128) {
            ++class536.field7878;
            if (class302.field4850 != null && class302.field4850.field4716 + 64 + -(class302.field4850.method1143(0) * 64) >> 7 == class314.field4946 && class302.field4850.field4714 - (64 * class302.field4850.method1143(0) + -64) >> 7 == class420.field6346) {
                class314.field4946 = -1;
                class420.field6346 = -1;
                class269.method1794(-125);
            }
            class131.method998((byte) -96);
            if (!arg1) {
                class389.method2432(false);
            }
            class146.method1063(1);
            class154.method1081(arg0, arg5, arg3, arg2 ^ -21024, true, arg4);
            int var6 = class455.field6793;
            if (arg2 != -21217) {
                field2682 = null;
            }
            int var7 = class432.field6467;
            int var8 = class208.field3290;
            int var9 = class90.field1488;
            if (class190.field2963 == 1) {
                int var10 = (int) class509.field7395;
                if (~(class439.field6559 >> 8) < ~var10) {
                    var10 = class439.field6559 >> 8;
                }
                if (class533.field7838[4] && class79.field1398[4] - -128 > var10) {
                    var10 = class79.field1398[4] + 128;
                }
                int var11 = (int) class88.field1483 + class515.field7625 & 16383;
                class205.method1349(class165.field2606, class139.field2318, var7, class81.method592(class302.field4850.field4716, class302.field4850.field4714, arg2 + 30468, class93.field1556) + -50, var10, true, 600 - -((var10 >> 3) * 3) << 0, var11);
            } else if (~class190.field2963 == -5) {
                int var12 = (int) class509.field7395;
                if (var12 < class439.field6559 >> 8) {
                    var12 = class439.field6559 >> 8;
                }
                if (class533.field7838[4] && var12 < class79.field1398[4] - -128) {
                    var12 = class79.field1398[4] - -128;
                }
                int var13 = 16383 & (int) class88.field1483;
                class205.method1349(class165.field2606, class139.field2318, var7, class81.method592(class296.field4782, class535.field7865, 9251, class93.field1556) - 50, var12, true, 600 - -((var12 >> 3) * 3) << 0, var13);
            } else if (~class190.field2963 == -6) {
                class193.method1291(var7, true);
            }
            int var14 = class473.field7021;
            int var15 = class130.field2234;
            int var16 = class48.field764;
            int var17 = class227.field3927;
            int var18 = class381.field5891;
            for (int var19 = 0; var19 < 5; ++var19) {
                if (class533.field7838[var19]) {
                    int var22 = (int) (Math.random() * (double) (class24.field332[var19] * 2 + 1) - (double) class24.field332[var19] + Math.sin((double) class485.field7116[var19] / 100.0D * (double) class263.field4399[var19]) * (double) class79.field1398[var19]);
                    if (var19 == 4) {
                        class227.field3927 += var22;
                        if (class227.field3927 < 1024) {
                            class227.field3927 = 1024;
                        } else if (~class227.field3927 < -3073) {
                            class227.field3927 = 3072;
                        }
                    }
                    if (~var19 == -1) {
                        class473.field7021 += var22;
                    }
                    if (var19 == 1) {
                        class130.field2234 += var22;
                    }
                    if (~var19 == -4) {
                        class381.field5891 = class381.field5891 + var22 & 16383;
                    }
                    if (var19 == 2) {
                        class48.field764 += var22;
                    }
                }
            }
            if (~class473.field7021 > -1) {
                class473.field7021 = 0;
            }
            if ((class236.field4089 << 7) + -1 < class473.field7021) {
                class473.field7021 = (class236.field4089 << 7) + -1;
            }
            if (class48.field764 < 0) {
                class48.field764 = 0;
            }
            if (~((class276.field4537 << 7) - 1) > ~class48.field764) {
                class48.field764 = (class276.field4537 << 7) + -1;
            }
            class449.method2691(true);
            class503.method2969((byte) 98);
            class305.field4873.method829(var8, var9, var6 + var8, var7 + var9);
            class305.field4873.method828();
            int var20 = class424.field6387;
            if (class162.field2571 != null) {
                class162.field2571.method2490(class305.field4873, 0, class26.field409 << 3, var6, class227.field3927, var7, var8, var20, var9, class381.field5891);
            } else {
                class305.field4873.method891(var20);
            }
            class529.method3131(arg2 + 21122);
            class71.field1242.method1247(class473.field7021, class130.field2234, class48.field764, -class227.field3927 & 16383, -class381.field5891 & 16383, 16383 & -class64.field950);
            class305.field4873.method911(class71.field1242);
            class305.field4873.method857(var6 / 2 + var8, var7 / 2 + var9, class71.field1243 << 1, class71.field1243 << 1);
            class335.method2113(2, var6 / 2 + var8, class71.field1243 << 1, class71.field1243 << 1, var7 / 2 + var9);
            class439.method2654(-class64.field950 & 16383, class130.field2234, class473.field7021, class48.field764, -105, 16383 & -class227.field3927, -class381.field5891 & 16383);
            byte var21 = class510.field7403.method1187((byte) 53, class511.field7485) == 2 ? (byte) class536.field7878 : 1;
            class68.method440(class305.field4873, class504.field7348, class307.field4890, class71.field1242, class473.field7021, class130.field2234, class48.field764, class53.field858, class361.field5615, class213.field3390, class155.field2512, class460.field6821, class359.field5591, class302.field4850.field4720 - -1, var21, class302.field4850.field4716 >> 7, class302.field4850.field4714 >> 7, !class510.field7403.field5122);
            class529.method3131(-76);
            if (~class32.field515 == -10) {
                class533.method3160(var6, var9, var7, 256, 256, var8, (byte) 7);
                class257.method1732(256, 256, -119, var6, var7, var9, var8);
                class381.method2406(var9, 256, (byte) -9, var8, var6, var7, 256);
                class176.method1189(var6, (byte) -49, var9, var7, var8);
            }
            class304.method1946();
            class381.field5891 = var18;
            class48.field764 = var16;
            class130.field2234 = var15;
            class473.field7021 = var14;
            class227.field3927 = var17;
            if (class77.field1340 && class78.field1366.method1556((byte) -100) == 0) {
                class77.field1340 = false;
            }
            if (class77.field1340) {
                class305.field4873.method2864(var9, (byte) 13, var6, var8, var7, -16777216);
                class499.method2954(false, class519.field7664.method1954(class300.field4813, -30366), 103, class531.field7796);
            }
        } else {
            class305.field4873.method2864(arg5, (byte) 13, arg4, arg0, arg3, -16777216);
        }
    }

    @OriginalMember(owner = "client!tf", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 333)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2676;
        return this.field2669 == arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILou;IIIIILou;I)V", line = 347)
    public static final void method1152(int arg0, int arg1, class197 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class197 arg8, int arg9) {
        ++field2680;
        int var10 = arg2.method1141(arg6 + 3070);
        if (~var10 != 0) {
            if (arg6 == -3073) {
                Object var11 = null;
                class138 var12 = (class138) class22.field235.method1593((byte) -74, (long) var10);
                if (var12 == null) {
                    class523[] var13 = class523.method3090(class536.field7881, var10, 0);
                    if (var13 == null) {
                        return;
                    }
                    var12 = class305.field4873.method837(var13[0], true);
                    class22.field235.method1595(var12, (long) var10, (byte) 49);
                }
                class353.method2266(arg8.method1143(0) * 64, 0, arg8.field4720, arg1 >> 1, arg7 >> 1, arg3, arg0, arg8.field4714, (byte) 126, arg8.field4716);
                int var14 = class244.field4188[0] + arg4 - 18;
                int var15 = class244.field4188[1] + arg9 + -16 + -54;
                int var16 = arg5 / 4 * 18 + var14;
                int var17 = arg5 % 4 * 18 + var15;
                var12.method1039(var16, var17);
                if (arg2 == arg8) {
                    class305.field4873.method2859(18, -256, -122, 18, var17 - 1, var16 + -1);
                }
                class219 var18 = class3.method7(118);
                var18.field3792 = var17 + 16;
                var18.field3793 = arg2;
                var18.field3795 = var16;
                var18.field3789 = var17;
                var18.field3794 = var16 + 16;
                class70.field1209.method567(var18, arg6 + 3328);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 398)
    public final void method617(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.method1150(arg1, arg4, arg5, arg0, 1024);
        ++field2675;
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg4, arg1, arg0);
        arg3.drawImage(this.field2686, 0, 0, this.field2672);
        arg3.setClip(var7);
        if (arg2 != 1) {
            this.method619(4, (Canvas) null);
        }
    }

    @OriginalMember(owner = "client!tf", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 415)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2679;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V", line = 423)
    public static final void method1153(byte arg0) {
        ++field2674;
        if (!class172.field2763) {
            if (class510.field7403.field5116) {
                class88.field1483 = (float) (-128 & (int) class88.field1483 + 191);
            } else {
                class100.field1663 += (-class100.field1663 + 24.0F) / 2.0F;
            }
            class299.field4804 = true;
            class172.field2763 = true;
            if (arg0 < 111) {
                field2682 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZLjava/awt/Graphics;)V", line = 449)
    public final void method618(int arg0, int arg1, boolean arg2, Graphics arg3) {
        ++field2671;
        this.method1147((byte) 87);
        if (arg2) {
            this.method1147((byte) 56);
        }
        arg3.drawImage(this.field2686, arg1, arg0, this.field2672);
    }

    @OriginalMember(owner = "client!tf", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 466)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2677;
        this.field2669 = arg0;
        arg0.setDimensions(super.field6391, super.field6388);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2678);
        arg0.setHints(14);
    }
}
