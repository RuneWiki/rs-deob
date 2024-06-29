import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class52 {

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "B")
    private byte field1093;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lpj;")
    public static class237 field1086 = class33.method353("<col=ffffff> )4 ", 94);

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Z")
    public static boolean field1099 = true;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "[I")
    public static int[] field1102 = new int[50];

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lpj;")
    public static class237 field1101 = class33.method353("leuchten2:", 63);

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Lpj;")
    public static class237 field1105 = class33.method353("<)4col> x", 30);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Ljj;")
    public static class103 field1100;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method462(int arg0) {
        field1101 = null;
        field1100 = null;
        field1086 = null;
        field1102 = null;
        if (arg0 != 20807) {
            method462(-1);
        }
        field1105 = null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method463(int arg0) {
        field1097++;
        if (arg0 != 26337) {
            field1099 = true;
        }
        if (class95.field1697 > class169.field2966) {
            class169.field2966 = (float) ((double) class169.field2966 / 30.0D + (double) class169.field2966);
            if (class169.field2966 > class95.field1697) {
                class169.field2966 = class95.field1697;
            }
            class208.method1393((byte) 25);
        } else if (class95.field1697 < class169.field2966) {
            class169.field2966 = (float) ((double) class169.field2966 - (double) class169.field2966 / 30.0D);
            if (class95.field1697 > class169.field2966) {
                class169.field2966 = class95.field1697;
            }
            class208.method1393((byte) 25);
        }
        if (class180.field3167 == -1 || class51.field1085 == -1) {
            return;
        }
        int var1 = class51.field1085 - class22.field405;
        int var2 = class180.field3167 - class215.field3681;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class215.field3681 += var2;
        if (var2 == 0 && var1 == 0) {
            class51.field1085 = -1;
            class180.field3167 = -1;
        }
        class22.field405 -= -var1;
        class208.method1393((byte) 25);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)I")
    public final int method464(byte arg0) {
        field1098++;
        if (arg0 != 28) {
            field1105 = null;
        }
        return this.field1093 & 0x7;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)I")
    public final int method465(int arg0) {
        field1091++;
        if (arg0 == -3978) {
            return (this.field1093 & 0x8) == 8 ? 1 : 0;
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBIII)V")
    public static final void method466(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1087++;
        int var6 = class91.method689(arg1, class13.field215, class34.field727, (byte) 59);
        int var7 = class91.method689(arg5, class13.field215, class34.field727, (byte) -94);
        int var8 = class91.method689(arg0, class89.field1637, class94.field1676, (byte) -105);
        int var9 = class91.method689(arg4, class89.field1637, class94.field1676, (byte) -95);
        if (arg2 < 65) {
            method468(21);
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class199.method1361(arg3, var9, class62.field1241[var10], var8, 73);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZIIIIII[I)V")
    public static final void method467(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        field1103++;
        int var11 = arg8;
        if (arg8 >= class192.field3333) {
            return;
        }
        if (class192.field3334 > arg8) {
            var11 = class192.field3334;
        }
        int var12 = arg0 + arg8;
        if (class192.field3334 >= var12) {
            return;
        }
        if (var12 > class192.field3333) {
            var12 = class192.field3333;
        }
        int var13 = arg5;
        if (arg5 >= class192.field3331 || arg2 >= -72) {
            return;
        }
        int var14 = arg5 + arg7;
        if (class192.field3336 > arg5) {
            var13 = class192.field3336;
        }
        if (class192.field3336 >= var14) {
            return;
        }
        if (var14 > class192.field3331) {
            var14 = class192.field3331;
        }
        int var15 = var14 - arg5;
        if (arg9 == 9) {
            arg9 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        if (arg9 == 10) {
            arg9 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg9 == 11) {
            arg9 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        int var16 = class192.field3335 * var13 + var11;
        int var17 = class192.field3335 + var11 - var12;
        int var18 = var11 - arg8;
        int var19 = var12 - arg8;
        int var20 = arg0 - var19;
        int var21 = var13 - arg5;
        int var22 = arg0 - var18;
        int var23 = arg7 - var15;
        int var24 = arg7 - var21;
        if (arg9 == 1) {
            if (arg6 == 0) {
                for (int var25 = var21; var25 < var15; var25++) {
                    for (int var26 = var18; var26 < var19; var26++) {
                        if (var25 >= var26) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var18; var28 < var19; var28++) {
                        if (var27 >= var28) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 2) {
                for (int var29 = var21; var29 < var15; var29++) {
                    for (int var30 = var18; var30 < var19; var30++) {
                        if (var29 <= var30) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var18; var32 < var19; var32++) {
                        if (var32 >= var31) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg9 == 2) {
            if (arg6 == 0) {
                for (int var33 = var24 - 1; var33 >= var23; var33--) {
                    for (int var34 = var18; var34 < var19; var34++) {
                        if (var34 <= var33 >> 1) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 1) {
                for (int var35 = var21; var35 < var15; var35++) {
                    for (int var36 = var18; var36 < var19; var36++) {
                        if (var16 >= 0 && var16 < arg10.length) {
                            if (var35 << 1 <= var36) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var17;
                }
            } else if (arg6 == 2) {
                for (int var37 = var21; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var20; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 3) {
                for (int var39 = var24 - 1; var39 >= var23; var39--) {
                    for (int var40 = var22 - 1; var40 >= var20; var40--) {
                        if (var40 >= var39 << 1) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg9 == 3) {
            if (arg6 == 0) {
                for (int var41 = var24 - 1; var41 >= var23; var41--) {
                    for (int var42 = var22 - 1; var42 >= var20; var42--) {
                        if ((var41 >> 1) >= var42) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 1) {
                for (int var43 = var24 - 1; var43 >= var23; var43--) {
                    for (int var44 = var18; var44 < var19; var44++) {
                        if (var43 << 1 <= var44) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 2) {
                for (int var45 = var21; var45 < var15; var45++) {
                    for (int var46 = var18; var46 < var19; var46++) {
                        if (var45 >> 1 >= var46) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 3) {
                for (int var47 = var21; var47 < var15; var47++) {
                    for (int var48 = var22 - 1; var48 >= var20; var48--) {
                        if (var48 >= var47 << 1) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg9 == 4) {
            if (arg6 == 0) {
                for (int var49 = var24 - 1; var49 >= var23; var49--) {
                    for (int var50 = var18; var50 < var19; var50++) {
                        if (var50 >= var49 >> 1) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 1) {
                for (int var51 = var21; var51 < var15; var51++) {
                    for (int var52 = var18; var52 < var19; var52++) {
                        if (var51 << 1 >= var52) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 2) {
                for (int var53 = var21; var53 < var15; var53++) {
                    for (int var54 = var22 - 1; var54 >= var20; var54--) {
                        if (var54 >= (var53 >> 1)) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            } else if (arg6 == 3) {
                for (int var55 = var24 - 1; var55 >= var23; var55--) {
                    for (int var56 = var22 - 1; var56 >= var20; var56--) {
                        if (var56 <= var55 << 1) {
                            arg10[var16] = arg1;
                        } else if (arg3) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var17;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg6 == 0) {
                    for (int var65 = var21; var65 < var15; var65++) {
                        for (int var66 = var18; var66 < var19; var66++) {
                            if (var66 <= arg0 / 2) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var67 = var21; var67 < var15; var67++) {
                        for (int var68 = var18; var68 < var19; var68++) {
                            if (var67 <= (arg7 / 2)) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var69 = var21; var69 < var15; var69++) {
                        for (int var70 = var18; var70 < var19; var70++) {
                            if ((arg0 / 2) <= var70) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var71 = var21; var71 < var15; var71++) {
                        for (int var72 = var18; var72 < var19; var72++) {
                            if ((arg7 / 2) <= var71) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
            if (arg9 == 7) {
                if (arg6 == 0) {
                    for (int var73 = var21; var73 < var15; var73++) {
                        for (int var74 = var18; var74 < var19; var74++) {
                            if ((var73 - arg7 / 2) >= var74) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var75 = var24 - 1; var75 >= var23; var75--) {
                        for (int var76 = var18; var76 < var19; var76++) {
                            if (var76 <= (var75 - (arg7 / 2))) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var77 = var24 - 1; var77 >= var23; var77--) {
                        for (int var78 = var22 - 1; var78 >= var20; var78--) {
                            if (var77 - arg7 / 2 >= var78) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var79 = var21; var79 < var15; var79++) {
                        for (int var80 = var22 - 1; var80 >= var20; var80--) {
                            if (var80 <= var79 - (arg7 / 2)) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg6 == 0) {
                    for (int var81 = var21; var81 < var15; var81++) {
                        for (int var82 = var18; var82 < var19; var82++) {
                            if (var81 - (arg7 / 2) <= var82) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var83 = var24 - 1; var83 >= var23; var83--) {
                        for (int var84 = var18; var84 < var19; var84++) {
                            if (var84 >= (var83 - (arg7 / 2))) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var85 = var24 - 1; var85 >= var23; var85--) {
                        for (int var86 = var22 - 1; var86 >= var20; var86--) {
                            if (var85 - (arg7 / 2) <= var86) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var87 = var21; var87 < var15; var87++) {
                        for (int var88 = var22 - 1; var88 >= var20; var88--) {
                            if (var87 - arg7 / 2 <= var88) {
                                arg10[var16] = arg1;
                            } else if (arg3) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var17;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var57 = var24 - 1; var57 >= var23; var57--) {
                for (int var58 = var22 - 1; var58 >= var20; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg10[var16] = arg1;
                    } else if (arg3) {
                        arg10[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg6 == 1) {
            for (int var59 = var24 - 1; var59 >= var23; var59--) {
                for (int var60 = var18; var60 < var19; var60++) {
                    if (var60 <= (var59 << 1)) {
                        arg10[var16] = arg1;
                    } else if (arg3) {
                        arg10[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg6 == 2) {
            for (int var61 = var21; var61 < var15; var61++) {
                for (int var62 = var18; var62 < var19; var62++) {
                    if (var62 >= var61 >> 1) {
                        arg10[var16] = arg1;
                    } else if (arg3) {
                        arg10[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var17;
            }
        } else if (arg6 == 3) {
            for (int var63 = var21; var63 < var15; var63++) {
                for (int var64 = var22 - 1; var64 >= var20; var64--) {
                    if (var63 << 1 >= var64) {
                        arg10[var16] = arg1;
                    } else if (arg3) {
                        arg10[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var17;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
    public static final void method468(int arg0) {
        field1096++;
        class258.method1742(true);
        class259.method1745((byte) -17);
        class164.method1150((byte) 111);
        class235.method1562(-31424);
        class140.method965(-2064);
        class156.method1082(0);
        if (arg0 != 3) {
            return;
        }
        class249.method1701(-43);
        class235.method1571(arg0 ^ 0x31);
        class229.method1515((byte) 81);
        class48.method442(-36);
        class33.method355(arg0 - 34);
        class63.method527((byte) 126);
        class138.method954(12543016);
        class259.method1748(arg0 ^ 0xFFFF869D);
        class180.field3165.method934((byte) 62);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
    public static final void method469(int arg0, int arg1, int arg2) {
        field1092++;
        if (arg2 == 29608) {
            class270 var3 = class202.method1368(-15, 7, arg1);
            var3.method1793(13);
            var3.field4619 = arg0;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class52() {
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lie;)V")
    public class52(class32 arg0) {
        this.field1093 = arg0.method325(57);
        this.field1090 = arg0.method339(-16777216);
        this.field1088 = arg0.method319((byte) -18);
        this.field1089 = arg0.method319((byte) -18);
        this.field1095 = arg0.method319((byte) -18);
        this.field1104 = arg0.method319((byte) -18);
    }
}
