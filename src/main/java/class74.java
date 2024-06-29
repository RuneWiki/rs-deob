import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class74 extends class71 {

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    private int field1453 = 10;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "I")
    private int field1459 = 0;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "I")
    private int field1463 = 2048;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "Lud;")
    public static class279 field1450 = class130.method1024("blanc:", 255);

    @OriginalMember(owner = "client!je", name = "S", descriptor = "Lud;")
    private static class279 field1458 = class130.method1024("wave:", 255);

    @OriginalMember(owner = "client!je", name = "R", descriptor = "Lud;")
    public static class279 field1457 = field1458;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "Lud;")
    public static class279 field1465 = field1458;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!je", name = "bb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "Ljl;")
    public static class262 field1461;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "[I")
    private int[] field1451;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[I")
    private int[] field1456;

    @OriginalMember(owner = "client!je", name = "cb", descriptor = "[I")
    public static int[] field1468;

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "()V", line = 3)
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IZLvh;)V", line = 10)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field1453 = arg2.method483(-103);
        } else if (arg0 == 1) {
            this.field1463 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field1459 = arg2.method483(-107);
        }
        field1460++;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)V", line = 53)
    public static final void method639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class15.method135(114, arg1);
        int var7 = arg1 - arg3;
        field1454++;
        int var8 = arg1;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = arg4;
        int var10 = -arg1;
        int var11 = -1;
        int var12 = -1;
        if (arg0 >= class135.field2463 && class108.field2002 >= arg0) {
            int[] var13 = class182.field3348[arg0];
            int var14 = class125.method1001(arg6 - arg1, class44.field929, false, class249.field4449);
            int var15 = class125.method1001(arg6 + arg1, class44.field929, false, class249.field4449);
            int var16 = class125.method1001(arg6 - var7, class44.field929, false, class249.field4449);
            int var17 = class125.method1001(arg6 + var7, class44.field929, false, class249.field4449);
            class152.method1208(var14, arg2, var16, var13, -7);
            class152.method1208(var16, arg5, var17, var13, -7);
            class152.method1208(var17, arg2, var15, var13, -7);
        }
        int var18 = var7;
        int var19 = -var7;
        while (var9 < var8) {
            var12 += 2;
            var19 += var12;
            if (var19 >= 0 && var18 >= 1) {
                var18--;
                class238.field4176[var18] = var9;
                var19 -= var18 << 1;
            }
            var11 += 2;
            var10 += var11;
            var9++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                int var20 = arg0 - var8;
                int var21 = arg0 + var8;
                if (class135.field2463 <= var21 && class108.field2002 >= var20) {
                    if (var7 <= var8) {
                        int var22 = class125.method1001(arg6 + var9, class44.field929, false, class249.field4449);
                        int var23 = class125.method1001(arg6 - var9, class44.field929, false, class249.field4449);
                        if (var21 <= class108.field2002) {
                            class152.method1208(var23, arg2, var22, class182.field3348[var21], arg4 ^ 0xFFFFFFF9);
                        }
                        if (var20 >= class135.field2463) {
                            class152.method1208(var23, arg2, var22, class182.field3348[var20], arg4 - 7);
                        }
                    } else {
                        int var24 = class238.field4176[var8];
                        int var25 = class125.method1001(arg6 + var9, class44.field929, false, class249.field4449);
                        int var26 = class125.method1001(arg6 - var9, class44.field929, false, class249.field4449);
                        int var27 = class125.method1001(arg6 + var24, class44.field929, false, class249.field4449);
                        int var28 = class125.method1001(arg6 - var24, class44.field929, false, class249.field4449);
                        if (var21 <= class108.field2002) {
                            int[] var29 = class182.field3348[var21];
                            class152.method1208(var26, arg2, var28, var29, -7);
                            class152.method1208(var28, arg5, var27, var29, -7);
                            class152.method1208(var27, arg2, var25, var29, -7);
                        }
                        if (class135.field2463 <= var20) {
                            int[] var30 = class182.field3348[var20];
                            class152.method1208(var26, arg2, var28, var30, arg4 ^ 0xFFFFFFF9);
                            class152.method1208(var28, arg5, var27, var30, -7);
                            class152.method1208(var27, arg2, var25, var30, -7);
                        }
                    }
                }
            }
            int var31 = arg0 - var9;
            int var32 = arg0 + var9;
            if (var32 >= class135.field2463 && var31 <= class108.field2002) {
                int var33 = arg6 + var8;
                int var34 = arg6 - var8;
                if (var33 >= class249.field4449 && var34 <= class44.field929) {
                    int var35 = class125.method1001(var33, class44.field929, false, class249.field4449);
                    int var36 = class125.method1001(var34, class44.field929, false, class249.field4449);
                    if (var9 < var7) {
                        int var37 = var18 < var9 ? class238.field4176[var9] : var18;
                        int var38 = class125.method1001(arg6 + var37, class44.field929, false, class249.field4449);
                        int var39 = class125.method1001(arg6 - var37, class44.field929, false, class249.field4449);
                        if (class108.field2002 >= var32) {
                            int[] var40 = class182.field3348[var32];
                            class152.method1208(var36, arg2, var39, var40, -7);
                            class152.method1208(var39, arg5, var38, var40, arg4 - 7);
                            class152.method1208(var38, arg2, var35, var40, -7);
                        }
                        if (var31 >= class135.field2463) {
                            int[] var41 = class182.field3348[var31];
                            class152.method1208(var36, arg2, var39, var41, -7);
                            class152.method1208(var39, arg5, var38, var41, -7);
                            class152.method1208(var38, arg2, var35, var41, -7);
                        }
                    } else {
                        if (var32 <= class108.field2002) {
                            class152.method1208(var36, arg2, var35, class182.field3348[var32], -7);
                        }
                        if (class135.field2463 <= var31) {
                            class152.method1208(var36, arg2, var35, class182.field3348[var31], arg4 - 7);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 237)
    public final void method627(int arg0) {
        this.method642(true);
        field1464++;
        if (arg0 != 7) {
            this.field1463 = -81;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZLok;)V", line = 250)
    public static final void method640(boolean arg0, class149 arg1) {
        if (!arg0) {
            field1457 = (class279) null;
        }
        class217.field3844 = arg1.method1167(class230.field4011, 124);
        field1452++;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IB)[I", line = 265)
    public final int[] method199(int arg0, byte arg1) {
        field1455++;
        if (arg1 >= -69) {
            field1461 = (class262) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int var4 = class200.field3574[arg0];
            if (this.field1459 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1453; var6++) {
                    if (this.field1451[var6] <= var4 && this.field1451[var6 + 1] > var4) {
                        if (var4 < this.field1456[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class25.method221(var3, 0, class215.field3787, var5);
            } else {
                for (int var7 = 0; var7 < class215.field3787; var7++) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class133.field2424[var7];
                    int var11 = this.field1459;
                    if (var11 == 1) {
                        var8 = var10;
                    } else if (var11 == 2) {
                        var8 = (var10 + var4 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var8 = (var10 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field1453; var12++) {
                        if (var8 >= this.field1451[var12] && this.field1451[var12 + 1] > var8) {
                            if (this.field1456[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)V", line = 397)
    public static final void method641(int arg0) {
        field1462++;
        if (arg0 > -38) {
            method640(true, (class149) null);
        }
        int var1 = class212.method1558(17519);
        if (var1 == 0) {
            class50.field1042 = (byte[][][]) null;
            class108.method896(0, true);
        } else if (var1 == 1) {
            class180.method1399(-97, (byte) 0);
            class108.method896(512, true);
            class223.method1643((byte) 119);
        } else {
            class180.method1399(-82, (byte) (class59.field1239 - 4 & 0xFF));
            class108.method896(2, true);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V", line = 428)
    private final void method642(boolean arg0) {
        this.field1451 = new int[this.field1453 + 1];
        field1467++;
        int var2 = 0;
        this.field1456 = new int[this.field1453 + 1];
        int var3 = 4096 / this.field1453;
        if (!arg0) {
            field1457 = (class279) null;
        }
        int var4 = this.field1463 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1453; var5++) {
            this.field1451[var5] = var2;
            this.field1456[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1451[this.field1453] = 4096;
        this.field1456[this.field1453] = this.field1456[0] + 4096;
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)V", line = 467)
    public static void method643(byte arg0) {
        field1465 = null;
        field1461 = null;
        field1468 = null;
        field1458 = null;
        field1450 = null;
        field1457 = null;
        int var1 = -21 / ((arg0 + 28) / 57);
    }
}
