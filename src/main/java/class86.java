import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class86 extends class17 {

    @OriginalMember(owner = "client!th", name = "db", descriptor = "I")
    private int field1363 = 4096;

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "Lsf;")
    public static class108 field1360 = class140.method973(255, "Choisir une option");

    @OriginalMember(owner = "client!th", name = "jb", descriptor = "Lsf;")
    public static class108 field1369 = class140.method973(255, " autres options");

    @OriginalMember(owner = "client!th", name = "lb", descriptor = "Lsf;")
    public static class108 field1371 = class140.method973(255, "Connect-B au serveur de mise -9 jour");

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!th", name = "gb", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!th", name = "hb", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!th", name = "ib", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!th", name = "kb", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!th", name = "mb", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "[Lvd;")
    public static class135[] field1362;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(II)[I", line = 6)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            field1371 = (class108) null;
        }
        int[] var3 = this.field217.method1698(127, arg1);
        if (this.field217.field4295) {
            int[] var4 = this.method124(62, 0, arg1 - 1 & class219.field3899);
            int[] var5 = this.method124(57, 0, arg1);
            int[] var6 = this.method124(104, 0, class219.field3899 & arg1 + 1);
            for (int var7 = 0; var7 < class116.field2008; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field1363;
                int var9 = (var5[class249.field4327 & var7 + 1] - var5[var7 - 1 & class249.field4327]) * this.field1363;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var13 + var12 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        field1364++;
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)V", line = 68)
    public static void method592(int arg0) {
        field1360 = null;
        field1371 = null;
        field1369 = null;
        field1362 = null;
        if (arg0 != 0) {
            method597((byte) -45);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 92)
    public class86() {
        super(1, true);
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(II)Lsf;", line = 96)
    public static final class108 method593(int arg0, int arg1) {
        if (arg1 != 7224) {
            method593(49, -95);
        }
        field1368++;
        if (arg0 < 100000) {
            return class117.method833(new class108[] { class159.field2864, class79.method518(false, arg0), class96.field1529 }, false);
        } else if (arg0 >= 10000000) {
            return class117.method833(new class108[] { class251.field4378, class79.method518(false, arg0 / 1000000), class328.field5610, class96.field1529 }, false);
        } else {
            return class117.method833(new class108[] { class271.field4745, class79.method518(false, arg0 / 1000), class72.field1097, class96.field1529 }, false);
        }
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(II)V", line = 117)
    public static final void method594(int arg0, int arg1) {
        field1367++;
        if (arg0 != 4) {
            method594(85, -124);
        }
        class99.field1750.method637(arg1, 113);
        class145.field2598.method637(arg1, 121);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII[IIZIZII)V", line = 130)
    public static final void method595(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7, boolean arg8, int arg9, int arg10) {
        int var11 = arg2;
        field1365++;
        if (class28.field423 <= arg2) {
            return;
        }
        if (arg2 < class28.field422) {
            var11 = class28.field422;
        }
        int var12 = arg2 + arg10;
        if (var12 <= class28.field422) {
            return;
        }
        if (class28.field423 < var12) {
            var12 = class28.field423;
        }
        int var13 = arg9;
        if (arg9 >= class28.field421) {
            return;
        }
        int var14 = arg9 + arg0;
        if (class28.field425 > arg9) {
            var13 = class28.field425;
        }
        if (class28.field425 >= var14) {
            return;
        }
        if (arg7 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg7 = 1;
        }
        if (var14 > class28.field421) {
            var14 = class28.field421;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        int var15 = class28.field428 + var11 - var12;
        if (!arg8) {
            field1362 = (class135[]) null;
        }
        int var16 = class28.field428 * var13 + var11;
        int var17 = var12 - arg2;
        int var18 = var14 - arg9;
        int var19 = var13 - arg9;
        int var20 = var11 - arg2;
        int var21 = arg10 - var17;
        if (arg7 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg7 = 8;
        }
        int var22 = arg10 - var20;
        int var23 = arg0 - var19;
        int var24 = arg0 - var18;
        if (arg7 == 1) {
            if (arg1 == 0) {
                for (int var25 = var19; var25 < var18; var25++) {
                    for (int var26 = var20; var26 < var17; var26++) {
                        if (var26 <= var25) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 1) {
                for (int var31 = var23 - 1; var31 >= var24; var31--) {
                    for (int var32 = var20; var32 < var17; var32++) {
                        if (var31 >= var32) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 2) {
                for (int var29 = var19; var29 < var18; var29++) {
                    for (int var30 = var20; var30 < var17; var30++) {
                        if (var30 >= var29) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 3) {
                for (int var27 = var23 - 1; var27 >= var24; var27--) {
                    for (int var28 = var20; var28 < var17; var28++) {
                        if (var28 >= var27) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            }
        } else if (arg7 == 2) {
            if (arg1 == 0) {
                for (int var81 = var23 - 1; var81 >= var24; var81--) {
                    for (int var82 = var20; var82 < var17; var82++) {
                        if (var82 <= var81 >> 1) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 1) {
                for (int var83 = var19; var83 < var18; var83++) {
                    for (int var84 = var20; var84 < var17; var84++) {
                        if (var16 >= 0 && var16 < arg4.length) {
                            if (var84 >= var83 << 1) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var15;
                }
            } else if (arg1 == 2) {
                for (int var87 = var19; var87 < var18; var87++) {
                    for (int var88 = var22 - 1; var88 >= var21; var88--) {
                        if (var87 >> 1 >= var88) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 3) {
                for (int var85 = var23 - 1; var85 >= var24; var85--) {
                    for (int var86 = var22 - 1; var86 >= var21; var86--) {
                        if (var85 << 1 <= var86) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            }
        } else if (arg7 == 3) {
            if (arg1 == 0) {
                for (int var73 = var23 - 1; var73 >= var24; var73--) {
                    for (int var74 = var22 - 1; var74 >= var21; var74--) {
                        if (var73 >> 1 >= var74) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 1) {
                for (int var75 = var23 - 1; var75 >= var24; var75--) {
                    for (int var76 = var20; var76 < var17; var76++) {
                        if (var76 >= (var75 << 1)) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 2) {
                for (int var77 = var19; var77 < var18; var77++) {
                    for (int var78 = var20; var78 < var17; var78++) {
                        if (var77 >> 1 >= var78) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 3) {
                for (int var79 = var19; var79 < var18; var79++) {
                    for (int var80 = var22 - 1; var80 >= var21; var80--) {
                        if (var80 >= (var79 << 1)) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            }
        } else if (arg7 == 4) {
            if (arg1 == 0) {
                for (int var71 = var23 - 1; var71 >= var24; var71--) {
                    for (int var72 = var20; var72 < var17; var72++) {
                        if (var71 >> 1 <= var72) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 1) {
                for (int var69 = var19; var69 < var18; var69++) {
                    for (int var70 = var20; var70 < var17; var70++) {
                        if ((var69 << 1) >= var70) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 2) {
                for (int var65 = var19; var65 < var18; var65++) {
                    for (int var66 = var22 - 1; var66 >= var21; var66--) {
                        if (var66 >= (var65 >> 1)) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            } else if (arg1 == 3) {
                for (int var67 = var23 - 1; var67 >= var24; var67--) {
                    for (int var68 = var22 - 1; var68 >= var21; var68--) {
                        if ((var67 << 1) >= var68) {
                            arg4[var16] = arg3;
                        } else if (arg6) {
                            arg4[var16] = arg5;
                        }
                        var16++;
                    }
                    var16 += var15;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg1 == 0) {
                    for (int var33 = var19; var33 < var18; var33++) {
                        for (int var34 = var20; var34 < var17; var34++) {
                            if (arg10 / 2 >= var34) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var55 = var19; var55 < var18; var55++) {
                        for (int var56 = var20; var56 < var17; var56++) {
                            if ((arg0 / 2) >= var55) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var35 = var19; var35 < var18; var35++) {
                        for (int var36 = var20; var36 < var17; var36++) {
                            if (var36 >= (arg10 / 2)) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var37 = var19; var37 < var18; var37++) {
                        for (int var38 = var20; var38 < var17; var38++) {
                            if (var37 >= arg0 / 2) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg1 == 0) {
                    for (int var39 = var19; var39 < var18; var39++) {
                        for (int var40 = var20; var40 < var17; var40++) {
                            if (var39 - (arg0 / 2) >= var40) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var41 = var23 - 1; var41 >= var24; var41--) {
                        for (int var42 = var20; var42 < var17; var42++) {
                            if (var42 <= var41 - (arg0 / 2)) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var43 = var23 - 1; var43 >= var24; var43--) {
                        for (int var44 = var22 - 1; var44 >= var21; var44--) {
                            if (var44 <= var43 - (arg0 / 2)) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var53 = var19; var53 < var18; var53++) {
                        for (int var54 = var22 - 1; var54 >= var21; var54--) {
                            if (var53 - arg0 / 2 >= var54) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg1 == 0) {
                    for (int var45 = var19; var45 < var18; var45++) {
                        for (int var46 = var20; var46 < var17; var46++) {
                            if (var46 >= var45 - arg0 / 2) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var47 = var23 - 1; var47 >= var24; var47--) {
                        for (int var48 = var20; var48 < var17; var48++) {
                            if (var47 - (arg0 / 2) <= var48) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var51 = var23 - 1; var51 >= var24; var51--) {
                        for (int var52 = var22 - 1; var52 >= var21; var52--) {
                            if (var52 >= var51 - (arg0 / 2)) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var49 = var19; var49 < var18; var49++) {
                        for (int var50 = var22 - 1; var50 >= var21; var50--) {
                            if (var50 >= var49 - (arg0 / 2)) {
                                arg4[var16] = arg3;
                            } else if (arg6) {
                                arg4[var16] = arg5;
                            }
                            var16++;
                        }
                        var16 += var15;
                    }
                    return;
                }
            }
        } else if (arg1 == 0) {
            for (int var57 = var23 - 1; var57 >= var24; var57--) {
                for (int var58 = var22 - 1; var58 >= var21; var58--) {
                    if (var58 >= var57 >> 1) {
                        arg4[var16] = arg3;
                    } else if (arg6) {
                        arg4[var16] = arg5;
                    }
                    var16++;
                }
                var16 += var15;
            }
        } else if (arg1 == 1) {
            for (int var59 = var23 - 1; var59 >= var24; var59--) {
                for (int var60 = var20; var60 < var17; var60++) {
                    if (var60 <= var59 << 1) {
                        arg4[var16] = arg3;
                    } else if (arg6) {
                        arg4[var16] = arg5;
                    }
                    var16++;
                }
                var16 += var15;
            }
        } else if (arg1 == 2) {
            for (int var63 = var19; var63 < var18; var63++) {
                for (int var64 = var20; var64 < var17; var64++) {
                    if (var64 >= (var63 >> 1)) {
                        arg4[var16] = arg3;
                    } else if (arg6) {
                        arg4[var16] = arg5;
                    }
                    var16++;
                }
                var16 += var15;
            }
        } else if (arg1 == 3) {
            for (int var61 = var19; var61 < var18; var61++) {
                for (int var62 = var22 - 1; var62 >= var21; var62--) {
                    if (var62 <= (var61 << 1)) {
                        arg4[var16] = arg3;
                    } else if (arg6) {
                        arg4[var16] = arg5;
                    }
                    var16++;
                }
                var16 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)I", line = 1321)
    public static final int method596(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 20999) {
            field1369 = (class108) null;
        }
        field1370++;
        int var5 = 65536 - class263.field4649[arg3 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V", line = 1337)
    public static final void method597(byte arg0) {
        field1372++;
        int var1 = 12 / ((9 - arg0) / 51);
        class72.field1094.method639(-51);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLrm;I)V", line = 1355)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 == -114) {
            if (arg2 == 0) {
                this.field1363 = arg1.method1712(-1);
            }
            field1361++;
        }
    }
}
