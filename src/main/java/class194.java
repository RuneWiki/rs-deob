import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class194 extends class43 {

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
    public boolean field2278;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[Lsb;")
    public class194[] field2284;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Lcq;")
    public static class72 field2291 = new class72("K", "T", "K", "K");

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "Z")
    public static boolean field2296 = true;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Z")
    public static boolean field2297 = false;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "Lcq;")
    public static class72 field2299 = new class72("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field2282;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lnk;")
    public class267 field2283;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "Lle;")
    public class283 field2292;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
    public int method1197(int arg0) {
        field2286++;
        if (arg0 != 0) {
            field2297 = false;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static final void method1198(int arg0) {
        field2300++;
        if (arg0 <= 48) {
            method1204(false, -46, -78, -84);
        }
        class7 var1 = null;
        try {
            class315 var2 = class401.field5525.method2710(0);
            while (var2.field4244 == 0) {
                class219.method1330(1L, true);
            }
            if (var2.field4244 == 1) {
                var1 = (class7) var2.field4243;
                byte[] var3 = new byte[(int) var1.method34(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method33(var4, 11150, var3.length - var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class427.method2606((byte) -74, new class242(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method32((byte) -99);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILbg;)V")
    public void method54(int arg0, int arg1, class242 arg2) {
        int var4 = -71 % ((arg1 - 52) / 61);
        field2280++;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)I")
    public int method1199(int arg0) {
        if (arg0 != -1) {
            this.method1199(-6);
        }
        field2289++;
        return -1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)[[I")
    public final int[][] method1200(int arg0, int arg1, int arg2) {
        if (arg0 != 60) {
            method1201(113);
        }
        field2295++;
        if (this.field2284[arg2].field2278) {
            int[] var4 = this.field2284[arg2].method55(arg1, 9);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2284[arg2].method59(-730, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)[I")
    public int[] method55(int arg0, int arg1) {
        int var3 = 109 / ((arg1 - 57) / 46);
        field2294++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field2291 = null;
        field2299 = null;
        if (arg0 > -4) {
            field2298 = 28;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)V")
    public void method1202(int arg0, int arg1, int arg2) {
        field2293++;
        int var4 = this.field2282 == 255 ? arg1 : this.field2282;
        if (this.field2278) {
            this.field2292 = new class283(var4, arg1, arg0);
        } else {
            this.field2283 = new class267(var4, arg1, arg0);
        }
        if (arg2 != 1) {
            this.method1199(108);
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(III)[I")
    public final int[] method1203(int arg0, int arg1, int arg2) {
        if (arg1 < 56) {
            method1201(-33);
        }
        field2290++;
        return this.field2284[arg0].field2278 ? this.field2284[arg0].method55(arg2, -93) : this.field2284[arg0].method59(-730, arg2)[0];
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZIII)Lki;")
    public static final class204 method1204(boolean arg0, int arg1, int arg2, int arg3) {
        field2287++;
        class316 var4 = class347.field4722[arg3][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class204 var5 = null;
        int var6 = -1;
        for (class272 var7 = var4.field4256; var7 != null; var7 = var7.field3514) {
            class133 var8 = var7.field3512;
            if (var8 instanceof class204) {
                class204 var9 = (class204) var8;
                int var10 = (var9.method841(true) - 1) * 64 + 60;
                int var11 = var9.field1516 - var10 >> 7;
                int var12 = var9.field1514 - var10 >> 7;
                int var13 = var9.field1516 + var10 >> 7;
                int var14 = var9.field1514 + var10 >> 7;
                if (arg1 >= var11 && arg2 >= var12 && var13 >= arg1 && arg2 <= var14) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
                    if (var15 > var6) {
                        var5 = var9;
                        var6 = var15;
                    }
                }
            }
        }
        if (!arg0) {
            method1205(-57, (class242) null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILbg;)V")
    public static final void method1205(int arg0, class242 arg1) {
        field2279++;
        int var2 = arg1.method1559((byte) -44);
        class419.field5724 = new class54[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class419.field5724[var3] = new class54();
            class419.field5724[var3].field629 = arg1.method1559((byte) -80);
            class419.field5724[var3].field634 = arg1.method1571(0);
        }
        class137.field1552 = arg1.method1559((byte) -58);
        class282.field3686 = arg1.method1559((byte) -113);
        class258.field3340 = arg1.method1559((byte) -56);
        class134.field1537 = new class27[class282.field3686 - (class137.field1552 - 1)];
        for (int var4 = 0; var4 < class258.field3340; var4++) {
            int var5 = arg1.method1559((byte) -50);
            class27 var6 = class134.field1537[var5] = new class27();
            var6.field5318 = arg1.method1563(-128);
            var6.field5322 = arg1.method1576((byte) 124);
            var6.field299 = class137.field1552 + var5;
            var6.field302 = arg1.method1571(0);
            var6.field301 = arg1.method1571(0);
        }
        class127.field1414 = arg1.method1576((byte) 124);
        if (arg0 < 122) {
            method1204(false, 91, -61, 58);
        }
        class236.field3103 = true;
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
    public void method280(int arg0) {
        int var2 = 13 % ((28 - arg0) / 63);
        field2281++;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V")
    public void method1206(int arg0) {
        if (arg0 != 11097) {
            this.field2282 = -15;
        }
        field2285++;
        if (this.field2278) {
            this.field2292.method1782(-5821);
            this.field2292 = null;
        } else {
            this.field2283.method1670((byte) 101);
            this.field2283 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZZZ)I")
    public static final int method1207(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field2288++;
        class391 var5 = class70.method415(Integer.MIN_VALUE, arg0, arg3);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        if (!arg2) {
            method1198(-43);
        }
        for (int var7 = 0; var7 < var5.field5330.length; var7++) {
            if (var5.field5330[var7] >= 0 && class126.field1413 > var5.field5330[var7]) {
                class59 var8 = class131.method843((byte) 5, var5.field5330[var7]);
                int var9 = var8.method341((byte) 110, arg1, class450.method2783(arg1, (byte) 101).field4814);
                if (arg4) {
                    var6 += var5.field5332[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(IZ)V")
    public class194(int arg0, boolean arg1) {
        this.field2278 = arg1;
        this.field2284 = new class194[arg0];
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[[I")
    public int[][] method59(int arg0, int arg1) {
        field2277++;
        if (arg0 != -730) {
            this.field2292 = null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }
}
