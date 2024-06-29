import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class537 extends class55 implements class200 {

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Ll;")
    private class18 field7257;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lm;")
    private class175 field7256;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[Lns;")
    public class369[] field7255;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[Llp;")
    public class357[] field7254;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method421(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Let;I)V")
    public final void method465(class392 arg0, class551 arg1, int arg2) {
        if (arg1 == null) {
            this.field7257.method140().method1427(this, arg0, (int[]) null, arg2);
        } else {
            class18.field187[5] = 0;
            this.field7257.method140().method1427(this, arg0, class18.field187, arg2);
            arg1.field7445 = class18.field187[0];
            arg1.field7442 = class18.field187[1];
            arg1.field7447 = class18.field187[2];
            arg1.field7446 = class18.field187[3];
            arg1.field7443 = class18.field187[4];
            arg1.field7444 = class18.field187[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method466();

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method426();

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method435(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class54 method414(class54 arg0);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class429.method2464(-105, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method454();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V")
    private final void method3038(int[] arg0, class392 arg1) {
        this.field7257.method140().method1417(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()Z")
    public final boolean method459() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;IZ)V")
    public final void method449(class392 arg0, int arg1, boolean arg2) {
        this.method3039(((class94) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method422();

    @OriginalMember(owner = "client!v", name = "E", descriptor = "(JIZ)V")
    private final native void method3039(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method430();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method427() {
        if (this.field7257.field194 > 1) {
            synchronized (this) {
                while (super.field625) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field625 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method3040(class537 arg0, class537 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method415();

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method413(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method448(int arg0, int arg1, class392 arg2, boolean arg3) {
        return this.field7257.method140().method1419(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()[Lns;")
    public final class369[] method451() {
        return this.field7255;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
    public final void method436() {
        if (this.field7257.field194 > 1) {
            synchronized (this) {
                super.field625 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
    public final void method432() {
    }

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method442();

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method425(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V")
    public final void method460(class392 arg0) {
        this.method3038(class18.field186, arg0);
        int var2 = 0;
        if (this.field7255 != null) {
            for (int var3 = 0; var3 < this.field7255.length; ++var3) {
                class369 var4 = this.field7255[var3];
                var4.field4982 = class18.field186[var2++];
                var4.field4980 = class18.field186[var2++];
                var4.field4983 = class18.field186[var2++];
                var4.field4970 = class18.field186[var2++];
                var4.field4975 = class18.field186[var2++];
                var4.field4979 = class18.field186[var2++];
                var4.field4977 = class18.field186[var2++];
                var4.field4969 = class18.field186[var2++];
                var4.field4981 = class18.field186[var2++];
            }
        }
        if (this.field7254 != null) {
            for (int var5 = 0; var5 < this.field7254.length; ++var5) {
                class357 var6 = this.field7254[var5];
                class357 var7 = var6;
                if (var6.field4733 != null) {
                    var7 = var6.field4733;
                }
                if (var6.field4734 != null) {
                    var6.field4734.method675(arg0);
                } else {
                    var6.field4734 = arg0.method681();
                }
                var7.field4737 = class18.field186[var2++];
                var7.field4741 = class18.field186[var2++];
                var7.field4743 = class18.field186[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method188(boolean arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public final void method458(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method424();

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method464();

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method437();

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method420();

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method445(int arg0);

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method450();

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method447(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()[Llp;")
    public final class357[] method429() {
        return this.field7254;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method439(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method444(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;")
    public final class55 method462(byte arg0, int arg1, boolean arg2) {
        return this.field7257.method140().method1422(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method455(int arg0);

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method463();

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method3041(class18 arg0, class175 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method452(int arg0);

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method443(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method438();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method419(int arg0, int arg1, class392 arg2, boolean arg3, int arg4) {
        return this.field7257.method140().method1419(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method434();

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method446(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method3042(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method418(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3042(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method423(int arg0);

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method416(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Let;II)V")
    public final void method453(class392 arg0, class551 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field7257.method140().method1418(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class18.field187[5] = 0;
            this.field7257.method140().method1418(this, arg0, class18.field187, arg2, arg3);
            arg1.field7445 = class18.field187[0];
            arg1.field7442 = class18.field187[1];
            arg1.field7447 = class18.field187[2];
            arg1.field7446 = class18.field187[3];
            arg1.field7443 = class18.field187[4];
            arg1.field7444 = class18.field187[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method467(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7257.method140().method1425(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Lnba;IIII)V")
    public class537(class18 arg0, class175 arg1, class270 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7257 = arg0;
        this.field7256 = arg1;
        this.field7255 = arg2.field3677;
        this.field7254 = arg2.field3654;
        int var8 = arg2.field3677 == null ? 0 : arg2.field3677.length;
        int var9 = arg2.field3654 == null ? 0 : arg2.field3654.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field7255[var12].field4973;
            var11[var10++] = this.field7255[var12].field4978;
            var11[var10++] = this.field7255[var12].field4976;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field7254[var13].field4744;
        }
        int var14 = arg2.field3656 == null ? 0 : arg2.field3656.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class360 var20 = arg2.field3656[var17];
            class243 var21 = class1.method1(var20.field4753, (byte) -21);
            var15[var16++] = var20.field4754;
            var15[var16++] = var21.field3314;
            var15[var16++] = var21.field3315;
            var15[var16++] = var21.field3308;
            var15[var16++] = var21.field3312;
            var15[var16++] = var21.field3313;
            var15[var16++] = var21.field3305 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class360 var19 = arg2.field3656[var18];
            var15[var16++] = var19.field4758;
        }
        this.method3041(this.field7257, this.field7256, arg2.field3649, arg2.field3670, arg2.field3674, arg2.field3690, arg2.field3646, arg2.field3650, arg2.field3658, arg2.field3693, arg2.field3665, arg2.field3697, arg2.field3653, arg2.field3682, arg2.field3679, arg2.field3685, arg2.field3687, arg2.field3695, arg2.field3648, arg2.field3667, arg2.field3699, arg2.field3678, arg2.field3691, arg2.field3660, arg2.field3680, arg2.field3692, arg2.field3659, arg2.field3689, arg2.field3664, arg2.field3675, arg2.field3686, arg2.field3652, arg2.field3657, arg2.field3645, arg2.field3671, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V")
    public class537(class18 arg0) {
        this.field7257 = arg0;
        this.field7256 = null;
        this.method3043(arg0);
    }

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method3043(class18 arg0);
}
