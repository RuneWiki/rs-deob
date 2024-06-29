import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class57 extends class254 {

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "[B")
    public byte[] field769;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "J")
    public static long field759 = 0L;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public int field763;

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public final void method325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -30107) {
            this.field770 = 11;
        }
        field762++;
        int var8 = 0;
        if (arg0 != arg1) {
            var8 = (arg3 - arg2 << 16) / (arg0 - arg1);
        }
        int var9 = 0;
        if (arg0 != arg4) {
            var9 = (arg5 - arg3 << 16) / (arg4 - arg0);
        }
        int var10 = 0;
        if (arg1 != arg4) {
            var10 = (arg2 - arg5 << 16) / (arg1 - arg4);
        }
        if (arg0 >= arg1 && arg4 >= arg1) {
            if (arg0 >= arg4) {
                int var11;
                int var12 = var11 = arg2 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                int var13 = arg5 << 16;
                if (arg4 < 0) {
                    var13 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg1 != arg4 && var10 < var8 || arg1 == arg4 && var8 < var9) {
                    int var14 = arg0 - arg4;
                    int var15 = arg4 - arg1;
                    int var16 = this.field761 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class403.method2400(var11 >> 16, arg6 ^ 0x75C3, this.field769, var13 >> 16, var16, 0);
                                var13 += var9;
                                var16 += this.field761;
                                var11 += var8;
                            }
                        }
                        class403.method2400(var11 >> 16, arg6 ^ 0x75CE, this.field769, var12 >> 16, var16, 0);
                        var12 += var10;
                        var16 += this.field761;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg0 - arg4;
                    int var18 = arg4 - arg1;
                    int var19 = this.field761 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class403.method2400(var13 >> 16, arg6 + 30022, this.field769, var11 >> 16, var19, 0);
                                var13 += var9;
                                var19 += this.field761;
                                var11 += var8;
                            }
                        }
                        class403.method2400(var12 >> 16, arg6 + 30046, this.field769, var11 >> 16, var19, 0);
                        var12 += var10;
                        var11 += var8;
                        var19 += this.field761;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg2 << 16;
                int var22 = arg3 << 16;
                if (arg1 < 0) {
                    var20 -= arg1 * var8;
                    var21 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg0 < 0) {
                    var22 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg1 && var8 > var10 || arg0 == arg1 && var10 > var9) {
                    int var23 = arg4 - arg0;
                    int var24 = arg0 - arg1;
                    int var25 = this.field761 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class403.method2400(var22 >> 16, -97, this.field769, var21 >> 16, var25, 0);
                                var22 += var9;
                                var21 += var10;
                                var25 += this.field761;
                            }
                        }
                        class403.method2400(var20 >> 16, -47, this.field769, var21 >> 16, var25, 0);
                        var25 += this.field761;
                        var21 += var10;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg4 - arg0;
                    int var27 = arg0 - arg1;
                    int var28 = this.field761 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class403.method2400(var21 >> 16, -56, this.field769, var22 >> 16, var28, 0);
                                var28 += this.field761;
                                var21 += var10;
                                var22 += var9;
                            }
                        }
                        class403.method2400(var21 >> 16, -56, this.field769, var20 >> 16, var28, 0);
                        var28 += this.field761;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 >= arg0) {
            if (arg1 <= arg4) {
                int var29;
                int var30 = var29 = arg3 << 16;
                if (arg0 < 0) {
                    var29 -= arg0 * var9;
                    var30 -= arg0 * var8;
                    arg0 = 0;
                }
                int var31 = arg2 << 16;
                if (arg1 < 0) {
                    var31 -= arg1 * var10;
                    arg1 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg4 - arg1;
                    int var33 = arg1 - arg0;
                    int var34 = this.field761 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class403.method2400(var29 >> 16, -97, this.field769, var31 >> 16, var34, 0);
                                var34 += this.field761;
                                var29 += var9;
                                var31 += var10;
                            }
                        }
                        class403.method2400(var29 >> 16, -24, this.field769, var30 >> 16, var34, 0);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field761;
                    }
                } else {
                    int var35 = arg4 - arg1;
                    int var36 = arg1 - arg0;
                    int var37 = this.field761 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class403.method2400(var31 >> 16, -120, this.field769, var29 >> 16, var37, 0);
                                var29 += var9;
                                var37 += this.field761;
                                var31 += var10;
                            }
                        }
                        class403.method2400(var30 >> 16, arg6 + 30067, this.field769, var29 >> 16, var37, 0);
                        var29 += var9;
                        var37 += this.field761;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                int var40 = arg5 << 16;
                if (arg0 < 0) {
                    var39 -= arg0 * var8;
                    var38 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var40 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var8 < var9 || arg0 == arg4 && var10 < var8) {
                    int var41 = arg1 - arg4;
                    int var42 = arg4 - arg0;
                    int var43 = this.field761 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class403.method2400(var40 >> 16, arg6 ^ 0x75FE, this.field769, var39 >> 16, var43, 0);
                                var43 += this.field761;
                                var39 += var8;
                                var40 += var10;
                            }
                        }
                        class403.method2400(var38 >> 16, -112, this.field769, var39 >> 16, var43, 0);
                        var43 += this.field761;
                        var39 += var8;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg1 - arg4;
                    int var45 = arg4 - arg0;
                    int var46 = this.field761 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class403.method2400(var39 >> 16, arg6 ^ 0x75C1, this.field769, var40 >> 16, var46, 0);
                                var40 += var10;
                                var39 += var8;
                                var46 += this.field761;
                            }
                        }
                        class403.method2400(var39 >> 16, arg6 + 30032, this.field769, var38 >> 16, var46, 0);
                        var38 += var9;
                        var46 += this.field761;
                        var39 += var8;
                    }
                }
            }
        } else if (arg0 <= arg1) {
            int var47;
            int var48 = var47 = arg5 << 16;
            int var49 = arg3 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var10;
                var48 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg0 < 0) {
                var49 -= arg0 * var8;
                arg0 = 0;
            }
            if (var9 >= var10) {
                int var50 = arg1 - arg0;
                int var51 = arg0 - arg4;
                int var52 = this.field761 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class403.method2400(var49 >> 16, arg6 ^ 0x75BC, this.field769, var47 >> 16, var52, 0);
                            var49 += var8;
                            var52 += this.field761;
                            var47 += var10;
                        }
                    }
                    class403.method2400(var48 >> 16, -93, this.field769, var47 >> 16, var52, 0);
                    var52 += this.field761;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg1 - arg0;
                int var54 = arg0 - arg4;
                int var55 = this.field761 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class403.method2400(var47 >> 16, arg6 ^ 0x75DF, this.field769, var49 >> 16, var55, 0);
                            var55 += this.field761;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class403.method2400(var47 >> 16, -30, this.field769, var48 >> 16, var55, 0);
                    var48 += var9;
                    var47 += var10;
                    var55 += this.field761;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var9;
                var56 -= arg4 * var10;
                arg4 = 0;
            }
            int var58 = arg2 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var8;
                arg1 = 0;
            }
            if (var9 >= var10) {
                int var59 = arg0 - arg1;
                int var60 = arg1 - arg4;
                int var61 = this.field761 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class403.method2400(var57 >> 16, -24, this.field769, var58 >> 16, var61, 0);
                            var58 += var8;
                            var61 += this.field761;
                            var57 += var9;
                        }
                    }
                    class403.method2400(var57 >> 16, -114, this.field769, var56 >> 16, var61, 0);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field761;
                }
            } else {
                int var62 = arg0 - arg1;
                int var63 = arg1 - arg4;
                int var64 = this.field761 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class403.method2400(var58 >> 16, arg6 + 30070, this.field769, var57 >> 16, var64, 0);
                            var58 += var8;
                            var64 += this.field761;
                            var57 += var9;
                        }
                    }
                    class403.method2400(var56 >> 16, -22, this.field769, var57 >> 16, var64, 0);
                    var57 += var9;
                    var56 += var10;
                    var64 += this.field761;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V", line = 442)
    public static final void method326(byte arg0) {
        if (arg0 >= -38) {
            field759 = -73L;
        }
        field765++;
        class271.field3433 = 0;
        class103.field1421.method47(0);
        class103.field1421.method42(class299.field3873, 0);
        class271.field3433++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBI)Z", line = 462)
    public final boolean method327(int arg0, byte arg1, int arg2) {
        field764++;
        int var4 = 90 % ((arg1 - 85) / 37);
        return this.field769.length >= (arg0 * arg2);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 472)
    public final void method328(boolean arg0) {
        if (arg0) {
            this.method328(true);
        }
        field766++;
        int var2 = -1;
        int var3 = this.field769.length - 8;
        while (var2 < var3) {
            var2++;
            this.field769[var2] = 0;
            var2++;
            this.field769[var2] = 0;
            var2++;
            this.field769[var2] = 0;
            var2++;
            this.field769[var2] = 0;
            var2++;
            this.field769[var2] = 0;
            var2++;
            this.field769[var2] = 0;
            var2++;
            this.field769[var2] = 0;
            var2++;
            this.field769[var2] = 0;
        }
        while (var2 < (this.field769.length - 1)) {
            var2++;
            this.field769[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V", line = 504)
    public static final void method329(int arg0) {
        field768++;
        if (arg0 != -17544) {
            method326((byte) 103);
        }
        if (class268.field3398.length() == 0) {
            return;
        }
        class258.method1617("--> " + class268.field3398, 63);
        class418.method2457(-107, false, class268.field3398);
        class268.field3398 = "";
        class502.field7381 = 0;
        class295.field3838 = 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIBII)V", line = 526)
    public final void method330(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        this.field761 = arg3 - arg4;
        this.field770 = arg4;
        int var6 = 20 / ((-arg2 - 81) / 42);
        this.field763 = arg0 - arg1;
        field767++;
        this.field760 = arg1;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lgk;II)V", line = 544)
    public class57(class463 arg0, int arg1, int arg2) {
        this.field769 = new byte[arg1 * arg2];
    }
}
