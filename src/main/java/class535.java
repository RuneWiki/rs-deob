import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class535 extends class55 implements class199 {

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Ll;")
    private class18 field7803;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "Lm;")
    private class174 field7804;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "[Lnba;")
    public class271[] field7801;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "[Lfk;")
    public class604[] field7802;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method126(int arg0);

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method87(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method3142(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method120() {
        if (this.field7803.field514 > 1) {
            synchronized (this) {
                while (super.field878) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field878 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public final void method77(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()[Lfk;")
    public final class604[] method85() {
        return this.field7802;
    }

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method101(int arg0);

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method73(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method129(int arg0, int arg1, class394 arg2, boolean arg3) {
        return this.field7803.method282().method1363(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method3143(class18 arg0, class174 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class542.method3175(this, 0);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method59(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7803.method282().method1373(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method61();

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method88();

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method94();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
    public final void method80() {
        if (this.field7803.field514 > 1) {
            synchronized (this) {
                super.field878 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method79();

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method112();

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "(JIZ)V")
    private final native void method3144(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method115();

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()[Lnba;")
    public final class271[] method95() {
        return this.field7801;
    }

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method65();

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method72();

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method64(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method3145(class18 arg0);

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method96(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method119();

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method118();

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method116();

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method130(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()V")
    public final void method114() {
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V")
    private final void method3146(int[] arg0, class394 arg1) {
        this.field7803.method282().method1371(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method221(boolean arg0);

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method127();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method109(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method3142(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method98(int arg0);

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method83();

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method105();

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method74(int arg0);

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class54 method133(class54 arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;IZ)V")
    public final void method86(class394 arg0, int arg1, boolean arg2) {
        this.method3144(((class92) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lmj;II)V")
    public final void method122(class394 arg0, class605 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field7803.method282().method1368(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class18.field495[5] = 0;
            this.field7803.method282().method1368(this, arg0, class18.field495, arg2, arg3);
            arg1.field8714 = class18.field495[0];
            arg1.field8716 = class18.field495[1];
            arg1.field8719 = class18.field495[2];
            arg1.field8718 = class18.field495[3];
            arg1.field8715 = class18.field495[4];
            arg1.field8717 = class18.field495[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method99();

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method70(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lmj;I)V")
    public final void method67(class394 arg0, class605 arg1, int arg2) {
        if (arg1 == null) {
            this.field7803.method282().method1367(this, arg0, (int[]) null, arg2);
        } else {
            class18.field495[5] = 0;
            this.field7803.method282().method1367(this, arg0, class18.field495, arg2);
            arg1.field8714 = class18.field495[0];
            arg1.field8716 = class18.field495[1];
            arg1.field8719 = class18.field495[2];
            arg1.field8718 = class18.field495[3];
            arg1.field8715 = class18.field495[4];
            arg1.field8717 = class18.field495[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;")
    public final class55 method97(byte arg0, int arg1, boolean arg2) {
        return this.field7803.method282().method1365(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method3147(class535 arg0, class535 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V")
    public final void method104(class394 arg0) {
        this.method3146(class18.field497, arg0);
        int var2 = 0;
        if (this.field7801 != null) {
            for (int var3 = 0; var3 < this.field7801.length; ++var3) {
                class271 var4 = this.field7801[var3];
                var4.field3709 = class18.field497[var2++];
                var4.field3707 = class18.field497[var2++];
                var4.field3705 = class18.field497[var2++];
                var4.field3712 = class18.field497[var2++];
                var4.field3716 = class18.field497[var2++];
                var4.field3706 = class18.field497[var2++];
                var4.field3701 = class18.field497[var2++];
                var4.field3710 = class18.field497[var2++];
                var4.field3696 = class18.field497[var2++];
            }
        }
        if (this.field7802 != null) {
            for (int var5 = 0; var5 < this.field7802.length; ++var5) {
                class604 var6 = this.field7802[var5];
                class604 var7 = var6;
                if (var6.field8706 != null) {
                    var7 = var6.field8706;
                }
                if (var6.field8709 != null) {
                    var6.field8709.method711(arg0);
                } else {
                    var6.field8709 = arg0.method708();
                }
                var7.field8704 = class18.field497[var2++];
                var7.field8702 = class18.field497[var2++];
                var7.field8703 = class18.field497[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method124(int arg0, int arg1, class394 arg2, boolean arg3, int arg4) {
        return this.field7803.method282().method1363(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method91(int arg0);

    @OriginalMember(owner = "client!v", name = "g", descriptor = "()Z")
    public final boolean method110() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method93(int arg0);

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method69(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method102(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Lkk;IIII)V")
    public class535(class18 arg0, class174 arg1, class173 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7803 = arg0;
        this.field7804 = arg1;
        this.field7801 = arg2.field2140;
        this.field7802 = arg2.field2111;
        int var8 = arg2.field2140 == null ? 0 : arg2.field2140.length;
        int var9 = arg2.field2111 == null ? 0 : arg2.field2111.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field7801[var12].field3703;
            var11[var10++] = this.field7801[var12].field3702;
            var11[var10++] = this.field7801[var12].field3708;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field7802[var13].field8705;
        }
        int var14 = arg2.field2126 == null ? 0 : arg2.field2126.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class190 var20 = arg2.field2126[var17];
            class499 var21 = class479.method2812(var20.field2314, 4);
            var15[var16++] = var20.field2316;
            var15[var16++] = var21.field6977;
            var15[var16++] = var21.field6973;
            var15[var16++] = var21.field6971;
            var15[var16++] = var21.field6982;
            var15[var16++] = var21.field6983;
            var15[var16++] = var21.field6972 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class190 var19 = arg2.field2126[var18];
            var15[var16++] = var19.field2317;
        }
        this.method3143(this.field7803, this.field7804, arg2.field2123, arg2.field2100, arg2.field2145, arg2.field2117, arg2.field2153, arg2.field2110, arg2.field2115, arg2.field2146, arg2.field2107, arg2.field2105, arg2.field2154, arg2.field2141, arg2.field2112, arg2.field2109, arg2.field2136, arg2.field2132, arg2.field2129, arg2.field2101, arg2.field2127, arg2.field2106, arg2.field2148, arg2.field2102, arg2.field2139, arg2.field2116, arg2.field2108, arg2.field2135, arg2.field2122, arg2.field2121, arg2.field2131, arg2.field2149, arg2.field2103, arg2.field2120, arg2.field2128, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V")
    public class535(class18 arg0) {
        this.field7803 = arg0;
        this.field7804 = null;
        this.method3145(arg0);
    }
}
