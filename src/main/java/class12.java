import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 extends class157 implements class27 {

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "La;")
    private class530 field184;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lc;")
    private class158 field183;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "[Lig;")
    public class203[] field182;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "[Lrn;")
    public class225[] field185;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
    public final native void method126();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lkn;II)V")
    public final void method127(class163 arg0, class631 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field184.method3041().method2878(this, arg0, null, arg2, arg3);
            return;
        }
        class530.field7423[5] = 0;
        this.field184.method3041().method2878(this, arg0, class530.field7423, arg2, arg3);
        arg1.field9236 = class530.field7423[0];
        arg1.field9235 = class530.field7423[1];
        arg1.field9237 = class530.field7423[2];
        arg1.field9234 = class530.field7423[3];
        arg1.field9233 = class530.field7423[4];
        arg1.field9232 = class530.field7423[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
    public final native int method128();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
    public final void method129(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
    public final native void method130(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()[Lrn;")
    public final class225[] method131() {
        return this.field185;
    }

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
    public final native void method132(int arg0);

    @OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
    public final native int method133();

    @OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
    public final native void method134(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
    public final native int method135();

    @OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public final native void method136(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
    public final native void method137(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
    public final native void method138(int arg0);

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
    public final native int method139();

    @OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
    public final native void method140(int arg0);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public final native void method141(int arg0);

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    public final native void method142(int arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILm;Z)Z")
    public final boolean method143(int arg0, int arg1, class163 arg2, boolean arg3) {
        return this.field184.method3041().method2884(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lma;Lma;IZZ)V")
    public final native void method144(class12 arg0, class12 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public final native void method145(int arg0, int arg1, class174 arg2, class174 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
    public final native boolean method146();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lr;IIIZ)V")
    public final void method147(class157 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field184.method3041().method2880(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
    public final native int method148();

    @OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lk;)Lk;")
    public final native class485 method149(class485 arg0);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
    public final native int method150();

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
    public final native int method151();

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class138.method926(this, -1);
        }
    }

    @OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
    public final native void method152(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILm;)V")
    public final void method153(int arg0, class163 arg1) {
        int var3 = arg0;
        if (this.field182 != null) {
            for (int var4 = 0; var4 < this.field182.length; var4++) {
                class203 var5 = this.field182[var4];
                var5.field2844 = class530.field7430[var3++];
                var5.field2846 = class530.field7430[var3++];
                var5.field2852 = class530.field7430[var3++];
                var5.field2848 = class530.field7430[var3++];
                var5.field2840 = class530.field7430[var3++];
                var5.field2851 = class530.field7430[var3++];
                var5.field2833 = class530.field7430[var3++];
                var5.field2849 = class530.field7430[var3++];
                var5.field2847 = class530.field7430[var3++];
            }
        }
        if (this.field185 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field185.length; var6++) {
            class225 var7 = this.field185[var6];
            class225 var8 = var7;
            if (var7.field3224 != null) {
                var8 = var7.field3224;
            }
            if (var7.field3228 == null) {
                var7.field3228 = arg1.method1050();
            } else {
                var7.field3228.method1049(arg1);
            }
            var8.field3223 = class530.field7430[var3++];
            var8.field3225 = class530.field7430[var3++];
            var8.field3220 = class530.field7430[var3++];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lkn;I)V")
    public final void method154(class163 arg0, class631 arg1, int arg2) {
        if (arg1 == null) {
            this.field184.method3041().method2888(this, arg0, null, arg2);
            return;
        }
        class530.field7423[5] = 0;
        this.field184.method3041().method2888(this, arg0, class530.field7423, arg2);
        arg1.field9236 = class530.field7423[0];
        arg1.field9235 = class530.field7423[1];
        arg1.field9237 = class530.field7423[2];
        arg1.field9234 = class530.field7423[3];
        arg1.field9233 = class530.field7423[4];
        arg1.field9232 = class530.field7423[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
    public final native void method155(int arg0);

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()V")
    public final void method156() {
    }

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
    public final native void method157();

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
    public final native void method158(int arg0);

    @OriginalMember(owner = "client!ma", name = "XA", descriptor = "(La;Lc;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method159(class530 arg0, class158 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
    public final native int method160();

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()[Lig;")
    public final class203[] method161() {
        return this.field182;
    }

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
    public final native void method162(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lr;")
    public final class157 method163(byte arg0, int arg1, boolean arg2) {
        return this.field184.method3041().method2886(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(La;)V")
    private final native void method164(class530 arg0);

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
    public final native void method165(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
    public final native int method166();

    @OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
    public final native void method167(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
    public final native int method168();

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()Z")
    public final boolean method169() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;Lc;Lln;IIII)V")
    public class12(class530 arg0, class158 arg1, class317 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field184 = arg0;
        this.field183 = arg1;
        this.field182 = arg2.field4275;
        this.field185 = arg2.field4256;
        int var8 = arg2.field4275 == null ? 0 : arg2.field4275.length;
        int var9 = arg2.field4256 == null ? 0 : arg2.field4256.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field182[var12].field2836;
            var11[var10++] = this.field182[var12].field2839;
            var11[var10++] = this.field182[var12].field2843;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field185[var13].field3227;
        }
        int var14 = arg2.field4252 == null ? 0 : arg2.field4252.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class529 var20 = arg2.field4252[var17];
            class291 var21 = class208.method1376(var20.field7415, 102);
            var15[var16++] = var20.field7410;
            var15[var16++] = var21.field4013;
            var15[var16++] = var21.field4010;
            var15[var16++] = var21.field4004;
            var15[var16++] = var21.field4006;
            var15[var16++] = var21.field4012;
            var15[var16++] = var21.field4007 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class529 var19 = arg2.field4252[var18];
            var15[var16++] = var19.field7416;
        }
        this.method159(this.field184, this.field183, arg2.field4265, arg2.field4272, arg2.field4259, arg2.field4286, arg2.field4260, arg2.field4268, arg2.field4251, arg2.field4294, arg2.field4299, arg2.field4303, arg2.field4288, arg2.field4282, arg2.field4287, arg2.field4255, arg2.field4257, arg2.field4300, arg2.field4274, arg2.field4262, arg2.field4261, arg2.field4266, arg2.field4295, arg2.field4293, arg2.field4254, arg2.field4290, arg2.field4284, arg2.field4271, arg2.field4253, arg2.field4283, arg2.field4292, arg2.field4297, arg2.field4298, arg2.field4263, arg2.field4270, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;)V")
    public class12(class530 arg0) {
        this.field184 = arg0;
        this.field183 = null;
        this.method164(arg0);
    }
}
