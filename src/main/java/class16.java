import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class16 implements class57 {

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    private int field305 = 50;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Z")
    private boolean field311 = false;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Ltg;")
    private class75 field298;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Ltg;")
    private class75 field310;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Llb;")
    private class190 field313;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "[Z")
    private boolean[] field307;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "[B")
    private byte[] field306;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[Z")
    private boolean[] field308;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[Z")
    private boolean[] field301;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[B")
    private byte[] field303;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[B")
    private byte[] field296;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "[S")
    private short[] field316;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "[B")
    private byte[] field317;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[Z")
    private boolean[] field299;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[Z")
    private boolean[] field297;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field300 = 0;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "Lsb;")
    public static class98 field325 = class47.method368("::rebuild", 0);

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lgj;")
    public static class226 field315 = new class226(30);

    @OriginalMember(owner = "client!i", name = "K", descriptor = "Lsb;")
    private static class98 field332 = class47.method368("Loading)3)3)3", 0);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "Lsb;")
    public static class98 field330 = field332;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!i", name = "z", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!i", name = "A", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!i", name = "F", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[[S")
    public static short[][] field312;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)[I")
    public final int[] method131(int arg0, int arg1) {
        field324++;
        class91 var3 = this.method136(arg1, -55);
        if (var3 == null) {
            return null;
        } else if (arg0 > -1) {
            return null;
        } else {
            return var3.method667(-122, this, this.field311 || this.field307[arg1], this.field310);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIF)[I")
    public final int[] method132(int arg0, int arg1, float arg2) {
        field327++;
        class91 var4 = this.method136(arg1, -120);
        if (var4 == null) {
            return null;
        } else {
            var4.field1592 = true;
            int var5 = 38 % ((arg0 - 67) / 39);
            return var4.method668(this.field311 || this.field307[arg1], arg2, this.field310, this, (byte) -40);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method133(int arg0) {
        field323++;
        for (class34 var1 = (class34) class243.field4209.method1514((byte) 56); var1 != null; var1 = (class34) class243.field4209.method1515(119)) {
            int var2 = var1.field596;
            if (class141.method1056(var2, (byte) 77)) {
                class148[] var3 = class33.field585[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field2619;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field4061;
                    class148 var7 = class62.method455(arg0 ^ 0x32E81F6F, var6);
                    if (var7 != null) {
                        class72.method512(var7, 2);
                    }
                }
            }
        }
        if (arg0 != -1) {
            field330 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(II)Z")
    public final boolean method134(int arg0, int arg1) {
        field320++;
        if (this.field311 || this.field307[arg0]) {
            return true;
        } else {
            return arg1 <= 125;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public final void method135(boolean arg0) {
        field322++;
        this.field313.method1305(-1);
        if (!arg0) {
            this.field305 = 39;
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(II)Lrh;")
    private final class91 method136(int arg0, int arg1) {
        if (arg1 > -11) {
            return null;
        }
        field318++;
        class91 var3 = (class91) this.field313.method1307((byte) -69, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field298.method571(arg0, 0, 119);
        if (var4 == null) {
            return null;
        } else {
            class216 var5 = new class216(var4);
            class91 var6 = new class91(var5);
            this.field313.method1312(true, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static final void method137(int arg0) {
        field326++;
        if (arg0 != 20153) {
            method146(-59, (byte) -98, 28);
        }
        int var1 = class223.field3846.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class223.field3846[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class199.field3425; var4++) {
                    if (class49.field812[var2] == class21.field413[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class21.field413[class199.field3425] = class49.field812[var2];
                    var3 = class199.field3425++;
                }
                class216 var6 = new class216(class223.field3846[var2]);
                while (class223.field3846[var2].length > var6.field3728 && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1487(76);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 14;
                    int var11 = (class49.field812[var2] & 0xFF) * 64 + var9 - class182.field3143;
                    int var12 = var8 >> 7 & 0x3F;
                    int var13 = (class49.field812[var2] >> 8) * 64 + var12 - class189.field3277;
                    class120 var14 = class210.method1414(var6.method1487(2), (byte) 111);
                    if (class180.field3109[var7] == null && (var14.field2203 & 0x1) > 0 && class93.field1632 == var10 && var13 >= 0 && (var14.field2165 + var13) < 104 && var11 >= 0 && (var14.field2165 + var11) < 104) {
                        class180.field3109[var7] = new class108();
                        class108 var15 = class180.field3109[var7];
                        class87.field1546[class222.field3837++] = var7;
                        var15.field1928 = var14;
                        var15.field4510 = var15.field1928.field2176;
                        var15.field4508 = var15.field1928.field2169;
                        var15.field4456 = class236.field4071;
                        var15.field4463 = var15.field1928.field2202;
                        var15.field4521 = var15.field1928.field2213;
                        var15.field4512 = var15.field1928.field2188;
                        var15.field4517 = var15.field1928.field2155;
                        var15.field4462 = var15.field1928.field2179;
                        var15.field4497 = var15.field1928.field2192;
                        if (var15.field4497 == 0) {
                            var15.field4527 = 0;
                        }
                        var15.field4486 = var15.field1928.field2165;
                        var15.method1765(true, var13, var11, (byte) 102);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z")
    public final boolean method138(int arg0, int arg1) {
        if (arg1 == 0) {
            field331++;
            return this.field299[arg0];
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)I")
    public final int method139(int arg0, boolean arg1) {
        if (arg1) {
            return -120;
        } else {
            field329++;
            return this.field316[arg0] & 0xFFFF;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)V")
    public final void method140(byte arg0, int arg1) {
        int var3 = -41 / ((arg0 - 41) / 42);
        field314++;
        for (class91 var4 = (class91) this.field313.method1309((byte) 114); var4 != null; var4 = (class91) this.field313.method1313((byte) -111)) {
            if (var4.field1592) {
                var4.method666(false, arg1);
                var4.field1592 = false;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(II)Z")
    public final boolean method141(int arg0, int arg1) {
        field302++;
        if (arg1 != 8) {
            this.field298 = null;
        }
        return this.field297[arg0];
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)V")
    public final void method142(boolean arg0, int arg1) {
        if (arg1 == 255) {
            field328++;
            this.field311 = arg0;
            this.method135(true);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Z")
    public static final boolean method143(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class44.field732; var3++) {
            class74 var4 = class54.field872[var3];
            if (var4.field1243 == 1) {
                int var5 = var4.field1258 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1256 * var5 >> 8) + var4.field1249;
                    int var7 = (var4.field1257 * var5 >> 8) + var4.field1260;
                    int var8 = (var4.field1248 * var5 >> 8) + var4.field1254;
                    int var9 = (var4.field1252 * var5 >> 8) + var4.field1261;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1243 == 2) {
                int var10 = arg0 - var4.field1258;
                if (var10 > 0) {
                    int var11 = (var4.field1256 * var10 >> 8) + var4.field1249;
                    int var12 = (var4.field1257 * var10 >> 8) + var4.field1260;
                    int var13 = (var4.field1248 * var10 >> 8) + var4.field1254;
                    int var14 = (var4.field1252 * var10 >> 8) + var4.field1261;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1243 == 3) {
                int var15 = var4.field1249 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1255 * var15 >> 8) + var4.field1258;
                    int var17 = (var4.field1247 * var15 >> 8) + var4.field1263;
                    int var18 = (var4.field1248 * var15 >> 8) + var4.field1254;
                    int var19 = (var4.field1252 * var15 >> 8) + var4.field1261;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1243 == 4) {
                int var20 = arg2 - var4.field1249;
                if (var20 > 0) {
                    int var21 = (var4.field1255 * var20 >> 8) + var4.field1258;
                    int var22 = (var4.field1247 * var20 >> 8) + var4.field1263;
                    int var23 = (var4.field1248 * var20 >> 8) + var4.field1254;
                    int var24 = (var4.field1252 * var20 >> 8) + var4.field1261;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1243 == 5) {
                int var25 = arg1 - var4.field1254;
                if (var25 > 0) {
                    int var26 = (var4.field1255 * var25 >> 8) + var4.field1258;
                    int var27 = (var4.field1247 * var25 >> 8) + var4.field1263;
                    int var28 = (var4.field1256 * var25 >> 8) + var4.field1249;
                    int var29 = (var4.field1257 * var25 >> 8) + var4.field1260;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(II)Lje;")
    public static final class138 method144(int arg0, int arg1) {
        field304++;
        class138 var2 = (class138) class106.field1882.method1564((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class203.field3474.method571(class68.method473((byte) 59, arg1), class99.method756((byte) 122, arg1), arg0 ^ 0x7D);
        class138 var4 = new class138();
        if (var3 != null) {
            var4.method1047(new class216(var3), 18541);
        }
        var4.method1046(false);
        class106.field1882.method1563((long) arg1, 21771, var4);
        if (arg0 != 1) {
            field300 = 126;
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Z")
    public final boolean method145(int arg0, int arg1) {
        field321++;
        class91 var3 = this.method136(arg1, arg0 - 11364);
        if (arg0 == 11301) {
            return var3 == null ? false : var3.method671(this, this.field310, (byte) 94);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)I")
    public static final int method146(int arg0, byte arg1, int arg2) {
        field319++;
        int var3 = class34.method295(arg0 + 91923, 4, arg2 + 45365, 1) + ((class34.method295(arg0 + 37821, 2, arg2 + 10294, 1) + -128 >> 1) - -(class34.method295(arg0, 1, arg2, 1) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        int var5 = 60 % ((arg1 + 46) / 33);
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Ltg;Ltg;Ltg;IZ)V")
    public class16(class75 arg0, class75 arg1, class75 arg2, int arg3, boolean arg4) {
        this.field298 = arg0;
        this.field310 = arg2;
        this.field311 = arg4;
        this.field305 = arg3;
        this.field313 = new class190(this.field305);
        class216 var6 = new class216(arg1.method571(0, 0, -77));
        int var7 = var6.method1487(62);
        this.field307 = new boolean[var7];
        this.field306 = new byte[var7];
        this.field308 = new boolean[var7];
        this.field301 = new boolean[var7];
        this.field303 = new byte[var7];
        this.field296 = new byte[var7];
        this.field316 = new short[var7];
        this.field317 = new byte[var7];
        this.field299 = new boolean[var7];
        this.field297 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field301[var8] = var6.method1446(5350) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field301[var9]) {
                this.field299[var9] = var6.method1446(5350) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field301[var10]) {
                this.field297[var10] = var6.method1446(5350) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field301[var11]) {
                this.field307[var11] = var6.method1446(5350) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field301[var12]) {
                this.field308[var12] = var6.method1446(5350) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field301[var13]) {
                this.field306[var13] = var6.method1472(119);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field301[var14]) {
                this.field296[var14] = var6.method1472(69);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field301[var15]) {
                this.field317[var15] = var6.method1472(105);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field301[var16]) {
                this.field303[var16] = var6.method1472(127);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field301[var17]) {
                this.field316[var17] = (short) var6.method1487(7);
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V")
    public static void method147(int arg0) {
        field312 = null;
        field332 = null;
        field325 = null;
        if (arg0 == 0) {
            field315 = null;
            field330 = null;
        }
    }
}
