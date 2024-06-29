import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class300 extends class107 implements class128 {

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Lda;")
    private class396 field3918;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "La;")
    private class613 field3916;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[Lgi;")
    public class574[] field3915;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "[Lrea;")
    public class32[] field3917;

    @OriginalMember(owner = "client!j", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()[Lrea;", line = 3)
    public final class32[] method795() {
        return this.field3917;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;)V", line = 7)
    public final void method819(class151 arg0) {
        this.method1768(class396.field5030, arg0);
        int var2 = 0;
        if (this.field3915 != null) {
            for (int var3 = 0; var3 < this.field3915.length; var3++) {
                class574 var4 = this.field3915[var3];
                var4.field7470 = class396.field5030[var2++];
                var4.field7472 = class396.field5030[var2++];
                var4.field7466 = class396.field5030[var2++];
                var4.field7483 = class396.field5030[var2++];
                var4.field7480 = class396.field5030[var2++];
                var4.field7475 = class396.field5030[var2++];
                var4.field7467 = class396.field5030[var2++];
                var4.field7471 = class396.field5030[var2++];
                var4.field7468 = class396.field5030[var2++];
            }
        }
        if (this.field3917 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3917.length; var5++) {
            class32 var6 = this.field3917[var5];
            class32 var7 = var6;
            if (var6.field478 != null) {
                var7 = var6.field478;
            }
            if (var6.field472 == null) {
                var6.field472 = arg0.method131();
            } else {
                var6.field472.method133(arg0);
            }
            var7.field470 = class396.field5030[var2++];
            var7.field475 = class396.field5030[var2++];
            var7.field479 = class396.field5030[var2++];
        }
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V", line = 67)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class29.method241(-127, this);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILq;Z)Z", line = 72)
    public final boolean method832(int arg0, int arg1, class151 arg2, boolean arg3) {
        return this.field3918.method2251().method3298(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lht;I)V", line = 82)
    public final void method827(class151 arg0, class108 arg1, int arg2) {
        if (arg1 == null) {
            this.field3918.method2251().method3292(this, arg0, null, arg2);
            return;
        }
        class396.field5035[5] = 0;
        this.field3918.method2251().method3292(this, arg0, class396.field5035, arg2);
        arg1.field1405 = class396.field5035[0];
        arg1.field1406 = class396.field5035[1];
        arg1.field1407 = class396.field5035[2];
        arg1.field1403 = class396.field5035[3];
        arg1.field1402 = class396.field5035[4];
        arg1.field1404 = class396.field5035[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIZ)Lba;", line = 98)
    public final class107 method479(byte arg0, int arg1, boolean arg2) {
        return this.field3918.method2251().method3290(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lba;IIIZ)V", line = 106)
    public final void method831(class107 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3918.method2251().method3297(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()Z", line = 112)
    public final boolean method794() {
        return true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([ILq;)V", line = 116)
    private final void method1768(int[] arg0, class151 arg1) {
        this.field3918.method2251().method3291(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()V", line = 119)
    public final void method818() {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V", line = 134)
    public final void method835(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;La;Lfca;IIII)V", line = 138)
    public class300(class396 arg0, class613 arg1, class645 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3918 = arg0;
        this.field3916 = arg1;
        this.field3915 = arg2.field8943;
        this.field3917 = arg2.field8982;
        int var8 = arg2.field8943 == null ? 0 : arg2.field8943.length;
        int var9 = arg2.field8982 == null ? 0 : arg2.field8982.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field3915[var12].field7464;
            var11[var10++] = this.field3915[var12].field7474;
            var11[var10++] = this.field3915[var12].field7479;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field3917[var13].field482;
        }
        int var14 = arg2.field8960 == null ? 0 : arg2.field8960.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class65 var20 = arg2.field8960[var17];
            class313 var21 = class156.method1120((byte) -63, var20.field889);
            var15[var16++] = var20.field888;
            var15[var16++] = var21.field4057;
            var15[var16++] = var21.field4065;
            var15[var16++] = var21.field4059;
            var15[var16++] = var21.field4060;
            var15[var16++] = var21.field4063;
            var15[var16++] = var21.field4062 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class65 var19 = arg2.field8960[var18];
            var15[var16++] = var19.field886;
        }
        this.method1766(this.field3918, this.field3916, arg2.field8938, arg2.field8941, arg2.field8983, arg2.field8968, arg2.field8972, arg2.field8944, arg2.field8958, arg2.field8952, arg2.field8939, arg2.field8965, arg2.field8955, arg2.field8985, arg2.field8949, arg2.field8974, arg2.field8970, arg2.field8978, arg2.field8961, arg2.field8993, arg2.field8946, arg2.field8976, arg2.field8966, arg2.field8977, arg2.field8957, arg2.field8992, arg2.field8971, arg2.field8963, arg2.field8948, arg2.field8979, arg2.field8984, arg2.field8980, arg2.field8969, arg2.field8953, arg2.field8951, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lq;Lht;II)V", line = 211)
    public final void method792(class151 arg0, class108 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field3918.method2251().method3284(this, arg0, null, arg2, arg3);
            return;
        }
        class396.field5035[5] = 0;
        this.field3918.method2251().method3284(this, arg0, class396.field5035, arg2, arg3);
        arg1.field1405 = class396.field5035[0];
        arg1.field1406 = class396.field5035[1];
        arg1.field1407 = class396.field5035[2];
        arg1.field1403 = class396.field5035[3];
        arg1.field1402 = class396.field5035[4];
        arg1.field1404 = class396.field5035[5] != 0;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()[Lgi;", line = 230)
    public final class574[] method808() {
        return this.field3915;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lda;)V", line = 233)
    public class300(class396 arg0) {
        this.field3918 = arg0;
        this.field3916 = null;
        this.method1767(arg0);
    }

    @OriginalMember(owner = "client!j", name = "ia", descriptor = "(I)V")
    public final native void method825(int arg0);

    @OriginalMember(owner = "client!j", name = "l", descriptor = "(III)V")
    public final native void method789(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "V", descriptor = "(I)V")
    public final native void method809(int arg0);

    @OriginalMember(owner = "client!j", name = "D", descriptor = "(I)V")
    public final native void method826(int arg0);

    @OriginalMember(owner = "client!j", name = "ha", descriptor = "()I")
    public final native int method820();

    @OriginalMember(owner = "client!j", name = "F", descriptor = "()I")
    public final native int method824();

    @OriginalMember(owner = "client!j", name = "za", descriptor = "(Lda;La;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1766(class396 arg0, class613 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "(I)V")
    public final native void method822(int arg0);

    @OriginalMember(owner = "client!j", name = "v", descriptor = "(I)V")
    public final native void method803(int arg0);

    @OriginalMember(owner = "client!j", name = "u", descriptor = "()I")
    public final native int method817();

    @OriginalMember(owner = "client!j", name = "E", descriptor = "(I[IIIIIZ)V")
    public final native void method828(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!j", name = "ua", descriptor = "(IIII)V")
    public final native void method798(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!j", name = "UA", descriptor = "(SS)V")
    public final native void method829(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "HA", descriptor = "(Lda;)V")
    private final native void method1767(class396 arg0);

    @OriginalMember(owner = "client!j", name = "va", descriptor = "(I)V")
    public final native void method815(int arg0);

    @OriginalMember(owner = "client!j", name = "AA", descriptor = "(I)V")
    public final native void method800(int arg0);

    @OriginalMember(owner = "client!j", name = "LA", descriptor = "()I")
    public final native int method805();

    @OriginalMember(owner = "client!j", name = "M", descriptor = "()I")
    public final native int method799();

    @OriginalMember(owner = "client!j", name = "P", descriptor = "()V")
    public final native void method797();

    @OriginalMember(owner = "client!j", name = "EA", descriptor = "()I")
    public final native int method793();

    @OriginalMember(owner = "client!j", name = "L", descriptor = "(Lj;Lj;IZZ)V")
    public final native void method1769(class300 arg0, class300 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!j", name = "da", descriptor = "(I[IIIIZI[I)V")
    public final native void method806(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!j", name = "OA", descriptor = "(IILd;Ld;III)V")
    public final native void method833(int arg0, int arg1, class88 arg2, class88 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!j", name = "K", descriptor = "()I")
    public final native int method810();

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "()Z")
    public final native boolean method802();

    @OriginalMember(owner = "client!j", name = "ka", descriptor = "(SS)V")
    public final native void method790(short arg0, short arg1);

    @OriginalMember(owner = "client!j", name = "m", descriptor = "(III)V")
    public final native void method804(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!j", name = "ZA", descriptor = "()I")
    public final native int method813();

    @OriginalMember(owner = "client!j", name = "H", descriptor = "(Z)V")
    public final native void method599(boolean arg0);

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "()V")
    public final native void method788();

    @OriginalMember(owner = "client!j", name = "DA", descriptor = "()I")
    public final native int method816();

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "(Lw;)Lw;")
    public final native class605 method821(class605 arg0);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "()I")
    public final native int method796();
}
