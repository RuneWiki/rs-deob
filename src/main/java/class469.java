import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class469 extends class285 implements class194 {

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "Lw;")
    private class69 field6772;

    @OriginalMember(owner = "client!xa", name = "m", descriptor = "Lg;")
    private class424 field6773;

    @OriginalMember(owner = "client!xa", name = "k", descriptor = "[Lmf;")
    public class51[] field6771;

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "[Lqe;")
    public class502[] field6774;

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
    public final native void method660(int arg0);

    @OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
    public final native void method720(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
    public final native void method711(int arg0);

    @OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILya;Lya;III)V")
    public final native void method685(int arg0, int arg1, class11 arg2, class11 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final native void method683(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lrr;II)V")
    public final void method666(class512 arg0, class305 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field6772.method487().method433(this, arg0, null, arg2, arg3);
            return;
        }
        class69.field995[5] = 0;
        this.field6772.method487().method433(this, arg0, class69.field995, arg2, arg3);
        arg1.field4131 = class69.field995[0];
        arg1.field4136 = class69.field995[1];
        arg1.field4133 = class69.field995[2];
        arg1.field4134 = class69.field995[3];
        arg1.field4132 = class69.field995[4];
        arg1.field4135 = class69.field995[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
    public final native void method692(int arg0);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
    public final native void method675(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lw;Lg;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2724(class69 arg0, class424 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
    public final native int method722();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
    public final void method707(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
    public final native int method681();

    @OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
    public final native void method686();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method698(class285 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6772.method487().method450(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()V")
    public final void method687() {
    }

    @OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
    public final native int method700();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()[Lmf;")
    public final class51[] method715() {
        return this.field6771;
    }

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
    public final native void method712(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
    public final native void method667(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
    public final native int method723();

    @OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
    public final native int method661();

    @OriginalMember(owner = "client!xa", name = "d", descriptor = "()Z")
    public final boolean method696() {
        return true;
    }

    @OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
    public final native int method671();

    @OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
    public final native int method682();

    @OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lxa;Lxa;IZZ)V")
    public final native void method2725(class469 arg0, class469 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!xa", name = "c", descriptor = "()[Lqe;")
    public final class502[] method709() {
        return this.field6774;
    }

    @OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
    public final native int method716();

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
    public final native void method442();

    @OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lw;)V")
    private final native void method2726(class69 arg0);

    @OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
    public final native void method668(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Le;")
    public final class285 method697(byte arg0, int arg1, boolean arg2) {
        return this.field6772.method487().method439(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method684(int arg0, int arg1, class512 arg2, boolean arg3) {
        return this.field6772.method487().method441(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1547(-1, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
    public final native void method665();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lrr;I)V")
    public final void method701(class512 arg0, class305 arg1, int arg2) {
        if (arg1 == null) {
            this.field6772.method487().method438(this, arg0, null, arg2);
            return;
        }
        class69.field995[5] = 0;
        this.field6772.method487().method438(this, arg0, class69.field995, arg2);
        arg1.field4131 = class69.field995[0];
        arg1.field4136 = class69.field995[1];
        arg1.field4133 = class69.field995[2];
        arg1.field4134 = class69.field995[3];
        arg1.field4132 = class69.field995[4];
        arg1.field4135 = class69.field995[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;Lg;Lqq;IIII)V")
    public class469(class69 arg0, class424 arg1, class496 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6772 = arg0;
        this.field6773 = arg1;
        this.field6771 = arg2.field7217;
        this.field6774 = arg2.field7262;
        int var8 = arg2.field7217 == null ? 0 : arg2.field7217.length;
        int var9 = arg2.field7262 == null ? 0 : arg2.field7262.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field6771[var12].field735;
            var11[var10++] = this.field6771[var12].field737;
            var11[var10++] = this.field6771[var12].field738;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field6774[var13].field7344;
        }
        int var14 = arg2.field7238 == null ? 0 : arg2.field7238.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class87 var20 = arg2.field7238[var17];
            class385 var21 = class523.method3107(23244, var20.field1415);
            var15[var16++] = var20.field1420;
            var15[var16++] = var21.field5524;
            var15[var16++] = var21.field5529;
            var15[var16++] = var21.field5522;
            var15[var16++] = var21.field5525;
            var15[var16++] = var21.field5526;
            var15[var16++] = var21.field5521 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class87 var19 = arg2.field7238[var18];
            var15[var16++] = var19.field1419;
        }
        this.method2724(this.field6772, this.field6773, arg2.field7234, arg2.field7228, arg2.field7265, arg2.field7239, arg2.field7257, arg2.field7264, arg2.field7223, arg2.field7232, arg2.field7248, arg2.field7216, arg2.field7220, arg2.field7245, arg2.field7259, arg2.field7255, arg2.field7241, arg2.field7251, arg2.field7244, arg2.field7210, arg2.field7243, arg2.field7246, arg2.field7235, arg2.field7229, arg2.field7233, arg2.field7252, arg2.field7230, arg2.field7214, arg2.field7219, arg2.field7227, arg2.field7231, arg2.field7225, arg2.field7224, arg2.field7249, arg2.field7256, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
    public final native void method704(int arg0);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
    public final native void method680(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;)V")
    public class469(class69 arg0) {
        this.field6772 = arg0;
        this.field6773 = null;
        this.method2726(arg0);
    }

    @OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
    public final native void method703(int arg0);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILc;)V")
    public final void method2727(int arg0, class512 arg1) {
        int var3 = arg0;
        if (this.field6771 != null) {
            for (int var4 = 0; var4 < this.field6771.length; var4++) {
                class51 var5 = this.field6771[var4];
                var5.field741 = class69.field990[var3++];
                var5.field729 = class69.field990[var3++];
                var5.field747 = class69.field990[var3++];
                var5.field730 = class69.field990[var3++];
                var5.field734 = class69.field990[var3++];
                var5.field749 = class69.field990[var3++];
                var5.field744 = class69.field990[var3++];
                var5.field742 = class69.field990[var3++];
                var5.field732 = class69.field990[var3++];
            }
        }
        if (this.field6774 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field6774.length; var6++) {
            class502 var7 = this.field6774[var6];
            class502 var8 = var7;
            if (var7.field7342 != null) {
                var8 = var7.field7342;
            }
            if (var7.field7345 == null) {
                var7.field7345 = arg1.method947();
            } else {
                var7.field7345.method944(arg1);
            }
            var8.field7338 = class69.field990[var3++];
            var8.field7332 = class69.field990[var3++];
            var8.field7333 = class69.field990[var3++];
        }
    }

    @OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
    public final native void method688(int arg0);

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
    public final native void method690(int arg0);

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
    public final native int method691();

    @OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
    public final native int method670();

    @OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
    public final native boolean method664();

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Li;)Li;")
    public final native class197 method662(class197 arg0);
}
