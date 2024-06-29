import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class97 extends class615 {

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "[I")
    public static int[] field1467 = new int[4096];

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field1468 = -1;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Lmga;")
    public static class666 field1470 = new class666(64);

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    public static int field1475 = 0;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    private int field1466;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    private int field1469;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 5)
    public class97() {
        this(0);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILeh;)V", line = 12)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        if (~arg1 == -1) {
            this.method750(true, arg2.method2042((byte) 53));
        }
        if (arg0 < 44) {
            this.method750(true, -36);
        }
        ++field1471;
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V", line = 41)
    public static void method748(int arg0) {
        int var1 = 86 / ((-47 - arg0) / 48);
        field1467 = null;
        field1470 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILoa;)V", line = 59)
    public static final void method749(int arg0, class651 arg1) {
        for (class485 var2 = (class485) class98.field1476.method328(0); var2 != null; var2 = (class485) class98.field1476.method331((byte) 126)) {
            if (var2.field6566) {
                var2.method2710(arg1);
            }
        }
        int var3 = -62 / ((52 - arg0) / 35);
        ++field1462;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZI)V", line = 83)
    private final void method750(boolean arg0, int arg1) {
        this.field1469 = (arg1 & 255) << 4;
        ++field1465;
        if (arg0) {
            this.field1466 = arg1 >> 12 & 4080;
            this.field1464 = arg1 >> 4 & 4080;
        }
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)Lub;", line = 96)
    public static final class20 method751(int arg0) {
        ++field1472;
        if (class567.field7508 != null && class235.field3311 != null) {
            if (arg0 != -5571) {
                method749(84, (class651) null);
            }
            for (class20 var1 = (class20) class235.field3311.method2388(21); var1 != null; var1 = (class20) class235.field3311.method2388(arg0 + 5532)) {
                class634 var2 = class567.field7498.method1487(var1.field317, (byte) 115);
                if (var2 != null && var2.field8542 && var2.method3507(class567.field7495, true)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZII)V", line = 122)
    public static final void method752(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field1473;
        class438.field6035 = arg1;
        class2.field13 = arg2;
        class690.field9728 = arg4;
        class480.field6408 = arg5;
        if (!arg3) {
            field1475 = -90;
        }
        class317.field4363 = arg0;
        if (~class2.field13 <= -101) {
            int var6 = class438.field6035 * 512 + 256;
            int var7 = class317.field4363 * 512 + 256;
            int var8 = class315.method1878(var6, 2921, class29.field476, var7) + -class690.field9728;
            int var9 = -class259.field3563 + var6;
            int var10 = var8 - class553.field7350;
            int var11 = -class643.field8632 + var7;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class510.field6806 = (int) (2607.5945876176133D * Math.atan2((double) var10, (double) var12)) & 16383;
            class331.field4539 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 16383;
            class370.field4993 = 0;
            if (class510.field6806 < 1024) {
                class510.field6806 = 1024;
            }
            if (class510.field6806 > 3072) {
                class510.field6806 = 3072;
            }
        }
        class173.field2668 = -1;
        class376.field5068 = -1;
        class140.field2254 = 2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[[I", line = 171)
    public final int[][] method223(int arg0, int arg1) {
        ++field1474;
        int[][] var3 = super.field8129.method2654(false, arg1);
        if (super.field8129.field6315) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class505.field6740; ++var7) {
                var4[var7] = this.field1466;
                var5[var7] = this.field1464;
                var6[var7] = this.field1469;
            }
        }
        if (arg0 != 2) {
            field1470 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V", line = 211)
    private class97(int arg0) {
        super(0, false);
        this.method750(true, arg0);
    }
}
