import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class104 {

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "Lwf;")
    public static class79 field1322 = new class79(40, -1);

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Lkr;")
    public static class486 field1329 = new class486();

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "[[I")
    public static int[][] field1331 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    private int field1321;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "[I")
    public static int[] field1330;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
    public final int method583(byte arg0) {
        int var2 = 9 % ((66 - arg0) / 59);
        field1319++;
        return this.field1327 & 0x3FFF;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static void method584(int arg0) {
        if (arg0 <= 15) {
            field1330 = null;
        }
        field1330 = null;
        field1329 = null;
        field1331 = null;
        field1322 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lf;IIIILnp;IIIIBZILok;I)Lf;")
    public static final class491 method585(class491 arg0, int arg1, int arg2, int arg3, int arg4, class313 arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, boolean arg11, int arg12, class153 arg13, int arg14) {
        field1328++;
        if (arg0 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg13 != null) {
            int var16 = var15 | arg13.method966(false, arg10 - 384337451, -1, arg9);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg6 << 48) + ((long) arg3 << 32) + (long) ((arg8 << 24) + (arg2 - -(arg1 << 16)));
        class232 var19 = class458.field6420;
        class491 var20;
        synchronized (class458.field6420) {
            var20 = (class491) class458.field6420.method1479(0, var17);
        }
        if (var20 == null || arg5.method653(var20.method1319(), var15) != 0) {
            if (var20 != null) {
                var15 = arg5.method647(var15, var20.method1319());
            }
            byte var21;
            if (arg2 == 1) {
                var21 = 9;
            } else if (arg2 == 2) {
                var21 = 12;
            } else if (arg2 == 3) {
                var21 = 15;
            } else if (arg2 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class187 var24 = new class187((var21 * var22) + 1, var21 * var22 * 2 - var21, 0);
            int var25 = var24.method1159((byte) -96, 0, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class53.field727[var31] * var28 >> 15;
                    int var33 = class53.field726[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method1159((byte) -96, 0, var33, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg1 * var36 + arg8 * var35 >> 8);
                short var38 = (short) (((arg3 & 0x7F) * var36 + (arg6 & 0x7F) * var35 & 0x7F00) + ((arg3 & 0x380) * var36 + (arg6 & 0x380) * var35 & 0x38000) + ((arg3 & 0xFC00) * var36 + (arg6 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1166(-2, var38, var25, (byte) 1, var26[0][var39], var37, var26[0][(var39 + 1) % var21], (short) -1, (byte) -1);
                    } else {
                        var24.method1166(-2, var38, var26[var34 - 1][var39], (byte) 1, var26[var34][(var39 + 1) % var21], var37, var26[var34 - 1][(var39 + 1) % var21], (short) -1, (byte) -1);
                        var24.method1166(arg10 - 29, var38, var26[var34 - 1][var39], (byte) 1, var26[var34][var39], var37, var26[var34][(var39 + 1) % var21], (short) -1, (byte) -1);
                    }
                }
            }
            var20 = arg5.method696(var24, var15, class460.field6441, 64, 768);
            class232 var40 = class458.field6420;
            synchronized (class458.field6420) {
                class458.field6420.method1473(var20, var17, arg10 ^ 0xFFFFFFB9);
            }
        }
        int var41 = arg2 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg11) {
            if (arg12 > 5120 && arg12 < 11264) {
                var45 = var41 + 128;
            }
            if (arg12 > 9216 && arg12 < 15360) {
                var44 = var41 + 128;
            }
            if (arg12 > 13312 || arg12 < 3072) {
                var43 -= 128;
            }
            if (arg12 > 1024 && arg12 < 7168) {
                var42 -= 128;
            }
        }
        if (arg10 != 27) {
            method586(-105, 69, -63, (Object[]) null, (int[]) null);
        }
        int var46 = arg0.method1299();
        int var47 = arg0.method1321();
        int var48 = arg0.method1295();
        if (var43 > var48) {
            var48 = var43;
        }
        int var49 = arg0.method1303();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class31 var50 = null;
        if (arg13 != null) {
            int var51 = arg13.field2254[arg9];
            var50 = class64.field836.method2082(-23748, var51 >> 16);
            arg9 = var51 & 0xFFFF;
        }
        class491 var52;
        if (var50 == null) {
            var52 = var20.method1292((byte) 3, var15, true);
            var52.method1336((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1343((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method1292((byte) 3, var15, true);
            var52.method1336((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1343((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method2879(arg10 - 27, var50, arg9);
        }
        if (arg4 != 0) {
            var52.method1293(arg4);
        }
        if (arg7 != 0) {
            var52.method1325(arg7);
        }
        if (arg14 != 0) {
            var52.method1343(0, arg14, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
    public static final void method586(int arg0, int arg1, int arg2, Object[] arg3, int[] arg4) {
        if (arg2 != 128) {
            return;
        }
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg0; var9 < arg1; var9++) {
                if (arg4[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method586(arg0, var6 - 1, 128, arg3, arg4);
            method586(var6 + 1, arg1, 128, arg3, arg4);
        }
        field1320++;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIBI)Z")
    public final boolean method587(int arg0, int arg1, byte arg2, int arg3) {
        field1323++;
        int var5 = this.field1321;
        if (this.field1327 == arg3 && this.field1321 == 0) {
            return false;
        } else if (arg2 == 38) {
            boolean var6;
            if (this.field1321 == 0) {
                if (arg3 > this.field1327 && this.field1327 + arg0 >= arg3 || this.field1327 > arg3 && (this.field1327 - arg0) <= arg3) {
                    this.field1327 = arg3;
                    return false;
                }
                var6 = true;
            } else if (this.field1321 > 0 && this.field1327 < arg3) {
                int var7 = this.field1321 * this.field1321 / (arg0 * 2);
                int var8 = this.field1327 + var7;
                if (var8 < arg3 && var8 >= this.field1327) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else if (this.field1321 < 0 && this.field1327 > arg3) {
                int var9 = this.field1321 * this.field1321 / (arg0 * 2);
                int var10 = this.field1327 - var9;
                if (var10 > arg3 && this.field1327 >= var10) {
                    var6 = true;
                } else {
                    var6 = false;
                }
            } else {
                var6 = false;
            }
            if (var6) {
                if (arg3 <= this.field1327) {
                    this.field1321 -= arg0;
                    if (arg1 != 0 && -arg1 > this.field1321) {
                        this.field1321 = -arg1;
                    }
                } else {
                    this.field1321 += arg0;
                    if (arg1 != 0 && arg1 < this.field1321) {
                        this.field1321 = arg1;
                    }
                }
                if (this.field1321 != var5) {
                    int var11 = this.field1321 * this.field1321 / (arg0 * 2);
                    if (arg3 > this.field1327) {
                        if (this.field1327 + var11 > arg3) {
                            this.field1321 = var5;
                        }
                    } else if (this.field1327 > arg3 && arg3 > this.field1327 - var11) {
                        this.field1321 = var5;
                    }
                }
            } else if (this.field1321 <= 0) {
                this.field1321 += arg0;
                if (this.field1321 > 0) {
                    this.field1321 = 0;
                }
            } else {
                this.field1321 -= arg0;
                if (this.field1321 < 0) {
                    this.field1321 = 0;
                }
            }
            this.field1327 += this.field1321 + var5 >> 1;
            return var6;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
    public final void method588(int arg0, int arg1) {
        field1326++;
        this.field1327 = arg1;
        this.field1321 = 0;
        if (arg0 != -1) {
            method585((class491) null, -7, 12, 71, 122, (class313) null, 83, 78, 64, -40, (byte) -7, false, -28, (class153) null, 88);
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)V")
    public final void method589(byte arg0) {
        this.field1327 &= 0x3FFF;
        int var2 = 112 / ((arg0 + 70) / 46);
        field1325++;
    }
}
