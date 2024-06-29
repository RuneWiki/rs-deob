import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class179 extends class68 {

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    private int field2509 = 4;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    private int field2515 = 4;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field2506 = 1;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "Llc;")
    public static class86 field2505 = new class86(100);

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "F")
    public static float field2513;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[[I)V")
    public static final void method1170(int arg0, int[][] arg1) {
        ++field2514;
        if (arg0 == 1) {
            class216.field3264 = arg1;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)Lva;")
    public static final class35 method1171(boolean arg0, int arg1) {
        if (arg0) {
            method1171(false, -105);
        }
        ++field2510;
        class35 var2 = (class35) class155.field2160.method540((byte) -119, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class231.field3508.method1576(-57, 1, arg1);
            class35 var4 = new class35();
            if (var3 != null) {
                var4.method237(93, arg1, new class224(var3));
            }
            class155.field2160.method543(var4, (long) arg1, 858993459);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field2507;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int var4 = class89.field1248 / this.field2515;
            int var5 = class62.field861 / this.field2509;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method423(0, (byte) -54, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method423(0, (byte) -54, class62.field861 * var7 / var5);
            }
            for (int var8 = 0; class89.field1248 > var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class89.field1248 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        if (arg1 >= -118) {
            field2506 = -63;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(B)V")
    public static final void method1172(byte arg0) {
        int var1 = class290.field4577 * 128 + 64;
        int var2 = class188.field2600 * 128 + 64;
        int var3 = class275.method1836(class295.field4642, var2, var1, -109) + -class217.field3282;
        ++field2511;
        if (~class221.field3324 <= -101) {
            class89.field1252 = class188.field2600 * 128 + 64;
            class41.field618 = class290.field4577 * 128 + 64;
            class246.field3773 = class275.method1836(class295.field4642, class89.field1252, class41.field618, 63) + -class217.field3282;
        } else {
            if (~var1 < ~class41.field618) {
                class41.field618 += (var1 - class41.field618) * class221.field3324 / 1000 + class15.field155;
                if (~class41.field618 < ~var1) {
                    class41.field618 = var1;
                }
            }
            if (class246.field3773 < var3) {
                class246.field3773 += class15.field155 - -((var3 - class246.field3773) * class221.field3324 / 1000);
                if (var3 < class246.field3773) {
                    class246.field3773 = var3;
                }
            }
            if (class246.field3773 > var3) {
                class246.field3773 -= (-var3 + class246.field3773) * class221.field3324 / 1000 + class15.field155;
                if (~var3 < ~class246.field3773) {
                    class246.field3773 = var3;
                }
            }
            if (~var1 > ~class41.field618) {
                class41.field618 -= (-var1 + class41.field618) * class221.field3324 / 1000 + class15.field155;
                if (~var1 < ~class41.field618) {
                    class41.field618 = var1;
                }
            }
            if (var2 > class89.field1252) {
                class89.field1252 += (-class89.field1252 + var2) * class221.field3324 / 1000 + class15.field155;
                if (class89.field1252 > var2) {
                    class89.field1252 = var2;
                }
            }
            if (class89.field1252 > var2) {
                class89.field1252 -= (-var2 + class89.field1252) * class221.field3324 / 1000 + class15.field155;
                if (~class89.field1252 > ~var2) {
                    class89.field1252 = var2;
                }
            }
        }
        int var4 = class116.field1662 * 128 + 64;
        int var5 = class178.field2501 * 128 + 64;
        int var6 = class275.method1836(class295.field4642, var4, var5, 88) + -class1.field5;
        if (arg0 != -8) {
            method1170(89, (int[][]) null);
        }
        int var7 = -class41.field618 + var5;
        int var8 = -class246.field3773 + var6;
        int var9 = -class89.field1252 + var4;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (325.949D * Math.atan2((double) var8, (double) var10)) & 2047;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = 2047 & (int) (-325.949D * Math.atan2((double) var7, (double) var9));
        int var13 = -class239.field3645 + var12;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (~var13 > 1023) {
            var13 += 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 > 0) {
            class239.field3645 += class200.field2780 * var13 / 1000 + class48.field694;
            class239.field3645 &= 2047;
        }
        if (~class275.field4265 > ~var11) {
            class275.field4265 += (-class275.field4265 + var11) * class200.field2780 / 1000 + class48.field694;
            if (~class275.field4265 < ~var11) {
                class275.field4265 = var11;
            }
        }
        if (~var13 > -1) {
            class239.field3645 -= -var13 * class200.field2780 / 1000 + class48.field694;
            class239.field3645 &= 2047;
        }
        if (~var11 > ~class275.field4265) {
            class275.field4265 -= (-var11 + class275.field4265) * class200.field2780 / 1000 + class48.field694;
            if (~var11 < ~class275.field4265) {
                class275.field4265 = var11;
            }
        }
        int var14 = var12 - class239.field3645;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && ~var13 > -1) {
            class239.field3645 = var12;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class179() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method91(int arg0, byte arg1) {
        ++field2504;
        int var3 = -69 / ((63 - arg1) / 61);
        int[][] var4 = super.field920.method184((byte) -21, arg0);
        if (super.field920.field374) {
            int var5 = class62.field861 / this.field2509;
            int var6 = class89.field1248 / this.field2515;
            int[][] var7;
            if (~var5 >= -1) {
                var7 = this.method429(0, 0, 2);
            } else {
                int var8 = arg0 % var5;
                var7 = this.method429(0, class62.field861 * var8 / var5, 2);
            }
            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[2];
            int[] var14 = var4[1];
            for (int var15 = 0; ~class89.field1248 < ~var15; ++var15) {
                int var16;
                if (~var6 >= -1) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var6;
                    var16 = class89.field1248 * var17 / var6;
                }
                var12[var15] = var9[var16];
                var14[var15] = var10[var16];
                var13[var15] = var11[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field2509 = arg0.method1453((byte) -127);
            }
        } else {
            this.field2515 = arg0.method1453((byte) -127);
        }
        ++field2512;
        if (!arg2) {
            field2505 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static void method1173(boolean arg0) {
        if (!arg0) {
            field2505 = null;
        }
    }
}
