import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class130 extends class222 {

    @OriginalMember(owner = "client!uj", name = "gb", descriptor = "I")
    private int field2320 = 0;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    private int field2314 = 0;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    private int field2313 = 0;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    public static int field2312 = 0;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    public static int field2315 = 0;

    @OriginalMember(owner = "client!uj", name = "ib", descriptor = "Lsb;")
    public static class98 field2322 = class47.method368("Freie Welt", 0);

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    private int field2310;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!uj", name = "eb", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!uj", name = "fb", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!uj", name = "hb", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!uj", name = "jb", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!uj", name = "kb", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!uj", name = "lb", descriptor = "I")
    private int field2325;

    @OriginalMember(owner = "client!uj", name = "mb", descriptor = "I")
    private int field2326;

    @OriginalMember(owner = "client!uj", name = "nb", descriptor = "I")
    private int field2327;

    @OriginalMember(owner = "client!uj", name = "ob", descriptor = "I")
    private int field2328;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "Lic;")
    public static class251 field2311;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
    public static void method985(int arg0) {
        field2311 = null;
        if (arg0 != -1365) {
            method986(-9);
        }
        field2322 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method986(-78);
        }
        ++field2324;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field2313 = (arg0.method1472(107) << 12) / 100;
                }
            } else {
                this.field2314 = (arg0.method1472(63) << 12) / 100;
            }
        } else {
            this.field2320 = arg0.method1483(-98);
        }
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
    public static final void method986(int arg0) {
        ++field2319;
        int var1 = class8.field133 * 128 + 64;
        if (arg0 != 1000) {
            method985(-123);
        }
        int var2 = class90.field1582 * 128 - -64;
        int var3 = class70.method480(class265.field4640, (byte) 126, var1, var2) + -class13.field249;
        if (~class254.field4443 <= -101) {
            class20.field361 = class90.field1582 * 128 + 64;
            class6.field86 = class8.field133 * 128 + 64;
            class122.field2239 = class70.method480(class265.field4640, (byte) 126, class6.field86, class20.field361) - class13.field249;
        } else {
            if (~var1 < ~class6.field86) {
                class6.field86 += (var1 - class6.field86) * class254.field4443 / 1000 + class232.field3987;
                if (~class6.field86 < ~var1) {
                    class6.field86 = var1;
                }
            }
            if (~var2 < ~class20.field361) {
                class20.field361 += (-class20.field361 + var2) * class254.field4443 / 1000 + class232.field3987;
                if (~var2 > ~class20.field361) {
                    class20.field361 = var2;
                }
            }
            if (~var2 > ~class20.field361) {
                class20.field361 -= (-var2 + class20.field361) * class254.field4443 / 1000 + class232.field3987;
                if (var2 > class20.field361) {
                    class20.field361 = var2;
                }
            }
            if (~var3 < ~class122.field2239) {
                class122.field2239 += (-class122.field2239 + var3) * class254.field4443 / 1000 + class232.field3987;
                if (~var3 > ~class122.field2239) {
                    class122.field2239 = var3;
                }
            }
            if (var3 < class122.field2239) {
                class122.field2239 -= (class122.field2239 - var3) * class254.field4443 / 1000 + class232.field3987;
                if (~var3 < ~class122.field2239) {
                    class122.field2239 = var3;
                }
            }
            if (var1 < class6.field86) {
                class6.field86 -= class232.field3987 - -((-var1 + class6.field86) * class254.field4443 / 1000);
                if (class6.field86 < var1) {
                    class6.field86 = var1;
                }
            }
        }
        int var4 = class53.field860 * 128 + 64;
        int var5 = class118.field2116 * 128 - -64;
        int var6 = class70.method480(class265.field4640, (byte) 126, var4, var5) - class96.field1648;
        int var7 = -class122.field2239 + var6;
        int var8 = var5 - class20.field361;
        int var9 = -class6.field86 + var4;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (325.949D * Math.atan2((double) var7, (double) var10)) & 2047;
        int var12 = 2047 & (int) (Math.atan2((double) var9, (double) var8) * -325.949D);
        if (var11 < 128) {
            var11 = 128;
        }
        if (~var11 < -384) {
            var11 = 383;
        }
        if (var11 > class224.field3864) {
            class224.field3864 += class245.field4317 - -((-class224.field3864 + var11) * class6.field88 / 1000);
            if (~var11 > ~class224.field3864) {
                class224.field3864 = var11;
            }
        }
        int var13 = -class81.field1430 + var12;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (~class224.field3864 < ~var11) {
            class224.field3864 -= class245.field4317 - -((-var11 + class224.field3864) * class6.field88 / 1000);
            if (class224.field3864 < var11) {
                class224.field3864 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class81.field1430 += class6.field88 * var13 / 1000 + class245.field4317;
            class81.field1430 &= 2047;
        }
        if (var13 < 0) {
            class81.field1430 -= -var13 * class6.field88 / 1000 + class245.field4317;
            class81.field1430 &= 2047;
        }
        int var14 = var12 - class81.field1430;
        if (~var14 < -1025) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (~var14 > -1 && ~var13 < -1 || ~var14 < -1 && var13 < 0) {
            class81.field1430 = var12;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field2323;
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (super.field3834.field1486) {
            int[][] var4 = this.method1531(arg0, 0, 112);
            int[] var5 = var3[0];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            for (int var11 = 0; class13.field253 > var11; ++var11) {
                this.method988(var7[var11], (byte) -121, var10[var11], var6[var11]);
                this.field2310 += this.field2320;
                this.field2325 += this.field2313;
                if (this.field2325 < 0) {
                    this.field2325 = 0;
                }
                if (this.field2325 > 4096) {
                    this.field2325 = 4096;
                }
                this.field2327 += this.field2314;
                while (this.field2310 < 0) {
                    this.field2310 += 4096;
                }
                while (~this.field2310 < -4097) {
                    this.field2310 -= 4096;
                }
                if (~this.field2327 > -1) {
                    this.field2327 = 0;
                }
                if (this.field2327 > 4096) {
                    this.field2327 = 4096;
                }
                this.method987(this.field2310, this.field2325, 13, this.field2327);
                var5[var11] = this.field2318;
                var9[var11] = this.field2326;
                var8[var11] = this.field2328;
            }
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class130() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
    private final void method987(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 11) {
            this.method4(-122, -124);
        }
        ++field2321;
        int var5 = arg1 <= 2048 ? (arg3 + 4096) * arg1 >> 12 : -(arg1 * arg3 >> 12) + arg3 + arg1;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = var6 >> 12;
            int var8 = arg1 + arg1 + -var5;
            int var9 = -(var7 << 12) + var6;
            int var10 = (-var8 + var5 << 12) / var5;
            int var12 = var10 * var5 >> 12;
            int var13 = var9 * var12 >> 12;
            int var14 = var8 + var13;
            int var15 = -var13 + var5;
            if (var7 == 0) {
                this.field2318 = var5;
                this.field2328 = var8;
                this.field2326 = var14;
                return;
            }
            if (~var7 == -2) {
                this.field2326 = var5;
                this.field2328 = var8;
                this.field2318 = var15;
                return;
            }
            if (~var7 == -3) {
                this.field2318 = var8;
                this.field2328 = var14;
                this.field2326 = var5;
                return;
            }
            if (var7 == 3) {
                this.field2318 = var8;
                this.field2326 = var15;
                this.field2328 = var5;
                return;
            }
            if (~var7 == -5) {
                this.field2318 = var14;
                this.field2326 = var8;
                this.field2328 = var5;
                return;
            }
            if (~var7 == -6) {
                this.field2326 = var8;
                this.field2318 = var5;
                this.field2328 = var15;
                return;
            }
        } else {
            this.field2318 = this.field2326 = this.field2328 = arg1;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBII)V")
    private final void method988(int arg0, byte arg1, int arg2, int arg3) {
        ++field2316;
        int var5 = ~arg3 < ~arg0 ? arg3 : arg0;
        int var6 = arg0 > arg3 ? arg3 : arg0;
        int var7 = arg2 <= var5 ? var5 : arg2;
        int var8 = arg2 >= var6 ? var6 : arg2;
        this.field2325 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (~this.field2325 < -1 && this.field2325 < 4096) {
            this.field2327 = (var9 << 12) / (this.field2325 > 2048 ? -(this.field2325 * 2) + 8192 : this.field2325 * 2);
        } else {
            this.field2327 = 0;
        }
        int var10 = 112 % ((arg1 - -60) / 58);
        if (~var9 >= -1) {
            this.field2310 = 0;
        } else {
            int var11 = (-arg0 + var7 << 12) / var9;
            int var12 = (var7 - arg3 << 12) / var9;
            int var13 = (-arg2 + var7 << 12) / var9;
            if (arg3 == var7) {
                this.field2310 = arg0 != var8 ? -var11 + 4096 : var13 + 20480;
            } else if (~arg0 != ~var7) {
                this.field2310 = arg3 != var8 ? -var12 + 20480 : 12288 - -var11;
            } else {
                this.field2310 = arg2 != var8 ? -var13 + 12288 : var12 + 4096;
            }
            this.field2310 /= 6;
        }
    }
}
