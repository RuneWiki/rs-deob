import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class158 extends class334 implements class415 {

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Lc;")
    private class124 field2047;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lk;")
    private class403 field2049;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "[Llq;")
    public class392[] field2046;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "[Lhd;")
    public class531[] field2048;

    @OriginalMember(owner = "client!fa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "(I)V")
    public final native void method61(int arg0);

    @OriginalMember(owner = "client!fa", name = "AA", descriptor = "()Z")
    public final native boolean method74();

    @OriginalMember(owner = "client!fa", name = "la", descriptor = "(IIII)V")
    public final native void method28(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "()I")
    public final native int method65();

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "()I")
    public final native int method81();

    @OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class93.method626(this, 0);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ln;Lst;II)V")
    public final void method55(class14 arg0, class302 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2047.method773().method2689(this, arg0, null, arg2, arg3);
            return;
        }
        class124.field1665[5] = 0;
        this.field2047.method773().method2689(this, arg0, class124.field1665, arg2, arg3);
        arg1.field4423 = class124.field1665[0];
        arg1.field4425 = class124.field1665[1];
        arg1.field4427 = class124.field1665[2];
        arg1.field4422 = class124.field1665[3];
        arg1.field4426 = class124.field1665[4];
        arg1.field4424 = class124.field1665[5] != 0;
    }

    @OriginalMember(owner = "client!fa", name = "da", descriptor = "()I")
    public final native int method58();

    @OriginalMember(owner = "client!fa", name = "wa", descriptor = "()I")
    public final native int method37();

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()Z")
    public final boolean method76() {
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "(III)V")
    public final native void method66(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fa", name = "ja", descriptor = "()I")
    public final native int method77();

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "(I)V")
    public final native void method44(int arg0);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method50(class334 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2047.method773().method2680(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fa", name = "ia", descriptor = "()I")
    public final native int method38();

    @OriginalMember(owner = "client!fa", name = "IA", descriptor = "(I)V")
    public final native void method89(int arg0);

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(IILo;Lo;III)V")
    public final native void method80(int arg0, int arg1, class23 arg2, class23 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "()I")
    public final native int method70();

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()[Lhd;")
    public final class531[] method87() {
        return this.field2048;
    }

    @OriginalMember(owner = "client!fa", name = "va", descriptor = "(Lc;)V")
    private final native void method1026(class124 arg0);

    @OriginalMember(owner = "client!fa", name = "pa", descriptor = "()V")
    public final native void method304();

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "(III)V")
    public final native void method90(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "(Lc;Lk;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1027(class124 arg0, class403 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "()I")
    public final native int method45();

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(SS)V")
    public final native void method29(short arg0, short arg1);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILn;Z)Z")
    public final boolean method68(int arg0, int arg1, class14 arg2, boolean arg3) {
        return this.field2047.method773().method2682(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ln;Lst;I)V")
    public final void method53(class14 arg0, class302 arg1, int arg2) {
        if (arg1 == null) {
            this.field2047.method773().method2690(this, arg0, null, arg2);
            return;
        }
        class124.field1665[5] = 0;
        this.field2047.method773().method2690(this, arg0, class124.field1665, arg2);
        arg1.field4423 = class124.field1665[0];
        arg1.field4425 = class124.field1665[1];
        arg1.field4427 = class124.field1665[2];
        arg1.field4422 = class124.field1665[3];
        arg1.field4426 = class124.field1665[4];
        arg1.field4424 = class124.field1665[5] != 0;
    }

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "()I")
    public final native int method88();

    @OriginalMember(owner = "client!fa", name = "LA", descriptor = "(Lia;)Lia;")
    public final native class423 method73(class423 arg0);

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I[IIIIIZ)V")
    public final native void method60(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()V")
    public final void method83() {
    }

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "(I)V")
    public final native void method63(int arg0);

    @OriginalMember(owner = "client!fa", name = "YA", descriptor = "()V")
    public final native void method84();

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "(Lfa;Lfa;IZZ)V")
    public final native void method1028(class158 arg0, class158 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIZ)Lka;")
    public final class334 method47(byte arg0, int arg1, boolean arg2) {
        return this.field2047.method773().method2686(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILn;)V")
    public final void method1029(int arg0, class14 arg1) {
        int var3 = arg0;
        if (this.field2046 != null) {
            for (int var4 = 0; var4 < this.field2046.length; var4++) {
                class392 var5 = this.field2046[var4];
                var5.field5992 = class124.field1669[var3++];
                var5.field5993 = class124.field1669[var3++];
                var5.field5991 = class124.field1669[var3++];
                var5.field6002 = class124.field1669[var3++];
                var5.field5985 = class124.field1669[var3++];
                var5.field6001 = class124.field1669[var3++];
                var5.field5998 = class124.field1669[var3++];
                var5.field5995 = class124.field1669[var3++];
                var5.field5986 = class124.field1669[var3++];
            }
        }
        if (this.field2048 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2048.length; var6++) {
            class531 var7 = this.field2048[var6];
            class531 var8 = var7;
            if (var7.field7806 != null) {
                var8 = var7.field7806;
            }
            if (var7.field7807 == null) {
                var7.field7807 = arg1.method155();
            } else {
                var7.field7807.method151(arg1);
            }
            var8.field7802 = class124.field1669[var3++];
            var8.field7810 = class124.field1669[var3++];
            var8.field7803 = class124.field1669[var3++];
        }
    }

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "(I)V")
    public final native void method62(int arg0);

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "(I[IIIIZI[I)V")
    public final native void method27(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "(SS)V")
    public final native void method57(short arg0, short arg1);

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "(I)V")
    public final native void method79(int arg0);

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "(I)V")
    public final native void method36(int arg0);

    @OriginalMember(owner = "client!fa", name = "ha", descriptor = "()V")
    public final native void method43();

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()[Llq;")
    public final class392[] method72() {
        return this.field2046;
    }

    @OriginalMember(owner = "client!fa", name = "ma", descriptor = "()I")
    public final native int method46();

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V")
    public final void method78(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lc;Lk;Lnd;IIII)V")
    public class158(class124 arg0, class403 arg1, class387 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2047 = arg0;
        this.field2049 = arg1;
        this.field2046 = arg2.field5911;
        this.field2048 = arg2.field5880;
        int var8 = arg2.field5911 == null ? 0 : arg2.field5911.length;
        int var9 = arg2.field5880 == null ? 0 : arg2.field5880.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field2046[var12].field5994;
            var11[var10++] = this.field2046[var12].field5989;
            var11[var10++] = this.field2046[var12].field5997;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field2048[var13].field7809;
        }
        int var14 = arg2.field5877 == null ? 0 : arg2.field5877.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class128 var20 = arg2.field5877[var17];
            class257 var21 = class26.method234(true, var20.field1734);
            var15[var16++] = var20.field1735;
            var15[var16++] = var21.field3558;
            var15[var16++] = var21.field3548;
            var15[var16++] = var21.field3550;
            var15[var16++] = var21.field3551;
            var15[var16++] = var21.field3555;
            var15[var16++] = var21.field3561 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class128 var19 = arg2.field5877[var18];
            var15[var16++] = var19.field1736;
        }
        this.method1027(this.field2047, this.field2049, arg2.field5888, arg2.field5900, arg2.field5878, arg2.field5901, arg2.field5893, arg2.field5898, arg2.field5910, arg2.field5897, arg2.field5871, arg2.field5895, arg2.field5875, arg2.field5894, arg2.field5902, arg2.field5905, arg2.field5885, arg2.field5874, arg2.field5913, arg2.field5899, arg2.field5922, arg2.field5886, arg2.field5924, arg2.field5903, arg2.field5896, arg2.field5873, arg2.field5876, arg2.field5904, arg2.field5917, arg2.field5892, arg2.field5879, arg2.field5909, arg2.field5919, arg2.field5891, arg2.field5908, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lc;)V")
    public class158(class124 arg0) {
        this.field2047 = arg0;
        this.field2049 = null;
        this.method1026(arg0);
    }
}
