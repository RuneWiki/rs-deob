import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class110 {

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field1951;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field1950;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1949 = 0;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Lda;")
    public static class275 field1947 = class255.method1672(105, "Benutzen");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1939 = 1;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lma;")
    public static class105 field1943;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Z")
    public static boolean field1946;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
    public abstract void method162(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)V")
    public abstract void method165(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)J")
    public static final long method814(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field29; var4++) {
            class37 var5 = var3.field48[var4];
            if ((var5.field608 >> 29 & 0x3L) == 2L && var5.field616 == arg1 && var5.field617 == arg2) {
                return var5.field608;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Z")
    public static final boolean method815(int arg0) {
        field1940++;
        if (arg0 < 67) {
            field1946 = true;
        }
        return class83.field1347 == 0 ? class6.field92.method1566((byte) -100) : true;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method816(int arg0) {
        field1943 = null;
        field1947 = null;
        if (arg0 > -47) {
            method815(19);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method817(byte arg0) {
        field1945++;
        if (class276.method1859((byte) 126) != 2) {
            return;
        }
        byte var1 = (byte) (class168.field2925 - 4 & 0xFF);
        int var2 = class168.field2925 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class241.field4225[var3][var2][var16] = var1;
            }
        }
        if (class159.field2790 == 3) {
            return;
        }
        if (arg0 != -87) {
            method814(-2, 64, 98);
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class205.field3478[var4] = -1000000;
            class256.field4508[var4] = 1000000;
            class209.field3527[var4] = 0;
            class32.field482[var4] = 1000000;
            class23.field350[var4] = 0;
        }
        if (class159.field2789 != 1) {
            int var15 = class89.method647(class195.field3335, class159.field2790, class123.field2204, arg0 + 213);
            if ((var15 - class83.field1349) >= 800 || (class72.field1168[class159.field2790][class123.field2204 >> 7][class195.field3335 >> 7] & 0x4) == 0) {
                return;
            }
            class151.method1069(class235.field4101, 1, class195.field3335 >> 7, false, arg0 ^ 0x23, class123.field2204 >> 7);
            return;
        }
        if ((class72.field1168[class159.field2790][class66.field1094.field1770 >> 7][class66.field1094.field1758 >> 7] & 0x4) != 0) {
            class151.method1069(class235.field4101, 0, class66.field1094.field1758 >> 7, false, -118, class66.field1094.field1770 >> 7);
        }
        if (class251.field4454 >= 310) {
            return;
        }
        int var5 = class123.field2204 >> 7;
        int var6 = class195.field3335 >> 7;
        int var7 = class66.field1094.field1770 >> 7;
        int var8 = class66.field1094.field1758 >> 7;
        int var9;
        if (var8 <= var6) {
            var9 = var6 - var8;
        } else {
            var9 = var8 - var6;
        }
        int var10;
        if (var7 <= var5) {
            var10 = var5 - var7;
        } else {
            var10 = var7 - var5;
        }
        if (var9 < var10) {
            int var11 = 32768;
            int var12 = var9 * 65536 / var10;
            while (var5 != var7) {
                if (var5 < var7) {
                    var5++;
                } else if (var5 > var7) {
                    var5--;
                }
                if ((class72.field1168[class159.field2790][var5][var6] & 0x4) != 0) {
                    class151.method1069(class235.field4101, 1, var6, false, arg0 + 2, var5);
                    return;
                }
                var11 += var12;
                if (var11 >= 65536) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    var11 -= 65536;
                    if ((class72.field1168[class159.field2790][var5][var6] & 0x4) != 0) {
                        class151.method1069(class235.field4101, 1, var6, false, -63, var5);
                        return;
                    }
                }
            }
            return;
        }
        int var13 = var10 * 65536 / var9;
        int var14 = 32768;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class72.field1168[class159.field2790][var5][var6] & 0x4) != 0) {
                class151.method1069(class235.field4101, 1, var6, false, arg0 ^ 0x6, var5);
                return;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var7 > var5) {
                    var5++;
                } else if (var7 < var5) {
                    var5--;
                }
                var14 -= 65536;
                if ((class72.field1168[class159.field2790][var5][var6] & 0x4) != 0) {
                    class151.method1069(class235.field4101, 1, var6, false, -59, var5);
                    return;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
    public abstract void method164(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V")
    public class110(int arg0, int arg1, int arg2) {
        this.field1951 = arg0;
        this.field1942 = arg1;
        this.field1950 = arg2;
    }
}
