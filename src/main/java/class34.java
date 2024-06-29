import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class34 {

    @OriginalMember(owner = "client!tfa", name = "s", descriptor = "I")
    public int field364 = -1;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "F")
    public static float field353 = 0.25F;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!tfa", name = "k", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!tfa", name = "l", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!tfa", name = "o", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!tfa", name = "p", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!tfa", name = "r", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "J")
    private long field347;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "J")
    private long field348;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "Z")
    public boolean field355;

    @OriginalMember(owner = "client!tfa", name = "q", descriptor = "[I")
    public int[] field362;

    @OriginalMember(owner = "client!tfa", name = "t", descriptor = "[I")
    private int[] field365;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BILfga;Lnh;Lha;ILcj;Lgaa;Lsha;ILme;I)Lka;", line = 3)
    public final class472 method163(byte arg0, int arg1, class258 arg2, class747 arg3, class60 arg4, int arg5, class693 arg6, class300 arg7, class728 arg8, int arg9, class196 arg10, int arg11) {
        field360++;
        if (this.field364 != -1) {
            return arg8.method4084(5, this.field364).method1636(arg7, false, arg6, arg1, arg5, arg10, arg11, arg4, null, arg9);
        }
        int var13 = arg11;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg11 | 0x20;
            int var22 = arg7.field4042[arg5];
            int var23 = var22 >>> 16;
            class452 var24 = arg10.method1091(2, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2529(var25, 31239);
                var14 |= var24.method2527(false, var25);
                var17 |= var24.method2525(var25, false);
                var16 |= arg7.field4040;
            }
            if ((arg7.field4051 || class686.field9625) && arg9 != -1 && arg7.field4042.length > arg9) {
                int var26 = arg7.field4042[arg9];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class452 var29 = var23 == var27 ? var24 : arg10.method1091(2, var27);
                if (var29 != null) {
                    var15 |= var29.method2529(var28, 31239);
                    var14 |= var29.method2527(false, var28);
                    var17 |= var29.method2525(var28, false);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class262 var30 = class407.field5741;
        class472 var31;
        synchronized (class407.field5741) {
            var31 = (class472) class407.field5741.method1571(-128, this.field347);
        }
        if (var31 == null || arg4.method396(var31.method225(), var13) != 0) {
            if (var31 != null) {
                var13 = arg4.method389(var13, var31.method225());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field365[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg2.method1551(var35 & 0x3FFFFFFF, 3).method3312(113)) {
                        var33 = true;
                    }
                } else if (!arg3.method4169(var35 & 0x3FFFFFFF, (byte) -128).method3934(this.field355, 92)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class446[] var36 = new class446[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field365[var38];
                if ((var39 & 0x40000000) != 0) {
                    class446 var40 = arg3.method4169(var39 & 0x3FFFFFFF, (byte) -120).method3931(this.field355, 0);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class446 var41 = arg2.method1551(var39 & 0x3FFFFFFF, 3).method3314((byte) -99);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class446 var42 = new class446(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg4.method407(var42, var43, class143.field1856, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class237.field3103.length; var45++) {
                    if (this.field362[var44] < class237.field3103[var45][var44].length) {
                        var31.method195(class576.field8092[var45][var44], class237.field3103[var45][var44][this.field362[var44]]);
                    }
                }
            }
            var31.method202(var13);
            class262 var46 = class407.field5741;
            synchronized (class407.field5741) {
                class407.field5741.method1574(this.field347, var31, (byte) -80);
            }
        }
        if (arg7 == null) {
            return var31;
        }
        var31.method241((byte) 4, var13, true);
        if (arg0 <= 83) {
            this.field347 = -7L;
        }
        return arg7.method1803(arg9, arg1, arg11, 127, var31, arg5);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V", line = 204)
    public static final void method164(int arg0) {
        field357++;
        int[] var1 = new int[class761.field10628.field10364];
        int var2 = 0;
        for (int var3 = 0; var3 < class761.field10628.field10364; var3++) {
            class697 var5 = class761.field10628.method4169(var3, (byte) -124);
            if (var5.field9790 >= 0 || var5.field9803 >= 0) {
                var1[var2++] = var3;
            }
        }
        class72.field773 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class72.field773[var4] = var1[var4];
        }
        if (arg0 != -1439) {
            method164(57);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILgaa;IIIIIILfga;Lha;ILme;)Lka;", line = 245)
    public final class472 method165(int arg0, class300 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class258 arg8, class60 arg9, int arg10, class196 arg11) {
        if (arg10 != 256) {
            method175(-13, 94);
        }
        field346++;
        int var13 = arg7;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg1.field4042[arg0];
            Object var22 = null;
            var13 = arg7 | 0x20;
            int var23 = var21 >>> 16;
            class452 var24 = arg11.method1091(arg10 ^ 0x102, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2529(var25, 31239);
                var14 |= var24.method2527(false, var25);
                var17 |= var24.method2525(var25, false);
                var16 |= arg1.field4040;
            }
            if ((arg1.field4051 || class686.field9625) && arg6 != -1 && arg1.field4042.length > arg6) {
                int var26 = arg1.field4042[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class452 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg11.method1091(2, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method2529(var28, arg10 + 30983);
                    var14 |= var29.method2527(false, var28);
                    var17 |= var29.method2525(var28, false);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) (arg5 << 16) | (long) arg3 << 32 | (long) arg4;
        class262 var32 = class407.field5741;
        class472 var33;
        synchronized (class407.field5741) {
            var33 = (class472) class407.field5741.method1571(-125, var30);
        }
        if (var33 == null || arg9.method396(var33.method225(), var13) != 0) {
            if (var33 != null) {
                var13 = arg9.method389(var13, var33.method225());
            }
            class446[] var35 = new class446[3];
            int var36 = 0;
            if (!arg8.method1551(arg4, arg10 - 253).method3312(arg10 - 150) || !arg8.method1551(arg5, arg10 - 253).method3312(125) || !arg8.method1551(arg3, 3).method3312(arg10 - 150)) {
                return null;
            }
            class446 var37 = arg8.method1551(arg4, 3).method3314((byte) -103);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class446 var38 = arg8.method1551(arg5, arg10 - 253).method3314((byte) 68);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class446 var39 = arg8.method1551(arg3, arg10 ^ 0x103).method3314((byte) 110);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class446 var41 = new class446(var35, var36);
            var33 = arg9.method407(var41, var40, class143.field1856, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class237.field3103.length; var43++) {
                    if (this.field362[var42] < class237.field3103[var43][var42].length) {
                        var33.method195(class576.field8092[var43][var42], class237.field3103[var43][var42][this.field362[var42]]);
                    }
                }
            }
            var33.method202(var13);
            class262 var44 = class407.field5741;
            synchronized (class407.field5741) {
                class407.field5741.method1574(var30, var33, (byte) -80);
            }
        }
        if (arg1 == null) {
            return var33;
        } else {
            class472 var45 = var33.method241((byte) 4, var13, true);
            return arg1.method1803(arg6, arg2, arg7, -43, var45, arg0);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "([IIZ[III)V", line = 405)
    public final void method166(int[] arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
        if (this.field361 != arg4) {
            this.field361 = arg4;
        }
        this.field365 = arg0;
        this.field355 = arg2;
        this.field364 = arg5;
        this.field362 = arg3;
        field356++;
        if (arg1 >= -18) {
            this.field361 = 120;
        }
        this.method172(95);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lqb;Lgaa;Lgaa;Lme;ILfga;[ILnh;ZI[Loga;Lsha;Lcj;ZIIIIIILha;)Lka;", line = 426)
    public final class472 method167(class226 arg0, class300 arg1, class300 arg2, class196 arg3, int arg4, class258 arg5, int[] arg6, class747 arg7, boolean arg8, int arg9, class474[] arg10, class728 arg11, class693 arg12, boolean arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, class60 arg20) {
        field352++;
        if (this.field364 != -1) {
            return arg11.method4084(5, this.field364).method1638(arg4, arg19, arg6, arg18, (byte) 101, arg1, arg10, arg20, arg9, arg17, arg12, null, arg16, arg0, arg14, arg15, arg3, arg2);
        }
        int var22 = arg14;
        long var23 = this.field347;
        int[] var25 = this.field365;
        if (arg1 != null && (arg1.field4044 >= 0 || arg1.field4029 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field365[var26];
            }
            if (arg1.field4044 >= 0) {
                if (arg1.field4044 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class344.method2020(arg1.field4044, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg1.field4029 >= 0) {
                if (arg1.field4029 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class344.method2020(arg1.field4029, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg1 != null || arg2 != null;
        int var31 = arg10 == null ? 0 : arg10.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class499.field6808[var32] = null;
            if (arg10[var32] != null) {
                class300 var33 = arg3.method1090(arg10[var32].field6557, 16383);
                if (var33.field4042 != null) {
                    var30 = true;
                    class13.field92[var32] = var33;
                    int var34 = arg10[var32].field6559;
                    int var35 = arg10[var32].field6558;
                    int var36 = var33.field4042[var34];
                    class499.field6808[var32] = arg3.method1091(2, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class275.field3679[var32] = var37;
                    if (class499.field6808[var32] != null) {
                        var28 |= class499.field6808[var32].method2529(var37, 31239);
                        var27 |= class499.field6808[var32].method2527(false, var37);
                        var29 |= class499.field6808[var32].method2525(var37, !arg8);
                    }
                    if ((var33.field4051 || class686.field9625) && var35 != -1 && var35 < var33.field4042.length) {
                        class441.field6157[var32] = var33.field4033[var34];
                        class29.field229[var32] = arg10[var32].field6564;
                        int var38 = var33.field4042[var35];
                        class363.field4809[var32] = arg3.method1091(2, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class206.field2476[var32] = var39;
                        if (class363.field4809[var32] != null) {
                            var28 |= class363.field4809[var32].method2529(var39, 31239);
                            var27 |= class363.field4809[var32].method2527(false, var39);
                            var29 |= class363.field4809[var32].method2525(var39, false);
                        }
                    } else {
                        class441.field6157[var32] = 0;
                        class29.field229[var32] = 0;
                        class363.field4809[var32] = null;
                        class206.field2476[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class452 var43 = null;
        class452 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class452 var48 = null;
        class452 var49 = null;
        if (var30) {
            var22 = arg14 | 0x20;
            if (arg1 != null) {
                int var50 = arg1.field4042[arg4];
                int var51 = var50 >>> 16;
                var40 = var50 & 0xFFFF;
                var43 = arg3.method1091(2, var51);
                if (var43 != null) {
                    var28 |= var43.method2529(var40, 31239);
                    var27 |= var43.method2527(false, var40);
                    var29 |= var43.method2525(var40, false);
                }
                if ((arg1.field4051 || class686.field9625) && arg17 != -1 && arg1.field4042.length > arg17) {
                    int var52 = arg1.field4042[arg17];
                    var42 = arg1.field4033[arg4];
                    int var53 = var52 >>> 16;
                    var44 = var51 == var53 ? var43 : arg3.method1091(2, var53);
                    var41 = var52 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method2529(var41, 31239);
                        var27 |= var44.method2527(false, var41);
                        var29 |= var44.method2525(var41, false);
                    }
                }
            }
            if (arg2 != null) {
                int var54 = arg2.field4042[arg18];
                int var55 = var54 >>> 16;
                var45 = var54 & 0xFFFF;
                var48 = arg3.method1091(2, var55);
                if (var48 != null) {
                    var28 |= var48.method2529(var45, 31239);
                    var27 |= var48.method2527(!arg8, var45);
                    var29 |= var48.method2525(var45, false);
                }
                if ((arg2.field4051 || class686.field9625) && arg15 != -1 && arg2.field4042.length > arg15) {
                    var47 = arg2.field4033[arg18];
                    int var56 = arg2.field4042[arg15];
                    int var57 = var56 >>> 16;
                    var49 = var55 == var57 ? var48 : arg3.method1091(2, var57);
                    var46 = var56 & 0xFFFF;
                    if (var49 != null) {
                        var28 |= var49.method2529(var46, 31239);
                        var27 |= var49.method2527(false, var46);
                        var29 |= var49.method2525(var46, false);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        class262 var58 = class552.field7810;
        class472 var59;
        synchronized (class552.field7810) {
            var59 = (class472) class552.field7810.method1571(-119, var23);
        }
        class351 var60 = null;
        if (this.field361 != -1) {
            var60 = arg0.method1346(false, this.field361);
        }
        if (var59 == null || arg20.method396(var59.method225(), var22) != 0) {
            if (var59 != null) {
                var22 = arg20.method389(var22, var59.method225());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((var64 & Integer.MIN_VALUE) != 0 && !arg5.method1551(var64 & 0x3FFFFFFF, 3).method3313(0)) {
                        var62 = true;
                    }
                } else if (!arg7.method4169(var64 & 0x3FFFFFFF, (byte) -128).method3937(0, this.field355)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field348 != -1L) {
                    class262 var82 = class552.field7810;
                    synchronized (class552.field7810) {
                        var59 = (class472) class552.field7810.method1571(-123, this.field348);
                    }
                }
                if (var59 == null || arg20.method396(var59.method225(), var22) != 0) {
                    return null;
                }
            } else {
                class446[] var65 = new class446[12];
                for (int var66 = 0; var66 < 12; var66++) {
                    int var67 = var25[var66];
                    if ((var67 & 0x40000000) != 0) {
                        class446 var69 = arg7.method4169(var67 & 0x3FFFFFFF, (byte) -124).method3945(this.field355, 124);
                        if (var69 != null) {
                            var65[var66] = var69;
                        }
                    } else if ((Integer.MIN_VALUE & var67) != 0) {
                        class446 var68 = arg5.method1551(var67 & 0x3FFFFFFF, 3).method3311(2);
                        if (var68 != null) {
                            var65[var66] = var68;
                        }
                    }
                }
                if (var60 != null && var60.field4655 != null) {
                    for (int var70 = 0; var70 < var60.field4655.length; var70++) {
                        if (var65[var70] != null) {
                            int var71 = 0;
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            if (var60.field4655[var70] != null) {
                                var76 = var60.field4655[var70][5] << 3;
                                var74 = var60.field4655[var70][3] << 3;
                                var72 = var60.field4655[var70][1];
                                var75 = var60.field4655[var70][4] << 3;
                                var71 = var60.field4655[var70][0];
                                var73 = var60.field4655[var70][2];
                            }
                            if (var74 != 0 || var75 != 0 || var76 != 0) {
                                var65[var70].method2510(var76, var74, (byte) 117, var75);
                            }
                            if (var71 != 0 || var72 != 0 || var73 != 0) {
                                var65[var70].method2507(var73, var71, (byte) 104, var72);
                            }
                        }
                    }
                }
                int var77 = var22 | 0x4000;
                class446 var78 = new class446(var65, var65.length);
                var59 = arg20.method407(var78, var77, class143.field1856, 64, 850);
                for (int var79 = 0; var79 < 5; var79++) {
                    for (int var80 = 0; var80 < class237.field3103.length; var80++) {
                        if (class237.field3103[var80][var79].length > this.field362[var79]) {
                            var59.method195(class576.field8092[var80][var79], class237.field3103[var80][var79][this.field362[var79]]);
                        }
                    }
                }
                if (arg13) {
                    var59.method202(var22);
                    class262 var81 = class552.field7810;
                    synchronized (class552.field7810) {
                        class552.field7810.method1574(var23, var59, (byte) -80);
                    }
                    this.field348 = var23;
                }
            }
        }
        class472 var83 = var59.method241((byte) 4, var22, arg8);
        boolean var84 = false;
        if (arg6 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg6[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class10[] var86 = null;
        if (var60 != null) {
            var86 = var60.method2042(arg20, (byte) 45);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method208(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var31 > var88) {
            if (class499.field6808[var88] != null) {
                var83.method2653(class275.field3679[var88], class29.field229[var88] - 1, class363.field4809[var88], -27033, var89, class499.field6808[var88], false, class206.field2476[var88], null, 0, class441.field6157[var88]);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg6[var90] != -1) {
                    int var91 = arg6[var90] - arg19;
                    int var92 = var91 & 0x3FFF;
                    class10 var93 = arg20.method454();
                    var93.method34(var92);
                    var83.method208(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method208(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2652(var42, var40, var43, var44, arg1.field4035, var47, 28777, var45, var48, var46, arg16 - 1, false, var49, arg9 - 1, var41);
        } else if (var43 != null) {
            var83.method2659(arg16 - 1, var43, var40, var44, false, 0, 112, var42, var41);
        } else if (var48 != null) {
            var83.method2659(arg9 - 1, var48, var45, var49, false, 0, 119, var47, var46);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class499.field6808[var95] = null;
            class363.field4809[var95] = null;
            class13.field92[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)[Lea;", line = 972)
    public static final class547[] method168(int arg0) {
        field359++;
        if (arg0 <= 1) {
            method169(-6, 26);
        }
        return new class547[] { class137.field1741, class360.field4770, class12.field76, class393.field5561, class745.field10355, class713.field9955, class493.field6725, class552.field7811, class64.field703, class677.field9455, class362.field4799, class574.field8080, class578.field8110, class295.field3972, class354.field4731, class380.field5263, class504.field6845, class183.field2233, class499.field6805, class276.field3684, class106.field1411, class569.field8023, class523.field7049, class88.field1203, class536.field7286, class516.field6968, class496.field6748, class589.field8232, class83.field1117, class735.field10243, class227.field2954, class84.field1170, class716.field10021, class182.field2226, class666.field9272, class600.field8357, class401.field5673, class158.field2002, class755.field10545, class698.field9817, class586.field8198, class685.field9605, class101.field1343, class443.field6167, class236.field3096, class661.field9241, class699.field9831, class70.field764, class639.field8866, class84.field1168, class296.field3980, class397.field5631, class12.field70, class135.field1725, class387.field5464, class640.field8907, class15.field109, class48.field488, class288.field3827, class587.field8207, class324.field4345, class188.field2265, class424.field5951, class412.field5808, class571.field8037, class30.field243, class109.field1453, class24.field178, class374.field5198, class493.field6727, class188.field2261, class231.field2975, class303.field4085, class639.field8876, class525.field7056, class178.field2184, class578.field8109, class374.field5202, class488.field6686, class552.field7812, class578.field8114, class165.field2067, class736.field10277, class176.field2173, class472.field6534, class357.field4743, class629.field8777, class31.field271, class526.field7063, class615.field8613, class412.field5818, class761.field10612, class522.field7042, class58.field628, class582.field8152, class641.field8916, class659.field9195, class559.field7864, class554.field7820, class236.field3095, class728.field10165, class257.field3349, class462.field6393, class116.field1542, class556.field7839, class497.field6759, class687.field9626, class343.field4607, class685.field9549, class471.field6517, class315.field4248, class354.field4720, class33.field338, class501.field6826, class611.field8555, class690.field9668, class201.field2390, class353.field4710, class513.field6942, class478.field6607, class299.field4015, class317.field4271 };
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)Ldt;", line = 983)
    public static final class243 method169(int arg0, int arg1) {
        int var2 = -26 / ((arg1 - 54) / 40);
        field363++;
        if (arg0 == 0) {
            return new class726();
        } else if (arg0 == 1) {
            return new class418();
        } else if (arg0 == 2) {
            return new class368();
        } else if (arg0 == 3) {
            return new class93();
        } else if (arg0 == 4) {
            return new class759();
        } else if (arg0 == 5) {
            return new class507();
        } else if (arg0 == 6) {
            return new class586();
        } else if (arg0 == 7) {
            return new class3();
        } else if (arg0 == 8) {
            return new class595();
        } else if (arg0 == 9) {
            return new class576();
        } else if (arg0 == 10) {
            return new class400();
        } else if (arg0 == 11) {
            return new class19();
        } else if (arg0 == 12) {
            return new class22();
        } else if (arg0 == 13) {
            return new class124();
        } else if (arg0 == 14) {
            return new class441();
        } else if (arg0 == 15) {
            return new class626();
        } else if (arg0 == 16) {
            return new class96();
        } else if (arg0 == 17) {
            return new class167();
        } else if (arg0 == 18) {
            return new class5();
        } else if (arg0 == 19) {
            return new class384();
        } else if (arg0 == 20) {
            return new class27();
        } else if (arg0 == 21) {
            return new class437();
        } else if (arg0 == 22) {
            return new class565();
        } else if (arg0 == 23) {
            return new class350();
        } else if (arg0 == 24) {
            return new class26();
        } else if (arg0 == 25) {
            return new class374();
        } else if (arg0 == 26) {
            return new class85();
        } else if (arg0 == 27) {
            return new class593();
        } else if (arg0 == 28) {
            return new class559();
        } else if (arg0 == 29) {
            return new class1();
        } else if (arg0 == 30) {
            return new class692();
        } else if (arg0 == 31) {
            return new class214();
        } else if (arg0 == 32) {
            return new class197();
        } else if (arg0 == 33) {
            return new class12();
        } else if (arg0 == 34) {
            return new class75();
        } else if (arg0 == 35) {
            return new class727();
        } else if (arg0 == 36) {
            return new class376();
        } else if (arg0 == 37) {
            return new class422();
        } else if (arg0 == 38) {
            return new class394();
        } else if (arg0 == 39) {
            return new class724();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILfga;I)V", line = 1303)
    public final void method170(int arg0, int arg1, class258 arg2, int arg3) {
        field351++;
        int var5 = class137.field1742[arg1];
        if (arg0 == 12 && arg2.method1551(arg3, 3) != null) {
            this.field365[var5] = class344.method2020(arg3, Integer.MIN_VALUE);
            this.method172(arg0 + 105);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V", line = 1320)
    public final void method171(int arg0, int arg1, int arg2) {
        if (arg2 == -9) {
            this.field362[arg1] = arg0;
            field354++;
            this.method172(87);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V", line = 1332)
    private final void method172(int arg0) {
        field349++;
        long[] var2 = class723.field10105;
        this.field347 = -1L;
        this.field347 = this.field347 >>> 8 ^ var2[(int) ((this.field347 ^ (long) (this.field361 >> 8)) & 0xFFL)];
        this.field347 = this.field347 >>> 8 ^ var2[(int) (((long) this.field361 ^ this.field347) & 0xFFL)];
        if (arg0 <= 86) {
            this.method174(false, false);
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field347 = var2[(int) ((this.field347 ^ (long) (this.field365[var3] >> 24)) & 0xFFL)] ^ this.field347 >>> 8;
            this.field347 = this.field347 >>> 8 ^ var2[(int) (((long) (this.field365[var3] >> 16) ^ this.field347) & 0xFFL)];
            this.field347 = this.field347 >>> 8 ^ var2[(int) (((long) (this.field365[var3] >> 8) ^ this.field347) & 0xFFL)];
            this.field347 = var2[(int) ((this.field347 ^ (long) this.field365[var3]) & 0xFFL)] ^ this.field347 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field347 = var2[(int) (((long) this.field362[var4] ^ this.field347) & 0xFFL)] ^ this.field347 >>> 8;
        }
        this.field347 = this.field347 >>> 8 ^ var2[(int) (((long) (this.field355 ? 1 : 0) ^ this.field347) & 0xFFL)];
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILnh;I)V", line = 1369)
    public final void method173(int arg0, int arg1, class747 arg2, int arg3) {
        if (arg3 != 1073741824) {
            this.field355 = false;
        }
        field358++;
        if (arg0 == -1) {
            this.field365[arg1] = 0;
        } else if (arg2.method4169(arg0, (byte) -118) != null) {
            this.field365[arg1] = class344.method2020(1073741824, arg0);
            this.method172(arg3 ^ 0x4000005D);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZZ)V", line = 1394)
    public final void method174(boolean arg0, boolean arg1) {
        this.field355 = arg0;
        if (arg1) {
            this.method167(null, null, null, null, 16, null, null, null, false, -109, null, null, null, false, 116, 111, 105, -25, 30, -75, null);
        }
        field350++;
        this.method172(123);
    }

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(II)I", line = 1407)
    public static final int method175(int arg0, int arg1) {
        return class574.field8077 == null ? 0 : class574.field8077[arg0][arg1] & 0xFFFFFF;
    }
}
