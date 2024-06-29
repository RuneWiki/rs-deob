import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class107 extends class98 {

    @OriginalMember(owner = "client!fv", name = "U", descriptor = "[I")
    private int[] field1748;

    @OriginalMember(owner = "client!fv", name = "P", descriptor = "[I")
    private int[] field1743;

    @OriginalMember(owner = "client!fv", name = "X", descriptor = "Lng;")
    private class314 field1751;

    @OriginalMember(owner = "client!fv", name = "J", descriptor = "Lng;")
    private class314 field1738;

    @OriginalMember(owner = "client!fv", name = "I", descriptor = "Lng;")
    private class314 field1737;

    @OriginalMember(owner = "client!fv", name = "M", descriptor = "[Lng;")
    private class314[] field1740;

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "Lpca;")
    public static class665 field1736 = null;

    @OriginalMember(owner = "client!fv", name = "O", descriptor = "[S")
    private static short[] field1742 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "[S")
    private static short[] field1733 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!fv", name = "Q", descriptor = "[S")
    private static short[] field1744 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fv", name = "K", descriptor = "[[S")
    public static short[][] field1739 = new short[][] { field1733, field1742, field1744 };

    @OriginalMember(owner = "client!fv", name = "W", descriptor = "J")
    public static long field1750 = 0L;

    @OriginalMember(owner = "client!fv", name = "T", descriptor = "I")
    public static int field1747 = -1;

    @OriginalMember(owner = "client!fv", name = "ab", descriptor = "F")
    public static float field1754;

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!fv", name = "N", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!fv", name = "R", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!fv", name = "S", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!fv", name = "V", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!fv", name = "Y", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!fv", name = "Z", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!fv", name = "bb", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V", line = 16)
    public static final void method1008(int arg0, int arg1) {
        class10.method197((byte) -80);
        field1755++;
        int var2 = class566.field8134.method3114(arg1, arg0 - 12112).field6179;
        if (var2 == 0) {
            return;
        }
        int var3 = class539.field7869.field9116[arg1];
        if (var2 == 5) {
            class14.field198 = var3;
        }
        if (arg0 != 12112) {
            field1750 = 110L;
        }
        if (var2 == 6) {
            class325.field5057 = var3;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIIII)V", line = 42)
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1745++;
        if ((arg1 - arg2) >= class576.field8218 && (arg1 + arg2) <= class340.field5510 && class545.field7931 <= arg0 - arg2 && arg0 + arg2 <= class585.field8331) {
            class367.method2434(arg2, arg4, arg1, arg0, 126);
        } else {
            class290.method2049(arg1, arg0, arg2, 64, arg4);
        }
        int var5 = -100 % ((arg3 - 49) / 38);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILri;IILfa;Z)[F", line = 77)
    public final float[] method1010(int arg0, class97 arg1, int arg2, int arg3, class214 arg4, boolean arg5) {
        class126.field2069 = arg1;
        field1752++;
        class211.field3517 = arg4;
        for (int var7 = 0; var7 < this.field1740.length; var7++) {
            this.field1740[var7].method2142(arg0, -57, arg2);
        }
        class556.method3323(arg2, arg3, arg0);
        float[] var8 = new float[arg0 * arg2 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1738.field4936) {
                int[] var16 = this.field1738.method6(var10, 117);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field1738.method4(var10, (byte) 95);
                var13 = var12[1];
                var14 = var12[2];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field1737.field4936) {
                var17 = this.field1737.method6(var10, 110);
            } else {
                var17 = this.field1737.method4(var10, (byte) 127)[0];
            }
            int[] var18;
            if (this.field1751.field4936) {
                var18 = this.field1751.method6(var10, arg3 + 114);
            } else {
                var18 = this.field1751.method4(var10, (byte) 103)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1740.length; var11++) {
            this.field1740[var11].method2141(arg3 ^ 0x80);
        }
        return var8;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILfa;DBZILri;)[I", line = 189)
    public final int[] method1011(int arg0, class214 arg1, double arg2, byte arg3, boolean arg4, int arg5, class97 arg6) {
        class126.field2069 = arg6;
        class211.field3517 = arg1;
        field1749++;
        for (int var9 = 0; var9 < this.field1740.length; var9++) {
            this.field1740[var9].method2142(arg0, -90, arg5);
        }
        class529.method3201(arg2, -8076);
        class556.method3323(arg5, 0, arg0);
        int[] var10 = new int[arg0 * 4 * arg5];
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1738.field4936) {
                int[] var14 = this.field1738.method6(var12, 118);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1738.method4(var12, (byte) 111);
                var16 = var18[1];
                var17 = var18[2];
                var15 = var18[0];
            }
            if (arg4) {
                var11 = var12;
            }
            int[] var19;
            if (this.field1737.field4936) {
                var19 = this.field1737.method6(var12, 120);
            } else {
                var19 = this.field1737.method4(var12, (byte) 118)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class340.field5515[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class340.field5515[var21];
                int var26 = class340.field5515[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 8) + ((var27 << 24) + (var25 << 16)) + var26;
                if (arg4) {
                    var11 += arg0 - 1;
                }
            }
        }
        if (arg3 == -101) {
            for (int var13 = 0; var13 < this.field1740.length; var13++) {
                this.field1740[var13].method2141(128);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lri;ZLfa;)Z", line = 324)
    public final boolean method1012(class97 arg0, boolean arg1, class214 arg2) {
        field1734++;
        if (class550.field7993 < 0) {
            for (int var4 = 0; var4 < this.field1743.length; var4++) {
                if (!arg0.method942(0, this.field1743[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1743.length; var5++) {
                if (!arg0.method931(-1, class550.field7993, this.field1743[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1748.length; var6++) {
            if (!arg2.method1608(-20340, this.field1748[var6])) {
                return false;
            }
        }
        if (arg1) {
            field1747 = -125;
        }
        return true;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILr;Lpca;)V", line = 382)
    public static final void method1013(int arg0, class167 arg1, class665 arg2) {
        field1753++;
        boolean var3 = class91.field1083.method2860(-95, arg2.field9305 | arg0, arg2.field9354, arg2.field9351, arg1, arg2.field9416 ? class567.field8141.field4778 : null, arg2.field9341, arg2.field9392) == null;
        if (var3) {
            class572.field8177.method3463((byte) -87, new class622(arg2.field9354, arg2.field9341, arg2.field9392, arg2.field9305 | 0xFF000000, arg2.field9351, arg2.field9416));
            class362.method2415(-125, arg2);
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(III)Z", line = 398)
    public static final boolean method1014(int arg0, int arg1, int arg2) {
        field1741++;
        int var3 = 103 % ((arg0 + 65) / 47);
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lri;ZIDIILfa;Z)[I", line = 410)
    public final int[] method1015(class97 arg0, boolean arg1, int arg2, double arg3, int arg4, int arg5, class214 arg6, boolean arg7) {
        class126.field2069 = arg0;
        class211.field3517 = arg6;
        field1735++;
        for (int var10 = 0; var10 < this.field1740.length; var10++) {
            this.field1740[var10].method2142(arg2, -95, arg5);
        }
        class529.method3201(arg3, -8076);
        class556.method3323(arg5, 0, arg2);
        if (arg4 < 75) {
            method1008(87, -115);
        }
        int[] var11 = new int[arg2 * arg5];
        int var12;
        byte var13;
        int var14;
        if (arg7) {
            var12 = arg2 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var14 = arg2;
            var13 = 1;
            var12 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1738.field4936) {
                int[] var22 = this.field1738.method6(var16, 111);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field1738.method4(var16, (byte) 83);
                var19 = var18[0];
                var20 = var18[1];
                var21 = var18[2];
            }
            if (arg1) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class340.field5515[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class340.field5515[var24];
                int var29 = class340.field5515[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg1) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1740.length; var17++) {
            this.field1740[var17].method2141(128);
        }
        return var11;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "()V", line = 548)
    public class107() {
        this.field1748 = new int[0];
        this.field1743 = new int[0];
        this.field1751 = new class186(0);
        this.field1751.field4925 = 1;
        this.field1738 = new class186();
        this.field1738.field4925 = 1;
        this.field1737 = new class186();
        this.field1737.field4925 = 1;
        this.field1740 = new class314[] { this.field1738, this.field1737, this.field1751 };
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)Z", line = 564)
    public static final boolean method1016(int arg0, byte arg1) {
        field1746++;
        if (arg1 != 118) {
            return false;
        } else if (class661.field9224[arg0]) {
            return true;
        } else if (class118.field1889.method944((byte) 15, arg0)) {
            int var2 = class118.field1889.method949(arg0, 0);
            if (var2 == 0) {
                class661.field9224[arg0] = true;
                return true;
            }
            if (class564.field8105[arg0] == null) {
                class564.field8105[arg0] = new class665[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class564.field8105[arg0][var3] == null) {
                    byte[] var4 = class118.field1889.method926(arg0, -128, var3);
                    if (var4 != null) {
                        class665 var5 = class564.field8105[arg0][var3] = new class665();
                        var5.field9400 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method3814((byte) 107, new class6(var4));
                    }
                }
            }
            class661.field9224[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lie;)V", line = 622)
    public class107(class6 arg0) {
        int var2 = arg0.method70(-9059);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field1740 = new class314[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class314 var16 = class105.method997(arg0, (byte) 89);
            if (var16.method2145(-78) >= 0) {
                var3++;
            }
            if (var16.method2144(-80) >= 0) {
                var4++;
            }
            int var17 = var16.field4927.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method70(-9059);
            }
            this.field1740[var6] = var16;
        }
        this.field1743 = new int[var3];
        this.field1748 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class314 var11 = this.field1740[var9];
            int var12 = var11.field4927.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4927[var13] = this.field1740[var5[var9][var13]];
            }
            int var14 = var11.method2145(108);
            int var15 = var11.method2144(-102);
            if (var14 > 0) {
                this.field1743[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1748[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1738 = this.field1740[arg0.method70(-9059)];
        this.field1737 = this.field1740[arg0.method70(-9059)];
        this.field1751 = this.field1740[arg0.method70(-9059)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 719)
    public static void method1017(int arg0) {
        if (arg0 < 89) {
            field1739 = null;
        }
        field1739 = null;
        field1744 = null;
        field1742 = null;
        field1736 = null;
        field1733 = null;
    }
}
