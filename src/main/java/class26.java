import java.awt.FontMetrics;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 {

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "I")
    private int field360 = 0;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "[I")
    public int[] field359 = new int[1500];

    @OriginalMember(owner = "mapview!n", name = "j", descriptor = "[I")
    private int[] field368 = new int[1500];

    @OriginalMember(owner = "mapview!n", name = "k", descriptor = "[I")
    public int[] field369 = new int[1500];

    @OriginalMember(owner = "mapview!n", name = "l", descriptor = "[I")
    public int[] field370 = new int[1500];

    @OriginalMember(owner = "mapview!n", name = "o", descriptor = "[I")
    private int[] field373 = new int[1500];

    @OriginalMember(owner = "mapview!n", name = "p", descriptor = "[I")
    private int[] field374 = new int[1500];

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "Ls;")
    public static class34 field362 = class9.method35("Grand Exchange", 220);

    @OriginalMember(owner = "mapview!n", name = "h", descriptor = "Ls;")
    private static class34 field366 = class9.method35("overlay)3dat", 220);

    @OriginalMember(owner = "mapview!n", name = "i", descriptor = "Ls;")
    public static class34 field367 = class9.method35("Mining Shop", 220);

    @OriginalMember(owner = "mapview!n", name = "m", descriptor = "Ls;")
    public static class34 field371 = class9.method35("Requesting", 220);

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field365;

    @OriginalMember(owner = "mapview!n", name = "n", descriptor = "[I")
    public static int[] field372;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(JB)V", line = 4)
    public static final void method164(long arg0, byte arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class14.method60(arg0 - 1L, (byte) -115);
            class14.method60(1L, (byte) -105);
        } else {
            class14.method60(arg0, (byte) -123);
        }
        if (arg1 != 2) {
            field362 = null;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIZIIII[II)V", line = 26)
    private final void method165(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
        if (arg9 == 9) {
            arg9 = 1;
            arg7 = arg7 + 1 & 0x3;
        }
        int var11 = class23.field231 - arg1;
        if (arg9 == 10) {
            arg9 = 1;
            arg7 = arg7 + 3 & 0x3;
        }
        if (arg9 == 11) {
            arg9 = 8;
            arg7 = arg7 + 3 & 0x3;
        }
        if (arg9 == 1) {
            if (arg7 == 0) {
                for (int var74 = 0; var74 < arg6; var74++) {
                    for (int var75 = 0; var75 < arg1; var75++) {
                        if (var75 <= var74) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 1) {
                for (int var72 = arg6 - 1; var72 >= 0; var72--) {
                    for (int var73 = 0; var73 < arg1; var73++) {
                        if (var72 >= var73) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 2) {
                for (int var68 = 0; var68 < arg6; var68++) {
                    for (int var69 = 0; var69 < arg1; var69++) {
                        if (var69 >= var68) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 3) {
                for (int var70 = arg6 - 1; var70 >= 0; var70--) {
                    for (int var71 = 0; var71 < arg1; var71++) {
                        if (var70 <= var71) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg9 == 2) {
            if (arg7 == 0) {
                for (int var18 = arg6 - 1; var18 >= 0; var18--) {
                    for (int var19 = 0; var19 < arg1; var19++) {
                        if (var19 <= var18 >> 1) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 1) {
                for (int var16 = 0; var16 < arg6; var16++) {
                    for (int var17 = 0; var17 < arg1; var17++) {
                        if (var17 >= var16 << 1) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 2) {
                for (int var12 = 0; var12 < arg6; var12++) {
                    for (int var13 = arg1 - 1; var13 >= 0; var13--) {
                        if (var12 >> 1 >= var13) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 3) {
                for (int var14 = arg6 - 1; var14 >= 0; var14--) {
                    for (int var15 = arg1 - 1; var15 >= 0; var15--) {
                        if (var15 >= var14 << 1) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg9 == 3) {
            if (arg7 == 0) {
                for (int var26 = arg6 - 1; var26 >= 0; var26--) {
                    for (int var27 = arg1 - 1; var27 >= 0; var27--) {
                        if (var26 >> 1 >= var27) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 1) {
                for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg1; var21++) {
                        if (var21 >= var20 << 1) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 2) {
                for (int var22 = 0; var22 < arg6; var22++) {
                    for (int var23 = 0; var23 < arg1; var23++) {
                        if (var23 <= var22 >> 1) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 3) {
                for (int var24 = 0; var24 < arg6; var24++) {
                    for (int var25 = arg1 - 1; var25 >= 0; var25--) {
                        if (var25 >= var24 << 1) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg9 == 4) {
            if (arg7 == 0) {
                for (int var66 = arg6 - 1; var66 >= 0; var66--) {
                    for (int var67 = 0; var67 < arg1; var67++) {
                        if (var66 >> 1 <= var67) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 1) {
                for (int var60 = 0; var60 < arg6; var60++) {
                    for (int var61 = 0; var61 < arg1; var61++) {
                        if (var61 <= var60 << 1) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 2) {
                for (int var64 = 0; var64 < arg6; var64++) {
                    for (int var65 = arg1 - 1; var65 >= 0; var65--) {
                        if (var64 >> 1 <= var65) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            } else if (arg7 == 3) {
                for (int var62 = arg6 - 1; var62 >= 0; var62--) {
                    for (int var63 = arg1 - 1; var63 >= 0; var63--) {
                        if (var63 <= var62 << 1) {
                            arg8[arg5] = arg0;
                        } else if (arg3) {
                            arg8[arg5] = arg4;
                        }
                        arg5++;
                    }
                    arg5 += var11;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg7 == 0) {
                    for (int var28 = 0; var28 < arg6; var28++) {
                        for (int var29 = 0; var29 < arg1; var29++) {
                            if (var29 <= arg1 / 2) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var34 = 0; var34 < arg6; var34++) {
                        for (int var35 = 0; var35 < arg1; var35++) {
                            if (arg6 / 2 >= var34) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var30 = 0; var30 < arg6; var30++) {
                        for (int var31 = 0; var31 < arg1; var31++) {
                            if (var31 >= arg1 / 2) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var32 = 0; var32 < arg6; var32++) {
                        for (int var33 = 0; var33 < arg1; var33++) {
                            if (arg6 / 2 <= var32) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
            }
            if (arg2 > -72) {
                this.field360 = 103;
            }
            if (arg9 == 7) {
                if (arg7 == 0) {
                    for (int var36 = 0; var36 < arg6; var36++) {
                        for (int var37 = 0; var37 < arg1; var37++) {
                            if (var37 <= var36 - arg6 / 2) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var50 = arg6 - 1; var50 >= 0; var50--) {
                        for (int var51 = 0; var51 < arg1; var51++) {
                            if (var51 <= var50 - arg6 / 2) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var38 = arg6 - 1; var38 >= 0; var38--) {
                        for (int var39 = arg1 - 1; var39 >= 0; var39--) {
                            if (var38 - arg6 / 2 >= var39) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var40 = 0; var40 < arg6; var40++) {
                        for (int var41 = arg1 - 1; var41 >= 0; var41--) {
                            if (var40 - arg6 / 2 >= var41) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg7 == 0) {
                    for (int var48 = 0; var48 < arg6; var48++) {
                        for (int var49 = 0; var49 < arg1; var49++) {
                            if (var48 - arg6 / 2 <= var49) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var46 = arg6 - 1; var46 >= 0; var46--) {
                        for (int var47 = 0; var47 < arg1; var47++) {
                            if (var46 - arg6 / 2 <= var47) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var44 = arg6 - 1; var44 >= 0; var44--) {
                        for (int var45 = arg1 - 1; var45 >= 0; var45--) {
                            if (var44 - arg6 / 2 <= var45) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var42 = 0; var42 < arg6; var42++) {
                        for (int var43 = arg1 - 1; var43 >= 0; var43--) {
                            if (var43 >= var42 - arg6 / 2) {
                                arg8[arg5] = arg0;
                            } else if (arg3) {
                                arg8[arg5] = arg4;
                            }
                            arg5++;
                        }
                        arg5 += var11;
                    }
                    return;
                }
            }
        } else if (arg7 == 0) {
            for (int var52 = arg6 - 1; var52 >= 0; var52--) {
                for (int var53 = arg1 - 1; var53 >= 0; var53--) {
                    if (var53 >= var52 >> 1) {
                        arg8[arg5] = arg0;
                    } else if (arg3) {
                        arg8[arg5] = arg4;
                    }
                    arg5++;
                }
                arg5 += var11;
            }
        } else if (arg7 == 1) {
            for (int var58 = arg6 - 1; var58 >= 0; var58--) {
                for (int var59 = 0; var59 < arg1; var59++) {
                    if (var58 << 1 >= var59) {
                        arg8[arg5] = arg0;
                    } else if (arg3) {
                        arg8[arg5] = arg4;
                    }
                    arg5++;
                }
                arg5 += var11;
            }
        } else if (arg7 == 2) {
            for (int var56 = 0; var56 < arg6; var56++) {
                for (int var57 = 0; var57 < arg1; var57++) {
                    if (var57 >= var56 >> 1) {
                        arg8[arg5] = arg0;
                    } else if (arg3) {
                        arg8[arg5] = arg4;
                    }
                    arg5++;
                }
                arg5 += var11;
            }
        } else if (arg7 == 3) {
            for (int var54 = 0; var54 < arg6; var54++) {
                for (int var55 = arg1 - 1; var55 >= 0; var55--) {
                    if (var54 << 1 >= var55) {
                        arg8[arg5] = arg0;
                    } else if (arg3) {
                        arg8[arg5] = arg4;
                    }
                    arg5++;
                }
                arg5 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Z)B", line = 1165)
    private static final byte method166(boolean arg0) {
        if (arg0) {
            return 11;
        } else if (class1.field6 == null) {
            return 0;
        } else {
            return class1.field6[class31.field433];
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([BI)V", line = 1179)
    private final void method167(byte[] arg0, int arg1) {
        if (arg1 != -64) {
            this.method176(null, null, 22);
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - field364;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class28.field387;
                if (var4 > 0 && var5 > 0 && class1.field4 > var4 + 64 && class19.field170 > var5 + 64) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class19.field170 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg0[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class18.method86(0, (byte) var9, var4 + var6, -1 - var8 + -var5 + class19.field170 + -64, arg1 ^ 0xFFFFAA65);
                                } else if (var9 >= 160) {
                                    class18.method86(2, (byte) (var9 - 159), var4 + var6, class19.field170 + -64 - (var5 + var8 + 1), 21925);
                                    if (class35.field485 >= 1500) {
                                        break;
                                    }
                                    this.field370[class35.field485] = var4 + var6;
                                    this.field359[class35.field485] = var7;
                                    this.field369[class35.field485] = var9 - 160;
                                    class35.field485++;
                                } else {
                                    class18.method86(1, (byte) (var9 - 28), var4 + var6, -var5 + -64 + class19.field170 - var8 - 1, 21925);
                                }
                            }
                            var7--;
                        }
                    }
                } else {
                    for (int var10 = 0; var10 < 64; var10++) {
                        byte var12;
                        for (int var11 = -64; var11 < 0; var11++) {
                            do {
                                var12 = arg0[var3++];
                            } while (var12 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(III)V", line = 1288)
    private final void method168(int arg0, int arg1, int arg2) {
        int var4 = arg1 >> 6;
        int var5 = arg0 >> 6;
        class39.field531[1] = new byte[var5][var4][];
        class1.field13 = new class1[var5][var4];
        class24.field247 = new int[var5][var4][];
        if (arg2 < 25) {
            return;
        }
        class39.field531[4] = new byte[var5][var4][];
        class8.field55 = new class1[var5][var4];
        class39.field531[0] = new byte[var5][var4][];
        class39.field531[3] = new byte[var5][var4][];
        class39.field531[2] = new byte[var5][var4][];
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)V", line = 1314)
    public static final void method169(int arg0) {
        if (class39.field531[0][class12.field113][class19.field172] == null) {
            class31.field443 = null;
        } else {
            class31.field443 = class39.field531[0][class12.field113][class19.field172];
        }
        if (class39.field531[1][class12.field113][class19.field172] == null) {
            class38.field515 = null;
        } else {
            class38.field515 = class39.field531[1][class12.field113][class19.field172];
        }
        if (class39.field531[2][class12.field113][class19.field172] == null) {
            class16.field138 = null;
        } else {
            class16.field138 = class39.field531[2][class12.field113][class19.field172];
        }
        if (class39.field531[3][class12.field113][class19.field172] == null) {
            class25.field256 = null;
        } else {
            class25.field256 = class39.field531[3][class12.field113][class19.field172];
        }
        if (class39.field531[arg0][class12.field113][class19.field172] == null) {
            class1.field6 = null;
        } else {
            class1.field6 = class39.field531[4][class12.field113][class19.field172];
        }
        if (class1.field13[class12.field113][class19.field172] == null) {
            class9.field86 = null;
        } else {
            class9.field86 = class1.field13[class12.field113][class19.field172];
        }
        if (class8.field55[class12.field113][class19.field172] == null) {
            class18.field153 = null;
        } else {
            class18.field153 = class8.field55[class12.field113][class19.field172];
        }
        if (class24.field247[class12.field113][class19.field172] == null) {
            class31.field428 = null;
        } else {
            class31.field428 = class24.field247[class12.field113][class19.field172];
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "([BI)V", line = 1361)
    private final void method170(byte[] arg0, int arg1) {
        if (arg1 != -707857274) {
            return;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - field364;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class28.field387;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class1.field4 && class19.field170 > var5 + 64) {
                    class12.field113 = class19.field170 - var5 - 1 >> 6;
                    class19.field172 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class18.method86(4, var9, var4 + var6, -var5 + class19.field170 + -var7 + -1 + -64, arg1 ^ 0xD5CEA123);
                                if (class8.field55[class12.field113][class19.field172] == null) {
                                    class8.field55[class12.field113][class19.field172] = new class1();
                                    class8.field55[class12.field113][class19.field172].field18 = new byte[4096];
                                }
                                class8.field55[class12.field113][class19.field172].field18[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class8.field55[class12.field113][class19.field172] != null) {
                        class8.field55[class12.field113][class19.field172].method3(0);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg0[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 1445)
    public static final int method171(KeyEvent arg0, int arg1) {
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg1 != -210313695) {
            method169(-49);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(ILia;)V", line = 1468)
    public final void method172(int arg0, class18 arg1) {
        class29 var3 = new class29(arg1.method29(class12.field116, class27.field379, 102));
        int var4 = var3.method192((byte) -110);
        int var5 = var3.method192((byte) -67);
        int var6 = var3.method192((byte) -86);
        int var7 = var3.method192((byte) 117);
        int var8 = var3.method192((byte) 83);
        int var9 = var3.method192((byte) -65);
        var3.method191(-55);
        class19.field170 = (var7 - var5) * 64 + 64;
        class1.field4 = (var6 + 1 - var4) * 64;
        field364 = var4 * 64;
        class1.field9 = var8 * 64 - field364;
        class28.field387 = var5 * 64;
        class34.field477 = class28.field387 + class19.field170 - var9 * 64;
        this.method168(class19.field170, class1.field4, 94);
        class29 var10 = new class29(arg1.method29(class24.field250, class27.field379, -66));
        int var11 = var10.method192((byte) -114);
        class38.field513 = new int[var11 + 1];
        for (int var12 = 0; var12 < var11; var12++) {
            class38.field513[var12 + 1] = var10.method195(-122);
        }
        int var13 = var10.method192((byte) 89);
        class22.field218 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class22.field218[var14 + 1] = var10.method195(-90);
        }
        byte[] var15 = arg1.method29(mapview.field335, class27.field379, 97);
        byte[][] var16 = new byte[class1.field4][class19.field170];
        this.method176(var16, var15, -4);
        byte[] var17 = arg1.method29(field366, class27.field379, -123);
        this.method173(var17, 12838);
        if (arg0 >= -111) {
            this.field370 = null;
        }
        byte[] var18 = arg1.method29(class1.field17, class27.field379, -47);
        this.method170(var18, -707857274);
        byte[] var19 = arg1.method29(class12.field117, class27.field379, -99);
        class35.field485 = 0;
        this.method167(var19, -64);
        this.method177(-1, var16);
    }

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "([BI)V", line = 1555)
    private final void method173(byte[] arg0, int arg1) {
        int var3 = 0;
        if (arg1 != 12838) {
            this.field374 = null;
        }
        while (true) {
            while (var3 < arg0.length) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - field364;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class28.field387;
                if (var4 > 0 && var5 > 0 && class1.field4 > var4 + 64 && var5 + 64 < class19.field170) {
                    class12.field113 = class19.field170 - var5 - 1 >> 6;
                    class19.field172 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class18.method86(3, var9, var4 + var6, class19.field170 - (var5 - (-64 - var7)) - 1, 21925);
                                if (class1.field13[class12.field113][class19.field172] == null) {
                                    class1.field13[class12.field113][class19.field172] = new class1();
                                    class1.field13[class12.field113][class19.field172].field18 = new byte[4096];
                                }
                                class1.field13[class12.field113][class19.field172].field18[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class1.field13[class12.field113][class19.field172] != null) {
                        class1.field13[class12.field113][class19.field172].method3(arg1 - 12838);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg0[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(BIIIIIIII)V", line = 1637)
    public final void method174(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field360 = 0;
        int var10 = arg2 - arg5;
        int var11 = arg6 - arg4;
        int var12 = (arg8 - arg7 << 16) / var10;
        int var13 = (arg1 - arg3 << 16) / var11;
        int var14 = 108 / ((29 - arg0) / 54);
        for (int var15 = 0; var15 < var10; var15++) {
            int var16 = var12 * var15 >> 16;
            int var17 = (var15 + 1) * var12 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                class38.method265(arg4, (byte) 118, arg5 + var15);
                for (int var19 = 0; var19 < var11; var19++) {
                    int var20 = var13 * var19 >> 16;
                    int var21 = (var19 + 1) * var13 >> 16;
                    int var22 = var21 - var20;
                    if (var22 > 0) {
                        int var23 = class38.method262(665538502) & 0xFF;
                        if (var23 != 0) {
                            int var24;
                            if (var18 == 1) {
                                var24 = var16;
                            } else {
                                var24 = var17 - 1;
                            }
                            int var25;
                            if (var22 == 1) {
                                var25 = var20;
                            } else {
                                var25 = var21 - 1;
                            }
                            int var26 = 13421772;
                            if (var23 >= 5 && var23 <= 8 || var23 >= 13 && var23 <= 16 || var23 >= 21 && var23 <= 24 || var23 == 27 || var23 == 28) {
                                var23 -= 4;
                                var26 = 13369344;
                            }
                            if (var23 == 1) {
                                class23.method128(var16, var20, var22, var26);
                            } else if (var23 == 2) {
                                class23.method117(var16, var20, var18, var26);
                            } else if (var23 == 3) {
                                class23.method128(var24, var20, var22, var26);
                            } else if (var23 == 4) {
                                class23.method117(var16, var25, var18, var26);
                            } else if (var23 == 9) {
                                class23.method128(var16, var20, var22, 16777215);
                                class23.method117(var16, var20, var18, var26);
                            } else if (var23 == 10) {
                                class23.method128(var24, var20, var22, 16777215);
                                class23.method117(var16, var20, var18, var26);
                            } else if (var23 == 11) {
                                class23.method128(var24, var20, var22, 16777215);
                                class23.method117(var16, var25, var18, var26);
                            } else if (var23 == 12) {
                                class23.method128(var16, var20, var22, 16777215);
                                class23.method117(var16, var25, var18, var26);
                            } else if (var23 == 17) {
                                class23.method117(var16, var20, 1, var26);
                            } else if (var23 == 18) {
                                class23.method117(var24, var20, 1, var26);
                            } else if (var23 == 19) {
                                class23.method117(var24, var25, 1, var26);
                            } else if (var23 == 20) {
                                class23.method117(var16, var25, 1, var26);
                            } else if (var23 == 25) {
                                for (int var27 = 0; var27 < var22; var27++) {
                                    class23.method117(var16 + var27, var25 - var27, 1, var26);
                                }
                            } else if (var23 == 26) {
                                for (int var28 = 0; var28 < var22; var28++) {
                                    class23.method117(var16 + var28, var20 + var28, 1, var26);
                                }
                            }
                        }
                        int var29 = class3.method9((byte) 123) & 0xFF;
                        if (var29 != 0) {
                            this.field368[this.field360] = var29 - 1;
                            this.field374[this.field360] = var18 / 2 + var16;
                            this.field373[this.field360] = var22 / 2 + var20;
                            this.field360++;
                        }
                    }
                    class34.method223((byte) -97);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIIIZIII)V", line = 1817)
    public final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 - arg4;
        int var11 = arg0 - arg6;
        int var12 = (arg8 - arg1 << 16) / var11;
        int var13 = (arg3 - arg7 << 16) / var10;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = var13 * var14 >> 16;
            int var16 = (var14 + 1) * var13 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                int var18 = arg7 + var16;
                class38.method265(arg6, (byte) 118, arg4 + var14);
                int var19 = arg7 + var15;
                for (int var20 = 0; var20 < var11; var20++) {
                    int var21 = (var20 + 1) * var12 >> 16;
                    int var22 = var12 * var20 >> 16;
                    int var23 = var21 - var22;
                    if (var23 > 0) {
                        int var24 = arg1 + var21;
                        int var25 = arg1 + var22;
                        int var26 = class13.method56(79);
                        int var27 = class22.method114(-24983);
                        if (var26 == 0 && var27 == 0) {
                            class23.method122(var19, var25, var18 - var19, -var25 + var24, class8.method24(1));
                        } else {
                            byte var28 = class36.method250((byte) -125);
                            int var29 = var28 & 0xFC;
                            if (var29 == 0 || var17 <= 1 || var23 <= 1) {
                                class23.method122(var19, var25, var17, var23, var26);
                            } else {
                                this.method165(var26, var17, -78, true, class8.method24(1), class23.field231 * var25 + var19, var23, var28 & 0x3, class23.field226, var29 >> 2);
                            }
                            if (var27 > 0) {
                                byte var30 = method166(false);
                                int var31 = var30 & 0xFC;
                                if (var31 == 0 || var17 <= 1 || var23 <= 1) {
                                    class23.method122(var19, var25, var17, var23, var27);
                                }
                                this.method165(var27, var17, -74, var26 == 0, class8.method24(1), class23.field231 * var25 + var19, var23, var30 & 0x3, class23.field226, var31 >> 2);
                            }
                        }
                    }
                    class34.method223((byte) -97);
                }
            }
        }
        if (arg5) {
            this.method165(41, 101, 86, true, -16, 54, -101, 13, null, 95);
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([[B[BI)V", line = 1908)
    private final void method176(byte[][] arg0, byte[] arg1, int arg2) {
        int var4 = 0;
        while (true) {
            while (var4 < arg1.length) {
                int var5 = (arg1[var4++] & 0xFF) * 64 - field364;
                int var6 = (arg1[var4++] & 0xFF) * 64 - class28.field387;
                if (var5 > 0 && var6 > 0 && var5 + 64 < class1.field4 && class19.field170 > var6 + 64) {
                    for (int var7 = 0; var7 < 64; var7++) {
                        byte[] var8 = arg0[var7 + var5];
                        int var9 = class19.field170 - var6 - 1;
                        for (int var10 = -64; var10 < 0; var10++) {
                            var8[var9--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            if (arg2 != -4) {
                this.field370 = null;
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I[[B)V", line = 1954)
    private final void method177(int arg0, byte[][] arg1) {
        int var3 = class1.field4;
        if (arg0 != -1) {
            return;
        }
        int var4 = class19.field170;
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = 0;
        }
        for (int var7 = 5; var7 < var3 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var4; var10++) {
                int var11 = class38.field513[var8[var10] & 0xFF];
                int var12 = class38.field513[var9[var10] & 0xFF];
                if (var11 <= 0 && mapview.method156(var7 + 5, true, var10) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && mapview.method156(var7 - 5, true, var10) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var3 - 10 > var7) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var4 - 5; var16++) {
                    int var17 = var5[var16 + 5];
                    int var18 = var5[var16 - 5];
                    var14 += (var17 >> 10 & 0x3FF) - ((var18 & 0xFFFAD) >> 10);
                    var13 += (var17 >> 20) - (var18 >> 20);
                    var15 += (var17 & 0x3FF) - (var18 & 0x3FF);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class24.field247[var20][var19] == null) {
                            class24.field247[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) <= 0) {
                            class24.field247[var20][var19][class31.method206(63, var7) + class31.method206(var16 << 6, 4032)] = 0;
                        } else {
                            class24.field247[var20][var19][class31.method206(63, var7) + (class31.method206(var16, 63) << 6)] = this.method179(3, (double) var13 / 8533.0D, (double) var15 / 8533.0D, (double) var14 / 8533.0D);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(Z)V", line = 2057)
    public static void method178(boolean arg0) {
        field367 = null;
        field362 = null;
        if (!arg0) {
            method178(true);
        }
        field366 = null;
        field371 = null;
        field372 = null;
        field365 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IDDD)I", line = 2087)
    private final int method179(int arg0, double arg1, double arg2, double arg3) {
        double var8 = arg2;
        double var10 = arg2;
        if (arg0 != 3) {
            field372 = null;
        }
        double var12 = arg2;
        if (arg3 != 0.0D) {
            double var14;
            if (arg2 < 0.5D) {
                var14 = (arg3 + 1.0D) * arg2;
            } else {
                var14 = arg2 + arg3 - arg2 * arg3;
            }
            double var16 = arg2 * 2.0D - var14;
            double var18 = arg1 + 0.3333333333333333D;
            if (var18 > 1.0D) {
                var18--;
            }
            if (var18 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * var18 + var16;
            } else if (var18 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (-var18 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var10 = var16;
            }
            if (arg1 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * arg1 + var16;
            } else if (arg1 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (arg1 * 3.0D < 2.0D) {
                var8 = (var14 - var16) * (-arg1 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var8 = var16;
            }
            double var22 = arg1 - 0.3333333333333333D;
            if (var22 < 0.0D) {
                var22++;
            }
            if (var22 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var22 + var16;
            } else if (var22 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var22 * 3.0D < 2.0D) {
                var12 = (var14 - var16) * (-var22 + 0.6666666666666666D) * 6.0D + var16;
            } else {
                var12 = var16;
            }
        }
        int var24 = (int) (var8 * 256.0D);
        int var25 = (int) (var12 * 256.0D);
        int var26 = (int) (var10 * 256.0D);
        return (var24 << 8) + (var26 << 16) + var25;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIIIIIIID)V", line = 2176)
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, double arg9) {
        int var12 = arg4 - arg8;
        int var13 = (arg6 - arg0 << 16) / var12;
        int var14 = 6 / ((-arg3 - 77) / 49);
        int var15 = arg7 - arg5;
        int var16 = (arg1 - arg2 << 16) / var15;
        if (arg7 - arg5 > -arg2 + arg1) {
            return;
        }
        this.field360 = 0;
        for (int var17 = 0; var17 < var15; var17++) {
            int var18 = var16 * var17 >> 16;
            int var19 = (var17 + 1) * var16 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                class38.method265(arg8, (byte) 118, arg5 + var17);
                for (int var21 = 0; var21 < var12; var21++) {
                    int var22 = var13 * var21 >> 16;
                    int var23 = (var21 + 1) * var13 >> 16;
                    int var24 = var23 - var22;
                    if (var24 > 0) {
                        int var25 = class31.method207(258) & 0xFF;
                        if (var25 != 0) {
                            if (var25 == 47 || var25 == 53) {
                                if (!(arg9 < 4.0D) && arg9 > 4.2D && arg9 > 6.2D) {
                                }
                                class8.field68[var25 - 1].method10(var18, var22, var20 * 2 + 1, var24 * 2 + 1);
                            } else {
                                class8.field68[var25 - 1].method10(var18 - var20 / 2, -(var24 / 2) + var22, var20 * 2, var24 * 2);
                            }
                        }
                    }
                    class34.method223((byte) -97);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IIIIIIIIIII)V", line = 2305)
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field360 == 0) {
            int var12 = arg2 - arg0;
            int var13 = arg8 - arg6;
            int var14 = (arg3 - arg7 << 16) / var12;
            int var15 = (arg1 - arg5 << 16) / var13;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = (var16 + 1) * var14 >> 16;
                int var18 = var14 * var16 >> 16;
                int var19 = var17 - var18;
                if (var19 > 0) {
                    class38.method265(arg6, (byte) 118, arg0 + var16);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = (var20 + 1) * var15 >> 16;
                        int var22 = var15 * var20 >> 16;
                        int var23 = var21 - var22;
                        if (var23 > 0) {
                            int var24 = class3.method9((byte) 114) & 0xFF;
                            if (var24 != 0) {
                                this.field368[this.field360] = var24 - 1;
                                this.field374[this.field360] = var19 / 2 + var18;
                                this.field373[this.field360] = var23 / 2 + var22;
                                this.field360++;
                            }
                        }
                        class34.method223((byte) -97);
                    }
                }
            }
        }
        if (arg9 > -32) {
            this.method165(-34, -5, -113, false, -99, 79, -53, 89, null, 32);
        }
        for (int var25 = 0; var25 < this.field360; var25++) {
            if (class35.field487[this.field368[var25]] != null) {
                class35.field487[this.field368[var25]].method47(this.field374[var25] - 7, this.field373[var25] - 7);
            }
        }
        if (arg4 > 0) {
            for (int var26 = 0; var26 < this.field360; var26++) {
                if (this.field368[var26] == arg10) {
                    class35.field487[this.field368[var26]].method47(this.field374[var26] - 7, this.field373[var26] + -7);
                    if (arg4 % 10 < 5) {
                        class23.method120(this.field374[var26], this.field373[var26], 15, 16776960, 128);
                        class23.method120(this.field374[var26], this.field373[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field360 = 0;
    }
}
