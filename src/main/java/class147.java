import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class147 extends class397 implements class52 {

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Ll;")
    private class261 field2498;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lm;")
    private class496 field2497;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[Lkw;")
    public class7[] field2496;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[Lcea;")
    public class94[] field2499;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lj;II)V")
    public final void method448(class152 arg0, class299 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2498.method1654().method3737(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class261.field3759[5] = 0;
            this.field2498.method1654().method3737(this, arg0, class261.field3759, arg2, arg3);
            arg1.field4208 = class261.field3759[0];
            arg1.field4206 = class261.field3759[1];
            arg1.field4205 = class261.field3759[2];
            arg1.field4204 = class261.field3759[3];
            arg1.field4207 = class261.field3759[4];
            arg1.field4209 = class261.field3759[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method1122(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method411(boolean arg0);

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method461();

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method436(int arg0);

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()[Lkw;")
    public final class7[] method480() {
        return this.field2496;
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class388.method2372(this, 0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method430();

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method445();

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method487(int arg0);

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()[Lcea;")
    public final class94[] method486() {
        return this.field2499;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lj;I)V")
    public final void method460(class152 arg0, class299 arg1, int arg2) {
        if (arg1 == null) {
            this.field2498.method1654().method3732(this, arg0, (int[]) null, arg2);
        } else {
            class261.field3759[5] = 0;
            this.field2498.method1654().method3732(this, arg0, class261.field3759, arg2);
            arg1.field4208 = class261.field3759[0];
            arg1.field4206 = class261.field3759[1];
            arg1.field4205 = class261.field3759[2];
            arg1.field4204 = class261.field3759[3];
            arg1.field4207 = class261.field3759[4];
            arg1.field4209 = class261.field3759[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method426(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method468();

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method465(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method1123(class261 arg0);

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method1124(class147 arg0, class147 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method477();

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()Z")
    public final boolean method485() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method435();

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method479(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method451(int arg0);

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method431();

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method439(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method438(int arg0);

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method478();

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method455(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method450();

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method474(int arg0);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method434();

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method446();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;")
    public final class397 method475(byte arg0, int arg1, boolean arg2) {
        return this.field2498.method1654().method3724(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method449();

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1125(class261 arg0, class496 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method484(int arg0, int arg1, class682 arg2, class682 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method464(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V")
    public final void method471(class152 arg0) {
        this.method1127(class261.field3765, arg0);
        int var2 = 0;
        if (this.field2496 != null) {
            for (int var3 = 0; var3 < this.field2496.length; ++var3) {
                class7 var4 = this.field2496[var3];
                var4.field71 = class261.field3765[var2++];
                var4.field59 = class261.field3765[var2++];
                var4.field56 = class261.field3765[var2++];
                var4.field57 = class261.field3765[var2++];
                var4.field68 = class261.field3765[var2++];
                var4.field54 = class261.field3765[var2++];
                var4.field60 = class261.field3765[var2++];
                var4.field73 = class261.field3765[var2++];
                var4.field53 = class261.field3765[var2++];
            }
        }
        if (this.field2499 != null) {
            for (int var5 = 0; var5 < this.field2499.length; ++var5) {
                class94 var6 = this.field2499[var5];
                class94 var7 = var6;
                if (var6.field1390 != null) {
                    var7 = var6.field1390;
                }
                if (var6.field1394 != null) {
                    var6.field1394.method163(arg0);
                } else {
                    var6.field1394 = arg0.method180();
                }
                var7.field1396 = class261.field3765[var2++];
                var7.field1389 = class261.field3765[var2++];
                var7.field1391 = class261.field3765[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method462() {
        if (this.field2498.field3772 > 1) {
            synchronized (this) {
                super.field5750 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method458(int arg0);

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method488(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;IZ)V")
    public final void method456(class152 arg0, int arg1, boolean arg2) {
        this.method1126(((class361) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class427 method483(class427 arg0);

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method452();

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method432();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method440(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1122(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method466(class397 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2498.method1654().method3731(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method469(int arg0, int arg1, class152 arg2, boolean arg3) {
        return this.field2498.method1654().method3725(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method472();

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
    public final void method444() {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method427() {
        if (this.field2498.field3772 > 1) {
            synchronized (this) {
                while (super.field5750) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field5750 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "A", descriptor = "(JIZ)V")
    private final native void method1126(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method482(int arg0, int arg1, class152 arg2, boolean arg3, int arg4) {
        return this.field2498.method1654().method3725(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V")
    private final void method1127(int[] arg0, class152 arg1) {
        this.field2498.method1654().method3723(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Lcr;IIII)V")
    public class147(class261 arg0, class496 arg1, class163 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2498 = arg0;
        this.field2497 = arg1;
        this.field2496 = arg2.field2686;
        this.field2499 = arg2.field2682;
        int var8 = arg2.field2686 == null ? 0 : arg2.field2686.length;
        int var9 = arg2.field2682 == null ? 0 : arg2.field2682.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field2496[var12].field58;
            var11[var10++] = this.field2496[var12].field65;
            var11[var10++] = this.field2496[var12].field55;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field2499[var13].field1397;
        }
        int var14 = arg2.field2712 == null ? 0 : arg2.field2712.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class331 var20 = arg2.field2712[var17];
            class456 var21 = class289.method1780(var20.field4578, (byte) -32);
            var15[var16++] = var20.field4579;
            var15[var16++] = var21.field6560;
            var15[var16++] = var21.field6559;
            var15[var16++] = var21.field6552;
            var15[var16++] = var21.field6551;
            var15[var16++] = var21.field6555;
            var15[var16++] = var21.field6556 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class331 var19 = arg2.field2712[var18];
            var15[var16++] = var19.field4583;
        }
        this.method1125(this.field2498, this.field2497, arg2.field2694, arg2.field2691, arg2.field2666, arg2.field2657, arg2.field2700, arg2.field2658, arg2.field2685, arg2.field2709, arg2.field2710, arg2.field2704, arg2.field2684, arg2.field2676, arg2.field2668, arg2.field2701, arg2.field2703, arg2.field2680, arg2.field2667, arg2.field2672, arg2.field2678, arg2.field2660, arg2.field2688, arg2.field2671, arg2.field2673, arg2.field2670, arg2.field2692, arg2.field2697, arg2.field2669, arg2.field2707, arg2.field2683, arg2.field2662, arg2.field2674, arg2.field2659, arg2.field2699, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V")
    public class147(class261 arg0) {
        this.field2498 = arg0;
        this.field2497 = null;
        this.method1123(arg0);
    }
}
