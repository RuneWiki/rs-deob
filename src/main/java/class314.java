import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class314 extends class521 implements class439 {

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "La;")
    private class328 field4349;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lc;")
    private class619 field4350;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "[Lkca;")
    public class601[] field4352;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "[Lfi;")
    public class55[] field4351;

    @OriginalMember(owner = "client!ma", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ma", name = "U", descriptor = "()I")
    public final native int method1597();

    @OriginalMember(owner = "client!ma", name = "MA", descriptor = "()V")
    public final native void method1560();

    @OriginalMember(owner = "client!ma", name = "OA", descriptor = "(I)V")
    public final native void method1567(int arg0);

    @OriginalMember(owner = "client!ma", name = "EA", descriptor = "(Lk;)Lk;")
    public final native class88 method1581(class88 arg0);

    @OriginalMember(owner = "client!ma", name = "wa", descriptor = "()I")
    public final native int method1561();

    @OriginalMember(owner = "client!ma", name = "ba", descriptor = "()I")
    public final native int method1601();

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "()Z")
    public final boolean method1593() {
        return true;
    }

    @OriginalMember(owner = "client!ma", name = "ca", descriptor = "(III)V")
    public final native void method1602(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "pa", descriptor = "(SS)V")
    public final native void method1587(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "L", descriptor = "(SS)V")
    public final native void method1586(short arg0, short arg1);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILm;Z)Z")
    public final boolean method1598(int arg0, int arg1, class105 arg2, boolean arg3) {
        return this.field4349.method2031().method3120(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ma", name = "V", descriptor = "(III)V")
    public final native void method1566(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ma", name = "X", descriptor = "()V")
    public final native void method1556();

    @OriginalMember(owner = "client!ma", name = "WA", descriptor = "(Lma;Lma;IZZ)V")
    public final native void method1970(class314 arg0, class314 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!ma", name = "XA", descriptor = "(La;Lc;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1971(class328 arg0, class619 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "(I)V")
    public final native void method1580(int arg0);

    @OriginalMember(owner = "client!ma", name = "ea", descriptor = "(I[IIIIIZ)V")
    public final native void method1559(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ma", name = "NA", descriptor = "(Z)V")
    public final native void method503(boolean arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lr;IIIZ)V")
    public final void method1573(class521 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4349.method2031().method3126(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ma", name = "TA", descriptor = "()I")
    public final native int method1579();

    @OriginalMember(owner = "client!ma", name = "sa", descriptor = "()Z")
    public final native boolean method1589();

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "()I")
    public final native int method1592();

    @OriginalMember(owner = "client!ma", name = "M", descriptor = "()I")
    public final native int method1557();

    @OriginalMember(owner = "client!ma", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class243.method1506(this, 0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "(I)V")
    public final native void method1577(int arg0);

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "()[Lkca;")
    public final class601[] method1600() {
        return this.field4352;
    }

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "(I)V")
    public final native void method1569(int arg0);

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
    public final native void method1594(int arg0);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public final native void method1574(int arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIZ)Lr;")
    public final class521 method1607(byte arg0, int arg1, boolean arg2) {
        return this.field4349.method2031().method3134(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ma", name = "va", descriptor = "()I")
    public final native int method1563();

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "()[Lfi;")
    public final class55[] method1584() {
        return this.field4351;
    }

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "(IIII)V")
    public final native void method1582(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ma", name = "BA", descriptor = "(I[IIIIZI[I)V")
    public final native void method1570(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ma", name = "ga", descriptor = "()I")
    public final native int method1585();

    @OriginalMember(owner = "client!ma", name = "RA", descriptor = "(IILsa;Lsa;III)V")
    public final native void method1606(int arg0, int arg1, class544 arg2, class544 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)V")
    public final native void method1583(int arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
    public final void method1578(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILm;)V")
    public final void method1972(int arg0, class105 arg1) {
        int var3 = arg0;
        if (this.field4352 != null) {
            for (int var4 = 0; var4 < this.field4352.length; var4++) {
                class601 var5 = this.field4352[var4];
                var5.field8683 = class328.field4509[var3++];
                var5.field8696 = class328.field4509[var3++];
                var5.field8689 = class328.field4509[var3++];
                var5.field8698 = class328.field4509[var3++];
                var5.field8694 = class328.field4509[var3++];
                var5.field8699 = class328.field4509[var3++];
                var5.field8685 = class328.field4509[var3++];
                var5.field8691 = class328.field4509[var3++];
                var5.field8686 = class328.field4509[var3++];
            }
        }
        if (this.field4351 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field4351.length; var6++) {
            class55 var7 = this.field4351[var6];
            class55 var8 = var7;
            if (var7.field734 != null) {
                var8 = var7.field734;
            }
            if (var7.field741 == null) {
                var7.field741 = arg1.method357();
            } else {
                var7.field741.method362(arg1);
            }
            var8.field730 = class328.field4509[var3++];
            var8.field735 = class328.field4509[var3++];
            var8.field729 = class328.field4509[var3++];
        }
    }

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "(La;)V")
    private final native void method1973(class328 arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Leca;I)V")
    public final void method1595(class105 arg0, class378 arg1, int arg2) {
        if (arg1 == null) {
            this.field4349.method2031().method3119(this, arg0, null, arg2);
            return;
        }
        class328.field4511[5] = 0;
        this.field4349.method2031().method3119(this, arg0, class328.field4511, arg2);
        arg1.field5290 = class328.field4511[0];
        arg1.field5291 = class328.field4511[1];
        arg1.field5292 = class328.field4511[2];
        arg1.field5293 = class328.field4511[3];
        arg1.field5289 = class328.field4511[4];
        arg1.field5294 = class328.field4511[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
    public final void method1588() {
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lm;Leca;II)V")
    public final void method1562(class105 arg0, class378 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field4349.method2031().method3135(this, arg0, null, arg2, arg3);
            return;
        }
        class328.field4511[5] = 0;
        this.field4349.method2031().method3135(this, arg0, class328.field4511, arg2, arg3);
        arg1.field5290 = class328.field4511[0];
        arg1.field5291 = class328.field4511[1];
        arg1.field5292 = class328.field4511[2];
        arg1.field5293 = class328.field4511[3];
        arg1.field5289 = class328.field4511[4];
        arg1.field5294 = class328.field4511[5] != 0;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;Lc;Lfp;IIII)V")
    public class314(class328 arg0, class619 arg1, class528 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4349 = arg0;
        this.field4350 = arg1;
        this.field4352 = arg2.field7338;
        this.field4351 = arg2.field7337;
        int var8 = arg2.field7338 == null ? 0 : arg2.field7338.length;
        int var9 = arg2.field7337 == null ? 0 : arg2.field7337.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field4352[var12].field8688;
            var11[var10++] = this.field4352[var12].field8687;
            var11[var10++] = this.field4352[var12].field8695;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field4351[var13].field733;
        }
        int var14 = arg2.field7359 == null ? 0 : arg2.field7359.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class111 var20 = arg2.field7359[var17];
            class85 var21 = class179.method1101(9, var20.field1442);
            var15[var16++] = var20.field1439;
            var15[var16++] = var21.field1144;
            var15[var16++] = var21.field1150;
            var15[var16++] = var21.field1149;
            var15[var16++] = var21.field1145;
            var15[var16++] = var21.field1153;
            var15[var16++] = var21.field1146 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class111 var19 = arg2.field7359[var18];
            var15[var16++] = var19.field1434;
        }
        this.method1971(this.field4349, this.field4350, arg2.field7389, arg2.field7355, arg2.field7352, arg2.field7368, arg2.field7376, arg2.field7346, arg2.field7365, arg2.field7386, arg2.field7372, arg2.field7364, arg2.field7357, arg2.field7379, arg2.field7369, arg2.field7341, arg2.field7344, arg2.field7349, arg2.field7375, arg2.field7340, arg2.field7358, arg2.field7363, arg2.field7339, arg2.field7350, arg2.field7348, arg2.field7374, arg2.field7370, arg2.field7377, arg2.field7384, arg2.field7347, arg2.field7342, arg2.field7343, arg2.field7362, arg2.field7387, arg2.field7366, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!ma", name = "Q", descriptor = "()I")
    public final native int method1565();

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(La;)V")
    public class314(class328 arg0) {
        this.field4349 = arg0;
        this.field4350 = null;
        this.method1973(arg0);
    }

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "()I")
    public final native int method1590();
}
