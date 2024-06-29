import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class587 implements class149 {

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "Lfs;")
    private class552 field8266 = new class552(256);

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "Leq;")
    private class209 field8263;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "Leq;")
    private class209 field8270;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    private int field8261;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "[Llba;")
    private class546[] field8259;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "[I")
    public static int[] field8265 = new int[5];

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "F")
    public static float field8267;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field8258;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public static int field8260;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    public static int field8268;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
    public static int field8271;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)I")
    public final int method1150(boolean arg0) {
        field8260++;
        if (!arg0) {
            this.method1155(-125, false, 53, (byte) -8, 1.1165266F, -65);
        }
        return this.field8261;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
    public static void method3381(byte arg0) {
        if (arg0 != -33) {
            method3381((byte) 120);
        }
        field8265 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)Lrba;")
    private final class430 method3382(int arg0, byte arg1) {
        field8258++;
        class224 var3 = this.field8266.method3236((long) arg0, (byte) 107);
        if (var3 != null) {
            return (class430) var3;
        }
        int var4 = -41 / ((arg1 + 42) / 56);
        byte[] var5 = this.field8263.method1478((byte) -72, arg0);
        if (var5 == null) {
            return null;
        } else {
            class430 var6 = new class430(new class35(var5));
            this.field8266.method3237((long) arg0, var6, 16205);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)Llba;")
    public final class546 method1154(int arg0, int arg1) {
        field8264++;
        if (arg0 > -101) {
            this.field8266 = null;
        }
        return this.field8259[arg1];
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Z")
    public final boolean method1152(int arg0, int arg1) {
        field8268++;
        class430 var3 = this.method3382(arg0, (byte) 37);
        int var4 = 82 % ((arg1 + 35) / 58);
        return var3 != null && var3.method2612(this, 127, this.field8270);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(FIZIII)[I")
    public final int[] method1151(float arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field8256++;
        return arg3 == -18596 ? this.method3382(arg4, (byte) -108).method2609(arg3 ^ 0xFFFFB75C, this.field8270, this.field8259[arg4].field7715, (double) arg0, this, arg1, arg5, arg2) : null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZIBFI)[I")
    public final int[] method1155(int arg0, boolean arg1, int arg2, byte arg3, float arg4, int arg5) {
        if (arg3 != 79) {
            field8267 = -0.4809145F;
        }
        field8269++;
        return this.method3382(arg2, (byte) 103).method2610(arg0, (byte) 43, this, (double) arg4, this.field8259[arg2].field7715, this.field8270, arg5);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZIZFII)[F")
    public final float[] method1153(boolean arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        if (arg0) {
            return null;
        } else {
            field8262++;
            return this.method3382(arg1, (byte) 119).method2611(this.field8259[arg1].field7715, 1852332514, this.field8270, arg5, this, arg4);
        }
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Leq;Leq;Leq;)V")
    public class587(class209 arg0, class209 arg1, class209 arg2) {
        this.field8263 = arg1;
        this.field8270 = arg2;
        class35 var4 = new class35(arg0.method1453(0, -127, 0));
        this.field8261 = var4.method253(-13900);
        this.field8259 = new class546[this.field8261];
        for (int var5 = 0; var5 < this.field8261; var5++) {
            if (var4.method273(255) == 1) {
                this.field8259[var5] = new class546();
            }
        }
        for (int var6 = 0; var6 < this.field8261; var6++) {
            if (this.field8259[var6] != null) {
                this.field8259[var6].field7705 = var4.method273(255) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field8261; var7++) {
            if (this.field8259[var7] != null) {
                this.field8259[var7].field7706 = var4.method273(255) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field8261; var8++) {
            if (this.field8259[var8] != null) {
                this.field8259[var8].field7710 = var4.method273(255) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field8261; var9++) {
            if (this.field8259[var9] != null) {
                this.field8259[var9].field7696 = var4.method277((byte) -117);
            }
        }
        for (int var10 = 0; var10 < this.field8261; var10++) {
            if (this.field8259[var10] != null) {
                this.field8259[var10].field7707 = var4.method277((byte) -125);
            }
        }
        for (int var11 = 0; var11 < this.field8261; var11++) {
            if (this.field8259[var11] != null) {
                this.field8259[var11].field7711 = var4.method277((byte) -117);
            }
        }
        for (int var12 = 0; var12 < this.field8261; var12++) {
            if (this.field8259[var12] != null) {
                this.field8259[var12].field7694 = var4.method277((byte) -118);
            }
        }
        for (int var13 = 0; var13 < this.field8261; var13++) {
            if (this.field8259[var13] != null) {
                this.field8259[var13].field7703 = (short) var4.method253(-13900);
            }
        }
        for (int var14 = 0; var14 < this.field8261; var14++) {
            if (this.field8259[var14] != null) {
                this.field8259[var14].field7714 = var4.method277((byte) 124);
            }
        }
        for (int var15 = 0; var15 < this.field8261; var15++) {
            if (this.field8259[var15] != null) {
                this.field8259[var15].field7712 = var4.method277((byte) 119);
            }
        }
        for (int var16 = 0; var16 < this.field8261; var16++) {
            if (this.field8259[var16] != null) {
                this.field8259[var16].field7713 = var4.method273(255) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field8261; var17++) {
            if (this.field8259[var17] != null) {
                this.field8259[var17].field7715 = var4.method273(255) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field8261; var18++) {
            if (this.field8259[var18] != null) {
                this.field8259[var18].field7709 = var4.method277((byte) -121);
            }
        }
        for (int var19 = 0; var19 < this.field8261; var19++) {
            if (this.field8259[var19] != null) {
                this.field8259[var19].field7704 = var4.method273(255) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field8261; var20++) {
            if (this.field8259[var20] != null) {
                this.field8259[var20].field7702 = var4.method273(255) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field8261; var21++) {
            if (this.field8259[var21] != null) {
                this.field8259[var21].field7699 = var4.method273(255) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field8261; var22++) {
            if (this.field8259[var22] != null) {
                this.field8259[var22].field7695 = var4.method273(255);
            }
        }
        for (int var23 = 0; var23 < this.field8261; var23++) {
            if (this.field8259[var23] != null) {
                this.field8259[var23].field7697 = var4.method234((byte) -117);
            }
        }
        for (int var24 = 0; var24 < this.field8261; var24++) {
            if (this.field8259[var24] != null) {
                this.field8259[var24].field7708 = var4.method273(255);
            }
        }
    }
}
