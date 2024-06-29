import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class35 extends class301 {

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "Z")
    public boolean field779 = true;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "[I")
    public static int[] field776 = new int[] { 0, 0, 0, 0, 2, 0, 3, 0, -1, -1, 0, 10, 3, 0, 0, -2, 0, 0, 0, 5, 3, 0, 4, 0, 0, 0, 0, 0, 0, 12, 0, -1, 15, 6, 12, 0, 0, 0, 3, 7, 0, 10, 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 6, 0, 2, 0, -1, 0, 0, -2, 0, 0, 8, 0, 0, 5, -1, 2, 1, 9, 3, -1, 0, 6, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, -2, 0, 0, 6, -1, -2, -1, 7, 1, 17, 4, 0, 0, 0, 0, 2, 0, 0, 12, 28, 0, 0, 0, 0, 6, 3, 8, -1, 0, -1, 0, 5, 0, 2, 0, 0, 7, 3, 0, 6, 8, 0, -2, 0, -2, 7, 8, 0, 8, 6, -1, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, -2, 0, -2, 0, 0, 4, 12, 0, 0, -2, 14, -2, 0, 0, 0, 0, 10, 1, 4, 0, -1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 12, 0, 0, 0, 8, 1, 0, 0, 6, 0, 0, 0, 20, 0, 0, 2, 0, 0, 0, 0, 10, 0, 8, 0, 2, -1, 0, 0, 0, 0, 0, 0, -1, 0, 15, 8, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -1, 3, 8, 0, 0, 0, 0, 0, 6, 14, 6, 0, -2 };

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "[I")
    public int[] field768;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "[I")
    private int[] field769;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field765;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "[[I")
    private int[][] field774;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILoe;B)V", line = 6)
    private final void method249(int arg0, class146 arg1, byte arg2) {
        field777++;
        int var4 = -46 % ((37 - arg2) / 38);
        if (arg0 == 1) {
            this.field765 = class209.method1444(arg1.method1017((byte) -120), '<', false);
        } else if (arg0 == 2) {
            int var5 = arg1.method1005((byte) 122);
            this.field768 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field768[var6] = arg1.method989(106);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method1005((byte) 122);
            this.field769 = new int[var7];
            this.field774 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg1.method989(82);
                this.field769[var8] = var9;
                this.field774[var8] = new int[class79.field1404[var9]];
                for (int var10 = 0; var10 < class79.field1404[var9]; var10++) {
                    this.field774[var8][var10] = arg1.method989(82);
                }
            }
        } else if (arg0 == 4) {
            this.field779 = false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V", line = 71)
    public final void method250(int arg0) {
        field773++;
        if (arg0 <= 32) {
            this.field765 = (String[]) null;
        }
        if (this.field768 != null) {
            for (int var2 = 0; var2 < this.field768.length; var2++) {
                this.field768[var2] = class287.method2034(this.field768[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLoe;)Ljava/lang/String;", line = 91)
    public final String method251(byte arg0, class146 arg1) {
        StringBuffer var3 = new StringBuffer(80);
        field782++;
        if (this.field769 != null) {
            for (int var4 = 0; var4 < this.field769.length; var4++) {
                var3.append(this.field765[var4]);
                var3.append(class1.method9(-5, this.field774[var4], arg1.method1047(-13030, class128.field2233[this.field769[var4]]), this.field769[var4]));
            }
        }
        if (arg0 != 50) {
            this.field774 = (int[][]) ((int[][]) null);
        }
        var3.append(this.field765[this.field765.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILsb;Laj;)V", line = 120)
    public static final void method252(int arg0, class127 arg1, class1 arg2) {
        if (arg0 < 80) {
            return;
        }
        field766++;
        class211 var3 = arg2.method2((byte) -117);
        if (var3 == null) {
            return;
        }
        int var4 = arg1.field2223;
        int var5 = var3.field5229;
        if (var3.field5236 > var3.field5229) {
            var5 = var3.field5236;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = arg1.field2227;
        if (arg2.field15 != null) {
            var6 = class173.field2877.method630(arg2.field15, (int[]) null, class10.field291);
            for (int var10 = 0; var10 < var6; var10++) {
                String var11 = class10.field291[var10];
                if ((var6 - 1) > var10) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class212.field3513.method1192(var11);
                if (var8 < var12) {
                    var8 = var12;
                }
            }
            var7 = (var6 - 1) * class212.field3513.method1201() + (class212.field3513.method1200() / 2);
        }
        int var13 = arg1.field2227 - var7 / 2;
        int var14 = arg1.field2223;
        if ((class38.field831 + var5) > var4) {
            var14 = var5 / 2 + class38.field831 + var5 + (var8 / 2) + 5;
            var4 = class38.field831 + var5;
        } else if ((class38.field845 - var5) < var4) {
            var14 = class38.field845 - (var8 / 2 + 5) - (var5 / 2) - var5;
            var4 = class38.field845 - var5;
        }
        if ((class38.field838 + var5) > var9) {
            var9 = class38.field838 + var5;
            var13 = class38.field838 + var5 - (-(var5 / 2) - class212.field3513.method1201());
        } else if (var9 > (class38.field830 - var5)) {
            var9 = class38.field830 - var5;
            var13 = class38.field830 - var5 - (var5 / 2) - var7;
        }
        int var15 = var5 >> 1;
        int var16 = -2;
        int var17 = (int) ((Math.atan2((double) (var4 - arg1.field2223), (double) (var9 - arg1.field2227)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        var3.method1448(var3.field5239 << 3, var3.field5228 << 3, (var4 << 4) + var15, (var9 << 4) - -var15, var17, 4096);
        if (arg2.field15 != null) {
            var19 = var13 - class212.field3513.method1200() - 3;
            var18 = var14 - (var8 / 2) - 5;
            var20 = class212.field3513.method1201() * var6 + var19;
            var16 = var18 + var8 + 10;
            if (arg2.field26 != 0) {
                class270.method1890(var18, var19, var16 - var18, var20 - var19, arg2.field26, arg2.field26 >>> 24);
            }
            if (arg2.field34 != 0) {
                class270.method1901(var18, var19, var16 - var18, -var19 + var20, arg2.field34, arg2.field34 >>> 24);
            }
            for (int var21 = 0; var21 < var6; var21++) {
                String var22 = class10.field291[var21];
                if (var6 - 1 > var21) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class212.field3513.method1199(var22, var14, var13, arg2.field1, true);
                var13 += class212.field3513.method1201();
            }
        }
        if ((var4 - var15) >= class73.field1339 || class73.field1339 >= (var4 + var15) || class26.field662 <= var9 - var15 || (var9 + var15) <= class26.field662 && var18 >= class73.field1339 || var16 <= class73.field1339 || var19 >= class26.field662 || class26.field662 >= var20) {
            return;
        }
        if (arg2.field31[4] != null) {
            class358.method2530(arg2.field22, (long) arg1.field2219, 0, (short) 1009, false, arg2.field31[4], 0, -1);
        }
        if (arg2.field31[3] != null) {
            class358.method2530(arg2.field22, (long) arg1.field2219, 0, (short) 1003, false, arg2.field31[3], 0, -1);
        }
        if (arg2.field31[2] != null) {
            class358.method2530(arg2.field22, (long) arg1.field2219, 0, (short) 1005, false, arg2.field31[2], 0, -1);
        }
        if (arg2.field31[1] != null) {
            class358.method2530(arg2.field22, (long) arg1.field2219, 0, (short) 1006, false, arg2.field31[1], 0, -1);
        }
        if (arg2.field31[0] != null) {
            class358.method2530(arg2.field22, (long) arg1.field2219, 0, (short) 1008, false, arg2.field31[0], 0, -1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([IZLoe;)V", line = 282)
    public final void method253(int[] arg0, boolean arg1, class146 arg2) {
        field767++;
        if (this.field769 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field769.length && var4 < arg0.length; var4++) {
            int var5 = class194.field3260[this.method255(0, var4)];
            if (var5 > 0) {
                arg2.method1051(-2424, (long) arg0[var4], var5);
            }
        }
        if (arg1) {
            this.method255(-71, -95);
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)Ljava/lang/String;", line = 309)
    public final String method254(int arg0) {
        field775++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field765 == null) {
            return "";
        }
        var2.append(this.field765[0]);
        int var3 = 44 % ((arg0 + 56) / 34);
        for (int var4 = 1; var4 < this.field765.length; var4++) {
            var2.append("...");
            var2.append(this.field765[var4]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)I", line = 340)
    public final int method255(int arg0, int arg1) {
        field771++;
        if (arg0 != 0) {
            method252(-65, (class127) null, (class1) null);
        }
        return this.field769 == null || arg1 < 0 || this.field769.length < arg1 ? -1 : this.field769[arg1];
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)V", line = 357)
    public static void method256(int arg0) {
        if (arg0 == -1) {
            field776 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)I", line = 370)
    public final int method257(int arg0) {
        field772++;
        int var2 = 63 / ((arg0 + 5) / 56);
        return this.field769 == null ? 0 : this.field769.length;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)[Lka;", line = 388)
    public static final class211[] method258(boolean arg0) {
        field783++;
        class211[] var1 = new class211[class238.field3972];
        for (int var2 = 0; var2 < class238.field3972; var2++) {
            var1[var2] = new class211(class91.field1617, class12.field368, class321.field5218[var2], class232.field3804[var2], class9.field284[var2], class76.field1367[var2], class309.field5053[var2], class323.field5225);
        }
        if (!arg0) {
            method252(-96, (class127) null, (class1) null);
        }
        class213.method1470(false);
        return var1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V", line = 411)
    public static final void method259(int arg0, int arg1, int arg2) {
        field764++;
        int var3 = class52.field1045 * arg0 >> 8;
        if (arg1 > -33) {
            method262();
        }
        if (arg2 == -1 && !class291.field4720) {
            class65.method520(-98);
        } else if (arg2 != -1 && (class131.field2259 != arg2 || !class191.method1318(-27525)) && var3 != 0 && !class291.field4720) {
            class275.method1955(0, arg2, 2, false, var3, 1, class112.field2043);
        }
        class131.field2259 = arg2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IZ)V", line = 441)
    public static final void method260(int arg0, boolean arg1) {
        field781++;
        byte[][] var2;
        byte var3;
        if (class241.field4016 && arg1) {
            var2 = class21.field540;
            var3 = 1;
        } else {
            var2 = class341.field5405;
            var3 = 4;
        }
        int var4 = var2.length;
        if (arg0 != 17898) {
            field776 = (int[]) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            int[] var7 = null;
            int var8 = class127.field2221[var5] >> 8;
            int var9 = class127.field2221[var5] & 0xFF;
            int var10 = var9 * 64 - class21.field543;
            int var11 = var8 * 64 - class272.field4426;
            if (var6 != null) {
                class119.method865(-4097);
                var7 = class199.method1366((byte) -112, var10, class23.field576, arg1, class272.field4426, var11, var6, class21.field543);
            }
            if (!arg1 && class174.field2886 / 8 == var8 && (class115.field2070 / 8) == var9) {
                if (var7 == null) {
                    class86.field1494 = -1;
                } else {
                    class109.field2000 = var7[2];
                    class162.field2724 = var7[3];
                    class25.field650 = var7[1];
                    class316.field5150 = var7[4];
                    class86.field1494 = var7[0];
                }
            }
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class127.field2221[var12] >> 8) * 64 - class272.field4426;
            int var14 = (class127.field2221[var12] & 0xFF) * 64 - class21.field543;
            byte[] var15 = var2[var12];
            if (var15 == null && class115.field2070 < 800) {
                class119.method865(-4097);
                for (int var16 = 0; var16 < var3; var16++) {
                    class359.method2537(var13, var14, var16, 64, 64, 3220);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(BLoe;)V", line = 533)
    public final void method261(byte arg0, class146 arg1) {
        field778++;
        while (true) {
            int var3 = arg1.method1005((byte) 122);
            if (var3 == 0) {
                if (arg0 != -75) {
                    this.field765 = (String[]) null;
                }
                return;
            }
            this.method249(var3, arg1, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V", line = 566)
    public static final void method262() {
        if (class37.field814 != null) {
            for (int var0 = 0; var0 < class37.field814.length; var0++) {
                for (int var1 = 0; var1 < class224.field3701; var1++) {
                    for (int var2 = 0; var2 < class280.field4578; var2++) {
                        class37.field814[var0][var1][var2] = null;
                    }
                }
            }
        }
        class341.field5399 = (class102[][]) null;
        if (class253.field4154 != null) {
            for (int var3 = 0; var3 < class253.field4154.length; var3++) {
                for (int var4 = 0; var4 < class224.field3701; var4++) {
                    for (int var5 = 0; var5 < class280.field4578; var5++) {
                        class253.field4154[var3][var4][var5] = null;
                    }
                }
            }
        }
        class23.field572 = (class102[][]) null;
        class177.field2927 = 0;
        if (class33.field736 != null) {
            for (int var6 = 0; var6 < class177.field2927; var6++) {
                class33.field736[var6] = null;
            }
        }
        if (class172.field2842 != null) {
            for (int var7 = 0; var7 < class201.field3383; var7++) {
                class172.field2842[var7] = null;
            }
            class201.field3383 = 0;
        }
        if (class160.field2706 != null) {
            for (int var8 = 0; var8 < class160.field2706.length; var8++) {
                class160.field2706[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)I", line = 671)
    public final int method263(int arg0, int arg1, int arg2) {
        field780++;
        if (arg1 != -8418) {
            method259(-27, 36, 87);
        }
        if (this.field769 == null || arg2 < 0 || this.field769.length < arg2) {
            return -1;
        } else if (this.field774[arg2] == null || arg0 < 0 || this.field774[arg2].length < arg0) {
            return -1;
        } else {
            return this.field774[arg2][arg0];
        }
    }
}
