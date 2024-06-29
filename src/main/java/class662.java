import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class662 {

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "([BI)V")
    public static final void method3744(byte[] arg0, int arg1) {
        field9254++;
        class611 var2 = new class611(arg0);
        if (arg1 != -65536) {
            method3745(null, null, (byte) -37);
        }
        while (true) {
            while (true) {
                int var3 = var2.method3428((byte) 70);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class346.field4614 = new int[6];
                    var4[0] = var2.method3402((byte) 127);
                    var4[1] = var2.method3402((byte) 127);
                    var4[2] = var2.method3402((byte) 127);
                    var4[3] = var2.method3402((byte) 127);
                    var4[4] = var2.method3402((byte) 127);
                    var4[5] = var2.method3402((byte) 127);
                } else if (var3 == 4) {
                    int var5 = var2.method3428((byte) 104);
                    class99.field1311 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class99.field1311[var6] = var2.method3402((byte) 127);
                        if (class99.field1311[var6] == 65535) {
                            class99.field1311[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method3428((byte) 65);
                    class614.field8607 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class614.field8607[var8] = var2.method3402((byte) 127);
                        if (class614.field8607[var8] == 65535) {
                            class614.field8607[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method3745(String arg0, String arg1, byte arg2) {
        if (arg2 != -68) {
            method3745(null, null, (byte) 102);
        }
        class381.field5302 = -1;
        field9252++;
        class8.field55 = 1;
        class163.method961(false, arg1, 72, arg0);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BII)Z")
    public static final boolean method3746(byte arg0, int arg1, int arg2) {
        field9253++;
        if (arg0 <= 19) {
            method3747(-88, -7, -49, -121, -81, 87, 14, null, -2, 46, null, 113, -42);
        }
        return class595.method3294(arg1, arg2, 16) & class633.method3555(arg1, arg2, 2048);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIIILha;II[[[BII)V")
    public static final void method3747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class60 arg7, int arg8, int arg9, byte[][][] arg10, int arg11, int arg12) {
        field9255++;
        if (arg5 == 0 || arg2 == 0) {
            return;
        }
        if (arg5 == 9) {
            arg0 = arg0 + 1 & 0x3;
            arg5 = 1;
        }
        if (arg5 == arg12) {
            arg0 = arg0 + 3 & 0x3;
            arg5 = 1;
        }
        if (arg5 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg5 = 8;
        }
        arg7.method444(arg3, arg8, arg9, arg4, arg1, arg6, arg10[arg5 - 1][arg0], arg2, arg11);
    }
}
