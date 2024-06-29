import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class43 extends class471 implements class103 {

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Lqa;")
    private class163 field527;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Lna;")
    private class35 field528;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "[Lqc;")
    public class521[] field530;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[Lpd;")
    public class169[] field529;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V", line = 5)
    public final void method371() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()[Lpd;", line = 12)
    public final class169[] method374() {
        return this.field529;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lt;IIIZ)V", line = 15)
    public final void method375(class471 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field527.method1086().method76(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILc;)V", line = 21)
    public final void method377(int arg0, class122 arg1) {
        int var3 = arg0;
        if (this.field530 != null) {
            for (int var4 = 0; var4 < this.field530.length; var4++) {
                class521 var5 = this.field530[var4];
                var5.field7713 = class163.field2450[var3++];
                var5.field7716 = class163.field2450[var3++];
                var5.field7714 = class163.field2450[var3++];
                var5.field7718 = class163.field2450[var3++];
                var5.field7712 = class163.field2450[var3++];
                var5.field7708 = class163.field2450[var3++];
                var5.field7710 = class163.field2450[var3++];
                var5.field7711 = class163.field2450[var3++];
                var5.field7717 = class163.field2450[var3++];
            }
        }
        if (this.field529 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field529.length; var6++) {
            class169 var7 = this.field529[var6];
            class169 var8 = var7;
            if (var7.field2528 != null) {
                var8 = var7.field2528;
            }
            if (var7.field2518 == null) {
                var7.field2518 = arg1.method189();
            } else {
                var7.field2518.method192(arg1);
            }
            var8.field2526 = class163.field2450[var3++];
            var8.field2520 = class163.field2450[var3++];
            var8.field2529 = class163.field2450[var3++];
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lt;", line = 77)
    public final class471 method381(byte arg0, int arg1, boolean arg2) {
        return this.field527.method1086().method77(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lii;II)V", line = 82)
    public final void method384(class122 arg0, class387 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field527.method1086().method64(this, arg0, null, arg2, arg3);
            return;
        }
        class163.field2446[5] = 0;
        this.field527.method1086().method64(this, arg0, class163.field2446, arg2, arg3);
        arg1.field5643 = class163.field2446[0];
        arg1.field5645 = class163.field2446[1];
        arg1.field5640 = class163.field2446[2];
        arg1.field5642 = class163.field2446[3];
        arg1.field5641 = class163.field2446[4];
        arg1.field5644 = class163.field2446[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V", line = 102)
    protected final void finalize() {
        class1.method1(this, (byte) -31);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()Z", line = 106)
    public final boolean method388() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V", line = 110)
    public final void method390(int arg0, int arg1, int arg2, int arg3) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILc;Z)Z", line = 114)
    public final boolean method391(int arg0, int arg1, class122 arg2, boolean arg3) {
        return this.field527.method1086().method71(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lii;I)V", line = 125)
    public final void method397(class122 arg0, class387 arg1, int arg2) {
        if (arg1 == null) {
            this.field527.method1086().method74(this, arg0, null, arg2);
            return;
        }
        class163.field2446[5] = 0;
        this.field527.method1086().method74(this, arg0, class163.field2446, arg2);
        arg1.field5643 = class163.field2446[0];
        arg1.field5645 = class163.field2446[1];
        arg1.field5640 = class163.field2446[2];
        arg1.field5642 = class163.field2446[3];
        arg1.field5641 = class163.field2446[4];
        arg1.field5644 = class163.field2446[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()[Lqc;", line = 152)
    public final class521[] method406() {
        return this.field530;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;Lna;Lkq;IIII)V", line = 155)
    public class43(class163 arg0, class35 arg1, class419 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field527 = arg0;
        this.field528 = arg1;
        this.field530 = arg2.field6079;
        this.field529 = arg2.field6089;
        int var8 = arg2.field6079 == null ? 0 : arg2.field6079.length;
        int var9 = arg2.field6089 == null ? 0 : arg2.field6089.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field530[var12].field7726;
            var11[var10++] = this.field530[var12].field7719;
            var11[var10++] = this.field530[var12].field7722;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field529[var13].field2524;
        }
        int var14 = arg2.field6113 == null ? 0 : arg2.field6113.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class176 var20 = arg2.field6113[var17];
            class218 var21 = class201.method1251(var20.field2612, (byte) -105);
            var15[var16++] = var20.field2603;
            var15[var16++] = var21.field3036;
            var15[var16++] = var21.field3033;
            var15[var16++] = var21.field3030;
            var15[var16++] = var21.field3041;
            var15[var16++] = var21.field3038;
            var15[var16++] = var21.field3032 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class176 var19 = arg2.field6113[var18];
            var15[var16++] = var19.field2607;
        }
        this.method399(this.field527, this.field528, arg2.field6084, arg2.field6096, arg2.field6101, arg2.field6099, arg2.field6127, arg2.field6098, arg2.field6081, arg2.field6120, arg2.field6097, arg2.field6086, arg2.field6106, arg2.field6119, arg2.field6085, arg2.field6125, arg2.field6078, arg2.field6100, arg2.field6080, arg2.field6088, arg2.field6131, arg2.field6122, arg2.field6092, arg2.field6117, arg2.field6107, arg2.field6104, arg2.field6111, arg2.field6109, arg2.field6103, arg2.field6094, arg2.field6093, arg2.field6129, arg2.field6116, arg2.field6108, arg2.field6118, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;)V", line = 229)
    public class43(class163 arg0) {
        this.field527 = arg0;
        this.field528 = null;
        this.method407(arg0);
    }

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()I")
    public final native int method368();

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(Lba;)Lba;")
    public final native class263 method369(class263 arg0);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public final native int method370();

    @OriginalMember(owner = "client!da", name = "P", descriptor = "()I")
    public final native int method372();

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public final native void method376(int arg0);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I[IIIIZI[I)V")
    public final native void method378(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final native boolean method379();

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "()I")
    public final native int method380();

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public final native int method382();

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "(I)V")
    public final native void method383(int arg0);

    @OriginalMember(owner = "client!da", name = "E", descriptor = "(I)V")
    public final native void method385(int arg0);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()I")
    public final native int method386();

    @OriginalMember(owner = "client!da", name = "N", descriptor = "(IIII)V")
    public final native void method387(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method389();

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(III)V")
    public final native void method392(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(I)V")
    public final native void method393(int arg0);

    @OriginalMember(owner = "client!da", name = "NA", descriptor = "()I")
    public final native int method394();

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "()I")
    public final native int method395();

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "(I)V")
    public final native void method396(int arg0);

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()V")
    public final native void method398();

    @OriginalMember(owner = "client!da", name = "q", descriptor = "(Lqa;Lna;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method399(class163 arg0, class35 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!da", name = "I", descriptor = "(SS)V")
    public final native void method400(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(Lda;Lda;IZZ)V")
    public final native void method401(class43 arg0, class43 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "EA", descriptor = "()V")
    public final native void method66();

    @OriginalMember(owner = "client!da", name = "UA", descriptor = "(I)V")
    public final native void method402(int arg0);

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(III)V")
    public final native void method403(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()I")
    public final native int method404();

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IILta;Lta;III)V")
    public final native void method405(int arg0, int arg1, class142 arg2, class142 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lqa;)V")
    private final native void method407(class163 arg0);

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(SS)V")
    public final native void method408(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(I)V")
    public final native void method409(int arg0);

    @OriginalMember(owner = "client!da", name = "XA", descriptor = "(I[IIIIIZ)V")
    public final native void method410(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
