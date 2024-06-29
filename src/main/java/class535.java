import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class535 implements class206 {

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "Llo;")
    private class757 field7054;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "[Lgb;")
    private class216[] field7052;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field7044 = -2;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "Lha;")
    private class59 field7048;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "Z")
    private boolean field7045;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "Z")
    public static boolean field7047;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZB)V")
    public final void method1377(boolean arg0, byte arg1) {
        boolean var3 = true;
        field7041++;
        int var4 = 2 / ((-arg1 - 24) / 48);
        class216[] var5 = this.field7052;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class216 var7 = var5[var6];
            if (var7 != null) {
                var7.method328(var3 || this.field7045, (byte) -72);
            }
        }
        this.field7045 = false;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V")
    public final void method1373(byte arg0) {
        field7049++;
        if (class341.field4807 != this.field7048) {
            this.field7048 = class341.field4807;
            this.field7045 = true;
        }
        this.field7048.method392(0);
        if (arg0 != -2) {
            this.method1373((byte) -17);
        }
        class216[] var2 = this.field7052;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class216 var4 = var2[var3];
            if (var4 != null) {
                var4.method324((byte) 39);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)I")
    public final int method1374(int arg0) {
        field7042++;
        int var2 = 0;
        if (arg0 != 26583) {
            this.method1376(-9);
        }
        class216[] var3 = this.field7052;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class216 var5 = var3[var4];
            if (var5 == null || var5.method320(arg0 ^ 0x7225)) {
                var2++;
            }
        }
        return var2 * 100 / this.field7052.length;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIFFFI)[F")
    public static final float[] method2970(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, int arg7) {
        field7046++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        var8[3] = 0.0F;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        var8[8] = var10;
        var8[5] = 0.0F;
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[6] = -var11;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg2 / 32767.0F;
        if (arg1 < 122) {
            return null;
        }
        float var16 = 0.0F;
        float var17 = 1.0F - var15;
        float var18 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg7 * arg7));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg7) / var19;
                var16 = (float) arg0 / var19;
            }
            var13[3] = -var16 * var18;
            var13[4] = var15;
            var13[1] = var16 * var18;
            var13[6] = var14 * var16 * var17;
            var13[2] = var14 * var16 * var17;
            var13[8] = var16 * var16 * var17 + var15;
            var13[0] = var14 * var14 * var17 + var15;
            var13[5] = var14 * var18;
            var13[7] = -var14 * var18;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[4] *= arg5;
        var9[8] *= arg6;
        var9[3] *= arg5;
        var9[2] *= arg4;
        var9[1] *= arg4;
        var9[0] *= arg4;
        var9[6] *= arg6;
        var9[7] *= arg6;
        var9[5] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)I")
    public final int method1375(int arg0) {
        field7051++;
        if (arg0 != -11222) {
            this.field7048 = null;
        }
        return this.field7054.field10531;
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)V")
    public final void method1376(int arg0) {
        if (arg0 != 31639) {
            field7044 = -42;
        }
        field7050++;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(JI)Z")
    public final boolean method1378(long arg0, int arg1) {
        if (arg1 != -3650) {
            this.field7045 = false;
        }
        field7043++;
        return class375.method2193(116) >= ((long) this.field7054.field10529 + arg0);
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Llo;Lar;)V")
    public class535(class757 arg0, class683 arg1) {
        this.field7054 = arg0;
        this.field7052 = new class216[this.field7054.field10530.length];
        for (int var3 = 0; var3 < this.field7052.length; var3++) {
            this.field7052[var3] = arg1.method3854(this.field7054.field10530[var3], (byte) -57);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lee;I)Lmf;")
    public static final class423 method2971(class677 arg0, int arg1) {
        field7053++;
        int var2 = arg0.method3821((byte) -107);
        class311 var3 = class439.method2534(-1)[arg0.method3821((byte) 100)];
        int var4 = 119 / ((arg1 + 36) / 56);
        class512 var5 = class12.method106(-12865)[arg0.method3821((byte) 73)];
        int var6 = arg0.method3771((byte) -10);
        int var7 = arg0.method3771((byte) -10);
        int var8 = arg0.method3807(-1);
        int var9 = arg0.method3807(-1);
        int var10 = arg0.method3799(false);
        int var11 = arg0.method3799(false);
        int var12 = arg0.method3799(false);
        boolean var13 = arg0.method3821((byte) -98) == 1;
        return new class423(var2, var3, var5, var6, var7, var8, var9, var10, var11, var12, var13);
    }
}
