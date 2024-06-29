import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class184 extends class507 implements class241 {

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lh;")
    private class373 field2412;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lba;")
    private class498 field2414;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "[Lsm;")
    public class473[] field2413;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "[Lot;")
    public class165[] field2415;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()[Lsm;", line = 8)
    public final class473[] method493() {
        return this.field2413;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILia;)V", line = 17)
    public final void method1219(int arg0, class142 arg1) {
        int var3 = arg0;
        if (this.field2413 != null) {
            for (int var4 = 0; var4 < this.field2413.length; var4++) {
                class473 var5 = this.field2413[var4];
                var5.field6908 = class373.field4838[var3++];
                var5.field6910 = class373.field4838[var3++];
                var5.field6907 = class373.field4838[var3++];
                var5.field6913 = class373.field4838[var3++];
                var5.field6902 = class373.field4838[var3++];
                var5.field6906 = class373.field4838[var3++];
                var5.field6911 = class373.field4838[var3++];
                var5.field6923 = class373.field4838[var3++];
                var5.field6905 = class373.field4838[var3++];
            }
        }
        if (this.field2415 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2415.length; var6++) {
            class165 var7 = this.field2415[var6];
            class165 var8 = var7;
            if (var7.field2133 != null) {
                var8 = var7.field2133;
            }
            if (var7.field2134 == null) {
                var7.field2134 = arg1.method977();
            } else {
                var7.field2134.method988(arg1);
            }
            var8.field2138 = class373.field4838[var3++];
            var8.field2130 = class373.field4838[var3++];
            var8.field2137 = class373.field4838[var3++];
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()V", line = 69)
    public final void method492() {
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 72)
    protected final void finalize() {
        class313.method1863(this, 113);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Laq;II)V", line = 77)
    public final void method512(class142 arg0, class530 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2412.method2183().method1547(this, arg0, null, arg2, arg3);
            return;
        }
        class373.field4840[5] = 0;
        this.field2412.method2183().method1547(this, arg0, class373.field4840, arg2, arg3);
        arg1.field7811 = class373.field4840[0];
        arg1.field7810 = class373.field4840[1];
        arg1.field7809 = class373.field4840[2];
        arg1.field7814 = class373.field4840[3];
        arg1.field7812 = class373.field4840[4];
        arg1.field7813 = class373.field4840[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Laq;I)V", line = 100)
    public final void method520(class142 arg0, class530 arg1, int arg2) {
        if (arg1 == null) {
            this.field2412.method2183().method1545(this, arg0, null, arg2);
            return;
        }
        class373.field4840[5] = 0;
        this.field2412.method2183().method1545(this, arg0, class373.field4840, arg2);
        arg1.field7811 = class373.field4840[0];
        arg1.field7810 = class373.field4840[1];
        arg1.field7809 = class373.field4840[2];
        arg1.field7814 = class373.field4840[3];
        arg1.field7812 = class373.field4840[4];
        arg1.field7813 = class373.field4840[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V", line = 120)
    public final void method485(int arg0, int arg1, int arg2, int arg3) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()Z", line = 125)
    public final boolean method523() {
        return true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lc;", line = 128)
    public final class507 method510(byte arg0, int arg1, boolean arg2) {
        return this.field2412.method2183().method1552(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()[Lot;", line = 131)
    public final class165[] method476() {
        return this.field2415;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILia;Z)Z", line = 135)
    public final boolean method499(int arg0, int arg1, class142 arg2, boolean arg3) {
        return this.field2412.method2183().method1544(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lc;IIIZ)V", line = 153)
    public final void method483(class507 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2412.method2183().method1549(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;Lba;Luu;IIII)V", line = 158)
    public class184(class373 arg0, class498 arg1, class420 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2412 = arg0;
        this.field2414 = arg1;
        this.field2413 = arg2.field5616;
        this.field2415 = arg2.field5589;
        int var8 = arg2.field5616 == null ? 0 : arg2.field5616.length;
        int var9 = arg2.field5589 == null ? 0 : arg2.field5589.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field2413[var12].field6904;
            var11[var10++] = this.field2413[var12].field6917;
            var11[var10++] = this.field2413[var12].field6903;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field2415[var13].field2131;
        }
        int var14 = arg2.field5613 == null ? 0 : arg2.field5613.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class326 var20 = arg2.field5613[var17];
            class432 var21 = class195.method1261(var20.field4187, 27);
            var15[var16++] = var20.field4179;
            var15[var16++] = var21.field5953;
            var15[var16++] = var21.field5957;
            var15[var16++] = var21.field5956;
            var15[var16++] = var21.field5960;
            var15[var16++] = var21.field5959;
            var15[var16++] = var21.field5954 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class326 var19 = arg2.field5613[var18];
            var15[var16++] = var19.field4183;
        }
        this.method1221(this.field2412, this.field2414, arg2.field5631, arg2.field5615, arg2.field5634, arg2.field5592, arg2.field5591, arg2.field5614, arg2.field5602, arg2.field5609, arg2.field5590, arg2.field5619, arg2.field5625, arg2.field5611, arg2.field5594, arg2.field5612, arg2.field5608, arg2.field5603, arg2.field5582, arg2.field5610, arg2.field5623, arg2.field5601, arg2.field5624, arg2.field5632, arg2.field5599, arg2.field5581, arg2.field5604, arg2.field5598, arg2.field5595, arg2.field5596, arg2.field5627, arg2.field5606, arg2.field5597, arg2.field5600, arg2.field5628, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;)V", line = 229)
    public class184(class373 arg0) {
        this.field2412 = arg0;
        this.field2414 = null;
        this.method1220(arg0);
    }

    @OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
    public final native int method491();

    @OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
    public final native void method521(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
    public final native void method487(int arg0);

    @OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
    public final native void method486(int arg0);

    @OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILna;Lna;III)V")
    public final native void method534(int arg0, int arg1, class251 arg2, class251 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
    public final native int method511();

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
    public final native int method524();

    @OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
    public final native void method478(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
    public final native void method516(int arg0);

    @OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lh;)V")
    private final native void method1220(class373 arg0);

    @OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
    public final native int method519();

    @OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
    public final native void method517(int arg0);

    @OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
    public final native void method482(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
    public final native void method536();

    @OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
    public final native void method506(int arg0);

    @OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
    public final native void method535(int arg0);

    @OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lj;)Lj;")
    public final native class254 method525(class254 arg0);

    @OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
    public final native int method497();

    @OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
    public final native void method522(int arg0);

    @OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
    public final native int method490();

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public final native int method507();

    @OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
    public final native void method537(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
    public final native int method475();

    @OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
    public final native void method502();

    @OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lh;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1221(class373 arg0, class498 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
    public final native void method533(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
    public final native void method508(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
    public final native int method515();

    @OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
    public final native int method531();

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
    public final native void method505(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
    public final native boolean method518();

    @OriginalMember(owner = "client!p", name = "j", descriptor = "(Lp;Lp;IZZ)V")
    public final native void method1222(class184 arg0, class184 arg1, int arg2, boolean arg3, boolean arg4);
}
