import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class106 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field2026 = 1;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Led;")
    private static class43 field2030 = class191.method1219("Service unavailable)3", false);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Led;")
    public static class43 field2027 = field2030;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Ltd;")
    public static class176 field2032 = new class176(30);

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Led;")
    public static class43 field2033 = class191.method1219("Benutzen Sie die (WPasswort -=ndern(W Option", false);

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method657(int arg0) {
        if (arg0 > -111) {
            field2033 = null;
        }
        field2033 = null;
        field2030 = null;
        field2027 = null;
        field2032 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILed;Led;Lga;)[Lnb;")
    public static final class120[] method658(int arg0, class43 arg1, class43 arg2, class58 arg3) {
        if (arg0 == -11889) {
            int var4 = arg3.method347(arg1, (byte) -101);
            field2031++;
            int var5 = arg3.method362(arg2, (byte) -47, var4);
            return class18.method87(arg3, (byte) -114, var4, var5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static final void method659(int arg0) {
        field2025++;
        int var1 = class132.field2762 * 128 + 64;
        int var2 = class30.field572 * 128 + 64;
        int var3 = class108.method668(var2, var1, arg0 ^ 0xFFFFDB3D, class93.field1839) - class101.field1937;
        if (class188.field3686 < var2) {
            class188.field3686 += (var2 - class188.field3686) * class193.field3756 / 1000 + class176.field3497;
            if (var2 < class188.field3686) {
                class188.field3686 = var2;
            }
        }
        if (var2 < class188.field3686) {
            class188.field3686 -= (class188.field3686 - var2) * class193.field3756 / 1000 + class176.field3497;
            if (var2 > class188.field3686) {
                class188.field3686 = var2;
            }
        }
        if (var1 > class184.field3617) {
            class184.field3617 += class176.field3497 + (var1 - class184.field3617) * class193.field3756 / 1000;
            if (var1 < class184.field3617) {
                class184.field3617 = var1;
            }
        }
        if (var3 > class185.field3647) {
            class185.field3647 += class176.field3497 + (var3 - class185.field3647) * class193.field3756 / 1000;
            if (var3 < class185.field3647) {
                class185.field3647 = var3;
            }
        }
        if (var3 < class185.field3647) {
            class185.field3647 -= (class185.field3647 - var3) * class193.field3756 / 1000 + class176.field3497;
            if (class185.field3647 < var3) {
                class185.field3647 = var3;
            }
        }
        int var4 = class24.field458 * 128 + 64;
        if (class184.field3617 > var1) {
            class184.field3617 -= class176.field3497 + (class184.field3617 - var1) * class193.field3756 / 1000;
            if (var1 > class184.field3617) {
                class184.field3617 = var1;
            }
        }
        int var5 = class203.field3966 * 128 + 64;
        int var6 = class108.method668(var4, var5, arg0 ^ 0xFFFFDB3C, class93.field1839) - class102.field1947;
        int var7 = var6 - class185.field3647;
        int var8 = var4 - class188.field3686;
        int var9 = var5 - class184.field3617;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var8)) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class51.field1034) {
            class51.field1034 += class150.field3036 + (var11 - class51.field1034) * class13.field191 / 1000;
            if (var11 < class51.field1034) {
                class51.field1034 = var11;
            }
        }
        int var13 = var12 - class32.field591;
        if (var11 < class51.field1034) {
            class51.field1034 -= (class51.field1034 - var11) * class13.field191 / 1000 + class150.field3036;
            if (class51.field1034 < var11) {
                class51.field1034 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class32.field591 += class13.field191 * var13 / 1000 + class150.field3036;
            class32.field591 &= 0x7FF;
        }
        if (arg0 != 9405) {
            method658(13, null, null, null);
        }
        if (var13 < 0) {
            class32.field591 -= -var13 * class13.field191 / 1000 + class150.field3036;
            class32.field591 &= 0x7FF;
        }
        int var14 = var12 - class32.field591;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class32.field591 = var12;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Lch;")
    public static final class29 method660(int arg0, int arg1) {
        field2028++;
        class29 var2 = (class29) class57.field1123.method1106(100, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class166.field3288.method367(1, arg0, (byte) -34);
        class29 var4 = new class29();
        if (var3 != null) {
            var4.method146(new class89(var3), arg0, (byte) 126);
        }
        class57.field1123.method1107((long) arg0, var4, -110);
        return arg1 == -31992 ? var4 : null;
    }
}
