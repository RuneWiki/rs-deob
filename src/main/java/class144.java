import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class144 extends class121 implements class276 {

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lh;")
    private class468 field2126;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lba;")
    private class262 field2125;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[Lqr;")
    public class46[] field2124;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "[Lwq;")
    public class113[] field2123;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 11)
    protected final void finalize() {
        class284.method1787(-24204, this);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lsf;II)V", line = 14)
    public final void method903(class413 arg0, class361 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2126.method2797().method82(this, arg0, null, arg2, arg3);
            return;
        }
        class468.field6880[5] = 0;
        this.field2126.method2797().method82(this, arg0, class468.field6880, arg2, arg3);
        arg1.field5442 = class468.field6880[0];
        arg1.field5441 = class468.field6880[1];
        arg1.field5445 = class468.field6880[2];
        arg1.field5444 = class468.field6880[3];
        arg1.field5446 = class468.field6880[4];
        arg1.field5443 = class468.field6880[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILia;Z)Z", line = 31)
    public final boolean method909(int arg0, int arg1, class413 arg2, boolean arg3) {
        return this.field2126.method2797().method85(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Lsf;I)V", line = 34)
    public final void method910(class413 arg0, class361 arg1, int arg2) {
        if (arg1 == null) {
            this.field2126.method2797().method83(this, arg0, null, arg2);
            return;
        }
        class468.field6880[5] = 0;
        this.field2126.method2797().method83(this, arg0, class468.field6880, arg2);
        arg1.field5442 = class468.field6880[0];
        arg1.field5441 = class468.field6880[1];
        arg1.field5445 = class468.field6880[2];
        arg1.field5444 = class468.field6880[3];
        arg1.field5446 = class468.field6880[4];
        arg1.field5443 = class468.field6880[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V", line = 54)
    public final void method904(int arg0, int arg1, int arg2, int arg3) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()[Lwq;", line = 59)
    public final class113[] method890() {
        return this.field2123;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILia;)V", line = 77)
    public final void method1039(int arg0, class413 arg1) {
        int var3 = arg0;
        if (this.field2124 != null) {
            for (int var4 = 0; var4 < this.field2124.length; var4++) {
                class46 var5 = this.field2124[var4];
                var5.field716 = class468.field6884[var3++];
                var5.field706 = class468.field6884[var3++];
                var5.field707 = class468.field6884[var3++];
                var5.field714 = class468.field6884[var3++];
                var5.field701 = class468.field6884[var3++];
                var5.field708 = class468.field6884[var3++];
                var5.field705 = class468.field6884[var3++];
                var5.field715 = class468.field6884[var3++];
                var5.field702 = class468.field6884[var3++];
            }
        }
        if (this.field2123 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2123.length; var6++) {
            class113 var7 = this.field2123[var6];
            class113 var8 = var7;
            if (var7.field1793 != null) {
                var8 = var7.field1793;
            }
            if (var7.field1799 == null) {
                var7.field1799 = arg1.method1002();
            } else {
                var7.field1799.method995(arg1);
            }
            var8.field1790 = class468.field6884[var3++];
            var8.field1788 = class468.field6884[var3++];
            var8.field1787 = class468.field6884[var3++];
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()Z", line = 130)
    public final boolean method912() {
        return true;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()V", line = 142)
    public final void method891() {
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lc;IIIZ)V", line = 146)
    public final void method907(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2126.method2797().method73(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()[Lqr;", line = 149)
    public final class46[] method913() {
        return this.field2124;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lc;", line = 156)
    public final class121 method881(byte arg0, int arg1, boolean arg2) {
        return this.field2126.method2797().method81(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;Lba;Llo;IIII)V", line = 159)
    public class144(class468 arg0, class262 arg1, class527 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2126 = arg0;
        this.field2125 = arg1;
        this.field2124 = arg2.field7745;
        this.field2123 = arg2.field7781;
        int var8 = arg2.field7745 == null ? 0 : arg2.field7745.length;
        int var9 = arg2.field7781 == null ? 0 : arg2.field7781.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field2124[var12].field703;
            var11[var10++] = this.field2124[var12].field704;
            var11[var10++] = this.field2124[var12].field709;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field2123[var13].field1792;
        }
        int var14 = arg2.field7790 == null ? 0 : arg2.field7790.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class146 var20 = arg2.field7790[var17];
            class282 var21 = class481.method2872((byte) -64, var20.field2154);
            var15[var16++] = var20.field2150;
            var15[var16++] = var21.field4099;
            var15[var16++] = var21.field4098;
            var15[var16++] = var21.field4092;
            var15[var16++] = var21.field4094;
            var15[var16++] = var21.field4101;
            var15[var16++] = var21.field4102 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class146 var19 = arg2.field7790[var18];
            var15[var16++] = var19.field2149;
        }
        this.method1037(this.field2126, this.field2125, arg2.field7749, arg2.field7778, arg2.field7761, arg2.field7774, arg2.field7787, arg2.field7780, arg2.field7782, arg2.field7738, arg2.field7752, arg2.field7743, arg2.field7777, arg2.field7779, arg2.field7763, arg2.field7773, arg2.field7766, arg2.field7741, arg2.field7783, arg2.field7792, arg2.field7742, arg2.field7739, arg2.field7772, arg2.field7776, arg2.field7756, arg2.field7744, arg2.field7770, arg2.field7750, arg2.field7784, arg2.field7747, arg2.field7785, arg2.field7755, arg2.field7746, arg2.field7748, arg2.field7757, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;)V", line = 230)
    public class144(class468 arg0) {
        this.field2126 = arg0;
        this.field2125 = null;
        this.method1040(arg0);
    }

    @OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lj;)Lj;")
    public final native class377 method885(class377 arg0);

    @OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
    public final native boolean method901();

    @OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
    public final native void method906(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
    public final native void method911(int arg0);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
    public final native void method897(int arg0);

    @OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
    public final native int method898();

    @OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
    public final native int method888();

    @OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
    public final native int method908();

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lh;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1037(class468 arg0, class262 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
    public final native void method882(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
    public final native void method894(int arg0);

    @OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
    public final native void method917(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
    public final native int method883();

    @OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
    public final native void method877(int arg0);

    @OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
    public final native int method876();

    @OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
    public final native void method905(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
    public final native int method899();

    @OriginalMember(owner = "client!p", name = "j", descriptor = "(Lp;Lp;IZZ)V")
    public final native void method1038(class144 arg0, class144 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
    public final native int method916();

    @OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILna;Lna;III)V")
    public final native void method879(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
    public final native void method880(int arg0);

    @OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
    public final native void method895(int arg0);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
    public final native void method919(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public final native int method918();

    @OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
    public final native void method75();

    @OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
    public final native void method886(int arg0);

    @OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
    public final native void method874();

    @OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
    public final native void method878(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lh;)V")
    private final native void method1040(class468 arg0);

    @OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
    public final native int method896();

    @OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
    public final native void method884(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
    public final native int method915();

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
    public final native void method889();
}
