import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class144 extends class121 implements class276 {

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lh;")
    private class469 field2254;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Lba;")
    private class262 field2253;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[Lwv;")
    public class26[] field2255;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "[Lnk;")
    public class501[] field2252;

    @OriginalMember(owner = "client!p", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Llc;II)V", line = 5)
    public final void method899(class414 arg0, class456 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field2254.method2778().method67(this, arg0, null, arg2, arg3);
            return;
        }
        class469.field6979[5] = 0;
        this.field2254.method2778().method67(this, arg0, class469.field6979, arg2, arg3);
        arg1.field6812 = class469.field6979[0];
        arg1.field6813 = class469.field6979[1];
        arg1.field6810 = class469.field6979[2];
        arg1.field6811 = class469.field6979[3];
        arg1.field6814 = class469.field6979[4];
        arg1.field6809 = class469.field6979[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V", line = 21)
    public final void method939(int arg0, int arg1, int arg2, int arg3) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lc;IIIZ)V", line = 26)
    public final void method928(class121 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2254.method2778().method54(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "()[Lnk;", line = 31)
    public final class501[] method903() {
        return this.field2252;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()[Lwv;", line = 37)
    public final class26[] method893() {
        return this.field2255;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILia;)V", line = 55)
    public final void method1058(int arg0, class414 arg1) {
        int var3 = arg0;
        if (this.field2255 != null) {
            for (int var4 = 0; var4 < this.field2255.length; var4++) {
                class26 var5 = this.field2255[var4];
                var5.field568 = class469.field6981[var3++];
                var5.field558 = class469.field6981[var3++];
                var5.field570 = class469.field6981[var3++];
                var5.field573 = class469.field6981[var3++];
                var5.field562 = class469.field6981[var3++];
                var5.field556 = class469.field6981[var3++];
                var5.field559 = class469.field6981[var3++];
                var5.field564 = class469.field6981[var3++];
                var5.field557 = class469.field6981[var3++];
            }
        }
        if (this.field2252 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field2252.length; var6++) {
            class501 var7 = this.field2252[var6];
            class501 var8 = var7;
            if (var7.field7385 != null) {
                var8 = var7.field7385;
            }
            if (var7.field7391 == null) {
                var7.field7391 = arg1.method871();
            } else {
                var7.field7391.method866(arg1);
            }
            var8.field7386 = class469.field6981[var3++];
            var8.field7384 = class469.field6981[var3++];
            var8.field7395 = class469.field6981[var3++];
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "()Z", line = 112)
    public final boolean method915() {
        return true;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lia;Llc;I)V", line = 117)
    public final void method927(class414 arg0, class456 arg1, int arg2) {
        if (arg1 == null) {
            this.field2254.method2778().method55(this, arg0, null, arg2);
            return;
        }
        class469.field6979[5] = 0;
        this.field2254.method2778().method55(this, arg0, class469.field6979, arg2);
        arg1.field6812 = class469.field6979[0];
        arg1.field6813 = class469.field6979[1];
        arg1.field6810 = class469.field6979[2];
        arg1.field6811 = class469.field6979[3];
        arg1.field6814 = class469.field6979[4];
        arg1.field6809 = class469.field6979[5] != 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BIZ)Lc;", line = 134)
    public final class121 method938(byte arg0, int arg1, boolean arg2) {
        return this.field2254.method2778().method65(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V", line = 138)
    protected final void finalize() {
        class379.method2355(4650, this);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILia;Z)Z", line = 142)
    public final boolean method924(int arg0, int arg1, class414 arg2, boolean arg3) {
        return this.field2254.method2778().method68(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()V", line = 151)
    public final void method898() {
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;Lba;Lnd;IIII)V", line = 158)
    public class144(class469 arg0, class262 arg1, class380 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2254 = arg0;
        this.field2253 = arg1;
        this.field2255 = arg2.field5757;
        this.field2252 = arg2.field5775;
        int var8 = arg2.field5757 == null ? 0 : arg2.field5757.length;
        int var9 = arg2.field5775 == null ? 0 : arg2.field5775.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field2255[var12].field571;
            var11[var10++] = this.field2255[var12].field566;
            var11[var10++] = this.field2255[var12].field565;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field2252[var13].field7393;
        }
        int var14 = arg2.field5745 == null ? 0 : arg2.field5745.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class428 var20 = arg2.field5745[var17];
            class104 var21 = class59.method523(var20.field6360, -78);
            var15[var16++] = var20.field6354;
            var15[var16++] = var21.field1735;
            var15[var16++] = var21.field1737;
            var15[var16++] = var21.field1726;
            var15[var16++] = var21.field1740;
            var15[var16++] = var21.field1729;
            var15[var16++] = var21.field1738 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class428 var19 = arg2.field5745[var18];
            var15[var16++] = var19.field6356;
        }
        this.method1057(this.field2254, this.field2253, arg2.field5773, arg2.field5740, arg2.field5738, arg2.field5724, arg2.field5760, arg2.field5734, arg2.field5759, arg2.field5728, arg2.field5744, arg2.field5774, arg2.field5746, arg2.field5772, arg2.field5755, arg2.field5765, arg2.field5771, arg2.field5750, arg2.field5764, arg2.field5756, arg2.field5767, arg2.field5725, arg2.field5733, arg2.field5743, arg2.field5749, arg2.field5763, arg2.field5747, arg2.field5727, arg2.field5748, arg2.field5731, arg2.field5732, arg2.field5768, arg2.field5730, arg2.field5762, arg2.field5723, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lh;)V", line = 230)
    public class144(class469 arg0) {
        this.field2254 = arg0;
        this.field2253 = null;
        this.method1059(arg0);
    }

    @OriginalMember(owner = "client!p", name = "n", descriptor = "()I")
    public final native int method889();

    @OriginalMember(owner = "client!p", name = "E", descriptor = "()I")
    public final native int method935();

    @OriginalMember(owner = "client!p", name = "ia", descriptor = "(I)V")
    public final native void method913(int arg0);

    @OriginalMember(owner = "client!p", name = "la", descriptor = "()I")
    public final native int method907();

    @OriginalMember(owner = "client!p", name = "j", descriptor = "(Lp;Lp;IZZ)V")
    public final native void method1056(class144 arg0, class144 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "(Lh;Lba;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1057(class469 arg0, class262 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "()I")
    public final native int method920();

    @OriginalMember(owner = "client!p", name = "X", descriptor = "()I")
    public final native int method931();

    @OriginalMember(owner = "client!p", name = "ZA", descriptor = "(I)V")
    public final native void method902(int arg0);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "(I)V")
    public final native void method912(int arg0);

    @OriginalMember(owner = "client!p", name = "N", descriptor = "(SS)V")
    public final native void method890(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "ya", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!p", name = "ua", descriptor = "(Lj;)Lj;")
    public final native class377 method936(class377 arg0);

    @OriginalMember(owner = "client!p", name = "u", descriptor = "(I)V")
    public final native void method906(int arg0);

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public final native int method930();

    @OriginalMember(owner = "client!p", name = "ra", descriptor = "()I")
    public final native int method891();

    @OriginalMember(owner = "client!p", name = "FA", descriptor = "()Z")
    public final native boolean method896();

    @OriginalMember(owner = "client!p", name = "oa", descriptor = "(I)V")
    public final native void method908(int arg0);

    @OriginalMember(owner = "client!p", name = "ja", descriptor = "(III)V")
    public final native void method923(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "K", descriptor = "(IIII)V")
    public final native void method929(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!p", name = "va", descriptor = "(I[IIIIZI[I)V")
    public final native void method919(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!p", name = "YA", descriptor = "(SS)V")
    public final native void method933(short arg0, short arg1);

    @OriginalMember(owner = "client!p", name = "fa", descriptor = "()I")
    public final native int method905();

    @OriginalMember(owner = "client!p", name = "C", descriptor = "()I")
    public final native int method921();

    @OriginalMember(owner = "client!p", name = "XA", descriptor = "(III)V")
    public final native void method925(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!p", name = "ea", descriptor = "(IILna;Lna;III)V")
    public final native void method900(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!p", name = "W", descriptor = "()V")
    public final native void method934();

    @OriginalMember(owner = "client!p", name = "VA", descriptor = "()I")
    public final native int method911();

    @OriginalMember(owner = "client!p", name = "xa", descriptor = "(I[IIIIIZ)V")
    public final native void method917(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!p", name = "sa", descriptor = "()V")
    public final native void method897();

    @OriginalMember(owner = "client!p", name = "WA", descriptor = "(I)V")
    public final native void method922(int arg0);

    @OriginalMember(owner = "client!p", name = "BA", descriptor = "(Lh;)V")
    private final native void method1059(class469 arg0);

    @OriginalMember(owner = "client!p", name = "o", descriptor = "(I)V")
    public final native void method895(int arg0);
}
