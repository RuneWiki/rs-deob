import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class507 extends class359 implements class145 {

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lda;")
    private class57 field6339;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "La;")
    private class579 field6340;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "[Let;")
    public class556[] field6342;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[Lfd;")
    public class493[] field6341;

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()V", line = 2)
    public final void method2090() {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lba;IIIZ)V", line = 6)
    public final void method2057(class359 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6339.method472().method3486(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lpo;II)V", line = 11)
    public final void method2059(class396 arg0, class524 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field6339.method472().method3478(this, arg0, null, arg2, arg3);
            return;
        }
        class57.field724[5] = 0;
        this.field6339.method472().method3478(this, arg0, class57.field724, arg2, arg3);
        arg1.field6624 = class57.field724[0];
        arg1.field6627 = class57.field724[1];
        arg1.field6626 = class57.field724[2];
        arg1.field6628 = class57.field724[3];
        arg1.field6623 = class57.field724[4];
        arg1.field6625 = class57.field724[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 27)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class368.method2146((byte) -99, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([ILq;)V", line = 41)
    private final void method2767(int[] arg0, class396 arg1) {
        this.field6339.method472().method3483(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lba;", line = 47)
    public final class359 method951(byte arg0, int arg1, boolean arg2) {
        return this.field6339.method472().method3491(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()[Let;", line = 51)
    public final class556[] method2077() {
        return this.field6342;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V", line = 54)
    public final void method2060(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;)V", line = 63)
    public final void method2067(class396 arg0) {
        this.method2767(class57.field722, arg0);
        int var2 = 0;
        if (this.field6342 != null) {
            for (int var3 = 0; var3 < this.field6342.length; var3++) {
                class556 var4 = this.field6342[var3];
                var4.field6943 = class57.field722[var2++];
                var4.field6958 = class57.field722[var2++];
                var4.field6960 = class57.field722[var2++];
                var4.field6944 = class57.field722[var2++];
                var4.field6947 = class57.field722[var2++];
                var4.field6957 = class57.field722[var2++];
                var4.field6945 = class57.field722[var2++];
                var4.field6952 = class57.field722[var2++];
                var4.field6964 = class57.field722[var2++];
            }
        }
        if (this.field6341 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field6341.length; var5++) {
            class493 var6 = this.field6341[var5];
            class493 var7 = var6;
            if (var6.field6145 != null) {
                var7 = var6.field6145;
            }
            if (var6.field6142 == null) {
                var6.field6142 = arg0.method576();
            } else {
                var6.field6142.method583(arg0);
            }
            var7.field6141 = class57.field722[var2++];
            var7.field6151 = class57.field722[var2++];
            var7.field6147 = class57.field722[var2++];
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()[Lfd;", line = 122)
    public final class493[] method2063() {
        return this.field6341;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lpo;I)V", line = 127)
    public final void method2049(class396 arg0, class524 arg1, int arg2) {
        if (arg1 == null) {
            this.field6339.method472().method3484(this, arg0, null, arg2);
            return;
        }
        class57.field724[5] = 0;
        this.field6339.method472().method3484(this, arg0, class57.field724, arg2);
        arg1.field6624 = class57.field724[0];
        arg1.field6627 = class57.field724[1];
        arg1.field6626 = class57.field724[2];
        arg1.field6628 = class57.field724[3];
        arg1.field6623 = class57.field724[4];
        arg1.field6625 = class57.field724[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILq;Z)Z", line = 147)
    public final boolean method2074(int arg0, int arg1, class396 arg2, boolean arg3) {
        return this.field6339.method472().method3494(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()Z", line = 153)
    public final boolean method2046() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;La;Lnj;IIII)V", line = 162)
    public class507(class57 arg0, class579 arg1, class229 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6339 = arg0;
        this.field6340 = arg1;
        this.field6342 = arg2.field2956;
        this.field6341 = arg2.field2997;
        int var8 = arg2.field2956 == null ? 0 : arg2.field2956.length;
        int var9 = arg2.field2997 == null ? 0 : arg2.field2997.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field6342[var12].field6951;
            var11[var10++] = this.field6342[var12].field6953;
            var11[var10++] = this.field6342[var12].field6949;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field6341[var13].field6148;
        }
        int var14 = arg2.field2990 == null ? 0 : arg2.field2990.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class417 var20 = arg2.field2990[var17];
            class692 var21 = class234.method1413(true, var20.field5339);
            var15[var16++] = var20.field5333;
            var15[var16++] = var21.field9598;
            var15[var16++] = var21.field9590;
            var15[var16++] = var21.field9594;
            var15[var16++] = var21.field9597;
            var15[var16++] = var21.field9593;
            var15[var16++] = var21.field9595 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class417 var19 = arg2.field2990[var18];
            var15[var16++] = var19.field5335;
        }
        this.method2769(this.field6339, this.field6340, arg2.field2993, arg2.field2965, arg2.field2981, arg2.field2991, arg2.field2982, arg2.field2971, arg2.field2973, arg2.field2972, arg2.field2953, arg2.field2995, arg2.field3004, arg2.field2988, arg2.field2959, arg2.field3005, arg2.field2979, arg2.field2985, arg2.field2986, arg2.field2994, arg2.field2970, arg2.field2992, arg2.field2962, arg2.field2969, arg2.field3001, arg2.field2987, arg2.field2954, arg2.field2955, arg2.field2996, arg2.field3002, arg2.field2976, arg2.field2974, arg2.field2968, arg2.field2966, arg2.field2975, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;)V", line = 234)
    public class507(class57 arg0) {
        this.field6339 = arg0;
        this.field6340 = null;
        this.method2766(arg0);
    }

    @OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
    public final native void method2081(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
    public final native void method2069(int arg0);

    @OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
    public final native int method2064();

    @OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lda;)V")
    private final native void method2766(class57 arg0);

    @OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
    public final native int method2071();

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lw;)Lw;")
    public final native class279 method2055(class279 arg0);

    @OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
    public final native void method2088(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
    public final native void method2048(int arg0);

    @OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
    public final native void method2072(int arg0);

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
    public final native boolean method2091();

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
    public final native void method2053(int arg0);

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
    public final native void method2056();

    @OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
    public final native void method2066(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
    public final native int method2062();

    @OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
    public final native void method57(boolean arg0);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
    public final native void method2058(int arg0);

    @OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
    public final native void method2070(int arg0);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
    public final native void method2076(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
    public final native int method2054();

    @OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
    public final native int method2068();

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
    public final native int method2085();

    @OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
    public final native void method2079(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "L", descriptor = "(Lj;Lj;IZZ)V")
    public final native void method2768(class507 arg0, class507 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
    public final native int method2075();

    @OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
    public final native void method2052();

    @OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
    public final native int method2084();

    @OriginalMember(owner = "client!j", name = "za", descriptor = "(Lda;La;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2769(class57 arg0, class579 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
    public final native int method2061();

    @OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
    public final native void method2083(int arg0);

    @OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final native void method2086(int arg0, int arg1, class140 arg2, class140 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final native void method2050(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
    public final native int method2089();

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
    public final native void method2080(short arg0, short arg1);
}
