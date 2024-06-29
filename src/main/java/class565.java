import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class565 {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field8020 = 0;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lfba;")
    public static class27 field8017 = new class27(34, 3);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field8019;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BIIII[BII)V", line = 7)
    public static final void method3330(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field8016++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        if (arg3 != -1) {
            field8018 = -100;
        }
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg6[var10001] = (byte) (arg6[var10001] - arg1[arg8++]);
                int var14 = arg7++;
                arg6[var14] = (byte) (arg6[var14] - arg1[arg8++]);
                int var15 = arg7++;
                arg6[var15] = (byte) (arg6[var15] - arg1[arg8++]);
                int var16 = arg7++;
                arg6[var16] = (byte) (arg6[var16] - arg1[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg6[var10001] = (byte) (arg6[var10001] - arg1[arg8++]);
            }
            arg8 += arg0;
            arg7 += arg2;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lje;)V", line = 52)
    public static final void method3331(class421 arg0) {
        class228.field3494.method474(arg0.field5742, arg0.field5741 + (arg0.method916(true) >> 1), arg0.field5746, class268.field3901);
        arg0.field5757 = class268.field3901[0];
        arg0.field5745 = class268.field3901[1];
        arg0.field5744 = class268.field3901[2];
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 64)
    public static void method3332(byte arg0) {
        field8017 = null;
        if (arg0 != 106) {
            method3332((byte) 64);
        }
    }
}
