import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class39 extends class28 {

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "Z")
    public boolean field898 = true;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "Lvf;")
    public static class265 field880 = class87.method582(-46, "Cache:");

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "J")
    public static long field896 = 0L;

    @OriginalMember(owner = "client!lj", name = "cb", descriptor = "Lvf;")
    private static class265 field902 = class87.method582(-46, "Loaded wordpack");

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "Lvf;")
    public static class265 field893 = field902;

    @OriginalMember(owner = "client!lj", name = "gb", descriptor = "I")
    public static int field906 = 2;

    @OriginalMember(owner = "client!lj", name = "eb", descriptor = "[I")
    public static int[] field904 = new int[25];

    @OriginalMember(owner = "client!lj", name = "ib", descriptor = "I")
    public static int field908 = 0;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "[I")
    public static int[] field897 = new int[2];

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!lj", name = "ab", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!lj", name = "bb", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!lj", name = "db", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!lj", name = "fb", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "[I")
    private int[] field894;

    @OriginalMember(owner = "client!lj", name = "hb", descriptor = "[I")
    public int[] field907;

    @OriginalMember(owner = "client!lj", name = "Z", descriptor = "[Lvf;")
    private class265[] field899;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "[[I")
    private int[][] field888;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILng;)V")
    public final void method319(int arg0, class135 arg1) {
        if (arg0 != 0) {
            method325(-83, -21, 9, -51, 71, 40, -61, -42, false, 64, 12, -7);
        }
        field882++;
        while (true) {
            int var3 = arg1.method920((byte) 67);
            if (var3 == 0) {
                return;
            }
            this.method324(arg1, var3, 3);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILvf;I)V")
    public static final void method320(int arg0, class265 arg1, int arg2) {
        field886++;
        class55.field1133.method1863(true, 120);
        class55.field1133.method923(48, arg1.method1793(43));
        class265.field4644++;
        if (arg2 >= 103) {
            class55.field1133.method903((byte) 36, arg0);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(IIB)I")
    public final int method321(int arg0, int arg1, byte arg2) {
        field895++;
        if (this.field894 == null || arg0 < 0 || this.field894.length < arg0) {
            return -1;
        } else {
            if (arg2 < 98) {
                this.field899 = null;
            }
            return this.field888[arg0] == null || arg1 < 0 || arg1 > this.field888[arg0].length ? -1 : this.field888[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lng;B[I)V")
    public final void method322(class135 arg0, byte arg1, int[] arg2) {
        if (arg1 != 15) {
            this.method322((class135) null, (byte) 52, (int[]) null);
        }
        field903++;
        if (this.field894 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field894.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class25.field691[this.method330(9080, var4)];
            if (var5 > 0) {
                arg0.method930(false, var5, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLng;)Lvf;")
    public final class265 method323(byte arg0, class135 arg1) {
        if (arg0 >= -103) {
            return null;
        }
        class265 var3 = class254.method1675(80, (byte) 18);
        field889++;
        if (this.field894 != null) {
            for (int var4 = 0; var4 < this.field894.length; var4++) {
                var3.method1807((byte) 116, this.field899[var4]);
                var3.method1807((byte) 116, class67.method478(this.field888[var4], arg1.method907(class189.field3396[this.field894[var4]], 63), (byte) -51, this.field894[var4]));
            }
        }
        var3.method1807((byte) 114, this.field899[this.field899.length - 1]);
        return var3.method1809((byte) -41);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lng;II)V")
    private final void method324(class135 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field894 = null;
        }
        if (arg1 == 1) {
            this.field899 = arg0.method942(false).method1797(6722, 60);
        } else if (arg1 == 2) {
            int var4 = arg0.method920((byte) 123);
            this.field907 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field907[var5] = arg0.method927(126);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method920((byte) 111);
            this.field894 = new int[var6];
            this.field888 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method927(126);
                this.field894[var7] = var8;
                this.field888[var7] = new int[class281.field4964[var8]];
                for (int var9 = 0; var9 < class281.field4964[var8]; var9++) {
                    this.field888[var7][var9] = arg0.method927(127);
                }
            }
        } else if (arg1 == 4) {
            this.field898 = false;
        }
        field892++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field884++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class93.field1657[var12][var31] = 0;
                class258.field4444[var12][var31] = 99999999;
            }
        }
        class93.field1657[arg5][arg9] = 99;
        class258.field4444[arg5][arg9] = 0;
        int var13 = arg5;
        int var14 = arg9;
        if (arg6 != 30253) {
            field893 = null;
        }
        byte var15 = 0;
        boolean var16 = false;
        int var17 = 0;
        class8.field268[var15] = arg5;
        int var32 = var15 + 1;
        class80.field1513[var15] = arg9;
        int[][] var18 = class130.field2279[class216.field3902].field4422;
        while (var32 != var17) {
            var13 = class8.field268[var17];
            var14 = class80.field1513[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg3 == var13 && arg11 == var14) {
                var16 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class130.field2279[class216.field3902].method1684(arg7 - 1, var13, arg11, (byte) 5, var14, 1, arg3, arg4)) {
                    var16 = true;
                    break;
                }
                if (arg7 < 10 && class130.field2279[class216.field3902].method1688(var14, var13, arg4, arg11, arg7 - 1, (byte) -121, 1, arg3)) {
                    var16 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg0 != 0 && class130.field2279[class216.field3902].method1698((byte) -127, arg1, arg2, arg11, var13, 1, var14, arg0, arg3)) {
                var16 = true;
                break;
            }
            int var30 = class258.field4444[var13][var14] + 1;
            if (var13 > 0 && class93.field1657[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class8.field268[var32] = var13 - 1;
                class80.field1513[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class93.field1657[var13 - 1][var14] = 2;
                class258.field4444[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class93.field1657[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class8.field268[var32] = var13 + 1;
                class80.field1513[var32] = var14;
                class93.field1657[var13 + 1][var14] = 8;
                var32 = var32 + 1 & 0xFFF;
                class258.field4444[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class93.field1657[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class8.field268[var32] = var13;
                class80.field1513[var32] = var14 - 1;
                class93.field1657[var13][var14 - 1] = 1;
                class258.field4444[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class93.field1657[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class8.field268[var32] = var13;
                class80.field1513[var32] = var14 + 1;
                class93.field1657[var13][var14 + 1] = 4;
                class258.field4444[var13][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class93.field1657[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class8.field268[var32] = var13 - 1;
                class80.field1513[var32] = var14 - 1;
                class93.field1657[var13 - 1][var14 - 1] = 3;
                class258.field4444[var13 - 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 103 && var14 > 0 && class93.field1657[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class8.field268[var32] = var13 + 1;
                class80.field1513[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1657[var13 + 1][var14 - 1] = 9;
                class258.field4444[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 103 && class93.field1657[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class8.field268[var32] = var13 - 1;
                class80.field1513[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1657[var13 - 1][var14 + 1] = 6;
                class258.field4444[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && class93.field1657[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class8.field268[var32] = var13 + 1;
                class80.field1513[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1657[var13 + 1][var14 + 1] = 12;
                class258.field4444[var13 + 1][var14 + 1] = var30;
            }
        }
        class242.field4210 = 0;
        if (!var16) {
            if (!arg8) {
                return false;
            }
            byte var19 = 10;
            int var20 = 100;
            int var21 = 1000;
            for (int var22 = arg3 - var19; var22 <= (arg3 + var19); var22++) {
                for (int var23 = arg11 - var19; var23 <= arg11 + var19; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class258.field4444[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg11 > var23) {
                            var25 = arg11 - var23;
                        } else if (var23 > arg0 + arg11 - 1) {
                            var25 = var23 - (arg11 + arg0 - 1);
                        }
                        if (var22 < arg3) {
                            var24 = arg3 - var22;
                        } else if ((arg3 + arg1 - 1) < var22) {
                            var24 = var22 + 1 - arg1 - arg3;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var21 > var26 || var21 == var26 && class258.field4444[var22][var23] < var20) {
                            var20 = class258.field4444[var22][var23];
                            var13 = var22;
                            var21 = var26;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg5 == var13 && arg9 == var14) {
                return false;
            }
            class242.field4210 = 1;
        }
        byte var27 = 0;
        class8.field268[var27] = var13;
        int var33 = var27 + 1;
        class80.field1513[var27] = var14;
        int var28;
        int var29 = var28 = class93.field1657[var13][var14];
        while (arg5 != var13 || arg9 != var14) {
            if (var28 != var29) {
                class8.field268[var33] = var13;
                var28 = var29;
                class80.field1513[var33++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class93.field1657[var13][var14];
        }
        if (var33 > 0) {
            class48.method390(var33, arg10, (byte) -116);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static void method326(boolean arg0) {
        if (arg0) {
            field896 = -60L;
        }
        field902 = null;
        field904 = null;
        field893 = null;
        field897 = null;
        field880 = null;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
    public final void method327(int arg0) {
        if (arg0 < 69) {
            this.field888 = null;
        }
        field905++;
        if (this.field907 != null) {
            for (int var2 = 0; var2 < this.field907.length; var2++) {
                this.field907[var2] = class144.method992(this.field907[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)V")
    public static final void method328(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class261.field4561[var1] = false;
        }
        class254.field4361 = 1;
        int var2 = -38 % ((arg0 + 43) / 39);
        class71.field1366 = -1;
        field900++;
        class80.field1520 = 0;
        class243.field4244 = -1;
        class211.field3790 = 0;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)V")
    public static final void method329(int arg0, int arg1, int arg2) {
        field887++;
        class178 var3 = class188.method1282(arg0, arg2, arg2 + 261360479);
        var3.method1162(true);
        var3.field3172 = arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I")
    public final int method330(int arg0, int arg1) {
        field885++;
        if (arg0 != 9080) {
            this.field898 = false;
        }
        return this.field894 == null || arg1 < 0 || arg1 > this.field894.length ? -1 : this.field894[arg1];
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)Lvf;")
    public final class265 method331(int arg0) {
        field890++;
        class265 var2 = class254.method1675(80, (byte) 18);
        if (this.field899 == null) {
            return class68.field1303;
        }
        var2.method1807((byte) 115, this.field899[0]);
        int var3 = 1;
        if (arg0 >= -33) {
            this.method330(46, -90);
        }
        while (this.field899.length > var3) {
            var2.method1807((byte) 117, class14.field421);
            var2.method1807((byte) 121, this.field899[var3]);
            var3++;
        }
        return var2.method1809((byte) 52);
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)I")
    public final int method332(int arg0) {
        field883++;
        if (this.field894 == null) {
            return 0;
        } else {
            if (arg0 != -10502) {
                this.method323((byte) 115, (class135) null);
            }
            return this.field894.length;
        }
    }
}
