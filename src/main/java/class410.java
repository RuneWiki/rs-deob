import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class410 extends class404 {

    @OriginalMember(owner = "client!re", name = "F", descriptor = "[S")
    public static short[] field5947 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field5942 = -1;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Loe;")
    public static class127 field5945 = new class127(17, 2);

    @OriginalMember(owner = "client!re", name = "J", descriptor = "Lvh;")
    public static class232 field5950 = new class232(1);

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field5948;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Lll;")
    public static class235 field5951;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Z")
    public static boolean field5946;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V", line = 4)
    public static final void method2421(boolean arg0, boolean arg1) {
        ++field5944;
        while (~class491.field7457.method2370(class60.field1014, -73) <= -16) {
            int var2 = class491.field7457.method2364(15, arg0);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class195.field3085[var2] == null) {
                class195.field3085[var2] = new class249();
                var3 = true;
                class195.field3085[var2].field2197 = var2;
            }
            class249 var4 = class195.field3085[var2];
            class437.field6440[class352.field5175++] = var2;
            var4.field2216 = class369.field5424;
            if (var4.field3819 != null && var4.field3819.method1474((byte) 112)) {
                class164.method1041(false, var4);
            }
            int var5 = class491.field7457.method2364(1, true);
            int var6 = class491.field7457.method2364(3, arg0) + 4 << 11 & 15072;
            int var7 = class491.field7457.method2364(2, arg0);
            int var8;
            if (!arg1) {
                var8 = class491.field7457.method2364(5, true);
                if (var8 > 15) {
                    var8 -= 32;
                }
            } else {
                var8 = class491.field7457.method2364(8, true);
                if (var8 > 127) {
                    var8 -= 256;
                }
            }
            int var9 = class491.field7457.method2364(1, true);
            if (var9 == 1) {
                class158.field2489[class451.field6951++] = var2;
            }
            int var10;
            if (!arg1) {
                var10 = class491.field7457.method2364(5, arg0);
                if (var10 > 15) {
                    var10 -= 32;
                }
            } else {
                var10 = class491.field7457.method2364(8, true);
                if (var10 > 127) {
                    var10 -= 256;
                }
            }
            var4.method1507((byte) -86, class433.field6358.method2688(class491.field7457.method2364(14, true), -8333));
            var4.method893(0, var4.field3819.field3707);
            var4.field2136 = var4.field3819.field3720 << 3;
            if (~var4.field2136 == -1) {
                var4.method902(0, (byte) 104);
            } else if (var3) {
                var4.method902(var6, (byte) 104);
            }
            var4.method1503(var7, (byte) -98, class286.field4329.field2239[0] + var10, var4.method337(0), class286.field4329.field2232[0] + var8, var5 == 1);
            if (var4.field3819.method1474((byte) 52)) {
                class72.method538((class47) null, var4.field2232[0], var4, 0, var4.field3217, var4.field2239[0], arg0, (class56) null);
            }
        }
        if (!arg0) {
            method2421(false, false);
        }
        class491.field7457.method2373(false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[I", line = 108)
    public final int[] method90(int arg0, int arg1) {
        if (arg0 >= -47) {
            field5947 = null;
        }
        ++field5943;
        int[] var3 = super.field5870.method372(arg1, (byte) -118);
        if (super.field5870.field810) {
            int[] var4 = this.method2394(0, (byte) 64, arg1);
            for (int var5 = 0; ~var5 > ~class431.field6348; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "h", descriptor = "(I)V", line = 146)
    public static final void method2422(int arg0) {
        ++field5941;
        int var1 = class282.field4278 * 128 - -64;
        int var2 = class161.field2530 * 128 - -64;
        int var3 = class7.method38(var1, class362.field5339, var2, (byte) -54) - class223.field3440;
        if (class110.field1893 < 100) {
            if (var1 > class243.field3655) {
                class243.field3655 += (-class243.field3655 + var1) * class110.field1893 / 1000 + class34.field490;
                if (~var1 > ~class243.field3655) {
                    class243.field3655 = var1;
                }
            }
            if (var1 < class243.field3655) {
                class243.field3655 -= (-var1 + class243.field3655) * class110.field1893 / 1000 + class34.field490;
                if (var1 > class243.field3655) {
                    class243.field3655 = var1;
                }
            }
            if (~var3 < ~class288.field4373) {
                class288.field4373 += class34.field490 - -((var3 - class288.field4373) * class110.field1893 / 1000);
                if (~var3 > ~class288.field4373) {
                    class288.field4373 = var3;
                }
            }
            if (~class288.field4373 < ~var3) {
                class288.field4373 -= (-var3 + class288.field4373) * class110.field1893 / 1000 + class34.field490;
                if (class288.field4373 < var3) {
                    class288.field4373 = var3;
                }
            }
            if (~var2 < ~class290.field4403) {
                class290.field4403 += class34.field490 - -((-class290.field4403 + var2) * class110.field1893 / 1000);
                if (var2 < class290.field4403) {
                    class290.field4403 = var2;
                }
            }
            if (~class290.field4403 < ~var2) {
                class290.field4403 -= (class290.field4403 - var2) * class110.field1893 / 1000 + class34.field490;
                if (class290.field4403 < var2) {
                    class290.field4403 = var2;
                }
            }
        } else {
            class290.field4403 = class161.field2530 * 128 + 64;
            class243.field3655 = class282.field4278 * 128 - -64;
            class288.field4373 = class7.method38(class243.field3655, class362.field5339, class290.field4403, (byte) -54) - class223.field3440;
        }
        int var4 = class182.field2874 * 128 - -64;
        int var5 = class280.field4258 * 128 - -64;
        int var6 = class7.method38(var4, class362.field5339, var5, (byte) -54) - class198.field3113;
        int var7 = -class243.field3655 + var4;
        int var8 = -class288.field4373 + var6;
        int var9 = -class290.field4403 + var5;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10)) & 16383;
        int var12 = 16383 & (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D);
        if (~var11 > -1025) {
            var11 = 1024;
        }
        if (~var11 < -3073) {
            var11 = 3072;
        }
        if (~class456.field6999 > ~var11) {
            class456.field6999 += class461.field7099 - -((-class456.field6999 + var11 >> 3) * class475.field7252 / 1000) << 3;
            if (class456.field6999 > var11) {
                class456.field6999 = var11;
            }
        }
        if (var11 < class456.field6999) {
            class456.field6999 -= (-var11 + class456.field6999 >> 3) * class475.field7252 / 1000 + class461.field7099 << 3;
            if (~class456.field6999 > ~var11) {
                class456.field6999 = var11;
            }
        }
        int var13 = -class16.field226 + var12;
        if (~var13 < -8193) {
            var13 -= 16384;
        }
        if (~var13 > 8191) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class16.field226 += class461.field7099 - -(class475.field7252 * var14 / 1000) << 3;
            class16.field226 &= 16383;
        }
        if (var14 < 0) {
            class16.field226 -= class461.field7099 - -(-var14 * class475.field7252 / 1000) << 3;
            class16.field226 &= 16383;
        }
        int var15 = var12 - class16.field226;
        if (~var15 < -8193) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class211.field3284 = 0;
        if (~var15 > arg0 && var14 > 0 || ~var15 < -1 && var14 < 0) {
            class16.field226 = var12;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILha;I)V", line = 299)
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field5949;
        if (~arg2 == -1) {
            super.field5873 = arg1.method257((byte) 98) == 1;
        }
        if (arg0 != 0) {
            this.method87(-42, (class40) null, 45);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 313)
    public class410() {
        super(1, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 316)
    public static void method2423(byte arg0) {
        int var1 = 119 % ((arg0 - 13) / 38);
        field5947 = null;
        field5951 = null;
        field5950 = null;
        field5945 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[[I", line = 329)
    public final int[][] method89(int arg0, int arg1) {
        ++field5948;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (arg0 != -1) {
            method2423((byte) 72);
        }
        if (super.field5869.field7156) {
            int[][] var4 = this.method2400(arg0 + -11871, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class431.field6348; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }
}
