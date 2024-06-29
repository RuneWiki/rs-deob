import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class20 implements Runnable {

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Z")
    public boolean field270 = true;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "Ljava/lang/Object;")
    public Object field271 = new Object();

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "[I")
    public int[] field278 = new int[500];

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "[I")
    public int[] field280 = new int[500];

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public int field279 = 0;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field265 = -1;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field275 = 1;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field274 = 0;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Llm;")
    public static class20 field276;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIII)V", line = 9)
    public static final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class272.method1876(class34.field525[arg4], arg5 + arg2, -arg2 + arg5, arg1, (byte) -55);
        int var6 = arg3;
        field272++;
        int var7 = 0;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        if (arg0 != -1) {
            return;
        }
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = ((arg3 << 1) - 3) * var11;
        int var16 = ((var7 << 1) + 3) * var10;
        int var17 = var8 << 2;
        int var18 = var9 << 2;
        int var19 = (var7 + 1) * var18;
        int var20 = (arg3 - 1) * var17;
        while (var6 > 0) {
            var6--;
            int var21 = arg4 - var6;
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var7++;
                    var19 += var18;
                    var13 += var16;
                    var16 += var18;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var16;
                var16 += var18;
                var7++;
                var19 += var18;
            }
            var13 += -var20;
            int var22 = arg5 + var7;
            var14 += -var15;
            int var23 = arg5 - var7;
            class272.method1876(class34.field525[var21], var22, var23, arg1, (byte) -96);
            int var24 = arg4 + var6;
            var15 -= var17;
            var20 -= var17;
            class272.method1876(class34.field525[var24], var22, var23, arg1, (byte) -40);
        }
    }

    @OriginalMember(owner = "client!lm", name = "run", descriptor = "()V", line = 98)
    public final void run() {
        while (this.field270) {
            Object var1 = this.field271;
            synchronized (this.field271) {
                if (this.field279 < 500) {
                    this.field278[this.field279] = class119.field1815;
                    this.field280[this.field279] = class253.field3984;
                    this.field279++;
                }
            }
            class5.method26(0, 50L);
        }
        field266++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIB[IIIZIII)V", line = 123)
    public static final void method152(int arg0, int arg1, int arg2, byte arg3, int[] arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field263++;
        int var11 = arg5;
        if (arg5 >= class109.field1703) {
            return;
        }
        int var12 = arg5 + arg8;
        if (arg5 < class109.field1708) {
            var11 = class109.field1708;
        }
        if (var12 <= class109.field1708) {
            return;
        }
        int var13 = arg9;
        if (class109.field1703 < var12) {
            var12 = class109.field1703;
        }
        if (class109.field1705 <= arg9) {
            return;
        }
        int var14 = arg9 + arg1;
        if (class109.field1707 > arg9) {
            var13 = class109.field1707;
        }
        if (var14 <= class109.field1707) {
            return;
        }
        if (arg0 == 9) {
            arg0 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        if (arg0 == 10) {
            arg0 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        int var15 = class109.field1709 + var11 - var12;
        if (arg0 == 11) {
            arg6 = arg6 + 3 & 0x3;
            arg0 = 8;
        }
        if (class109.field1705 < var14) {
            var14 = class109.field1705;
        }
        int var16 = var12 - arg5;
        int var17 = arg8 - var16;
        int var18 = class109.field1709 * var13 + var11;
        int var19 = var14 - arg9;
        int var20 = var11 - arg5;
        int var21 = arg1 - var19;
        int var22 = var13 - arg9;
        int var23 = arg8 - var20;
        int var24 = arg1 - var22;
        if (arg0 == 1) {
            if (arg6 == 0) {
                for (int var25 = var22; var25 < var19; var25++) {
                    for (int var26 = var20; var26 < var16; var26++) {
                        if (var26 <= var25) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 1) {
                for (int var27 = var24 - 1; var27 >= var21; var27--) {
                    for (int var28 = var20; var28 < var16; var28++) {
                        if (var28 <= var27) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 2) {
                for (int var31 = var22; var31 < var19; var31++) {
                    for (int var32 = var20; var32 < var16; var32++) {
                        if (var32 >= var31) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 3) {
                for (int var29 = var24 - 1; var29 >= var21; var29--) {
                    for (int var30 = var20; var30 < var16; var30++) {
                        if (var30 >= var29) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg0 == 2) {
            if (arg6 == 0) {
                for (int var87 = var24 - 1; var87 >= var21; var87--) {
                    for (int var88 = var20; var88 < var16; var88++) {
                        if (var87 >> 1 >= var88) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 1) {
                for (int var81 = var22; var81 < var19; var81++) {
                    for (int var82 = var20; var82 < var16; var82++) {
                        if (var18 >= 0 && var18 < arg4.length) {
                            if (var82 >= (var81 << 1)) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        } else {
                            var18++;
                        }
                    }
                    var18 += var15;
                }
            } else if (arg6 == 2) {
                for (int var83 = var22; var83 < var19; var83++) {
                    for (int var84 = var23 - 1; var84 >= var17; var84--) {
                        if ((var83 >> 1) >= var84) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 3) {
                for (int var85 = var24 - 1; var85 >= var21; var85--) {
                    for (int var86 = var23 - 1; var86 >= var17; var86--) {
                        if (var86 >= var85 << 1) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg0 == 3) {
            if (arg6 == 0) {
                for (int var39 = var24 - 1; var39 >= var21; var39--) {
                    for (int var40 = var23 - 1; var40 >= var17; var40--) {
                        if (var40 <= var39 >> 1) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 1) {
                for (int var33 = var24 - 1; var33 >= var21; var33--) {
                    for (int var34 = var20; var34 < var16; var34++) {
                        if (var34 >= (var33 << 1)) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 2) {
                for (int var35 = var22; var35 < var19; var35++) {
                    for (int var36 = var20; var36 < var16; var36++) {
                        if (var35 >> 1 >= var36) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 3) {
                for (int var37 = var22; var37 < var19; var37++) {
                    for (int var38 = var23 - 1; var38 >= var17; var38--) {
                        if (var38 >= (var37 << 1)) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg0 == 4) {
            if (arg6 == 0) {
                for (int var47 = var24 - 1; var47 >= var21; var47--) {
                    for (int var48 = var20; var48 < var16; var48++) {
                        if ((var47 >> 1) <= var48) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 1) {
                for (int var41 = var22; var41 < var19; var41++) {
                    for (int var42 = var20; var42 < var16; var42++) {
                        if (var41 << 1 >= var42) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 2) {
                for (int var43 = var22; var43 < var19; var43++) {
                    for (int var44 = var23 - 1; var44 >= var17; var44--) {
                        if (var44 >= var43 >> 1) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 3) {
                for (int var45 = var24 - 1; var45 >= var21; var45--) {
                    for (int var46 = var23 - 1; var46 >= var17; var46--) {
                        if (var45 << 1 >= var46) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg0 == 5) {
            if (arg6 == 0) {
                for (int var79 = var24 - 1; var79 >= var21; var79--) {
                    for (int var80 = var23 - 1; var80 >= var17; var80--) {
                        if (var79 >> 1 <= var80) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 1) {
                for (int var73 = var24 - 1; var73 >= var21; var73--) {
                    for (int var74 = var20; var74 < var16; var74++) {
                        if (var73 << 1 >= var74) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 2) {
                for (int var77 = var22; var77 < var19; var77++) {
                    for (int var78 = var20; var78 < var16; var78++) {
                        if (var77 >> 1 <= var78) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            } else if (arg6 == 3) {
                for (int var75 = var22; var75 < var19; var75++) {
                    for (int var76 = var23 - 1; var76 >= var17; var76--) {
                        if (var76 <= (var75 << 1)) {
                            arg4[var18] = arg2;
                        } else if (arg7) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var15;
                }
            }
        } else if (arg3 > 53) {
            if (arg0 == 6) {
                if (arg6 == 0) {
                    for (int var55 = var22; var55 < var19; var55++) {
                        for (int var56 = var20; var56 < var16; var56++) {
                            if (arg8 / 2 >= var56) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var53 = var22; var53 < var19; var53++) {
                        for (int var54 = var20; var54 < var16; var54++) {
                            if (var53 <= (arg1 / 2)) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var49 = var22; var49 < var19; var49++) {
                        for (int var50 = var20; var50 < var16; var50++) {
                            if (arg8 / 2 <= var50) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var51 = var22; var51 < var19; var51++) {
                        for (int var52 = var20; var52 < var16; var52++) {
                            if (arg1 / 2 <= var51) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg6 == 0) {
                    for (int var57 = var22; var57 < var19; var57++) {
                        for (int var58 = var20; var58 < var16; var58++) {
                            if (var58 <= var57 - (arg1 / 2)) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var59 = var24 - 1; var59 >= var21; var59--) {
                        for (int var60 = var20; var60 < var16; var60++) {
                            if (var59 - (arg1 / 2) >= var60) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var71 = var24 - 1; var71 >= var21; var71--) {
                        for (int var72 = var23 - 1; var72 >= var17; var72--) {
                            if ((var71 - arg1 / 2) >= var72) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var61 = var22; var61 < var19; var61++) {
                        for (int var62 = var23 - 1; var62 >= var17; var62--) {
                            if ((var61 - arg1 / 2) >= var62) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg6 == 0) {
                    for (int var69 = var22; var69 < var19; var69++) {
                        for (int var70 = var20; var70 < var16; var70++) {
                            if (var69 - (arg1 / 2) <= var70) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var67 = var24 - 1; var67 >= var21; var67--) {
                        for (int var68 = var20; var68 < var16; var68++) {
                            if ((var67 - (arg1 / 2)) <= var68) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var65 = var24 - 1; var65 >= var21; var65--) {
                        for (int var66 = var23 - 1; var66 >= var17; var66--) {
                            if (var66 >= (var65 - arg1 / 2)) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var63 = var22; var63 < var19; var63++) {
                        for (int var64 = var23 - 1; var64 >= var17; var64--) {
                            if ((var63 - (arg1 / 2)) <= var64) {
                                arg4[var18] = arg2;
                            } else if (arg7) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var15;
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 1308)
    public static void method153(int arg0) {
        if (arg0 > -40) {
            method154(116);
        }
        field276 = null;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 1321)
    public static final void method154(int arg0) {
        field267++;
        if (arg0 != 1441) {
            method155((byte) 77);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class34.field510[var1] = true;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 1338)
    public static final void method155(byte arg0) {
        field268++;
        if (class34.field509 == 5) {
            class34.field509 = 6;
            int var1 = -91 / ((arg0 - 80) / 33);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)Lul;", line = 1356)
    public static final class217 method156(boolean arg0, int arg1) {
        field273++;
        class217 var2 = (class217) class16.field230.method443(-2, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class62.field996.method980(arg1, 0, 5);
        if (var3 == null) {
            return null;
        }
        class217 var4 = new class217();
        class166 var5 = new class166(var3);
        var5.field2532 = var5.field2500.length - 2;
        int var6 = var5.method1151(-76);
        int var7 = var5.field2500.length - var6 - 12 - 2;
        if (!arg0) {
            field274 = -127;
        }
        var5.field2532 = var7;
        int var8 = var5.method1137(65);
        var4.field3308 = var5.method1151(-77);
        var4.field3309 = var5.method1151(-81);
        var4.field3312 = var5.method1151(-58);
        var4.field3311 = var5.method1151(-65);
        int var9 = var5.method1178(0);
        if (var9 > 0) {
            var4.field3304 = new class170[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1151(-51);
                class170 var12 = new class170(class10.method73((byte) 126, var11));
                var4.field3304[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1137(-72);
                    int var14 = var5.method1137(90);
                    var12.method1227(new class295(var14), 0, (long) var13);
                }
            }
        }
        var5.field2532 = 0;
        var4.field3299 = var5.method1146(0);
        var4.field3307 = new String[var8];
        var4.field3300 = new int[var8];
        int var15 = 0;
        var4.field3305 = new int[var8];
        while (var7 > var5.field2532) {
            int var16 = var5.method1151(-115);
            if (var16 == 3) {
                var4.field3307[var15] = var5.method1179((byte) -89).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3305[var15] = var5.method1178(0);
            } else {
                var4.field3305[var15] = var5.method1137(-88);
            }
            var4.field3300[var15++] = var16;
        }
        class16.field230.method439(var4, (long) arg1, (byte) 18);
        return var4;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)V", line = 1451)
    public static final void method157(int arg0, int arg1, int arg2) {
        class83.field1293++;
        field264++;
        if (arg2 > -29) {
            field275 = -96;
        }
        class106.field1642.method753(127, 107);
        class106.field1642.method1130(-123, arg1);
        class106.field1642.method1182((byte) 118, arg0);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 1478)
    public static final void method158(String arg0, int arg1, int arg2) {
        String var3 = class336.method2336(122, class134.method985(arg0, (byte) -106));
        if (arg1 >= -49) {
            field274 = -81;
        }
        field269++;
        boolean var4 = false;
        for (int var5 = 0; var5 < class310.field4816; var5++) {
            class33 var6 = class254.field3992[class103.field1606[var5]];
            if (var6 != null && var6.field477 != null && var6.field477.equalsIgnoreCase(var3)) {
                if (arg2 == 1) {
                    class106.field1642.method753(123, 221);
                    class98.field1565++;
                    class106.field1642.method1135(true, 0);
                    class106.field1642.method1161(class103.field1606[var5], 128);
                } else if (arg2 == 4) {
                    class106.field1642.method753(125, 158);
                    class106.field1642.method1135(true, 0);
                    class106.field1642.method1161(class103.field1606[var5], 128);
                    class131.field2048++;
                } else if (arg2 == 5) {
                    class106.field1642.method753(124, 197);
                    class106.field1642.method1135(true, 0);
                    class17.field240++;
                    class106.field1642.method1161(class103.field1606[var5], 128);
                } else if (arg2 == 6) {
                    class2.field27++;
                    class106.field1642.method753(-90, 114);
                    class106.field1642.method1149(class103.field1606[var5], (byte) -114);
                    class106.field1642.method1159(0, 89);
                } else if (arg2 == 7) {
                    class106.field1642.method753(-90, 230);
                    class282.field4368++;
                    class106.field1642.method1161(class103.field1606[var5], 128);
                    class106.field1642.method1135(true, 0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class29.method252(class201.field3013 + var3, "", true, 0);
        }
    }
}
