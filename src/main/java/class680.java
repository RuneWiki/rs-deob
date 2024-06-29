import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class680 extends class605 {

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "[B")
    public byte[] field9372;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "[I")
    public static int[] field9371 = new int[128];

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
    public static int field9368;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public int field9370;

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public int field9373;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public int field9374;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public int field9378;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Lpe;")
    public static class615 field9375;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "Lpe;")
    public static class615 field9380;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method3736(boolean arg0) {
        field9375 = null;
        field9371 = null;
        if (!arg0) {
            field9380 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB)Z")
    public final boolean method3737(int arg0, int arg1, byte arg2) {
        field9379++;
        if (arg2 > -97) {
            return false;
        } else {
            return (arg0 * arg1) <= this.field9372.length;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public final void method3738(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            this.method3737(-46, -105, (byte) -80);
        }
        this.field9370 = arg2;
        field9368++;
        this.field9373 = arg4 - arg2;
        this.field9374 = arg0;
        this.field9378 = arg3 - arg0;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lji;II)V")
    public class680(class622 arg0, int arg1, int arg2) {
        this.field9372 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static final void method3739(byte arg0) {
        field9377++;
        for (int var1 = 0; var1 < 5; var1++) {
            class86.field1150[var1] = false;
        }
        if (arg0 > -44) {
            field9371 = null;
        }
        class71.field965 = 0;
        class211.field2742 = class299.field3911;
        class660.field9205 = -1;
        class130.field1671 = class655.field9120;
        class704.field9810 = 5;
        class133.field1740 = class499.field6555;
        class83.field1130 = class549.field7132;
        class424.field5505 = -1;
        class235.field3140 = 0;
        class656.field9156 = class424.field5503;
        class374.field4799 = class358.field4639;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
    public final void method3740(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 781914992) {
            return;
        }
        field9376++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg3 - arg6 << 16) / (arg4 - arg0);
        }
        int var9 = 0;
        if (arg4 != arg5) {
            var9 = (arg2 - arg3 << 16) / (arg5 - arg4);
        }
        int var10 = 0;
        if (arg0 != arg5) {
            var10 = (arg6 - arg2 << 16) / (arg0 - arg5);
        }
        if (arg4 >= arg0 && arg0 <= arg5) {
            if (arg5 <= arg4) {
                int var11;
                int var12 = var11 = arg6 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                int var13 = arg2 << 16;
                if (arg5 < 0) {
                    var13 -= arg5 * var9;
                    arg5 = 0;
                }
                if ((arg0 == arg5 || var10 >= var8) && (arg0 != arg5 || var8 >= var9)) {
                    int var17 = arg4 - arg5;
                    int var18 = arg5 - arg0;
                    int var19 = this.field9378 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class659.method3622(0, (byte) 115, var13 >> 16, this.field9372, var19, var11 >> 16);
                                var11 += var8;
                                var19 += this.field9378;
                                var13 += var9;
                            }
                        }
                        class659.method3622(0, (byte) 125, var12 >> 16, this.field9372, var19, var11 >> 16);
                        var19 += this.field9378;
                        var11 += var8;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg4 - arg5;
                    int var15 = arg5 - arg0;
                    int var16 = this.field9378 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class659.method3622(0, (byte) 79, var11 >> 16, this.field9372, var16, var13 >> 16);
                                var13 += var9;
                                var16 += this.field9378;
                                var11 += var8;
                            }
                        }
                        class659.method3622(0, (byte) 113, var11 >> 16, this.field9372, var16, var12 >> 16);
                        var12 += var10;
                        var16 += this.field9378;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                if (arg0 < 0) {
                    var20 -= arg0 * var8;
                    var21 -= arg0 * var10;
                    arg0 = 0;
                }
                int var22 = arg3 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var10 > var9) {
                    int var23 = arg5 - arg4;
                    int var24 = arg4 - arg0;
                    int var25 = this.field9378 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class659.method3622(0, (byte) 82, var22 >> 16, this.field9372, var25, var21 >> 16);
                                var21 += var10;
                                var25 += this.field9378;
                                var22 += var9;
                            }
                        }
                        class659.method3622(0, (byte) 111, var20 >> 16, this.field9372, var25, var21 >> 16);
                        var25 += this.field9378;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg5 - arg4;
                    int var27 = arg4 - arg0;
                    int var28 = this.field9378 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class659.method3622(0, (byte) 110, var21 >> 16, this.field9372, var28, var22 >> 16);
                                var28 += this.field9378;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class659.method3622(0, (byte) 76, var21 >> 16, this.field9372, var28, var20 >> 16);
                        var21 += var10;
                        var28 += this.field9378;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 > arg5) {
            if (arg0 >= arg4) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg5 < 0) {
                    var29 -= arg5 * var10;
                    var30 -= arg5 * var9;
                    arg5 = 0;
                }
                int var31 = arg3 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var8;
                    arg4 = 0;
                }
                if (var10 > var9) {
                    int var32 = arg0 - arg4;
                    int var33 = arg4 - arg5;
                    int var34 = this.field9378 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class659.method3622(0, (byte) 112, var29 >> 16, this.field9372, var34, var31 >> 16);
                                var31 += var8;
                                var34 += this.field9378;
                                var29 += var10;
                            }
                        }
                        class659.method3622(0, (byte) 90, var29 >> 16, this.field9372, var34, var30 >> 16);
                        var29 += var10;
                        var30 += var9;
                        var34 += this.field9378;
                    }
                } else {
                    int var35 = arg0 - arg4;
                    int var36 = arg4 - arg5;
                    int var37 = this.field9378 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class659.method3622(0, (byte) 114, var31 >> 16, this.field9372, var37, var29 >> 16);
                                var37 += this.field9378;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        class659.method3622(0, (byte) 106, var30 >> 16, this.field9372, var37, var29 >> 16);
                        var29 += var10;
                        var37 += this.field9378;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg5 < 0) {
                    var38 -= arg5 * var10;
                    var39 -= arg5 * var9;
                    arg5 = 0;
                }
                int var40 = arg6 << 16;
                if (arg0 < 0) {
                    var40 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg4 - arg0;
                    int var42 = arg0 - arg5;
                    int var43 = this.field9378 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class659.method3622(0, (byte) 93, var39 >> 16, this.field9372, var43, var40 >> 16);
                                var43 += this.field9378;
                                var40 += var8;
                                var39 += var9;
                            }
                        }
                        class659.method3622(0, (byte) 79, var39 >> 16, this.field9372, var43, var38 >> 16);
                        var38 += var10;
                        var43 += this.field9378;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg4 - arg0;
                    int var45 = arg0 - arg5;
                    int var46 = this.field9378 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class659.method3622(0, (byte) 105, var40 >> 16, this.field9372, var46, var39 >> 16);
                                var40 += var8;
                                var46 += this.field9378;
                                var39 += var9;
                            }
                        }
                        class659.method3622(0, (byte) 116, var38 >> 16, this.field9372, var46, var39 >> 16);
                        var39 += var9;
                        var46 += this.field9378;
                        var38 += var10;
                    }
                }
            }
        } else if (arg0 > arg5) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg2 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var9;
                var48 -= arg4 * var8;
                arg4 = 0;
            }
            if (arg5 < 0) {
                var49 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg4 != arg5 && var8 < var9 || arg4 == arg5 && var10 < var8) {
                int var50 = arg0 - arg5;
                int var51 = arg5 - arg4;
                int var52 = this.field9378 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class659.method3622(0, (byte) 117, var49 >> 16, this.field9372, var52, var48 >> 16);
                            var52 += this.field9378;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class659.method3622(0, (byte) 117, var47 >> 16, this.field9372, var52, var48 >> 16);
                    var47 += var9;
                    var48 += var8;
                    var52 += this.field9378;
                }
            } else {
                int var53 = arg0 - arg5;
                int var54 = arg5 - arg4;
                int var55 = this.field9378 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class659.method3622(0, (byte) 109, var48 >> 16, this.field9372, var55, var49 >> 16);
                            var49 += var10;
                            var48 += var8;
                            var55 += this.field9378;
                        }
                    }
                    class659.method3622(0, (byte) 94, var48 >> 16, this.field9372, var55, var47 >> 16);
                    var47 += var9;
                    var55 += this.field9378;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var8;
                var56 -= arg4 * var9;
                arg4 = 0;
            }
            int var58 = arg6 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var10;
                arg0 = 0;
            }
            if (var8 >= var9) {
                int var59 = arg5 - arg0;
                int var60 = arg0 - arg4;
                int var61 = this.field9378 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class659.method3622(0, (byte) 100, var58 >> 16, this.field9372, var61, var56 >> 16);
                            var58 += var10;
                            var61 += this.field9378;
                            var56 += var9;
                        }
                    }
                    class659.method3622(0, (byte) 98, var57 >> 16, this.field9372, var61, var56 >> 16);
                    var61 += this.field9378;
                    var56 += var9;
                    var57 += var8;
                }
            } else {
                int var62 = arg5 - arg0;
                int var63 = arg0 - arg4;
                int var64 = this.field9378 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class659.method3622(0, (byte) 112, var56 >> 16, this.field9372, var64, var58 >> 16);
                            var58 += var10;
                            var64 += this.field9378;
                            var56 += var9;
                        }
                    }
                    class659.method3622(0, (byte) 90, var56 >> 16, this.field9372, var64, var57 >> 16);
                    var64 += this.field9378;
                    var57 += var8;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
    public final void method3741(byte arg0) {
        field9369++;
        int var2 = -1;
        int var3 = this.field9372.length - 8;
        if (arg0 != -70) {
            return;
        }
        while (var3 > var2) {
            var2++;
            this.field9372[var2] = 0;
            var2++;
            this.field9372[var2] = 0;
            var2++;
            this.field9372[var2] = 0;
            var2++;
            this.field9372[var2] = 0;
            var2++;
            this.field9372[var2] = 0;
            var2++;
            this.field9372[var2] = 0;
            var2++;
            this.field9372[var2] = 0;
            var2++;
            this.field9372[var2] = 0;
        }
        while ((this.field9372.length - 1) > var2) {
            var2++;
            this.field9372[var2] = 0;
        }
    }

    static {
        for (int var0 = 0; var0 < field9371.length; var0++) {
            field9371[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field9371[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field9371[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field9371[var3] = var3 + 52 - 48;
        }
        field9371[42] = field9371[43] = 62;
        field9371[45] = field9371[47] = 63;
    }
}
