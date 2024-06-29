import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class40 extends class472 implements class532 {

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Loa;")
    private class694 field962;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lya;")
    private class52 field965;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[Lnn;")
    public class417[] field964;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[Leca;")
    public class755[] field963;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method481(int arg0);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method482(int arg0);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method129(boolean arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method483(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method484(int arg0);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method485(int arg0);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method486();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method487();

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method488();

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method489(class40 arg0, class40 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method490(class472 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field962.method3882().method3507(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method491(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILbca;ZII)Z")
    public final boolean method492(int arg0, int arg1, class661 arg2, boolean arg3, int arg4, int arg5) {
        return this.field962.method3882().method3506(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method493();

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lnn;")
    public final class417[] method494() {
        return this.field964;
    }

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method495();

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method496(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lbca;Liw;II)V")
    public final void method497(class661 arg0, class317 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field962.method3882().method3516(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class694.field9387[5] = 0;
            this.field962.method3882().method3516(this, arg0, class694.field9387, arg2, arg3);
            arg1.field4383 = class694.field9387[0];
            arg1.field4380 = class694.field9387[1];
            arg1.field4384 = class694.field9387[2];
            arg1.field4382 = class694.field9387[3];
            arg1.field4381 = class694.field9387[4];
            arg1.field4379 = class694.field9387[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method498();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method499(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()Z")
    public final boolean method500() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
    public final void method501() {
        if (this.field962.field9396 > 1) {
            synchronized (this) {
                super.field6603 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method502(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILbca;ZI)Z")
    public final boolean method503(int arg0, int arg1, class661 arg2, boolean arg3, int arg4) {
        return this.field962.method3882().method3513(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class472 method504(byte arg0, int arg1, boolean arg2) {
        return this.field962.method3882().method3523(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method505();

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method506();

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
    public final void method507() {
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method508(int arg0, int arg1, class281 arg2, class281 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method509();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method510();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method511(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method499(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method512();

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method513();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method514(class694 arg0, class52 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method515(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method517(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class305.method1997(0, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method518();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lbca;IZ)V")
    public final void method519(class661 arg0, int arg1, boolean arg2) {
        this.method529(((class279) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
    public final void method520() {
        if (this.field962.field9396 > 1) {
            synchronized (this) {
                while (super.field6603) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6603 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lbca;Liw;I)V")
    public final void method521(class661 arg0, class317 arg1, int arg2) {
        if (arg1 == null) {
            this.field962.method3882().method3511(this, arg0, (int[]) null, arg2);
        } else {
            class694.field9387[5] = 0;
            this.field962.method3882().method3511(this, arg0, class694.field9387, arg2);
            arg1.field4383 = class694.field9387[0];
            arg1.field4380 = class694.field9387[1];
            arg1.field4384 = class694.field9387[2];
            arg1.field4382 = class694.field9387[3];
            arg1.field4381 = class694.field9387[4];
            arg1.field4379 = class694.field9387[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method522();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lbca;)V")
    public final void method523(class661 arg0) {
        this.method526(class694.field9395, arg0);
        int var2 = 0;
        if (this.field964 != null) {
            for (int var3 = 0; var3 < this.field964.length; ++var3) {
                class417 var4 = this.field964[var3];
                var4.field6039 = class694.field9395[var2++];
                var4.field6048 = class694.field9395[var2++];
                var4.field6046 = class694.field9395[var2++];
                var4.field6040 = class694.field9395[var2++];
                var4.field6047 = class694.field9395[var2++];
                var4.field6037 = class694.field9395[var2++];
                var4.field6033 = class694.field9395[var2++];
                var4.field6031 = class694.field9395[var2++];
                var4.field6041 = class694.field9395[var2++];
            }
        }
        if (this.field963 != null) {
            for (int var5 = 0; var5 < this.field963.length; ++var5) {
                class755 var6 = this.field963[var5];
                class755 var7 = var6;
                if (var6.field10545 != null) {
                    var7 = var6.field10545;
                }
                if (var6.field10549 != null) {
                    var6.field10549.method778(arg0);
                } else {
                    var6.field10549 = arg0.method763();
                }
                var7.field10535 = class694.field9395[var2++];
                var7.field10536 = class694.field9395[var2++];
                var7.field10537 = class694.field9395[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method524(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Leca;")
    public final class755[] method525() {
        return this.field963;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILbca;)V")
    private final void method526(int[] arg0, class661 arg1) {
        this.field962.method3882().method3522(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method527();

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method528(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lbh;IIII)V")
    public class40(class694 arg0, class52 arg1, class37 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field962 = arg0;
        this.field965 = arg1;
        this.field964 = arg2.field913;
        this.field963 = arg2.field933;
        int var8 = arg2.field913 == null ? 0 : arg2.field913.length;
        int var9 = arg2.field933 == null ? 0 : arg2.field933.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field964[var12].field6038;
            var11[var10++] = this.field964[var12].field6034;
            var11[var10++] = this.field964[var12].field6049;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field963[var13].field10541;
        }
        int var14 = arg2.field899 == null ? 0 : arg2.field899.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class259 var20 = arg2.field899[var17];
            class510 var21 = class192.method1376(104, var20.field3717);
            var15[var16++] = var20.field3719;
            var15[var16++] = var21.field7096;
            var15[var16++] = var21.field7100;
            var15[var16++] = var21.field7095;
            var15[var16++] = var21.field7103;
            var15[var16++] = var21.field7104;
            var15[var16++] = var21.field7101 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class259 var19 = arg2.field899[var18];
            var15[var16++] = var19.field3720;
        }
        this.method514(this.field962, this.field965, arg2.field903, arg2.field888, arg2.field908, arg2.field914, arg2.field919, arg2.field935, arg2.field909, arg2.field884, arg2.field930, arg2.field902, arg2.field922, arg2.field910, arg2.field906, arg2.field901, arg2.field887, arg2.field929, arg2.field889, arg2.field891, arg2.field918, arg2.field923, arg2.field885, arg2.field890, arg2.field896, arg2.field916, arg2.field892, arg2.field926, arg2.field883, arg2.field911, arg2.field900, arg2.field920, arg2.field934, arg2.field924, arg2.field932, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
    private final native void method529(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class184 method530(class184 arg0);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method531(class694 arg0);

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class40(class694 arg0) {
        this.field962 = arg0;
        this.field965 = null;
        this.method531(arg0);
    }

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method532();

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method533(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);
}
