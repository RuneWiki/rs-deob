import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class316 extends class80 {

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "Lph;")
    public class229 field5367;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lph;")
    public static class229 field5371 = class266.method1858(")4a=", 0);

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Lph;")
    public static class229 field5368 = class266.method1858("<col=00ff00>", 0);

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lph;")
    public static class229 field5365 = class266.method1858("OK", 0);

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "Lsl;")
    public static class283 field5373;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Lsi;")
    public static class66 field5366;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "[I")
    public static int[] field5374;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "[[[I")
    public static int[][][] field5370;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 7)
    public static void method2140(byte arg0) {
        if (arg0 < 58) {
            method2140((byte) -82);
        }
        field5373 = null;
        field5371 = null;
        field5366 = null;
        field5365 = null;
        field5368 = null;
        field5374 = null;
        field5370 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILrd;I)V", line = 28)
    public static final void method2141(int arg0, int arg1, class217 arg2, int arg3) {
        if (arg2.field5136 == arg3 && arg3 != -1) {
            class312 var4 = class53.method362((byte) 111, arg3);
            int var5 = var4.field5229;
            if (var5 == 1) {
                arg2.field5116 = 0;
                arg2.field5111 = 0;
                arg2.field5172 = 0;
                arg2.field5135 = arg0;
                class176.method1265(85, false, arg2.field5116, arg2.field5168, var4, arg2.field5147);
            }
            if (var5 == 2) {
                arg2.field5111 = 0;
            }
        } else if (arg3 == -1 || arg2.field5136 == -1 || class53.method362((byte) 104, arg3).field5244 >= class53.method362((byte) 6, arg2.field5136).field5244) {
            arg2.field5172 = 0;
            arg2.field5136 = arg3;
            arg2.field5116 = 0;
            arg2.field5135 = arg0;
            arg2.field5111 = 0;
            arg2.field5156 = arg2.field5171;
            if (arg2.field5136 != -1) {
                class176.method1265(arg1 ^ 0xFFFFFF90, false, arg2.field5116, arg2.field5168, class53.method362((byte) 111, arg2.field5136), arg2.field5147);
            }
        }
        field5372++;
        if (arg1 != 0) {
            field5368 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 84)
    public class316() {
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lph;I)V", line = 86)
    public class316(class229 arg0, int arg1) {
        this.field5367 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III[Loi;IZI[BIII)V", line = 102)
    public static final void method2142(int arg0, int arg1, int arg2, class108[] arg3, int arg4, boolean arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        field5369++;
        if (!arg5) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg6 + var11 > 0 && arg6 + var11 < 103 && arg2 + var12 > 0 && arg2 + var12 < 103) {
                        arg3[arg1].field1828[arg6 + var11][arg2 + var12] = class243.method1696(arg3[arg1].field1828[arg6 + var11][arg2 + var12], -16777217);
                    }
                }
            }
        }
        class164 var13 = new class164(arg7);
        byte var14;
        if (arg5) {
            var14 = 1;
        } else {
            var14 = 4;
        }
        for (int var15 = 0; var15 < var14; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg4 == var15 && arg9 <= var16 && var16 < arg9 + 8 && arg0 <= var17 && (arg0 + 8) > var17) {
                        class1.method2(arg10, class201.method1409(var17 & 0x7, 0, arg10, var16 & 0x7) + arg6, arg5, -105, 0, arg1, var13, class40.method308(arg10, 11995, var16 & 0x7, var17 & 0x7) + arg2, 0);
                    } else {
                        class1.method2(0, -1, arg5, -105, 0, 0, var13, -1, 0);
                    }
                }
            }
        }
        if (arg8 > -56) {
            return;
        }
        while (var13.field2668.length > var13.field2670) {
            int var18 = var13.method1178(8);
            if (var18 != 129) {
                var13.field2670--;
                break;
            }
            for (int var19 = 0; var19 < 4; var19++) {
                byte var20 = var13.method1163(864348104);
                if (var20 == 0) {
                    if (var19 <= arg4) {
                        int var21 = arg6;
                        int var22 = arg6 + 7;
                        if (var22 < 0) {
                            var22 = 0;
                        } else if (var22 >= 104) {
                            var22 = 104;
                        }
                        if (arg6 < 0) {
                            var21 = 0;
                        } else if (arg6 >= 104) {
                            var21 = 104;
                        }
                        int var23 = arg2;
                        int var24 = arg2 + 7;
                        if (arg2 < 0) {
                            var23 = 0;
                        } else if (arg2 >= 104) {
                            var23 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        while (var21 < var22) {
                            while (var23 < var24) {
                                class149.field2415[arg1][var21][var23] = 0;
                                var23++;
                            }
                            var21++;
                        }
                    }
                } else if (var20 == 1) {
                    for (int var25 = 0; var25 < 64; var25 += 4) {
                        for (int var26 = 0; var26 < 64; var26 += 4) {
                            byte var27 = var13.method1163(864348104);
                            if (var19 <= arg4) {
                                int var28 = var25;
                                while ((var25 + 4) > var28) {
                                    int var29 = var26;
                                    while (var29 < (var26 + 4)) {
                                        if (var28 >= arg9 && (arg9 + 8) > var28 && arg0 <= var29 && (arg0 + 8) > arg0) {
                                            int var30 = class201.method1409(var29 & 0x7, 0, arg10, var28 & 0x7) + arg6;
                                            int var31 = class40.method308(arg10, 11995, var28 & 0x7, var29 & 0x7) + arg2;
                                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                                class149.field2415[arg1][var30][var31] = var27;
                                            }
                                        }
                                        var26++;
                                    }
                                    var25++;
                                }
                            }
                        }
                    }
                } else if (var20 != 2) {
                }
            }
        }
        boolean var32 = false;
        if (class99.field1675 && !arg5) {
            class139 var33 = null;
            label208: while (true) {
                int var35;
                label201: do {
                    while (var13.field2668.length > var13.field2670) {
                        int var34 = var13.method1178(8);
                        if (var34 != 0) {
                            if (var34 != 1) {
                                throw new IllegalStateException();
                            }
                            var35 = var13.method1178(8);
                            continue label201;
                        }
                        var33 = new class139(var13);
                    }
                    if (var33 == null) {
                        var33 = new class139();
                    }
                    class313.field5311[arg6 >> 3][arg2 >> 3] = var33;
                    break label208;
                } while (var35 <= 0);
                for (int var36 = 0; var36 < var35; var36++) {
                    class195 var37 = new class195(var13);
                    int var38 = var37.field3263 >> 7;
                    int var39 = var37.field3244 >> 7;
                    if (var37.field3262 == arg4 && arg9 <= var39 && var39 < (arg9 + 8) && arg0 <= var38 && var38 < arg0 + 8) {
                        int var40 = (arg6 << 7) + class176.method1267(var37.field3244 & 0x3FF, 0, var37.field3263 & 0x3FF, arg10);
                        int var41 = (arg2 << 7) + class207.method1443(93, var37.field3263 & 0x3FF, var37.field3244 & 0x3FF, arg10);
                        var37.field3263 = var41;
                        int var42 = var37.field3263 >> 7;
                        var37.field3244 = var40;
                        int var43 = var37.field3244 >> 7;
                        if (var43 >= 0 && var42 >= 0 && var43 < 104 && var42 < 104) {
                            var37.field3261 = class192.field3174[var37.field3262][var43][var42] - var37.field3261;
                            class62.method429(var37);
                        }
                    }
                }
            }
        }
        if (var32) {
            return;
        }
        int var44 = arg2 + 7;
        int var45 = arg6 + 7;
        for (int var46 = arg6; var46 < var45; var46++) {
            for (int var47 = arg2; var47 < var44; var47++) {
                class149.field2415[arg1][var46][var47] = 0;
            }
        }
    }
}
