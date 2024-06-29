import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class280 implements class472 {

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "Leaa;")
    private class43 field4150 = new class43(256);

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "Ldda;")
    private class597 field4161;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "Ldda;")
    private class597 field4149;

    @OriginalMember(owner = "client!gaa", name = "q", descriptor = "I")
    private int field4163;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "[Lns;")
    private class83[] field4155;

    @OriginalMember(owner = "client!gaa", name = "p", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4162 = new Rectangle[100];

    @OriginalMember(owner = "client!gaa", name = "r", descriptor = "[F")
    public static float[] field4164;

    @OriginalMember(owner = "client!gaa", name = "s", descriptor = "[F")
    public static float[] field4165;

    @OriginalMember(owner = "client!gaa", name = "u", descriptor = "F")
    public static float field4167;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "Lbh;")
    public static class504 field4160;

    @OriginalMember(owner = "client!gaa", name = "t", descriptor = "Ldda;")
    public static class597 field4166;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BI)Z")
    public final boolean method1758(byte arg0, int arg1) {
        if (arg0 <= 0) {
            this.method1758((byte) -126, -125);
        }
        field4152++;
        class347 var3 = this.method1765(-2, arg1);
        return var3 != null && var3.method2131(-9097, this, this.field4161);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIFBIZ)[I")
    public final int[] method1759(int arg0, int arg1, float arg2, byte arg3, int arg4, boolean arg5) {
        field4147++;
        if (arg3 <= 77) {
            this.method1758((byte) -26, -69);
        }
        return this.method1765(-2, arg4).method2133(this, this.field4161, (double) arg2, arg0, (byte) 122, arg5, this.field4155[arg4].field969, arg1);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IBIII[BI[BI)V")
    public static final void method1760(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        field4148++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        if (arg1 != -32) {
            method1763(58, -58, 126, -19, -107, 56);
        }
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg5[var10001] += arg7[arg0++];
                int var14 = arg2++;
                arg5[var14] += arg7[arg0++];
                int var15 = arg2++;
                arg5[var15] += arg7[arg0++];
                int var16 = arg2++;
                arg5[var16] += arg7[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg5[var10001] += arg7[arg0++];
            }
            arg2 += arg3;
            arg0 += arg6;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
    public static void method1761(int arg0) {
        field4160 = null;
        int var1 = 28 % ((-arg0 - 35) / 44);
        field4165 = null;
        field4162 = null;
        field4166 = null;
        field4164 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IB)Lns;")
    public final class83 method1762(int arg0, byte arg1) {
        field4153++;
        return arg1 == 45 ? this.field4155[arg0] : null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIIII)V")
    public static final void method1763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -63 % ((arg4 - 37) / 43);
        field4156++;
        if (class94.field1158.field276 != 0 && arg2 != 0 && class68.field779 < 50 && arg3 != -1) {
            class10.field94[class68.field779++] = new class585((byte) 1, arg3, arg2, arg0, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(FIIIZI)[I")
    public final int[] method1764(float arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field4157++;
        if (arg5 <= 30) {
            method1761(110);
        }
        return this.method1765(-2, arg2).method2128(this, (double) arg0, arg1, arg3, 0, this.field4155[arg2].field969, this.field4161);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)Lqd;")
    private final class347 method1765(int arg0, int arg1) {
        field4159++;
        class551 var3 = this.field4150.method227((long) arg1, (byte) 78);
        if (var3 != null) {
            return (class347) var3;
        }
        byte[] var4 = this.field4149.method3469(arg1, arg0 + 114);
        if (var4 == null) {
            return null;
        }
        class347 var5 = new class347(new class428(var4));
        if (arg0 == -2) {
            this.field4150.method230((long) arg1, var5, arg0 ^ 0xFFFFFFCC);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIFIZ)[F")
    public final float[] method1766(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5) {
        if (arg4 == -15678) {
            field4151++;
            return this.method1765(arg4 + 15676, arg2).method2132(this.field4161, arg0, this.field4155[arg2].field969, this, arg1, (byte) 71);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)I")
    public final int method1767(byte arg0) {
        field4158++;
        int var2 = -63 / ((-arg0 - 35) / 46);
        return this.field4163;
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(II)I")
    public static final int method1768(int arg0, int arg1) {
        field4154++;
        int var2 = 8 / ((-arg1 - 19) / 59);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Ldda;Ldda;Ldda;)V")
    public class280(class597 arg0, class597 arg1, class597 arg2) {
        this.field4161 = arg2;
        this.field4149 = arg1;
        class428 var4 = new class428(arg0.method3486((byte) -83, 0, 0));
        this.field4163 = var4.method2620(73);
        this.field4155 = new class83[this.field4163];
        for (int var5 = 0; var5 < this.field4163; var5++) {
            if (var4.method2561((byte) -19) == 1) {
                this.field4155[var5] = new class83();
            }
        }
        for (int var6 = 0; var6 < this.field4163; var6++) {
            if (this.field4155[var6] != null) {
                this.field4155[var6].field975 = var4.method2561((byte) -29) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field4163; var7++) {
            if (this.field4155[var7] != null) {
                this.field4155[var7].field972 = var4.method2561((byte) -118) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field4163; var8++) {
            if (this.field4155[var8] != null) {
                this.field4155[var8].field964 = var4.method2561((byte) 124) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field4163; var9++) {
            if (this.field4155[var9] != null) {
                this.field4155[var9].field974 = var4.method2561((byte) -19) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field4163; var10++) {
            if (this.field4155[var10] != null) {
                this.field4155[var10].field960 = var4.method2570((byte) 57);
            }
        }
        for (int var11 = 0; var11 < this.field4163; var11++) {
            if (this.field4155[var11] != null) {
                this.field4155[var11].field962 = var4.method2570((byte) 57);
            }
        }
        for (int var12 = 0; var12 < this.field4163; var12++) {
            if (this.field4155[var12] != null) {
                this.field4155[var12].field968 = var4.method2570((byte) 57);
            }
        }
        for (int var13 = 0; var13 < this.field4163; var13++) {
            if (this.field4155[var13] != null) {
                this.field4155[var13].field973 = var4.method2570((byte) 57);
            }
        }
        for (int var14 = 0; var14 < this.field4163; var14++) {
            if (this.field4155[var14] != null) {
                this.field4155[var14].field963 = (short) var4.method2620(120);
            }
        }
        for (int var15 = 0; var15 < this.field4163; var15++) {
            if (this.field4155[var15] != null) {
                this.field4155[var15].field980 = var4.method2570((byte) 57);
            }
        }
        for (int var16 = 0; var16 < this.field4163; var16++) {
            if (this.field4155[var16] != null) {
                this.field4155[var16].field965 = var4.method2570((byte) 57);
            }
        }
        for (int var17 = 0; var17 < this.field4163; var17++) {
            if (this.field4155[var17] != null) {
                this.field4155[var17].field966 = var4.method2561((byte) -108) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field4163; var18++) {
            if (this.field4155[var18] != null) {
                this.field4155[var18].field969 = var4.method2561((byte) -39) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field4163; var19++) {
            if (this.field4155[var19] != null) {
                this.field4155[var19].field959 = var4.method2570((byte) 57);
            }
        }
        for (int var20 = 0; var20 < this.field4163; var20++) {
            if (this.field4155[var20] != null) {
                this.field4155[var20].field967 = var4.method2561((byte) 108) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field4163; var21++) {
            if (this.field4155[var21] != null) {
                this.field4155[var21].field976 = var4.method2561((byte) -123) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field4163; var22++) {
            if (this.field4155[var22] != null) {
                this.field4155[var22].field979 = var4.method2561((byte) 114) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field4163; var23++) {
            if (this.field4155[var23] != null) {
                this.field4155[var23].field970 = var4.method2561((byte) -21);
            }
        }
        for (int var24 = 0; var24 < this.field4163; var24++) {
            if (this.field4155[var24] != null) {
                this.field4155[var24].field978 = var4.method2589(-11179);
            }
        }
        for (int var25 = 0; var25 < this.field4163; var25++) {
            if (this.field4155[var25] != null) {
                this.field4155[var25].field961 = var4.method2561((byte) -22) == 1;
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4162[var0] = new Rectangle();
        }
        field4164 = new float[16384];
        field4165 = new float[16384];
        double var1 = 3.834951969714103E-4D;
        for (int var3 = 0; var3 < 16384; var3++) {
            field4165[var3] = (float) Math.sin((double) var3 * var1);
            field4164[var3] = (float) Math.cos((double) var3 * var1);
        }
    }
}
