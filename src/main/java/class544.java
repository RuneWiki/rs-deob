import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class544 {

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field7261;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)I")
    public static final int method2938(int arg0, int arg1) {
        field7261++;
        return arg1 == 766538279 ? arg0 >>> 7 : 105;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BI)V")
    public static final void method2939(byte arg0, int arg1) {
        if (arg0 < 8) {
            return;
        }
        field7262++;
        if (class126.field1583 == 1) {
            class503.field6663 = arg1;
        } else if (class126.field1583 == 2 || class126.field1583 == 3) {
            class195.field2453 = arg1;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(II[J[Ljava/lang/Object;B)V")
    public static final void method2940(int arg0, int arg1, long[] arg2, Object[] arg3, byte arg4) {
        field7260++;
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg1; var11++) {
                if ((long) (var11 & var10) + var7 > arg2[var11]) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var9;
            method2940(arg0, var6 - 1, arg2, arg3, (byte) 35);
            method2940(var6 + 1, arg1, arg2, arg3, (byte) 35);
        }
        if (arg4 != 35) {
            method2941(-38);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public static final void method2941(int arg0) {
        field7259++;
        for (int var1 = arg0; var1 < 100; var1++) {
            class413.field5168[var1] = true;
        }
    }
}
