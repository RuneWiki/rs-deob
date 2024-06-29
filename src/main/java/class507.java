import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class507 extends class358 implements class144 {

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lda;")
    private class57 field6771;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "La;")
    private class579 field6769;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "[Ljt;")
    public class93[] field6770;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[Lefa;")
    public class171[] field6772;

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()V", line = 3)
    public final void method1913() {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;)V", line = 7)
    public final void method1949(class397 arg0) {
        this.method2814(class57.field797, arg0);
        int var2 = 0;
        if (this.field6770 != null) {
            for (int var3 = 0; var3 < this.field6770.length; var3++) {
                class93 var4 = this.field6770[var3];
                var4.field1419 = class57.field797[var2++];
                var4.field1414 = class57.field797[var2++];
                var4.field1410 = class57.field797[var2++];
                var4.field1418 = class57.field797[var2++];
                var4.field1408 = class57.field797[var2++];
                var4.field1428 = class57.field797[var2++];
                var4.field1421 = class57.field797[var2++];
                var4.field1415 = class57.field797[var2++];
                var4.field1423 = class57.field797[var2++];
            }
        }
        if (this.field6772 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field6772.length; var5++) {
            class171 var6 = this.field6772[var5];
            class171 var7 = var6;
            if (var6.field2646 != null) {
                var7 = var6.field2646;
            }
            if (var6.field2641 == null) {
                var6.field2641 = arg0.method587();
            } else {
                var6.field2641.method560(arg0);
            }
            var7.field2648 = class57.field797[var2++];
            var7.field2635 = class57.field797[var2++];
            var7.field2643 = class57.field797[var2++];
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILq;Z)Z", line = 62)
    public final boolean method1931(int arg0, int arg1, class397 arg2, boolean arg3) {
        return this.field6771.method461().method3448(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lot;II)V", line = 72)
    public final void method1906(class397 arg0, class552 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field6771.method461().method3447(this, arg0, null, arg2, arg3);
            return;
        }
        class57.field800[5] = 0;
        this.field6771.method461().method3447(this, arg0, class57.field800, arg2, arg3);
        arg1.field7346 = class57.field800[0];
        arg1.field7345 = class57.field800[1];
        arg1.field7343 = class57.field800[2];
        arg1.field7342 = class57.field800[3];
        arg1.field7344 = class57.field800[4];
        arg1.field7341 = class57.field800[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([ILq;)V", line = 90)
    private final void method2814(int[] arg0, class397 arg1) {
        this.field6771.method461().method3440(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()[Lefa;", line = 99)
    public final class171[] method1917() {
        return this.field6772;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lba;", line = 106)
    public final class358 method1519(byte arg0, int arg1, boolean arg2) {
        return this.field6771.method461().method3445(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()Z", line = 109)
    public final boolean method1948() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()[Ljt;", line = 112)
    public final class93[] method1920() {
        return this.field6770;
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 115)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class550.method3055((byte) -20, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lba;IIIZ)V", line = 126)
    public final void method1923(class358 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6771.method461().method3434(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lot;I)V", line = 130)
    public final void method1947(class397 arg0, class552 arg1, int arg2) {
        if (arg1 == null) {
            this.field6771.method461().method3443(this, arg0, null, arg2);
            return;
        }
        class57.field800[5] = 0;
        this.field6771.method461().method3443(this, arg0, class57.field800, arg2);
        arg1.field7346 = class57.field800[0];
        arg1.field7345 = class57.field800[1];
        arg1.field7343 = class57.field800[2];
        arg1.field7342 = class57.field800[3];
        arg1.field7344 = class57.field800[4];
        arg1.field7341 = class57.field800[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;La;Lpf;IIII)V", line = 151)
    public class507(class57 arg0, class579 arg1, class545 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6771 = arg0;
        this.field6769 = arg1;
        this.field6770 = arg2.field7217;
        this.field6772 = arg2.field7265;
        int var8 = arg2.field7217 == null ? 0 : arg2.field7217.length;
        int var9 = arg2.field7265 == null ? 0 : arg2.field7265.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field6770[var12].field1431;
            var11[var10++] = this.field6770[var12].field1413;
            var11[var10++] = this.field6770[var12].field1409;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field6772[var13].field2645;
        }
        int var14 = arg2.field7220 == null ? 0 : arg2.field7220.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class263 var20 = arg2.field7220[var17];
            class460 var21 = class54.method363(var20.field3655, (byte) -126);
            var15[var16++] = var20.field3651;
            var15[var16++] = var21.field6239;
            var15[var16++] = var21.field6234;
            var15[var16++] = var21.field6240;
            var15[var16++] = var21.field6232;
            var15[var16++] = var21.field6241;
            var15[var16++] = var21.field6242 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class263 var19 = arg2.field7220[var18];
            var15[var16++] = var19.field3649;
        }
        this.method2815(this.field6771, this.field6769, arg2.field7230, arg2.field7255, arg2.field7237, arg2.field7235, arg2.field7224, arg2.field7248, arg2.field7222, arg2.field7262, arg2.field7246, arg2.field7243, arg2.field7218, arg2.field7219, arg2.field7233, arg2.field7223, arg2.field7263, arg2.field7253, arg2.field7225, arg2.field7239, arg2.field7260, arg2.field7241, arg2.field7247, arg2.field7254, arg2.field7221, arg2.field7236, arg2.field7264, arg2.field7252, arg2.field7216, arg2.field7266, arg2.field7234, arg2.field7267, arg2.field7251, arg2.field7240, arg2.field7259, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;)V", line = 226)
    public class507(class57 arg0) {
        this.field6771 = arg0;
        this.field6769 = null;
        this.method2813(arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V", line = 233)
    public final void method1897(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lda;)V")
    private final native void method2813(class57 arg0);

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
    public final native boolean method1900();

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
    public final native void method1929(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
    public final native int method1952();

    @OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
    public final native int method1940();

    @OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
    public final native int method1934();

    @OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
    public final native int method1935();

    @OriginalMember(owner = "client!j", name = "za", descriptor = "(Lda;La;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2815(class57 arg0, class579 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
    public final native void method1911(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
    public final native int method1936();

    @OriginalMember(owner = "client!j", name = "L", descriptor = "(Lj;Lj;IZZ)V")
    public final native void method2816(class507 arg0, class507 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final native void method1919(int arg0, int arg1, class139 arg2, class139 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
    public final native void method1946(int arg0);

    @OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
    public final native void method1924(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
    public final native int method1945();

    @OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
    public final native void method132(boolean arg0);

    @OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
    public final native void method1933(int arg0);

    @OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
    public final native int method1951();

    @OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
    public final native void method1918(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
    public final native void method1899(int arg0);

    @OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
    public final native void method1932(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
    public final native void method1903();

    @OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
    public final native void method1907(int arg0);

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lw;)Lw;")
    public final native class276 method1930(class276 arg0);

    @OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final native void method1914(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
    public final native int method1939();

    @OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
    public final native int method1950();

    @OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
    public final native void method1904(int arg0);

    @OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
    public final native void method1937(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
    public final native int method1928();

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
    public final native void method1942(int arg0);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
    public final native void method1898(int arg0);

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
    public final native void method1901();
}
