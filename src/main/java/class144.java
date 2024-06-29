import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class144 extends class121 implements class276 {

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lh;")
    private class470 field2064;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lba;")
    private class262 field2061;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[Lvj;")
    public class304[] field2062;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[Lit;")
    public class456[] field2063;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
    public final native void method767(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
    public final native void method791(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lnh;II)V")
    public final void method764(class415 arg0, class525 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2064.method2761().method80(this, arg0, null, arg2, arg3);
            return;
        }
        class470.field6867[5] = 0;
        this.field2064.method2761().method80(this, arg0, class470.field6867, arg2, arg3);
        arg1.field7713 = class470.field6867[0];
        arg1.field7716 = class470.field6867[1];
        arg1.field7711 = class470.field6867[2];
        arg1.field7714 = class470.field6867[3];
        arg1.field7715 = class470.field6867[4];
        arg1.field7712 = class470.field6867[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
    public final native void method805(int arg0);

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
    public final native int method766();

    @OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
    public final native void method798(int arg0);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()[Lvj;")
    public final class304[] method770() {
        return this.field2062;
    }

    @OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
    public final native void method79();

    @OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
    public final native int method807();

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lc;IIIZ)V")
    public final void method800(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2064.method2761().method83(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
    public final native boolean method784();

    @OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
    public final native void method809(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
    public final native void method786();

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public final native int method771();

    @OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILna;Lna;III)V")
    public final native void method774(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lc;")
    public final class121 method761(byte arg0, int arg1, boolean arg2) {
        return this.field2064.method2761().method75(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
    public final native void method779();

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
    public final native void method803(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
    public final native void method795(int arg0);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "(Lp;Lp;IZZ)V")
    public final native void method925(class144 arg0, class144 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lnh;I)V")
    public final void method781(class415 arg0, class525 arg1, int arg2) {
        if (arg1 == null) {
            this.field2064.method2761().method82(this, arg0, null, arg2);
            return;
        }
        class470.field6867[5] = 0;
        this.field2064.method2761().method82(this, arg0, class470.field6867, arg2);
        arg1.field7713 = class470.field6867[0];
        arg1.field7716 = class470.field6867[1];
        arg1.field7711 = class470.field6867[2];
        arg1.field7714 = class470.field6867[3];
        arg1.field7715 = class470.field6867[4];
        arg1.field7712 = class470.field6867[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()V")
    public final void method796() {
    }

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
    public final native void method793(int arg0);

    @OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
    public final native void method787(int arg0);

    @OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
    public final native int method778();

    @OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
    public final native int method762();

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()Z")
    public final boolean method801() {
        return true;
    }

    @OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
    public final native void method769(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
    public final void method763(int arg0, int arg1, int arg2, int arg3) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
    public final native int method783();

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()[Lit;")
    public final class456[] method789() {
        return this.field2063;
    }

    @OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lh;)V")
    private final native void method926(class470 arg0);

    @OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
    public final native int method765();

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILia;Z)Z")
    public final boolean method777(int arg0, int arg1, class415 arg2, boolean arg3) {
        return this.field2064.method2761().method78(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILia;)V")
    public final void method927(int arg0, class415 arg1) {
        int var3 = arg0;
        if (this.field2062 != null) {
            for (int var4 = 0; var4 < this.field2062.length; var4++) {
                class304 var5 = this.field2062[var4];
                var5.field4166 = class470.field6868[var3++];
                var5.field4154 = class470.field6868[var3++];
                var5.field4156 = class470.field6868[var3++];
                var5.field4149 = class470.field6868[var3++];
                var5.field4164 = class470.field6868[var3++];
                var5.field4162 = class470.field6868[var3++];
                var5.field4159 = class470.field6868[var3++];
                var5.field4155 = class470.field6868[var3++];
                var5.field4151 = class470.field6868[var3++];
            }
        }
        if (this.field2063 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2063.length; var6++) {
            class456 var7 = this.field2063[var6];
            class456 var8 = var7;
            if (var7.field6671 != null) {
                var8 = var7.field6671;
            }
            if (var7.field6670 == null) {
                var7.field6670 = arg1.method346();
            } else {
                var7.field6670.method342(arg1);
            }
            var8.field6676 = class470.field6868[var3++];
            var8.field6663 = class470.field6868[var3++];
            var8.field6662 = class470.field6868[var3++];
        }
    }

    @OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
    public final native int method799();

    @OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
    public final native void method773(int arg0);

    @OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
    public final native int method806();

    @OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
    public final native void method782(int arg0);

    @OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
    public final native void method808(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class390.method2237(true, this);
    }

    @OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lj;)Lj;")
    public final native class378 method785(class378 arg0);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
    public final native int method775();

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lh;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method928(class470 arg0, class262 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;Lba;Lwk;IIII)V")
    public class144(class470 arg0, class262 arg1, class94 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2064 = arg0;
        this.field2061 = arg1;
        this.field2062 = arg2.field1277;
        this.field2063 = arg2.field1259;
        int var8 = arg2.field1277 == null ? 0 : arg2.field1277.length;
        int var9 = arg2.field1259 == null ? 0 : arg2.field1259.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field2062[var12].field4158;
            var11[var10++] = this.field2062[var12].field4157;
            var11[var10++] = this.field2062[var12].field4168;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field2063[var13].field6665;
        }
        int var14 = arg2.field1284 == null ? 0 : arg2.field1284.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class307 var20 = arg2.field1284[var17];
            class190 var21 = class115.method736((byte) -126, var20.field4208);
            var15[var16++] = var20.field4207;
            var15[var16++] = var21.field2629;
            var15[var16++] = var21.field2637;
            var15[var16++] = var21.field2633;
            var15[var16++] = var21.field2640;
            var15[var16++] = var21.field2631;
            var15[var16++] = var21.field2635 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class307 var19 = arg2.field1284[var18];
            var15[var16++] = var19.field4206;
        }
        this.method928(this.field2064, this.field2061, arg2.field1262, arg2.field1278, arg2.field1286, arg2.field1252, arg2.field1282, arg2.field1303, arg2.field1269, arg2.field1280, arg2.field1292, arg2.field1275, arg2.field1250, arg2.field1289, arg2.field1298, arg2.field1291, arg2.field1281, arg2.field1299, arg2.field1271, arg2.field1268, arg2.field1253, arg2.field1263, arg2.field1302, arg2.field1300, arg2.field1272, arg2.field1294, arg2.field1257, arg2.field1297, arg2.field1266, arg2.field1279, arg2.field1296, arg2.field1274, arg2.field1287, arg2.field1267, arg2.field1293, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
    public final native void method797(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;)V")
    public class144(class470 arg0) {
        this.field2064 = arg0;
        this.field2061 = null;
        this.method926(arg0);
    }
}
