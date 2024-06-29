import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class162 {

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public int field1905 = 128;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
    public int field1913 = 128;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "Ldr;")
    public static class675 field1914 = new class675(75, 12);

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "Z")
    public static boolean field1916 = true;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "Lhm;")
    public static class208 field1917 = new class208(3000000, 200);

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V", line = 4)
    public static void method993(int arg0) {
        field1917 = null;
        if (arg0 != -12332) {
            method993(112);
        }
        field1914 = null;
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)Lhga;", line = 16)
    public final class162 method994(int arg0) {
        field1918++;
        if (arg0 != -2680) {
            this.method996(null, -118);
        }
        return new class162(this.field1902, this.field1913, this.field1905, this.field1909, this.field1910, this.field1904);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V", line = 33)
    public static final void method995(byte arg0) {
        field1903++;
        if (class611.field8310.method2746(-83, class628.field8526) != 2) {
            return;
        }
        byte var1 = (byte) (class197.field2318 - 4 & 0xFF);
        int var2 = class197.field2318 % class85.field1090;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class656.field8932; var16++) {
                class252.field3249[var3][var2][var16] = var1;
            }
        }
        if (class675.field9219 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class478.field5956[var4] = -1000000;
            class711.field9936[var4] = 1000000;
            class102.field1311[var4] = 0;
            class245.field3161[var4] = 1000000;
            class228.field2948[var4] = 0;
        }
        if (arg0 != -85) {
            return;
        }
        if (class385.field4946 != 1) {
            int var15 = class514.method2798(class710.field9924, class238.field3071, class675.field9219, (byte) 77);
            if ((var15 - class455.field5688) >= 3200 || (class234.field3033[class675.field9219][class238.field3071 >> 9][class710.field9924 >> 9] & 0x4) == 0) {
                return;
            }
            class109.method763(class407.field5237, false, 1, class238.field3071 >> 9, class710.field9924 >> 9, 0);
            return;
        }
        if ((class234.field3033[class675.field9219][class67.field815.field8018 >> 9][class67.field815.field8011 >> 9] & 0x4) != 0) {
            class109.method763(class407.field5237, false, 0, class67.field815.field8018 >> 9, class67.field815.field8011 >> 9, 0);
        }
        if (client.field3568 >= 2560) {
            return;
        }
        int var5 = class238.field3071 >> 9;
        int var6 = class710.field9924 >> 9;
        int var7 = class67.field815.field8018 >> 9;
        int var8 = class67.field815.field8011 >> 9;
        int var9;
        if (var7 > var5) {
            var9 = var7 - var5;
        } else {
            var9 = var5 - var7;
        }
        int var10;
        if (var8 > var6) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        if ((var9 != 0 || var10 != 0) && var9 > (-class85.field1090) && class85.field1090 > var9 && -class656.field8932 < var10 && class656.field8932 > var10) {
            if (var9 > var10) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class234.field3033[class675.field9219][var5][var6] & 0x4) != 0) {
                        class109.method763(class407.field5237, false, 1, var5, var6, arg0 + 85);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var6 < var8) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        var12 -= 65536;
                        if ((class234.field3033[class675.field9219][var5][var6] & 0x4) != 0) {
                            class109.method763(class407.field5237, false, 1, var5, var6, 0);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var8 > var6) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class234.field3033[class675.field9219][var5][var6] & 0x4) != 0) {
                    class109.method763(class407.field5237, false, 1, var5, var6, 0);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var5 < var7) {
                        var5++;
                    } else if (var5 > var7) {
                        var5--;
                    }
                    if ((class234.field3033[class675.field9219][var5][var6] & 0x4) != 0) {
                        class109.method763(class407.field5237, false, 1, var5, var6, 0);
                        return;
                    }
                }
            }
            return;
        }
        class564.method2994((byte) 34, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class227.field2938 + "," + class522.field6612, null);
        return;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lhga;I)V", line = 230)
    public final void method996(class162 arg0, int arg1) {
        this.field1909 = arg0.field1909;
        this.field1905 = arg0.field1905;
        this.field1913 = arg0.field1913;
        this.field1902 = arg0.field1902;
        this.field1910 = arg0.field1910;
        if (arg1 != -2561) {
            this.method996(null, -35);
        }
        this.field1904 = arg0.field1904;
        field1906++;
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(I)V", line = 265)
    public class162(int arg0) {
        this.field1902 = arg0;
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(IIIIII)V", line = 275)
    private class162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1905 = arg2;
        this.field1913 = arg1;
        this.field1909 = arg3;
        this.field1910 = arg4;
        this.field1902 = arg0;
        this.field1904 = arg5;
    }
}
