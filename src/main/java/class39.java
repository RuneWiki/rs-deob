import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class39 extends class201 implements class47 {

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lh;")
    private class161 field616;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lba;")
    private class79 field617;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[Le;")
    public class525[] field614;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[Lil;")
    public class439[] field615;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V", line = 6)
    public final void method278(int arg0, int arg1, int arg2, int arg3) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()[Lil;", line = 16)
    public final class439[] method283() {
        return this.field615;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lmn;II)V", line = 28)
    public final void method291(class23 arg0, class159 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field616.method1060().method2695(this, arg0, null, arg2, arg3);
            return;
        }
        class161.field2327[5] = 0;
        this.field616.method1060().method2695(this, arg0, class161.field2327, arg2, arg3);
        arg1.field2314 = class161.field2327[0];
        arg1.field2317 = class161.field2327[1];
        arg1.field2318 = class161.field2327[2];
        arg1.field2319 = class161.field2327[3];
        arg1.field2316 = class161.field2327[4];
        arg1.field2315 = class161.field2327[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lc;", line = 44)
    public final class201 method292(byte arg0, int arg1, boolean arg2) {
        return this.field616.method1060().method2690(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()V", line = 48)
    public final void method295() {
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()[Le;", line = 51)
    public final class525[] method296() {
        return this.field614;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lc;IIIZ)V", line = 56)
    public final void method298(class201 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field616.method1060().method2688(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()Z", line = 59)
    public final boolean method299() {
        return true;
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() {
        class342.method2198(this, (byte) -50);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILia;Z)Z", line = 76)
    public final boolean method310(int arg0, int arg1, class23 arg2, boolean arg3) {
        return this.field616.method1060().method2699(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILia;)V", line = 82)
    public final void method313(int arg0, class23 arg1) {
        int var3 = arg0;
        if (this.field614 != null) {
            for (int var4 = 0; var4 < this.field614.length; var4++) {
                class525 var5 = this.field614[var4];
                var5.field7754 = class161.field2330[var3++];
                var5.field7753 = class161.field2330[var3++];
                var5.field7766 = class161.field2330[var3++];
                var5.field7761 = class161.field2330[var3++];
                var5.field7768 = class161.field2330[var3++];
                var5.field7757 = class161.field2330[var3++];
                var5.field7750 = class161.field2330[var3++];
                var5.field7764 = class161.field2330[var3++];
                var5.field7755 = class161.field2330[var3++];
            }
        }
        if (this.field615 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field615.length; var6++) {
            class439 var7 = this.field615[var6];
            class439 var8 = var7;
            if (var7.field6534 != null) {
                var8 = var7.field6534;
            }
            if (var7.field6548 == null) {
                var7.field6548 = arg1.method183();
            } else {
                var7.field6548.method179(arg1);
            }
            var8.field6545 = class161.field2330[var3++];
            var8.field6541 = class161.field2330[var3++];
            var8.field6537 = class161.field2330[var3++];
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lmn;I)V", line = 143)
    public final void method318(class23 arg0, class159 arg1, int arg2) {
        if (arg1 == null) {
            this.field616.method1060().method2698(this, arg0, null, arg2);
            return;
        }
        class161.field2327[5] = 0;
        this.field616.method1060().method2698(this, arg0, class161.field2327, arg2);
        arg1.field2314 = class161.field2327[0];
        arg1.field2317 = class161.field2327[1];
        arg1.field2318 = class161.field2327[2];
        arg1.field2319 = class161.field2327[3];
        arg1.field2316 = class161.field2327[4];
        arg1.field2315 = class161.field2327[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;Lba;Lro;IIII)V", line = 158)
    public class39(class161 arg0, class79 arg1, class192 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field616 = arg0;
        this.field617 = arg1;
        this.field614 = arg2.field2691;
        this.field615 = arg2.field2686;
        int var8 = arg2.field2691 == null ? 0 : arg2.field2691.length;
        int var9 = arg2.field2686 == null ? 0 : arg2.field2686.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field614[var12].field7756;
            var11[var10++] = this.field614[var12].field7765;
            var11[var10++] = this.field614[var12].field7769;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field615[var13].field6535;
        }
        int var14 = arg2.field2673 == null ? 0 : arg2.field2673.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class220 var20 = arg2.field2673[var17];
            class320 var21 = class411.method2501(var20.field3082, 0);
            var15[var16++] = var20.field3086;
            var15[var16++] = var21.field4898;
            var15[var16++] = var21.field4908;
            var15[var16++] = var21.field4899;
            var15[var16++] = var21.field4909;
            var15[var16++] = var21.field4901;
            var15[var16++] = var21.field4902 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class220 var19 = arg2.field2673[var18];
            var15[var16++] = var19.field3088;
        }
        this.method288(this.field616, this.field617, arg2.field2704, arg2.field2718, arg2.field2669, arg2.field2693, arg2.field2689, arg2.field2671, arg2.field2717, arg2.field2680, arg2.field2721, arg2.field2711, arg2.field2701, arg2.field2676, arg2.field2700, arg2.field2682, arg2.field2705, arg2.field2688, arg2.field2707, arg2.field2722, arg2.field2690, arg2.field2683, arg2.field2696, arg2.field2672, arg2.field2715, arg2.field2703, arg2.field2710, arg2.field2674, arg2.field2677, arg2.field2709, arg2.field2723, arg2.field2695, arg2.field2698, arg2.field2670, arg2.field2716, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;)V", line = 229)
    public class39(class161 arg0) {
        this.field616 = arg0;
        this.field617 = null;
        this.method314(arg0);
    }

    @OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
    public final native void method276(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
    public final native void method277(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
    public final native int method279();

    @OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
    public final native void method280(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
    public final native void method281(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
    public final native int method282();

    @OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
    public final native void method284();

    @OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lj;)Lj;")
    public final native class229 method285(class229 arg0);

    @OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
    public final native int method286();

    @OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
    public final native void method287(int arg0);

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lh;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method288(class161 arg0, class79 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
    public final native int method289();

    @OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
    public final native void method290(int arg0);

    @OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
    public final native void method293(int arg0);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
    public final native void method294(int arg0);

    @OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
    public final native void method297(int arg0);

    @OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
    public final native int method300();

    @OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
    public final native int method301();

    @OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
    public final native int method302();

    @OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
    public final native void method303(int arg0);

    @OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
    public final native void method304(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILna;Lna;III)V")
    public final native void method305(int arg0, int arg1, class206 arg2, class206 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public final native int method306();

    @OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
    public final native void method307(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
    public final native int method308();

    @OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
    public final native void method309(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
    public final native int method311();

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
    public final native void method312();

    @OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lh;)V")
    private final native void method314(class161 arg0);

    @OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
    public final native boolean method315();

    @OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
    public final native void method316(int arg0);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "(Lp;Lp;IZZ)V")
    public final native void method317(class39 arg0, class39 arg1, int arg2, boolean arg3, boolean arg4);
}
