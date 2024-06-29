import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class44 extends class475 implements class105 {

    @OriginalMember(owner = "client!da", name = "u", descriptor = "Lqa;")
    private class166 field558;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Lna;")
    private class35 field560;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[Luj;")
    public class262[] field561;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "[Ldv;")
    public class471[] field559;

    @OriginalMember(owner = "client!da", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
    public final native int method416();

    @OriginalMember(owner = "client!da", name = "aa", descriptor = "(I)V")
    public final native void method417(int arg0);

    @OriginalMember(owner = "client!da", name = "w", descriptor = "()Z")
    public final native boolean method418();

    @OriginalMember(owner = "client!da", name = "D", descriptor = "()I")
    public final native int method419();

    @OriginalMember(owner = "client!da", name = "R", descriptor = "(I)V")
    public final native void method420(int arg0);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "(Lqa;Lna;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method421(class166 arg0, class35 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lt;IIIZ)V")
    public final void method422(class475 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field558.method1111().method111(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!da", name = "HA", descriptor = "()I")
    public final native int method423();

    @OriginalMember(owner = "client!da", name = "EA", descriptor = "()V")
    public final native void method119();

    @OriginalMember(owner = "client!da", name = "H", descriptor = "(III)V")
    public final native void method424(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(IILta;Lta;III)V")
    public final native void method425(int arg0, int arg1, class145 arg2, class145 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!da", name = "N", descriptor = "(IIII)V")
    public final native void method426(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!da", name = "MA", descriptor = "()I")
    public final native int method427();

    @OriginalMember(owner = "client!da", name = "m", descriptor = "()I")
    public final native int method428();

    @OriginalMember(owner = "client!da", name = "U", descriptor = "()I")
    public final native int method429();

    @OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
    public final native int method430();

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()[Luj;")
    public final class262[] method431() {
        return this.field561;
    }

    @OriginalMember(owner = "client!da", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class438.method2701(-71, this);
    }

    @OriginalMember(owner = "client!da", name = "WA", descriptor = "()I")
    public final native int method432();

    @OriginalMember(owner = "client!da", name = "P", descriptor = "()I")
    public final native int method433();

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
    public final void method434(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!da", name = "UA", descriptor = "(I)V")
    public final native void method435(int arg0);

    @OriginalMember(owner = "client!da", name = "BA", descriptor = "(SS)V")
    public final native void method436(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lju;II)V")
    public final void method437(class125 arg0, class83 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field558.method1111().method104(this, arg0, null, arg2, arg3);
            return;
        }
        class166.field2444[5] = 0;
        this.field558.method1111().method104(this, arg0, class166.field2444, arg2, arg3);
        arg1.field1200 = class166.field2444[0];
        arg1.field1203 = class166.field2444[1];
        arg1.field1199 = class166.field2444[2];
        arg1.field1202 = class166.field2444[3];
        arg1.field1198 = class166.field2444[4];
        arg1.field1201 = class166.field2444[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "(I)V")
    public final native void method438(int arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lc;Lju;I)V")
    public final void method439(class125 arg0, class83 arg1, int arg2) {
        if (arg1 == null) {
            this.field558.method1111().method107(this, arg0, null, arg2);
            return;
        }
        class166.field2444[5] = 0;
        this.field558.method1111().method107(this, arg0, class166.field2444, arg2);
        arg1.field1200 = class166.field2444[0];
        arg1.field1203 = class166.field2444[1];
        arg1.field1199 = class166.field2444[2];
        arg1.field1202 = class166.field2444[3];
        arg1.field1198 = class166.field2444[4];
        arg1.field1201 = class166.field2444[5] != 0;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method440(int arg0, int arg1, class125 arg2, boolean arg3) {
        return this.field558.method1111().method112(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "(I)V")
    public final native void method441(int arg0);

    @OriginalMember(owner = "client!da", name = "XA", descriptor = "(I[IIIIIZ)V")
    public final native void method442(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!da", name = "fa", descriptor = "(Lba;)Lba;")
    public final native class265 method443(class265 arg0);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILc;)V")
    public final void method444(int arg0, class125 arg1) {
        int var3 = arg0;
        if (this.field561 != null) {
            for (int var4 = 0; var4 < this.field561.length; var4++) {
                class262 var5 = this.field561[var4];
                var5.field4016 = class166.field2439[var3++];
                var5.field4013 = class166.field2439[var3++];
                var5.field4024 = class166.field2439[var3++];
                var5.field4015 = class166.field2439[var3++];
                var5.field4031 = class166.field2439[var3++];
                var5.field4028 = class166.field2439[var3++];
                var5.field4033 = class166.field2439[var3++];
                var5.field4034 = class166.field2439[var3++];
                var5.field4021 = class166.field2439[var3++];
            }
        }
        if (this.field559 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field559.length; var6++) {
            class471 var7 = this.field559[var6];
            class471 var8 = var7;
            if (var7.field6802 != null) {
                var8 = var7.field6802;
            }
            if (var7.field6809 == null) {
                var7.field6809 = arg1.method205();
            } else {
                var7.field6809.method214(arg1);
            }
            var8.field6803 = class166.field2439[var3++];
            var8.field6806 = class166.field2439[var3++];
            var8.field6805 = class166.field2439[var3++];
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "()Z")
    public final boolean method445() {
        return true;
    }

    @OriginalMember(owner = "client!da", name = "E", descriptor = "(I)V")
    public final native void method446(int arg0);

    @OriginalMember(owner = "client!da", name = "j", descriptor = "()V")
    public final native void method447();

    @OriginalMember(owner = "client!da", name = "M", descriptor = "(I[IIIIZI[I)V")
    public final native void method448(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lt;")
    public final class475 method449(byte arg0, int arg1, boolean arg2) {
        return this.field558.method1111().method117(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!da", name = "JA", descriptor = "(III)V")
    public final native void method450(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!da", name = "NA", descriptor = "()I")
    public final native int method451();

    @OriginalMember(owner = "client!da", name = "o", descriptor = "(Lqa;)V")
    private final native void method452(class166 arg0);

    @OriginalMember(owner = "client!da", name = "ya", descriptor = "(Lda;Lda;IZZ)V")
    public final native void method453(class44 arg0, class44 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
    public final native void method454(int arg0);

    @OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
    public final void method455() {
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "()[Ldv;")
    public final class471[] method456() {
        return this.field559;
    }

    @OriginalMember(owner = "client!da", name = "I", descriptor = "(SS)V")
    public final native void method457(short arg0, short arg1);

    @OriginalMember(owner = "client!da", name = "IA", descriptor = "()V")
    public final native void method458();

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;Lna;Ltp;IIII)V")
    public class44(class166 arg0, class35 arg1, class374 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field558 = arg0;
        this.field560 = arg1;
        this.field561 = arg2.field5592;
        this.field559 = arg2.field5558;
        int var8 = arg2.field5592 == null ? 0 : arg2.field5592.length;
        int var9 = arg2.field5558 == null ? 0 : arg2.field5558.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field561[var12].field4025;
            var11[var10++] = this.field561[var12].field4026;
            var11[var10++] = this.field561[var12].field4027;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field559[var13].field6813;
        }
        int var14 = arg2.field5580 == null ? 0 : arg2.field5580.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class290 var20 = arg2.field5580[var17];
            class296 var21 = class350.method2178(0, var20.field4365);
            var15[var16++] = var20.field4368;
            var15[var16++] = var21.field4518;
            var15[var16++] = var21.field4521;
            var15[var16++] = var21.field4515;
            var15[var16++] = var21.field4512;
            var15[var16++] = var21.field4511;
            var15[var16++] = var21.field4517 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class290 var19 = arg2.field5580[var18];
            var15[var16++] = var19.field4363;
        }
        this.method421(this.field558, this.field560, arg2.field5561, arg2.field5572, arg2.field5609, arg2.field5562, arg2.field5575, arg2.field5563, arg2.field5591, arg2.field5610, arg2.field5599, arg2.field5611, arg2.field5569, arg2.field5583, arg2.field5567, arg2.field5593, arg2.field5598, arg2.field5579, arg2.field5581, arg2.field5607, arg2.field5585, arg2.field5582, arg2.field5568, arg2.field5573, arg2.field5589, arg2.field5586, arg2.field5577, arg2.field5597, arg2.field5603, arg2.field5559, arg2.field5574, arg2.field5571, arg2.field5604, arg2.field5566, arg2.field5578, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqa;)V")
    public class44(class166 arg0) {
        this.field558 = arg0;
        this.field560 = null;
        this.method452(arg0);
    }
}
