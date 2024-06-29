import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class43 extends class471 implements class103 {

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Lqa;")
    private class163 field492;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "Lna;")
    private class35 field491;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "[Lbu;")
    public class17[] field494;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[Lpf;")
    public class410[] field493;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()I")
    public final native int method432();

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()I")
    public final native int method433();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public final void method434(int arg0, int arg1, int arg2, int arg3) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I[IIIIZI[I)V")
    public final native void method435(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final native boolean method436();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lt;IIIZ)V")
    public final void method437(class471 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field492.method1159().method93(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public final native void method438(int arg0);

    @OriginalMember(owner = "client!da", name = "N", descriptor = "(IIII)V")
    public final native void method439(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()V")
    public final native void method440();

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
    public final void method441() {
    }

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lqa;)V")
    private final native void method442(class163 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method443(int arg0, int arg1, class122 arg2, boolean arg3) {
        return this.field492.method1159().method92(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()[Lpf;")
    public final class410[] method444() {
        return this.field493;
    }

    @OriginalMember(owner = "client!da", name = "I", descriptor = "(SS)V")
    public final native void method445(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(III)V")
    public final native void method446(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "(I)V")
    public final native void method447(int arg0);

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "()I")
    public final native int method448();

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(Lba;)Lba;")
    public final native class263 method449(class263 arg0);

    @OriginalMember(owner = "client!da", name = "NA", descriptor = "()I")
    public final native int method450();

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(I)V")
    public final native void method451(int arg0);

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "(I)V")
    public final native void method452(int arg0);

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public final native int method453();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()[Lbu;")
    public final class17[] method454() {
        return this.field494;
    }

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(I)V")
    public final native void method455(int arg0);

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()I")
    public final native int method456();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lmi;I)V")
    public final void method457(class122 arg0, class341 arg1, int arg2) {
        if (arg1 == null) {
            this.field492.method1159().method90(this, arg0, null, arg2);
            return;
        }
        class163.field2298[5] = 0;
        this.field492.method1159().method90(this, arg0, class163.field2298, arg2);
        arg1.field4728 = class163.field2298[0];
        arg1.field4726 = class163.field2298[1];
        arg1.field4730 = class163.field2298[2];
        arg1.field4727 = class163.field2298[3];
        arg1.field4731 = class163.field2298[4];
        arg1.field4729 = class163.field2298[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "EA", descriptor = "()V")
    public final native void method101();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lt;")
    public final class471 method458(byte arg0, int arg1, boolean arg2) {
        return this.field492.method1159().method99(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!da", name = "P", descriptor = "()I")
    public final native int method459();

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public final native int method460();

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
    public final boolean method461() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(III)V")
    public final native void method462(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "()I")
    public final native int method463();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lmi;II)V")
    public final void method464(class122 arg0, class341 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field492.method1159().method104(this, arg0, null, arg2, arg3);
            return;
        }
        class163.field2298[5] = 0;
        this.field492.method1159().method104(this, arg0, class163.field2298, arg2, arg3);
        arg1.field4728 = class163.field2298[0];
        arg1.field4726 = class163.field2298[1];
        arg1.field4730 = class163.field2298[2];
        arg1.field4727 = class163.field2298[3];
        arg1.field4731 = class163.field2298[4];
        arg1.field4729 = class163.field2298[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "UA", descriptor = "(I)V")
    public final native void method465(int arg0);

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class260.method1672((byte) 50, this);
    }

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(Lda;Lda;IZZ)V")
    public final native void method466(class43 arg0, class43 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(SS)V")
    public final native void method467(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "E", descriptor = "(I)V")
    public final native void method468(int arg0);

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()V")
    public final native void method469();

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method470();

    @OriginalMember(owner = "client!da", name = "XA", descriptor = "(I[IIIIIZ)V")
    public final native void method471(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "(Lqa;Lna;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method472(class163 arg0, class35 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;Lna;Ljq;IIII)V")
    public class43(class163 arg0, class35 arg1, class353 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field492 = arg0;
        this.field491 = arg1;
        this.field494 = arg2.field4925;
        this.field493 = arg2.field4907;
        int var8 = arg2.field4925 == null ? 0 : arg2.field4925.length;
        int var9 = arg2.field4907 == null ? 0 : arg2.field4907.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field494[var12].field189;
            var11[var10++] = this.field494[var12].field197;
            var11[var10++] = this.field494[var12].field180;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field493[var13].field6089;
        }
        int var14 = arg2.field4909 == null ? 0 : arg2.field4909.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class130 var20 = arg2.field4909[var17];
            class224 var21 = class213.method1460(true, var20.field1874);
            var15[var16++] = var20.field1869;
            var15[var16++] = var21.field3285;
            var15[var16++] = var21.field3292;
            var15[var16++] = var21.field3283;
            var15[var16++] = var21.field3282;
            var15[var16++] = var21.field3290;
            var15[var16++] = var21.field3291 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class130 var19 = arg2.field4909[var18];
            var15[var16++] = var19.field1875;
        }
        this.method472(this.field492, this.field491, arg2.field4892, arg2.field4915, arg2.field4904, arg2.field4889, arg2.field4936, arg2.field4922, arg2.field4912, arg2.field4929, arg2.field4898, arg2.field4895, arg2.field4890, arg2.field4906, arg2.field4893, arg2.field4932, arg2.field4938, arg2.field4914, arg2.field4939, arg2.field4908, arg2.field4902, arg2.field4899, arg2.field4940, arg2.field4941, arg2.field4894, arg2.field4887, arg2.field4923, arg2.field4931, arg2.field4928, arg2.field4934, arg2.field4891, arg2.field4937, arg2.field4942, arg2.field4896, arg2.field4927, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;)V")
    public class43(class163 arg0) {
        this.field492 = arg0;
        this.field491 = null;
        this.method442(arg0);
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IILta;Lta;III)V")
    public final native void method473(int arg0, int arg1, class142 arg2, class142 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILc;)V")
    public final void method474(int arg0, class122 arg1) {
        int var3 = arg0;
        if (this.field494 != null) {
            for (int var4 = 0; var4 < this.field494.length; var4++) {
                class17 var5 = this.field494[var4];
                var5.field181 = class163.field2307[var3++];
                var5.field182 = class163.field2307[var3++];
                var5.field194 = class163.field2307[var3++];
                var5.field183 = class163.field2307[var3++];
                var5.field184 = class163.field2307[var3++];
                var5.field190 = class163.field2307[var3++];
                var5.field191 = class163.field2307[var3++];
                var5.field186 = class163.field2307[var3++];
                var5.field192 = class163.field2307[var3++];
            }
        }
        if (this.field493 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field493.length; var6++) {
            class410 var7 = this.field493[var6];
            class410 var8 = var7;
            if (var7.field6096 != null) {
                var8 = var7.field6096;
            }
            if (var7.field6091 == null) {
                var7.field6091 = arg1.method245();
            } else {
                var7.field6091.method256(arg1);
            }
            var8.field6094 = class163.field2307[var3++];
            var8.field6092 = class163.field2307[var3++];
            var8.field6101 = class163.field2307[var3++];
        }
    }
}
