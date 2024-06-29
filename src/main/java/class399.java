import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class399 implements class199 {

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "Lhi;")
    private class318 field6035 = new class318(256);

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "Lmn;")
    private class162 field6028;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "Lmn;")
    private class162 field6029;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    private int field6020;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "[Lvg;")
    private class476[] field6027;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "[I")
    public static int[] field6021 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field6024 = 0;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field6026;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "Lsc;")
    public static class29 field6037;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZIBFII)[F")
    public final float[] method1365(boolean arg0, int arg1, byte arg2, float arg3, int arg4, int arg5) {
        if (arg2 != 76) {
            this.field6029 = null;
        }
        field6032++;
        return this.method2572(-2, arg4).method1843(this.field6029, this.field6027[arg4].field7278, 0, this, arg5, arg1);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Lob;")
    private final class272 method2572(int arg0, int arg1) {
        field6031++;
        class334 var3 = this.field6035.method2130(false, (long) arg1);
        if (var3 != null) {
            return (class272) var3;
        }
        byte[] var4 = this.field6028.method1010(arg1, (byte) 112);
        if (var4 == null) {
            return null;
        }
        class272 var5 = new class272(new class208(var4));
        if (arg0 != -2) {
            this.method1368(-1.0686071F, 30, true, false, 64, -126);
        }
        this.field6035.method2132(var5, (long) arg1, 21826);
        return var5;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method2573(int arg0) {
        field6021 = null;
        field6037 = null;
        if (arg0 != 0) {
            method2575(-86, -125, -114);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(FIZZII)[I")
    public final int[] method1368(float arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            return null;
        } else {
            field6023++;
            return this.method2572(-2, arg4).method1837(arg5, arg1, (byte) -95, this, this.field6027[arg4].field7278, this.field6029, (double) arg0);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BIIIIFII[FI)V")
    public static final void method2574(byte arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, float[] arg8, int arg9) {
        int var10 = arg4 - arg6;
        int var11 = arg9 - arg1;
        field6026++;
        int var12 = arg7 - arg2;
        float var13 = arg8[2] * (float) var10 + arg8[1] * (float) var11 + arg8[0] * (float) var12;
        float var14 = arg8[5] * (float) var10 + arg8[4] * (float) var11 + arg8[3] * (float) var12;
        float var15 = arg8[8] * (float) var10 + arg8[7] * (float) var11 + arg8[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        if (arg0 != 4) {
            method2573(-5);
        }
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg5 + 0.5F;
        if (arg3 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg3 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg3 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class161.field2250 = var18;
        class220.field3718 = var17;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)Lvg;")
    public final class476 method1366(int arg0, byte arg1) {
        field6034++;
        int var3 = 28 / ((arg1 + 73) / 45);
        return this.field6027[arg0];
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)Z")
    public final boolean method1364(byte arg0, int arg1) {
        field6025++;
        if (arg0 != 53) {
            this.method1367(true, -0.11227114F, -122, 108, -56, 8);
        }
        class272 var3 = this.method2572(arg0 - 55, arg1);
        return var3 != null && var3.method1841(90, this, this.field6029);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z")
    public static final boolean method2575(int arg0, int arg1, int arg2) {
        field6022++;
        if (arg2 < 15) {
            method2573(27);
        }
        return class271.method1834(arg0, arg1, true) || class449.method2830(-1, arg0, arg1);
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lmn;Lmn;Lmn;)V")
    public class399(class162 arg0, class162 arg1, class162 arg2) {
        this.field6028 = arg1;
        this.field6029 = arg2;
        class208 var4 = new class208(arg0.method1004(0, false, 0));
        this.field6020 = var4.method1455(-3387);
        this.field6027 = new class476[this.field6020];
        for (int var5 = 0; var5 < this.field6020; var5++) {
            if (var4.method1445(-100) == 1) {
                this.field6027[var5] = new class476();
            }
        }
        for (int var6 = 0; var6 < this.field6020; var6++) {
            if (this.field6027[var6] != null) {
                this.field6027[var6].field7269 = var4.method1445(78) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field6020; var7++) {
            if (this.field6027[var7] != null) {
                this.field6027[var7].field7289 = var4.method1445(70) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field6020; var8++) {
            if (this.field6027[var8] != null) {
                this.field6027[var8].field7295 = var4.method1445(24) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field6020; var9++) {
            if (this.field6027[var9] != null) {
                this.field6027[var9].field7280 = var4.method1445(110) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field6020; var10++) {
            if (this.field6027[var10] != null) {
                this.field6027[var10].field7273 = var4.method1427(false);
            }
        }
        for (int var11 = 0; var11 < this.field6020; var11++) {
            if (this.field6027[var11] != null) {
                this.field6027[var11].field7284 = var4.method1427(false);
            }
        }
        for (int var12 = 0; var12 < this.field6020; var12++) {
            if (this.field6027[var12] != null) {
                this.field6027[var12].field7282 = var4.method1427(false);
            }
        }
        for (int var13 = 0; var13 < this.field6020; var13++) {
            if (this.field6027[var13] != null) {
                this.field6027[var13].field7274 = var4.method1427(false);
            }
        }
        for (int var14 = 0; var14 < this.field6020; var14++) {
            if (this.field6027[var14] != null) {
                this.field6027[var14].field7281 = (short) var4.method1455(-3387);
            }
        }
        for (int var15 = 0; var15 < this.field6020; var15++) {
            if (this.field6027[var15] != null) {
                this.field6027[var15].field7272 = var4.method1427(false);
            }
        }
        for (int var16 = 0; var16 < this.field6020; var16++) {
            if (this.field6027[var16] != null) {
                this.field6027[var16].field7279 = var4.method1427(false);
            }
        }
        for (int var17 = 0; var17 < this.field6020; var17++) {
            if (this.field6027[var17] != null) {
                this.field6027[var17].field7286 = var4.method1445(-103) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field6020; var18++) {
            if (this.field6027[var18] != null) {
                this.field6027[var18].field7278 = var4.method1445(46) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field6020; var19++) {
            if (this.field6027[var19] != null) {
                this.field6027[var19].field7270 = var4.method1427(false);
            }
        }
        for (int var20 = 0; var20 < this.field6020; var20++) {
            if (this.field6027[var20] != null) {
                this.field6027[var20].field7268 = var4.method1445(-103) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field6020; var21++) {
            if (this.field6027[var21] != null) {
                this.field6027[var21].field7283 = var4.method1445(73) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field6020; var22++) {
            if (this.field6027[var22] != null) {
                this.field6027[var22].field7276 = var4.method1445(-84) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field6020; var23++) {
            if (this.field6027[var23] != null) {
                this.field6027[var23].field7275 = var4.method1445(-92);
            }
        }
        for (int var24 = 0; var24 < this.field6020; var24++) {
            if (this.field6027[var24] != null) {
                this.field6027[var24].field7288 = var4.method1436((byte) 113);
            }
        }
        for (int var25 = 0; var25 < this.field6020; var25++) {
            if (this.field6027[var25] != null) {
                this.field6027[var25].field7277 = var4.method1445(20) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZFIIII)[I")
    public final int[] method1367(boolean arg0, float arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -25218) {
            this.field6028 = null;
        }
        field6030++;
        return this.method2572(-2, arg2).method1838(this.field6027[arg2].field7278, this, 0, arg5, arg3, arg0, this.field6029, (double) arg1);
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(IB)Z")
    public static final boolean method2576(int arg0, byte arg1) {
        field6036++;
        int var2 = 43 / ((arg1 + 18) / 60);
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(CI)Z")
    public static final boolean method2577(char arg0, int arg1) {
        field6033++;
        if (arg1 < 117) {
            method2576(44, (byte) 116);
        }
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }
}
