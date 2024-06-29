import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class16 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    private int[] field374;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lja;")
    public static class62 field376 = class30.method243(43, "<col=ff7000>");

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "Ljf;")
    public static class68 field372 = new class68(8);

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lc;")
    public static class18 field378 = new class18(64);

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Lja;")
    private static class62 field379 = class30.method243(43, "Error connecting to server)3");

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lja;")
    public static class62 field380 = field379;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Lja;")
    public static class62 field382 = class30.method243(43, "mapmarker");

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Lja;")
    private static class62 field383 = class30.method243(43, "Login");

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lja;")
    public static class62 field381 = field383;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILpd;IZI)V")
    public static final void method111(int arg0, int arg1, int arg2, class108 arg3, int arg4, boolean arg5, int arg6) {
        class43.field1011 = arg6;
        field371++;
        class15.field368 = arg3;
        class62.field1535 = arg4;
        class151.field3542 = arg1;
        class22.field518 = arg2;
        class93.field2179 = arg5;
        class90.field2143 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIB)I")
    public static final int method112(int arg0, int arg1, int arg2, byte arg3) {
        field375++;
        if ((class155.field3581[arg2][arg0][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg2 <= 0 || (class155.field3581[1][arg0][arg1] & 0x2) == 0) {
            if (arg3 <= 23) {
                method113(-47);
            }
            return arg2;
        } else {
            return arg2 - 1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method113(int arg0) {
        field380 = null;
        field376 = null;
        field378 = null;
        field379 = null;
        field382 = null;
        field381 = null;
        field383 = null;
        if (arg0 < 23) {
            method112(-32, -24, 38, (byte) 2);
        }
        field372 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)I")
    public final int method114(boolean arg0, int arg1) {
        field373++;
        int var3 = this.field374.length - 2;
        if (!arg0) {
            field378 = null;
        }
        int var4 = arg1 << 1 & var3;
        while (true) {
            int var5 = this.field374[var4];
            if (arg1 == var5) {
                return this.field374[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([I)V")
    public class16(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field374 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field374[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field374[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field374[var5 + var5] = arg0[var4];
            this.field374[var5 + var5 + 1] = var4++;
        }
    }
}
