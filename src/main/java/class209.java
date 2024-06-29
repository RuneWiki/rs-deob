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

@OriginalClass("client!eq")
public class class209 extends class593 implements ImageProducer {

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "Lqfa;")
    public static class98 field2742 = new class98(107, -1);

    @OriginalMember(owner = "client!eq", name = "G", descriptor = "[I")
    public static int[] field2754 = new int[256];

    @OriginalMember(owner = "client!eq", name = "H", descriptor = "Ljava/lang/String;")
    public static String field2755;

    @OriginalMember(owner = "client!eq", name = "I", descriptor = "Lvl;")
    public static class13 field2756;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!eq", name = "B", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!eq", name = "D", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!eq", name = "F", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!eq", name = "J", descriptor = "Lij;")
    public static class421 field2757;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2741;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field2739;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2744;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2748;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BILbe;I)V")
    public static final void method1277(byte arg0, int arg1, class37 arg2, int arg3) {
        ++field2740;
        if (arg2 != null && class215.field2820.field6565 != arg2) {
            int var4 = arg2.field461;
            int var5 = arg2.field465;
            int var6 = arg2.field463;
            int var7 = (int) arg2.field474;
            if (arg0 < -3) {
                long var8 = arg2.field474;
                if (var6 >= 2000) {
                    var6 -= 2000;
                }
                if (var6 == 59) {
                    class280 var10 = class309.field4311[var7];
                    if (var10 != null) {
                        ++class55.field644;
                        class469.field6649 = arg1;
                        class382.field5463 = arg3;
                        class674.field9142 = 2;
                        class269.field3848 = 0;
                        class519 var11 = class357.method2293(class427.field5994, class571.field8099, (byte) -39);
                        var11.field7384.method3718((byte) 116, var7);
                        var11.field7384.method3694(!class589.field8306.method1517(0, 82) ? 0 : 1, -1528071456);
                        class151.method1027(var11, -77);
                        class174.method1113(-2, 0, 1, var10.method1835((byte) 127), var10.method1835((byte) 127), 0, var10.field8009[0], true, var10.field8015[0]);
                    }
                }
                if (var6 == 23) {
                    class740 var12 = (class740) class373.field5230.method1180((byte) 26, (long) var7);
                    if (var12 != null) {
                        class469.field6649 = arg1;
                        class269.field3848 = 0;
                        class468 var13 = var12.field10289;
                        ++class141.field2032;
                        class674.field9142 = 2;
                        class382.field5463 = arg3;
                        class519 var14 = class357.method2293(class427.field5994, class197.field2616, (byte) -126);
                        var14.field7384.method3694(!class589.field8306.method1517(0, 82) ? 0 : 1, -1528071456);
                        var14.field7384.method3709(1815869672, var7);
                        class151.method1027(var14, -39);
                        class174.method1113(-2, 0, 1, var13.method1835((byte) 127), var13.method1835((byte) 127), 0, var13.field8009[0], true, var13.field8015[0]);
                    }
                }
                if (var6 == 57) {
                    class382.field5463 = arg3;
                    class469.field6649 = arg1;
                    class674.field9142 = 2;
                    ++class337.field4694;
                    class269.field3848 = 0;
                    class519 var15 = class357.method2293(class427.field5994, class478.field6777, (byte) -112);
                    var15.field7384.method3745(-122, class228.field3063 + var4);
                    var15.field7384.method3718((byte) 121, var5 - -class3.field30);
                    var15.field7384.method3751((byte) -48, !class589.field8306.method1517(0, 82) ? 0 : 1);
                    var15.field7384.method3709(1815869672, var7);
                    class151.method1027(var15, -24);
                    class408.method2526(0, var4, var5);
                }
                if (var6 == 2) {
                    class280 var16 = class309.field4311[var7];
                    if (var16 != null) {
                        class469.field6649 = arg1;
                        class269.field3848 = 0;
                        ++class498.field7150;
                        class674.field9142 = 2;
                        class382.field5463 = arg3;
                        class519 var17 = class357.method2293(class427.field5994, class626.field8703, (byte) 115);
                        var17.field7384.method3701(class504.field7234, (byte) -86);
                        var17.field7384.method3709(1815869672, class114.field1379);
                        var17.field7384.method3718((byte) 88, var7);
                        var17.field7384.method3724(!class589.field8306.method1517(0, 82) ? 0 : 1, (byte) 62);
                        var17.field7384.method3733(-49, class58.field710);
                        class151.method1027(var17, -35);
                        class174.method1113(-2, 0, 1, var16.method1835((byte) 127), var16.method1835((byte) 127), 0, var16.field8009[0], true, var16.field8015[0]);
                    }
                }
                if (~var6 == -19) {
                    class280 var18 = class309.field4311[var7];
                    if (var18 != null) {
                        class269.field3848 = 0;
                        class382.field5463 = arg3;
                        ++class642.field8805;
                        class674.field9142 = 2;
                        class469.field6649 = arg1;
                        class519 var19 = class357.method2293(class427.field5994, class131.field1733, (byte) 94);
                        var19.field7384.method3694(class589.field8306.method1517(0, 82) ? 1 : 0, -1528071456);
                        var19.field7384.method3701(var7, (byte) -73);
                        class151.method1027(var19, -89);
                        class174.method1113(-2, 0, 1, var18.method1835((byte) 127), var18.method1835((byte) 127), 0, var18.field8009[0], true, var18.field8015[0]);
                    }
                }
                if (~var6 == -14) {
                    ++class170.field2329;
                    class382.field5463 = arg3;
                    class269.field3848 = 0;
                    class674.field9142 = 2;
                    class469.field6649 = arg1;
                    class519 var20 = class357.method2293(class427.field5994, class302.field4250, (byte) 66);
                    var20.field7384.method3701(var4 - -class228.field3063, (byte) -125);
                    var20.field7384.method3718((byte) 104, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                    var20.field7384.method3751((byte) -70, !class589.field8306.method1517(0, 82) ? 0 : 1);
                    var20.field7384.method3718((byte) 64, class3.field30 + var5);
                    class151.method1027(var20, -12);
                    class720.method4048(var5, var4, 108, var8);
                }
                if (var6 == 51) {
                    class269.field3848 = 0;
                    ++class700.field9771;
                    class469.field6649 = arg1;
                    class674.field9142 = 2;
                    class382.field5463 = arg3;
                    class519 var21 = class357.method2293(class427.field5994, class656.field8995, (byte) -54);
                    var21.field7384.method3745(-126, class114.field1379);
                    var21.field7384.method3709(1815869672, class504.field7234);
                    var21.field7384.method3709(1815869672, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    var21.field7384.method3745(-110, var5 - -class3.field30);
                    var21.field7384.method3724(class589.field8306.method1517(0, 82) ? 1 : 0, (byte) -125);
                    var21.field7384.method3733(-49, class58.field710);
                    var21.field7384.method3701(class228.field3063 + var4, (byte) -82);
                    class151.method1027(var21, -122);
                    class720.method4048(var5, var4, 122, var8);
                }
                if (~var6 == -26 || ~var6 == -1003) {
                    class481.method2872(var5, var7, var4, arg2.field470, (byte) 125);
                }
                if (var6 == 45) {
                    class469.field6649 = arg1;
                    class674.field9142 = 2;
                    class269.field3848 = 0;
                    class382.field5463 = arg3;
                    ++class587.field8272;
                    class519 var22 = class357.method2293(class427.field5994, class38.field479, (byte) 48);
                    var22.field7384.method3701(var4 - -class228.field3063, (byte) -72);
                    var22.field7384.method3709(1815869672, class3.field30 + var5);
                    var22.field7384.method3709(1815869672, var7);
                    var22.field7384.method3751((byte) -80, !class589.field8306.method1517(0, 82) ? 0 : 1);
                    class151.method1027(var22, -59);
                    class408.method2526(0, var4, var5);
                }
                if (var6 == 1008) {
                    class674.field9142 = 2;
                    class269.field3848 = 0;
                    class469.field6649 = arg1;
                    class382.field5463 = arg3;
                    class740 var23 = (class740) class373.field5230.method1180((byte) 26, (long) var7);
                    if (var23 != null) {
                        class468 var24 = var23.field10289;
                        class353 var25 = var24.field6632;
                        if (var25.field5026 != null) {
                            var25 = var25.method2273((byte) 29, class101.field1201);
                        }
                        if (var25 != null) {
                            ++class468.field6642;
                            class519 var26 = class357.method2293(class427.field5994, class133.field1952, (byte) -99);
                            var26.field7384.method3745(-113, var25.field4980);
                            class151.method1027(var26, -121);
                        }
                    }
                }
                if (var6 == 4) {
                    class740 var27 = (class740) class373.field5230.method1180((byte) 26, (long) var7);
                    if (var27 != null) {
                        ++class412.field5810;
                        class382.field5463 = arg3;
                        class469.field6649 = arg1;
                        class674.field9142 = 2;
                        class468 var28 = var27.field10289;
                        class269.field3848 = 0;
                        class519 var29 = class357.method2293(class427.field5994, class162.field2213, (byte) 104);
                        var29.field7384.method3724(class589.field8306.method1517(0, 82) ? 1 : 0, (byte) 14);
                        var29.field7384.method3745(-110, var7);
                        class151.method1027(var29, -17);
                        class174.method1113(-2, 0, 1, var28.method1835((byte) 127), var28.method1835((byte) 127), 0, var28.field8009[0], true, var28.field8015[0]);
                    }
                }
                if (~var6 == -61) {
                    class280 var30 = class309.field4311[var7];
                    if (var30 != null) {
                        class269.field3848 = 0;
                        class674.field9142 = 2;
                        class382.field5463 = arg3;
                        ++class169.field2301;
                        class469.field6649 = arg1;
                        class519 var31 = class357.method2293(class427.field5994, class711.field9890, (byte) -85);
                        var31.field7384.method3745(-124, var7);
                        var31.field7384.method3694(!class589.field8306.method1517(0, 82) ? 0 : 1, -1528071456);
                        class151.method1027(var31, -49);
                        class174.method1113(-2, 0, 1, var30.method1835((byte) 127), var30.method1835((byte) 127), 0, var30.field8009[0], true, var30.field8015[0]);
                    }
                }
                if (~var6 == -13 && class486.field6819 == null) {
                    class462.method2744(var4, var5, 2);
                    class486.field6819 = class323.method2083(var5, (byte) 43, var4);
                    class543.method3149(class486.field6819, 1);
                }
                if (var6 == 47) {
                    class674.field9142 = 2;
                    class269.field3848 = 0;
                    ++class124.field1503;
                    class382.field5463 = arg3;
                    class469.field6649 = arg1;
                    class519 var32 = class357.method2293(class427.field5994, class234.field3148, (byte) 120);
                    var32.field7384.method3701(var4 - -class228.field3063, (byte) -63);
                    var32.field7384.method3745(-122, var7);
                    var32.field7384.method3718((byte) 54, var5 - -class3.field30);
                    var32.field7384.method3751((byte) -113, !class589.field8306.method1517(0, 82) ? 0 : 1);
                    class151.method1027(var32, -73);
                    class408.method2526(0, var4, var5);
                }
                if (var6 == 30) {
                    class493 var33 = class323.method2083(var5, (byte) 109, var4);
                    if (var33 != null) {
                        class466.method2784(19192, var33);
                    }
                }
                if (var6 == 58) {
                    class269.field3848 = 0;
                    class674.field9142 = 2;
                    class469.field6649 = arg1;
                    ++class710.field9856;
                    class382.field5463 = arg3;
                    class519 var34 = class357.method2293(class427.field5994, class527.field7433, (byte) 56);
                    var34.field7384.method3701(class228.field3063 + var4, (byte) -48);
                    var34.field7384.method3701(class3.field30 + var5, (byte) -52);
                    var34.field7384.method3694(class589.field8306.method1517(0, 82) ? 1 : 0, -1528071456);
                    var34.field7384.method3701(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) -120);
                    class151.method1027(var34, -34);
                    class720.method4048(var5, var4, 110, var8);
                }
                if (~var6 == -45) {
                    class280 var35 = class309.field4311[var7];
                    if (var35 != null) {
                        class382.field5463 = arg3;
                        ++class655.field8987;
                        class269.field3848 = 0;
                        class469.field6649 = arg1;
                        class674.field9142 = 2;
                        class519 var36 = class357.method2293(class427.field5994, class408.field5784, (byte) 116);
                        var36.field7384.method3701(var7, (byte) -119);
                        var36.field7384.method3751((byte) -101, class589.field8306.method1517(0, 82) ? 1 : 0);
                        class151.method1027(var36, -126);
                        class174.method1113(-2, 0, 1, var35.method1835((byte) 127), var35.method1835((byte) 127), 0, var35.field8009[0], true, var35.field8015[0]);
                    }
                }
                if (~var6 == -10) {
                    class469.field6649 = arg1;
                    class382.field5463 = arg3;
                    class674.field9142 = 2;
                    class269.field3848 = 0;
                    ++class139.field2014;
                    class519 var37 = class357.method2293(class427.field5994, class289.field4079, (byte) -38);
                    var37.field7384.method3690(28, class58.field710);
                    var37.field7384.method3745(-123, class114.field1379);
                    var37.field7384.method3709(1815869672, var4 - -class228.field3063);
                    var37.field7384.method3701(class3.field30 + var5, (byte) -65);
                    var37.field7384.method3701(var7, (byte) -126);
                    var37.field7384.method3709(1815869672, class504.field7234);
                    var37.field7384.method3694(!class589.field8306.method1517(0, 82) ? 0 : 1, -1528071456);
                    class151.method1027(var37, -86);
                    class408.method2526(0, var4, var5);
                }
                if (~var6 == -51) {
                    class740 var38 = (class740) class373.field5230.method1180((byte) 26, (long) var7);
                    if (var38 != null) {
                        class674.field9142 = 2;
                        ++class174.field2353;
                        class382.field5463 = arg3;
                        class468 var39 = var38.field10289;
                        class469.field6649 = arg1;
                        class269.field3848 = 0;
                        class519 var40 = class357.method2293(class427.field5994, class203.field2654, (byte) 91);
                        var40.field7384.method3718((byte) 125, class114.field1379);
                        var40.field7384.method3749(class58.field710, (byte) -85);
                        var40.field7384.method3701(class504.field7234, (byte) -94);
                        var40.field7384.method3718((byte) 113, var7);
                        var40.field7384.method3702((byte) -5, class589.field8306.method1517(0, 82) ? 1 : 0);
                        class151.method1027(var40, -66);
                        class174.method1113(-2, 0, 1, var39.method1835((byte) 127), var39.method1835((byte) 127), 0, var39.field8009[0], true, var39.field8015[0]);
                    }
                }
                if (~var6 == -20) {
                    class382.field5463 = arg3;
                    class469.field6649 = arg1;
                    ++class498.field7150;
                    class269.field3848 = 0;
                    class674.field9142 = 2;
                    class519 var41 = class357.method2293(class427.field5994, class626.field8703, (byte) -57);
                    var41.field7384.method3701(class504.field7234, (byte) -114);
                    var41.field7384.method3709(1815869672, class114.field1379);
                    var41.field7384.method3718((byte) 61, class660.field9039.field7958);
                    var41.field7384.method3724(class589.field8306.method1517(0, 82) ? 1 : 0, (byte) -111);
                    var41.field7384.method3733(-49, class58.field710);
                    class151.method1027(var41, -126);
                }
                if (~var6 == -49) {
                    class740 var42 = (class740) class373.field5230.method1180((byte) 26, (long) var7);
                    if (var42 != null) {
                        class269.field3848 = 0;
                        class468 var43 = var42.field10289;
                        class674.field9142 = 2;
                        class382.field5463 = arg3;
                        class469.field6649 = arg1;
                        ++class471.field6688;
                        class519 var44 = class357.method2293(class427.field5994, class184.field2489, (byte) -42);
                        var44.field7384.method3724(!class589.field8306.method1517(0, 82) ? 0 : 1, (byte) 48);
                        var44.field7384.method3701(var7, (byte) -110);
                        class151.method1027(var44, -115);
                        class174.method1113(-2, 0, 1, var43.method1835((byte) 127), var43.method1835((byte) 127), 0, var43.field8009[0], true, var43.field8015[0]);
                    }
                }
                if (~var6 == -9) {
                    class469.field6649 = arg1;
                    class269.field3848 = 0;
                    class674.field9142 = 2;
                    class382.field5463 = arg3;
                    ++class412.field5816;
                    class519 var45 = class357.method2293(class427.field5994, class489.field6913, (byte) 57);
                    var45.field7384.method3709(1815869672, class228.field3063 + var4);
                    var45.field7384.method3701(class3.field30 + var5, (byte) -118);
                    var45.field7384.method3718((byte) 70, (int) (var8 >>> 32) & Integer.MAX_VALUE);
                    var45.field7384.method3724(!class589.field8306.method1517(0, 82) ? 0 : 1, (byte) 0);
                    class151.method1027(var45, -123);
                    class720.method4048(var5, var4, 125, var8);
                }
                if (var6 == 1001) {
                    class674.field9142 = 2;
                    ++class84.field1042;
                    class382.field5463 = arg3;
                    class469.field6649 = arg1;
                    class269.field3848 = 0;
                    class519 var46 = class357.method2293(class427.field5994, class725.field10117, (byte) 120);
                    var46.field7384.method3709(1815869672, class228.field3063 + var4);
                    var46.field7384.method3701((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) -66);
                    var46.field7384.method3702((byte) -5, !class589.field8306.method1517(0, 82) ? 0 : 1);
                    var46.field7384.method3701(class3.field30 + var5, (byte) -75);
                    class151.method1027(var46, -38);
                    class720.method4048(var5, var4, 102, var8);
                }
                if (~var6 == -17) {
                    class740 var47 = (class740) class373.field5230.method1180((byte) 26, (long) var7);
                    if (var47 != null) {
                        class269.field3848 = 0;
                        class468 var48 = var47.field10289;
                        class382.field5463 = arg3;
                        ++class110.field1338;
                        class469.field6649 = arg1;
                        class674.field9142 = 2;
                        class519 var49 = class357.method2293(class427.field5994, class617.field8624, (byte) 62);
                        var49.field7384.method3745(-125, var7);
                        var49.field7384.method3751((byte) -59, !class589.field8306.method1517(0, 82) ? 0 : 1);
                        class151.method1027(var49, -121);
                        class174.method1113(-2, 0, 1, var48.method1835((byte) 127), var48.method1835((byte) 127), 0, var48.field8009[0], true, var48.field8015[0]);
                    }
                }
                if (var6 == 17) {
                    class469.field6649 = arg1;
                    ++class692.field9524;
                    class269.field3848 = 0;
                    class382.field5463 = arg3;
                    class674.field9142 = 2;
                    class519 var50 = class357.method2293(class427.field5994, class349.field4937, (byte) 117);
                    var50.field7384.method3724(!class589.field8306.method1517(0, 82) ? 0 : 1, (byte) -111);
                    var50.field7384.method3745(-121, var4 - -class228.field3063);
                    var50.field7384.method3718((byte) 112, class3.field30 + var5);
                    var50.field7384.method3709(1815869672, var7);
                    class151.method1027(var50, -54);
                    class408.method2526(0, var4, var5);
                }
                if (var6 == 5) {
                    ++class734.field10234;
                    class469.field6649 = arg1;
                    class382.field5463 = arg3;
                    class674.field9142 = 1;
                    class269.field3848 = 0;
                    class519 var51 = class357.method2293(class427.field5994, class254.field3722, (byte) 88);
                    var51.field7384.method3745(-117, class504.field7234);
                    var51.field7384.method3745(-121, class3.field30 - -var5);
                    var51.field7384.method3718((byte) 74, class114.field1379);
                    var51.field7384.method3718((byte) 126, class228.field3063 + var4);
                    var51.field7384.method3749(class58.field710, (byte) -65);
                    class151.method1027(var51, -66);
                    class174.method1113(-4, 0, 1, 1, 1, 0, var4, true, var5);
                }
                if (~var6 == -1007) {
                    class469.field6649 = arg1;
                    class674.field9142 = 2;
                    class382.field5463 = arg3;
                    class269.field3848 = 0;
                    ++class110.field1356;
                    class519 var52 = class357.method2293(class427.field5994, class23.field330, (byte) 84);
                    var52.field7384.method3745(-128, var7);
                    class151.method1027(var52, -12);
                }
                if (var6 == 22) {
                    class280 var53 = class309.field4311[var7];
                    if (var53 != null) {
                        ++class548.field7643;
                        class469.field6649 = arg1;
                        class382.field5463 = arg3;
                        class269.field3848 = 0;
                        class674.field9142 = 2;
                        class519 var54 = class357.method2293(class427.field5994, class286.field4057, (byte) -21);
                        var54.field7384.method3701(var7, (byte) -57);
                        var54.field7384.method3694(class589.field8306.method1517(0, 82) ? 1 : 0, -1528071456);
                        class151.method1027(var54, -48);
                        class174.method1113(-2, 0, 1, var53.method1835((byte) 127), var53.method1835((byte) 127), 0, var53.field8009[0], true, var53.field8015[0]);
                    }
                }
                if (~var6 == -22) {
                    if (class399.field5645 > 0 && class589.field8306.method1517(0, 82) && class589.field8306.method1517(0, 81)) {
                        class688.method3846(class3.field30 + var5, -86, class228.field3063 + var4, class660.field9039.field1266);
                    } else {
                        class519 var55 = class182.method1150(-58, var4, var5, var7);
                        if (~var7 == -2) {
                            var55.field7384.method3694(-1, -1528071456);
                            var55.field7384.method3694(-1, -1528071456);
                            var55.field7384.method3745(-126, (int) class552.field7773);
                            var55.field7384.method3694(57, -1528071456);
                            var55.field7384.method3694(class535.field7520, -1528071456);
                            var55.field7384.method3694(class180.field2412, -1528071456);
                            var55.field7384.method3694(89, -1528071456);
                            var55.field7384.method3745(-118, class660.field9039.field1264);
                            var55.field7384.method3745(-122, class660.field9039.field1250);
                            var55.field7384.method3694(63, -1528071456);
                        } else {
                            class469.field6649 = arg1;
                            class674.field9142 = 1;
                            class382.field5463 = arg3;
                            class269.field3848 = 0;
                        }
                        class151.method1027(var55, -7);
                        class174.method1113(-4, 0, 1, 1, 1, 0, var4, true, var5);
                    }
                }
                if (var6 == 11) {
                    if (~class399.field5645 < -1 && class589.field8306.method1517(0, 82) && class589.field8306.method1517(0, 81)) {
                        class688.method3846(class3.field30 + var5, -85, class228.field3063 + var4, class660.field9039.field1266);
                    } else {
                        class269.field3848 = 0;
                        class674.field9142 = 1;
                        class469.field6649 = arg1;
                        class382.field5463 = arg3;
                        ++class144.field2055;
                        class519 var56 = class357.method2293(class427.field5994, class402.field5701, (byte) -73);
                        var56.field7384.method3709(1815869672, class3.field30 + var5);
                        var56.field7384.method3701(class228.field3063 + var4, (byte) -123);
                        class151.method1027(var56, -7);
                    }
                }
                if (var6 == 10) {
                    class469.field6649 = arg1;
                    class382.field5463 = arg3;
                    class674.field9142 = 2;
                    ++class677.field9259;
                    class269.field3848 = 0;
                    class519 var57 = class357.method2293(class427.field5994, class131.field1783, (byte) 54);
                    var57.field7384.method3701(class3.field30 + var5, (byte) -78);
                    var57.field7384.method3694(!class589.field8306.method1517(0, 82) ? 0 : 1, -1528071456);
                    var57.field7384.method3709(1815869672, var7);
                    var57.field7384.method3709(1815869672, var4 - -class228.field3063);
                    class151.method1027(var57, -24);
                    class408.method2526(0, var4, var5);
                }
                if (var6 == 1004) {
                    class382.field5463 = arg3;
                    class469.field6649 = arg1;
                    class269.field3848 = 0;
                    class674.field9142 = 2;
                    ++class194.field2589;
                    class519 var58 = class357.method2293(class427.field5994, class84.field1046, (byte) 73);
                    var58.field7384.method3745(-124, var7);
                    class151.method1027(var58, -128);
                }
                if (var6 == 46) {
                    class280 var59 = class309.field4311[var7];
                    if (var59 != null) {
                        class382.field5463 = arg3;
                        class269.field3848 = 0;
                        ++class472.field6697;
                        class674.field9142 = 2;
                        class469.field6649 = arg1;
                        class519 var60 = class357.method2293(class427.field5994, class471.field6692, (byte) -47);
                        var60.field7384.method3701(var7, (byte) -55);
                        var60.field7384.method3702((byte) -5, !class589.field8306.method1517(0, 82) ? 0 : 1);
                        class151.method1027(var60, -64);
                        class174.method1113(-2, 0, 1, var59.method1835((byte) 127), var59.method1835((byte) 127), 0, var59.field8009[0], true, var59.field8015[0]);
                    }
                }
                if (var6 == 1010 || var6 == 1007 || var6 == 1003 || var6 == 1009 || ~var6 == -1013) {
                    class309.method2012(var4, var7, var6, false);
                }
                if (~var6 == -21) {
                    class280 var61 = class309.field4311[var7];
                    if (var61 != null) {
                        ++class388.field5486;
                        class674.field9142 = 2;
                        class269.field3848 = 0;
                        class382.field5463 = arg3;
                        class469.field6649 = arg1;
                        class519 var62 = class357.method2293(class427.field5994, client.field4223, (byte) 76);
                        var62.field7384.method3751((byte) -14, !class589.field8306.method1517(0, 82) ? 0 : 1);
                        var62.field7384.method3701(var7, (byte) -112);
                        class151.method1027(var62, -45);
                        class174.method1113(-2, 0, 1, var61.method1835((byte) 127), var61.method1835((byte) 127), 0, var61.field8009[0], true, var61.field8015[0]);
                    }
                }
                if (~var6 == -4) {
                    class674.field9142 = 2;
                    ++class1.field5;
                    class469.field6649 = arg1;
                    class382.field5463 = arg3;
                    class269.field3848 = 0;
                    class519 var63 = class357.method2293(class427.field5994, class579.field8171, (byte) 110);
                    var63.field7384.method3709(1815869672, class228.field3063 + var4);
                    var63.field7384.method3709(1815869672, class3.field30 + var5);
                    var63.field7384.method3702((byte) -5, !class589.field8306.method1517(0, 82) ? 0 : 1);
                    var63.field7384.method3709(1815869672, Integer.MAX_VALUE & (int) (var8 >>> 32));
                    class151.method1027(var63, -115);
                    class720.method4048(var5, var4, 126, var8);
                }
                if (~var6 == -7) {
                    class280 var64 = class309.field4311[var7];
                    if (var64 != null) {
                        class469.field6649 = arg1;
                        class674.field9142 = 2;
                        class382.field5463 = arg3;
                        class269.field3848 = 0;
                        ++class118.field1430;
                        class519 var65 = class357.method2293(class427.field5994, class322.field4449, (byte) 55);
                        var65.field7384.method3745(-118, var7);
                        var65.field7384.method3724(class589.field8306.method1517(0, 82) ? 1 : 0, (byte) -122);
                        class151.method1027(var65, -102);
                        class174.method1113(-2, 0, 1, var64.method1835((byte) 127), var64.method1835((byte) 127), 0, var64.field8009[0], true, var64.field8015[0]);
                    }
                }
                if (~var6 == -50) {
                    class740 var66 = (class740) class373.field5230.method1180((byte) 26, (long) var7);
                    if (var66 != null) {
                        ++class235.field3163;
                        class674.field9142 = 2;
                        class269.field3848 = 0;
                        class469.field6649 = arg1;
                        class382.field5463 = arg3;
                        class468 var67 = var66.field10289;
                        class519 var68 = class357.method2293(class427.field5994, class455.field6421, (byte) -44);
                        var68.field7384.method3718((byte) 60, var7);
                        var68.field7384.method3751((byte) -65, !class589.field8306.method1517(0, 82) ? 0 : 1);
                        class151.method1027(var68, -113);
                        class174.method1113(-2, 0, 1, var67.method1835((byte) 127), var67.method1835((byte) 127), 0, var67.field8009[0], true, var67.field8015[0]);
                    }
                }
                if (~var6 == -16) {
                    class493 var69 = class323.method2083(var5, (byte) 26, var4);
                    if (var69 != null) {
                        class37.method210(-1);
                        class477 var70 = client.method1950(var69);
                        class243.method1556(var70.method2855(false), var70.field6772, var69, true);
                        class291.field4101 = class713.method4011(var69, -10402);
                        class701.field9774 = var69.field6991 + "<col=ffffff>";
                        if (class291.field4101 == null) {
                            class291.field4101 = "Null";
                        }
                    }
                } else {
                    if (class124.field1491) {
                        class37.method210(-1);
                    }
                    if (class125.field1521 != null && class53.field605 == 0) {
                        class543.method3149(class125.field1521, 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field2742 = null;
        field2755 = null;
        field2754 = null;
        field2756 = null;
        int var1 = 107 / ((arg0 - -37) / 48);
        field2757 = null;
    }

    @OriginalMember(owner = "client!eq", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2747;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
    private final synchronized void method1279(boolean arg0) {
        ++field2743;
        if (this.field2748 != null) {
            this.field2748.setPixels(0, 0, super.field8351, super.field8355, this.field2744, super.field8349, 0, super.field8351);
            this.field2748.imageComplete(2);
            if (!arg0) {
                this.field2741 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIIIILjava/awt/Graphics;)V")
    public final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Graphics arg7) {
        int var9 = 117 % ((16 - arg3) / 62);
        this.method1282(arg0, arg5, arg6, 24613, arg2);
        ++field2746;
        Shape var10 = arg7.getClip();
        arg7.clipRect(arg1, arg4, arg2, arg0);
        arg7.drawImage(this.field2739, -arg6 + arg1, -arg5 + arg4, this.field2741);
        arg7.setClip(var10);
    }

    @OriginalMember(owner = "client!eq", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2738;
        return this.field2748 == arg0;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIZLjava/awt/Canvas;)V")
    public final void method1281(int arg0, int arg1, boolean arg2, Canvas arg3) {
        this.field2741 = arg3;
        super.field8355 = arg0;
        super.field8351 = arg1;
        ++field2745;
        super.field8349 = new int[super.field8355 * super.field8351];
        this.field2744 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2739 = this.field2741.createImage(this);
        this.method1279(true);
        this.field2741.prepareImage(this.field2739, this.field2741);
        this.method1279(true);
        this.field2741.prepareImage(this.field2739, this.field2741);
        this.method1279(!arg2);
        this.field2741.prepareImage(this.field2739, this.field2741);
        if (arg2) {
            this.method1279(false);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2751;
        if (this.field2748 != null) {
            if (arg3 == 24613) {
                this.field2748.setPixels(arg2, arg1, arg4, arg0, this.field2744, super.field8349, super.field8351 * arg1 + arg2, super.field8351);
                this.field2748.imageComplete(2);
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2750;
        if (this.field2748 == arg0) {
            this.field2748 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lhba;IILkd;IIILvaa;)V")
    public static final void method1283(class10 arg0, int arg1, int arg2, class280 arg3, int arg4, int arg5, int arg6, class468 arg7) {
        ++field2753;
        class231 var8 = new class231();
        var8.field3116 = arg4;
        int var9 = 83 / ((-24 - arg6) / 35);
        var8.field3121 = arg5 << 9;
        var8.field3107 = arg1 << 9;
        if (arg0 == null) {
            if (arg7 != null) {
                var8.field3137 = arg7;
                class353 var10 = arg7.field6632;
                if (var10.field5026 != null) {
                    var8.field3124 = true;
                    var10 = var10.method2273((byte) 29, class101.field1201);
                }
                if (var10 != null) {
                    var8.field3112 = var10.field5051 + arg5 << 9;
                    var8.field3125 = var10.field5051 + arg1 << 9;
                    var8.field3135 = class153.method1035((byte) -74, arg7);
                    var8.field3114 = var10.field4999 << 9;
                    var8.field3128 = var10.field5003;
                    var8.field3127 = var10.field5012;
                    var8.field3119 = var10.field5011;
                    var8.field3129 = var10.field5010;
                }
                class234.field3152.method2770((byte) -13, var8);
                return;
            }
            if (arg3 != null) {
                var8.field3134 = arg3;
                var8.field3112 = arg3.method1835((byte) 127) + arg5 << 9;
                var8.field3125 = arg1 - -arg3.method1835((byte) 127) << 9;
                var8.field3135 = class243.method1552(arg3, -23426);
                var8.field3129 = arg3.field3959;
                var8.field3114 = arg3.field3948 << 9;
                var8.field3127 = arg3.field3971;
                var8.field3119 = 256;
                var8.field3128 = 256;
                class402.field5703.method1179((long) arg3.field7958, var8, (byte) -26);
                return;
            }
        } else {
            var8.field3133 = arg0;
            int var11 = arg0.field225;
            int var12 = arg0.field230;
            if (arg2 == 1 || ~arg2 == -4) {
                var11 = arg0.field230;
                var12 = arg0.field225;
            }
            var8.field3129 = arg0.field152;
            var8.field3115 = arg0.field211;
            var8.field3119 = arg0.field141;
            var8.field3126 = arg0.field146;
            var8.field3113 = arg0.field160;
            var8.field3125 = arg1 - -var12 << 9;
            var8.field3114 = arg0.field232 << 9;
            var8.field3112 = arg5 + var11 << 9;
            var8.field3109 = arg0.field174;
            var8.field3127 = arg0.field156;
            var8.field3128 = arg0.field194;
            var8.field3135 = arg0.field223;
            if (arg0.field226 != null) {
                var8.field3124 = true;
                var8.method1496(43);
            }
            if (var8.field3109 != null) {
                var8.field3120 = (int) (Math.random() * (double) (-var8.field3113 + var8.field3115)) + var8.field3113;
            }
            class35.field445.method2770((byte) -13, var8);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lkba;Z[[[BIB)Z")
    public static final boolean method1284(class105 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class317.field4405) {
            return false;
        } else {
            int var5 = arg0.field1264 >> class660.field9038;
            int var6 = var5;
            int var7 = arg0.field1250 >> class660.field9038;
            int var8 = var7;
            if (arg0 instanceof class524) {
                var6 = ((class524) arg0).field7413;
                var8 = ((class524) arg0).field7409;
                var5 = ((class524) arg0).field7415;
                var7 = ((class524) arg0).field7418;
            }
            for (int var9 = var5; var9 <= var6; ++var9) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (arg0.field1258 < class634.field8744 && var9 >= class24.field338 && var9 < class28.field373 && var10 >= class513.field7322 && var10 < class6.field76) {
                        if ((arg2 == null || arg0.field1266 < arg3 || arg2[arg0.field1266][var9][var10] != arg4) && arg0.method617(-21499) && !arg0.method611(-113)) {
                            return false;
                        }
                        if (!arg1 && var9 >= class136.field1982 - 16 && var9 <= class136.field1982 + 16 && var10 >= class481.field6801 - 16 && var10 <= class481.field6801 + 16) {
                            if (class661.field9049) {
                                class668.field9078[class378.field5384++].method2266(arg0, 8192);
                                class378.field5384 %= class470.field6674;
                            } else {
                                arg0.method753((byte) -119, class362.field5135);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!eq", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field2748 = arg0;
        ++field2749;
        arg0.setDimensions(super.field8351, super.field8355);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2744);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!eq", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2752;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if ((var1 & 1) == 1) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field2754[var0] = var1;
        }
        field2755 = "";
        field2756 = new class13("LOCAL", 4);
    }
}
