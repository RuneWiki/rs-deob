import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class744 {

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field10348 = 0;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field10347;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z[II[II)V")
    public static final void method4144(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (!arg0) {
            return;
        }
        if (arg2 < arg4) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg2; var10 < arg4; var10++) {
                if (arg3[var10] < ((var10 & var9) + var7)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method4144(true, arg1, arg2, arg3, var6 - 1);
            method4144(arg0, arg1, var6 + 1, arg3, arg4);
        }
        field10347++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[BII)V")
    public abstract void method2843(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I[BII)I")
    public abstract int method2847(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(JJ)J")
    public static long method4145(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public abstract void method2844(int arg0);

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)Z")
    public abstract boolean method2846(byte arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public abstract void method2845(byte arg0);
}
