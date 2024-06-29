import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public abstract class class364 {

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "[I")
    public static int[] field4807 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "F")
    public static float field4811;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "Ljava/lang/String;")
    public String field4806;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "[Lf;")
    public static class532[] field4808;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V", line = 6)
    public static final void method2122(byte arg0) {
        field4812++;
        if (!class38.field507) {
            return;
        }
        class423 var1 = class546.method3064(-120, class351.field4679, class369.field4847);
        if (var1 != null && var1.field5635 != null) {
            class274 var2 = new class274();
            var2.field3644 = var1;
            var2.field3639 = var1.field5635;
            class656.method3743(var2);
        }
        class689.field9739 = -1;
        class38.field507 = false;
        if (arg0 == 3) {
            class390.field5225 = -1;
            if (var1 != null) {
                class552.method3091(var1, 12618);
            }
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)Lpfa;", line = 42)
    public static final class279 method2123(int arg0, int arg1) {
        if (arg1 != -14709) {
            method2126(null, -115, 125, -127, null);
        }
        field4805++;
        return arg0 >= 0 && arg0 < 100 ? class292.field3858[arg0] : null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 60)
    public static void method2124(int arg0) {
        field4808 = null;
        field4807 = null;
        if (arg0 != 1) {
            method2126(null, 97, 80, 72, null);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(B)Ljava/net/Socket;", line = 71)
    public final Socket method2125(byte arg0) throws IOException {
        if (arg0 >= -50) {
            return null;
        } else {
            field4810++;
            return new Socket(this.field4806, this.field4814);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "([Ljava/lang/Object;III[J)V", line = 87)
    public static final void method2126(Object[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        int var5 = -63 % ((-arg2 - 63) / 60);
        if (arg3 < arg1) {
            int var6 = (arg1 + arg3) / 2;
            int var7 = arg3;
            long var8 = arg4[var6];
            arg4[var6] = arg4[arg1];
            arg4[arg1] = var8;
            Object var10 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var10;
            int var11 = var8 == Long.MAX_VALUE ? 0 : 1;
            for (int var12 = arg3; var12 < arg1; var12++) {
                if (arg4[var12] < ((long) (var12 & var11) + var8)) {
                    long var13 = arg4[var12];
                    arg4[var12] = arg4[var7];
                    arg4[var7] = var13;
                    Object var15 = arg0[var12];
                    arg0[var12] = arg0[var7];
                    arg0[var7++] = var15;
                }
            }
            arg4[arg1] = arg4[var7];
            arg4[var7] = var8;
            arg0[arg1] = arg0[var7];
            arg0[var7] = var10;
            method2126(arg0, var7 - 1, 101, arg3, arg4);
            method2126(arg0, arg1, -124, var7 + 1, arg4);
        }
        field4813++;
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1662(int arg0) throws IOException;
}
