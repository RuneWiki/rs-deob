import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class283 extends class521 {

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "[B")
    public byte[] field4458;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4459 = null;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public int field4461;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public int field4466;

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "I")
    public int field4468;

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "Lbi;")
    public static class104 field4460;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(III)Z")
    public final boolean method1901(int arg0, int arg1, int arg2) {
        if (arg1 != 298126800) {
            this.method1903(27, 82, -90, 127, 86);
        }
        field4462++;
        return this.field4458.length >= (arg0 * arg2);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
    public final void method1902(byte arg0) {
        field4464++;
        if (arg0 != 0) {
            field4459 = null;
        }
        int var2 = -1;
        int var3 = this.field4458.length - 8;
        while (var2 < var3) {
            var2++;
            this.field4458[var2] = 0;
            var2++;
            this.field4458[var2] = 0;
            var2++;
            this.field4458[var2] = 0;
            var2++;
            this.field4458[var2] = 0;
            var2++;
            this.field4458[var2] = 0;
            var2++;
            this.field4458[var2] = 0;
            var2++;
            this.field4458[var2] = 0;
            var2++;
            this.field4458[var2] = 0;
        }
        while (var2 < this.field4458.length - 1) {
            var2++;
            this.field4458[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)V")
    public final void method1903(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4461 = arg4;
        this.field4468 = arg1 - arg0;
        this.field4466 = arg0;
        field4469++;
        if (arg3 != -2048629008) {
            this.field4461 = 64;
        }
        this.field4465 = arg2 - arg4;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)V")
    public final void method1904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4463++;
        int var8 = 0;
        if (arg0 != arg6) {
            var8 = (arg3 - arg5 << 16) / (arg6 - arg0);
        }
        int var9 = 0;
        if (arg2 != arg6) {
            var9 = (arg1 - arg3 << 16) / (arg2 - arg6);
        }
        if (arg4 >= -19) {
            this.method1901(109, -2, -3);
        }
        int var10 = 0;
        if (arg0 != arg2) {
            var10 = (arg5 - arg1 << 16) / (arg0 - arg2);
        }
        if (arg6 >= arg0 && arg0 <= arg2) {
            if (arg2 > arg6) {
                int var11;
                int var12 = var11 = arg5 << 16;
                if (arg0 < 0) {
                    var11 -= arg0 * var8;
                    var12 -= arg0 * var10;
                    arg0 = 0;
                }
                int var13 = arg3 << 16;
                if (arg6 < 0) {
                    var13 -= arg6 * var9;
                    arg6 = 0;
                }
                if ((arg0 == arg6 || var8 <= var10) && (arg0 != arg6 || var9 >= var10)) {
                    int var17 = arg2 - arg6;
                    int var18 = arg6 - arg0;
                    int var19 = this.field4465 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class397.method2557(var12 >> 16, var13 >> 16, this.field4458, 0, (byte) 113, var19);
                                var13 += var9;
                                var19 += this.field4465;
                                var12 += var10;
                            }
                        }
                        class397.method2557(var12 >> 16, var11 >> 16, this.field4458, 0, (byte) 121, var19);
                        var11 += var8;
                        var19 += this.field4465;
                        var12 += var10;
                    }
                } else {
                    int var14 = arg2 - arg6;
                    int var15 = arg6 - arg0;
                    int var16 = this.field4465 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class397.method2557(var13 >> 16, var12 >> 16, this.field4458, 0, (byte) -94, var16);
                                var13 += var9;
                                var16 += this.field4465;
                                var12 += var10;
                            }
                        }
                        class397.method2557(var11 >> 16, var12 >> 16, this.field4458, 0, (byte) 114, var16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field4465;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg5 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                int var22 = arg1 << 16;
                if (arg2 < 0) {
                    var22 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg0 != arg2 && var10 < var8 || arg0 == arg2 && var9 > var8) {
                    int var23 = arg6 - arg2;
                    int var24 = arg2 - arg0;
                    int var25 = this.field4465 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class397.method2557(var20 >> 16, var22 >> 16, this.field4458, 0, (byte) -42, var25);
                                var20 += var8;
                                var22 += var9;
                                var25 += this.field4465;
                            }
                        }
                        class397.method2557(var20 >> 16, var21 >> 16, this.field4458, 0, (byte) -10, var25);
                        var21 += var10;
                        var20 += var8;
                        var25 += this.field4465;
                    }
                } else {
                    int var26 = arg6 - arg2;
                    int var27 = arg2 - arg0;
                    int var28 = this.field4465 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class397.method2557(var22 >> 16, var20 >> 16, this.field4458, 0, (byte) -45, var28);
                                var20 += var8;
                                var28 += this.field4465;
                                var22 += var9;
                            }
                        }
                        class397.method2557(var21 >> 16, var20 >> 16, this.field4458, 0, (byte) -89, var28);
                        var21 += var10;
                        var28 += this.field4465;
                        var20 += var8;
                    }
                }
            }
        } else if (arg6 > arg2) {
            if (arg0 < arg6) {
                int var29;
                int var30 = var29 = arg1 << 16;
                int var31 = arg5 << 16;
                if (arg2 < 0) {
                    var30 -= arg2 * var9;
                    var29 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg0 < 0) {
                    var31 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg6 - arg0;
                    int var33 = arg0 - arg2;
                    int var34 = this.field4465 * arg2;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class397.method2557(var31 >> 16, var30 >> 16, this.field4458, 0, (byte) -64, var34);
                                var34 += this.field4465;
                                var31 += var8;
                                var30 += var9;
                            }
                        }
                        class397.method2557(var29 >> 16, var30 >> 16, this.field4458, 0, (byte) -42, var34);
                        var29 += var10;
                        var30 += var9;
                        var34 += this.field4465;
                    }
                } else {
                    int var35 = arg6 - arg0;
                    int var36 = arg0 - arg2;
                    int var37 = this.field4465 * arg2;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class397.method2557(var30 >> 16, var31 >> 16, this.field4458, 0, (byte) 126, var37);
                                var37 += this.field4465;
                                var31 += var8;
                                var30 += var9;
                            }
                        }
                        class397.method2557(var30 >> 16, var29 >> 16, this.field4458, 0, (byte) -78, var37);
                        var30 += var9;
                        var29 += var10;
                        var37 += this.field4465;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg1 << 16;
                int var40 = arg3 << 16;
                if (arg2 < 0) {
                    var39 -= arg2 * var9;
                    var38 -= arg2 * var10;
                    arg2 = 0;
                }
                if (arg6 < 0) {
                    var40 -= arg6 * var8;
                    arg6 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg0 - arg6;
                    int var42 = arg6 - arg2;
                    int var43 = this.field4465 * arg2;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class397.method2557(var40 >> 16, var38 >> 16, this.field4458, 0, (byte) 113, var43);
                                var43 += this.field4465;
                                var40 += var8;
                                var38 += var10;
                            }
                        }
                        class397.method2557(var39 >> 16, var38 >> 16, this.field4458, 0, (byte) 113, var43);
                        var39 += var9;
                        var38 += var10;
                        var43 += this.field4465;
                    }
                } else {
                    int var44 = arg0 - arg6;
                    int var45 = arg6 - arg2;
                    int var46 = this.field4465 * arg2;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class397.method2557(var38 >> 16, var40 >> 16, this.field4458, 0, (byte) -115, var46);
                                var46 += this.field4465;
                                var40 += var8;
                                var38 += var10;
                            }
                        }
                        class397.method2557(var38 >> 16, var39 >> 16, this.field4458, 0, (byte) 125, var46);
                        var46 += this.field4465;
                        var39 += var9;
                        var38 += var10;
                    }
                }
            }
        } else if (arg2 < arg0) {
            int var47;
            int var48 = var47 = arg3 << 16;
            int var49 = arg1 << 16;
            if (arg6 < 0) {
                var47 -= arg6 * var9;
                var48 -= arg6 * var8;
                arg6 = 0;
            }
            if (arg2 < 0) {
                var49 -= arg2 * var10;
                arg2 = 0;
            }
            if (arg2 != arg6 && var8 < var9 || arg2 == arg6 && var8 > var10) {
                int var50 = arg0 - arg2;
                int var51 = arg2 - arg6;
                int var52 = this.field4465 * arg6;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class397.method2557(var49 >> 16, var48 >> 16, this.field4458, 0, (byte) -98, var52);
                            var52 += this.field4465;
                            var48 += var8;
                            var49 += var10;
                        }
                    }
                    class397.method2557(var47 >> 16, var48 >> 16, this.field4458, 0, (byte) 110, var52);
                    var52 += this.field4465;
                    var48 += var8;
                    var47 += var9;
                }
            } else {
                int var53 = arg0 - arg2;
                int var54 = arg2 - arg6;
                int var55 = this.field4465 * arg6;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class397.method2557(var48 >> 16, var49 >> 16, this.field4458, 0, (byte) -38, var55);
                            var55 += this.field4465;
                            var48 += var8;
                            var49 += var10;
                        }
                    }
                    class397.method2557(var48 >> 16, var47 >> 16, this.field4458, 0, (byte) -73, var55);
                    var47 += var9;
                    var55 += this.field4465;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg3 << 16;
            int var58 = arg5 << 16;
            if (arg6 < 0) {
                var57 -= arg6 * var8;
                var56 -= arg6 * var9;
                arg6 = 0;
            }
            if (arg0 < 0) {
                var58 -= arg0 * var10;
                arg0 = 0;
            }
            if (var8 >= var9) {
                int var59 = arg2 - arg0;
                int var60 = arg0 - arg6;
                int var61 = this.field4465 * arg6;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class397.method2557(var58 >> 16, var56 >> 16, this.field4458, 0, (byte) -44, var61);
                            var58 += var10;
                            var61 += this.field4465;
                            var56 += var9;
                        }
                    }
                    class397.method2557(var57 >> 16, var56 >> 16, this.field4458, 0, (byte) 117, var61);
                    var57 += var8;
                    var56 += var9;
                    var61 += this.field4465;
                }
            } else {
                int var62 = arg2 - arg0;
                int var63 = arg0 - arg6;
                int var64 = this.field4465 * arg6;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class397.method2557(var56 >> 16, var58 >> 16, this.field4458, 0, (byte) 114, var64);
                            var56 += var9;
                            var64 += this.field4465;
                            var58 += var10;
                        }
                    }
                    class397.method2557(var56 >> 16, var57 >> 16, this.field4458, 0, (byte) 115, var64);
                    var56 += var9;
                    var64 += this.field4465;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLgi;Lza;)V")
    public static final void method1905(boolean arg0, class437 arg1, class497 arg2) {
        field4467++;
        if (!arg0) {
            field4460 = null;
        }
        boolean var3 = class337.field5262.method2074((byte) -22, arg1.field6749 | 0xFF000000, arg2, arg1.field6611, arg1.field6716, arg1.field6609, arg1.field6676 ? class358.field5565.field5430 : null, arg1.field6678) == null;
        if (var3) {
            class130.field1764.method2124(new class500(arg1.field6716, arg1.field6678, arg1.field6609, arg1.field6749 | 0xFF000000, arg1.field6611, arg1.field6676), (byte) 103);
            class479.method2962(-116, arg1);
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
    public static void method1906(int arg0) {
        field4460 = null;
        if (arg0 != -17591) {
            field4460 = null;
        }
        field4459 = null;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lna;II)V")
    public class283(class211 arg0, int arg1, int arg2) {
        this.field4458 = new byte[arg1 * arg2];
    }

    static {
        new class213("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }
}
