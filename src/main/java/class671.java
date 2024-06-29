import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class671 {

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    private int field9496;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[Llh;")
    private class205[] field9495;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field9503;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field9504;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "J")
    private long field9499;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Llh;")
    private class205 field9502;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field9494;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[I")
    public static int[] field9501;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)Llh;")
    public final class205 method3748(byte arg0) {
        field9500++;
        if (this.field9502 == null) {
            return null;
        }
        class205 var2 = this.field9495[(int) (this.field9499 & (long) (this.field9496 - 1))];
        if (arg0 < 89) {
            return null;
        }
        while (this.field9502 != var2) {
            if (this.field9502.field3444 == this.field9499) {
                class205 var3 = this.field9502;
                this.field9502 = this.field9502.field3449;
                return var3;
            }
            this.field9502 = this.field9502.field3449;
        }
        this.field9502 = null;
        return null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)Llh;")
    public final class205 method3749(int arg0, long arg1) {
        this.field9499 = arg1;
        field9504++;
        class205 var4 = this.field9495[(int) ((long) (this.field9496 - arg0) & arg1)];
        for (this.field9502 = var4.field3449; this.field9502 != var4; this.field9502 = this.field9502.field3449) {
            if (this.field9502.field3444 == arg1) {
                class205 var5 = this.field9502;
                this.field9502 = this.field9502.field3449;
                return var5;
            }
        }
        this.field9502 = null;
        return null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method3750(int arg0) {
        field9494 = null;
        if (arg0 >= -3) {
            field9494 = null;
        }
        field9501 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BJLlh;)V")
    public final void method3751(byte arg0, long arg1, class205 arg2) {
        if (arg2.field3450 != null) {
            arg2.method1507(1);
        }
        field9503++;
        class205 var5 = this.field9495[(int) (arg1 & (long) (this.field9496 - 1))];
        if (arg0 > -24) {
            this.field9499 = 0L;
        }
        arg2.field3449 = var5;
        arg2.field3450 = var5.field3450;
        arg2.field3450.field3449 = arg2;
        arg2.field3444 = arg1;
        arg2.field3449.field3450 = arg2;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIZI)V")
    public static final void method3752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field9497++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class505.field7375 - class139.field2175) * var8 / 100 + class139.field2175;
        class106.field1553 = class106.field1554 * var9 >> 8;
        int var10 = arg7 * var9 >> 8;
        int var11 = 16384 - arg4 & 0x3FFF;
        int var12 = 16384 - arg0 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class582.field8226[var11] * -var10 >> 14;
            var15 = class582.field8230[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class582.field8226[var12] * var15 >> 14;
            var15 = class582.field8230[var12] * var15 >> 14;
        }
        class81.field1167 = arg4;
        class497.field7212 = arg3 - var13;
        if (!arg6) {
            field9501 = null;
        }
        class40.field714 = 0;
        class329.field4857 = arg1 - var15;
        class101.field1507 = arg5 - var14;
        class608.field8587 = arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIB)I")
    public static final int method3753(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg2 & 0x3;
        field9498++;
        if (arg3 >= -122) {
            field9501 = null;
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V")
    public class671(int arg0) {
        this.field9496 = arg0;
        this.field9495 = new class205[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class205 var3 = this.field9495[var2] = new class205();
            var3.field3450 = var3;
            var3.field3449 = var3;
        }
    }
}
