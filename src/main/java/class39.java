import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class39 extends class475 implements class533 {

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Loa;")
    private class695 field542;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lya;")
    private class52 field543;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "[Lcm;")
    public class730[] field545;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[Lhi;")
    public class207[] field544;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 7)
    public final void method170(class475 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field542.method3917().method3399(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lofa;Lvh;II)V", line = 11)
    public final void method160(class333 arg0, class364 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field542.method3917().method3410(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class695.field9683[5] = 0;
            this.field542.method3917().method3410(this, arg0, class695.field9683, arg2, arg3);
            arg1.field5122 = class695.field9683[0];
            arg1.field5121 = class695.field9683[1];
            arg1.field5120 = class695.field9683[2];
            arg1.field5118 = class695.field9683[3];
            arg1.field5119 = class695.field9683[4];
            arg1.field5117 = class695.field9683[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILofa;ZII)Z", line = 27)
    public final boolean method203(int arg0, int arg1, class333 arg2, boolean arg3, int arg4, int arg5) {
        return this.field542.method3917().method3403(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Z", line = 33)
    public final boolean method172() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 41)
    public final void method144(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method303(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 45)
    public final void method187() {
        if (this.field542.field9687 > 1) {
            synchronized (this) {
                while (super.field6517) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6517 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 66)
    public final void method199(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILofa;ZI)Z", line = 72)
    public final boolean method158(int arg0, int arg1, class333 arg2, boolean arg3, int arg4) {
        return this.field542.method3917().method3413(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 82)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class521.method2896(this, (byte) 43);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lofa;)V", line = 88)
    public final void method200(class333 arg0) {
        this.method306(class695.field9670, arg0);
        int var2 = 0;
        if (this.field545 != null) {
            for (int var3 = 0; var3 < this.field545.length; ++var3) {
                class730 var4 = this.field545[var3];
                var4.field10121 = class695.field9670[var2++];
                var4.field10132 = class695.field9670[var2++];
                var4.field10131 = class695.field9670[var2++];
                var4.field10127 = class695.field9670[var2++];
                var4.field10126 = class695.field9670[var2++];
                var4.field10114 = class695.field9670[var2++];
                var4.field10113 = class695.field9670[var2++];
                var4.field10115 = class695.field9670[var2++];
                var4.field10129 = class695.field9670[var2++];
            }
        }
        if (this.field544 != null) {
            for (int var5 = 0; var5 < this.field544.length; ++var5) {
                class207 var6 = this.field544[var5];
                class207 var7 = var6;
                if (var6.field3068 != null) {
                    var7 = var6.field3068;
                }
                if (var6.field3070 != null) {
                    var6.field3070.method1712(arg0);
                } else {
                    var6.field3070 = arg0.method1703();
                }
                var7.field3073 = class695.field9670[var2++];
                var7.field3072 = class695.field9670[var2++];
                var7.field3079 = class695.field9670[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILofa;)V", line = 146)
    private final void method306(int[] arg0, class333 arg1) {
        this.field542.method3917().method3385(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()[Lcm;", line = 149)
    public final class730[] method150() {
        return this.field545;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 156)
    public final void method181() {
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lhi;", line = 162)
    public final class207[] method195() {
        return this.field544;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lofa;Lvh;I)V", line = 166)
    public final void method155(class333 arg0, class364 arg1, int arg2) {
        if (arg1 == null) {
            this.field542.method3917().method3386(this, arg0, (int[]) null, arg2);
        } else {
            class695.field9683[5] = 0;
            this.field542.method3917().method3386(this, arg0, class695.field9683, arg2);
            arg1.field5122 = class695.field9683[0];
            arg1.field5121 = class695.field9683[1];
            arg1.field5120 = class695.field9683[2];
            arg1.field5118 = class695.field9683[3];
            arg1.field5119 = class695.field9683[4];
            arg1.field5117 = class695.field9683[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lofa;IZ)V", line = 183)
    public final void method191(class333 arg0, int arg1, boolean arg2) {
        this.method302(((class280) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 188)
    public final class475 method171(byte arg0, int arg1, boolean arg2) {
        return this.field542.method3917().method3388(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 191)
    public final void method157() {
        if (this.field542.field9687 > 1) {
            synchronized (this) {
                super.field6517 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lur;IIII)V", line = 204)
    public class39(class695 arg0, class52 arg1, class538 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field542 = arg0;
        this.field543 = arg1;
        this.field545 = arg2.field7101;
        this.field544 = arg2.field7116;
        int var8 = arg2.field7101 == null ? 0 : arg2.field7101.length;
        int var9 = arg2.field7116 == null ? 0 : arg2.field7116.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field545[var12].field10120;
            var11[var10++] = this.field545[var12].field10125;
            var11[var10++] = this.field545[var12].field10130;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field544[var13].field3066;
        }
        int var14 = arg2.field7104 == null ? 0 : arg2.field7104.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class492 var20 = arg2.field7104[var17];
            class119 var21 = class591.method3219(0, var20.field6663);
            var15[var16++] = var20.field6660;
            var15[var16++] = var21.field1909;
            var15[var16++] = var21.field1908;
            var15[var16++] = var21.field1905;
            var15[var16++] = var21.field1910;
            var15[var16++] = var21.field1904;
            var15[var16++] = var21.field1913 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class492 var19 = arg2.field7104[var18];
            var15[var16++] = var19.field6664;
        }
        this.method305(this.field542, this.field543, arg2.field7119, arg2.field7131, arg2.field7083, arg2.field7125, arg2.field7096, arg2.field7113, arg2.field7094, arg2.field7084, arg2.field7102, arg2.field7080, arg2.field7129, arg2.field7132, arg2.field7128, arg2.field7117, arg2.field7082, arg2.field7110, arg2.field7112, arg2.field7086, arg2.field7092, arg2.field7120, arg2.field7095, arg2.field7089, arg2.field7103, arg2.field7105, arg2.field7126, arg2.field7114, arg2.field7085, arg2.field7077, arg2.field7111, arg2.field7098, arg2.field7097, arg2.field7088, arg2.field7090, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 275)
    public class39(class695 arg0) {
        this.field542 = arg0;
        this.field543 = null;
        this.method307(arg0);
    }

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method156(int arg0);

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method143(int arg0);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method167();

    @OriginalMember(owner = "client!i", name = "J", descriptor = "(JIZ)V")
    private final native void method302(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method217();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method303(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method146(int arg0);

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method152(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method304(class39 arg0, class39 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method211();

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method213();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method116(boolean arg0);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class184 method154(class184 arg0);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method145();

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method183(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method179(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method207(int arg0, int arg1, class282 arg2, class282 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method210(int arg0);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method214();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method206(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method190(int arg0);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method188(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method305(class695 arg0, class52 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method165(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method307(class695 arg0);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method194(int arg0);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method205();

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method148();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method163();

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method180();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method185(int arg0);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method202();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method192();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method209();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method175();

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method159();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method178();
}
