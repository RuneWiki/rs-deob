import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class349 extends class374 implements class294 {

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "Lw;")
    private class197 field5182;

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "Lg;")
    private class109 field5183;

    @OriginalMember(owner = "client!xa", name = "r", descriptor = "[Lfi;")
    public class393[] field5184;

    @OriginalMember(owner = "client!xa", name = "o", descriptor = "[Lkh;")
    public class13[] field5181;

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Le;IIIZ)V", line = 3)
    public final void method741(class374 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5182.method1332().method2488(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V", line = 12)
    public final void method756(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()[Lfi;", line = 15)
    public final class393[] method737() {
        return this.field5184;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILc;)V", line = 20)
    public final void method2175(int arg0, class124 arg1) {
        int var3 = arg0;
        if (this.field5184 != null) {
            for (int var4 = 0; var4 < this.field5184.length; var4++) {
                class393 var5 = this.field5184[var4];
                var5.field5988 = class197.field3158[var3++];
                var5.field5997 = class197.field3158[var3++];
                var5.field6002 = class197.field3158[var3++];
                var5.field6005 = class197.field3158[var3++];
                var5.field5999 = class197.field3158[var3++];
                var5.field5994 = class197.field3158[var3++];
                var5.field6003 = class197.field3158[var3++];
                var5.field5990 = class197.field3158[var3++];
                var5.field5993 = class197.field3158[var3++];
            }
        }
        if (this.field5181 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5181.length; var6++) {
            class13 var7 = this.field5181[var6];
            class13 var8 = var7;
            if (var7.field237 != null) {
                var8 = var7.field237;
            }
            if (var7.field235 == null) {
                var7.field235 = arg1.method833();
            } else {
                var7.field235.method828(arg1);
            }
            var8.field243 = class197.field3158[var3++];
            var8.field241 = class197.field3158[var3++];
            var8.field240 = class197.field3158[var3++];
        }
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lpr;I)V", line = 81)
    public final void method723(class124 arg0, class313 arg1, int arg2) {
        if (arg1 == null) {
            this.field5182.method1332().method2494(this, arg0, null, arg2);
            return;
        }
        class197.field3163[5] = 0;
        this.field5182.method1332().method2494(this, arg0, class197.field3163, arg2);
        arg1.field4719 = class197.field3163[0];
        arg1.field4718 = class197.field3163[1];
        arg1.field4722 = class197.field3163[2];
        arg1.field4717 = class197.field3163[3];
        arg1.field4720 = class197.field3163[4];
        arg1.field4721 = class197.field3163[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 97)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class157.method1134((byte) 121, this);
        }
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lpr;II)V", line = 107)
    public final void method721(class124 arg0, class313 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field5182.method1332().method2485(this, arg0, null, arg2, arg3);
            return;
        }
        class197.field3163[5] = 0;
        this.field5182.method1332().method2485(this, arg0, class197.field3163, arg2, arg3);
        arg1.field4719 = class197.field3163[0];
        arg1.field4718 = class197.field3163[1];
        arg1.field4722 = class197.field3163[2];
        arg1.field4717 = class197.field3163[3];
        arg1.field4720 = class197.field3163[4];
        arg1.field4721 = class197.field3163[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()V", line = 135)
    public final void method718() {
    }

    @OriginalMember(owner = "client!xa", name = "d", descriptor = "()[Lkh;", line = 138)
    public final class13[] method720() {
        return this.field5181;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Le;", line = 141)
    public final class374 method746(byte arg0, int arg1, boolean arg2) {
        return this.field5182.method1332().method2495(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILc;Z)Z", line = 147)
    public final boolean method763(int arg0, int arg1, class124 arg2, boolean arg3) {
        return this.field5182.method1332().method2491(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!xa", name = "c", descriptor = "()Z", line = 150)
    public final boolean method761() {
        return true;
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;Lg;Lpn;IIII)V", line = 158)
    public class349(class197 arg0, class109 arg1, class528 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5182 = arg0;
        this.field5183 = arg1;
        this.field5184 = arg2.field7672;
        this.field5181 = arg2.field7696;
        int var8 = arg2.field7672 == null ? 0 : arg2.field7672.length;
        int var9 = arg2.field7696 == null ? 0 : arg2.field7696.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field5184[var12].field6004;
            var11[var10++] = this.field5184[var12].field6001;
            var11[var10++] = this.field5184[var12].field5996;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field5181[var13].field236;
        }
        int var14 = arg2.field7713 == null ? 0 : arg2.field7713.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class132 var20 = arg2.field7713[var17];
            class236 var21 = class435.method2609(0, var20.field2216);
            var15[var16++] = var20.field2217;
            var15[var16++] = var21.field3641;
            var15[var16++] = var21.field3640;
            var15[var16++] = var21.field3632;
            var15[var16++] = var21.field3633;
            var15[var16++] = var21.field3631;
            var15[var16++] = var21.field3634 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class132 var19 = arg2.field7713[var18];
            var15[var16++] = var19.field2218;
        }
        this.method2174(this.field5182, this.field5183, arg2.field7687, arg2.field7675, arg2.field7664, arg2.field7702, arg2.field7667, arg2.field7710, arg2.field7716, arg2.field7680, arg2.field7706, arg2.field7699, arg2.field7684, arg2.field7669, arg2.field7690, arg2.field7704, arg2.field7711, arg2.field7674, arg2.field7705, arg2.field7700, arg2.field7670, arg2.field7673, arg2.field7671, arg2.field7709, arg2.field7703, arg2.field7676, arg2.field7666, arg2.field7718, arg2.field7692, arg2.field7691, arg2.field7688, arg2.field7689, arg2.field7694, arg2.field7683, arg2.field7677, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;)V", line = 229)
    public class349(class197 arg0) {
        this.field5182 = arg0;
        this.field5183 = null;
        this.method2177(arg0);
    }

    @OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
    public final native int method716();

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final native void method727(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lw;Lg;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2174(class197 arg0, class109 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
    public final native void method758();

    @OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
    public final native int method722();

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
    public final native void method615();

    @OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILya;Lya;III)V")
    public final native void method764(int arg0, int arg1, class38 arg2, class38 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
    public final native void method767(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
    public final native void method747(int arg0);

    @OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
    public final native int method728();

    @OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
    public final native int method729();

    @OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lxa;Lxa;IZZ)V")
    public final native void method2176(class349 arg0, class349 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
    public final native void method726();

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
    public final native void method738(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Li;)Li;")
    public final native class31 method731(class31 arg0);

    @OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
    public final native int method750();

    @OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
    public final native int method751();

    @OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
    public final native void method717(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
    public final native void method749(int arg0);

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
    public final native int method744();

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
    public final native void method755(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lw;)V")
    private final native void method2177(class197 arg0);

    @OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
    public final native int method768();

    @OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
    public final native int method736();

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
    public final native void method725(int arg0);

    @OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
    public final native int method733();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
    public final native void method730(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
    public final native void method748(int arg0);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
    public final native void method724(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
    public final native boolean method740();

    @OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
    public final native void method769(int arg0);

    @OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
    public final native void method754(int arg0);

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
    public final native void method732(int arg0);
}
