import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class538 extends class55 implements class201 {

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Ll;")
    private class18 field7524;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "Lm;")
    private class176 field7527;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[Ltk;")
    public class317[] field7525;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[Laq;")
    public class146[] field7526;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;")
    public final class55 method357(byte arg0, int arg1, boolean arg2) {
        return this.field7524.method417().method1543(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
    public final void method314() {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public final void method324(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method3107(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method329();

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method346(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method342();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method326(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7524.method417().method1547(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method336();

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method328();

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method343();

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method352();

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method366(int arg0);

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method356(int arg0);

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method3108(class538 arg0, class538 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lql;I)V")
    public final void method334(class396 arg0, class684 arg1, int arg2) {
        if (arg1 == null) {
            this.field7524.method417().method1548(this, arg0, (int[]) null, arg2);
        } else {
            class18.field815[5] = 0;
            this.field7524.method417().method1548(this, arg0, class18.field815, arg2);
            arg1.field9705 = class18.field815[0];
            arg1.field9710 = class18.field815[1];
            arg1.field9706 = class18.field815[2];
            arg1.field9708 = class18.field815[3];
            arg1.field9709 = class18.field815[4];
            arg1.field9707 = class18.field815[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class541.method3123(14336, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method369();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method319() {
        if (this.field7524.field823 > 1) {
            synchronized (this) {
                while (super.field1214) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field1214 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method315();

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method320(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method361(int arg0);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()[Laq;")
    public final class146[] method348() {
        return this.field7526;
    }

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method420(boolean arg0);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method368();

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method308(int arg0);

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method316(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V")
    public final void method313(class396 arg0) {
        this.method3111(class18.field809, arg0);
        int var2 = 0;
        if (this.field7525 != null) {
            for (int var3 = 0; var3 < this.field7525.length; ++var3) {
                class317 var4 = this.field7525[var3];
                var4.field4679 = class18.field809[var2++];
                var4.field4670 = class18.field809[var2++];
                var4.field4664 = class18.field809[var2++];
                var4.field4673 = class18.field809[var2++];
                var4.field4666 = class18.field809[var2++];
                var4.field4682 = class18.field809[var2++];
                var4.field4660 = class18.field809[var2++];
                var4.field4680 = class18.field809[var2++];
                var4.field4676 = class18.field809[var2++];
            }
        }
        if (this.field7526 != null) {
            for (int var5 = 0; var5 < this.field7526.length; ++var5) {
                class146 var6 = this.field7526[var5];
                class146 var7 = var6;
                if (var6.field2536 != null) {
                    var7 = var6.field2536;
                }
                if (var6.field2537 != null) {
                    var6.field2537.method896(arg0);
                } else {
                    var6.field2537 = arg0.method904();
                }
                var7.field2544 = class18.field809[var2++];
                var7.field2529 = class18.field809[var2++];
                var7.field2533 = class18.field809[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()Z")
    public final boolean method338() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method365(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lql;II)V")
    public final void method317(class396 arg0, class684 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field7524.method417().method1550(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class18.field815[5] = 0;
            this.field7524.method417().method1550(this, arg0, class18.field815, arg2, arg3);
            arg1.field9705 = class18.field815[0];
            arg1.field9710 = class18.field815[1];
            arg1.field9706 = class18.field815[2];
            arg1.field9708 = class18.field815[3];
            arg1.field9709 = class18.field815[4];
            arg1.field9707 = class18.field815[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method340();

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method3109(class18 arg0, class176 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method3110(class18 arg0);

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method350(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method310(int arg0);

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method327();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method358(int arg0, int arg1, class396 arg2, boolean arg3) {
        return this.field7524.method417().method1549(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method318(int arg0, int arg1, class396 arg2, boolean arg3, int arg4) {
        return this.field7524.method417().method1549(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method330();

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method349(int arg0);

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method337(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method363();

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method354();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
    public final void method312() {
        if (this.field7524.field823 > 1) {
            synchronized (this) {
                super.field1214 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V")
    private final void method3111(int[] arg0, class396 arg1) {
        this.field7524.method417().method1544(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method344(int arg0);

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method341();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()[Ltk;")
    public final class317[] method362() {
        return this.field7525;
    }

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method364(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method325(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3107(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Lnda;IIII)V")
    public class538(class18 arg0, class176 arg1, class519 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7524 = arg0;
        this.field7527 = arg1;
        this.field7525 = arg2.field7331;
        this.field7526 = arg2.field7352;
        int var8 = arg2.field7331 == null ? 0 : arg2.field7331.length;
        int var9 = arg2.field7352 == null ? 0 : arg2.field7352.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field7525[var12].field4667;
            var11[var10++] = this.field7525[var12].field4675;
            var11[var10++] = this.field7525[var12].field4678;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field7526[var13].field2543;
        }
        int var14 = arg2.field7333 == null ? 0 : arg2.field7333.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class638 var20 = arg2.field7333[var17];
            class535 var21 = class572.method3291(var20.field9192, (byte) 107);
            var15[var16++] = var20.field9194;
            var15[var16++] = var21.field7503;
            var15[var16++] = var21.field7499;
            var15[var16++] = var21.field7492;
            var15[var16++] = var21.field7501;
            var15[var16++] = var21.field7500;
            var15[var16++] = var21.field7493 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class638 var19 = arg2.field7333[var18];
            var15[var16++] = var19.field9187;
        }
        this.method3109(this.field7524, this.field7527, arg2.field7361, arg2.field7325, arg2.field7346, arg2.field7334, arg2.field7319, arg2.field7360, arg2.field7335, arg2.field7317, arg2.field7314, arg2.field7318, arg2.field7324, arg2.field7321, arg2.field7326, arg2.field7351, arg2.field7339, arg2.field7344, arg2.field7347, arg2.field7336, arg2.field7327, arg2.field7337, arg2.field7353, arg2.field7320, arg2.field7356, arg2.field7330, arg2.field7355, arg2.field7345, arg2.field7359, arg2.field7332, arg2.field7362, arg2.field7315, arg2.field7338, arg2.field7328, arg2.field7316, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class54 method311(class54 arg0);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V")
    public class538(class18 arg0) {
        this.field7524 = arg0;
        this.field7527 = null;
        this.method3110(arg0);
    }
}
