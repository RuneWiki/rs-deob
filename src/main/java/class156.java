import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class156 extends class75 {

    @OriginalMember(owner = "client!gi", name = "Jb", descriptor = "Lwk;")
    public static class273 field2792 = new class273(50);

    @OriginalMember(owner = "client!gi", name = "Pb", descriptor = "Loa;")
    private static class99 field2798 = class221.method1463(2844, "Checking for updates )2 ");

    @OriginalMember(owner = "client!gi", name = "Sb", descriptor = "I")
    public static int field2801 = 0;

    @OriginalMember(owner = "client!gi", name = "Xb", descriptor = "Loa;")
    public static class99 field2806 = class221.method1463(2844, "m");

    @OriginalMember(owner = "client!gi", name = "bc", descriptor = "Loa;")
    public static class99 field2810 = class221.method1463(2844, "<img=1>");

    @OriginalMember(owner = "client!gi", name = "Zb", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "client!gi", name = "Yb", descriptor = "Loa;")
    public static class99 field2807 = field2798;

    @OriginalMember(owner = "client!gi", name = "Nb", descriptor = "Loa;")
    public static class99 field2796 = class221.method1463(2844, ")1o");

    @OriginalMember(owner = "client!gi", name = "dc", descriptor = "Loa;")
    public static class99 field2812 = class221.method1463(2844, "Regarder dans cette direction");

    @OriginalMember(owner = "client!gi", name = "Hb", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!gi", name = "Ib", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!gi", name = "Lb", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!gi", name = "Mb", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!gi", name = "Ob", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!gi", name = "Qb", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!gi", name = "Rb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!gi", name = "Tb", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!gi", name = "Vb", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!gi", name = "Wb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!gi", name = "ac", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!gi", name = "cc", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!gi", name = "ec", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!gi", name = "Ub", descriptor = "Ltg;")
    public static class182 field2803;

    @OriginalMember(owner = "client!gi", name = "Kb", descriptor = "Lii;")
    public class257 field2793;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BIIII)V")
    public static final void method1067(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2797;
        class65 var5 = class152.method1010(arg1, 8, (byte) -26);
        var5.method433(32);
        var5.field1094 = arg4;
        var5.field1085 = arg3;
        var5.field1092 = arg2;
        if (arg0 != -31) {
            field2798 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ltf;B)Z")
    public static final boolean method1068(class107 arg0, byte arg1) {
        ++field2805;
        if (arg1 != 15) {
            return false;
        } else if (arg0.field1855 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~arg0.field1855.length; ++var2) {
                int var3 = class99.method657(arg1 ^ -16, arg0, var2);
                int var4 = arg0.field1784[var2];
                if (arg0.field1855[var2] != 2) {
                    if (arg0.field1855[var2] == 3) {
                        if (~var4 <= ~var3) {
                            return false;
                        }
                    } else if (arg0.field1855[var2] != 4) {
                        if (~var3 != ~var4) {
                            return false;
                        }
                    } else if (~var3 == ~var4) {
                        return false;
                    }
                } else if (var4 <= var3) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)Loa;")
    public static final class99 method1069(int arg0, long arg1) {
        ++field2811;
        if (arg1 > 0L && arg1 < 6582952005840035281L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                if (arg0 > -78) {
                    return null;
                } else {
                    byte[] var6 = new byte[var3];
                    while (~arg1 != -1L) {
                        long var8 = arg1;
                        arg1 /= 37L;
                        --var3;
                        var6[var3] = class189.field3334[(int) (-(arg1 * 37L) + var8)];
                    }
                    class99 var7 = new class99();
                    var7.field1697 = var6;
                    var7.field1682 = var6.length;
                    return var7;
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)V")
    public static void method1070(byte arg0) {
        field2806 = null;
        if (arg0 == 124) {
            field2807 = null;
            field2812 = null;
            field2792 = null;
            field2810 = null;
            field2796 = null;
            field2803 = null;
            field2798 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field2790;
        if (super.field1271 != null) {
            super.field1271.method931();
        }
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)Z")
    public final boolean method526(int arg0) {
        if (arg0 < 3) {
            field2796 = null;
        }
        ++field2809;
        return this.field2793 != null;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)I")
    public static final int method1071(int arg0) {
        ++field2813;
        if (arg0 != 0) {
            method1068((class107) null, (byte) 48);
        }
        return class249.field4294.method1814((byte) 23);
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)Z")
    public static final boolean method1072(int arg0) {
        ++field2795;
        if (arg0 != 20066) {
            return false;
        } else {
            if (class37.field650) {
                try {
                    class180.field3138.method687(class24.field368.field1493, -26001);
                    return true;
                } catch (Throwable var1) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "()I")
    public final int method226() {
        ++field2802;
        return super.field1294;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILii;)V")
    public final void method1073(int arg0, class257 arg1) {
        ++field2794;
        if (arg0 != 0) {
            this.method320(125, 53, 47, 19, -74);
        }
        this.field2793 = arg1;
        if (super.field1271 != null) {
            super.field1271.method923();
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIJILkg;)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class136 arg10) {
        ++field2799;
        if (this.field2793 != null) {
            class270 var13 = super.field1284 != -1 && super.field1297 == 0 ? class38.method297(132, super.field1284) : null;
            class270 var14 = ~super.field1282 == 0 || super.field1308 == super.field1282 && var13 != null ? null : class38.method297(132, super.field1282);
            class195 var15 = this.field2793.method1665(var14, var13, super.field1321, super.field1299, (byte) 118);
            if (var15 != null) {
                super.field1294 = var15.method226();
                class257 var16 = this.field2793;
                if (var16.field4491 != null) {
                    var16 = var16.method1667(-24);
                }
                if (class64.field1084 && var16.field4482) {
                    class195 var17 = class67.method442(super.field1301, this.field2793.field4447, var14 == null ? super.field1321 : super.field1299, super.field1309, var15, this.field2793.field4449, super.field1319, this.field2793.field4469, var14 == null ? var13 : var14, this.field2793.field4487, arg0, super.field1325, (byte) 43, this.field2793.field4452);
                    var17.method233(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.field1271);
                }
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                if (~this.field2793.field4489 != -1 || ~this.field2793.field4471 != -1) {
                    int var21 = class134.field2339[arg0];
                    int var22 = class134.field2344[arg0];
                    short var23 = this.field2793.field4489;
                    short var24 = this.field2793.field4471;
                    int var25 = -var23 / 2;
                    int var26 = -var24 / 2;
                    int var27 = var21 * var26 + var22 * var25 >> 16;
                    int var28 = -var24 / 2;
                    int var29 = var22 * var26 + -(var21 * var25) >> 16;
                    int var30 = var23 / 2;
                    int var31 = var21 * var28 + var22 * var30 >> 16;
                    int var32 = class115.method777(-1, super.field1301 + var29, class255.field4407, super.field1325 + var27);
                    int var33 = var22 * var28 + -(var21 * var30) >> 16;
                    int var34 = class115.method777(-1, super.field1301 + var33, class255.field4407, super.field1325 + var31);
                    int var35 = var24 / 2;
                    int var36 = -var23 / 2;
                    int var37 = var21 * var35 + var22 * var36 >> 16;
                    int var38 = var22 * var35 + -(var21 * var36) >> 16;
                    int var39 = var23 / 2;
                    int var40 = var24 / 2;
                    int var41 = class115.method777(-1, super.field1301 + var38, class255.field4407, super.field1325 + var37);
                    int var42 = var21 * var40 + var22 * var39 >> 16;
                    int var43 = ~var34 < ~var32 ? var32 : var34;
                    int var44 = var22 * var40 - var21 * var39 >> 16;
                    int var45 = ~var41 >= ~var32 ? var41 : var32;
                    int var46 = class115.method777(-1, super.field1301 + var44, class255.field4407, super.field1325 + var42);
                    int var47 = ~var46 >= ~var41 ? var46 : var41;
                    int var48 = var32 + var46;
                    int var49 = var46 > var34 ? var34 : var46;
                    if (~var48 < ~(var34 + var41)) {
                        var48 = var34 + var41;
                    }
                    if (var24 != 0) {
                        var19 = 2047 & (int) (325.95D * Math.atan2((double) (var43 - var47), (double) var24));
                        if (var19 != 0) {
                            var15.method200(var19);
                        }
                    }
                    if (var23 != 0) {
                        var20 = 2047 & (int) (Math.atan2((double) (-var49 + var45), (double) var23) * 325.95D);
                        if (var20 != 0) {
                            var15.method218(var20);
                        }
                    }
                    var18 = (var48 >> 1) + -super.field1319;
                    if (~var18 != -1) {
                        var15.method231(0, var18, 0);
                    }
                }
                class195 var50 = null;
                if (~super.field1313 != 0 && ~super.field1295 != 0) {
                    class180 var51 = class90.method610(super.field1313, true);
                    var50 = var51.method1206(19, super.field1295);
                    if (var50 != null) {
                        var50.method231(0, -super.field1277, 0);
                        if (var51.field3145) {
                            if (var19 != 0) {
                                var50.method200(var19);
                            }
                            if (var20 != 0) {
                                var50.method218(var20);
                            }
                            if (var18 != 0) {
                                var50.method231(0, var18, 0);
                            }
                        }
                    }
                }
                if (var50 != null) {
                    var15 = ((class27) var15).method224(var50);
                }
                this.method525((byte) 90, var15);
                if (~this.field2793.field4469 == -2) {
                    var15.field3411 = true;
                }
                var15.method233(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field1271);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)V")
    public final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2791;
        if (this.field2793 != null) {
            if (!super.field1288) {
                class270 var6 = super.field1284 != -1 && super.field1297 == 0 ? class38.method297(132, super.field1284) : null;
                class270 var7 = ~super.field1282 == 0 || ~super.field1308 == ~super.field1282 && var6 != null ? null : class38.method297(132, super.field1282);
                class195 var8 = this.field2793.method1665(var7, var6, super.field1321, super.field1299, (byte) 119);
                if (var8 == null) {
                    return;
                }
                this.method525((byte) 90, var8);
            }
            if (super.field1271 != null) {
                super.field1271.method922(arg0, arg1, arg3, arg2, arg4);
            }
        }
    }
}
