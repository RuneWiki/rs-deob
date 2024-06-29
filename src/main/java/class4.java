import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class134 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "La;")
    public static class1 field173 = class113.method934(-11538, "Name eingeben:");

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "[I")
    public static int[] field174 = new int[32];

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "[I")
    public static int[] field182 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "La;")
    private static class1 field187;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "La;")
    public static class1 field184;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lwc;")
    public static class134 field188;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field169;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field172;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "[Ljd;")
    public static class58[] field179;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field174[var1] = var0 + -1;
            var0 += var0;
        }
        field186 = 2;
        field187 = class113.method934(-11538, "Login server offline)3");
        field184 = field187;
    }

    @OriginalMember(owner = "client!ac", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 6)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field171;
        return this.field172 == arg0;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 17)
    public static void method100(int arg0) {
        field188 = null;
        field179 = null;
        field184 = null;
        field173 = null;
        field187 = null;
        field174 = null;
        field182 = null;
        if (arg0 != 0) {
            field187 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V", line = 34)
    private final synchronized void method101(byte arg0) {
        ++field166;
        if (this.field172 != null) {
            int var2 = -99 / ((7 - arg0) / 62);
            this.field172.setPixels(0, 0, super.field3289, super.field3287, this.field169, super.field3291, 0, super.field3289);
            this.field172.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 56)
    public final void method102(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 0) {
            field174 = null;
        }
        ++field177;
        this.method101((byte) -65);
        arg2.drawImage(super.field3295, arg1, arg3, this);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Laa;BII)V", line = 71)
    public static final void method103(class2 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 14) {
            method103((class2) null, (byte) 8, -14, 82);
        }
        ++field175;
        if ((256 & arg2) != 0) {
            int var4 = class15.field489.method157((byte) -70);
            int var5 = class15.field489.method153(255);
            arg0.method730(var5, class82.field2066, var4, -122);
            arg0.field2016 = class82.field2066 + 300;
            arg0.field2007 = class15.field489.method157((byte) -70);
            arg0.field1978 = class15.field489.method153(255);
        }
        if (~(arg2 & 16) != -1) {
            arg0.field2025 = class15.field489.method146(65280);
            arg0.field1977 = class15.field489.method167((byte) -70);
        }
        if (~(arg2 & 1) != -1) {
            int var6 = class15.field489.method167((byte) -70);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class15.field489.method148((byte) -17);
            class42.method451(var6, var7, arg0, -1);
        }
        if ((arg2 & 4) != 0) {
            arg0.field2014 = class15.field489.method138((byte) 75);
            if (~arg0.field2014 == -65536) {
                arg0.field2014 = -1;
            }
        }
        if ((64 & arg2) != 0) {
            int var8 = class15.field489.method145(false);
            int var9 = class15.field489.method153(255);
            arg0.method730(var9, class82.field2066, var8, -123);
            arg0.field2016 = class82.field2066 + 300;
            arg0.field2007 = class15.field489.method153(255);
            arg0.field1978 = class15.field489.method153(255);
        }
        if ((arg2 & 1024) != 0) {
            arg0.field2002 = class15.field489.method157((byte) -70);
            arg0.field1958 = class15.field489.method157((byte) -70);
            arg0.field1976 = class15.field489.method145(false);
            arg0.field2004 = class15.field489.method145(false);
            arg0.field1989 = class15.field489.method138((byte) 124) - -class82.field2066;
            arg0.field1984 = class15.field489.method181(false) - -class82.field2066;
            arg0.field1950 = class15.field489.method153(255);
            arg0.method735(0);
        }
        if (~(8 & arg2) != -1) {
            int var10 = class15.field489.method146(65280);
            int var11 = class15.field489.method153(255);
            int var12 = class15.field489.method148((byte) 117);
            int var13 = class15.field489.field268;
            if (arg0.field87 != null && arg0.field91 != null) {
                long var14 = arg0.field87.method9((byte) 101);
                boolean var16 = false;
                if (var11 <= 1) {
                    for (int var17 = 0; var17 < class85.field2149; ++var17) {
                        if (~class106.field2686[var17] == ~var14) {
                            var16 = true;
                            break;
                        }
                    }
                }
                if (!var16 && class6.field234 == 0) {
                    class117.field2920.field268 = 0;
                    class15.field489.method139((byte) -80, 0, class117.field2920.field285, var12);
                    class117.field2920.field268 = 0;
                    class1 var18 = class107.method896(124, class117.field2920).method4(-16315);
                    arg0.field1967 = var18.method40(false);
                    arg0.field1955 = 150;
                    arg0.field2000 = var10 & 255;
                    arg0.field1979 = var10 >> 8;
                    if (~var11 != -3 && ~var11 != -4) {
                        if (~var11 == -2) {
                            class89.method761(123, 1, var18, class116.method959(-79, new class1[] { class103.field2615, arg0.field87 }));
                        } else {
                            class89.method761(127, 2, var18, arg0.field87);
                        }
                    } else {
                        class89.method761(68, 1, var18, class116.method959(75, new class1[] { class100.field2538, arg0.field87 }));
                    }
                }
            }
            class15.field489.field268 = var12 + var13;
        }
        if ((32 & arg2) != 0) {
            int var19 = class15.field489.method145(false);
            byte[] var20 = new byte[var19];
            class8 var21 = new class8(var20);
            class15.field489.method174(var20, 0, var19, (byte) 45);
            class45.field1178[arg3] = var21;
            arg0.method44((byte) -85, var21);
        }
        if ((arg2 & 512) != 0) {
            arg0.field1968 = class15.field489.method167((byte) -70);
            int var22 = class15.field489.method147(-117);
            arg0.field2006 = 0;
            arg0.field1970 = (var22 & 65535) + class82.field2066;
            if (~arg0.field1968 == -65536) {
                arg0.field1968 = -1;
            }
            arg0.field2017 = 0;
            arg0.field1987 = var22 >> 16;
            if (arg0.field1970 > class82.field2066) {
                arg0.field2017 = -1;
            }
        }
        if (~(128 & arg2) != -1) {
            arg0.field1967 = class15.field489.method141(-10721);
            if (arg0.field1967.method6(0, false) != 126) {
                if (class104.field2624 == arg0) {
                    class89.method761(99, 2, arg0.field1967, arg0.field87);
                }
            } else {
                arg0.field1967 = arg0.field1967.method1((byte) 95, 1);
                class89.method761(120, 2, arg0.field1967, arg0.field87);
            }
            arg0.field1955 = 150;
            arg0.field1979 = 0;
            arg0.field2000 = 0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 268)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field172 == arg0) {
            this.field172 = null;
        }
        ++field168;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)Lhe;", line = 278)
    public static final class47 method104(int arg0, int arg1) {
        ++field183;
        class47 var2 = (class47) class46.field1198.method264((long) arg0, (byte) 47);
        if (arg1 != 2) {
            field186 = -106;
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class47.field1243.method218(arg0, 115, 12);
            class47 var4 = new class47();
            if (var3 != null) {
                var4.method491(-1, new class8(var3));
            }
            var4.method488((byte) 37);
            class46.field1198.method263(arg1 + -7210, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ac", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 303)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field170;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILqd;)Z", line = 316)
    public static final boolean method105(int arg0, class100 arg1) {
        if (arg0 != 300) {
            return false;
        } else {
            ++field176;
            int var2 = arg1.field2448;
            if ((var2 < 1 || var2 > 200) && (var2 < 701 || var2 > 900)) {
                if (var2 >= 401 && ~var2 >= -501) {
                    ++class120.field2975;
                    class34.method399(0, class132.field3242, 0, -501, 0, 35, class116.method959(115, new class1[] { class53.field1396, arg1.field2477 }));
                    return true;
                } else {
                    return false;
                }
            } else {
                ++class48.field1265;
                if (var2 >= 801) {
                    var2 -= 701;
                } else if (var2 >= 701) {
                    var2 -= 601;
                } else if (var2 < 101) {
                    --var2;
                } else {
                    var2 -= 101;
                }
                ++class73.field1782;
                class34.method399(0, class132.field3242, 0, arg0 + -801, 0, 13, class116.method959(arg0 ^ -260, new class1[] { class53.field1396, class119.field2954[var2] }));
                class34.method399(0, class113.field2781, 0, -501, 0, 18, class116.method959(arg0 + -192, new class1[] { class53.field1396, class119.field2954[var2] }));
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILa;Lba;)I", line = 361)
    public static final int method106(int arg0, class1 arg1, class8 arg2) {
        if (arg0 < 24) {
            field184 = null;
        }
        ++field180;
        int var3 = arg2.field268;
        arg2.method186(arg1.field26, 32768);
        arg2.field268 += class95.field2360.method1039(-18678, 0, arg2.field268, arg1.field26, arg1.field38, arg2.field285);
        return -var3 + arg2.field268;
    }

    @OriginalMember(owner = "client!ac", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 379)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field165;
        return true;
    }

    @OriginalMember(owner = "client!ac", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 390)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field172 = arg0;
        arg0.setDimensions(super.field3289, super.field3287);
        ++field178;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field169);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILjava/awt/Component;I)V", line = 402)
    public final void method107(int arg0, int arg1, Component arg2, int arg3) {
        super.field3291 = new int[arg1 * arg3 + 1];
        super.field3289 = arg1;
        ++field181;
        super.field3287 = arg3;
        this.field169 = new DirectColorModel(32, 16711680, 65280, 255);
        super.field3295 = arg2.createImage(this);
        this.method101((byte) -100);
        arg2.prepareImage(super.field3295, this);
        if (arg0 < 4) {
            this.method101((byte) -7);
        }
        this.method101((byte) -95);
        arg2.prepareImage(super.field3295, this);
        this.method101((byte) -81);
        arg2.prepareImage(super.field3295, this);
        this.method1057((byte) 90);
    }

    @OriginalMember(owner = "client!ac", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 434)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        ++field167;
    }
}
