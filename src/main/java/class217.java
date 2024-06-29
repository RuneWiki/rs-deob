import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class217 extends class306 {

    @OriginalMember(owner = "client!rd", name = "Kb", descriptor = "Lph;")
    public static class229 field3557 = null;

    @OriginalMember(owner = "client!rd", name = "Xb", descriptor = "I")
    public static int field3570 = 0;

    @OriginalMember(owner = "client!rd", name = "Nb", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!rd", name = "Pb", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!rd", name = "Qb", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!rd", name = "Sb", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!rd", name = "Tb", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!rd", name = "Ub", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!rd", name = "Vb", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!rd", name = "Wb", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!rd", name = "Yb", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!rd", name = "Mb", descriptor = "Lqe;")
    public class313 field3559;

    @OriginalMember(owner = "client!rd", name = "Ob", descriptor = "Z")
    public static boolean field3561;

    @OriginalMember(owner = "client!rd", name = "Rb", descriptor = "[I")
    public static int[] field3564;

    @OriginalMember(owner = "client!rd", name = "Lb", descriptor = "[Lka;")
    public static class293[] field3558;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)Z", line = 10)
    public final boolean method1459(int arg0) {
        if (arg0 != 0) {
            field3564 = (int[]) null;
        }
        field3571++;
        return this.field3559 != null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V", line = 28)
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3563++;
        if (this.field3559 == null) {
            return;
        }
        if (!this.field5121) {
            class312 var6 = this.field5136 != -1 && this.field5135 == 0 ? class53.method362((byte) -55, this.field5136) : null;
            class312 var7 = this.field5115 == -1 || this.field5153 == this.field5115 && var6 != null ? null : class53.method362((byte) 109, this.field5115);
            class286 var8 = this.field3559.method2119(var6, var7, this.field5116, this.field5175, (byte) -23);
            if (var8 == null) {
                return;
            }
            this.method2059(var8, 0);
        }
        if (this.field5125 != null) {
            this.field5125.method1370(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()I", line = 62)
    public final int method182() {
        field3569++;
        return this.field5126;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lhb;Z)V", line = 72)
    public static final void method1521(class164 arg0, boolean arg1) {
        field3566++;
        int var2 = class243.field4009 >> 2 << 10;
        int var3 = class201.field3328 >> 1;
        byte[][] var4 = new byte[class50.field716][class214.field3537];
        while (arg0.field2668.length > arg0.field2670) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method1178(8) == 1) {
                var5 = true;
                var6 = arg0.method1178(8);
                var7 = arg0.method1178(8);
            }
            int var8 = arg0.method1178(8);
            int var9 = arg0.method1178(8);
            int var10 = var8 * 64 - class54.field786;
            int var11 = class266.field4487 + class214.field3537 - (var9 * 64) - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && class50.field716 > (var10 + 63) && class214.field3537 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && (var6 * 8 + 8) > var12 && var14 >= var7 * 8 && var14 < var7 * 8 + 8) {
                            var13[var11 - var14] = arg0.method1163(864348104);
                        }
                    }
                }
            } else if (var5) {
                arg0.field2670 += 64;
            } else {
                arg0.field2670 += 4096;
            }
        }
        int var15 = class50.field716;
        if (!arg1) {
            return;
        }
        int var16 = class214.field3537;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class324 var26 = class78.method584((byte) 18, var25 - 1);
                        var18[var23] += var26.field5526;
                        var17[var23] += var26.field5541;
                        var19[var23] += var26.field5532;
                        var20[var23] += var26.field5536;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class324 var29 = class78.method584((byte) 18, var28 - 1);
                        var18[var23] -= var29.field5526;
                        var17[var23] -= var29.field5541;
                        var19[var23] -= var29.field5532;
                        var20[var23] -= var29.field5536;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int[][] var31 = class321.field5438[var22 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var38 < var16) {
                        var34 += var20[var38];
                        var30 += var17[var38];
                        var32 += var18[var38];
                        var35 += var21[var38];
                        var33 += var19[var38];
                    }
                    if (var37 >= 0) {
                        var30 -= var17[var37];
                        var35 -= var21[var37];
                        var34 -= var20[var37];
                        var33 -= var19[var37];
                        var32 -= var18[var37];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var31[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class287.method1972(15540, var33 / var35, var32 * 256 / var34, var30 / var35);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var31[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var40 + var2 & 0xFC00) - (-(var40 & 0x380) - var41);
                            var39[class243.method1696(var22, 63) + (class243.method1696(63, var36) << 6)] = class310.field5203[class19.method117(!arg1, 96, var42)];
                        } else if (var39 != null) {
                            var39[class243.method1696(63, var22) + (class243.method1696(var36, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(Z)V", line = 303)
    public static void method1522(boolean arg0) {
        field3557 = null;
        field3558 = null;
        field3564 = null;
        if (!arg0) {
            method1521((class164) null, true);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIJILbn;)V", line = 321)
    public final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class194 arg10) {
        field3567++;
        if (this.field3559 == null) {
            return;
        }
        class312 var13 = this.field5136 != -1 && this.field5135 == 0 ? class53.method362((byte) 126, this.field5136) : null;
        class312 var14 = this.field5115 == -1 || this.field5153 == this.field5115 && var13 != null ? null : class53.method362((byte) 8, this.field5115);
        class286 var15 = this.field3559.method2119(var13, var14, this.field5116, this.field5175, (byte) -23);
        if (var15 == null) {
            return;
        }
        this.field5126 = var15.method182();
        class313 var16 = this.field3559;
        if (var16.field5262 != null) {
            var16 = var16.method2118(0);
        }
        if (class45.field687 && var16.field5277) {
            class286 var17 = class241.method1693(arg0, this.field5147, this.field5169, this.field3559.field5306, this.field5133, this.field3559.field5265, (byte) -46, this.field5168, var14 == null ? var13 : var14, var14 == null ? this.field5116 : this.field5175, var15, this.field3559.field5269, this.field3559.field5304, this.field3559.field5285);
            if (class99.field1675) {
                float var18 = class99.method733();
                float var19 = class99.method759();
                class99.method743();
                class99.method739(var18, var19 - 150.0F);
                var17.method185(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field5125);
                class99.method755();
                class99.method739(var18, var19);
            } else {
                var17.method185(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field5125);
            }
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (this.field3559.field5297 != 0 || this.field3559.field5284 != 0) {
            int var23 = class310.field5199[arg0];
            int var24 = class310.field5197[arg0];
            short var25 = this.field3559.field5284;
            int var26 = -var25 / 2;
            short var27 = this.field3559.field5297;
            int var28 = -var27 / 2;
            int var29 = var23 * var26 + (var24 * var28) >> 16;
            int var30 = var27 / 2;
            int var31 = -var25 / 2;
            int var32 = var24 * var26 - var23 * var28 >> 16;
            int var33 = var24 * var31 - (var23 * var30) >> 16;
            int var34 = class259.method1801(this.field5168 + var32, -20428, class298.field4849, this.field5147 + var29);
            int var35 = var23 * var31 + var24 * var30 >> 16;
            int var36 = class259.method1801(this.field5168 + var33, -20428, class298.field4849, this.field5147 + var35);
            int var37 = -var27 / 2;
            int var38 = var25 / 2;
            int var39 = var23 * var38 + var24 * var37 >> 16;
            int var40 = var27 / 2;
            int var41 = var24 * var38 - (var23 * var37) >> 16;
            int var42 = class259.method1801(this.field5168 + var41, -20428, class298.field4849, this.field5147 + var39);
            int var43 = var25 / 2;
            int var44 = var23 * var43 + var24 * var40 >> 16;
            int var45 = var24 * var43 - var23 * var40 >> 16;
            int var46 = class259.method1801(this.field5168 + var45, -20428, class298.field4849, this.field5147 + var44);
            int var47 = var34 + var46;
            if (var47 > var36 + var42) {
                var47 = var36 + var42;
            }
            int var48 = var34 < var36 ? var34 : var36;
            int var49 = var42 >= var46 ? var46 : var42;
            int var50 = var46 > var36 ? var36 : var46;
            int var51 = var42 > var34 ? var34 : var42;
            if (var25 != 0) {
                var20 = (int) (Math.atan2((double) (var48 - var49), (double) var25) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var15.method1721(var20);
                }
            }
            if (var27 != 0) {
                var21 = (int) (Math.atan2((double) (var51 - var50), (double) var27) * 325.95D) & 0x7FF;
                if (var21 != 0) {
                    var15.method1739(var21);
                }
            }
            var22 = (var47 >> 1) - this.field5133;
            if (var22 != 0) {
                var15.method1734(0, var22, 0);
            }
        }
        class286 var52 = null;
        if (this.field5112 != -1 && this.field5119 != -1) {
            class269 var53 = class259.method1799(20527, this.field5112);
            var52 = var53.method1868(this.field5119, (byte) 95);
            if (var52 != null) {
                var52.method1734(0, -this.field5137, 0);
                if (var53.field4502) {
                    if (var20 != 0) {
                        var52.method1721(var20);
                    }
                    if (var21 != 0) {
                        var52.method1739(var21);
                    }
                    if (var22 != 0) {
                        var52.method1734(0, var22, 0);
                    }
                }
            }
        }
        if (!class99.field1675) {
            if (var52 != null) {
                var15 = ((class246) var15).method1707(var52);
            }
            this.method2059(var15, 0);
            if (this.field3559.field5304 == 1) {
                var15.field4708 = true;
            }
            var15.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5125);
            return;
        }
        this.method2059(var15, 0);
        if (this.field3559.field5304 == 1) {
            var15.field4708 = true;
        }
        var15.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5125);
        if (var52 == null) {
            return;
        }
        if (this.field3559.field5304 == 1) {
            var52.field4708 = true;
        }
        if (this.field5125 != null) {
            class322 var54 = (class322) var52;
            this.field5125.method1372(var54.field5464, var54.field5476, true, var54.field5448, var54.field5461, var54.field5459);
        }
        var52.method185(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5125);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLqe;)V", line = 533)
    public final void method1523(byte arg0, class313 arg1) {
        this.field3559 = arg1;
        if (this.field5125 != null) {
            this.field5125.method1360();
        }
        if (arg0 < 93) {
            field3561 = false;
        }
        field3560++;
    }

    @OriginalMember(owner = "client!rd", name = "finalize", descriptor = "()V", line = 561)
    protected final void finalize() {
        if (this.field5125 != null) {
            this.field5125.method1375();
        }
        field3568++;
    }
}
