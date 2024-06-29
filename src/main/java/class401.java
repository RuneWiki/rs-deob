import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class401 extends class115 {

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "[B")
    public byte[] field5528;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "Z")
    public static boolean field5524 = false;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
    public static int field5525 = 0;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "I")
    public int field5523;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
    public int field5527;

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "I")
    public int field5529;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public int field5536;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[I")
    public static int[] field5521;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "[Lmq;")
    public static class85[] field5530;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 11)
    public final void method2380(int arg0) {
        field5531++;
        if (arg0 != -4683) {
            method2385((byte) -36);
        }
        int var2 = -1;
        int var3 = this.field5528.length - 8;
        while (var2 < var3) {
            var2++;
            this.field5528[var2] = 0;
            var2++;
            this.field5528[var2] = 0;
            var2++;
            this.field5528[var2] = 0;
            var2++;
            this.field5528[var2] = 0;
            var2++;
            this.field5528[var2] = 0;
            var2++;
            this.field5528[var2] = 0;
            var2++;
            this.field5528[var2] = 0;
            var2++;
            this.field5528[var2] = 0;
        }
        while (var2 < (this.field5528.length - 1)) {
            var2++;
            this.field5528[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIIIII)V", line = 41)
    public final void method2381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5535++;
        int var8 = 0;
        if (arg0 != arg5) {
            var8 = (arg2 - arg4 << 16) / (arg5 - arg0);
        }
        int var9 = 0;
        if (arg3 != arg5) {
            var9 = (arg1 - arg2 << 16) / (arg3 - arg5);
        }
        int var10 = arg6;
        if (arg0 != arg3) {
            var10 = (arg4 - arg1 << 16) / (arg0 - arg3);
        }
        if (arg0 <= arg5 && arg0 <= arg3) {
            if (arg3 <= arg5) {
                int var11;
                int var12 = var11 = arg4 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg1 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if ((arg0 == arg3 || var8 <= var10) && (arg0 != arg3 || var8 >= var9)) {
                    int var17 = arg5 - arg3;
                    int var18 = arg3 - arg0;
                    int var19 = this.field5529 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class99.method833(this.field5528, (byte) -124, var13 >> 16, var19, var11 >> 16, 0);
                                var13 += var9;
                                var11 += var8;
                                var19 += this.field5529;
                            }
                        }
                        class99.method833(this.field5528, (byte) -104, var12 >> 16, var19, var11 >> 16, 0);
                        var19 += this.field5529;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg5 - arg3;
                    int var15 = arg3 - arg0;
                    int var16 = this.field5529 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class99.method833(this.field5528, (byte) -111, var11 >> 16, var16, var13 >> 16, 0);
                                var11 += var8;
                                var16 += this.field5529;
                                var13 += var9;
                            }
                        }
                        class99.method833(this.field5528, (byte) -96, var11 >> 16, var16, var12 >> 16, 0);
                        var16 += this.field5529;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg4 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                int var22 = arg2 << 16;
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg0 != arg5 && var8 > var10 || arg0 == arg5 && var9 < var10) {
                    int var23 = arg3 - arg5;
                    int var24 = arg5 - arg0;
                    int var25 = this.field5529 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class99.method833(this.field5528, (byte) -110, var22 >> 16, var25, var21 >> 16, 0);
                                var22 += var9;
                                var25 += this.field5529;
                                var21 += var10;
                            }
                        }
                        class99.method833(this.field5528, (byte) -84, var20 >> 16, var25, var21 >> 16, 0);
                        var25 += this.field5529;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg3 - arg5;
                    int var27 = arg5 - arg0;
                    int var28 = this.field5529 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class99.method833(this.field5528, (byte) -83, var21 >> 16, var28, var22 >> 16, 0);
                                var28 += this.field5529;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class99.method833(this.field5528, (byte) -101, var21 >> 16, var28, var20 >> 16, 0);
                        var20 += var8;
                        var28 += this.field5529;
                        var21 += var10;
                    }
                }
            }
        } else if (arg3 < arg5) {
            if (arg0 < arg5) {
                int var29;
                int var30 = var29 = arg1 << 16;
                int var31 = arg4 << 16;
                if (arg3 < 0) {
                    var29 -= arg3 * var10;
                    var30 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg0 < 0) {
                    var31 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg5 - arg0;
                    int var33 = arg0 - arg3;
                    int var34 = this.field5529 * arg3;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class99.method833(this.field5528, (byte) -106, var30 >> 16, var34, var31 >> 16, 0);
                                var30 += var9;
                                var31 += var8;
                                var34 += this.field5529;
                            }
                        }
                        class99.method833(this.field5528, (byte) -90, var30 >> 16, var34, var29 >> 16, 0);
                        var34 += this.field5529;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg5 - arg0;
                    int var36 = arg0 - arg3;
                    int var37 = this.field5529 * arg3;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class99.method833(this.field5528, (byte) -125, var31 >> 16, var37, var30 >> 16, 0);
                                var31 += var8;
                                var37 += this.field5529;
                                var30 += var9;
                            }
                        }
                        class99.method833(this.field5528, (byte) -124, var29 >> 16, var37, var30 >> 16, 0);
                        var29 += var10;
                        var37 += this.field5529;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                int var40 = arg2 << 16;
                if (arg3 < 0) {
                    var38 -= arg3 * var10;
                    var39 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg5 < 0) {
                    var40 -= arg5 * var8;
                    arg5 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg0 - arg5;
                    int var42 = arg5 - arg3;
                    int var43 = this.field5529 * arg3;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class99.method833(this.field5528, (byte) -88, var40 >> 16, var43, var38 >> 16, 0);
                                var43 += this.field5529;
                                var40 += var8;
                                var38 += var10;
                            }
                        }
                        class99.method833(this.field5528, (byte) -96, var39 >> 16, var43, var38 >> 16, 0);
                        var39 += var9;
                        var38 += var10;
                        var43 += this.field5529;
                    }
                } else {
                    int var44 = arg0 - arg5;
                    int var45 = arg5 - arg3;
                    int var46 = this.field5529 * arg3;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class99.method833(this.field5528, (byte) -118, var38 >> 16, var46, var40 >> 16, 0);
                                var38 += var10;
                                var46 += this.field5529;
                                var40 += var8;
                            }
                        }
                        class99.method833(this.field5528, (byte) -113, var38 >> 16, var46, var39 >> 16, 0);
                        var39 += var9;
                        var38 += var10;
                        var46 += this.field5529;
                    }
                }
            }
        } else if (arg0 <= arg3) {
            int var47;
            int var48 = var47 = arg2 << 16;
            if (arg5 < 0) {
                var48 -= arg5 * var8;
                var47 -= arg5 * var9;
                arg5 = 0;
            }
            int var49 = arg4 << 16;
            if (arg0 < 0) {
                var49 -= arg0 * var10;
                arg0 = 0;
            }
            if (var8 < var9) {
                int var50 = arg3 - arg0;
                int var51 = arg0 - arg5;
                int var52 = this.field5529 * arg5;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class99.method833(this.field5528, (byte) -93, var47 >> 16, var52, var49 >> 16, 0);
                            var47 += var9;
                            var52 += this.field5529;
                            var49 += var10;
                        }
                    }
                    class99.method833(this.field5528, (byte) -83, var47 >> 16, var52, var48 >> 16, 0);
                    var47 += var9;
                    var52 += this.field5529;
                    var48 += var8;
                }
            } else {
                int var53 = arg3 - arg0;
                int var54 = arg0 - arg5;
                int var55 = this.field5529 * arg5;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class99.method833(this.field5528, (byte) -120, var49 >> 16, var55, var47 >> 16, 0);
                            var49 += var10;
                            var55 += this.field5529;
                            var47 += var9;
                        }
                    }
                    class99.method833(this.field5528, (byte) -114, var48 >> 16, var55, var47 >> 16, 0);
                    var47 += var9;
                    var55 += this.field5529;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            if (arg5 < 0) {
                var57 -= arg5 * var8;
                var56 -= arg5 * var9;
                arg5 = 0;
            }
            int var58 = arg1 << 16;
            if (arg3 < 0) {
                var58 -= arg3 * var10;
                arg3 = 0;
            }
            if (arg3 != arg5 && var8 < var9 || arg3 == arg5 && var8 > var10) {
                int var59 = arg0 - arg3;
                int var60 = arg3 - arg5;
                int var61 = this.field5529 * arg5;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class99.method833(this.field5528, (byte) -96, var58 >> 16, var61, var57 >> 16, 0);
                            var57 += var8;
                            var58 += var10;
                            var61 += this.field5529;
                        }
                    }
                    class99.method833(this.field5528, (byte) -96, var56 >> 16, var61, var57 >> 16, 0);
                    var56 += var9;
                    var61 += this.field5529;
                    var57 += var8;
                }
            } else {
                int var62 = arg0 - arg3;
                int var63 = arg3 - arg5;
                int var64 = this.field5529 * arg5;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class99.method833(this.field5528, (byte) -92, var57 >> 16, var64, var58 >> 16, 0);
                            var58 += var10;
                            var57 += var8;
                            var64 += this.field5529;
                        }
                    }
                    class99.method833(this.field5528, (byte) -127, var57 >> 16, var64, var56 >> 16, 0);
                    var64 += this.field5529;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBIII)V", line = 489)
    public final void method2382(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.field5527 = arg0 - arg4;
        this.field5523 = arg4;
        this.field5529 = arg2 - arg3;
        field5534++;
        this.field5536 = arg3;
        if (arg1 != -123) {
            field5524 = false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/lang/String;)I", line = 509)
    public static final int method2383(byte arg0, String arg1) {
        field5532++;
        if (!class778.field10678.field1585) {
            return -1;
        } else if (class156.field2453.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class458.method2682(-1, arg1);
            if (var2 == null) {
                return -1;
            }
            String var3 = class228.field3322 + var2;
            if (!class339.field4807.method3002(var3, "", (byte) 54)) {
                return -1;
            } else if (class339.field4807.method2990((byte) 125, var3)) {
                byte[] var4 = class339.field4807.method3017(0, "", var3);
                Object var5 = null;
                if (arg0 >= -110) {
                    field5533 = -62;
                }
                File var6;
                try {
                    var6 = class32.method264(26007, var2);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class441.method2615((byte) -54, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class778.field10678.method920(var6, (byte) -85, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class465.method2721((byte) 103, var6, arg1);
                return 100;
            } else {
                return class339.field4807.method3020(var3, 0);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)Z", line = 606)
    public final boolean method2384(byte arg0, int arg1, int arg2) {
        if (arg0 >= -96) {
            return false;
        } else {
            field5520++;
            return arg1 * arg2 <= this.field5528.length;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 617)
    public static void method2385(byte arg0) {
        if (arg0 <= 105) {
            field5530 = null;
        }
        field5521 = null;
        field5530 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIB)J", line = 629)
    public static final long method2386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field5526++;
        class99.field1438.clear();
        if (arg6 == -45) {
            class99.field1438.set(arg5, arg4, arg2, arg3, arg1, arg0);
            return class99.field1438.getTime().getTime();
        } else {
            return 51L;
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lmj;II)V", line = 643)
    public class401(class114 arg0, int arg1, int arg2) {
        this.field5528 = new byte[arg1 * arg2];
    }
}
