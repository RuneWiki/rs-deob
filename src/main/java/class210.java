import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class210 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[[S")
    public static short[][] field3348 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lqd;")
    public static class40 field3351 = class147.method1106("Bitte warten Sie)3)3)3", (byte) -126);

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lqd;")
    public static class40 field3353 = class147.method1106("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) -68);

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lhi;")
    public static class282 field3352 = new class282();

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
    public static int[] field3356;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([Lqd;B)[Lqd;", line = 17)
    public static final class40[] method1479(class40[] arg0, byte arg1) {
        if (arg1 <= 95) {
            return (class40[]) null;
        }
        field3350++;
        class40[] var2 = new class40[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class153.method1192(new class40[] { class276.method1927((byte) -83, var3), class131.field2230 }, (byte) -48);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class153.method1192(new class40[] { var2[var3], arg0[var3] }, (byte) 126);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLeg;ZBIILeg;)I", line = 79)
    public static final int method1480(boolean arg0, class291 arg1, boolean arg2, byte arg3, int arg4, int arg5, class291 arg6) {
        if (arg3 != 78) {
            method1479((class40[]) null, (byte) -39);
        }
        field3354++;
        int var7 = class50.method441(arg2, arg6, arg4, arg3 ^ 0xFFFFAFD6, arg1);
        if (var7 != 0) {
            return arg2 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class50.method441(arg0, arg6, arg5, -20584, arg1);
            return arg0 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 112)
    public static void method1481(byte arg0) {
        field3348 = (short[][]) null;
        field3351 = null;
        field3353 = null;
        if (arg0 == -20) {
            field3352 = null;
            field3356 = null;
        }
    }
}
