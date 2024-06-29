import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class308 extends class24 {

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "Lql;")
    public class87 field4786 = new class87();

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "Lie;")
    public class271 field4797 = new class271();

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "Loj;")
    private class284 field4795;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public static int field4780 = 0;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4779 = "Loaded update list";

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!bm", name = "E", descriptor = "Lki;")
    public static class180 field4791;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZB)V", line = 16)
    public static final void method2101(boolean arg0, byte arg1) {
        if (arg1 < 106) {
            method2102(60, (class33) null);
        }
        class152.field2289 = new int[104];
        field4789++;
        class234.field3729 = new int[104];
        class237.field3779 = 99;
        class137.field2160 = new int[5];
        class18.field244 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class1.field8 = new byte[var2][104][104];
        class228.field3626 = new byte[var2][105][105];
        class63.field1013 = new int[104];
        class339.field5307 = new byte[var2][104][104];
        class264.field4104 = new byte[var2][104][104];
        class61.field989 = new int[var2][105][105];
        class239.field3816 = new byte[var2][104][104];
        class247.field3920 = new int[104];
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()Lp;", line = 48)
    public final class24 method233() {
        field4784++;
        class132 var1;
        do {
            var1 = (class132) this.field4786.method638(98);
            if (var1 == null) {
                return null;
            }
        } while (var1.field2091 == null);
        return var1.field2091;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()Lp;", line = 71)
    public final class24 method232() {
        class132 var1 = (class132) this.field4786.method636(-1);
        field4785++;
        if (var1 == null) {
            return null;
        } else if (var1.field2091 == null) {
            return this.method233();
        } else {
            return var1.field2091;
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V", line = 88)
    public final void method235(int arg0) {
        field4796++;
        this.field4797.method235(arg0);
        for (class132 var2 = (class132) this.field4786.method636(-1); var2 != null; var2 = (class132) this.field4786.method638(44)) {
            if (!this.field4795.method1962((byte) 64, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field2068 >= var3) {
                        this.method2107(-1, var3, var2);
                        var2.field2068 -= var3;
                        break;
                    }
                    this.method2107(-1, var2.field2068, var2);
                    var3 -= var2.field2068;
                } while (!this.field4795.method1943(0, false, (int[]) null, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILqh;)V", line = 124)
    public static final void method2102(int arg0, class33 arg1) {
        field4781++;
        class239 var2 = (class239) class55.field917.method1222(arg0, class128.method926(arg1.field477, (byte) -67));
        if (var2 == null) {
            class11.method82(class205.field3101, (class85) null, arg1.field1938[0], (class313) null, arg1, arg1.field1910[0], 128, 0);
        } else {
            var2.method1664(-8187);
        }
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V", line = 140)
    public static void method2103(int arg0) {
        if (arg0 == 1048575) {
            field4791 = null;
            field4779 = null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "()I", line = 152)
    public final int method237() {
        field4783++;
        return 0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lcl;IIIIIIZ)V", line = 160)
    public static final void method2104(class157 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2365.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field2365[var9] - class217.field3306;
            int var11 = arg0.field2360[var9] - class17.field238;
            int var12 = arg0.field2359[var9] - class212.field3226;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field2369 != null) {
                class157.field2352[var9] = var13;
                class157.field2361[var9] = var16;
                class157.field2349[var9] = var17;
            }
            class157.field2348[var9] = (var13 << 9) / var17 + class15.field211;
            class157.field2368[var9] = (var16 << 9) / var17 + class15.field210;
        }
        class15.field208 = 0;
        int var19 = arg0.field2350.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field2350[var20];
            int var22 = arg0.field2357[var20];
            int var23 = arg0.field2366[var20];
            int var24 = class157.field2348[var21];
            int var25 = class157.field2348[var22];
            int var26 = class157.field2348[var23];
            int var27 = class157.field2368[var21];
            int var28 = class157.field2368[var22];
            int var29 = class157.field2368[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class174.field2639 && class316.method2148(class296.field4569 + class15.field211, class156.field2333 + class15.field210, var27, var28, var29, var24, var25, var26)) {
                    class143.field2222 = arg5;
                    class29.field428 = arg6;
                }
                if (!class94.field1516 && !arg7) {
                    class15.field206 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class15.field218 || var25 > class15.field218 || var26 > class15.field218) {
                        class15.field206 = true;
                    }
                    if (arg0.field2369 == null || arg0.field2369[var20] == -1) {
                        if (arg0.field2367[var20] != 12345678) {
                            class15.method124(var27, var28, var29, var24, var25, var26, arg0.field2367[var20], arg0.field2354[var20], arg0.field2351[var20]);
                        }
                    } else if (!class232.field3674) {
                        int var30 = class15.field207.method2085(arg0.field2369[var20], (byte) -84);
                        class15.method124(var27, var28, var29, var24, var25, var26, class309.method2109(var30, arg0.field2367[var20]), class309.method2109(var30, arg0.field2354[var20]), class309.method2109(var30, arg0.field2351[var20]));
                    } else if (arg0.field2358) {
                        class15.method112(var27, var28, var29, var24, var25, var26, arg0.field2367[var20], arg0.field2354[var20], arg0.field2351[var20], class157.field2352[0], class157.field2352[1], class157.field2352[3], class157.field2361[0], class157.field2361[1], class157.field2361[3], class157.field2349[0], class157.field2349[1], class157.field2349[3], arg0.field2369[var20]);
                    } else {
                        class15.method112(var27, var28, var29, var24, var25, var26, arg0.field2367[var20], arg0.field2354[var20], arg0.field2351[var20], class157.field2352[var21], class157.field2352[var22], class157.field2352[var23], class157.field2361[var21], class157.field2361[var22], class157.field2361[var23], class157.field2349[var21], class157.field2349[var22], class157.field2349[var23], arg0.field2369[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([IILrk;III)V", line = 278)
    private final void method2105(int[] arg0, int arg1, class132 arg2, int arg3, int arg4, int arg5) {
        if ((this.field4795.field4416[arg2.field2084] & 0x4) != 0 && arg2.field2072 < 0) {
            int var7 = this.field4795.field4434[arg2.field2084] / class220.field3413;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field2088) / var7;
                if (arg5 < var8) {
                    arg2.field2088 += arg5 * var7;
                    break;
                }
                arg5 -= var8;
                arg2.field2091.method234(arg0, arg4, var8);
                arg4 += var8;
                int var9 = class220.field3413 / 100;
                arg2.field2088 += var7 * var8 - 1048576;
                class330 var10 = arg2.field2091;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field4795.field4388[arg2.field2084] == 0) {
                    arg2.field2091 = class330.method2284(arg2.field2087, var10.method2287(), var10.method2265(), var10.method2261());
                } else {
                    arg2.field2091 = class330.method2284(arg2.field2087, var10.method2287(), 0, var10.method2261());
                    this.field4795.method1974(arg2.field2064.field2332[arg2.field2071] < 0, (byte) 115, arg2);
                    arg2.field2091.method2272(var9, var10.method2265());
                }
                if (arg2.field2064.field2332[arg2.field2071] < 0) {
                    arg2.field2091.method2270(-1);
                }
                var10.method2292(var9);
                var10.method234(arg0, arg4, arg3 - arg4);
                if (var10.method2255()) {
                    this.field4797.method1867(var10);
                }
            }
        }
        field4790++;
        arg2.field2091.method234(arg0, arg4, arg5);
        if (arg1 != -1) {
            method2101(true, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "([III)V", line = 340)
    public final void method234(int[] arg0, int arg1, int arg2) {
        this.field4797.method234(arg0, arg1, arg2);
        field4782++;
        for (class132 var4 = (class132) this.field4786.method636(-1); var4 != null; var4 = (class132) this.field4786.method638(90)) {
            if (!this.field4795.method1962((byte) 85, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field2068 >= var6) {
                        this.method2105(arg0, -1, var4, var5 + var6, var5, var6);
                        var4.field2068 -= var6;
                        break;
                    }
                    this.method2105(arg0, -1, var4, var5 + var6, var5, var4.field2068);
                    var6 -= var4.field2068;
                    var5 += var4.field2068;
                } while (!this.field4795.method1943(var5, false, arg0, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)V", line = 382)
    public static final void method2106(int arg0) {
        field4788++;
        boolean var1 = false;
        if (arg0 <= 75) {
            method2104((class157) null, 4, 27, 107, -99, 4, 6, false);
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class301.field4706 - 1; var2++) {
                if (class233.field3689[var2] < 1000 && class233.field3689[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class275.field4252[var2];
                    class275.field4252[var2] = class275.field4252[var2 + 1];
                    class275.field4252[var2 + 1] = var3;
                    String var4 = class32.field468[var2];
                    class32.field468[var2] = class32.field468[var2 + 1];
                    class32.field468[var2 + 1] = var4;
                    int var5 = class307.field4774[var2];
                    class307.field4774[var2] = class307.field4774[var2 + 1];
                    class307.field4774[var2 + 1] = var5;
                    int var6 = class95.field1528[var2];
                    class95.field1528[var2] = class95.field1528[var2 + 1];
                    class95.field1528[var2 + 1] = var6;
                    int var7 = class137.field2167[var2];
                    class137.field2167[var2] = class137.field2167[var2 + 1];
                    class137.field2167[var2 + 1] = var7;
                    short var8 = class233.field3689[var2];
                    class233.field3689[var2] = class233.field3689[var2 + 1];
                    class233.field3689[var2 + 1] = var8;
                    long var9 = class224.field3566[var2];
                    class224.field3566[var2] = class224.field3566[var2 + 1];
                    class224.field3566[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILrk;)V", line = 443)
    private final void method2107(int arg0, int arg1, class132 arg2) {
        field4793++;
        if (~(this.field4795.field4416[arg2.field2084] & 0x4) != arg0 && arg2.field2072 < 0) {
            int var4 = this.field4795.field4434[arg2.field2084] / class220.field3413;
            int var5 = (var4 + 1048575 - arg2.field2088) / var4;
            arg2.field2088 = arg1 * var4 + arg2.field2088 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field4795.field4388[arg2.field2084] == 0) {
                    arg2.field2091 = class330.method2284(arg2.field2087, arg2.field2091.method2287(), arg2.field2091.method2265(), arg2.field2091.method2261());
                } else {
                    arg2.field2091 = class330.method2284(arg2.field2087, arg2.field2091.method2287(), 0, arg2.field2091.method2261());
                    this.field4795.method1974(arg2.field2064.field2332[arg2.field2071] < 0, (byte) -94, arg2);
                }
                if (arg2.field2064.field2332[arg2.field2071] < 0) {
                    arg2.field2091.method2270(-1);
                }
                arg1 = arg2.field2088 / var4;
            }
        }
        arg2.field2091.method235(arg1);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Loj;)V", line = 485)
    public class308(class284 arg0) {
        this.field4795 = arg0;
    }
}
