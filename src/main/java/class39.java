import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class39 extends class471 implements class532 {

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Loa;")
    private class693 field484;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lya;")
    private class51 field485;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "[Lde;")
    public class531[] field487;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[Lok;")
    public class253[] field486;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 10)
    public final void method220() {
        if (this.field484.field9564 > 1) {
            synchronized (this) {
                super.field6676 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnga;Lfn;I)V", line = 20)
    public final void method221(class513 arg0, class137 arg1, int arg2) {
        if (arg1 == null) {
            this.field484.method3904().method3480(this, arg0, (int[]) null, arg2);
        } else {
            class693.field9555[5] = 0;
            this.field484.method3904().method3480(this, arg0, class693.field9555, arg2);
            arg1.field1985 = class693.field9555[0];
            arg1.field1986 = class693.field9555[1];
            arg1.field1990 = class693.field9555[2];
            arg1.field1989 = class693.field9555[3];
            arg1.field1988 = class693.field9555[4];
            arg1.field1987 = class693.field9555[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 41)
    public final void method225(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 45)
    public final class471 method226(byte arg0, int arg1, boolean arg2) {
        return this.field484.method3904().method3467(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lde;", line = 48)
    public final class531[] method227() {
        return this.field487;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILnga;ZII)Z", line = 52)
    public final boolean method229(int arg0, int arg1, class513 arg2, boolean arg3, int arg4, int arg5) {
        return this.field484.method3904().method3454(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 54)
    public final void method230() {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 58)
    public final void method232(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method240(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILnga;ZI)Z", line = 61)
    public final boolean method233(int arg0, int arg1, class513 arg2, boolean arg3, int arg4) {
        return this.field484.method3904().method3464(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 67)
    public final void method237(class471 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field484.method3904().method3461(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnga;)V", line = 72)
    public final void method239(class513 arg0) {
        this.method267(class693.field9552, arg0);
        int var2 = 0;
        if (this.field487 != null) {
            for (int var3 = 0; var3 < this.field487.length; ++var3) {
                class531 var4 = this.field487[var3];
                var4.field7478 = class693.field9552[var2++];
                var4.field7485 = class693.field9552[var2++];
                var4.field7491 = class693.field9552[var2++];
                var4.field7490 = class693.field9552[var2++];
                var4.field7480 = class693.field9552[var2++];
                var4.field7479 = class693.field9552[var2++];
                var4.field7488 = class693.field9552[var2++];
                var4.field7495 = class693.field9552[var2++];
                var4.field7477 = class693.field9552[var2++];
            }
        }
        if (this.field486 != null) {
            for (int var5 = 0; var5 < this.field486.length; ++var5) {
                class253 var6 = this.field486[var5];
                class253 var7 = var6;
                if (var6.field3707 != null) {
                    var7 = var6.field3707;
                }
                if (var6.field3701 != null) {
                    var6.field3701.method344(arg0);
                } else {
                    var6.field3701 = arg0.method349();
                }
                var7.field3702 = class693.field9552[var2++];
                var7.field3706 = class693.field9552[var2++];
                var7.field3698 = class693.field9552[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lok;", line = 128)
    public final class253[] method241() {
        return this.field486;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 148)
    public final void method256() {
        if (this.field484.field9564 > 1) {
            synchronized (this) {
                while (super.field6676) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6676 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()Z", line = 165)
    public final boolean method257() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnga;Lfn;II)V", line = 172)
    public final void method262(class513 arg0, class137 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field484.method3904().method3465(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class693.field9555[5] = 0;
            this.field484.method3904().method3465(this, arg0, class693.field9555, arg2, arg3);
            arg1.field1985 = class693.field9555[0];
            arg1.field1986 = class693.field9555[1];
            arg1.field1990 = class693.field9555[2];
            arg1.field1989 = class693.field9555[3];
            arg1.field1988 = class693.field9555[4];
            arg1.field1987 = class693.field9555[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnga;IZ)V", line = 190)
    public final void method264(class513 arg0, int arg1, boolean arg2) {
        this.method219(((class276) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILnga;)V", line = 196)
    private final void method267(int[] arg0, class513 arg1) {
        this.field484.method3904().method3462(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lie;IIII)V", line = 198)
    public class39(class693 arg0, class51 arg1, class6 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field484 = arg0;
        this.field485 = arg1;
        this.field487 = arg2.field84;
        this.field486 = arg2.field55;
        int var8 = arg2.field84 == null ? 0 : arg2.field84.length;
        int var9 = arg2.field55 == null ? 0 : arg2.field55.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field487[var12].field7492;
            var11[var10++] = this.field487[var12].field7496;
            var11[var10++] = this.field487[var12].field7483;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field486[var13].field3693;
        }
        int var14 = arg2.field77 == null ? 0 : arg2.field77.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class271 var20 = arg2.field77[var17];
            class346 var21 = class529.method3080(0, var20.field3878);
            var15[var16++] = var20.field3876;
            var15[var16++] = var21.field4869;
            var15[var16++] = var21.field4864;
            var15[var16++] = var21.field4866;
            var15[var16++] = var21.field4877;
            var15[var16++] = var21.field4876;
            var15[var16++] = var21.field4873 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class271 var19 = arg2.field77[var18];
            var15[var16++] = var19.field3881;
        }
        this.method247(this.field484, this.field485, arg2.field63, arg2.field96, arg2.field73, arg2.field107, arg2.field54, arg2.field102, arg2.field57, arg2.field103, arg2.field82, arg2.field72, arg2.field67, arg2.field74, arg2.field90, arg2.field79, arg2.field108, arg2.field83, arg2.field91, arg2.field78, arg2.field106, arg2.field61, arg2.field85, arg2.field75, arg2.field60, arg2.field58, arg2.field88, arg2.field65, arg2.field86, arg2.field100, arg2.field56, arg2.field69, arg2.field97, arg2.field81, arg2.field98, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 270)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class198.method1216((byte) 123, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 274)
    public class39(class693 arg0) {
        this.field484 = arg0;
        this.field485 = null;
        this.method251(arg0);
    }

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method216(class39 arg0, class39 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class180 method217(class180 arg0);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method218();

    @OriginalMember(owner = "client!i", name = "D", descriptor = "(JIZ)V")
    private final native void method219(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method222();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method223(int arg0);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method224();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method106(boolean arg0);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method228();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method231(int arg0);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method234();

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method235(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method236();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method238(int arg0);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method240(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method242(int arg0);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method243();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method244(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method245();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method246();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method247(class693 arg0, class51 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method248(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method249(int arg0);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method250(int arg0);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method251(class693 arg0);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method252(int arg0);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method253();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method254();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method255(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method258(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method259();

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method260();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method261(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method263();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method265();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method266();

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method268(int arg0, int arg1, int arg2, int arg3);
}
