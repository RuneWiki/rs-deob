import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class152 {

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "F")
    public float field182;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "F")
    public float field186;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "F")
    public float field187;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "F")
    public float field190;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "F")
    public float field191;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "F")
    public float field192;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "F")
    public float field203;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "F")
    public float field204;

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "F")
    public float field211;

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "F")
    public float field214;

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "F")
    public float field215;

    @OriginalMember(owner = "client!ds", name = "bb", descriptor = "F")
    public float field229;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ds", name = "O", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ds", name = "P", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ds", name = "Q", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ds", name = "R", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ds", name = "S", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ds", name = "T", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ds", name = "U", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ds", name = "V", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ds", name = "X", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ds", name = "Y", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ds", name = "Z", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ds", name = "ab", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ds", name = "cb", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ds", name = "db", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ds", name = "eb", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ds", name = "W", descriptor = "Lrw;")
    public static class485 field224;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "(I)V")
    public final void method152(int arg0) {
        field231++;
        float var2 = class355.field4975[arg0 & 0x3FFF];
        float var3 = class355.field4977[arg0 & 0x3FFF];
        float var4 = this.field214;
        float var5 = this.field186;
        float var6 = this.field204;
        float var7 = this.field215;
        this.field214 = var2 * var4 - this.field182 * var3;
        this.field182 = this.field182 * var2 + var3 * var4;
        this.field186 = var2 * var5 - (this.field191 * var3);
        this.field204 = var2 * var6 - this.field229 * var3;
        this.field191 = this.field191 * var2 + var3 * var5;
        this.field215 = var2 * var7 - (this.field187 * var3);
        this.field229 = this.field229 * var2 + var3 * var6;
        this.field187 = this.field187 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ds", name = "na", descriptor = "(IIIIII)V")
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field184++;
        float var7 = class355.field4975[arg3 & 0x3FFF];
        float var8 = class355.field4977[arg3 & 0x3FFF];
        float var9 = class355.field4975[arg4 & 0x3FFF];
        float var10 = class355.field4977[arg4 & 0x3FFF];
        float var11 = class355.field4975[arg5 & 0x3FFF];
        float var12 = class355.field4977[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field186 = var7 * var11;
        this.field182 = var7 * var10;
        this.field211 = -var10 * var11 + var9 * var14;
        this.field214 = -var9 * var12 + var10 * var13;
        this.field190 = var7 * var12;
        this.field204 = var9 * var13 + var10 * var12;
        this.field229 = var7 * var9;
        this.field192 = var9 * var11 + var10 * var14;
        this.field191 = -var8;
        this.field187 = (float) (-arg0) * this.field182 - (float) arg1 * this.field191 - (float) arg2 * this.field229;
        this.field215 = (float) (-arg0) * this.field214 - (float) arg1 * this.field186 - ((float) arg2 * this.field204);
        this.field203 = (float) (-arg0) * this.field192 - ((float) arg1 * this.field190) - ((float) arg2 * this.field211);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([FI)[F")
    public final float[] method154(float[] arg0, int arg1) {
        arg0[11] = this.field187;
        arg0[9] = this.field191;
        arg0[2] = this.field211;
        arg0[14] = 0.0F;
        arg0[6] = this.field204;
        arg0[10] = this.field229;
        arg0[12] = 0.0F;
        arg0[15] = 1.0F;
        arg0[4] = this.field214;
        arg0[5] = this.field186;
        arg0[13] = 0.0F;
        arg0[8] = this.field182;
        arg0[7] = this.field215;
        field232++;
        arg0[3] = this.field203;
        arg0[1] = this.field190;
        if (arg1 != 19749) {
            this.method167();
        }
        arg0[0] = this.field192;
        return arg0;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V")
    public static void method155(int arg0) {
        field224 = null;
        if (arg0 > -18) {
            field224 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "YA", descriptor = "([I)V")
    public final void method156(int[] arg0) {
        field219++;
        float var2 = (float) arg0[0] - this.field203;
        float var3 = (float) arg0[1] - this.field215;
        float var4 = (float) arg0[2] - this.field187;
        arg0[0] = (int) (this.field182 * var4 + this.field214 * var3 + this.field192 * var2);
        arg0[1] = (int) (this.field191 * var4 + this.field190 * var2 + this.field186 * var3);
        arg0[2] = (int) (this.field229 * var4 + this.field211 * var2 + this.field204 * var3);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[F)[F")
    public final float[] method157(int arg0, float[] arg1) {
        arg1[1] = this.field190;
        if (arg0 > -117) {
            return null;
        }
        arg1[0] = this.field192;
        arg1[6] = this.field204;
        arg1[2] = this.field211;
        arg1[3] = this.field203;
        arg1[4] = this.field214;
        arg1[5] = this.field186;
        field188++;
        arg1[7] = this.field215;
        return arg1;
    }

    @OriginalMember(owner = "client!ds", name = "U", descriptor = "(III)V")
    public final void method158(int arg0, int arg1, int arg2) {
        this.field215 += arg1;
        this.field187 += arg2;
        this.field203 += arg0;
        field223++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lq;Z)V")
    public final void method159(class152 arg0, boolean arg1) {
        field210++;
        class14 var3 = (class14) arg0;
        this.field182 = var3.field182;
        this.field204 = var3.field204;
        this.field192 = var3.field192;
        if (!arg1) {
            return;
        }
        this.field190 = var3.field190;
        this.field203 = 0.0F;
        this.field229 = var3.field229;
        this.field211 = var3.field211;
        this.field214 = var3.field214;
        this.field186 = var3.field186;
        this.field215 = 0.0F;
        this.field191 = var3.field191;
        this.field187 = 0.0F;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(FIFF)F")
    public final float method160(float arg0, int arg1, float arg2, float arg3) {
        field199++;
        if (arg1 != 0) {
            this.method184(null, -71);
        }
        return this.field229 * arg0 + this.field191 * arg2 + this.field182 * arg3 + this.field187;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFFZ)V")
    public final void method161(float arg0, float arg1, float arg2, boolean arg3) {
        this.field191 *= arg0;
        this.field186 *= arg2;
        this.field229 *= arg0;
        this.field190 *= arg1;
        this.field187 *= arg0;
        if (!arg3) {
            this.field214 = 0.55879164F;
        }
        this.field182 *= arg0;
        this.field214 *= arg2;
        this.field203 *= arg1;
        field196++;
        this.field215 *= arg2;
        this.field192 *= arg1;
        this.field211 *= arg1;
        this.field204 *= arg2;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(F[FFFB)V")
    public final void method162(float arg0, float[] arg1, float arg2, float arg3, byte arg4) {
        field181++;
        arg1[0] = this.field211 * arg3 + this.field192 * arg2 + this.field190 * arg0;
        arg1[2] = this.field229 * arg3 + this.field191 * arg0 + this.field182 * arg2;
        arg1[1] = this.field204 * arg3 + this.field214 * arg2 + this.field186 * arg0;
        int var6 = 70 / ((-arg4 - 66) / 48);
    }

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "(Lq;)V")
    public final void method163(class152 arg0) {
        field183++;
        class14 var2 = (class14) arg0;
        this.field229 = var2.field229;
        this.field190 = var2.field190;
        this.field203 = var2.field203;
        this.field211 = var2.field211;
        this.field187 = var2.field187;
        this.field192 = var2.field192;
        this.field191 = var2.field191;
        this.field215 = var2.field215;
        this.field204 = var2.field204;
        this.field214 = var2.field214;
        this.field186 = var2.field186;
        this.field182 = var2.field182;
    }

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "(I)V")
    public final void method164(int arg0) {
        this.field229 = 1.0F;
        field200++;
        this.field192 = this.field186 = class355.field4975[arg0 & 0x3FFF];
        this.field214 = class355.field4977[arg0 & 0x3FFF];
        this.field211 = this.field203 = this.field204 = this.field215 = this.field182 = this.field191 = this.field187 = 0.0F;
        this.field190 = -this.field214;
    }

    @OriginalMember(owner = "client!ds", name = "oa", descriptor = "(I)V")
    public final void method165(int arg0) {
        field201++;
        this.field192 = 1.0F;
        this.field186 = this.field229 = class355.field4975[arg0 & 0x3FFF];
        this.field191 = class355.field4977[arg0 & 0x3FFF];
        this.field204 = -this.field191;
        this.field190 = this.field211 = this.field203 = this.field214 = this.field215 = this.field182 = this.field187 = 0.0F;
    }

    @OriginalMember(owner = "client!ds", name = "NA", descriptor = "(III)V")
    public final void method166(int arg0, int arg1, int arg2) {
        this.field215 = arg1;
        this.field187 = arg2;
        this.field192 = this.field186 = this.field229 = 1.0F;
        field197++;
        this.field214 = this.field182 = this.field190 = this.field191 = this.field211 = this.field204 = 0.0F;
        this.field203 = arg0;
    }

    @OriginalMember(owner = "client!ds", name = "Y", descriptor = "()V")
    public final void method167() {
        field209++;
        this.field192 = this.field186 = this.field229 = 1.0F;
        this.field214 = this.field182 = this.field190 = this.field191 = this.field211 = this.field204 = this.field203 = this.field215 = this.field187 = 0.0F;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I[F)[F")
    public final float[] method168(int arg0, float[] arg1) {
        arg1[15] = 1.0F;
        arg1[6] = 0.0F;
        arg1[10] = this.field187;
        arg1[4] = this.field190;
        arg1[0] = this.field192;
        arg1[9] = this.field215;
        arg1[5] = this.field186;
        arg1[3] = 0.0F;
        arg1[7] = 0.0F;
        arg1[14] = 0.0F;
        arg1[13] = 0.0F;
        arg1[8] = this.field203;
        arg1[1] = this.field214;
        if (arg0 != -20908) {
            this.method159(null, true);
        }
        field206++;
        arg1[2] = 0.0F;
        arg1[12] = 0.0F;
        arg1[11] = 0.0F;
        return arg1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III[I)V")
    public final void method169(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field204 + (float) arg0 * this.field214 + (float) arg1 * this.field186 + this.field215);
        arg3[0] = (int) ((float) arg2 * this.field211 + (float) arg0 * this.field192 + (float) arg1 * this.field190 + this.field203);
        arg3[2] = (int) ((float) arg2 * this.field229 + (float) arg0 * this.field182 + (float) arg1 * this.field191 + this.field187);
        field205++;
    }

    @OriginalMember(owner = "client!ds", name = "ZA", descriptor = "(I)V")
    public final void method170(int arg0) {
        field208++;
        float var2 = class355.field4975[arg0 & 0x3FFF];
        float var3 = class355.field4977[arg0 & 0x3FFF];
        float var4 = this.field192;
        float var5 = this.field190;
        float var6 = this.field211;
        this.field192 = this.field182 * var3 + var2 * var4;
        float var7 = this.field203;
        this.field182 = this.field182 * var2 - var3 * var4;
        this.field190 = this.field191 * var3 + var2 * var5;
        this.field211 = this.field229 * var3 + var2 * var6;
        this.field191 = this.field191 * var2 - var3 * var5;
        this.field203 = this.field187 * var3 + var2 * var7;
        this.field229 = this.field229 * var2 - (var3 * var6);
        this.field187 = this.field187 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!ds", name = "AA", descriptor = "(I)V")
    public final void method171(int arg0) {
        field193++;
        float var2 = class355.field4975[arg0 & 0x3FFF];
        float var3 = class355.field4977[arg0 & 0x3FFF];
        float var4 = this.field192;
        float var5 = this.field190;
        float var6 = this.field211;
        float var7 = this.field203;
        this.field192 = var2 * var4 - this.field214 * var3;
        this.field214 = this.field214 * var2 + var3 * var4;
        this.field190 = var2 * var5 - (this.field186 * var3);
        this.field186 = this.field186 * var2 + var3 * var5;
        this.field211 = var2 * var6 - this.field204 * var3;
        this.field203 = var2 * var7 - (this.field215 * var3);
        this.field204 = this.field204 * var2 + var3 * var6;
        this.field215 = this.field215 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I[F)[F")
    public final float[] method172(int arg0, float[] arg1) {
        arg1[0] = this.field192;
        arg1[7] = 0.0F;
        arg1[6] = this.field204;
        arg1[10] = this.field229;
        arg1[1] = this.field190;
        field220++;
        arg1[12] = 0.0F;
        arg1[5] = this.field186;
        arg1[14] = 0.0F;
        arg1[3] = 0.0F;
        arg1[13] = 0.0F;
        arg1[8] = this.field182;
        arg1[arg0] = this.field211;
        arg1[11] = 0.0F;
        arg1[4] = this.field214;
        arg1[9] = this.field191;
        arg1[15] = 0.0F;
        return arg1;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)V")
    public final void method173(boolean arg0) {
        field225++;
        this.field229 = -this.field229;
        this.field182 = -this.field182;
        this.field214 = -this.field214;
        if (!arg0) {
            this.field215 = -1.03994F;
        }
        this.field186 = -this.field186;
        this.field204 = -this.field204;
        this.field187 = -this.field187;
        this.field191 = -this.field191;
        this.field215 = -this.field215;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZFFF)F")
    public final float method174(boolean arg0, float arg1, float arg2, float arg3) {
        if (arg0) {
            this.field204 = -0.72658956F;
        }
        field212++;
        return this.field204 * arg3 + this.field214 * arg2 + this.field186 * arg1 + this.field215;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(FBFF)V")
    public final void method175(float arg0, byte arg1, float arg2, float arg3) {
        this.field187 = arg2;
        if (arg1 <= 84) {
            return;
        }
        field228++;
        this.field203 = arg0;
        this.field215 = arg3;
        this.field192 = this.field186 = this.field229 = 1.0F;
        this.field214 = this.field182 = this.field190 = this.field191 = this.field211 = this.field204 = 0.0F;
    }

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "(I)V")
    public final void method176(int arg0) {
        this.field186 = 1.0F;
        field189++;
        this.field192 = this.field229 = class355.field4975[arg0 & 0x3FFF];
        this.field211 = class355.field4977[arg0 & 0x3FFF];
        this.field182 = -this.field211;
        this.field190 = this.field203 = this.field214 = this.field204 = this.field215 = this.field191 = this.field187 = 0.0F;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lq;Lq;)V")
    public final void method177(class152 arg0, class152 arg1) {
        field198++;
        class14 var3 = (class14) arg0;
        class14 var4 = (class14) arg1;
        this.field192 = var3.field211 * var4.field182 + var3.field192 * var4.field192 + var3.field190 * var4.field214;
        this.field214 = var3.field204 * var4.field182 + var3.field214 * var4.field192 + var3.field186 * var4.field214;
        this.field190 = var3.field211 * var4.field191 + var3.field192 * var4.field190 + var3.field190 * var4.field186;
        this.field182 = var3.field229 * var4.field182 + var3.field191 * var4.field214 + var3.field182 * var4.field192;
        this.field186 = var3.field204 * var4.field191 + var3.field214 * var4.field190 + var3.field186 * var4.field186;
        this.field191 = var3.field229 * var4.field191 + var3.field191 * var4.field186 + var3.field182 * var4.field190;
        this.field211 = var3.field211 * var4.field229 + var3.field192 * var4.field211 + var3.field190 * var4.field204;
        this.field204 = var3.field204 * var4.field229 + var3.field214 * var4.field211 + var3.field186 * var4.field204;
        this.field203 = var3.field211 * var4.field187 + var3.field192 * var4.field203 + var3.field190 * var4.field215 + var3.field203;
        this.field229 = var3.field229 * var4.field229 + var3.field191 * var4.field204 + var3.field182 * var4.field211;
        this.field215 = var3.field204 * var4.field187 + var3.field214 * var4.field203 + var3.field186 * var4.field215 + var3.field215;
        this.field187 = var3.field229 * var4.field187 + var3.field191 * var4.field215 + var3.field182 * var4.field203 + var3.field187;
    }

    @OriginalMember(owner = "client!ds", name = "BA", descriptor = "(III[I)V")
    public final void method178(int arg0, int arg1, int arg2, int[] arg3) {
        field213++;
        int var5 = (int) ((float) arg0 - this.field203);
        int var6 = (int) ((float) arg1 - this.field215);
        int var7 = (int) ((float) arg2 - this.field187);
        arg3[0] = (int) ((float) var7 * this.field182 + (float) var5 * this.field192 + (float) var6 * this.field214);
        arg3[1] = (int) ((float) var7 * this.field191 + (float) var5 * this.field190 + (float) var6 * this.field186);
        arg3[2] = (int) ((float) var7 * this.field229 + (float) var5 * this.field211 + (float) var6 * this.field204);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)V")
    public static final void method179(int arg0, byte arg1) {
        if (arg0 == 37) {
            class161.field2614 = 3.0F;
        } else if (arg0 == 50) {
            class161.field2614 = 4.0F;
        } else if (arg0 == 75) {
            class161.field2614 = 6.0F;
        } else if (arg0 == 100) {
            class161.field2614 = 8.0F;
        } else if (arg0 == 200) {
            class161.field2614 = 16.0F;
        }
        int var2 = 33 % ((arg1 + 6) / 63);
        field218++;
        class371.field5147 = -1;
        class371.field5147 = -1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "()Lq;")
    public final class152 method180() {
        field207++;
        class14 var1 = new class14();
        var1.field192 = this.field192;
        var1.field204 = this.field204;
        var1.field214 = this.field214;
        var1.field187 = this.field187;
        var1.field182 = this.field182;
        var1.field191 = this.field191;
        var1.field186 = this.field186;
        var1.field229 = this.field229;
        var1.field211 = this.field211;
        var1.field190 = this.field190;
        var1.field203 = this.field203;
        var1.field215 = this.field215;
        return var1;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "([FI)[F")
    public final float[] method181(float[] arg0, int arg1) {
        arg0[7] = 0.0F;
        arg0[6] = this.field191;
        arg0[8] = this.field211;
        arg0[10] = this.field229;
        arg0[14] = this.field187;
        if (arg1 != 10529) {
            this.method161(1.4780139F, -0.35925493F, -1.7985756F, false);
        }
        arg0[11] = 0.0F;
        arg0[2] = this.field182;
        arg0[5] = this.field186;
        arg0[3] = 0.0F;
        arg0[12] = this.field203;
        arg0[15] = 1.0F;
        arg0[4] = this.field190;
        arg0[1] = this.field214;
        arg0[9] = this.field204;
        arg0[13] = this.field215;
        arg0[0] = this.field192;
        field222++;
        return arg0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFBF)V")
    public final void method182(float arg0, float arg1, byte arg2, float arg3) {
        this.field187 += arg3;
        if (arg2 < 86) {
            field224 = null;
        }
        field216++;
        this.field215 += arg1;
        this.field203 += arg0;
    }

    @OriginalMember(owner = "client!ds", name = "wa", descriptor = "(III[I)V")
    public final void method183(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field229 + (float) arg0 * this.field182 + (float) arg1 * this.field191);
        field185++;
        arg3[0] = (int) ((float) arg2 * this.field211 + (float) arg0 * this.field192 + (float) arg1 * this.field190);
        arg3[1] = (int) ((float) arg2 * this.field204 + (float) arg0 * this.field214 + (float) arg1 * this.field186);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lq;I)V")
    public final void method184(class152 arg0, int arg1) {
        field230++;
        class14 var3 = (class14) arg0;
        this.field211 = var3.field182;
        this.field190 = var3.field214;
        this.field192 = var3.field192;
        this.field214 = var3.field190;
        this.field204 = var3.field191;
        if (arg1 != 7) {
            return;
        }
        this.field182 = var3.field211;
        this.field186 = var3.field186;
        this.field203 = -(this.field211 * var3.field187 + this.field192 * var3.field203 + this.field190 * var3.field215);
        this.field229 = var3.field229;
        this.field191 = var3.field204;
        this.field215 = -(this.field204 * var3.field187 + this.field214 * var3.field203 + this.field186 * var3.field215);
        this.field187 = -(this.field229 * var3.field187 + this.field191 * var3.field215 + this.field182 * var3.field203);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "([FFFFBF)V")
    public final void method185(float[] arg0, float arg1, float arg2, float arg3, byte arg4, float arg5) {
        field194++;
        int var7 = -48 / ((arg4 + 52) / 34);
        arg0[1] = this.field204 * arg3 + this.field214 * arg2 + this.field186 * arg1;
        float var9;
        float var10;
        float var11;
        if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var13 = -arg5 / arg2;
            var11 = this.field214 * var13 + this.field215;
            var9 = this.field192 * var13 + this.field203;
            var10 = this.field182 * var13 + this.field187;
        } else if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
            float var12 = -arg5 / arg1;
            var9 = this.field190 * var12 + this.field203;
            var10 = this.field191 * var12 + this.field187;
            var11 = this.field186 * var12 + this.field215;
        } else {
            float var8 = -arg5 / arg3;
            var9 = this.field211 * var8 + this.field203;
            var10 = this.field229 * var8 + this.field187;
            var11 = this.field204 * var8 + this.field215;
        }
        arg0[0] = this.field211 * arg3 + this.field192 * arg2 + this.field190 * arg1;
        arg0[2] = this.field229 * arg3 + this.field191 * arg1 + this.field182 * arg2;
        arg0[3] = -(arg0[2] * var10 + arg0[0] * var9 + arg0[1] * var11);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(FFFFFFFBFF)V")
    public final void method186(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, byte arg7, float arg8, float arg9) {
        this.field190 = arg0;
        this.field229 = arg4;
        this.field186 = arg8;
        this.field192 = arg5;
        this.field211 = arg9;
        this.field191 = arg6;
        this.field203 = 0.0F;
        if (arg7 != -82) {
            this.method170(27);
        }
        this.field215 = 0.0F;
        this.field187 = 0.0F;
        this.field182 = arg2;
        this.field214 = arg3;
        field226++;
        this.field204 = arg1;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IFIIBFF)V")
    public final void method187(int arg0, float arg1, int arg2, int arg3, byte arg4, float arg5, float arg6) {
        field217++;
        if (arg4 != 100) {
            this.method159(null, false);
        }
        if (arg2 == 0) {
            this.field187 = arg5;
            this.field215 = arg1 - (float) arg0;
            this.field214 = this.field182 = this.field190 = this.field191 = this.field211 = this.field204 = 0.0F;
            this.field203 = arg6 - (float) arg3;
            this.field192 = (arg3 * 2);
            this.field186 = (arg0 * 2);
            this.field229 = 1.0F;
            return;
        }
        float var8 = class355.field4975[arg2 & 0x3FFF];
        float var9 = class355.field4977[arg2 & 0x3FFF];
        this.field190 = var9 * -2.0F * (float) arg0;
        this.field192 = var8 * 2.0F * (float) arg3;
        this.field203 = (var9 * 0.5F - var8 * 0.5F) * (float) (arg3 * 2) + arg6;
        this.field215 = (var9 * -0.5F - var8 * 0.5F) * (float) (arg0 * 2) + arg1;
        this.field186 = var8 * 2.0F * (float) arg0;
        this.field182 = this.field191 = this.field211 = this.field204 = 0.0F;
        this.field214 = var9 * 2.0F * (float) arg3;
        this.field187 = arg5;
        this.field229 = 1.0F;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IFFF)F")
    public final float method188(int arg0, float arg1, float arg2, float arg3) {
        field202++;
        return arg0 == 1 ? this.field211 * arg2 + this.field192 * arg1 + this.field190 * arg3 + this.field203 : 0.33290344F;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public static final void method189(byte arg0) {
        field227++;
        if (class407.field5837) {
            return;
        }
        class407.field5837 = true;
        class406.field5822 = true;
        if (arg0 != -73) {
            method155(-115);
        }
        if (class525.field7713.field5977) {
            class636.field9031 = ((int) class636.field9031 + 47 & 0xFFFFFFF0);
        } else {
            class609.field8756 += (12.0F - class609.field8756) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(IFFF)V")
    public final void method190(int arg0, float arg1, float arg2, float arg3) {
        this.field204 = 0.0F;
        if (arg0 > -52) {
            this.field182 = -0.39939332F;
        }
        this.field191 = 0.0F;
        this.field214 = 0.0F;
        this.field182 = 0.0F;
        this.field203 = 0.0F;
        this.field229 = arg1;
        this.field190 = 0.0F;
        this.field186 = arg3;
        this.field187 = 0.0F;
        field221++;
        this.field211 = 0.0F;
        this.field215 = 0.0F;
        this.field192 = arg2;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
    public class14() {
        this.method167();
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Lq;I)V")
    public final void method191(class152 arg0, int arg1) {
        field195++;
        class14 var3 = (class14) arg0;
        float var4 = this.field192;
        float var5 = this.field214;
        float var6 = this.field190;
        float var7 = this.field186;
        float var8 = this.field211;
        float var9 = this.field204;
        if (arg1 != 8963) {
            this.field204 = -1.0268655F;
        }
        float var10 = this.field203;
        this.field192 = this.field182 * var3.field211 + var3.field192 * var4 + var3.field190 * var5;
        float var11 = this.field215;
        this.field214 = this.field182 * var3.field204 + var3.field214 * var4 + var3.field186 * var5;
        this.field186 = this.field191 * var3.field204 + var3.field214 * var6 + var3.field186 * var7;
        this.field190 = this.field191 * var3.field211 + var3.field192 * var6 + var3.field190 * var7;
        this.field182 = this.field182 * var3.field229 + var3.field191 * var5 + var3.field182 * var4;
        this.field211 = this.field229 * var3.field211 + var3.field192 * var8 + var3.field190 * var9;
        this.field204 = this.field229 * var3.field204 + var3.field214 * var8 + var3.field186 * var9;
        this.field191 = this.field191 * var3.field229 + var3.field191 * var7 + var3.field182 * var6;
        this.field215 = this.field187 * var3.field204 + var3.field214 * var10 + var3.field186 * var11 + var3.field215;
        this.field229 = this.field229 * var3.field229 + var3.field191 * var9 + var3.field182 * var8;
        this.field203 = this.field187 * var3.field211 + var3.field192 * var10 + var3.field190 * var11 + var3.field203;
        this.field187 = this.field187 * var3.field229 + var3.field191 * var11 + var3.field182 * var10 + var3.field187;
    }
}
