import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class88 extends class451 {

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "[B")
    public byte[] field1092;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "Lcb;")
    public static class318 field1094 = new class318(89, 8);

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZI)Z", line = 4)
    public static final boolean method492(int arg0, boolean arg1, int arg2) {
        field1093++;
        if (!class483.field6542) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class328.field4799[var3] == null || class328.field4799[var3][var4] == null) {
            return false;
        }
        if (!arg1) {
            field1094 = null;
        }
        class188 var5 = class328.field4799[var3][var4];
        if (arg0 == -1 && var5.field2304 == 0) {
            for (class69 var6 = (class69) class37.field371.method374((byte) 50); var6 != null; var6 = (class69) class37.field371.method372(-20740)) {
                if (var6.field902 == 48 || var6.field902 == 1009 || var6.field902 == 4 || var6.field902 == 22 || var6.field902 == 5) {
                    for (class188 var7 = class557.method3117(var6.field910, (byte) 71); var7 != null; var7 = class672.method3719(0, var7)) {
                        if (var5.field2387 == var7.field2387) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class69 var8 = (class69) class37.field371.method374((byte) 48); var8 != null; var8 = (class69) class37.field371.method372(-20740)) {
                if (var8.field908 == arg0 && var5.field2387 == var8.field910 && (var8.field902 == 48 || var8.field902 == 1009 || var8.field902 == 4 || var8.field902 == 22 || var8.field902 == 5)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V", line = 70)
    public static void method493(boolean arg0) {
        field1094 = null;
        if (!arg0) {
            method494(17, 52, 65);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)I", line = 84)
    public static final int method494(int arg0, int arg1, int arg2) {
        field1090++;
        if (arg2 > -104) {
            method494(103, 127, 63);
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(III)Z", line = 104)
    public final boolean method495(int arg0, int arg1, int arg2) {
        if (arg0 == 126) {
            field1097++;
            return this.field1092.length >= (arg1 * arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)V", line = 115)
    public final void method496(int arg0) {
        if (arg0 != -2254) {
            this.field1092 = null;
        }
        field1091++;
        int var2 = -1;
        int var3 = this.field1092.length - 8;
        while (var2 < var3) {
            var2++;
            this.field1092[var2] = 0;
            var2++;
            this.field1092[var2] = 0;
            var2++;
            this.field1092[var2] = 0;
            var2++;
            this.field1092[var2] = 0;
            var2++;
            this.field1092[var2] = 0;
            var2++;
            this.field1092[var2] = 0;
            var2++;
            this.field1092[var2] = 0;
            var2++;
            this.field1092[var2] = 0;
        }
        while (var2 < (this.field1092.length - 1)) {
            var2++;
            this.field1092[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIII)V", line = 145)
    public final void method497(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1088 = arg1;
        if (arg0 != 3694) {
            this.field1088 = 20;
        }
        field1087++;
        this.field1095 = arg2;
        this.field1086 = arg4 - arg2;
        this.field1089 = arg3 - arg1;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIII)V", line = 175)
    public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1096++;
        int var8 = 0;
        if (arg0 != arg5) {
            var8 = (arg2 - arg1 << 16) / (arg0 - arg5);
        }
        if (arg6 != -22653) {
            method499(45, -17, -39, -60);
        }
        int var9 = 0;
        if (arg0 != arg4) {
            var9 = (arg3 - arg2 << 16) / (arg4 - arg0);
        }
        int var10 = 0;
        if (arg4 != arg5) {
            var10 = (arg1 - arg3 << 16) / (arg5 - arg4);
        }
        if (arg0 >= arg5 && arg4 >= arg5) {
            if (arg4 > arg0) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg5 < 0) {
                    var12 -= arg5 * var10;
                    var11 -= arg5 * var8;
                    arg5 = 0;
                }
                int var13 = arg2 << 16;
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if ((arg0 == arg5 || var10 >= var8) && (arg0 != arg5 || var10 <= var9)) {
                    int var17 = arg4 - arg0;
                    int var18 = arg0 - arg5;
                    int var19 = this.field1086 * arg5;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class357.method2213(var19, var12 >> 16, this.field1092, 0, var13 >> 16, (byte) 58);
                                var13 += var9;
                                var19 += this.field1086;
                                var12 += var10;
                            }
                        }
                        class357.method2213(var19, var12 >> 16, this.field1092, 0, var11 >> 16, (byte) 58);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field1086;
                    }
                } else {
                    int var14 = arg4 - arg0;
                    int var15 = arg0 - arg5;
                    int var16 = this.field1086 * arg5;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class357.method2213(var16, var13 >> 16, this.field1092, 0, var12 >> 16, (byte) 58);
                                var16 += this.field1086;
                                var13 += var9;
                                var12 += var10;
                            }
                        }
                        class357.method2213(var16, var11 >> 16, this.field1092, 0, var12 >> 16, (byte) 58);
                        var16 += this.field1086;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg5 < 0) {
                    var20 -= arg5 * var8;
                    var21 -= arg5 * var10;
                    arg5 = 0;
                }
                int var22 = arg3 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg4 != arg5 && var8 > var10 || arg4 == arg5 && var9 > var8) {
                    int var23 = arg0 - arg4;
                    int var24 = arg4 - arg5;
                    int var25 = this.field1086 * arg5;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class357.method2213(var25, var20 >> 16, this.field1092, 0, var22 >> 16, (byte) 58);
                                var20 += var8;
                                var25 += this.field1086;
                                var22 += var9;
                            }
                        }
                        class357.method2213(var25, var20 >> 16, this.field1092, 0, var21 >> 16, (byte) 58);
                        var21 += var10;
                        var25 += this.field1086;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg0 - arg4;
                    int var27 = arg4 - arg5;
                    int var28 = this.field1086 * arg5;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class357.method2213(var28, var22 >> 16, this.field1092, 0, var20 >> 16, (byte) 58);
                                var20 += var8;
                                var28 += this.field1086;
                                var22 += var9;
                            }
                        }
                        class357.method2213(var28, var21 >> 16, this.field1092, 0, var20 >> 16, (byte) 58);
                        var20 += var8;
                        var21 += var10;
                        var28 += this.field1086;
                    }
                }
            }
        } else if (arg4 >= arg0) {
            if (arg5 > arg4) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg3 << 16;
                if (arg0 < 0) {
                    var30 -= arg0 * var8;
                    var29 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var9 > var8 || arg0 == arg4 && var8 > var10) {
                    int var32 = arg5 - arg4;
                    int var33 = arg4 - arg0;
                    int var34 = this.field1086 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class357.method2213(var34, var31 >> 16, this.field1092, 0, var30 >> 16, (byte) 58);
                                var34 += this.field1086;
                                var30 += var8;
                                var31 += var10;
                            }
                        }
                        class357.method2213(var34, var29 >> 16, this.field1092, 0, var30 >> 16, (byte) 58);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field1086;
                    }
                } else {
                    int var35 = arg5 - arg4;
                    int var36 = arg4 - arg0;
                    int var37 = this.field1086 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class357.method2213(var37, var30 >> 16, this.field1092, 0, var31 >> 16, (byte) 58);
                                var30 += var8;
                                var31 += var10;
                                var37 += this.field1086;
                            }
                        }
                        class357.method2213(var37, var30 >> 16, this.field1092, 0, var29 >> 16, (byte) 58);
                        var37 += this.field1086;
                        var30 += var8;
                        var29 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg0 < 0) {
                    var38 -= arg0 * var9;
                    var39 -= arg0 * var8;
                    arg0 = 0;
                }
                int var40 = arg1 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var10;
                    arg5 = 0;
                }
                if (var8 < var9) {
                    int var41 = arg4 - arg5;
                    int var42 = arg5 - arg0;
                    int var43 = this.field1086 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class357.method2213(var43, var38 >> 16, this.field1092, 0, var40 >> 16, (byte) 58);
                                var43 += this.field1086;
                                var38 += var9;
                                var40 += var10;
                            }
                        }
                        class357.method2213(var43, var38 >> 16, this.field1092, 0, var39 >> 16, (byte) 58);
                        var38 += var9;
                        var43 += this.field1086;
                        var39 += var8;
                    }
                } else {
                    int var44 = arg4 - arg5;
                    int var45 = arg5 - arg0;
                    int var46 = this.field1086 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class357.method2213(var46, var40 >> 16, this.field1092, 0, var38 >> 16, (byte) 58);
                                var40 += var10;
                                var46 += this.field1086;
                                var38 += var9;
                            }
                        }
                        class357.method2213(var46, var39 >> 16, this.field1092, 0, var38 >> 16, (byte) 58);
                        var39 += var8;
                        var46 += this.field1086;
                        var38 += var9;
                    }
                }
            }
        } else if (arg0 > arg5) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg1 << 16;
            if (arg4 < 0) {
                var47 -= arg4 * var10;
                var48 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg5 < 0) {
                var49 -= arg5 * var8;
                arg5 = 0;
            }
            if (var9 < var10) {
                int var50 = arg0 - arg5;
                int var51 = arg5 - arg4;
                int var52 = this.field1086 * arg4;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class357.method2213(var52, var49 >> 16, this.field1092, 0, var48 >> 16, (byte) 58);
                            var48 += var9;
                            var49 += var8;
                            var52 += this.field1086;
                        }
                    }
                    class357.method2213(var52, var47 >> 16, this.field1092, 0, var48 >> 16, (byte) 58);
                    var52 += this.field1086;
                    var47 += var10;
                    var48 += var9;
                }
            } else {
                int var53 = arg0 - arg5;
                int var54 = arg5 - arg4;
                int var55 = this.field1086 * arg4;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class357.method2213(var55, var48 >> 16, this.field1092, 0, var49 >> 16, (byte) 58);
                            var55 += this.field1086;
                            var49 += var8;
                            var48 += var9;
                        }
                    }
                    class357.method2213(var55, var48 >> 16, this.field1092, 0, var47 >> 16, (byte) 58);
                    var55 += this.field1086;
                    var48 += var9;
                    var47 += var10;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var9;
                var56 -= arg4 * var10;
                arg4 = 0;
            }
            int var58 = arg2 << 16;
            if (arg0 < 0) {
                var58 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 > var9) {
                int var59 = arg5 - arg0;
                int var60 = arg0 - arg4;
                int var61 = this.field1086 * arg4;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class357.method2213(var61, var56 >> 16, this.field1092, 0, var58 >> 16, (byte) 58);
                            var56 += var10;
                            var61 += this.field1086;
                            var58 += var8;
                        }
                    }
                    class357.method2213(var61, var56 >> 16, this.field1092, 0, var57 >> 16, (byte) 58);
                    var56 += var10;
                    var57 += var9;
                    var61 += this.field1086;
                }
            } else {
                int var62 = arg5 - arg0;
                int var63 = arg0 - arg4;
                int var64 = this.field1086 * arg4;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class357.method2213(var64, var58 >> 16, this.field1092, 0, var56 >> 16, (byte) 58);
                            var64 += this.field1086;
                            var58 += var8;
                            var56 += var10;
                        }
                    }
                    class357.method2213(var64, var57 >> 16, this.field1092, 0, var56 >> 16, (byte) 58);
                    var56 += var10;
                    var57 += var9;
                    var64 += this.field1086;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)Lrq;", line = 616)
    public static final class39 method499(int arg0, int arg1, int arg2, int arg3) {
        field1085++;
        class651 var4 = class145.field1841[arg1][arg0][arg3];
        if (var4 == null) {
            return null;
        }
        class39 var5 = null;
        int var6 = -1;
        for (class82 var7 = var4.field9228; var7 != null; var7 = var7.field1024) {
            class293 var9 = var7.field1027;
            if (var9 instanceof class39) {
                class39 var10 = (class39) var9;
                int var11 = (var10.method241(-25747) - 1) * 256 + 252;
                int var12 = var10.field3929 - var11 >> 9;
                int var13 = var10.field3917 - var11 >> 9;
                int var14 = var10.field3929 + var11 >> 9;
                int var15 = var10.field3917 + var11 >> 9;
                if (arg0 >= var12 && var13 <= arg3 && arg0 <= var14 && var15 >= arg3) {
                    int var16 = (var14 + 1 - arg0) * (var15 + 1 - arg3);
                    if (var16 > var6) {
                        var5 = var10;
                        var6 = var16;
                    }
                }
            }
        }
        int var8 = -41 / ((arg2 - 61) / 59);
        return var5;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lsv;II)V", line = 681)
    public class88(class312 arg0, int arg1, int arg2) {
        this.field1092 = new byte[arg1 * arg2];
    }
}
