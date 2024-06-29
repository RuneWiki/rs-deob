import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class237 extends class199 {

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "I")
    private int field3435 = 585;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "S")
    public static short field3425 = 1;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "Lcc;")
    public static class327 field3428 = new class327(64);

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "[I")
    public static int[] field3431 = new int[200];

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "[C")
    public static char[] field3433 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "[I")
    public static int[] field3434 = new int[50];

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLfd;I)V", line = 5)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field3423++;
        if (arg2 == 0) {
            this.field3435 = arg1.method2083((byte) -95);
        }
        if (arg0 != -43) {
            this.method190(49, 99);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Ljl;", line = 33)
    public static final class20 method1689(int arg0, int arg1, int arg2, int arg3) {
        field3429++;
        int var4 = arg1 << 8 | arg0;
        class20 var5 = (class20) class94.field1212.method1116(17301, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class52.field692.method1060(class52.field692.method1084(var4, (byte) -115), true);
        if (var6 == null) {
            int var7 = arg0 | arg2 + 65536 << 8;
            class20 var8 = (class20) class94.field1212.method1116(arg3 - 933617139, (long) var7 << 16);
            if (var8 != null) {
                return var8;
            }
            byte[] var9 = class52.field692.method1060(class52.field692.method1084(var7, (byte) -115), true);
            if (arg3 != 933634440) {
                return (class20) null;
            } else if (var9 == null) {
                int var11 = arg0 | 0xFFFF00;
                class20 var12 = (class20) class94.field1212.method1116(17301, (long) var11 << 16);
                if (var12 != null) {
                    return var12;
                }
                byte[] var13 = class52.field692.method1060(class52.field692.method1084(var11, (byte) -115), true);
                if (var13 == null) {
                    return null;
                } else if (var13.length > 1) {
                    class20 var14 = class97.method701((byte) 63, var13);
                    var14.field218 = arg0;
                    class94.field1212.method1115((long) var11 << 16, arg3 - 933634376, var14);
                    return var14;
                } else {
                    return null;
                }
            } else if (var9.length <= 1) {
                return null;
            } else {
                class20 var10 = class97.method701((byte) 63, var9);
                var10.field218 = arg0;
                class94.field1212.method1115((long) var7 << 16, arg3 - 933634366, var10);
                return var10;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class20 var15 = class97.method701((byte) 63, var6);
            var15.field218 = arg0;
            class94.field1212.method1115((long) var4 << 16, arg3 ^ 0x37A621B9, var15);
            return var15;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(IIIIII)V", line = 99)
    public static final void method1690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class135.field1846 = arg4;
        field3430++;
        class28.field324 = arg1;
        class264.field3840 = arg5;
        class270.field3881 = arg2;
        if (arg0 != 26379) {
            field3431 = (int[]) null;
        }
        class316.field4658 = arg3;
        if (class264.field3840 >= 100) {
            int var6 = class316.field4658 * 128 + 64;
            int var7 = class135.field1846 * 128 + 64;
            int var8 = class271.method1847(var7, true, var6, class56.field724) - class28.field324;
            int var9 = var6 - class112.field1453;
            int var10 = var8 - class343.field5332;
            int var11 = var7 - class248.field3606;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class94.field1222 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class347.field5398 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class94.field1222 < 128) {
                class94.field1222 = 128;
            }
            if (class94.field1222 > 383) {
                class94.field1222 = 383;
            }
        }
        client.field1631 = 2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I", line = 148)
    public final int[] method190(int arg0, int arg1) {
        field3424++;
        if (arg0 != -1735) {
            field3425 = -54;
        }
        int[] var3 = this.field2802.method2502(arg1, arg0 + 1812);
        if (this.field2802.field5637) {
            int var4 = class274.field3919[arg1];
            for (int var5 = 0; var5 < class95.field1235; var5++) {
                int var6 = class82.field1062[var5];
                if (this.field3435 < var6 && 4096 - this.field3435 > var6 && var4 > (2048 - this.field3435) && (this.field3435 + 2048) > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3435);
                    var3[var5] = 4096 - var10;
                } else if ((2048 - this.field3435) < var6 && this.field3435 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field3435;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3435);
                } else if (var4 < this.field3435 || var4 > (4096 - this.field3435)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3435;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3435);
                } else if (this.field3435 <= var6 && var6 <= (4096 - this.field3435)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field3435);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V", line = 227)
    public static final void method1691(int arg0) {
        if (arg0 != 24594) {
            return;
        }
        int var1 = class55.field712 * 128 + 64;
        int var2 = class48.field642 * 128 + 64;
        int var3 = class271.method1847(var2, true, var1, class56.field724) - class15.field164;
        field3427++;
        if (class223.field3219 >= 100) {
            class248.field3606 = class48.field642 * 128 + 64;
            class112.field1453 = class55.field712 * 128 + 64;
            class343.field5332 = class271.method1847(class248.field3606, true, class112.field1453, class56.field724) - class15.field164;
        } else {
            if (class248.field3606 < var2) {
                class248.field3606 += class157.field2184 + ((var2 - class248.field3606) * class223.field3219 / 1000);
                if (class248.field3606 > var2) {
                    class248.field3606 = var2;
                }
            }
            if (var1 > class112.field1453) {
                class112.field1453 += (var1 - class112.field1453) * class223.field3219 / 1000 + class157.field2184;
                if (var1 < class112.field1453) {
                    class112.field1453 = var1;
                }
            }
            if (class112.field1453 > var1) {
                class112.field1453 -= (class112.field1453 - var1) * class223.field3219 / 1000 + class157.field2184;
                if (class112.field1453 < var1) {
                    class112.field1453 = var1;
                }
            }
            if (class343.field5332 < var3) {
                class343.field5332 += (var3 - class343.field5332) * class223.field3219 / 1000 + class157.field2184;
                if (class343.field5332 > var3) {
                    class343.field5332 = var3;
                }
            }
            if (var2 < class248.field3606) {
                class248.field3606 -= (class248.field3606 - var2) * class223.field3219 / 1000 + class157.field2184;
                if (class248.field3606 < var2) {
                    class248.field3606 = var2;
                }
            }
            if (var3 < class343.field5332) {
                class343.field5332 -= (class343.field5332 - var3) * class223.field3219 / 1000 + class157.field2184;
                if (class343.field5332 < var3) {
                    class343.field5332 = var3;
                }
            }
        }
        int var4 = class135.field1846 * 128 + 64;
        int var5 = class316.field4658 * 128 + 64;
        int var6 = class271.method1847(var4, true, var5, class56.field724) - class28.field324;
        int var7 = var4 - class248.field3606;
        int var8 = var6 - class343.field5332;
        int var9 = var5 - class112.field1453;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var7)) & 0x7FF;
        if (var11 > class94.field1222) {
            class94.field1222 += (var11 - class94.field1222) * class264.field3840 / 1000 + class270.field3881;
            if (class94.field1222 > var11) {
                class94.field1222 = var11;
            }
        }
        if (class94.field1222 > var11) {
            class94.field1222 -= class270.field3881 + ((class94.field1222 - var11) * class264.field3840 / 1000);
            if (class94.field1222 < var11) {
                class94.field1222 = var11;
            }
        }
        int var13 = var12 - class347.field5398;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class347.field5398 += class264.field3840 * var13 / 1000 + class270.field3881;
            class347.field5398 &= 0x7FF;
        }
        if (var13 < 0) {
            class347.field5398 -= class270.field3881 + (-var13 * class264.field3840 / 1000);
            class347.field5398 &= 0x7FF;
        }
        int var14 = var12 - class347.field5398;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class347.field5398 = var12;
        }
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V", line = 384)
    public static void method1692(int arg0) {
        field3428 = null;
        field3433 = null;
        if (arg0 != -6473) {
            field3434 = (int[]) null;
        }
        field3431 = null;
        field3434 = null;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V", line = 412)
    public class237() {
        super(0, true);
    }
}
