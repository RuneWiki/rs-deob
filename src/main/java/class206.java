import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class206 extends class629 implements class89 {

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lda;")
    private class682 field2690;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "La;")
    private class405 field2692;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[Ljq;")
    public class594[] field2691;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "[Lpp;")
    public class190[] field2689;

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()[Lpp;", line = 12)
    public final class190[] method694() {
        return this.field2689;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lba;IIIZ)V", line = 15)
    public final void method646(class629 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2690.method3767().method879(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([ILq;)V", line = 25)
    private final void method1287(int[] arg0, class111 arg1) {
        this.field2690.method3767().method891(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()[Ljq;", line = 28)
    public final class594[] method653() {
        return this.field2691;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lba;", line = 37)
    public final class629 method659(byte arg0, int arg1, boolean arg2) {
        return this.field2690.method3767().method890(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()Z", line = 43)
    public final boolean method642() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V", line = 53)
    public final void method678(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lqn;II)V", line = 60)
    public final void method672(class111 arg0, class455 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2690.method3767().method875(this, arg0, null, arg2, arg3);
            return;
        }
        class682.field9693[5] = 0;
        this.field2690.method3767().method875(this, arg0, class682.field9693, arg2, arg3);
        arg1.field6204 = class682.field9693[0];
        arg1.field6203 = class682.field9693[1];
        arg1.field6206 = class682.field9693[2];
        arg1.field6201 = class682.field9693[3];
        arg1.field6205 = class682.field9693[4];
        arg1.field6202 = class682.field9693[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 79)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lqn;I)V", line = 84)
    public final void method665(class111 arg0, class455 arg1, int arg2) {
        if (arg1 == null) {
            this.field2690.method3767().method882(this, arg0, null, arg2);
            return;
        }
        class682.field9693[5] = 0;
        this.field2690.method3767().method882(this, arg0, class682.field9693, arg2);
        arg1.field6204 = class682.field9693[0];
        arg1.field6203 = class682.field9693[1];
        arg1.field6206 = class682.field9693[2];
        arg1.field6201 = class682.field9693[3];
        arg1.field6205 = class682.field9693[4];
        arg1.field6202 = class682.field9693[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILq;Z)Z", line = 100)
    public final boolean method695(int arg0, int arg1, class111 arg2, boolean arg3) {
        return this.field2690.method3767().method876(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;La;Lrf;IIII)V", line = 106)
    public class206(class682 arg0, class405 arg1, class238 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2690 = arg0;
        this.field2692 = arg1;
        this.field2691 = arg2.field3135;
        this.field2689 = arg2.field3139;
        int var8 = arg2.field3135 == null ? 0 : arg2.field3135.length;
        int var9 = arg2.field3139 == null ? 0 : arg2.field3139.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field2691[var12].field8156;
            var11[var10++] = this.field2691[var12].field8151;
            var11[var10++] = this.field2691[var12].field8152;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field2689[var13].field2477;
        }
        int var14 = arg2.field3125 == null ? 0 : arg2.field3125.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class552 var20 = arg2.field3125[var17];
            class77 var21 = class266.method1640(var20.field7553, (byte) 111);
            var15[var16++] = var20.field7558;
            var15[var16++] = var21.field958;
            var15[var16++] = var21.field959;
            var15[var16++] = var21.field967;
            var15[var16++] = var21.field957;
            var15[var16++] = var21.field956;
            var15[var16++] = var21.field964 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class552 var19 = arg2.field3125[var18];
            var15[var16++] = var19.field7550;
        }
        this.method1285(this.field2690, this.field2692, arg2.field3140, arg2.field3117, arg2.field3134, arg2.field3101, arg2.field3103, arg2.field3110, arg2.field3133, arg2.field3107, arg2.field3090, arg2.field3115, arg2.field3106, arg2.field3089, arg2.field3100, arg2.field3121, arg2.field3129, arg2.field3116, arg2.field3138, arg2.field3113, arg2.field3094, arg2.field3122, arg2.field3095, arg2.field3097, arg2.field3091, arg2.field3128, arg2.field3092, arg2.field3119, arg2.field3127, arg2.field3104, arg2.field3096, arg2.field3131, arg2.field3105, arg2.field3143, arg2.field3102, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;)V", line = 177)
    public class206(class682 arg0) {
        this.field2690 = arg0;
        this.field2692 = null;
        this.method1286(arg0);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()V", line = 182)
    public final void method647() {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;)V", line = 185)
    public final void method656(class111 arg0) {
        this.method1287(class682.field9692, arg0);
        int var2 = 0;
        if (this.field2691 != null) {
            for (int var3 = 0; var3 < this.field2691.length; var3++) {
                class594 var4 = this.field2691[var3];
                var4.field8160 = class682.field9692[var2++];
                var4.field8142 = class682.field9692[var2++];
                var4.field8154 = class682.field9692[var2++];
                var4.field8146 = class682.field9692[var2++];
                var4.field8161 = class682.field9692[var2++];
                var4.field8148 = class682.field9692[var2++];
                var4.field8150 = class682.field9692[var2++];
                var4.field8149 = class682.field9692[var2++];
                var4.field8155 = class682.field9692[var2++];
            }
        }
        if (this.field2689 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field2689.length; var5++) {
            class190 var6 = this.field2689[var5];
            class190 var7 = var6;
            if (var6.field2474 != null) {
                var7 = var6.field2474;
            }
            if (var6.field2471 == null) {
                var6.field2471 = arg0.method596();
            } else {
                var6.field2471.method597(arg0);
            }
            var7.field2480 = class682.field9692[var2++];
            var7.field2476 = class682.field9692[var2++];
            var7.field2475 = class682.field9692[var2++];
        }
    }

    @OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
    public final native int method683();

    @OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final native void method674(int arg0, int arg1, class176 arg2, class176 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
    public final native void method687();

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
    public final native int method660();

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
    public final native boolean method671();

    @OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
    public final native void method667(int arg0);

    @OriginalMember(owner = "client!j", name = "za", descriptor = "(Lda;La;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1285(class682 arg0, class405 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lda;)V")
    private final native void method1286(class682 arg0);

    @OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
    public final native int method641();

    @OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
    public final native void method676(int arg0);

    @OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
    public final native void method670(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
    public final native void method668(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
    public final native void method645(int arg0);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
    public final native int method662();

    @OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
    public final native int method679();

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
    public final native void method691(int arg0);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
    public final native void method651();

    @OriginalMember(owner = "client!j", name = "L", descriptor = "(Lj;Lj;IZZ)V")
    public final native void method1288(class206 arg0, class206 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);

    @OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
    public final native void method650(int arg0);

    @OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
    public final native void method640(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
    public final native void method657(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
    public final native int method700();

    @OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
    public final native int method684();

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
    public final native void method680(int arg0);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
    public final native int method688();

    @OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
    public final native int method686();

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lw;)Lw;")
    public final native class451 method692(class451 arg0);

    @OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
    public final native void method655(int arg0);

    @OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
    public final native void method693(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
    public final native void method639(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
    public final native int method690();

    @OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final native void method701(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);
}
