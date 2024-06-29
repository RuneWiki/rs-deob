import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class102 extends class120 {

    @OriginalMember(owner = "client!og", name = "A", descriptor = "[B")
    public byte[] field1095;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "Lcq;")
    public static class110 field1105 = new class110(36, 4);

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "Lal;")
    public static class307 field1107 = new class307();

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field1109 = 0;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "[[Lwp;")
    public static class452[][] field1106;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII)V")
    public final void method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1102++;
        int var8 = 0;
        if (arg6 >= -66) {
            return;
        }
        if (arg0 != arg3) {
            var8 = (arg5 - arg1 << 16) / (arg3 - arg0);
        }
        int var9 = 0;
        if (arg3 != arg4) {
            var9 = (arg2 - arg5 << 16) / (arg4 - arg3);
        }
        int var10 = 0;
        if (arg0 != arg4) {
            var10 = (arg1 - arg2 << 16) / (arg0 - arg4);
        }
        if (arg3 >= arg0 && arg4 >= arg0) {
            if (arg4 > arg3) {
                int var11;
                int var12 = var11 = arg1 << 16;
                if (arg0 < 0) {
                    var11 -= arg0 * var8;
                    var12 -= arg0 * var10;
                    arg0 = 0;
                }
                int var13 = arg5 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var9;
                    arg3 = 0;
                }
                if (arg0 != arg3 && var8 > var10 || arg0 == arg3 && var9 < var10) {
                    int var14 = arg4 - arg3;
                    int var15 = arg3 - arg0;
                    int var16 = this.field1096 * arg0;
                    while (true) {
                        var15--;
                        if (var15 < 0) {
                            while (true) {
                                var14--;
                                if (var14 < 0) {
                                    return;
                                }
                                class170.method928(0, var16, var12 >> 16, this.field1095, false, var13 >> 16);
                                var13 += var9;
                                var12 += var10;
                                var16 += this.field1096;
                            }
                        }
                        class170.method928(0, var16, var12 >> 16, this.field1095, false, var11 >> 16);
                        var11 += var8;
                        var12 += var10;
                        var16 += this.field1096;
                    }
                } else {
                    int var17 = arg4 - arg3;
                    int var18 = arg3 - arg0;
                    int var19 = this.field1096 * arg0;
                    while (true) {
                        var18--;
                        if (var18 < 0) {
                            while (true) {
                                var17--;
                                if (var17 < 0) {
                                    return;
                                }
                                class170.method928(0, var19, var13 >> 16, this.field1095, false, var12 >> 16);
                                var19 += this.field1096;
                                var12 += var10;
                                var13 += var9;
                            }
                        }
                        class170.method928(0, var19, var11 >> 16, this.field1095, false, var12 >> 16);
                        var19 += this.field1096;
                        var12 += var10;
                        var11 += var8;
                    }
                }
            } else {
                int var20;
                int var21 = var20 = arg1 << 16;
                int var22 = arg2 << 16;
                if (arg0 < 0) {
                    var21 -= arg0 * var10;
                    var20 -= arg0 * var8;
                    arg0 = 0;
                }
                if (arg4 < 0) {
                    var22 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 != arg4 && var10 < var8 || arg0 == arg4 && var8 < var9) {
                    int var23 = arg3 - arg4;
                    int var24 = arg4 - arg0;
                    int var25 = this.field1096 * arg0;
                    while (true) {
                        var24--;
                        if (var24 < 0) {
                            while (true) {
                                var23--;
                                if (var23 < 0) {
                                    return;
                                }
                                class170.method928(0, var25, var22 >> 16, this.field1095, false, var20 >> 16);
                                var22 += var9;
                                var25 += this.field1096;
                                var20 += var8;
                            }
                        }
                        class170.method928(0, var25, var21 >> 16, this.field1095, false, var20 >> 16);
                        var20 += var8;
                        var25 += this.field1096;
                        var21 += var10;
                    }
                } else {
                    int var26 = arg3 - arg4;
                    int var27 = arg4 - arg0;
                    int var28 = this.field1096 * arg0;
                    while (true) {
                        var27--;
                        if (var27 < 0) {
                            while (true) {
                                var26--;
                                if (var26 < 0) {
                                    return;
                                }
                                class170.method928(0, var28, var20 >> 16, this.field1095, false, var22 >> 16);
                                var28 += this.field1096;
                                var20 += var8;
                                var22 += var9;
                            }
                        }
                        class170.method928(0, var28, var20 >> 16, this.field1095, false, var21 >> 16);
                        var28 += this.field1096;
                        var20 += var8;
                        var21 += var10;
                    }
                }
            }
        } else if (arg3 > arg4) {
            if (arg3 > arg0) {
                int var29;
                int var30 = var29 = arg2 << 16;
                int var31 = arg1 << 16;
                if (arg4 < 0) {
                    var29 -= arg4 * var10;
                    var30 -= arg4 * var9;
                    arg4 = 0;
                }
                if (arg0 < 0) {
                    var31 -= arg0 * var8;
                    arg0 = 0;
                }
                if (var9 < var10) {
                    int var32 = arg3 - arg0;
                    int var33 = arg0 - arg4;
                    int var34 = this.field1096 * arg4;
                    while (true) {
                        var33--;
                        if (var33 < 0) {
                            while (true) {
                                var32--;
                                if (var32 < 0) {
                                    return;
                                }
                                class170.method928(0, var34, var30 >> 16, this.field1095, false, var31 >> 16);
                                var31 += var8;
                                var34 += this.field1096;
                                var30 += var9;
                            }
                        }
                        class170.method928(0, var34, var30 >> 16, this.field1095, false, var29 >> 16);
                        var34 += this.field1096;
                        var30 += var9;
                        var29 += var10;
                    }
                } else {
                    int var35 = arg3 - arg0;
                    int var36 = arg0 - arg4;
                    int var37 = this.field1096 * arg4;
                    while (true) {
                        var36--;
                        if (var36 < 0) {
                            while (true) {
                                var35--;
                                if (var35 < 0) {
                                    return;
                                }
                                class170.method928(0, var37, var31 >> 16, this.field1095, false, var30 >> 16);
                                var31 += var8;
                                var37 += this.field1096;
                                var30 += var9;
                            }
                        }
                        class170.method928(0, var37, var29 >> 16, this.field1095, false, var30 >> 16);
                        var37 += this.field1096;
                        var30 += var9;
                        var29 += var10;
                    }
                }
            } else {
                int var38;
                int var39 = var38 = arg2 << 16;
                if (arg4 < 0) {
                    var38 -= arg4 * var10;
                    var39 -= arg4 * var9;
                    arg4 = 0;
                }
                int var40 = arg5 << 16;
                if (arg3 < 0) {
                    var40 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var10 <= var9) {
                    int var41 = arg0 - arg3;
                    int var42 = arg3 - arg4;
                    int var43 = this.field1096 * arg4;
                    while (true) {
                        var42--;
                        if (var42 < 0) {
                            while (true) {
                                var41--;
                                if (var41 < 0) {
                                    return;
                                }
                                class170.method928(0, var43, var38 >> 16, this.field1095, false, var40 >> 16);
                                var38 += var10;
                                var43 += this.field1096;
                                var40 += var8;
                            }
                        }
                        class170.method928(0, var43, var38 >> 16, this.field1095, false, var39 >> 16);
                        var43 += this.field1096;
                        var38 += var10;
                        var39 += var9;
                    }
                } else {
                    int var44 = arg0 - arg3;
                    int var45 = arg3 - arg4;
                    int var46 = this.field1096 * arg4;
                    while (true) {
                        var45--;
                        if (var45 < 0) {
                            while (true) {
                                var44--;
                                if (var44 < 0) {
                                    return;
                                }
                                class170.method928(0, var46, var40 >> 16, this.field1095, false, var38 >> 16);
                                var38 += var10;
                                var46 += this.field1096;
                                var40 += var8;
                            }
                        }
                        class170.method928(0, var46, var39 >> 16, this.field1095, false, var38 >> 16);
                        var46 += this.field1096;
                        var38 += var10;
                        var39 += var9;
                    }
                }
            }
        } else if (arg0 <= arg4) {
            int var47;
            int var48 = var47 = arg5 << 16;
            int var49 = arg1 << 16;
            if (arg3 < 0) {
                var48 -= arg3 * var8;
                var47 -= arg3 * var9;
                arg3 = 0;
            }
            if (arg0 < 0) {
                var49 -= arg0 * var10;
                arg0 = 0;
            }
            if (var8 >= var9) {
                int var50 = arg4 - arg0;
                int var51 = arg0 - arg3;
                int var52 = this.field1096 * arg3;
                while (true) {
                    var51--;
                    if (var51 < 0) {
                        while (true) {
                            var50--;
                            if (var50 < 0) {
                                return;
                            }
                            class170.method928(0, var52, var47 >> 16, this.field1095, false, var49 >> 16);
                            var52 += this.field1096;
                            var47 += var9;
                            var49 += var10;
                        }
                    }
                    class170.method928(0, var52, var47 >> 16, this.field1095, false, var48 >> 16);
                    var48 += var8;
                    var47 += var9;
                    var52 += this.field1096;
                }
            } else {
                int var53 = arg4 - arg0;
                int var54 = arg0 - arg3;
                int var55 = this.field1096 * arg3;
                while (true) {
                    var54--;
                    if (var54 < 0) {
                        while (true) {
                            var53--;
                            if (var53 < 0) {
                                return;
                            }
                            class170.method928(0, var55, var49 >> 16, this.field1095, false, var47 >> 16);
                            var47 += var9;
                            var55 += this.field1096;
                            var49 += var10;
                        }
                    }
                    class170.method928(0, var55, var48 >> 16, this.field1095, false, var47 >> 16);
                    var47 += var9;
                    var55 += this.field1096;
                    var48 += var8;
                }
            }
        } else {
            int var56;
            int var57 = var56 = arg5 << 16;
            if (arg3 < 0) {
                var57 -= arg3 * var8;
                var56 -= arg3 * var9;
                arg3 = 0;
            }
            int var58 = arg2 << 16;
            if (arg4 < 0) {
                var58 -= arg4 * var10;
                arg4 = 0;
            }
            if (arg3 != arg4 && var9 > var8 || arg3 == arg4 && var8 > var10) {
                int var59 = arg0 - arg4;
                int var60 = arg4 - arg3;
                int var61 = this.field1096 * arg3;
                while (true) {
                    var60--;
                    if (var60 < 0) {
                        while (true) {
                            var59--;
                            if (var59 < 0) {
                                return;
                            }
                            class170.method928(0, var61, var57 >> 16, this.field1095, false, var58 >> 16);
                            var57 += var8;
                            var58 += var10;
                            var61 += this.field1096;
                        }
                    }
                    class170.method928(0, var61, var57 >> 16, this.field1095, false, var56 >> 16);
                    var57 += var8;
                    var61 += this.field1096;
                    var56 += var9;
                }
            } else {
                int var62 = arg0 - arg4;
                int var63 = arg4 - arg3;
                int var64 = this.field1096 * arg3;
                while (true) {
                    var63--;
                    if (var63 < 0) {
                        while (true) {
                            var62--;
                            if (var62 < 0) {
                                return;
                            }
                            class170.method928(0, var64, var58 >> 16, this.field1095, false, var57 >> 16);
                            var58 += var10;
                            var57 += var8;
                            var64 += this.field1096;
                        }
                    }
                    class170.method928(0, var64, var56 >> 16, this.field1095, false, var57 >> 16);
                    var56 += var9;
                    var64 += this.field1096;
                    var57 += var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
    public final boolean method551(int arg0, int arg1, int arg2) {
        if (arg2 != -23345) {
            method552(-83);
        }
        field1098++;
        return (arg0 * arg1) <= this.field1095.length;
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
    public static void method552(int arg0) {
        if (arg0 == -32633) {
            field1105 = null;
            field1106 = null;
            field1107 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V")
    public final void method553(byte arg0) {
        if (arg0 > -99) {
            this.field1104 = -121;
        }
        field1099++;
        int var2 = -1;
        int var3 = this.field1095.length - 8;
        while (var2 < var3) {
            var2++;
            this.field1095[var2] = 0;
            var2++;
            this.field1095[var2] = 0;
            var2++;
            this.field1095[var2] = 0;
            var2++;
            this.field1095[var2] = 0;
            var2++;
            this.field1095[var2] = 0;
            var2++;
            this.field1095[var2] = 0;
            var2++;
            this.field1095[var2] = 0;
            var2++;
            this.field1095[var2] = 0;
        }
        while ((this.field1095.length - 1) > var2) {
            var2++;
            this.field1095[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lpi;Ltf;I)V")
    public static final void method554(class464 arg0, class701 arg1, int arg2) {
        field1108++;
        class316.field3928 = arg1;
        class79.field809 = "";
        class474.field6836 = arg0;
        if (class378.field5122.startsWith("win")) {
            class79.field809 = class79.field809 + "windows/";
        } else if (class378.field5122.startsWith("linux")) {
            class79.field809 = class79.field809 + "linux/";
        } else if (class378.field5122.startsWith("mac")) {
            class79.field809 = class79.field809 + "macos/";
        }
        if (arg2 < 16) {
            field1109 = 7;
        }
        if (class474.field6836.field6611) {
            class79.field809 = class79.field809 + "msjava/";
        } else if (class378.field5123.startsWith("amd64") || class378.field5123.startsWith("x86_64")) {
            class79.field809 = class79.field809 + "x86_64/";
        } else if (class378.field5123.startsWith("i386") || class378.field5123.startsWith("i486") || class378.field5123.startsWith("i586") || class378.field5123.startsWith("x86")) {
            class79.field809 = class79.field809 + "x86/";
        } else if (class378.field5123.startsWith("ppc")) {
            class79.field809 = class79.field809 + "ppc/";
        } else {
            class79.field809 = class79.field809 + "universal/";
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lvj;II)V")
    public class102(class422 arg0, int arg1, int arg2) {
        this.field1095 = new byte[arg1 * arg2];
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(III)Z")
    public static final boolean method555(int arg0, int arg1, int arg2) {
        field1103++;
        if (arg0 > -99) {
            field1107 = null;
        }
        if (class674.method3722(arg2, arg1, (byte) -34)) {
            return (arg2 & 0xB000) != 0 | class427.method2468(-1, arg1, arg2) | class480.method2764(arg1, (byte) -1, arg2) ? true : (arg1 & 0x37) == 0 & (class600.method3366(arg1, arg2, -1) | class619.method3452(true, arg1, arg2));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
    public final void method556(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1096 = arg1 - arg2;
        int var6 = 60 / ((54 - arg0) / 57);
        this.field1101 = arg3 - arg4;
        this.field1097 = arg4;
        field1100++;
        this.field1104 = arg2;
    }
}
