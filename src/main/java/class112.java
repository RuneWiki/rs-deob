import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class112 {

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Lmb;")
    public static class160 field1904 = new class160();

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field1919 = 0;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field1920 = 0;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public int field1918;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "J")
    public long field1910;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lgl;")
    public class211 field1905;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lgl;")
    public class211 field1912;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "Lgl;")
    public class211 field1915;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "[Z")
    public static boolean[] field1917;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLcf;)Lcf;")
    public static final class93 method797(byte arg0, class93 arg1) {
        int var2 = class178.method1293(-1, arg1);
        field1913++;
        if (var2 == -1) {
            return class80.field1497;
        } else {
            if (arg0 < 5) {
                field1903 = -4;
            }
            return class234.field4165.field2260[var2].method636(class249.field4481, class228.field4090, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static final void method798(boolean arg0) {
        int var1 = class188.field3458 * 128 + 64;
        field1916++;
        if (!arg0) {
            return;
        }
        int var2 = class127.field2248 * 128 + 64;
        int var3 = class13.method56(var2, var1, (byte) 76, class138.field2405) - class13.field167;
        if (class139.field2422 < 100) {
            if (class77.field1442 < var3) {
                class77.field1442 += (var3 - class77.field1442) * class139.field2422 / 1000 + class42.field658;
                if (class77.field1442 > var3) {
                    class77.field1442 = var3;
                }
            }
            if (var1 > class166.field2925) {
                class166.field2925 += (var1 - class166.field2925) * class139.field2422 / 1000 + class42.field658;
                if (var1 < class166.field2925) {
                    class166.field2925 = var1;
                }
            }
            if (var1 < class166.field2925) {
                class166.field2925 -= class42.field658 + ((class166.field2925 - var1) * class139.field2422 / 1000);
                if (class166.field2925 < var1) {
                    class166.field2925 = var1;
                }
            }
            if (class165.field2919 < var2) {
                class165.field2919 += class42.field658 + ((var2 - class165.field2919) * class139.field2422 / 1000);
                if (class165.field2919 > var2) {
                    class165.field2919 = var2;
                }
            }
            if (var2 < class165.field2919) {
                class165.field2919 -= (class165.field2919 - var2) * class139.field2422 / 1000 + class42.field658;
                if (class165.field2919 < var2) {
                    class165.field2919 = var2;
                }
            }
            if (class77.field1442 > var3) {
                class77.field1442 -= (class77.field1442 - var3) * class139.field2422 / 1000 + class42.field658;
                if (var3 > class77.field1442) {
                    class77.field1442 = var3;
                }
            }
        } else {
            class165.field2919 = class127.field2248 * 128 + 64;
            class166.field2925 = class188.field3458 * 128 + 64;
            class77.field1442 = class13.method56(class165.field2919, class166.field2925, (byte) 95, class138.field2405) - class13.field167;
        }
        int var4 = class109.field1862 * 128 + 64;
        int var5 = class167.field2952 * 128 + 64;
        int var6 = class13.method56(var5, var4, (byte) 72, class138.field2405) - class77.field1437;
        int var7 = var4 - class166.field2925;
        int var8 = var6 - class77.field1442;
        int var9 = var5 - class165.field2919;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var9)) & 0x7FF;
        int var13 = var12 - class233.field4155;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class198.field3602 < var11) {
            class198.field3602 += (var11 - class198.field3602) * class154.field2703 / 1000 + class258.field4652;
            if (class198.field3602 > var11) {
                class198.field3602 = var11;
            }
        }
        if (class198.field3602 > var11) {
            class198.field3602 -= (class198.field3602 - var11) * class154.field2703 / 1000 + class258.field4652;
            if (class198.field3602 < var11) {
                class198.field3602 = var11;
            }
        }
        if (var13 > 0) {
            class233.field4155 += class154.field2703 * var13 / 1000 + class258.field4652;
            class233.field4155 &= 0x7FF;
        }
        if (var13 < 0) {
            class233.field4155 -= class258.field4652 + (-var13 * class154.field2703 / 1000);
            class233.field4155 &= 0x7FF;
        }
        int var14 = var12 - class233.field4155;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class233.field4155 = var12;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Lsk;")
    public static final class112 method799(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class112 var4 = var3.field646;
            var3.field646 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(JBZII)Lcf;")
    public static final class93 method800(long arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field1907++;
        class93 var6 = class119.method885(0, -122);
        if (arg0 < 0L) {
            var6.method658((byte) 98, class208.field3727);
            arg0 = -arg0;
        }
        class93 var7 = class71.field1285;
        class93 var8 = class204.field3676;
        if (arg3 == 1) {
            var7 = class204.field3676;
            var8 = class71.field1285;
        }
        if (arg3 == 2) {
            var8 = class71.field1285;
            var7 = class243.field4382;
        }
        if (arg3 == 3) {
            var8 = class71.field1285;
            var7 = class204.field3676;
        }
        class93 var9 = class119.method885(0, -97);
        int var10 = 0;
        if (arg1 < 112) {
            return null;
        }
        while (var10 < arg4) {
            var9.method658((byte) 88, class148.method1067(-7015, (int) (arg0 % 10L)));
            arg0 /= 10L;
            var10++;
        }
        int var11 = 0;
        class93 var12;
        if (arg0 == 0L) {
            var12 = class46.field744;
        } else {
            class93 var13 = class119.method885(0, -101);
            var12 = var13;
            while (arg0 > 0L) {
                if (arg2 && var11 != 0 && (var11 % 3) == 0) {
                    var13.method658((byte) 111, var7);
                }
                var11++;
                var13.method658((byte) 89, class148.method1067(-7015, (int) (arg0 % 10L)));
                arg0 /= 10L;
            }
        }
        if (var9.method666(false) > 0) {
            var9.method658((byte) 101, var8);
        }
        return class130.method949((byte) -77, new class93[] { var6, var12.method682(-107), var9.method682(-118) });
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)V")
    public static final void method801(int arg0, int arg1) {
        if (arg0 != 128) {
            field1920 = 119;
        }
        class45.field733.method298(true, arg1);
        field1909++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/Object;ZB)[B")
    public static final byte[] method802(Object arg0, boolean arg1, byte arg2) {
        field1906++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class101.method729(var3, (byte) 84) : var3;
        } else {
            if (arg2 != 98) {
                method800(-10L, (byte) 6, false, 1, 54);
            }
            if (!arg0 instanceof class47) {
                throw new IllegalArgumentException();
            }
            class47 var4 = (class47) arg0;
            return var4.method260(255);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)Lwc;")
    public static final class229 method803(int arg0, int arg1, int arg2) {
        class41 var3 = class232.field4138[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field645; var4++) {
            class229 var5 = var3.field637[var4];
            if ((var5.field4094 >> 29 & 0x3L) == 2L && var5.field4095 == arg1 && var5.field4099 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIIII)V")
    public static final void method804(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        class57.field942 = 0L;
        field1914++;
        int var5 = class55.method311(false);
        boolean var6 = false;
        if (arg4 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class286.field5121.startsWith("mac") && arg4 > 0) {
            arg0 = true;
        }
        if (~var5 < arg3 != arg4 > 0) {
            var6 = true;
        }
        if (arg0 && arg4 > 0) {
            var6 = true;
        }
        class58.method332(arg1, arg4, arg0, var5, var6, 0, arg2);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method805(int arg0) {
        field1904 = null;
        int var1 = -16 / ((-arg0 - 47) / 53);
        field1917 = null;
    }
}
