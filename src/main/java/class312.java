import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class312 extends class519 implements class438 {

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "La;")
    private class326 field4559;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Lc;")
    private class618 field4561;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "[Lon;")
    public class595[] field4560;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[Ltf;")
    public class643[] field4562;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()V", line = 2)
    public final void method1357() {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lpaa;I)V", line = 10)
    public final void method1379(class105 arg0, class315 arg1, int arg2) {
        if (arg1 == null) {
            this.field4559.method2024().method3131(this, arg0, null, arg2);
            return;
        }
        class326.field4698[5] = 0;
        this.field4559.method2024().method3131(this, arg0, class326.field4698, arg2);
        arg1.field4597 = class326.field4698[0];
        arg1.field4600 = class326.field4698[1];
        arg1.field4599 = class326.field4698[2];
        arg1.field4598 = class326.field4698[3];
        arg1.field4596 = class326.field4698[4];
        arg1.field4595 = class326.field4698[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()Z", line = 29)
    public final boolean method1388() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILm;Z)Z", line = 32)
    public final boolean method1399(int arg0, int arg1, class105 arg2, boolean arg3) {
        return this.field4559.method2024().method3130(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILm;)V", line = 40)
    public final void method1936(int arg0, class105 arg1) {
        int var3 = arg0;
        if (this.field4560 != null) {
            for (int var4 = 0; var4 < this.field4560.length; var4++) {
                class595 var5 = this.field4560[var4];
                var5.field8460 = class326.field4689[var3++];
                var5.field8475 = class326.field4689[var3++];
                var5.field8470 = class326.field4689[var3++];
                var5.field8478 = class326.field4689[var3++];
                var5.field8479 = class326.field4689[var3++];
                var5.field8461 = class326.field4689[var3++];
                var5.field8477 = class326.field4689[var3++];
                var5.field8472 = class326.field4689[var3++];
                var5.field8462 = class326.field4689[var3++];
            }
        }
        if (this.field4562 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4562.length; var6++) {
            class643 var7 = this.field4562[var6];
            class643 var8 = var7;
            if (var7.field9350 != null) {
                var8 = var7.field9350;
            }
            if (var7.field9344 == null) {
                var7.field9344 = arg1.method879();
            } else {
                var7.field9344.method878(arg1);
            }
            var8.field9353 = class326.field4689[var3++];
            var8.field9345 = class326.field4689[var3++];
            var8.field9347 = class326.field4689[var3++];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lr;IIIZ)V", line = 103)
    public final void method1363(class519 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4559.method2024().method3119(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()[Lon;", line = 106)
    public final class595[] method1375() {
        return this.field4560;
    }

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V", line = 109)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class124.method989(-95, this);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Lpaa;II)V", line = 114)
    public final void method1374(class105 arg0, class315 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field4559.method2024().method3129(this, arg0, null, arg2, arg3);
            return;
        }
        class326.field4698[5] = 0;
        this.field4559.method2024().method3129(this, arg0, class326.field4698, arg2, arg3);
        arg1.field4597 = class326.field4698[0];
        arg1.field4600 = class326.field4698[1];
        arg1.field4599 = class326.field4698[2];
        arg1.field4598 = class326.field4698[3];
        arg1.field4596 = class326.field4698[4];
        arg1.field4595 = class326.field4698[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()[Ltf;", line = 135)
    public final class643[] method1372() {
        return this.field4562;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lr;", line = 145)
    public final class519 method765(byte arg0, int arg1, boolean arg2) {
        return this.field4559.method2024().method3123(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V", line = 152)
    public final void method1381(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;Lc;Lld;IIII)V", line = 160)
    public class312(class326 arg0, class618 arg1, class560 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4559 = arg0;
        this.field4561 = arg1;
        this.field4560 = arg2.field7950;
        this.field4562 = arg2.field7937;
        int var8 = arg2.field7950 == null ? 0 : arg2.field7950.length;
        int var9 = arg2.field7937 == null ? 0 : arg2.field7937.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field4560[var12].field8471;
            var11[var10++] = this.field4560[var12].field8465;
            var11[var10++] = this.field4560[var12].field8481;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field4562[var13].field9355;
        }
        int var14 = arg2.field7949 == null ? 0 : arg2.field7949.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class540 var20 = arg2.field7949[var17];
            class352 var21 = class573.method3279(var20.field7522, (byte) 118);
            var15[var16++] = var20.field7523;
            var15[var16++] = var21.field5022;
            var15[var16++] = var21.field5026;
            var15[var16++] = var21.field5021;
            var15[var16++] = var21.field5014;
            var15[var16++] = var21.field5024;
            var15[var16++] = var21.field5023 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class540 var19 = arg2.field7949[var18];
            var15[var16++] = var19.field7520;
        }
        this.method1938(this.field4559, this.field4561, arg2.field7938, arg2.field7942, arg2.field7955, arg2.field7944, arg2.field7980, arg2.field7936, arg2.field7961, arg2.field7951, arg2.field7959, arg2.field7940, arg2.field7941, arg2.field7963, arg2.field7939, arg2.field7974, arg2.field7954, arg2.field7933, arg2.field7962, arg2.field7957, arg2.field7970, arg2.field7964, arg2.field7971, arg2.field7932, arg2.field7947, arg2.field7945, arg2.field7969, arg2.field7968, arg2.field7952, arg2.field7978, arg2.field7953, arg2.field7956, arg2.field7975, arg2.field7972, arg2.field7958, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;)V", line = 231)
    public class312(class326 arg0) {
        this.field4559 = arg0;
        this.field4561 = null;
        this.method1939(arg0);
    }

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
    public final native int method1386();

    @OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
    public final native void method1354(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
    public final native void method1367(int arg0);

    @OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public final native void method1398(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
    public final native void method810(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public final native void method1395(int arg0, int arg1, class542 arg2, class542 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
    public final native void method1368(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
    public final native void method1358();

    @OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
    public final native int method1390();

    @OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
    public final native int method1394();

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
    public final native void method1405(int arg0);

    @OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
    public final native int method1373();

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
    public final native boolean method1404();

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
    public final native void method1407(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lma;Lma;IZZ)V")
    public final native void method1937(class312 arg0, class312 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
    public final native void method1391(int arg0);

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
    public final native void method1349(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
    public final native void method1387(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public final native void method1400(int arg0);

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
    public final native int method1378();

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    public final native void method1366(int arg0);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
    public final native int method1382();

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
    public final native int method1406();

    @OriginalMember(owner = "client!ma", name = "XA", descriptor = "(La;Lc;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1938(class326 arg0, class618 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
    public final native void method1351();

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
    public final native void method1383(int arg0);

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
    public final native int method1392();

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
    public final native int method1362();

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
    public final native void method1401(int arg0);

    @OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
    public final native int method1376();

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
    public final native void method1402(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(La;)V")
    private final native void method1939(class326 arg0);

    @OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lk;)Lk;")
    public final native class88 method1403(class88 arg0);
}
