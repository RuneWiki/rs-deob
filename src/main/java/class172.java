import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class172 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lda;")
    private class29 field3515 = new class29(256);

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lda;")
    private class29 field3531 = new class29(256);

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Ldd;")
    private class32 field3530;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Ldd;")
    private class32 field3514;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "Lea;")
    private static class38 field3513 = class9.method46((byte) 126, "Loading fonts )2 ");

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lea;")
    public static class38 field3526 = field3513;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lea;")
    public static class38 field3519 = class9.method46((byte) 114, ")4l");

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lea;")
    private static class38 field3520 = class9.method46((byte) 111, "flash3:");

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lea;")
    public static class38 field3521 = field3520;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lea;")
    public static class38 field3527 = field3520;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Ldd;")
    public static class32 field3524;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
    public static void method1206(boolean arg0) {
        field3513 = null;
        field3526 = null;
        field3519 = null;
        field3524 = null;
        field3521 = null;
        field3520 = null;
        if (!arg0) {
            method1209(null, 88);
        }
        field3527 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[IB)Lih;")
    private final class79 method1207(int arg0, int arg1, int[] arg2, byte arg3) {
        field3518++;
        int var5 = arg0 ^ (arg1 << 4 & 0xFFF4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class79 var9 = (class79) this.field3531.method183((byte) 115, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class201 var10 = (class201) this.field3515.method183((byte) 67, var7);
            if (var10 == null) {
                var10 = class201.method1317(this.field3530, arg1, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field3515.method184(var10, false, var7);
            }
            int var11 = 76 % ((19 - arg3) / 63);
            class79 var12 = var10.method1320(arg2);
            if (var12 == null) {
                return null;
            } else {
                var10.method805(false);
                this.field3531.method184(var12, false, var7);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static final void method1208(int arg0) {
        field3517++;
        int var1 = class51.field1294 * 128 + 64;
        int var2 = class106.field2359 * 128 + 64;
        int var3 = class38.method257(class10.field224, -169496123, var2, var1) - class90.field2064;
        if (class50.field1243 < var1) {
            class50.field1243 += (var1 - class50.field1243) * class177.field3595 / 1000 + class48.field1160;
            if (var1 < class50.field1243) {
                class50.field1243 = var1;
            }
        }
        if (var3 > class203.field4008) {
            class203.field4008 += (var3 - class203.field4008) * class177.field3595 / 1000 + class48.field1160;
            if (var3 < class203.field4008) {
                class203.field4008 = var3;
            }
        }
        if (var2 > class42.field925) {
            class42.field925 += (var2 - class42.field925) * class177.field3595 / 1000 + class48.field1160;
            if (var2 < class42.field925) {
                class42.field925 = var2;
            }
        }
        if (class42.field925 > var2) {
            class42.field925 -= (class42.field925 - var2) * class177.field3595 / 1000 + class48.field1160;
            if (var2 > class42.field925) {
                class42.field925 = var2;
            }
        }
        if (class50.field1243 > var1) {
            class50.field1243 -= (class50.field1243 - var1) * class177.field3595 / 1000 + class48.field1160;
            if (class50.field1243 < var1) {
                class50.field1243 = var1;
            }
        }
        int var4 = class95.field2139 * 128 + 64;
        if (class203.field4008 > var3) {
            class203.field4008 -= class48.field1160 + (class203.field4008 - var3) * class177.field3595 / 1000;
            if (var3 > class203.field4008) {
                class203.field4008 = var3;
            }
        }
        int var5 = class90.field2052 * 128 + 64;
        int var6 = class38.method257(class10.field224, -169496123, var4, var5) - class139.field2898;
        int var7 = var5 - class50.field1243;
        int var8 = var4 - class42.field925;
        int var9 = var6 - class203.field4008;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var13 = var12 - class123.field2654;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class144.field2998 < var11) {
            class144.field2998 += (var11 - class144.field2998) * class18.field373 / 1000 + class32.field628;
            if (class144.field2998 > var11) {
                class144.field2998 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class144.field2998 > var11) {
            class144.field2998 -= class32.field628 + (class144.field2998 - var11) * class18.field373 / 1000;
            if (class144.field2998 < var11) {
                class144.field2998 = var11;
            }
        }
        if (var13 > 0) {
            class123.field2654 += class32.field628 + class18.field373 * var13 / 1000;
            class123.field2654 &= 0x7FF;
        }
        if (var13 < 0) {
            class123.field2654 -= -var13 * class18.field373 / 1000 + class32.field628;
            class123.field2654 &= 0x7FF;
        }
        int var14 = var12 - class123.field2654;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (~var14 > arg0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class123.field2654 = var12;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lef;I)V")
    public static final void method1209(class43 arg0, int arg1) {
        field3529++;
        if (arg1 == -1 && class29.field571 == arg0.field954) {
            class102.field2291[arg0.field1069] = true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([III)Lih;")
    public final class79 method1210(int[] arg0, int arg1, int arg2) {
        field3522++;
        if (this.field3530.method192((byte) -122) == 1) {
            return this.method1207(arg2, 0, arg0, (byte) 99);
        } else if (arg1 != 1023) {
            return null;
        } else if (this.field3530.method213(10000, arg2) == 1) {
            return this.method1207(0, arg2, arg0, (byte) -64);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([IIIB)Lih;")
    private final class79 method1211(int[] arg0, int arg1, int arg2, byte arg3) {
        field3516++;
        int var5 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x80000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class79 var9 = (class79) this.field3531.method183((byte) 68, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            if (arg3 < 62) {
                field3513 = null;
            }
            class26 var10 = class26.method150(this.field3514, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class79 var11 = var10.method148();
            this.field3531.method184(var11, false, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field1887.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[IB)Lih;")
    public final class79 method1212(int arg0, int[] arg1, byte arg2) {
        field3525++;
        if (arg2 <= 53) {
            this.method1211(null, -31, -3, (byte) -19);
        }
        if (this.field3514.method192((byte) -102) == 1) {
            return this.method1211(arg1, arg0, 0, (byte) 100);
        } else if (this.field3514.method213(10000, arg0) == 1) {
            return this.method1211(arg1, 0, arg0, (byte) 75);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ldd;Ldd;)V")
    public class172(class32 arg0, class32 arg1) {
        this.field3530 = arg1;
        this.field3514 = arg0;
    }
}
