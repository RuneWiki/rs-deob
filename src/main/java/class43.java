import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.Socket;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 extends class48 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public static int field991 = 0;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "Lec;")
    private static class32 field992 = class73.method594("You can(Wt add yourself to your own ignore list", true);

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "Lec;")
    private static class32 field1006 = class73.method594("Loaded config", true);

    @OriginalMember(owner = "client!g", name = "P", descriptor = "Lec;")
    public static class32 field1005 = field1006;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "Lec;")
    public static class32 field1001 = class73.method594("::errortest", true);

    @OriginalMember(owner = "client!g", name = "H", descriptor = "Lec;")
    public static class32 field997 = class73.method594("<)4col>", true);

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Lec;")
    public static class32 field1010 = field992;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "Lec;")
    private static class32 field1007 = class73.method594("and choose the (Wcreate account(W", true);

    @OriginalMember(owner = "client!g", name = "O", descriptor = "Lec;")
    public static class32 field1004 = field1007;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!g", name = "x", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!g", name = "y", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!g", name = "z", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!g", name = "I", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field985;

    @OriginalMember(owner = "client!g", name = "K", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1000;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "[I")
    public static int[] field999;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
    public static final void method330(int arg0) {
        ++field995;
        try {
            if (~class52.field1178 == -1) {
                if (class143.field3275 != null) {
                    class143.field3275.method52(arg0 ^ -12306);
                    class143.field3275 = null;
                }
                class39.field939 = 0;
                class11.field174 = null;
                class82.field1919 = false;
                class52.field1178 = 1;
            }
            if (class52.field1178 == 1) {
                if (class11.field174 == null) {
                    class11.field174 = class154.field3518.method181(class151.field3467, class39.field941, 2);
                }
                if (class11.field174.field355 == 2) {
                    throw new IOException();
                }
                if (~class11.field174.field355 == -2) {
                    class143.field3275 = new class8((Socket) class11.field174.field352, class154.field3518);
                    class11.field174 = null;
                    class52.field1178 = 2;
                }
            }
            if (arg0 != -12367) {
                field997 = null;
            }
            if (~class52.field1178 == -3) {
                long var1 = class98.field2261 = class74.field1752.method259(arg0 ^ -12367);
                int var3 = (int) (var1 >> 16 & 31L);
                class44.field1027.field1569 = 0;
                class44.field1027.method515((byte) 91, 14);
                class44.field1027.method515((byte) 127, var3);
                class143.field3275.method49(class44.field1027.field1587, 2, 0, (byte) 121);
                class52.field1178 = 3;
                class158.field3614.field1569 = 0;
            }
            if (class52.field1178 == 3) {
                if (class36.field745 != null) {
                    class36.field745.method894(true);
                }
                if (class29.field525 != null) {
                    class29.field525.method894(true);
                }
                int var4 = class143.field3275.method46(arg0 ^ -13075);
                if (class36.field745 != null) {
                    class36.field745.method894(true);
                }
                if (class29.field525 != null) {
                    class29.field525.method894(true);
                }
                if (~var4 != -1) {
                    class66.method543(var4, -9034);
                    return;
                }
                class158.field3614.field1569 = 0;
                class52.field1178 = 4;
            }
            if (class52.field1178 == 4) {
                if (class158.field3614.field1569 < 8) {
                    int var5 = class143.field3275.method51((byte) 116);
                    if (~var5 < ~(-class158.field3614.field1569 + 8)) {
                        var5 = 8 - class158.field3614.field1569;
                    }
                    if (var5 > 0) {
                        class143.field3275.method50(113, class158.field3614.field1569, class158.field3614.field1587, var5);
                        class158.field3614.field1569 += var5;
                    }
                }
                if (~class158.field3614.field1569 == -9) {
                    class158.field3614.field1569 = 0;
                    class103.field2406 = class158.field3614.method528(-105);
                    class52.field1178 = 5;
                }
            }
            if (class52.field1178 == 5) {
                class44.field1027.field1569 = 0;
                int[] var6 = new int[] { (int) (9.9999999E7D * Math.random()), (int) (Math.random() * 9.9999999E7D), (int) (class103.field2406 >> 32), (int) class103.field2406 };
                class44.field1027.method515((byte) 123, 10);
                class44.field1027.method531(false, var6[0]);
                class44.field1027.method531(false, var6[1]);
                class44.field1027.method531(false, var6[2]);
                class44.field1027.method531(false, var6[3]);
                class44.field1027.method542(class74.field1752.method259(0), (byte) 56);
                class44.field1027.method522(class74.field1739, (byte) -114);
                class44.field1027.method553(true, class151.field3455, class64.field1487);
                class139.field3204.field1569 = 0;
                if (~class134.field3116 == -41) {
                    class139.field3204.method515((byte) 84, 18);
                } else {
                    class139.field3204.method515((byte) 67, 16);
                }
                class139.field3204.method515((byte) 106, class44.field1027.field1569 + 93);
                class139.field3204.method531(false, 468);
                class139.field3204.method515((byte) 114, class154.field3531 ? 1 : 0);
                class146.method1095(class139.field3204, (byte) -83);
                class139.field3204.method531(false, class92.field2126.field565);
                class139.field3204.method531(false, class38.field924.field565);
                class139.field3204.method531(false, class64.field1489.field565);
                class139.field3204.method531(false, class66.field1533.field565);
                class139.field3204.method531(false, class1.field6.field565);
                class139.field3204.method531(false, class134.field3117.field565);
                class139.field3204.method531(false, class124.field2889.field565);
                class139.field3204.method531(false, class147.field3348.field565);
                class139.field3204.method531(false, class30.field572.field565);
                class139.field3204.method531(false, class82.field1921.field565);
                class139.field3204.method531(false, class72.field1702.field565);
                class139.field3204.method531(false, class98.field2270.field565);
                class139.field3204.method531(false, class98.field2248.field565);
                class139.field3204.method531(false, class157.field3598.field565);
                class139.field3204.method531(false, class103.field2426.field565);
                class139.field3204.method531(false, class146.field3319.field565);
                class139.field3204.method544(0, -25154, class44.field1027.field1569, class44.field1027.field1587);
                class143.field3275.method49(class139.field3204.field1587, class139.field3204.field1569, 0, (byte) 126);
                class44.field1027.method360(var6, (byte) -46);
                for (int var7 = 0; ~var7 > -5; ++var7) {
                    var6[var7] += 50;
                }
                class158.field3614.method360(var6, (byte) -46);
                class52.field1178 = 6;
            }
            if (class52.field1178 == 6 && class143.field3275.method51((byte) 127) > 0) {
                int var8 = class143.field3275.method46(860);
                if (~var8 == -22 && ~class134.field3116 == -21) {
                    class52.field1178 = 7;
                } else if (~var8 != -3) {
                    if (var8 == 15 && class134.field3116 == 40) {
                        class53.method419((byte) 104);
                        return;
                    }
                    if (~var8 != -24 || class132.field3035 >= 1) {
                        class66.method543(var8, arg0 ^ 4871);
                        return;
                    }
                    class52.field1178 = 0;
                    ++class132.field3035;
                } else {
                    class52.field1178 = 9;
                }
            }
            if (~class52.field1178 == -8 && class143.field3275.method51((byte) 127) > 0) {
                class117.field2797 = 180 + class143.field3275.method46(arg0 + 13227) * 60;
                class52.field1178 = 8;
            }
            if (class52.field1178 == 8) {
                class39.field939 = 0;
                class114.method893(false, class81.field1874, class52.method403(new class32[] { class159.method1230(class117.field2797 / 60, 0), class27.field481 }, (byte) -20), class15.field309);
                if (~(--class117.field2797) >= -1) {
                    class52.field1178 = 0;
                }
            } else {
                if (~class52.field1178 == -10 && class143.field3275.method51((byte) 116) >= 8) {
                    class145.field3303 = class143.field3275.method46(arg0 + 13227);
                    class109.field2555 = class143.field3275.method46(860) == 1;
                    class37.field892 = class143.field3275.method46(arg0 ^ -13075);
                    class37.field892 <<= 8;
                    class37.field892 += class143.field3275.method46(arg0 + 13227);
                    class158.field3610 = class143.field3275.method46(860);
                    class143.field3275.method50(123, 0, class158.field3614.field1587, 1);
                    class158.field3614.field1569 = 0;
                    class86.field2005 = class158.field3614.method351(-31263);
                    class143.field3275.method50(127, 0, class158.field3614.field1587, 2);
                    class158.field3614.field1569 = 0;
                    class115.field2702 = class158.field3614.method532(0);
                    class52.field1178 = 10;
                }
                if (class52.field1178 == 10) {
                    if (class143.field3275.method51((byte) 127) >= class115.field2702) {
                        class158.field3614.field1569 = 0;
                        class143.field3275.method50(114, 0, class158.field3614.field1587, class115.field2702);
                        class128.method995(0);
                        class62.field1423 = -1;
                        class4.method16(false, (byte) 87);
                        class86.field2005 = -1;
                    }
                } else {
                    ++class39.field939;
                    if (~class39.field939 < -2001) {
                        if (class132.field3035 < 1) {
                            if (class39.field941 == class26.field473) {
                                class39.field941 = class13.field223;
                            } else {
                                class39.field941 = class26.field473;
                            }
                            class52.field1178 = 0;
                            ++class132.field3035;
                        } else {
                            class66.method543(-3, -9034);
                        }
                    }
                }
            }
        } catch (IOException var9) {
            if (~class132.field3035 > -2) {
                ++class132.field3035;
                if (class39.field941 == class26.field473) {
                    class39.field941 = class13.field223;
                } else {
                    class39.field941 = class26.field473;
                }
                class52.field1178 = 0;
            } else {
                class66.method543(-2, -9034);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static final void method331(int arg0) {
        for (int var1 = 0; class61.field1353 > var1; ++var1) {
            int var2 = class62.field1419[var1];
            class70 var3 = class52.field1176[var2];
            int var4 = class158.field3614.method533(arg0 + -18880);
            if (~(var4 & 128) != -1) {
                var4 += class158.field3614.method533(arg0 + -18880) << 8;
            }
            method334((byte) 93, var3, var2, var4);
        }
        ++field1009;
        if (arg0 != 19135) {
            field999 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public static void method332(int arg0) {
        field1001 = null;
        field1006 = null;
        field992 = null;
        field999 = null;
        field1007 = null;
        field1010 = null;
        field1005 = null;
        field1004 = null;
        int var1 = -118 % ((-70 - arg0) / 53);
        field997 = null;
    }

    @OriginalMember(owner = "client!g", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field993;
        return this.field1000 == arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method122(Graphics arg0, int arg1, int arg2, int arg3) {
        this.method335(true);
        arg0.drawImage(super.field1122, arg3, arg2, this);
        if (arg1 == 29504) {
            ++field994;
        }
    }

    @OriginalMember(owner = "client!g", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1000 == arg0) {
            this.field1000 = null;
        }
        ++field988;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 127 % ((arg3 - 9) / 36);
        ++field1002;
        if (this.field1000 != null) {
            this.field1000.setPixels(arg0, arg4, arg1, arg2, this.field985, super.field1125, super.field1121 * arg4 + arg0, super.field1121);
            this.field1000.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!g", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field987;
        return true;
    }

    @OriginalMember(owner = "client!g", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field996;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BLka;II)V")
    private static final void method334(byte arg0, class70 arg1, int arg2, int arg3) {
        if (~(1024 & arg3) != -1) {
            arg1.field2733 = class158.field3614.method520((byte) 116);
            int var4 = class158.field3614.method526(-93);
            arg1.field2706 = class140.field3219 - -(65535 & var4);
            arg1.field2729 = var4 >> 16;
            if (arg1.field2733 == 65535) {
                arg1.field2733 = -1;
            }
            arg1.field2703 = 0;
            arg1.field2756 = 0;
            if (class140.field3219 < arg1.field2706) {
                arg1.field2756 = -1;
            }
        }
        ++field1012;
        if ((arg3 & 32) != 0) {
            int var5 = class158.field3614.method530((byte) 95);
            int var6 = class158.field3614.method533(255);
            arg1.method908(-24726, class140.field3219, var6, var5);
            arg1.field2693 = class140.field3219 - -300;
            arg1.field2757 = class158.field3614.method536(13285);
            arg1.field2740 = class158.field3614.method530((byte) 95);
        }
        if ((arg3 & 4) != 0) {
            int var7 = class158.field3614.method532(0);
            int var8 = class158.field3614.method521(126);
            if (var7 == 65535) {
                var7 = -1;
            }
            class134.method1025((byte) -69, var8, arg1, var7);
        }
        if (~(16 & arg3) != -1) {
            int var9 = class158.field3614.method520((byte) 126);
            int var10 = class158.field3614.method533(255);
            int var11 = class158.field3614.method536(13285);
            int var12 = class158.field3614.field1569;
            if (arg1.field1660 != null && arg1.field1632 != null) {
                boolean var13 = false;
                long var14 = arg1.field1660.method259(0);
                if (var10 <= 1) {
                    for (int var16 = 0; ~var16 > ~class106.field2506; ++var16) {
                        if (~class103.field2409[var16] == ~var14) {
                            var13 = true;
                            break;
                        }
                    }
                }
                if (!var13 && class97.field2232 == 0) {
                    class130.field2992.field1569 = 0;
                    class158.field3614.method558(var11, 0, false, class130.field2992.field1587);
                    class130.field2992.field1569 = 0;
                    class32 var17 = class99.method773(class129.method998((byte) 33, class130.field2992).method258(97));
                    arg1.field2723 = var17.method275(-91);
                    arg1.field2708 = 150;
                    arg1.field2755 = var9 >> 8;
                    arg1.field2751 = 255 & var9;
                    if (var10 != 2 && var10 != 3) {
                        if (~var10 != -2) {
                            class79.method629((byte) 98, var17, 2, arg1.field1660);
                        } else {
                            class79.method629((byte) 98, var17, 1, class52.method403(new class32[] { class143.field3280, arg1.field1660 }, (byte) -20));
                        }
                    } else {
                        class79.method629((byte) 98, var17, 1, class52.method403(new class32[] { class145.field3306, arg1.field1660 }, (byte) -20));
                    }
                }
            }
            class158.field3614.field1569 = var11 + var12;
        }
        if ((512 & arg3) != 0) {
            arg1.field2712 = class158.field3614.method521(66);
            arg1.field2719 = class158.field3614.method521(80);
            arg1.field2692 = class158.field3614.method533(255);
            arg1.field2742 = class158.field3614.method521(88);
            arg1.field2732 = class158.field3614.method520((byte) 119) + class140.field3219;
            arg1.field2726 = class158.field3614.method532(0) + class140.field3219;
            arg1.field2753 = class158.field3614.method533(255);
            arg1.field2698 = 1;
            arg1.field2750 = 0;
        }
        if (~(arg3 & 256) != -1) {
            int var18 = class158.field3614.method536(13285);
            int var19 = class158.field3614.method521(102);
            arg1.method908(-24726, class140.field3219, var19, var18);
            arg1.field2693 = class140.field3219 - -300;
            arg1.field2757 = class158.field3614.method533(255);
            arg1.field2740 = class158.field3614.method530((byte) 95);
        }
        if (~(arg3 & 2) != -1) {
            arg1.field2723 = class158.field3614.method556(1347418632);
            if (~arg1.field2723.method260(54, 0) == -127) {
                arg1.field2723 = arg1.field2723.method268((byte) -115, 1);
                class79.method629((byte) 98, arg1.field2723, 2, arg1.field1660);
            } else if (class20.field373 == arg1) {
                class79.method629((byte) 98, arg1.field2723, 2, arg1.field1660);
            }
            arg1.field2708 = 150;
            arg1.field2751 = 0;
            arg1.field2755 = 0;
        }
        if (arg0 < 42) {
            method332(-69);
        }
        if (~(8 & arg3) != -1) {
            arg1.field2758 = class158.field3614.method520((byte) -95);
            if (~arg1.field2758 == -65536) {
                arg1.field2758 = -1;
            }
        }
        if (~(64 & arg3) != -1) {
            int var20 = class158.field3614.method536(13285);
            byte[] var21 = new byte[var20];
            class66 var22 = new class66(var21);
            class158.field3614.method540(var21, 0, (byte) -110, var20);
            class143.field3264[arg2] = var22;
            arg1.method577((byte) 56, var22);
        }
        if (~(1 & arg3) != -1) {
            arg1.field2743 = class158.field3614.method520((byte) -34);
            arg1.field2699 = class158.field3614.method525((byte) 116);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V")
    private final synchronized void method335(boolean arg0) {
        if (!arg0) {
            field1001 = null;
        }
        ++field1008;
        if (this.field1000 != null) {
            this.field1000.setPixels(0, 0, super.field1121, super.field1123, this.field985, super.field1125, 0, super.field1121);
            this.field1000.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method123(int arg0, int arg1, int arg2, Component arg3) {
        super.field1125 = new int[arg1 * arg2 + 1];
        ++field989;
        super.field1121 = arg2;
        super.field1123 = arg1;
        this.field985 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field1122 = arg3.createImage(this);
        this.method335(true);
        arg3.prepareImage(super.field1122, this);
        this.method335(true);
        arg3.prepareImage(super.field1122, this);
        this.method335(true);
        arg3.prepareImage(super.field1122, this);
        this.method362((byte) 47);
        if (arg0 > -24) {
            this.isConsumer((ImageConsumer) null);
        }
    }

    @OriginalMember(owner = "client!g", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field1011;
        this.field1000 = arg0;
        arg0.setDimensions(super.field1121, super.field1123);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field985);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method124(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method333(arg4, arg2, arg3, 115, arg5);
        ++field986;
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg4, arg5, arg2, arg3);
        arg1.drawImage(super.field1122, arg0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!g", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field984;
        this.addConsumer(arg0);
    }
}
