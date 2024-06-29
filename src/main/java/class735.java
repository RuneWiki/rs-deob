import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class735 extends class219 implements class752 {

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Loa;")
    private class50 field10280;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "Lya;")
    private class305 field10281;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[Lal;")
    public class183[] field10279;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "[Lmi;")
    public class27[] field10282;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILwc;ZI)Z", line = 15)
    public final boolean method1378(int arg0, int arg1, class376 arg2, boolean arg3, int arg4) {
        return this.field10280.method406().method3554(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 18)
    public final void method1369(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lwc;Lfda;I)V", line = 21)
    public final void method1351(class376 arg0, class678 arg1, int arg2) {
        if (arg1 == null) {
            this.field10280.method406().method3535(this, arg0, (int[]) null, arg2);
        } else {
            class50.field741[5] = 0;
            this.field10280.method406().method3535(this, arg0, class50.field741, arg2);
            arg1.field9207 = class50.field741[0];
            arg1.field9203 = class50.field741[1];
            arg1.field9205 = class50.field741[2];
            arg1.field9204 = class50.field741[3];
            arg1.field9206 = class50.field741[4];
            arg1.field9208 = class50.field741[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILwc;)V", line = 37)
    private final void method4115(int[] arg0, class376 arg1) {
        this.field10280.method406().method3546(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lal;", line = 43)
    public final class183[] method1332() {
        return this.field10279;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lwc;IZ)V", line = 47)
    public final void method1325(class376 arg0, int arg1, boolean arg2) {
        this.method4117(((class640) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lwc;)V", line = 53)
    public final void method1366(class376 arg0) {
        this.method4115(class50.field739, arg0);
        int var2 = 0;
        if (this.field10279 != null) {
            for (int var3 = 0; var3 < this.field10279.length; ++var3) {
                class183 var4 = this.field10279[var3];
                var4.field2395 = class50.field739[var2++];
                var4.field2396 = class50.field739[var2++];
                var4.field2403 = class50.field739[var2++];
                var4.field2390 = class50.field739[var2++];
                var4.field2399 = class50.field739[var2++];
                var4.field2397 = class50.field739[var2++];
                var4.field2409 = class50.field739[var2++];
                var4.field2406 = class50.field739[var2++];
                var4.field2405 = class50.field739[var2++];
            }
        }
        if (this.field10282 != null) {
            for (int var5 = 0; var5 < this.field10282.length; ++var5) {
                class27 var6 = this.field10282[var5];
                class27 var7 = var6;
                if (var6.field445 != null) {
                    var7 = var6.field445;
                }
                if (var6.field440 != null) {
                    var6.field440.method1961(arg0);
                } else {
                    var6.field440 = arg0.method1965();
                }
                var7.field447 = class50.field739[var2++];
                var7.field443 = class50.field739[var2++];
                var7.field451 = class50.field739[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 110)
    public final class219 method1337(byte arg0, int arg1, boolean arg2) {
        return this.field10280.method406().method3536(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 117)
    public final void method1329(class219 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field10280.method406().method3556(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Z", line = 122)
    public final boolean method1323() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lwc;Lfda;II)V", line = 125)
    public final void method1375(class376 arg0, class678 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field10280.method406().method3564(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class50.field741[5] = 0;
            this.field10280.method406().method3564(this, arg0, class50.field741, arg2, arg3);
            arg1.field9207 = class50.field741[0];
            arg1.field9203 = class50.field741[1];
            arg1.field9205 = class50.field741[2];
            arg1.field9204 = class50.field741[3];
            arg1.field9206 = class50.field741[4];
            arg1.field9208 = class50.field741[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lmi;", line = 141)
    public final class27[] method1335() {
        return this.field10282;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILwc;ZII)Z", line = 144)
    public final boolean method1357(int arg0, int arg1, class376 arg2, boolean arg3, int arg4, int arg5) {
        return this.field10280.method406().method3562(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 149)
    public final void method1324(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method4113(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 157)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class133.method841(0, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 168)
    public final void method1376() {
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 176)
    public final void method1367() {
        if (this.field10280.field750 > 1) {
            synchronized (this) {
                super.field2780 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 187)
    public final void method1371() {
        if (this.field10280.field750 > 1) {
            synchronized (this) {
                while (super.field2780) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field2780 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lid;IIII)V", line = 204)
    public class735(class50 arg0, class305 arg1, class415 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field10280 = arg0;
        this.field10281 = arg1;
        this.field10279 = arg2.field5856;
        this.field10282 = arg2.field5888;
        int var8 = arg2.field5856 == null ? 0 : arg2.field5856.length;
        int var9 = arg2.field5888 == null ? 0 : arg2.field5888.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field10279[var12].field2393;
            var11[var10++] = this.field10279[var12].field2394;
            var11[var10++] = this.field10279[var12].field2402;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field10282[var13].field444;
        }
        int var14 = arg2.field5855 == null ? 0 : arg2.field5855.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class609 var20 = arg2.field5855[var17];
            class13 var21 = class310.method1810((byte) 93, var20.field8440);
            var15[var16++] = var20.field8436;
            var15[var16++] = var21.field185;
            var15[var16++] = var21.field186;
            var15[var16++] = var21.field184;
            var15[var16++] = var21.field182;
            var15[var16++] = var21.field189;
            var15[var16++] = var21.field188 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class609 var19 = arg2.field5855[var18];
            var15[var16++] = var19.field8435;
        }
        this.method4116(this.field10280, this.field10281, arg2.field5908, arg2.field5854, arg2.field5892, arg2.field5857, arg2.field5889, arg2.field5884, arg2.field5887, arg2.field5862, arg2.field5865, arg2.field5902, arg2.field5890, arg2.field5875, arg2.field5872, arg2.field5860, arg2.field5895, arg2.field5870, arg2.field5905, arg2.field5886, arg2.field5903, arg2.field5879, arg2.field5893, arg2.field5869, arg2.field5864, arg2.field5859, arg2.field5867, arg2.field5897, arg2.field5861, arg2.field5899, arg2.field5898, arg2.field5885, arg2.field5863, arg2.field5891, arg2.field5882, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 275)
    public class735(class50 arg0) {
        this.field10280 = arg0;
        this.field10281 = null;
        this.method4112(arg0);
    }

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method1350(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method1340();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method1362(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method1358(int arg0);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method1328();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method1336(int arg0);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method4112(class50 arg0);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method1338();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method1368(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method4113(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method4114(class735 arg0, class735 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method1352();

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method1327(int arg0);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method414(boolean arg0);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method1342();

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method1356(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method1344();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method4116(class50 arg0, class305 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method1343(int arg0);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method1341();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method1349(int arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method1320(int arg0, int arg1, class402 arg2, class402 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method1363(int arg0);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method1373(int arg0);

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method1359();

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class108 method1334(class108 arg0);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method1353();

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method1333();

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(JIZ)V")
    private final native void method4117(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method1361();

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method1339();

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method1377(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method1321();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method1347();

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method1348(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method1345();

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method1355();
}
