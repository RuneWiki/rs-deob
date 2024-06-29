import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 extends class56 {

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    private int field94 = -1;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    private int field91 = -32768;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "Lc;")
    private class103 field107 = null;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    private int field113 = -1;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    private int field96;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    private int field93;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    private int field110;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Lde;")
    private class106 field90;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    private int field103;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "Z")
    public static boolean field102;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "[I")
    public static int[] field106;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "[[[B")
    public static byte[][][] field109;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZII[[[Lck;II)Z")
    public static final boolean method37(boolean arg0, int arg1, int arg2, class208[][][] arg3, int arg4, int arg5) {
        field114++;
        int var6 = 109 / ((-arg5 - 29) / 63);
        byte var7 = arg0 ? 1 : (byte) (class50.field873 & 0xFF);
        if (class99.field1782[class116.field2066][arg2][arg1] == var7) {
            return false;
        } else if ((class228.field3952[class116.field2066][arg2][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var8 = 0;
            class24.field349[var8] = arg2;
            int var32 = var8 + 1;
            class34.field512[var8] = arg1;
            class99.field1782[class116.field2066][arg2][arg1] = var7;
            int var9 = 0;
            while (var32 != var9) {
                int var10 = class24.field349[var9] >> 16 & 0xFF;
                int var11 = class24.field349[var9] & 0xFFFF;
                int var12 = class24.field349[var9] >> 24 & 0xFF;
                int var13 = class34.field512[var9] & 0xFFFF;
                int var14 = class34.field512[var9] >> 16 & 0xFF;
                var9 = var9 + 1 & 0xFFF;
                boolean var15 = false;
                boolean var16 = false;
                if ((class228.field3952[class116.field2066][var11][var13] & 0x4) == 0) {
                    var15 = true;
                }
                label225: for (int var17 = class116.field2066 + 1; var17 <= 3; var17++) {
                    if ((class228.field3952[var17][var11][var13] & 0x8) == 0) {
                        if (var15 && arg3[var17][var11][var13] != null) {
                            if (arg3[var17][var11][var13].field3656 != null) {
                                int var20 = class43.method302(var10, (byte) -25);
                                if (arg3[var17][var11][var13].field3656.field4029 == var20 || arg3[var17][var11][var13].field3656.field4030 == var20) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var21 = class43.method302(var12, (byte) -25);
                                    if (arg3[var17][var11][var13].field3656.field4029 == var21 || arg3[var17][var11][var13].field3656.field4030 == var21) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var22 = class43.method302(var14, (byte) -25);
                                    if (arg3[var17][var11][var13].field3656.field4029 == var22 || arg3[var17][var11][var13].field3656.field4030 == var22) {
                                        continue;
                                    }
                                }
                            }
                            if (arg3[var17][var11][var13].field3650 != null) {
                                for (int var23 = 0; var23 < arg3[var17][var11][var13].field3646; var23++) {
                                    int var24 = (int) (arg3[var17][var11][var13].field3650[var23].field3728 >> 20 & 0x3L);
                                    int var25 = (int) (arg3[var17][var11][var13].field3650[var23].field3728 >> 14 & 0x3FL);
                                    if (var25 == 21) {
                                        var25 = 19;
                                    }
                                    int var26 = var24 << 6 | var25;
                                    if (var10 == var26 || var12 != 0 && var12 == var26 || var14 != 0 && var14 == var26) {
                                        continue label225;
                                    }
                                }
                            }
                        }
                        class208 var27 = arg3[var17][var11][var13];
                        var16 = true;
                        if (var27 != null && var27.field3646 > 0) {
                            for (int var28 = 0; var28 < var27.field3646; var28++) {
                                class213 var29 = var27.field3650[var28];
                                if (var29.field3737 != var29.field3731 || var29.field3729 != var29.field3722) {
                                    for (int var30 = var29.field3731; var30 <= var29.field3737; var30++) {
                                        for (int var31 = var29.field3729; var31 <= var29.field3722; var31++) {
                                            class99.field1782[var17][var30][var31] = var7;
                                        }
                                    }
                                }
                            }
                        }
                        class99.field1782[var17][var11][var13] = var7;
                    }
                }
                if (var16) {
                    int var18 = var11 << 7;
                    int var19 = var13 << 7;
                    if (class245.field4193[class116.field2066 + 1][var11][var13] > class215.field3775[arg4]) {
                        class215.field3775[arg4] = class245.field4193[class116.field2066 + 1][var11][var13];
                    }
                    if (class142.field2454[arg4] > var18) {
                        class142.field2454[arg4] = var18;
                    } else if (var18 > class182.field3107[arg4]) {
                        class182.field3107[arg4] = var18;
                    }
                    if (var19 < class5.field60[arg4]) {
                        class5.field60[arg4] = var19;
                    } else if (class114.field2051[arg4] < var19) {
                        class114.field2051[arg4] = var19;
                    }
                }
                if (!var15) {
                    if (var11 >= 1 && class99.field1782[class116.field2066][var11 - 1][var13] != var7) {
                        class24.field349[var32] = class75.method528(-754974720, class75.method528(1179648, var11 - 1));
                        class34.field512[var32] = class75.method528(var13, 1245184);
                        class99.field1782[class116.field2066][var11 - 1][var13] = var7;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    var13++;
                    if (var13 < 104) {
                        if (var11 - 1 >= 0 && class99.field1782[class116.field2066][var11 - 1][var13] != var7 && (class228.field3952[class116.field2066][var11][var13] & 0x4) == 0 && (class228.field3952[class116.field2066][var11 - 1][var13 - 1] & 0x4) == 0) {
                            class24.field349[var32] = class75.method528(class75.method528(1179648, var11 - 1), 1375731712);
                            class34.field512[var32] = class75.method528(1245184, var13);
                            class99.field1782[class116.field2066][var11 - 1][var13] = var7;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (class99.field1782[class116.field2066][var11][var13] != var7) {
                            class24.field349[var32] = class75.method528(class75.method528(5373952, var11), 318767104);
                            class34.field512[var32] = class75.method528(5439488, var13);
                            class99.field1782[class116.field2066][var11][var13] = var7;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if (var11 + 1 < 104 && class99.field1782[class116.field2066][var11 + 1][var13] != var7 && (class228.field3952[class116.field2066][var11][var13] & 0x4) == 0 && (class228.field3952[class116.field2066][var11 + 1][var13 - 1] & 0x4) == 0) {
                            class24.field349[var32] = class75.method528(class75.method528(5373952, var11 + 1), -1845493760);
                            class34.field512[var32] = class75.method528(var13, 5439488);
                            class99.field1782[class116.field2066][var11 + 1][var13] = var7;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if ((var11 + 1) < 104 && class99.field1782[class116.field2066][var11 + 1][var13] != var7) {
                        class24.field349[var32] = class75.method528(class75.method528(var11 + 1, 9568256), 1392508928);
                        class34.field512[var32] = class75.method528(var13, 9633792);
                        class99.field1782[class116.field2066][var11 + 1][var13] = var7;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if (var11 - 1 >= 0 && class99.field1782[class116.field2066][var11 - 1][var13] != var7 && (class228.field3952[class116.field2066][var11][var13] & 0x4) == 0 && (class228.field3952[class116.field2066][var11 - 1][var13 + 1] & 0x4) == 0) {
                            class24.field349[var32] = class75.method528(class75.method528(13762560, var11 - 1), 301989888);
                            class34.field512[var32] = class75.method528(13828096, var13);
                            var32 = var32 + 1 & 0xFFF;
                            class99.field1782[class116.field2066][var11 - 1][var13] = var7;
                        }
                        if (class99.field1782[class116.field2066][var11][var13] != var7) {
                            class24.field349[var32] = class75.method528(class75.method528(var11, 13762560), -1828716544);
                            class34.field512[var32] = class75.method528(13828096, var13);
                            var32 = var32 + 1 & 0xFFF;
                            class99.field1782[class116.field2066][var11][var13] = var7;
                        }
                        if ((var11 + 1) < 104 && class99.field1782[class116.field2066][var11 + 1][var13] != var7 && (class228.field3952[class116.field2066][var11][var13] & 0x4) == 0 && (class228.field3952[class116.field2066][var11 + 1][var13 + 1] & 0x4) == 0) {
                            class24.field349[var32] = class75.method528(-771751936, class75.method528(9568256, var11 + 1));
                            class34.field512[var32] = class75.method528(var13, 9633792);
                            class99.field1782[class116.field2066][var11 + 1][var13] = var7;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class215.field3775[arg4] != -1000000) {
                class215.field3775[arg4] += 10;
                class142.field2454[arg4] -= 50;
                class182.field3107[arg4] += 50;
                class114.field2051[arg4] += 50;
                class5.field60[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V")
    public static final void method38(byte arg0) {
        field108++;
        int var1 = class189.field3249.method490(0, 8);
        if (var1 < class196.field3375) {
            for (int var2 = var1; var2 < class196.field3375; var2++) {
                class5.field61[class51.field895++] = class151.field2556[var2];
            }
        }
        if (var1 > class196.field3375) {
            throw new RuntimeException("gppov1");
        } else if (arg0 == -4) {
            class196.field3375 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class151.field2556[var3];
                class44 var5 = class249.field4291[var4];
                int var6 = class189.field3249.method490(arg0 + 4, 1);
                if (var6 == 0) {
                    class151.field2556[class196.field3375++] = var4;
                    var5.field1009 = class151.field2555;
                } else {
                    int var7 = class189.field3249.method490(0, 2);
                    if (var7 == 0) {
                        class151.field2556[class196.field3375++] = var4;
                        var5.field1009 = class151.field2555;
                        class36.field564[class241.field4151++] = var4;
                    } else if (var7 == 1) {
                        class151.field2556[class196.field3375++] = var4;
                        var5.field1009 = class151.field2555;
                        int var8 = class189.field3249.method490(0, 3);
                        var5.method393(false, (byte) 60, var8);
                        int var9 = class189.field3249.method490(0, 1);
                        if (var9 == 1) {
                            class36.field564[class241.field4151++] = var4;
                        }
                    } else if (var7 == 2) {
                        class151.field2556[class196.field3375++] = var4;
                        var5.field1009 = class151.field2555;
                        int var10 = class189.field3249.method490(0, 3);
                        var5.method393(true, (byte) 85, var10);
                        int var11 = class189.field3249.method490(0, 3);
                        var5.method393(true, (byte) -90, var11);
                        int var12 = class189.field3249.method490(0, 1);
                        if (var12 == 1) {
                            class36.field564[class241.field4151++] = var4;
                        }
                    } else if (var7 == 3) {
                        class5.field61[class51.field895++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIII)V")
    public final void method39(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            this.field96 = 90;
        }
        field112++;
        this.method45((arg2 + (arg0 - arg2 >> 1)) * 128 + 64, 0, ((arg3 - arg4 >> 1) + arg4) * 128 + 64);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
    public static void method40(byte arg0) {
        field106 = null;
        if (arg0 <= 54) {
            method46((class255) null, 78);
        }
        field109 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZILjb;)V")
    public static final void method41(int arg0, int arg1, boolean arg2, int arg3, class255 arg4) {
        field101++;
        int var5 = arg4.field4482;
        int var6 = -122 % ((-arg3 - 12) / 53);
        int var7 = arg4.field4513;
        if (arg4.field4400 == 0) {
            arg4.field4482 = arg4.field4533;
        } else if (arg4.field4400 == 1) {
            arg4.field4482 = arg0 - arg4.field4533;
        } else if (arg4.field4400 == 2) {
            arg4.field4482 = arg4.field4533 * arg0 >> 14;
        } else if (arg4.field4400 == 3) {
            if (arg4.field4436 == 2) {
                arg4.field4482 = (arg4.field4533 - 1) * arg4.field4558 + arg4.field4533 * 32;
            } else if (arg4.field4436 == 7) {
                arg4.field4482 = (arg4.field4533 - 1) * arg4.field4558 + arg4.field4533 * 12;
            }
        }
        if (arg4.field4465 == 0) {
            arg4.field4513 = arg4.field4510;
        } else if (arg4.field4465 == 1) {
            arg4.field4513 = arg1 - arg4.field4510;
        } else if (arg4.field4465 == 2) {
            arg4.field4513 = arg4.field4510 * arg1 >> 14;
        } else if (arg4.field4465 == 3) {
            if (arg4.field4436 == 2) {
                arg4.field4513 = (arg4.field4510 - 1) * arg4.field4504 + arg4.field4510 * 32;
            } else if (arg4.field4436 == 7) {
                arg4.field4513 = (arg4.field4510 - 1) * arg4.field4504 + arg4.field4510 * 115;
            }
        }
        if (arg4.field4465 == 4) {
            arg4.field4513 = arg4.field4482 * arg4.field4451 / arg4.field4448;
        }
        if (arg4.field4400 == 4) {
            arg4.field4482 = arg4.field4513 * arg4.field4448 / arg4.field4451;
        }
        if (class183.field3134 && (client.method987(arg4) != 0 || arg4.field4436 == 0)) {
            if (arg4.field4482 < 5 && arg4.field4513 < 5) {
                arg4.field4513 = 5;
                arg4.field4482 = 5;
            } else {
                if (arg4.field4482 <= 0) {
                    arg4.field4482 = 5;
                }
                if (arg4.field4513 <= 0) {
                    arg4.field4513 = 5;
                }
            }
        }
        if (arg4.field4519 == 1337) {
            class27.field420 = arg4;
        }
        if (arg2 && arg4.field4464 != null && arg4.field4513 != var7 || arg4.field4482 != var5) {
            class5 var8 = new class5();
            var8.field58 = arg4;
            var8.field67 = arg4.field4464;
            class202.field3522.method116((byte) -121, var8);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
    public static final void method42(boolean arg0, int arg1) {
        field111++;
        byte var2 = 4;
        byte[][] var3 = class194.field3314;
        if (arg1 <= 94) {
            method40((byte) 57);
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class94.field1719[var5] >> 8) * 64 - class244.field4172;
            int var12 = (class94.field1719[var5] & 0xFF) * 64 - class213.field3742;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                class21.method145(30868);
                class207.method1414(class67.field1232 * 8 - 48, class34.field529, var12, (byte) 103, (class48.field849 - 6) * 8, var11, arg0, var13);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class94.field1719[var6] >> 8) * 64 - class244.field4172;
            int var8 = (class94.field1719[var6] & 0xFF) * 64 - class213.field3742;
            byte[] var9 = var3[var6];
            if (var9 == null && class48.field849 < 800) {
                class21.method145(30868);
                for (int var10 = 0; var10 < var2; var10++) {
                    class49.method333(var7, 124, 64, var10, 64, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "()I")
    public final int method6() {
        field88++;
        return this.field91;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field100++;
        class56 var11 = this.method43((byte) -50);
        if (var11 != null) {
            var11.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field91 = var11.method6();
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)Lqb;")
    private final class56 method43(byte arg0) {
        if (arg0 != -50) {
            this.field98 = -99;
        }
        field95++;
        return this.method44(false, arg0 + 173);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(ZI)Lqb;")
    private final class56 method44(boolean arg0, int arg1) {
        boolean var3 = class245.field4193 != class225.field3920;
        class199 var4 = class110.method753(this.field110, (byte) 117);
        field115++;
        if (var4.field3474 != null) {
            var4 = var4.method1355(-1);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field96 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var7 = var4.field3473;
            var6 = var4.field3464;
        } else {
            var6 = var4.field3473;
            var7 = var4.field3464;
        }
        int var8 = (var6 + 1 >> 1) + this.field98;
        int var9 = (var7 + 1 >> 1) + this.field92;
        int var10 = (var6 >> 1) + this.field98;
        int var11 = this.field92 + (var7 >> 1);
        this.method45(var11 * 128, 0, var10 * 128);
        boolean var12 = !var3 && var4.field3461 && (this.field113 != var4.field3420 || this.field94 != this.field103 && class11.field167 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int var13 = (this.field98 << 7) + (var6 << 6);
        int[][] var14 = class245.field4193[this.field93];
        int var15 = var14[var10][var9] + var14[var10][var11] + var14[var8][var11] + var14[var8][var9] >> 2;
        int var16 = (this.field92 << 7) + (var7 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class225.field3920[0];
        } else if (this.field93 < 3) {
            var17 = class245.field4193[this.field93 + 1];
        }
        boolean var18 = this.field107 == null;
        class235 var19;
        if (this.field90 == null) {
            var19 = var4.method1361(this.field99, this.field96, var16, var12, (byte) -48, var18 ? class178.field3053 : this.field107, var15, false, var14, var13, var17);
        } else {
            var19 = var4.method1357(this.field103, 90, this.field90, this.field96, var17, var12, var13, var14, this.field99, var15, var16, var18 ? class178.field3053 : this.field107);
        }
        if (var19 == null) {
            return null;
        } else {
            if (arg1 < 92) {
                this.method39(48, true, 2, -60, -125);
            }
            return var19.field4062;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(III)V")
    private final void method45(int arg0, int arg1, int arg2) {
        field104++;
        if (this.field90 != null) {
            int var4 = class151.field2555 - this.field105;
            if (var4 > 100 && this.field90.field1853 > 0) {
                int var5 = this.field90.field1857.length - this.field90.field1853;
                while (var5 > this.field103 && var4 > this.field90.field1863[this.field103]) {
                    var4 -= this.field90.field1863[this.field103];
                    this.field103++;
                }
                if (var5 <= this.field103) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field90.field1857.length; var7++) {
                        var6 += this.field90.field1863[var7];
                    }
                    var4 %= var6;
                }
            }
            label62: {
                do {
                    do {
                        if (this.field90.field1863[this.field103] >= var4) {
                            break label62;
                        }
                        class163.method1080(this.field90, arg2, arg0, this.field103, 21983, false);
                        var4 -= this.field90.field1863[this.field103];
                        this.field103++;
                    } while (this.field90.field1857.length > this.field103);
                    this.field103 -= this.field90.field1853;
                } while (this.field103 >= 0 && this.field103 < this.field90.field1857.length);
                this.field90 = null;
            }
            this.field105 = class151.field2555 - var4;
        }
        if (arg1 != 0) {
            method37(false, 8, -30, (class208[][][]) null, -63, 112);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(Ljb;I)Z")
    public static final boolean method46(class255 arg0, int arg1) {
        field89++;
        if (arg0.field4525 == null) {
            return false;
        }
        if (arg1 < 5) {
            method46((class255) null, -46);
        }
        for (int var2 = 0; var2 < arg0.field4525.length; var2++) {
            int var3 = class86.method643((byte) 88, var2, arg0);
            int var4 = arg0.field4506[var2];
            if (arg0.field4525[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field4525[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field4525[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIIIIZLqb;)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class56 arg8) {
        this.field96 = arg2;
        this.field93 = arg3;
        this.field98 = arg4;
        this.field99 = arg1;
        this.field110 = arg0;
        this.field92 = arg5;
        if (arg6 != -1) {
            this.field90 = class101.method704(1, arg6);
            this.field103 = 0;
            this.field105 = class151.field2555 - 1;
            if (this.field90.field1852 == 0 && arg8 != null && arg8 instanceof class8) {
                class8 var10 = (class8) arg8;
                if (this.field90 == var10.field90) {
                    this.field103 = var10.field103;
                    this.field105 = var10.field105;
                    return;
                }
            }
            if (arg7 && this.field90.field1853 != -1) {
                this.field103 = (int) ((double) this.field90.field1857.length * Math.random());
                this.field105 -= (int) ((double) this.field90.field1863[this.field103] * Math.random());
                return;
            }
        }
    }
}
