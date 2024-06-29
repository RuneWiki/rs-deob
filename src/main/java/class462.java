import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class462 extends class263 {

    @OriginalMember(owner = "client!fk", name = "G", descriptor = "[B")
    public byte[] field6793;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public int field6790;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
    public int field6794;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public int field6798;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method2713(byte arg0, int arg1, int arg2) {
        if (arg0 == 66) {
            field6791++;
            return (arg2 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/String;III)V", line = 16)
    public static final void method2714(int arg0, String arg1, int arg2, int arg3, int arg4) {
        field6797++;
        class150 var5 = class525.method3121(arg3, arg0, arg2 + 22293);
        if (var5 == null) {
            return;
        }
        if (var5.field2209 != null) {
            class437 var6 = new class437();
            var6.field6386 = arg1;
            var6.field6389 = var5.field2209;
            var6.field6390 = var5;
            var6.field6397 = arg4;
            class429.method2537(var6);
        }
        boolean var7 = true;
        if (var5.field2289 != 0) {
            var7 = class142.method962(var5, -86);
        }
        if (!var7 || !client.method1228(var5).method1181(-2049225995, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class95.field1456++;
            class491.method2878((byte) 92, class242.field3375);
            class321.method1863(var5.field2237, 114, arg0, arg3);
        }
        if (arg4 == 2) {
            class242.field3388++;
            class491.method2878((byte) 92, class435.field6371);
            class321.method1863(var5.field2237, 114, arg0, arg3);
        }
        if (arg4 == 3) {
            class491.method2878((byte) 92, class486.field7121);
            class78.field1139++;
            class321.method1863(var5.field2237, 117, arg0, arg3);
        }
        if (arg2 != -31433) {
            return;
        }
        if (arg4 == 4) {
            class179.field2633++;
            class491.method2878((byte) 92, class447.field6580);
            class321.method1863(var5.field2237, 115, arg0, arg3);
        }
        if (arg4 == 5) {
            class508.field7514++;
            class491.method2878((byte) 92, class306.field4170);
            class321.method1863(var5.field2237, arg2 + 31555, arg0, arg3);
        }
        if (arg4 == 6) {
            class404.field5934++;
            class491.method2878((byte) 92, class60.field753);
            class321.method1863(var5.field2237, 124, arg0, arg3);
        }
        if (arg4 == 7) {
            class491.method2878((byte) 92, class136.field1954);
            class100.field1498++;
            class321.method1863(var5.field2237, 123, arg0, arg3);
        }
        if (arg4 == 8) {
            class491.method2878((byte) 92, class147.field2128);
            class457.field6704++;
            class321.method1863(var5.field2237, arg2 + 31558, arg0, arg3);
        }
        if (arg4 == 9) {
            class491.method2878((byte) 92, class49.field591);
            class471.field6885++;
            class321.method1863(var5.field2237, 113, arg0, arg3);
        }
        if (arg4 == 10) {
            class491.method2878((byte) 92, class303.field4145);
            class222.field3164++;
            class321.method1863(var5.field2237, arg2 ^ 0xFFFF854B, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIB)V", line = 135)
    public final void method2715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field6792++;
        int var8 = 0;
        int var9 = 48 % ((-arg6 - 68) / 44);
        if (arg1 != arg3) {
            var8 = (arg5 - arg4 << 16) / (arg3 - arg1);
        }
        int var10 = 0;
        if (arg0 != arg3) {
            var10 = (arg2 - arg5 << 16) / (arg0 - arg3);
        }
        int var11 = 0;
        if (arg0 != arg1) {
            var11 = (arg4 - arg2 << 16) / (arg1 - arg0);
        }
        if (arg1 <= arg3 && arg0 >= arg1) {
            if (arg3 >= arg0) {
                int var12;
                int var13 = var12 = arg4 << 16;
                int var14 = arg2 << 16;
                if (arg1 < 0) {
                    var12 -= arg1 * var8;
                    var13 -= arg1 * var11;
                    arg1 = 0;
                }
                if (arg0 < 0) {
                    var14 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg0 != arg1 && var11 < var8 || arg0 == arg1 && var8 < var10) {
                    int var15 = arg3 - arg0;
                    int var16 = arg0 - arg1;
                    int var17 = this.field6790 * arg1;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class471.method2769(0, var17, this.field6793, var14 >> 16, 32058, var12 >> 16);
                                var12 += var8;
                                var14 += var10;
                                var17 += this.field6790;
                            }
                        }
                        class471.method2769(0, var17, this.field6793, var13 >> 16, 32058, var12 >> 16);
                        var17 += this.field6790;
                        var13 += var11;
                        var12 += var8;
                    }
                } else {
                    int var18 = arg3 - arg0;
                    int var19 = arg0 - arg1;
                    int var20 = this.field6790 * arg1;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class471.method2769(0, var20, this.field6793, var12 >> 16, 32058, var14 >> 16);
                                var12 += var8;
                                var20 += this.field6790;
                                var14 += var10;
                            }
                        }
                        class471.method2769(0, var20, this.field6793, var12 >> 16, 32058, var13 >> 16);
                        var12 += var8;
                        var13 += var11;
                        var20 += this.field6790;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg4 << 16;
                int var23 = arg5 << 16;
                if (arg1 < 0) {
                    var21 -= arg1 * var8;
                    var22 -= arg1 * var11;
                    arg1 = 0;
                }
                if (arg3 < 0) {
                    var23 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg1 != arg3 && var11 < var8 || arg1 == arg3 && var11 > var10) {
                    int var24 = arg0 - arg3;
                    int var25 = arg3 - arg1;
                    int var26 = this.field6790 * arg1;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class471.method2769(0, var26, this.field6793, var22 >> 16, 32058, var23 >> 16);
                                var26 += this.field6790;
                                var23 += var10;
                                var22 += var11;
                            }
                        }
                        class471.method2769(0, var26, this.field6793, var22 >> 16, 32058, var21 >> 16);
                        var26 += this.field6790;
                        var21 += var8;
                        var22 += var11;
                    }
                } else {
                    int var27 = arg0 - arg3;
                    int var28 = arg3 - arg1;
                    int var29 = this.field6790 * arg1;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class471.method2769(0, var29, this.field6793, var23 >> 16, 32058, var22 >> 16);
                                var29 += this.field6790;
                                var22 += var11;
                                var23 += var10;
                            }
                        }
                        class471.method2769(0, var29, this.field6793, var21 >> 16, 32058, var22 >> 16);
                        var29 += this.field6790;
                        var21 += var8;
                        var22 += var11;
                    }
                }
            }
        } else if (arg0 < arg3) {
            if (arg3 <= arg1) {
                int var30;
                int var31 = var30 = arg2 << 16;
                if (arg0 < 0) {
                    var31 -= arg0 * var10;
                    var30 -= arg0 * var11;
                    arg0 = 0;
                }
                int var32 = arg5 << 16;
                if (arg3 < 0) {
                    var32 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var11 <= var10) {
                    int var33 = arg1 - arg3;
                    int var34 = arg3 - arg0;
                    int var35 = this.field6790 * arg0;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class471.method2769(0, var35, this.field6793, var30 >> 16, 32058, var32 >> 16);
                                var35 += this.field6790;
                                var30 += var11;
                                var32 += var8;
                            }
                        }
                        class471.method2769(0, var35, this.field6793, var30 >> 16, 32058, var31 >> 16);
                        var35 += this.field6790;
                        var30 += var11;
                        var31 += var10;
                    }
                } else {
                    int var36 = arg1 - arg3;
                    int var37 = arg3 - arg0;
                    int var38 = this.field6790 * arg0;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class471.method2769(0, var38, this.field6793, var32 >> 16, 32058, var30 >> 16);
                                var32 += var8;
                                var38 += this.field6790;
                                var30 += var11;
                            }
                        }
                        class471.method2769(0, var38, this.field6793, var31 >> 16, 32058, var30 >> 16);
                        var31 += var10;
                        var38 += this.field6790;
                        var30 += var11;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg2 << 16;
                int var41 = arg4 << 16;
                if (arg0 < 0) {
                    var39 -= arg0 * var11;
                    var40 -= arg0 * var10;
                    arg0 = 0;
                }
                if (arg1 < 0) {
                    var41 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var10 >= var11) {
                    int var42 = arg3 - arg1;
                    int var43 = arg1 - arg0;
                    int var44 = this.field6790 * arg0;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class471.method2769(0, var44, this.field6793, var41 >> 16, 32058, var40 >> 16);
                                var40 += var10;
                                var44 += this.field6790;
                                var41 += var8;
                            }
                        }
                        class471.method2769(0, var44, this.field6793, var39 >> 16, 32058, var40 >> 16);
                        var44 += this.field6790;
                        var40 += var10;
                        var39 += var11;
                    }
                } else {
                    int var45 = arg3 - arg1;
                    int var46 = arg1 - arg0;
                    int var47 = this.field6790 * arg0;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class471.method2769(0, var47, this.field6793, var40 >> 16, 32058, var41 >> 16);
                                var47 += this.field6790;
                                var40 += var10;
                                var41 += var8;
                            }
                        }
                        class471.method2769(0, var47, this.field6793, var40 >> 16, 32058, var39 >> 16);
                        var47 += this.field6790;
                        var39 += var11;
                        var40 += var10;
                    }
                }
            }
        } else if (arg0 >= arg1) {
            int var48;
            int var49 = var48 = arg5 << 16;
            if (arg3 < 0) {
                var49 -= arg3 * var8;
                var48 -= arg3 * var10;
                arg3 = 0;
            }
            int var50 = arg4 << 16;
            if (arg1 < 0) {
                var50 -= arg1 * var11;
                arg1 = 0;
            }
            if (var10 <= var8) {
                int var51 = arg0 - arg1;
                int var52 = arg1 - arg3;
                int var53 = this.field6790 * arg3;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class471.method2769(0, var53, this.field6793, var48 >> 16, 32058, var50 >> 16);
                            var48 += var10;
                            var53 += this.field6790;
                            var50 += var11;
                        }
                    }
                    class471.method2769(0, var53, this.field6793, var48 >> 16, 32058, var49 >> 16);
                    var48 += var10;
                    var53 += this.field6790;
                    var49 += var8;
                }
            } else {
                int var54 = arg0 - arg1;
                int var55 = arg1 - arg3;
                int var56 = this.field6790 * arg3;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class471.method2769(0, var56, this.field6793, var50 >> 16, 32058, var48 >> 16);
                            var56 += this.field6790;
                            var50 += var11;
                            var48 += var10;
                        }
                    }
                    class471.method2769(0, var56, this.field6793, var49 >> 16, 32058, var48 >> 16);
                    var49 += var8;
                    var56 += this.field6790;
                    var48 += var10;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg5 << 16;
            if (arg3 < 0) {
                var57 -= arg3 * var10;
                var58 -= arg3 * var8;
                arg3 = 0;
            }
            int var59 = arg2 << 16;
            if (arg0 < 0) {
                var59 -= arg0 * var11;
                arg0 = 0;
            }
            if (arg0 != arg3 && var10 > var8 || arg0 == arg3 && var8 > var11) {
                int var60 = arg1 - arg0;
                int var61 = arg0 - arg3;
                int var62 = this.field6790 * arg3;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class471.method2769(0, var62, this.field6793, var58 >> 16, 32058, var59 >> 16);
                            var62 += this.field6790;
                            var58 += var8;
                            var59 += var11;
                        }
                    }
                    class471.method2769(0, var62, this.field6793, var58 >> 16, 32058, var57 >> 16);
                    var57 += var10;
                    var58 += var8;
                    var62 += this.field6790;
                }
            } else {
                int var63 = arg1 - arg0;
                int var64 = arg0 - arg3;
                int var65 = this.field6790 * arg3;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class471.method2769(0, var65, this.field6793, var59 >> 16, 32058, var58 >> 16);
                            var58 += var8;
                            var59 += var11;
                            var65 += this.field6790;
                        }
                    }
                    class471.method2769(0, var65, this.field6793, var57 >> 16, 32058, var58 >> 16);
                    var58 += var8;
                    var65 += this.field6790;
                    var57 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIBI)V", line = 581)
    public final void method2716(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.field6790 = arg4 - arg0;
        int var6 = 11 % ((arg3 - 57) / 57);
        this.field6794 = arg2 - arg1;
        field6799++;
        this.field6798 = arg1;
        this.field6795 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V", line = 598)
    public final void method2717(int arg0) {
        field6800++;
        int var2 = -1;
        int var3 = this.field6793.length - 8;
        while (var2 < var3) {
            var2++;
            this.field6793[var2] = 0;
            var2++;
            this.field6793[var2] = 0;
            var2++;
            this.field6793[var2] = 0;
            var2++;
            this.field6793[var2] = 0;
            var2++;
            this.field6793[var2] = 0;
            var2++;
            this.field6793[var2] = 0;
            var2++;
            this.field6793[var2] = 0;
            var2++;
            this.field6793[var2] = 0;
        }
        while (var2 < this.field6793.length - 1) {
            var2++;
            this.field6793[var2] = 0;
        }
        if (arg0 <= 56) {
            this.method2718(-44, 55, 26);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Z", line = 628)
    public final boolean method2718(int arg0, int arg1, int arg2) {
        field6796++;
        if (arg1 != 6) {
            this.field6798 = -9;
        }
        return this.field6793.length >= arg0 * arg2;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lef;II)V", line = 640)
    public class462(class338 arg0, int arg1, int arg2) {
        this.field6793 = new byte[arg1 * arg2];
    }
}
