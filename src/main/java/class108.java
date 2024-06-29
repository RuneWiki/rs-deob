import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class108 {

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "Ltq;")
    private class536 field1463 = new class536(64);

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "Lwm;")
    private class30 field1462;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public int field1461;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1465 = 0;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "Low;")
    public static class780 field1466;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "Low;")
    public static class780 field1468 = field1466 = new class780(false);

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1466 = null;
        if (arg0 > -46) {
            field1465 = -32;
        }
        field1468 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I[F[FIFIIIFIZI)V")
    public static final void method641(int arg0, float[] arg1, float[] arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, boolean arg10, int arg11) {
        field1467++;
        int var12 = arg11 - arg6;
        int var13 = arg3 - arg9;
        int var14 = arg7 - arg5;
        float var15 = arg1[2] * (float) var13 + arg1[0] * (float) var14 + arg1[1] * (float) var12;
        float var16 = arg1[5] * (float) var13 + arg1[4] * (float) var12 + arg1[3] * (float) var14;
        float var17 = arg1[8] * (float) var13 + arg1[7] * (float) var12 + arg1[6] * (float) var14;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg4 != 1.0F) {
            var18 = arg4 * var18;
        }
        float var19 = var16 + arg8 + 0.5F;
        if (arg0 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg0 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg0 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        arg2[1] = var19;
        if (arg10) {
            field1468 = null;
        }
        arg2[0] = var18;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class108(class473 arg0, int arg1, class30 arg2) {
        this.field1462 = arg2;
        this.field1461 = this.field1462.method138(0, 19);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Lll;")
    public final class50 method642(int arg0, int arg1) {
        field1464++;
        class536 var3 = this.field1463;
        class50 var4;
        synchronized (this.field1463) {
            var4 = (class50) this.field1463.method2931((long) arg0, (byte) -98);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field1462;
        byte[] var6;
        synchronized (this.field1462) {
            var6 = this.field1462.method139(19, (byte) -94, arg0);
        }
        class50 var7 = new class50();
        if (var6 != null) {
            var7.method325(new class234(var6), (byte) 122);
        }
        int var8 = 112 / ((37 - arg1) / 46);
        class536 var9 = this.field1463;
        synchronized (this.field1463) {
            this.field1463.method2918((long) arg0, var7, 91);
            return var7;
        }
    }
}
