import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class44 extends class496 implements class557 {

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Loa;")
    private class722 field557;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lya;")
    private class59 field556;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[Lgv;")
    public class88[] field555;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "[Loq;")
    public class378[] field554;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method87(int arg0);

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class196.method1359(this, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method120();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method100();

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method109();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class496 method93(byte arg0, int arg1, boolean arg2) {
        return this.field557.method4044().method3695(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method96(int arg0, int arg1, class294 arg2, class294 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "K", descriptor = "(JIZ)V")
    private final native void method319(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
    public final boolean method73() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method91(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
    public final void method65() {
        if (this.field557.field10008 > 1) {
            synchronized (this) {
                super.field7069 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method75();

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method74(int arg0);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method320(class722 arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILqja;ZII)Z")
    public final boolean method77(int arg0, int arg1, class326 arg2, boolean arg3, int arg4, int arg5) {
        return this.field557.method4044().method3689(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method321(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method89();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method108();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method322(class722 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lgv;")
    public final class88[] method97() {
        return this.field555;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
    public final void method119() {
        if (this.field557.field10008 > 1) {
            synchronized (this) {
                while (super.field7069) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field7069 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method92(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqja;Lag;I)V")
    public final void method88(class326 arg0, class711 arg1, int arg2) {
        if (arg1 == null) {
            this.field557.method4044().method3696(this, arg0, (int[]) null, arg2);
        } else {
            class722.field9990[5] = 0;
            this.field557.method4044().method3696(this, arg0, class722.field9990, arg2);
            arg1.field9872 = class722.field9990[0];
            arg1.field9876 = class722.field9990[1];
            arg1.field9877 = class722.field9990[2];
            arg1.field9874 = class722.field9990[3];
            arg1.field9873 = class722.field9990[4];
            arg1.field9875 = class722.field9990[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method118();

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()[Loq;")
    public final class378[] method103() {
        return this.field554;
    }

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method78(int arg0);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method323(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method67(class496 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field557.method4044().method3667(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqja;IZ)V")
    public final void method105(class326 arg0, int arg1, boolean arg2) {
        this.method319(((class292) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method69();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method211(boolean arg0);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method110();

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method116();

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method68();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method121();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method90(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILqja;)V")
    private final void method324(int[] arg0, class326 arg1) {
        this.field557.method4044().method3684(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method85(int arg0);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method114(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class194 method70(class194 arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqja;Lag;II)V")
    public final void method106(class326 arg0, class711 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field557.method4044().method3677(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class722.field9990[5] = 0;
            this.field557.method4044().method3677(this, arg0, class722.field9990, arg2, arg3);
            arg1.field9872 = class722.field9990[0];
            arg1.field9876 = class722.field9990[1];
            arg1.field9877 = class722.field9990[2];
            arg1.field9874 = class722.field9990[3];
            arg1.field9873 = class722.field9990[4];
            arg1.field9875 = class722.field9990[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method113();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method82(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method321(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method111(int arg0);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method115(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method84(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method76(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method102();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqja;)V")
    public final void method66(class326 arg0) {
        this.method324(class722.field9991, arg0);
        int var2 = 0;
        if (this.field555 != null) {
            for (int var3 = 0; var3 < this.field555.length; ++var3) {
                class88 var4 = this.field555[var3];
                var4.field986 = class722.field9991[var2++];
                var4.field974 = class722.field9991[var2++];
                var4.field992 = class722.field9991[var2++];
                var4.field985 = class722.field9991[var2++];
                var4.field973 = class722.field9991[var2++];
                var4.field988 = class722.field9991[var2++];
                var4.field983 = class722.field9991[var2++];
                var4.field982 = class722.field9991[var2++];
                var4.field972 = class722.field9991[var2++];
            }
        }
        if (this.field554 != null) {
            for (int var5 = 0; var5 < this.field554.length; ++var5) {
                class378 var6 = this.field554[var5];
                class378 var7 = var6;
                if (var6.field5213 != null) {
                    var7 = var6.field5213;
                }
                if (var6.field5222 != null) {
                    var6.field5222.method1884(arg0);
                } else {
                    var6.field5222 = arg0.method1872();
                }
                var7.field5214 = class722.field9991[var2++];
                var7.field5216 = class722.field9991[var2++];
                var7.field5217 = class722.field9991[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
    public final void method107() {
    }

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method81(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILqja;ZI)Z")
    public final boolean method95(int arg0, int arg1, class326 arg2, boolean arg3, int arg4) {
        return this.field557.method4044().method3683(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Ldba;IIII)V")
    public class44(class722 arg0, class59 arg1, class100 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field557 = arg0;
        this.field556 = arg1;
        this.field555 = arg2.field1142;
        this.field554 = arg2.field1160;
        int var8 = arg2.field1142 == null ? 0 : arg2.field1142.length;
        int var9 = arg2.field1160 == null ? 0 : arg2.field1160.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field555[var12].field979;
            var11[var10++] = this.field555[var12].field976;
            var11[var10++] = this.field555[var12].field989;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field554[var13].field5211;
        }
        int var14 = arg2.field1162 == null ? 0 : arg2.field1162.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class727 var20 = arg2.field1162[var17];
            class659 var21 = class144.method1022((byte) -116, var20.field10046);
            var15[var16++] = var20.field10042;
            var15[var16++] = var21.field9190;
            var15[var16++] = var21.field9189;
            var15[var16++] = var21.field9193;
            var15[var16++] = var21.field9197;
            var15[var16++] = var21.field9192;
            var15[var16++] = var21.field9188 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class727 var19 = arg2.field1162[var18];
            var15[var16++] = var19.field10048;
        }
        this.method322(this.field557, this.field556, arg2.field1153, arg2.field1172, arg2.field1165, arg2.field1164, arg2.field1168, arg2.field1173, arg2.field1149, arg2.field1146, arg2.field1175, arg2.field1152, arg2.field1158, arg2.field1126, arg2.field1135, arg2.field1122, arg2.field1174, arg2.field1154, arg2.field1161, arg2.field1138, arg2.field1124, arg2.field1125, arg2.field1140, arg2.field1163, arg2.field1170, arg2.field1156, arg2.field1131, arg2.field1128, arg2.field1144, arg2.field1151, arg2.field1129, arg2.field1145, arg2.field1177, arg2.field1141, arg2.field1176, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method72();

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class44(class722 arg0) {
        this.field557 = arg0;
        this.field556 = null;
        this.method320(arg0);
    }
}
