import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class638 {

    @OriginalMember(owner = "client!au", name = "d", descriptor = "Lqf;")
    public static class593 field9171 = null;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!au", name = "c", descriptor = "Lkea;")
    public static class203 field9170;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([Ljava/lang/String;[SIII)V", line = 5)
    public static final void method3634(String[] arg0, short[] arg1, int arg2, int arg3, int arg4) {
        field9168++;
        if (arg4 >= -90) {
            method3636(-126, true, null);
        }
        if (arg3 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg3;
        String var7 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var7;
        short var8 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var8;
        for (int var9 = arg3; var9 < arg2; var9++) {
            if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var7)) {
                String var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                short var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg0[arg2] = arg0[var6];
        arg0[var6] = var7;
        arg1[arg2] = arg1[var6];
        arg1[var6] = var8;
        method3634(arg0, arg1, var6 - 1, arg3, -108);
        method3634(arg0, arg1, arg2, var6 + 1, -108);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V", line = 62)
    public static void method3635(int arg0) {
        if (arg0 == -1) {
            field9171 = null;
            field9170 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 73)
    public static final void method3636(int arg0, boolean arg1, String arg2) {
        class407.method2579(1549, arg1, -1, arg2, -1);
        if (arg0 > -14) {
            method3634(null, null, -121, 100, 38);
        }
        field9169++;
    }
}
