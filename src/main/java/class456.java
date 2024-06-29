import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class456 {

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public int field6387;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "Z")
    public boolean field6398;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "Z")
    public boolean field6384;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "[S")
    public short[] field6379;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "I")
    private int field6400;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public int field6397;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    private int field6381;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    private int field6382;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    private int field6386;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    private int field6396;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "Lqm;")
    public class154 field6391;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "Lll;")
    public static class384 field6385;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILtd;Lwia;)V", line = 4)
    public static final void method2713(int arg0, class477 arg1, class791 arg2) {
        class145.field2120 = "";
        class767.field10554 = arg1;
        field6383++;
        class604.field8447 = arg2;
        if (class621.field8734.startsWith("win")) {
            class145.field2120 = class145.field2120 + "windows/";
        } else if (class621.field8734.startsWith("linux")) {
            class145.field2120 = class145.field2120 + "linux/";
        } else if (class621.field8734.startsWith("mac")) {
            class145.field2120 = class145.field2120 + "macos/";
        }
        if (class767.field10554.field6692) {
            class145.field2120 = class145.field2120 + "msjava/";
        } else if (class621.field8728.startsWith("amd64") || class621.field8728.startsWith("x86_64")) {
            class145.field2120 = class145.field2120 + "x86_64/";
        } else if (class621.field8728.startsWith("i386") || class621.field8728.startsWith("i486") || class621.field8728.startsWith("i586") || class621.field8728.startsWith("x86")) {
            class145.field2120 = class145.field2120 + "x86/";
        } else if (class621.field8728.startsWith("ppc")) {
            class145.field2120 = class145.field2120 + "ppc/";
        } else {
            class145.field2120 = class145.field2120 + "universal/";
        }
        if (arg0 != -1342073268) {
            method2722(null, (byte) -124, null);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lfb;BZII)V", line = 51)
    public static final void method2714(class702 arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field6390++;
        int var5 = arg0.field4670[0];
        int var6 = arg0.field4672[0];
        if (var5 < 0 || class768.field10571 <= var5 || var6 < 0 || class350.field4898 <= var6 || arg3 < 0 || arg3 >= class768.field10571 || arg4 < 0 || arg4 >= class350.field4898) {
            return;
        }
        int var7 = class460.method2734(-4, 0, 0, arg3, (byte) 55, class346.field4838[arg0.field5755], arg2, arg0.method2102(arg2), class347.field4858, var5, 0, 0, var6, class777.field10671, arg4);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg0.method3973(class347.field4858[var8], arg1, class777.field10671[var8], (byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)V", line = 91)
    public static final void method2715(int arg0, int arg1) {
        field6388++;
        class280.field4068 = arg1;
        class699.field9728.method3735(2);
        if (arg0 != 2048) {
            method2715(-79, 31);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZILha;III)V", line = 104)
    private final void method2716(int arg0, boolean arg1, int arg2, class65 arg3, int arg4, int arg5, int arg6) {
        this.field6391 = arg3.method439(arg4, arg5, arg2, arg6, arg0, 1.0F);
        if (arg1) {
            this.field6396 = -88;
        }
        field6394++;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V", line = 116)
    private final void method2717(byte arg0) {
        int var2 = -95 % ((arg0 + 16) / 56);
        int var3 = this.field6397;
        if (var3 == 2) {
            this.field6396 = 2048;
            this.field6381 = 1;
            this.field6382 = 0;
            this.field6386 = 2048;
        } else if (var3 == 3) {
            this.field6396 = 2048;
            this.field6381 = 1;
            this.field6382 = 0;
            this.field6386 = 4096;
        } else if (var3 == 4) {
            this.field6386 = 2048;
            this.field6382 = 0;
            this.field6381 = 4;
            this.field6396 = 2048;
        } else if (var3 == 5) {
            this.field6386 = 8192;
            this.field6382 = 0;
            this.field6381 = 4;
            this.field6396 = 2048;
        } else if (var3 == 12) {
            this.field6382 = 0;
            this.field6381 = 2;
            this.field6396 = 2048;
            this.field6386 = 2048;
        } else if (var3 == 13) {
            this.field6382 = 0;
            this.field6386 = 8192;
            this.field6381 = 2;
            this.field6396 = 2048;
        } else if (var3 == 10) {
            this.field6386 = 2048;
            this.field6382 = 1536;
            this.field6381 = 3;
            this.field6396 = 512;
        } else if (var3 == 11) {
            this.field6386 = 4096;
            this.field6382 = 1536;
            this.field6381 = 3;
            this.field6396 = 512;
        } else if (var3 == 6) {
            this.field6382 = 1280;
            this.field6381 = 3;
            this.field6396 = 768;
            this.field6386 = 2048;
        } else if (var3 == 7) {
            this.field6382 = 1280;
            this.field6381 = 3;
            this.field6386 = 4096;
            this.field6396 = 768;
        } else if (var3 == 8) {
            this.field6381 = 3;
            this.field6396 = 1024;
            this.field6386 = 2048;
            this.field6382 = 1024;
        } else if (var3 == 9) {
            this.field6381 = 3;
            this.field6382 = 1024;
            this.field6386 = 4096;
            this.field6396 = 1024;
        } else if (var3 == 14) {
            this.field6396 = 768;
            this.field6386 = 2048;
            this.field6381 = 1;
            this.field6382 = 1280;
        } else if (var3 == 15) {
            this.field6386 = 4096;
            this.field6382 = 1536;
            this.field6381 = 1;
            this.field6396 = 512;
        } else if (var3 == 16) {
            this.field6396 = 256;
            this.field6382 = 1792;
            this.field6386 = 8192;
            this.field6381 = 1;
        } else {
            this.field6396 = 2048;
            this.field6382 = 0;
            this.field6381 = 0;
            this.field6386 = 2048;
        }
        field6399++;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIIIBIII)Z", line = 316)
    public static final boolean method2718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field6393++;
        if (arg5 > 2000 || arg8 > 2000 || arg9 > 2000 || arg7 > 2000 || arg3 > 2000 || arg2 > 2000) {
            return false;
        } else if (arg5 >= -2000 && arg8 >= -2000 && arg9 >= -2000 && arg7 >= -2000 && arg3 >= -2000 && arg2 >= -2000) {
            if (class561.field7974 == 2) {
                int var10 = class476.field6672 * arg5 + arg7;
                if (var10 >= 0 && class485.field6828.length > var10 && class485.field6828[var10] > ((arg0 << 8) - 38400)) {
                    return false;
                }
                int var11 = class476.field6672 * arg8 + arg3;
                if (var11 >= 0 && var11 < class485.field6828.length && class485.field6828[var11] > ((arg4 << 8) - 38400)) {
                    return false;
                }
                int var12 = class476.field6672 * arg9 + arg2;
                if (var12 >= 0 && class485.field6828.length > var12 && ((arg1 << 8) - 38400) < class485.field6828[var12]) {
                    return false;
                }
            }
            int var13 = arg3 - arg7;
            int var14 = arg8 - arg5;
            int var15 = arg2 - arg7;
            int var16 = arg9 - arg5;
            int var17 = arg4 - arg0;
            int var18 = arg1 - arg0;
            if (arg8 > arg5 && arg9 > arg9) {
                if (arg8 > arg9) {
                    arg8++;
                } else {
                    arg9++;
                }
                arg5--;
            } else if (arg8 >= arg9) {
                if (arg5 <= arg8) {
                    arg8++;
                } else {
                    arg5++;
                }
                arg9--;
            } else {
                arg8--;
                if (arg5 > arg9) {
                    arg5++;
                } else {
                    arg9++;
                }
            }
            int var19 = 0;
            if (arg5 != arg8) {
                var19 = (arg3 - arg7 << 12) / (arg8 - arg5);
            }
            int var20 = 0;
            if (arg8 != arg9) {
                var20 = (arg2 - arg3 << 12) / (arg9 - arg8);
            }
            int var21 = 0;
            if (arg5 != arg9) {
                var21 = (arg7 - arg2 << 12) / (arg5 - arg9);
            }
            int var22 = var13 * var16 - (var14 * var15);
            if (var22 == 0) {
                return false;
            }
            int var23 = (var16 * var17 - (var14 * var18) << 8) / var22;
            int var24 = (var13 * var18 - var15 * var17 << 8) / var22;
            if (arg6 != 36) {
                method2714(null, (byte) -10, false, -9, -28);
            }
            if (arg5 <= arg8 && arg5 <= arg9) {
                if (arg5 >= class215.field3323) {
                    return true;
                }
                int var25 = (arg0 << 8) + var23 - arg7 * var23;
                if (class215.field3323 < arg9) {
                    arg9 = class215.field3323;
                }
                if (class215.field3323 < arg8) {
                    arg8 = class215.field3323;
                }
                if (arg8 >= arg9) {
                    int var26;
                    int var27 = var26 = arg7 << 12;
                    if (arg5 < 0) {
                        var26 -= arg5 * var19;
                        var25 -= arg5 * var24;
                        var27 -= arg5 * var21;
                        arg5 = 0;
                    }
                    int var28 = arg2 << 12;
                    if (arg9 < 0) {
                        var28 -= arg9 * var20;
                        arg9 = 0;
                    }
                    if (arg5 != arg9 && var21 < var19 || arg5 == arg9 && var20 > var19) {
                        int var29 = arg8 - arg9;
                        int var30 = arg9 - arg5;
                        int var31 = class476.field6672 * arg5;
                        while (true) {
                            var30--;
                            if (var30 < 0) {
                                while (true) {
                                    var29--;
                                    if (var29 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var26 >> 12) + 1, var31, var25, var23, 0, (var28 >> 12) - 1, -4, class485.field6828)) {
                                        return false;
                                    }
                                    var25 += var24;
                                    var26 += var19;
                                    var31 += class476.field6672;
                                    var28 += var20;
                                }
                            }
                            if (!class261.method1695((var26 >> 12) + 1, var31, var25, var23, 0, (var27 >> 12) - 1, arg6 + 48, class485.field6828)) {
                                return false;
                            }
                            var25 += var24;
                            var27 += var21;
                            var31 += class476.field6672;
                            var26 += var19;
                        }
                    } else {
                        int var32 = arg8 - arg9;
                        int var33 = arg9 - arg5;
                        int var34 = class476.field6672 * arg5;
                        while (true) {
                            var33--;
                            if (var33 < 0) {
                                while (true) {
                                    var32--;
                                    if (var32 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var28 >> 12) + 1, var34, var25, var23, 0, (var26 >> 12) - 1, 122, class485.field6828)) {
                                        return false;
                                    }
                                    var26 += var19;
                                    var28 += var20;
                                    var34 += class476.field6672;
                                    var25 += var24;
                                }
                            }
                            if (!class261.method1695((var27 >> 12) + 1, var34, var25, var23, 0, (var26 >> 12) - 1, arg6 ^ 0xFFFFFFA2, class485.field6828)) {
                                return false;
                            }
                            var25 += var24;
                            var34 += class476.field6672;
                            var26 += var19;
                            var27 += var21;
                        }
                    }
                } else {
                    int var35;
                    int var36 = var35 = arg7 << 12;
                    if (arg5 < 0) {
                        var25 -= arg5 * var24;
                        var35 -= arg5 * var19;
                        var36 -= arg5 * var21;
                        arg5 = 0;
                    }
                    int var37 = arg3 << 12;
                    if (arg8 < 0) {
                        var37 -= arg8 * var20;
                        arg8 = 0;
                    }
                    if ((arg5 == arg8 || var21 >= var19) && (arg5 != arg8 || var20 >= var21)) {
                        int var41 = arg9 - arg8;
                        int var42 = arg8 - arg5;
                        int var43 = class476.field6672 * arg5;
                        while (true) {
                            var42--;
                            if (var42 < 0) {
                                while (true) {
                                    var41--;
                                    if (var41 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var36 >> 12) + 1, var43, var25, var23, 0, (var37 >> 12) - 1, 16, class485.field6828)) {
                                        return false;
                                    }
                                    var36 += var21;
                                    var25 += var24;
                                    var37 += var20;
                                    var43 += class476.field6672;
                                }
                            }
                            if (!class261.method1695((var36 >> 12) + 1, var43, var25, var23, 0, (var35 >> 12) - 1, -117, class485.field6828)) {
                                return false;
                            }
                            var36 += var21;
                            var35 += var19;
                            var43 += class476.field6672;
                            var25 += var24;
                        }
                    } else {
                        int var38 = arg9 - arg8;
                        int var39 = arg8 - arg5;
                        int var40 = class476.field6672 * arg5;
                        while (true) {
                            var39--;
                            if (var39 < 0) {
                                while (true) {
                                    var38--;
                                    if (var38 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var37 >> 12) + 1, var40, var25, var23, 0, (var36 >> 12) - 1, arg6 ^ 0xFFFFFFBF, class485.field6828)) {
                                        return false;
                                    }
                                    var36 += var21;
                                    var25 += var24;
                                    var40 += class476.field6672;
                                    var37 += var20;
                                }
                            }
                            if (!class261.method1695((var35 >> 12) + 1, var40, var25, var23, 0, (var36 >> 12) - 1, -120, class485.field6828)) {
                                return false;
                            }
                            var35 += var19;
                            var36 += var21;
                            var40 += class476.field6672;
                            var25 += var24;
                        }
                    }
                }
            } else if (arg9 < arg8) {
                if (arg9 >= class215.field3323) {
                    return true;
                }
                if (class215.field3323 < arg8) {
                    arg8 = class215.field3323;
                }
                if (class215.field3323 < arg5) {
                    arg5 = class215.field3323;
                }
                int var44 = (arg1 << 8) + var23 - arg2 * var23;
                if (arg8 > arg5) {
                    int var45;
                    int var46 = var45 = arg2 << 12;
                    if (arg9 < 0) {
                        var45 -= arg9 * var21;
                        var46 -= arg9 * var20;
                        var44 -= arg9 * var24;
                        arg9 = 0;
                    }
                    int var47 = arg7 << 12;
                    if (arg5 < 0) {
                        var47 -= arg5 * var19;
                        arg5 = 0;
                    }
                    if (var20 < var21) {
                        int var48 = arg8 - arg5;
                        int var49 = arg5 - arg9;
                        int var50 = class476.field6672 * arg9;
                        while (true) {
                            var49--;
                            if (var49 < 0) {
                                while (true) {
                                    var48--;
                                    if (var48 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var47 >> 12) + 1, var50, var44, var23, 0, (var46 >> 12) - 1, 82, class485.field6828)) {
                                        return false;
                                    }
                                    var50 += class476.field6672;
                                    var44 += var24;
                                    var47 += var19;
                                    var46 += var20;
                                }
                            }
                            if (!class261.method1695((var45 >> 12) + 1, var50, var44, var23, 0, (var46 >> 12) - 1, 87, class485.field6828)) {
                                return false;
                            }
                            var45 += var21;
                            var50 += class476.field6672;
                            var46 += var20;
                            var44 += var24;
                        }
                    } else {
                        int var51 = arg8 - arg5;
                        int var52 = arg5 - arg9;
                        int var53 = class476.field6672 * arg9;
                        while (true) {
                            var52--;
                            if (var52 < 0) {
                                while (true) {
                                    var51--;
                                    if (var51 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var46 >> 12) + 1, var53, var44, var23, 0, (var47 >> 12) - 1, 103, class485.field6828)) {
                                        return false;
                                    }
                                    var47 += var19;
                                    var44 += var24;
                                    var46 += var20;
                                    var53 += class476.field6672;
                                }
                            }
                            if (!class261.method1695((var46 >> 12) + 1, var53, var44, var23, 0, (var45 >> 12) - 1, -108, class485.field6828)) {
                                return false;
                            }
                            var53 += class476.field6672;
                            var46 += var20;
                            var45 += var21;
                            var44 += var24;
                        }
                    }
                } else {
                    int var54;
                    int var55 = var54 = arg2 << 12;
                    int var56 = arg3 << 12;
                    if (arg9 < 0) {
                        var54 -= arg9 * var21;
                        var55 -= arg9 * var20;
                        var44 -= arg9 * var24;
                        arg9 = 0;
                    }
                    if (arg8 < 0) {
                        var56 -= arg8 * var19;
                        arg8 = 0;
                    }
                    if (var21 > var20) {
                        int var57 = arg5 - arg8;
                        int var58 = arg8 - arg9;
                        int var59 = class476.field6672 * arg9;
                        while (true) {
                            var58--;
                            if (var58 < 0) {
                                while (true) {
                                    var57--;
                                    if (var57 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var54 >> 12) + 1, var59, var44, var23, 0, (var56 >> 12) - 1, 54, class485.field6828)) {
                                        return false;
                                    }
                                    var59 += class476.field6672;
                                    var44 += var24;
                                    var54 += var21;
                                    var56 += var19;
                                }
                            }
                            if (!class261.method1695((var54 >> 12) + 1, var59, var44, var23, 0, (var55 >> 12) - 1, 59, class485.field6828)) {
                                return false;
                            }
                            var59 += class476.field6672;
                            var44 += var24;
                            var55 += var20;
                            var54 += var21;
                        }
                    } else {
                        int var60 = arg5 - arg8;
                        int var61 = arg8 - arg9;
                        int var62 = class476.field6672 * arg9;
                        while (true) {
                            var61--;
                            if (var61 < 0) {
                                while (true) {
                                    var60--;
                                    if (var60 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var56 >> 12) + 1, var62, var44, var23, 0, (var54 >> 12) - 1, -127, class485.field6828)) {
                                        return false;
                                    }
                                    var62 += class476.field6672;
                                    var44 += var24;
                                    var54 += var21;
                                    var56 += var19;
                                }
                            }
                            if (!class261.method1695((var55 >> 12) + 1, var62, var44, var23, 0, (var54 >> 12) - 1, -124, class485.field6828)) {
                                return false;
                            }
                            var44 += var24;
                            var62 += class476.field6672;
                            var55 += var20;
                            var54 += var21;
                        }
                    }
                }
            } else if (arg8 >= class215.field3323) {
                return true;
            } else {
                if (arg9 > class215.field3323) {
                    arg9 = class215.field3323;
                }
                if (arg5 > class215.field3323) {
                    arg5 = class215.field3323;
                }
                int var63 = (arg4 << 8) + (var23 - (arg3 * var23));
                if (arg5 <= arg9) {
                    int var64;
                    int var65 = var64 = arg3 << 12;
                    if (arg8 < 0) {
                        var65 -= arg8 * var19;
                        var63 -= arg8 * var24;
                        var64 -= arg8 * var20;
                        arg8 = 0;
                    }
                    int var66 = arg7 << 12;
                    if (arg5 < 0) {
                        var66 -= arg5 * var21;
                        arg5 = 0;
                    }
                    if (var19 < var20) {
                        int var67 = arg9 - arg5;
                        int var68 = arg5 - arg8;
                        int var69 = class476.field6672 * arg8;
                        while (true) {
                            var68--;
                            if (var68 < 0) {
                                while (true) {
                                    var67--;
                                    if (var67 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var64 >> 12) + 1, var69, var63, var23, 0, (var66 >> 12) - 1, 20, class485.field6828)) {
                                        return false;
                                    }
                                    var63 += var24;
                                    var69 += class476.field6672;
                                    var66 += var21;
                                    var64 += var20;
                                }
                            }
                            if (!class261.method1695((var64 >> 12) + 1, var69, var63, var23, 0, (var65 >> 12) - 1, -100, class485.field6828)) {
                                return false;
                            }
                            var64 += var20;
                            var69 += class476.field6672;
                            var63 += var24;
                            var65 += var19;
                        }
                    } else {
                        int var70 = arg9 - arg5;
                        int var71 = arg5 - arg8;
                        int var72 = class476.field6672 * arg8;
                        while (true) {
                            var71--;
                            if (var71 < 0) {
                                while (true) {
                                    var70--;
                                    if (var70 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var66 >> 12) + 1, var72, var63, var23, 0, (var64 >> 12) - 1, arg6 + -136, class485.field6828)) {
                                        return false;
                                    }
                                    var64 += var20;
                                    var72 += class476.field6672;
                                    var63 += var24;
                                    var66 += var21;
                                }
                            }
                            if (!class261.method1695((var65 >> 12) + 1, var72, var63, var23, 0, (var64 >> 12) - 1, 68, class485.field6828)) {
                                return false;
                            }
                            var63 += var24;
                            var65 += var19;
                            var64 += var20;
                            var72 += class476.field6672;
                        }
                    }
                } else {
                    int var73;
                    int var74 = var73 = arg3 << 12;
                    if (arg8 < 0) {
                        var63 -= arg8 * var24;
                        var73 -= arg8 * var20;
                        var74 -= arg8 * var19;
                        arg8 = 0;
                    }
                    int var75 = arg2 << 12;
                    if (arg9 < 0) {
                        var75 -= arg9 * var21;
                        arg9 = 0;
                    }
                    if ((arg8 == arg9 || var19 >= var20) && (arg8 != arg9 || var19 <= var21)) {
                        int var79 = arg5 - arg9;
                        int var80 = arg9 - arg8;
                        int var81 = class476.field6672 * arg8;
                        while (true) {
                            var80--;
                            if (var80 < 0) {
                                while (true) {
                                    var79--;
                                    if (var79 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var74 >> 12) + 1, var81, var63, var23, 0, (var75 >> 12) - 1, 34, class485.field6828)) {
                                        return false;
                                    }
                                    var75 += var21;
                                    var74 += var19;
                                    var63 += var24;
                                    var81 += class476.field6672;
                                }
                            }
                            if (!class261.method1695((var74 >> 12) + 1, var81, var63, var23, 0, (var73 >> 12) - 1, 57, class485.field6828)) {
                                return false;
                            }
                            var81 += class476.field6672;
                            var73 += var20;
                            var74 += var19;
                            var63 += var24;
                        }
                    } else {
                        int var76 = arg5 - arg9;
                        int var77 = arg9 - arg8;
                        int var78 = class476.field6672 * arg8;
                        while (true) {
                            var77--;
                            if (var77 < 0) {
                                while (true) {
                                    var76--;
                                    if (var76 < 0) {
                                        return true;
                                    }
                                    if (!class261.method1695((var75 >> 12) + 1, var78, var63, var23, 0, (var74 >> 12) - 1, -113, class485.field6828)) {
                                        return false;
                                    }
                                    var75 += var21;
                                    var74 += var19;
                                    var63 += var24;
                                    var78 += class476.field6672;
                                }
                            }
                            if (!class261.method1695((var73 >> 12) + 1, var78, var63, var23, 0, (var74 >> 12) - 1, 28, class485.field6828)) {
                                return false;
                            }
                            var74 += var19;
                            var78 += class476.field6672;
                            var63 += var24;
                            var73 += var20;
                        }
                    }
                }
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZII)V", line = 954)
    public final void method2719(boolean arg0, int arg1, int arg2) {
        if (arg2 < 78) {
            this.method2720(-17, 13, -21, 7, 103);
        }
        field6395++;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field6386 * arg1 / 50 + this.field6400 & 0x7FF;
            int var6 = this.field6381;
            if (var6 == 1) {
                var4 = (class376.field5186[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class756.field10433[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field6391.method1061((float) (this.field6382 + (this.field6396 * var4 >> 11)) / 2048.0F, 93);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIII)V", line = 1034)
    public final void method2720(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -669928756) {
            this.method2717((byte) 41);
        }
        this.field6382 = arg0;
        this.field6396 = arg2;
        this.field6381 = arg4;
        this.field6386 = arg1;
        field6380++;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)Z", line = 1050)
    public static final boolean method2721(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field6389++;
            return arg1 == 2 || arg1 == 3;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lwia;BLd;)V", line = 1066)
    public static final void method2722(class791 arg0, byte arg1, class160 arg2) {
        field6392++;
        if (arg1 > -93) {
            field6385 = null;
        }
        class96.field1096 = arg2;
        class602.field8439 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V", line = 1082)
    public static void method2723(int arg0) {
        field6385 = null;
        int var1 = -120 / ((arg0 - 51) / 63);
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V", line = 1092)
    protected class456() {
        if (class756.field10433 == null) {
            class353.method2249(-1950670936);
        }
        this.method2717((byte) -91);
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lha;Lso;I)V", line = 1102)
    public class456(class65 arg0, class494 arg1, int arg2) {
        if (class756.field10433 == null) {
            class353.method2249(-1950670936);
        }
        this.field6387 = arg1.method2964((byte) 107);
        this.field6398 = (this.field6387 & 0x8) != 0;
        this.field6384 = (this.field6387 & 0x10) != 0;
        this.field6387 &= 0x7;
        int var4 = arg1.method2998(true) << arg2;
        int var5 = arg1.method2998(true) << arg2;
        int var6 = arg1.method2998(true) << arg2;
        int var7 = arg1.method2964((byte) 115);
        int var8 = var7 * 2 + 1;
        this.field6379 = new short[var8];
        for (int var9 = 0; var9 < this.field6379.length; var9++) {
            short var13 = (short) arg1.method2998(true);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field6379[var9] = (short) class746.method4158(var15, var14 << 8);
        }
        int var10 = (var7 << class645.field9018) + class556.field7931;
        int var11 = class779.field10694 == null ? class2.field14[class22.method226(-1, arg1.method2998(true)) & 0xFFFF] : class779.field10694[arg1.method2998(true)];
        int var12 = arg1.method2964((byte) 76);
        this.field6400 = (var12 & 0xE0) << 3;
        this.field6397 = var12 & 0x1F;
        if (this.field6397 != 31) {
            this.method2717((byte) -91);
        }
        this.method2716(var11, false, var5, arg0, var4, var6, var10);
    }
}
