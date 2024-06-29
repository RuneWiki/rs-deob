import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class9 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Ljn;")
    private class117 field101 = new class117(64);

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Ljn;")
    public class117 field119 = new class117(50);

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lsn;")
    public class655 field122 = new class655(250);

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "Lqea;")
    private class319 field123 = new class319();

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lvo;")
    private class345 field110;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Lfi;")
    private class238 field126;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lvo;")
    public class345 field112;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Z")
    private boolean field118;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field125;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field127;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Lqj;")
    public static class511 field120 = new class511(2, 7);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public int field124;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 6)
    public final void method41(int arg0) {
        class117 var2 = this.field101;
        synchronized (this.field101) {
            this.field101.method936(arg0 - 72);
        }
        if (arg0 != 0) {
            this.method47(46, 122, -4, 102, true, 42, true, -74, null, null, null, null);
        }
        field103++;
        class117 var3 = this.field119;
        synchronized (this.field119) {
            this.field119.method936(-104);
        }
        class655 var4 = this.field122;
        synchronized (this.field122) {
            this.field122.method3689((byte) -56);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Lnk;", line = 29)
    public final class432 method42(int arg0, boolean arg1) {
        field121++;
        class117 var3 = this.field101;
        class432 var4;
        synchronized (this.field101) {
            var4 = (class432) this.field101.method941((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1) {
            this.method43(false, -48);
        }
        class345 var5 = this.field110;
        byte[] var6;
        synchronized (this.field110) {
            var6 = this.field110.method2081(-126, class434.method2548(-126, arg0), class28.method268(arg0, 3));
        }
        class432 var7 = new class432();
        var7.field6179 = this;
        var7.field6217 = arg0;
        var7.field6151 = new String[] { null, null, class343.field4756.method2059(this.field111, !arg1), null, null };
        var7.field6153 = new String[] { null, null, null, null, class343.field4757.method2059(this.field111, !arg1) };
        if (var6 != null) {
            var7.method2536(new class465(var6), -117);
        }
        var7.method2526((byte) -79);
        if (var7.field6146 != -1) {
            var7.method2539(this.method42(var7.field6146, false), this.method42(var7.field6201, false), -14);
        }
        if (var7.field6157 != -1) {
            var7.method2527(this.method42(var7.field6157, false), 24, this.method42(var7.field6149, false));
        }
        if (!this.field118 && var7.field6218) {
            var7.field6194 = class343.field4754.method2059(this.field111, !arg1);
            var7.field6151 = this.field125;
            var7.field6163 = false;
            var7.field6159 = null;
            var7.field6153 = this.field127;
            var7.field6185 = 0;
            if (var7.field6158 != null) {
                boolean var8 = false;
                for (class435 var9 = var7.field6158.method2815(0); var9 != null; var9 = var7.field6158.method2814(4)) {
                    class349 var10 = this.field126.method1554(false, (int) var9.field6265);
                    if (var10.field4926) {
                        var9.method2549((byte) 108);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field6158 = null;
                }
            }
        }
        class117 var11 = this.field101;
        synchronized (this.field101) {
            this.field101.method949((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V", line = 109)
    public final void method43(boolean arg0, int arg1) {
        field116++;
        if (this.field118 != arg0 && arg1 == 2) {
            this.field118 = arg0;
            this.method41(0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I", line = 128)
    public static final int method44(int arg0, int arg1, int arg2) {
        field107++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else if (arg0 > -60) {
            return -107;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 165)
    public final void method45(int arg0) {
        if (arg0 != -15311) {
            this.field119 = null;
        }
        field109++;
        class117 var2 = this.field119;
        synchronized (this.field119) {
            this.field119.method936(arg0 ^ 0x3BFD);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIBILlw;Lr;II)Lf;", line = 179)
    public final class257 method46(int arg0, int arg1, byte arg2, int arg3, class188 arg4, class98 arg5, int arg6, int arg7) {
        int var9 = 80 % ((74 - arg2) / 42);
        this.field123.field4392 = arg0;
        this.field123.field4395 = arg3;
        this.field123.field4397 = arg6;
        this.field123.field4393 = arg1;
        field113++;
        this.field123.field4401 = arg4 != null;
        this.field123.field4398 = arg5.field1463;
        this.field123.field4399 = arg7;
        return (class257) this.field122.method3692(this.field123, 0);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIZIZILr;Llw;Lla;Lr;)Lf;", line = 196)
    public final class257 method47(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7, class98 arg8, class188 arg9, class395 arg10, class98 arg11) {
        if (arg3 != 0) {
            return null;
        }
        field117++;
        class257 var13 = this.method46(arg5, arg2, (byte) 123, arg7, arg9, arg8, arg1, arg0);
        if (var13 != null) {
            return var13;
        }
        class432 var14 = this.method42(arg0, false);
        if (arg2 > 1 && var14.field6190 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg2 >= var14.field6195[var16] && var14.field6195[var16] != 0) {
                    var15 = var14.field6190[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method42(var15, false);
            }
        }
        int[] var17 = var14.method2524(arg5, arg11, arg10, arg8, arg7, arg1, arg9, (byte) 98, arg6, arg2);
        if (var17 == null) {
            return null;
        }
        class257 var18;
        if (arg4) {
            var18 = arg11.method806(var17, 0, 36, 36, 32);
        } else {
            var18 = arg8.method806(var17, 0, 36, 36, 32);
        }
        if (!arg4) {
            class319 var19 = new class319();
            var19.field4395 = arg7;
            var19.field4398 = arg8.field1463;
            var19.field4393 = arg2;
            var19.field4401 = arg9 != null;
            var19.field4392 = arg5;
            var19.field4397 = arg1;
            var19.field4399 = arg0;
            this.field122.method3696(var19, (byte) 121, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZI)V", line = 267)
    public static final void method48(int arg0, boolean arg1, int arg2) {
        field106++;
        class449 var3 = class611.method3463(0, (byte) -116, 15);
        var3.method2615((byte) -87);
        if (!arg1) {
            field120 = null;
        }
        var3.field6480 = arg0;
        var3.field6472 = arg2;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IZ)V", line = 283)
    public final void method49(int arg0, boolean arg1) {
        field102++;
        this.field124 = arg0;
        if (arg1) {
            this.field123 = null;
        }
        class117 var3 = this.field119;
        synchronized (this.field119) {
            this.field119.method936(-118);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 297)
    public final void method50(int arg0) {
        class117 var2 = this.field101;
        synchronized (this.field101) {
            this.field101.method950((byte) -8);
        }
        field108++;
        class117 var3 = this.field119;
        synchronized (this.field119) {
            this.field119.method950((byte) 62);
        }
        if (arg0 != -2) {
            this.field101 = null;
        }
        class655 var4 = this.field122;
        synchronized (this.field122) {
            this.field122.method3697((byte) 19);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V", line = 317)
    public final void method51(int arg0, int arg1) {
        class117 var3 = this.field101;
        synchronized (this.field101) {
            this.field101.method939(28093, arg0);
        }
        field115++;
        class117 var4 = this.field119;
        synchronized (this.field119) {
            this.field119.method939(28093, arg0);
        }
        class655 var5 = this.field122;
        synchronized (this.field122) {
            this.field122.method3694(arg0, (byte) -70);
        }
        if (arg1 != -2) {
            this.method42(-114, true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lgn;IZLfi;Lvo;Lvo;)V", line = 621)
    public class9(class529 arg0, int arg1, boolean arg2, class238 arg3, class345 arg4, class345 arg5) {
        this.field110 = arg4;
        this.field126 = arg3;
        this.field112 = arg5;
        this.field118 = arg2;
        this.field111 = arg1;
        if (this.field110 == null) {
            this.field104 = 0;
        } else {
            int var7 = this.field110.method2102(true) - 1;
            this.field104 = var7 * 256 + this.field110.method2098(0, var7);
        }
        this.field125 = new String[] { null, null, class343.field4756.method2059(this.field111, true), null, null };
        this.field127 = new String[] { null, null, null, null, class343.field4757.method2059(this.field111, true) };
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V", line = 340)
    public static final void method52() {
        if (class608.field8743 != null) {
            for (int var0 = 0; var0 < class608.field8743.length; var0++) {
                for (int var1 = 0; var1 < class33.field474; var1++) {
                    for (int var2 = 0; var2 < class687.field9758; var2++) {
                        if (class608.field8743[var0][var1][var2] != null) {
                            class608.field8743[var0][var1][var2].method1790(true);
                        }
                        class608.field8743[var0][var1][var2] = null;
                    }
                }
            }
        }
        class608.field8743 = null;
        class621.field8841 = null;
        if (class667.field9371 != null) {
            for (int var3 = 0; var3 < class667.field9371.length; var3++) {
                for (int var4 = 0; var4 < class33.field474; var4++) {
                    for (int var5 = 0; var5 < class687.field9758; var5++) {
                        if (class667.field9371[var3][var4][var5] != null) {
                            class667.field9371[var3][var4][var5].method1790(true);
                        }
                        class667.field9371[var3][var4][var5] = null;
                    }
                }
            }
        }
        class667.field9371 = null;
        class340.field4723 = null;
        class541.field7946 = null;
        class687.field9745 = null;
        class678.field9661 = null;
        class513.field7625 = null;
        class128.field2095 = null;
        class390.field5686 = null;
        class617.method3491((byte) 83);
        if (class88.field1308 != null) {
            for (int var6 = 0; var6 < class136.field2197; var6++) {
                class88.field1308[var6] = null;
            }
            class136.field2197 = 0;
        }
        if (class431.field6138 != null) {
            for (int var7 = 0; var7 < class310.field4305[0]; var7++) {
                class431.field6138[0][var7] = null;
            }
            for (int var8 = 0; var8 < class310.field4305[1]; var8++) {
                class431.field6138[1][var8] = null;
            }
            class310.field4305 = new int[2];
        }
        if (class430.field6131 != null) {
            for (int var9 = 0; var9 < class352.field4945[0]; var9++) {
                class430.field6131[0][var9] = null;
            }
            for (int var10 = 0; var10 < class352.field4945[1]; var10++) {
                class430.field6131[1][var10] = null;
            }
            class352.field4945 = new int[2];
        }
        if (class128.field2093 != null) {
            for (int var11 = 0; var11 < class108.field1764[0]; var11++) {
                class128.field2093[0][var11] = null;
            }
            for (int var12 = 0; var12 < class108.field1764[1]; var12++) {
                class128.field2093[1][var12] = null;
            }
            class108.field1764 = new int[2];
        }
        if (class186.field2923 != null) {
            for (int var13 = 0; var13 < class186.field2923.length; var13++) {
                class186.field2923[var13] = null;
            }
            class386.field5651 = 0;
        }
        if (class229.field3400 != null) {
            for (int var14 = 0; var14 < class229.field3400.length; var14++) {
                class229.field3400[var14] = null;
            }
            class634.field8979 = 0;
        }
        if (class126.field2067 != null) {
            for (int var15 = 0; var15 < class410.field5858; var15++) {
                class126.field2067[var15] = null;
            }
            for (int var16 = 0; var16 < class596.field8626; var16++) {
                for (int var17 = 0; var17 < class33.field474; var17++) {
                    for (int var18 = 0; var18 < class687.field9758; var18++) {
                        class155.field2554[var16][var17][var18] = 0L;
                    }
                }
            }
            class410.field5858 = 0;
        }
        class263.method1675((byte) -44);
        class221.field3305.method3311(-35);
        class352.field4941 = null;
        class544.field7990 = null;
        class453.field6524 = null;
        if (class355.field4980 != null) {
            class619.method3496();
            class490.field7029.method751(1);
            class490.field7029.method807(0);
        }
        if (class254.field3674 != null) {
            class254.field3674 = null;
        }
        class490.field7029 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILr;)V", line = 563)
    public static final void method53(int arg0, class98 arg1) {
        field105++;
        class424.field6054 = class164.method1250(class515.field7635, (byte) 117, true, arg1);
        class180.field2847 = class620.method3500(class515.field7635, (byte) -53, arg1);
        class335.field4670 = class164.method1250(class51.field678, (byte) -89, true, arg1);
        class399.field5763 = class620.method3500(class51.field678, (byte) -53, arg1);
        class148.field2503 = class164.method1250(class271.field3890, (byte) -115, true, arg1);
        if (arg0 == -1) {
            class246.field3584 = class620.method3500(class271.field3890, (byte) -53, arg1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 583)
    public final void method54(int arg0) {
        field114++;
        if (arg0 != 2) {
            this.field111 = 43;
        }
        class655 var2 = this.field122;
        synchronized (this.field122) {
            this.field122.method3689((byte) 107);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 597)
    public static void method55(byte arg0) {
        field120 = null;
        if (arg0 != 11) {
            field120 = null;
        }
    }
}
