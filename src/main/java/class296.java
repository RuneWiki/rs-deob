import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class296 extends InputStream {

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "Z")
    public static boolean field4187 = false;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Lf;")
    public static class257 field4184;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
    public static int[] field4185;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "([Ljava/lang/Object;BII[J)V")
    public static final void method1839(Object[] arg0, byte arg1, int arg2, int arg3, long[] arg4) {
        if (arg1 != 78) {
            method1841((byte) -10);
        }
        if (arg2 > arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg2; var11++) {
                if (((long) (var11 & var10) + var7) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var9;
            method1839(arg0, (byte) 78, var6 - 1, arg3, arg4);
            method1839(arg0, (byte) 78, arg2, var6 + 1, arg4);
        }
        field4190++;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)I")
    public static final int method1840(byte arg0) {
        field4186++;
        return arg0 >= -48 ? 19 : class580.field8501++;
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(B)V")
    public static void method1841(byte arg0) {
        int var1 = 35 % ((arg0 + 58) / 63);
        field4184 = null;
        field4185 = null;
    }

    @OriginalMember(owner = "client!mv", name = "read", descriptor = "()I")
    public final int read() {
        class564.method3300((byte) 103, 30000L);
        field4189++;
        return -1;
    }
}
