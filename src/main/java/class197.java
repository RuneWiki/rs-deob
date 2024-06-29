import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class197 extends class103 {

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Lda;")
    private static class275 field3361 = class255.method1672(93, "Members object");

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Lda;")
    public static class275 field3365 = class255.method1672(102, "ul");

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field3360 = 0;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "Lda;")
    public static class275 field3368 = field3361;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "Lda;")
    public static class275 field3375 = class255.method1672(105, "M");

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lma;I)I")
    public static final int method1283(class105 arg0, int arg1) {
        int var2 = 0;
        if (arg1 != 11) {
            field3360 = -74;
        }
        if (arg0.method784(class5.field64, -2)) {
            var2++;
        }
        field3362++;
        if (arg0.method784(class262.field4550, -2)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Lhg;")
    public static final class184 method1284(byte arg0) {
        field3367++;
        if (arg0 != 69) {
            method1287(-45);
        }
        class184 var1 = (class184) class174.field3011.method1281(false);
        if (var1 != null) {
            var1.method741(3);
            var1.method843(arg0 ^ 0x5817);
            return var1;
        }
        class184 var2;
        do {
            var2 = (class184) class4.field54.method1281(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method1232((byte) 70) > class121.method888((byte) -119)) {
                return null;
            }
            var2.method741(3);
            var2.method843(22610);
        } while ((Long.MIN_VALUE & var2.field2057) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)I")
    public static final int method1285(int arg0, int arg1) {
        field3371++;
        if (arg1 != 12848) {
            method1286(20, -83, (class85) null, -19, 93, 100, true, 91, -29);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILij;IIIZII)V")
    public static final void method1286(int arg0, int arg1, class85 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg3 > -45) {
            return;
        }
        field3374++;
        if (arg5 < 0 || arg5 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var11 = arg2.method564((byte) 91);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg2.method564((byte) 108);
                    return;
                }
                if (var11 <= 49) {
                    arg2.method564((byte) 100);
                }
            }
        }
        if (!arg6) {
            class72.field1168[arg7][arg5][arg1] = 0;
        }
        while (true) {
            int var9 = arg2.method564((byte) 69);
            if (var9 == 0) {
                if (arg6) {
                    class92.field1575[0][arg5][arg1] = class273.field4725[0][arg5][arg1];
                    return;
                } else if (arg7 == 0) {
                    class92.field1575[0][arg5][arg1] = -class273.method1797(-29399, arg0 + arg5 + 932731, 556238 - -arg1 + arg4) * 8;
                    return;
                } else {
                    class92.field1575[arg7][arg5][arg1] = class92.field1575[arg7 - 1][arg5][arg1] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg2.method564((byte) 50);
                if (!arg6) {
                    if (var10 == 1) {
                        var10 = 0;
                    }
                    if (arg7 == 0) {
                        class92.field1575[0][arg5][arg1] = -var10 * 8;
                        return;
                    }
                    class92.field1575[arg7][arg5][arg1] = class92.field1575[arg7 - 1][arg5][arg1] - var10 * 8;
                    return;
                }
                class92.field1575[0][arg5][arg1] = class273.field4725[0][arg5][arg1] + (var10 * 8);
                return;
            }
            if (var9 <= 49) {
                class49.field817[arg7][arg5][arg1] = arg2.method581(8);
                class107.field1865[arg7][arg5][arg1] = (byte) ((var9 - 2) / 4);
                class35.field583[arg7][arg5][arg1] = (byte) class19.method98(3, arg8 + var9 - 2);
            } else if (var9 > 81) {
                class233.field4079[arg7][arg5][arg1] = (byte) (var9 - 81);
            } else if (!arg6) {
                class72.field1168[arg7][arg5][arg1] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public static final void method1287(int arg0) {
        field3366++;
        if (!class219.field3734) {
            return;
        }
        class124.field2217 = null;
        if (arg0 == 11306) {
            class218.field3701 = null;
            class219.field3734 = false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    public static void method1288(int arg0) {
        field3361 = null;
        field3368 = null;
        if (arg0 != 932731) {
            method1293((byte) 94, 87, -25);
        }
        field3375 = null;
        field3365 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBII)V")
    public static final void method1289(int arg0, byte arg1, int arg2, int arg3) {
        field3372++;
        class184 var4 = class147.method1044(11, (byte) 121, arg3);
        var4.method1226((byte) 26);
        var4.field3145 = arg2;
        if (arg1 < -8) {
            var4.field3151 = arg0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3376++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = arg1 - arg5;
        int var11 = arg2 - arg5;
        int var12 = 0;
        int var13 = arg2 * arg2;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var10 * var10;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = var10 << 1;
        int var22 = arg1 << 1;
        int var23 = (1 - var22) * var13 + var17;
        int var24 = (1 - var21) * var15 + var19;
        int var25 = var16 - ((var21 - 1) * var20);
        int var26 = var14 - ((var22 - 1) * var18);
        int var27 = var14 << 2;
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var17 * 3;
        int var31 = (var22 - 3) * var18;
        if (arg6 >= -86) {
            field3361 = null;
        }
        int var32 = var15 << 2;
        int var33 = var19 * 3;
        int var34 = (var21 - 3) * var20;
        int var35 = (arg1 - 1) * var28;
        int var36 = var27;
        int var37 = (var10 - 1) * var32;
        if (arg4 >= class149.field2603 && class141.field2493 >= arg4) {
            int[] var38 = class19.field280[arg4];
            int var39 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 - arg2);
            int var40 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 + arg2);
            int var41 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 - var11);
            int var42 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 + var11);
            class36.method216(var38, var39, arg7, -119, var41);
            class36.method216(var38, var41, arg0, -126, var42);
            class36.method216(var38, var42, arg7, -126, var40);
        }
        int var43 = var29;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var26 += var36;
                    var36 += var27;
                    var23 += var30;
                    var30 += var27;
                }
            }
            if (var26 < 0) {
                var8++;
                var26 += var36;
                var23 += var30;
                var36 += var27;
                var30 += var27;
            }
            var26 += -var31;
            var23 += -var35;
            var35 -= var28;
            boolean var44 = var9 <= var10;
            var9--;
            int var45 = arg4 - var9;
            var31 -= var28;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var25 += var43;
                        var24 += var33;
                        var43 += var29;
                        var33 += var29;
                        var12++;
                    }
                }
                if (var25 < 0) {
                    var25 += var43;
                    var43 += var29;
                    var24 += var33;
                    var33 += var29;
                    var12++;
                }
                var25 += -var34;
                var24 += -var37;
                var34 -= var32;
                var37 -= var32;
            }
            int var46 = arg4 + var9;
            if (var46 >= class149.field2603 && class141.field2493 >= var45) {
                int var47 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 + var8);
                int var48 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 - var8);
                if (var44) {
                    int var49 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 + var12);
                    int var50 = class93.method673(class246.field4355, (byte) 45, class96.field1632, arg3 - var12);
                    if (class149.field2603 <= var45) {
                        int[] var51 = class19.field280[var45];
                        class36.method216(var51, var48, arg7, -122, var50);
                        class36.method216(var51, var50, arg0, -118, var49);
                        class36.method216(var51, var49, arg7, -114, var47);
                    }
                    if (class141.field2493 >= var46) {
                        int[] var52 = class19.field280[var46];
                        class36.method216(var52, var48, arg7, -119, var50);
                        class36.method216(var52, var50, arg0, -119, var49);
                        class36.method216(var52, var49, arg7, -119, var47);
                    }
                } else {
                    if (class149.field2603 <= var45) {
                        class36.method216(class19.field280[var45], var48, arg7, -120, var47);
                    }
                    if (class141.field2493 >= var46) {
                        class36.method216(class19.field280[var46], var48, arg7, -118, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([Lda;I)Lda;")
    public static final class275 method1291(class275[] arg0, int arg1) {
        field3370++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 != -30025) {
            field3368 = null;
        }
        return class153.method1081(arg0, arg0.length, 0, arg1 ^ 0x130);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILma;)Z")
    public static final boolean method1292(int arg0, class105 arg1) {
        field3364++;
        if (arg0 != 0) {
            field3375 = null;
        }
        return arg1.method784(class85.field1423, -2);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BII)V")
    public static final void method1293(byte arg0, int arg1, int arg2) {
        field3373++;
        class184 var3 = class147.method1044(13, (byte) 80, arg2);
        if (arg0 != 11) {
            method1289(84, (byte) 47, -68, 89);
        }
        var3.method1226((byte) 26);
        var3.field3145 = arg1;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(II)V")
    public class197(int arg0, int arg1) {
        this.field3377 = arg0;
        this.field3369 = arg1;
    }
}
