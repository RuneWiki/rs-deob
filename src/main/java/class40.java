import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class40 extends class474 implements class535 {

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Loa;")
    private class696 field612;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lya;")
    private class53 field610;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[Lqi;")
    public class569[] field609;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "[Lhv;")
    public class521[] field611;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 3)
    public final void method241(class474 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field612.method3901().method3483(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 6)
    public final void method243() {
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 15)
    public final void method247() {
        if (this.field612.field9698 > 1) {
            synchronized (this) {
                super.field6381 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()Z", line = 26)
    public final boolean method249() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpda;Lwt;I)V", line = 29)
    public final void method250(class631 arg0, class314 arg1, int arg2) {
        if (arg1 == null) {
            this.field612.method3901().method3485(this, arg0, (int[]) null, arg2);
        } else {
            class696.field9682[5] = 0;
            this.field612.method3901().method3485(this, arg0, class696.field9682, arg2);
            arg1.field4102 = class696.field9682[0];
            arg1.field4098 = class696.field9682[1];
            arg1.field4101 = class696.field9682[2];
            arg1.field4100 = class696.field9682[3];
            arg1.field4103 = class696.field9682[4];
            arg1.field4099 = class696.field9682[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()[Lhv;", line = 50)
    public final class521[] method253() {
        return this.field611;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpda;IZ)V", line = 54)
    public final void method254(class631 arg0, int arg1, boolean arg2) {
        this.method256(((class280) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpda;Lwt;II)V", line = 57)
    public final void method255(class631 arg0, class314 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field612.method3901().method3490(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class696.field9682[5] = 0;
            this.field612.method3901().method3490(this, arg0, class696.field9682, arg2, arg3);
            arg1.field4102 = class696.field9682[0];
            arg1.field4098 = class696.field9682[1];
            arg1.field4101 = class696.field9682[2];
            arg1.field4100 = class696.field9682[3];
            arg1.field4103 = class696.field9682[4];
            arg1.field4099 = class696.field9682[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILpda;ZI)Z", line = 76)
    public final boolean method258(int arg0, int arg1, class631 arg2, boolean arg3, int arg4) {
        return this.field612.method3901().method3466(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 79)
    public final void method260(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 85)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class166.method1167(this, -1);
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lqi;", line = 94)
    public final class569[] method268() {
        return this.field609;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lpda;)V", line = 99)
    public final void method271(class631 arg0) {
        this.method291(class696.field9683, arg0);
        int var2 = 0;
        if (this.field609 != null) {
            for (int var3 = 0; var3 < this.field609.length; ++var3) {
                class569 var4 = this.field609[var3];
                var4.field8014 = class696.field9683[var2++];
                var4.field8013 = class696.field9683[var2++];
                var4.field8012 = class696.field9683[var2++];
                var4.field8020 = class696.field9683[var2++];
                var4.field8015 = class696.field9683[var2++];
                var4.field8003 = class696.field9683[var2++];
                var4.field8018 = class696.field9683[var2++];
                var4.field8019 = class696.field9683[var2++];
                var4.field8007 = class696.field9683[var2++];
            }
        }
        if (this.field611 != null) {
            for (int var5 = 0; var5 < this.field611.length; ++var5) {
                class521 var6 = this.field611[var5];
                class521 var7 = var6;
                if (var6.field7310 != null) {
                    var7 = var6.field7310;
                }
                if (var6.field7300 != null) {
                    var6.field7300.method604(arg0);
                } else {
                    var6.field7300 = arg0.method611();
                }
                var7.field7305 = class696.field9683[var2++];
                var7.field7306 = class696.field9683[var2++];
                var7.field7299 = class696.field9683[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 156)
    public final class474 method273(byte arg0, int arg1, boolean arg2) {
        return this.field612.method3901().method3481(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILpda;ZII)Z", line = 161)
    public final boolean method275(int arg0, int arg1, class631 arg2, boolean arg3, int arg4, int arg5) {
        return this.field612.method3901().method3461(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 173)
    public final void method282() {
        if (this.field612.field9698 > 1) {
            synchronized (this) {
                while (super.field6381) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6381 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILpda;)V", line = 198)
    private final void method291(int[] arg0, class631 arg1) {
        this.field612.method3901().method3462(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Llga;IIII)V", line = 200)
    public class40(class696 arg0, class53 arg1, class714 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field612 = arg0;
        this.field610 = arg1;
        this.field609 = arg2.field9941;
        this.field611 = arg2.field9943;
        int var8 = arg2.field9941 == null ? 0 : arg2.field9941.length;
        int var9 = arg2.field9943 == null ? 0 : arg2.field9943.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field609[var12].field8009;
            var11[var10++] = this.field609[var12].field8017;
            var11[var10++] = this.field609[var12].field8006;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field611[var13].field7303;
        }
        int var14 = arg2.field9913 == null ? 0 : arg2.field9913.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class104 var20 = arg2.field9913[var17];
            class25 var21 = class124.method942(10698, var20.field1430);
            var15[var16++] = var20.field1428;
            var15[var16++] = var21.field460;
            var15[var16++] = var21.field465;
            var15[var16++] = var21.field454;
            var15[var16++] = var21.field452;
            var15[var16++] = var21.field455;
            var15[var16++] = var21.field457 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class104 var19 = arg2.field9913[var18];
            var15[var16++] = var19.field1425;
        }
        this.method283(this.field612, this.field610, arg2.field9948, arg2.field9935, arg2.field9923, arg2.field9950, arg2.field9917, arg2.field9918, arg2.field9922, arg2.field9925, arg2.field9919, arg2.field9945, arg2.field9932, arg2.field9911, arg2.field9937, arg2.field9955, arg2.field9951, arg2.field9939, arg2.field9909, arg2.field9958, arg2.field9930, arg2.field9934, arg2.field9929, arg2.field9936, arg2.field9947, arg2.field9915, arg2.field9938, arg2.field9949, arg2.field9959, arg2.field9926, arg2.field9920, arg2.field9928, arg2.field9942, arg2.field9956, arg2.field9933, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 272)
    public final void method292(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method264(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 274)
    public class40(class696 arg0) {
        this.field612 = arg0;
        this.field610 = null;
        this.method274(arg0);
    }

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method242();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method244();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method245();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method246(int arg0);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method248();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method251(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method252();

    @OriginalMember(owner = "client!i", name = "D", descriptor = "(JIZ)V")
    private final native void method256(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method257(int arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method259(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method261(class40 arg0, class40 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method262(int arg0);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method263();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method264(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method265(int arg0);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method266(int arg0);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method267(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method269();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method270(int arg0);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method123(boolean arg0);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method272();

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method274(class696 arg0);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method276(int arg0);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method277(int arg0, int arg1, class282 arg2, class282 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method278();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method279();

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method280();

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method281(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method283(class696 arg0, class53 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method284();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method285();

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method286();

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method287();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method288();

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class185 method289(class185 arg0);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method290(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method293(short arg0, short arg1);
}
