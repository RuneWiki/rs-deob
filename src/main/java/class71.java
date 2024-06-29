import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class71 extends class60 {

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public int field1072 = 0;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "Lib;")
    public static class102 field1070 = new class102();

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public int field1077;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lhe;")
    public class101 field1067;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "Lt;")
    public class269 field1083;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Lt;")
    public class269 field1089;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Lph;")
    public class86 field1076;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "Lpf;")
    public class92 field1084;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "Z")
    public boolean field1078;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "[I")
    public int[] field1065;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "[Leg;")
    public static class317[] field1092;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V", line = 9)
    public static final void method567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1085++;
        int var8 = 0;
        int var9 = arg3;
        if (arg4 != 30059) {
            return;
        }
        int var10 = 0;
        int var11 = arg5 - arg1;
        int var12 = arg3 - arg1;
        int var13 = arg5 * arg5;
        int var14 = arg3 * arg3;
        int var15 = var12 * var12;
        int var16 = var11 * var11;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var15 << 1;
        int var20 = arg3 << 1;
        int var21 = var16 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var20) * var13 + var17;
        int var24 = var14 - ((var20 - 1) * var18);
        int var25 = (1 - var22) * var16 + var19;
        int var26 = var15 - ((var22 - 1) * var21);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = (var20 - 3) * var18;
        int var32 = var17 * 3;
        int var33 = var19 * 3;
        int var34 = var30;
        int var35 = (var22 - 3) * var21;
        int var36 = var28;
        if (arg2 >= class104.field1719 && arg2 <= class333.field5188) {
            int[] var37 = class221.field3443[arg2];
            int var38 = class10.method151(class180.field2862, arg6 - arg5, 114, class310.field4897);
            int var39 = class10.method151(class180.field2862, arg5 + arg6, 124, class310.field4897);
            int var40 = class10.method151(class180.field2862, arg6 - var11, 113, class310.field4897);
            int var41 = class10.method151(class180.field2862, arg6 + var11, 111, class310.field4897);
            class323.method2273(var38, arg0, var37, var40, 109);
            class323.method2273(var40, arg7, var37, var41, 116);
            class323.method2273(var41, arg0, var37, var39, 76);
        }
        int var42 = (arg3 - 1) * var27;
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            var9--;
            int var45 = arg2 - var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var32;
                    var32 += var28;
                    var24 += var36;
                    var36 += var28;
                }
            }
            int var46 = arg2 + var9;
            if (var24 < 0) {
                var8++;
                var24 += var36;
                var23 += var32;
                var32 += var28;
                var36 += var28;
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var34;
                        var34 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var25 += var33;
                    var33 += var30;
                    var26 += var34;
                    var34 += var30;
                }
                var25 += -var43;
                var26 += -var35;
                var35 -= var29;
                var43 -= var29;
            }
            if (var46 >= class104.field1719 && class333.field5188 >= var45) {
                int var47 = class10.method151(class180.field2862, arg6 + var8, 113, class310.field4897);
                int var48 = class10.method151(class180.field2862, arg6 - var8, 107, class310.field4897);
                if (var44) {
                    int var49 = class10.method151(class180.field2862, arg6 + var10, arg4 + -29946, class310.field4897);
                    int var50 = class10.method151(class180.field2862, arg6 - var10, 121, class310.field4897);
                    if (class104.field1719 <= var45) {
                        int[] var51 = class221.field3443[var45];
                        class323.method2273(var48, arg0, var51, var50, 61);
                        class323.method2273(var50, arg7, var51, var49, 44);
                        class323.method2273(var49, arg0, var51, var47, 88);
                    }
                    if (var46 <= class333.field5188) {
                        int[] var52 = class221.field3443[var46];
                        class323.method2273(var48, arg0, var52, var50, arg4 - 29969);
                        class323.method2273(var50, arg7, var52, var49, arg4 ^ 0x7558);
                        class323.method2273(var49, arg0, var52, var47, 90);
                    }
                } else {
                    if (var45 >= class104.field1719) {
                        class323.method2273(var48, arg0, class221.field3443[var45], var47, 88);
                    }
                    if (class333.field5188 >= var46) {
                        class323.method2273(var48, arg0, class221.field3443[var46], var47, 82);
                    }
                }
            }
            var23 += -var42;
            var42 -= var27;
            var24 += -var31;
            var31 -= var27;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 213)
    public static final void method568(int arg0) {
        field1068++;
        class170.field2731.method2283((byte) 77);
        if (arg0 != 0) {
            method576((byte[]) null, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 237)
    public static void method569(byte arg0) {
        if (arg0 <= -37) {
            field1092 = null;
            field1070 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 248)
    public final void method570(int arg0) {
        field1071++;
        if (arg0 != -5106) {
            method575((class120) null, -20, (class120) null);
        }
        int var2 = this.field1091;
        if (this.field1067 != null) {
            class101 var5 = this.field1067.method813((byte) -29);
            if (var5 == null) {
                this.field1073 = 0;
                this.field1064 = 0;
                this.field1082 = 0;
                this.field1091 = -1;
                this.field1079 = 0;
                this.field1065 = null;
            } else {
                this.field1065 = var5.field1625;
                this.field1073 = var5.field1617;
                this.field1064 = var5.field1648 * 128;
                this.field1082 = var5.field1654;
                this.field1079 = var5.field1630;
                this.field1091 = var5.field1612;
            }
        } else if (this.field1076 != null) {
            int var3 = class294.method2065(this.field1076, (byte) 83);
            if (var2 != var3) {
                class84 var4 = this.field1076.field1381;
                this.field1091 = var3;
                if (var4.field1339 != null) {
                    var4 = var4.method667(-119);
                }
                if (var4 == null) {
                    this.field1082 = this.field1064 = 0;
                } else {
                    this.field1064 = var4.field1340 * 128;
                    this.field1082 = var4.field1359;
                }
            }
        } else if (this.field1084 != null) {
            this.field1091 = class96.method778(this.field1084, (byte) 117);
            this.field1064 = this.field1084.field1509 * 128;
            this.field1082 = this.field1084.field1491;
        }
        if (this.field1091 != var2 && this.field1089 != null) {
            class181.field2877.method2345(this.field1089);
            this.field1089 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V", line = 333)
    public static final void method571(int arg0, int arg1, int arg2, int arg3) {
        field1074++;
        String var4 = "::tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        if (arg3 >= -92) {
            method574(111, -74);
        }
        class126.method993((byte) 99, var4);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V", line = 347)
    public static final void method572(byte arg0) {
        field1066++;
        int var1 = class154.field2510 * 128 + 64;
        int var2 = class20.field367 * 128 + 64;
        int var3 = class170.method1265(var2, var1, class75.field1153, 1) - class309.field4889;
        if (class64.field948 >= 100) {
            class137.field2239 = class154.field2510 * 128 + 64;
            class152.field2498 = class20.field367 * 128 + 64;
            class332.field5180 = class170.method1265(class152.field2498, class137.field2239, class75.field1153, 1) - class309.field4889;
        } else {
            if (class332.field5180 < var3) {
                class332.field5180 += (var3 - class332.field5180) * class64.field948 / 1000 + class106.field1734;
                if (class332.field5180 > var3) {
                    class332.field5180 = var3;
                }
            }
            if (class152.field2498 < var2) {
                class152.field2498 += class106.field1734 + ((var2 - class152.field2498) * class64.field948 / 1000);
                if (var2 < class152.field2498) {
                    class152.field2498 = var2;
                }
            }
            if (var2 < class152.field2498) {
                class152.field2498 -= (class152.field2498 - var2) * class64.field948 / 1000 + class106.field1734;
                if (class152.field2498 < var2) {
                    class152.field2498 = var2;
                }
            }
            if (class332.field5180 > var3) {
                class332.field5180 -= (class332.field5180 - var3) * class64.field948 / 1000 + class106.field1734;
                if (var3 > class332.field5180) {
                    class332.field5180 = var3;
                }
            }
            if (class137.field2239 < var1) {
                class137.field2239 += (var1 - class137.field2239) * class64.field948 / 1000 + class106.field1734;
                if (class137.field2239 > var1) {
                    class137.field2239 = var1;
                }
            }
            if (class137.field2239 > var1) {
                class137.field2239 -= (class137.field2239 - var1) * class64.field948 / 1000 + class106.field1734;
                if (class137.field2239 < var1) {
                    class137.field2239 = var1;
                }
            }
        }
        int var4 = class176.field2812 * 128 + 64;
        int var5 = class3.field80 * 128 + 64;
        int var6 = class170.method1265(var4, var5, class75.field1153, 1) - class306.field4863;
        int var7 = var6 - class332.field5180;
        int var8 = var4 - class152.field2498;
        int var9 = var5 - class137.field2239;
        int var10 = -109 / ((arg0 - 11) / 39);
        int var11 = (int) Math.sqrt((double) (var8 * var8 + (var9 * var9)));
        int var12 = (int) (Math.atan2((double) var7, (double) var11) * 325.949D) & 0x7FF;
        int var13 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (class43.field683 < var12) {
            class43.field683 += (var12 - class43.field683) * class294.field4620 / 1000 + class241.field3610;
            if (class43.field683 > var12) {
                class43.field683 = var12;
            }
        }
        int var14 = var13 - class64.field943;
        if (class43.field683 > var12) {
            class43.field683 -= (class43.field683 - var12) * class294.field4620 / 1000 + class241.field3610;
            if (var12 > class43.field683) {
                class43.field683 = var12;
            }
        }
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            class64.field943 += class294.field4620 * var14 / 1000 + class241.field3610;
            class64.field943 &= 0x7FF;
        }
        if (var14 < 0) {
            class64.field943 -= -var14 * class294.field4620 / 1000 + class241.field3610;
            class64.field943 &= 0x7FF;
        }
        int var15 = var13 - class64.field943;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class64.field943 = var13;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)I", line = 510)
    public static final int method573(int arg0) {
        field1075++;
        return arg0 == 6 ? 6 : 120;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Ljava/lang/String;", line = 527)
    public static final String method574(int arg0, int arg1) {
        if (arg0 < 53) {
            method569((byte) 56);
        }
        field1080++;
        return class285.field4441[arg1].length() > 0 ? class301.field4800[arg1] + class58.field876 + class285.field4441[arg1] : class301.field4800[arg1];
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lpk;ILpk;)V", line = 542)
    public static final void method575(class120 arg0, int arg1, class120 arg2) {
        if (arg1 != 14765) {
            return;
        }
        field1086++;
        class156.field2560 = class274.method1950(0, arg2, arg0, class147.field2403, arg1 ^ 0x39B4);
        if (class162.field2623) {
            class110.field1791 = class313.method2204(arg2, arg0, class147.field2403, (byte) 120, 0);
        } else {
            class110.field1791 = (class159) class156.field2560;
        }
        class107.field1756 = class274.method1950(0, arg2, arg0, class74.field1119, 88);
        class146.field2392 = class274.method1950(0, arg2, arg0, class258.field3838, 47);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BB)[B", line = 571)
    public static final byte[] method576(byte[] arg0, byte arg1) {
        field1093++;
        if (arg0 == null) {
            return null;
        }
        byte[] var2 = new byte[arg0.length];
        class330.method2315(arg0, 0, var2, 0, arg0.length);
        if (arg1 < 8) {
            field1070 = (class102) null;
        }
        return var2;
    }
}
