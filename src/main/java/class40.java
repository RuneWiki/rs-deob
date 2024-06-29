import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class40 extends class472 implements class533 {

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Loa;")
    private class694 field410;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lya;")
    private class53 field409;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[Lfk;")
    public class653[] field411;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[Lcia;")
    public class614[] field412;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method194(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method195(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILhba;ZII)Z")
    public final boolean method196(int arg0, int arg1, class10 arg2, boolean arg3, int arg4, int arg5) {
        return this.field410.method3918().method3504(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method197(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILhba;)V")
    private final void method198(int[] arg0, class10 arg1) {
        this.field410.method3918().method3494(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method199(class40 arg0, class40 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method200(class694 arg0);

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lcia;")
    public final class614[] method201() {
        return this.field412;
    }

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method202(int arg0);

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method203();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method204();

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method205();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILhba;ZI)Z")
    public final boolean method206(int arg0, int arg1, class10 arg2, boolean arg3, int arg4) {
        return this.field410.method3918().method3507(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method207(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhba;IZ)V")
    public final void method208(class10 arg0, int arg1, boolean arg2) {
        this.method210(((class279) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method209();

    @OriginalMember(owner = "client!i", name = "A", descriptor = "(JIZ)V")
    private final native void method210(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method211(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method212();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method213();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method214(int arg0, int arg1, class281 arg2, class281 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class184 method215(class184 arg0);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method216(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhba;)V")
    public final void method217(class10 arg0) {
        this.method198(class694.field9693, arg0);
        int var2 = 0;
        if (this.field411 != null) {
            for (int var3 = 0; var3 < this.field411.length; ++var3) {
                class653 var4 = this.field411[var3];
                var4.field9098 = class694.field9693[var2++];
                var4.field9095 = class694.field9693[var2++];
                var4.field9099 = class694.field9693[var2++];
                var4.field9089 = class694.field9693[var2++];
                var4.field9090 = class694.field9693[var2++];
                var4.field9080 = class694.field9693[var2++];
                var4.field9084 = class694.field9693[var2++];
                var4.field9097 = class694.field9693[var2++];
                var4.field9088 = class694.field9693[var2++];
            }
        }
        if (this.field412 != null) {
            for (int var5 = 0; var5 < this.field412.length; ++var5) {
                class614 var6 = this.field412[var5];
                class614 var7 = var6;
                if (var6.field8599 != null) {
                    var7 = var6.field8599;
                }
                if (var6.field8608 != null) {
                    var6.field8608.method25(arg0);
                } else {
                    var6.field8608 = arg0.method35();
                }
                var7.field8604 = class694.field9693[var2++];
                var7.field8601 = class694.field9693[var2++];
                var7.field8612 = class694.field9693[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method73(boolean arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lfk;")
    public final class653[] method218() {
        return this.field411;
    }

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method219();

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method220();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method221();

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method222(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
    public final void method223() {
        if (this.field410.field9703 > 1) {
            synchronized (this) {
                while (super.field6538) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6538 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method224();

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method225();

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()Z")
    public final boolean method226() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class280.method1680(false, this);
        }
    }

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method227(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method228();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method229(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhba;Llda;I)V")
    public final void method230(class10 arg0, class486 arg1, int arg2) {
        if (arg1 == null) {
            this.field410.method3918().method3506(this, arg0, (int[]) null, arg2);
        } else {
            class694.field9700[5] = 0;
            this.field410.method3918().method3506(this, arg0, class694.field9700, arg2);
            arg1.field6673 = class694.field9700[0];
            arg1.field6675 = class694.field9700[1];
            arg1.field6672 = class694.field9700[2];
            arg1.field6674 = class694.field9700[3];
            arg1.field6671 = class694.field9700[4];
            arg1.field6676 = class694.field9700[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method231(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method232(class472 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field410.method3918().method3487(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method233(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method234();

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method235(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method236(int arg0);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method237(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method238();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method239(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method194(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
    public final void method240() {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class472 method241(byte arg0, int arg1, boolean arg2) {
        return this.field410.method3918().method3481(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
    public final void method242() {
        if (this.field410.field9703 > 1) {
            synchronized (this) {
                super.field6538 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhba;Llda;II)V")
    public final void method243(class10 arg0, class486 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field410.method3918().method3500(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class694.field9700[5] = 0;
            this.field410.method3918().method3500(this, arg0, class694.field9700, arg2, arg3);
            arg1.field6673 = class694.field9700[0];
            arg1.field6675 = class694.field9700[1];
            arg1.field6672 = class694.field9700[2];
            arg1.field6674 = class694.field9700[3];
            arg1.field6671 = class694.field9700[4];
            arg1.field6676 = class694.field9700[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method244(class694 arg0, class53 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method245();

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Llv;IIII)V")
    public class40(class694 arg0, class53 arg1, class446 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field410 = arg0;
        this.field409 = arg1;
        this.field411 = arg2.field6224;
        this.field412 = arg2.field6204;
        int var8 = arg2.field6224 == null ? 0 : arg2.field6224.length;
        int var9 = arg2.field6204 == null ? 0 : arg2.field6204.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field411[var12].field9093;
            var11[var10++] = this.field411[var12].field9087;
            var11[var10++] = this.field411[var12].field9102;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field412[var13].field8598;
        }
        int var14 = arg2.field6234 == null ? 0 : arg2.field6234.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class701 var20 = arg2.field6234[var17];
            class713 var21 = class364.method2083(var20.field9845, (byte) -119);
            var15[var16++] = var20.field9846;
            var15[var16++] = var21.field9947;
            var15[var16++] = var21.field9953;
            var15[var16++] = var21.field9945;
            var15[var16++] = var21.field9959;
            var15[var16++] = var21.field9952;
            var15[var16++] = var21.field9950 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class701 var19 = arg2.field6234[var18];
            var15[var16++] = var19.field9849;
        }
        this.method244(this.field410, this.field409, arg2.field6216, arg2.field6213, arg2.field6229, arg2.field6206, arg2.field6233, arg2.field6232, arg2.field6217, arg2.field6195, arg2.field6198, arg2.field6221, arg2.field6196, arg2.field6225, arg2.field6208, arg2.field6222, arg2.field6235, arg2.field6228, arg2.field6218, arg2.field6200, arg2.field6238, arg2.field6199, arg2.field6201, arg2.field6190, arg2.field6210, arg2.field6237, arg2.field6187, arg2.field6193, arg2.field6211, arg2.field6194, arg2.field6240, arg2.field6205, arg2.field6223, arg2.field6202, arg2.field6188, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method246();

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class40(class694 arg0) {
        this.field410 = arg0;
        this.field409 = null;
        this.method200(arg0);
    }
}
