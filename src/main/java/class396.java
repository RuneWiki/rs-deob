import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class396 extends class485 {

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[B")
    public byte[] field5444;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
    public static int field5454 = -1;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Lwf;")
    public static class117 field5453 = new class117(4);

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "[I")
    public static int[] field5458 = new int[1000];

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "[I")
    public static int[] field5457 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public int field5443;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "I")
    public int field5446;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
    public int field5447;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public final void method2345(boolean arg0) {
        field5441++;
        int var2 = -1;
        int var3 = this.field5444.length - 8;
        if (!arg0) {
            return;
        }
        while (var3 > var2) {
            var2++;
            this.field5444[var2] = 0;
            var2++;
            this.field5444[var2] = 0;
            var2++;
            this.field5444[var2] = 0;
            var2++;
            this.field5444[var2] = 0;
            var2++;
            this.field5444[var2] = 0;
            var2++;
            this.field5444[var2] = 0;
            var2++;
            this.field5444[var2] = 0;
            var2++;
            this.field5444[var2] = 0;
        }
        while (this.field5444.length - 1 > var2) {
            var2++;
            this.field5444[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(II)Z")
    public static final boolean method2346(int arg0, int arg1) {
        if (arg1 == 1979287408) {
            field5451++;
            return arg0 == 6 || arg0 == 8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z")
    public final boolean method2347(int arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            field5457 = null;
        }
        field5445++;
        return this.field5444.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
    public static void method2348(byte arg0) {
        if (arg0 >= -78) {
            field5457 = null;
        }
        field5458 = null;
        field5457 = null;
        field5453 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILjava/awt/Canvas;ZLn;)Lqa;")
    public static final class208 method2349(int arg0, Canvas arg1, boolean arg2, class17 arg3) {
        field5452++;
        if (arg0 != 1763593040) {
            method2346(-5, 66);
        }
        return arg2 ? new class201(arg1, arg3) : new class555(arg1, arg3);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lqa;Ljj;IILbc;B)Z")
    public static final boolean method2350(class208 arg0, class101 arg1, int arg2, int arg3, class308 arg4, byte arg5) {
        field5450++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        if (arg5 > -94) {
            return true;
        }
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field4250 != null) {
            var6 = (arg4.field4234 + arg1.field1470 - class339.field4701) * (class339.field4694 - class339.field4691) / (class339.field4700 - class339.field4701) + class339.field4691;
            var7 = (arg4.field4254 + arg1.field1470 - class339.field4701) * (class339.field4694 - class339.field4691) / (class339.field4700 - class339.field4701) + class339.field4691;
            var9 = class339.field4687 - ((arg4.field4236 + arg1.field1465 - class339.field4699) * (class339.field4687 - class339.field4684) / (class339.field4703 - class339.field4699));
            var8 = class339.field4687 - ((arg1.field1465 + arg4.field4228 - class339.field4699) * (class339.field4687 - class339.field4684) / (class339.field4703 - class339.field4699));
        }
        class53 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field4252 != -1) {
            if (arg1.field1462 && arg4.field4243 != -1) {
                var10 = arg4.method1880((byte) -118, true, arg0);
            } else {
                var10 = arg4.method1880((byte) -122, false, arg0);
            }
            if (var10 != null) {
                var11 = arg1.field1467 - (var10.method326() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg1.field1467 + (var10.method326() + 1 >> 1);
                var13 = arg1.field1466 - (var10.method322() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var14 = arg1.field1466 + (var10.method322() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class597 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg4.field4235 != null) {
            var15 = class37.method230(arg4.field4227, 16074);
            if (var15 != null) {
                var16 = class335.field4642.method2129((byte) -102, null, class116.field1634, null, arg4.field4235);
                int var23 = arg1.field1466;
                if (var10 == null) {
                    var17 = var23 - var15.method3534() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method322() >> 1) + var15.method3533() * var16);
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class116.field1634[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method3537(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg1.field1467 + arg2 - (var18 / 2);
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg1.field1467 + arg2;
                var21 = arg3 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = var15.method3533() * var16 + var17 + arg3;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class339.field4691 || class339.field4694 < var6 || class339.field4684 > var9 || class339.field4687 < var8) {
            return true;
        }
        if (arg4.field4250 != null) {
            int[] var27 = new int[arg4.field4250.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg4.field4250[var28 * 2] + arg1.field1470;
                int var31 = arg4.field4250[var28 * 2 + 1] + arg1.field1465;
                var27[var28 * 2] = (class339.field4694 - class339.field4691) * (var30 - class339.field4701) / (class339.field4700 - class339.field4701) + class339.field4691;
                var27[var28 * 2 + 1] = class339.field4687 - ((var31 - class339.field4699) * (class339.field4687 - class339.field4684) / (class339.field4703 - class339.field4699));
            }
            class107.method790(arg0, var27, arg4.field4259);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg0.method1375(var27[var29 * 2 + 1], 1, var27[var29 * 2 + 2 + 1], var27[(var29 + 1) * 2], arg4.field4215, var27[var29 * 2]);
            }
            arg0.method1375(var27[var27.length - 1], 1, var27[1], var27[0], arg4.field4215, var27[var27.length - 2]);
        }
        if (var10 != null) {
            if (class572.field8429 > 0 && (class90.field1352 != -1 && class90.field1352 == arg1.field1463 || class383.field5268 != -1 && class383.field5268 == arg4.field4246)) {
                int var32;
                if (class276.field3881 <= 50) {
                    var32 = class276.field3881 * 2;
                } else {
                    var32 = 200 - (class276.field3881 * 2);
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg0.method1379(var10.method325() / 2 + 7, var33, (byte) 42, arg1.field1467, arg1.field1466);
                arg0.method1379(var10.method325() / 2 + 5, var33, (byte) 42, arg1.field1467, arg1.field1466);
                arg0.method1379(var10.method325() / 2 + 3, var33, (byte) 42, arg1.field1467, arg1.field1466);
                arg0.method1379(var10.method325() / 2 + 1, var33, (byte) 42, arg1.field1467, arg1.field1466);
                arg0.method1379(var10.method325() / 2, var33, (byte) 42, arg1.field1467, arg1.field1466);
            }
            var10.method316(arg1.field1467 - (var10.method326() >> 1), arg1.field1466 - (var10.method322() >> 1));
        }
        if (arg4.field4235 != null && var15 != null) {
            class340.method2083(arg0, var15, var18, arg1, var17, arg4, var16, 0);
        }
        if (arg4.field4252 != -1 || arg4.field4235 != null) {
            class561 var34 = new class561(arg1);
            var34.field8340 = var12;
            var34.field8332 = var13;
            var34.field8335 = var20;
            var34.field8339 = var14;
            var34.field8344 = var19;
            var34.field8343 = var21;
            var34.field8333 = var22;
            var34.field8345 = var11;
            class227.field3313.method131(var34, 0);
        }
        return false;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
    public final void method2351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5442++;
        int var8 = arg5;
        if (arg1 != arg6) {
            var8 = (arg4 - arg3 << 16) / (arg6 - arg1);
        }
        int var9 = 0;
        if (arg2 != arg6) {
            var9 = (arg0 - arg4 << 16) / (arg2 - arg6);
        }
        int var10 = 0;
        if (arg1 != arg2) {
            var10 = (arg3 - arg0 << 16) / (arg1 - arg2);
        }
        if (arg1 <= arg6 && arg2 >= arg1) {
            if (arg6 >= arg2) {
                int var11;
                int var12 = var11 = arg3 << 16;
                int var13 = arg0 << 16;
                if (arg1 < 0) {
                    var12 -= arg1 * var10;
                    var11 -= arg1 * var8;
                    arg1 = 0;
                }
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if ((arg1 == arg2 || var10 >= var8) && (arg1 != arg2 || var9 <= var8)) {
                    int var17 = arg6 - arg2;
                    int var18 = arg2 - arg1;
                    int var19 = this.field5447 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class7.method21(var19, var13 >> 16, var11 >> 16, 55, 0, this.field5444);
                                var19 += this.field5447;
                                var13 += var9;
                                var11 += var8;
                            }
                        }
                        class7.method21(var19, var12 >> 16, var11 >> 16, -94, 0, this.field5444);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field5447;
                    }
                } else {
                    int var14 = arg6 - arg2;
                    int var15 = arg2 - arg1;
                    int var16 = this.field5447 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class7.method21(var16, var11 >> 16, var13 >> 16, 120, 0, this.field5444);
                                var13 += var9;
                                var16 += this.field5447;
                                var11 += var8;
                            }
                        }
                        class7.method21(var16, var11 >> 16, var12 >> 16, -100, 0, this.field5444);
                        var16 += this.field5447;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg3 << 16;
                int var22 = arg4 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg1 != arg6 && var10 < var8 || arg1 == arg6 && var9 < var10) {
                    int var23 = arg2 - arg6;
                    int var24 = arg6 - arg1;
                    int var25 = this.field5447 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class7.method21(var25, var22 >> 16, var21 >> 16, -84, 0, this.field5444);
                                var25 += this.field5447;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class7.method21(var25, var20 >> 16, var21 >> 16, -94, 0, this.field5444);
                        var21 += var10;
                        var25 += this.field5447;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg2 - arg6;
                    int var27 = arg6 - arg1;
                    int var28 = this.field5447 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class7.method21(var28, var21 >> 16, var22 >> 16, 91, 0, this.field5444);
                                var28 += this.field5447;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class7.method21(var28, var21 >> 16, var20 >> 16, -119, 0, this.field5444);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field5447;
                    }
                }
            }
        } else if (arg6 <= arg2) {
            if (arg2 < arg1) {
                int var29;
                int var30 = var29 = arg4 << 16;
                int var31 = arg0 << 16;
                if (arg6 < 0) {
                    var29 -= arg6 * var9;
                    var30 -= arg6 * var8;
                    arg6 = 0;
                }
                if (arg2 < 0) {
                    var31 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var9 > var8 || arg2 == arg6 && var8 > var10) {
                    int var32 = arg1 - arg2;
                    int var33 = arg2 - arg6;
                    int var34 = this.field5447 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class7.method21(var34, var31 >> 16, var30 >> 16, 127, 0, this.field5444);
                                var31 += var10;
                                var34 += this.field5447;
                                var30 += var8;
                            }
                        }
                        class7.method21(var34, var29 >> 16, var30 >> 16, arg5 ^ 0x63, 0, this.field5444);
                        var29 += var9;
                        var34 += this.field5447;
                        var30 += var8;
                    }
                } else {
                    int var35 = arg1 - arg2;
                    int var36 = arg2 - arg6;
                    int var37 = this.field5447 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class7.method21(var37, var30 >> 16, var31 >> 16, arg5 + 95, 0, this.field5444);
                                var37 += this.field5447;
                                var31 += var10;
                                var30 += var8;
                            }
                        }
                        class7.method21(var37, var30 >> 16, var29 >> 16, 72, 0, this.field5444);
                        var29 += var9;
                        var30 += var8;
                        var37 += this.field5447;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg4 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var9;
                    var39 -= arg6 * var8;
                    arg6 = 0;
                }
                int var40 = arg3 << 16;
                if (arg1 < 0) {
                    var40 -= arg1 * var10;
                    arg1 = 0;
                }
                if (var9 <= var8) {
                    int var41 = arg2 - arg1;
                    int var42 = arg1 - arg6;
                    int var43 = this.field5447 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class7.method21(var43, var40 >> 16, var38 >> 16, 76, 0, this.field5444);
                                var40 += var10;
                                var43 += this.field5447;
                                var38 += var9;
                            }
                        }
                        class7.method21(var43, var39 >> 16, var38 >> 16, arg5 + 108, 0, this.field5444);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field5447;
                    }
                } else {
                    int var44 = arg2 - arg1;
                    int var45 = arg1 - arg6;
                    int var46 = this.field5447 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class7.method21(var46, var38 >> 16, var40 >> 16, arg5 + 109, 0, this.field5444);
                                var46 += this.field5447;
                                var40 += var10;
                                var38 += var9;
                            }
                        }
                        class7.method21(var46, var38 >> 16, var39 >> 16, arg5 + 120, 0, this.field5444);
                        var39 += var8;
                        var38 += var9;
                        var46 += this.field5447;
                    }
                }
            }
        } else if (arg1 >= arg6) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg4 << 16;
            if (arg2 < 0) {
                var48 -= arg2 * var9;
                var47 -= arg2 * var10;
                arg2 = 0;
            }
            if (arg6 < 0) {
                var49 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg1 - arg6;
                int var51 = arg6 - arg2;
                int var52 = this.field5447 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class7.method21(var52, var49 >> 16, var47 >> 16, -98, 0, this.field5444);
                            var52 += this.field5447;
                            var47 += var10;
                            var49 += var8;
                        }
                    }
                    class7.method21(var52, var48 >> 16, var47 >> 16, -126, 0, this.field5444);
                    var47 += var10;
                    var52 += this.field5447;
                    var48 += var9;
                }
            } else {
                int var53 = arg1 - arg6;
                int var54 = arg6 - arg2;
                int var55 = this.field5447 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class7.method21(var55, var47 >> 16, var49 >> 16, -89, 0, this.field5444);
                            var49 += var8;
                            var47 += var10;
                            var55 += this.field5447;
                        }
                    }
                    class7.method21(var55, var47 >> 16, var48 >> 16, 84, 0, this.field5444);
                    var48 += var9;
                    var55 += this.field5447;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg2 < 0) {
                var56 -= arg2 * var10;
                var57 -= arg2 * var9;
                arg2 = 0;
            }
            int var58 = arg3 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var8;
                arg1 = 0;
            }
            if (var9 < var10) {
                int var59 = arg6 - arg1;
                int var60 = arg1 - arg2;
                int var61 = this.field5447 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class7.method21(var61, var58 >> 16, var57 >> 16, 122, 0, this.field5444);
                            var58 += var8;
                            var61 += this.field5447;
                            var57 += var9;
                        }
                    }
                    class7.method21(var61, var56 >> 16, var57 >> 16, arg5 ^ 0xFFFFFFAD, 0, this.field5444);
                    var57 += var9;
                    var61 += this.field5447;
                    var56 += var10;
                }
            } else {
                int var62 = arg6 - arg1;
                int var63 = arg1 - arg2;
                int var64 = this.field5447 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class7.method21(var64, var57 >> 16, var58 >> 16, -92, 0, this.field5444);
                            var57 += var9;
                            var64 += this.field5447;
                            var58 += var8;
                        }
                    }
                    class7.method21(var64, var57 >> 16, var56 >> 16, -126, 0, this.field5444);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field5447;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V")
    public final void method2352(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5446 = arg1;
        this.field5443 = arg0;
        this.field5447 = arg3 - arg0;
        field5455++;
        if (arg4 == 3) {
            this.field5448 = arg2 - arg1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lcb;II)V")
    public class396(class444 arg0, int arg1, int arg2) {
        this.field5444 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lica;I)V")
    public static final void method2353(class571 arg0, int arg1) {
        field5449++;
        for (class14 var2 = (class14) class615.field9103.method124((byte) 42); var2 != null; var2 = (class14) class615.field9103.method120(-87)) {
            if (var2.field145 == arg0) {
                if (var2.field139 != null) {
                    class155.field2316.method258(var2.field139);
                    var2.field139 = null;
                }
                var2.method2457(arg1 - 1840076894);
                return;
            }
        }
        if (arg1 != 1840068472) {
            field5453 = null;
        }
    }
}
