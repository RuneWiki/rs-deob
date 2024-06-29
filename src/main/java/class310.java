import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class310 extends class54 {

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "[B")
    public byte[] field4286;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field4287 = new Hashtable();

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public int field4281;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public int field4289;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "[[[Lwg;")
    public static class390[][][] field4290;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z", line = 11)
    public final boolean method1875(int arg0, int arg1, int arg2) {
        field4279++;
        int var4 = 91 % ((-arg1 - 27) / 53);
        return (arg0 * arg2) <= this.field4286.length;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)Z", line = 21)
    public static final boolean method1876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4280++;
        for (int var6 = arg2; var6 <= arg5; var6++) {
            for (int var7 = arg0; var7 <= arg1; var7++) {
                if (class183.field2646[var6][var7] == arg3 && class435.field6048[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg4 != -2) {
            method1876(-110, 120, -17, 59, 98, 28);
        }
        return false;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V", line = 51)
    public final void method1877(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4281 = arg0 - arg3;
        this.field4285 = arg2 - arg1;
        this.field4284 = arg3;
        this.field4289 = arg1;
        if (arg4 < 20) {
            this.field4284 = 44;
        }
        field4288++;
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V", line = 70)
    public final void method1878(int arg0) {
        field4283++;
        int var2 = -1;
        int var3 = this.field4286.length - 8;
        if (arg0 != -393275152) {
            method1880((byte) 34);
        }
        while (var2 < var3) {
            var2++;
            this.field4286[var2] = 0;
            var2++;
            this.field4286[var2] = 0;
            var2++;
            this.field4286[var2] = 0;
            var2++;
            this.field4286[var2] = 0;
            var2++;
            this.field4286[var2] = 0;
            var2++;
            this.field4286[var2] = 0;
            var2++;
            this.field4286[var2] = 0;
            var2++;
            this.field4286[var2] = 0;
        }
        while (var2 < this.field4286.length - 1) {
            var2++;
            this.field4286[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBIII)V", line = 100)
    public final void method1879(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field4282++;
        int var8 = 0;
        if (arg0 != arg2) {
            var8 = (arg1 - arg6 << 16) / (arg0 - arg2);
        }
        int var9 = 0;
        if (arg3 > -127) {
            return;
        }
        if (arg0 != arg4) {
            var9 = (arg5 - arg1 << 16) / (arg4 - arg0);
        }
        int var10 = 0;
        if (arg2 != arg4) {
            var10 = (arg6 - arg5 << 16) / (arg2 - arg4);
        }
        if (arg2 <= arg0 && arg4 >= arg2) {
            if (arg4 > arg0) {
                int var11;
                int var12 = var11 = arg6 << 16;
                int var13 = arg1 << 16;
                if (arg2 < 0) {
                    var11 -= arg2 * var8;
                    var12 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var13 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg0 != arg2 && var8 > var10 || arg0 == arg2 && var10 > var9) {
                    int var14 = arg4 - arg0;
                    int var15 = arg0 - arg2;
                    int var16 = this.field4285 * arg2;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class652.method3680(0, var16, (byte) 1, this.field4286, var13 >> 16, var12 >> 16);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field4285;
                            }
                        }
                        class652.method3680(0, var16, (byte) 1, this.field4286, var11 >> 16, var12 >> 16);
                        var12 += var10;
                        var11 += var8;
                        var16 += this.field4285;
                    }
                } else {
                    int var17 = arg4 - arg0;
                    int var18 = arg0 - arg2;
                    int var19 = this.field4285 * arg2;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class652.method3680(0, var19, (byte) 1, this.field4286, var12 >> 16, var13 >> 16);
                                var13 += var9;
                                var19 += this.field4285;
                                var12 += var10;
                            }
                        }
                        class652.method3680(0, var19, (byte) 1, this.field4286, var12 >> 16, var11 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field4285;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg6 << 16;
                int var22 = arg5 << 16;
                if (arg2 < 0) {
                    var20 -= arg2 * var8;
                    var21 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg2 != arg4 && var10 < var8 || arg2 == arg4 && var8 < var9) {
                    int var23 = arg0 - arg4;
                    int var24 = arg4 - arg2;
                    int var25 = this.field4285 * arg2;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class652.method3680(0, var25, (byte) 1, this.field4286, var20 >> 16, var22 >> 16);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field4285;
                            }
                        }
                        class652.method3680(0, var25, (byte) 1, this.field4286, var20 >> 16, var21 >> 16);
                        var25 += this.field4285;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg0 - arg4;
                    int var27 = arg4 - arg2;
                    int var28 = this.field4285 * arg2;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class652.method3680(0, var28, (byte) 1, this.field4286, var22 >> 16, var20 >> 16);
                                var22 += var9;
                                var20 += var8;
                                var28 += this.field4285;
                            }
                        }
                        class652.method3680(0, var28, (byte) 1, this.field4286, var21 >> 16, var20 >> 16);
                        var28 += this.field4285;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg0 > arg4) {
            if (arg2 >= arg0) {
                int var29;
                int var30 = var29 = arg5 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var10;
                    var30 -= arg4 * var9;
                    arg4 = 0;
                }
                int var31 = arg1 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg2 - arg0;
                    int var33 = arg0 - arg4;
                    int var34 = this.field4285 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class652.method3680(0, var34, (byte) 1, this.field4286, var29 >> 16, var31 >> 16);
                                var31 += var8;
                                var29 += var10;
                                var34 += this.field4285;
                            }
                        }
                        class652.method3680(0, var34, (byte) 1, this.field4286, var29 >> 16, var30 >> 16);
                        var34 += this.field4285;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg2 - arg0;
                    int var36 = arg0 - arg4;
                    int var37 = this.field4285 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class652.method3680(0, var37, (byte) 1, this.field4286, var31 >> 16, var29 >> 16);
                                var37 += this.field4285;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class652.method3680(0, var37, (byte) 1, this.field4286, var30 >> 16, var29 >> 16);
                        var29 += var10;
                        var37 += this.field4285;
                        var30 += var9;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg5 << 16;
                if (arg4 < 0) {
                    var39 -= arg4 * var9;
                    var38 -= arg4 * var10;
                    arg4 = 0;
                }
                int var40 = arg6 << 16;
                if (arg2 < 0) {
                    var40 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg0 - arg2;
                    int var42 = arg2 - arg4;
                    int var43 = this.field4285 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class652.method3680(0, var43, (byte) 1, this.field4286, var40 >> 16, var39 >> 16);
                                var39 += var9;
                                var40 += var8;
                                var43 += this.field4285;
                            }
                        }
                        class652.method3680(0, var43, (byte) 1, this.field4286, var38 >> 16, var39 >> 16);
                        var43 += this.field4285;
                        var39 += var9;
                        var38 += var10;
                    }
                } else {
                    int var44 = arg0 - arg2;
                    int var45 = arg2 - arg4;
                    int var46 = this.field4285 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class652.method3680(0, var46, (byte) 1, this.field4286, var39 >> 16, var40 >> 16);
                                var46 += this.field4285;
                                var39 += var9;
                                var40 += var8;
                            }
                        }
                        class652.method3680(0, var46, (byte) 1, this.field4286, var39 >> 16, var38 >> 16);
                        var46 += this.field4285;
                        var39 += var9;
                        var38 += var10;
                    }
                }
            }
        } else if (arg4 < arg2) {
            int var47;
            int var48 = var47 = arg1 << 16;
            if (arg0 < 0) {
                var48 -= arg0 * var8;
                var47 -= arg0 * var9;
                arg0 = 0;
            }
            int var49 = arg5 << 16;
            if (arg4 < 0) {
                var49 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg0 != arg4 && var9 > var8 || arg0 == arg4 && var8 > var10) {
                int var50 = arg2 - arg4;
                int var51 = arg4 - arg0;
                int var52 = this.field4285 * arg0;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class652.method3680(0, var52, (byte) 1, this.field4286, var49 >> 16, var48 >> 16);
                            var48 += var8;
                            var52 += this.field4285;
                            var49 += var10;
                        }
                    }
                    class652.method3680(0, var52, (byte) 1, this.field4286, var47 >> 16, var48 >> 16);
                    var47 += var9;
                    var52 += this.field4285;
                    var48 += var8;
                }
            } else {
                int var53 = arg2 - arg4;
                int var54 = arg4 - arg0;
                int var55 = this.field4285 * arg0;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class652.method3680(0, var55, (byte) 1, this.field4286, var48 >> 16, var49 >> 16);
                            var48 += var8;
                            var49 += var10;
                            var55 += this.field4285;
                        }
                    }
                    class652.method3680(0, var55, (byte) 1, this.field4286, var48 >> 16, var47 >> 16);
                    var55 += this.field4285;
                    var48 += var8;
                    var47 += var9;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg1 << 16;
            int var58 = arg6 << 16;
            if (arg0 < 0) {
                var56 -= arg0 * var9;
                var57 -= arg0 * var8;
                arg0 = 0;
            }
            if (arg2 < 0) {
                var58 -= arg2 * var10;
                arg2 = 0;
            }
            if (var9 > var8) {
                int var59 = arg4 - arg2;
                int var60 = arg2 - arg0;
                int var61 = this.field4285 * arg0;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class652.method3680(0, var61, (byte) 1, this.field4286, var56 >> 16, var58 >> 16);
                            var56 += var9;
                            var58 += var10;
                            var61 += this.field4285;
                        }
                    }
                    class652.method3680(0, var61, (byte) 1, this.field4286, var56 >> 16, var57 >> 16);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field4285;
                }
            } else {
                int var62 = arg4 - arg2;
                int var63 = arg2 - arg0;
                int var64 = this.field4285 * arg0;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class652.method3680(0, var64, (byte) 1, this.field4286, var58 >> 16, var56 >> 16);
                            var64 += this.field4285;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class652.method3680(0, var64, (byte) 1, this.field4286, var57 >> 16, var56 >> 16);
                    var57 += var8;
                    var64 += this.field4285;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 544)
    public static void method1880(byte arg0) {
        if (arg0 > -98) {
            method1880((byte) 24);
        }
        field4290 = null;
        field4287 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Llj;II)V", line = 560)
    public class310(class565 arg0, int arg1, int arg2) {
        this.field4286 = new byte[arg1 * arg2];
    }
}
