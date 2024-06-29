import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class10 {

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "[I")
    private int[] field256;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "[I")
    private int[] field248;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lh;")
    private class64 field253;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lh;")
    private class64 field252;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "[Lh;")
    private class64[] field257;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lke;IIIDZLqb;)[I")
    public final int[] method52(class95 arg0, int arg1, int arg2, int arg3, double arg4, boolean arg5, class146 arg6) {
        field254++;
        class193.field3804 = arg6;
        class135.field2530 = arg0;
        class19.method135(-1, arg2, arg1);
        int[] var9 = new int[arg1 * arg2];
        for (int var10 = 0; var10 < this.field257.length; var10++) {
            this.field257[var10].method403(arg3 ^ 0xFC, arg1, arg2);
        }
        int var11 = 0;
        int var12;
        int var13;
        byte var14;
        if (arg5) {
            var12 = arg1 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var14 = 1;
            var13 = arg1;
        }
        if (arg3 != 3) {
            this.field248 = null;
        }
        for (int var15 = 0; var15 < arg2; var15++) {
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field253.field1183) {
                int[] var17 = this.field253.method16(var15, (byte) 19);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field253.method59((byte) -40, var15);
                var18 = var21[0];
                var20 = var21[1];
                var19 = var21[2];
            }
            for (int var22 = var12; var22 != var13; var22 += var14) {
                double var23 = Math.pow((double) var18[var22] / 4096.0D, arg4);
                double var25 = Math.pow((double) var20[var22] / 4096.0D, arg4);
                double var27 = Math.pow((double) var19[var22] / 4096.0D, arg4);
                int var29 = (int) (var25 * 256.0D);
                int var30 = (int) (var23 * 256.0D);
                if (var30 > 255) {
                    var30 = 255;
                }
                int var31 = (int) (var27 * 256.0D);
                if (var31 > 255) {
                    var31 = 255;
                }
                if (var31 < 0) {
                    var31 = 0;
                }
                if (var30 < 0) {
                    var30 = 0;
                }
                if (var29 > 255) {
                    var29 = 255;
                }
                if (var29 < 0) {
                    var29 = 0;
                }
                var9[var11++] = (var30 << 16) + (var29 << 8) + var31;
            }
        }
        for (int var16 = 0; var16 < this.field257.length; var16++) {
            this.field257[var16].method396(arg3 - 11748);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lvb;Log;IIIIIII)V")
    public static final void method53(class191 arg0, class133 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field255++;
        if (class105.field1925 && (class159.field3040[0][arg8][arg7] & 0x2) == 0) {
            if ((class159.field3040[arg3][arg8][arg7] & 0x10) != 0) {
                return;
            }
            if (class88.method519(arg3, 110, arg7, arg8) != class26.field537) {
                return;
            }
        }
        if (arg6 > -122) {
            return;
        }
        if (arg3 < class135.field2522) {
            class135.field2522 = arg3;
        }
        class17 var9 = class138.method925(6, arg5);
        int var10;
        int var11;
        if (arg2 == 1 || arg2 == 3) {
            var10 = var9.field400;
            var11 = var9.field369;
        } else {
            var10 = var9.field369;
            var11 = var9.field400;
        }
        int var12;
        int var13;
        if (arg8 + var10 > 104) {
            var12 = arg8 + 1;
            var13 = arg8;
        } else {
            var12 = (var10 + 1 >> 1) + arg8;
            var13 = (var10 >> 1) + arg8;
        }
        int var14;
        int var15;
        if (arg7 + var11 > 104) {
            var14 = arg7;
            var15 = arg7 + 1;
        } else {
            var15 = arg7 + (var11 + 1 >> 1);
            var14 = (var11 >> 1) + arg7;
        }
        int[][] var16 = class139.field2588[arg3];
        int var17 = (arg8 << 7) + (var10 << 6);
        int var18 = var16[var12][var14] + var16[var13][var15] + var16[var13][var14] + var16[var12][var15] >> 2;
        int var19 = (arg7 << 7) + (var11 << 6);
        int var20 = arg8 + (arg5 << 14) + (arg7 << 7) + 1073741824;
        int var21 = (arg2 << 6) + arg4;
        if (var9.field402 == 0) {
            var20 += Integer.MIN_VALUE;
        }
        if (var9.field375 == 1) {
            var21 += 256;
        }
        if (var9.method104(false)) {
            class163.method1052(var9, arg2, arg8, arg7, arg3, (byte) -75);
        }
        if (arg4 == 22) {
            if (!class105.field1925 || var9.field402 != 0 || var9.field360 == 1 || var9.field382) {
                class4 var22;
                if (var9.field359 == -1 && var9.field355 == null) {
                    var22 = var9.method103(var19, -89, var16, var18, arg2, 22, var17);
                } else {
                    var22 = new class162(arg5, 22, arg2, arg3, arg8, arg7, var9.field359, true, null);
                }
                arg1.method900(arg3, arg8, arg7, var18, var22, var20, var21);
                if (var9.field360 == 1 && arg0 != null) {
                    arg0.method1255(-112, arg7, arg8);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class4 var45;
            if (var9.field359 == -1 && var9.field355 == null) {
                var45 = var9.method103(var19, -31, var16, var18, arg2, 10, var17);
            } else {
                var45 = new class162(arg5, 10, arg2, arg3, arg8, arg7, var9.field359, true, null);
            }
            if (var45 != null && arg1.method884(arg3, arg8, arg7, var18, var10, var11, var45, arg4 == 11 ? 256 : 0, var20, var21) && var9.field358) {
                int var46 = 15;
                if (var45 instanceof class24) {
                    var46 = ((class24) var45).method174() / 4;
                    if (var46 > 30) {
                        var46 = 30;
                    }
                }
                for (int var47 = 0; var47 <= var10; var47++) {
                    for (int var48 = 0; var48 <= var11; var48++) {
                        if (client.field577[arg3][arg8 + var47][arg7 + var48] < var46) {
                            client.field577[arg3][arg8 + var47][arg7 + var48] = (byte) var46;
                        }
                    }
                }
            }
            if (var9.field360 != 0 && arg0 != null) {
                arg0.method1259(arg8, true, arg7, var10, var11, var9.field399);
            }
        } else if (arg4 >= 12) {
            class4 var23;
            if (var9.field359 == -1 && var9.field355 == null) {
                var23 = var9.method103(var19, -79, var16, var18, arg2, arg4, var17);
            } else {
                var23 = new class162(arg5, arg4, arg2, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method884(arg3, arg8, arg7, var18, 1, 1, var23, 0, var20, var21);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg3 > 0) {
                class159.field3034[arg3][arg8][arg7] = method56(class159.field3034[arg3][arg8][arg7], 2340);
            }
            if (var9.field360 != 0 && arg0 != null) {
                arg0.method1259(arg8, true, arg7, var10, var11, var9.field399);
            }
        } else if (arg4 == 0) {
            class4 var24;
            if (var9.field359 == -1 && var9.field355 == null) {
                var24 = var9.method103(var19, -113, var16, var18, arg2, 0, var17);
            } else {
                var24 = new class162(arg5, 0, arg2, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method906(arg3, arg8, arg7, var18, var24, null, class58.field1092[arg2], 0, var20, var21);
            if (arg2 == 0) {
                if (var9.field358) {
                    client.field577[arg3][arg8][arg7] = 50;
                    client.field577[arg3][arg8][arg7 + 1] = 50;
                }
                if (var9.field387) {
                    class159.field3034[arg3][arg8][arg7] = method56(class159.field3034[arg3][arg8][arg7], 585);
                }
            } else if (arg2 == 1) {
                if (var9.field358) {
                    client.field577[arg3][arg8][arg7 + 1] = 50;
                    client.field577[arg3][arg8 + 1][arg7 + 1] = 50;
                }
                if (var9.field387) {
                    class159.field3034[arg3][arg8][arg7 + 1] = method56(class159.field3034[arg3][arg8][arg7 + 1], 1170);
                }
            } else if (arg2 == 2) {
                if (var9.field358) {
                    client.field577[arg3][arg8 + 1][arg7] = 50;
                    client.field577[arg3][arg8 + 1][arg7 + 1] = 50;
                }
                if (var9.field387) {
                    class159.field3034[arg3][arg8 + 1][arg7] = method56(class159.field3034[arg3][arg8 + 1][arg7], 585);
                }
            } else if (arg2 == 3) {
                if (var9.field358) {
                    client.field577[arg3][arg8][arg7] = 50;
                    client.field577[arg3][arg8 + 1][arg7] = 50;
                }
                if (var9.field387) {
                    class159.field3034[arg3][arg8][arg7] = method56(class159.field3034[arg3][arg8][arg7], 1170);
                }
            }
            if (var9.field360 != 0 && arg0 != null) {
                arg0.method1266(arg7, var9.field399, arg2, arg8, false, arg4);
            }
            if (var9.field379 != 16) {
                arg1.method872(arg3, arg8, arg7, var9.field379);
            }
        } else if (arg4 == 1) {
            class4 var25;
            if (var9.field359 == -1 && var9.field355 == null) {
                var25 = var9.method103(var19, -15, var16, var18, arg2, 1, var17);
            } else {
                var25 = new class162(arg5, 1, arg2, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method906(arg3, arg8, arg7, var18, var25, null, class107.field1960[arg2], 0, var20, var21);
            if (var9.field358) {
                if (arg2 == 0) {
                    client.field577[arg3][arg8][arg7 + 1] = 50;
                } else if (arg2 == 1) {
                    client.field577[arg3][arg8 + 1][arg7 + 1] = 50;
                } else if (arg2 == 2) {
                    client.field577[arg3][arg8 + 1][arg7] = 50;
                } else if (arg2 == 3) {
                    client.field577[arg3][arg8][arg7] = 50;
                }
            }
            if (var9.field360 != 0 && arg0 != null) {
                arg0.method1266(arg7, var9.field399, arg2, arg8, false, arg4);
            }
        } else if (arg4 == 2) {
            int var26 = arg2 + 1 & 0x3;
            class4 var27;
            class4 var28;
            if (var9.field359 == -1 && var9.field355 == null) {
                var27 = var9.method103(var19, -91, var16, var18, arg2 + 4, 2, var17);
                var28 = var9.method103(var19, -102, var16, var18, var26, 2, var17);
            } else {
                var27 = new class162(arg5, 2, arg2 + 4, arg3, arg8, arg7, var9.field359, true, null);
                var28 = new class162(arg5, 2, var26, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method906(arg3, arg8, arg7, var18, var27, var28, class58.field1092[arg2], class58.field1092[var26], var20, var21);
            if (var9.field387) {
                if (arg2 == 0) {
                    class159.field3034[arg3][arg8][arg7] = method56(class159.field3034[arg3][arg8][arg7], 585);
                    class159.field3034[arg3][arg8][arg7 + 1] = method56(class159.field3034[arg3][arg8][arg7 + 1], 1170);
                } else if (arg2 == 1) {
                    class159.field3034[arg3][arg8][arg7 + 1] = method56(class159.field3034[arg3][arg8][arg7 + 1], 1170);
                    class159.field3034[arg3][arg8 + 1][arg7] = method56(class159.field3034[arg3][arg8 + 1][arg7], 585);
                } else if (arg2 == 2) {
                    class159.field3034[arg3][arg8 + 1][arg7] = method56(class159.field3034[arg3][arg8 + 1][arg7], 585);
                    class159.field3034[arg3][arg8][arg7] = method56(class159.field3034[arg3][arg8][arg7], 1170);
                } else if (arg2 == 3) {
                    class159.field3034[arg3][arg8][arg7] = method56(class159.field3034[arg3][arg8][arg7], 1170);
                    class159.field3034[arg3][arg8][arg7] = method56(class159.field3034[arg3][arg8][arg7], 585);
                }
            }
            if (var9.field360 != 0 && arg0 != null) {
                arg0.method1266(arg7, var9.field399, arg2, arg8, false, arg4);
            }
            if (var9.field379 != 16) {
                arg1.method872(arg3, arg8, arg7, var9.field379);
            }
        } else if (arg4 == 3) {
            class4 var29;
            if (var9.field359 == -1 && var9.field355 == null) {
                var29 = var9.method103(var19, -45, var16, var18, arg2, 3, var17);
            } else {
                var29 = new class162(arg5, 3, arg2, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method906(arg3, arg8, arg7, var18, var29, null, class107.field1960[arg2], 0, var20, var21);
            if (var9.field358) {
                if (arg2 == 0) {
                    client.field577[arg3][arg8][arg7 + 1] = 50;
                } else if (arg2 == 1) {
                    client.field577[arg3][arg8 + 1][arg7 + 1] = 50;
                } else if (arg2 == 2) {
                    client.field577[arg3][arg8 + 1][arg7] = 50;
                } else if (arg2 == 3) {
                    client.field577[arg3][arg8][arg7] = 50;
                }
            }
            if (var9.field360 != 0 && arg0 != null) {
                arg0.method1266(arg7, var9.field399, arg2, arg8, false, arg4);
            }
        } else if (arg4 == 9) {
            class4 var30;
            if (var9.field359 == -1 && var9.field355 == null) {
                var30 = var9.method103(var19, -27, var16, var18, arg2, arg4, var17);
            } else {
                var30 = new class162(arg5, arg4, arg2, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method884(arg3, arg8, arg7, var18, 1, 1, var30, 0, var20, var21);
            if (var9.field360 != 0 && arg0 != null) {
                arg0.method1259(arg8, true, arg7, var10, var11, var9.field399);
            }
            if (var9.field379 != 16) {
                arg1.method872(arg3, arg8, arg7, var9.field379);
            }
        } else if (arg4 == 4) {
            class4 var31;
            if (var9.field359 == -1 && var9.field355 == null) {
                var31 = var9.method103(var19, -95, var16, var18, arg2, 4, var17);
            } else {
                var31 = new class162(arg5, 4, arg2, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method890(arg3, arg8, arg7, var18, var31, null, class58.field1092[arg2], 0, 0, 0, var20, var21);
        } else if (arg4 == 5) {
            int var32 = 16;
            int var33 = arg1.method896(arg3, arg8, arg7);
            if (var33 != 0) {
                var32 = class138.method925(6, var33 >> 14 & 0x7FFF).field379;
            }
            class4 var34;
            if (var9.field359 == -1 && var9.field355 == null) {
                var34 = var9.method103(var19, -61, var16, var18, arg2, 4, var17);
            } else {
                var34 = new class162(arg5, 4, arg2, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method890(arg3, arg8, arg7, var18, var34, null, class58.field1092[arg2], 0, class6.field133[arg2] * var32, class89.field1621[arg2] * var32, var20, var21);
        } else if (arg4 == 6) {
            int var35 = 8;
            int var36 = arg1.method896(arg3, arg8, arg7);
            if (var36 != 0) {
                var35 = class138.method925(6, var36 >> 14 & 0x7FFF).field379 / 2;
            }
            class4 var37;
            if (var9.field359 == -1 && var9.field355 == null) {
                var37 = var9.method103(var19, -121, var16, var18, arg2 + 4, 4, var17);
            } else {
                var37 = new class162(arg5, 4, arg2 + 4, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method890(arg3, arg8, arg7, var18, var37, null, 256, arg2, class178.field3469[arg2] * var35, class126.field2305[arg2] * var35, var20, var21);
        } else if (arg4 == 7) {
            int var38 = arg2 + 2 & 0x3;
            class4 var39;
            if (var9.field359 == -1 && var9.field355 == null) {
                var39 = var9.method103(var19, -41, var16, var18, var38 + 4, 4, var17);
            } else {
                var39 = new class162(arg5, 4, var38 + 4, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method890(arg3, arg8, arg7, var18, var39, null, 256, var38, 0, 0, var20, var21);
        } else if (arg4 == 8) {
            int var40 = 8;
            int var41 = arg1.method896(arg3, arg8, arg7);
            if (var41 != 0) {
                var40 = class138.method925(6, var41 >> 14 & 0x7FFF).field379 / 2;
            }
            int var42 = arg2 + 2 & 0x3;
            class4 var43;
            class4 var44;
            if (var9.field359 == -1 && var9.field355 == null) {
                var43 = var9.method103(var19, -117, var16, var18, arg2 + 4, 4, var17);
                var44 = var9.method103(var19, -42, var16, var18, var42 + 4, 4, var17);
            } else {
                var43 = new class162(arg5, 4, arg2 + 4, arg3, arg8, arg7, var9.field359, true, null);
                var44 = new class162(arg5, 4, var42 + 4, arg3, arg8, arg7, var9.field359, true, null);
            }
            arg1.method890(arg3, arg8, arg7, var18, var43, var44, 256, arg2, class178.field3469[arg2] * var40, class126.field2305[arg2] * var40, var20, var21);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lqb;Lke;B)Z")
    public final boolean method54(class146 arg0, class95 arg1, byte arg2) {
        field250++;
        for (int var4 = 0; var4 < this.field248.length; var4++) {
            if (!arg1.method560(0, this.field248[var4])) {
                return false;
            }
        }
        for (int var5 = 0; var5 < this.field256.length; var5++) {
            if (!arg0.method607(this.field256[var5], (byte) -81)) {
                return false;
            }
        }
        int var6 = -11 % ((arg2 + 43) / 57);
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lsg;ILoa;)I")
    public static final int method55(class169 arg0, int arg1, class127 arg2) {
        field251++;
        int var3 = -3 / ((arg1 - 73) / 52);
        int var4 = arg2.field2346;
        arg2.method781(arg0.field3253, 0);
        arg2.field2346 += class69.field1297.method432(arg0.field3253, 69, arg2.field2346, arg2.field2325, 0, arg0.field3248);
        return arg2.field2346 - var4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public static int method56(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lke;ILke;)V")
    public static final void method57(class95 arg0, int arg1, class95 arg2) {
        class91.field1682 = arg0;
        class148.field2717 = arg2;
        field249++;
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class10() {
        this.field256 = new int[0];
        this.field248 = new int[0];
        this.field253 = new class55();
        this.field252 = new class55();
        this.field257 = new class64[] { this.field253, this.field252 };
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Loa;)V")
    public class10(class127 arg0) {
        int var2 = arg0.method819((byte) 22);
        class163 var3 = new class163(64);
        class163 var4 = new class163(64);
        class163 var5 = new class163(64);
        int[][] var6 = new int[var2][];
        this.field257 = new class64[var2];
        for (int var7 = 0; var7 < var2; var7++) {
            class64 var21 = class61.method379(0, arg0);
            int var22 = var21.method397(124);
            int var23 = var21.method393(true);
            if (var22 >= 0 && var22 >= 0 && var4.method1045((long) var22, (byte) -77) == null) {
                var4.method1044((long) var22, true, new class6(var22));
            }
            if (var23 >= 0 && var23 >= 0 && var5.method1045((long) var23, (byte) -77) == null) {
                var5.method1044((long) var23, true, new class6(var23));
            }
            int var26 = var21.field1188.length;
            var6[var7] = new int[var26];
            for (int var27 = 0; var27 < var26; var27++) {
                var6[var7][var27] = arg0.method819((byte) 22);
            }
            var3.method1044((long) var21.field1178, true, var21);
            this.field257[var7] = var21;
        }
        for (int var8 = 0; var8 < var2; var8++) {
            class64 var17 = this.field257[var8];
            int var18 = var17.field1188.length;
            for (int var19 = 0; var19 < var18; var19++) {
                class64 var20 = (class64) var3.method1045((long) var6[var8][var19], (byte) -77);
                var17.field1188[var19] = var20;
            }
            var6[var8] = null;
        }
        Object var9 = null;
        this.field253 = (class64) var3.method1045((long) arg0.method819((byte) 22), (byte) -77);
        this.field252 = (class64) var3.method1045((long) arg0.method819((byte) 22), (byte) -77);
        Object var10 = null;
        this.field248 = new int[var4.method1050((byte) -124)];
        this.field256 = new int[var5.method1050((byte) 98)];
        class182[] var11 = new class182[var4.method1050((byte) 97)];
        class182[] var12 = new class182[var5.method1050((byte) 25)];
        var4.method1043(var11, 73);
        Object var13 = null;
        var5.method1043(var12, 85);
        for (int var14 = 0; var14 < var11.length; var14++) {
            this.field248[var14] = ((class6) var11[var14]).field121;
        }
        Object var15 = null;
        for (int var16 = 0; var16 < var12.length; var16++) {
            this.field256[var16] = ((class6) var12[var16]).field121;
        }
    }
}
