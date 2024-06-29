import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class44 extends class474 implements class103 {

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lqa;")
    private class164 field528;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Lna;")
    private class35 field527;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "[Lew;")
    public class342[] field525;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[Lfs;")
    public class390[] field526;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public final native void method402(int arg0);

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()V")
    public final native void method403();

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IILta;Lta;III)V")
    public final native void method404(int arg0, int arg1, class143 arg2, class143 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(I)V")
    public final native void method405(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILc;)V")
    public final void method406(int arg0, class123 arg1) {
        int var3 = arg0;
        if (this.field525 != null) {
            for (int var4 = 0; var4 < this.field525.length; var4++) {
                class342 var5 = this.field525[var4];
                var5.field4319 = class164.field2083[var3++];
                var5.field4327 = class164.field2083[var3++];
                var5.field4316 = class164.field2083[var3++];
                var5.field4308 = class164.field2083[var3++];
                var5.field4324 = class164.field2083[var3++];
                var5.field4314 = class164.field2083[var3++];
                var5.field4310 = class164.field2083[var3++];
                var5.field4325 = class164.field2083[var3++];
                var5.field4311 = class164.field2083[var3++];
            }
        }
        if (this.field526 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field526.length; var6++) {
            class390 var7 = this.field526[var6];
            class390 var8 = var7;
            if (var7.field5238 != null) {
                var8 = var7.field5238;
            }
            if (var7.field5228 == null) {
                var7.field5228 = arg1.method230();
            } else {
                var7.field5228.method237(arg1);
            }
            var8.field5227 = class164.field2083[var3++];
            var8.field5235 = class164.field2083[var3++];
            var8.field5232 = class164.field2083[var3++];
        }
    }

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(Lda;Lda;IZZ)V")
    public final native void method407(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public final native int method408();

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public final native int method409();

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lqa;)V")
    private final native void method410(class164 arg0);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final native boolean method411();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method412(int arg0, int arg1, class123 arg2, boolean arg3) {
        return this.field528.method1068().method121(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lvs;II)V")
    public final void method413(class123 arg0, class419 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field528.method1068().method117(this, arg0, null, arg2, arg3);
            return;
        }
        class164.field2087[5] = 0;
        this.field528.method1068().method117(this, arg0, class164.field2087, arg2, arg3);
        arg1.field5947 = class164.field2087[0];
        arg1.field5943 = class164.field2087[1];
        arg1.field5946 = class164.field2087[2];
        arg1.field5944 = class164.field2087[3];
        arg1.field5945 = class164.field2087[4];
        arg1.field5942 = class164.field2087[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "N", descriptor = "(IIII)V")
    public final native void method414(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lvs;I)V")
    public final void method415(class123 arg0, class419 arg1, int arg2) {
        if (arg1 == null) {
            this.field528.method1068().method115(this, arg0, null, arg2);
            return;
        }
        class164.field2087[5] = 0;
        this.field528.method1068().method115(this, arg0, class164.field2087, arg2);
        arg1.field5947 = class164.field2087[0];
        arg1.field5943 = class164.field2087[1];
        arg1.field5946 = class164.field2087[2];
        arg1.field5944 = class164.field2087[3];
        arg1.field5945 = class164.field2087[4];
        arg1.field5942 = class164.field2087[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lt;")
    public final class474 method416(byte arg0, int arg1, boolean arg2) {
        return this.field528.method1068().method116(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()V")
    public final native void method417();

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "()I")
    public final native int method418();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public final void method419(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "XA", descriptor = "(I[IIIIIZ)V")
    public final native void method420(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(I)V")
    public final native void method421(int arg0);

    @OriginalMember(owner = "client!da", name = "P", descriptor = "()I")
    public final native int method422();

    @OriginalMember(owner = "client!da", name = "I", descriptor = "(SS)V")
    public final native void method423(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method424();

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(SS)V")
    public final native void method425(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "()I")
    public final native int method426();

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()[Lfs;")
    public final class390[] method427() {
        return this.field526;
    }

    @OriginalMember(owner = "client!da", name = "q", descriptor = "(Lqa;Lna;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method428(class164 arg0, class35 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()I")
    public final native int method429();

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "(I)V")
    public final native void method430(int arg0);

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()I")
    public final native int method431();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
    public final boolean method432() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "EA", descriptor = "()V")
    public final native void method120();

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(Lba;)Lba;")
    public final native class264 method433(class264 arg0);

    @OriginalMember(owner = "client!da", name = "NA", descriptor = "()I")
    public final native int method434();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lt;IIIZ)V")
    public final void method435(class474 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field528.method1068().method118(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "(I)V")
    public final native void method436(int arg0);

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()I")
    public final native int method437();

    @OriginalMember(owner = "client!da", name = "E", descriptor = "(I)V")
    public final native void method438(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
    public final void method439() {
    }

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(III)V")
    public final native void method440(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()[Lew;")
    public final class342[] method441() {
        return this.field525;
    }

    @OriginalMember(owner = "client!da", name = "UA", descriptor = "(I)V")
    public final native void method442(int arg0);

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class132.method921(this, false);
    }

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(III)V")
    public final native void method443(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I[IIIIZI[I)V")
    public final native void method444(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;Lna;Lmb;IIII)V")
    public class44(class164 arg0, class35 arg1, class173 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field528 = arg0;
        this.field527 = arg1;
        this.field525 = arg2.field2238;
        this.field526 = arg2.field2235;
        int var8 = arg2.field2238 == null ? 0 : arg2.field2238.length;
        int var9 = arg2.field2235 == null ? 0 : arg2.field2235.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field525[var12].field4320;
            var11[var10++] = this.field525[var12].field4321;
            var11[var10++] = this.field525[var12].field4315;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field526[var13].field5234;
        }
        int var14 = arg2.field2245 == null ? 0 : arg2.field2245.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class410 var20 = arg2.field2245[var17];
            class472 var21 = class65.method584(var20.field5861, false);
            var15[var16++] = var20.field5857;
            var15[var16++] = var21.field6841;
            var15[var16++] = var21.field6846;
            var15[var16++] = var21.field6836;
            var15[var16++] = var21.field6837;
            var15[var16++] = var21.field6838;
            var15[var16++] = var21.field6839 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class410 var19 = arg2.field2245[var18];
            var15[var16++] = var19.field5858;
        }
        this.method428(this.field528, this.field527, arg2.field2203, arg2.field2208, arg2.field2198, arg2.field2201, arg2.field2209, arg2.field2227, arg2.field2197, arg2.field2236, arg2.field2212, arg2.field2216, arg2.field2232, arg2.field2246, arg2.field2240, arg2.field2228, arg2.field2223, arg2.field2207, arg2.field2234, arg2.field2219, arg2.field2226, arg2.field2214, arg2.field2215, arg2.field2211, arg2.field2218, arg2.field2241, arg2.field2205, arg2.field2199, arg2.field2204, arg2.field2202, arg2.field2217, arg2.field2242, arg2.field2224, arg2.field2249, arg2.field2229, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;)V")
    public class44(class164 arg0) {
        this.field528 = arg0;
        this.field527 = null;
        this.method410(arg0);
    }
}
