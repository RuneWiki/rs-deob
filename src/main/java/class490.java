import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class490 extends class269 {

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "[B")
    public byte[] field7113;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "[I")
    public static int[] field7112 = new int[13];

    @OriginalMember(owner = "client!ur", name = "C", descriptor = "D")
    public static double field7108 = -1.0D;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "I")
    public int field7103;

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
    public int field7105;

    @OriginalMember(owner = "client!ur", name = "A", descriptor = "I")
    public int field7106;

    @OriginalMember(owner = "client!ur", name = "B", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!ur", name = "D", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public int field7114;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIBI)V", line = 3)
    public final void method2828(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field7107++;
        int var8 = 0;
        if (arg4 != arg6) {
            var8 = (arg3 - arg1 << 16) / (arg4 - arg6);
        }
        int var9 = 0;
        if (arg5 > -93) {
            this.method2828(-74, -99, 120, -3, 122, (byte) 35, -85);
        }
        if (arg2 != arg4) {
            var9 = (arg0 - arg3 << 16) / (arg2 - arg4);
        }
        int var10 = 0;
        if (arg2 != arg6) {
            var10 = (arg1 - arg0 << 16) / (arg6 - arg2);
        }
        if (arg4 >= arg6 && arg6 <= arg2) {
            if (arg2 <= arg4) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg6 < 0) {
                    var11 -= arg6 * var8;
                    var12 -= arg6 * var10;
                    arg6 = 0;
                }
                int var13 = arg0 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg6 && var8 > var10 || arg2 == arg6 && var9 > var8) {
                    int var14 = arg4 - arg2;
                    int var15 = arg2 - arg6;
                    int var16 = this.field7103 * arg6;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class221.method1293((byte) 7, var11 >> 16, var13 >> 16, var16, this.field7113, 0);
                                var11 += var8;
                                var13 += var9;
                                var16 += this.field7103;
                            }
                        }
                        class221.method1293((byte) 7, var11 >> 16, var12 >> 16, var16, this.field7113, 0);
                        var12 += var10;
                        var16 += this.field7103;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg4 - arg2;
                    int var18 = arg2 - arg6;
                    int var19 = this.field7103 * arg6;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class221.method1293((byte) 7, var13 >> 16, var11 >> 16, var19, this.field7113, 0);
                                var11 += var8;
                                var13 += var9;
                                var19 += this.field7103;
                            }
                        }
                        class221.method1293((byte) 7, var12 >> 16, var11 >> 16, var19, this.field7113, 0);
                        var11 += var8;
                        var19 += this.field7103;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg3 << 16;
                if (arg6 < 0) {
                    var20 -= arg6 * var8;
                    var21 -= arg6 * var10;
                    arg6 = 0;
                }
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg6 && var8 > var10 || arg4 == arg6 && var9 < var10) {
                    int var23 = arg2 - arg4;
                    int var24 = arg4 - arg6;
                    int var25 = this.field7103 * arg6;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class221.method1293((byte) 7, var22 >> 16, var21 >> 16, var25, this.field7113, 0);
                                var25 += this.field7103;
                                var22 += var9;
                                var21 += var10;
                            }
                        }
                        class221.method1293((byte) 7, var20 >> 16, var21 >> 16, var25, this.field7113, 0);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field7103;
                    }
                } else {
                    int var26 = arg2 - arg4;
                    int var27 = arg4 - arg6;
                    int var28 = this.field7103 * arg6;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class221.method1293((byte) 7, var21 >> 16, var22 >> 16, var28, this.field7113, 0);
                                var21 += var10;
                                var28 += this.field7103;
                                var22 += var9;
                            }
                        }
                        class221.method1293((byte) 7, var21 >> 16, var20 >> 16, var28, this.field7113, 0);
                        var28 += this.field7103;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 <= arg2) {
            if (arg2 >= arg6) {
                int var29;
                int var30 = var29 = arg3 << 16;
                int var31 = arg1 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var8;
                    var29 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var31 -= arg6 * var10;
                    arg6 = 0;
                }
                if (var9 <= var8) {
                    int var32 = arg2 - arg6;
                    int var33 = arg6 - arg4;
                    int var34 = this.field7103 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class221.method1293((byte) 7, var31 >> 16, var29 >> 16, var34, this.field7113, 0);
                                var31 += var10;
                                var29 += var9;
                                var34 += this.field7103;
                            }
                        }
                        class221.method1293((byte) 7, var30 >> 16, var29 >> 16, var34, this.field7113, 0);
                        var30 += var8;
                        var29 += var9;
                        var34 += this.field7103;
                    }
                } else {
                    int var35 = arg2 - arg6;
                    int var36 = arg6 - arg4;
                    int var37 = this.field7103 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class221.method1293((byte) 7, var29 >> 16, var31 >> 16, var37, this.field7113, 0);
                                var29 += var9;
                                var37 += this.field7103;
                                var31 += var10;
                            }
                        }
                        class221.method1293((byte) 7, var29 >> 16, var30 >> 16, var37, this.field7113, 0);
                        var29 += var9;
                        var37 += this.field7103;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg3 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var8;
                    var38 -= arg4 * var9;
                    arg4 = 0;
                }
                int var40 = arg0 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg2 != arg4 && var8 < var9 || arg2 == arg4 && var10 < var8) {
                    int var41 = arg6 - arg2;
                    int var42 = arg2 - arg4;
                    int var43 = this.field7103 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class221.method1293((byte) 7, var40 >> 16, var39 >> 16, var43, this.field7113, 0);
                                var43 += this.field7103;
                                var40 += var10;
                                var39 += var8;
                            }
                        }
                        class221.method1293((byte) 7, var38 >> 16, var39 >> 16, var43, this.field7113, 0);
                        var39 += var8;
                        var43 += this.field7103;
                        var38 += var9;
                    }
                } else {
                    int var44 = arg6 - arg2;
                    int var45 = arg2 - arg4;
                    int var46 = this.field7103 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class221.method1293((byte) 7, var39 >> 16, var40 >> 16, var46, this.field7113, 0);
                                var40 += var10;
                                var46 += this.field7103;
                                var39 += var8;
                            }
                        }
                        class221.method1293((byte) 7, var39 >> 16, var38 >> 16, var46, this.field7113, 0);
                        var38 += var9;
                        var46 += this.field7103;
                        var39 += var8;
                    }
                }
            }
        } else if (arg4 <= arg6) {
            int var47;
            int var48 = var47 = arg0 << 16;
            int var49 = arg3 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var10;
                var48 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg4 < 0) {
                var49 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 < var10) {
                int var50 = arg6 - arg4;
                int var51 = arg4 - arg2;
                int var52 = this.field7103 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class221.method1293((byte) 7, var47 >> 16, var49 >> 16, var52, this.field7113, 0);
                            var49 += var8;
                            var47 += var10;
                            var52 += this.field7103;
                        }
                    }
                    class221.method1293((byte) 7, var47 >> 16, var48 >> 16, var52, this.field7113, 0);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field7103;
                }
            } else {
                int var53 = arg6 - arg4;
                int var54 = arg4 - arg2;
                int var55 = this.field7103 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class221.method1293((byte) 7, var49 >> 16, var47 >> 16, var55, this.field7113, 0);
                            var55 += this.field7103;
                            var49 += var8;
                            var47 += var10;
                        }
                    }
                    class221.method1293((byte) 7, var48 >> 16, var47 >> 16, var55, this.field7113, 0);
                    var48 += var9;
                    var47 += var10;
                    var55 += this.field7103;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg0 << 16;
            if (arg2 < 0) {
                var57 -= arg2 * var9;
                var56 -= arg2 * var10;
                arg2 = 0;
            }
            int var58 = arg1 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 > var9) {
                int var59 = arg4 - arg6;
                int var60 = arg6 - arg2;
                int var61 = this.field7103 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class221.method1293((byte) 7, var58 >> 16, var57 >> 16, var61, this.field7113, 0);
                            var61 += this.field7103;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class221.method1293((byte) 7, var56 >> 16, var57 >> 16, var61, this.field7113, 0);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field7103;
                }
            } else {
                int var62 = arg4 - arg6;
                int var63 = arg6 - arg2;
                int var64 = this.field7103 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class221.method1293((byte) 7, var57 >> 16, var58 >> 16, var64, this.field7113, 0);
                            var64 += this.field7103;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class221.method1293((byte) 7, var57 >> 16, var56 >> 16, var64, this.field7113, 0);
                    var64 += this.field7103;
                    var56 += var10;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)V", line = 441)
    public final void method2829(byte arg0) {
        field7111++;
        if (arg0 != 107) {
            return;
        }
        int var2 = -1;
        int var3 = this.field7113.length - 8;
        while (var2 < var3) {
            var2++;
            this.field7113[var2] = 0;
            var2++;
            this.field7113[var2] = 0;
            var2++;
            this.field7113[var2] = 0;
            var2++;
            this.field7113[var2] = 0;
            var2++;
            this.field7113[var2] = 0;
            var2++;
            this.field7113[var2] = 0;
            var2++;
            this.field7113[var2] = 0;
            var2++;
            this.field7113[var2] = 0;
        }
        while (this.field7113.length - 1 > var2) {
            var2++;
            this.field7113[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V", line = 470)
    public static void method2830(int arg0) {
        if (arg0 == 0) {
            field7112 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIII)V", line = 488)
    public final void method2831(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7105 = arg0 - arg3;
        if (arg2 == 25626) {
            field7109++;
            this.field7114 = arg1;
            this.field7103 = arg4 - arg1;
            this.field7106 = arg3;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)Z", line = 512)
    public final boolean method2832(int arg0, int arg1, int arg2) {
        if (arg1 == -1378661904) {
            field7102++;
            return arg0 * arg2 <= this.field7113.length;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILoa;IBILe;)V", line = 531)
    public static final void method2833(int arg0, int arg1, class635 arg2, int arg3, byte arg4, int arg5, class486 arg6) {
        field7104++;
        if (class376.field4887 < 100) {
            class185.method1080(-1, arg2, arg6);
        }
        arg2.method314(arg1, arg5, arg0 + arg1, arg3 + arg5);
        if (class376.field4887 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg1;
            int var9 = arg3 / 2 + arg5 - var7 - 18;
            arg2.method286(arg1, arg5, arg0, arg3, -16777216, 0);
            arg2.method334(var8 - 152, var9, 304, 34, class95.field1068[class18.field149].getRGB(), 0);
            arg2.method286(var8 - 150, var9 + 2, class376.field4887 * 3, 30, class234.field2986[class18.field149].getRGB(), 0);
            class211.field2561.method1128(215, var8, var7 + var9, class221.field2737.method1296(class226.field2899, (byte) 52), class147.field1646[class18.field149].getRGB(), -1);
            return;
        }
        if (arg4 < 6) {
            method2830(33);
        }
        int var10 = class306.field3998 - ((int) ((float) arg0 / class637.field9019));
        int var11 = (int) ((float) arg3 / class637.field9019) + class122.field1375;
        int var12 = (int) ((float) arg0 / class637.field9019) + class306.field3998;
        class156.field1748 = (int) ((float) (arg3 * 2) / class637.field9019);
        class369.field4793 = class306.field3998 - (int) ((float) arg0 / class637.field9019);
        class579.field8244 = class122.field1375 - ((int) ((float) arg3 / class637.field9019));
        int var13 = class122.field1375 - ((int) ((float) arg3 / class637.field9019));
        class107.field1244 = (int) ((float) (arg0 * 2) / class637.field9019);
        class637.method3567(class637.field9039 + var10, class637.field9043 + var11, class637.field9039 + var12, class637.field9043 + var13, arg1, arg5, arg0 + arg1, arg3 + arg5 - -1);
        class637.method3580(arg2);
        class562 var14 = class637.method3566(arg2);
        class30.method164(0, 35, var14, arg2, 0);
        if (class235.field2997 > 0) {
            class2.field19--;
            if (class2.field19 == 0) {
                class235.field2997--;
                class2.field19 = 20;
            }
        }
        if (!class75.field787) {
            return;
        }
        int var15 = arg0 + arg1 - 5;
        int var16 = arg3 + arg5 - 8;
        class404.field5386.method1129(var15, -1, "Fps:" + class502.field7228, (byte) 124, 16776960, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class404.field5386.method1129(var15, -1, "Mem:" + var18 + "k", (byte) 125, var19, var20);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lfo;II)V", line = 614)
    public class490(class473 arg0, int arg1, int arg2) {
        this.field7113 = new byte[arg1 * arg2];
    }
}
