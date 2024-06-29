import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class244 extends class282 implements class2 {

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Loa;")
    private class406 field3583;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lya;")
    private class74 field3584;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[Lqv;")
    public class108[] field3586;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[Lvea;")
    public class647[] field3585;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()[Lqv;", line = 6)
    public final class108[] method517() {
        return this.field3586;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 13)
    public final class282 method509(byte arg0, int arg1, boolean arg2) {
        return this.field3583.method2480().method1151(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILsk;ZII)Z", line = 16)
    public final boolean method538(int arg0, int arg1, class121 arg2, boolean arg3, int arg4, int arg5) {
        return this.field3583.method2480().method1155(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lvea;", line = 22)
    public final class647[] method502() {
        return this.field3585;
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 25)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class260.method1726(this, false);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lsk;)V", line = 31)
    public final void method491(class121 arg0) {
        this.method1669(class406.field5783, arg0);
        int var2 = 0;
        if (this.field3586 != null) {
            for (int var3 = 0; var3 < this.field3586.length; ++var3) {
                class108 var4 = this.field3586[var3];
                var4.field1556 = class406.field5783[var2++];
                var4.field1552 = class406.field5783[var2++];
                var4.field1546 = class406.field5783[var2++];
                var4.field1543 = class406.field5783[var2++];
                var4.field1540 = class406.field5783[var2++];
                var4.field1537 = class406.field5783[var2++];
                var4.field1554 = class406.field5783[var2++];
                var4.field1549 = class406.field5783[var2++];
                var4.field1548 = class406.field5783[var2++];
            }
        }
        if (this.field3585 != null) {
            for (int var5 = 0; var5 < this.field3585.length; ++var5) {
                class647 var6 = this.field3585[var5];
                class647 var7 = var6;
                if (var6.field9326 != null) {
                    var7 = var6.field9326;
                }
                if (var6.field9325 != null) {
                    var6.field9325.method841(arg0);
                } else {
                    var6.field9325 = arg0.method853();
                }
                var7.field9315 = class406.field5783[var2++];
                var7.field9318 = class406.field5783[var2++];
                var7.field9313 = class406.field5783[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 95)
    public final void method512(class282 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3583.method2480().method1150(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lsk;IZ)V", line = 99)
    public final void method523(class121 arg0, int arg1, boolean arg2) {
        this.method1667(((class134) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 111)
    public final void method499() {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lsk;Lnl;I)V", line = 118)
    public final void method533(class121 arg0, class373 arg1, int arg2) {
        if (arg1 == null) {
            this.field3583.method2480().method1179(this, arg0, (int[]) null, arg2);
        } else {
            class406.field5788[5] = 0;
            this.field3583.method2480().method1179(this, arg0, class406.field5788, arg2);
            arg1.field5407 = class406.field5788[0];
            arg1.field5410 = class406.field5788[1];
            arg1.field5408 = class406.field5788[2];
            arg1.field5411 = class406.field5788[3];
            arg1.field5412 = class406.field5788[4];
            arg1.field5409 = class406.field5788[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILsk;)V", line = 136)
    private final void method1669(int[] arg0, class121 arg1) {
        this.field3583.method2480().method1172(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 141)
    public final void method531(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1670(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 148)
    public final void method483() {
        if (this.field3583.field5796 > 1) {
            synchronized (this) {
                super.field3944 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()Z", line = 159)
    public final boolean method543() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 162)
    public final void method489() {
        if (this.field3583.field5796 > 1) {
            synchronized (this) {
                while (super.field3944) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field3944 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 179)
    public final void method524(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lfu;IIII)V", line = 181)
    public class244(class406 arg0, class74 arg1, class637 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3583 = arg0;
        this.field3584 = arg1;
        this.field3586 = arg2.field9004;
        this.field3585 = arg2.field9026;
        int var8 = arg2.field9004 == null ? 0 : arg2.field9004.length;
        int var9 = arg2.field9026 == null ? 0 : arg2.field9026.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field3586[var12].field1558;
            var11[var10++] = this.field3586[var12].field1550;
            var11[var10++] = this.field3586[var12].field1547;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field3585[var13].field9323;
        }
        int var14 = arg2.field9011 == null ? 0 : arg2.field9011.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class144 var20 = arg2.field9011[var17];
            class624 var21 = class183.method1299((byte) 84, var20.field1961);
            var15[var16++] = var20.field1955;
            var15[var16++] = var21.field8873;
            var15[var16++] = var21.field8870;
            var15[var16++] = var21.field8868;
            var15[var16++] = var21.field8869;
            var15[var16++] = var21.field8871;
            var15[var16++] = var21.field8877 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class144 var19 = arg2.field9011[var18];
            var15[var16++] = var19.field1959;
        }
        this.method1671(this.field3583, this.field3584, arg2.field9008, arg2.field8993, arg2.field8985, arg2.field8995, arg2.field8994, arg2.field8980, arg2.field8984, arg2.field8998, arg2.field9015, arg2.field9016, arg2.field9022, arg2.field8987, arg2.field9001, arg2.field9003, arg2.field9025, arg2.field8996, arg2.field9017, arg2.field8982, arg2.field9002, arg2.field9006, arg2.field9000, arg2.field9027, arg2.field9030, arg2.field9012, arg2.field8983, arg2.field9014, arg2.field8997, arg2.field9029, arg2.field8988, arg2.field8990, arg2.field9009, arg2.field9010, arg2.field8986, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lsk;Lnl;II)V", line = 254)
    public final void method503(class121 arg0, class373 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field3583.method2480().method1180(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class406.field5788[5] = 0;
            this.field3583.method2480().method1180(this, arg0, class406.field5788, arg2, arg3);
            arg1.field5407 = class406.field5788[0];
            arg1.field5410 = class406.field5788[1];
            arg1.field5408 = class406.field5788[2];
            arg1.field5411 = class406.field5788[3];
            arg1.field5412 = class406.field5788[4];
            arg1.field5409 = class406.field5788[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 271)
    public class244(class406 arg0) {
        this.field3583 = arg0;
        this.field3584 = null;
        this.method1666(arg0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILsk;ZI)Z", line = 278)
    public final boolean method496(int arg0, int arg1, class121 arg2, boolean arg3, int arg4) {
        return this.field3583.method2480().method1163(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method485(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method525(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method541(int arg0);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method507();

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method487(int arg0);

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method514();

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method521();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method486(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method519();

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method511();

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method1666(class406 arg0);

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method500(int arg0);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method495();

    @OriginalMember(owner = "client!i", name = "B", descriptor = "(JIZ)V")
    private final native void method1667(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method497();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method504();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method537();

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method539();

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method484(int arg0);

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method488(int arg0);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method529(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method506();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method520(int arg0);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method1668(class244 arg0, class244 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method508(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method522();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method516(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method534();

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class704 method540(class704 arg0);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method1670(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1671(class406 arg0, class74 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method536();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method492(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method518(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method542();

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method528();

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method9(boolean arg0);
}
