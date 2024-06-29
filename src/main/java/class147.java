import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class147 extends OutputStream {

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "Z")
    public static boolean field2546 = false;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field2549 = -1;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "Lph;")
    public static class598 field2548 = new class598(5, 1);

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!uq", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2545++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[II[IZ)V")
    public static final void method1171(int arg0, int[] arg1, int arg2, int[] arg3, boolean arg4) {
        field2547++;
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (((var10 & var9) + var7) > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1171(arg0, arg1, var6 - 1, arg3, true);
            method1171(var6 + 1, arg1, arg2, arg3, true);
        }
        if (!arg4) {
            method1172(-77);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method1172(int arg0) {
        if (arg0 < 101) {
            method1171(-8, null, -85, null, true);
        }
        field2548 = null;
    }
}
