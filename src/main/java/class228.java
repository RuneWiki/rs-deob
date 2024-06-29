import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class228 extends class28 {

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "B")
    private byte field3646 = 0;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public int field3644 = 0;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    private int field3669 = 0;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "B")
    private byte field3681 = 0;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "Z")
    public boolean field3660 = false;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    private int field3647 = 0;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[I")
    private int[] field3645;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "[I")
    public int[] field3672;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "[I")
    public int[] field3659;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "[I")
    public int[] field3667;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "[I")
    private int[] field3651;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "[S")
    private short[] field3670;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "[S")
    private short[] field3662;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "[S")
    private short[] field3674;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "[S")
    private short[] field3654;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "[F")
    private float[] field3671;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "[F")
    private float[] field3673;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "[S")
    private short[] field3666;

    @OriginalMember(owner = "client!uh", name = "ab", descriptor = "[B")
    private byte[] field3684;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "[S")
    private short[] field3658;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "[S")
    private short[] field3680;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "[S")
    private short[] field3657;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "[S")
    private short[] field3664;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "[B")
    private byte[] field3643;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "Lqd;")
    public class16 field3663;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "Lc;")
    public class139 field3665;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Lc;")
    private class139 field3668;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Lc;")
    private class139 field3650;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "Lc;")
    private class139 field3655;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "Lc;")
    private class139 field3682;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "S")
    private short field3678;

    @OriginalMember(owner = "client!uh", name = "bb", descriptor = "S")
    private short field3685;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "[S")
    private short[] field3676;

    @OriginalMember(owner = "client!uh", name = "cb", descriptor = "[I")
    private int[] field3686;

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "Lfj;")
    private static class3 field3677 = new class3(10000);

    @OriginalMember(owner = "client!uh", name = "Z", descriptor = "Luh;")
    private static class228 field3683 = new class228();

    @OriginalMember(owner = "client!uh", name = "eb", descriptor = "Luh;")
    private static class228 field3688 = new class228();

    @OriginalMember(owner = "client!uh", name = "fb", descriptor = "Luh;")
    private static class228 field3689 = new class228();

    @OriginalMember(owner = "client!uh", name = "gb", descriptor = "Luh;")
    private static class228 field3690 = new class228();

    @OriginalMember(owner = "client!uh", name = "ob", descriptor = "[I")
    private static int[] field3698 = new int[1];

    @OriginalMember(owner = "client!uh", name = "jb", descriptor = "[I")
    private static int[] field3693 = new int[1];

    @OriginalMember(owner = "client!uh", name = "hb", descriptor = "F")
    private static float field3691;

    @OriginalMember(owner = "client!uh", name = "ib", descriptor = "F")
    private static float field3692;

    @OriginalMember(owner = "client!uh", name = "kb", descriptor = "F")
    private static float field3694;

    @OriginalMember(owner = "client!uh", name = "nb", descriptor = "F")
    private static float field3697;

    @OriginalMember(owner = "client!uh", name = "pb", descriptor = "F")
    private static float field3699;

    @OriginalMember(owner = "client!uh", name = "qb", descriptor = "F")
    private static float field3700;

    @OriginalMember(owner = "client!uh", name = "lb", descriptor = "I")
    private static int field3695;

    @OriginalMember(owner = "client!uh", name = "mb", descriptor = "I")
    private static int field3696;

    @OriginalMember(owner = "client!uh", name = "rb", descriptor = "I")
    private static int field3701;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Leh;")
    private class40 field3648;

    @OriginalMember(owner = "client!uh", name = "db", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field3687;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "[J")
    private static long[] field3653;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "[S")
    private short[] field3652;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[S")
    private short[] field3656;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "[S")
    private short[] field3661;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "[S")
    private short[] field3679;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "[[I")
    private int[][] field3649;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "[[I")
    private int[][] field3675;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "()V", line = 7)
    public final void method220() {
        for (int var1 = 0; var1 < this.field3644; var1++) {
            int var2 = this.field3667[var1];
            this.field3667[var1] = this.field3672[var1];
            this.field3672[var1] = -var2;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIII)Z", line = 21)
    private final boolean method1448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V", line = 37)
    public final void method1449(int arg0) {
        this.field3685 = (short) arg0;
        this.field3650.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "()V", line = 43)
    public final void method207() {
        for (int var1 = 0; var1 < this.field3644; var1++) {
            this.field3672[var1] = -this.field3672[var1];
            this.field3667[var1] = -this.field3667[var1];
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lve;)Lve;", line = 55)
    public final class33 method1450(class33 arg0) {
        if (this.field3647 == 0) {
            return null;
        }
        if (!this.field3663.field231) {
            this.method1480();
        }
        int var2;
        int var3;
        if (class178.field2844 > 0) {
            var2 = this.field3663.field235 - (class178.field2844 * this.field3663.field236 >> 8) >> 3;
            var3 = this.field3663.field238 - (class178.field2844 * this.field3663.field237 >> 8) >> 3;
        } else {
            var2 = this.field3663.field235 - (class178.field2844 * this.field3663.field237 >> 8) >> 3;
            var3 = this.field3663.field238 - (class178.field2844 * this.field3663.field236 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class178.field2839 > 0) {
            var4 = this.field3663.field233 - (class178.field2839 * this.field3663.field236 >> 8) >> 3;
            var5 = this.field3663.field234 - (class178.field2839 * this.field3663.field237 >> 8) >> 3;
        } else {
            var4 = this.field3663.field233 - (class178.field2839 * this.field3663.field237 >> 8) >> 3;
            var5 = this.field3663.field234 - (class178.field2839 * this.field3663.field236 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class33 var8;
        if (arg0 == null || arg0.field474.length < var6 * var7) {
            var8 = new class33(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field1230 = arg0.field1243 = var6;
            arg0.field1231 = arg0.field1241 = var7;
            arg0.method247();
        }
        var8.field1232 = var2;
        var8.field1242 = var4;
        if (field3693.length < this.field3647) {
            field3693 = new int[this.field3647];
            field3698 = new int[this.field3647];
        }
        for (int var9 = 0; var9 < this.field3644; var9++) {
            int var10 = (this.field3672[var9] - (this.field3659[var9] * class178.field2844 >> 8) >> 3) - var2;
            int var11 = (this.field3667[var9] - (this.field3659[var9] * class178.field2839 >> 8) >> 3) - var4;
            int var12 = this.field3645[var9];
            int var13 = this.field3645[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field3676[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field3693[var15] = var10;
                field3698[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field3669; var16++) {
            if (this.field3684[var16] <= 128) {
                short var17 = this.field3658[var16];
                short var18 = this.field3680[var16];
                short var19 = this.field3657[var16];
                int var20 = field3693[var17];
                int var21 = field3693[var18];
                int var22 = field3693[var19];
                int var23 = field3698[var17];
                int var24 = field3698[var18];
                int var25 = field3698[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class284.method1887(var8.field474, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "()V", line = 181)
    public final void method216() {
        for (int var1 = 0; var1 < this.field3644; var1++) {
            int var2 = this.field3672[var1];
            this.field3672[var1] = this.field3667[var1];
            this.field3667[var1] = -var2;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 203)
    public final void method221(int arg0) {
        int var2 = class284.field4698[arg0];
        int var3 = class284.field4699[arg0];
        for (int var4 = 0; var4 < this.field3644; var4++) {
            int var5 = this.field3659[var4] * var3 - this.field3667[var4] * var2 >> 16;
            this.field3667[var4] = this.field3667[var4] * var3 + this.field3659[var4] * var2 >> 16;
            this.field3659[var4] = var5;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII)V", line = 222)
    public final void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3647 == 0) {
            return;
        }
        GL var8 = class264.field4313;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method1466();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V", line = 245)
    public final void method1451(int arg0) {
        this.field3678 = (short) arg0;
        this.field3668.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "()I", line = 249)
    public final int method1452() {
        return this.field3685;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Lvc;", line = 253)
    public final class293 method1453(int arg0, int arg1, int arg2) {
        this.field3660 = false;
        if (this.field3652 != null) {
            this.field3670 = this.field3652;
            this.field3652 = null;
            this.field3662 = this.field3679;
            this.field3679 = null;
            this.field3674 = this.field3656;
            this.field3656 = null;
            this.field3654 = this.field3661;
            this.field3661 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 271)
    private static final void method1454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field3699 = var18;
        field3692 = var19;
    }

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "()I", line = 349)
    public final int method213() {
        if (!this.field3663.field231) {
            this.method1480();
        }
        return this.field3663.field233;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([FI)[F", line = 359)
    private static final float[] method1455(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class213.method1344(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "()V", line = 367)
    public final void method1456() {
        for (int var1 = 0; var1 < this.field3644; var1++) {
            int var2 = this.field3672[var1];
            this.field3672[var1] = this.field3667[var1];
            this.field3667[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3647; var3++) {
            short var4 = this.field3670[var3];
            this.field3670[var3] = this.field3674[var3];
            this.field3674[var3] = (short) (-var4);
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
        this.field3650.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "()V", line = 396)
    public final void method1457() {
        for (int var1 = 0; var1 < this.field3644; var1++) {
            int var2 = this.field3667[var1];
            this.field3667[var1] = this.field3672[var1];
            this.field3672[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field3647; var3++) {
            short var4 = this.field3674[var3];
            this.field3674[var3] = this.field3670[var3];
            this.field3670[var3] = (short) (-var4);
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
        this.field3650.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIFFF)[F", line = 425)
    private static final float[] method1458(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "()I", line = 500)
    public final int method204() {
        if (!this.field3663.field231) {
            this.method1480();
        }
        return this.field3663.field232;
    }

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "()V", line = 508)
    public final void method1459() {
        for (int var1 = 0; var1 < this.field3644; var1++) {
            this.field3667[var1] = -this.field3667[var1];
        }
        for (int var2 = 0; var2 < this.field3647; var2++) {
            this.field3674[var2] = (short) (-this.field3674[var2]);
        }
        for (int var3 = 0; var3 < this.field3669; var3++) {
            short var4 = this.field3658[var3];
            this.field3658[var3] = this.field3657[var3];
            this.field3657[var3] = var4;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
        this.field3650.field2226 = false;
        this.field3682.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILuh;[[I[[IIII)V", line = 539)
    public final void method1460(int arg0, int arg1, class228 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field3663.field231) {
            arg2.method1480();
        }
        int var9 = arg2.field3663.field235 + arg5;
        int var10 = arg2.field3663.field238 + arg5;
        int var11 = arg2.field3663.field233 + arg7;
        int var12 = arg2.field3663.field234 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field3644; var17++) {
                int var18 = this.field3672[var17] + arg5;
                int var19 = this.field3667[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field3659[var17] = this.field3659[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field3663.field237;
            for (int var28 = 0; var28 < this.field3644; var28++) {
                int var29 = (this.field3659[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field3672[var28] + arg5;
                    int var31 = this.field3667[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field3659[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method209(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field3663.field236 - arg2.field3663.field237;
            for (int var42 = 0; var42 < this.field3644; var42++) {
                int var43 = this.field3672[var42] + arg5;
                int var44 = this.field3667[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field3659[var42] = var51 + this.field3659[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field3663.field236 - arg2.field3663.field237;
            for (int var53 = 0; var53 < this.field3644; var53++) {
                int var54 = this.field3672[var53] + arg5;
                int var55 = this.field3667[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field3659[var53] = ((this.field3659[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field3665.field2226 = false;
        this.field3663.field231 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(SS)V", line = 738)
    public final void method1461(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3669; var3++) {
            if (this.field3666[var3] == arg0) {
                this.field3666[var3] = arg1;
            }
        }
        this.field3668.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIIJ)V", line = 750)
    public final void method202(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field3647 == 0) {
            return;
        }
        if (!this.field3663.field231) {
            this.method1480();
        }
        short var11 = this.field3663.field232;
        short var12 = this.field3663.field237;
        short var13 = this.field3663.field236;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class120.field1892) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class85.field1276) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class124.field1904) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class118.field1782) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class284.field4698[arg0];
            var25 = class284.field4699[arg0];
        }
        if (arg8 > 0L && class46.field679 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class35.field482 >= var26 && class35.field482 <= var27 && class150.field2385 >= var28 && class150.field2385 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field3663.field235;
                short var35 = this.field3663.field238;
                short var36 = this.field3663.field233;
                short var37 = this.field3663.field234;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class35.field482 >= var30 && class35.field482 <= var31 && class150.field2385 >= var32 && class150.field2385 <= var33) {
                    if (this.field412) {
                        class287.field4728[class214.field3405++] = arg8;
                    } else {
                        if (field3693.length < this.field3647) {
                            field3693 = new int[this.field3647];
                            field3698 = new int[this.field3647];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field3644) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field3669) {
                                        break label118;
                                    }
                                    short var78 = this.field3658[var77];
                                    short var79 = this.field3680[var77];
                                    short var80 = this.field3657[var77];
                                    if (this.method1448(class35.field482, class150.field2385, field3698[var78], field3698[var79], field3698[var80], field3693[var78], field3693[var79], field3693[var80])) {
                                        class287.field4728[class214.field3405++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field3672[var57];
                            int var59 = this.field3659[var57];
                            int var60 = this.field3667[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field3645[var57];
                            int var74 = this.field3645[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field3676[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field3693[var76] = var71;
                                field3698[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class264.field4313;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method1466();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ISIB)I", line = 1020)
    private static final int method1462(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class284.field4687[class48.method365(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class284.field4692.method124(arg1 & 0xFFFF, (byte) 75);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class284.field4692.method128(arg1 & 0xFFFF, (byte) 75);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lla;ILla;I[IZ)V", line = 1078)
    public final void method211(class113 arg0, int arg1, class113 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method219(arg0, arg1, arg5);
            return;
        }
        class165 var7 = arg0.field1722[arg1];
        class165 var8 = arg2.field1722[arg3];
        class5 var9 = var7.field2605;
        for (int var10 = 0; var10 < this.field3644; var10++) {
            this.field3672[var10] <<= 0x4;
            this.field3659[var10] <<= 0x4;
            this.field3667[var10] <<= 0x4;
        }
        field3696 = 0;
        field3695 = 0;
        field3701 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field2601; var13++) {
            short var14 = var7.field2598[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field131[var14] == 0) {
                if (var7.field2604[var13] != -1) {
                    this.method1485(0, var9.field126[var7.field2604[var13]], 0, 0, 0, arg5);
                }
                this.method1485(var9.field131[var14], var9.field126[var14], var7.field2600[var13], var7.field2608[var13], var7.field2599[var13], arg5);
            }
        }
        field3696 = 0;
        field3695 = 0;
        field3701 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field2601; var17++) {
            short var18 = var8.field2598[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field131[var18] == 0) {
                if (var8.field2604[var17] != -1) {
                    this.method1485(0, var9.field126[var8.field2604[var17]], 0, 0, 0, arg5);
                }
                this.method1485(var9.field131[var18], var9.field126[var18], var8.field2600[var17], var8.field2608[var17], var8.field2599[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field3644; var19++) {
            this.field3672[var19] >>= 0x4;
            this.field3659[var19] >>= 0x4;
            this.field3667[var19] >>= 0x4;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "()V", line = 1173)
    public static void method1463() {
        field3653 = null;
        field3677 = null;
        field3687 = null;
        field3683 = null;
        field3688 = null;
        field3689 = null;
        field3690 = null;
        field3693 = null;
        field3698 = null;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "()I", line = 1184)
    public final int method205() {
        if (!this.field3663.field231) {
            this.method1480();
        }
        return this.field3663.field234;
    }

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "()V", line = 1190)
    public static final void method1464() {
        field3683 = new class228();
        field3688 = new class228();
        field3689 = new class228();
        field3690 = new class228();
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(III)V", line = 1198)
    public final void method223(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3644; var4++) {
            this.field3672[var4] += arg0;
            this.field3659[var4] += arg1;
            this.field3667[var4] += arg2;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()Z", line = 1212)
    public final boolean method1465() {
        return this.field3660 && this.field3672 != null && this.field3670 != null;
    }

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "()V", line = 1217)
    private final void method1466() {
        GL var1 = class264.field4313;
        if (this.field3669 == 0) {
            return;
        }
        if (this.field3646 != 0) {
            this.method1475(true, !this.field3665.field2226 && (this.field3646 & 0x1) != 0, !this.field3668.field2226 && (this.field3646 & 0x2) != 0, !this.field3650.field2226 && (this.field3646 & 0x4) != 0, false);
        }
        this.method1475(false, !this.field3665.field2226, !this.field3668.field2226, !this.field3650.field2226, !this.field3655.field2226);
        if (!this.field3682.field2226) {
            this.method1477();
        }
        if (this.field3681 != 0) {
            if ((this.field3681 & 0x1) != 0) {
                this.field3672 = null;
                this.field3659 = null;
                this.field3667 = null;
                this.field3676 = null;
                this.field3645 = null;
            }
            if ((this.field3681 & 0x2) != 0) {
                this.field3666 = null;
                this.field3684 = null;
            }
            if ((this.field3681 & 0x4) != 0) {
                this.field3670 = null;
                this.field3662 = null;
                this.field3674 = null;
                this.field3654 = null;
            }
            if ((this.field3681 & 0x8) != 0) {
                this.field3671 = null;
                this.field3673 = null;
            }
            if ((this.field3681 & 0x10) != 0) {
                this.field3658 = null;
                this.field3680 = null;
                this.field3657 = null;
            }
            this.field3681 = 0;
        }
        if (this.field3665.field2230 != null) {
            this.field3665.field2230.method316();
            var1.glVertexPointer(3, 5126, this.field3665.field2222, (long) this.field3665.field2234);
        }
        if (this.field3668.field2230 != null) {
            this.field3668.field2230.method316();
            var1.glColorPointer(4, 5121, this.field3668.field2222, (long) this.field3668.field2234);
        }
        if (this.field3650.field2230 != null && class6.field146) {
            this.field3650.field2230.method316();
            var1.glNormalPointer(5126, this.field3650.field2222, (long) this.field3650.field2234);
        }
        if (this.field3655.field2230 != null) {
            this.field3655.field2230.method316();
            var1.glTexCoordPointer(2, 5126, this.field3655.field2222, (long) this.field3655.field2234);
        }
        if (this.field3682.field2230 != null) {
            this.field3682.field2230.method314();
        }
        if (this.field3665.field2230 == null || this.field3668.field2230 == null || this.field3650.field2230 == null || this.field3655.field2230 == null) {
            if (class264.field4314) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field3665.field2230 == null) {
                this.field3665.field2221.position(this.field3665.field2234);
                var1.glVertexPointer(3, 5126, this.field3665.field2222, this.field3665.field2221);
            }
            if (this.field3668.field2230 == null) {
                this.field3668.field2221.position(this.field3668.field2234);
                var1.glColorPointer(4, 5121, this.field3668.field2222, this.field3668.field2221);
            }
            if (this.field3650.field2230 == null && class6.field146) {
                this.field3650.field2221.position(this.field3650.field2234);
                var1.glNormalPointer(5126, this.field3650.field2222, this.field3650.field2221);
            }
            if (this.field3655.field2230 == null) {
                this.field3655.field2221.position(this.field3655.field2234);
                var1.glTexCoordPointer(2, 5126, this.field3655.field2222, this.field3655.field2221);
            }
        }
        if (this.field3682.field2230 == null && class264.field4314) {
            var1.glBindBufferARB(34963, 0);
        }
        int var2 = this.field3686.length - 1;
        for (int var3 = 0; var3 < var2; var3++) {
            int var4 = this.field3686[var3];
            int var5 = this.field3686[var3 + 1];
            short var6 = this.field3664[var4];
            if (var6 == -1) {
                class264.method1722(-1);
                class103.method677(0, 30359, 0);
            } else {
                class284.field4692.method127(var6 & 0xFFFF, (byte) -69);
            }
            if (this.field3682.field2230 == null) {
                this.field3682.field2221.position(var4 * 12);
                var1.glDrawElements(4, (var5 - var4) * 3, 5125, this.field3682.field2221);
            } else {
                var1.glDrawElements(4, (var5 - var4) * 3, 5125, (long) (var4 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(ZZ)Lec;", line = 1370)
    public final class28 method218(boolean arg0, boolean arg1) {
        return this.method1469(arg0, arg1, field3690, field3689);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lqf;IJIIIIFF)S", line = 1374)
    private final short method1467(class267 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field3645[arg1];
        int var12 = this.field3645[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field3676[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field3653[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field3676[var13] = (short) (this.field3647 + 1);
        field3653[var13] = arg2;
        this.field3670[this.field3647] = (short) arg3;
        this.field3662[this.field3647] = (short) arg4;
        this.field3674[this.field3647] = (short) arg5;
        this.field3654[this.field3647] = (short) arg6;
        this.field3671[this.field3647] = arg7;
        this.field3673[this.field3647] = arg8;
        return (short) (this.field3647++);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)V", line = 1410)
    private final void method1468(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field3696 = 0;
            field3695 = 0;
            field3701 = 0;
            for (int var6 = 0; var6 < this.field3644; var6++) {
                field3696 += this.field3672[var6];
                field3695 += this.field3659[var6];
                field3701 += this.field3667[var6];
                var5++;
            }
            if (var5 > 0) {
                field3696 = field3696 / var5 + arg1;
                field3695 = field3695 / var5 + arg2;
                field3701 = field3701 / var5 + arg3;
            } else {
                field3696 = arg1;
                field3695 = arg2;
                field3701 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field3644; var7++) {
                this.field3672[var7] += arg1;
                this.field3659[var7] += arg2;
                this.field3667[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field3644; var8++) {
                this.field3672[var8] -= field3696;
                this.field3659[var8] -= field3695;
                this.field3667[var8] -= field3701;
                if (arg3 != 0) {
                    int var9 = class284.field4698[arg3];
                    int var10 = class284.field4699[arg3];
                    int var11 = this.field3672[var8] * var10 + this.field3659[var8] * var9 + 32767 >> 16;
                    this.field3659[var8] = this.field3659[var8] * var10 + 32767 - this.field3672[var8] * var9 >> 16;
                    this.field3672[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class284.field4698[arg1];
                    int var13 = class284.field4699[arg1];
                    int var14 = this.field3659[var8] * var13 + 32767 - this.field3667[var8] * var12 >> 16;
                    this.field3667[var8] = this.field3667[var8] * var13 + this.field3659[var8] * var12 + 32767 >> 16;
                    this.field3659[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class284.field4698[arg2];
                    int var16 = class284.field4699[arg2];
                    int var17 = this.field3672[var8] * var16 + this.field3667[var8] * var15 + 32767 >> 16;
                    this.field3667[var8] = this.field3667[var8] * var16 + 32767 - this.field3672[var8] * var15 >> 16;
                    this.field3672[var8] = var17;
                }
                this.field3672[var8] += field3696;
                this.field3659[var8] += field3695;
                this.field3667[var8] += field3701;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field3644; var18++) {
                this.field3672[var18] -= field3696;
                this.field3659[var18] -= field3695;
                this.field3667[var18] -= field3701;
                this.field3672[var18] = this.field3672[var18] * arg1 / 128;
                this.field3659[var18] = this.field3659[var18] * arg2 / 128;
                this.field3667[var18] = this.field3667[var18] * arg3 / 128;
                this.field3672[var18] += field3696;
                this.field3659[var18] += field3695;
                this.field3667[var18] += field3701;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field3669; var19++) {
                int var20 = (this.field3684[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field3684[var19] = (byte) var20;
            }
            this.field3668.field2226 = false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()I", line = 1564)
    public final int method214() {
        if (!this.field3663.field231) {
            this.method1480();
        }
        return this.field3663.field237;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 3573)
    private class228() {
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lqf;IIZ)V", line = 3576)
    public class228(class267 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field4388];
        this.field3645 = new int[arg0.field4385 + 1];
        for (int var6 = 0; var6 < arg0.field4388; var6++) {
            if ((arg0.field4405 == null || arg0.field4405[var6] != 2) && (arg0.field4393 == null || arg0.field4393[var6] == -1 || !class284.field4692.method125(-123, arg0.field4393[var6] & 0xFFFF))) {
                var5[this.field3669++] = var6;
                this.field3645[arg0.field4410[var6]]++;
                this.field3645[arg0.field4412[var6]]++;
                this.field3645[arg0.field4372[var6]]++;
            }
        }
        long[] var7 = new long[this.field3669];
        for (int var8 = 0; var8 < this.field3669; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field4393 != null) {
                var14 = arg0.field4393[var9];
                if (var14 != -1) {
                    var12 = class284.field4692.method133(var14 & 0xFFFF, true);
                    var13 = class284.field4692.method132(var14 & 0xFFFF, 0);
                }
            }
            boolean var15 = arg0.field4381 != null && arg0.field4381[var9] != 0 || var14 != -1 && !class284.field4692.method130((byte) 98, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field4399 != null) {
                var10 += arg0.field4399[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class236.method1515(var7, 100, var5);
        this.field3644 = arg0.field4385;
        this.field3672 = arg0.field4377;
        this.field3659 = arg0.field4371;
        this.field3667 = arg0.field4394;
        this.field3651 = arg0.field4415;
        int var20 = this.field3669 * 3;
        this.field3670 = new short[var20];
        this.field3662 = new short[var20];
        this.field3674 = new short[var20];
        this.field3654 = new short[var20];
        this.field3671 = new float[var20];
        this.field3673 = new float[var20];
        this.field3666 = new short[this.field3669];
        this.field3684 = new byte[this.field3669];
        this.field3658 = new short[this.field3669];
        this.field3680 = new short[this.field3669];
        this.field3657 = new short[this.field3669];
        this.field3664 = new short[this.field3669];
        if (arg0.field4403 != null) {
            this.field3643 = new byte[this.field3669];
        }
        this.field3663 = new class16();
        this.field3665 = new class139();
        this.field3668 = new class139();
        this.field3650 = new class139();
        this.field3655 = new class139();
        this.field3682 = new class139();
        this.field3678 = (short) arg1;
        this.field3685 = (short) arg2;
        this.field3676 = new short[var20];
        field3653 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field4385; var22++) {
            int var23 = this.field3645[var22];
            this.field3645[var22] = var21;
            var21 += var23;
        }
        this.field3645[arg0.field4385] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field4397 != null) {
            int var28 = arg0.field4387;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field3669; var36++) {
                int var37 = var5[var36];
                if (arg0.field4397[var37] != -1) {
                    int var38 = arg0.field4397[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field4410[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field4412[var37];
                        } else {
                            var40 = arg0.field4372[var37];
                        }
                        int var41 = arg0.field4377[var40];
                        int var42 = arg0.field4371[var40];
                        int var43 = arg0.field4394[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field4367[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field4383[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field4370[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field4383[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field4370[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field4407[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field4383[var44] / 1024.0F;
                        var49 = (float) arg0.field4370[var44] / 1024.0F;
                        var48 = (float) arg0.field4407[var44] / 1024.0F;
                    }
                    var27[var44] = method1458(arg0.field4409[var44], arg0.field4368[var44], arg0.field4369[var44], arg0.field4384[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field3669; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field4379[var51] & 0xFFFF;
            short var53;
            if (arg0.field4393 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field4393[var51];
            }
            int var54;
            if (arg0.field4397 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field4397[var51];
            }
            int var55;
            if (arg0.field4381 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field4381[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field4367[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field4410[var51];
                        int var67 = arg0.field4412[var51];
                        int var68 = arg0.field4372[var51];
                        short var69 = arg0.field4409[var54];
                        short var70 = arg0.field4368[var54];
                        short var71 = arg0.field4369[var54];
                        float var72 = (float) arg0.field4377[var69];
                        float var73 = (float) arg0.field4371[var69];
                        float var74 = (float) arg0.field4394[var69];
                        float var75 = (float) arg0.field4377[var70] - var72;
                        float var76 = (float) arg0.field4371[var70] - var73;
                        float var77 = (float) arg0.field4394[var70] - var74;
                        float var78 = (float) arg0.field4377[var71] - var72;
                        float var79 = (float) arg0.field4371[var71] - var73;
                        float var80 = (float) arg0.field4394[var71] - var74;
                        float var81 = (float) arg0.field4377[var66] - var72;
                        float var82 = (float) arg0.field4371[var66] - var73;
                        float var83 = (float) arg0.field4394[var66] - var74;
                        float var84 = (float) arg0.field4377[var67] - var72;
                        float var85 = (float) arg0.field4371[var67] - var73;
                        float var86 = (float) arg0.field4394[var67] - var74;
                        float var87 = (float) arg0.field4377[var68] - var72;
                        float var88 = (float) arg0.field4371[var68] - var73;
                        float var89 = (float) arg0.field4394[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field4410[var51];
                        int var102 = arg0.field4412[var51];
                        int var103 = arg0.field4372[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field4390[var54];
                        float var109 = (float) arg0.field4389[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field4407[var54] & 0xFFFF) / 1024.0F;
                            method1484(arg0.field4377[var101], arg0.field4371[var101], arg0.field4394[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field3691;
                            var57 = field3700;
                            method1484(arg0.field4377[var102], arg0.field4371[var102], arg0.field4394[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field3691;
                            var59 = field3700;
                            method1484(arg0.field4377[var103], arg0.field4371[var103], arg0.field4394[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field3691;
                            var61 = field3700;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field4373[var54] / 256.0F;
                            float var113 = (float) arg0.field4376[var54] / 256.0F;
                            int var114 = arg0.field4377[var102] - arg0.field4377[var101];
                            int var115 = arg0.field4371[var102] - arg0.field4371[var101];
                            int var116 = arg0.field4394[var102] - arg0.field4394[var101];
                            int var117 = arg0.field4377[var103] - arg0.field4377[var101];
                            int var118 = arg0.field4371[var103] - arg0.field4371[var101];
                            int var119 = arg0.field4394[var103] - arg0.field4394[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field4383[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field4370[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field4407[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method1483(var126, var127, var128);
                            method1454(arg0.field4377[var101], arg0.field4371[var101], arg0.field4394[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field3699;
                            var57 = field3692;
                            method1454(arg0.field4377[var102], arg0.field4371[var102], arg0.field4394[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field3699;
                            var59 = field3692;
                            method1454(arg0.field4377[var103], arg0.field4371[var103], arg0.field4394[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field3699;
                            var61 = field3692;
                        } else if (var65 == 3) {
                            method1476(arg0.field4377[var101], arg0.field4371[var101], arg0.field4394[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field3694;
                            var57 = field3697;
                            method1476(arg0.field4377[var102], arg0.field4371[var102], arg0.field4394[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field3694;
                            var59 = field3697;
                            method1476(arg0.field4377[var103], arg0.field4371[var103], arg0.field4394[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field3694;
                            var61 = field3697;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1763();
            byte var129;
            if (arg0.field4405 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field4405[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field4410[var51];
                class270 var133 = arg0.field4378[var132];
                this.field3658[var50] = this.method1467(arg0, var132, var130, var133.field4456, var133.field4463, var133.field4449, var133.field4455, var56, var57);
                int var134 = arg0.field4412[var51];
                class270 var135 = arg0.field4378[var134];
                this.field3680[var50] = this.method1467(arg0, var134, (long) var62 + var130, var135.field4456, var135.field4463, var135.field4449, var135.field4455, var58, var59);
                int var136 = arg0.field4372[var51];
                class270 var137 = arg0.field4378[var136];
                this.field3657[var50] = this.method1467(arg0, var136, (long) var63 + var130, var137.field4456, var137.field4463, var137.field4449, var137.field4455, var60, var61);
            } else if (var129 == 1) {
                class265 var138 = arg0.field4374[var51];
                long var139 = (long) ((var54 << 2) + (var138.field4330 > 0 ? 1024 : 2048) + (var138.field4329 + 256 << 12) + (var138.field4334 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field3658[var50] = this.method1467(arg0, arg0.field4410[var51], var139, var138.field4330, var138.field4329, var138.field4334, 0, var56, var57);
                this.field3680[var50] = this.method1467(arg0, arg0.field4412[var51], (long) var62 + var139, var138.field4330, var138.field4329, var138.field4334, 0, var58, var59);
                this.field3657[var50] = this.method1467(arg0, arg0.field4372[var51], (long) var63 + var139, var138.field4330, var138.field4329, var138.field4334, 0, var60, var61);
            }
            if (arg0.field4393 == null) {
                this.field3664[var50] = -1;
            } else {
                this.field3664[var50] = arg0.field4393[var51];
            }
            if (this.field3643 != null) {
                this.field3643[var50] = (byte) arg0.field4403[var51];
            }
            this.field3666[var50] = arg0.field4379[var51];
            if (arg0.field4381 != null) {
                this.field3684[var50] = arg0.field4381[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field3669; var143++) {
            short var144 = this.field3664[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field3686 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field3669; var147++) {
            short var148 = this.field3664[var147];
            if (var146 != var148) {
                this.field3686[var145++] = var147;
                var146 = var148;
            }
        }
        this.field3686[var145] = this.field3669;
        field3653 = null;
        this.field3670 = method1474(this.field3670, this.field3647);
        this.field3662 = method1474(this.field3662, this.field3647);
        this.field3674 = method1474(this.field3674, this.field3647);
        this.field3654 = method1474(this.field3654, this.field3647);
        this.field3671 = method1455(this.field3671, this.field3647);
        this.field3673 = method1455(this.field3673, this.field3647);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZLuh;Luh;)Lec;", line = 1574)
    private final class28 method1469(boolean arg0, boolean arg1, class228 arg2, class228 arg3) {
        arg2.field3644 = this.field3644;
        arg2.field3647 = this.field3647;
        arg2.field3669 = this.field3669;
        arg2.field3678 = this.field3678;
        arg2.field3685 = this.field3685;
        arg2.field3646 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field3672 == null || arg2.field3672.length < this.field3644) {
            arg2.field3672 = new int[this.field3644 + 100];
            arg2.field3659 = new int[this.field3644 + 100];
            arg2.field3667 = new int[this.field3644 + 100];
        }
        for (int var5 = 0; var5 < this.field3644; var5++) {
            arg2.field3672[var5] = this.field3672[var5];
            arg2.field3659[var5] = this.field3659[var5];
            arg2.field3667[var5] = this.field3667[var5];
        }
        if (arg2.field3665 == null) {
            arg2.field3665 = new class139();
        }
        arg2.field3665.field2226 = false;
        if (arg2.field3663 == null) {
            arg2.field3663 = new class16();
        }
        arg2.field3663.field231 = false;
        if (arg0) {
            arg2.field3684 = this.field3684;
            arg2.field3668 = this.field3668;
        } else {
            if (arg3.field3684 == null || arg3.field3684.length < this.field3669) {
                arg3.field3684 = new byte[this.field3669 + 100];
            }
            arg2.field3684 = arg3.field3684;
            for (int var6 = 0; var6 < this.field3669; var6++) {
                arg2.field3684[var6] = this.field3684[var6];
            }
            if (arg3.field3668 == null) {
                arg3.field3668 = new class139();
            }
            arg2.field3668 = arg3.field3668;
            arg2.field3668.field2226 = false;
        }
        if (arg1) {
            arg2.field3670 = this.field3670;
            arg2.field3662 = this.field3662;
            arg2.field3674 = this.field3674;
            arg2.field3654 = this.field3654;
            arg2.field3650 = this.field3650;
        } else {
            if (arg3.field3670 == null || arg3.field3670.length < this.field3647) {
                arg3.field3670 = new short[this.field3647 + 100];
                arg3.field3662 = new short[this.field3647 + 100];
                arg3.field3674 = new short[this.field3647 + 100];
                arg3.field3654 = new short[this.field3647 + 100];
            }
            arg2.field3670 = arg3.field3670;
            arg2.field3662 = arg3.field3662;
            arg2.field3674 = arg3.field3674;
            arg2.field3654 = arg3.field3654;
            for (int var7 = 0; var7 < this.field3647; var7++) {
                arg2.field3670[var7] = this.field3670[var7];
                arg2.field3662[var7] = this.field3662[var7];
                arg2.field3674[var7] = this.field3674[var7];
                arg2.field3654[var7] = this.field3654[var7];
            }
            if (arg3.field3650 == null) {
                arg3.field3650 = new class139();
            }
            arg2.field3650 = arg3.field3650;
            arg2.field3650.field2226 = false;
        }
        arg2.field3671 = this.field3671;
        arg2.field3673 = this.field3673;
        arg2.field3651 = this.field3651;
        arg2.field3649 = this.field3649;
        arg2.field3666 = this.field3666;
        arg2.field3658 = this.field3658;
        arg2.field3680 = this.field3680;
        arg2.field3657 = this.field3657;
        arg2.field3664 = this.field3664;
        arg2.field3643 = this.field3643;
        arg2.field3675 = this.field3675;
        arg2.field3655 = this.field3655;
        arg2.field3682 = this.field3682;
        arg2.field3686 = this.field3686;
        arg2.field3676 = this.field3676;
        arg2.field3645 = this.field3645;
        arg2.field412 = this.field412;
        return arg2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZZZZZ)V", line = 1692)
    public final void method1470(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
        if (arg0) {
            if (this.field3665.field2226) {
                this.field3672 = null;
                this.field3659 = null;
                this.field3667 = null;
                this.field3676 = null;
                this.field3645 = null;
            } else {
                this.field3681 = (byte) (this.field3681 | 0x1);
            }
        }
        if (arg1) {
            if (this.field3668.field2226) {
                this.field3666 = null;
                this.field3684 = null;
            } else {
                this.field3681 = (byte) (this.field3681 | 0x2);
            }
        }
        if (arg2) {
            if (this.field3650.field2226) {
                this.field3670 = null;
                this.field3662 = null;
                this.field3674 = null;
                this.field3654 = null;
            } else {
                this.field3681 = (byte) (this.field3681 | 0x4);
            }
        }
        if (arg3) {
            if (this.field3655.field2226) {
                this.field3671 = null;
                this.field3673 = null;
            } else {
                this.field3681 = (byte) (this.field3681 | 0x8);
            }
        }
        if (arg4 && arg1) {
            if (this.field3682.field2226 && this.field3668.field2226) {
                this.field3658 = null;
                this.field3680 = null;
                this.field3657 = null;
            } else {
                this.field3681 = (byte) (this.field3681 | 0x10);
            }
        }
        if (arg5) {
            this.field3651 = null;
            this.field3643 = null;
            this.field3649 = (int[][]) null;
            this.field3675 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V", line = 1769)
    public final void method1471(int arg0) {
        int var2 = class284.field4698[arg0];
        int var3 = class284.field4699[arg0];
        for (int var4 = 0; var4 < this.field3644; var4++) {
            int var5 = this.field3672[var4] * var3 + this.field3667[var4] * var2 >> 16;
            this.field3667[var4] = this.field3667[var4] * var3 - this.field3672[var4] * var2 >> 16;
            this.field3672[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field3647; var6++) {
            int var7 = this.field3674[var6] * var2 + this.field3670[var6] * var3 >> 16;
            this.field3674[var6] = (short) (this.field3674[var6] * var3 - this.field3670[var6] * var2 >> 16);
            this.field3670[var6] = (short) var7;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
        this.field3650.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "()V", line = 1807)
    public final void method1472() {
        for (int var1 = 0; var1 < this.field3644; var1++) {
            this.field3672[var1] = -this.field3672[var1];
            this.field3667[var1] = -this.field3667[var1];
        }
        for (int var2 = 0; var2 < this.field3647; var2++) {
            this.field3670[var2] = (short) (-this.field3670[var2]);
            this.field3674[var2] = (short) (-this.field3674[var2]);
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
        this.field3650.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "()V", line = 1834)
    public final void method1473() {
        int var10002;
        if (this.field3651 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3644; var3++) {
                int var4 = this.field3651[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field3649 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field3649[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field3644) {
                int var7 = this.field3651[var6] & 0xFF;
                this.field3649[var7][var1[var7]++] = var6++;
            }
            this.field3651 = null;
        }
        if (this.field3643 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field3669; var10++) {
            int var11 = this.field3643[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field3675 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field3675[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field3669) {
            int var14 = this.field3643[var13] & 0xFF;
            this.field3675[var14][var8[var14]++] = var13++;
        }
        this.field3643 = null;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V", line = 1927)
    public final void method222(int arg0) {
        int var2 = class284.field4698[arg0];
        int var3 = class284.field4699[arg0];
        for (int var4 = 0; var4 < this.field3644; var4++) {
            int var5 = this.field3672[var4] * var3 + this.field3667[var4] * var2 >> 16;
            this.field3667[var4] = this.field3667[var4] * var3 - this.field3672[var4] * var2 >> 16;
            this.field3672[var4] = var5;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "()I", line = 1947)
    public final int method208() {
        if (!this.field3663.field231) {
            this.method1480();
        }
        return this.field3663.field238;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([SI)[S", line = 1955)
    private static final short[] method1474(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class213.method1343(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lla;I)V", line = 1960)
    public final void method215(class113 arg0, int arg1) {
        if (this.field3649 == null || arg1 == -1) {
            return;
        }
        class165 var3 = arg0.field1722[arg1];
        class5 var4 = var3.field2605;
        field3696 = 0;
        field3695 = 0;
        field3701 = 0;
        for (int var5 = 0; var5 < var3.field2601; var5++) {
            short var6 = var3.field2598[var5];
            if (var4.field127[var6]) {
                if (var3.field2604[var5] != -1) {
                    this.method1468(0, 0, 0, 0);
                }
                this.method1468(var4.field131[var6], var3.field2600[var5], var3.field2608[var5], var3.field2599[var5]);
            }
        }
        this.field3665.field2226 = false;
        this.field3663.field231 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lla;IZ)V", line = 1995)
    public final void method219(class113 arg0, int arg1, boolean arg2) {
        if (this.field3649 == null || arg1 == -1) {
            return;
        }
        class165 var4 = arg0.field1722[arg1];
        class5 var5 = var4.field2605;
        for (int var6 = 0; var6 < this.field3644; var6++) {
            this.field3672[var6] <<= 0x4;
            this.field3659[var6] <<= 0x4;
            this.field3667[var6] <<= 0x4;
        }
        field3696 = 0;
        field3695 = 0;
        field3701 = 0;
        for (int var7 = 0; var7 < var4.field2601; var7++) {
            short var8 = var4.field2598[var7];
            if (var4.field2604[var7] != -1) {
                this.method1485(0, var5.field126[var4.field2604[var7]], 0, 0, 0, arg2);
            }
            this.method1485(var5.field131[var8], var5.field126[var8], var4.field2600[var7], var4.field2608[var7], var4.field2599[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field3644; var9++) {
            this.field3672[var9] >>= 0x4;
            this.field3659[var9] >>= 0x4;
            this.field3667[var9] >>= 0x4;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()I", line = 2048)
    public final int method201() {
        if (!this.field3663.field231) {
            this.method1480();
        }
        return this.field3663.field235;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZZZZ)V", line = 2057)
    private final void method1475(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field3665.field2234 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field3668.field2234 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field3650.field2234 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field3655.field2234 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field3677.field101.length < this.field3647 * var6) {
            field3677 = new class3((this.field3647 + 100) * var6);
        } else {
            field3677.field44 = 0;
        }
        if (arg1) {
            if (class264.field4297) {
                for (int var7 = 0; var7 < this.field3644; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field3672[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field3659[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field3667[var7]);
                    int var11 = this.field3645[var7];
                    int var12 = this.field3645[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field3676[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field3677.field44 = var6 * var14;
                        field3677.method26(var8, 98);
                        field3677.method26(var9, 68);
                        field3677.method26(var10, 84);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field3644; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field3672[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field3659[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field3667[var15]);
                    int var19 = this.field3645[var15];
                    int var20 = this.field3645[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field3676[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field3677.field44 = var6 * var22;
                        field3677.method38(true, var16);
                        field3677.method38(true, var17);
                        field3677.method38(true, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class6.field146 || this.field3670 == null) {
                for (int var41 = 0; var41 < this.field3669; var41++) {
                    int var42 = method1462(this.field3666[var41], this.field3664[var41], this.field3678, this.field3684[var41]);
                    field3677.field44 = this.field3658[var41] * var6 + this.field3668.field2234;
                    field3677.method26(var42, 68);
                    field3677.field44 = this.field3680[var41] * var6 + this.field3668.field2234;
                    field3677.method26(var42, 60);
                    field3677.field44 = this.field3657[var41] * var6 + this.field3668.field2234;
                    field3677.method26(var42, 62);
                }
            } else {
                int var23 = (int) class178.field2847[0];
                int var24 = (int) class178.field2847[1];
                int var25 = (int) class178.field2847[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field3678 * 1.3F);
                int var28 = this.field3685 * var26 >> 8;
                for (int var29 = 0; var29 < this.field3669; var29++) {
                    short var30 = this.field3658[var29];
                    short var31 = this.field3680[var29];
                    short var32 = this.field3657[var29];
                    if (this.field3654[var30] == 0) {
                        int var39 = (this.field3674[var30] * var25 + this.field3670[var30] * var23 + this.field3662[var30] * var24) / (var28 / 2 + var28) + var27;
                        int var40 = method1462(this.field3666[var29], this.field3664[var29], var39, this.field3684[var29]);
                        field3677.field44 = var6 * var30 + this.field3668.field2234;
                        field3677.method26(var40, 45);
                        field3677.field44 = var6 * var31 + this.field3668.field2234;
                        field3677.method26(var40, 71);
                        field3677.field44 = var6 * var32 + this.field3668.field2234;
                        field3677.method26(var40, 116);
                    } else {
                        int var33 = (this.field3674[var30] * var25 + this.field3670[var30] * var23 + this.field3662[var30] * var24) / (this.field3654[var30] * var28) + var27;
                        int var34 = (this.field3674[var31] * var25 + this.field3670[var31] * var23 + this.field3662[var31] * var24) / (this.field3654[var31] * var28) + var27;
                        int var35 = (this.field3674[var32] * var25 + this.field3670[var32] * var23 + this.field3662[var32] * var24) / (this.field3654[var32] * var28) + var27;
                        int var36 = method1462(this.field3666[var29], this.field3664[var29], var33, this.field3684[var29]);
                        int var37 = method1462(this.field3666[var29], this.field3664[var29], var34, this.field3684[var29]);
                        int var38 = method1462(this.field3666[var29], this.field3664[var29], var35, this.field3684[var29]);
                        field3677.field44 = var6 * var30 + this.field3668.field2234;
                        field3677.method26(var36, 116);
                        field3677.field44 = var6 * var31 + this.field3668.field2234;
                        field3677.method26(var37, 119);
                        field3677.field44 = var6 * var32 + this.field3668.field2234;
                        field3677.method26(var38, 39);
                    }
                }
            }
        }
        if (arg3) {
            float var43 = 3.0F / (float) this.field3685;
            float var44 = 3.0F / (float) (this.field3685 / 2 + this.field3685);
            field3677.field44 = this.field3650.field2234;
            if (class264.field4297) {
                for (int var45 = 0; var45 < this.field3647; var45++) {
                    short var46 = this.field3654[var45];
                    if (var46 == 0) {
                        field3677.method28((float) this.field3670[var45] * var44, 10894);
                        field3677.method28((float) this.field3662[var45] * var44, 10894);
                        field3677.method28((float) this.field3674[var45] * var44, 10894);
                    } else {
                        float var47 = var43 / (float) var46;
                        field3677.method28((float) this.field3670[var45] * var47, 10894);
                        field3677.method28((float) this.field3662[var45] * var47, 10894);
                        field3677.method28((float) this.field3674[var45] * var47, 10894);
                    }
                    field3677.field44 += var6 - 12;
                }
            } else {
                for (int var48 = 0; var48 < this.field3647; var48++) {
                    short var49 = this.field3654[var48];
                    if (var49 == 0) {
                        field3677.method44(19679, (float) this.field3670[var48] * var44);
                        field3677.method44(19679, (float) this.field3662[var48] * var44);
                        field3677.method44(19679, (float) this.field3674[var48] * var44);
                    } else {
                        float var50 = var43 / (float) var49;
                        field3677.method44(19679, (float) this.field3670[var48] * var50);
                        field3677.method44(19679, (float) this.field3662[var48] * var50);
                        field3677.method44(19679, (float) this.field3674[var48] * var50);
                    }
                    field3677.field44 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field3677.field44 = this.field3655.field2234;
            if (class264.field4297) {
                for (int var51 = 0; var51 < this.field3647; var51++) {
                    field3677.method28(this.field3671[var51], 10894);
                    field3677.method28(this.field3673[var51], 10894);
                    field3677.field44 += var6 - 8;
                }
            } else {
                for (int var52 = 0; var52 < this.field3647; var52++) {
                    field3677.method44(19679, this.field3671[var52]);
                    field3677.method44(19679, this.field3673[var52]);
                    field3677.field44 += var6 - 8;
                }
            }
        }
        field3677.field44 = this.field3647 * var6;
        if (arg0) {
            if (class264.field4303) {
                ByteBuffer var53 = ByteBuffer.wrap(field3677.field101, 0, field3677.field44);
                if (this.field3648 == null) {
                    this.field3648 = new class40(true);
                    this.field3648.method315(var53);
                } else {
                    this.field3648.method317(var53);
                }
                if (arg1) {
                    this.field3665.field2226 = true;
                    this.field3665.field2221 = null;
                    this.field3665.field2230 = this.field3648;
                    this.field3665.field2222 = var6;
                }
                if (arg2) {
                    this.field3668.field2226 = true;
                    this.field3668.field2221 = null;
                    this.field3668.field2230 = this.field3648;
                    this.field3668.field2222 = var6;
                }
                if (arg3) {
                    this.field3650.field2226 = true;
                    this.field3650.field2221 = null;
                    this.field3650.field2230 = this.field3648;
                    this.field3650.field2222 = var6;
                }
                if (arg4) {
                    this.field3655.field2226 = true;
                    this.field3655.field2221 = null;
                    this.field3655.field2230 = this.field3648;
                    this.field3655.field2222 = var6;
                }
            } else {
                if (field3687 == null || field3687.capacity() < field3677.field44) {
                    field3687 = ByteBuffer.allocateDirect(var6 * 100 + field3677.field44);
                } else {
                    field3687.clear();
                }
                field3687.put(field3677.field101, 0, field3677.field44);
                field3687.flip();
                if (arg1) {
                    this.field3665.field2226 = true;
                    this.field3665.field2221 = field3687;
                    this.field3665.field2230 = null;
                    this.field3665.field2222 = var6;
                }
                if (arg2) {
                    this.field3668.field2226 = true;
                    this.field3668.field2221 = field3687;
                    this.field3665.field2230 = null;
                    this.field3668.field2222 = var6;
                }
                if (arg3) {
                    this.field3650.field2226 = true;
                    this.field3650.field2221 = field3687;
                    this.field3650.field2230 = null;
                    this.field3650.field2222 = var6;
                }
                if (arg4) {
                    this.field3655.field2226 = true;
                    this.field3655.field2221 = field3687;
                    this.field3655.field2230 = null;
                    this.field3655.field2222 = var6;
                }
            }
        } else if (class264.field4314) {
            class40 var54 = new class40();
            ByteBuffer var55 = ByteBuffer.wrap(field3677.field101, 0, field3677.field44);
            var54.method315(var55);
            if (arg1) {
                this.field3665.field2226 = true;
                this.field3665.field2221 = null;
                this.field3665.field2230 = var54;
                this.field3665.field2222 = var6;
            }
            if (arg2) {
                this.field3668.field2226 = true;
                this.field3668.field2221 = null;
                this.field3668.field2230 = var54;
                this.field3668.field2222 = var6;
            }
            if (arg3) {
                this.field3650.field2226 = true;
                this.field3650.field2221 = null;
                this.field3650.field2230 = var54;
                this.field3650.field2222 = var6;
            }
            if (arg4) {
                this.field3655.field2226 = true;
                this.field3655.field2221 = null;
                this.field3655.field2230 = var54;
                this.field3655.field2222 = var6;
            }
        } else {
            ByteBuffer var56 = ByteBuffer.allocateDirect(field3677.field44);
            var56.put(field3677.field101, 0, field3677.field44);
            var56.flip();
            if (arg1) {
                this.field3665.field2226 = true;
                this.field3665.field2221 = var56;
                this.field3665.field2230 = null;
                this.field3665.field2222 = var6;
            }
            if (arg2) {
                this.field3668.field2226 = true;
                this.field3668.field2221 = var56;
                this.field3665.field2230 = null;
                this.field3668.field2222 = var6;
            }
            if (arg3) {
                this.field3650.field2226 = true;
                this.field3650.field2221 = var56;
                this.field3650.field2230 = null;
                this.field3650.field2222 = var6;
            }
            if (arg4) {
                this.field3655.field2226 = true;
                this.field3655.field2221 = var56;
                this.field3655.field2230 = null;
                this.field3655.field2222 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII[FIF)V", line = 2539)
    private static final void method1476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3694 = var16;
        field3697 = var17;
    }

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "()V", line = 2584)
    private final void method1477() {
        if (field3677.field101.length < this.field3647 * 12) {
            field3677 = new class3((this.field3647 + 100) * 12);
        } else {
            field3677.field44 = 0;
        }
        if (class264.field4297) {
            for (int var1 = 0; var1 < this.field3669; var1++) {
                field3677.method26(this.field3658[var1], 93);
                field3677.method26(this.field3680[var1], 90);
                field3677.method26(this.field3657[var1], 47);
            }
        } else {
            for (int var2 = 0; var2 < this.field3669; var2++) {
                field3677.method38(true, this.field3658[var2]);
                field3677.method38(true, this.field3680[var2]);
                field3677.method38(true, this.field3657[var2]);
            }
        }
        if (!class264.field4314) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field3677.field44);
            var5.put(field3677.field101, 0, field3677.field44);
            var5.flip();
            this.field3682.field2226 = true;
            this.field3682.field2221 = var5;
            this.field3682.field2230 = null;
            return;
        }
        class40 var3 = new class40();
        ByteBuffer var4 = ByteBuffer.wrap(field3677.field101, 0, field3677.field44);
        var3.method315(var4);
        this.field3682.field2226 = true;
        this.field3682.field2221 = null;
        this.field3682.field2230 = var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZZZZZZZZZZ)Luh;", line = 2646)
    public final class228 method1478(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class228 var12 = new class228();
        var12.field3644 = this.field3644;
        var12.field3647 = this.field3647;
        var12.field3669 = this.field3669;
        if (arg0) {
            var12.field3672 = this.field3672;
            var12.field3667 = this.field3667;
        } else {
            var12.field3672 = class216.method1358(3, this.field3672);
            var12.field3667 = class216.method1358(3, this.field3667);
        }
        if (arg1) {
            var12.field3659 = this.field3659;
        } else {
            var12.field3659 = class216.method1358(3, this.field3659);
        }
        if (arg0 && arg1) {
            var12.field3665 = this.field3665;
            var12.field3663 = this.field3663;
        } else {
            var12.field3665 = new class139();
            var12.field3663 = new class16();
        }
        if (arg2) {
            var12.field3666 = this.field3666;
        } else {
            var12.field3666 = class58.method431(113, this.field3666);
        }
        if (arg3) {
            var12.field3684 = this.field3684;
        } else {
            var12.field3684 = class199.method1273(this.field3684, 22373);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class6.field146) {
            var12.field3668 = new class139();
        } else {
            var12.field3668 = this.field3668;
        }
        if (arg5) {
            var12.field3670 = this.field3670;
            var12.field3662 = this.field3662;
            var12.field3674 = this.field3674;
            var12.field3654 = this.field3654;
        } else {
            var12.field3670 = class58.method431(108, this.field3670);
            var12.field3662 = class58.method431(125, this.field3662);
            var12.field3674 = class58.method431(98, this.field3674);
            var12.field3654 = class58.method431(113, this.field3654);
        }
        if (arg5 && arg6 && arg7) {
            var12.field3650 = this.field3650;
        } else {
            var12.field3650 = new class139();
        }
        if (arg8) {
            var12.field3671 = this.field3671;
            var12.field3673 = this.field3673;
            var12.field3655 = this.field3655;
        } else {
            var12.field3671 = class171.method1082(-125, this.field3671);
            var12.field3673 = class171.method1082(96, this.field3673);
            var12.field3655 = new class139();
        }
        if (arg9) {
            var12.field3658 = this.field3658;
            var12.field3680 = this.field3680;
            var12.field3657 = this.field3657;
            var12.field3682 = this.field3682;
        } else {
            var12.field3658 = class58.method431(105, this.field3658);
            var12.field3680 = class58.method431(107, this.field3680);
            var12.field3657 = class58.method431(99, this.field3657);
            var12.field3682 = new class139();
        }
        if (arg10) {
            var12.field3664 = this.field3664;
        } else {
            var12.field3664 = class58.method431(125, this.field3664);
        }
        var12.field3651 = this.field3651;
        var12.field3649 = this.field3649;
        var12.field3643 = this.field3643;
        var12.field3675 = this.field3675;
        var12.field3686 = this.field3686;
        var12.field3676 = this.field3676;
        var12.field3645 = this.field3645;
        var12.field3678 = this.field3678;
        var12.field3685 = this.field3685;
        return var12;
    }

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "()I", line = 2776)
    public final int method1479() {
        return this.field3678;
    }

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "()V", line = 2780)
    private final void method1480() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field3644; var9++) {
            int var10 = this.field3672[var9];
            int var11 = this.field3659[var9];
            int var12 = this.field3667[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field3663.field235 = (short) var1;
        this.field3663.field238 = (short) var4;
        this.field3663.field237 = (short) var2;
        this.field3663.field236 = (short) var5;
        this.field3663.field233 = (short) var3;
        this.field3663.field234 = (short) var6;
        this.field3663.field232 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field3663.field231 = true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lvc;IIIZ)V", line = 2850)
    public final void method1481(class293 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class228 var6 = (class228) arg0;
        if (this.field3669 == 0 || var6.field3669 == 0) {
            return;
        }
        int var7 = var6.field3644;
        int[] var8 = var6.field3672;
        int[] var9 = var6.field3659;
        int[] var10 = var6.field3667;
        short[] var11 = var6.field3670;
        short[] var12 = var6.field3662;
        short[] var13 = var6.field3674;
        short[] var14 = var6.field3654;
        short[] var15 = var6.field3652;
        short[] var16 = var6.field3679;
        short[] var17 = var6.field3656;
        short[] var18 = var6.field3661;
        int[] var19 = var6.field3645;
        short[] var20 = var6.field3676;
        if (!var6.field3663.field231) {
            var6.method1480();
        }
        short var21 = var6.field3663.field237;
        short var22 = var6.field3663.field236;
        short var23 = var6.field3663.field235;
        short var24 = var6.field3663.field238;
        short var25 = var6.field3663.field233;
        short var26 = var6.field3663.field234;
        for (int var27 = 0; var27 < this.field3644; var27++) {
            int var28 = this.field3659[var27] - arg2;
            if (var28 >= var21 && var28 <= var22) {
                int var29 = this.field3672[var27] - arg1;
                if (var29 >= var23 && var29 <= var24) {
                    int var30 = this.field3667[var27] - arg3;
                    if (var30 >= var25 && var30 <= var26) {
                        int var31 = -1;
                        int var32 = this.field3645[var27];
                        int var33 = this.field3645[var27 + 1];
                        for (int var34 = var32; var34 < var33; var34++) {
                            var31 = this.field3676[var34] - 1;
                            if (var31 == -1 || this.field3654[var31] != 0) {
                                break;
                            }
                        }
                        if (var31 != -1) {
                            for (int var35 = 0; var35 < var7; var35++) {
                                if (var8[var35] == var29 && var10[var35] == var30 && var9[var35] == var28) {
                                    int var36 = -1;
                                    int var37 = var19[var35];
                                    int var38 = var19[var35 + 1];
                                    for (int var39 = var37; var39 < var38; var39++) {
                                        var36 = var20[var39] - 1;
                                        if (var36 == -1 || var14[var36] != 0) {
                                            break;
                                        }
                                    }
                                    if (var36 != -1) {
                                        if (this.field3652 == null) {
                                            this.field3652 = class58.method431(105, this.field3670);
                                            this.field3679 = class58.method431(106, this.field3662);
                                            this.field3656 = class58.method431(125, this.field3674);
                                            this.field3661 = class58.method431(127, this.field3654);
                                        }
                                        if (var15 == null) {
                                            var15 = var6.field3652 = class58.method431(97, var11);
                                            var16 = var6.field3679 = class58.method431(117, var12);
                                            var17 = var6.field3656 = class58.method431(121, var13);
                                            var18 = var6.field3661 = class58.method431(107, var14);
                                        }
                                        short var40 = this.field3670[var31];
                                        short var41 = this.field3662[var31];
                                        short var42 = this.field3674[var31];
                                        short var43 = this.field3654[var31];
                                        int var44 = var19[var35];
                                        int var45 = var19[var35 + 1];
                                        for (int var46 = var44; var46 < var45; var46++) {
                                            int var47 = var20[var46] - 1;
                                            if (var47 == -1) {
                                                break;
                                            }
                                            if (var18[var47] != 0) {
                                                var15[var47] += var40;
                                                var16[var47] += var41;
                                                var17[var47] += var42;
                                                var18[var47] += var43;
                                            }
                                        }
                                        short var48 = var11[var36];
                                        short var49 = var12[var36];
                                        short var50 = var13[var36];
                                        short var51 = var14[var36];
                                        int var52 = this.field3645[var27];
                                        int var53 = this.field3645[var27 + 1];
                                        for (int var54 = var52; var54 < var53; var54++) {
                                            int var55 = this.field3676[var54] - 1;
                                            if (var55 == -1) {
                                                break;
                                            }
                                            if (this.field3661[var55] != 0) {
                                                this.field3652[var55] += var48;
                                                this.field3679[var55] += var49;
                                                this.field3656[var55] += var50;
                                                this.field3661[var55] += var51;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(SS)V", line = 3056)
    public final void method1482(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3669; var3++) {
            if (this.field3664[var3] == arg0) {
                this.field3664[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class284.field4692.method124(arg0 & 0xFFFF, (byte) 75);
            var5 = class284.field4692.method128(arg0 & 0xFFFF, (byte) 91);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class284.field4692.method124(arg1 & 0xFFFF, (byte) 75);
            var7 = class284.field4692.method128(arg1 & 0xFFFF, (byte) 115);
        }
        if (var4 != var6 || var5 != var7) {
            this.field3668.field2226 = false;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 3092)
    public final void method203(int arg0) {
        int var2 = class284.field4698[arg0];
        int var3 = class284.field4699[arg0];
        for (int var4 = 0; var4 < this.field3644; var4++) {
            int var5 = this.field3672[var4] * var3 + this.field3659[var4] * var2 >> 16;
            this.field3659[var4] = this.field3659[var4] * var3 - this.field3672[var4] * var2 >> 16;
            this.field3672[var4] = var5;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZ)Lec;", line = 3111)
    public final class28 method217(boolean arg0, boolean arg1) {
        return this.method1469(arg0, arg1, field3688, field3683);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(III)V", line = 3118)
    public final void method206(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3644; var4++) {
            this.field3672[var4] = this.field3672[var4] * arg0 >> 7;
            this.field3659[var4] = this.field3659[var4] * arg1 >> 7;
            this.field3667[var4] = this.field3667[var4] * arg2 >> 7;
        }
        this.field3663.field231 = false;
        this.field3665.field2226 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(FFF)I", line = 3135)
    private static final int method1483(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3177)
    private static final void method1484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field3691 = var16;
        field3700 = var17;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[IIIIZ)V", line = 3225)
    private final void method1485(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field3696 = 0;
            field3695 = 0;
            field3701 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field3649.length) {
                    int[] var14 = this.field3649[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field3696 += this.field3672[var16];
                        field3695 += this.field3659[var16];
                        field3701 += this.field3667[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field3696 = field3696 / var11 + var8;
                field3695 = field3695 / var11 + var9;
                field3701 = field3701 / var11 + var10;
            } else {
                field3696 = var8;
                field3695 = var9;
                field3701 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field3649.length) {
                    int[] var22 = this.field3649[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field3672[var24] += var17;
                        this.field3659[var24] += var18;
                        this.field3667[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field3649.length) {
                    int[] var27 = this.field3649[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field3672[var29] -= field3696;
                        this.field3659[var29] -= field3695;
                        this.field3667[var29] -= field3701;
                        if (arg4 != 0) {
                            int var30 = class284.field4698[arg4];
                            int var31 = class284.field4699[arg4];
                            int var32 = this.field3672[var29] * var31 + this.field3659[var29] * var30 + 32767 >> 16;
                            this.field3659[var29] = this.field3659[var29] * var31 + 32767 - this.field3672[var29] * var30 >> 16;
                            this.field3672[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class284.field4698[arg2];
                            int var34 = class284.field4699[arg2];
                            int var35 = this.field3659[var29] * var34 + 32767 - this.field3667[var29] * var33 >> 16;
                            this.field3667[var29] = this.field3667[var29] * var34 + this.field3659[var29] * var33 + 32767 >> 16;
                            this.field3659[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class284.field4698[arg3];
                            int var37 = class284.field4699[arg3];
                            int var38 = this.field3672[var29] * var37 + this.field3667[var29] * var36 + 32767 >> 16;
                            this.field3667[var29] = this.field3667[var29] * var37 + 32767 - this.field3672[var29] * var36 >> 16;
                            this.field3672[var29] = var38;
                        }
                        this.field3672[var29] += field3696;
                        this.field3659[var29] += field3695;
                        this.field3667[var29] += field3701;
                    }
                }
            }
            if (arg5) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field3649.length) {
                        int[] var41 = this.field3649[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field3645[var43];
                            int var45 = this.field3645[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field3676[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class284.field4698[arg4];
                                    int var49 = class284.field4699[arg4];
                                    int var50 = this.field3670[var47] * var49 + this.field3662[var47] * var48 + 32767 >> 16;
                                    this.field3662[var47] = (short) (this.field3662[var47] * var49 + 32767 - this.field3670[var47] * var48 >> 16);
                                    this.field3670[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class284.field4698[arg2];
                                    int var52 = class284.field4699[arg2];
                                    int var53 = this.field3662[var47] * var52 + 32767 - this.field3674[var47] * var51 >> 16;
                                    this.field3674[var47] = (short) (this.field3674[var47] * var52 + this.field3662[var47] * var51 + 32767 >> 16);
                                    this.field3662[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class284.field4698[arg3];
                                    int var55 = class284.field4699[arg3];
                                    int var56 = this.field3674[var47] * var54 + this.field3670[var47] * var55 + 32767 >> 16;
                                    this.field3674[var47] = (short) (this.field3674[var47] * var55 + 32767 - this.field3670[var47] * var54 >> 16);
                                    this.field3670[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                this.field3650.field2226 = false;
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field3649.length) {
                    int[] var59 = this.field3649[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field3672[var61] -= field3696;
                        this.field3659[var61] -= field3695;
                        this.field3667[var61] -= field3701;
                        this.field3672[var61] = this.field3672[var61] * arg2 >> 7;
                        this.field3659[var61] = this.field3659[var61] * arg3 >> 7;
                        this.field3667[var61] = this.field3667[var61] * arg4 >> 7;
                        this.field3672[var61] += field3696;
                        this.field3659[var61] += field3695;
                        this.field3667[var61] += field3701;
                    }
                }
            }
        } else if (arg0 == 5 && this.field3675 != null && this.field3684 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field3675.length) {
                    int[] var64 = this.field3675[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field3684[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field3684[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field3668.field2226 = false;
                    }
                }
            }
        }
    }
}
