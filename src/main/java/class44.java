import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class44 extends class498 implements class559 {

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Loa;")
    private class724 field599;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lya;")
    private class59 field597;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[Lmk;")
    public class62[] field598;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[Lir;")
    public class28[] field596;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnh;Lgca;I)V", line = 8)
    public final void method355(class778 arg0, class265 arg1, int arg2) {
        if (arg1 == null) {
            this.field599.method4103().method3624(this, arg0, (int[]) null, arg2);
        } else {
            class724.field10162[5] = 0;
            this.field599.method4103().method3624(this, arg0, class724.field10162, arg2);
            arg1.field3136 = class724.field10162[0];
            arg1.field3133 = class724.field10162[1];
            arg1.field3135 = class724.field10162[2];
            arg1.field3138 = class724.field10162[3];
            arg1.field3134 = class724.field10162[4];
            arg1.field3137 = class724.field10162[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 29)
    public final void method359() {
        if (this.field599.field10164 > 1) {
            synchronized (this) {
                super.field6962 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILnh;ZI)Z", line = 42)
    public final boolean method363(int arg0, int arg1, class778 arg2, boolean arg3, int arg4) {
        return this.field599.method4103().method3625(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 45)
    public final class498 method364(byte arg0, int arg1, boolean arg2) {
        return this.field599.method4103().method3617(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILnh;)V", line = 49)
    private final void method366(int[] arg0, class778 arg1) {
        this.field599.method4103().method3636(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lir;", line = 55)
    public final class28[] method370() {
        return this.field596;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lmk;", line = 58)
    public final class62[] method371() {
        return this.field598;
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 62)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class405.method2430((byte) -104, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILnh;ZII)Z", line = 76)
    public final boolean method379(int arg0, int arg1, class778 arg2, boolean arg3, int arg4, int arg5) {
        return this.field599.method4103().method3637(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 80)
    public final void method382(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 84)
    public final void method384(class498 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field599.method4103().method3620(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()Z", line = 87)
    public final boolean method385() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnh;Lgca;II)V", line = 92)
    public final void method388(class778 arg0, class265 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field599.method4103().method3608(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class724.field10162[5] = 0;
            this.field599.method4103().method3608(this, arg0, class724.field10162, arg2, arg3);
            arg1.field3136 = class724.field10162[0];
            arg1.field3133 = class724.field10162[1];
            arg1.field3135 = class724.field10162[2];
            arg1.field3138 = class724.field10162[3];
            arg1.field3134 = class724.field10162[4];
            arg1.field3137 = class724.field10162[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnh;)V", line = 108)
    public final void method389(class778 arg0) {
        this.method366(class724.field10156, arg0);
        int var2 = 0;
        if (this.field598 != null) {
            for (int var3 = 0; var3 < this.field598.length; ++var3) {
                class62 var4 = this.field598[var3];
                var4.field834 = class724.field10156[var2++];
                var4.field849 = class724.field10156[var2++];
                var4.field840 = class724.field10156[var2++];
                var4.field833 = class724.field10156[var2++];
                var4.field835 = class724.field10156[var2++];
                var4.field827 = class724.field10156[var2++];
                var4.field828 = class724.field10156[var2++];
                var4.field832 = class724.field10156[var2++];
                var4.field848 = class724.field10156[var2++];
            }
        }
        if (this.field596 != null) {
            for (int var5 = 0; var5 < this.field596.length; ++var5) {
                class28 var6 = this.field596[var5];
                class28 var7 = var6;
                if (var6.field431 != null) {
                    var7 = var6.field431;
                }
                if (var6.field427 != null) {
                    var6.field427.method141(arg0);
                } else {
                    var6.field427 = arg0.method136();
                }
                var7.field432 = class724.field10156[var2++];
                var7.field435 = class724.field10156[var2++];
                var7.field425 = class724.field10156[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lnh;IZ)V", line = 163)
    public final void method390(class778 arg0, int arg1, boolean arg2) {
        this.method376(((class294) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 168)
    public final void method392() {
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 176)
    public final void method397() {
        if (this.field599.field10164 > 1) {
            synchronized (this) {
                while (super.field6962) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6962 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 196)
    public final void method401(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method368(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lso;IIII)V", line = 204)
    public class44(class724 arg0, class59 arg1, class496 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field599 = arg0;
        this.field597 = arg1;
        this.field598 = arg2.field6904;
        this.field596 = arg2.field6910;
        int var8 = arg2.field6904 == null ? 0 : arg2.field6904.length;
        int var9 = arg2.field6910 == null ? 0 : arg2.field6910.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field598[var12].field844;
            var11[var10++] = this.field598[var12].field843;
            var11[var10++] = this.field598[var12].field839;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field596[var13].field424;
        }
        int var14 = arg2.field6938 == null ? 0 : arg2.field6938.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class33 var20 = arg2.field6938[var17];
            class73 var21 = class65.method547(false, var20.field521);
            var15[var16++] = var20.field511;
            var15[var16++] = var21.field999;
            var15[var16++] = var21.field1007;
            var15[var16++] = var21.field1004;
            var15[var16++] = var21.field1002;
            var15[var16++] = var21.field1006;
            var15[var16++] = var21.field1000 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class33 var19 = arg2.field6938[var18];
            var15[var16++] = var19.field520;
        }
        this.method403(this.field599, this.field597, arg2.field6928, arg2.field6908, arg2.field6926, arg2.field6913, arg2.field6894, arg2.field6906, arg2.field6905, arg2.field6897, arg2.field6900, arg2.field6936, arg2.field6921, arg2.field6939, arg2.field6941, arg2.field6903, arg2.field6915, arg2.field6918, arg2.field6912, arg2.field6891, arg2.field6890, arg2.field6907, arg2.field6911, arg2.field6898, arg2.field6932, arg2.field6937, arg2.field6895, arg2.field6945, arg2.field6922, arg2.field6925, arg2.field6929, arg2.field6943, arg2.field6899, arg2.field6935, arg2.field6909, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 275)
    public class44(class724 arg0) {
        this.field599 = arg0;
        this.field597 = null;
        this.method358(arg0);
    }

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method352();

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method353(int arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method354(int arg0, int arg1, class296 arg2, class296 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method356();

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method357(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method358(class724 arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method360(int arg0);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method361();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method362(int arg0);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class196 method365(class196 arg0);

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method367();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method368(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method369();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method372();

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method373(int arg0);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method374();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method375(int arg0);

    @OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
    private final native void method376(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method377(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method378(int arg0);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method380();

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method381();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method383();

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method386(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method387(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method391();

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method393();

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method394();

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method395(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method396();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method398(int arg0);

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method399(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method400();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method402(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method403(class724 arg0, class59 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method229(boolean arg0);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method404();
}
