import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class134 extends class427 {

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "[B")
    public byte[] field2162;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field2157 = 0;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "[F")
    public static float[] field2169 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public int field2159;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public int field2165;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lek;B)V", line = 3)
    public static final void method1028(class465 arg0, byte arg1) {
        field2170++;
        if (arg1 < 113) {
            return;
        }
        byte[] var2 = new byte[24];
        if (class347.field4908 != null) {
            try {
                class347.field4908.method2579(-40, 0L);
                class347.field4908.method2577(30437, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2731(0, 24, var2, 0);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)Z", line = 49)
    public final boolean method1029(int arg0, int arg1, int arg2) {
        if (arg0 > -127) {
            this.field2161 = 15;
        }
        field2163++;
        return this.field2162.length >= arg1 * arg2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIII)V", line = 71)
    public final void method1030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2166++;
        int var8 = 0;
        if (arg0 != arg4) {
            var8 = (arg6 - arg2 << 16) / (arg0 - arg4);
        }
        int var9 = 0;
        if (arg0 != arg1) {
            var9 = (arg5 - arg6 << 16) / (arg1 - arg0);
        }
        if (arg3 != 1832564272) {
            return;
        }
        int var10 = 0;
        if (arg1 != arg4) {
            var10 = (arg2 - arg5 << 16) / (arg4 - arg1);
        }
        if (arg0 >= arg4 && arg1 >= arg4) {
            if (arg0 < arg1) {
                int var11;
                int var12 = var11 = arg2 << 16;
                int var13 = arg6 << 16;
                if (arg4 < 0) {
                    var12 -= arg4 * var10;
                    var11 -= arg4 * var8;
                    arg4 = 0;
                }
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if ((arg0 == arg4 || var10 >= var8) && (arg0 != arg4 || var10 <= var9)) {
                    int var17 = arg1 - arg0;
                    int var18 = arg0 - arg4;
                    int var19 = this.field2168 * arg4;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class354.method2143(var12 >> 16, 0, 0, var19, var13 >> 16, this.field2162);
                                var12 += var10;
                                var19 += this.field2168;
                                var13 += var9;
                            }
                        }
                        class354.method2143(var12 >> 16, 0, arg3 ^ 0x6D3AB630, var19, var11 >> 16, this.field2162);
                        var19 += this.field2168;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var14 = arg1 - arg0;
                    int var15 = arg0 - arg4;
                    int var16 = this.field2168 * arg4;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class354.method2143(var13 >> 16, 0, arg3 - 1832564272, var16, var12 >> 16, this.field2162);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field2168;
                            }
                        }
                        class354.method2143(var11 >> 16, 0, 0, var16, var12 >> 16, this.field2162);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field2168;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg2 << 16;
                int var22 = arg5 << 16;
                if (arg4 < 0) {
                    var20 -= arg4 * var8;
                    var21 -= arg4 * var10;
                    arg4 = 0;
                }
                if (arg1 < 0) {
                    var22 -= arg1 * var9;
                    arg1 = 0;
                }
                if (arg1 != arg4 && var8 > var10 || arg1 == arg4 && var8 < var9) {
                    int var23 = arg0 - arg1;
                    int var24 = arg1 - arg4;
                    int var25 = this.field2168 * arg4;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class354.method2143(var20 >> 16, 0, 0, var25, var22 >> 16, this.field2162);
                                var22 += var9;
                                var20 += var8;
                                var25 += this.field2168;
                            }
                        }
                        class354.method2143(var20 >> 16, 0, 0, var25, var21 >> 16, this.field2162);
                        var21 += var10;
                        var25 += this.field2168;
                        var20 += var8;
                    }
                } else {
                    int var26 = arg0 - arg1;
                    int var27 = arg1 - arg4;
                    int var28 = this.field2168 * arg4;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class354.method2143(var22 >> 16, 0, 0, var28, var20 >> 16, this.field2162);
                                var28 += this.field2168;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class354.method2143(var21 >> 16, 0, 0, var28, var20 >> 16, this.field2162);
                        var20 += var8;
                        var28 += this.field2168;
                        var21 += var10;
                    }
                }
            }
        } else if (arg1 >= arg0) {
            if (arg4 <= arg1) {
                int var29;
                int var30 = var29 = arg6 << 16;
                if (arg0 < 0) {
                    var30 -= arg0 * var8;
                    var29 -= arg0 * var9;
                    arg0 = 0;
                }
                int var31 = arg2 << 16;
                if (arg4 < 0) {
                    var31 -= arg4 * var10;
                    arg4 = 0;
                }
                if (var8 < var9) {
                    int var32 = arg1 - arg4;
                    int var33 = arg4 - arg0;
                    int var34 = this.field2168 * arg0;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class354.method2143(var29 >> 16, 0, 0, var34, var31 >> 16, this.field2162);
                                var29 += var9;
                                var34 += this.field2168;
                                var31 += var10;
                            }
                        }
                        class354.method2143(var29 >> 16, 0, 0, var34, var30 >> 16, this.field2162);
                        var29 += var9;
                        var30 += var8;
                        var34 += this.field2168;
                    }
                } else {
                    int var35 = arg1 - arg4;
                    int var36 = arg4 - arg0;
                    int var37 = this.field2168 * arg0;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class354.method2143(var31 >> 16, 0, 0, var37, var29 >> 16, this.field2162);
                                var31 += var10;
                                var37 += this.field2168;
                                var29 += var9;
                            }
                        }
                        class354.method2143(var30 >> 16, 0, arg3 ^ 0x6D3AB630, var37, var29 >> 16, this.field2162);
                        var29 += var9;
                        var37 += this.field2168;
                        var30 += var8;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg6 << 16;
                int var40 = arg5 << 16;
                if (arg0 < 0) {
                    var39 -= arg0 * var8;
                    var38 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg1 < 0) {
                    var40 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg0 != arg1 && var9 > var8 || arg0 == arg1 && var10 < var8) {
                    int var41 = arg4 - arg1;
                    int var42 = arg1 - arg0;
                    int var43 = this.field2168 * arg0;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class354.method2143(var40 >> 16, 0, 0, var43, var39 >> 16, this.field2162);
                                var39 += var8;
                                var43 += this.field2168;
                                var40 += var10;
                            }
                        }
                        class354.method2143(var38 >> 16, 0, 0, var43, var39 >> 16, this.field2162);
                        var39 += var8;
                        var38 += var9;
                        var43 += this.field2168;
                    }
                } else {
                    int var44 = arg4 - arg1;
                    int var45 = arg1 - arg0;
                    int var46 = this.field2168 * arg0;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class354.method2143(var39 >> 16, 0, 0, var46, var40 >> 16, this.field2162);
                                var40 += var10;
                                var39 += var8;
                                var46 += this.field2168;
                            }
                        }
                        class354.method2143(var39 >> 16, 0, 0, var46, var38 >> 16, this.field2162);
                        var46 += this.field2168;
                        var39 += var8;
                        var38 += var9;
                    }
                }
            }
        } else if (arg4 >= arg0) {
            int var47;
            int var48 = var47 = arg5 << 16;
            int var49 = arg6 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var9;
                var47 -= arg1 * var10;
                arg1 = 0;
            }
            if (arg0 < 0) {
                var49 -= arg0 * var8;
                arg0 = 0;
            }
            if (var10 <= var9) {
                int var50 = arg4 - arg0;
                int var51 = arg0 - arg1;
                int var52 = this.field2168 * arg1;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class354.method2143(var49 >> 16, 0, 0, var52, var47 >> 16, this.field2162);
                            var49 += var8;
                            var47 += var10;
                            var52 += this.field2168;
                        }
                    }
                    class354.method2143(var48 >> 16, 0, 0, var52, var47 >> 16, this.field2162);
                    var48 += var9;
                    var47 += var10;
                    var52 += this.field2168;
                }
            } else {
                int var53 = arg4 - arg0;
                int var54 = arg0 - arg1;
                int var55 = this.field2168 * arg1;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class354.method2143(var47 >> 16, 0, 0, var55, var49 >> 16, this.field2162);
                            var49 += var8;
                            var55 += this.field2168;
                            var47 += var10;
                        }
                    }
                    class354.method2143(var47 >> 16, 0, 0, var55, var48 >> 16, this.field2162);
                    var47 += var10;
                    var48 += var9;
                    var55 += this.field2168;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            int var58 = arg2 << 16;
            if (arg1 < 0) {
                var56 -= arg1 * var10;
                var57 -= arg1 * var9;
                arg1 = 0;
            }
            if (arg4 < 0) {
                var58 -= arg4 * var8;
                arg4 = 0;
            }
            if (var10 <= var9) {
                int var59 = arg0 - arg4;
                int var60 = arg4 - arg1;
                int var61 = this.field2168 * arg1;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class354.method2143(var57 >> 16, 0, 0, var61, var58 >> 16, this.field2162);
                            var61 += this.field2168;
                            var58 += var8;
                            var57 += var9;
                        }
                    }
                    class354.method2143(var57 >> 16, 0, 0, var61, var56 >> 16, this.field2162);
                    var61 += this.field2168;
                    var57 += var9;
                    var56 += var10;
                }
            } else {
                int var62 = arg0 - arg4;
                int var63 = arg4 - arg1;
                int var64 = this.field2168 * arg1;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class354.method2143(var58 >> 16, 0, 0, var64, var57 >> 16, this.field2162);
                            var64 += this.field2168;
                            var57 += var9;
                            var58 += var8;
                        }
                    }
                    class354.method2143(var56 >> 16, 0, arg3 ^ 0x6D3AB630, var64, var57 >> 16, this.field2162);
                    var56 += var10;
                    var64 += this.field2168;
                    var57 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)V", line = 508)
    public static void method1031(byte arg0) {
        if (arg0 != 113) {
            field2169 = null;
        }
        field2169 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V", line = 518)
    public final void method1032(boolean arg0) {
        if (arg0) {
            method1034(null, 0, 42);
        }
        field2158++;
        int var2 = -1;
        int var3 = this.field2162.length - 8;
        while (var2 < var3) {
            var2++;
            this.field2162[var2] = 0;
            var2++;
            this.field2162[var2] = 0;
            var2++;
            this.field2162[var2] = 0;
            var2++;
            this.field2162[var2] = 0;
            var2++;
            this.field2162[var2] = 0;
            var2++;
            this.field2162[var2] = 0;
            var2++;
            this.field2162[var2] = 0;
            var2++;
            this.field2162[var2] = 0;
        }
        while (var2 < this.field2162.length - 1) {
            var2++;
            this.field2162[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V", line = 548)
    public final void method1033(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2167++;
        this.field2161 = arg2;
        int var6 = 43 % ((67 - arg3) / 51);
        this.field2168 = arg4 - arg2;
        this.field2159 = arg1;
        this.field2165 = arg0 - arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([SII)[S", line = 568)
    public static final short[] method1034(short[] arg0, int arg1, int arg2) {
        if (arg1 < 36) {
            method1034(null, 59, -26);
        }
        field2156++;
        short[] var3 = new short[arg2];
        class553.method3241(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lkfa;II)V", line = 593)
    public class134(class382 arg0, int arg1, int arg2) {
        this.field2162 = new byte[arg1 * arg2];
    }
}
