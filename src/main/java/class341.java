import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class341 {

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Z")
    public boolean field5291 = false;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5289 = "wave:";

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Z")
    public static boolean field5299 = false;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "F")
    public static float field5303;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field5293;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public int field5295;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public int field5304;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "J")
    public long field5292;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lfc;")
    public class110 field5305;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLwm;)Lua;", line = 11)
    public static final class304 method2366(byte arg0, class254 arg1) {
        arg1.method1774((byte) 89);
        int var2 = arg1.method1774((byte) 4);
        field5293++;
        class304 var3 = class251.method1718((byte) -94, var2);
        var3.field4659 = arg1.method1774((byte) 96);
        int var4 = arg1.method1774((byte) -127);
        int var5 = 0;
        if (arg0 < 124) {
            return (class304) null;
        }
        while (var4 > var5) {
            int var6 = arg1.method1774((byte) 25);
            var3.method69(arg1, var6, -2828);
            var5++;
        }
        var3.method100(true);
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V", line = 44)
    public static final void method2367(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class139.field2093 == 1) {
            class170.field2754[class89.field1268 / 100].method124(class111.field1683 - 8, class223.field3406 + -8);
        }
        if (class139.field2093 == 2) {
            class170.field2754[class89.field1268 / 100 + 4].method124(class111.field1683 - 8, class223.field3406 + -8);
        }
        field5297++;
        if (arg0 == 4) {
            class238.method1658((byte) 106);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Loe;B)V", line = 76)
    public static final void method2368(class82 arg0, byte arg1) {
        field5294++;
        if (arg1 == -62) {
            class318.field4918 = arg0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 92)
    public static void method2369(int arg0) {
        int var1 = 21 % ((arg0 + 13) / 48);
        field5289 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 101)
    public static final void method2370(int arg0) {
        field5300++;
        if (arg0 != 2047) {
            method2367(-10, 43, 13, 53, 114);
        }
        class36.field517.method752(false);
        class71.field1018.method752(false);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 130)
    public static final void method2371(byte arg0) {
        field5301++;
        int var1 = class32.field396 * 128 + 64;
        int var2 = class106.field1538 * 128 + 64;
        int var3 = class328.method2291(class265.field4112, var2, var1, 88) - class235.field3583;
        if (class225.field3444 >= 100) {
            class190.field2976 = class32.field396 * 128 + 64;
            class197.field3028 = class106.field1538 * 128 + 64;
            class7.field111 = class328.method2291(class265.field4112, class197.field3028, class190.field2976, 100) - class235.field3583;
        } else {
            if (class7.field111 < var3) {
                class7.field111 += (var3 - class7.field111) * class225.field3444 / 1000 + class174.field2792;
                if (class7.field111 > var3) {
                    class7.field111 = var3;
                }
            }
            if (class190.field2976 < var1) {
                class190.field2976 += (var1 - class190.field2976) * class225.field3444 / 1000 + class174.field2792;
                if (class190.field2976 > var1) {
                    class190.field2976 = var1;
                }
            }
            if (var1 < class190.field2976) {
                class190.field2976 -= (class190.field2976 - var1) * class225.field3444 / 1000 + class174.field2792;
                if (var1 > class190.field2976) {
                    class190.field2976 = var1;
                }
            }
            if (class197.field3028 < var2) {
                class197.field3028 += class174.field2792 + ((var2 - class197.field3028) * class225.field3444 / 1000);
                if (var2 < class197.field3028) {
                    class197.field3028 = var2;
                }
            }
            if (var2 < class197.field3028) {
                class197.field3028 -= (class197.field3028 - var2) * class225.field3444 / 1000 + class174.field2792;
                if (class197.field3028 < var2) {
                    class197.field3028 = var2;
                }
            }
            if (var3 < class7.field111) {
                class7.field111 -= (class7.field111 - var3) * class225.field3444 / 1000 + class174.field2792;
                if (var3 > class7.field111) {
                    class7.field111 = var3;
                }
            }
        }
        int var4 = class151.field2296 * 128 + 64;
        int var5 = class167.field2704 * 128 + 64;
        int var6 = class328.method2291(class265.field4112, var4, var5, 103) - class298.field4591;
        int var7 = var5 - class190.field2976;
        int var8 = var6 - class7.field111;
        int var9 = var4 - class197.field3028;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class200.field3047;
        if (var11 > class193.field3015) {
            class193.field3015 += (var11 - class193.field3015) * class269.field4181 / 1000 + class273.field4265;
            if (var11 < class193.field3015) {
                class193.field3015 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class193.field3015 > var11) {
            class193.field3015 -= class273.field4265 + ((class193.field3015 - var11) * class269.field4181 / 1000);
            if (class193.field3015 < var11) {
                class193.field3015 = var11;
            }
        }
        if (arg0 < 105) {
            method2368((class82) null, (byte) 106);
        }
        if (var13 > 0) {
            class200.field3047 += class273.field4265 + (class269.field4181 * var13 / 1000);
            class200.field3047 &= 0x7FF;
        }
        if (var13 < 0) {
            class200.field3047 -= -var13 * class269.field4181 / 1000 + class273.field4265;
            class200.field3047 &= 0x7FF;
        }
        int var14 = var12 - class200.field3047;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class200.field3047 = var12;
        }
    }
}
