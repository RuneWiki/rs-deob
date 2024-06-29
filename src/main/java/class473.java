import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class473 extends class289 implements class28 {

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "Lw;")
    private class69 field6940;

    @OriginalMember(owner = "client!xa", name = "m", descriptor = "Lg;")
    private class427 field6939;

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "[Lod;")
    public class476[] field6938;

    @OriginalMember(owner = "client!xa", name = "k", descriptor = "[Lu;")
    public class349[] field6937;

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILc;)V", line = 11)
    public final void method2865(int arg0, class517 arg1) {
        int var3 = arg0;
        if (this.field6938 != null) {
            for (int var4 = 0; var4 < this.field6938.length; var4++) {
                class476 var5 = this.field6938[var4];
                var5.field6953 = class69.field1095[var3++];
                var5.field6969 = class69.field1095[var3++];
                var5.field6954 = class69.field1095[var3++];
                var5.field6967 = class69.field1095[var3++];
                var5.field6972 = class69.field1095[var3++];
                var5.field6960 = class69.field1095[var3++];
                var5.field6961 = class69.field1095[var3++];
                var5.field6968 = class69.field1095[var3++];
                var5.field6971 = class69.field1095[var3++];
            }
        }
        if (this.field6937 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field6937.length; var6++) {
            class349 var7 = this.field6937[var6];
            class349 var8 = var7;
            if (var7.field5207 != null) {
                var8 = var7.field5207;
            }
            if (var7.field5200 == null) {
                var7.field5200 = arg1.method950();
            } else {
                var7.field5200.method962(arg1);
            }
            var8.field5203 = class69.field1095[var3++];
            var8.field5210 = class69.field1095[var3++];
            var8.field5202 = class69.field1095[var3++];
        }
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V", line = 65)
    public final void method664(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lwg;II)V", line = 69)
    public final void method656(class517 arg0, class41 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field6940.method576().method473(this, arg0, null, arg2, arg3);
            return;
        }
        class69.field1107[5] = 0;
        this.field6940.method576().method473(this, arg0, class69.field1107, arg2, arg3);
        arg1.field668 = class69.field1107[0];
        arg1.field671 = class69.field1107[1];
        arg1.field669 = class69.field1107[2];
        arg1.field672 = class69.field1107[3];
        arg1.field670 = class69.field1107[4];
        arg1.field673 = class69.field1107[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lwg;I)V", line = 91)
    public final void method673(class517 arg0, class41 arg1, int arg2) {
        if (arg1 == null) {
            this.field6940.method576().method474(this, arg0, null, arg2);
            return;
        }
        class69.field1107[5] = 0;
        this.field6940.method576().method474(this, arg0, class69.field1107, arg2);
        arg1.field668 = class69.field1107[0];
        arg1.field671 = class69.field1107[1];
        arg1.field669 = class69.field1107[2];
        arg1.field672 = class69.field1107[3];
        arg1.field670 = class69.field1107[4];
        arg1.field673 = class69.field1107[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "d", descriptor = "()[Lod;", line = 107)
    public final class476[] method665() {
        return this.field6938;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Le;", line = 111)
    public final class289 method669(byte arg0, int arg1, boolean arg2) {
        return this.field6940.method576().method478(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!xa", name = "c", descriptor = "()V", line = 113)
    public final void method657() {
    }

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()Z", line = 118)
    public final boolean method633() {
        return true;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()[Lu;", line = 123)
    public final class349[] method634() {
        return this.field6937;
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 128)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class45.method300(this, 0);
        }
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Le;IIIZ)V", line = 136)
    public final void method625(class289 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6940.method576().method488(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILc;Z)Z", line = 145)
    public final boolean method638(int arg0, int arg1, class517 arg2, boolean arg3) {
        return this.field6940.method576().method480(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;Lg;Lfe;IIII)V", line = 158)
    public class473(class69 arg0, class427 arg1, class153 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6940 = arg0;
        this.field6939 = arg1;
        this.field6938 = arg2.field2323;
        this.field6937 = arg2.field2320;
        int var8 = arg2.field2323 == null ? 0 : arg2.field2323.length;
        int var9 = arg2.field2320 == null ? 0 : arg2.field2320.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field6938[var12].field6962;
            var11[var10++] = this.field6938[var12].field6957;
            var11[var10++] = this.field6938[var12].field6973;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field6937[var13].field5209;
        }
        int var14 = arg2.field2307 == null ? 0 : arg2.field2307.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class144 var20 = arg2.field2307[var17];
            class80 var21 = class241.method1619(26750, var20.field2121);
            var15[var16++] = var20.field2125;
            var15[var16++] = var21.field1311;
            var15[var16++] = var21.field1309;
            var15[var16++] = var21.field1318;
            var15[var16++] = var21.field1321;
            var15[var16++] = var21.field1317;
            var15[var16++] = var21.field1307 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class144 var19 = arg2.field2307[var18];
            var15[var16++] = var19.field2123;
        }
        this.method2868(this.field6940, this.field6939, arg2.field2310, arg2.field2340, arg2.field2305, arg2.field2301, arg2.field2309, arg2.field2306, arg2.field2321, arg2.field2324, arg2.field2313, arg2.field2303, arg2.field2350, arg2.field2338, arg2.field2336, arg2.field2302, arg2.field2325, arg2.field2339, arg2.field2330, arg2.field2343, arg2.field2299, arg2.field2314, arg2.field2318, arg2.field2337, arg2.field2344, arg2.field2331, arg2.field2319, arg2.field2327, arg2.field2334, arg2.field2300, arg2.field2341, arg2.field2328, arg2.field2317, arg2.field2308, arg2.field2304, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;)V", line = 230)
    public class473(class69 arg0) {
        this.field6940 = arg0;
        this.field6939 = null;
        this.method2867(arg0);
    }

    @OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
    public final native void method672();

    @OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
    public final native int method652();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
    public final native void method678(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
    public final native void method666(int arg0);

    @OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
    public final native void method620(int arg0);

    @OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
    public final native int method655();

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final native void method649(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lxa;Lxa;IZZ)V")
    public final native void method2866(class473 arg0, class473 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
    public final native void method639(int arg0);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Li;)Li;")
    public final native class200 method636(class200 arg0);

    @OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
    public final native void method667(int arg0);

    @OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
    public final native int method643();

    @OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
    public final native int method679();

    @OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
    public final native void method647(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
    public final native void method676(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lw;)V")
    private final native void method2867(class69 arg0);

    @OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
    public final native int method654();

    @OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
    public final native boolean method650();

    @OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
    public final native void method631(int arg0);

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
    public final native int method658();

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
    public final native void method632(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
    public final native int method674();

    @OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
    public final native int method630();

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
    public final native void method164();

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
    public final native void method637(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
    public final native void method622();

    @OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lw;Lg;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2868(class69 arg0, class427 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
    public final native void method662(int arg0);

    @OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
    public final native void method648(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
    public final native void method640(int arg0);

    @OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
    public final native int method624();

    @OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILya;Lya;III)V")
    public final native void method677(int arg0, int arg1, class11 arg2, class11 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
    public final native int method641();
}
