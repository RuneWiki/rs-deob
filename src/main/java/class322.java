import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class322 extends class184 {

    @OriginalMember(owner = "client!en", name = "H", descriptor = "[B")
    public byte[] field4328;

    @OriginalMember(owner = "client!en", name = "E", descriptor = "J")
    public static long field4325 = -1L;

    @OriginalMember(owner = "client!en", name = "A", descriptor = "Lfc;")
    public static class262 field4321 = new class262(10);

    @OriginalMember(owner = "client!en", name = "w", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!en", name = "x", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!en", name = "y", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!en", name = "z", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!en", name = "B", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!en", name = "C", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!en", name = "D", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!en", name = "F", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!en", name = "G", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!en", name = "I", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)Z")
    public static final boolean method1921(byte arg0) {
        field4323++;
        if (class761.field10626 == null) {
            return false;
        }
        if (class761.field10626.field2948 >= 2000) {
            class761.field10626.field2948 -= 2000;
        }
        if (class761.field10626.field2948 == 1006) {
            return true;
        } else {
            if (arg0 <= 121) {
                field4321 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V")
    public final void method1922(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4329 = arg1 - arg3;
        this.field4320 = arg3;
        field4322++;
        if (arg4 == -1) {
            this.field4326 = arg2 - arg0;
            this.field4327 = arg0;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public static void method1923(int arg0) {
        field4321 = null;
        if (arg0 != 9949) {
            field4325 = -46L;
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
    public static final void method1924(int arg0) {
        class410.field5783 = null;
        class566.field7991 = null;
        int var1 = -102 % ((-arg0 - 49) / 54);
        class11.field63 = false;
        class343.field4611 = null;
        class342.field4598 = null;
        field4324++;
        class351.field4701 = null;
    }

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
    public final void method1925(int arg0) {
        field4317++;
        int var2 = -1;
        int var3 = 43 % ((-arg0 - 16) / 62);
        int var4 = this.field4328.length - 8;
        while (var2 < var4) {
            var2++;
            this.field4328[var2] = 0;
            var2++;
            this.field4328[var2] = 0;
            var2++;
            this.field4328[var2] = 0;
            var2++;
            this.field4328[var2] = 0;
            var2++;
            this.field4328[var2] = 0;
            var2++;
            this.field4328[var2] = 0;
            var2++;
            this.field4328[var2] = 0;
            var2++;
            this.field4328[var2] = 0;
        }
        while ((this.field4328.length - 1) > var2) {
            var2++;
            this.field4328[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI)Z")
    public final boolean method1926(int arg0, byte arg1, int arg2) {
        field4319++;
        if (arg1 > -114) {
            return true;
        } else {
            return this.field4328.length >= (arg0 * arg2);
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lac;II)V")
    public class322(class541 arg0, int arg1, int arg2) {
        this.field4328 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
    public final void method1927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4318++;
        int var8 = 9 % ((-arg5 - 36) / 42);
        int var9 = 0;
        if (arg0 != arg4) {
            var9 = (arg1 - arg2 << 16) / (arg4 - arg0);
        }
        int var10 = 0;
        if (arg3 != arg4) {
            var10 = (arg6 - arg1 << 16) / (arg3 - arg4);
        }
        int var11 = 0;
        if (arg0 != arg3) {
            var11 = (arg2 - arg6 << 16) / (arg0 - arg3);
        }
        if (arg0 <= arg4 && arg0 <= arg3) {
            if (arg3 > arg4) {
                int var12;
                int var13 = var12 = arg2 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var9;
                    var13 -= arg0 * var11;
                    arg0 = 0;
                }
                int var14 = arg1 << 16;
                if (arg4 < 0) {
                    var14 -= arg4 * var10;
                    arg4 = 0;
                }
                if ((arg0 == arg4 || var9 <= var11) && (arg0 != arg4 || var11 <= var10)) {
                    int var18 = arg3 - arg4;
                    int var19 = arg4 - arg0;
                    int var20 = this.field4326 * arg0;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class186.method1046((byte) -104, this.field4328, 0, var13 >> 16, var20, var14 >> 16);
                                var14 += var10;
                                var13 += var11;
                                var20 += this.field4326;
                            }
                        }
                        class186.method1046((byte) -104, this.field4328, 0, var13 >> 16, var20, var12 >> 16);
                        var12 += var9;
                        var20 += this.field4326;
                        var13 += var11;
                    }
                } else {
                    int var15 = arg3 - arg4;
                    int var16 = arg4 - arg0;
                    int var17 = this.field4326 * arg0;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class186.method1046((byte) -104, this.field4328, 0, var14 >> 16, var17, var13 >> 16);
                                var13 += var11;
                                var14 += var10;
                                var17 += this.field4326;
                            }
                        }
                        class186.method1046((byte) -104, this.field4328, 0, var12 >> 16, var17, var13 >> 16);
                        var17 += this.field4326;
                        var13 += var11;
                        var12 += var9;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg2 << 16;
                int var23 = arg6 << 16;
                if (arg0 < 0) {
                    var22 -= arg0 * var11;
                    var21 -= arg0 * var9;
                    arg0 = 0;
                }
                if (arg3 < 0) {
                    var23 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg0 != arg3 && var11 < var9 || arg0 == arg3 && var9 < var10) {
                    int var24 = arg4 - arg3;
                    int var25 = arg3 - arg0;
                    int var26 = this.field4326 * arg0;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class186.method1046((byte) -104, this.field4328, 0, var21 >> 16, var26, var23 >> 16);
                                var21 += var9;
                                var23 += var10;
                                var26 += this.field4326;
                            }
                        }
                        class186.method1046((byte) -104, this.field4328, 0, var21 >> 16, var26, var22 >> 16);
                        var22 += var11;
                        var26 += this.field4326;
                        var21 += var9;
                    }
                } else {
                    int var27 = arg4 - arg3;
                    int var28 = arg3 - arg0;
                    int var29 = this.field4326 * arg0;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class186.method1046((byte) -104, this.field4328, 0, var23 >> 16, var29, var21 >> 16);
                                var23 += var10;
                                var21 += var9;
                                var29 += this.field4326;
                            }
                        }
                        class186.method1046((byte) -104, this.field4328, 0, var22 >> 16, var29, var21 >> 16);
                        var22 += var11;
                        var29 += this.field4326;
                        var21 += var9;
                    }
                }
            }
        } else if (arg3 < arg4) {
            if (arg0 >= arg4) {
                int var30;
                int var31 = var30 = arg6 << 16;
                int var32 = arg1 << 16;
                if (arg3 < 0) {
                    var31 -= arg3 * var10;
                    var30 -= arg3 * var11;
                    arg3 = 0;
                }
                if (arg4 < 0) {
                    var32 -= arg4 * var9;
                    arg4 = 0;
                }
                if (var10 >= var11) {
                    int var33 = arg0 - arg4;
                    int var34 = arg4 - arg3;
                    int var35 = this.field4326 * arg3;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class186.method1046((byte) -104, this.field4328, 0, var32 >> 16, var35, var30 >> 16);
                                var30 += var11;
                                var32 += var9;
                                var35 += this.field4326;
                            }
                        }
                        class186.method1046((byte) -104, this.field4328, 0, var31 >> 16, var35, var30 >> 16);
                        var30 += var11;
                        var31 += var10;
                        var35 += this.field4326;
                    }
                } else {
                    int var36 = arg0 - arg4;
                    int var37 = arg4 - arg3;
                    int var38 = this.field4326 * arg3;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class186.method1046((byte) -104, this.field4328, 0, var30 >> 16, var38, var32 >> 16);
                                var30 += var11;
                                var38 += this.field4326;
                                var32 += var9;
                            }
                        }
                        class186.method1046((byte) -104, this.field4328, 0, var30 >> 16, var38, var31 >> 16);
                        var30 += var11;
                        var38 += this.field4326;
                        var31 += var10;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg6 << 16;
                if (arg3 < 0) {
                    var39 -= arg3 * var11;
                    var40 -= arg3 * var10;
                    arg3 = 0;
                }
                int var41 = arg2 << 16;
                if (arg0 < 0) {
                    var41 -= arg0 * var9;
                    arg0 = 0;
                }
                if (var11 > var10) {
                    int var42 = arg4 - arg0;
                    int var43 = arg0 - arg3;
                    int var44 = this.field4326 * arg3;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class186.method1046((byte) -104, this.field4328, 0, var41 >> 16, var44, var40 >> 16);
                                var40 += var10;
                                var44 += this.field4326;
                                var41 += var9;
                            }
                        }
                        class186.method1046((byte) -104, this.field4328, 0, var39 >> 16, var44, var40 >> 16);
                        var44 += this.field4326;
                        var40 += var10;
                        var39 += var11;
                    }
                } else {
                    int var45 = arg4 - arg0;
                    int var46 = arg0 - arg3;
                    int var47 = this.field4326 * arg3;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class186.method1046((byte) -104, this.field4328, 0, var40 >> 16, var47, var41 >> 16);
                                var47 += this.field4326;
                                var40 += var10;
                                var41 += var9;
                            }
                        }
                        class186.method1046((byte) -104, this.field4328, 0, var40 >> 16, var47, var39 >> 16);
                        var47 += this.field4326;
                        var39 += var11;
                        var40 += var10;
                    }
                }
            }
        } else if (arg0 > arg3) {
            int var48;
            int var49 = var48 = arg1 << 16;
            int var50 = arg6 << 16;
            if (arg4 < 0) {
                var48 -= arg4 * var10;
                var49 -= arg4 * var9;
                arg4 = 0;
            }
            if (arg3 < 0) {
                var50 -= arg3 * var11;
                arg3 = 0;
            }
            if (arg3 != arg4 && var10 > var9 || arg3 == arg4 && var11 < var9) {
                int var51 = arg0 - arg3;
                int var52 = arg3 - arg4;
                int var53 = this.field4326 * arg4;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class186.method1046((byte) -104, this.field4328, 0, var50 >> 16, var53, var49 >> 16);
                            var49 += var9;
                            var50 += var11;
                            var53 += this.field4326;
                        }
                    }
                    class186.method1046((byte) -104, this.field4328, 0, var48 >> 16, var53, var49 >> 16);
                    var49 += var9;
                    var53 += this.field4326;
                    var48 += var10;
                }
            } else {
                int var54 = arg0 - arg3;
                int var55 = arg3 - arg4;
                int var56 = this.field4326 * arg4;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class186.method1046((byte) -104, this.field4328, 0, var49 >> 16, var56, var50 >> 16);
                            var56 += this.field4326;
                            var49 += var9;
                            var50 += var11;
                        }
                    }
                    class186.method1046((byte) -104, this.field4328, 0, var49 >> 16, var56, var48 >> 16);
                    var56 += this.field4326;
                    var48 += var10;
                    var49 += var9;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg1 << 16;
            if (arg4 < 0) {
                var57 -= arg4 * var10;
                var58 -= arg4 * var9;
                arg4 = 0;
            }
            int var59 = arg2 << 16;
            if (arg0 < 0) {
                var59 -= arg0 * var11;
                arg0 = 0;
            }
            if (var9 >= var10) {
                int var60 = arg3 - arg0;
                int var61 = arg0 - arg4;
                int var62 = this.field4326 * arg4;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class186.method1046((byte) -104, this.field4328, 0, var59 >> 16, var62, var57 >> 16);
                            var62 += this.field4326;
                            var59 += var11;
                            var57 += var10;
                        }
                    }
                    class186.method1046((byte) -104, this.field4328, 0, var58 >> 16, var62, var57 >> 16);
                    var57 += var10;
                    var62 += this.field4326;
                    var58 += var9;
                }
            } else {
                int var63 = arg3 - arg0;
                int var64 = arg0 - arg4;
                int var65 = this.field4326 * arg4;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class186.method1046((byte) -104, this.field4328, 0, var57 >> 16, var65, var59 >> 16);
                            var57 += var10;
                            var65 += this.field4326;
                            var59 += var11;
                        }
                    }
                    class186.method1046((byte) -104, this.field4328, 0, var57 >> 16, var65, var58 >> 16);
                    var57 += var10;
                    var65 += this.field4326;
                    var58 += var9;
                }
            }
        }
    }
}
