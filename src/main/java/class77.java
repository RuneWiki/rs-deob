import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class77 extends class119 {

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "[B")
    public byte[] field1055;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "[I")
    public static int[] field1063 = new int[1000];

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field1064 = 0;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Lbaa;")
    public static class593 field1068 = new class593(12, 0, 1, 0);

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIZI)V", line = 3)
    public final void method457(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        this.field1067 = arg1;
        this.field1059 = arg2 - arg1;
        this.field1057 = arg0;
        if (arg3) {
            field1056++;
            this.field1058 = arg4 - arg0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "(I)V", line = 22)
    public final void method458(int arg0) {
        field1062++;
        if (arg0 != -24051) {
            this.field1055 = null;
        }
        int var2 = -1;
        int var3 = this.field1055.length - 8;
        while (var3 > var2) {
            var2++;
            this.field1055[var2] = 0;
            var2++;
            this.field1055[var2] = 0;
            var2++;
            this.field1055[var2] = 0;
            var2++;
            this.field1055[var2] = 0;
            var2++;
            this.field1055[var2] = 0;
            var2++;
            this.field1055[var2] = 0;
            var2++;
            this.field1055[var2] = 0;
            var2++;
            this.field1055[var2] = 0;
        }
        while (var2 < this.field1055.length - 1) {
            var2++;
            this.field1055[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I", line = 57)
    public static final int method459(int arg0, int arg1, int arg2) {
        if (arg0 >= -36) {
            return -17;
        }
        field1066++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIII)V", line = 83)
    public final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1061++;
        int var8 = 0;
        if (arg4 != arg6) {
            var8 = (arg3 - arg1 << 16) / (arg6 - arg4);
        }
        int var9 = 0;
        if (arg0 != arg6) {
            var9 = (arg2 - arg3 << 16) / (arg0 - arg6);
        }
        int var10 = 0;
        if (arg0 != arg4) {
            var10 = (arg1 - arg2 << 16) / (arg4 - arg0);
        }
        int var11 = 82 % ((80 - arg5) / 32);
        if (arg4 <= arg6 && arg4 <= arg0) {
            if (arg0 > arg6) {
                int var12;
                int var13 = var12 = arg1 << 16;
                int var14 = arg3 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var8;
                    var13 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg6 < 0) {
                    var14 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg4 == arg6 || var10 >= var8) && (arg4 != arg6 || var9 >= var10)) {
                    int var18 = arg0 - arg6;
                    int var19 = arg6 - arg4;
                    int var20 = this.field1058 * arg4;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class165.method939(var14 >> 16, 0, this.field1055, (byte) 124, var13 >> 16, var20);
                                var14 += var9;
                                var13 += var10;
                                var20 += this.field1058;
                            }
                        }
                        class165.method939(var12 >> 16, 0, this.field1055, (byte) 116, var13 >> 16, var20);
                        var20 += this.field1058;
                        var12 += var8;
                        var13 += var10;
                    }
                } else {
                    int var15 = arg0 - arg6;
                    int var16 = arg6 - arg4;
                    int var17 = this.field1058 * arg4;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class165.method939(var13 >> 16, 0, this.field1055, (byte) 118, var14 >> 16, var17);
                                var13 += var10;
                                var17 += this.field1058;
                                var14 += var9;
                            }
                        }
                        class165.method939(var13 >> 16, 0, this.field1055, (byte) 101, var12 >> 16, var17);
                        var12 += var8;
                        var17 += this.field1058;
                        var13 += var10;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg1 << 16;
                int var23 = arg2 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var10;
                    var21 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg0 < 0) {
                    var23 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg4 && var8 > var10 || arg0 == arg4 && var9 > var8) {
                    int var24 = arg6 - arg0;
                    int var25 = arg0 - arg4;
                    int var26 = this.field1058 * arg4;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class165.method939(var23 >> 16, 0, this.field1055, (byte) 102, var21 >> 16, var26);
                                var23 += var9;
                                var21 += var8;
                                var26 += this.field1058;
                            }
                        }
                        class165.method939(var22 >> 16, 0, this.field1055, (byte) 125, var21 >> 16, var26);
                        var22 += var10;
                        var26 += this.field1058;
                        var21 += var8;
                    }
                } else {
                    int var27 = arg6 - arg0;
                    int var28 = arg0 - arg4;
                    int var29 = this.field1058 * arg4;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class165.method939(var21 >> 16, 0, this.field1055, (byte) 118, var23 >> 16, var29);
                                var21 += var8;
                                var29 += this.field1058;
                                var23 += var9;
                            }
                        }
                        class165.method939(var21 >> 16, 0, this.field1055, (byte) 82, var22 >> 16, var29);
                        var29 += this.field1058;
                        var22 += var10;
                        var21 += var8;
                    }
                }
            }
        } else if (arg0 >= arg6) {
            if (arg0 >= arg4) {
                int var30;
                int var31 = var30 = arg3 << 16;
                if (arg6 < 0) {
                    var30 -= arg6 * var9;
                    var31 -= arg6 * var8;
                    arg6 = 0;
                }
                int var32 = arg1 << 16;
                if (arg4 < 0) {
                    var32 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var8 >= var9) {
                    int var33 = arg0 - arg4;
                    int var34 = arg4 - arg6;
                    int var35 = this.field1058 * arg6;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class165.method939(var30 >> 16, 0, this.field1055, (byte) 96, var32 >> 16, var35);
                                var30 += var9;
                                var32 += var10;
                                var35 += this.field1058;
                            }
                        }
                        class165.method939(var30 >> 16, 0, this.field1055, (byte) 97, var31 >> 16, var35);
                        var31 += var8;
                        var35 += this.field1058;
                        var30 += var9;
                    }
                } else {
                    int var36 = arg0 - arg4;
                    int var37 = arg4 - arg6;
                    int var38 = this.field1058 * arg6;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class165.method939(var32 >> 16, 0, this.field1055, (byte) 127, var30 >> 16, var38);
                                var30 += var9;
                                var32 += var10;
                                var38 += this.field1058;
                            }
                        }
                        class165.method939(var31 >> 16, 0, this.field1055, (byte) 112, var30 >> 16, var38);
                        var31 += var8;
                        var30 += var9;
                        var38 += this.field1058;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg3 << 16;
                if (arg6 < 0) {
                    var39 -= arg6 * var9;
                    var40 -= arg6 * var8;
                    arg6 = 0;
                }
                int var41 = arg2 << 16;
                if (arg0 < 0) {
                    var41 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg6 && var9 > var8 || arg0 == arg6 && var10 < var8) {
                    int var42 = arg4 - arg0;
                    int var43 = arg0 - arg6;
                    int var44 = this.field1058 * arg6;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class165.method939(var40 >> 16, 0, this.field1055, (byte) 115, var41 >> 16, var44);
                                var41 += var10;
                                var40 += var8;
                                var44 += this.field1058;
                            }
                        }
                        class165.method939(var40 >> 16, 0, this.field1055, (byte) 110, var39 >> 16, var44);
                        var44 += this.field1058;
                        var40 += var8;
                        var39 += var9;
                    }
                } else {
                    int var45 = arg4 - arg0;
                    int var46 = arg0 - arg6;
                    int var47 = this.field1058 * arg6;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class165.method939(var41 >> 16, 0, this.field1055, (byte) 97, var40 >> 16, var47);
                                var47 += this.field1058;
                                var41 += var10;
                                var40 += var8;
                            }
                        }
                        class165.method939(var39 >> 16, 0, this.field1055, (byte) 86, var40 >> 16, var47);
                        var40 += var8;
                        var39 += var9;
                        var47 += this.field1058;
                    }
                }
            }
        } else if (arg4 >= arg6) {
            int var48;
            int var49 = var48 = arg2 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var10;
                var49 -= arg0 * var9;
                arg0 = 0;
            }
            int var50 = arg3 << 16;
            if (arg6 < 0) {
                var50 -= arg6 * var8;
                arg6 = 0;
            }
            if (var10 > var9) {
                int var51 = arg4 - arg6;
                int var52 = arg6 - arg0;
                int var53 = this.field1058 * arg0;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class165.method939(var50 >> 16, 0, this.field1055, (byte) 100, var48 >> 16, var53);
                            var53 += this.field1058;
                            var48 += var10;
                            var50 += var8;
                        }
                    }
                    class165.method939(var49 >> 16, 0, this.field1055, (byte) 124, var48 >> 16, var53);
                    var49 += var9;
                    var53 += this.field1058;
                    var48 += var10;
                }
            } else {
                int var54 = arg4 - arg6;
                int var55 = arg6 - arg0;
                int var56 = this.field1058 * arg0;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class165.method939(var48 >> 16, 0, this.field1055, (byte) 89, var50 >> 16, var56);
                            var48 += var10;
                            var56 += this.field1058;
                            var50 += var8;
                        }
                    }
                    class165.method939(var48 >> 16, 0, this.field1055, (byte) 125, var49 >> 16, var56);
                    var48 += var10;
                    var49 += var9;
                    var56 += this.field1058;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg2 << 16;
            int var59 = arg1 << 16;
            if (arg0 < 0) {
                var57 -= arg0 * var10;
                var58 -= arg0 * var9;
                arg0 = 0;
            }
            if (arg4 < 0) {
                var59 -= arg4 * var8;
                arg4 = 0;
            }
            if (var9 >= var10) {
                int var60 = arg6 - arg4;
                int var61 = arg4 - arg0;
                int var62 = this.field1058 * arg0;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class165.method939(var59 >> 16, 0, this.field1055, (byte) 86, var58 >> 16, var62);
                            var58 += var9;
                            var62 += this.field1058;
                            var59 += var8;
                        }
                    }
                    class165.method939(var57 >> 16, 0, this.field1055, (byte) 98, var58 >> 16, var62);
                    var62 += this.field1058;
                    var57 += var10;
                    var58 += var9;
                }
            } else {
                int var63 = arg6 - arg4;
                int var64 = arg4 - arg0;
                int var65 = this.field1058 * arg0;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class165.method939(var58 >> 16, 0, this.field1055, (byte) 86, var59 >> 16, var65);
                            var58 += var9;
                            var59 += var8;
                            var65 += this.field1058;
                        }
                    }
                    class165.method939(var58 >> 16, 0, this.field1055, (byte) 84, var57 >> 16, var65);
                    var57 += var10;
                    var65 += this.field1058;
                    var58 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)Z", line = 524)
    public final boolean method461(int arg0, int arg1, int arg2) {
        int var4 = 93 % ((arg1 - 15) / 51);
        field1065++;
        return arg0 * arg2 <= this.field1055.length;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 538)
    public static void method462(boolean arg0) {
        field1063 = null;
        field1068 = null;
        if (arg0) {
            method463((byte) 76, 83, -29, -65, 100, 122, 98);
        }
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lqj;II)V", line = 554)
    public class77(class548 arg0, int arg1, int arg2) {
        this.field1055 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIIIIII)Z", line = 564)
    public static final boolean method463(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1060++;
        if (!class68.field926) {
            return false;
        } else if (class160.field2109 < 100) {
            return false;
        } else if (arg3 != arg6 || arg2 != arg5) {
            for (int var9 = arg6; var9 <= arg3; var9++) {
                for (int var12 = arg2; var12 <= arg5; var12++) {
                    if (class359.field4578[arg4][var9][var12] == (-class546.field7270)) {
                        return false;
                    }
                }
            }
            int var10 = (arg6 << class52.field775) + 1;
            int var11 = (arg2 << class52.field775) + 2;
            if (!class175.method1100(false, (arg5 + 1 - arg2) * class702.field9928, arg1, var11, class491.field6485[arg4].method1562(arg2, (byte) 51, arg6), var10, (arg3 + 1 - arg6) * class702.field9928)) {
                return false;
            } else if (arg0 <= 52) {
                return true;
            } else {
                class613.field8621++;
                return true;
            }
        } else if (class455.method2433(arg4, arg6, -1, arg2)) {
            int var7 = arg6 << class52.field775;
            int var8 = arg2 << class52.field775;
            if (class175.method1100(false, class702.field9928, arg1, var8, class491.field6485[arg4].method1562(arg2, (byte) 51, arg6), var7, class702.field9928)) {
                class613.field8621++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
