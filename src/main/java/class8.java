import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class8 extends class252 {

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "Lc;")
    public class331 field108 = new class331();

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "Lrm;")
    public class268 field113 = new class268();

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "Lco;")
    private class107 field93;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "Lul;")
    public static class51 field96 = new class51(64);

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "Lnb;")
    public static class341 field107 = new class341(64);

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "Lti;")
    public static class244 field110;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "[I")
    public static int[] field104;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZIILcg;I)V", line = 9)
    public static final void method47(int arg0, boolean arg1, int arg2, int arg3, class49 arg4, int arg5) {
        class249.field4044 = arg4;
        class226.field3799 = arg2;
        if (arg3 >= -41) {
            field96 = (class51) null;
        }
        class241.field3924 = arg0;
        class191.field3201 = 10000;
        field101++;
        class44.field705 = 1;
        class125.field2155 = arg5;
        class334.field5300 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 29)
    public static final String method48(long arg0, boolean arg1) {
        field109++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class327.field5206[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            if (arg1) {
                return var6.toString();
            } else {
                return (String) null;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([III)V", line = 83)
    public final void method49(int[] arg0, int arg1, int arg2) {
        field112++;
        this.field113.method49(arg0, arg1, arg2);
        for (class68 var4 = (class68) this.field108.method2297(14204); var4 != null; var4 = (class68) this.field108.method2291(-67)) {
            if (!this.field93.method910(var4, 0)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1116 >= var6) {
                        this.method55(arg0, false, var5, var4, var6, var5 + var6);
                        var4.field1116 -= var6;
                        break;
                    }
                    this.method55(arg0, false, var5, var4, var4.field1116, var5 + var6);
                    var5 += var4.field1116;
                    var6 -= var4.field1116;
                } while (!this.field93.method923(var5, arg0, (byte) 112, var6, var4));
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "()I", line = 120)
    public final int method50() {
        field97++;
        return 0;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILb;)V", line = 133)
    private final void method51(int arg0, int arg1, class68 arg2) {
        if (arg1 != -6814) {
            return;
        }
        if ((this.field93.field1833[arg2.field1097] & 0x4) != 0 && arg2.field1107 < 0) {
            int var4 = this.field93.field1793[arg2.field1097] / class266.field4291;
            int var5 = (var4 + 1048575 - arg2.field1100) / var4;
            arg2.field1100 = arg0 * var4 + arg2.field1100 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field93.field1773[arg2.field1097] == 0) {
                    arg2.field1106 = class299.method2068(arg2.field1096, arg2.field1106.method2061(), arg2.field1106.method2056(), arg2.field1106.method2046());
                } else {
                    arg2.field1106 = class299.method2068(arg2.field1096, arg2.field1106.method2061(), 0, arg2.field1106.method2046());
                    this.field93.method914(arg2, arg2.field1118.field1430[arg2.field1120] < 0, 120);
                }
                if (arg2.field1118.field1430[arg2.field1120] < 0) {
                    arg2.field1106.method2040(-1);
                }
                arg0 = arg2.field1100 / var4;
            }
        }
        arg2.field1106.method53(arg0);
        field94++;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "()Lmj;", line = 173)
    public final class252 method52() {
        field98++;
        class68 var1;
        do {
            var1 = (class68) this.field108.method2291(-115);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1106 == null);
        return var1.field1106;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V", line = 193)
    public final void method53(int arg0) {
        field103++;
        this.field113.method53(arg0);
        for (class68 var2 = (class68) this.field108.method2297(14204); var2 != null; var2 = (class68) this.field108.method2291(98)) {
            if (!this.field93.method910(var2, 0)) {
                int var3 = arg0;
                do {
                    if (var2.field1116 >= var3) {
                        this.method51(var3, -6814, var2);
                        var2.field1116 -= var3;
                        break;
                    }
                    this.method51(var2.field1116, -6814, var2);
                    var3 -= var2.field1116;
                } while (!this.field93.method923(0, (int[]) null, (byte) 122, var3, var2));
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "()Lmj;", line = 231)
    public final class252 method54() {
        field105++;
        class68 var1 = (class68) this.field108.method2297(14204);
        if (var1 == null) {
            return null;
        } else if (var1.field1106 == null) {
            return this.method52();
        } else {
            return var1.field1106;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([IZILb;II)V", line = 247)
    private final void method55(int[] arg0, boolean arg1, int arg2, class68 arg3, int arg4, int arg5) {
        if ((this.field93.field1833[arg3.field1097] & 0x4) != 0 && arg3.field1107 < 0) {
            int var7 = this.field93.field1793[arg3.field1097] / class266.field4291;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1100) / var7;
                if (arg4 < var8) {
                    arg3.field1100 += arg4 * var7;
                    break;
                }
                arg3.field1106.method49(arg0, arg2, var8);
                arg4 -= var8;
                arg2 += var8;
                int var9 = 262144 / var7;
                int var10 = class266.field4291 / 100;
                if (var9 < var10) {
                    var10 = var9;
                }
                arg3.field1100 += var7 * var8 - 1048576;
                class299 var11 = arg3.field1106;
                if (this.field93.field1773[arg3.field1097] == 0) {
                    arg3.field1106 = class299.method2068(arg3.field1096, var11.method2061(), var11.method2056(), var11.method2046());
                } else {
                    arg3.field1106 = class299.method2068(arg3.field1096, var11.method2061(), 0, var11.method2046());
                    this.field93.method914(arg3, arg3.field1118.field1430[arg3.field1120] < 0, 127);
                    arg3.field1106.method2047(var10, var11.method2056());
                }
                if (arg3.field1118.field1430[arg3.field1120] < 0) {
                    arg3.field1106.method2040(-1);
                }
                var11.method2062(var10);
                var11.method49(arg0, arg2, arg5 - arg2);
                if (var11.method2050()) {
                    this.field113.method1840(var11);
                }
            }
        }
        field99++;
        arg3.field1106.method49(arg0, arg2, arg4);
        if (arg1) {
            method47(-106, true, -5, -26, (class49) null, -114);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIZ)I", line = 312)
    public static final int method56(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = -114 % ((arg2 + 80) / 42);
        field95++;
        class66 var5 = (class66) class70.field1146.method732((long) arg0, true);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field1067.length; var7++) {
            if (var5.field1067[var7] >= 0 && var5.field1067[var7] < field111) {
                class134 var8 = class5.method31(-1731690365, var5.field1067[var7]);
                if (var8.field2302 != null) {
                    class142 var9 = (class142) var8.field2302.method732((long) arg1, true);
                    if (var9 != null) {
                        if (arg3) {
                            var6 += var5.field1071[var7] * var9.field2601;
                        } else {
                            var6 += var9.field2601;
                        }
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(CB)C", line = 365)
    public static final char method57(char arg0, byte arg1) {
        if (arg1 < 104) {
            return (char) 65464;
        } else {
            field100++;
            return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V", line = 381)
    public static final void method58(int arg0, int arg1) {
        field102++;
        if (arg1 != -1048576) {
            field96 = (class51) null;
        }
        if (arg0 >= 0 && class124.field2140.length > arg0) {
            class124.field2140[arg0] = !class124.field2140[arg0];
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 394)
    public static final void method59(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class123.field2134 * 128) {
            arg0 = class123.field2134 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class185.field3144 * 128) {
            arg2 = class185.field3144 * 128 - 1;
        }
        class134.field2313 = class62.field962[arg3];
        class191.field3192 = class62.field961[arg3];
        class30.field434 = class62.field962[arg4];
        class205.field3482 = class62.field961[arg4];
        class233.field3870 = arg0;
        class205.field3502 = arg1;
        class75.field1226 = arg2;
        class51.field788 = arg0 / 128;
        class238.field3905 = arg2 / 128;
        class215.field3617 = class51.field788 - class259.field4197;
        if (class215.field3617 < 0) {
            class215.field3617 = 0;
        }
        class332.field5292 = class238.field3905 - class259.field4197;
        if (class332.field5292 < 0) {
            class332.field5292 = 0;
        }
        class202.field3444 = class51.field788 + class259.field4197;
        if (class202.field3444 > class123.field2134) {
            class202.field3444 = class123.field2134;
        }
        class304.field4813 = class259.field4197 + class238.field3905;
        if (class304.field4813 > class185.field3144) {
            class304.field4813 = class185.field3144;
        }
        short var15;
        if (class43.field680) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class259.field4197 + class259.field4197 + 2; var16++) {
            for (int var17 = 0; var17 < class259.field4197 + class259.field4197 + 2; var17++) {
                int var18 = (var16 - class259.field4197 << 7) - (class233.field3870 & 0x7F);
                int var19 = (var17 - class259.field4197 << 7) - (class75.field1226 & 0x7F);
                int var20 = class51.field788 + var16 - class259.field4197;
                int var21 = class238.field3905 + var17 - class259.field4197;
                if (var20 >= 0 && var21 >= 0 && var20 < class123.field2134 && var21 < class185.field3144) {
                    int var22;
                    if (class249.field4042 == null) {
                        var22 = class255.field4110[0][var20][var21] + 128 - class205.field3502;
                    } else {
                        var22 = class249.field4042[0][var20][var21] + 128 - class205.field3502;
                    }
                    int var23 = class255.field4110[3][var20][var21] - class205.field3502 - 1000;
                    class200.field3423[var16][var17] = class7.method45(var18, var23, var22, var19, var15);
                } else {
                    class200.field3423[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class259.field4197 + class259.field4197 + 1; var24++) {
            for (int var25 = 0; var25 < class259.field4197 + class259.field4197 + 1; var25++) {
                class112.field1878[var24][var25] = class200.field3423[var24][var25] || class200.field3423[var24 + 1][var25] || class200.field3423[var24][var25 + 1] || class200.field3423[var24 + 1][var25 + 1];
            }
        }
        class222.field3702 = arg6;
        class298.field4747 = arg7;
        class170.field2946 = arg8;
        class95.field1484 = arg9;
        class226.field3811 = arg10;
        class213.method1580();
        if (class78.field1258 != null) {
            class304.method2094(true);
            class158.method1262(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class43.field680) {
                class292.field4679 = false;
                class83.method749(0, 0, 109);
                class9.method69((float[]) null);
                class245.method1713();
            }
            class304.method2094(false);
        }
        class158.method1262(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V", line = 528)
    public static void method60(boolean arg0) {
        field107 = null;
        field96 = null;
        if (arg0) {
            field110 = (class244) null;
        }
        field110 = null;
        field104 = null;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lco;)V", line = 560)
    public class8(class107 arg0) {
        this.field93 = arg0;
    }
}
