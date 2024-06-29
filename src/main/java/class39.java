import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class39 extends class469 implements class529 {

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Loa;")
    private class691 field584;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lya;")
    private class51 field587;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "[Lgi;")
    public class675[] field585;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "[Luga;")
    public class206[] field586;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method310(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method311(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method358(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method312();

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
    public final void method313() {
        if (this.field584.field9736 > 1) {
            synchronized (this) {
                super.field6756 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
    private final native void method314(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method315(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method316(class691 arg0);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method317(class39 arg0, class39 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILkd;ZII)Z")
    public final boolean method318(int arg0, int arg1, class280 arg2, boolean arg3, int arg4, int arg5) {
        return this.field584.method3887().method3542(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method319(int arg0);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method320();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method321(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lkd;IZ)V")
    public final void method322(class280 arg0, int arg1, boolean arg2) {
        this.method314(((class276) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method323(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method324();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class469 method325(byte arg0, int arg1, boolean arg2) {
        return this.field584.method3887().method3543(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
    public final void method326() {
    }

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method327();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method328();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lkd;Lig;I)V")
    public final void method329(class280 arg0, class243 arg1, int arg2) {
        if (arg1 == null) {
            this.field584.method3887().method3566(this, arg0, (int[]) null, arg2);
        } else {
            class691.field9718[5] = 0;
            this.field584.method3887().method3566(this, arg0, class691.field9718, arg2);
            arg1.field3400 = class691.field9718[0];
            arg1.field3398 = class691.field9718[1];
            arg1.field3401 = class691.field9718[2];
            arg1.field3399 = class691.field9718[3];
            arg1.field3402 = class691.field9718[4];
            arg1.field3397 = class691.field9718[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method330(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method331(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method332();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method333(int arg0);

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lgi;")
    public final class675[] method334() {
        return this.field585;
    }

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method335();

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()[Luga;")
    public final class206[] method336() {
        return this.field586;
    }

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method337(int arg0);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method338();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILkd;)V")
    private final void method339(int[] arg0, class280 arg1) {
        this.field584.method3887().method3565(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class181 method340(class181 arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()Z")
    public final boolean method341() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
    public final void method342() {
        if (this.field584.field9736 > 1) {
            synchronized (this) {
                while (super.field6756) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6756 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lkd;Lig;II)V")
    public final void method343(class280 arg0, class243 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field584.method3887().method3570(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class691.field9718[5] = 0;
            this.field584.method3887().method3570(this, arg0, class691.field9718, arg2, arg3);
            arg1.field3400 = class691.field9718[0];
            arg1.field3398 = class691.field9718[1];
            arg1.field3401 = class691.field9718[2];
            arg1.field3399 = class691.field9718[3];
            arg1.field3402 = class691.field9718[4];
            arg1.field3397 = class691.field9718[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method344(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method345(class469 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field584.method3887().method3556(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method346(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method347(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILkd;ZI)Z")
    public final boolean method348(int arg0, int arg1, class280 arg2, boolean arg3, int arg4) {
        return this.field584.method3887().method3552(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method349(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method350();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method351();

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method352();

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method353();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lkd;)V")
    public final void method354(class280 arg0) {
        this.method339(class691.field9727, arg0);
        int var2 = 0;
        if (this.field585 != null) {
            for (int var3 = 0; var3 < this.field585.length; ++var3) {
                class675 var4 = this.field585[var3];
                var4.field9484 = class691.field9727[var2++];
                var4.field9488 = class691.field9727[var2++];
                var4.field9483 = class691.field9727[var2++];
                var4.field9473 = class691.field9727[var2++];
                var4.field9490 = class691.field9727[var2++];
                var4.field9489 = class691.field9727[var2++];
                var4.field9494 = class691.field9727[var2++];
                var4.field9479 = class691.field9727[var2++];
                var4.field9481 = class691.field9727[var2++];
            }
        }
        if (this.field586 != null) {
            for (int var5 = 0; var5 < this.field586.length; ++var5) {
                class206 var6 = this.field586[var5];
                class206 var7 = var6;
                if (var6.field2953 != null) {
                    var7 = var6.field2953;
                }
                if (var6.field2959 != null) {
                    var6.field2959.method160(arg0);
                } else {
                    var6.field2959 = arg0.method174();
                }
                var7.field2952 = class691.field9727[var2++];
                var7.field2949 = class691.field9727[var2++];
                var7.field2948 = class691.field9727[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method355(class691 arg0, class51 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method356();

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class727.method4045(this, 13483);
        }
    }

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method357();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method358(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method359(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method360(int arg0);

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lww;IIII)V")
    public class39(class691 arg0, class51 arg1, class729 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field584 = arg0;
        this.field587 = arg1;
        this.field585 = arg2.field10185;
        this.field586 = arg2.field10177;
        int var8 = arg2.field10185 == null ? 0 : arg2.field10185.length;
        int var9 = arg2.field10177 == null ? 0 : arg2.field10177.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field585[var12].field9472;
            var11[var10++] = this.field585[var12].field9482;
            var11[var10++] = this.field585[var12].field9495;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field586[var13].field2955;
        }
        int var14 = arg2.field10192 == null ? 0 : arg2.field10192.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class640 var20 = arg2.field10192[var17];
            class205 var21 = class687.method3864(-9562, var20.field9110);
            var15[var16++] = var20.field9111;
            var15[var16++] = var21.field2937;
            var15[var16++] = var21.field2932;
            var15[var16++] = var21.field2939;
            var15[var16++] = var21.field2943;
            var15[var16++] = var21.field2940;
            var15[var16++] = var21.field2934 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class640 var19 = arg2.field10192[var18];
            var15[var16++] = var19.field9109;
        }
        this.method355(this.field584, this.field587, arg2.field10210, arg2.field10180, arg2.field10173, arg2.field10221, arg2.field10220, arg2.field10222, arg2.field10214, arg2.field10172, arg2.field10208, arg2.field10170, arg2.field10218, arg2.field10197, arg2.field10203, arg2.field10198, arg2.field10216, arg2.field10181, arg2.field10171, arg2.field10223, arg2.field10174, arg2.field10183, arg2.field10189, arg2.field10219, arg2.field10215, arg2.field10206, arg2.field10199, arg2.field10205, arg2.field10209, arg2.field10195, arg2.field10184, arg2.field10186, arg2.field10207, arg2.field10187, arg2.field10204, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method361();

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method362();

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class39(class691 arg0) {
        this.field584 = arg0;
        this.field587 = null;
        this.method316(arg0);
    }

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method107(boolean arg0);
}
