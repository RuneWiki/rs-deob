import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class84 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1290 = -1;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
    public static boolean field1292 = false;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1291 = "";

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB[I[Ljava/lang/Object;)V", line = 5)
    public static final void method658(int arg0, int arg1, byte arg2, int[] arg3, Object[] arg4) {
        if (arg2 != -3) {
            field1292 = true;
        }
        if (arg0 > arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg0; var10++) {
                if (arg3[var10] < var7 + (var9 & var10)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    Object var12 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method658(var6 - 1, arg1, (byte) -3, arg3, arg4);
            method658(arg0, var6 + 1, (byte) -3, arg3, arg4);
        }
        field1289++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V", line = 72)
    public static void method659(boolean arg0) {
        field1291 = null;
        if (!arg0) {
            field1290 = -123;
        }
    }
}
