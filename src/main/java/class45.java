import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class45 extends class256 {

    @OriginalMember(owner = "client!qd", name = "cc", descriptor = "S")
    public static short field642 = 205;

    @OriginalMember(owner = "client!qd", name = "dc", descriptor = "Z")
    public static boolean field643 = false;

    @OriginalMember(owner = "client!qd", name = "mc", descriptor = "Lsf;")
    public static class108 field652 = class140.method973(255, "m");

    @OriginalMember(owner = "client!qd", name = "pc", descriptor = "Lsf;")
    public static class108 field655 = class155.method1084(160, false);

    @OriginalMember(owner = "client!qd", name = "qc", descriptor = "I")
    public static int field656 = 0;

    @OriginalMember(owner = "client!qd", name = "Zb", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!qd", name = "ac", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!qd", name = "bc", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!qd", name = "ec", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!qd", name = "fc", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!qd", name = "hc", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!qd", name = "ic", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!qd", name = "jc", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!qd", name = "kc", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!qd", name = "lc", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!qd", name = "nc", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!qd", name = "oc", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!qd", name = "gc", descriptor = "Lmh;")
    public class136 field646;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILmh;)V", line = 4)
    public final void method317(int arg0, class136 arg1) {
        field639++;
        this.field646 = arg1;
        if (this.field4468 != null) {
            this.field4468.method1155();
        }
        if (arg0 != 0) {
            field656 = 114;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 31)
    public static void method318(int arg0) {
        if (arg0 <= 45) {
            field656 = 48;
        }
        field655 = null;
        field652 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Z", line = 42)
    public final boolean method319(boolean arg0) {
        if (arg0) {
            field641++;
            return this.field646 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(Z)V", line = 58)
    public static final void method320(boolean arg0) {
        if (class206.field3694 != null) {
            class141 var1 = class206.field3694;
            synchronized (class206.field3694) {
                class206.field3694 = null;
            }
        }
        field650++;
        if (arg0) {
            field642 = 57;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)I", line = 75)
    public static final int method321(int arg0, int arg1, int arg2, int arg3) {
        field651++;
        if (class278.field4883 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class166.field2980[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = -78 % ((44 - arg0) / 62);
        int var9 = arg1 & 0x7F;
        int var10 = (128 - var7) * class278.field4883[var6][var4][var5] + (class278.field4883[var6][var4 + 1][var5] * var7) >> 7;
        int var11 = (128 - var7) * class278.field4883[var6][var4][var5 + 1] + class278.field4883[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V", line = 108)
    public static final void method322(int arg0, byte arg1) {
        field647++;
        class120 var2 = class248.method1704(6, 46, arg0);
        if (arg1 != 34) {
            field656 = -100;
        }
        var2.method843((byte) 28);
    }

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V", line = 135)
    protected final void finalize() {
        if (this.field4468 != null) {
            this.field4468.method1158();
        }
        field649++;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()I", line = 146)
    public final int method95() {
        field654++;
        return this.field4488;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)Z", line = 157)
    public static final boolean method323(int arg0) {
        if (arg0 != -104) {
            method321(-94, -8, -123, 34);
        }
        field645++;
        if (class19.field281) {
            try {
                class74.field1125.method752(30488, class289.field5052.field2441);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIIJILac;)V", line = 179)
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class165 arg10) {
        field640++;
        if (this.field646 == null) {
            return;
        }
        class272 var13 = this.field4492 != -1 && this.field4521 == 0 ? class149.method1063(this.field4492, -18767) : null;
        class272 var14 = this.field4472 == -1 || this.field4472 == this.field4455 && var13 != null ? null : class149.method1063(this.field4472, -18767);
        class113 var15 = this.field646.method928(this.field4453, (byte) 125, var13, this.field4499, var14);
        if (var15 == null) {
            return;
        }
        this.field4488 = var15.method95();
        class136 var16 = this.field646;
        if (var16.field2396 != null) {
            var16 = var16.method938((byte) -35);
        }
        if (class180.field3280 && var16.field2374) {
            class113 var17 = class64.method441(arg0, -1153, this.field4457, this.field646.field2415, this.field4479, var15, this.field646.field2385, var14 == null ? this.field4453 : this.field4499, var14 == null ? var13 : var14, this.field4464, this.field646.field2406, this.field646.field2412, this.field646.field2381, this.field4452);
            if (class231.field4051) {
                float var18 = class231.method1592();
                float var19 = class231.method1575();
                class231.method1591();
                class231.method1593(var18, var19 - 150.0F);
                var17.method98(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4468);
                class231.method1570();
                class231.method1593(var18, var19);
            } else {
                var17.method98(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field4468);
            }
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (this.field646.field2376 != 0 || this.field646.field2402 != 0) {
            int var23 = class263.field4653[arg0];
            int var24 = class263.field4649[arg0];
            short var25 = this.field646.field2376;
            short var26 = this.field646.field2402;
            int var27 = -var25 / 2;
            int var28 = -var26 / 2;
            int var29 = var23 * var28 + var24 * var27 >> 16;
            int var30 = var24 * var28 - (var23 * var27) >> 16;
            int var31 = method321(-100, this.field4457 + var30, this.field4452 - -var29, class295.field5159);
            int var32 = var25 / 2;
            int var33 = -var26 / 2;
            int var34 = var23 * var33 + var24 * var32 >> 16;
            int var35 = var24 * var33 - (var23 * var32) >> 16;
            int var36 = -var25 / 2;
            int var37 = method321(-125, this.field4457 + var35, this.field4452 + var34, class295.field5159);
            int var38 = var26 / 2;
            int var39 = var23 * var38 + var24 * var36 >> 16;
            int var40 = var24 * var38 - (var23 * var36) >> 16;
            int var41 = method321(-118, this.field4457 + var40, this.field4452 + var39, class295.field5159);
            int var42 = var25 / 2;
            int var43 = var26 / 2;
            int var44 = var24 * var43 - (var23 * var42) >> 16;
            int var45 = var23 * var43 + var24 * var42 >> 16;
            int var46 = var37 > var31 ? var31 : var37;
            int var47 = method321(-55, this.field4457 + var44, this.field4452 + var45, class295.field5159);
            int var48 = var47 > var41 ? var41 : var47;
            int var49 = var31 + var47;
            int var50 = var31 >= var41 ? var41 : var31;
            int var51 = var37 >= var47 ? var47 : var37;
            if (var26 != 0) {
                var21 = (int) (Math.atan2((double) (var46 - var48), (double) var26) * 325.95D) & 0x7FF;
                if (var21 != 0) {
                    var15.method307(var21);
                }
            }
            if (var49 > (var37 + var41)) {
                var49 = var37 + var41;
            }
            if (var25 != 0) {
                var20 = (int) (Math.atan2((double) (var50 - var51), (double) var25) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var15.method290(var20);
                }
            }
            var22 = (var49 >> 1) - this.field4464;
            if (var22 != 0) {
                var15.method312(0, var22, 0);
            }
        }
        class113 var52 = null;
        if (this.field4500 != -1 && this.field4450 != -1) {
            class305 var53 = class152.method1074((byte) 112, this.field4500);
            var52 = var53.method2144(126, this.field4450);
            if (var52 != null) {
                var52.method312(0, -this.field4517, 0);
                if (var53.field5294) {
                    if (var21 != 0) {
                        var52.method307(var21);
                    }
                    if (var20 != 0) {
                        var52.method290(var20);
                    }
                    if (var22 != 0) {
                        var52.method312(0, var22, 0);
                    }
                }
            }
        }
        if (!class231.field4051) {
            if (var52 != null) {
                var15 = ((class44) var15).method294(var52);
            }
            this.method1811(16705, var15);
            if (this.field646.field2381 == 1) {
                var15.field1950 = true;
            }
            var15.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4468);
            return;
        }
        this.method1811(16705, var15);
        if (this.field646.field2381 == 1) {
            var15.field1950 = true;
        }
        var15.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4468);
        if (var52 == null) {
            return;
        }
        if (this.field646.field2381 == 1) {
            var52.field1950 = true;
        }
        if (this.field4468 != null) {
            class148 var54 = (class148) var52;
            this.field4468.method1141(var54.field2678, var54.field2658, true, var54.field2679, var54.field2692, var54.field2674);
        }
        var52.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4468);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V", line = 394)
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field648++;
        if (this.field646 == null) {
            return;
        }
        if (!this.field4481) {
            class272 var6 = this.field4492 != -1 && this.field4521 == 0 ? class149.method1063(this.field4492, -18767) : null;
            class272 var7 = this.field4472 == -1 || this.field4472 == this.field4455 && var6 != null ? null : class149.method1063(this.field4472, -18767);
            class113 var8 = this.field646.method928(this.field4453, (byte) -47, var6, this.field4499, var7);
            if (var8 == null) {
                return;
            }
            this.method1811(16705, var8);
        }
        if (this.field4468 != null) {
            this.field4468.method1157(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIB)Lca;", line = 432)
    public static final class98 method324(int arg0, int arg1, byte arg2) {
        if (arg2 != 77) {
            method318(-109);
        }
        field644++;
        class98 var3 = class168.method1173(arg1, -1456948048);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field1636 == null || arg0 >= var3.field1636.length) {
            return null;
        } else {
            return var3.field1636[arg0];
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)J", line = 453)
    public static final long method325(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        return var3 == null || var3.field1141 == null ? 0L : var3.field1141.field4560;
    }
}
