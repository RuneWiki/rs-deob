import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class249 {

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "Z")
    public boolean field4426 = false;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public int field4423 = 99;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public int field4435 = -1;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public int field4429 = 5;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field4428 = 2;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Z")
    private boolean field4409 = false;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public int field4440 = -1;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public int field4441 = -1;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public int field4418 = -1;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public int field4432 = -1;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "Leb;")
    public static class230 field4438 = class68.method589(0, ":duelfriend:");

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Z")
    public static boolean field4413 = false;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field4410 = 2;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "Z")
    public static boolean field4425 = true;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lgd;")
    public static class73 field4412;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    private int[] field4407;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[I")
    public int[] field4408;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "[I")
    private int[] field4424;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "[I")
    public int[] field4433;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "[I")
    public static int[] field4437;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "[[I")
    public int[][] field4415;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILfk;)V")
    public final void method1729(int arg0, class14 arg1) {
        field4419++;
        if (arg0 <= 20) {
            this.method1731(-60, (class257) null, (class249) null, 102, 124);
        }
        while (true) {
            int var3 = arg1.method200(255);
            if (var3 == 0) {
                return;
            }
            this.method1734(var3, -6, arg1);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static final void method1730(int arg0) {
        if (arg0 < 88) {
            field4411 = 103;
        }
        class102.field1866.method1122(10);
        field4414++;
        class173.field3049.method1122(10);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILrk;Lsa;II)Lrk;")
    public final class257 method1731(int arg0, class257 arg1, class249 arg2, int arg3, int arg4) {
        field4420++;
        int var6 = this.field4408[arg3];
        if (arg0 >= -81) {
            this.method1741(-78);
        }
        class39 var7 = class92.method776(var6 >> 16, 122);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method1738(126, arg1, arg4);
        }
        int var9 = arg2.field4408[arg4];
        class39 var10 = class92.method776(var9 >> 16, 122);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class257 var12 = arg1.method759(!var7.method347((byte) -123, var8), !this.field4409);
            var12.method762(var7, var8, this.field4409);
            return var12;
        } else {
            class257 var13 = arg1.method759(!var7.method347((byte) -123, var8) & !var10.method347((byte) -123, var11), !this.field4409 & !arg2.field4409);
            var13.method755(var7, var8, var10, var11, this.field4407, arg2.field4409 | this.field4409);
            return var13;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(ILfk;)V")
    public static final void method1732(int arg0, class14 arg1) {
        field4430++;
        if (arg0 != -23821) {
            field4411 = 64;
        }
        while (true) {
            while (arg1.field269.length > arg1.field318) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method200(255) == 1) {
                    var2 = true;
                    var3 = arg1.method200(255);
                    var4 = arg1.method200(255);
                }
                int var5 = arg1.method200(255);
                int var6 = arg1.method200(arg0 ^ 0xFFFFA20C);
                int var7 = var5 * 64 - class72.field1319;
                int var8 = field4417 + class178.field3119 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class237.field4094 > (var7 + 63) && var8 < field4417) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && (var4 * 8) <= var12 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method198(false);
                                if (var13 != 0) {
                                    if (class229.field3949[var9][var10] == null) {
                                        class229.field3949[var9][var10] = new byte[4096];
                                    }
                                    class229.field3949[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method198(false);
                                    if (class243.field4164[var9][var10] == null) {
                                        class243.field4164[var9][var10] = new byte[4096];
                                    }
                                    class243.field4164[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method198(false);
                        if (var16 != 0) {
                            arg1.field318++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBLrk;I)Lrk;")
    public final class257 method1733(int arg0, byte arg1, class257 arg2, int arg3) {
        int var5 = 78 % ((43 - arg1) / 36);
        field4434++;
        int var6 = this.field4408[arg0];
        class39 var7 = class92.method776(var6 >> 16, 123);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method759(true, true);
        }
        int var9 = arg3 & 0x3;
        class257 var10 = arg2.method759(!var7.method347((byte) -123, var8), !this.field4409);
        if (var9 == 1) {
            var10.method758();
        } else if (var9 == 2) {
            var10.method748();
        } else if (var9 == 3) {
            var10.method741();
        }
        var10.method762(var7, var8, this.field4409);
        if (var9 == 1) {
            var10.method741();
        } else if (var9 == 2) {
            var10.method748();
        } else if (var9 == 3) {
            var10.method758();
        }
        return var10;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILfk;)V")
    private final void method1734(int arg0, int arg1, class14 arg2) {
        field4421++;
        if (arg1 != -6) {
            return;
        }
        if (arg0 == 1) {
            int var13 = arg2.method161(4);
            this.field4433 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4433[var14] = arg2.method161(4);
            }
            this.field4408 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field4408[var15] = arg2.method161(4);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field4408[var16] += arg2.method161(4) << 16;
            }
        } else if (arg0 == 2) {
            this.field4441 = arg2.method161(4);
        } else if (arg0 == 3) {
            int var11 = arg2.method200(255);
            this.field4407 = new int[var11 + 1];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field4407[var12] = arg2.method200(arg1 + 261);
            }
            this.field4407[var11] = 9999999;
        } else if (arg0 == 4) {
            this.field4426 = true;
        } else if (arg0 == 5) {
            this.field4429 = arg2.method200(arg1 + 261);
        } else if (arg0 == 6) {
            this.field4418 = arg2.method161(4);
        } else if (arg0 == 7) {
            this.field4440 = arg2.method161(4);
        } else if (arg0 == 8) {
            this.field4423 = arg2.method200(arg1 + 261);
        } else if (arg0 == 9) {
            this.field4432 = arg2.method200(255);
        } else if (arg0 == 10) {
            this.field4435 = arg2.method200(arg1 ^ 0xFFFFFF05);
        } else if (arg0 == 11) {
            this.field4428 = arg2.method200(255);
        } else if (arg0 == 12) {
            int var8 = arg2.method200(255);
            this.field4424 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4424[var9] = arg2.method161(4);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field4424[var10] += arg2.method161(4) << 16;
            }
        } else if (arg0 == 13) {
            int var4 = arg2.method161(4);
            this.field4415 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method200(255);
                if (var6 > 0) {
                    this.field4415[var5] = new int[var6];
                    this.field4415[var5][0] = arg2.method190(class168.method1239(arg1, 25271));
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field4415[var5][var7] = arg2.method161(4);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4409 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static void method1735(int arg0) {
        field4437 = null;
        field4438 = null;
        if (arg0 == 5551) {
            field4412 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lkk;I)I")
    public static final int method1736(class223 arg0, int arg1) {
        field4436++;
        int var2 = 0;
        if (arg0.method1550(class163.field2917, 25648)) {
            var2++;
        }
        if (arg0.method1550(class70.field1284, 25648)) {
            var2++;
        }
        if (arg0.method1550(class189.field3317, 25648)) {
            var2++;
        }
        if (arg0.method1550(class271.field4784, 25648)) {
            var2++;
        }
        if (arg0.method1550(class25.field474, 25648)) {
            var2++;
        }
        if (arg0.method1550(class79.field1436, 25648)) {
            var2++;
        }
        if (arg0.method1550(class40.field732, 25648)) {
            var2++;
        }
        if (arg0.method1550(class173.field3054, 25648)) {
            var2++;
        }
        if (arg0.method1550(class140.field2488, 25648)) {
            var2++;
        }
        if (arg0.method1550(class42.field765, 25648)) {
            var2++;
        }
        if (arg0.method1550(class79.field1445, 25648)) {
            var2++;
        }
        if (arg0.method1550(class99.field1840, 25648)) {
            var2++;
        }
        if (arg0.method1550(class157.field2800, 25648)) {
            var2++;
        }
        int var3 = -44 % ((-arg1 - 40) / 63);
        if (arg0.method1550(class108.field1943, 25648)) {
            var2++;
        }
        if (arg0.method1550(class68.field1276, 25648)) {
            var2++;
        }
        if (arg0.method1550(class169.field2992, 25648)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILrk;)Lrk;")
    public final class257 method1737(int arg0, int arg1, class257 arg2) {
        int var4 = this.field4408[arg1];
        field4439++;
        class39 var5 = class92.method776(var4 >> 16, 126);
        int var6 = var4 & arg0;
        if (var5 == null) {
            return arg2.method764(true, true);
        } else {
            class257 var7 = arg2.method764(!var5.method347((byte) -123, var6), !this.field4409);
            var7.method762(var5, var6, this.field4409);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILrk;I)Lrk;")
    public final class257 method1738(int arg0, class257 arg1, int arg2) {
        int var4 = this.field4408[arg2];
        class39 var5 = class92.method776(var4 >> 16, 127);
        if (arg0 < 111) {
            this.field4429 = -67;
        }
        field4442++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method759(true, true);
        } else {
            class257 var7 = arg1.method759(!var5.method347((byte) -123, var6), !this.field4409);
            var7.method762(var5, var6, this.field4409);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IILrk;)Lrk;")
    public final class257 method1739(int arg0, int arg1, class257 arg2) {
        field4416++;
        int var4 = this.field4408[arg0];
        class39 var5 = class92.method776(var4 >> 16, 124);
        int var6 = var4 & arg1;
        if (var5 == null) {
            return arg2.method759(true, true);
        }
        class39 var7 = null;
        int var8 = 0;
        if (this.field4424 != null && arg0 < this.field4424.length) {
            int var9 = this.field4424[arg0];
            var7 = class92.method776(var9 >> 16, 126);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class257 var11 = arg2.method759(!var5.method347((byte) -123, var6), !this.field4409);
            var11.method762(var5, var6, this.field4409);
            return var11;
        } else {
            class257 var10 = arg2.method759(!var5.method347((byte) -123, var6) & !var7.method347((byte) -123, var8), !this.field4409);
            var10.method762(var5, var6, this.field4409);
            var10.method762(var7, var8, this.field4409);
            return var10;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
    public static final int method1740(int arg0, int arg1, int arg2, int arg3) {
        field4431++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (arg3 != -1) {
                method1730(-117);
            }
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method1741(int arg0) {
        field4406++;
        if (arg0 >= -79) {
            this.field4433 = null;
        }
        if (this.field4435 == -1) {
            if (this.field4407 == null) {
                this.field4435 = 0;
            } else {
                this.field4435 = 2;
            }
        }
        if (this.field4432 != -1) {
            return;
        }
        if (this.field4407 == null) {
            this.field4432 = 0;
        } else {
            this.field4432 = 2;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lph;")
    public static final class77 method1742(int arg0, int arg1) {
        field4443++;
        if (arg0 != -10314) {
            method1732(-17, (class14) null);
        }
        class77 var2 = (class77) class153.field2725.method273((long) arg1, 255);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field352.method1546(class41.method363((byte) -125, arg1), (byte) -100, class218.method1502(arg1, 158));
        class77 var4 = new class77();
        if (var3 != null) {
            var4.method644(-16297, new class14(var3));
        }
        class153.field2725.method276(var4, (long) arg1, -116);
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZZIIIIIIIIII)Z")
    public static final boolean method1743(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4422++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class41.field750[var12][var31] = 0;
                class218.field3761[var12][var31] = 99999999;
            }
        }
        class41.field750[arg2][arg9] = 99;
        if (!arg0) {
            return false;
        }
        int var13 = arg2;
        class218.field3761[arg2][arg9] = 0;
        byte var14 = 0;
        int var15 = 0;
        class41.field757[var14] = arg2;
        int var32 = var14 + 1;
        class117.field2105[var14] = arg9;
        int var16 = arg9;
        int[][] var17 = class112.field2007[class124.field2174].field2085;
        boolean var18 = false;
        while (var32 != var15) {
            var13 = class41.field757[var15];
            var16 = class117.field2105[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg7 == var13 && arg11 == var16) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class112.field2007[class124.field2174].method926(arg11, var16, arg6, var13, 1, arg3 - 1, 19661064, arg7)) {
                    var18 = true;
                    break;
                }
                if (arg3 < 10 && class112.field2007[class124.field2174].method920(var16, var13, (byte) -103, 1, arg7, arg6, arg3 - 1, arg11)) {
                    var18 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg4 != 0 && class112.field2007[class124.field2174].method928((byte) -117, arg10, arg11, var13, var16, 1, arg5, arg4, arg7)) {
                var18 = true;
                break;
            }
            int var30 = class218.field3761[var13][var16] + 1;
            if (var13 > 0 && class41.field750[var13 - 1][var16] == 0 && (var17[var13 - 1][var16] & 0x12C0108) == 0) {
                class41.field757[var32] = var13 - 1;
                class117.field2105[var32] = var16;
                class41.field750[var13 - 1][var16] = 2;
                class218.field3761[var13 - 1][var16] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 103 && class41.field750[var13 + 1][var16] == 0 && (var17[var13 + 1][var16] & 0x12C0180) == 0) {
                class41.field757[var32] = var13 + 1;
                class117.field2105[var32] = var16;
                class41.field750[var13 + 1][var16] = 8;
                class218.field3761[var13 + 1][var16] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var16 > 0 && class41.field750[var13][var16 - 1] == 0 && (var17[var13][var16 - 1] & 0x12C0102) == 0) {
                class41.field757[var32] = var13;
                class117.field2105[var32] = var16 - 1;
                class41.field750[var13][var16 - 1] = 1;
                class218.field3761[var13][var16 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var16 < 103 && class41.field750[var13][var16 + 1] == 0 && (var17[var13][var16 + 1] & 0x12C0120) == 0) {
                class41.field757[var32] = var13;
                class117.field2105[var32] = var16 + 1;
                class41.field750[var13][var16 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class218.field3761[var13][var16 + 1] = var30;
            }
            if (var13 > 0 && var16 > 0 && class41.field750[var13 - 1][var16 - 1] == 0 && (var17[var13 - 1][var16 - 1] & 0x12C010E) == 0 && (var17[var13 - 1][var16] & 0x12C0108) == 0 && (var17[var13][var16 - 1] & 0x12C0102) == 0) {
                class41.field757[var32] = var13 - 1;
                class117.field2105[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field750[var13 - 1][var16 - 1] = 3;
                class218.field3761[var13 - 1][var16 - 1] = var30;
            }
            if (var13 < 103 && var16 > 0 && class41.field750[var13 + 1][var16 - 1] == 0 && (var17[var13 + 1][var16 - 1] & 0x12C0183) == 0 && (var17[var13 + 1][var16] & 0x12C0180) == 0 && (var17[var13][var16 - 1] & 0x12C0102) == 0) {
                class41.field757[var32] = var13 + 1;
                class117.field2105[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field750[var13 + 1][var16 - 1] = 9;
                class218.field3761[var13 + 1][var16 - 1] = var30;
            }
            if (var13 > 0 && var16 < 103 && class41.field750[var13 - 1][var16 + 1] == 0 && (var17[var13 - 1][var16 + 1] & 0x12C0138) == 0 && (var17[var13 - 1][var16] & 0x12C0108) == 0 && (var17[var13][var16 + 1] & 0x12C0120) == 0) {
                class41.field757[var32] = var13 - 1;
                class117.field2105[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field750[var13 - 1][var16 + 1] = 6;
                class218.field3761[var13 - 1][var16 + 1] = var30;
            }
            if (var13 < 103 && var16 < 103 && class41.field750[var13 + 1][var16 + 1] == 0 && (var17[var13 + 1][var16 + 1] & 0x12C01E0) == 0 && (var17[var13 + 1][var16] & 0x12C0180) == 0 && (var17[var13][var16 + 1] & 0x12C0120) == 0) {
                class41.field757[var32] = var13 + 1;
                class117.field2105[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field750[var13 + 1][var16 + 1] = 12;
                class218.field3761[var13 + 1][var16 + 1] = var30;
            }
        }
        class238.field4115 = 0;
        if (!var18) {
            if (!arg1) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg7 - var21; var22 <= (arg7 + var21); var22++) {
                for (int var23 = arg11 - var21; var23 <= arg11 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class218.field3761[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var23 < arg11) {
                            var25 = arg11 - var23;
                        } else if (var23 > arg4 + arg11 - 1) {
                            var25 = var23 + 1 - arg4 - arg11;
                        }
                        if (var22 < arg7) {
                            var24 = arg7 - var22;
                        } else if (var22 > arg7 + arg10 - 1) {
                            var24 = var22 - (arg7 + arg10 - 1);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var20 > var26 || var20 == var26 && var19 > class218.field3761[var22][var23]) {
                            var20 = var26;
                            var16 = var23;
                            var13 = var22;
                            var19 = class218.field3761[var22][var23];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg2 == var13 && arg9 == var16) {
                return false;
            }
            class238.field4115 = 1;
        }
        byte var27 = 0;
        class41.field757[var27] = var13;
        int var33 = var27 + 1;
        class117.field2105[var27] = var16;
        int var28;
        int var29 = var28 = class41.field750[var13][var16];
        while (arg2 != var13 || arg9 != var16) {
            if (var28 != var29) {
                var28 = var29;
                class41.field757[var33] = var13;
                class117.field2105[var33++] = var16;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var16++;
            } else if ((var29 & 0x4) != 0) {
                var16--;
            }
            var29 = class41.field750[var13][var16];
        }
        if (var33 > 0) {
            class264.method1833(arg8, var33, (byte) -95);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
