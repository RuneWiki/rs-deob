import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class40 extends class473 implements class534 {

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Loa;")
    private class696 field440;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lya;")
    private class53 field443;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[Lwr;")
    public class459[] field442;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[Lol;")
    public class285[] field441;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lql;Leda;II)V", line = 3)
    public final void method235(class738 arg0, class102 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field440.method3946().method3577(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class696.field9595[5] = 0;
            this.field440.method3946().method3577(this, arg0, class696.field9595, arg2, arg3);
            arg1.field1432 = class696.field9595[0];
            arg1.field1431 = class696.field9595[1];
            arg1.field1433 = class696.field9595[2];
            arg1.field1434 = class696.field9595[3];
            arg1.field1429 = class696.field9595[4];
            arg1.field1430 = class696.field9595[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILql;)V", line = 20)
    private final void method237(int[] arg0, class738 arg1) {
        this.field440.method3946().method3572(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lql;)V", line = 32)
    public final void method244(class738 arg0) {
        this.method237(class696.field9609, arg0);
        int var2 = 0;
        if (this.field442 != null) {
            for (int var3 = 0; var3 < this.field442.length; ++var3) {
                class459 var4 = this.field442[var3];
                var4.field6776 = class696.field9609[var2++];
                var4.field6764 = class696.field9609[var2++];
                var4.field6774 = class696.field9609[var2++];
                var4.field6760 = class696.field9609[var2++];
                var4.field6765 = class696.field9609[var2++];
                var4.field6768 = class696.field9609[var2++];
                var4.field6772 = class696.field9609[var2++];
                var4.field6758 = class696.field9609[var2++];
                var4.field6761 = class696.field9609[var2++];
            }
        }
        if (this.field441 != null) {
            for (int var5 = 0; var5 < this.field441.length; ++var5) {
                class285 var6 = this.field441[var5];
                class285 var7 = var6;
                if (var6.field4054 != null) {
                    var7 = var6.field4054;
                }
                if (var6.field4046 != null) {
                    var6.field4046.method772(arg0);
                } else {
                    var6.field4046 = arg0.method759();
                }
                var7.field4048 = class696.field9609[var2++];
                var7.field4045 = class696.field9609[var2++];
                var7.field4049 = class696.field9609[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 90)
    public final void method248(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method261(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 96)
    public final class473 method251(byte arg0, int arg1, boolean arg2) {
        return this.field440.method3946().method3585(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 108)
    public final void method260() {
        if (this.field440.field9611 > 1) {
            synchronized (this) {
                while (super.field6887) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6887 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 129)
    public final void method264(class473 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field440.method3946().method3574(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lql;Leda;I)V", line = 132)
    public final void method265(class738 arg0, class102 arg1, int arg2) {
        if (arg1 == null) {
            this.field440.method3946().method3567(this, arg0, (int[]) null, arg2);
        } else {
            class696.field9595[5] = 0;
            this.field440.method3946().method3567(this, arg0, class696.field9595, arg2);
            arg1.field1432 = class696.field9595[0];
            arg1.field1431 = class696.field9595[1];
            arg1.field1433 = class696.field9595[2];
            arg1.field1434 = class696.field9595[3];
            arg1.field1429 = class696.field9595[4];
            arg1.field1430 = class696.field9595[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lwr;", line = 148)
    public final class459[] method266() {
        return this.field442;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 151)
    public final void method267(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 154)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class161.method1176(this, 0);
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V", line = 164)
    public final void method272() {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lql;IZ)V", line = 172)
    public final void method276(class738 arg0, int arg1, boolean arg2) {
        this.method274(((class278) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILql;ZI)Z", line = 175)
    public final boolean method277(int arg0, int arg1, class738 arg2, boolean arg3, int arg4) {
        return this.field440.method3946().method3568(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V", line = 181)
    public final void method280() {
        if (this.field440.field9611 > 1) {
            synchronized (this) {
                super.field6887 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILql;ZII)Z", line = 193)
    public final boolean method283(int arg0, int arg1, class738 arg2, boolean arg3, int arg4, int arg5) {
        return this.field440.method3946().method3579(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()Z", line = 196)
    public final boolean method284() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lol;", line = 199)
    public final class285[] method285() {
        return this.field441;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Ldh;IIII)V", line = 204)
    public class40(class696 arg0, class53 arg1, class322 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field440 = arg0;
        this.field443 = arg1;
        this.field442 = arg2.field4562;
        this.field441 = arg2.field4589;
        int var8 = arg2.field4562 == null ? 0 : arg2.field4562.length;
        int var9 = arg2.field4589 == null ? 0 : arg2.field4589.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field442[var12].field6766;
            var11[var10++] = this.field442[var12].field6770;
            var11[var10++] = this.field442[var12].field6757;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field441[var13].field4055;
        }
        int var14 = arg2.field4581 == null ? 0 : arg2.field4581.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class542 var20 = arg2.field4581[var17];
            class702 var21 = class495.method2947(var20.field7727, (byte) -79);
            var15[var16++] = var20.field7728;
            var15[var16++] = var21.field9794;
            var15[var16++] = var21.field9792;
            var15[var16++] = var21.field9787;
            var15[var16++] = var21.field9785;
            var15[var16++] = var21.field9791;
            var15[var16++] = var21.field9790 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class542 var19 = arg2.field4581[var18];
            var15[var16++] = var19.field7725;
        }
        this.method281(this.field440, this.field443, arg2.field4590, arg2.field4568, arg2.field4561, arg2.field4564, arg2.field4553, arg2.field4585, arg2.field4587, arg2.field4593, arg2.field4567, arg2.field4563, arg2.field4572, arg2.field4571, arg2.field4591, arg2.field4552, arg2.field4597, arg2.field4604, arg2.field4592, arg2.field4583, arg2.field4556, arg2.field4598, arg2.field4582, arg2.field4558, arg2.field4580, arg2.field4601, arg2.field4594, arg2.field4560, arg2.field4566, arg2.field4588, arg2.field4554, arg2.field4602, arg2.field4600, arg2.field4599, arg2.field4574, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 275)
    public class40(class696 arg0) {
        this.field440 = arg0;
        this.field443 = null;
        this.method252(arg0);
    }

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method236();

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method238(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method239();

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method240();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method241();

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class183 method242(class183 arg0);

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method243(int arg0);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method105(boolean arg0);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method245(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method246();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method247(int arg0);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method249(class40 arg0, class40 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method250();

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method252(class696 arg0);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method253();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method254(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method255();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method256();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method257(int arg0);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method258();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method259(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method261(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method262();

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method263();

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method268();

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method269();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method270(int arg0, int arg1, class280 arg2, class280 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method271(int arg0);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method273();

    @OriginalMember(owner = "client!i", name = "J", descriptor = "(JIZ)V")
    private final native void method274(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method275();

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method278(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method279(int arg0);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method281(class696 arg0, class53 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method282(int arg0);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method286(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method287(int arg0);
}
