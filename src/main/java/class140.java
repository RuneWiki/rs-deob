import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class140 extends class182 {

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    private int field2373 = 4;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    private int field2377 = 4;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lg;")
    public static class181 field2371 = null;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Lsf;")
    public static class124 field2375 = new class124(100);

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "Lek;")
    public static class206 field2363;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V", line = 4)
    public static void method965(byte arg0) {
        field2371 = null;
        field2375 = null;
        field2363 = null;
        if (arg0 <= 86) {
            field2371 = (class181) null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Loe;IB)V", line = 17)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            field2374 = 16;
        }
        field2370++;
        if (arg1 == 0) {
            this.field2373 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field2377 = arg0.method1005((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(JZ)V", line = 58)
    public static final void method966(long arg0, boolean arg1) {
        class51.field1038.field2435 = 0;
        class51.field1038.method1027(21, -20374);
        field2378++;
        class51.field1038.method1003((byte) -15, arg0);
        if (!arg1) {
            method968((byte) -61);
        }
        class173.field2881 = 0;
        class46.field927 = -3;
        class65.field1234 = 1;
        class208.field3481 = 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[[I", line = 78)
    public final int[][] method122(int arg0, int arg1) {
        field2367++;
        if (arg1 != 4944) {
            this.field2373 = 32;
        }
        int[][] var3 = this.field3152.method1953(arg0, arg1 ^ 0x133B);
        if (this.field3152.field4493) {
            int var4 = class26.field672 / this.field2373;
            int var5 = class334.field5323 / this.field2377;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method1291(0, (byte) 126, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1291(class334.field5323 * var7 / var5, (byte) 97, 0);
            }
            int[] var8 = var6[1];
            int[] var9 = var6[2];
            int[] var10 = var3[0];
            int[] var11 = var6[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; var14 < class26.field672; var14++) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class26.field672 * var16 / var4;
                }
                var10[var14] = var11[var15];
                var13[var14] = var8[var15];
                var12[var14] = var9[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIIII)V", line = 149)
    public static final void method967(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2364++;
        int var6 = arg1 - arg5;
        int var7 = arg2 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class235.method1632((byte) -120, arg3, arg5, arg1, arg4);
            }
        } else if (var6 == 0) {
            class70.method533(arg2, arg5, arg4, 126, arg3);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg5 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class190.field3224 > arg2) {
                var10 = (class190.field3224 * var8 >> 12) + var9;
                var11 = class190.field3224;
            } else if (class289.field4704 >= arg2) {
                var10 = arg1;
                var11 = arg2;
            } else {
                var10 = (class289.field4704 * var8 >> 12) + var9;
                var11 = class289.field4704;
            }
            int var12;
            int var13;
            if (class190.field3224 > arg3) {
                var12 = class190.field3224;
                var13 = (class190.field3224 * var8 >> 12) + var9;
            } else if (class289.field4704 >= arg3) {
                var12 = arg3;
                var13 = arg5;
            } else {
                var12 = class289.field4704;
                var13 = (class289.field4704 * var8 >> 12) + var9;
            }
            if (class87.field1520 > var13) {
                var12 = (class87.field1520 - var9 << 12) / var8;
                var13 = class87.field1520;
            } else if (var13 > class177.field2930) {
                var13 = class177.field2930;
                var12 = (class177.field2930 - var9 << 12) / var8;
            }
            if (arg0) {
                if (class87.field1520 > var10) {
                    var11 = (class87.field1520 - var9 << 12) / var8;
                    var10 = class87.field1520;
                } else if (class177.field2930 < var10) {
                    var10 = class177.field2930;
                    var11 = (class177.field2930 - var9 << 12) / var8;
                }
                class181.method1279(arg4, (byte) 66, var11, var12, var13, var10);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V", line = 254)
    public static final void method968(byte arg0) {
        field2372++;
        while (class342.field5413.method294(class205.field3414, false) >= 11) {
            int var1 = class342.field5413.method295((byte) -97, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class182.field3151[var1] == null) {
                class182.field3151[var1] = new class98();
                if (class227.field3738[var1] != null) {
                    class182.field3151[var1].method745(0, var1, class227.field3738[var1]);
                }
                var2 = true;
            }
            class22.field556[class252.field4144++] = var1;
            class98 var3 = class182.field3151[var1];
            var3.field221 = class267.field4371;
            int var4 = class342.field5413.method295((byte) 16, 5);
            int var5 = class342.field5413.method295((byte) -99, 1);
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var5 == 1) {
                class34.field761[class91.field1613++] = var1;
            }
            int var6 = class250.field4096[class342.field5413.method295((byte) 35, 3)];
            if (var2) {
                var3.field144 = var3.field216 = var6;
            }
            int var7 = class342.field5413.method295((byte) -113, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class342.field5413.method295((byte) 70, 1);
            var3.method749(var8 == 1, class96.field1750.field170[0] + var4, -26866, class96.field1750.field139[0] + var7);
        }
        if (arg0 <= 44) {
            method969((class206) null, 78);
        }
        class342.field5413.method298((byte) 66);
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 318)
    public class140() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lek;I)I", line = 323)
    public static final int method969(class206 arg0, int arg1) {
        int var2 = 0;
        field2369++;
        if (arg0.method1401(class39.field860, -2689)) {
            var2++;
        }
        if (arg0.method1401(class71.field1298, -2689)) {
            var2++;
        }
        if (arg0.method1401(class36.field784, -2689)) {
            var2++;
        }
        if (arg0.method1401(class117.field2085, -2689)) {
            var2++;
        }
        if (arg0.method1401(class90.field1604, arg1 ^ 0x47)) {
            var2++;
        }
        if (arg0.method1401(class164.field2756, -2689)) {
            var2++;
        }
        if (arg0.method1401(class91.field1625, -2689)) {
            var2++;
        }
        if (arg0.method1401(class31.field719, -2689)) {
            var2++;
        }
        if (arg0.method1401(class293.field4740, arg1 + 71)) {
            var2++;
        }
        if (arg0.method1401(class70.field1287, -2689)) {
            var2++;
        }
        if (arg0.method1401(class310.field5060, arg1 + 71)) {
            var2++;
        }
        if (arg1 != -2760) {
            return -114;
        }
        if (arg0.method1401(class244.field4050, -2689)) {
            var2++;
        }
        if (arg0.method1401(class143.field2401, -2689)) {
            var2++;
        }
        if (arg0.method1401(class355.field5668, -2689)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I", line = 391)
    public final int[] method125(int arg0, int arg1) {
        field2366++;
        if (arg0 != 2) {
            field2375 = (class124) null;
        }
        int[] var3 = this.field3166.method775(arg1, 125);
        if (this.field3166.field1903) {
            int var4 = class334.field5323 / this.field2377;
            int var5 = class26.field672 / this.field2373;
            int[] var6;
            if (var4 <= 0) {
                var6 = this.method1292(0, 0, -102);
            } else {
                int var7 = arg1 % var4;
                var6 = this.method1292(class334.field5323 * var7 / var4, 0, -75);
            }
            for (int var8 = 0; var8 < class26.field672; var8++) {
                if (var5 > 0) {
                    int var9 = var8 % var5;
                    var3[var8] = var6[class26.field672 * var9 / var5];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Laj;I)Z", line = 447)
    public static final boolean method970(class1 arg0, int arg1) {
        field2365++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field30) {
            return false;
        } else if (!arg0.method6((byte) -101)) {
            return false;
        } else if (class334.field5324.method2344(-1, (long) arg0.field33) != null) {
            return false;
        } else if (class321.field5219.method2344(-1, (long) arg0.field13) == null) {
            int var2 = 82 / ((arg1 - 19) / 49);
            return true;
        } else {
            return false;
        }
    }
}
