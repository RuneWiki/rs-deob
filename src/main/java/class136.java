import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 extends class99 {

    @OriginalMember(owner = "client!td", name = "C", descriptor = "Lr;")
    private static class118 field3068 = class153.method1136(115, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Lr;")
    public static class118 field3063 = class153.method1136(87, "swe");

    @OriginalMember(owner = "client!td", name = "N", descriptor = "[B")
    public static byte[] field3078 = new byte[520];

    @OriginalMember(owner = "client!td", name = "L", descriptor = "Lr;")
    public static class118 field3076 = field3068;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "Lr;")
    private static class118 field3070 = class153.method1136(77, "No response from server)3");

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3079 = 1;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "Lr;")
    public static class118 field3084 = field3070;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "Lge;")
    public static class47 field3082 = new class47(128);

    @OriginalMember(owner = "client!td", name = "U", descriptor = "Lr;")
    public static class118 field3085 = class153.method1136(123, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!td", name = "X", descriptor = "[I")
    public static int[] field3088 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "Lr;")
    public static class118 field3089 = class153.method1136(115, " loggt sich aus)3");

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public int field3083;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "Lr;")
    public class118 field3081;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "Lbc;")
    public static class11 field3090;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Lff;")
    public static class42 field3069;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Lke;")
    public class74 field3071;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "Lke;")
    public class74 field3077;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "Lke;")
    public static class74 field3086;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "[Lvd;")
    public static class150[] field3091;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "[Ljava/lang/Object;")
    public Object[] field3067;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILt;II)V")
    public static final void method1029(int arg0, class132 arg1, int arg2, int arg3) {
        if ((arg2 & 0x40) != 0) {
            int var4 = class53.field1253.method803(-124);
            int var5 = class53.field1253.method789((byte) -128);
            arg1.method252(var4, arg3 - 26892, class65.field1479, var5);
            arg1.field776 = class65.field1479 + 300;
            arg1.field743 = class53.field1253.method803(-111);
            arg1.field727 = class53.field1253.method789((byte) -119);
        }
        if ((arg2 & 0x20) != 0) {
            int var6 = class53.field1253.method797(119);
            int var7 = class53.field1253.method803(-118);
            int var8 = class53.field1253.method831((byte) 76);
            int var9 = class53.field1253.field2404;
            if (arg1.field2996 != null && arg1.field2993 != null) {
                boolean var10 = false;
                long var11 = arg1.field2996.method925(0);
                if (var7 <= 1) {
                    for (int var13 = 0; var13 < class134.field3055; var13++) {
                        if (class75.field1848[var13] == var11) {
                            var10 = true;
                            break;
                        }
                    }
                }
                if (!var10 && class9.field193 == 0) {
                    class101.field2336.field2404 = 0;
                    class53.field1253.method827((byte) 122, var8, 0, class101.field2336.field2405);
                    class101.field2336.field2404 = 0;
                    class118 var14 = class8.method59(class47.method389(arg3 ^ 0xFFFFE2D9, class101.field2336).method939((byte) 121));
                    arg1.field709 = var14.method918(false);
                    arg1.field773 = 150;
                    arg1.field740 = var6 >> 8;
                    arg1.field771 = var6 & 0xFF;
                    if (var7 == 2 || var7 == 3) {
                        class103.method786(class144.method1066(true, new class118[] { class80.field1931, arg1.field2996 }), var14, 1, (byte) -126);
                    } else if (var7 == 1) {
                        class103.method786(class144.method1066(true, new class118[] { class141.field3195, arg1.field2996 }), var14, 1, (byte) -128);
                    } else {
                        class103.method786(arg1.field2996, var14, 2, (byte) -127);
                    }
                }
            }
            class53.field1253.field2404 = var8 + var9;
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field735 = class53.field1253.method797(109);
            int var15 = class53.field1253.method834(121);
            arg1.field745 = (var15 & 0xFFFF) + class65.field1479;
            if (arg1.field735 == 65535) {
                arg1.field735 = -1;
            }
            arg1.field770 = var15 >> 16;
            arg1.field738 = 0;
            arg1.field782 = 0;
            if (arg1.field745 > class65.field1479) {
                arg1.field782 = -1;
            }
        }
        if (arg3 != 4390) {
            method1029(8, null, -73, -1);
        }
        if ((arg2 & 0x400) != 0) {
            int var16 = class53.field1253.method823(arg3 ^ 0x5764);
            int var17 = class53.field1253.method803(-116);
            arg1.method252(var16, -22502, class65.field1479, var17);
            arg1.field776 = class65.field1479 + 300;
            arg1.field743 = class53.field1253.method789((byte) -119);
            arg1.field727 = class53.field1253.method823(17986);
        }
        field3073++;
        if ((arg2 & 0x2) != 0) {
            arg1.field731 = class53.field1253.method797(arg3 - 4263);
            if (arg1.field731 == 65535) {
                arg1.field731 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field728 = class53.field1253.method789((byte) -72);
            arg1.field732 = class53.field1253.method831((byte) 76);
            arg1.field720 = class53.field1253.method789((byte) -123);
            arg1.field723 = class53.field1253.method789((byte) -103);
            arg1.field758 = class53.field1253.method838((byte) 5) + class65.field1479;
            arg1.field748 = class53.field1253.method832(-4206) + class65.field1479;
            arg1.field774 = class53.field1253.method831((byte) 76);
            arg1.field713 = 0;
            arg1.field726 = 1;
        }
        if ((arg2 & 0x1) != 0) {
            arg1.field709 = class53.field1253.method810(1347010600);
            if (arg1.field709.method916(-24853, 0) == 126) {
                arg1.field709 = arg1.field709.method926(1, (byte) 117);
                class103.method786(arg1.field2996, arg1.field709, 2, (byte) -126);
            } else if (class89.field2150 == arg1) {
                class103.method786(arg1.field2996, arg1.field709, 2, (byte) -126);
            }
            arg1.field771 = 0;
            arg1.field773 = 150;
            arg1.field740 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            int var18 = class53.field1253.method832(-4206);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class53.field1253.method803(-116);
            class32.method270(var18, -5063, arg1, var19);
        }
        if ((arg2 & 0x10) != 0) {
            int var20 = class53.field1253.method831((byte) 76);
            byte[] var21 = new byte[var20];
            class105 var22 = new class105(var21);
            class53.field1253.method796(0, var21, var20, (byte) 124);
            class44.field1052[arg0] = var22;
            arg1.method1021(-1, var22);
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field780 = class53.field1253.method819(false);
            arg1.field772 = class53.field1253.method838((byte) 5);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lff;I)V")
    public static final void method1030(class42 arg0, int arg1) {
        field3075++;
        class128.field2947 = arg0;
        if (arg1 >= -40) {
            field3079 = 121;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljf;IILjc;)V")
    public static final void method1031(class68 arg0, int arg1, int arg2, class65 arg3) {
        class34 var4 = new class34();
        var4.field862 = 1;
        if (arg1 > -23) {
            return;
        }
        var4.field2295 = arg2;
        var4.field865 = arg3;
        var4.field863 = arg0;
        class113 var5 = class62.field1432;
        synchronized (class62.field1432) {
            class62.field1432.method883(var4, -26866);
        }
        field3064++;
        class95.method749((byte) -111);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static void method1032(int arg0) {
        field3091 = null;
        field3082 = null;
        field3084 = null;
        field3076 = null;
        field3078 = null;
        field3068 = null;
        field3070 = null;
        field3085 = null;
        field3089 = null;
        field3088 = null;
        field3086 = null;
        int var1 = -23 % ((arg0 + 38) / 58);
        field3090 = null;
        field3063 = null;
        field3069 = null;
    }
}
