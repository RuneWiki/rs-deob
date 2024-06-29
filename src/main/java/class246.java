import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class246 extends class283 implements class2 {

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Loa;")
    private class406 field3425;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lya;")
    private class74 field3424;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "[Lhr;")
    public class57[] field3426;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[Loo;")
    public class648[] field3427;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lhr;", line = 4)
    public final class57[] method1158() {
        return this.field3426;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Loo;", line = 8)
    public final class648[] method1145() {
        return this.field3427;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 12)
    public final void method1142(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1563(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()Z", line = 15)
    public final boolean method1153() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 20)
    public final void method1160() {
        if (this.field3425.field5645 > 1) {
            synchronized (this) {
                super.field3753 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Luha;IZ)V", line = 36)
    public final void method1129(class723 arg0, int arg1, boolean arg2) {
        this.method1565(((class135) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Luha;Lau;I)V", line = 45)
    public final void method1168(class723 arg0, class247 arg1, int arg2) {
        if (arg1 == null) {
            this.field3425.method2466().method1046(this, arg0, (int[]) null, arg2);
        } else {
            class406.field5629[5] = 0;
            this.field3425.method2466().method1046(this, arg0, class406.field5629, arg2);
            arg1.field3428 = class406.field5629[0];
            arg1.field3429 = class406.field5629[1];
            arg1.field3430 = class406.field5629[2];
            arg1.field3433 = class406.field5629[3];
            arg1.field3432 = class406.field5629[4];
            arg1.field3431 = class406.field5629[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 63)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class301.method1765(this, 0);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILuha;ZII)Z", line = 68)
    public final boolean method1151(int arg0, int arg1, class723 arg2, boolean arg3, int arg4, int arg5) {
        return this.field3425.method2466().method1041(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 80)
    public final class283 method1147(byte arg0, int arg1, boolean arg2) {
        return this.field3425.method2466().method1042(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILuha;)V", line = 88)
    private final void method1566(int[] arg0, class723 arg1) {
        this.field3425.method2466().method1051(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Luha;Lau;II)V", line = 91)
    public final void method1164(class723 arg0, class247 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field3425.method2466().method1048(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class406.field5629[5] = 0;
            this.field3425.method2466().method1048(this, arg0, class406.field5629, arg2, arg3);
            arg1.field3428 = class406.field5629[0];
            arg1.field3429 = class406.field5629[1];
            arg1.field3430 = class406.field5629[2];
            arg1.field3433 = class406.field5629[3];
            arg1.field3432 = class406.field5629[4];
            arg1.field3431 = class406.field5629[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Luha;)V", line = 107)
    public final void method1172(class723 arg0) {
        this.method1566(class406.field5633, arg0);
        int var2 = 0;
        if (this.field3426 != null) {
            for (int var3 = 0; var3 < this.field3426.length; ++var3) {
                class57 var4 = this.field3426[var3];
                var4.field795 = class406.field5633[var2++];
                var4.field788 = class406.field5633[var2++];
                var4.field792 = class406.field5633[var2++];
                var4.field796 = class406.field5633[var2++];
                var4.field799 = class406.field5633[var2++];
                var4.field805 = class406.field5633[var2++];
                var4.field794 = class406.field5633[var2++];
                var4.field797 = class406.field5633[var2++];
                var4.field803 = class406.field5633[var2++];
            }
        }
        if (this.field3427 != null) {
            for (int var5 = 0; var5 < this.field3427.length; ++var5) {
                class648 var6 = this.field3427[var5];
                class648 var7 = var6;
                if (var6.field9188 != null) {
                    var7 = var6.field9188;
                }
                if (var6.field9191 != null) {
                    var6.field9191.method864(arg0);
                } else {
                    var6.field9191 = arg0.method859();
                }
                var7.field9185 = class406.field5633[var2++];
                var7.field9186 = class406.field5633[var2++];
                var7.field9190 = class406.field5633[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 161)
    public final void method1112() {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 163)
    public final void method1149(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 170)
    public final void method1123() {
        if (this.field3425.field5645 > 1) {
            synchronized (this) {
                while (super.field3753) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field3753 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 191)
    public final void method1152(class283 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3425.method2466().method1043(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILuha;ZI)Z", line = 196)
    public final boolean method1155(int arg0, int arg1, class723 arg2, boolean arg3, int arg4) {
        return this.field3425.method2466().method1036(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lkda;IIII)V", line = 204)
    public class246(class406 arg0, class74 arg1, class64 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3425 = arg0;
        this.field3424 = arg1;
        this.field3426 = arg2.field857;
        this.field3427 = arg2.field848;
        int var8 = arg2.field857 == null ? 0 : arg2.field857.length;
        int var9 = arg2.field848 == null ? 0 : arg2.field848.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field3426[var12].field800;
            var11[var10++] = this.field3426[var12].field786;
            var11[var10++] = this.field3426[var12].field790;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field3427[var13].field9184;
        }
        int var14 = arg2.field879 == null ? 0 : arg2.field879.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class9 var20 = arg2.field879[var17];
            class501 var21 = class67.method435(87, var20.field86);
            var15[var16++] = var20.field83;
            var15[var16++] = var21.field7009;
            var15[var16++] = var21.field7015;
            var15[var16++] = var21.field7004;
            var15[var16++] = var21.field7008;
            var15[var16++] = var21.field7007;
            var15[var16++] = var21.field7002 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class9 var19 = arg2.field879[var18];
            var15[var16++] = var19.field84;
        }
        this.method1564(this.field3425, this.field3424, arg2.field866, arg2.field874, arg2.field876, arg2.field887, arg2.field884, arg2.field855, arg2.field861, arg2.field851, arg2.field863, arg2.field865, arg2.field852, arg2.field858, arg2.field860, arg2.field864, arg2.field897, arg2.field872, arg2.field859, arg2.field878, arg2.field882, arg2.field883, arg2.field850, arg2.field867, arg2.field847, arg2.field899, arg2.field898, arg2.field862, arg2.field889, arg2.field856, arg2.field894, arg2.field853, arg2.field886, arg2.field868, arg2.field880, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 275)
    public class246(class406 arg0) {
        this.field3425 = arg0;
        this.field3424 = null;
        this.method1567(arg0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method1133(int arg0);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method1118(int arg0);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method1159(int arg0);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method1114();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method1132();

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method1113();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method3(boolean arg0);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method1563(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method1134(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method1119();

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method1128();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1564(class406 arg0, class74 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method1150();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method1169();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method1140();

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class706 method1124(class706 arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method1161(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method1120();

    @OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
    private final native void method1565(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method1136();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method1131(int arg0);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method1126();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method1141();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method1148(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method1117(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method1138(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method1135();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method1165(int arg0);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method1122();

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method1567(class406 arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method1154(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method1166(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method1568(class246 arg0, class246 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method1167(int arg0);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method1130();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method1116();

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method1162(int arg0);
}
