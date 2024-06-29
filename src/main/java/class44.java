import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class44 extends class497 implements class558 {

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Loa;")
    private class721 field466;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lya;")
    private class59 field469;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[Lvja;")
    public class290[] field467;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[Lrea;")
    public class220[] field468;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILal;ZII)Z", line = 6)
    public final boolean method245(int arg0, int arg1, class109 arg2, boolean arg3, int arg4, int arg5) {
        return this.field466.method3978().method3541(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 10)
    public final void method247(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method243(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILal;ZI)Z", line = 13)
    public final boolean method248(int arg0, int arg1, class109 arg2, boolean arg3, int arg4) {
        return this.field466.method3978().method3569(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lal;Lju;I)V", line = 22)
    public final void method254(class109 arg0, class136 arg1, int arg2) {
        if (arg1 == null) {
            this.field466.method3978().method3551(this, arg0, (int[]) null, arg2);
        } else {
            class721.field9806[5] = 0;
            this.field466.method3978().method3551(this, arg0, class721.field9806, arg2);
            arg1.field1842 = class721.field9806[0];
            arg1.field1841 = class721.field9806[1];
            arg1.field1843 = class721.field9806[2];
            arg1.field1844 = class721.field9806[3];
            arg1.field1845 = class721.field9806[4];
            arg1.field1840 = class721.field9806[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Z", line = 39)
    public final boolean method255() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILal;)V", line = 43)
    private final void method257(int[] arg0, class109 arg1) {
        this.field466.method3978().method3558(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lal;Lju;II)V", line = 46)
    public final void method258(class109 arg0, class136 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field466.method3978().method3563(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class721.field9806[5] = 0;
            this.field466.method3978().method3563(this, arg0, class721.field9806, arg2, arg3);
            arg1.field1842 = class721.field9806[0];
            arg1.field1841 = class721.field9806[1];
            arg1.field1843 = class721.field9806[2];
            arg1.field1844 = class721.field9806[3];
            arg1.field1845 = class721.field9806[4];
            arg1.field1840 = class721.field9806[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lal;)V", line = 62)
    public final void method259(class109 arg0) {
        this.method257(class721.field9807, arg0);
        int var2 = 0;
        if (this.field467 != null) {
            for (int var3 = 0; var3 < this.field467.length; ++var3) {
                class290 var4 = this.field467[var3];
                var4.field4146 = class721.field9807[var2++];
                var4.field4129 = class721.field9807[var2++];
                var4.field4132 = class721.field9807[var2++];
                var4.field4136 = class721.field9807[var2++];
                var4.field4147 = class721.field9807[var2++];
                var4.field4135 = class721.field9807[var2++];
                var4.field4149 = class721.field9807[var2++];
                var4.field4139 = class721.field9807[var2++];
                var4.field4131 = class721.field9807[var2++];
            }
        }
        if (this.field468 != null) {
            for (int var5 = 0; var5 < this.field468.length; ++var5) {
                class220 var6 = this.field468[var5];
                class220 var7 = var6;
                if (var6.field2855 != null) {
                    var7 = var6.field2855;
                }
                if (var6.field2845 != null) {
                    var6.field2845.method816(arg0);
                } else {
                    var6.field2845 = arg0.method813();
                }
                var7.field2853 = class721.field9807[var2++];
                var7.field2848 = class721.field9807[var2++];
                var7.field2846 = class721.field9807[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lal;IZ)V", line = 118)
    public final void method261(class109 arg0, int arg1, boolean arg2) {
        this.method276(((class293) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()[Lvja;", line = 122)
    public final class290[] method263() {
        return this.field467;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 131)
    public final void method269() {
        if (this.field466.field9802 > 1) {
            synchronized (this) {
                while (super.field6980) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6980 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 149)
    public final class497 method271(byte arg0, int arg1, boolean arg2) {
        return this.field466.method3978().method3565(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 155)
    public final void method274() {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 162)
    public final void method279(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lrea;", line = 169)
    public final class220[] method283() {
        return this.field468;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 174)
    public final void method286() {
        if (this.field466.field9802 > 1) {
            synchronized (this) {
                super.field6980 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 184)
    public final void method287(class497 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field466.method3978().method3557(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 188)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class766.method4210((byte) -4, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lgl;IIII)V", line = 199)
    public class44(class721 arg0, class59 arg1, class625 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field466 = arg0;
        this.field469 = arg1;
        this.field467 = arg2.field8434;
        this.field468 = arg2.field8430;
        int var8 = arg2.field8434 == null ? 0 : arg2.field8434.length;
        int var9 = arg2.field8430 == null ? 0 : arg2.field8430.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field467[var12].field4142;
            var11[var10++] = this.field467[var12].field4145;
            var11[var10++] = this.field467[var12].field4133;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field468[var13].field2854;
        }
        int var14 = arg2.field8463 == null ? 0 : arg2.field8463.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class390 var20 = arg2.field8463[var17];
            class235 var21 = class345.method2185(127, var20.field5642);
            var15[var16++] = var20.field5641;
            var15[var16++] = var21.field3131;
            var15[var16++] = var21.field3130;
            var15[var16++] = var21.field3124;
            var15[var16++] = var21.field3132;
            var15[var16++] = var21.field3126;
            var15[var16++] = var21.field3125 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class390 var19 = arg2.field8463[var18];
            var15[var16++] = var19.field5645;
        }
        this.method275(this.field466, this.field469, arg2.field8438, arg2.field8459, arg2.field8453, arg2.field8441, arg2.field8452, arg2.field8448, arg2.field8471, arg2.field8442, arg2.field8461, arg2.field8421, arg2.field8437, arg2.field8428, arg2.field8470, arg2.field8466, arg2.field8447, arg2.field8439, arg2.field8467, arg2.field8455, arg2.field8422, arg2.field8460, arg2.field8468, arg2.field8427, arg2.field8436, arg2.field8454, arg2.field8440, arg2.field8426, arg2.field8444, arg2.field8424, arg2.field8446, arg2.field8476, arg2.field8449, arg2.field8431, arg2.field8458, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 274)
    public class44(class721 arg0) {
        this.field466 = arg0;
        this.field469 = null;
        this.method249(arg0);
    }

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method105(boolean arg0);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method243(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method244(int arg0);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method246();

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method249(class721 arg0);

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method250();

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method251(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method252();

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method253(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method256(int arg0);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method260();

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method262();

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method264();

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method265();

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method266(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method267(int arg0);

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method268();

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method270(int arg0);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method272();

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method273();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method275(class721 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
    private final native void method276(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method277();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method278(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method280();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method281(int arg0, int arg1, class295 arg2, class295 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method282(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method284(int arg0);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method285();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method288();

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class195 method289(class195 arg0);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method290(int arg0);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method291();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method292();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method293(int arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method294(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method295(short arg0, short arg1);
}
