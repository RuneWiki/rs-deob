import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class69 extends class120 {

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Z")
    public static boolean field1123 = false;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field1122 = -1;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field1119;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 3)
    public static void method674(int arg0) {
        if (arg0 >= 28) {
            field1119 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB[J[Ljava/lang/Object;I)V", line = 26)
    public static final void method675(int arg0, byte arg1, long[] arg2, Object[] arg3, int arg4) {
        field1121++;
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg0; var11++) {
                if ((long) (var11 & var10) + var7 > arg2[var11]) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var9;
            method675(var6 - 1, (byte) 49, arg2, arg3, arg4);
            method675(arg0, (byte) 49, arg2, arg3, var6 + 1);
        }
        if (arg1 != 49) {
            method674(68);
        }
    }
}
