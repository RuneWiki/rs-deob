import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class189 extends class317 {

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2606 = "Use";

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)[[I", line = 5)
    public final int[][] method53(int arg0, int arg1) {
        field2614++;
        int var3 = 14 / ((-arg0 - 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int[] var5 = this.method2225((byte) 66, 2, arg1);
            int[][] var6 = this.method2227(0, 66, arg1);
            int[][] var7 = this.method2227(1, 102, arg1);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[2];
            int[] var13 = var7[0];
            int[] var14 = var7[1];
            int[] var15 = var6[1];
            int[] var16 = var7[2];
            for (int var17 = 0; var17 < class326.field4933; var17++) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var8[var17] = var11[var17];
                    var9[var17] = var15[var17];
                    var10[var17] = var12[var17];
                } else if (var18 == 0) {
                    var8[var17] = var13[var17];
                    var9[var17] = var14[var17];
                    var10[var17] = var16[var17];
                } else {
                    int var19 = 4096 - var18;
                    var8[var17] = var11[var17] * var18 + var13[var17] * var19 >> 12;
                    var9[var17] = var14[var17] * var19 + var15[var17] * var18 >> 12;
                    var10[var17] = var12[var17] * var18 + var16[var17] * var19 >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIILdn;IZJ)Z", line = 82)
    public static final boolean method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class132 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class333.field5020 == class143.field1967;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class245.field3524 || var16 >= class99.field1356) {
                    return false;
                }
                class202 var17 = class142.field1940[arg0][var15][var16];
                if (var17 != null && var17.field2875 >= 5) {
                    return false;
                }
            }
        }
        class280 var18 = new class280();
        var18.field4203 = arg11;
        var18.field4208 = arg0;
        var18.field4212 = arg5;
        var18.field4214 = arg6;
        var18.field4206 = arg7;
        var18.field4199 = arg8;
        var18.field4213 = arg9;
        var18.field4204 = arg1;
        var18.field4200 = arg2;
        var18.field4205 = arg1 + arg3 - 1;
        var18.field4198 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class142.field1940[var22][var19][var20] == null) {
                        class142.field1940[var22][var19][var20] = new class202(var22, var19, var20);
                    }
                }
                class202 var23 = class142.field1940[arg0][var19][var20];
                var23.field2896[var23.field2875] = var18;
                var23.field2878[var23.field2875] = var21;
                var23.field2871 |= var21;
                var23.field2875++;
                if (var13 && class336.field5066[var19][var20] != 0) {
                    var14 = class336.field5066[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class336.field5066[var24][var25] == 0) {
                        class336.field5066[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class226.field3242[class342.field5127++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILin;IIIII)V", line = 203)
    public static final void method1322(int arg0, int arg1, class344 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2607++;
        if (arg0 != 16) {
            field2610 = 95;
        }
        if (class24.field302) {
            class72.field994 = 32;
        } else {
            class72.field994 = 0;
        }
        class24.field302 = false;
        if (class337.field5067 != 0) {
            if (arg4 >= arg1 && arg1 + 16 > arg4 && arg6 >= arg5 && (arg5 + 16) > arg6) {
                arg2.field5195 -= 4;
                class255.method1741(arg2, false);
            } else if (arg4 >= arg1 && (arg1 + 16) > arg4 && arg6 >= arg3 + arg5 - 16 && arg6 < (arg5 + arg3)) {
                arg2.field5195 += 4;
                class255.method1741(arg2, false);
            } else if (arg4 >= (arg1 - class72.field994) && class72.field994 + arg1 + 16 > arg4 && arg6 >= arg5 + 16 && arg6 < (arg3 + arg5 - 16)) {
                int var8 = (arg3 - 32) * arg3 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - (var8 / 2) - arg5 - 16;
                int var10 = arg3 - var8 - 32;
                arg2.field5195 = (arg7 - arg3) * var9 / var10;
                class255.method1741(arg2, false);
                class24.field302 = true;
            }
        }
        if (class255.field3656 == 0) {
            return;
        }
        int var11 = arg2.field5334;
        if (arg4 >= arg1 - var11 && arg6 >= arg5 && arg4 < arg1 + 16 && arg6 <= (arg3 + arg5)) {
            arg2.field5195 += class255.field3656 * 45;
            class255.method1741(arg2, false);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIII)I", line = 270)
    public static final int method1323(byte arg0, int arg1, int arg2, int arg3) {
        field2617++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (arg0 == 36) {
            return var4 == 2 ? 7 - arg3 : -arg2 + 7;
        } else {
            return 46;
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)[Lbc;", line = 297)
    public static final class4[] method1324(int arg0) {
        field2615++;
        class4[] var1 = new class4[class342.field5121];
        int var2 = 0;
        if (arg0 >= -52) {
            field2606 = (String) null;
        }
        while (class342.field5121 > var2) {
            if (class67.field908) {
                var1[var2] = new class2(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], class209.field3012[var2], class235.field3331);
            } else {
                var1[var2] = new class258(class154.field2136, class194.field2674, class209.field3002[var2], class274.field4115[var2], class323.field4903[var2], class288.field4281[var2], class209.field3012[var2], class235.field3331);
            }
            var2++;
        }
        class236.method1624(22);
        return var1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lcg;II)V", line = 324)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field2609++;
        if (arg2 == 0) {
            this.field4835 = arg0.method2219(16448) == 1;
        }
        int var4 = 84 / ((arg1 + 17) / 40);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V", line = 338)
    public static final void method1325(int arg0, int arg1) {
        if (arg0 != 1) {
            field2606 = (String) null;
        }
        field2612++;
        if (class148.field2051 == arg1) {
            return;
        }
        if (class148.field2051 == 0) {
            class246.method1686(12677);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 40) {
            class312.method2140(arg0 ^ 0xFFFFFF9A);
        }
        if (arg1 != 40 && class146.field2007 != null) {
            class146.field2007.method1577((byte) -121);
            class146.field2007 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class294.field4368 = 0;
            class274.field4109 = 1;
            class327.field4943 = 1;
            class198.field2780 = 0;
            class113.field1543 = 0;
            class176.method1219(arg0 - 28377, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class181.method1253(-18425);
        }
        if (arg1 == 5) {
            class123.method885(class204.field2948, 2);
        } else {
            class317.method2221(arg0 + 14512);
        }
        boolean var3 = class148.field2051 == 5 || class148.field2051 == 10 || class148.field2051 == 28;
        if (var2 != var3) {
            if (var2) {
                class231.field3272 = class66.field875;
                if (class83.field1199 == 0) {
                    class256.method1745(2058, 2);
                } else {
                    class68.method503(0, (byte) -74, false, 255, class66.field875, 2, class173.field2349);
                }
                class78.field1133.method87(2, false);
            } else {
                class256.method1745(2058, 2);
                class78.field1133.method87(arg0 ^ 0x3, true);
            }
        }
        if (class67.field908 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class67.method468();
        }
        class148.field2051 = arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLkm;I)Z", line = 414)
    public static final boolean method1326(boolean arg0, class133 arg1, int arg2) {
        field2611++;
        if (!arg0) {
            return false;
        }
        byte[] var3 = arg1.method948((byte) -112, arg2);
        if (var3 == null) {
            return false;
        } else {
            class226.method1587(7, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)[I", line = 434)
    public final int[] method140(int arg0, int arg1) {
        field2616++;
        int[] var3 = this.field4847.method1387(arg1, (byte) -88);
        if (arg0 != 542) {
            return (int[]) null;
        }
        if (this.field4847.field2751) {
            int[] var4 = this.method2225((byte) 66, 0, arg1);
            int[] var5 = this.method2225((byte) 66, 1, arg1);
            int[] var6 = this.method2225((byte) 66, 2, arg1);
            for (int var7 = 0; var7 < class326.field4933; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V", line = 486)
    public static void method1327(int arg0) {
        field2606 = null;
        if (arg0 != 0) {
            field2606 = (String) null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(II)Lao;", line = 497)
    public static final class273 method1328(int arg0, int arg1) {
        class273 var2 = (class273) class1.field14.method716((long) arg0, false);
        field2613++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class238.field3383.method955(arg1, arg0, arg1 ^ 0xFFFFAAA7);
        class273 var4 = new class273();
        if (var3 != null) {
            var4.method1881(arg1 ^ 0xFFFFFF89, arg0, new class316(var3));
        }
        class1.field14.method721((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 519)
    public class189() {
        super(3, false);
    }
}
