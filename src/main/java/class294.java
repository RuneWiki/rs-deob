import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class294 {

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field4878 = 5;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public int field4883 = -1;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field4884 = 2;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public int field4893 = -1;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "I")
    public int field4901 = -1;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public int field4876 = -1;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public int field4896 = -1;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "Z")
    public boolean field4894 = false;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public int field4892 = 99;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "Z")
    private boolean field4903 = false;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Laj;")
    public static class127 field4879 = new class127();

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "[I")
    public static int[] field4902 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "Lce;")
    private static class126 field4909 = class206.method1445(-7923, "skill: ");

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Lce;")
    public static class126 field4907 = field4909;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "Lsg;")
    public static class164 field4898;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field4904;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[I")
    private int[] field4877;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "[I")
    private int[] field4887;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "[I")
    public int[] field4890;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "[I")
    public int[] field4905;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "[I")
    public static int[] field4906;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "[[I")
    public int[][] field4889;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II[B[Lsh;IIIIIIZ)V", line = 6)
    public static final void method1946(int arg0, int arg1, byte[] arg2, class32[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        byte var11;
        if (arg10) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg10) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if (arg9 + var12 > 0 && (arg9 + var12) < 103 && (arg4 + var13) > 0 && arg4 + var13 < 103) {
                        arg3[arg7].field460[arg9 + var12][arg4 + var13] = class47.method289(arg3[arg7].field460[arg9 + var12][arg4 + var13], -16777217);
                    }
                }
            }
        }
        field4882++;
        class134 var14 = new class134(arg2);
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg6 == var15 && arg0 <= var16 && var16 < arg0 + 8 && arg8 <= var17 && arg8 + 8 > var17) {
                        class228.method1553(0, arg10, 0, arg7, class103.method700(var16 & 0x7, arg5, (byte) 89, var17 & 0x7) + arg4, class4.method24(-110, var17 & 0x7, var16 & 0x7, arg5) + arg9, -125, arg5, var14);
                    } else {
                        class228.method1553(0, arg10, 0, 0, -1, -1, -126, 0, var14);
                    }
                }
            }
        }
        while (var14.field2282.length > var14.field2299) {
            int var18 = var14.method948(arg1 ^ 0x71);
            if (var18 != 129) {
                var14.field2299--;
                break;
            }
            for (int var19 = 0; var19 < 4; var19++) {
                byte var20 = var14.method977(19773);
                if (var20 == 0) {
                    if (arg6 >= var19) {
                        int var28 = arg9;
                        if (arg9 < 0) {
                            var28 = 0;
                        } else if (arg9 >= 104) {
                            var28 = 104;
                        }
                        int var29 = arg4;
                        int var30 = arg9 + 7;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 >= 104) {
                            var30 = 104;
                        }
                        int var31 = arg4 + 7;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        if (arg4 < 0) {
                            var29 = 0;
                        } else if (arg4 >= 104) {
                            var29 = 104;
                        }
                        while (var28 < var30) {
                            while (var29 < var31) {
                                class85.field1353[arg7][var28][var29] = 0;
                                var29++;
                            }
                            var28++;
                        }
                    }
                } else if (var20 == 1) {
                    for (int var21 = 0; var21 < 64; var21 += 4) {
                        for (int var22 = 0; var22 < 64; var22 += 4) {
                            byte var23 = var14.method977(arg1 + 19784);
                            if (var19 <= arg6) {
                                int var24 = var21;
                                while (var21 + 4 > var24) {
                                    int var25 = var22;
                                    while (var25 < (var22 + 4)) {
                                        if (var24 >= arg0 && var24 < (arg0 + 8) && var25 >= arg8 && arg8 < arg8 + 8) {
                                            int var26 = arg9 + class4.method24(-92, var25 & 0x7, var24 & 0x7, arg5);
                                            int var27 = class103.method700(var24 & 0x7, arg5, (byte) 89, var25 & 0x7) + arg4;
                                            if (var26 >= 0 && var26 < 104 && var27 >= 0 && var27 < 104) {
                                                class85.field1353[arg7][var26][var27] = var23;
                                            }
                                        }
                                        var22++;
                                    }
                                    var21++;
                                }
                            }
                        }
                    }
                } else if (var20 == 2) {
                }
            }
        }
        boolean var32 = false;
        if (class56.field846 && !arg10) {
            class98 var33 = null;
            while (true) {
                while (var14.field2299 < var14.field2282.length) {
                    int var34 = var14.method948(-124);
                    if (var34 == 0) {
                        var33 = new class98(var14);
                    } else if (var34 == 1) {
                        int var35 = var14.method948(-128);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class209 var37 = new class209(var14);
                                int var38 = var37.field3577 >> 7;
                                int var39 = var37.field3570 >> 7;
                                if (var37.field3590 == arg6 && arg0 <= var38 && var38 < (arg0 + 8) && var39 >= arg8 && var39 < (arg8 + 8)) {
                                    int var40 = class168.method1227(var37.field3570 & 0x3FF, var37.field3577 & 0x3FF, (byte) 71, arg5) + (arg9 << 7);
                                    int var41 = class100.method678(103, arg5, var37.field3577 & 0x3FF, var37.field3570 & 0x3FF) + (arg4 << 7);
                                    var37.field3577 = var40;
                                    int var42 = var37.field3577 >> 7;
                                    var37.field3570 = var41;
                                    int var43 = var37.field3570 >> 7;
                                    if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                        var37.field3565 = (class301.field4992[1][var42][var43] & 0x2) != 0;
                                        var37.field3567 = class264.field4396[var37.field3590][var42][var43] - var37.field3567;
                                        class256.method1740(var37);
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class98();
                }
                class243.field4121[arg9 >> 3][arg4 >> 3] = var33;
                break;
            }
        }
        if (arg1 != -11) {
            field4898 = (class164) null;
        }
        if (var32) {
            return;
        }
        int var44 = arg9 + 7;
        int var45 = arg4 + 7;
        for (int var46 = arg9; var46 < var44; var46++) {
            for (int var47 = arg4; var47 < var45; var47++) {
                class85.field1353[arg7][var46][var47] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILwi;I)Lwi;", line = 328)
    public final class196 method1947(int arg0, class196 arg1, int arg2) {
        if (arg2 >= -124) {
            field4898 = (class164) null;
        }
        int var4 = this.field4890[arg0];
        field4885++;
        class219 var5 = class44.method276(var4 >> 16, -58);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method217(true, true);
        } else {
            class196 var7 = arg1.method217(!var5.method1501(var6, true), !this.field4903);
            var7.method208(var5, var6, this.field4903);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILcc;)V", line = 356)
    public static final void method1948(int arg0, class313 arg1) {
        if (arg0 <= 25) {
            field4909 = (class126) null;
        }
        class23.field318 = arg1.method2176(class259.field4331, 0);
        class251.field4195 = arg1.method2176(class260.field4373, 0);
        field4881++;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(ILwi;I)Lwi;", line = 372)
    public final class196 method1949(int arg0, class196 arg1, int arg2) {
        field4891++;
        int var4 = this.field4890[arg2];
        class219 var5 = class44.method276(var4 >> 16, -71);
        if (arg0 != 7) {
            return (class196) null;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method226(true, true);
        } else {
            class196 var7 = arg1.method226(!var5.method1501(var6, true), !this.field4903);
            var7.method208(var5, var6, this.field4903);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 400)
    public final void method1950(byte arg0) {
        if (arg0 != -71) {
            this.field4887 = (int[]) null;
        }
        field4886++;
        if (this.field4893 == -1) {
            if (this.field4887 == null) {
                this.field4893 = 0;
            } else {
                this.field4893 = 2;
            }
        }
        if (this.field4876 != -1) {
            return;
        }
        if (this.field4887 == null) {
            this.field4876 = 0;
        } else {
            this.field4876 = 2;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Z", line = 430)
    public static final boolean method1951(int arg0, int arg1, int arg2) {
        if (arg2 != -18617) {
            method1956(-13);
        }
        field4897++;
        return (arg0 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lwi;II)Lwi;", line = 447)
    public final class196 method1952(class196 arg0, int arg1, int arg2) {
        int var4 = this.field4890[arg1];
        field4908++;
        class219 var5 = class44.method276(var4 >> 16, -68);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method217(true, true);
        }
        class219 var7 = null;
        int var8 = 0;
        if (this.field4877 != null && this.field4877.length > arg1) {
            int var9 = this.field4877[arg1];
            var7 = class44.method276(var9 >> 16, arg2 - 55);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class196 var11 = arg0.method217(!var5.method1501(var6, true), !this.field4903);
            var11.method208(var5, var6, this.field4903);
            return var11;
        }
        class196 var10 = arg0.method217(!var5.method1501(var6, true) & !var7.method1501(var8, true), !this.field4903);
        if (arg2 != 8) {
            this.method1954((class196) null, -38, 80, (byte) -117, (class294) null);
        }
        var10.method208(var5, var6, this.field4903);
        var10.method208(var7, var8, this.field4903);
        return var10;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lbb;I)V", line = 495)
    public final void method1953(class134 arg0, int arg1) {
        field4900++;
        if (arg1 < 49) {
            this.method1954((class196) null, -70, 59, (byte) -11, (class294) null);
        }
        while (true) {
            int var3 = arg0.method948(-125);
            if (var3 == 0) {
                return;
            }
            this.method1955(var3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lwi;IIBLgi;)Lwi;", line = 534)
    public final class196 method1954(class196 arg0, int arg1, int arg2, byte arg3, class294 arg4) {
        field4895++;
        int var6 = this.field4890[arg2];
        class219 var7 = class44.method276(var6 >> 16, -60);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method1947(arg1, arg0, arg3 - 95);
        }
        if (arg3 != -31) {
            field4904 = (FontMetrics) null;
        }
        int var9 = arg4.field4890[arg1];
        class219 var10 = class44.method276(var9 >> 16, -39);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class196 var12 = arg0.method217(!var7.method1501(var8, true), !this.field4903);
            var12.method208(var7, var8, this.field4903);
            return var12;
        } else {
            class196 var13 = arg0.method217(!var7.method1501(var8, true) & !var10.method1501(var11, true), !this.field4903 & !arg4.field4903);
            var13.method210(var7, var8, var10, var11, this.field4887, this.field4903 | arg4.field4903);
            return var13;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILbb;Z)V", line = 568)
    private final void method1955(int arg0, class134 arg1, boolean arg2) {
        if (!arg2) {
            method1948(23, (class313) null);
        }
        field4899++;
        if (arg0 == 1) {
            int var4 = arg1.method942(true);
            this.field4905 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4905[var5] = arg1.method942(true);
            }
            this.field4890 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field4890[var6] = arg1.method942(true);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field4890[var7] += arg1.method942(arg2) << 16;
            }
        } else if (arg0 == 2) {
            this.field4896 = arg1.method942(true);
        } else if (arg0 == 3) {
            int var8 = arg1.method948(-122);
            this.field4887 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4887[var9] = arg1.method948(-121);
            }
            this.field4887[var8] = 9999999;
        } else if (arg0 == 4) {
            this.field4894 = true;
        } else if (arg0 == 5) {
            this.field4878 = arg1.method948(-126);
        } else if (arg0 == 6) {
            this.field4883 = arg1.method942(true);
        } else if (arg0 == 7) {
            this.field4901 = arg1.method942(true);
        } else if (arg0 == 8) {
            this.field4892 = arg1.method948(-123);
        } else if (arg0 == 9) {
            this.field4876 = arg1.method948(-123);
        } else if (arg0 == 10) {
            this.field4893 = arg1.method948(-123);
        } else if (arg0 == 11) {
            this.field4884 = arg1.method948(-128);
        } else if (arg0 == 12) {
            int var14 = arg1.method948(-125);
            this.field4877 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field4877[var15] = arg1.method942(arg2);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field4877[var16] = (arg1.method942(arg2) << 16) + this.field4877[var16];
            }
        } else if (arg0 == 13) {
            int var10 = arg1.method942(true);
            this.field4889 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg1.method948(-121);
                if (var12 > 0) {
                    this.field4889[var11] = new int[var12];
                    this.field4889[var11][0] = arg1.method949(20732);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field4889[var11][var13] = arg1.method942(true);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field4903 = true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 721)
    public static void method1956(int arg0) {
        field4904 = null;
        field4906 = null;
        if (arg0 >= -85) {
            method1958(-127, (class313) null);
        }
        field4909 = null;
        field4907 = null;
        field4898 = null;
        field4902 = null;
        field4879 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILwi;I)Lwi;", line = 741)
    public final class196 method1957(int arg0, int arg1, class196 arg2, int arg3) {
        int var5 = this.field4890[arg1];
        class219 var6 = class44.method276(var5 >> 16, arg3 - 22837);
        int var7 = var5 & 0xFFFF;
        field4880++;
        if (var6 == null) {
            return arg2.method217(true, true);
        }
        int var8 = arg0 & 0x3;
        if (arg3 != 22826) {
            method1951(47, 5, 22);
        }
        class196 var9 = arg2.method217(!var6.method1501(var7, true), !this.field4903);
        if (var8 == 1) {
            var9.method216();
        } else if (var8 == 2) {
            var9.method239();
        } else if (var8 == 3) {
            var9.method235();
        }
        var9.method208(var6, var7, this.field4903);
        if (var8 == 1) {
            var9.method235();
        } else if (var8 == 2) {
            var9.method239();
        } else if (var8 == 3) {
            var9.method216();
        }
        return var9;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(ILcc;)V", line = 823)
    public static final void method1958(int arg0, class313 arg1) {
        field4888++;
        if (class264.field4407) {
            return;
        }
        if (class56.field846) {
            class101.method685();
        } else {
            class276.method1861();
        }
        class221.field3720 = class130.method912(arg1, class23.field318, false);
        if (arg0 <= 71) {
            field4902 = (int[]) null;
        }
        int var2 = class1.field6;
        int var3 = var2 * 956 / 503;
        class221.field3720.method1331((class7.field87 - var3) / 2, 0, var3, var2);
        class272.field4574 = class203.method1430(class251.field4195, (byte) -75, arg1);
        class272.field4574.method10(class7.field87 / 2 - class272.field4574.field376 / 2, 18);
        class264.field4407 = true;
    }
}
