import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class273 {

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "Z")
    public static boolean field4183 = true;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "Z")
    public static boolean field4184 = false;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBI)I", line = 3)
    public static final int method1793(int arg0, byte arg1, int arg2) {
        field4180++;
        if (arg1 != 69) {
            field4184 = true;
        }
        int var3 = arg0 >>> 24;
        int var4 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)I", line = 19)
    public static final int method1794(byte arg0) {
        field4185++;
        boolean var1 = false;
        boolean var2 = false;
        if (arg0 <= 75) {
            method1797(99, -68, 111, null, (byte) -27, 49, -38, null, 102, 81);
        }
        boolean var3 = false;
        if (class706.field9962.field10270 && !class706.field9962.field10262) {
            var1 = true;
            if (class547.field7815.field364 < 512 && class547.field7815.field364 != 0) {
                var1 = false;
            }
            if (class731.field10269.startsWith("win")) {
                var2 = true;
                var3 = true;
            } else {
                var2 = true;
            }
        }
        if (class64.field1031) {
            var2 = false;
        }
        if (class453.field6594) {
            var1 = false;
        }
        if (class527.field7587) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class3.method10(4);
        }
        int var4 = -1;
        int var5 = -1;
        if (var1) {
            try {
                var4 = class221.method1572(false, 2, 1000);
            } catch (Exception var15) {
            }
        }
        int var6 = -1;
        if (var3) {
            try {
                var6 = class221.method1572(false, 3, 1000);
                if (class654.field9289.field5415.method2004(3) == 3) {
                    class429 var7 = class364.field5573.method1308();
                    long var8 = var7.field6286 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field6278;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class221.method1572(false, 1, 1000);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class3.method10(4);
        }
        int var11 = (int) ((float) var6 * 1.1F);
        int var12 = (int) ((float) var5 * 1.1F);
        if (var4 > var11 && var4 > var12) {
            return class77.method699(var4, -124);
        } else if (var11 > var12) {
            return class595.method3403(-21, 3, var11);
        } else {
            return class595.method3403(-67, 1, var12);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZIIB[[[Llo;)Z", line = 195)
    public static final boolean method1795(int arg0, boolean arg1, int arg2, int arg3, byte arg4, class114[][][] arg5) {
        field4179++;
        byte var6 = arg1 ? 1 : (byte) (class475.field6901 & 0xFF);
        if (class327.field4817[class582.field8234][arg2][arg0] == var6) {
            return false;
        } else if ((class434.field6341[class582.field8234][arg2][arg0] & 0x4) == 0) {
            return false;
        } else if (arg4 <= 92) {
            return true;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class530.field7624[var7] = arg2;
            int var35 = var7 + 1;
            class174.field2998[var7] = arg0;
            class327.field4817[class582.field8234][arg2][arg0] = var6;
            while (var35 != var8) {
                int var9 = class530.field7624[var8] & 0xFFFF;
                int var10 = (class530.field7624[var8] & 0xFF19C4) >> 16;
                int var11 = class530.field7624[var8] >> 24 & 0xFF;
                int var12 = class174.field2998[var8] & 0xFFFF;
                int var13 = (class174.field2998[var8] & 0xFF5546) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class434.field6341[class582.field8234][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg5 != null) {
                    label244: for (int var16 = class582.field8234 + 1; var16 <= 3; var16++) {
                        if (arg5[var16] != null && (class434.field6341[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg5[var16][var9][var12] != null) {
                                if (arg5[var16][var9][var12].field1762 != null) {
                                    int var17 = class27.method150(var10, 4);
                                    if (arg5[var16][var9][var12].field1762.field3346 == var17 || arg5[var16][var9][var12].field1764 != null && arg5[var16][var9][var12].field1764.field3346 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class27.method150(var11, 4);
                                        if (arg5[var16][var9][var12].field1762.field3346 == var18 || arg5[var16][var9][var12].field1764 != null && arg5[var16][var9][var12].field1764.field3346 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class27.method150(var13, 4);
                                        if (arg5[var16][var9][var12].field1762.field3346 == var19 || arg5[var16][var9][var12].field1764 != null && arg5[var16][var9][var12].field1764.field3346 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class114 var20 = arg5[var16][var9][var12];
                                if (var20.field1772 != null) {
                                    for (class291 var21 = var20.field1772; var21 != null; var21 = var21.field4479) {
                                        class559 var22 = var21.field4482;
                                        if (var22 instanceof class523) {
                                            class523 var23 = (class523) var22;
                                            int var24 = var23.method85((byte) -72);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var25 = var23.method98(-12194);
                                            int var26 = var24 | var25 << 6;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class114 var27 = arg5[var16][var9][var12];
                            if (var27 != null && var27.field1772 != null) {
                                for (class291 var28 = var27.field1772; var28 != null; var28 = var28.field4479) {
                                    class559 var29 = var28.field4482;
                                    if (var29.field7931 != var29.field7927 || var29.field7934 != var29.field7930) {
                                        for (int var30 = var29.field7927; var30 <= var29.field7931; var30++) {
                                            for (int var31 = var29.field7930; var31 <= var29.field7934; var31++) {
                                                class327.field4817[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class327.field4817[var16][var9][var12] = var6;
                        }
                    }
                }
                if (var15) {
                    int var32 = class211.field3511[class582.field8234 + 1].method2160(-116, var12, var9);
                    if (class596.field8450[arg3] < var32) {
                        class596.field8450[arg3] = var32;
                    }
                    int var33 = var9 << 9;
                    if (var33 < class642.field9111[arg3]) {
                        class642.field9111[arg3] = var33;
                    } else if (class670.field9489[arg3] < var33) {
                        class670.field9489[arg3] = var33;
                    }
                    int var34 = var12 << 9;
                    if (var34 < class555.field7915[arg3]) {
                        class555.field7915[arg3] = var34;
                    } else if (class311.field4689[arg3] < var34) {
                        class311.field4689[arg3] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class327.field4817[class582.field8234][var9 - 1][var12] != var6) {
                        class530.field7624[var35] = class112.method903(-754974720, class112.method903(1179648, var9 - 1));
                        class174.field2998[var35] = class112.method903(var12, 1245184);
                        class327.field4817[class582.field8234][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class314.field4720) {
                        if ((var9 - 1) >= 0 && class327.field4817[class582.field8234][var9 - 1][var12] != var6 && (class434.field6341[class582.field8234][var9][var12] & 0x4) == 0 && (class434.field6341[class582.field8234][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class530.field7624[var35] = class112.method903(1375731712, class112.method903(var9 - 1, 1179648));
                            class174.field2998[var35] = class112.method903(1245184, var12);
                            class327.field4817[class582.field8234][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class327.field4817[class582.field8234][var9][var12] != var6) {
                            class530.field7624[var35] = class112.method903(318767104, class112.method903(var9, 5373952));
                            class174.field2998[var35] = class112.method903(var12, 5439488);
                            class327.field4817[class582.field8234][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class191.field3229 > (var9 + 1) && class327.field4817[class582.field8234][var9 + 1][var12] != var6 && (class434.field6341[class582.field8234][var9][var12] & 0x4) == 0 && (class434.field6341[class582.field8234][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class530.field7624[var35] = class112.method903(class112.method903(5373952, var9 + 1), -1845493760);
                            class174.field2998[var35] = class112.method903(var12, 5439488);
                            class327.field4817[class582.field8234][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class191.field3229 > (var9 + 1) && class327.field4817[class582.field8234][var9 + 1][var12] != var6) {
                        class530.field7624[var35] = class112.method903(class112.method903(9568256, var9 + 1), 1392508928);
                        class174.field2998[var35] = class112.method903(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class327.field4817[class582.field8234][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class327.field4817[class582.field8234][var9 - 1][var12] != var6 && (class434.field6341[class582.field8234][var9][var12] & 0x4) == 0 && (class434.field6341[class582.field8234][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class530.field7624[var35] = class112.method903(class112.method903(13762560, var9 - 1), 301989888);
                            class174.field2998[var35] = class112.method903(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class327.field4817[class582.field8234][var9 - 1][var12] = var6;
                        }
                        if (class327.field4817[class582.field8234][var9][var12] != var6) {
                            class530.field7624[var35] = class112.method903(-1828716544, class112.method903(13762560, var9));
                            class174.field2998[var35] = class112.method903(var12, 13828096);
                            class327.field4817[class582.field8234][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class191.field3229 && class327.field4817[class582.field8234][var9 + 1][var12] != var6 && (class434.field6341[class582.field8234][var9][var12] & 0x4) == 0 && (class434.field6341[class582.field8234][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class530.field7624[var35] = class112.method903(class112.method903(9568256, var9 + 1), -771751936);
                            class174.field2998[var35] = class112.method903(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class327.field4817[class582.field8234][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class596.field8450[arg3] != -1000000) {
                class596.field8450[arg3] += 40;
                class642.field9111[arg3] -= 512;
                class670.field9489[arg3] += 512;
                class311.field4689[arg3] += 512;
                class555.field7915[arg3] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILla;I)Lpia;", line = 522)
    public static final class54 method1796(int arg0, class422 arg1, int arg2) {
        field4181++;
        byte[] var3 = arg1.method2633(true, arg2);
        if (arg0 > -83) {
            field4183 = true;
        }
        return var3 == null ? null : new class54(var3);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIILpe;BIILpe;II)V", line = 549)
    public static final void method1797(int arg0, int arg1, int arg2, class109 arg3, byte arg4, int arg5, int arg6, class109 arg7, int arg8, int arg9) {
        field4182++;
        int var10 = arg7.method879(0);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        if (arg4 != -16) {
            method1797(61, 96, -119, null, (byte) 100, -15, -22, null, -37, -93);
        }
        class34 var12 = (class34) class65.field1041.method80((byte) -101, (long) var10);
        if (var12 == null) {
            class726[] var13 = class726.method4006(class101.field1494, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class364.field5573.method310(var13[0], true);
            class65.field1041.method67((long) var10, var12, arg4 - 6756);
        }
        class217.method1556(arg2 >> 1, arg3.field9475, arg1, arg3.field9477, arg9 >> 1, arg0, 0, arg3.method878(-5740) * 256, -21553, arg3.field9470);
        int var14 = class457.field6635[0] + arg6 - 18;
        int var15 = class457.field6635[1] + arg5 - 16 - 54;
        int var16 = arg8 / 4 * 18 + var14;
        int var17 = arg8 % 4 * 18 + var15;
        var12.method182(var16, var17);
        if (arg3 == arg7) {
            class364.field5573.method3179(var16 - 1, -256, 18, var17 - 1, 18, true);
        }
        class438.method2696(var17 - 1, var17 + 18, var16 + 18, (byte) 79, var16 - 1);
        class750 var18 = class428.method2668(arg4 ^ 0xFFFFFF98);
        var18.field10450 = var17;
        var18.field10455 = var17 + 16;
        var18.field10456 = var16 + 16;
        var18.field10453 = var16;
        var18.field10451 = arg7;
        class197.field3394.method3266(var18, true);
    }
}
