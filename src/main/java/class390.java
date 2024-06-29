import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class390 extends class530 implements class242 {

    @OriginalMember(owner = "client!xa", name = "m", descriptor = "Lw;")
    private class454 field5976;

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "Lg;")
    private class96 field5979;

    @OriginalMember(owner = "client!xa", name = "o", descriptor = "[Lgh;")
    public class345[] field5978;

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "[Lhv;")
    public class150[] field5977;

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()V", line = 13)
    public final void method743() {
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILc;Z)Z", line = 32)
    public final boolean method776(int arg0, int arg1, class202 arg2, boolean arg3) {
        return this.field5976.method2725().method213(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!xa", name = "d", descriptor = "()[Lhv;", line = 37)
    public final class150[] method727() {
        return this.field5977;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Le;IIIZ)V", line = 43)
    public final void method772(class530 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5976.method2725().method222(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILc;)V", line = 48)
    public final void method2439(int arg0, class202 arg1) {
        int var3 = arg0;
        if (this.field5978 != null) {
            for (int var4 = 0; var4 < this.field5978.length; var4++) {
                class345 var5 = this.field5978[var4];
                var5.field5411 = class454.field6778[var3++];
                var5.field5424 = class454.field6778[var3++];
                var5.field5405 = class454.field6778[var3++];
                var5.field5416 = class454.field6778[var3++];
                var5.field5423 = class454.field6778[var3++];
                var5.field5421 = class454.field6778[var3++];
                var5.field5409 = class454.field6778[var3++];
                var5.field5412 = class454.field6778[var3++];
                var5.field5425 = class454.field6778[var3++];
            }
        }
        if (this.field5977 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5977.length; var6++) {
            class150 var7 = this.field5977[var6];
            class150 var8 = var7;
            if (var7.field2408 != null) {
                var8 = var7.field2408;
            }
            if (var7.field2412 == null) {
                var7.field2412 = arg1.method1242();
            } else {
                var7.field2412.method1241(arg1);
            }
            var8.field2410 = class454.field6778[var3++];
            var8.field2413 = class454.field6778[var3++];
            var8.field2415 = class454.field6778[var3++];
        }
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Ltq;II)V", line = 103)
    public final void method738(class202 arg0, class273 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field5976.method2725().method220(this, arg0, null, arg2, arg3);
            return;
        }
        class454.field6772[5] = 0;
        this.field5976.method2725().method220(this, arg0, class454.field6772, arg2, arg3);
        arg1.field4517 = class454.field6772[0];
        arg1.field4516 = class454.field6772[1];
        arg1.field4521 = class454.field6772[2];
        arg1.field4518 = class454.field6772[3];
        arg1.field4519 = class454.field6772[4];
        arg1.field4520 = class454.field6772[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Ltq;I)V", line = 121)
    public final void method736(class202 arg0, class273 arg1, int arg2) {
        if (arg1 == null) {
            this.field5976.method2725().method219(this, arg0, null, arg2);
            return;
        }
        class454.field6772[5] = 0;
        this.field5976.method2725().method219(this, arg0, class454.field6772, arg2);
        arg1.field4517 = class454.field6772[0];
        arg1.field4516 = class454.field6772[1];
        arg1.field4521 = class454.field6772[2];
        arg1.field4518 = class454.field6772[3];
        arg1.field4519 = class454.field6772[4];
        arg1.field4520 = class454.field6772[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 142)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class248.method1686(false, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;Lg;Lko;IIII)V", line = 147)
    public class390(class454 arg0, class96 arg1, class227 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5976 = arg0;
        this.field5979 = arg1;
        this.field5978 = arg2.field3962;
        this.field5977 = arg2.field3945;
        int var8 = arg2.field3962 == null ? 0 : arg2.field3962.length;
        int var9 = arg2.field3945 == null ? 0 : arg2.field3945.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field5978[var12].field5426;
            var11[var10++] = this.field5978[var12].field5407;
            var11[var10++] = this.field5978[var12].field5414;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field5977[var13].field2407;
        }
        int var14 = arg2.field3972 == null ? 0 : arg2.field3972.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class455 var20 = arg2.field3972[var17];
            class462 var21 = class533.method3164(127, var20.field6799);
            var15[var16++] = var20.field6797;
            var15[var16++] = var21.field6860;
            var15[var16++] = var21.field6870;
            var15[var16++] = var21.field6867;
            var15[var16++] = var21.field6865;
            var15[var16++] = var21.field6861;
            var15[var16++] = var21.field6866 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class455 var19 = arg2.field3972[var18];
            var15[var16++] = var19.field6795;
        }
        this.method2436(this.field5976, this.field5979, arg2.field3952, arg2.field3956, arg2.field3969, arg2.field3946, arg2.field3965, arg2.field3955, arg2.field3967, arg2.field3964, arg2.field3942, arg2.field3966, arg2.field3949, arg2.field3931, arg2.field3943, arg2.field3938, arg2.field3920, arg2.field3923, arg2.field3939, arg2.field3960, arg2.field3922, arg2.field3929, arg2.field3950, arg2.field3951, arg2.field3961, arg2.field3954, arg2.field3940, arg2.field3963, arg2.field3958, arg2.field3925, arg2.field3947, arg2.field3948, arg2.field3941, arg2.field3921, arg2.field3973, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;)V", line = 218)
    public class390(class454 arg0) {
        this.field5976 = arg0;
        this.field5979 = null;
        this.method2437(arg0);
    }

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()Z", line = 226)
    public final boolean method729() {
        return true;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V", line = 228)
    public final void method755(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Le;", line = 231)
    public final class530 method739(byte arg0, int arg1, boolean arg2) {
        return this.field5976.method2725().method226(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!xa", name = "c", descriptor = "()[Lgh;", line = 234)
    public final class345[] method777() {
        return this.field5978;
    }

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Li;)Li;")
    public final native class515 method774(class515 arg0);

    @OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
    public final native void method744(int arg0);

    @OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lw;Lg;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2436(class454 arg0, class96 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
    public final native void method224();

    @OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
    public final native void method746(int arg0);

    @OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
    public final native void method763(int arg0);

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
    public final native void method764();

    @OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
    public final native void method730();

    @OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
    public final native void method765(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
    public final native int method745();

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
    public final native void method768(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
    public final native boolean method775();

    @OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
    public final native int method752();

    @OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
    public final native int method735();

    @OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
    public final native int method726();

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
    public final native void method762(int arg0);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
    public final native void method773(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
    public final native void method732(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lw;)V")
    private final native void method2437(class454 arg0);

    @OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
    public final native int method749();

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
    public final native void method734(int arg0);

    @OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
    public final native int method751();

    @OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
    public final native int method741();

    @OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILya;Lya;III)V")
    public final native void method767(int arg0, int arg1, class220 arg2, class220 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lxa;Lxa;IZZ)V")
    public final native void method2438(class390 arg0, class390 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
    public final native int method766();

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
    public final native void method728(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
    public final native void method761(int arg0);

    @OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
    public final native void method756(int arg0);

    @OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
    public final native int method760();

    @OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
    public final native void method733(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final native void method748(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
    public final native int method769();
}
