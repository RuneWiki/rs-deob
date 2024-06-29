import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class776 extends class194 {

    @OriginalMember(owner = "client!pn", name = "M", descriptor = "[B")
    public byte[] field10664;

    @OriginalMember(owner = "client!pn", name = "O", descriptor = "Lef;")
    public static class512 field10666 = new class512();

    @OriginalMember(owner = "client!pn", name = "R", descriptor = "I")
    public static int field10669 = 0;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    public static int field10655;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public static int field10656;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public int field10657;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public int field10658;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public static int field10659;

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "I")
    public int field10660;

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
    public static int field10661;

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "I")
    public static int field10662;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field10663;

    @OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
    public static int field10665;

    @OriginalMember(owner = "client!pn", name = "Q", descriptor = "I")
    public int field10668;

    @OriginalMember(owner = "client!pn", name = "P", descriptor = "Lhu;")
    public static class141 field10667;

    @OriginalMember(owner = "client!pn", name = "S", descriptor = "Lok;")
    public static class266 field10670;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)V", line = 3)
    public static void method4268(byte arg0) {
        field10667 = null;
        field10670 = null;
        if (arg0 <= 123) {
            field10667 = null;
        }
        field10666 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V", line = 15)
    public final void method4269(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10656++;
        if (arg1 != 0) {
            method4272(false, (byte) 29);
        }
        this.field10660 = arg2;
        this.field10657 = arg3 - arg4;
        this.field10668 = arg4;
        this.field10658 = arg0 - arg2;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V", line = 34)
    public final void method4270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10662++;
        int var8 = -45 / ((arg3 + 58) / 52);
        int var9 = 0;
        if (arg0 != arg6) {
            var9 = (arg4 - arg2 << 16) / (arg6 - arg0);
        }
        int var10 = 0;
        if (arg1 != arg6) {
            var10 = (arg5 - arg4 << 16) / (arg1 - arg6);
        }
        int var11 = 0;
        if (arg0 != arg1) {
            var11 = (arg2 - arg5 << 16) / (arg0 - arg1);
        }
        if (arg6 >= arg0 && arg0 <= arg1) {
            if (arg1 > arg6) {
                int var12;
                int var13 = var12 = arg2 << 16;
                int var14 = arg4 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var9;
                    var13 -= arg0 * var11;
                    arg0 = 0;
                }
                if (arg6 < 0) {
                    var14 -= arg6 * var10;
                    arg6 = 0;
                }
                if ((arg0 == arg6 || var9 <= var11) && (arg0 != arg6 || var10 >= var11)) {
                    int var18 = arg1 - arg6;
                    int var19 = arg6 - arg0;
                    int var20 = this.field10658 * arg0;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class193.method1346(var14 >> 16, var20, 4110, 0, var13 >> 16, this.field10664);
                                var13 += var11;
                                var20 += this.field10658;
                                var14 += var10;
                            }
                        }
                        class193.method1346(var12 >> 16, var20, 4110, 0, var13 >> 16, this.field10664);
                        var13 += var11;
                        var20 += this.field10658;
                        var12 += var9;
                    }
                } else {
                    int var15 = arg1 - arg6;
                    int var16 = arg6 - arg0;
                    int var17 = this.field10658 * arg0;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class193.method1346(var13 >> 16, var17, 4110, 0, var14 >> 16, this.field10664);
                                var17 += this.field10658;
                                var14 += var10;
                                var13 += var11;
                            }
                        }
                        class193.method1346(var13 >> 16, var17, 4110, 0, var12 >> 16, this.field10664);
                        var17 += this.field10658;
                        var13 += var11;
                        var12 += var9;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg2 << 16;
                int var23 = arg5 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var9;
                    var22 -= arg0 * var11;
                    arg0 = 0;
                }
                if (arg1 < 0) {
                    var23 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var9 > var11 || arg0 == arg1 && var10 > var9) {
                    int var24 = arg6 - arg1;
                    int var25 = arg1 - arg0;
                    int var26 = this.field10658 * arg0;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class193.method1346(var23 >> 16, var26, 4110, 0, var21 >> 16, this.field10664);
                                var23 += var10;
                                var26 += this.field10658;
                                var21 += var9;
                            }
                        }
                        class193.method1346(var22 >> 16, var26, 4110, 0, var21 >> 16, this.field10664);
                        var21 += var9;
                        var22 += var11;
                        var26 += this.field10658;
                    }
                } else {
                    int var27 = arg6 - arg1;
                    int var28 = arg1 - arg0;
                    int var29 = this.field10658 * arg0;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class193.method1346(var21 >> 16, var29, 4110, 0, var23 >> 16, this.field10664);
                                var23 += var10;
                                var29 += this.field10658;
                                var21 += var9;
                            }
                        }
                        class193.method1346(var21 >> 16, var29, 4110, 0, var22 >> 16, this.field10664);
                        var21 += var9;
                        var22 += var11;
                        var29 += this.field10658;
                    }
                }
            }
        } else if (arg6 <= arg1) {
            if (arg0 > arg1) {
                int var30;
                int var31 = var30 = arg4 << 16;
                int var32 = arg5 << 16;
                if (arg6 < 0) {
                    var31 -= arg6 * var9;
                    var30 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg1 < 0) {
                    var32 -= arg1 * var11;
                    arg1 = 0;
                }
                if (arg1 != arg6 && var10 > var9 || arg1 == arg6 && var11 < var9) {
                    int var33 = arg0 - arg1;
                    int var34 = arg1 - arg6;
                    int var35 = this.field10658 * arg6;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class193.method1346(var31 >> 16, var35, 4110, 0, var32 >> 16, this.field10664);
                                var31 += var9;
                                var35 += this.field10658;
                                var32 += var11;
                            }
                        }
                        class193.method1346(var31 >> 16, var35, 4110, 0, var30 >> 16, this.field10664);
                        var31 += var9;
                        var35 += this.field10658;
                        var30 += var10;
                    }
                } else {
                    int var36 = arg0 - arg1;
                    int var37 = arg1 - arg6;
                    int var38 = this.field10658 * arg6;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class193.method1346(var32 >> 16, var38, 4110, 0, var31 >> 16, this.field10664);
                                var32 += var11;
                                var31 += var9;
                                var38 += this.field10658;
                            }
                        }
                        class193.method1346(var30 >> 16, var38, 4110, 0, var31 >> 16, this.field10664);
                        var38 += this.field10658;
                        var30 += var10;
                        var31 += var9;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg4 << 16;
                if (arg6 < 0) {
                    var40 -= arg6 * var9;
                    var39 -= arg6 * var10;
                    arg6 = 0;
                }
                int var41 = arg2 << 16;
                if (arg0 < 0) {
                    var41 -= arg0 * var11;
                    arg0 = 0;
                }
                if (var10 <= var9) {
                    int var42 = arg1 - arg0;
                    int var43 = arg0 - arg6;
                    int var44 = this.field10658 * arg6;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class193.method1346(var39 >> 16, var44, 4110, 0, var41 >> 16, this.field10664);
                                var39 += var10;
                                var44 += this.field10658;
                                var41 += var11;
                            }
                        }
                        class193.method1346(var39 >> 16, var44, 4110, 0, var40 >> 16, this.field10664);
                        var40 += var9;
                        var44 += this.field10658;
                        var39 += var10;
                    }
                } else {
                    int var45 = arg1 - arg0;
                    int var46 = arg0 - arg6;
                    int var47 = this.field10658 * arg6;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class193.method1346(var41 >> 16, var47, 4110, 0, var39 >> 16, this.field10664);
                                var41 += var11;
                                var47 += this.field10658;
                                var39 += var10;
                            }
                        }
                        class193.method1346(var40 >> 16, var47, 4110, 0, var39 >> 16, this.field10664);
                        var39 += var10;
                        var47 += this.field10658;
                        var40 += var9;
                    }
                }
            }
        } else if (arg6 > arg0) {
            int var48;
            int var49 = var48 = arg5 << 16;
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                var48 -= arg1 * var11;
                arg1 = 0;
            }
            int var50 = arg2 << 16;
            if (arg0 < 0) {
                var50 -= arg0 * var9;
                arg0 = 0;
            }
            if (var10 < var11) {
                int var51 = arg6 - arg0;
                int var52 = arg0 - arg1;
                int var53 = this.field10658 * arg1;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class193.method1346(var49 >> 16, var53, 4110, 0, var50 >> 16, this.field10664);
                            var53 += this.field10658;
                            var49 += var10;
                            var50 += var9;
                        }
                    }
                    class193.method1346(var49 >> 16, var53, 4110, 0, var48 >> 16, this.field10664);
                    var53 += this.field10658;
                    var48 += var11;
                    var49 += var10;
                }
            } else {
                int var54 = arg6 - arg0;
                int var55 = arg0 - arg1;
                int var56 = this.field10658 * arg1;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class193.method1346(var50 >> 16, var56, 4110, 0, var49 >> 16, this.field10664);
                            var56 += this.field10658;
                            var49 += var10;
                            var50 += var9;
                        }
                    }
                    class193.method1346(var48 >> 16, var56, 4110, 0, var49 >> 16, this.field10664);
                    var49 += var10;
                    var48 += var11;
                    var56 += this.field10658;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg5 << 16;
            if (arg1 < 0) {
                var57 -= arg1 * var11;
                var58 -= arg1 * var10;
                arg1 = 0;
            }
            int var59 = arg4 << 16;
            if (arg6 < 0) {
                var59 -= arg6 * var9;
                arg6 = 0;
            }
            if (var11 > var10) {
                int var60 = arg0 - arg6;
                int var61 = arg6 - arg1;
                int var62 = this.field10658 * arg1;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class193.method1346(var59 >> 16, var62, 4110, 0, var57 >> 16, this.field10664);
                            var62 += this.field10658;
                            var59 += var9;
                            var57 += var11;
                        }
                    }
                    class193.method1346(var58 >> 16, var62, 4110, 0, var57 >> 16, this.field10664);
                    var62 += this.field10658;
                    var58 += var10;
                    var57 += var11;
                }
            } else {
                int var63 = arg0 - arg6;
                int var64 = arg6 - arg1;
                int var65 = this.field10658 * arg1;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class193.method1346(var57 >> 16, var65, 4110, 0, var59 >> 16, this.field10664);
                            var57 += var11;
                            var59 += var9;
                            var65 += this.field10658;
                        }
                    }
                    class193.method1346(var57 >> 16, var65, 4110, 0, var58 >> 16, this.field10664);
                    var57 += var11;
                    var65 += this.field10658;
                    var58 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)Z", line = 471)
    public static final boolean method4271(int arg0, int arg1) {
        field10663++;
        if (arg0 == 46 || arg0 == 60 || arg0 == 50 || arg0 == 53 || arg0 == 22) {
            return true;
        } else {
            if (arg1 != 1951) {
                method4271(30, -5);
            }
            return arg0 == 48 || arg0 == 1001;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZB)V", line = 498)
    public static final void method4272(boolean arg0, byte arg1) {
        field10655++;
        class26.field391++;
        class312 var2 = class353.method2245(class87.field971, class641.field8977, (byte) 76);
        class208.method1440(var2, 124);
        int var3 = -68 / ((arg1 + 7) / 49);
        for (class744 var4 = (class744) class11.field217.method2243((byte) 100); var4 != null; var4 = (class744) class11.field217.method2248(-15690)) {
            if (!var4.method3386((byte) 120)) {
                var4 = (class744) class11.field217.method2243((byte) 100);
                if (var4 == null) {
                    break;
                }
            }
            if (var4.field10312 == 0) {
                class698.method3932((byte) 103, var4, true, arg0);
            }
        }
        if (class274.field3954 != null) {
            class564.method3329(class274.field3954, 8195);
            class274.field3954 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 540)
    public final void method4273(int arg0) {
        field10661++;
        if (arg0 != 6198) {
            field10666 = null;
        }
        int var2 = -1;
        int var3 = this.field10664.length - 8;
        while (var3 > var2) {
            var2++;
            this.field10664[var2] = 0;
            var2++;
            this.field10664[var2] = 0;
            var2++;
            this.field10664[var2] = 0;
            var2++;
            this.field10664[var2] = 0;
            var2++;
            this.field10664[var2] = 0;
            var2++;
            this.field10664[var2] = 0;
            var2++;
            this.field10664[var2] = 0;
            var2++;
            this.field10664[var2] = 0;
        }
        while (this.field10664.length - 1 > var2) {
            var2++;
            this.field10664[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBI)Z", line = 574)
    public final boolean method4274(int arg0, byte arg1, int arg2) {
        field10659++;
        if (arg1 <= 4) {
            return false;
        } else {
            return this.field10664.length >= (arg0 * arg2);
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lpj;II)V", line = 595)
    public class776(class156 arg0, int arg1, int arg2) {
        this.field10664 = new byte[arg1 * arg2];
    }
}
