import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class401 {

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "[I")
    private int[] field5495;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "[I")
    private int[] field5502;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Lrc;")
    public static class108 field5500 = new class108(82, -1);

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lrc;")
    public static class108 field5506 = new class108(68, 0);

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    private int field5490;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    private int field5494;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    private int field5496;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    private int field5504;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field5505;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method2410(int arg0) {
        field5506 = null;
        field5505 = null;
        if (arg0 != 0) {
            field5505 = null;
        }
        field5500 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILkk;)Lf;")
    public static final class173 method2411(int arg0, class161 arg1) {
        field5499++;
        if (arg0 != 4095) {
            field5505 = null;
        }
        return new class173(arg1.method1163(arg0 ^ 0x28FB), arg1.method1163(9988), arg1.method1163(9988), arg1.method1163(arg0 + 5893), arg1.method1178((byte) 63), arg1.method1172((byte) -128));
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIBIILpf;IIIII)Z")
    public static final boolean method2412(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class18 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field5493++;
        int var12 = arg10;
        int var13 = arg4;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg10 - var14;
        class313.field4424[var14][var15] = 99;
        int var17 = arg4 - var15;
        class432.field6113[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class270.field3936[var18] = arg10;
        int var35 = var18 + 1;
        class35.field374[var18] = arg4;
        int[][] var20 = arg6.field176;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class437.field6219 = var12;
                                    class341.field4716 = var13;
                                    if (arg3 != 70) {
                                        method2411(-68, (class161) null);
                                    }
                                    return false;
                                }
                                var13 = class35.field374[var19];
                                var12 = class270.field3936[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg6.field182;
                                var24 = var13 - arg6.field187;
                                if (arg8 == -4) {
                                    if (arg1 == var12 && arg9 == var13) {
                                        class341.field4716 = var13;
                                        class437.field6219 = var12;
                                        return true;
                                    }
                                } else if (arg8 == -3) {
                                    if (class312.method1987(arg11, arg11, arg2, arg1, (byte) 78, arg5, var13, arg9, var12)) {
                                        class437.field6219 = var12;
                                        class341.field4716 = var13;
                                        return true;
                                    }
                                } else if (arg8 == -2) {
                                    if (arg6.method114(arg5, arg9, arg11, (byte) -84, arg11, arg1, arg7, arg2, var12, var13)) {
                                        class341.field4716 = var13;
                                        class437.field6219 = var12;
                                        return true;
                                    }
                                } else if (arg8 == -1) {
                                    if (arg6.method127(arg7, arg1, arg9, arg2, var12, (byte) 64, var13, arg11, arg5)) {
                                        class437.field6219 = var12;
                                        class341.field4716 = var13;
                                        return true;
                                    }
                                } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                                    if (arg6.method121(arg1, arg11, var13, arg8, (byte) -113, var12, arg0, arg9)) {
                                        class341.field4716 = var13;
                                        class437.field6219 = var12;
                                        return true;
                                    }
                                } else if (arg6.method129(var12, arg11, arg1, arg9, arg0, arg3 ^ 0xFFFFFFB9, var13, arg8)) {
                                    class341.field4716 = var13;
                                    class437.field6219 = var12;
                                    return true;
                                }
                                var26 = class432.field6113[var22][var21] + 1;
                                if (var22 > 0 && class313.field4424[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg11 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg11 - 1) {
                                            class270.field3936[var35] = var12 - 1;
                                            class35.field374[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class313.field4424[var22 - 1][var21] = 2;
                                            class432.field6113[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < (128 - arg11) && class313.field4424[var22 + 1][var21] == 0 && (var20[arg11 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg11][arg11 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= (arg11 - 1)) {
                                            class270.field3936[var35] = var12 + 1;
                                            class35.field374[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class313.field4424[var22 + 1][var21] = 8;
                                            class432.field6113[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg11][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class313.field4424[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg11 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg11 - 1) <= var29) {
                                            class270.field3936[var35] = var12;
                                            class35.field374[var35] = var13 - 1;
                                            class313.field4424[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class432.field6113[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg11) && class313.field4424[var22][var21 + 1] == 0 && (var20[var23][var24 + arg11] & 0x4E240000) == 0 && (var20[arg11 + var23 - 1][arg11 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg11 - 1)) {
                                            class270.field3936[var35] = var12;
                                            class35.field374[var35] = var13 + 1;
                                            class313.field4424[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class432.field6113[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg11 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class313.field4424[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg11) {
                                            class270.field3936[var35] = var12 - 1;
                                            class35.field374[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class313.field4424[var22 - 1][var21 - 1] = 3;
                                            class432.field6113[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < 128 - arg11 && var21 > 0 && class313.field4424[var22 + 1][var21 - 1] == 0 && (var20[arg11 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg11) {
                                            class270.field3936[var35] = var12 + 1;
                                            class35.field374[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class313.field4424[var22 + 1][var21 - 1] = 9;
                                            class432.field6113[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg11 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && (128 - arg11) > var21 && class313.field4424[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg11] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg11; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg11 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class270.field3936[var35] = var12 - 1;
                                    class35.field374[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class313.field4424[var22 - 1][var21 + 1] = 6;
                                    class432.field6113[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg11) <= var22);
                        } while (128 - arg11 <= var21);
                    } while (class313.field4424[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg11 + var23][arg11 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg11; var34++) {
                    if ((var20[var23 + var34][var24 + arg11] & 0x7E240000) != 0 || (var20[arg11 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class270.field3936[var35] = var12 + 1;
                class35.field374[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class313.field4424[var22 + 1][var21 + 1] = 12;
                class432.field6113[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    private final void method2413(byte arg0) {
        field5489++;
        this.field5496 += ++this.field5504;
        if (arg0 >= -42) {
            field5506 = null;
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5502[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5494 ^= this.field5494 << 13;
                } else {
                    this.field5494 ^= this.field5494 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5494 ^= this.field5494 << 2;
            } else {
                this.field5494 ^= this.field5494 >>> 16;
            }
            this.field5494 += this.field5502[var2 + 128 & 0xFF];
            int var4;
            this.field5502[var2] = var4 = this.field5496 + this.field5502[class88.method739(var3, 1020) >> 2] + this.field5494;
            this.field5495[var2] = this.field5496 = this.field5502[class88.method739(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V")
    private final void method2414(byte arg0) {
        field5501++;
        if (arg0 != 91) {
            this.method2413((byte) 24);
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var63 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var66 + var69;
            int var71 = var3 + var6;
            var5 = var70 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var71;
            var4 = var73 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field5495[var11 + 6] + var3;
            int var38 = this.field5495[var11] + var9;
            int var39 = this.field5495[var11 + 3] + var6;
            int var40 = this.field5495[var11 + 5] + var4;
            int var41 = this.field5495[var11 + 1] + var8;
            int var42 = this.field5495[var11 + 4] + var5;
            int var43 = this.field5495[var11 + 7] + var2;
            int var44 = this.field5495[var11 + 2] + var7;
            int var45 = var38 ^ var41 << 11;
            int var46 = var39 + var45;
            int var47 = var41 + var44;
            int var48 = var47 ^ var44 >>> 2;
            int var49 = var42 + var48;
            int var50 = var44 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var40 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var37;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var43;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field5502[var11] = var9;
            this.field5502[var11 + 1] = var8;
            this.field5502[var11 + 2] = var7;
            this.field5502[var11 + 3] = var6;
            this.field5502[var11 + 4] = var5;
            this.field5502[var11 + 5] = var4;
            this.field5502[var11 + 6] = var3;
            this.field5502[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field5502[var12 + 6] + var3;
            int var14 = this.field5502[var12 + 5] + var4;
            int var15 = this.field5502[var12 + 2] + var7;
            int var16 = this.field5502[var12 + 4] + var5;
            int var17 = this.field5502[var12] + var9;
            int var18 = this.field5502[var12 + 7] + var2;
            int var19 = this.field5502[var12 + 1] + var8;
            int var20 = this.field5502[var12 + 3] + var6;
            int var21 = var17 ^ var19 << 11;
            int var22 = var15 + var19;
            int var23 = var20 + var21;
            int var24 = var22 ^ var15 >>> 2;
            int var25 = var16 + var24;
            int var26 = var15 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var23 + var25;
            int var29 = var14 + var27;
            var6 = var28 ^ var25 >>> 16;
            int var30 = var6 + var13;
            int var31 = var25 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var18;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var30 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            int var36 = var33 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field5502[var12] = var9;
            this.field5502[var12 + 1] = var8;
            this.field5502[var12 + 2] = var7;
            this.field5502[var12 + 3] = var6;
            this.field5502[var12 + 4] = var5;
            this.field5502[var12 + 5] = var4;
            this.field5502[var12 + 6] = var3;
            this.field5502[var12 + 7] = var2;
        }
        this.method2413((byte) -68);
        this.field5490 = 256;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method2415(int[] arg0, int arg1) {
        if (arg1 != 947) {
            method2411(71, (class161) null);
        }
        field5488++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class389.field5380;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class162 var5 = class93.field1312.method1968(arg1 ^ 0x390, arg0[var4]);
            if (var5.field2351 != -1) {
                class417 var6 = (class417) class424.field5869.method2113(0, (long) var5.field2351);
                if (var6 == null) {
                    class355 var7 = class355.method2187(class454.field6440, var5.field2351, 0);
                    if (var7 != null) {
                        var6 = class374.field5152.method302(var7, true);
                        class424.field5869.method2116((long) var5.field2351, (byte) -44, var6);
                    }
                }
                if (var6 != null) {
                    class387.field5303[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static final void method2416(int arg0) {
        class430.field6032.method1101((byte) 61);
        field5492++;
        if (arg0 == 6) {
            class270.field3937.method1960(-257);
            class402.field5511.method1960(-257);
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)I")
    public final int method2417(int arg0) {
        if (this.field5490 == 0) {
            this.method2413((byte) -51);
            this.field5490 = 256;
        }
        field5503++;
        if (arg0 >= -52) {
            method2416(6);
        }
        return this.field5495[--this.field5490];
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)I")
    public final int method2418(int arg0) {
        field5498++;
        if (this.field5490 == 0) {
            this.method2413((byte) -95);
            this.field5490 = 256;
        }
        return arg0 == -15001 ? this.field5495[this.field5490 - 1] : -38;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    private class401() {
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "([I)V")
    public class401(int[] arg0) {
        this.field5495 = new int[256];
        this.field5502 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5495[var2] = arg0[var2];
        }
        this.method2414((byte) 91);
    }
}
