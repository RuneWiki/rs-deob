import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public abstract class class104 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Ljd;")
    public static class92 field2137 = class202.method1325((byte) 90, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Ljd;")
    private static class92 field2136 = class202.method1325((byte) 90, "The server is being updated)3");

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Ljd;")
    public static class92 field2139 = class202.method1325((byte) 90, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Ljd;")
    public static class92 field2134 = class202.method1325((byte) 90, "Untersuchen");

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Ljd;")
    public static class92 field2143 = class202.method1325((byte) 90, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Ljd;")
    public static class92 field2138 = field2136;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
    public static int[] field2140;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([BI)V")
    public abstract void method710(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)I")
    public static final int method711(int arg0, byte arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        field2142++;
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 < 122) {
            return -121;
        } else {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)[B")
    public abstract byte[] method712(int arg0);

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static final void method713(int arg0) {
        class3.method21(arg0 ^ 0xFFFF97B1, class6.field298);
        field2135++;
        class197.field3842++;
        if (class189.field3603 && class15.field424) {
            int var1 = class192.field3756;
            int var2 = class29.field641;
            int var3 = var2 - class157.field3118;
            int var4 = var1 - class143.field2853;
            if (var4 < class97.field1977) {
                var4 = class97.field1977;
            }
            if (class97.field1977 + client.field687.field28 < class6.field298.field28 + var4) {
                var4 = class97.field1977 + client.field687.field28 - class6.field298.field28;
            }
            int var5 = var4 - class31.field708;
            int var6 = client.field687.field48 + var4 - class97.field1977;
            if (class159.field3171 > var3) {
                var3 = class159.field3171;
            }
            int var7 = class6.field298.field62;
            if (var3 + class6.field298.field96 > class159.field3171 - -client.field687.field96) {
                var3 = class159.field3171 + client.field687.field96 - class6.field298.field96;
            }
            int var8 = var3 - class4.field266;
            if (arg0 != -1) {
                method711(-4, (byte) -94);
            }
            if (class6.field298.field18 < class197.field3842 && (var8 > var7 || -var7 > var8 || var5 > var7 || var5 < -var7)) {
                class35.field804 = true;
            }
            int var9 = var3 + client.field687.field24 - class159.field3171;
            if (class6.field298.field91 != null && class35.field804) {
                class156 var10 = new class156();
                var10.field3103 = class6.field298;
                var10.field3107 = var9;
                var10.field3102 = var6;
                var10.field3108 = class6.field298.field91;
                class2.method18(var10, 6645);
            }
            if (class202.field3923 == 0) {
                if (class35.field804) {
                    if (class6.field298.field77 != null) {
                        class156 var11 = new class156();
                        var11.field3103 = class6.field298;
                        var11.field3107 = var9;
                        var11.field3108 = class6.field298.field77;
                        var11.field3097 = class205.field3941;
                        var11.field3102 = var6;
                        class2.method18(var11, arg0 ^ 0xFFFFE60A);
                    }
                    if (class205.field3941 != null && class209.method1359(class6.field298, arg0 ^ 0x2F12) != null) {
                        class99.field2000.method405(84, 7);
                        class43.field949++;
                        class99.field2000.method438(class6.field298.field100, arg0 + 60);
                        class99.field2000.method446(class205.field3941.field100, -26751);
                        class99.field2000.method464(1361896040, class6.field298.field90);
                        class99.field2000.method464(1361896040, class205.field3941.field90);
                    }
                } else if ((class98.field1992 == 1 || class177.method1167(false, class3.field182 - 1)) && class3.field182 > 2) {
                    class45.method285((byte) -5);
                } else if (class3.field182 > 0) {
                    class131.method865((byte) -82, class3.field182 - 1);
                }
                class6.field298 = null;
            }
        } else if (class197.field3842 > 1) {
            class6.field298 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)Z")
    public static final boolean method714(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class61.field1264 * arg2 + class202.field3915 * arg0 >> 16;
        int var5 = class202.field3915 * arg2 - class61.field1264 * arg0 >> 16;
        int var6 = class89.field1753 * var5 + class58.field1219 * arg1 >> 16;
        int var7 = class89.field1753 * arg1 - class58.field1219 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class117.field2357;
            int var9 = (var7 << 9) / var6 + class4.field230;
            return var8 >= class202.field3920 && var8 <= class60.field1254 && var9 >= class131.field2630 && var9 <= class204.field3933;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public static void method715(int arg0) {
        field2134 = null;
        field2137 = null;
        field2143 = null;
        if (arg0 != 13271) {
            field2139 = null;
        }
        field2138 = null;
        field2136 = null;
        field2140 = null;
        field2139 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lta;I)V")
    public static final void method716(class180 arg0, int arg1) {
        class61.field1270 = arg0;
        field2141++;
        if (arg1 > -2) {
            field2136 = null;
        }
    }
}
