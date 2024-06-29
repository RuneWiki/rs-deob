import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class767 extends class233 implements class784 {

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Loa;")
    private class53 field10598;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lya;")
    private class318 field10597;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[Lpi;")
    public class335[] field10599;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[Lgfa;")
    public class740[] field10600;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILdm;)V", line = 5)
    private final void method4239(int[] arg0, class765 arg1) {
        this.field10598.method493().method3859(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 9)
    public final void method583() {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 15)
    public final void method559(class233 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field10598.method493().method3840(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 24)
    public final void method577(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method4240(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 27)
    public final void method578(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldm;Let;II)V", line = 31)
    public final void method546(class765 arg0, class749 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field10598.method493().method3861(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class53.field749[5] = 0;
            this.field10598.method493().method3861(this, arg0, class53.field749, arg2, arg3);
            arg1.field10403 = class53.field749[0];
            arg1.field10405 = class53.field749[1];
            arg1.field10402 = class53.field749[2];
            arg1.field10401 = class53.field749[3];
            arg1.field10400 = class53.field749[4];
            arg1.field10404 = class53.field749[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldm;IZ)V", line = 51)
    public final void method556(class765 arg0, int arg1, boolean arg2) {
        this.method4241(((class669) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lpi;", line = 55)
    public final class335[] method590() {
        return this.field10599;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILdm;ZI)Z", line = 58)
    public final boolean method589(int arg0, int arg1, class765 arg2, boolean arg3, int arg4) {
        return this.field10598.method493().method3841(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 66)
    public final void method562() {
        if (this.field10598.field762 > 1) {
            synchronized (this) {
                super.field3387 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()Z", line = 79)
    public final boolean method597() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldm;)V", line = 86)
    public final void method582(class765 arg0) {
        this.method4239(class53.field752, arg0);
        int var2 = 0;
        if (this.field10599 != null) {
            for (int var3 = 0; var3 < this.field10599.length; ++var3) {
                class335 var4 = this.field10599[var3];
                var4.field4762 = class53.field752[var2++];
                var4.field4755 = class53.field752[var2++];
                var4.field4752 = class53.field752[var2++];
                var4.field4751 = class53.field752[var2++];
                var4.field4761 = class53.field752[var2++];
                var4.field4771 = class53.field752[var2++];
                var4.field4758 = class53.field752[var2++];
                var4.field4764 = class53.field752[var2++];
                var4.field4750 = class53.field752[var2++];
            }
        }
        if (this.field10600 != null) {
            for (int var5 = 0; var5 < this.field10600.length; ++var5) {
                class740 var6 = this.field10600[var5];
                class740 var7 = var6;
                if (var6.field10252 != null) {
                    var7 = var6.field10252;
                }
                if (var6.field10247 != null) {
                    var6.field10247.method1552(arg0);
                } else {
                    var6.field10247 = arg0.method1556();
                }
                var7.field10251 = class53.field752[var2++];
                var7.field10245 = class53.field752[var2++];
                var7.field10244 = class53.field752[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 145)
    public final class233 method585(byte arg0, int arg1, boolean arg2) {
        return this.field10598.method493().method3850(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILdm;ZII)Z", line = 149)
    public final boolean method584(int arg0, int arg1, class765 arg2, boolean arg3, int arg4, int arg5) {
        return this.field10598.method493().method3853(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lgfa;", line = 152)
    public final class740[] method588() {
        return this.field10600;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldm;Let;I)V", line = 158)
    public final void method575(class765 arg0, class749 arg1, int arg2) {
        if (arg1 == null) {
            this.field10598.method493().method3839(this, arg0, (int[]) null, arg2);
        } else {
            class53.field749[5] = 0;
            this.field10598.method493().method3839(this, arg0, class53.field749, arg2);
            arg1.field10403 = class53.field749[0];
            arg1.field10405 = class53.field749[1];
            arg1.field10402 = class53.field749[2];
            arg1.field10401 = class53.field749[3];
            arg1.field10400 = class53.field749[4];
            arg1.field10404 = class53.field749[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 176)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class270.method1726(this, -1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 183)
    public final void method549() {
        if (this.field10598.field762 > 1) {
            synchronized (this) {
                while (super.field3387) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field3387 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lida;IIII)V", line = 204)
    public class767(class53 arg0, class318 arg1, class678 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field10598 = arg0;
        this.field10597 = arg1;
        this.field10599 = arg2.field9556;
        this.field10600 = arg2.field9553;
        int var8 = arg2.field9556 == null ? 0 : arg2.field9556.length;
        int var9 = arg2.field9553 == null ? 0 : arg2.field9553.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field10599[var12].field4765;
            var11[var10++] = this.field10599[var12].field4770;
            var11[var10++] = this.field10599[var12].field4753;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field10600[var13].field10249;
        }
        int var14 = arg2.field9583 == null ? 0 : arg2.field9583.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class143 var20 = arg2.field9583[var17];
            class480 var21 = class639.method3631(0, var20.field2328);
            var15[var16++] = var20.field2329;
            var15[var16++] = var21.field6596;
            var15[var16++] = var21.field6597;
            var15[var16++] = var21.field6594;
            var15[var16++] = var21.field6595;
            var15[var16++] = var21.field6600;
            var15[var16++] = var21.field6602 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class143 var19 = arg2.field9583[var18];
            var15[var16++] = var19.field2326;
        }
        this.method4243(this.field10598, this.field10597, arg2.field9551, arg2.field9587, arg2.field9561, arg2.field9580, arg2.field9584, arg2.field9545, arg2.field9563, arg2.field9569, arg2.field9582, arg2.field9586, arg2.field9557, arg2.field9542, arg2.field9575, arg2.field9559, arg2.field9578, arg2.field9581, arg2.field9570, arg2.field9573, arg2.field9544, arg2.field9590, arg2.field9593, arg2.field9554, arg2.field9552, arg2.field9543, arg2.field9546, arg2.field9568, arg2.field9589, arg2.field9558, arg2.field9547, arg2.field9555, arg2.field9550, arg2.field9576, arg2.field9562, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 275)
    public class767(class53 arg0) {
        this.field10598 = arg0;
        this.field10597 = null;
        this.method4244(arg0);
    }

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method565(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method525();

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class115 method539(class115 arg0);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method523(int arg0);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method544();

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method572();

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method564(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method4240(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method526();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method587();

    @OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
    private final native void method4241(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method555(int arg0);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method574(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method563(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method530(int arg0);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method558();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method547();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method576();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method567();

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method4242(class767 arg0, class767 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method554(int arg0, int arg1, class419 arg2, class419 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method591();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method527();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method4243(class53 arg0, class318 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method568(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method596();

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method534();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method550(int arg0);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method541();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method444(boolean arg0);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method566();

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method543(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method599(int arg0);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method557(int arg0);

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method594(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method581();

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method4244(class53 arg0);
}
