import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 extends class159 implements class28 {

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "La;")
    private class530 field112;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lc;")
    private class160 field111;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[Llh;")
    public class450[] field113;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "[Lia;")
    public class506[] field114;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()Z", line = 4)
    public final boolean method54() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()V", line = 6)
    public final void method55() {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()[Lia;", line = 12)
    public final class506[] method57() {
        return this.field114;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILm;)V", line = 18)
    public final void method59(int arg0, class165 arg1) {
        int var3 = arg0;
        if (this.field113 != null) {
            for (int var4 = 0; var4 < this.field113.length; var4++) {
                class450 var5 = this.field113[var4];
                var5.field6319 = class530.field7912[var3++];
                var5.field6307 = class530.field7912[var3++];
                var5.field6305 = class530.field7912[var3++];
                var5.field6306 = class530.field7912[var3++];
                var5.field6312 = class530.field7912[var3++];
                var5.field6304 = class530.field7912[var3++];
                var5.field6322 = class530.field7912[var3++];
                var5.field6317 = class530.field7912[var3++];
                var5.field6310 = class530.field7912[var3++];
            }
        }
        if (this.field114 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field114.length; var6++) {
            class506 var7 = this.field114[var6];
            class506 var8 = var7;
            if (var7.field7160 != null) {
                var8 = var7.field7160;
            }
            if (var7.field7159 == null) {
                var7.field7159 = arg1.method335();
            } else {
                var7.field7159.method337(arg1);
            }
            var8.field7156 = class530.field7912[var3++];
            var8.field7150 = class530.field7912[var3++];
            var8.field7152 = class530.field7912[var3++];
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()[Llh;", line = 71)
    public final class450[] method60() {
        return this.field113;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V", line = 83)
    public final void method70(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILm;Z)Z", line = 88)
    public final boolean method72(int arg0, int arg1, class165 arg2, boolean arg3) {
        return this.field112.method3202().method2974(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lpr;II)V", line = 93)
    public final void method74(class165 arg0, class381 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field112.method3202().method2963(this, arg0, null, arg2, arg3);
            return;
        }
        class530.field7910[5] = 0;
        this.field112.method3202().method2963(this, arg0, class530.field7910, arg2, arg3);
        arg1.field5243 = class530.field7910[0];
        arg1.field5245 = class530.field7910[1];
        arg1.field5246 = class530.field7910[2];
        arg1.field5242 = class530.field7910[3];
        arg1.field5244 = class530.field7910[4];
        arg1.field5247 = class530.field7910[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lr;IIIZ)V", line = 112)
    public final void method78(class159 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field112.method3202().method2975(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lpr;I)V", line = 133)
    public final void method93(class165 arg0, class381 arg1, int arg2) {
        if (arg1 == null) {
            this.field112.method3202().method2967(this, arg0, null, arg2);
            return;
        }
        class530.field7910[5] = 0;
        this.field112.method3202().method2967(this, arg0, class530.field7910, arg2);
        arg1.field5243 = class530.field7910[0];
        arg1.field5245 = class530.field7910[1];
        arg1.field5246 = class530.field7910[2];
        arg1.field5242 = class530.field7910[3];
        arg1.field5244 = class530.field7910[4];
        arg1.field5247 = class530.field7910[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lr;", line = 149)
    public final class159 method94(byte arg0, int arg1, boolean arg2) {
        return this.field112.method3202().method2970(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 152)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class292.method1797(88, this);
        }
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;Lc;Lfd;IIII)V", line = 160)
    public class12(class530 arg0, class160 arg1, class451 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field112 = arg0;
        this.field111 = arg1;
        this.field113 = arg2.field6382;
        this.field114 = arg2.field6352;
        int var8 = arg2.field6382 == null ? 0 : arg2.field6382.length;
        int var9 = arg2.field6352 == null ? 0 : arg2.field6352.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field113[var12].field6320;
            var11[var10++] = this.field113[var12].field6313;
            var11[var10++] = this.field113[var12].field6311;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field114[var13].field7149;
        }
        int var14 = arg2.field6363 == null ? 0 : arg2.field6363.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class55 var20 = arg2.field6363[var17];
            class151 var21 = class36.method221(var20.field647, (byte) -83);
            var15[var16++] = var20.field646;
            var15[var16++] = var21.field2292;
            var15[var16++] = var21.field2296;
            var15[var16++] = var21.field2300;
            var15[var16++] = var21.field2288;
            var15[var16++] = var21.field2295;
            var15[var16++] = var21.field2289 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class55 var19 = arg2.field6363[var18];
            var15[var16++] = var19.field654;
        }
        this.method66(this.field112, this.field111, arg2.field6351, arg2.field6367, arg2.field6383, arg2.field6368, arg2.field6350, arg2.field6337, arg2.field6348, arg2.field6371, arg2.field6334, arg2.field6359, arg2.field6375, arg2.field6332, arg2.field6355, arg2.field6329, arg2.field6360, arg2.field6362, arg2.field6346, arg2.field6333, arg2.field6379, arg2.field6338, arg2.field6335, arg2.field6373, arg2.field6349, arg2.field6347, arg2.field6341, arg2.field6336, arg2.field6370, arg2.field6357, arg2.field6376, arg2.field6377, arg2.field6345, arg2.field6331, arg2.field6340, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;)V", line = 231)
    public class12(class530 arg0) {
        this.field112 = arg0;
        this.field111 = null;
        this.method83(arg0);
    }

    @OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
    public final native int method53();

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
    public final native void method56(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
    public final native int method58();

    @OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
    public final native void method61(int arg0);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
    public final native int method62();

    @OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
    public final native void method63(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public final native void method64(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lma;Lma;IZZ)V")
    public final native void method65(class12 arg0, class12 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "XA", descriptor = "(La;Lc;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method66(class530 arg0, class160 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
    public final native void method67();

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
    public final native int method68();

    @OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public final native void method69(int arg0, int arg1, class176 arg2, class176 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
    public final native boolean method71();

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
    public final native int method73();

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    public final native void method75(int arg0);

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
    public final native void method76(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public final native void method77(int arg0);

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
    public final native void method79(int arg0);

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
    public final native void method80(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
    public final native int method81();

    @OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
    public final native void method82(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(La;)V")
    private final native void method83(class530 arg0);

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
    public final native void method84(int arg0);

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
    public final native int method85();

    @OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
    public final native int method86();

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
    public final native void method87(int arg0);

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
    public final native int method88();

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
    public final native void method89(int arg0);

    @OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
    public final native int method90();

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
    public final native void method91();

    @OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lk;)Lk;")
    public final native class485 method92(class485 arg0);

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
    public final native void method95(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
    public final native void method96(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);
}
