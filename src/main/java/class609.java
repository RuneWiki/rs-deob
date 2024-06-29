import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class609 extends class474 implements class249 {

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Ll;")
    private class171 field8550;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lm;")
    private class108 field8548;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "[Lhi;")
    public class64[] field8551;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "[Lqg;")
    public class214[] field8549;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method3327(class171 arg0);

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method3328(class171 arg0, class108 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method740();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;")
    public final class474 method711(byte arg0, int arg1, boolean arg2) {
        return this.field8550.method986().method1115(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lpba;I)V")
    public final void method717(class491 arg0, class151 arg1, int arg2) {
        if (arg1 == null) {
            this.field8550.method986().method1108(this, arg0, (int[]) null, arg2);
        } else {
            class171.field2224[5] = 0;
            this.field8550.method986().method1108(this, arg0, class171.field2224, arg2);
            arg1.field1933 = class171.field2224[0];
            arg1.field1929 = class171.field2224[1];
            arg1.field1934 = class171.field2224[2];
            arg1.field1931 = class171.field2224[3];
            arg1.field1932 = class171.field2224[4];
            arg1.field1930 = class171.field2224[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method694(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method725(class474 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8550.method986().method1117(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method754();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method744(int arg0, int arg1, class491 arg2, boolean arg3) {
        return this.field8550.method986().method1106(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()[Lqg;")
    public final class214[] method706() {
        return this.field8549;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V")
    public final void method720(class491 arg0) {
        this.method3329(class171.field2223, arg0);
        int var2 = 0;
        if (this.field8551 != null) {
            for (int var3 = 0; var3 < this.field8551.length; ++var3) {
                class64 var4 = this.field8551[var3];
                var4.field868 = class171.field2223[var2++];
                var4.field859 = class171.field2223[var2++];
                var4.field870 = class171.field2223[var2++];
                var4.field860 = class171.field2223[var2++];
                var4.field861 = class171.field2223[var2++];
                var4.field871 = class171.field2223[var2++];
                var4.field878 = class171.field2223[var2++];
                var4.field873 = class171.field2223[var2++];
                var4.field872 = class171.field2223[var2++];
            }
        }
        if (this.field8549 != null) {
            for (int var5 = 0; var5 < this.field8549.length; ++var5) {
                class214 var6 = this.field8549[var5];
                class214 var7 = var6;
                if (var6.field2665 != null) {
                    var7 = var6.field2665;
                }
                if (var6.field2667 != null) {
                    var6.field2667.method919(arg0);
                } else {
                    var6.field2667 = arg0.method907();
                }
                var7.field2664 = class171.field2223[var2++];
                var7.field2657 = class171.field2223[var2++];
                var7.field2663 = class171.field2223[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method721(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method723(int arg0);

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method727();

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method762(int arg0);

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method734();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()Z")
    public final boolean method736() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()V")
    public final void method702() {
        if (this.field8550.field2240 > 1) {
            synchronized (this) {
                while (super.field6014) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6014 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method746(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public final void method755(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method722(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method726() {
    }

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method731(int arg0);

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method692();

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method709(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method715(int arg0);

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method757();

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method764();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V")
    private final void method3329(int[] arg0, class491 arg1) {
        this.field8550.method986().method1104(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method738(int arg0, int arg1, class491 arg2, boolean arg3, int arg4) {
        return this.field8550.method986().method1106(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method747(int arg0, int arg1, class272 arg2, class272 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class499.method2689(this, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method749();

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method742();

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method704();

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class119 method752(class119 arg0);

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method710(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method696(int arg0);

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()[Lhi;")
    public final class64[] method728() {
        return this.field8551;
    }

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method3330(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method732(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3330(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method765();

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method756();

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method761(int arg0);

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method758();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lpba;II)V")
    public final void method751(class491 arg0, class151 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field8550.method986().method1114(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class171.field2224[5] = 0;
            this.field8550.method986().method1114(this, arg0, class171.field2224, arg2, arg3);
            arg1.field1933 = class171.field2224[0];
            arg1.field1929 = class171.field2224[1];
            arg1.field1934 = class171.field2224[2];
            arg1.field1931 = class171.field2224[3];
            arg1.field1932 = class171.field2224[4];
            arg1.field1930 = class171.field2224[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method699();

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method3331(class609 arg0, class609 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method703();

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()V")
    public final void method739() {
        if (this.field8550.field2240 > 1) {
            synchronized (this) {
                super.field6014 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method705(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method548(boolean arg0);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Leg;IIII)V")
    public class609(class171 arg0, class108 arg1, class47 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field8550 = arg0;
        this.field8548 = arg1;
        this.field8551 = arg2.field630;
        this.field8549 = arg2.field622;
        int var8 = arg2.field630 == null ? 0 : arg2.field630.length;
        int var9 = arg2.field622 == null ? 0 : arg2.field622.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field8551[var12].field862;
            var11[var10++] = this.field8551[var12].field865;
            var11[var10++] = this.field8551[var12].field863;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field8549[var13].field2653;
        }
        int var14 = arg2.field653 == null ? 0 : arg2.field653.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class674 var20 = arg2.field653[var17];
            class177 var21 = class57.method361(var20.field9484, -94);
            var15[var16++] = var20.field9480;
            var15[var16++] = var21.field2290;
            var15[var16++] = var21.field2297;
            var15[var16++] = var21.field2292;
            var15[var16++] = var21.field2289;
            var15[var16++] = var21.field2296;
            var15[var16++] = var21.field2287 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class674 var19 = arg2.field653[var18];
            var15[var16++] = var19.field9485;
        }
        this.method3328(this.field8550, this.field8548, arg2.field639, arg2.field625, arg2.field628, arg2.field662, arg2.field657, arg2.field656, arg2.field619, arg2.field646, arg2.field654, arg2.field635, arg2.field614, arg2.field660, arg2.field636, arg2.field626, arg2.field618, arg2.field665, arg2.field641, arg2.field632, arg2.field616, arg2.field642, arg2.field651, arg2.field645, arg2.field629, arg2.field621, arg2.field637, arg2.field658, arg2.field623, arg2.field643, arg2.field664, arg2.field638, arg2.field661, arg2.field624, arg2.field617, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V")
    public class609(class171 arg0) {
        this.field8550 = arg0;
        this.field8548 = null;
        this.method3327(arg0);
    }
}
