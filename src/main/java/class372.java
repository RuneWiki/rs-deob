import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class372 extends class276 {

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[B")
    public byte[] field5024;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field5018;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public int field5019;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public int field5022;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public int field5023;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public int field5028;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V", line = 5)
    public final void method2189(byte arg0) {
        field5021++;
        int var2 = 91 % ((63 - arg0) / 36);
        int var3 = -1;
        int var4 = this.field5024.length - 8;
        while (var4 > var3) {
            var3++;
            this.field5024[var3] = 0;
            var3++;
            this.field5024[var3] = 0;
            var3++;
            this.field5024[var3] = 0;
            var3++;
            this.field5024[var3] = 0;
            var3++;
            this.field5024[var3] = 0;
            var3++;
            this.field5024[var3] = 0;
            var3++;
            this.field5024[var3] = 0;
            var3++;
            this.field5024[var3] = 0;
        }
        while (var3 < this.field5024.length - 1) {
            var3++;
            this.field5024[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 33)
    public static final void method2190(int arg0) {
        if (arg0 != 0) {
            method2190(-8);
        }
        class93.field1411 = true;
        field5020++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIBI)V", line = 45)
    public final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5026++;
        int var8 = 0;
        if (arg0 != arg3) {
            var8 = (arg4 - arg1 << 16) / (arg3 - arg0);
        }
        int var9 = 0;
        if (arg5 != -100) {
            return;
        }
        if (arg3 != arg6) {
            var9 = (arg2 - arg4 << 16) / (arg6 - arg3);
        }
        int var10 = 0;
        if (arg0 != arg6) {
            var10 = (arg1 - arg2 << 16) / (arg0 - arg6);
        }
        if (arg0 <= arg3 && arg0 <= arg6) {
            if (arg6 > arg3) {
                int var11;
                int var12 = var11 = arg1 << 16;
                int var13 = arg4 << 16;
                if (arg0 < 0) {
                    var12 -= arg0 * var10;
                    var11 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg0 != arg3 && var8 > var10 || arg0 == arg3 && var10 > var9) {
                    int var14 = arg6 - arg3;
                    int var15 = arg3 - arg0;
                    int var16 = this.field5023 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class369.method2173(var12 >> 16, this.field5024, var13 >> 16, (byte) -74, var16, 0);
                                var16 += this.field5023;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class369.method2173(var12 >> 16, this.field5024, var11 >> 16, (byte) -102, var16, 0);
                        var11 += var8;
                        var16 += this.field5023;
                        var12 += var10;
                    }
                } else {
                    int var17 = arg6 - arg3;
                    int var18 = arg3 - arg0;
                    int var19 = this.field5023 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class369.method2173(var13 >> 16, this.field5024, var12 >> 16, (byte) -107, var19, 0);
                                var19 += this.field5023;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class369.method2173(var11 >> 16, this.field5024, var12 >> 16, (byte) -64, var19, 0);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field5023;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                int var22 = arg2 << 16;
                if (arg6 < 0) {
                    var22 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg0 != arg6 && var10 < var8 || arg0 == arg6 && var8 < var9) {
                    int var23 = arg3 - arg6;
                    int var24 = arg6 - arg0;
                    int var25 = this.field5023 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class369.method2173(var22 >> 16, this.field5024, var20 >> 16, (byte) -98, var25, 0);
                                var25 += this.field5023;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class369.method2173(var21 >> 16, this.field5024, var20 >> 16, (byte) -40, var25, 0);
                        var20 += var8;
                        var21 += var10;
                        var25 += this.field5023;
                    }
                } else {
                    int var26 = arg3 - arg6;
                    int var27 = arg6 - arg0;
                    int var28 = this.field5023 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class369.method2173(var20 >> 16, this.field5024, var22 >> 16, (byte) -54, var28, 0);
                                var28 += this.field5023;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class369.method2173(var20 >> 16, this.field5024, var21 >> 16, (byte) -43, var28, 0);
                        var28 += this.field5023;
                        var21 += var10;
                        var20 += var8;
                    }
                }
            }
        } else if (arg3 > arg6) {
            if (arg3 > arg0) {
                int var29;
                int var30 = var29 = arg2 << 16;
                if (arg6 < 0) {
                    var29 -= arg6 * var10;
                    var30 -= arg6 * var9;
                    arg6 = 0;
                }
                int var31 = arg1 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg3 - arg0;
                    int var33 = arg0 - arg6;
                    int var34 = this.field5023 * arg6;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class369.method2173(var31 >> 16, this.field5024, var30 >> 16, (byte) -40, var34, 0);
                                var31 += var8;
                                var30 += var9;
                                var34 += this.field5023;
                            }
                        }
                        class369.method2173(var29 >> 16, this.field5024, var30 >> 16, (byte) -67, var34, 0);
                        var29 += var10;
                        var34 += this.field5023;
                        var30 += var9;
                    }
                } else {
                    int var35 = arg3 - arg0;
                    int var36 = arg0 - arg6;
                    int var37 = this.field5023 * arg6;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class369.method2173(var30 >> 16, this.field5024, var31 >> 16, (byte) -28, var37, 0);
                                var31 += var8;
                                var37 += this.field5023;
                                var30 += var9;
                            }
                        }
                        class369.method2173(var30 >> 16, this.field5024, var29 >> 16, (byte) -13, var37, 0);
                        var37 += this.field5023;
                        var30 += var9;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                int var40 = arg4 << 16;
                if (arg6 < 0) {
                    var38 -= arg6 * var10;
                    var39 -= arg6 * var9;
                    arg6 = 0;
                }
                if (arg3 < 0) {
                    var40 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var9 < var10) {
                    int var41 = arg0 - arg3;
                    int var42 = arg3 - arg6;
                    int var43 = this.field5023 * arg6;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class369.method2173(var40 >> 16, this.field5024, var38 >> 16, (byte) -114, var43, 0);
                                var38 += var10;
                                var43 += this.field5023;
                                var40 += var8;
                            }
                        }
                        class369.method2173(var39 >> 16, this.field5024, var38 >> 16, (byte) -43, var43, 0);
                        var38 += var10;
                        var39 += var9;
                        var43 += this.field5023;
                    }
                } else {
                    int var44 = arg0 - arg3;
                    int var45 = arg3 - arg6;
                    int var46 = this.field5023 * arg6;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class369.method2173(var38 >> 16, this.field5024, var40 >> 16, (byte) -123, var46, 0);
                                var40 += var8;
                                var46 += this.field5023;
                                var38 += var10;
                            }
                        }
                        class369.method2173(var38 >> 16, this.field5024, var39 >> 16, (byte) -52, var46, 0);
                        var38 += var10;
                        var46 += this.field5023;
                        var39 += var9;
                    }
                }
            }
        } else if (arg0 <= arg6) {
            int var47;
            int var48 = var47 = arg4 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var8;
                var47 -= arg3 * var9;
                arg3 = 0;
            }
            int var49 = arg1 << 16;
            if (arg0 < 0) {
                var49 -= arg0 * var10;
                arg0 = 0;
            }
            if (var9 > var8) {
                int var50 = arg6 - arg0;
                int var51 = arg0 - arg3;
                int var52 = this.field5023 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class369.method2173(var49 >> 16, this.field5024, var47 >> 16, (byte) -116, var52, 0);
                            var49 += var10;
                            var47 += var9;
                            var52 += this.field5023;
                        }
                    }
                    class369.method2173(var48 >> 16, this.field5024, var47 >> 16, (byte) -35, var52, 0);
                    var48 += var8;
                    var52 += this.field5023;
                    var47 += var9;
                }
            } else {
                int var53 = arg6 - arg0;
                int var54 = arg0 - arg3;
                int var55 = this.field5023 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class369.method2173(var47 >> 16, this.field5024, var49 >> 16, (byte) -18, var55, 0);
                            var49 += var10;
                            var55 += this.field5023;
                            var47 += var9;
                        }
                    }
                    class369.method2173(var47 >> 16, this.field5024, var48 >> 16, (byte) -111, var55, 0);
                    var47 += var9;
                    var48 += var8;
                    var55 += this.field5023;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            if (arg3 < 0) {
                var56 -= arg3 * var9;
                var57 -= arg3 * var8;
                arg3 = 0;
            }
            int var58 = arg2 << 16;
            if (arg6 < 0) {
                var58 -= arg6 * var10;
                arg6 = 0;
            }
            if (arg3 != arg6 && var9 > var8 || arg3 == arg6 && var8 > var10) {
                int var59 = arg0 - arg6;
                int var60 = arg6 - arg3;
                int var61 = this.field5023 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class369.method2173(var57 >> 16, this.field5024, var58 >> 16, (byte) -93, var61, 0);
                            var57 += var8;
                            var61 += this.field5023;
                            var58 += var10;
                        }
                    }
                    class369.method2173(var57 >> 16, this.field5024, var56 >> 16, (byte) -102, var61, 0);
                    var61 += this.field5023;
                    var57 += var8;
                    var56 += var9;
                }
            } else {
                int var62 = arg0 - arg6;
                int var63 = arg6 - arg3;
                int var64 = this.field5023 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class369.method2173(var58 >> 16, this.field5024, var57 >> 16, (byte) -16, var64, 0);
                            var57 += var8;
                            var64 += this.field5023;
                            var58 += var10;
                        }
                    }
                    class369.method2173(var56 >> 16, this.field5024, var57 >> 16, (byte) -128, var64, 0);
                    var56 += var9;
                    var57 += var8;
                    var64 += this.field5023;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lbd;IIILst;Lhfa;II)V", line = 490)
    public static final void method2192(class58 arg0, int arg1, int arg2, int arg3, class403 arg4, class287 arg5, int arg6, int arg7) {
        field5016++;
        class597 var8 = new class597();
        var8.field7918 = arg6 << 9;
        if (arg2 != -601998647) {
            return;
        }
        var8.field7907 = arg7 << 9;
        var8.field7893 = arg1;
        if (arg0 != null) {
            var8.field7896 = arg0;
            int var10 = arg0.field838;
            int var11 = arg0.field885;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg0.field885;
                var11 = arg0.field838;
            }
            var8.field7912 = arg0.field865 << 9;
            var8.field7898 = arg0.field887;
            var8.field7901 = arg0.field883;
            var8.field7909 = arg0.field863;
            var8.field7913 = arg0.field846;
            var8.field7902 = arg0.field861;
            var8.field7906 = arg0.field857;
            var8.field7900 = arg7 + var10 << 9;
            var8.field7917 = arg6 + var11 << 9;
            var8.field7895 = arg0.field897;
            if (arg0.field888 != null) {
                var8.field7915 = true;
                var8.method3294((byte) -121);
            }
            if (var8.field7895 != null) {
                var8.field7903 = (int) ((double) (var8.field7898 - var8.field7906) * Math.random()) + var8.field7906;
            }
            class6.field182.method3265(var8, (byte) -112);
            return;
        }
        if (arg5 != null) {
            var8.field7905 = arg5;
            class419 var9 = arg5.field4052;
            if (var9.field5753 != null) {
                var8.field7915 = true;
                var9 = var9.method2401(false, class80.field1261);
            }
            if (var9 != null) {
                var8.field7917 = var9.field5738 + arg6 << 9;
                var8.field7900 = var9.field5738 + arg7 << 9;
                var8.field7902 = class611.method3350(arg5, (byte) 78);
                var8.field7912 = var9.field5800 << 9;
                var8.field7901 = var9.field5758;
                var8.field7909 = var9.field5737;
            }
            class665.field9431.method3265(var8, (byte) -114);
            return;
        }
        if (arg4 == null) {
            return;
        }
        var8.field7899 = arg4;
        var8.field7900 = arg7 + arg4.method2317((byte) 40) << 9;
        var8.field7917 = arg6 + arg4.method2317((byte) 40) << 9;
        var8.field7902 = class346.method2079(arg2 + 602011257, arg4);
        var8.field7901 = arg4.field5377;
        var8.field7909 = arg4.field5357;
        var8.field7912 = arg4.field5383 << 9;
        class526.field7004.method2911((long) arg4.field5633, var8, (byte) -28);
        return;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V", line = 585)
    public static final void method2193(int arg0) {
        if (arg0 >= -23) {
            method2196(-40, 85, -41);
        }
        field5027++;
        class488 var1 = null;
        try {
            class192 var2 = class688.field9669.method2892("2", true, true);
            while (var2.field2816 == 0) {
                class486.method2722(0, 1L);
            }
            if (var2.field2816 == 1) {
                var1 = (class488) var2.field2820;
                byte[] var3 = new byte[(int) var1.method2732(88)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2726(var3.length - var4, var4, (byte) -123, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class270.method1645(-2, new class335(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2729((byte) -2);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z", line = 635)
    public final boolean method2194(int arg0, int arg1, int arg2) {
        field5018++;
        int var4 = 64 % ((30 - arg2) / 42);
        return (arg0 * arg1) <= this.field5024.length;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)V", line = 646)
    public final void method2195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5022 = arg3;
        this.field5023 = arg0 - arg4;
        if (arg1 > -97) {
            this.field5022 = 93;
        }
        this.field5019 = arg4;
        this.field5028 = arg2 - arg3;
        field5025++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)Z", line = 669)
    public static final boolean method2196(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2192(null, 62, -31, 109, null, null, 112, 58);
        }
        field5017++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lej;II)V", line = 679)
    public class372(class111 arg0, int arg1, int arg2) {
        this.field5024 = new byte[arg1 * arg2];
    }
}
