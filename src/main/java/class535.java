import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class535 extends class31 {

    @OriginalMember(owner = "client!kr", name = "H", descriptor = "[B")
    public byte[] field7836;

    @OriginalMember(owner = "client!kr", name = "I", descriptor = "Z")
    public static boolean field7837 = false;

    @OriginalMember(owner = "client!kr", name = "Q", descriptor = "[I")
    public static int[] field7845 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    public int field7833;

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
    public int field7835;

    @OriginalMember(owner = "client!kr", name = "J", descriptor = "I")
    public static int field7838;

    @OriginalMember(owner = "client!kr", name = "K", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!kr", name = "L", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!kr", name = "M", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!kr", name = "N", descriptor = "I")
    public int field7842;

    @OriginalMember(owner = "client!kr", name = "O", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!kr", name = "P", descriptor = "I")
    public int field7844;

    @OriginalMember(owner = "client!kr", name = "S", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!kr", name = "R", descriptor = "Loi;")
    public static class53 field7846;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(BLjava/lang/String;)V", line = 3)
    public static final void method3144(byte arg0, String arg1) {
        field7847++;
        if (!class427.field6024) {
            return;
        }
        if (arg0 < 105) {
            field7846 = null;
        }
        boolean var2 = false;
        int var3 = class144.field1908;
        int[] var4 = class521.field7674;
        for (int var5 = 0; var5 < var3; var5++) {
            class22 var6 = class378.field5355[var4[var5]];
            if (var6 != null && class246.field3587 != var6 && var6.field256 != null && var6.field256.equalsIgnoreCase(arg1)) {
                class234.field3413++;
                class61.method498(class329.field4794, 1);
                class30.field357.method2321(0, -74);
                class30.field357.method2372(var4[var5], 82);
                class30.field357.method2336(class483.field6724, -116);
                class30.field357.method2336(class235.field3424, -125);
                class30.field357.method2327((byte) -30, class231.field3397);
                class110.method754(-2, var6.method125((byte) -96), true, 0, 0, var6.field3378[0], var6.method125((byte) -127), 66, var6.field3368[0]);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class486.method2802(class395.field5612.method3116(class149.field1979, (byte) 112) + arg1, (byte) 114);
        }
        if (class427.field6024) {
            class235.method1439(-102);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIB)Z", line = 63)
    public final boolean method3145(int arg0, int arg1, byte arg2) {
        field7843++;
        if (arg2 < 64) {
            return true;
        } else {
            return (arg0 * arg1) <= this.field7836.length;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 76)
    public final void method3146(int arg0) {
        field7841++;
        int var2 = -1;
        if (arg0 != 2084241616) {
            field7846 = null;
        }
        int var3 = this.field7836.length - 8;
        while (var2 < var3) {
            var2++;
            this.field7836[var2] = 0;
            var2++;
            this.field7836[var2] = 0;
            var2++;
            this.field7836[var2] = 0;
            var2++;
            this.field7836[var2] = 0;
            var2++;
            this.field7836[var2] = 0;
            var2++;
            this.field7836[var2] = 0;
            var2++;
            this.field7836[var2] = 0;
            var2++;
            this.field7836[var2] = 0;
        }
        while ((this.field7836.length - 1) > var2) {
            var2++;
            this.field7836[var2] = 0;
        }
    }

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)I", line = 107)
    public static final int method3147(int arg0) {
        if (arg0 > -69) {
            field7845 = null;
        }
        field7840++;
        return 16;
    }

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "(I)V", line = 121)
    public static void method3148(int arg0) {
        field7846 = null;
        field7845 = null;
        if (arg0 != 0) {
            field7837 = false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lir;ZB)V", line = 133)
    public static final void method3149(class22 arg0, boolean arg1, byte arg2) {
        field7838++;
        if (class37.field408 >= 400) {
            return;
        }
        int var3 = 77 % ((33 - arg2) / 35);
        if (class246.field3587 != arg0) {
            String var10;
            if (arg0.field247 == 0) {
                boolean var4 = true;
                if (class246.field3587.field241 != -1 && arg0.field241 != -1) {
                    int var5 = class246.field3587.field268 <= arg0.field268 ? arg0.field268 : class246.field3587.field268;
                    int var6 = arg0.field241 <= class246.field3587.field241 ? arg0.field241 : class246.field3587.field241;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class246.field3587.field268 - arg0.field268;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class71.field886 == class246.field3594 ? class325.field4739.method3116(class149.field1979, (byte) 117) : class256.field3785.method3116(class149.field1979, (byte) 127);
                if (arg0.field281 > arg0.field268) {
                    var10 = arg0.method137(true, -20951) + (var4 ? class460.method2681(arg0.field268, false, class246.field3587.field268) : "<col=ffffff>") + " (" + var9 + arg0.field268 + "+" + (arg0.field281 - arg0.field268) + ")";
                } else {
                    var10 = arg0.method137(true, -20951) + (var4 ? class460.method2681(arg0.field268, false, class246.field3587.field268) : "<col=ffffff>") + " (" + var9 + arg0.field268 + ")";
                }
            } else {
                var10 = arg0.method137(true, -20951) + " (" + class494.field6978.method3116(class149.field1979, (byte) 121) + arg0.field247 + ")";
            }
            if (class427.field6024) {
                if (!arg1 && (class180.field2579 & 0x8) != 0) {
                    class509.method3042((long) arg0.field3289, class380.field5366, 6, class431.field6089 + " -> <col=ffffff>" + var10, 0, class474.field6601, false, 0, 12, true, -1);
                    class267.field3897++;
                }
            } else if (arg1) {
                class509.method3042(0L, "<col=cccccc>" + var10, 6, "", 0, -1, true, 0, -1, false, 0);
            } else {
                for (int var11 = 7; var11 >= 0; var11--) {
                    if (class447.field6239[var11] != null) {
                        short var12 = 0;
                        if (class519.field7646 == class246.field3594 && class447.field6239[var11].equalsIgnoreCase(class257.field3829.method3116(class149.field1979, (byte) 120))) {
                            if (class246.field3587.field268 < arg0.field268) {
                                var12 = 2000;
                            }
                            if (class246.field3587.field269 != 0 && arg0.field269 != 0) {
                                if (class246.field3587.field269 == arg0.field269) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class279.field4123[var11]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class288.field4217[var11] + var12);
                        int var14 = class208.field3021[var11] == -1 ? class71.field885 : class208.field3021[var11];
                        class268.field3905++;
                        class509.method3042((long) arg0.field3289, class447.field6239[var11], 6, "<col=ffffff>" + var10, 0, var14, false, 0, var13, true, -1);
                    }
                }
            }
            if (!arg1) {
                for (class214 var15 = (class214) class363.field5190.method2655(15152); var15 != null; var15 = (class214) class363.field5190.method2660((byte) 67)) {
                    if (var15.field3094 == 6) {
                        var15.field3098 = "<col=ffffff>" + var10;
                        return;
                    }
                }
            }
        } else if (class427.field6024 && (class180.field2579 & 0x10) != 0) {
            class368.field5251++;
            class509.method3042(0L, class380.field5366, 6, class431.field6089 + " -> <col=ffffff>" + class405.field5740.method3116(class149.field1979, (byte) 102), 0, class474.field6601, false, 0, 44, true, -1);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBIII)V", line = 283)
    public final void method3150(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 125) {
            return;
        }
        this.field7833 = arg2;
        this.field7835 = arg3;
        this.field7842 = arg0 - arg3;
        this.field7844 = arg4 - arg2;
        field7834++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BIIIIII)V", line = 302)
    public final void method3151(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7839++;
        int var8 = 0;
        int var9 = -120 % ((-arg0 - 2) / 39);
        if (arg1 != arg3) {
            var8 = (arg4 - arg2 << 16) / (arg1 - arg3);
        }
        int var10 = 0;
        if (arg1 != arg5) {
            var10 = (arg6 - arg4 << 16) / (arg5 - arg1);
        }
        int var11 = 0;
        if (arg3 != arg5) {
            var11 = (arg2 - arg6 << 16) / (arg3 - arg5);
        }
        if (arg1 >= arg3 && arg5 >= arg3) {
            if (arg5 <= arg1) {
                int var12;
                int var13 = var12 = arg2 << 16;
                if (arg3 < 0) {
                    var13 -= arg3 * var11;
                    var12 -= arg3 * var8;
                    arg3 = 0;
                }
                int var14 = arg6 << 16;
                if (arg5 < 0) {
                    var14 -= arg5 * var10;
                    arg5 = 0;
                }
                if ((arg3 == arg5 || var8 <= var11) && (arg3 != arg5 || var8 >= var10)) {
                    int var18 = arg1 - arg5;
                    int var19 = arg5 - arg3;
                    int var20 = this.field7844 * arg3;
                    while (true) {
                        var19--;
                        if (var19 < 0) {
                            while (true) {
                                var18--;
                                if (var18 < 0) {
                                    return;
                                }
                                class206.method1315(var20, var14 >> 16, 123, this.field7836, var12 >> 16, 0);
                                var14 += var10;
                                var12 += var8;
                                var20 += this.field7844;
                            }
                        }
                        class206.method1315(var20, var13 >> 16, 4, this.field7836, var12 >> 16, 0);
                        var20 += this.field7844;
                        var12 += var8;
                        var13 += var11;
                    }
                } else {
                    int var15 = arg1 - arg5;
                    int var16 = arg5 - arg3;
                    int var17 = this.field7844 * arg3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            while (true) {
                                var15--;
                                if (var15 < 0) {
                                    return;
                                }
                                class206.method1315(var17, var12 >> 16, -79, this.field7836, var14 >> 16, 0);
                                var17 += this.field7844;
                                var14 += var10;
                                var12 += var8;
                            }
                        }
                        class206.method1315(var17, var12 >> 16, 12, this.field7836, var13 >> 16, 0);
                        var13 += var11;
                        var17 += this.field7844;
                        var12 += var8;
                    }
                }
            } else {
                int var21;
                int var22 = var21 = arg2 << 16;
                if (arg3 < 0) {
                    var22 -= arg3 * var11;
                    var21 -= arg3 * var8;
                    arg3 = 0;
                }
                int var23 = arg4 << 16;
                if (arg1 < 0) {
                    var23 -= arg1 * var10;
                    arg1 = 0;
                }
                if (arg1 != arg3 && var11 < var8 || arg1 == arg3 && var11 > var10) {
                    int var24 = arg5 - arg1;
                    int var25 = arg1 - arg3;
                    int var26 = this.field7844 * arg3;
                    while (true) {
                        var25--;
                        if (var25 < 0) {
                            while (true) {
                                var24--;
                                if (var24 < 0) {
                                    return;
                                }
                                class206.method1315(var26, var23 >> 16, 31, this.field7836, var22 >> 16, 0);
                                var26 += this.field7844;
                                var22 += var11;
                                var23 += var10;
                            }
                        }
                        class206.method1315(var26, var21 >> 16, -100, this.field7836, var22 >> 16, 0);
                        var26 += this.field7844;
                        var21 += var8;
                        var22 += var11;
                    }
                } else {
                    int var27 = arg5 - arg1;
                    int var28 = arg1 - arg3;
                    int var29 = this.field7844 * arg3;
                    while (true) {
                        var28--;
                        if (var28 < 0) {
                            while (true) {
                                var27--;
                                if (var27 < 0) {
                                    return;
                                }
                                class206.method1315(var29, var22 >> 16, -74, this.field7836, var23 >> 16, 0);
                                var23 += var10;
                                var29 += this.field7844;
                                var22 += var11;
                            }
                        }
                        class206.method1315(var29, var22 >> 16, -60, this.field7836, var21 >> 16, 0);
                        var29 += this.field7844;
                        var21 += var8;
                        var22 += var11;
                    }
                }
            }
        } else if (arg5 < arg1) {
            if (arg1 <= arg3) {
                int var30;
                int var31 = var30 = arg6 << 16;
                if (arg5 < 0) {
                    var30 -= arg5 * var11;
                    var31 -= arg5 * var10;
                    arg5 = 0;
                }
                int var32 = arg4 << 16;
                if (arg1 < 0) {
                    var32 -= arg1 * var8;
                    arg1 = 0;
                }
                if (var11 <= var10) {
                    int var33 = arg3 - arg1;
                    int var34 = arg1 - arg5;
                    int var35 = this.field7844 * arg5;
                    while (true) {
                        var34--;
                        if (var34 < 0) {
                            while (true) {
                                var33--;
                                if (var33 < 0) {
                                    return;
                                }
                                class206.method1315(var35, var32 >> 16, -94, this.field7836, var30 >> 16, 0);
                                var32 += var8;
                                var30 += var11;
                                var35 += this.field7844;
                            }
                        }
                        class206.method1315(var35, var31 >> 16, 23, this.field7836, var30 >> 16, 0);
                        var35 += this.field7844;
                        var30 += var11;
                        var31 += var10;
                    }
                } else {
                    int var36 = arg3 - arg1;
                    int var37 = arg1 - arg5;
                    int var38 = this.field7844 * arg5;
                    while (true) {
                        var37--;
                        if (var37 < 0) {
                            while (true) {
                                var36--;
                                if (var36 < 0) {
                                    return;
                                }
                                class206.method1315(var38, var30 >> 16, 126, this.field7836, var32 >> 16, 0);
                                var30 += var11;
                                var38 += this.field7844;
                                var32 += var8;
                            }
                        }
                        class206.method1315(var38, var30 >> 16, 124, this.field7836, var31 >> 16, 0);
                        var30 += var11;
                        var31 += var10;
                        var38 += this.field7844;
                    }
                }
            } else {
                int var39;
                int var40 = var39 = arg6 << 16;
                int var41 = arg2 << 16;
                if (arg5 < 0) {
                    var40 -= arg5 * var10;
                    var39 -= arg5 * var11;
                    arg5 = 0;
                }
                if (arg3 < 0) {
                    var41 -= arg3 * var8;
                    arg3 = 0;
                }
                if (var11 <= var10) {
                    int var42 = arg1 - arg3;
                    int var43 = arg3 - arg5;
                    int var44 = this.field7844 * arg5;
                    while (true) {
                        var43--;
                        if (var43 < 0) {
                            while (true) {
                                var42--;
                                if (var42 < 0) {
                                    return;
                                }
                                class206.method1315(var44, var40 >> 16, 125, this.field7836, var41 >> 16, 0);
                                var44 += this.field7844;
                                var40 += var10;
                                var41 += var8;
                            }
                        }
                        class206.method1315(var44, var40 >> 16, -127, this.field7836, var39 >> 16, 0);
                        var39 += var11;
                        var40 += var10;
                        var44 += this.field7844;
                    }
                } else {
                    int var45 = arg1 - arg3;
                    int var46 = arg3 - arg5;
                    int var47 = this.field7844 * arg5;
                    while (true) {
                        var46--;
                        if (var46 < 0) {
                            while (true) {
                                var45--;
                                if (var45 < 0) {
                                    return;
                                }
                                class206.method1315(var47, var41 >> 16, 123, this.field7836, var40 >> 16, 0);
                                var41 += var8;
                                var47 += this.field7844;
                                var40 += var10;
                            }
                        }
                        class206.method1315(var47, var39 >> 16, -112, this.field7836, var40 >> 16, 0);
                        var47 += this.field7844;
                        var40 += var10;
                        var39 += var11;
                    }
                }
            }
        } else if (arg3 <= arg5) {
            int var48;
            int var49 = var48 = arg4 << 16;
            int var50 = arg2 << 16;
            if (arg1 < 0) {
                var48 -= arg1 * var10;
                var49 -= arg1 * var8;
                arg1 = 0;
            }
            if (arg3 < 0) {
                var50 -= arg3 * var11;
                arg3 = 0;
            }
            if (var10 > var8) {
                int var51 = arg5 - arg3;
                int var52 = arg3 - arg1;
                int var53 = this.field7844 * arg1;
                while (true) {
                    var52--;
                    if (var52 < 0) {
                        while (true) {
                            var51--;
                            if (var51 < 0) {
                                return;
                            }
                            class206.method1315(var53, var48 >> 16, 8, this.field7836, var50 >> 16, 0);
                            var50 += var11;
                            var53 += this.field7844;
                            var48 += var10;
                        }
                    }
                    class206.method1315(var53, var48 >> 16, -5, this.field7836, var49 >> 16, 0);
                    var53 += this.field7844;
                    var49 += var8;
                    var48 += var10;
                }
            } else {
                int var54 = arg5 - arg3;
                int var55 = arg3 - arg1;
                int var56 = this.field7844 * arg1;
                while (true) {
                    var55--;
                    if (var55 < 0) {
                        while (true) {
                            var54--;
                            if (var54 < 0) {
                                return;
                            }
                            class206.method1315(var56, var50 >> 16, 123, this.field7836, var48 >> 16, 0);
                            var48 += var10;
                            var56 += this.field7844;
                            var50 += var11;
                        }
                    }
                    class206.method1315(var56, var49 >> 16, 125, this.field7836, var48 >> 16, 0);
                    var48 += var10;
                    var56 += this.field7844;
                    var49 += var8;
                }
            }
        } else {
            int var57;
            int var58 = var57 = arg4 << 16;
            if (arg1 < 0) {
                var58 -= arg1 * var8;
                var57 -= arg1 * var10;
                arg1 = 0;
            }
            int var59 = arg6 << 16;
            if (arg5 < 0) {
                var59 -= arg5 * var11;
                arg5 = 0;
            }
            if (arg1 != arg5 && var8 < var10 || arg1 == arg5 && var11 < var8) {
                int var60 = arg3 - arg5;
                int var61 = arg5 - arg1;
                int var62 = this.field7844 * arg1;
                while (true) {
                    var61--;
                    if (var61 < 0) {
                        while (true) {
                            var60--;
                            if (var60 < 0) {
                                return;
                            }
                            class206.method1315(var62, var59 >> 16, 123, this.field7836, var58 >> 16, 0);
                            var58 += var8;
                            var59 += var11;
                            var62 += this.field7844;
                        }
                    }
                    class206.method1315(var62, var57 >> 16, -5, this.field7836, var58 >> 16, 0);
                    var62 += this.field7844;
                    var58 += var8;
                    var57 += var10;
                }
            } else {
                int var63 = arg3 - arg5;
                int var64 = arg5 - arg1;
                int var65 = this.field7844 * arg1;
                while (true) {
                    var64--;
                    if (var64 < 0) {
                        while (true) {
                            var63--;
                            if (var63 < 0) {
                                return;
                            }
                            class206.method1315(var65, var58 >> 16, 127, this.field7836, var59 >> 16, 0);
                            var58 += var8;
                            var65 += this.field7844;
                            var59 += var11;
                        }
                    }
                    class206.method1315(var65, var58 >> 16, -69, this.field7836, var57 >> 16, 0);
                    var58 += var8;
                    var65 += this.field7844;
                    var57 += var10;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lih;II)V", line = 746)
    public class535(class503 arg0, int arg1, int arg2) {
        this.field7836 = new byte[arg1 * arg2];
    }
}
