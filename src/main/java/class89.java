import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class89 {

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!iia", name = "c", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!iia", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1205++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(III)I")
    public static final int method638(int arg0, int arg1, int arg2) {
        if (arg1 < 27) {
            return 3;
        }
        field1206++;
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(BLuca;ILha;Luaa;ILbq;II)V")
    public static final void method639(byte arg0, class513 arg1, int arg2, class60 arg3, class119 arg4, int arg5, class292 arg6, int arg7, int arg8) {
        field1207++;
        if (arg0 < 6) {
            return;
        }
        int var9 = arg8 - (arg2 / 2 + 5);
        int var10 = arg5 + 2;
        if (arg6.field3859 != 0) {
            arg3.method368(arg2 + 10, -var10 + arg5 - -(arg7 * arg4.method778()) + 1, var10, arg6.field3859, (byte) -66, var9);
        }
        if (arg6.field3872 != 0) {
            arg3.method393(true, arg7 * arg4.method778() + arg5 + 1 - var10, arg2 + 10, arg6.field3872, var9, var10);
        }
        int var11 = arg6.field3894;
        if (arg1.field6949 && arg6.field3871 != -1) {
            var11 = arg6.field3871;
        }
        for (int var12 = 0; var12 < arg7; var12++) {
            String var13 = class614.field8609[var12];
            if ((arg7 - 1) > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg4.method779(arg3, var13, arg8, arg5, var11, true);
            arg5 += arg4.method778();
        }
    }
}
