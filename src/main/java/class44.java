import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class44 extends class495 implements class556 {

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Loa;")
    private class721 field653;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lya;")
    private class59 field654;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[Lnha;")
    public class338[] field652;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "[Lrf;")
    public class92[] field651;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method104(int arg0);

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method79();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method112();

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method298(class721 arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Leh;)V")
    public final void method63(class378 arg0) {
        this.method303(class721.field10120, arg0);
        int var2 = 0;
        if (this.field652 != null) {
            for (int var3 = 0; var3 < this.field652.length; ++var3) {
                class338 var4 = this.field652[var3];
                var4.field5019 = class721.field10120[var2++];
                var4.field5025 = class721.field10120[var2++];
                var4.field5022 = class721.field10120[var2++];
                var4.field5012 = class721.field10120[var2++];
                var4.field5010 = class721.field10120[var2++];
                var4.field5008 = class721.field10120[var2++];
                var4.field5005 = class721.field10120[var2++];
                var4.field5009 = class721.field10120[var2++];
                var4.field5014 = class721.field10120[var2++];
            }
        }
        if (this.field651 != null) {
            for (int var5 = 0; var5 < this.field651.length; ++var5) {
                class92 var6 = this.field651[var5];
                class92 var7 = var6;
                if (var6.field1201 != null) {
                    var7 = var6.field1201;
                }
                if (var6.field1199 != null) {
                    var6.field1199.method1950(arg0);
                } else {
                    var6.field1199 = arg0.method1951();
                }
                var7.field1203 = class721.field10120[var2++];
                var7.field1205 = class721.field10120[var2++];
                var7.field1202 = class721.field10120[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method75();

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method113();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method156(boolean arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method72(int arg0);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method60();

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lrf;")
    public final class92[] method116() {
        return this.field651;
    }

    @OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
    private final native void method299(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method64(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method301(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method59(int arg0);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method88();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lnha;")
    public final class338[] method54() {
        return this.field652;
    }

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method85(int arg0);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method92();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method71(class495 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field653.method4061().method3664(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method68();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method101(int arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method102(int arg0, int arg1, class292 arg2, class292 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method300(class721 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
    public final void method109() {
        if (this.field653.field10135 > 1) {
            synchronized (this) {
                while (super.field7020) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field7020 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method66(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method94();

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method69(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method67();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method301(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method65();

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
    public final void method58() {
        if (this.field653.field10135 > 1) {
            synchronized (this) {
                super.field7020 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Leh;IZ)V")
    public final void method110(class378 arg0, int arg1, boolean arg2) {
        this.method299(((class290) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Leh;Lsp;II)V")
    public final void method91(class378 arg0, class660 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field653.method4061().method3667(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class721.field10117[5] = 0;
            this.field653.method4061().method3667(this, arg0, class721.field10117, arg2, arg3);
            arg1.field9280 = class721.field10117[0];
            arg1.field9281 = class721.field10117[1];
            arg1.field9278 = class721.field10117[2];
            arg1.field9277 = class721.field10117[3];
            arg1.field9276 = class721.field10117[4];
            arg1.field9279 = class721.field10117[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method62();

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method302(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class192 method86(class192 arg0);

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
    public final void method76() {
    }

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method115();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method61(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method111(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method80();

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method70(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method55(int arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method98(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method106(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method114(int arg0);

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class349.method2206(58, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method97();

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()Z")
    public final boolean method99() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILeh;ZI)Z")
    public final boolean method83(int arg0, int arg1, class378 arg2, boolean arg3, int arg4) {
        return this.field653.method4061().method3666(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lhm;IIII)V")
    public class44(class721 arg0, class59 arg1, class229 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field653 = arg0;
        this.field654 = arg1;
        this.field652 = arg2.field3316;
        this.field651 = arg2.field3327;
        int var8 = arg2.field3316 == null ? 0 : arg2.field3316.length;
        int var9 = arg2.field3327 == null ? 0 : arg2.field3327.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field652[var12].field5021;
            var11[var10++] = this.field652[var12].field5017;
            var11[var10++] = this.field652[var12].field5018;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field651[var13].field1196;
        }
        int var14 = arg2.field3279 == null ? 0 : arg2.field3279.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class297 var20 = arg2.field3279[var17];
            class399 var21 = class275.method1779((byte) -121, var20.field4473);
            var15[var16++] = var20.field4468;
            var15[var16++] = var21.field5666;
            var15[var16++] = var21.field5660;
            var15[var16++] = var21.field5674;
            var15[var16++] = var21.field5667;
            var15[var16++] = var21.field5675;
            var15[var16++] = var21.field5671 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class297 var19 = arg2.field3279[var18];
            var15[var16++] = var19.field4472;
        }
        this.method300(this.field653, this.field654, arg2.field3313, arg2.field3311, arg2.field3320, arg2.field3328, arg2.field3287, arg2.field3304, arg2.field3289, arg2.field3310, arg2.field3322, arg2.field3329, arg2.field3282, arg2.field3317, arg2.field3306, arg2.field3296, arg2.field3309, arg2.field3321, arg2.field3330, arg2.field3301, arg2.field3303, arg2.field3278, arg2.field3298, arg2.field3294, arg2.field3280, arg2.field3290, arg2.field3312, arg2.field3325, arg2.field3326, arg2.field3291, arg2.field3324, arg2.field3283, arg2.field3281, arg2.field3323, arg2.field3276, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Leh;Lsp;I)V")
    public final void method108(class378 arg0, class660 arg1, int arg2) {
        if (arg1 == null) {
            this.field653.method4061().method3650(this, arg0, (int[]) null, arg2);
        } else {
            class721.field10117[5] = 0;
            this.field653.method4061().method3650(this, arg0, class721.field10117, arg2);
            arg1.field9280 = class721.field10117[0];
            arg1.field9281 = class721.field10117[1];
            arg1.field9278 = class721.field10117[2];
            arg1.field9277 = class721.field10117[3];
            arg1.field9276 = class721.field10117[4];
            arg1.field9279 = class721.field10117[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILeh;ZII)Z")
    public final boolean method84(int arg0, int arg1, class378 arg2, boolean arg3, int arg4, int arg5) {
        return this.field653.method4061().method3669(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class495 method81(byte arg0, int arg1, boolean arg2) {
        return this.field653.method4061().method3661(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILeh;)V")
    private final void method303(int[] arg0, class378 arg1) {
        this.field653.method4061().method3673(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class44(class721 arg0) {
        this.field653 = arg0;
        this.field654 = null;
        this.method298(arg0);
    }

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method117();
}
