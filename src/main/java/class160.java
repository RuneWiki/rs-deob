import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class160 extends class336 implements class416 {

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lc;")
    private class125 field2451;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lk;")
    private class404 field2449;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "[Leh;")
    public class248[] field2452;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "[Ltb;")
    public class280[] field2450;

    @OriginalMember(owner = "client!fa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!fa", name = "ja", descriptor = "()I")
    public final native int method1130();

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILn;Z)Z")
    public final boolean method1131(int arg0, int arg1, class15 arg2, boolean arg3) {
        return this.field2451.method922().method2617(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILn;)V")
    public final void method1132(int arg0, class15 arg1) {
        int var3 = arg0;
        if (this.field2452 != null) {
            for (int var4 = 0; var4 < this.field2452.length; var4++) {
                class248 var5 = this.field2452[var4];
                var5.field3700 = class125.field1960[var3++];
                var5.field3702 = class125.field1960[var3++];
                var5.field3709 = class125.field1960[var3++];
                var5.field3705 = class125.field1960[var3++];
                var5.field3706 = class125.field1960[var3++];
                var5.field3699 = class125.field1960[var3++];
                var5.field3716 = class125.field1960[var3++];
                var5.field3701 = class125.field1960[var3++];
                var5.field3707 = class125.field1960[var3++];
            }
        }
        if (this.field2450 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2450.length; var6++) {
            class280 var7 = this.field2450[var6];
            class280 var8 = var7;
            if (var7.field4177 != null) {
                var8 = var7.field4177;
            }
            if (var7.field4171 == null) {
                var7.field4171 = arg1.method38();
            } else {
                var7.field4171.method45(arg1);
            }
            var8.field4178 = class125.field1960[var3++];
            var8.field4172 = class125.field1960[var3++];
            var8.field4166 = class125.field1960[var3++];
        }
    }

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "(I)V")
    public final native void method1133(int arg0);

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I[IIIIIZ)V")
    public final native void method1134(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "(I)V")
    public final native void method1135(int arg0);

    @OriginalMember(owner = "client!fa", name = "wa", descriptor = "()I")
    public final native int method1136();

    @OriginalMember(owner = "client!fa", name = "da", descriptor = "()I")
    public final native int method1137();

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "(SS)V")
    public final native void method1138(short arg0, short arg1);

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "()I")
    public final native int method1139();

    @OriginalMember(owner = "client!fa", name = "IA", descriptor = "(I)V")
    public final native void method1140(int arg0);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()Z")
    public final boolean method1141() {
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ln;Lwc;I)V")
    public final void method1142(class15 arg0, class48 arg1, int arg2) {
        if (arg1 == null) {
            this.field2451.method922().method2622(this, arg0, null, arg2);
            return;
        }
        class125.field1953[5] = 0;
        this.field2451.method922().method2622(this, arg0, class125.field1953, arg2);
        arg1.field907 = class125.field1953[0];
        arg1.field908 = class125.field1953[1];
        arg1.field906 = class125.field1953[2];
        arg1.field903 = class125.field1953[3];
        arg1.field905 = class125.field1953[4];
        arg1.field904 = class125.field1953[5] != 0;
    }

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "(I[IIIIZI[I)V")
    public final native void method1143(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!fa", name = "pa", descriptor = "()V")
    public final native void method382();

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()[Ltb;")
    public final class280[] method1144() {
        return this.field2450;
    }

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "(I)V")
    public final native void method1145(int arg0);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIII)V")
    public final void method1146(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "()I")
    public final native int method1147();

    @OriginalMember(owner = "client!fa", name = "va", descriptor = "(Lc;)V")
    private final native void method1148(class125 arg0);

    @OriginalMember(owner = "client!fa", name = "AA", descriptor = "()Z")
    public final native boolean method1149();

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "()I")
    public final native int method1150();

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "(I)V")
    public final native void method1151(int arg0);

    @OriginalMember(owner = "client!fa", name = "la", descriptor = "(IIII)V")
    public final native void method1152(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2895(this, false);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ln;Lwc;II)V")
    public final void method1153(class15 arg0, class48 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2451.method922().method2618(this, arg0, null, arg2, arg3);
            return;
        }
        class125.field1953[5] = 0;
        this.field2451.method922().method2618(this, arg0, class125.field1953, arg2, arg3);
        arg1.field907 = class125.field1953[0];
        arg1.field908 = class125.field1953[1];
        arg1.field906 = class125.field1953[2];
        arg1.field903 = class125.field1953[3];
        arg1.field905 = class125.field1953[4];
        arg1.field904 = class125.field1953[5] != 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BIZ)Lka;")
    public final class336 method1154(byte arg0, int arg1, boolean arg2) {
        return this.field2451.method922().method2608(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "(Lc;Lk;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1155(class125 arg0, class404 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "(III)V")
    public final native void method1156(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method1157(class336 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2451.method922().method2611(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!fa", name = "ha", descriptor = "()V")
    public final native void method1158();

    @OriginalMember(owner = "client!fa", name = "YA", descriptor = "()V")
    public final native void method1159();

    @OriginalMember(owner = "client!fa", name = "ia", descriptor = "()I")
    public final native int method1160();

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "(Lfa;Lfa;IZZ)V")
    public final native void method1161(class160 arg0, class160 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
    public final void method1162() {
    }

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(SS)V")
    public final native void method1163(short arg0, short arg1);

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lc;Lk;Lch;IIII)V")
    public class160(class125 arg0, class404 arg1, class330 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2451 = arg0;
        this.field2449 = arg1;
        this.field2452 = arg2.field4873;
        this.field2450 = arg2.field4858;
        int var8 = arg2.field4873 == null ? 0 : arg2.field4873.length;
        int var9 = arg2.field4858 == null ? 0 : arg2.field4858.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field2452[var12].field3712;
            var11[var10++] = this.field2452[var12].field3710;
            var11[var10++] = this.field2452[var12].field3708;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field2450[var13].field4175;
        }
        int var14 = arg2.field4846 == null ? 0 : arg2.field4846.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class295 var20 = arg2.field4846[var17];
            class334 var21 = class284.method1831(var20.field4414, (byte) -18);
            var15[var16++] = var20.field4411;
            var15[var16++] = var21.field4946;
            var15[var16++] = var21.field4952;
            var15[var16++] = var21.field4950;
            var15[var16++] = var21.field4955;
            var15[var16++] = var21.field4954;
            var15[var16++] = var21.field4956 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class295 var19 = arg2.field4846[var18];
            var15[var16++] = var19.field4415;
        }
        this.method1155(this.field2451, this.field2449, arg2.field4877, arg2.field4853, arg2.field4869, arg2.field4859, arg2.field4857, arg2.field4893, arg2.field4844, arg2.field4852, arg2.field4885, arg2.field4854, arg2.field4849, arg2.field4871, arg2.field4876, arg2.field4887, arg2.field4862, arg2.field4886, arg2.field4891, arg2.field4890, arg2.field4860, arg2.field4880, arg2.field4847, arg2.field4882, arg2.field4872, arg2.field4855, arg2.field4868, arg2.field4842, arg2.field4894, arg2.field4867, arg2.field4888, arg2.field4879, arg2.field4845, arg2.field4884, arg2.field4848, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lc;)V")
    public class160(class125 arg0) {
        this.field2451 = arg0;
        this.field2449 = null;
        this.method1148(arg0);
    }

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "()I")
    public final native int method1164();

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(IILo;Lo;III)V")
    public final native void method1165(int arg0, int arg1, class24 arg2, class24 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!fa", name = "ma", descriptor = "()I")
    public final native int method1166();

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "(III)V")
    public final native void method1167(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "()I")
    public final native int method1168();

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "(I)V")
    public final native void method1169(int arg0);

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "(I)V")
    public final native void method1170(int arg0);

    @OriginalMember(owner = "client!fa", name = "LA", descriptor = "(Lia;)Lia;")
    public final native class424 method1171(class424 arg0);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()[Leh;")
    public final class248[] method1172() {
        return this.field2452;
    }
}
