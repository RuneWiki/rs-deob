import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class162 extends class108 {

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "[B")
    public byte[] field2072;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field2066 = 0;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "[Lwo;")
    public static class314[] field2075 = new class314[5];

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "Lmq;")
    public static class78 field2080;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "J")
    public static long field2074;

    static {
        for (int var0 = 0; var0 < field2075.length; var0++) {
            field2075[var0] = new class314();
        }
        field2080 = new class78(45, 2);
        field2081 = 0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)V", line = 11)
    public final void method998(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2069 = arg1 - arg2;
        this.field2078 = arg4 - arg3;
        this.field2076 = arg2;
        this.field2077 = arg3;
        if (arg0 == 0) {
            field2064++;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIZI)V", line = 30)
    public final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2070++;
        int var8 = 0;
        if (arg1 != arg3) {
            var8 = (arg2 - arg6 << 16) / (arg3 - arg1);
        }
        int var9 = 0;
        if (arg5) {
            this.method1005(-98);
        }
        if (arg3 != arg4) {
            var9 = (arg0 - arg2 << 16) / (arg4 - arg3);
        }
        int var10 = 0;
        if (arg1 != arg4) {
            var10 = (arg6 - arg0 << 16) / (arg1 - arg4);
        }
        if (arg3 >= arg1 && arg4 >= arg1) {
            if (arg3 < arg4) {
                int var11;
                int var12 = var11 = arg6 << 16;
                int var13 = arg2 << 16;
                if (arg1 < 0) {
                    var11 -= arg1 * var8;
                    var12 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg1 != arg3 && var10 < var8 || arg1 == arg3 && var10 > var9) {
                    int var14 = arg4 - arg3;
                    int var15 = arg3 - arg1;
                    int var16 = this.field2069 * arg1;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class206.method1274(40, var12 >> 16, 0, var13 >> 16, this.field2072, var16);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field2069;
                            }
                        }
                        class206.method1274(108, var12 >> 16, 0, var11 >> 16, this.field2072, var16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field2069;
                    }
                } else {
                    int var17 = arg4 - arg3;
                    int var18 = arg3 - arg1;
                    int var19 = this.field2069 * arg1;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class206.method1274(54, var13 >> 16, 0, var12 >> 16, this.field2072, var19);
                                var12 += var10;
                                var13 += var9;
                                var19 += this.field2069;
                            }
                        }
                        class206.method1274(45, var11 >> 16, 0, var12 >> 16, this.field2072, var19);
                        var19 += this.field2069;
                        var11 += var8;
                        var12 += var10;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var10;
                    var20 -= arg1 * var8;
                    arg1 = 0;
                }
                int var22 = arg0 << 16;
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg1 != arg4 && var10 < var8 || arg1 == arg4 && var8 < var9) {
                    int var23 = arg3 - arg4;
                    int var24 = arg4 - arg1;
                    int var25 = this.field2069 * arg1;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class206.method1274(39, var22 >> 16, 0, var20 >> 16, this.field2072, var25);
                                var22 += var9;
                                var25 += this.field2069;
                                var20 += var8;
                            }
                        }
                        class206.method1274(60, var21 >> 16, 0, var20 >> 16, this.field2072, var25);
                        var25 += this.field2069;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg3 - arg4;
                    int var27 = arg4 - arg1;
                    int var28 = this.field2069 * arg1;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class206.method1274(111, var20 >> 16, 0, var22 >> 16, this.field2072, var28);
                                var28 += this.field2069;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class206.method1274(45, var20 >> 16, 0, var21 >> 16, this.field2072, var28);
                        var28 += this.field2069;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg4 < arg3) {
            if (arg3 <= arg1) {
                int var29;
                int var30 = var29 = arg0 << 16;
                if (arg4 < 0) {
                    var30 -= arg4 * var9;
                    var29 -= arg4 * var10;
                    arg4 = 0;
                }
                int var31 = arg2 << 16;
                if (arg3 < 0) {
                    var31 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 <= var9) {
                    int var32 = arg1 - arg3;
                    int var33 = arg3 - arg4;
                    int var34 = this.field2069 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class206.method1274(110, var29 >> 16, 0, var31 >> 16, this.field2072, var34);
                                var31 += var8;
                                var34 += this.field2069;
                                var29 += var10;
                            }
                        }
                        class206.method1274(99, var29 >> 16, 0, var30 >> 16, this.field2072, var34);
                        var29 += var10;
                        var34 += this.field2069;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg1 - arg3;
                    int var36 = arg3 - arg4;
                    int var37 = this.field2069 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class206.method1274(105, var31 >> 16, 0, var29 >> 16, this.field2072, var37);
                                var37 += this.field2069;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class206.method1274(71, var30 >> 16, 0, var29 >> 16, this.field2072, var37);
                        var29 += var10;
                        var37 += this.field2069;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                int var40 = arg6 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var9;
                    var38 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg1 < 0) {
                    var40 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg3 - arg1;
                    int var42 = arg1 - arg4;
                    int var43 = this.field2069 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class206.method1274(104, var39 >> 16, 0, var40 >> 16, this.field2072, var43);
                                var40 += var8;
                                var39 += var9;
                                var43 += this.field2069;
                            }
                        }
                        class206.method1274(101, var39 >> 16, 0, var38 >> 16, this.field2072, var43);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field2069;
                    }
                } else {
                    int var44 = arg3 - arg1;
                    int var45 = arg1 - arg4;
                    int var46 = this.field2069 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class206.method1274(63, var40 >> 16, 0, var39 >> 16, this.field2072, var46);
                                var39 += var9;
                                var40 += var8;
                                var46 += this.field2069;
                            }
                        }
                        class206.method1274(111, var38 >> 16, 0, var39 >> 16, this.field2072, var46);
                        var39 += var9;
                        var46 += this.field2069;
                        var38 += var10;
                    }
                }
            }
        } else if (arg4 >= arg1) {
            int var47;
            int var48 = var47 = arg2 << 16;
            int var49 = arg6 << 16;
            if (arg3 < 0) {
                var47 -= arg3 * var9;
                var48 -= arg3 * var8;
                arg3 = 0;
            }
            if (arg1 < 0) {
                var49 -= arg1 * var10;
                arg1 = 0;
            }
            if (var9 <= var8) {
                int var50 = arg4 - arg1;
                int var51 = arg1 - arg3;
                int var52 = this.field2069 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class206.method1274(109, var47 >> 16, 0, var49 >> 16, this.field2072, var52);
                            var49 += var10;
                            var47 += var9;
                            var52 += this.field2069;
                        }
                    }
                    class206.method1274(122, var47 >> 16, 0, var48 >> 16, this.field2072, var52);
                    var47 += var9;
                    var48 += var8;
                    var52 += this.field2069;
                }
            } else {
                int var53 = arg4 - arg1;
                int var54 = arg1 - arg3;
                int var55 = this.field2069 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class206.method1274(67, var49 >> 16, 0, var47 >> 16, this.field2072, var55);
                            var47 += var9;
                            var55 += this.field2069;
                            var49 += var10;
                        }
                    }
                    class206.method1274(70, var48 >> 16, 0, var47 >> 16, this.field2072, var55);
                    var47 += var9;
                    var48 += var8;
                    var55 += this.field2069;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg2 << 16;
            if (arg3 < 0) {
                var56 -= arg3 * var9;
                var57 -= arg3 * var8;
                arg3 = 0;
            }
            int var58 = arg0 << 16;
            if (arg4 < 0) {
                var58 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg3 != arg4 && var9 > var8 || arg3 == arg4 && var10 < var8) {
                int var59 = arg1 - arg4;
                int var60 = arg4 - arg3;
                int var61 = this.field2069 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class206.method1274(72, var57 >> 16, 0, var58 >> 16, this.field2072, var61);
                            var57 += var8;
                            var61 += this.field2069;
                            var58 += var10;
                        }
                    }
                    class206.method1274(85, var57 >> 16, 0, var56 >> 16, this.field2072, var61);
                    var61 += this.field2069;
                    var57 += var8;
                    var56 += var9;
                }
            } else {
                int var62 = arg1 - arg4;
                int var63 = arg4 - arg3;
                int var64 = this.field2069 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class206.method1274(97, var58 >> 16, 0, var57 >> 16, this.field2072, var64);
                            var58 += var10;
                            var64 += this.field2069;
                            var57 += var8;
                        }
                    }
                    class206.method1274(110, var56 >> 16, 0, var57 >> 16, this.field2072, var64);
                    var64 += this.field2069;
                    var56 += var9;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 466)
    public static final String method1000(int arg0, int[] arg1) {
        if (arg0 != 25078) {
            method1002(false);
        }
        field2071++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class502.field7071;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class572 var5 = class223.field2925.method1247(-64, arg1[var4]);
            if (var5.field7990 != -1) {
                class712 var6 = (class712) class576.field8038.method778((long) var5.field7990, -97);
                if (var6 == null) {
                    class196 var7 = class196.method1231(class645.field8897, var5.field7990, 0);
                    if (var7 != null) {
                        var6 = class458.field6407.method60(var7, true);
                        class576.field8038.method774((long) var5.field7990, 86, var6);
                    }
                }
                if (var6 != null) {
                    class289.field3681[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 519)
    public static final void method1001(String arg0, byte arg1) {
        field2079++;
        if (arg0 == null) {
            return;
        }
        if (arg1 < 84) {
            method1000(94, null);
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class165.method1022((byte) 115, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class727.field10184; var3++) {
            String var4 = class4.field34[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class165.method1022((byte) 116, var4);
            if (var5 != null && var5.equals(var2)) {
                class727.field10184--;
                for (int var6 = var3; var6 < class727.field10184; var6++) {
                    class4.field34[var6] = class4.field34[var6 + 1];
                    class17.field238[var6] = class17.field238[var6 + 1];
                    class323.field4122[var6] = class323.field4122[var6 + 1];
                    class536.field7518[var6] = class536.field7518[var6 + 1];
                    class292.field3779[var6] = class292.field3779[var6 + 1];
                    class315.field4044[var6] = class315.field4044[var6 + 1];
                }
                class112.field1379 = class215.field2727;
                class42.field647++;
                class650 var7 = class314.method1837(class503.field7077, true, class625.field8727);
                var7.field8928.method1141(class663.method3588(0, arg0), -111);
                var7.field8928.method1110(arg0, -30452);
                class108.method745(var7, -116);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Z", line = 584)
    public static final boolean method1002(boolean arg0) {
        if (arg0) {
            field2081 = -73;
        }
        field2067++;
        return class10.method50("jaclib", (byte) -72) ? class10.method50("hw3d", (byte) -72) : false;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lbm;II)V", line = 628)
    public class162(class684 arg0, int arg1, int arg2) {
        this.field2072 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Z", line = 638)
    public final boolean method1003(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method999(-25, -66, -52, 104, -97, false, -118);
        }
        field2065++;
        return this.field2072.length >= arg0 * arg1;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 653)
    public static void method1004(int arg0) {
        if (arg0 >= -105) {
            field2080 = null;
        }
        field2075 = null;
        field2080 = null;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V", line = 664)
    public final void method1005(int arg0) {
        field2068++;
        int var2 = -1;
        int var3 = this.field2072.length - 8;
        while (var2 < var3) {
            var2++;
            this.field2072[var2] = 0;
            var2++;
            this.field2072[var2] = 0;
            var2++;
            this.field2072[var2] = 0;
            var2++;
            this.field2072[var2] = 0;
            var2++;
            this.field2072[var2] = 0;
            var2++;
            this.field2072[var2] = 0;
            var2++;
            this.field2072[var2] = 0;
            var2++;
            this.field2072[var2] = 0;
        }
        while (var2 < (this.field2072.length - 1)) {
            var2++;
            this.field2072[var2] = 0;
        }
        if (arg0 != 27474) {
            method1000(29, null);
        }
    }
}
