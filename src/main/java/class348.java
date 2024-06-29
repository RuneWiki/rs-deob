import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class348 extends class373 implements class350 {

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "Lw;")
    private class197 field4635;

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "Lg;")
    private class108 field4638;

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "[Lsu;")
    public class142[] field4637;

    @OriginalMember(owner = "client!xa", name = "o", descriptor = "[Lop;")
    public class127[] field4636;

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()[Lsu;", line = 3)
    public final class142[] method2009() {
        return this.field4637;
    }

    @OriginalMember(owner = "client!xa", name = "d", descriptor = "()V", line = 8)
    public final void method2013() {
    }

    @OriginalMember(owner = "client!xa", name = "c", descriptor = "()[Lop;", line = 13)
    public final class127[] method2015() {
        return this.field4636;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lut;II)V", line = 16)
    public final void method2016(class124 arg0, class82 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field4635.method1148().method2456(this, arg0, null, arg2, arg3);
            return;
        }
        class197.field2548[5] = 0;
        this.field4635.method1148().method2456(this, arg0, class197.field2548, arg2, arg3);
        arg1.field996 = class197.field2548[0];
        arg1.field995 = class197.field2548[1];
        arg1.field992 = class197.field2548[2];
        arg1.field997 = class197.field2548[3];
        arg1.field993 = class197.field2548[4];
        arg1.field994 = class197.field2548[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()Z", line = 36)
    public final boolean method2020() {
        return true;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILc;Z)Z", line = 47)
    public final boolean method2026(int arg0, int arg1, class124 arg2, boolean arg3) {
        return this.field4635.method1148().method2463(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Le;", line = 53)
    public final class373 method2027(byte arg0, int arg1, boolean arg2) {
        return this.field4635.method1148().method2460(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V", line = 57)
    public final void method2030(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 61)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class269.method1636(this, true);
        }
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILc;)V", line = 68)
    public final void method2033(int arg0, class124 arg1) {
        int var3 = arg0;
        if (this.field4637 != null) {
            for (int var4 = 0; var4 < this.field4637.length; var4++) {
                class142 var5 = this.field4637[var4];
                var5.field1878 = class197.field2542[var3++];
                var5.field1886 = class197.field2542[var3++];
                var5.field1874 = class197.field2542[var3++];
                var5.field1876 = class197.field2542[var3++];
                var5.field1891 = class197.field2542[var3++];
                var5.field1877 = class197.field2542[var3++];
                var5.field1894 = class197.field2542[var3++];
                var5.field1881 = class197.field2542[var3++];
                var5.field1884 = class197.field2542[var3++];
            }
        }
        if (this.field4636 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4636.length; var6++) {
            class127 var7 = this.field4636[var6];
            class127 var8 = var7;
            if (var7.field1643 != null) {
                var8 = var7.field1643;
            }
            if (var7.field1645 == null) {
                var7.field1645 = arg1.method750();
            } else {
                var7.field1645.method753(arg1);
            }
            var8.field1653 = class197.field2542[var3++];
            var8.field1648 = class197.field2542[var3++];
            var8.field1640 = class197.field2542[var3++];
        }
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;Lg;Lpq;IIII)V", line = 139)
    public class348(class197 arg0, class108 arg1, class131 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4635 = arg0;
        this.field4638 = arg1;
        this.field4637 = arg2.field1699;
        this.field4636 = arg2.field1733;
        int var8 = arg2.field1699 == null ? 0 : arg2.field1699.length;
        int var9 = arg2.field1733 == null ? 0 : arg2.field1733.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field4637[var12].field1889;
            var11[var10++] = this.field4637[var12].field1888;
            var11[var10++] = this.field4637[var12].field1883;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field4636[var13].field1644;
        }
        int var14 = arg2.field1738 == null ? 0 : arg2.field1738.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class388 var20 = arg2.field1738[var17];
            class65 var21 = class478.method2915(true, var20.field5630);
            var15[var16++] = var20.field5628;
            var15[var16++] = var21.field752;
            var15[var16++] = var21.field748;
            var15[var16++] = var21.field744;
            var15[var16++] = var21.field743;
            var15[var16++] = var21.field746;
            var15[var16++] = var21.field747 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class388 var19 = arg2.field1738[var18];
            var15[var16++] = var19.field5633;
        }
        this.method2012(this.field4635, this.field4638, arg2.field1727, arg2.field1701, arg2.field1735, arg2.field1717, arg2.field1710, arg2.field1740, arg2.field1695, arg2.field1705, arg2.field1724, arg2.field1734, arg2.field1725, arg2.field1718, arg2.field1720, arg2.field1737, arg2.field1730, arg2.field1708, arg2.field1691, arg2.field1703, arg2.field1711, arg2.field1728, arg2.field1736, arg2.field1729, arg2.field1690, arg2.field1713, arg2.field1689, arg2.field1712, arg2.field1741, arg2.field1731, arg2.field1692, arg2.field1707, arg2.field1694, arg2.field1706, arg2.field1697, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;)V", line = 210)
    public class348(class197 arg0) {
        this.field4635 = arg0;
        this.field4638 = null;
        this.method2046(arg0);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Le;IIIZ)V", line = 217)
    public final void method2049(class373 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4635.method1148().method2465(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lut;I)V", line = 221)
    public final void method2051(class124 arg0, class82 arg1, int arg2) {
        if (arg1 == null) {
            this.field4635.method1148().method2470(this, arg0, null, arg2);
            return;
        }
        class197.field2548[5] = 0;
        this.field4635.method1148().method2470(this, arg0, class197.field2548, arg2);
        arg1.field996 = class197.field2548[0];
        arg1.field995 = class197.field2548[1];
        arg1.field992 = class197.field2548[2];
        arg1.field997 = class197.field2548[3];
        arg1.field993 = class197.field2548[4];
        arg1.field994 = class197.field2548[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
    public final native void method2010();

    @OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
    public final native void method2011(int arg0);

    @OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lw;Lg;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2012(class197 arg0, class108 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
    public final native void method2014(int arg0);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Li;)Li;")
    public final native class31 method2017(class31 arg0);

    @OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
    public final native void method2018(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
    public final native int method2019();

    @OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
    public final native boolean method2021();

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
    public final native void method2022(int arg0);

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
    public final native int method2023();

    @OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
    public final native int method2024();

    @OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
    public final native int method2025();

    @OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
    public final native int method2028();

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
    public final native void method2029();

    @OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lxa;Lxa;IZZ)V")
    public final native void method2031(class348 arg0, class348 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
    public final native void method2032(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
    public final native void method2034(int arg0);

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
    public final native void method426();

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
    public final native void method2035(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
    public final native int method2036();

    @OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
    public final native void method2037(int arg0);

    @OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILya;Lya;III)V")
    public final native void method2038(int arg0, int arg1, class38 arg2, class38 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
    public final native void method2039(int arg0);

    @OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
    public final native void method2040(int arg0);

    @OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
    public final native int method2041();

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final native void method2042(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
    public final native int method2043();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
    public final native void method2044(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
    public final native int method2045();

    @OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lw;)V")
    private final native void method2046(class197 arg0);

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
    public final native void method2047(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
    public final native int method2048();

    @OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
    public final native void method2050(int arg0, int arg1, int arg2, int arg3);
}
