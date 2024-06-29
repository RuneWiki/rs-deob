import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class496 implements class214 {

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "Ltr;")
    private class268 field7235 = new class268(256);

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "Lri;")
    private class97 field7232;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "Lri;")
    private class97 field7238;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    private int field7239;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "[Lkd;")
    private class258[] field7234;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field7236 = 0;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field7241;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(II)Lfv;")
    private final class107 method3016(int arg0, int arg1) {
        field7241++;
        int var3 = 53 / ((arg1 + 65) / 59);
        class98 var4 = this.field7235.method1899(-53, (long) arg0);
        if (var4 != null) {
            return (class107) var4;
        }
        byte[] var5 = this.field7238.method952(111, arg0);
        if (var5 == null) {
            return null;
        } else {
            class107 var6 = new class107(new class6(var5));
            this.field7235.method1902(-19867, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(II)Lkd;")
    public final class258 method1610(int arg0, int arg1) {
        if (arg0 == 18904) {
            field7243++;
            return this.field7234[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IB)V")
    public static final void method3017(int arg0, byte arg1) {
        field7245++;
        if (arg1 == 25) {
            class413 var2 = class674.method3852(16, arg0, arg1 ^ 0x67);
            var2.method2634(1065768928);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method3018(String arg0, byte arg1) {
        if (arg1 != -63) {
            method3017(-2, (byte) -69);
        }
        field7242++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= (var3 - 2) || class376.method2469(arg0.charAt(var3 - 2), (byte) 29) == -1) {
            var4 -= 2;
        } else if (var2 <= (var3 - 1) || class376.method2469(arg0.charAt(var3 - 1), (byte) 29) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class636.method3701(var5, -1, 0, arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(FZIBII)[I")
    public final int[] method1609(float arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        field7240++;
        if (arg3 > -56) {
            this.field7235 = null;
        }
        return this.method3016(arg2, 20).method1011(arg5, this, (double) arg0, (byte) -101, this.field7234[arg2].field4132, arg4, this.field7232);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIZIF)[I")
    public final int[] method1607(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        if (arg2 == -20490) {
            field7233++;
            return this.method3016(arg1, -128).method1015(this.field7232, this.field7234[arg1].field4132, arg0, (double) arg5, 77, arg4, this, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Z")
    public final boolean method1608(int arg0, int arg1) {
        field7246++;
        if (arg0 == -20340) {
            class107 var3 = this.method3016(arg1, 110);
            return var3 != null && var3.method1012(this.field7232, false, this);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIFIZZ)[F")
    public final float[] method1611(int arg0, int arg1, float arg2, int arg3, boolean arg4, boolean arg5) {
        if (arg5) {
            return null;
        } else {
            field7244++;
            return this.method3016(arg3, 25).method1010(arg0, this.field7232, arg1, 0, this, this.field7234[arg3].field4132);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I")
    public final int method1612(int arg0) {
        field7237++;
        int var2 = -110 / ((arg0 + 13) / 60);
        return this.field7239;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BII)Z")
    public static final boolean method3019(byte arg0, int arg1, int arg2) {
        if (arg0 != 21) {
            field7236 = 83;
        }
        field7231++;
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lri;Lri;Lri;)V")
    public class496(class97 arg0, class97 arg1, class97 arg2) {
        this.field7232 = arg2;
        this.field7238 = arg1;
        class6 var4 = new class6(arg0.method926(0, -124, 0));
        this.field7239 = var4.method67(12021);
        this.field7234 = new class258[this.field7239];
        for (int var5 = 0; var5 < this.field7239; var5++) {
            if (var4.method70(-9059) == 1) {
                this.field7234[var5] = new class258();
            }
        }
        for (int var6 = 0; var6 < this.field7239; var6++) {
            if (this.field7234[var6] != null) {
                this.field7234[var6].field4117 = var4.method70(-9059) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field7239; var7++) {
            if (this.field7234[var7] != null) {
                this.field7234[var7].field4118 = var4.method70(-9059) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field7239; var8++) {
            if (this.field7234[var8] != null) {
                this.field7234[var8].field4137 = var4.method70(-9059) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field7239; var9++) {
            if (this.field7234[var9] != null) {
                this.field7234[var9].field4136 = var4.method70(-9059) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field7239; var10++) {
            if (this.field7234[var10] != null) {
                this.field7234[var10].field4126 = var4.method81(true);
            }
        }
        for (int var11 = 0; var11 < this.field7239; var11++) {
            if (this.field7234[var11] != null) {
                this.field7234[var11].field4131 = var4.method81(true);
            }
        }
        for (int var12 = 0; var12 < this.field7239; var12++) {
            if (this.field7234[var12] != null) {
                this.field7234[var12].field4134 = var4.method81(true);
            }
        }
        for (int var13 = 0; var13 < this.field7239; var13++) {
            if (this.field7234[var13] != null) {
                this.field7234[var13].field4130 = var4.method81(true);
            }
        }
        for (int var14 = 0; var14 < this.field7239; var14++) {
            if (this.field7234[var14] != null) {
                this.field7234[var14].field4120 = (short) var4.method67(12021);
            }
        }
        for (int var15 = 0; var15 < this.field7239; var15++) {
            if (this.field7234[var15] != null) {
                this.field7234[var15].field4123 = var4.method81(true);
            }
        }
        for (int var16 = 0; var16 < this.field7239; var16++) {
            if (this.field7234[var16] != null) {
                this.field7234[var16].field4116 = var4.method81(true);
            }
        }
        for (int var17 = 0; var17 < this.field7239; var17++) {
            if (this.field7234[var17] != null) {
                this.field7234[var17].field4121 = var4.method70(-9059) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field7239; var18++) {
            if (this.field7234[var18] != null) {
                this.field7234[var18].field4132 = var4.method70(-9059) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field7239; var19++) {
            if (this.field7234[var19] != null) {
                this.field7234[var19].field4127 = var4.method81(true);
            }
        }
        for (int var20 = 0; var20 < this.field7239; var20++) {
            if (this.field7234[var20] != null) {
                this.field7234[var20].field4124 = var4.method70(-9059) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field7239; var21++) {
            if (this.field7234[var21] != null) {
                this.field7234[var21].field4125 = var4.method70(-9059) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field7239; var22++) {
            if (this.field7234[var22] != null) {
                this.field7234[var22].field4135 = var4.method70(-9059) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field7239; var23++) {
            if (this.field7234[var23] != null) {
                this.field7234[var23].field4140 = var4.method70(-9059);
            }
        }
        for (int var24 = 0; var24 < this.field7239; var24++) {
            if (this.field7234[var24] != null) {
                this.field7234[var24].field4138 = var4.method72(-57);
            }
        }
        for (int var25 = 0; var25 < this.field7239; var25++) {
            if (this.field7234[var25] != null) {
                this.field7234[var25].field4119 = var4.method70(-9059) == 1;
            }
        }
    }
}
