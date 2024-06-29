import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class497 extends class352 implements class141 {

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lda;")
    private class55 field6840;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "La;")
    private class566 field6841;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "[Lbh;")
    public class34[] field6842;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "[Lvp;")
    public class171[] field6839;

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
    public final native void method213(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;)V")
    public final void method211(class391 arg0) {
        this.method2780(class55.field775, arg0);
        int var2 = 0;
        if (this.field6842 != null) {
            for (int var3 = 0; var3 < this.field6842.length; var3++) {
                class34 var4 = this.field6842[var3];
                var4.field396 = class55.field775[var2++];
                var4.field412 = class55.field775[var2++];
                var4.field410 = class55.field775[var2++];
                var4.field397 = class55.field775[var2++];
                var4.field405 = class55.field775[var2++];
                var4.field406 = class55.field775[var2++];
                var4.field398 = class55.field775[var2++];
                var4.field400 = class55.field775[var2++];
                var4.field407 = class55.field775[var2++];
            }
        }
        if (this.field6839 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field6839.length; var5++) {
            class171 var6 = this.field6839[var5];
            class171 var7 = var6;
            if (var6.field2561 != null) {
                var7 = var6.field2561;
            }
            if (var6.field2559 == null) {
                var6.field2559 = arg0.method1295();
            } else {
                var6.field2559.method1298(arg0);
            }
            var7.field2565 = class55.field775[var2++];
            var7.field2562 = class55.field775[var2++];
            var7.field2564 = class55.field775[var2++];
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()Z")
    public final boolean method209() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
    public final native void method208(int arg0);

    @OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final native void method207(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
    public final native int method198();

    @OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
    public final native void method204(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lda;)V")
    private final native void method2777(class55 arg0);

    @OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
    public final native int method234();

    @OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
    public final native void method224(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lrc;II)V")
    public final void method199(class391 arg0, class494 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field6840.method429().method3396(this, arg0, null, arg2, arg3);
            return;
        }
        class55.field772[5] = 0;
        this.field6840.method429().method3396(this, arg0, class55.field772, arg2, arg3);
        arg1.field6810 = class55.field772[0];
        arg1.field6809 = class55.field772[1];
        arg1.field6811 = class55.field772[2];
        arg1.field6812 = class55.field772[3];
        arg1.field6807 = class55.field772[4];
        arg1.field6808 = class55.field772[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
    public final native boolean method210();

    @OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
    public final native void method233(int arg0);

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lw;)Lw;")
    public final native class271 method201(class271 arg0);

    @OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
    public final native int method196();

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
    public final native void method225(int arg0);

    @OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
    public final native int method214();

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
    public final native int method189();

    @OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
    public final native int method219();

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V")
    public final void method186(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lrc;I)V")
    public final void method205(class391 arg0, class494 arg1, int arg2) {
        if (arg1 == null) {
            this.field6840.method429().method3384(this, arg0, null, arg2);
            return;
        }
        class55.field772[5] = 0;
        this.field6840.method429().method3384(this, arg0, class55.field772, arg2);
        arg1.field6810 = class55.field772[0];
        arg1.field6809 = class55.field772[1];
        arg1.field6811 = class55.field772[2];
        arg1.field6812 = class55.field772[3];
        arg1.field6807 = class55.field772[4];
        arg1.field6808 = class55.field772[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
    public final native void method193();

    @OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
    public final native int method227();

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
    public final native void method188(int arg0);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
    public final native void method240(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
    public final native int method220();

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()V")
    public final void method228() {
    }

    @OriginalMember(owner = "client!j", name = "L", descriptor = "(Lj;Lj;IZZ)V")
    public final native void method2778(class497 arg0, class497 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()[Lbh;")
    public final class34[] method221() {
        return this.field6842;
    }

    @OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
    public final native void method217(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
    public final native void method232();

    @OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
    public final native int method229();

    @OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
    public final native void method58(boolean arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lba;IIIZ)V")
    public final void method230(class352 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6840.method429().method3390(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class373.method2177(this, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
    public final native void method216(int arg0);

    @OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
    public final native void method202(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lba;")
    public final class352 method235(byte arg0, int arg1, boolean arg2) {
        return this.field6840.method429().method3392(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "za", descriptor = "(Lda;La;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2779(class55 arg0, class566 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()[Lvp;")
    public final class171[] method206() {
        return this.field6839;
    }

    @OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final native void method187(int arg0, int arg1, class136 arg2, class136 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
    public final native void method238(int arg0);

    @OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
    public final native void method223(int arg0);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([ILq;)V")
    private final void method2780(int[] arg0, class391 arg1) {
        this.field6840.method429().method3389(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;La;Lhn;IIII)V")
    public class497(class55 arg0, class566 arg1, class661 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6840 = arg0;
        this.field6841 = arg1;
        this.field6842 = arg2.field9301;
        this.field6839 = arg2.field9292;
        int var8 = arg2.field9301 == null ? 0 : arg2.field9301.length;
        int var9 = arg2.field9292 == null ? 0 : arg2.field9292.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field6842[var12].field395;
            var11[var10++] = this.field6842[var12].field403;
            var11[var10++] = this.field6842[var12].field401;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field6839[var13].field2569;
        }
        int var14 = arg2.field9328 == null ? 0 : arg2.field9328.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class643 var20 = arg2.field9328[var17];
            class97 var21 = class538.method2965(var20.field9140, 3);
            var15[var16++] = var20.field9141;
            var15[var16++] = var21.field1330;
            var15[var16++] = var21.field1320;
            var15[var16++] = var21.field1331;
            var15[var16++] = var21.field1324;
            var15[var16++] = var21.field1323;
            var15[var16++] = var21.field1328 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class643 var19 = arg2.field9328[var18];
            var15[var16++] = var19.field9133;
        }
        this.method2779(this.field6840, this.field6841, arg2.field9291, arg2.field9318, arg2.field9280, arg2.field9299, arg2.field9329, arg2.field9300, arg2.field9287, arg2.field9285, arg2.field9286, arg2.field9297, arg2.field9333, arg2.field9294, arg2.field9322, arg2.field9317, arg2.field9312, arg2.field9281, arg2.field9316, arg2.field9303, arg2.field9330, arg2.field9331, arg2.field9302, arg2.field9283, arg2.field9305, arg2.field9308, arg2.field9293, arg2.field9307, arg2.field9282, arg2.field9314, arg2.field9327, arg2.field9324, arg2.field9320, arg2.field9319, arg2.field9311, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
    public final native int method239();

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;)V")
    public class497(class55 arg0) {
        this.field6840 = arg0;
        this.field6841 = null;
        this.method2777(arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method237(int arg0, int arg1, class391 arg2, boolean arg3) {
        return this.field6840.method429().method3395(this, arg0, arg1, arg2, arg3);
    }
}
