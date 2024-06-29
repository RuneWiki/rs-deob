import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class494 extends class350 implements class142 {

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lda;")
    private class56 field7156;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "La;")
    private class564 field7158;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "[Ldg;")
    public class375[] field7157;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "[Lhaa;")
    public class73[] field7155;

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
    public final native void method860(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
    public final native void method870(int arg0);

    @OriginalMember(owner = "client!j", name = "za", descriptor = "(Lda;La;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2843(class56 arg0, class564 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lw;)Lw;")
    public final native class269 method883(class269 arg0);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
    public final native void method863(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([ILq;)V")
    private final void method2844(int[] arg0, class389 arg1) {
        this.field7156.method364().method3420(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
    public final native void method865(int arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lmr;I)V")
    public final void method904(class389 arg0, class130 arg1, int arg2) {
        if (arg1 == null) {
            this.field7156.method364().method3413(this, arg0, null, arg2);
            return;
        }
        class56.field575[5] = 0;
        this.field7156.method364().method3413(this, arg0, class56.field575, arg2);
        arg1.field1460 = class56.field575[0];
        arg1.field1457 = class56.field575[1];
        arg1.field1458 = class56.field575[2];
        arg1.field1459 = class56.field575[3];
        arg1.field1461 = class56.field575[4];
        arg1.field1462 = class56.field575[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
    public final native boolean method868();

    @OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
    public final native int method864();

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lba;")
    public final class350 method602(byte arg0, int arg1, boolean arg2) {
        return this.field7156.method364().method3404(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
    public final native int method880();

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()[Ldg;")
    public final class375[] method886() {
        return this.field7157;
    }

    @OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
    public final native void method874(int arg0);

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
    public final native int method913();

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
    public final native void method903(int arg0);

    @OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
    public final native int method861();

    @OriginalMember(owner = "client!j", name = "L", descriptor = "(Lj;Lj;IZZ)V")
    public final native void method2845(class494 arg0, class494 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class409.method2220(this, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
    public final native void method897(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
    public final native void method862(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method910(int arg0, int arg1, class389 arg2, boolean arg3) {
        return this.field7156.method364().method3403(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()[Lhaa;")
    public final class73[] method882() {
        return this.field7155;
    }

    @OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
    public final native void method889();

    @OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
    public final native int method912();

    @OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
    public final native int method876();

    @OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
    public final native void method905(int arg0);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
    public final native int method902();

    @OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
    public final native void method916(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lmr;II)V")
    public final void method871(class389 arg0, class130 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field7156.method364().method3405(this, arg0, null, arg2, arg3);
            return;
        }
        class56.field575[5] = 0;
        this.field7156.method364().method3405(this, arg0, class56.field575, arg2, arg3);
        arg1.field1460 = class56.field575[0];
        arg1.field1457 = class56.field575[1];
        arg1.field1458 = class56.field575[2];
        arg1.field1459 = class56.field575[3];
        arg1.field1461 = class56.field575[4];
        arg1.field1462 = class56.field575[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lba;IIIZ)V")
    public final void method885(class350 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field7156.method364().method3414(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
    public final native int method872();

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;)V")
    public final void method866(class389 arg0) {
        this.method2844(class56.field573, arg0);
        int var2 = 0;
        if (this.field7157 != null) {
            for (int var3 = 0; var3 < this.field7157.length; var3++) {
                class375 var4 = this.field7157[var3];
                var4.field4870 = class56.field573[var2++];
                var4.field4868 = class56.field573[var2++];
                var4.field4864 = class56.field573[var2++];
                var4.field4869 = class56.field573[var2++];
                var4.field4875 = class56.field573[var2++];
                var4.field4885 = class56.field573[var2++];
                var4.field4879 = class56.field573[var2++];
                var4.field4881 = class56.field573[var2++];
                var4.field4867 = class56.field573[var2++];
            }
        }
        if (this.field7155 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field7155.length; var5++) {
            class73 var6 = this.field7155[var5];
            class73 var7 = var6;
            if (var6.field777 != null) {
                var7 = var6.field777;
            }
            if (var6.field763 == null) {
                var6.field763 = arg0.method224();
            } else {
                var6.field763.method233(arg0);
            }
            var7.field769 = class56.field573[var2++];
            var7.field764 = class56.field573[var2++];
            var7.field767 = class56.field573[var2++];
        }
    }

    @OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lda;)V")
    private final native void method2846(class56 arg0);

    @OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
    public final native void method59(boolean arg0);

    @OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
    public final native int method875();

    @OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
    public final native void method915(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()Z")
    public final boolean method898() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()V")
    public final void method888() {
    }

    @OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
    public final native int method869();

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
    public final native void method879();

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public final void method899(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
    public final native void method911(int arg0);

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;La;Lqda;IIII)V")
    public class494(class56 arg0, class564 arg1, class90 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7156 = arg0;
        this.field7158 = arg1;
        this.field7157 = arg2.field987;
        this.field7155 = arg2.field1019;
        int var8 = arg2.field987 == null ? 0 : arg2.field987.length;
        int var9 = arg2.field1019 == null ? 0 : arg2.field1019.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field7157[var12].field4877;
            var11[var10++] = this.field7157[var12].field4884;
            var11[var10++] = this.field7157[var12].field4882;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field7155[var13].field773;
        }
        int var14 = arg2.field1030 == null ? 0 : arg2.field1030.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class387 var20 = arg2.field1030[var17];
            class104 var21 = class289.method1634(var20.field5174, (byte) -56);
            var15[var16++] = var20.field5171;
            var15[var16++] = var21.field1125;
            var15[var16++] = var21.field1132;
            var15[var16++] = var21.field1129;
            var15[var16++] = var21.field1127;
            var15[var16++] = var21.field1128;
            var15[var16++] = var21.field1126 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class387 var19 = arg2.field1030[var18];
            var15[var16++] = var19.field5173;
        }
        this.method2843(this.field7156, this.field7158, arg2.field1034, arg2.field1011, arg2.field1025, arg2.field1018, arg2.field988, arg2.field1008, arg2.field1023, arg2.field1026, arg2.field1028, arg2.field1033, arg2.field1004, arg2.field1000, arg2.field989, arg2.field1035, arg2.field1031, arg2.field1016, arg2.field1001, arg2.field1006, arg2.field1020, arg2.field991, arg2.field1002, arg2.field1027, arg2.field1014, arg2.field1015, arg2.field998, arg2.field997, arg2.field995, arg2.field1029, arg2.field1021, arg2.field1012, arg2.field1017, arg2.field1039, arg2.field1022, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;)V")
    public class494(class56 arg0) {
        this.field7156 = arg0;
        this.field7158 = null;
        this.method2846(arg0);
    }

    @OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final native void method900(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final native void method884(int arg0, int arg1, class137 arg2, class137 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
    public final native void method892(int arg0);
}
