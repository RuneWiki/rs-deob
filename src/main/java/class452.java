import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class452 extends class485 {

    @OriginalMember(owner = "client!iba", name = "J", descriptor = "[B")
    public byte[] field6383;

    @OriginalMember(owner = "client!iba", name = "D", descriptor = "Lrw;")
    public static class645 field6377 = new class645("RC", 1);

    @OriginalMember(owner = "client!iba", name = "T", descriptor = "[I")
    public static int[] field6392 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!iba", name = "S", descriptor = "F")
    public static float field6391;

    @OriginalMember(owner = "client!iba", name = "C", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!iba", name = "F", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!iba", name = "G", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!iba", name = "H", descriptor = "I")
    public int field6381;

    @OriginalMember(owner = "client!iba", name = "I", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!iba", name = "K", descriptor = "I")
    public int field6384;

    @OriginalMember(owner = "client!iba", name = "L", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!iba", name = "M", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!iba", name = "N", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!iba", name = "P", descriptor = "I")
    public int field6388;

    @OriginalMember(owner = "client!iba", name = "Q", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!iba", name = "R", descriptor = "I")
    public int field6390;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II[Lmc;)V")
    public static final void method2650(int arg0, int arg1, class114[] arg2) {
        field6389++;
        for (int var3 = arg0; var3 < arg2.length; var3++) {
            class114 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field1880 == 0) {
                    if (var4.field1886 != null) {
                        method2650(0, arg1, var4.field1886);
                    }
                    class128 var5 = (class128) class211.field2971.method1242(arg0, (long) var4.field1810);
                    if (var5 != null) {
                        class625.method3650(arg1, var5.field2065, false);
                    }
                }
                if (arg1 == 0 && var4.field1827 != null) {
                    class224 var6 = new class224();
                    var6.field3210 = var4;
                    var6.field3207 = var4.field1827;
                    class123.method862(var6);
                }
                if (arg1 == 1 && var4.field1911 != null) {
                    if (var4.field1749 >= 0) {
                        class114 var7 = class612.method3584(var4.field1810, 0);
                        if (var7 == null || var7.field1886 == null || var4.field1749 >= var7.field1886.length || var7.field1886[var4.field1749] != var4) {
                            continue;
                        }
                    }
                    class224 var8 = new class224();
                    var8.field3207 = var4.field1911;
                    var8.field3210 = var4;
                    class123.method862(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(Z)V")
    public final void method2651(boolean arg0) {
        field6382++;
        int var2 = -1;
        int var3 = this.field6383.length - 8;
        while (var3 > var2) {
            var2++;
            this.field6383[var2] = 0;
            var2++;
            this.field6383[var2] = 0;
            var2++;
            this.field6383[var2] = 0;
            var2++;
            this.field6383[var2] = 0;
            var2++;
            this.field6383[var2] = 0;
            var2++;
            this.field6383[var2] = 0;
            var2++;
            this.field6383[var2] = 0;
            var2++;
            this.field6383[var2] = 0;
        }
        while ((this.field6383.length - 1) > var2) {
            var2++;
            this.field6383[var2] = 0;
        }
        if (!arg0) {
            this.field6381 = -103;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIIIII)V")
    public final void method2652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6380++;
        int var8 = 0;
        if (arg0 != 1685686832) {
            method2655(-13, null);
        }
        if (arg1 != arg3) {
            var8 = (arg4 - arg2 << 16) / (arg1 - arg3);
        }
        int var9 = 0;
        if (arg1 != arg6) {
            var9 = (arg5 - arg4 << 16) / (arg6 - arg1);
        }
        int var10 = 0;
        if (arg3 != arg6) {
            var10 = (arg2 - arg5 << 16) / (arg3 - arg6);
        }
        if (arg3 <= arg1 && arg6 >= arg3) {
            if (arg6 <= arg1) {
                int var11;
                int var12 = var11 = arg2 << 16;
                int var13 = arg5 << 16;
                if (arg3 < 0) {
                    var12 -= arg3 * var10;
                    var11 -= arg3 * var8;
                    arg3 = 0;
                }
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg3 != arg6 && var10 < var8 || arg3 == arg6 && var9 > var8) {
                    int var14 = arg1 - arg6;
                    int var15 = arg6 - arg3;
                    int var16 = this.field6381 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class353.method2120(var16, this.field6383, 0, var13 >> 16, (byte) -42, var11 >> 16);
                                var16 += this.field6381;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class353.method2120(var16, this.field6383, 0, var12 >> 16, (byte) -76, var11 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field6381;
                    }
                } else {
                    int var17 = arg1 - arg6;
                    int var18 = arg6 - arg3;
                    int var19 = this.field6381 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class353.method2120(var19, this.field6383, 0, var11 >> 16, (byte) -57, var13 >> 16);
                                var13 += var9;
                                var11 += var8;
                                var19 += this.field6381;
                            }
                        }
                        class353.method2120(var19, this.field6383, 0, var11 >> 16, (byte) -109, var12 >> 16);
                        var11 += var8;
                        var19 += this.field6381;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg2 << 16;
                int var22 = arg4 << 16;
                if (arg3 < 0) {
                    var21 -= arg3 * var10;
                    var20 -= arg3 * var8;
                    arg3 = 0;
                }
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg3 && var8 > var10 || arg1 == arg3 && var9 < var10) {
                    int var23 = arg6 - arg1;
                    int var24 = arg1 - arg3;
                    int var25 = this.field6381 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class353.method2120(var25, this.field6383, 0, var21 >> 16, (byte) -91, var22 >> 16);
                                var21 += var10;
                                var25 += this.field6381;
                                var22 += var9;
                            }
                        }
                        class353.method2120(var25, this.field6383, 0, var21 >> 16, (byte) -86, var20 >> 16);
                        var20 += var8;
                        var25 += this.field6381;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg6 - arg1;
                    int var27 = arg1 - arg3;
                    int var28 = this.field6381 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class353.method2120(var28, this.field6383, 0, var22 >> 16, (byte) -85, var21 >> 16);
                                var21 += var10;
                                var22 += var9;
                                var28 += this.field6381;
                            }
                        }
                        class353.method2120(var28, this.field6383, 0, var20 >> 16, (byte) -125, var21 >> 16);
                        var21 += var10;
                        var28 += this.field6381;
                        var20 += var8;
                    }
                }
            }
        } else if (arg6 < arg1) {
            if (arg3 < arg1) {
                int var29;
                int var30 = var29 = arg5 << 16;
                int var31 = arg2 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var9;
                    var29 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg3 < 0) {
                    var31 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg1 - arg3;
                    int var33 = arg3 - arg6;
                    int var34 = this.field6381 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class353.method2120(var34, this.field6383, 0, var31 >> 16, (byte) -38, var30 >> 16);
                                var30 += var9;
                                var34 += this.field6381;
                                var31 += var8;
                            }
                        }
                        class353.method2120(var34, this.field6383, 0, var29 >> 16, (byte) -36, var30 >> 16);
                        var34 += this.field6381;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg1 - arg3;
                    int var36 = arg3 - arg6;
                    int var37 = this.field6381 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class353.method2120(var37, this.field6383, 0, var30 >> 16, (byte) -56, var31 >> 16);
                                var30 += var9;
                                var31 += var8;
                                var37 += this.field6381;
                            }
                        }
                        class353.method2120(var37, this.field6383, 0, var30 >> 16, (byte) -119, var29 >> 16);
                        var29 += var10;
                        var37 += this.field6381;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                int var40 = arg4 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var10;
                    var39 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg3 - arg1;
                    int var42 = arg1 - arg6;
                    int var43 = this.field6381 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class353.method2120(var43, this.field6383, 0, var40 >> 16, (byte) -109, var38 >> 16);
                                var38 += var10;
                                var40 += var8;
                                var43 += this.field6381;
                            }
                        }
                        class353.method2120(var43, this.field6383, 0, var39 >> 16, (byte) -31, var38 >> 16);
                        var39 += var9;
                        var38 += var10;
                        var43 += this.field6381;
                    }
                } else {
                    int var44 = arg3 - arg1;
                    int var45 = arg1 - arg6;
                    int var46 = this.field6381 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class353.method2120(var46, this.field6383, 0, var38 >> 16, (byte) -103, var40 >> 16);
                                var46 += this.field6381;
                                var40 += var8;
                                var38 += var10;
                            }
                        }
                        class353.method2120(var46, this.field6383, 0, var38 >> 16, (byte) -43, var39 >> 16);
                        var38 += var10;
                        var39 += var9;
                        var46 += this.field6381;
                    }
                }
            }
        } else if (arg6 < arg3) {
            int var47;
            int var48 = var47 = arg4 << 16;
            int var49 = arg5 << 16;
            if (arg1 < 0) {
                var47 -= arg1 * var9;
                var48 -= arg1 * var8;
                arg1 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg1 != arg6 && var8 < var9 || arg1 == arg6 && var10 < var8) {
                int var50 = arg3 - arg6;
                int var51 = arg6 - arg1;
                int var52 = this.field6381 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class353.method2120(var52, this.field6383, 0, var48 >> 16, (byte) -69, var49 >> 16);
                            var48 += var8;
                            var52 += this.field6381;
                            var49 += var10;
                        }
                    }
                    class353.method2120(var52, this.field6383, 0, var48 >> 16, (byte) -89, var47 >> 16);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field6381;
                }
            } else {
                int var53 = arg3 - arg6;
                int var54 = arg6 - arg1;
                int var55 = this.field6381 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class353.method2120(var55, this.field6383, 0, var49 >> 16, (byte) -89, var48 >> 16);
                            var55 += this.field6381;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class353.method2120(var55, this.field6383, 0, var47 >> 16, (byte) -37, var48 >> 16);
                    var55 += this.field6381;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            if (arg1 < 0) {
                var57 -= arg1 * var8;
                var56 -= arg1 * var9;
                arg1 = 0;
            }
            int var58 = arg2 << 16;
            if (arg3 < 0) {
                var58 -= arg3 * var10;
                arg3 = 0;
            }
            if (var8 < var9) {
                int var59 = arg6 - arg3;
                int var60 = arg3 - arg1;
                int var61 = this.field6381 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class353.method2120(var61, this.field6383, 0, var58 >> 16, (byte) -82, var56 >> 16);
                            var56 += var9;
                            var61 += this.field6381;
                            var58 += var10;
                        }
                    }
                    class353.method2120(var61, this.field6383, 0, var57 >> 16, (byte) -91, var56 >> 16);
                    var61 += this.field6381;
                    var56 += var9;
                    var57 += var8;
                }
            } else {
                int var62 = arg6 - arg3;
                int var63 = arg3 - arg1;
                int var64 = this.field6381 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class353.method2120(var64, this.field6383, 0, var56 >> 16, (byte) -114, var58 >> 16);
                            var56 += var9;
                            var58 += var10;
                            var64 += this.field6381;
                        }
                    }
                    class353.method2120(var64, this.field6383, 0, var56 >> 16, (byte) -51, var57 >> 16);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field6381;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIII)V")
    public final void method2653(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -63) {
            method2656(-26, 118, -58);
        }
        field6387++;
        this.field6390 = arg2 - arg3;
        this.field6384 = arg3;
        this.field6388 = arg0;
        this.field6381 = arg4 - arg0;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(III)Z")
    public static final boolean method2654(int arg0, int arg1, int arg2) {
        field6376++;
        if (arg2 < 68) {
            method2650(-125, -92, null);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2655(int arg0, String arg1) {
        field6378++;
        int var2 = -65 / ((69 - arg0) / 39);
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(III)Lbo;")
    public static final class622 method2656(int arg0, int arg1, int arg2) {
        if (class356.field4807[arg0][arg1][arg2] == null) {
            boolean var3 = class356.field4807[0][arg1][arg2] != null && class356.field4807[0][arg1][arg2].field8967 != null;
            if (var3 && arg0 >= class395.field5610 - 1) {
                return null;
            }
            class500.method2900(arg0, arg1, arg2);
        }
        return class356.field4807[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "(III)Z")
    public final boolean method2657(int arg0, int arg1, int arg2) {
        field6379++;
        if (arg1 == -1) {
            return this.field6383.length >= (arg0 * arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)V")
    public static final void method2658(int arg0, int arg1) {
        class223.method1432(2);
        field6385++;
        class390.method2350(arg0 - 1);
        if (arg0 != 7) {
            field6391 = 0.5476198F;
        }
        class170.method1083(true, (byte) -125, arg1);
        class613.method3586(class645.field9371, class385.field5162, class69.field1165, (byte) -91);
        class608.method3568(0, class69.field1165, class645.field9371);
        class239.method1493(-16956);
        class190.method1183(arg0 - 112, class257.field3566);
        class40.method413(-101);
        class510.method2946((byte) -119);
        if (class440.field6254 == 2) {
            class45.method440(3, -83);
        } else if (class440.field6254 == 6) {
            class45.method440(7, 79);
        } else if (class440.field6254 == 9) {
            class45.method440(10, -82);
        } else if (class440.field6254 == 1) {
            class397.method2376(class645.field9371, (byte) -124, class69.field1165);
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lwr;II)V")
    public class452(class388 arg0, int arg1, int arg2) {
        this.field6383 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(I)V")
    public static void method2659(int arg0) {
        if (arg0 != 0) {
            field6377 = null;
        }
        field6392 = null;
        field6377 = null;
    }
}
