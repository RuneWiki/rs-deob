import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class163 extends class761 implements class65 {

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Loa;")
    private class473 field2113;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "Lya;")
    private class770 field2115;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "[Lkw;")
    public class510[] field2112;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "[Liia;")
    public class264[] field2114;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method395();

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class412 method406(class412 arg0);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method394(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method414();

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method432();

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class579.method4297(this, 126);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqa;Lwha;II)V")
    public final void method427(class104 arg0, class535 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2113.method3641().method4992(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class473.field6935[5] = 0;
            this.field2113.method3641().method4992(this, arg0, class473.field6935, arg2, arg3);
            arg1.field7766 = class473.field6935[0];
            arg1.field7764 = class473.field6935[1];
            arg1.field7767 = class473.field6935[2];
            arg1.field7768 = class473.field6935[3];
            arg1.field7765 = class473.field6935[4];
            arg1.field7769 = class473.field6935[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method433();

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method399();

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method423();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method417();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method393();

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()[B")
    public final byte[] method407() {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "()[Lkw;")
    public final class510[] method426() {
        return this.field2112;
    }

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method690(boolean arg0);

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method436(int arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method392(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method422();

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method439(int arg0);

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
    public final void method429() {
        if (this.field2113.field6945 > 1) {
            synchronized (this) {
                super.field10859 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method437(int arg0);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method384();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method396();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class761 method418(byte arg0, int arg1, boolean arg2) {
        return this.field2113.method3641().method4995(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method377();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method1389(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILqa;ZII)Z")
    public final boolean method440(int arg0, int arg1, class104 arg2, boolean arg3, int arg4, int arg5) {
        return this.field2113.method3641().method4999(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
    public final void method401() {
        if (this.field2113.field6945 > 1) {
            synchronized (this) {
                while (super.field10859) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field10859 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILqa;)V")
    private final void method1390(int[] arg0, class104 arg1) {
        this.field2113.method3641().method5000(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method388(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method390(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILqa;ZI)Z")
    public final boolean method382(int arg0, int arg1, class104 arg2, boolean arg3, int arg4) {
        return this.field2113.method3641().method4990(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method430(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method412(int arg0, int arg1, class751 arg2, class751 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method1391(class163 arg0, class163 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method1392(class473 arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
    public final void method403() {
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
    public final boolean method431() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method410();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method419(int arg0);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1393(class473 arg0, class770 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method385();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method386(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method383(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1389(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqa;)V")
    public final void method402(class104 arg0) {
        this.method1390(class473.field6928, arg0);
        int var2 = 0;
        if (this.field2112 != null) {
            for (int var3 = 0; var3 < this.field2112.length; ++var3) {
                class510 var4 = this.field2112[var3];
                var4.field7477 = class473.field6928[var2++];
                var4.field7481 = class473.field6928[var2++];
                var4.field7479 = class473.field6928[var2++];
                var4.field7489 = class473.field6928[var2++];
                var4.field7493 = class473.field6928[var2++];
                var4.field7494 = class473.field6928[var2++];
                var4.field7492 = class473.field6928[var2++];
                var4.field7478 = class473.field6928[var2++];
                var4.field7480 = class473.field6928[var2++];
            }
        }
        if (this.field2114 != null) {
            for (int var5 = 0; var5 < this.field2114.length; ++var5) {
                class264 var6 = this.field2114[var5];
                class264 var7 = var6;
                if (var6.field3728 != null) {
                    var7 = var6.field3728;
                }
                if (var6.field3726 != null) {
                    var6.field3726.method733(arg0);
                } else {
                    var6.field3726 = arg0.method737();
                }
                var7.field3734 = class473.field6928[var2++];
                var7.field3733 = class473.field6928[var2++];
                var7.field3727 = class473.field6928[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method376(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method411(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B[B)V")
    public final void method404(byte arg0, byte[] arg1) {
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method398(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqa;Lwha;I)V")
    public final void method415(class104 arg0, class535 arg1, int arg2) {
        if (arg1 == null) {
            this.field2113.method3641().method5002(this, arg0, (int[]) null, arg2);
        } else {
            class473.field6935[5] = 0;
            this.field2113.method3641().method5002(this, arg0, class473.field6935, arg2);
            arg1.field7766 = class473.field6935[0];
            arg1.field7764 = class473.field6935[1];
            arg1.field7767 = class473.field6935[2];
            arg1.field7768 = class473.field6935[3];
            arg1.field7765 = class473.field6935[4];
            arg1.field7769 = class473.field6935[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
    private final native void method1394(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqa;IZ)V")
    public final void method389(class104 arg0, int arg1, boolean arg2) {
        this.method1394(((class729) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method424();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method409(int arg0);

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lrha;IIII)V")
    public class163(class473 arg0, class770 arg1, class60 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2113 = arg0;
        this.field2115 = arg1;
        this.field2112 = arg2.field915;
        this.field2114 = arg2.field869;
        int var8 = arg2.field915 == null ? 0 : arg2.field915.length;
        int var9 = arg2.field869 == null ? 0 : arg2.field869.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field2112[var12].field7488;
            var11[var10++] = this.field2112[var12].field7482;
            var11[var10++] = this.field2112[var12].field7490;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field2114[var13].field3730;
        }
        int var14 = arg2.field883 == null ? 0 : arg2.field883.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class533 var20 = arg2.field883[var17];
            class9 var21 = class706.method5062(123, var20.field7713);
            var15[var16++] = var20.field7718;
            var15[var16++] = var21.field111;
            var15[var16++] = var21.field114;
            var15[var16++] = var21.field109;
            var15[var16++] = var21.field113;
            var15[var16++] = var21.field116;
            var15[var16++] = var21.field112 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class533 var19 = arg2.field883[var18];
            var15[var16++] = var19.field7714;
        }
        this.method1393(this.field2113, this.field2115, arg2.field874, arg2.field880, arg2.field905, arg2.field921, arg2.field918, arg2.field904, arg2.field886, arg2.field903, arg2.field914, arg2.field889, arg2.field900, arg2.field870, arg2.field884, arg2.field906, arg2.field898, arg2.field919, arg2.field924, arg2.field910, arg2.field897, arg2.field894, arg2.field920, arg2.field922, arg2.field891, arg2.field899, arg2.field909, arg2.field907, arg2.field912, arg2.field877, arg2.field917, arg2.field893, arg2.field875, arg2.field888, arg2.field923, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method391(class761 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2113.method3641().method4984(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class163(class473 arg0) {
        this.field2113 = arg0;
        this.field2115 = null;
        this.method1392(arg0);
    }

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method379();

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()[Liia;")
    public final class264[] method413() {
        return this.field2114;
    }
}
