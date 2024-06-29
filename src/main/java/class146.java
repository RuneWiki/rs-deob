import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class146 extends class395 implements class52 {

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Ll;")
    private class260 field2087;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "Lm;")
    private class494 field2089;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "[Lrca;")
    public class30[] field2088;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[Lil;")
    public class586[] field2090;

    @OriginalMember(owner = "client!v", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "()I")
    public final native int method1007();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()Z")
    public final boolean method1008() {
        return true;
    }

    @OriginalMember(owner = "client!v", name = "l", descriptor = "()I")
    public final native int method1009();

    @OriginalMember(owner = "client!v", name = "ga", descriptor = "(I)V")
    public final native void method1010(int arg0);

    @OriginalMember(owner = "client!v", name = "H", descriptor = "()I")
    public final native int method1011();

    @OriginalMember(owner = "client!v", name = "KA", descriptor = "()I")
    public final native int method1012();

    @OriginalMember(owner = "client!v", name = "n", descriptor = "(Lv;Lv;IZZ)V")
    public final native void method1013(class146 arg0, class146 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!v", name = "ba", descriptor = "(IILi;Li;III)V")
    public final native void method1014(int arg0, int arg1, class682 arg2, class682 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!v", name = "TA", descriptor = "()I")
    public final native int method1015();

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()V")
    public final void method1016() {
    }

    @OriginalMember(owner = "client!v", name = "SA", descriptor = "(I)V")
    public final native void method1017(int arg0);

    @OriginalMember(owner = "client!v", name = "RA", descriptor = "()I")
    public final native int method1018();

    @OriginalMember(owner = "client!v", name = "oa", descriptor = "(III)V")
    public final native void method1019(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([ILq;)V")
    private final void method1020(int[] arg0, class151 arg1) {
        this.field2087.method1547().method3732(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!v", name = "X", descriptor = "(Ll;)V")
    private final native void method1021(class260 arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method1022(int arg0, int arg1, class151 arg2, boolean arg3, int arg4) {
        return this.field2087.method1547().method3724(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "F", descriptor = "()Z")
    public final native boolean method1023();

    @OriginalMember(owner = "client!v", name = "LA", descriptor = "()Z")
    public final native boolean method1024();

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class493.method2818(false, this);
        }
    }

    @OriginalMember(owner = "client!v", name = "UA", descriptor = "(Z)V")
    public final native void method306(boolean arg0);

    @OriginalMember(owner = "client!v", name = "FA", descriptor = "()V")
    public final native void method1025();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method1026(int arg0, int arg1, class151 arg2, boolean arg3) {
        return this.field2087.method1547().method3724(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!v", name = "PA", descriptor = "()I")
    public final native int method1027();

    @OriginalMember(owner = "client!v", name = "f", descriptor = "()V")
    public final void method1028() {
        if (this.field2087.field3383 > 1) {
            synchronized (this) {
                super.field5974 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "na", descriptor = "()I")
    public final native int method1029();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lqh;II)V")
    public final void method1030(class151 arg0, class67 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2087.method1547().method3734(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class260.field3370[5] = 0;
            this.field2087.method1547().method3734(this, arg0, class260.field3370, arg2, arg3);
            arg1.field1059 = class260.field3370[0];
            arg1.field1055 = class260.field3370[1];
            arg1.field1056 = class260.field3370[2];
            arg1.field1058 = class260.field3370[3];
            arg1.field1060 = class260.field3370[4];
            arg1.field1057 = class260.field3370[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "S", descriptor = "(Lha;)Lha;")
    public final native class425 method1031(class425 arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;)V")
    public final void method1032(class151 arg0) {
        this.method1020(class260.field3367, arg0);
        int var2 = 0;
        if (this.field2088 != null) {
            for (int var3 = 0; var3 < this.field2088.length; ++var3) {
                class30 var4 = this.field2088[var3];
                var4.field512 = class260.field3367[var2++];
                var4.field517 = class260.field3367[var2++];
                var4.field524 = class260.field3367[var2++];
                var4.field525 = class260.field3367[var2++];
                var4.field522 = class260.field3367[var2++];
                var4.field523 = class260.field3367[var2++];
                var4.field510 = class260.field3367[var2++];
                var4.field505 = class260.field3367[var2++];
                var4.field519 = class260.field3367[var2++];
            }
        }
        if (this.field2090 != null) {
            for (int var5 = 0; var5 < this.field2090.length; ++var5) {
                class586 var6 = this.field2090[var5];
                class586 var7 = var6;
                if (var6.field8499 != null) {
                    var7 = var6.field8499;
                }
                if (var6.field8502 != null) {
                    var6.field8502.method887(arg0);
                } else {
                    var6.field8502 = arg0.method888();
                }
                var7.field8505 = class260.field3367[var2++];
                var7.field8508 = class260.field3367[var2++];
                var7.field8506 = class260.field3367[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "R", descriptor = "(III)V")
    public final native void method1033(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!v", name = "WA", descriptor = "(IIII)V")
    public final native void method1034(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!v", name = "EA", descriptor = "(JIZ)V")
    private final native void method1035(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!v", name = "QA", descriptor = "(Ll;Lm;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1036(class260 arg0, class494 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!v", name = "fa", descriptor = "(I)V")
    public final native void method1037(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BIZ)Lda;")
    public final class395 method1038(byte arg0, int arg1, boolean arg2) {
        return this.field2087.method1547().method3731(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "za", descriptor = "()I")
    public final native int method1039();

    @OriginalMember(owner = "client!v", name = "L", descriptor = "()V")
    public final native void method1040();

    @OriginalMember(owner = "client!v", name = "K", descriptor = "()I")
    public final native int method1041();

    @OriginalMember(owner = "client!v", name = "M", descriptor = "(I)V")
    public final native void method1042(int arg0);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;IZ)V")
    public final void method1043(class151 arg0, int arg1, boolean arg2) {
        this.method1035(((class359) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "W", descriptor = "(I)V")
    public final native void method1044(int arg0);

    @OriginalMember(owner = "client!v", name = "DA", descriptor = "(SS)V")
    public final native void method1045(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method1046(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1056(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    public final void method1047(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!v", name = "MA", descriptor = "(I)V")
    public final native void method1048(int arg0);

    @OriginalMember(owner = "client!v", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final native void method1049(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "(I)V")
    public final native void method1050(int arg0);

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;Lm;Lak;IIII)V")
    public class146(class260 arg0, class494 arg1, class677 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2087 = arg0;
        this.field2089 = arg1;
        this.field2088 = arg2.field9576;
        this.field2090 = arg2.field9552;
        int var8 = arg2.field9576 == null ? 0 : arg2.field9576.length;
        int var9 = arg2.field9552 == null ? 0 : arg2.field9552.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field2088[var12].field509;
            var11[var10++] = this.field2088[var12].field515;
            var11[var10++] = this.field2088[var12].field520;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field2090[var13].field8503;
        }
        int var14 = arg2.field9553 == null ? 0 : arg2.field9553.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class484 var20 = arg2.field9553[var17];
            class512 var21 = class342.method2119(var20.field6903, (byte) -117);
            var15[var16++] = var20.field6900;
            var15[var16++] = var21.field7215;
            var15[var16++] = var21.field7208;
            var15[var16++] = var21.field7211;
            var15[var16++] = var21.field7216;
            var15[var16++] = var21.field7219;
            var15[var16++] = var21.field7218 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class484 var19 = arg2.field9553[var18];
            var15[var16++] = var19.field6899;
        }
        this.method1036(this.field2087, this.field2089, arg2.field9581, arg2.field9578, arg2.field9554, arg2.field9547, arg2.field9558, arg2.field9557, arg2.field9574, arg2.field9548, arg2.field9583, arg2.field9549, arg2.field9538, arg2.field9562, arg2.field9585, arg2.field9582, arg2.field9543, arg2.field9564, arg2.field9566, arg2.field9561, arg2.field9584, arg2.field9567, arg2.field9551, arg2.field9555, arg2.field9540, arg2.field9571, arg2.field9588, arg2.field9590, arg2.field9573, arg2.field9568, arg2.field9550, arg2.field9536, arg2.field9575, arg2.field9539, arg2.field9559, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()V")
    public final void method1051() {
        if (this.field2087.field3383 > 1) {
            synchronized (this) {
                while (super.field5974) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field5974 = true;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Ll;)V")
    public class146(class260 arg0) {
        this.field2087 = arg0;
        this.field2089 = null;
        this.method1021(arg0);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(SS)V")
    public final native void method1052(short arg0, short arg1);

    @OriginalMember(owner = "client!v", name = "OA", descriptor = "()I")
    public final native int method1053();

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lq;Lqh;I)V")
    public final void method1054(class151 arg0, class67 arg1, int arg2) {
        if (arg1 == null) {
            this.field2087.method1547().method3723(this, arg0, (int[]) null, arg2);
        } else {
            class260.field3370[5] = 0;
            this.field2087.method1547().method3723(this, arg0, class260.field3370, arg2);
            arg1.field1059 = class260.field3370[0];
            arg1.field1055 = class260.field3370[1];
            arg1.field1056 = class260.field3370[2];
            arg1.field1058 = class260.field3370[3];
            arg1.field1060 = class260.field3370[4];
            arg1.field1057 = class260.field3370[5] != 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method1055(class395 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2087.method1547().method3729(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!v", name = "I", descriptor = "(JI[IIIIIZ)V")
    private final native void method1056(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!v", name = "e", descriptor = "()[Lrca;")
    public final class30[] method1057() {
        return this.field2088;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()[Lil;")
    public final class586[] method1058() {
        return this.field2090;
    }
}
