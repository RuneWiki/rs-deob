import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class451 extends class535 {

    @OriginalMember(owner = "client!go", name = "N", descriptor = "Ljava/lang/String;")
    public static String field6587 = "";

    @OriginalMember(owner = "client!go", name = "R", descriptor = "Lbd;")
    public static class44 field6591;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "J")
    public static long field6592;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!go", name = "I", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "Lef;")
    public static class344 field6589;

    static {
        new class44("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
        field6591 = new class44("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
        field6592 = 0L;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(II)I", line = 3)
    public static final int method2683(int arg0, int arg1) {
        return class539.field7922 != null ? class539.field7922[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)[[I", line = 6)
    public final int[][] method61(int arg0, int arg1) {
        if (arg0 >= -116) {
            method2686((class411) null, 10, 13);
        }
        ++field6579;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class174.field2597 < ~var7; ++var7) {
                this.method2691(arg1, var7, (byte) -87);
                int[][] var8 = this.method3157((byte) 67, class336.field4979, 0);
                var4[var7] = var8[0][class259.field3841];
                var5[var7] = var8[1][class259.field3841];
                var6[var7] = var8[2][class259.field3841];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 50)
    public class451() {
        super(1, false);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILwn;I)V", line = 53)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 != -6232) {
            field6589 = null;
        }
        if (arg0 == 0) {
            super.field7878 = ~arg1.method3072((byte) -121) == -2;
        }
        ++field6585;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(II)[I", line = 67)
    public final int[] method65(int arg0, int arg1) {
        ++field6590;
        if (arg1 != 1) {
            method2683(81, -46);
        }
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            for (int var4 = 0; class174.field2597 > var4; ++var4) {
                this.method2691(arg0, var4, (byte) -102);
                int[] var5 = this.method3158(arg1 + 124, 0, class336.field4979);
                var3[var4] = var5[class259.field3841];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 105)
    public static final void method2684(int arg0) {
        if (arg0 == 2048) {
            ++field6588;
            for (class107 var1 = (class107) class533.field7867.method863(-1); var1 != null; var1 = (class107) class533.field7867.method865(-1)) {
                class359 var2 = var1.field1615;
                if (!var2.field5224) {
                    if (class24.field349 >= var2.field5216) {
                        var2.method2228(arg0 ^ 2166, class163.field2465);
                        if (var2.field5224) {
                            var1.method421(22071);
                        } else {
                            class501.method2930(var2, true);
                        }
                    }
                } else {
                    var1.method421(22071);
                    var2.method2226(102);
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIII)Z", line = 141)
    public static final boolean method2685(int arg0, int arg1, int arg2, int arg3) {
        if (!class526.method3116(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class322.field4795;
            int var5 = arg2 << class322.field4795;
            return class544.method3193(var4 + 1, class146.field2262[arg0].method156(arg1, arg2) + arg3, var5 + 1) && class544.method3193(class291.field4317 + var4 - 1, class146.field2262[arg0].method156(arg1 + 1, arg2) + arg3, var5 + 1) && class544.method3193(class291.field4317 + var4 - 1, class146.field2262[arg0].method156(arg1 + 1, arg2 + 1) + arg3, class291.field4317 + var5 - 1) && class544.method3193(var4 + 1, class146.field2262[arg0].method156(arg1, arg2 + 1) + arg3, class291.field4317 + var5 - 1);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lul;II)I", line = 155)
    public static final int method2686(class411 arg0, int arg1, int arg2) {
        ++field6580;
        return arg2;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Liu;B)V", line = 173)
    public static final void method2687(class415 arg0, byte arg1) {
        ++field6586;
        arg0.method2477(-129);
        int var2 = class497.field7188;
        class510 var3 = class364.field5293 = class494.field7143[var2] = new class510();
        var3.field290 = var2;
        int var4 = arg0.method2487(30, -103);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 16383;
        if (arg1 != -23) {
            field6589 = null;
        }
        int var7 = var4 & 16383;
        var3.field343[0] = -class82.field1315 + var6;
        var3.field6961 = (var3.field343[0] << 7) - -(var3.method135((byte) 72) << 6);
        var3.field344[0] = -class501.field7240 + var7;
        var3.field6965 = (var3.field344[0] << 7) - -(var3.method135((byte) 72) << 6);
        class123.field1944 = var3.field6956 = var5;
        if (class138.field2148[var2] != null) {
            var3.method2967(-35, class138.field2148[var2]);
        }
        class452.field6603 = 0;
        class532.field7853[class452.field6603++] = var2;
        class21.field227[var2] = 0;
        class51.field940 = 0;
        for (int var8 = 1; var8 < 2048; ++var8) {
            if (~var2 != ~var8) {
                int var9 = arg0.method2487(18, -125);
                int var10 = var9 >> 16;
                int var11 = 255 & var9 >> 8;
                int var12 = var9 & 255;
                class22 var13 = class263.field3977[var8] = new class22();
                var13.field230 = -1;
                var13.field228 = (var11 << 14) + (var10 << 28) + var12;
                var13.field233 = false;
                var13.field229 = 0;
                class506.field7308[class51.field940++] = var8;
                class21.field227[var8] = 0;
            }
        }
        arg0.method2482(arg1 + 31);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)V", line = 245)
    public static final void method2688(int arg0, boolean arg1) {
        ++field6582;
        if (arg0 > 6) {
            while (~class336.field4966.method2481(-5, class305.field4527) <= -16) {
                int var2 = class336.field4966.method2487(15, -89);
                if (var2 == 32767) {
                    break;
                }
                boolean var3 = false;
                class193 var4 = (class193) class390.field5539.method2284(true, (long) var2);
                if (var4 == null) {
                    class279 var5 = new class279();
                    var5.field290 = var2;
                    var4 = new class193(var5);
                    class390.field5539.method2292((long) var2, var4, (byte) -127);
                    var3 = true;
                    class221.field3375[class329.field4838++] = var4;
                }
                class279 var6 = var4.field2805;
                class483.field7012[class477.field6952++] = var2;
                var6.field237 = class24.field349;
                if (var6.field4157 != null && var6.field4157.method1976(-83)) {
                    class173.method1217((byte) 117, var6);
                }
                var6.method1793(class117.field1812.method2310(-1, class336.field4966.method2487(14, -22)), -107);
                int var7;
                if (arg1) {
                    var7 = class336.field4966.method2487(8, -23);
                    if (var7 > 127) {
                        var7 -= 256;
                    }
                } else {
                    var7 = class336.field4966.method2487(5, -18);
                    if (~var7 < -16) {
                        var7 -= 32;
                    }
                }
                int var8;
                if (arg1) {
                    var8 = class336.field4966.method2487(8, -87);
                    if (~var8 < -128) {
                        var8 -= 256;
                    }
                } else {
                    var8 = class336.field4966.method2487(5, -86);
                    if (~var8 < -16) {
                        var8 -= 32;
                    }
                }
                int var9 = 4 + class336.field4966.method2487(3, -101) << 11 & 15542;
                int var10 = class336.field4966.method2487(1, -58);
                int var11 = class336.field4966.method2487(1, -112);
                if (~var11 == -2) {
                    class56.field1009[class162.field2458++] = var2;
                }
                int var12 = class336.field4966.method2487(2, -23);
                var6.method137((byte) 87, var6.field4157.field4620);
                var6.field305 = var6.field4157.field4604 << 3;
                if (var3) {
                    var6.method130((byte) 31, var9, true);
                }
                var6.method1795(var6.method135((byte) 72), ~var10 == -2, (byte) -25, class364.field5293.field343[0] + var7, var12, class364.field5293.field344[0] + var8);
                if (var6.field4157.method1976(-32)) {
                    class332.method2105(45, var6.field343[0], var6.field6956, var6, 0, var6.field344[0], (class261) null, (class510) null);
                }
            }
            class336.field4966.method2482(8);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIIIBI)V", line = 350)
    public static final void method2689(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field6581;
        int var7 = 46 % ((arg5 - 7) / 41);
        class3[] var8 = class356.field5182;
        for (int var9 = 0; var8.length > var9; ++var9) {
            class3 var10 = var8[var9];
            if (var10 != null && ~var10.field17 == -3) {
                class299.method1919(arg2 >> 1, var10.field13 * 2, arg6 >> 1, arg3, -112, var10.field10, var10.field14, arg1, var10.field16);
                if (~class452.field6599[0] < 0 && class24.field349 % 20 < 10) {
                    class288.field4263[var10.field12].method2175(arg0 + -12 - -class452.field6599[0], class452.field6599[1] + arg4 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V", line = 384)
    public static void method2690(int arg0) {
        if (arg0 != 23614) {
            method2684(70);
        }
        field6589 = null;
        field6591 = null;
        field6587 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB)V", line = 405)
    private final void method2691(int arg0, int arg1, byte arg2) {
        ++field6584;
        int var4 = class539.field7939[arg1];
        int var5 = class448.field6442[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class259.field3841 = arg1;
            class336.field4979 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class336.field4979 = arg1;
            class259.field3841 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class336.field4979 = arg1;
            class259.field3841 = -arg0 + class174.field2597;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class336.field4979 = class362.field5263 - arg0;
            class259.field3841 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class259.field3841 = class174.field2597 - arg1;
            class336.field4979 = class362.field5263 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class259.field3841 = -arg0 + class174.field2597;
            class336.field4979 = -arg1 + class362.field5263;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class259.field3841 = arg0;
            class336.field4979 = -arg1 + class362.field5263;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class336.field4979 = arg0;
            class259.field3841 = -arg1 + class174.field2597;
        }
        class336.field4979 &= class293.field4364;
        class259.field3841 &= class529.field7783;
        if (arg2 >= -59) {
            field6591 = null;
        }
    }
}
