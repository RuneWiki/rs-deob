import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class422 {

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field5730 = 0;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "Lsl;")
    public static class292 field5735;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V", line = 10)
    public static void method2498(int arg0) {
        if (arg0 != -27473) {
            field5733 = -32;
        }
        field5735 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BZLjava/lang/Object;)[B", line = 23)
    public static final byte[] method2499(byte arg0, boolean arg1, Object arg2) {
        field5736++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class31.method182(var3, 109) : var3;
        } else if (arg2 instanceof class48) {
            class48 var4 = (class48) arg2;
            return var4.method341((byte) 80);
        } else if (arg0 <= 41) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([II[B[[BI[I[[BI)I", line = 58)
    public static final int method2500(int[] arg0, int arg1, byte[] arg2, byte[][] arg3, int arg4, int[] arg5, byte[][] arg6, int arg7) {
        field5731++;
        int var8 = arg5[arg1];
        int var9 = arg0[arg1] + var8;
        int var10 = arg5[arg7];
        int var11 = arg0[arg7] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg2[arg1] & 0xFF;
        if (var14 > (arg2[arg7] & 0xFF)) {
            var14 = arg2[arg7] & 0xFF;
        }
        byte[] var15 = arg3[arg1];
        byte[] var16 = arg6[arg7];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        if (arg4 != -260842484) {
            field5730 = 41;
        }
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIB)V", line = 114)
    public static final void method2501(int arg0, int arg1, byte arg2) {
        if (class181.field2495 != arg0) {
            class389.field5375 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class389.field5375[var3] = (var3 << 12) / arg0;
            }
            class459.field6226 = arg0 - 1;
            class181.field2495 = arg0;
            class52.field699 = arg0 * 32;
        }
        field5732++;
        int var4 = -8 / ((arg2 + 39) / 43);
        if (class27.field359 == arg1) {
            return;
        }
        if (class181.field2495 == arg1) {
            class95.field1400 = class389.field5375;
        } else {
            class95.field1400 = new int[arg1];
            for (int var5 = 0; var5 < arg1; var5++) {
                class95.field1400[var5] = (var5 << 12) / arg1;
            }
        }
        class266.field3509 = arg1 - 1;
        class27.field359 = arg1;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V", line = 171)
    public static final void method2502(int arg0) {
        class413.field5649 = null;
        if (arg0 != 255) {
            return;
        }
        class274.field3629 = null;
        class99.field1442 = null;
        class177.field2405 = null;
        class284.field3828 = null;
        class62.field823 = null;
        class444.field6040 = null;
        class490.field6832 = null;
        field5734++;
        class208.field2816 = null;
        class482.field6654 = null;
        class409.field5610 = null;
        class40.field575 = null;
        class471.field6498 = null;
        class93.field1366 = null;
        class87.field1218 = null;
        class103.field1474 = null;
        class36.field549 = null;
        class191.field2597 = null;
    }
}
