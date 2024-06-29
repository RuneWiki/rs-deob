import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class82 extends IOException {

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Z")
    public static boolean field1486 = false;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Lmu;")
    public static class303 field1490 = new class303(42, -1);

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "[I")
    public static int[] field1491 = new int[8];

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II[JI[I)V")
    public static final void method781(int arg0, int arg1, long[] arg2, int arg3, int[] arg4) {
        field1489++;
        if (arg0 < arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg3; var11++) {
                if (arg2[var11] < (var7 + ((long) (var10 & var11)))) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var9;
            method781(arg0, -126, arg2, var6 - 1, arg4);
            method781(var6 + 1, -81, arg2, arg3, arg4);
        }
        if (arg1 >= -72) {
            method782(99);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method782(int arg0) {
        if (arg0 == 8) {
            field1491 = null;
            field1490 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZIZI)V")
    public static final void method783(boolean arg0, int arg1, boolean arg2, int arg3) {
        field1487++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class74.field1339 = arg1;
        class103.field1834 = arg3;
        class86.field1544 = arg0;
        if (!arg2) {
            method782(-125);
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class82(String arg0) {
        super(arg0);
    }
}
