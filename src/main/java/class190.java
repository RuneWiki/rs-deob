import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class190 {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "[I")
    private int[] field3439;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Lcc;")
    private static class209 field3446 = class95.method669(110, "Checking for updates )2 ");

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Lcc;")
    private static class209 field3447 = class95.method669(99, "Started 3d Library");

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Lcc;")
    public static class209 field3437 = field3447;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field3443 = -1;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Lcc;")
    private static class209 field3441 = class95.method669(90, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Lcc;")
    public static class209 field3450 = class95.method669(122, "rot:");

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Lcc;")
    public static class209 field3436 = field3446;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Lcc;")
    public static class209 field3449 = field3441;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Lcc;")
    public static class209 field3451 = class95.method669(107, "::qa_op_test");

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Lha;")
    public static class30 field3448;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "[Lij;")
    public static class194[] field3438;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class53 var7 = new class53();
        var7.field1059 = arg1 / 128;
        var7.field1051 = arg2 / 128;
        var7.field1037 = arg3 / 128;
        var7.field1050 = arg4 / 128;
        var7.field1057 = arg0;
        var7.field1058 = arg1;
        var7.field1052 = arg2;
        var7.field1042 = arg3;
        var7.field1038 = arg4;
        var7.field1048 = arg5;
        var7.field1036 = arg6;
        class124.field2420[class117.field2358++] = var7;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIBIILga;)V")
    public static final void method1307(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class170 arg6) {
        int var7 = 117 / ((-arg3 - 35) / 32);
        field3445++;
        long var8 = 0L;
        boolean var10 = false;
        if (arg4 == 0) {
            var8 = class227.method1598(arg0, arg5, arg1);
        } else if (arg4 == 1) {
            var8 = class118.method840(arg0, arg5, arg1);
        } else if (arg4 == 2) {
            var8 = class278.method1882(arg0, arg5, arg1);
        } else if (arg4 == 3) {
            var8 = class275.method1870(arg0, arg5, arg1);
        }
        int var11 = (int) var8 >> 14 & 0x1F;
        boolean var12 = true;
        int var13 = Integer.MAX_VALUE & (int) (var8 >>> 32);
        class218 var14 = class245.method1711(27093, var13);
        boolean var15 = false;
        if (var14.method1527((byte) 43)) {
            client.method1082(128, arg1, arg0, arg5, var14);
        }
        int var16 = ((int) var8 & 0x3480D4) >> 20;
        if (var8 == 0L) {
            return;
        }
        if (arg4 == 0) {
            class38.method286(arg0, arg5, arg1);
            if (var14.field3926 != 0) {
                arg6.method1172(var16, -1, arg1, arg5, var11, var14.field3949);
                return;
            }
        } else if (arg4 == 1) {
            class39.method293(arg0, arg5, arg1);
        } else if (arg4 == 2) {
            class45.method340(arg0, arg5, arg1);
            if (var14.field3926 != 0 && (arg5 + var14.field3916) < 104 && (arg1 + var14.field3916) < 104 && var14.field3912 + arg5 < 104 && (var14.field3912 + arg1) < 104) {
                arg6.method1169(arg5, var14.field3916, var14.field3949, arg1, 11798, var14.field3912, var16);
                return;
            }
            return;
        } else if (arg4 == 3) {
            class219.method1543(arg0, arg5, arg1);
            if (var14.field3926 == 1) {
                arg6.method1177(-1, arg5, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
    public static final void method1308(int arg0, int arg1) {
        field3440++;
        class195 var2 = class178.method1229(arg1, 8, -109);
        var2.method1340(true);
        if (arg0 != 22378) {
            method1309(true);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
    public static void method1309(boolean arg0) {
        field3451 = null;
        field3441 = null;
        field3437 = null;
        field3446 = null;
        if (!arg0) {
            return;
        }
        field3436 = null;
        field3450 = null;
        field3438 = null;
        field3447 = null;
        field3449 = null;
        field3448 = null;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)I")
    public final int method1310(int arg0, int arg1) {
        if (arg0 != 0) {
            field3437 = null;
        }
        field3442++;
        int var3 = (this.field3439.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field3439[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field3439[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "([I)V")
    public class190(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field3439 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field3439[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field3439[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field3439[var5 + var5] = arg0[var4];
            this.field3439[var5 + var5 + 1] = var4++;
        }
    }
}
