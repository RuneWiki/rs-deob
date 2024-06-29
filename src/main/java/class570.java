import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class570 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "[B")
    public static byte[] field7586 = null;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZILjp;)Ljava/lang/String;")
    public static final String method3191(boolean arg0, int arg1, class376 arg2) {
        field7589++;
        try {
            int var3 = arg2.method2370(-2);
            if (var3 > arg1) {
                var3 = arg1;
            }
            if (arg0) {
                field7586 = null;
            }
            byte[] var4 = new byte[var3];
            arg2.field5459 += class673.field9465.method3399(var3, 107, 0, arg2.field5459, var4, arg2.field5518);
            return class349.method2203(var4, 1958, 0, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V")
    public static final void method3192(Object[] arg0, int arg1, int arg2, long[] arg3, int arg4) {
        if (arg2 < arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg1; var11++) {
                if (((long) (var10 & var11) + var7) > arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method3192(arg0, var6 - 1, arg2, arg3, arg4);
            method3192(arg0, arg1, var6 + 1, arg3, 0);
        }
        field7585++;
        if (arg4 != 0) {
            method3191(false, 25, null);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static final void method3193(byte arg0) {
        class754.field10432.method1552(107);
        field7590++;
        if (arg0 != 39) {
            method3191(false, 31, null);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method3194(int arg0) {
        int var1 = 127 % ((48 - arg0) / 52);
        field7586 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
    public static final void method3195(byte arg0, int arg1) {
        class39.field623 = arg1;
        class397.field5830 = 2;
        if (arg0 == -38) {
            field7587++;
            class187.method1298("", class652.field9041.equals(""), 0, class652.field9041, true);
        }
    }
}
