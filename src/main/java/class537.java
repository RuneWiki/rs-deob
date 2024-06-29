import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class537 extends class55 implements class201 {

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Ll;")
    private class18 field7854;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lm;")
    private class176 field7855;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[Lti;")
    public class406[] field7856;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "[Lrea;")
    public class192[] field7853;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V")
    private final void method3262(int[] arg0, class393 arg1) {
        this.field7854.method285().method1674(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class222.method1638(-1, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method642();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method603() {
        if (this.field7854.field325 > 1) {
            synchronized (this) {
                while (super.field724) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field724 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method629(int arg0);

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method650(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()[Lti;")
    public final class406[] method599() {
        return this.field7856;
    }

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class54 method643(class54 arg0);

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method647();

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method611();

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
    public final void method626() {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method648(int arg0, int arg1, class393 arg2, boolean arg3) {
        return this.field7854.method285().method1667(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;IZ)V")
    public final void method634(class393 arg0, int arg1, boolean arg2) {
        this.method3263(((class94) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "U", descriptor = "(JIZ)V")
    private final native void method3263(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method644(int arg0);

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method3264(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;")
    public final class55 method609(byte arg0, int arg1, boolean arg2) {
        return this.field7854.method285().method1676(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method645();

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method623();

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method312(boolean arg0);

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method631();

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method646();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lb;II)V")
    public final void method613(class393 arg0, class306 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field7854.method285().method1675(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class18.field312[5] = 0;
            this.field7854.method285().method1675(this, arg0, class18.field312, arg2, arg3);
            arg1.field4826 = class18.field312[0];
            arg1.field4823 = class18.field312[1];
            arg1.field4828 = class18.field312[2];
            arg1.field4825 = class18.field312[3];
            arg1.field4824 = class18.field312[4];
            arg1.field4827 = class18.field312[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()Z")
    public final boolean method637() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method622();

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method614();

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method639(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method607();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V")
    public final void method601(class393 arg0) {
        this.method3262(class18.field313, arg0);
        int var2 = 0;
        if (this.field7856 != null) {
            for (int var3 = 0; var3 < this.field7856.length; ++var3) {
                class406 var4 = this.field7856[var3];
                var4.field6258 = class18.field313[var2++];
                var4.field6256 = class18.field313[var2++];
                var4.field6270 = class18.field313[var2++];
                var4.field6255 = class18.field313[var2++];
                var4.field6265 = class18.field313[var2++];
                var4.field6261 = class18.field313[var2++];
                var4.field6257 = class18.field313[var2++];
                var4.field6272 = class18.field313[var2++];
                var4.field6274 = class18.field313[var2++];
            }
        }
        if (this.field7853 != null) {
            for (int var5 = 0; var5 < this.field7853.length; ++var5) {
                class192 var6 = this.field7853[var5];
                class192 var7 = var6;
                if (var6.field3166 != null) {
                    var7 = var6.field3166;
                }
                if (var6.field3175 != null) {
                    var6.field3175.method512(arg0);
                } else {
                    var6.field3175 = arg0.method519();
                }
                var7.field3170 = class18.field313[var2++];
                var7.field3178 = class18.field313[var2++];
                var7.field3169 = class18.field313[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method620(int arg0);

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method602(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method624(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method3265(class18 arg0);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
    public final void method633() {
        if (this.field7854.field325 > 1) {
            synchronized (this) {
                super.field724 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method617();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method641(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7854.method285().method1666(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method628(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3264(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method625();

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method3266(class537 arg0, class537 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public final void method636(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()[Lrea;")
    public final class192[] method652() {
        return this.field7853;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method598(int arg0, int arg1, class393 arg2, boolean arg3, int arg4) {
        return this.field7854.method285().method1667(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method3267(class18 arg0, class176 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method608(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method638(int arg0);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method610(int arg0);

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method600(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method649(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method618(int arg0);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method604();

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method627(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method612();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lb;I)V")
    public final void method606(class393 arg0, class306 arg1, int arg2) {
        if (arg1 == null) {
            this.field7854.method285().method1663(this, arg0, (int[]) null, arg2);
        } else {
            class18.field312[5] = 0;
            this.field7854.method285().method1663(this, arg0, class18.field312, arg2);
            arg1.field4826 = class18.field312[0];
            arg1.field4823 = class18.field312[1];
            arg1.field4828 = class18.field312[2];
            arg1.field4825 = class18.field312[3];
            arg1.field4824 = class18.field312[4];
            arg1.field4827 = class18.field312[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Luo;IIII)V")
    public class537(class18 arg0, class176 arg1, class534 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7854 = arg0;
        this.field7855 = arg1;
        this.field7856 = arg2.field7804;
        this.field7853 = arg2.field7777;
        int var8 = arg2.field7804 == null ? 0 : arg2.field7804.length;
        int var9 = arg2.field7777 == null ? 0 : arg2.field7777.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field7856[var12].field6264;
            var11[var10++] = this.field7856[var12].field6269;
            var11[var10++] = this.field7856[var12].field6260;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field7853[var13].field3168;
        }
        int var14 = arg2.field7795 == null ? 0 : arg2.field7795.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class401 var20 = arg2.field7795[var17];
            class326 var21 = class365.method2422((byte) 120, var20.field6190);
            var15[var16++] = var20.field6189;
            var15[var16++] = var21.field5073;
            var15[var16++] = var21.field5076;
            var15[var16++] = var21.field5064;
            var15[var16++] = var21.field5063;
            var15[var16++] = var21.field5074;
            var15[var16++] = var21.field5065 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class401 var19 = arg2.field7795[var18];
            var15[var16++] = var19.field6185;
        }
        this.method3267(this.field7854, this.field7855, arg2.field7781, arg2.field7800, arg2.field7824, arg2.field7790, arg2.field7784, arg2.field7822, arg2.field7797, arg2.field7810, arg2.field7801, arg2.field7817, arg2.field7812, arg2.field7774, arg2.field7791, arg2.field7779, arg2.field7799, arg2.field7805, arg2.field7787, arg2.field7816, arg2.field7786, arg2.field7780, arg2.field7811, arg2.field7820, arg2.field7796, arg2.field7826, arg2.field7818, arg2.field7827, arg2.field7788, arg2.field7823, arg2.field7785, arg2.field7782, arg2.field7773, arg2.field7807, arg2.field7776, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V")
    public class537(class18 arg0) {
        this.field7854 = arg0;
        this.field7855 = null;
        this.method3265(arg0);
    }

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method651();
}
