import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class144 extends class121 implements class276 {

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lh;")
    private class469 field2146;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lba;")
    private class262 field2147;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[Lu;")
    public class52[] field2148;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[Lat;")
    public class255[] field2149;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
    public final native void method700(int arg0);

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()Z")
    public final boolean method748() {
        return true;
    }

    @OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILna;Lna;III)V")
    public final native void method687(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
    public final native void method731();

    @OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
    public final native void method713(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILia;)V")
    public final void method954(int arg0, class414 arg1) {
        int var3 = arg0;
        if (this.field2148 != null) {
            for (int var4 = 0; var4 < this.field2148.length; var4++) {
                class52 var5 = this.field2148[var4];
                var5.field813 = class469.field6908[var3++];
                var5.field809 = class469.field6908[var3++];
                var5.field818 = class469.field6908[var3++];
                var5.field812 = class469.field6908[var3++];
                var5.field827 = class469.field6908[var3++];
                var5.field828 = class469.field6908[var3++];
                var5.field826 = class469.field6908[var3++];
                var5.field830 = class469.field6908[var3++];
                var5.field816 = class469.field6908[var3++];
            }
        }
        if (this.field2149 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2149.length; var6++) {
            class255 var7 = this.field2149[var6];
            class255 var8 = var7;
            if (var7.field3779 != null) {
                var8 = var7.field3779;
            }
            if (var7.field3774 == null) {
                var7.field3774 = arg1.method910();
            } else {
                var7.field3774.method903(arg1);
            }
            var8.field3776 = class469.field6908[var3++];
            var8.field3782 = class469.field6908[var3++];
            var8.field3773 = class469.field6908[var3++];
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()V")
    public final void method721() {
    }

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lh;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method955(class469 arg0, class262 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
    public final native int method711();

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lvk;I)V")
    public final void method720(class414 arg0, class247 arg1, int arg2) {
        if (arg1 == null) {
            this.field2146.method2802().method55(this, arg0, null, arg2);
            return;
        }
        class469.field6918[5] = 0;
        this.field2146.method2802().method55(this, arg0, class469.field6918, arg2);
        arg1.field3633 = class469.field6918[0];
        arg1.field3634 = class469.field6918[1];
        arg1.field3632 = class469.field6918[2];
        arg1.field3630 = class469.field6918[3];
        arg1.field3631 = class469.field6918[4];
        arg1.field3629 = class469.field6918[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
    public final native void method719(int arg0);

    @OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
    public final native void method735(int arg0);

    @OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
    public final native void method705(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lvk;II)V")
    public final void method691(class414 arg0, class247 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2146.method2802().method68(this, arg0, null, arg2, arg3);
            return;
        }
        class469.field6918[5] = 0;
        this.field2146.method2802().method68(this, arg0, class469.field6918, arg2, arg3);
        arg1.field3633 = class469.field6918[0];
        arg1.field3634 = class469.field6918[1];
        arg1.field3632 = class469.field6918[2];
        arg1.field3630 = class469.field6918[3];
        arg1.field3631 = class469.field6918[4];
        arg1.field3629 = class469.field6918[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lc;IIIZ)V")
    public final void method722(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2146.method2802().method65(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILia;Z)Z")
    public final boolean method706(int arg0, int arg1, class414 arg2, boolean arg3) {
        return this.field2146.method2802().method61(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public final native int method709();

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()[Lu;")
    public final class52[] method747() {
        return this.field2148;
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class236.method1601(-60, this);
    }

    @OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
    public final native void method739(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
    public final native void method688(int arg0);

    @OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
    public final native int method743();

    @OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
    public final native int method746();

    @OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
    public final native void method695(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
    public final void method742(int arg0, int arg1, int arg2, int arg3) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
    public final native void method744(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
    public final native void method697(int arg0);

    @OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
    public final native void method689(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
    public final native void method732(int arg0);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
    public final native void method741(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lj;)Lj;")
    public final native class377 method745(class377 arg0);

    @OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
    public final native int method724();

    @OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lh;)V")
    private final native void method956(class469 arg0);

    @OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
    public final native boolean method715();

    @OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
    public final native int method698();

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lc;")
    public final class121 method723(byte arg0, int arg1, boolean arg2) {
        return this.field2146.method2802().method54(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
    public final native int method716();

    @OriginalMember(owner = "client!p", name = "j", descriptor = "(Lp;Lp;IZZ)V")
    public final native void method957(class144 arg0, class144 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
    public final native int method738();

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()[Lat;")
    public final class255[] method703() {
        return this.field2149;
    }

    @OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
    public final native int method717();

    @OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
    public final native void method736();

    @OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
    public final native void method60();

    @OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
    public final native void method685(int arg0);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;Lba;Lqc;IIII)V")
    public class144(class469 arg0, class262 arg1, class521 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2146 = arg0;
        this.field2147 = arg1;
        this.field2148 = arg2.field7683;
        this.field2149 = arg2.field7711;
        int var8 = arg2.field7683 == null ? 0 : arg2.field7683.length;
        int var9 = arg2.field7711 == null ? 0 : arg2.field7711.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field2148[var12].field808;
            var11[var10++] = this.field2148[var12].field815;
            var11[var10++] = this.field2148[var12].field811;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field2149[var13].field3777;
        }
        int var14 = arg2.field7707 == null ? 0 : arg2.field7707.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class287 var20 = arg2.field7707[var17];
            class54 var21 = class477.method2844(var20.field4115, (byte) -120);
            var15[var16++] = var20.field4109;
            var15[var16++] = var21.field839;
            var15[var16++] = var21.field846;
            var15[var16++] = var21.field845;
            var15[var16++] = var21.field847;
            var15[var16++] = var21.field843;
            var15[var16++] = var21.field840 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class287 var19 = arg2.field7707[var18];
            var15[var16++] = var19.field4110;
        }
        this.method955(this.field2146, this.field2147, arg2.field7689, arg2.field7695, arg2.field7705, arg2.field7694, arg2.field7674, arg2.field7667, arg2.field7698, arg2.field7671, arg2.field7718, arg2.field7713, arg2.field7670, arg2.field7692, arg2.field7690, arg2.field7684, arg2.field7681, arg2.field7673, arg2.field7712, arg2.field7682, arg2.field7702, arg2.field7708, arg2.field7685, arg2.field7719, arg2.field7696, arg2.field7676, arg2.field7691, arg2.field7716, arg2.field7709, arg2.field7693, arg2.field7669, arg2.field7714, arg2.field7675, arg2.field7710, arg2.field7680, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;)V")
    public class144(class469 arg0) {
        this.field2146 = arg0;
        this.field2147 = null;
        this.method956(arg0);
    }

    @OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
    public final native int method694();
}
