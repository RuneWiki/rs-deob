import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class43 extends class500 implements class559 {

    @OriginalMember(owner = "client!i", name = "x", descriptor = "Loa;")
    private class724 field670;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "Lya;")
    private class58 field669;

    @OriginalMember(owner = "client!i", name = "v", descriptor = "[Lcba;")
    public class577[] field668;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "[Lkw;")
    public class263[] field667;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILuu;ZI)Z")
    public final boolean method291(int arg0, int arg1, class303 arg2, boolean arg3, int arg4) {
        return this.field670.method4037().method3613(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Luu;Ltaa;I)V")
    public final void method292(class303 arg0, class431 arg1, int arg2) {
        if (arg1 == null) {
            this.field670.method4037().method3599(this, arg0, (int[]) null, arg2);
        } else {
            class724.field10079[5] = 0;
            this.field670.method4037().method3599(this, arg0, class724.field10079, arg2);
            arg1.field6123 = class724.field10079[0];
            arg1.field6124 = class724.field10079[1];
            arg1.field6125 = class724.field10079[2];
            arg1.field6122 = class724.field10079[3];
            arg1.field6121 = class724.field10079[4];
            arg1.field6126 = class724.field10079[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method293(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method294();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method151(boolean arg0);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method295(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Luu;)V")
    public final void method296(class303 arg0) {
        this.method302(class724.field10090, arg0);
        int var2 = 0;
        if (this.field668 != null) {
            for (int var3 = 0; var3 < this.field668.length; ++var3) {
                class577 var4 = this.field668[var3];
                var4.field7738 = class724.field10090[var2++];
                var4.field7733 = class724.field10090[var2++];
                var4.field7734 = class724.field10090[var2++];
                var4.field7739 = class724.field10090[var2++];
                var4.field7730 = class724.field10090[var2++];
                var4.field7748 = class724.field10090[var2++];
                var4.field7731 = class724.field10090[var2++];
                var4.field7747 = class724.field10090[var2++];
                var4.field7750 = class724.field10090[var2++];
            }
        }
        if (this.field667 != null) {
            for (int var5 = 0; var5 < this.field667.length; ++var5) {
                class263 var6 = this.field667[var5];
                class263 var7 = var6;
                if (var6.field3906 != null) {
                    var7 = var6.field3906;
                }
                if (var6.field3900 != null) {
                    var6.field3900.method986(arg0);
                } else {
                    var6.field3900 = arg0.method963();
                }
                var7.field3902 = class724.field10090[var2++];
                var7.field3907 = class724.field10090[var2++];
                var7.field3903 = class724.field10090[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method297(class500 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field670.method4037().method3584(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class500 method298(byte arg0, int arg1, boolean arg2) {
        return this.field670.method4037().method3595(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method299(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Luu;Ltaa;II)V")
    public final void method300(class303 arg0, class431 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field670.method4037().method3601(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class724.field10079[5] = 0;
            this.field670.method4037().method3601(this, arg0, class724.field10079, arg2, arg3);
            arg1.field6123 = class724.field10079[0];
            arg1.field6124 = class724.field10079[1];
            arg1.field6125 = class724.field10079[2];
            arg1.field6122 = class724.field10079[3];
            arg1.field6121 = class724.field10079[4];
            arg1.field6126 = class724.field10079[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class552.method3121(this, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
    public final void method301() {
        if (this.field670.field10097 > 1) {
            synchronized (this) {
                while (super.field6893) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6893 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILuu;)V")
    private final void method302(int[] arg0, class303 arg1) {
        this.field670.method4037().method3597(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method303(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method304();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method305();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method306(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method307(int arg0);

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lkw;")
    public final class263[] method308() {
        return this.field667;
    }

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method309();

    @OriginalMember(owner = "client!i", name = "K", descriptor = "(JIZ)V")
    private final native void method310(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILuu;ZII)Z")
    public final boolean method311(int arg0, int arg1, class303 arg2, boolean arg3, int arg4, int arg5) {
        return this.field670.method4037().method3604(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method312(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method323(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method313(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method314(class724 arg0, class58 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method315();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method316();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method317();

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method318(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method319(class724 arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Luu;IZ)V")
    public final void method320(class303 arg0, int arg1, boolean arg2) {
        this.method310(((class294) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method321(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class195 method322(class195 arg0);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method323(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method324(class43 arg0, class43 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method325();

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method326();

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method327();

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
    public final void method328() {
        if (this.field670.field10097 > 1) {
            synchronized (this) {
                super.field6893 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method329(int arg0);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method330();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method331(int arg0);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method332();

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()Z")
    public final boolean method333() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method334(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method335();

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method336(int arg0);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
    public final void method337() {
    }

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method338();

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lgfa;IIII)V")
    public class43(class724 arg0, class58 arg1, class782 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field670 = arg0;
        this.field669 = arg1;
        this.field668 = arg2.field10738;
        this.field667 = arg2.field10783;
        int var8 = arg2.field10738 == null ? 0 : arg2.field10738.length;
        int var9 = arg2.field10783 == null ? 0 : arg2.field10783.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field668[var12].field7745;
            var11[var10++] = this.field668[var12].field7741;
            var11[var10++] = this.field668[var12].field7737;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field667[var13].field3908;
        }
        int var14 = arg2.field10733 == null ? 0 : arg2.field10733.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class466 var20 = arg2.field10733[var17];
            class346 var21 = class344.method2183((byte) 113, var20.field6468);
            var15[var16++] = var20.field6464;
            var15[var16++] = var21.field5080;
            var15[var16++] = var21.field5081;
            var15[var16++] = var21.field5074;
            var15[var16++] = var21.field5077;
            var15[var16++] = var21.field5075;
            var15[var16++] = var21.field5076 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class466 var19 = arg2.field10733[var18];
            var15[var16++] = var19.field6469;
        }
        this.method314(this.field670, this.field669, arg2.field10746, arg2.field10756, arg2.field10777, arg2.field10771, arg2.field10734, arg2.field10755, arg2.field10740, arg2.field10752, arg2.field10757, arg2.field10768, arg2.field10750, arg2.field10776, arg2.field10742, arg2.field10781, arg2.field10785, arg2.field10732, arg2.field10778, arg2.field10770, arg2.field10767, arg2.field10751, arg2.field10773, arg2.field10759, arg2.field10788, arg2.field10763, arg2.field10758, arg2.field10765, arg2.field10772, arg2.field10743, arg2.field10761, arg2.field10735, arg2.field10786, arg2.field10766, arg2.field10760, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class43(class724 arg0) {
        this.field670 = arg0;
        this.field669 = null;
        this.method319(arg0);
    }

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method339();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method340();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lcba;")
    public final class577[] method341() {
        return this.field668;
    }

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method342(int arg0);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method343(int arg0);
}
