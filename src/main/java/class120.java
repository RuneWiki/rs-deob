import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class120 {

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
    public static int field1573 = 0;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "Lufa;")
    public static class680 field1576;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "[I")
    public static int[] field1575;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
    public static final void method781(File arg0, String arg1, int arg2) {
        class6.field45.put(arg1, arg0);
        if (arg2 == -320) {
            field1574++;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
    public static void method782(int arg0) {
        field1575 = null;
        field1576 = null;
        if (arg0 > -110) {
            method782(-121);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B[I[III)V")
    public static final void method783(byte arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field1572++;
        if (arg0 > -100 || arg4 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var7;
        int var8 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg3; var10 < arg4; var10++) {
            if (arg2[var10] < ((var9 & var10) + var7)) {
                int var11 = arg2[var10];
                arg2[var10] = arg2[var6];
                arg2[var6] = var11;
                int var12 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6++] = var12;
            }
        }
        arg2[arg4] = arg2[var6];
        arg2[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var8;
        method783((byte) -109, arg1, arg2, arg3, var6 - 1);
        method783((byte) -125, arg1, arg2, var6 + 1, arg4);
    }
}
