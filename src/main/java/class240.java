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

@OriginalClass("client!ep")
public class class240 extends class292 implements ImageProducer {

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "[I")
    public static int[] field3415 = new int[100];

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "Ldg;")
    public static class236 field3399 = new class236(new byte[5000]);

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "[Ldi;")
    public static class64[] field3419 = new class64[14];

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "Luj;")
    public static class214 field3417;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Ltq;")
    public static class376 field3398;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "Ltq;")
    public static class376 field3416;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3406;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field3409;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field3408;

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field3405;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method1639(Canvas arg0, int arg1) {
        ++field3404;
        if (arg1 != 1730965570) {
            this.method1640(61, 11, 63, -120, -8);
        }
        this.field3406 = arg0;
        super.field4082 = this.field3406.getSize().width;
        super.field4083 = this.field3406.getSize().height;
        super.field4080 = new int[super.field4083 * super.field4082];
        this.field3408 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field3409 = this.field3406.createImage(this);
        this.method1641(-75);
        this.field3406.prepareImage(this.field3409, this.field3406);
        this.method1641(-110);
        this.field3406.prepareImage(this.field3409, this.field3406);
        this.method1641(arg1 ^ -1730965609);
        this.field3406.prepareImage(this.field3409, this.field3406);
    }

    @OriginalMember(owner = "client!ep", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field3401;
        this.field3405 = arg0;
        arg0.setDimensions(super.field4082, super.field4083);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field3408);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1640(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3407;
        if (this.field3405 != null) {
            this.field3405.setPixels(arg0, arg1, arg4, arg3, this.field3408, super.field4080, super.field4082 * arg1 + arg0, super.field4082);
            this.field3405.imageComplete(2);
            if (arg2 != 0) {
                this.field3408 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    private final synchronized void method1641(int arg0) {
        if (arg0 < -22) {
            ++field3411;
            if (this.field3405 != null) {
                this.field3405.setPixels(0, 0, super.field4082, super.field4083, this.field3408, super.field4080, 0, super.field4082);
                this.field3405.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZIILjava/awt/Graphics;)V")
    public final void method1642(int arg0, int arg1, boolean arg2, int arg3, int arg4, Graphics arg5) {
        ++field3403;
        this.method1640(arg1, arg0, 0, arg4, arg3);
        Shape var7 = arg5.getClip();
        if (arg2) {
            arg5.clipRect(arg1, arg0, arg3, arg4);
            arg5.drawImage(this.field3409, 0, 0, this.field3406);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
    public static void method1643(int arg0) {
        field3416 = null;
        field3419 = null;
        field3398 = null;
        field3417 = null;
        field3399 = null;
        field3415 = null;
        int var1 = -33 % ((-63 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILdn;)V")
    public static final void method1644(int arg0, class302 arg1) {
        ++field3400;
        if (arg1 != null && class393.field5547.field1104 != arg1) {
            int var2 = arg1.field4253;
            int var3 = arg1.field4254;
            int var4 = arg1.field4247;
            int var5 = (int) arg1.field4250;
            if (var4 >= 2000) {
                var4 -= 2000;
            }
            long var6 = arg1.field4250;
            int var8;
            int var9;
            if (class203.field2927 != null) {
                var8 = class203.field2927.method1823((byte) 108);
                var9 = class203.field2927.method1830(32431);
            } else {
                var8 = class222.field3123;
                var9 = class233.field3281;
            }
            if (~var4 == -1009) {
                class161.field2140 = var9;
                class54.field632 = var8;
                ++class325.field4621;
                class404.field5813 = 2;
                class412.field5924 = 0;
                class62.field718.method2143(81, -2);
                class62.field718.method1588(128, class41.field496 + var3);
                class62.field718.method1612(class114.field1403 + var2, -17029);
                class62.field718.method1605((int) (var6 >>> 32) & Integer.MAX_VALUE, false);
                class62.field718.method1557(301673864, !class441.field6334.method2208(false, 82) ? 0 : 1);
                class159.method1018(var2, var3, 0, var6);
            }
            if (var4 == 9) {
                class40 var10 = class26.field314[var5];
                if (var10 != null) {
                    class412.field5924 = 0;
                    class161.field2140 = var9;
                    ++class268.field3807;
                    class404.field5813 = 2;
                    class54.field632 = var8;
                    class62.field718.method2143(172, -2);
                    class62.field718.method1563(-2, var5);
                    class62.field718.method1606(class441.field6334.method2208(false, 82) ? 1 : 0, (byte) -48);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var10.method242(-30129), var10.field5664[0], -2, var10.field5677[0], class384.field5422.field5664[0], var10.method242(-30129), (byte) -45);
                }
            }
            if (var4 == 20) {
                class40 var11 = class26.field314[var5];
                if (var11 != null) {
                    class412.field5924 = 0;
                    class161.field2140 = var9;
                    class54.field632 = var8;
                    ++class341.field4828;
                    class404.field5813 = 2;
                    class62.field718.method2143(100, -2);
                    class62.field718.method1611(-82, !class441.field6334.method2208(false, 82) ? 0 : 1);
                    class62.field718.method1612(var5, -17029);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var11.method242(-30129), var11.field5664[0], -2, var11.field5677[0], class384.field5422.field5664[0], var11.method242(-30129), (byte) -45);
                }
            }
            if (~var4 == -1010) {
                ++class306.field4318;
                class412.field5924 = 0;
                class404.field5813 = 2;
                class161.field2140 = var9;
                class54.field632 = var8;
                class62.field718.method2143(218, -2);
                class62.field718.method1612(var5, -17029);
            }
            if (var4 == 6) {
                class54.field632 = var8;
                class412.field5924 = 0;
                class404.field5813 = 2;
                class161.field2140 = var9;
                ++class28.field339;
                class62.field718.method2143(53, -2);
                class62.field718.method1605(var5, false);
                class62.field718.method1611(-58, class441.field6334.method2208(false, 82) ? 1 : 0);
                class62.field718.method1563(-2, class41.field496 + var3);
                class62.field718.method1563(-2, class114.field1403 + var2);
                class36.method221(0, var3, var2);
            }
            if (var4 == 57) {
                class404.field5813 = 2;
                class412.field5924 = 0;
                class54.field632 = var8;
                class161.field2140 = var9;
                ++class21.field274;
                class62.field718.method2143(32, -2);
                class62.field718.method1563(-2, var3 - -class41.field496);
                class62.field718.method1612(var5, -17029);
                class62.field718.method1612(class114.field1403 + var2, -17029);
                class62.field718.method1557(301673864, !class441.field6334.method2208(false, 82) ? 0 : 1);
                class36.method221(0, var3, var2);
            }
            if (~var4 == -46) {
                if (class135.field1685 > 0 && class441.field6334.method2208(false, 82) && class441.field6334.method2208(false, 81)) {
                    class125.method785(class114.field1403 + var2, class41.field496 + var3, (byte) 119, class129.field1570);
                } else {
                    class161.field2140 = var9;
                    ++class408.field5884;
                    class404.field5813 = 1;
                    class412.field5924 = 0;
                    class54.field632 = var8;
                    class62.field718.method2143(156, -2);
                    class62.field718.method1563(-2, class114.field1403 - -var2);
                    class62.field718.method1563(-2, class41.field496 + var3);
                }
            }
            if (~var4 == -20) {
                class54.field632 = var8;
                class404.field5813 = 2;
                class412.field5924 = 0;
                ++class188.field2716;
                class161.field2140 = var9;
                class62.field718.method2143(103, -2);
                class62.field718.method1583(class441.field6334.method2208(false, 82) ? 1 : 0, (byte) -104);
                class62.field718.method1605(class41.field496 + var3, false);
                class62.field718.method1563(-2, class114.field1403 + var2);
                class62.field718.method1612(Integer.MAX_VALUE & (int) (var6 >>> 32), -17029);
                class159.method1018(var2, var3, 0, var6);
            }
            if (var4 == 59) {
                class77 var12 = class167.field2335[var5];
                if (var12 != null) {
                    ++class298.field4165;
                    class54.field632 = var8;
                    class404.field5813 = 2;
                    class161.field2140 = var9;
                    class412.field5924 = 0;
                    class62.field718.method2143(69, -2);
                    class62.field718.method1605(var5, false);
                    class62.field718.method1583(!class441.field6334.method2208(false, 82) ? 0 : 1, (byte) -102);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var12.method242(-30129), var12.field5664[0], -2, var12.field5677[0], class384.field5422.field5664[0], var12.method242(-30129), (byte) -45);
                }
            }
            if (var4 == 1007 || ~var4 == -1005 || ~var4 == -1012 || var4 == 1012 || ~var4 == -1003) {
                class249.method1693(var4, var5, var2, 53);
            }
            if (var4 == 17) {
                class184 var13 = class341.method2186(var3, (byte) 21, var2);
                if (var13 != null) {
                    class247.method1685(false, var13);
                }
            }
            if (var4 == 1001) {
                class161.field2140 = var9;
                class412.field5924 = 0;
                class54.field632 = var8;
                class404.field5813 = 2;
                ++class419.field5990;
                class62.field718.method2143(31, -2);
                class62.field718.method1588(128, var5);
            }
            if (~var4 == -16) {
                class412.field5924 = 0;
                ++class146.field1797;
                class54.field632 = var8;
                class161.field2140 = var9;
                class404.field5813 = 2;
                class62.field718.method2143(52, -2);
                class62.field718.method1611(-75, class441.field6334.method2208(false, 82) ? 1 : 0);
                class62.field718.method1612(Integer.MAX_VALUE & (int) (var6 >>> 32), -17029);
                class62.field718.method1563(-2, var3 - -class41.field496);
                class62.field718.method1605(var2 - -class114.field1403, false);
                class159.method1018(var2, var3, 0, var6);
            }
            if (~var4 == -11) {
                class40 var14 = class26.field314[var5];
                if (var14 != null) {
                    class161.field2140 = var9;
                    class404.field5813 = 2;
                    class54.field632 = var8;
                    class412.field5924 = 0;
                    ++class202.field2897;
                    class62.field718.method2143(2, -2);
                    class62.field718.method1557(301673864, class441.field6334.method2208(false, 82) ? 1 : 0);
                    class62.field718.method1612(var5, -17029);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var14.method242(-30129), var14.field5664[0], -2, var14.field5677[0], class384.field5422.field5664[0], var14.method242(-30129), (byte) -45);
                }
            }
            if (~var4 == -3) {
                class40 var15 = class26.field314[var5];
                if (var15 != null) {
                    class404.field5813 = 2;
                    class412.field5924 = 0;
                    class161.field2140 = var9;
                    class54.field632 = var8;
                    ++class207.field2940;
                    class62.field718.method2143(169, -2);
                    class62.field718.method1563(-2, var5);
                    class62.field718.method1611(-75, !class441.field6334.method2208(false, 82) ? 0 : 1);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var15.method242(-30129), var15.field5664[0], -2, var15.field5677[0], class384.field5422.field5664[0], var15.method242(-30129), (byte) -45);
                }
            }
            if (~var4 == -45) {
                class40 var16 = class26.field314[var5];
                if (var16 != null) {
                    class404.field5813 = 2;
                    ++class184.field2576;
                    class54.field632 = var8;
                    class161.field2140 = var9;
                    class412.field5924 = 0;
                    class62.field718.method2143(134, -2);
                    class62.field718.method1587(class408.field5883, true);
                    class62.field718.method1612(class188.field2714, -17029);
                    class62.field718.method1606(!class441.field6334.method2208(false, 82) ? 0 : 1, (byte) -48);
                    class62.field718.method1588(128, var5);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var16.method242(-30129), var16.field5664[0], -2, var16.field5677[0], class384.field5422.field5664[0], var16.method242(-30129), (byte) -45);
                }
            }
            if (var4 == 11) {
                ++class340.field4817;
                class161.field2140 = var9;
                class54.field632 = var8;
                class404.field5813 = 2;
                class412.field5924 = 0;
                class62.field718.method2143(11, -2);
                class62.field718.method1611(-106, class441.field6334.method2208(false, 82) ? 1 : 0);
                class62.field718.method1605(class114.field1403 + var2, false);
                class62.field718.method1588(128, var5);
                class62.field718.method1563(-2, class41.field496 + var3);
                class36.method221(0, var3, var2);
            }
            if (~var4 == -52) {
                class77 var17 = class167.field2335[var5];
                if (var17 != null) {
                    class54.field632 = var8;
                    class412.field5924 = 0;
                    class161.field2140 = var9;
                    class404.field5813 = 2;
                    ++class167.field2337;
                    class62.field718.method2143(121, -2);
                    class62.field718.method1605(var5, false);
                    class62.field718.method1557(301673864, !class441.field6334.method2208(false, 82) ? 0 : 1);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var17.method242(-30129), var17.field5664[0], -2, var17.field5677[0], class384.field5422.field5664[0], var17.method242(-30129), (byte) -45);
                }
            }
            if (var4 == 58) {
                class412.field5924 = 0;
                class54.field632 = var8;
                ++class253.field3642;
                class161.field2140 = var9;
                class404.field5813 = 2;
                class62.field718.method2143(51, -2);
                class62.field718.method1605(class114.field1403 + var2, false);
                class62.field718.method1612(var3 - -class41.field496, -17029);
                class62.field718.method1557(301673864, class441.field6334.method2208(false, 82) ? 1 : 0);
                class62.field718.method1563(-2, var5);
                class36.method221(0, var3, var2);
            }
            if (var4 == 25) {
                class412.field5924 = 0;
                ++class39.field444;
                class54.field632 = var8;
                class161.field2140 = var9;
                class404.field5813 = 2;
                class62.field718.method2143(192, -2);
                class62.field718.method1603(class408.field5883, 871);
                class62.field718.method1605(class188.field2714, false);
                class62.field718.method1612(class41.field496 + var3, -17029);
                class62.field718.method1583(class441.field6334.method2208(false, 82) ? 1 : 0, (byte) -99);
                class62.field718.method1605(class114.field1403 + var2, false);
                class62.field718.method1563(-2, Integer.MAX_VALUE & (int) (var6 >>> 32));
                class159.method1018(var2, var3, 0, var6);
            }
            if (var4 == 12) {
                class412.field5924 = 0;
                ++class266.field3792;
                class404.field5813 = 1;
                class161.field2140 = var9;
                class54.field632 = var8;
                class62.field718.method2143(229, -2);
                class62.field718.method1612(class41.field496 + var3, -17029);
                class62.field718.method1612(class114.field1403 + var2, -17029);
                class62.field718.method1588(128, class188.field2714);
                class62.field718.method1564(class408.field5883, 121);
                class95.method530(0, class384.field5422.field5677[0], true, 0, 1, var3, -4, var2, class384.field5422.field5664[0], 1, (byte) -45);
            }
            if (~var4 == -4) {
                class54.field632 = var8;
                class412.field5924 = 0;
                class404.field5813 = 2;
                class161.field2140 = var9;
                ++class303.field4270;
                class62.field718.method2143(114, -2);
                class62.field718.method1563(-2, class114.field1403 + var2);
                class62.field718.method1583(!class441.field6334.method2208(false, 82) ? 0 : 1, (byte) -100);
                class62.field718.method1612((int) (var6 >>> 32) & Integer.MAX_VALUE, -17029);
                class62.field718.method1612(class41.field496 + var3, -17029);
                class159.method1018(var2, var3, 0, var6);
            }
            if (~var4 == -49 && class59.field709 == null) {
                class442.method2757(false, var3, var2);
                class59.field709 = class341.method2186(var3, (byte) 21, var2);
                class186.method1277(class59.field709, (byte) -21);
            }
            if (var4 == 22) {
                class54.field632 = var8;
                class412.field5924 = 0;
                class161.field2140 = var9;
                class404.field5813 = 2;
                ++class46.field559;
                class62.field718.method2143(135, -2);
                class62.field718.method1563(-2, class41.field496 + var3);
                class62.field718.method1612(var5, -17029);
                class62.field718.method1605(class114.field1403 + var2, false);
                class62.field718.method1583(!class441.field6334.method2208(false, 82) ? 0 : 1, (byte) -60);
                class36.method221(0, var3, var2);
            }
            if (var4 == 46) {
                class412.field5924 = 0;
                class404.field5813 = 2;
                class161.field2140 = var9;
                class54.field632 = var8;
                ++class161.field2139;
                class62.field718.method2143(132, -2);
                class62.field718.method1605(var3 - -class41.field496, false);
                class62.field718.method1612(class188.field2714, -17029);
                class62.field718.method1610(class408.field5883, 17);
                class62.field718.method1563(-2, var5);
                class62.field718.method1605(var2 - -class114.field1403, false);
                class62.field718.method1611(-82, class441.field6334.method2208(false, 82) ? 1 : 0);
                class36.method221(0, var3, var2);
            }
            if (~var4 == -19) {
                class77 var18 = class167.field2335[var5];
                if (var18 != null) {
                    ++class433.field6232;
                    class54.field632 = var8;
                    class404.field5813 = 2;
                    class161.field2140 = var9;
                    class412.field5924 = 0;
                    class62.field718.method2143(193, -2);
                    class62.field718.method1612(class188.field2714, -17029);
                    class62.field718.method1603(class408.field5883, 871);
                    class62.field718.method1583(class441.field6334.method2208(false, 82) ? 1 : 0, (byte) -112);
                    class62.field718.method1563(-2, var5);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var18.method242(-30129), var18.field5664[0], -2, var18.field5677[0], class384.field5422.field5664[0], var18.method242(-30129), (byte) -45);
                }
            }
            if (var4 == 21) {
                if (~class135.field1685 < -1 && class441.field6334.method2208(false, 82) && class441.field6334.method2208(false, 81)) {
                    class125.method785(class114.field1403 + var2, class41.field496 + var3, (byte) 66, class129.field1570);
                } else {
                    class131.method812(var2, var5, 0, var3);
                    if (var5 != 1) {
                        class404.field5813 = 1;
                        class54.field632 = var8;
                        class412.field5924 = 0;
                        class161.field2140 = var9;
                    } else {
                        class62.field718.method1583(-1, (byte) -121);
                        class62.field718.method1583(-1, (byte) -128);
                        class62.field718.method1605((int) class441.field6333, false);
                        class62.field718.method1583(57, (byte) -65);
                        class62.field718.method1583(class297.field4137, (byte) -114);
                        class62.field718.method1583(class292.field4089, (byte) -98);
                        class62.field718.method1583(89, (byte) -50);
                        class62.field718.method1605(class384.field5422.field3284, false);
                        class62.field718.method1605(class384.field5422.field3269, false);
                        class62.field718.method1583(63, (byte) -126);
                    }
                    class95.method530(0, class384.field5422.field5677[0], true, 0, 1, var3, -4, var2, class384.field5422.field5664[0], 1, (byte) -45);
                }
            }
            if (var4 == 13) {
                ++class245.field3471;
                class412.field5924 = 0;
                class404.field5813 = 2;
                class54.field632 = var8;
                class161.field2140 = var9;
                class62.field718.method2143(141, -2);
                class62.field718.method1583(class441.field6334.method2208(false, 82) ? 1 : 0, (byte) -96);
                class62.field718.method1612(class114.field1403 + var2, -17029);
                class62.field718.method1605(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
                class62.field718.method1563(-2, var3 - -class41.field496);
                class159.method1018(var2, var3, 0, var6);
            }
            if (var4 == 47) {
                class40 var19 = class26.field314[var5];
                if (var19 != null) {
                    ++class399.field5698;
                    class404.field5813 = 2;
                    class54.field632 = var8;
                    class161.field2140 = var9;
                    class412.field5924 = 0;
                    class62.field718.method2143(40, -2);
                    class62.field718.method1563(-2, var5);
                    class62.field718.method1583(class441.field6334.method2208(false, 82) ? 1 : 0, (byte) -112);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var19.method242(-30129), var19.field5664[0], -2, var19.field5677[0], class384.field5422.field5664[0], var19.method242(-30129), (byte) -45);
                }
            }
            int var20 = -118 / ((arg0 - -53) / 58);
            if (~var4 == -5) {
                class77 var21 = class167.field2335[var5];
                if (var21 != null) {
                    class412.field5924 = 0;
                    class161.field2140 = var9;
                    class54.field632 = var8;
                    class404.field5813 = 2;
                    ++class327.field4641;
                    class62.field718.method2143(248, -2);
                    class62.field718.method1606(class441.field6334.method2208(false, 82) ? 1 : 0, (byte) -48);
                    class62.field718.method1612(var5, -17029);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var21.method242(-30129), var21.field5664[0], -2, var21.field5677[0], class384.field5422.field5664[0], var21.method242(-30129), (byte) -45);
                }
            }
            if (~var4 == -61) {
                class77 var22 = class167.field2335[var5];
                if (var22 != null) {
                    ++class193.field2787;
                    class161.field2140 = var9;
                    class54.field632 = var8;
                    class404.field5813 = 2;
                    class412.field5924 = 0;
                    class62.field718.method2143(216, -2);
                    class62.field718.method1588(128, var5);
                    class62.field718.method1611(-39, class441.field6334.method2208(false, 82) ? 1 : 0);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var22.method242(-30129), var22.field5664[0], -2, var22.field5677[0], class384.field5422.field5664[0], var22.method242(-30129), (byte) -45);
                }
            }
            if (var4 == 50) {
                class40 var23 = class26.field314[var5];
                if (var23 != null) {
                    ++class24.field301;
                    class404.field5813 = 2;
                    class161.field2140 = var9;
                    class412.field5924 = 0;
                    class54.field632 = var8;
                    class62.field718.method2143(59, -2);
                    class62.field718.method1605(var5, false);
                    class62.field718.method1611(-126, !class441.field6334.method2208(false, 82) ? 0 : 1);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var23.method242(-30129), var23.field5664[0], -2, var23.field5677[0], class384.field5422.field5664[0], var23.method242(-30129), (byte) -45);
                }
            }
            if (var4 == 49) {
                class40 var24 = class26.field314[var5];
                if (var24 != null) {
                    class54.field632 = var8;
                    class404.field5813 = 2;
                    ++class138.field1723;
                    class161.field2140 = var9;
                    class412.field5924 = 0;
                    class62.field718.method2143(160, -2);
                    class62.field718.method1612(var5, -17029);
                    class62.field718.method1606(class441.field6334.method2208(false, 82) ? 1 : 0, (byte) -48);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var24.method242(-30129), var24.field5664[0], -2, var24.field5677[0], class384.field5422.field5664[0], var24.method242(-30129), (byte) -45);
                }
            }
            if (var4 == 8) {
                class77 var25 = class167.field2335[var5];
                if (var25 != null) {
                    class54.field632 = var8;
                    class412.field5924 = 0;
                    ++class191.field2748;
                    class161.field2140 = var9;
                    class404.field5813 = 2;
                    class62.field718.method2143(174, -2);
                    class62.field718.method1557(301673864, !class441.field6334.method2208(false, 82) ? 0 : 1);
                    class62.field718.method1588(128, var5);
                    class95.method530(0, class384.field5422.field5677[0], true, 0, var25.method242(-30129), var25.field5664[0], -2, var25.field5677[0], class384.field5422.field5664[0], var25.method242(-30129), (byte) -45);
                }
            }
            if (var4 == 23) {
                class184 var26 = class341.method2186(var3, (byte) 21, var2);
                if (var26 != null) {
                    class3.method13(-11372);
                    class281 var27 = client.method1121(var26);
                    class414.method2637(var27.method1860(-1), var2, 29286, var26.field2645, var27.field3976, var3, var26.field2611);
                    class154.field1907 = class170.method1144(25, var26);
                    class253.field3613 = var26.field2613 + "<col=ffffff>";
                    if (class154.field1907 == null) {
                        class154.field1907 = "Null";
                    }
                }
            } else {
                if (var4 == 5 || var4 == 1006) {
                    class222.method1487(var5, var3, (byte) 118, arg1.field4248, var2);
                }
                if (var4 == 30) {
                    class40 var28 = class26.field314[var5];
                    if (var28 != null) {
                        class404.field5813 = 2;
                        class161.field2140 = var9;
                        ++class210.field2990;
                        class54.field632 = var8;
                        class412.field5924 = 0;
                        class62.field718.method2143(33, -2);
                        class62.field718.method1612(var5, -17029);
                        class62.field718.method1583(!class441.field6334.method2208(false, 82) ? 0 : 1, (byte) -63);
                        class95.method530(0, class384.field5422.field5677[0], true, 0, var28.method242(-30129), var28.field5664[0], -2, var28.field5677[0], class384.field5422.field5664[0], var28.method242(-30129), (byte) -45);
                    }
                }
                if (~var4 == -1011) {
                    class404.field5813 = 2;
                    class161.field2140 = var9;
                    class412.field5924 = 0;
                    class54.field632 = var8;
                    class77 var29 = class167.field2335[var5];
                    if (var29 != null) {
                        class135 var30 = var29.field912;
                        if (var30.field1655 != null) {
                            var30 = var30.method836((byte) -115);
                        }
                        if (var30 != null) {
                            ++class4.field62;
                            class62.field718.method2143(167, -2);
                            class62.field718.method1612(var30.field1635, -17029);
                        }
                    }
                }
                if (class279.field3951) {
                    class3.method13(-11372);
                }
                if (class399.field5700 != null && ~class50.field596 == -1) {
                    class186.method1277(class399.field5700, (byte) 112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field3405 == arg0) {
            this.field3405 = null;
        }
        ++field3413;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method1645(int arg0, int arg1, int arg2, Graphics arg3) {
        ++field3402;
        this.method1641(-107);
        arg3.drawImage(this.field3409, arg2, arg1, this.field3406);
        if (arg0 < 95) {
            field3398 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field3412;
        return this.field3405 == arg0;
    }

    @OriginalMember(owner = "client!ep", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field3410;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V")
    public static final void method1646(int arg0, int arg1, int arg2) {
        ++field3397;
        class20 var3 = class369.method2351((byte) 101, arg0, arg2);
        var3.method146(78);
        var3.field252 = arg1;
    }

    @OriginalMember(owner = "client!ep", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field3414;
        this.addConsumer(arg0);
    }
}
