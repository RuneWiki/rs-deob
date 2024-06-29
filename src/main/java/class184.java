import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class184 extends class49 {

    @OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
    private int field3042 = -32768;

    @OriginalMember(owner = "client!mc", name = "G", descriptor = "Ldf;")
    public static class51 field3044 = class46.method233("", 100);

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "Ldf;")
    private static class51 field3039 = class46.method233("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", 100);

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "Ldf;")
    public static class51 field3048 = field3039;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field3051 = 0;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!mc", name = "I", descriptor = "Laa;")
    public static class159 field3046;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Ltg;")
    public static class171 field3047;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()I")
    public final int method94() {
        field3037++;
        return this.field3042;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[[[Lqg;BIZI)Z")
    public static final boolean method1300(int arg0, class97[][][] arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        byte var6 = arg4 ? 1 : (byte) (class182.field2994 & 0xFF);
        if (arg2 != 101) {
            field3039 = null;
        }
        field3041++;
        if (class92.field1522[class257.field4496][arg3][arg5] == var6) {
            return false;
        } else if ((class160.field2626[class257.field4496][arg3][arg5] & 0x4) == 0) {
            return false;
        } else {
            int var7 = 0;
            byte var8 = 0;
            class159.field2609[var8] = arg3;
            int var31 = var8 + 1;
            class191.field3200[var8] = arg5;
            class92.field1522[class257.field4496][arg3][arg5] = var6;
            while (var7 != var31) {
                int var9 = class159.field2609[var7] & 0xFFFF;
                int var10 = class159.field2609[var7] >> 16 & 0xFF;
                int var11 = class159.field2609[var7] >> 24 & 0xFF;
                int var12 = class191.field3200[var7] & 0xFFFF;
                int var13 = (class191.field3200[var7] & 0xFFEA83) >> 16;
                boolean var14 = false;
                boolean var15 = false;
                var7 = var7 + 1 & 0xFFF;
                if ((class160.field2626[class257.field4496][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                label229: for (int var16 = class257.field4496 + 1; var16 <= 3; var16++) {
                    if ((class160.field2626[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg1[var16][var9][var12] != null) {
                            if (arg1[var16][var9][var12].field1627 != null) {
                                int var19 = class23.method124(var10, 31455);
                                if (arg1[var16][var9][var12].field1627.field4184 == var19 || arg1[var16][var9][var12].field1627.field4177 == var19) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var20 = class23.method124(var11, 31455);
                                    if (arg1[var16][var9][var12].field1627.field4184 == var20 || arg1[var16][var9][var12].field1627.field4177 == var20) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var21 = class23.method124(var13, 31455);
                                    if (arg1[var16][var9][var12].field1627.field4184 == var21 || arg1[var16][var9][var12].field1627.field4177 == var21) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var16][var9][var12].field1632 != null) {
                                for (int var22 = 0; var22 < arg1[var16][var9][var12].field1620; var22++) {
                                    int var23 = (int) (arg1[var16][var9][var12].field1632[var22].field477 >> 14 & 0x3FL);
                                    int var24 = (int) (arg1[var16][var9][var12].field1632[var22].field477 >> 20 & 0x3L);
                                    if (var23 == 21) {
                                        var23 = 19;
                                    }
                                    int var25 = var24 << 6 | var23;
                                    if (var10 == var25 || var11 != 0 && var11 == var25 || var13 != 0 && var13 == var25) {
                                        continue label229;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class97 var26 = arg1[var16][var9][var12];
                        if (var26 != null && var26.field1620 > 0) {
                            for (int var27 = 0; var27 < var26.field1620; var27++) {
                                class33 var28 = var26.field1632[var27];
                                if (var28.field495 != var28.field492 || var28.field491 != var28.field478) {
                                    for (int var29 = var28.field492; var29 <= var28.field495; var29++) {
                                        for (int var30 = var28.field491; var30 <= var28.field478; var30++) {
                                            class92.field1522[var16][var29][var30] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class92.field1522[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    if (class172.field2820[class257.field4496 + 1][var9][var12] > class69.field1119[arg0]) {
                        class69.field1119[arg0] = class172.field2820[class257.field4496 + 1][var9][var12];
                    }
                    int var17 = var9 << 7;
                    if (var17 < class109.field1855[arg0]) {
                        class109.field1855[arg0] = var17;
                    } else if (class79.field1262[arg0] < var17) {
                        class79.field1262[arg0] = var17;
                    }
                    int var18 = var12 << 7;
                    if (class75.field1215[arg0] > var18) {
                        class75.field1215[arg0] = var18;
                    } else if (class8.field83[arg0] < var18) {
                        class8.field83[arg0] = var18;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class92.field1522[class257.field4496][var9 - 1][var12] != var6) {
                        class159.field2609[var31] = class82.method642(-754974720, class82.method642(var9 - 1, 1179648));
                        class191.field3200[var31] = class82.method642(1245184, var12);
                        class92.field1522[class257.field4496][var9 - 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var9 - 1) >= 0 && class92.field1522[class257.field4496][var9 - 1][var12] != var6 && (class160.field2626[class257.field4496][var9][var12] & 0x4) == 0 && (class160.field2626[class257.field4496][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class159.field2609[var31] = class82.method642(class82.method642(var9 - 1, 1179648), 1375731712);
                            class191.field3200[var31] = class82.method642(1245184, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class92.field1522[class257.field4496][var9 - 1][var12] = var6;
                        }
                        if (class92.field1522[class257.field4496][var9][var12] != var6) {
                            class159.field2609[var31] = class82.method642(318767104, class82.method642(var9, 5373952));
                            class191.field3200[var31] = class82.method642(var12, 5439488);
                            class92.field1522[class257.field4496][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class92.field1522[class257.field4496][var9 + 1][var12] != var6 && (class160.field2626[class257.field4496][var9][var12] & 0x4) == 0 && (class160.field2626[class257.field4496][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class159.field2609[var31] = class82.method642(class82.method642(5373952, var9 + 1), -1845493760);
                            class191.field3200[var31] = class82.method642(5439488, var12);
                            class92.field1522[class257.field4496][var9 + 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < 104 && class92.field1522[class257.field4496][var9 + 1][var12] != var6) {
                        class159.field2609[var31] = class82.method642(class82.method642(9568256, var9 + 1), 1392508928);
                        class191.field3200[var31] = class82.method642(9633792, var12);
                        class92.field1522[class257.field4496][var9 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class92.field1522[class257.field4496][var9 - 1][var12] != var6 && (class160.field2626[class257.field4496][var9][var12] & 0x4) == 0 && (class160.field2626[class257.field4496][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class159.field2609[var31] = class82.method642(301989888, class82.method642(var9 - 1, 13762560));
                            class191.field3200[var31] = class82.method642(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class92.field1522[class257.field4496][var9 - 1][var12] = var6;
                        }
                        if (class92.field1522[class257.field4496][var9][var12] != var6) {
                            class159.field2609[var31] = class82.method642(-1828716544, class82.method642(var9, 13762560));
                            class191.field3200[var31] = class82.method642(var12, 13828096);
                            class92.field1522[class257.field4496][var9][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < 104 && class92.field1522[class257.field4496][var9 + 1][var12] != var6 && (class160.field2626[class257.field4496][var9][var12] & 0x4) == 0 && (class160.field2626[class257.field4496][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class159.field2609[var31] = class82.method642(class82.method642(var9 + 1, 9568256), -771751936);
                            class191.field3200[var31] = class82.method642(9633792, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class92.field1522[class257.field4496][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class69.field1119[arg0] != -1000000) {
                class69.field1119[arg0] += 10;
                class109.field1855[arg0] -= 50;
                class79.field1262[arg0] += 50;
                class8.field83[arg0] += 50;
                class75.field1215[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Ltf;")
    public static final class100 method1301(byte arg0, int arg1) {
        field3049++;
        if (arg0 >= -27) {
            field3048 = null;
        }
        class100 var2 = (class100) class48.field761.method1491((long) arg1, (byte) 95);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class210.field3494.method828(0, (byte) 106, arg1);
        } else {
            var3 = class163.field2663.method828(0, (byte) 122, arg1 & 0x7FFF);
        }
        class100 var4 = new class100();
        if (var3 != null) {
            var4.method737(58, new class121(var3));
        }
        if (arg1 >= 32768) {
            var4.method738((byte) -94);
        }
        class48.field761.method1492(false, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)I")
    public static final int method1302(int arg0, int arg1) {
        if (arg1 != -12820) {
            return -101;
        }
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        field3035++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIZI[III)V")
    public static final void method1303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var11 = 90 / ((-arg9 - 71) / 40);
        field3036++;
        int var12 = arg1;
        if (arg1 >= class59.field956) {
            return;
        }
        if (class59.field958 > arg1) {
            var12 = class59.field958;
        }
        int var13 = arg1 + arg2;
        if (var13 <= class59.field958) {
            return;
        }
        if (class59.field956 < var13) {
            var13 = class59.field956;
        }
        int var14 = arg7;
        if (class59.field961 <= arg7) {
            return;
        }
        if (arg7 < class59.field964) {
            var14 = class59.field964;
        }
        int var15 = arg0 + arg7;
        if (class59.field964 >= var15) {
            return;
        }
        if (arg4 == 9) {
            arg4 = 1;
            arg5 = arg5 + 1 & 0x3;
        }
        if (class59.field961 < var15) {
            var15 = class59.field961;
        }
        int var16 = var15 - arg7;
        if (arg4 == 10) {
            arg5 = arg5 + 3 & 0x3;
            arg4 = 1;
        }
        if (arg4 == 11) {
            arg4 = 8;
            arg5 = arg5 + 3 & 0x3;
        }
        int var17 = class59.field960 * var14 + var12;
        int var18 = class59.field960 + var12 - var13;
        int var19 = var13 - arg1;
        int var20 = arg2 - var19;
        int var21 = var12 - arg1;
        int var22 = arg0 - var16;
        int var23 = arg2 - var21;
        int var24 = var14 - arg7;
        int var25 = arg0 - var24;
        if (arg4 == 1) {
            if (arg5 == 0) {
                for (int var26 = var24; var26 < var16; var26++) {
                    for (int var27 = var21; var27 < var19; var27++) {
                        if (var27 <= var26) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 1) {
                for (int var28 = var25 - 1; var28 >= var22; var28--) {
                    for (int var29 = var21; var29 < var19; var29++) {
                        if (var28 >= var29) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 2) {
                for (int var30 = var24; var30 < var16; var30++) {
                    for (int var31 = var21; var31 < var19; var31++) {
                        if (var30 <= var31) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 3) {
                for (int var32 = var25 - 1; var32 >= var22; var32--) {
                    for (int var33 = var21; var33 < var19; var33++) {
                        if (var33 >= var32) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            }
        } else if (arg4 == 2) {
            if (arg5 == 0) {
                for (int var34 = var25 - 1; var34 >= var22; var34--) {
                    for (int var35 = var21; var35 < var19; var35++) {
                        if ((var34 >> 1) >= var35) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 1) {
                for (int var36 = var24; var36 < var16; var36++) {
                    for (int var37 = var21; var37 < var19; var37++) {
                        if (var17 >= 0 && var17 < arg8.length) {
                            if (var36 << 1 <= var37) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        } else {
                            var17++;
                        }
                    }
                    var17 += var18;
                }
            } else if (arg5 == 2) {
                for (int var38 = var24; var38 < var16; var38++) {
                    for (int var39 = var23 - 1; var39 >= var20; var39--) {
                        if ((var38 >> 1) >= var39) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 3) {
                for (int var40 = var25 - 1; var40 >= var22; var40--) {
                    for (int var41 = var23 - 1; var41 >= var20; var41--) {
                        if (var41 >= var40 << 1) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            }
        } else if (arg4 == 3) {
            if (arg5 == 0) {
                for (int var42 = var25 - 1; var42 >= var22; var42--) {
                    for (int var43 = var23 - 1; var43 >= var20; var43--) {
                        if (var42 >> 1 >= var43) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 1) {
                for (int var44 = var25 - 1; var44 >= var22; var44--) {
                    for (int var45 = var21; var45 < var19; var45++) {
                        if (var44 << 1 <= var45) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 2) {
                for (int var46 = var24; var46 < var16; var46++) {
                    for (int var47 = var21; var47 < var19; var47++) {
                        if (var46 >> 1 >= var47) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 3) {
                for (int var48 = var24; var48 < var16; var48++) {
                    for (int var49 = var23 - 1; var49 >= var20; var49--) {
                        if (var49 >= var48 << 1) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            }
        } else if (arg4 == 4) {
            if (arg5 == 0) {
                for (int var50 = var25 - 1; var50 >= var22; var50--) {
                    for (int var51 = var21; var51 < var19; var51++) {
                        if (var51 >= var50 >> 1) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 1) {
                for (int var52 = var24; var52 < var16; var52++) {
                    for (int var53 = var21; var53 < var19; var53++) {
                        if ((var52 << 1) >= var53) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 2) {
                for (int var54 = var24; var54 < var16; var54++) {
                    for (int var55 = var23 - 1; var55 >= var20; var55--) {
                        if ((var54 >> 1) <= var55) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            } else if (arg5 == 3) {
                for (int var56 = var25 - 1; var56 >= var22; var56--) {
                    for (int var57 = var23 - 1; var57 >= var20; var57--) {
                        if (var56 << 1 >= var57) {
                            arg8[var17] = arg3;
                        } else if (arg6) {
                            arg8[var17] = arg10;
                        }
                        var17++;
                    }
                    var17 += var18;
                }
            }
        } else if (arg4 != 5) {
            if (arg4 == 6) {
                if (arg5 == 0) {
                    for (int var66 = var24; var66 < var16; var66++) {
                        for (int var67 = var21; var67 < var19; var67++) {
                            if (var67 <= (arg2 / 2)) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var68 = var24; var68 < var16; var68++) {
                        for (int var69 = var21; var69 < var19; var69++) {
                            if (var68 <= (arg0 / 2)) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var70 = var24; var70 < var16; var70++) {
                        for (int var71 = var21; var71 < var19; var71++) {
                            if (var71 >= arg2 / 2) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var72 = var24; var72 < var16; var72++) {
                        for (int var73 = var21; var73 < var19; var73++) {
                            if (var72 >= (arg0 / 2)) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
            }
            if (arg4 == 7) {
                if (arg5 == 0) {
                    for (int var74 = var24; var74 < var16; var74++) {
                        for (int var75 = var21; var75 < var19; var75++) {
                            if ((var74 - arg0 / 2) >= var75) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var76 = var25 - 1; var76 >= var22; var76--) {
                        for (int var77 = var21; var77 < var19; var77++) {
                            if (var77 <= var76 - (arg0 / 2)) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var78 = var25 - 1; var78 >= var22; var78--) {
                        for (int var79 = var23 - 1; var79 >= var20; var79--) {
                            if (var79 <= (var78 - arg0 / 2)) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var80 = var24; var80 < var16; var80++) {
                        for (int var81 = var23 - 1; var81 >= var20; var81--) {
                            if (var81 <= (var80 - (arg0 / 2))) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
            }
            if (arg4 == 8) {
                if (arg5 == 0) {
                    for (int var82 = var24; var82 < var16; var82++) {
                        for (int var83 = var21; var83 < var19; var83++) {
                            if (var82 - (arg0 / 2) <= var83) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
                if (arg5 == 1) {
                    for (int var84 = var25 - 1; var84 >= var22; var84--) {
                        for (int var85 = var21; var85 < var19; var85++) {
                            if (var85 >= var84 - (arg0 / 2)) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
                if (arg5 == 2) {
                    for (int var86 = var25 - 1; var86 >= var22; var86--) {
                        for (int var87 = var23 - 1; var87 >= var20; var87--) {
                            if (var87 >= (var86 - (arg0 / 2))) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
                if (arg5 == 3) {
                    for (int var88 = var24; var88 < var16; var88++) {
                        for (int var89 = var23 - 1; var89 >= var20; var89--) {
                            if (var89 >= var88 - arg0 / 2) {
                                arg8[var17] = arg3;
                            } else if (arg6) {
                                arg8[var17] = arg10;
                            }
                            var17++;
                        }
                        var17 += var18;
                    }
                    return;
                }
            }
        } else if (arg5 == 0) {
            for (int var58 = var25 - 1; var58 >= var22; var58--) {
                for (int var59 = var23 - 1; var59 >= var20; var59--) {
                    if ((var58 >> 1) <= var59) {
                        arg8[var17] = arg3;
                    } else if (arg6) {
                        arg8[var17] = arg10;
                    }
                    var17++;
                }
                var17 += var18;
            }
        } else if (arg5 == 1) {
            for (int var60 = var25 - 1; var60 >= var22; var60--) {
                for (int var61 = var21; var61 < var19; var61++) {
                    if (var61 <= var60 << 1) {
                        arg8[var17] = arg3;
                    } else if (arg6) {
                        arg8[var17] = arg10;
                    }
                    var17++;
                }
                var17 += var18;
            }
        } else if (arg5 == 2) {
            for (int var62 = var24; var62 < var16; var62++) {
                for (int var63 = var21; var63 < var19; var63++) {
                    if (var62 >> 1 <= var63) {
                        arg8[var17] = arg3;
                    } else if (arg6) {
                        arg8[var17] = arg10;
                    }
                    var17++;
                }
                var17 += var18;
            }
        } else if (arg5 == 3) {
            for (int var64 = var24; var64 < var16; var64++) {
                for (int var65 = var23 - 1; var65 >= var20; var65--) {
                    if ((var64 << 1) >= var65) {
                        arg8[var17] = arg3;
                    } else if (arg6) {
                        arg8[var17] = arg10;
                    }
                    var17++;
                }
                var17 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V")
    public static final void method1304(boolean arg0, int arg1) {
        field3033++;
        class55.field940 = 50;
        class98.field1645 = arg1;
        if (arg0) {
            field3047 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class65 var11 = class219.method1508(this.field3034, (byte) -48).method1535(0, this.field3038, 122, (class151) null);
        field3043++;
        if (var11 != null) {
            var11.method96(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3042 = var11.method94();
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
    public static void method1305(int arg0) {
        field3044 = null;
        field3046 = null;
        int var1 = 33 % ((arg0 - 10) / 37);
        field3039 = null;
        field3047 = null;
        field3048 = null;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)V")
    public static final void method1306(byte arg0) {
        field3045++;
        class80.field1290.method1353(-103);
        if (arg0 != 97) {
            method1305(126);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1307(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3040++;
        if (arg4 != 93) {
            field3048 = null;
        }
        if (arg7 < 1 || arg2 < 1 || arg7 > 102 || arg2 > 102) {
            return;
        }
        if (!class34.method170(-105) && (class160.field2626[0][arg7][arg2] & 0x2) == 0) {
            int var8 = arg3;
            if ((class160.field2626[arg3][arg7][arg2] & 0x8) != 0) {
                var8 = 0;
            }
            if (class245.field4253 != var8) {
                return;
            }
        }
        int var9 = arg3;
        if (arg3 < 3 && (class160.field2626[1][arg7][arg2] & 0x2) == 2) {
            var9 = arg3 + 1;
        }
        class77.method549((byte) 94, arg1, class159.field2605[arg3], arg2, arg3, var9, arg7);
        if (arg5 < 0) {
            return;
        }
        boolean var10 = class193.field3244;
        class193.field3244 = true;
        class188.method1341(class159.field2605[arg3], arg3, 0, arg6, arg5, false, arg2, false, arg0, arg7, var9);
        class193.field3244 = var10;
        return;
    }
}
