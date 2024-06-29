import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class44 extends class499 implements class560 {

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Loa;")
    private class723 field694;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "Lya;")
    private class59 field695;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[Loea;")
    public class624[] field693;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "[Lqr;")
    public class72[] field696;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method276();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method277();

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method278(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method279(int arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method280(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method281(class499 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field694.method4008().method3614(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method282(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method283();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method284();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method285(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILsk;ZII)Z")
    public final boolean method286(int arg0, int arg1, class650 arg2, boolean arg3, int arg4, int arg5) {
        return this.field694.method4008().method3604(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method287(class723 arg0);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()Z")
    public final boolean method288() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method289(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILsk;ZI)Z")
    public final boolean method290(int arg0, int arg1, class650 arg2, boolean arg3, int arg4) {
        return this.field694.method4008().method3612(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method291();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method292();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lsk;IZ)V")
    public final void method293(class650 arg0, int arg1, boolean arg2) {
        this.method321(((class294) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
    public final void method294() {
    }

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method295();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method296();

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method297();

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method298();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method299(class723 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method300();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lsk;Leea;I)V")
    public final void method301(class650 arg0, class144 arg1, int arg2) {
        if (arg1 == null) {
            this.field694.method4008().method3609(this, arg0, (int[]) null, arg2);
        } else {
            class723.field9926[5] = 0;
            this.field694.method4008().method3609(this, arg0, class723.field9926, arg2);
            arg1.field2433 = class723.field9926[0];
            arg1.field2430 = class723.field9926[1];
            arg1.field2429 = class723.field9926[2];
            arg1.field2431 = class723.field9926[3];
            arg1.field2432 = class723.field9926[4];
            arg1.field2428 = class723.field9926[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method302(int arg0);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method303(int arg0);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method304();

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method305(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method306(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Ldc;IIII)V")
    public class44(class723 arg0, class59 arg1, class5 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field694 = arg0;
        this.field695 = arg1;
        this.field693 = arg2.field105;
        this.field696 = arg2.field79;
        int var8 = arg2.field105 == null ? 0 : arg2.field105.length;
        int var9 = arg2.field79 == null ? 0 : arg2.field79.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field693[var12].field8693;
            var11[var10++] = this.field693[var12].field8709;
            var11[var10++] = this.field693[var12].field8697;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field696[var13].field1051;
        }
        int var14 = arg2.field95 == null ? 0 : arg2.field95.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class482 var20 = arg2.field95[var17];
            class709 var21 = class506.method2893(var20.field6507, 393216);
            var15[var16++] = var20.field6504;
            var15[var16++] = var21.field9754;
            var15[var16++] = var21.field9752;
            var15[var16++] = var21.field9755;
            var15[var16++] = var21.field9749;
            var15[var16++] = var21.field9753;
            var15[var16++] = var21.field9742 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class482 var19 = arg2.field95[var18];
            var15[var16++] = var19.field6508;
        }
        this.method299(this.field694, this.field695, arg2.field96, arg2.field80, arg2.field64, arg2.field83, arg2.field61, arg2.field100, arg2.field70, arg2.field82, arg2.field53, arg2.field92, arg2.field89, arg2.field65, arg2.field73, arg2.field60, arg2.field68, arg2.field90, arg2.field66, arg2.field99, arg2.field58, arg2.field63, arg2.field71, arg2.field86, arg2.field94, arg2.field78, arg2.field75, arg2.field57, arg2.field74, arg2.field85, arg2.field54, arg2.field106, arg2.field59, arg2.field62, arg2.field56, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method307(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method308(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method319(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lsk;Leea;II)V")
    public final void method310(class650 arg0, class144 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field694.method4008().method3608(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class723.field9926[5] = 0;
            this.field694.method4008().method3608(this, arg0, class723.field9926, arg2, arg3);
            arg1.field2433 = class723.field9926[0];
            arg1.field2430 = class723.field9926[1];
            arg1.field2429 = class723.field9926[2];
            arg1.field2431 = class723.field9926[3];
            arg1.field2432 = class723.field9926[4];
            arg1.field2428 = class723.field9926[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()[Loea;")
    public final class624[] method311() {
        return this.field693;
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class86.method690(this, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lsk;)V")
    public final void method312(class650 arg0) {
        this.method313(class723.field9929, arg0);
        int var2 = 0;
        if (this.field693 != null) {
            for (int var3 = 0; var3 < this.field693.length; ++var3) {
                class624 var4 = this.field693[var3];
                var4.field8689 = class723.field9929[var2++];
                var4.field8702 = class723.field9929[var2++];
                var4.field8704 = class723.field9929[var2++];
                var4.field8688 = class723.field9929[var2++];
                var4.field8695 = class723.field9929[var2++];
                var4.field8703 = class723.field9929[var2++];
                var4.field8701 = class723.field9929[var2++];
                var4.field8699 = class723.field9929[var2++];
                var4.field8710 = class723.field9929[var2++];
            }
        }
        if (this.field696 != null) {
            for (int var5 = 0; var5 < this.field696.length; ++var5) {
                class72 var6 = this.field696[var5];
                class72 var7 = var6;
                if (var6.field1058 != null) {
                    var7 = var6.field1058;
                }
                if (var6.field1052 != null) {
                    var6.field1052.method1874(arg0);
                } else {
                    var6.field1052 = arg0.method1867();
                }
                var7.field1054 = class723.field9929[var2++];
                var7.field1061 = class723.field9929[var2++];
                var7.field1062 = class723.field9929[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILsk;)V")
    private final void method313(int[] arg0, class650 arg1) {
        this.field694.method4008().method3599(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
    public final void method314() {
        if (this.field694.field9942 > 1) {
            synchronized (this) {
                while (super.field6816) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6816 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method315();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method316(int arg0);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method317(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method318(int arg0);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method131(boolean arg0);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method319(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method320(int arg0);

    @OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
    private final native void method321(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()[Lqr;")
    public final class72[] method322() {
        return this.field696;
    }

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method323();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class499 method324(byte arg0, int arg1, boolean arg2) {
        return this.field694.method4008().method3625(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class196 method325(class196 arg0);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method326();

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method327();

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
    public final void method328() {
        if (this.field694.field9942 > 1) {
            synchronized (this) {
                super.field6816 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class44(class723 arg0) {
        this.field694 = arg0;
        this.field695 = null;
        this.method287(arg0);
    }
}
