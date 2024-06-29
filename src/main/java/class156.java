import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class156 extends class54 {

    @OriginalMember(owner = "client!cda", name = "N", descriptor = "[B")
    public byte[] field2673;

    @OriginalMember(owner = "client!cda", name = "L", descriptor = "Lap;")
    public static class442 field2671 = new class442();

    @OriginalMember(owner = "client!cda", name = "R", descriptor = "[I")
    public static int[] field2677 = new int[50];

    @OriginalMember(owner = "client!cda", name = "G", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!cda", name = "H", descriptor = "I")
    public int field2668;

    @OriginalMember(owner = "client!cda", name = "I", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!cda", name = "K", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!cda", name = "M", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!cda", name = "O", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!cda", name = "P", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!cda", name = "Q", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!cda", name = "T", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!cda", name = "U", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!cda", name = "S", descriptor = "Ljava/lang/Object;")
    public static Object field2678;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBIIIII)V")
    public final void method1291(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2676++;
        int var8 = 0;
        if (arg2 != arg6) {
            var8 = (arg0 - arg5 << 16) / (arg2 - arg6);
        }
        int var9 = 0;
        if (arg2 != arg4) {
            var9 = (arg3 - arg0 << 16) / (arg4 - arg2);
        }
        int var10 = 0;
        if (arg4 != arg6) {
            var10 = (arg5 - arg3 << 16) / (arg6 - arg4);
        }
        if (arg1 <= 46) {
            method1296(true);
        }
        if (arg2 >= arg6 && arg6 <= arg4) {
            if (arg4 <= arg2) {
                int var11;
                int var12 = var11 = arg5 << 16;
                if (arg6 < 0) {
                    var11 -= arg6 * var8;
                    var12 -= arg6 * var10;
                    arg6 = 0;
                }
                int var13 = arg3 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if ((arg4 == arg6 || var8 <= var10) && (arg4 != arg6 || var9 <= var8)) {
                    int var17 = arg2 - arg4;
                    int var18 = arg4 - arg6;
                    int var19 = this.field2679 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class254.method1801(var11 >> 16, var13 >> 16, var19, (byte) 82, this.field2673, 0);
                                var19 += this.field2679;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class254.method1801(var11 >> 16, var12 >> 16, var19, (byte) 82, this.field2673, 0);
                        var11 += var8;
                        var19 += this.field2679;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg2 - arg4;
                    int var15 = arg4 - arg6;
                    int var16 = this.field2679 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class254.method1801(var13 >> 16, var11 >> 16, var16, (byte) 82, this.field2673, 0);
                                var16 += this.field2679;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class254.method1801(var12 >> 16, var11 >> 16, var16, (byte) 82, this.field2673, 0);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field2679;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg6 < 0) {
                    var20 -= arg6 * var8;
                    var21 -= arg6 * var10;
                    arg6 = 0;
                }
                int var22 = arg0 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var8 > var10 || arg2 == arg6 && var9 < var10) {
                    int var23 = arg4 - arg2;
                    int var24 = arg2 - arg6;
                    int var25 = this.field2679 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class254.method1801(var21 >> 16, var22 >> 16, var25, (byte) 82, this.field2673, 0);
                                var21 += var10;
                                var25 += this.field2679;
                                var22 += var9;
                            }
                        }
                        class254.method1801(var21 >> 16, var20 >> 16, var25, (byte) 82, this.field2673, 0);
                        var20 += var8;
                        var25 += this.field2679;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg4 - arg2;
                    int var27 = arg2 - arg6;
                    int var28 = this.field2679 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class254.method1801(var22 >> 16, var21 >> 16, var28, (byte) 82, this.field2673, 0);
                                var28 += this.field2679;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class254.method1801(var20 >> 16, var21 >> 16, var28, (byte) 82, this.field2673, 0);
                        var28 += this.field2679;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg4 >= arg2) {
            if (arg6 <= arg4) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg2 < 0) {
                    var29 -= arg2 * var9;
                    var30 -= arg2 * var8;
                    arg2 = 0;
                }
                int var31 = arg5 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg4 - arg6;
                    int var33 = arg6 - arg2;
                    int var34 = this.field2679 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class254.method1801(var29 >> 16, var31 >> 16, var34, (byte) 82, this.field2673, 0);
                                var34 += this.field2679;
                                var31 += var10;
                                var29 += var9;
                            }
                        }
                        class254.method1801(var29 >> 16, var30 >> 16, var34, (byte) 82, this.field2673, 0);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field2679;
                    }
                } else {
                    int var35 = arg4 - arg6;
                    int var36 = arg6 - arg2;
                    int var37 = this.field2679 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class254.method1801(var31 >> 16, var29 >> 16, var37, (byte) 82, this.field2673, 0);
                                var37 += this.field2679;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class254.method1801(var30 >> 16, var29 >> 16, var37, (byte) 82, this.field2673, 0);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field2679;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var8;
                    var38 -= arg2 * var9;
                    arg2 = 0;
                }
                int var40 = arg3 << 16;
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var8 < var9 || arg2 == arg4 && var8 > var10) {
                    int var41 = arg6 - arg4;
                    int var42 = arg4 - arg2;
                    int var43 = this.field2679 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class254.method1801(var39 >> 16, var40 >> 16, var43, (byte) 82, this.field2673, 0);
                                var39 += var8;
                                var43 += this.field2679;
                                var40 += var10;
                            }
                        }
                        class254.method1801(var39 >> 16, var38 >> 16, var43, (byte) 82, this.field2673, 0);
                        var39 += var8;
                        var43 += this.field2679;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg6 - arg4;
                    int var45 = arg4 - arg2;
                    int var46 = this.field2679 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class254.method1801(var40 >> 16, var39 >> 16, var46, (byte) 82, this.field2673, 0);
                                var46 += this.field2679;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class254.method1801(var38 >> 16, var39 >> 16, var46, (byte) 82, this.field2673, 0);
                        var46 += this.field2679;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg2 <= arg6) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg0 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var10;
                var48 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg2 < 0) {
                var49 -= arg2 * var8;
                arg2 = 0;
            }
            if (var10 > var9) {
                int var50 = arg6 - arg2;
                int var51 = arg2 - arg4;
                int var52 = this.field2679 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class254.method1801(var49 >> 16, var47 >> 16, var52, (byte) 82, this.field2673, 0);
                            var49 += var8;
                            var47 += var10;
                            var52 += this.field2679;
                        }
                    }
                    class254.method1801(var48 >> 16, var47 >> 16, var52, (byte) 82, this.field2673, 0);
                    var52 += this.field2679;
                    var48 += var9;
                    var47 += var10;
                }
            } else {
                int var53 = arg6 - arg2;
                int var54 = arg2 - arg4;
                int var55 = this.field2679 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class254.method1801(var47 >> 16, var49 >> 16, var55, (byte) 82, this.field2673, 0);
                            var47 += var10;
                            var49 += var8;
                            var55 += this.field2679;
                        }
                    }
                    class254.method1801(var47 >> 16, var48 >> 16, var55, (byte) 82, this.field2673, 0);
                    var48 += var9;
                    var55 += this.field2679;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            int var58 = arg5 << 16;
            if (arg4 < 0) {
                var56 -= arg4 * var10;
                var57 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg6 < 0) {
                var58 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 > var9) {
                int var59 = arg2 - arg6;
                int var60 = arg6 - arg4;
                int var61 = this.field2679 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class254.method1801(var57 >> 16, var58 >> 16, var61, (byte) 82, this.field2673, 0);
                            var58 += var8;
                            var57 += var9;
                            var61 += this.field2679;
                        }
                    }
                    class254.method1801(var57 >> 16, var56 >> 16, var61, (byte) 82, this.field2673, 0);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field2679;
                }
            } else {
                int var62 = arg2 - arg6;
                int var63 = arg6 - arg4;
                int var64 = this.field2679 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class254.method1801(var58 >> 16, var57 >> 16, var64, (byte) 82, this.field2673, 0);
                            var58 += var8;
                            var57 += var9;
                            var64 += this.field2679;
                        }
                    }
                    class254.method1801(var56 >> 16, var57 >> 16, var64, (byte) 82, this.field2673, 0);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field2679;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field2671 = null;
        if (arg0 >= 117) {
            field2677 = null;
            field2678 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIIILmea;ILja;II)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class395 arg7, int arg8, class254 arg9, int arg10, int arg11) {
        field2680++;
        class246.field3925 = arg4;
        class272.field4393 = arg11;
        class253.field4039 = arg6;
        class155.field2633 = arg7;
        class392.field6132 = arg1;
        class303.field4736 = arg3;
        class315.field4947 = arg0;
        class582.field8280 = null;
        class189.field3155 = null;
        class81.field1010 = arg9;
        class489.field7159 = arg5;
        if (arg8 != 0) {
            method1293(-125, 0, -122, 26, 101, 95, 87, null, 70, null, -127, -40);
        }
        class520.field7518 = arg2;
        class144.field2416 = null;
        class283.field4527 = arg10;
        class129.method1127((byte) 30);
        class221.field3586 = true;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIII)V")
    public final void method1294(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2670 = arg0;
        this.field2679 = arg4 - arg0;
        this.field2668 = arg2;
        field2672++;
        if (arg1 != -19123) {
            field2678 = null;
        }
        this.field2675 = arg3 - arg2;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IBI)Z")
    public final boolean method1295(int arg0, byte arg1, int arg2) {
        field2674++;
        if (arg1 >= -37) {
            this.field2670 = -51;
        }
        return this.field2673.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V")
    public static final void method1296(boolean arg0) {
        field2669++;
        if (arg0) {
            method1292(94);
        }
        int var1 = class622.field8789.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class622.field8789[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class690.field9679; var4++) {
                    if (class476.field7058[var2] == class238.field3775[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class238.field3775[class690.field9679] = class476.field7058[var2];
                    var3 = class690.field9679++;
                }
                class6 var5 = new class6(class622.field8789[var2]);
                int var6 = 0;
                while (var5.field57 < class622.field8789[var2].length && var6 < 511 && class283.field4523 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method67(12021);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class476.field7058[var2] >> 8) * 64 + var10 - class612.field8702;
                    int var13 = (class476.field7058[var2] & 0xFF) * 64 + var11 - class626.field8855;
                    class705 var14 = class538.field7860.method3224(var5.method67(12021), 50);
                    class348 var15 = (class348) class592.field8395.method1558((long) var7, (byte) -93);
                    if (var15 == null && (var14.field9942 & 0x1) > 0 && class70.field887 == var9 && var12 >= 0 && class275.field4426 > var12 + var14.field9949 && var13 >= 0 && class417.field6374 > var14.field9949 + var13) {
                        class589 var16 = new class589();
                        var16.field4197 = var7;
                        class348 var17 = new class348(var16);
                        class592.field8395.method1564((long) var7, var17, (byte) 105);
                        class613.field8707[class289.field4581++] = var17;
                        class102.field1690[class283.field4523++] = var7;
                        var16.field4223 = class562.field8084;
                        var16.method3442((byte) -22, var14);
                        var16.method1846(var16.field8354.field9949, -117);
                        var16.field4168 = var16.field8354.field9927 << 3;
                        var16.method1845(true, 0, (var16.field8354.field9945 + 4 & 0xAF200007) << 11);
                        var16.method3440(var16.method1841(20744), (byte) 114, true, var12, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V")
    public final void method1297(int arg0) {
        if (arg0 > -83) {
            this.method1294(25, 62, -104, 72, -54);
        }
        field2667++;
        int var2 = -1;
        int var3 = this.field2673.length - 8;
        while (var3 > var2) {
            var2++;
            this.field2673[var2] = 0;
            var2++;
            this.field2673[var2] = 0;
            var2++;
            this.field2673[var2] = 0;
            var2++;
            this.field2673[var2] = 0;
            var2++;
            this.field2673[var2] = 0;
            var2++;
            this.field2673[var2] = 0;
            var2++;
            this.field2673[var2] = 0;
            var2++;
            this.field2673[var2] = 0;
        }
        while ((this.field2673.length - 1) > var2) {
            var2++;
            this.field2673[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ler;II)V")
    public class156(class92 arg0, int arg1, int arg2) {
        this.field2673 = new byte[arg1 * arg2];
    }
}
