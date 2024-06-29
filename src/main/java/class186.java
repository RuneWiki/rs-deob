import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class186 extends class222 {

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "Z")
    public static boolean field3207 = false;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "Lsb;")
    public static class98 field3209 = class47.method368("event_opbase", 0);

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    public static int field3214 = 1;

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "I")
    public static int field3219 = 0;

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "[I")
    public static int[] field3220 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(III)V")
    private final void method1281(int arg0, int arg1, int arg2) {
        if (arg2 == 499397474) {
            ++field3206;
            int var4 = class261.field4577[arg1];
            int var5 = class214.field3639[arg0];
            float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class239.field4124 = arg1;
                class23.field474 = arg0;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class239.field4124 = arg0;
                class23.field474 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class239.field4124 = class13.field253 - arg0;
                class23.field474 = arg1;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class23.field474 = -arg0 + class20.field373;
                class239.field4124 = arg1;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class239.field4124 = -arg1 + class13.field253;
                class23.field474 = -arg0 + class20.field373;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class239.field4124 = -arg0 + class13.field253;
                class23.field474 = class20.field373 - arg1;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class23.field474 = class20.field373 - arg1;
                class239.field4124 = arg0;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class239.field4124 = class13.field253 - arg1;
                class23.field474 = arg0;
            }
            class239.field4124 &= class162.field2924;
            class23.field474 &= class191.field3299;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIII)V")
    public static final void method1282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class237.field4084.field3728 = 0;
        class237.field4084.method1477(99, -26755);
        ++field3215;
        if (arg2 >= 34) {
            class237.field4084.method1477(arg1, -26755);
            class237.field4084.method1477(arg0, -26755);
            class237.field4084.method1470((byte) -122, arg4);
            class237.field4084.method1470((byte) -122, arg3);
            class177.field3070 = 0;
            class202.field3440 = -3;
            class9.field210 = 1;
            class245.field4331 = 0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)V")
    public static final void method1283(int arg0, int arg1) {
        int var2 = -19 / ((arg0 - 18) / 47);
        if (arg1 == -1 && !class187.field3229) {
            class206.method1389((byte) -46);
        } else if (arg1 != -1 && (class143.field2527 != arg1 || !class181.method1246(true)) && ~class167.field2978 != -1 && !class187.field3229) {
            class232.method1592(false, class167.field2978, 0, arg1, 2, (byte) 118, class143.field2525);
        }
        ++field3212;
        class143.field2527 = arg1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 <= 106) {
            field3209 = null;
        }
        if (arg3 == arg4 && arg2 == arg5 && ~arg8 == ~arg9 && ~arg0 == ~arg6) {
            class199.method1356(arg8, arg7, arg5, arg3, arg0, 55);
        } else {
            int var10 = arg5;
            int var11 = arg3;
            int var12 = arg3 * 3;
            int var13 = arg2 * 3;
            int var14 = arg5 * 3;
            int var15 = arg4 * 3;
            int var16 = arg6 * 3;
            int var17 = arg9 * 3;
            int var18 = -var16 + arg0 - -var13 + -arg5;
            int var19 = -var15 + -var15 + var12 + var17;
            int var20 = -var17 - -var15 + arg8 + -arg3;
            int var21 = var16 - (var13 + var13) - -var14;
            int var22 = -var14 + var13;
            int var23 = -var12 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var26;
                int var28 = var18 * var26;
                int var29 = var19 * var25;
                int var30 = var23 * var24;
                int var31 = var22 * var24;
                int var32 = var21 * var25;
                int var33 = (var28 - (-var32 - var31) >> 12) + arg5;
                int var34 = (var27 - -var29 + var30 >> 12) + arg3;
                class199.method1356(var34, arg7, var10, var11, var33, 98);
                var11 = var34;
                var10 = var33;
            }
        }
        ++field3208;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BII)Lsb;")
    public static final class98 method1285(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field3211;
        class98 var4 = new class98();
        var4.field1733 = new byte[arg2];
        var4.field1694 = arg0;
        for (int var5 = arg3; ~var5 > ~(arg3 - -arg2); ++var5) {
            if (~arg1[var5] != -1) {
                var4.field1733[var4.field1694++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field3207 = true;
        }
        if (arg2 == 0) {
            super.field3842 = ~arg0.method1446(5350) == -2;
        }
        ++field3210;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(BI)I")
    public static final int method1286(byte arg0, int arg1) {
        ++field3217;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 < 110) {
            method1284(100, -75, -46, 100, -60, 28, 99, 42, -86, 71);
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 - -1;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class186() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 <= 35) {
            method1286((byte) -22, 90);
        }
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            for (int var4 = 0; var4 < class13.field253; ++var4) {
                this.method1281(arg1, var4, 499397474);
                int[] var5 = this.method1537((byte) 64, 0, class23.field474);
                var3[var4] = var5[class239.field4124];
            }
        }
        ++field3216;
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public static void method1287(int arg0) {
        field3209 = null;
        if (arg0 == 1048575) {
            field3220 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field3218;
        if (arg1 != 1) {
            field3207 = false;
        }
        int[][] var3 = super.field3834.method627(4103, arg0);
        if (super.field3834.field1486) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class13.field253; ++var7) {
                this.method1281(arg0, var7, 499397474);
                int[][] var8 = this.method1531(class23.field474, 0, arg1 ^ 125);
                var5[var7] = var8[0][class239.field4124];
                var4[var7] = var8[1][class239.field4124];
                var6[var7] = var8[2][class239.field4124];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "([Lsb;I)Lsb;")
    public static final class98 method1288(class98[] arg0, int arg1) {
        ++field3213;
        if (arg1 != 31618) {
            method1286((byte) 22, 23);
        }
        if (~arg0.length > -3) {
            throw new IllegalArgumentException();
        } else {
            return class14.method115(false, arg0.length, 0, arg0);
        }
    }
}
