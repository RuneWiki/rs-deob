import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class144 extends class121 implements class276 {

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lh;")
    private class469 field2057;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lba;")
    private class262 field2058;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "[Lqm;")
    public class96[] field2056;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "[Lau;")
    public class516[] field2059;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lc;IIIZ)V", line = 6)
    public final void method848(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2057.method2655().method117(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lc;", line = 13)
    public final class121 method863(byte arg0, int arg1, boolean arg2) {
        return this.field2057.method2655().method122(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()[Lau;", line = 16)
    public final class516[] method840() {
        return this.field2059;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILia;Z)Z", line = 20)
    public final boolean method847(int arg0, int arg1, class414 arg2, boolean arg3) {
        return this.field2057.method2655().method121(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 28)
    protected final void finalize() {
        class475.method2732(false, this);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()[Lqm;", line = 41)
    public final class96[] method851() {
        return this.field2056;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 43)
    public final void method837() {
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILia;)V", line = 60)
    public final void method1003(int arg0, class414 arg1) {
        int var3 = arg0;
        if (this.field2056 != null) {
            for (int var4 = 0; var4 < this.field2056.length; var4++) {
                class96 var5 = this.field2056[var4];
                var5.field1444 = class469.field6451[var3++];
                var5.field1436 = class469.field6451[var3++];
                var5.field1456 = class469.field6451[var3++];
                var5.field1445 = class469.field6451[var3++];
                var5.field1458 = class469.field6451[var3++];
                var5.field1450 = class469.field6451[var3++];
                var5.field1448 = class469.field6451[var3++];
                var5.field1432 = class469.field6451[var3++];
                var5.field1438 = class469.field6451[var3++];
            }
        }
        if (this.field2059 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2059.length; var6++) {
            class516 var7 = this.field2059[var6];
            class516 var8 = var7;
            if (var7.field7643 != null) {
                var8 = var7.field7643;
            }
            if (var7.field7644 == null) {
                var7.field7644 = arg1.method962();
            } else {
                var7.field7644.method960(arg1);
            }
            var8.field7647 = class469.field6451[var3++];
            var8.field7652 = class469.field6451[var3++];
            var8.field7653 = class469.field6451[var3++];
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lfo;I)V", line = 117)
    public final void method853(class414 arg0, class357 arg1, int arg2) {
        if (arg1 == null) {
            this.field2057.method2655().method110(this, arg0, null, arg2);
            return;
        }
        class469.field6449[5] = 0;
        this.field2057.method2655().method110(this, arg0, class469.field6449, arg2);
        arg1.field4815 = class469.field6449[0];
        arg1.field4817 = class469.field6449[1];
        arg1.field4820 = class469.field6449[2];
        arg1.field4819 = class469.field6449[3];
        arg1.field4816 = class469.field6449[4];
        arg1.field4818 = class469.field6449[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()Z", line = 133)
    public final boolean method856() {
        return true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lfo;II)V", line = 136)
    public final void method857(class414 arg0, class357 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2057.method2655().method112(this, arg0, null, arg2, arg3);
            return;
        }
        class469.field6449[5] = 0;
        this.field2057.method2655().method112(this, arg0, class469.field6449, arg2, arg3);
        arg1.field4815 = class469.field6449[0];
        arg1.field4817 = class469.field6449[1];
        arg1.field4820 = class469.field6449[2];
        arg1.field4819 = class469.field6449[3];
        arg1.field4816 = class469.field6449[4];
        arg1.field4818 = class469.field6449[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;Lba;Lwp;IIII)V", line = 153)
    public class144(class469 arg0, class262 arg1, class118 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2057 = arg0;
        this.field2058 = arg1;
        this.field2056 = arg2.field1688;
        this.field2059 = arg2.field1710;
        int var8 = arg2.field1688 == null ? 0 : arg2.field1688.length;
        int var9 = arg2.field1710 == null ? 0 : arg2.field1710.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field2056[var12].field1447;
            var11[var10++] = this.field2056[var12].field1454;
            var11[var10++] = this.field2056[var12].field1451;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field2059[var13].field7648;
        }
        int var14 = arg2.field1717 == null ? 0 : arg2.field1717.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class465 var20 = arg2.field1717[var17];
            class4 var21 = class342.method1987(var20.field6417, (byte) -128);
            var15[var16++] = var20.field6422;
            var15[var16++] = var21.field121;
            var15[var16++] = var21.field114;
            var15[var16++] = var21.field117;
            var15[var16++] = var21.field109;
            var15[var16++] = var21.field119;
            var15[var16++] = var21.field111 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class465 var19 = arg2.field1717[var18];
            var15[var16++] = var19.field6419;
        }
        this.method1001(this.field2057, this.field2058, arg2.field1694, arg2.field1693, arg2.field1679, arg2.field1720, arg2.field1712, arg2.field1719, arg2.field1700, arg2.field1737, arg2.field1689, arg2.field1727, arg2.field1716, arg2.field1730, arg2.field1690, arg2.field1686, arg2.field1703, arg2.field1733, arg2.field1692, arg2.field1718, arg2.field1704, arg2.field1697, arg2.field1684, arg2.field1723, arg2.field1725, arg2.field1691, arg2.field1680, arg2.field1699, arg2.field1714, arg2.field1711, arg2.field1735, arg2.field1705, arg2.field1728, arg2.field1729, arg2.field1732, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V", line = 228)
    public final void method883(int arg0, int arg1, int arg2, int arg3) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;)V", line = 230)
    public class144(class469 arg0) {
        this.field2057 = arg0;
        this.field2058 = null;
        this.method1002(arg0);
    }

    @OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
    public final native int method874();

    @OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
    public final native void method872(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
    public final native void method109();

    @OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
    public final native void method879(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
    public final native int method845();

    @OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
    public final native void method871(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
    public final native int method876();

    @OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
    public final native boolean method877();

    @OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
    public final native void method860(int arg0);

    @OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
    public final native void method881(int arg0);

    @OriginalMember(owner = "client!p", name = "j", descriptor = "(Lp;Lp;IZZ)V")
    public final native void method1000(class144 arg0, class144 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
    public final native void method838(int arg0);

    @OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
    public final native void method868(int arg0);

    @OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lj;)Lj;")
    public final native class377 method858(class377 arg0);

    @OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
    public final native void method880(int arg0);

    @OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
    public final native int method850();

    @OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
    public final native void method844();

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lh;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1001(class469 arg0, class262 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
    public final native int method885();

    @OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
    public final native void method869(int arg0);

    @OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
    public final native void method865(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
    public final native void method849();

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
    public final native void method859(int arg0);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
    public final native void method846(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
    public final native int method855();

    @OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lh;)V")
    private final native void method1002(class469 arg0);

    @OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
    public final native void method882(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
    public final native int method854();

    @OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILna;Lna;III)V")
    public final native void method839(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
    public final native int method862();

    @OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
    public final native void method875(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
    public final native int method873();

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public final native int method861();
}
