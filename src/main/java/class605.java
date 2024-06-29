import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class605 extends class470 implements class247 {

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Ll;")
    private class168 field8443;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lm;")
    private class106 field8442;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "[Lmp;")
    public class140[] field8444;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[Lfk;")
    public class118[] field8445;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method653(int arg0);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class69.method386(-1995, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method631(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lbc;II)V")
    public final void method648(class487 arg0, class667 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field8443.method1086().method1181(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class168.field2404[5] = 0;
            this.field8443.method1086().method1181(this, arg0, class168.field2404, arg2, arg3);
            arg1.field9485 = class168.field2404[0];
            arg1.field9482 = class168.field2404[1];
            arg1.field9486 = class168.field2404[2];
            arg1.field9483 = class168.field2404[3];
            arg1.field9484 = class168.field2404[4];
            arg1.field9487 = class168.field2404[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method602(int arg0);

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method613();

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method643(int arg0);

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method605(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method627();

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method645(int arg0, int arg1, class270 arg2, class270 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method3366(class168 arg0, class106 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method616(int arg0);

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
    public final void method606() {
        if (this.field8443.field2415 > 1) {
            synchronized (this) {
                while (super.field6559) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6559 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()[Lfk;")
    public final class118[] method628() {
        return this.field8445;
    }

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method642();

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method604();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public final void method651(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method617(class470 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8443.method1086().method1175(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method626();

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method650();

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method656();

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method636();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method603(int arg0, int arg1, class487 arg2, boolean arg3, int arg4) {
        return this.field8443.method1086().method1177(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()Z")
    public final boolean method615() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method635();

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method3367(class605 arg0, class605 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method634() {
    }

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method3368(class168 arg0);

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method637();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()[Lmp;")
    public final class140[] method652() {
        return this.field8444;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method638(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lbc;I)V")
    public final void method625(class487 arg0, class667 arg1, int arg2) {
        if (arg1 == null) {
            this.field8443.method1086().method1178(this, arg0, (int[]) null, arg2);
        } else {
            class168.field2404[5] = 0;
            this.field8443.method1086().method1178(this, arg0, class168.field2404, arg2);
            arg1.field9485 = class168.field2404[0];
            arg1.field9482 = class168.field2404[1];
            arg1.field9486 = class168.field2404[2];
            arg1.field9483 = class168.field2404[3];
            arg1.field9484 = class168.field2404[4];
            arg1.field9487 = class168.field2404[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V")
    private final void method3369(int[] arg0, class487 arg1) {
        this.field8443.method1086().method1171(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method647();

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method614(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method612(int arg0);

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method528(boolean arg0);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method621();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V")
    public final void method610(class487 arg0) {
        this.method3369(class168.field2399, arg0);
        int var2 = 0;
        if (this.field8444 != null) {
            for (int var3 = 0; var3 < this.field8444.length; ++var3) {
                class140 var4 = this.field8444[var3];
                var4.field1895 = class168.field2399[var2++];
                var4.field1887 = class168.field2399[var2++];
                var4.field1906 = class168.field2399[var2++];
                var4.field1889 = class168.field2399[var2++];
                var4.field1897 = class168.field2399[var2++];
                var4.field1896 = class168.field2399[var2++];
                var4.field1893 = class168.field2399[var2++];
                var4.field1892 = class168.field2399[var2++];
                var4.field1905 = class168.field2399[var2++];
            }
        }
        if (this.field8445 != null) {
            for (int var5 = 0; var5 < this.field8445.length; ++var5) {
                class118 var6 = this.field8445[var5];
                class118 var7 = var6;
                if (var6.field1499 != null) {
                    var7 = var6.field1499;
                }
                if (var6.field1494 != null) {
                    var6.field1494.method344(arg0);
                } else {
                    var6.field1494 = arg0.method345();
                }
                var7.field1501 = class168.field2399[var2++];
                var7.field1506 = class168.field2399[var2++];
                var7.field1503 = class168.field2399[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method619(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method3370(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()V")
    public final void method620() {
        if (this.field8443.field2415 > 1) {
            synchronized (this) {
                super.field6559 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method640();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method655(int arg0, int arg1, class487 arg2, boolean arg3) {
        return this.field8443.method1086().method1177(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method657();

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method660();

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method624(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method646(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3370(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;")
    public final class470 method649(byte arg0, int arg1, boolean arg2) {
        return this.field8443.method1086().method1174(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method611(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method644(int arg0);

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class117 method654(class117 arg0);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Lcca;IIII)V")
    public class605(class168 arg0, class106 arg1, class250 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8443 = arg0;
        this.field8442 = arg1;
        this.field8444 = arg2.field3248;
        this.field8445 = arg2.field3252;
        int var8 = arg2.field3248 == null ? 0 : arg2.field3248.length;
        int var9 = arg2.field3252 == null ? 0 : arg2.field3252.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field8444[var12].field1908;
            var11[var10++] = this.field8444[var12].field1904;
            var11[var10++] = this.field8444[var12].field1894;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field8445[var13].field1504;
        }
        int var14 = arg2.field3275 == null ? 0 : arg2.field3275.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class254 var20 = arg2.field3275[var17];
            class383 var21 = class355.method2090((byte) 65, var20.field3322);
            var15[var16++] = var20.field3327;
            var15[var16++] = var21.field5055;
            var15[var16++] = var21.field5054;
            var15[var16++] = var21.field5060;
            var15[var16++] = var21.field5063;
            var15[var16++] = var21.field5061;
            var15[var16++] = var21.field5065 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class254 var19 = arg2.field3275[var18];
            var15[var16++] = var19.field3324;
        }
        this.method3366(this.field8443, this.field8442, arg2.field3284, arg2.field3293, arg2.field3254, arg2.field3247, arg2.field3289, arg2.field3277, arg2.field3265, arg2.field3283, arg2.field3296, arg2.field3250, arg2.field3257, arg2.field3272, arg2.field3274, arg2.field3246, arg2.field3276, arg2.field3280, arg2.field3292, arg2.field3258, arg2.field3255, arg2.field3270, arg2.field3266, arg2.field3256, arg2.field3269, arg2.field3288, arg2.field3253, arg2.field3286, arg2.field3295, arg2.field3245, arg2.field3290, arg2.field3263, arg2.field3264, arg2.field3298, arg2.field3249, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V")
    public class605(class168 arg0) {
        this.field8443 = arg0;
        this.field8442 = null;
        this.method3368(arg0);
    }
}
