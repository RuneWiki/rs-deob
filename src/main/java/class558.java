import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class558 extends class195 {

    @OriginalMember(owner = "client!de", name = "K", descriptor = "[B")
    public byte[] field7515;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "Lee;")
    public static class706 field7516 = new class706(64);

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public int field7508;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public int field7509;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "I")
    public int field7510;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public int field7513;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field7518;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field7519;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "Lvr;")
    public static class147 field7521;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "Lgw;")
    public static class182 field7520;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public final void method3140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7518++;
        int var8 = 0;
        if (arg2 != arg3) {
            var8 = (arg4 - arg1 << 16) / (arg2 - arg3);
        }
        int var9 = 0;
        if (arg6 != 29167) {
            field7521 = null;
        }
        if (arg2 != arg5) {
            var9 = (arg0 - arg4 << 16) / (arg5 - arg2);
        }
        int var10 = 0;
        if (arg3 != arg5) {
            var10 = (arg1 - arg0 << 16) / (arg3 - arg5);
        }
        if (arg3 <= arg2 && arg5 >= arg3) {
            if (arg2 < arg5) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg3 < 0) {
                    var12 -= arg3 * var10;
                    var11 -= arg3 * var8;
                    arg3 = 0;
                }
                int var13 = arg4 << 16;
                if (arg2 < 0) {
                    var13 -= arg2 * var9;
                    arg2 = 0;
                }
                if (arg2 != arg3 && var10 < var8 || arg2 == arg3 && var10 > var9) {
                    int var14 = arg5 - arg2;
                    int var15 = arg2 - arg3;
                    int var16 = this.field7513 * arg3;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class131.method1048(92, 0, this.field7515, var16, var12 >> 16, var13 >> 16);
                                var12 += var10;
                                var16 += this.field7513;
                                var13 += var9;
                            }
                        }
                        class131.method1048(119, 0, this.field7515, var16, var12 >> 16, var11 >> 16);
                        var16 += this.field7513;
                        var12 += var10;
                        var11 += var8;
                    }
                } else {
                    int var17 = arg5 - arg2;
                    int var18 = arg2 - arg3;
                    int var19 = this.field7513 * arg3;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class131.method1048(94, 0, this.field7515, var19, var13 >> 16, var12 >> 16);
                                var12 += var10;
                                var13 += var9;
                                var19 += this.field7513;
                            }
                        }
                        class131.method1048(76, 0, this.field7515, var19, var11 >> 16, var12 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var19 += this.field7513;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg0 << 16;
                if (arg3 < 0) {
                    var20 -= arg3 * var8;
                    var21 -= arg3 * var10;
                    arg3 = 0;
                }
                if (arg5 < 0) {
                    var22 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg3 != arg5 && var10 < var8 || arg3 == arg5 && var9 > var8) {
                    int var23 = arg2 - arg5;
                    int var24 = arg5 - arg3;
                    int var25 = this.field7513 * arg3;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class131.method1048(96, 0, this.field7515, var25, var22 >> 16, var20 >> 16);
                                var25 += this.field7513;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class131.method1048(93, 0, this.field7515, var25, var21 >> 16, var20 >> 16);
                        var25 += this.field7513;
                        var20 += var8;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg2 - arg5;
                    int var27 = arg5 - arg3;
                    int var28 = this.field7513 * arg3;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class131.method1048(arg6 ^ 0x7186, 0, this.field7515, var28, var20 >> 16, var22 >> 16);
                                var28 += this.field7513;
                                var22 += var9;
                                var20 += var8;
                            }
                        }
                        class131.method1048(113, 0, this.field7515, var28, var20 >> 16, var21 >> 16);
                        var21 += var10;
                        var20 += var8;
                        var28 += this.field7513;
                    }
                }
            }
        } else if (arg5 < arg2) {
            if (arg3 >= arg2) {
                int var29;
                int var30 = var29 = arg0 << 16;
                int var31 = arg4 << 16;
                if (arg5 < 0) {
                    var29 -= arg5 * var10;
                    var30 -= arg5 * var9;
                    arg5 = 0;
                }
                if (arg2 < 0) {
                    var31 -= arg2 * var8;
                    arg2 = 0;
                }
                if (var9 >= var10) {
                    int var32 = arg3 - arg2;
                    int var33 = arg2 - arg5;
                    int var34 = this.field7513 * arg5;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class131.method1048(87, 0, this.field7515, var34, var29 >> 16, var31 >> 16);
                                var34 += this.field7513;
                                var31 += var8;
                                var29 += var10;
                            }
                        }
                        class131.method1048(85, 0, this.field7515, var34, var29 >> 16, var30 >> 16);
                        var29 += var10;
                        var30 += var9;
                        var34 += this.field7513;
                    }
                } else {
                    int var35 = arg3 - arg2;
                    int var36 = arg2 - arg5;
                    int var37 = this.field7513 * arg5;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class131.method1048(113, 0, this.field7515, var37, var31 >> 16, var29 >> 16);
                                var37 += this.field7513;
                                var29 += var10;
                                var31 += var8;
                            }
                        }
                        class131.method1048(116, 0, this.field7515, var37, var30 >> 16, var29 >> 16);
                        var29 += var10;
                        var30 += var9;
                        var37 += this.field7513;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg0 << 16;
                if (arg5 < 0) {
                    var38 -= arg5 * var10;
                    var39 -= arg5 * var9;
                    arg5 = 0;
                }
                int var40 = arg1 << 16;
                if (arg3 < 0) {
                    var40 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var9 >= var10) {
                    int var41 = arg2 - arg3;
                    int var42 = arg3 - arg5;
                    int var43 = this.field7513 * arg5;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class131.method1048(119, 0, this.field7515, var43, var40 >> 16, var39 >> 16);
                                var40 += var8;
                                var43 += this.field7513;
                                var39 += var9;
                            }
                        }
                        class131.method1048(90, 0, this.field7515, var43, var38 >> 16, var39 >> 16);
                        var39 += var9;
                        var38 += var10;
                        var43 += this.field7513;
                    }
                } else {
                    int var44 = arg2 - arg3;
                    int var45 = arg3 - arg5;
                    int var46 = this.field7513 * arg5;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class131.method1048(85, 0, this.field7515, var46, var39 >> 16, var40 >> 16);
                                var40 += var8;
                                var39 += var9;
                                var46 += this.field7513;
                            }
                        }
                        class131.method1048(75, 0, this.field7515, var46, var39 >> 16, var38 >> 16);
                        var46 += this.field7513;
                        var39 += var9;
                        var38 += var10;
                    }
                }
            }
        } else if (arg3 > arg5) {
            int var47;
            int var48 = var47 = arg4 << 16;
            if (arg2 < 0) {
                var47 -= arg2 * var9;
                var48 -= arg2 * var8;
                arg2 = 0;
            }
            int var49 = arg0 << 16;
            if (arg5 < 0) {
                var49 -= arg5 * var10;
                arg5 = 0;
            }
            if (arg2 != arg5 && var8 < var9 || arg2 == arg5 && var8 > var10) {
                int var50 = arg3 - arg5;
                int var51 = arg5 - arg2;
                int var52 = this.field7513 * arg2;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class131.method1048(84, 0, this.field7515, var52, var48 >> 16, var49 >> 16);
                            var52 += this.field7513;
                            var49 += var10;
                            var48 += var8;
                        }
                    }
                    class131.method1048(109, 0, this.field7515, var52, var48 >> 16, var47 >> 16);
                    var52 += this.field7513;
                    var47 += var9;
                    var48 += var8;
                }
            } else {
                int var53 = arg3 - arg5;
                int var54 = arg5 - arg2;
                int var55 = this.field7513 * arg2;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class131.method1048(arg6 - 29090, 0, this.field7515, var55, var49 >> 16, var48 >> 16);
                            var55 += this.field7513;
                            var48 += var8;
                            var49 += var10;
                        }
                    }
                    class131.method1048(116, 0, this.field7515, var55, var47 >> 16, var48 >> 16);
                    var48 += var8;
                    var47 += var9;
                    var55 += this.field7513;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg4 << 16;
            int var58 = arg1 << 16;
            if (arg2 < 0) {
                var57 -= arg2 * var8;
                var56 -= arg2 * var9;
                arg2 = 0;
            }
            if (arg3 < 0) {
                var58 -= arg3 * var10;
                arg3 = 0;
            }
            if (var9 <= var8) {
                int var59 = arg5 - arg3;
                int var60 = arg3 - arg2;
                int var61 = this.field7513 * arg2;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class131.method1048(98, 0, this.field7515, var61, var56 >> 16, var58 >> 16);
                            var56 += var9;
                            var61 += this.field7513;
                            var58 += var10;
                        }
                    }
                    class131.method1048(arg6 ^ 0x71B5, 0, this.field7515, var61, var56 >> 16, var57 >> 16);
                    var56 += var9;
                    var57 += var8;
                    var61 += this.field7513;
                }
            } else {
                int var62 = arg5 - arg3;
                int var63 = arg3 - arg2;
                int var64 = this.field7513 * arg2;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class131.method1048(arg6 - 29042, 0, this.field7515, var64, var58 >> 16, var56 >> 16);
                            var64 += this.field7513;
                            var56 += var9;
                            var58 += var10;
                        }
                    }
                    class131.method1048(arg6 ^ 0x7198, 0, this.field7515, var64, var57 >> 16, var56 >> 16);
                    var57 += var8;
                    var64 += this.field7513;
                    var56 += var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 440)
    public static void method3141(int arg0) {
        field7521 = null;
        if (arg0 != 19273) {
            method3142(4, null, 100, -55);
        }
        field7516 = null;
        field7520 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILaj;II)Lgfa;", line = 454)
    public static final class782 method3142(int arg0, class333 arg1, int arg2, int arg3) {
        field7511++;
        byte[] var4 = arg1.method2095(arg3, arg2, 1);
        if (var4 == null) {
            return null;
        } else {
            if (arg0 != 2085750768) {
                method3142(54, null, 64, -43);
            }
            return new class782(var4);
        }
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V", line = 473)
    public final void method3143(int arg0) {
        field7512++;
        int var2 = -1;
        int var3 = this.field7515.length - 8;
        if (arg0 < 59) {
            return;
        }
        while (var2 < var3) {
            var2++;
            this.field7515[var2] = 0;
            var2++;
            this.field7515[var2] = 0;
            var2++;
            this.field7515[var2] = 0;
            var2++;
            this.field7515[var2] = 0;
            var2++;
            this.field7515[var2] = 0;
            var2++;
            this.field7515[var2] = 0;
            var2++;
            this.field7515[var2] = 0;
            var2++;
            this.field7515[var2] = 0;
        }
        while (this.field7515.length - 1 > var2) {
            var2++;
            this.field7515[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V", line = 511)
    public final void method3144(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7508 = arg2;
        this.field7509 = arg4 - arg1;
        if (arg3 != -25483) {
            method3142(-38, null, 7, -119);
        }
        this.field7510 = arg1;
        this.field7513 = arg0 - arg2;
        field7514++;
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V", line = 530)
    public static final void method3145(byte arg0) {
        field7517++;
        if (arg0 > -19) {
            method3141(-33);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class220.field2986[var1] = false;
        }
        class540.field7343 = class718.field10019;
        class86.field1208 = class100.field1401;
        class629.field8803 = class253.field3733;
        class230.field3142 = 0;
        class502.field6938 = 5;
        class394.field5811 = 0;
        class60.field822 = class634.field8856;
        class523.field7177 = class405.field5867;
        class704.field9868 = -1;
        class518.field7072 = -1;
        class743.field10254 = class350.field5138;
        class421.field6033 = -1;
        class255.field3802 = -1;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lai;II)V", line = 567)
    public class558(class626 arg0, int arg1, int arg2) {
        this.field7515 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(III)Z", line = 578)
    public final boolean method3146(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method3145((byte) 6);
        }
        field7519++;
        return (arg0 * arg2) <= this.field7515.length;
    }
}
